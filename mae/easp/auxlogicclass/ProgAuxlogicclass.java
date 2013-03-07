// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20130307
// Hora:             10:43:25
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.auxlogicclass;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: auxlogicclass
// Nombre:   Importar datos de Lógic Class
// Versión:  1.0
// 
public class ProgAuxlogicclass extends Program
  {
  public AppEasp easp;
  public ProgAuxlogicclass auxlogicclass;
  // Inicio declaraciones globales
  public boolean bOk = true;
  
  // Fin declaraciones globales
  // Ventana
  public FormVejecutar vejecutar;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Importar datos de Lógic Class");
      }
    }
    
  public class FormVejecutar extends ProcessForm
    {
    // Inicio declaraciones globales
    boolean bOk = true;
    mae.easp.auxlogicclass.DBConnectionLogic connLogic = null;
    
    private void activaAccio() {
       boolean pucActivar = true;
       if (vvservidor.getString()==null || "".equals(vvservidor.getString().trim()) || vvusuario.getString()==null || "".equals(vvusuario.getString().trim()) || vvbase.getString()==null || "".equals(vvbase.getString().trim()))  
           pucActivar = false;
       vejecutar.aejecutar.setEnabled(pucActivar);
    }
    private String checkNumeroTelefono (String telefono1) {
          String nouTelefon = "";
          if (telefono1!=null) {
              for (int i=0;i<telefono1.length();i++) {
                String tros =telefono1.substring(i,i+1);
                if (Util.isNumero(tros)) nouTelefon += tros;
              }
          }
          String val = nouTelefon;
          if (nouTelefon!=null && nouTelefon.trim().length()>9) val = nouTelefon.trim().substring(0,9);
        return val;
      }
            
    private String[] separaNom(String nom) {
        String composicio [] = {"","",""};
        if (nom!=null && !"".equals(nom.trim())) {
          int npos = mae.general.Util.sch(nom,',');
          if (npos!=-1) {
             String apellidos = nom.substring(0,npos);
             java.util.StringTokenizer st = new java.util.StringTokenizer (apellidos," ");
             while (st.hasMoreTokens()) {
                String sTmp = st .nextToken();
                if ("".equals(composicio[0])) composicio[0] = sTmp;
                else if ("".equals(composicio[1])) composicio[1] = sTmp;
              }
             composicio[2] = nom.substring(npos+1).trim();
          }
          else {
              java.util.StringTokenizer st = new java.util.StringTokenizer (nom," ");
              while (st.hasMoreTokens()) {
                String sTmp = st .nextToken();
                if ("".equals(composicio[0])) composicio[0] = sTmp;
                else if ("".equals(composicio[1])) composicio[1] = sTmp;
                else if ("".equals(composicio[2])) composicio[2] = sTmp;
              }
          }
        }    
        return composicio;
    }
    
    private mae.easp.auxlogicclass.DBConnectionLogic getConexioLogic(String nomServer, String usuari, String contrasenya,String nomBD) {      
        mae.easp.auxlogicclass.DBConnectionLogic conn = null;
        DataBase db=new DataBase();     
        db.setMyServer(nomServer);
        db.setName(nomBD);
        db.setType("sqlserver");    
        conn=new mae.easp.auxlogicclass.DBConnectionLogic(db);
        conn.setPassword(contrasenya);
        conn.setUser(usuari);
        try {
            if (!conn.connectEx()) conn = null;
        }
        catch (Exception e) {
           conn = null;
        }
        return conn;
     }
        
    public String getSelString(mae.easp.auxlogicclass.SelectorLogic s, String campo) {
           return getSelString(s,campo,0);
    }
        
    public String getSelString(mae.easp.auxlogicclass.SelectorLogic s, String campo, int longitud) {
          String sTmp = null;
          Object oTmp = s.getObject(campo);
          if (oTmp!=null) {
            sTmp = (String)oTmp;
            sTmp = sTmp.trim();
            if (sTmp.length()==0) sTmp = null;
            else if (longitud>0 && sTmp.length()>longitud) sTmp = sTmp.substring(0,longitud);
          }
          return sTmp;
    }
        
        
     private boolean altaNIFPersonas (String nif, String nombre, String apellido1, String apellido2, String nombreCompleto, String fisica) {
            mae.easp.auxlogicclass.SelectorLogic snif = new mae.easp.auxlogicclass.SelectorLogic(connLogic);        
            snif.execute("SELECT * FROM  PersonasDomicilios where  Dni='"+nif+"'");
            Insert iNIF = new Insert(Easp.connEA,"NIFES");
            iNIF.valor("danifcif",nif);
            iNIF.valor("datipo","R");
            if ("J".equals(fisica) && nombreCompleto!=null && nombreCompleto.trim().length()!=0) {
               apellido1 = nombreCompleto;
               apellido2 = "";
               nombre = "";
            }
            else if (apellido1==null || apellido1.trim().length()==0) {
               if (Util.esCIFdePersonaFisica(nif)) {
                  String [] resultat = separaNom(nombreCompleto);
                  nombre = resultat[2];
                  apellido1 = resultat[0];
                  apellido2 = resultat[1];
               }
               else apellido1 = nombreCompleto;
            }
            if (apellido1!=null && !"".equals(apellido1.trim())) {
                boolean esCB = false;
                if ("E".equals(nif.substring(0,1)) || "G".equals(nif.substring(0,1)) || "H".equals(nif.substring(0,1))) 
                   esCB = true;
                            
                if (esCB) iNIF.valor("datcbienes","S");
                else iNIF.valor("datcbienes","N");
                if ("F".equals(fisica)) iNIF.valor("datipf","1");
                else iNIF.valor("datipf","9");     
                iNIF.valor("datnombre",nombre);
                iNIF.valor("datapell1",apellido1);
                iNIF.valor("datapell2",apellido2);
                iNIF.valor("datdominio",Easp.dominio);
                iNIF.valor("datfisicajuri",fisica);
                while (snif.next()) {
                    String CodDirPer = snif.getString("CodigoDireccionPersona");
                    if ("FIS".equals(CodDirPer)) {
                        iNIF.valor("datsiglas",getSelString(snif, "CodigoSigla"));
                        iNIF.valor("datvia",getSelString(snif, "ViaPublica"));
                        iNIF.valor("datnum",getSelString(snif, "Numero1"));
                        iNIF.valor("datesc",getSelString(snif, "Escalera"));
                        iNIF.valor("datpiso",getSelString(snif, "Piso"));
                        iNIF.valor("datletra",getSelString(snif, "Letra"));
                        iNIF.valor("datcpos",getSelString(snif, "CodigoPostal"));
                        String CodigoProvincia = getSelString(snif, "CodigoProvincia");
                        if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) iNIF.valor("datprov",CodigoProvincia.trim());
                        String CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
                        if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) {
                          Selector smun = new Selector (Easp.connEA);
                          smun.execute("Select * from MUNI347 where mu7provmuni='"+CodigoMunicipio+"'");
                          if (smun.next()) {
                            int mu7muniant = smun.getint("mu7muniant");
                            if (mu7muniant!=0) iNIF.valor("datmuni",mu7muniant);
                            else iNIF.valor("datmuni",CodigoMunicipio.substring(2));
                          }
                          smun.close();
                        }
                        iNIF.valor("datpobla",getSelString(snif, "Municipio"));
                        iNIF.valor("datmovil",checkNumeroTelefono(getSelString(snif, "TelefonoMovil")));
                        iNIF.valor("dattel",checkNumeroTelefono(getSelString(snif, "Telefono")));
                        iNIF.valor("datfax",checkNumeroTelefono(getSelString(snif, "Fax")));
            
                        Selector stv = new Selector (Easp.connEA);
                        stv.execute("Select * from TIPOVIAS where tvscodant='"+getSelString(snif, "CodigoSigla")+"'");
                        if (stv.next())  iNIF.valor("datfftvia",stv.getString("tvscodigo"));
                        stv.close();
            
                        iNIF.valor("datfvia",getSelString(snif, "ViaPublica"));
                        iNIF.valor("datftnum","NUM");
                        if (Util.isNumero(getSelString(snif, "Numero1"))) iNIF.valor("datfnum",getSelString(snif, "Numero1"));
                        iNIF.valor("datfescal",getSelString(snif, "Escalera"));
                        iNIF.valor("datfplanta",getSelString(snif, "Piso"));
                        iNIF.valor("datfpuerta",getSelString(snif, "Letra"));
                        iNIF.valor("datfcpost",getSelString(snif, "CodigoPostal"));
                        CodigoProvincia = getSelString(snif, "CodigoProvincia");
                        if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) iNIF.valor("datfprov",CodigoProvincia.trim());
                        CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
                        if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) iNIF.valor("datfcodmun",CodigoMunicipio);
                        iNIF.valor("datfnommun",getSelString(snif, "Municipio"));
                        iNIF.valor("datflocal",getSelString(snif, "Municipio"));
                        iNIF.valor("datfmovil",checkNumeroTelefono(getSelString(snif, "TelefonoMovil")));
                        iNIF.valor("datftel",checkNumeroTelefono(getSelString(snif, "Telefono")));
                        iNIF.valor("datffax",checkNumeroTelefono(getSelString(snif, "Fax")));
                    }
                    else if ("SOC".equals(CodDirPer)) {
                        iNIF.valor("datsvia",getSelString(snif, "ViaPublica"));
                        iNIF.valor("datstnum","NUM");
                        if (Util.isNumero(getSelString(snif, "Numero1"))) iNIF.valor("datsnum",getSelString(snif, "Numero1"));
                        iNIF.valor("datsescal",getSelString(snif, "Escalera"));
                        iNIF.valor("datsplanta",getSelString(snif, "Piso"));
                        iNIF.valor("datspuerta",getSelString(snif, "Letra"));
                        iNIF.valor("datscpost",getSelString(snif, "CodigoPostal"));
                        String CodigoProvincia = getSelString(snif, "CodigoProvincia");
                        if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) iNIF.valor("datsprov",CodigoProvincia.trim());
                        String CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
                        if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) iNIF.valor("datscodmun",CodigoMunicipio);
                        iNIF.valor("datsnommun",getSelString(snif, "Municipio"));
                        iNIF.valor("datslocal",getSelString(snif, "Municipio"));
                        iNIF.valor("datsmovil",checkNumeroTelefono(getSelString(snif, "TelefonoMovil",9)));
                        iNIF.valor("datstel",checkNumeroTelefono(getSelString(snif, "Telefono",9)));
                        iNIF.valor("datsfax",checkNumeroTelefono(getSelString(snif, "Fax",9)));
                    }
                    else if ("ENV".equals(CodDirPer)) {
                        iNIF.valor("datnvia",getSelString(snif, "ViaPublica"));
                        iNIF.valor("datntnum","NUM");
                        if (Util.isNumero(getSelString(snif, "Numero1"))) iNIF.valor("datnnum",getSelString(snif, "Numero1"));
                        iNIF.valor("datnescal",getSelString(snif, "Escalera"));
                        iNIF.valor("datnplanta",getSelString(snif, "Piso"));
                        iNIF.valor("datnpuerta",getSelString(snif, "Letra"));
                        iNIF.valor("datncpost",getSelString(snif, "CodigoPostal"));
                        String CodigoProvincia = getSelString(snif, "CodigoProvincia");
                        if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) iNIF.valor("datnprov",CodigoProvincia.trim());
                        String CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
                        if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) iNIF.valor("datncodmun",CodigoMunicipio);
                        iNIF.valor("datnnommun",getSelString(snif, "Municipio"));
                        iNIF.valor("datnlocal",getSelString(snif, "Municipio"));
                        iNIF.valor("datnmovil",checkNumeroTelefono(getSelString(snif, "TelefonoMovil",9)));
                        iNIF.valor("datntel",checkNumeroTelefono(getSelString(snif, "Telefono",9)));
                        iNIF.valor("datnfax",checkNumeroTelefono(getSelString(snif, "Fax",9)));
                    }
                }
                bOk = iNIF.execute();
          }
          return bOk;
    }
    private boolean regrabaNIFPersonas (String nif, String nombre, String apellido1, String apellido2, String nombreCompleto, String fisica) {
            mae.easp.auxlogicclass.SelectorLogic snif = new mae.easp.auxlogicclass.SelectorLogic(connLogic);        
            snif.execute("SELECT * FROM  PersonasDomicilios where  Dni='"+nif+"'");
            Update iNIF = new Update(Easp.connEA,"NIFES");
            if ("J".equals(fisica) && nombreCompleto!=null && nombreCompleto.trim().length()!=0) {
               apellido1 = nombreCompleto;
               apellido2 = "";
               nombre = "";
            }
            else if (apellido1==null || apellido1.trim().length()==0) {
               if (Util.esCIFdePersonaFisica(nif)) {
                  String [] resultat = separaNom(nombreCompleto);
                  nombre = resultat[2];
                  apellido1 = resultat[0];
                  apellido2 = resultat[1];
               }
               else apellido1 = nombreCompleto;
            }
            if (apellido1!=null && !"".equals(apellido1.trim())) {
                boolean esCB = false;
                if ("E".equals(nif.substring(0,1)) || "G".equals(nif.substring(0,1)) || "H".equals(nif.substring(0,1))) 
                   esCB = true;
                            
                if (esCB) iNIF.valor("datcbienes","S");
                else iNIF.valor("datcbienes","N");
                if ("F".equals(fisica)) iNIF.valor("datipf","1");
                else iNIF.valor("datipf","9");     
    
                iNIF.valor("datnombre",nombre);
                iNIF.valor("datapell1",apellido1);
                iNIF.valor("datapell2",apellido2);
                iNIF.valor("datdominio",Easp.dominio);
                iNIF.valor("datfisicajuri",fisica);
                while (snif.next()) {
                    String CodDirPer = snif.getString("CodigoDireccionPersona");
                    if ("FIS".equals(CodDirPer)) {
                        iNIF.valor("datsiglas",getSelString(snif, "CodigoSigla"));
                        iNIF.valor("datvia",getSelString(snif, "ViaPublica"));
                        iNIF.valor("datnum",getSelString(snif, "Numero1"));
                        iNIF.valor("datesc",getSelString(snif, "Escalera"));
                        iNIF.valor("datpiso",getSelString(snif, "Piso"));
                        iNIF.valor("datletra",getSelString(snif, "Letra"));
                        iNIF.valor("datcpos",getSelString(snif, "CodigoPostal"));
                        String CodigoProvincia = getSelString(snif, "CodigoProvincia");
                        if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) iNIF.valor("datprov",CodigoProvincia.trim());
                        String CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
                        if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) {
                          Selector smun = new Selector (Easp.connEA);
                          smun.execute("Select * from MUNI347 where mu7provmuni='"+CodigoMunicipio+"'");
                          if (smun.next()) {
                            int mu7muniant = smun.getint("mu7muniant");
                            if (mu7muniant!=0) iNIF.valor("datmuni",mu7muniant);
                            else iNIF.valor("datmuni",CodigoMunicipio.substring(2));
                          }
                          smun.close();
                        }
                        iNIF.valor("datpobla",getSelString(snif, "Municipio"));
                        iNIF.valor("datmovil",checkNumeroTelefono(getSelString(snif, "TelefonoMovil")));
                        iNIF.valor("dattel",checkNumeroTelefono(getSelString(snif, "Telefono")));
                        iNIF.valor("datfax",checkNumeroTelefono(getSelString(snif, "Fax")));
            
                        Selector stv = new Selector (Easp.connEA);
                        stv.execute("Select * from TIPOVIAS where tvscodant='"+getSelString(snif, "CodigoSigla")+"'");
                        if (stv.next())  iNIF.valor("datfftvia",stv.getString("tvscodigo"));
                        stv.close();
            
                        iNIF.valor("datfvia",getSelString(snif, "ViaPublica"));
                        iNIF.valor("datftnum","NUM");
                        if (Util.isNumero(getSelString(snif, "Numero1"))) iNIF.valor("datfnum",getSelString(snif, "Numero1"));
                        iNIF.valor("datfescal",getSelString(snif, "Escalera"));
                        iNIF.valor("datfplanta",getSelString(snif, "Piso"));
                        iNIF.valor("datfpuerta",getSelString(snif, "Letra"));
                        iNIF.valor("datfcpost",getSelString(snif, "CodigoPostal"));
                        CodigoProvincia = getSelString(snif, "CodigoProvincia");
                        if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) iNIF.valor("datfprov",CodigoProvincia.trim());
                        CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
                        if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) iNIF.valor("datfcodmun",CodigoMunicipio);
                        iNIF.valor("datfnommun",getSelString(snif, "Municipio"));
                        iNIF.valor("datflocal",getSelString(snif, "Municipio"));
                        iNIF.valor("datfmovil",checkNumeroTelefono(getSelString(snif, "TelefonoMovil")));
                        iNIF.valor("datftel",checkNumeroTelefono(getSelString(snif, "Telefono")));
                        iNIF.valor("datffax",checkNumeroTelefono(getSelString(snif, "Fax")));
                    }
                    else if ("SOC".equals(CodDirPer)) {
                        iNIF.valor("datsvia",getSelString(snif, "ViaPublica"));
                        iNIF.valor("datstnum","NUM");
                        if (Util.isNumero(getSelString(snif, "Numero1"))) iNIF.valor("datsnum",getSelString(snif, "Numero1"));
                        iNIF.valor("datsescal",getSelString(snif, "Escalera"));
                        iNIF.valor("datsplanta",getSelString(snif, "Piso"));
                        iNIF.valor("datspuerta",getSelString(snif, "Letra"));
                        iNIF.valor("datscpost",getSelString(snif, "CodigoPostal"));
                        String CodigoProvincia = getSelString(snif, "CodigoProvincia");
                        if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) iNIF.valor("datsprov",CodigoProvincia.trim());
                        String CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
                        if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) iNIF.valor("datscodmun",CodigoMunicipio);
                        iNIF.valor("datsnommun",getSelString(snif, "Municipio"));
                        iNIF.valor("datslocal",getSelString(snif, "Municipio"));
                        iNIF.valor("datsmovil",checkNumeroTelefono(getSelString(snif, "TelefonoMovil",9)));
                        iNIF.valor("datstel",checkNumeroTelefono(getSelString(snif, "Telefono",9)));
                        iNIF.valor("datsfax",checkNumeroTelefono(getSelString(snif, "Fax",9)));
                    }
                    else if ("ENV".equals(CodDirPer)) {
                        iNIF.valor("datnvia",getSelString(snif, "ViaPublica"));
                        iNIF.valor("datntnum","NUM");
                        if (Util.isNumero(getSelString(snif, "Numero1"))) iNIF.valor("datnnum",getSelString(snif, "Numero1"));
                        iNIF.valor("datnescal",getSelString(snif, "Escalera"));
                        iNIF.valor("datnplanta",getSelString(snif, "Piso"));
                        iNIF.valor("datnpuerta",getSelString(snif, "Letra"));
                        iNIF.valor("datncpost",getSelString(snif, "CodigoPostal"));
                        String CodigoProvincia = getSelString(snif, "CodigoProvincia");
                        if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) iNIF.valor("datnprov",CodigoProvincia.trim());
                        String CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
                        if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) iNIF.valor("datncodmun",CodigoMunicipio);
                        iNIF.valor("datnnommun",getSelString(snif, "Municipio"));
                        iNIF.valor("datnlocal",getSelString(snif, "Municipio"));
                        iNIF.valor("datnmovil",checkNumeroTelefono(getSelString(snif, "TelefonoMovil",9)));
                        iNIF.valor("datntel",checkNumeroTelefono(getSelString(snif, "Telefono",9)));
                        iNIF.valor("datnfax",checkNumeroTelefono(getSelString(snif, "Fax",9)));
                    }
                }
                bOk = iNIF.execute("danifcif='"+nif+"'");
          }
          return bOk;
    }
    
    private boolean altaNIFClass () {
      ProgressBarForm pbf=new ProgressBarForm(auxlogicclass,"Traspasando NIFES ...",true,false,true) {
      public void job() {
          setPercent(0);
          mae.easp.auxlogicclass.SelectorLogic s = new mae.easp.auxlogicclass.SelectorLogic(connLogic);        
          int ntot = 0;
          s.execute("SELECT count(*) as total from Personas where dni is not null and dni<>''");
          if (s.next()) ntot = s.getint("total");
          s.close();
          s.execute("SELECT * from Personas where dni is not null and dni<>''");
          int nreg = 0;
          while (s.next() && bOk) {
            String nif = s.getString("Dni");
            nreg++;                
            String fisica = s.getString("PersonaFisicaJuridica");            
            String nomCargo = s.getString("NombreEmpleado");
            String apellido1 = s.getString("PrimerApellidoEmpleado");
            String apellido2 = s.getString("SegundoApellidoEmpleado");
            String razon = s.getString("RazonSocialEmpleado");
            setPercent((nreg*100)/ntot);
            setState("Procesando: "+(nreg*100)/ntot+"% ["+nif+"] "+apellido1);                  
            Selector sNifes = new Selector (Easp.connEA);
            sNifes.execute("Select * from NIFES where danifcif='"+nif+"'");
            if (!sNifes.next()) bOk = altaNIFPersonas(nif,nomCargo,apellido1,apellido2,razon,fisica);            
            else bOk = regrabaNIFPersonas(nif,nomCargo,apellido1,apellido2,razon,fisica);            
            sNifes.close();        
          }
          s.close();
          exit();
        }
      };
      pbf.setFormWidth(600);
      pbf.setAuto(true);
      pbf.launch();
      return bOk;
    }
    
    // Fin declaraciones globales
    // Controles
    public CtrlVvservidor vvservidor;
    public CtrlVvusuario vvusuario;
    public CtrlVvcontrasenya vvcontrasenya;
    public CtrlVvbase vvbase;
    // Acciones
    public LinkAejecutar aejecutar;
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(1);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(CENTER);
        }
      }
      
    public class CtrlVvservidor extends ControlEdit
      {
      public CtrlVvservidor(Form form)
        {
        super(form);
        setName("vvservidor");
        setMessageHelp("Nombre del servidor");
        setTitle("Servidor");
        setType(STRING);
        setMaskInput("L");
        setLength(30);
        setPrintable(false);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange(Value v){
            super.userChange(v);
            activaAccio();
        }
      }
      
    public class CtrlVvusuario extends ControlEdit
      {
      public CtrlVvusuario(Form form)
        {
        super(form);
        setName("vvusuario");
        setMessageHelp("Nombre de usuario para conectarse a la base de datos");
        setTitle("Usuario");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange(Value v){
            super.userChange(v);
            activaAccio();
        }
      }
      
    public class CtrlVvcontrasenya extends ControlEdit
      {
      public CtrlVvcontrasenya(Form form)
        {
        super(form);
        setName("vvcontrasenya");
        setMessageHelp("Contraseña para conectarse a la base de datos");
        setTitle("Contraseña");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange(Value v){
            super.userChange(v);
            activaAccio();
        }
      }
      
    public class CtrlVvbase extends ControlEdit
      {
      public CtrlVvbase(Form form)
        {
        super(form);
        setName("vvbase");
        setMessageHelp("Nombre físico de la base de datos");
        setTitle("Nombre base de datos");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange(Value v){
            super.userChange(v);
            activaAccio();
        }
      }
      
    public class LinkAejecutar extends Action
      {
      public LinkAejecutar(Form form)
        {
        super(form);
        setName("aejecutar");
        setTitle("&1. Ejecutar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        if (vvservidor.getString()==null || "".equals(vvservidor.getString().trim()) || vvusuario.getString()==null || "".equals(vvusuario.getString().trim()) || vvbase.getString()==null || "".equals(vvbase.getString().trim()))  Maefc.message("Debe informar los datos.");
        else {
           bOk = true;
           connLogic = getConexioLogic(vvservidor.getString(), vvusuario.getString(), vvcontrasenya.getString(), vvbase.getString());
           if (connLogic!=null) {
              bOk = altaNIFClass();
              connLogic.disconnect();
              if (bOk) {
                 Easp.connEA.commit();         
              }
              else {
                 Easp.connEA.rollback();         
              }       
           }
           else Maefc.message("No se ha podido conectar con la base de datos de Lógic.");
        }
        
        }
      }
      
    public FormVejecutar(ProgAuxlogicclass auxlogicclass)
      {
      super(auxlogicclass);
      setName("vejecutar");
      setLocation(new Location());
      setPrintable(false);
      addControl(vvservidor=new CtrlVvservidor(this));
      addControl(vvusuario=new CtrlVvusuario(this));
      addControl(vvcontrasenya=new CtrlVvcontrasenya(this));
      addControl(vvbase=new CtrlVvbase(this));
      addAction(aejecutar=new LinkAejecutar(this));
      }
    }
    
  public ProgAuxlogicclass()
    {
    this.auxlogicclass=this;
    setName("auxlogicclass");
    setTitle("Importar datos de Lógic Class");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vejecutar=new FormVejecutar(this));
    }
  public ProgAuxlogicclass(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    mae.easp.cnvaviso.ProgCnvaviso pra = new mae.easp.cnvaviso.ProgCnvaviso ();
    pra.setModal(false);
    LocationWindow loc=new LocationWindow();
    loc.setWidth(810);
    loc.setHeight(520);
    pra.setLocation(loc);
    pra.run();
    if (!pra.haAceptadoCondiciones) {
      return;
    }
    setConnection(Easp.connEA);
    vejecutar.aejecutar.setEnabled(false);
    vejecutar.vvcontrasenya.setPassword(true);
    vejecutar.setLayout(new LayoutHtml("mae/easp/html/cnvlogicclass.html"));
    super.onInit();
    
    }
  }
  
