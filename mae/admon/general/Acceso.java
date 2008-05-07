// Clase:       Acceso
// Autor:       Eduard Roige, I+D GEYCE S.A.

package mae.admon.general;

import java.security.Principal;
import java.security.acl.*;
import sun.security.acl.*;

import java.util.*;
import java.sql.*;
import geyce.maefc.*;

import mae.admon.*;

public class Acceso {
  private static Acl acl=null;
  private static Hashtable permisos=null;
  private static String usuario=null;
  private static PrincipalImpl currentUser;
  private static PrincipalImpl owner=new PrincipalImpl("owner");
  private static String aplicacion;
  private static GroupImpl todos=new GroupImpl("Todos");
  private static AclEntryImpl entryp=new AclEntryImpl(todos);
  private static DBConnection db=null;

  public static DBConnection getDataBase(){
    if (db==null){
      DataBase dataBaseAdmon=Aplication.getAplication().getAdmon().getDB();
      dataBaseAdmon.setCatalogs(new Catalog[] {new mae.admon.db.CatBdadmon()});
      db=Aplication.getAplication().getAdmon().getDataBase();
      db.connect();
      }
    return db;
    }


  public static Acl getAcl(String aplicacion) {
    if (acl==null){
      acl=cargaAcl(aplicacion,Aplication.getAplication().getUser());
      }
    return acl;
    }

  public static Acl getAcl(String aplicacion,String usuario) {
    acl=cargaAcl(aplicacion,usuario);
    /*if (acl==null){
      acl=cargaAcl(aplicacion,usuario);
      }
    */
    return acl;
    }

  private static boolean pertenece(String user, String grupo){
    Select agrupaciones=new Select(getDataBase());
    Table agrup=new Table(agrupaciones,"usagrup");
    Field usacodco=new Field(agrupaciones,agrup,"usacodco");
    Field usagrupo=new Field(agrupaciones,agrup,"usagrupo");
    Field usalogin=new Field(agrupaciones,agrup,"usalogin");
    agrupaciones.setWhere("usacodco="+MAE.getConsulado()+"and usagrupo='"+grupo+
                          "' and usalogin='"+user+"'");
    agrupaciones.execute();
    getDataBase().commit();//Bloqueos: para desbloquear
    return !agrupaciones.isEof();
    }

  private static boolean cargaRecursos(){
    Select susrecursos=new Select(getDataBase());
    Table usrecursos=new Table(susrecursos,"usrecursos");
    Field recurso=new Field(susrecursos,usrecursos,"userecurso");
    susrecursos.setWhere("userecurso like '"+aplicacion+"%'");
    susrecursos.execute();
    getDataBase().commit();//Bloqueos: para desbloquear

    if (!susrecursos.isEof()){
      permisos=new Hashtable(susrecursos.getNumRows());

      while (!susrecursos.isEof()){
        permisos.put(recurso.getString().toUpperCase(),new PermissionImpl(recurso.getString().toUpperCase()));
        susrecursos.next();
        }
      return true;
      }
    else return false;
    }

  private static Acl cargaAcl(String nombreaplic, String user){
    aplicacion=nombreaplic.toUpperCase();
    usuario=user;
    currentUser=new PrincipalImpl(usuario);
    todos.addMember(currentUser);

    if (cargaRecursos()){
      acl=new AclImpl(owner,aplicacion);

      Select grupos=new Select(getDataBase());
      Table usgrupo=new Table(grupos,"usgrupo");
      Field usggrupo=new Field(grupos,usgrupo,"usggrupo");
      grupos.execute();
      getDataBase().commit();//Bloqueos: para desbloquear
      while(!grupos.isEof()){
        String currentGrupo=usggrupo.getString();
        GroupImpl grupo=new GroupImpl(currentGrupo);
        boolean pertenece=pertenece(usuario,currentGrupo);
        if (pertenece) grupo.addMember(currentUser);
        cargaAclEntryGeneral(pertenece,grupo,currentGrupo);
        grupos.next();
        }
      cargaAclEntryLocal();

      try{
        acl.addEntry(owner,entryp);
        }
      catch(Exception e) {
        System.out.println(e.getMessage());
        }
      }
    return acl;
    }

