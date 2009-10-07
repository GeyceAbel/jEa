// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20091007
// Hora:             13:50:08
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class AppEasp extends Aplication
  {
  // Inicio declaraciones globales
  public void onOpened() {
    super.onOpened();
    if (!Easp.initUser()) {
      Maefc.message("Imposible iniciar la aplicación","Aviso",Maefc.WARNING_MESSAGE);
      exit();
    }
    mae.easp.zzzprmenuprogs.ProgZzzprmenuprogs progMenu=new mae.easp.zzzprmenuprogs.ProgZzzprmenuprogs(this);
    progMenu.run();  
  }
  
  // Fin declaraciones globales
  public Barramenu barramenu;
  public Bdeasp bdeasp;
  public AppEasp()
    {
    setName("easp");
    setTitle("Entorno de aplicaciones para AGP");
    setMenuBar(barramenu=new Barramenu(this));
    setLayout(new LayoutTabbed());
    addDataBase(bdeasp=new Bdeasp(this));
    }
  public void onInit()
    {
    Aplication.getAplication().setWaitIcon(new Imagen("mae/easp/html/EASP.png"));
    Aplication.getAplication().setIcon(new Imagen("mae/easp/html/EASP.png"));
    Easp.dominio=Aplication.getAplication().getParameter("Dominio");
    Login.showLogIn(Aplication.getAplication());
    setAcl(mae.admon.general.Acceso.getAcl("EASP"));
    // setErrorManager(mae.admon.general.Admon.getErrorManager());
    
    Aplication.getAplication().setErrorManager(new mae.easp.general.ErrorManagerDefaultJ());
    
    super.onInit();
    if (!checkPermission() || !Easp.init())
      exit();
    
    /* Codigo para copiar en el MAIN
    AppEasp app=new AppEasp();
    app.setParameters(argv);
    Login.logIn(app);
    */
    }
  public static void main(String argv[])
    {
    AppEasp app=new AppEasp();
    app.setParameters(argv);
    Login.logIn(app);
    }
  }
  
