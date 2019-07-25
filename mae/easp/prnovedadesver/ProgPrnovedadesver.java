// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Thu Jul 25 09:35:16 CEST 2019
// 
// Aplicación: easp
// 
package mae.easp.prnovedadesver;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
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
    // GLOBALES: PROGRAMA
    public String aplicacion = "JNOMINA";

public String versiones[][] ;

public String versionesIncluye[][] ;

public java.awt.Color color1 = new java.awt.Color(0x8d,0xc1,0xcb);  // #8DC1CB   
public java.awt.Color color2 = new java.awt.Color(0xbc,0xdb,0xe0);  // #BCDBE0
public java.awt.Color color3 = new java.awt.Color(0xe2,0xdf,0xe2);  // #E2DFE2 
public final java.awt.Color colorblanc =new java.awt.Color(0xFF, 0xFF, 0xFF);
  

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
    // Metodos
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
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlVvversion vvversion;
        // Acciones
        // Fieldsets
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
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvversion(Form form)
                {
                super(form);
                setName("vvversion");
                setTitle("Versión");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVcabecera(ProgPrnovedadesver prnovedadesver)
            {
            super(prnovedadesver);
            setName("vcabecera");
            setLocation(new Location());
            setPrintable(false);
            setModal(true);
            // SET: VENTANA
            addControl(vvversion=new CtrlVvversion(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVdetalle extends MultiDataForm
        {
        // GLOBALES: VENTANA
        public java.awt.Color getCellColorBackground(boolean isSelected, boolean hasFocus, int row, int column) {
  if ( isSelected ) return null ; 
  else return null ; 
  /*
  else if ( column == 0  ) return color1 ;
  else if ( column == 1  ) return color2 ;
  else if ( column == 2  ) return color3 ;
  else                     return color3 ;
  */
  }
        // Metodos
        // Controles
        public CtrlParvariable parvariable;
        public CtrlPardesc pardesc;
        public CtrlParvalor parvalor;
        // Acciones
        public LinkAcverdoc acverdoc;
        // Fieldsets
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
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlParvariable(Form form)
                {
                super(form);
                setName("parvariable");
                setTitle("Versión");
                setType(STRING);
                setLength(8);
                setSearchable(true);
                setField(sparametros.parvariable);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlPardesc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlPardesc(Form form)
                {
                super(form);
                setName("pardesc");
                setTitle("Periodo");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sparametros.pardesc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlParvalor extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlParvalor(Form form)
                {
                super(form);
                setName("parvalor");
                setTitle("Tema Incluido");
                setType(STRING);
                setLength(85);
                setSearchable(true);
                setField(sparametros.parvalor);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAcverdoc extends Action
            {
            public LinkAcverdoc(Form form)
                {
                super(form);
                setName("acverdoc");
                setTitle("&1. Ver documentación");
                // SET: ACCION
                setOptions(SEARCH | SHOW | UPDATE | INSERT);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                
                String pathUrl = Easp.getUrlDocVersion("https://afinity.geyce.es/agpi/home/999999999999/ADMINISTRADOR/",aplicacion);
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
            // SET: VENTANA
            addSelect(sparametros=new Sparametros());
            addSelect(sparamutil=new Sparamutil());
            addControl(parvariable=new CtrlParvariable(this));
            addControl(pardesc=new CtrlPardesc(this));
            addControl(parvalor=new CtrlParvalor(this));
            addAction(acverdoc=new LinkAcverdoc(this));
            setSelect(sparametros);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Sparametros extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Parametros(Select select)
                {
                super(select);
                setName("parametros");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sparametros()
            {
            setName("sparametros");
            // SET: SELECT
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
        // GET: SELECT
        public String getWhere ()
            {
            return " parambito = 'NOVEDADES"+aplicacion+"' and paragrup = '"+aplicacion+"' " ;
            }
        public String getOrder ()
            {
            return "parvariable DESC , parusuario ";
            }
        // EVENT: SELECT
        }
        
    // 
    public class Sparamutil extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Parametros(Select select)
                {
                super(select);
                setName("parametros");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sparamutil()
            {
            setName("sparamutil");
            // SET: SELECT
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
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public ProgPrnovedadesver()
        {
        this.prnovedadesver=this;
        setName("prnovedadesver");
        setTitle("Novedades Versiones");
        // SET: PROGRAMA
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
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        vdetalle.setInitState(DataForm.SHOW);
        if ( versiones != null && versionesIncluye != null ) {
          cargarVersionesNew(); 
          super.onInit();
          }
        }
    }
    
