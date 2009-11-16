// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20091116
// Hora:             15:13:23
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.db;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.general.*;
// 
public class CatEasp extends Catalog
  {
  // Tablas
  public TabGycauto tabgycauto;
  public TabSetupapl tabsetupapl;
  public TabValores tabvalores;
  public TabTransacciones tabtransacciones;
  public TabCnae tabcnae;
  public TabBanco tabbanco;
  public TabDelhacienda tabdelhacienda;
  public TabAdmhacienda tabadmhacienda;
  public TabPais tabpais;
  public TabComuniauton tabcomuniauton;
  public TabProvincia tabprovincia;
  public TabMunicipio tabmunicipio;
  public TabNifes tabnifes;
  public TabNifesmuf tabnifesmuf;
  public TabCdp tabcdp;
  public TabRepresentantes tabrepresentantes;
  public TabAgpi tabagpi;
  public TabPdfref tabpdfref;
  public TabAmortizacion tabamortizacion;
  public TabEpigrafes tabepigrafes;
  public TabBancocli tabbancocli;
  public TabAsignaciones tabasignaciones;
  public TabNumeraciones tabnumeraciones;
  public TabDp tabdp;
  public TabFechas tabfechas;
  public TabBdscargadas tabbdscargadas;
  public TabConver tabconver;
  public TabAyudatxt tabayudatxt;
  public TabInerrcod tabinerrcod;
  public TabInincide tabinincide;
  public TabImpemul tabimpemul;
  public TabImpatrib tabimpatrib;
  public TabImpematr tabimpematr;
  public TabImptipos tabimptipos;
  public TabImpresor tabimpresor;
  public TabImpdef tabimpdef;
  public TabImpgrupo tabimpgrupo;
  public TabImpage tabimpage;
  public TabBds tabbds;
  public TabApl tabapl;
  public TabTablas tabtablas;
  public TabCampos tabcampos;
  public TabSede tabsede;
  public TabRbdctrap tabrbdctrap;
  public TabUsuario tabusuario;
  public TabUsgrupo tabusgrupo;
  public TabUsagrup tabusagrup;
  public TabUsrecursos tabusrecursos;
  public TabUspermge tabuspermge;
  public TabUspermlo tabuspermlo;
  public TabParametros tabparametros;
  public TabLopdacc tablopdacc;
  public TabLopdcop tablopdcop;
  public TabLopdinci tablopdinci;
  public TabQuefrase tabquefrase;
  public TabQuevariables tabquevariables;
  public TabQuetabla tabquetabla;
  public TabQuecolumn tabquecolumn;
  public TabMir tabmir;
  public TabNotas tabnotas;
  public TabPerfiltribut tabperfiltribut;
  public TabEmpmodelos tabempmodelos;
  public TabAvisado tabavisado;
  public TabTipovias tabtipovias;
  public TabMuni347 tabmuni347;
  public TabCnae2009 tabcnae2009;
  public TabCnaeequiv tabcnaeequiv;
  public TabCodigoregistro tabcodigoregistro;
  public TabCoeficcorrec tabcoeficcorrec;
  public TabIndemora tabindemora;
  public TabPerfilusuario tabperfilusuario;
  public class TabGycauto extends TableDef
    {
    // Campos
    public FieldDef centro;
    public FieldDef tabla;
    public FieldDef valor;
    public TabGycauto(String name)
      {
      super(name);
      centro = new FieldDef("centro",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tabla = new FieldDef("tabla",FieldDef.CHAR,20,FieldDef.NOTNULL);
      valor = new FieldDef("valor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        centro,
        tabla,
        valor        
        };
      setColumns(array);
      FieldDef arrayf[] = {centro,tabla };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSetupapl extends TableDef
    {
    // Campos
    public FieldDef setapl;
    public FieldDef setusuario;
    public FieldDef setvariable;
    public FieldDef settitulo;
    public FieldDef setdesc;
    public FieldDef setvalor;
    public TabSetupapl(String name)
      {
      super(name);
      setapl = new FieldDef("setapl",FieldDef.CHAR,8,FieldDef.NOTNULL);
      setusuario = new FieldDef("setusuario",FieldDef.CHAR,20,FieldDef.NOTNULL);
      setvariable = new FieldDef("setvariable",FieldDef.CHAR,15,FieldDef.NOTNULL);
      settitulo = new FieldDef("settitulo",FieldDef.CHAR,30);
      setdesc = new FieldDef("setdesc",FieldDef.CHAR,255);
      setvalor = new FieldDef("setvalor",FieldDef.CHAR,80);
      FieldDef array[] = {
        setapl,
        setusuario,
        setvariable,
        settitulo,
        setdesc,
        setvalor        
        };
      setColumns(array);
      FieldDef arrayf[] = {setapl,setusuario,setvariable };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabValores extends TableDef
    {
    // Campos
    public FieldDef vaapl;
    public FieldDef vacampo;
    public FieldDef vacodigo;
    public FieldDef vadesc;
    public FieldDef vaorden;
    public FieldDef vavalor;
    public TabValores(String name)
      {
      super(name);
      vaapl = new FieldDef("vaapl",FieldDef.CHAR,8,FieldDef.NOTNULL);
      vacampo = new FieldDef("vacampo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      vacodigo = new FieldDef("vacodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      vadesc = new FieldDef("vadesc",FieldDef.CHAR,45);
      vaorden = new FieldDef("vaorden",FieldDef.INTEGER,0);
      vavalor = new FieldDef("vavalor",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        vaapl,
        vacampo,
        vacodigo,
        vadesc,
        vaorden,
        vavalor        
        };
      setColumns(array);
      FieldDef arrayf[] = {vaapl,vacampo,vacodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTransacciones extends TableDef
    {
    // Campos
    public FieldDef tratipo;
    public FieldDef tradesc;
    public FieldDef traemre;
    public FieldDef traregimen;
    public FieldDef tratipoiva;
    public FieldDef travoloper;
    public FieldDef traoperespec;
    public TabTransacciones(String name)
      {
      super(name);
      tratipo = new FieldDef("tratipo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      tradesc = new FieldDef("tradesc",FieldDef.CHAR,30,FieldDef.NOTNULL);
      traemre = new FieldDef("traemre",FieldDef.CHAR,1,FieldDef.NOTNULL);
      traregimen = new FieldDef("traregimen",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tratipoiva = new FieldDef("tratipoiva",FieldDef.CHAR,3);
      travoloper = new FieldDef("travoloper",FieldDef.CHAR,3);
      traoperespec = new FieldDef("traoperespec",FieldDef.CHAR,3);
      FieldDef array[] = {
        tratipo,
        tradesc,
        traemre,
        traregimen,
        tratipoiva,
        travoloper,
        traoperespec        
        };
      setColumns(array);
      FieldDef arrayf[] = {tratipo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCnae extends TableDef
    {
    // Campos
    public FieldDef cnacodi;
    public FieldDef cnadesc;
    public TabCnae(String name)
      {
      super(name);
      cnacodi = new FieldDef("cnacodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnadesc = new FieldDef("cnadesc",FieldDef.CHAR,60);
      FieldDef array[] = {
        cnacodi,
        cnadesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnacodi };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabBanco extends TableDef
    {
    // Campos
    public FieldDef bncodigo;
    public FieldDef bndesc;
    public TabBanco(String name)
      {
      super(name);
      bncodigo = new FieldDef("bncodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bndesc = new FieldDef("bndesc",FieldDef.CHAR,50);
      FieldDef array[] = {
        bncodigo,
        bndesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {bncodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDelhacienda extends TableDef
    {
    // Campos
    public FieldDef dhcodigo;
    public FieldDef dhdesc;
    public TabDelhacienda(String name)
      {
      super(name);
      dhcodigo = new FieldDef("dhcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dhdesc = new FieldDef("dhdesc",FieldDef.CHAR,50);
      FieldDef array[] = {
        dhcodigo,
        dhdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {dhcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAdmhacienda extends TableDef
    {
    // Campos
    public FieldDef ahdele;
    public FieldDef ahcodigo;
    public FieldDef ahdesc;
    public TabAdmhacienda(String name)
      {
      super(name);
      ahdele = new FieldDef("ahdele",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ahcodigo = new FieldDef("ahcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ahdesc = new FieldDef("ahdesc",FieldDef.CHAR,50);
      FieldDef array[] = {
        ahdele,
        ahcodigo,
        ahdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {ahdele,ahcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPais extends TableDef
    {
    // Campos
    public FieldDef picodigo;
    public FieldDef pidesc;
    public FieldDef picodigoaeat;
    public FieldDef picodigoss;
    public FieldDef picodigo347;
    public TabPais(String name)
      {
      super(name);
      picodigo = new FieldDef("picodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pidesc = new FieldDef("pidesc",FieldDef.CHAR,50);
      picodigoaeat = new FieldDef("picodigoaeat",FieldDef.INTEGER,0);
      picodigoss = new FieldDef("picodigoss",FieldDef.INTEGER,0);
      picodigo347 = new FieldDef("picodigo347",FieldDef.CHAR,3);
      FieldDef array[] = {
        picodigo,
        pidesc,
        picodigoaeat,
        picodigoss,
        picodigo347        
        };
      setColumns(array);
      FieldDef arrayf[] = {picodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabComuniauton extends TableDef
    {
    // Campos
    public FieldDef cmcodigo;
    public FieldDef cmdesc;
    public TabComuniauton(String name)
      {
      super(name);
      cmcodigo = new FieldDef("cmcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cmdesc = new FieldDef("cmdesc",FieldDef.CHAR,50);
      FieldDef array[] = {
        cmcodigo,
        cmdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {cmcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabProvincia extends TableDef
    {
    // Campos
    public FieldDef pvcodigo;
    public FieldDef pvdesc;
    public FieldDef pvcomuni;
    public TabProvincia(String name)
      {
      super(name);
      pvcodigo = new FieldDef("pvcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pvdesc = new FieldDef("pvdesc",FieldDef.CHAR,20);
      pvcomuni = new FieldDef("pvcomuni",FieldDef.INTEGER,0);
      FieldDef array[] = {
        pvcodigo,
        pvdesc,
        pvcomuni        
        };
      setColumns(array);
      FieldDef arrayf[] = {pvcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabMunicipio extends TableDef
    {
    // Campos
    public FieldDef muprov;
    public FieldDef mucodigo;
    public FieldDef mudesc;
    public TabMunicipio(String name)
      {
      super(name);
      muprov = new FieldDef("muprov",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mucodigo = new FieldDef("mucodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mudesc = new FieldDef("mudesc",FieldDef.CHAR,50);
      FieldDef array[] = {
        muprov,
        mucodigo,
        mudesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {muprov,mucodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabNifes extends TableDef
    {
    // Campos
    public FieldDef danifcif;
    public FieldDef datipo;
    public FieldDef datnombre;
    public FieldDef datapell1;
    public FieldDef datapell2;
    public FieldDef datsiglas;
    public FieldDef datvia;
    public FieldDef datnum;
    public FieldDef datesc;
    public FieldDef datpiso;
    public FieldDef datletra;
    public FieldDef datpobla;
    public FieldDef datmuni;
    public FieldDef datprov;
    public FieldDef datpais;
    public FieldDef datcpos;
    public FieldDef dattel;
    public FieldDef datfax;
    public FieldDef datfisicajuri;
    public FieldDef datemail;
    public FieldDef datcontacto;
    public FieldDef datesiglas;
    public FieldDef datevia;
    public FieldDef datenum;
    public FieldDef dateesc;
    public FieldDef datepiso;
    public FieldDef dateletra;
    public FieldDef datepobla;
    public FieldDef datemuni;
    public FieldDef dateprov;
    public FieldDef datepais;
    public FieldDef datecpos;
    public FieldDef dateatt;
    public FieldDef dataltaen;
    public FieldDef datletraseti;
    public FieldDef datipf;
    public FieldDef datcbienes;
    public FieldDef datdominio;
    public FieldDef datnacional;
    public FieldDef datfftvia;
    public FieldDef datfvia;
    public FieldDef datftnum;
    public FieldDef datfnum;
    public FieldDef datfcalnum;
    public FieldDef datfbloque;
    public FieldDef datfportal;
    public FieldDef datfescal;
    public FieldDef datfplanta;
    public FieldDef datfpuerta;
    public FieldDef datfcomp;
    public FieldDef datflocal;
    public FieldDef datfemail;
    public FieldDef datfprov;
    public FieldDef datfcodmun;
    public FieldDef datfnommun;
    public FieldDef datfcpost;
    public FieldDef datftel;
    public FieldDef datfmovil;
    public FieldDef datffax;
    public FieldDef datnftvia;
    public FieldDef datnvia;
    public FieldDef datntnum;
    public FieldDef datnnum;
    public FieldDef datncalnum;
    public FieldDef datnbloque;
    public FieldDef datnportal;
    public FieldDef datnescal;
    public FieldDef datnplanta;
    public FieldDef datnpuerta;
    public FieldDef datncomp;
    public FieldDef datnlocal;
    public FieldDef datnemail;
    public FieldDef datnprov;
    public FieldDef datncodmun;
    public FieldDef datnnommun;
    public FieldDef datncpost;
    public FieldDef datntel;
    public FieldDef datnmovil;
    public FieldDef datnfax;
    public FieldDef datnapcor;
    public FieldDef datnpobla;
    public FieldDef datnprov2;
    public FieldDef datncpost2;
    public FieldDef datntel2;
    public FieldDef datnmovil2;
    public FieldDef datnfax2;
    public FieldDef datsftvia;
    public FieldDef datsvia;
    public FieldDef datstnum;
    public FieldDef datsnum;
    public FieldDef datscalnum;
    public FieldDef datsbloque;
    public FieldDef datsportal;
    public FieldDef datsescal;
    public FieldDef datsplanta;
    public FieldDef datspuerta;
    public FieldDef datscomp;
    public FieldDef datslocal;
    public FieldDef datsemail;
    public FieldDef datsprov;
    public FieldDef datscodmun;
    public FieldDef datsnommun;
    public FieldDef datscpost;
    public FieldDef datstel;
    public FieldDef datsmovil;
    public FieldDef datsfax;
    public FieldDef datmovil;
    public TabNifes(String name)
      {
      super(name);
      danifcif = new FieldDef("danifcif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      datipo = new FieldDef("datipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      datnombre = new FieldDef("datnombre",FieldDef.CHAR,20);
      datapell1 = new FieldDef("datapell1",FieldDef.CHAR,40,FieldDef.NOTNULL);
      datapell2 = new FieldDef("datapell2",FieldDef.CHAR,25);
      datsiglas = new FieldDef("datsiglas",FieldDef.CHAR,2);
      datvia = new FieldDef("datvia",FieldDef.CHAR,45);
      datnum = new FieldDef("datnum",FieldDef.CHAR,6);
      datesc = new FieldDef("datesc",FieldDef.CHAR,2);
      datpiso = new FieldDef("datpiso",FieldDef.CHAR,6);
      datletra = new FieldDef("datletra",FieldDef.CHAR,2);
      datpobla = new FieldDef("datpobla",FieldDef.CHAR,30);
      datmuni = new FieldDef("datmuni",FieldDef.INTEGER,0);
      datprov = new FieldDef("datprov",FieldDef.INTEGER,0);
      datpais = new FieldDef("datpais",FieldDef.INTEGER,0);
      datcpos = new FieldDef("datcpos",FieldDef.CHAR,5);
      dattel = new FieldDef("dattel",FieldDef.CHAR,15);
      datfax = new FieldDef("datfax",FieldDef.CHAR,15);
      datfisicajuri = new FieldDef("datfisicajuri",FieldDef.CHAR,1);
      datemail = new FieldDef("datemail",FieldDef.CHAR,100);
      datcontacto = new FieldDef("datcontacto",FieldDef.CHAR,30);
      datesiglas = new FieldDef("datesiglas",FieldDef.CHAR,2);
      datevia = new FieldDef("datevia",FieldDef.CHAR,45);
      datenum = new FieldDef("datenum",FieldDef.CHAR,6);
      dateesc = new FieldDef("dateesc",FieldDef.CHAR,2);
      datepiso = new FieldDef("datepiso",FieldDef.CHAR,6);
      dateletra = new FieldDef("dateletra",FieldDef.CHAR,2);
      datepobla = new FieldDef("datepobla",FieldDef.CHAR,30);
      datemuni = new FieldDef("datemuni",FieldDef.INTEGER,0);
      dateprov = new FieldDef("dateprov",FieldDef.INTEGER,0);
      datepais = new FieldDef("datepais",FieldDef.INTEGER,0);
      datecpos = new FieldDef("datecpos",FieldDef.CHAR,5);
      dateatt = new FieldDef("dateatt",FieldDef.CHAR,35);
      dataltaen = new FieldDef("dataltaen",FieldDef.CHAR,1);
      datletraseti = new FieldDef("datletraseti",FieldDef.CHAR,4);
      datipf = new FieldDef("datipf",FieldDef.CHAR,1);
      datcbienes = new FieldDef("datcbienes",FieldDef.CHAR,1);
      datdominio = new FieldDef("datdominio",FieldDef.CHAR,12);
      datnacional = new FieldDef("datnacional",FieldDef.INTEGER,0);
      datfftvia = new FieldDef("datfftvia",FieldDef.CHAR,5);
      datfvia = new FieldDef("datfvia",FieldDef.CHAR,50);
      datftnum = new FieldDef("datftnum",FieldDef.CHAR,3);
      datfnum = new FieldDef("datfnum",FieldDef.INTEGER,0);
      datfcalnum = new FieldDef("datfcalnum",FieldDef.CHAR,3);
      datfbloque = new FieldDef("datfbloque",FieldDef.CHAR,3);
      datfportal = new FieldDef("datfportal",FieldDef.CHAR,3);
      datfescal = new FieldDef("datfescal",FieldDef.CHAR,3);
      datfplanta = new FieldDef("datfplanta",FieldDef.CHAR,3);
      datfpuerta = new FieldDef("datfpuerta",FieldDef.CHAR,3);
      datfcomp = new FieldDef("datfcomp",FieldDef.CHAR,40);
      datflocal = new FieldDef("datflocal",FieldDef.CHAR,30);
      datfemail = new FieldDef("datfemail",FieldDef.CHAR,100);
      datfprov = new FieldDef("datfprov",FieldDef.INTEGER,0);
      datfcodmun = new FieldDef("datfcodmun",FieldDef.CHAR,5);
      datfnommun = new FieldDef("datfnommun",FieldDef.CHAR,30);
      datfcpost = new FieldDef("datfcpost",FieldDef.CHAR,5);
      datftel = new FieldDef("datftel",FieldDef.INTEGER,0);
      datfmovil = new FieldDef("datfmovil",FieldDef.INTEGER,0);
      datffax = new FieldDef("datffax",FieldDef.INTEGER,0);
      datnftvia = new FieldDef("datnftvia",FieldDef.CHAR,5);
      datnvia = new FieldDef("datnvia",FieldDef.CHAR,50);
      datntnum = new FieldDef("datntnum",FieldDef.CHAR,3);
      datnnum = new FieldDef("datnnum",FieldDef.INTEGER,0);
      datncalnum = new FieldDef("datncalnum",FieldDef.CHAR,3);
      datnbloque = new FieldDef("datnbloque",FieldDef.CHAR,3);
      datnportal = new FieldDef("datnportal",FieldDef.CHAR,3);
      datnescal = new FieldDef("datnescal",FieldDef.CHAR,3);
      datnplanta = new FieldDef("datnplanta",FieldDef.CHAR,3);
      datnpuerta = new FieldDef("datnpuerta",FieldDef.CHAR,3);
      datncomp = new FieldDef("datncomp",FieldDef.CHAR,40);
      datnlocal = new FieldDef("datnlocal",FieldDef.CHAR,30);
      datnemail = new FieldDef("datnemail",FieldDef.CHAR,100);
      datnprov = new FieldDef("datnprov",FieldDef.INTEGER,0);
      datncodmun = new FieldDef("datncodmun",FieldDef.CHAR,5);
      datnnommun = new FieldDef("datnnommun",FieldDef.CHAR,30);
      datncpost = new FieldDef("datncpost",FieldDef.CHAR,5);
      datntel = new FieldDef("datntel",FieldDef.INTEGER,0);
      datnmovil = new FieldDef("datnmovil",FieldDef.INTEGER,0);
      datnfax = new FieldDef("datnfax",FieldDef.INTEGER,0);
      datnapcor = new FieldDef("datnapcor",FieldDef.CHAR,10);
      datnpobla = new FieldDef("datnpobla",FieldDef.CHAR,30);
      datnprov2 = new FieldDef("datnprov2",FieldDef.INTEGER,0);
      datncpost2 = new FieldDef("datncpost2",FieldDef.CHAR,5);
      datntel2 = new FieldDef("datntel2",FieldDef.INTEGER,0);
      datnmovil2 = new FieldDef("datnmovil2",FieldDef.INTEGER,0);
      datnfax2 = new FieldDef("datnfax2",FieldDef.INTEGER,0);
      datsftvia = new FieldDef("datsftvia",FieldDef.CHAR,5);
      datsvia = new FieldDef("datsvia",FieldDef.CHAR,50);
      datstnum = new FieldDef("datstnum",FieldDef.CHAR,3);
      datsnum = new FieldDef("datsnum",FieldDef.INTEGER,0);
      datscalnum = new FieldDef("datscalnum",FieldDef.CHAR,3);
      datsbloque = new FieldDef("datsbloque",FieldDef.CHAR,3);
      datsportal = new FieldDef("datsportal",FieldDef.CHAR,3);
      datsescal = new FieldDef("datsescal",FieldDef.CHAR,3);
      datsplanta = new FieldDef("datsplanta",FieldDef.CHAR,3);
      datspuerta = new FieldDef("datspuerta",FieldDef.CHAR,3);
      datscomp = new FieldDef("datscomp",FieldDef.CHAR,40);
      datslocal = new FieldDef("datslocal",FieldDef.CHAR,30);
      datsemail = new FieldDef("datsemail",FieldDef.CHAR,100);
      datsprov = new FieldDef("datsprov",FieldDef.INTEGER,0);
      datscodmun = new FieldDef("datscodmun",FieldDef.CHAR,5);
      datsnommun = new FieldDef("datsnommun",FieldDef.CHAR,30);
      datscpost = new FieldDef("datscpost",FieldDef.CHAR,5);
      datstel = new FieldDef("datstel",FieldDef.INTEGER,0);
      datsmovil = new FieldDef("datsmovil",FieldDef.INTEGER,0);
      datsfax = new FieldDef("datsfax",FieldDef.INTEGER,0);
      datmovil = new FieldDef("datmovil",FieldDef.INTEGER,0);
      FieldDef array[] = {
        danifcif,
        datipo,
        datnombre,
        datapell1,
        datapell2,
        datsiglas,
        datvia,
        datnum,
        datesc,
        datpiso,
        datletra,
        datpobla,
        datmuni,
        datprov,
        datpais,
        datcpos,
        dattel,
        datfax,
        datfisicajuri,
        datemail,
        datcontacto,
        datesiglas,
        datevia,
        datenum,
        dateesc,
        datepiso,
        dateletra,
        datepobla,
        datemuni,
        dateprov,
        datepais,
        datecpos,
        dateatt,
        dataltaen,
        datletraseti,
        datipf,
        datcbienes,
        datdominio,
        datnacional,
        datfftvia,
        datfvia,
        datftnum,
        datfnum,
        datfcalnum,
        datfbloque,
        datfportal,
        datfescal,
        datfplanta,
        datfpuerta,
        datfcomp,
        datflocal,
        datfemail,
        datfprov,
        datfcodmun,
        datfnommun,
        datfcpost,
        datftel,
        datfmovil,
        datffax,
        datnftvia,
        datnvia,
        datntnum,
        datnnum,
        datncalnum,
        datnbloque,
        datnportal,
        datnescal,
        datnplanta,
        datnpuerta,
        datncomp,
        datnlocal,
        datnemail,
        datnprov,
        datncodmun,
        datnnommun,
        datncpost,
        datntel,
        datnmovil,
        datnfax,
        datnapcor,
        datnpobla,
        datnprov2,
        datncpost2,
        datntel2,
        datnmovil2,
        datnfax2,
        datsftvia,
        datsvia,
        datstnum,
        datsnum,
        datscalnum,
        datsbloque,
        datsportal,
        datsescal,
        datsplanta,
        datspuerta,
        datscomp,
        datslocal,
        datsemail,
        datsprov,
        datscodmun,
        datsnommun,
        datscpost,
        datstel,
        datsmovil,
        datsfax,
        datmovil        
        };
      setColumns(array);
      FieldDef arrayind1[] = { datapell1 };
      Index arrayi[] = { 
        new Index("id_datapell1",arrayind1)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {danifcif };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabNifesmuf extends TableDef
    {
    // Campos
    public FieldDef mufnif;
    public FieldDef mufnum;
    public FieldDef mufad;
    public FieldDef muftipod;
    public FieldDef mufpercont;
    public FieldDef mufnifad;
    public FieldDef mufnombre;
    public FieldDef mufsexo;
    public FieldDef muffecnac;
    public FieldDef muffecadop;
    public FieldDef mufperdisc;
    public FieldDef mufayudadesp;
    public FieldDef mufingresos;
    public FieldDef mufnumreparto;
    public FieldDef mufdeducible;
    public TabNifesmuf(String name)
      {
      super(name);
      mufnif = new FieldDef("mufnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      mufnum = new FieldDef("mufnum",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mufad = new FieldDef("mufad",FieldDef.CHAR,1);
      muftipod = new FieldDef("muftipod",FieldDef.CHAR,1);
      mufpercont = new FieldDef("mufpercont",FieldDef.FLOAT,6,0);
      mufnifad = new FieldDef("mufnifad",FieldDef.CHAR,15);
      mufnombre = new FieldDef("mufnombre",FieldDef.CHAR,50);
      mufsexo = new FieldDef("mufsexo",FieldDef.CHAR,1);
      muffecnac = new FieldDef("muffecnac",FieldDef.DATE);
      muffecadop = new FieldDef("muffecadop",FieldDef.DATE);
      mufperdisc = new FieldDef("mufperdisc",FieldDef.FLOAT,6,0);
      mufayudadesp = new FieldDef("mufayudadesp",FieldDef.CHAR,1);
      mufingresos = new FieldDef("mufingresos",FieldDef.FLOAT,6,0);
      mufnumreparto = new FieldDef("mufnumreparto",FieldDef.INTEGER,0);
      mufdeducible = new FieldDef("mufdeducible",FieldDef.CHAR,1);
      FieldDef array[] = {
        mufnif,
        mufnum,
        mufad,
        muftipod,
        mufpercont,
        mufnifad,
        mufnombre,
        mufsexo,
        muffecnac,
        muffecadop,
        mufperdisc,
        mufayudadesp,
        mufingresos,
        mufnumreparto,
        mufdeducible        
        };
      setColumns(array);
      FieldDef arrayf[] = {mufnif,mufnum };
      setPrimaryKeys(arrayf);
      mufnum.setAutoIncrementable(true);
      }
    }
    
  public class TabCdp extends TableDef
    {
    // Campos
    public FieldDef cdpcodi;
    public FieldDef cdpnifcif;
    public FieldDef cdppwd;
    public FieldDef cdpaeatdele;
    public FieldDef cdpaeatadm;
    public FieldDef cdpagpi;
    public FieldDef cdppwdacc;
    public FieldDef cdpcknomina;
    public FieldDef cdpckconta;
    public FieldDef cdpckeo;
    public FieldDef cdpckiss;
    public FieldDef cdpckgestion;
    public FieldDef cdpckrenta;
    public FieldDef cdpcdprel;
    public FieldDef cdpref;
    public FieldDef cdpbdcomunomina;
    public FieldDef cdpbdcomuconta;
    public FieldDef cdpbdcomueo;
    public FieldDef cdpbdcomuiss;
    public FieldDef cdpbdcomurenta;
    public FieldDef cdpbdestanomina;
    public FieldDef cdpbdestaconta;
    public FieldDef cdpbdestaeo;
    public FieldDef cdpbdestaiss;
    public FieldDef cdpbdestarenta;
    public FieldDef cdpobserv;
    public FieldDef cdpdominio;
    public TabCdp(String name)
      {
      super(name);
      cdpcodi = new FieldDef("cdpcodi",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cdpnifcif = new FieldDef("cdpnifcif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      cdppwd = new FieldDef("cdppwd",FieldDef.CHAR,15);
      cdpaeatdele = new FieldDef("cdpaeatdele",FieldDef.INTEGER,0);
      cdpaeatadm = new FieldDef("cdpaeatadm",FieldDef.INTEGER,0);
      cdpagpi = new FieldDef("cdpagpi",FieldDef.CHAR,1);
      cdppwdacc = new FieldDef("cdppwdacc",FieldDef.CHAR,15);
      cdpcknomina = new FieldDef("cdpcknomina",FieldDef.CHAR,1);
      cdpckconta = new FieldDef("cdpckconta",FieldDef.CHAR,1);
      cdpckeo = new FieldDef("cdpckeo",FieldDef.CHAR,1);
      cdpckiss = new FieldDef("cdpckiss",FieldDef.CHAR,1);
      cdpckgestion = new FieldDef("cdpckgestion",FieldDef.CHAR,1);
      cdpckrenta = new FieldDef("cdpckrenta",FieldDef.CHAR,1);
      cdpcdprel = new FieldDef("cdpcdprel",FieldDef.CHAR,12);
      cdpref = new FieldDef("cdpref",FieldDef.CHAR,45);
      cdpbdcomunomina = new FieldDef("cdpbdcomunomina",FieldDef.CHAR,1);
      cdpbdcomuconta = new FieldDef("cdpbdcomuconta",FieldDef.CHAR,1);
      cdpbdcomueo = new FieldDef("cdpbdcomueo",FieldDef.CHAR,1);
      cdpbdcomuiss = new FieldDef("cdpbdcomuiss",FieldDef.CHAR,1);
      cdpbdcomurenta = new FieldDef("cdpbdcomurenta",FieldDef.CHAR,1);
      cdpbdestanomina = new FieldDef("cdpbdestanomina",FieldDef.CHAR,1);
      cdpbdestaconta = new FieldDef("cdpbdestaconta",FieldDef.CHAR,1);
      cdpbdestaeo = new FieldDef("cdpbdestaeo",FieldDef.CHAR,1);
      cdpbdestaiss = new FieldDef("cdpbdestaiss",FieldDef.CHAR,1);
      cdpbdestarenta = new FieldDef("cdpbdestarenta",FieldDef.CHAR,1);
      cdpobserv = new FieldDef("cdpobserv",FieldDef.CHAR,255);
      cdpdominio = new FieldDef("cdpdominio",FieldDef.CHAR,12);
      FieldDef array[] = {
        cdpcodi,
        cdpnifcif,
        cdppwd,
        cdpaeatdele,
        cdpaeatadm,
        cdpagpi,
        cdppwdacc,
        cdpcknomina,
        cdpckconta,
        cdpckeo,
        cdpckiss,
        cdpckgestion,
        cdpckrenta,
        cdpcdprel,
        cdpref,
        cdpbdcomunomina,
        cdpbdcomuconta,
        cdpbdcomueo,
        cdpbdcomuiss,
        cdpbdcomurenta,
        cdpbdestanomina,
        cdpbdestaconta,
        cdpbdestaeo,
        cdpbdestaiss,
        cdpbdestarenta,
        cdpobserv,
        cdpdominio        
        };
      setColumns(array);
      FieldDef arrayind1[] = { cdpdominio,cdpnifcif };
      FieldDef arrayind2[] = { cdpdominio,cdpref };
      Index arrayi[] = { 
        new Index("id_cdpnifcif",arrayind1),
        new Index("id_cdpref",arrayind2)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {cdpcodi };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabRepresentantes extends TableDef
    {
    // Campos
    public FieldDef repcodigo;
    public FieldDef repnifcif;
    public FieldDef reppresentante;
    public FieldDef repreplegal;
    public FieldDef repadministrado;
    public FieldDef repsocios;
    public FieldDef repsecretario;
    public FieldDef repfechapoder;
    public FieldDef repnotaria;
    public FieldDef repvtopoder;
    public FieldDef represidente;
    public FieldDef repfirma;
    public FieldDef repdominio;
    public TabRepresentantes(String name)
      {
      super(name);
      repcodigo = new FieldDef("repcodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      repnifcif = new FieldDef("repnifcif",FieldDef.CHAR,15);
      reppresentante = new FieldDef("reppresentante",FieldDef.CHAR,1,FieldDef.NOTNULL);
      repreplegal = new FieldDef("repreplegal",FieldDef.CHAR,1,FieldDef.NOTNULL);
      repadministrado = new FieldDef("repadministrado",FieldDef.CHAR,1,FieldDef.NOTNULL);
      repsocios = new FieldDef("repsocios",FieldDef.CHAR,1,FieldDef.NOTNULL);
      repsecretario = new FieldDef("repsecretario",FieldDef.CHAR,1,FieldDef.NOTNULL);
      repfechapoder = new FieldDef("repfechapoder",FieldDef.DATE);
      repnotaria = new FieldDef("repnotaria",FieldDef.CHAR,40);
      repvtopoder = new FieldDef("repvtopoder",FieldDef.DATE);
      represidente = new FieldDef("represidente",FieldDef.CHAR,1,FieldDef.NOTNULL);
      repfirma = new FieldDef("repfirma",FieldDef.CHAR,1,FieldDef.NOTNULL);
      repdominio = new FieldDef("repdominio",FieldDef.CHAR,12);
      FieldDef array[] = {
        repcodigo,
        repnifcif,
        reppresentante,
        repreplegal,
        repadministrado,
        repsocios,
        repsecretario,
        repfechapoder,
        repnotaria,
        repvtopoder,
        represidente,
        repfirma,
        repdominio        
        };
      setColumns(array);
      FieldDef arrayind1[] = { repdominio,repnifcif };
      Index arrayi[] = { 
        new Index("id_repnifcif",arrayind1)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {repcodigo,repnifcif };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAgpi extends TableDef
    {
    // Campos
    public FieldDef agcodigo;
    public FieldDef agcodigoagpi;
    public FieldDef agcodigodp;
    public FieldDef agpassword;
    public FieldDef agperiodicidad;
    public FieldDef agdireccionweb;
    public TabAgpi(String name)
      {
      super(name);
      agcodigo = new FieldDef("agcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      agcodigoagpi = new FieldDef("agcodigoagpi",FieldDef.CHAR,12);
      agcodigodp = new FieldDef("agcodigodp",FieldDef.CHAR,12);
      agpassword = new FieldDef("agpassword",FieldDef.CHAR,12);
      agperiodicidad = new FieldDef("agperiodicidad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      agdireccionweb = new FieldDef("agdireccionweb",FieldDef.CHAR,80);
      FieldDef array[] = {
        agcodigo,
        agcodigoagpi,
        agcodigodp,
        agpassword,
        agperiodicidad,
        agdireccionweb        
        };
      setColumns(array);
      FieldDef arrayf[] = {agcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPdfref extends TableDef
    {
    // Campos
    public FieldDef pdfcodi;
    public FieldDef pdfcdp;
    public FieldDef pdfdp;
    public FieldDef pdfapl;
    public FieldDef pdfambit;
    public FieldDef pdftitol;
    public FieldDef pdfdesc;
    public FieldDef pdfdatacre;
    public FieldDef pdfdatapub;
    public FieldDef pdfdatalec;
    public FieldDef pdfejer;
    public FieldDef pdfperiod;
    public TabPdfref(String name)
      {
      super(name);
      pdfcodi = new FieldDef("pdfcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pdfcdp = new FieldDef("pdfcdp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pdfdp = new FieldDef("pdfdp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pdfapl = new FieldDef("pdfapl",FieldDef.CHAR,15,FieldDef.NOTNULL);
      pdfambit = new FieldDef("pdfambit",FieldDef.CHAR,15);
      pdftitol = new FieldDef("pdftitol",FieldDef.CHAR,50);
      pdfdesc = new FieldDef("pdfdesc",FieldDef.CHAR,50);
      pdfdatacre = new FieldDef("pdfdatacre",FieldDef.DATE);
      pdfdatapub = new FieldDef("pdfdatapub",FieldDef.DATE);
      pdfdatalec = new FieldDef("pdfdatalec",FieldDef.DATE);
      pdfejer = new FieldDef("pdfejer",FieldDef.INTEGER,0);
      pdfperiod = new FieldDef("pdfperiod",FieldDef.INTEGER,0);
      FieldDef array[] = {
        pdfcodi,
        pdfcdp,
        pdfdp,
        pdfapl,
        pdfambit,
        pdftitol,
        pdfdesc,
        pdfdatacre,
        pdfdatapub,
        pdfdatalec,
        pdfejer,
        pdfperiod        
        };
      setColumns(array);
      FieldDef arrayind1[] = { pdfcdp };
      FieldDef arrayind2[] = { pdfapl };
      Index arrayi[] = { 
        new Index("id_pdfcdp",arrayind1),
        new Index("id_pdfapl",arrayind2)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {pdfcodi };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAmortizacion extends TableDef
    {
    // Campos
    public FieldDef amocodigo;
    public FieldDef amogrupo;
    public FieldDef amonumero;
    public FieldDef amoletra;
    public FieldDef amosubdivision;
    public FieldDef amodesc;
    public FieldDef amocoef;
    public FieldDef amoperiodo;
    public FieldDef amoparent;
    public FieldDef amonum;
    public TabAmortizacion(String name)
      {
      super(name);
      amocodigo = new FieldDef("amocodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      amogrupo = new FieldDef("amogrupo",FieldDef.CHAR,4,FieldDef.NOTNULL);
      amonumero = new FieldDef("amonumero",FieldDef.INTEGER,0);
      amoletra = new FieldDef("amoletra",FieldDef.CHAR,1);
      amosubdivision = new FieldDef("amosubdivision",FieldDef.CHAR,2);
      amodesc = new FieldDef("amodesc",FieldDef.CHAR,100);
      amocoef = new FieldDef("amocoef",FieldDef.FLOAT,6,0);
      amoperiodo = new FieldDef("amoperiodo",FieldDef.INTEGER,0);
      amoparent = new FieldDef("amoparent",FieldDef.CHAR,8);
      amonum = new FieldDef("amonum",FieldDef.CHAR,1);
      FieldDef array[] = {
        amocodigo,
        amogrupo,
        amonumero,
        amoletra,
        amosubdivision,
        amodesc,
        amocoef,
        amoperiodo,
        amoparent,
        amonum        
        };
      setColumns(array);
      FieldDef arrayf[] = {amocodigo };
      setPrimaryKeys(arrayf);
      amocodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabEpigrafes extends TableDef
    {
    // Campos
    public FieldDef epitipoact;
    public FieldDef epiepigrafe;
    public FieldDef epidescripcion;
    public FieldDef epiepisinpunto;
    public TabEpigrafes(String name)
      {
      super(name);
      epitipoact = new FieldDef("epitipoact",FieldDef.CHAR,1,FieldDef.NOTNULL);
      epiepigrafe = new FieldDef("epiepigrafe",FieldDef.CHAR,7,FieldDef.NOTNULL);
      epidescripcion = new FieldDef("epidescripcion",FieldDef.CHAR,50);
      epiepisinpunto = new FieldDef("epiepisinpunto",FieldDef.CHAR,4);
      FieldDef array[] = {
        epitipoact,
        epiepigrafe,
        epidescripcion,
        epiepisinpunto        
        };
      setColumns(array);
      FieldDef arrayf[] = {epitipoact,epiepigrafe };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabBancocli extends TableDef
    {
    // Campos
    public FieldDef bcccodigo;
    public FieldDef bccbanco;
    public FieldDef bccsucursal;
    public FieldDef bccnumero;
    public FieldDef bccdigitos;
    public FieldDef bccsg;
    public FieldDef bccvia;
    public FieldDef bccnum;
    public FieldDef bccescalera;
    public FieldDef bccpiso;
    public FieldDef bccletra;
    public FieldDef bccpoblacion;
    public FieldDef bcccodmuni;
    public FieldDef bcccodpostal;
    public FieldDef bccprovincia;
    public FieldDef bccdominio;
    public TabBancocli(String name)
      {
      super(name);
      bcccodigo = new FieldDef("bcccodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      bccbanco = new FieldDef("bccbanco",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bccsucursal = new FieldDef("bccsucursal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bccnumero = new FieldDef("bccnumero",FieldDef.CHAR,10,FieldDef.NOTNULL);
      bccdigitos = new FieldDef("bccdigitos",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bccsg = new FieldDef("bccsg",FieldDef.CHAR,2);
      bccvia = new FieldDef("bccvia",FieldDef.CHAR,45);
      bccnum = new FieldDef("bccnum",FieldDef.CHAR,6);
      bccescalera = new FieldDef("bccescalera",FieldDef.CHAR,2);
      bccpiso = new FieldDef("bccpiso",FieldDef.CHAR,6);
      bccletra = new FieldDef("bccletra",FieldDef.CHAR,2);
      bccpoblacion = new FieldDef("bccpoblacion",FieldDef.CHAR,30);
      bcccodmuni = new FieldDef("bcccodmuni",FieldDef.INTEGER,0);
      bcccodpostal = new FieldDef("bcccodpostal",FieldDef.CHAR,5);
      bccprovincia = new FieldDef("bccprovincia",FieldDef.INTEGER,0);
      bccdominio = new FieldDef("bccdominio",FieldDef.CHAR,12);
      FieldDef array[] = {
        bcccodigo,
        bccbanco,
        bccsucursal,
        bccnumero,
        bccdigitos,
        bccsg,
        bccvia,
        bccnum,
        bccescalera,
        bccpiso,
        bccletra,
        bccpoblacion,
        bcccodmuni,
        bcccodpostal,
        bccprovincia,
        bccdominio        
        };
      setColumns(array);
      FieldDef arrayf[] = {bcccodigo,bccbanco,bccsucursal,bccnumero,bccdigitos };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAsignaciones extends TableDef
    {
    // Campos
    public FieldDef abacodigo;
    public FieldDef abatipo;
    public FieldDef ababanco;
    public FieldDef absucursal;
    public FieldDef abnumero;
    public FieldDef abadigito;
    public FieldDef abdominio;
    public TabAsignaciones(String name)
      {
      super(name);
      abacodigo = new FieldDef("abacodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      abatipo = new FieldDef("abatipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      ababanco = new FieldDef("ababanco",FieldDef.INTEGER,0);
      absucursal = new FieldDef("absucursal",FieldDef.INTEGER,0);
      abnumero = new FieldDef("abnumero",FieldDef.CHAR,10);
      abadigito = new FieldDef("abadigito",FieldDef.INTEGER,0);
      abdominio = new FieldDef("abdominio",FieldDef.CHAR,12);
      FieldDef array[] = {
        abacodigo,
        abatipo,
        ababanco,
        absucursal,
        abnumero,
        abadigito,
        abdominio        
        };
      setColumns(array);
      FieldDef arrayf[] = {abacodigo,abatipo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabNumeraciones extends TableDef
    {
    // Campos
    public FieldDef numaplic;
    public FieldDef numcodigo;
    public FieldDef numdominio;
    public TabNumeraciones(String name)
      {
      super(name);
      numaplic = new FieldDef("numaplic",FieldDef.CHAR,10,FieldDef.NOTNULL);
      numcodigo = new FieldDef("numcodigo",FieldDef.INTEGER,0);
      numdominio = new FieldDef("numdominio",FieldDef.CHAR,12);
      FieldDef array[] = {
        numaplic,
        numcodigo,
        numdominio        
        };
      setColumns(array);
      FieldDef arrayf[] = {numaplic };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDp extends TableDef
    {
    // Campos
    public FieldDef dpcodigo;
    public FieldDef dpnifcif;
    public TabDp(String name)
      {
      super(name);
      dpcodigo = new FieldDef("dpcodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dpnifcif = new FieldDef("dpnifcif",FieldDef.CHAR,15);
      FieldDef array[] = {
        dpcodigo,
        dpnifcif        
        };
      setColumns(array);
      FieldDef arrayf[] = {dpcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabFechas extends TableDef
    {
    // Campos
    public FieldDef fecdominio;
    public FieldDef fecusuario;
    public FieldDef fecctacli;
    public FieldDef fecctaejer;
    public FieldDef fecnomcli;
    public FieldDef fecnomejer;
    public FieldDef feceoscli;
    public FieldDef feceosejer;
    public FieldDef fecrencli;
    public FieldDef fecrenejer;
    public FieldDef fecisscli;
    public FieldDef fecissejer;
    public TabFechas(String name)
      {
      super(name);
      fecdominio = new FieldDef("fecdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      fecusuario = new FieldDef("fecusuario",FieldDef.CHAR,20,FieldDef.NOTNULL);
      fecctacli = new FieldDef("fecctacli",FieldDef.INTEGER,0);
      fecctaejer = new FieldDef("fecctaejer",FieldDef.INTEGER,0);
      fecnomcli = new FieldDef("fecnomcli",FieldDef.INTEGER,0);
      fecnomejer = new FieldDef("fecnomejer",FieldDef.INTEGER,0);
      feceoscli = new FieldDef("feceoscli",FieldDef.INTEGER,0);
      feceosejer = new FieldDef("feceosejer",FieldDef.INTEGER,0);
      fecrencli = new FieldDef("fecrencli",FieldDef.INTEGER,0);
      fecrenejer = new FieldDef("fecrenejer",FieldDef.INTEGER,0);
      fecisscli = new FieldDef("fecisscli",FieldDef.INTEGER,0);
      fecissejer = new FieldDef("fecissejer",FieldDef.INTEGER,0);
      FieldDef array[] = {
        fecdominio,
        fecusuario,
        fecctacli,
        fecctaejer,
        fecnomcli,
        fecnomejer,
        feceoscli,
        feceosejer,
        fecrencli,
        fecrenejer,
        fecisscli,
        fecissejer        
        };
      setColumns(array);
      FieldDef arrayf[] = {fecdominio,fecusuario };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabBdscargadas extends TableDef
    {
    // Campos
    public FieldDef bdaplic;
    public FieldDef bddominio;
    public FieldDef bdejer;
    public FieldDef bddesc;
    public FieldDef bdtipo;
    public FieldDef bdbdnom;
    public FieldDef bdbduser;
    public FieldDef bdbdpass;
    public FieldDef bdbdserv;
    public FieldDef bdauxiliar;
    public FieldDef bddisponible;
    public FieldDef bdobser;
    public TabBdscargadas(String name)
      {
      super(name);
      bdaplic = new FieldDef("bdaplic",FieldDef.CHAR,15,FieldDef.NOTNULL);
      bddominio = new FieldDef("bddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      bdejer = new FieldDef("bdejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bddesc = new FieldDef("bddesc",FieldDef.CHAR,45,FieldDef.NOTNULL);
      bdtipo = new FieldDef("bdtipo",FieldDef.CHAR,15);
      bdbdnom = new FieldDef("bdbdnom",FieldDef.CHAR,30);
      bdbduser = new FieldDef("bdbduser",FieldDef.CHAR,15);
      bdbdpass = new FieldDef("bdbdpass",FieldDef.CHAR,15);
      bdbdserv = new FieldDef("bdbdserv",FieldDef.CHAR,255);
      bdauxiliar = new FieldDef("bdauxiliar",FieldDef.CHAR,1);
      bddisponible = new FieldDef("bddisponible",FieldDef.CHAR,1);
      bdobser = new FieldDef("bdobser",FieldDef.CHAR,255);
      FieldDef array[] = {
        bdaplic,
        bddominio,
        bdejer,
        bddesc,
        bdtipo,
        bdbdnom,
        bdbduser,
        bdbdpass,
        bdbdserv,
        bdauxiliar,
        bddisponible,
        bdobser        
        };
      setColumns(array);
      FieldDef arrayf[] = {bdaplic,bddominio,bdejer };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabConver extends TableDef
    {
    // Campos
    public FieldDef cvaplic;
    public FieldDef cvempresa;
    public FieldDef cvejer;
    public FieldDef cvfecha;
    public FieldDef cvpaso;
    public TabConver(String name)
      {
      super(name);
      cvaplic = new FieldDef("cvaplic",FieldDef.CHAR,15,FieldDef.NOTNULL);
      cvempresa = new FieldDef("cvempresa",FieldDef.CHAR,15,FieldDef.NOTNULL);
      cvejer = new FieldDef("cvejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cvfecha = new FieldDef("cvfecha",FieldDef.DATE);
      cvpaso = new FieldDef("cvpaso",FieldDef.INTEGER,0);
      FieldDef array[] = {
        cvaplic,
        cvempresa,
        cvejer,
        cvfecha,
        cvpaso        
        };
      setColumns(array);
      FieldDef arrayf[] = {cvaplic,cvempresa,cvejer };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAyudatxt extends TableDef
    {
    // Campos
    public FieldDef ayprocedure;
    public FieldDef ayidioma;
    public FieldDef aytexto;
    public TabAyudatxt(String name)
      {
      super(name);
      ayprocedure = new FieldDef("ayprocedure",FieldDef.CHAR,50,FieldDef.NOTNULL);
      ayidioma = new FieldDef("ayidioma",FieldDef.CHAR,3,FieldDef.NOTNULL);
      aytexto = new FieldDef("aytexto",FieldDef.CHAR,4000);
      FieldDef array[] = {
        ayprocedure,
        ayidioma,
        aytexto        
        };
      setColumns(array);
      FieldDef arrayf[] = {ayprocedure,ayidioma };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabInerrcod extends TableDef
    {
    // Campos
    public FieldDef ercodigo;
    public FieldDef erambito;
    public FieldDef ermodulo;
    public FieldDef erprog;
    public FieldDef errefer;
    public FieldDef ernumer;
    public FieldDef erexec;
    public FieldDef ercritic;
    public FieldDef erincide;
    public FieldDef eropcion;
    public FieldDef ersoluci;
    public FieldDef erdescri;
    public TabInerrcod(String name)
      {
      super(name);
      ercodigo = new FieldDef("ercodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      erambito = new FieldDef("erambito",FieldDef.CHAR,10,FieldDef.NOTNULL);
      ermodulo = new FieldDef("ermodulo",FieldDef.CHAR,10,FieldDef.NOTNULL);
      erprog = new FieldDef("erprog",FieldDef.CHAR,80);
      errefer = new FieldDef("errefer",FieldDef.CHAR,10,FieldDef.NOTNULL);
      ernumer = new FieldDef("ernumer",FieldDef.CHAR,10);
      erexec = new FieldDef("erexec",FieldDef.CHAR,80);
      ercritic = new FieldDef("ercritic",FieldDef.CHAR,1,FieldDef.NOTNULL);
      erincide = new FieldDef("erincide",FieldDef.CHAR,1,FieldDef.NOTNULL);
      eropcion = new FieldDef("eropcion",FieldDef.INTEGER,0);
      ersoluci = new FieldDef("ersoluci",FieldDef.CHAR,1024);
      erdescri = new FieldDef("erdescri",FieldDef.CHAR,1024);
      FieldDef array[] = {
        ercodigo,
        erambito,
        ermodulo,
        erprog,
        errefer,
        ernumer,
        erexec,
        ercritic,
        erincide,
        eropcion,
        ersoluci,
        erdescri        
        };
      setColumns(array);
      FieldDef arrayind1[] = { errefer,ercodigo };
      FieldDef arrayind2[] = { erambito,ermodulo,errefer };
      Index arrayi[] = { 
        new Index("inerrcodrefer",arrayind1),
        new Index("inerrcodambito",arrayind2)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {ercodigo };
      setPrimaryKeys(arrayf);
      ercodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabInincide extends TableDef
    {
    // Campos
    public FieldDef incodigo;
    public FieldDef insede;
    public FieldDef inusuari;
    public FieldDef inpuesto;
    public FieldDef ininstan;
    public FieldDef inambito;
    public FieldDef inmodulo;
    public FieldDef inprog;
    public FieldDef inrefer;
    public FieldDef innumer;
    public FieldDef inopera;
    public FieldDef inmensa;
    public TabInincide(String name)
      {
      super(name);
      incodigo = new FieldDef("incodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      insede = new FieldDef("insede",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      inusuari = new FieldDef("inusuari",FieldDef.CHAR,25,FieldDef.NOTNULL);
      inpuesto = new FieldDef("inpuesto",FieldDef.CHAR,15,FieldDef.NOTNULL);
      ininstan = new FieldDef("ininstan",FieldDef.DATE,FieldDef.NOTNULL);
      inambito = new FieldDef("inambito",FieldDef.CHAR,10,FieldDef.NOTNULL);
      inmodulo = new FieldDef("inmodulo",FieldDef.CHAR,10,FieldDef.NOTNULL);
      inprog = new FieldDef("inprog",FieldDef.CHAR,80);
      inrefer = new FieldDef("inrefer",FieldDef.CHAR,10);
      innumer = new FieldDef("innumer",FieldDef.CHAR,10);
      inopera = new FieldDef("inopera",FieldDef.CHAR,1024);
      inmensa = new FieldDef("inmensa",FieldDef.CHAR,1024);
      FieldDef array[] = {
        incodigo,
        insede,
        inusuari,
        inpuesto,
        ininstan,
        inambito,
        inmodulo,
        inprog,
        inrefer,
        innumer,
        inopera,
        inmensa        
        };
      setColumns(array);
      FieldDef arrayind1[] = { ininstan };
      Index arrayi[] = { 
        new Index("inincideinstante",arrayind1)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {incodigo,insede,inusuari,inpuesto };
      setPrimaryKeys(arrayf);
      incodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabImpemul extends TableDef
    {
    // Campos
    public FieldDef ememul;
    public FieldDef emdesc;
    public TabImpemul(String name)
      {
      super(name);
      ememul = new FieldDef("ememul",FieldDef.CHAR,15,FieldDef.NOTNULL);
      emdesc = new FieldDef("emdesc",FieldDef.CHAR,45);
      FieldDef array[] = {
        ememul,
        emdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {ememul };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabImpatrib extends TableDef
    {
    // Campos
    public FieldDef atatrib;
    public FieldDef atdesc;
    public TabImpatrib(String name)
      {
      super(name);
      atatrib = new FieldDef("atatrib",FieldDef.CHAR,15,FieldDef.NOTNULL);
      atdesc = new FieldDef("atdesc",FieldDef.CHAR,45);
      FieldDef array[] = {
        atatrib,
        atdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {atatrib };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabImpematr extends TableDef
    {
    // Campos
    public FieldDef eaemul;
    public FieldDef eaatrib;
    public FieldDef eaactiva;
    public FieldDef eadesact;
    public TabImpematr(String name)
      {
      super(name);
      eaemul = new FieldDef("eaemul",FieldDef.CHAR,15,FieldDef.NOTNULL);
      eaatrib = new FieldDef("eaatrib",FieldDef.CHAR,15,FieldDef.NOTNULL);
      eaactiva = new FieldDef("eaactiva",FieldDef.CHAR,255);
      eadesact = new FieldDef("eadesact",FieldDef.CHAR,255);
      FieldDef array[] = {
        eaemul,
        eaatrib,
        eaactiva,
        eadesact        
        };
      setColumns(array);
      FieldDef arrayf[] = {eaemul,eaatrib };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabImptipos extends TableDef
    {
    // Campos
    public FieldDef titipo;
    public FieldDef tidesc;
    public TabImptipos(String name)
      {
      super(name);
      titipo = new FieldDef("titipo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tidesc = new FieldDef("tidesc",FieldDef.CHAR,45);
      FieldDef array[] = {
        titipo,
        tidesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {titipo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabImpresor extends TableDef
    {
    // Campos
    public FieldDef imcodcon;
    public FieldDef imnombre;
    public FieldDef imdesc;
    public FieldDef imsysnom;
    public FieldDef imemul;
    public FieldDef impage;
    public FieldDef imtipo;
    public TabImpresor(String name)
      {
      super(name);
      imcodcon = new FieldDef("imcodcon",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      imnombre = new FieldDef("imnombre",FieldDef.CHAR,255,FieldDef.NOTNULL);
      imdesc = new FieldDef("imdesc",FieldDef.CHAR,255);
      imsysnom = new FieldDef("imsysnom",FieldDef.CHAR,255);
      imemul = new FieldDef("imemul",FieldDef.CHAR,15);
      impage = new FieldDef("impage",FieldDef.CHAR,15);
      imtipo = new FieldDef("imtipo",FieldDef.CHAR,1);
      FieldDef array[] = {
        imcodcon,
        imnombre,
        imdesc,
        imsysnom,
        imemul,
        impage,
        imtipo        
        };
      setColumns(array);
      FieldDef arrayf[] = {imcodcon,imnombre };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabImpdef extends TableDef
    {
    // Campos
    public FieldDef decodcon;
    public FieldDef detipo;
    public FieldDef deuser;
    public FieldDef deimpre;
    public TabImpdef(String name)
      {
      super(name);
      decodcon = new FieldDef("decodcon",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      detipo = new FieldDef("detipo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      deuser = new FieldDef("deuser",FieldDef.CHAR,25,FieldDef.NOTNULL);
      deimpre = new FieldDef("deimpre",FieldDef.CHAR,255);
      FieldDef array[] = {
        decodcon,
        detipo,
        deuser,
        deimpre        
        };
      setColumns(array);
      FieldDef arrayf[] = {decodcon,detipo,deuser };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabImpgrupo extends TableDef
    {
    // Campos
    public FieldDef grcodcon;
    public FieldDef grtipo;
    public FieldDef grimpre;
    public FieldDef grmodo;
    public TabImpgrupo(String name)
      {
      super(name);
      grcodcon = new FieldDef("grcodcon",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      grtipo = new FieldDef("grtipo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      grimpre = new FieldDef("grimpre",FieldDef.CHAR,255,FieldDef.NOTNULL);
      grmodo = new FieldDef("grmodo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      FieldDef array[] = {
        grcodcon,
        grtipo,
        grimpre,
        grmodo        
        };
      setColumns(array);
      FieldDef arrayf[] = {grcodcon,grtipo,grimpre,grmodo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabImpage extends TableDef
    {
    // Campos
    public FieldDef panombre;
    public FieldDef padesc;
    public FieldDef paancho;
    public FieldDef paalto;
    public FieldDef pamargeno;
    public FieldDef pamargenn;
    public FieldDef pamargene;
    public FieldDef pamargens;
    public FieldDef pacol;
    public FieldDef palin;
    public FieldDef pasepcol;
    public FieldDef paseplin;
    public TabImpage(String name)
      {
      super(name);
      panombre = new FieldDef("panombre",FieldDef.CHAR,15,FieldDef.NOTNULL);
      padesc = new FieldDef("padesc",FieldDef.CHAR,45);
      paancho = new FieldDef("paancho",FieldDef.INTEGER,0);
      paalto = new FieldDef("paalto",FieldDef.INTEGER,0);
      pamargeno = new FieldDef("pamargeno",FieldDef.INTEGER,0);
      pamargenn = new FieldDef("pamargenn",FieldDef.INTEGER,0);
      pamargene = new FieldDef("pamargene",FieldDef.INTEGER,0);
      pamargens = new FieldDef("pamargens",FieldDef.INTEGER,0);
      pacol = new FieldDef("pacol",FieldDef.INTEGER,0);
      palin = new FieldDef("palin",FieldDef.INTEGER,0);
      pasepcol = new FieldDef("pasepcol",FieldDef.INTEGER,0);
      paseplin = new FieldDef("paseplin",FieldDef.INTEGER,0);
      FieldDef array[] = {
        panombre,
        padesc,
        paancho,
        paalto,
        pamargeno,
        pamargenn,
        pamargene,
        pamargens,
        pacol,
        palin,
        pasepcol,
        paseplin        
        };
      setColumns(array);
      FieldDef arrayf[] = {panombre };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabBds extends TableDef
    {
    // Campos
    public FieldDef bdnombre;
    public FieldDef bdversio;
    public TabBds(String name)
      {
      super(name);
      bdnombre = new FieldDef("bdnombre",FieldDef.CHAR,15,FieldDef.NOTNULL);
      bdversio = new FieldDef("bdversio",FieldDef.CHAR,5);
      FieldDef array[] = {
        bdnombre,
        bdversio        
        };
      setColumns(array);
      FieldDef arrayf[] = {bdnombre };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabApl extends TableDef
    {
    // Campos
    public FieldDef apaplic;
    public FieldDef apdesc;
    public FieldDef apbdnom;
    public FieldDef apbduser;
    public FieldDef apbdpass;
    public FieldDef apbdserv;
    public FieldDef apbddriv;
    public FieldDef apescons;
    public TabApl(String name)
      {
      super(name);
      apaplic = new FieldDef("apaplic",FieldDef.CHAR,15,FieldDef.NOTNULL);
      apdesc = new FieldDef("apdesc",FieldDef.CHAR,45,FieldDef.NOTNULL);
      apbdnom = new FieldDef("apbdnom",FieldDef.CHAR,15,FieldDef.NOTNULL);
      apbduser = new FieldDef("apbduser",FieldDef.CHAR,15);
      apbdpass = new FieldDef("apbdpass",FieldDef.CHAR,15);
      apbdserv = new FieldDef("apbdserv",FieldDef.CHAR,80);
      apbddriv = new FieldDef("apbddriv",FieldDef.CHAR,30);
      apescons = new FieldDef("apescons",FieldDef.CHAR,1);
      FieldDef array[] = {
        apaplic,
        apdesc,
        apbdnom,
        apbduser,
        apbdpass,
        apbdserv,
        apbddriv,
        apescons        
        };
      setColumns(array);
      FieldDef arrayf[] = {apaplic,apbdnom };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTablas extends TableDef
    {
    // Campos
    public FieldDef taaplic;
    public FieldDef tatabla;
    public FieldDef tadescri;
    public TabTablas(String name)
      {
      super(name);
      taaplic = new FieldDef("taaplic",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tatabla = new FieldDef("tatabla",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tadescri = new FieldDef("tadescri",FieldDef.CHAR,45);
      FieldDef array[] = {
        taaplic,
        tatabla,
        tadescri        
        };
      setColumns(array);
      FieldDef arrayf[] = {taaplic,tatabla };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCampos extends TableDef
    {
    // Campos
    public FieldDef caaplic;
    public FieldDef catabla;
    public FieldDef cacampo;
    public FieldDef cadescri;
    public TabCampos(String name)
      {
      super(name);
      caaplic = new FieldDef("caaplic",FieldDef.CHAR,15,FieldDef.NOTNULL);
      catabla = new FieldDef("catabla",FieldDef.CHAR,15,FieldDef.NOTNULL);
      cacampo = new FieldDef("cacampo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      cadescri = new FieldDef("cadescri",FieldDef.CHAR,45);
      FieldDef array[] = {
        caaplic,
        catabla,
        cacampo,
        cadescri        
        };
      setColumns(array);
      FieldDef arrayf[] = {caaplic,catabla,cacampo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSede extends TableDef
    {
    // Campos
    public FieldDef cocodcon;
    public FieldDef codescon;
    public FieldDef cocodpai;
    public FieldDef codomini;
    public FieldDef codip;
    public FieldDef coduser;
    public FieldDef codpass;
    public TabSede(String name)
      {
      super(name);
      cocodcon = new FieldDef("cocodcon",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      codescon = new FieldDef("codescon",FieldDef.CHAR,15);
      cocodpai = new FieldDef("cocodpai",FieldDef.INTEGER,0);
      codomini = new FieldDef("codomini",FieldDef.CHAR,25);
      codip = new FieldDef("codip",FieldDef.CHAR,15);
      coduser = new FieldDef("coduser",FieldDef.CHAR,10);
      codpass = new FieldDef("codpass",FieldDef.CHAR,10);
      FieldDef array[] = {
        cocodcon,
        codescon,
        cocodpai,
        codomini,
        codip,
        coduser,
        codpass        
        };
      setColumns(array);
      FieldDef arrayf[] = {cocodcon };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabRbdctrap extends TableDef
    {
    // Campos
    public FieldDef sedelocal;
    public FieldDef aplicacion;
    public FieldDef sederemota;
    public FieldDef descarga;
    public FieldDef carga;
    public TabRbdctrap(String name)
      {
      super(name);
      sedelocal = new FieldDef("sedelocal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aplicacion = new FieldDef("aplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      sederemota = new FieldDef("sederemota",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      descarga = new FieldDef("descarga",FieldDef.CHAR,1);
      carga = new FieldDef("carga",FieldDef.CHAR,1);
      FieldDef array[] = {
        sedelocal,
        aplicacion,
        sederemota,
        descarga,
        carga        
        };
      setColumns(array);
      FieldDef arrayf[] = {sedelocal,aplicacion,sederemota };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabUsuario extends TableDef
    {
    // Campos
    public FieldDef uscodcon;
    public FieldDef uslogin;
    public FieldDef usnombre;
    public FieldDef uspasswd;
    public FieldDef usdirec;
    public FieldDef uscodpos;
    public FieldDef uspoblac;
    public FieldDef ustelefp;
    public FieldDef ustelmp;
    public FieldDef usseccio;
    public FieldDef usdepart;
    public FieldDef uscargo;
    public FieldDef ustelef;
    public FieldDef usemail;
    public FieldDef usfirma;
    public FieldDef usfoto;
    public TabUsuario(String name)
      {
      super(name);
      uscodcon = new FieldDef("uscodcon",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      uslogin = new FieldDef("uslogin",FieldDef.CHAR,25,FieldDef.NOTNULL);
      usnombre = new FieldDef("usnombre",FieldDef.CHAR,45);
      uspasswd = new FieldDef("uspasswd",FieldDef.CHAR,10);
      usdirec = new FieldDef("usdirec",FieldDef.CHAR,45);
      uscodpos = new FieldDef("uscodpos",FieldDef.CHAR,10);
      uspoblac = new FieldDef("uspoblac",FieldDef.CHAR,45);
      ustelefp = new FieldDef("ustelefp",FieldDef.CHAR,15);
      ustelmp = new FieldDef("ustelmp",FieldDef.CHAR,15);
      usseccio = new FieldDef("usseccio",FieldDef.CHAR,25);
      usdepart = new FieldDef("usdepart",FieldDef.CHAR,25);
      uscargo = new FieldDef("uscargo",FieldDef.CHAR,25);
      ustelef = new FieldDef("ustelef",FieldDef.CHAR,25);
      usemail = new FieldDef("usemail",FieldDef.CHAR,50);
      usfirma = new FieldDef("usfirma",FieldDef.CHAR,25);
      usfoto = new FieldDef("usfoto",FieldDef.CHAR,25);
      FieldDef array[] = {
        uscodcon,
        uslogin,
        usnombre,
        uspasswd,
        usdirec,
        uscodpos,
        uspoblac,
        ustelefp,
        ustelmp,
        usseccio,
        usdepart,
        uscargo,
        ustelef,
        usemail,
        usfirma,
        usfoto        
        };
      setColumns(array);
      FieldDef arrayf[] = {uscodcon,uslogin };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabUsgrupo extends TableDef
    {
    // Campos
    public FieldDef usggrupo;
    public FieldDef usgdescr;
    public TabUsgrupo(String name)
      {
      super(name);
      usggrupo = new FieldDef("usggrupo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      usgdescr = new FieldDef("usgdescr",FieldDef.CHAR,30);
      FieldDef array[] = {
        usggrupo,
        usgdescr        
        };
      setColumns(array);
      FieldDef arrayf[] = {usggrupo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabUsagrup extends TableDef
    {
    // Campos
    public FieldDef usacodco;
    public FieldDef usagrupo;
    public FieldDef usalogin;
    public TabUsagrup(String name)
      {
      super(name);
      usacodco = new FieldDef("usacodco",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      usagrupo = new FieldDef("usagrupo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      usalogin = new FieldDef("usalogin",FieldDef.CHAR,25,FieldDef.NOTNULL);
      FieldDef array[] = {
        usacodco,
        usagrupo,
        usalogin        
        };
      setColumns(array);
      FieldDef arrayind1[] = { usacodco,usalogin,usagrupo };
      Index arrayi[] = { 
        new Index("usagrupuser",arrayind1)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {usacodco,usagrupo,usalogin };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabUsrecursos extends TableDef
    {
    // Campos
    public FieldDef userecurso;
    public FieldDef usedescr;
    public TabUsrecursos(String name)
      {
      super(name);
      userecurso = new FieldDef("userecurso",FieldDef.CHAR,80,FieldDef.NOTNULL);
      usedescr = new FieldDef("usedescr",FieldDef.CHAR,80);
      FieldDef array[] = {
        userecurso,
        usedescr        
        };
      setColumns(array);
      FieldDef arrayf[] = {userecurso };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabUspermge extends TableDef
    {
    // Campos
    public FieldDef uspgrupo;
    public FieldDef usprecurso;
    public FieldDef uspposne;
    public TabUspermge(String name)
      {
      super(name);
      uspgrupo = new FieldDef("uspgrupo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      usprecurso = new FieldDef("usprecurso",FieldDef.CHAR,80,FieldDef.NOTNULL);
      uspposne = new FieldDef("uspposne",FieldDef.CHAR,1,FieldDef.NOTNULL);
      FieldDef array[] = {
        uspgrupo,
        usprecurso,
        uspposne        
        };
      setColumns(array);
      FieldDef arrayind1[] = { uspgrupo,usprecurso };
      Index arrayi[] = { 
        new Index("uspermgeuser",arrayind1)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {uspgrupo,usprecurso };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabUspermlo extends TableDef
    {
    // Campos
    public FieldDef uslcodco;
    public FieldDef usluser;
    public FieldDef uslrecurso;
    public FieldDef uslposne;
    public TabUspermlo(String name)
      {
      super(name);
      uslcodco = new FieldDef("uslcodco",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      usluser = new FieldDef("usluser",FieldDef.CHAR,25,FieldDef.NOTNULL);
      uslrecurso = new FieldDef("uslrecurso",FieldDef.CHAR,80,FieldDef.NOTNULL);
      uslposne = new FieldDef("uslposne",FieldDef.CHAR,1,FieldDef.NOTNULL);
      FieldDef array[] = {
        uslcodco,
        usluser,
        uslrecurso,
        uslposne        
        };
      setColumns(array);
      FieldDef arrayind1[] = { uslcodco,usluser,uslrecurso };
      Index arrayi[] = { 
        new Index("uspermlouser",arrayind1)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {uslcodco,usluser,uslrecurso };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabParametros extends TableDef
    {
    // Campos
    public FieldDef pardominio;
    public FieldDef parusuario;
    public FieldDef parambito;
    public FieldDef parvariable;
    public FieldDef pardesc;
    public FieldDef partipo;
    public FieldDef paragrup;
    public FieldDef parvalor;
    public FieldDef parespecific;
    public TabParametros(String name)
      {
      super(name);
      pardominio = new FieldDef("pardominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      parusuario = new FieldDef("parusuario",FieldDef.CHAR,25,FieldDef.NOTNULL);
      parambito = new FieldDef("parambito",FieldDef.CHAR,20,FieldDef.NOTNULL);
      parvariable = new FieldDef("parvariable",FieldDef.CHAR,15,FieldDef.NOTNULL);
      pardesc = new FieldDef("pardesc",FieldDef.CHAR,80);
      partipo = new FieldDef("partipo",FieldDef.CHAR,1);
      paragrup = new FieldDef("paragrup",FieldDef.CHAR,8);
      parvalor = new FieldDef("parvalor",FieldDef.CHAR,255);
      parespecific = new FieldDef("parespecific",FieldDef.CHAR,1);
      FieldDef array[] = {
        pardominio,
        parusuario,
        parambito,
        parvariable,
        pardesc,
        partipo,
        paragrup,
        parvalor,
        parespecific        
        };
      setColumns(array);
      FieldDef arrayf[] = {pardominio,parusuario,parambito,parvariable };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLopdacc extends TableDef
    {
    // Campos
    public FieldDef lopdacodigo;
    public FieldDef lopdaaplic;
    public FieldDef lopdaejer;
    public FieldDef lopdauser;
    public FieldDef lopdapuesto;
    public FieldDef lopdafechaacc;
    public FieldDef lopdahoraacc;
    public FieldDef lopdatipacc;
    public FieldDef lopdaprogram;
    public FieldDef lopdadescprog;
    public FieldDef lopdacodicdp;
    public FieldDef lopdanif;
    public TabLopdacc(String name)
      {
      super(name);
      lopdacodigo = new FieldDef("lopdacodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lopdaaplic = new FieldDef("lopdaaplic",FieldDef.CHAR,15);
      lopdaejer = new FieldDef("lopdaejer",FieldDef.INTEGER,0);
      lopdauser = new FieldDef("lopdauser",FieldDef.CHAR,15);
      lopdapuesto = new FieldDef("lopdapuesto",FieldDef.CHAR,45);
      lopdafechaacc = new FieldDef("lopdafechaacc",FieldDef.DATE);
      lopdahoraacc = new FieldDef("lopdahoraacc",FieldDef.CHAR,8);
      lopdatipacc = new FieldDef("lopdatipacc",FieldDef.CHAR,1);
      lopdaprogram = new FieldDef("lopdaprogram",FieldDef.CHAR,15);
      lopdadescprog = new FieldDef("lopdadescprog",FieldDef.CHAR,50);
      lopdacodicdp = new FieldDef("lopdacodicdp",FieldDef.CHAR,12);
      lopdanif = new FieldDef("lopdanif",FieldDef.CHAR,15);
      FieldDef array[] = {
        lopdacodigo,
        lopdaaplic,
        lopdaejer,
        lopdauser,
        lopdapuesto,
        lopdafechaacc,
        lopdahoraacc,
        lopdatipacc,
        lopdaprogram,
        lopdadescprog,
        lopdacodicdp,
        lopdanif        
        };
      setColumns(array);
      FieldDef arrayf[] = {lopdacodigo };
      setPrimaryKeys(arrayf);
      lopdacodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabLopdcop extends TableDef
    {
    // Campos
    public FieldDef lopdccodigo;
    public FieldDef lopdcfecha;
    public FieldDef lopdchora;
    public FieldDef lopdctipo;
    public FieldDef lopdsoporte;
    public FieldDef lopdcaplic;
    public FieldDef lopdcambito;
    public FieldDef lopdcdestino;
    public FieldDef lopdcuser;
    public FieldDef lopdcfecdevolu;
    public FieldDef lopdcfecdestru;
    public TabLopdcop(String name)
      {
      super(name);
      lopdccodigo = new FieldDef("lopdccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lopdcfecha = new FieldDef("lopdcfecha",FieldDef.DATE);
      lopdchora = new FieldDef("lopdchora",FieldDef.CHAR,8);
      lopdctipo = new FieldDef("lopdctipo",FieldDef.CHAR,1);
      lopdsoporte = new FieldDef("lopdsoporte",FieldDef.CHAR,15);
      lopdcaplic = new FieldDef("lopdcaplic",FieldDef.CHAR,15);
      lopdcambito = new FieldDef("lopdcambito",FieldDef.CHAR,30);
      lopdcdestino = new FieldDef("lopdcdestino",FieldDef.CHAR,30);
      lopdcuser = new FieldDef("lopdcuser",FieldDef.CHAR,15);
      lopdcfecdevolu = new FieldDef("lopdcfecdevolu",FieldDef.DATE);
      lopdcfecdestru = new FieldDef("lopdcfecdestru",FieldDef.DATE);
      FieldDef array[] = {
        lopdccodigo,
        lopdcfecha,
        lopdchora,
        lopdctipo,
        lopdsoporte,
        lopdcaplic,
        lopdcambito,
        lopdcdestino,
        lopdcuser,
        lopdcfecdevolu,
        lopdcfecdestru        
        };
      setColumns(array);
      FieldDef arrayf[] = {lopdccodigo };
      setPrimaryKeys(arrayf);
      lopdccodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabLopdinci extends TableDef
    {
    // Campos
    public FieldDef lopdicodigo;
    public FieldDef lopdifecha;
    public FieldDef lopdihora;
    public FieldDef lopditipo;
    public FieldDef lopdiaplic;
    public FieldDef lopdiuserorig;
    public FieldDef lopdifechaleid;
    public FieldDef lopdiuserdest;
    public FieldDef lopdiconsecuen;
    public FieldDef lopdileido;
    public TabLopdinci(String name)
      {
      super(name);
      lopdicodigo = new FieldDef("lopdicodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lopdifecha = new FieldDef("lopdifecha",FieldDef.DATE);
      lopdihora = new FieldDef("lopdihora",FieldDef.CHAR,8);
      lopditipo = new FieldDef("lopditipo",FieldDef.CHAR,20);
      lopdiaplic = new FieldDef("lopdiaplic",FieldDef.CHAR,15);
      lopdiuserorig = new FieldDef("lopdiuserorig",FieldDef.CHAR,15);
      lopdifechaleid = new FieldDef("lopdifechaleid",FieldDef.DATE);
      lopdiuserdest = new FieldDef("lopdiuserdest",FieldDef.CHAR,15);
      lopdiconsecuen = new FieldDef("lopdiconsecuen",FieldDef.CHAR,70);
      lopdileido = new FieldDef("lopdileido",FieldDef.CHAR,1);
      FieldDef array[] = {
        lopdicodigo,
        lopdifecha,
        lopdihora,
        lopditipo,
        lopdiaplic,
        lopdiuserorig,
        lopdifechaleid,
        lopdiuserdest,
        lopdiconsecuen,
        lopdileido        
        };
      setColumns(array);
      FieldDef arrayf[] = {lopdicodigo };
      setPrimaryKeys(arrayf);
      lopdicodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabQuefrase extends TableDef
    {
    // Campos
    public FieldDef qefaplicacion;
    public FieldDef qeffrase;
    public FieldDef qefdescripcion;
    public FieldDef qefmaster;
    public FieldDef qeftitulo;
    public FieldDef qefapaisado;
    public FieldDef qefletra;
    public FieldDef qefpaginado;
    public FieldDef qeffrom;
    public FieldDef qefwhere;
    public FieldDef qefect;
    public FieldDef qefrepetir;
    public FieldDef qefcount;
    public TabQuefrase(String name)
      {
      super(name);
      qefaplicacion = new FieldDef("qefaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qeffrase = new FieldDef("qeffrase",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qefdescripcion = new FieldDef("qefdescripcion",FieldDef.CHAR,80);
      qefmaster = new FieldDef("qefmaster",FieldDef.CHAR,15);
      qeftitulo = new FieldDef("qeftitulo",FieldDef.CHAR,80);
      qefapaisado = new FieldDef("qefapaisado",FieldDef.CHAR,1);
      qefletra = new FieldDef("qefletra",FieldDef.INTEGER,0);
      qefpaginado = new FieldDef("qefpaginado",FieldDef.CHAR,1);
      qeffrom = new FieldDef("qeffrom",FieldDef.CHAR,255);
      qefwhere = new FieldDef("qefwhere",FieldDef.CHAR,255);
      qefect = new FieldDef("qefect",FieldDef.CHAR,1);
      qefrepetir = new FieldDef("qefrepetir",FieldDef.CHAR,1);
      qefcount = new FieldDef("qefcount",FieldDef.CHAR,1);
      FieldDef array[] = {
        qefaplicacion,
        qeffrase,
        qefdescripcion,
        qefmaster,
        qeftitulo,
        qefapaisado,
        qefletra,
        qefpaginado,
        qeffrom,
        qefwhere,
        qefect,
        qefrepetir,
        qefcount        
        };
      setColumns(array);
      FieldDef arrayf[] = {qefaplicacion,qeffrase };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabQuevariables extends TableDef
    {
    // Campos
    public FieldDef qevaplicacion;
    public FieldDef qevfrase;
    public FieldDef qevorden;
    public FieldDef qevvariable;
    public FieldDef qevtipo;
    public FieldDef qevlongitud;
    public FieldDef qevtitulo;
    public FieldDef qevobligatorio;
    public FieldDef qevpredef;
    public FieldDef qevvalor;
    public FieldDef qevvisible;
    public FieldDef qevcomparacion;
    public FieldDef qevformato;
    public TabQuevariables(String name)
      {
      super(name);
      qevaplicacion = new FieldDef("qevaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qevfrase = new FieldDef("qevfrase",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qevorden = new FieldDef("qevorden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      qevvariable = new FieldDef("qevvariable",FieldDef.CHAR,15);
      qevtipo = new FieldDef("qevtipo",FieldDef.INTEGER,0);
      qevlongitud = new FieldDef("qevlongitud",FieldDef.INTEGER,0);
      qevtitulo = new FieldDef("qevtitulo",FieldDef.CHAR,20);
      qevobligatorio = new FieldDef("qevobligatorio",FieldDef.CHAR,1);
      qevpredef = new FieldDef("qevpredef",FieldDef.CHAR,15);
      qevvalor = new FieldDef("qevvalor",FieldDef.CHAR,255);
      qevvisible = new FieldDef("qevvisible",FieldDef.CHAR,1);
      qevcomparacion = new FieldDef("qevcomparacion",FieldDef.CHAR,2);
      qevformato = new FieldDef("qevformato",FieldDef.CHAR,15);
      FieldDef array[] = {
        qevaplicacion,
        qevfrase,
        qevorden,
        qevvariable,
        qevtipo,
        qevlongitud,
        qevtitulo,
        qevobligatorio,
        qevpredef,
        qevvalor,
        qevvisible,
        qevcomparacion,
        qevformato        
        };
      setColumns(array);
      FieldDef arrayf[] = {qevaplicacion,qevfrase,qevorden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabQuetabla extends TableDef
    {
    // Campos
    public FieldDef qetaplicacion;
    public FieldDef qetfrase;
    public FieldDef qetorden;
    public FieldDef qettabla;
    public FieldDef qetbbdd;
    public FieldDef qetrelacion;
    public TabQuetabla(String name)
      {
      super(name);
      qetaplicacion = new FieldDef("qetaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qetfrase = new FieldDef("qetfrase",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qetorden = new FieldDef("qetorden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      qettabla = new FieldDef("qettabla",FieldDef.CHAR,15);
      qetbbdd = new FieldDef("qetbbdd",FieldDef.CHAR,15);
      qetrelacion = new FieldDef("qetrelacion",FieldDef.CHAR,15);
      FieldDef array[] = {
        qetaplicacion,
        qetfrase,
        qetorden,
        qettabla,
        qetbbdd,
        qetrelacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {qetaplicacion,qetfrase,qetorden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabQuecolumn extends TableDef
    {
    // Campos
    public FieldDef qecaplicacion;
    public FieldDef qecfrase;
    public FieldDef qecorden;
    public FieldDef qeccampo;
    public FieldDef qectitulo;
    public FieldDef qeclongitud;
    public FieldDef qectipo;
    public FieldDef qectabla;
    public FieldDef qecvisible;
    public FieldDef qecrestriccion;
    public FieldDef qecorderby;
    public FieldDef qecacumula;
    public FieldDef qecsaltapag;
    public FieldDef qecinipag;
    public FieldDef qecformato;
    public FieldDef qecbbdd;
    public FieldDef qecsum;
    public FieldDef qecgrupby;
    public TabQuecolumn(String name)
      {
      super(name);
      qecaplicacion = new FieldDef("qecaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qecfrase = new FieldDef("qecfrase",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qecorden = new FieldDef("qecorden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      qeccampo = new FieldDef("qeccampo",FieldDef.CHAR,15);
      qectitulo = new FieldDef("qectitulo",FieldDef.CHAR,80);
      qeclongitud = new FieldDef("qeclongitud",FieldDef.INTEGER,0);
      qectipo = new FieldDef("qectipo",FieldDef.INTEGER,0);
      qectabla = new FieldDef("qectabla",FieldDef.CHAR,15);
      qecvisible = new FieldDef("qecvisible",FieldDef.CHAR,1);
      qecrestriccion = new FieldDef("qecrestriccion",FieldDef.CHAR,255);
      qecorderby = new FieldDef("qecorderby",FieldDef.CHAR,1);
      qecacumula = new FieldDef("qecacumula",FieldDef.CHAR,1);
      qecsaltapag = new FieldDef("qecsaltapag",FieldDef.CHAR,1);
      qecinipag = new FieldDef("qecinipag",FieldDef.CHAR,1);
      qecformato = new FieldDef("qecformato",FieldDef.CHAR,80);
      qecbbdd = new FieldDef("qecbbdd",FieldDef.CHAR,15);
      qecsum = new FieldDef("qecsum",FieldDef.CHAR,1);
      qecgrupby = new FieldDef("qecgrupby",FieldDef.CHAR,1);
      FieldDef array[] = {
        qecaplicacion,
        qecfrase,
        qecorden,
        qeccampo,
        qectitulo,
        qeclongitud,
        qectipo,
        qectabla,
        qecvisible,
        qecrestriccion,
        qecorderby,
        qecacumula,
        qecsaltapag,
        qecinipag,
        qecformato,
        qecbbdd,
        qecsum,
        qecgrupby        
        };
      setColumns(array);
      FieldDef arrayf[] = {qecaplicacion,qecfrase,qecorden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabMir extends TableDef
    {
    // Campos
    public FieldDef mircodi;
    public FieldDef mircdp;
    public FieldDef mircif;
    public FieldDef miractivado;
    public FieldDef mirestado;
    public FieldDef mirfechacrea;
    public FieldDef mirfechaenvio;
    public FieldDef mirdesc;
    public FieldDef miraplic;
    public FieldDef mirtipdoc;
    public FieldDef mirtipfile;
    public FieldDef mirmcodemp;
    public FieldDef mirnomcodcen;
    public FieldDef mirnomcodtra;
    public FieldDef mirubicacion;
    public TabMir(String name)
      {
      super(name);
      mircodi = new FieldDef("mircodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mircdp = new FieldDef("mircdp",FieldDef.CHAR,12);
      mircif = new FieldDef("mircif",FieldDef.CHAR,15);
      miractivado = new FieldDef("miractivado",FieldDef.CHAR,1);
      mirestado = new FieldDef("mirestado",FieldDef.CHAR,1);
      mirfechacrea = new FieldDef("mirfechacrea",FieldDef.DATE);
      mirfechaenvio = new FieldDef("mirfechaenvio",FieldDef.DATE);
      mirdesc = new FieldDef("mirdesc",FieldDef.CHAR,100);
      miraplic = new FieldDef("miraplic",FieldDef.CHAR,15);
      mirtipdoc = new FieldDef("mirtipdoc",FieldDef.CHAR,20);
      mirtipfile = new FieldDef("mirtipfile",FieldDef.CHAR,3);
      mirmcodemp = new FieldDef("mirmcodemp",FieldDef.INTEGER,0);
      mirnomcodcen = new FieldDef("mirnomcodcen",FieldDef.INTEGER,0);
      mirnomcodtra = new FieldDef("mirnomcodtra",FieldDef.INTEGER,0);
      mirubicacion = new FieldDef("mirubicacion",FieldDef.CHAR,200);
      FieldDef array[] = {
        mircodi,
        mircdp,
        mircif,
        miractivado,
        mirestado,
        mirfechacrea,
        mirfechaenvio,
        mirdesc,
        miraplic,
        mirtipdoc,
        mirtipfile,
        mirmcodemp,
        mirnomcodcen,
        mirnomcodtra,
        mirubicacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {mircodi };
      setPrimaryKeys(arrayf);
      mircodi.setAutoIncrementable(true);
      }
    }
    
  public class TabNotas extends TableDef
    {
    // Campos
    public FieldDef nocodigo;
    public FieldDef noorigen;
    public FieldDef nousorigen;
    public FieldDef noaplorigen;
    public FieldDef nousdestino;
    public FieldDef noapldestino;
    public FieldDef noproceso;
    public FieldDef noestado;
    public FieldDef nodescripcion;
    public FieldDef nofecvenc;
    public FieldDef nofecalta;
    public FieldDef nofecvisto;
    public TabNotas(String name)
      {
      super(name);
      nocodigo = new FieldDef("nocodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      noorigen = new FieldDef("noorigen",FieldDef.CHAR,12);
      nousorigen = new FieldDef("nousorigen",FieldDef.CHAR,20);
      noaplorigen = new FieldDef("noaplorigen",FieldDef.CHAR,15);
      nousdestino = new FieldDef("nousdestino",FieldDef.CHAR,20);
      noapldestino = new FieldDef("noapldestino",FieldDef.CHAR,15);
      noproceso = new FieldDef("noproceso",FieldDef.CHAR,15);
      noestado = new FieldDef("noestado",FieldDef.CHAR,1);
      nodescripcion = new FieldDef("nodescripcion",FieldDef.CHAR,512);
      nofecvenc = new FieldDef("nofecvenc",FieldDef.DATE);
      nofecalta = new FieldDef("nofecalta",FieldDef.DATE);
      nofecvisto = new FieldDef("nofecvisto",FieldDef.DATE);
      FieldDef array[] = {
        nocodigo,
        noorigen,
        nousorigen,
        noaplorigen,
        nousdestino,
        noapldestino,
        noproceso,
        noestado,
        nodescripcion,
        nofecvenc,
        nofecalta,
        nofecvisto        
        };
      setColumns(array);
      FieldDef arrayf[] = {nocodigo };
      setPrimaryKeys(arrayf);
      nocodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabPerfiltribut extends TableDef
    {
    // Campos
    public FieldDef pftejercicio;
    public FieldDef pftnif;
    public FieldDef pftgranemp;
    public FieldDef pfttipoavisos;
    public FieldDef pftemail;
    public FieldDef pftmovil;
    public FieldDef pftalquileres;
    public FieldDef pftintracom;
    public FieldDef pftintrastat;
    public FieldDef pftfechafin;
    public FieldDef pftregdevmen;
    public TabPerfiltribut(String name)
      {
      super(name);
      pftejercicio = new FieldDef("pftejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pftnif = new FieldDef("pftnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      pftgranemp = new FieldDef("pftgranemp",FieldDef.CHAR,1);
      pfttipoavisos = new FieldDef("pfttipoavisos",FieldDef.CHAR,1);
      pftemail = new FieldDef("pftemail",FieldDef.CHAR,80);
      pftmovil = new FieldDef("pftmovil",FieldDef.CHAR,15);
      pftalquileres = new FieldDef("pftalquileres",FieldDef.CHAR,1);
      pftintracom = new FieldDef("pftintracom",FieldDef.CHAR,1);
      pftintrastat = new FieldDef("pftintrastat",FieldDef.CHAR,1);
      pftfechafin = new FieldDef("pftfechafin",FieldDef.DATE);
      pftregdevmen = new FieldDef("pftregdevmen",FieldDef.CHAR,1);
      FieldDef array[] = {
        pftejercicio,
        pftnif,
        pftgranemp,
        pfttipoavisos,
        pftemail,
        pftmovil,
        pftalquileres,
        pftintracom,
        pftintrastat,
        pftfechafin,
        pftregdevmen        
        };
      setColumns(array);
      FieldDef arrayf[] = {pftejercicio,pftnif };
      setDescription("Perfil tributario");
      setPrimaryKeys(arrayf);
      pftejercicio.setDescription("Ejercicio");
      pftnif.setDescription("NIF Empresa");
      pftgranemp.setDescription("Si es Gran Empresa");
      pfttipoavisos.setDescription("Tipo de avisos (1- Mail, 2- SMS, 3- SMS y Mail)");
      pftemail.setDescription("Dirección e-mail de avisos");
      pftmovil.setDescription("Teléfono movil para avisos");
      pftalquileres.setDescription("Dispone de locales en régimen de alquiler");
      pftintracom.setDescription("Realiza operaciones intracomunitarias (0-No realiza, 1-Inferiores a 35000, 2-Superiores)");
      pftintrastat.setDescription("Intrastat (I=Introducción, E=Expedición, A=Ambas)");
      pftfechafin.setDescription("Fecha fin ejercicio");
      pftregdevmen.setDescription("Esta inscrito Regimen Devolucion mensual");
      }
    }
    
  public class TabEmpmodelos extends TableDef
    {
    // Campos
    public FieldDef emodejercicio;
    public FieldDef emodnif;
    public FieldDef emodmodelo;
    public FieldDef emodtipoper;
    public FieldDef emodactivo;
    public TabEmpmodelos(String name)
      {
      super(name);
      emodejercicio = new FieldDef("emodejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      emodnif = new FieldDef("emodnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      emodmodelo = new FieldDef("emodmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      emodtipoper = new FieldDef("emodtipoper",FieldDef.CHAR,2);
      emodactivo = new FieldDef("emodactivo",FieldDef.CHAR,1);
      FieldDef array[] = {
        emodejercicio,
        emodnif,
        emodmodelo,
        emodtipoper,
        emodactivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {emodejercicio,emodnif,emodmodelo };
      setDescription("Perfil tributario, relación de modelos");
      setPrimaryKeys(arrayf);
      emodejercicio.setDescription("Ejercicio");
      emodnif.setDescription("NIF Empresa");
      emodmodelo.setDescription("Código de modelo");
      emodtipoper.setDescription("Tipo de periodo");
      emodactivo.setDescription("Activo");
      }
    }
    
  public class TabAvisado extends TableDef
    {
    // Campos
    public FieldDef aviejercicio;
    public FieldDef avinif;
    public FieldDef avimodelo;
    public FieldDef aviperiodo;
    public FieldDef avinivel;
    public FieldDef avifecha;
    public TabAvisado(String name)
      {
      super(name);
      aviejercicio = new FieldDef("aviejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      avinif = new FieldDef("avinif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      avimodelo = new FieldDef("avimodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      aviperiodo = new FieldDef("aviperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      avinivel = new FieldDef("avinivel",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      avifecha = new FieldDef("avifecha",FieldDef.DATE);
      FieldDef array[] = {
        aviejercicio,
        avinif,
        avimodelo,
        aviperiodo,
        avinivel,
        avifecha        
        };
      setColumns(array);
      FieldDef arrayf[] = {aviejercicio,avinif,avimodelo,aviperiodo,avinivel };
      setDescription("Avisos fiscales generados");
      setPrimaryKeys(arrayf);
      aviejercicio.setDescription("Ejercicio");
      avinif.setDescription("NIF Empresa");
      avimodelo.setDescription("Código de modelo");
      aviperiodo.setDescription("Periodo");
      avinivel.setDescription("Nivel (1: primer dia de plaç, 2: a 4 dies del final, 3: ultim dia)");
      avifecha.setDescription("Fecha de emisión del aviso");
      }
    }
    
  public class TabTipovias extends TableDef
    {
    // Campos
    public FieldDef tvscodigo;
    public FieldDef tvsdesc;
    public FieldDef tvscodant;
    public TabTipovias(String name)
      {
      super(name);
      tvscodigo = new FieldDef("tvscodigo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      tvsdesc = new FieldDef("tvsdesc",FieldDef.CHAR,30);
      tvscodant = new FieldDef("tvscodant",FieldDef.CHAR,2);
      FieldDef array[] = {
        tvscodigo,
        tvsdesc,
        tvscodant        
        };
      setColumns(array);
      FieldDef arrayf[] = {tvscodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabMuni347 extends TableDef
    {
    // Campos
    public FieldDef mu7codprov;
    public FieldDef mu7codmuni;
    public FieldDef mu7desc;
    public FieldDef mu7muniant;
    public FieldDef mu7provmuni;
    public TabMuni347(String name)
      {
      super(name);
      mu7codprov = new FieldDef("mu7codprov",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mu7codmuni = new FieldDef("mu7codmuni",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mu7desc = new FieldDef("mu7desc",FieldDef.CHAR,50);
      mu7muniant = new FieldDef("mu7muniant",FieldDef.INTEGER,0);
      mu7provmuni = new FieldDef("mu7provmuni",FieldDef.CHAR,5);
      FieldDef array[] = {
        mu7codprov,
        mu7codmuni,
        mu7desc,
        mu7muniant,
        mu7provmuni        
        };
      setColumns(array);
      FieldDef arrayf[] = {mu7codprov,mu7codmuni };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCnae2009 extends TableDef
    {
    // Campos
    public FieldDef cn9codigo;
    public FieldDef cn9desc;
    public TabCnae2009(String name)
      {
      super(name);
      cn9codigo = new FieldDef("cn9codigo",FieldDef.CHAR,6,FieldDef.NOTNULL);
      cn9desc = new FieldDef("cn9desc",FieldDef.CHAR,120);
      FieldDef array[] = {
        cn9codigo,
        cn9desc        
        };
      setColumns(array);
      FieldDef arrayf[] = {cn9codigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCnaeequiv extends TableDef
    {
    // Campos
    public FieldDef cnecod93;
    public FieldDef cnecod09;
    public FieldDef cnedesc93;
    public FieldDef cnedesc09;
    public TabCnaeequiv(String name)
      {
      super(name);
      cnecod93 = new FieldDef("cnecod93",FieldDef.CHAR,6,FieldDef.NOTNULL);
      cnecod09 = new FieldDef("cnecod09",FieldDef.CHAR,6,FieldDef.NOTNULL);
      cnedesc93 = new FieldDef("cnedesc93",FieldDef.CHAR,120);
      cnedesc09 = new FieldDef("cnedesc09",FieldDef.CHAR,120);
      FieldDef array[] = {
        cnecod93,
        cnecod09,
        cnedesc93,
        cnedesc09        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnecod93,cnecod09 };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCodigoregistro extends TableDef
    {
    // Campos
    public FieldDef crenombre;
    public FieldDef crecodigo;
    public TabCodigoregistro(String name)
      {
      super(name);
      crenombre = new FieldDef("crenombre",FieldDef.CHAR,30,FieldDef.NOTNULL);
      crecodigo = new FieldDef("crecodigo",FieldDef.CHAR,5);
      FieldDef array[] = {
        crenombre,
        crecodigo        
        };
      setColumns(array);
      FieldDef arrayf[] = {crenombre };
      setDescription("Codigos Registro Mercantil");
      setPrimaryKeys(arrayf);
      crenombre.setDescription("Nombre Registro Mercantil");
      crecodigo.setDescription("Codigo Registro Mercantil");
      }
    }
    
  public class TabCoeficcorrec extends TableDef
    {
    // Campos
    public FieldDef coeejerfiscal;
    public FieldDef coeejercicio;
    public FieldDef coecoeficiente;
    public TabCoeficcorrec(String name)
      {
      super(name);
      coeejerfiscal = new FieldDef("coeejerfiscal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      coeejercicio = new FieldDef("coeejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      coecoeficiente = new FieldDef("coecoeficiente",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        coeejerfiscal,
        coeejercicio,
        coecoeficiente        
        };
      setColumns(array);
      FieldDef arrayf[] = {coeejerfiscal,coeejercicio };
      setDescription("Coeficientes correccion monetaria");
      setPrimaryKeys(arrayf);
      coeejerfiscal.setDescription("Ejercicio fiscal");
      coeejercicio.setDescription("Ejercicio");
      coecoeficiente.setDescription("Coeficiente correccion");
      }
    }
    
  public class TabIndemora extends TableDef
    {
    // Campos
    public FieldDef indejercicio;
    public FieldDef inddesdefecha;
    public FieldDef indhastafecha;
    public FieldDef indtipo_vigente;
    public TabIndemora(String name)
      {
      super(name);
      indejercicio = new FieldDef("indejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      inddesdefecha = new FieldDef("inddesdefecha",FieldDef.DATE);
      indhastafecha = new FieldDef("indhastafecha",FieldDef.DATE);
      indtipo_vigente = new FieldDef("indtipo_vigente",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        indejercicio,
        inddesdefecha,
        indhastafecha,
        indtipo_vigente        
        };
      setColumns(array);
      FieldDef arrayf[] = {indejercicio,inddesdefecha,indhastafecha };
      setDescription("Interes de demora");
      setPrimaryKeys(arrayf);
      indejercicio.setDescription("Ejercicio");
      inddesdefecha.setDescription("Desde fecha");
      indhastafecha.setDescription("Hasta fecha");
      indtipo_vigente.setDescription("Tipo vigente interes de demora");
      }
    }
    
  public class TabPerfilusuario extends TableDef
    {
    // Campos
    public FieldDef pfcodigo;
    public FieldDef pfnombrepc;
    public FieldDef pfresponsable;
    public FieldDef pfpantalla;
    public FieldDef pfusergelix;
    public FieldDef pfgrupogelix;
    public FieldDef pfurlgeyce;
    public FieldDef pfasesor;
    public TabPerfilusuario(String name)
      {
      super(name);
      pfcodigo = new FieldDef("pfcodigo",FieldDef.CHAR,25,FieldDef.NOTNULL);
      pfnombrepc = new FieldDef("pfnombrepc",FieldDef.CHAR,25,FieldDef.NOTNULL);
      pfresponsable = new FieldDef("pfresponsable",FieldDef.CHAR,25);
      pfpantalla = new FieldDef("pfpantalla",FieldDef.INTEGER,0);
      pfusergelix = new FieldDef("pfusergelix",FieldDef.CHAR,10);
      pfgrupogelix = new FieldDef("pfgrupogelix",FieldDef.CHAR,5);
      pfurlgeyce = new FieldDef("pfurlgeyce",FieldDef.CHAR,600);
      pfasesor = new FieldDef("pfasesor",FieldDef.INTEGER,0);
      FieldDef array[] = {
        pfcodigo,
        pfnombrepc,
        pfresponsable,
        pfpantalla,
        pfusergelix,
        pfgrupogelix,
        pfurlgeyce,
        pfasesor        
        };
      setColumns(array);
      FieldDef arrayf[] = {pfcodigo,pfnombrepc };
      setPrimaryKeys(arrayf);
      }
    }
    
  public CatEasp()
    {
    tabgycauto = new TabGycauto("gycauto");
    tabsetupapl = new TabSetupapl("setupapl");
    tabvalores = new TabValores("valores");
    tabtransacciones = new TabTransacciones("transacciones");
    tabcnae = new TabCnae("cnae");
    tabbanco = new TabBanco("banco");
    tabdelhacienda = new TabDelhacienda("delhacienda");
    tabadmhacienda = new TabAdmhacienda("admhacienda");
    tabpais = new TabPais("pais");
    tabcomuniauton = new TabComuniauton("comuniauton");
    tabprovincia = new TabProvincia("provincia");
    tabmunicipio = new TabMunicipio("municipio");
    tabnifes = new TabNifes("nifes");
    tabnifesmuf = new TabNifesmuf("nifesmuf");
    tabcdp = new TabCdp("cdp");
    tabrepresentantes = new TabRepresentantes("representantes");
    tabagpi = new TabAgpi("agpi");
    tabpdfref = new TabPdfref("pdfref");
    tabamortizacion = new TabAmortizacion("amortizacion");
    tabepigrafes = new TabEpigrafes("epigrafes");
    tabbancocli = new TabBancocli("bancocli");
    tabasignaciones = new TabAsignaciones("asignaciones");
    tabnumeraciones = new TabNumeraciones("numeraciones");
    tabdp = new TabDp("dp");
    tabfechas = new TabFechas("fechas");
    tabbdscargadas = new TabBdscargadas("bdscargadas");
    tabconver = new TabConver("conver");
    tabayudatxt = new TabAyudatxt("ayudatxt");
    tabinerrcod = new TabInerrcod("inerrcod");
    tabinincide = new TabInincide("inincide");
    tabimpemul = new TabImpemul("impemul");
    tabimpatrib = new TabImpatrib("impatrib");
    tabimpematr = new TabImpematr("impematr");
    tabimptipos = new TabImptipos("imptipos");
    tabimpresor = new TabImpresor("impresor");
    tabimpdef = new TabImpdef("impdef");
    tabimpgrupo = new TabImpgrupo("impgrupo");
    tabimpage = new TabImpage("impage");
    tabbds = new TabBds("bds");
    tabapl = new TabApl("apl");
    tabtablas = new TabTablas("tablas");
    tabcampos = new TabCampos("campos");
    tabsede = new TabSede("sede");
    tabrbdctrap = new TabRbdctrap("rbdctrap");
    tabusuario = new TabUsuario("usuario");
    tabusgrupo = new TabUsgrupo("usgrupo");
    tabusagrup = new TabUsagrup("usagrup");
    tabusrecursos = new TabUsrecursos("usrecursos");
    tabuspermge = new TabUspermge("uspermge");
    tabuspermlo = new TabUspermlo("uspermlo");
    tabparametros = new TabParametros("parametros");
    tablopdacc = new TabLopdacc("lopdacc");
    tablopdcop = new TabLopdcop("lopdcop");
    tablopdinci = new TabLopdinci("lopdinci");
    tabquefrase = new TabQuefrase("quefrase");
    tabquevariables = new TabQuevariables("quevariables");
    tabquetabla = new TabQuetabla("quetabla");
    tabquecolumn = new TabQuecolumn("quecolumn");
    tabmir = new TabMir("mir");
    tabnotas = new TabNotas("notas");
    tabperfiltribut = new TabPerfiltribut("perfiltribut");
    tabempmodelos = new TabEmpmodelos("empmodelos");
    tabavisado = new TabAvisado("avisado");
    tabtipovias = new TabTipovias("tipovias");
    tabmuni347 = new TabMuni347("muni347");
    tabcnae2009 = new TabCnae2009("cnae2009");
    tabcnaeequiv = new TabCnaeequiv("cnaeequiv");
    tabcodigoregistro = new TabCodigoregistro("codigoregistro");
    tabcoeficcorrec = new TabCoeficcorrec("coeficcorrec");
    tabindemora = new TabIndemora("indemora");
    tabperfilusuario = new TabPerfilusuario("perfilusuario");
    TableDef array[] = {
      tabgycauto,
      tabsetupapl,
      tabvalores,
      tabtransacciones,
      tabcnae,
      tabbanco,
      tabdelhacienda,
      tabadmhacienda,
      tabpais,
      tabcomuniauton,
      tabprovincia,
      tabmunicipio,
      tabnifes,
      tabnifesmuf,
      tabcdp,
      tabrepresentantes,
      tabagpi,
      tabpdfref,
      tabamortizacion,
      tabepigrafes,
      tabbancocli,
      tabasignaciones,
      tabnumeraciones,
      tabdp,
      tabfechas,
      tabbdscargadas,
      tabconver,
      tabayudatxt,
      tabinerrcod,
      tabinincide,
      tabimpemul,
      tabimpatrib,
      tabimpematr,
      tabimptipos,
      tabimpresor,
      tabimpdef,
      tabimpgrupo,
      tabimpage,
      tabbds,
      tabapl,
      tabtablas,
      tabcampos,
      tabsede,
      tabrbdctrap,
      tabusuario,
      tabusgrupo,
      tabusagrup,
      tabusrecursos,
      tabuspermge,
      tabuspermlo,
      tabparametros,
      tablopdacc,
      tablopdcop,
      tablopdinci,
      tabquefrase,
      tabquevariables,
      tabquetabla,
      tabquecolumn,
      tabmir,
      tabnotas,
      tabperfiltribut,
      tabempmodelos,
      tabavisado,
      tabtipovias,
      tabmuni347,
      tabcnae2009,
      tabcnaeequiv,
      tabcodigoregistro,
      tabcoeficcorrec,
      tabindemora,
      tabperfilusuario      
      };
    setTables(array);
    FieldDef tabadmhaciendaArrayf1[] = { tabadmhacienda.ahdele };
    ForeignKey tabadmhaciendaArrayfk[] = { 
      new ForeignKey(tabdelhacienda,tabadmhaciendaArrayf1)      
      };
    tabadmhacienda.setForeignKeys(tabadmhaciendaArrayfk);
    FieldDef tabprovinciaArrayf1[] = { tabprovincia.pvcomuni };
    ForeignKey tabprovinciaArrayfk[] = { 
      new ForeignKey(tabcomuniauton,tabprovinciaArrayf1)      
      };
    tabprovincia.setForeignKeys(tabprovinciaArrayfk);
    FieldDef tabmunicipioArrayf1[] = { tabmunicipio.muprov };
    ForeignKey tabmunicipioArrayfk[] = { 
      new ForeignKey(tabprovincia,tabmunicipioArrayf1)      
      };
    tabmunicipio.setForeignKeys(tabmunicipioArrayfk);
    FieldDef tabnifesmufArrayf1[] = { tabnifesmuf.mufnif };
    ForeignKey tabnifesmufArrayfk[] = { 
      new ForeignKey(tabnifes,tabnifesmufArrayf1)      
      };
    tabnifesmuf.setForeignKeys(tabnifesmufArrayfk);
    FieldDef tabcdpArrayf1[] = { tabcdp.cdpnifcif };
    FieldDef tabcdpArrayf2[] = { tabcdp.cdpcdprel };
    FieldDef tabcdpArrayf3[] = { tabcdp.cdpaeatdele };
    FieldDef tabcdpArrayf4[] = { tabcdp.cdpaeatdele,tabcdp.cdpaeatadm };
    ForeignKey tabcdpArrayfk[] = { 
      new ForeignKey(tabnifes,tabcdpArrayf1),
      new ForeignKey(tabcdp,tabcdpArrayf2),
      new ForeignKey(tabdelhacienda,tabcdpArrayf3),
      new ForeignKey(tabadmhacienda,tabcdpArrayf4)      
      };
    tabcdp.setForeignKeys(tabcdpArrayfk);
    FieldDef tabrepresentantesArrayf1[] = { tabrepresentantes.repcodigo };
    FieldDef tabrepresentantesArrayf2[] = { tabrepresentantes.repnifcif };
    ForeignKey tabrepresentantesArrayfk[] = { 
      new ForeignKey(tabcdp,tabrepresentantesArrayf1),
      new ForeignKey(tabnifes,tabrepresentantesArrayf2)      
      };
    tabrepresentantes.setForeignKeys(tabrepresentantesArrayfk);
    FieldDef tabbancocliArrayf1[] = { tabbancocli.bcccodigo };
    FieldDef tabbancocliArrayf2[] = { tabbancocli.bccbanco };
    FieldDef tabbancocliArrayf3[] = { tabbancocli.bccprovincia,tabbancocli.bcccodmuni };
    FieldDef tabbancocliArrayf4[] = { tabbancocli.bccprovincia };
    ForeignKey tabbancocliArrayfk[] = { 
      new ForeignKey(tabcdp,tabbancocliArrayf1),
      new ForeignKey(tabbanco,tabbancocliArrayf2),
      new ForeignKey(tabmunicipio,tabbancocliArrayf3),
      new ForeignKey(tabprovincia,tabbancocliArrayf4)      
      };
    tabbancocli.setForeignKeys(tabbancocliArrayfk);
    FieldDef tabasignacionesArrayf1[] = { tabasignaciones.abacodigo };
    ForeignKey tabasignacionesArrayfk[] = { 
      new ForeignKey(tabcdp,tabasignacionesArrayf1)      
      };
    tabasignaciones.setForeignKeys(tabasignacionesArrayfk);
    FieldDef tabdpArrayf1[] = { tabdp.dpnifcif };
    ForeignKey tabdpArrayfk[] = { 
      new ForeignKey(tabnifes,tabdpArrayf1)      
      };
    tabdp.setForeignKeys(tabdpArrayfk);
    FieldDef tabimpematrArrayf1[] = { tabimpematr.eaemul };
    FieldDef tabimpematrArrayf2[] = { tabimpematr.eaatrib };
    ForeignKey tabimpematrArrayfk[] = { 
      new ForeignKey(tabimpemul,tabimpematrArrayf1),
      new ForeignKey(tabimpatrib,tabimpematrArrayf2)      
      };
    tabimpematr.setForeignKeys(tabimpematrArrayfk);
    FieldDef tabimpresorArrayf1[] = { tabimpresor.imemul };
    ForeignKey tabimpresorArrayfk[] = { 
      new ForeignKey(tabimpemul,tabimpresorArrayf1)      
      };
    tabimpresor.setForeignKeys(tabimpresorArrayfk);
    FieldDef tabimpdefArrayf1[] = { tabimpdef.detipo };
    FieldDef tabimpdefArrayf2[] = { tabimpdef.decodcon,tabimpdef.deuser };
    ForeignKey tabimpdefArrayfk[] = { 
      new ForeignKey(tabimptipos,tabimpdefArrayf1),
      new ForeignKey(tabusuario,tabimpdefArrayf2)      
      };
    tabimpdef.setForeignKeys(tabimpdefArrayfk);
    FieldDef tabimpgrupoArrayf1[] = { tabimpgrupo.grtipo };
    FieldDef tabimpgrupoArrayf2[] = { tabimpgrupo.grcodcon,tabimpgrupo.grimpre };
    ForeignKey tabimpgrupoArrayfk[] = { 
      new ForeignKey(tabimptipos,tabimpgrupoArrayf1),
      new ForeignKey(tabimpresor,tabimpgrupoArrayf2)      
      };
    tabimpgrupo.setForeignKeys(tabimpgrupoArrayfk);
    FieldDef tabaplArrayf1[] = { tabapl.apbdnom };
    ForeignKey tabaplArrayfk[] = { 
      new ForeignKey(tabbds,tabaplArrayf1)      
      };
    tabapl.setForeignKeys(tabaplArrayfk);
    FieldDef tabcamposArrayf1[] = { tabcampos.caaplic,tabcampos.catabla };
    ForeignKey tabcamposArrayfk[] = { 
      new ForeignKey(tabtablas,tabcamposArrayf1)      
      };
    tabcampos.setForeignKeys(tabcamposArrayfk);
    FieldDef tabusagrupArrayf1[] = { tabusagrup.usagrupo };
    FieldDef tabusagrupArrayf2[] = { tabusagrup.usacodco,tabusagrup.usalogin };
    ForeignKey tabusagrupArrayfk[] = { 
      new ForeignKey(tabusgrupo,tabusagrupArrayf1),
      new ForeignKey(tabusuario,tabusagrupArrayf2)      
      };
    tabusagrup.setForeignKeys(tabusagrupArrayfk);
    FieldDef tabuspermgeArrayf1[] = { tabuspermge.uspgrupo };
    FieldDef tabuspermgeArrayf2[] = { tabuspermge.usprecurso };
    ForeignKey tabuspermgeArrayfk[] = { 
      new ForeignKey(tabusgrupo,tabuspermgeArrayf1),
      new ForeignKey(tabusrecursos,tabuspermgeArrayf2)      
      };
    tabuspermge.setForeignKeys(tabuspermgeArrayfk);
    FieldDef tabuspermloArrayf1[] = { tabuspermlo.uslcodco,tabuspermlo.usluser };
    FieldDef tabuspermloArrayf2[] = { tabuspermlo.uslrecurso };
    ForeignKey tabuspermloArrayfk[] = { 
      new ForeignKey(tabusuario,tabuspermloArrayf1),
      new ForeignKey(tabusrecursos,tabuspermloArrayf2)      
      };
    tabuspermlo.setForeignKeys(tabuspermloArrayfk);
    FieldDef tabempmodelosArrayf1[] = { tabempmodelos.emodejercicio,tabempmodelos.emodnif };
    ForeignKey tabempmodelosArrayfk[] = { 
      new ForeignKey(tabperfiltribut,tabempmodelosArrayf1)      
      };
    tabempmodelos.setForeignKeys(tabempmodelosArrayfk);
    FieldDef tabavisadoArrayf1[] = { tabavisado.aviejercicio,tabavisado.avinif };
    ForeignKey tabavisadoArrayfk[] = { 
      new ForeignKey(tabperfiltribut,tabavisadoArrayf1)      
      };
    tabavisado.setForeignKeys(tabavisadoArrayfk);
    }
  }
  