  private static void cargaAclEntryGeneral(boolean pertany,Group grupo,String name) {
    AclEntry entrypos=null;
    AclEntry entryneg=null;


    Select permisosGenerales=new Select(getDataBase());
    Table permge=new Table(permisosGenerales,"uspermge");
    Field recurso=new Field(permisosGenerales,permge,"usprecurso");
    Field posne=new Field(permisosGenerales,permge,"uspposne");
    permisosGenerales.setWhere("usprecurso like '"+aplicacion+"%' and uspgrupo='"+name+"'");
    permisosGenerales.setOrder("uspposne desc");
    permisosGenerales.execute();
    getDataBase().commit();//Bloqueos: para desbloquear

    // Carga de permisos negativos
    while(!permisosGenerales.isEof()){
      while (!permisosGenerales.isEof() && !posne.getString().equals("+")){
        if (entryneg==null) entryneg=new AclEntryImpl(grupo);
        if (pertany) {
          entryneg.addPermission((PermissionImpl) permisos.get(recurso.getString().toUpperCase()));
          }
        permisosGenerales.next();
        }

      // Carga de permisos positivos
      while (!permisosGenerales.isEof() && !posne.getString().equals("-")){
        if (pertany) {
          if (entrypos==null) entrypos=new AclEntryImpl(grupo);
          entrypos.addPermission((PermissionImpl) permisos.get(recurso.getString().toUpperCase()));
          entrypos.setNegativePermissions();
          }
        entryp.addPermission((PermissionImpl) permisos.get(recurso.getString().toUpperCase()));
        permisosGenerales.next();
        }
      }
    try{
      if (pertany && entrypos!=null) acl.addEntry(owner,entrypos);
      if (pertany && entryneg!=null) acl.addEntry(owner,entryneg);
      }
    catch(Exception e) {
      System.out.println(e.getMessage());
      }
    }

  private static void cargaAclEntryLocal() {
    AclEntry entrypos=null;
    AclEntry entryneg=null;

    Select permisosLocales=new Select(getDataBase());
    Table permlo=new Table(permisosLocales,"uspermlo");
    Field login=new Field(permisosLocales,permlo,"usluser");
    Field recurso=new Field(permisosLocales,permlo,"uslrecurso");
    Field posne=new Field(permisosLocales,permlo,"uslposne");
    permisosLocales.setWhere("uslrecurso like '"+aplicacion+"%' and uslcodco="+MAE.getConsulado()+
                             " and usluser='"+usuario+"'");
    permisosLocales.setOrder("uslposne desc");
    permisosLocales.execute();
    getDataBase().commit();//Bloqueos: para desbloquear

    while (!permisosLocales.isEof()){
      // Carga de permisos negativos
      while (!permisosLocales.isEof() && !posne.getString().equals("+")){
        if (entryneg==null) entryneg=new AclEntryImpl(currentUser);
        entryneg.addPermission((PermissionImpl) permisos.get(recurso.getString().toUpperCase()));
        permisosLocales.next();
        }

      // Carga de permisos positivos
      while (!permisosLocales.isEof() && !posne.getString().equals("-")){
        if (entrypos==null) entrypos=new AclEntryImpl(currentUser);
        entrypos.addPermission((PermissionImpl) permisos.get(recurso.getString().toUpperCase()));
        entrypos.setNegativePermissions();
        permisosLocales.next();
        }
      }
    permisosLocales.setWhere("uslrecurso like '"+aplicacion+"%' and uslcodco="+MAE.getConsulado()+
                             " and usluser<>'"+usuario+"' and uslposne='+'");
    permisosLocales.execute();
    getDataBase().commit();//Bloqueos: para desbloquear
    while (!permisosLocales.isEof()) {
        entryp.addPermission((PermissionImpl) permisos.get(recurso.getString().toUpperCase()));
        permisosLocales.next();
        }
    try{
      if (entrypos!=null) acl.addEntry(owner,entrypos);
      if (entryneg!=null) acl.addEntry(owner,entryneg);
      }
    catch(Exception e) {
      System.out.println(e.getMessage());
      }
    }
  }


