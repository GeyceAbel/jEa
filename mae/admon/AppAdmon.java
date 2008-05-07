// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20020321
// Hora:             10:21:36
// Driver BD:        ODBC
// Base de Datos:    bdadmonprog
// 
// Aplicación: admon - ADMON
// Versión:    1.3.1
// 
package mae.admon;
// 
import geyce.maefc.*;
import mae.admon.general.*;
import mae.admon.db.*;
import mae.general.*;
// 
public class AppAdmon extends Aplication
  {
  // Inicio declaraciones globales
  public DataBase bdactual=null;
  public String nombreAplicacion="admon";
  
  
  // Fin declaraciones globales
  public Barramenu barramenu;
  public Bdadmon bdadmon;
  public AppAdmon()
    {
    setName("admon");
    setTitle("ADMON");
    setMenuBar(barramenu=new Barramenu(this));
    setLayout(new LayoutTabbed());
    addDataBase(bdadmon=new Bdadmon(this));
    }
  public void onInit()
    {
    /*if (!mae.admon.general.Admon.controlVersionFC(version_JediFC))
      exit();
    else{*/
      Login.showLogIn(Aplication.getAplication());
      setAcl(Acceso.getAcl("ADMON"));
      setErrorManager(Admon.getErrorManager());
      super.onInit();
    /*  if (!Admon.init() || !Admon.controlBdAdmon() ||
          !Admon.controlBdAplicacion(version_bd,Sivico.geversio)) */
      if (!Admon.init())
        exit();
    //  }
    
    
    
    }
  public static void main(String argv[])
    {
    (new AppAdmon()).run();
    }
  }
  