// Barra de Menu de aplicación
class Barramenu extends MenuBar
  {
  public AppEasp easp;
  public Minstalacion minstalacion;
  public Mclientes mclientes;
  public Mdatosgenerales mdatosgenerales;
  public Musuarios musuarios;
  public Mimpresoras mimpresoras;
  public Mtablascomunes mtablascomunes;
  public Mlopd mlopd;
  public Mayuda mayuda;
  class Minstalacion extends Menu
    {
    public M1insconver m1insconver;
    public M1apl m1apl;
    public M1exportbd m1exportbd;
    class M1insconver extends MenuItemProgram
      {
      public M1insconver()
        {
        super("Actualizar BD a versión vigente");
        setName("m1insconver");
        setProgram("mae.easp.insprconver.ProgInsprconver");
        }
      }
      
    class M1apl extends MenuItemProgram
      {
      public M1apl()
        {
        super("Aplicaciones");
        setName("m1apl");
        setProgram("mae.easp.admaplic.ProgAdmaplic");
        }
      }
      
    class M1exportbd extends MenuItemProgram
      {
      public M1exportbd()
        {
        super("Traspasar BD Access - SQL SERVER");
        setName("m1exportbd");
        setProgram("mae.easp.insprexportbd.ProgInsprexportbd");
        }
      }
      
    public Minstalacion()
      {
      super("&Instalación");
      setName("minstalacion");
      add(m1insconver=new M1insconver());
      add(m1apl=new M1apl());
      add(m1exportbd=new M1exportbd());
      }
    }
    
  class Mclientes extends Menu
    {
    public M1ficha m1ficha;
    public M1importnifes m1importnifes;
    class M1ficha extends MenuItemProgram
      {
      public M1ficha()
        {
        super("&Ficha general");
        setName("m1ficha");
        setProgram("mae.easp.prselcdp.ProgPrselcdp");
        }
      }
      
    class M1importnifes extends MenuItemProgram
      {
      public M1importnifes()
        {
        super("Importación Clientes desde GEyCE Token");
        setName("m1importnifes");
        setProgram("mae.easp.praltanifes.ProgPraltanifes");
        }
      }
      
    public Mclientes()
      {
      super("&Clientes");
      setName("mclientes");
      add(m1ficha=new M1ficha());
      add(m1importnifes=new M1importnifes());
      }
    }
    
  class Mdatosgenerales extends Menu
    {
    public M1datosidentif m1datosidentif;
    public M1paramafinity m1paramafinity;
    public M1bdscargadas m1bdscargadas;
    public M1paramaplic m1paramaplic;
    class M1datosidentif extends MenuItemProgram
      {
      public M1datosidentif()
        {
        super("Datos identificación del despacho");
        setName("m1datosidentif");
        setProgram("mae.easp.prfichadp.ProgPrfichadp");
        }
      }
      
    class M1paramafinity extends MenuItemProgram
      {
      public M1paramafinity()
        {
        super("Parámetros AfinityWeb");
        setName("m1paramafinity");
        setProgram("mae.easp.prdgparamafinit.ProgPrdgparamafinit");
        }
      }
      
    class M1bdscargadas extends MenuItemProgram
      {
      public M1bdscargadas()
        {
        super("Base de datos y ubicaciones");
        setName("m1bdscargadas");
        setProgram("mae.easp.prbds.ProgPrbds");
        }
      }
      
    class M1paramaplic extends MenuItemProgram
      {
      public M1paramaplic()
        {
        super("Parámetros Aplicaciones");
        setName("m1paramaplic");
        setProgram("mae.easp.prparams.ProgPrparams");
        }
      }
      
    public Mdatosgenerales()
      {
      super("Datos &Generales");
      setName("mdatosgenerales");
      add(m1datosidentif=new M1datosidentif());
      add(m1paramafinity=new M1paramafinity());
      add(m1bdscargadas=new M1bdscargadas());
      add(m1paramaplic=new M1paramaplic());
      }
    }
    
  class Musuarios extends Menu
    {
    public Musers musers;
    public Mgrupos mgrupos;
    public Meventos meventos;
    public Mpermisosge mpermisosge;
    public Mpermisoslo mpermisoslo;
    public M1fechas m1fechas;
    public Mimpousers mimpousers;
    class Musers extends MenuItemProgram
      {
      public Musers()
        {
        super("&Usuarios");
        setName("musers");
        setProgram("mae.easp.uspusers.ProgUspusers");
        }
      }
      
    class Mgrupos extends MenuItemProgram
      {
      public Mgrupos()
        {
        super("&Grupos");
        setName("mgrupos");
        setProgram("mae.easp.uspusuarios.ProgUspusuarios");
        }
      }
      
    class Meventos extends MenuItemProgram
      {
      public Meventos()
        {
        super("&Control Accesos");
        setName("meventos");
        setProgram("mae.easp.uspermrecursos.ProgUspermrecursos");
        }
      }
      
    class Mpermisosge extends MenuItemProgram
      {
      public Mpermisosge()
        {
        super("Permisos por grupos");
        setName("mpermisosge");
        setProgram("mae.easp.usppermisos.ProgUsppermisos");
        }
      }
      
    class Mpermisoslo extends MenuItemProgram
      {
      public Mpermisoslo()
        {
        super("Permisos por usuario");
        setName("mpermisoslo");
        setProgram("mae.easp.usppermisoslo.ProgUsppermisoslo");
        }
      }
      
    class M1fechas extends MenuItemProgram
      {
      public M1fechas()
        {
        super("&Empresas actuales por usuario");
        setName("m1fechas");
        setProgram("mae.easp.prfechas.ProgPrfechas");
        }
      }
      
    class Mimpousers extends MenuItemProgram
      {
      public Mimpousers()
        {
        super("&Importar usuarios Afinity");
        setName("mimpousers");
        setProgram("mae.easp.praltausers.ProgPraltausers");
        }
      }
      
    public Musuarios()
      {
      super("&Usuarios y permisos");
      setName("musuarios");
      add(musers=new Musers());
      add(mgrupos=new Mgrupos());
      add(meventos=new Meventos());
      add(mpermisosge=new Mpermisosge());
      add(mpermisoslo=new Mpermisoslo());
      add(m1fechas=new M1fechas());
      add(mimpousers=new Mimpousers());
      }
    }
    
  class Mimpresoras extends Menu
    {
    public M1impdisp m1impdisp;
    public M1impformpag m1impformpag;
    public M1imptipos m1imptipos;
    public M1emu m1emu;
    public M1impdef m1impdef;
    class M1impdisp extends MenuItemProgram
      {
      public M1impdisp()
        {
        super("Impresoras disponibles");
        setName("m1impdisp");
        setProgram("mae.easp.admimprdisp.ProgAdmimprdisp");
        }
      }
      
    class M1impformpag extends MenuItemProgram
      {
      public M1impformpag()
        {
        super("Formatos de página");
        setName("m1impformpag");
        setProgram("mae.easp.admformpag.ProgAdmformpag");
        }
      }
      
    class M1imptipos extends MenuItemProgram
      {
      public M1imptipos()
        {
        super("Tipos de impresión");
        setName("m1imptipos");
        setProgram("mae.easp.admtipimpr.ProgAdmtipimpr");
        }
      }
      
    class M1emu extends MenuItemProgram
      {
      public M1emu()
        {
        super("Emulaciones y atributos");
        setName("m1emu");
        setProgram("mae.easp.admemuyatrib.ProgAdmemuyatrib");
        }
      }
      
    class M1impdef extends MenuItemProgram
      {
      public M1impdef()
        {
        super("Impresoras por usuario");
        setName("m1impdef");
        setProgram("mae.easp.admimprusu.ProgAdmimprusu");
        }
      }
      
    public Mimpresoras()
      {
      super("I&mpresoras");
      setName("mimpresoras");
      add(m1impdisp=new M1impdisp());
      add(m1impformpag=new M1impformpag());
      add(m1imptipos=new M1imptipos());
      add(m1emu=new M1emu());
      add(m1impdef=new M1impdef());
      }
    }
    
  class Mtablascomunes extends Menu
    {
    public M1notas m1notas;
    public M1incidef m1incidef;
    public M1inciden m1inciden;
    public M1gestionerror m1gestionerror;
    public M1gestmir m1gestmir;
    class M1notas extends MenuItemProgram
      {
      public M1notas()
        {
        super("Notas");
        setName("m1notas");
        setProgram("mae.easp.admnotas.ProgAdmnotas");
        }
      }
      
    class M1incidef extends MenuItemProgram
      {
      public M1incidef()
        {
        super("Definición de incidencias");
        setName("m1incidef");
        setProgram("mae.easp.admdeferr.ProgAdmdeferr");
        }
      }
      
    class M1inciden extends MenuItemProgram
      {
      public M1inciden()
        {
        super("Incidencias");
        setName("m1inciden");
        setProgram("mae.easp.adminciden.ProgAdminciden");
        }
      }
      
    class M1gestionerror extends MenuItemProgram
      {
      public M1gestionerror()
        {
        super("Gestión de errores");
        setName("m1gestionerror");
        setProgram("mae.easp.prerrgestio.ProgPrerrgestio");
        }
      }
      
    class M1gestmir extends MenuItemProgram
      {
      public M1gestmir()
        {
        super("Gestión documentos e-Mir");
        setName("m1gestmir");
        setProgram("mae.easp.prgestdocsmir.ProgPrgestdocsmir");
        }
      }
      
    public Mtablascomunes()
      {
      super("U&tilidades");
      setName("mtablascomunes");
      add(m1notas=new M1notas());
      add(m1incidef=new M1incidef());
      add(m1inciden=new M1inciden());
      add(m1gestionerror=new M1gestionerror());
      add(m1gestmir=new M1gestmir());
      }
    }
    
  class Mlopd extends Menu
    {
    public M1lopdacc m1lopdacc;
    public M1lopdocopias m1lopdocopias;
    public M1lopdinciden m1lopdinciden;
    class M1lopdacc extends MenuItemProgram
      {
      public M1lopdacc()
        {
        super("Control de Accesos");
        setName("m1lopdacc");
        setProgram("mae.easp.lopdacciones.ProgLopdacciones");
        }
      }
      
    class M1lopdocopias extends MenuItemProgram
      {
      public M1lopdocopias()
        {
        super("Control de copias");
        setName("m1lopdocopias");
        setProgram("mae.easp.lopdcopias.ProgLopdcopias");
        }
      }
      
    class M1lopdinciden extends MenuItemProgram
      {
      public M1lopdinciden()
        {
        super("Control de Incidencias");
        setName("m1lopdinciden");
        setProgram("mae.easp.lopdincidencias.ProgLopdincidencias");
        }
      }
      
    public Mlopd()
      {
      super("&LOPD");
      setName("mlopd");
      add(m1lopdacc=new M1lopdacc());
      add(m1lopdocopias=new M1lopdocopias());
      add(m1lopdinciden=new M1lopdinciden());
      }
    }
    
  class Mayuda extends Menu
    {
    public M1acercade m1acercade;
    class M1acercade extends MenuItemProgram
      {
      public M1acercade()
        {
        super("Acerca de...");
        setName("m1acercade");
        setProgram("mae.easp.zzzpracercade.ProgZzzpracercade");
        }
      }
      
    public Mayuda()
      {
      super("&Ayuda");
      setName("mayuda");
      add(m1acercade=new M1acercade());
      }
    }
    
  public Barramenu(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    setName("barramenu");
    add(minstalacion=new Minstalacion());
    add(mclientes=new Mclientes());
    add(mdatosgenerales=new Mdatosgenerales());
    add(musuarios=new Musuarios());
    add(mimpresoras=new Mimpresoras());
    add(mtablascomunes=new Mtablascomunes());
    add(mlopd=new Mlopd());
    add(mayuda=new Mayuda());
    }
  }
  
// BDs
class Bdeasp extends DataBase
  {
  public AppEasp easp;
  // Catalogos
  public CatAdmon catadmon;
  public CatCtasp catctasp;
  public CatEasp cateasp;
  public CatJeo catjeo;
  public CatLaboral catlaboral;
  public CatModelos1 catmodelos1;
  public CatModelos2 catmodelos2;
  public CatModgen catmodgen;
  public Bdeasp(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    setServer("jdbc:odbc:");
    setName("bdeasp");
    catadmon = new CatAdmon();
    catctasp = new CatCtasp();
    cateasp = new CatEasp();
    catjeo = new CatJeo();
    catlaboral = new CatLaboral();
    catmodelos1 = new CatModelos1();
    catmodelos2 = new CatModelos2();
    catmodgen = new CatModgen();
    Catalog array[] = {
      catadmon,
      catctasp,
      cateasp,
      catjeo,
      catlaboral,
      catmodelos1,
      catmodelos2,
      catmodgen      
      };
    setCatalogs(array);
    }
  }
  
