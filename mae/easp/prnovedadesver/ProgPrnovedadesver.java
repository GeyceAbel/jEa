// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20121109
// Hora:             09:09:34
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prnovedadesver;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prnovedadesver
// Nombre:   Novedades Versiones
// Versión:  1.0
// 
public class ProgPrnovedadesver extends Program
  {
  public AppEasp easp;
  public ProgPrnovedadesver prnovedadesver;
  // Inicio declaraciones globales
  
  public String aplicacion = "JNOMINA";
  
  public String versiones[][] ;
  
  public String versionesIncluye[][] ;
  
  public java.awt.Color color1 = new java.awt.Color(0x8d,0xc1,0xcb);  // #8DC1CB   
  public java.awt.Color color2 = new java.awt.Color(0xbc,0xdb,0xe0);  // #BCDBE0
  public java.awt.Color color3 = new java.awt.Color(0xe2,0xdf,0xe2);  // #E2DFE2 
    
  
  public void cargarVersionesNew() {
    
   try {
    sparamutil.getDataBase().executeUpdate("DELETE FROM PARAMETROS WHERE (parambito = 'NOVEDADESVERSION' or parambito = 'NOVEDADES"+aplicacion+"') and paragrup = '"+aplicacion+"'" );
    }
   catch(Exception e ) {
    }
  
    for ( int i = 0 ; i < versionesIncluye.length ; i++ ) {
  
      String version       = versionesIncluye[i][0] ;
      String num           = versionesIncluye[i][1] ;
      String desc          = versionesIncluye[i][2] ;  
      String periodo       = versionesIncluye[i][3] ;
  
      sparamutil.setWhere(" parambito = 'NOVEDADES"+aplicacion+"' and paragrup = '"+aplicacion+"'  and  parvariable = '"+version+"' and  parusuario = '"+num+"'");
      sparamutil.execute();
      if ( sparamutil.isEof() ) {
        sparamutil.addNew();
        sparamutil.pardominio     .setValue("999999999999");
        sparamutil.parusuario     .setValue(num);
        sparamutil.parambito      .setValue("NOVEDADES"+aplicacion);
        sparamutil.parvariable    .setValue(version);
        sparamutil.pardesc        .setValue(periodo);
        sparamutil.paragrup       .setValue(aplicacion);
        sparamutil.parvalor       .setValue(desc);
        // sparamutil.partipo        .setValue();
        sparamutil.parespecific   .setValue("N");
        sparamutil.insert();
        }
      }
      sparamutil.commit();
    }
  
  
  /*
  
    // Ejemplos variables versiones y versionesIncluye
  
    versiones = new String[][]  {
         {"18.8"     ,   "Octubre 2012"    , "JNOMINA18_8.pdf"     },
         {"18.7"     ,   "Agosto 2012"     , "JNOMINA18_7.pdf"     },
         {"18.6"     ,   "Junio 2012"      , "JNOMINA18_6.pdf"     },
         {"18.5"     ,   "Marzo 2012"      , "JNOMINA18_5.pdf"     },
         {"18.2"     ,   "Febrero 2012"    , "JNOMINA18_2.pdf"     },
         {"18.1"     ,   "Febrero 2012"    , "JNOMINA18_1.pdf"     },
         {"18.0"     ,   "Enero 2012"      , "JNOMINA18_0.pdf"     },
     };
  
     versionesIncluye = new String[][] {
      {"18.8"  ,"1"   ,   "Nuevos Tratamientos de Retribuciones Variables"                           , "2012-10"   },
      {"18.8"  ,"2"   ,   "Novedades introducidas en el Noticias RED 2012/08 "                       , "2012-10"   },
      {"18.7"  ,"1"   ,   "Novedades RDL 20/2012 Bonificaciones"                                     , "2012-08"   },
      {"18.7"  ,"2"   ,   "Novedades RDL 20/2012 conceptos no computables en la base de cotización"  , "2012-08"   },
      {"18.7"  ,"3"   ,   "Novedades Ley 3/2012  Indemnizaciones"                                    , "2012-08"   },
      {"18.7"  ,"4"   ,   "% Retención Profesionales"                                                , "2012-08"   },
      {"18.7"  ,"4"   ,   "Novedades RDL 20/2012 Plantillas de los Contratos Actualizadas"           , "2012-08"   },
      {"18.6"  ,"1"   ,   "Poder especificar el número de días de cobro de vacaciones en el cálculo de Finiquitos."           , "2012-06"   },
      {"18.6"  ,"2"   ,   "Resto Datos Certificado de Empresa"                                       , "2012-06"   },
      {"18.6"  ,"3"   ,   "Novedades en el tratamiento de Diarios"                                   , "2012-06"   },
      {"18.6"  ,"4"   ,   "Cerrar Incidencias Abiertas Cuando se Finiquita un trabajador"            , "2012-06"   },
      {"18.6"  ,"5"   ,   "Mensaje Recordatorio Cuotas Seguridad Social de Autónomos"                , "2012-06"   },
      {"18.6"  ,"6"   ,   "Tratamiento de Control Cuotas Seguridad Social de Autónomos"              , "2012-06"   },
      {"18.6"  ,"7"   ,   "Poder crear documentos de contratos (anexos) a parte del contrato "       , "2012-06"   },
      {"18.6"  ,"8"   ,   "Noticias RED 03/2012 Trabajadores Agrarios con más de 23 peonadas. "      , "2012-06"   },
      {"18.6"  ,"9"   ,   "Pantalla de IRPF Calculado "                                              , "2012-06"   },
    };
  */
  
  // Fin declaraciones globales
  // Ventana
  public FormVcabecera vcabecera;
  // Selects
  // Ventana
  public FormVdetalle vdetalle;
  // Selects
  public Sparametros sparametros;
  public Sparamutil sparamutil;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Novedades Versiones");
      }
    }
    
  public class FormVcabecera extends ProcessForm
    {
    // Controles
    public CtrlVvversion vvversion;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(1);
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVvversion extends ControlEdit
      {
      public CtrlVvversion(Form form)
        {
        super(form);
        setName("vvversion");
        setTitle("Versión");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      }
      
    public FormVcabecera(ProgPrnovedadesver prnovedadesver)
      {
      super(prnovedadesver);
      setName("vcabecera");
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addControl(vvversion=new CtrlVvversion(this));
      }
    }
    
  public class FormVdetalle extends MultiDataForm
    {
    // Inicio declaraciones globales
    
    
    public java.awt.Color getCellColorBackground(boolean isSelected, boolean hasFocus, int row, int column) {
      if ( isSelected ) return null ; 
      else if ( column == 0  ) return color1 ;
      else if ( column == 1  ) return color2 ;
      else if ( column == 2  ) return color3 ;
      else                     return color3 ;
      }
    
    // Fin declaraciones globales
    // Controles
    public CtrlParvariable parvariable;
    public CtrlPardesc pardesc;
    public CtrlParvalor parvalor;
    // Acciones
    public LinkAcverdoc acverdoc;
    class Location extends LocationBorder
      {
      public Location( )
        {
        super();
        setLocation(CENTER);
        }
      }
      
    public class CtrlParvariable extends ColumnEdit
      {
      public CtrlParvariable(Form form)
        {
        super(form);
        setName("parvariable");
        setTitle("Versión");
        setType(STRING);
        setLength(8);
        setSearchable(true);
        setField(sparametros.parvariable);
        }
      }
      
    public class CtrlPardesc extends ColumnEdit
      {
      public CtrlPardesc(Form form)
        {
        super(form);
        setName("pardesc");
        setTitle("Periodo");
        setType(STRING);
        setLength(7);
        setSearchable(true);
        setField(sparametros.pardesc);
        }
      }
      
    public class CtrlParvalor extends ColumnEdit
      {
      public CtrlParvalor(Form form)
        {
        super(form);
        setName("parvalor");
        setTitle("Tema Incluido");
        setType(STRING);
        setLength(85);
        setSearchable(true);
        setField(sparametros.parvalor);
        }
      }
      
    public class LinkAcverdoc extends Action
      {
      public LinkAcverdoc(Form form)
        {
        super(form);
        setName("acverdoc");
        setTitle("&1. Ver documentación");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        
        String pathUrl = "http://afinity.geyce.es/agpi/home/999999999999/ADMINISTRADOR/" ;
        String url = "" ;
        
        for ( int i = 0 ; i < versiones.length ; i++ ) {
            String version       = versiones[i][0] ;
            String periodo       = versiones[i][1] ;
            if ( version.equals(sparametros.parvariable.getString() ) ) {
              url           = versiones[i][2] ;  
              }
            }
        
        
        if ( url != null && !url.equals("") ) {
          Easp.abrirExplorer(pathUrl+url,false );
          }
        
        }
      }
      
    public FormVdetalle(ProgPrnovedadesver prnovedadesver)
      {
      super(prnovedadesver);
      setName("vdetalle");
      setTitle("Novedades");
      setLocation(new Location());
      setStates(SHOW | SEARCH);
      addSelect(sparametros=new Sparametros());
      addSelect(sparamutil=new Sparamutil());
      addControl(parvariable=new CtrlParvariable(this));
      addControl(pardesc=new CtrlPardesc(this));
      addControl(parvalor=new CtrlParvalor(this));
      addAction(acverdoc=new LinkAcverdoc(this));
      setSelect(sparametros);
      }
    }
    
  // 
  public class Sparametros extends Select
    {
    // Tablas
    public Parametros parametros;
    // Campos
    public Field paragrup;
    public Field parambito;
    public Field pardesc;
    public Field pardominio;
    public Field parespecific;
    public Field partipo;
    public Field parusuario;
    public Field parvalor;
    public Field parvariable;
    class Parametros extends Table
      {
      public Parametros(Select select)
        {
        super(select);
        setName("parametros");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sparametros()
      {
      setName("sparametros");
      addTable(parametros=new Parametros(this));
      addField(paragrup=new Field(this,parametros,"paragrup"));
      addField(parambito=new Field(this,parametros,"parambito"));
      addField(pardesc=new Field(this,parametros,"pardesc"));
      addField(pardominio=new Field(this,parametros,"pardominio"));
      addField(parespecific=new Field(this,parametros,"parespecific"));
      addField(partipo=new Field(this,parametros,"partipo"));
      addField(parusuario=new Field(this,parametros,"parusuario"));
      addField(parvalor=new Field(this,parametros,"parvalor"));
      addField(parvariable=new Field(this,parametros,"parvariable"));
      }
    public String getWhere()
      {
      return " parambito = 'NOVEDADES"+aplicacion+"' and paragrup = '"+aplicacion+"' " ;
      
      }
    public String getOrder()
      {
      return "parvariable DESC , parusuario ";
      }
    }
    
  // 
  public class Sparamutil extends Select
    {
    // Tablas
    public Parametros parametros;
    // Campos
    public Field paragrup;
    public Field parambito;
    public Field pardesc;
    public Field pardominio;
    public Field parespecific;
    public Field partipo;
    public Field parusuario;
    public Field parvalor;
    public Field parvariable;
    class Parametros extends Table
      {
      public Parametros(Select select)
        {
        super(select);
        setName("parametros");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sparamutil()
      {
      setName("sparamutil");
      addTable(parametros=new Parametros(this));
      addField(paragrup=new Field(this,parametros,"paragrup"));
      addField(parambito=new Field(this,parametros,"parambito"));
      addField(pardesc=new Field(this,parametros,"pardesc"));
      addField(pardominio=new Field(this,parametros,"pardominio"));
      addField(parespecific=new Field(this,parametros,"parespecific"));
      addField(partipo=new Field(this,parametros,"partipo"));
      addField(parusuario=new Field(this,parametros,"parusuario"));
      addField(parvalor=new Field(this,parametros,"parvalor"));
      addField(parvariable=new Field(this,parametros,"parvariable"));
      }
    }
    
  public ProgPrnovedadesver()
    {
    this.prnovedadesver=this;
    setName("prnovedadesver");
    setTitle("Novedades Versiones");
    setLayout(new LayoutBorder());
    setLocation(new Location());
    addForm(vcabecera=new FormVcabecera(this));
    addForm(vdetalle=new FormVdetalle(this));
    }
  public ProgPrnovedadesver(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    vdetalle.setInitState(DataForm.SHOW);
    if ( versiones != null && versionesIncluye != null ) {
      cargarVersionesNew(); 
      super.onInit();
      }
    }
  }
  
