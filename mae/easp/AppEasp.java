// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Tue Jan 29 11:30:14 CET 2019
// 
// Aplicación: easp
// 
package mae.easp;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: APLICACION
public class AppEasp extends Aplication
    {
    // GLOBALES: APLICACION
    public void onOpened() {
  super.onOpened();
  if (!Easp.initUser()) {
    Maefc.message("Imposible iniciar la aplicación","Aviso",Maefc.WARNING_MESSAGE);
    exit();
  }
  mae.easp.zzzprmenuprogs.ProgZzzprmenuprogs progMenu=new mae.easp.zzzprmenuprogs.ProgZzzprmenuprogs(this);
  progMenu.run();  
}

  Menu eliminaOpcioSubmenu(MenuBar barra,String menu, String submenu, String opcio) {
    Menu[] menutmp = barra.getItems();
    for(int i=0;i<menutmp.length;i++) {
      if (menutmp[i].getName().toLowerCase().equals(menu.toLowerCase())) {        
        MenuItem[] submenus1=menutmp[i].getItems();
        for(int j=0;j<submenus1.length;j++) {
          if (submenus1[j].getName().toLowerCase().equals(submenu.toLowerCase())) {
            MenuItem[] submenus2=((Menu)submenus1[j]).getItems();
            for(int k=0;k<submenus2.length;k++) {
              if (submenus2[k].getName().toLowerCase().equals(opcio.toLowerCase())) {
                ((Menu)submenus1[j]).remove(submenus2[k]);
              }
            }
          }
        }  
      }
    }
    return null;
  }
    // Metodos
    public Barramenu barramenu;
    public Bdeasp bdeasp;
    public AppEasp()
        {
        setName("easp");
        setTitle("Entorno de aplicaciones para AGP");
        setMenuBar(barramenu=new Barramenu(this));
        setLayout(new LayoutTabbed());
        // SET: APLICACION
        addDataBase(bdeasp=new Bdeasp(this));
        }
    // GET: APLICACION
    // EVENT: APLICACION
    public void onInit ()
        {
        String destinoEjecucion =  System.getProperty("user.dir")+"\\";
        if ( System.getProperty("java.version").startsWith("1.8") && !mae.modasp.general.Modasp.existeFichero(destinoEjecucion+"JdbcOdbc.dll") ) {
          mae.modasp.general.Modasp.setFileFromjar(destinoEjecucion,"JdbcOdbc.dll",destinoEjecucion+"JdbcOdbc.dll");
        }	  
        
        Aplication.getAplication().setWaitIcon(new Imagen("mae/easp/html/EASP.png"));
        Aplication.getAplication().setIcon(new Imagen("mae/easp/html/EASP.png"));
        Easp.dominio=Aplication.getAplication().getParameter("Dominio");
        Login.showLogIn(Aplication.getAplication(),"mae/easp/html/jea48.png",Easp.isPassMD5());

setAcl(mae.admon.general.Acceso.getAcl("EASP"));
        // setErrorManager(mae.admon.general.Admon.getErrorManager());
        
        Aplication.getAplication().setErrorManager(new mae.easp.general.ErrorManagerDefaultJ());
        
        /*if (!"S".equals(Aplication.getAplication().getConfig("CNVLOGCLASS")) ) {
          eliminaOpcioSubmenu(Aplication.getAplication().getMenuBar(),"minstalacion", "m1otrasaplic", "m1logclass");
        }*/
        
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
        public M1otrasaplic m1otrasaplic;
        public M1exportbd m1exportbd;
        public M1creaindices m1creaindices;
        class M1insconver extends MenuItemProgram
            {
            public M1insconver()
                {
                super("Actualizar BD a versión vigente");
                setName("m1insconver");
                setProgram("mae.easp.insprconver.ProgInsprconver");
                // SET: MENU
                }
            }
            
        class M1otrasaplic extends Menu
            {
            public M1logclass m1logclass;
            public M1logicclass m1logicclass;
            class M1logclass extends MenuItemProgram
                {
                public M1logclass()
                    {
                    super("Logic CLASS - Lógic Control");
                    setName("m1logclass");
                    setProgram("mae.easp.cnvlogicclass.ProgCnvlogicclass");
                    // SET: MENU
                    }
                }
                
            class M1logicclass extends MenuItemProgram
                {
                public M1logicclass()
                    {
                    super("NIFES Logic CLASS - Lógic Control");
                    setName("m1logicclass");
                    setProgram("mae.easp.auxlogicclass.ProgAuxlogicclass");
                    // SET: MENU
                    }
                }
                
            public M1otrasaplic()
                {
                super("&Importación datos Otras Aplicaciones");
                setName("m1otrasaplic");
                // SET: MENU
                add(m1logclass=new M1logclass());
                add(m1logicclass=new M1logicclass());
                }
            }
            
        class M1exportbd extends MenuItemProgram
            {
            public M1exportbd()
                {
                super("Traspasar BD Access - SQL SERVER");
                setName("m1exportbd");
                setProgram("mae.easp.insprexportbd.ProgInsprexportbd");
                // SET: MENU
                }
            }
            
        class M1creaindices extends MenuItemProgram
            {
            public M1creaindices()
                {
                super("Gestión Indices BD");
                setName("m1creaindices");
                setProgram("mae.easp.insindices.ProgInsindices");
                // SET: MENU
                }
            }
            
        public Minstalacion()
            {
            super("&Configuración");
            setName("minstalacion");
            // SET: MENU
            add(m1insconver=new M1insconver());
            add(m1otrasaplic=new M1otrasaplic());
            add(m1exportbd=new M1exportbd());
            add(m1creaindices=new M1creaindices());
            }
        }
        
    class Mclientes extends Menu
        {
        public M1ficha m1ficha;
        public M1bancoscli m1bancoscli;
        public M1repres m1repres;
        public M1nifesmuf m1nifesmuf;
        class M1ficha extends MenuItemProgram
            {
            public M1ficha()
                {
                super("&Ficha general");
                setName("m1ficha");
                setProgram("mae.easp.prselcdp.ProgPrselcdp");
                // SET: MENU
                }
            }
            
        class M1bancoscli extends MenuItemProgram
            {
            public M1bancoscli()
                {
                super("Bancos Clientes");
                setName("m1bancoscli");
                setProgram("mae.easp.prbancocli.ProgPrbancocli");
                // SET: MENU
                }
            }
            
        class M1repres extends MenuItemProgram
            {
            public M1repres()
                {
                super("&Representantes");
                setName("m1repres");
                setProgram("mae.easp.prrepresentante.ProgPrrepresentante");
                // SET: MENU
                }
            }
            
        class M1nifesmuf extends MenuItemProgram
            {
            public M1nifesmuf()
                {
                super("Miembros Unidad Familiar");
                setName("m1nifesmuf");
                setProgram("mae.easp.prnifesmuf.ProgPrnifesmuf");
                // SET: MENU
                }
            }
            
        public Mclientes()
            {
            super("&Clientes");
            setName("mclientes");
            // SET: MENU
            add(m1ficha=new M1ficha());
            add(m1bancoscli=new M1bancoscli());
            add(m1repres=new M1repres());
            add(m1nifesmuf=new M1nifesmuf());
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
                // SET: MENU
                }
            }
            
        class M1paramafinity extends MenuItemProgram
            {
            public M1paramafinity()
                {
                super("Parámetros AfinityWeb");
                setName("m1paramafinity");
                setProgram("mae.easp.prdgparamafinit.ProgPrdgparamafinit");
                // SET: MENU
                }
            }
            
        class M1bdscargadas extends MenuItemProgram
            {
            public M1bdscargadas()
                {
                super("Base de datos y ubicaciones");
                setName("m1bdscargadas");
                setProgram("mae.easp.prbds.ProgPrbds");
                // SET: MENU
                }
            }
            
        class M1paramaplic extends MenuItemProgram
            {
            public M1paramaplic()
                {
                super("Parámetros Aplicaciones");
                setName("m1paramaplic");
                setProgram("mae.easp.prparams.ProgPrparams");
                // SET: MENU
                }
            }
            
        public Mdatosgenerales()
            {
            super("Datos &Generales");
            setName("mdatosgenerales");
            // SET: MENU
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
        public Mdesbloquearses mdesbloquearses;
        class Musers extends MenuItemProgram
            {
            public Musers()
                {
                super("&Usuarios");
                setName("musers");
                setProgram("mae.easp.uspusers.ProgUspusers");
                // SET: MENU
                }
            }
            
        class Mgrupos extends MenuItemProgram
            {
            public Mgrupos()
                {
                super("&Grupos");
                setName("mgrupos");
                setProgram("mae.easp.uspusuarios.ProgUspusuarios");
                // SET: MENU
                }
            }
            
        class Meventos extends MenuItemProgram
            {
            public Meventos()
                {
                super("&Control Accesos");
                setName("meventos");
                setProgram("mae.easp.uspermrecursos.ProgUspermrecursos");
                // SET: MENU
                }
            }
            
        class Mpermisosge extends MenuItemProgram
            {
            public Mpermisosge()
                {
                super("Permisos por grupos");
                setName("mpermisosge");
                setProgram("mae.easp.usppermisos.ProgUsppermisos");
                // SET: MENU
                }
            }
            
        class Mpermisoslo extends MenuItemProgram
            {
            public Mpermisoslo()
                {
                super("Permisos por usuario");
                setName("mpermisoslo");
                setProgram("mae.easp.usppermisoslo.ProgUsppermisoslo");
                // SET: MENU
                }
            }
            
        class M1fechas extends MenuItemProgram
            {
            public M1fechas()
                {
                super("&Empresas actuales por usuario");
                setName("m1fechas");
                setProgram("mae.easp.prfechas.ProgPrfechas");
                // SET: MENU
                }
            }
            
        class Mdesbloquearses extends MenuItemProgram
            {
            public Mdesbloquearses()
                {
                super("Desbloquear Sesiones");
                setName("mdesbloquearses");
                setProgram("mae.easp.usdesbloquearse.ProgUsdesbloquearse");
                // SET: MENU
                }
            }
            
        public Musuarios()
            {
            super("&Usuarios y permisos");
            setName("musuarios");
            // SET: MENU
            add(musers=new Musers());
            add(mgrupos=new Mgrupos());
            add(meventos=new Meventos());
            add(mpermisosge=new Mpermisosge());
            add(mpermisoslo=new Mpermisoslo());
            add(m1fechas=new M1fechas());
            add(mdesbloquearses=new Mdesbloquearses());
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
                // SET: MENU
                }
            }
            
        class M1impformpag extends MenuItemProgram
            {
            public M1impformpag()
                {
                super("Formatos de página");
                setName("m1impformpag");
                setProgram("mae.easp.admformpag.ProgAdmformpag");
                // SET: MENU
                }
            }
            
        class M1imptipos extends MenuItemProgram
            {
            public M1imptipos()
                {
                super("Tipos de impresión");
                setName("m1imptipos");
                setProgram("mae.easp.admtipimpr.ProgAdmtipimpr");
                // SET: MENU
                }
            }
            
        class M1emu extends MenuItemProgram
            {
            public M1emu()
                {
                super("Emulaciones y atributos");
                setName("m1emu");
                setProgram("mae.easp.admemuyatrib.ProgAdmemuyatrib");
                // SET: MENU
                }
            }
            
        class M1impdef extends MenuItemProgram
            {
            public M1impdef()
                {
                super("Impresoras por usuario");
                setName("m1impdef");
                setProgram("mae.easp.admimprusu.ProgAdmimprusu");
                // SET: MENU
                }
            }
            
        public Mimpresoras()
            {
            super("I&mpresoras");
            setName("mimpresoras");
            // SET: MENU
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
        public M1gestmir m1gestmir;
        public M1gestionnif m1gestionnif;
        class M1notas extends MenuItemProgram
            {
            public M1notas()
                {
                super("Notas");
                setName("m1notas");
                setProgram("mae.easp.admnotas.ProgAdmnotas");
                // SET: MENU
                }
            }
            
        class M1incidef extends MenuItemProgram
            {
            public M1incidef()
                {
                super("Definición de incidencias");
                setName("m1incidef");
                setProgram("mae.easp.admdeferr.ProgAdmdeferr");
                // SET: MENU
                }
            }
            
        class M1inciden extends MenuItemProgram
            {
            public M1inciden()
                {
                super("Incidencias");
                setName("m1inciden");
                setProgram("mae.easp.adminciden.ProgAdminciden");
                // SET: MENU
                }
            }
            
        class M1gestmir extends MenuItemProgram
            {
            public M1gestmir()
                {
                super("Gestión documentos e-Mir");
                setName("m1gestmir");
                setProgram("mae.easp.prgestdocsmir.ProgPrgestdocsmir");
                // SET: MENU
                }
            }
            
        class M1gestionnif extends MenuItemProgram
            {
            public M1gestionnif()
                {
                super("Gestión nifes");
                setName("m1gestionnif");
                setProgram("mae.easp.prselecnif.ProgPrselecnif");
                // SET: MENU
                }
            }
            
        public Mtablascomunes()
            {
            super("U&tilidades");
            setName("mtablascomunes");
            // SET: MENU
            add(m1notas=new M1notas());
            add(m1incidef=new M1incidef());
            add(m1inciden=new M1inciden());
            add(m1gestmir=new M1gestmir());
            add(m1gestionnif=new M1gestionnif());
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
                // SET: MENU
                }
            }
            
        class M1lopdocopias extends MenuItemProgram
            {
            public M1lopdocopias()
                {
                super("Control de copias");
                setName("m1lopdocopias");
                setProgram("mae.easp.lopdcopias.ProgLopdcopias");
                // SET: MENU
                }
            }
            
        class M1lopdinciden extends MenuItemProgram
            {
            public M1lopdinciden()
                {
                super("Control de Incidencias");
                setName("m1lopdinciden");
                setProgram("mae.easp.lopdincidencias.ProgLopdincidencias");
                // SET: MENU
                }
            }
            
        public Mlopd()
            {
            super("&LOPD");
            setName("mlopd");
            // SET: MENU
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
                // SET: MENU
                }
            }
            
        public Mayuda()
            {
            super("&Ayuda");
            setName("mayuda");
            // SET: MENU
            add(m1acercade=new M1acercade());
            }
        }
        
    public Barramenu(AppEasp easp)
        {
        super(easp);
        this.easp=easp;
        setName("barramenu");
        // SET: MENU
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
    public CatEasp cateasp;
    public CatAutition catautition;
    public CatCtasp catctasp;
    public CatJeo catjeo;
    public CatJexpe catjexpe;
    public CatJiss catjiss;
    public CatJrenta catjrenta;
    public CatLaboral catlaboral;
    public CatModelo100 catmodelo100;
    public CatModelo200 catmodelo200;
    public CatModelo714 catmodelo714;
    public CatModelos1 catmodelos1;
    public CatModelos2 catmodelos2;
    public CatModgen catmodgen;
    public CatXagpi catxagpi;
    public Bdeasp(AppEasp easp)
        {
        super(easp);
        this.easp=easp;
        setServer("jdbc:odbc:");
        setName("bdeasp");
        cateasp = new CatEasp();
        catautition = new CatAutition();
        catctasp = new CatCtasp();
        catjeo = new CatJeo();
        catjexpe = new CatJexpe();
        catjiss = new CatJiss();
        catjrenta = new CatJrenta();
        catlaboral = new CatLaboral();
        catmodelo100 = new CatModelo100();
        catmodelo200 = new CatModelo200();
        catmodelo714 = new CatModelo714();
        catmodelos1 = new CatModelos1();
        catmodelos2 = new CatModelos2();
        catmodgen = new CatModgen();
        catxagpi = new CatXagpi();
        Catalog array[] = {
            cateasp,
            catautition,
            catctasp,
            catjeo,
            catjexpe,
            catjiss,
            catjrenta,
            catlaboral,
            catmodelo100,
            catmodelo200,
            catmodelo714,
            catmodelos1,
            catmodelos2,
            catmodgen,
            catxagpi
            };
        setCatalogs(array);
        }
    }
    