// Barra de Menu de aplicación
class Barramenu extends MenuBar
  {
  public AppAdmon admon;
  public Musuarios musuarios;
  public Mimpresoras mimpresoras;
  public Configuracion configuracion;
  public Replicadorbd replicadorbd;
  public Mincidencias mincidencias;
  public Acercade acercade;
  class Musuarios extends Menu
    {
    public Musers musers;
    public Mgrupos mgrupos;
    public Meventos meventos;
    public Mpermisosge mpermisosge;
    public Mpermisoslo mpermisoslo;
    class Musers extends MenuItemProgram
      {
      public Musers()
        {
        super("Usuarios");
        setName("musers");
        setProgram("mae.admon.uspusers.ProgUspusers");
        }
      }
      
    class Mgrupos extends MenuItemProgram
      {
      public Mgrupos()
        {
        super("Grupos");
        setName("mgrupos");
        setProgram("mae.admon.uspusuarios.ProgUspusuarios");
        }
      }
      
    class Meventos extends MenuItemProgram
      {
      public Meventos()
        {
        super("Permisos recursos");
        setName("meventos");
        setProgram("mae.admon.uspermrecursos.ProgUspermrecursos");
        }
      }
      
    class Mpermisosge extends MenuItemProgram
      {
      public Mpermisosge()
        {
        super("Permisos generales");
        setName("mpermisosge");
        setProgram("mae.admon.usppermisos.ProgUsppermisos");
        }
      }
      
    class Mpermisoslo extends MenuItemProgram
      {
      public Mpermisoslo()
        {
        super("Permisos locales");
        setName("mpermisoslo");
        setProgram("mae.admon.usppermisoslo.ProgUsppermisoslo");
        }
      }
      
    public Musuarios()
      {
      super("&Usuarios");
      setName("musuarios");
      add(musers=new Musers());
      add(mgrupos=new Mgrupos());
      add(meventos=new Meventos());
      add(mpermisosge=new Mpermisosge());
      add(mpermisoslo=new Mpermisoslo());
      }
    }
    
  class Mimpresoras extends Menu
    {
    public Mimprdisp mimprdisp;
    public Mformpag mformpag;
    public Mtiposimp mtiposimp;
    public Mconfimp mconfimp;
    public Mimprusu mimprusu;
    class Mimprdisp extends MenuItemProgram
      {
      public Mimprdisp()
        {
        super("Impresoras disponibles");
        setName("mimprdisp");
        setProgram("mae.admon.admimprdisp.ProgAdmimprdisp");
        }
      }
      
    class Mformpag extends MenuItemProgram
      {
      public Mformpag()
        {
        super("Formatos de página");
        setName("mformpag");
        setProgram("mae.admon.admformpag.ProgAdmformpag");
        }
      }
      
    class Mtiposimp extends MenuItemProgram
      {
      public Mtiposimp()
        {
        super("Tipos de impresión");
        setName("mtiposimp");
        setProgram("mae.admon.admtipimpr.ProgAdmtipimpr");
        }
      }
      
    class Mconfimp extends MenuItemProgram
      {
      public Mconfimp()
        {
        super("Emulaciones y atributos");
        setName("mconfimp");
        setProgram("mae.admon.admemuyatrib.ProgAdmemuyatrib");
        }
      }
      
    class Mimprusu extends MenuItemProgram
      {
      public Mimprusu()
        {
        super("Impresoras por usuario");
        setName("mimprusu");
        setProgram("mae.admon.admimprusu.ProgAdmimprusu");
        }
      }
      
    public Mimpresoras()
      {
      super("&Impresoras");
      setName("mimpresoras");
      add(mimprdisp=new Mimprdisp());
      add(mformpag=new Mformpag());
      add(mtiposimp=new Mtiposimp());
      add(mconfimp=new Mconfimp());
      add(mimprusu=new Mimprusu());
      }
    }
    
  class Configuracion extends Menu
    {
    public Aplicaciones aplicaciones;
    class Aplicaciones extends MenuItemProgram
      {
      public Aplicaciones()
        {
        super("Configuración");
        setName("aplicaciones");
        setProgram("mae.admon.admaplic.ProgAdmaplic");
        }
      }
      
    public Configuracion()
      {
      super("&Aplicaciones");
      setName("configuracion");
      add(aplicaciones=new Aplicaciones());
      }
    }
    
  class Replicadorbd extends Menu
    {
    public Configuracionrb configuracionrb;
    public Consultas consultas;
    public Administracion administracion;
    class Configuracionrb extends Menu
      {
      public Mactivar mactivar;
      public Consulados consulados;
      public Grupos grupos;
      public Tablas tablas;
      class Mactivar extends MenuItemProgram
        {
        public Mactivar()
          {
          super("Activar/Desactivar una Sede");
          setName("mactivar");
          setProgram("mae.admon.admactivasede.ProgAdmactivasede");
          }
        }
        
      class Consulados extends MenuItemProgram
        {
        public Consulados()
          {
          super("Configurar consulados");
          setName("consulados");
          setProgram("mae.admon.rbdcosedes.ProgRbdcosedes");
          }
        }
        
      class Grupos extends MenuItemProgram
        {
        public Grupos()
          {
          super("Configurar grupos");
          setName("grupos");
          setProgram("mae.admon.rbdcogrupos.ProgRbdcogrupos");
          }
        }
        
      class Tablas extends MenuItemProgram
        {
        public Tablas()
          {
          super("Control replicacion");
          setName("tablas");
          setProgram("mae.admon.rbdcotablas.ProgRbdcotablas");
          }
        }
        
      public Configuracionrb()
        {
        super("Configuración");
        setName("configuracionrb");
        add(mactivar=new Mactivar());
        add(consulados=new Consulados());
        add(grupos=new Grupos());
        add(tablas=new Tablas());
        }
      }
      
    class Consultas extends Menu
      {
      public Panelcontrol panelcontrol;
      public Log log;
      public Firmas firmas;
      public Cambios cambios;
      class Panelcontrol extends MenuItemProgram
        {
        public Panelcontrol()
          {
          super("Estado replicación por sede");
          setName("panelcontrol");
          setProgram("mae.admon.rbdcspanctrl.ProgRbdcspanctrl");
          }
        }
        
      class Log extends MenuItemProgram
        {
        public Log()
          {
          super("Consultar Log de incidencias");
          setName("log");
          setProgram("mae.admon.rbdcslog.ProgRbdcslog");
          }
        }
        
      class Firmas extends MenuItemProgram
        {
        public Firmas()
          {
          super("Firmas de tablas");
          setName("firmas");
          setProgram("mae.admon.rbdadfirmas.ProgRbdadfirmas");
          }
        }
        
      class Cambios extends MenuItemProgram
        {
        public Cambios()
          {
          super("Tabla de cambios");
          setName("cambios");
          setProgram("mae.admon.rbdadcambios.ProgRbdadcambios");
          }
        }
        
      public Consultas()
        {
        super("Consultas");
        setName("consultas");
        add(panelcontrol=new Panelcontrol());
        add(log=new Log());
        add(firmas=new Firmas());
        add(cambios=new Cambios());
        }
      }
      
    class Administracion extends Menu
      {
      public Descarga descarga;
      public Carga carga;
      public Ejecucion ejecucion;
      public Backup backup;
      public Recuperarbd recuperarbd;
      public Reset reset;
      class Descarga extends MenuItemProgram
        {
        public Descarga()
          {
          super("Descargar cambios");
          setName("descarga");
          setProgram("mae.admon.rbdaddescarga.ProgRbdaddescarga");
          }
        }
        
      class Carga extends MenuItemProgram
        {
        public Carga()
          {
          super("Cargar cambios");
          setName("carga");
          setProgram("mae.admon.rbdadcarga.ProgRbdadcarga");
          }
        }
        
      class Ejecucion extends MenuItemProgram
        {
        public Ejecucion()
          {
          super("Ejecutar cambios");
          setName("ejecucion");
          setProgram("mae.admon.rbdadejecucion.ProgRbdadejecucion");
          }
        }
        
      class Backup extends MenuItemProgram
        {
        public Backup()
          {
          super("Proceso de backup");
          setName("backup");
          setProgram("mae.admon.rbdadbackup.ProgRbdadbackup");
          }
        }
        
      class Recuperarbd extends MenuItemProgram
        {
        public Recuperarbd()
          {
          super("Recuperar BD");
          setName("recuperarbd");
          setProgram("mae.admon.rbdadrecbd.ProgRbdadrecbd");
          }
        }
        
      class Reset extends MenuItemProgram
        {
        public Reset()
          {
          super("Resetear Firmas");
          setName("reset");
          setProgram("mae.admon.rbdadreset.ProgRbdadreset");
          }
        }
        
      public Administracion()
        {
        super("Administración");
        setName("administracion");
        add(descarga=new Descarga());
        add(carga=new Carga());
        add(ejecucion=new Ejecucion());
        add(backup=new Backup());
        add(recuperarbd=new Recuperarbd());
        add(reset=new Reset());
        }
      }
      
    public Replicadorbd()
      {
      super("&Replicador BD");
      setName("replicadorbd");
      add(configuracionrb=new Configuracionrb());
      add(consultas=new Consultas());
      add(administracion=new Administracion());
      }
    }
    
  class Mincidencias extends Menu
    {
    public Mdefinicion mdefinicion;
    public Mlog mlog;
    class Mdefinicion extends MenuItemProgram
      {
      public Mdefinicion()
        {
        super("Definición");
        setName("mdefinicion");
        setProgram("mae.admon.admdeferr.ProgAdmdeferr");
        }
      }
      
    class Mlog extends MenuItemProgram
      {
      public Mlog()
        {
        super("Log");
        setName("mlog");
        setProgram("mae.admon.adminciden.ProgAdminciden");
        }
      }
      
    public Mincidencias()
      {
      super("I&ncidencias");
      setName("mincidencias");
      add(mdefinicion=new Mdefinicion());
      add(mlog=new Mlog());
      }
    }
    
  class Acercade extends Menu
    {
    public Atacerca atacerca;
    class Atacerca extends MenuItemProgram
      {
      public Atacerca()
        {
        super("Acerca de...");
        setName("atacerca");
        setProgram("mae.admon.acercade.ProgAcercade");
        }
      }
      
    public Acercade()
      {
      super("A&cerca de ...");
      setName("acercade");
      add(atacerca=new Atacerca());
      }
    }
    
  public Barramenu(AppAdmon admon)
    {
    super(admon);
    this.admon=admon;
    setName("barramenu");
    add(musuarios=new Musuarios());
    add(mimpresoras=new Mimpresoras());
    add(configuracion=new Configuracion());
    add(replicadorbd=new Replicadorbd());
    add(mincidencias=new Mincidencias());
    add(acercade=new Acercade());
    }
  }
  
// BDs
class Bdadmon extends DataBase
  {
  public AppAdmon admon;
  // Catalogos
  public CatBdadmon catbdadmon;
  public Bdadmon(AppAdmon admon)
    {
    super(admon);
    this.admon=admon;
    setServer("jdbc:odbc:");
    setName("bdadmon");
    setUser("admin");
    setPassword("admin");
    catbdadmon = new CatBdadmon();
    Catalog array[] = {
      catbdadmon      
      };
    setCatalogs(array);
    }
  }
  
