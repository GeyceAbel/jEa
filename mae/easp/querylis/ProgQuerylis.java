// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20080930
// Hora:             00:11:46
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.querylis;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: querylis
// Nombre:   Listados
// Versión:  1.0
// 
public class ProgQuerylis extends Program
  {
  public AppEasp easp;
  public ProgQuerylis querylis;
  // Inicio declaraciones globales
  public java.util.Hashtable<String,java.util.Hashtable<String,String>> htTaules = null;
  public String aplicacion=Aplication.getAplication().getName();
  public Quonexio[] quonexions;
  //public DBConnection conexionAplicacion = Aplication.getAplication().getDataBase() ;
  
  public String datSelec;
  public String nomDirec="";
  public int ordenacion=0;
  
  Seleccio seleccio;
  Frase frase;
  
  Frase llegeixFrase(String nom) {
      Frase frase=null;
  
      Selector sfrase=new Selector(getDataBase());
  
      sfrase.execute("select * from quefrase where qefaplicacion='" + aplicacion + "' and qeffrase='" + nom + "'");
  
      if (sfrase.next()) {
        frase=new Frase();
  
        frase.nom         =sfrase.getString("qeffrase");
        frase.master      =sfrase.getString("qefmaster");
        frase.titol       =sfrase.getString("qeftitulo");
        frase.apaisat     ="S".equals(sfrase.getString("qefapaisado"));
        frase.lletra      =sfrase.getint("qefletra");
        frase.paginat     ="S".equals(sfrase.getString("qefpaginado"));
        frase.from        =sfrase.getString("qeffrom");
        frase.where       =sfrase.getString("qefwhere");
        frase.ect         =sfrase.getString("qefect");
        frase.nomConexio  =buscaNomConexio(sfrase.getString("qefmaster"));
        frase.repetirLinea=sfrase.getString("qefrepetir");
  
        llegeixColumnes(frase);
        llegeixTaules(frase);
        llegeixVariables(frase);
        }
  
      sfrase.close();
  
      return frase;
      }
  
      String buscaNomConexio(String nomMaster) {
      	String nomConnect="";
      	TablaCatalogo tc=buscaTabla(null,nomMaster);
      	if (tc!=null) {
             for (int i=0;i<quonexions.length;i++) {
                if (hiHaCataleg(quonexions[i],tc.catalogo)){
                   nomConnect = quonexions[i].name;
                   i=quonexions.length;
                }
             }
          }
      	   
        	return nomConnect;
    }
  
    void llegeixColumnes(Frase frase) {
      Selector scolumnes=new Selector(getDataBase());
  
      scolumnes.execute("select * from quecolumn where qecaplicacion='" + aplicacion + "' and qecfrase='" + frase.nom + "' order by qecorden");
  
      while (scolumnes.next()) {
        Columna col=new Columna();
        col.titol=scolumnes.getString("qectitulo");
        col.tipus=scolumnes.getint("qectipo");
        col.format=scolumnes.getString("qecformato");
        col.acumula="S".equals(scolumnes.getString("qecacumula"));
        col.visible="S".equals(scolumnes.getString("qecvisible"));
        col.orderby=scolumnes.getString("qecorderby");
        col.saltapag="S".equals(scolumnes.getString("qecsaltapag"));
        col.inipag="S".equals(scolumnes.getString("qecinipag"));
  
        String camp  = scolumnes.getString("qeccampo");
        String taula = scolumnes.getString("qectabla");
        String bbdd  = scolumnes.getString("qecbbdd");
  
        col.camp = buscaCampo(bbdd, taula, camp);
  
        col.llarg=Math.max(scolumnes.getint("qeclongitud"),col.titol.length());
  
        if (col.format!=null)
          col.llarg=Math.max(col.llarg,col.format.length());
  
        Columna existent=(Columna)frase.nomsColumnes.get(bbdd+"."+taula+"."+camp);
        if (existent!=null)
          col.valor=existent.valor;
        else {
          col.valor=new Value(col.tipus);
          frase.nomsColumnes.put(bbdd+"."+taula+"."+camp,col);
          }
  
        frase.columnes.addElement(col);
        }
  
      scolumnes.close();
      }
  
    void llegeixTaules(Frase frase) {
      Selector staules=new Selector(getDataBase());
  
      staules.execute("select * from quetabla where qetaplicacion='" + aplicacion + "' and qetfrase='" + frase.nom + "' order by qetorden");
  
      while (staules.next()) {
        Taula t=new Taula();
        t.tc = buscaTabla(staules.getString("qetbbdd"), staules.getString("qettabla"));
  
        frase.taules.addElement(t);
        }
  
      staules.close();
      }
  
    void llegeixVariables(Frase frase) {
      Selector svars=new Selector(getDataBase());
  
      svars.execute("select * from quevariables where qevaplicacion='" + aplicacion + "' and qevfrase='" + frase.nom + "' order by qevorden");
  
      while (svars.next()) {
        Variable t=new Variable();
  
        t.nom          = svars.getString("qevvariable");
        t.tipus        = svars.getint("qevtipo");
        t.longitut     = svars.getint("qevlongitud");
        t.titol        = svars.getString("qevtitulo");
        t.obligatori   = "S".equals(svars.getString("qevobligatorio"));
        t.predef       = svars.getString("qevpredef");
  
        t.valor=new Value(t.tipus);
  
        t.valor.setValue(svars.getString("qevvalor"));
        t.visible      = "S".equals(svars.getString("qevvisible"));
        t.comparacio   = svars.getString("qevcomparacion");
        t.format       = svars.getString("qevformato");
  
        frase.variables.addElement(t);
        }
  
      svars.close();
      }
  
  class TablaCatalogo {
      TableDef table;
      Catalog catalogo;
  
      public String toString() {
          String desc=table.getDescription();
          if (desc==null)
              return table.getName();
          else
              return table.getName()+"/"+desc;
          }
  }
  
  class FieldCatalogo {
      FieldDef field;
      TableDef table;
      Catalog catalogo;
  
      public String toString() {
          String desc=field.getDescription();
          if (desc==null)
              return field.getName();
          else
              return field.getName()+"/"+desc;
          }
  }
  
  TablaCatalogo buscaTabla(String bbdd, String tabla) {
        for (int i=0;i<quonexions.length;i++) {
            String cataleg1=quonexions[i].catalog.getName();
            String cataleg2="";
            if (quonexions[i].catalog2!=null)
               cataleg2=quonexions[i].catalog2.getName();
            String cataleg3="";
            if (quonexions[i].catalog3!=null)
               cataleg3=quonexions[i].catalog3.getName();
    
            if (bbdd!=null && !cataleg1.equals(bbdd) && !cataleg2.equals(bbdd) && !cataleg3.equals(bbdd) 
               && ((i!=0) || bbdd!=null)) continue;  // Si bbdd==null, vol dir la conexió principal
            TableDef td=quonexions[i].catalog.getTable(tabla);
            
            if (td!=null) {
                TablaCatalogo tc=new TablaCatalogo();
                tc.table=td;
                tc.catalogo=quonexions[i].catalog;
                return tc;
            }
            else if (quonexions[i].catalog2!=null) {
          	   td=quonexions[i].catalog2.getTable(tabla);
          	   if (td!=null) {
                     TablaCatalogo tc=new TablaCatalogo();
                     tc.table=td;
                     tc.catalogo=quonexions[i].catalog2;
                     return tc;
                 }
          	   else if (quonexions[i].catalog3!=null) {
          	        td=quonexions[i].catalog3.getTable(tabla);
              	    if (td!=null) {
                         TablaCatalogo tc=new TablaCatalogo();
                         tc.table=td;
                         tc.catalogo=quonexions[i].catalog3;
                         return tc;
              	   }    
          	   }
            }
       }     
       return null;
    }
  
  FieldCatalogo buscaCampo(String bbdd, String tabla, String campo) {
      TablaCatalogo tc=buscaTabla(bbdd, tabla);
      if (tc==null) return null;
  
      FieldCatalogo fc=new FieldCatalogo();
      fc.field=tc.table.getColumn(campo);
      fc.table=tc.table;
      fc.catalogo=tc.catalogo;
      return fc;
      }
  
  class Frase {
    String nom;
    String master;
    String titol;
    boolean apaisat;
    int lletra;
    boolean paginat;
    String from;
    String where;
    String ect;
    String nomConexio;
    String repetirLinea;
  
    int varnum;
  
    java.util.Vector columnes=new java.util.Vector();
    java.util.Vector taules=new java.util.Vector();
    java.util.Vector variables=new java.util.Vector();
    java.util.Hashtable nomsColumnes=new java.util.Hashtable();
  
    String getColumnes(Quonexio conn, Quorelacio quor) {
      StringBuffer w=new StringBuffer();
  
      for(int i=0;i<columnes.size();i++) {
          Columna col=(Columna)columnes.elementAt(i);
  
          if (hiHaCataleg(conn,col.camp.catalogo)) {
            if (w.length()>0) w.append(", ");
            w.append(col.camp.field.getName());
            col.quorelacio=quor;
            }
          }
  
      return w.toString();
      }
  
    String getOn(TableDef origen, TableDef desti) {
      return origen.getStringRelation(desti,origen.getName(),desti.getName());
      }
  
    String getOn(Quonexio conn, TableDef origen, int max) {
      for(int i=max;i-->0;) {
        Taula taula=((Taula)taules.elementAt(i));
  
        if (!hiHaCataleg(conn,taula.tc.catalogo)) continue;
  
        TableDef desti=taula.tc.table;
  
        if (desti.isRelation(origen)) {
          return getOn(desti,origen);
          }
        else if (origen.isRelation(desti)) {
          return getOn(origen,desti);
          }
        }
      return null;
      }
  
  //  String getFromPrincipal(Catalog cat,Quorelacio principal) {
    String getFromPrincipal(Quonexio conn,Quorelacio principal) {
      if (from!=null) return from;
  
      String f="";
  
      int quantitat=0;
  
      for(int i=0;i<taules.size();i++) {
        Taula t=(Taula)taules.elementAt(i);
  
       if (t.resolta || !hiHaCataleg(conn,t.tc.catalogo)) continue;
  
       if      (quantitat == 1 ) f="" +f+ " inner join ";
       else if (quantitat >  1 ) f="("+f+") inner join ";
  
        if (quantitat>0) {
          String on=getOn(conn, t.tc.table,i);
          f=f+t.tc.table.getName();
          f=f+" on "+on;
        }
        else
          f=f+t.tc.table.getName();
  
        quantitat++;
        t.quorelacio=principal;
        }
  // TOCAT PER JEO
      if (aplicacion.equals("JEO")) {
         if ("E".equals(frase.ect) || "A".equals(frase.ect)) {
            f="seleccion,"+f;
         }
      }
      else if (aplicacion.equals("JMODELOS") && "D".equals(frase.ect) ) f = "seleccion,"+f;
      else if ("E".equals(frase.ect) || "C".equals(frase.ect) || "T".equals(frase.ect)) {
              f="seleccion,"+f;
      }
  
      if (f.length()>0)
          return f;
      else
          return null;
      }
  
    String getFromSecundari(Quonexio conn,Quorelacio quor) {
      if (from!=null) return from;
  
      String f="";
  
      int quantitat=0;
  
      for(int i=0;i<taules.size();i++) {
        Taula t=(Taula)taules.elementAt(i);
  
        if (t.resolta || !hiHaCataleg(conn,t.tc.catalogo)) continue;
  
       if      (quantitat == 1 ) f="" +f+ " inner join ";
       else if (quantitat >  1 ) f="("+f+") inner join ";
  
        if (quantitat>0) {
          String on=getOn(conn, t.tc.table,i);
          if (on==null)
            continue;
          f=f+t.tc.table.getName();
          f=f+" on "+on;
        }
        else {
          quor.taulaOrigen=t.tc.table;
          f=f+t.tc.table.getName();
        }
  
        quantitat++;
        t.resolta=true;
        }
  
      if (f.length()>0)
          return f;
      else
          return null;
      }
  
    String getWhere(Quonexio conn) {
      StringBuffer w=new StringBuffer();
  
      for(int i=0;i<variables.size();i++) {
        Variable v=(Variable)variables.elementAt(i);      
  
  //        if (buscaCampo(conn.name, v.nom)==null) continue;
        //if (w.length()>0) w.append(" and ");
        if(v.nom == null) {
          if (v.comparacio.equals("Y")) w.append(" and ");
          else if (v.comparacio.equals("O")) w.append(" or ");
          //else if (v.comparacio.equals("L") && !v.valor.isNull()) w.append(" "+v.valor+" ");
          else w.append(" " + v.comparacio + " ");
          }
        else {  //si el nom no es null estem amb seleccio variable
          if (i!=0) {
            Variable vAnt = (Variable)variables.elementAt(i-1);
            if (vAnt.nom != null) {
              w.append(" and ");
              }
            }
          }  
        if (v.valor.isNull()) {
          if ("=".equals(v.comparacio)) {
              w.append(v.nom);
              w.append(" is null");
              }
          else if ("<>".equals(v.comparacio)) {
              w.append(v.nom);
              w.append(" is not null");
              }
          }
        else {
          w.append(v.nom);
          if(v.comparacio.equals("L"))
            w.append(" "+v.valor+" ");
          else {
            w.append(v.comparacio);
            w.append(Aplication.getDB().getSQLFormat(v.valor));
            }
          }
        }
  
      if (where!=null)
        if (w.length()==0)
          w.append(where);
        else
          w.append(" ("+where.toString()+")");
  
      if (w.length()>0)
          return w.toString();
      else
          return null;
      }
  
    String getOrder() {
      StringBuffer ordre=new StringBuffer();
  
      for(int i=0;i<columnes.size();i++) {
        Columna col=(Columna)columnes.elementAt(i);
        if (col.orderby!=null) {
          if (ordre.length()>0) ordre.append(',');
          ordre.append(col.camp.field.getName());
          if ("D".equals(col.orderby)) ordre.append(" DESC");
          }
        }
  
      if (ordre.length()>0)
          return ordre.toString();
      else
          return null;
      }
    }
  
  class Variable {
    String nom;
    int tipus;
    int longitut;
    String titol;
    boolean obligatori;
    String predef;
    Value valor;
    boolean visible;
    String comparacio;
    String format;
    }
  
  class Taula {
    TablaCatalogo tc;
    boolean resolta;
    Quorelacio quorelacio;
    }
  
  class Columna {
    String titol;
    FieldCatalogo camp;
    int llarg;
    int tipus;
    double total;
    Value valor;
    ReportData reportData;
    ReportData reportDataTotal;
    boolean visible;
    boolean acumula;
    String orderby;
    String taula;
    String format;
    boolean saltapag;
    boolean inipag;
    boolean canviat;
    Quorelacio quorelacio;
    }
  
  class Seleccio {
    //boolean hiHaRegistres;
  //    Selector selector;
    java.util.Vector secundaris=new java.util.Vector();
    Quorelacio quorelacioPrincipal=new Quorelacio();
  
    boolean hiHaTaula(String nom) {
      for(int i=0;i<frase.taules.size();i++) {
        Taula t=(Taula)frase.taules.elementAt(i);
        if (nom.equals(t.tc.table.getName())) return true;
      }
      return false;
    }
  
    boolean hiHaSelectorPerQuonexio(Quonexio quonexio) {
      for(int i=0;i<frase.taules.size();i++) {
        Taula t=(Taula)frase.taules.elementAt(i);
  
        if (!t.resolta && hiHaCataleg(quonexio,t.tc.catalogo)) return true;
      }
      return false;
    }
  
    void inicia() {
      generaSelectorPrincipal();
  
      int posIni=1;
      int nConexio=0;
  
      if (!frase.nomConexio.equals(quonexions[0].name)) {
      	 for(int i=1;i<quonexions.length;i++) {
      		if (frase.nomConexio.equals(quonexions[i].name)) {
      		   posIni=0;
      		   nConexio=i;
      		}
      	 }
      }
  
      for(int i=1;i<quonexions.length;i++) {
        boolean principal=(i==0);
  
        if (i!=nConexio) {
           while (hiHaSelectorPerQuonexio(quonexions[i]))
                 generaSelectorSecundaris(quonexions[i]);
        }
      }
      first();
    }
  
    void generaSelectorPrincipal() {
      Quonexio quonexio=quonexions[0];
      
      if (!frase.nomConexio.equals(quonexions[0].name)) {
         for(int i=1;i<quonexions.length;i++) {
            if (frase.nomConexio.equals(quonexions[i].name))
               quonexio=quonexions[i];
         }
      }
       
      StringBuffer sentencia=new StringBuffer();
      quorelacioPrincipal.selector=new Selector(quonexio.connection);
  
      String select1 = frase.getColumnes(quonexio,quorelacioPrincipal);
      String select2 = frase.getFromPrincipal(quonexio,quorelacioPrincipal);
  
      String where=frase.getWhere(quonexio);
  
  // TOCAT PER JEO
      if (aplicacion.equals("JEO")) {
         if ("E".equals(frase.ect) || "A".equals(frase.ect)) {
              String selwhere="SELUSUARIO='"+Aplication.getAplication().getUser()+"' and SELPROGRAMA='QUERY'";
  
              if (hiHaTaula("actividades")) {
                 selwhere+=" and (SELEMPRESA IS NULL or SELEMPRESA=ACTEMPRESA) and (SELACTIVIDAD IS NULL or SELACTIVIDAD=ACTCODIGO)";
              }
              else if (hiHaTaula("empresa")) {
                 selwhere+=" and (SELEMPRESA IS NULL or SELEMPRESA=EMPCODIGO)";
              }
  
              if (where==null)
                 where=selwhere;
              else
                 where=selwhere+" and ("+where+")";
          }
      }
      else if (aplicacion.equals("JMODELOS")) {
        if ("D".equals(frase.ect)) {
          String selwhere="SELUSUARIO='"+Aplication.getAplication().getUser()+"' and SELPROGRAMA='QUERY'";
          if (htTaules != null && htTaules.get("modelos") != null) {
            selwhere+=" and (SELNIF IS NULL or SELNIF="+htTaules.get("modelos").get(squery.qefmaster.getString().toUpperCase())+")";
          }
          //selwhere+=" and (SELNIF IS NULL or SELNIF=MESNIF)";
          if (where==null) where=selwhere;
          else where=selwhere+" and ("+where+")";        
        }
      }
      else if ("E".equals(frase.ect) || "C".equals(frase.ect) || "T".equals(frase.ect)) {
              String selwhere="SELUSUARIO='"+Aplication.getAplication().getUser()+"' and SELPROGRAMA='QUERY'";
  
              if (hiHaTaula("trabajador")) {
                 selwhere+=" and (SELCODIEMP IS NULL or SELCODIEMP=TRACODIEMP) and (SELCENTRO IS NULL or SELCENTRO=TRACENTRO) and (SELTRABAJADOR IS NULL or SELTRABAJADOR=TRACODIGO)";
              }
              else if (hiHaTaula("centros")) {
                 selwhere+=" and (SELCODIEMP IS NULL or SELCODIEMP=CENCODIEMP) and (SELCENTRO IS NULL or SELCENTRO=CENCODIGO)";
              }
              else if (hiHaTaula("empresa")) {
                 selwhere+=" and (SELCODIEMP IS NULL or SELCODIEMP=EMPCODIGO)";
              }
              if (where==null)
                 where=selwhere;
              else
                 where=selwhere+" and ("+where+")";
      }
  
      String ordre=frase.getOrder();
      if (select1!=null && !select1.trim().equals("") && select2!=null && !select2.trim().equals("")) {
         sentencia.append("select ");
         if ("N".equals(frase.repetirLinea))
             sentencia.append("distinct ");
         sentencia.append(select1);
  
         sentencia.append(" from ");  
         sentencia.append(select2);
  
         if (where!=null) {
          sentencia.append(" where ");
          sentencia.append(where);
          }
  
         if (ordre!=null) {
          sentencia.append(" order by ");
          sentencia.append(ordre);
          }
  
         quorelacioPrincipal.selector.execute(sentencia.toString());
      }
    }
  
    void generaSelectorSecundaris(Quonexio quonexio) {
      Quorelacio quor=new Quorelacio();
  
      StringBuffer sentencia=new StringBuffer();
      Selector selector=new Selector(quonexio.connection);
  
      String select1 = frase.getColumnes(quonexio,quor);
      String select2 = frase.getFromSecundari(quonexio,quor);
  
      if (select1!=null && !select1.trim().equals("") && select2!=null && !select2.trim().equals("")) { 
         sentencia.append("select ");
         sentencia.append(select1);
  
         sentencia.append(" from ");
         sentencia.append(select2);
  
         quor.foreignKey=buscaVeryForeigKey(quonexio,quor);
  
         quor.selector=selector;
         quor.sentencia=sentencia.toString();
  
         quor.quonexioOrigen=quonexio;
  
         secundaris.addElement(quor);
         }
      }
  
    // Crear altres selectors provinents de conexions diferents
    // a les de la bbdd principal
    ForeignKey buscaVeryForeigKey(Quonexio conn,Quorelacio quor) {
      
      for(int quo=0;quo<quonexions.length;quo++) {
        if (quonexions[quo]==conn) continue;
  
        for(int i=0;i<frase.taules.size();i++) {
          Taula t=(Taula)frase.taules.elementAt(i);
  
          if (hiHaCataleg(conn,t.tc.catalogo)) continue;
          ForeignKey[] fks=t.tc.table.getForeignKeys();
          for(int j=0;j<fks.length;j++) {
            for(int k=0;k<frase.taules.size();k++) {
              Taula desti=(Taula)frase.taules.elementAt(k);
  
              if (!hiHaCataleg(conn,desti.tc.catalogo)) continue;
              if (fks[j].getTableDef()==desti.tc.table) {
                quor.taulaDesti=t.tc.table;
                quor.quonexioDesti=quonexions[quo];
                quor.quorelacioDesti=t.quorelacio;
                return fks[j];
                }
              }
            }
          }
      }
  
      return null;
    }
  
    void first() {
      next(true);
    }
  
    void next() {
      next(false);
    }
  
    void next(boolean first) {
  
      quorelacioPrincipal.eof=!quorelacioPrincipal.selector.next();
  
      for(int i=0;i<secundaris.size();i++) {
  
        Quorelacio quor=(Quorelacio)secundaris.elementAt(i);
  
        if (quor.quorelacioDesti.eof) {
          quor.eof=true;
        }
        else {
          String stm=quor.sentencia;
          String where=quor.quonexioOrigen.getWhere(quor);
          if (where!=null && stm!=null & !stm.trim().equals(""))
            stm+=" where "+where;
          if (!first)
            quor.selector.close();
  
          if (stm!=null & !stm.trim().equals("")) {
             quor.selector.execute(stm);
             quor.eof=!quor.selector.next();
             }
          }
        }
        /*
          for(int i=0;i<selectors.size();i++) {
  
            Selector select=new Selector((DBConnection)bbdds.get(cat));
  
  
          }
        */
  
        for(java.util.Enumeration e=frase.nomsColumnes.keys();e.hasMoreElements();) {
            String key=(String)e.nextElement();
            Columna col=(Columna)frase.nomsColumnes.get(key);
  
            if (col.quorelacio.eof)
              col.valor.setNull();
            else
              switch(col.tipus) {
                  case Value.DATE:
                      java.util.Date dia=col.quorelacio.selector.getDate(col.camp.field.getName());
                      if (col.quorelacio.selector.wasNull())
                          col.valor.setNull();
                      else
                          col.valor.setValue(dia);
                      break;
                  case Value.DOUBLE:
                      double vald=col.quorelacio.selector.getdouble(col.camp.field.getName());
                      if (col.quorelacio.selector.wasNull())
                          col.valor.setNull();
                      else
                          col.valor.setValue(vald);
                      break;
                  case Value.INTEGER:
                      int vali=col.quorelacio.selector.getint(col.camp.field.getName());
                      if (col.quorelacio.selector.wasNull())
                          col.valor.setNull();
                      else
                          col.valor.setValue(vali);
                      break;
                  case Value.STRING:
                      String vals=col.quorelacio.selector.getString(col.camp.field.getName());
                      if (col.quorelacio.selector.wasNull())
                          col.valor.setNull();
                      else
                          col.valor.setValue(vals);
                      break;
                  }
          }
      }
    }
  
    void asignarCamps() {
      for(int i=0;i<frase.columnes.size();i++) {
        Columna col=(Columna)frase.columnes.elementAt(i);
        if (col.visible) {
          col.reportData.setValue(col.valor);
          if (col.acumula)
            col.reportDataTotal.setValue(col.reportDataTotal.getDouble()+col.reportData.getDouble());
          }
        }
      }
  
    void canvis() {
      for(int i=0;i<frase.columnes.size();i++) {
        Columna col=(Columna)frase.columnes.elementAt(i);
        if (!seleccio.quorelacioPrincipal.eof  && col.saltapag) {
          if (!col.valor.equals(col.reportData))
              col.canviat=true;
          else
              col.canviat=false;
          }
        }
      }
  
  boolean algunaVariableVisible() {
    for(int i=0;i<frase.variables.size();i++) {
      final Variable v=(Variable)frase.variables.elementAt(i);
      if (v.visible) return true;
      }
    return false;
  }
  
  boolean demanarParametres() {
    if ((frase.variables.size()==0 || !algunaVariableVisible()) &&
        (frase.ect==null || frase.ect.length()==0 || frase.ect.equals("N")) )
       return true;
  
    FormVparam form=new FormVparam(querylis);
  /*
    form.panel=new ControlPanel(form);
    form.panel.setLayout(new LayoutAligned());
  
    for(int i=0;i<frase.variables.size();i++) {
      final Variable v=(Variable)frase.variables.elementAt(i);
      if (v.visible) {
          ControlEdit ctrl=new ControlEdit(form.panel) {
              public Object getDefault() {
                  return v.valor.getObject();
                  }
              public void userChange(Value val) {
                  super.userChange(val);
                  v.valor.setValue(val);
                  }
              };
          ctrl.setName(v.nom);
          ctrl.setType(v.tipus);
          ctrl.setLength(v.longitut);
          ctrl.setTitle(v.titol);
          ctrl.setObligate(v.obligatori);
          ctrl.setMaskInput(v.format);
          }
      }
  
    LocationWindow loc=(LocationWindow)form.getLocation();
  
    if ("E".equals(frase.ect) || "C".equals(frase.ect) || "T".equals(frase.ect)) {
      loc.setHeight(frase.variables.size()*15+200);
  
      form.setLayout(new LayoutSplit(LayoutSplit.VERTICAL));
      mae.laboral.datselec.ProgDatselec prcon=new mae.laboral.datselec.ProgDatselec();
      form.panel.setLocation(new LocationSplit(LocationSplit.LEFT));
      prcon.setConnection(getDataBase());
      prcon.setLocation(new LocationSplit(LocationSplit.RIGHT));
      prcon.setParent(form);
      prcon.gprograma="QUERY";
      prcon.porECT=frase.ect.charAt(0);
  
      prcon.run();
      }
    else
      loc.setHeight(frase.variables.size()*15+140);
  
    loc.setWidth(700);
  */
    form.run();
  
    return form.ok;
    }
  
  boolean hiHaCataleg(Quonexio conn,Catalog cat) {
    Catalog catalog=conn.catalog;
    Catalog catalog2=null;
    Catalog catalog3=null;
    if (conn.catalog2!=null)
       catalog2=conn.catalog2;
    if (conn.catalog3!=null)
       catalog3=conn.catalog3;
  
    if (catalog==cat || catalog2==cat || catalog3==cat) 
       return true;
    else 
       return false;
  }
  
  // Fin declaraciones globales
  // Ventana
  public FormVseleccion vseleccion;
  // Selects
  public Squery squery;
  public Sprueba sprueba;
  public Squecolumn squecolumn;
  public Squetabla squetabla;
  public Squevariables squevariables;
  public Inflistado inflistado;
  // Ventana
  public FormVparam vparam;
  // Selects
  // Ventana
  public FormVduplic vduplic;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Listados");
      }
    }
    
  public class FormVseleccion extends MultiDataForm
    {
    // Inicio declaraciones globales
    public String error="";
    public String FITCERTIF = null;
    public String FICHIMPORTA = null;
    public java.io.File fileXML=null;
    public java.io.FileOutputStream write=null;
    public java.io.PrintWriter salida=null;
    public java.awt.Cursor cursorAnt=null;
    
    String destino;
    java.io.File fileImpXML;
    javax.xml.parsers.DocumentBuilderFactory dbf;
    javax.xml.parsers.DocumentBuilder db;
    org.w3c.dom.NodeList columnas;
    org.w3c.dom.Document doc;
    org.w3c.dom.Node fstNode;
    
    public void onColumnClick(int ncol) {
        Maefc.waitCursor();
        super.onColumnClick(ncol);
        ordenacion=ncol+1;
        doShow();
        Maefc.restoreCursor();
    }
    
    public void onDelete() {
      if (getCurrentRow()>=0 &&
          Maefc.message("Se va a eliminar toda la definición del listado\n¿Está seguro?","¡Atención!",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
    
        int saved=getCurrentRow();
    
        String frase=qeffrase.getString();
    
        //Delete delev=new Delete(getDataBase(),"quevariables");
        Delete delev=new Delete(Aplication.getAplication().getDataBase(),"quevariables");
        delev.execute("qevaplicacion='"+aplicacion+"' and qevfrase='"+frase+"'");
    
        //Delete delec=new Delete(getDataBase(),"quecolumn");
        Delete delec=new Delete(Aplication.getAplication().getDataBase(),"quecolumn");
        delec.execute("qecaplicacion='"+aplicacion+"' and qecfrase='"+frase+"'");
    
        //Delete delet=new Delete(getDataBase(),"quetabla");
        Delete delet=new Delete(Aplication.getAplication().getDataBase(),"quetabla");
        delet.execute("qetaplicacion='"+aplicacion+"' and qetfrase='"+frase+"'");
    
        //Delete delef=new Delete(getDataBase(),"quefrase");
        Delete delef=new Delete(Aplication.getAplication().getDataBase(),"quefrase");
        delef.execute("qefaplicacion='"+aplicacion+"' and qeffrase='"+frase+"'");
    
        //getDataBase().commit();
        Aplication.getAplication().getDataBase().commit();
        doShow();
        setCurrentRow(Math.max(0,saved-1));
        }
      }
    
    public void onInsert() {
      mae.easp.querytrat.ProgQuerytrat prog=new mae.easp.querytrat.ProgQuerytrat(easp);
      prog.esAlta=true;
      prog.aplicacion=aplicacion;
      prog.quonexions=quonexions;
      prog.htTaules = htTaules;
      LocationWindow locw=new LocationWindow();
      locw.setTitle("Nuevo listado");
      locw.setWidth(800);
      locw.setHeight(495);
      locw.setLocation(LocationWindow.CENTER);
      prog.setLocation(locw);
      prog.setModal(true);
      prog.setConnection(getDataBase());
    
      int saved=getCurrentRow();
    
      prog.run();
    
      doShow();
    
      if (getRowCount()>0)
        setCurrentRow(Math.max(0,saved));
      }
    
    public void onEdit() {
      mae.easp.querytrat.ProgQuerytrat prog=new mae.easp.querytrat.ProgQuerytrat(easp);
      prog.esAlta=false;
      prog.aplicacion=aplicacion;
      prog.quonexions=quonexions;
      prog.frase=squery.qeffrase.getString();
      prog.master=squery.qefmaster.getString();
      prog.htTaules = htTaules;
      LocationWindow locw=new LocationWindow();
      locw.setTitle("Editar listado");
      locw.setWidth(800);
      locw.setHeight(495);
      locw.setLocation(LocationWindow.CENTER);
      prog.setLocation(locw);
      prog.setModal(true);
      prog.setConnection(getDataBase());
    
      int saved=getCurrentRow();
    
      prog.run();
    
      doShow();
    
      if (getRowCount()>0)
        setCurrentRow(Math.max(0,saved));
      }
    
    public void onSelection(){
      doEdit();
    }
    
    void titols(StringBuffer xml) {
      int pos=0;
      for(int i=0;i<frase.columnes.size();i++) {
        Columna col=(Columna)frase.columnes.elementAt(i);
        if (col.visible) {
          xml.append("<tab pos=\""+pos+"\" />");
          xml.append(col.titol);
          pos+=col.llarg+1;
          }
        }
      xml.append("<br />\n");
    }
    
    void titolsExcel(StringBuffer xml) {
      for(int i=0;i<frase.columnes.size();i++) {
        Columna col=(Columna)frase.columnes.elementAt(i);
        if (col.visible) {
          xml.append("&lt;columna tipo=&quot;"+Value.getTypeName(col.tipus)+"&quot; &gt;");
          xml.append(col.titol);
          xml.append("&lt;/columna&gt;\n<br />");
          }
        }
    }
    
    void linies(StringBuffer xml) {
      for(int i=0;i<frase.columnes.size();i++) {
        Columna col=(Columna)frase.columnes.elementAt(i);
        if (col.visible) {
          for(int j=0;j<col.llarg;j++) 
            xml.append('-');
          xml.append(' ');
          }
        }
         
      xml.append("<br />\n");
    }
    
    void capsaleraLlistat(StringBuffer xml) {
      xml.append("<attr id=\"BOLD\">");
      xml.append(frase.titol);
      xml.append("</attr><br />");
      if (frase.paginat) {
        xml.append("Página: <sysvar id=\"pagenumber\" /><br />");
        }
      xml.append("<sysvar id=\"date\" /><br />");
      xml.append("<br />");
      }
    
    void capsaleraLlistatExcel(StringBuffer xml) {
      xml.append("&lt;titulo&gt;");
      xml.append(frase.titol);
      xml.append("&lt;/titulo&gt;\n<br />");
      }
    
    void variables(StringBuffer xml) {
      for(int i=0;i<frase.variables.size();i++) {
        Variable var=(Variable)frase.variables.elementAt(i);
        if (var.visible) {
          xml.append(var.titol+": ");
          xml.append(var.valor.getString());
          xml.append("<br />\n");
          }
        }
      xml.append("<br />\n");
      }
    
    void variablesExcel(StringBuffer xml) {
      for(int i=0;i<frase.variables.size();i++) {
        Variable var=(Variable)frase.variables.elementAt(i);
        if (var.visible) {
          xml.append("&lt;variable titulo=\"");
          xml.append(var.titol);
          xml.append("\" valor=\"");
          xml.append(var.valor);
          xml.append("\" /&gt;\n<br />");
          }
        }
      }
    
    void detall(StringBuffer xml) {
      int pos=0;
      for(int i=0;i<frase.columnes.size();i++) {
        Columna col=(Columna)frase.columnes.elementAt(i);
        if (col.visible) {
          xml.append("<tab pos=\""+pos+"\" />");
          xml.append("<var id=\""+(++frase.varnum)+"\"");
          if (col.format!=null)
            xml.append(" format=\""+Maefc.maefcFormatToJavaFormat(col.format)+"\"");
          xml.append(" />");
          pos+=col.llarg+1;
          }
        }
      xml.append("<br />\n");
      }
    
    void detallExcel(StringBuffer xml) {
      xml.append("&lt;detalle&gt;\n<br />");
      for(int i=0;i<frase.columnes.size();i++) {
        Columna col=(Columna)frase.columnes.elementAt(i);
        if (col.visible) {
          xml.append("&lt;valor&gt;");
          xml.append("<var id=\""+(++frase.varnum)+"\" ");
          if (col.tipus==Value.DATE) 
            xml.append(" format=\"dd-MM-yyyy\" "); 
          else if (col.tipus==Value.DOUBLE)
            xml.append(" format=\"############.####\" ");
          xml.append("/>");
          xml.append("&lt;/valor&gt;\n<br />");
          }
        }
      xml.append("&lt;/detalle&gt;\n<br />");
      }
    
    void subtotals(StringBuffer xml) {
      for(int i=0;i<frase.columnes.size();i++) {
        Columna col=(Columna)frase.columnes.elementAt(i);
        if (col.visible) {
          for(int j=0;j<col.llarg;j++) 
            xml.append(col.acumula?'-':' ');
          xml.append(' ');
          }
        }
         
      xml.append("<br />\n");
    
      int pos=0;
      for(int i=0;i<frase.columnes.size();i++) {
        Columna col=(Columna)frase.columnes.elementAt(i);
        if (col.visible) {
          if (col.acumula) {
            xml.append("<tab pos=\""+pos+"\" />");
            xml.append("<var id=\""+(++frase.varnum)+"\" />");
            }
          pos+=col.llarg+1;
          }
        }
      xml.append("<br />\n");
      }
    
    void subtotalsExcel(StringBuffer xml) {
      xml.append("&lt;total&gt;\n<br />");
      for(int i=0;i<frase.columnes.size();i++) {
        Columna col=(Columna)frase.columnes.elementAt(i);
        xml.append("&lt;valor&gt;");
        if (col.visible && col.acumula) {
          xml.append("<var id=\""+(++frase.varnum)+"\" />");
          }
        xml.append("&lt;/valor&gt;\n<br />");
        }
      xml.append("&lt;/total&gt;\n<br />");
      }
    
    boolean hiHaTotals() {
        for(int i=0;i<frase.columnes.size();i++) {
            Columna col=(Columna)frase.columnes.elementAt(i);
            if (col.visible && col.acumula) {
                return true;
                }
            }
        return false;
    }
    
    String creaXML() {
      StringBuffer xml=new StringBuffer();
    
      xml.append("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n");
      xml.append("<informe>\n");
      xml.append("<config>");
      if (frase.apaisat)
        xml.append("<landscape />");
      xml.append("</config>");
      xml.append("<body>\n");
    
      xml.append("<block id=\"1\">\n");
      xml.append("<pageheader>\n");
    
      capsaleraLlistat(xml);
      
      variables(xml);
    
      titols(xml);
      linies(xml);
    
      xml.append("</pageheader>\n");
      
      xml.append("<detail>\n");
      detall(xml);
     
      xml.append("<cond id=\"2\" >");
      xml.append("<page />");
      xml.append("</cond>");
    
      xml.append("</detail>\n");
    
      if (hiHaTotals()) {
        xml.append("<blockfooter>\n");
        subtotals(xml);
        xml.append("</blockfooter>\n");
        }
    
      xml.append("</block>\n");
    
      xml.append("</body>\n");
    
      frase.varnum=0;
      xml.append("<excel>\n");
      xml.append("<block id=\"1\">\n");
      xml.append("<pageheader>\n");
    
      capsaleraLlistatExcel(xml);
      
      variablesExcel(xml);
    
      titolsExcel(xml);
    
      xml.append("</pageheader>\n");
      
      xml.append("<detail>\n");
      detallExcel(xml);
     
      xml.append("</detail>\n");
    
      if (hiHaTotals()) {
        xml.append("<blockfooter>\n");
        subtotalsExcel(xml);
        xml.append("</blockfooter>\n");
        }
    
      xml.append("</block>\n");
    
      xml.append("</excel>\n");
      xml.append("</informe>\n");
    
      return xml.toString();
      }
    
    public void exportaXML() {
      creaDirect(destino);
      //FITCERTIF = "list"+Fecha.fechaGregoriana(Maefc.getDate())+Fecha.getHora(Maefc.getDateTime(),"HHmmss")+tipus+".xml";
      //FITCERTIF = qeffrase.getString().trim() + ".xml";
    
      if ( obreFitXML() ) {
        printCabeceraXML();
        printDetalleXML();
        
        }
    
      tancaFitXML();
      }
    
    public void printCabeceraXML() {
        salida.println("<?xml version=\'1.0\' encoding=\"ISO-8859-1\"?>");
    }
    
    public void printDetalleXML() {
        String nomListado="listadojNOMINA";
        if (aplicacion.equals("JEO")) nomListado="listadojEO";
        else if (aplicacion.equals("JMODELOS")) nomListado="listadojMODELOS";
        
        salida.println("<"+nomListado+">");
        salida.println("<quefrase>");
          sprueba.setWhere("qefaplicacion = '" + aplicacion + "' and qeffrase = '" + vseleccion.qeffrase.getString() + "'");
          sprueba.execute();
          insertEtiq("qefaplicacion",aplicacion);
          insertEtiq("qeffrase",sprueba.qeffrase.getString().trim());
          insertEtiq("qefdescripcion",sprueba.qefdescripcion.getString().trim());
          insertEtiq("qefmaster",sprueba.qefmaster.getString().trim());
          insertEtiq("qeftitulo",sprueba.qeftitulo.getString().trim());
          insertEtiq("qefapaisado",sprueba.qefapaisado.getString().trim());
          if(!sprueba.qefletra.isNull())
            insertEtiq("qefletra",sprueba.qefletra.getInteger());
          else
            insertEtiq("qefletra","");
          insertEtiq("qefpaginado",sprueba.qefpaginado.getString().trim());
          insertEtiq("qeffrom",sprueba.qeffrom.getString().trim());
          insertEtiq("qefwhere",sprueba.qefwhere.getString().trim());
          insertEtiq("qefect",sprueba.qefect.getString().trim());
          insertEtiq("qefrepetir",sprueba.qefrepetir.getString().trim());
        salida.println("</quefrase>"); 
        salida.println("<quecolumn>");
          squecolumn.execute();
          while(!squecolumn.isEof()) {
          salida.println("<registro>");
            insertEtiq("qecaplicacion",aplicacion);
            insertEtiq("qecfrase",squecolumn.qecfrase.getString().trim());
            insertEtiq("qecorden",squecolumn.qecorden.getInteger());
            insertEtiq("qeccampo",squecolumn.qeccampo.getString().trim());
            insertEtiq("qectitulo",squecolumn.qectitulo.getString().trim());
            if(!squecolumn.qeclongitud.isNull())
              insertEtiq("qeclongitud",squecolumn.qeclongitud.getInteger());
            else
              insertEtiq("qeclongitud","");
            if (!squecolumn.qectipo.isNull())
              insertEtiq("qectipo",squecolumn.qectipo.getInteger());
            else
              insertEtiq("qectipo","");
            insertEtiq("qectabla",squecolumn.qectabla.getString().trim());
            insertEtiq("qecvisible",squecolumn.qecvisible.getString().trim());
            insertEtiq("qecrestriccion",squecolumn.qecrestriccion.getString().trim());
            insertEtiq("qecorderby",squecolumn.qecorderby.getString().trim());
            insertEtiq("qecacumula",squecolumn.qecacumula.getString().trim());
            insertEtiq("qecsaltapag",squecolumn.qecsaltapag.getString().trim());
            insertEtiq("qecinipag",squecolumn.qecinipag.getString().trim());
            insertEtiq("qecformato",squecolumn.qecformato.getString().trim());
            insertEtiq("qecbbdd",squecolumn.qecbbdd.getString().trim());
          salida.println("</registro>");
          squecolumn.next();
          }
        salida.println("</quecolumn>");
        salida.println("<quetabla>");
          squetabla.execute();
          while(!squetabla.isEof()) {
            salida.println("<registro>");
              insertEtiq("qetaplicacion",aplicacion);
              insertEtiq("qetfrase",squetabla.qetfrase.getString().trim());
              insertEtiq("qetorden", squetabla.qetorden.getInteger());
              insertEtiq("qettabla",squetabla.qettabla.getString().trim());
              insertEtiq("qetbbdd",squetabla.qetbbdd.getString().trim());
              insertEtiq("qetrelacion",squetabla.qetrelacion.getString().trim());
            salida.println("</registro>");
            squetabla.next();
          }
        salida.println("</quetabla>");
        salida.println("<quevariables>");
          squevariables.execute();
          while(!squevariables.isEof()) {
            salida.println("<registro>");
              insertEtiq("qevaplicacion",aplicacion);
              insertEtiq("qevfrase",squevariables.qevfrase.getString().trim());
              insertEtiq("qevorden",squevariables.qevorden.getInteger());
              insertEtiq("qevvariable",squevariables.qevvariable.getString().trim());
              if(!squevariables.qevtipo.isNull())
                insertEtiq("qevtipo",squevariables.qevtipo.getInteger());
              else
                insertEtiq("qevtipo","");
              if (!squevariables.qevlongitud.isNull())
                insertEtiq("qevlongitud",squevariables.qevlongitud.getInteger());
              else 
                insertEtiq("qevlongitud","");
              insertEtiq("qevtitulo",squevariables.qevtitulo.getString().trim());
              insertEtiq("qevobligatorio",squevariables.qevobligatorio.getString().trim());
              insertEtiq("qevpredef",squevariables.qevpredef.getString().trim());
              insertEtiq("qevvalor",squevariables.qevvalor.getString().trim());
              insertEtiq("qevvisible",squevariables.qevvisible.getString().trim());
              if(!squevariables.qevcomparacion.isNull()) {
                String qevcomp = squevariables.qevcomparacion.getString().trim();
                int compara = 99;
                if (qevcomp.equals("=")) compara = 0;
                if (qevcomp.equals("==")) compara = 1;
                if (qevcomp.equals(">=")) compara = 2;
                if (qevcomp.equals("<=")) compara = 3;
                if (qevcomp.equals("<>")) compara = 4;
                if (qevcomp.equals(">")) compara = 5;
                if (qevcomp.equals("<")) compara = 6;
                if (qevcomp.equals("L")) compara = 7;
                if (qevcomp.equals("Y")) compara = 8;
                if (qevcomp.equals("O")) compara = 9;
                if (qevcomp.equals("(")) compara = 10;
                if (qevcomp.equals(")")) compara = 11;
                insertEtiq("qevcomparacion",compara);
              }
              else insertEtiq("qevcomparacion","");
          insertEtiq("qevformato",squevariables.qevformato.getString().trim());
            salida.println("</registro>");
            squevariables.next();
          }
        salida.println("</quevariables>");
        salida.println("</"+nomListado+">");
      }
    
    
    public void insertEtiq(String nomEti, String contenido,int len) {
    salida.println("<"+nomEti+">"+contenido.trim()+"</"+nomEti+">");
    }
    
    public void insertEtiq(String nomEti, String valor) {
      if (valor == null || valor.trim().equals(""))
        tagbuit(nomEti);
      else
        //insertEtiq(nomEti,valor.toUpperCase(),valor.length());
    insertEtiq(nomEti,valor,valor.length());
    }
    
    public void insertEtiq(String nomEti, int valor) {
      String result=String.valueOf(valor);
      insertEtiq(nomEti,result,result.length());
    }
    
    public void insertEtiq(String nomEti, java.util.Date valor) {
      if (valor == null)
        tagbuit(nomEti);
      else {
        java.text.SimpleDateFormat formatada=new java.text.SimpleDateFormat("ddMMyyyy");
        insertEtiq(nomEti,formatada.format(valor),8);
      }
    }
    
    public void tagbuit(String nomEti) {
    salida.println("<"+nomEti+"></"+nomEti+">");
    }
    
    public boolean obreFitXML() {
    try {
    fileXML=new java.io.File(destino+FITCERTIF);
    write=new java.io.FileOutputStream(fileXML);
    salida=new java.io.PrintWriter(write);
    return true;
    }
    catch(java.io.IOException e ){
    fnError(" Error en funcion obreFitXML : "+e);
    }
    catch(Exception e2 )  {
    fnError(" Error en funcion obreFitXML : "+e2);
    }
    return false;
    }
    
    public void tancaFitXML() {
    try {
    if (salida!=null) salida.close();
    if (write!=null) write.close();
    }
    catch(java.io.IOException e )  { error+=" Error en funcion tancaFitXML : "+e; }
    catch(Exception e2 )  {  error+=" Error en funcion tancaFitXML : "+e2; }
    }
    
    public boolean fnError(String err) {
    error+= err+"\n";
    System.out.println("**** E R R O R **** "+error+" **** E R R O R ****");
    return false;
    }
    
    public boolean  creaDirect(String ruta)  {
      boolean retorn=true;
      try {
      java.io.File direct=new java.io.File(ruta);
      if (!direct.isDirectory()) {
        if (!direct.mkdirs()) {
          System.out.println("No se ha podido crear la ruta:"+ruta);
            retorn=false;
          }
        }
      }
      catch(Exception e) {
        System.out.println("error al crear directorio: "+e);
        retorn=false;
        }
      return retorn;
      }
    
    public void importaXML() {
      boolean continua = true;
      org.w3c.dom.Element reg;
      org.w3c.dom.NodeList registro;
      try {
        inicializaImp();
        //columnas = doc.getElementsByTagName("listadojNOMINA");
        //if(columnas.getLength()==0) {
    // TOCAT PER JEO
        String nomListado="listadojNOMINA";
        if (aplicacion.equals("JEO")) nomListado="listadojEO";
        if (aplicacion.equals("JMODELOS")) nomListado="listadojMODELOS";
    
        if(!doc.getDocumentElement().getNodeName().equals(nomListado)) {
          Maefc.message("Error: el archivo " + fileImpXML.getName() +" no contiene ningun listado a importar","Validación de Datos",Maefc.ERROR_MESSAGE);
        }
        else {
        columnas = doc.getElementsByTagName("quefrase");
        for (int s = 0; s<columnas.getLength();s++) {
          fstNode = columnas.item(s);
          if (fstNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
            sprueba.setWhere("qefaplicacion = '" + getTag("qefaplicacion") + "' and qeffrase = '" + getTag("qeffrase") + "'" );
            sprueba.execute();
            if(sprueba.isEof()) {
              sprueba.addNew();
              sprueba.qefaplicacion.setValue(getTag("qefaplicacion"));
              //System.out.println(getTag("qefaplicacion"));
              sprueba.qeffrase.setValue(getTag("qeffrase"));
              sprueba.qefdescripcion.setValue(getTag("qefdescripcion"));
              sprueba.qefmaster.setValue(getTag("qefmaster"));
          sprueba.qeftitulo.setValue(getTag("qeftitulo"));
          sprueba.qefapaisado.setValue(getTag("qefapaisado"));
          sprueba.qefletra.setValue(getTag("qefletra"));
          sprueba.qefpaginado.setValue(getTag("qefpaginado"));
          sprueba.qeffrom.setValue(getTag("qeffrom"));
          sprueba.qefwhere.setValue(getTag("qefwhere"));
          sprueba.qefect.setValue(getTag("qefect"));
              sprueba.qefrepetir.setValue(getTag("qefrepetir"));
              sprueba.insert();
              sprueba.commit();
            }
            else  {
              Maefc.message("Error: El listado que intenta importar ya existe","Validación de Datos",Maefc.ERROR_MESSAGE);
              continua = false;
            }   
          }
        }
        if (continua) {
        columnas = doc.getElementsByTagName("quecolumn"); 
        for (int s = 0; s<columnas.getLength();s++) {
          org.w3c.dom.Node qcol = columnas.item(s);
          if (qcol.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
            reg = (org.w3c.dom.Element) qcol;
            registro = reg.getElementsByTagName("registro");
            for (int d = 0; d<registro.getLength();d++) {
              fstNode = registro.item(d);
              if (fstNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                squecolumn.addNew();
                squecolumn.qecaplicacion.setValue(getTag("qecaplicacion"));
                squecolumn.qecfrase.setValue(getTag("qecfrase"));
                squecolumn.qecorden.setValue(getTag("qecorden"));
                squecolumn.qeccampo.setValue(getTag("qeccampo"));
                squecolumn.qectitulo.setValue(getTag("qectitulo"));
                squecolumn.qeclongitud.setValue(getTag("qeclongitud"));
                squecolumn.qectipo.setValue(getTag("qectipo"));
                squecolumn.qectabla.setValue(getTag("qectabla"));
                squecolumn.qecvisible.setValue(getTag("qecvisible"));
                squecolumn.qecrestriccion.setValue(getTag("qecrestriccion"));
                squecolumn.qecorderby.setValue(getTag("qecorderby"));
                squecolumn.qecacumula.setValue(getTag("qecacumula"));
                squecolumn.qecsaltapag.setValue(getTag("qecsaltapag"));
                squecolumn.qecinipag.setValue(getTag("qecinipag"));     
                squecolumn.qecformato.setValue(getTag("qecformato"));
                squecolumn.qecbbdd.setValue(getTag("qecbbdd"));
                squecolumn.insert();
                squecolumn.commit();
              }
            }
          }
        }
        columnas = doc.getElementsByTagName("quetabla");
        for (int s = 0; s<columnas.getLength();s++) {
          org.w3c.dom.Node qtab = columnas.item(s);
          if (qtab.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
            reg = (org.w3c.dom.Element) qtab;
            registro = reg.getElementsByTagName("registro");
            for (int d = 0; d<registro.getLength();d++) {
              fstNode = registro.item(d);
              if (fstNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                squetabla.addNew();
                squetabla.qetaplicacion.setValue(getTag("qetaplicacion"));
                squetabla.qetfrase.setValue(getTag("qetfrase"));
            squetabla.qetorden.setValue(getTag("qetorden"));
            squetabla.qettabla.setValue(getTag("qettabla"));
            squetabla.qetbbdd.setValue(getTag("qetbbdd"));
            squetabla.qetrelacion.setValue(getTag("qetrelacion"));
                squetabla.insert();
                squetabla.commit();
              }
            }
          }
        }
        columnas = doc.getElementsByTagName("quevariables");
        for (int s = 0; s<columnas.getLength();s++) {
          org.w3c.dom.Node qvar = columnas.item(s);
          if (qvar.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
            reg = (org.w3c.dom.Element) qvar;
            registro = reg.getElementsByTagName("registro");
            for (int d = 0; d<registro.getLength();d++) {
              fstNode = registro.item(d);
              if (fstNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                squevariables.addNew();
                squevariables.qevaplicacion.setValue(getTag("qevaplicacion"));
                squevariables.qevfrase.setValue(getTag("qevfrase"));
            squevariables.qevorden.setValue(getTag("qevorden"));
            squevariables.qevvariable.setValue(getTag("qevvariable"));
                squevariables.qevtipo.setValue(getTag("qevtipo"));
            squevariables.qevlongitud.setValue(getTag("qevlongitud"));
                squevariables.qevtitulo.setValue(getTag("qevtitulo"));
            squevariables.qevobligatorio.setValue(getTag("qevobligatorio"));
            squevariables.qevpredef.setValue(getTag("qevpredef"));
            squevariables.qevvalor.setValue(getTag("qevvalor"));
            squevariables.qevvisible.setValue(getTag("qevvisible"));
                if(getTag("qevcomparacion") != null) {
                  switch (Integer.parseInt(getTag("qevcomparacion"))) {
                    case 0: squevariables.qevcomparacion.setValue("="); break;
                    case 1: squevariables.qevcomparacion.setValue("=="); break;
                case 2: squevariables.qevcomparacion.setValue(">="); break;
                case 3: squevariables.qevcomparacion.setValue("<="); break;
                case 4: squevariables.qevcomparacion.setValue("<>"); break;
                case 5: squevariables.qevcomparacion.setValue(">"); break;
                case 6: squevariables.qevcomparacion.setValue("<"); break;
                    case 7: squevariables.qevcomparacion.setValue("L"); break;
                    case 8: squevariables.qevcomparacion.setValue("Y"); break;
                    case 9: squevariables.qevcomparacion.setValue("O"); break;
                    case 10: squevariables.qevcomparacion.setValue("("); break;
                    case 11: squevariables.qevcomparacion.setValue(")"); break;
                    default:squevariables.qevcomparacion.setNull(); break;
                  }
                }
                else
              squevariables.qevcomparacion.setValue(getTag("qevcomparacion"));
            squevariables.qevformato.setValue(getTag("qevformato"));
                squevariables.insert();
                squevariables.commit();
              }
            }
          }
        }
        Maefc.message("El listado \"" + fileImpXML.getName() +"\" se ha importado con éxito.","Validación de Datos",Maefc.INFORMATION_MESSAGE);
        }
       }
      } catch (org.xml.sax.SAXException sxe) {
        // Error generated during parsing
        Exception  x = sxe;
        if (sxe.getException() != null)
          x = sxe.getException();
        x.printStackTrace();
    
      } catch (javax.xml.parsers.ParserConfigurationException pce) {
        // Parser with specified options can't be built
        pce.printStackTrace();
    
      } catch (java.io.IOException ioe) {
        // I/O error
        ioe.printStackTrace();
      }
    
    }
    
    public void inicializaImp () throws org.xml.sax.SAXException,java.io.IOException, javax.xml.parsers.ParserConfigurationException{
      
      dbf = javax.xml.parsers.DocumentBuilderFactory.newInstance();
      db = dbf.newDocumentBuilder();
      doc = db.parse(fileImpXML);
      doc.getDocumentElement().normalize();
    }
    
    public String getTag(String tag) throws org.xml.sax.SAXException{
      //String retorn="";
      org.w3c.dom.Element firstElement = (org.w3c.dom.Element)fstNode;
    
      org.w3c.dom.NodeList firstTagList = firstElement.getElementsByTagName(tag);
      org.w3c.dom.Element firstTagElement = (org.w3c.dom.Element)firstTagList.item(0);
      org.w3c.dom.NodeList contingut = firstTagElement.getChildNodes();
      if (contingut.getLength() != 0) 
        //retorn = ((org.w3c.dom.Node)contingut.item(0)).getNodeValue().trim();
        return ((org.w3c.dom.Node)contingut.item(0)).getNodeValue().trim();
      else return null;
    }
    
    public String getExtension(java.io.File f) {
      if(f != null) {
        String filename = f.getName();
        int i = filename.lastIndexOf('.');
        if(i>0 && i<filename.length()-1) {
        return filename.substring(i+1).toLowerCase();
        };
      }
      return null;
    }
    
    public boolean parserSQL() {
      int estado = 1;
      int numParen = 0;
      boolean checkParen = true;
      Selector sqvar = new Selector (getDataBase());
      sqvar.execute("select * from quevariables where qevaplicacion='"+aplicacion+"' and qevfrase='"+qeffrase.getString()+"' order by qevorden");
      while (sqvar.next()) {
        String comparacion = sqvar.getString("qevcomparacion");
        if ( !comparacion.equals("Y") && !comparacion.equals("O") && !comparacion.equals("(") && !comparacion.equals(")")) {
          comparacion = "cond";
          }
        if (estado == 1) {
          if(comparacion.equals("cond")) {
            estado= 2;
            }
          else if(comparacion.equals("(")) {
            estado = 4;
            numParen++;
            checkParen = false;
            }
          else {        
            return false;
            }
          }
        else if (estado == 2) {
          if(comparacion.equals("cond"))  estado = 2;
          else if(comparacion.equals("Y") || comparacion.equals("O")) estado = 3;
          else {
            return false;
            }
          }
        else if (estado == 3) {
          if(comparacion.equals("cond")) {
            estado= 2;
            }
          else if(comparacion.equals("(")) {
            estado = 4;
            numParen++;
            checkParen = false;
            }
          else {        
            return false;
            }
          }
        else if (estado == 4) {
          if(comparacion.equals("cond"))  estado = 5;
          else if(comparacion.equals("(")) {
            estado = 4;
            numParen++;
            }
          else {
            return false;
            }
          }
        else if (estado == 5) {
          if(comparacion.equals("cond"))  estado = 5;
          else if(comparacion.equals("Y") || comparacion.equals("O")) { 
            estado = 6;
            checkParen = true;
            }
          else if(comparacion.equals(")")) {
            estado = 7;
            numParen--;
            }
          else {
            return false;
            }
          }
        else if (estado == 6) {
          if(comparacion.equals("cond")) {
            //estado= 5;
            estado= 7;
            }
          else if(comparacion.equals("(")) {
            estado = 6;
            numParen++;
            checkParen = false;
            }
          else {        
            return false;
            }
          }
        else if (estado == 7) {
          if(comparacion.equals("cond"))  estado = 7;
          else if(comparacion.equals(")")) {
            estado = 7;
            numParen--;
            }
          else if(comparacion.equals("Y") || comparacion.equals("O")) {
            estado = 6;
            checkParen = true;
            }
          }
        }
      switch (estado) {
        case 1: return true;
        case 2: 
          return true; 
        case 7: 
          if (checkParen) {
            if (numParen == 0) return true;
            else {
              return false;
              }
            }
          else {
            return false;
            }
        default: return false;
        }
      }
    
    
    
    
    
    // Fin declaraciones globales
    // Controles
    public CtrlQeffrase qeffrase;
    public CtrlQefdescripcion qefdescripcion;
    // Acciones
    public LinkAclistar aclistar;
    public LinkAcdup acdup;
    public LinkAcimportar acimportar;
    public LinkAcexportar acexportar;
    class Location extends LocationBorder
      {
      public Location( )
        {
        super();
        }
      }
      
    public class CtrlQeffrase extends ColumnEdit
      {
      public CtrlQeffrase(Form form)
        {
        super(form);
        setName("qeffrase");
        setMessageHelp("Nombre referencia del listado");
        setTitle("Código");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setPrintable(false);
        setField(squery.qeffrase);
        }
      }
      
    public class CtrlQefdescripcion extends ColumnEdit
      {
      public CtrlQefdescripcion(Form form)
        {
        super(form);
        setName("qefdescripcion");
        setMessageHelp("Descripción del listado");
        setTitle("Descripción");
        setType(STRING);
        setLength(80);
        setSearchable(true);
        setPrintable(false);
        setField(squery.qefdescripcion);
        }
      }
      
    public class LinkAclistar extends Action
      {
      public LinkAclistar(Form form)
        {
        super(form);
        setName("aclistar");
        setTitle("&1 - Listar");
        setOptions(SHOW);
        }
      public void onAction()
        {
        if (parserSQL() == false) {
          Maefc.message("Se han encontrado errores en el procesamiento \nde las variables, por favor revíselas","Procesamiento de variables",Maefc.ERROR_MESSAGE, Maefc.OK_OPTION);
          //this.doShow();
          }
        else {
        super.onAction();
        
        frase=llegeixFrase(qeffrase.getString());
        
        if (!demanarParametres()) 
          return;
        
        seleccio=new Seleccio();
        
        seleccio.inicia();
        if (seleccio.quorelacioPrincipal.eof) {
          Maefc.message("No se ha encontrado información que cumple con la selección efectuada");
          return;
          }
        
        Inflistado listado=new Inflistado(querylis);
        listado.setNewPrintingSystem(true);
        String xml=creaXML();
        
        for(int i=0;i<frase.columnes.size();i++) {
            Columna col=(Columna)frase.columnes.elementAt(i);
            if (col.visible) {
              col.reportData=new ReportData(listado);
              col.reportData.setType(col.tipus);
              /* Aixo cal fer-ho a la plantilla ya que per excel es diferent
              if (col.format!=null) 
                col.reportData.setFormat(col.format);
              */        
              col.reportData.setLength(col.llarg);
              listado.addReportData(col.reportData);
              }
            }
        
        for(int i=0;i<frase.columnes.size();i++) {
            Columna col=(Columna)frase.columnes.elementAt(i);
            if (col.visible && col.acumula) {
              col.reportDataTotal=new ReportData(listado);
              col.reportDataTotal.setType(col.tipus);
              /* Aixo cal fer-ho a la plantilla ya que per excel es diferent
              if (col.format!=null) 
                col.reportDataTotal.setFormat(col.format);
              */ 
              col.reportDataTotal.setLength(col.llarg);
              listado.addReportData(col.reportDataTotal);
              }
            }
        
        try {
            java.io.StringBufferInputStream in=new java.io.StringBufferInputStream(xml);
            listado.setXmlDocument(com.sun.xml.tree.XmlDocument.createXmlDocument(in,false));
        
            PrintWork work=new PrintWork(true) {
              public void init(PrintOutput out) {
                super.init(out);
                if (out instanceof PrintExcel) {
                  PrintExcel excel=(PrintExcel)out;
                   try {
                     StringBuffer buffer=new StringBuffer();
                     java.io.BufferedReader in=new java.io.BufferedReader(new java.io.InputStreamReader(ClassLoader.getSystemResourceAsStream("mae/easp/vbs/query.vbs")));
                     String line;
                     while((line=in.readLine())!=null) {
                       buffer.append(line);
                       buffer.append('\n');
                     }
                     excel.script=buffer.toString();
                     excel.destino=System.getProperty("user.dir")+"\\resultado.xls";
                     excel.plantilla=System.getProperty("user.dir")+"\\plantillas\\query.xls";
                     }
                   catch(Exception ex) {
                     ErrorManagerDefault.generalEx(ex,"No ha sido posible obtener el script de generación archivo Excel");
                     return;
                     }
                  }
                }
            };
        
            work.add(listado);
            work.dialog(querylis);
            }
        catch(org.xml.sax.SAXException ex) {
            Maefc.message("No ha sido posible ejecutar este listado: "+ex.getMessage());
            ex.printStackTrace();
            }
        catch(java.io.IOException ex) {
          Maefc.message("No ha sido posible ejecutar este listado");
          }
        }
        
        }
      }
      
    public class LinkAcdup extends Action
      {
      public LinkAcdup(Form form)
        {
        super(form);
        setName("acdup");
        setTitle("&2 - Duplicar");
        setOptions(SHOW);
        }
      public void onAction()
        {
        Selector sdup = new Selector(getDataBase());
        sdup.execute("select  * from quefrase where qefaplicacion = '" + aplicacion + "' and qeffrase = '" + qeffrase.getString() + "'");
        
        if (sdup.next()) {
          //sprueba.setWhere("qefaplicacion = '" + aplicacion + "' and qeffrase = '" + qeffrase.getString() + "'");
          //sprueba.execute();
          vduplic.setLayout(new LayoutHtml("mae/easp/html/vduplicados.html"));
          vduplic.vvqeffrase.setValue(qeffrase.getString());
          vduplic.vvqefdescripcio.setValue(qefdescripcion.getString());
          vduplic.vvcodigo.setNull();
          vduplic.vvdesc.setNull();
          vduplic.open();
        
          }
        sdup.close();
        
        doShow();
        super.onAction();
        
        }
      }
      
    public class LinkAcimportar extends Action
      {
      public LinkAcimportar(Form form)
        {
        super(form);
        setName("acimportar");
        setTitle("&3 - Importar");
        setOptions(SHOW);
        }
      public void onAction()
        {
        java.awt.FileDialog  dlg=new java.awt.FileDialog(geyce.maefc.swing.WSystemView.getFrame(),"Abrir listado",java.awt.FileDialog.LOAD);
        // TOCAT PER JEO
        dlg.setDirectory(System.getProperty("user.dir")+"\\"+nomDirec+"\\");
        dlg.setVisible(true);
        if (dlg.getFile()!=null) {
          destino = dlg.getDirectory();
          FICHIMPORTA = destino+dlg.getFile();
          fileImpXML = new java.io.File(FICHIMPORTA);
          if (!getExtension(fileImpXML).equals("xml"))
            Maefc.message("Error: el archivo " + fileImpXML.getName() +" no es xml","Validación de Datos",Maefc.ERROR_MESSAGE);
          else {
            importaXML();    
          }
        }
        //squery.execute();
        doShow();
        super.onAction();
        
        }
      }
      
    public class LinkAcexportar extends Action
      {
      public LinkAcexportar(Form form)
        {
        super(form);
        setName("acexportar");
        setTitle("&4 - Exportar");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        java.awt.FileDialog  dlg=new java.awt.FileDialog(geyce.maefc.swing.WSystemView.getFrame(),"Guardar listado",java.awt.FileDialog.SAVE);
        // TOCAT PER JEO
        dlg.setDirectory(System.getProperty("user.dir")+"\\"+nomDirec+"\\");
        dlg.setFile(qeffrase.getString().trim()+"List"+".xml");
        dlg.setVisible(true);
        destino = dlg.getDirectory();
        FITCERTIF = dlg.getFile();
        //sprueba.execute();
        exportaXML();
        
        
        doShow();
        
        }
      }
      
    public FormVseleccion(ProgQuerylis querylis)
      {
      super(querylis);
      setName("vseleccion");
      setTitle("Selección de Listado");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
      addSelect(squery=new Squery());
      addSelect(sprueba=new Sprueba());
      addSelect(squecolumn=new Squecolumn());
      addSelect(squetabla=new Squetabla());
      addSelect(squevariables=new Squevariables());
      addControl(qeffrase=new CtrlQeffrase(this));
      addControl(qefdescripcion=new CtrlQefdescripcion(this));
      addAction(aclistar=new LinkAclistar(this));
      addAction(acdup=new LinkAcdup(this));
      addAction(acimportar=new LinkAcimportar(this));
      addAction(acexportar=new LinkAcexportar(this));
      setSelect(squery);
      }
    public void onInit()
      {
      setInitState(SHOW);
      super.onInit();
      }
    }
    
  // Selección de frases
  public class Squery extends Select
    {
    // Tablas
    public Quefrase quefrase;
    // Campos
    public Field qefapaisado;
    public Field qefaplicacion;
    public Field qefdescripcion;
    public Field qeffrase;
    public Field qefletra;
    public Field qefmaster;
    public Field qefpaginado;
    public Field qefrepetir;
    public Field qeftitulo;
    class Quefrase extends Table
      {
      public Quefrase(Select select)
        {
        super(select);
        setName("quefrase");
        setOptions(READ);
        }
      }
      
    public Squery()
      {
      setName("squery");
      addTable(quefrase=new Quefrase(this));
      addField(qefapaisado=new Field(this,quefrase,"qefapaisado"));
      addField(qefaplicacion=new Field(this,quefrase,"qefaplicacion"));
      addField(qefdescripcion=new Field(this,quefrase,"qefdescripcion"));
      addField(qeffrase=new Field(this,quefrase,"qeffrase"));
      addField(qefletra=new Field(this,quefrase,"qefletra"));
      addField(qefmaster=new Field(this,quefrase,"qefmaster"));
      addField(qefpaginado=new Field(this,quefrase,"qefpaginado"));
      addField(qefrepetir=new Field(this,quefrase,"qefrepetir"));
      addField(qeftitulo=new Field(this,quefrase,"qeftitulo"));
      }
    public String getWhere()
      {
      return "qefaplicacion='"+aplicacion+"'";
      }
    public String getOrder()
      {
      switch(ordenacion) {
      case 2:
          return "qefdescripcion,qeffrase";
      }
      return "qeffrase";
      }
    }
    
  // select duplicado
  public class Sprueba extends Select
    {
    // Tablas
    public Quefrase quefrase;
    // Campos
    public Field qefapaisado;
    public Field qefaplicacion;
    public Field qefdescripcion;
    public Field qefect;
    public Field qeffrase;
    public Field qeffrom;
    public Field qefletra;
    public Field qefmaster;
    public Field qefpaginado;
    public Field qefrepetir;
    public Field qeftitulo;
    public Field qefwhere;
    class Quefrase extends Table
      {
      public Quefrase(Select select)
        {
        super(select);
        setName("quefrase");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sprueba()
      {
      setName("sprueba");
      addTable(quefrase=new Quefrase(this));
      addField(qefapaisado=new Field(this,quefrase,"qefapaisado"));
      addField(qefaplicacion=new Field(this,quefrase,"qefaplicacion"));
      addField(qefdescripcion=new Field(this,quefrase,"qefdescripcion"));
      addField(qefect=new Field(this,quefrase,"qefect"));
      addField(qeffrase=new Field(this,quefrase,"qeffrase"));
      addField(qeffrom=new Field(this,quefrase,"qeffrom"));
      addField(qefletra=new Field(this,quefrase,"qefletra"));
      addField(qefmaster=new Field(this,quefrase,"qefmaster"));
      addField(qefpaginado=new Field(this,quefrase,"qefpaginado"));
      addField(qefrepetir=new Field(this,quefrase,"qefrepetir"));
      addField(qeftitulo=new Field(this,quefrase,"qeftitulo"));
      addField(qefwhere=new Field(this,quefrase,"qefwhere"));
      }
    public String getWhere()
      {
      return "qefaplicacion = '" + aplicacion + "' and qeffrase = '" + vseleccion.qeffrase.getString() + "'";
      }
    }
    
  // select importar exportar
  public class Squecolumn extends Select
    {
    // Tablas
    public Quecolumn quecolumn;
    // Campos
    public Field qecacumula;
    public Field qecaplicacion;
    public Field qecbbdd;
    public Field qeccampo;
    public Field qecformato;
    public Field qecfrase;
    public Field qecinipag;
    public Field qeclongitud;
    public Field qecorden;
    public Field qecorderby;
    public Field qecrestriccion;
    public Field qecsaltapag;
    public Field qectabla;
    public Field qectipo;
    public Field qectitulo;
    public Field qecvisible;
    class Quecolumn extends Table
      {
      public Quecolumn(Select select)
        {
        super(select);
        setName("quecolumn");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Squecolumn()
      {
      setName("squecolumn");
      addTable(quecolumn=new Quecolumn(this));
      addField(qecacumula=new Field(this,quecolumn,"qecacumula"));
      addField(qecaplicacion=new Field(this,quecolumn,"qecaplicacion"));
      addField(qecbbdd=new Field(this,quecolumn,"qecbbdd"));
      addField(qeccampo=new Field(this,quecolumn,"qeccampo"));
      addField(qecformato=new Field(this,quecolumn,"qecformato"));
      addField(qecfrase=new Field(this,quecolumn,"qecfrase"));
      addField(qecinipag=new Field(this,quecolumn,"qecinipag"));
      addField(qeclongitud=new Field(this,quecolumn,"qeclongitud"));
      addField(qecorden=new Field(this,quecolumn,"qecorden"));
      addField(qecorderby=new Field(this,quecolumn,"qecorderby"));
      addField(qecrestriccion=new Field(this,quecolumn,"qecrestriccion"));
      addField(qecsaltapag=new Field(this,quecolumn,"qecsaltapag"));
      addField(qectabla=new Field(this,quecolumn,"qectabla"));
      addField(qectipo=new Field(this,quecolumn,"qectipo"));
      addField(qectitulo=new Field(this,quecolumn,"qectitulo"));
      addField(qecvisible=new Field(this,quecolumn,"qecvisible"));
      }
    public String getWhere()
      {
      return "qecaplicacion = '" + aplicacion + "' and qecfrase = '" + vseleccion.qeffrase.getString() + "'";
      }
    }
    
  // 
  public class Squetabla extends Select
    {
    // Tablas
    public Quetabla quetabla;
    // Campos
    public Field qetaplicacion;
    public Field qetbbdd;
    public Field qetfrase;
    public Field qetorden;
    public Field qetrelacion;
    public Field qettabla;
    class Quetabla extends Table
      {
      public Quetabla(Select select)
        {
        super(select);
        setName("quetabla");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Squetabla()
      {
      setName("squetabla");
      addTable(quetabla=new Quetabla(this));
      addField(qetaplicacion=new Field(this,quetabla,"qetaplicacion"));
      addField(qetbbdd=new Field(this,quetabla,"qetbbdd"));
      addField(qetfrase=new Field(this,quetabla,"qetfrase"));
      addField(qetorden=new Field(this,quetabla,"qetorden"));
      addField(qetrelacion=new Field(this,quetabla,"qetrelacion"));
      addField(qettabla=new Field(this,quetabla,"qettabla"));
      }
    public String getWhere()
      {
      return "qetaplicacion = '" + aplicacion + "' and qetfrase = '" + vseleccion.qeffrase.getString() + "'";
      }
    }
    
  // 
  public class Squevariables extends Select
    {
    // Tablas
    public Quevariables quevariables;
    // Campos
    public Field qevaplicacion;
    public Field qevcomparacion;
    public Field qevformato;
    public Field qevfrase;
    public Field qevlongitud;
    public Field qevobligatorio;
    public Field qevorden;
    public Field qevpredef;
    public Field qevtipo;
    public Field qevtitulo;
    public Field qevvalor;
    public Field qevvariable;
    public Field qevvisible;
    class Quevariables extends Table
      {
      public Quevariables(Select select)
        {
        super(select);
        setName("quevariables");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Squevariables()
      {
      setName("squevariables");
      addTable(quevariables=new Quevariables(this));
      addField(qevaplicacion=new Field(this,quevariables,"qevaplicacion"));
      addField(qevcomparacion=new Field(this,quevariables,"qevcomparacion"));
      addField(qevformato=new Field(this,quevariables,"qevformato"));
      addField(qevfrase=new Field(this,quevariables,"qevfrase"));
      addField(qevlongitud=new Field(this,quevariables,"qevlongitud"));
      addField(qevobligatorio=new Field(this,quevariables,"qevobligatorio"));
      addField(qevorden=new Field(this,quevariables,"qevorden"));
      addField(qevpredef=new Field(this,quevariables,"qevpredef"));
      addField(qevtipo=new Field(this,quevariables,"qevtipo"));
      addField(qevtitulo=new Field(this,quevariables,"qevtitulo"));
      addField(qevvalor=new Field(this,quevariables,"qevvalor"));
      addField(qevvariable=new Field(this,quevariables,"qevvariable"));
      addField(qevvisible=new Field(this,quevariables,"qevvisible"));
      }
    public String getWhere()
      {
      return "qevaplicacion = '" + aplicacion + "' and qevfrase = '" + vseleccion.qeffrase.getString() + "'";
      }
    }
    
  // Informe Listado
  class Inflistado extends Report
    {
    // Datos
    public Inflistado(ProgQuerylis querylis)
      {
      super(querylis);
      setName("inflistado");
      setTitle("Listado");
      }
    public boolean onRecord()
      {
      super.onRecord();
      boolean retorn=false;
      switch(this.getNumBloc()) {
        case 1: // Bloc General per treballador/empresa
          if (seleccio.quorelacioPrincipal.eof)
            retorn=false;
          else { 
            asignarCamps();
            seleccio.next();
            canvis();
            retorn=true;
            }
          break;
        case 2: // si ha de saltar pagina o no
          for(int i=0;i<frase.columnes.size();i++) {
              Columna col=(Columna)frase.columnes.elementAt(i);
              if (col.saltapag && col.canviat) {
                  retorn=true;
                  if (col.inipag) setPageNumber(0);
                  break;
                  }
              }
          break;
        }
      return retorn;
      
      }
    }
    
  public class FormVparam extends ProcessForm
    {
    // Inicio declaraciones globales
    boolean ok=false; // per saber si ha punxat Llistar
    
    public ControlPanel panel;
    // TOCAT PER JEO
    mae.laboral.datselec.ProgDatselec prcon=null;
    
    mae.jeo.datselec.ProgDatselec prconJeo=null;
    
    mae.modasp.datselec.ProgDatselec prconJmodelos=null;
    
    
    // Fin declaraciones globales
    // Controles
    // Acciones
    public LinkAcimprimir acimprimir;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setTitle("Parámetros listado");
        setModal(true);
        }
      }
      
    public class LinkAcimprimir extends Action
      {
      public LinkAcimprimir(Form form)
        {
        super(form);
        setName("acimprimir");
        setTitle("&1 - Imprimir");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        }
        
        public void doAction() {
          FormVparam.this.ok=true;
          FormVparam.this.exit();
        }
      }
      
    public FormVparam(ProgQuerylis querylis)
      {
      super(querylis);
      setName("vparam");
      setTitle("Parámetros listado");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addAction(acimprimir=new LinkAcimprimir(this));
      }
    public void onInit()
      {
        panel=new ControlPanel(this);
        panel.setLayout(new LayoutAligned());
      
        for(int i=0;i<frase.variables.size();i++) {
          final Variable v=(Variable)frase.variables.elementAt(i);
          if (v.visible) {
              ControlEdit ctrl=new ControlEdit(panel) {
                  public Object getDefault() {
                      return v.valor.getObject();
                      }
                  public void userChange(Value val) {
                      super.userChange(val);
                      v.valor.setValue(val);
                      }
                  };
              ctrl.setName(v.nom);
              ctrl.setType(v.tipus);
              ctrl.setLength(v.longitut);
              ctrl.setTitle(v.titol);
              ctrl.setObligate(v.obligatori);
              ctrl.setMaskInput(v.format);
              }
          }
      
        LocationWindow loc=(LocationWindow)getLocation();
      
        prcon=null;
        prconJeo=null;
        prconJmodelos = null;
        int assigno=0;
      // TOCAT PER JEO
        if (aplicacion.equals("JEO")) {
           if ("E".equals(frase.ect) || "A".equals(frase.ect) || "M".equals(frase.ect)) {
              assigno=1;
              loc.setHeight(75+200);
              ControlPanel panel2=new ControlPanel(this);
              panel2.setLayout(new LayoutBorder());
              panel2.setParent(this);
      
              setLayout(new LayoutSplit(LayoutSplit.VERTICAL));
              prconJeo=new mae.jeo.datselec.ProgDatselec();
              panel.setLocation(new LocationSplit(LocationSplit.LEFT));
              prconJeo.setConnection(getDataBase());
              panel2.setLocation(new LocationSplit(LocationSplit.RIGHT));
              prconJeo.setParent(panel2);
              if ("A".equals(frase.ect))
                 prconJeo.porEA='A';
              else 
                 prconJeo.porEA='E';
      
              prconJeo.borrarSeleccionado = true;
              prconJeo.gejer=mae.jeo.general.Jeo.gEjercicio;
              prconJeo.gprograma="QUERY";
              prconJeo.desactivaLimpiar=true;
              prconJeo.setLocation(LocationBorder.locationBorderCenter);
           }
        }
        else if (aplicacion.equals("JMODELOS")) {
          assigno=1;
          loc.setHeight(75+200);
          ControlPanel panel2=new ControlPanel(this);
          panel2.setLayout(new LayoutBorder());
          panel2.setParent(this);
      
          setLayout(new LayoutSplit(LayoutSplit.VERTICAL));
          prconJmodelos=new mae.modasp.datselec.ProgDatselec();
          panel.setLocation(new LocationSplit(LocationSplit.LEFT));
          prconJmodelos.setConnection(getDataBase());
          panel2.setLocation(new LocationSplit(LocationSplit.RIGHT));
          prconJmodelos.setParent(panel2);
      
          prconJmodelos.borrarSeleccionado = true;
          prconJmodelos.gprograma="QUERY";
          prconJmodelos.desactivaLimpiar=true;
          prconJmodelos.setLocation(LocationBorder.locationBorderCenter);    
        }
        else {
          if ("E".equals(frase.ect) || "C".equals(frase.ect) || "T".equals(frase.ect)) {
              assigno=1;
          //loc.setHeight(frase.variables.size()*15+200);
              loc.setHeight(75+200);
      
              ControlPanel panel2=new ControlPanel(this);
              panel2.setLayout(new LayoutBorder());
              panel2.setParent(this);
      
              setLayout(new LayoutSplit(LayoutSplit.VERTICAL));
              prcon=new mae.laboral.datselec.ProgDatselec();
              panel.setLocation(new LocationSplit(LocationSplit.LEFT));
              prcon.setConnection(getDataBase());
              panel2.setLocation(new LocationSplit(LocationSplit.RIGHT));
              prcon.setParent(panel2);
              prcon.gprograma="QUERY";
              prcon.porECT=frase.ect.charAt(0);
              prcon.setLocation(LocationBorder.locationBorderCenter);
          }
        }
        if (assigno==0)
           loc.setHeight(frase.variables.size()*15+140);
      
        loc.setWidth(700);
      
        super.onInit();
      
        if (prcon!=null) prcon.run();
        if (prconJeo!=null) prconJeo.run();
        if (prconJmodelos!=null) prconJmodelos.run();
      
      }
    }
    
  public class FormVduplic extends ProcessForm
    {
    // Inicio declaraciones globales
    public boolean testeoDuplic (String codigo) {
      boolean retorn = true;
      squery.execute();
      while(squery.next()) {
        if(codigo.toUpperCase().trim().equals(squery.qeffrase.getString().toUpperCase().trim())) retorn = false;
      }
    return retorn;
    }
    
    public void duplicados(String codigo, String descripcion) throws Exception {
      int orden=0;
      Aplication.getAplication().getDataBase().executeUpdate(
            "insert into quefrase" + 
            "( qefaplicacion,qeffrase,qefdescripcion,qefmaster,qeftitulo,qefapaisado,qefletra,qefpaginado,qeffrom,qefwhere,qefect,qefrepetir )"+ 
            "select qefaplicacion,'" + codigo + "' as expr1 ,'" + descripcion + "' as expr2,"+
            "qefmaster,qeftitulo,qefapaisado,qefletra,qefpaginado,qeffrom,qefwhere,qefect,qefrepetir from quefrase where  "+
            "qeffrase = '"+ vvqeffrase.getString() + "' and qefdescripcion = '" + vvqefdescripcio.getString() + "'");
    
      Selector sqcolumn = new Selector(Aplication.getAplication().getDataBase());
      sqcolumn.execute("SELECT * FROM quecolumn WHERE qecaplicacion = '" + aplicacion + "' and qecfrase = '" + vvqeffrase.getString() + "'");
      while(sqcolumn.next()) {
        orden = sqcolumn.getint("QECORDEN");
        Aplication.getAplication().getDataBase().executeUpdate(
            "insert into quecolumn" + 
            "( qecaplicacion,qecfrase,qecorden,qeccampo,qectitulo,qeclongitud,qectipo,qectabla,qecvisible,qecrestriccion,qecorderby,qecacumula,qecsaltapag,qecinipag,qecformato,qecbbdd)"+ 
            "select qecaplicacion,'" + codigo + "' as expr1 , qecorden,"+
            "qeccampo,qectitulo,qeclongitud,qectipo,qectabla,qecvisible,qecrestriccion,qecorderby ,qecacumula ,qecsaltapag,qecinipag,qecformato,qecbbdd from quecolumn where  "+
            "qecfrase = '"+ vvqeffrase.getString() + "' and qecorden = " + orden );
     }
     sqcolumn.close();
    
      Selector sqtabla = new Selector(Aplication.getAplication().getDataBase());
      sqtabla.execute("SELECT * FROM quetabla WHERE qetaplicacion = '" + aplicacion + "' and qetfrase = '" + vvqeffrase.getString() + "'");
      while(sqtabla.next()) {
        orden = sqtabla.getint("QETORDEN");
        Aplication.getAplication().getDataBase().executeUpdate(
            "insert into quetabla" + 
            "( qetaplicacion,qetfrase,qetorden,qettabla,qetbbdd,qetrelacion)"+ 
            "select qetaplicacion,'" + codigo + "' as expr1 , qetorden,"+
            "qettabla,qetbbdd,qetrelacion from quetabla where  "+
            "qetfrase = '"+ vvqeffrase.getString() + "' and qetorden = " + orden );
     }
     sqtabla.close();
    
      Selector sqvariable = new Selector(Aplication.getAplication().getDataBase());
      sqvariable.execute("SELECT * FROM quevariables WHERE qevaplicacion = '" + aplicacion + "' and qevfrase = '" + vvqeffrase.getString() + "'");
      while(sqvariable.next()) {
        orden = sqvariable.getint("QEVORDEN");
        Aplication.getAplication().getDataBase().executeUpdate(
            "insert into quevariables" + 
            "( qevaplicacion,qevfrase,qevorden,qevvariable,qevtipo,qevlongitud,qevtitulo,qevobligatorio,qevpredef,qevvalor,qevvisible,qevcomparacion,qevformato)"+ 
            "select qevaplicacion,'" + codigo + "' as expr1 , qevorden,"+
            "qevvariable,qevtipo,qevlongitud,qevtitulo,qevobligatorio,qevpredef,qevvalor,qevvisible,qevcomparacion,qevformato from quevariables where  "+
            "qevfrase = '"+ vvqeffrase.getString() + "' and qevorden = " + orden );
     }
     sqvariable.close();
    
     
     Aplication.getAplication().getDataBase().commit();
    
    }
    
    
    public boolean filtraXML(String texte) {
      boolean retorn = true;
      for(int i=0;i<texte.length();i++) {
        char chr=texte.charAt(i);
        switch(chr) {
          case '<':
            retorn = false;
            break;
          case '>':
            retorn = false;
            break;
    /*      case '"':
            retorn = false;
            break;
          case '\'':
            retorn = false;
            break;
          case '&':
            retorn = false;
            break;*/
          case '%':
            retorn = false;
            break;
          default:
            retorn = retorn;
          }
        }
      return retorn;
      }
    // Fin declaraciones globales
    // Controles
    public CtrlVvqeffrase vvqeffrase;
    public CtrlVvqefdescripcio vvqefdescripcio;
    public CtrlVvcodigo vvcodigo;
    public CtrlVvdesc vvdesc;
    // Acciones
    public LinkAcok acok;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(600);
        setHeight(200);
        setTitle("Duplicación de listado");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVvqeffrase extends ControlEdit
      {
      class Location extends LocationBorder
        {
        public Location( )
          {
          super();
          }
        }
        
      public CtrlVvqeffrase(Form form)
        {
        super(form);
        setLocation(new Location());
        setName("vvqeffrase");
        setTitle("");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvqefdescripcio extends ControlEdit
      {
      class Location extends LocationBorder
        {
        public Location( )
          {
          super();
          }
        }
        
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(60);
          }
        }
        
      public CtrlVvqefdescripcio(Form form)
        {
        super(form);
        setLook(new Look());
        setLocation(new Location());
        setName("vvqefdescripcio");
        setTitle("");
        setType(STRING);
        setLength(80);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvcodigo extends ControlEdit
      {
      class Location extends LocationBorder
        {
        public Location( )
          {
          super();
          }
        }
        
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setHorizontalAlignment(LEFT);
          }
        }
        
      public CtrlVvcodigo(Form form)
        {
        super(form);
        setLook(new Look());
        setLocation(new Location());
        setName("vvcodigo");
        setMessageHelp("codigo del duplicado");
        setTitle("nuevo código");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvdesc extends ControlEdit
      {
      class Location extends LocationBorder
        {
        public Location( )
          {
          super();
          }
        }
        
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setHorizontalAlignment(LEFT);
          setLength(60);
          }
        }
        
      public CtrlVvdesc(Form form)
        {
        super(form);
        setLook(new Look());
        setLocation(new Location());
        setName("vvdesc");
        setMessageHelp("descripción del duplicado");
        setTitle("nueva descripción");
        setType(STRING);
        setLength(80);
        setPrintable(false);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class LinkAcok extends Action
      {
      public LinkAcok(Form form)
        {
        super(form);
        setName("acok");
        setTitle("&1 - Aceptar");
        setOptions(SHOW);
        }
      public void onAction()
        {
        if (testeoDuplic(vvcodigo.getString()))
        {
          vduplic.exit();
          try {
            if(!filtraXML(vvcodigo.getString()) || !filtraXML(vvdesc.getString())) {
              Maefc.message("El nuevo código y la nueva descripción no pueden llevar los carácteres \"> < % \"", "Atención",Maefc.WARNING_MESSAGE);  
              vduplic.open();
            }
            else {
              if((Maefc.message("Se dispone a duplicar el listado \"" + vvqeffrase.getString() + "\"\n" +
                          "con el nuevo código \"" + vvcodigo.getString() + "\". ¿Está seguro?","Aviso",Maefc.INFORMATION_MESSAGE,Maefc.YES_NO_OPTION)) == Maefc.YES_OPTION ) {
                duplicados(vvcodigo.getString(),vvdesc.getString());
              }
              else vduplic.open();
            }
          }
          catch(Exception e ) {
            System.out.println ("Error ["+e+"]");
          }
        }
        else {
          Maefc.message("Ya existe un  código en la lista igual que el duplicado, por favor, escriba otro código", "Error",Maefc.ERROR_MESSAGE);  
        }
        super.onAction();
        
        }
      }
      
    public FormVduplic(ProgQuerylis querylis)
      {
      super(querylis);
      setName("vduplic");
      setTitle("Duplicación de listado");
      setLayout(new LayoutBorder());
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addControl(vvqeffrase=new CtrlVvqeffrase(this));
      addControl(vvqefdescripcio=new CtrlVvqefdescripcio(this));
      addControl(vvcodigo=new CtrlVvcodigo(this));
      addControl(vvdesc=new CtrlVvdesc(this));
      addAction(acok=new LinkAcok(this));
      }
    }
    
  public ProgQuerylis()
    {
    this.querylis=this;
    setName("querylis");
    setTitle("Listados");
    setLayout(new LayoutBorder());
    setLocation(new Location());
    addForm(vseleccion=new FormVseleccion(this));
    addForm(vparam=new FormVparam(this));
    addForm(vduplic=new FormVduplic(this));
    }
  public ProgQuerylis(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    if (aplicacion.equals("JEO")) nomDirec="jEo";
    else if (aplicacion.equals("JMODELOS")) nomDirec="jModelos";
    else nomDirec="jNomina";
    
    squery.setDb(Aplication.getAplication().getDataBase());
    sprueba.setDb(Aplication.getAplication().getDataBase());
    super.onInit();
    
    }
  }
  
