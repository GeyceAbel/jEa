// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20140312
// Hora:             17:24:53
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
  public mae.general.PlantillaJacob plantilla;
  //public DBConnection conexionAplicacion = Aplication.getAplication().getDataBase() ;
  
  public String datSelec;
  public String nomDirec="";
  public int ordenacion=0;
  public int empresaJCONTA;
  public int gasesor = 1 ;
  public boolean isJasper = false;
  public boolean isOldButonListar = false;
  public String fraseEspecifica;
  public mae.general.jreports.JListado jasperList;
  
  
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
        frase.count       =sfrase.getString("qefcount");
  
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
  
  
    public int getLLargadaOptimaCamp(String nomCamp) {
      int llargadaOptima=6;
      if(nomCamp.equals("tranaf2")) llargadaOptima=9;
      else if(nomCamp.equals("tranaf1")) llargadaOptima=3;
      else if(nomCamp.equals("tranaf3")) llargadaOptima=3;
      else if(nomCamp.contains("cenccc\\w2"))llargadaOptima=8;
      else if(nomCamp.contains("cenccc\\w1"))llargadaOptima=3;
      else if(nomCamp.contains("cenccc\\w3"))llargadaOptima=3;    	
      return llargadaOptima;
      
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
        col.sumatorio="S".equals(scolumnes.getString("qecsum"));
        col.agrupar="S".equals(scolumnes.getString("qecgrupby"));
        col.media = "S".equals(scolumnes.getString("qecmedia"));
        col.contador = "S".equals(scolumnes.getString("qeccontador"));
        col.rotura = "S".equals(scolumnes.getString("qecrotura"));
        col.titRotura = scolumnes.getString("qectitrotura");
  
        int llargadaOptima=0;
        switch(scolumnes.getint("qectipo")) {
          case 1: llargadaOptima = scolumnes.getint("qeclongitud")+1; break;
          case 2: llargadaOptima = getLLargadaOptimaCamp(scolumnes.getString("qeccampo"));break;
          case 3: 
            if(col.format != null && !col.format.trim().equals(""))
              llargadaOptima =scolumnes.getString("qecformato").length();
            else
              //llargadaOptima = scolumnes.getint("qeclongitud"); 
          	  llargadaOptima = 8;
            break;
          case 4: llargadaOptima = 10;break;
          default: llargadaOptima=13;break;
        }
        col.llargadaOptima=llargadaOptima;
  
        String camp  = scolumnes.getString("qeccampo");
        String taula = scolumnes.getString("qectabla");
        String bbdd  = scolumnes.getString("qecbbdd");
  
        col.camp = buscaCampo(bbdd, taula, camp);
  
        //col.llarg=Math.max(scolumnes.getint("qeclongitud"),col.titol.length());
        if(scolumnes.getint("qeclongitud")!=0) 
          col.llarg=Math.max(scolumnes.getint("qeclongitud"),col.titol.length());
        else 
          col.llarg=Math.max(llargadaOptima,col.titol.length());
          
  
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
        String taula = staules.getString("qettabla") ;
        t.tc = buscaTabla(staules.getString("qetbbdd"), taula );
  
        String tipoRel = staules.getString("qetrelacion") ;
        t.tipoRelLeftOuter  = (  tipoRel != null && tipoRel.equals("L") );
        t.tipoRelRightOuter = ( tipoRel != null && tipoRel.equals("R") );
        // System.out.println("Taula: ["+taula+"] tipoRel: ["+tipoRel+"] t.tipoRelLeftOuter: ["+t.tipoRelLeftOuter+"]  t.tipoRelRightOuter ["+t.tipoRelRightOuter+"]") ;
  
  
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
            String cataleg4="";
            if (quonexions[i].catalog4!=null)
               cataleg4=quonexions[i].catalog4.getName();
            String cataleg5="";
            if (quonexions[i].catalog5!=null)
               cataleg5=quonexions[i].catalog5.getName();
            String cataleg6="";
            if (quonexions[i].catalog6!=null)
               cataleg6=quonexions[i].catalog6.getName();
            String cataleg7="";
            if (quonexions[i].catalog7!=null)
               cataleg7=quonexions[i].catalog7.getName();
            String cataleg8="";
            if (quonexions[i].catalog8!=null)
               cataleg8=quonexions[i].catalog8.getName();
  
            if (bbdd!=null && !cataleg1.equals(bbdd) && !cataleg2.equals(bbdd) && !cataleg3.equals(bbdd)
                 && !cataleg4.equals(bbdd) && !cataleg5.equals(bbdd) && !cataleg6.equals(bbdd)  
                 && !cataleg7.equals(bbdd) && !cataleg8.equals(bbdd)
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
                   else if (quonexions[i].catalog4!=null) {
                        td=quonexions[i].catalog4.getTable(tabla);
                        if (td!=null) {
                             TablaCatalogo tc=new TablaCatalogo();
                             tc.table=td;
                             tc.catalogo=quonexions[i].catalog4;
                             return tc;
                       }
                       else if (quonexions[i].catalog5!=null) {
                            td=quonexions[i].catalog5.getTable(tabla);
                            if (td!=null) {
                                 TablaCatalogo tc=new TablaCatalogo();
                                 tc.table=td;
                                 tc.catalogo=quonexions[i].catalog5;
                                 return tc;
                           }
                           else if (quonexions[i].catalog6!=null) {
                                td=quonexions[i].catalog6.getTable(tabla);
                                if (td!=null) {
                                     TablaCatalogo tc=new TablaCatalogo();
                                     tc.table=td;
                                     tc.catalogo=quonexions[i].catalog6;
                                     return tc;
                               }
                               else if (quonexions[i].catalog7!=null) {
                                    td=quonexions[i].catalog7.getTable(tabla);
                                    if (td!=null) {
                                         TablaCatalogo tc=new TablaCatalogo();
                                         tc.table=td;
                                         tc.catalogo=quonexions[i].catalog7;
                                         return tc;
                                   }
                                   else if (quonexions[i].catalog8!=null) {
                                        td=quonexions[i].catalog8.getTable(tabla);
                                        if (td!=null) {
                                             TablaCatalogo tc=new TablaCatalogo();
                                             tc.table=td;
                                             tc.catalogo=quonexions[i].catalog8;
                                             return tc;
                                       }
                                   }
                               }
                           }
                       }
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
    String count;
  
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
            //w.append(col.camp.field.getName());
            w.append(col.camp.table.getName()+"."+col.camp.field.getName());
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
  
       if      (quantitat == 1 ) {
         if      ( t.tipoRelLeftOuter )  f="" +f+ " left  outer join ";
         else if ( t.tipoRelRightOuter ) f="" +f+ " right outer join  ";
         else                            f="" +f+ " inner join  ";
         }
       else if (quantitat >  1 ) {
         if      ( t.tipoRelLeftOuter )  f="("+f+") left outer join ";
         else if ( t.tipoRelRightOuter ) f="("+f+") right outer join ";
         else                            f="("+f+") inner join ";
         }
       // System.out.println("quantitat: ["+quantitat+"] f: ["+f+"] taula: ["+t.tc+"]");
  
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
      else if (aplicacion.equals("JISS") && "S".equals(frase.ect) ) f = "seleccion,"+f;
      else if (aplicacion.equals("JRENTA") && "D".equals(frase.ect) ) f = "seleccion,"+f;
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
  
        if      (quantitat == 1 ) {
          if      ( t.tipoRelLeftOuter )  f="" +f+ " left  outer join ";
          else if ( t.tipoRelRightOuter ) f="" +f+ " right outer join  ";
          else                            f="" +f+ " inner join  ";
          }
        else if (quantitat >  1 ) {
          if      ( t.tipoRelLeftOuter )  f="("+f+") left outer join ";
          else if ( t.tipoRelRightOuter ) f="("+f+") right outer join ";
          else                            f="("+f+") inner join ";
          }
        // System.out.println("quantitat: ["+quantitat+"] f: ["+f+"] taula: ["+t.tc+"]");
  
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
    boolean tipoRelLeftOuter ;
    boolean tipoRelRightOuter ;
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
    boolean sumatorio;
    boolean agrupar;
    boolean canviat;
    Quorelacio quorelacio;
    String titRotura;
    boolean media;
    boolean contador;
    boolean rotura;
    int llargadaOptima;
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
      else if (aplicacion.equals("JISS")) {
         if ("S".equals(frase.ect)) {
              String selwhere="SELUSUARIO='"+Aplication.getAplication().getUser()+"' and SELPROGRAMA='QUERY'";
  
             if (hiHaTaula("sociedades")) {
                 selwhere+=" and (SELEMPRESA IS NULL or SELEMPRESA=SOCCODIGO)";
              }
              if (where==null)
                 where=selwhere;
              else
                 where=selwhere+" and ("+where+")";
          }
      }
      else if (aplicacion.equals("JRENTA")) {
         if ("D".equals(frase.ect)) {
              String selwhere="SELUSUARIO='"+Aplication.getAplication().getUser()+"' and SELPROGRAMA='QUERY'";
  
             if (hiHaTaula("declarante")) {
                 selwhere+=" and (SELEMPRESA IS NULL or SELEMPRESA=DECCODIGO)";
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
      else if (aplicacion.equals("JCONTA")) {
     	  String nomCampEmpresa = null;
        CatCtasp catjco = new CatCtasp();
        TableDef td = catjco.getTable(squery.qefmaster.getString().toLowerCase());
        if (td!=null) {
        	FieldDef[] fd = td.getColumns();
        	for (int i=0;i<fd.length && nomCampEmpresa==null;i++) {
        		String nom = fd[i].getName().toLowerCase();
        		if (nom.endsWith("empresa")) nomCampEmpresa = nom;
        	}
        }
        if (nomCampEmpresa!=null) {
         	if (where==null) where = nomCampEmpresa+"="+empresaJCONTA;
        	else where += " and ("+nomCampEmpresa+"="+empresaJCONTA+")";
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
         //APXAVI 2011-12-22 tocat per funcionament de combinacio de plantilles
         quorelacioPrincipal.sentencia = sentencia.toString();
  
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
                      String vals=(String)col.quorelacio.selector.getObject(col.camp.field.getName());
                      //String vals=col.quorelacio.selector.getString(col.camp.field.getName());
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
  /* 02-12-2001 APXAVI nou parametre per cambiar el nom del botó segons es cridi desde listar o combinar*/
  boolean demanarParametres(boolean callCombinarButton) {
    if ((frase.variables.size()==0 || !algunaVariableVisible()) &&
        (frase.ect==null || frase.ect.length()==0 || frase.ect.equals("N"))||fraseEspecifica!=null )
       return true;
  
    FormVparam form=new FormVparam(querylis);
    if(callCombinarButton)  {
      form.acimprimir.setTitle("&1 - Combinar");
    }
    
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
    Catalog catalog4=null;
    Catalog catalog5=null;
    Catalog catalog6=null;
    Catalog catalog7=null;
    Catalog catalog8=null;
  
    if (conn.catalog2!=null)
       catalog2=conn.catalog2;
    if (conn.catalog3!=null)
       catalog3=conn.catalog3;
    if (conn.catalog4!=null)
       catalog4=conn.catalog4;
    if (conn.catalog5!=null)
       catalog5=conn.catalog5;
    if (conn.catalog6!=null)
       catalog6=conn.catalog6;
    if (conn.catalog7!=null)
       catalog7=conn.catalog7;
    if (conn.catalog8!=null)
       catalog8=conn.catalog8;
  
    if (catalog==cat || catalog2==cat || catalog3==cat || catalog4==cat || catalog5==cat || catalog6==cat || catalog7==cat || catalog8==cat)
       return true;
    else
       return false;
  }
  /*
  class StringMetrics {
  
    Font font;
    FontRenderContext context;
  
    public StringMetrics(Graphics2D g2) {
  
      font = g2.getFont();
      context = g2.getFontRenderContext();
    }
  
    Rectangle2D getBounds(String message) {
  
      return font.getStringBounds(message, context);
    }
  
    double getWidth(String message) {
  
      Rectangle2D bounds = getBounds(message);
      return bounds.getWidth();
    }
  
    double getHeight(String message) {
  
      Rectangle2D bounds = getBounds(message);
      return bounds.getHeight();
    }
  
  }
  */
  // Fin declaraciones globales
  // Ventana
  public FormVseleccion vseleccion;
  // Selects
  public Squery squery;
  public Sprueba sprueba;
  public Squecolumn squecolumn;
  public Squetabla squetabla;
  public Squevariables squevariables;
  public Splantillas splantillas;
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
    public Selector selectCombinacio;
    
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
        DBConnection dbdelete = null;
        if (aplicacion.equals("JCONTA")) dbdelete = getDataBase();
        else dbdelete =  Aplication.getAplication().getDataBase();
    
        //Delete delev=new Delete(getDataBase(),"quevariables");
        Delete delev=new Delete(dbdelete,"quevariables");
        delev.execute("qevaplicacion='"+aplicacion+"' and qevfrase='"+frase+"'");
    
        //Delete delec=new Delete(getDataBase(),"quecolumn");
        Delete delec=new Delete(dbdelete,"quecolumn");
        delec.execute("qecaplicacion='"+aplicacion+"' and qecfrase='"+frase+"'");
    
        //Delete delet=new Delete(getDataBase(),"quetabla");
        Delete delet=new Delete(dbdelete,"quetabla");
        delet.execute("qetaplicacion='"+aplicacion+"' and qetfrase='"+frase+"'");
    
        //Delete delef=new Delete(getDataBase(),"quefrase");
        Delete delef=new Delete(dbdelete,"quefrase");
        delef.execute("qefaplicacion='"+aplicacion+"' and qeffrase='"+frase+"'");
    
        //getDataBase().commit();
        dbdelete.commit();
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
          else if (col.format!=null && !"".equals(col.format))  
             xml.append(" format=\""+col.format+"\" ");
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
        else if (aplicacion.equals("JISS")) nomListado="listadojISS";
        else if (aplicacion.equals("JRENTA")) nomListado="listadojRENTA";
        
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
          insertEtiq("qefcount",sprueba.qefcount.getString().trim());
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
            insertEtiq("qecsum",squecolumn.qecsum.getString().trim());
            insertEtiq("qecgrupby",squecolumn.qecgrupby.getString().trim());
            insertEtiq("qecmedia",squecolumn.qecmedia.getString().trim());        
            insertEtiq("qeccontador",squecolumn.qeccontador.getString().trim());
            insertEtiq("qecrotura",squecolumn.qecrotura.getString().trim());
            insertEtiq("qectitrotura",squecolumn.qectitrotura.getString().trim());
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
        else if (aplicacion.equals("JMODELOS")) nomListado="listadojMODELOS";
        else if (aplicacion.equals("JISS")) nomListado="listadojISS";
        else if (aplicacion.equals("JRENTA")) nomListado="listadojRENTA";
    
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
              sprueba.qefcount.setValue(getTag("qefcount"));
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
                squecolumn.qecsum.setValue(getTag("qecsum"));
                squecolumn.qecgrupby.setValue(getTag("qecgrupby"));
                squecolumn.qecmedia.setValue(getTag("qecmedia"));
                squecolumn.qeccontador.setValue(getTag("qeccontador"));
                squecolumn.qecrotura.setValue(getTag("qecrotura"));
                squecolumn.qectitrotura.setValue(getTag("qectitrotura"));
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
    
    public void combinaPlantilla(String origenDades) {
      try {
        Maefc.waitCursor();
        //String documentoGuarda = System.getProperty("user.dir")+"\\Documentos Combinados\\" + qeffrase.getString()+ "_" + Easp.usuario + ".doc";
        //plantilla.createDocumentSave(documentoGuarda);
        //plantilla.fileAsociation();
        //plantilla.newDataSource(File fileDataSource);
        //Selector scolumnas=new Selector(getDataBase());  
        //scolumnas.execute("select * from quecolumn where qecaplicacion='"+aplicacion+"' and qecfrase='"+qeffrase.getString()+"' order by qecorden");  
        //squecolumn.execute();
        //selectCombinacio.execute();
        //plantilla.mountDataSourceSelect(System.getProperty("user.dir")+ "\\DataSources\\"+ qeffrase.getString() +"_" + Fecha.fechaGregoriana(Maefc.getDate())+Fecha.getHora(Maefc.getDateTime(),"HHmmss") + ".csv", "QUERY",squecolumn,16,selectCombinacio,17);
        plantilla.setDataSource(origenDades);
        plantilla.executeMerge();
        Maefc.restoreCursor();
      }
      catch(Exception ex) {
        Maefc.restoreCursor();
        Maefc.message("Error:" + ex.getMessage(),"¡Error!",Maefc.ERROR_MESSAGE);
        ex.printStackTrace();    
      }
    }
    
    /*
    public void calculaAmpladaColumnesJasper(Frase frase, double llargadaTotal) {
        java.awt.image.BufferedImage off_Image =
                          new java.awt.image.BufferedImage(100, 50,
                                          java.awt.image.BufferedImage.TYPE_INT_ARGB);
      Graphics2D g2 = off_Image.createGraphics(); 
      for(int x=0;x<frase.columnes.size();x++) { 
        Columna cole = (Columna)frase.columnes.elementAt(x);
        if (cole.visible) {
          char[] chars = new char[cole.llarg];
          java.util.Arrays.fill(chars, 'A');
          String s = new String(chars);          
          java.awt.Font        defaultFont = new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 12);
          java.awt.FontMetrics fontMetrics = g2.getFontMetrics(defaultFont);
          int width = fontMetrics.stringWidth(s);
          widthColumns.put(cole.camp.field.getName(), width);d
        }
      }           
    }
    */
    
    // Fin declaraciones globales
    // Controles
    public CtrlQeffrase qeffrase;
    public CtrlQefdescripcion qefdescripcion;
    public CtrlQefplantilla qefplantilla;
    // Acciones
    public LinkAclistarnew aclistarnew;
    public LinkAclistarjr aclistarjr;
    public LinkAcdup acdup;
    public LinkAcimportar acimportar;
    public LinkAcexportar acexportar;
    public LinkAccombinar accombinar;
    public LinkAclistar aclistar;
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
      
    public class CtrlQefplantilla extends ColumnEdit
      {
      public CtrlQefplantilla(Form form)
        {
        super(form);
        setName("qefplantilla");
        setMessageHelp("Plantilla asociada al fichero de combinación de correspondencia");
        setTitle("Plantilla");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(squery.qefplantilla);
        }
      }
      
    public class LinkAclistarnew extends Action
      {
      public LinkAclistarnew(Form form)
        {
        super(form);
        setName("aclistarnew");
        setTitle("&1 - Listar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        if(isJasper)
          aclistarjr.doAction();
        else 
          aclistar.doAction();
        
        
        }
      }
      
    public class LinkAclistarjr extends Action
      {
      public LinkAclistarjr(Form form)
        {
        super(form);
        setName("aclistarjr");
        setTitle("&1 - Listar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        
        if (parserSQL() == false) {
          Maefc.message("Se han encontrado errores en el procesamiento \nde las variables, por favor revíselas","Procesamiento de variables",Maefc.ERROR_MESSAGE, Maefc.OK_OPTION);
          //this.doShow();
          }
        else {
        super.onAction();
        if(fraseEspecifica ==null) 
          frase=llegeixFrase(qeffrase.getString());
        else  {
          frase=llegeixFrase(fraseEspecifica);
          frase.ect ="E";
        }
        if (!demanarParametres(false)) 
          return;
        
        seleccio=new Seleccio();
        
        seleccio.inicia();
        if (seleccio.quorelacioPrincipal.eof) {
          Maefc.message("No se ha encontrado información que cumple con la selección efectuada");
          return;
          }
        
        double llargadaTotal=0.0;
        java.util.LinkedHashMap<String,Integer> fields = new java.util.LinkedHashMap<String, Integer>();
        java.util.LinkedHashMap<String,String[]> fieldsLength = new java.util.LinkedHashMap<String, String[]>();
        for(int i=0;i<frase.columnes.size();i++) {        	  
            Columna col=(Columna)frase.columnes.elementAt(i);
            if (col.visible) { 
                llargadaTotal = llargadaTotal + col.llarg;	
            }
        }
        //es crea xml d'origen de dades
        java.io.File fjrxml = null;
        java.io.BufferedWriter pw = null;
        try {
          fjrxml = java.io.File.createTempFile("QUERYXML_", ".xml");
          pw = new java.io.BufferedWriter(new java.io.OutputStreamWriter (new java.io.FileOutputStream(fjrxml),"UTF8"));
          pw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
          pw.newLine();
          pw.write("<queryjasper>");
          //pw.newLine();
          boolean first= true;
          boolean enter= false;
          while(!seleccio.quorelacioPrincipal.eof) {
            pw.write("<register>");
            //pw.newLine();
            for(int i=0;i<frase.columnes.size();i++) {        	  
              Columna col=(Columna)frase.columnes.elementAt(i);
              if (col.visible) { 
                if(first) {
                  fields.put(col.camp.field.getName(), col.camp.field.getType());
                  String[] llargadaTipus = new String[3];
                  llargadaTipus[0] = String.valueOf(col.llarg);
                  llargadaTipus[1] = String.valueOf(col.tipus);  
                  llargadaTipus[2] = col.titol;
                  fieldsLength.put(col.camp.field.getName()+i, llargadaTipus);
                  enter=true;
                }
                //pw.write("<" + col.camp.field.getName() + ">" + (col.tipus==Value.STRING?Maefc.filtraXML(String.valueOf(col.valor)):col.valor) + "</" + col.camp.field.getName()+ ">");
                //pw.write("<" + col.camp.field.getName() + ">" + (col.tipus==Value.STRING?Maefc.filtraXML(String.valueOf(col.valor)):(col.valor==null?"":col.valor.getString().replace(".",","))) + "</" + col.camp.field.getName()+ ">");
                String acumula = col.acumula? " total = 'acum'":(col.media?" total = 'media'":(col.contador?" total = 'contador'":""));
                pw.write("<" + col.camp.field.getName() + " tipus = '"+col.tipus+"'" + (col.tipus == Value.DOUBLE && col.format !=null && !col.format.trim().equals("")?(" format='"+col.format+"'"):(""))+ acumula +">" + (col.tipus==Value.STRING?Maefc.filtraXML(String.valueOf(col.valor)):(col.valor==null?"":col.valor.getString().replace(".",","))) + "</" + col.camp.field.getName()+ ">");                
                //pw.newLine();
              }
            }
            pw.write("</register>");
            if(enter) first =false;
            //pw.newLine();
            seleccio.next();            
          }
          pw.write("</queryjasper>");
          pw.close();
          
          //Es crea el jrxml del jasperreport
          
          String nodeLoop= "/queryjasper/register";
          mae.general.jreports.JListado listadoJasper = new mae.general.jreports.JListado(nodeLoop,fields,frase.apaisat?mae.general.jreports.JListado.Orientacion.HORIZONTAL:mae.general.jreports.JListado.Orientacion.VERTICAL);
          listadoJasper.setTituloListado(frase.titol); 
          listadoJasper.setNombreReport(frase.nom);
          listadoJasper.setColorPeuPagina ("#0e4b80");
          listadoJasper.setColorLineas ("#5e584e");
          listadoJasper.sizeDetalle = 7;
          listadoJasper.sizeEncabezado = 15;
          
          mae.general.jreports.Encabezado e = listadoJasper.addEncabezado();
          e.setBgColor("#CADAEB");
          e.setColorFont("#000000");
          String expresio = "\"Fecha : " + new java.text.SimpleDateFormat("dd-MM-yyyy").format(Fecha.hoy())+"\"";
          e.addNewTextField(expresio, mae.general.jreports.Columna.STRING,"fechas");
          
          for(int i=0;i<frase.variables.size();i++) {
            Variable var=(Variable)frase.variables.elementAt(i);
            if (var.visible) {
                mae.general.jreports.Encabezado eAux = listadoJasper.addEncabezado();
                eAux.setBgColor("#CADAEB");
                eAux.setColorFont("#000000");
                String expresionAux= "\""+(var.titol+": "+var.valor.getString())+"\"";
                eAux.addNewTextField(expresionAux, mae.general.jreports.Columna.STRING,"variable"+i);
            }
          }
        
          //mirem si existeixen totales
          boolean totales = false;
          for(int y=0;y<frase.columnes.size();y++) {
                Columna cole = (Columna)frase.columnes.elementAt(y);
                if(cole.acumula  || cole.media || cole.contador) {
                  totales=true;
                  break;
                }
          }
          
          
          
          //columnes del jasper
          int posIni =0;
          for(int x=0;x<frase.columnes.size();x++) {        	
            Columna cole = (Columna)frase.columnes.elementAt(x);
            if (cole.visible) {
              double llargada;
              //if(cole.tipus == mae.general.jreports.Columna.DATE) llargada = 8/llargadaTotal;
              //else	  llargada= cole.llarg/llargadaTotal;
              //int ampladaCamp = (int)(listadoJasper.getColumnWidth()*llargada);
              llargada= cole.llarg/llargadaTotal;
              
              int ampladaCamp = (int)java.lang.Math.ceil((listadoJasper.getColumnWidth()*llargada));
              if(ampladaCamp<5) ampladaCamp =5;    
              if(x==frase.columnes.size()-1) 
                ampladaCamp = (listadoJasper.getRightWidthPosicion()-listadoJasper.getMargender())-posIni;
              
              /*
              java.awt.Font font = new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 10);
              java.awt.FontMetrics metrics = g.getFontMetrics(font);
              int width = metrics.stringWidth("3");
              
              FontMetrics metrics = new FontMetrics(font) {  
              };  
              Rectangle2D bounds = metrics.getStringBounds("string", null);  
              int widthInPixels = (int) bounds.getWidth(); 
              */
              /*apxavi new calcul longitud en pixels per jr*/
              java.awt.Font font = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 9);  
              java.awt.FontMetrics metrics = new java.awt.FontMetrics(font) { 
              };
              //String str = "a";
              java.awt.geom.Rectangle2D bounds = metrics.getStringBounds( new String(new char[cole.llarg]).replace('\0', 'A'), null);  
              int widthInPixels = (int) bounds.getWidth(); 
              
                
              
              //mae.general.jreports.Columna col = listadoJasper.addColumna(cole.titol,posIni,ampladaCamp,cole.tipus,cole.camp.field.getName(),null);
              mae.general.jreports.Columna col = listadoJasper.addColumna(cole.titol,posIni,widthInPixels,cole.tipus,cole.camp.field.getName(),null);
              col.getSt().setColorFont("#0e4b80");
              col.getTf().setColorFont("#3c454d"); 
        
              col.setOriginalSizePixel(widthInPixels);
              java.awt.geom.Rectangle2D bounds2 = metrics.getStringBounds( new String(new char[cole.llargadaOptima]).replace('\0', 'A'), null);  
              int widthInPixels2 = (int) bounds2.getWidth(); 
              col.setAmpladaOptima(widthInPixels2);
        
              if (cole.tipus == mae.general.jreports.Columna.INTEGER || cole.tipus == mae.general.jreports.Columna.DOUBLE
                        || (cole.tipus == mae.general.jreports.Columna.STRING && cole.llarg <16))
                col.setStretchWithOverflow(true); 
              if(cole.format != null && !cole.format.equals(""))
                col.getTf().setPattern(cole.format);  
              //posIni += ampladaCamp;              
              posIni +=widthInPixels;
              if(cole.acumula  || cole.media || cole.contador) {
                mae.general.jreports.Totalizar.Calculation tipe;
                if(cole.acumula) tipe = mae.general.jreports.Totalizar.Calculation.SUM;
                else if(cole.media) tipe = mae.general.jreports.Totalizar.Calculation.AVERAGE;
                else tipe = mae.general.jreports.Totalizar.Calculation.COUNT;
                mae.general.jreports.Totalizar t =listadoJasper.addTotalizar(cole.titol, col, tipe);
                t.setBackGroundColor("#AFC0C7");
              } 
              if(cole.rotura || cole.saltapag) {
                mae.general.jreports.Rotura rot = listadoJasper.addRotura("n"+cole.camp.field.getName(),"$F{" + cole.camp.field.getName() +  "}",!totales?"":"TOTAL " + (cole.titRotura==null?"":cole.titRotura));
                rot.setSaltoPagina(cole.saltapag);
                //rot.setColorFont("#0e4b80");
                rot.setColorFons("#D3DFE2");
                //rot.setBackGroundHeaderColor("#D3DFE2");
                if(cole.titRotura!=null)
                  rot.setGroupHeaderName("\"" + cole.titRotura.toUpperCase() + " :\" + $F{" + cole.camp.field.getName() + "}");                
              }
              
            }
          } 
          //xml dataSource del jasper en questio
          net.sf.jasperreports.engine.data.JRXmlDataSource xmlDataSource = new net.sf.jasperreports.engine.data.JRXmlDataSource(fjrxml,nodeLoop);
          listadoJasper.setXmlDataSource(xmlDataSource);
          
          //generacio del report                
          //if (listadoJasper.generalJRXML()) {
            mae.general.jreports.PrintJasperWork pjw = new mae.general.jreports.PrintJasperWork ("Salida...",null);          
            pjw.addListado(listadoJasper);
            pjw.setPestanaTXT(true, fieldsLength,fjrxml);
            pjw.setQuery(true);
            if(frase.apaisat) pjw.horizontal = true; 
            if(fraseEspecifica == null)
              pjw.dialog(querylis);
            else {
              jasperList = pjw.runBackgroundList(querylis);	
            }
          //}
          
          
        }
        catch(net.sf.jasperreports.engine.JRException ex) {
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
        setOptions(SHOW | EOF);
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
      
    public class LinkAccombinar extends Action
      {
      public LinkAccombinar(Form form)
        {
        super(form);
        setName("accombinar");
        setTitle("&5 - Combinar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        
        try {
          if (parserSQL() == false) {
          Maefc.message("Se han encontrado errores en el procesamiento \nde las variables, por favor revíselas","Procesamiento de variables",Maefc.ERROR_MESSAGE, Maefc.OK_OPTION);
          //this.doShow();
          }
          else {
            super.onAction();
            splantillas.setWhere("plaplicacion = '" + aplicacion + "' and plcodigo = '" + qefplantilla.getString() + "' and plventana = '" + qeffrase.getString() + "'");
            splantillas.execute();    
            if(!splantillas.isEof()) {  
              plantilla = new mae.general.PlantillaJacob (splantillas.plurlplantilla.getString().trim());
              if(plantilla.existePlantilla()) {
                frase=llegeixFrase(qeffrase.getString());    
                if (!demanarParametres(true)) 
                return;    
                seleccio=new Seleccio();    
                seleccio.inicia();
                if (seleccio.quorelacioPrincipal.eof) {
                  Maefc.message("No se ha encontrado información que cumple con la selección efectuada");
                  return;
                }
                String sentencia = seleccio.quorelacioPrincipal.sentencia;
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
        
                java.io.StringBufferInputStream in=new java.io.StringBufferInputStream(xml);
                listado.setXmlDocument(com.sun.xml.tree.XmlDocument.createXmlDocument(in,false));
                //String origenDades = System.getProperty("user.dir")+ "\\DataSources\\"+ qeffrase.getString() +"_" + Fecha.fechaGregoriana(Maefc.getDate())+Fecha.getHora(Maefc.getDateTime(),"HHmmss") + ".csv";
                //String origenDades = System.getProperty("user.dir")+ "\\DataSources\\"+ qeffrase.getString() +"_" + Easp.usuario + ".csv";
                java.io.File fcsv = java.io.File.createTempFile("QUER", ".csv");
                String origenDades = fcsv.getAbsolutePath(); 
                PrintWork work = new PrintWork();
                work.add(listado);    
                work.setShowFinalMessage(false);
                PrintExcel excel =  new PrintExcel();
                excel.work = work;
                excel.destino = origenDades;
                excel.archivoCSV = true;
                excel.abrir = false;
                excel.printjob();
        
                combinaPlantilla(origenDades);	
                if(!fcsv.delete()) fcsv.deleteOnExit();
              }
              else {
                Maefc.message("Error: \"" + splantillas.plurlplantilla.getString() + "\"\nNo se encuentra el fichero asociado a la plantilla.\nPor favor asegurese de que existe y su ubicación es correcta.","¡Error!",Maefc.ERROR_MESSAGE);
              }
            }
            else {
              Maefc.message("Error: Debe notificar una plantilla válida para poder combinar datos.","¡Error!",Maefc.ERROR_MESSAGE);
            }
          }
        }
        catch (Exception ex) {
          Maefc.restoreCursor();
          Maefc.message("Error al combinar: Compruebe que la ruta del fichero es correcta","¡Error!",Maefc.ERROR_MESSAGE);
          System.out.println("Error al combinar:" + ex.getMessage());
          ex.printStackTrace();
        }
        }
      }
      
    public class LinkAclistar extends Action
      {
      public LinkAclistar(Form form)
        {
        super(form);
        setName("aclistar");
        setTitle("&6 - Listar ver. anterior");
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
        
        if (!demanarParametres(false)) 
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
      addSelect(splantillas=new Splantillas());
      addControl(qeffrase=new CtrlQeffrase(this));
      addControl(qefdescripcion=new CtrlQefdescripcion(this));
      addControl(qefplantilla=new CtrlQefplantilla(this));
      addAction(aclistarnew=new LinkAclistarnew(this));
      addAction(aclistarjr=new LinkAclistarjr(this));
      addAction(acdup=new LinkAcdup(this));
      addAction(acimportar=new LinkAcimportar(this));
      addAction(acexportar=new LinkAcexportar(this));
      addAction(accombinar=new LinkAccombinar(this));
      addAction(aclistar=new LinkAclistar(this));
      setSelect(squery);
      }
    public void onInit()
      {
      setInitState(SHOW);
      aclistarjr.setVisible(false);
      aclistar.setVisible(isOldButonListar);
      super.onInit();
      }
    public void onBeginRecord()
      {
      if(!qefplantilla.isNull())
        accombinar.setEnabled(true);
      else
        accombinar.setEnabled(false);
      super.onBeginRecord();
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
    public Field qefcount;
    public Field qefdescripcion;
    public Field qeffrase;
    public Field qefletra;
    public Field qefmaster;
    public Field qefpaginado;
    public Field qefplantilla;
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
      addField(qefcount=new Field(this,quefrase,"qefcount"));
      addField(qefdescripcion=new Field(this,quefrase,"qefdescripcion"));
      addField(qeffrase=new Field(this,quefrase,"qeffrase"));
      addField(qefletra=new Field(this,quefrase,"qefletra"));
      addField(qefmaster=new Field(this,quefrase,"qefmaster"));
      addField(qefpaginado=new Field(this,quefrase,"qefpaginado"));
      addField(qefplantilla=new Field(this,quefrase,"qefplantilla"));
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
    public Field qefcount;
    public Field qefdescripcion;
    public Field qefect;
    public Field qeffrase;
    public Field qeffrom;
    public Field qefletra;
    public Field qefmaster;
    public Field qefpaginado;
    public Field qefplantilla;
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
      addField(qefcount=new Field(this,quefrase,"qefcount"));
      addField(qefdescripcion=new Field(this,quefrase,"qefdescripcion"));
      addField(qefect=new Field(this,quefrase,"qefect"));
      addField(qeffrase=new Field(this,quefrase,"qeffrase"));
      addField(qeffrom=new Field(this,quefrase,"qeffrom"));
      addField(qefletra=new Field(this,quefrase,"qefletra"));
      addField(qefmaster=new Field(this,quefrase,"qefmaster"));
      addField(qefpaginado=new Field(this,quefrase,"qefpaginado"));
      addField(qefplantilla=new Field(this,quefrase,"qefplantilla"));
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
    public Field qeccontador;
    public Field qecformato;
    public Field qecfrase;
    public Field qecgrupby;
    public Field qecinipag;
    public Field qeclongitud;
    public Field qecmedia;
    public Field qecorden;
    public Field qecorderby;
    public Field qecrestriccion;
    public Field qecrotura;
    public Field qecsaltapag;
    public Field qecsum;
    public Field qectabla;
    public Field qectipo;
    public Field qectitrotura;
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
      addField(qeccontador=new Field(this,quecolumn,"qeccontador"));
      addField(qecformato=new Field(this,quecolumn,"qecformato"));
      addField(qecfrase=new Field(this,quecolumn,"qecfrase"));
      addField(qecgrupby=new Field(this,quecolumn,"qecgrupby"));
      addField(qecinipag=new Field(this,quecolumn,"qecinipag"));
      addField(qeclongitud=new Field(this,quecolumn,"qeclongitud"));
      addField(qecmedia=new Field(this,quecolumn,"qecmedia"));
      addField(qecorden=new Field(this,quecolumn,"qecorden"));
      addField(qecorderby=new Field(this,quecolumn,"qecorderby"));
      addField(qecrestriccion=new Field(this,quecolumn,"qecrestriccion"));
      addField(qecrotura=new Field(this,quecolumn,"qecrotura"));
      addField(qecsaltapag=new Field(this,quecolumn,"qecsaltapag"));
      addField(qecsum=new Field(this,quecolumn,"qecsum"));
      addField(qectabla=new Field(this,quecolumn,"qectabla"));
      addField(qectipo=new Field(this,quecolumn,"qectipo"));
      addField(qectitrotura=new Field(this,quecolumn,"qectitrotura"));
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
    
  // 
  public class Splantillas extends Select
    {
    // Tablas
    public Plantillas plantillas;
    // Campos
    public Field plaplicacion;
    public Field plcodigo;
    public Field plcodiquery;
    public Field plorigendades;
    public Field plurlplantilla;
    public Field plusuario;
    public Field plventana;
    class Plantillas extends Table
      {
      public Plantillas(Select select)
        {
        super(select);
        setName("plantillas");
        setOptions(READ);
        }
      }
      
    public Splantillas()
      {
      setName("splantillas");
      addTable(plantillas=new Plantillas(this));
      addField(plaplicacion=new Field(this,plantillas,"plaplicacion"));
      addField(plcodigo=new Field(this,plantillas,"plcodigo"));
      addField(plcodiquery=new Field(this,plantillas,"plcodiquery"));
      addField(plorigendades=new Field(this,plantillas,"plorigendades"));
      addField(plurlplantilla=new Field(this,plantillas,"plurlplantilla"));
      addField(plusuario=new Field(this,plantillas,"plusuario"));
      addField(plventana=new Field(this,plantillas,"plventana"));
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
    
    mae.jiss.datselec.ProgDatselec prconJiss=null;
    
    mae.jrenta.datselec.ProgDatselec prconJrenta = null;
    
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
        prconJiss=null;
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
        else if (aplicacion.equals("JISS")) {
           if ("S".equals(frase.ect)) {
              assigno=1;
              loc.setHeight(75+200);
              ControlPanel panel2=new ControlPanel(this);
              panel2.setLayout(new LayoutBorder());
              panel2.setParent(this);
      
              setLayout(new LayoutSplit(LayoutSplit.VERTICAL));
              prconJiss=new mae.jiss.datselec.ProgDatselec();
              panel.setLocation(new LocationSplit(LocationSplit.LEFT));
              prconJiss.setConnection(getDataBase());
              panel2.setLocation(new LocationSplit(LocationSplit.RIGHT));
              prconJiss.setParent(panel2);
              prconJiss.porEA='E';
      
              prconJiss.borrarSeleccionado = true;
              prconJiss.gejer=mae.jiss.general.Jiss.gEjercicio;
              prconJiss.gprograma="QUERY";
              prconJiss.desactivaLimpiar=true;
              prconJiss.setLocation(LocationBorder.locationBorderCenter);
           }
        }
        else if (aplicacion.equals("JRENTA")) {
           if ("D".equals(frase.ect)) {
              assigno=1;
              loc.setHeight(75+200);
              ControlPanel panel2=new ControlPanel(this);
              panel2.setLayout(new LayoutBorder());
              panel2.setParent(this);
      
              setLayout(new LayoutSplit(LayoutSplit.VERTICAL));
              prconJrenta=new mae.jrenta.datselec.ProgDatselec();
              panel.setLocation(new LocationSplit(LocationSplit.LEFT));
              prconJrenta.setConnection(getDataBase());
              panel2.setLocation(new LocationSplit(LocationSplit.RIGHT));
              prconJrenta.setParent(panel2);
      
              prconJrenta.borrarSeleccionado = true;
              prconJrenta.gejer=mae.jrenta.general.Jrenta.gEjercicio;
              prconJrenta.gprograma="QUERY";
              prconJrenta.desactivaLimpiar=true;
              prconJrenta.setLocation(LocationBorder.locationBorderCenter);
           }
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
        if (prconJiss!=null) prconJiss.run();
        if (prconJrenta!=null) prconJrenta.run();
      
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
      DBConnection dbduplic = null;
      if (aplicacion.equals("JCONTA")) dbduplic = getDataBase();
      else dbduplic = Aplication.getAplication().getDataBase();
      dbduplic.executeUpdate(
            "insert into quefrase" + 
            "( qefaplicacion,qeffrase,qefdescripcion,qefmaster,qeftitulo,qefapaisado,qefletra,qefpaginado,qeffrom,qefwhere,qefect,qefrepetir,qefcount )"+ 
            "select qefaplicacion,'" + codigo + "' as expr1 ,'" + descripcion + "' as expr2,"+
            "qefmaster,qeftitulo,qefapaisado,qefletra,qefpaginado,qeffrom,qefwhere,qefect,qefrepetir,qefcount from quefrase where  "+
            "qeffrase = '"+ vvqeffrase.getString() + "' and qefdescripcion = '" + vvqefdescripcio.getString() + "'");
    
      Selector sqcolumn = new Selector(dbduplic);
      sqcolumn.execute("SELECT * FROM quecolumn WHERE qecaplicacion = '" + aplicacion + "' and qecfrase = '" + vvqeffrase.getString() + "'");
      while(sqcolumn.next()) {
        orden = sqcolumn.getint("QECORDEN");
        dbduplic.executeUpdate(
            "insert into quecolumn" + 
            "( qecaplicacion,qecfrase,qecorden,qeccampo,qectitulo,qeclongitud,qectipo,qectabla,qecvisible,qecrestriccion,qecorderby,qecacumula,qecsaltapag,qecinipag,qecformato,qecbbdd,qecsum,qecgrupby)"+ 
            "select qecaplicacion,'" + codigo + "' as expr1 , qecorden,"+
            "qeccampo,qectitulo,qeclongitud,qectipo,qectabla,qecvisible,qecrestriccion,qecorderby ,qecacumula ,qecsaltapag,qecinipag,qecformato,qecbbdd,qecsum,qecgrupby from quecolumn where  "+
            "qecfrase = '"+ vvqeffrase.getString() + "' and qecorden = " + orden );
     }
     sqcolumn.close();
    
      Selector sqtabla = new Selector(dbduplic);
      sqtabla.execute("SELECT * FROM quetabla WHERE qetaplicacion = '" + aplicacion + "' and qetfrase = '" + vvqeffrase.getString() + "'");
      while(sqtabla.next()) {
        orden = sqtabla.getint("QETORDEN");
        dbduplic.executeUpdate(
            "insert into quetabla" + 
            "( qetaplicacion,qetfrase,qetorden,qettabla,qetbbdd,qetrelacion)"+ 
            "select qetaplicacion,'" + codigo + "' as expr1 , qetorden,"+
            "qettabla,qetbbdd,qetrelacion from quetabla where  "+
            "qetfrase = '"+ vvqeffrase.getString() + "' and qetorden = " + orden );
     }
     sqtabla.close();
    
      Selector sqvariable = new Selector(dbduplic);
      sqvariable.execute("SELECT * FROM quevariables WHERE qevaplicacion = '" + aplicacion + "' and qevfrase = '" + vvqeffrase.getString() + "'");
      while(sqvariable.next()) {
        orden = sqvariable.getint("QEVORDEN");
        dbduplic.executeUpdate(
            "insert into quevariables" + 
            "( qevaplicacion,qevfrase,qevorden,qevvariable,qevtipo,qevlongitud,qevtitulo,qevobligatorio,qevpredef,qevvalor,qevvisible,qevcomparacion,qevformato)"+ 
            "select qevaplicacion,'" + codigo + "' as expr1 , qevorden,"+
            "qevvariable,qevtipo,qevlongitud,qevtitulo,qevobligatorio,qevpredef,qevvalor,qevvisible,qevcomparacion,qevformato from quevariables where  "+
            "qevfrase = '"+ vvqeffrase.getString() + "' and qevorden = " + orden );
     }
     sqvariable.close();
    
     
     dbduplic.commit();
    
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
    squery.setDb(Aplication.getAplication().getDataBase());
    sprueba.setDb(Aplication.getAplication().getDataBase());
    splantillas.setDb(Easp.connEA);
    
    if (aplicacion.equals("JEO")) nomDirec="jEo";
    else if (aplicacion.equals("JMODELOS")) nomDirec="jModelos";
    else if (aplicacion.equals("JISS")) nomDirec="jIss";
    else if (aplicacion.equals("JRENTA")) nomDirec="jRenta";
    else if (aplicacion.equals("JCONTA")) {
      LocationWindow loc=new LocationWindow();
      loc.setWidth(795);
      loc.setHeight(490);
      setLocation(loc);
      setModal(true);
      squery.setDb(getDataBase());
      sprueba.setDb(getDataBase());
      nomDirec="jConta";
    }
    else nomDirec="jNomina";
    
    super.onInit();
    
    }
  }
  
