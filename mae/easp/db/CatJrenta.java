// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20150318
// Hora:             10:08:37
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
public class CatJrenta extends Catalog
  {
  // Tablas
  public TabBds tabbds;
  public TabGycauto tabgycauto;
  public TabValoresaplic tabvaloresaplic;
  public TabBajadeclaran tabbajadeclaran;
  public TabVersionzips tabversionzips;
  public TabMenurenta tabmenurenta;
  public TabSeleccion tabseleccion;
  public TabCabecera tabcabecera;
  public TabEstadodeclaran tabestadodeclaran;
  public TabEquivtablas tabequivtablas;
  public TabConfigusuario tabconfigusuario;
  public TabQuefrase tabquefrase;
  public TabQuevariables tabquevariables;
  public TabQuetabla tabquetabla;
  public TabQuecolumn tabquecolumn;
  public TabDocumentos tabdocumentos;
  public TabDoccampos tabdoccampos;
  public TabDocdtabla tabdocdtabla;
  public TabDocfiltro tabdocfiltro;
  public TabDoclista tabdoclista;
  public TabDoctabla tabdoctabla;
  public TabCalautonomia tabcalautonomia;
  public TabCoeficactual tabcoeficactual;
  public TabDefvalmobil tabdefvalmobil;
  public TabEscalasbases tabescalasbases;
  public TabDefmodagr tabdefmodagr;
  public TabDefindiceagr tabdefindiceagr;
  public TabDomiextranjero tabdomiextranjero;
  public TabInmobcontrato tabinmobcontrato;
  public TabPrestvdahabit tabprestvdahabit;
  public TabHistoramortiz tabhistoramortiz;
  public TabPagosactivida tabpagosactivida;
  public TabDedinvdetalle tabdedinvdetalle;
  public TabDedgastosid tabdedgastosid;
  public TabDedgastosfp tabdedgastosfp;
  public TabDedplanpensione tabdedplanpensione;
  public TabRic tabric;
  public TabImpututes tabimpututes;
  public TabValadquiactual tabvaladquiactual;
  public TabCormonetvalcont tabcormonetvalcont;
  public TabCormonetcoefici tabcormonetcoefici;
  public TabCormonetdrenta tabcormonetdrenta;
  public TabDefdeducciones tabdefdeducciones;
  public TabHistdedvivienda tabhistdedvivienda;
  public TabDatosfiscales tabdatosfiscales;
  public TabAeatactividades tabaeatactividades;
  public TabAeatdeducciones tabaeatdeducciones;
  public TabAeatdomicilios tabaeatdomicilios;
  public TabAeatmobiliario tabaeatmobiliario;
  public TabAeatmiembros tabaeatmiembros;
  public TabDatadiconsumo tabdatadiconsumo;
  public TabOpciondeclaran tabopciondeclaran;
  public TabHistorgastos tabhistorgastos;
  public TabLiquidaapartl tabliquidaapartl;
  public TabCarteravalor tabcarteravalor;
  public TabLiquidaapartb2 tabliquidaapartb2;
  public TabParamlis tabparamlis;
  public TabPatrima1 tabpatrima1;
  public TabPatrima2 tabpatrima2;
  public TabPatrimb tabpatrimb;
  public TabPatrimc2 tabpatrimc2;
  public TabPatrimd tabpatrimd;
  public TabPatrimf tabpatrimf;
  public TabPatrimh tabpatrimh;
  public TabPatrimi tabpatrimi;
  public TabPatrimj tabpatrimj;
  public TabPatrimk tabpatrimk;
  public TabPatrimm tabpatrimm;
  public TabPatrimn tabpatrimn;
  public TabPatrimde tabpatrimde;
  public TabPatrime tabpatrime;
  public TabPatrimc1 tabpatrimc1;
  public TabConsumodes tabconsumodes;
  public TabLiquidaconsum2 tabliquidaconsum2;
  public TabLiquidaconsum tabliquidaconsum;
  public TabEscalascab tabescalascab;
  public TabAeattrabajo tabaeattrabajo;
  public TabAeatatribucion tabaeatatribucion;
  public TabCnvverifcal tabcnvverifcal;
  public TabLiquidamensaje tabliquidamensaje;
  public TabCnvtablas tabcnvtablas;
  public TabMuniactualiz tabmuniactualiz;
  public TabHistdedobramejo tabhistdedobramejo;
  public TabDeducpendiente tabdeducpendiente;
  public TabPatrimres tabpatrimres;
  public TabFormapago210 tabformapago210;
  public TabCarteravalor2 tabcarteravalor2;
  public TabObligreal tabobligreal;
  public TabConversion tabconversion;
  public TabLiquidaaparta2 tabliquidaaparta2;
  public TabMobiliario tabmobiliario;
  public TabFechasacceso tabfechasacceso;
  public TabLiquidaaparte1 tabliquidaaparte1;
  public TabLiquidaaparte2 tabliquidaaparte2;
  public TabLiquidaapartf2 tabliquidaapartf2;
  public TabDedemprendedor tabdedemprendedor;
  public TabAeatinmobiliar tabaeatinmobiliar;
  public TabFinalizacion tabfinalizacion;
  public TabEnlaexp tabenlaexp;
  public TabRdtoactividaed tabrdtoactividaed;
  public TabLiquidaanexoa2 tabliquidaanexoa2;
  public TabDedinversion tabdedinversion;
  public TabDedcreaempleo tabdedcreaempleo;
  public TabDedinvcanarias tabdedinvcanarias;
  public TabLiquidaanexoa3 tabliquidaanexoa3;
  public TabOtrdatospatrim tabotrdatospatrim;
  public TabLiquidaapartn tabliquidaapartn;
  public TabAccesodatos tabaccesodatos;
  public TabCompenpendiente tabcompenpendiente;
  public TabLiquidaapartk tabliquidaapartk;
  public TabCalculo tabcalculo;
  public TabMiembrosunidad tabmiembrosunidad;
  public TabLiquidaaparta tabliquidaaparta;
  public TabLiquidaanexoa1 tabliquidaanexoa1;
  public TabActividad tabactividad;
  public TabRdtoactividaeo tabrdtoactividaeo;
  public TabAeatganancias tabaeatganancias;
  public TabTrabajopersonal tabtrabajopersonal;
  public TabDeducciones tabdeducciones;
  public TabLiquidaapartc tabliquidaapartc;
  public TabCalculoautonom tabcalculoautonom;
  public TabDedinversion2 tabdedinversion2;
  public TabLiquidaanexoa2a tabliquidaanexoa2a;
  public TabDeclarante tabdeclarante;
  public TabDedcvf tabdedcvf;
  public TabDatosvivienda tabdatosvivienda;
  public TabParamdespacho tabparamdespacho;
  public TabInmobdetalle tabinmobdetalle;
  public TabIngresosagric tabingresosagric;
  public TabRdtoacteoagric tabrdtoacteoagric;
  public TabLiquidaanexob2 tabliquidaanexob2;
  public TabLiquidaanexob3 tabliquidaanexob3;
  public TabLiquidaanexob4 tabliquidaanexob4;
  public TabPerdgananmej tabperdgananmej;
  public TabPerdganpatrimon tabperdganpatrimon;
  public TabLiquidaanexob1 tabliquidaanexob1;
  public TabLiquidag5bgral tabliquidag5bgral;
  public TabLiquidag5bahor tabliquidag5bahor;
  public TabLiquidaapartg2 tabliquidaapartg2;
  public TabLiquidaapartb1 tabliquidaapartb1;
  public TabLiquidaaparti tabliquidaaparti;
  public TabInmobiliario tabinmobiliario;
  public TabLiquidaaparte3 tabliquidaaparte3;
  public TabImputatribucion tabimputatribucion;
  public TabLiquidaapartf1 tabliquidaapartf1;
  public TabLiquidares tabliquidares;
  public TabLiquidah tabliquidah;
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
    
  public class TabValoresaplic extends TableDef
    {
    // Campos
    public FieldDef vaejeraplic;
    public FieldDef vaapl;
    public FieldDef vacampo;
    public FieldDef vacodigo;
    public FieldDef vadesc;
    public FieldDef vaequivalencia;
    public TabValoresaplic(String name)
      {
      super(name);
      vaejeraplic = new FieldDef("vaejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      vaapl = new FieldDef("vaapl",FieldDef.CHAR,8,FieldDef.NOTNULL);
      vacampo = new FieldDef("vacampo",FieldDef.CHAR,30,FieldDef.NOTNULL);
      vacodigo = new FieldDef("vacodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      vadesc = new FieldDef("vadesc",FieldDef.CHAR,80);
      vaequivalencia = new FieldDef("vaequivalencia",FieldDef.INTEGER,0);
      FieldDef array[] = {
        vaejeraplic,
        vaapl,
        vacampo,
        vacodigo,
        vadesc,
        vaequivalencia        
        };
      setColumns(array);
      FieldDef arrayf[] = {vaejeraplic,vaapl,vacampo,vacodigo };
      setDescription("Valores aplicacion");
      setPrimaryKeys(arrayf);
      vaejeraplic.setDescription("Ejercicio fiscal aplicacion");
      vaapl.setDescription("Aplicación");
      vacampo.setDescription("Clave lista");
      vacodigo.setDescription("Codigo");
      vadesc.setDescription("Descripción");
      vaequivalencia.setDescription("Equivalente a otra tabla");
      }
    }
    
  public class TabBajadeclaran extends TableDef
    {
    // Campos
    public FieldDef bjsident;
    public FieldDef bjstabla;
    public FieldDef bjsejercicio;
    public FieldDef bjsdeclaran;
    public FieldDef bjsorden;
    public TabBajadeclaran(String name)
      {
      super(name);
      bjsident = new FieldDef("bjsident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bjstabla = new FieldDef("bjstabla",FieldDef.CHAR,15);
      bjsejercicio = new FieldDef("bjsejercicio",FieldDef.CHAR,15);
      bjsdeclaran = new FieldDef("bjsdeclaran",FieldDef.CHAR,15);
      bjsorden = new FieldDef("bjsorden",FieldDef.INTEGER,0);
      FieldDef array[] = {
        bjsident,
        bjstabla,
        bjsejercicio,
        bjsdeclaran,
        bjsorden        
        };
      setColumns(array);
      FieldDef arrayf[] = {bjsident };
      setDescription("Baja declarante");
      setPrimaryKeys(arrayf);
      bjsident.setAutoIncrementable(true);
      bjstabla.setDescription("tabla");
      bjsejercicio.setDescription("ejercicio");
      bjsdeclaran.setDescription("Declarante");
      bjsorden.setDescription("orden borrado");
      }
    }
    
  public class TabVersionzips extends TableDef
    {
    // Campos
    public FieldDef vrzejeraplic;
    public FieldDef vrzdirectorio;
    public FieldDef vrzversion;
    public TabVersionzips(String name)
      {
      super(name);
      vrzejeraplic = new FieldDef("vrzejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      vrzdirectorio = new FieldDef("vrzdirectorio",FieldDef.CHAR,8);
      vrzversion = new FieldDef("vrzversion",FieldDef.CHAR,5);
      FieldDef array[] = {
        vrzejeraplic,
        vrzdirectorio,
        vrzversion        
        };
      setColumns(array);
      FieldDef arrayf[] = {vrzejeraplic,vrzdirectorio };
      setPrimaryKeys(arrayf);
      vrzejeraplic.setDescription("Ejercicio aplicacion");
      vrzdirectorio.setDescription("Directorio antiguo");
      vrzversion.setDescription("Version zips");
      }
    }
    
  public class TabMenurenta extends TableDef
    {
    // Campos
    public FieldDef mdeident;
    public FieldDef mdeejeraplic;
    public FieldDef mdedescripcion;
    public FieldDef mdeparent;
    public FieldDef mdenumero;
    public FieldDef mdeprograma;
    public FieldDef mdecampo;
    public FieldDef mdeejeranter;
    public FieldDef mdeejersig;
    public TabMenurenta(String name)
      {
      super(name);
      mdeident = new FieldDef("mdeident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mdeejeraplic = new FieldDef("mdeejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mdedescripcion = new FieldDef("mdedescripcion",FieldDef.CHAR,100);
      mdeparent = new FieldDef("mdeparent",FieldDef.CHAR,10);
      mdenumero = new FieldDef("mdenumero",FieldDef.CHAR,1);
      mdeprograma = new FieldDef("mdeprograma",FieldDef.CHAR,15);
      mdecampo = new FieldDef("mdecampo",FieldDef.CHAR,15);
      mdeejeranter = new FieldDef("mdeejeranter",FieldDef.CHAR,1);
      mdeejersig = new FieldDef("mdeejersig",FieldDef.CHAR,1);
      FieldDef array[] = {
        mdeident,
        mdeejeraplic,
        mdedescripcion,
        mdeparent,
        mdenumero,
        mdeprograma,
        mdecampo,
        mdeejeranter,
        mdeejersig        
        };
      setColumns(array);
      FieldDef arrayf[] = {mdeident };
      setDescription("Opciones renta y patrimonio");
      setPrimaryKeys(arrayf);
      mdeident.setAutoIncrementable(true);
      mdeejeraplic.setDescription("Ejercicio fiscal aplicacion");
      mdedescripcion.setDescription("Descripción");
      mdeparent.setDescription("Código del padre");
      mdenumero.setDescription("Orden dentro de la jerarquia");
      mdeprograma.setDescription("Nombre del programa a ejecutar");
      mdecampo.setDescription("Nombre del campo");
      mdeejeranter.setDescription("Ejercicio anterior");
      mdeejersig.setDescription("Ejercicio siguiente");
      }
    }
    
  public class TabSeleccion extends TableDef
    {
    // Campos
    public FieldDef selcodigo;
    public FieldDef selusuario;
    public FieldDef selprograma;
    public FieldDef selempresa;
    public FieldDef selnombreempre;
    public FieldDef selmuf;
    public TabSeleccion(String name)
      {
      super(name);
      selcodigo = new FieldDef("selcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      selusuario = new FieldDef("selusuario",FieldDef.CHAR,25);
      selprograma = new FieldDef("selprograma",FieldDef.CHAR,15);
      selempresa = new FieldDef("selempresa",FieldDef.CHAR,12);
      selnombreempre = new FieldDef("selnombreempre",FieldDef.CHAR,70);
      selmuf = new FieldDef("selmuf",FieldDef.CHAR,10);
      FieldDef array[] = {
        selcodigo,
        selusuario,
        selprograma,
        selempresa,
        selnombreempre,
        selmuf        
        };
      setColumns(array);
      FieldDef arrayf[] = {selcodigo };
      setDescription("Seleccion empresas");
      setPrimaryKeys(arrayf);
      selcodigo.setAutoIncrementable(true);
      selusuario.setDescription("Usuario");
      selprograma.setDescription("Programa");
      selempresa.setDescription("Declarante");
      selnombreempre.setDescription("Nombre declarante");
      selmuf.setDescription("MUF");
      }
    }
    
  public class TabCabecera extends TableDef
    {
    // Campos
    public FieldDef cabdominio;
    public FieldDef cabusuario;
    public FieldDef cabempresa;
    public FieldDef cabejercicio;
    public TabCabecera(String name)
      {
      super(name);
      cabdominio = new FieldDef("cabdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cabusuario = new FieldDef("cabusuario",FieldDef.CHAR,20,FieldDef.NOTNULL);
      cabempresa = new FieldDef("cabempresa",FieldDef.CHAR,12);
      cabejercicio = new FieldDef("cabejercicio",FieldDef.INTEGER,0);
      FieldDef array[] = {
        cabdominio,
        cabusuario,
        cabempresa,
        cabejercicio        
        };
      setColumns(array);
      FieldDef arrayf[] = {cabdominio,cabusuario };
      setDescription("Datos último declarante y ejercicio seleccionado");
      setPrimaryKeys(arrayf);
      cabdominio.setDescription("Dominio");
      cabusuario.setDescription("Usuario");
      cabempresa.setDescription("Código declarante");
      cabejercicio.setDescription("Ejercicio");
      }
    }
    
  public class TabEstadodeclaran extends TableDef
    {
    // Campos
    public FieldDef esoiden;
    public FieldDef esoproceso;
    public FieldDef esodeclaran;
    public FieldDef esouser;
    public FieldDef esofecha;
    public FieldDef esoarchivo;
    public TabEstadodeclaran(String name)
      {
      super(name);
      esoiden = new FieldDef("esoiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      esoproceso = new FieldDef("esoproceso",FieldDef.CHAR,1,FieldDef.NOTNULL);
      esodeclaran = new FieldDef("esodeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      esouser = new FieldDef("esouser",FieldDef.CHAR,25);
      esofecha = new FieldDef("esofecha",FieldDef.DATE);
      esoarchivo = new FieldDef("esoarchivo",FieldDef.CHAR,40);
      FieldDef array[] = {
        esoiden,
        esoproceso,
        esodeclaran,
        esouser,
        esofecha,
        esoarchivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {esoiden };
      setDescription("Estado de los declarantes");
      setPrimaryKeys(arrayf);
      esoiden.setAutoIncrementable(true);
      esoproceso.setDescription("Tipo de proceso");
      esodeclaran.setDescription("Declaran");
      esouser.setDescription("Usuario asignado al declarante");
      esofecha.setDescription("Fecha proceso");
      esoarchivo.setDescription("Nombre archivo fisico");
      }
    }
    
  public class TabEquivtablas extends TableDef
    {
    // Campos
    public FieldDef eqtident;
    public FieldDef eqtejeraplic;
    public FieldDef eqttabla_jrenta;
    public FieldDef eqtcampo_jrenta;
    public FieldDef eqtarchivo_ig;
    public FieldDef eqtarchivo_igfi;
    public FieldDef eqtporejercicio;
    public FieldDef eqtcampo_ig;
    public FieldDef eqttipocampo;
    public FieldDef eqtlongitudcamp;
    public FieldDef eqtpkdeclaran;
    public FieldDef eqtpkejercicio;
    public FieldDef eqtigdeclaran;
    public FieldDef eqtigespecial;
    public FieldDef eqtrelacionid;
    public TabEquivtablas(String name)
      {
      super(name);
      eqtident = new FieldDef("eqtident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      eqtejeraplic = new FieldDef("eqtejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      eqttabla_jrenta = new FieldDef("eqttabla_jrenta",FieldDef.CHAR,30);
      eqtcampo_jrenta = new FieldDef("eqtcampo_jrenta",FieldDef.CHAR,30);
      eqtarchivo_ig = new FieldDef("eqtarchivo_ig",FieldDef.CHAR,15);
      eqtarchivo_igfi = new FieldDef("eqtarchivo_igfi",FieldDef.CHAR,15);
      eqtporejercicio = new FieldDef("eqtporejercicio",FieldDef.CHAR,1);
      eqtcampo_ig = new FieldDef("eqtcampo_ig",FieldDef.CHAR,30);
      eqttipocampo = new FieldDef("eqttipocampo",FieldDef.CHAR,1);
      eqtlongitudcamp = new FieldDef("eqtlongitudcamp",FieldDef.INTEGER,0);
      eqtpkdeclaran = new FieldDef("eqtpkdeclaran",FieldDef.CHAR,1);
      eqtpkejercicio = new FieldDef("eqtpkejercicio",FieldDef.CHAR,1);
      eqtigdeclaran = new FieldDef("eqtigdeclaran",FieldDef.CHAR,1);
      eqtigespecial = new FieldDef("eqtigespecial",FieldDef.CHAR,1);
      eqtrelacionid = new FieldDef("eqtrelacionid",FieldDef.CHAR,1);
      FieldDef array[] = {
        eqtident,
        eqtejeraplic,
        eqttabla_jrenta,
        eqtcampo_jrenta,
        eqtarchivo_ig,
        eqtarchivo_igfi,
        eqtporejercicio,
        eqtcampo_ig,
        eqttipocampo,
        eqtlongitudcamp,
        eqtpkdeclaran,
        eqtpkejercicio,
        eqtigdeclaran,
        eqtigespecial,
        eqtrelacionid        
        };
      setColumns(array);
      FieldDef arrayf[] = {eqtident };
      setPrimaryKeys(arrayf);
      eqtident.setAutoIncrementable(true);
      eqtejeraplic.setDescription("Ejercicio fiscal aplicacion");
      eqttabla_jrenta.setDescription("Tabla en el access");
      eqtcampo_jrenta.setDescription("Campo en la tabla access");
      eqtarchivo_ig.setDescription("Archivo IG");
      eqtarchivo_igfi.setDescription("Archivo IG fisico");
      eqtporejercicio.setDescription("Archivo fisico contiene ejercicio");
      eqtcampo_ig.setDescription("Campo IG");
      eqttipocampo.setDescription("Tipo de campo");
      eqtlongitudcamp.setDescription("Longitud del campo");
      eqtpkdeclaran.setDescription("Campo declaran jiss");
      eqtpkejercicio.setDescription("Campo ejercicio jiss");
      eqtigdeclaran.setDescription("Campo declaran IG");
      eqtigespecial.setDescription("Campo Especial (Constante, funcion) IG");
      eqtrelacionid.setDescription("Campo relacion");
      }
    }
    
  public class TabConfigusuario extends TableDef
    {
    // Campos
    public FieldDef cucodigo;
    public FieldDef cunombrepc;
    public FieldDef cupantalla;
    public FieldDef cuusergelix;
    public FieldDef cugrupogelix;
    public FieldDef cuurlgeyce;
    public FieldDef cudirdatos;
    public TabConfigusuario(String name)
      {
      super(name);
      cucodigo = new FieldDef("cucodigo",FieldDef.CHAR,25,FieldDef.NOTNULL);
      cunombrepc = new FieldDef("cunombrepc",FieldDef.CHAR,25,FieldDef.NOTNULL);
      cupantalla = new FieldDef("cupantalla",FieldDef.INTEGER,0);
      cuusergelix = new FieldDef("cuusergelix",FieldDef.CHAR,10);
      cugrupogelix = new FieldDef("cugrupogelix",FieldDef.CHAR,5);
      cuurlgeyce = new FieldDef("cuurlgeyce",FieldDef.CHAR,30);
      cudirdatos = new FieldDef("cudirdatos",FieldDef.CHAR,8);
      FieldDef array[] = {
        cucodigo,
        cunombrepc,
        cupantalla,
        cuusergelix,
        cugrupogelix,
        cuurlgeyce,
        cudirdatos        
        };
      setColumns(array);
      FieldDef arrayf[] = {cucodigo,cunombrepc };
      setDescription("Configuracion aplicacion antigua");
      setPrimaryKeys(arrayf);
      cucodigo.setDescription("Usuario nueva aplicacion");
      cunombrepc.setDescription("Nombre del ordenador");
      cupantalla.setDescription("Número de pantalla aplicacion antigua");
      cuusergelix.setDescription("Nombre usuario aplicacion antigua");
      cugrupogelix.setDescription("Grupo aplicacion antigua");
      cuurlgeyce.setDescription("Ubicación Carpeta geyce");
      cudirdatos.setDescription("Directorio datos");
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
    public FieldDef qefplantilla;
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
      qefplantilla = new FieldDef("qefplantilla",FieldDef.CHAR,15);
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
        qefcount,
        qefplantilla        
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
    
  public class TabDocumentos extends TableDef
    {
    // Campos
    public FieldDef docaplic;
    public FieldDef docref;
    public FieldDef doctipo;
    public FieldDef docsubtipo;
    public FieldDef docnom_doc;
    public FieldDef docdescripcion;
    public FieldDef docgrupo;
    public FieldDef docusuario;
    public FieldDef docfecha;
    public FieldDef docaccion;
    public FieldDef docnro_inform;
    public TabDocumentos(String name)
      {
      super(name);
      docaplic = new FieldDef("docaplic",FieldDef.CHAR,8);
      docref = new FieldDef("docref",FieldDef.CHAR,8);
      doctipo = new FieldDef("doctipo",FieldDef.CHAR,1);
      docsubtipo = new FieldDef("docsubtipo",FieldDef.CHAR,1);
      docnom_doc = new FieldDef("docnom_doc",FieldDef.CHAR,8);
      docdescripcion = new FieldDef("docdescripcion",FieldDef.CHAR,80);
      docgrupo = new FieldDef("docgrupo",FieldDef.CHAR,15);
      docusuario = new FieldDef("docusuario",FieldDef.CHAR,25);
      docfecha = new FieldDef("docfecha",FieldDef.DATE);
      docaccion = new FieldDef("docaccion",FieldDef.CHAR,200);
      docnro_inform = new FieldDef("docnro_inform",FieldDef.INTEGER,0);
      FieldDef array[] = {
        docaplic,
        docref,
        doctipo,
        docsubtipo,
        docnom_doc,
        docdescripcion,
        docgrupo,
        docusuario,
        docfecha,
        docaccion,
        docnro_inform        
        };
      setColumns(array);
      FieldDef arrayf[] = {docaplic,docref,doctipo,docsubtipo,docnom_doc };
      setDescription("Relacion documentos word");
      setPrimaryKeys(arrayf);
      docaplic.setDescription("Aplicacion");
      docref.setDescription("Referencia");
      doctipo.setDescription("Tipo de documento");
      docsubtipo.setDescription("Subtipo al que pertenece");
      docnom_doc.setDescription("Nombre del documento");
      docdescripcion.setDescription("Descripcion del documento");
      docgrupo.setDescription("Grupo");
      docusuario.setDescription("Usuario");
      docfecha.setDescription("Fecha");
      docaccion.setDescription("Accion S4N");
      docnro_inform.setDescription("Numero informe");
      }
    }
    
  public class TabDoccampos extends TableDef
    {
    // Campos
    public FieldDef dcaref;
    public FieldDef dcanom_doc;
    public FieldDef dcanom_fitxer;
    public FieldDef dcanom_camp;
    public FieldDef dcanro_camp;
    public FieldDef dcaejercicio;
    public FieldDef dcamascfecha;
    public TabDoccampos(String name)
      {
      super(name);
      dcaref = new FieldDef("dcaref",FieldDef.CHAR,8);
      dcanom_doc = new FieldDef("dcanom_doc",FieldDef.CHAR,8);
      dcanom_fitxer = new FieldDef("dcanom_fitxer",FieldDef.CHAR,15);
      dcanom_camp = new FieldDef("dcanom_camp",FieldDef.CHAR,15);
      dcanro_camp = new FieldDef("dcanro_camp",FieldDef.INTEGER,0);
      dcaejercicio = new FieldDef("dcaejercicio",FieldDef.CHAR,10);
      dcamascfecha = new FieldDef("dcamascfecha",FieldDef.INTEGER,0);
      FieldDef array[] = {
        dcaref,
        dcanom_doc,
        dcanom_fitxer,
        dcanom_camp,
        dcanro_camp,
        dcaejercicio,
        dcamascfecha        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcaref,dcanom_doc,dcanom_fitxer,dcanom_camp,dcanro_camp,dcaejercicio };
      setDescription("Relacion campos para cada documento word");
      setPrimaryKeys(arrayf);
      dcaref.setDescription("REFERENCIA");
      dcanom_doc.setDescription("NOMBRE DEL DOCUMENTO");
      dcanom_fitxer.setDescription("NOMBRE FICHERO");
      dcanom_camp.setDescription("NOMBRE CAMPO");
      dcanro_camp.setDescription("Numero del campo");
      dcaejercicio.setDescription("EJERCICIO");
      dcamascfecha.setDescription("Mascara de la fecha");
      }
    }
    
  public class TabDocdtabla extends TableDef
    {
    // Campos
    public FieldDef dcdref;
    public FieldDef dcdnom_doc;
    public FieldDef dcdnom_tabla;
    public FieldDef dcdtitulo_tabla;
    public FieldDef dcdorientacion;
    public FieldDef dcdnombre_archi;
    public FieldDef dcdejercicio;
    public TabDocdtabla(String name)
      {
      super(name);
      dcdref = new FieldDef("dcdref",FieldDef.CHAR,8);
      dcdnom_doc = new FieldDef("dcdnom_doc",FieldDef.CHAR,8);
      dcdnom_tabla = new FieldDef("dcdnom_tabla",FieldDef.CHAR,15);
      dcdtitulo_tabla = new FieldDef("dcdtitulo_tabla",FieldDef.CHAR,50);
      dcdorientacion = new FieldDef("dcdorientacion",FieldDef.CHAR,1);
      dcdnombre_archi = new FieldDef("dcdnombre_archi",FieldDef.CHAR,15);
      dcdejercicio = new FieldDef("dcdejercicio",FieldDef.CHAR,10);
      FieldDef array[] = {
        dcdref,
        dcdnom_doc,
        dcdnom_tabla,
        dcdtitulo_tabla,
        dcdorientacion,
        dcdnombre_archi,
        dcdejercicio        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcdref,dcdnom_doc,dcdnom_tabla };
      setDescription("Seleccion cabecera tabla para cada documento word");
      setPrimaryKeys(arrayf);
      dcdref.setDescription("REFERENCIA");
      dcdnom_doc.setDescription("NOMBRE DEL DOCUMENTO");
      dcdnom_tabla.setDescription("NOMBRE DE LA TABLA");
      dcdtitulo_tabla.setDescription("Titulo de la tabla");
      dcdorientacion.setDescription("Vertical o horizontal");
      dcdnombre_archi.setDescription("Nombre de archivo");
      dcdejercicio.setDescription("Ejercicio");
      }
    }
    
  public class TabDocfiltro extends TableDef
    {
    // Campos
    public FieldDef dcfident;
    public FieldDef dcfref;
    public FieldDef dcfnom_doc;
    public FieldDef dcfnom_tabla;
    public FieldDef dcfnom_camp;
    public FieldDef dcfcomparador;
    public FieldDef dcfvalor;
    public FieldDef dcfconcatenacio;
    public FieldDef dcfnro_camp;
    public TabDocfiltro(String name)
      {
      super(name);
      dcfident = new FieldDef("dcfident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcfref = new FieldDef("dcfref",FieldDef.CHAR,8);
      dcfnom_doc = new FieldDef("dcfnom_doc",FieldDef.CHAR,8);
      dcfnom_tabla = new FieldDef("dcfnom_tabla",FieldDef.CHAR,15);
      dcfnom_camp = new FieldDef("dcfnom_camp",FieldDef.CHAR,15);
      dcfcomparador = new FieldDef("dcfcomparador",FieldDef.CHAR,2);
      dcfvalor = new FieldDef("dcfvalor",FieldDef.CHAR,30);
      dcfconcatenacio = new FieldDef("dcfconcatenacio",FieldDef.CHAR,2);
      dcfnro_camp = new FieldDef("dcfnro_camp",FieldDef.INTEGER,0);
      FieldDef array[] = {
        dcfident,
        dcfref,
        dcfnom_doc,
        dcfnom_tabla,
        dcfnom_camp,
        dcfcomparador,
        dcfvalor,
        dcfconcatenacio,
        dcfnro_camp        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcfident };
      setDescription("Condiciones para tabla para cada documento word");
      setPrimaryKeys(arrayf);
      dcfident.setAutoIncrementable(true);
      dcfref.setDescription("REFERENCIA");
      dcfnom_doc.setDescription("NOMBRE DEL DOCUME");
      dcfnom_tabla.setDescription("NOMBRE DE LA TABL");
      dcfnom_camp.setDescription("Nombre de campo");
      dcfcomparador.setDescription("Comparador");
      dcfvalor.setDescription("Valor");
      dcfconcatenacio.setDescription("Concatenacion");
      dcfnro_camp.setDescription("Nro. de campo");
      }
    }
    
  public class TabDoclista extends TableDef
    {
    // Campos
    public FieldDef dclref;
    public FieldDef dclnom_doc;
    public FieldDef dclnum_list;
    public FieldDef dclnom_list;
    public TabDoclista(String name)
      {
      super(name);
      dclref = new FieldDef("dclref",FieldDef.CHAR,8);
      dclnom_doc = new FieldDef("dclnom_doc",FieldDef.CHAR,8);
      dclnum_list = new FieldDef("dclnum_list",FieldDef.INTEGER,0);
      dclnom_list = new FieldDef("dclnom_list",FieldDef.CHAR,8);
      FieldDef array[] = {
        dclref,
        dclnom_doc,
        dclnum_list,
        dclnom_list        
        };
      setColumns(array);
      FieldDef arrayf[] = {dclref,dclnom_doc,dclnum_list };
      setDescription("Relacion informes a concatenar para cada documento word");
      setPrimaryKeys(arrayf);
      dclref.setDescription("REFERENCIA");
      dclnom_doc.setDescription("NOMBRE DOCUMENTO");
      dclnum_list.setDescription("NUMERO LISTA DOCUMENTOS");
      dclnom_list.setDescription("Nombre lista documentos");
      }
    }
    
  public class TabDoctabla extends TableDef
    {
    // Campos
    public FieldDef dctref;
    public FieldDef dctnom_doc;
    public FieldDef dctnom_tabla;
    public FieldDef dctnro_columna;
    public FieldDef dctnom_camp;
    public FieldDef dcttitulo_campo;
    public FieldDef dctnro_camp;
    public FieldDef dcttipo;
    public FieldDef dctliteral;
    public TabDoctabla(String name)
      {
      super(name);
      dctref = new FieldDef("dctref",FieldDef.CHAR,8);
      dctnom_doc = new FieldDef("dctnom_doc",FieldDef.CHAR,8);
      dctnom_tabla = new FieldDef("dctnom_tabla",FieldDef.CHAR,15);
      dctnro_columna = new FieldDef("dctnro_columna",FieldDef.INTEGER,0);
      dctnom_camp = new FieldDef("dctnom_camp",FieldDef.CHAR,15);
      dcttitulo_campo = new FieldDef("dcttitulo_campo",FieldDef.CHAR,30);
      dctnro_camp = new FieldDef("dctnro_camp",FieldDef.INTEGER,0);
      dcttipo = new FieldDef("dcttipo",FieldDef.CHAR,1);
      dctliteral = new FieldDef("dctliteral",FieldDef.CHAR,100);
      FieldDef array[] = {
        dctref,
        dctnom_doc,
        dctnom_tabla,
        dctnro_columna,
        dctnom_camp,
        dcttitulo_campo,
        dctnro_camp,
        dcttipo,
        dctliteral        
        };
      setColumns(array);
      FieldDef arrayf[] = {dctref,dctnom_doc,dctnom_tabla,dctnro_columna };
      setDescription("Relacion tablas para cada documento word");
      setPrimaryKeys(arrayf);
      dctref.setDescription("REFERENCIA");
      dctnom_doc.setDescription("NOMBRE DEL DOCUMENTO");
      dctnom_tabla.setDescription("NOMBRE DE LA TABLA");
      dctnro_columna.setDescription("NUMERO DE COLUMNA");
      dctnom_camp.setDescription("Nombre de campo");
      dcttitulo_campo.setDescription("Titulo etiqueta");
      dctnro_camp.setDescription("Nro.camp");
      dcttipo.setDescription("Tipo campo: [L]iteral, [C]ampo");
      dctliteral.setDescription("Descripcion literal");
      }
    }
    
  public class TabCalautonomia extends TableDef
    {
    // Campos
    public FieldDef caaejeraplic;
    public FieldDef caaautonomia;
    public FieldDef caalinea;
    public FieldDef caadescripcion;
    public FieldDef caaimporte;
    public FieldDef caaporcentaje;
    public TabCalautonomia(String name)
      {
      super(name);
      caaejeraplic = new FieldDef("caaejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      caaautonomia = new FieldDef("caaautonomia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      caalinea = new FieldDef("caalinea",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      caadescripcion = new FieldDef("caadescripcion",FieldDef.CHAR,70);
      caaimporte = new FieldDef("caaimporte",FieldDef.FLOAT,6,0);
      caaporcentaje = new FieldDef("caaporcentaje",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        caaejeraplic,
        caaautonomia,
        caalinea,
        caadescripcion,
        caaimporte,
        caaporcentaje        
        };
      setColumns(array);
      FieldDef arrayf[] = {caaejeraplic,caaautonomia,caalinea };
      setDescription("Parametros calculo deducciones autonomicas");
      setPrimaryKeys(arrayf);
      caaejeraplic.setDescription("Ejercicio fiscal aplicacion");
      caaautonomia.setDescription("Autonomia");
      caalinea.setDescription("NRO.LINEA");
      caadescripcion.setDescription("Descripcion");
      caaimporte.setDescription("Importe");
      caaporcentaje.setDescription("Porcentaje");
      }
    }
    
  public class TabCoeficactual extends TableDef
    {
    // Campos
    public FieldDef coaejerfiscal;
    public FieldDef coaejercicio;
    public FieldDef coacoeficiente;
    public TabCoeficactual(String name)
      {
      super(name);
      coaejerfiscal = new FieldDef("coaejerfiscal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      coaejercicio = new FieldDef("coaejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      coacoeficiente = new FieldDef("coacoeficiente",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        coaejerfiscal,
        coaejercicio,
        coacoeficiente        
        };
      setColumns(array);
      FieldDef arrayf[] = {coaejerfiscal,coaejercicio };
      setDescription("Coeficientes actualizacion");
      setPrimaryKeys(arrayf);
      coaejerfiscal.setDescription("Ejercicio fiscal");
      coaejercicio.setDescription("Ejercicio");
      coacoeficiente.setDescription("Coeficiente actualizacion");
      }
    }
    
  public class TabDefvalmobil extends TableDef
    {
    // Campos
    public FieldDef dfmejerfiscal;
    public FieldDef dfmcodigo;
    public FieldDef dfmdescripcion;
    public FieldDef dfmpatrimonio;
    public FieldDef dfmrenta;
    public FieldDef dfmconsumo;
    public FieldDef dfmpor_integrac;
    public FieldDef dfmpor_deducci;
    public FieldDef dfmderecreduc;
    public FieldDef dfmtieneretenc;
    public FieldDef dfmpor_retenc;
    public FieldDef dfmtipo_base;
    public FieldDef dfmexen_divid;
    public TabDefvalmobil(String name)
      {
      super(name);
      dfmejerfiscal = new FieldDef("dfmejerfiscal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dfmcodigo = new FieldDef("dfmcodigo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      dfmdescripcion = new FieldDef("dfmdescripcion",FieldDef.CHAR,50);
      dfmpatrimonio = new FieldDef("dfmpatrimonio",FieldDef.CHAR,2);
      dfmrenta = new FieldDef("dfmrenta",FieldDef.INTEGER,0);
      dfmconsumo = new FieldDef("dfmconsumo",FieldDef.INTEGER,0);
      dfmpor_integrac = new FieldDef("dfmpor_integrac",FieldDef.FLOAT,6,0);
      dfmpor_deducci = new FieldDef("dfmpor_deducci",FieldDef.FLOAT,6,0);
      dfmderecreduc = new FieldDef("dfmderecreduc",FieldDef.CHAR,1);
      dfmtieneretenc = new FieldDef("dfmtieneretenc",FieldDef.CHAR,1);
      dfmpor_retenc = new FieldDef("dfmpor_retenc",FieldDef.FLOAT,6,0);
      dfmtipo_base = new FieldDef("dfmtipo_base",FieldDef.CHAR,1);
      dfmexen_divid = new FieldDef("dfmexen_divid",FieldDef.CHAR,1);
      FieldDef array[] = {
        dfmejerfiscal,
        dfmcodigo,
        dfmdescripcion,
        dfmpatrimonio,
        dfmrenta,
        dfmconsumo,
        dfmpor_integrac,
        dfmpor_deducci,
        dfmderecreduc,
        dfmtieneretenc,
        dfmpor_retenc,
        dfmtipo_base,
        dfmexen_divid        
        };
      setColumns(array);
      FieldDef arrayf[] = {dfmejerfiscal,dfmcodigo };
      setDescription("Definicion valores mobiliarios");
      setPrimaryKeys(arrayf);
      dfmejerfiscal.setDescription("Ejercicio fiscal");
      dfmcodigo.setDescription("Codigo valor mobiliario");
      dfmdescripcion.setDescription("Descripcion");
      dfmpatrimonio.setDescription("Apartado Patrimonio");
      dfmrenta.setDescription("Linea Rendimiento declaracion renta");
      dfmconsumo.setDescription("Linea Variac. Patrimoniales para consumo");
      dfmpor_integrac.setDescription("% Integracion");
      dfmpor_deducci.setDescription("% Deduccion");
      dfmderecreduc.setDescription("Tiene derecho a reduccion");
      dfmtieneretenc.setDescription("Tiene Retencion");
      dfmpor_retenc.setDescription("% Retencion");
      dfmtipo_base.setDescription("Base de integracion");
      dfmexen_divid.setDescription("Exencion dividendos");
      }
    }
    
  public class TabEscalasbases extends TableDef
    {
    // Campos
    public FieldDef esbejerfiscal;
    public FieldDef esbtipo;
    public FieldDef esbautonomia;
    public FieldDef esbnumerobase;
    public FieldDef esbhastabase;
    public FieldDef esbcuota;
    public FieldDef esbtipoaplic;
    public TabEscalasbases(String name)
      {
      super(name);
      esbejerfiscal = new FieldDef("esbejerfiscal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      esbtipo = new FieldDef("esbtipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      esbautonomia = new FieldDef("esbautonomia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      esbnumerobase = new FieldDef("esbnumerobase",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      esbhastabase = new FieldDef("esbhastabase",FieldDef.FLOAT,6,0);
      esbcuota = new FieldDef("esbcuota",FieldDef.FLOAT,6,0);
      esbtipoaplic = new FieldDef("esbtipoaplic",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        esbejerfiscal,
        esbtipo,
        esbautonomia,
        esbnumerobase,
        esbhastabase,
        esbcuota,
        esbtipoaplic        
        };
      setColumns(array);
      FieldDef arrayf[] = {esbejerfiscal,esbtipo,esbautonomia,esbnumerobase };
      setDescription("Detalle escalas de renta y patrimonio");
      setPrimaryKeys(arrayf);
      esbejerfiscal.setDescription("Ejercicio fiscal");
      esbtipo.setDescription("[R]enta o [P]atrimonio");
      esbautonomia.setDescription("Autonomia");
      esbnumerobase.setDescription("Numero de base");
      esbhastabase.setDescription("Hasta Base Imponible");
      esbcuota.setDescription("Cuota Integra");
      esbtipoaplic.setDescription("Tipo Aplicable");
      }
    }
    
  public class TabDefmodagr extends TableDef
    {
    // Campos
    public FieldDef dmaejerfiscal;
    public FieldDef dmacodigo;
    public FieldDef dmadescripcion;
    public FieldDef dmalineaimpres;
    public TabDefmodagr(String name)
      {
      super(name);
      dmaejerfiscal = new FieldDef("dmaejerfiscal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dmacodigo = new FieldDef("dmacodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dmadescripcion = new FieldDef("dmadescripcion",FieldDef.CHAR,2000);
      dmalineaimpres = new FieldDef("dmalineaimpres",FieldDef.INTEGER,0);
      FieldDef array[] = {
        dmaejerfiscal,
        dmacodigo,
        dmadescripcion,
        dmalineaimpres        
        };
      setColumns(array);
      FieldDef arrayf[] = {dmaejerfiscal,dmacodigo };
      setDescription("Definicion modulos agricolas");
      setPrimaryKeys(arrayf);
      dmaejerfiscal.setDescription("Ejercicio fiscal");
      dmacodigo.setDescription("Codigo producto");
      dmadescripcion.setDescription("Descripcion");
      dmalineaimpres.setDescription("Linea impresion declaracion renta");
      }
    }
    
  public class TabDefindiceagr extends TableDef
    {
    // Campos
    public FieldDef diaejerfiscal;
    public FieldDef diacodigo;
    public FieldDef diacodigoindice;
    public FieldDef diaindice;
    public FieldDef diadescripcion;
    public TabDefindiceagr(String name)
      {
      super(name);
      diaejerfiscal = new FieldDef("diaejerfiscal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      diacodigo = new FieldDef("diacodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      diacodigoindice = new FieldDef("diacodigoindice",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      diaindice = new FieldDef("diaindice",FieldDef.FLOAT,6,0);
      diadescripcion = new FieldDef("diadescripcion",FieldDef.CHAR,80);
      FieldDef array[] = {
        diaejerfiscal,
        diacodigo,
        diacodigoindice,
        diaindice,
        diadescripcion        
        };
      setColumns(array);
      FieldDef arrayf[] = {diaejerfiscal,diacodigo,diacodigoindice };
      setDescription("Definicion indices modulos agricolas");
      setPrimaryKeys(arrayf);
      diaejerfiscal.setDescription("Ejercicio fiscal");
      diacodigo.setDescription("Codigo producto");
      diacodigoindice.setDescription("Codigo indice");
      diaindice.setDescription("Indice");
      diadescripcion.setDescription("Descripcion");
      }
    }
    
  public class TabDomiextranjero extends TableDef
    {
    // Campos
    public FieldDef dexejeraplic;
    public FieldDef dexdeclaran;
    public FieldDef dexmuf;
    public FieldDef dexdomi1;
    public FieldDef dexdomi2;
    public FieldDef dexpoblacion;
    public FieldDef dexmail;
    public FieldDef dexcpostal;
    public FieldDef dexprovinc;
    public FieldDef dexcodpais;
    public FieldDef dextelefono;
    public FieldDef dexmovil;
    public FieldDef dexfax;
    public TabDomiextranjero(String name)
      {
      super(name);
      dexejeraplic = new FieldDef("dexejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dexdeclaran = new FieldDef("dexdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dexmuf = new FieldDef("dexmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      dexdomi1 = new FieldDef("dexdomi1",FieldDef.CHAR,50);
      dexdomi2 = new FieldDef("dexdomi2",FieldDef.CHAR,50);
      dexpoblacion = new FieldDef("dexpoblacion",FieldDef.CHAR,30);
      dexmail = new FieldDef("dexmail",FieldDef.CHAR,100);
      dexcpostal = new FieldDef("dexcpostal",FieldDef.CHAR,10);
      dexprovinc = new FieldDef("dexprovinc",FieldDef.CHAR,30);
      dexcodpais = new FieldDef("dexcodpais",FieldDef.CHAR,2);
      dextelefono = new FieldDef("dextelefono",FieldDef.CHAR,15);
      dexmovil = new FieldDef("dexmovil",FieldDef.CHAR,15);
      dexfax = new FieldDef("dexfax",FieldDef.CHAR,15);
      FieldDef array[] = {
        dexejeraplic,
        dexdeclaran,
        dexmuf,
        dexdomi1,
        dexdomi2,
        dexpoblacion,
        dexmail,
        dexcpostal,
        dexprovinc,
        dexcodpais,
        dextelefono,
        dexmovil,
        dexfax        
        };
      setColumns(array);
      FieldDef arrayf[] = {dexejeraplic,dexdeclaran,dexmuf };
      setDescription("Domicilio en extranjero");
      setPrimaryKeys(arrayf);
      dexejeraplic.setDescription("Ejercicio aplicacion");
      dexdeclaran.setDescription("CODIGO DE DECLARANTE");
      dexmuf.setDescription("[D]eclarante, [C]onyuge");
      dexdomi1.setDescription("Domicilio 1");
      dexdomi2.setDescription("Domicilio 2");
      dexpoblacion.setDescription("Poblacion");
      dexmail.setDescription("Mail");
      dexcpostal.setDescription("Codigo postal");
      dexprovinc.setDescription("Provincia o Estado");
      dexcodpais.setDescription("Codigo pais");
      dextelefono.setDescription("Telefono fijo");
      dexmovil.setDescription("Movil");
      dexfax.setDescription("Fax");
      }
    }
    
  public class TabInmobcontrato extends TableDef
    {
    // Campos
    public FieldDef incejeraplic;
    public FieldDef incdeclaran;
    public FieldDef incidentinmob;
    public FieldDef incnumcontrato;
    public FieldDef incnroarrendat;
    public FieldDef incdiasarrenda;
    public FieldDef incarren1cumple;
    public FieldDef incarren1dias;
    public FieldDef incarren1dia50;
    public FieldDef incarren2cumple;
    public FieldDef incarren2dias;
    public FieldDef incarren2dia50;
    public FieldDef incarren3cumple;
    public FieldDef incarren3dias;
    public FieldDef incarren3dia50;
    public FieldDef incarren4cumple;
    public FieldDef incarren4dias;
    public FieldDef incarren4dia50;
    public FieldDef incarren5cumple;
    public FieldDef incarren5dias;
    public FieldDef incarren5dia50;
    public TabInmobcontrato(String name)
      {
      super(name);
      incejeraplic = new FieldDef("incejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      incdeclaran = new FieldDef("incdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      incidentinmob = new FieldDef("incidentinmob",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      incnumcontrato = new FieldDef("incnumcontrato",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      incnroarrendat = new FieldDef("incnroarrendat",FieldDef.INTEGER,0);
      incdiasarrenda = new FieldDef("incdiasarrenda",FieldDef.INTEGER,0);
      incarren1cumple = new FieldDef("incarren1cumple",FieldDef.CHAR,1);
      incarren1dias = new FieldDef("incarren1dias",FieldDef.INTEGER,0);
      incarren1dia50 = new FieldDef("incarren1dia50",FieldDef.INTEGER,0);
      incarren2cumple = new FieldDef("incarren2cumple",FieldDef.CHAR,1);
      incarren2dias = new FieldDef("incarren2dias",FieldDef.INTEGER,0);
      incarren2dia50 = new FieldDef("incarren2dia50",FieldDef.INTEGER,0);
      incarren3cumple = new FieldDef("incarren3cumple",FieldDef.CHAR,1);
      incarren3dias = new FieldDef("incarren3dias",FieldDef.INTEGER,0);
      incarren3dia50 = new FieldDef("incarren3dia50",FieldDef.INTEGER,0);
      incarren4cumple = new FieldDef("incarren4cumple",FieldDef.CHAR,1);
      incarren4dias = new FieldDef("incarren4dias",FieldDef.INTEGER,0);
      incarren4dia50 = new FieldDef("incarren4dia50",FieldDef.INTEGER,0);
      incarren5cumple = new FieldDef("incarren5cumple",FieldDef.CHAR,1);
      incarren5dias = new FieldDef("incarren5dias",FieldDef.INTEGER,0);
      incarren5dia50 = new FieldDef("incarren5dia50",FieldDef.INTEGER,0);
      FieldDef array[] = {
        incejeraplic,
        incdeclaran,
        incidentinmob,
        incnumcontrato,
        incnroarrendat,
        incdiasarrenda,
        incarren1cumple,
        incarren1dias,
        incarren1dia50,
        incarren2cumple,
        incarren2dias,
        incarren2dia50,
        incarren3cumple,
        incarren3dias,
        incarren3dia50,
        incarren4cumple,
        incarren4dias,
        incarren4dia50,
        incarren5cumple,
        incarren5dias,
        incarren5dia50        
        };
      setColumns(array);
      FieldDef arrayf[] = {incejeraplic,incdeclaran,incidentinmob,incnumcontrato };
      setDescription("Datos contrato capital inmobiliario");
      setPrimaryKeys(arrayf);
      incejeraplic.setDescription("Ejercicio aplicacion");
      incdeclaran.setDescription("CODIGO DE DECLARANTE");
      incidentinmob.setDescription("Identificador inmobiliario");
      incnumcontrato.setDescription("Codigo de contrato");
      incnroarrendat.setDescription("Numero de arrendatarios");
      incdiasarrenda.setDescription("Dias total arrendamiento");
      incarren1cumple.setDescription("Cumple requisito arrendatario 1");
      incarren1dias.setDescription("Nro. dias reduccion 100%");
      incarren1dia50.setDescription("Nro. dias reduccion 50%");
      incarren2cumple.setDescription("Cumple requisito arrendatario 2");
      incarren2dias.setDescription("Nro. dias reduccion 100%");
      incarren2dia50.setDescription("Nro. dias reduccion 50%");
      incarren3cumple.setDescription("Cumple requisito arrendatario 3");
      incarren3dias.setDescription("Nro. dias reduccion 100%");
      incarren3dia50.setDescription("Nro. dias reduccion 50%");
      incarren4cumple.setDescription("Cumple requisito arrendatario 4");
      incarren4dias.setDescription("Nro. dias reduccion 100%");
      incarren4dia50.setDescription("Nro. dias reduccion 50%");
      incarren5cumple.setDescription("Cumple requisito arrendatario 5");
      incarren5dias.setDescription("Nro. dias reduccion 100%");
      incarren5dia50.setDescription("Nro. dias reduccion 50%");
      }
    }
    
  public class TabPrestvdahabit extends TableDef
    {
    // Campos
    public FieldDef pvhdeclaran;
    public FieldDef pvhidentinmob;
    public FieldDef pvhnro;
    public FieldDef pvhnroprestamo;
    public FieldDef pvhimporte1;
    public FieldDef pvhfecha;
    public FieldDef pvhentidad;
    public FieldDef pvhcuenta;
    public FieldDef pvhfechabaja;
    public TabPrestvdahabit(String name)
      {
      super(name);
      pvhdeclaran = new FieldDef("pvhdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pvhidentinmob = new FieldDef("pvhidentinmob",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pvhnro = new FieldDef("pvhnro",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pvhnroprestamo = new FieldDef("pvhnroprestamo",FieldDef.CHAR,20);
      pvhimporte1 = new FieldDef("pvhimporte1",FieldDef.FLOAT,6,0);
      pvhfecha = new FieldDef("pvhfecha",FieldDef.DATE);
      pvhentidad = new FieldDef("pvhentidad",FieldDef.CHAR,50);
      pvhcuenta = new FieldDef("pvhcuenta",FieldDef.CHAR,20);
      pvhfechabaja = new FieldDef("pvhfechabaja",FieldDef.DATE);
      FieldDef array[] = {
        pvhdeclaran,
        pvhidentinmob,
        pvhnro,
        pvhnroprestamo,
        pvhimporte1,
        pvhfecha,
        pvhentidad,
        pvhcuenta,
        pvhfechabaja        
        };
      setColumns(array);
      FieldDef arrayf[] = {pvhdeclaran,pvhidentinmob,pvhnro };
      setDescription("Prestamo hipotecarios vivienda habitual");
      setPrimaryKeys(arrayf);
      pvhdeclaran.setDescription("CODIGO DE DECLARANTE");
      pvhidentinmob.setDescription("Identificador inmobiliario");
      pvhnro.setDescription("Registro");
      pvhnroprestamo.setDescription("Identificador prestamo");
      pvhimporte1.setDescription("Importe");
      pvhfecha.setDescription("Fecha de constitucion");
      pvhentidad.setDescription("Entidad Emisora");
      pvhcuenta.setDescription("Numero Cuenta");
      pvhfechabaja.setDescription("Fecha fin prestamo");
      }
    }
    
  public class TabHistoramortiz extends TableDef
    {
    // Campos
    public FieldDef haideclaran;
    public FieldDef haiidentinmob;
    public FieldDef haiejercicio;
    public FieldDef haiamortizacion;
    public TabHistoramortiz(String name)
      {
      super(name);
      haideclaran = new FieldDef("haideclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      haiidentinmob = new FieldDef("haiidentinmob",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      haiejercicio = new FieldDef("haiejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      haiamortizacion = new FieldDef("haiamortizacion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        haideclaran,
        haiidentinmob,
        haiejercicio,
        haiamortizacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {haideclaran,haiidentinmob,haiejercicio };
      setDescription("Historico amortizaciones inmobiliario");
      setPrimaryKeys(arrayf);
      haideclaran.setDescription("CODIGO DE DECLARANTE");
      haiidentinmob.setDescription("Identificador inmobiliario");
      haiejercicio.setDescription("Ejercicio");
      haiamortizacion.setDescription("Amortizacion");
      }
    }
    
  public class TabPagosactivida extends TableDef
    {
    // Campos
    public FieldDef pacejeraplic;
    public FieldDef pacdeclaran;
    public FieldDef pacidentactiv;
    public FieldDef pacpagfrac1;
    public FieldDef pacpagfrac2;
    public FieldDef pacpagfrac3;
    public FieldDef pacpagfrac4;
    public FieldDef pacretenciones;
    public FieldDef pacpfrac4ejeran;
    public TabPagosactivida(String name)
      {
      super(name);
      pacejeraplic = new FieldDef("pacejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pacdeclaran = new FieldDef("pacdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pacidentactiv = new FieldDef("pacidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pacpagfrac1 = new FieldDef("pacpagfrac1",FieldDef.FLOAT,6,0);
      pacpagfrac2 = new FieldDef("pacpagfrac2",FieldDef.FLOAT,6,0);
      pacpagfrac3 = new FieldDef("pacpagfrac3",FieldDef.FLOAT,6,0);
      pacpagfrac4 = new FieldDef("pacpagfrac4",FieldDef.FLOAT,6,0);
      pacretenciones = new FieldDef("pacretenciones",FieldDef.FLOAT,6,0);
      pacpfrac4ejeran = new FieldDef("pacpfrac4ejeran",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pacejeraplic,
        pacdeclaran,
        pacidentactiv,
        pacpagfrac1,
        pacpagfrac2,
        pacpagfrac3,
        pacpagfrac4,
        pacretenciones,
        pacpfrac4ejeran        
        };
      setColumns(array);
      FieldDef arrayf[] = {pacejeraplic,pacdeclaran,pacidentactiv };
      setDescription("Pagos fraccionados y retenciones actividades");
      setPrimaryKeys(arrayf);
      pacejeraplic.setDescription("Ejercicio aplicacion");
      pacdeclaran.setDescription("CODIGO DE DECLARANTE");
      pacidentactiv.setDescription("Identificador actividad");
      pacpagfrac1.setDescription("Pago Fraccionado Trim. 1");
      pacpagfrac2.setDescription("Pago Fraccionado Trim. 2");
      pacpagfrac3.setDescription("Pago Fraccionado Trim. 3");
      pacpagfrac4.setDescription("Pago Fraccionado Trim. 4");
      pacretenciones.setDescription("Retenciones");
      pacpfrac4ejeran.setDescription("Pago Fraccionado Trim. 4 Ant.");
      }
    }
    
  public class TabDedinvdetalle extends TableDef
    {
    // Campos
    public FieldDef dieident;
    public FieldDef dieejeraplic;
    public FieldDef diedeclaran;
    public FieldDef dieidentactiv;
    public FieldDef dietipo;
    public FieldDef diemodalidad;
    public FieldDef diefecha;
    public FieldDef diedescripcion;
    public FieldDef dieinversion;
    public FieldDef dieporcentaje;
    public FieldDef diededuccion;
    public TabDedinvdetalle(String name)
      {
      super(name);
      dieident = new FieldDef("dieident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dieejeraplic = new FieldDef("dieejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      diedeclaran = new FieldDef("diedeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dieidentactiv = new FieldDef("dieidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dietipo = new FieldDef("dietipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      diemodalidad = new FieldDef("diemodalidad",FieldDef.CHAR,3);
      diefecha = new FieldDef("diefecha",FieldDef.DATE);
      diedescripcion = new FieldDef("diedescripcion",FieldDef.CHAR,30);
      dieinversion = new FieldDef("dieinversion",FieldDef.FLOAT,6,0);
      dieporcentaje = new FieldDef("dieporcentaje",FieldDef.FLOAT,6,0);
      diededuccion = new FieldDef("diededuccion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        dieident,
        dieejeraplic,
        diedeclaran,
        dieidentactiv,
        dietipo,
        diemodalidad,
        diefecha,
        diedescripcion,
        dieinversion,
        dieporcentaje,
        diededuccion        
        };
      setColumns(array);
      FieldDef arrayf[] = {dieident };
      setDescription("Detalle deducciones inversiones ejercicio");
      setPrimaryKeys(arrayf);
      dieident.setAutoIncrementable(true);
      dieejeraplic.setDescription("Ejercicio fiscal aplicacion");
      diedeclaran.setDescription("Codigo declarante");
      dieidentactiv.setDescription("Identificador actividad");
      dietipo.setDescription("Tipo deduccion: [E]statal, [C]anarias");
      diemodalidad.setDescription("Modalidad inversion");
      diefecha.setDescription("Fecha inversion");
      diedescripcion.setDescription("Descripcion");
      dieinversion.setDescription("Importe inversion");
      dieporcentaje.setDescription("%  Deduccion");
      diededuccion.setDescription("Cuantia deduccion");
      }
    }
    
  public class TabDedgastosid extends TableDef
    {
    // Campos
    public FieldDef didejeraplic;
    public FieldDef diddeclaran;
    public FieldDef dididentactiv;
    public FieldDef didaf_actual;
    public FieldDef didaf_anterior;
    public FieldDef didaf_anteante;
    public FieldDef didaf_valmedio;
    public FieldDef diddeduccion;
    public TabDedgastosid(String name)
      {
      super(name);
      didejeraplic = new FieldDef("didejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      diddeclaran = new FieldDef("diddeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dididentactiv = new FieldDef("dididentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      didaf_actual = new FieldDef("didaf_actual",FieldDef.FLOAT,6,0);
      didaf_anterior = new FieldDef("didaf_anterior",FieldDef.FLOAT,6,0);
      didaf_anteante = new FieldDef("didaf_anteante",FieldDef.FLOAT,6,0);
      didaf_valmedio = new FieldDef("didaf_valmedio",FieldDef.FLOAT,6,0);
      diddeduccion = new FieldDef("diddeduccion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        didejeraplic,
        diddeclaran,
        dididentactiv,
        didaf_actual,
        didaf_anterior,
        didaf_anteante,
        didaf_valmedio,
        diddeduccion        
        };
      setColumns(array);
      FieldDef arrayf[] = {didejeraplic,diddeclaran,dididentactiv };
      setDescription("Deduccion Gastos I+D del ejercicio");
      setPrimaryKeys(arrayf);
      didejeraplic.setDescription("Ejercicio fiscal aplicacion");
      diddeclaran.setDescription("Declarante");
      dididentactiv.setDescription("Identificador actividad");
      didaf_actual.setDescription("Total gastos año actual");
      didaf_anterior.setDescription("Total gastos año anterior");
      didaf_anteante.setDescription("Total gastos año anterior-1");
      didaf_valmedio.setDescription("Valor medio años anteriores");
      diddeduccion.setDescription("Deduccion practicada");
      }
    }
    
  public class TabDedgastosfp extends TableDef
    {
    // Campos
    public FieldDef dfpejeraplic;
    public FieldDef dfpdeclaran;
    public FieldDef dfpidentactiv;
    public FieldDef dfpactual;
    public FieldDef dfpanterior;
    public FieldDef dfpanteante;
    public FieldDef dfpvalmedio;
    public FieldDef dfpdeduccion;
    public TabDedgastosfp(String name)
      {
      super(name);
      dfpejeraplic = new FieldDef("dfpejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dfpdeclaran = new FieldDef("dfpdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dfpidentactiv = new FieldDef("dfpidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dfpactual = new FieldDef("dfpactual",FieldDef.FLOAT,6,0);
      dfpanterior = new FieldDef("dfpanterior",FieldDef.FLOAT,6,0);
      dfpanteante = new FieldDef("dfpanteante",FieldDef.FLOAT,6,0);
      dfpvalmedio = new FieldDef("dfpvalmedio",FieldDef.FLOAT,6,0);
      dfpdeduccion = new FieldDef("dfpdeduccion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        dfpejeraplic,
        dfpdeclaran,
        dfpidentactiv,
        dfpactual,
        dfpanterior,
        dfpanteante,
        dfpvalmedio,
        dfpdeduccion        
        };
      setColumns(array);
      FieldDef arrayf[] = {dfpejeraplic,dfpdeclaran,dfpidentactiv };
      setDescription("Deduccion Gastos Formacion profesional del ejercicio");
      setPrimaryKeys(arrayf);
      dfpejeraplic.setDescription("Ejercicio fiscal aplicacion");
      dfpdeclaran.setDescription("Declarante");
      dfpidentactiv.setDescription("Identificador actividad");
      dfpactual.setDescription("Total gastos año actual");
      dfpanterior.setDescription("Total gastos año anterior");
      dfpanteante.setDescription("Total gastos año anterior-1");
      dfpvalmedio.setDescription("Valor medio años anteriores");
      dfpdeduccion.setDescription("Deduccion practicada");
      }
    }
    
  public class TabDedplanpensione extends TableDef
    {
    // Campos
    public FieldDef dppejeraplic;
    public FieldDef dppdeclaran;
    public FieldDef dppidentactiv;
    public FieldDef dpptipodeduc;
    public FieldDef dppaportacion;
    public FieldDef dppretribucion;
    public FieldDef dppbase_deduc;
    public TabDedplanpensione(String name)
      {
      super(name);
      dppejeraplic = new FieldDef("dppejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dppdeclaran = new FieldDef("dppdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dppidentactiv = new FieldDef("dppidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dpptipodeduc = new FieldDef("dpptipodeduc",FieldDef.CHAR,3);
      dppaportacion = new FieldDef("dppaportacion",FieldDef.FLOAT,6,0);
      dppretribucion = new FieldDef("dppretribucion",FieldDef.FLOAT,6,0);
      dppbase_deduc = new FieldDef("dppbase_deduc",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        dppejeraplic,
        dppdeclaran,
        dppidentactiv,
        dpptipodeduc,
        dppaportacion,
        dppretribucion,
        dppbase_deduc        
        };
      setColumns(array);
      FieldDef arrayf[] = {dppejeraplic,dppdeclaran,dppidentactiv };
      setDescription("Detalle deducciones contribucion planes pensiones");
      setPrimaryKeys(arrayf);
      dppejeraplic.setDescription("Ejercicio fiscal aplicacion");
      dppdeclaran.setDescription("Declarante");
      dppidentactiv.setDescription("Identificador actividad");
      dpptipodeduc.setDescription("Tipo deduccion");
      dppaportacion.setDescription("Contribucion empresarial");
      dppretribucion.setDescription("Retribucion trabajador");
      dppbase_deduc.setDescription("Base de la deduccion");
      }
    }
    
  public class TabRic extends TableDef
    {
    // Campos
    public FieldDef ricejeraplic;
    public FieldDef ricdeclaran;
    public FieldDef ricidentactiv;
    public FieldDef ricanyo;
    public FieldDef ricimporte_dota;
    public FieldDef ricmaterial_eje;
    public FieldDef ricclave;
    public FieldDef ricpdte_materia;
    public FieldDef ricmaterial2_ej;
    public TabRic(String name)
      {
      super(name);
      ricejeraplic = new FieldDef("ricejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ricdeclaran = new FieldDef("ricdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      ricidentactiv = new FieldDef("ricidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ricanyo = new FieldDef("ricanyo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ricimporte_dota = new FieldDef("ricimporte_dota",FieldDef.FLOAT,6,0);
      ricmaterial_eje = new FieldDef("ricmaterial_eje",FieldDef.FLOAT,6,0);
      ricclave = new FieldDef("ricclave",FieldDef.INTEGER,0);
      ricpdte_materia = new FieldDef("ricpdte_materia",FieldDef.FLOAT,6,0);
      ricmaterial2_ej = new FieldDef("ricmaterial2_ej",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ricejeraplic,
        ricdeclaran,
        ricidentactiv,
        ricanyo,
        ricimporte_dota,
        ricmaterial_eje,
        ricclave,
        ricpdte_materia,
        ricmaterial2_ej        
        };
      setColumns(array);
      FieldDef arrayf[] = {ricejeraplic,ricdeclaran,ricidentactiv,ricanyo };
      setDescription("Reserva inversiones en Canarias");
      setPrimaryKeys(arrayf);
      ricejeraplic.setDescription("Ejercicio aplicacion");
      ricdeclaran.setDescription("CODIGO DE DECLARANTE");
      ricidentactiv.setDescription("Identificador actividad");
      ricanyo.setDescription("EJERCICIO");
      ricimporte_dota.setDescription("Importe de la dotacion");
      ricmaterial_eje.setDescription("Importe materializado ejer.");
      ricclave.setDescription("Tipo de bien materializacion");
      ricpdte_materia.setDescription("Importe pdte. de materializar");
      ricmaterial2_ej.setDescription("Importe materializado ejer.");
      }
    }
    
  public class TabImpututes extends TableDef
    {
    // Campos
    public FieldDef impejeraplic;
    public FieldDef impdeclaran;
    public FieldDef impcontador;
    public FieldDef impdeclaracion;
    public FieldDef impmuf;
    public FieldDef imprazon;
    public FieldDef impcif;
    public FieldDef impimputacion;
    public FieldDef impdedinternac;
    public FieldDef impbonificacion;
    public FieldDef imptipoimputac;
    public FieldDef imppagosfraccio;
    public FieldDef impretenciones;
    public FieldDef impcriterio;
    public FieldDef impceuta;
    public FieldDef impnifrellabor;
    public FieldDef impvalliquidat;
    public FieldDef impvaladquisic;
    public TabImpututes(String name)
      {
      super(name);
      impejeraplic = new FieldDef("impejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      impdeclaran = new FieldDef("impdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      impcontador = new FieldDef("impcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      impdeclaracion = new FieldDef("impdeclaracion",FieldDef.INTEGER,0);
      impmuf = new FieldDef("impmuf",FieldDef.CHAR,1);
      imprazon = new FieldDef("imprazon",FieldDef.CHAR,35);
      impcif = new FieldDef("impcif",FieldDef.CHAR,15);
      impimputacion = new FieldDef("impimputacion",FieldDef.FLOAT,6,0);
      impdedinternac = new FieldDef("impdedinternac",FieldDef.FLOAT,6,0);
      impbonificacion = new FieldDef("impbonificacion",FieldDef.FLOAT,6,0);
      imptipoimputac = new FieldDef("imptipoimputac",FieldDef.CHAR,1);
      imppagosfraccio = new FieldDef("imppagosfraccio",FieldDef.FLOAT,6,0);
      impretenciones = new FieldDef("impretenciones",FieldDef.FLOAT,6,0);
      impcriterio = new FieldDef("impcriterio",FieldDef.CHAR,1);
      impceuta = new FieldDef("impceuta",FieldDef.FLOAT,6,0);
      impnifrellabor = new FieldDef("impnifrellabor",FieldDef.CHAR,15);
      impvalliquidat = new FieldDef("impvalliquidat",FieldDef.FLOAT,6,0);
      impvaladquisic = new FieldDef("impvaladquisic",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        impejeraplic,
        impdeclaran,
        impcontador,
        impdeclaracion,
        impmuf,
        imprazon,
        impcif,
        impimputacion,
        impdedinternac,
        impbonificacion,
        imptipoimputac,
        imppagosfraccio,
        impretenciones,
        impcriterio,
        impceuta,
        impnifrellabor,
        impvalliquidat,
        impvaladquisic        
        };
      setColumns(array);
      FieldDef arrayf[] = {impejeraplic,impdeclaran,impcontador };
      setDescription("Imputacion UTES/Transp.fiscal internacional");
      setPrimaryKeys(arrayf);
      impejeraplic.setDescription("Ejercicio aplicacion");
      impdeclaran.setDescription("CODIGO DE DECLARANTE");
      impcontador.setDescription("Contador");
      impdeclaracion.setDescription("Codigo Declaracion");
      impmuf.setDescription("M.U.F.");
      imprazon.setDescription("Razon Social");
      impcif.setDescription("C.I.F.");
      impimputacion.setDescription("Imputacion");
      impdedinternac.setDescription("Doble Imp. Internacional");
      impbonificacion.setDescription("Rentas Bonificadas");
      imptipoimputac.setDescription("Tipo imputacion");
      imppagosfraccio.setDescription("Pagos fraccionados");
      impretenciones.setDescription("Retenciones e ingresos a cta.");
      impcriterio.setDescription("Criterio Periodo Impositivo");
      impceuta.setDescription("Base deduccion Ceuta-Melilla");
      impnifrellabor.setDescription("N.I.F. relacion laboral");
      impvalliquidat.setDescription("Valor liquidativo");
      impvaladquisic.setDescription("Valor Adquisicion");
      }
    }
    
  public class TabValadquiactual extends TableDef
    {
    // Campos
    public FieldDef vaaejeraplic;
    public FieldDef vaadeclaran;
    public FieldDef vaaidentgananc;
    public FieldDef vaaejercicio;
    public FieldDef vaavaladquis;
    public FieldDef vaagastos;
    public FieldDef vaaamortizacion;
    public FieldDef vaacoefcorrec;
    public TabValadquiactual(String name)
      {
      super(name);
      vaaejeraplic = new FieldDef("vaaejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      vaadeclaran = new FieldDef("vaadeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      vaaidentgananc = new FieldDef("vaaidentgananc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      vaaejercicio = new FieldDef("vaaejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      vaavaladquis = new FieldDef("vaavaladquis",FieldDef.FLOAT,6,0);
      vaagastos = new FieldDef("vaagastos",FieldDef.FLOAT,6,0);
      vaaamortizacion = new FieldDef("vaaamortizacion",FieldDef.FLOAT,6,0);
      vaacoefcorrec = new FieldDef("vaacoefcorrec",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        vaaejeraplic,
        vaadeclaran,
        vaaidentgananc,
        vaaejercicio,
        vaavaladquis,
        vaagastos,
        vaaamortizacion,
        vaacoefcorrec        
        };
      setColumns(array);
      FieldDef arrayf[] = {vaaejeraplic,vaadeclaran,vaaidentgananc,vaaejercicio };
      setDescription("Perdidas y ganancias: valor adquisicion actualizado");
      setPrimaryKeys(arrayf);
      vaaejeraplic.setDescription("Ejercicio aplicacion");
      vaadeclaran.setDescription("CODIGO DE DECLARANTE");
      vaaidentgananc.setDescription("Identificador ganancia o perdida");
      vaaejercicio.setDescription("Año");
      vaavaladquis.setDescription("Valor de adquisicion o mejora");
      vaagastos.setDescription("Tributos o gastos");
      vaaamortizacion.setDescription("Amortizacion");
      vaacoefcorrec.setDescription("Coeficiente actualizacion");
      }
    }
    
  public class TabCormonetvalcont extends TableDef
    {
    // Campos
    public FieldDef cmoejeraplic;
    public FieldDef cmodeclaran;
    public FieldDef cmoidentgananc;
    public FieldDef cmoejercicio;
    public FieldDef cmovaladquisic;
    public FieldDef cmovalamortiza;
    public FieldDef cmocoeficiente;
    public TabCormonetvalcont(String name)
      {
      super(name);
      cmoejeraplic = new FieldDef("cmoejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cmodeclaran = new FieldDef("cmodeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cmoidentgananc = new FieldDef("cmoidentgananc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cmoejercicio = new FieldDef("cmoejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cmovaladquisic = new FieldDef("cmovaladquisic",FieldDef.FLOAT,6,0);
      cmovalamortiza = new FieldDef("cmovalamortiza",FieldDef.FLOAT,6,0);
      cmocoeficiente = new FieldDef("cmocoeficiente",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        cmoejeraplic,
        cmodeclaran,
        cmoidentgananc,
        cmoejercicio,
        cmovaladquisic,
        cmovalamortiza,
        cmocoeficiente        
        };
      setColumns(array);
      FieldDef arrayf[] = {cmoejeraplic,cmodeclaran,cmoidentgananc,cmoejercicio };
      setDescription("Valor neto contable correccion monetaria");
      setPrimaryKeys(arrayf);
      cmoejeraplic.setDescription("Ejercicio aplicacion");
      cmodeclaran.setDescription("CODIGO DE DECLARANTE");
      cmoidentgananc.setDescription("Identificador ganancia o perdida");
      cmoejercicio.setDescription("Año");
      cmovaladquisic.setDescription("Valor adquisicion o mejora");
      cmovalamortiza.setDescription("Valor amortizacion");
      cmocoeficiente.setDescription("Coeficiente correccion monetaria");
      }
    }
    
  public class TabCormonetcoefici extends TableDef
    {
    // Campos
    public FieldDef cmcejeraplic;
    public FieldDef cmcdeclaran;
    public FieldDef cmcidentgananc;
    public FieldDef cmcejercicio;
    public FieldDef cmcfondospropio;
    public FieldDef cmctotalpasivo;
    public FieldDef cmctesoreria;
    public FieldDef cmcderechocredi;
    public TabCormonetcoefici(String name)
      {
      super(name);
      cmcejeraplic = new FieldDef("cmcejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cmcdeclaran = new FieldDef("cmcdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cmcidentgananc = new FieldDef("cmcidentgananc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cmcejercicio = new FieldDef("cmcejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cmcfondospropio = new FieldDef("cmcfondospropio",FieldDef.FLOAT,6,0);
      cmctotalpasivo = new FieldDef("cmctotalpasivo",FieldDef.FLOAT,6,0);
      cmctesoreria = new FieldDef("cmctesoreria",FieldDef.FLOAT,6,0);
      cmcderechocredi = new FieldDef("cmcderechocredi",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        cmcejeraplic,
        cmcdeclaran,
        cmcidentgananc,
        cmcejercicio,
        cmcfondospropio,
        cmctotalpasivo,
        cmctesoreria,
        cmcderechocredi        
        };
      setColumns(array);
      FieldDef arrayf[] = {cmcejeraplic,cmcdeclaran,cmcidentgananc,cmcejercicio };
      setDescription("Coeficientes correccion monetaria");
      setPrimaryKeys(arrayf);
      cmcejeraplic.setDescription("Ejercicio aplicacion");
      cmcdeclaran.setDescription("CODIGO DE DECLARANTE");
      cmcidentgananc.setDescription("Identificador ganancia o perdida");
      cmcejercicio.setDescription("Año");
      cmcfondospropio.setDescription("Importe fondos propios");
      cmctotalpasivo.setDescription("Total pasivo");
      cmctesoreria.setDescription("Tesoreria");
      cmcderechocredi.setDescription("Derechos de credito");
      }
    }
    
  public class TabCormonetdrenta extends TableDef
    {
    // Campos
    public FieldDef cmrejeraplic;
    public FieldDef cmrdeclaran;
    public FieldDef cmridentgananc;
    public FieldDef cmrejercicio;
    public FieldDef cmrimporte;
    public TabCormonetdrenta(String name)
      {
      super(name);
      cmrejeraplic = new FieldDef("cmrejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cmrdeclaran = new FieldDef("cmrdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cmridentgananc = new FieldDef("cmridentgananc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cmrejercicio = new FieldDef("cmrejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cmrimporte = new FieldDef("cmrimporte",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        cmrejeraplic,
        cmrdeclaran,
        cmridentgananc,
        cmrejercicio,
        cmrimporte        
        };
      setColumns(array);
      FieldDef arrayf[] = {cmrejeraplic,cmrdeclaran,cmridentgananc,cmrejercicio };
      setDescription("Desglose renta a integrar en base general");
      setPrimaryKeys(arrayf);
      cmrejeraplic.setDescription("Ejercicio aplicacion");
      cmrdeclaran.setDescription("CODIGO DE DECLARANTE");
      cmridentgananc.setDescription("Identificador ganancia o perdida");
      cmrejercicio.setDescription("Año");
      cmrimporte.setDescription("Importe a integrar");
      }
    }
    
  public class TabDefdeducciones extends TableDef
    {
    // Campos
    public FieldDef ddeejeraplic;
    public FieldDef ddeestatautonom;
    public FieldDef ddecodautonomia;
    public FieldDef ddecodigo;
    public FieldDef ddedescripcion;
    public FieldDef ddeporcen;
    public FieldDef ddeimportededuc;
    public TabDefdeducciones(String name)
      {
      super(name);
      ddeejeraplic = new FieldDef("ddeejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ddeestatautonom = new FieldDef("ddeestatautonom",FieldDef.CHAR,1,FieldDef.NOTNULL);
      ddecodautonomia = new FieldDef("ddecodautonomia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ddecodigo = new FieldDef("ddecodigo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      ddedescripcion = new FieldDef("ddedescripcion",FieldDef.CHAR,70);
      ddeporcen = new FieldDef("ddeporcen",FieldDef.FLOAT,6,0);
      ddeimportededuc = new FieldDef("ddeimportededuc",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ddeejeraplic,
        ddeestatautonom,
        ddecodautonomia,
        ddecodigo,
        ddedescripcion,
        ddeporcen,
        ddeimportededuc        
        };
      setColumns(array);
      FieldDef arrayf[] = {ddeejeraplic,ddeestatautonom,ddecodautonomia,ddecodigo };
      setDescription("Definicion deducciones");
      setPrimaryKeys(arrayf);
      ddeejeraplic.setDescription("Ejercicio aplicacion");
      ddeestatautonom.setDescription("[E]statal o [A]utonomica");
      ddecodautonomia.setDescription("Codigo autonomia");
      ddecodigo.setDescription("Codigo deduccion");
      ddedescripcion.setDescription("Descripcion");
      ddeporcen.setDescription("Porcentaje deduccion");
      ddeimportededuc.setDescription("Importe deduccion");
      }
    }
    
  public class TabHistdedvivienda extends TableDef
    {
    // Campos
    public FieldDef hdvdeclaran;
    public FieldDef hdvejercicio;
    public FieldDef hdvmuf;
    public FieldDef hdvbasededuc;
    public FieldDef hdvimpdedestat;
    public FieldDef hdvimpdedauton;
    public FieldDef hdvestadorenta;
    public TabHistdedvivienda(String name)
      {
      super(name);
      hdvdeclaran = new FieldDef("hdvdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      hdvejercicio = new FieldDef("hdvejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hdvmuf = new FieldDef("hdvmuf",FieldDef.CHAR,1);
      hdvbasededuc = new FieldDef("hdvbasededuc",FieldDef.FLOAT,6,0);
      hdvimpdedestat = new FieldDef("hdvimpdedestat",FieldDef.FLOAT,6,0);
      hdvimpdedauton = new FieldDef("hdvimpdedauton",FieldDef.FLOAT,6,0);
      hdvestadorenta = new FieldDef("hdvestadorenta",FieldDef.CHAR,1);
      FieldDef array[] = {
        hdvdeclaran,
        hdvejercicio,
        hdvmuf,
        hdvbasededuc,
        hdvimpdedestat,
        hdvimpdedauton,
        hdvestadorenta        
        };
      setColumns(array);
      FieldDef arrayf[] = {hdvdeclaran,hdvejercicio,hdvmuf };
      setDescription("Historico deducciones vivienda habitual");
      setPrimaryKeys(arrayf);
      hdvdeclaran.setDescription("CODIGO DE DECLARANTE");
      hdvejercicio.setDescription("Año deduccion");
      hdvmuf.setDescription("M.U.F.");
      hdvbasededuc.setDescription("Base de la deduccion");
      hdvimpdedestat.setDescription("Importe deduccion estatal");
      hdvimpdedauton.setDescription("Importe deduccion autonomica");
      hdvestadorenta.setDescription("Estado impresion renta");
      }
    }
    
  public class TabDatosfiscales extends TableDef
    {
    // Campos
    public FieldDef dfiejeraplic;
    public FieldDef dfideclaran;
    public FieldDef dfinifdecla;
    public FieldDef dfitipodecla;
    public FieldDef dfiapell1decla;
    public FieldDef dfiubicarcdecla;
    public FieldDef dfireferendecla;
    public FieldDef dfinifconyu;
    public FieldDef dfitipoconyu;
    public FieldDef dfiapell1conyu;
    public FieldDef dfiubicarcconyu;
    public FieldDef dfireferenconyu;
    public FieldDef dfinifhijo1;
    public FieldDef dfitipohijo1;
    public FieldDef dfiapell1hijo1;
    public FieldDef dfiubicarchijo1;
    public FieldDef dfireferenhijo1;
    public FieldDef dfinifhijo2;
    public FieldDef dfitipohijo2;
    public FieldDef dfiapell1hijo2;
    public FieldDef dfiubicarchijo2;
    public FieldDef dfireferenhijo2;
    public TabDatosfiscales(String name)
      {
      super(name);
      dfiejeraplic = new FieldDef("dfiejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dfideclaran = new FieldDef("dfideclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dfinifdecla = new FieldDef("dfinifdecla",FieldDef.CHAR,15);
      dfitipodecla = new FieldDef("dfitipodecla",FieldDef.CHAR,1);
      dfiapell1decla = new FieldDef("dfiapell1decla",FieldDef.CHAR,20);
      dfiubicarcdecla = new FieldDef("dfiubicarcdecla",FieldDef.CHAR,100);
      dfireferendecla = new FieldDef("dfireferendecla",FieldDef.CHAR,19);
      dfinifconyu = new FieldDef("dfinifconyu",FieldDef.CHAR,15);
      dfitipoconyu = new FieldDef("dfitipoconyu",FieldDef.CHAR,1);
      dfiapell1conyu = new FieldDef("dfiapell1conyu",FieldDef.CHAR,20);
      dfiubicarcconyu = new FieldDef("dfiubicarcconyu",FieldDef.CHAR,100);
      dfireferenconyu = new FieldDef("dfireferenconyu",FieldDef.CHAR,19);
      dfinifhijo1 = new FieldDef("dfinifhijo1",FieldDef.CHAR,15);
      dfitipohijo1 = new FieldDef("dfitipohijo1",FieldDef.CHAR,1);
      dfiapell1hijo1 = new FieldDef("dfiapell1hijo1",FieldDef.CHAR,20);
      dfiubicarchijo1 = new FieldDef("dfiubicarchijo1",FieldDef.CHAR,100);
      dfireferenhijo1 = new FieldDef("dfireferenhijo1",FieldDef.CHAR,19);
      dfinifhijo2 = new FieldDef("dfinifhijo2",FieldDef.CHAR,15);
      dfitipohijo2 = new FieldDef("dfitipohijo2",FieldDef.CHAR,1);
      dfiapell1hijo2 = new FieldDef("dfiapell1hijo2",FieldDef.CHAR,20);
      dfiubicarchijo2 = new FieldDef("dfiubicarchijo2",FieldDef.CHAR,100);
      dfireferenhijo2 = new FieldDef("dfireferenhijo2",FieldDef.CHAR,19);
      FieldDef array[] = {
        dfiejeraplic,
        dfideclaran,
        dfinifdecla,
        dfitipodecla,
        dfiapell1decla,
        dfiubicarcdecla,
        dfireferendecla,
        dfinifconyu,
        dfitipoconyu,
        dfiapell1conyu,
        dfiubicarcconyu,
        dfireferenconyu,
        dfinifhijo1,
        dfitipohijo1,
        dfiapell1hijo1,
        dfiubicarchijo1,
        dfireferenhijo1,
        dfinifhijo2,
        dfitipohijo2,
        dfiapell1hijo2,
        dfiubicarchijo2,
        dfireferenhijo2        
        };
      setColumns(array);
      FieldDef arrayf[] = {dfiejeraplic,dfideclaran };
      setDescription("Incorporacion datos fiscales");
      setPrimaryKeys(arrayf);
      dfiejeraplic.setDescription("Ejercicio aplicacion");
      dfideclaran.setDescription("CODIGO DE DECLARANTE");
      dfinifdecla.setDescription("NIF declarante");
      dfitipodecla.setDescription("Tipo incorporacion datos fiscales declarante");
      dfiapell1decla.setDescription("Primer Apellido Declarante");
      dfiubicarcdecla.setDescription("Ubicacion archivo declarante");
      dfireferendecla.setDescription("Referencia declaracion declarante");
      dfinifconyu.setDescription("NIF conyuge");
      dfitipoconyu.setDescription("Tipo incorporacion datos fiscales conyuge");
      dfiapell1conyu.setDescription("Primer Apellido Conyuge");
      dfiubicarcconyu.setDescription("Ubicacion archivo conyuge");
      dfireferenconyu.setDescription("Referencia declaracion conyuge");
      dfinifhijo1.setDescription("NIF hijo 1");
      dfitipohijo1.setDescription("Tipo incorporacion datos fiscales hijo 1");
      dfiapell1hijo1.setDescription("Primer Apellido hijo 1");
      dfiubicarchijo1.setDescription("Ubicacion archivo hijo 1");
      dfireferenhijo1.setDescription("Referencia declaracion hijo 1");
      dfinifhijo2.setDescription("NIF hijo 2");
      dfitipohijo2.setDescription("Tipo incorporacion datos fiscales hijo 2");
      dfiapell1hijo2.setDescription("Primer Apellido hijo 2");
      dfiubicarchijo2.setDescription("Ubicacion archivo hijo 2");
      dfireferenhijo2.setDescription("Referencia declaracion hijo 2");
      }
    }
    
  public class TabAeatactividades extends TableDef
    {
    // Campos
    public FieldDef aacejeraplic;
    public FieldDef aacdeclaran;
    public FieldDef aacmuf;
    public FieldDef aaccontador;
    public FieldDef aacincorporar;
    public FieldDef aacdeclaracion;
    public FieldDef aacpagador;
    public FieldDef aactipoactivida;
    public FieldDef aacestimacion;
    public FieldDef aacepigrafe;
    public FieldDef aacingresos;
    public FieldDef aacretenciones;
    public FieldDef aaccontvinculad;
    public FieldDef aacpagofracc1;
    public FieldDef aacpagofracc2;
    public FieldDef aacpagofracc3;
    public FieldDef aacpagofracc4;
    public TabAeatactividades(String name)
      {
      super(name);
      aacejeraplic = new FieldDef("aacejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aacdeclaran = new FieldDef("aacdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      aacmuf = new FieldDef("aacmuf",FieldDef.CHAR,1);
      aaccontador = new FieldDef("aaccontador",FieldDef.INTEGER,0);
      aacincorporar = new FieldDef("aacincorporar",FieldDef.CHAR,1);
      aacdeclaracion = new FieldDef("aacdeclaracion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aacpagador = new FieldDef("aacpagador",FieldDef.CHAR,30);
      aactipoactivida = new FieldDef("aactipoactivida",FieldDef.CHAR,1);
      aacestimacion = new FieldDef("aacestimacion",FieldDef.CHAR,3);
      aacepigrafe = new FieldDef("aacepigrafe",FieldDef.CHAR,7);
      aacingresos = new FieldDef("aacingresos",FieldDef.FLOAT,6,0);
      aacretenciones = new FieldDef("aacretenciones",FieldDef.FLOAT,6,0);
      aaccontvinculad = new FieldDef("aaccontvinculad",FieldDef.INTEGER,0);
      aacpagofracc1 = new FieldDef("aacpagofracc1",FieldDef.FLOAT,6,0);
      aacpagofracc2 = new FieldDef("aacpagofracc2",FieldDef.FLOAT,6,0);
      aacpagofracc3 = new FieldDef("aacpagofracc3",FieldDef.FLOAT,6,0);
      aacpagofracc4 = new FieldDef("aacpagofracc4",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        aacejeraplic,
        aacdeclaran,
        aacmuf,
        aaccontador,
        aacincorporar,
        aacdeclaracion,
        aacpagador,
        aactipoactivida,
        aacestimacion,
        aacepigrafe,
        aacingresos,
        aacretenciones,
        aaccontvinculad,
        aacpagofracc1,
        aacpagofracc2,
        aacpagofracc3,
        aacpagofracc4        
        };
      setColumns(array);
      FieldDef arrayf[] = {aacejeraplic,aacdeclaran,aacmuf,aaccontador };
      setDescription("Datos fiscales: actividades y pagos");
      setPrimaryKeys(arrayf);
      aacejeraplic.setDescription("Ejercicio aplicacion");
      aacdeclaran.setDescription("CODIGO DE DECLARANTE");
      aacmuf.setDescription("MIEMBRO UNIDAD FAMILIAR");
      aaccontador.setDescription("CONTADOR");
      aacincorporar.setDescription("Incorporar a renta");
      aacdeclaracion.setDescription("Codigo declaracion");
      aacpagador.setDescription("Nombre del pagador");
      aactipoactivida.setDescription("Tipo actividad");
      aacestimacion.setDescription("Tipo estimacion");
      aacepigrafe.setDescription("Epigrafe");
      aacingresos.setDescription("Ingresos");
      aacretenciones.setDescription("Retenciones");
      aaccontvinculad.setDescription("Contador relacionado aplicacion GEYCE");
      aacpagofracc1.setDescription("Primer pago fraccionado");
      aacpagofracc2.setDescription("Segundo pago fraccionado");
      aacpagofracc3.setDescription("Tercer pago fraccionado");
      aacpagofracc4.setDescription("Cuarto pago fraccionado");
      }
    }
    
  public class TabAeatdeducciones extends TableDef
    {
    // Campos
    public FieldDef adeejeraplic;
    public FieldDef adedeclaran;
    public FieldDef ademuf;
    public FieldDef adecontador;
    public FieldDef adeincorporar;
    public FieldDef adedeclaracion;
    public FieldDef adeestaauton;
    public FieldDef adetipo;
    public FieldDef adenif;
    public FieldDef adedescripcion;
    public FieldDef adeimporte;
    public FieldDef adeporcentaje;
    public FieldDef adededuccion;
    public FieldDef adecotizacion;
    public FieldDef adeimpcobrado;
    public FieldDef adecontvinculad;
    public TabAeatdeducciones(String name)
      {
      super(name);
      adeejeraplic = new FieldDef("adeejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      adedeclaran = new FieldDef("adedeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      ademuf = new FieldDef("ademuf",FieldDef.CHAR,1);
      adecontador = new FieldDef("adecontador",FieldDef.INTEGER,0);
      adeincorporar = new FieldDef("adeincorporar",FieldDef.CHAR,1);
      adedeclaracion = new FieldDef("adedeclaracion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      adeestaauton = new FieldDef("adeestaauton",FieldDef.CHAR,1);
      adetipo = new FieldDef("adetipo",FieldDef.CHAR,3);
      adenif = new FieldDef("adenif",FieldDef.CHAR,9);
      adedescripcion = new FieldDef("adedescripcion",FieldDef.CHAR,40);
      adeimporte = new FieldDef("adeimporte",FieldDef.FLOAT,6,0);
      adeporcentaje = new FieldDef("adeporcentaje",FieldDef.FLOAT,6,0);
      adededuccion = new FieldDef("adededuccion",FieldDef.FLOAT,6,0);
      adecotizacion = new FieldDef("adecotizacion",FieldDef.FLOAT,6,0);
      adeimpcobrado = new FieldDef("adeimpcobrado",FieldDef.FLOAT,6,0);
      adecontvinculad = new FieldDef("adecontvinculad",FieldDef.INTEGER,0);
      FieldDef array[] = {
        adeejeraplic,
        adedeclaran,
        ademuf,
        adecontador,
        adeincorporar,
        adedeclaracion,
        adeestaauton,
        adetipo,
        adenif,
        adedescripcion,
        adeimporte,
        adeporcentaje,
        adededuccion,
        adecotizacion,
        adeimpcobrado,
        adecontvinculad        
        };
      setColumns(array);
      FieldDef arrayf[] = {adeejeraplic,adedeclaran,ademuf,adecontador };
      setDescription("Datos fiscales: deducciones estatales y autonomicas");
      setPrimaryKeys(arrayf);
      adeejeraplic.setDescription("Ejercicio aplicacion");
      adedeclaran.setDescription("CODIGO DE DECLARANTE");
      ademuf.setDescription("MIEMBRO UNIDAD FAMILIAR");
      adecontador.setDescription("CONTADOR");
      adeincorporar.setDescription("Incorporar a renta");
      adedeclaracion.setDescription("Codigo declaracion");
      adeestaauton.setDescription("Deduccion [E]statal/[A]utonomica");
      adetipo.setDescription("Tipo de deduccion");
      adenif.setDescription("Nif");
      adedescripcion.setDescription("Descripcion");
      adeimporte.setDescription("Importe");
      adeporcentaje.setDescription("% deduccion");
      adededuccion.setDescription("Deduccion");
      adecotizacion.setDescription("Importe cotizaciones");
      adeimpcobrado.setDescription("Importe cobrado");
      adecontvinculad.setDescription("Contador relacionado aplicacion GEYCE");
      }
    }
    
  public class TabAeatdomicilios extends TableDef
    {
    // Campos
    public FieldDef adoejeraplic;
    public FieldDef adodeclaran;
    public FieldDef adomuf;
    public FieldDef adotipodomi;
    public FieldDef adoincorporar;
    public FieldDef adotipovia;
    public FieldDef adoviaine;
    public FieldDef adocalle;
    public FieldDef adocalle2;
    public FieldDef adotiponum;
    public FieldDef adonumero;
    public FieldDef adocalificanum;
    public FieldDef adobloque;
    public FieldDef adoportal;
    public FieldDef adoesc;
    public FieldDef adopiso;
    public FieldDef adopta;
    public FieldDef adorestodomi;
    public FieldDef adopoblacion;
    public FieldDef adocpostal;
    public FieldDef adocodmuniine;
    public FieldDef adomunicipio;
    public FieldDef adocodprov;
    public FieldDef adomail;
    public FieldDef adotelefono;
    public FieldDef adomobil;
    public FieldDef adofax;
    public FieldDef adoadress1;
    public FieldDef adoadress2;
    public FieldDef adozip;
    public FieldDef adoregion;
    public FieldDef adopais;
    public FieldDef adocodpais;
    public TabAeatdomicilios(String name)
      {
      super(name);
      adoejeraplic = new FieldDef("adoejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      adodeclaran = new FieldDef("adodeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      adomuf = new FieldDef("adomuf",FieldDef.CHAR,1);
      adotipodomi = new FieldDef("adotipodomi",FieldDef.CHAR,1);
      adoincorporar = new FieldDef("adoincorporar",FieldDef.CHAR,1);
      adotipovia = new FieldDef("adotipovia",FieldDef.CHAR,5);
      adoviaine = new FieldDef("adoviaine",FieldDef.CHAR,5);
      adocalle = new FieldDef("adocalle",FieldDef.CHAR,50);
      adocalle2 = new FieldDef("adocalle2",FieldDef.CHAR,25);
      adotiponum = new FieldDef("adotiponum",FieldDef.CHAR,3);
      adonumero = new FieldDef("adonumero",FieldDef.CHAR,5);
      adocalificanum = new FieldDef("adocalificanum",FieldDef.CHAR,3);
      adobloque = new FieldDef("adobloque",FieldDef.CHAR,3);
      adoportal = new FieldDef("adoportal",FieldDef.CHAR,3);
      adoesc = new FieldDef("adoesc",FieldDef.CHAR,3);
      adopiso = new FieldDef("adopiso",FieldDef.CHAR,3);
      adopta = new FieldDef("adopta",FieldDef.CHAR,3);
      adorestodomi = new FieldDef("adorestodomi",FieldDef.CHAR,40);
      adopoblacion = new FieldDef("adopoblacion",FieldDef.CHAR,30);
      adocpostal = new FieldDef("adocpostal",FieldDef.CHAR,5);
      adocodmuniine = new FieldDef("adocodmuniine",FieldDef.CHAR,5);
      adomunicipio = new FieldDef("adomunicipio",FieldDef.CHAR,30);
      adocodprov = new FieldDef("adocodprov",FieldDef.INTEGER,0);
      adomail = new FieldDef("adomail",FieldDef.CHAR,100);
      adotelefono = new FieldDef("adotelefono",FieldDef.CHAR,15);
      adomobil = new FieldDef("adomobil",FieldDef.CHAR,15);
      adofax = new FieldDef("adofax",FieldDef.CHAR,15);
      adoadress1 = new FieldDef("adoadress1",FieldDef.CHAR,50);
      adoadress2 = new FieldDef("adoadress2",FieldDef.CHAR,40);
      adozip = new FieldDef("adozip",FieldDef.CHAR,10);
      adoregion = new FieldDef("adoregion",FieldDef.CHAR,30);
      adopais = new FieldDef("adopais",FieldDef.CHAR,30);
      adocodpais = new FieldDef("adocodpais",FieldDef.CHAR,2);
      FieldDef array[] = {
        adoejeraplic,
        adodeclaran,
        adomuf,
        adotipodomi,
        adoincorporar,
        adotipovia,
        adoviaine,
        adocalle,
        adocalle2,
        adotiponum,
        adonumero,
        adocalificanum,
        adobloque,
        adoportal,
        adoesc,
        adopiso,
        adopta,
        adorestodomi,
        adopoblacion,
        adocpostal,
        adocodmuniine,
        adomunicipio,
        adocodprov,
        adomail,
        adotelefono,
        adomobil,
        adofax,
        adoadress1,
        adoadress2,
        adozip,
        adoregion,
        adopais,
        adocodpais        
        };
      setColumns(array);
      FieldDef arrayf[] = {adoejeraplic,adodeclaran,adomuf,adotipodomi };
      setDescription("Datos fiscales: domicilios");
      setPrimaryKeys(arrayf);
      adoejeraplic.setDescription("Ejercicio aplicacion");
      adodeclaran.setDescription("CODIGO DE DECLARANTE");
      adomuf.setDescription("MIEMBRO UNIDAD FAMILIAR");
      adotipodomi.setDescription("Tipo de domicilio [E]spaña, E[X]tranjero");
      adoincorporar.setDescription("Incorporar a renta");
      adotipovia.setDescription("Tipo de via");
      adoviaine.setDescription("Cod.Via INE");
      adocalle.setDescription("Via publica");
      adocalle2.setDescription("Calle 2");
      adotiponum.setDescription("Tipo numeracion");
      adonumero.setDescription("Numero");
      adocalificanum.setDescription("Calificador del numero");
      adobloque.setDescription("Bloque");
      adoportal.setDescription("Portal");
      adoesc.setDescription("Escalera");
      adopiso.setDescription("Piso");
      adopta.setDescription("Puerta");
      adorestodomi.setDescription("Resto datos domicilio");
      adopoblacion.setDescription("Poblacion");
      adocpostal.setDescription("Codigo Postal");
      adocodmuniine.setDescription("Codigo municipio INE");
      adomunicipio.setDescription("Municipio");
      adocodprov.setDescription("Codigo provincia");
      adomail.setDescription("E-mail");
      adotelefono.setDescription("Telefono fijo");
      adomobil.setDescription("Telefono mobil");
      adofax.setDescription("Fax");
      adoadress1.setDescription("Adress 1");
      adoadress2.setDescription("Adress 2");
      adozip.setDescription("ZIP");
      adoregion.setDescription("Prov/Region/Estado");
      adopais.setDescription("Pais");
      adocodpais.setDescription("Codigo pais");
      }
    }
    
  public class TabAeatmobiliario extends TableDef
    {
    // Campos
    public FieldDef amoejeraplic;
    public FieldDef amodeclaran;
    public FieldDef amomuf;
    public FieldDef amocontador;
    public FieldDef amoincorporar;
    public FieldDef amodeclaracion;
    public FieldDef amoclase;
    public FieldDef amoentidad;
    public FieldDef amocuenta;
    public FieldDef amotitulares;
    public FieldDef amordtointegrar;
    public FieldDef amoretencion;
    public FieldDef amoreduccion242;
    public FieldDef amogastos;
    public FieldDef amovalorcompra;
    public FieldDef amovaltransmis;
    public FieldDef amorendimiento;
    public FieldDef amobonificacion;
    public FieldDef amodividendos;
    public FieldDef amoreducciondt6;
    public FieldDef amocontvinculad;
    public TabAeatmobiliario(String name)
      {
      super(name);
      amoejeraplic = new FieldDef("amoejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      amodeclaran = new FieldDef("amodeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      amomuf = new FieldDef("amomuf",FieldDef.CHAR,1);
      amocontador = new FieldDef("amocontador",FieldDef.INTEGER,0);
      amoincorporar = new FieldDef("amoincorporar",FieldDef.CHAR,1);
      amodeclaracion = new FieldDef("amodeclaracion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      amoclase = new FieldDef("amoclase",FieldDef.CHAR,5);
      amoentidad = new FieldDef("amoentidad",FieldDef.CHAR,40);
      amocuenta = new FieldDef("amocuenta",FieldDef.CHAR,10);
      amotitulares = new FieldDef("amotitulares",FieldDef.INTEGER,0);
      amordtointegrar = new FieldDef("amordtointegrar",FieldDef.FLOAT,6,0);
      amoretencion = new FieldDef("amoretencion",FieldDef.FLOAT,6,0);
      amoreduccion242 = new FieldDef("amoreduccion242",FieldDef.FLOAT,6,0);
      amogastos = new FieldDef("amogastos",FieldDef.FLOAT,6,0);
      amovalorcompra = new FieldDef("amovalorcompra",FieldDef.FLOAT,6,0);
      amovaltransmis = new FieldDef("amovaltransmis",FieldDef.FLOAT,6,0);
      amorendimiento = new FieldDef("amorendimiento",FieldDef.FLOAT,6,0);
      amobonificacion = new FieldDef("amobonificacion",FieldDef.FLOAT,6,0);
      amodividendos = new FieldDef("amodividendos",FieldDef.FLOAT,6,0);
      amoreducciondt6 = new FieldDef("amoreducciondt6",FieldDef.FLOAT,6,0);
      amocontvinculad = new FieldDef("amocontvinculad",FieldDef.INTEGER,0);
      FieldDef array[] = {
        amoejeraplic,
        amodeclaran,
        amomuf,
        amocontador,
        amoincorporar,
        amodeclaracion,
        amoclase,
        amoentidad,
        amocuenta,
        amotitulares,
        amordtointegrar,
        amoretencion,
        amoreduccion242,
        amogastos,
        amovalorcompra,
        amovaltransmis,
        amorendimiento,
        amobonificacion,
        amodividendos,
        amoreducciondt6,
        amocontvinculad        
        };
      setColumns(array);
      FieldDef arrayf[] = {amoejeraplic,amodeclaran,amomuf,amoclase,amocontador };
      setDescription("Datos fiscales: capital mobiliario");
      setPrimaryKeys(arrayf);
      amoejeraplic.setDescription("Ejercicio aplicacion");
      amodeclaran.setDescription("CODIGO DE DECLARANTE");
      amomuf.setDescription("MIEMBRO UNIDAD FAMILIAR");
      amocontador.setDescription("CONTADOR");
      amoincorporar.setDescription("Incorporar a renta");
      amodeclaracion.setDescription("Codigo declaracion");
      amoclase.setDescription("TIPO DE VALOR MOBILIARIO");
      amoentidad.setDescription("Nombre de la entidad");
      amocuenta.setDescription("Codigo de cuenta");
      amotitulares.setDescription("Nro. de titulares");
      amordtointegrar.setDescription("Rendimiento a integrar");
      amoretencion.setDescription("Retencion");
      amoreduccion242.setDescription("Reduccion art. 24.2");
      amogastos.setDescription("Gastos");
      amovalorcompra.setDescription("Valor de compra");
      amovaltransmis.setDescription("Valor de transmision");
      amorendimiento.setDescription("Rendimiento");
      amobonificacion.setDescription("Bonificacion");
      amodividendos.setDescription("Dividendos");
      amoreducciondt6.setDescription("Reduccion D.T 6");
      amocontvinculad.setDescription("Contador relacionado aplicacion GEYCE");
      }
    }
    
  public class TabAeatmiembros extends TableDef
    {
    // Campos
    public FieldDef amiejeraplic;
    public FieldDef amideclaran;
    public FieldDef amimuf;
    public FieldDef amicontador;
    public FieldDef amiincorporar;
    public FieldDef amitipo;
    public FieldDef amiestado;
    public FieldDef amifechanac;
    public FieldDef amiccaa;
    public FieldDef amiminus;
    public FieldDef amisexe;
    public FieldDef aminif;
    public FieldDef aminombre;
    public FieldDef amiingresos;
    public FieldDef amiredmin;
    public TabAeatmiembros(String name)
      {
      super(name);
      amiejeraplic = new FieldDef("amiejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      amideclaran = new FieldDef("amideclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      amimuf = new FieldDef("amimuf",FieldDef.CHAR,1);
      amicontador = new FieldDef("amicontador",FieldDef.INTEGER,0);
      amiincorporar = new FieldDef("amiincorporar",FieldDef.CHAR,1);
      amitipo = new FieldDef("amitipo",FieldDef.CHAR,3);
      amiestado = new FieldDef("amiestado",FieldDef.CHAR,1);
      amifechanac = new FieldDef("amifechanac",FieldDef.DATE);
      amiccaa = new FieldDef("amiccaa",FieldDef.INTEGER,0);
      amiminus = new FieldDef("amiminus",FieldDef.INTEGER,0);
      amisexe = new FieldDef("amisexe",FieldDef.CHAR,1);
      aminif = new FieldDef("aminif",FieldDef.CHAR,15);
      aminombre = new FieldDef("aminombre",FieldDef.CHAR,50);
      amiingresos = new FieldDef("amiingresos",FieldDef.FLOAT,6,0);
      amiredmin = new FieldDef("amiredmin",FieldDef.CHAR,1);
      FieldDef array[] = {
        amiejeraplic,
        amideclaran,
        amimuf,
        amicontador,
        amiincorporar,
        amitipo,
        amiestado,
        amifechanac,
        amiccaa,
        amiminus,
        amisexe,
        aminif,
        aminombre,
        amiingresos,
        amiredmin        
        };
      setColumns(array);
      FieldDef arrayf[] = {amiejeraplic,amideclaran,amimuf,amicontador };
      setDescription("Datos fiscales: miembros unidad");
      setPrimaryKeys(arrayf);
      amiejeraplic.setDescription("Ejercicio aplicacion");
      amideclaran.setDescription("CODIGO DE DECLARANTE");
      amimuf.setDescription("MIEMBRO UNIDAD FAMILIAR");
      amicontador.setDescription("CONTADOR");
      amiincorporar.setDescription("Incorporar a renta");
      amitipo.setDescription("Tipo");
      amiestado.setDescription("Estado civil");
      amifechanac.setDescription("Fecha Nacimiento");
      amiccaa.setDescription("Comunidad Autonoma");
      amiminus.setDescription("Minusvalia");
      amisexe.setDescription("Sexo");
      aminif.setDescription("NIF");
      aminombre.setDescription("Apellidos-Nombre");
      amiingresos.setDescription("Ingresos");
      amiredmin.setDescription("Derecho reduc.minimos descen.");
      }
    }
    
  public class TabDatadiconsumo extends TableDef
    {
    // Campos
    public FieldDef dacejeraplic;
    public FieldDef dacdeclaran;
    public FieldDef dacmuf;
    public FieldDef dactrabdesemple;
    public FieldDef dactrabinvalide;
    public FieldDef dactrabindemiza;
    public FieldDef dactrabotrosrdt;
    public FieldDef dacmobdividendo;
    public FieldDef dacactestimaent;
    public FieldDef dacactestimasal;
    public FieldDef dacactinvempres;
    public FieldDef dacotrospremios;
    public FieldDef dacotrosindemin;
    public FieldDef dacotrosotrrdto;
    public FieldDef dacotrospensent;
    public FieldDef dacotrospenssal;
    public FieldDef dacotrosrentpag;
    public FieldDef dacotrosrentcob;
    public FieldDef dacsaldbancario;
    public FieldDef dacsaldactfinan;
    public FieldDef dacsaldprestamo;
    public FieldDef dacdemascobvehi;
    public FieldDef dacdemaspagvehi;
    public FieldDef dacdemasajuar;
    public FieldDef dacotrvarventas;
    public FieldDef dacotrvariacent;
    public FieldDef dacotrvariacsal;
    public TabDatadiconsumo(String name)
      {
      super(name);
      dacejeraplic = new FieldDef("dacejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dacdeclaran = new FieldDef("dacdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dacmuf = new FieldDef("dacmuf",FieldDef.CHAR,1);
      dactrabdesemple = new FieldDef("dactrabdesemple",FieldDef.FLOAT,6,0);
      dactrabinvalide = new FieldDef("dactrabinvalide",FieldDef.FLOAT,6,0);
      dactrabindemiza = new FieldDef("dactrabindemiza",FieldDef.FLOAT,6,0);
      dactrabotrosrdt = new FieldDef("dactrabotrosrdt",FieldDef.FLOAT,6,0);
      dacmobdividendo = new FieldDef("dacmobdividendo",FieldDef.FLOAT,6,0);
      dacactestimaent = new FieldDef("dacactestimaent",FieldDef.FLOAT,6,0);
      dacactestimasal = new FieldDef("dacactestimasal",FieldDef.FLOAT,6,0);
      dacactinvempres = new FieldDef("dacactinvempres",FieldDef.FLOAT,6,0);
      dacotrospremios = new FieldDef("dacotrospremios",FieldDef.FLOAT,6,0);
      dacotrosindemin = new FieldDef("dacotrosindemin",FieldDef.FLOAT,6,0);
      dacotrosotrrdto = new FieldDef("dacotrosotrrdto",FieldDef.FLOAT,6,0);
      dacotrospensent = new FieldDef("dacotrospensent",FieldDef.FLOAT,6,0);
      dacotrospenssal = new FieldDef("dacotrospenssal",FieldDef.FLOAT,6,0);
      dacotrosrentpag = new FieldDef("dacotrosrentpag",FieldDef.FLOAT,6,0);
      dacotrosrentcob = new FieldDef("dacotrosrentcob",FieldDef.FLOAT,6,0);
      dacsaldbancario = new FieldDef("dacsaldbancario",FieldDef.FLOAT,6,0);
      dacsaldactfinan = new FieldDef("dacsaldactfinan",FieldDef.FLOAT,6,0);
      dacsaldprestamo = new FieldDef("dacsaldprestamo",FieldDef.FLOAT,6,0);
      dacdemascobvehi = new FieldDef("dacdemascobvehi",FieldDef.FLOAT,6,0);
      dacdemaspagvehi = new FieldDef("dacdemaspagvehi",FieldDef.FLOAT,6,0);
      dacdemasajuar = new FieldDef("dacdemasajuar",FieldDef.FLOAT,6,0);
      dacotrvarventas = new FieldDef("dacotrvarventas",FieldDef.FLOAT,6,0);
      dacotrvariacent = new FieldDef("dacotrvariacent",FieldDef.FLOAT,6,0);
      dacotrvariacsal = new FieldDef("dacotrvariacsal",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        dacejeraplic,
        dacdeclaran,
        dacmuf,
        dactrabdesemple,
        dactrabinvalide,
        dactrabindemiza,
        dactrabotrosrdt,
        dacmobdividendo,
        dacactestimaent,
        dacactestimasal,
        dacactinvempres,
        dacotrospremios,
        dacotrosindemin,
        dacotrosotrrdto,
        dacotrospensent,
        dacotrospenssal,
        dacotrosrentpag,
        dacotrosrentcob,
        dacsaldbancario,
        dacsaldactfinan,
        dacsaldprestamo,
        dacdemascobvehi,
        dacdemaspagvehi,
        dacdemasajuar,
        dacotrvarventas,
        dacotrvariacent,
        dacotrvariacsal        
        };
      setColumns(array);
      FieldDef arrayf[] = {dacejeraplic,dacdeclaran,dacmuf };
      setDescription("Datos adicionales consumo de renta");
      setPrimaryKeys(arrayf);
      dacejeraplic.setDescription("Ejercicio aplicacion");
      dacdeclaran.setDescription("CODIGO DE DECLARANTE");
      dacmuf.setDescription("Miembro unidad familiar");
      dactrabdesemple.setDescription("Prestaciones Desempleo");
      dactrabinvalide.setDescription("Invalidez Permanente");
      dactrabindemiza.setDescription("Indemnizaciones no Sujetas");
      dactrabotrosrdt.setDescription("Otros Rendim. no Sujetos");
      dacmobdividendo.setDescription("Dividendos de Soc. Transp.");
      dacactestimaent.setDescription("Difer.Result.Estimacion-Real, entradas");
      dacactestimasal.setDescription("Difer.Result.Estimac.-Real, salidas");
      dacactinvempres.setDescription("Inversion Empresarial Pagada");
      dacotrospremios.setDescription("Premios no Sujetos");
      dacotrosindemin.setDescription("Indemnizaciones no Sujetas");
      dacotrosotrrdto.setDescription("Otros Rendim. no Sujetos");
      dacotrospensent.setDescription("Pensiones a los Hijos, entradas");
      dacotrospenssal.setDescription("Pensiones a los Hijos, salidas");
      dacotrosrentpag.setDescription("Pago Renta Ej. Ant.");
      dacotrosrentcob.setDescription("Cobro Renta Ej.Ant.");
      dacsaldbancario.setDescription("Saldos Bancarios Iniciales");
      dacsaldactfinan.setDescription("Saldos de Act.Financ.Iniciales");
      dacsaldprestamo.setDescription("Saldos de Prestam.Acreed.Inic.");
      dacdemascobvehi.setDescription("Cobros Venta Vehic.,Embar.,etc");
      dacdemaspagvehi.setDescription("Pagos Adquis.Vehic.,Embar.,etc");
      dacdemasajuar.setDescription("Adq.Ajuar sup. a 1502.53 euros");
      dacotrvarventas.setDescription("Venta DPS Socied. con Cotizac.");
      dacotrvariacent.setDescription("Otras Variaciones, entradas");
      dacotrvariacsal.setDescription("Otras Variaciones, salidas");
      }
    }
    
  public class TabOpciondeclaran extends TableDef
    {
    // Campos
    public FieldDef opdejeraplic;
    public FieldDef opddeclaran;
    public FieldDef opdtrabajo;
    public FieldDef opdinmobiliario;
    public FieldDef opdinmobhabitua;
    public FieldDef opdinmobarrenda;
    public FieldDef opdinmobpropia;
    public FieldDef opdctacorriente;
    public FieldDef opdmobiliario;
    public FieldDef opdactividad;
    public FieldDef opdimputacion;
    public FieldDef opdganancias;
    public FieldDef opdatribucion;
    public FieldDef opdcompensacion;
    public FieldDef opddeduccion;
    public FieldDef opdpatrimonio;
    public FieldDef opdconsumo;
    public FieldDef opdinmactivida;
    public TabOpciondeclaran(String name)
      {
      super(name);
      opdejeraplic = new FieldDef("opdejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      opddeclaran = new FieldDef("opddeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      opdtrabajo = new FieldDef("opdtrabajo",FieldDef.CHAR,1);
      opdinmobiliario = new FieldDef("opdinmobiliario",FieldDef.CHAR,1);
      opdinmobhabitua = new FieldDef("opdinmobhabitua",FieldDef.CHAR,1);
      opdinmobarrenda = new FieldDef("opdinmobarrenda",FieldDef.CHAR,1);
      opdinmobpropia = new FieldDef("opdinmobpropia",FieldDef.CHAR,1);
      opdctacorriente = new FieldDef("opdctacorriente",FieldDef.CHAR,1);
      opdmobiliario = new FieldDef("opdmobiliario",FieldDef.CHAR,1);
      opdactividad = new FieldDef("opdactividad",FieldDef.CHAR,1);
      opdimputacion = new FieldDef("opdimputacion",FieldDef.CHAR,1);
      opdganancias = new FieldDef("opdganancias",FieldDef.CHAR,1);
      opdatribucion = new FieldDef("opdatribucion",FieldDef.CHAR,1);
      opdcompensacion = new FieldDef("opdcompensacion",FieldDef.CHAR,1);
      opddeduccion = new FieldDef("opddeduccion",FieldDef.CHAR,1);
      opdpatrimonio = new FieldDef("opdpatrimonio",FieldDef.CHAR,1);
      opdconsumo = new FieldDef("opdconsumo",FieldDef.CHAR,1);
      opdinmactivida = new FieldDef("opdinmactivida",FieldDef.CHAR,1);
      FieldDef array[] = {
        opdejeraplic,
        opddeclaran,
        opdtrabajo,
        opdinmobiliario,
        opdinmobhabitua,
        opdinmobarrenda,
        opdinmobpropia,
        opdctacorriente,
        opdmobiliario,
        opdactividad,
        opdimputacion,
        opdganancias,
        opdatribucion,
        opdcompensacion,
        opddeduccion,
        opdpatrimonio,
        opdconsumo,
        opdinmactivida        
        };
      setColumns(array);
      FieldDef arrayf[] = {opdejeraplic,opddeclaran };
      setDescription("Tipo de datos que se permite informar");
      setPrimaryKeys(arrayf);
      opdejeraplic.setDescription("Ejercicio aplicacion");
      opddeclaran.setDescription("CODIGO DE DECLARANTE");
      opdtrabajo.setDescription("Trabajo personal");
      opdinmobiliario.setDescription("Datos inmuebles");
      opdinmobhabitua.setDescription("Inmuebles: vivienda habitual");
      opdinmobarrenda.setDescription("Inmuebles: arrendadas");
      opdinmobpropia.setDescription("Inmuebles: propias");
      opdctacorriente.setDescription("Cuentas corrientes");
      opdmobiliario.setDescription("Capital mobiliario");
      opdactividad.setDescription("Actividades economicas");
      opdimputacion.setDescription("Imputacion UTE/Derechos imagen");
      opdganancias.setDescription("Ganancias y perdidas patrimoniales");
      opdatribucion.setDescription("Atribucion de rentas");
      opdcompensacion.setDescription("Compensaciones pendientes");
      opddeduccion.setDescription("Deducciones");
      opdpatrimonio.setDescription("Otros datos patrimonio");
      opdconsumo.setDescription("Consumo de renta");
      opdinmactivida.setDescription("Inmuebles: actividades");
      }
    }
    
  public class TabHistorgastos extends TableDef
    {
    // Campos
    public FieldDef hgiejeraplic;
    public FieldDef hgideclaran;
    public FieldDef hgiidentinmob;
    public FieldDef hginumcontrato;
    public FieldDef hgiejercicio;
    public FieldDef hgipendiente;
    public FieldDef hgiaplicado;
    public TabHistorgastos(String name)
      {
      super(name);
      hgiejeraplic = new FieldDef("hgiejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hgideclaran = new FieldDef("hgideclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      hgiidentinmob = new FieldDef("hgiidentinmob",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hginumcontrato = new FieldDef("hginumcontrato",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hgiejercicio = new FieldDef("hgiejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hgipendiente = new FieldDef("hgipendiente",FieldDef.FLOAT,6,0);
      hgiaplicado = new FieldDef("hgiaplicado",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        hgiejeraplic,
        hgideclaran,
        hgiidentinmob,
        hginumcontrato,
        hgiejercicio,
        hgipendiente,
        hgiaplicado        
        };
      setColumns(array);
      FieldDef arrayf[] = {hgiejeraplic,hgideclaran,hgiidentinmob,hginumcontrato,hgiejercicio };
      setDescription("Historico compensacion gastos inmobiliario");
      setPrimaryKeys(arrayf);
      hgiejeraplic.setDescription("Ejercicio aplicacion");
      hgideclaran.setDescription("CODIGO DE DECLARANTE");
      hgiidentinmob.setDescription("Identificador inmobiliario");
      hginumcontrato.setDescription("Codigo de contrato");
      hgiejercicio.setDescription("Ejercicio");
      hgipendiente.setDescription("Pendiente");
      hgiaplicado.setDescription("Aplicado");
      }
    }
    
  public class TabLiquidaapartl extends TableDef
    {
    // Campos
    public FieldDef lilejeraplic;
    public FieldDef lildeclaran;
    public FieldDef lilmuf;
    public FieldDef liltipocalculo;
    public FieldDef lilmincontribes;
    public FieldDef lilmincontribau;
    public FieldDef lilmindescenes;
    public FieldDef lilmindescenau;
    public FieldDef lilminascenes;
    public FieldDef lilminascenau;
    public FieldDef lilmindiscapes;
    public FieldDef lilmindiscapau;
    public FieldDef liltotminimoes;
    public FieldDef liltotminimoau;
    public FieldDef lilbgexentaprog;
    public FieldDef lilbaexentaprog;
    public FieldDef lilanualidhijos;
    public FieldDef lilindemizsegur;
    public TabLiquidaapartl(String name)
      {
      super(name);
      lilejeraplic = new FieldDef("lilejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lildeclaran = new FieldDef("lildeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lilmuf = new FieldDef("lilmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      liltipocalculo = new FieldDef("liltipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lilmincontribes = new FieldDef("lilmincontribes",FieldDef.FLOAT,6,0);
      lilmincontribau = new FieldDef("lilmincontribau",FieldDef.FLOAT,6,0);
      lilmindescenes = new FieldDef("lilmindescenes",FieldDef.FLOAT,6,0);
      lilmindescenau = new FieldDef("lilmindescenau",FieldDef.FLOAT,6,0);
      lilminascenes = new FieldDef("lilminascenes",FieldDef.FLOAT,6,0);
      lilminascenau = new FieldDef("lilminascenau",FieldDef.FLOAT,6,0);
      lilmindiscapes = new FieldDef("lilmindiscapes",FieldDef.FLOAT,6,0);
      lilmindiscapau = new FieldDef("lilmindiscapau",FieldDef.FLOAT,6,0);
      liltotminimoes = new FieldDef("liltotminimoes",FieldDef.FLOAT,6,0);
      liltotminimoau = new FieldDef("liltotminimoau",FieldDef.FLOAT,6,0);
      lilbgexentaprog = new FieldDef("lilbgexentaprog",FieldDef.FLOAT,6,0);
      lilbaexentaprog = new FieldDef("lilbaexentaprog",FieldDef.FLOAT,6,0);
      lilanualidhijos = new FieldDef("lilanualidhijos",FieldDef.FLOAT,6,0);
      lilindemizsegur = new FieldDef("lilindemizsegur",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lilejeraplic,
        lildeclaran,
        lilmuf,
        liltipocalculo,
        lilmincontribes,
        lilmincontribau,
        lilmindescenes,
        lilmindescenau,
        lilminascenes,
        lilminascenau,
        lilmindiscapes,
        lilmindiscapau,
        liltotminimoes,
        liltotminimoau,
        lilbgexentaprog,
        lilbaexentaprog,
        lilanualidhijos,
        lilindemizsegur        
        };
      setColumns(array);
      FieldDef arrayf[] = {lilejeraplic,lildeclaran,lilmuf,liltipocalculo };
      setDescription("Liquidacion renta apartado L: Minimos familiares y datos adicionales");
      setPrimaryKeys(arrayf);
      lilejeraplic.setDescription("Ejercicio aplicacion");
      lildeclaran.setDescription("Codigo de declarante");
      lilmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      liltipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lilmincontribes.setDescription("Minimo del contribuyente");
      lilmincontribau.setDescription("Minimo del contribuyente incrementado autonomico");
      lilmindescenes.setDescription("Minimo por descendientes");
      lilmindescenau.setDescription("Minimo por descendientes incrementado autonomico");
      lilminascenes.setDescription("Minimo por ascendientes");
      lilminascenau.setDescription("Minimo por ascendientes incrementado autonomico");
      lilmindiscapes.setDescription("Minimo por discapacidad");
      lilmindiscapau.setDescription("Minimo por discapacidad incrementado autonomico");
      liltotminimoes.setDescription("Total minimo familiar y personal");
      liltotminimoau.setDescription("Total minimo familiar y personal incrementado autonomico");
      lilbgexentaprog.setDescription("Base liquidable general: renta exentas con progresividad");
      lilbaexentaprog.setDescription("Base liquidable ahorro: renta exentas con progresividad");
      lilanualidhijos.setDescription("Importe anualidades a favor hijos");
      lilindemizsegur.setDescription("Parte base liquidable gral.indemnizaciones seguros");
      }
    }
    
  public class TabCarteravalor extends TableDef
    {
    // Campos
    public FieldDef carident;
    public FieldDef carejeraplic;
    public FieldDef cardeclaran;
    public FieldDef carcontador;
    public FieldDef cartipo;
    public FieldDef carfechacompra;
    public FieldDef carlote;
    public FieldDef cartituloscompr;
    public FieldDef carcompra;
    public FieldDef cardescripcion;
    public FieldDef carvendersuscr;
    public FieldDef cartitulosvend;
    public FieldDef carfechaultvend;
    public FieldDef carliberadas;
    public FieldDef cartipoincr;
    public FieldDef cargastdonacion;
    public TabCarteravalor(String name)
      {
      super(name);
      carident = new FieldDef("carident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      carejeraplic = new FieldDef("carejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cardeclaran = new FieldDef("cardeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      carcontador = new FieldDef("carcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cartipo = new FieldDef("cartipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      carfechacompra = new FieldDef("carfechacompra",FieldDef.DATE);
      carlote = new FieldDef("carlote",FieldDef.INTEGER,0);
      cartituloscompr = new FieldDef("cartituloscompr",FieldDef.FLOAT,6,0);
      carcompra = new FieldDef("carcompra",FieldDef.FLOAT,6,0);
      cardescripcion = new FieldDef("cardescripcion",FieldDef.CHAR,40);
      carvendersuscr = new FieldDef("carvendersuscr",FieldDef.FLOAT,6,0);
      cartitulosvend = new FieldDef("cartitulosvend",FieldDef.FLOAT,6,0);
      carfechaultvend = new FieldDef("carfechaultvend",FieldDef.DATE);
      carliberadas = new FieldDef("carliberadas",FieldDef.CHAR,1);
      cartipoincr = new FieldDef("cartipoincr",FieldDef.CHAR,1);
      cargastdonacion = new FieldDef("cargastdonacion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        carident,
        carejeraplic,
        cardeclaran,
        carcontador,
        cartipo,
        carfechacompra,
        carlote,
        cartituloscompr,
        carcompra,
        cardescripcion,
        carvendersuscr,
        cartitulosvend,
        carfechaultvend,
        carliberadas,
        cartipoincr,
        cargastdonacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {carident };
      setDescription("Cartera de valores");
      setPrimaryKeys(arrayf);
      carident.setAutoIncrementable(true);
      carejeraplic.setDescription("Ejercicio aplicacion");
      cardeclaran.setDescription("CODIGO DE DECLARANTE");
      carcontador.setDescription("Identificador contador mobiliario o inmobiliario");
      cartipo.setDescription("[M]obiliario, [F]inca");
      carfechacompra.setDescription("Fecha de compra");
      carlote.setDescription("Numero de lote");
      cartituloscompr.setDescription("Numero de Titulos Comprados");
      carcompra.setDescription("Valor Compra");
      cardescripcion.setDescription("Descripcion");
      carvendersuscr.setDescription("Venta Derechos Subscripcion");
      cartitulosvend.setDescription("Numero de Titulos Vendidos");
      carfechaultvend.setDescription("Fecha Ultima Venta");
      carliberadas.setDescription("Liberadas/Compradas");
      cartipoincr.setDescription("Oneroso/Lucrativo");
      cargastdonacion.setDescription("Gastos donacion");
      }
    }
    
  public class TabLiquidaapartb2 extends TableDef
    {
    // Campos
    public FieldDef lb2ejeraplic;
    public FieldDef lb2declaran;
    public FieldDef lb2muf;
    public FieldDef lb2tipocalculo;
    public FieldDef lb2arrendinmue;
    public FieldDef lb2asistentecni;
    public FieldDef lb2propieintele;
    public FieldDef lb2propindustri;
    public FieldDef lb2otrosrdtos;
    public FieldDef lb2totalingreso;
    public FieldDef lb2gastosdeduc;
    public FieldDef lb2rdtoneto;
    public FieldDef lb2reducirregul;
    public FieldDef lb2rdtonetoredu;
    public FieldDef lb2exentodivide;
    public TabLiquidaapartb2(String name)
      {
      super(name);
      lb2ejeraplic = new FieldDef("lb2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lb2declaran = new FieldDef("lb2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lb2muf = new FieldDef("lb2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb2tipocalculo = new FieldDef("lb2tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb2arrendinmue = new FieldDef("lb2arrendinmue",FieldDef.FLOAT,6,0);
      lb2asistentecni = new FieldDef("lb2asistentecni",FieldDef.FLOAT,6,0);
      lb2propieintele = new FieldDef("lb2propieintele",FieldDef.FLOAT,6,0);
      lb2propindustri = new FieldDef("lb2propindustri",FieldDef.FLOAT,6,0);
      lb2otrosrdtos = new FieldDef("lb2otrosrdtos",FieldDef.FLOAT,6,0);
      lb2totalingreso = new FieldDef("lb2totalingreso",FieldDef.FLOAT,6,0);
      lb2gastosdeduc = new FieldDef("lb2gastosdeduc",FieldDef.FLOAT,6,0);
      lb2rdtoneto = new FieldDef("lb2rdtoneto",FieldDef.FLOAT,6,0);
      lb2reducirregul = new FieldDef("lb2reducirregul",FieldDef.FLOAT,6,0);
      lb2rdtonetoredu = new FieldDef("lb2rdtonetoredu",FieldDef.FLOAT,6,0);
      lb2exentodivide = new FieldDef("lb2exentodivide",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lb2ejeraplic,
        lb2declaran,
        lb2muf,
        lb2tipocalculo,
        lb2arrendinmue,
        lb2asistentecni,
        lb2propieintele,
        lb2propindustri,
        lb2otrosrdtos,
        lb2totalingreso,
        lb2gastosdeduc,
        lb2rdtoneto,
        lb2reducirregul,
        lb2rdtonetoredu,
        lb2exentodivide        
        };
      setColumns(array);
      FieldDef arrayf[] = {lb2ejeraplic,lb2declaran,lb2muf,lb2tipocalculo };
      setDescription("Liquidacion renta apartado B2: capital mobiliario base general");
      setPrimaryKeys(arrayf);
      lb2ejeraplic.setDescription("Ejercicio aplicacion");
      lb2declaran.setDescription("Codigo de declarante");
      lb2muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lb2tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lb2arrendinmue.setDescription("Arrendamiento inmuebles");
      lb2asistentecni.setDescription("Asistencia tecnica");
      lb2propieintele.setDescription("Propiedad intelectual");
      lb2propindustri.setDescription("Propiedad industrial");
      lb2otrosrdtos.setDescription("Otros rendimientos de capital mobiliario");
      lb2totalingreso.setDescription("Total ingresos integros");
      lb2gastosdeduc.setDescription("Gastos deducibles");
      lb2rdtoneto.setDescription("Rendimiento neto");
      lb2reducirregul.setDescription("Reduccion irregular");
      lb2rdtonetoredu.setDescription("Rendimiento neto reducido capital mobiliario b.general");
      lb2exentodivide.setDescription("Importe exento por dividendos para no residentes");
      }
    }
    
  public class TabParamlis extends TableDef
    {
    // Campos
    public FieldDef pliusuario;
    public FieldDef pliprograma;
    public FieldDef pliopcion;
    public FieldDef plicampoa1;
    public FieldDef plicampoa2;
    public FieldDef plicampoa3;
    public FieldDef plicampoa4;
    public FieldDef plicampoa5;
    public FieldDef plicampoa6;
    public FieldDef plicampoa7;
    public FieldDef plicampoa8;
    public FieldDef plicampoa9;
    public FieldDef plicampoa10;
    public FieldDef plicampoa11;
    public FieldDef plicampoa12;
    public FieldDef plicampoa13;
    public FieldDef plicampoa14;
    public FieldDef plicampoa15;
    public FieldDef plicampoa16;
    public FieldDef plicampoa17;
    public FieldDef plicampoa18;
    public FieldDef plicampoa19;
    public FieldDef plicampoa20;
    public FieldDef plicampoi21;
    public FieldDef plicampoi22;
    public FieldDef plicampoi23;
    public FieldDef plicampoi24;
    public FieldDef plicampoi25;
    public FieldDef plicampoi26;
    public FieldDef plicampoi27;
    public FieldDef plicampoi28;
    public FieldDef plicampoi29;
    public FieldDef plicampoi30;
    public FieldDef plicampoi31;
    public FieldDef plicampoi32;
    public FieldDef plicampoi33;
    public FieldDef plicampoi34;
    public FieldDef plicampoi35;
    public FieldDef plicampoi36;
    public FieldDef plicampoi37;
    public FieldDef plicampoi38;
    public FieldDef plicampoi39;
    public FieldDef plicampoi40;
    public FieldDef plicampon41;
    public FieldDef plicampon42;
    public FieldDef plicampon43;
    public FieldDef plicampon44;
    public FieldDef plicampon45;
    public FieldDef plicampon46;
    public FieldDef plicampon47;
    public FieldDef plicampon48;
    public FieldDef plicampon49;
    public FieldDef plicampon50;
    public FieldDef plicampod51;
    public FieldDef plicampod52;
    public FieldDef plicampod53;
    public FieldDef plicampod54;
    public FieldDef plicampod55;
    public FieldDef plicampod56;
    public FieldDef plicampod57;
    public FieldDef plicampod58;
    public FieldDef plicampod59;
    public FieldDef plicampod60;
    public FieldDef plicampoa61;
    public TabParamlis(String name)
      {
      super(name);
      pliusuario = new FieldDef("pliusuario",FieldDef.CHAR,25,FieldDef.NOTNULL);
      pliprograma = new FieldDef("pliprograma",FieldDef.CHAR,15,FieldDef.NOTNULL);
      pliopcion = new FieldDef("pliopcion",FieldDef.CHAR,2,FieldDef.NOTNULL);
      plicampoa1 = new FieldDef("plicampoa1",FieldDef.CHAR,30);
      plicampoa2 = new FieldDef("plicampoa2",FieldDef.CHAR,30);
      plicampoa3 = new FieldDef("plicampoa3",FieldDef.CHAR,30);
      plicampoa4 = new FieldDef("plicampoa4",FieldDef.CHAR,30);
      plicampoa5 = new FieldDef("plicampoa5",FieldDef.CHAR,30);
      plicampoa6 = new FieldDef("plicampoa6",FieldDef.CHAR,30);
      plicampoa7 = new FieldDef("plicampoa7",FieldDef.CHAR,30);
      plicampoa8 = new FieldDef("plicampoa8",FieldDef.CHAR,30);
      plicampoa9 = new FieldDef("plicampoa9",FieldDef.CHAR,30);
      plicampoa10 = new FieldDef("plicampoa10",FieldDef.CHAR,30);
      plicampoa11 = new FieldDef("plicampoa11",FieldDef.CHAR,30);
      plicampoa12 = new FieldDef("plicampoa12",FieldDef.CHAR,30);
      plicampoa13 = new FieldDef("plicampoa13",FieldDef.CHAR,30);
      plicampoa14 = new FieldDef("plicampoa14",FieldDef.CHAR,30);
      plicampoa15 = new FieldDef("plicampoa15",FieldDef.CHAR,30);
      plicampoa16 = new FieldDef("plicampoa16",FieldDef.CHAR,30);
      plicampoa17 = new FieldDef("plicampoa17",FieldDef.CHAR,30);
      plicampoa18 = new FieldDef("plicampoa18",FieldDef.CHAR,30);
      plicampoa19 = new FieldDef("plicampoa19",FieldDef.CHAR,30);
      plicampoa20 = new FieldDef("plicampoa20",FieldDef.CHAR,30);
      plicampoi21 = new FieldDef("plicampoi21",FieldDef.INTEGER,0);
      plicampoi22 = new FieldDef("plicampoi22",FieldDef.INTEGER,0);
      plicampoi23 = new FieldDef("plicampoi23",FieldDef.INTEGER,0);
      plicampoi24 = new FieldDef("plicampoi24",FieldDef.INTEGER,0);
      plicampoi25 = new FieldDef("plicampoi25",FieldDef.INTEGER,0);
      plicampoi26 = new FieldDef("plicampoi26",FieldDef.INTEGER,0);
      plicampoi27 = new FieldDef("plicampoi27",FieldDef.INTEGER,0);
      plicampoi28 = new FieldDef("plicampoi28",FieldDef.INTEGER,0);
      plicampoi29 = new FieldDef("plicampoi29",FieldDef.INTEGER,0);
      plicampoi30 = new FieldDef("plicampoi30",FieldDef.INTEGER,0);
      plicampoi31 = new FieldDef("plicampoi31",FieldDef.INTEGER,0);
      plicampoi32 = new FieldDef("plicampoi32",FieldDef.INTEGER,0);
      plicampoi33 = new FieldDef("plicampoi33",FieldDef.INTEGER,0);
      plicampoi34 = new FieldDef("plicampoi34",FieldDef.INTEGER,0);
      plicampoi35 = new FieldDef("plicampoi35",FieldDef.INTEGER,0);
      plicampoi36 = new FieldDef("plicampoi36",FieldDef.INTEGER,0);
      plicampoi37 = new FieldDef("plicampoi37",FieldDef.INTEGER,0);
      plicampoi38 = new FieldDef("plicampoi38",FieldDef.INTEGER,0);
      plicampoi39 = new FieldDef("plicampoi39",FieldDef.INTEGER,0);
      plicampoi40 = new FieldDef("plicampoi40",FieldDef.INTEGER,0);
      plicampon41 = new FieldDef("plicampon41",FieldDef.FLOAT,6,0);
      plicampon42 = new FieldDef("plicampon42",FieldDef.FLOAT,6,0);
      plicampon43 = new FieldDef("plicampon43",FieldDef.FLOAT,6,0);
      plicampon44 = new FieldDef("plicampon44",FieldDef.FLOAT,6,0);
      plicampon45 = new FieldDef("plicampon45",FieldDef.FLOAT,6,0);
      plicampon46 = new FieldDef("plicampon46",FieldDef.FLOAT,6,0);
      plicampon47 = new FieldDef("plicampon47",FieldDef.FLOAT,6,0);
      plicampon48 = new FieldDef("plicampon48",FieldDef.FLOAT,6,0);
      plicampon49 = new FieldDef("plicampon49",FieldDef.FLOAT,6,0);
      plicampon50 = new FieldDef("plicampon50",FieldDef.FLOAT,6,0);
      plicampod51 = new FieldDef("plicampod51",FieldDef.DATE);
      plicampod52 = new FieldDef("plicampod52",FieldDef.DATE);
      plicampod53 = new FieldDef("plicampod53",FieldDef.DATE);
      plicampod54 = new FieldDef("plicampod54",FieldDef.DATE);
      plicampod55 = new FieldDef("plicampod55",FieldDef.DATE);
      plicampod56 = new FieldDef("plicampod56",FieldDef.DATE);
      plicampod57 = new FieldDef("plicampod57",FieldDef.DATE);
      plicampod58 = new FieldDef("plicampod58",FieldDef.DATE);
      plicampod59 = new FieldDef("plicampod59",FieldDef.DATE);
      plicampod60 = new FieldDef("plicampod60",FieldDef.DATE);
      plicampoa61 = new FieldDef("plicampoa61",FieldDef.CHAR,100);
      FieldDef array[] = {
        pliusuario,
        pliprograma,
        pliopcion,
        plicampoa1,
        plicampoa2,
        plicampoa3,
        plicampoa4,
        plicampoa5,
        plicampoa6,
        plicampoa7,
        plicampoa8,
        plicampoa9,
        plicampoa10,
        plicampoa11,
        plicampoa12,
        plicampoa13,
        plicampoa14,
        plicampoa15,
        plicampoa16,
        plicampoa17,
        plicampoa18,
        plicampoa19,
        plicampoa20,
        plicampoi21,
        plicampoi22,
        plicampoi23,
        plicampoi24,
        plicampoi25,
        plicampoi26,
        plicampoi27,
        plicampoi28,
        plicampoi29,
        plicampoi30,
        plicampoi31,
        plicampoi32,
        plicampoi33,
        plicampoi34,
        plicampoi35,
        plicampoi36,
        plicampoi37,
        plicampoi38,
        plicampoi39,
        plicampoi40,
        plicampon41,
        plicampon42,
        plicampon43,
        plicampon44,
        plicampon45,
        plicampon46,
        plicampon47,
        plicampon48,
        plicampon49,
        plicampon50,
        plicampod51,
        plicampod52,
        plicampod53,
        plicampod54,
        plicampod55,
        plicampod56,
        plicampod57,
        plicampod58,
        plicampod59,
        plicampod60,
        plicampoa61        
        };
      setColumns(array);
      FieldDef arrayf[] = {pliusuario,pliprograma,pliopcion };
      setDescription("Definición parámetros por defecto en procesos");
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPatrima1 extends TableDef
    {
    // Campos
    public FieldDef pa1ejeraplic;
    public FieldDef pa1declaran;
    public FieldDef pa1muf;
    public FieldDef pa1tipocalculo;
    public FieldDef pa1contador;
    public FieldDef pa1clave;
    public FieldDef pa1refencia;
    public FieldDef pa1situacion;
    public FieldDef pa1valoracion;
    public TabPatrima1(String name)
      {
      super(name);
      pa1ejeraplic = new FieldDef("pa1ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pa1declaran = new FieldDef("pa1declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pa1muf = new FieldDef("pa1muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pa1tipocalculo = new FieldDef("pa1tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pa1contador = new FieldDef("pa1contador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pa1clave = new FieldDef("pa1clave",FieldDef.CHAR,1);
      pa1refencia = new FieldDef("pa1refencia",FieldDef.CHAR,20);
      pa1situacion = new FieldDef("pa1situacion",FieldDef.CHAR,50);
      pa1valoracion = new FieldDef("pa1valoracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pa1ejeraplic,
        pa1declaran,
        pa1muf,
        pa1tipocalculo,
        pa1contador,
        pa1clave,
        pa1refencia,
        pa1situacion,
        pa1valoracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {pa1ejeraplic,pa1declaran,pa1muf,pa1tipocalculo,pa1contador };
      setDescription("Liquidacion patrimonio apartado  A1: Vivienda habitual");
      setPrimaryKeys(arrayf);
      pa1ejeraplic.setDescription("Ejercicio aplicacion");
      pa1declaran.setDescription("Codigo de declarante");
      pa1muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pa1tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pa1contador.setDescription("Numero de contador");
      pa1clave.setDescription("Clave:  [P]leno dominio, [U]sufructo o demas derechos realies de uso y disfrute");
      pa1refencia.setDescription("Referencia catastral");
      pa1situacion.setDescription("Situacion: Calle, Nro, Municipio, Provincia");
      pa1valoracion.setDescription("Valor patrinonial del inmueble");
      }
    }
    
  public class TabPatrima2 extends TableDef
    {
    // Campos
    public FieldDef pa2ejeraplic;
    public FieldDef pa2declaran;
    public FieldDef pa2muf;
    public FieldDef pa2tipocalculo;
    public FieldDef pa2contador;
    public FieldDef pa2clave;
    public FieldDef pa2tipo;
    public FieldDef pa2refencia;
    public FieldDef pa2situacion;
    public FieldDef pa2valoracion;
    public TabPatrima2(String name)
      {
      super(name);
      pa2ejeraplic = new FieldDef("pa2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pa2declaran = new FieldDef("pa2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pa2muf = new FieldDef("pa2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pa2tipocalculo = new FieldDef("pa2tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pa2contador = new FieldDef("pa2contador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pa2clave = new FieldDef("pa2clave",FieldDef.CHAR,1);
      pa2tipo = new FieldDef("pa2tipo",FieldDef.CHAR,1);
      pa2refencia = new FieldDef("pa2refencia",FieldDef.CHAR,20);
      pa2situacion = new FieldDef("pa2situacion",FieldDef.CHAR,50);
      pa2valoracion = new FieldDef("pa2valoracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pa2ejeraplic,
        pa2declaran,
        pa2muf,
        pa2tipocalculo,
        pa2contador,
        pa2clave,
        pa2tipo,
        pa2refencia,
        pa2situacion,
        pa2valoracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {pa2ejeraplic,pa2declaran,pa2muf,pa2tipocalculo,pa2contador };
      setDescription("Liquidacion patrimonio apartado  A2: Otros inmuebles urbanos");
      setPrimaryKeys(arrayf);
      pa2ejeraplic.setDescription("Ejercicio aplicacion");
      pa2declaran.setDescription("Codigo de declarante");
      pa2muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pa2tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pa2contador.setDescription("Numero de inmueble");
      pa2clave.setDescription("Clave:  [P]leno dominio, [N]uda propiedad, [M]ultipropiedad");
      pa2tipo.setDescription("Tipo:   [V]ivienda, [L]ocal, [O]tros inmuebles urbarnos");
      pa2refencia.setDescription("Referencia catastral");
      pa2situacion.setDescription("Situacion: Calle, Nro, Municipio, Provincia");
      pa2valoracion.setDescription("Valor patrinonial del inmueble");
      }
    }
    
  public class TabPatrimb extends TableDef
    {
    // Campos
    public FieldDef pbejeraplic;
    public FieldDef pbdeclaran;
    public FieldDef pbmuf;
    public FieldDef pbtipocalculo;
    public FieldDef pbcontador;
    public FieldDef pbclave;
    public FieldDef pbrefencia;
    public FieldDef pbsituacion;
    public FieldDef pbvaloracion;
    public TabPatrimb(String name)
      {
      super(name);
      pbejeraplic = new FieldDef("pbejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pbdeclaran = new FieldDef("pbdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pbmuf = new FieldDef("pbmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pbtipocalculo = new FieldDef("pbtipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pbcontador = new FieldDef("pbcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pbclave = new FieldDef("pbclave",FieldDef.CHAR,1);
      pbrefencia = new FieldDef("pbrefencia",FieldDef.CHAR,20);
      pbsituacion = new FieldDef("pbsituacion",FieldDef.CHAR,50);
      pbvaloracion = new FieldDef("pbvaloracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pbejeraplic,
        pbdeclaran,
        pbmuf,
        pbtipocalculo,
        pbcontador,
        pbclave,
        pbrefencia,
        pbsituacion,
        pbvaloracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {pbejeraplic,pbdeclaran,pbmuf,pbtipocalculo,pbcontador };
      setDescription("Liquidacion patrimonio apartado B: Inmuebles de naturaleza rustica");
      setPrimaryKeys(arrayf);
      pbejeraplic.setDescription("Ejercicio aplicacion");
      pbdeclaran.setDescription("Codigo de declarante");
      pbmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pbtipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pbcontador.setDescription("Numero de contador");
      pbclave.setDescription("Clave:  [P]leno dominio, [N]uda propiedad, [M]ultipropiedad");
      pbrefencia.setDescription("Referencia catastral");
      pbsituacion.setDescription("Situacion: Municipio y Provincia");
      pbvaloracion.setDescription("Valor patrinonial del inmueble");
      }
    }
    
  public class TabPatrimc2 extends TableDef
    {
    // Campos
    public FieldDef pc2ejeraplic;
    public FieldDef pc2declaran;
    public FieldDef pc2muf;
    public FieldDef pc2tipocalculo;
    public FieldDef pc2contador;
    public FieldDef pc2epigrafe;
    public FieldDef pc2clave;
    public FieldDef pc2refencia;
    public FieldDef pc2situacion;
    public FieldDef pc2valoracion;
    public TabPatrimc2(String name)
      {
      super(name);
      pc2ejeraplic = new FieldDef("pc2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pc2declaran = new FieldDef("pc2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pc2muf = new FieldDef("pc2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pc2tipocalculo = new FieldDef("pc2tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pc2contador = new FieldDef("pc2contador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pc2epigrafe = new FieldDef("pc2epigrafe",FieldDef.CHAR,7);
      pc2clave = new FieldDef("pc2clave",FieldDef.CHAR,1);
      pc2refencia = new FieldDef("pc2refencia",FieldDef.CHAR,20);
      pc2situacion = new FieldDef("pc2situacion",FieldDef.CHAR,50);
      pc2valoracion = new FieldDef("pc2valoracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pc2ejeraplic,
        pc2declaran,
        pc2muf,
        pc2tipocalculo,
        pc2contador,
        pc2epigrafe,
        pc2clave,
        pc2refencia,
        pc2situacion,
        pc2valoracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {pc2ejeraplic,pc2declaran,pc2muf,pc2tipocalculo,pc2contador };
      setDescription("Liquidacion patrimonio apartado  C2: Bienes inmuebles no exentos afectos actividades");
      setPrimaryKeys(arrayf);
      pc2ejeraplic.setDescription("Ejercicio aplicacion");
      pc2declaran.setDescription("Codigo de declarante");
      pc2muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pc2tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pc2contador.setDescription("Numero de contador");
      pc2epigrafe.setDescription("Epigrafe IAE");
      pc2clave.setDescription("Clave:  [U]rbana [R]ustica o blanco");
      pc2refencia.setDescription("Referencia catastral");
      pc2situacion.setDescription("Situacion: Calle, Nro, Municipio, Provincia");
      pc2valoracion.setDescription("Valoracion del bien o derecho");
      }
    }
    
  public class TabPatrimd extends TableDef
    {
    // Campos
    public FieldDef pdejeraplic;
    public FieldDef pddeclaran;
    public FieldDef pdmuf;
    public FieldDef pdtipocalculo;
    public FieldDef pdcontador;
    public FieldDef pdepigrafe;
    public FieldDef pdclave;
    public FieldDef pdrefencia;
    public FieldDef pddescripcion;
    public FieldDef pdvaloracion;
    public TabPatrimd(String name)
      {
      super(name);
      pdejeraplic = new FieldDef("pdejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pddeclaran = new FieldDef("pddeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pdmuf = new FieldDef("pdmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pdtipocalculo = new FieldDef("pdtipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pdcontador = new FieldDef("pdcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pdepigrafe = new FieldDef("pdepigrafe",FieldDef.CHAR,7);
      pdclave = new FieldDef("pdclave",FieldDef.CHAR,1);
      pdrefencia = new FieldDef("pdrefencia",FieldDef.CHAR,20);
      pddescripcion = new FieldDef("pddescripcion",FieldDef.CHAR,50);
      pdvaloracion = new FieldDef("pdvaloracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pdejeraplic,
        pddeclaran,
        pdmuf,
        pdtipocalculo,
        pdcontador,
        pdepigrafe,
        pdclave,
        pdrefencia,
        pddescripcion,
        pdvaloracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {pdejeraplic,pddeclaran,pdmuf,pdtipocalculo,pdcontador };
      setDescription("Liquidacion patrimonio apartado  D: Bienes  exentos afectos actividades");
      setPrimaryKeys(arrayf);
      pdejeraplic.setDescription("Ejercicio aplicacion");
      pddeclaran.setDescription("Codigo de declarante");
      pdmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pdtipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pdcontador.setDescription("Numero de contador");
      pdepigrafe.setDescription("Epigrafe IAE");
      pdclave.setDescription("Clave:  [U]rbana [R]ustica o blanco");
      pdrefencia.setDescription("Referencia catastral (en caso inmuebles)");
      pddescripcion.setDescription("Descripcion del bien o derecho");
      pdvaloracion.setDescription("Valoracion del bien o derecho");
      }
    }
    
  public class TabPatrimf extends TableDef
    {
    // Campos
    public FieldDef pfejeraplic;
    public FieldDef pfdeclaran;
    public FieldDef pfmuf;
    public FieldDef pftipocalculo;
    public FieldDef pfcontador;
    public FieldDef pftipo;
    public FieldDef pfdescripcion;
    public FieldDef pfvaloracion;
    public TabPatrimf(String name)
      {
      super(name);
      pfejeraplic = new FieldDef("pfejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pfdeclaran = new FieldDef("pfdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pfmuf = new FieldDef("pfmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pftipocalculo = new FieldDef("pftipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pfcontador = new FieldDef("pfcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pftipo = new FieldDef("pftipo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      pfdescripcion = new FieldDef("pfdescripcion",FieldDef.CHAR,50);
      pfvaloracion = new FieldDef("pfvaloracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pfejeraplic,
        pfdeclaran,
        pfmuf,
        pftipocalculo,
        pfcontador,
        pftipo,
        pfdescripcion,
        pfvaloracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {pfejeraplic,pfdeclaran,pfmuf,pftipocalculo,pfcontador,pftipo };
      setDescription("Liquidacion patrimonio apartado  F1,F2 G1,G2 G3,G4");
      setPrimaryKeys(arrayf);
      pfejeraplic.setDescription("Ejercicio aplicacion");
      pfdeclaran.setDescription("Codigo de declarante");
      pfmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pftipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pfcontador.setDescription("Numero de contador");
      pftipo.setDescription("Subclave/Tipo:  [F1] Deuda publica [F2] Cuenta deposito [G1] FIM bolsa, [G2] Acciones bolsa, [G3] FIM no bolsa, [G4] Acciones no bolsa");
      pfdescripcion.setDescription("Descripcion / Nombre entidad");
      pfvaloracion.setDescription("Valor patrinonial");
      }
    }
    
  public class TabPatrimh extends TableDef
    {
    // Campos
    public FieldDef phejeraplic;
    public FieldDef phdeclaran;
    public FieldDef phmuf;
    public FieldDef phtipocalculo;
    public FieldDef phcontador;
    public FieldDef phtipo;
    public FieldDef phdescripcion;
    public FieldDef phvaloracion;
    public TabPatrimh(String name)
      {
      super(name);
      phejeraplic = new FieldDef("phejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      phdeclaran = new FieldDef("phdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      phmuf = new FieldDef("phmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      phtipocalculo = new FieldDef("phtipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      phcontador = new FieldDef("phcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      phtipo = new FieldDef("phtipo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      phdescripcion = new FieldDef("phdescripcion",FieldDef.CHAR,50);
      phvaloracion = new FieldDef("phvaloracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        phejeraplic,
        phdeclaran,
        phmuf,
        phtipocalculo,
        phcontador,
        phtipo,
        phdescripcion,
        phvaloracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {phejeraplic,phdeclaran,phmuf,phtipocalculo,phcontador,phtipo };
      setDescription("Liquidacion patrimonio apartado  H1: Valores exentos bolsa / H2: Valores exentos no bolsa");
      setPrimaryKeys(arrayf);
      phejeraplic.setDescription("Ejercicio aplicacion");
      phdeclaran.setDescription("Codigo de declarante");
      phmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      phtipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      phcontador.setDescription("Numero de contador");
      phtipo.setDescription("Subclave /Tipo:  [H1] Valores exentos cotizan en bolsa, [H2] Valores no exentos cotizan en bolsa");
      phdescripcion.setDescription("Descripcion / Nombre entidad");
      phvaloracion.setDescription("Valor patrinonial");
      }
    }
    
  public class TabPatrimi extends TableDef
    {
    // Campos
    public FieldDef piejeraplic;
    public FieldDef pideclaran;
    public FieldDef pimuf;
    public FieldDef pitipocalculo;
    public FieldDef picontador;
    public FieldDef pidescripcion;
    public FieldDef pivaloracion;
    public TabPatrimi(String name)
      {
      super(name);
      piejeraplic = new FieldDef("piejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pideclaran = new FieldDef("pideclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pimuf = new FieldDef("pimuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pitipocalculo = new FieldDef("pitipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      picontador = new FieldDef("picontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pidescripcion = new FieldDef("pidescripcion",FieldDef.CHAR,50);
      pivaloracion = new FieldDef("pivaloracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        piejeraplic,
        pideclaran,
        pimuf,
        pitipocalculo,
        picontador,
        pidescripcion,
        pivaloracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {piejeraplic,pideclaran,pimuf,pitipocalculo,picontador };
      setDescription("Liquidacion patrimonio apartado  I: Seguros de vida");
      setPrimaryKeys(arrayf);
      piejeraplic.setDescription("Ejercicio aplicacion");
      pideclaran.setDescription("Codigo de declarante");
      pimuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pitipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      picontador.setDescription("Numero de contador");
      pidescripcion.setDescription("Nombre entidad aseguradora");
      pivaloracion.setDescription("Valor patrinonial");
      }
    }
    
  public class TabPatrimj extends TableDef
    {
    // Campos
    public FieldDef pjejeraplic;
    public FieldDef pjdeclaran;
    public FieldDef pjmuf;
    public FieldDef pjtipocalculo;
    public FieldDef pjcontador;
    public FieldDef pjdescripcion;
    public FieldDef pjclave;
    public FieldDef pjanualidad;
    public FieldDef pjvaloracion;
    public TabPatrimj(String name)
      {
      super(name);
      pjejeraplic = new FieldDef("pjejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pjdeclaran = new FieldDef("pjdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pjmuf = new FieldDef("pjmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pjtipocalculo = new FieldDef("pjtipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pjcontador = new FieldDef("pjcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pjdescripcion = new FieldDef("pjdescripcion",FieldDef.CHAR,50);
      pjclave = new FieldDef("pjclave",FieldDef.CHAR,1);
      pjanualidad = new FieldDef("pjanualidad",FieldDef.FLOAT,6,0);
      pjvaloracion = new FieldDef("pjvaloracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pjejeraplic,
        pjdeclaran,
        pjmuf,
        pjtipocalculo,
        pjcontador,
        pjdescripcion,
        pjclave,
        pjanualidad,
        pjvaloracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {pjejeraplic,pjdeclaran,pjmuf,pjtipocalculo,pjcontador };
      setDescription("Liquidacion patrimonio apartado  J: Remtas temporales o vitalicias");
      setPrimaryKeys(arrayf);
      pjejeraplic.setDescription("Ejercicio aplicacion");
      pjdeclaran.setDescription("Codigo de declarante");
      pjmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pjtipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pjcontador.setDescription("Numero de contador");
      pjdescripcion.setDescription("Persona o entidad pagadora");
      pjclave.setDescription("Clave: [T] Renta temporal , [V] Renta vitalicia");
      pjanualidad.setDescription("Importe anualidad");
      pjvaloracion.setDescription("Valor patrinonial");
      }
    }
    
  public class TabPatrimk extends TableDef
    {
    // Campos
    public FieldDef pkejeraplic;
    public FieldDef pkdeclaran;
    public FieldDef pkmuf;
    public FieldDef pktipocalculo;
    public FieldDef pkcontador;
    public FieldDef pktipo;
    public FieldDef pkdescripcion;
    public FieldDef pkvaloracion;
    public TabPatrimk(String name)
      {
      super(name);
      pkejeraplic = new FieldDef("pkejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pkdeclaran = new FieldDef("pkdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pkmuf = new FieldDef("pkmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pktipocalculo = new FieldDef("pktipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pkcontador = new FieldDef("pkcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pktipo = new FieldDef("pktipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pkdescripcion = new FieldDef("pkdescripcion",FieldDef.CHAR,50);
      pkvaloracion = new FieldDef("pkvaloracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pkejeraplic,
        pkdeclaran,
        pkmuf,
        pktipocalculo,
        pkcontador,
        pktipo,
        pkdescripcion,
        pkvaloracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {pkejeraplic,pkdeclaran,pkmuf,pktipocalculo,pkcontador,pktipo };
      setDescription("Liquidacion patrimonio apartado  K: Vehiculos, joyas, embarcaciones.  L: Objetos de arte y antiguedades");
      setPrimaryKeys(arrayf);
      pkejeraplic.setDescription("Ejercicio aplicacion");
      pkdeclaran.setDescription("Codigo de declarante");
      pkmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pktipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pkcontador.setDescription("Numero de contador");
      pktipo.setDescription("Subclave /Tipo:  [K] Vehiculos, joyas, embarcaciones... [L] Objetos de arte y antiguedades");
      pkdescripcion.setDescription("Descripcion");
      pkvaloracion.setDescription("Valor patrinonial");
      }
    }
    
  public class TabPatrimm extends TableDef
    {
    // Campos
    public FieldDef pmejeraplic;
    public FieldDef pmdeclaran;
    public FieldDef pmmuf;
    public FieldDef pmtipocalculo;
    public FieldDef pmcontador;
    public FieldDef pmclave;
    public FieldDef pmrefencia;
    public FieldDef pmsituacion;
    public FieldDef pmvalbien;
    public FieldDef pmvalderecho;
    public TabPatrimm(String name)
      {
      super(name);
      pmejeraplic = new FieldDef("pmejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pmdeclaran = new FieldDef("pmdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pmmuf = new FieldDef("pmmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pmtipocalculo = new FieldDef("pmtipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pmcontador = new FieldDef("pmcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pmclave = new FieldDef("pmclave",FieldDef.CHAR,1);
      pmrefencia = new FieldDef("pmrefencia",FieldDef.CHAR,20);
      pmsituacion = new FieldDef("pmsituacion",FieldDef.CHAR,50);
      pmvalbien = new FieldDef("pmvalbien",FieldDef.FLOAT,6,0);
      pmvalderecho = new FieldDef("pmvalderecho",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pmejeraplic,
        pmdeclaran,
        pmmuf,
        pmtipocalculo,
        pmcontador,
        pmclave,
        pmrefencia,
        pmsituacion,
        pmvalbien,
        pmvalderecho        
        };
      setColumns(array);
      FieldDef arrayf[] = {pmejeraplic,pmdeclaran,pmmuf,pmtipocalculo,pmcontador };
      setDescription("Liquidacion patrimonio apartado  M: Derechos reales de uso y disfrute");
      setPrimaryKeys(arrayf);
      pmejeraplic.setDescription("Ejercicio aplicacion");
      pmdeclaran.setDescription("Codigo de declarante");
      pmmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pmtipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pmcontador.setDescription("Numero de contador");
      pmclave.setDescription("Clave:  [U]sufructo, [O]tros derechos, [D]erechos de aprovechamiento por turno de inmuebles, o blanco");
      pmrefencia.setDescription("Referencia catastral");
      pmsituacion.setDescription("Descripcion / Situacion del bien");
      pmvalbien.setDescription("Valor del bien");
      pmvalderecho.setDescription("Valor del derecho");
      }
    }
    
  public class TabPatrimn extends TableDef
    {
    // Campos
    public FieldDef pnejeraplic;
    public FieldDef pndeclaran;
    public FieldDef pnmuf;
    public FieldDef pntipocalculo;
    public FieldDef pncontador;
    public FieldDef pntipo;
    public FieldDef pndescripcion;
    public FieldDef pnvaloracion;
    public TabPatrimn(String name)
      {
      super(name);
      pnejeraplic = new FieldDef("pnejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pndeclaran = new FieldDef("pndeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pnmuf = new FieldDef("pnmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pntipocalculo = new FieldDef("pntipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pncontador = new FieldDef("pncontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pntipo = new FieldDef("pntipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pndescripcion = new FieldDef("pndescripcion",FieldDef.CHAR,50);
      pnvaloracion = new FieldDef("pnvaloracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pnejeraplic,
        pndeclaran,
        pnmuf,
        pntipocalculo,
        pncontador,
        pntipo,
        pndescripcion,
        pnvaloracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {pnejeraplic,pndeclaran,pnmuf,pntipocalculo,pncontador,pntipo };
      setDescription("Liquidacion patrimonio apart. N:Concesiones administrativas, O:Prop. intelectual o indrustrial  P:Opciones contractuales Q:Demas bienes");
      setPrimaryKeys(arrayf);
      pnejeraplic.setDescription("Ejercicio aplicacion");
      pndeclaran.setDescription("Codigo de declarante");
      pnmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pntipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pncontador.setDescription("Numero de contador");
      pntipo.setDescription("Tipo: [N] Concesiones administrativas, [O] Propiedad intelectual o industrial, [P] Opciones contractuales, [Q] Demas bienes");
      pndescripcion.setDescription("Descripcion");
      pnvaloracion.setDescription("Valor patrinonial");
      }
    }
    
  public class TabPatrimde extends TableDef
    {
    // Campos
    public FieldDef pdeejeraplic;
    public FieldDef pdedeclaran;
    public FieldDef pdemuf;
    public FieldDef pdetipocalculo;
    public FieldDef pdecontador;
    public FieldDef pdedescripcion;
    public FieldDef pdevaloracion;
    public TabPatrimde(String name)
      {
      super(name);
      pdeejeraplic = new FieldDef("pdeejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pdedeclaran = new FieldDef("pdedeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pdemuf = new FieldDef("pdemuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pdetipocalculo = new FieldDef("pdetipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pdecontador = new FieldDef("pdecontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pdedescripcion = new FieldDef("pdedescripcion",FieldDef.CHAR,50);
      pdevaloracion = new FieldDef("pdevaloracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pdeejeraplic,
        pdedeclaran,
        pdemuf,
        pdetipocalculo,
        pdecontador,
        pdedescripcion,
        pdevaloracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {pdeejeraplic,pdedeclaran,pdemuf,pdetipocalculo,pdecontador };
      setDescription("Liquidacion patrimonio apartado 2 Deudas deducibles");
      setPrimaryKeys(arrayf);
      pdeejeraplic.setDescription("Ejercicio aplicacion");
      pdedeclaran.setDescription("Codigo de declarante");
      pdemuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pdetipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pdecontador.setDescription("Numero de contador");
      pdedescripcion.setDescription("Descripcion");
      pdevaloracion.setDescription("Valor patrinonial");
      }
    }
    
  public class TabPatrime extends TableDef
    {
    // Campos
    public FieldDef peejeraplic;
    public FieldDef pedeclaran;
    public FieldDef pemuf;
    public FieldDef petipocalculo;
    public FieldDef pecontador;
    public FieldDef pebanco;
    public FieldDef pecta;
    public FieldDef pevaloracion;
    public TabPatrime(String name)
      {
      super(name);
      peejeraplic = new FieldDef("peejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pedeclaran = new FieldDef("pedeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pemuf = new FieldDef("pemuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      petipocalculo = new FieldDef("petipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pecontador = new FieldDef("pecontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pebanco = new FieldDef("pebanco",FieldDef.CHAR,50);
      pecta = new FieldDef("pecta",FieldDef.CHAR,20);
      pevaloracion = new FieldDef("pevaloracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        peejeraplic,
        pedeclaran,
        pemuf,
        petipocalculo,
        pecontador,
        pebanco,
        pecta,
        pevaloracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {peejeraplic,pedeclaran,pemuf,petipocalculo,pecontador };
      setDescription("Liquidacion patrimonio apartado  E: Depositos en cuentas ctes.");
      setPrimaryKeys(arrayf);
      peejeraplic.setDescription("Ejercicio aplicacion");
      pedeclaran.setDescription("Codigo de declarante");
      pemuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      petipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pecontador.setDescription("Numero de contador");
      pebanco.setDescription("Nombre entidad");
      pecta.setDescription("Numero cuenta");
      pevaloracion.setDescription("Valora patrimonial");
      }
    }
    
  public class TabPatrimc1 extends TableDef
    {
    // Campos
    public FieldDef pc1ejeraplic;
    public FieldDef pc1declaran;
    public FieldDef pc1muf;
    public FieldDef pc1tipocalculo;
    public FieldDef pc1contador;
    public FieldDef pc1epigrafe;
    public FieldDef pc1domicilio;
    public FieldDef pc1descripcion;
    public FieldDef pc1valoracion;
    public TabPatrimc1(String name)
      {
      super(name);
      pc1ejeraplic = new FieldDef("pc1ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pc1declaran = new FieldDef("pc1declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pc1muf = new FieldDef("pc1muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pc1tipocalculo = new FieldDef("pc1tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pc1contador = new FieldDef("pc1contador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pc1epigrafe = new FieldDef("pc1epigrafe",FieldDef.CHAR,7);
      pc1domicilio = new FieldDef("pc1domicilio",FieldDef.CHAR,50);
      pc1descripcion = new FieldDef("pc1descripcion",FieldDef.CHAR,50);
      pc1valoracion = new FieldDef("pc1valoracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pc1ejeraplic,
        pc1declaran,
        pc1muf,
        pc1tipocalculo,
        pc1contador,
        pc1epigrafe,
        pc1domicilio,
        pc1descripcion,
        pc1valoracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {pc1ejeraplic,pc1declaran,pc1muf,pc1tipocalculo,pc1contador };
      setDescription("Liquidacion patrimonio apartado  C1: Bienes no exentos afectos actividades excepto inmuebles");
      setPrimaryKeys(arrayf);
      pc1ejeraplic.setDescription("Ejercicio aplicacion");
      pc1declaran.setDescription("Codigo de declarante");
      pc1muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pc1tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      pc1contador.setDescription("Numero de contador");
      pc1epigrafe.setDescription("Epigrafe IAE");
      pc1domicilio.setDescription("Domicilio de la actividad");
      pc1descripcion.setDescription("Descripcion del bien o derecho");
      pc1valoracion.setDescription("Valoracion del bien o derecho");
      }
    }
    
  public class TabConsumodes extends TableDef
    {
    // Campos
    public FieldDef codejeraplic;
    public FieldDef coddeclaran;
    public FieldDef codmuf;
    public FieldDef codtipocalculo;
    public FieldDef codtipo;
    public FieldDef codnroacumul;
    public FieldDef codcontador;
    public FieldDef coddescripcion;
    public FieldDef codtitulares;
    public FieldDef codpropiedad;
    public FieldDef codentrades;
    public FieldDef codsalidas;
    public TabConsumodes(String name)
      {
      super(name);
      codejeraplic = new FieldDef("codejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      coddeclaran = new FieldDef("coddeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      codmuf = new FieldDef("codmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      codtipocalculo = new FieldDef("codtipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      codtipo = new FieldDef("codtipo",FieldDef.CHAR,1);
      codnroacumul = new FieldDef("codnroacumul",FieldDef.INTEGER,0);
      codcontador = new FieldDef("codcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      coddescripcion = new FieldDef("coddescripcion",FieldDef.CHAR,50);
      codtitulares = new FieldDef("codtitulares",FieldDef.CHAR,6);
      codpropiedad = new FieldDef("codpropiedad",FieldDef.FLOAT,6,0);
      codentrades = new FieldDef("codentrades",FieldDef.FLOAT,6,0);
      codsalidas = new FieldDef("codsalidas",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        codejeraplic,
        coddeclaran,
        codmuf,
        codtipocalculo,
        codtipo,
        codnroacumul,
        codcontador,
        coddescripcion,
        codtitulares,
        codpropiedad,
        codentrades,
        codsalidas        
        };
      setColumns(array);
      FieldDef arrayf[] = {codejeraplic,coddeclaran,codmuf,codtipocalculo,codtipo,codnroacumul,codcontador };
      setDescription("CONSUMO DESGLOSE");
      setPrimaryKeys(arrayf);
      codejeraplic.setDescription("Ejercicio aplicacion");
      coddeclaran.setDescription("Codigo de declarante");
      codmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      codtipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      codtipo.setDescription("Tipo Resumen: [L] Renta Liquida  [P] Variacion patrimonial");
      codnroacumul.setDescription("Numero de acumulado");
      codcontador.setDescription("Numero de contador");
      coddescripcion.setDescription("Descripcion");
      codtitulares.setDescription("Titulares");
      codpropiedad.setDescription("Porcentaje Propiedad");
      codentrades.setDescription("Entrades");
      codsalidas.setDescription("Salidas");
      }
    }
    
  public class TabLiquidaconsum2 extends TableDef
    {
    // Campos
    public FieldDef lco2ejeraplic;
    public FieldDef lco2declaran;
    public FieldDef lco2muf;
    public FieldDef lco2tipocalculo;
    public FieldDef lco2eurbana;
    public FieldDef lco2surbana;
    public FieldDef lco2erustica;
    public FieldDef lco2srustica;
    public FieldDef lco2eactivida;
    public FieldDef lco2sactivida;
    public FieldDef lco2ectacte;
    public FieldDef lco2sctacte;
    public FieldDef lco2edepos;
    public FieldDef lco2sdepos;
    public FieldDef lco2eseg;
    public FieldDef lco2sseg;
    public FieldDef lco2ebolsa;
    public FieldDef lco2sbolsa;
    public FieldDef lco2enobolsa;
    public FieldDef lco2snobolsa;
    public FieldDef lco2edeudapub;
    public FieldDef lco2sdeudapub;
    public FieldDef lco2eotras;
    public FieldDef lco2sotras;
    public FieldDef lco2efimbolsa;
    public FieldDef lco2sfimbolsa;
    public FieldDef lco2efimnobolsa;
    public FieldDef lco2sfimnobolsa;
    public FieldDef lco2edemas;
    public FieldDef lco2sdemas;
    public FieldDef lco2edeuda;
    public FieldDef lco2sdeuda;
    public FieldDef lco2efpe;
    public FieldDef lco2sfpe;
    public FieldDef lcototalvp;
    public TabLiquidaconsum2(String name)
      {
      super(name);
      lco2ejeraplic = new FieldDef("lco2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lco2declaran = new FieldDef("lco2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lco2muf = new FieldDef("lco2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lco2tipocalculo = new FieldDef("lco2tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lco2eurbana = new FieldDef("lco2eurbana",FieldDef.FLOAT,6,0);
      lco2surbana = new FieldDef("lco2surbana",FieldDef.FLOAT,6,0);
      lco2erustica = new FieldDef("lco2erustica",FieldDef.FLOAT,6,0);
      lco2srustica = new FieldDef("lco2srustica",FieldDef.FLOAT,6,0);
      lco2eactivida = new FieldDef("lco2eactivida",FieldDef.FLOAT,6,0);
      lco2sactivida = new FieldDef("lco2sactivida",FieldDef.FLOAT,6,0);
      lco2ectacte = new FieldDef("lco2ectacte",FieldDef.FLOAT,6,0);
      lco2sctacte = new FieldDef("lco2sctacte",FieldDef.FLOAT,6,0);
      lco2edepos = new FieldDef("lco2edepos",FieldDef.FLOAT,6,0);
      lco2sdepos = new FieldDef("lco2sdepos",FieldDef.FLOAT,6,0);
      lco2eseg = new FieldDef("lco2eseg",FieldDef.FLOAT,6,0);
      lco2sseg = new FieldDef("lco2sseg",FieldDef.FLOAT,6,0);
      lco2ebolsa = new FieldDef("lco2ebolsa",FieldDef.FLOAT,6,0);
      lco2sbolsa = new FieldDef("lco2sbolsa",FieldDef.FLOAT,6,0);
      lco2enobolsa = new FieldDef("lco2enobolsa",FieldDef.FLOAT,6,0);
      lco2snobolsa = new FieldDef("lco2snobolsa",FieldDef.FLOAT,6,0);
      lco2edeudapub = new FieldDef("lco2edeudapub",FieldDef.FLOAT,6,0);
      lco2sdeudapub = new FieldDef("lco2sdeudapub",FieldDef.FLOAT,6,0);
      lco2eotras = new FieldDef("lco2eotras",FieldDef.FLOAT,6,0);
      lco2sotras = new FieldDef("lco2sotras",FieldDef.FLOAT,6,0);
      lco2efimbolsa = new FieldDef("lco2efimbolsa",FieldDef.FLOAT,6,0);
      lco2sfimbolsa = new FieldDef("lco2sfimbolsa",FieldDef.FLOAT,6,0);
      lco2efimnobolsa = new FieldDef("lco2efimnobolsa",FieldDef.FLOAT,6,0);
      lco2sfimnobolsa = new FieldDef("lco2sfimnobolsa",FieldDef.FLOAT,6,0);
      lco2edemas = new FieldDef("lco2edemas",FieldDef.FLOAT,6,0);
      lco2sdemas = new FieldDef("lco2sdemas",FieldDef.FLOAT,6,0);
      lco2edeuda = new FieldDef("lco2edeuda",FieldDef.FLOAT,6,0);
      lco2sdeuda = new FieldDef("lco2sdeuda",FieldDef.FLOAT,6,0);
      lco2efpe = new FieldDef("lco2efpe",FieldDef.FLOAT,6,0);
      lco2sfpe = new FieldDef("lco2sfpe",FieldDef.FLOAT,6,0);
      lcototalvp = new FieldDef("lcototalvp",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lco2ejeraplic,
        lco2declaran,
        lco2muf,
        lco2tipocalculo,
        lco2eurbana,
        lco2surbana,
        lco2erustica,
        lco2srustica,
        lco2eactivida,
        lco2sactivida,
        lco2ectacte,
        lco2sctacte,
        lco2edepos,
        lco2sdepos,
        lco2eseg,
        lco2sseg,
        lco2ebolsa,
        lco2sbolsa,
        lco2enobolsa,
        lco2snobolsa,
        lco2edeudapub,
        lco2sdeudapub,
        lco2eotras,
        lco2sotras,
        lco2efimbolsa,
        lco2sfimbolsa,
        lco2efimnobolsa,
        lco2sfimnobolsa,
        lco2edemas,
        lco2sdemas,
        lco2edeuda,
        lco2sdeuda,
        lco2efpe,
        lco2sfpe,
        lcototalvp        
        };
      setColumns(array);
      FieldDef arrayf[] = {lco2ejeraplic,lco2declaran,lco2muf,lco2tipocalculo };
      setDescription("Liquidacion Consumo: Variaciones patrimoniales");
      setPrimaryKeys(arrayf);
      lco2ejeraplic.setDescription("Ejercicio aplicacion");
      lco2declaran.setDescription("Codigo de declarante");
      lco2muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lco2tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lco2eurbana.setDescription("Entrades: Fincas Urbanas");
      lco2surbana.setDescription("Salidas:  Fincas Urbanas");
      lco2erustica.setDescription("Entrades: Fincas Rusticas");
      lco2srustica.setDescription("Salidas:  Fincas Rusticas");
      lco2eactivida.setDescription("Entrades: Activos Empresariales");
      lco2sactivida.setDescription("Salidas:  Activos Empresariales");
      lco2ectacte.setDescription("Entrades: Depositos Cuentas Corrientes");
      lco2sctacte.setDescription("Salidas:  Depositos Cuentas Corrientes");
      lco2edepos.setDescription("Entrades: Certificados Depositos");
      lco2sdepos.setDescription("Salidas:  Certificados Depositos");
      lco2eseg.setDescription("Entrades: Seguros de vida");
      lco2sseg.setDescription("Salidas:  Seguros de vida");
      lco2ebolsa.setDescription("Entrades: Valores mobiliarios con cotizacion");
      lco2sbolsa.setDescription("Salidas:  Valores mobiliarios con cotizacion");
      lco2enobolsa.setDescription("Entrades: Valores mobiliarios sin cotizacion");
      lco2snobolsa.setDescription("Salidas:  Valores mobiliarios sin cotizacion");
      lco2edeudapub.setDescription("Entrades: Deuda Publica");
      lco2sdeudapub.setDescription("Salidas:  Deuda Publica");
      lco2eotras.setDescription("Entradas: Otras obligaciones");
      lco2sotras.setDescription("Salidas:  Otras obligaciones");
      lco2efimbolsa.setDescription("Entrades: Participaciones F.I.M. Bolsa");
      lco2sfimbolsa.setDescription("Salidas:  Participaciones F.I.M. Bolsa");
      lco2efimnobolsa.setDescription("Entrades: Participaciones F.I.M. no Bolsa");
      lco2sfimnobolsa.setDescription("Salidas:  Participaciones F.I.M. no Bolsa");
      lco2edemas.setDescription("Entrades: Demas Bienes y Derechos");
      lco2sdemas.setDescription("Salidas:  Demas Bienes y Derechos");
      lco2edeuda.setDescription("Entrades: Deudas");
      lco2sdeuda.setDescription("Salidas:  Deudas");
      lco2efpe.setDescription("Entrades: Fondos de Pension");
      lco2sfpe.setDescription("Salidas:  Fondos de Pension");
      lcototalvp.setDescription("Total Variacio Patrimonial");
      }
    }
    
  public class TabLiquidaconsum extends TableDef
    {
    // Campos
    public FieldDef lcoejeraplic;
    public FieldDef lcodeclaran;
    public FieldDef lcomuf;
    public FieldDef lcotipocalculo;
    public FieldDef lcoetrab;
    public FieldDef lcostrab;
    public FieldDef lcoemobil;
    public FieldDef lcosmobil;
    public FieldDef lcoeinmob;
    public FieldDef lcosinmob;
    public FieldDef lcoeactp;
    public FieldDef lcosactp;
    public FieldDef lcoeacte;
    public FieldDef lcosacte;
    public FieldDef lcoeute;
    public FieldDef lcosute;
    public FieldDef lcoeanual;
    public FieldDef lcosanual;
    public FieldDef lcoegano;
    public FieldDef lcosgano;
    public FieldDef lcoeganl;
    public FieldDef lcosganl;
    public FieldDef lcoepagos;
    public FieldDef lcospagos;
    public FieldDef lcoeotros;
    public FieldDef lcosotros;
    public FieldDef lcototalrl;
    public TabLiquidaconsum(String name)
      {
      super(name);
      lcoejeraplic = new FieldDef("lcoejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lcodeclaran = new FieldDef("lcodeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lcomuf = new FieldDef("lcomuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lcotipocalculo = new FieldDef("lcotipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lcoetrab = new FieldDef("lcoetrab",FieldDef.FLOAT,6,0);
      lcostrab = new FieldDef("lcostrab",FieldDef.FLOAT,6,0);
      lcoemobil = new FieldDef("lcoemobil",FieldDef.FLOAT,6,0);
      lcosmobil = new FieldDef("lcosmobil",FieldDef.FLOAT,6,0);
      lcoeinmob = new FieldDef("lcoeinmob",FieldDef.FLOAT,6,0);
      lcosinmob = new FieldDef("lcosinmob",FieldDef.FLOAT,6,0);
      lcoeactp = new FieldDef("lcoeactp",FieldDef.FLOAT,6,0);
      lcosactp = new FieldDef("lcosactp",FieldDef.FLOAT,6,0);
      lcoeacte = new FieldDef("lcoeacte",FieldDef.FLOAT,6,0);
      lcosacte = new FieldDef("lcosacte",FieldDef.FLOAT,6,0);
      lcoeute = new FieldDef("lcoeute",FieldDef.FLOAT,6,0);
      lcosute = new FieldDef("lcosute",FieldDef.FLOAT,6,0);
      lcoeanual = new FieldDef("lcoeanual",FieldDef.FLOAT,6,0);
      lcosanual = new FieldDef("lcosanual",FieldDef.FLOAT,6,0);
      lcoegano = new FieldDef("lcoegano",FieldDef.FLOAT,6,0);
      lcosgano = new FieldDef("lcosgano",FieldDef.FLOAT,6,0);
      lcoeganl = new FieldDef("lcoeganl",FieldDef.FLOAT,6,0);
      lcosganl = new FieldDef("lcosganl",FieldDef.FLOAT,6,0);
      lcoepagos = new FieldDef("lcoepagos",FieldDef.FLOAT,6,0);
      lcospagos = new FieldDef("lcospagos",FieldDef.FLOAT,6,0);
      lcoeotros = new FieldDef("lcoeotros",FieldDef.FLOAT,6,0);
      lcosotros = new FieldDef("lcosotros",FieldDef.FLOAT,6,0);
      lcototalrl = new FieldDef("lcototalrl",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lcoejeraplic,
        lcodeclaran,
        lcomuf,
        lcotipocalculo,
        lcoetrab,
        lcostrab,
        lcoemobil,
        lcosmobil,
        lcoeinmob,
        lcosinmob,
        lcoeactp,
        lcosactp,
        lcoeacte,
        lcosacte,
        lcoeute,
        lcosute,
        lcoeanual,
        lcosanual,
        lcoegano,
        lcosgano,
        lcoeganl,
        lcosganl,
        lcoepagos,
        lcospagos,
        lcoeotros,
        lcosotros,
        lcototalrl        
        };
      setColumns(array);
      FieldDef arrayf[] = {lcoejeraplic,lcodeclaran,lcomuf,lcotipocalculo };
      setDescription("Liquidacion Consumo: Renta Liquida");
      setPrimaryKeys(arrayf);
      lcoejeraplic.setDescription("Ejercicio aplicacion");
      lcodeclaran.setDescription("Codigo de declarante");
      lcomuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lcotipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lcoetrab.setDescription("Entradas: Rentas Trabajo Personal");
      lcostrab.setDescription("Salidas:  Rentas Trabajo Personal");
      lcoemobil.setDescription("Entradas: Capital Mobiliario");
      lcosmobil.setDescription("Salidas:  Capital Mobiliario");
      lcoeinmob.setDescription("Entradas: Capital inmobiliario");
      lcosinmob.setDescription("Salidas:  Capital inmobiliario");
      lcoeactp.setDescription("Entradas: Actividades Profesionales-Artistica");
      lcosactp.setDescription("Salidas:  Actividades Profesionales-Artistica");
      lcoeacte.setDescription("Entradas: Actividades Empresariales");
      lcosacte.setDescription("Salidas:  Actividades Empresariales");
      lcoeute.setDescription("Entradas: Rentas UTE / Derechos imagen");
      lcosute.setDescription("Salidas:  Rentas UTE / Derechos imagen");
      lcoeanual.setDescription("Entradas: Anualidades Alimentos");
      lcosanual.setDescription("Salidas:  Anualidades Alimentos");
      lcoegano.setDescription("Entradas: Ganancias / Perdidas Onerosas");
      lcosgano.setDescription("Salidas:  Ganancias / Perdidas Onerosas");
      lcoeganl.setDescription("Entradas: Ganancias / Perdidas lucrativas");
      lcosganl.setDescription("Salidas:  Ganancias / Perdidas lucrativas");
      lcoepagos.setDescription("Entradas:  Pagos a Cuenta y Pago Renta");
      lcospagos.setDescription("Salidas:   Pagos a Cuenta y Pago Renta");
      lcoeotros.setDescription("Entrades:  Otros varios");
      lcosotros.setDescription("Salidas:   Otros varios");
      lcototalrl.setDescription("Total Renta Liquida");
      }
    }
    
  public class TabEscalascab extends TableDef
    {
    // Campos
    public FieldDef escejerfiscal;
    public FieldDef esctipo;
    public FieldDef escautonomia;
    public FieldDef escexento;
    public FieldDef escex_minusval1;
    public FieldDef escminusvalia1;
    public FieldDef escex_minusval2;
    public FieldDef escminusvalial2;
    public FieldDef escex_minusval3;
    public FieldDef escminusvalial3;
    public FieldDef esctipominusv1;
    public FieldDef esctipominusv2;
    public FieldDef esctipominusv3;
    public TabEscalascab(String name)
      {
      super(name);
      escejerfiscal = new FieldDef("escejerfiscal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      esctipo = new FieldDef("esctipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      escautonomia = new FieldDef("escautonomia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      escexento = new FieldDef("escexento",FieldDef.FLOAT,6,0);
      escex_minusval1 = new FieldDef("escex_minusval1",FieldDef.FLOAT,6,0);
      escminusvalia1 = new FieldDef("escminusvalia1",FieldDef.FLOAT,6,0);
      escex_minusval2 = new FieldDef("escex_minusval2",FieldDef.FLOAT,6,0);
      escminusvalial2 = new FieldDef("escminusvalial2",FieldDef.FLOAT,6,0);
      escex_minusval3 = new FieldDef("escex_minusval3",FieldDef.FLOAT,6,0);
      escminusvalial3 = new FieldDef("escminusvalial3",FieldDef.FLOAT,6,0);
      esctipominusv1 = new FieldDef("esctipominusv1",FieldDef.CHAR,1);
      esctipominusv2 = new FieldDef("esctipominusv2",FieldDef.CHAR,1);
      esctipominusv3 = new FieldDef("esctipominusv3",FieldDef.CHAR,1);
      FieldDef array[] = {
        escejerfiscal,
        esctipo,
        escautonomia,
        escexento,
        escex_minusval1,
        escminusvalia1,
        escex_minusval2,
        escminusvalial2,
        escex_minusval3,
        escminusvalial3,
        esctipominusv1,
        esctipominusv2,
        esctipominusv3        
        };
      setColumns(array);
      FieldDef arrayf[] = {escejerfiscal,esctipo,escautonomia };
      setDescription("Cabecera escalas de renta y patrimonio");
      setPrimaryKeys(arrayf);
      escejerfiscal.setDescription("Ejercicio fiscal");
      esctipo.setDescription("[R]enta o [P]atrimonio");
      escautonomia.setDescription("Autonomia");
      escexento.setDescription("Minimo Exento");
      escex_minusval1.setDescription("Minimo Exento 1 minusvalido");
      escminusvalia1.setDescription("% discapacidad 1");
      escex_minusval2.setDescription("Minimo Exento 2 minusvalido");
      escminusvalial2.setDescription("% discapacidad 2");
      escex_minusval3.setDescription("Minimo Exento 3 minusvalido");
      escminusvalial3.setDescription("% discapacidad 3");
      esctipominusv1.setDescription("Tipo minusvalia discapacidad 1");
      esctipominusv2.setDescription("Tipo minusvalia discapacidad 2");
      esctipominusv3.setDescription("Tipo minusvalia discapacidad 3");
      }
    }
    
  public class TabAeattrabajo extends TableDef
    {
    // Campos
    public FieldDef atrejeraplic;
    public FieldDef atrdeclaran;
    public FieldDef atrmuf;
    public FieldDef atrcontador;
    public FieldDef atrincorporar;
    public FieldDef atrdeclaracion;
    public FieldDef atrclase;
    public FieldDef atrsubclase;
    public FieldDef atrnombpagador;
    public FieldDef atrnif;
    public FieldDef atrrendimiento;
    public FieldDef atrretencion;
    public FieldDef atrvaloracion;
    public FieldDef atringracuenta;
    public FieldDef atringctarep;
    public FieldDef atrgastos;
    public FieldDef atrredirregular;
    public FieldDef atrredcopaameri;
    public FieldDef atrcontvinculad;
    public FieldDef atrpromotor;
    public TabAeattrabajo(String name)
      {
      super(name);
      atrejeraplic = new FieldDef("atrejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      atrdeclaran = new FieldDef("atrdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      atrmuf = new FieldDef("atrmuf",FieldDef.CHAR,1);
      atrcontador = new FieldDef("atrcontador",FieldDef.INTEGER,0);
      atrincorporar = new FieldDef("atrincorporar",FieldDef.CHAR,1);
      atrdeclaracion = new FieldDef("atrdeclaracion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      atrclase = new FieldDef("atrclase",FieldDef.CHAR,3);
      atrsubclase = new FieldDef("atrsubclase",FieldDef.CHAR,3);
      atrnombpagador = new FieldDef("atrnombpagador",FieldDef.CHAR,40);
      atrnif = new FieldDef("atrnif",FieldDef.CHAR,9);
      atrrendimiento = new FieldDef("atrrendimiento",FieldDef.FLOAT,6,0);
      atrretencion = new FieldDef("atrretencion",FieldDef.FLOAT,6,0);
      atrvaloracion = new FieldDef("atrvaloracion",FieldDef.FLOAT,6,0);
      atringracuenta = new FieldDef("atringracuenta",FieldDef.FLOAT,6,0);
      atringctarep = new FieldDef("atringctarep",FieldDef.FLOAT,6,0);
      atrgastos = new FieldDef("atrgastos",FieldDef.FLOAT,6,0);
      atrredirregular = new FieldDef("atrredirregular",FieldDef.FLOAT,6,0);
      atrredcopaameri = new FieldDef("atrredcopaameri",FieldDef.FLOAT,6,0);
      atrcontvinculad = new FieldDef("atrcontvinculad",FieldDef.INTEGER,0);
      atrpromotor = new FieldDef("atrpromotor",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        atrejeraplic,
        atrdeclaran,
        atrmuf,
        atrcontador,
        atrincorporar,
        atrdeclaracion,
        atrclase,
        atrsubclase,
        atrnombpagador,
        atrnif,
        atrrendimiento,
        atrretencion,
        atrvaloracion,
        atringracuenta,
        atringctarep,
        atrgastos,
        atrredirregular,
        atrredcopaameri,
        atrcontvinculad,
        atrpromotor        
        };
      setColumns(array);
      FieldDef arrayf[] = {atrejeraplic,atrdeclaran,atrmuf,atrcontador };
      setDescription("Datos fiscales: trabajo personal");
      setPrimaryKeys(arrayf);
      atrejeraplic.setDescription("Ejercicio aplicacion");
      atrdeclaran.setDescription("CODIGO DE DECLARANTE");
      atrmuf.setDescription("MIEMBRO UNIDAD FAMILIAR");
      atrcontador.setDescription("CONTADOR");
      atrincorporar.setDescription("Incorporar a renta");
      atrdeclaracion.setDescription("Codigo declaracion");
      atrclase.setDescription("Clase de retribucion");
      atrsubclase.setDescription("Subclase");
      atrnombpagador.setDescription("Nombre del pagador");
      atrnif.setDescription("NIF del pagador");
      atrrendimiento.setDescription("Rendimiento");
      atrretencion.setDescription("Retenciones");
      atrvaloracion.setDescription("Valoracion en especie");
      atringracuenta.setDescription("Ingreso a cuenta");
      atringctarep.setDescription("Ingreso a Cuenta Repercutido");
      atrgastos.setDescription("Gastos deducibles");
      atrredirregular.setDescription("Reduccion irregular");
      atrredcopaameri.setDescription("Reduccion copa America");
      atrcontvinculad.setDescription("Contador relacionado aplicacion GEYCE");
      atrpromotor.setDescription("aportacion promotor");
      }
    }
    
  public class TabAeatatribucion extends TableDef
    {
    // Campos
    public FieldDef aimejeraplic;
    public FieldDef aimdeclaran;
    public FieldDef aimmuf;
    public FieldDef aimcontador;
    public FieldDef aimincorporar;
    public FieldDef aimdeclaracion;
    public FieldDef aimnombre;
    public FieldDef aimcif;
    public FieldDef aimporcparticip;
    public FieldDef aimaplicprorcen;
    public FieldDef aimrdtocapinmob;
    public FieldDef aimcapinmredire;
    public FieldDef aimcapinmredvda;
    public FieldDef aimrdtocompinmo;
    public FieldDef aimrdtomobilgra;
    public FieldDef aimmobilgralred;
    public FieldDef aimrdtocompmobg;
    public FieldDef aimrdtomobilaho;
    public FieldDef aimmobilahorred;
    public FieldDef aimrdtocompmoba;
    public FieldDef aimrdtomobdivid;
    public FieldDef aimrdtoactecopr;
    public FieldDef aimreducactecon;
    public FieldDef aimrdtoactivida;
    public FieldDef aimreduempleo;
    public FieldDef aimsalari;
    public FieldDef aimgananbasgral;
    public FieldDef aimperdbasegral;
    public FieldDef aimgananbasahor;
    public FieldDef aimperdbasahor;
    public FieldDef aimretenciones;
    public FieldDef aimpagofracc;
    public FieldDef aimimpredempleo;
    public FieldDef aimrdtoactiveo;
    public FieldDef aimcontvinculad;
    public TabAeatatribucion(String name)
      {
      super(name);
      aimejeraplic = new FieldDef("aimejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aimdeclaran = new FieldDef("aimdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      aimmuf = new FieldDef("aimmuf",FieldDef.CHAR,1);
      aimcontador = new FieldDef("aimcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aimincorporar = new FieldDef("aimincorporar",FieldDef.CHAR,1);
      aimdeclaracion = new FieldDef("aimdeclaracion",FieldDef.INTEGER,0);
      aimnombre = new FieldDef("aimnombre",FieldDef.CHAR,35);
      aimcif = new FieldDef("aimcif",FieldDef.CHAR,15);
      aimporcparticip = new FieldDef("aimporcparticip",FieldDef.FLOAT,6,0);
      aimaplicprorcen = new FieldDef("aimaplicprorcen",FieldDef.CHAR,1);
      aimrdtocapinmob = new FieldDef("aimrdtocapinmob",FieldDef.FLOAT,6,0);
      aimcapinmredire = new FieldDef("aimcapinmredire",FieldDef.FLOAT,6,0);
      aimcapinmredvda = new FieldDef("aimcapinmredvda",FieldDef.FLOAT,6,0);
      aimrdtocompinmo = new FieldDef("aimrdtocompinmo",FieldDef.FLOAT,6,0);
      aimrdtomobilgra = new FieldDef("aimrdtomobilgra",FieldDef.FLOAT,6,0);
      aimmobilgralred = new FieldDef("aimmobilgralred",FieldDef.FLOAT,6,0);
      aimrdtocompmobg = new FieldDef("aimrdtocompmobg",FieldDef.FLOAT,6,0);
      aimrdtomobilaho = new FieldDef("aimrdtomobilaho",FieldDef.FLOAT,6,0);
      aimmobilahorred = new FieldDef("aimmobilahorred",FieldDef.FLOAT,6,0);
      aimrdtocompmoba = new FieldDef("aimrdtocompmoba",FieldDef.FLOAT,6,0);
      aimrdtomobdivid = new FieldDef("aimrdtomobdivid",FieldDef.FLOAT,6,0);
      aimrdtoactecopr = new FieldDef("aimrdtoactecopr",FieldDef.FLOAT,6,0);
      aimreducactecon = new FieldDef("aimreducactecon",FieldDef.FLOAT,6,0);
      aimrdtoactivida = new FieldDef("aimrdtoactivida",FieldDef.FLOAT,6,0);
      aimreduempleo = new FieldDef("aimreduempleo",FieldDef.CHAR,1);
      aimsalari = new FieldDef("aimsalari",FieldDef.FLOAT,6,0);
      aimgananbasgral = new FieldDef("aimgananbasgral",FieldDef.FLOAT,6,0);
      aimperdbasegral = new FieldDef("aimperdbasegral",FieldDef.FLOAT,6,0);
      aimgananbasahor = new FieldDef("aimgananbasahor",FieldDef.FLOAT,6,0);
      aimperdbasahor = new FieldDef("aimperdbasahor",FieldDef.FLOAT,6,0);
      aimretenciones = new FieldDef("aimretenciones",FieldDef.FLOAT,6,0);
      aimpagofracc = new FieldDef("aimpagofracc",FieldDef.FLOAT,6,0);
      aimimpredempleo = new FieldDef("aimimpredempleo",FieldDef.FLOAT,6,0);
      aimrdtoactiveo = new FieldDef("aimrdtoactiveo",FieldDef.FLOAT,6,0);
      aimcontvinculad = new FieldDef("aimcontvinculad",FieldDef.INTEGER,0);
      FieldDef array[] = {
        aimejeraplic,
        aimdeclaran,
        aimmuf,
        aimcontador,
        aimincorporar,
        aimdeclaracion,
        aimnombre,
        aimcif,
        aimporcparticip,
        aimaplicprorcen,
        aimrdtocapinmob,
        aimcapinmredire,
        aimcapinmredvda,
        aimrdtocompinmo,
        aimrdtomobilgra,
        aimmobilgralred,
        aimrdtocompmobg,
        aimrdtomobilaho,
        aimmobilahorred,
        aimrdtocompmoba,
        aimrdtomobdivid,
        aimrdtoactecopr,
        aimreducactecon,
        aimrdtoactivida,
        aimreduempleo,
        aimsalari,
        aimgananbasgral,
        aimperdbasegral,
        aimgananbasahor,
        aimperdbasahor,
        aimretenciones,
        aimpagofracc,
        aimimpredempleo,
        aimrdtoactiveo,
        aimcontvinculad        
        };
      setColumns(array);
      FieldDef arrayf[] = {aimejeraplic,aimdeclaran,aimmuf,aimcontador };
      setDescription("Imputacion atribucion de rentas");
      setPrimaryKeys(arrayf);
      aimejeraplic.setDescription("Ejercicio aplicacion");
      aimdeclaran.setDescription("CODIGO DE DECLARANTE");
      aimmuf.setDescription("M.U.F.");
      aimcontador.setDescription("Contador");
      aimincorporar.setDescription("Incorporar a renta");
      aimdeclaracion.setDescription("Codigo Declaracion");
      aimnombre.setDescription("Nombre entidad");
      aimcif.setDescription("NIF entidad");
      aimporcparticip.setDescription("% Participacion");
      aimaplicprorcen.setDescription("Aplicar % sobre rendimientos");
      aimrdtocapinmob.setDescription("Rdto. capital inmobiliario");
      aimcapinmredire.setDescription("Reduc.irregular capital inmob.");
      aimcapinmredvda.setDescription("Reduc.vda capital inmob.");
      aimrdtocompinmo.setDescription("Rdto.computable capital inmob.");
      aimrdtomobilgra.setDescription("Rdto. cap.mobiliario base gral.");
      aimmobilgralred.setDescription("Reducc.cap.mobiliario base gral.");
      aimrdtocompmobg.setDescription("Rdto.computable mobiliario gral.");
      aimrdtomobilaho.setDescription("Rdto. Mobil. base ahorro no dividendos");
      aimmobilahorred.setDescription("Reducc.cap.mobiliario base ahorro no dividendos");
      aimrdtocompmoba.setDescription("Rdto.computable mobiliario ahorro no dividendos");
      aimrdtomobdivid.setDescription("Rdto. Mobil. base ahorro dividendos");
      aimrdtoactecopr.setDescription("Rdto. actividades economicas");
      aimreducactecon.setDescription("Reducciones activ.economicas");
      aimrdtoactivida.setDescription("Rdto.reducido activ.economicas");
      aimreduempleo.setDescription("Aplicar reduc. DA 27");
      aimsalari.setDescription("Retribucion trabajadores");
      aimgananbasgral.setDescription("Ganancias base general");
      aimperdbasegral.setDescription("Perdidas base general");
      aimgananbasahor.setDescription("Ganancias base ahorro");
      aimperdbasahor.setDescription("Perdidas base ahorro");
      aimretenciones.setDescription("Retenciones");
      aimpagofracc.setDescription("Pagos fraccionados");
      aimimpredempleo.setDescription("Importe reduccion empleo actividad");
      aimrdtoactiveo.setDescription("Rendimiento actividades EO");
      aimcontvinculad.setDescription("Contador relacionado aplicacion GEYCE");
      }
    }
    
  public class TabCnvverifcal extends TableDef
    {
    // Campos
    public FieldDef cvfejeraplic;
    public FieldDef cvfdeclaran;
    public FieldDef cvfcampo;
    public FieldDef cvfdescripcion;
    public FieldDef cvfdjre;
    public FieldDef cvfdren;
    public FieldDef cvfcjre;
    public FieldDef cvfcren;
    public FieldDef cvftjre;
    public FieldDef cvftren;
    public FieldDef cvforden;
    public TabCnvverifcal(String name)
      {
      super(name);
      cvfejeraplic = new FieldDef("cvfejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cvfdeclaran = new FieldDef("cvfdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cvfcampo = new FieldDef("cvfcampo",FieldDef.CHAR,20,FieldDef.NOTNULL);
      cvfdescripcion = new FieldDef("cvfdescripcion",FieldDef.CHAR,40);
      cvfdjre = new FieldDef("cvfdjre",FieldDef.FLOAT,6,0);
      cvfdren = new FieldDef("cvfdren",FieldDef.FLOAT,6,0);
      cvfcjre = new FieldDef("cvfcjre",FieldDef.FLOAT,6,0);
      cvfcren = new FieldDef("cvfcren",FieldDef.FLOAT,6,0);
      cvftjre = new FieldDef("cvftjre",FieldDef.FLOAT,6,0);
      cvftren = new FieldDef("cvftren",FieldDef.FLOAT,6,0);
      cvforden = new FieldDef("cvforden",FieldDef.INTEGER,0);
      FieldDef array[] = {
        cvfejeraplic,
        cvfdeclaran,
        cvfcampo,
        cvfdescripcion,
        cvfdjre,
        cvfdren,
        cvfcjre,
        cvfcren,
        cvftjre,
        cvftren,
        cvforden        
        };
      setColumns(array);
      FieldDef arrayf[] = {cvfejeraplic,cvfdeclaran,cvfcampo };
      setDescription("Liquidacion renta apartado F1: atribucion");
      setPrimaryKeys(arrayf);
      cvfejeraplic.setDescription("Ejercicio aplicacion");
      cvfdeclaran.setDescription("Codigo de declarante");
      cvfcampo.setDescription("Campo resumen");
      cvfdescripcion.setDescription("descripcion campo");
      cvfdjre.setDescription("Importe Declarante jrenta");
      cvfdren.setDescription("Importe Declarante renta");
      cvfcjre.setDescription("Importe Conyuge jrenta");
      cvfcren.setDescription("Importe Conyuge renta");
      cvftjre.setDescription("Importe Conjunta jrenta");
      cvftren.setDescription("Importe Conjunta renta");
      cvforden.setDescription("Orden");
      }
    }
    
  public class TabLiquidamensaje extends TableDef
    {
    // Campos
    public FieldDef lmsejeraplic;
    public FieldDef lmsdeclaran;
    public FieldDef lmsmuf;
    public FieldDef lmscontador;
    public FieldDef lmsmensaje;
    public TabLiquidamensaje(String name)
      {
      super(name);
      lmsejeraplic = new FieldDef("lmsejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lmsdeclaran = new FieldDef("lmsdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lmsmuf = new FieldDef("lmsmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lmscontador = new FieldDef("lmscontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lmsmensaje = new FieldDef("lmsmensaje",FieldDef.CHAR,80);
      FieldDef array[] = {
        lmsejeraplic,
        lmsdeclaran,
        lmsmuf,
        lmscontador,
        lmsmensaje        
        };
      setColumns(array);
      FieldDef arrayf[] = {lmsejeraplic,lmsdeclaran,lmsmuf,lmscontador };
      setDescription("Mensajes aviso calculo declaracion");
      setPrimaryKeys(arrayf);
      lmsejeraplic.setDescription("Ejercicio aplicacion");
      lmsdeclaran.setDescription("Codigo de declarante");
      lmsmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lmscontador.setDescription("Contador");
      lmsmensaje.setDescription("Descripcion mensaje");
      }
    }
    
  public class TabCnvtablas extends TableDef
    {
    // Campos
    public FieldDef cvtident;
    public FieldDef cvtejeraplic;
    public FieldDef cvttabla;
    public FieldDef cvtdeduccion;
    public FieldDef cvtcamposaldo;
    public FieldDef cvtcampoaplic;
    public FieldDef cvtcampoaplre;
    public FieldDef cvtcampoejer;
    public FieldDef cvtejerminimo;
    public FieldDef cvtpaso;
    public FieldDef cvtfecha;
    public FieldDef cvtatribucion;
    public FieldDef cvtvalatribuc;
    public FieldDef cvtsoloupdate;
    public FieldDef cvtcampodecla;
    public FieldDef cvtcampoejerapl;
    public TabCnvtablas(String name)
      {
      super(name);
      cvtident = new FieldDef("cvtident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cvtejeraplic = new FieldDef("cvtejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cvttabla = new FieldDef("cvttabla",FieldDef.CHAR,15);
      cvtdeduccion = new FieldDef("cvtdeduccion",FieldDef.CHAR,1);
      cvtcamposaldo = new FieldDef("cvtcamposaldo",FieldDef.CHAR,15);
      cvtcampoaplic = new FieldDef("cvtcampoaplic",FieldDef.CHAR,15);
      cvtcampoaplre = new FieldDef("cvtcampoaplre",FieldDef.CHAR,15);
      cvtcampoejer = new FieldDef("cvtcampoejer",FieldDef.CHAR,15);
      cvtejerminimo = new FieldDef("cvtejerminimo",FieldDef.INTEGER,0);
      cvtpaso = new FieldDef("cvtpaso",FieldDef.INTEGER,0);
      cvtfecha = new FieldDef("cvtfecha",FieldDef.CHAR,15);
      cvtatribucion = new FieldDef("cvtatribucion",FieldDef.CHAR,15);
      cvtvalatribuc = new FieldDef("cvtvalatribuc",FieldDef.CHAR,15);
      cvtsoloupdate = new FieldDef("cvtsoloupdate",FieldDef.CHAR,1);
      cvtcampodecla = new FieldDef("cvtcampodecla",FieldDef.CHAR,15);
      cvtcampoejerapl = new FieldDef("cvtcampoejerapl",FieldDef.CHAR,15);
      FieldDef array[] = {
        cvtident,
        cvtejeraplic,
        cvttabla,
        cvtdeduccion,
        cvtcamposaldo,
        cvtcampoaplic,
        cvtcampoaplre,
        cvtcampoejer,
        cvtejerminimo,
        cvtpaso,
        cvtfecha,
        cvtatribucion,
        cvtvalatribuc,
        cvtsoloupdate,
        cvtcampodecla,
        cvtcampoejerapl        
        };
      setColumns(array);
      FieldDef arrayf[] = {cvtident };
      setPrimaryKeys(arrayf);
      cvtident.setAutoIncrementable(true);
      cvtejeraplic.setDescription("Ejercicio aplicacion");
      cvttabla.setDescription("Tabla aplicacion nueva");
      cvtdeduccion.setDescription("Archivo de deducciones");
      cvtcamposaldo.setDescription("Campo saldo inicio ejer.");
      cvtcampoaplic.setDescription("Campo aplicado residentes");
      cvtcampoaplre.setDescription("Campo aplicado no residentes");
      cvtcampoejer.setDescription("Campo ejercicio");
      cvtejerminimo.setDescription("Ejercicio minimo");
      cvtpaso.setDescription("Numero paso conversion");
      cvtfecha.setDescription("Campo tabla FECHAACCESO");
      cvtatribucion.setDescription("Campo atribucion");
      cvtvalatribuc.setDescription("Valor campo atribucion");
      cvtsoloupdate.setDescription("Tabla solo actualizable");
      cvtcampodecla.setDescription("Campo DECLARANTE");
      cvtcampoejerapl.setDescription("Campo EJERAPLIC");
      }
    }
    
  public class TabMuniactualiz extends TableDef
    {
    // Campos
    public FieldDef munejerfiscal;
    public FieldDef munnombre;
    public FieldDef munactualizado;
    public TabMuniactualiz(String name)
      {
      super(name);
      munejerfiscal = new FieldDef("munejerfiscal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      munnombre = new FieldDef("munnombre",FieldDef.CHAR,30);
      munactualizado = new FieldDef("munactualizado",FieldDef.CHAR,1);
      FieldDef array[] = {
        munejerfiscal,
        munnombre,
        munactualizado        
        };
      setColumns(array);
      FieldDef arrayf[] = {munejerfiscal,munnombre };
      setDescription("Relacion municipios con valor catastral actualizado");
      setPrimaryKeys(arrayf);
      munejerfiscal.setDescription("Ejercicio fiscal");
      munnombre.setDescription("Nombre del municipio");
      munactualizado.setDescription("Se ha actualizado [S]i, [N]o");
      }
    }
    
  public class TabHistdedobramejo extends TableDef
    {
    // Campos
    public FieldDef hdoejeraplic;
    public FieldDef hdodeclaran;
    public FieldDef hdonrovda;
    public FieldDef hdoejercicio;
    public FieldDef hdoinversion;
    public FieldDef hdobaseacum;
    public FieldDef hdobaseanual;
    public FieldDef hdobasepdte;
    public FieldDef hdodeduccion;
    public FieldDef hdoseparconj;
    public FieldDef hdoporparticip;
    public FieldDef hdoportotal;
    public FieldDef hdobaseaplicant;
    public TabHistdedobramejo(String name)
      {
      super(name);
      hdoejeraplic = new FieldDef("hdoejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hdodeclaran = new FieldDef("hdodeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      hdonrovda = new FieldDef("hdonrovda",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hdoejercicio = new FieldDef("hdoejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hdoinversion = new FieldDef("hdoinversion",FieldDef.FLOAT,6,0);
      hdobaseacum = new FieldDef("hdobaseacum",FieldDef.FLOAT,6,0);
      hdobaseanual = new FieldDef("hdobaseanual",FieldDef.FLOAT,6,0);
      hdobasepdte = new FieldDef("hdobasepdte",FieldDef.FLOAT,6,0);
      hdodeduccion = new FieldDef("hdodeduccion",FieldDef.FLOAT,6,0);
      hdoseparconj = new FieldDef("hdoseparconj",FieldDef.CHAR,1);
      hdoporparticip = new FieldDef("hdoporparticip",FieldDef.FLOAT,6,0);
      hdoportotal = new FieldDef("hdoportotal",FieldDef.FLOAT,6,0);
      hdobaseaplicant = new FieldDef("hdobaseaplicant",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        hdoejeraplic,
        hdodeclaran,
        hdonrovda,
        hdoejercicio,
        hdoinversion,
        hdobaseacum,
        hdobaseanual,
        hdobasepdte,
        hdodeduccion,
        hdoseparconj,
        hdoporparticip,
        hdoportotal,
        hdobaseaplicant        
        };
      setColumns(array);
      FieldDef arrayf[] = {hdoejeraplic,hdodeclaran,hdonrovda,hdoejercicio };
      setDescription("Historico deduccion obras mejoras vivienda habitual");
      setPrimaryKeys(arrayf);
      hdoejeraplic.setDescription("Ejercicio aplicacion");
      hdodeclaran.setDescription("CODIGO DE DECLARANTE");
      hdonrovda.setDescription("Nro. identificativo de la vivienda");
      hdoejercicio.setDescription("Año deduccion");
      hdoinversion.setDescription("Cantidades invertidas");
      hdobaseacum.setDescription("Base acumulada");
      hdobaseanual.setDescription("Base anual");
      hdobasepdte.setDescription("Base pendiente");
      hdodeduccion.setDescription("Deduccion aplicada");
      hdoseparconj.setDescription("Aplicado en declaracion [C]onjunta o [S]eparada");
      hdoporparticip.setDescription("Porcentaje participación vivienda");
      hdoportotal.setDescription("Porcentaje total propiedad vivienda");
      hdobaseaplicant.setDescription("Base deduccion aplicada ejer.anterior");
      }
    }
    
  public class TabDeducpendiente extends TableDef
    {
    // Campos
    public FieldDef depejeraplic;
    public FieldDef depdeclaran;
    public FieldDef depestatauton;
    public FieldDef depccaa;
    public FieldDef deptipo;
    public FieldDef depejercicio;
    public FieldDef depnrovda;
    public FieldDef depmuf;
    public FieldDef depimporte;
    public FieldDef depdeduccion;
    public FieldDef depbaseacum;
    public FieldDef depbaseanual;
    public FieldDef depbasepdte;
    public FieldDef depbaseaplicant;
    public FieldDef depparticip;
    public FieldDef depportotal;
    public FieldDef depseparconj;
    public TabDeducpendiente(String name)
      {
      super(name);
      depejeraplic = new FieldDef("depejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      depdeclaran = new FieldDef("depdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      depestatauton = new FieldDef("depestatauton",FieldDef.CHAR,1,FieldDef.NOTNULL);
      depccaa = new FieldDef("depccaa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      deptipo = new FieldDef("deptipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      depejercicio = new FieldDef("depejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      depnrovda = new FieldDef("depnrovda",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      depmuf = new FieldDef("depmuf",FieldDef.CHAR,6);
      depimporte = new FieldDef("depimporte",FieldDef.FLOAT,6,0);
      depdeduccion = new FieldDef("depdeduccion",FieldDef.FLOAT,6,0);
      depbaseacum = new FieldDef("depbaseacum",FieldDef.FLOAT,6,0);
      depbaseanual = new FieldDef("depbaseanual",FieldDef.FLOAT,6,0);
      depbasepdte = new FieldDef("depbasepdte",FieldDef.FLOAT,6,0);
      depbaseaplicant = new FieldDef("depbaseaplicant",FieldDef.FLOAT,6,0);
      depparticip = new FieldDef("depparticip",FieldDef.FLOAT,6,0);
      depportotal = new FieldDef("depportotal",FieldDef.FLOAT,6,0);
      depseparconj = new FieldDef("depseparconj",FieldDef.CHAR,1);
      FieldDef array[] = {
        depejeraplic,
        depdeclaran,
        depestatauton,
        depccaa,
        deptipo,
        depejercicio,
        depnrovda,
        depmuf,
        depimporte,
        depdeduccion,
        depbaseacum,
        depbaseanual,
        depbasepdte,
        depbaseaplicant,
        depparticip,
        depportotal,
        depseparconj        
        };
      setColumns(array);
      FieldDef arrayf[] = {depejeraplic,depdeclaran,depestatauton,depccaa,deptipo,depejercicio,depnrovda };
      setDescription("Deducciones pendientes");
      setPrimaryKeys(arrayf);
      depejeraplic.setDescription("Ejercicio aplicacion");
      depdeclaran.setDescription("CODIGO DE DECLARANTE");
      depestatauton.setDescription("[E]statal, [A]utonomica");
      depccaa.setDescription("Codigo comunidad autonomica");
      deptipo.setDescription("Tipo deduccion");
      depejercicio.setDescription("Año origen compensacion");
      depnrovda.setDescription("Nro. identificativo de la vda ded.obras mejora vda");
      depmuf.setDescription("M.U.F.");
      depimporte.setDescription("Importe (Cantidades invertidas)");
      depdeduccion.setDescription("Importe deduccion aplicada");
      depbaseacum.setDescription("Base acumulada obras mejora vda");
      depbaseanual.setDescription("Base anual     obras mejora vda");
      depbasepdte.setDescription("Base pendiente obras mejora vda");
      depbaseaplicant.setDescription("Base deduccion aplicada ejer.anterior obras mejora");
      depparticip.setDescription("Porcentaje participación");
      depportotal.setDescription("Porcentaje total propiedad vivienda obras mejora");
      depseparconj.setDescription("Aplicado en declaracion [C]onjunta o [S]eparada");
      }
    }
    
  public class TabPatrimres extends TableDef
    {
    // Campos
    public FieldDef patejeraplic;
    public FieldDef patdeclaran;
    public FieldDef patmuf;
    public FieldDef pattipocalculo;
    public FieldDef patapara;
    public FieldDef patapara1;
    public FieldDef patapara2;
    public FieldDef pataparb;
    public FieldDef pataparc;
    public FieldDef pataparc1;
    public FieldDef pataparc2;
    public FieldDef patapare;
    public FieldDef pataparf1;
    public FieldDef pataparf2;
    public FieldDef pataparg1;
    public FieldDef pataparg2;
    public FieldDef pataparg3;
    public FieldDef pataparg4;
    public FieldDef patapari;
    public FieldDef pataparj;
    public FieldDef patapark;
    public FieldDef pataparl;
    public FieldDef pataparm;
    public FieldDef pataparn;
    public FieldDef pataparo;
    public FieldDef pataparp;
    public FieldDef pataparq;
    public FieldDef pattotbienes;
    public FieldDef pattotdeuda;
    public FieldDef patbaseimpo;
    public FieldDef patreducmin;
    public FieldDef patbaseliq;
    public FieldDef patvdavalorsus;
    public FieldDef patvdaexencion;
    public FieldDef patapard;
    public FieldDef pataparh1;
    public FieldDef pataparh2;
    public FieldDef patprogresivo;
    public FieldDef patcuotaint;
    public FieldDef patconbasesirpf;
    public FieldDef patcondivide;
    public FieldDef patconguanys;
    public FieldDef patconlimitcuo;
    public FieldDef patconcuotairpf;
    public FieldDef patconcuotaigp;
    public FieldDef patconlimitcpat;
    public FieldDef patconsumacuota;
    public FieldDef patconredexceso;
    public FieldDef patconred80;
    public FieldDef patconcuotapat;
    public FieldDef patcontipom;
    public FieldDef patconextraimp;
    public FieldDef patconextrabase;
    public FieldDef patconextradedu;
    public FieldDef patconceutaneto;
    public FieldDef patconceutaprop;
    public FieldDef patconceutaboni;
    public FieldDef patconcuotamino;
    public FieldDef patconcataneto;
    public FieldDef patconcatprop;
    public FieldDef patconcatboni;
    public FieldDef patconvlcaneto;
    public FieldDef patconvlcprop;
    public FieldDef patconvlcboni;
    public FieldDef patconingreso;
    public FieldDef patsepbasesirpf;
    public FieldDef patsepdivide;
    public FieldDef patsepguanys;
    public FieldDef patseplimitcuo;
    public FieldDef patsepcuotairpf;
    public FieldDef patsepcuotaigp;
    public FieldDef patseplimitcpat;
    public FieldDef patsepsumacuota;
    public FieldDef patsepredexceso;
    public FieldDef patsepred80;
    public FieldDef patsepcuotapat;
    public FieldDef patseptipom;
    public FieldDef patsepextraimp;
    public FieldDef patsepextrabase;
    public FieldDef patsepextradedu;
    public FieldDef patsepceutaneto;
    public FieldDef patsepceutaprop;
    public FieldDef patsepceutaboni;
    public FieldDef patsepcuotamino;
    public FieldDef patsepcataneto;
    public FieldDef patsepcatprop;
    public FieldDef patsepcatboni;
    public FieldDef patsepvlcaneto;
    public FieldDef patsepvlcprop;
    public FieldDef patsepvlcboni;
    public FieldDef patsepingreso;
    public FieldDef patceuta;
    public FieldDef patexentoceuta;
    public FieldDef patinmueblessr;
    public FieldDef patvdahabceuta;
    public FieldDef patdeudavdahab;
    public FieldDef patdeuvdahabceu;
    public FieldDef patvdahabexeceu;
    public FieldDef patdeuvdahabexe;
    public FieldDef patdeuvdaexeceu;
    public FieldDef patdeuvdanoexen;
    public FieldDef patdeuvdanoexce;
    public FieldDef patconcatfoneto;
    public FieldDef patconcatfoprop;
    public FieldDef patsepcatfoneto;
    public FieldDef patsepcatfoprop;
    public TabPatrimres(String name)
      {
      super(name);
      patejeraplic = new FieldDef("patejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      patdeclaran = new FieldDef("patdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      patmuf = new FieldDef("patmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pattipocalculo = new FieldDef("pattipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      patapara = new FieldDef("patapara",FieldDef.FLOAT,6,0);
      patapara1 = new FieldDef("patapara1",FieldDef.FLOAT,6,0);
      patapara2 = new FieldDef("patapara2",FieldDef.FLOAT,6,0);
      pataparb = new FieldDef("pataparb",FieldDef.FLOAT,6,0);
      pataparc = new FieldDef("pataparc",FieldDef.FLOAT,6,0);
      pataparc1 = new FieldDef("pataparc1",FieldDef.FLOAT,6,0);
      pataparc2 = new FieldDef("pataparc2",FieldDef.FLOAT,6,0);
      patapare = new FieldDef("patapare",FieldDef.FLOAT,6,0);
      pataparf1 = new FieldDef("pataparf1",FieldDef.FLOAT,6,0);
      pataparf2 = new FieldDef("pataparf2",FieldDef.FLOAT,6,0);
      pataparg1 = new FieldDef("pataparg1",FieldDef.FLOAT,6,0);
      pataparg2 = new FieldDef("pataparg2",FieldDef.FLOAT,6,0);
      pataparg3 = new FieldDef("pataparg3",FieldDef.FLOAT,6,0);
      pataparg4 = new FieldDef("pataparg4",FieldDef.FLOAT,6,0);
      patapari = new FieldDef("patapari",FieldDef.FLOAT,6,0);
      pataparj = new FieldDef("pataparj",FieldDef.FLOAT,6,0);
      patapark = new FieldDef("patapark",FieldDef.FLOAT,6,0);
      pataparl = new FieldDef("pataparl",FieldDef.FLOAT,6,0);
      pataparm = new FieldDef("pataparm",FieldDef.FLOAT,6,0);
      pataparn = new FieldDef("pataparn",FieldDef.FLOAT,6,0);
      pataparo = new FieldDef("pataparo",FieldDef.FLOAT,6,0);
      pataparp = new FieldDef("pataparp",FieldDef.FLOAT,6,0);
      pataparq = new FieldDef("pataparq",FieldDef.FLOAT,6,0);
      pattotbienes = new FieldDef("pattotbienes",FieldDef.FLOAT,6,0);
      pattotdeuda = new FieldDef("pattotdeuda",FieldDef.FLOAT,6,0);
      patbaseimpo = new FieldDef("patbaseimpo",FieldDef.FLOAT,6,0);
      patreducmin = new FieldDef("patreducmin",FieldDef.FLOAT,6,0);
      patbaseliq = new FieldDef("patbaseliq",FieldDef.FLOAT,6,0);
      patvdavalorsus = new FieldDef("patvdavalorsus",FieldDef.FLOAT,6,0);
      patvdaexencion = new FieldDef("patvdaexencion",FieldDef.FLOAT,6,0);
      patapard = new FieldDef("patapard",FieldDef.FLOAT,6,0);
      pataparh1 = new FieldDef("pataparh1",FieldDef.FLOAT,6,0);
      pataparh2 = new FieldDef("pataparh2",FieldDef.FLOAT,6,0);
      patprogresivo = new FieldDef("patprogresivo",FieldDef.FLOAT,6,0);
      patcuotaint = new FieldDef("patcuotaint",FieldDef.FLOAT,6,0);
      patconbasesirpf = new FieldDef("patconbasesirpf",FieldDef.FLOAT,6,0);
      patcondivide = new FieldDef("patcondivide",FieldDef.FLOAT,6,0);
      patconguanys = new FieldDef("patconguanys",FieldDef.FLOAT,6,0);
      patconlimitcuo = new FieldDef("patconlimitcuo",FieldDef.FLOAT,6,0);
      patconcuotairpf = new FieldDef("patconcuotairpf",FieldDef.FLOAT,6,0);
      patconcuotaigp = new FieldDef("patconcuotaigp",FieldDef.FLOAT,6,0);
      patconlimitcpat = new FieldDef("patconlimitcpat",FieldDef.FLOAT,6,0);
      patconsumacuota = new FieldDef("patconsumacuota",FieldDef.FLOAT,6,0);
      patconredexceso = new FieldDef("patconredexceso",FieldDef.FLOAT,6,0);
      patconred80 = new FieldDef("patconred80",FieldDef.FLOAT,6,0);
      patconcuotapat = new FieldDef("patconcuotapat",FieldDef.FLOAT,6,0);
      patcontipom = new FieldDef("patcontipom",FieldDef.FLOAT,6,0);
      patconextraimp = new FieldDef("patconextraimp",FieldDef.FLOAT,6,0);
      patconextrabase = new FieldDef("patconextrabase",FieldDef.FLOAT,6,0);
      patconextradedu = new FieldDef("patconextradedu",FieldDef.FLOAT,6,0);
      patconceutaneto = new FieldDef("patconceutaneto",FieldDef.FLOAT,6,0);
      patconceutaprop = new FieldDef("patconceutaprop",FieldDef.FLOAT,6,0);
      patconceutaboni = new FieldDef("patconceutaboni",FieldDef.FLOAT,6,0);
      patconcuotamino = new FieldDef("patconcuotamino",FieldDef.FLOAT,6,0);
      patconcataneto = new FieldDef("patconcataneto",FieldDef.FLOAT,6,0);
      patconcatprop = new FieldDef("patconcatprop",FieldDef.FLOAT,6,0);
      patconcatboni = new FieldDef("patconcatboni",FieldDef.FLOAT,6,0);
      patconvlcaneto = new FieldDef("patconvlcaneto",FieldDef.FLOAT,6,0);
      patconvlcprop = new FieldDef("patconvlcprop",FieldDef.FLOAT,6,0);
      patconvlcboni = new FieldDef("patconvlcboni",FieldDef.FLOAT,6,0);
      patconingreso = new FieldDef("patconingreso",FieldDef.FLOAT,6,0);
      patsepbasesirpf = new FieldDef("patsepbasesirpf",FieldDef.FLOAT,6,0);
      patsepdivide = new FieldDef("patsepdivide",FieldDef.FLOAT,6,0);
      patsepguanys = new FieldDef("patsepguanys",FieldDef.FLOAT,6,0);
      patseplimitcuo = new FieldDef("patseplimitcuo",FieldDef.FLOAT,6,0);
      patsepcuotairpf = new FieldDef("patsepcuotairpf",FieldDef.FLOAT,6,0);
      patsepcuotaigp = new FieldDef("patsepcuotaigp",FieldDef.FLOAT,6,0);
      patseplimitcpat = new FieldDef("patseplimitcpat",FieldDef.FLOAT,6,0);
      patsepsumacuota = new FieldDef("patsepsumacuota",FieldDef.FLOAT,6,0);
      patsepredexceso = new FieldDef("patsepredexceso",FieldDef.FLOAT,6,0);
      patsepred80 = new FieldDef("patsepred80",FieldDef.FLOAT,6,0);
      patsepcuotapat = new FieldDef("patsepcuotapat",FieldDef.FLOAT,6,0);
      patseptipom = new FieldDef("patseptipom",FieldDef.FLOAT,6,0);
      patsepextraimp = new FieldDef("patsepextraimp",FieldDef.FLOAT,6,0);
      patsepextrabase = new FieldDef("patsepextrabase",FieldDef.FLOAT,6,0);
      patsepextradedu = new FieldDef("patsepextradedu",FieldDef.FLOAT,6,0);
      patsepceutaneto = new FieldDef("patsepceutaneto",FieldDef.FLOAT,6,0);
      patsepceutaprop = new FieldDef("patsepceutaprop",FieldDef.FLOAT,6,0);
      patsepceutaboni = new FieldDef("patsepceutaboni",FieldDef.FLOAT,6,0);
      patsepcuotamino = new FieldDef("patsepcuotamino",FieldDef.FLOAT,6,0);
      patsepcataneto = new FieldDef("patsepcataneto",FieldDef.FLOAT,6,0);
      patsepcatprop = new FieldDef("patsepcatprop",FieldDef.FLOAT,6,0);
      patsepcatboni = new FieldDef("patsepcatboni",FieldDef.FLOAT,6,0);
      patsepvlcaneto = new FieldDef("patsepvlcaneto",FieldDef.FLOAT,6,0);
      patsepvlcprop = new FieldDef("patsepvlcprop",FieldDef.FLOAT,6,0);
      patsepvlcboni = new FieldDef("patsepvlcboni",FieldDef.FLOAT,6,0);
      patsepingreso = new FieldDef("patsepingreso",FieldDef.FLOAT,6,0);
      patceuta = new FieldDef("patceuta",FieldDef.FLOAT,6,0);
      patexentoceuta = new FieldDef("patexentoceuta",FieldDef.FLOAT,6,0);
      patinmueblessr = new FieldDef("patinmueblessr",FieldDef.FLOAT,6,0);
      patvdahabceuta = new FieldDef("patvdahabceuta",FieldDef.FLOAT,6,0);
      patdeudavdahab = new FieldDef("patdeudavdahab",FieldDef.FLOAT,6,0);
      patdeuvdahabceu = new FieldDef("patdeuvdahabceu",FieldDef.FLOAT,6,0);
      patvdahabexeceu = new FieldDef("patvdahabexeceu",FieldDef.FLOAT,6,0);
      patdeuvdahabexe = new FieldDef("patdeuvdahabexe",FieldDef.FLOAT,6,0);
      patdeuvdaexeceu = new FieldDef("patdeuvdaexeceu",FieldDef.FLOAT,6,0);
      patdeuvdanoexen = new FieldDef("patdeuvdanoexen",FieldDef.FLOAT,6,0);
      patdeuvdanoexce = new FieldDef("patdeuvdanoexce",FieldDef.FLOAT,6,0);
      patconcatfoneto = new FieldDef("patconcatfoneto",FieldDef.FLOAT,6,0);
      patconcatfoprop = new FieldDef("patconcatfoprop",FieldDef.FLOAT,6,0);
      patsepcatfoneto = new FieldDef("patsepcatfoneto",FieldDef.FLOAT,6,0);
      patsepcatfoprop = new FieldDef("patsepcatfoprop",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        patejeraplic,
        patdeclaran,
        patmuf,
        pattipocalculo,
        patapara,
        patapara1,
        patapara2,
        pataparb,
        pataparc,
        pataparc1,
        pataparc2,
        patapare,
        pataparf1,
        pataparf2,
        pataparg1,
        pataparg2,
        pataparg3,
        pataparg4,
        patapari,
        pataparj,
        patapark,
        pataparl,
        pataparm,
        pataparn,
        pataparo,
        pataparp,
        pataparq,
        pattotbienes,
        pattotdeuda,
        patbaseimpo,
        patreducmin,
        patbaseliq,
        patvdavalorsus,
        patvdaexencion,
        patapard,
        pataparh1,
        pataparh2,
        patprogresivo,
        patcuotaint,
        patconbasesirpf,
        patcondivide,
        patconguanys,
        patconlimitcuo,
        patconcuotairpf,
        patconcuotaigp,
        patconlimitcpat,
        patconsumacuota,
        patconredexceso,
        patconred80,
        patconcuotapat,
        patcontipom,
        patconextraimp,
        patconextrabase,
        patconextradedu,
        patconceutaneto,
        patconceutaprop,
        patconceutaboni,
        patconcuotamino,
        patconcataneto,
        patconcatprop,
        patconcatboni,
        patconvlcaneto,
        patconvlcprop,
        patconvlcboni,
        patconingreso,
        patsepbasesirpf,
        patsepdivide,
        patsepguanys,
        patseplimitcuo,
        patsepcuotairpf,
        patsepcuotaigp,
        patseplimitcpat,
        patsepsumacuota,
        patsepredexceso,
        patsepred80,
        patsepcuotapat,
        patseptipom,
        patsepextraimp,
        patsepextrabase,
        patsepextradedu,
        patsepceutaneto,
        patsepceutaprop,
        patsepceutaboni,
        patsepcuotamino,
        patsepcataneto,
        patsepcatprop,
        patsepcatboni,
        patsepvlcaneto,
        patsepvlcprop,
        patsepvlcboni,
        patsepingreso,
        patceuta,
        patexentoceuta,
        patinmueblessr,
        patvdahabceuta,
        patdeudavdahab,
        patdeuvdahabceu,
        patvdahabexeceu,
        patdeuvdahabexe,
        patdeuvdaexeceu,
        patdeuvdanoexen,
        patdeuvdanoexce,
        patconcatfoneto,
        patconcatfoprop,
        patsepcatfoneto,
        patsepcatfoprop        
        };
      setColumns(array);
      FieldDef arrayf[] = {patejeraplic,patdeclaran,patmuf,pattipocalculo };
      setDescription("Liquidacion patrimonio Resumen");
      setPrimaryKeys(arrayf);
      patejeraplic.setDescription("Ejercicio aplicacion");
      patdeclaran.setDescription("Codigo de declarante");
      patmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      pattipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      patapara.setDescription("Apartado A:  Bienes inmuebles de naturaleza urbana");
      patapara1.setDescription("Apartado A1: Viviemda habitual");
      patapara2.setDescription("Apartado A2: Otros inmuebles urbanos");
      pataparb.setDescription("Apartado B:  Bienes inmuebles de naturaleza rustica");
      pataparc.setDescription("Apartado C:  Bienes y derechos no exentos afectos a actividades");
      pataparc1.setDescription("Apartado C1: Afectos no inmuebles");
      pataparc2.setDescription("Apartado C2: Afectos inmuebles");
      patapare.setDescription("Apartado E:  Depositos en cuenta corriente");
      pataparf1.setDescription("Apartado F1: Deuda publica, obligaciones, bonos en bolsa");
      pataparf2.setDescription("Apartado F2: Obligaciones, bonos, certificados deposito, pagares no bolsa");
      pataparg1.setDescription("Apartado G1: Fondos inversion en bolsa");
      pataparg2.setDescription("Apartado G2: Acciones en bolsa");
      pataparg3.setDescription("Apartado G3: Fondos inversion no bolsa");
      pataparg4.setDescription("Apartado G4: Acciones no bolsa");
      patapari.setDescription("Apartado I:  Seguros de vida");
      pataparj.setDescription("Apartado J:  Rentas temporales y vitalicias");
      patapark.setDescription("Apartado K:  Vehiculos, jovas, embarcaciones, aereonaves");
      pataparl.setDescription("Apartado L:  Objetos de arte y antiguedades");
      pataparm.setDescription("Apartado M:  Derechos reales de usoy disfrute");
      pataparn.setDescription("Apartado N:  Concesiones administrativas");
      pataparo.setDescription("Apartado O:  Propiedad intelectual o industrial");
      pataparp.setDescription("Apartado P:  Opciones contractuales");
      pataparq.setDescription("Apartado Q:  Demas bienes y derechos");
      pattotbienes.setDescription("Total bienes y derechos no exentos");
      pattotdeuda.setDescription("Total deudas deducibles");
      patbaseimpo.setDescription("Base imponible");
      patreducmin.setDescription("Reduccion minimo exento obligacion personal");
      patbaseliq.setDescription("Base liquidable");
      patvdavalorsus.setDescription("Bienes exentos Vda. Habitual valor susceptible de exencion");
      patvdaexencion.setDescription("Bienes exentos Vda. Habitual valor exento");
      patapard.setDescription("Apartado D:  Bienes exentos afectos a actividades");
      pataparh1.setDescription("Apartado H1: Bienes exentos en bolsa");
      pataparh2.setDescription("Apartado H2: Bienes exentos no bolsa");
      patprogresivo.setDescription("Patrimonio exento con progresividad (para determinar el tipo)");
      patcuotaint.setDescription("Cuota integra");
      patconbasesirpf.setDescription("Conjunta.  Bases imp. IRPF");
      patcondivide.setDescription("Conjunta.  Dividendos no integrados IRPF");
      patconguanys.setDescription("Conjunta.  Saldo postivo gananc/perd. B.Ahorro >1 a¤o");
      patconlimitcuo.setDescription("Conjunta.  Limite conjunto de cuotas IRPF i IP");
      patconcuotairpf.setDescription("Conjunta.  Suma cuotas integras IRPF");
      patconcuotaigp.setDescription("Conjunta.  Parte cuotas integras IRPF de gananc/perd BA>1");
      patconlimitcpat.setDescription("Conjunta.  Parte cuotas integras IP susceptible de limitacion");
      patconsumacuota.setDescription("Conjunta.  Suma de cuotas a efectos del limite conjunto");
      patconredexceso.setDescription("Conjunta.  Reduccion exceso limite");
      patconred80.setDescription("Conjunta.  Reduccion 80% cuota integra IP");
      patconcuotapat.setDescription("Conjunta.  Total cuota integra IP");
      patcontipom.setDescription("Conjunta.  Tipo medio de gravamen");
      patconextraimp.setDescription("Conjunta.  Ded. extranjero: Impuesto pagado");
      patconextrabase.setDescription("Conjunta.  Ded. extranjero: Parte de base liquidable gravada");
      patconextradedu.setDescription("Conjunta.  Ded. extranjero: Deduccion");
      patconceutaneto.setDescription("Conjunta.  Ded. Ceuta: Valor neto bienes CM");
      patconceutaprop.setDescription("Conjunta.  Ded. Ceuta: Proporcion cuota de los bienes CM");
      patconceutaboni.setDescription("Conjunta.  Ded. Ceuta: Bonificacion");
      patconcuotamino.setDescription("Conjunta.  Cuota minorada");
      patconcataneto.setDescription("Conjunta.  Pat.protegido minus. CAT-Asturies: Valor neto bienes con derecho");
      patconcatprop.setDescription("Conjunta.  Pat.protegido minus. CAT-Asturies: Proporc. cuota de los bienes prote.");
      patconcatboni.setDescription("Conjunta.  Pat.protegido minus. CAT-Asturies: Bonificacion");
      patconvlcaneto.setDescription("Conjunta.  Copa America VLC: Valor neto bienes con derecho");
      patconvlcprop.setDescription("Conjunta.  Copa America VLC: Proporcion cuota de los bienes copa.");
      patconvlcboni.setDescription("Conjunta.  Copa America VLC: Bonificacion");
      patconingreso.setDescription("Conjunta.  Cuota a ingresar");
      patsepbasesirpf.setDescription("Separadas. Bases imp. IRPF");
      patsepdivide.setDescription("Separadas. Dividendos no integrados IRPF");
      patsepguanys.setDescription("Separadas. Saldo postivo guanac/perd. B.Ahorro >1 a¤o");
      patseplimitcuo.setDescription("Separadas. Limite conjunto de cuotas IRPF i IP");
      patsepcuotairpf.setDescription("Separadas. Suma cuotas integras IRPF");
      patsepcuotaigp.setDescription("Separadas. Parte cuotas integras IRPF de gananc/perd BA>1");
      patseplimitcpat.setDescription("Separadas. Parte cuotas integras IP susceptible de limitacion");
      patsepsumacuota.setDescription("Separadas. Suma de cuotas a efectos del limite conjunto");
      patsepredexceso.setDescription("Separadas. Reduccion exceso limite");
      patsepred80.setDescription("Separadas. Reduccion 80% cuota integra IP");
      patsepcuotapat.setDescription("Separadas. Total cuota integra IP");
      patseptipom.setDescription("Separadas. Tipo medio de gravamen");
      patsepextraimp.setDescription("Separadas. Ded. extranjero: Impuesto pagado");
      patsepextrabase.setDescription("Separadas. Ded. extranjero: Parte de base liquidable gravada");
      patsepextradedu.setDescription("Separadas. Ded. extranjero: Deduccion");
      patsepceutaneto.setDescription("Separadas. Ded. Ceuta: Valor neto bienes CM");
      patsepceutaprop.setDescription("Separadas. Ded. Ceuta: Proporcion cuota de los bienes CM");
      patsepceutaboni.setDescription("Separadas. Ded. Ceuta: Bonificacion");
      patsepcuotamino.setDescription("Separadas. Cuota minorada");
      patsepcataneto.setDescription("Separadas. Pat.protegido minus. CAT-Asturies: Valor neto bienes con derecho");
      patsepcatprop.setDescription("Separadas. Pat.protegido minus. CAT-Asturies: Proporc. cuota de los bienes prote.");
      patsepcatboni.setDescription("Separadas. Pat.protegido minus. CAT-Asturies: Bonificacion");
      patsepvlcaneto.setDescription("Separadas. Copa America VLC: Valor neto bienes con derecho");
      patsepvlcprop.setDescription("Separadas. Copa America VLC: Proporcion cuota de los bienes copa.");
      patsepvlcboni.setDescription("Separadas. Copa America VLC: Bonificacion");
      patsepingreso.setDescription("Separadas. Cuota a ingresar");
      patceuta.setDescription("Bienes y derechos en Ceuta y Melilla");
      patexentoceuta.setDescription("Bienes y derechos exentos en Ceuta y Melilla");
      patinmueblessr.setDescription("Inmuebles sin rendimiento en renta");
      patvdahabceuta.setDescription("Vivienda habitual Ceuta y Melilla");
      patdeudavdahab.setDescription("Importe deuda vivienda habitual");
      patdeuvdahabceu.setDescription("Importe deuda vivienda habitual Ceuta y Melilla");
      patvdahabexeceu.setDescription("Parte exenta vivienda habitual Ceuta y Melilla");
      patdeuvdahabexe.setDescription("Parte de la deuda vivienda habitual exenta");
      patdeuvdaexeceu.setDescription("Parte de la deuda vivienda habitual exenta Ceuta y Melilla");
      patdeuvdanoexen.setDescription("Deuda vivienda habitual no exenta");
      patdeuvdanoexce.setDescription("Deuda vivienda habitual no exenta Ceuta y Melilla");
      patconcatfoneto.setDescription("Conjunta.  Propiedad forestal CAT: Valor neto bienes con derecho");
      patconcatfoprop.setDescription("Conjunta.  Propiedad forestal CAT: Proporc. cuota de los bienes forest");
      patsepcatfoneto.setDescription("Separadas. Propiedad forestal CAT: Valor neto bienes con derecho");
      patsepcatfoprop.setDescription("Separadas. Propiedad forestal CAT: Proporc. cuota de los bienes forest");
      }
    }
    
  public class TabFormapago210 extends TableDef
    {
    // Campos
    public FieldDef fp2ejeraplic;
    public FieldDef fp2declaran;
    public FieldDef fp2muf;
    public FieldDef fp2iformapago;
    public FieldDef fp2iespfp;
    public FieldDef fp2iespiban;
    public FieldDef fp2iespbanco;
    public FieldDef fp2iespofici;
    public FieldDef fp2iespdc;
    public FieldDef fp2iespcuenta;
    public FieldDef fp2iextnif;
    public FieldDef fp2iextnombre;
    public FieldDef fp2iextueiban;
    public FieldDef fp2iextueswift;
    public FieldDef fp2iextrpswift;
    public FieldDef fp2iextrpcuent;
    public FieldDef fp2iextrpnomba;
    public FieldDef fp2iextrpdirec;
    public FieldDef fp2iextrpcity;
    public FieldDef fp2iextrpcodp;
    public FieldDef fp2dformapago;
    public FieldDef fp2despnif;
    public FieldDef fp2despnombre;
    public FieldDef fp2despiban;
    public FieldDef fp2despbanco;
    public FieldDef fp2despofici;
    public FieldDef fp2despdc;
    public FieldDef fp2despcuenta;
    public FieldDef fp2dextnif;
    public FieldDef fp2dextnombre;
    public FieldDef fp2dextueiban;
    public FieldDef fp2dextueswift;
    public FieldDef fp2dextrpswift;
    public FieldDef fp2dextrpcuent;
    public FieldDef fp2dextrpnomba;
    public FieldDef fp2dextrpdirec;
    public FieldDef fp2dextrpcity;
    public FieldDef fp2dextrpcodp;
    public TabFormapago210(String name)
      {
      super(name);
      fp2ejeraplic = new FieldDef("fp2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fp2declaran = new FieldDef("fp2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      fp2muf = new FieldDef("fp2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      fp2iformapago = new FieldDef("fp2iformapago",FieldDef.CHAR,1);
      fp2iespfp = new FieldDef("fp2iespfp",FieldDef.CHAR,1);
      fp2iespiban = new FieldDef("fp2iespiban",FieldDef.CHAR,2);
      fp2iespbanco = new FieldDef("fp2iespbanco",FieldDef.CHAR,4);
      fp2iespofici = new FieldDef("fp2iespofici",FieldDef.CHAR,4);
      fp2iespdc = new FieldDef("fp2iespdc",FieldDef.CHAR,2);
      fp2iespcuenta = new FieldDef("fp2iespcuenta",FieldDef.CHAR,10);
      fp2iextnif = new FieldDef("fp2iextnif",FieldDef.CHAR,15);
      fp2iextnombre = new FieldDef("fp2iextnombre",FieldDef.CHAR,125);
      fp2iextueiban = new FieldDef("fp2iextueiban",FieldDef.CHAR,34);
      fp2iextueswift = new FieldDef("fp2iextueswift",FieldDef.CHAR,11);
      fp2iextrpswift = new FieldDef("fp2iextrpswift",FieldDef.CHAR,11);
      fp2iextrpcuent = new FieldDef("fp2iextrpcuent",FieldDef.CHAR,34);
      fp2iextrpnomba = new FieldDef("fp2iextrpnomba",FieldDef.CHAR,70);
      fp2iextrpdirec = new FieldDef("fp2iextrpdirec",FieldDef.CHAR,35);
      fp2iextrpcity = new FieldDef("fp2iextrpcity",FieldDef.CHAR,30);
      fp2iextrpcodp = new FieldDef("fp2iextrpcodp",FieldDef.CHAR,2);
      fp2dformapago = new FieldDef("fp2dformapago",FieldDef.CHAR,1);
      fp2despnif = new FieldDef("fp2despnif",FieldDef.CHAR,9);
      fp2despnombre = new FieldDef("fp2despnombre",FieldDef.CHAR,125);
      fp2despiban = new FieldDef("fp2despiban",FieldDef.CHAR,2);
      fp2despbanco = new FieldDef("fp2despbanco",FieldDef.CHAR,4);
      fp2despofici = new FieldDef("fp2despofici",FieldDef.CHAR,4);
      fp2despdc = new FieldDef("fp2despdc",FieldDef.CHAR,2);
      fp2despcuenta = new FieldDef("fp2despcuenta",FieldDef.CHAR,10);
      fp2dextnif = new FieldDef("fp2dextnif",FieldDef.CHAR,15);
      fp2dextnombre = new FieldDef("fp2dextnombre",FieldDef.CHAR,125);
      fp2dextueiban = new FieldDef("fp2dextueiban",FieldDef.CHAR,34);
      fp2dextueswift = new FieldDef("fp2dextueswift",FieldDef.CHAR,11);
      fp2dextrpswift = new FieldDef("fp2dextrpswift",FieldDef.CHAR,11);
      fp2dextrpcuent = new FieldDef("fp2dextrpcuent",FieldDef.CHAR,34);
      fp2dextrpnomba = new FieldDef("fp2dextrpnomba",FieldDef.CHAR,70);
      fp2dextrpdirec = new FieldDef("fp2dextrpdirec",FieldDef.CHAR,35);
      fp2dextrpcity = new FieldDef("fp2dextrpcity",FieldDef.CHAR,30);
      fp2dextrpcodp = new FieldDef("fp2dextrpcodp",FieldDef.CHAR,2);
      FieldDef array[] = {
        fp2ejeraplic,
        fp2declaran,
        fp2muf,
        fp2iformapago,
        fp2iespfp,
        fp2iespiban,
        fp2iespbanco,
        fp2iespofici,
        fp2iespdc,
        fp2iespcuenta,
        fp2iextnif,
        fp2iextnombre,
        fp2iextueiban,
        fp2iextueswift,
        fp2iextrpswift,
        fp2iextrpcuent,
        fp2iextrpnomba,
        fp2iextrpdirec,
        fp2iextrpcity,
        fp2iextrpcodp,
        fp2dformapago,
        fp2despnif,
        fp2despnombre,
        fp2despiban,
        fp2despbanco,
        fp2despofici,
        fp2despdc,
        fp2despcuenta,
        fp2dextnif,
        fp2dextnombre,
        fp2dextueiban,
        fp2dextueswift,
        fp2dextrpswift,
        fp2dextrpcuent,
        fp2dextrpnomba,
        fp2dextrpdirec,
        fp2dextrpcity,
        fp2dextrpcodp        
        };
      setColumns(array);
      FieldDef arrayf[] = {fp2ejeraplic,fp2declaran,fp2muf };
      setDescription("Liquidacion patrimonio Resumen");
      setPrimaryKeys(arrayf);
      fp2ejeraplic.setDescription("Ejercicio aplicacion");
      fp2declaran.setDescription("Codigo de declarante");
      fp2muf.setDescription("Miembro unidad familiar [D]eclarante, [C]onyuge");
      }
    }
    
  public class TabCarteravalor2 extends TableDef
    {
    // Campos
    public FieldDef ca2ident;
    public FieldDef ca2ejeraplic;
    public FieldDef ca2declaran;
    public FieldDef ca2contador;
    public FieldDef ca2lote;
    public FieldDef ca2claucartera;
    public FieldDef ca2titulos;
    public FieldDef ca2valor;
    public FieldDef ca2fecha;
    public FieldDef ca2titaplic;
    public FieldDef ca2identguany;
    public TabCarteravalor2(String name)
      {
      super(name);
      ca2ident = new FieldDef("ca2ident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ca2ejeraplic = new FieldDef("ca2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ca2declaran = new FieldDef("ca2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      ca2contador = new FieldDef("ca2contador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ca2lote = new FieldDef("ca2lote",FieldDef.INTEGER,0);
      ca2claucartera = new FieldDef("ca2claucartera",FieldDef.INTEGER,0);
      ca2titulos = new FieldDef("ca2titulos",FieldDef.FLOAT,6,0);
      ca2valor = new FieldDef("ca2valor",FieldDef.FLOAT,6,0);
      ca2fecha = new FieldDef("ca2fecha",FieldDef.DATE);
      ca2titaplic = new FieldDef("ca2titaplic",FieldDef.FLOAT,6,0);
      ca2identguany = new FieldDef("ca2identguany",FieldDef.INTEGER,0);
      FieldDef array[] = {
        ca2ident,
        ca2ejeraplic,
        ca2declaran,
        ca2contador,
        ca2lote,
        ca2claucartera,
        ca2titulos,
        ca2valor,
        ca2fecha,
        ca2titaplic,
        ca2identguany        
        };
      setColumns(array);
      FieldDef arrayf[] = {ca2ident };
      setDescription("Cartera de valores2");
      setPrimaryKeys(arrayf);
      ca2ident.setAutoIncrementable(true);
      ca2ejeraplic.setDescription("Ejercicio aplicacion");
      ca2declaran.setDescription("CODIGO DE DECLARANTE");
      ca2contador.setDescription("Identificador contador mobiliario o inmobiliario");
      ca2lote.setDescription("Numero de lote");
      ca2claucartera.setDescription("Clau cartera carident de cartera");
      ca2titulos.setDescription("Numero de Titulos anterior");
      ca2valor.setDescription("Valor Compra anterior");
      ca2fecha.setDescription("Fecha anterior");
      ca2titaplic.setDescription("Nro Titulos aplicados (venta anterior+actual)");
      ca2identguany.setDescription("Identificador del registre del guany");
      }
    }
    
  public class TabObligreal extends TableDef
    {
    // Campos
    public FieldDef obrejeraplic;
    public FieldDef obrdeclaran;
    public FieldDef obrmuf;
    public FieldDef obrfisjuri;
    public FieldDef obrdireccion;
    public FieldDef obrclavepais;
    public FieldDef obrpersonafirma;
    public FieldDef obrcodigoext;
    public FieldDef obrcpa;
    public FieldDef obrnumero;
    public FieldDef obrescalera;
    public FieldDef obrpiso;
    public FieldDef obrpuerta;
    public FieldDef obrtelefono;
    public FieldDef obrpostal;
    public FieldDef obrmunicipio;
    public FieldDef obrcodidioma;
    public FieldDef obrnifresiden;
    public FieldDef obrmobil;
    public FieldDef obrfax;
    public FieldDef obrmail;
    public FieldDef obrregion;
    public FieldDef obrnacfecha;
    public FieldDef obrnacciudad;
    public FieldDef obrnacpais;
    public FieldDef obrfiscalpais;
    public FieldDef obrdireccion2;
    public TabObligreal(String name)
      {
      super(name);
      obrejeraplic = new FieldDef("obrejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      obrdeclaran = new FieldDef("obrdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      obrmuf = new FieldDef("obrmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      obrfisjuri = new FieldDef("obrfisjuri",FieldDef.CHAR,1);
      obrdireccion = new FieldDef("obrdireccion",FieldDef.CHAR,40);
      obrclavepais = new FieldDef("obrclavepais",FieldDef.CHAR,2);
      obrpersonafirma = new FieldDef("obrpersonafirma",FieldDef.CHAR,1);
      obrcodigoext = new FieldDef("obrcodigoext",FieldDef.CHAR,16);
      obrcpa = new FieldDef("obrcpa",FieldDef.CHAR,7);
      obrnumero = new FieldDef("obrnumero",FieldDef.CHAR,4);
      obrescalera = new FieldDef("obrescalera",FieldDef.CHAR,2);
      obrpiso = new FieldDef("obrpiso",FieldDef.CHAR,2);
      obrpuerta = new FieldDef("obrpuerta",FieldDef.CHAR,2);
      obrtelefono = new FieldDef("obrtelefono",FieldDef.CHAR,20);
      obrpostal = new FieldDef("obrpostal",FieldDef.CHAR,15);
      obrmunicipio = new FieldDef("obrmunicipio",FieldDef.CHAR,32);
      obrcodidioma = new FieldDef("obrcodidioma",FieldDef.CHAR,12);
      obrnifresiden = new FieldDef("obrnifresiden",FieldDef.CHAR,15);
      obrmobil = new FieldDef("obrmobil",FieldDef.CHAR,15);
      obrfax = new FieldDef("obrfax",FieldDef.CHAR,15);
      obrmail = new FieldDef("obrmail",FieldDef.CHAR,100);
      obrregion = new FieldDef("obrregion",FieldDef.CHAR,30);
      obrnacfecha = new FieldDef("obrnacfecha",FieldDef.DATE);
      obrnacciudad = new FieldDef("obrnacciudad",FieldDef.CHAR,30);
      obrnacpais = new FieldDef("obrnacpais",FieldDef.CHAR,2);
      obrfiscalpais = new FieldDef("obrfiscalpais",FieldDef.CHAR,2);
      obrdireccion2 = new FieldDef("obrdireccion2",FieldDef.CHAR,40);
      FieldDef array[] = {
        obrejeraplic,
        obrdeclaran,
        obrmuf,
        obrfisjuri,
        obrdireccion,
        obrclavepais,
        obrpersonafirma,
        obrcodigoext,
        obrcpa,
        obrnumero,
        obrescalera,
        obrpiso,
        obrpuerta,
        obrtelefono,
        obrpostal,
        obrmunicipio,
        obrcodidioma,
        obrnifresiden,
        obrmobil,
        obrfax,
        obrmail,
        obrregion,
        obrnacfecha,
        obrnacciudad,
        obrnacpais,
        obrfiscalpais,
        obrdireccion2        
        };
      setColumns(array);
      FieldDef arrayf[] = {obrejeraplic,obrdeclaran,obrmuf };
      setDescription("Datos obligacion real");
      setPrimaryKeys(arrayf);
      obrejeraplic.setDescription("Ejercicio aplicacion");
      obrdeclaran.setDescription("CODIGO DE DECLARANTE");
      obrmuf.setDescription("[D]eclarante, [C]onyuge");
      obrfisjuri.setDescription("Persona Fisica/Juridica");
      obrdireccion.setDescription("Via Publica");
      obrclavepais.setDescription("Clave Pais  (Residencia)");
      obrpersonafirma.setDescription("Persona Firma");
      obrcodigoext.setDescription("Codigo Extranjero");
      obrcpa.setDescription("Siglas");
      obrnumero.setDescription("Numero");
      obrescalera.setDescription("Escalera");
      obrpiso.setDescription("Piso");
      obrpuerta.setDescription("Puerta");
      obrtelefono.setDescription("Telefono");
      obrpostal.setDescription("Codigo Postal (ZIP)");
      obrmunicipio.setDescription("Municipio");
      obrcodidioma.setDescription("Codigo de idioma");
      obrnifresiden.setDescription("Residencia: NIF en el pais de residencia");
      obrmobil.setDescription("Residencia: telefono movil");
      obrfax.setDescription("Residencia: fax");
      obrmail.setDescription("Residencia: correo electronico");
      obrregion.setDescription("Residencia: Provincia/Region/Estado");
      obrnacfecha.setDescription("Nacimiento: Fecha de nacimiento");
      obrnacciudad.setDescription("Nacimiento: Lugar o ciudad de nacimiento");
      obrnacpais.setDescription("Nacimiento: Clave pais nacimiento");
      obrfiscalpais.setDescription("Residencia Fiscal: Clave Pais");
      obrdireccion2.setDescription("Datos complementarios domicilio");
      }
    }
    
  public class TabConversion extends TableDef
    {
    // Campos
    public FieldDef cnvejeraplic;
    public FieldDef cnvdirectorio;
    public FieldDef cnvdeclarante;
    public FieldDef cnvprecalculo;
    public FieldDef cnvcoeficiente;
    public FieldDef cnvactualizibi;
    public FieldDef cnvprimeravda;
    public FieldDef cnvfinalizacion;
    public FieldDef cnvimprentrabaj;
    public FieldDef cnvimpreninmobi;
    public FieldDef cnvimppatinmobi;
    public FieldDef cnvcarterinmobi;
    public FieldDef cnvimprenmobil;
    public FieldDef cnvimppatmobil;
    public FieldDef cnvcartermobil;
    public FieldDef cnvimppatotros;
    public FieldDef cnvpasos;
    public FieldDef cnvcdp;
    public TabConversion(String name)
      {
      super(name);
      cnvejeraplic = new FieldDef("cnvejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnvdirectorio = new FieldDef("cnvdirectorio",FieldDef.CHAR,8,FieldDef.NOTNULL);
      cnvdeclarante = new FieldDef("cnvdeclarante",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cnvprecalculo = new FieldDef("cnvprecalculo",FieldDef.CHAR,1);
      cnvcoeficiente = new FieldDef("cnvcoeficiente",FieldDef.FLOAT,6,0);
      cnvactualizibi = new FieldDef("cnvactualizibi",FieldDef.CHAR,1);
      cnvprimeravda = new FieldDef("cnvprimeravda",FieldDef.CHAR,1);
      cnvfinalizacion = new FieldDef("cnvfinalizacion",FieldDef.CHAR,1);
      cnvimprentrabaj = new FieldDef("cnvimprentrabaj",FieldDef.CHAR,1);
      cnvimpreninmobi = new FieldDef("cnvimpreninmobi",FieldDef.CHAR,1);
      cnvimppatinmobi = new FieldDef("cnvimppatinmobi",FieldDef.CHAR,1);
      cnvcarterinmobi = new FieldDef("cnvcarterinmobi",FieldDef.CHAR,1);
      cnvimprenmobil = new FieldDef("cnvimprenmobil",FieldDef.CHAR,1);
      cnvimppatmobil = new FieldDef("cnvimppatmobil",FieldDef.CHAR,1);
      cnvcartermobil = new FieldDef("cnvcartermobil",FieldDef.CHAR,1);
      cnvimppatotros = new FieldDef("cnvimppatotros",FieldDef.CHAR,1);
      cnvpasos = new FieldDef("cnvpasos",FieldDef.CHAR,150);
      cnvcdp = new FieldDef("cnvcdp",FieldDef.CHAR,12);
      FieldDef array[] = {
        cnvejeraplic,
        cnvdirectorio,
        cnvdeclarante,
        cnvprecalculo,
        cnvcoeficiente,
        cnvactualizibi,
        cnvprimeravda,
        cnvfinalizacion,
        cnvimprentrabaj,
        cnvimpreninmobi,
        cnvimppatinmobi,
        cnvcarterinmobi,
        cnvimprenmobil,
        cnvimppatmobil,
        cnvcartermobil,
        cnvimppatotros,
        cnvpasos,
        cnvcdp        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnvejeraplic,cnvdirectorio,cnvdeclarante };
      setDescription("Declarantes convertidos");
      setPrimaryKeys(arrayf);
      cnvejeraplic.setDescription("Ejercicio aplicacion");
      cnvdirectorio.setDescription("Directorio datos antiguo");
      cnvdeclarante.setDescription("Codigo de declarante");
      cnvprecalculo.setDescription("Declarantes con precalculo");
      cnvcoeficiente.setDescription("Coeficiente de actualizacion catastral");
      cnvactualizibi.setDescription("Actualizar IBI");
      cnvprimeravda.setDescription("Marcar primera vivienda o construccion");
      cnvfinalizacion.setDescription("Finalizacion declaracion");
      cnvimprentrabaj.setDescription("Traspasar importes renta trabajo personal");
      cnvimpreninmobi.setDescription("Traspasar importes renta capital inmobiliario");
      cnvimppatinmobi.setDescription("Traspasar importes patrimonio capital inmobiliario");
      cnvcarterinmobi.setDescription("Traspasar datos cartera valores capital inmobiliario");
      cnvimprenmobil.setDescription("Traspasar importes renta capital mobiliario");
      cnvimppatmobil.setDescription("Traspasar importes patrimonio capital mobiliario");
      cnvcartermobil.setDescription("Traspasar datos cartera valores capital mobiliario");
      cnvimppatotros.setDescription("Traspasar importes patrimonio otros datos de patrimonio");
      cnvpasos.setDescription("Estado pasos");
      cnvcdp.setDescription("Codigo de cdp");
      }
    }
    
  public class TabLiquidaaparta2 extends TableDef
    {
    // Campos
    public FieldDef lia2ejeraplic;
    public FieldDef lia2declaran;
    public FieldDef lia2muf;
    public FieldDef lia2tipocalculo;
    public FieldDef lia2ninmueble;
    public FieldDef lia2porparticip;
    public FieldDef lia2portotal;
    public FieldDef lia2nif;
    public FieldDef lia2referen;
    public FieldDef lia2inversio;
    public FieldDef lia2inversiolim;
    public FieldDef lia2base;
    public FieldDef lia2deduc;
    public FieldDef lia2exces;
    public FieldDef lia2ntotalinm;
    public FieldDef lia2inversioant;
    public FieldDef lia2inverlimant;
    public FieldDef lia2baseant;
    public FieldDef lia2deducant;
    public FieldDef lia2excesant;
    public TabLiquidaaparta2(String name)
      {
      super(name);
      lia2ejeraplic = new FieldDef("lia2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lia2declaran = new FieldDef("lia2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lia2muf = new FieldDef("lia2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lia2tipocalculo = new FieldDef("lia2tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lia2ninmueble = new FieldDef("lia2ninmueble",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lia2porparticip = new FieldDef("lia2porparticip",FieldDef.FLOAT,6,0);
      lia2portotal = new FieldDef("lia2portotal",FieldDef.FLOAT,6,0);
      lia2nif = new FieldDef("lia2nif",FieldDef.CHAR,15);
      lia2referen = new FieldDef("lia2referen",FieldDef.CHAR,20);
      lia2inversio = new FieldDef("lia2inversio",FieldDef.FLOAT,6,0);
      lia2inversiolim = new FieldDef("lia2inversiolim",FieldDef.FLOAT,6,0);
      lia2base = new FieldDef("lia2base",FieldDef.FLOAT,6,0);
      lia2deduc = new FieldDef("lia2deduc",FieldDef.FLOAT,6,0);
      lia2exces = new FieldDef("lia2exces",FieldDef.FLOAT,6,0);
      lia2ntotalinm = new FieldDef("lia2ntotalinm",FieldDef.INTEGER,0);
      lia2inversioant = new FieldDef("lia2inversioant",FieldDef.FLOAT,6,0);
      lia2inverlimant = new FieldDef("lia2inverlimant",FieldDef.FLOAT,6,0);
      lia2baseant = new FieldDef("lia2baseant",FieldDef.FLOAT,6,0);
      lia2deducant = new FieldDef("lia2deducant",FieldDef.FLOAT,6,0);
      lia2excesant = new FieldDef("lia2excesant",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lia2ejeraplic,
        lia2declaran,
        lia2muf,
        lia2tipocalculo,
        lia2ninmueble,
        lia2porparticip,
        lia2portotal,
        lia2nif,
        lia2referen,
        lia2inversio,
        lia2inversiolim,
        lia2base,
        lia2deduc,
        lia2exces,
        lia2ntotalinm,
        lia2inversioant,
        lia2inverlimant,
        lia2baseant,
        lia2deducant,
        lia2excesant        
        };
      setColumns(array);
      FieldDef arrayf[] = {lia2ejeraplic,lia2declaran,lia2muf,lia2tipocalculo,lia2ninmueble };
      setDescription("Liquidacion renta Anexo A2: Ded.Obras Mejora despues 7/5/11");
      setPrimaryKeys(arrayf);
      lia2ejeraplic.setDescription("Ejercicio aplicacion");
      lia2declaran.setDescription("Codigo de declarante");
      lia2muf.setDescription("MUF [T]odos, [D]eclarante, [C]onyuge, [n] nro.miembro");
      lia2tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lia2ninmueble.setDescription("Nro inmueble");
      lia2porparticip.setDescription("% participacion vivienda");
      lia2portotal.setDescription("% total propiedad vda con derecho deduc.");
      lia2nif.setDescription("N.I.F.");
      lia2referen.setDescription("Referencia catastral");
      lia2inversio.setDescription("Cantidades satisfechas");
      lia2inversiolim.setDescription("Inversion limitada");
      lia2base.setDescription("Base deduccion");
      lia2deduc.setDescription("Importe deduccion");
      lia2exces.setDescription("Exceso");
      lia2ntotalinm.setDescription("Nro total inmuebles");
      lia2inversioant.setDescription("Cantidades satisfechas pdte.ejer.anterior");
      lia2inverlimant.setDescription("Inversion limitada pdte.ejer.anterior");
      lia2baseant.setDescription("Base deduccion pdte.ejer.anterior");
      lia2deducant.setDescription("Importe deduccion pdte.ejer.anterior");
      lia2excesant.setDescription("Exceso pdte.ejer.anterior");
      }
    }
    
  public class TabMobiliario extends TableDef
    {
    // Campos
    public FieldDef mobejeraplic;
    public FieldDef mobdeclaran;
    public FieldDef mobidentmob;
    public FieldDef mobdeclaracion;
    public FieldDef mobmuf;
    public FieldDef mobclase;
    public FieldDef mobentidad;
    public FieldDef mobcuenta;
    public FieldDef mobauditado;
    public FieldDef mobtipopropied;
    public FieldDef mobtrat;
    public FieldDef mobcopropiedad;
    public FieldDef mobatribrenta;
    public FieldDef mobnifentidad;
    public FieldDef mobaplicporce;
    public FieldDef mobcancelado;
    public FieldDef mobsaldo3112;
    public FieldDef mobsaldomedio;
    public FieldDef mobrendimiento;
    public FieldDef mobporreten;
    public FieldDef mobretencion;
    public FieldDef mobadministrac;
    public FieldDef mobotrosgastos;
    public FieldDef mobimpreduccion;
    public FieldDef mobtitulos;
    public FieldDef mobnominal;
    public FieldDef mobvaloractual;
    public FieldDef mobvalortotal;
    public FieldDef mobadquisicion;
    public FieldDef mobexencion;
    public FieldDef mobfechaconst;
    public FieldDef mobporanualidad;
    public FieldDef mobvalcapitaliz;
    public FieldDef mobedadusufruct;
    public FieldDef mobrdtoobtenido;
    public FieldDef mobbonificacion;
    public FieldDef mobvalorant;
    public FieldDef mobduracrenta;
    public FieldDef mobcotizacion;
    public FieldDef mobredirregular;
    public FieldDef mobirregular;
    public FieldDef mobreductor;
    public FieldDef mobintereses;
    public FieldDef mobretintereses;
    public FieldDef mobredintereses;
    public FieldDef mobvaladquisic;
    public FieldDef mobvalenajenac;
    public FieldDef mobcompefisrb;
    public FieldDef mobcompefisred;
    public FieldDef mobcompefisrn;
    public FieldDef mobcompfisaplic;
    public FieldDef mobcompefispor;
    public FieldDef mobanualidad;
    public FieldDef mobenlazado193;
    public FieldDef mobpatrim2005;
    public FieldDef mobcontadorant;
    public FieldDef mobnroregis;
    public FieldDef mobcodjiss;
    public FieldDef mobextranjero;
    public TabMobiliario(String name)
      {
      super(name);
      mobejeraplic = new FieldDef("mobejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mobdeclaran = new FieldDef("mobdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      mobidentmob = new FieldDef("mobidentmob",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mobdeclaracion = new FieldDef("mobdeclaracion",FieldDef.INTEGER,0);
      mobmuf = new FieldDef("mobmuf",FieldDef.CHAR,6);
      mobclase = new FieldDef("mobclase",FieldDef.CHAR,5);
      mobentidad = new FieldDef("mobentidad",FieldDef.CHAR,50);
      mobcuenta = new FieldDef("mobcuenta",FieldDef.CHAR,20);
      mobauditado = new FieldDef("mobauditado",FieldDef.CHAR,1);
      mobtipopropied = new FieldDef("mobtipopropied",FieldDef.CHAR,1);
      mobtrat = new FieldDef("mobtrat",FieldDef.CHAR,1);
      mobcopropiedad = new FieldDef("mobcopropiedad",FieldDef.FLOAT,6,0);
      mobatribrenta = new FieldDef("mobatribrenta",FieldDef.CHAR,1);
      mobnifentidad = new FieldDef("mobnifentidad",FieldDef.CHAR,15);
      mobaplicporce = new FieldDef("mobaplicporce",FieldDef.CHAR,1);
      mobcancelado = new FieldDef("mobcancelado",FieldDef.CHAR,1);
      mobsaldo3112 = new FieldDef("mobsaldo3112",FieldDef.FLOAT,6,0);
      mobsaldomedio = new FieldDef("mobsaldomedio",FieldDef.FLOAT,6,0);
      mobrendimiento = new FieldDef("mobrendimiento",FieldDef.FLOAT,6,0);
      mobporreten = new FieldDef("mobporreten",FieldDef.INTEGER,0);
      mobretencion = new FieldDef("mobretencion",FieldDef.FLOAT,6,0);
      mobadministrac = new FieldDef("mobadministrac",FieldDef.FLOAT,6,0);
      mobotrosgastos = new FieldDef("mobotrosgastos",FieldDef.FLOAT,6,0);
      mobimpreduccion = new FieldDef("mobimpreduccion",FieldDef.FLOAT,6,0);
      mobtitulos = new FieldDef("mobtitulos",FieldDef.FLOAT,6,0);
      mobnominal = new FieldDef("mobnominal",FieldDef.FLOAT,6,0);
      mobvaloractual = new FieldDef("mobvaloractual",FieldDef.FLOAT,6,0);
      mobvalortotal = new FieldDef("mobvalortotal",FieldDef.FLOAT,6,0);
      mobadquisicion = new FieldDef("mobadquisicion",FieldDef.FLOAT,6,0);
      mobexencion = new FieldDef("mobexencion",FieldDef.FLOAT,6,0);
      mobfechaconst = new FieldDef("mobfechaconst",FieldDef.DATE);
      mobporanualidad = new FieldDef("mobporanualidad",FieldDef.FLOAT,6,0);
      mobvalcapitaliz = new FieldDef("mobvalcapitaliz",FieldDef.FLOAT,6,0);
      mobedadusufruct = new FieldDef("mobedadusufruct",FieldDef.INTEGER,0);
      mobrdtoobtenido = new FieldDef("mobrdtoobtenido",FieldDef.FLOAT,6,0);
      mobbonificacion = new FieldDef("mobbonificacion",FieldDef.FLOAT,6,0);
      mobvalorant = new FieldDef("mobvalorant",FieldDef.FLOAT,6,0);
      mobduracrenta = new FieldDef("mobduracrenta",FieldDef.INTEGER,0);
      mobcotizacion = new FieldDef("mobcotizacion",FieldDef.FLOAT,6,0);
      mobredirregular = new FieldDef("mobredirregular",FieldDef.FLOAT,6,0);
      mobirregular = new FieldDef("mobirregular",FieldDef.CHAR,1);
      mobreductor = new FieldDef("mobreductor",FieldDef.INTEGER,0);
      mobintereses = new FieldDef("mobintereses",FieldDef.FLOAT,6,0);
      mobretintereses = new FieldDef("mobretintereses",FieldDef.FLOAT,6,0);
      mobredintereses = new FieldDef("mobredintereses",FieldDef.FLOAT,6,0);
      mobvaladquisic = new FieldDef("mobvaladquisic",FieldDef.FLOAT,6,0);
      mobvalenajenac = new FieldDef("mobvalenajenac",FieldDef.FLOAT,6,0);
      mobcompefisrb = new FieldDef("mobcompefisrb",FieldDef.FLOAT,6,0);
      mobcompefisred = new FieldDef("mobcompefisred",FieldDef.FLOAT,6,0);
      mobcompefisrn = new FieldDef("mobcompefisrn",FieldDef.FLOAT,6,0);
      mobcompfisaplic = new FieldDef("mobcompfisaplic",FieldDef.CHAR,1);
      mobcompefispor = new FieldDef("mobcompefispor",FieldDef.FLOAT,6,0);
      mobanualidad = new FieldDef("mobanualidad",FieldDef.FLOAT,6,0);
      mobenlazado193 = new FieldDef("mobenlazado193",FieldDef.CHAR,1);
      mobpatrim2005 = new FieldDef("mobpatrim2005",FieldDef.FLOAT,6,0);
      mobcontadorant = new FieldDef("mobcontadorant",FieldDef.CHAR,15);
      mobnroregis = new FieldDef("mobnroregis",FieldDef.INTEGER,0);
      mobcodjiss = new FieldDef("mobcodjiss",FieldDef.INTEGER,0);
      mobextranjero = new FieldDef("mobextranjero",FieldDef.CHAR,1);
      FieldDef array[] = {
        mobejeraplic,
        mobdeclaran,
        mobidentmob,
        mobdeclaracion,
        mobmuf,
        mobclase,
        mobentidad,
        mobcuenta,
        mobauditado,
        mobtipopropied,
        mobtrat,
        mobcopropiedad,
        mobatribrenta,
        mobnifentidad,
        mobaplicporce,
        mobcancelado,
        mobsaldo3112,
        mobsaldomedio,
        mobrendimiento,
        mobporreten,
        mobretencion,
        mobadministrac,
        mobotrosgastos,
        mobimpreduccion,
        mobtitulos,
        mobnominal,
        mobvaloractual,
        mobvalortotal,
        mobadquisicion,
        mobexencion,
        mobfechaconst,
        mobporanualidad,
        mobvalcapitaliz,
        mobedadusufruct,
        mobrdtoobtenido,
        mobbonificacion,
        mobvalorant,
        mobduracrenta,
        mobcotizacion,
        mobredirregular,
        mobirregular,
        mobreductor,
        mobintereses,
        mobretintereses,
        mobredintereses,
        mobvaladquisic,
        mobvalenajenac,
        mobcompefisrb,
        mobcompefisred,
        mobcompefisrn,
        mobcompfisaplic,
        mobcompefispor,
        mobanualidad,
        mobenlazado193,
        mobpatrim2005,
        mobcontadorant,
        mobnroregis,
        mobcodjiss,
        mobextranjero        
        };
      setColumns(array);
      FieldDef arrayf[] = {mobejeraplic,mobdeclaran,mobidentmob };
      setDescription("Datos capital mobiliario");
      setPrimaryKeys(arrayf);
      mobejeraplic.setDescription("Ejercicio aplicacion");
      mobdeclaran.setDescription("CODIGO DE DECLARANTE");
      mobidentmob.setDescription("Identificador mobiliario");
      mobdeclaracion.setDescription("Codigo Declaracion");
      mobmuf.setDescription("M.U.F.");
      mobclase.setDescription("Clase Valor");
      mobentidad.setDescription("Entidad Emisora");
      mobcuenta.setDescription("Numero Cuenta");
      mobauditado.setDescription("Valor auditado");
      mobtipopropied.setDescription("Tipo propiedad    N-P-T-V");
      mobtrat.setDescription("Tipo tratamiento  C-M");
      mobcopropiedad.setDescription("Porcentaje Propiedad");
      mobatribrenta.setDescription("Atribucion de rentas");
      mobnifentidad.setDescription("NIF entidad atribucion rentas");
      mobaplicporce.setDescription("Aplicar % propiedad a importes");
      mobcancelado.setDescription("Valor mobiliario cancelado");
      mobsaldo3112.setDescription("Saldo 31-12");
      mobsaldomedio.setDescription("Saldo Medio Trimestre 4");
      mobrendimiento.setDescription("Rendimiento");
      mobporreten.setDescription("Porcentaje Retencion");
      mobretencion.setDescription("Retencion");
      mobadministrac.setDescription("Gastos Administracion");
      mobotrosgastos.setDescription("Otros Gastos");
      mobimpreduccion.setDescription("Importe de Reduccion calculado");
      mobtitulos.setDescription("Numero de titulos");
      mobnominal.setDescription("Valor nominal");
      mobvaloractual.setDescription("Valor actual");
      mobvalortotal.setDescription("Valor Patrimonio");
      mobadquisicion.setDescription("Adquisicion anual");
      mobexencion.setDescription("Porcentaje exencion Patrimonio");
      mobfechaconst.setDescription("Fecha constitucion");
      mobporanualidad.setDescription("% Anualidad");
      mobvalcapitaliz.setDescription("Valor capitalizacion");
      mobedadusufruct.setDescription("Edad usufructuario");
      mobrdtoobtenido.setDescription("Rendimiento obtenido");
      mobbonificacion.setDescription("Bonificaciones");
      mobvalorant.setDescription("Valor difer año anterior");
      mobduracrenta.setDescription("Duracion renta");
      mobcotizacion.setDescription("Cotizacion media 4 trimestre");
      mobredirregular.setDescription("Importe reduc. rdto. irregular");
      mobirregular.setDescription("Rendimiento irregular");
      mobreductor.setDescription("% Reductor");
      mobintereses.setDescription("Intereses o cupon");
      mobretintereses.setDescription("Retencion sobre intereses");
      mobredintereses.setDescription("Reduccion irregular intereses");
      mobvaladquisic.setDescription("Valor de adquisicion");
      mobvalenajenac.setDescription("Valor de transmision");
      mobcompefisrb.setDescription("Compensac. fiscal rendimiento");
      mobcompefisred.setDescription("Compensac. fiscal reduccion");
      mobcompefisrn.setDescription("Compensac. fiscal rdto neto");
      mobcompfisaplic.setDescription("Aplicar compensacion fiscal");
      mobcompefispor.setDescription("Compensac. fiscal % reducc.");
      mobanualidad.setDescription("Importe anualidad seguros");
      mobenlazado193.setDescription("Enlazado con 193");
      mobpatrim2005.setDescription("Valor de patrimonio del ej.2005");
      mobcontadorant.setDescription("Contador aplicacion antigua");
      mobnroregis.setDescription("Numero de registro");
      mobcodjiss.setDescription("Codigo jsociedades");
      mobextranjero.setDescription("Valor mobiliario en extranjero 720");
      }
    }
    
  public class TabFechasacceso extends TableDef
    {
    // Campos
    public FieldDef fecejeraplic;
    public FieldDef fecdeclaran;
    public FieldDef fecidentifica;
    public FieldDef fectrabajo;
    public FieldDef fecinmobiliario;
    public FieldDef fecctacorriente;
    public FieldDef fecmobiliario;
    public FieldDef fecactividad;
    public FieldDef fecimputacion;
    public FieldDef fecganancias;
    public FieldDef fecatribucion;
    public FieldDef feccompensacion;
    public FieldDef fecdeduccion;
    public FieldDef fecpatrimonio;
    public FieldDef fecconsumo;
    public FieldDef fecprecalculo;
    public FieldDef fecfinalizacion;
    public FieldDef fecdatosfiscal;
    public FieldDef fec720;
    public TabFechasacceso(String name)
      {
      super(name);
      fecejeraplic = new FieldDef("fecejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fecdeclaran = new FieldDef("fecdeclaran",FieldDef.CHAR,15,FieldDef.NOTNULL);
      fecidentifica = new FieldDef("fecidentifica",FieldDef.DATE);
      fectrabajo = new FieldDef("fectrabajo",FieldDef.DATE);
      fecinmobiliario = new FieldDef("fecinmobiliario",FieldDef.DATE);
      fecctacorriente = new FieldDef("fecctacorriente",FieldDef.DATE);
      fecmobiliario = new FieldDef("fecmobiliario",FieldDef.DATE);
      fecactividad = new FieldDef("fecactividad",FieldDef.DATE);
      fecimputacion = new FieldDef("fecimputacion",FieldDef.DATE);
      fecganancias = new FieldDef("fecganancias",FieldDef.DATE);
      fecatribucion = new FieldDef("fecatribucion",FieldDef.DATE);
      feccompensacion = new FieldDef("feccompensacion",FieldDef.DATE);
      fecdeduccion = new FieldDef("fecdeduccion",FieldDef.DATE);
      fecpatrimonio = new FieldDef("fecpatrimonio",FieldDef.DATE);
      fecconsumo = new FieldDef("fecconsumo",FieldDef.DATE);
      fecprecalculo = new FieldDef("fecprecalculo",FieldDef.DATE);
      fecfinalizacion = new FieldDef("fecfinalizacion",FieldDef.DATE);
      fecdatosfiscal = new FieldDef("fecdatosfiscal",FieldDef.DATE);
      fec720 = new FieldDef("fec720",FieldDef.DATE);
      FieldDef array[] = {
        fecejeraplic,
        fecdeclaran,
        fecidentifica,
        fectrabajo,
        fecinmobiliario,
        fecctacorriente,
        fecmobiliario,
        fecactividad,
        fecimputacion,
        fecganancias,
        fecatribucion,
        feccompensacion,
        fecdeduccion,
        fecpatrimonio,
        fecconsumo,
        fecprecalculo,
        fecfinalizacion,
        fecdatosfiscal,
        fec720        
        };
      setColumns(array);
      FieldDef arrayf[] = {fecejeraplic,fecdeclaran };
      setDescription("Control fechas en la que se ha entrado datos");
      setPrimaryKeys(arrayf);
      fecejeraplic.setDescription("Ejercicio fiscal aplicacion");
      fecdeclaran.setDescription("Declarante");
      fecidentifica.setDescription("Identificacion");
      fectrabajo.setDescription("Trabajo personal");
      fecinmobiliario.setDescription("Datos inmuebles");
      fecctacorriente.setDescription("Cuentas corrientes");
      fecmobiliario.setDescription("Capital mobiliario");
      fecactividad.setDescription("Actividades economicas");
      fecimputacion.setDescription("Imputacion UTE/Derechos imagen");
      fecganancias.setDescription("Ganancias y perdidas patrimoniales");
      fecatribucion.setDescription("Atribucion de rentas");
      feccompensacion.setDescription("Compensaciones pendientes");
      fecdeduccion.setDescription("Deducciones");
      fecpatrimonio.setDescription("Otros datos patrimonio");
      fecconsumo.setDescription("Consumo de renta");
      fecprecalculo.setDescription("Precalculo");
      fecfinalizacion.setDescription("Acabadas");
      fecdatosfiscal.setDescription("Datos fiscales");
      fec720.setDescription("Bienes y derechos en extranjero (mod 720)");
      }
    }
    
  public class TabLiquidaaparte1 extends TableDef
    {
    // Campos
    public FieldDef le1ejeraplic;
    public FieldDef le1declaran;
    public FieldDef le1muf;
    public FieldDef le1tipocalculo;
    public FieldDef le1nactividad;
    public FieldDef le1titular;
    public FieldDef le1clave;
    public FieldDef le1modalidad;
    public FieldDef le1epigrafe;
    public FieldDef le1cobropago;
    public FieldDef le1ingrexplotac;
    public FieldDef le1otringresos;
    public FieldDef le1autoconsumo;
    public FieldDef le1totalingreso;
    public FieldDef le1consumo;
    public FieldDef le1sueldos;
    public FieldDef le1segsocial;
    public FieldDef le1otrgastpers;
    public FieldDef le1arrendamien;
    public FieldDef le1conservacion;
    public FieldDef le1servprofesio;
    public FieldDef le1otrservicios;
    public FieldDef le1tributdeduc;
    public FieldDef le1gastofinanc;
    public FieldDef le1amortizacion;
    public FieldDef le1perddeterior;
    public FieldDef le1actintgral;
    public FieldDef le1gastactgral;
    public FieldDef le1otrosgastos;
    public FieldDef le1sumagastos;
    public FieldDef le1provisiones;
    public FieldDef le1totalgastos1;
    public FieldDef le1diferencia;
    public FieldDef le1gastdificjus;
    public FieldDef le1totalgastos2;
    public FieldDef le1rdtoneto;
    public FieldDef le1reducirregul;
    public FieldDef le1diferrdto;
    public FieldDef le1redcopameric;
    public FieldDef le1rdtonetoredu;
    public FieldDef le1redempleo;
    public FieldDef le1salarioredem;
    public FieldDef le1ayudagricola;
    public FieldDef le1redart322;
    public FieldDef le1coddeclara;
    public FieldDef le1ingrtransamo;
    public FieldDef le1gravaunico;
    public TabLiquidaaparte1(String name)
      {
      super(name);
      le1ejeraplic = new FieldDef("le1ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      le1declaran = new FieldDef("le1declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      le1muf = new FieldDef("le1muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      le1tipocalculo = new FieldDef("le1tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      le1nactividad = new FieldDef("le1nactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      le1titular = new FieldDef("le1titular",FieldDef.CHAR,1);
      le1clave = new FieldDef("le1clave",FieldDef.INTEGER,0);
      le1modalidad = new FieldDef("le1modalidad",FieldDef.CHAR,1);
      le1epigrafe = new FieldDef("le1epigrafe",FieldDef.CHAR,7);
      le1cobropago = new FieldDef("le1cobropago",FieldDef.CHAR,1);
      le1ingrexplotac = new FieldDef("le1ingrexplotac",FieldDef.FLOAT,6,0);
      le1otringresos = new FieldDef("le1otringresos",FieldDef.FLOAT,6,0);
      le1autoconsumo = new FieldDef("le1autoconsumo",FieldDef.FLOAT,6,0);
      le1totalingreso = new FieldDef("le1totalingreso",FieldDef.FLOAT,6,0);
      le1consumo = new FieldDef("le1consumo",FieldDef.FLOAT,6,0);
      le1sueldos = new FieldDef("le1sueldos",FieldDef.FLOAT,6,0);
      le1segsocial = new FieldDef("le1segsocial",FieldDef.FLOAT,6,0);
      le1otrgastpers = new FieldDef("le1otrgastpers",FieldDef.FLOAT,6,0);
      le1arrendamien = new FieldDef("le1arrendamien",FieldDef.FLOAT,6,0);
      le1conservacion = new FieldDef("le1conservacion",FieldDef.FLOAT,6,0);
      le1servprofesio = new FieldDef("le1servprofesio",FieldDef.FLOAT,6,0);
      le1otrservicios = new FieldDef("le1otrservicios",FieldDef.FLOAT,6,0);
      le1tributdeduc = new FieldDef("le1tributdeduc",FieldDef.FLOAT,6,0);
      le1gastofinanc = new FieldDef("le1gastofinanc",FieldDef.FLOAT,6,0);
      le1amortizacion = new FieldDef("le1amortizacion",FieldDef.FLOAT,6,0);
      le1perddeterior = new FieldDef("le1perddeterior",FieldDef.FLOAT,6,0);
      le1actintgral = new FieldDef("le1actintgral",FieldDef.FLOAT,6,0);
      le1gastactgral = new FieldDef("le1gastactgral",FieldDef.FLOAT,6,0);
      le1otrosgastos = new FieldDef("le1otrosgastos",FieldDef.FLOAT,6,0);
      le1sumagastos = new FieldDef("le1sumagastos",FieldDef.FLOAT,6,0);
      le1provisiones = new FieldDef("le1provisiones",FieldDef.FLOAT,6,0);
      le1totalgastos1 = new FieldDef("le1totalgastos1",FieldDef.FLOAT,6,0);
      le1diferencia = new FieldDef("le1diferencia",FieldDef.FLOAT,6,0);
      le1gastdificjus = new FieldDef("le1gastdificjus",FieldDef.FLOAT,6,0);
      le1totalgastos2 = new FieldDef("le1totalgastos2",FieldDef.FLOAT,6,0);
      le1rdtoneto = new FieldDef("le1rdtoneto",FieldDef.FLOAT,6,0);
      le1reducirregul = new FieldDef("le1reducirregul",FieldDef.FLOAT,6,0);
      le1diferrdto = new FieldDef("le1diferrdto",FieldDef.FLOAT,6,0);
      le1redcopameric = new FieldDef("le1redcopameric",FieldDef.FLOAT,6,0);
      le1rdtonetoredu = new FieldDef("le1rdtonetoredu",FieldDef.FLOAT,6,0);
      le1redempleo = new FieldDef("le1redempleo",FieldDef.CHAR,1);
      le1salarioredem = new FieldDef("le1salarioredem",FieldDef.FLOAT,6,0);
      le1ayudagricola = new FieldDef("le1ayudagricola",FieldDef.FLOAT,6,0);
      le1redart322 = new FieldDef("le1redart322",FieldDef.CHAR,1);
      le1coddeclara = new FieldDef("le1coddeclara",FieldDef.INTEGER,0);
      le1ingrtransamo = new FieldDef("le1ingrtransamo",FieldDef.FLOAT,6,0);
      le1gravaunico = new FieldDef("le1gravaunico",FieldDef.CHAR,1);
      FieldDef array[] = {
        le1ejeraplic,
        le1declaran,
        le1muf,
        le1tipocalculo,
        le1nactividad,
        le1titular,
        le1clave,
        le1modalidad,
        le1epigrafe,
        le1cobropago,
        le1ingrexplotac,
        le1otringresos,
        le1autoconsumo,
        le1totalingreso,
        le1consumo,
        le1sueldos,
        le1segsocial,
        le1otrgastpers,
        le1arrendamien,
        le1conservacion,
        le1servprofesio,
        le1otrservicios,
        le1tributdeduc,
        le1gastofinanc,
        le1amortizacion,
        le1perddeterior,
        le1actintgral,
        le1gastactgral,
        le1otrosgastos,
        le1sumagastos,
        le1provisiones,
        le1totalgastos1,
        le1diferencia,
        le1gastdificjus,
        le1totalgastos2,
        le1rdtoneto,
        le1reducirregul,
        le1diferrdto,
        le1redcopameric,
        le1rdtonetoredu,
        le1redempleo,
        le1salarioredem,
        le1ayudagricola,
        le1redart322,
        le1coddeclara,
        le1ingrtransamo,
        le1gravaunico        
        };
      setColumns(array);
      FieldDef arrayf[] = {le1ejeraplic,le1declaran,le1muf,le1tipocalculo,le1nactividad };
      setDescription("Liquidacion renta apartado E1: actividades ED");
      setPrimaryKeys(arrayf);
      le1ejeraplic.setDescription("Ejercicio aplicacion");
      le1declaran.setDescription("Codigo de declarante");
      le1muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      le1tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      le1nactividad.setDescription("Codigo de actividad");
      le1titular.setDescription("Titular");
      le1clave.setDescription("Clave identificativa");
      le1modalidad.setDescription("Modalidad : [S]implificada, [N]ormal");
      le1epigrafe.setDescription("Epigrafe");
      le1cobropago.setDescription("Imputacion temporal por cobro o pago");
      le1ingrexplotac.setDescription("Ingresos de explotacion");
      le1otringresos.setDescription("Otros ingresos");
      le1autoconsumo.setDescription("Autoconsumo");
      le1totalingreso.setDescription("Total ingresos");
      le1consumo.setDescription("Consumos de explotación");
      le1sueldos.setDescription("Sueldos y salarios");
      le1segsocial.setDescription("Seguridad social");
      le1otrgastpers.setDescription("Otros gastos personal");
      le1arrendamien.setDescription("Arrendamientos y canones");
      le1conservacion.setDescription("Reparacion y conservacion");
      le1servprofesio.setDescription("Servicios profesionales");
      le1otrservicios.setDescription("Otros servicios exteriores");
      le1tributdeduc.setDescription("Tributos fiscalmente deducibles");
      le1gastofinanc.setDescription("Gastos financieros");
      le1amortizacion.setDescription("Amortizaciones");
      le1perddeterior.setDescription("Perdida por deterioro");
      le1actintgral.setDescription("Convenio colaboracion en actividades interes general");
      le1gastactgral.setDescription("Gastos en actividades interes general");
      le1otrosgastos.setDescription("Otros gastos fiscalmente deducibles");
      le1sumagastos.setDescription("Total gastos");
      le1provisiones.setDescription("Provisiones");
      le1totalgastos1.setDescription("Total gastos ED");
      le1diferencia.setDescription("Diferencia ingresos y gastos");
      le1gastdificjus.setDescription("Gastos dificil justificacion");
      le1totalgastos2.setDescription("Total gastos EDS");
      le1rdtoneto.setDescription("Rendimiento neto");
      le1reducirregul.setDescription("Reduccion irregular");
      le1diferrdto.setDescription("Diferencia rendimiento");
      le1redcopameric.setDescription("Reduccion Copa America");
      le1rdtonetoredu.setDescription("Rendimiento neto reducido");
      le1redempleo.setDescription("Aplicar reduccion empleo");
      le1salarioredem.setDescription("Importe salario aplicacion reduccion empleo");
      le1ayudagricola.setDescription("Importe ayuda agricola Ley 3/2010");
      le1redart322.setDescription("Aplicar reduccion art.32.2");
      le1coddeclara.setDescription("Codigo declaracion");
      le1ingrtransamo.setDescription("Ingresos: Transmision elem.patrimon.con libertad amortizacion");
      le1gravaunico.setDescription("Presento autoliq.de gravamen unico");
      }
    }
    
  public class TabLiquidaaparte2 extends TableDef
    {
    // Campos
    public FieldDef le2ejeraplic;
    public FieldDef le2declaran;
    public FieldDef le2muf;
    public FieldDef le2tipocalculo;
    public FieldDef le2nactividad;
    public FieldDef le2titular;
    public FieldDef le2epigrafe;
    public FieldDef le2defunid1;
    public FieldDef le2unidad1;
    public FieldDef le2rdtounidad1;
    public FieldDef le2defunid2;
    public FieldDef le2unidad2;
    public FieldDef le2rdtounidad2;
    public FieldDef le2defunid3;
    public FieldDef le2unidad3;
    public FieldDef le2rdtounidad3;
    public FieldDef le2defunid4;
    public FieldDef le2unidad4;
    public FieldDef le2rdtounidad4;
    public FieldDef le2defunid5;
    public FieldDef le2unidad5;
    public FieldDef le2rdtounidad5;
    public FieldDef le2defunid6;
    public FieldDef le2unidad6;
    public FieldDef le2rdtounidad6;
    public FieldDef le2defunid7;
    public FieldDef le2unidad7;
    public FieldDef le2rdtounidad7;
    public FieldDef le2rdtoprevio;
    public FieldDef le2incempleo;
    public FieldDef le2redinversion;
    public FieldDef le2rdtominorado;
    public FieldDef le2indespecial;
    public FieldDef le2indpeqempres;
    public FieldDef le2indtemporada;
    public FieldDef le2indexceso;
    public FieldDef le2indnuevaacti;
    public FieldDef le2rdtomodulos;
    public FieldDef le2reducgral;
    public FieldDef le2gastextraord;
    public FieldDef le2otraspercep;
    public FieldDef le2rdtoneto;
    public FieldDef le2reducirregul;
    public FieldDef le2rdtonetoredu;
    public FieldDef le2redempleo;
    public FieldDef le2salarioredem;
    public FieldDef le2coddeclara;
    public FieldDef le2cobropago;
    public FieldDef le2redlorca;
    public FieldDef le2gravaunico;
    public TabLiquidaaparte2(String name)
      {
      super(name);
      le2ejeraplic = new FieldDef("le2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      le2declaran = new FieldDef("le2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      le2muf = new FieldDef("le2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      le2tipocalculo = new FieldDef("le2tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      le2nactividad = new FieldDef("le2nactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      le2titular = new FieldDef("le2titular",FieldDef.CHAR,1);
      le2epigrafe = new FieldDef("le2epigrafe",FieldDef.CHAR,8);
      le2defunid1 = new FieldDef("le2defunid1",FieldDef.CHAR,25);
      le2unidad1 = new FieldDef("le2unidad1",FieldDef.FLOAT,6,0);
      le2rdtounidad1 = new FieldDef("le2rdtounidad1",FieldDef.FLOAT,6,0);
      le2defunid2 = new FieldDef("le2defunid2",FieldDef.CHAR,25);
      le2unidad2 = new FieldDef("le2unidad2",FieldDef.FLOAT,6,0);
      le2rdtounidad2 = new FieldDef("le2rdtounidad2",FieldDef.FLOAT,6,0);
      le2defunid3 = new FieldDef("le2defunid3",FieldDef.CHAR,25);
      le2unidad3 = new FieldDef("le2unidad3",FieldDef.FLOAT,6,0);
      le2rdtounidad3 = new FieldDef("le2rdtounidad3",FieldDef.FLOAT,6,0);
      le2defunid4 = new FieldDef("le2defunid4",FieldDef.CHAR,25);
      le2unidad4 = new FieldDef("le2unidad4",FieldDef.FLOAT,6,0);
      le2rdtounidad4 = new FieldDef("le2rdtounidad4",FieldDef.FLOAT,6,0);
      le2defunid5 = new FieldDef("le2defunid5",FieldDef.CHAR,25);
      le2unidad5 = new FieldDef("le2unidad5",FieldDef.FLOAT,6,0);
      le2rdtounidad5 = new FieldDef("le2rdtounidad5",FieldDef.FLOAT,6,0);
      le2defunid6 = new FieldDef("le2defunid6",FieldDef.CHAR,25);
      le2unidad6 = new FieldDef("le2unidad6",FieldDef.FLOAT,6,0);
      le2rdtounidad6 = new FieldDef("le2rdtounidad6",FieldDef.FLOAT,6,0);
      le2defunid7 = new FieldDef("le2defunid7",FieldDef.CHAR,25);
      le2unidad7 = new FieldDef("le2unidad7",FieldDef.FLOAT,6,0);
      le2rdtounidad7 = new FieldDef("le2rdtounidad7",FieldDef.FLOAT,6,0);
      le2rdtoprevio = new FieldDef("le2rdtoprevio",FieldDef.FLOAT,6,0);
      le2incempleo = new FieldDef("le2incempleo",FieldDef.FLOAT,6,0);
      le2redinversion = new FieldDef("le2redinversion",FieldDef.FLOAT,6,0);
      le2rdtominorado = new FieldDef("le2rdtominorado",FieldDef.FLOAT,6,0);
      le2indespecial = new FieldDef("le2indespecial",FieldDef.FLOAT,6,0);
      le2indpeqempres = new FieldDef("le2indpeqempres",FieldDef.FLOAT,6,0);
      le2indtemporada = new FieldDef("le2indtemporada",FieldDef.FLOAT,6,0);
      le2indexceso = new FieldDef("le2indexceso",FieldDef.FLOAT,6,0);
      le2indnuevaacti = new FieldDef("le2indnuevaacti",FieldDef.FLOAT,6,0);
      le2rdtomodulos = new FieldDef("le2rdtomodulos",FieldDef.FLOAT,6,0);
      le2reducgral = new FieldDef("le2reducgral",FieldDef.FLOAT,6,0);
      le2gastextraord = new FieldDef("le2gastextraord",FieldDef.FLOAT,6,0);
      le2otraspercep = new FieldDef("le2otraspercep",FieldDef.FLOAT,6,0);
      le2rdtoneto = new FieldDef("le2rdtoneto",FieldDef.FLOAT,6,0);
      le2reducirregul = new FieldDef("le2reducirregul",FieldDef.FLOAT,6,0);
      le2rdtonetoredu = new FieldDef("le2rdtonetoredu",FieldDef.FLOAT,6,0);
      le2redempleo = new FieldDef("le2redempleo",FieldDef.CHAR,1);
      le2salarioredem = new FieldDef("le2salarioredem",FieldDef.FLOAT,6,0);
      le2coddeclara = new FieldDef("le2coddeclara",FieldDef.INTEGER,0);
      le2cobropago = new FieldDef("le2cobropago",FieldDef.CHAR,1);
      le2redlorca = new FieldDef("le2redlorca",FieldDef.FLOAT,6,0);
      le2gravaunico = new FieldDef("le2gravaunico",FieldDef.CHAR,1);
      FieldDef array[] = {
        le2ejeraplic,
        le2declaran,
        le2muf,
        le2tipocalculo,
        le2nactividad,
        le2titular,
        le2epigrafe,
        le2defunid1,
        le2unidad1,
        le2rdtounidad1,
        le2defunid2,
        le2unidad2,
        le2rdtounidad2,
        le2defunid3,
        le2unidad3,
        le2rdtounidad3,
        le2defunid4,
        le2unidad4,
        le2rdtounidad4,
        le2defunid5,
        le2unidad5,
        le2rdtounidad5,
        le2defunid6,
        le2unidad6,
        le2rdtounidad6,
        le2defunid7,
        le2unidad7,
        le2rdtounidad7,
        le2rdtoprevio,
        le2incempleo,
        le2redinversion,
        le2rdtominorado,
        le2indespecial,
        le2indpeqempres,
        le2indtemporada,
        le2indexceso,
        le2indnuevaacti,
        le2rdtomodulos,
        le2reducgral,
        le2gastextraord,
        le2otraspercep,
        le2rdtoneto,
        le2reducirregul,
        le2rdtonetoredu,
        le2redempleo,
        le2salarioredem,
        le2coddeclara,
        le2cobropago,
        le2redlorca,
        le2gravaunico        
        };
      setColumns(array);
      FieldDef arrayf[] = {le2ejeraplic,le2declaran,le2muf,le2tipocalculo,le2nactividad };
      setDescription("Liquidacion renta apartado E2: actividades EO no agricola");
      setPrimaryKeys(arrayf);
      le2ejeraplic.setDescription("Ejercicio aplicacion");
      le2declaran.setDescription("Codigo de declarante");
      le2muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      le2tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      le2nactividad.setDescription("Codigo de actividad");
      le2titular.setDescription("Titular");
      le2epigrafe.setDescription("Epigrafe");
      le2defunid1.setDescription("Definicion unidad 1");
      le2unidad1.setDescription("Unidad modulo 1");
      le2rdtounidad1.setDescription("Rendimiento unidad modulo 1");
      le2defunid2.setDescription("Definicion unidad 2");
      le2unidad2.setDescription("Unidad modulo 2");
      le2rdtounidad2.setDescription("Rendimiento unidad modulo 2");
      le2defunid3.setDescription("Definicion unidad 3");
      le2unidad3.setDescription("Unidad modulo 3");
      le2rdtounidad3.setDescription("Rendimiento unidad modulo 3");
      le2defunid4.setDescription("Definicion unidad 4");
      le2unidad4.setDescription("Unidad modulo 4");
      le2rdtounidad4.setDescription("Rendimiento unidad modulo 4");
      le2defunid5.setDescription("Definicion unidad 5");
      le2unidad5.setDescription("Unidad modulo 5");
      le2rdtounidad5.setDescription("Rendimiento unidad modulo 5");
      le2defunid6.setDescription("Definicion unidad 6");
      le2unidad6.setDescription("Unidad modulo 6");
      le2rdtounidad6.setDescription("Rendimiento unidad modulo 6");
      le2defunid7.setDescription("Definicion unidad 7");
      le2unidad7.setDescription("Unidad modulo 7");
      le2rdtounidad7.setDescription("Rendimiento unidad modulo 7");
      le2rdtoprevio.setDescription("Rendimiento neto previo");
      le2incempleo.setDescription("Minoracion incentivo empleo");
      le2redinversion.setDescription("Minoracion incentivo inversion");
      le2rdtominorado.setDescription("Rendimiento neto minorado");
      le2indespecial.setDescription("Indice corrector especial");
      le2indpeqempres.setDescription("Indice empresa pequeña dimension");
      le2indtemporada.setDescription("Indice de temporada");
      le2indexceso.setDescription("Indice de exceso");
      le2indnuevaacti.setDescription("Indice nueva actividad");
      le2rdtomodulos.setDescription("Rendimiento neto modulos");
      le2reducgral.setDescription("Reduccion general");
      le2gastextraord.setDescription("Gastos extraordinarios");
      le2otraspercep.setDescription("Otras percepciones");
      le2rdtoneto.setDescription("Rendimiento neto actividad");
      le2reducirregul.setDescription("Reduccion irregular");
      le2rdtonetoredu.setDescription("Rendimiento neto reducido");
      le2redempleo.setDescription("Aplicar reduccion empleo");
      le2salarioredem.setDescription("Importe salario aplicacion reduccion empleo");
      le2coddeclara.setDescription("Codigo declaracion");
      le2cobropago.setDescription("Imputacion temporal por cobro o pago");
      le2redlorca.setDescription("Reduccion Lorca");
      le2gravaunico.setDescription("Presento autoliq.de gravamen unico");
      }
    }
    
  public class TabLiquidaapartf2 extends TableDef
    {
    // Campos
    public FieldDef lf2ejeraplic;
    public FieldDef lf2declaran;
    public FieldDef lf2muf;
    public FieldDef lf2tipocalculo;
    public FieldDef lf2nimputacion;
    public FieldDef lf2utetitular;
    public FieldDef lf2nifentidad;
    public FieldDef lf2cobropago;
    public FieldDef lf2utebaseimpon;
    public FieldDef lf2utebasededac;
    public FieldDef lf2utededcreaem;
    public FieldDef lf2utebaseceuta;
    public FieldDef lf2uteimpintern;
    public FieldDef lf2uteretencion;
    public FieldDef lf2tfinttitular;
    public FieldDef lf2tfintnombre;
    public FieldDef lf2tfintcriteri;
    public FieldDef lf2tfintimputac;
    public FieldDef lf2imagtitular;
    public FieldDef lf2imagpersona;
    public FieldDef lf2imagniflabor;
    public FieldDef lf2imagimputac;
    public FieldDef lf2imagdobleimp;
    public FieldDef lf2invcoltitula;
    public FieldDef lf2invcolnombre;
    public FieldDef lf2invcolimputa;
    public FieldDef lf2coddeclara;
    public TabLiquidaapartf2(String name)
      {
      super(name);
      lf2ejeraplic = new FieldDef("lf2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lf2declaran = new FieldDef("lf2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lf2muf = new FieldDef("lf2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lf2tipocalculo = new FieldDef("lf2tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lf2nimputacion = new FieldDef("lf2nimputacion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lf2utetitular = new FieldDef("lf2utetitular",FieldDef.CHAR,1);
      lf2nifentidad = new FieldDef("lf2nifentidad",FieldDef.CHAR,15);
      lf2cobropago = new FieldDef("lf2cobropago",FieldDef.CHAR,1);
      lf2utebaseimpon = new FieldDef("lf2utebaseimpon",FieldDef.FLOAT,6,0);
      lf2utebasededac = new FieldDef("lf2utebasededac",FieldDef.FLOAT,6,0);
      lf2utededcreaem = new FieldDef("lf2utededcreaem",FieldDef.FLOAT,6,0);
      lf2utebaseceuta = new FieldDef("lf2utebaseceuta",FieldDef.FLOAT,6,0);
      lf2uteimpintern = new FieldDef("lf2uteimpintern",FieldDef.FLOAT,6,0);
      lf2uteretencion = new FieldDef("lf2uteretencion",FieldDef.FLOAT,6,0);
      lf2tfinttitular = new FieldDef("lf2tfinttitular",FieldDef.CHAR,1);
      lf2tfintnombre = new FieldDef("lf2tfintnombre",FieldDef.CHAR,60);
      lf2tfintcriteri = new FieldDef("lf2tfintcriteri",FieldDef.CHAR,1);
      lf2tfintimputac = new FieldDef("lf2tfintimputac",FieldDef.FLOAT,6,0);
      lf2imagtitular = new FieldDef("lf2imagtitular",FieldDef.CHAR,1);
      lf2imagpersona = new FieldDef("lf2imagpersona",FieldDef.CHAR,15);
      lf2imagniflabor = new FieldDef("lf2imagniflabor",FieldDef.CHAR,15);
      lf2imagimputac = new FieldDef("lf2imagimputac",FieldDef.FLOAT,6,0);
      lf2imagdobleimp = new FieldDef("lf2imagdobleimp",FieldDef.FLOAT,6,0);
      lf2invcoltitula = new FieldDef("lf2invcoltitula",FieldDef.CHAR,1);
      lf2invcolnombre = new FieldDef("lf2invcolnombre",FieldDef.CHAR,60);
      lf2invcolimputa = new FieldDef("lf2invcolimputa",FieldDef.FLOAT,6,0);
      lf2coddeclara = new FieldDef("lf2coddeclara",FieldDef.INTEGER,0);
      FieldDef array[] = {
        lf2ejeraplic,
        lf2declaran,
        lf2muf,
        lf2tipocalculo,
        lf2nimputacion,
        lf2utetitular,
        lf2nifentidad,
        lf2cobropago,
        lf2utebaseimpon,
        lf2utebasededac,
        lf2utededcreaem,
        lf2utebaseceuta,
        lf2uteimpintern,
        lf2uteretencion,
        lf2tfinttitular,
        lf2tfintnombre,
        lf2tfintcriteri,
        lf2tfintimputac,
        lf2imagtitular,
        lf2imagpersona,
        lf2imagniflabor,
        lf2imagimputac,
        lf2imagdobleimp,
        lf2invcoltitula,
        lf2invcolnombre,
        lf2invcolimputa,
        lf2coddeclara        
        };
      setColumns(array);
      FieldDef arrayf[] = {lf2ejeraplic,lf2declaran,lf2muf,lf2tipocalculo,lf2nimputacion };
      setDescription("Liquidacion renta apartado F2: UTES y Transparencia fiscal");
      setPrimaryKeys(arrayf);
      lf2ejeraplic.setDescription("Ejercicio aplicacion");
      lf2declaran.setDescription("Codigo de declarante");
      lf2muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lf2tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lf2nimputacion.setDescription("Codigo de imputacion");
      lf2utetitular.setDescription("Titular");
      lf2nifentidad.setDescription("NIF entidad");
      lf2cobropago.setDescription("Imputacion temporal por cobro o pago");
      lf2utebaseimpon.setDescription("Base imponible UTE");
      lf2utebasededac.setDescription("Base deduccion inversion empresarial UTE");
      lf2utededcreaem.setDescription("Deduccion por creacion de empleo UTE");
      lf2utebaseceuta.setDescription("Base deduccion Ceuta o Melilla UTE");
      lf2uteimpintern.setDescription("BAse deduccion doble imposicion UTE");
      lf2uteretencion.setDescription("Retenciones UTE");
      lf2tfinttitular.setDescription("Titular");
      lf2tfintnombre.setDescription("Denominacion de la entidad Transp.fiscal internacional");
      lf2tfintcriteri.setDescription("Trans.fiscal internacional: criterio imputacion");
      lf2tfintimputac.setDescription("Imputacion Transp.fiscal internacional");
      lf2imagtitular.setDescription("Titular");
      lf2imagpersona.setDescription("NIF persona primera cesionaria");
      lf2imagniflabor.setDescription("NIF con quien matiene relacion laboral Derechos de imagen");
      lf2imagimputac.setDescription("Imputacion Derechos de imagen");
      lf2imagdobleimp.setDescription("Derechos de imagen: doble imposicion");
      lf2invcoltitula.setDescription("Titular");
      lf2invcolnombre.setDescription("Denominacion de la Institucion de inversion colectiva");
      lf2invcolimputa.setDescription("Imputacion Institucion de inversion colectiva");
      lf2coddeclara.setDescription("Codigo declaracion");
      }
    }
    
  public class TabDedemprendedor extends TableDef
    {
    // Campos
    public FieldDef dceident;
    public FieldDef dceejeraplic;
    public FieldDef dcedeclaran;
    public FieldDef dceidentactiv;
    public FieldDef dcetipo;
    public FieldDef dcemodalidad;
    public FieldDef dceprestpdte;
    public FieldDef dceprestanual;
    public FieldDef dcededuccion;
    public FieldDef dcefecha;
    public FieldDef dcedescripcion;
    public TabDedemprendedor(String name)
      {
      super(name);
      dceident = new FieldDef("dceident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dceejeraplic = new FieldDef("dceejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcedeclaran = new FieldDef("dcedeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dceidentactiv = new FieldDef("dceidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcetipo = new FieldDef("dcetipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      dcemodalidad = new FieldDef("dcemodalidad",FieldDef.CHAR,3);
      dceprestpdte = new FieldDef("dceprestpdte",FieldDef.FLOAT,6,0);
      dceprestanual = new FieldDef("dceprestanual",FieldDef.FLOAT,6,0);
      dcededuccion = new FieldDef("dcededuccion",FieldDef.FLOAT,6,0);
      dcefecha = new FieldDef("dcefecha",FieldDef.DATE);
      dcedescripcion = new FieldDef("dcedescripcion",FieldDef.CHAR,45);
      FieldDef array[] = {
        dceident,
        dceejeraplic,
        dcedeclaran,
        dceidentactiv,
        dcetipo,
        dcemodalidad,
        dceprestpdte,
        dceprestanual,
        dcededuccion,
        dcefecha,
        dcedescripcion        
        };
      setColumns(array);
      FieldDef arrayf[] = {dceident };
      setDescription("Detalle deducciones inversiones ejercicio");
      setPrimaryKeys(arrayf);
      dceident.setAutoIncrementable(true);
      dceejeraplic.setDescription("Ejercicio fiscal aplicacion");
      dcedeclaran.setDescription("Codigo declarante");
      dceidentactiv.setDescription("Identificador actividad");
      dcetipo.setDescription("Tipo deduccion: [E]statal, [C]anarias");
      dcemodalidad.setDescription("Modalidad inversion CE1 - CE2");
      dceprestpdte.setDescription("Prestacion desempleo pendiente percibir");
      dceprestanual.setDescription("Prestacion reconocida doce mensualidades");
      dcededuccion.setDescription("Cuantia deduccion (50% de la menor)");
      dcefecha.setDescription("Fecha contrato");
      dcedescripcion.setDescription("Descripcion");
      }
    }
    
  public class TabAeatinmobiliar extends TableDef
    {
    // Campos
    public FieldDef ainejeraplic;
    public FieldDef aindeclaran;
    public FieldDef ainmuf;
    public FieldDef aincontador;
    public FieldDef ainincorporar;
    public FieldDef aindeclaracion;
    public FieldDef ainuso;
    public FieldDef aindomicilio;
    public FieldDef ainmunicipio;
    public FieldDef ainreferencia;
    public FieldDef ainvalcatastral;
    public FieldDef aincoopropiedad;
    public FieldDef aindias;
    public FieldDef ainsituacion;
    public FieldDef ainrevisado;
    public FieldDef ainimputacion;
    public FieldDef ainclase;
    public FieldDef aincapitalamort;
    public FieldDef ainintereses;
    public FieldDef aingastos;
    public FieldDef ainfechaadquis;
    public FieldDef ainimporte_dos;
    public FieldDef aintipopropieda;
    public FieldDef ainimporteresto;
    public FieldDef ainurbanarusti;
    public FieldDef aincontvinculad;
    public FieldDef ainnroprestamo;
    public TabAeatinmobiliar(String name)
      {
      super(name);
      ainejeraplic = new FieldDef("ainejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aindeclaran = new FieldDef("aindeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      ainmuf = new FieldDef("ainmuf",FieldDef.CHAR,1);
      aincontador = new FieldDef("aincontador",FieldDef.INTEGER,0);
      ainincorporar = new FieldDef("ainincorporar",FieldDef.CHAR,1);
      aindeclaracion = new FieldDef("aindeclaracion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ainuso = new FieldDef("ainuso",FieldDef.CHAR,2);
      aindomicilio = new FieldDef("aindomicilio",FieldDef.CHAR,40);
      ainmunicipio = new FieldDef("ainmunicipio",FieldDef.CHAR,30);
      ainreferencia = new FieldDef("ainreferencia",FieldDef.CHAR,20);
      ainvalcatastral = new FieldDef("ainvalcatastral",FieldDef.FLOAT,6,0);
      aincoopropiedad = new FieldDef("aincoopropiedad",FieldDef.FLOAT,6,0);
      aindias = new FieldDef("aindias",FieldDef.INTEGER,0);
      ainsituacion = new FieldDef("ainsituacion",FieldDef.CHAR,1);
      ainrevisado = new FieldDef("ainrevisado",FieldDef.CHAR,1);
      ainimputacion = new FieldDef("ainimputacion",FieldDef.FLOAT,6,0);
      ainclase = new FieldDef("ainclase",FieldDef.CHAR,1);
      aincapitalamort = new FieldDef("aincapitalamort",FieldDef.FLOAT,6,0);
      ainintereses = new FieldDef("ainintereses",FieldDef.FLOAT,6,0);
      aingastos = new FieldDef("aingastos",FieldDef.FLOAT,6,0);
      ainfechaadquis = new FieldDef("ainfechaadquis",FieldDef.DATE);
      ainimporte_dos = new FieldDef("ainimporte_dos",FieldDef.FLOAT,6,0);
      aintipopropieda = new FieldDef("aintipopropieda",FieldDef.CHAR,1);
      ainimporteresto = new FieldDef("ainimporteresto",FieldDef.FLOAT,6,0);
      ainurbanarusti = new FieldDef("ainurbanarusti",FieldDef.CHAR,1);
      aincontvinculad = new FieldDef("aincontvinculad",FieldDef.INTEGER,0);
      ainnroprestamo = new FieldDef("ainnroprestamo",FieldDef.CHAR,20);
      FieldDef array[] = {
        ainejeraplic,
        aindeclaran,
        ainmuf,
        aincontador,
        ainincorporar,
        aindeclaracion,
        ainuso,
        aindomicilio,
        ainmunicipio,
        ainreferencia,
        ainvalcatastral,
        aincoopropiedad,
        aindias,
        ainsituacion,
        ainrevisado,
        ainimputacion,
        ainclase,
        aincapitalamort,
        ainintereses,
        aingastos,
        ainfechaadquis,
        ainimporte_dos,
        aintipopropieda,
        ainimporteresto,
        ainurbanarusti,
        aincontvinculad,
        ainnroprestamo        
        };
      setColumns(array);
      FieldDef arrayf[] = {ainejeraplic,aindeclaran,ainmuf,ainuso,aincontador };
      setDescription("Datos fiscales: capital inmobiliario");
      setPrimaryKeys(arrayf);
      ainejeraplic.setDescription("Ejercicio aplicacion");
      aindeclaran.setDescription("CODIGO DE DECLARANTE");
      ainmuf.setDescription("MIEMBRO UNIDAD FAMILIAR");
      aincontador.setDescription("CONTADOR");
      ainincorporar.setDescription("Incorporar a renta");
      aindeclaracion.setDescription("Codigo declaracion");
      ainuso.setDescription("TIPO DE VALOR INMOBILIARIO");
      aindomicilio.setDescription("Domicilio");
      ainmunicipio.setDescription("Municipio");
      ainreferencia.setDescription("Referencia catastral");
      ainvalcatastral.setDescription("Valor catastral");
      aincoopropiedad.setDescription("% Propiedad");
      aindias.setDescription("Dias en propiedad");
      ainsituacion.setDescription("Situacion inmueble");
      ainrevisado.setDescription("Valor catastral revisado");
      ainimputacion.setDescription("Rentas imputadas");
      ainclase.setDescription("Clase de inmueble");
      aincapitalamort.setDescription("Capital amortizado");
      ainintereses.setDescription("Intereses");
      aingastos.setDescription("Gastos financieros");
      ainfechaadquis.setDescription("Fecha adquisicion");
      ainimporte_dos.setDescription("Importe dentro de los 2 años");
      aintipopropieda.setDescription("Tipo propiedad");
      ainimporteresto.setDescription("Compensac.Fiscal 3er y siguientes");
      ainurbanarusti.setDescription("Urbana o rustica");
      aincontvinculad.setDescription("Contador relacionado aplicacion GEYCE");
      ainnroprestamo.setDescription("Numero prestamo hipotecario");
      }
    }
    
  public class TabFinalizacion extends TableDef
    {
    // Campos
    public FieldDef finejeraplic;
    public FieldDef findeclaran;
    public FieldDef finmuf;
    public FieldDef findeclaracion;
    public FieldDef finordsim;
    public FieldDef finpatrimonio;
    public FieldDef finobligrenta;
    public FieldDef finselistarenta;
    public FieldDef finsepuelistar;
    public FieldDef finsuspenpago;
    public FieldDef finingreso;
    public FieldDef fincobro;
    public FieldDef finaplazado;
    public FieldDef finiglesia;
    public FieldDef finalertassms;
    public FieldDef finborrador;
    public FieldDef fintborrador;
    public FieldDef finconfborrador;
    public FieldDef finborradorweb;
    public FieldDef finnro_borrador;
    public FieldDef finfechacobro;
    public FieldDef finfacturacion;
    public FieldDef finhonorrenta;
    public FieldDef finhonorpat;
    public FieldDef finhonoract;
    public FieldDef finhonorborra;
    public FieldDef finimppagado;
    public FieldDef finimpcobrado;
    public FieldDef finselistapatr;
    public FieldDef fincomptrabajo;
    public FieldDef fincompespecial;
    public FieldDef fincompmasnegat;
    public FieldDef fincompotros;
    public FieldDef fincomptraslado;
    public FieldDef findeclaracion2;
    public FieldDef findeclaracion3;
    public FieldDef findeclaracion4;
    public TabFinalizacion(String name)
      {
      super(name);
      finejeraplic = new FieldDef("finejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      findeclaran = new FieldDef("findeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      finmuf = new FieldDef("finmuf",FieldDef.CHAR,1);
      findeclaracion = new FieldDef("findeclaracion",FieldDef.INTEGER,0);
      finordsim = new FieldDef("finordsim",FieldDef.CHAR,1);
      finpatrimonio = new FieldDef("finpatrimonio",FieldDef.CHAR,1);
      finobligrenta = new FieldDef("finobligrenta",FieldDef.CHAR,1);
      finselistarenta = new FieldDef("finselistarenta",FieldDef.CHAR,1);
      finsepuelistar = new FieldDef("finsepuelistar",FieldDef.CHAR,1);
      finsuspenpago = new FieldDef("finsuspenpago",FieldDef.CHAR,1);
      finingreso = new FieldDef("finingreso",FieldDef.CHAR,2);
      fincobro = new FieldDef("fincobro",FieldDef.CHAR,2);
      finaplazado = new FieldDef("finaplazado",FieldDef.CHAR,1);
      finiglesia = new FieldDef("finiglesia",FieldDef.CHAR,1);
      finalertassms = new FieldDef("finalertassms",FieldDef.CHAR,1);
      finborrador = new FieldDef("finborrador",FieldDef.CHAR,1);
      fintborrador = new FieldDef("fintborrador",FieldDef.CHAR,1);
      finconfborrador = new FieldDef("finconfborrador",FieldDef.CHAR,1);
      finborradorweb = new FieldDef("finborradorweb",FieldDef.CHAR,1);
      finnro_borrador = new FieldDef("finnro_borrador",FieldDef.CHAR,30);
      finfechacobro = new FieldDef("finfechacobro",FieldDef.DATE);
      finfacturacion = new FieldDef("finfacturacion",FieldDef.CHAR,1);
      finhonorrenta = new FieldDef("finhonorrenta",FieldDef.FLOAT,6,0);
      finhonorpat = new FieldDef("finhonorpat",FieldDef.FLOAT,6,0);
      finhonoract = new FieldDef("finhonoract",FieldDef.FLOAT,6,0);
      finhonorborra = new FieldDef("finhonorborra",FieldDef.FLOAT,6,0);
      finimppagado = new FieldDef("finimppagado",FieldDef.FLOAT,6,0);
      finimpcobrado = new FieldDef("finimpcobrado",FieldDef.FLOAT,6,0);
      finselistapatr = new FieldDef("finselistapatr",FieldDef.CHAR,1);
      fincomptrabajo = new FieldDef("fincomptrabajo",FieldDef.CHAR,1);
      fincompespecial = new FieldDef("fincompespecial",FieldDef.CHAR,1);
      fincompmasnegat = new FieldDef("fincompmasnegat",FieldDef.CHAR,1);
      fincompotros = new FieldDef("fincompotros",FieldDef.CHAR,1);
      fincomptraslado = new FieldDef("fincomptraslado",FieldDef.CHAR,1);
      findeclaracion2 = new FieldDef("findeclaracion2",FieldDef.INTEGER,0);
      findeclaracion3 = new FieldDef("findeclaracion3",FieldDef.INTEGER,0);
      findeclaracion4 = new FieldDef("findeclaracion4",FieldDef.INTEGER,0);
      FieldDef array[] = {
        finejeraplic,
        findeclaran,
        finmuf,
        findeclaracion,
        finordsim,
        finpatrimonio,
        finobligrenta,
        finselistarenta,
        finsepuelistar,
        finsuspenpago,
        finingreso,
        fincobro,
        finaplazado,
        finiglesia,
        finalertassms,
        finborrador,
        fintborrador,
        finconfborrador,
        finborradorweb,
        finnro_borrador,
        finfechacobro,
        finfacturacion,
        finhonorrenta,
        finhonorpat,
        finhonoract,
        finhonorborra,
        finimppagado,
        finimpcobrado,
        finselistapatr,
        fincomptrabajo,
        fincompespecial,
        fincompmasnegat,
        fincompotros,
        fincomptraslado,
        findeclaracion2,
        findeclaracion3,
        findeclaracion4        
        };
      setColumns(array);
      FieldDef arrayf[] = {finejeraplic,findeclaran,finmuf };
      setDescription("Finalizacion renta y datos adicionales");
      setPrimaryKeys(arrayf);
      finejeraplic.setDescription("Ejercicio aplicacion");
      findeclaran.setDescription("CODIGO DE DECLARANTE");
      finmuf.setDescription("M.U.F.");
      findeclaracion.setDescription("Codigo Declaracion");
      finordsim.setDescription("Ordinaria/Simplificada");
      finpatrimonio.setDescription("Patrimonio");
      finobligrenta.setDescription("Obligacion de hacer Renta");
      finselistarenta.setDescription("Se Lista Renta");
      finsepuelistar.setDescription("Se Puede Listar");
      finsuspenpago.setDescription("Solicita suspension Renta");
      finingreso.setDescription("Forma de Ingreso");
      fincobro.setDescription("Forma de Cobro");
      finaplazado.setDescription("Pago Aplazado");
      finiglesia.setDescription("Iglesia/Obra Soc.");
      finalertassms.setDescription("Servicio de alerta a moviles");
      finborrador.setDescription("Borrador declaracion");
      fintborrador.setDescription("Borrador individual dec.conj.");
      finconfborrador.setDescription("Confirmacion borrador");
      finborradorweb.setDescription("Borrador en pagina web");
      finnro_borrador.setDescription("Referencia");
      finfechacobro.setDescription("Fecha cobro honorarios");
      finfacturacion.setDescription("Facturacion");
      finhonorrenta.setDescription("Honorarios Renta");
      finhonorpat.setDescription("Honorarios Patrim.");
      finhonoract.setDescription("Honorarios 2.Plazo");
      finhonorborra.setDescription("Honorarios Borrador");
      finimppagado.setDescription("Importe a ingresar declaracion anterior");
      finimpcobrado.setDescription("Importe cobrado declaracion anterior");
      finselistapatr.setDescription("Se Lista Patrimonio");
      fincomptrabajo.setDescription("Complementaria atrasos trabajo");
      fincompespecial.setDescription("Complementaria por supuestos especiales");
      fincompmasnegat.setDescription("Complementaria cantidad inferior a original");
      fincompotros.setDescription("Complementaria otros supuestos");
      fincomptraslado.setDescription("Complementaria por traslado residencia a UE");
      findeclaracion2.setDescription("Codigo Declaracion 2");
      findeclaracion3.setDescription("Codigo Declaracion 3");
      findeclaracion4.setDescription("Codigo Declaracion 4");
      }
    }
    
  public class TabEnlaexp extends TableDef
    {
    // Campos
    public FieldDef exejeraplic;
    public FieldDef exdeclaran;
    public FieldDef exasesor;
    public FieldDef exgeshonrenta;
    public FieldDef extrahonrenta;
    public FieldDef exhonrentaconj;
    public FieldDef exgesrentasep;
    public FieldDef extrarentasep;
    public FieldDef exhonrentasep;
    public FieldDef exdesglosrenta;
    public FieldDef exgeshonpatrim;
    public FieldDef extrahonpatrim;
    public FieldDef exhonpatrimcon;
    public FieldDef exgespatrimsep;
    public FieldDef extrapatrimsep;
    public FieldDef exhonpatrimsep;
    public FieldDef exgeshonadic;
    public FieldDef extrahonadic;
    public FieldDef exhonadicconj;
    public FieldDef exhonadicsep;
    public FieldDef exdesglosadic;
    public FieldDef exgessuprenta;
    public FieldDef extrasuprenta;
    public FieldDef exsuprentaconj;
    public FieldDef exsuprentasep;
    public FieldDef exdesglossupren;
    public FieldDef exgessuppatrim;
    public FieldDef extrasuppatrim;
    public FieldDef exsuppatrimsep;
    public FieldDef exdesglossuppat;
    public FieldDef exexpediente;
    public FieldDef extipo;
    public FieldDef excodigo;
    public FieldDef exclient;
    public FieldDef exformfactura;
    public FieldDef exirpf;
    public FieldDef exscta;
    public FieldDef extipoconta;
    public FieldDef exempconta;
    public FieldDef exiva;
    public FieldDef exdomiciliacion;
    public FieldDef exnumdomi;
    public FieldDef exestado;
    public FieldDef exenlace;
    public FieldDef exusuario;
    public FieldDef extipoiva;
    public FieldDef exctaingreso;
    public FieldDef exctadevoluc;
    public TabEnlaexp(String name)
      {
      super(name);
      exejeraplic = new FieldDef("exejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      exdeclaran = new FieldDef("exdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      exasesor = new FieldDef("exasesor",FieldDef.INTEGER,0);
      exgeshonrenta = new FieldDef("exgeshonrenta",FieldDef.CHAR,15);
      extrahonrenta = new FieldDef("extrahonrenta",FieldDef.INTEGER,0);
      exhonrentaconj = new FieldDef("exhonrentaconj",FieldDef.FLOAT,6,0);
      exgesrentasep = new FieldDef("exgesrentasep",FieldDef.CHAR,15);
      extrarentasep = new FieldDef("extrarentasep",FieldDef.INTEGER,0);
      exhonrentasep = new FieldDef("exhonrentasep",FieldDef.FLOAT,6,0);
      exdesglosrenta = new FieldDef("exdesglosrenta",FieldDef.CHAR,1);
      exgeshonpatrim = new FieldDef("exgeshonpatrim",FieldDef.CHAR,15);
      extrahonpatrim = new FieldDef("extrahonpatrim",FieldDef.INTEGER,0);
      exhonpatrimcon = new FieldDef("exhonpatrimcon",FieldDef.FLOAT,6,0);
      exgespatrimsep = new FieldDef("exgespatrimsep",FieldDef.CHAR,15);
      extrapatrimsep = new FieldDef("extrapatrimsep",FieldDef.INTEGER,0);
      exhonpatrimsep = new FieldDef("exhonpatrimsep",FieldDef.FLOAT,6,0);
      exgeshonadic = new FieldDef("exgeshonadic",FieldDef.CHAR,15);
      extrahonadic = new FieldDef("extrahonadic",FieldDef.INTEGER,0);
      exhonadicconj = new FieldDef("exhonadicconj",FieldDef.FLOAT,6,0);
      exhonadicsep = new FieldDef("exhonadicsep",FieldDef.FLOAT,6,0);
      exdesglosadic = new FieldDef("exdesglosadic",FieldDef.CHAR,1);
      exgessuprenta = new FieldDef("exgessuprenta",FieldDef.CHAR,15);
      extrasuprenta = new FieldDef("extrasuprenta",FieldDef.INTEGER,0);
      exsuprentaconj = new FieldDef("exsuprentaconj",FieldDef.CHAR,1);
      exsuprentasep = new FieldDef("exsuprentasep",FieldDef.CHAR,1);
      exdesglossupren = new FieldDef("exdesglossupren",FieldDef.CHAR,1);
      exgessuppatrim = new FieldDef("exgessuppatrim",FieldDef.CHAR,15);
      extrasuppatrim = new FieldDef("extrasuppatrim",FieldDef.INTEGER,0);
      exsuppatrimsep = new FieldDef("exsuppatrimsep",FieldDef.CHAR,1);
      exdesglossuppat = new FieldDef("exdesglossuppat",FieldDef.CHAR,1);
      exexpediente = new FieldDef("exexpediente",FieldDef.CHAR,15);
      extipo = new FieldDef("extipo",FieldDef.CHAR,3);
      excodigo = new FieldDef("excodigo",FieldDef.CHAR,12);
      exclient = new FieldDef("exclient",FieldDef.CHAR,15);
      exformfactura = new FieldDef("exformfactura",FieldDef.CHAR,2);
      exirpf = new FieldDef("exirpf",FieldDef.CHAR,1);
      exscta = new FieldDef("exscta",FieldDef.CHAR,10);
      extipoconta = new FieldDef("extipoconta",FieldDef.INTEGER,0);
      exempconta = new FieldDef("exempconta",FieldDef.INTEGER,0);
      exiva = new FieldDef("exiva",FieldDef.FLOAT,6,0);
      exdomiciliacion = new FieldDef("exdomiciliacion",FieldDef.CHAR,1);
      exnumdomi = new FieldDef("exnumdomi",FieldDef.INTEGER,0);
      exestado = new FieldDef("exestado",FieldDef.CHAR,1);
      exenlace = new FieldDef("exenlace",FieldDef.CHAR,1);
      exusuario = new FieldDef("exusuario",FieldDef.CHAR,25);
      extipoiva = new FieldDef("extipoiva",FieldDef.INTEGER,0);
      exctaingreso = new FieldDef("exctaingreso",FieldDef.CHAR,1);
      exctadevoluc = new FieldDef("exctadevoluc",FieldDef.CHAR,1);
      FieldDef array[] = {
        exejeraplic,
        exdeclaran,
        exasesor,
        exgeshonrenta,
        extrahonrenta,
        exhonrentaconj,
        exgesrentasep,
        extrarentasep,
        exhonrentasep,
        exdesglosrenta,
        exgeshonpatrim,
        extrahonpatrim,
        exhonpatrimcon,
        exgespatrimsep,
        extrapatrimsep,
        exhonpatrimsep,
        exgeshonadic,
        extrahonadic,
        exhonadicconj,
        exhonadicsep,
        exdesglosadic,
        exgessuprenta,
        extrasuprenta,
        exsuprentaconj,
        exsuprentasep,
        exdesglossupren,
        exgessuppatrim,
        extrasuppatrim,
        exsuppatrimsep,
        exdesglossuppat,
        exexpediente,
        extipo,
        excodigo,
        exclient,
        exformfactura,
        exirpf,
        exscta,
        extipoconta,
        exempconta,
        exiva,
        exdomiciliacion,
        exnumdomi,
        exestado,
        exenlace,
        exusuario,
        extipoiva,
        exctaingreso,
        exctadevoluc        
        };
      setColumns(array);
      FieldDef arrayf[] = {exejeraplic,exdeclaran };
      setDescription("Datos Enlace con JGestion");
      setPrimaryKeys(arrayf);
      exejeraplic.setDescription("Ejercicio aplicacion");
      exdeclaran.setDescription("CODIGO DE DECLARANTE");
      exctaingreso.setDescription("S/N traslladar cta ingres de jRenta a jGestio");
      exctadevoluc.setDescription("S/N traslladar cta devolucio de jRenta a jGestio");
      }
    }
    
  public class TabRdtoactividaed extends TableDef
    {
    // Campos
    public FieldDef radejeraplic;
    public FieldDef raddeclaran;
    public FieldDef radidentactiv;
    public FieldDef radingreso1;
    public FieldDef radingreso2;
    public FieldDef radingreso3;
    public FieldDef radingreso4;
    public FieldDef radingreso5;
    public FieldDef radtotingresos;
    public FieldDef radgastos1;
    public FieldDef radgastos2;
    public FieldDef radgastos3;
    public FieldDef radgastos4;
    public FieldDef radgastos5;
    public FieldDef radgastos6;
    public FieldDef radgastos7;
    public FieldDef radgastos8;
    public FieldDef radgastos9;
    public FieldDef radgastos10;
    public FieldDef radgastos11;
    public FieldDef radgastos12;
    public FieldDef radgastos13;
    public FieldDef radgastos14;
    public FieldDef radgastos15;
    public FieldDef radgastos16;
    public FieldDef radtotalgastos;
    public FieldDef raddiferencia;
    public FieldDef radporgastos;
    public FieldDef radgastos17;
    public FieldDef radrendimiento;
    public FieldDef radaplicirreg;
    public FieldDef radredirregular;
    public FieldDef radimpredirregu;
    public FieldDef radapliccopaame;
    public FieldDef radredcopaameri;
    public FieldDef radimpredcopaam;
    public FieldDef radrdtonetoredu;
    public FieldDef radaplreduc322;
    public FieldDef radaplredempleo;
    public FieldDef radingreso6;
    public FieldDef radsalarios;
    public FieldDef radaplrednueva;
    public TabRdtoactividaed(String name)
      {
      super(name);
      radejeraplic = new FieldDef("radejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      raddeclaran = new FieldDef("raddeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      radidentactiv = new FieldDef("radidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      radingreso1 = new FieldDef("radingreso1",FieldDef.FLOAT,6,0);
      radingreso2 = new FieldDef("radingreso2",FieldDef.FLOAT,6,0);
      radingreso3 = new FieldDef("radingreso3",FieldDef.FLOAT,6,0);
      radingreso4 = new FieldDef("radingreso4",FieldDef.FLOAT,6,0);
      radingreso5 = new FieldDef("radingreso5",FieldDef.FLOAT,6,0);
      radtotingresos = new FieldDef("radtotingresos",FieldDef.FLOAT,6,0);
      radgastos1 = new FieldDef("radgastos1",FieldDef.FLOAT,6,0);
      radgastos2 = new FieldDef("radgastos2",FieldDef.FLOAT,6,0);
      radgastos3 = new FieldDef("radgastos3",FieldDef.FLOAT,6,0);
      radgastos4 = new FieldDef("radgastos4",FieldDef.FLOAT,6,0);
      radgastos5 = new FieldDef("radgastos5",FieldDef.FLOAT,6,0);
      radgastos6 = new FieldDef("radgastos6",FieldDef.FLOAT,6,0);
      radgastos7 = new FieldDef("radgastos7",FieldDef.FLOAT,6,0);
      radgastos8 = new FieldDef("radgastos8",FieldDef.FLOAT,6,0);
      radgastos9 = new FieldDef("radgastos9",FieldDef.FLOAT,6,0);
      radgastos10 = new FieldDef("radgastos10",FieldDef.FLOAT,6,0);
      radgastos11 = new FieldDef("radgastos11",FieldDef.FLOAT,6,0);
      radgastos12 = new FieldDef("radgastos12",FieldDef.FLOAT,6,0);
      radgastos13 = new FieldDef("radgastos13",FieldDef.FLOAT,6,0);
      radgastos14 = new FieldDef("radgastos14",FieldDef.FLOAT,6,0);
      radgastos15 = new FieldDef("radgastos15",FieldDef.FLOAT,6,0);
      radgastos16 = new FieldDef("radgastos16",FieldDef.FLOAT,6,0);
      radtotalgastos = new FieldDef("radtotalgastos",FieldDef.FLOAT,6,0);
      raddiferencia = new FieldDef("raddiferencia",FieldDef.FLOAT,6,0);
      radporgastos = new FieldDef("radporgastos",FieldDef.FLOAT,6,0);
      radgastos17 = new FieldDef("radgastos17",FieldDef.FLOAT,6,0);
      radrendimiento = new FieldDef("radrendimiento",FieldDef.FLOAT,6,0);
      radaplicirreg = new FieldDef("radaplicirreg",FieldDef.CHAR,1);
      radredirregular = new FieldDef("radredirregular",FieldDef.INTEGER,0);
      radimpredirregu = new FieldDef("radimpredirregu",FieldDef.FLOAT,6,0);
      radapliccopaame = new FieldDef("radapliccopaame",FieldDef.CHAR,1);
      radredcopaameri = new FieldDef("radredcopaameri",FieldDef.INTEGER,0);
      radimpredcopaam = new FieldDef("radimpredcopaam",FieldDef.FLOAT,6,0);
      radrdtonetoredu = new FieldDef("radrdtonetoredu",FieldDef.FLOAT,6,0);
      radaplreduc322 = new FieldDef("radaplreduc322",FieldDef.CHAR,1);
      radaplredempleo = new FieldDef("radaplredempleo",FieldDef.CHAR,1);
      radingreso6 = new FieldDef("radingreso6",FieldDef.FLOAT,6,0);
      radsalarios = new FieldDef("radsalarios",FieldDef.FLOAT,6,0);
      radaplrednueva = new FieldDef("radaplrednueva",FieldDef.CHAR,1);
      FieldDef array[] = {
        radejeraplic,
        raddeclaran,
        radidentactiv,
        radingreso1,
        radingreso2,
        radingreso3,
        radingreso4,
        radingreso5,
        radtotingresos,
        radgastos1,
        radgastos2,
        radgastos3,
        radgastos4,
        radgastos5,
        radgastos6,
        radgastos7,
        radgastos8,
        radgastos9,
        radgastos10,
        radgastos11,
        radgastos12,
        radgastos13,
        radgastos14,
        radgastos15,
        radgastos16,
        radtotalgastos,
        raddiferencia,
        radporgastos,
        radgastos17,
        radrendimiento,
        radaplicirreg,
        radredirregular,
        radimpredirregu,
        radapliccopaame,
        radredcopaameri,
        radimpredcopaam,
        radrdtonetoredu,
        radaplreduc322,
        radaplredempleo,
        radingreso6,
        radsalarios,
        radaplrednueva        
        };
      setColumns(array);
      FieldDef arrayf[] = {radejeraplic,raddeclaran,radidentactiv };
      setDescription("Rendimiento actividades ED/EDS");
      setPrimaryKeys(arrayf);
      radejeraplic.setDescription("Ejercicio aplicacion");
      raddeclaran.setDescription("CODIGO DE DECLARANTE");
      radidentactiv.setDescription("Identificador actividad");
      radingreso1.setDescription("Ingresos de Explotacion");
      radingreso2.setDescription("Otros ingresos");
      radingreso3.setDescription("Autoconsumo de bienes");
      radingreso4.setDescription("Subvenciones");
      radingreso5.setDescription("Ayudas Ley 3/2010");
      radtotingresos.setDescription("Total ingresos");
      radgastos1.setDescription("Consumos de Explotacion");
      radgastos2.setDescription("Sueldos y Salarios");
      radgastos3.setDescription("Seguridad Social");
      radgastos4.setDescription("Otros Gastos Personal");
      radgastos5.setDescription("Arrendamientos y Canones");
      radgastos6.setDescription("Reparaciones y Conservacion");
      radgastos7.setDescription("Servicios Profesionales");
      radgastos8.setDescription("Otros Servicios Exteriores");
      radgastos9.setDescription("Tributos Deducibles");
      radgastos10.setDescription("Gastos Financieros");
      radgastos11.setDescription("Amortizacion: dotaciones deducibles");
      radgastos12.setDescription("Deterioro patrimonial");
      radgastos13.setDescription("Incentivos Mecenazgo.Convenios");
      radgastos14.setDescription("Incentivos Mecenazgo. Gastos");
      radgastos15.setDescription("Otros Gastos");
      radgastos16.setDescription("Provisiones: dotacion deducibles solo ED");
      radtotalgastos.setDescription("Total gastos");
      raddiferencia.setDescription("Ingresos - gastos");
      radporgastos.setDescription("% Gastos Dificil Justificacion");
      radgastos17.setDescription("Provisiones y Gastos Dificil Justificacion");
      radrendimiento.setDescription("Rendimiento Neto");
      radaplicirreg.setDescription("Aplicar reduccion irregular");
      radredirregular.setDescription("% reductor irregular");
      radimpredirregu.setDescription("Importe reduccion irregular");
      radapliccopaame.setDescription("Aplicar reduccion Copa America");
      radredcopaameri.setDescription("Reductor Copa America");
      radimpredcopaam.setDescription("Importe reduccion Copa America");
      radrdtonetoredu.setDescription("Rendimiento neto reducido");
      radaplreduc322.setDescription("Aplicar reduc. Art.32.2");
      radaplredempleo.setDescription("Aplicar reduc. creacion empleo");
      radingreso6.setDescription("Ingreso: Transmision elem.patrimon.con libertad amortizacion");
      radsalarios.setDescription("Salarios x reduc.creacion empleo");
      radaplrednueva.setDescription("Aplicar reduc. Nova activitat directa Art.32.3");
      }
    }
    
  public class TabLiquidaanexoa2 extends TableDef
    {
    // Campos
    public FieldDef la2ejeraplic;
    public FieldDef la2declaran;
    public FieldDef la2muf;
    public FieldDef la2tipocalculo;
    public FieldDef la2ceutadeduc;
    public FieldDef la2caecantidad;
    public FieldDef la2caededuccion;
    public FieldDef la2caetit1;
    public FieldDef la2caefecha1;
    public FieldDef la2caebanco1;
    public FieldDef la2caeofici1;
    public FieldDef la2caedigit1;
    public FieldDef la2caencta1;
    public FieldDef la2caetit2;
    public FieldDef la2caefecha2;
    public FieldDef la2caebanco2;
    public FieldDef la2caeofici2;
    public FieldDef la2caedigit2;
    public FieldDef la2caencta2;
    public FieldDef la2invant1iniej;
    public FieldDef la2invant1aplic;
    public FieldDef la2invant1pdte;
    public FieldDef la2invant2iniej;
    public FieldDef la2invant2aplic;
    public FieldDef la2invant2pdte;
    public FieldDef la2invidiniej;
    public FieldDef la2invidaplic;
    public FieldDef la2invidpdte;
    public FieldDef la2invticiniej;
    public FieldDef la2invticaplic;
    public FieldDef la2invticpdte;
    public FieldDef la2inveeiniej;
    public FieldDef la2inveeaplic;
    public FieldDef la2inveepdte;
    public FieldDef la2inva38iniej;
    public FieldDef la2inva38aplic;
    public FieldDef la2inva38pdte;
    public FieldDef la2invpmainiej;
    public FieldDef la2invpmaaplic;
    public FieldDef la2invpmapdte;
    public FieldDef la2invfpiniej;
    public FieldDef la2invfpaplic;
    public FieldDef la2invfppdte;
    public FieldDef la2invceiniej;
    public FieldDef la2invceaplic;
    public FieldDef la2invcepdte;
    public FieldDef la2inva43iniej;
    public FieldDef la2inva43aplic;
    public FieldDef la2inva43pdte;
    public FieldDef la2invalviniej;
    public FieldDef la2invalvaplic;
    public FieldDef la2invalvpdte;
    public FieldDef la2invbwriniej;
    public FieldDef la2invbwraplic;
    public FieldDef la2invbwrpdte;
    public FieldDef la2invgcainiej;
    public FieldDef la2invgcaaplic;
    public FieldDef la2invgcapdte;
    public FieldDef la2invgrhiniej;
    public FieldDef la2invgrhaplic;
    public FieldDef la2invgrhpdte;
    public FieldDef la2invcbciniej;
    public FieldDef la2invcbcaplic;
    public FieldDef la2invcbcpdte;
    public FieldDef la2invloniniej;
    public FieldDef la2invlonaplic;
    public FieldDef la2invlonpdte;
    public FieldDef la2invasjiniej;
    public FieldDef la2invasjaplic;
    public FieldDef la2invasjpdte;
    public FieldDef la2invajciniej;
    public FieldDef la2invajcaplic;
    public FieldDef la2invajcpdte;
    public FieldDef la2invcajiniej;
    public FieldDef la2invcajaplic;
    public FieldDef la2invcajpdte;
    public FieldDef la2invalziniej;
    public FieldDef la2invalzaplic;
    public FieldDef la2invalzpdte;
    public FieldDef la2invahoiniej;
    public FieldDef la2invahoaplic;
    public FieldDef la2invahopdte;
    public FieldDef la2invccbiniej;
    public FieldDef la2invccbaplic;
    public FieldDef la2invccbpdte;
    public FieldDef la2invsiainiej;
    public FieldDef la2invsiaaplic;
    public FieldDef la2invsiapdte;
    public FieldDef la2invelxiniej;
    public FieldDef la2invelxaplic;
    public FieldDef la2invelxpdte;
    public FieldDef la2invjguiniej;
    public FieldDef la2invjguaplic;
    public FieldDef la2invjgupdte;
    public FieldDef la2invjmjiniej;
    public FieldDef la2invjmjaplic;
    public FieldDef la2invjmjpdte;
    public FieldDef la2invcrginiej;
    public FieldDef la2invcrgaplic;
    public FieldDef la2invcrgpdte;
    public FieldDef la2invsdeiniej;
    public FieldDef la2invsdeaplic;
    public FieldDef la2invsdepdte;
    public FieldDef la2invglxiniej;
    public FieldDef la2invglxaplic;
    public FieldDef la2invglxpdte;
    public FieldDef la2invaoriniej;
    public FieldDef la2invaoraplic;
    public FieldDef la2invaorpdte;
    public FieldDef la2invmbainiej;
    public FieldDef la2invmbaaplic;
    public FieldDef la2invmbapdte;
    public FieldDef la2invcmbiniej;
    public FieldDef la2invcmbaplic;
    public FieldDef la2invcmbpdte;
    public FieldDef la2invbneiniej;
    public FieldDef la2invbneaplic;
    public FieldDef la2invbnepdte;
    public FieldDef la2invgreiniej;
    public FieldDef la2invgreaplic;
    public FieldDef la2invgrepdte;
    public FieldDef la2invcsciniej;
    public FieldDef la2invcscaplic;
    public FieldDef la2invcscpdte;
    public FieldDef la2invvcviniej;
    public FieldDef la2invvcvaplic;
    public FieldDef la2invvcvpdte;
    public FieldDef la2invcmviniej;
    public FieldDef la2invcmvaplic;
    public FieldDef la2invcmvpdte;
    public FieldDef la2invaeviniej;
    public FieldDef la2invaevaplic;
    public FieldDef la2invaevpdte;
    public FieldDef la2invcejiniej;
    public FieldDef la2invcejaplic;
    public FieldDef la2invcejpdte;
    public FieldDef la2invrpliniej;
    public FieldDef la2invrplaplic;
    public FieldDef la2invrplpdte;
    public FieldDef la2invfjiiniej;
    public FieldDef la2invfjiaplic;
    public FieldDef la2invfjipdte;
    public FieldDef la2invuiginiej;
    public FieldDef la2invuigaplic;
    public FieldDef la2invuigpdte;
    public FieldDef la2invccpiniej;
    public FieldDef la2invccpaplic;
    public FieldDef la2invccppdte;
    public FieldDef la2invcariniej;
    public FieldDef la2invcaraplic;
    public FieldDef la2invcarpdte;
    public FieldDef la2invbwjiniej;
    public FieldDef la2invbwjaplic;
    public FieldDef la2invbwjpdte;
    public FieldDef la2invcnbiniej;
    public FieldDef la2invcnbaplic;
    public FieldDef la2invcnbpdte;
    public FieldDef la2invbmwiniej;
    public FieldDef la2invbmwaplic;
    public FieldDef la2invbmwpdte;
    public FieldDef la2invpariniej;
    public FieldDef la2invparaplic;
    public FieldDef la2invparpdte;
    public FieldDef la2invctoiniej;
    public FieldDef la2invctoaplic;
    public FieldDef la2invctopdte;
    public FieldDef la2invcbpiniej;
    public FieldDef la2invcbpaplic;
    public FieldDef la2invcbppdte;
    public FieldDef la2invcpliniej;
    public FieldDef la2invcplaplic;
    public FieldDef la2invcplpdte;
    public FieldDef la2invcaniniej;
    public FieldDef la2invcanaplic;
    public FieldDef la2invcanpdte;
    public FieldDef la2invcbniniej;
    public FieldDef la2invcbnaplic;
    public FieldDef la2invcbnpdte;
    public FieldDef la2invajminiej;
    public FieldDef la2invajmaplic;
    public FieldDef la2invajmpdte;
    public FieldDef la2invcmoiniej;
    public FieldDef la2invcmoaplic;
    public FieldDef la2invcmopdte;
    public FieldDef la2invdiminiej;
    public FieldDef la2invdimaplic;
    public FieldDef la2invdimpdte;
    public FieldDef la2invceeiniej;
    public FieldDef la2invceeaplic;
    public FieldDef la2invceepdte;
    public FieldDef la2invce2iniej;
    public FieldDef la2invce2aplic;
    public FieldDef la2invce2pdte;
    public FieldDef la2invjrjiniej;
    public FieldDef la2invjrjaplic;
    public FieldDef la2invjrjpdte;
    public FieldDef la2invcsfiniej;
    public FieldDef la2invcsfaplic;
    public FieldDef la2invcsfpdte;
    public FieldDef la2invcsjiniej;
    public FieldDef la2invcsjaplic;
    public FieldDef la2invcsjpdte;
    public FieldDef la2invajuiniej;
    public FieldDef la2invajuaplic;
    public FieldDef la2invajupdte;
    public FieldDef la2invajsiniej;
    public FieldDef la2invajsaplic;
    public FieldDef la2invajspdte;
    public FieldDef la2invsaviniej;
    public FieldDef la2invsavaplic;
    public FieldDef la2invsavpdte;
    public TabLiquidaanexoa2(String name)
      {
      super(name);
      la2ejeraplic = new FieldDef("la2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      la2declaran = new FieldDef("la2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      la2muf = new FieldDef("la2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      la2tipocalculo = new FieldDef("la2tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      la2ceutadeduc = new FieldDef("la2ceutadeduc",FieldDef.FLOAT,6,0);
      la2caecantidad = new FieldDef("la2caecantidad",FieldDef.FLOAT,6,0);
      la2caededuccion = new FieldDef("la2caededuccion",FieldDef.FLOAT,6,0);
      la2caetit1 = new FieldDef("la2caetit1",FieldDef.CHAR,1);
      la2caefecha1 = new FieldDef("la2caefecha1",FieldDef.DATE);
      la2caebanco1 = new FieldDef("la2caebanco1",FieldDef.INTEGER,0);
      la2caeofici1 = new FieldDef("la2caeofici1",FieldDef.INTEGER,0);
      la2caedigit1 = new FieldDef("la2caedigit1",FieldDef.INTEGER,0);
      la2caencta1 = new FieldDef("la2caencta1",FieldDef.CHAR,10);
      la2caetit2 = new FieldDef("la2caetit2",FieldDef.CHAR,1);
      la2caefecha2 = new FieldDef("la2caefecha2",FieldDef.DATE);
      la2caebanco2 = new FieldDef("la2caebanco2",FieldDef.INTEGER,0);
      la2caeofici2 = new FieldDef("la2caeofici2",FieldDef.INTEGER,0);
      la2caedigit2 = new FieldDef("la2caedigit2",FieldDef.INTEGER,0);
      la2caencta2 = new FieldDef("la2caencta2",FieldDef.CHAR,10);
      la2invant1iniej = new FieldDef("la2invant1iniej",FieldDef.FLOAT,6,0);
      la2invant1aplic = new FieldDef("la2invant1aplic",FieldDef.FLOAT,6,0);
      la2invant1pdte = new FieldDef("la2invant1pdte",FieldDef.FLOAT,6,0);
      la2invant2iniej = new FieldDef("la2invant2iniej",FieldDef.FLOAT,6,0);
      la2invant2aplic = new FieldDef("la2invant2aplic",FieldDef.FLOAT,6,0);
      la2invant2pdte = new FieldDef("la2invant2pdte",FieldDef.FLOAT,6,0);
      la2invidiniej = new FieldDef("la2invidiniej",FieldDef.FLOAT,6,0);
      la2invidaplic = new FieldDef("la2invidaplic",FieldDef.FLOAT,6,0);
      la2invidpdte = new FieldDef("la2invidpdte",FieldDef.FLOAT,6,0);
      la2invticiniej = new FieldDef("la2invticiniej",FieldDef.FLOAT,6,0);
      la2invticaplic = new FieldDef("la2invticaplic",FieldDef.FLOAT,6,0);
      la2invticpdte = new FieldDef("la2invticpdte",FieldDef.FLOAT,6,0);
      la2inveeiniej = new FieldDef("la2inveeiniej",FieldDef.FLOAT,6,0);
      la2inveeaplic = new FieldDef("la2inveeaplic",FieldDef.FLOAT,6,0);
      la2inveepdte = new FieldDef("la2inveepdte",FieldDef.FLOAT,6,0);
      la2inva38iniej = new FieldDef("la2inva38iniej",FieldDef.FLOAT,6,0);
      la2inva38aplic = new FieldDef("la2inva38aplic",FieldDef.FLOAT,6,0);
      la2inva38pdte = new FieldDef("la2inva38pdte",FieldDef.FLOAT,6,0);
      la2invpmainiej = new FieldDef("la2invpmainiej",FieldDef.FLOAT,6,0);
      la2invpmaaplic = new FieldDef("la2invpmaaplic",FieldDef.FLOAT,6,0);
      la2invpmapdte = new FieldDef("la2invpmapdte",FieldDef.FLOAT,6,0);
      la2invfpiniej = new FieldDef("la2invfpiniej",FieldDef.FLOAT,6,0);
      la2invfpaplic = new FieldDef("la2invfpaplic",FieldDef.FLOAT,6,0);
      la2invfppdte = new FieldDef("la2invfppdte",FieldDef.FLOAT,6,0);
      la2invceiniej = new FieldDef("la2invceiniej",FieldDef.FLOAT,6,0);
      la2invceaplic = new FieldDef("la2invceaplic",FieldDef.FLOAT,6,0);
      la2invcepdte = new FieldDef("la2invcepdte",FieldDef.FLOAT,6,0);
      la2inva43iniej = new FieldDef("la2inva43iniej",FieldDef.FLOAT,6,0);
      la2inva43aplic = new FieldDef("la2inva43aplic",FieldDef.FLOAT,6,0);
      la2inva43pdte = new FieldDef("la2inva43pdte",FieldDef.FLOAT,6,0);
      la2invalviniej = new FieldDef("la2invalviniej",FieldDef.FLOAT,6,0);
      la2invalvaplic = new FieldDef("la2invalvaplic",FieldDef.FLOAT,6,0);
      la2invalvpdte = new FieldDef("la2invalvpdte",FieldDef.FLOAT,6,0);
      la2invbwriniej = new FieldDef("la2invbwriniej",FieldDef.FLOAT,6,0);
      la2invbwraplic = new FieldDef("la2invbwraplic",FieldDef.FLOAT,6,0);
      la2invbwrpdte = new FieldDef("la2invbwrpdte",FieldDef.FLOAT,6,0);
      la2invgcainiej = new FieldDef("la2invgcainiej",FieldDef.FLOAT,6,0);
      la2invgcaaplic = new FieldDef("la2invgcaaplic",FieldDef.FLOAT,6,0);
      la2invgcapdte = new FieldDef("la2invgcapdte",FieldDef.FLOAT,6,0);
      la2invgrhiniej = new FieldDef("la2invgrhiniej",FieldDef.FLOAT,6,0);
      la2invgrhaplic = new FieldDef("la2invgrhaplic",FieldDef.FLOAT,6,0);
      la2invgrhpdte = new FieldDef("la2invgrhpdte",FieldDef.FLOAT,6,0);
      la2invcbciniej = new FieldDef("la2invcbciniej",FieldDef.FLOAT,6,0);
      la2invcbcaplic = new FieldDef("la2invcbcaplic",FieldDef.FLOAT,6,0);
      la2invcbcpdte = new FieldDef("la2invcbcpdte",FieldDef.FLOAT,6,0);
      la2invloniniej = new FieldDef("la2invloniniej",FieldDef.FLOAT,6,0);
      la2invlonaplic = new FieldDef("la2invlonaplic",FieldDef.FLOAT,6,0);
      la2invlonpdte = new FieldDef("la2invlonpdte",FieldDef.FLOAT,6,0);
      la2invasjiniej = new FieldDef("la2invasjiniej",FieldDef.FLOAT,6,0);
      la2invasjaplic = new FieldDef("la2invasjaplic",FieldDef.FLOAT,6,0);
      la2invasjpdte = new FieldDef("la2invasjpdte",FieldDef.FLOAT,6,0);
      la2invajciniej = new FieldDef("la2invajciniej",FieldDef.FLOAT,6,0);
      la2invajcaplic = new FieldDef("la2invajcaplic",FieldDef.FLOAT,6,0);
      la2invajcpdte = new FieldDef("la2invajcpdte",FieldDef.FLOAT,6,0);
      la2invcajiniej = new FieldDef("la2invcajiniej",FieldDef.FLOAT,6,0);
      la2invcajaplic = new FieldDef("la2invcajaplic",FieldDef.FLOAT,6,0);
      la2invcajpdte = new FieldDef("la2invcajpdte",FieldDef.FLOAT,6,0);
      la2invalziniej = new FieldDef("la2invalziniej",FieldDef.FLOAT,6,0);
      la2invalzaplic = new FieldDef("la2invalzaplic",FieldDef.FLOAT,6,0);
      la2invalzpdte = new FieldDef("la2invalzpdte",FieldDef.FLOAT,6,0);
      la2invahoiniej = new FieldDef("la2invahoiniej",FieldDef.FLOAT,6,0);
      la2invahoaplic = new FieldDef("la2invahoaplic",FieldDef.FLOAT,6,0);
      la2invahopdte = new FieldDef("la2invahopdte",FieldDef.FLOAT,6,0);
      la2invccbiniej = new FieldDef("la2invccbiniej",FieldDef.FLOAT,6,0);
      la2invccbaplic = new FieldDef("la2invccbaplic",FieldDef.FLOAT,6,0);
      la2invccbpdte = new FieldDef("la2invccbpdte",FieldDef.FLOAT,6,0);
      la2invsiainiej = new FieldDef("la2invsiainiej",FieldDef.FLOAT,6,0);
      la2invsiaaplic = new FieldDef("la2invsiaaplic",FieldDef.FLOAT,6,0);
      la2invsiapdte = new FieldDef("la2invsiapdte",FieldDef.FLOAT,6,0);
      la2invelxiniej = new FieldDef("la2invelxiniej",FieldDef.FLOAT,6,0);
      la2invelxaplic = new FieldDef("la2invelxaplic",FieldDef.FLOAT,6,0);
      la2invelxpdte = new FieldDef("la2invelxpdte",FieldDef.FLOAT,6,0);
      la2invjguiniej = new FieldDef("la2invjguiniej",FieldDef.FLOAT,6,0);
      la2invjguaplic = new FieldDef("la2invjguaplic",FieldDef.FLOAT,6,0);
      la2invjgupdte = new FieldDef("la2invjgupdte",FieldDef.FLOAT,6,0);
      la2invjmjiniej = new FieldDef("la2invjmjiniej",FieldDef.FLOAT,6,0);
      la2invjmjaplic = new FieldDef("la2invjmjaplic",FieldDef.FLOAT,6,0);
      la2invjmjpdte = new FieldDef("la2invjmjpdte",FieldDef.FLOAT,6,0);
      la2invcrginiej = new FieldDef("la2invcrginiej",FieldDef.FLOAT,6,0);
      la2invcrgaplic = new FieldDef("la2invcrgaplic",FieldDef.FLOAT,6,0);
      la2invcrgpdte = new FieldDef("la2invcrgpdte",FieldDef.FLOAT,6,0);
      la2invsdeiniej = new FieldDef("la2invsdeiniej",FieldDef.FLOAT,6,0);
      la2invsdeaplic = new FieldDef("la2invsdeaplic",FieldDef.FLOAT,6,0);
      la2invsdepdte = new FieldDef("la2invsdepdte",FieldDef.FLOAT,6,0);
      la2invglxiniej = new FieldDef("la2invglxiniej",FieldDef.FLOAT,6,0);
      la2invglxaplic = new FieldDef("la2invglxaplic",FieldDef.FLOAT,6,0);
      la2invglxpdte = new FieldDef("la2invglxpdte",FieldDef.FLOAT,6,0);
      la2invaoriniej = new FieldDef("la2invaoriniej",FieldDef.FLOAT,6,0);
      la2invaoraplic = new FieldDef("la2invaoraplic",FieldDef.FLOAT,6,0);
      la2invaorpdte = new FieldDef("la2invaorpdte",FieldDef.FLOAT,6,0);
      la2invmbainiej = new FieldDef("la2invmbainiej",FieldDef.FLOAT,6,0);
      la2invmbaaplic = new FieldDef("la2invmbaaplic",FieldDef.FLOAT,6,0);
      la2invmbapdte = new FieldDef("la2invmbapdte",FieldDef.FLOAT,6,0);
      la2invcmbiniej = new FieldDef("la2invcmbiniej",FieldDef.FLOAT,6,0);
      la2invcmbaplic = new FieldDef("la2invcmbaplic",FieldDef.FLOAT,6,0);
      la2invcmbpdte = new FieldDef("la2invcmbpdte",FieldDef.FLOAT,6,0);
      la2invbneiniej = new FieldDef("la2invbneiniej",FieldDef.FLOAT,6,0);
      la2invbneaplic = new FieldDef("la2invbneaplic",FieldDef.FLOAT,6,0);
      la2invbnepdte = new FieldDef("la2invbnepdte",FieldDef.FLOAT,6,0);
      la2invgreiniej = new FieldDef("la2invgreiniej",FieldDef.FLOAT,6,0);
      la2invgreaplic = new FieldDef("la2invgreaplic",FieldDef.FLOAT,6,0);
      la2invgrepdte = new FieldDef("la2invgrepdte",FieldDef.FLOAT,6,0);
      la2invcsciniej = new FieldDef("la2invcsciniej",FieldDef.FLOAT,6,0);
      la2invcscaplic = new FieldDef("la2invcscaplic",FieldDef.FLOAT,6,0);
      la2invcscpdte = new FieldDef("la2invcscpdte",FieldDef.FLOAT,6,0);
      la2invvcviniej = new FieldDef("la2invvcviniej",FieldDef.FLOAT,6,0);
      la2invvcvaplic = new FieldDef("la2invvcvaplic",FieldDef.FLOAT,6,0);
      la2invvcvpdte = new FieldDef("la2invvcvpdte",FieldDef.FLOAT,6,0);
      la2invcmviniej = new FieldDef("la2invcmviniej",FieldDef.FLOAT,6,0);
      la2invcmvaplic = new FieldDef("la2invcmvaplic",FieldDef.FLOAT,6,0);
      la2invcmvpdte = new FieldDef("la2invcmvpdte",FieldDef.FLOAT,6,0);
      la2invaeviniej = new FieldDef("la2invaeviniej",FieldDef.FLOAT,6,0);
      la2invaevaplic = new FieldDef("la2invaevaplic",FieldDef.FLOAT,6,0);
      la2invaevpdte = new FieldDef("la2invaevpdte",FieldDef.FLOAT,6,0);
      la2invcejiniej = new FieldDef("la2invcejiniej",FieldDef.FLOAT,6,0);
      la2invcejaplic = new FieldDef("la2invcejaplic",FieldDef.FLOAT,6,0);
      la2invcejpdte = new FieldDef("la2invcejpdte",FieldDef.FLOAT,6,0);
      la2invrpliniej = new FieldDef("la2invrpliniej",FieldDef.FLOAT,6,0);
      la2invrplaplic = new FieldDef("la2invrplaplic",FieldDef.FLOAT,6,0);
      la2invrplpdte = new FieldDef("la2invrplpdte",FieldDef.FLOAT,6,0);
      la2invfjiiniej = new FieldDef("la2invfjiiniej",FieldDef.FLOAT,6,0);
      la2invfjiaplic = new FieldDef("la2invfjiaplic",FieldDef.FLOAT,6,0);
      la2invfjipdte = new FieldDef("la2invfjipdte",FieldDef.FLOAT,6,0);
      la2invuiginiej = new FieldDef("la2invuiginiej",FieldDef.FLOAT,6,0);
      la2invuigaplic = new FieldDef("la2invuigaplic",FieldDef.FLOAT,6,0);
      la2invuigpdte = new FieldDef("la2invuigpdte",FieldDef.FLOAT,6,0);
      la2invccpiniej = new FieldDef("la2invccpiniej",FieldDef.FLOAT,6,0);
      la2invccpaplic = new FieldDef("la2invccpaplic",FieldDef.FLOAT,6,0);
      la2invccppdte = new FieldDef("la2invccppdte",FieldDef.FLOAT,6,0);
      la2invcariniej = new FieldDef("la2invcariniej",FieldDef.FLOAT,6,0);
      la2invcaraplic = new FieldDef("la2invcaraplic",FieldDef.FLOAT,6,0);
      la2invcarpdte = new FieldDef("la2invcarpdte",FieldDef.FLOAT,6,0);
      la2invbwjiniej = new FieldDef("la2invbwjiniej",FieldDef.FLOAT,6,0);
      la2invbwjaplic = new FieldDef("la2invbwjaplic",FieldDef.FLOAT,6,0);
      la2invbwjpdte = new FieldDef("la2invbwjpdte",FieldDef.FLOAT,6,0);
      la2invcnbiniej = new FieldDef("la2invcnbiniej",FieldDef.FLOAT,6,0);
      la2invcnbaplic = new FieldDef("la2invcnbaplic",FieldDef.FLOAT,6,0);
      la2invcnbpdte = new FieldDef("la2invcnbpdte",FieldDef.FLOAT,6,0);
      la2invbmwiniej = new FieldDef("la2invbmwiniej",FieldDef.FLOAT,6,0);
      la2invbmwaplic = new FieldDef("la2invbmwaplic",FieldDef.FLOAT,6,0);
      la2invbmwpdte = new FieldDef("la2invbmwpdte",FieldDef.FLOAT,6,0);
      la2invpariniej = new FieldDef("la2invpariniej",FieldDef.FLOAT,6,0);
      la2invparaplic = new FieldDef("la2invparaplic",FieldDef.FLOAT,6,0);
      la2invparpdte = new FieldDef("la2invparpdte",FieldDef.FLOAT,6,0);
      la2invctoiniej = new FieldDef("la2invctoiniej",FieldDef.FLOAT,6,0);
      la2invctoaplic = new FieldDef("la2invctoaplic",FieldDef.FLOAT,6,0);
      la2invctopdte = new FieldDef("la2invctopdte",FieldDef.FLOAT,6,0);
      la2invcbpiniej = new FieldDef("la2invcbpiniej",FieldDef.FLOAT,6,0);
      la2invcbpaplic = new FieldDef("la2invcbpaplic",FieldDef.FLOAT,6,0);
      la2invcbppdte = new FieldDef("la2invcbppdte",FieldDef.FLOAT,6,0);
      la2invcpliniej = new FieldDef("la2invcpliniej",FieldDef.FLOAT,6,0);
      la2invcplaplic = new FieldDef("la2invcplaplic",FieldDef.FLOAT,6,0);
      la2invcplpdte = new FieldDef("la2invcplpdte",FieldDef.FLOAT,6,0);
      la2invcaniniej = new FieldDef("la2invcaniniej",FieldDef.FLOAT,6,0);
      la2invcanaplic = new FieldDef("la2invcanaplic",FieldDef.FLOAT,6,0);
      la2invcanpdte = new FieldDef("la2invcanpdte",FieldDef.FLOAT,6,0);
      la2invcbniniej = new FieldDef("la2invcbniniej",FieldDef.FLOAT,6,0);
      la2invcbnaplic = new FieldDef("la2invcbnaplic",FieldDef.FLOAT,6,0);
      la2invcbnpdte = new FieldDef("la2invcbnpdte",FieldDef.FLOAT,6,0);
      la2invajminiej = new FieldDef("la2invajminiej",FieldDef.FLOAT,6,0);
      la2invajmaplic = new FieldDef("la2invajmaplic",FieldDef.FLOAT,6,0);
      la2invajmpdte = new FieldDef("la2invajmpdte",FieldDef.FLOAT,6,0);
      la2invcmoiniej = new FieldDef("la2invcmoiniej",FieldDef.FLOAT,6,0);
      la2invcmoaplic = new FieldDef("la2invcmoaplic",FieldDef.FLOAT,6,0);
      la2invcmopdte = new FieldDef("la2invcmopdte",FieldDef.FLOAT,6,0);
      la2invdiminiej = new FieldDef("la2invdiminiej",FieldDef.FLOAT,6,0);
      la2invdimaplic = new FieldDef("la2invdimaplic",FieldDef.FLOAT,6,0);
      la2invdimpdte = new FieldDef("la2invdimpdte",FieldDef.FLOAT,6,0);
      la2invceeiniej = new FieldDef("la2invceeiniej",FieldDef.FLOAT,6,0);
      la2invceeaplic = new FieldDef("la2invceeaplic",FieldDef.FLOAT,6,0);
      la2invceepdte = new FieldDef("la2invceepdte",FieldDef.FLOAT,6,0);
      la2invce2iniej = new FieldDef("la2invce2iniej",FieldDef.FLOAT,6,0);
      la2invce2aplic = new FieldDef("la2invce2aplic",FieldDef.FLOAT,6,0);
      la2invce2pdte = new FieldDef("la2invce2pdte",FieldDef.FLOAT,6,0);
      la2invjrjiniej = new FieldDef("la2invjrjiniej",FieldDef.FLOAT,6,0);
      la2invjrjaplic = new FieldDef("la2invjrjaplic",FieldDef.FLOAT,6,0);
      la2invjrjpdte = new FieldDef("la2invjrjpdte",FieldDef.FLOAT,6,0);
      la2invcsfiniej = new FieldDef("la2invcsfiniej",FieldDef.FLOAT,6,0);
      la2invcsfaplic = new FieldDef("la2invcsfaplic",FieldDef.FLOAT,6,0);
      la2invcsfpdte = new FieldDef("la2invcsfpdte",FieldDef.FLOAT,6,0);
      la2invcsjiniej = new FieldDef("la2invcsjiniej",FieldDef.FLOAT,6,0);
      la2invcsjaplic = new FieldDef("la2invcsjaplic",FieldDef.FLOAT,6,0);
      la2invcsjpdte = new FieldDef("la2invcsjpdte",FieldDef.FLOAT,6,0);
      la2invajuiniej = new FieldDef("la2invajuiniej",FieldDef.FLOAT,6,0);
      la2invajuaplic = new FieldDef("la2invajuaplic",FieldDef.FLOAT,6,0);
      la2invajupdte = new FieldDef("la2invajupdte",FieldDef.FLOAT,6,0);
      la2invajsiniej = new FieldDef("la2invajsiniej",FieldDef.FLOAT,6,0);
      la2invajsaplic = new FieldDef("la2invajsaplic",FieldDef.FLOAT,6,0);
      la2invajspdte = new FieldDef("la2invajspdte",FieldDef.FLOAT,6,0);
      la2invsaviniej = new FieldDef("la2invsaviniej",FieldDef.FLOAT,6,0);
      la2invsavaplic = new FieldDef("la2invsavaplic",FieldDef.FLOAT,6,0);
      la2invsavpdte = new FieldDef("la2invsavpdte",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        la2ejeraplic,
        la2declaran,
        la2muf,
        la2tipocalculo,
        la2ceutadeduc,
        la2caecantidad,
        la2caededuccion,
        la2caetit1,
        la2caefecha1,
        la2caebanco1,
        la2caeofici1,
        la2caedigit1,
        la2caencta1,
        la2caetit2,
        la2caefecha2,
        la2caebanco2,
        la2caeofici2,
        la2caedigit2,
        la2caencta2,
        la2invant1iniej,
        la2invant1aplic,
        la2invant1pdte,
        la2invant2iniej,
        la2invant2aplic,
        la2invant2pdte,
        la2invidiniej,
        la2invidaplic,
        la2invidpdte,
        la2invticiniej,
        la2invticaplic,
        la2invticpdte,
        la2inveeiniej,
        la2inveeaplic,
        la2inveepdte,
        la2inva38iniej,
        la2inva38aplic,
        la2inva38pdte,
        la2invpmainiej,
        la2invpmaaplic,
        la2invpmapdte,
        la2invfpiniej,
        la2invfpaplic,
        la2invfppdte,
        la2invceiniej,
        la2invceaplic,
        la2invcepdte,
        la2inva43iniej,
        la2inva43aplic,
        la2inva43pdte,
        la2invalviniej,
        la2invalvaplic,
        la2invalvpdte,
        la2invbwriniej,
        la2invbwraplic,
        la2invbwrpdte,
        la2invgcainiej,
        la2invgcaaplic,
        la2invgcapdte,
        la2invgrhiniej,
        la2invgrhaplic,
        la2invgrhpdte,
        la2invcbciniej,
        la2invcbcaplic,
        la2invcbcpdte,
        la2invloniniej,
        la2invlonaplic,
        la2invlonpdte,
        la2invasjiniej,
        la2invasjaplic,
        la2invasjpdte,
        la2invajciniej,
        la2invajcaplic,
        la2invajcpdte,
        la2invcajiniej,
        la2invcajaplic,
        la2invcajpdte,
        la2invalziniej,
        la2invalzaplic,
        la2invalzpdte,
        la2invahoiniej,
        la2invahoaplic,
        la2invahopdte,
        la2invccbiniej,
        la2invccbaplic,
        la2invccbpdte,
        la2invsiainiej,
        la2invsiaaplic,
        la2invsiapdte,
        la2invelxiniej,
        la2invelxaplic,
        la2invelxpdte,
        la2invjguiniej,
        la2invjguaplic,
        la2invjgupdte,
        la2invjmjiniej,
        la2invjmjaplic,
        la2invjmjpdte,
        la2invcrginiej,
        la2invcrgaplic,
        la2invcrgpdte,
        la2invsdeiniej,
        la2invsdeaplic,
        la2invsdepdte,
        la2invglxiniej,
        la2invglxaplic,
        la2invglxpdte,
        la2invaoriniej,
        la2invaoraplic,
        la2invaorpdte,
        la2invmbainiej,
        la2invmbaaplic,
        la2invmbapdte,
        la2invcmbiniej,
        la2invcmbaplic,
        la2invcmbpdte,
        la2invbneiniej,
        la2invbneaplic,
        la2invbnepdte,
        la2invgreiniej,
        la2invgreaplic,
        la2invgrepdte,
        la2invcsciniej,
        la2invcscaplic,
        la2invcscpdte,
        la2invvcviniej,
        la2invvcvaplic,
        la2invvcvpdte,
        la2invcmviniej,
        la2invcmvaplic,
        la2invcmvpdte,
        la2invaeviniej,
        la2invaevaplic,
        la2invaevpdte,
        la2invcejiniej,
        la2invcejaplic,
        la2invcejpdte,
        la2invrpliniej,
        la2invrplaplic,
        la2invrplpdte,
        la2invfjiiniej,
        la2invfjiaplic,
        la2invfjipdte,
        la2invuiginiej,
        la2invuigaplic,
        la2invuigpdte,
        la2invccpiniej,
        la2invccpaplic,
        la2invccppdte,
        la2invcariniej,
        la2invcaraplic,
        la2invcarpdte,
        la2invbwjiniej,
        la2invbwjaplic,
        la2invbwjpdte,
        la2invcnbiniej,
        la2invcnbaplic,
        la2invcnbpdte,
        la2invbmwiniej,
        la2invbmwaplic,
        la2invbmwpdte,
        la2invpariniej,
        la2invparaplic,
        la2invparpdte,
        la2invctoiniej,
        la2invctoaplic,
        la2invctopdte,
        la2invcbpiniej,
        la2invcbpaplic,
        la2invcbppdte,
        la2invcpliniej,
        la2invcplaplic,
        la2invcplpdte,
        la2invcaniniej,
        la2invcanaplic,
        la2invcanpdte,
        la2invcbniniej,
        la2invcbnaplic,
        la2invcbnpdte,
        la2invajminiej,
        la2invajmaplic,
        la2invajmpdte,
        la2invcmoiniej,
        la2invcmoaplic,
        la2invcmopdte,
        la2invdiminiej,
        la2invdimaplic,
        la2invdimpdte,
        la2invceeiniej,
        la2invceeaplic,
        la2invceepdte,
        la2invce2iniej,
        la2invce2aplic,
        la2invce2pdte,
        la2invjrjiniej,
        la2invjrjaplic,
        la2invjrjpdte,
        la2invcsfiniej,
        la2invcsfaplic,
        la2invcsfpdte,
        la2invcsjiniej,
        la2invcsjaplic,
        la2invcsjpdte,
        la2invajuiniej,
        la2invajuaplic,
        la2invajupdte,
        la2invajsiniej,
        la2invajsaplic,
        la2invajspdte,
        la2invsaviniej,
        la2invsavaplic,
        la2invsavpdte        
        };
      setColumns(array);
      FieldDef arrayf[] = {la2ejeraplic,la2declaran,la2muf,la2tipocalculo };
      setDescription("Liquidacion renta anexo A2: Informacion adicional ciertas deducciones");
      setPrimaryKeys(arrayf);
      la2ejeraplic.setDescription("Ejercicio aplicacion");
      la2declaran.setDescription("Codigo de declarante");
      la2muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      la2tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      la2ceutadeduc.setDescription("Deduccion Ceuta o Melilla: Importe de la deduccion");
      la2caecantidad.setDescription("Cuenta ahorro empresa: Cantidades dipositadas con derecho deduccion");
      la2caededuccion.setDescription("Cuenta ahorro empresa: Importe total deduccion");
      la2caetit1.setDescription("Cuenta ahorro empresa: titular");
      la2caefecha1.setDescription("Cuenta ahorro empresa: fecha apertura");
      la2caebanco1.setDescription("Cuenta ahorro empresa: Banco cuenta vivienda");
      la2caeofici1.setDescription("Cuenta ahorro empresa: Oficina cuenta vivienda");
      la2caedigit1.setDescription("Cuenta ahorro empresa: Digito control cta. vivienda");
      la2caencta1.setDescription("Cuenta ahorro empresa: Numero cuenta vivienda");
      la2caetit2.setDescription("Cuenta ahorro empresa: titular");
      la2caefecha2.setDescription("Cuenta ahorro empresa: fecha apertura");
      la2caebanco2.setDescription("Cuenta ahorro empresa: Banco cuenta vivienda");
      la2caeofici2.setDescription("Cuenta ahorro empresa: Oficina cuenta vivienda");
      la2caedigit2.setDescription("Cuenta ahorro empresa: Digito control cta. vivienda");
      la2caencta2.setDescription("Cuenta ahorro empresa: Numero cuenta vivienda");
      la2invant1iniej.setDescription("Inversion empresarial, deduc.ejer.anter.: regimen general, saldo inicio");
      la2invant1aplic.setDescription("Inversion empresarial, deduc.ejer.anter.: regimen general, aplicado");
      la2invant1pdte.setDescription("Inversion empresarial, deduc.ejer.anter.: regimen general, saldo pendiente");
      la2invant2iniej.setDescription("Inversion empresarial, deduc.ejer.anter.: regimen especial, saldo inicio");
      la2invant2aplic.setDescription("Inversion empresarial, deduc.ejer.anter.: regimen especial, aplicado");
      la2invant2pdte.setDescription("Inversion empresarial, deduc.ejer.anter.: regimen especial, saldo pendiente");
      la2invidiniej.setDescription("Inversion empresarial, deduc.ejer.act.: I+D saldo inicio");
      la2invidaplic.setDescription("Inversion empresarial, deduc.ejer.act.: I+D aplicado");
      la2invidpdte.setDescription("Inversion empresarial, deduc.ejer.act.: I+D saldo pendiente");
      la2invticiniej.setDescription("Inversion empresarial, deduc.ejer.act.: tecnologia informacion saldo inicio");
      la2invticaplic.setDescription("Inversion empresarial, deduc.ejer.act.: tecnologia informacion aplicado");
      la2invticpdte.setDescription("Inversion empresarial, deduc.ejer.act.: tecnologia informacion saldo pendiente");
      la2inveeiniej.setDescription("Inversion empresarial, deduc.ejer.act.: empresas exportadoras saldo inicio");
      la2inveeaplic.setDescription("Inversion empresarial, deduc.ejer.act.: empresas exportadoras aplicado");
      la2inveepdte.setDescription("Inversion empresarial, deduc.ejer.act.: empresas exportadoras saldo pendiente");
      la2inva38iniej.setDescription("Inversion empresarial, deduc.ejer.act.: art.38 saldo inicio");
      la2inva38aplic.setDescription("Inversion empresarial, deduc.ejer.act.: art.38 aplicado");
      la2inva38pdte.setDescription("Inversion empresarial, deduc.ejer.act.: art.38 saldo pendiente");
      la2invpmainiej.setDescription("Inversion empresarial, deduc.ejer.act.: proteccion medio ambiente saldo inicio");
      la2invpmaaplic.setDescription("Inversion empresarial, deduc.ejer.act.: proteccion medio ambiente aplicado");
      la2invpmapdte.setDescription("Inversion empresarial, deduc.ejer.act.: proteccion medio ambiente saldo pendiente");
      la2invfpiniej.setDescription("Inversion empresarial, deduc.ejer.act.: formacion profesional saldo inicio");
      la2invfpaplic.setDescription("Inversion empresarial, deduc.ejer.act.: formacion profesional aplicado");
      la2invfppdte.setDescription("Inversion empresarial, deduc.ejer.act.: formacion profesional saldo pendiente");
      la2invceiniej.setDescription("Inversion empresarial, deduc.ejer.act.: creacion empleo saldo inicio");
      la2invceaplic.setDescription("Inversion empresarial, deduc.ejer.act.: creacion empleo aplicado");
      la2invcepdte.setDescription("Inversion empresarial, deduc.ejer.act.: creacion empleo saldo pendiente");
      la2inva43iniej.setDescription("Inversion empresarial, deduc.ejer.act.: art.43 saldo inicio");
      la2inva43aplic.setDescription("Inversion empresarial, deduc.ejer.act.: art.43 aplicado");
      la2inva43pdte.setDescription("Inversion empresarial, deduc.ejer.act.: art.43 saldo pendiente");
      la2invalviniej.setDescription("Inversion empresarial, deduc.ejer.act.:Alicante 2011 Vuelta al mundo saldo inicio");
      la2invalvaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Alicante 2011 Vuelta al mundo aplicado");
      la2invalvpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Alicante 2011 Vuelta al mundo saldo pendiente");
      la2invbwriniej.setDescription("Inversion empresarial, deduc.ejer.act.:Barcelona World Race saldo inicio");
      la2invbwraplic.setDescription("Inversion empresarial, deduc.ejer.act.:Barcelona World Race aplicado");
      la2invbwrpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Barcelona World Race saldo pendiente");
      la2invgcainiej.setDescription("Inversion empresarial, deduc.ejer.act.:33 Copa America saldo inicio");
      la2invgcaaplic.setDescription("Inversion empresarial, deduc.ejer.act.:33 Copa America aplicado");
      la2invgcapdte.setDescription("Inversion empresarial, deduc.ejer.act.:33 Copa America saldo pendiente");
      la2invgrhiniej.setDescription("Inversion empresarial, deduc.ejer.act.:Guadalquivir rio hist.saldo inicio");
      la2invgrhaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Guadalquivir rio his. aplicado");
      la2invgrhpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Guadalquivir rio hist. saldo pendiente");
      la2invcbciniej.setDescription("Inversion empresarial, deduc.ejer.act.:Bicentenario Constitucion saldo inicio");
      la2invcbcaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Bicentenario Constitucion aplicado");
      la2invcbcpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Bicentenario Constitucion saldo pendiente");
      la2invloniniej.setDescription("Inversion empresarial, deduc.ejer.act.:Londres 2012 saldo inicio");
      la2invlonaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Londres 2012 aplicado");
      la2invlonpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Londres 2012 saldo pendiente");
      la2invasjiniej.setDescription("Inversion empresarial, deduc.ejer.act.:Año Santo Jacobeo 2010 saldo inicio");
      la2invasjaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Año Santo Jacobeo 2010 aplicado");
      la2invasjpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Año Santo Jacobeo 2010 saldo pendiente");
      la2invajciniej.setDescription("Inversion empresarial, deduc.ejer.act.:Año Jubilar Calceatense saldo inicio");
      la2invajcaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Año Jubilar Calceatense aplicado");
      la2invajcpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Año Jubilar Calceatense saldo pendiente");
      la2invcajiniej.setDescription("Inversion empresarial, deduc.ejer.act.:Caravaca Jubilar 2010 saldo inicio");
      la2invcajaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Caravaca Jubilar 2010 aplicado");
      la2invcajpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Caravaca Jubilar 2010 saldo pendiente");
      la2invalziniej.setDescription("Inversion empresarial, deduc.ejer.act.:Alzheimer internacional 2011 saldo inicio");
      la2invalzaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Alzheimer internacional 2011 aplicado");
      la2invalzpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Alzheimer internacional 2011 saldo pendiente");
      la2invahoiniej.setDescription("Inversion empresarial, deduc.ejer.act.:Año Hernandiano Orihuela 2010 saldo inicio");
      la2invahoaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Año Hernandiano Orihuela 2010 aplicado");
      la2invahopdte.setDescription("Inversion empresarial, deduc.ejer.act.:Año Hernandiano Orihuela 2010 saldo pendiente");
      la2invccbiniej.setDescription("Inversion empresarial, deduc.ejer.act.:Centenario Costa Brava saldo inicio");
      la2invccbaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Centenario Costa Brava aplicado");
      la2invccbpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Centenario Costa Brava saldo pendiente");
      la2invsiainiej.setDescription("Inversion empresarial, deduc.ejer.act.:Salon internacional automovil BCN saldo inicio");
      la2invsiaaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Salon internacional automovil BCN aplicado");
      la2invsiapdte.setDescription("Inversion empresarial, deduc.ejer.act.:Salon internacional automovil BCN saldo pendiente");
      la2invelxiniej.setDescription("Inversion empresarial, deduc.ejer.act.:Misteri Elx saldo inicio");
      la2invelxaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Misteri Elx aplicado");
      la2invelxpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Misteri Elx saldo pendiente");
      la2invjguiniej.setDescription("Inversion empresarial, deduc.ejer.act.:Jubilar Guadalupense 2010 saldo inicio");
      la2invjguaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Jubilar Guadalupense 2010 aplicado");
      la2invjgupdte.setDescription("Inversion empresarial, deduc.ejer.act.:Jubilar Guadalupense 2010 saldo pendiente");
      la2invjmjiniej.setDescription("Inversion empresarial, deduc.ejer.act.:Jornadas mundiales juventud 2011 saldo inicio");
      la2invjmjaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Jornadas mundiales juventud 2011 aplicado");
      la2invjmjpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Jornadas mundiales juventud 2011 saldo pendiente");
      la2invcrginiej.setDescription("Inversion empresarial, deduc.ejer.act.:Fundacion milenio Reino Granada saldo inicio");
      la2invcrgaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Fundacion milenio Reino Granada aplicado");
      la2invcrgpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Fundacion milenio Reino Granada saldo pendiente");
      la2invsdeiniej.setDescription("Inversion empresarial, deduc.ejer.act.:Solar Decathlon Europa saldo inicio");
      la2invsdeaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Solar Decathlon Europa aplicado");
      la2invsdepdte.setDescription("Inversion empresarial, deduc.ejer.act.:Solar Decathlon Europa saldo pendiente");
      la2invglxiniej.setDescription("Inversion empresarial, deduc.ejer.act.:Google Lunar X Prize saldo inicio");
      la2invglxaplic.setDescription("Inversion empresarial, deduc.ejer.act.:Google Lunar X Prize aplicado");
      la2invglxpdte.setDescription("Inversion empresarial, deduc.ejer.act.:Google Lunar X Prize saldo pendiente");
      la2invaoriniej.setDescription("Inversion empresarial, deduc.ejer.act.:AOR 2011 Año Orellana Saldo inicio");
      la2invaoraplic.setDescription("Inversion empresarial, deduc.ejer.act.:    2011 Año Orellana Aplicado");
      la2invaorpdte.setDescription("Inversion empresarial, deduc.ejer.act.:    2011 Año Orellana Saldo pendiente");
      la2invmbainiej.setDescription("Inversion empresarial, deduc.ejer.act.:MBA Mundobasket 2014  Saldo inicio");
      la2invmbaaplic.setDescription("Inversion empresarial, deduc.ejer.act.:    Mundobasket 2014  Aplicado");
      la2invmbapdte.setDescription("Inversion empresarial, deduc.ejer.act.:    Mundobasket 2014  Saldo pendiente");
      la2invcmbiniej.setDescription("Inversion empresarial, deduc.ejer.act.:CMB Campeonato Mundo Balonmano 2013 Saldo inicio");
      la2invcmbaplic.setDescription("Inversion empresarial, deduc.ejer.act.:    Campeonato Mundo Balonmano 2013 Aplicado");
      la2invcmbpdte.setDescription("Inversion empresarial, deduc.ejer.act.:    Campeonato Mundo Balonmano 2013 Saldo pendiente");
      la2invbneiniej.setDescription("Inversion empresarial, deduc.ejer.act.:BNE Tricentenario Biblioteca Nacional Esp. Saldo inicio");
      la2invbneaplic.setDescription("Inversion empresarial, deduc.ejer.act.:    Tricentenario Biblioteca Nacional Esp. Aplicado");
      la2invbnepdte.setDescription("Inversion empresarial, deduc.ejer.act.:    Tricentenario Biblioteca Nacional Esp. Saldo pendiente");
      la2invgreiniej.setDescription("Inversion empresarial, deduc.ejer.act.:GRE IV Centernario fallecimimento pintor El Greco Saldo inicio");
      la2invgreaplic.setDescription("Inversion empresarial, deduc.ejer.act.:    IV Centernario fallecimimento pintor El Greco Aplicado");
      la2invgrepdte.setDescription("Inversion empresarial, deduc.ejer.act.:    IV Centernario fallecimimento pintor El Greco Saldo pendiente");
      la2invcsciniej.setDescription("Inversion empresarial, deduc.ejer.act.:CSC VIII Centenario Catedral Santiago Compostela Saldo inicio");
      la2invcscaplic.setDescription("Inversion empresarial, deduc.ejer.act.:    VIII Centenario Catedral Santiago Compostela Aplicado");
      la2invcscpdte.setDescription("Inversion empresarial, deduc.ejer.act.:    VIII Centenario Catedral Santiago Compostela Saldo pendiente");
      la2invvcviniej.setDescription("Inversion empresarial,ded.ejer.act.:VCV Victoria Gasteiz capital verde europea 2012 Saldo inicio");
      la2invvcvaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Victoria Gasteiz capital verde europea 2012 Aplicado");
      la2invvcvpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Victoria Gasteiz capital verde europea 2012 Saldo pendiente");
      la2invcmviniej.setDescription("Inversion empresarial,ded.ejer.act.:CMV Campeonato mundo vela ISAF 2014 Saldo inicio");
      la2invcmvaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Campeonato mundo vela ISAF 2014 Aplicado");
      la2invcmvpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Campeonato mundo vela ISAF 2014 Saldo pendiente");
      la2invaeviniej.setDescription("Inversion empresarial,ded.ejer.act.:AEV El árbol es vida Saldo inicio");
      la2invaevaplic.setDescription("Inversion empresarial,ded.ejer.act.:    El árbol es vida Aplicado");
      la2invaevpdte.setDescription("Inversion empresarial,ded.ejer.act.:    El árbol es vida Saldo pendiente");
      la2invcejiniej.setDescription("Inversion empresarial,ded.ejer.act.:CEJ IV Centenario relaciones Esp Japón Saldo inicio");
      la2invcejaplic.setDescription("Inversion empresarial,ded.ejer.act.:    IV Centenario relaciones Esp Japón Aplicado");
      la2invcejpdte.setDescription("Inversion empresarial,ded.ejer.act.:    IV Centenario relaciones Esp Japón Saldo pendiente");
      la2invrpliniej.setDescription("Inversion empresarial,ded.ejer.act.:RPL Recuperación patrimonio cultural Lorca Saldo inicio");
      la2invrplaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Recuperación patrimonio cultural Lorca Aplicado");
      la2invrplpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Recuperación patrimonio cultural Lorca Saldo pendiente");
      la2invfjiiniej.setDescription("Inversion empresarial,ded.ejer.act.:FJI Foro juvenil Iberoamericano del patrimonio mundial Saldo inicio");
      la2invfjiaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Foro juvenil Iberoamericano del patrimonio mundial Aplicado");
      la2invfjipdte.setDescription("Inversion empresarial,ded.ejer.act.:    Foro juvenil Iberoamericano del patrimonio mundial Saldo pendiente");
      la2invuiginiej.setDescription("Inversion empresarial,ded.ejer.act.:UIG Universiada de invierno Granada 2015 Saldo inicio");
      la2invuigaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Universiada de invierno Granada 2015 Aplicado");
      la2invuigpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Universiada de invierno Granada 2015 Saldo pendiente");
      la2invccpiniej.setDescription("Inversion empresarial,ded.ejer.act.:CCP Campeonato ciclismo  Ponferrada 2014 Saldo inicio");
      la2invccpaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Campeonato ciclismo  Ponferrada 2014 Aplicado");
      la2invccppdte.setDescription("Inversion empresarial,ded.ejer.act.:    Campeonato ciclismo  Ponferrada 2014 Saldo pendiente");
      la2invcariniej.setDescription("Inversion empresarial,ded.ejer.act.:CAR Centro UNESCO para arte rupestre Saldo inicio");
      la2invcaraplic.setDescription("Inversion empresarial,ded.ejer.act.:    Centro UNESCO para arte rupestre Aplicado");
      la2invcarpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Centro UNESCO para arte rupestre Saldo pendiente");
      la2invbwjiniej.setDescription("Inversion empresarial,ded.ejer.act.:BWJ Barcelona word Jumping Challenge Saldo inicio");
      la2invbwjaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Barcelona word Jumping Challenge Aplicado");
      la2invbwjpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Barcelona word Jumping Challenge Saldo pendiente");
      la2invcnbiniej.setDescription("Inversion empresarial,ded.ejer.act.:CNB Campeonato natacion Barcelona 2013 Saldo inicio");
      la2invcnbaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Campeonato natacion Barcelona 2013 Aplicado");
      la2invcnbpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Campeonato natacion Barcelona 2013 Saldo pendiente");
      la2invbmwiniej.setDescription("Inversion empresarial,ded.ejer.act.:BMW Barcelona Mobile world Capital Saldo inicio");
      la2invbmwaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Barcelona Mobile world Capital Aplicado");
      la2invbmwpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Barcelona Mobile world Capital Saldo pendiente");
      la2invpariniej.setDescription("Inversion empresarial,ded.ejer.act.:PAR Paris 1972 40 aniversario convencion mundial Saldo inicio");
      la2invparaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Paris 1972 40 aniversario convencion mundial Aplicado");
      la2invparpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Paris 1972 40 aniversario convencion mundial Capital Saldo pendiente");
      la2invctoiniej.setDescription("Inversion empresarial,ded.ejer.act.:CTO Campeonato tiro olimpico Las Gabias 2014 Saldo inicio");
      la2invctoaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Campeonato tiro olimpico Las Gabias 2014 Aplicado");
      la2invctopdte.setDescription("Inversion empresarial,ded.ejer.act.:    Campeonato tiro olimpico Las Gabias 2014 Capital Saldo pendiente");
      la2invcbpiniej.setDescription("Inversion empresarial,ded.ejer.act.:CBP Conmemoración 500 años  Bula Papal Saldo inicio");
      la2invcbpaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Conmemoración 500 años  Bula Papal Aplicado");
      la2invcbppdte.setDescription("Inversion empresarial,ded.ejer.act.:    Conmemoración 500 años  Bula Papal Saldo pendiente");
      la2invcpliniej.setDescription("Inversion empresarial,ded.ejer.act.:CPL 2012 año de las culturas, la paz y la libertad Saldo inicio");
      la2invcplaplic.setDescription("Inversion empresarial,ded.ejer.act.:    2012 año de las culturas, la paz y la libertad Aplicado");
      la2invcplpdte.setDescription("Inversion empresarial,ded.ejer.act.:    2012 año de las culturas, la paz y la libertad Capital Saldo pendiente");
      la2invcaniniej.setDescription("Inversion empresarial,ded.ejer.act.:CAN Conmemoración Año de la neurociencia Saldo inicio");
      la2invcanaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Conmemoración Año de la neurociencia Aplicado");
      la2invcanpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Conmemoración Año de la neurociencia Capital Saldo pendiente");
      la2invcbniniej.setDescription("Inversion empresarial,ded.ejer.act.:CBN VIII Centenario batalla Navas de Tolosa 1212 Saldo inicio");
      la2invcbnaplic.setDescription("Inversion empresarial,ded.ejer.act.:    VIII Centenario batalla Navas de Tolosa 1212 Aplicado");
      la2invcbnpdte.setDescription("Inversion empresarial,ded.ejer.act.:    VIII Centenario batalla Navas de Tolosa 1212 Capital Saldo pendiente");
      la2invajminiej.setDescription("Inversion empresarial,ded.ejer.act.:AJM Año Jubilar Mariano 2012-2013 Almonte Saldo inicio");
      la2invajmaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Año Jubilar Mariano 2012-2013 Almonte Aplicado");
      la2invajmpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Año Jubilar Mariano 2012-2013 Almonte Capital Saldo pendiente");
      la2invcmoiniej.setDescription("Inversion empresarial,ded.ejer.act.:CMO Candidatura de Madrid 2020 Saldo inicio");
      la2invcmoaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Candidatura de Madrid 2020 Aplicado");
      la2invcmopdte.setDescription("Inversion empresarial,ded.ejer.act.:    Candidatura de Madrid 2020 Capital Saldo pendiente");
      la2invdiminiej.setDescription("Inversion empresarial,ded.ejer.act.:DIM Dieta Mediterranea Saldo inicio");
      la2invdimaplic.setDescription("Inversion empresarial,ded.ejer.act.:    Dieta Mediterranea Aplicado");
      la2invdimpdte.setDescription("Inversion empresarial,ded.ejer.act.:    Dieta Mediterranea Saldo pendiente");
      la2invceeiniej.setDescription("Inversion empr.ejer.act. CE1 Creacion empleo emprendedores art.43.1 Saldo inicio");
      la2invceeaplic.setDescription("Inversion empr.ejer.act.     Creacion empleo emprendedores art.43.1 Aplicado");
      la2invceepdte.setDescription("Inversion empr.ejer.act.     Creacion empleo emprendedores art.43.1 Pendiente");
      la2invce2iniej.setDescription("Inversion empr.ejer.act. CE2 Creacion empleo emprendedores art.43.2 Saldo inicio");
      la2invce2aplic.setDescription("Inversion empr.ejer.act.     Creacion empleo emprendedores art.43.2 Aplicado");
      la2invce2pdte.setDescription("Inversion empr.ejer.act.     Creacion empleo emprendedores art.43.2 Pendiente");
      la2invjrjiniej.setDescription("Inversion empr.ejer.act. JRJ Juegos Rio Janeiro 2016 Saldo inicio");
      la2invjrjaplic.setDescription("Inversion empr.ejer.act.     Juegos Rio Janeiro 2016 Aplicado");
      la2invjrjpdte.setDescription("Inversion empr.ejer.act.     Juegos Rio Janeiro 2016 Saldo pendiente");
      la2invcsfiniej.setDescription("Inversion empr.ejer.act. CSF VIII Centenario peregrinación de St Fco Asis a Santiago Comp  Saldo inicio");
      la2invcsfaplic.setDescription("Inversion empr.ejer.act.     VIII Centenario peregrinación de St Fco Asis a Santiago Comp  Aplicado");
      la2invcsfpdte.setDescription("Inversion empr.ejer.act.     VIII Centenario peregrinación de St Fco Asis a Santiago Comp  Saldo pendiente");
      la2invcsjiniej.setDescription("Inversion empr.ejer.act. CSJ V Centernario nacimiento de Sta Teresa de Jesús  Saldo inicio");
      la2invcsjaplic.setDescription("Inversion empr.ejer.act.     V Centernario nacimiento de Sta Teresa de Jesús  Aplicado");
      la2invcsjpdte.setDescription("Inversion empr.ejer.act.     V Centernario nacimiento de Sta Teresa de Jesús  Saldo pendiente");
      la2invajuiniej.setDescription("Inversion empr.ejer.act. AJU Año Junipero Serra 2013  Saldo inicio");
      la2invajuaplic.setDescription("Inversion empr.ejer.act.     Año Junipero Serra 2013  Aplicado");
      la2invajupdte.setDescription("Inversion empr.ejer.act.     Año Junipero Serra 2013  Saldo pendiente");
      la2invajsiniej.setDescription("Inversion empr.ejer.act. AJS Año Jubilar Mariano 2013-2014 Sevilla   Saldo inicio");
      la2invajsaplic.setDescription("Inversion empr.ejer.act.     Año Jubilar Mariano 2013-2014 Sevilla   Aplicado");
      la2invajspdte.setDescription("Inversion empr.ejer.act.     Año Jubilar Mariano 2013-2014 Sevilla   Saldo pendiente");
      la2invsaviniej.setDescription("Inversion empr.ejer.act. SAV Salida vuelta mundo vela Alicante 2014  Saldo inicio");
      la2invsavaplic.setDescription("Inversion empr.ejer.act.     Salida vuelta mundo vela Alicante 2014  Aplicado");
      la2invsavpdte.setDescription("Inversion empr.ejer.act.     Salida vuelta mundo vela Alicante 2014  Saldo pendiente");
      }
    }
    
  public class TabDedinversion extends TableDef
    {
    // Campos
    public FieldDef diiejeraplic;
    public FieldDef diideclaran;
    public FieldDef diiidentactiv;
    public FieldDef diianyo;
    public FieldDef diiid_lim;
    public FieldDef diiid_saldo;
    public FieldDef diiid_aplic;
    public FieldDef diipc_lim;
    public FieldDef diipc_saldo;
    public FieldDef diipc_aplic;
    public FieldDef diiee_lim;
    public FieldDef diiee_saldo;
    public FieldDef diiee_aplic;
    public FieldDef diibic_lim;
    public FieldDef diibic_saldo;
    public FieldDef diibic_aplic;
    public FieldDef diifor_prof_lim;
    public FieldDef diifor_prof_sal;
    public FieldDef diifor_prof_apl;
    public FieldDef diipma_mat_lim;
    public FieldDef diipma_mat_sald;
    public FieldDef diipma_mat_apli;
    public FieldDef diied_lim;
    public FieldDef diied_saldo;
    public FieldDef diied_aplic;
    public FieldDef diiempleo_lim;
    public FieldDef diiempleo_saldo;
    public FieldDef diiempleo_aplic;
    public FieldDef diianosanto_lim;
    public FieldDef diianosanto_sal;
    public FieldDef diianosanto_apl;
    public FieldDef diicapcul_lim;
    public FieldDef diicapcul_saldo;
    public FieldDef diicapcul_aplic;
    public FieldDef diiinter_limite;
    public FieldDef diiinter_saldo;
    public FieldDef diiinter_aplic;
    public FieldDef diisalam_lim;
    public FieldDef diisalam_saldo;
    public FieldDef diisalam_aplic;
    public FieldDef diitrans_lim;
    public FieldDef diitrans_saldo;
    public FieldDef diitrans_aplic;
    public FieldDef diibarce_lim;
    public FieldDef diibarce_saldo;
    public FieldDef diibarce_aplic;
    public FieldDef diiaip_lim;
    public FieldDef diiaip_saldo;
    public FieldDef diiaip_aplic;
    public FieldDef diigua_lim;
    public FieldDef diigua_saldo;
    public FieldDef diigua_aplic;
    public FieldDef diijacob_lim;
    public FieldDef diijacob_saldo;
    public FieldDef diijacob_aplic;
    public FieldDef diicarab_lim;
    public FieldDef diicarab_saldo;
    public FieldDef diicarab_aplic;
    public FieldDef diiapd_lim;
    public FieldDef diiapd_saldo;
    public FieldDef diiapd_aplic;
    public FieldDef diijma_lim;
    public FieldDef diijma_saldo;
    public FieldDef diijma_aplic;
    public FieldDef diiqui_lim;
    public FieldDef diiqui_saldo;
    public FieldDef diiqui_aplic;
    public FieldDef diica7_lim;
    public FieldDef diica7_saldo;
    public FieldDef diica7_aplic;
    public FieldDef diiga5_lim;
    public FieldDef diiga5_saldo;
    public FieldDef diiga5_aplic;
    public FieldDef diisa5_lim;
    public FieldDef diisa5_saldo;
    public FieldDef diisa5_aplic;
    public FieldDef diipk8_lim;
    public FieldDef diipk8_saldo;
    public FieldDef diipk8_aplic;
    public FieldDef diileb_lim;
    public FieldDef diileb_saldo;
    public FieldDef diileb_aplic;
    public FieldDef diizar_lim;
    public FieldDef diizar_saldo;
    public FieldDef diizar_aplic;
    public FieldDef diial8_lim;
    public FieldDef diial8_saldo;
    public FieldDef diial8_aplic;
    public FieldDef diibwr_lim;
    public FieldDef diibwr_saldo;
    public FieldDef diibwr_aplic;
    public FieldDef diiajg_lim;
    public FieldDef diiajg_saldo;
    public FieldDef diiajg_aplic;
    public FieldDef diicbc_lim;
    public FieldDef diicbc_saldo;
    public FieldDef diicbc_aplic;
    public FieldDef diigca_lim;
    public FieldDef diigca_saldo;
    public FieldDef diigca_aplic;
    public FieldDef diigrh_lim;
    public FieldDef diigrh_saldo;
    public FieldDef diigrh_aplic;
    public FieldDef diilon_lim;
    public FieldDef diilon_saldo;
    public FieldDef diilon_aplic;
    public FieldDef diiasj_lim;
    public FieldDef diiasj_saldo;
    public FieldDef diiasj_aplic;
    public FieldDef diiajc_lim;
    public FieldDef diiajc_saldo;
    public FieldDef diiajc_aplic;
    public FieldDef diicaj_lim;
    public FieldDef diicaj_saldo;
    public FieldDef diicaj_aplic;
    public FieldDef diialz_lim;
    public FieldDef diialz_saldo;
    public FieldDef diialz_aplic;
    public FieldDef diiaho_lim;
    public FieldDef diiaho_saldo;
    public FieldDef diiaho_aplic;
    public FieldDef diiccb_lim;
    public FieldDef diiccb_saldo;
    public FieldDef diiccb_aplic;
    public FieldDef diisia_lim;
    public FieldDef diisia_saldo;
    public FieldDef diisia_aplic;
    public FieldDef diielx_lim;
    public FieldDef diielx_saldo;
    public FieldDef diielx_aplic;
    public FieldDef diijgu_lim;
    public FieldDef diijgu_saldo;
    public FieldDef diijgu_aplic;
    public FieldDef diijmj_lim;
    public FieldDef diijmj_saldo;
    public FieldDef diijmj_aplic;
    public FieldDef diicrg_lim;
    public FieldDef diicrg_saldo;
    public FieldDef diicrg_aplic;
    public FieldDef diisde_lim;
    public FieldDef diisde_saldo;
    public FieldDef diisde_aplic;
    public FieldDef diiglx_lim;
    public FieldDef diiglx_saldo;
    public FieldDef diiglx_aplic;
    public FieldDef diialv_lim;
    public FieldDef diialv_saldo;
    public FieldDef diialv_aplic;
    public FieldDef diiaor_lim;
    public FieldDef diiaor_saldo;
    public FieldDef diiaor_aplic;
    public FieldDef diimba_lim;
    public FieldDef diimba_saldo;
    public FieldDef diimba_aplic;
    public FieldDef diicmb_lim;
    public FieldDef diicmb_saldo;
    public FieldDef diicmb_aplic;
    public FieldDef diibne_lim;
    public FieldDef diibne_saldo;
    public FieldDef diibne_aplic;
    public FieldDef diigre_lim;
    public FieldDef diigre_saldo;
    public FieldDef diigre_aplic;
    public FieldDef diicsc_lim;
    public FieldDef diicsc_saldo;
    public FieldDef diicsc_aplic;
    public FieldDef diivcv_lim;
    public FieldDef diivcv_saldo;
    public FieldDef diivcv_aplic;
    public FieldDef diicmv_lim;
    public FieldDef diicmv_saldo;
    public FieldDef diicmv_aplic;
    public FieldDef diiaev_lim;
    public FieldDef diiaev_saldo;
    public FieldDef diiaev_aplic;
    public FieldDef diicej_lim;
    public FieldDef diicej_saldo;
    public FieldDef diicej_aplic;
    public FieldDef diirpl_lim;
    public FieldDef diirpl_saldo;
    public FieldDef diirpl_aplic;
    public FieldDef diifji_lim;
    public FieldDef diifji_saldo;
    public FieldDef diifji_aplic;
    public FieldDef diiuig_lim;
    public FieldDef diiuig_saldo;
    public FieldDef diiuig_aplic;
    public FieldDef diiccp_lim;
    public FieldDef diiccp_saldo;
    public FieldDef diiccp_aplic;
    public FieldDef diicar_lim;
    public FieldDef diicar_saldo;
    public FieldDef diicar_aplic;
    public FieldDef diibwj_lim;
    public FieldDef diibwj_saldo;
    public FieldDef diibwj_aplic;
    public FieldDef diicnb_lim;
    public FieldDef diicnb_saldo;
    public FieldDef diicnb_aplic;
    public FieldDef diibmw_lim;
    public FieldDef diibmw_saldo;
    public FieldDef diibmw_aplic;
    public FieldDef diipar_lim;
    public FieldDef diipar_saldo;
    public FieldDef diipar_aplic;
    public FieldDef diicto_lim;
    public FieldDef diicto_saldo;
    public FieldDef diicto_aplic;
    public FieldDef diicbp_lim;
    public FieldDef diicbp_saldo;
    public FieldDef diicbp_aplic;
    public FieldDef diicpl_lim;
    public FieldDef diicpl_saldo;
    public FieldDef diicpl_aplic;
    public FieldDef diican_lim;
    public FieldDef diican_saldo;
    public FieldDef diican_aplic;
    public FieldDef diicbn_lim;
    public FieldDef diicbn_saldo;
    public FieldDef diicbn_aplic;
    public FieldDef diiajm_lim;
    public FieldDef diiajm_saldo;
    public FieldDef diiajm_aplic;
    public FieldDef diicmo_lim;
    public FieldDef diicmo_saldo;
    public FieldDef diicmo_aplic;
    public FieldDef diidim_lim;
    public FieldDef diidim_saldo;
    public FieldDef diidim_aplic;
    public FieldDef diicee_lim;
    public FieldDef diicee_saldo;
    public FieldDef diicee_aplic;
    public FieldDef diice2_lim;
    public FieldDef diice2_saldo;
    public FieldDef diice2_aplic;
    public FieldDef diijrj_lim;
    public FieldDef diijrj_saldo;
    public FieldDef diijrj_aplic;
    public FieldDef diicsf_lim;
    public FieldDef diicsf_saldo;
    public FieldDef diicsf_aplic;
    public FieldDef diicsj_lim;
    public FieldDef diicsj_saldo;
    public FieldDef diicsj_aplic;
    public FieldDef diiaju_lim;
    public FieldDef diiaju_saldo;
    public FieldDef diiaju_aplic;
    public FieldDef diiajs_lim;
    public FieldDef diiajs_saldo;
    public FieldDef diiajs_aplic;
    public FieldDef diisav_lim;
    public FieldDef diisav_saldo;
    public FieldDef diisav_aplic;
    public TabDedinversion(String name)
      {
      super(name);
      diiejeraplic = new FieldDef("diiejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      diideclaran = new FieldDef("diideclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      diiidentactiv = new FieldDef("diiidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      diianyo = new FieldDef("diianyo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      diiid_lim = new FieldDef("diiid_lim",FieldDef.FLOAT,6,0);
      diiid_saldo = new FieldDef("diiid_saldo",FieldDef.FLOAT,6,0);
      diiid_aplic = new FieldDef("diiid_aplic",FieldDef.FLOAT,6,0);
      diipc_lim = new FieldDef("diipc_lim",FieldDef.FLOAT,6,0);
      diipc_saldo = new FieldDef("diipc_saldo",FieldDef.FLOAT,6,0);
      diipc_aplic = new FieldDef("diipc_aplic",FieldDef.FLOAT,6,0);
      diiee_lim = new FieldDef("diiee_lim",FieldDef.FLOAT,6,0);
      diiee_saldo = new FieldDef("diiee_saldo",FieldDef.FLOAT,6,0);
      diiee_aplic = new FieldDef("diiee_aplic",FieldDef.FLOAT,6,0);
      diibic_lim = new FieldDef("diibic_lim",FieldDef.FLOAT,6,0);
      diibic_saldo = new FieldDef("diibic_saldo",FieldDef.FLOAT,6,0);
      diibic_aplic = new FieldDef("diibic_aplic",FieldDef.FLOAT,6,0);
      diifor_prof_lim = new FieldDef("diifor_prof_lim",FieldDef.FLOAT,6,0);
      diifor_prof_sal = new FieldDef("diifor_prof_sal",FieldDef.FLOAT,6,0);
      diifor_prof_apl = new FieldDef("diifor_prof_apl",FieldDef.FLOAT,6,0);
      diipma_mat_lim = new FieldDef("diipma_mat_lim",FieldDef.FLOAT,6,0);
      diipma_mat_sald = new FieldDef("diipma_mat_sald",FieldDef.FLOAT,6,0);
      diipma_mat_apli = new FieldDef("diipma_mat_apli",FieldDef.FLOAT,6,0);
      diied_lim = new FieldDef("diied_lim",FieldDef.FLOAT,6,0);
      diied_saldo = new FieldDef("diied_saldo",FieldDef.FLOAT,6,0);
      diied_aplic = new FieldDef("diied_aplic",FieldDef.FLOAT,6,0);
      diiempleo_lim = new FieldDef("diiempleo_lim",FieldDef.FLOAT,6,0);
      diiempleo_saldo = new FieldDef("diiempleo_saldo",FieldDef.FLOAT,6,0);
      diiempleo_aplic = new FieldDef("diiempleo_aplic",FieldDef.FLOAT,6,0);
      diianosanto_lim = new FieldDef("diianosanto_lim",FieldDef.FLOAT,6,0);
      diianosanto_sal = new FieldDef("diianosanto_sal",FieldDef.FLOAT,6,0);
      diianosanto_apl = new FieldDef("diianosanto_apl",FieldDef.FLOAT,6,0);
      diicapcul_lim = new FieldDef("diicapcul_lim",FieldDef.FLOAT,6,0);
      diicapcul_saldo = new FieldDef("diicapcul_saldo",FieldDef.FLOAT,6,0);
      diicapcul_aplic = new FieldDef("diicapcul_aplic",FieldDef.FLOAT,6,0);
      diiinter_limite = new FieldDef("diiinter_limite",FieldDef.FLOAT,6,0);
      diiinter_saldo = new FieldDef("diiinter_saldo",FieldDef.FLOAT,6,0);
      diiinter_aplic = new FieldDef("diiinter_aplic",FieldDef.FLOAT,6,0);
      diisalam_lim = new FieldDef("diisalam_lim",FieldDef.FLOAT,6,0);
      diisalam_saldo = new FieldDef("diisalam_saldo",FieldDef.FLOAT,6,0);
      diisalam_aplic = new FieldDef("diisalam_aplic",FieldDef.FLOAT,6,0);
      diitrans_lim = new FieldDef("diitrans_lim",FieldDef.FLOAT,6,0);
      diitrans_saldo = new FieldDef("diitrans_saldo",FieldDef.FLOAT,6,0);
      diitrans_aplic = new FieldDef("diitrans_aplic",FieldDef.FLOAT,6,0);
      diibarce_lim = new FieldDef("diibarce_lim",FieldDef.FLOAT,6,0);
      diibarce_saldo = new FieldDef("diibarce_saldo",FieldDef.FLOAT,6,0);
      diibarce_aplic = new FieldDef("diibarce_aplic",FieldDef.FLOAT,6,0);
      diiaip_lim = new FieldDef("diiaip_lim",FieldDef.FLOAT,6,0);
      diiaip_saldo = new FieldDef("diiaip_saldo",FieldDef.FLOAT,6,0);
      diiaip_aplic = new FieldDef("diiaip_aplic",FieldDef.FLOAT,6,0);
      diigua_lim = new FieldDef("diigua_lim",FieldDef.FLOAT,6,0);
      diigua_saldo = new FieldDef("diigua_saldo",FieldDef.FLOAT,6,0);
      diigua_aplic = new FieldDef("diigua_aplic",FieldDef.FLOAT,6,0);
      diijacob_lim = new FieldDef("diijacob_lim",FieldDef.FLOAT,6,0);
      diijacob_saldo = new FieldDef("diijacob_saldo",FieldDef.FLOAT,6,0);
      diijacob_aplic = new FieldDef("diijacob_aplic",FieldDef.FLOAT,6,0);
      diicarab_lim = new FieldDef("diicarab_lim",FieldDef.FLOAT,6,0);
      diicarab_saldo = new FieldDef("diicarab_saldo",FieldDef.FLOAT,6,0);
      diicarab_aplic = new FieldDef("diicarab_aplic",FieldDef.FLOAT,6,0);
      diiapd_lim = new FieldDef("diiapd_lim",FieldDef.FLOAT,6,0);
      diiapd_saldo = new FieldDef("diiapd_saldo",FieldDef.FLOAT,6,0);
      diiapd_aplic = new FieldDef("diiapd_aplic",FieldDef.FLOAT,6,0);
      diijma_lim = new FieldDef("diijma_lim",FieldDef.FLOAT,6,0);
      diijma_saldo = new FieldDef("diijma_saldo",FieldDef.FLOAT,6,0);
      diijma_aplic = new FieldDef("diijma_aplic",FieldDef.FLOAT,6,0);
      diiqui_lim = new FieldDef("diiqui_lim",FieldDef.FLOAT,6,0);
      diiqui_saldo = new FieldDef("diiqui_saldo",FieldDef.FLOAT,6,0);
      diiqui_aplic = new FieldDef("diiqui_aplic",FieldDef.FLOAT,6,0);
      diica7_lim = new FieldDef("diica7_lim",FieldDef.FLOAT,6,0);
      diica7_saldo = new FieldDef("diica7_saldo",FieldDef.FLOAT,6,0);
      diica7_aplic = new FieldDef("diica7_aplic",FieldDef.FLOAT,6,0);
      diiga5_lim = new FieldDef("diiga5_lim",FieldDef.FLOAT,6,0);
      diiga5_saldo = new FieldDef("diiga5_saldo",FieldDef.FLOAT,6,0);
      diiga5_aplic = new FieldDef("diiga5_aplic",FieldDef.FLOAT,6,0);
      diisa5_lim = new FieldDef("diisa5_lim",FieldDef.FLOAT,6,0);
      diisa5_saldo = new FieldDef("diisa5_saldo",FieldDef.FLOAT,6,0);
      diisa5_aplic = new FieldDef("diisa5_aplic",FieldDef.FLOAT,6,0);
      diipk8_lim = new FieldDef("diipk8_lim",FieldDef.FLOAT,6,0);
      diipk8_saldo = new FieldDef("diipk8_saldo",FieldDef.FLOAT,6,0);
      diipk8_aplic = new FieldDef("diipk8_aplic",FieldDef.FLOAT,6,0);
      diileb_lim = new FieldDef("diileb_lim",FieldDef.FLOAT,6,0);
      diileb_saldo = new FieldDef("diileb_saldo",FieldDef.FLOAT,6,0);
      diileb_aplic = new FieldDef("diileb_aplic",FieldDef.FLOAT,6,0);
      diizar_lim = new FieldDef("diizar_lim",FieldDef.FLOAT,6,0);
      diizar_saldo = new FieldDef("diizar_saldo",FieldDef.FLOAT,6,0);
      diizar_aplic = new FieldDef("diizar_aplic",FieldDef.FLOAT,6,0);
      diial8_lim = new FieldDef("diial8_lim",FieldDef.FLOAT,6,0);
      diial8_saldo = new FieldDef("diial8_saldo",FieldDef.FLOAT,6,0);
      diial8_aplic = new FieldDef("diial8_aplic",FieldDef.FLOAT,6,0);
      diibwr_lim = new FieldDef("diibwr_lim",FieldDef.FLOAT,6,0);
      diibwr_saldo = new FieldDef("diibwr_saldo",FieldDef.FLOAT,6,0);
      diibwr_aplic = new FieldDef("diibwr_aplic",FieldDef.FLOAT,6,0);
      diiajg_lim = new FieldDef("diiajg_lim",FieldDef.FLOAT,6,0);
      diiajg_saldo = new FieldDef("diiajg_saldo",FieldDef.FLOAT,6,0);
      diiajg_aplic = new FieldDef("diiajg_aplic",FieldDef.FLOAT,6,0);
      diicbc_lim = new FieldDef("diicbc_lim",FieldDef.FLOAT,6,0);
      diicbc_saldo = new FieldDef("diicbc_saldo",FieldDef.FLOAT,6,0);
      diicbc_aplic = new FieldDef("diicbc_aplic",FieldDef.FLOAT,6,0);
      diigca_lim = new FieldDef("diigca_lim",FieldDef.FLOAT,6,0);
      diigca_saldo = new FieldDef("diigca_saldo",FieldDef.FLOAT,6,0);
      diigca_aplic = new FieldDef("diigca_aplic",FieldDef.FLOAT,6,0);
      diigrh_lim = new FieldDef("diigrh_lim",FieldDef.FLOAT,6,0);
      diigrh_saldo = new FieldDef("diigrh_saldo",FieldDef.FLOAT,6,0);
      diigrh_aplic = new FieldDef("diigrh_aplic",FieldDef.FLOAT,6,0);
      diilon_lim = new FieldDef("diilon_lim",FieldDef.FLOAT,6,0);
      diilon_saldo = new FieldDef("diilon_saldo",FieldDef.FLOAT,6,0);
      diilon_aplic = new FieldDef("diilon_aplic",FieldDef.FLOAT,6,0);
      diiasj_lim = new FieldDef("diiasj_lim",FieldDef.FLOAT,6,0);
      diiasj_saldo = new FieldDef("diiasj_saldo",FieldDef.FLOAT,6,0);
      diiasj_aplic = new FieldDef("diiasj_aplic",FieldDef.FLOAT,6,0);
      diiajc_lim = new FieldDef("diiajc_lim",FieldDef.FLOAT,6,0);
      diiajc_saldo = new FieldDef("diiajc_saldo",FieldDef.FLOAT,6,0);
      diiajc_aplic = new FieldDef("diiajc_aplic",FieldDef.FLOAT,6,0);
      diicaj_lim = new FieldDef("diicaj_lim",FieldDef.FLOAT,6,0);
      diicaj_saldo = new FieldDef("diicaj_saldo",FieldDef.FLOAT,6,0);
      diicaj_aplic = new FieldDef("diicaj_aplic",FieldDef.FLOAT,6,0);
      diialz_lim = new FieldDef("diialz_lim",FieldDef.FLOAT,6,0);
      diialz_saldo = new FieldDef("diialz_saldo",FieldDef.FLOAT,6,0);
      diialz_aplic = new FieldDef("diialz_aplic",FieldDef.FLOAT,6,0);
      diiaho_lim = new FieldDef("diiaho_lim",FieldDef.FLOAT,6,0);
      diiaho_saldo = new FieldDef("diiaho_saldo",FieldDef.FLOAT,6,0);
      diiaho_aplic = new FieldDef("diiaho_aplic",FieldDef.FLOAT,6,0);
      diiccb_lim = new FieldDef("diiccb_lim",FieldDef.FLOAT,6,0);
      diiccb_saldo = new FieldDef("diiccb_saldo",FieldDef.FLOAT,6,0);
      diiccb_aplic = new FieldDef("diiccb_aplic",FieldDef.FLOAT,6,0);
      diisia_lim = new FieldDef("diisia_lim",FieldDef.FLOAT,6,0);
      diisia_saldo = new FieldDef("diisia_saldo",FieldDef.FLOAT,6,0);
      diisia_aplic = new FieldDef("diisia_aplic",FieldDef.FLOAT,6,0);
      diielx_lim = new FieldDef("diielx_lim",FieldDef.FLOAT,6,0);
      diielx_saldo = new FieldDef("diielx_saldo",FieldDef.FLOAT,6,0);
      diielx_aplic = new FieldDef("diielx_aplic",FieldDef.FLOAT,6,0);
      diijgu_lim = new FieldDef("diijgu_lim",FieldDef.FLOAT,6,0);
      diijgu_saldo = new FieldDef("diijgu_saldo",FieldDef.FLOAT,6,0);
      diijgu_aplic = new FieldDef("diijgu_aplic",FieldDef.FLOAT,6,0);
      diijmj_lim = new FieldDef("diijmj_lim",FieldDef.FLOAT,6,0);
      diijmj_saldo = new FieldDef("diijmj_saldo",FieldDef.FLOAT,6,0);
      diijmj_aplic = new FieldDef("diijmj_aplic",FieldDef.FLOAT,6,0);
      diicrg_lim = new FieldDef("diicrg_lim",FieldDef.FLOAT,6,0);
      diicrg_saldo = new FieldDef("diicrg_saldo",FieldDef.FLOAT,6,0);
      diicrg_aplic = new FieldDef("diicrg_aplic",FieldDef.FLOAT,6,0);
      diisde_lim = new FieldDef("diisde_lim",FieldDef.FLOAT,6,0);
      diisde_saldo = new FieldDef("diisde_saldo",FieldDef.FLOAT,6,0);
      diisde_aplic = new FieldDef("diisde_aplic",FieldDef.FLOAT,6,0);
      diiglx_lim = new FieldDef("diiglx_lim",FieldDef.FLOAT,6,0);
      diiglx_saldo = new FieldDef("diiglx_saldo",FieldDef.FLOAT,6,0);
      diiglx_aplic = new FieldDef("diiglx_aplic",FieldDef.FLOAT,6,0);
      diialv_lim = new FieldDef("diialv_lim",FieldDef.FLOAT,6,0);
      diialv_saldo = new FieldDef("diialv_saldo",FieldDef.FLOAT,6,0);
      diialv_aplic = new FieldDef("diialv_aplic",FieldDef.FLOAT,6,0);
      diiaor_lim = new FieldDef("diiaor_lim",FieldDef.FLOAT,6,0);
      diiaor_saldo = new FieldDef("diiaor_saldo",FieldDef.FLOAT,6,0);
      diiaor_aplic = new FieldDef("diiaor_aplic",FieldDef.FLOAT,6,0);
      diimba_lim = new FieldDef("diimba_lim",FieldDef.FLOAT,6,0);
      diimba_saldo = new FieldDef("diimba_saldo",FieldDef.FLOAT,6,0);
      diimba_aplic = new FieldDef("diimba_aplic",FieldDef.FLOAT,6,0);
      diicmb_lim = new FieldDef("diicmb_lim",FieldDef.FLOAT,6,0);
      diicmb_saldo = new FieldDef("diicmb_saldo",FieldDef.FLOAT,6,0);
      diicmb_aplic = new FieldDef("diicmb_aplic",FieldDef.FLOAT,6,0);
      diibne_lim = new FieldDef("diibne_lim",FieldDef.FLOAT,6,0);
      diibne_saldo = new FieldDef("diibne_saldo",FieldDef.FLOAT,6,0);
      diibne_aplic = new FieldDef("diibne_aplic",FieldDef.FLOAT,6,0);
      diigre_lim = new FieldDef("diigre_lim",FieldDef.FLOAT,6,0);
      diigre_saldo = new FieldDef("diigre_saldo",FieldDef.FLOAT,6,0);
      diigre_aplic = new FieldDef("diigre_aplic",FieldDef.FLOAT,6,0);
      diicsc_lim = new FieldDef("diicsc_lim",FieldDef.FLOAT,6,0);
      diicsc_saldo = new FieldDef("diicsc_saldo",FieldDef.FLOAT,6,0);
      diicsc_aplic = new FieldDef("diicsc_aplic",FieldDef.FLOAT,6,0);
      diivcv_lim = new FieldDef("diivcv_lim",FieldDef.FLOAT,6,0);
      diivcv_saldo = new FieldDef("diivcv_saldo",FieldDef.FLOAT,6,0);
      diivcv_aplic = new FieldDef("diivcv_aplic",FieldDef.FLOAT,6,0);
      diicmv_lim = new FieldDef("diicmv_lim",FieldDef.FLOAT,6,0);
      diicmv_saldo = new FieldDef("diicmv_saldo",FieldDef.FLOAT,6,0);
      diicmv_aplic = new FieldDef("diicmv_aplic",FieldDef.FLOAT,6,0);
      diiaev_lim = new FieldDef("diiaev_lim",FieldDef.FLOAT,6,0);
      diiaev_saldo = new FieldDef("diiaev_saldo",FieldDef.FLOAT,6,0);
      diiaev_aplic = new FieldDef("diiaev_aplic",FieldDef.FLOAT,6,0);
      diicej_lim = new FieldDef("diicej_lim",FieldDef.FLOAT,6,0);
      diicej_saldo = new FieldDef("diicej_saldo",FieldDef.FLOAT,6,0);
      diicej_aplic = new FieldDef("diicej_aplic",FieldDef.FLOAT,6,0);
      diirpl_lim = new FieldDef("diirpl_lim",FieldDef.FLOAT,6,0);
      diirpl_saldo = new FieldDef("diirpl_saldo",FieldDef.FLOAT,6,0);
      diirpl_aplic = new FieldDef("diirpl_aplic",FieldDef.FLOAT,6,0);
      diifji_lim = new FieldDef("diifji_lim",FieldDef.FLOAT,6,0);
      diifji_saldo = new FieldDef("diifji_saldo",FieldDef.FLOAT,6,0);
      diifji_aplic = new FieldDef("diifji_aplic",FieldDef.FLOAT,6,0);
      diiuig_lim = new FieldDef("diiuig_lim",FieldDef.FLOAT,6,0);
      diiuig_saldo = new FieldDef("diiuig_saldo",FieldDef.FLOAT,6,0);
      diiuig_aplic = new FieldDef("diiuig_aplic",FieldDef.FLOAT,6,0);
      diiccp_lim = new FieldDef("diiccp_lim",FieldDef.FLOAT,6,0);
      diiccp_saldo = new FieldDef("diiccp_saldo",FieldDef.FLOAT,6,0);
      diiccp_aplic = new FieldDef("diiccp_aplic",FieldDef.FLOAT,6,0);
      diicar_lim = new FieldDef("diicar_lim",FieldDef.FLOAT,6,0);
      diicar_saldo = new FieldDef("diicar_saldo",FieldDef.FLOAT,6,0);
      diicar_aplic = new FieldDef("diicar_aplic",FieldDef.FLOAT,6,0);
      diibwj_lim = new FieldDef("diibwj_lim",FieldDef.FLOAT,6,0);
      diibwj_saldo = new FieldDef("diibwj_saldo",FieldDef.FLOAT,6,0);
      diibwj_aplic = new FieldDef("diibwj_aplic",FieldDef.FLOAT,6,0);
      diicnb_lim = new FieldDef("diicnb_lim",FieldDef.FLOAT,6,0);
      diicnb_saldo = new FieldDef("diicnb_saldo",FieldDef.FLOAT,6,0);
      diicnb_aplic = new FieldDef("diicnb_aplic",FieldDef.FLOAT,6,0);
      diibmw_lim = new FieldDef("diibmw_lim",FieldDef.FLOAT,6,0);
      diibmw_saldo = new FieldDef("diibmw_saldo",FieldDef.FLOAT,6,0);
      diibmw_aplic = new FieldDef("diibmw_aplic",FieldDef.FLOAT,6,0);
      diipar_lim = new FieldDef("diipar_lim",FieldDef.FLOAT,6,0);
      diipar_saldo = new FieldDef("diipar_saldo",FieldDef.FLOAT,6,0);
      diipar_aplic = new FieldDef("diipar_aplic",FieldDef.FLOAT,6,0);
      diicto_lim = new FieldDef("diicto_lim",FieldDef.FLOAT,6,0);
      diicto_saldo = new FieldDef("diicto_saldo",FieldDef.FLOAT,6,0);
      diicto_aplic = new FieldDef("diicto_aplic",FieldDef.FLOAT,6,0);
      diicbp_lim = new FieldDef("diicbp_lim",FieldDef.FLOAT,6,0);
      diicbp_saldo = new FieldDef("diicbp_saldo",FieldDef.FLOAT,6,0);
      diicbp_aplic = new FieldDef("diicbp_aplic",FieldDef.FLOAT,6,0);
      diicpl_lim = new FieldDef("diicpl_lim",FieldDef.FLOAT,6,0);
      diicpl_saldo = new FieldDef("diicpl_saldo",FieldDef.FLOAT,6,0);
      diicpl_aplic = new FieldDef("diicpl_aplic",FieldDef.FLOAT,6,0);
      diican_lim = new FieldDef("diican_lim",FieldDef.FLOAT,6,0);
      diican_saldo = new FieldDef("diican_saldo",FieldDef.FLOAT,6,0);
      diican_aplic = new FieldDef("diican_aplic",FieldDef.FLOAT,6,0);
      diicbn_lim = new FieldDef("diicbn_lim",FieldDef.FLOAT,6,0);
      diicbn_saldo = new FieldDef("diicbn_saldo",FieldDef.FLOAT,6,0);
      diicbn_aplic = new FieldDef("diicbn_aplic",FieldDef.FLOAT,6,0);
      diiajm_lim = new FieldDef("diiajm_lim",FieldDef.FLOAT,6,0);
      diiajm_saldo = new FieldDef("diiajm_saldo",FieldDef.FLOAT,6,0);
      diiajm_aplic = new FieldDef("diiajm_aplic",FieldDef.FLOAT,6,0);
      diicmo_lim = new FieldDef("diicmo_lim",FieldDef.FLOAT,6,0);
      diicmo_saldo = new FieldDef("diicmo_saldo",FieldDef.FLOAT,6,0);
      diicmo_aplic = new FieldDef("diicmo_aplic",FieldDef.FLOAT,6,0);
      diidim_lim = new FieldDef("diidim_lim",FieldDef.FLOAT,6,0);
      diidim_saldo = new FieldDef("diidim_saldo",FieldDef.FLOAT,6,0);
      diidim_aplic = new FieldDef("diidim_aplic",FieldDef.FLOAT,6,0);
      diicee_lim = new FieldDef("diicee_lim",FieldDef.FLOAT,6,0);
      diicee_saldo = new FieldDef("diicee_saldo",FieldDef.FLOAT,6,0);
      diicee_aplic = new FieldDef("diicee_aplic",FieldDef.FLOAT,6,0);
      diice2_lim = new FieldDef("diice2_lim",FieldDef.FLOAT,6,0);
      diice2_saldo = new FieldDef("diice2_saldo",FieldDef.FLOAT,6,0);
      diice2_aplic = new FieldDef("diice2_aplic",FieldDef.FLOAT,6,0);
      diijrj_lim = new FieldDef("diijrj_lim",FieldDef.FLOAT,6,0);
      diijrj_saldo = new FieldDef("diijrj_saldo",FieldDef.FLOAT,6,0);
      diijrj_aplic = new FieldDef("diijrj_aplic",FieldDef.FLOAT,6,0);
      diicsf_lim = new FieldDef("diicsf_lim",FieldDef.FLOAT,6,0);
      diicsf_saldo = new FieldDef("diicsf_saldo",FieldDef.FLOAT,6,0);
      diicsf_aplic = new FieldDef("diicsf_aplic",FieldDef.FLOAT,6,0);
      diicsj_lim = new FieldDef("diicsj_lim",FieldDef.FLOAT,6,0);
      diicsj_saldo = new FieldDef("diicsj_saldo",FieldDef.FLOAT,6,0);
      diicsj_aplic = new FieldDef("diicsj_aplic",FieldDef.FLOAT,6,0);
      diiaju_lim = new FieldDef("diiaju_lim",FieldDef.FLOAT,6,0);
      diiaju_saldo = new FieldDef("diiaju_saldo",FieldDef.FLOAT,6,0);
      diiaju_aplic = new FieldDef("diiaju_aplic",FieldDef.FLOAT,6,0);
      diiajs_lim = new FieldDef("diiajs_lim",FieldDef.FLOAT,6,0);
      diiajs_saldo = new FieldDef("diiajs_saldo",FieldDef.FLOAT,6,0);
      diiajs_aplic = new FieldDef("diiajs_aplic",FieldDef.FLOAT,6,0);
      diisav_lim = new FieldDef("diisav_lim",FieldDef.FLOAT,6,0);
      diisav_saldo = new FieldDef("diisav_saldo",FieldDef.FLOAT,6,0);
      diisav_aplic = new FieldDef("diisav_aplic",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        diiejeraplic,
        diideclaran,
        diiidentactiv,
        diianyo,
        diiid_lim,
        diiid_saldo,
        diiid_aplic,
        diipc_lim,
        diipc_saldo,
        diipc_aplic,
        diiee_lim,
        diiee_saldo,
        diiee_aplic,
        diibic_lim,
        diibic_saldo,
        diibic_aplic,
        diifor_prof_lim,
        diifor_prof_sal,
        diifor_prof_apl,
        diipma_mat_lim,
        diipma_mat_sald,
        diipma_mat_apli,
        diied_lim,
        diied_saldo,
        diied_aplic,
        diiempleo_lim,
        diiempleo_saldo,
        diiempleo_aplic,
        diianosanto_lim,
        diianosanto_sal,
        diianosanto_apl,
        diicapcul_lim,
        diicapcul_saldo,
        diicapcul_aplic,
        diiinter_limite,
        diiinter_saldo,
        diiinter_aplic,
        diisalam_lim,
        diisalam_saldo,
        diisalam_aplic,
        diitrans_lim,
        diitrans_saldo,
        diitrans_aplic,
        diibarce_lim,
        diibarce_saldo,
        diibarce_aplic,
        diiaip_lim,
        diiaip_saldo,
        diiaip_aplic,
        diigua_lim,
        diigua_saldo,
        diigua_aplic,
        diijacob_lim,
        diijacob_saldo,
        diijacob_aplic,
        diicarab_lim,
        diicarab_saldo,
        diicarab_aplic,
        diiapd_lim,
        diiapd_saldo,
        diiapd_aplic,
        diijma_lim,
        diijma_saldo,
        diijma_aplic,
        diiqui_lim,
        diiqui_saldo,
        diiqui_aplic,
        diica7_lim,
        diica7_saldo,
        diica7_aplic,
        diiga5_lim,
        diiga5_saldo,
        diiga5_aplic,
        diisa5_lim,
        diisa5_saldo,
        diisa5_aplic,
        diipk8_lim,
        diipk8_saldo,
        diipk8_aplic,
        diileb_lim,
        diileb_saldo,
        diileb_aplic,
        diizar_lim,
        diizar_saldo,
        diizar_aplic,
        diial8_lim,
        diial8_saldo,
        diial8_aplic,
        diibwr_lim,
        diibwr_saldo,
        diibwr_aplic,
        diiajg_lim,
        diiajg_saldo,
        diiajg_aplic,
        diicbc_lim,
        diicbc_saldo,
        diicbc_aplic,
        diigca_lim,
        diigca_saldo,
        diigca_aplic,
        diigrh_lim,
        diigrh_saldo,
        diigrh_aplic,
        diilon_lim,
        diilon_saldo,
        diilon_aplic,
        diiasj_lim,
        diiasj_saldo,
        diiasj_aplic,
        diiajc_lim,
        diiajc_saldo,
        diiajc_aplic,
        diicaj_lim,
        diicaj_saldo,
        diicaj_aplic,
        diialz_lim,
        diialz_saldo,
        diialz_aplic,
        diiaho_lim,
        diiaho_saldo,
        diiaho_aplic,
        diiccb_lim,
        diiccb_saldo,
        diiccb_aplic,
        diisia_lim,
        diisia_saldo,
        diisia_aplic,
        diielx_lim,
        diielx_saldo,
        diielx_aplic,
        diijgu_lim,
        diijgu_saldo,
        diijgu_aplic,
        diijmj_lim,
        diijmj_saldo,
        diijmj_aplic,
        diicrg_lim,
        diicrg_saldo,
        diicrg_aplic,
        diisde_lim,
        diisde_saldo,
        diisde_aplic,
        diiglx_lim,
        diiglx_saldo,
        diiglx_aplic,
        diialv_lim,
        diialv_saldo,
        diialv_aplic,
        diiaor_lim,
        diiaor_saldo,
        diiaor_aplic,
        diimba_lim,
        diimba_saldo,
        diimba_aplic,
        diicmb_lim,
        diicmb_saldo,
        diicmb_aplic,
        diibne_lim,
        diibne_saldo,
        diibne_aplic,
        diigre_lim,
        diigre_saldo,
        diigre_aplic,
        diicsc_lim,
        diicsc_saldo,
        diicsc_aplic,
        diivcv_lim,
        diivcv_saldo,
        diivcv_aplic,
        diicmv_lim,
        diicmv_saldo,
        diicmv_aplic,
        diiaev_lim,
        diiaev_saldo,
        diiaev_aplic,
        diicej_lim,
        diicej_saldo,
        diicej_aplic,
        diirpl_lim,
        diirpl_saldo,
        diirpl_aplic,
        diifji_lim,
        diifji_saldo,
        diifji_aplic,
        diiuig_lim,
        diiuig_saldo,
        diiuig_aplic,
        diiccp_lim,
        diiccp_saldo,
        diiccp_aplic,
        diicar_lim,
        diicar_saldo,
        diicar_aplic,
        diibwj_lim,
        diibwj_saldo,
        diibwj_aplic,
        diicnb_lim,
        diicnb_saldo,
        diicnb_aplic,
        diibmw_lim,
        diibmw_saldo,
        diibmw_aplic,
        diipar_lim,
        diipar_saldo,
        diipar_aplic,
        diicto_lim,
        diicto_saldo,
        diicto_aplic,
        diicbp_lim,
        diicbp_saldo,
        diicbp_aplic,
        diicpl_lim,
        diicpl_saldo,
        diicpl_aplic,
        diican_lim,
        diican_saldo,
        diican_aplic,
        diicbn_lim,
        diicbn_saldo,
        diicbn_aplic,
        diiajm_lim,
        diiajm_saldo,
        diiajm_aplic,
        diicmo_lim,
        diicmo_saldo,
        diicmo_aplic,
        diidim_lim,
        diidim_saldo,
        diidim_aplic,
        diicee_lim,
        diicee_saldo,
        diicee_aplic,
        diice2_lim,
        diice2_saldo,
        diice2_aplic,
        diijrj_lim,
        diijrj_saldo,
        diijrj_aplic,
        diicsf_lim,
        diicsf_saldo,
        diicsf_aplic,
        diicsj_lim,
        diicsj_saldo,
        diicsj_aplic,
        diiaju_lim,
        diiaju_saldo,
        diiaju_aplic,
        diiajs_lim,
        diiajs_saldo,
        diiajs_aplic,
        diisav_lim,
        diisav_saldo,
        diisav_aplic        
        };
      setColumns(array);
      FieldDef arrayf[] = {diiejeraplic,diideclaran,diiidentactiv,diianyo };
      setDescription("Deduccion Inversiones");
      setPrimaryKeys(arrayf);
      diiejeraplic.setDescription("Ejercicio fiscal aplicacion");
      diideclaran.setDescription("Declarante");
      diiidentactiv.setDescription("Identificador actividad");
      diianyo.setDescription("Ejercicio");
      diiid_lim.setDescription("I+D limite");
      diiid_saldo.setDescription("I+D saldo anterior");
      diiid_aplic.setDescription("I+D aplicado");
      diipc_lim.setDescription("Prod. cinemat. limite");
      diipc_saldo.setDescription("Prod. cinemat. saldo anterior");
      diipc_aplic.setDescription("Prod. cinemat. aplicado");
      diiee_lim.setDescription("Emp. exportad. limite");
      diiee_saldo.setDescription("Emp. exportad. saldo anterior");
      diiee_aplic.setDescription("Emp. exportad. aplicado");
      diibic_lim.setDescription("BIC. limite");
      diibic_saldo.setDescription("BIC. saldo anterior");
      diibic_aplic.setDescription("BIC. aplicado");
      diifor_prof_lim.setDescription("Formacion profesional  limite");
      diifor_prof_sal.setDescription("Formacion prof. saldo anterior");
      diifor_prof_apl.setDescription("Formacion profesional aplicado");
      diipma_mat_lim.setDescription("Medio ambiente limite");
      diipma_mat_sald.setDescription("Medio ambiente saldo anterior");
      diipma_mat_apli.setDescription("Medio ambiente aplicado");
      diied_lim.setDescription("Edicion libros limite");
      diied_saldo.setDescription("Edicion libros saldo anterior");
      diied_aplic.setDescription("Edicion libros aplicado");
      diiempleo_lim.setDescription("Empleo minusvalidos limite");
      diiempleo_saldo.setDescription("Empleo minusval.saldo anterior");
      diiempleo_aplic.setDescription("Empleo minusvalidos aplicado");
      diianosanto_lim.setDescription("Año Santo Jacobeo 1999 limite");
      diianosanto_sal.setDescription("Año Santo Jacobeo 1999 saldo");
      diianosanto_apl.setDescription("Año Santo Jacobeo 1999aplic.re");
      diicapcul_lim.setDescription("Capital Europea 2000 limite");
      diicapcul_saldo.setDescription("Capital Europea 2000 saldo");
      diicapcul_aplic.setDescription("Capital Europea 2000 aplic.res");
      diiinter_limite.setDescription("Fomento Tecnol.Informac.limite");
      diiinter_saldo.setDescription("Fomento Tecnol.Informac. saldo");
      diiinter_aplic.setDescription("Fomento Tecnol.Infor.aplic.res");
      diisalam_lim.setDescription("Salamanca 2002 limite");
      diisalam_saldo.setDescription("Salamanca 2002 saldo");
      diisalam_aplic.setDescription("Salamanca 2002 aplicado");
      diitrans_lim.setDescription("Sector Transporte limite");
      diitrans_saldo.setDescription("Sector Transporte saldo");
      diitrans_aplic.setDescription("Sector Transporte aplicado");
      diibarce_lim.setDescription("Barcelona 2004 limite");
      diibarce_saldo.setDescription("Barcelona 2004 saldo");
      diibarce_aplic.setDescription("Barcelona 2004 aplicado");
      diiaip_lim.setDescription("Contribuciones AIP limite");
      diiaip_saldo.setDescription("Contribuciones AIP saldo");
      diiaip_aplic.setDescription("Contribuciones AIP aplicado");
      diigua_lim.setDescription("Gastos guarderia limite");
      diigua_saldo.setDescription("Gastos guarderia saldo");
      diigua_aplic.setDescription("Gastos guarderia aplicado");
      diijacob_lim.setDescription("Jacobeo 2004 limite");
      diijacob_saldo.setDescription("Jacobeo 2004 saldo");
      diijacob_aplic.setDescription("Jacobeo 2004 aplicado");
      diicarab_lim.setDescription("Carabaca 2003 limite");
      diicarab_saldo.setDescription("Carabaca 2003 saldo");
      diicarab_aplic.setDescription("Carabaca 2003 aplicado");
      diiapd_lim.setDescription("Aport. patrim.pers.discap. lim");
      diiapd_saldo.setDescription("Aport.patrim.pers.discap.saldo");
      diiapd_aplic.setDescription("Aport.patrim.pers.discap.aplic");
      diijma_lim.setDescription("Juegos Almeria 2004 limite");
      diijma_saldo.setDescription("Juegos Almeria 2004 saldo");
      diijma_aplic.setDescription("Juegos Almeria 2004 aplicado");
      diiqui_lim.setDescription("IV Centenario Quijote limite");
      diiqui_saldo.setDescription("IV Centenario Quijote saldo");
      diiqui_aplic.setDescription("IV Centenario Quijote aplicado");
      diica7_lim.setDescription("Copa America 2007 limite");
      diica7_saldo.setDescription("Copa America 2007 saldo");
      diica7_aplic.setDescription("Copa America 2007 aplicado");
      diiga5_lim.setDescription("Galicia 2005 limite");
      diiga5_saldo.setDescription("Galicia 2005 saldo");
      diiga5_aplic.setDescription("Galicia 2005 aplicado");
      diisa5_lim.setDescription("Salamanca 2005 limite");
      diisa5_saldo.setDescription("Salamanca 2005 saldo");
      diisa5_aplic.setDescription("Salamanca 2005 aplicado");
      diipk8_lim.setDescription("JJOO Pekin 2008 limite");
      diipk8_saldo.setDescription("JJOO Pekin 2008 Saldo");
      diipk8_aplic.setDescription("JJOO Pekin 2008 aplicado");
      diileb_lim.setDescription("Año Lebaniego 2006 limite");
      diileb_saldo.setDescription("Año Lebaniego 2006 saldo");
      diileb_aplic.setDescription("Año Lebaniego 2006 aplicado");
      diizar_lim.setDescription("Expo Zaragoza 2008 limite");
      diizar_saldo.setDescription("Expo Zaragoza 2008 saldo");
      diizar_aplic.setDescription("Expo Zaragoza 2008 aplicado");
      diial8_lim.setDescription("Alicante 2008 limite");
      diial8_saldo.setDescription("Alicante 2008 saldo");
      diial8_aplic.setDescription("Alicante 2008 aplicado");
      diibwr_lim.setDescription("Barcelona World Race limite");
      diibwr_saldo.setDescription("Barcelona World Race saldo");
      diibwr_aplic.setDescription("Barcelona World Race aplicado");
      diiajg_lim.setDescription("Año Jubilar Guadalupense limit");
      diiajg_saldo.setDescription("Año Jubilar Guadalipense saldo");
      diiajg_aplic.setDescription("A.Jubil. Guadalupense aplicado");
      diicbc_lim.setDescription("Bicentenario Constitucion limi");
      diicbc_saldo.setDescription("Bicentenario Constitucion sald");
      diicbc_aplic.setDescription("Bicentenario Constitucion apli");
      diigca_lim.setDescription("33 Copa America limite");
      diigca_saldo.setDescription("33 Copa America saldo anterior");
      diigca_aplic.setDescription("33 Copa America aplicado ejer");
      diigrh_lim.setDescription("Guadalquivir rio hist.limite");
      diigrh_saldo.setDescription("Guadalquivir rio his.saldo an");
      diigrh_aplic.setDescription("Guadalquivir rio hist. aplicad");
      diilon_lim.setDescription("Londres 2012 limite");
      diilon_saldo.setDescription("Londres 2012 saldo an");
      diilon_aplic.setDescription("Londres 2012 aplicad");
      diiasj_lim.setDescription("Año Santo Jacobeo 2010 limite");
      diiasj_saldo.setDescription("Año Santo Jacobeo 2010 saldo an");
      diiasj_aplic.setDescription("Año Santo Jacobeo 2010 aplicad");
      diiajc_lim.setDescription("Año Jubilar Calceatense limite");
      diiajc_saldo.setDescription("Año Jubilar Calceatense saldo an");
      diiajc_aplic.setDescription("Año Jubilar Calceatense aplicad");
      diicaj_lim.setDescription("Caravaca Jubilar 2010 limite");
      diicaj_saldo.setDescription("Caravaca Jubilar 2010 saldo an");
      diicaj_aplic.setDescription("Caravaca Jubilar 2010 aplicad");
      diialz_lim.setDescription("Alzheimer internacional 2011 limite");
      diialz_saldo.setDescription("Alzheimer internacional 2011 saldo an");
      diialz_aplic.setDescription("Alzheimer internacional 2011 aplicad");
      diiaho_lim.setDescription("Año Hernandiano Orihuela 2010 limite");
      diiaho_saldo.setDescription("Año Hernandiano Orihuela 2010 saldo an");
      diiaho_aplic.setDescription("Año Hernandiano Orihuela 2010 aplicad");
      diiccb_lim.setDescription("Centenario Costa Brava limite");
      diiccb_saldo.setDescription("Centenario Costa Brava saldo an");
      diiccb_aplic.setDescription("Centenario Costa Brava aplicad");
      diisia_lim.setDescription("Salon internacional automovil BCN limite");
      diisia_saldo.setDescription("Salon internacional automovil BCN saldo an");
      diisia_aplic.setDescription("Salon internacional automovil BCN aplicad");
      diielx_lim.setDescription("Misteri Elx limite");
      diielx_saldo.setDescription("Misteri Elx saldo anterior");
      diielx_aplic.setDescription("Misteri Elx aplicado");
      diijgu_lim.setDescription("Jubilar Guadalupense 2010 limite");
      diijgu_saldo.setDescription("Jubilar Guadalupense 2010 saldo anterior");
      diijgu_aplic.setDescription("Jubilar Guadalupense 2010 aplicado");
      diijmj_lim.setDescription("Jornadas mundiales juventud 2011 limite");
      diijmj_saldo.setDescription("Jornadas mundiales juventud 2011 saldo anterior");
      diijmj_aplic.setDescription("Jornadas mundiales juventud 2011 aplicado");
      diicrg_lim.setDescription("Fundacion milenio Reino Granada limite");
      diicrg_saldo.setDescription("Fundacion milenio Reino Granada saldo anterior");
      diicrg_aplic.setDescription("Fundacion milenio Reino Granada aplicado");
      diisde_lim.setDescription("Solar Decathlon Europa limite");
      diisde_saldo.setDescription("Solar Decathlon Europa saldo anterior");
      diisde_aplic.setDescription("Solar Decathlon Europa aplicado");
      diiglx_lim.setDescription("Google Lunar X Prize limite");
      diiglx_saldo.setDescription("Google Lunar X Prize saldo anterior");
      diiglx_aplic.setDescription("Google Lunar X Prize aplicado");
      diialv_lim.setDescription("Alicante 2011 Vuelta al mundo limite");
      diialv_saldo.setDescription("Alicante 2011 Vuelta al mundo saldo anterior");
      diialv_aplic.setDescription("Alicante 2011 Vuelta al mundo aplicado");
      diiaor_lim.setDescription("AOR 2011 Año Orellana Limite");
      diiaor_saldo.setDescription("2011 Año Orellana Saldo anterior");
      diiaor_aplic.setDescription("2011 Año Orellana Aplicado");
      diimba_lim.setDescription("MBA Mundobasket 2014  Limite");
      diimba_saldo.setDescription("Mundobasket 2014  Saldo anterior");
      diimba_aplic.setDescription("Mundobasket 2014  Aplicado");
      diicmb_lim.setDescription("CMB Campeonato Mundo Balonmano 2013 Limite");
      diicmb_saldo.setDescription("Campeonato Mundo Balonmano 2013 Saldo anterior");
      diicmb_aplic.setDescription("Campeonato Mundo Balonmano 2013 Aplicado");
      diibne_lim.setDescription("BNE Tricentenario Biblioteca Nacional Esp. Limite");
      diibne_saldo.setDescription("Tricentenario Biblioteca Nacional Esp. Saldo anter");
      diibne_aplic.setDescription("Tricentenario Biblioteca Nacional Esp. Aplicado");
      diigre_lim.setDescription("GRE IV Centernario fallecimimento pintor El Greco Limite");
      diigre_saldo.setDescription("IV Centernario fallecimimento pintor El Greco Saldo ant");
      diigre_aplic.setDescription("IV Centernario fallecimimento pintor El Greco Aplicado");
      diicsc_lim.setDescription("CSC VIII Centenario Catedral Santiago Compostela Limite");
      diicsc_saldo.setDescription("VIII Centenario Catedral Santiago Compostela Saldo ant");
      diicsc_aplic.setDescription("VIII Centenario Catedral Santiago Compostela Aplicado");
      diivcv_lim.setDescription("VCV Victoria Gasteiz capital verde europea 2012 Limite");
      diivcv_saldo.setDescription("Victoria Gasteiz capital verde europea 2012 Saldo anterior");
      diivcv_aplic.setDescription("Victoria Gasteiz capital verde europea 2012 Aplicado");
      diicmv_lim.setDescription("CMV Campeonato mundo vela ISAF 2014 Limite");
      diicmv_saldo.setDescription("Campeonato mundo vela ISAF 2014 Saldo anterior");
      diicmv_aplic.setDescription("Campeonato mundo vela ISAF 2014 Aplicado");
      diiaev_lim.setDescription("AEV El árbol es vida Limite");
      diiaev_saldo.setDescription("El árbol es vida Saldo anterior");
      diiaev_aplic.setDescription("El árbol es vida Aplicado");
      diicej_lim.setDescription("CEJ IV Centenario relaciones Esp Japón Limite");
      diicej_saldo.setDescription("IV Centenario relaciones Esp Japón Saldo anterior");
      diicej_aplic.setDescription("IV Centenario relaciones Esp Japón Aplicado");
      diirpl_lim.setDescription("RPL Recuperación patrimonio cultural Lorca Limite");
      diirpl_saldo.setDescription("Recuperación patrimonio cultural Lorca Saldo anterior");
      diirpl_aplic.setDescription("Recuperación patrimonio cultural Lorca Aplicado");
      diifji_lim.setDescription("FJI Foro juvenil Iberoamericano del patrimonio mundial Limite");
      diifji_saldo.setDescription("Foro juvenil Iberoamericano del patrimonio mundial Saldo anterior");
      diifji_aplic.setDescription("Foro juvenil Iberoamericano del patrimonio mundial Aplicado");
      diiuig_lim.setDescription("UIG Universiada de invierno Granada 2015 Limite");
      diiuig_saldo.setDescription("Universiada de invierno Granada 2015 Saldo anterior");
      diiuig_aplic.setDescription("Universiada de invierno Granada 2015 Aplicado");
      diiccp_lim.setDescription("CCP Campeonato ciclismo  Ponferrada 2014 Limite");
      diiccp_saldo.setDescription("Campeonato ciclismo  Ponferrada 2014 Saldo anterior");
      diiccp_aplic.setDescription("Campeonato ciclismo  Ponferrada 2014 Aplicado");
      diicar_lim.setDescription("CAR Centro UNESCO para arte rupestre Limite");
      diicar_saldo.setDescription("Centro UNESCO para arte rupestre Saldo anterior");
      diicar_aplic.setDescription("Centro UNESCO para arte rupestre Aplicado");
      diibwj_lim.setDescription("BWJ Barcelona word Jumping Challenge Limite");
      diibwj_saldo.setDescription("Barcelona word Jumping Challenge Saldo anterior");
      diibwj_aplic.setDescription("Barcelona word Jumping Challenge Aplicado");
      diicnb_lim.setDescription("CNB Campeonato natacion Barcelona 2013 Limite");
      diicnb_saldo.setDescription("Campeonato natacion Barcelona 2013 Saldo anterior");
      diicnb_aplic.setDescription("Campeonato natacion Barcelona 2013 Aplicado");
      diibmw_lim.setDescription("BMW Barcelona Mobile world Capital Limite");
      diibmw_saldo.setDescription("Barcelona Mobile world Capital Saldo anterior");
      diibmw_aplic.setDescription("Barcelona Mobile world Capital Aplicado");
      diipar_lim.setDescription("PAR Paris 1972 40 aniversario convencion mundial Limite");
      diipar_saldo.setDescription("Paris 1972 40 aniversario convencion mundial Saldo anterior");
      diipar_aplic.setDescription("Paris 1972 40 aniversario convencion mundial Capital Aplicado");
      diicto_lim.setDescription("CTO Campeonato tiro olimpico Las Gabias 2014 Limite");
      diicto_saldo.setDescription("Campeonato tiro olimpico Las Gabias 2014 Saldo anterior");
      diicto_aplic.setDescription("Campeonato tiro olimpico Las Gabias 2014 Capital Aplicado");
      diicbp_lim.setDescription("CBP Conmemoración 500 años Bula Papal Limite");
      diicbp_saldo.setDescription("Conmemoración 500 años Bula Papal Saldo anterior");
      diicbp_aplic.setDescription("Conmemoración 500 años Bula Papal Aplicado");
      diicpl_lim.setDescription("CPL 2012 año de las culturas, la paz y la libertad Limite");
      diicpl_saldo.setDescription("2012 año de las culturas, la paz y la libertad Saldo anterior");
      diicpl_aplic.setDescription("2012 año de las culturas, la paz y la libertad Capital Aplicado");
      diican_lim.setDescription("CAN Conmemoración Año de la neurociencia Limite");
      diican_saldo.setDescription("Conmemoración Año de la neurociencia Saldo anterior");
      diican_aplic.setDescription("Conmemoración Año de la neurociencia Capital Aplicado");
      diicbn_lim.setDescription("CBN VIII Centenario batalla Navas de Tolosa 1212 Limite");
      diicbn_saldo.setDescription("VIII Centenario batalla Navas de Tolosa 1212 Saldo anterior");
      diicbn_aplic.setDescription("VIII Centenario batalla Navas de Tolosa 1212 Capital Aplicado");
      diiajm_lim.setDescription("AJM Año Jubilar Mariano 2012-2013 Almonte Limite");
      diiajm_saldo.setDescription("Año Jubilar Mariano 2012-2013 Almonte Saldo anterior");
      diiajm_aplic.setDescription("Año Jubilar Mariano 2012-2013 Almonte Capital Aplicado");
      diicmo_lim.setDescription("CMO Candidatura de Madrid 2020 Limite");
      diicmo_saldo.setDescription("Candidatura de Madrid 2020 Saldo anterior");
      diicmo_aplic.setDescription("Candidatura de Madrid 2020 Capital Aplicado");
      diidim_lim.setDescription("DIM Dieta Mediterranea Limite");
      diidim_saldo.setDescription("Dieta Mediterranea Saldo anterior");
      diidim_aplic.setDescription("Dieta Mediterranea Capital Aplicado");
      diicee_lim.setDescription("CE1 Creacion empleo emprendedores Art.43.1 Limite");
      diicee_saldo.setDescription("Creacion empleo emprendedores Art.43.1 Saldo anterior");
      diicee_aplic.setDescription("Creacion empleo emprendedores Art.43.1 Aplicado");
      diice2_lim.setDescription("CE2 Creacion empleo emprendedores Art.43.2 Limite");
      diice2_saldo.setDescription("Creacion empleo emprendedores Art.43.2 Saldo anterior");
      diice2_aplic.setDescription("Creacion empleo emprendedores Art.43.2 Capital Aplicado");
      diijrj_lim.setDescription("JRJ Juegos Rio Janeiro 2016 Limite");
      diijrj_saldo.setDescription("Juegos Rio Janeiro 2016 Saldo anterior");
      diijrj_aplic.setDescription("Juegos Rio Janeiro 2016 Capital Aplicado");
      diicsf_lim.setDescription("CSF VIII Centenario peregrinación de St Fco Asis a Santiago Comp Limite");
      diicsf_saldo.setDescription("VIII Centenario peregrinación de St Fco Asis a Santiago Comp Saldo anterior");
      diicsf_aplic.setDescription("VIII Centenario peregrinación de St Fco Asis a Santiago Comp Capital Aplicado");
      diicsj_lim.setDescription("CSJ VIII V Centernario nacimiento de Sta Teresa de Jesús Limite");
      diicsj_saldo.setDescription("VIII V Centernario nacimiento de Sta Teresa de Jesús Saldo anterior");
      diicsj_aplic.setDescription("VIII V Centernario nacimiento de Sta Teresa de Jesús Capital Aplicado");
      diiaju_lim.setDescription("AJU Año Junipero Serra 2013 Limite");
      diiaju_saldo.setDescription("Año Junipero Serra 2013 Saldo anterior");
      diiaju_aplic.setDescription("Año Junipero Serra 2013 Capital Aplicado");
      diiajs_lim.setDescription("AJS Año Jubilar Mariano 2013-2014 Sevilla Limite");
      diiajs_saldo.setDescription("Año Jubilar Mariano 2013-2014 Sevilla Saldo anterior");
      diiajs_aplic.setDescription("Año Jubilar Mariano 2013-2014 Sevilla Capital Aplicado");
      diisav_lim.setDescription("SAV Salida vuelta mundo vela Alicante 2014 Limite");
      diisav_saldo.setDescription("Salida vuelta mundo vela Alicante 2014 Saldo anterior");
      diisav_aplic.setDescription("Salida vuelta mundo vela Alicante 2014 Capital Aplicado");
      }
    }
    
  public class TabDedcreaempleo extends TableDef
    {
    // Campos
    public FieldDef dceejeraplic;
    public FieldDef dcedeclaran;
    public FieldDef dceidentactiv;
    public FieldDef dceactual_indef;
    public FieldDef dceanter_indef;
    public FieldDef dceactual_noind;
    public FieldDef dceanter_noinde;
    public FieldDef dceincremento;
    public FieldDef dcededuccion;
    public FieldDef dceactual_65;
    public FieldDef dceanter_65;
    public FieldDef dceincrem_65;
    public TabDedcreaempleo(String name)
      {
      super(name);
      dceejeraplic = new FieldDef("dceejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcedeclaran = new FieldDef("dcedeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dceidentactiv = new FieldDef("dceidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dceactual_indef = new FieldDef("dceactual_indef",FieldDef.FLOAT,6,0);
      dceanter_indef = new FieldDef("dceanter_indef",FieldDef.FLOAT,6,0);
      dceactual_noind = new FieldDef("dceactual_noind",FieldDef.FLOAT,6,0);
      dceanter_noinde = new FieldDef("dceanter_noinde",FieldDef.FLOAT,6,0);
      dceincremento = new FieldDef("dceincremento",FieldDef.FLOAT,6,0);
      dcededuccion = new FieldDef("dcededuccion",FieldDef.FLOAT,6,0);
      dceactual_65 = new FieldDef("dceactual_65",FieldDef.FLOAT,6,0);
      dceanter_65 = new FieldDef("dceanter_65",FieldDef.FLOAT,6,0);
      dceincrem_65 = new FieldDef("dceincrem_65",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        dceejeraplic,
        dcedeclaran,
        dceidentactiv,
        dceactual_indef,
        dceanter_indef,
        dceactual_noind,
        dceanter_noinde,
        dceincremento,
        dcededuccion,
        dceactual_65,
        dceanter_65,
        dceincrem_65        
        };
      setColumns(array);
      FieldDef arrayf[] = {dceejeraplic,dcedeclaran,dceidentactiv };
      setDescription("Deduccion creacion empleo minusvalidos");
      setPrimaryKeys(arrayf);
      dceejeraplic.setDescription("Ejercicio fiscal aplicacion");
      dcedeclaran.setDescription("Declarante");
      dceidentactiv.setDescription("Identificador actividad");
      dceactual_indef.setDescription("Plant. prom. indefin. año act./2013 minus.>=33%");
      dceanter_indef.setDescription("Plant. prom. indefin. año ant./2013 minus.>=33%");
      dceactual_noind.setDescription("Plant.prom.no indefin.año act.");
      dceanter_noinde.setDescription("Plant.prom.no indefin.año ant.");
      dceincremento.setDescription("Incremento plantilla");
      dcededuccion.setDescription("Deduccion por creacion empleo");
      dceactual_65.setDescription("2013 Plant.promedio ej.act minusvalia >=65%");
      dceanter_65.setDescription("2013 Plant.promedio.ej.ant minusvalia >=65%");
      dceincrem_65.setDescription("Incremento plantilla");
      }
    }
    
  public class TabDedinvcanarias extends TableDef
    {
    // Campos
    public FieldDef dicejeraplic;
    public FieldDef dicdeclaran;
    public FieldDef dicidentactiv;
    public FieldDef dicanyo;
    public FieldDef dicaf_lim;
    public FieldDef dicaf_saldo;
    public FieldDef dicaf_aplic;
    public FieldDef dicid_lim;
    public FieldDef dicid_saldo;
    public FieldDef dicid_aplic;
    public FieldDef dicpc_lim;
    public FieldDef dicpc_saldo;
    public FieldDef dicpc_aplic;
    public FieldDef dicbic_lim;
    public FieldDef dicbic_saldo;
    public FieldDef dicbic_aplic;
    public FieldDef dicee_lim;
    public FieldDef dicee_saldo;
    public FieldDef dicee_aplic;
    public FieldDef dicfor_prof_lim;
    public FieldDef dicfor_prof_sal;
    public FieldDef dicfor_prof_apl;
    public FieldDef dicpma_mat_lim;
    public FieldDef dicpma_mat_sald;
    public FieldDef dicpma_mat_apli;
    public FieldDef diced_lim;
    public FieldDef diced_saldo;
    public FieldDef diced_aplic;
    public FieldDef dicempleo_lim;
    public FieldDef dicempleo_saldo;
    public FieldDef dicempleo_aplic;
    public FieldDef dicinter_lim;
    public FieldDef dicinter_saldo;
    public FieldDef dicinter_aplic;
    public FieldDef dictrans_limite;
    public FieldDef dictrans_saldo;
    public FieldDef dictrans_aplic;
    public FieldDef dicaip_lim;
    public FieldDef dicaip_saldo;
    public FieldDef dicaip_aplic;
    public FieldDef dicgua_lim;
    public FieldDef dicgua_saldo;
    public FieldDef dicgua_aplic;
    public FieldDef dicapd_lim;
    public FieldDef dicapd_saldo;
    public FieldDef dicapd_aplic;
    public FieldDef dicce1_lim;
    public FieldDef dicce1_saldo;
    public FieldDef dicce1_aplic;
    public FieldDef dicce2_lim;
    public FieldDef dicce2_saldo;
    public FieldDef dicce2_aplic;
    public FieldDef dicbii_lim;
    public FieldDef dicbii_saldo;
    public FieldDef dicbii_aplic;
    public TabDedinvcanarias(String name)
      {
      super(name);
      dicejeraplic = new FieldDef("dicejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dicdeclaran = new FieldDef("dicdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dicidentactiv = new FieldDef("dicidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dicanyo = new FieldDef("dicanyo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dicaf_lim = new FieldDef("dicaf_lim",FieldDef.FLOAT,6,0);
      dicaf_saldo = new FieldDef("dicaf_saldo",FieldDef.FLOAT,6,0);
      dicaf_aplic = new FieldDef("dicaf_aplic",FieldDef.FLOAT,6,0);
      dicid_lim = new FieldDef("dicid_lim",FieldDef.FLOAT,6,0);
      dicid_saldo = new FieldDef("dicid_saldo",FieldDef.FLOAT,6,0);
      dicid_aplic = new FieldDef("dicid_aplic",FieldDef.FLOAT,6,0);
      dicpc_lim = new FieldDef("dicpc_lim",FieldDef.FLOAT,6,0);
      dicpc_saldo = new FieldDef("dicpc_saldo",FieldDef.FLOAT,6,0);
      dicpc_aplic = new FieldDef("dicpc_aplic",FieldDef.FLOAT,6,0);
      dicbic_lim = new FieldDef("dicbic_lim",FieldDef.FLOAT,6,0);
      dicbic_saldo = new FieldDef("dicbic_saldo",FieldDef.FLOAT,6,0);
      dicbic_aplic = new FieldDef("dicbic_aplic",FieldDef.FLOAT,6,0);
      dicee_lim = new FieldDef("dicee_lim",FieldDef.FLOAT,6,0);
      dicee_saldo = new FieldDef("dicee_saldo",FieldDef.FLOAT,6,0);
      dicee_aplic = new FieldDef("dicee_aplic",FieldDef.FLOAT,6,0);
      dicfor_prof_lim = new FieldDef("dicfor_prof_lim",FieldDef.FLOAT,6,0);
      dicfor_prof_sal = new FieldDef("dicfor_prof_sal",FieldDef.FLOAT,6,0);
      dicfor_prof_apl = new FieldDef("dicfor_prof_apl",FieldDef.FLOAT,6,0);
      dicpma_mat_lim = new FieldDef("dicpma_mat_lim",FieldDef.FLOAT,6,0);
      dicpma_mat_sald = new FieldDef("dicpma_mat_sald",FieldDef.FLOAT,6,0);
      dicpma_mat_apli = new FieldDef("dicpma_mat_apli",FieldDef.FLOAT,6,0);
      diced_lim = new FieldDef("diced_lim",FieldDef.FLOAT,6,0);
      diced_saldo = new FieldDef("diced_saldo",FieldDef.FLOAT,6,0);
      diced_aplic = new FieldDef("diced_aplic",FieldDef.FLOAT,6,0);
      dicempleo_lim = new FieldDef("dicempleo_lim",FieldDef.FLOAT,6,0);
      dicempleo_saldo = new FieldDef("dicempleo_saldo",FieldDef.FLOAT,6,0);
      dicempleo_aplic = new FieldDef("dicempleo_aplic",FieldDef.FLOAT,6,0);
      dicinter_lim = new FieldDef("dicinter_lim",FieldDef.FLOAT,6,0);
      dicinter_saldo = new FieldDef("dicinter_saldo",FieldDef.FLOAT,6,0);
      dicinter_aplic = new FieldDef("dicinter_aplic",FieldDef.FLOAT,6,0);
      dictrans_limite = new FieldDef("dictrans_limite",FieldDef.FLOAT,6,0);
      dictrans_saldo = new FieldDef("dictrans_saldo",FieldDef.FLOAT,6,0);
      dictrans_aplic = new FieldDef("dictrans_aplic",FieldDef.FLOAT,6,0);
      dicaip_lim = new FieldDef("dicaip_lim",FieldDef.FLOAT,6,0);
      dicaip_saldo = new FieldDef("dicaip_saldo",FieldDef.FLOAT,6,0);
      dicaip_aplic = new FieldDef("dicaip_aplic",FieldDef.FLOAT,6,0);
      dicgua_lim = new FieldDef("dicgua_lim",FieldDef.FLOAT,6,0);
      dicgua_saldo = new FieldDef("dicgua_saldo",FieldDef.FLOAT,6,0);
      dicgua_aplic = new FieldDef("dicgua_aplic",FieldDef.FLOAT,6,0);
      dicapd_lim = new FieldDef("dicapd_lim",FieldDef.FLOAT,6,0);
      dicapd_saldo = new FieldDef("dicapd_saldo",FieldDef.FLOAT,6,0);
      dicapd_aplic = new FieldDef("dicapd_aplic",FieldDef.FLOAT,6,0);
      dicce1_lim = new FieldDef("dicce1_lim",FieldDef.FLOAT,6,0);
      dicce1_saldo = new FieldDef("dicce1_saldo",FieldDef.FLOAT,6,0);
      dicce1_aplic = new FieldDef("dicce1_aplic",FieldDef.FLOAT,6,0);
      dicce2_lim = new FieldDef("dicce2_lim",FieldDef.FLOAT,6,0);
      dicce2_saldo = new FieldDef("dicce2_saldo",FieldDef.FLOAT,6,0);
      dicce2_aplic = new FieldDef("dicce2_aplic",FieldDef.FLOAT,6,0);
      dicbii_lim = new FieldDef("dicbii_lim",FieldDef.FLOAT,6,0);
      dicbii_saldo = new FieldDef("dicbii_saldo",FieldDef.FLOAT,6,0);
      dicbii_aplic = new FieldDef("dicbii_aplic",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        dicejeraplic,
        dicdeclaran,
        dicidentactiv,
        dicanyo,
        dicaf_lim,
        dicaf_saldo,
        dicaf_aplic,
        dicid_lim,
        dicid_saldo,
        dicid_aplic,
        dicpc_lim,
        dicpc_saldo,
        dicpc_aplic,
        dicbic_lim,
        dicbic_saldo,
        dicbic_aplic,
        dicee_lim,
        dicee_saldo,
        dicee_aplic,
        dicfor_prof_lim,
        dicfor_prof_sal,
        dicfor_prof_apl,
        dicpma_mat_lim,
        dicpma_mat_sald,
        dicpma_mat_apli,
        diced_lim,
        diced_saldo,
        diced_aplic,
        dicempleo_lim,
        dicempleo_saldo,
        dicempleo_aplic,
        dicinter_lim,
        dicinter_saldo,
        dicinter_aplic,
        dictrans_limite,
        dictrans_saldo,
        dictrans_aplic,
        dicaip_lim,
        dicaip_saldo,
        dicaip_aplic,
        dicgua_lim,
        dicgua_saldo,
        dicgua_aplic,
        dicapd_lim,
        dicapd_saldo,
        dicapd_aplic,
        dicce1_lim,
        dicce1_saldo,
        dicce1_aplic,
        dicce2_lim,
        dicce2_saldo,
        dicce2_aplic,
        dicbii_lim,
        dicbii_saldo,
        dicbii_aplic        
        };
      setColumns(array);
      FieldDef arrayf[] = {dicejeraplic,dicdeclaran,dicidentactiv,dicanyo };
      setDescription("Deduccion Inversiones Canarias");
      setPrimaryKeys(arrayf);
      dicejeraplic.setDescription("Ejercicio fiscal aplicacion");
      dicdeclaran.setDescription("Declarante");
      dicidentactiv.setDescription("Identificador actividad");
      dicanyo.setDescription("Ejercicio");
      dicaf_lim.setDescription("Activos fijos limite");
      dicaf_saldo.setDescription("Activos fijos saldo anterior");
      dicaf_aplic.setDescription("Activos fijos aplicado");
      dicid_lim.setDescription("I+D limite");
      dicid_saldo.setDescription("I+D saldo anterior");
      dicid_aplic.setDescription("I+D aplicado");
      dicpc_lim.setDescription("Prod. cinemat. limite");
      dicpc_saldo.setDescription("Prod. cinemat. saldo anterior");
      dicpc_aplic.setDescription("Prod. cinemat. aplicado");
      dicbic_lim.setDescription("BIC. limite");
      dicbic_saldo.setDescription("BIC. saldo anterior");
      dicbic_aplic.setDescription("BIC. aplicado");
      dicee_lim.setDescription("Emp. exportad. limite");
      dicee_saldo.setDescription("Emp. exportad. saldo anterior");
      dicee_aplic.setDescription("Emp. exportad. aplicado");
      dicfor_prof_lim.setDescription("Formacion profesional  limite");
      dicfor_prof_sal.setDescription("Formacion prof. saldo anterior");
      dicfor_prof_apl.setDescription("Formacion profesional aplicado");
      dicpma_mat_lim.setDescription("Medio ambiente limite");
      dicpma_mat_sald.setDescription("Medio ambiente saldo anterior");
      dicpma_mat_apli.setDescription("Medio ambiente aplicado");
      diced_lim.setDescription("Edicion libros limite");
      diced_saldo.setDescription("Edicion libros saldo anterior");
      diced_aplic.setDescription("Edicion libros aplicado");
      dicempleo_lim.setDescription("Empleo minusvalidos limite");
      dicempleo_saldo.setDescription("Empleo minusval.saldo anterior");
      dicempleo_aplic.setDescription("Empleo minusvalidos aplicado");
      dicinter_lim.setDescription("Fomento Tecnol.Informac.limite");
      dicinter_saldo.setDescription("Fomento Tecnol.Informac. saldo");
      dicinter_aplic.setDescription("Fomento Tecnol.Infor.aplic res");
      dictrans_limite.setDescription("Apoyo sector transporte limite");
      dictrans_saldo.setDescription("Apoyo sector transporte saldo");
      dictrans_aplic.setDescription("Apoyo transporte aplic.resid.");
      dicaip_lim.setDescription("Contribuciones AIP limite");
      dicaip_saldo.setDescription("Contribuciones AIP saldo");
      dicaip_aplic.setDescription("Contribuciones AIP aplicado");
      dicgua_lim.setDescription("Gastos guarderia limite");
      dicgua_saldo.setDescription("Gastos guarderia saldo");
      dicgua_aplic.setDescription("Gastos guarderia aplicado");
      dicapd_lim.setDescription("Aport.patrim.discap. limite");
      dicapd_saldo.setDescription("Aport.patrim.discap. saldo");
      dicapd_aplic.setDescription("Aport.patrim.discap. aplicado");
      dicce1_lim.setDescription("CE1 Creacion empleo emprendedores Art.43.1 Limite");
      dicce1_saldo.setDescription("Creacion empleo emprendedores Art.43.1 Saldo anterior");
      dicce1_aplic.setDescription("Creacion empleo emprendedores Art.43.1 Aplicado");
      dicce2_lim.setDescription("CE2 Creacion empleo emprendedores Art.43.2 Limite");
      dicce2_saldo.setDescription("Creacion empleo emprendedores Art.43.2 Saldo anterior");
      dicce2_aplic.setDescription("Creacion empleo emprendedores Art.43.2 Capital Aplicado");
      dicbii_lim.setDescription("BII 2013 Inversión beneficios Art.37 LIS Inver.inmobiliaria afecta o elementos nuevos inmvolizado material Limite");
      dicbii_saldo.setDescription("2013 Inversión beneficios Art.37 LIS Inver.inmobiliaria afecta o elementos nuevos inmvolizado material Saldo anterior");
      dicbii_aplic.setDescription("2013 Inversión beneficios Art.37 LIS Inver.inmobiliaria afecta o elementos nuevos inmvolizado material Capital Aplicado");
      }
    }
    
  public class TabLiquidaanexoa3 extends TableDef
    {
    // Campos
    public FieldDef la3ejeraplic;
    public FieldDef la3declaran;
    public FieldDef la3muf;
    public FieldDef la3tipocalculo;
    public FieldDef la3invant1iniej;
    public FieldDef la3invant1aplic;
    public FieldDef la3invant1pdte;
    public FieldDef la3invant2iniej;
    public FieldDef la3invant2aplic;
    public FieldDef la3invant2pdte;
    public FieldDef la3invidiniej;
    public FieldDef la3invidaplic;
    public FieldDef la3invidpdte;
    public FieldDef la3invticiniej;
    public FieldDef la3invticaplic;
    public FieldDef la3invticpdte;
    public FieldDef la3inveeiniej;
    public FieldDef la3inveeaplic;
    public FieldDef la3inveepdte;
    public FieldDef la3inva38iniej;
    public FieldDef la3inva38aplic;
    public FieldDef la3inva38pdte;
    public FieldDef la3invpmainiej;
    public FieldDef la3invpmaaplic;
    public FieldDef la3invpmapdte;
    public FieldDef la3invfpiniej;
    public FieldDef la3invfpaplic;
    public FieldDef la3invfppdte;
    public FieldDef la3invceiniej;
    public FieldDef la3invceaplic;
    public FieldDef la3invcepdte;
    public FieldDef la3inva43iniej;
    public FieldDef la3inva43aplic;
    public FieldDef la3inva43pdte;
    public FieldDef la3invafiniej;
    public FieldDef la3invafaplic;
    public FieldDef la3invafpdte;
    public FieldDef la3totalinver;
    public FieldDef la3ricdotant3;
    public FieldDef la3ricmatant3;
    public FieldDef la3ricclaant3;
    public FieldDef la3ricdotant2;
    public FieldDef la3ricmat1ant2;
    public FieldDef la3ricmat2ant2;
    public FieldDef la3ricpdteant2;
    public FieldDef la3ricdotant1;
    public FieldDef la3ricmat1ant1;
    public FieldDef la3ricmat2ant1;
    public FieldDef la3ricpdteant1;
    public FieldDef la3ricdotant;
    public FieldDef la3ricmat1ant;
    public FieldDef la3ricmat2ant;
    public FieldDef la3ricpdteant;
    public FieldDef la3ricdotact;
    public FieldDef la3ricmat1act;
    public FieldDef la3ricmat2act;
    public FieldDef la3ricpdteact;
    public FieldDef la3ricmat1fut;
    public FieldDef la3ricmat2fut;
    public FieldDef la3basededpca;
    public FieldDef la3deducpca;
    public FieldDef la3deducric;
    public FieldDef la3ricmat2ant3;
    public FieldDef la3invceeiniej;
    public FieldDef la3invceeaplic;
    public FieldDef la3invceepdte;
    public FieldDef la3invce2iniej;
    public FieldDef la3invce2aplic;
    public FieldDef la3invce2pdte;
    public FieldDef la3invbiiiniej;
    public FieldDef la3invbiiaplic;
    public FieldDef la3invbiipdte;
    public TabLiquidaanexoa3(String name)
      {
      super(name);
      la3ejeraplic = new FieldDef("la3ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      la3declaran = new FieldDef("la3declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      la3muf = new FieldDef("la3muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      la3tipocalculo = new FieldDef("la3tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      la3invant1iniej = new FieldDef("la3invant1iniej",FieldDef.FLOAT,6,0);
      la3invant1aplic = new FieldDef("la3invant1aplic",FieldDef.FLOAT,6,0);
      la3invant1pdte = new FieldDef("la3invant1pdte",FieldDef.FLOAT,6,0);
      la3invant2iniej = new FieldDef("la3invant2iniej",FieldDef.FLOAT,6,0);
      la3invant2aplic = new FieldDef("la3invant2aplic",FieldDef.FLOAT,6,0);
      la3invant2pdte = new FieldDef("la3invant2pdte",FieldDef.FLOAT,6,0);
      la3invidiniej = new FieldDef("la3invidiniej",FieldDef.FLOAT,6,0);
      la3invidaplic = new FieldDef("la3invidaplic",FieldDef.FLOAT,6,0);
      la3invidpdte = new FieldDef("la3invidpdte",FieldDef.FLOAT,6,0);
      la3invticiniej = new FieldDef("la3invticiniej",FieldDef.FLOAT,6,0);
      la3invticaplic = new FieldDef("la3invticaplic",FieldDef.FLOAT,6,0);
      la3invticpdte = new FieldDef("la3invticpdte",FieldDef.FLOAT,6,0);
      la3inveeiniej = new FieldDef("la3inveeiniej",FieldDef.FLOAT,6,0);
      la3inveeaplic = new FieldDef("la3inveeaplic",FieldDef.FLOAT,6,0);
      la3inveepdte = new FieldDef("la3inveepdte",FieldDef.FLOAT,6,0);
      la3inva38iniej = new FieldDef("la3inva38iniej",FieldDef.FLOAT,6,0);
      la3inva38aplic = new FieldDef("la3inva38aplic",FieldDef.FLOAT,6,0);
      la3inva38pdte = new FieldDef("la3inva38pdte",FieldDef.FLOAT,6,0);
      la3invpmainiej = new FieldDef("la3invpmainiej",FieldDef.FLOAT,6,0);
      la3invpmaaplic = new FieldDef("la3invpmaaplic",FieldDef.FLOAT,6,0);
      la3invpmapdte = new FieldDef("la3invpmapdte",FieldDef.FLOAT,6,0);
      la3invfpiniej = new FieldDef("la3invfpiniej",FieldDef.FLOAT,6,0);
      la3invfpaplic = new FieldDef("la3invfpaplic",FieldDef.FLOAT,6,0);
      la3invfppdte = new FieldDef("la3invfppdte",FieldDef.FLOAT,6,0);
      la3invceiniej = new FieldDef("la3invceiniej",FieldDef.FLOAT,6,0);
      la3invceaplic = new FieldDef("la3invceaplic",FieldDef.FLOAT,6,0);
      la3invcepdte = new FieldDef("la3invcepdte",FieldDef.FLOAT,6,0);
      la3inva43iniej = new FieldDef("la3inva43iniej",FieldDef.FLOAT,6,0);
      la3inva43aplic = new FieldDef("la3inva43aplic",FieldDef.FLOAT,6,0);
      la3inva43pdte = new FieldDef("la3inva43pdte",FieldDef.FLOAT,6,0);
      la3invafiniej = new FieldDef("la3invafiniej",FieldDef.FLOAT,6,0);
      la3invafaplic = new FieldDef("la3invafaplic",FieldDef.FLOAT,6,0);
      la3invafpdte = new FieldDef("la3invafpdte",FieldDef.FLOAT,6,0);
      la3totalinver = new FieldDef("la3totalinver",FieldDef.FLOAT,6,0);
      la3ricdotant3 = new FieldDef("la3ricdotant3",FieldDef.FLOAT,6,0);
      la3ricmatant3 = new FieldDef("la3ricmatant3",FieldDef.FLOAT,6,0);
      la3ricclaant3 = new FieldDef("la3ricclaant3",FieldDef.INTEGER,0);
      la3ricdotant2 = new FieldDef("la3ricdotant2",FieldDef.FLOAT,6,0);
      la3ricmat1ant2 = new FieldDef("la3ricmat1ant2",FieldDef.FLOAT,6,0);
      la3ricmat2ant2 = new FieldDef("la3ricmat2ant2",FieldDef.FLOAT,6,0);
      la3ricpdteant2 = new FieldDef("la3ricpdteant2",FieldDef.FLOAT,6,0);
      la3ricdotant1 = new FieldDef("la3ricdotant1",FieldDef.FLOAT,6,0);
      la3ricmat1ant1 = new FieldDef("la3ricmat1ant1",FieldDef.FLOAT,6,0);
      la3ricmat2ant1 = new FieldDef("la3ricmat2ant1",FieldDef.FLOAT,6,0);
      la3ricpdteant1 = new FieldDef("la3ricpdteant1",FieldDef.FLOAT,6,0);
      la3ricdotant = new FieldDef("la3ricdotant",FieldDef.FLOAT,6,0);
      la3ricmat1ant = new FieldDef("la3ricmat1ant",FieldDef.FLOAT,6,0);
      la3ricmat2ant = new FieldDef("la3ricmat2ant",FieldDef.FLOAT,6,0);
      la3ricpdteant = new FieldDef("la3ricpdteant",FieldDef.FLOAT,6,0);
      la3ricdotact = new FieldDef("la3ricdotact",FieldDef.FLOAT,6,0);
      la3ricmat1act = new FieldDef("la3ricmat1act",FieldDef.FLOAT,6,0);
      la3ricmat2act = new FieldDef("la3ricmat2act",FieldDef.FLOAT,6,0);
      la3ricpdteact = new FieldDef("la3ricpdteact",FieldDef.FLOAT,6,0);
      la3ricmat1fut = new FieldDef("la3ricmat1fut",FieldDef.FLOAT,6,0);
      la3ricmat2fut = new FieldDef("la3ricmat2fut",FieldDef.FLOAT,6,0);
      la3basededpca = new FieldDef("la3basededpca",FieldDef.FLOAT,6,0);
      la3deducpca = new FieldDef("la3deducpca",FieldDef.FLOAT,6,0);
      la3deducric = new FieldDef("la3deducric",FieldDef.FLOAT,6,0);
      la3ricmat2ant3 = new FieldDef("la3ricmat2ant3",FieldDef.FLOAT,6,0);
      la3invceeiniej = new FieldDef("la3invceeiniej",FieldDef.FLOAT,6,0);
      la3invceeaplic = new FieldDef("la3invceeaplic",FieldDef.FLOAT,6,0);
      la3invceepdte = new FieldDef("la3invceepdte",FieldDef.FLOAT,6,0);
      la3invce2iniej = new FieldDef("la3invce2iniej",FieldDef.FLOAT,6,0);
      la3invce2aplic = new FieldDef("la3invce2aplic",FieldDef.FLOAT,6,0);
      la3invce2pdte = new FieldDef("la3invce2pdte",FieldDef.FLOAT,6,0);
      la3invbiiiniej = new FieldDef("la3invbiiiniej",FieldDef.FLOAT,6,0);
      la3invbiiaplic = new FieldDef("la3invbiiaplic",FieldDef.FLOAT,6,0);
      la3invbiipdte = new FieldDef("la3invbiipdte",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        la3ejeraplic,
        la3declaran,
        la3muf,
        la3tipocalculo,
        la3invant1iniej,
        la3invant1aplic,
        la3invant1pdte,
        la3invant2iniej,
        la3invant2aplic,
        la3invant2pdte,
        la3invidiniej,
        la3invidaplic,
        la3invidpdte,
        la3invticiniej,
        la3invticaplic,
        la3invticpdte,
        la3inveeiniej,
        la3inveeaplic,
        la3inveepdte,
        la3inva38iniej,
        la3inva38aplic,
        la3inva38pdte,
        la3invpmainiej,
        la3invpmaaplic,
        la3invpmapdte,
        la3invfpiniej,
        la3invfpaplic,
        la3invfppdte,
        la3invceiniej,
        la3invceaplic,
        la3invcepdte,
        la3inva43iniej,
        la3inva43aplic,
        la3inva43pdte,
        la3invafiniej,
        la3invafaplic,
        la3invafpdte,
        la3totalinver,
        la3ricdotant3,
        la3ricmatant3,
        la3ricclaant3,
        la3ricdotant2,
        la3ricmat1ant2,
        la3ricmat2ant2,
        la3ricpdteant2,
        la3ricdotant1,
        la3ricmat1ant1,
        la3ricmat2ant1,
        la3ricpdteant1,
        la3ricdotant,
        la3ricmat1ant,
        la3ricmat2ant,
        la3ricpdteant,
        la3ricdotact,
        la3ricmat1act,
        la3ricmat2act,
        la3ricpdteact,
        la3ricmat1fut,
        la3ricmat2fut,
        la3basededpca,
        la3deducpca,
        la3deducric,
        la3ricmat2ant3,
        la3invceeiniej,
        la3invceeaplic,
        la3invceepdte,
        la3invce2iniej,
        la3invce2aplic,
        la3invce2pdte,
        la3invbiiiniej,
        la3invbiiaplic,
        la3invbiipdte        
        };
      setColumns(array);
      FieldDef arrayf[] = {la3ejeraplic,la3declaran,la3muf,la3tipocalculo };
      setDescription("Liquidacion renta anexo A3: Informacion adicional ciertas deducciones");
      setPrimaryKeys(arrayf);
      la3ejeraplic.setDescription("Ejercicio aplicacion");
      la3declaran.setDescription("Codigo de declarante");
      la3muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      la3tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      la3invant1iniej.setDescription("Inversion Canarias, deduc.ejer.anter.: activos fijos, saldo inicio");
      la3invant1aplic.setDescription("Inversion Canarias, deduc.ejer.anter.: activos fijos, aplicado");
      la3invant1pdte.setDescription("Inversion Canarias, deduc.ejer.anter.: activos fijos, saldo pendiente");
      la3invant2iniej.setDescription("Inversion Canarias, deduc.ejer.anter.: restantes modalidades, saldo inicio");
      la3invant2aplic.setDescription("Inversion Canarias, deduc.ejer.anter.: restantes modalidades, aplicado");
      la3invant2pdte.setDescription("Inversion Canarias, deduc.ejer.anter.: restantes modalidades, saldo pendiente");
      la3invidiniej.setDescription("Inversion Canarias, deduc.ejer.act.: I+D saldo inicio");
      la3invidaplic.setDescription("Inversion Canarias, deduc.ejer.act.: I+D aplicado");
      la3invidpdte.setDescription("Inversion Canarias, deduc.ejer.act.: I+D saldo pendiente");
      la3invticiniej.setDescription("Inversion Canarias, deduc.ejer.act.: tecnologia informacion saldo inicio");
      la3invticaplic.setDescription("Inversion Canarias, deduc.ejer.act.: tecnologia informacion aplicado");
      la3invticpdte.setDescription("Inversion Canarias, deduc.ejer.act.: tecnologia informacion saldo pendiente");
      la3inveeiniej.setDescription("Inversion Canarias, deduc.ejer.act.: empresas exportadoras saldo inicio");
      la3inveeaplic.setDescription("Inversion Canarias, deduc.ejer.act.: empresas exportadoras aplicado");
      la3inveepdte.setDescription("Inversion Canarias, deduc.ejer.act.: empresas exportadoras saldo pendiente");
      la3inva38iniej.setDescription("Inversion Canarias, deduc.ejer.act.: art.38 saldo inicio");
      la3inva38aplic.setDescription("Inversion Canarias, deduc.ejer.act.: art.38 aplicado");
      la3inva38pdte.setDescription("Inversion Canarias, deduc.ejer.act.: art.38 saldo pendiente");
      la3invpmainiej.setDescription("Inversion Canarias, deduc.ejer.act.: proteccion medio ambiente saldo inicio");
      la3invpmaaplic.setDescription("Inversion Canarias, deduc.ejer.act.: proteccion medio ambiente aplicado");
      la3invpmapdte.setDescription("Inversion Canarias, deduc.ejer.act.: proteccion medio ambiente saldo pendiente");
      la3invfpiniej.setDescription("Inversion Canarias, deduc.ejer.act.: formacion profesional saldo inicio");
      la3invfpaplic.setDescription("Inversion Canarias, deduc.ejer.act.: formacion profesional aplicado");
      la3invfppdte.setDescription("Inversion Canarias, deduc.ejer.act.: formacion profesional saldo pendiente");
      la3invceiniej.setDescription("Inversion Canarias, deduc.ejer.act.: creacion empleo saldo inicio");
      la3invceaplic.setDescription("Inversion Canarias, deduc.ejer.act.: creacion empleo aplicado");
      la3invcepdte.setDescription("Inversion Canarias, deduc.ejer.act.: creacion empleo saldo pendiente");
      la3inva43iniej.setDescription("Inversion Canarias, deduc.ejer.act.: art.43 saldo inicio");
      la3inva43aplic.setDescription("Inversion Canarias, deduc.ejer.act.: art.43 aplicado");
      la3inva43pdte.setDescription("Inversion Canarias, deduc.ejer.act.: art.43 saldo pendiente");
      la3invafiniej.setDescription("Inversion Canarias, deduc.ejer.act.: activos fijos saldo inicio");
      la3invafaplic.setDescription("Inversion Canarias, deduc.ejer.act.: activos fijos aplicado");
      la3invafpdte.setDescription("Inversion Canarias, deduc.ejer.act.: activos fijos saldo pendiente");
      la3totalinver.setDescription("Total deducciones por incentivos");
      la3ricdotant3.setDescription("Materializacion RIC 2007: importe dotacion");
      la3ricmatant3.setDescription("Materializacion RIC 2007: importe materializacion");
      la3ricclaant3.setDescription("Materializacion RIC 2007: clave");
      la3ricdotant2.setDescription("Materializacion RIC 2008: importe dotacion");
      la3ricmat1ant2.setDescription("Materializacion RIC 2008: importe materializacion A,B y D");
      la3ricmat2ant2.setDescription("Materializacion RIC 2008: importe materializacion C y D");
      la3ricpdteant2.setDescription("Materializacion RIC 2008: pendiente materializar");
      la3ricdotant1.setDescription("Materializacion RIC 2009: importe dotacion");
      la3ricmat1ant1.setDescription("Materializacion RIC 2009: importe materializacion A,B y D");
      la3ricmat2ant1.setDescription("Materializacion RIC 2009: importe materializacion C y D");
      la3ricpdteant1.setDescription("Materializacion RIC 2009: pendiente materializar");
      la3ricdotant.setDescription("Materializacion RIC 2010: importe dotacion");
      la3ricmat1ant.setDescription("Materializacion RIC 2010: importe materializacion A,B y D");
      la3ricmat2ant.setDescription("Materializacion RIC 2010: importe materializacion C y D");
      la3ricpdteant.setDescription("Materializacion RIC 2010: pendiente materializar");
      la3ricdotact.setDescription("Materializacion RIC 2011: importe dotacion");
      la3ricmat1act.setDescription("Materializacion RIC 2011: importe materializacion A,B y D");
      la3ricmat2act.setDescription("Materializacion RIC 2011: importe materializacion C y D");
      la3ricpdteact.setDescription("Materializacion RIC 2011: pendiente materializar");
      la3ricmat1fut.setDescription("Materializacion RIC futuras: importe materializacion A,B y D");
      la3ricmat2fut.setDescription("Materializacion RIC futuras: importe materializacion C y D");
      la3basededpca.setDescription("Base deduccion bienes producidos en Canarias");
      la3deducpca.setDescription("Deduccion bienes producidos en Canarias");
      la3deducric.setDescription("Deduccion por dotacion al RIC");
      la3ricmat2ant3.setDescription("Materializacion RIC 2007: importe materializacion C y D");
      la3invceeiniej.setDescription("Inver.Canarias ejer.act. CE1 Creacion empleo emprendedores art.43.1 Saldo inicio");
      la3invceeaplic.setDescription("Inver.Canarias ejer.act.     Creacion empleo emprendedores art.43.1 Aplicado");
      la3invceepdte.setDescription("Inver.Canarias ejer.act.     Creacion empleo emprendedores art.43.1 Pendiente");
      la3invce2iniej.setDescription("Inver.Canarias ejer.act. CE2 Creacion empleo emprendedores art.43.2 Saldo inicio");
      la3invce2aplic.setDescription("Inver.Canarias ejer.act.     Creacion empleo emprendedores art.43.2 Aplicado");
      la3invce2pdte.setDescription("Inver.Canarias ejer.act.     Creacion empleo emprendedores art.43.2 Pendiente");
      la3invbiiiniej.setDescription("Inver.Canarias ejer.act. BII Inver.beneficios art.37 LIS Saldo inicio");
      la3invbiiaplic.setDescription("Inver.Canarias ejer.act.     Inver beneficios art.37 LIS Aplicado");
      la3invbiipdte.setDescription("Inver.Canarias ejer.act.     Inver beneficios art.37 LIS Pendiente");
      }
    }
    
  public class TabOtrdatospatrim extends TableDef
    {
    // Campos
    public FieldDef otrejeraplic;
    public FieldDef otrdeclaran;
    public FieldDef otrapartado;
    public FieldDef otrcontador;
    public FieldDef otrdeclaracion;
    public FieldDef otrmuf;
    public FieldDef otrdescripcion;
    public FieldDef otrimporte;
    public FieldDef otrexencion;
    public FieldDef otrimporteant;
    public FieldDef otrreferencia;
    public FieldDef otrsituacion;
    public FieldDef otrepigrafe;
    public FieldDef otrdescripcion2;
    public FieldDef otrclaveinmob;
    public FieldDef otrtipoinmob;
    public FieldDef otrclavereal;
    public FieldDef otrvalorbien;
    public FieldDef otranualidad;
    public FieldDef otrnroctacte;
    public FieldDef otrurbanarus;
    public FieldDef otrclavevital;
    public FieldDef otrextranjero;
    public FieldDef otrbaseextran;
    public FieldDef otrcoopropiedad;
    public FieldDef otraplicporcen;
    public TabOtrdatospatrim(String name)
      {
      super(name);
      otrejeraplic = new FieldDef("otrejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      otrdeclaran = new FieldDef("otrdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      otrapartado = new FieldDef("otrapartado",FieldDef.CHAR,2,FieldDef.NOTNULL);
      otrcontador = new FieldDef("otrcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      otrdeclaracion = new FieldDef("otrdeclaracion",FieldDef.INTEGER,0);
      otrmuf = new FieldDef("otrmuf",FieldDef.CHAR,6);
      otrdescripcion = new FieldDef("otrdescripcion",FieldDef.CHAR,50);
      otrimporte = new FieldDef("otrimporte",FieldDef.FLOAT,6,0);
      otrexencion = new FieldDef("otrexencion",FieldDef.FLOAT,6,0);
      otrimporteant = new FieldDef("otrimporteant",FieldDef.FLOAT,6,0);
      otrreferencia = new FieldDef("otrreferencia",FieldDef.CHAR,20);
      otrsituacion = new FieldDef("otrsituacion",FieldDef.INTEGER,0);
      otrepigrafe = new FieldDef("otrepigrafe",FieldDef.CHAR,7);
      otrdescripcion2 = new FieldDef("otrdescripcion2",FieldDef.CHAR,50);
      otrclaveinmob = new FieldDef("otrclaveinmob",FieldDef.CHAR,1);
      otrtipoinmob = new FieldDef("otrtipoinmob",FieldDef.CHAR,1);
      otrclavereal = new FieldDef("otrclavereal",FieldDef.CHAR,1);
      otrvalorbien = new FieldDef("otrvalorbien",FieldDef.FLOAT,6,0);
      otranualidad = new FieldDef("otranualidad",FieldDef.FLOAT,6,0);
      otrnroctacte = new FieldDef("otrnroctacte",FieldDef.CHAR,20);
      otrurbanarus = new FieldDef("otrurbanarus",FieldDef.CHAR,1);
      otrclavevital = new FieldDef("otrclavevital",FieldDef.CHAR,1);
      otrextranjero = new FieldDef("otrextranjero",FieldDef.CHAR,1);
      otrbaseextran = new FieldDef("otrbaseextran",FieldDef.FLOAT,6,0);
      otrcoopropiedad = new FieldDef("otrcoopropiedad",FieldDef.FLOAT,6,0);
      otraplicporcen = new FieldDef("otraplicporcen",FieldDef.CHAR,1);
      FieldDef array[] = {
        otrejeraplic,
        otrdeclaran,
        otrapartado,
        otrcontador,
        otrdeclaracion,
        otrmuf,
        otrdescripcion,
        otrimporte,
        otrexencion,
        otrimporteant,
        otrreferencia,
        otrsituacion,
        otrepigrafe,
        otrdescripcion2,
        otrclaveinmob,
        otrtipoinmob,
        otrclavereal,
        otrvalorbien,
        otranualidad,
        otrnroctacte,
        otrurbanarus,
        otrclavevital,
        otrextranjero,
        otrbaseextran,
        otrcoopropiedad,
        otraplicporcen        
        };
      setColumns(array);
      FieldDef arrayf[] = {otrejeraplic,otrdeclaran,otrapartado,otrcontador };
      setDescription("Otros datos de patrimonio");
      setPrimaryKeys(arrayf);
      otrejeraplic.setDescription("Ejercicio aplicacion");
      otrdeclaran.setDescription("CODIGO DE DECLARANTE");
      otrapartado.setDescription("Apartado de patrimonio");
      otrcontador.setDescription("Contador");
      otrdeclaracion.setDescription("Codigo Declaracion");
      otrmuf.setDescription("M.U.F.");
      otrdescripcion.setDescription("Descripcion");
      otrimporte.setDescription("Importe Valor");
      otrexencion.setDescription("Porcentaje Exencion");
      otrimporteant.setDescription("Importe Ejercicio Anterior");
      otrreferencia.setDescription("Referencia catastral   (A1-A2-B-C2-D)");
      otrsituacion.setDescription("Situacion del inmueble (A1-A2-B-C2-D)");
      otrepigrafe.setDescription("Clave C1-C2-D: Epigrafe I.A.E.");
      otrdescripcion2.setDescription("Clave C1-C2-D: Domicilio");
      otrclaveinmob.setDescription("Clave A1-A2-B: Clave Inmob.: Pleno dominio-Nuda-Multiprop");
      otrtipoinmob.setDescription("Clave A2: Tipo  Inmob.: Vda-Local-Otros");
      otrclavereal.setDescription("Clave M:  Clave: Usuf-Otros Derec-Derec.aprovecham");
      otrvalorbien.setDescription("Clave M:  Valor bien");
      otranualidad.setDescription("Clave J:  Importe anualidad");
      otrnroctacte.setDescription("Clave E:  Nro cta.");
      otrurbanarus.setDescription("Clave C2-D: Urbana/Rustica");
      otrclavevital.setDescription("Clave J:  Clave: Renta temporal o vitalicia");
      otrextranjero.setDescription("Bien o derecho en extranjero 720");
      otrbaseextran.setDescription("Ded.Extranjero: Valor patrimonial neto del bien");
      otrcoopropiedad.setDescription("Porcentaje Copropiedad");
      otraplicporcen.setDescription("Aplicar % propiedad a importes");
      }
    }
    
  public class TabLiquidaapartn extends TableDef
    {
    // Campos
    public FieldDef linejeraplic;
    public FieldDef lindeclaran;
    public FieldDef linmuf;
    public FieldDef lintipocalculo;
    public FieldDef linbliqgralest;
    public FieldDef linbliqgralaut;
    public FieldDef linminigralest;
    public FieldDef linminigralaut;
    public FieldDef lincuotgralest;
    public FieldDef lincuotgralaut;
    public FieldDef lintipogralest;
    public FieldDef lintipogralaut;
    public FieldDef linbliqahorest;
    public FieldDef linbliqahoraut;
    public FieldDef lincuotahorest;
    public FieldDef lincuotahoraut;
    public FieldDef linretentrabaj;
    public FieldDef linretencapmob;
    public FieldDef linreteninmueb;
    public FieldDef linretenactivi;
    public FieldDef linretenatribu;
    public FieldDef linretenutes;
    public FieldDef linretenderimag;
    public FieldDef linretengananci;
    public FieldDef linpagosactivid;
    public FieldDef lincuotanoresid;
    public FieldDef linretendirecti;
    public FieldDef linbliqgralestc;
    public FieldDef linminigralestc;
    public FieldDef lincuotgralestc;
    public FieldDef linbliqahorestc;
    public FieldDef lintipogralestc;
    public FieldDef lintmarginest;
    public FieldDef lintmarginaut;
    public TabLiquidaapartn(String name)
      {
      super(name);
      linejeraplic = new FieldDef("linejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lindeclaran = new FieldDef("lindeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      linmuf = new FieldDef("linmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lintipocalculo = new FieldDef("lintipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      linbliqgralest = new FieldDef("linbliqgralest",FieldDef.FLOAT,6,0);
      linbliqgralaut = new FieldDef("linbliqgralaut",FieldDef.FLOAT,6,0);
      linminigralest = new FieldDef("linminigralest",FieldDef.FLOAT,6,0);
      linminigralaut = new FieldDef("linminigralaut",FieldDef.FLOAT,6,0);
      lincuotgralest = new FieldDef("lincuotgralest",FieldDef.FLOAT,6,0);
      lincuotgralaut = new FieldDef("lincuotgralaut",FieldDef.FLOAT,6,0);
      lintipogralest = new FieldDef("lintipogralest",FieldDef.FLOAT,6,0);
      lintipogralaut = new FieldDef("lintipogralaut",FieldDef.FLOAT,6,0);
      linbliqahorest = new FieldDef("linbliqahorest",FieldDef.FLOAT,6,0);
      linbliqahoraut = new FieldDef("linbliqahoraut",FieldDef.FLOAT,6,0);
      lincuotahorest = new FieldDef("lincuotahorest",FieldDef.FLOAT,6,0);
      lincuotahoraut = new FieldDef("lincuotahoraut",FieldDef.FLOAT,6,0);
      linretentrabaj = new FieldDef("linretentrabaj",FieldDef.FLOAT,6,0);
      linretencapmob = new FieldDef("linretencapmob",FieldDef.FLOAT,6,0);
      linreteninmueb = new FieldDef("linreteninmueb",FieldDef.FLOAT,6,0);
      linretenactivi = new FieldDef("linretenactivi",FieldDef.FLOAT,6,0);
      linretenatribu = new FieldDef("linretenatribu",FieldDef.FLOAT,6,0);
      linretenutes = new FieldDef("linretenutes",FieldDef.FLOAT,6,0);
      linretenderimag = new FieldDef("linretenderimag",FieldDef.FLOAT,6,0);
      linretengananci = new FieldDef("linretengananci",FieldDef.FLOAT,6,0);
      linpagosactivid = new FieldDef("linpagosactivid",FieldDef.FLOAT,6,0);
      lincuotanoresid = new FieldDef("lincuotanoresid",FieldDef.FLOAT,6,0);
      linretendirecti = new FieldDef("linretendirecti",FieldDef.FLOAT,6,0);
      linbliqgralestc = new FieldDef("linbliqgralestc",FieldDef.FLOAT,6,0);
      linminigralestc = new FieldDef("linminigralestc",FieldDef.FLOAT,6,0);
      lincuotgralestc = new FieldDef("lincuotgralestc",FieldDef.FLOAT,6,0);
      linbliqahorestc = new FieldDef("linbliqahorestc",FieldDef.FLOAT,6,0);
      lintipogralestc = new FieldDef("lintipogralestc",FieldDef.FLOAT,6,0);
      lintmarginest = new FieldDef("lintmarginest",FieldDef.FLOAT,6,0);
      lintmarginaut = new FieldDef("lintmarginaut",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        linejeraplic,
        lindeclaran,
        linmuf,
        lintipocalculo,
        linbliqgralest,
        linbliqgralaut,
        linminigralest,
        linminigralaut,
        lincuotgralest,
        lincuotgralaut,
        lintipogralest,
        lintipogralaut,
        linbliqahorest,
        linbliqahoraut,
        lincuotahorest,
        lincuotahoraut,
        linretentrabaj,
        linretencapmob,
        linreteninmueb,
        linretenactivi,
        linretenatribu,
        linretenutes,
        linretenderimag,
        linretengananci,
        linpagosactivid,
        lincuotanoresid,
        linretendirecti,
        linbliqgralestc,
        linminigralestc,
        lincuotgralestc,
        linbliqahorestc,
        lintipogralestc,
        lintmarginest,
        lintmarginaut        
        };
      setColumns(array);
      FieldDef arrayf[] = {linejeraplic,lindeclaran,linmuf,lintipocalculo };
      setDescription("Liquidacion renta apartado N: Determinacion gravamen estatal y autonomico");
      setPrimaryKeys(arrayf);
      linejeraplic.setDescription("Ejercicio aplicacion");
      lindeclaran.setDescription("Codigo de declarante");
      linmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lintipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      linbliqgralest.setDescription("Aplicacion escala estatal a base liquidable general");
      linbliqgralaut.setDescription("Aplicacion escala autonomica a base liquidable general");
      linminigralest.setDescription("Aplicacion escala estatal a minimos base general");
      linminigralaut.setDescription("Aplicacion escala autonomica a minimos base general");
      lincuotgralest.setDescription("Cuota base liquidable general, parte estatal");
      lincuotgralaut.setDescription("Cuota base liquidable general, parte autonomica");
      lintipogralest.setDescription("Tipo medio base general, parte estatal");
      lintipogralaut.setDescription("Tipo medio base general, parte autonomica");
      linbliqahorest.setDescription("Base liquidable ahorro sometida a gravamen, parte estatal");
      linbliqahoraut.setDescription("Base liquidable ahorro sometida a gravamen, parte autonomica");
      lincuotahorest.setDescription("Cuota base liquidable ahorro, parte estatal");
      lincuotahoraut.setDescription("Cuota base liquidable ahorro, parte autonomica");
      linretentrabaj.setDescription("Retenciones trabajo personal");
      linretencapmob.setDescription("Retenciones capital mobiliario");
      linreteninmueb.setDescription("Retenciones inmuebles arrendados");
      linretenactivi.setDescription("Retenciones actividades economicas");
      linretenatribu.setDescription("Retenciones regimen atribucion rentas");
      linretenutes.setDescription("Retenciones UTES");
      linretenderimag.setDescription("Retenciones Derechos de imagen");
      linretengananci.setDescription("Retenciones ganancias patrimoniales");
      linpagosactivid.setDescription("Pagos fraccionados actividades");
      lincuotanoresid.setDescription("Cuotas no residentes");
      linretendirecti.setDescription("Retenciones Directiva 2003/48/CE del Consejo");
      linbliqgralestc.setDescription("Aplicacion escala estatal complementaria a base liquidable general");
      linminigralestc.setDescription("Aplicacion escala estatal complementaria a minimos base general");
      lincuotgralestc.setDescription("Cuota base liquidable general complementaria, parte estatal");
      linbliqahorestc.setDescription("Aplicacion escala ahorro estatal complementaria a base liq ahorro");
      lintipogralestc.setDescription("Tipo medio complementaria base general, parte estatal");
      lintmarginest.setDescription("Tipo marginal base General estatal");
      lintmarginaut.setDescription("Tipo marginal base General autonomica");
      }
    }
    
  public class TabAccesodatos extends TableDef
    {
    // Campos
    public FieldDef acciden;
    public FieldDef accejeraplic;
    public FieldDef acctabla;
    public FieldDef accdeclaran;
    public FieldDef acccodregistro;
    public FieldDef accfecha;
    public FieldDef acchora;
    public FieldDef accusuario;
    public FieldDef accrevisado;
    public FieldDef accobserva;
    public TabAccesodatos(String name)
      {
      super(name);
      acciden = new FieldDef("acciden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      accejeraplic = new FieldDef("accejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acctabla = new FieldDef("acctabla",FieldDef.CHAR,15,FieldDef.NOTNULL);
      accdeclaran = new FieldDef("accdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      acccodregistro = new FieldDef("acccodregistro",FieldDef.INTEGER,0);
      accfecha = new FieldDef("accfecha",FieldDef.DATE);
      acchora = new FieldDef("acchora",FieldDef.CHAR,10);
      accusuario = new FieldDef("accusuario",FieldDef.CHAR,20,FieldDef.NOTNULL);
      accrevisado = new FieldDef("accrevisado",FieldDef.CHAR,1);
      accobserva = new FieldDef("accobserva",FieldDef.CHAR,4000);
      FieldDef array[] = {
        acciden,
        accejeraplic,
        acctabla,
        accdeclaran,
        acccodregistro,
        accfecha,
        acchora,
        accusuario,
        accrevisado,
        accobserva        
        };
      setColumns(array);
      FieldDef arrayf[] = {acciden };
      setDescription("Control de acceso a los distintos registros");
      setPrimaryKeys(arrayf);
      acciden.setAutoIncrementable(true);
      accejeraplic.setDescription("Ejercicio aplicacion");
      acctabla.setDescription("Tabla");
      accdeclaran.setDescription("Codigo declarante");
      acccodregistro.setDescription("Codigo registro");
      accfecha.setDescription("Fecha modificacion");
      acchora.setDescription("Hora modificacion");
      accusuario.setDescription("Usuario");
      accrevisado.setDescription("Se ha revisado o no");
      accobserva.setDescription("Observaciones");
      }
    }
    
  public class TabCompenpendiente extends TableDef
    {
    // Campos
    public FieldDef cpdejeraplic;
    public FieldDef cpddeclaran;
    public FieldDef cpdtipo;
    public FieldDef cpdejercicio;
    public FieldDef cpdcontador;
    public FieldDef cpdmuf;
    public FieldDef cpddescripcion;
    public FieldDef cpdsaldoinicio;
    public FieldDef cpdaplicado;
    public FieldDef cpddeclaaplic;
    public FieldDef cpdcomporigen;
    public FieldDef cpddeclaaplic1;
    public FieldDef cpdaplicado1;
    public FieldDef cpddeclaaplic2;
    public FieldDef cpdaplicado2;
    public FieldDef cpddeclaaplic3;
    public FieldDef cpdaplicado3;
    public FieldDef cpddeclaaplic4;
    public FieldDef cpdaplicado4;
    public FieldDef cpddeclaaplic5;
    public FieldDef cpdaplicado5;
    public FieldDef cpdregaportacio;
    public FieldDef cpdultimoejer;
    public TabCompenpendiente(String name)
      {
      super(name);
      cpdejeraplic = new FieldDef("cpdejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cpddeclaran = new FieldDef("cpddeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cpdtipo = new FieldDef("cpdtipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      cpdejercicio = new FieldDef("cpdejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cpdcontador = new FieldDef("cpdcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cpdmuf = new FieldDef("cpdmuf",FieldDef.CHAR,1);
      cpddescripcion = new FieldDef("cpddescripcion",FieldDef.CHAR,30);
      cpdsaldoinicio = new FieldDef("cpdsaldoinicio",FieldDef.FLOAT,6,0);
      cpdaplicado = new FieldDef("cpdaplicado",FieldDef.FLOAT,6,0);
      cpddeclaaplic = new FieldDef("cpddeclaaplic",FieldDef.CHAR,1);
      cpdcomporigen = new FieldDef("cpdcomporigen",FieldDef.FLOAT,6,0);
      cpddeclaaplic1 = new FieldDef("cpddeclaaplic1",FieldDef.CHAR,1);
      cpdaplicado1 = new FieldDef("cpdaplicado1",FieldDef.FLOAT,6,0);
      cpddeclaaplic2 = new FieldDef("cpddeclaaplic2",FieldDef.CHAR,1);
      cpdaplicado2 = new FieldDef("cpdaplicado2",FieldDef.FLOAT,6,0);
      cpddeclaaplic3 = new FieldDef("cpddeclaaplic3",FieldDef.CHAR,1);
      cpdaplicado3 = new FieldDef("cpdaplicado3",FieldDef.FLOAT,6,0);
      cpddeclaaplic4 = new FieldDef("cpddeclaaplic4",FieldDef.CHAR,1);
      cpdaplicado4 = new FieldDef("cpdaplicado4",FieldDef.FLOAT,6,0);
      cpddeclaaplic5 = new FieldDef("cpddeclaaplic5",FieldDef.CHAR,1);
      cpdaplicado5 = new FieldDef("cpdaplicado5",FieldDef.FLOAT,6,0);
      cpdregaportacio = new FieldDef("cpdregaportacio",FieldDef.INTEGER,0);
      cpdultimoejer = new FieldDef("cpdultimoejer",FieldDef.INTEGER,0);
      FieldDef array[] = {
        cpdejeraplic,
        cpddeclaran,
        cpdtipo,
        cpdejercicio,
        cpdcontador,
        cpdmuf,
        cpddescripcion,
        cpdsaldoinicio,
        cpdaplicado,
        cpddeclaaplic,
        cpdcomporigen,
        cpddeclaaplic1,
        cpdaplicado1,
        cpddeclaaplic2,
        cpdaplicado2,
        cpddeclaaplic3,
        cpdaplicado3,
        cpddeclaaplic4,
        cpdaplicado4,
        cpddeclaaplic5,
        cpdaplicado5,
        cpdregaportacio,
        cpdultimoejer        
        };
      setColumns(array);
      FieldDef arrayf[] = {cpdejeraplic,cpddeclaran,cpdtipo,cpdejercicio,cpdcontador };
      setDescription("Compensaciones pendientes");
      setPrimaryKeys(arrayf);
      cpdejeraplic.setDescription("Ejercicio aplicacion");
      cpddeclaran.setDescription("CODIGO DE DECLARANTE");
      cpdtipo.setDescription("Tipo compensacion");
      cpdejercicio.setDescription("Año origen compensacion");
      cpdcontador.setDescription("Contador");
      cpdmuf.setDescription("M.U.F.");
      cpddescripcion.setDescription("Descripcion");
      cpdsaldoinicio.setDescription("Saldo inicio ejercicio actual");
      cpdaplicado.setDescription("Aplicado en el ejercicio actual");
      cpddeclaaplic.setDescription("Declaración aplicada ejercicio actual");
      cpdcomporigen.setDescription("Saldo origen");
      cpddeclaaplic1.setDescription("Declaración aplicada ejercicio anterior");
      cpdaplicado1.setDescription("Aplicado en ejercicio anterior");
      cpddeclaaplic2.setDescription("Declaración aplicada ejercicio anterior -1");
      cpdaplicado2.setDescription("Aplicado en ejercicio anterior -1");
      cpddeclaaplic3.setDescription("Declaración aplicada ejercicio anterior -2");
      cpdaplicado3.setDescription("Aplicado en ejercicio anterior -2");
      cpddeclaaplic4.setDescription("Declaración aplicada ejercicio anterior -3");
      cpdaplicado4.setDescription("Aplicado en ejercicio anterior -3");
      cpddeclaaplic5.setDescription("Declaración aplicada ejercicio anterior -4");
      cpdaplicado5.setDescription("Aplicado en ejercicio anterior -4");
      cpdregaportacio.setDescription("Regimen aport. plan pensiones: 1 General, 2 Minusvalido");
      cpdultimoejer.setDescription("Ultimo año de aplicación");
      }
    }
    
  public class TabLiquidaapartk extends TableDef
    {
    // Campos
    public FieldDef likejeraplic;
    public FieldDef likdeclaran;
    public FieldDef likmuf;
    public FieldDef liktipocalculo;
    public FieldDef liknreduccion;
    public FieldDef likfpetitular;
    public FieldDef likfpependiente;
    public FieldDef likfpmtitular;
    public FieldDef likfpmpendiente;
    public FieldDef likapdtitular;
    public FieldDef likapdpendiente;
    public FieldDef likfpdtitular;
    public FieldDef likfpdpendiente;
    public FieldDef likfpstitular;
    public FieldDef likfpspendiente;
    public TabLiquidaapartk(String name)
      {
      super(name);
      likejeraplic = new FieldDef("likejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      likdeclaran = new FieldDef("likdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      likmuf = new FieldDef("likmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      liktipocalculo = new FieldDef("liktipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      liknreduccion = new FieldDef("liknreduccion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      likfpetitular = new FieldDef("likfpetitular",FieldDef.CHAR,1);
      likfpependiente = new FieldDef("likfpependiente",FieldDef.FLOAT,6,0);
      likfpmtitular = new FieldDef("likfpmtitular",FieldDef.CHAR,1);
      likfpmpendiente = new FieldDef("likfpmpendiente",FieldDef.FLOAT,6,0);
      likapdtitular = new FieldDef("likapdtitular",FieldDef.CHAR,1);
      likapdpendiente = new FieldDef("likapdpendiente",FieldDef.FLOAT,6,0);
      likfpdtitular = new FieldDef("likfpdtitular",FieldDef.CHAR,1);
      likfpdpendiente = new FieldDef("likfpdpendiente",FieldDef.FLOAT,6,0);
      likfpstitular = new FieldDef("likfpstitular",FieldDef.CHAR,1);
      likfpspendiente = new FieldDef("likfpspendiente",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        likejeraplic,
        likdeclaran,
        likmuf,
        liktipocalculo,
        liknreduccion,
        likfpetitular,
        likfpependiente,
        likfpmtitular,
        likfpmpendiente,
        likapdtitular,
        likapdpendiente,
        likfpdtitular,
        likfpdpendiente,
        likfpstitular,
        likfpspendiente        
        };
      setColumns(array);
      FieldDef arrayf[] = {likejeraplic,likdeclaran,likmuf,liktipocalculo,liknreduccion };
      setDescription("Liquidacion renta apartado K: Reducciones base imponible no aplicadas");
      setPrimaryKeys(arrayf);
      likejeraplic.setDescription("Ejercicio aplicacion");
      likdeclaran.setDescription("Codigo de declarante");
      likmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      liktipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      liknreduccion.setDescription("Numero de registro");
      likfpetitular.setDescription("Titular");
      likfpependiente.setDescription("Importes planes pensiones pendiente aplicar");
      likfpmtitular.setDescription("Titular");
      likfpmpendiente.setDescription("Importes planes pensiones minusvalidos pendiente aplicar");
      likapdtitular.setDescription("Titular");
      likapdpendiente.setDescription("Importes aportacion patrimonio pendiente aplicar");
      likfpdtitular.setDescription("Titular");
      likfpdpendiente.setDescription("Importes planes pensiones deportistas pendiente aplicar");
      likfpstitular.setDescription("Titular");
      likfpspendiente.setDescription("Importes FPS contrib.empr.seguros despenencia pdte aplicar");
      }
    }
    
  public class TabCalculo extends TableDef
    {
    // Campos
    public FieldDef calejeraplic;
    public FieldDef calcalculo001;
    public FieldDef calcalculo002;
    public FieldDef calcalculo003;
    public FieldDef calcalculo004;
    public FieldDef calcalculo005;
    public FieldDef calcalculo006;
    public FieldDef calcalculo007;
    public FieldDef calcalculo008;
    public FieldDef calcalculo009;
    public FieldDef calcalculo010;
    public FieldDef calcalculo011;
    public FieldDef calcalculo012;
    public FieldDef calcalculo013;
    public FieldDef calcalculo014;
    public FieldDef calcalculo015;
    public FieldDef calcalculo016;
    public FieldDef calcalculo017;
    public FieldDef calcalculo018;
    public FieldDef calcalculo019;
    public FieldDef calcalculo020;
    public FieldDef calcalculo021;
    public FieldDef calcalculo022;
    public FieldDef calcalculo023;
    public FieldDef calcalculo024;
    public FieldDef calcalculo025;
    public FieldDef calcalculo026;
    public FieldDef calcalculo027;
    public FieldDef calcalculo028;
    public FieldDef calcalculo029;
    public FieldDef calcalculo030;
    public FieldDef calcalculo031;
    public FieldDef calcalculo032;
    public FieldDef calcalculo033;
    public FieldDef calcalculo034;
    public FieldDef calcalculo035;
    public FieldDef calcalculo036;
    public FieldDef calcalculo037;
    public FieldDef calcalculo038;
    public FieldDef calcalculo039;
    public FieldDef calcalculo040;
    public FieldDef calcalculo041;
    public FieldDef calcalculo042;
    public FieldDef calcalculo043;
    public FieldDef calcalculo044;
    public FieldDef calcalculo045;
    public FieldDef calcalculo046;
    public FieldDef calcalculo047;
    public FieldDef calcalculo048;
    public FieldDef calcalculo049;
    public FieldDef calcalculo050;
    public FieldDef calcalculo051;
    public FieldDef calcalculo052;
    public FieldDef calcalculo053;
    public FieldDef calcalculo054;
    public FieldDef calcalculo055;
    public FieldDef calcalculo056;
    public FieldDef calcalculo057;
    public FieldDef calcalculo058;
    public FieldDef calcalculo059;
    public FieldDef calcalculo060;
    public FieldDef calcalculo061;
    public FieldDef calcalculo062;
    public FieldDef calcalculo063;
    public FieldDef calcalculo064;
    public FieldDef calcalculo065;
    public FieldDef calcalculo066;
    public FieldDef calcalculo067;
    public FieldDef calcalculo068;
    public FieldDef calcalculo069;
    public FieldDef calcalculo070;
    public FieldDef calcalculo071;
    public FieldDef calcalculo072;
    public FieldDef calcalculo073;
    public FieldDef calcalculo074;
    public FieldDef calcalculo075;
    public FieldDef calcalculo076;
    public FieldDef calcalculo077;
    public FieldDef calcalculo078;
    public FieldDef calcalculo079;
    public FieldDef calcalculo080;
    public FieldDef calcalculo081;
    public FieldDef calcalculo082;
    public FieldDef calcalculo083;
    public FieldDef calcalculo084;
    public FieldDef calcalculo085;
    public FieldDef calcalculo086;
    public FieldDef calcalculo087;
    public FieldDef calcalculo088;
    public FieldDef calcalculo089;
    public FieldDef calcalculo090;
    public FieldDef calcalculo091;
    public FieldDef calcalculo092;
    public FieldDef calcalculo093;
    public FieldDef calcalculo094;
    public FieldDef calcalculo095;
    public FieldDef calcalculo096;
    public FieldDef calcalculo097;
    public FieldDef calcalculo098;
    public FieldDef calcalculo099;
    public FieldDef calcalculo100;
    public FieldDef calcalculo101;
    public FieldDef calcalculo102;
    public FieldDef calcalculo103;
    public FieldDef calcalculo104;
    public FieldDef calcalculo105;
    public FieldDef calcalculo106;
    public FieldDef calcalculo107;
    public FieldDef calcalculo108;
    public FieldDef calcalculo109;
    public FieldDef calcalculo110;
    public FieldDef calcalculo111;
    public FieldDef calcalculo112;
    public FieldDef calcalculo113;
    public FieldDef calcalculo114;
    public FieldDef calcalculo115;
    public FieldDef calcalculo116;
    public FieldDef calcalculo117;
    public FieldDef calcalculo118;
    public FieldDef calcalculo119;
    public FieldDef calcalculo120;
    public FieldDef calcalculo121;
    public FieldDef calcalculo122;
    public FieldDef calcalculo123;
    public FieldDef calcalculo124;
    public FieldDef calcalculo125;
    public FieldDef calcalculo126;
    public FieldDef calcalculo127;
    public FieldDef calcalculo128;
    public FieldDef calcalculo129;
    public FieldDef calcalculo130;
    public FieldDef calcalculo131;
    public FieldDef calcalculo132;
    public FieldDef calcalculo133;
    public FieldDef calcalculo134;
    public FieldDef calcalculo135;
    public FieldDef calcalculo136;
    public FieldDef calcalculo137;
    public FieldDef calcalculo138;
    public FieldDef calcalculo139;
    public FieldDef calcalculo140;
    public FieldDef calcalculo141;
    public FieldDef calcalculo142;
    public FieldDef calcalculo143;
    public FieldDef calcalculo144;
    public FieldDef calcalculo145;
    public FieldDef calcalculo146;
    public FieldDef calcalculo147;
    public FieldDef calcalculo148;
    public FieldDef calcalculo149;
    public FieldDef calcalculo150;
    public FieldDef calcalculo151;
    public FieldDef calcalculo152;
    public FieldDef calcalculo153;
    public FieldDef calcalculo154;
    public FieldDef calcalculo155;
    public FieldDef calcalculo156;
    public FieldDef calcalculo157;
    public FieldDef calcalculo158;
    public FieldDef calcalculo159;
    public FieldDef calcalculo160;
    public FieldDef calcalculo161;
    public FieldDef calcalculo162;
    public FieldDef calcalculo163;
    public FieldDef calcalculo164;
    public FieldDef calcalculo165;
    public FieldDef calcalculo166;
    public FieldDef calcalculo167;
    public FieldDef calcalculo168;
    public FieldDef calcalculo169;
    public FieldDef calcalculo170;
    public FieldDef calcalculo171;
    public FieldDef calcalculo172;
    public FieldDef calcalculo173;
    public FieldDef calcalculo174;
    public FieldDef calcalculo175;
    public FieldDef calcalculo176;
    public FieldDef calcalculo177;
    public FieldDef calcalculo178;
    public FieldDef calcalculo179;
    public FieldDef calcalculo180;
    public FieldDef calcalculo181;
    public FieldDef calcalculo182;
    public FieldDef calcalculo183;
    public FieldDef calcalculo184;
    public FieldDef calcalculo185;
    public FieldDef calcalculo186;
    public FieldDef calcalculo187;
    public FieldDef calcalculo188;
    public FieldDef calcalculo189;
    public FieldDef calcalculo190;
    public FieldDef calcalculo191;
    public FieldDef calcalculo192;
    public FieldDef calcalculo193;
    public FieldDef calcalculo194;
    public FieldDef calcalculo195;
    public FieldDef calcalculo196;
    public FieldDef calcalculo197;
    public FieldDef calcalculo198;
    public FieldDef calcalculo199;
    public FieldDef calcalculo200;
    public FieldDef calcalculo201;
    public FieldDef calcalculo202;
    public FieldDef calcalculo203;
    public FieldDef calcalculo204;
    public FieldDef calcalculo205;
    public FieldDef calcalculo206;
    public FieldDef calcalculo207;
    public FieldDef calcalculo208;
    public FieldDef calcalculo209;
    public FieldDef calcalculo210;
    public FieldDef calcalculo211;
    public FieldDef calcalculo212;
    public FieldDef calcalculo213;
    public FieldDef calcalculo214;
    public FieldDef calcalculo215;
    public FieldDef calcalculo216;
    public FieldDef calcalculo217;
    public FieldDef calcalculo218;
    public FieldDef calcalculo219;
    public FieldDef calcalculo220;
    public FieldDef calcalculo221;
    public FieldDef calcalculo222;
    public FieldDef calcalculo223;
    public FieldDef calcalculo224;
    public FieldDef calcalculo225;
    public FieldDef calcalculo226;
    public FieldDef calcalculo227;
    public FieldDef calcalculo228;
    public FieldDef calcalculo229;
    public FieldDef calcalculo230;
    public FieldDef calcalculo231;
    public FieldDef calcalculo232;
    public FieldDef calcalculo233;
    public FieldDef calcalculo234;
    public FieldDef calcalculo235;
    public FieldDef calcalculo236;
    public FieldDef calcalculo237;
    public FieldDef calcalculo238;
    public FieldDef calcalculo239;
    public FieldDef calcalculo240;
    public FieldDef calcalculo241;
    public FieldDef calcalculo242;
    public FieldDef calcalculo243;
    public FieldDef calcalculo244;
    public FieldDef calcalculo245;
    public TabCalculo(String name)
      {
      super(name);
      calejeraplic = new FieldDef("calejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      calcalculo001 = new FieldDef("calcalculo001",FieldDef.FLOAT,6,0);
      calcalculo002 = new FieldDef("calcalculo002",FieldDef.FLOAT,6,0);
      calcalculo003 = new FieldDef("calcalculo003",FieldDef.FLOAT,6,0);
      calcalculo004 = new FieldDef("calcalculo004",FieldDef.FLOAT,6,0);
      calcalculo005 = new FieldDef("calcalculo005",FieldDef.FLOAT,6,0);
      calcalculo006 = new FieldDef("calcalculo006",FieldDef.FLOAT,6,0);
      calcalculo007 = new FieldDef("calcalculo007",FieldDef.FLOAT,6,0);
      calcalculo008 = new FieldDef("calcalculo008",FieldDef.FLOAT,6,0);
      calcalculo009 = new FieldDef("calcalculo009",FieldDef.FLOAT,6,0);
      calcalculo010 = new FieldDef("calcalculo010",FieldDef.FLOAT,6,0);
      calcalculo011 = new FieldDef("calcalculo011",FieldDef.FLOAT,6,0);
      calcalculo012 = new FieldDef("calcalculo012",FieldDef.FLOAT,6,0);
      calcalculo013 = new FieldDef("calcalculo013",FieldDef.FLOAT,6,0);
      calcalculo014 = new FieldDef("calcalculo014",FieldDef.FLOAT,6,0);
      calcalculo015 = new FieldDef("calcalculo015",FieldDef.FLOAT,6,0);
      calcalculo016 = new FieldDef("calcalculo016",FieldDef.FLOAT,6,0);
      calcalculo017 = new FieldDef("calcalculo017",FieldDef.FLOAT,6,0);
      calcalculo018 = new FieldDef("calcalculo018",FieldDef.FLOAT,6,0);
      calcalculo019 = new FieldDef("calcalculo019",FieldDef.FLOAT,6,0);
      calcalculo020 = new FieldDef("calcalculo020",FieldDef.FLOAT,6,0);
      calcalculo021 = new FieldDef("calcalculo021",FieldDef.FLOAT,6,0);
      calcalculo022 = new FieldDef("calcalculo022",FieldDef.FLOAT,6,0);
      calcalculo023 = new FieldDef("calcalculo023",FieldDef.FLOAT,6,0);
      calcalculo024 = new FieldDef("calcalculo024",FieldDef.FLOAT,6,0);
      calcalculo025 = new FieldDef("calcalculo025",FieldDef.FLOAT,6,0);
      calcalculo026 = new FieldDef("calcalculo026",FieldDef.FLOAT,6,0);
      calcalculo027 = new FieldDef("calcalculo027",FieldDef.FLOAT,6,0);
      calcalculo028 = new FieldDef("calcalculo028",FieldDef.FLOAT,6,0);
      calcalculo029 = new FieldDef("calcalculo029",FieldDef.FLOAT,6,0);
      calcalculo030 = new FieldDef("calcalculo030",FieldDef.FLOAT,6,0);
      calcalculo031 = new FieldDef("calcalculo031",FieldDef.FLOAT,6,0);
      calcalculo032 = new FieldDef("calcalculo032",FieldDef.FLOAT,6,0);
      calcalculo033 = new FieldDef("calcalculo033",FieldDef.FLOAT,6,0);
      calcalculo034 = new FieldDef("calcalculo034",FieldDef.FLOAT,6,0);
      calcalculo035 = new FieldDef("calcalculo035",FieldDef.FLOAT,6,0);
      calcalculo036 = new FieldDef("calcalculo036",FieldDef.FLOAT,6,0);
      calcalculo037 = new FieldDef("calcalculo037",FieldDef.FLOAT,6,0);
      calcalculo038 = new FieldDef("calcalculo038",FieldDef.FLOAT,6,0);
      calcalculo039 = new FieldDef("calcalculo039",FieldDef.FLOAT,6,0);
      calcalculo040 = new FieldDef("calcalculo040",FieldDef.FLOAT,6,0);
      calcalculo041 = new FieldDef("calcalculo041",FieldDef.FLOAT,6,0);
      calcalculo042 = new FieldDef("calcalculo042",FieldDef.FLOAT,6,0);
      calcalculo043 = new FieldDef("calcalculo043",FieldDef.FLOAT,6,0);
      calcalculo044 = new FieldDef("calcalculo044",FieldDef.FLOAT,6,0);
      calcalculo045 = new FieldDef("calcalculo045",FieldDef.FLOAT,6,0);
      calcalculo046 = new FieldDef("calcalculo046",FieldDef.FLOAT,6,0);
      calcalculo047 = new FieldDef("calcalculo047",FieldDef.FLOAT,6,0);
      calcalculo048 = new FieldDef("calcalculo048",FieldDef.FLOAT,6,0);
      calcalculo049 = new FieldDef("calcalculo049",FieldDef.FLOAT,6,0);
      calcalculo050 = new FieldDef("calcalculo050",FieldDef.FLOAT,6,0);
      calcalculo051 = new FieldDef("calcalculo051",FieldDef.FLOAT,6,0);
      calcalculo052 = new FieldDef("calcalculo052",FieldDef.FLOAT,6,0);
      calcalculo053 = new FieldDef("calcalculo053",FieldDef.FLOAT,6,0);
      calcalculo054 = new FieldDef("calcalculo054",FieldDef.FLOAT,6,0);
      calcalculo055 = new FieldDef("calcalculo055",FieldDef.FLOAT,6,0);
      calcalculo056 = new FieldDef("calcalculo056",FieldDef.FLOAT,6,0);
      calcalculo057 = new FieldDef("calcalculo057",FieldDef.FLOAT,6,0);
      calcalculo058 = new FieldDef("calcalculo058",FieldDef.FLOAT,6,0);
      calcalculo059 = new FieldDef("calcalculo059",FieldDef.FLOAT,6,0);
      calcalculo060 = new FieldDef("calcalculo060",FieldDef.FLOAT,6,0);
      calcalculo061 = new FieldDef("calcalculo061",FieldDef.FLOAT,6,0);
      calcalculo062 = new FieldDef("calcalculo062",FieldDef.FLOAT,6,0);
      calcalculo063 = new FieldDef("calcalculo063",FieldDef.FLOAT,6,0);
      calcalculo064 = new FieldDef("calcalculo064",FieldDef.FLOAT,6,0);
      calcalculo065 = new FieldDef("calcalculo065",FieldDef.FLOAT,6,0);
      calcalculo066 = new FieldDef("calcalculo066",FieldDef.FLOAT,6,0);
      calcalculo067 = new FieldDef("calcalculo067",FieldDef.FLOAT,6,0);
      calcalculo068 = new FieldDef("calcalculo068",FieldDef.FLOAT,6,0);
      calcalculo069 = new FieldDef("calcalculo069",FieldDef.FLOAT,6,0);
      calcalculo070 = new FieldDef("calcalculo070",FieldDef.FLOAT,6,0);
      calcalculo071 = new FieldDef("calcalculo071",FieldDef.FLOAT,6,0);
      calcalculo072 = new FieldDef("calcalculo072",FieldDef.FLOAT,6,0);
      calcalculo073 = new FieldDef("calcalculo073",FieldDef.FLOAT,6,0);
      calcalculo074 = new FieldDef("calcalculo074",FieldDef.FLOAT,6,0);
      calcalculo075 = new FieldDef("calcalculo075",FieldDef.FLOAT,6,0);
      calcalculo076 = new FieldDef("calcalculo076",FieldDef.FLOAT,6,0);
      calcalculo077 = new FieldDef("calcalculo077",FieldDef.FLOAT,6,0);
      calcalculo078 = new FieldDef("calcalculo078",FieldDef.FLOAT,6,0);
      calcalculo079 = new FieldDef("calcalculo079",FieldDef.FLOAT,6,0);
      calcalculo080 = new FieldDef("calcalculo080",FieldDef.FLOAT,6,0);
      calcalculo081 = new FieldDef("calcalculo081",FieldDef.FLOAT,6,0);
      calcalculo082 = new FieldDef("calcalculo082",FieldDef.FLOAT,6,0);
      calcalculo083 = new FieldDef("calcalculo083",FieldDef.FLOAT,6,0);
      calcalculo084 = new FieldDef("calcalculo084",FieldDef.FLOAT,6,0);
      calcalculo085 = new FieldDef("calcalculo085",FieldDef.FLOAT,6,0);
      calcalculo086 = new FieldDef("calcalculo086",FieldDef.FLOAT,6,0);
      calcalculo087 = new FieldDef("calcalculo087",FieldDef.FLOAT,6,0);
      calcalculo088 = new FieldDef("calcalculo088",FieldDef.FLOAT,6,0);
      calcalculo089 = new FieldDef("calcalculo089",FieldDef.FLOAT,6,0);
      calcalculo090 = new FieldDef("calcalculo090",FieldDef.FLOAT,6,0);
      calcalculo091 = new FieldDef("calcalculo091",FieldDef.FLOAT,6,0);
      calcalculo092 = new FieldDef("calcalculo092",FieldDef.FLOAT,6,0);
      calcalculo093 = new FieldDef("calcalculo093",FieldDef.FLOAT,6,0);
      calcalculo094 = new FieldDef("calcalculo094",FieldDef.FLOAT,6,0);
      calcalculo095 = new FieldDef("calcalculo095",FieldDef.FLOAT,6,0);
      calcalculo096 = new FieldDef("calcalculo096",FieldDef.FLOAT,6,0);
      calcalculo097 = new FieldDef("calcalculo097",FieldDef.FLOAT,6,0);
      calcalculo098 = new FieldDef("calcalculo098",FieldDef.FLOAT,6,0);
      calcalculo099 = new FieldDef("calcalculo099",FieldDef.FLOAT,6,0);
      calcalculo100 = new FieldDef("calcalculo100",FieldDef.FLOAT,6,0);
      calcalculo101 = new FieldDef("calcalculo101",FieldDef.FLOAT,6,0);
      calcalculo102 = new FieldDef("calcalculo102",FieldDef.FLOAT,6,0);
      calcalculo103 = new FieldDef("calcalculo103",FieldDef.FLOAT,6,0);
      calcalculo104 = new FieldDef("calcalculo104",FieldDef.FLOAT,6,0);
      calcalculo105 = new FieldDef("calcalculo105",FieldDef.FLOAT,6,0);
      calcalculo106 = new FieldDef("calcalculo106",FieldDef.FLOAT,6,0);
      calcalculo107 = new FieldDef("calcalculo107",FieldDef.FLOAT,6,0);
      calcalculo108 = new FieldDef("calcalculo108",FieldDef.FLOAT,6,0);
      calcalculo109 = new FieldDef("calcalculo109",FieldDef.FLOAT,6,0);
      calcalculo110 = new FieldDef("calcalculo110",FieldDef.FLOAT,6,0);
      calcalculo111 = new FieldDef("calcalculo111",FieldDef.FLOAT,6,0);
      calcalculo112 = new FieldDef("calcalculo112",FieldDef.FLOAT,6,0);
      calcalculo113 = new FieldDef("calcalculo113",FieldDef.FLOAT,6,0);
      calcalculo114 = new FieldDef("calcalculo114",FieldDef.FLOAT,6,0);
      calcalculo115 = new FieldDef("calcalculo115",FieldDef.FLOAT,6,0);
      calcalculo116 = new FieldDef("calcalculo116",FieldDef.FLOAT,6,0);
      calcalculo117 = new FieldDef("calcalculo117",FieldDef.FLOAT,6,0);
      calcalculo118 = new FieldDef("calcalculo118",FieldDef.FLOAT,6,0);
      calcalculo119 = new FieldDef("calcalculo119",FieldDef.FLOAT,6,0);
      calcalculo120 = new FieldDef("calcalculo120",FieldDef.FLOAT,6,0);
      calcalculo121 = new FieldDef("calcalculo121",FieldDef.FLOAT,6,0);
      calcalculo122 = new FieldDef("calcalculo122",FieldDef.FLOAT,6,0);
      calcalculo123 = new FieldDef("calcalculo123",FieldDef.FLOAT,6,0);
      calcalculo124 = new FieldDef("calcalculo124",FieldDef.FLOAT,6,0);
      calcalculo125 = new FieldDef("calcalculo125",FieldDef.FLOAT,6,0);
      calcalculo126 = new FieldDef("calcalculo126",FieldDef.FLOAT,6,0);
      calcalculo127 = new FieldDef("calcalculo127",FieldDef.FLOAT,6,0);
      calcalculo128 = new FieldDef("calcalculo128",FieldDef.FLOAT,6,0);
      calcalculo129 = new FieldDef("calcalculo129",FieldDef.FLOAT,6,0);
      calcalculo130 = new FieldDef("calcalculo130",FieldDef.FLOAT,6,0);
      calcalculo131 = new FieldDef("calcalculo131",FieldDef.FLOAT,6,0);
      calcalculo132 = new FieldDef("calcalculo132",FieldDef.FLOAT,6,0);
      calcalculo133 = new FieldDef("calcalculo133",FieldDef.FLOAT,6,0);
      calcalculo134 = new FieldDef("calcalculo134",FieldDef.FLOAT,6,0);
      calcalculo135 = new FieldDef("calcalculo135",FieldDef.FLOAT,6,0);
      calcalculo136 = new FieldDef("calcalculo136",FieldDef.FLOAT,6,0);
      calcalculo137 = new FieldDef("calcalculo137",FieldDef.FLOAT,6,0);
      calcalculo138 = new FieldDef("calcalculo138",FieldDef.FLOAT,6,0);
      calcalculo139 = new FieldDef("calcalculo139",FieldDef.FLOAT,6,0);
      calcalculo140 = new FieldDef("calcalculo140",FieldDef.FLOAT,6,0);
      calcalculo141 = new FieldDef("calcalculo141",FieldDef.FLOAT,6,0);
      calcalculo142 = new FieldDef("calcalculo142",FieldDef.FLOAT,6,0);
      calcalculo143 = new FieldDef("calcalculo143",FieldDef.FLOAT,6,0);
      calcalculo144 = new FieldDef("calcalculo144",FieldDef.FLOAT,6,0);
      calcalculo145 = new FieldDef("calcalculo145",FieldDef.FLOAT,6,0);
      calcalculo146 = new FieldDef("calcalculo146",FieldDef.FLOAT,6,0);
      calcalculo147 = new FieldDef("calcalculo147",FieldDef.FLOAT,6,0);
      calcalculo148 = new FieldDef("calcalculo148",FieldDef.FLOAT,6,0);
      calcalculo149 = new FieldDef("calcalculo149",FieldDef.FLOAT,6,0);
      calcalculo150 = new FieldDef("calcalculo150",FieldDef.FLOAT,6,0);
      calcalculo151 = new FieldDef("calcalculo151",FieldDef.FLOAT,6,0);
      calcalculo152 = new FieldDef("calcalculo152",FieldDef.FLOAT,6,0);
      calcalculo153 = new FieldDef("calcalculo153",FieldDef.FLOAT,6,0);
      calcalculo154 = new FieldDef("calcalculo154",FieldDef.FLOAT,6,0);
      calcalculo155 = new FieldDef("calcalculo155",FieldDef.FLOAT,6,0);
      calcalculo156 = new FieldDef("calcalculo156",FieldDef.FLOAT,6,0);
      calcalculo157 = new FieldDef("calcalculo157",FieldDef.FLOAT,6,0);
      calcalculo158 = new FieldDef("calcalculo158",FieldDef.FLOAT,6,0);
      calcalculo159 = new FieldDef("calcalculo159",FieldDef.FLOAT,6,0);
      calcalculo160 = new FieldDef("calcalculo160",FieldDef.FLOAT,6,0);
      calcalculo161 = new FieldDef("calcalculo161",FieldDef.FLOAT,6,0);
      calcalculo162 = new FieldDef("calcalculo162",FieldDef.FLOAT,6,0);
      calcalculo163 = new FieldDef("calcalculo163",FieldDef.FLOAT,6,0);
      calcalculo164 = new FieldDef("calcalculo164",FieldDef.FLOAT,6,0);
      calcalculo165 = new FieldDef("calcalculo165",FieldDef.FLOAT,6,0);
      calcalculo166 = new FieldDef("calcalculo166",FieldDef.FLOAT,6,0);
      calcalculo167 = new FieldDef("calcalculo167",FieldDef.FLOAT,6,0);
      calcalculo168 = new FieldDef("calcalculo168",FieldDef.FLOAT,6,0);
      calcalculo169 = new FieldDef("calcalculo169",FieldDef.DATE);
      calcalculo170 = new FieldDef("calcalculo170",FieldDef.FLOAT,6,0);
      calcalculo171 = new FieldDef("calcalculo171",FieldDef.FLOAT,6,0);
      calcalculo172 = new FieldDef("calcalculo172",FieldDef.FLOAT,6,0);
      calcalculo173 = new FieldDef("calcalculo173",FieldDef.FLOAT,6,0);
      calcalculo174 = new FieldDef("calcalculo174",FieldDef.FLOAT,6,0);
      calcalculo175 = new FieldDef("calcalculo175",FieldDef.FLOAT,6,0);
      calcalculo176 = new FieldDef("calcalculo176",FieldDef.FLOAT,6,0);
      calcalculo177 = new FieldDef("calcalculo177",FieldDef.FLOAT,6,0);
      calcalculo178 = new FieldDef("calcalculo178",FieldDef.FLOAT,6,0);
      calcalculo179 = new FieldDef("calcalculo179",FieldDef.FLOAT,6,0);
      calcalculo180 = new FieldDef("calcalculo180",FieldDef.FLOAT,6,0);
      calcalculo181 = new FieldDef("calcalculo181",FieldDef.FLOAT,6,0);
      calcalculo182 = new FieldDef("calcalculo182",FieldDef.FLOAT,6,0);
      calcalculo183 = new FieldDef("calcalculo183",FieldDef.FLOAT,6,0);
      calcalculo184 = new FieldDef("calcalculo184",FieldDef.FLOAT,6,0);
      calcalculo185 = new FieldDef("calcalculo185",FieldDef.FLOAT,6,0);
      calcalculo186 = new FieldDef("calcalculo186",FieldDef.FLOAT,6,0);
      calcalculo187 = new FieldDef("calcalculo187",FieldDef.FLOAT,6,0);
      calcalculo188 = new FieldDef("calcalculo188",FieldDef.FLOAT,6,0);
      calcalculo189 = new FieldDef("calcalculo189",FieldDef.FLOAT,6,0);
      calcalculo190 = new FieldDef("calcalculo190",FieldDef.FLOAT,6,0);
      calcalculo191 = new FieldDef("calcalculo191",FieldDef.FLOAT,6,0);
      calcalculo192 = new FieldDef("calcalculo192",FieldDef.FLOAT,6,0);
      calcalculo193 = new FieldDef("calcalculo193",FieldDef.FLOAT,6,0);
      calcalculo194 = new FieldDef("calcalculo194",FieldDef.FLOAT,6,0);
      calcalculo195 = new FieldDef("calcalculo195",FieldDef.FLOAT,6,0);
      calcalculo196 = new FieldDef("calcalculo196",FieldDef.FLOAT,6,0);
      calcalculo197 = new FieldDef("calcalculo197",FieldDef.FLOAT,6,0);
      calcalculo198 = new FieldDef("calcalculo198",FieldDef.FLOAT,6,0);
      calcalculo199 = new FieldDef("calcalculo199",FieldDef.FLOAT,6,0);
      calcalculo200 = new FieldDef("calcalculo200",FieldDef.FLOAT,6,0);
      calcalculo201 = new FieldDef("calcalculo201",FieldDef.FLOAT,6,0);
      calcalculo202 = new FieldDef("calcalculo202",FieldDef.FLOAT,6,0);
      calcalculo203 = new FieldDef("calcalculo203",FieldDef.FLOAT,6,0);
      calcalculo204 = new FieldDef("calcalculo204",FieldDef.FLOAT,6,0);
      calcalculo205 = new FieldDef("calcalculo205",FieldDef.FLOAT,6,0);
      calcalculo206 = new FieldDef("calcalculo206",FieldDef.FLOAT,6,0);
      calcalculo207 = new FieldDef("calcalculo207",FieldDef.FLOAT,6,0);
      calcalculo208 = new FieldDef("calcalculo208",FieldDef.FLOAT,6,0);
      calcalculo209 = new FieldDef("calcalculo209",FieldDef.FLOAT,6,0);
      calcalculo210 = new FieldDef("calcalculo210",FieldDef.FLOAT,6,0);
      calcalculo211 = new FieldDef("calcalculo211",FieldDef.FLOAT,6,0);
      calcalculo212 = new FieldDef("calcalculo212",FieldDef.FLOAT,6,0);
      calcalculo213 = new FieldDef("calcalculo213",FieldDef.FLOAT,6,0);
      calcalculo214 = new FieldDef("calcalculo214",FieldDef.FLOAT,6,0);
      calcalculo215 = new FieldDef("calcalculo215",FieldDef.FLOAT,6,0);
      calcalculo216 = new FieldDef("calcalculo216",FieldDef.FLOAT,6,0);
      calcalculo217 = new FieldDef("calcalculo217",FieldDef.FLOAT,6,0);
      calcalculo218 = new FieldDef("calcalculo218",FieldDef.FLOAT,6,0);
      calcalculo219 = new FieldDef("calcalculo219",FieldDef.FLOAT,6,0);
      calcalculo220 = new FieldDef("calcalculo220",FieldDef.FLOAT,6,0);
      calcalculo221 = new FieldDef("calcalculo221",FieldDef.FLOAT,6,0);
      calcalculo222 = new FieldDef("calcalculo222",FieldDef.FLOAT,6,0);
      calcalculo223 = new FieldDef("calcalculo223",FieldDef.FLOAT,6,0);
      calcalculo224 = new FieldDef("calcalculo224",FieldDef.FLOAT,6,0);
      calcalculo225 = new FieldDef("calcalculo225",FieldDef.FLOAT,6,0);
      calcalculo226 = new FieldDef("calcalculo226",FieldDef.FLOAT,6,0);
      calcalculo227 = new FieldDef("calcalculo227",FieldDef.FLOAT,6,0);
      calcalculo228 = new FieldDef("calcalculo228",FieldDef.FLOAT,6,0);
      calcalculo229 = new FieldDef("calcalculo229",FieldDef.FLOAT,6,0);
      calcalculo230 = new FieldDef("calcalculo230",FieldDef.FLOAT,6,0);
      calcalculo231 = new FieldDef("calcalculo231",FieldDef.FLOAT,6,0);
      calcalculo232 = new FieldDef("calcalculo232",FieldDef.FLOAT,6,0);
      calcalculo233 = new FieldDef("calcalculo233",FieldDef.FLOAT,6,0);
      calcalculo234 = new FieldDef("calcalculo234",FieldDef.FLOAT,6,0);
      calcalculo235 = new FieldDef("calcalculo235",FieldDef.FLOAT,6,0);
      calcalculo236 = new FieldDef("calcalculo236",FieldDef.FLOAT,6,0);
      calcalculo237 = new FieldDef("calcalculo237",FieldDef.FLOAT,6,0);
      calcalculo238 = new FieldDef("calcalculo238",FieldDef.FLOAT,6,0);
      calcalculo239 = new FieldDef("calcalculo239",FieldDef.FLOAT,6,0);
      calcalculo240 = new FieldDef("calcalculo240",FieldDef.FLOAT,6,0);
      calcalculo241 = new FieldDef("calcalculo241",FieldDef.FLOAT,6,0);
      calcalculo242 = new FieldDef("calcalculo242",FieldDef.FLOAT,6,0);
      calcalculo243 = new FieldDef("calcalculo243",FieldDef.FLOAT,6,0);
      calcalculo244 = new FieldDef("calcalculo244",FieldDef.FLOAT,6,0);
      calcalculo245 = new FieldDef("calcalculo245",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        calejeraplic,
        calcalculo001,
        calcalculo002,
        calcalculo003,
        calcalculo004,
        calcalculo005,
        calcalculo006,
        calcalculo007,
        calcalculo008,
        calcalculo009,
        calcalculo010,
        calcalculo011,
        calcalculo012,
        calcalculo013,
        calcalculo014,
        calcalculo015,
        calcalculo016,
        calcalculo017,
        calcalculo018,
        calcalculo019,
        calcalculo020,
        calcalculo021,
        calcalculo022,
        calcalculo023,
        calcalculo024,
        calcalculo025,
        calcalculo026,
        calcalculo027,
        calcalculo028,
        calcalculo029,
        calcalculo030,
        calcalculo031,
        calcalculo032,
        calcalculo033,
        calcalculo034,
        calcalculo035,
        calcalculo036,
        calcalculo037,
        calcalculo038,
        calcalculo039,
        calcalculo040,
        calcalculo041,
        calcalculo042,
        calcalculo043,
        calcalculo044,
        calcalculo045,
        calcalculo046,
        calcalculo047,
        calcalculo048,
        calcalculo049,
        calcalculo050,
        calcalculo051,
        calcalculo052,
        calcalculo053,
        calcalculo054,
        calcalculo055,
        calcalculo056,
        calcalculo057,
        calcalculo058,
        calcalculo059,
        calcalculo060,
        calcalculo061,
        calcalculo062,
        calcalculo063,
        calcalculo064,
        calcalculo065,
        calcalculo066,
        calcalculo067,
        calcalculo068,
        calcalculo069,
        calcalculo070,
        calcalculo071,
        calcalculo072,
        calcalculo073,
        calcalculo074,
        calcalculo075,
        calcalculo076,
        calcalculo077,
        calcalculo078,
        calcalculo079,
        calcalculo080,
        calcalculo081,
        calcalculo082,
        calcalculo083,
        calcalculo084,
        calcalculo085,
        calcalculo086,
        calcalculo087,
        calcalculo088,
        calcalculo089,
        calcalculo090,
        calcalculo091,
        calcalculo092,
        calcalculo093,
        calcalculo094,
        calcalculo095,
        calcalculo096,
        calcalculo097,
        calcalculo098,
        calcalculo099,
        calcalculo100,
        calcalculo101,
        calcalculo102,
        calcalculo103,
        calcalculo104,
        calcalculo105,
        calcalculo106,
        calcalculo107,
        calcalculo108,
        calcalculo109,
        calcalculo110,
        calcalculo111,
        calcalculo112,
        calcalculo113,
        calcalculo114,
        calcalculo115,
        calcalculo116,
        calcalculo117,
        calcalculo118,
        calcalculo119,
        calcalculo120,
        calcalculo121,
        calcalculo122,
        calcalculo123,
        calcalculo124,
        calcalculo125,
        calcalculo126,
        calcalculo127,
        calcalculo128,
        calcalculo129,
        calcalculo130,
        calcalculo131,
        calcalculo132,
        calcalculo133,
        calcalculo134,
        calcalculo135,
        calcalculo136,
        calcalculo137,
        calcalculo138,
        calcalculo139,
        calcalculo140,
        calcalculo141,
        calcalculo142,
        calcalculo143,
        calcalculo144,
        calcalculo145,
        calcalculo146,
        calcalculo147,
        calcalculo148,
        calcalculo149,
        calcalculo150,
        calcalculo151,
        calcalculo152,
        calcalculo153,
        calcalculo154,
        calcalculo155,
        calcalculo156,
        calcalculo157,
        calcalculo158,
        calcalculo159,
        calcalculo160,
        calcalculo161,
        calcalculo162,
        calcalculo163,
        calcalculo164,
        calcalculo165,
        calcalculo166,
        calcalculo167,
        calcalculo168,
        calcalculo169,
        calcalculo170,
        calcalculo171,
        calcalculo172,
        calcalculo173,
        calcalculo174,
        calcalculo175,
        calcalculo176,
        calcalculo177,
        calcalculo178,
        calcalculo179,
        calcalculo180,
        calcalculo181,
        calcalculo182,
        calcalculo183,
        calcalculo184,
        calcalculo185,
        calcalculo186,
        calcalculo187,
        calcalculo188,
        calcalculo189,
        calcalculo190,
        calcalculo191,
        calcalculo192,
        calcalculo193,
        calcalculo194,
        calcalculo195,
        calcalculo196,
        calcalculo197,
        calcalculo198,
        calcalculo199,
        calcalculo200,
        calcalculo201,
        calcalculo202,
        calcalculo203,
        calcalculo204,
        calcalculo205,
        calcalculo206,
        calcalculo207,
        calcalculo208,
        calcalculo209,
        calcalculo210,
        calcalculo211,
        calcalculo212,
        calcalculo213,
        calcalculo214,
        calcalculo215,
        calcalculo216,
        calcalculo217,
        calcalculo218,
        calcalculo219,
        calcalculo220,
        calcalculo221,
        calcalculo222,
        calcalculo223,
        calcalculo224,
        calcalculo225,
        calcalculo226,
        calcalculo227,
        calcalculo228,
        calcalculo229,
        calcalculo230,
        calcalculo231,
        calcalculo232,
        calcalculo233,
        calcalculo234,
        calcalculo235,
        calcalculo236,
        calcalculo237,
        calcalculo238,
        calcalculo239,
        calcalculo240,
        calcalculo241,
        calcalculo242,
        calcalculo243,
        calcalculo244,
        calcalculo245        
        };
      setColumns(array);
      FieldDef arrayf[] = {calejeraplic };
      setDescription("Parametros calculo");
      setPrimaryKeys(arrayf);
      calejeraplic.setDescription("Ejercicio fiscal aplicacion");
      calcalculo001.setDescription("%Vivienda valor catastral act.");
      calcalculo002.setDescription("%Vivienda valor catast.no act.");
      calcalculo003.setDescription("Valoracion vehiculos");
      calcalculo004.setDescription("Reduccion rdtos. irregulares");
      calcalculo005.setDescription("Reduccion rto.trabajo SS,PP,MU");
      calcalculo006.setDescription("Red.rdto.inmuebles vda jovenes");
      calcalculo007.setDescription("% Incremento Valor catastral");
      calcalculo008.setDescription("Limite cuotas profesionales");
      calcalculo009.setDescription("Rdto.neto trabajo igual o inf.");
      calcalculo010.setDescription("Importe reduccion");
      calcalculo011.setDescription("Rdto.neto trabajo superior a");
      calcalculo012.setDescription("Importe reduccion");
      calcalculo013.setDescription("Reduccion rdto.entre limites");
      calcalculo014.setDescription("Otros rdtos. trabajo superior");
      calcalculo015.setDescription("Reduccion otros rdto.trabajo");
      calcalculo016.setDescription("Prolongacion actividad laboral");
      calcalculo017.setDescription("Movilidad geografica");
      calcalculo018.setDescription("%Ded.inversion guarderia(Cana)");
      calcalculo019.setDescription("% Retencion rdto. inmobiliario");
      calcalculo020.setDescription("Capitalizacion Inm. Arrendados");
      calcalculo021.setDescription("% Amortiz. inmuebles");
      calcalculo022.setDescription("%Retencion valores mobiliarios");
      calcalculo023.setDescription("Coef.Val.Patrim.ACNB No Audit.");
      calcalculo024.setDescription("Deduccion creacion empleo minusvalia >=33% i <65%");
      calcalculo025.setDescription("% Ded. Bienes interes cultural");
      calcalculo026.setDescription("% Ded. Edicion de libros");
      calcalculo027.setDescription("% Ded. Produc.cinematograficas");
      calcalculo028.setDescription("% Ded. Gastos formac.profe. 1");
      calcalculo029.setDescription("% Ded. Gastos formac.profe. 2");
      calcalculo030.setDescription("% Ded. Empresas exportadoras");
      calcalculo031.setDescription("% Ded. Gastos I+D 1");
      calcalculo032.setDescription("% Ded. Gastos I+D 2");
      calcalculo033.setDescription("% Ded. Proteccion medio ambien");
      calcalculo034.setDescription("% Compesac.vda.habitual auton.");
      calcalculo035.setDescription("% Ded. Activos fijos(Canarias)");
      calcalculo036.setDescription("% Ded. Bienes int.cult.(Canar)");
      calcalculo037.setDescription("% Ded.Edicion libros(Canarias)");
      calcalculo038.setDescription("% Ded. Produc.cinemat.(Canar)");
      calcalculo039.setDescription("%Ded.Gastos form.prof.1(Canar)");
      calcalculo040.setDescription("%Ded.Gastos form.prof.2(Canar)");
      calcalculo041.setDescription("% Ded. Empresas export.(Canar)");
      calcalculo042.setDescription("% Ded.Gastos I+D 1 (Canarias)");
      calcalculo043.setDescription("% Ded.Gastos I+D 2 (Canarias)");
      calcalculo044.setDescription("% Ded. Prot.medio ambien.(Can)");
      calcalculo045.setDescription("% Limite deduc.actividades");
      calcalculo046.setDescription("% Limite ded.AF en Canarias");
      calcalculo047.setDescription("% Limite ded.activ. Canarias");
      calcalculo048.setDescription("% Gastos dificil justif.EDS");
      calcalculo049.setDescription("Limite gasto contrato seguros");
      calcalculo050.setDescription("%Comp 1er.a¤o vda.habitual aut");
      calcalculo051.setDescription("Indice corrector de exceso");
      calcalculo052.setDescription("Limite rdto. especies vivienda");
      calcalculo053.setDescription("Coef.reduc.Ganancias Patr.ACB");
      calcalculo054.setDescription("Coef.reductor Ganancias Fincas");
      calcalculo055.setDescription("Coef.reduc.gral.Ganancias");
      calcalculo056.setDescription("Limite conjunto no obligacion");
      calcalculo057.setDescription("Limite perdidas no obligacion");
      calcalculo058.setDescription("%Ded.Vda.Habitual Estatal");
      calcalculo059.setDescription("%Ded.Vda.Habitual Autonomica");
      calcalculo060.setDescription("Minim.incrementado anualidades");
      calcalculo061.setDescription("Obligacion Patrim. Tot. Bienes");
      calcalculo062.setDescription("Obligacion Patrim. Superior a");
      calcalculo063.setDescription("Lim.Int.Perdidas en Base Gral.");
      calcalculo064.setDescription("Minimo contribuyente");
      calcalculo065.setDescription("M.famil.-Hijo fallecido");
      calcalculo066.setDescription("Reduccion cuidado hijos");
      calcalculo067.setDescription("Minimo Pers.-65");
      calcalculo068.setDescription("Reduc. Declar. Conjunta");
      calcalculo069.setDescription("Reduc. Declar. Monoparental");
      calcalculo070.setDescription("Minimo Pers.-75");
      calcalculo071.setDescription("M.famil.-Primer hijo");
      calcalculo072.setDescription("M.famil.-Segundo hijo");
      calcalculo073.setDescription("M.famil.-Tercer hijo");
      calcalculo074.setDescription("M.famil.-Cuarto hijo y suc");
      calcalculo075.setDescription("Red. asistencia contribuyente");
      calcalculo076.setDescription("Red. asistencia ascendiente");
      calcalculo077.setDescription("Tope rentas descendientes");
      calcalculo078.setDescription("Tope rentas ascendientes");
      calcalculo079.setDescription("Tope rentas discapacitados");
      calcalculo080.setDescription("%Comp.2do.a¤o vda.habitual aut");
      calcalculo081.setDescription("Limite FPE");
      calcalculo082.setDescription("Limite FPE Discapitados");
      calcalculo083.setDescription("%Base Ahorro   Estat.");
      calcalculo084.setDescription("%Base Ahorro   Auton.");
      calcalculo085.setDescription("Limite Donativos y BIC");
      calcalculo086.setDescription("Comp. Limite Vda. Habitual");
      calcalculo087.setDescription("2011 DT18 Base ded.vda minus <01/01/11");
      calcalculo088.setDescription("% Ded. Ceuta-Melilla Renta");
      calcalculo089.setDescription("Deduccion PAC Canarias");
      calcalculo090.setDescription("% Deducciones Estatales");
      calcalculo091.setDescription("% Deducciones Autonomicas");
      calcalculo092.setDescription("% Primer Plazo");
      calcalculo093.setDescription("Limite base ahorro");
      calcalculo094.setDescription("No residentes Tipo General");
      calcalculo095.setDescription("No residentes Tipo Ganancias");
      calcalculo096.setDescription("No residentes Tipo Trab. Per.");
      calcalculo097.setDescription("Valoracion vivienda especie");
      calcalculo098.setDescription("Valoracion vivienda esp.actua.");
      calcalculo099.setDescription("% Amortizacion bienes muebles");
      calcalculo100.setDescription("Limite defensa juridica");
      calcalculo101.setDescription("Indice piensos adquir.terceros");
      calcalculo102.setDescription("Coef.actualiz. valor catastral");
      calcalculo103.setDescription("Limite FPE conyuge");
      calcalculo104.setDescription("%Compensa.vda.habitual estatal");
      calcalculo105.setDescription("%Comp.1er. a¤o vda.hab.estatal");
      calcalculo106.setDescription("%Comp.2do. a¤o vda.hab.estatal");
      calcalculo107.setDescription("Comp.Limite Parte 1. Vda. Hab.");
      calcalculo108.setDescription("2011 DT18 Base ded.vda <01/01/11");
      calcalculo109.setDescription("Limite Renta y Patrimonio");
      calcalculo110.setDescription("Limite Exceso Patrimonio");
      calcalculo111.setDescription("Minimo ascendiente 65");
      calcalculo112.setDescription("Minimo ascendiente 75");
      calcalculo113.setDescription("Limite rentas descd./ascend.");
      calcalculo114.setDescription("Limite deduc. vda. habitual");
      calcalculo115.setDescription("Limite ded.vda.hab.minusval.");
      calcalculo116.setDescription("Limite FPE (52)");
      calcalculo117.setDescription("% Limite FPE");
      calcalculo118.setDescription("% Limite FPE (52)");
      calcalculo119.setDescription("Obligacion: Tope Ing. Trabajo");
      calcalculo120.setDescription("Obligacion: Tope R.Mobiliario");
      calcalculo121.setDescription("Obligacion: Tope Rd.Trabajo I.");
      calcalculo122.setDescription("Obligacion: Tope Rentas Inmob.");
      calcalculo123.setDescription("Obligacion: Tope Subvenciones");
      calcalculo124.setDescription("% Deduccion adicional I+D");
      calcalculo125.setDescription("% Ded.1 innovacion tecnologica");
      calcalculo126.setDescription("% Ded.2 Innovacion Tecnologica");
      calcalculo127.setDescription("%Ded.inversion y gastos guard.");
      calcalculo128.setDescription("Limite max. cuotas a partidos");
      calcalculo129.setDescription("% 2do.limite conjunto deduc.");
      calcalculo130.setDescription("Exencion vda habitual Patrimon");
      calcalculo131.setDescription("2do. % Base Ahorro Est.");
      calcalculo132.setDescription("Limite ingresos conyuge FPE");
      calcalculo133.setDescription("Control Coherencia");
      calcalculo134.setDescription("IMPRESION 210-214");
      calcalculo135.setDescription("%Ded.aport.patr.pers.discapac.");
      calcalculo136.setDescription("% Ded. adicional Canarias I+D");
      calcalculo137.setDescription("%Ded.1 Innov.Tecnol. Canarias");
      calcalculo138.setDescription("%Ded.2 Innov.Tecnol. Canarias");
      calcalculo139.setDescription("%2o.limite conjunto ded.Canar.");
      calcalculo140.setDescription("% Bonif. Ceuta-Melilla Patrim.");
      calcalculo141.setDescription("Limite aportaciones FP deport.");
      calcalculo142.setDescription("Rdtos. trabajo infer.cuantia");
      calcalculo143.setDescription("Ingresos Letras tesoro y subv.");
      calcalculo144.setDescription("Ingresos Inmuebles arrendados");
      calcalculo145.setDescription("No residentes Tipo art.23.g)");
      calcalculo146.setDescription("Ded.Nacimiento");
      calcalculo147.setDescription("%Gastos dificil just.EDS agr.");
      calcalculo148.setDescription("%Ded. tecnologia informacion");
      calcalculo149.setDescription("%Ded.medidas apoyo transporte");
      calcalculo150.setDescription("%Ded. tecnol.informacion Cana.");
      calcalculo151.setDescription("%Ded.medidas transporte Canari");
      calcalculo152.setDescription("%Ded.Vda.Hab.Minus. Estatal");
      calcalculo153.setDescription("%Ded.elemento inmovilizado I+D");
      calcalculo154.setDescription("%Ded.contrib. planes pensiones");
      calcalculo155.setDescription("%Ded.elemento inmov.I+D Canar.");
      calcalculo156.setDescription("%Ded.contr.planes pens.Canar.");
      calcalculo157.setDescription("Lim.gastos primas seg.enfermed");
      calcalculo158.setDescription("Red.discapacidad contribuyente");
      calcalculo159.setDescription("Red.disc. contribuyente >=65%");
      calcalculo160.setDescription("Red.discapacidad asc./desc.");
      calcalculo161.setDescription("Red.disc. asc./desc. >=65%");
      calcalculo162.setDescription("Red.disc. trabajador activo");
      calcalculo163.setDescription("Red.disc.trabajador activo>=65");
      calcalculo164.setDescription("Limite exencion dividendos");
      calcalculo165.setDescription("Lim.ded.cta.ahorro-empresa");
      calcalculo166.setDescription("Importe deduccion maternidad");
      calcalculo167.setDescription("% Reduccion rdto.inmuebles vda");
      calcalculo168.setDescription("IPREM");
      calcalculo169.setDescription("Fecha entrada vigor Ley 35/06");
      calcalculo170.setDescription("2do. % Base Ahorro Auton.");
      calcalculo171.setDescription("% Resto deducciones");
      calcalculo172.setDescription("%Ded.Vda.Hab.Minus. Autonomica");
      calcalculo173.setDescription("%Ded.aport.patr.pers.disc.Can.");
      calcalculo174.setDescription("Limite aport.patrim.discapac.");
      calcalculo175.setDescription("%Ded.alquiler");
      calcalculo176.setDescription("Base maxima ded.alquiler");
      calcalculo177.setDescription("Limite alquiler B.Imp. <=");
      calcalculo178.setDescription("Limite 2 alquil B.Imp. <");
      calcalculo179.setDescription("Indice multipl.alquiler");
      calcalculo180.setDescription("Euribor medio anual ej.actual");
      calcalculo181.setDescription("Euribor medio anual ej.anter.");
      calcalculo182.setDescription("Red. gasoleo agricola");
      calcalculo183.setDescription("Red. fertilizantes/plasticos");
      calcalculo184.setDescription("Ded.Trabajo/Actividades");
      calcalculo185.setDescription("Euribor ejer. 2007");
      calcalculo186.setDescription("Limite importe cifra negocios");
      calcalculo187.setDescription("Limite volumen Rd.Integros");
      calcalculo188.setDescription("Limite volumen Rd.Integros Agr");
      calcalculo189.setDescription("Red. creac.empleo");
      calcalculo190.setDescription("Limite red. creacion empelo");
      calcalculo191.setDescription("Red. Gral. Estimacion");
      calcalculo192.setDescription("% Deducciones Estatal");
      calcalculo193.setDescription("% Deducciones Autonomico");
      calcalculo194.setDescription("% Ded.Vda.Hab.2010 EST");
      calcalculo195.setDescription("% Ded.Vda.Hab.2010 AUT");
      calcalculo196.setDescription("% Ded.Vda.Hab.Discap.2010 Est");
      calcalculo197.setDescription("% Ded.Vda.Hab.Discap.2010 Aut");
      calcalculo198.setDescription("Limite B.Imp. ded.obras");
      calcalculo199.setDescription("Limite2 B.Imp.ded.obras");
      calcalculo200.setDescription("Indice multip.ded.obras");
      calcalculo201.setDescription("% Ded.Obras mejora vda.hab.");
      calcalculo202.setDescription("Base max.anual ded.obras");
      calcalculo203.setDescription("Base max.acumulada ded.obras");
      calcalculo204.setDescription("Limite BI Ded.Trabajo/Activ.");
      calcalculo205.setDescription("Limite 2 BI Ded.Trabajo/Activ");
      calcalculo206.setDescription("Indice multipl. Ded.Trab/Activ");
      calcalculo207.setDescription("Retribucion bruta deduccion Plan pensiones");
      calcalculo208.setDescription("Aportacion máxima patrimonio discapacitado");
      calcalculo209.setDescription("2011 Límite reduccion irregular trabajo");
      calcalculo210.setDescription("2011 Salario mínimo interprofesional");
      calcalculo211.setDescription("2011 Límite base imponible deducción obras mejora");
      calcalculo212.setDescription("2011 Límite 2 base imponible deducción obras mejora");
      calcalculo213.setDescription("2011 Indice multiplicador ded. obras mejoras");
      calcalculo214.setDescription("2011 % Deducción obras mejoras");
      calcalculo215.setDescription("2011 Base máxima anual obras mejora");
      calcalculo216.setDescription("2011 Base acumulada anual obras mejora");
      calcalculo217.setDescription("2011 Limite ded.vda. B.Imp <=");
      calcalculo218.setDescription("2011 Limite 2 ded.vda. B.Imp <=");
      calcalculo219.setDescription("2011 Indice multipl.deduc.vda");
      calcalculo220.setDescription("2011 Base deduc.vivienda");
      calcalculo221.setDescription("2011 Limite ded.vda.minus. B.Imp <=");
      calcalculo222.setDescription("2011 Limite 2 ded.vda.minus B.Imp <=");
      calcalculo223.setDescription("2011 Indice multipl.deduc.vda. minus");
      calcalculo224.setDescription("2011 Base deduc.vivienda minusvalido");
      calcalculo225.setDescription("2011 DT18 Limit BI superior Vda<01/01/2011");
      calcalculo226.setDescription("2011 DT18 Limit BI superior Vda Minus<01/01/2011");
      calcalculo227.setDescription("2012 Limite exencion pago unico desempleo");
      calcalculo228.setDescription("2012 Obligacion 720 50000");
      calcalculo229.setDescription("2012 Obligacion 720 incremento ejer.anterior 20000");
      calcalculo230.setDescription("2012 Ded creac empleo emprendedor primer trabajador (R2013)");
      calcalculo231.setDescription("2012 % Ded creacion empleo emprendedores            (R2013)");
      calcalculo232.setDescription("2012 % Exen.transmision inm.urbanos comprados 12/05 i 31/12/2012");
      calcalculo233.setDescription("2013 % Ded nueva actividad Estim.Directa  (Art.32.3)");
      calcalculo234.setDescription("2013 Límite Ded nueva actividad Estim.Directa");
      calcalculo235.setDescription("2013 Limite2 Integración Perdidas en Base Gral.");
      calcalculo236.setDescription("2013 Limite2 reduc.irregular por extinción relac.laboral");
      calcalculo237.setDescription("2013 Limite3 reduc.irregular por extinción relac.laboral");
      calcalculo238.setDescription("2013 % Ded acc o particio.empresas nueva creacion");
      calcalculo239.setDescription("2013 Limite base deduc.acc o particio.empresas nueva creacion");
      calcalculo240.setDescription("2013 Deduccion creacion empleo minusvalia >=65%");
      calcalculo241.setDescription("2013 Ded.Inver.Empresarial por benefecios");
      calcalculo242.setDescription("2013 Ded.Inver.Empresarial por benefecios con red.Art.32.2");
      calcalculo243.setDescription("2013 Ded.Inver.Empresarial Canaries por benefecios");
      calcalculo244.setDescription("2013 Ded.Inver.Empresarial Canaries por benefecios con red.Art.32.2");
      calcalculo245.setDescription("2013 Limite reducion contribuc.seguros colect.dependencia");
      }
    }
    
  public class TabMiembrosunidad extends TableDef
    {
    // Campos
    public FieldDef mieejeraplic;
    public FieldDef miedeclaran;
    public FieldDef miemuf;
    public FieldDef mietipo;
    public FieldDef mienif;
    public FieldDef mieapellido1;
    public FieldDef mieapellido2;
    public FieldDef mienombre;
    public FieldDef mieparentesco;
    public FieldDef mieminusvalido;
    public FieldDef miefechanac;
    public FieldDef mievinculacion;
    public FieldDef mieotrassituaci;
    public FieldDef mieconvivencia;
    public FieldDef mieceutamelilla;
    public FieldDef miesoltero;
    public FieldDef mieporcentaje;
    public FieldDef mieporcautondec;
    public FieldDef mieporcautoncon;
    public FieldDef mieingresos;
    public FieldDef mierentasexenta;
    public FieldDef mieletrasetiqu;
    public FieldDef miefechafallec;
    public FieldDef mieresidencia;
    public FieldDef miediasconvive;
    public FieldDef miesexo;
    public FieldDef miedeclararenta;
    public FieldDef miedeclarapatri;
    public FieldDef mietipodisminu;
    public FieldDef mieminusjudicia;
    public FieldDef miefechaadopcio;
    public FieldDef mieadopinternac;
    public FieldDef miecodigocdpdec;
    public FieldDef mieporminusval;
    public FieldDef mieotronif;
    public FieldDef mieotroape1;
    public FieldDef mieotroape2;
    public FieldDef mieotronom;
    public FieldDef mieotrosindni;
    public FieldDef miedepen;
    public FieldDef miefecdepen;
    public TabMiembrosunidad(String name)
      {
      super(name);
      mieejeraplic = new FieldDef("mieejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      miedeclaran = new FieldDef("miedeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      miemuf = new FieldDef("miemuf",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mietipo = new FieldDef("mietipo",FieldDef.CHAR,1);
      mienif = new FieldDef("mienif",FieldDef.CHAR,15);
      mieapellido1 = new FieldDef("mieapellido1",FieldDef.CHAR,100);
      mieapellido2 = new FieldDef("mieapellido2",FieldDef.CHAR,25);
      mienombre = new FieldDef("mienombre",FieldDef.CHAR,20);
      mieparentesco = new FieldDef("mieparentesco",FieldDef.CHAR,6);
      mieminusvalido = new FieldDef("mieminusvalido",FieldDef.INTEGER,0);
      miefechanac = new FieldDef("miefechanac",FieldDef.DATE);
      mievinculacion = new FieldDef("mievinculacion",FieldDef.CHAR,1);
      mieotrassituaci = new FieldDef("mieotrassituaci",FieldDef.CHAR,1);
      mieconvivencia = new FieldDef("mieconvivencia",FieldDef.INTEGER,0);
      mieceutamelilla = new FieldDef("mieceutamelilla",FieldDef.CHAR,1);
      miesoltero = new FieldDef("miesoltero",FieldDef.CHAR,1);
      mieporcentaje = new FieldDef("mieporcentaje",FieldDef.INTEGER,0);
      mieporcautondec = new FieldDef("mieporcautondec",FieldDef.INTEGER,0);
      mieporcautoncon = new FieldDef("mieporcautoncon",FieldDef.INTEGER,0);
      mieingresos = new FieldDef("mieingresos",FieldDef.FLOAT,6,0);
      mierentasexenta = new FieldDef("mierentasexenta",FieldDef.FLOAT,6,0);
      mieletrasetiqu = new FieldDef("mieletrasetiqu",FieldDef.CHAR,4);
      miefechafallec = new FieldDef("miefechafallec",FieldDef.DATE);
      mieresidencia = new FieldDef("mieresidencia",FieldDef.CHAR,1);
      miediasconvive = new FieldDef("miediasconvive",FieldDef.INTEGER,0);
      miesexo = new FieldDef("miesexo",FieldDef.CHAR,1);
      miedeclararenta = new FieldDef("miedeclararenta",FieldDef.CHAR,1);
      miedeclarapatri = new FieldDef("miedeclarapatri",FieldDef.CHAR,1);
      mietipodisminu = new FieldDef("mietipodisminu",FieldDef.CHAR,1);
      mieminusjudicia = new FieldDef("mieminusjudicia",FieldDef.CHAR,1);
      miefechaadopcio = new FieldDef("miefechaadopcio",FieldDef.DATE);
      mieadopinternac = new FieldDef("mieadopinternac",FieldDef.CHAR,1);
      miecodigocdpdec = new FieldDef("miecodigocdpdec",FieldDef.CHAR,12);
      mieporminusval = new FieldDef("mieporminusval",FieldDef.INTEGER,0);
      mieotronif = new FieldDef("mieotronif",FieldDef.CHAR,15);
      mieotroape1 = new FieldDef("mieotroape1",FieldDef.CHAR,25);
      mieotroape2 = new FieldDef("mieotroape2",FieldDef.CHAR,25);
      mieotronom = new FieldDef("mieotronom",FieldDef.CHAR,20);
      mieotrosindni = new FieldDef("mieotrosindni",FieldDef.CHAR,1);
      miedepen = new FieldDef("miedepen",FieldDef.CHAR,1);
      miefecdepen = new FieldDef("miefecdepen",FieldDef.DATE);
      FieldDef array[] = {
        mieejeraplic,
        miedeclaran,
        miemuf,
        mietipo,
        mienif,
        mieapellido1,
        mieapellido2,
        mienombre,
        mieparentesco,
        mieminusvalido,
        miefechanac,
        mievinculacion,
        mieotrassituaci,
        mieconvivencia,
        mieceutamelilla,
        miesoltero,
        mieporcentaje,
        mieporcautondec,
        mieporcautoncon,
        mieingresos,
        mierentasexenta,
        mieletrasetiqu,
        miefechafallec,
        mieresidencia,
        miediasconvive,
        miesexo,
        miedeclararenta,
        miedeclarapatri,
        mietipodisminu,
        mieminusjudicia,
        miefechaadopcio,
        mieadopinternac,
        miecodigocdpdec,
        mieporminusval,
        mieotronif,
        mieotroape1,
        mieotroape2,
        mieotronom,
        mieotrosindni,
        miedepen,
        miefecdepen        
        };
      setColumns(array);
      FieldDef arrayf[] = {mieejeraplic,miedeclaran,miemuf };
      setDescription("Miembros de la unidad familiar");
      setPrimaryKeys(arrayf);
      mieejeraplic.setDescription("Ejercicio aplicacion");
      miedeclaran.setDescription("CODIGO DE DECLARANTE");
      miemuf.setDescription("CODIGO MIEMBRO UNIDAD FAMILIAR");
      mietipo.setDescription("[A]scendiente, [D]escendiente");
      mienif.setDescription("NIF declarante");
      mieapellido1.setDescription("Primer Apellido declarante");
      mieapellido2.setDescription("Segundo Apellido declarante");
      mienombre.setDescription("Nombre declarante");
      mieparentesco.setDescription("Parentesco");
      mieminusvalido.setDescription("Minusvalido");
      miefechanac.setDescription("Fecha Nacimiento");
      mievinculacion.setDescription("Vinculacion para reduccion");
      mieotrassituaci.setDescription("Otras situaciones");
      mieconvivencia.setDescription("Convivencia");
      mieceutamelilla.setDescription("Residencia 3 años");
      miesoltero.setDescription("Soltero");
      mieporcentaje.setDescription("Porcentaje Aplicable");
      mieporcautondec.setDescription("Porcentaje Aplicable ded.autonomica declaran");
      mieporcautoncon.setDescription("Porcentaje Aplicable ded.autonomica conyuge");
      mieingresos.setDescription("Ingresos");
      mierentasexenta.setDescription("Rentas exentas");
      mieletrasetiqu.setDescription("4 letras etiqueta identificacion");
      miefechafallec.setDescription("Fecha de fallecimiento");
      mieresidencia.setDescription("Reside mas de 30 dias");
      miediasconvive.setDescription("Dias convivencia");
      miesexo.setDescription("Sexo");
      miedeclararenta.setDescription("Presenta declaracion Renta o 104");
      miedeclarapatri.setDescription("Presenta declaracion Patrimonio");
      mietipodisminu.setDescription("Tipo disminucion");
      mieminusjudicia.setDescription("Incapacitado judicialmente");
      miefechaadopcio.setDescription("Fecha de adopcion");
      mieadopinternac.setDescription("Adopcion internacional");
      miecodigocdpdec.setDescription("Codigo cdp miembro unidad");
      mieporminusval.setDescription("Porcemtaje de minusvalia");
      mieotronif.setDescription("2011 Vinculacio 3 o 4: NIF del otro progenitor");
      mieotroape1.setDescription("2011 Vinculacio 3 o 4: apellido 1 del otro progenitor");
      mieotroape2.setDescription("2011 Vinculacio 3 o 4: apellido 2 del otro progenitor");
      mieotronom.setDescription("2011 Vinculacio 3 o 4: nombre del otro progenitor");
      mieotrosindni.setDescription("2012 Vinculacio 3 o 4: otro progenitor sin NIF o NIE");
      miedepen.setDescription("2013 Dependencia severa o gran dependencia");
      miefecdepen.setDescription("2013 Fecha concesion dependencia severa o gran dependencia");
      }
    }
    
  public class TabLiquidaaparta extends TableDef
    {
    // Campos
    public FieldDef liaejeraplic;
    public FieldDef liadeclaran;
    public FieldDef liamuf;
    public FieldDef liatipocalculo;
    public FieldDef liadinerarios;
    public FieldDef liaespecvalorac;
    public FieldDef liaespecingrcta;
    public FieldDef liaespecingrrep;
    public FieldDef liaespecimpinte;
    public FieldDef liaplanpensione;
    public FieldDef liaaportpatrimo;
    public FieldDef liareduccion1;
    public FieldDef liatotalingreso;
    public FieldDef liasegsocial;
    public FieldDef liasindicatos;
    public FieldDef liacolegprofesi;
    public FieldDef liadefensajurid;
    public FieldDef liatotalgastos;
    public FieldDef liardtoneto;
    public FieldDef liaredcopaamer;
    public FieldDef liaredrdtotraba;
    public FieldDef liacuantiagral;
    public FieldDef liaincremmayor;
    public FieldDef liaincremdesemp;
    public FieldDef liareddiscapac;
    public FieldDef liardtonetoredu;
    public FieldDef liadependencia;
    public TabLiquidaaparta(String name)
      {
      super(name);
      liaejeraplic = new FieldDef("liaejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      liadeclaran = new FieldDef("liadeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      liamuf = new FieldDef("liamuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      liatipocalculo = new FieldDef("liatipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      liadinerarios = new FieldDef("liadinerarios",FieldDef.FLOAT,6,0);
      liaespecvalorac = new FieldDef("liaespecvalorac",FieldDef.FLOAT,6,0);
      liaespecingrcta = new FieldDef("liaespecingrcta",FieldDef.FLOAT,6,0);
      liaespecingrrep = new FieldDef("liaespecingrrep",FieldDef.FLOAT,6,0);
      liaespecimpinte = new FieldDef("liaespecimpinte",FieldDef.FLOAT,6,0);
      liaplanpensione = new FieldDef("liaplanpensione",FieldDef.FLOAT,6,0);
      liaaportpatrimo = new FieldDef("liaaportpatrimo",FieldDef.FLOAT,6,0);
      liareduccion1 = new FieldDef("liareduccion1",FieldDef.FLOAT,6,0);
      liatotalingreso = new FieldDef("liatotalingreso",FieldDef.FLOAT,6,0);
      liasegsocial = new FieldDef("liasegsocial",FieldDef.FLOAT,6,0);
      liasindicatos = new FieldDef("liasindicatos",FieldDef.FLOAT,6,0);
      liacolegprofesi = new FieldDef("liacolegprofesi",FieldDef.FLOAT,6,0);
      liadefensajurid = new FieldDef("liadefensajurid",FieldDef.FLOAT,6,0);
      liatotalgastos = new FieldDef("liatotalgastos",FieldDef.FLOAT,6,0);
      liardtoneto = new FieldDef("liardtoneto",FieldDef.FLOAT,6,0);
      liaredcopaamer = new FieldDef("liaredcopaamer",FieldDef.FLOAT,6,0);
      liaredrdtotraba = new FieldDef("liaredrdtotraba",FieldDef.FLOAT,6,0);
      liacuantiagral = new FieldDef("liacuantiagral",FieldDef.FLOAT,6,0);
      liaincremmayor = new FieldDef("liaincremmayor",FieldDef.FLOAT,6,0);
      liaincremdesemp = new FieldDef("liaincremdesemp",FieldDef.FLOAT,6,0);
      liareddiscapac = new FieldDef("liareddiscapac",FieldDef.FLOAT,6,0);
      liardtonetoredu = new FieldDef("liardtonetoredu",FieldDef.FLOAT,6,0);
      liadependencia = new FieldDef("liadependencia",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        liaejeraplic,
        liadeclaran,
        liamuf,
        liatipocalculo,
        liadinerarios,
        liaespecvalorac,
        liaespecingrcta,
        liaespecingrrep,
        liaespecimpinte,
        liaplanpensione,
        liaaportpatrimo,
        liareduccion1,
        liatotalingreso,
        liasegsocial,
        liasindicatos,
        liacolegprofesi,
        liadefensajurid,
        liatotalgastos,
        liardtoneto,
        liaredcopaamer,
        liaredrdtotraba,
        liacuantiagral,
        liaincremmayor,
        liaincremdesemp,
        liareddiscapac,
        liardtonetoredu,
        liadependencia        
        };
      setColumns(array);
      FieldDef arrayf[] = {liaejeraplic,liadeclaran,liamuf,liatipocalculo };
      setDescription("Liquidacion renta apartado A: trabajo personal");
      setPrimaryKeys(arrayf);
      liaejeraplic.setDescription("Ejercicio aplicacion");
      liadeclaran.setDescription("Codigo de declarante");
      liamuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      liatipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      liadinerarios.setDescription("Importe integro retribucion dineraria");
      liaespecvalorac.setDescription("Retribucion en especie: valoracion");
      liaespecingrcta.setDescription("Retribucion en especie: ingreso a  cuenta");
      liaespecingrrep.setDescription("Retribucion en especie: ingr.a cuenta repercutido");
      liaespecimpinte.setDescription("Retribucion en especie: importe integro");
      liaplanpensione.setDescription("Planes de pensiones");
      liaaportpatrimo.setDescription("Aportacion patrimonio protegido");
      liareduccion1.setDescription("Reducciones art.18");
      liatotalingreso.setDescription("Total ingresos computables");
      liasegsocial.setDescription("Seguridad social");
      liasindicatos.setDescription("Cuotas satisfechas sindicatos");
      liacolegprofesi.setDescription("Cuotas de colegios profesionales");
      liadefensajurid.setDescription("Gastos de defensa juridica");
      liatotalgastos.setDescription("Total gastos deducibles");
      liardtoneto.setDescription("Rendimiento neto del trabajo");
      liaredcopaamer.setDescription("Reduccion Copa America");
      liaredrdtotraba.setDescription("Reduccion por obtencion rendimientos del trabajo");
      liacuantiagral.setDescription("Cuantia aplicable con caracter general");
      liaincremmayor.setDescription("Incremento mayores 65 años");
      liaincremdesemp.setDescription("Incremento por desempleados");
      liareddiscapac.setDescription("Reduccion adicional trabajadores discapacidad");
      liardtonetoredu.setDescription("Rendimiento neto reducido trabajo");
      liadependencia.setDescription("Contrib.empres.seg.colectivos de dependencia");
      }
    }
    
  public class TabLiquidaanexoa1 extends TableDef
    {
    // Campos
    public FieldDef la1ejeraplic;
    public FieldDef la1declaran;
    public FieldDef la1muf;
    public FieldDef la1tipocalculo;
    public FieldDef la1vdaadqinvers;
    public FieldDef la1vdaadqdedest;
    public FieldDef la1vdaadqdedaut;
    public FieldDef la1vdaadqfecha;
    public FieldDef la1vdaadqpresta;
    public FieldDef la1vdaadqporcen;
    public FieldDef la1vdaconinvers;
    public FieldDef la1vdacondedest;
    public FieldDef la1vdacondedaut;
    public FieldDef la1vdaconimppag;
    public FieldDef la1vdaconnifpro;
    public FieldDef la1vdactainvers;
    public FieldDef la1vdactadedest;
    public FieldDef la1vdactadedaut;
    public FieldDef la1vdactatit1;
    public FieldDef la1vdactafecha1;
    public FieldDef la1vdactabanco1;
    public FieldDef la1vdactaofici1;
    public FieldDef la1vdactadigit1;
    public FieldDef la1vdactancta1;
    public FieldDef la1vdactatit2;
    public FieldDef la1vdactafecha2;
    public FieldDef la1vdactabanco2;
    public FieldDef la1vdactaofici2;
    public FieldDef la1vdactadigit2;
    public FieldDef la1vdactancta2;
    public FieldDef la1vdamininvers;
    public FieldDef la1vdamindedest;
    public FieldDef la1vdamindedaut;
    public FieldDef la1vdaalqnif1;
    public FieldDef la1vdaalqimpor1;
    public FieldDef la1vdaalqnif2;
    public FieldDef la1vdaalqimpor2;
    public FieldDef la1vdaalqbasede;
    public FieldDef la1vdaalqdeduc;
    public FieldDef la1don1base;
    public FieldDef la1don1deduc;
    public FieldDef la1don2base;
    public FieldDef la1don2deduc;
    public FieldDef la1vdamejnif;
    public FieldDef la1vdamejinvers;
    public FieldDef la1vdamejexceso;
    public FieldDef la1bicinversion;
    public FieldDef la1bicdeduccion;
    public FieldDef la1porcendedaut;
    public FieldDef la1porcdedautmi;
    public FieldDef la1don10base;
    public FieldDef la1don25base;
    public FieldDef la1vdamejinver2;
    public FieldDef la1vdamejexces2;
    public FieldDef la1vdamejnif2;
    public FieldDef la1vdamejrefer2;
    public FieldDef la1vdamejrefer;
    public FieldDef la1vdamejpartic;
    public FieldDef la1vdamejptotal;
    public FieldDef la1vdamejcanant;
    public FieldDef la1vdamejinvant;
    public FieldDef la1vdamejdedant;
    public FieldDef la1vdamejcan;
    public FieldDef la1vdamejinvact;
    public FieldDef la1vdamejdedact;
    public FieldDef la1vdareainvers;
    public FieldDef la1vdareadedest;
    public FieldDef la1vdareadedaut;
    public FieldDef la1encdeduc;
    public FieldDef la1encbase;
    public FieldDef la1encnif;
    public FieldDef la1encnif2;
    public FieldDef la1encinver;
    public FieldDef la1vdaalqnif1ex;
    public FieldDef la1vdaalqnif2ex;
    public FieldDef la1obrascant11;
    public FieldDef la1obrasiant11;
    public FieldDef la1obrasdant11;
    public FieldDef la1obrascant12;
    public FieldDef la1obrasiant12;
    public FieldDef la1obrasdant12;
    public FieldDef la1vdamejcanan0;
    public FieldDef la1vdamejinvan0;
    public FieldDef la1vdamejdedan0;
    public FieldDef la1vdamejcanan1;
    public FieldDef la1vdamejinvan1;
    public FieldDef la1vdamejdedan1;
    public TabLiquidaanexoa1(String name)
      {
      super(name);
      la1ejeraplic = new FieldDef("la1ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      la1declaran = new FieldDef("la1declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      la1muf = new FieldDef("la1muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      la1tipocalculo = new FieldDef("la1tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      la1vdaadqinvers = new FieldDef("la1vdaadqinvers",FieldDef.FLOAT,6,0);
      la1vdaadqdedest = new FieldDef("la1vdaadqdedest",FieldDef.FLOAT,6,0);
      la1vdaadqdedaut = new FieldDef("la1vdaadqdedaut",FieldDef.FLOAT,6,0);
      la1vdaadqfecha = new FieldDef("la1vdaadqfecha",FieldDef.DATE);
      la1vdaadqpresta = new FieldDef("la1vdaadqpresta",FieldDef.CHAR,20);
      la1vdaadqporcen = new FieldDef("la1vdaadqporcen",FieldDef.FLOAT,6,0);
      la1vdaconinvers = new FieldDef("la1vdaconinvers",FieldDef.FLOAT,6,0);
      la1vdacondedest = new FieldDef("la1vdacondedest",FieldDef.FLOAT,6,0);
      la1vdacondedaut = new FieldDef("la1vdacondedaut",FieldDef.FLOAT,6,0);
      la1vdaconimppag = new FieldDef("la1vdaconimppag",FieldDef.FLOAT,6,0);
      la1vdaconnifpro = new FieldDef("la1vdaconnifpro",FieldDef.CHAR,15);
      la1vdactainvers = new FieldDef("la1vdactainvers",FieldDef.FLOAT,6,0);
      la1vdactadedest = new FieldDef("la1vdactadedest",FieldDef.FLOAT,6,0);
      la1vdactadedaut = new FieldDef("la1vdactadedaut",FieldDef.FLOAT,6,0);
      la1vdactatit1 = new FieldDef("la1vdactatit1",FieldDef.CHAR,1);
      la1vdactafecha1 = new FieldDef("la1vdactafecha1",FieldDef.DATE);
      la1vdactabanco1 = new FieldDef("la1vdactabanco1",FieldDef.INTEGER,0);
      la1vdactaofici1 = new FieldDef("la1vdactaofici1",FieldDef.INTEGER,0);
      la1vdactadigit1 = new FieldDef("la1vdactadigit1",FieldDef.INTEGER,0);
      la1vdactancta1 = new FieldDef("la1vdactancta1",FieldDef.CHAR,10);
      la1vdactatit2 = new FieldDef("la1vdactatit2",FieldDef.CHAR,1);
      la1vdactafecha2 = new FieldDef("la1vdactafecha2",FieldDef.DATE);
      la1vdactabanco2 = new FieldDef("la1vdactabanco2",FieldDef.INTEGER,0);
      la1vdactaofici2 = new FieldDef("la1vdactaofici2",FieldDef.INTEGER,0);
      la1vdactadigit2 = new FieldDef("la1vdactadigit2",FieldDef.INTEGER,0);
      la1vdactancta2 = new FieldDef("la1vdactancta2",FieldDef.CHAR,10);
      la1vdamininvers = new FieldDef("la1vdamininvers",FieldDef.FLOAT,6,0);
      la1vdamindedest = new FieldDef("la1vdamindedest",FieldDef.FLOAT,6,0);
      la1vdamindedaut = new FieldDef("la1vdamindedaut",FieldDef.FLOAT,6,0);
      la1vdaalqnif1 = new FieldDef("la1vdaalqnif1",FieldDef.CHAR,15);
      la1vdaalqimpor1 = new FieldDef("la1vdaalqimpor1",FieldDef.FLOAT,6,0);
      la1vdaalqnif2 = new FieldDef("la1vdaalqnif2",FieldDef.CHAR,15);
      la1vdaalqimpor2 = new FieldDef("la1vdaalqimpor2",FieldDef.FLOAT,6,0);
      la1vdaalqbasede = new FieldDef("la1vdaalqbasede",FieldDef.FLOAT,6,0);
      la1vdaalqdeduc = new FieldDef("la1vdaalqdeduc",FieldDef.FLOAT,6,0);
      la1don1base = new FieldDef("la1don1base",FieldDef.FLOAT,6,0);
      la1don1deduc = new FieldDef("la1don1deduc",FieldDef.FLOAT,6,0);
      la1don2base = new FieldDef("la1don2base",FieldDef.FLOAT,6,0);
      la1don2deduc = new FieldDef("la1don2deduc",FieldDef.FLOAT,6,0);
      la1vdamejnif = new FieldDef("la1vdamejnif",FieldDef.CHAR,15);
      la1vdamejinvers = new FieldDef("la1vdamejinvers",FieldDef.FLOAT,6,0);
      la1vdamejexceso = new FieldDef("la1vdamejexceso",FieldDef.FLOAT,6,0);
      la1bicinversion = new FieldDef("la1bicinversion",FieldDef.FLOAT,6,0);
      la1bicdeduccion = new FieldDef("la1bicdeduccion",FieldDef.FLOAT,6,0);
      la1porcendedaut = new FieldDef("la1porcendedaut",FieldDef.FLOAT,6,0);
      la1porcdedautmi = new FieldDef("la1porcdedautmi",FieldDef.FLOAT,6,0);
      la1don10base = new FieldDef("la1don10base",FieldDef.FLOAT,6,0);
      la1don25base = new FieldDef("la1don25base",FieldDef.FLOAT,6,0);
      la1vdamejinver2 = new FieldDef("la1vdamejinver2",FieldDef.FLOAT,6,0);
      la1vdamejexces2 = new FieldDef("la1vdamejexces2",FieldDef.FLOAT,6,0);
      la1vdamejnif2 = new FieldDef("la1vdamejnif2",FieldDef.CHAR,15);
      la1vdamejrefer2 = new FieldDef("la1vdamejrefer2",FieldDef.CHAR,20);
      la1vdamejrefer = new FieldDef("la1vdamejrefer",FieldDef.CHAR,20);
      la1vdamejpartic = new FieldDef("la1vdamejpartic",FieldDef.FLOAT,6,0);
      la1vdamejptotal = new FieldDef("la1vdamejptotal",FieldDef.FLOAT,6,0);
      la1vdamejcanant = new FieldDef("la1vdamejcanant",FieldDef.FLOAT,6,0);
      la1vdamejinvant = new FieldDef("la1vdamejinvant",FieldDef.FLOAT,6,0);
      la1vdamejdedant = new FieldDef("la1vdamejdedant",FieldDef.FLOAT,6,0);
      la1vdamejcan = new FieldDef("la1vdamejcan",FieldDef.FLOAT,6,0);
      la1vdamejinvact = new FieldDef("la1vdamejinvact",FieldDef.FLOAT,6,0);
      la1vdamejdedact = new FieldDef("la1vdamejdedact",FieldDef.FLOAT,6,0);
      la1vdareainvers = new FieldDef("la1vdareainvers",FieldDef.FLOAT,6,0);
      la1vdareadedest = new FieldDef("la1vdareadedest",FieldDef.FLOAT,6,0);
      la1vdareadedaut = new FieldDef("la1vdareadedaut",FieldDef.FLOAT,6,0);
      la1encdeduc = new FieldDef("la1encdeduc",FieldDef.FLOAT,6,0);
      la1encbase = new FieldDef("la1encbase",FieldDef.FLOAT,6,0);
      la1encnif = new FieldDef("la1encnif",FieldDef.CHAR,15);
      la1encnif2 = new FieldDef("la1encnif2",FieldDef.CHAR,15);
      la1encinver = new FieldDef("la1encinver",FieldDef.FLOAT,6,0);
      la1vdaalqnif1ex = new FieldDef("la1vdaalqnif1ex",FieldDef.CHAR,25);
      la1vdaalqnif2ex = new FieldDef("la1vdaalqnif2ex",FieldDef.CHAR,25);
      la1obrascant11 = new FieldDef("la1obrascant11",FieldDef.FLOAT,6,0);
      la1obrasiant11 = new FieldDef("la1obrasiant11",FieldDef.FLOAT,6,0);
      la1obrasdant11 = new FieldDef("la1obrasdant11",FieldDef.FLOAT,6,0);
      la1obrascant12 = new FieldDef("la1obrascant12",FieldDef.FLOAT,6,0);
      la1obrasiant12 = new FieldDef("la1obrasiant12",FieldDef.FLOAT,6,0);
      la1obrasdant12 = new FieldDef("la1obrasdant12",FieldDef.FLOAT,6,0);
      la1vdamejcanan0 = new FieldDef("la1vdamejcanan0",FieldDef.FLOAT,6,0);
      la1vdamejinvan0 = new FieldDef("la1vdamejinvan0",FieldDef.FLOAT,6,0);
      la1vdamejdedan0 = new FieldDef("la1vdamejdedan0",FieldDef.FLOAT,6,0);
      la1vdamejcanan1 = new FieldDef("la1vdamejcanan1",FieldDef.FLOAT,6,0);
      la1vdamejinvan1 = new FieldDef("la1vdamejinvan1",FieldDef.FLOAT,6,0);
      la1vdamejdedan1 = new FieldDef("la1vdamejdedan1",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        la1ejeraplic,
        la1declaran,
        la1muf,
        la1tipocalculo,
        la1vdaadqinvers,
        la1vdaadqdedest,
        la1vdaadqdedaut,
        la1vdaadqfecha,
        la1vdaadqpresta,
        la1vdaadqporcen,
        la1vdaconinvers,
        la1vdacondedest,
        la1vdacondedaut,
        la1vdaconimppag,
        la1vdaconnifpro,
        la1vdactainvers,
        la1vdactadedest,
        la1vdactadedaut,
        la1vdactatit1,
        la1vdactafecha1,
        la1vdactabanco1,
        la1vdactaofici1,
        la1vdactadigit1,
        la1vdactancta1,
        la1vdactatit2,
        la1vdactafecha2,
        la1vdactabanco2,
        la1vdactaofici2,
        la1vdactadigit2,
        la1vdactancta2,
        la1vdamininvers,
        la1vdamindedest,
        la1vdamindedaut,
        la1vdaalqnif1,
        la1vdaalqimpor1,
        la1vdaalqnif2,
        la1vdaalqimpor2,
        la1vdaalqbasede,
        la1vdaalqdeduc,
        la1don1base,
        la1don1deduc,
        la1don2base,
        la1don2deduc,
        la1vdamejnif,
        la1vdamejinvers,
        la1vdamejexceso,
        la1bicinversion,
        la1bicdeduccion,
        la1porcendedaut,
        la1porcdedautmi,
        la1don10base,
        la1don25base,
        la1vdamejinver2,
        la1vdamejexces2,
        la1vdamejnif2,
        la1vdamejrefer2,
        la1vdamejrefer,
        la1vdamejpartic,
        la1vdamejptotal,
        la1vdamejcanant,
        la1vdamejinvant,
        la1vdamejdedant,
        la1vdamejcan,
        la1vdamejinvact,
        la1vdamejdedact,
        la1vdareainvers,
        la1vdareadedest,
        la1vdareadedaut,
        la1encdeduc,
        la1encbase,
        la1encnif,
        la1encnif2,
        la1encinver,
        la1vdaalqnif1ex,
        la1vdaalqnif2ex,
        la1obrascant11,
        la1obrasiant11,
        la1obrasdant11,
        la1obrascant12,
        la1obrasiant12,
        la1obrasdant12,
        la1vdamejcanan0,
        la1vdamejinvan0,
        la1vdamejdedan0,
        la1vdamejcanan1,
        la1vdamejinvan1,
        la1vdamejdedan1        
        };
      setColumns(array);
      FieldDef arrayf[] = {la1ejeraplic,la1declaran,la1muf,la1tipocalculo };
      setDescription("Liquidacion renta anexo A1: Informacion adicional ciertas deducciones");
      setPrimaryKeys(arrayf);
      la1ejeraplic.setDescription("Ejercicio aplicacion");
      la1declaran.setDescription("Codigo de declarante");
      la1muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      la1tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      la1vdaadqinvers.setDescription("Adquisicion vda. habitual: Inversion con derecho deduccion");
      la1vdaadqdedest.setDescription("Adquisicion vda. habitual: Deduccion estatal");
      la1vdaadqdedaut.setDescription("Adquisicion vda. habitual: Deduccion autonomica");
      la1vdaadqfecha.setDescription("Adquisicion vda. habitual: Fecha de adquisicion");
      la1vdaadqpresta.setDescription("Adquisicion vda. habitual: numero de prestamo");
      la1vdaadqporcen.setDescription("Adquisicion vda. habitual: % del prestamo");
      la1vdaconinvers.setDescription("Construccion vda. habitual: Inversion con derecho deduccion");
      la1vdacondedest.setDescription("Construccion vda. habitual: Deduccion estatal");
      la1vdacondedaut.setDescription("Construccion vda. habitual: Deduccion autonomica");
      la1vdaconimppag.setDescription("Construccion vda. habitual: importe pagos realizados");
      la1vdaconnifpro.setDescription("Construccion vda. habitual: NIF del promotor");
      la1vdactainvers.setDescription("Cuenta vda. habitual: Inversion con derecho deduccion");
      la1vdactadedest.setDescription("Cuenta vda. habitual: Deduccion estatal");
      la1vdactadedaut.setDescription("Cuenta vda. habitual: Deduccion autonomica");
      la1vdactatit1.setDescription("Cuenta vda.: titular");
      la1vdactafecha1.setDescription("Cuenta vda.: fecha apertura");
      la1vdactabanco1.setDescription("Cuenta vda.: Banco cuenta vivienda");
      la1vdactaofici1.setDescription("Cuenta vda.: Oficina cuenta vivienda");
      la1vdactadigit1.setDescription("Cuenta vda.: Digito control cta. vivienda");
      la1vdactancta1.setDescription("Cuenta vda.: Numero cuenta vivienda");
      la1vdactatit2.setDescription("Cuenta vda.: titular");
      la1vdactafecha2.setDescription("Cuenta vda.: fecha apertura");
      la1vdactabanco2.setDescription("Cuenta vda.: Banco cuenta vivienda");
      la1vdactaofici2.setDescription("Cuenta vda.: Oficina cuenta vivienda");
      la1vdactadigit2.setDescription("Cuenta vda.: Digito control cta. vivienda");
      la1vdactancta2.setDescription("Cuenta vda.: Numero cuenta vivienda");
      la1vdamininvers.setDescription("Adecuacion vda. minusvalido: Inversion con derecho deduccion");
      la1vdamindedest.setDescription("Adecuacion vda. minusvalido: Deduccion estatal");
      la1vdamindedaut.setDescription("Adecuacion vda. minusvalido: Deduccion autonomica");
      la1vdaalqnif1.setDescription("Alquiler vda. habitual: nif arrendador 1");
      la1vdaalqimpor1.setDescription("Alquiler vda. habitual: cantidad satisfecha arrendador 1");
      la1vdaalqnif2.setDescription("Alquiler vda. habitual: nif arrendador 2");
      la1vdaalqimpor2.setDescription("Alquiler vda. habitual: cantidad satisfecha arrendador 2");
      la1vdaalqbasede.setDescription("Alquiler vda. habitual: cantidad satisfecha con derecho deduccion");
      la1vdaalqdeduc.setDescription("Alquiler vda. habitual: importe deduccion");
      la1don1base.setDescription("Donativos com limite 15%: importe con derecho deduccion");
      la1don1deduc.setDescription("Donativos com limite 15%: importe deduccion");
      la1don2base.setDescription("Donativos com limite 10%: importe con derecho deduccion");
      la1don2deduc.setDescription("Donativos com limite 10%: importe deduccion");
      la1vdamejnif.setDescription("Obras mejora (antes 7/5/11): NIF del que ha efectuado obras");
      la1vdamejinvers.setDescription("Obras mejora (antes 7/5/11): Inversion con derecho deduccion");
      la1vdamejexceso.setDescription("Obras mejora (antes 7/5/11): Exceso sobre base maxima");
      la1bicinversion.setDescription("Deduccion bienes interes cultural: Inversion con derecho deduccion");
      la1bicdeduccion.setDescription("Deduccion bienes interes cultural: Importe de la deduccion");
      la1porcendedaut.setDescription("Porcentaje deduccion autonomica");
      la1porcdedautmi.setDescription("Porcentaje deduccion minusvalido autonomica");
      la1don10base.setDescription("Base donacion al 10%");
      la1don25base.setDescription("Base donacion al 25%");
      la1vdamejinver2.setDescription("2011 Obras mejora (desde 7/5/11):Inversion con derecho deduccion");
      la1vdamejexces2.setDescription("2011 Obras mejora (desde 7/5/11):Exceso sobre base maxima");
      la1vdamejnif2.setDescription("2011 Obras mejora (desde 7/5/11):NIF del que ha efectuado obras");
      la1vdamejrefer2.setDescription("2011 Obras mejora (desde 7/5/11):Referencia catastral");
      la1vdamejrefer.setDescription("2011 Obras mejora (antes 7/5/11):Referencia catastral");
      la1vdamejpartic.setDescription("2011 Obras mejora (antes 7/5/11): % participacion vivienda");
      la1vdamejptotal.setDescription("2011 Obras mejora (antes 7/5/11): % total propiedad vda con derecho deduc.");
      la1vdamejcanant.setDescription("2011 Obras mejora (antes 7/5/11):Cantidades satisfechas pdtes en 2010");
      la1vdamejinvant.setDescription("2011 Obras mejora (antes 7/5/11):Base/Inversion pdtes con derecho 2010");
      la1vdamejdedant.setDescription("2011 Obras mejora (antes 7/5/11):Deduccion pdtes 2010");
      la1vdamejcan.setDescription("2011 Obras mejora (antes 7/5/11):Cantidades satisfechas en 2011");
      la1vdamejinvact.setDescription("2011 Obras mejora (antes 7/5/11):Base/Inversion en  2011");
      la1vdamejdedact.setDescription("2011 Obras mejora (antes 7/5/11):Deduccion en 2011");
      la1vdareainvers.setDescription("Rehabilitacion o ampliacion: Inversion con derecho deduccion");
      la1vdareadedest.setDescription("Rehabilitacion o ampliacion: Deduccion estatal");
      la1vdareadedaut.setDescription("Rehabilitacion o ampliacion: Deduccion autonomica");
      la1encdeduc.setDescription("2013 Deduc    ENC inver.empresas nueva creación (acc o particip)");
      la1encbase.setDescription("2013 Base ded.ENC inver.empresas nueva creación (acc o particip)");
      la1encnif.setDescription("2013 Nif      ENC inver.empresas nueva creación (acc o particip)");
      la1encnif2.setDescription("2013 Nif2     ENC inver.empresas nueva creación (acc o particip)");
      la1encinver.setDescription("2013 Inversio ENC inver.empresas nueva creación (acc o particip)");
      la1vdaalqnif1ex.setDescription("2013 Alquiler vda.hab: arrendador 1 nro identif.pais de residencia");
      la1vdaalqnif2ex.setDescription("2013 Alquiler vda.hab: arrendador 2 nro identif.pais de residencia");
      la1obrascant11.setDescription("Obras mejora (desde 7/5/11):Pdtes 2011:Cantidades");
      la1obrasiant11.setDescription("Obras mejora (desde 7/5/11):Pdtes 2011 Base/Inversion");
      la1obrasdant11.setDescription("Obras mejora (desde 7/5/11):Pdtes 2011 Deduc");
      la1obrascant12.setDescription("Obras mejora (desde 7/5/11):Pdtes 2012:Cantidades");
      la1obrasiant12.setDescription("Obras mejora (desde 7/5/11):Pdtes 2012 Base/Inversion");
      la1obrasdant12.setDescription("Obras mejora (desde 7/5/11):Pdtes 2012 Deduc");
      la1vdamejcanan0.setDescription("Obras mejora (ANTES 7/5/11):Pdtes 2010 Cantidades");
      la1vdamejinvan0.setDescription("Obras mejora (antes 7/5/11):Pdtes 2010 Base/Inversion");
      la1vdamejdedan0.setDescription("Obras mejora (antes 7/5/11):Pdtes 2010 Deduc");
      la1vdamejcanan1.setDescription("Obras mejora (antes 7/5/11):Pdtes 2011 Cantidades");
      la1vdamejinvan1.setDescription("Obras mejora (antes 7/5/11):Pdtes 2011 Base/Inversion");
      la1vdamejdedan1.setDescription("Obras mejora (antes 7/5/11):Pdtes 2011 Deduc");
      }
    }
    
  public class TabActividad extends TableDef
    {
    // Campos
    public FieldDef actejeraplic;
    public FieldDef actdeclaran;
    public FieldDef actidentactiv;
    public FieldDef actdeclaracion;
    public FieldDef actmuf;
    public FieldDef acttipoactiv;
    public FieldDef actestimacion;
    public FieldDef actepigrafe;
    public FieldDef actletra;
    public FieldDef actdescripcion;
    public FieldDef actprovincia;
    public FieldDef actemprejeo;
    public FieldDef actactivjeo;
    public FieldDef actporcentaje;
    public FieldDef actatribucion;
    public FieldDef actcobropago;
    public FieldDef actprorratear;
    public FieldDef actclaveimpres;
    public FieldDef actnifentidad;
    public FieldDef actactivpral;
    public FieldDef actemprejconta;
    public FieldDef actgravaunico;
    public FieldDef actejerednueva;
    public TabActividad(String name)
      {
      super(name);
      actejeraplic = new FieldDef("actejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      actdeclaran = new FieldDef("actdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      actidentactiv = new FieldDef("actidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      actdeclaracion = new FieldDef("actdeclaracion",FieldDef.INTEGER,0);
      actmuf = new FieldDef("actmuf",FieldDef.CHAR,1);
      acttipoactiv = new FieldDef("acttipoactiv",FieldDef.CHAR,1);
      actestimacion = new FieldDef("actestimacion",FieldDef.CHAR,3);
      actepigrafe = new FieldDef("actepigrafe",FieldDef.CHAR,7);
      actletra = new FieldDef("actletra",FieldDef.CHAR,1);
      actdescripcion = new FieldDef("actdescripcion",FieldDef.CHAR,30);
      actprovincia = new FieldDef("actprovincia",FieldDef.INTEGER,0);
      actemprejeo = new FieldDef("actemprejeo",FieldDef.INTEGER,0);
      actactivjeo = new FieldDef("actactivjeo",FieldDef.INTEGER,0);
      actporcentaje = new FieldDef("actporcentaje",FieldDef.FLOAT,6,0);
      actatribucion = new FieldDef("actatribucion",FieldDef.CHAR,1);
      actcobropago = new FieldDef("actcobropago",FieldDef.CHAR,1);
      actprorratear = new FieldDef("actprorratear",FieldDef.CHAR,1);
      actclaveimpres = new FieldDef("actclaveimpres",FieldDef.CHAR,1);
      actnifentidad = new FieldDef("actnifentidad",FieldDef.CHAR,9);
      actactivpral = new FieldDef("actactivpral",FieldDef.CHAR,1);
      actemprejconta = new FieldDef("actemprejconta",FieldDef.INTEGER,0);
      actgravaunico = new FieldDef("actgravaunico",FieldDef.CHAR,1);
      actejerednueva = new FieldDef("actejerednueva",FieldDef.INTEGER,0);
      FieldDef array[] = {
        actejeraplic,
        actdeclaran,
        actidentactiv,
        actdeclaracion,
        actmuf,
        acttipoactiv,
        actestimacion,
        actepigrafe,
        actletra,
        actdescripcion,
        actprovincia,
        actemprejeo,
        actactivjeo,
        actporcentaje,
        actatribucion,
        actcobropago,
        actprorratear,
        actclaveimpres,
        actnifentidad,
        actactivpral,
        actemprejconta,
        actgravaunico,
        actejerednueva        
        };
      setColumns(array);
      FieldDef arrayf[] = {actejeraplic,actdeclaran,actidentactiv };
      setDescription("Datos generales actividades");
      setPrimaryKeys(arrayf);
      actejeraplic.setDescription("Ejercicio aplicacion");
      actdeclaran.setDescription("CODIGO DE DECLARANTE");
      actidentactiv.setDescription("Identificador actividad");
      actdeclaracion.setDescription("Codigo Declaracion");
      actmuf.setDescription("M.U.F.");
      acttipoactiv.setDescription("Actividad");
      actestimacion.setDescription("Regimen Estimacion");
      actepigrafe.setDescription("Epigrafe I.A.E.");
      actletra.setDescription("Letra epigrafe");
      actdescripcion.setDescription("Descripcion");
      actprovincia.setDescription("Provincia");
      actemprejeo.setDescription("Codigo Empresa   jEO");
      actactivjeo.setDescription("Codigo Actividad jEO");
      actporcentaje.setDescription("Porcentaje Propiedad");
      actatribucion.setDescription("Atribucion Rentas");
      actcobropago.setDescription("Imputacion por Cobro-Pago");
      actprorratear.setDescription("Aplicar % propiedad a importes");
      actclaveimpres.setDescription("Clave indicativa actividad");
      actnifentidad.setDescription("NIF entidad atribucion");
      actactivpral.setDescription("Actividad principal jEO");
      actemprejconta.setDescription("Codigo Empresa jCONTA");
      actgravaunico.setDescription("Presentado autoliquidacion gravamen Unico");
      actejerednueva.setDescription("Primer ejer.aplicacio red nova activ.directa art.32.3");
      }
    }
    
  public class TabRdtoactividaeo extends TableDef
    {
    // Campos
    public FieldDef reoejeraplic;
    public FieldDef reodeclaran;
    public FieldDef reoidentactiv;
    public FieldDef reotipomuni;
    public FieldDef reohabitan;
    public FieldDef reovehicul;
    public FieldDef reocarga;
    public FieldDef reolocales;
    public FieldDef reolocalexc;
    public FieldDef reodiastemp;
    public FieldDef reoejerini;
    public FieldDef reofecini;
    public FieldDef reofecfin;
    public FieldDef reonumtracto;
    public FieldDef reonumsemi;
    public FieldDef reounidadant1;
    public FieldDef reounidad1;
    public FieldDef reotipo1;
    public FieldDef reounidadant2;
    public FieldDef reounidad2;
    public FieldDef reotipo2;
    public FieldDef reounidadant3;
    public FieldDef reounidad3;
    public FieldDef reotipo3;
    public FieldDef reounidadant4;
    public FieldDef reounidad4;
    public FieldDef reotipo4;
    public FieldDef reounidadant5;
    public FieldDef reounidad5;
    public FieldDef reotipo5;
    public FieldDef reounidadant6;
    public FieldDef reounidad6;
    public FieldDef reotipo6;
    public FieldDef reounidadant7;
    public FieldDef reounidad7;
    public FieldDef reotipo7;
    public FieldDef reordtoprevio;
    public FieldDef reoempleoirpf;
    public FieldDef reoinversioirpf;
    public FieldDef reordtominorado;
    public FieldDef reoindespecial;
    public FieldDef reoindpeqdim;
    public FieldDef reotemporada;
    public FieldDef reoexceso;
    public FieldDef reonueva;
    public FieldDef reordtonetomodu;
    public FieldDef reoredda2;
    public FieldDef reogastextraor;
    public FieldDef reootraspercep;
    public FieldDef reordtoactivid;
    public FieldDef reoaplicirreg;
    public FieldDef reoredirregular;
    public FieldDef reoimpredirregu;
    public FieldDef reordtonetoredu;
    public FieldDef reoaplredempleo;
    public FieldDef reosalarios;
    public FieldDef reoapliclorca;
    public FieldDef reoimpredlorca;
    public FieldDef reonumtrab;
    public TabRdtoactividaeo(String name)
      {
      super(name);
      reoejeraplic = new FieldDef("reoejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      reodeclaran = new FieldDef("reodeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      reoidentactiv = new FieldDef("reoidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      reotipomuni = new FieldDef("reotipomuni",FieldDef.CHAR,1);
      reohabitan = new FieldDef("reohabitan",FieldDef.CHAR,2);
      reovehicul = new FieldDef("reovehicul",FieldDef.INTEGER,0);
      reocarga = new FieldDef("reocarga",FieldDef.CHAR,1);
      reolocales = new FieldDef("reolocales",FieldDef.INTEGER,0);
      reolocalexc = new FieldDef("reolocalexc",FieldDef.CHAR,1);
      reodiastemp = new FieldDef("reodiastemp",FieldDef.INTEGER,0);
      reoejerini = new FieldDef("reoejerini",FieldDef.INTEGER,0);
      reofecini = new FieldDef("reofecini",FieldDef.DATE);
      reofecfin = new FieldDef("reofecfin",FieldDef.DATE);
      reonumtracto = new FieldDef("reonumtracto",FieldDef.INTEGER,0);
      reonumsemi = new FieldDef("reonumsemi",FieldDef.INTEGER,0);
      reounidadant1 = new FieldDef("reounidadant1",FieldDef.FLOAT,6,0);
      reounidad1 = new FieldDef("reounidad1",FieldDef.FLOAT,6,0);
      reotipo1 = new FieldDef("reotipo1",FieldDef.CHAR,3);
      reounidadant2 = new FieldDef("reounidadant2",FieldDef.FLOAT,6,0);
      reounidad2 = new FieldDef("reounidad2",FieldDef.FLOAT,6,0);
      reotipo2 = new FieldDef("reotipo2",FieldDef.CHAR,3);
      reounidadant3 = new FieldDef("reounidadant3",FieldDef.FLOAT,6,0);
      reounidad3 = new FieldDef("reounidad3",FieldDef.FLOAT,6,0);
      reotipo3 = new FieldDef("reotipo3",FieldDef.CHAR,3);
      reounidadant4 = new FieldDef("reounidadant4",FieldDef.FLOAT,6,0);
      reounidad4 = new FieldDef("reounidad4",FieldDef.FLOAT,6,0);
      reotipo4 = new FieldDef("reotipo4",FieldDef.CHAR,3);
      reounidadant5 = new FieldDef("reounidadant5",FieldDef.FLOAT,6,0);
      reounidad5 = new FieldDef("reounidad5",FieldDef.FLOAT,6,0);
      reotipo5 = new FieldDef("reotipo5",FieldDef.CHAR,3);
      reounidadant6 = new FieldDef("reounidadant6",FieldDef.FLOAT,6,0);
      reounidad6 = new FieldDef("reounidad6",FieldDef.FLOAT,6,0);
      reotipo6 = new FieldDef("reotipo6",FieldDef.CHAR,3);
      reounidadant7 = new FieldDef("reounidadant7",FieldDef.FLOAT,6,0);
      reounidad7 = new FieldDef("reounidad7",FieldDef.FLOAT,6,0);
      reotipo7 = new FieldDef("reotipo7",FieldDef.CHAR,3);
      reordtoprevio = new FieldDef("reordtoprevio",FieldDef.FLOAT,6,0);
      reoempleoirpf = new FieldDef("reoempleoirpf",FieldDef.FLOAT,6,0);
      reoinversioirpf = new FieldDef("reoinversioirpf",FieldDef.FLOAT,6,0);
      reordtominorado = new FieldDef("reordtominorado",FieldDef.FLOAT,6,0);
      reoindespecial = new FieldDef("reoindespecial",FieldDef.FLOAT,6,0);
      reoindpeqdim = new FieldDef("reoindpeqdim",FieldDef.FLOAT,6,0);
      reotemporada = new FieldDef("reotemporada",FieldDef.FLOAT,6,0);
      reoexceso = new FieldDef("reoexceso",FieldDef.FLOAT,6,0);
      reonueva = new FieldDef("reonueva",FieldDef.FLOAT,6,0);
      reordtonetomodu = new FieldDef("reordtonetomodu",FieldDef.FLOAT,6,0);
      reoredda2 = new FieldDef("reoredda2",FieldDef.FLOAT,6,0);
      reogastextraor = new FieldDef("reogastextraor",FieldDef.FLOAT,6,0);
      reootraspercep = new FieldDef("reootraspercep",FieldDef.FLOAT,6,0);
      reordtoactivid = new FieldDef("reordtoactivid",FieldDef.FLOAT,6,0);
      reoaplicirreg = new FieldDef("reoaplicirreg",FieldDef.CHAR,1);
      reoredirregular = new FieldDef("reoredirregular",FieldDef.INTEGER,0);
      reoimpredirregu = new FieldDef("reoimpredirregu",FieldDef.FLOAT,6,0);
      reordtonetoredu = new FieldDef("reordtonetoredu",FieldDef.FLOAT,6,0);
      reoaplredempleo = new FieldDef("reoaplredempleo",FieldDef.CHAR,1);
      reosalarios = new FieldDef("reosalarios",FieldDef.FLOAT,6,0);
      reoapliclorca = new FieldDef("reoapliclorca",FieldDef.CHAR,1);
      reoimpredlorca = new FieldDef("reoimpredlorca",FieldDef.FLOAT,6,0);
      reonumtrab = new FieldDef("reonumtrab",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        reoejeraplic,
        reodeclaran,
        reoidentactiv,
        reotipomuni,
        reohabitan,
        reovehicul,
        reocarga,
        reolocales,
        reolocalexc,
        reodiastemp,
        reoejerini,
        reofecini,
        reofecfin,
        reonumtracto,
        reonumsemi,
        reounidadant1,
        reounidad1,
        reotipo1,
        reounidadant2,
        reounidad2,
        reotipo2,
        reounidadant3,
        reounidad3,
        reotipo3,
        reounidadant4,
        reounidad4,
        reotipo4,
        reounidadant5,
        reounidad5,
        reotipo5,
        reounidadant6,
        reounidad6,
        reotipo6,
        reounidadant7,
        reounidad7,
        reotipo7,
        reordtoprevio,
        reoempleoirpf,
        reoinversioirpf,
        reordtominorado,
        reoindespecial,
        reoindpeqdim,
        reotemporada,
        reoexceso,
        reonueva,
        reordtonetomodu,
        reoredda2,
        reogastextraor,
        reootraspercep,
        reordtoactivid,
        reoaplicirreg,
        reoredirregular,
        reoimpredirregu,
        reordtonetoredu,
        reoaplredempleo,
        reosalarios,
        reoapliclorca,
        reoimpredlorca,
        reonumtrab        
        };
      setColumns(array);
      FieldDef arrayf[] = {reoejeraplic,reodeclaran,reoidentactiv };
      setDescription("Rendimiento actividades EO no agricola");
      setPrimaryKeys(arrayf);
      reoejeraplic.setDescription("Ejercicio aplicacion");
      reodeclaran.setDescription("CODIGO DE DECLARANTE");
      reoidentactiv.setDescription("Identificador actividad");
      reotipomuni.setDescription("Tipo municipio");
      reohabitan.setDescription("Habitantes");
      reovehicul.setDescription("Numero vehiculos");
      reocarga.setDescription("Carga superior a 1 tonelada");
      reolocales.setDescription("Numero locales");
      reolocalexc.setDescription("Local exclusivo actividad");
      reodiastemp.setDescription("Dias temporada");
      reoejerini.setDescription("Ejercicio inicio");
      reofecini.setDescription("Fecha inicio temporada");
      reofecfin.setDescription("Fecha fin temporada");
      reonumtracto.setDescription("Numero tractocamiones");
      reonumsemi.setDescription("Numero semiremolques");
      reounidadant1.setDescription("Unidades modulo 1 ejer.anterior");
      reounidad1.setDescription("Unidades modulo 1 ejer.actual");
      reotipo1.setDescription("Tipo unidad modulo 1");
      reounidadant2.setDescription("Unidades modulo 2 ejer.anterior");
      reounidad2.setDescription("Unidades modulo 2 ejer.actual");
      reotipo2.setDescription("Tipo unidad modulo 2");
      reounidadant3.setDescription("Unidades modulo 3 ejer.anterior");
      reounidad3.setDescription("Unidades modulo 3 ejer.actual");
      reotipo3.setDescription("Tipo unidad modulo 3");
      reounidadant4.setDescription("Unidades modulo 4 ejer.anterior");
      reounidad4.setDescription("Unidades modulo 4 ejer.actual");
      reotipo4.setDescription("Tipo unidad modulo 4");
      reounidadant5.setDescription("Unidades modulo 5 ejer.anterior");
      reounidad5.setDescription("Unidades modulo 5 ejer.actual");
      reotipo5.setDescription("Tipo unidad modulo 5");
      reounidadant6.setDescription("Unidades modulo 6 ejer.anterior");
      reounidad6.setDescription("Unidades modulo 6 ejer.actual");
      reotipo6.setDescription("Tipo unidad modulo 6");
      reounidadant7.setDescription("Unidades modulo 7 ejer.anterior");
      reounidad7.setDescription("Unidades modulo 7 ejer.actual");
      reotipo7.setDescription("Tipo unidad modulo 7");
      reordtoprevio.setDescription("Rendimiento neto previo");
      reoempleoirpf.setDescription("Minoracion incentivo al empleo");
      reoinversioirpf.setDescription("Minoracion por incentivo a la inversion");
      reordtominorado.setDescription("Rendimiento neto minorado");
      reoindespecial.setDescription("Indice corrector especial");
      reoindpeqdim.setDescription("Indice corrector empresa pequeña dimension");
      reotemporada.setDescription("Indice corrector temporada");
      reoexceso.setDescription("Indice corrector exceso rendimiento");
      reonueva.setDescription("Indice corrector inicio nueva actividad");
      reordtonetomodu.setDescription("Rendimiento neto de modulos");
      reoredda2.setDescription("Reductor caracter general");
      reogastextraor.setDescription("Gastos extraordinarios");
      reootraspercep.setDescription("Otras percepciones empresariales");
      reordtoactivid.setDescription("Rendimiento neto actividad");
      reoaplicirreg.setDescription("Aplicar reduccion irregular");
      reoredirregular.setDescription("% reductor irregular");
      reoimpredirregu.setDescription("Importe reduccion irregular");
      reordtonetoredu.setDescription("Rendimiento neto reducido");
      reoaplredempleo.setDescription("Aplicar reduc. creacion empleo");
      reosalarios.setDescription("Importe salarios");
      reoapliclorca.setDescription("Aplicar reduccion Lorca");
      reoimpredlorca.setDescription("Importe reduccion Lorca");
      reonumtrab.setDescription("Nro.trabajadores simultaneos x Ind.Peq.dimension");
      }
    }
    
  public class TabAeatganancias extends TableDef
    {
    // Campos
    public FieldDef agaejeraplic;
    public FieldDef agadeclaran;
    public FieldDef agamuf;
    public FieldDef agacontador;
    public FieldDef againcorporar;
    public FieldDef agadeclaracion;
    public FieldDef agatipo;
    public FieldDef aganif;
    public FieldDef agadescripcion;
    public FieldDef agaganancia;
    public FieldDef agaretencion;
    public FieldDef agareten_a_cta;
    public FieldDef agaejerpermanen;
    public FieldDef agafechatransmi;
    public FieldDef agavalortransmi;
    public FieldDef agatitulares;
    public FieldDef agaredirregular;
    public FieldDef agacontvinculad;
    public FieldDef agabaseintegrac;
    public FieldDef agacodigoorigen;
    public TabAeatganancias(String name)
      {
      super(name);
      agaejeraplic = new FieldDef("agaejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      agadeclaran = new FieldDef("agadeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      agamuf = new FieldDef("agamuf",FieldDef.CHAR,1);
      agacontador = new FieldDef("agacontador",FieldDef.INTEGER,0);
      againcorporar = new FieldDef("againcorporar",FieldDef.CHAR,1);
      agadeclaracion = new FieldDef("agadeclaracion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      agatipo = new FieldDef("agatipo",FieldDef.CHAR,3);
      aganif = new FieldDef("aganif",FieldDef.CHAR,9);
      agadescripcion = new FieldDef("agadescripcion",FieldDef.CHAR,50);
      agaganancia = new FieldDef("agaganancia",FieldDef.FLOAT,6,0);
      agaretencion = new FieldDef("agaretencion",FieldDef.FLOAT,6,0);
      agareten_a_cta = new FieldDef("agareten_a_cta",FieldDef.FLOAT,6,0);
      agaejerpermanen = new FieldDef("agaejerpermanen",FieldDef.INTEGER,0);
      agafechatransmi = new FieldDef("agafechatransmi",FieldDef.DATE);
      agavalortransmi = new FieldDef("agavalortransmi",FieldDef.FLOAT,6,0);
      agatitulares = new FieldDef("agatitulares",FieldDef.INTEGER,0);
      agaredirregular = new FieldDef("agaredirregular",FieldDef.FLOAT,6,0);
      agacontvinculad = new FieldDef("agacontvinculad",FieldDef.INTEGER,0);
      agabaseintegrac = new FieldDef("agabaseintegrac",FieldDef.CHAR,1);
      agacodigoorigen = new FieldDef("agacodigoorigen",FieldDef.CHAR,3);
      FieldDef array[] = {
        agaejeraplic,
        agadeclaran,
        agamuf,
        agacontador,
        againcorporar,
        agadeclaracion,
        agatipo,
        aganif,
        agadescripcion,
        agaganancia,
        agaretencion,
        agareten_a_cta,
        agaejerpermanen,
        agafechatransmi,
        agavalortransmi,
        agatitulares,
        agaredirregular,
        agacontvinculad,
        agabaseintegrac,
        agacodigoorigen        
        };
      setColumns(array);
      FieldDef arrayf[] = {agaejeraplic,agadeclaran,agamuf,agacontador };
      setDescription("Datos fiscales: ganancias y perdidas patrimoniales");
      setPrimaryKeys(arrayf);
      agaejeraplic.setDescription("Ejercicio aplicacion");
      agadeclaran.setDescription("CODIGO DE DECLARANTE");
      agamuf.setDescription("MIEMBRO UNIDAD FAMILIAR");
      agacontador.setDescription("CONTADOR");
      againcorporar.setDescription("Incorporar a renta");
      agadeclaracion.setDescription("Codigo declaracion");
      agatipo.setDescription("Tipo de ganancia");
      aganif.setDescription("Nif");
      agadescripcion.setDescription("Descripcion");
      agaganancia.setDescription("Ganancia/Perdida");
      agaretencion.setDescription("Importe de la retencion");
      agareten_a_cta.setDescription("Ingreso a cta repercutido");
      agaejerpermanen.setDescription("Años permanencia");
      agafechatransmi.setDescription("Fecha transmision");
      agavalortransmi.setDescription("Valor de transmision");
      agatitulares.setDescription("Nro. de titulares");
      agaredirregular.setDescription("Reduccion irregular");
      agacontvinculad.setDescription("Contador relacionado aplicacion GEYCE");
      agabaseintegrac.setDescription("Base de integracion G-Gral <=1 any / A-Ahorro >1any");
      agacodigoorigen.setDescription("Tipo origen AEAT");
      }
    }
    
  public class TabTrabajopersonal extends TableDef
    {
    // Campos
    public FieldDef traejeraplic;
    public FieldDef tradeclaran;
    public FieldDef tracontador;
    public FieldDef tradeclaracion;
    public FieldDef tramuf;
    public FieldDef traclase;
    public FieldDef trasubclase;
    public FieldDef tranifentidad;
    public FieldDef traentidad;
    public FieldDef trarendimiento;
    public FieldDef traretencion;
    public FieldDef travaloracion;
    public FieldDef traingracuenta;
    public FieldDef traingctarep;
    public FieldDef traretesp;
    public FieldDef traplanpension;
    public FieldDef traregaportacio;
    public FieldDef trapatrimproteg;
    public FieldDef trasegsoc;
    public FieldDef traderechopasiv;
    public FieldDef tracolhuerf;
    public FieldDef trasindicatos;
    public FieldDef tracoleg_profes;
    public FieldDef tradefensajurid;
    public FieldDef tratipo_ingreso;
    public FieldDef traminusvalido;
    public FieldDef traprolonactivi;
    public FieldDef tramovilgeograf;
    public FieldDef traporcen_reduc;
    public FieldDef trabaseredirreg;
    public FieldDef traredirregular;
    public FieldDef trareductoramer;
    public FieldDef trabaseredcopaa;
    public FieldDef traredcopaameri;
    public FieldDef tracatastral;
    public FieldDef traactualizado;
    public FieldDef tracostevehi;
    public FieldDef trafechaent;
    public FieldDef tramatricula;
    public FieldDef traamortacum;
    public FieldDef tracoefvalor;
    public FieldDef trameses;
    public FieldDef traespecievda;
    public FieldDef tracontador2;
    public FieldDef trapagounico;
    public FieldDef trairregcese;
    public FieldDef tradependencia;
    public FieldDef traenlace190;
    public TabTrabajopersonal(String name)
      {
      super(name);
      traejeraplic = new FieldDef("traejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tradeclaran = new FieldDef("tradeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      tracontador = new FieldDef("tracontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tradeclaracion = new FieldDef("tradeclaracion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tramuf = new FieldDef("tramuf",FieldDef.CHAR,1);
      traclase = new FieldDef("traclase",FieldDef.CHAR,3);
      trasubclase = new FieldDef("trasubclase",FieldDef.CHAR,3);
      tranifentidad = new FieldDef("tranifentidad",FieldDef.CHAR,15);
      traentidad = new FieldDef("traentidad",FieldDef.CHAR,30);
      trarendimiento = new FieldDef("trarendimiento",FieldDef.FLOAT,6,0);
      traretencion = new FieldDef("traretencion",FieldDef.FLOAT,6,0);
      travaloracion = new FieldDef("travaloracion",FieldDef.FLOAT,6,0);
      traingracuenta = new FieldDef("traingracuenta",FieldDef.FLOAT,6,0);
      traingctarep = new FieldDef("traingctarep",FieldDef.FLOAT,6,0);
      traretesp = new FieldDef("traretesp",FieldDef.CHAR,1);
      traplanpension = new FieldDef("traplanpension",FieldDef.FLOAT,6,0);
      traregaportacio = new FieldDef("traregaportacio",FieldDef.INTEGER,0);
      trapatrimproteg = new FieldDef("trapatrimproteg",FieldDef.FLOAT,6,0);
      trasegsoc = new FieldDef("trasegsoc",FieldDef.FLOAT,6,0);
      traderechopasiv = new FieldDef("traderechopasiv",FieldDef.FLOAT,6,0);
      tracolhuerf = new FieldDef("tracolhuerf",FieldDef.FLOAT,6,0);
      trasindicatos = new FieldDef("trasindicatos",FieldDef.FLOAT,6,0);
      tracoleg_profes = new FieldDef("tracoleg_profes",FieldDef.FLOAT,6,0);
      tradefensajurid = new FieldDef("tradefensajurid",FieldDef.FLOAT,6,0);
      tratipo_ingreso = new FieldDef("tratipo_ingreso",FieldDef.CHAR,1);
      traminusvalido = new FieldDef("traminusvalido",FieldDef.CHAR,1);
      traprolonactivi = new FieldDef("traprolonactivi",FieldDef.CHAR,1);
      tramovilgeograf = new FieldDef("tramovilgeograf",FieldDef.CHAR,1);
      traporcen_reduc = new FieldDef("traporcen_reduc",FieldDef.INTEGER,0);
      trabaseredirreg = new FieldDef("trabaseredirreg",FieldDef.FLOAT,6,0);
      traredirregular = new FieldDef("traredirregular",FieldDef.FLOAT,6,0);
      trareductoramer = new FieldDef("trareductoramer",FieldDef.INTEGER,0);
      trabaseredcopaa = new FieldDef("trabaseredcopaa",FieldDef.FLOAT,6,0);
      traredcopaameri = new FieldDef("traredcopaameri",FieldDef.FLOAT,6,0);
      tracatastral = new FieldDef("tracatastral",FieldDef.FLOAT,6,0);
      traactualizado = new FieldDef("traactualizado",FieldDef.CHAR,1);
      tracostevehi = new FieldDef("tracostevehi",FieldDef.FLOAT,6,0);
      trafechaent = new FieldDef("trafechaent",FieldDef.DATE);
      tramatricula = new FieldDef("tramatricula",FieldDef.CHAR,12);
      traamortacum = new FieldDef("traamortacum",FieldDef.FLOAT,6,0);
      tracoefvalor = new FieldDef("tracoefvalor",FieldDef.FLOAT,6,0);
      trameses = new FieldDef("trameses",FieldDef.FLOAT,6,0);
      traespecievda = new FieldDef("traespecievda",FieldDef.CHAR,1);
      tracontador2 = new FieldDef("tracontador2",FieldDef.CHAR,15);
      trapagounico = new FieldDef("trapagounico",FieldDef.CHAR,1);
      trairregcese = new FieldDef("trairregcese",FieldDef.CHAR,1);
      tradependencia = new FieldDef("tradependencia",FieldDef.FLOAT,6,0);
      traenlace190 = new FieldDef("traenlace190",FieldDef.CHAR,1);
      FieldDef array[] = {
        traejeraplic,
        tradeclaran,
        tracontador,
        tradeclaracion,
        tramuf,
        traclase,
        trasubclase,
        tranifentidad,
        traentidad,
        trarendimiento,
        traretencion,
        travaloracion,
        traingracuenta,
        traingctarep,
        traretesp,
        traplanpension,
        traregaportacio,
        trapatrimproteg,
        trasegsoc,
        traderechopasiv,
        tracolhuerf,
        trasindicatos,
        tracoleg_profes,
        tradefensajurid,
        tratipo_ingreso,
        traminusvalido,
        traprolonactivi,
        tramovilgeograf,
        traporcen_reduc,
        trabaseredirreg,
        traredirregular,
        trareductoramer,
        trabaseredcopaa,
        traredcopaameri,
        tracatastral,
        traactualizado,
        tracostevehi,
        trafechaent,
        tramatricula,
        traamortacum,
        tracoefvalor,
        trameses,
        traespecievda,
        tracontador2,
        trapagounico,
        trairregcese,
        tradependencia,
        traenlace190        
        };
      setColumns(array);
      FieldDef arrayf[] = {traejeraplic,tradeclaran,tracontador };
      setDescription("Datos trabajo personal");
      setPrimaryKeys(arrayf);
      traejeraplic.setDescription("Ejercicio aplicacion");
      tradeclaran.setDescription("CODIGO DE DECLARANTE");
      tradeclaracion.setDescription("Codigo declaracion");
      tramuf.setDescription("Miembro unidad familiar");
      traclase.setDescription("Clase Retribucion");
      trasubclase.setDescription("Desglose clase");
      tranifentidad.setDescription("CIF Entidad Pagadora");
      traentidad.setDescription("Persona o Entidad Pagadora");
      trarendimiento.setDescription("Rendimiento");
      traretencion.setDescription("Retenciones");
      travaloracion.setDescription("Valoracion en especie");
      traingracuenta.setDescription("Ingreso a cuenta");
      traingctarep.setDescription("Ingreso a Cuenta Repercutido");
      traretesp.setDescription("Retenciones Especies Sumadas");
      traplanpension.setDescription("Contribucion promotor");
      traregaportacio.setDescription("Regimen aport. plan pensiones");
      trapatrimproteg.setDescription("Aport.patrimonio protegido");
      trasegsoc.setDescription("Seguridad Social");
      traderechopasiv.setDescription("Detracciones derechos pasivos");
      tracolhuerf.setDescription("Cotizac. colegio de huerfanos");
      trasindicatos.setDescription("Cuotas satisfechas sindicatos");
      tracoleg_profes.setDescription("Cuotas colegios profesionales");
      tradefensajurid.setDescription("Gastos de defensa juridica");
      tratipo_ingreso.setDescription("Tipo de ingreso: Renta-Capital-Irreg");
      traminusvalido.setDescription("Trabajador en activo minusvalido");
      traprolonactivi.setDescription("Prolongacion actividad profesional");
      tramovilgeograf.setDescription("Movilidad geografica");
      traporcen_reduc.setDescription("Reduccion");
      trabaseredirreg.setDescription("Base reduccion irregular");
      traredirregular.setDescription("Importe reduc. rdto. irregular");
      trareductoramer.setDescription("% reductor Copa America");
      trabaseredcopaa.setDescription("Base reduccion Copa America");
      traredcopaameri.setDescription("Reduccion Copa America");
      tracatastral.setDescription("Valor Catastral");
      traactualizado.setDescription("Actualizado");
      tracostevehi.setDescription("Coste Vehiculo");
      trafechaent.setDescription("Fecha Entrega");
      tramatricula.setDescription("Matricula");
      traamortacum.setDescription("Amortizacion Acumulada");
      tracoefvalor.setDescription("Coeficiente Valoracion");
      trameses.setDescription("Meses permanencia vivienda");
      traespecievda.setDescription("Retencion en especie por concepto vivienda");
      tracontador2.setDescription("Necesario para traspaso renta");
      trapagounico.setDescription("Derecho a exencion pago unico");
      trairregcese.setDescription("Rdto irregular por cese actividad laboral");
      tradependencia.setDescription("Contribuc. empre.seguros colectivos dependencia");
      traenlace190.setDescription("Enlazado del 190");
      }
    }
    
  public class TabDeducciones extends TableDef
    {
    // Campos
    public FieldDef dedejeraplic;
    public FieldDef deddeclaran;
    public FieldDef dedestatauton;
    public FieldDef dedtipo;
    public FieldDef dedcontador;
    public FieldDef deddeclaracion;
    public FieldDef dedmuf;
    public FieldDef dednif;
    public FieldDef deddescripcion;
    public FieldDef dedimporte;
    public FieldDef dedporcentaje;
    public FieldDef deddeduccion;
    public FieldDef dedbanco;
    public FieldDef dedoficina;
    public FieldDef deddigcontrol;
    public FieldDef dednrocuenta;
    public FieldDef dedfecapertura;
    public FieldDef dednrohijos;
    public FieldDef dedejerdeduc;
    public FieldDef deddeclarorigen;
    public FieldDef dedfechavto;
    public FieldDef dedfecpresentar;
    public FieldDef dedcantcobrada;
    public FieldDef deddomiactual;
    public FieldDef dedprimeravda;
    public FieldDef dedvdaprotegida;
    public FieldDef dedabononac;
    public FieldDef dedsrnubicacio;
    public FieldDef dedsrnibi;
    public FieldDef dedsrnhectareas;
    public FieldDef dednroprestamo;
    public FieldDef dedcodmuni;
    public FieldDef dedconvive;
    public FieldDef dednhijos2;
    public FieldDef dedcantcobrada2;
    public FieldDef dedfecadq;
    public FieldDef dedregaportacio;
    public FieldDef dedporparticip;
    public FieldDef dedportotal;
    public FieldDef dednrovda;
    public FieldDef dedfecmejora;
    public FieldDef dedrefmejora;
    public FieldDef dedsinref;
    public FieldDef dedfecaltacenso;
    public FieldDef dedfecvisado;
    public FieldDef dednifext;
    public FieldDef dedtipodii;
    public TabDeducciones(String name)
      {
      super(name);
      dedejeraplic = new FieldDef("dedejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      deddeclaran = new FieldDef("deddeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dedestatauton = new FieldDef("dedestatauton",FieldDef.CHAR,1,FieldDef.NOTNULL);
      dedtipo = new FieldDef("dedtipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      dedcontador = new FieldDef("dedcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      deddeclaracion = new FieldDef("deddeclaracion",FieldDef.INTEGER,0);
      dedmuf = new FieldDef("dedmuf",FieldDef.CHAR,6);
      dednif = new FieldDef("dednif",FieldDef.CHAR,15);
      deddescripcion = new FieldDef("deddescripcion",FieldDef.CHAR,35);
      dedimporte = new FieldDef("dedimporte",FieldDef.FLOAT,6,0);
      dedporcentaje = new FieldDef("dedporcentaje",FieldDef.FLOAT,6,0);
      deddeduccion = new FieldDef("deddeduccion",FieldDef.FLOAT,6,0);
      dedbanco = new FieldDef("dedbanco",FieldDef.INTEGER,0);
      dedoficina = new FieldDef("dedoficina",FieldDef.INTEGER,0);
      deddigcontrol = new FieldDef("deddigcontrol",FieldDef.INTEGER,0);
      dednrocuenta = new FieldDef("dednrocuenta",FieldDef.CHAR,10);
      dedfecapertura = new FieldDef("dedfecapertura",FieldDef.DATE);
      dednrohijos = new FieldDef("dednrohijos",FieldDef.INTEGER,0);
      dedejerdeduc = new FieldDef("dedejerdeduc",FieldDef.INTEGER,0);
      deddeclarorigen = new FieldDef("deddeclarorigen",FieldDef.CHAR,1);
      dedfechavto = new FieldDef("dedfechavto",FieldDef.DATE);
      dedfecpresentar = new FieldDef("dedfecpresentar",FieldDef.DATE);
      dedcantcobrada = new FieldDef("dedcantcobrada",FieldDef.FLOAT,6,0);
      deddomiactual = new FieldDef("deddomiactual",FieldDef.CHAR,1);
      dedprimeravda = new FieldDef("dedprimeravda",FieldDef.CHAR,1);
      dedvdaprotegida = new FieldDef("dedvdaprotegida",FieldDef.CHAR,1);
      dedabononac = new FieldDef("dedabononac",FieldDef.FLOAT,6,0);
      dedsrnubicacio = new FieldDef("dedsrnubicacio",FieldDef.CHAR,1);
      dedsrnibi = new FieldDef("dedsrnibi",FieldDef.FLOAT,6,0);
      dedsrnhectareas = new FieldDef("dedsrnhectareas",FieldDef.FLOAT,6,0);
      dednroprestamo = new FieldDef("dednroprestamo",FieldDef.CHAR,20);
      dedcodmuni = new FieldDef("dedcodmuni",FieldDef.INTEGER,0);
      dedconvive = new FieldDef("dedconvive",FieldDef.INTEGER,0);
      dednhijos2 = new FieldDef("dednhijos2",FieldDef.INTEGER,0);
      dedcantcobrada2 = new FieldDef("dedcantcobrada2",FieldDef.FLOAT,6,0);
      dedfecadq = new FieldDef("dedfecadq",FieldDef.DATE);
      dedregaportacio = new FieldDef("dedregaportacio",FieldDef.INTEGER,0);
      dedporparticip = new FieldDef("dedporparticip",FieldDef.FLOAT,6,0);
      dedportotal = new FieldDef("dedportotal",FieldDef.FLOAT,6,0);
      dednrovda = new FieldDef("dednrovda",FieldDef.INTEGER,0);
      dedfecmejora = new FieldDef("dedfecmejora",FieldDef.DATE);
      dedrefmejora = new FieldDef("dedrefmejora",FieldDef.CHAR,20);
      dedsinref = new FieldDef("dedsinref",FieldDef.CHAR,1);
      dedfecaltacenso = new FieldDef("dedfecaltacenso",FieldDef.DATE);
      dedfecvisado = new FieldDef("dedfecvisado",FieldDef.DATE);
      dednifext = new FieldDef("dednifext",FieldDef.CHAR,25);
      dedtipodii = new FieldDef("dedtipodii",FieldDef.INTEGER,0);
      FieldDef array[] = {
        dedejeraplic,
        deddeclaran,
        dedestatauton,
        dedtipo,
        dedcontador,
        deddeclaracion,
        dedmuf,
        dednif,
        deddescripcion,
        dedimporte,
        dedporcentaje,
        deddeduccion,
        dedbanco,
        dedoficina,
        deddigcontrol,
        dednrocuenta,
        dedfecapertura,
        dednrohijos,
        dedejerdeduc,
        deddeclarorigen,
        dedfechavto,
        dedfecpresentar,
        dedcantcobrada,
        deddomiactual,
        dedprimeravda,
        dedvdaprotegida,
        dedabononac,
        dedsrnubicacio,
        dedsrnibi,
        dedsrnhectareas,
        dednroprestamo,
        dedcodmuni,
        dedconvive,
        dednhijos2,
        dedcantcobrada2,
        dedfecadq,
        dedregaportacio,
        dedporparticip,
        dedportotal,
        dednrovda,
        dedfecmejora,
        dedrefmejora,
        dedsinref,
        dedfecaltacenso,
        dedfecvisado,
        dednifext,
        dedtipodii        
        };
      setColumns(array);
      FieldDef arrayf[] = {dedejeraplic,deddeclaran,dedestatauton,dedtipo,dedcontador };
      setDescription("Deducciones y aportaciones planes pensiones");
      setPrimaryKeys(arrayf);
      dedejeraplic.setDescription("Ejercicio aplicacion");
      deddeclaran.setDescription("CODIGO DE DECLARANTE");
      dedestatauton.setDescription("[E]statal, [A]utonomica");
      dedtipo.setDescription("Tipo deduccion");
      dedcontador.setDescription("Contador");
      deddeclaracion.setDescription("Codigo Declaracion");
      dedmuf.setDescription("M.U.F.");
      dednif.setDescription("N.I.F.");
      deddescripcion.setDescription("Descripcion");
      dedimporte.setDescription("Importe");
      dedporcentaje.setDescription("Porcentaje Deduccion");
      deddeduccion.setDescription("Importe Deduccion");
      dedbanco.setDescription("Banco cuenta vivienda");
      dedoficina.setDescription("Oficina cuenta vivienda");
      deddigcontrol.setDescription("Digito control cta. vivienda");
      dednrocuenta.setDescription("Numero cuenta vivienda");
      dedfecapertura.setDescription("Fecha apertura cta. vivienda");
      dednrohijos.setDescription("Numero de hijos");
      dedejerdeduc.setDescription("Ejercicio de la deduccion");
      deddeclarorigen.setDescription("Declarac.positiva o negativa");
      dedfechavto.setDescription("Fecha vcto.plazo o devolucion");
      dedfecpresentar.setDescription("Fecha presentar declaracion");
      dedcantcobrada.setDescription("Cantidad percibida  Maternidad");
      deddomiactual.setDescription("Domicilio actual");
      dedprimeravda.setDescription("Primera vivenda");
      dedvdaprotegida.setDescription("Vivienda protegida");
      dedabononac.setDescription("Cantidad percibida");
      dedsrnubicacio.setDescription("Situado parque,reserva natural");
      dedsrnibi.setDescription("I.B.I de naturaleza rustica");
      dedsrnhectareas.setDescription("Hectareas de extension finca");
      dednroprestamo.setDescription("Identificador prestamo");
      dedcodmuni.setDescription("Municipio");
      dedconvive.setDescription("Dias de convivencia");
      dednhijos2.setDescription("Nro. de menores");
      dedcantcobrada2.setDescription("Cantidad percibida  Nacimiento");
      dedfecadq.setDescription("Fecha adquisicion vivienda");
      dedregaportacio.setDescription("Regimen aport. plan pensiones: 1 General, 2 Minusvalido");
      dedporparticip.setDescription("Porcentaje participación vivienda");
      dedportotal.setDescription("Porcentaje total propiedad vivienda");
      dednrovda.setDescription("Nro. identificativo de la vivienda");
      dedfecmejora.setDescription("Fecha en que se han efectuado las mejora");
      dedrefmejora.setDescription("Referencia catastral");
      dedsinref.setDescription("Marca de sin referencia (Andalucia alquiler )");
      dedfecaltacenso.setDescription("Fecha alta en el censo  (Cast-Leon autoempleo joves i autonoms)");
      dedfecvisado.setDescription("Cast-Leon  Fecha de visado del proyecto. VI2 1a vda.hab.de nueva construc");
      dednifext.setDescription("Nro identificativo en pais de residencia (pensione conyuge...)");
      dedtipodii.setDescription("Tipo Ded.Doble Imp.Internac base gral: 1-Trabajo 2-E.Directa, 3-Otros");
      }
    }
    
  public class TabLiquidaapartc extends TableDef
    {
    // Campos
    public FieldDef licejeraplic;
    public FieldDef licdeclaran;
    public FieldDef licmuf;
    public FieldDef lictipocalculo;
    public FieldDef licninmueble;
    public FieldDef lictitular;
    public FieldDef liccopropiedad;
    public FieldDef licnaturaleza;
    public FieldDef licdestino;
    public FieldDef licsituacion;
    public FieldDef licreferencia;
    public FieldDef licdisposicion;
    public FieldDef licdias;
    public FieldDef licimputacion;
    public FieldDef licingresosarr;
    public FieldDef licgastosejant;
    public FieldDef licgastosejact;
    public FieldDef licgastoejactpd;
    public FieldDef licotrosgastos;
    public FieldDef licrdtoneto;
    public FieldDef licredvivienda;
    public FieldDef licredirregular;
    public FieldDef licrdtominimo;
    public FieldDef licrdtonetoredu;
    public FieldDef licporcenusuf;
    public FieldDef liccalle;
    public FieldDef licimporte;
    public TabLiquidaapartc(String name)
      {
      super(name);
      licejeraplic = new FieldDef("licejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      licdeclaran = new FieldDef("licdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      licmuf = new FieldDef("licmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lictipocalculo = new FieldDef("lictipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      licninmueble = new FieldDef("licninmueble",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lictitular = new FieldDef("lictitular",FieldDef.CHAR,1);
      liccopropiedad = new FieldDef("liccopropiedad",FieldDef.FLOAT,6,0);
      licnaturaleza = new FieldDef("licnaturaleza",FieldDef.INTEGER,0);
      licdestino = new FieldDef("licdestino",FieldDef.INTEGER,0);
      licsituacion = new FieldDef("licsituacion",FieldDef.INTEGER,0);
      licreferencia = new FieldDef("licreferencia",FieldDef.CHAR,20);
      licdisposicion = new FieldDef("licdisposicion",FieldDef.FLOAT,6,0);
      licdias = new FieldDef("licdias",FieldDef.INTEGER,0);
      licimputacion = new FieldDef("licimputacion",FieldDef.FLOAT,6,0);
      licingresosarr = new FieldDef("licingresosarr",FieldDef.FLOAT,6,0);
      licgastosejant = new FieldDef("licgastosejant",FieldDef.FLOAT,6,0);
      licgastosejact = new FieldDef("licgastosejact",FieldDef.FLOAT,6,0);
      licgastoejactpd = new FieldDef("licgastoejactpd",FieldDef.FLOAT,6,0);
      licotrosgastos = new FieldDef("licotrosgastos",FieldDef.FLOAT,6,0);
      licrdtoneto = new FieldDef("licrdtoneto",FieldDef.FLOAT,6,0);
      licredvivienda = new FieldDef("licredvivienda",FieldDef.FLOAT,6,0);
      licredirregular = new FieldDef("licredirregular",FieldDef.FLOAT,6,0);
      licrdtominimo = new FieldDef("licrdtominimo",FieldDef.FLOAT,6,0);
      licrdtonetoredu = new FieldDef("licrdtonetoredu",FieldDef.FLOAT,6,0);
      licporcenusuf = new FieldDef("licporcenusuf",FieldDef.FLOAT,6,0);
      liccalle = new FieldDef("liccalle",FieldDef.CHAR,80);
      licimporte = new FieldDef("licimporte",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        licejeraplic,
        licdeclaran,
        licmuf,
        lictipocalculo,
        licninmueble,
        lictitular,
        liccopropiedad,
        licnaturaleza,
        licdestino,
        licsituacion,
        licreferencia,
        licdisposicion,
        licdias,
        licimputacion,
        licingresosarr,
        licgastosejant,
        licgastosejact,
        licgastoejactpd,
        licotrosgastos,
        licrdtoneto,
        licredvivienda,
        licredirregular,
        licrdtominimo,
        licrdtonetoredu,
        licporcenusuf,
        liccalle,
        licimporte        
        };
      setColumns(array);
      FieldDef arrayf[] = {licejeraplic,licdeclaran,licmuf,lictipocalculo,licninmueble };
      setDescription("Liquidacion renta apartado C: capital inmobiliario");
      setPrimaryKeys(arrayf);
      licejeraplic.setDescription("Ejercicio aplicacion");
      licdeclaran.setDescription("Codigo de declarante");
      licmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lictipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      licninmueble.setDescription("Codigo de inmueble");
      lictitular.setDescription("Titular");
      liccopropiedad.setDescription("% titularidad");
      licnaturaleza.setDescription("Naturaleza");
      licdestino.setDescription("Destino");
      licsituacion.setDescription("Situacion");
      licreferencia.setDescription("Referencia catastral");
      licdisposicion.setDescription("Parte del inmueble que esta a disposicion del titular");
      licdias.setDescription("Numero de dias computables");
      licimputacion.setDescription("Renta inmobiliaria imputada");
      licingresosarr.setDescription("Ingresos arrendada");
      licgastosejant.setDescription("Importe gastos ejercicio anterior");
      licgastosejact.setDescription("Importe gastos ejercicio actual");
      licgastoejactpd.setDescription("Importe gastos ejercicio actual pendientes ejer.siguiente");
      licotrosgastos.setDescription("Importe otros gastos del ejercicio");
      licrdtoneto.setDescription("Rendimiento neto");
      licredvivienda.setDescription("Reduccion arrendamiento vivienda");
      licredirregular.setDescription("Reduccion irregular");
      licrdtominimo.setDescription("Rendimiento minimo computable");
      licrdtonetoredu.setDescription("Rendimiento neto reducido");
      licporcenusuf.setDescription("% usufructo");
      liccalle.setDescription("Nro.Reg.-Calle-Nro-Municipio");
      licimporte.setDescription("Importe mayor");
      }
    }
    
  public class TabCalculoautonom extends TableDef
    {
    // Campos
    public FieldDef cfaejeraplic;
    public FieldDef cfaautonomia;
    public FieldDef cfaprimerhijo;
    public FieldDef cfasegundohijo;
    public FieldDef cfatercerhijo;
    public FieldDef cfasiguienthijo;
    public FieldDef cfamenor3;
    public FieldDef cfaascen65;
    public FieldDef cfaascen75;
    public FieldDef cfaminus1contrb;
    public FieldDef cfaminus2contrb;
    public FieldDef cfaminus3contrb;
    public FieldDef cfaminus1desasc;
    public FieldDef cfaminus2desasc;
    public FieldDef cfaminus3desasc;
    public TabCalculoautonom(String name)
      {
      super(name);
      cfaejeraplic = new FieldDef("cfaejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cfaautonomia = new FieldDef("cfaautonomia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cfaprimerhijo = new FieldDef("cfaprimerhijo",FieldDef.FLOAT,6,0);
      cfasegundohijo = new FieldDef("cfasegundohijo",FieldDef.FLOAT,6,0);
      cfatercerhijo = new FieldDef("cfatercerhijo",FieldDef.FLOAT,6,0);
      cfasiguienthijo = new FieldDef("cfasiguienthijo",FieldDef.FLOAT,6,0);
      cfamenor3 = new FieldDef("cfamenor3",FieldDef.FLOAT,6,0);
      cfaascen65 = new FieldDef("cfaascen65",FieldDef.FLOAT,6,0);
      cfaascen75 = new FieldDef("cfaascen75",FieldDef.FLOAT,6,0);
      cfaminus1contrb = new FieldDef("cfaminus1contrb",FieldDef.FLOAT,6,0);
      cfaminus2contrb = new FieldDef("cfaminus2contrb",FieldDef.FLOAT,6,0);
      cfaminus3contrb = new FieldDef("cfaminus3contrb",FieldDef.FLOAT,6,0);
      cfaminus1desasc = new FieldDef("cfaminus1desasc",FieldDef.FLOAT,6,0);
      cfaminus2desasc = new FieldDef("cfaminus2desasc",FieldDef.FLOAT,6,0);
      cfaminus3desasc = new FieldDef("cfaminus3desasc",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        cfaejeraplic,
        cfaautonomia,
        cfaprimerhijo,
        cfasegundohijo,
        cfatercerhijo,
        cfasiguienthijo,
        cfamenor3,
        cfaascen65,
        cfaascen75,
        cfaminus1contrb,
        cfaminus2contrb,
        cfaminus3contrb,
        cfaminus1desasc,
        cfaminus2desasc,
        cfaminus3desasc        
        };
      setColumns(array);
      FieldDef arrayf[] = {cfaejeraplic,cfaautonomia };
      setDescription("Minimos familiares por autonomia");
      setPrimaryKeys(arrayf);
      cfaejeraplic.setDescription("Ejercicio fiscal aplicacion");
      cfaautonomia.setDescription("Autonomia");
      cfaprimerhijo.setDescription("Minimo por primer descendiente");
      cfasegundohijo.setDescription("Minimo por segundo descendiente");
      cfatercerhijo.setDescription("Minimo por tercer descendiente");
      cfasiguienthijo.setDescription("Minimo por cuarto y sucesivo descendiente");
      cfamenor3.setDescription("Mínimo por descendiente menor 3 años");
      cfaascen65.setDescription("Mínimo por ascenddiente mayor 65 o minusvalia");
      cfaascen75.setDescription("Mínimo por ascenddiente mayor 65");
      cfaminus1contrb.setDescription("Contrib. discapacidad");
      cfaminus2contrb.setDescription("Contrib. discapacidad mayor 65%");
      cfaminus3contrb.setDescription("Contrib. discapacidad asistencia");
      cfaminus1desasc.setDescription("Ascend/Descen discapacidad");
      cfaminus2desasc.setDescription("Ascend/Descen discapacidad mayor 65%");
      cfaminus3desasc.setDescription("Ascend/Descen discapacidad asistencia");
      }
    }
    
  public class TabDedinversion2 extends TableDef
    {
    // Campos
    public FieldDef di2ejeraplic;
    public FieldDef di2declaran;
    public FieldDef di2identactiv;
    public FieldDef di2anyo;
    public FieldDef di2bii_lim;
    public FieldDef di2bii_saldo;
    public FieldDef di2bii_aplic;
    public FieldDef di2sce_lim;
    public FieldDef di2sce_saldo;
    public FieldDef di2sce_aplic;
    public FieldDef di2exm_lim;
    public FieldDef di2exm_saldo;
    public FieldDef di2exm_aplic;
    public FieldDef di2cme_lim;
    public FieldDef di2cme_saldo;
    public FieldDef di2cme_aplic;
    public FieldDef di2cmp_lim;
    public FieldDef di2cmp_saldo;
    public FieldDef di2cmp_aplic;
    public FieldDef di2mhw_lim;
    public FieldDef di2mhw_saldo;
    public FieldDef di2mhw_aplic;
    public FieldDef di2cre_lim;
    public FieldDef di2cre_saldo;
    public FieldDef di2cre_aplic;
    public FieldDef di2exp_lim;
    public FieldDef di2exp_saldo;
    public FieldDef di2exp_aplic;
    public FieldDef di2cqi_lim;
    public FieldDef di2cqi_saldo;
    public FieldDef di2cqi_aplic;
    public FieldDef di2wcl_lim;
    public FieldDef di2wcl_saldo;
    public FieldDef di2wcl_aplic;
    public FieldDef di2jum_lim;
    public FieldDef di2jum_saldo;
    public FieldDef di2jum_aplic;
    public FieldDef di2tcm_lim;
    public FieldDef di2tcm_saldo;
    public FieldDef di2tcm_aplic;
    public FieldDef di2abe_lim;
    public FieldDef di2abe_saldo;
    public FieldDef di2abe_aplic;
    public TabDedinversion2(String name)
      {
      super(name);
      di2ejeraplic = new FieldDef("di2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      di2declaran = new FieldDef("di2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      di2identactiv = new FieldDef("di2identactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      di2anyo = new FieldDef("di2anyo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      di2bii_lim = new FieldDef("di2bii_lim",FieldDef.FLOAT,6,0);
      di2bii_saldo = new FieldDef("di2bii_saldo",FieldDef.FLOAT,6,0);
      di2bii_aplic = new FieldDef("di2bii_aplic",FieldDef.FLOAT,6,0);
      di2sce_lim = new FieldDef("di2sce_lim",FieldDef.FLOAT,6,0);
      di2sce_saldo = new FieldDef("di2sce_saldo",FieldDef.FLOAT,6,0);
      di2sce_aplic = new FieldDef("di2sce_aplic",FieldDef.FLOAT,6,0);
      di2exm_lim = new FieldDef("di2exm_lim",FieldDef.FLOAT,6,0);
      di2exm_saldo = new FieldDef("di2exm_saldo",FieldDef.FLOAT,6,0);
      di2exm_aplic = new FieldDef("di2exm_aplic",FieldDef.FLOAT,6,0);
      di2cme_lim = new FieldDef("di2cme_lim",FieldDef.FLOAT,6,0);
      di2cme_saldo = new FieldDef("di2cme_saldo",FieldDef.FLOAT,6,0);
      di2cme_aplic = new FieldDef("di2cme_aplic",FieldDef.FLOAT,6,0);
      di2cmp_lim = new FieldDef("di2cmp_lim",FieldDef.FLOAT,6,0);
      di2cmp_saldo = new FieldDef("di2cmp_saldo",FieldDef.FLOAT,6,0);
      di2cmp_aplic = new FieldDef("di2cmp_aplic",FieldDef.FLOAT,6,0);
      di2mhw_lim = new FieldDef("di2mhw_lim",FieldDef.FLOAT,6,0);
      di2mhw_saldo = new FieldDef("di2mhw_saldo",FieldDef.FLOAT,6,0);
      di2mhw_aplic = new FieldDef("di2mhw_aplic",FieldDef.FLOAT,6,0);
      di2cre_lim = new FieldDef("di2cre_lim",FieldDef.FLOAT,6,0);
      di2cre_saldo = new FieldDef("di2cre_saldo",FieldDef.FLOAT,6,0);
      di2cre_aplic = new FieldDef("di2cre_aplic",FieldDef.FLOAT,6,0);
      di2exp_lim = new FieldDef("di2exp_lim",FieldDef.FLOAT,6,0);
      di2exp_saldo = new FieldDef("di2exp_saldo",FieldDef.FLOAT,6,0);
      di2exp_aplic = new FieldDef("di2exp_aplic",FieldDef.FLOAT,6,0);
      di2cqi_lim = new FieldDef("di2cqi_lim",FieldDef.FLOAT,6,0);
      di2cqi_saldo = new FieldDef("di2cqi_saldo",FieldDef.FLOAT,6,0);
      di2cqi_aplic = new FieldDef("di2cqi_aplic",FieldDef.FLOAT,6,0);
      di2wcl_lim = new FieldDef("di2wcl_lim",FieldDef.FLOAT,6,0);
      di2wcl_saldo = new FieldDef("di2wcl_saldo",FieldDef.FLOAT,6,0);
      di2wcl_aplic = new FieldDef("di2wcl_aplic",FieldDef.FLOAT,6,0);
      di2jum_lim = new FieldDef("di2jum_lim",FieldDef.FLOAT,6,0);
      di2jum_saldo = new FieldDef("di2jum_saldo",FieldDef.FLOAT,6,0);
      di2jum_aplic = new FieldDef("di2jum_aplic",FieldDef.FLOAT,6,0);
      di2tcm_lim = new FieldDef("di2tcm_lim",FieldDef.FLOAT,6,0);
      di2tcm_saldo = new FieldDef("di2tcm_saldo",FieldDef.FLOAT,6,0);
      di2tcm_aplic = new FieldDef("di2tcm_aplic",FieldDef.FLOAT,6,0);
      di2abe_lim = new FieldDef("di2abe_lim",FieldDef.FLOAT,6,0);
      di2abe_saldo = new FieldDef("di2abe_saldo",FieldDef.FLOAT,6,0);
      di2abe_aplic = new FieldDef("di2abe_aplic",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        di2ejeraplic,
        di2declaran,
        di2identactiv,
        di2anyo,
        di2bii_lim,
        di2bii_saldo,
        di2bii_aplic,
        di2sce_lim,
        di2sce_saldo,
        di2sce_aplic,
        di2exm_lim,
        di2exm_saldo,
        di2exm_aplic,
        di2cme_lim,
        di2cme_saldo,
        di2cme_aplic,
        di2cmp_lim,
        di2cmp_saldo,
        di2cmp_aplic,
        di2mhw_lim,
        di2mhw_saldo,
        di2mhw_aplic,
        di2cre_lim,
        di2cre_saldo,
        di2cre_aplic,
        di2exp_lim,
        di2exp_saldo,
        di2exp_aplic,
        di2cqi_lim,
        di2cqi_saldo,
        di2cqi_aplic,
        di2wcl_lim,
        di2wcl_saldo,
        di2wcl_aplic,
        di2jum_lim,
        di2jum_saldo,
        di2jum_aplic,
        di2tcm_lim,
        di2tcm_saldo,
        di2tcm_aplic,
        di2abe_lim,
        di2abe_saldo,
        di2abe_aplic        
        };
      setColumns(array);
      FieldDef arrayf[] = {di2ejeraplic,di2declaran,di2identactiv,di2anyo };
      setDescription("Deduccion Inversiones 2");
      setPrimaryKeys(arrayf);
      di2ejeraplic.setDescription("Ejercicio fiscal aplicacion");
      di2declaran.setDescription("Declarante");
      di2identactiv.setDescription("Identificador actividad");
      di2anyo.setDescription("Ejercicio");
      di2bii_lim.setDescription("BII 2013 Inversión beneficios Art.37 LIS Inver.inmobiliaria afecta o elementos nuevos inmvolizado material Limite");
      di2bii_saldo.setDescription("2013 Inversión beneficios Art.37 LIS Inver.inmobiliaria afecta o elementos nuevos inmvolizado material Saldo anterior");
      di2bii_aplic.setDescription("2013 Inversión beneficios Art.37 LIS Inver.inmobiliaria afecta o elementos nuevos inmvolizado material Capital Aplicado");
      di2sce_lim.setDescription("SCE 2014 Donostia capital europea cultural 2016  Limite");
      di2sce_saldo.setDescription("2014 Donostia capital europea cultural 2016  Saldo anterior");
      di2sce_aplic.setDescription("2014 Donostia capital europea cultural 2016  Capital Aplicado");
      di2exm_lim.setDescription("EXM 2014 Expo Milan 2015  Limite");
      di2exm_saldo.setDescription("2014 Expo Milan 2015  Saldo anterior");
      di2exm_aplic.setDescription("2014 Expo Milan 2015  Capital Aplicado");
      di2cme_lim.setDescription("CME 2014 Campeonato escalada 2014 Gijon  Limite");
      di2cme_saldo.setDescription("2014 Campeonato escalada 2014 Gijon  Saldo anterior");
      di2cme_aplic.setDescription("2014 Campeonato escalada 2014 Gijon  Capital Aplicado");
      di2cmp_lim.setDescription("CMP 2014 Campeonato patinaje artistico Reus 2014  Limite");
      di2cmp_saldo.setDescription("2014 Campeonato patinaje artistico Reus 2014  Saldo anterior");
      di2cmp_aplic.setDescription("2014 Campeonato patinaje artistico Reus 2014  Capital Aplicado");
      di2mhw_lim.setDescription("MHW 2014 Madrid horse week  Limite");
      di2mhw_saldo.setDescription("2014 Madrid horse week  Saldo anterior");
      di2mhw_aplic.setDescription("2014 Madrid horse week  Capital Aplicado");
      di2cre_lim.setDescription("CRE 2014 III Centenario Real Academia Esp  Limite");
      di2cre_saldo.setDescription("2014 III Centenario Real Academia Esp  Saldo anterior");
      di2cre_aplic.setDescription("2014 III Centenario Real Academia Esp  Capital Aplicado");
      di2exp_lim.setDescription("EXP 2014 120 a primera exposicion Picasso  Limite");
      di2exp_saldo.setDescription("2014 120 a primera exposicion Picasso  Saldo anterior");
      di2exp_aplic.setDescription("2014 120 a primera exposicion Picasso  Capital Aplicado");
      di2cqi_lim.setDescription("CQI 2014 IV Centenario segunda parte Quijote Limite");
      di2cqi_saldo.setDescription("2014 IV Centenario segunda parte Quijote Saldo anterior");
      di2cqi_aplic.setDescription("2014 IV Centenario segunda parte Quijote Capital Aplicado");
      di2wcl_lim.setDescription("WCL 2014 85 Aniversario de la Liga Limite");
      di2wcl_saldo.setDescription("2014 85 Aniversario de la Liga Saldo anterior");
      di2wcl_aplic.setDescription("2014 85 Aniversario de la Liga Capital Aplicado");
      di2jum_lim.setDescription("JUM 2014 Juegos del Mediterraneo 2017 Limite");
      di2jum_saldo.setDescription("2014 Juegos del Mediterraneo 2017 Saldo anterior");
      di2jum_aplic.setDescription("2014 Juegos del Mediterraneo 2017 Capital Aplicado");
      di2tcm_lim.setDescription("TCM 2014 Teatro clásico Merida 60 edición Limite");
      di2tcm_saldo.setDescription("2014 Teatro clásico Merida 60 edición Saldo anterior");
      di2tcm_aplic.setDescription("2014 Teatro clásico Merida 60 edición Capital Aplicado");
      di2abe_lim.setDescription("ABE 2014 Año de la biotecnología en Esp Limite");
      di2abe_saldo.setDescription("2014 Año de la biotecnología en Esp Saldo anterior");
      di2abe_aplic.setDescription("2014 Año de la biotecnología en Esp Capital Aplicado");
      }
    }
    
  public class TabLiquidaanexoa2a extends TableDef
    {
    // Campos
    public FieldDef laa2ejeraplic;
    public FieldDef laa2declaran;
    public FieldDef laa2muf;
    public FieldDef laa2tipocalculo;
    public FieldDef laa2invan1iniej;
    public FieldDef laa2invan1aplic;
    public FieldDef laa2invan1pdte;
    public FieldDef laa2invan2iniej;
    public FieldDef laa2invan2aplic;
    public FieldDef laa2invant2pdte;
    public FieldDef laa2invbiiiniej;
    public FieldDef laa2invbiiaplic;
    public FieldDef laa2invbiipdte;
    public FieldDef laa2invsceiniej;
    public FieldDef laa2invsceaplic;
    public FieldDef laa2invscepdte;
    public FieldDef laa2invexminiej;
    public FieldDef laa2invexmaplic;
    public FieldDef laa2invexmpdte;
    public FieldDef laa2invcmeiniej;
    public FieldDef laa2invcmeaplic;
    public FieldDef laa2invcmepdte;
    public FieldDef laa2invcmpiniej;
    public FieldDef laa2invcmpaplic;
    public FieldDef laa2invcmppdte;
    public FieldDef laa2invmhwiniej;
    public FieldDef laa2invmhwaplic;
    public FieldDef laa2invmhwpdte;
    public FieldDef laa2invcreiniej;
    public FieldDef laa2invcreaplic;
    public FieldDef laa2invcrepdte;
    public FieldDef laa2invexpiniej;
    public FieldDef laa2invexpaplic;
    public FieldDef laa2invexppdte;
    public FieldDef laa2invcqiiniej;
    public FieldDef laa2invcqiaplic;
    public FieldDef laa2invcqipdte;
    public FieldDef laa2invwcliniej;
    public FieldDef laa2invwclaplic;
    public FieldDef laa2invwclpdte;
    public FieldDef laa2invjuminiej;
    public FieldDef laa2invjumaplic;
    public FieldDef laa2invjumpdte;
    public FieldDef laa2invtcminiej;
    public FieldDef laa2invtcmaplic;
    public FieldDef laa2invtcmpdte;
    public FieldDef laa2invabeiniej;
    public FieldDef laa2invabeaplic;
    public FieldDef laa2invabepdte;
    public TabLiquidaanexoa2a(String name)
      {
      super(name);
      laa2ejeraplic = new FieldDef("laa2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      laa2declaran = new FieldDef("laa2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      laa2muf = new FieldDef("laa2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      laa2tipocalculo = new FieldDef("laa2tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      laa2invan1iniej = new FieldDef("laa2invan1iniej",FieldDef.FLOAT,6,0);
      laa2invan1aplic = new FieldDef("laa2invan1aplic",FieldDef.FLOAT,6,0);
      laa2invan1pdte = new FieldDef("laa2invan1pdte",FieldDef.FLOAT,6,0);
      laa2invan2iniej = new FieldDef("laa2invan2iniej",FieldDef.FLOAT,6,0);
      laa2invan2aplic = new FieldDef("laa2invan2aplic",FieldDef.FLOAT,6,0);
      laa2invant2pdte = new FieldDef("laa2invant2pdte",FieldDef.FLOAT,6,0);
      laa2invbiiiniej = new FieldDef("laa2invbiiiniej",FieldDef.FLOAT,6,0);
      laa2invbiiaplic = new FieldDef("laa2invbiiaplic",FieldDef.FLOAT,6,0);
      laa2invbiipdte = new FieldDef("laa2invbiipdte",FieldDef.FLOAT,6,0);
      laa2invsceiniej = new FieldDef("laa2invsceiniej",FieldDef.FLOAT,6,0);
      laa2invsceaplic = new FieldDef("laa2invsceaplic",FieldDef.FLOAT,6,0);
      laa2invscepdte = new FieldDef("laa2invscepdte",FieldDef.FLOAT,6,0);
      laa2invexminiej = new FieldDef("laa2invexminiej",FieldDef.FLOAT,6,0);
      laa2invexmaplic = new FieldDef("laa2invexmaplic",FieldDef.FLOAT,6,0);
      laa2invexmpdte = new FieldDef("laa2invexmpdte",FieldDef.FLOAT,6,0);
      laa2invcmeiniej = new FieldDef("laa2invcmeiniej",FieldDef.FLOAT,6,0);
      laa2invcmeaplic = new FieldDef("laa2invcmeaplic",FieldDef.FLOAT,6,0);
      laa2invcmepdte = new FieldDef("laa2invcmepdte",FieldDef.FLOAT,6,0);
      laa2invcmpiniej = new FieldDef("laa2invcmpiniej",FieldDef.FLOAT,6,0);
      laa2invcmpaplic = new FieldDef("laa2invcmpaplic",FieldDef.FLOAT,6,0);
      laa2invcmppdte = new FieldDef("laa2invcmppdte",FieldDef.FLOAT,6,0);
      laa2invmhwiniej = new FieldDef("laa2invmhwiniej",FieldDef.FLOAT,6,0);
      laa2invmhwaplic = new FieldDef("laa2invmhwaplic",FieldDef.FLOAT,6,0);
      laa2invmhwpdte = new FieldDef("laa2invmhwpdte",FieldDef.FLOAT,6,0);
      laa2invcreiniej = new FieldDef("laa2invcreiniej",FieldDef.FLOAT,6,0);
      laa2invcreaplic = new FieldDef("laa2invcreaplic",FieldDef.FLOAT,6,0);
      laa2invcrepdte = new FieldDef("laa2invcrepdte",FieldDef.FLOAT,6,0);
      laa2invexpiniej = new FieldDef("laa2invexpiniej",FieldDef.FLOAT,6,0);
      laa2invexpaplic = new FieldDef("laa2invexpaplic",FieldDef.FLOAT,6,0);
      laa2invexppdte = new FieldDef("laa2invexppdte",FieldDef.FLOAT,6,0);
      laa2invcqiiniej = new FieldDef("laa2invcqiiniej",FieldDef.FLOAT,6,0);
      laa2invcqiaplic = new FieldDef("laa2invcqiaplic",FieldDef.FLOAT,6,0);
      laa2invcqipdte = new FieldDef("laa2invcqipdte",FieldDef.FLOAT,6,0);
      laa2invwcliniej = new FieldDef("laa2invwcliniej",FieldDef.FLOAT,6,0);
      laa2invwclaplic = new FieldDef("laa2invwclaplic",FieldDef.FLOAT,6,0);
      laa2invwclpdte = new FieldDef("laa2invwclpdte",FieldDef.FLOAT,6,0);
      laa2invjuminiej = new FieldDef("laa2invjuminiej",FieldDef.FLOAT,6,0);
      laa2invjumaplic = new FieldDef("laa2invjumaplic",FieldDef.FLOAT,6,0);
      laa2invjumpdte = new FieldDef("laa2invjumpdte",FieldDef.FLOAT,6,0);
      laa2invtcminiej = new FieldDef("laa2invtcminiej",FieldDef.FLOAT,6,0);
      laa2invtcmaplic = new FieldDef("laa2invtcmaplic",FieldDef.FLOAT,6,0);
      laa2invtcmpdte = new FieldDef("laa2invtcmpdte",FieldDef.FLOAT,6,0);
      laa2invabeiniej = new FieldDef("laa2invabeiniej",FieldDef.FLOAT,6,0);
      laa2invabeaplic = new FieldDef("laa2invabeaplic",FieldDef.FLOAT,6,0);
      laa2invabepdte = new FieldDef("laa2invabepdte",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        laa2ejeraplic,
        laa2declaran,
        laa2muf,
        laa2tipocalculo,
        laa2invan1iniej,
        laa2invan1aplic,
        laa2invan1pdte,
        laa2invan2iniej,
        laa2invan2aplic,
        laa2invant2pdte,
        laa2invbiiiniej,
        laa2invbiiaplic,
        laa2invbiipdte,
        laa2invsceiniej,
        laa2invsceaplic,
        laa2invscepdte,
        laa2invexminiej,
        laa2invexmaplic,
        laa2invexmpdte,
        laa2invcmeiniej,
        laa2invcmeaplic,
        laa2invcmepdte,
        laa2invcmpiniej,
        laa2invcmpaplic,
        laa2invcmppdte,
        laa2invmhwiniej,
        laa2invmhwaplic,
        laa2invmhwpdte,
        laa2invcreiniej,
        laa2invcreaplic,
        laa2invcrepdte,
        laa2invexpiniej,
        laa2invexpaplic,
        laa2invexppdte,
        laa2invcqiiniej,
        laa2invcqiaplic,
        laa2invcqipdte,
        laa2invwcliniej,
        laa2invwclaplic,
        laa2invwclpdte,
        laa2invjuminiej,
        laa2invjumaplic,
        laa2invjumpdte,
        laa2invtcminiej,
        laa2invtcmaplic,
        laa2invtcmpdte,
        laa2invabeiniej,
        laa2invabeaplic,
        laa2invabepdte        
        };
      setColumns(array);
      FieldDef arrayf[] = {laa2ejeraplic,laa2declaran,laa2muf,laa2tipocalculo };
      setDescription("Liquidacion renta anexo A2: Continuacion A de LiquidaAnexoA2");
      setPrimaryKeys(arrayf);
      laa2ejeraplic.setDescription("Ejercicio aplicacion");
      laa2declaran.setDescription("Codigo de declarante");
      laa2muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      laa2tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      laa2invan1iniej.setDescription("Invers.empr.ejer.anter.Reg.general  Saldo inicio");
      laa2invan1aplic.setDescription("Invers.empr.ejer.anter.Reg.general  Aplicado");
      laa2invan1pdte.setDescription("Invers.empr.ejer.anter.Reg.general  Saldo pendiente");
      laa2invan2iniej.setDescription("Invers.empr.ejer.anter.Reg.especial Saldo inicio");
      laa2invan2aplic.setDescription("Invers.empr.ejer.anter.Reg.especial Aplicado");
      laa2invant2pdte.setDescription("Invers.empr.ejer.anter.Reg.especial Saldo pendiente");
      laa2invbiiiniej.setDescription("Invers.empr.ejer.act. BII Inver.inmobil.afecta o inmvolizado material Saldo inicio");
      laa2invbiiaplic.setDescription("Invers.empr.ejer.act.     Inver.inmobil.afecta o inmvolizado material Aplicado");
      laa2invbiipdte.setDescription("Invers.empr.ejer.act.     Inver.inmobil.afecta o inmvolizado material Saldo pendiente");
      laa2invsceiniej.setDescription("Invers.empr.ejer.act. SCE Donostia capital europea cultura 2016  Saldo inicio");
      laa2invsceaplic.setDescription("Invers.empr.ejer.act.     Donostia capital europea cultura 2016  Aplicado");
      laa2invscepdte.setDescription("Invers.empr.ejer.act.     Donostia capital europea cultura 2016  Saldo pendiente");
      laa2invexminiej.setDescription("Invers.empr.ejer.act. EXM Expo Milan 2015  Saldo inicio");
      laa2invexmaplic.setDescription("Invers.empr.ejer.act.     Expo Milan 2015  Aplicado");
      laa2invexmpdte.setDescription("Invers.empr.ejer.act.     Expo Milan 2015  Saldo pendiente");
      laa2invcmeiniej.setDescription("Invers.empr.ejer.act. CME Campeonato mundial escalada Gijon 2014 Saldo inicio");
      laa2invcmeaplic.setDescription("Invers.empr.ejer.act.     Campeonato mundial escalada Gijon 2014 Aplicado");
      laa2invcmepdte.setDescription("Invers.empr.ejer.act.     Campeonato mundial escalada Gijon 2014 Saldo pendiente");
      laa2invcmpiniej.setDescription("Invers.empr.ejer.act. CMP Campeonato mundial patinaje artistico Reus 2014 Saldo inicio");
      laa2invcmpaplic.setDescription("Invers.empr.ejer.act.     Campeonato mundial patinaje artistico Reus 2014 Aplicado");
      laa2invcmppdte.setDescription("Invers.empr.ejer.act.     Campeonato mundial patinaje artistico Reus 2014 Saldo pendiente");
      laa2invmhwiniej.setDescription("Invers.empr.ejer.act. MHW Madrid horse week Saldo inicio");
      laa2invmhwaplic.setDescription("Invers.empr.ejer.act.     Madrid horse week Aplicado");
      laa2invmhwpdte.setDescription("Invers.empr.ejer.act.     Madrid horse week Saldo pendiente");
      laa2invcreiniej.setDescription("Invers.empr.ejer.act. CRE III Centenario Real Academia Esp  Saldo inicio");
      laa2invcreaplic.setDescription("Invers.empr.ejer.act.     III Centenario Real Academia Esp  Aplicado");
      laa2invcrepdte.setDescription("Invers.empr.ejer.act.     III Centenario Real Academia Esp  Saldo pendiente");
      laa2invexpiniej.setDescription("Invers.empr.ejer.act. EXP 120 a primera exposicion Picasso  Saldo inicio");
      laa2invexpaplic.setDescription("Invers.empr.ejer.act.     120 a primera exposicion Picasso  Aplicado");
      laa2invexppdte.setDescription("Invers.empr.ejer.act.     120 a primera exposicion Picasso  Saldo pendiente");
      laa2invcqiiniej.setDescription("Invers.empr.ejer.act. CQI IV Centenario segunda parte Quijote Saldo inicio");
      laa2invcqiaplic.setDescription("Invers.empr.ejer.act.     IV Centenario segunda parte Quijote Aplicado");
      laa2invcqipdte.setDescription("Invers.empr.ejer.act.     IV Centenario segunda parte Quijote Saldo pendiente");
      laa2invwcliniej.setDescription("Invers.empr.ejer.act. WCL 85 Aniversario de la Liga Saldo inicio");
      laa2invwclaplic.setDescription("Invers.empr.ejer.act.     85 Aniversario de la Liga Aplicado");
      laa2invwclpdte.setDescription("Invers.empr.ejer.act.     85 Aniversario de la Liga Saldo pendiente");
      laa2invjuminiej.setDescription("Invers.empr.ejer.act. JUM Juegos del Mediterraneo 2017 Saldo inicio");
      laa2invjumaplic.setDescription("Invers.empr.ejer.act.     Juegos del Mediterraneo 2017 Aplicado");
      laa2invjumpdte.setDescription("Invers.empr.ejer.act.     Juegos del Mediterraneo 2017 Saldo pendiente");
      laa2invtcminiej.setDescription("Invers.empr.ejer.act. TCM Teatro clásico Merida 60 edición Saldo inicio");
      laa2invtcmaplic.setDescription("Invers.empr.ejer.act.     Teatro clásico Merida 60 edición Aplicado");
      laa2invtcmpdte.setDescription("Invers.empr.ejer.act.     Teatro clásico Merida 60 edición Saldo pendiente");
      laa2invabeiniej.setDescription("Invers.empr.ejer.act. ABE Año de la biotecnología en Esp Saldo inicio");
      laa2invabeaplic.setDescription("Invers.empr.ejer.act.     Año de la biotecnología en Esp Aplicado");
      laa2invabepdte.setDescription("Invers.empr.ejer.act.     Año de la biotecnología en Esp Saldo pendiente");
      }
    }
    
  public class TabDeclarante extends TableDef
    {
    // Campos
    public FieldDef decejeraplic;
    public FieldDef deccodigo;
    public FieldDef decnifdec;
    public FieldDef decapell1dec;
    public FieldDef decapell2dec;
    public FieldDef decnombredec;
    public FieldDef decfechanacdec;
    public FieldDef decminusvaldec;
    public FieldDef dectipodismdec;
    public FieldDef decsexodec;
    public FieldDef decautonomdec;
    public FieldDef decobligadec;
    public FieldDef decfechamortde;
    public FieldDef decresiceutadec;
    public FieldDef decenparodec;
    public FieldDef decrdtoexendec;
    public FieldDef decresextrandec;
    public FieldDef deccambdomidec;
    public FieldDef decresidencdec;
    public FieldDef decejerviudodec;
    public FieldDef deccodigocdpdec;
    public FieldDef decestado;
    public FieldDef decregimen;
    public FieldDef decparejahecho;
    public FieldDef decfamnumerosa;
    public FieldDef decfechadespach;
    public FieldDef decexpediente;
    public FieldDef decfechainicio;
    public FieldDef decfechafin;
    public FieldDef decdnirepres;
    public FieldDef decapellido1rep;
    public FieldDef decapellido2rep;
    public FieldDef decnombrerepres;
    public FieldDef decnifcon;
    public FieldDef decapell1con;
    public FieldDef decapell2con;
    public FieldDef decnombrecon;
    public FieldDef decfechanaccon;
    public FieldDef decminusvalcon;
    public FieldDef dectipodismcon;
    public FieldDef decsexocon;
    public FieldDef decautonomcon;
    public FieldDef decobligacon;
    public FieldDef decfechamortcon;
    public FieldDef decresiceutacon;
    public FieldDef decenparocon;
    public FieldDef decrdtoexencon;
    public FieldDef decresextrancon;
    public FieldDef deccambdomicon;
    public FieldDef decresidenccon;
    public FieldDef decejerviudocon;
    public FieldDef decnoresidcon;
    public FieldDef decimpnifcon;
    public FieldDef deccodigocdpcon;
    public FieldDef dectraspasado;
    public FieldDef decuser;
    public FieldDef decgrupo;
    public FieldDef decporminusdec;
    public FieldDef decporminuscon;
    public FieldDef dechabitantedec;
    public FieldDef dechabitantecon;
    public FieldDef decidiomaimp;
    public FieldDef decextranj720;
    public FieldDef decresponsable;
    public FieldDef decdependec;
    public FieldDef decdepencon;
    public FieldDef decfecdependec;
    public FieldDef decfecdepencon;
    public FieldDef decnolistaconj;
    public FieldDef decteingresodec;
    public FieldDef decteingresocon;
    public TabDeclarante(String name)
      {
      super(name);
      decejeraplic = new FieldDef("decejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      deccodigo = new FieldDef("deccodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      decnifdec = new FieldDef("decnifdec",FieldDef.CHAR,15);
      decapell1dec = new FieldDef("decapell1dec",FieldDef.CHAR,100);
      decapell2dec = new FieldDef("decapell2dec",FieldDef.CHAR,25);
      decnombredec = new FieldDef("decnombredec",FieldDef.CHAR,20);
      decfechanacdec = new FieldDef("decfechanacdec",FieldDef.DATE);
      decminusvaldec = new FieldDef("decminusvaldec",FieldDef.INTEGER,0);
      dectipodismdec = new FieldDef("dectipodismdec",FieldDef.CHAR,1);
      decsexodec = new FieldDef("decsexodec",FieldDef.CHAR,1);
      decautonomdec = new FieldDef("decautonomdec",FieldDef.INTEGER,0);
      decobligadec = new FieldDef("decobligadec",FieldDef.CHAR,1);
      decfechamortde = new FieldDef("decfechamortde",FieldDef.DATE);
      decresiceutadec = new FieldDef("decresiceutadec",FieldDef.CHAR,1);
      decenparodec = new FieldDef("decenparodec",FieldDef.CHAR,1);
      decrdtoexendec = new FieldDef("decrdtoexendec",FieldDef.CHAR,1);
      decresextrandec = new FieldDef("decresextrandec",FieldDef.CHAR,1);
      deccambdomidec = new FieldDef("deccambdomidec",FieldDef.CHAR,1);
      decresidencdec = new FieldDef("decresidencdec",FieldDef.CHAR,1);
      decejerviudodec = new FieldDef("decejerviudodec",FieldDef.INTEGER,0);
      deccodigocdpdec = new FieldDef("deccodigocdpdec",FieldDef.CHAR,12);
      decestado = new FieldDef("decestado",FieldDef.CHAR,1);
      decregimen = new FieldDef("decregimen",FieldDef.CHAR,1);
      decparejahecho = new FieldDef("decparejahecho",FieldDef.CHAR,1);
      decfamnumerosa = new FieldDef("decfamnumerosa",FieldDef.CHAR,2);
      decfechadespach = new FieldDef("decfechadespach",FieldDef.DATE);
      decexpediente = new FieldDef("decexpediente",FieldDef.CHAR,15);
      decfechainicio = new FieldDef("decfechainicio",FieldDef.DATE);
      decfechafin = new FieldDef("decfechafin",FieldDef.DATE);
      decdnirepres = new FieldDef("decdnirepres",FieldDef.CHAR,15);
      decapellido1rep = new FieldDef("decapellido1rep",FieldDef.CHAR,100);
      decapellido2rep = new FieldDef("decapellido2rep",FieldDef.CHAR,25);
      decnombrerepres = new FieldDef("decnombrerepres",FieldDef.CHAR,20);
      decnifcon = new FieldDef("decnifcon",FieldDef.CHAR,15);
      decapell1con = new FieldDef("decapell1con",FieldDef.CHAR,100);
      decapell2con = new FieldDef("decapell2con",FieldDef.CHAR,25);
      decnombrecon = new FieldDef("decnombrecon",FieldDef.CHAR,20);
      decfechanaccon = new FieldDef("decfechanaccon",FieldDef.DATE);
      decminusvalcon = new FieldDef("decminusvalcon",FieldDef.INTEGER,0);
      dectipodismcon = new FieldDef("dectipodismcon",FieldDef.CHAR,1);
      decsexocon = new FieldDef("decsexocon",FieldDef.CHAR,1);
      decautonomcon = new FieldDef("decautonomcon",FieldDef.INTEGER,0);
      decobligacon = new FieldDef("decobligacon",FieldDef.CHAR,1);
      decfechamortcon = new FieldDef("decfechamortcon",FieldDef.DATE);
      decresiceutacon = new FieldDef("decresiceutacon",FieldDef.CHAR,1);
      decenparocon = new FieldDef("decenparocon",FieldDef.CHAR,1);
      decrdtoexencon = new FieldDef("decrdtoexencon",FieldDef.CHAR,1);
      decresextrancon = new FieldDef("decresextrancon",FieldDef.CHAR,1);
      deccambdomicon = new FieldDef("deccambdomicon",FieldDef.CHAR,1);
      decresidenccon = new FieldDef("decresidenccon",FieldDef.CHAR,1);
      decejerviudocon = new FieldDef("decejerviudocon",FieldDef.INTEGER,0);
      decnoresidcon = new FieldDef("decnoresidcon",FieldDef.CHAR,1);
      decimpnifcon = new FieldDef("decimpnifcon",FieldDef.CHAR,1);
      deccodigocdpcon = new FieldDef("deccodigocdpcon",FieldDef.CHAR,12);
      dectraspasado = new FieldDef("dectraspasado",FieldDef.CHAR,1);
      decuser = new FieldDef("decuser",FieldDef.CHAR,25);
      decgrupo = new FieldDef("decgrupo",FieldDef.CHAR,15);
      decporminusdec = new FieldDef("decporminusdec",FieldDef.INTEGER,0);
      decporminuscon = new FieldDef("decporminuscon",FieldDef.INTEGER,0);
      dechabitantedec = new FieldDef("dechabitantedec",FieldDef.CHAR,1);
      dechabitantecon = new FieldDef("dechabitantecon",FieldDef.CHAR,1);
      decidiomaimp = new FieldDef("decidiomaimp",FieldDef.CHAR,1);
      decextranj720 = new FieldDef("decextranj720",FieldDef.CHAR,1);
      decresponsable = new FieldDef("decresponsable",FieldDef.CHAR,40);
      decdependec = new FieldDef("decdependec",FieldDef.CHAR,1);
      decdepencon = new FieldDef("decdepencon",FieldDef.CHAR,1);
      decfecdependec = new FieldDef("decfecdependec",FieldDef.DATE);
      decfecdepencon = new FieldDef("decfecdepencon",FieldDef.DATE);
      decnolistaconj = new FieldDef("decnolistaconj",FieldDef.CHAR,1);
      decteingresodec = new FieldDef("decteingresodec",FieldDef.CHAR,1);
      decteingresocon = new FieldDef("decteingresocon",FieldDef.CHAR,1);
      FieldDef array[] = {
        decejeraplic,
        deccodigo,
        decnifdec,
        decapell1dec,
        decapell2dec,
        decnombredec,
        decfechanacdec,
        decminusvaldec,
        dectipodismdec,
        decsexodec,
        decautonomdec,
        decobligadec,
        decfechamortde,
        decresiceutadec,
        decenparodec,
        decrdtoexendec,
        decresextrandec,
        deccambdomidec,
        decresidencdec,
        decejerviudodec,
        deccodigocdpdec,
        decestado,
        decregimen,
        decparejahecho,
        decfamnumerosa,
        decfechadespach,
        decexpediente,
        decfechainicio,
        decfechafin,
        decdnirepres,
        decapellido1rep,
        decapellido2rep,
        decnombrerepres,
        decnifcon,
        decapell1con,
        decapell2con,
        decnombrecon,
        decfechanaccon,
        decminusvalcon,
        dectipodismcon,
        decsexocon,
        decautonomcon,
        decobligacon,
        decfechamortcon,
        decresiceutacon,
        decenparocon,
        decrdtoexencon,
        decresextrancon,
        deccambdomicon,
        decresidenccon,
        decejerviudocon,
        decnoresidcon,
        decimpnifcon,
        deccodigocdpcon,
        dectraspasado,
        decuser,
        decgrupo,
        decporminusdec,
        decporminuscon,
        dechabitantedec,
        dechabitantecon,
        decidiomaimp,
        decextranj720,
        decresponsable,
        decdependec,
        decdepencon,
        decfecdependec,
        decfecdepencon,
        decnolistaconj,
        decteingresodec,
        decteingresocon        
        };
      setColumns(array);
      FieldDef arrayf[] = {decejeraplic,deccodigo };
      setDescription("Datos general declarante");
      setPrimaryKeys(arrayf);
      decejeraplic.setDescription("Ejercicio aplicacion");
      deccodigo.setDescription("CODIGO DE DECLARANTE");
      decnifdec.setDescription("NIF declarante");
      decapell1dec.setDescription("Primer Apellido declarante");
      decapell2dec.setDescription("Segundo Apellido declarante");
      decnombredec.setDescription("Nombre declarante");
      decfechanacdec.setDescription("Fecha Nacimiento declarante");
      decminusvaldec.setDescription("Grado minusvalia declarante");
      dectipodismdec.setDescription("Tipo disminucion declarante");
      decsexodec.setDescription("Sexo declarante");
      decautonomdec.setDescription("Comunidad autonoma declarante");
      decobligadec.setDescription("Obligacion declarante");
      decfechamortde.setDescription("Fecha fallecimiento declarante");
      decresiceutadec.setDescription("Residencia 3 años Ceuta/Melilla declarante");
      decenparodec.setDescription("Ha estado en paro declarante");
      decrdtoexendec.setDescription("Percibe rdtos.exentos minusv. declarante");
      decresextrandec.setDescription("Residente Extranjero declarante");
      deccambdomidec.setDescription("Cambio domicilio declarante");
      decresidencdec.setDescription("Usuario residencia declarante");
      decejerviudodec.setDescription("Año viudedad declarante");
      deccodigocdpdec.setDescription("Codigo cdp declarante");
      decestado.setDescription("Estado Civil");
      decregimen.setDescription("Regimen Economico");
      decparejahecho.setDescription("Es pareja de hecho");
      decfamnumerosa.setDescription("Tipo de Familia numerosa segun autonomia");
      decfechadespach.setDescription("Fecha alta despacho");
      decexpediente.setDescription("Numero Expediente");
      decfechainicio.setDescription("Fecha Inicio Declaracion");
      decfechafin.setDescription("Fecha Fin Declaracion");
      decdnirepres.setDescription("NIF Representante");
      decapellido1rep.setDescription("Primer Apellido Representante");
      decapellido2rep.setDescription("Segundo Apellido Representante");
      decnombrerepres.setDescription("Nombre Representante");
      decnifcon.setDescription("NIF conyuge");
      decapell1con.setDescription("Primer Apellido conyuge");
      decapell2con.setDescription("Segundo Apellido conyuge");
      decnombrecon.setDescription("Nombre conyuge");
      decfechanaccon.setDescription("Fecha Nacimiento conyuge");
      decminusvalcon.setDescription("Grado minusvalia conyuge");
      dectipodismcon.setDescription("Tipo disminucion conyuge");
      decsexocon.setDescription("Sexo conyuge");
      decautonomcon.setDescription("Comunidad autonoma conyuge");
      decobligacon.setDescription("Obligacion conyuge");
      decfechamortcon.setDescription("Fecha fallecimiento conyuge");
      decresiceutacon.setDescription("Residencia 3 años Ceuta/Melilla conyuge");
      decenparocon.setDescription("Ha estado en paro conyuge");
      decrdtoexencon.setDescription("Percibe rdtos.exentos minusv. conyuge");
      decresextrancon.setDescription("Residente Extranjero conyuge");
      deccambdomicon.setDescription("Cambio domicilio conyuge");
      decresidenccon.setDescription("Usuario residencia conyuge");
      decejerviudocon.setDescription("Año viudedad conyuge");
      decnoresidcon.setDescription("No residente y no declara");
      decimpnifcon.setDescription("Imprimir NIF conyuge");
      deccodigocdpcon.setDescription("Codigo cdp conyuge");
      dectraspasado.setDescription("Se ha traspasado el declarante");
      decuser.setDescription("Usuario asignado a la sociedad");
      decgrupo.setDescription("Grupo asignado a la sociedad");
      decporminusdec.setDescription("Porcemtaje de minusvalia declarante");
      decporminuscon.setDescription("Porcemtaje de minusvalia conyuge");
      dechabitantedec.setDescription("2011 Castilla-Leon Declarante reside en municipio <5000 hab.");
      dechabitantecon.setDescription("2011 Castilla-Leon Conyuge reside en municipio <5000 hab.");
      decidiomaimp.setDescription("Idioma impresion");
      decextranj720.setDescription("2012 Rdtos mobil-inmob. en el extranjero (mod. 720)");
      decresponsable.setDescription("2013 Responsable en el despacho");
      decdependec.setDescription("2013 Dependencia severa o gran dependencia declar.");
      decdepencon.setDescription("2013 Dependencia severa o gran dependencia conyuge");
      decfecdependec.setDescription("2013 Declar. Fecha concesion dependencia severa (grado II) o gran depen.(grado III)");
      decfecdepencon.setDescription("2013 Conjuge Fecha concesion dependencia severa o gran dependencia");
      decnolistaconj.setDescription("2013 No marcar listable declaracio conjunta");
      decteingresodec.setDescription("2014 Tiene ingresos declarante");
      decteingresocon.setDescription("2014 Tiene ingresos conyuge");
      }
    }
    
  public class TabDedcvf extends TableDef
    {
    // Campos
    public FieldDef dcvfejeraplic;
    public FieldDef dcvfdeclaran;
    public FieldDef dcvfid;
    public FieldDef dcvfmuf;
    public FieldDef dcvfstodos;
    public FieldDef dcvfs01;
    public FieldDef dcvfs02;
    public FieldDef dcvfs03;
    public FieldDef dcvfs04;
    public FieldDef dcvfs05;
    public FieldDef dcvfs06;
    public FieldDef dcvfs07;
    public FieldDef dcvfs08;
    public FieldDef dcvfs09;
    public FieldDef dcvfs10;
    public FieldDef dcvfs11;
    public FieldDef dcvfs12;
    public FieldDef dcvf1meses;
    public FieldDef dcvf1personas;
    public FieldDef dcvf1segsoc;
    public FieldDef dcvf1importe;
    public FieldDef dcvf2meses;
    public FieldDef dcvf2personas;
    public FieldDef dcvf2segsoc;
    public FieldDef dcvf2importe;
    public FieldDef dcvf3meses;
    public FieldDef dcvf3personas;
    public FieldDef dcvf3segsoc;
    public FieldDef dcvf3importe;
    public FieldDef dcvf4meses;
    public FieldDef dcvf4personas;
    public FieldDef dcvf4segsoc;
    public FieldDef dcvf4importe;
    public FieldDef dcvf5meses;
    public FieldDef dcvf5personas;
    public FieldDef dcvf5segsoc;
    public FieldDef dcvf5importe;
    public FieldDef dcvf6meses;
    public FieldDef dcvf6personas;
    public FieldDef dcvf6segsoc;
    public FieldDef dcvf6importe;
    public TabDedcvf(String name)
      {
      super(name);
      dcvfejeraplic = new FieldDef("dcvfejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcvfdeclaran = new FieldDef("dcvfdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dcvfid = new FieldDef("dcvfid",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcvfmuf = new FieldDef("dcvfmuf",FieldDef.CHAR,6);
      dcvfstodos = new FieldDef("dcvfstodos",FieldDef.CHAR,1);
      dcvfs01 = new FieldDef("dcvfs01",FieldDef.FLOAT,6,0);
      dcvfs02 = new FieldDef("dcvfs02",FieldDef.FLOAT,6,0);
      dcvfs03 = new FieldDef("dcvfs03",FieldDef.FLOAT,6,0);
      dcvfs04 = new FieldDef("dcvfs04",FieldDef.FLOAT,6,0);
      dcvfs05 = new FieldDef("dcvfs05",FieldDef.FLOAT,6,0);
      dcvfs06 = new FieldDef("dcvfs06",FieldDef.FLOAT,6,0);
      dcvfs07 = new FieldDef("dcvfs07",FieldDef.FLOAT,6,0);
      dcvfs08 = new FieldDef("dcvfs08",FieldDef.FLOAT,6,0);
      dcvfs09 = new FieldDef("dcvfs09",FieldDef.FLOAT,6,0);
      dcvfs10 = new FieldDef("dcvfs10",FieldDef.FLOAT,6,0);
      dcvfs11 = new FieldDef("dcvfs11",FieldDef.FLOAT,6,0);
      dcvfs12 = new FieldDef("dcvfs12",FieldDef.FLOAT,6,0);
      dcvf1meses = new FieldDef("dcvf1meses",FieldDef.INTEGER,0);
      dcvf1personas = new FieldDef("dcvf1personas",FieldDef.INTEGER,0);
      dcvf1segsoc = new FieldDef("dcvf1segsoc",FieldDef.FLOAT,6,0);
      dcvf1importe = new FieldDef("dcvf1importe",FieldDef.FLOAT,6,0);
      dcvf2meses = new FieldDef("dcvf2meses",FieldDef.INTEGER,0);
      dcvf2personas = new FieldDef("dcvf2personas",FieldDef.INTEGER,0);
      dcvf2segsoc = new FieldDef("dcvf2segsoc",FieldDef.FLOAT,6,0);
      dcvf2importe = new FieldDef("dcvf2importe",FieldDef.FLOAT,6,0);
      dcvf3meses = new FieldDef("dcvf3meses",FieldDef.INTEGER,0);
      dcvf3personas = new FieldDef("dcvf3personas",FieldDef.INTEGER,0);
      dcvf3segsoc = new FieldDef("dcvf3segsoc",FieldDef.FLOAT,6,0);
      dcvf3importe = new FieldDef("dcvf3importe",FieldDef.FLOAT,6,0);
      dcvf4meses = new FieldDef("dcvf4meses",FieldDef.INTEGER,0);
      dcvf4personas = new FieldDef("dcvf4personas",FieldDef.INTEGER,0);
      dcvf4segsoc = new FieldDef("dcvf4segsoc",FieldDef.FLOAT,6,0);
      dcvf4importe = new FieldDef("dcvf4importe",FieldDef.FLOAT,6,0);
      dcvf5meses = new FieldDef("dcvf5meses",FieldDef.INTEGER,0);
      dcvf5personas = new FieldDef("dcvf5personas",FieldDef.INTEGER,0);
      dcvf5segsoc = new FieldDef("dcvf5segsoc",FieldDef.FLOAT,6,0);
      dcvf5importe = new FieldDef("dcvf5importe",FieldDef.FLOAT,6,0);
      dcvf6meses = new FieldDef("dcvf6meses",FieldDef.INTEGER,0);
      dcvf6personas = new FieldDef("dcvf6personas",FieldDef.INTEGER,0);
      dcvf6segsoc = new FieldDef("dcvf6segsoc",FieldDef.FLOAT,6,0);
      dcvf6importe = new FieldDef("dcvf6importe",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        dcvfejeraplic,
        dcvfdeclaran,
        dcvfid,
        dcvfmuf,
        dcvfstodos,
        dcvfs01,
        dcvfs02,
        dcvfs03,
        dcvfs04,
        dcvfs05,
        dcvfs06,
        dcvfs07,
        dcvfs08,
        dcvfs09,
        dcvfs10,
        dcvfs11,
        dcvfs12,
        dcvf1meses,
        dcvf1personas,
        dcvf1segsoc,
        dcvf1importe,
        dcvf2meses,
        dcvf2personas,
        dcvf2segsoc,
        dcvf2importe,
        dcvf3meses,
        dcvf3personas,
        dcvf3segsoc,
        dcvf3importe,
        dcvf4meses,
        dcvf4personas,
        dcvf4segsoc,
        dcvf4importe,
        dcvf5meses,
        dcvf5personas,
        dcvf5segsoc,
        dcvf5importe,
        dcvf6meses,
        dcvf6personas,
        dcvf6segsoc,
        dcvf6importe        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcvfejeraplic,dcvfdeclaran,dcvfid };
      setDescription("Deduc. Conciliacion vida familiar CVF");
      setPrimaryKeys(arrayf);
      dcvfejeraplic.setDescription("Ejercicio aplicacion");
      dcvfdeclaran.setDescription("CODIGO DE DECLARANTE");
      dcvfid.setDescription("Contador");
      dcvfmuf.setDescription("[D]eclarante, [C]onyuge");
      dcvfstodos.setDescription("Cotiza todos meses");
      dcvfs01.setDescription("Cotizacion Enero");
      dcvfs02.setDescription("Cotizacion Febrero");
      dcvfs03.setDescription("Cotizacion Marzo");
      dcvfs04.setDescription("Cotizacion Abril");
      dcvfs05.setDescription("Cotizacion Mayo");
      dcvfs06.setDescription("Cotizacion Junio");
      dcvfs07.setDescription("Cotizacion Jullio");
      dcvfs08.setDescription("Cotizacion Agosto");
      dcvfs09.setDescription("Cotizacion Septiembre");
      dcvfs10.setDescription("Cotizacion Octubre");
      dcvfs11.setDescription("Cotizacion Noviembre");
      dcvfs12.setDescription("Cotizacion Diciembre");
      dcvf1meses.setDescription("Hijo 1 meses con derecho");
      dcvf1personas.setDescription("Hijo 1 nro personas derecho deduc.");
      dcvf1segsoc.setDescription("Hijo 1 cotizacion seg.social");
      dcvf1importe.setDescription("Hijo 1 cuantia deduccion");
      dcvf2meses.setDescription("Hijo 2 meses con derecho");
      dcvf2personas.setDescription("Hijo 2 nro personas derecho deduc.");
      dcvf2segsoc.setDescription("Hijo 2 cotizacion seg.social");
      dcvf2importe.setDescription("Hijo 2 cuantia deduccion");
      dcvf3meses.setDescription("Hijo 3 meses con derecho");
      dcvf3personas.setDescription("Hijo 3 nro personas derecho deduc.");
      dcvf3segsoc.setDescription("Hijo 3 cotizacion seg.social");
      dcvf3importe.setDescription("Hijo 3 cuantia deduccion");
      dcvf4meses.setDescription("Hijo 4 meses con derecho");
      dcvf4personas.setDescription("Hijo 4 nro personas derecho deduc.");
      dcvf4segsoc.setDescription("Hijo 4 cotizacion seg.social");
      dcvf4importe.setDescription("Hijo 4 cuantia deduccion");
      dcvf5meses.setDescription("Hijo 5 meses con derecho");
      dcvf5personas.setDescription("Hijo 5 nro personas derecho deduc.");
      dcvf5segsoc.setDescription("Hijo 5 cotizacion seg.social");
      dcvf5importe.setDescription("Hijo 5 cuantia deduccion");
      dcvf6meses.setDescription("Hijo 6 meses con derecho");
      dcvf6personas.setDescription("Hijo 6 nro personas derecho deduc.");
      dcvf6segsoc.setDescription("Hijo 6 cotizacion seg.social");
      dcvf6importe.setDescription("Hijo 6 cuantia deduccion");
      }
    }
    
  public class TabDatosvivienda extends TableDef
    {
    // Campos
    public FieldDef dvdejeraplic;
    public FieldDef dvddeclaran;
    public FieldDef dvdmuf;
    public FieldDef dvdtitularvda;
    public FieldDef dvdpartdeclvda;
    public FieldDef dvdpartconyvda;
    public FieldDef dvdsituaciovda;
    public FieldDef dvdrefcatasvda;
    public FieldDef dvdtitulargr1;
    public FieldDef dvdpartdeclgr1;
    public FieldDef dvdpartconygr1;
    public FieldDef dvdsituaciogr1;
    public FieldDef dvdrefcatasgr1;
    public FieldDef dvdtitulargr2;
    public FieldDef dvdpartdeclgr2;
    public FieldDef dvdpartconygr2;
    public FieldDef dvdsituaciogr2;
    public FieldDef dvdrefcatasgr2;
    public FieldDef dvdtitulartra;
    public FieldDef dvdpartdecltra;
    public FieldDef dvdpartconytra;
    public FieldDef dvdsituaciotra;
    public FieldDef dvdrefcatastra;
    public FieldDef dvdnifarrend;
    public FieldDef dvdnifext;
    public FieldDef dvdtitular5;
    public FieldDef dvdpartdec5;
    public FieldDef dvdpartcon5;
    public FieldDef dvdsituacio5;
    public FieldDef dvdrefcatas5;
    public FieldDef dvdtitular6;
    public FieldDef dvdpartdec6;
    public FieldDef dvdpartcon6;
    public FieldDef dvdsituacio6;
    public FieldDef dvdrefcatas6;
    public FieldDef dvdtitular7;
    public FieldDef dvdpartdec7;
    public FieldDef dvdpartcon7;
    public FieldDef dvdsituacio7;
    public FieldDef dvdrefcatas7;
    public FieldDef dvdtitular8;
    public FieldDef dvdpartdec8;
    public FieldDef dvdpartcon8;
    public FieldDef dvdsituacio8;
    public FieldDef dvdrefcatas8;
    public TabDatosvivienda(String name)
      {
      super(name);
      dvdejeraplic = new FieldDef("dvdejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dvddeclaran = new FieldDef("dvddeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dvdmuf = new FieldDef("dvdmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      dvdtitularvda = new FieldDef("dvdtitularvda",FieldDef.INTEGER,0);
      dvdpartdeclvda = new FieldDef("dvdpartdeclvda",FieldDef.FLOAT,6,0);
      dvdpartconyvda = new FieldDef("dvdpartconyvda",FieldDef.FLOAT,6,0);
      dvdsituaciovda = new FieldDef("dvdsituaciovda",FieldDef.INTEGER,0);
      dvdrefcatasvda = new FieldDef("dvdrefcatasvda",FieldDef.CHAR,20);
      dvdtitulargr1 = new FieldDef("dvdtitulargr1",FieldDef.INTEGER,0);
      dvdpartdeclgr1 = new FieldDef("dvdpartdeclgr1",FieldDef.FLOAT,6,0);
      dvdpartconygr1 = new FieldDef("dvdpartconygr1",FieldDef.FLOAT,6,0);
      dvdsituaciogr1 = new FieldDef("dvdsituaciogr1",FieldDef.INTEGER,0);
      dvdrefcatasgr1 = new FieldDef("dvdrefcatasgr1",FieldDef.CHAR,20);
      dvdtitulargr2 = new FieldDef("dvdtitulargr2",FieldDef.INTEGER,0);
      dvdpartdeclgr2 = new FieldDef("dvdpartdeclgr2",FieldDef.FLOAT,6,0);
      dvdpartconygr2 = new FieldDef("dvdpartconygr2",FieldDef.FLOAT,6,0);
      dvdsituaciogr2 = new FieldDef("dvdsituaciogr2",FieldDef.INTEGER,0);
      dvdrefcatasgr2 = new FieldDef("dvdrefcatasgr2",FieldDef.CHAR,20);
      dvdtitulartra = new FieldDef("dvdtitulartra",FieldDef.INTEGER,0);
      dvdpartdecltra = new FieldDef("dvdpartdecltra",FieldDef.FLOAT,6,0);
      dvdpartconytra = new FieldDef("dvdpartconytra",FieldDef.FLOAT,6,0);
      dvdsituaciotra = new FieldDef("dvdsituaciotra",FieldDef.INTEGER,0);
      dvdrefcatastra = new FieldDef("dvdrefcatastra",FieldDef.CHAR,20);
      dvdnifarrend = new FieldDef("dvdnifarrend",FieldDef.CHAR,15);
      dvdnifext = new FieldDef("dvdnifext",FieldDef.CHAR,25);
      dvdtitular5 = new FieldDef("dvdtitular5",FieldDef.INTEGER,0);
      dvdpartdec5 = new FieldDef("dvdpartdec5",FieldDef.FLOAT,6,0);
      dvdpartcon5 = new FieldDef("dvdpartcon5",FieldDef.FLOAT,6,0);
      dvdsituacio5 = new FieldDef("dvdsituacio5",FieldDef.INTEGER,0);
      dvdrefcatas5 = new FieldDef("dvdrefcatas5",FieldDef.CHAR,20);
      dvdtitular6 = new FieldDef("dvdtitular6",FieldDef.INTEGER,0);
      dvdpartdec6 = new FieldDef("dvdpartdec6",FieldDef.FLOAT,6,0);
      dvdpartcon6 = new FieldDef("dvdpartcon6",FieldDef.FLOAT,6,0);
      dvdsituacio6 = new FieldDef("dvdsituacio6",FieldDef.INTEGER,0);
      dvdrefcatas6 = new FieldDef("dvdrefcatas6",FieldDef.CHAR,20);
      dvdtitular7 = new FieldDef("dvdtitular7",FieldDef.INTEGER,0);
      dvdpartdec7 = new FieldDef("dvdpartdec7",FieldDef.FLOAT,6,0);
      dvdpartcon7 = new FieldDef("dvdpartcon7",FieldDef.FLOAT,6,0);
      dvdsituacio7 = new FieldDef("dvdsituacio7",FieldDef.INTEGER,0);
      dvdrefcatas7 = new FieldDef("dvdrefcatas7",FieldDef.CHAR,20);
      dvdtitular8 = new FieldDef("dvdtitular8",FieldDef.INTEGER,0);
      dvdpartdec8 = new FieldDef("dvdpartdec8",FieldDef.FLOAT,6,0);
      dvdpartcon8 = new FieldDef("dvdpartcon8",FieldDef.FLOAT,6,0);
      dvdsituacio8 = new FieldDef("dvdsituacio8",FieldDef.INTEGER,0);
      dvdrefcatas8 = new FieldDef("dvdrefcatas8",FieldDef.CHAR,20);
      FieldDef array[] = {
        dvdejeraplic,
        dvddeclaran,
        dvdmuf,
        dvdtitularvda,
        dvdpartdeclvda,
        dvdpartconyvda,
        dvdsituaciovda,
        dvdrefcatasvda,
        dvdtitulargr1,
        dvdpartdeclgr1,
        dvdpartconygr1,
        dvdsituaciogr1,
        dvdrefcatasgr1,
        dvdtitulargr2,
        dvdpartdeclgr2,
        dvdpartconygr2,
        dvdsituaciogr2,
        dvdrefcatasgr2,
        dvdtitulartra,
        dvdpartdecltra,
        dvdpartconytra,
        dvdsituaciotra,
        dvdrefcatastra,
        dvdnifarrend,
        dvdnifext,
        dvdtitular5,
        dvdpartdec5,
        dvdpartcon5,
        dvdsituacio5,
        dvdrefcatas5,
        dvdtitular6,
        dvdpartdec6,
        dvdpartcon6,
        dvdsituacio6,
        dvdrefcatas6,
        dvdtitular7,
        dvdpartdec7,
        dvdpartcon7,
        dvdsituacio7,
        dvdrefcatas7,
        dvdtitular8,
        dvdpartdec8,
        dvdpartcon8,
        dvdsituacio8,
        dvdrefcatas8        
        };
      setColumns(array);
      FieldDef arrayf[] = {dvdejeraplic,dvddeclaran,dvdmuf };
      setDescription("Datos adicionales vivienda");
      setPrimaryKeys(arrayf);
      dvdejeraplic.setDescription("Ejercicio aplicacion");
      dvddeclaran.setDescription("CODIGO DE DECLARANTE");
      dvdmuf.setDescription("[D]eclarante, [C]onyuge");
      dvdtitularvda.setDescription("1 Titularidad vivienda");
      dvdpartdeclvda.setDescription("1 % particip. declarante vivienda 1");
      dvdpartconyvda.setDescription("1 % particip. conyuge vivienda 1");
      dvdsituaciovda.setDescription("1 Situacion   vivienda 1");
      dvdrefcatasvda.setDescription("1 Referencia  catastral vivienda");
      dvdtitulargr1.setDescription("2 Titularidad garaje 1");
      dvdpartdeclgr1.setDescription("2 % particip. declarante garaje 1");
      dvdpartconygr1.setDescription("2 % particip. conyuge garaje 1");
      dvdsituaciogr1.setDescription("2 Situacion   garaje 1");
      dvdrefcatasgr1.setDescription("2 Referencia  catastral garaje 1");
      dvdtitulargr2.setDescription("3 Titularidad garaje 2");
      dvdpartdeclgr2.setDescription("3 % particip. declarante garaje 2");
      dvdpartconygr2.setDescription("3 % particip. conyuge garaje 2");
      dvdsituaciogr2.setDescription("3 Situacion   garaje 2");
      dvdrefcatasgr2.setDescription("3 Referencia  catastral garaje 2");
      dvdtitulartra.setDescription("4 Titularidad trastero o anexo");
      dvdpartdecltra.setDescription("4 % particip. trastero o anexo");
      dvdpartconytra.setDescription("4 % particip. trastero o anexo");
      dvdsituaciotra.setDescription("4 Situacion   trastero o anexo");
      dvdrefcatastra.setDescription("4 Referencia  trastero o anexo");
      dvdnifarrend.setDescription("NIF arrendador");
      dvdnifext.setDescription("Nro identificacio pais de residencia");
      dvdtitular5.setDescription("5 Titularidad Vda,parking o trastero 5");
      dvdpartdec5.setDescription("5 % part.Dec. Vda,parking o trastero 5");
      dvdpartcon5.setDescription("5 % part.Con. Vda,parking o trastero 5");
      dvdsituacio5.setDescription("5 Situacion   Vda,parking o trastero 5");
      dvdrefcatas5.setDescription("5 Referencia  Vda,parking o trastero 5");
      dvdtitular6.setDescription("6 Titularidad Vda,parking o trastero 6");
      dvdpartdec6.setDescription("6 % part.Dec. Vda,parking o trastero 6");
      dvdpartcon6.setDescription("6 % part.Con. Vda,parking o trastero 6");
      dvdsituacio6.setDescription("6 Situacion   Vda,parking o trastero 6");
      dvdrefcatas6.setDescription("6 Referencia  Vda,parking o trastero 6");
      dvdtitular7.setDescription("7 Titularidad Vda,parking o trastero 7");
      dvdpartdec7.setDescription("7 % part.Dec. Vda,parking o trastero 7");
      dvdpartcon7.setDescription("7 % part.Con. Vda,parking o trastero 7");
      dvdsituacio7.setDescription("7 Situacion   Vda,parking o trastero 7");
      dvdrefcatas7.setDescription("7 Referencia  Vda,parking o trastero 7");
      dvdtitular8.setDescription("8 Titularidad Vda,parking o trastero 8");
      dvdpartdec8.setDescription("8 % part.Dec. Vda,parking o trastero 8");
      dvdpartcon8.setDescription("8 % part.Con. Vda,parking o trastero 8");
      dvdsituacio8.setDescription("8 Situacion   Vda,parking o trastero 8");
      dvdrefcatas8.setDescription("8 Referencia  Vda,parking o trastero 8");
      }
    }
    
  public class TabParamdespacho extends TableDef
    {
    // Campos
    public FieldDef parejerfiscal;
    public FieldDef partutelado;
    public FieldDef parmiembro;
    public FieldDef parmiembro2;
    public FieldDef parreten_inmob;
    public FieldDef parreten_mobil;
    public FieldDef parreten_gananc;
    public FieldDef parmobil_irregu;
    public FieldDef parincdisfim;
    public FieldDef parapor_conyuge;
    public FieldDef parded_auton_vd;
    public FieldDef parinter_demora;
    public FieldDef parfracsegplazo;
    public FieldDef parsuspension;
    public FieldDef parborrador;
    public FieldDef paralertas_sms;
    public FieldDef partborrador;
    public FieldDef parborrador_web;
    public FieldDef parprecalinvers;
    public FieldDef parprecalcompen;
    public FieldDef parprecaldeuda;
    public FieldDef parprecalimpres;
    public FieldDef parprecaldecren;
    public FieldDef parprecaldecpat;
    public FieldDef parprecalconsum;
    public FieldDef parprecalresume;
    public FieldDef parimprcompensa;
    public FieldDef parprecallgener;
    public FieldDef parprecaltipoli;
    public FieldDef parprecaldesglo;
    public FieldDef partipoinmueble;
    public FieldDef paridiomaimp;
    public FieldDef paraltadecnum;
    public FieldDef paragrupar;
    public FieldDef parapor_fpcant;
    public FieldDef pardeftrabajo;
    public FieldDef pardefmobil;
    public FieldDef pardefganan;
    public FieldDef pardefinmob;
    public FieldDef pardefotropat;
    public FieldDef pardefestima;
    public FieldDef pardefactiv;
    public FieldDef pardefingreso;
    public FieldDef pardefcobro;
    public FieldDef pardefiglesia;
    public FieldDef paravisoejer;
    public FieldDef parnobtcalcular;
    public FieldDef paragruparctas;
    public FieldDef parlimites720;
    public FieldDef paringresos;
    public FieldDef par65ganvda;
    public FieldDef pardefactpral;
    public FieldDef parprecalcero;
    public FieldDef pardefordmobil;
    public FieldDef pardefordinmob;
    public FieldDef parpantamax;
    public FieldDef parprecalobserv;
    public FieldDef pardacionganvda;
    public FieldDef partelefono;
    public TabParamdespacho(String name)
      {
      super(name);
      parejerfiscal = new FieldDef("parejerfiscal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      partutelado = new FieldDef("partutelado",FieldDef.INTEGER,0);
      parmiembro = new FieldDef("parmiembro",FieldDef.CHAR,1);
      parmiembro2 = new FieldDef("parmiembro2",FieldDef.CHAR,1);
      parreten_inmob = new FieldDef("parreten_inmob",FieldDef.CHAR,1);
      parreten_mobil = new FieldDef("parreten_mobil",FieldDef.CHAR,1);
      parreten_gananc = new FieldDef("parreten_gananc",FieldDef.CHAR,1);
      parmobil_irregu = new FieldDef("parmobil_irregu",FieldDef.CHAR,1);
      parincdisfim = new FieldDef("parincdisfim",FieldDef.CHAR,1);
      parapor_conyuge = new FieldDef("parapor_conyuge",FieldDef.CHAR,1);
      parded_auton_vd = new FieldDef("parded_auton_vd",FieldDef.CHAR,1);
      parinter_demora = new FieldDef("parinter_demora",FieldDef.CHAR,1);
      parfracsegplazo = new FieldDef("parfracsegplazo",FieldDef.CHAR,1);
      parsuspension = new FieldDef("parsuspension",FieldDef.CHAR,1);
      parborrador = new FieldDef("parborrador",FieldDef.CHAR,1);
      paralertas_sms = new FieldDef("paralertas_sms",FieldDef.CHAR,1);
      partborrador = new FieldDef("partborrador",FieldDef.CHAR,1);
      parborrador_web = new FieldDef("parborrador_web",FieldDef.CHAR,1);
      parprecalinvers = new FieldDef("parprecalinvers",FieldDef.CHAR,1);
      parprecalcompen = new FieldDef("parprecalcompen",FieldDef.CHAR,1);
      parprecaldeuda = new FieldDef("parprecaldeuda",FieldDef.CHAR,1);
      parprecalimpres = new FieldDef("parprecalimpres",FieldDef.CHAR,1);
      parprecaldecren = new FieldDef("parprecaldecren",FieldDef.CHAR,1);
      parprecaldecpat = new FieldDef("parprecaldecpat",FieldDef.CHAR,1);
      parprecalconsum = new FieldDef("parprecalconsum",FieldDef.CHAR,1);
      parprecalresume = new FieldDef("parprecalresume",FieldDef.CHAR,1);
      parimprcompensa = new FieldDef("parimprcompensa",FieldDef.CHAR,1);
      parprecallgener = new FieldDef("parprecallgener",FieldDef.CHAR,1);
      parprecaltipoli = new FieldDef("parprecaltipoli",FieldDef.CHAR,1);
      parprecaldesglo = new FieldDef("parprecaldesglo",FieldDef.CHAR,1);
      partipoinmueble = new FieldDef("partipoinmueble",FieldDef.CHAR,1);
      paridiomaimp = new FieldDef("paridiomaimp",FieldDef.CHAR,1);
      paraltadecnum = new FieldDef("paraltadecnum",FieldDef.CHAR,1);
      paragrupar = new FieldDef("paragrupar",FieldDef.CHAR,1);
      parapor_fpcant = new FieldDef("parapor_fpcant",FieldDef.CHAR,1);
      pardeftrabajo = new FieldDef("pardeftrabajo",FieldDef.CHAR,3);
      pardefmobil = new FieldDef("pardefmobil",FieldDef.CHAR,5);
      pardefganan = new FieldDef("pardefganan",FieldDef.CHAR,3);
      pardefinmob = new FieldDef("pardefinmob",FieldDef.CHAR,2);
      pardefotropat = new FieldDef("pardefotropat",FieldDef.CHAR,2);
      pardefestima = new FieldDef("pardefestima",FieldDef.CHAR,3);
      pardefactiv = new FieldDef("pardefactiv",FieldDef.CHAR,1);
      pardefingreso = new FieldDef("pardefingreso",FieldDef.CHAR,2);
      pardefcobro = new FieldDef("pardefcobro",FieldDef.CHAR,2);
      pardefiglesia = new FieldDef("pardefiglesia",FieldDef.CHAR,1);
      paravisoejer = new FieldDef("paravisoejer",FieldDef.CHAR,1);
      parnobtcalcular = new FieldDef("parnobtcalcular",FieldDef.CHAR,1);
      paragruparctas = new FieldDef("paragruparctas",FieldDef.CHAR,1);
      parlimites720 = new FieldDef("parlimites720",FieldDef.CHAR,1);
      paringresos = new FieldDef("paringresos",FieldDef.CHAR,1);
      par65ganvda = new FieldDef("par65ganvda",FieldDef.CHAR,1);
      pardefactpral = new FieldDef("pardefactpral",FieldDef.CHAR,1);
      parprecalcero = new FieldDef("parprecalcero",FieldDef.CHAR,1);
      pardefordmobil = new FieldDef("pardefordmobil",FieldDef.INTEGER,0);
      pardefordinmob = new FieldDef("pardefordinmob",FieldDef.INTEGER,0);
      parpantamax = new FieldDef("parpantamax",FieldDef.CHAR,1);
      parprecalobserv = new FieldDef("parprecalobserv",FieldDef.CHAR,1);
      pardacionganvda = new FieldDef("pardacionganvda",FieldDef.CHAR,1);
      partelefono = new FieldDef("partelefono",FieldDef.CHAR,1);
      FieldDef array[] = {
        parejerfiscal,
        partutelado,
        parmiembro,
        parmiembro2,
        parreten_inmob,
        parreten_mobil,
        parreten_gananc,
        parmobil_irregu,
        parincdisfim,
        parapor_conyuge,
        parded_auton_vd,
        parinter_demora,
        parfracsegplazo,
        parsuspension,
        parborrador,
        paralertas_sms,
        partborrador,
        parborrador_web,
        parprecalinvers,
        parprecalcompen,
        parprecaldeuda,
        parprecalimpres,
        parprecaldecren,
        parprecaldecpat,
        parprecalconsum,
        parprecalresume,
        parimprcompensa,
        parprecallgener,
        parprecaltipoli,
        parprecaldesglo,
        partipoinmueble,
        paridiomaimp,
        paraltadecnum,
        paragrupar,
        parapor_fpcant,
        pardeftrabajo,
        pardefmobil,
        pardefganan,
        pardefinmob,
        pardefotropat,
        pardefestima,
        pardefactiv,
        pardefingreso,
        pardefcobro,
        pardefiglesia,
        paravisoejer,
        parnobtcalcular,
        paragruparctas,
        parlimites720,
        paringresos,
        par65ganvda,
        pardefactpral,
        parprecalcero,
        pardefordmobil,
        pardefordinmob,
        parpantamax,
        parprecalobserv,
        pardacionganvda,
        partelefono        
        };
      setColumns(array);
      FieldDef arrayf[] = {parejerfiscal };
      setDescription("Parametros despacho");
      setPrimaryKeys(arrayf);
      parejerfiscal.setDescription("Ejercicio fiscal");
      partutelado.setDescription("Tutelar al usuario con mensaj.");
      parmiembro.setDescription("Matrimonios MUF por defecto");
      parmiembro2.setDescription("MUF por defecto en decl.indiv.");
      parreten_inmob.setDescription("Calcular retencion cap.inmob.");
      parreten_mobil.setDescription("Calcular retencion mobiliario");
      parreten_gananc.setDescription("Calcular retencion ganancias");
      parmobil_irregu.setDescription("Valores mobiliarios:irregular");
      parincdisfim.setDescription("Ganancias patrimoniales-FIM");
      parapor_conyuge.setDescription("Aplicar aport.favor cony");
      parded_auton_vd.setDescription("Aplicar ded.autonomic.vivienda");
      parinter_demora.setDescription("Calcular intereses de demora");
      parfracsegplazo.setDescription("Fracciona segundo plazo");
      parsuspension.setDescription("Solicita suspension Renta");
      parborrador.setDescription("Borrador datos fiscales");
      paralertas_sms.setDescription("Servicio de alertas a moviles");
      partborrador.setDescription("Borrador individual dec.conj.");
      parborrador_web.setDescription("Borrador en pagina web");
      parprecalinvers.setDescription("Limite o Importes inver.empres");
      parprecalcompen.setDescription("Limite/Importes compensaciones");
      parprecaldeuda.setDescription("Deuda cuota Renta en Patrimon.");
      parprecalimpres.setDescription("Obtener listados precalculos");
      parprecaldecren.setDescription("Obtener impresora calc.Renta");
      parprecaldecpat.setDescription("Obtener impresora calc.Patrim.");
      parprecalconsum.setDescription("Se obtiene consumo de Renta");
      parprecalresume.setDescription("Obtener impresora resumen");
      parimprcompensa.setDescription("Obtener impres.compensaciones");
      parprecallgener.setDescription("Obtener el listado general");
      parprecaltipoli.setDescription("Tipo de liquidacion");
      parprecaldesglo.setDescription("Detalle de los calculos");
      partipoinmueble.setDescription("Inmuebles separados por tipo");
      paridiomaimp.setDescription("Idioma impresion");
      paraltadecnum.setDescription("Alta numerica codigo declarante");
      paragrupar.setDescription("Agrupar registros modelo 100 (pag 4-9)");
      parapor_fpcant.setDescription("Aplicar aport.favor cónyuge a los fpe pdtes de ej.anteriores");
      pardeftrabajo.setDescription("Valor defecto trabajo personal clase  SU");
      pardefmobil.setDescription("Valor defecto cap.mobiliario   clase  ACB");
      pardefganan.setDescription("Valor defecto ganancias/perd.  tipoValor ACB");
      pardefinmob.setDescription("Valor defecto inmobiliario     uso AR");
      pardefotropat.setDescription("Valor defecto otro patrimonio  apartado DB");
      pardefestima.setDescription("Valor defecto activ. estimacion EDS");
      pardefactiv.setDescription("Valor defecto activ. tipoActivida E");
      pardefingreso.setDescription("Valor defecto finaliz.  ingreso DO");
      pardefcobro.setDescription("Valor defecto finaliz.  cobro   TR");
      pardefiglesia.setDescription("Valor defecto finaliz.  0,1-Iglesia,2-Obra social,3-Ambas");
      paravisoejer.setDescription("Mostrar aviso ejercicio fiscal activo");
      parnobtcalcular.setDescription("Desactivar boton calcular del Precalculo si Renta-Patrim L");
      paragruparctas.setDescription("Totalitzar CtaCtes en 1 reg 714 apartat E");
      parlimites720.setDescription("Aplicar limites 720 S/N");
      paringresos.setDescription("No controlar ingresos trabajo-actividades para ded.autonomicas");
      par65ganvda.setDescription("Mostrar ganancia exenta vda habitual major 65 o dependiente");
      pardefactpral.setDescription("Valor defecto activ. actividad pral");
      parprecalcero.setDescription("Imprimir precalculo las lineas a cero");
      pardefordmobil.setDescription("Orden defecto pantalla cap.Mobiliario");
      pardefordinmob.setDescription("Orden defecto pantalla cap.Inmobiliario (franges)");
      parpantamax.setDescription("Obrir maximizada aplicacion");
      parprecalobserv.setDescription("Avisos precalculo: incluir mensajes tiene observaciones");
      pardacionganvda.setDescription("Mostrar ganancia exenta dacion en pago vda habitual");
      partelefono.setDescription("Trasladar a declaracion telefonos");
      }
    }
    
  public class TabInmobdetalle extends TableDef
    {
    // Campos
    public FieldDef indejeraplic;
    public FieldDef inddeclaran;
    public FieldDef indidentinmob;
    public FieldDef indnumcontrato;
    public FieldDef indcontrato;
    public FieldDef indaplicredvda;
    public FieldDef indvalcatastral;
    public FieldDef indvalcompra;
    public FieldDef indvalsuelo;
    public FieldDef indvalsuelocomp;
    public FieldDef indmejoras;
    public FieldDef indedadusufruct;
    public FieldDef indvalorbien;
    public FieldDef indvalpatrim;
    public FieldDef indimputrentas;
    public FieldDef indrdtointegro;
    public FieldDef indimputminima;
    public FieldDef indgaspdte;
    public FieldDef indintereses;
    public FieldDef indtributos;
    public FieldDef indgastostercer;
    public FieldDef inddudosocobro;
    public FieldDef indconservacion;
    public FieldDef indseguros;
    public FieldDef indservicios;
    public FieldDef indporamort;
    public FieldDef indamortizacion;
    public FieldDef indbienesmueble;
    public FieldDef indcompenfiscal;
    public FieldDef indtotgastos;
    public FieldDef indreducrdtovda;
    public FieldDef indreduc100;
    public FieldDef indreduc50;
    public FieldDef indirregular;
    public FieldDef indporcenreduc;
    public FieldDef indreducirregul;
    public FieldDef indrendimiento;
    public FieldDef indretencion;
    public FieldDef indfechaadquisi;
    public FieldDef indcapital;
    public FieldDef indcapitalpdte;
    public FieldDef indporcdeducc;
    public FieldDef indcappdteant;
    public FieldDef indcapital3;
    public FieldDef indnroprestamo;
    public FieldDef indporprestamo;
    public FieldDef indinteresded;
    public FieldDef indcapitalded;
    public FieldDef inddedvdat1;
    public FieldDef inddedvdat2;
    public FieldDef indgas1ha;
    public FieldDef indgas2ha;
    public FieldDef indgas3ha;
    public FieldDef indbaseamort;
    public FieldDef indanysamort;
    public FieldDef indrendnetored;
    public FieldDef indexencion;
    public FieldDef indaplicpresta;
    public FieldDef indextranjero;
    public FieldDef indsindedu;
    public FieldDef indsinpatrim;
    public FieldDef indcanvivuelo;
    public FieldDef indcondedu;
    public TabInmobdetalle(String name)
      {
      super(name);
      indejeraplic = new FieldDef("indejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      inddeclaran = new FieldDef("inddeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      indidentinmob = new FieldDef("indidentinmob",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      indnumcontrato = new FieldDef("indnumcontrato",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      indcontrato = new FieldDef("indcontrato",FieldDef.CHAR,1);
      indaplicredvda = new FieldDef("indaplicredvda",FieldDef.CHAR,1);
      indvalcatastral = new FieldDef("indvalcatastral",FieldDef.FLOAT,6,0);
      indvalcompra = new FieldDef("indvalcompra",FieldDef.FLOAT,6,0);
      indvalsuelo = new FieldDef("indvalsuelo",FieldDef.FLOAT,6,0);
      indvalsuelocomp = new FieldDef("indvalsuelocomp",FieldDef.FLOAT,6,0);
      indmejoras = new FieldDef("indmejoras",FieldDef.FLOAT,6,0);
      indedadusufruct = new FieldDef("indedadusufruct",FieldDef.INTEGER,0);
      indvalorbien = new FieldDef("indvalorbien",FieldDef.FLOAT,6,0);
      indvalpatrim = new FieldDef("indvalpatrim",FieldDef.FLOAT,6,0);
      indimputrentas = new FieldDef("indimputrentas",FieldDef.FLOAT,6,0);
      indrdtointegro = new FieldDef("indrdtointegro",FieldDef.FLOAT,6,0);
      indimputminima = new FieldDef("indimputminima",FieldDef.FLOAT,6,0);
      indgaspdte = new FieldDef("indgaspdte",FieldDef.FLOAT,6,0);
      indintereses = new FieldDef("indintereses",FieldDef.FLOAT,6,0);
      indtributos = new FieldDef("indtributos",FieldDef.FLOAT,6,0);
      indgastostercer = new FieldDef("indgastostercer",FieldDef.FLOAT,6,0);
      inddudosocobro = new FieldDef("inddudosocobro",FieldDef.FLOAT,6,0);
      indconservacion = new FieldDef("indconservacion",FieldDef.FLOAT,6,0);
      indseguros = new FieldDef("indseguros",FieldDef.FLOAT,6,0);
      indservicios = new FieldDef("indservicios",FieldDef.FLOAT,6,0);
      indporamort = new FieldDef("indporamort",FieldDef.FLOAT,6,0);
      indamortizacion = new FieldDef("indamortizacion",FieldDef.FLOAT,6,0);
      indbienesmueble = new FieldDef("indbienesmueble",FieldDef.FLOAT,6,0);
      indcompenfiscal = new FieldDef("indcompenfiscal",FieldDef.FLOAT,6,0);
      indtotgastos = new FieldDef("indtotgastos",FieldDef.FLOAT,6,0);
      indreducrdtovda = new FieldDef("indreducrdtovda",FieldDef.FLOAT,6,0);
      indreduc100 = new FieldDef("indreduc100",FieldDef.FLOAT,6,0);
      indreduc50 = new FieldDef("indreduc50",FieldDef.FLOAT,6,0);
      indirregular = new FieldDef("indirregular",FieldDef.CHAR,1);
      indporcenreduc = new FieldDef("indporcenreduc",FieldDef.INTEGER,0);
      indreducirregul = new FieldDef("indreducirregul",FieldDef.FLOAT,6,0);
      indrendimiento = new FieldDef("indrendimiento",FieldDef.FLOAT,6,0);
      indretencion = new FieldDef("indretencion",FieldDef.FLOAT,6,0);
      indfechaadquisi = new FieldDef("indfechaadquisi",FieldDef.DATE);
      indcapital = new FieldDef("indcapital",FieldDef.FLOAT,6,0);
      indcapitalpdte = new FieldDef("indcapitalpdte",FieldDef.FLOAT,6,0);
      indporcdeducc = new FieldDef("indporcdeducc",FieldDef.INTEGER,0);
      indcappdteant = new FieldDef("indcappdteant",FieldDef.FLOAT,6,0);
      indcapital3 = new FieldDef("indcapital3",FieldDef.FLOAT,6,0);
      indnroprestamo = new FieldDef("indnroprestamo",FieldDef.CHAR,20);
      indporprestamo = new FieldDef("indporprestamo",FieldDef.FLOAT,6,0);
      indinteresded = new FieldDef("indinteresded",FieldDef.FLOAT,6,0);
      indcapitalded = new FieldDef("indcapitalded",FieldDef.FLOAT,6,0);
      inddedvdat1 = new FieldDef("inddedvdat1",FieldDef.FLOAT,6,0);
      inddedvdat2 = new FieldDef("inddedvdat2",FieldDef.FLOAT,6,0);
      indgas1ha = new FieldDef("indgas1ha",FieldDef.FLOAT,6,0);
      indgas2ha = new FieldDef("indgas2ha",FieldDef.FLOAT,6,0);
      indgas3ha = new FieldDef("indgas3ha",FieldDef.FLOAT,6,0);
      indbaseamort = new FieldDef("indbaseamort",FieldDef.FLOAT,6,0);
      indanysamort = new FieldDef("indanysamort",FieldDef.INTEGER,0);
      indrendnetored = new FieldDef("indrendnetored",FieldDef.FLOAT,6,0);
      indexencion = new FieldDef("indexencion",FieldDef.FLOAT,6,0);
      indaplicpresta = new FieldDef("indaplicpresta",FieldDef.CHAR,1);
      indextranjero = new FieldDef("indextranjero",FieldDef.CHAR,1);
      indsindedu = new FieldDef("indsindedu",FieldDef.CHAR,1);
      indsinpatrim = new FieldDef("indsinpatrim",FieldDef.CHAR,1);
      indcanvivuelo = new FieldDef("indcanvivuelo",FieldDef.CHAR,1);
      indcondedu = new FieldDef("indcondedu",FieldDef.CHAR,1);
      FieldDef array[] = {
        indejeraplic,
        inddeclaran,
        indidentinmob,
        indnumcontrato,
        indcontrato,
        indaplicredvda,
        indvalcatastral,
        indvalcompra,
        indvalsuelo,
        indvalsuelocomp,
        indmejoras,
        indedadusufruct,
        indvalorbien,
        indvalpatrim,
        indimputrentas,
        indrdtointegro,
        indimputminima,
        indgaspdte,
        indintereses,
        indtributos,
        indgastostercer,
        inddudosocobro,
        indconservacion,
        indseguros,
        indservicios,
        indporamort,
        indamortizacion,
        indbienesmueble,
        indcompenfiscal,
        indtotgastos,
        indreducrdtovda,
        indreduc100,
        indreduc50,
        indirregular,
        indporcenreduc,
        indreducirregul,
        indrendimiento,
        indretencion,
        indfechaadquisi,
        indcapital,
        indcapitalpdte,
        indporcdeducc,
        indcappdteant,
        indcapital3,
        indnroprestamo,
        indporprestamo,
        indinteresded,
        indcapitalded,
        inddedvdat1,
        inddedvdat2,
        indgas1ha,
        indgas2ha,
        indgas3ha,
        indbaseamort,
        indanysamort,
        indrendnetored,
        indexencion,
        indaplicpresta,
        indextranjero,
        indsindedu,
        indsinpatrim,
        indcanvivuelo,
        indcondedu        
        };
      setColumns(array);
      FieldDef arrayf[] = {indejeraplic,inddeclaran,indidentinmob,indnumcontrato };
      setDescription("Datos economicos capital inmobiliario");
      setPrimaryKeys(arrayf);
      indejeraplic.setDescription("Ejercicio aplicacion");
      inddeclaran.setDescription("CODIGO DE DECLARANTE");
      indidentinmob.setDescription("Identificador inmobiliario");
      indnumcontrato.setDescription("Codigo de contrato");
      indcontrato.setDescription("Contrato actualizado");
      indaplicredvda.setDescription("Aplicar reduccion vivienda");
      indvalcatastral.setDescription("Valor catastral");
      indvalcompra.setDescription("Valor compra");
      indvalsuelo.setDescription("Valor suelo catastral");
      indvalsuelocomp.setDescription("Valor suelo compra");
      indmejoras.setDescription("Mejoras Efectuadas");
      indedadusufruct.setDescription("Edad usufructuario");
      indvalorbien.setDescription("Valor bien usufr.");
      indvalpatrim.setDescription("Valor Patrimonio");
      indimputrentas.setDescription("Imputacion de rentas");
      indrdtointegro.setDescription("Rendimiento integro");
      indimputminima.setDescription("Imputacion minima AF");
      indgaspdte.setDescription("Gastos pdtes. ejer. anter.");
      indintereses.setDescription("Intereses ajenos invert.");
      indtributos.setDescription("Tributos no estatales");
      indgastostercer.setDescription("Gastos de terceros");
      inddudosocobro.setDescription("Saldos de dudoso cobro");
      indconservacion.setDescription("Conservacion y reparac.");
      indseguros.setDescription("Contratos de seguro");
      indservicios.setDescription("Servicios o suministros");
      indporamort.setDescription("Porcentaje amortizacion vuelo");
      indamortizacion.setDescription("Amortizacion");
      indbienesmueble.setDescription("Bienes muebles");
      indcompenfiscal.setDescription("Compensacion Fiscal");
      indtotgastos.setDescription("Total gastos");
      indreducrdtovda.setDescription("Reduccion rdto. neto");
      indreduc100.setDescription("Reduccion vda. parte 100%");
      indreduc50.setDescription("Reduccion vda. parte 50%");
      indirregular.setDescription("Rendimiento irregular");
      indporcenreduc.setDescription("Reduccion");
      indreducirregul.setDescription("Importe reduc. rdto. irregular");
      indrendimiento.setDescription("Rendimiento neto");
      indretencion.setDescription("Retenciones practicadas");
      indfechaadquisi.setDescription("Fecha adquisicion");
      indcapital.setDescription("Capital amortizado ejercicio");
      indcapitalpdte.setDescription("Capital pendiente amortizar");
      indporcdeducc.setDescription("% Deduccion");
      indcappdteant.setDescription("Capital pdte.amortizar ej.ant.");
      indcapital3.setDescription("Deduccion sin financiar");
      indnroprestamo.setDescription("Identificador prestamo");
      indporprestamo.setDescription("Porcentaje prestamo   / Porcen.Disponibilidad");
      indinteresded.setDescription("Intereses ajenos invert.");
      indcapitalded.setDescription("Capital amortizado ejercicio");
      inddedvdat1.setDescription("Ded.Vda.Auton. Tramo 1");
      inddedvdat2.setDescription("Ded.Vda.Auton. Tramo 2");
      indgas1ha.setDescription("Gasto 1 Financiacion HA  primas de seguros");
      indgas2ha.setDescription("Gasto 2 Financiacion HA  coberturas");
      indgas3ha.setDescription("Gasto 3 Financiacion HA  gastos adquisicion");
      indbaseamort.setDescription("Base amortizacion");
      indanysamort.setDescription("Nro. años");
      indrendnetored.setDescription("Rendimiento neto reducido");
      indexencion.setDescription("Porcentaje Exencion");
      indaplicpresta.setDescription("Aplicar % del prestamo a financ.ajena");
      indextranjero.setDescription("Valor inmobiliario en extranjero 720");
      indsindedu.setDescription("Sin deduccion  No calcular deduc.vda.habitual");
      indsinpatrim.setDescription("Sin patrimonio No calcular patrimoni AC-afectes");
      indcanvivuelo.setDescription("Cambiar porcentaje vuelo al 70% (amortizacion)");
      indcondedu.setDescription("Con deduccion  Calcular deduc.vda.habitual");
      }
    }
    
  public class TabIngresosagric extends TableDef
    {
    // Campos
    public FieldDef ingejeraplic;
    public FieldDef ingdeclaran;
    public FieldDef ingidentactiv;
    public FieldDef ingcodproducto;
    public FieldDef ingcodindice;
    public FieldDef ingindpiensos;
    public FieldDef inghectpropias;
    public FieldDef inghectarrend;
    public FieldDef ingingresos;
    public FieldDef ingingrarrend;
    public FieldDef ingsubcorrien;
    public FieldDef ingsubcapital;
    public FieldDef ingsubarrenda;
    public FieldDef ingayudas;
    public FieldDef ingindice;
    public FieldDef ingrendimiento;
    public FieldDef inghecregadio;
    public FieldDef inghecregadiono;
    public FieldDef ingingregadio;
    public FieldDef ingingregadiono;
    public TabIngresosagric(String name)
      {
      super(name);
      ingejeraplic = new FieldDef("ingejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ingdeclaran = new FieldDef("ingdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      ingidentactiv = new FieldDef("ingidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ingcodproducto = new FieldDef("ingcodproducto",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ingcodindice = new FieldDef("ingcodindice",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ingindpiensos = new FieldDef("ingindpiensos",FieldDef.CHAR,1);
      inghectpropias = new FieldDef("inghectpropias",FieldDef.FLOAT,6,0);
      inghectarrend = new FieldDef("inghectarrend",FieldDef.FLOAT,6,0);
      ingingresos = new FieldDef("ingingresos",FieldDef.FLOAT,6,0);
      ingingrarrend = new FieldDef("ingingrarrend",FieldDef.FLOAT,6,0);
      ingsubcorrien = new FieldDef("ingsubcorrien",FieldDef.FLOAT,6,0);
      ingsubcapital = new FieldDef("ingsubcapital",FieldDef.FLOAT,6,0);
      ingsubarrenda = new FieldDef("ingsubarrenda",FieldDef.FLOAT,6,0);
      ingayudas = new FieldDef("ingayudas",FieldDef.FLOAT,6,0);
      ingindice = new FieldDef("ingindice",FieldDef.FLOAT,6,0);
      ingrendimiento = new FieldDef("ingrendimiento",FieldDef.FLOAT,6,0);
      inghecregadio = new FieldDef("inghecregadio",FieldDef.FLOAT,6,0);
      inghecregadiono = new FieldDef("inghecregadiono",FieldDef.FLOAT,6,0);
      ingingregadio = new FieldDef("ingingregadio",FieldDef.FLOAT,6,0);
      ingingregadiono = new FieldDef("ingingregadiono",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ingejeraplic,
        ingdeclaran,
        ingidentactiv,
        ingcodproducto,
        ingcodindice,
        ingindpiensos,
        inghectpropias,
        inghectarrend,
        ingingresos,
        ingingrarrend,
        ingsubcorrien,
        ingsubcapital,
        ingsubarrenda,
        ingayudas,
        ingindice,
        ingrendimiento,
        inghecregadio,
        inghecregadiono,
        ingingregadio,
        ingingregadiono        
        };
      setColumns(array);
      FieldDef arrayf[] = {ingejeraplic,ingdeclaran,ingidentactiv,ingcodproducto,ingcodindice };
      setDescription("Ingresos actividades EO agricola");
      setPrimaryKeys(arrayf);
      ingejeraplic.setDescription("Ejercicio aplicacion");
      ingdeclaran.setDescription("CODIGO DE DECLARANTE");
      ingidentactiv.setDescription("Identificador actividad");
      ingcodproducto.setDescription("Codigo de producto");
      ingcodindice.setDescription("Codigo de indice");
      ingindpiensos.setDescription("Puede aplicar indice piensos terceros");
      inghectpropias.setDescription("Numero hectareas propias");
      inghectarrend.setDescription("Numero hectareas arrendadas");
      ingingresos.setDescription("Total ingresos");
      ingingrarrend.setDescription("Total ingresos arrendadas");
      ingsubcorrien.setDescription("Total subvenciones corrientes");
      ingsubcapital.setDescription("Total subvenciones capital");
      ingsubarrenda.setDescription("Total subvenciones arrendadas");
      ingayudas.setDescription("Total ayudas Ley 3/2010");
      ingindice.setDescription("Indice");
      ingrendimiento.setDescription("Rendimiento base producto");
      inghecregadio.setDescription("Numero hectareas regadio");
      inghecregadiono.setDescription("Resto hectareas no regadio");
      ingingregadio.setDescription("Total ingresos regadio");
      ingingregadiono.setDescription("Total ingresos resto no regadio");
      }
    }
    
  public class TabRdtoacteoagric extends TableDef
    {
    // Campos
    public FieldDef reaejeraplic;
    public FieldDef readeclaran;
    public FieldDef reaidentactiv;
    public FieldDef reaprodajeno;
    public FieldDef reapiensos;
    public FieldDef reacostepers;
    public FieldDef reaagrieco;
    public FieldDef reaforestal;
    public FieldDef reajoven;
    public FieldDef reaingprod1;
    public FieldDef reaindice1;
    public FieldDef reardtoprod1;
    public FieldDef reaingprod2;
    public FieldDef reaindice2;
    public FieldDef reardtoprod2;
    public FieldDef reaingprod3;
    public FieldDef reaindice3;
    public FieldDef reardtoprod3;
    public FieldDef reaingprod4;
    public FieldDef reaindice4;
    public FieldDef reardtoprod4;
    public FieldDef reaingprod5;
    public FieldDef reaindice5;
    public FieldDef reardtoprod5;
    public FieldDef reaingprod6;
    public FieldDef reaindice6;
    public FieldDef reardtoprod6;
    public FieldDef reaingprod7;
    public FieldDef reaindice7;
    public FieldDef reardtoprod7;
    public FieldDef reaingprod8;
    public FieldDef reaindice8;
    public FieldDef reardtoprod8;
    public FieldDef reaingprod9;
    public FieldDef reaindice9;
    public FieldDef reardtoprod9;
    public FieldDef reaingprod10;
    public FieldDef reaindice10;
    public FieldDef reardtoprod10;
    public FieldDef reaingprod11;
    public FieldDef reaindice11;
    public FieldDef reardtoprod11;
    public FieldDef reaingprod12;
    public FieldDef reaindice12;
    public FieldDef reardtoprod12;
    public FieldDef reaingprod13;
    public FieldDef reaindice13;
    public FieldDef reardtoprod13;
    public FieldDef reatotingresos;
    public FieldDef reatotingarr;
    public FieldDef reardtoprevio;
    public FieldDef reaimpgasoleo;
    public FieldDef reaimpfertil;
    public FieldDef reaimpamortiz;
    public FieldDef reardtominorado;
    public FieldDef reaindajenos;
    public FieldDef reaindpers;
    public FieldDef reaindarren;
    public FieldDef reaindpiensos;
    public FieldDef reaindecolog;
    public FieldDef reaindpeqemp;
    public FieldDef reaindforest;
    public FieldDef reardtonetomodu;
    public FieldDef reaindreddisp;
    public FieldDef reaindjovenes;
    public FieldDef reagastextraor;
    public FieldDef reardtoactivid;
    public FieldDef reaaplicirreg;
    public FieldDef rearedirregular;
    public FieldDef reaimpredirregu;
    public FieldDef reardtonetoredu;
    public FieldDef reaaplredempleo;
    public FieldDef reasalarios;
    public FieldDef reaayudas;
    public FieldDef reaindregadio;
    public FieldDef reaingregadio;
    public TabRdtoacteoagric(String name)
      {
      super(name);
      reaejeraplic = new FieldDef("reaejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      readeclaran = new FieldDef("readeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      reaidentactiv = new FieldDef("reaidentactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      reaprodajeno = new FieldDef("reaprodajeno",FieldDef.CHAR,1);
      reapiensos = new FieldDef("reapiensos",FieldDef.CHAR,1);
      reacostepers = new FieldDef("reacostepers",FieldDef.FLOAT,6,0);
      reaagrieco = new FieldDef("reaagrieco",FieldDef.CHAR,1);
      reaforestal = new FieldDef("reaforestal",FieldDef.CHAR,1);
      reajoven = new FieldDef("reajoven",FieldDef.CHAR,1);
      reaingprod1 = new FieldDef("reaingprod1",FieldDef.FLOAT,6,0);
      reaindice1 = new FieldDef("reaindice1",FieldDef.CHAR,10);
      reardtoprod1 = new FieldDef("reardtoprod1",FieldDef.FLOAT,6,0);
      reaingprod2 = new FieldDef("reaingprod2",FieldDef.FLOAT,6,0);
      reaindice2 = new FieldDef("reaindice2",FieldDef.CHAR,10);
      reardtoprod2 = new FieldDef("reardtoprod2",FieldDef.FLOAT,6,0);
      reaingprod3 = new FieldDef("reaingprod3",FieldDef.FLOAT,6,0);
      reaindice3 = new FieldDef("reaindice3",FieldDef.CHAR,10);
      reardtoprod3 = new FieldDef("reardtoprod3",FieldDef.FLOAT,6,0);
      reaingprod4 = new FieldDef("reaingprod4",FieldDef.FLOAT,6,0);
      reaindice4 = new FieldDef("reaindice4",FieldDef.CHAR,10);
      reardtoprod4 = new FieldDef("reardtoprod4",FieldDef.FLOAT,6,0);
      reaingprod5 = new FieldDef("reaingprod5",FieldDef.FLOAT,6,0);
      reaindice5 = new FieldDef("reaindice5",FieldDef.CHAR,10);
      reardtoprod5 = new FieldDef("reardtoprod5",FieldDef.FLOAT,6,0);
      reaingprod6 = new FieldDef("reaingprod6",FieldDef.FLOAT,6,0);
      reaindice6 = new FieldDef("reaindice6",FieldDef.CHAR,10);
      reardtoprod6 = new FieldDef("reardtoprod6",FieldDef.FLOAT,6,0);
      reaingprod7 = new FieldDef("reaingprod7",FieldDef.FLOAT,6,0);
      reaindice7 = new FieldDef("reaindice7",FieldDef.CHAR,10);
      reardtoprod7 = new FieldDef("reardtoprod7",FieldDef.FLOAT,6,0);
      reaingprod8 = new FieldDef("reaingprod8",FieldDef.FLOAT,6,0);
      reaindice8 = new FieldDef("reaindice8",FieldDef.CHAR,10);
      reardtoprod8 = new FieldDef("reardtoprod8",FieldDef.FLOAT,6,0);
      reaingprod9 = new FieldDef("reaingprod9",FieldDef.FLOAT,6,0);
      reaindice9 = new FieldDef("reaindice9",FieldDef.CHAR,10);
      reardtoprod9 = new FieldDef("reardtoprod9",FieldDef.FLOAT,6,0);
      reaingprod10 = new FieldDef("reaingprod10",FieldDef.FLOAT,6,0);
      reaindice10 = new FieldDef("reaindice10",FieldDef.CHAR,10);
      reardtoprod10 = new FieldDef("reardtoprod10",FieldDef.FLOAT,6,0);
      reaingprod11 = new FieldDef("reaingprod11",FieldDef.FLOAT,6,0);
      reaindice11 = new FieldDef("reaindice11",FieldDef.CHAR,10);
      reardtoprod11 = new FieldDef("reardtoprod11",FieldDef.FLOAT,6,0);
      reaingprod12 = new FieldDef("reaingprod12",FieldDef.FLOAT,6,0);
      reaindice12 = new FieldDef("reaindice12",FieldDef.CHAR,10);
      reardtoprod12 = new FieldDef("reardtoprod12",FieldDef.FLOAT,6,0);
      reaingprod13 = new FieldDef("reaingprod13",FieldDef.FLOAT,6,0);
      reaindice13 = new FieldDef("reaindice13",FieldDef.CHAR,10);
      reardtoprod13 = new FieldDef("reardtoprod13",FieldDef.FLOAT,6,0);
      reatotingresos = new FieldDef("reatotingresos",FieldDef.FLOAT,6,0);
      reatotingarr = new FieldDef("reatotingarr",FieldDef.FLOAT,6,0);
      reardtoprevio = new FieldDef("reardtoprevio",FieldDef.FLOAT,6,0);
      reaimpgasoleo = new FieldDef("reaimpgasoleo",FieldDef.FLOAT,6,0);
      reaimpfertil = new FieldDef("reaimpfertil",FieldDef.FLOAT,6,0);
      reaimpamortiz = new FieldDef("reaimpamortiz",FieldDef.FLOAT,6,0);
      reardtominorado = new FieldDef("reardtominorado",FieldDef.FLOAT,6,0);
      reaindajenos = new FieldDef("reaindajenos",FieldDef.FLOAT,6,0);
      reaindpers = new FieldDef("reaindpers",FieldDef.FLOAT,6,0);
      reaindarren = new FieldDef("reaindarren",FieldDef.FLOAT,6,0);
      reaindpiensos = new FieldDef("reaindpiensos",FieldDef.FLOAT,6,0);
      reaindecolog = new FieldDef("reaindecolog",FieldDef.FLOAT,6,0);
      reaindpeqemp = new FieldDef("reaindpeqemp",FieldDef.FLOAT,6,0);
      reaindforest = new FieldDef("reaindforest",FieldDef.FLOAT,6,0);
      reardtonetomodu = new FieldDef("reardtonetomodu",FieldDef.FLOAT,6,0);
      reaindreddisp = new FieldDef("reaindreddisp",FieldDef.FLOAT,6,0);
      reaindjovenes = new FieldDef("reaindjovenes",FieldDef.FLOAT,6,0);
      reagastextraor = new FieldDef("reagastextraor",FieldDef.FLOAT,6,0);
      reardtoactivid = new FieldDef("reardtoactivid",FieldDef.FLOAT,6,0);
      reaaplicirreg = new FieldDef("reaaplicirreg",FieldDef.CHAR,1);
      rearedirregular = new FieldDef("rearedirregular",FieldDef.INTEGER,0);
      reaimpredirregu = new FieldDef("reaimpredirregu",FieldDef.FLOAT,6,0);
      reardtonetoredu = new FieldDef("reardtonetoredu",FieldDef.FLOAT,6,0);
      reaaplredempleo = new FieldDef("reaaplredempleo",FieldDef.CHAR,1);
      reasalarios = new FieldDef("reasalarios",FieldDef.FLOAT,6,0);
      reaayudas = new FieldDef("reaayudas",FieldDef.FLOAT,6,0);
      reaindregadio = new FieldDef("reaindregadio",FieldDef.FLOAT,6,0);
      reaingregadio = new FieldDef("reaingregadio",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        reaejeraplic,
        readeclaran,
        reaidentactiv,
        reaprodajeno,
        reapiensos,
        reacostepers,
        reaagrieco,
        reaforestal,
        reajoven,
        reaingprod1,
        reaindice1,
        reardtoprod1,
        reaingprod2,
        reaindice2,
        reardtoprod2,
        reaingprod3,
        reaindice3,
        reardtoprod3,
        reaingprod4,
        reaindice4,
        reardtoprod4,
        reaingprod5,
        reaindice5,
        reardtoprod5,
        reaingprod6,
        reaindice6,
        reardtoprod6,
        reaingprod7,
        reaindice7,
        reardtoprod7,
        reaingprod8,
        reaindice8,
        reardtoprod8,
        reaingprod9,
        reaindice9,
        reardtoprod9,
        reaingprod10,
        reaindice10,
        reardtoprod10,
        reaingprod11,
        reaindice11,
        reardtoprod11,
        reaingprod12,
        reaindice12,
        reardtoprod12,
        reaingprod13,
        reaindice13,
        reardtoprod13,
        reatotingresos,
        reatotingarr,
        reardtoprevio,
        reaimpgasoleo,
        reaimpfertil,
        reaimpamortiz,
        reardtominorado,
        reaindajenos,
        reaindpers,
        reaindarren,
        reaindpiensos,
        reaindecolog,
        reaindpeqemp,
        reaindforest,
        reardtonetomodu,
        reaindreddisp,
        reaindjovenes,
        reagastextraor,
        reardtoactivid,
        reaaplicirreg,
        rearedirregular,
        reaimpredirregu,
        reardtonetoredu,
        reaaplredempleo,
        reasalarios,
        reaayudas,
        reaindregadio,
        reaingregadio        
        };
      setColumns(array);
      FieldDef arrayf[] = {reaejeraplic,readeclaran,reaidentactiv };
      setDescription("Rendimiento actividades EO agricola");
      setPrimaryKeys(arrayf);
      reaejeraplic.setDescription("Ejercicio aplicacion");
      readeclaran.setDescription("CODIGO DE DECLARANTE");
      reaidentactiv.setDescription("Identificador actividad");
      reaprodajeno.setDescription("Utiliza medios produccion ajenos");
      reapiensos.setDescription("Piensos adquiridos a terceros");
      reacostepers.setDescription("Coste personal asalariado");
      reaagrieco.setDescription("Es agricultura ecologica");
      reaforestal.setDescription("Es actividad forestal");
      reajoven.setDescription("1era instalacion prioritaria");
      reaingprod1.setDescription("Volumen ingresos producto 1");
      reaindice1.setDescription("Indice producto 1");
      reardtoprod1.setDescription("Rendimiento base producto 1");
      reaingprod2.setDescription("Volumen ingresos producto 2");
      reaindice2.setDescription("Indice producto 2");
      reardtoprod2.setDescription("Rendimiento base producto 2");
      reaingprod3.setDescription("Volumen ingresos producto 3");
      reaindice3.setDescription("Indice producto 3");
      reardtoprod3.setDescription("Rendimiento base producto 3");
      reaingprod4.setDescription("Volumen ingresos producto 4");
      reaindice4.setDescription("Indice producto 4");
      reardtoprod4.setDescription("Rendimiento base producto 4");
      reaingprod5.setDescription("Volumen ingresos producto 5");
      reaindice5.setDescription("Indice producto 5");
      reardtoprod5.setDescription("Rendimiento base producto 5");
      reaingprod6.setDescription("Volumen ingresos producto 6");
      reaindice6.setDescription("Indice producto 6");
      reardtoprod6.setDescription("Rendimiento base producto 6");
      reaingprod7.setDescription("Volumen ingresos producto 7");
      reaindice7.setDescription("Indice producto 7");
      reardtoprod7.setDescription("Rendimiento base producto 7");
      reaingprod8.setDescription("Volumen ingresos producto 8");
      reaindice8.setDescription("Indice producto 8");
      reardtoprod8.setDescription("Rendimiento base producto 8");
      reaingprod9.setDescription("Volumen ingresos producto 9");
      reaindice9.setDescription("Indice producto 9");
      reardtoprod9.setDescription("Rendimiento base producto 9");
      reaingprod10.setDescription("Volumen ingresos producto 10");
      reaindice10.setDescription("Indice producto 10");
      reardtoprod10.setDescription("Rendimiento base producto 10");
      reaingprod11.setDescription("Volumen ingresos producto 11");
      reaindice11.setDescription("Indice producto 11");
      reardtoprod11.setDescription("Rendimiento base producto 11");
      reaingprod12.setDescription("Volumen ingresos producto 12");
      reaindice12.setDescription("Indice producto 12");
      reardtoprod12.setDescription("Rendimiento base producto 12");
      reaingprod13.setDescription("Volumen ingresos producto 13");
      reaindice13.setDescription("Indice producto 13");
      reardtoprod13.setDescription("Rendimiento base producto 13");
      reatotingresos.setDescription("Total ingresos");
      reatotingarr.setDescription("Total ingresos tierras arrendadas");
      reardtoprevio.setDescription("Rendimiento neto previo");
      reaimpgasoleo.setDescription("Importe gasoleo");
      reaimpfertil.setDescription("Importe fertilizantes");
      reaimpamortiz.setDescription("Importe amortizacion");
      reardtominorado.setDescription("Rendimiento neto minorado");
      reaindajenos.setDescription("Indice corrector medios produccion ajenos");
      reaindpers.setDescription("Indice corrector personal asalariado");
      reaindarren.setDescription("Indice corrector tierras arrendadas");
      reaindpiensos.setDescription("Indice corrector piensos a terceros");
      reaindecolog.setDescription("Indice corrector agricultura ecologica");
      reaindpeqemp.setDescription("Indice corrector pequeña empresa");
      reaindforest.setDescription("Indice corrector actividad forestal");
      reardtonetomodu.setDescription("Rendimiento neto de modulos");
      reaindreddisp.setDescription("Indice reductor caracter general");
      reaindjovenes.setDescription("Indice corrector agricultores jovenes");
      reagastextraor.setDescription("Gastos extraordinarios");
      reardtoactivid.setDescription("Rendimiento neto actividad");
      reaaplicirreg.setDescription("Aplicar reduccion irregular");
      rearedirregular.setDescription("% reductor irregular");
      reaimpredirregu.setDescription("Importe reduccion irregular");
      reardtonetoredu.setDescription("Rendimiento neto reducido");
      reaaplredempleo.setDescription("Aplicar reduc. creacion empleo");
      reasalarios.setDescription("Importe salarios");
      reaayudas.setDescription("Ayudas reduccion Ley 3/2010");
      reaindregadio.setDescription("Indice corrector regadio-consumo elect.");
      reaingregadio.setDescription("Total ingresos regadio");
      }
    }
    
  public class TabLiquidaanexob2 extends TableDef
    {
    // Campos
    public FieldDef lb2ejeraplic;
    public FieldDef lb2declaran;
    public FieldDef lb2muf;
    public FieldDef lb2tipocalculo;
    public FieldDef lb205donecolog;
    public FieldDef lb205donbic;
    public FieldDef lb205resbic;
    public FieldDef lb205estudios;
    public FieldDef lb205traslado;
    public FieldDef lb205dondescen;
    public FieldDef lb205nacimiento;
    public FieldDef lb205contribmay;
    public FieldDef lb205guarderia;
    public FieldDef lb205famnumeros;
    public FieldDef lb205invervda;
    public FieldDef lb205invvdaminu;
    public FieldDef lb205nifalquil;
    public FieldDef lb205impalquil;
    public FieldDef lb205euribor;
    public FieldDef lb205desemplea;
    public FieldDef lb206nifalqminu;
    public FieldDef lb206impalqminu;
    public FieldDef lb206cuidado;
    public FieldDef lb206vdadespob;
    public FieldDef lb206donfunda;
    public FieldDef lb206acogmenor;
    public FieldDef lb207nacimiento;
    public FieldDef lb207titdiscapa;
    public FieldDef lb207ascdiscap;
    public FieldDef lb207titmayor;
    public FieldDef lb207ascmayor;
    public FieldDef lb207doncastel;
    public FieldDef lb207vdajovenes;
    public FieldDef lb207vdaprestam;
    public FieldDef lb208famnumeros;
    public FieldDef lb208nacimiento;
    public FieldDef lb208adopintern;
    public FieldDef lb208cuidado;
    public FieldDef lb208titdiscapa;
    public FieldDef lb208vdarural;
    public FieldDef lb208donpatrim;
    public FieldDef lb208invpatrim;
    public FieldDef lb208nifalquil;
    public FieldDef lb208impalquil;
    public FieldDef lb208autoempleo;
    public FieldDef lb208invenergia;
    public FieldDef lb208nacmultipl;
    public FieldDef lb208gastosadop;
    public FieldDef lb208ctaemplead;
    public FieldDef lb208empleados;
    public FieldDef lb208paternidad;
    public FieldDef lb208adecuavda;
    public FieldDef lb208mejorasvda;
    public FieldDef lb205mejorasvda;
    public FieldDef lb206vdadesmun;
    public FieldDef lb208nifadecua;
    public FieldDef lb208nifmejora;
    public FieldDef lb208nifcmenor;
    public FieldDef lb208dedaplic;
    public FieldDef lb208dedexces;
    public FieldDef lb208dedaplfej;
    public FieldDef lb208dedexcfej;
    public FieldDef lb205refalquil;
    public FieldDef lb207autoempleo;
    public FieldDef lb207donacinova;
    public FieldDef lb207famnumeros;
    public FieldDef lb208adqvda;
    public FieldDef lb208crisisauto;
    public FieldDef lb208dedaplfec;
    public FieldDef lb208dedexcfec;
    public FieldDef lb208antaplfej;
    public FieldDef lb208antaplfnu;
    public FieldDef lb208antaplnhi;
    public FieldDef lb208antaplchm;
    public FieldDef lb208antaplpmu;
    public FieldDef lb208antapladg;
    public FieldDef lb208antaplpat;
    public FieldDef lb208antaplfec;
    public FieldDef lb208antexcfej;
    public FieldDef lb208antexcfnu;
    public FieldDef lb208antexcnhi;
    public FieldDef lb208antexcchm;
    public FieldDef lb208antexcpmu;
    public FieldDef lb208antexcadg;
    public FieldDef lb208antexcpat;
    public FieldDef lb208antexcfec;
    public FieldDef lb207dedaplfej;
    public FieldDef lb207dedexcfej;
    public FieldDef lb207antaplfej;
    public FieldDef lb207antexcfej;
    public FieldDef lb205antaplorm;
    public FieldDef lb205antexcorm;
    public FieldDef lb205invalquil;
    public FieldDef lb205sinorefer;
    public FieldDef lb208fechafej;
    public FieldDef lb208fechafec;
    public FieldDef lb208fecvisado;
    public FieldDef lb208dedantpdte;
    public FieldDef lb208dedantapli;
    public FieldDef lb208dedantexce;
    public FieldDef lb208ntitulapmu;
    public FieldDef lb206adqaccion;
    public FieldDef lb206mejorasvda;
    public FieldDef lb206mejorasexc;
    public FieldDef lb206mejoranif;
    public FieldDef lb208antaplcss;
    public FieldDef lb208antexccss;
    public FieldDef lb207libros;
    public FieldDef lb207acogmenor;
    public FieldDef lb207acogmayor;
    public FieldDef lb207impalquil;
    public FieldDef lb207nifalquil;
    public FieldDef lb207adqaccion;
    public FieldDef lb206enfermed1;
    public FieldDef lb206enfermed2;
    public FieldDef lb208donuniv;
    public FieldDef lb208acemprende;
    public FieldDef lb208nifext1;
    public FieldDef lb207nifext1;
    public FieldDef lb206nifext1;
    public FieldDef lb205nifext1;
    public FieldDef lb206antaplmej;
    public TabLiquidaanexob2(String name)
      {
      super(name);
      lb2ejeraplic = new FieldDef("lb2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lb2declaran = new FieldDef("lb2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lb2muf = new FieldDef("lb2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb2tipocalculo = new FieldDef("lb2tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb205donecolog = new FieldDef("lb205donecolog",FieldDef.FLOAT,6,0);
      lb205donbic = new FieldDef("lb205donbic",FieldDef.FLOAT,6,0);
      lb205resbic = new FieldDef("lb205resbic",FieldDef.FLOAT,6,0);
      lb205estudios = new FieldDef("lb205estudios",FieldDef.FLOAT,6,0);
      lb205traslado = new FieldDef("lb205traslado",FieldDef.FLOAT,6,0);
      lb205dondescen = new FieldDef("lb205dondescen",FieldDef.FLOAT,6,0);
      lb205nacimiento = new FieldDef("lb205nacimiento",FieldDef.FLOAT,6,0);
      lb205contribmay = new FieldDef("lb205contribmay",FieldDef.FLOAT,6,0);
      lb205guarderia = new FieldDef("lb205guarderia",FieldDef.FLOAT,6,0);
      lb205famnumeros = new FieldDef("lb205famnumeros",FieldDef.FLOAT,6,0);
      lb205invervda = new FieldDef("lb205invervda",FieldDef.FLOAT,6,0);
      lb205invvdaminu = new FieldDef("lb205invvdaminu",FieldDef.FLOAT,6,0);
      lb205nifalquil = new FieldDef("lb205nifalquil",FieldDef.CHAR,15);
      lb205impalquil = new FieldDef("lb205impalquil",FieldDef.FLOAT,6,0);
      lb205euribor = new FieldDef("lb205euribor",FieldDef.FLOAT,6,0);
      lb205desemplea = new FieldDef("lb205desemplea",FieldDef.FLOAT,6,0);
      lb206nifalqminu = new FieldDef("lb206nifalqminu",FieldDef.CHAR,15);
      lb206impalqminu = new FieldDef("lb206impalqminu",FieldDef.FLOAT,6,0);
      lb206cuidado = new FieldDef("lb206cuidado",FieldDef.FLOAT,6,0);
      lb206vdadespob = new FieldDef("lb206vdadespob",FieldDef.FLOAT,6,0);
      lb206donfunda = new FieldDef("lb206donfunda",FieldDef.FLOAT,6,0);
      lb206acogmenor = new FieldDef("lb206acogmenor",FieldDef.FLOAT,6,0);
      lb207nacimiento = new FieldDef("lb207nacimiento",FieldDef.FLOAT,6,0);
      lb207titdiscapa = new FieldDef("lb207titdiscapa",FieldDef.FLOAT,6,0);
      lb207ascdiscap = new FieldDef("lb207ascdiscap",FieldDef.FLOAT,6,0);
      lb207titmayor = new FieldDef("lb207titmayor",FieldDef.FLOAT,6,0);
      lb207ascmayor = new FieldDef("lb207ascmayor",FieldDef.FLOAT,6,0);
      lb207doncastel = new FieldDef("lb207doncastel",FieldDef.FLOAT,6,0);
      lb207vdajovenes = new FieldDef("lb207vdajovenes",FieldDef.FLOAT,6,0);
      lb207vdaprestam = new FieldDef("lb207vdaprestam",FieldDef.CHAR,20);
      lb208famnumeros = new FieldDef("lb208famnumeros",FieldDef.FLOAT,6,0);
      lb208nacimiento = new FieldDef("lb208nacimiento",FieldDef.FLOAT,6,0);
      lb208adopintern = new FieldDef("lb208adopintern",FieldDef.FLOAT,6,0);
      lb208cuidado = new FieldDef("lb208cuidado",FieldDef.FLOAT,6,0);
      lb208titdiscapa = new FieldDef("lb208titdiscapa",FieldDef.FLOAT,6,0);
      lb208vdarural = new FieldDef("lb208vdarural",FieldDef.FLOAT,6,0);
      lb208donpatrim = new FieldDef("lb208donpatrim",FieldDef.FLOAT,6,0);
      lb208invpatrim = new FieldDef("lb208invpatrim",FieldDef.FLOAT,6,0);
      lb208nifalquil = new FieldDef("lb208nifalquil",FieldDef.CHAR,15);
      lb208impalquil = new FieldDef("lb208impalquil",FieldDef.FLOAT,6,0);
      lb208autoempleo = new FieldDef("lb208autoempleo",FieldDef.FLOAT,6,0);
      lb208invenergia = new FieldDef("lb208invenergia",FieldDef.FLOAT,6,0);
      lb208nacmultipl = new FieldDef("lb208nacmultipl",FieldDef.FLOAT,6,0);
      lb208gastosadop = new FieldDef("lb208gastosadop",FieldDef.FLOAT,6,0);
      lb208ctaemplead = new FieldDef("lb208ctaemplead",FieldDef.CHAR,11);
      lb208empleados = new FieldDef("lb208empleados",FieldDef.FLOAT,6,0);
      lb208paternidad = new FieldDef("lb208paternidad",FieldDef.FLOAT,6,0);
      lb208adecuavda = new FieldDef("lb208adecuavda",FieldDef.FLOAT,6,0);
      lb208mejorasvda = new FieldDef("lb208mejorasvda",FieldDef.FLOAT,6,0);
      lb205mejorasvda = new FieldDef("lb205mejorasvda",FieldDef.FLOAT,6,0);
      lb206vdadesmun = new FieldDef("lb206vdadesmun",FieldDef.INTEGER,0);
      lb208nifadecua = new FieldDef("lb208nifadecua",FieldDef.CHAR,15);
      lb208nifmejora = new FieldDef("lb208nifmejora",FieldDef.CHAR,15);
      lb208nifcmenor = new FieldDef("lb208nifcmenor",FieldDef.CHAR,15);
      lb208dedaplic = new FieldDef("lb208dedaplic",FieldDef.FLOAT,6,0);
      lb208dedexces = new FieldDef("lb208dedexces",FieldDef.FLOAT,6,0);
      lb208dedaplfej = new FieldDef("lb208dedaplfej",FieldDef.FLOAT,6,0);
      lb208dedexcfej = new FieldDef("lb208dedexcfej",FieldDef.FLOAT,6,0);
      lb205refalquil = new FieldDef("lb205refalquil",FieldDef.CHAR,20);
      lb207autoempleo = new FieldDef("lb207autoempleo",FieldDef.FLOAT,6,0);
      lb207donacinova = new FieldDef("lb207donacinova",FieldDef.FLOAT,6,0);
      lb207famnumeros = new FieldDef("lb207famnumeros",FieldDef.FLOAT,6,0);
      lb208adqvda = new FieldDef("lb208adqvda",FieldDef.FLOAT,6,0);
      lb208crisisauto = new FieldDef("lb208crisisauto",FieldDef.FLOAT,6,0);
      lb208dedaplfec = new FieldDef("lb208dedaplfec",FieldDef.FLOAT,6,0);
      lb208dedexcfec = new FieldDef("lb208dedexcfec",FieldDef.FLOAT,6,0);
      lb208antaplfej = new FieldDef("lb208antaplfej",FieldDef.FLOAT,6,0);
      lb208antaplfnu = new FieldDef("lb208antaplfnu",FieldDef.FLOAT,6,0);
      lb208antaplnhi = new FieldDef("lb208antaplnhi",FieldDef.FLOAT,6,0);
      lb208antaplchm = new FieldDef("lb208antaplchm",FieldDef.FLOAT,6,0);
      lb208antaplpmu = new FieldDef("lb208antaplpmu",FieldDef.FLOAT,6,0);
      lb208antapladg = new FieldDef("lb208antapladg",FieldDef.FLOAT,6,0);
      lb208antaplpat = new FieldDef("lb208antaplpat",FieldDef.FLOAT,6,0);
      lb208antaplfec = new FieldDef("lb208antaplfec",FieldDef.FLOAT,6,0);
      lb208antexcfej = new FieldDef("lb208antexcfej",FieldDef.FLOAT,6,0);
      lb208antexcfnu = new FieldDef("lb208antexcfnu",FieldDef.FLOAT,6,0);
      lb208antexcnhi = new FieldDef("lb208antexcnhi",FieldDef.FLOAT,6,0);
      lb208antexcchm = new FieldDef("lb208antexcchm",FieldDef.FLOAT,6,0);
      lb208antexcpmu = new FieldDef("lb208antexcpmu",FieldDef.FLOAT,6,0);
      lb208antexcadg = new FieldDef("lb208antexcadg",FieldDef.FLOAT,6,0);
      lb208antexcpat = new FieldDef("lb208antexcpat",FieldDef.FLOAT,6,0);
      lb208antexcfec = new FieldDef("lb208antexcfec",FieldDef.FLOAT,6,0);
      lb207dedaplfej = new FieldDef("lb207dedaplfej",FieldDef.FLOAT,6,0);
      lb207dedexcfej = new FieldDef("lb207dedexcfej",FieldDef.FLOAT,6,0);
      lb207antaplfej = new FieldDef("lb207antaplfej",FieldDef.FLOAT,6,0);
      lb207antexcfej = new FieldDef("lb207antexcfej",FieldDef.FLOAT,6,0);
      lb205antaplorm = new FieldDef("lb205antaplorm",FieldDef.FLOAT,6,0);
      lb205antexcorm = new FieldDef("lb205antexcorm",FieldDef.FLOAT,6,0);
      lb205invalquil = new FieldDef("lb205invalquil",FieldDef.FLOAT,6,0);
      lb205sinorefer = new FieldDef("lb205sinorefer",FieldDef.CHAR,1);
      lb208fechafej = new FieldDef("lb208fechafej",FieldDef.DATE);
      lb208fechafec = new FieldDef("lb208fechafec",FieldDef.DATE);
      lb208fecvisado = new FieldDef("lb208fecvisado",FieldDef.DATE);
      lb208dedantpdte = new FieldDef("lb208dedantpdte",FieldDef.FLOAT,6,0);
      lb208dedantapli = new FieldDef("lb208dedantapli",FieldDef.FLOAT,6,0);
      lb208dedantexce = new FieldDef("lb208dedantexce",FieldDef.FLOAT,6,0);
      lb208ntitulapmu = new FieldDef("lb208ntitulapmu",FieldDef.FLOAT,6,0);
      lb206adqaccion = new FieldDef("lb206adqaccion",FieldDef.FLOAT,6,0);
      lb206mejorasvda = new FieldDef("lb206mejorasvda",FieldDef.FLOAT,6,0);
      lb206mejorasexc = new FieldDef("lb206mejorasexc",FieldDef.FLOAT,6,0);
      lb206mejoranif = new FieldDef("lb206mejoranif",FieldDef.CHAR,15);
      lb208antaplcss = new FieldDef("lb208antaplcss",FieldDef.FLOAT,6,0);
      lb208antexccss = new FieldDef("lb208antexccss",FieldDef.FLOAT,6,0);
      lb207libros = new FieldDef("lb207libros",FieldDef.FLOAT,6,0);
      lb207acogmenor = new FieldDef("lb207acogmenor",FieldDef.FLOAT,6,0);
      lb207acogmayor = new FieldDef("lb207acogmayor",FieldDef.FLOAT,6,0);
      lb207impalquil = new FieldDef("lb207impalquil",FieldDef.FLOAT,6,0);
      lb207nifalquil = new FieldDef("lb207nifalquil",FieldDef.CHAR,15);
      lb207adqaccion = new FieldDef("lb207adqaccion",FieldDef.FLOAT,6,0);
      lb206enfermed1 = new FieldDef("lb206enfermed1",FieldDef.FLOAT,6,0);
      lb206enfermed2 = new FieldDef("lb206enfermed2",FieldDef.FLOAT,6,0);
      lb208donuniv = new FieldDef("lb208donuniv",FieldDef.FLOAT,6,0);
      lb208acemprende = new FieldDef("lb208acemprende",FieldDef.FLOAT,6,0);
      lb208nifext1 = new FieldDef("lb208nifext1",FieldDef.CHAR,25);
      lb207nifext1 = new FieldDef("lb207nifext1",FieldDef.CHAR,25);
      lb206nifext1 = new FieldDef("lb206nifext1",FieldDef.CHAR,25);
      lb205nifext1 = new FieldDef("lb205nifext1",FieldDef.CHAR,25);
      lb206antaplmej = new FieldDef("lb206antaplmej",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lb2ejeraplic,
        lb2declaran,
        lb2muf,
        lb2tipocalculo,
        lb205donecolog,
        lb205donbic,
        lb205resbic,
        lb205estudios,
        lb205traslado,
        lb205dondescen,
        lb205nacimiento,
        lb205contribmay,
        lb205guarderia,
        lb205famnumeros,
        lb205invervda,
        lb205invvdaminu,
        lb205nifalquil,
        lb205impalquil,
        lb205euribor,
        lb205desemplea,
        lb206nifalqminu,
        lb206impalqminu,
        lb206cuidado,
        lb206vdadespob,
        lb206donfunda,
        lb206acogmenor,
        lb207nacimiento,
        lb207titdiscapa,
        lb207ascdiscap,
        lb207titmayor,
        lb207ascmayor,
        lb207doncastel,
        lb207vdajovenes,
        lb207vdaprestam,
        lb208famnumeros,
        lb208nacimiento,
        lb208adopintern,
        lb208cuidado,
        lb208titdiscapa,
        lb208vdarural,
        lb208donpatrim,
        lb208invpatrim,
        lb208nifalquil,
        lb208impalquil,
        lb208autoempleo,
        lb208invenergia,
        lb208nacmultipl,
        lb208gastosadop,
        lb208ctaemplead,
        lb208empleados,
        lb208paternidad,
        lb208adecuavda,
        lb208mejorasvda,
        lb205mejorasvda,
        lb206vdadesmun,
        lb208nifadecua,
        lb208nifmejora,
        lb208nifcmenor,
        lb208dedaplic,
        lb208dedexces,
        lb208dedaplfej,
        lb208dedexcfej,
        lb205refalquil,
        lb207autoempleo,
        lb207donacinova,
        lb207famnumeros,
        lb208adqvda,
        lb208crisisauto,
        lb208dedaplfec,
        lb208dedexcfec,
        lb208antaplfej,
        lb208antaplfnu,
        lb208antaplnhi,
        lb208antaplchm,
        lb208antaplpmu,
        lb208antapladg,
        lb208antaplpat,
        lb208antaplfec,
        lb208antexcfej,
        lb208antexcfnu,
        lb208antexcnhi,
        lb208antexcchm,
        lb208antexcpmu,
        lb208antexcadg,
        lb208antexcpat,
        lb208antexcfec,
        lb207dedaplfej,
        lb207dedexcfej,
        lb207antaplfej,
        lb207antexcfej,
        lb205antaplorm,
        lb205antexcorm,
        lb205invalquil,
        lb205sinorefer,
        lb208fechafej,
        lb208fechafec,
        lb208fecvisado,
        lb208dedantpdte,
        lb208dedantapli,
        lb208dedantexce,
        lb208ntitulapmu,
        lb206adqaccion,
        lb206mejorasvda,
        lb206mejorasexc,
        lb206mejoranif,
        lb208antaplcss,
        lb208antexccss,
        lb207libros,
        lb207acogmenor,
        lb207acogmayor,
        lb207impalquil,
        lb207nifalquil,
        lb207adqaccion,
        lb206enfermed1,
        lb206enfermed2,
        lb208donuniv,
        lb208acemprende,
        lb208nifext1,
        lb207nifext1,
        lb206nifext1,
        lb205nifext1,
        lb206antaplmej        
        };
      setColumns(array);
      FieldDef arrayf[] = {lb2ejeraplic,lb2declaran,lb2muf,lb2tipocalculo };
      setDescription("Liquidacion renta anexo B2: Deducciones autonomicas");
      setPrimaryKeys(arrayf);
      lb2ejeraplic.setDescription("Ejercicio aplicacion");
      lb2declaran.setDescription("Codigo de declarante");
      lb2muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lb2tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lb205donecolog.setDescription("Canarias: donaciones finalidad ecologica");
      lb205donbic.setDescription("Canarias: donaciones rehabilitacion/conservacion patrimonio historico Canarias");
      lb205resbic.setDescription("Canarias: cantidades destinadas restauracion/rehabilitacion/reparacion bienes inmuebles declarados Interes Cultural");
      lb205estudios.setDescription("Canarias: gastos estudios");
      lb205traslado.setDescription("Canarias: traslado residencia otra isla para realizar actividad laboral cuenta ajena/actividad economica");
      lb205dondescen.setDescription("Canarias: donaciones metalico descendientes menores 35 años para adquisicion/rehabilitacion primera vda.habitual");
      lb205nacimiento.setDescription("Canarias: nacimiento o adopcion hijos");
      lb205contribmay.setDescription("Canarias: contribuyentes minusvalidos y mayores 65 años");
      lb205guarderia.setDescription("Canarias: gastos guarderia");
      lb205famnumeros.setDescription("Canarias: familia numerosa");
      lb205invervda.setDescription("Canarias: inver. vda.habitual caracter general");
      lb205invvdaminu.setDescription("Canarias: inver. vda.habitual obras adecuacion personas discapacidad");
      lb205nifalquil.setDescription("Canarias: alquiler vda.habitual NIF arrendador");
      lb205impalquil.setDescription("Canarias: alquiler vda.habitual Importe");
      lb205euribor.setDescription("Canarias: variacion del euribor");
      lb205desemplea.setDescription("Canarias: contribuyentes desempleados");
      lb206nifalqminu.setDescription("Cantabria: arrendamiento vda.habitual jovenes mayores discapacitados NIF arrendador");
      lb206impalqminu.setDescription("Cantabria: arrendamiento vda.habitual jovenes mayores discapacitados Importe");
      lb206cuidado.setDescription("Cantabria: cuidado familiares");
      lb206vdadespob.setDescription("Cantabria: adquisicion o rehabilitacion 2 vivienda municipios problemas despoblacion");
      lb206donfunda.setDescription("Cantabria: donativos fundaciones");
      lb206acogmenor.setDescription("Cantabria: acogimiento familiar menores");
      lb207nacimiento.setDescription("Castilla La Mancha: nacimiento o adopcion hijos");
      lb207titdiscapa.setDescription("Castilla La Mancha: discapacidad del contribuyente");
      lb207ascdiscap.setDescription("Castilla La Mancha: discapacidad ascendientes o descendientes");
      lb207titmayor.setDescription("Castilla La Mancha: contribuyentes mayores 75 años");
      lb207ascmayor.setDescription("Castilla La Mancha: el cuidado ascendientes mayores 75 años");
      lb207doncastel.setDescription("Castilla La Mancha: cantidades donadas al Fondo Castellano Manchego Cooperacion");
      lb207vdajovenes.setDescription("Castilla La Mancha: cantidades satisfechas adquisicion/rehabilitacion vda.habitual");
      lb207vdaprestam.setDescription("Castilla La Mancha: cantidades satisfechas adquisicion/rehabilitacion vda.habitual n identificacion prestamo");
      lb208famnumeros.setDescription("Castilla y Leon: familia numerosa");
      lb208nacimiento.setDescription("Castilla y Leon: nacimiento o adopcion hijos");
      lb208adopintern.setDescription("Castilla y Leon: adopcion internacional");
      lb208cuidado.setDescription("Castilla y Leon: cuidado hijos menores");
      lb208titdiscapa.setDescription("Castilla y Leon: contribuyentes 65 años o mas afectados minusvalia");
      lb208vdarural.setDescription("Castilla y Leon: adquisicion viviendas por jovenes nucleos rurales");
      lb208donpatrim.setDescription("Castilla y Leon: cantidades donadas recuperacion patrimonio historico cultural y natural");
      lb208invpatrim.setDescription("Castilla y Leon: cantidades invertidas recuperacion patrimonio historico cultural y natural");
      lb208nifalquil.setDescription("Castilla y Leon: alquiler vda.habitual jovenes NIF arrendador");
      lb208impalquil.setDescription("Castilla y Leon: alquiler vda.habitual jovenes Importe");
      lb208autoempleo.setDescription("Castilla y Leon: fomento autoempleo mujeres y jovenes");
      lb208invenergia.setDescription("Castilla y Leon: inversion en instalaciones energias renovables");
      lb208nacmultipl.setDescription("Castilla y Leon: 2011 partos multiples");
      lb208gastosadop.setDescription("Castilla y Leon: 2011 gastos de adopcion");
      lb208ctaemplead.setDescription("Castilla y Leon: 2011 Cuotas seg.social empleados del hogar Cuenta cotizacion.");
      lb208empleados.setDescription("Castilla y Leon: 2011 Cuotas a la seguridad social de empleados del hogar  Importe [CSS]");
      lb208paternidad.setDescription("Castilla y Leon: 2011 ded. por paternidad [PAT]");
      lb208adecuavda.setDescription("Castilla y Leon: 2011 obras adecuación a la inspección técnica de construcciones [OAT]");
      lb208mejorasvda.setDescription("Castilla y Leon: 2011 obras de reparación y mejora en vivienda habitual [ORM]");
      lb205mejorasvda.setDescription("Canarias: 2011 obras de rehabilitacion o reforma vdas en Canarias [ORM]");
      lb206vdadesmun.setDescription("Cantabria: Codigo municipio adquisicion o rehabilitacion 2 vivienda municipios problemas despoblacion");
      lb208nifadecua.setDescription("Castilla y Leon: 2011 NIF obras adecuación a la inspección técnica de construcciones [OAT]");
      lb208nifmejora.setDescription("Castilla y Leon: 2011 NIF obras de reparación y mejora en vivienda habitual [ORM]");
      lb208nifcmenor.setDescription("Castilla y Leon: 2011 NIF cuidado hijos menores [CHM]");
      lb208dedaplic.setDescription("Castilla-Leon: 2011 deduc aplicada  de fam.num.+nac+partos+CHM+PAT+ADG");
      lb208dedexces.setDescription("Castilla-Leon: 2011 exceso no aplic de fam.num.+nac+partos+CHM+PAT+ADG");
      lb208dedaplfej.setDescription("Castilla-Leon: 2011 deduc aplicada  FEJ");
      lb208dedexcfej.setDescription("Castilla-Leon: 2011 exceso no aplic FEJ");
      lb205refalquil.setDescription("Canarias 2012: alquiler vda.habitual Referencia catastral");
      lb207autoempleo.setDescription("Castilla Mancha 2012 fomento autoempleo emprendedores [FEJ-FEM]");
      lb207donacinova.setDescription("Castilla Mancha 2012 donac investig.cientifica inova.empresarial [DCI]");
      lb207famnumeros.setDescription("Castilla Mancha 2012 familia numerosa");
      lb208adqvda.setDescription("Castilla-Leon 2012: adquisic.primera vda.habitual de nueva construccion");
      lb208crisisauto.setDescription("Castilla-Leon 2012: fomento autoempleo autónomos abondonan actividad por la crisis");
      lb208dedaplfec.setDescription("Castilla-Leon 2012: deduc aplicada  FEC (autoempleo autónomos)");
      lb208dedexcfec.setDescription("Castilla-Leon 2012: exceso no aplic FEC (autoempleo autónomos)");
      lb208antaplfej.setDescription("Castilla-Leon 2012: ded.ejer.anter.aplicada FEJ autoempleo");
      lb208antaplfnu.setDescription("Castilla-Leon 2012: ded.ejer.anter.aplicada FNU familia numerosa");
      lb208antaplnhi.setDescription("Castilla-Leon 2012: ded.ejer.anter.aplicada NHI nacimiento");
      lb208antaplchm.setDescription("Castilla-Leon 2012: ded.ejer.anter.aplicada CHM cuidado hijos");
      lb208antaplpmu.setDescription("Castilla-Leon 2012: ded.ejer.anter.aplicada PMU partos multiples");
      lb208antapladg.setDescription("Castilla-Leon 2012: ded.ejer.anter.aplicada ADG gastos adopcio");
      lb208antaplpat.setDescription("Castilla-Leon 2012: ded.ejer.anter.aplicada PAT paternidad");
      lb208antaplfec.setDescription("Castilla-Leon 2012: ded.ejer.anter.aplicada FEC autoempleo autonomo");
      lb208antexcfej.setDescription("Castilla-Leon 2012: ded.ejer.anter.exceso FEJ autoempleo");
      lb208antexcfnu.setDescription("Castilla-Leon 2012: ded.ejer.anter.exceso FNU familia numerosa");
      lb208antexcnhi.setDescription("Castilla-Leon 2012: ded.ejer.anter.exceso NHI nacimiento");
      lb208antexcchm.setDescription("Castilla-Leon 2012: ded.ejer.anter.exceso CHM cuidado hijos");
      lb208antexcpmu.setDescription("Castilla-Leon 2012: ded.ejer.anter.exceso PMU partos multiples");
      lb208antexcadg.setDescription("Castilla-Leon 2012: ded.ejer.anter.exceso ADG gastos adopcio");
      lb208antexcpat.setDescription("Castilla-Leon 2012: ded.ejer.anter.exceso PAT paternidad");
      lb208antexcfec.setDescription("Castilla-Leon 2012: ded.ejer.anter.exceso FEC autoempleo autonomo");
      lb207dedaplfej.setDescription("Castilla-Mancha: 2012 deduc aplicada  FEJ");
      lb207dedexcfej.setDescription("Castilla-Mancha: 2012 exceso no aplic FEJ");
      lb207antaplfej.setDescription("Castilla-Mancba: 2012 ded.ejer.anter.aplicada FEJ autoempleo");
      lb207antexcfej.setDescription("Castilla-Mancha: 2012 ded.ejer.anter.exceso FEJ autoempleo");
      lb205antaplorm.setDescription("Canarias 2012: ded.ejer.anter.aplicada ORM obras vda");
      lb205antexcorm.setDescription("Canarias 2012: ded.ejer.anter.exceso ORM obras vda");
      lb205invalquil.setDescription("Canarias: alquiler vda.habitual Cantidad total satisfecha");
      lb205sinorefer.setDescription("Canarias: alquiler vda.habitual Si/No tiene referencia catastral");
      lb208fechafej.setDescription("Castilla-Leon 2012 Fecha alta censo FEJ autoempleo");
      lb208fechafec.setDescription("Castilla-Leon 2012 Fecha alta censo FEC autoempleo autonomos");
      lb208fecvisado.setDescription("Castilla-Leon 2012 Fecha visado proyecto.1a vda.habitual de nueva construc");
      lb208dedantpdte.setDescription("Castilla-Leon: Tot pdte inversio ejer.ant de fam.num.+nac+partos+CHM+PAT+ADG");
      lb208dedantapli.setDescription("Castilla-Leon: Total aplic ejer anterior1 de fam.num.+nac+partos+CHM+PAT+ADG");
      lb208dedantexce.setDescription("Castilla-Leon: Total exces ejer anterior1 de fam.num.+nac+partos+CHM+PAT+ADG");
      lb208ntitulapmu.setDescription("Castilla-Leon: Nro titulares PMU ej.2011 casilla 418");
      lb206adqaccion.setDescription("Cantabria 2013 compra acciones  [ACC]");
      lb206mejorasvda.setDescription("Cantabria 2013 obras de mejoras vda [ORM]");
      lb206mejorasexc.setDescription("Cantabria 2013 exceso pdte obras de mejoras [ORM]");
      lb206mejoranif.setDescription("Cantabria 2013 NIF entidad realiza las obras[ORM]");
      lb208antaplcss.setDescription("Castilla-Leon 2013 ded.ejer.anter.aplicada CSS cuota SS empleado hogar");
      lb208antexccss.setDescription("Castilla-Leon 2013 ded.ejer.anter.exceso CSS cuota SS empleado hogar");
      lb207libros.setDescription("Cast-Mancha 2013 Compra libros texto [LIB]");
      lb207acogmenor.setDescription("Cast-Mancha 2013 Acogimiento familiar menores  [MAF]");
      lb207acogmayor.setDescription("Cast-Mancha 2013 Acogimiento mayor 65a y/o discapacitados [ACM]");
      lb207impalquil.setDescription("Cast-Mancha 2013 Alquiler vda.habitual Importe   [AAV]");
      lb207nifalquil.setDescription("Cast-Mancha 2013 Alquiler NIF arrendador         [AAV]");
      lb207adqaccion.setDescription("Cast-Mancha 2013 Compra acciones de cooperativas [ACC]");
      lb206enfermed1.setDescription("Cantabria 2014 gas.enfermedad,dental,embarazo,nac.  [GE1]");
      lb206enfermed2.setDescription("Cantabria 2014 gas.enfermedad mutuas no obligatoria [GE2]");
      lb208donuniv.setDescription("Castilla-Leon 2014: Donac.universidades [DFU]");
      lb208acemprende.setDescription("Castilla-Leon 2014: Compra acciones fomento autoempleo [ACE]");
      lb208nifext1.setDescription("Castilla-Leon 2014: Alquiler Nro.Identificac.en pais residencia");
      lb207nifext1.setDescription("Cast-Mancha 2014:   Alquiler Nro.Identificac.en pais residencia");
      lb206nifext1.setDescription("Cantabria  2014:    Alquiler Nro.Identificac.en pais residencia");
      lb205nifext1.setDescription("Canarias   2014:    Alquiler Nro.Identificac.en pais residencia");
      lb206antaplmej.setDescription("Cantabria  2014 Mejoras vda ej.anter.aplicado");
      }
    }
    
  public class TabLiquidaanexob3 extends TableDef
    {
    // Campos
    public FieldDef lb3ejeraplic;
    public FieldDef lb3declaran;
    public FieldDef lb3muf;
    public FieldDef lb3tipocalculo;
    public FieldDef lb309nacimiento;
    public FieldDef lb309donlegua;
    public FieldDef lb309donid;
    public FieldDef lb309nifalquil;
    public FieldDef lb309impalquil;
    public FieldDef lb309intestudi;
    public FieldDef lb309viudos;
    public FieldDef lb309rehvda;
    public FieldDef lb309donmedioam;
    public FieldDef lb309adqaccion;
    public FieldDef lb309accmercalt;
    public FieldDef lb310adqvda;
    public FieldDef lb310trabdepend;
    public FieldDef lb310donpatrim;
    public FieldDef lb310invpatrim;
    public FieldDef lb310nifalquil;
    public FieldDef lb310impalquil;
    public FieldDef lb310cuidado;
    public FieldDef lb310acogmenor;
    public FieldDef lb311nacimiento;
    public FieldDef lb311famnumeros;
    public FieldDef lb311cuidado;
    public FieldDef lb311titdiscapa;
    public FieldDef lb311tecnologia;
    public FieldDef lb311nifalquil;
    public FieldDef lb311impalquil;
    public FieldDef lb311autoempleo;
    public FieldDef lb312nacimiento;
    public FieldDef lb312adopintern;
    public FieldDef lb312acogmenor;
    public FieldDef lb312acogmayor;
    public FieldDef lb312nifalquil;
    public FieldDef lb312impalquil;
    public FieldDef lb312donfundac;
    public FieldDef lb312ncremcoste;
    public FieldDef lb312gastosedu;
    public FieldDef lb312vdanueva;
    public FieldDef lb312mas2descen;
    public FieldDef lb312accnuevas;
    public FieldDef lb312autoempleo;
    public FieldDef lb312accmercalt;
    public FieldDef lb310ctaayuda;
    public FieldDef lb310ayudadomes;
    public FieldDef lb310empleojove;
    public FieldDef lb310empleomuje;
    public FieldDef lb310adopintern;
    public FieldDef lb310fammonopar;
    public FieldDef lb310nacmultipl;
    public FieldDef lb310donecolog;
    public FieldDef lb310adqordenad;
    public FieldDef lb310mejorasvda;
    public FieldDef lb311acogmenor;
    public FieldDef lb311adqaccion;
    public FieldDef lb311accmercalt;
    public FieldDef lb310antaplorm;
    public FieldDef lb310antexcorm;
    public FieldDef lb310escolar;
    public FieldDef lb311adqaccion3;
    public FieldDef lb310adqaccion;
    public FieldDef lb310guarderia;
    public FieldDef lb310viudos;
    public FieldDef lb309nifext1;
    public FieldDef lb311nifext1;
    public FieldDef lb312nifext1;
    public TabLiquidaanexob3(String name)
      {
      super(name);
      lb3ejeraplic = new FieldDef("lb3ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lb3declaran = new FieldDef("lb3declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lb3muf = new FieldDef("lb3muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb3tipocalculo = new FieldDef("lb3tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb309nacimiento = new FieldDef("lb309nacimiento",FieldDef.FLOAT,6,0);
      lb309donlegua = new FieldDef("lb309donlegua",FieldDef.FLOAT,6,0);
      lb309donid = new FieldDef("lb309donid",FieldDef.FLOAT,6,0);
      lb309nifalquil = new FieldDef("lb309nifalquil",FieldDef.CHAR,15);
      lb309impalquil = new FieldDef("lb309impalquil",FieldDef.FLOAT,6,0);
      lb309intestudi = new FieldDef("lb309intestudi",FieldDef.FLOAT,6,0);
      lb309viudos = new FieldDef("lb309viudos",FieldDef.FLOAT,6,0);
      lb309rehvda = new FieldDef("lb309rehvda",FieldDef.FLOAT,6,0);
      lb309donmedioam = new FieldDef("lb309donmedioam",FieldDef.FLOAT,6,0);
      lb309adqaccion = new FieldDef("lb309adqaccion",FieldDef.FLOAT,6,0);
      lb309accmercalt = new FieldDef("lb309accmercalt",FieldDef.FLOAT,6,0);
      lb310adqvda = new FieldDef("lb310adqvda",FieldDef.FLOAT,6,0);
      lb310trabdepend = new FieldDef("lb310trabdepend",FieldDef.FLOAT,6,0);
      lb310donpatrim = new FieldDef("lb310donpatrim",FieldDef.FLOAT,6,0);
      lb310invpatrim = new FieldDef("lb310invpatrim",FieldDef.FLOAT,6,0);
      lb310nifalquil = new FieldDef("lb310nifalquil",FieldDef.CHAR,15);
      lb310impalquil = new FieldDef("lb310impalquil",FieldDef.FLOAT,6,0);
      lb310cuidado = new FieldDef("lb310cuidado",FieldDef.FLOAT,6,0);
      lb310acogmenor = new FieldDef("lb310acogmenor",FieldDef.FLOAT,6,0);
      lb311nacimiento = new FieldDef("lb311nacimiento",FieldDef.FLOAT,6,0);
      lb311famnumeros = new FieldDef("lb311famnumeros",FieldDef.FLOAT,6,0);
      lb311cuidado = new FieldDef("lb311cuidado",FieldDef.FLOAT,6,0);
      lb311titdiscapa = new FieldDef("lb311titdiscapa",FieldDef.FLOAT,6,0);
      lb311tecnologia = new FieldDef("lb311tecnologia",FieldDef.FLOAT,6,0);
      lb311nifalquil = new FieldDef("lb311nifalquil",FieldDef.CHAR,15);
      lb311impalquil = new FieldDef("lb311impalquil",FieldDef.FLOAT,6,0);
      lb311autoempleo = new FieldDef("lb311autoempleo",FieldDef.FLOAT,6,0);
      lb312nacimiento = new FieldDef("lb312nacimiento",FieldDef.FLOAT,6,0);
      lb312adopintern = new FieldDef("lb312adopintern",FieldDef.FLOAT,6,0);
      lb312acogmenor = new FieldDef("lb312acogmenor",FieldDef.FLOAT,6,0);
      lb312acogmayor = new FieldDef("lb312acogmayor",FieldDef.FLOAT,6,0);
      lb312nifalquil = new FieldDef("lb312nifalquil",FieldDef.CHAR,15);
      lb312impalquil = new FieldDef("lb312impalquil",FieldDef.FLOAT,6,0);
      lb312donfundac = new FieldDef("lb312donfundac",FieldDef.FLOAT,6,0);
      lb312ncremcoste = new FieldDef("lb312ncremcoste",FieldDef.FLOAT,6,0);
      lb312gastosedu = new FieldDef("lb312gastosedu",FieldDef.FLOAT,6,0);
      lb312vdanueva = new FieldDef("lb312vdanueva",FieldDef.FLOAT,6,0);
      lb312mas2descen = new FieldDef("lb312mas2descen",FieldDef.FLOAT,6,0);
      lb312accnuevas = new FieldDef("lb312accnuevas",FieldDef.FLOAT,6,0);
      lb312autoempleo = new FieldDef("lb312autoempleo",FieldDef.FLOAT,6,0);
      lb312accmercalt = new FieldDef("lb312accmercalt",FieldDef.FLOAT,6,0);
      lb310ctaayuda = new FieldDef("lb310ctaayuda",FieldDef.CHAR,11);
      lb310ayudadomes = new FieldDef("lb310ayudadomes",FieldDef.FLOAT,6,0);
      lb310empleojove = new FieldDef("lb310empleojove",FieldDef.FLOAT,6,0);
      lb310empleomuje = new FieldDef("lb310empleomuje",FieldDef.FLOAT,6,0);
      lb310adopintern = new FieldDef("lb310adopintern",FieldDef.FLOAT,6,0);
      lb310fammonopar = new FieldDef("lb310fammonopar",FieldDef.FLOAT,6,0);
      lb310nacmultipl = new FieldDef("lb310nacmultipl",FieldDef.FLOAT,6,0);
      lb310donecolog = new FieldDef("lb310donecolog",FieldDef.FLOAT,6,0);
      lb310adqordenad = new FieldDef("lb310adqordenad",FieldDef.FLOAT,6,0);
      lb310mejorasvda = new FieldDef("lb310mejorasvda",FieldDef.FLOAT,6,0);
      lb311acogmenor = new FieldDef("lb311acogmenor",FieldDef.FLOAT,6,0);
      lb311adqaccion = new FieldDef("lb311adqaccion",FieldDef.FLOAT,6,0);
      lb311accmercalt = new FieldDef("lb311accmercalt",FieldDef.FLOAT,6,0);
      lb310antaplorm = new FieldDef("lb310antaplorm",FieldDef.FLOAT,6,0);
      lb310antexcorm = new FieldDef("lb310antexcorm",FieldDef.FLOAT,6,0);
      lb310escolar = new FieldDef("lb310escolar",FieldDef.FLOAT,6,0);
      lb311adqaccion3 = new FieldDef("lb311adqaccion3",FieldDef.FLOAT,6,0);
      lb310adqaccion = new FieldDef("lb310adqaccion",FieldDef.FLOAT,6,0);
      lb310guarderia = new FieldDef("lb310guarderia",FieldDef.FLOAT,6,0);
      lb310viudos = new FieldDef("lb310viudos",FieldDef.FLOAT,6,0);
      lb309nifext1 = new FieldDef("lb309nifext1",FieldDef.CHAR,25);
      lb311nifext1 = new FieldDef("lb311nifext1",FieldDef.CHAR,25);
      lb312nifext1 = new FieldDef("lb312nifext1",FieldDef.CHAR,25);
      FieldDef array[] = {
        lb3ejeraplic,
        lb3declaran,
        lb3muf,
        lb3tipocalculo,
        lb309nacimiento,
        lb309donlegua,
        lb309donid,
        lb309nifalquil,
        lb309impalquil,
        lb309intestudi,
        lb309viudos,
        lb309rehvda,
        lb309donmedioam,
        lb309adqaccion,
        lb309accmercalt,
        lb310adqvda,
        lb310trabdepend,
        lb310donpatrim,
        lb310invpatrim,
        lb310nifalquil,
        lb310impalquil,
        lb310cuidado,
        lb310acogmenor,
        lb311nacimiento,
        lb311famnumeros,
        lb311cuidado,
        lb311titdiscapa,
        lb311tecnologia,
        lb311nifalquil,
        lb311impalquil,
        lb311autoempleo,
        lb312nacimiento,
        lb312adopintern,
        lb312acogmenor,
        lb312acogmayor,
        lb312nifalquil,
        lb312impalquil,
        lb312donfundac,
        lb312ncremcoste,
        lb312gastosedu,
        lb312vdanueva,
        lb312mas2descen,
        lb312accnuevas,
        lb312autoempleo,
        lb312accmercalt,
        lb310ctaayuda,
        lb310ayudadomes,
        lb310empleojove,
        lb310empleomuje,
        lb310adopintern,
        lb310fammonopar,
        lb310nacmultipl,
        lb310donecolog,
        lb310adqordenad,
        lb310mejorasvda,
        lb311acogmenor,
        lb311adqaccion,
        lb311accmercalt,
        lb310antaplorm,
        lb310antexcorm,
        lb310escolar,
        lb311adqaccion3,
        lb310adqaccion,
        lb310guarderia,
        lb310viudos,
        lb309nifext1,
        lb311nifext1,
        lb312nifext1        
        };
      setColumns(array);
      FieldDef arrayf[] = {lb3ejeraplic,lb3declaran,lb3muf,lb3tipocalculo };
      setDescription("Liquidacion renta anexo B3: Deducciones autonomicas");
      setPrimaryKeys(arrayf);
      lb3ejeraplic.setDescription("Ejercicio aplicacion");
      lb3declaran.setDescription("Codigo de declarante");
      lb3muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lb3tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lb309nacimiento.setDescription("Cataluña: nacimiento o adopcion hijos");
      lb309donlegua.setDescription("Cataluña: donativos entidades que fomentan el uso lengua catalana");
      lb309donid.setDescription("Cataluña: donativos entidades que fomentan investigacion cientifica");
      lb309nifalquil.setDescription("Cataluña: alquiler vda.habitual NIF arrendador");
      lb309impalquil.setDescription("Cataluña: alquiler vda.habitual Importe");
      lb309intestudi.setDescription("Cataluña: pago intereses prestamos estudio universitarios tercer ciclo");
      lb309viudos.setDescription("Cataluña: los contribuyentes que queden viudos");
      lb309rehvda.setDescription("Cataluña: rehabilitacion vda.habitual");
      lb309donmedioam.setDescription("Cataluña: donaciones beneficio del medio ambiente");
      lb309adqaccion.setDescription("Cataluña: inversion por un angel inversion adquisicion acciones");
      lb309accmercalt.setDescription("Cataluña: inversion acciones empresas en expansion mercado alternativo");
      lb310adqvda.setDescription("Extremadura: adquisicion vda.habitual para jovenes y victimas del terrorismo");
      lb310trabdepend.setDescription("Extremadura: trabajo dependiente");
      lb310donpatrim.setDescription("Extremadura: donaciones bienes integrantes del Patrimonio Historico y Cultural Extremeño");
      lb310invpatrim.setDescription("Extremadura: cantidades destinadas conservacion reparacion etc. bienes Patrimonio Historico y Cultural Extremeño");
      lb310nifalquil.setDescription("Extremadura: alquiler vda.habitual para jovenes familias numerosas y minusvalidos NIF arrendador");
      lb310impalquil.setDescription("Extremadura: alquiler vda.habitual para jovenes familias numerosas y minusvalidos Importe");
      lb310cuidado.setDescription("Extremadura: cuidado familiares discapacitados");
      lb310acogmenor.setDescription("Extremadura: acogimiento menores");
      lb311nacimiento.setDescription("Galicia: nacimiento o adopcion hijos");
      lb311famnumeros.setDescription("Galicia: familia numerosa");
      lb311cuidado.setDescription("Galicia: cuidado hijos menores");
      lb311titdiscapa.setDescription("Galicia: contribuyentes minusvalidos > 65 años que precisan ayuda terceras personas");
      lb311tecnologia.setDescription("Galicia: gastos nuevas tecnologias hogares gallegos");
      lb311nifalquil.setDescription("Galicia: alquiler vda.habitual NIF arrendador");
      lb311impalquil.setDescription("Galicia: alquiler vda.habitual Importe");
      lb311autoempleo.setDescription("Galicia: fomento autoempleo hombres menores 35 años y mujeres cualquier edad");
      lb312nacimiento.setDescription("Madrid: nacimiento o adopcion hijos");
      lb312adopintern.setDescription("Madrid: adopcion internacional niños");
      lb312acogmenor.setDescription("Madrid: acogimiento familiar menores");
      lb312acogmayor.setDescription("Madrid: acogimiento no remunerado mayores 65 años y/o discapacitados");
      lb312nifalquil.setDescription("Madrid: arrendamiento vda.habitual por menores 35 años NIF arrendador");
      lb312impalquil.setDescription("Madrid: arrendamiento vda.habitual por menores 35 años Importe");
      lb312donfundac.setDescription("Madrid: donativos fundaciones");
      lb312ncremcoste.setDescription("Madrid: incremento costes financiacion ajena para inver. vda.habitual");
      lb312gastosedu.setDescription("Madrid: gastos educativos");
      lb312vdanueva.setDescription("Madrid: inver. vda.habitual nueva construccion");
      lb312mas2descen.setDescription("Madrid: familias con 2 o mas descendientes e ingresos reducidos");
      lb312accnuevas.setDescription("Madrid; adquisicion acciones de nuevas entidades");
      lb312autoempleo.setDescription("Madrid: fomento autoempleo jovenes");
      lb312accmercalt.setDescription("Madrid: inversiones en entidades cotizadas en Mercado alternativo Bursatil");
      lb310ctaayuda.setDescription("Extremadura: 2011 ayuda domestica. Cuenta cotizacion");
      lb310ayudadomes.setDescription("Extremadura: 2011 ayuda domestica. Importe     [DAD]");
      lb310empleojove.setDescription("Extremadura: 2011 fomento del autoempleo jovenes emprendedores [FEJ]");
      lb310empleomuje.setDescription("Extremadura: 2011 fomento del autoempleo mujeres emprendedoras [FEJ]");
      lb310adopintern.setDescription("Extremadura  2011 adopcion internacional");
      lb310fammonopar.setDescription("Extremadura: 2011 familias monoparentales");
      lb310nacmultipl.setDescription("Extremadura: 2011 partos multiples");
      lb310donecolog.setDescription("Extremadura: 2011 donaciones finalidad ecologica [DFE]");
      lb310adqordenad.setDescription("Extremadura: 2011 adquisicion ordenadores personales domesticos [AOR]");
      lb310mejorasvda.setDescription("Extremadura: 2011 obras de reparación y mejora en vivienda habitual [ORM]");
      lb311acogmenor.setDescription("Galicia: 2011 acogimiento familiar menores  [MAF]");
      lb311adqaccion.setDescription("Galicia: 2011 inversion compra acciones  [ACC]");
      lb311accmercalt.setDescription("Galicia: 2011 inversion compra acciones  [AC2]");
      lb310antaplorm.setDescription("Extremadura 2012: ded.ejer.anter.aplicada ORM obras vda");
      lb310antexcorm.setDescription("Extremadura 2012: ded.ejer.anter.exceso ORM obras vda");
      lb310escolar.setDescription("Extremadura 2012: material escolar [MES]");
      lb311adqaccion3.setDescription("Galicia: 2013 inversion compra acciones [AC3]");
      lb310adqaccion.setDescription("Extremadura 2013 inversion compra acciones  [ACC]");
      lb310guarderia.setDescription("Extremadura:2014 gastos guarderia [GUA]");
      lb310viudos.setDescription("Extremadura:2014 contibuyentes viudos");
      lb309nifext1.setDescription("Catalunya 2014:Alquiler Nro.Identificac.en pais residencia");
      lb311nifext1.setDescription("Galicia 2014:  Alquiler Nro.Identificac.en pais residencia");
      lb312nifext1.setDescription("Madrid 2014:   Alquiler Nro.Identificac.en pais residencia");
      }
    }
    
  public class TabLiquidaanexob4 extends TableDef
    {
    // Campos
    public FieldDef lb4ejeraplic;
    public FieldDef lb4declaran;
    public FieldDef lb4muf;
    public FieldDef lb4tipocalculo;
    public FieldDef lb413invervda;
    public FieldDef lb413donbic;
    public FieldDef lb413guarderia;
    public FieldDef lb413invenergia;
    public FieldDef lb413dispahagua;
    public FieldDef lb416nacimiento;
    public FieldDef lb416invervda;
    public FieldDef lb416inv2vdamun;
    public FieldDef lb416inv2vda;
    public FieldDef lb416adqordenad;
    public FieldDef lb416rehvda;
    public FieldDef lb417nacimiento;
    public FieldDef lb417nacmultipl;
    public FieldDef lb417nacdiscapa;
    public FieldDef lb417famnumeros;
    public FieldDef lb417guarderia;
    public FieldDef lb417conciliaci;
    public FieldDef lb417titdiscapa;
    public FieldDef lb417ascdiscap;
    public FieldDef lb417labores;
    public FieldDef lb417adqvda;
    public FieldDef lb417vdajovenes;
    public FieldDef lb417adqvdadisc;
    public FieldDef lb417vdaayudas;
    public FieldDef lb417vdaalqnif;
    public FieldDef lb417vdaalqimpo;
    public FieldDef lb417vdalqacnif;
    public FieldDef lb417vdalqacimp;
    public FieldDef lb417invenergia;
    public FieldDef lb417donecolog;
    public FieldDef lb417donbic;
    public FieldDef lb417donrestau;
    public FieldDef lb417resbic;
    public FieldDef lb417donlegua;
    public FieldDef lb417ncremcoste;
    public FieldDef lb417mas2descen;
    public FieldDef lb417ayudaspubl;
    public FieldDef lb413autoempleo;
    public FieldDef lb417escolar;
    public FieldDef lb413adqaccion;
    public FieldDef lb413accmercalt;
    public FieldDef lb417mejorasvda;
    public FieldDef lb417mejorasnif;
    public FieldDef lb417nifext1;
    public FieldDef lb417nifext2;
    public TabLiquidaanexob4(String name)
      {
      super(name);
      lb4ejeraplic = new FieldDef("lb4ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lb4declaran = new FieldDef("lb4declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lb4muf = new FieldDef("lb4muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb4tipocalculo = new FieldDef("lb4tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb413invervda = new FieldDef("lb413invervda",FieldDef.FLOAT,6,0);
      lb413donbic = new FieldDef("lb413donbic",FieldDef.FLOAT,6,0);
      lb413guarderia = new FieldDef("lb413guarderia",FieldDef.FLOAT,6,0);
      lb413invenergia = new FieldDef("lb413invenergia",FieldDef.FLOAT,6,0);
      lb413dispahagua = new FieldDef("lb413dispahagua",FieldDef.FLOAT,6,0);
      lb416nacimiento = new FieldDef("lb416nacimiento",FieldDef.FLOAT,6,0);
      lb416invervda = new FieldDef("lb416invervda",FieldDef.FLOAT,6,0);
      lb416inv2vdamun = new FieldDef("lb416inv2vdamun",FieldDef.INTEGER,0);
      lb416inv2vda = new FieldDef("lb416inv2vda",FieldDef.FLOAT,6,0);
      lb416adqordenad = new FieldDef("lb416adqordenad",FieldDef.FLOAT,6,0);
      lb416rehvda = new FieldDef("lb416rehvda",FieldDef.FLOAT,6,0);
      lb417nacimiento = new FieldDef("lb417nacimiento",FieldDef.FLOAT,6,0);
      lb417nacmultipl = new FieldDef("lb417nacmultipl",FieldDef.FLOAT,6,0);
      lb417nacdiscapa = new FieldDef("lb417nacdiscapa",FieldDef.FLOAT,6,0);
      lb417famnumeros = new FieldDef("lb417famnumeros",FieldDef.FLOAT,6,0);
      lb417guarderia = new FieldDef("lb417guarderia",FieldDef.FLOAT,6,0);
      lb417conciliaci = new FieldDef("lb417conciliaci",FieldDef.FLOAT,6,0);
      lb417titdiscapa = new FieldDef("lb417titdiscapa",FieldDef.FLOAT,6,0);
      lb417ascdiscap = new FieldDef("lb417ascdiscap",FieldDef.FLOAT,6,0);
      lb417labores = new FieldDef("lb417labores",FieldDef.FLOAT,6,0);
      lb417adqvda = new FieldDef("lb417adqvda",FieldDef.FLOAT,6,0);
      lb417vdajovenes = new FieldDef("lb417vdajovenes",FieldDef.FLOAT,6,0);
      lb417adqvdadisc = new FieldDef("lb417adqvdadisc",FieldDef.FLOAT,6,0);
      lb417vdaayudas = new FieldDef("lb417vdaayudas",FieldDef.FLOAT,6,0);
      lb417vdaalqnif = new FieldDef("lb417vdaalqnif",FieldDef.CHAR,15);
      lb417vdaalqimpo = new FieldDef("lb417vdaalqimpo",FieldDef.FLOAT,6,0);
      lb417vdalqacnif = new FieldDef("lb417vdalqacnif",FieldDef.CHAR,15);
      lb417vdalqacimp = new FieldDef("lb417vdalqacimp",FieldDef.FLOAT,6,0);
      lb417invenergia = new FieldDef("lb417invenergia",FieldDef.FLOAT,6,0);
      lb417donecolog = new FieldDef("lb417donecolog",FieldDef.FLOAT,6,0);
      lb417donbic = new FieldDef("lb417donbic",FieldDef.FLOAT,6,0);
      lb417donrestau = new FieldDef("lb417donrestau",FieldDef.FLOAT,6,0);
      lb417resbic = new FieldDef("lb417resbic",FieldDef.FLOAT,6,0);
      lb417donlegua = new FieldDef("lb417donlegua",FieldDef.FLOAT,6,0);
      lb417ncremcoste = new FieldDef("lb417ncremcoste",FieldDef.FLOAT,6,0);
      lb417mas2descen = new FieldDef("lb417mas2descen",FieldDef.FLOAT,6,0);
      lb417ayudaspubl = new FieldDef("lb417ayudaspubl",FieldDef.FLOAT,6,0);
      lb413autoempleo = new FieldDef("lb413autoempleo",FieldDef.FLOAT,6,0);
      lb417escolar = new FieldDef("lb417escolar",FieldDef.FLOAT,6,0);
      lb413adqaccion = new FieldDef("lb413adqaccion",FieldDef.FLOAT,6,0);
      lb413accmercalt = new FieldDef("lb413accmercalt",FieldDef.FLOAT,6,0);
      lb417mejorasvda = new FieldDef("lb417mejorasvda",FieldDef.FLOAT,6,0);
      lb417mejorasnif = new FieldDef("lb417mejorasnif",FieldDef.CHAR,15);
      lb417nifext1 = new FieldDef("lb417nifext1",FieldDef.CHAR,25);
      lb417nifext2 = new FieldDef("lb417nifext2",FieldDef.CHAR,25);
      FieldDef array[] = {
        lb4ejeraplic,
        lb4declaran,
        lb4muf,
        lb4tipocalculo,
        lb413invervda,
        lb413donbic,
        lb413guarderia,
        lb413invenergia,
        lb413dispahagua,
        lb416nacimiento,
        lb416invervda,
        lb416inv2vdamun,
        lb416inv2vda,
        lb416adqordenad,
        lb416rehvda,
        lb417nacimiento,
        lb417nacmultipl,
        lb417nacdiscapa,
        lb417famnumeros,
        lb417guarderia,
        lb417conciliaci,
        lb417titdiscapa,
        lb417ascdiscap,
        lb417labores,
        lb417adqvda,
        lb417vdajovenes,
        lb417adqvdadisc,
        lb417vdaayudas,
        lb417vdaalqnif,
        lb417vdaalqimpo,
        lb417vdalqacnif,
        lb417vdalqacimp,
        lb417invenergia,
        lb417donecolog,
        lb417donbic,
        lb417donrestau,
        lb417resbic,
        lb417donlegua,
        lb417ncremcoste,
        lb417mas2descen,
        lb417ayudaspubl,
        lb413autoempleo,
        lb417escolar,
        lb413adqaccion,
        lb413accmercalt,
        lb417mejorasvda,
        lb417mejorasnif,
        lb417nifext1,
        lb417nifext2        
        };
      setColumns(array);
      FieldDef arrayf[] = {lb4ejeraplic,lb4declaran,lb4muf,lb4tipocalculo };
      setDescription("Liquidacion renta anexo B4: Deducciones autonomicas");
      setPrimaryKeys(arrayf);
      lb4ejeraplic.setDescription("Ejercicio aplicacion");
      lb4declaran.setDescription("Codigo de declarante");
      lb4muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lb4tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lb413invervda.setDescription("Murcia: inver. vda.habitual por jovenes edad igual o inferior 35 años");
      lb413donbic.setDescription("Murcia: donativos para proteccion del patrimonio historico Region Murcia");
      lb413guarderia.setDescription("Murcia: gastos guarderia para hijos menores 3 años");
      lb413invenergia.setDescription("Murcia: inver. instalaciones recursos energeticos renovables");
      lb413dispahagua.setDescription("Murcia: inver.es dispositivos domesticos ahorro agua");
      lb416nacimiento.setDescription("La Rioja: nacimiento o adopcion segundo o ulterior hijo");
      lb416invervda.setDescription("La Rioja: inver. adquisicion/rehabilitacion vda.habitual para jovenes");
      lb416inv2vdamun.setDescription("La Rioja: adquisicion/rehabilitacion 2 vivienda el medio rural. Codigo municipio");
      lb416inv2vda.setDescription("La Rioja: adquisicion/rehabilitacion 2 vivienda el medio rural");
      lb416adqordenad.setDescription("La Rioja: inver. no empresarial adquisicion ordenadores personales");
      lb416rehvda.setDescription("La Rioja: inver. rehabilitacion vda.habitual");
      lb417nacimiento.setDescription("Comunidad Valenciana: nacimiento/adopcion hijos");
      lb417nacmultipl.setDescription("Comunidad Valenciana: nacimiento/adopcion multiples");
      lb417nacdiscapa.setDescription("Comunidad Valenciana: nacimiento/adopcion hijos discapacitados");
      lb417famnumeros.setDescription("Comunidad Valenciana: familia numerosa");
      lb417guarderia.setDescription("Comunidad Valenciana: custodia guarderias y primer ciclo educacion infantil hijos menores 3 años");
      lb417conciliaci.setDescription("Comunidad Valenciana: conciliacion del trabajo vida familiar");
      lb417titdiscapa.setDescription("Comunidad Valenciana: contribuyentes discapacitados edad igual o superior 65 años");
      lb417ascdiscap.setDescription("Comunidad Valenciana: ascendientes > 75 años o > 65 años discapacitados");
      lb417labores.setDescription("Comunidad Valenciana: realizacion labores no remuneradas el hogar");
      lb417adqvda.setDescription("Comunidad Valenciana: adquisicion/rehabilitacion vivienda financiacion ajena");
      lb417vdajovenes.setDescription("Comunidad Valenciana: primera adquisicion vda.habitual para contribuyentes edad igual o inferior 35 años");
      lb417adqvdadisc.setDescription("Comunidad Valenciana: adquisicion vda.habitual discapacitados");
      lb417vdaayudas.setDescription("Comunidad Valenciana: cantidades adquisicion/rehabilitacion vda.habitual procedentes ayudas publicas");
      lb417vdaalqnif.setDescription("Comunidad Valenciana: arrendamiento vda.habitual NIF arrendador");
      lb417vdaalqimpo.setDescription("Comunidad Valenciana: arrendamiento vda.habitual Importe");
      lb417vdalqacnif.setDescription("Comunidad Valenciana: arrendamiento vivienda actividades distinto municipio NIF arrendador");
      lb417vdalqacimp.setDescription("Comunidad Valenciana: arrendamiento vivienda actividades distinto municipio Importe");
      lb417invenergia.setDescription("Comunidad Valenciana: cantidades inver.es fuentes energia renovables vda.habitual");
      lb417donecolog.setDescription("Comunidad Valenciana: donaciones finalidad ecologica");
      lb417donbic.setDescription("Comunidad Valenciana: donacion bienes integrantes Patrimonio Cultural Valenciano");
      lb417donrestau.setDescription("Comunidad Valenciana: cantidades donadas conservacion reparacion y restauracion Patrimonio Cultural Valenciano");
      lb417resbic.setDescription("Comunidad Valenciana: cantidades destinadas titulares conservacion etc. bienes Patrimonio Cultural Valenciano");
      lb417donlegua.setDescription("Comunidad Valenciana: donaciones destinadas al fomento lengua valenciana");
      lb417ncremcoste.setDescription("Comunidad Valenciana: incrementos costes financiacion ajena inver. vda.habitual");
      lb417mas2descen.setDescription("Comunidad Valenciana: contribuyentes con 2 o mas descendientes");
      lb417ayudaspubl.setDescription("Comunidad Valenciana: cantidades ayudas publicas");
      lb413autoempleo.setDescription("Murcia: 2011 autoempleo jovenes 35");
      lb417escolar.setDescription("Valencia 2013: material escolar [MES]");
      lb413adqaccion.setDescription("Murcia 2013 inver.adquisic.accones entidadades nuevas   [ACC]");
      lb413accmercalt.setDescription("Murcia 2013 inver.acciones mercado alternativo bursatil [AC2]");
      lb417mejorasvda.setDescription("Valencia 2014 obras de mejoras vda [ORM]");
      lb417mejorasnif.setDescription("Valencia 2014 NIF obras de mejoras vda NIF");
      lb417nifext1.setDescription("Valencia 2014:Alquiler Nro.Identificac.en pais residencia 1");
      lb417nifext2.setDescription("Valencia 2014:Alquiler Nro.Identificac.en pais residencia 2");
      }
    }
    
  public class TabPerdgananmej extends TableDef
    {
    // Campos
    public FieldDef pgoejeraplic;
    public FieldDef pgodeclaran;
    public FieldDef pgoident;
    public FieldDef pgodeclaracion;
    public FieldDef pgofechaven;
    public FieldDef pgofechaadq;
    public FieldDef pgovalorven;
    public FieldDef pgogastoven;
    public FieldDef pgovaloradq;
    public FieldDef pgoadqact;
    public FieldDef pgoinctotal;
    public FieldDef pgocalle;
    public FieldDef pgonumero;
    public FieldDef pgomunicipio;
    public FieldDef pgoprovincia;
    public FieldDef pgoctipovia;
    public FieldDef pgoctiponum;
    public FieldDef pgocalifnum;
    public FieldDef pgocbloque;
    public FieldDef pgocportal;
    public FieldDef pgocescalera;
    public FieldDef pgocplanta;
    public FieldDef pgocpuerta;
    public FieldDef pgoclavepais;
    public FieldDef pgocpostal;
    public FieldDef pgocodigoine;
    public FieldDef pgopoblacion;
    public FieldDef pgojustif211;
    public FieldDef pgotiporenta;
    public TabPerdgananmej(String name)
      {
      super(name);
      pgoejeraplic = new FieldDef("pgoejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pgodeclaran = new FieldDef("pgodeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pgoident = new FieldDef("pgoident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pgodeclaracion = new FieldDef("pgodeclaracion",FieldDef.INTEGER,0);
      pgofechaven = new FieldDef("pgofechaven",FieldDef.DATE);
      pgofechaadq = new FieldDef("pgofechaadq",FieldDef.DATE);
      pgovalorven = new FieldDef("pgovalorven",FieldDef.FLOAT,6,0);
      pgogastoven = new FieldDef("pgogastoven",FieldDef.FLOAT,6,0);
      pgovaloradq = new FieldDef("pgovaloradq",FieldDef.FLOAT,6,0);
      pgoadqact = new FieldDef("pgoadqact",FieldDef.FLOAT,6,0);
      pgoinctotal = new FieldDef("pgoinctotal",FieldDef.FLOAT,6,0);
      pgocalle = new FieldDef("pgocalle",FieldDef.CHAR,50);
      pgonumero = new FieldDef("pgonumero",FieldDef.CHAR,4);
      pgomunicipio = new FieldDef("pgomunicipio",FieldDef.CHAR,30);
      pgoprovincia = new FieldDef("pgoprovincia",FieldDef.INTEGER,0);
      pgoctipovia = new FieldDef("pgoctipovia",FieldDef.CHAR,5);
      pgoctiponum = new FieldDef("pgoctiponum",FieldDef.CHAR,3);
      pgocalifnum = new FieldDef("pgocalifnum",FieldDef.CHAR,3);
      pgocbloque = new FieldDef("pgocbloque",FieldDef.CHAR,3);
      pgocportal = new FieldDef("pgocportal",FieldDef.CHAR,3);
      pgocescalera = new FieldDef("pgocescalera",FieldDef.CHAR,3);
      pgocplanta = new FieldDef("pgocplanta",FieldDef.CHAR,3);
      pgocpuerta = new FieldDef("pgocpuerta",FieldDef.CHAR,3);
      pgoclavepais = new FieldDef("pgoclavepais",FieldDef.CHAR,2);
      pgocpostal = new FieldDef("pgocpostal",FieldDef.CHAR,5);
      pgocodigoine = new FieldDef("pgocodigoine",FieldDef.CHAR,5);
      pgopoblacion = new FieldDef("pgopoblacion",FieldDef.CHAR,30);
      pgojustif211 = new FieldDef("pgojustif211",FieldDef.CHAR,13);
      pgotiporenta = new FieldDef("pgotiporenta",FieldDef.INTEGER,0);
      FieldDef array[] = {
        pgoejeraplic,
        pgodeclaran,
        pgoident,
        pgodeclaracion,
        pgofechaven,
        pgofechaadq,
        pgovalorven,
        pgogastoven,
        pgovaloradq,
        pgoadqact,
        pgoinctotal,
        pgocalle,
        pgonumero,
        pgomunicipio,
        pgoprovincia,
        pgoctipovia,
        pgoctiponum,
        pgocalifnum,
        pgocbloque,
        pgocportal,
        pgocescalera,
        pgocplanta,
        pgocpuerta,
        pgoclavepais,
        pgocpostal,
        pgocodigoine,
        pgopoblacion,
        pgojustif211,
        pgotiporenta        
        };
      setColumns(array);
      FieldDef arrayf[] = {pgoejeraplic,pgodeclaran,pgoident };
      setDescription("Perd.y gananc. Mejora o 2a adquic. 210");
      setPrimaryKeys(arrayf);
      pgoejeraplic.setDescription("Ejercicio aplicacion");
      pgodeclaran.setDescription("CODIGO DE DECLARANTE");
      pgoident.setDescription("Identificador ganancia o perdida");
      pgodeclaracion.setDescription("Codigo Declaracion");
      pgofechaven.setDescription("Fecha Transmision");
      pgofechaadq.setDescription("Fecha Adquisicion o mejora");
      pgovalorven.setDescription("Valor Transmision");
      pgogastoven.setDescription("Gastos de transmision");
      pgovaloradq.setDescription("Valor Adquisicion");
      pgoadqact.setDescription("Valor Adquisicion Actualizado");
      pgoinctotal.setDescription("Incremento/Disminucion Total");
      pgocalle.setDescription("Calle");
      pgonumero.setDescription("Numero");
      pgomunicipio.setDescription("Municipio");
      pgoprovincia.setDescription("Provincia");
      pgoctipovia.setDescription("Tipo de via");
      pgoctiponum.setDescription("Tipo de numeracion");
      pgocalifnum.setDescription("Calificador de nro");
      pgocbloque.setDescription("Bloque");
      pgocportal.setDescription("Portal");
      pgocescalera.setDescription("Escalera");
      pgocplanta.setDescription("Planta");
      pgocpuerta.setDescription("Puerta");
      pgoclavepais.setDescription("Clave pais");
      pgocpostal.setDescription("Codigo postal");
      pgocodigoine.setDescription("Codigo INE del municipio");
      pgopoblacion.setDescription("Poblacio (si es difer municipi)");
      pgojustif211.setDescription("Nro justificante 211");
      pgotiporenta.setDescription("Tipo renta 28 33 34");
      }
    }
    
  public class TabPerdganpatrimon extends TableDef
    {
    // Campos
    public FieldDef pgpejeraplic;
    public FieldDef pgpdeclaran;
    public FieldDef pgpidentgananc;
    public FieldDef pgpdeclaracion;
    public FieldDef pgpmuf;
    public FieldDef pgptipoincrem;
    public FieldDef pgptipovalor;
    public FieldDef pgpdescripcion;
    public FieldDef pgptitulos;
    public FieldDef pgpfechaadq;
    public FieldDef pgpvaloradq;
    public FieldDef pgpfechatransm;
    public FieldDef pgpvalortransm;
    public FieldDef pgpinctotal;
    public FieldDef pgpanysperm;
    public FieldDef pgpincrreduc;
    public FieldDef pgpreinversion;
    public FieldDef pgpexencion;
    public FieldDef pgpsujeto;
    public FieldDef pgpsujetoant;
    public FieldDef pgpincrpend;
    public FieldDef pgpanysfracc;
    public FieldDef pgpcocientanys;
    public FieldDef pgpincrejer;
    public FieldDef pgpretencion;
    public FieldDef pgpvdahabitual;
    public FieldDef pgpreinejer;
    public FieldDef pgpclaumobil;
    public FieldDef pgpclaufinca;
    public FieldDef pgpporcentaje;
    public FieldDef pgpimpcobr;
    public FieldDef pgpplusvalia;
    public FieldDef pgpadqact;
    public FieldDef pgpejerbase;
    public FieldDef pgpperiodos;
    public FieldDef pgpnif;
    public FieldDef pgpcompensar;
    public FieldDef pgpimphipoteca;
    public FieldDef pgpreinejerant;
    public FieldDef pgpatribrentas;
    public FieldDef pgpnifentidad;
    public FieldDef pgpgastosventa;
    public FieldDef pgptipoclave;
    public FieldDef pgpaplicporcen;
    public FieldDef pgpreferencia;
    public FieldDef pgpsituaciovda;
    public FieldDef pgpvalorpatrim;
    public FieldDef pgpgansusreduc;
    public FieldDef pgpreducaplicab;
    public FieldDef pgpinmobant;
    public FieldDef pgpsocimi;
    public FieldDef pgpanysocimi;
    public FieldDef pgpdividendoexe;
    public FieldDef pgplimitesocimi;
    public FieldDef pgpimpexesocimi;
    public FieldDef pgpejercoeficie;
    public FieldDef pgpcorrecprevia;
    public FieldDef pgpcoefcormonet;
    public FieldDef pgpincnetord796;
    public FieldDef pgpcorrecmoneta;
    public FieldDef pgpregfuscontr1;
    public FieldDef pgpregfusnoper1;
    public FieldDef pgpvdaprotec;
    public FieldDef pgpvalorneto;
    public FieldDef pgprentaobten;
    public FieldDef pgpcarteraimp1;
    public FieldDef pgpcarteraimp2;
    public FieldDef pgpcarteraimp3;
    public FieldDef pgpcarteraimp4;
    public FieldDef pgpcarteraimp5;
    public FieldDef pgpcarteraimp6;
    public FieldDef pgpcobropago;
    public FieldDef pgpexenurban;
    public FieldDef pgpinmurbano;
    public FieldDef pgpbaseintegrac;
    public FieldDef pgpanysintegrac;
    public FieldDef pgpacnuevacreac;
    public FieldDef pgpdiferbaserto;
    public FieldDef pgpdacion;
    public FieldDef pgpfinpublicita;
    public TabPerdganpatrimon(String name)
      {
      super(name);
      pgpejeraplic = new FieldDef("pgpejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pgpdeclaran = new FieldDef("pgpdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pgpidentgananc = new FieldDef("pgpidentgananc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pgpdeclaracion = new FieldDef("pgpdeclaracion",FieldDef.INTEGER,0);
      pgpmuf = new FieldDef("pgpmuf",FieldDef.CHAR,6);
      pgptipoincrem = new FieldDef("pgptipoincrem",FieldDef.CHAR,1);
      pgptipovalor = new FieldDef("pgptipovalor",FieldDef.CHAR,3);
      pgpdescripcion = new FieldDef("pgpdescripcion",FieldDef.CHAR,40);
      pgptitulos = new FieldDef("pgptitulos",FieldDef.FLOAT,6,0);
      pgpfechaadq = new FieldDef("pgpfechaadq",FieldDef.DATE);
      pgpvaloradq = new FieldDef("pgpvaloradq",FieldDef.FLOAT,6,0);
      pgpfechatransm = new FieldDef("pgpfechatransm",FieldDef.DATE);
      pgpvalortransm = new FieldDef("pgpvalortransm",FieldDef.FLOAT,6,0);
      pgpinctotal = new FieldDef("pgpinctotal",FieldDef.FLOAT,6,0);
      pgpanysperm = new FieldDef("pgpanysperm",FieldDef.INTEGER,0);
      pgpincrreduc = new FieldDef("pgpincrreduc",FieldDef.FLOAT,6,0);
      pgpreinversion = new FieldDef("pgpreinversion",FieldDef.FLOAT,6,0);
      pgpexencion = new FieldDef("pgpexencion",FieldDef.FLOAT,6,0);
      pgpsujeto = new FieldDef("pgpsujeto",FieldDef.FLOAT,6,0);
      pgpsujetoant = new FieldDef("pgpsujetoant",FieldDef.FLOAT,6,0);
      pgpincrpend = new FieldDef("pgpincrpend",FieldDef.FLOAT,6,0);
      pgpanysfracc = new FieldDef("pgpanysfracc",FieldDef.INTEGER,0);
      pgpcocientanys = new FieldDef("pgpcocientanys",FieldDef.FLOAT,6,0);
      pgpincrejer = new FieldDef("pgpincrejer",FieldDef.FLOAT,6,0);
      pgpretencion = new FieldDef("pgpretencion",FieldDef.FLOAT,6,0);
      pgpvdahabitual = new FieldDef("pgpvdahabitual",FieldDef.CHAR,1);
      pgpreinejer = new FieldDef("pgpreinejer",FieldDef.FLOAT,6,0);
      pgpclaumobil = new FieldDef("pgpclaumobil",FieldDef.INTEGER,0);
      pgpclaufinca = new FieldDef("pgpclaufinca",FieldDef.INTEGER,0);
      pgpporcentaje = new FieldDef("pgpporcentaje",FieldDef.FLOAT,6,0);
      pgpimpcobr = new FieldDef("pgpimpcobr",FieldDef.FLOAT,6,0);
      pgpplusvalia = new FieldDef("pgpplusvalia",FieldDef.FLOAT,6,0);
      pgpadqact = new FieldDef("pgpadqact",FieldDef.FLOAT,6,0);
      pgpejerbase = new FieldDef("pgpejerbase",FieldDef.INTEGER,0);
      pgpperiodos = new FieldDef("pgpperiodos",FieldDef.INTEGER,0);
      pgpnif = new FieldDef("pgpnif",FieldDef.CHAR,15);
      pgpcompensar = new FieldDef("pgpcompensar",FieldDef.CHAR,1);
      pgpimphipoteca = new FieldDef("pgpimphipoteca",FieldDef.FLOAT,6,0);
      pgpreinejerant = new FieldDef("pgpreinejerant",FieldDef.FLOAT,6,0);
      pgpatribrentas = new FieldDef("pgpatribrentas",FieldDef.CHAR,1);
      pgpnifentidad = new FieldDef("pgpnifentidad",FieldDef.CHAR,15);
      pgpgastosventa = new FieldDef("pgpgastosventa",FieldDef.FLOAT,6,0);
      pgptipoclave = new FieldDef("pgptipoclave",FieldDef.INTEGER,0);
      pgpaplicporcen = new FieldDef("pgpaplicporcen",FieldDef.CHAR,1);
      pgpreferencia = new FieldDef("pgpreferencia",FieldDef.CHAR,20);
      pgpsituaciovda = new FieldDef("pgpsituaciovda",FieldDef.INTEGER,0);
      pgpvalorpatrim = new FieldDef("pgpvalorpatrim",FieldDef.FLOAT,6,0);
      pgpgansusreduc = new FieldDef("pgpgansusreduc",FieldDef.FLOAT,6,0);
      pgpreducaplicab = new FieldDef("pgpreducaplicab",FieldDef.FLOAT,6,0);
      pgpinmobant = new FieldDef("pgpinmobant",FieldDef.CHAR,50);
      pgpsocimi = new FieldDef("pgpsocimi",FieldDef.CHAR,1);
      pgpanysocimi = new FieldDef("pgpanysocimi",FieldDef.INTEGER,0);
      pgpdividendoexe = new FieldDef("pgpdividendoexe",FieldDef.FLOAT,6,0);
      pgplimitesocimi = new FieldDef("pgplimitesocimi",FieldDef.FLOAT,6,0);
      pgpimpexesocimi = new FieldDef("pgpimpexesocimi",FieldDef.FLOAT,6,0);
      pgpejercoeficie = new FieldDef("pgpejercoeficie",FieldDef.INTEGER,0);
      pgpcorrecprevia = new FieldDef("pgpcorrecprevia",FieldDef.FLOAT,6,0);
      pgpcoefcormonet = new FieldDef("pgpcoefcormonet",FieldDef.FLOAT,6,0);
      pgpincnetord796 = new FieldDef("pgpincnetord796",FieldDef.FLOAT,6,0);
      pgpcorrecmoneta = new FieldDef("pgpcorrecmoneta",FieldDef.FLOAT,6,0);
      pgpregfuscontr1 = new FieldDef("pgpregfuscontr1",FieldDef.CHAR,1);
      pgpregfusnoper1 = new FieldDef("pgpregfusnoper1",FieldDef.INTEGER,0);
      pgpvdaprotec = new FieldDef("pgpvdaprotec",FieldDef.CHAR,1);
      pgpvalorneto = new FieldDef("pgpvalorneto",FieldDef.FLOAT,6,0);
      pgprentaobten = new FieldDef("pgprentaobten",FieldDef.FLOAT,6,0);
      pgpcarteraimp1 = new FieldDef("pgpcarteraimp1",FieldDef.FLOAT,6,0);
      pgpcarteraimp2 = new FieldDef("pgpcarteraimp2",FieldDef.FLOAT,6,0);
      pgpcarteraimp3 = new FieldDef("pgpcarteraimp3",FieldDef.FLOAT,6,0);
      pgpcarteraimp4 = new FieldDef("pgpcarteraimp4",FieldDef.FLOAT,6,0);
      pgpcarteraimp5 = new FieldDef("pgpcarteraimp5",FieldDef.FLOAT,6,0);
      pgpcarteraimp6 = new FieldDef("pgpcarteraimp6",FieldDef.FLOAT,6,0);
      pgpcobropago = new FieldDef("pgpcobropago",FieldDef.CHAR,1);
      pgpexenurban = new FieldDef("pgpexenurban",FieldDef.FLOAT,6,0);
      pgpinmurbano = new FieldDef("pgpinmurbano",FieldDef.CHAR,1);
      pgpbaseintegrac = new FieldDef("pgpbaseintegrac",FieldDef.CHAR,1);
      pgpanysintegrac = new FieldDef("pgpanysintegrac",FieldDef.INTEGER,0);
      pgpacnuevacreac = new FieldDef("pgpacnuevacreac",FieldDef.CHAR,1);
      pgpdiferbaserto = new FieldDef("pgpdiferbaserto",FieldDef.CHAR,1);
      pgpdacion = new FieldDef("pgpdacion",FieldDef.CHAR,1);
      pgpfinpublicita = new FieldDef("pgpfinpublicita",FieldDef.CHAR,1);
      FieldDef array[] = {
        pgpejeraplic,
        pgpdeclaran,
        pgpidentgananc,
        pgpdeclaracion,
        pgpmuf,
        pgptipoincrem,
        pgptipovalor,
        pgpdescripcion,
        pgptitulos,
        pgpfechaadq,
        pgpvaloradq,
        pgpfechatransm,
        pgpvalortransm,
        pgpinctotal,
        pgpanysperm,
        pgpincrreduc,
        pgpreinversion,
        pgpexencion,
        pgpsujeto,
        pgpsujetoant,
        pgpincrpend,
        pgpanysfracc,
        pgpcocientanys,
        pgpincrejer,
        pgpretencion,
        pgpvdahabitual,
        pgpreinejer,
        pgpclaumobil,
        pgpclaufinca,
        pgpporcentaje,
        pgpimpcobr,
        pgpplusvalia,
        pgpadqact,
        pgpejerbase,
        pgpperiodos,
        pgpnif,
        pgpcompensar,
        pgpimphipoteca,
        pgpreinejerant,
        pgpatribrentas,
        pgpnifentidad,
        pgpgastosventa,
        pgptipoclave,
        pgpaplicporcen,
        pgpreferencia,
        pgpsituaciovda,
        pgpvalorpatrim,
        pgpgansusreduc,
        pgpreducaplicab,
        pgpinmobant,
        pgpsocimi,
        pgpanysocimi,
        pgpdividendoexe,
        pgplimitesocimi,
        pgpimpexesocimi,
        pgpejercoeficie,
        pgpcorrecprevia,
        pgpcoefcormonet,
        pgpincnetord796,
        pgpcorrecmoneta,
        pgpregfuscontr1,
        pgpregfusnoper1,
        pgpvdaprotec,
        pgpvalorneto,
        pgprentaobten,
        pgpcarteraimp1,
        pgpcarteraimp2,
        pgpcarteraimp3,
        pgpcarteraimp4,
        pgpcarteraimp5,
        pgpcarteraimp6,
        pgpcobropago,
        pgpexenurban,
        pgpinmurbano,
        pgpbaseintegrac,
        pgpanysintegrac,
        pgpacnuevacreac,
        pgpdiferbaserto,
        pgpdacion,
        pgpfinpublicita        
        };
      setColumns(array);
      FieldDef arrayf[] = {pgpejeraplic,pgpdeclaran,pgpidentgananc };
      setDescription("Perdidas y ganancias patrimoniales");
      setPrimaryKeys(arrayf);
      pgpejeraplic.setDescription("Ejercicio aplicacion");
      pgpdeclaran.setDescription("CODIGO DE DECLARANTE");
      pgpidentgananc.setDescription("Identificador ganancia o perdida");
      pgpdeclaracion.setDescription("Codigo Declaracion");
      pgpmuf.setDescription("M.U.F.");
      pgptipoincrem.setDescription("Tipo Incremento");
      pgptipovalor.setDescription("Tipo Valor");
      pgpdescripcion.setDescription("Descripcion");
      pgptitulos.setDescription("Numero de titulos o % Finca");
      pgpfechaadq.setDescription("Fecha Adquisicion");
      pgpvaloradq.setDescription("Valor Adquisicion");
      pgpfechatransm.setDescription("Fecha Transmision");
      pgpvalortransm.setDescription("Valor Transmision");
      pgpinctotal.setDescription("Incremento/Disminucion Total");
      pgpanysperm.setDescription("Años Permanencia");
      pgpincrreduc.setDescription("Incremento/Disminuc. Reducido");
      pgpreinversion.setDescription("Importe Reinversion");
      pgpexencion.setDescription("Incremento Exento Reinversion");
      pgpsujeto.setDescription("Incr.Total Sometido a Gravamen");
      pgpsujetoant.setDescription("Incr.Sujeto a Grav. Años Ant.");
      pgpincrpend.setDescription("Incremento Pendiente Gravamen");
      pgpanysfracc.setDescription("Años Fraccionamiento Cobro");
      pgpcocientanys.setDescription("Cociente Años");
      pgpincrejer.setDescription("Incremento Imputable Ejercicio");
      pgpretencion.setDescription("Retenciones/Ingresos a Cta.");
      pgpvdahabitual.setDescription("Vivienda habitual");
      pgpreinejer.setDescription("Reinvertido en el Ejercicio");
      pgpclaumobil.setDescription("Contador Valor Mobiliario");
      pgpclaufinca.setDescription("Contador Finca");
      pgpporcentaje.setDescription("Porcentaje Propiedad");
      pgpimpcobr.setDescription("Importe Cobrado Ej.");
      pgpplusvalia.setDescription("Ingreso a Cuenta Repercutido");
      pgpadqact.setDescription("Valor Adquisicion Actualizado");
      pgpejerbase.setDescription("Ejercicio reinver.bfos.extrao.");
      pgpperiodos.setDescription("Años reinver.bfos.extraordina.");
      pgpnif.setDescription("NIF");
      pgpcompensar.setDescription("Debe compensarse");
      pgpimphipoteca.setDescription("Importe cancelacion hipoteca");
      pgpreinejerant.setDescription("Reinvertido en ejer.anteriores");
      pgpatribrentas.setDescription("Atribucion de rentas");
      pgpnifentidad.setDescription("NIF entidad atribucion rentas");
      pgpgastosventa.setDescription("Gastos inherentes transmision");
      pgptipoclave.setDescription("Tipo de clave");
      pgpaplicporcen.setDescription("Aplicar % propiedad a importes");
      pgpreferencia.setDescription("Referencia catastral");
      pgpsituaciovda.setDescription("Situacion inmueble");
      pgpvalorpatrim.setDescription("Valor patrimonial 2005");
      pgpgansusreduc.setDescription("Ganancia susceptible reduccion");
      pgpreducaplicab.setDescription("Reduccion aplicable");
      pgpinmobant.setDescription("Valores anter.inmob.(cartera)");
      pgpsocimi.setDescription("Regimen Especial SOCIMI");
      pgpanysocimi.setDescription("Años tenencia SOCIMI");
      pgpdividendoexe.setDescription("Dividendos exentos SOCIMI");
      pgplimitesocimi.setDescription("Importe limitable");
      pgpimpexesocimi.setDescription("Valor Exento aplicacion SOCIMI");
      pgpejercoeficie.setDescription("Ejercicio coeficiente");
      pgpcorrecprevia.setDescription("Correccion monetaria previa");
      pgpcoefcormonet.setDescription("Coeficiente correccion monetaria");
      pgpincnetord796.setDescription("Incremento neto RDL 7/1996");
      pgpcorrecmoneta.setDescription("Correccion monetaria");
      pgpregfuscontr1.setDescription("Contribuyente que opta (1)");
      pgpregfusnoper1.setDescription("Nro de operaciones     (1)");
      pgpvdaprotec.setDescription("Vivienda protecion oficial");
      pgpvalorneto.setDescription("Valor neto contable Correc.Monetaria");
      pgprentaobten.setDescription("Renta obtenida Correc.Monetaria");
      pgpcarteraimp1.setDescription("Cap.Inm.VCadastral / Cap.Mob.VPatrimoni");
      pgpcarteraimp2.setDescription("Cap.Inm.VPatrimoni");
      pgpcarteraimp3.setDescription("Cap.Inm.VCompra");
      pgpcarteraimp4.setDescription("Cap.Inm.Millores");
      pgpcarteraimp5.setDescription("Cap.Inm.VSuelo");
      pgpcarteraimp6.setDescription("Cap.Inm.VSuelo compra");
      pgpcobropago.setDescription("Imputacion por Cobro-Pago");
      pgpexenurban.setDescription("Exencion innmb.urbanos");
      pgpinmurbano.setDescription("Inmueble urbano");
      pgpbaseintegrac.setDescription("Base de integracion G-Gral <=1 any / A-Ahorro >1any");
      pgpanysintegrac.setDescription("Anys integracio");
      pgpacnuevacreac.setDescription("Acciones o particp en empresas nueva creacion x exempcio");
      pgpdiferbaserto.setDescription("Base rtco difer.ganan.sujeto para obligacion Ctas omnibus");
      pgpdacion.setDescription("Daci¢n en pago de la vivienda habitual");
      pgpfinpublicita.setDescription("Premios con fines publicitarios");
      }
    }
    
  public class TabLiquidaanexob1 extends TableDef
    {
    // Campos
    public FieldDef lb1ejeraplic;
    public FieldDef lb1declaran;
    public FieldDef lb1muf;
    public FieldDef lb1tipocalculo;
    public FieldDef lb101familiar;
    public FieldDef lb101vdaproteg;
    public FieldDef lb101vdajovenes;
    public FieldDef lb101nifalquil;
    public FieldDef lb101impalquil;
    public FieldDef lb101autoempleo;
    public FieldDef lb101adqaccion;
    public FieldDef lb101adopintern;
    public FieldDef lb101titdiscapa;
    public FieldDef lb101ascmayor;
    public FieldDef lb101asistgral;
    public FieldDef lb101ctaasist;
    public FieldDef lb101asistayuda;
    public FieldDef lb101ctaayuda;
    public FieldDef lb101ayudadomes;
    public FieldDef lb102nacimiento;
    public FieldDef lb102adopintern;
    public FieldDef lb102cuidado;
    public FieldDef lb102donecolog;
    public FieldDef lb102adqvdaterr;
    public FieldDef lb103acogmayor;
    public FieldDef lb103adqvdadisc;
    public FieldDef lb103adqvdafami;
    public FieldDef lb103vdahabprot;
    public FieldDef lb103nifalquil;
    public FieldDef lb103impalquil;
    public FieldDef lb103empleojov;
    public FieldDef lb103empleootr;
    public FieldDef lb103donacion;
    public FieldDef lb103adopintern;
    public FieldDef lb103nacmultipl;
    public FieldDef lb103famnumeros;
    public FieldDef lb103fammonopar;
    public FieldDef lb103acogmenor;
    public FieldDef lb104libros;
    public FieldDef lb104contribmay;
    public FieldDef lb104vdajovenes;
    public FieldDef lb104nifalquil;
    public FieldDef lb104impalquil;
    public FieldDef lb104minusvdecl;
    public FieldDef lb104suelorust;
    public FieldDef lb104adopcion;
    public FieldDef lb104transmvda;
    public FieldDef lb104transmvpro;
    public FieldDef lb104autoempleo;
    public FieldDef lb102accmercalt;
    public FieldDef lb103gforestal;
    public FieldDef lb104adqaccion;
    public FieldDef lb102adqaccion;
    public FieldDef lb102vdarural;
    public FieldDef lb101conyugemin;
    public FieldDef lb101mejorasvda;
    public FieldDef lb101gasdefensa;
    public FieldDef lb104gastosalud;
    public FieldDef lb101mejorasexc;
    public FieldDef lb102libros;
    public FieldDef lb102impalquil;
    public FieldDef lb102vdasocial;
    public FieldDef lb102nifalquil;
    public FieldDef lb102gastosalud;
    public FieldDef lb102titmayor;
    public FieldDef lb101nifext1;
    public FieldDef lb102nifext1;
    public FieldDef lb103nifext1;
    public FieldDef lb102nacpob;
    public TabLiquidaanexob1(String name)
      {
      super(name);
      lb1ejeraplic = new FieldDef("lb1ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lb1declaran = new FieldDef("lb1declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lb1muf = new FieldDef("lb1muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb1tipocalculo = new FieldDef("lb1tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb101familiar = new FieldDef("lb101familiar",FieldDef.FLOAT,6,0);
      lb101vdaproteg = new FieldDef("lb101vdaproteg",FieldDef.FLOAT,6,0);
      lb101vdajovenes = new FieldDef("lb101vdajovenes",FieldDef.FLOAT,6,0);
      lb101nifalquil = new FieldDef("lb101nifalquil",FieldDef.CHAR,15);
      lb101impalquil = new FieldDef("lb101impalquil",FieldDef.FLOAT,6,0);
      lb101autoempleo = new FieldDef("lb101autoempleo",FieldDef.FLOAT,6,0);
      lb101adqaccion = new FieldDef("lb101adqaccion",FieldDef.FLOAT,6,0);
      lb101adopintern = new FieldDef("lb101adopintern",FieldDef.FLOAT,6,0);
      lb101titdiscapa = new FieldDef("lb101titdiscapa",FieldDef.FLOAT,6,0);
      lb101ascmayor = new FieldDef("lb101ascmayor",FieldDef.FLOAT,6,0);
      lb101asistgral = new FieldDef("lb101asistgral",FieldDef.FLOAT,6,0);
      lb101ctaasist = new FieldDef("lb101ctaasist",FieldDef.CHAR,11);
      lb101asistayuda = new FieldDef("lb101asistayuda",FieldDef.FLOAT,6,0);
      lb101ctaayuda = new FieldDef("lb101ctaayuda",FieldDef.CHAR,11);
      lb101ayudadomes = new FieldDef("lb101ayudadomes",FieldDef.FLOAT,6,0);
      lb102nacimiento = new FieldDef("lb102nacimiento",FieldDef.FLOAT,6,0);
      lb102adopintern = new FieldDef("lb102adopintern",FieldDef.FLOAT,6,0);
      lb102cuidado = new FieldDef("lb102cuidado",FieldDef.FLOAT,6,0);
      lb102donecolog = new FieldDef("lb102donecolog",FieldDef.FLOAT,6,0);
      lb102adqvdaterr = new FieldDef("lb102adqvdaterr",FieldDef.FLOAT,6,0);
      lb103acogmayor = new FieldDef("lb103acogmayor",FieldDef.FLOAT,6,0);
      lb103adqvdadisc = new FieldDef("lb103adqvdadisc",FieldDef.FLOAT,6,0);
      lb103adqvdafami = new FieldDef("lb103adqvdafami",FieldDef.FLOAT,6,0);
      lb103vdahabprot = new FieldDef("lb103vdahabprot",FieldDef.FLOAT,6,0);
      lb103nifalquil = new FieldDef("lb103nifalquil",FieldDef.CHAR,15);
      lb103impalquil = new FieldDef("lb103impalquil",FieldDef.FLOAT,6,0);
      lb103empleojov = new FieldDef("lb103empleojov",FieldDef.FLOAT,6,0);
      lb103empleootr = new FieldDef("lb103empleootr",FieldDef.FLOAT,6,0);
      lb103donacion = new FieldDef("lb103donacion",FieldDef.FLOAT,6,0);
      lb103adopintern = new FieldDef("lb103adopintern",FieldDef.FLOAT,6,0);
      lb103nacmultipl = new FieldDef("lb103nacmultipl",FieldDef.FLOAT,6,0);
      lb103famnumeros = new FieldDef("lb103famnumeros",FieldDef.FLOAT,6,0);
      lb103fammonopar = new FieldDef("lb103fammonopar",FieldDef.FLOAT,6,0);
      lb103acogmenor = new FieldDef("lb103acogmenor",FieldDef.FLOAT,6,0);
      lb104libros = new FieldDef("lb104libros",FieldDef.FLOAT,6,0);
      lb104contribmay = new FieldDef("lb104contribmay",FieldDef.FLOAT,6,0);
      lb104vdajovenes = new FieldDef("lb104vdajovenes",FieldDef.FLOAT,6,0);
      lb104nifalquil = new FieldDef("lb104nifalquil",FieldDef.CHAR,15);
      lb104impalquil = new FieldDef("lb104impalquil",FieldDef.FLOAT,6,0);
      lb104minusvdecl = new FieldDef("lb104minusvdecl",FieldDef.FLOAT,6,0);
      lb104suelorust = new FieldDef("lb104suelorust",FieldDef.FLOAT,6,0);
      lb104adopcion = new FieldDef("lb104adopcion",FieldDef.FLOAT,6,0);
      lb104transmvda = new FieldDef("lb104transmvda",FieldDef.FLOAT,6,0);
      lb104transmvpro = new FieldDef("lb104transmvpro",FieldDef.FLOAT,6,0);
      lb104autoempleo = new FieldDef("lb104autoempleo",FieldDef.FLOAT,6,0);
      lb102accmercalt = new FieldDef("lb102accmercalt",FieldDef.FLOAT,6,0);
      lb103gforestal = new FieldDef("lb103gforestal",FieldDef.FLOAT,6,0);
      lb104adqaccion = new FieldDef("lb104adqaccion",FieldDef.FLOAT,6,0);
      lb102adqaccion = new FieldDef("lb102adqaccion",FieldDef.FLOAT,6,0);
      lb102vdarural = new FieldDef("lb102vdarural",FieldDef.FLOAT,6,0);
      lb101conyugemin = new FieldDef("lb101conyugemin",FieldDef.FLOAT,6,0);
      lb101mejorasvda = new FieldDef("lb101mejorasvda",FieldDef.FLOAT,6,0);
      lb101gasdefensa = new FieldDef("lb101gasdefensa",FieldDef.FLOAT,6,0);
      lb104gastosalud = new FieldDef("lb104gastosalud",FieldDef.FLOAT,6,0);
      lb101mejorasexc = new FieldDef("lb101mejorasexc",FieldDef.FLOAT,6,0);
      lb102libros = new FieldDef("lb102libros",FieldDef.FLOAT,6,0);
      lb102impalquil = new FieldDef("lb102impalquil",FieldDef.FLOAT,6,0);
      lb102vdasocial = new FieldDef("lb102vdasocial",FieldDef.FLOAT,6,0);
      lb102nifalquil = new FieldDef("lb102nifalquil",FieldDef.CHAR,15);
      lb102gastosalud = new FieldDef("lb102gastosalud",FieldDef.FLOAT,6,0);
      lb102titmayor = new FieldDef("lb102titmayor",FieldDef.FLOAT,6,0);
      lb101nifext1 = new FieldDef("lb101nifext1",FieldDef.CHAR,25);
      lb102nifext1 = new FieldDef("lb102nifext1",FieldDef.CHAR,25);
      lb103nifext1 = new FieldDef("lb103nifext1",FieldDef.CHAR,25);
      lb102nacpob = new FieldDef("lb102nacpob",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lb1ejeraplic,
        lb1declaran,
        lb1muf,
        lb1tipocalculo,
        lb101familiar,
        lb101vdaproteg,
        lb101vdajovenes,
        lb101nifalquil,
        lb101impalquil,
        lb101autoempleo,
        lb101adqaccion,
        lb101adopintern,
        lb101titdiscapa,
        lb101ascmayor,
        lb101asistgral,
        lb101ctaasist,
        lb101asistayuda,
        lb101ctaayuda,
        lb101ayudadomes,
        lb102nacimiento,
        lb102adopintern,
        lb102cuidado,
        lb102donecolog,
        lb102adqvdaterr,
        lb103acogmayor,
        lb103adqvdadisc,
        lb103adqvdafami,
        lb103vdahabprot,
        lb103nifalquil,
        lb103impalquil,
        lb103empleojov,
        lb103empleootr,
        lb103donacion,
        lb103adopintern,
        lb103nacmultipl,
        lb103famnumeros,
        lb103fammonopar,
        lb103acogmenor,
        lb104libros,
        lb104contribmay,
        lb104vdajovenes,
        lb104nifalquil,
        lb104impalquil,
        lb104minusvdecl,
        lb104suelorust,
        lb104adopcion,
        lb104transmvda,
        lb104transmvpro,
        lb104autoempleo,
        lb102accmercalt,
        lb103gforestal,
        lb104adqaccion,
        lb102adqaccion,
        lb102vdarural,
        lb101conyugemin,
        lb101mejorasvda,
        lb101gasdefensa,
        lb104gastosalud,
        lb101mejorasexc,
        lb102libros,
        lb102impalquil,
        lb102vdasocial,
        lb102nifalquil,
        lb102gastosalud,
        lb102titmayor,
        lb101nifext1,
        lb102nifext1,
        lb103nifext1,
        lb102nacpob        
        };
      setColumns(array);
      FieldDef arrayf[] = {lb1ejeraplic,lb1declaran,lb1muf,lb1tipocalculo };
      setDescription("Liquidacion renta anexo B1: Deducciones autonomicas");
      setPrimaryKeys(arrayf);
      lb1ejeraplic.setDescription("Ejercicio aplicacion");
      lb1declaran.setDescription("Codigo de declarante");
      lb1muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lb1tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lb101familiar.setDescription("Andalucia: beneficiarios ayudas familiares");
      lb101vdaproteg.setDescription("Andalucia: beneficiarios ayudas viviendas protegidas");
      lb101vdajovenes.setDescription("Andalucia: inver. vda.habitual protegida/personas jovenes");
      lb101nifalquil.setDescription("Andalucia: cantidades invertidas alquiler vda.habitual NIF arrendador");
      lb101impalquil.setDescription("Andalucia: cantidades invertidas alquiler vda.habitual Importe");
      lb101autoempleo.setDescription("Andalucia: fomento autoempleo");
      lb101adqaccion.setDescription("Andalucia: adq.acciones y participaciones sociales");
      lb101adopintern.setDescription("Andalucia: adopcion hijos ambito internacional");
      lb101titdiscapa.setDescription("Andalucia: contribuyentes discapacidad");
      lb101ascmayor.setDescription("Andalucia: padre/madre familia monoparental ascendientes mayores 75 años");
      lb101asistgral.setDescription("Andalucia: asistencia personas discapacidad Deduccion caracter general");
      lb101ctaasist.setDescription("Andalucia: asistencia personas discapacidad precisan ayuda. Cuenta cotizacion");
      lb101asistayuda.setDescription("Andalucia: asistencia personas discapacidad precisan ayuda. Importe");
      lb101ctaayuda.setDescription("Andalucia: ayuda domestica. Cuenta cotizacion");
      lb101ayudadomes.setDescription("Andalucia: ayuda domestica. Importe");
      lb102nacimiento.setDescription("Aragon: nacimiento o adopcion tercer hijo o sucesivos o segundo hijo discapacitado");
      lb102adopintern.setDescription("Aragon: adopcion internacional niños");
      lb102cuidado.setDescription("Aragon: el cuidado personas dependientes");
      lb102donecolog.setDescription("Aragon: donaciones finalidad ecologica");
      lb102adqvdaterr.setDescription("Aragon: adquisicion vda.habitual por victimas del terrorismo");
      lb103acogmayor.setDescription("Asturias: acogimiento no remunerado mayores 65 años");
      lb103adqvdadisc.setDescription("Asturias: adquisicion/adecuacion vda.habitual discapacitados");
      lb103adqvdafami.setDescription("Asturias: adquisicion/adecuacion vvda. habitual conyuge ascendientes o descendientes discapacitados");
      lb103vdahabprot.setDescription("Asturias: inver. vda.habitual protegida");
      lb103nifalquil.setDescription("Asturias: arrendamiento vda.habitual NIF arrendador");
      lb103impalquil.setDescription("Asturias: arrendamiento vda.habitual Importe");
      lb103empleojov.setDescription("Asturias: fomento autoempleo mujeres y jovenes emprendedores");
      lb103empleootr.setDescription("Asturias: fomento autoempleo");
      lb103donacion.setDescription("Asturias: donacion fincas rusticas favor del Principado Asturias");
      lb103adopintern.setDescription("Asturias: adopcion internacional menores");
      lb103nacmultipl.setDescription("Asturias: partos multiples o por dos o mas adopciones");
      lb103famnumeros.setDescription("Asturias: familias numerosas");
      lb103fammonopar.setDescription("Asturias: familias monoparentales");
      lb103acogmenor.setDescription("Asturias: acogimiento familiar menores");
      lb104libros.setDescription("Illes Balears: gastos adquisicion libros texto");
      lb104contribmay.setDescription("Illes Balears: contribuyentes edad igual o superior 65 años");
      lb104vdajovenes.setDescription("Illes Balears: adquisicion/rehabilitacion vda.habitual jovenes");
      lb104nifalquil.setDescription("Illes Balears: arrendamiento vda.habitual por jovenes NIF arrendador");
      lb104impalquil.setDescription("Illes Balears: arrendamiento vda.habitual por jovenes Importe");
      lb104minusvdecl.setDescription("Illes Balears: declarantes minusvalia fisica/psiquica o descendientes esa condicion");
      lb104suelorust.setDescription("Illes Balears: titulares fincas o terrrenos suelo rustico protegido");
      lb104adopcion.setDescription("Illes Balears: adopcion hijos");
      lb104transmvda.setDescription("Illes Balears: impuesto transmisiones y AJD por adquisicion vda.habitual");
      lb104transmvpro.setDescription("Illes Balears: impuesto transmisiones y AJD por adquisicion vda.habitual protegida");
      lb104autoempleo.setDescription("Illes Balears: fomento del autoempleo");
      lb102accmercalt.setDescription("Aragon: 2011 inversion acciones empresas en expansion mercado alternativo [AC2]");
      lb103gforestal.setDescription("Asturias: 2011 Gestion forestal sostenible [GFS]");
      lb104adqaccion.setDescription("Baleares: 2011 inversion adquisicion acciones [ACC]");
      lb102adqaccion.setDescription("Aragon: 2012 compra acciones entidades investigacion y desarrollo [ACC]");
      lb102vdarural.setDescription("Aragon: 2012 adquisicion primera vivienda  nucleos rurales [VIA]");
      lb101conyugemin.setDescription("Andalucia 2012: conyuge minusvalido [CPD]");
      lb101mejorasvda.setDescription("Andalucia 2012  obras de mejoras energeticas [ORM]");
      lb101gasdefensa.setDescription("Andalucia 2012  gastos defensa juridica      [GDF]");
      lb104gastosalud.setDescription("Illes Balears 2012: gastos primas seguros salud [GPS]");
      lb101mejorasexc.setDescription("Andalucia 2012  exceso pdte obras de mejoras energeticas [ORM]");
      lb102libros.setDescription("Aragon 2013: Compra libros texto [LIB]");
      lb102impalquil.setDescription("Aragon 2013: Alquiler vda.habitual [AAV]");
      lb102vdasocial.setDescription("Aragon 2013: Arrendador de vda social [AAS]");
      lb102nifalquil.setDescription("Aragon 2013: NIF arrendador Alquiler vda.habitual [AAV]");
      lb102gastosalud.setDescription("Aragon 2014: gastos primas seguros salud [GPS]");
      lb102titmayor.setDescription("Aragon 2014: contribuyente mayor 70");
      lb101nifext1.setDescription("Andalucia 2014:Alquiler Nro.Identificac.en pais residencia");
      lb102nifext1.setDescription("Aragon 2014:   Alquiler Nro.Identificac.en pais residencia");
      lb103nifext1.setDescription("Asturias 2014: Alquiler Nro.Identificac.en pais residencia");
      lb102nacpob.setDescription("Aragon 2014: Nacimento poblacion");
      }
    }
    
  public class TabLiquidag5bgral extends TableDef
    {
    // Campos
    public FieldDef lggejeraplic;
    public FieldDef lggdeclaran;
    public FieldDef lggmuf;
    public FieldDef lggtipocalculo;
    public FieldDef lggg1premmetali;
    public FieldDef lggpremespvalor;
    public FieldDef lggpremespingct;
    public FieldDef lggpremespingre;
    public FieldDef lggg1premespeci;
    public FieldDef lggpremespexent;
    public FieldDef lggg1subvencion;
    public FieldDef lggg1aprovfores;
    public FieldDef lggg1otrasganan;
    public FieldDef lggg1otrasperd;
    public FieldDef lggg2reinversio;
    public FieldDef lggbgganancia;
    public FieldDef lggbgperdidas;
    public FieldDef lggcoddeclara;
    public FieldDef lggsubvenvda;
    public FieldDef lggg1emancipa;
    public FieldDef lggg2fimgananci;
    public FieldDef lggg2fimperdida;
    public FieldDef lggg2acbgananci;
    public FieldDef lggg2acbperdida;
    public FieldDef lggg2otrperdida;
    public FieldDef lggg2otrganared;
    public FieldDef lggg2otrgredact;
    public FieldDef lggg2antgananci;
    public FieldDef lggg2antperdida;
    public FieldDef lgggpremperdjoc;
    public FieldDef lggg1ganpreneta;
    public FieldDef lggg1premmetalp;
    public FieldDef lggpremespvalop;
    public FieldDef lggpremespingcp;
    public FieldDef lggpremespingrp;
    public FieldDef lggg1premespecp;
    public TabLiquidag5bgral(String name)
      {
      super(name);
      lggejeraplic = new FieldDef("lggejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lggdeclaran = new FieldDef("lggdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lggmuf = new FieldDef("lggmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lggtipocalculo = new FieldDef("lggtipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lggg1premmetali = new FieldDef("lggg1premmetali",FieldDef.FLOAT,6,0);
      lggpremespvalor = new FieldDef("lggpremespvalor",FieldDef.FLOAT,6,0);
      lggpremespingct = new FieldDef("lggpremespingct",FieldDef.FLOAT,6,0);
      lggpremespingre = new FieldDef("lggpremespingre",FieldDef.FLOAT,6,0);
      lggg1premespeci = new FieldDef("lggg1premespeci",FieldDef.FLOAT,6,0);
      lggpremespexent = new FieldDef("lggpremespexent",FieldDef.FLOAT,6,0);
      lggg1subvencion = new FieldDef("lggg1subvencion",FieldDef.FLOAT,6,0);
      lggg1aprovfores = new FieldDef("lggg1aprovfores",FieldDef.FLOAT,6,0);
      lggg1otrasganan = new FieldDef("lggg1otrasganan",FieldDef.FLOAT,6,0);
      lggg1otrasperd = new FieldDef("lggg1otrasperd",FieldDef.FLOAT,6,0);
      lggg2reinversio = new FieldDef("lggg2reinversio",FieldDef.FLOAT,6,0);
      lggbgganancia = new FieldDef("lggbgganancia",FieldDef.FLOAT,6,0);
      lggbgperdidas = new FieldDef("lggbgperdidas",FieldDef.FLOAT,6,0);
      lggcoddeclara = new FieldDef("lggcoddeclara",FieldDef.INTEGER,0);
      lggsubvenvda = new FieldDef("lggsubvenvda",FieldDef.FLOAT,6,0);
      lggg1emancipa = new FieldDef("lggg1emancipa",FieldDef.FLOAT,6,0);
      lggg2fimgananci = new FieldDef("lggg2fimgananci",FieldDef.FLOAT,6,0);
      lggg2fimperdida = new FieldDef("lggg2fimperdida",FieldDef.FLOAT,6,0);
      lggg2acbgananci = new FieldDef("lggg2acbgananci",FieldDef.FLOAT,6,0);
      lggg2acbperdida = new FieldDef("lggg2acbperdida",FieldDef.FLOAT,6,0);
      lggg2otrperdida = new FieldDef("lggg2otrperdida",FieldDef.FLOAT,6,0);
      lggg2otrganared = new FieldDef("lggg2otrganared",FieldDef.FLOAT,6,0);
      lggg2otrgredact = new FieldDef("lggg2otrgredact",FieldDef.FLOAT,6,0);
      lggg2antgananci = new FieldDef("lggg2antgananci",FieldDef.FLOAT,6,0);
      lggg2antperdida = new FieldDef("lggg2antperdida",FieldDef.FLOAT,6,0);
      lgggpremperdjoc = new FieldDef("lgggpremperdjoc",FieldDef.FLOAT,6,0);
      lggg1ganpreneta = new FieldDef("lggg1ganpreneta",FieldDef.FLOAT,6,0);
      lggg1premmetalp = new FieldDef("lggg1premmetalp",FieldDef.FLOAT,6,0);
      lggpremespvalop = new FieldDef("lggpremespvalop",FieldDef.FLOAT,6,0);
      lggpremespingcp = new FieldDef("lggpremespingcp",FieldDef.FLOAT,6,0);
      lggpremespingrp = new FieldDef("lggpremespingrp",FieldDef.FLOAT,6,0);
      lggg1premespecp = new FieldDef("lggg1premespecp",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lggejeraplic,
        lggdeclaran,
        lggmuf,
        lggtipocalculo,
        lggg1premmetali,
        lggpremespvalor,
        lggpremespingct,
        lggpremespingre,
        lggg1premespeci,
        lggpremespexent,
        lggg1subvencion,
        lggg1aprovfores,
        lggg1otrasganan,
        lggg1otrasperd,
        lggg2reinversio,
        lggbgganancia,
        lggbgperdidas,
        lggcoddeclara,
        lggsubvenvda,
        lggg1emancipa,
        lggg2fimgananci,
        lggg2fimperdida,
        lggg2acbgananci,
        lggg2acbperdida,
        lggg2otrperdida,
        lggg2otrganared,
        lggg2otrgredact,
        lggg2antgananci,
        lggg2antperdida,
        lgggpremperdjoc,
        lggg1ganpreneta,
        lggg1premmetalp,
        lggpremespvalop,
        lggpremespingcp,
        lggpremespingrp,
        lggg1premespecp        
        };
      setColumns(array);
      FieldDef arrayf[] = {lggejeraplic,lggdeclaran,lggmuf,lggtipocalculo };
      setDescription("Resumen ganancias y perdidas BASE GRAL");
      setPrimaryKeys(arrayf);
      lggejeraplic.setDescription("Ejercicio aplicacion");
      lggdeclaran.setDescription("Codigo de declarante");
      lggmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lggtipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lggg1premmetali.setDescription("Premios en metalico");
      lggpremespvalor.setDescription("Premios en especie: valoracion");
      lggpremespingct.setDescription("Premios en especie:Ingresos a cuenta");
      lggpremespingre.setDescription("Premios en especie:Ingresos a cuenta repercutidos");
      lggg1premespeci.setDescription("Premios en especie: importe computable");
      lggpremespexent.setDescription("Premios exentos");
      lggg1subvencion.setDescription("Ganancias y perdidas: Subvenciones");
      lggg1aprovfores.setDescription("Ganancias y perdidas: Aprovechamientos forestales");
      lggg1otrasganan.setDescription("Ganancias y perdidas: Otras ganancias no derivadas transmision");
      lggg1otrasperd.setDescription("Ganancias y perdidas: Otras perdidas no derivadas transmision");
      lggg2reinversio.setDescription("Ganancias y perdidas: Ganancia diferimiento reinversion");
      lggbgganancia.setDescription("Base general: suma de ganancias");
      lggbgperdidas.setDescription("Base general: suma de perdidas");
      lggcoddeclara.setDescription("Codigo declaracion");
      lggsubvenvda.setDescription("Importe subvencion por vivienda habitual");
      lggg1emancipa.setDescription("Ganancias y perdidas: Renta basica emancipacion");
      lggg2fimgananci.setDescription("GP: Ganancia patrimonial neta FIM");
      lggg2fimperdida.setDescription("GP: Perdida  patrimonial neta FIM");
      lggg2acbgananci.setDescription("GP: Ganancia patrimonial neta ACB");
      lggg2acbperdida.setDescription("GP: Perdida  patrimonial neta ACB");
      lggg2otrperdida.setDescription("GP: Perdida  patrimonial neta Otros valores");
      lggg2otrganared.setDescription("GP: Ganancia patrimonial reducida Otros valores");
      lggg2otrgredact.setDescription("GP: Ganancia patrimonial actividades reducida Otros valores");
      lggg2antgananci.setDescription("GP: Ganancia B.Gral imputable ejercicios anteriores");
      lggg2antperdida.setDescription("GP: Perdida  B.Gral imputable ejercicios anteriores");
      lgggpremperdjoc.setDescription("Sin fines publicitarios Perdidas derivadas del juego");
      lggg1ganpreneta.setDescription("Sin fines publicitarios Ganancia Neta Premios");
      lggg1premmetalp.setDescription("Con fines publicitarios Premios en metalico");
      lggpremespvalop.setDescription("Con fines publicitarios Premios en especie: valoracion");
      lggpremespingcp.setDescription("Con fines publicitarios Premios en especie:Ingresos a cuenta");
      lggpremespingrp.setDescription("Con fines publicitarios Premios en especie:Ingresos a cuenta repercutidos");
      lggg1premespecp.setDescription("Con fines publicitarios Premios en especie: importe computable");
      }
    }
    
  public class TabLiquidag5bahor extends TableDef
    {
    // Campos
    public FieldDef lgaejeraplic;
    public FieldDef lgadeclaran;
    public FieldDef lgamuf;
    public FieldDef lgatipocalculo;
    public FieldDef lgag2fimgananci;
    public FieldDef lgag2fimperdida;
    public FieldDef lgag2acbgananci;
    public FieldDef lgag2acbperdida;
    public FieldDef lgag2otrperdida;
    public FieldDef lgag2otrganared;
    public FieldDef lgag2otrgredact;
    public FieldDef lgag2antgananci;
    public FieldDef lgag2antperdida;
    public FieldDef lgabaganancia;
    public FieldDef lgabaperdidas;
    public FieldDef lgacoddeclara;
    public FieldDef lgasinretencion;
    public FieldDef lgaimportemas1a;
    public FieldDef lganoresiacb;
    public FieldDef lganoresifim;
    public FieldDef lganoresivda;
    public FieldDef lgag2prefergan;
    public FieldDef lgag2preferper;
    public FieldDef lgag2prefantgan;
    public FieldDef lgag2prefantper;
    public TabLiquidag5bahor(String name)
      {
      super(name);
      lgaejeraplic = new FieldDef("lgaejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lgadeclaran = new FieldDef("lgadeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lgamuf = new FieldDef("lgamuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lgatipocalculo = new FieldDef("lgatipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lgag2fimgananci = new FieldDef("lgag2fimgananci",FieldDef.FLOAT,6,0);
      lgag2fimperdida = new FieldDef("lgag2fimperdida",FieldDef.FLOAT,6,0);
      lgag2acbgananci = new FieldDef("lgag2acbgananci",FieldDef.FLOAT,6,0);
      lgag2acbperdida = new FieldDef("lgag2acbperdida",FieldDef.FLOAT,6,0);
      lgag2otrperdida = new FieldDef("lgag2otrperdida",FieldDef.FLOAT,6,0);
      lgag2otrganared = new FieldDef("lgag2otrganared",FieldDef.FLOAT,6,0);
      lgag2otrgredact = new FieldDef("lgag2otrgredact",FieldDef.FLOAT,6,0);
      lgag2antgananci = new FieldDef("lgag2antgananci",FieldDef.FLOAT,6,0);
      lgag2antperdida = new FieldDef("lgag2antperdida",FieldDef.FLOAT,6,0);
      lgabaganancia = new FieldDef("lgabaganancia",FieldDef.FLOAT,6,0);
      lgabaperdidas = new FieldDef("lgabaperdidas",FieldDef.FLOAT,6,0);
      lgacoddeclara = new FieldDef("lgacoddeclara",FieldDef.INTEGER,0);
      lgasinretencion = new FieldDef("lgasinretencion",FieldDef.FLOAT,6,0);
      lgaimportemas1a = new FieldDef("lgaimportemas1a",FieldDef.FLOAT,6,0);
      lganoresiacb = new FieldDef("lganoresiacb",FieldDef.FLOAT,6,0);
      lganoresifim = new FieldDef("lganoresifim",FieldDef.FLOAT,6,0);
      lganoresivda = new FieldDef("lganoresivda",FieldDef.FLOAT,6,0);
      lgag2prefergan = new FieldDef("lgag2prefergan",FieldDef.FLOAT,6,0);
      lgag2preferper = new FieldDef("lgag2preferper",FieldDef.FLOAT,6,0);
      lgag2prefantgan = new FieldDef("lgag2prefantgan",FieldDef.FLOAT,6,0);
      lgag2prefantper = new FieldDef("lgag2prefantper",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lgaejeraplic,
        lgadeclaran,
        lgamuf,
        lgatipocalculo,
        lgag2fimgananci,
        lgag2fimperdida,
        lgag2acbgananci,
        lgag2acbperdida,
        lgag2otrperdida,
        lgag2otrganared,
        lgag2otrgredact,
        lgag2antgananci,
        lgag2antperdida,
        lgabaganancia,
        lgabaperdidas,
        lgacoddeclara,
        lgasinretencion,
        lgaimportemas1a,
        lganoresiacb,
        lganoresifim,
        lganoresivda,
        lgag2prefergan,
        lgag2preferper,
        lgag2prefantgan,
        lgag2prefantper        
        };
      setColumns(array);
      FieldDef arrayf[] = {lgaejeraplic,lgadeclaran,lgamuf,lgatipocalculo };
      setDescription("Resumen ganancias y perdidas");
      setPrimaryKeys(arrayf);
      lgaejeraplic.setDescription("Ejercicio aplicacion");
      lgadeclaran.setDescription("Codigo de declarante");
      lgamuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lgatipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lgag2fimgananci.setDescription("Ganancias y perdidas: Ganancia patrimonial neta FIM");
      lgag2fimperdida.setDescription("Ganancias y perdidas: Perdida patrimonial neta FIM");
      lgag2acbgananci.setDescription("Ganancias y perdidas: Ganancia patrimonial neta ACB");
      lgag2acbperdida.setDescription("Ganancias y perdidas: Perdida patrimonial neta ACB");
      lgag2otrperdida.setDescription("Ganancias y perdidas: Perdida patrimonial neta Otros valores");
      lgag2otrganared.setDescription("Ganancias y perdidas: Ganancia patrimonial reducida Otros valores");
      lgag2otrgredact.setDescription("Ganancias y perdidas: Ganancia patrimonial actividades reducida Otros valores");
      lgag2antgananci.setDescription("Ganancias y perdidas: Ganancia imputable ejercicios anteriores");
      lgag2antperdida.setDescription("Ganancias y perdidas: Perdida imputable ejercicios anteriores");
      lgabaganancia.setDescription("Base ahorro: suma de ganancias");
      lgabaperdidas.setDescription("Base ahorro: suma de perdidas");
      lgacoddeclara.setDescription("Codigo declaracion");
      lgasinretencion.setDescription("Ganancias sin retenciones");
      lgaimportemas1a.setDescription("ganacias y perdidas mas de 1 ejercicio");
      lganoresiacb.setDescription("ganancias no residentes por ACB");
      lganoresifim.setDescription("ganancias no residentes por FIM");
      lganoresivda.setDescription("ganancias no residentes por Vivienda");
      lgag2prefergan.setDescription("Ganan neta Preferentes BA ej.actual");
      lgag2preferper.setDescription("Perd  neta Preferentes BA ej.actual");
      lgag2prefantgan.setDescription("Ganan neta Preferentes BA ej.anter.imputa en ej.actual");
      lgag2prefantper.setDescription("Perd  neta Preferentes BA ej.anter.imputa en ej.actual");
      }
    }
    
  public class TabLiquidaapartg2 extends TableDef
    {
    // Campos
    public FieldDef lg2ejeraplic;
    public FieldDef lg2declaran;
    public FieldDef lg2muf;
    public FieldDef lg2tipocalculo;
    public FieldDef lg2nganancia;
    public FieldDef lg2fimtitular;
    public FieldDef lg2fimnif;
    public FieldDef lg2fimganancia;
    public FieldDef lg2fimperdida;
    public FieldDef lg2acbtitular;
    public FieldDef lg2acbentidad;
    public FieldDef lg2acbtransmis;
    public FieldDef lg2acbadquisic;
    public FieldDef lg2acbganancia;
    public FieldDef lg2acbganancomp;
    public FieldDef lg2acbperdida;
    public FieldDef lg2acbperdcompu;
    public FieldDef lg2otrtitular;
    public FieldDef lg2otrentidad;
    public FieldDef lg2otrclaveelem;
    public FieldDef lg2otrsituacion;
    public FieldDef lg2otreferencia;
    public FieldDef lg2otrfectransm;
    public FieldDef lg2otrfecadquis;
    public FieldDef lg2otrtransmis;
    public FieldDef lg2otradquisic;
    public FieldDef lg2otrperdobte;
    public FieldDef lg2otrperdimpu;
    public FieldDef lg2otrganaobte;
    public FieldDef lg2otrganaredu;
    public FieldDef lg2otranosperm;
    public FieldDef lg2otrimpreduc;
    public FieldDef lg2otrgananred;
    public FieldDef lg2otrganexvda;
    public FieldDef lg2otrganreduc;
    public FieldDef lg2otrganredim;
    public FieldDef lg2otrreduacti;
    public FieldDef lg2otrgredactiv;
    public FieldDef lg2otrgredimpac;
    public FieldDef lg2anttitular;
    public FieldDef lg2antganancia;
    public FieldDef lg2antperdida;
    public FieldDef lg2reititular;
    public FieldDef lg2reinversion;
    public FieldDef lg2clavereinver;
    public FieldDef lg2exvtitular;
    public FieldDef lg2exvdaimpobte;
    public FieldDef lg2exvdagananc;
    public FieldDef lg2exvdareinver;
    public FieldDef lg2exvdapdterei;
    public FieldDef lg2exvdaexento;
    public FieldDef lg2fustitular;
    public FieldDef lg2fusionnoper;
    public FieldDef lg2coddeclara;
    public FieldDef lg2cobropago;
    public FieldDef lg2otrexenurba;
    public FieldDef lg2otrexenurba2;
    public FieldDef lg2otrgredacti2;
    public FieldDef lg2baseintegrac;
    public FieldDef lg2otrganexacc;
    public FieldDef lg2preftitular;
    public FieldDef lg2prefentidad;
    public FieldDef lg2preftransm;
    public FieldDef lg2prefadq;
    public FieldDef lg2prefganancia;
    public FieldDef lg2prefgancomp;
    public FieldDef lg2prefperdida;
    public FieldDef lg2prefperdcomp;
    public FieldDef lg2antganprefer;
    public FieldDef lg2antperprefer;
    public TabLiquidaapartg2(String name)
      {
      super(name);
      lg2ejeraplic = new FieldDef("lg2ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lg2declaran = new FieldDef("lg2declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lg2muf = new FieldDef("lg2muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lg2tipocalculo = new FieldDef("lg2tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lg2nganancia = new FieldDef("lg2nganancia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lg2fimtitular = new FieldDef("lg2fimtitular",FieldDef.CHAR,1);
      lg2fimnif = new FieldDef("lg2fimnif",FieldDef.CHAR,15);
      lg2fimganancia = new FieldDef("lg2fimganancia",FieldDef.FLOAT,6,0);
      lg2fimperdida = new FieldDef("lg2fimperdida",FieldDef.FLOAT,6,0);
      lg2acbtitular = new FieldDef("lg2acbtitular",FieldDef.CHAR,1);
      lg2acbentidad = new FieldDef("lg2acbentidad",FieldDef.CHAR,60);
      lg2acbtransmis = new FieldDef("lg2acbtransmis",FieldDef.FLOAT,6,0);
      lg2acbadquisic = new FieldDef("lg2acbadquisic",FieldDef.FLOAT,6,0);
      lg2acbganancia = new FieldDef("lg2acbganancia",FieldDef.FLOAT,6,0);
      lg2acbganancomp = new FieldDef("lg2acbganancomp",FieldDef.FLOAT,6,0);
      lg2acbperdida = new FieldDef("lg2acbperdida",FieldDef.FLOAT,6,0);
      lg2acbperdcompu = new FieldDef("lg2acbperdcompu",FieldDef.FLOAT,6,0);
      lg2otrtitular = new FieldDef("lg2otrtitular",FieldDef.CHAR,1);
      lg2otrentidad = new FieldDef("lg2otrentidad",FieldDef.CHAR,60);
      lg2otrclaveelem = new FieldDef("lg2otrclaveelem",FieldDef.CHAR,1);
      lg2otrsituacion = new FieldDef("lg2otrsituacion",FieldDef.CHAR,1);
      lg2otreferencia = new FieldDef("lg2otreferencia",FieldDef.CHAR,20);
      lg2otrfectransm = new FieldDef("lg2otrfectransm",FieldDef.DATE);
      lg2otrfecadquis = new FieldDef("lg2otrfecadquis",FieldDef.DATE);
      lg2otrtransmis = new FieldDef("lg2otrtransmis",FieldDef.FLOAT,6,0);
      lg2otradquisic = new FieldDef("lg2otradquisic",FieldDef.FLOAT,6,0);
      lg2otrperdobte = new FieldDef("lg2otrperdobte",FieldDef.FLOAT,6,0);
      lg2otrperdimpu = new FieldDef("lg2otrperdimpu",FieldDef.FLOAT,6,0);
      lg2otrganaobte = new FieldDef("lg2otrganaobte",FieldDef.FLOAT,6,0);
      lg2otrganaredu = new FieldDef("lg2otrganaredu",FieldDef.FLOAT,6,0);
      lg2otranosperm = new FieldDef("lg2otranosperm",FieldDef.FLOAT,6,0);
      lg2otrimpreduc = new FieldDef("lg2otrimpreduc",FieldDef.FLOAT,6,0);
      lg2otrgananred = new FieldDef("lg2otrgananred",FieldDef.FLOAT,6,0);
      lg2otrganexvda = new FieldDef("lg2otrganexvda",FieldDef.FLOAT,6,0);
      lg2otrganreduc = new FieldDef("lg2otrganreduc",FieldDef.FLOAT,6,0);
      lg2otrganredim = new FieldDef("lg2otrganredim",FieldDef.FLOAT,6,0);
      lg2otrreduacti = new FieldDef("lg2otrreduacti",FieldDef.FLOAT,6,0);
      lg2otrgredactiv = new FieldDef("lg2otrgredactiv",FieldDef.FLOAT,6,0);
      lg2otrgredimpac = new FieldDef("lg2otrgredimpac",FieldDef.FLOAT,6,0);
      lg2anttitular = new FieldDef("lg2anttitular",FieldDef.CHAR,1);
      lg2antganancia = new FieldDef("lg2antganancia",FieldDef.FLOAT,6,0);
      lg2antperdida = new FieldDef("lg2antperdida",FieldDef.FLOAT,6,0);
      lg2reititular = new FieldDef("lg2reititular",FieldDef.CHAR,1);
      lg2reinversion = new FieldDef("lg2reinversion",FieldDef.FLOAT,6,0);
      lg2clavereinver = new FieldDef("lg2clavereinver",FieldDef.FLOAT,6,0);
      lg2exvtitular = new FieldDef("lg2exvtitular",FieldDef.CHAR,1);
      lg2exvdaimpobte = new FieldDef("lg2exvdaimpobte",FieldDef.FLOAT,6,0);
      lg2exvdagananc = new FieldDef("lg2exvdagananc",FieldDef.FLOAT,6,0);
      lg2exvdareinver = new FieldDef("lg2exvdareinver",FieldDef.FLOAT,6,0);
      lg2exvdapdterei = new FieldDef("lg2exvdapdterei",FieldDef.FLOAT,6,0);
      lg2exvdaexento = new FieldDef("lg2exvdaexento",FieldDef.FLOAT,6,0);
      lg2fustitular = new FieldDef("lg2fustitular",FieldDef.CHAR,1);
      lg2fusionnoper = new FieldDef("lg2fusionnoper",FieldDef.INTEGER,0);
      lg2coddeclara = new FieldDef("lg2coddeclara",FieldDef.INTEGER,0);
      lg2cobropago = new FieldDef("lg2cobropago",FieldDef.CHAR,1);
      lg2otrexenurba = new FieldDef("lg2otrexenurba",FieldDef.FLOAT,6,0);
      lg2otrexenurba2 = new FieldDef("lg2otrexenurba2",FieldDef.FLOAT,6,0);
      lg2otrgredacti2 = new FieldDef("lg2otrgredacti2",FieldDef.FLOAT,6,0);
      lg2baseintegrac = new FieldDef("lg2baseintegrac",FieldDef.CHAR,1);
      lg2otrganexacc = new FieldDef("lg2otrganexacc",FieldDef.FLOAT,6,0);
      lg2preftitular = new FieldDef("lg2preftitular",FieldDef.CHAR,1);
      lg2prefentidad = new FieldDef("lg2prefentidad",FieldDef.CHAR,60);
      lg2preftransm = new FieldDef("lg2preftransm",FieldDef.FLOAT,6,0);
      lg2prefadq = new FieldDef("lg2prefadq",FieldDef.FLOAT,6,0);
      lg2prefganancia = new FieldDef("lg2prefganancia",FieldDef.FLOAT,6,0);
      lg2prefgancomp = new FieldDef("lg2prefgancomp",FieldDef.FLOAT,6,0);
      lg2prefperdida = new FieldDef("lg2prefperdida",FieldDef.FLOAT,6,0);
      lg2prefperdcomp = new FieldDef("lg2prefperdcomp",FieldDef.FLOAT,6,0);
      lg2antganprefer = new FieldDef("lg2antganprefer",FieldDef.FLOAT,6,0);
      lg2antperprefer = new FieldDef("lg2antperprefer",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lg2ejeraplic,
        lg2declaran,
        lg2muf,
        lg2tipocalculo,
        lg2nganancia,
        lg2fimtitular,
        lg2fimnif,
        lg2fimganancia,
        lg2fimperdida,
        lg2acbtitular,
        lg2acbentidad,
        lg2acbtransmis,
        lg2acbadquisic,
        lg2acbganancia,
        lg2acbganancomp,
        lg2acbperdida,
        lg2acbperdcompu,
        lg2otrtitular,
        lg2otrentidad,
        lg2otrclaveelem,
        lg2otrsituacion,
        lg2otreferencia,
        lg2otrfectransm,
        lg2otrfecadquis,
        lg2otrtransmis,
        lg2otradquisic,
        lg2otrperdobte,
        lg2otrperdimpu,
        lg2otrganaobte,
        lg2otrganaredu,
        lg2otranosperm,
        lg2otrimpreduc,
        lg2otrgananred,
        lg2otrganexvda,
        lg2otrganreduc,
        lg2otrganredim,
        lg2otrreduacti,
        lg2otrgredactiv,
        lg2otrgredimpac,
        lg2anttitular,
        lg2antganancia,
        lg2antperdida,
        lg2reititular,
        lg2reinversion,
        lg2clavereinver,
        lg2exvtitular,
        lg2exvdaimpobte,
        lg2exvdagananc,
        lg2exvdareinver,
        lg2exvdapdterei,
        lg2exvdaexento,
        lg2fustitular,
        lg2fusionnoper,
        lg2coddeclara,
        lg2cobropago,
        lg2otrexenurba,
        lg2otrexenurba2,
        lg2otrgredacti2,
        lg2baseintegrac,
        lg2otrganexacc,
        lg2preftitular,
        lg2prefentidad,
        lg2preftransm,
        lg2prefadq,
        lg2prefganancia,
        lg2prefgancomp,
        lg2prefperdida,
        lg2prefperdcomp,
        lg2antganprefer,
        lg2antperprefer        
        };
      setColumns(array);
      FieldDef arrayf[] = {lg2ejeraplic,lg2declaran,lg2muf,lg2tipocalculo,lg2nganancia };
      setDescription("Liquidacion renta apartado G2: Ganancias derivadas transmision");
      setPrimaryKeys(arrayf);
      lg2ejeraplic.setDescription("Ejercicio aplicacion");
      lg2declaran.setDescription("Codigo de declarante");
      lg2muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lg2tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lg2nganancia.setDescription("Número de ganancia");
      lg2fimtitular.setDescription("Titular");
      lg2fimnif.setDescription("FIM: NIF de la sociedad o fondo de inversion");
      lg2fimganancia.setDescription("FIM: Ganancia patrimonial neta");
      lg2fimperdida.setDescription("FIM: Perdida patrimonial neta");
      lg2acbtitular.setDescription("Titular");
      lg2acbentidad.setDescription("ACB: Entidad emisora");
      lg2acbtransmis.setDescription("ACB: Valor de la transmision");
      lg2acbadquisic.setDescription("ACB: Valor de la adquisicion");
      lg2acbganancia.setDescription("ACB: Ganancia, importe obtenido");
      lg2acbganancomp.setDescription("ACB: Ganancia, importe computable");
      lg2acbperdida.setDescription("ACB: Perdida, importe obtenido");
      lg2acbperdcompu.setDescription("ACB: Perdida, importe computable");
      lg2otrtitular.setDescription("Titular");
      lg2otrentidad.setDescription("Otros elementos: Entidad emisora");
      lg2otrclaveelem.setDescription("Otros elementos: Clave elemento patrimonial");
      lg2otrsituacion.setDescription("Otros elementos: Situacion elemento patrimonial");
      lg2otreferencia.setDescription("Otros elementos: Referencia catastral");
      lg2otrfectransm.setDescription("Otros elementos: Fecha de transmision");
      lg2otrfecadquis.setDescription("Otros elementos: Fecha de adquisicion");
      lg2otrtransmis.setDescription("Otros elementos: Valor de la transmision");
      lg2otradquisic.setDescription("Otros elementos: Valor de la adquisicion");
      lg2otrperdobte.setDescription("Otros elementos: Perdida patrimonial obtenida");
      lg2otrperdimpu.setDescription("Otros elementos: Perdida patrimonial imputable");
      lg2otrganaobte.setDescription("Otros elementos: Ganancia patrimonial obtenida");
      lg2otrganaredu.setDescription("Otros elementos: Parte ganancia patrimonial susceptible reduccion");
      lg2otranosperm.setDescription("Otros elementos: Años permanencia hasta 31-12-1994");
      lg2otrimpreduc.setDescription("Otros elementos: Importe reduccion");
      lg2otrgananred.setDescription("Otros elementos: Ganancia reducida");
      lg2otrganexvda.setDescription("Otros elementos: Ganancia exenta por reinversion");
      lg2otrganreduc.setDescription("Otros elementos: Ganancia reducida y no exenta");
      lg2otrganredim.setDescription("Otros elementos: Ganancia reducida y no exenta imputable ejercicio");
      lg2otrreduacti.setDescription("Otros elementos: Importe reduccion actividades");
      lg2otrgredactiv.setDescription("Otros elementos: Ganancia reducida actividades");
      lg2otrgredimpac.setDescription("Otros elementos: Ganancia reducida actividades imputable ejercicio");
      lg2anttitular.setDescription("Titular");
      lg2antganancia.setDescription("Ejercicios anteriores: Ganancia imputable");
      lg2antperdida.setDescription("Ejercicios anteriores: Perdida imputable");
      lg2reititular.setDescription("Titular");
      lg2reinversion.setDescription("Diferimiento por reinversion: ganancia imputable");
      lg2clavereinver.setDescription("Diferimiento por reinversion: clave metodo integracion");
      lg2exvtitular.setDescription("Titular");
      lg2exvdaimpobte.setDescription("Exencion vda. habitual: importe obtenido");
      lg2exvdagananc.setDescription("Exencion vda. habitual: ganancia obtenida");
      lg2exvdareinver.setDescription("Exencion vda. habitual: importe reinvertido");
      lg2exvdapdterei.setDescription("Exencion vda. habitual: pendiente de reinvertir");
      lg2exvdaexento.setDescription("Exencion vda. habitual: importe exento por reinversion");
      lg2fustitular.setDescription("Titular");
      lg2fusionnoper.setDescription("Regimen especial fusiones: numero de operaciones");
      lg2coddeclara.setDescription("Codigo declaracion");
      lg2cobropago.setDescription("Imputacion cobro-pago");
      lg2otrexenurba.setDescription("Otros elementos: Exencion inmuebles urbanos (VIN no afecto)");
      lg2otrexenurba2.setDescription("Otros elementos: Exencion inmuebles urbanos (AIN afecto)");
      lg2otrgredacti2.setDescription("Otros elementos: Ganancia reducida no exenta actividades");
      lg2baseintegrac.setDescription("Base de integracion G-Gral <=1 any / A-Ahorro >1any");
      lg2otrganexacc.setDescription("Otros elementos: Ganancia exenta por reinver.acc empres.nueva creacio");
      lg2preftitular.setDescription("Preferentes: Titular");
      lg2prefentidad.setDescription("Preferentes: Denominacion de los valores (entidad emisora)");
      lg2preftransm.setDescription("Preferentes: Valor transmision global");
      lg2prefadq.setDescription("Preferentes: Valor adquisicion global");
      lg2prefganancia.setDescription("Preferentes: Ganancia, importe obtenido");
      lg2prefgancomp.setDescription("Preferentes: Ganancia, importe computable");
      lg2prefperdida.setDescription("Preferentes: Perdida, importe obtenido");
      lg2prefperdcomp.setDescription("Preferentes: Perdida, importe computable");
      lg2antganprefer.setDescription("Ejercicios anteriores: Ganancia preferente");
      lg2antperprefer.setDescription("Ejercicios anteriores: Perdida preferente");
      }
    }
    
  public class TabLiquidaapartb1 extends TableDef
    {
    // Campos
    public FieldDef lb1ejeraplic;
    public FieldDef lb1declaran;
    public FieldDef lb1muf;
    public FieldDef lb1tipocalculo;
    public FieldDef lb1interesctas;
    public FieldDef lb1intereactivo;
    public FieldDef lb1dividendos;
    public FieldDef lb1letrastesoro;
    public FieldDef lb1otrosactivos;
    public FieldDef lb1seguros;
    public FieldDef lb1otrosrdtos;
    public FieldDef lb1totalingreso;
    public FieldDef lb1gastosdeduc;
    public FieldDef lb1rdtoneto;
    public FieldDef lb1reducseguros;
    public FieldDef lb1rdtonetoredu;
    public FieldDef lb1exentodivide;
    public FieldDef lb1preferpos;
    public FieldDef lb1preferneg;
    public TabLiquidaapartb1(String name)
      {
      super(name);
      lb1ejeraplic = new FieldDef("lb1ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lb1declaran = new FieldDef("lb1declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lb1muf = new FieldDef("lb1muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb1tipocalculo = new FieldDef("lb1tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lb1interesctas = new FieldDef("lb1interesctas",FieldDef.FLOAT,6,0);
      lb1intereactivo = new FieldDef("lb1intereactivo",FieldDef.FLOAT,6,0);
      lb1dividendos = new FieldDef("lb1dividendos",FieldDef.FLOAT,6,0);
      lb1letrastesoro = new FieldDef("lb1letrastesoro",FieldDef.FLOAT,6,0);
      lb1otrosactivos = new FieldDef("lb1otrosactivos",FieldDef.FLOAT,6,0);
      lb1seguros = new FieldDef("lb1seguros",FieldDef.FLOAT,6,0);
      lb1otrosrdtos = new FieldDef("lb1otrosrdtos",FieldDef.FLOAT,6,0);
      lb1totalingreso = new FieldDef("lb1totalingreso",FieldDef.FLOAT,6,0);
      lb1gastosdeduc = new FieldDef("lb1gastosdeduc",FieldDef.FLOAT,6,0);
      lb1rdtoneto = new FieldDef("lb1rdtoneto",FieldDef.FLOAT,6,0);
      lb1reducseguros = new FieldDef("lb1reducseguros",FieldDef.FLOAT,6,0);
      lb1rdtonetoredu = new FieldDef("lb1rdtonetoredu",FieldDef.FLOAT,6,0);
      lb1exentodivide = new FieldDef("lb1exentodivide",FieldDef.FLOAT,6,0);
      lb1preferpos = new FieldDef("lb1preferpos",FieldDef.FLOAT,6,0);
      lb1preferneg = new FieldDef("lb1preferneg",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lb1ejeraplic,
        lb1declaran,
        lb1muf,
        lb1tipocalculo,
        lb1interesctas,
        lb1intereactivo,
        lb1dividendos,
        lb1letrastesoro,
        lb1otrosactivos,
        lb1seguros,
        lb1otrosrdtos,
        lb1totalingreso,
        lb1gastosdeduc,
        lb1rdtoneto,
        lb1reducseguros,
        lb1rdtonetoredu,
        lb1exentodivide,
        lb1preferpos,
        lb1preferneg        
        };
      setColumns(array);
      FieldDef arrayf[] = {lb1ejeraplic,lb1declaran,lb1muf,lb1tipocalculo };
      setDescription("Liquidacion renta apartado B1: capital mobiliario base ahorro");
      setPrimaryKeys(arrayf);
      lb1ejeraplic.setDescription("Ejercicio aplicacion");
      lb1declaran.setDescription("Codigo de declarante");
      lb1muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lb1tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lb1interesctas.setDescription("Intereses cuentas corrientes");
      lb1intereactivo.setDescription("Intereses activos financieros con derecho bonificacion");
      lb1dividendos.setDescription("Dividendos");
      lb1letrastesoro.setDescription("Letras del Tesoro");
      lb1otrosactivos.setDescription("Rendimientos procedentes de otros activos financieros");
      lb1seguros.setDescription("Contratos de seguros");
      lb1otrosrdtos.setDescription("Otros rendimientos de capital mobiliario");
      lb1totalingreso.setDescription("Total ingresos integros");
      lb1gastosdeduc.setDescription("Gastos deducibles");
      lb1rdtoneto.setDescription("Rendimiento neto");
      lb1reducseguros.setDescription("Reduccion contratos de seguros");
      lb1rdtonetoredu.setDescription("Rendimiento neto reducido capital mobiliario b.ahorro");
      lb1exentodivide.setDescription("Importe exento por dividendos");
      lb1preferpos.setDescription("Importe postivo  participaciones preferentes o deuda subordinada");
      lb1preferneg.setDescription("Importe negativo participaciones preferentes o deuda subordinada");
      }
    }
    
  public class TabLiquidaaparti extends TableDef
    {
    // Campos
    public FieldDef liiejeraplic;
    public FieldDef liideclaran;
    public FieldDef liimuf;
    public FieldDef liitipocalculo;
    public FieldDef liinreduccion;
    public FieldDef liiredconjunta;
    public FieldDef liifpetitular;
    public FieldDef liifpeejanter;
    public FieldDef liifpeejercicio;
    public FieldDef liifpederecredu;
    public FieldDef liifpetotal;
    public FieldDef liifpctotal;
    public FieldDef liifpmtitular;
    public FieldDef liifpmnif;
    public FieldDef liifpmejanter;
    public FieldDef liifpmejerpropi;
    public FieldDef liifpmejerotros;
    public FieldDef liifpmtotal;
    public FieldDef liiapdtitular;
    public FieldDef liiapdnif;
    public FieldDef liiapdejanter;
    public FieldDef liiapdejerpropi;
    public FieldDef liiapdtotal;
    public FieldDef liipcctitular;
    public FieldDef liipccnif;
    public FieldDef liipccimporte;
    public FieldDef liipcctotal;
    public FieldDef liifpdtitular;
    public FieldDef liifpdejanter;
    public FieldDef liifpdejercicio;
    public FieldDef liifpdtotal;
    public FieldDef liifpeejant2007;
    public FieldDef liifpcaplicmanu;
    public FieldDef liipartpolitic;
    public FieldDef liifpsejercicio;
    public FieldDef liipccnifext;
    public FieldDef liifpsejanter;
    public TabLiquidaaparti(String name)
      {
      super(name);
      liiejeraplic = new FieldDef("liiejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      liideclaran = new FieldDef("liideclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      liimuf = new FieldDef("liimuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      liitipocalculo = new FieldDef("liitipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      liinreduccion = new FieldDef("liinreduccion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      liiredconjunta = new FieldDef("liiredconjunta",FieldDef.FLOAT,6,0);
      liifpetitular = new FieldDef("liifpetitular",FieldDef.CHAR,1);
      liifpeejanter = new FieldDef("liifpeejanter",FieldDef.FLOAT,6,0);
      liifpeejercicio = new FieldDef("liifpeejercicio",FieldDef.FLOAT,6,0);
      liifpederecredu = new FieldDef("liifpederecredu",FieldDef.FLOAT,6,0);
      liifpetotal = new FieldDef("liifpetotal",FieldDef.FLOAT,6,0);
      liifpctotal = new FieldDef("liifpctotal",FieldDef.FLOAT,6,0);
      liifpmtitular = new FieldDef("liifpmtitular",FieldDef.CHAR,1);
      liifpmnif = new FieldDef("liifpmnif",FieldDef.CHAR,15);
      liifpmejanter = new FieldDef("liifpmejanter",FieldDef.FLOAT,6,0);
      liifpmejerpropi = new FieldDef("liifpmejerpropi",FieldDef.FLOAT,6,0);
      liifpmejerotros = new FieldDef("liifpmejerotros",FieldDef.FLOAT,6,0);
      liifpmtotal = new FieldDef("liifpmtotal",FieldDef.FLOAT,6,0);
      liiapdtitular = new FieldDef("liiapdtitular",FieldDef.CHAR,1);
      liiapdnif = new FieldDef("liiapdnif",FieldDef.CHAR,15);
      liiapdejanter = new FieldDef("liiapdejanter",FieldDef.FLOAT,6,0);
      liiapdejerpropi = new FieldDef("liiapdejerpropi",FieldDef.FLOAT,6,0);
      liiapdtotal = new FieldDef("liiapdtotal",FieldDef.FLOAT,6,0);
      liipcctitular = new FieldDef("liipcctitular",FieldDef.CHAR,1);
      liipccnif = new FieldDef("liipccnif",FieldDef.CHAR,15);
      liipccimporte = new FieldDef("liipccimporte",FieldDef.FLOAT,6,0);
      liipcctotal = new FieldDef("liipcctotal",FieldDef.FLOAT,6,0);
      liifpdtitular = new FieldDef("liifpdtitular",FieldDef.CHAR,1);
      liifpdejanter = new FieldDef("liifpdejanter",FieldDef.FLOAT,6,0);
      liifpdejercicio = new FieldDef("liifpdejercicio",FieldDef.FLOAT,6,0);
      liifpdtotal = new FieldDef("liifpdtotal",FieldDef.FLOAT,6,0);
      liifpeejant2007 = new FieldDef("liifpeejant2007",FieldDef.FLOAT,6,0);
      liifpcaplicmanu = new FieldDef("liifpcaplicmanu",FieldDef.CHAR,1);
      liipartpolitic = new FieldDef("liipartpolitic",FieldDef.FLOAT,6,0);
      liifpsejercicio = new FieldDef("liifpsejercicio",FieldDef.FLOAT,6,0);
      liipccnifext = new FieldDef("liipccnifext",FieldDef.CHAR,25);
      liifpsejanter = new FieldDef("liifpsejanter",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        liiejeraplic,
        liideclaran,
        liimuf,
        liitipocalculo,
        liinreduccion,
        liiredconjunta,
        liifpetitular,
        liifpeejanter,
        liifpeejercicio,
        liifpederecredu,
        liifpetotal,
        liifpctotal,
        liifpmtitular,
        liifpmnif,
        liifpmejanter,
        liifpmejerpropi,
        liifpmejerotros,
        liifpmtotal,
        liiapdtitular,
        liiapdnif,
        liiapdejanter,
        liiapdejerpropi,
        liiapdtotal,
        liipcctitular,
        liipccnif,
        liipccimporte,
        liipcctotal,
        liifpdtitular,
        liifpdejanter,
        liifpdejercicio,
        liifpdtotal,
        liifpeejant2007,
        liifpcaplicmanu,
        liipartpolitic,
        liifpsejercicio,
        liipccnifext,
        liifpsejanter        
        };
      setColumns(array);
      FieldDef arrayf[] = {liiejeraplic,liideclaran,liimuf,liitipocalculo,liinreduccion };
      setDescription("Liquidacion renta apartado I: Reducciones base imponible");
      setPrimaryKeys(arrayf);
      liiejeraplic.setDescription("Ejercicio aplicacion");
      liideclaran.setDescription("Codigo de declarante");
      liimuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      liitipocalculo.setDescription("Tipo de  calculo [S]imulacion");
      liinreduccion.setDescription("Numero de registro");
      liiredconjunta.setDescription("Reduccion tributacion conjunta");
      liifpetitular.setDescription("Titular");
      liifpeejanter.setDescription("Excesos pendientes de reducir de ejercicios anteriores");
      liifpeejercicio.setDescription("Aportaciones del ejercicio  (AIP+FPE)");
      liifpederecredu.setDescription("Importes con derecho a reduccion");
      liifpetotal.setDescription("Total con derecho a reduccion");
      liifpctotal.setDescription("Total con derecho a reduccion a favor del conyuge");
      liifpmtitular.setDescription("Titular");
      liifpmnif.setDescription("NIF del participe");
      liifpmejanter.setDescription("Excesos pendientes de reducir de ejer.anteriores a favor minusvalidos");
      liifpmejerpropi.setDescription("Aportaciones del ejercicio del propio minusvalidos");
      liifpmejerotros.setDescription("Aportaciones del ejercicio de terceros a favor minusvalidos");
      liifpmtotal.setDescription("Total con derecho a reduccion a favor minusvalidos");
      liiapdtitular.setDescription("Titular");
      liiapdnif.setDescription("NIF del participe");
      liiapdejanter.setDescription("Excesos pendientes de reducir de ejer.anteriores aportacion patrimonios");
      liiapdejerpropi.setDescription("Aportaciones del ejercicio");
      liiapdtotal.setDescription("Total con derecho a reduccion patrimonio protegido");
      liipcctitular.setDescription("Titular");
      liipccnif.setDescription("NIF del que recibe la pension");
      liipccimporte.setDescription("Importe de la pension");
      liipcctotal.setDescription("Total con derecho a reduccion pensiones compensatorias");
      liifpdtitular.setDescription("Titular");
      liifpdejanter.setDescription("Excesos pendientes reducir ejer. ant.a favor deportistas");
      liifpdejercicio.setDescription("Aportaciones del ejercicio a favor deportistas");
      liifpdtotal.setDescription("Total con derecho a reduccion a favor deportistas");
      liifpeejant2007.setDescription("Excesos pendientes de reducir de ejercicios anteriores a 2007");
      liifpcaplicmanu.setDescription("Se aplica manualmente aportacion a favor del conyuge");
      liipartpolitic.setDescription("Total reduccion partidos politicos");
      liifpsejercicio.setDescription("Aportaciones del ejercicio contrib.empre.seg.colect.dependencia");
      liipccnifext.setDescription("Nro de identifiacion en pais de residencia. Pensiones conyuge");
      liifpsejanter.setDescription("Dependencia excesos pdtes de reducir de ejer.anteriores");
      }
    }
    
  public class TabInmobiliario extends TableDef
    {
    // Campos
    public FieldDef inmejeraplic;
    public FieldDef inmdeclaran;
    public FieldDef inmidentinmob;
    public FieldDef inmdeclaracion;
    public FieldDef inmmuf;
    public FieldDef inmtiporeg;
    public FieldDef inmurbanrustica;
    public FieldDef inmclase;
    public FieldDef inmtipopropieda;
    public FieldDef inmuso;
    public FieldDef inmcalle;
    public FieldDef inmnumero;
    public FieldDef inmmunicipio;
    public FieldDef inmprovincia;
    public FieldDef inmactualizado;
    public FieldDef inmcoopropiedad;
    public FieldDef inmaplicporcen;
    public FieldDef inmdias;
    public FieldDef inmdias2;
    public FieldDef inmprorratear;
    public FieldDef inmatribrentas;
    public FieldDef inmcifentidad;
    public FieldDef inmdesactivado;
    public FieldDef inmrefcatastral;
    public FieldDef inmvdanueva;
    public FieldDef inmprimeradeduc;
    public FieldDef inmvdaprotecpub;
    public FieldDef inmvdaeuribor;
    public FieldDef inmdedautonante;
    public FieldDef inmdomiactual;
    public FieldDef inmvdarural;
    public FieldDef inmsituacion;
    public FieldDef inmdestino;
    public FieldDef inmcontadorant;
    public FieldDef inmepigrafe;
    public FieldDef inmnroregis;
    public FieldDef inmlocalnegoci;
    public FieldDef inmcpostal;
    public FieldDef inmcodigoine;
    public FieldDef inmcancelado;
    public FieldDef inmfecvisado;
    public FieldDef inmctipovia;
    public FieldDef inmctiponum;
    public FieldDef inmcalifnum;
    public FieldDef inmcbloque;
    public FieldDef inmcportal;
    public FieldDef inmcescalera;
    public FieldDef inmcplanta;
    public FieldDef inmcpuerta;
    public FieldDef inmclavepais;
    public FieldDef inmporcenusuf;
    public FieldDef inmaplicporusu;
    public FieldDef inmnifext;
    public TabInmobiliario(String name)
      {
      super(name);
      inmejeraplic = new FieldDef("inmejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      inmdeclaran = new FieldDef("inmdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      inmidentinmob = new FieldDef("inmidentinmob",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      inmdeclaracion = new FieldDef("inmdeclaracion",FieldDef.INTEGER,0);
      inmmuf = new FieldDef("inmmuf",FieldDef.CHAR,6);
      inmtiporeg = new FieldDef("inmtiporeg",FieldDef.INTEGER,0);
      inmurbanrustica = new FieldDef("inmurbanrustica",FieldDef.CHAR,1);
      inmclase = new FieldDef("inmclase",FieldDef.CHAR,1);
      inmtipopropieda = new FieldDef("inmtipopropieda",FieldDef.CHAR,1);
      inmuso = new FieldDef("inmuso",FieldDef.CHAR,2);
      inmcalle = new FieldDef("inmcalle",FieldDef.CHAR,50);
      inmnumero = new FieldDef("inmnumero",FieldDef.CHAR,4);
      inmmunicipio = new FieldDef("inmmunicipio",FieldDef.CHAR,15);
      inmprovincia = new FieldDef("inmprovincia",FieldDef.INTEGER,0);
      inmactualizado = new FieldDef("inmactualizado",FieldDef.CHAR,1);
      inmcoopropiedad = new FieldDef("inmcoopropiedad",FieldDef.FLOAT,6,0);
      inmaplicporcen = new FieldDef("inmaplicporcen",FieldDef.CHAR,1);
      inmdias = new FieldDef("inmdias",FieldDef.INTEGER,0);
      inmdias2 = new FieldDef("inmdias2",FieldDef.INTEGER,0);
      inmprorratear = new FieldDef("inmprorratear",FieldDef.CHAR,1);
      inmatribrentas = new FieldDef("inmatribrentas",FieldDef.CHAR,1);
      inmcifentidad = new FieldDef("inmcifentidad",FieldDef.CHAR,9);
      inmdesactivado = new FieldDef("inmdesactivado",FieldDef.CHAR,1);
      inmrefcatastral = new FieldDef("inmrefcatastral",FieldDef.CHAR,20);
      inmvdanueva = new FieldDef("inmvdanueva",FieldDef.CHAR,1);
      inmprimeradeduc = new FieldDef("inmprimeradeduc",FieldDef.CHAR,1);
      inmvdaprotecpub = new FieldDef("inmvdaprotecpub",FieldDef.CHAR,1);
      inmvdaeuribor = new FieldDef("inmvdaeuribor",FieldDef.CHAR,1);
      inmdedautonante = new FieldDef("inmdedautonante",FieldDef.CHAR,1);
      inmdomiactual = new FieldDef("inmdomiactual",FieldDef.CHAR,1);
      inmvdarural = new FieldDef("inmvdarural",FieldDef.CHAR,1);
      inmsituacion = new FieldDef("inmsituacion",FieldDef.INTEGER,0);
      inmdestino = new FieldDef("inmdestino",FieldDef.INTEGER,0);
      inmcontadorant = new FieldDef("inmcontadorant",FieldDef.CHAR,15);
      inmepigrafe = new FieldDef("inmepigrafe",FieldDef.CHAR,7);
      inmnroregis = new FieldDef("inmnroregis",FieldDef.INTEGER,0);
      inmlocalnegoci = new FieldDef("inmlocalnegoci",FieldDef.CHAR,1);
      inmcpostal = new FieldDef("inmcpostal",FieldDef.CHAR,5);
      inmcodigoine = new FieldDef("inmcodigoine",FieldDef.CHAR,5);
      inmcancelado = new FieldDef("inmcancelado",FieldDef.CHAR,1);
      inmfecvisado = new FieldDef("inmfecvisado",FieldDef.DATE);
      inmctipovia = new FieldDef("inmctipovia",FieldDef.CHAR,5);
      inmctiponum = new FieldDef("inmctiponum",FieldDef.CHAR,3);
      inmcalifnum = new FieldDef("inmcalifnum",FieldDef.CHAR,3);
      inmcbloque = new FieldDef("inmcbloque",FieldDef.CHAR,3);
      inmcportal = new FieldDef("inmcportal",FieldDef.CHAR,3);
      inmcescalera = new FieldDef("inmcescalera",FieldDef.CHAR,3);
      inmcplanta = new FieldDef("inmcplanta",FieldDef.CHAR,3);
      inmcpuerta = new FieldDef("inmcpuerta",FieldDef.CHAR,3);
      inmclavepais = new FieldDef("inmclavepais",FieldDef.CHAR,2);
      inmporcenusuf = new FieldDef("inmporcenusuf",FieldDef.FLOAT,6,0);
      inmaplicporusu = new FieldDef("inmaplicporusu",FieldDef.CHAR,1);
      inmnifext = new FieldDef("inmnifext",FieldDef.CHAR,25);
      FieldDef array[] = {
        inmejeraplic,
        inmdeclaran,
        inmidentinmob,
        inmdeclaracion,
        inmmuf,
        inmtiporeg,
        inmurbanrustica,
        inmclase,
        inmtipopropieda,
        inmuso,
        inmcalle,
        inmnumero,
        inmmunicipio,
        inmprovincia,
        inmactualizado,
        inmcoopropiedad,
        inmaplicporcen,
        inmdias,
        inmdias2,
        inmprorratear,
        inmatribrentas,
        inmcifentidad,
        inmdesactivado,
        inmrefcatastral,
        inmvdanueva,
        inmprimeradeduc,
        inmvdaprotecpub,
        inmvdaeuribor,
        inmdedautonante,
        inmdomiactual,
        inmvdarural,
        inmsituacion,
        inmdestino,
        inmcontadorant,
        inmepigrafe,
        inmnroregis,
        inmlocalnegoci,
        inmcpostal,
        inmcodigoine,
        inmcancelado,
        inmfecvisado,
        inmctipovia,
        inmctiponum,
        inmcalifnum,
        inmcbloque,
        inmcportal,
        inmcescalera,
        inmcplanta,
        inmcpuerta,
        inmclavepais,
        inmporcenusuf,
        inmaplicporusu,
        inmnifext        
        };
      setColumns(array);
      FieldDef arrayf[] = {inmejeraplic,inmdeclaran,inmidentinmob };
      setDescription("Datos capital inmobiliario");
      setPrimaryKeys(arrayf);
      inmejeraplic.setDescription("Ejercicio aplicacion");
      inmdeclaran.setDescription("CODIGO DE DECLARANTE");
      inmidentinmob.setDescription("Identificador inmobiliario");
      inmdeclaracion.setDescription("Codigo Declaracion");
      inmmuf.setDescription("M.U.F.");
      inmtiporeg.setDescription("Tipo Registro Para orden");
      inmurbanrustica.setDescription("Tipo Finca");
      inmclase.setDescription("Clase          (Local/Vda/Solar/Parking/Trastero)");
      inmtipopropieda.setDescription("Tipo propiedad (Pleno-M-Nuda-O dretsReals-T-V )");
      inmuso.setDescription("Uso o Destino  (HA/AF-AR-SA/PR-DE-DR-PP-SR )");
      inmcalle.setDescription("Calle");
      inmnumero.setDescription("Numero");
      inmmunicipio.setDescription("Municipio");
      inmprovincia.setDescription("Provincia");
      inmactualizado.setDescription("V. catastral actualizado");
      inmcoopropiedad.setDescription("Porcentaje Copropiedad");
      inmaplicporcen.setDescription("Aplicar % propiedad a importes");
      inmdias.setDescription("Dias no propiedad");
      inmdias2.setDescription("Dias propiedad");
      inmprorratear.setDescription("Prorratear Gastos por meses");
      inmatribrentas.setDescription("Atribucion de rentas");
      inmcifentidad.setDescription("NIF entidad atribucion rentas");
      inmdesactivado.setDescription("Desactivado");
      inmrefcatastral.setDescription("Referencia catastral");
      inmvdanueva.setDescription("Vivienda nueva");
      inmprimeradeduc.setDescription("Primera ded. vivienda habitual");
      inmvdaprotecpub.setDescription("Vivienda de proteccion publica");
      inmvdaeuribor.setDescription("Vda prestamo tipo variable");
      inmdedautonante.setDescription("Aplico ded.autonomica ej.ant");
      inmdomiactual.setDescription("Domicilio actual");
      inmvdarural.setDescription("Vivienda en nucleo rural");
      inmsituacion.setDescription("Situacion inmueble");
      inmdestino.setDescription("Uso o destino (decl. Renta)");
      inmcontadorant.setDescription("Contador aplicacion antigua");
      inmepigrafe.setDescription("Epigrafe I.A.E.");
      inmnroregis.setDescription("Numero de registro");
      inmlocalnegoci.setDescription("Local de negocio");
      inmcpostal.setDescription("Codigo postal");
      inmcodigoine.setDescription("Codigo INE del municipio");
      inmcancelado.setDescription("Valor inmobiliario cancelado");
      inmfecvisado.setDescription("Cast-Leon  Fecha de visado del proyecto. 1a vda.hab.de nueva construc");
      inmctipovia.setDescription("Tipo de via");
      inmctiponum.setDescription("Tipo de numeracion");
      inmcalifnum.setDescription("Calificador de nro");
      inmcbloque.setDescription("Bloque");
      inmcportal.setDescription("Portal");
      inmcescalera.setDescription("Escalera");
      inmcplanta.setDescription("Planta");
      inmcpuerta.setDescription("Puerta");
      inmclavepais.setDescription("Clave pais");
      inmporcenusuf.setDescription("Porcentaje usufructo");
      inmaplicporusu.setDescription("Aplicar % usfructo a la imputacion");
      inmnifext.setDescription("Nro.Identificac.en pais residencia");
      }
    }
    
  public class TabLiquidaaparte3 extends TableDef
    {
    // Campos
    public FieldDef le3ejeraplic;
    public FieldDef le3declaran;
    public FieldDef le3muf;
    public FieldDef le3tipocalculo;
    public FieldDef le3nactividad;
    public FieldDef le3titular;
    public FieldDef le3cobropago;
    public FieldDef le3ingresprod1;
    public FieldDef le3indiceprod1;
    public FieldDef le3rdtoprod1;
    public FieldDef le3ingresprod2;
    public FieldDef le3indiceprod2;
    public FieldDef le3rdtoprod2;
    public FieldDef le3ingresprod3;
    public FieldDef le3indiceprod3;
    public FieldDef le3rdtoprod3;
    public FieldDef le3ingresprod4;
    public FieldDef le3indiceprod4;
    public FieldDef le3rdtoprod4;
    public FieldDef le3ingresprod5;
    public FieldDef le3indiceprod5;
    public FieldDef le3rdtoprod5;
    public FieldDef le3ingresprod6;
    public FieldDef le3indiceprod6;
    public FieldDef le3rdtoprod6;
    public FieldDef le3ingresprod7;
    public FieldDef le3indiceprod7;
    public FieldDef le3rdtoprod7;
    public FieldDef le3ingresprod8;
    public FieldDef le3indiceprod8;
    public FieldDef le3rdtoprod8;
    public FieldDef le3ingresprod9;
    public FieldDef le3indiceprod9;
    public FieldDef le3rdtoprod9;
    public FieldDef le3ingresprod10;
    public FieldDef le3indiceprod10;
    public FieldDef le3rdtoprod10;
    public FieldDef le3ingresprod11;
    public FieldDef le3indiceprod11;
    public FieldDef le3rdtoprod11;
    public FieldDef le3ingresprod12;
    public FieldDef le3indiceprod12;
    public FieldDef le3rdtoprod12;
    public FieldDef le3ingresprod13;
    public FieldDef le3indiceprod13;
    public FieldDef le3rdtoprod13;
    public FieldDef le3totingresos;
    public FieldDef le3rdtoprevio;
    public FieldDef le3redgasoleo;
    public FieldDef le3redfertiliza;
    public FieldDef le3redamortizac;
    public FieldDef le3rdtominorado;
    public FieldDef le3indprodajeno;
    public FieldDef le3indpersonal;
    public FieldDef le3indarrendada;
    public FieldDef le3indpiensos;
    public FieldDef le3indecologica;
    public FieldDef le3indpeqempres;
    public FieldDef le3indforestal;
    public FieldDef le3rdtomodulos;
    public FieldDef le3reducgral;
    public FieldDef le3diferencia;
    public FieldDef le3reducjovenes;
    public FieldDef le3gastextraord;
    public FieldDef le3rdtoneto;
    public FieldDef le3reducirregul;
    public FieldDef le3rdtonetoredu;
    public FieldDef le3redempleo;
    public FieldDef le3salarioredem;
    public FieldDef le3coddeclara;
    public FieldDef le3clave;
    public FieldDef le3ayudagricola;
    public FieldDef le3gravaunico;
    public FieldDef le3indregadio;
    public TabLiquidaaparte3(String name)
      {
      super(name);
      le3ejeraplic = new FieldDef("le3ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      le3declaran = new FieldDef("le3declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      le3muf = new FieldDef("le3muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      le3tipocalculo = new FieldDef("le3tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      le3nactividad = new FieldDef("le3nactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      le3titular = new FieldDef("le3titular",FieldDef.CHAR,1);
      le3cobropago = new FieldDef("le3cobropago",FieldDef.CHAR,1);
      le3ingresprod1 = new FieldDef("le3ingresprod1",FieldDef.FLOAT,6,0);
      le3indiceprod1 = new FieldDef("le3indiceprod1",FieldDef.CHAR,10);
      le3rdtoprod1 = new FieldDef("le3rdtoprod1",FieldDef.FLOAT,6,0);
      le3ingresprod2 = new FieldDef("le3ingresprod2",FieldDef.FLOAT,6,0);
      le3indiceprod2 = new FieldDef("le3indiceprod2",FieldDef.CHAR,10);
      le3rdtoprod2 = new FieldDef("le3rdtoprod2",FieldDef.FLOAT,6,0);
      le3ingresprod3 = new FieldDef("le3ingresprod3",FieldDef.FLOAT,6,0);
      le3indiceprod3 = new FieldDef("le3indiceprod3",FieldDef.CHAR,10);
      le3rdtoprod3 = new FieldDef("le3rdtoprod3",FieldDef.FLOAT,6,0);
      le3ingresprod4 = new FieldDef("le3ingresprod4",FieldDef.FLOAT,6,0);
      le3indiceprod4 = new FieldDef("le3indiceprod4",FieldDef.CHAR,10);
      le3rdtoprod4 = new FieldDef("le3rdtoprod4",FieldDef.FLOAT,6,0);
      le3ingresprod5 = new FieldDef("le3ingresprod5",FieldDef.FLOAT,6,0);
      le3indiceprod5 = new FieldDef("le3indiceprod5",FieldDef.CHAR,10);
      le3rdtoprod5 = new FieldDef("le3rdtoprod5",FieldDef.FLOAT,6,0);
      le3ingresprod6 = new FieldDef("le3ingresprod6",FieldDef.FLOAT,6,0);
      le3indiceprod6 = new FieldDef("le3indiceprod6",FieldDef.CHAR,10);
      le3rdtoprod6 = new FieldDef("le3rdtoprod6",FieldDef.FLOAT,6,0);
      le3ingresprod7 = new FieldDef("le3ingresprod7",FieldDef.FLOAT,6,0);
      le3indiceprod7 = new FieldDef("le3indiceprod7",FieldDef.CHAR,10);
      le3rdtoprod7 = new FieldDef("le3rdtoprod7",FieldDef.FLOAT,6,0);
      le3ingresprod8 = new FieldDef("le3ingresprod8",FieldDef.FLOAT,6,0);
      le3indiceprod8 = new FieldDef("le3indiceprod8",FieldDef.CHAR,10);
      le3rdtoprod8 = new FieldDef("le3rdtoprod8",FieldDef.FLOAT,6,0);
      le3ingresprod9 = new FieldDef("le3ingresprod9",FieldDef.FLOAT,6,0);
      le3indiceprod9 = new FieldDef("le3indiceprod9",FieldDef.CHAR,10);
      le3rdtoprod9 = new FieldDef("le3rdtoprod9",FieldDef.FLOAT,6,0);
      le3ingresprod10 = new FieldDef("le3ingresprod10",FieldDef.FLOAT,6,0);
      le3indiceprod10 = new FieldDef("le3indiceprod10",FieldDef.CHAR,10);
      le3rdtoprod10 = new FieldDef("le3rdtoprod10",FieldDef.FLOAT,6,0);
      le3ingresprod11 = new FieldDef("le3ingresprod11",FieldDef.FLOAT,6,0);
      le3indiceprod11 = new FieldDef("le3indiceprod11",FieldDef.CHAR,10);
      le3rdtoprod11 = new FieldDef("le3rdtoprod11",FieldDef.FLOAT,6,0);
      le3ingresprod12 = new FieldDef("le3ingresprod12",FieldDef.FLOAT,6,0);
      le3indiceprod12 = new FieldDef("le3indiceprod12",FieldDef.CHAR,10);
      le3rdtoprod12 = new FieldDef("le3rdtoprod12",FieldDef.FLOAT,6,0);
      le3ingresprod13 = new FieldDef("le3ingresprod13",FieldDef.FLOAT,6,0);
      le3indiceprod13 = new FieldDef("le3indiceprod13",FieldDef.CHAR,10);
      le3rdtoprod13 = new FieldDef("le3rdtoprod13",FieldDef.FLOAT,6,0);
      le3totingresos = new FieldDef("le3totingresos",FieldDef.FLOAT,6,0);
      le3rdtoprevio = new FieldDef("le3rdtoprevio",FieldDef.FLOAT,6,0);
      le3redgasoleo = new FieldDef("le3redgasoleo",FieldDef.FLOAT,6,0);
      le3redfertiliza = new FieldDef("le3redfertiliza",FieldDef.FLOAT,6,0);
      le3redamortizac = new FieldDef("le3redamortizac",FieldDef.FLOAT,6,0);
      le3rdtominorado = new FieldDef("le3rdtominorado",FieldDef.FLOAT,6,0);
      le3indprodajeno = new FieldDef("le3indprodajeno",FieldDef.FLOAT,6,0);
      le3indpersonal = new FieldDef("le3indpersonal",FieldDef.FLOAT,6,0);
      le3indarrendada = new FieldDef("le3indarrendada",FieldDef.FLOAT,6,0);
      le3indpiensos = new FieldDef("le3indpiensos",FieldDef.FLOAT,6,0);
      le3indecologica = new FieldDef("le3indecologica",FieldDef.FLOAT,6,0);
      le3indpeqempres = new FieldDef("le3indpeqempres",FieldDef.FLOAT,6,0);
      le3indforestal = new FieldDef("le3indforestal",FieldDef.FLOAT,6,0);
      le3rdtomodulos = new FieldDef("le3rdtomodulos",FieldDef.FLOAT,6,0);
      le3reducgral = new FieldDef("le3reducgral",FieldDef.FLOAT,6,0);
      le3diferencia = new FieldDef("le3diferencia",FieldDef.FLOAT,6,0);
      le3reducjovenes = new FieldDef("le3reducjovenes",FieldDef.FLOAT,6,0);
      le3gastextraord = new FieldDef("le3gastextraord",FieldDef.FLOAT,6,0);
      le3rdtoneto = new FieldDef("le3rdtoneto",FieldDef.FLOAT,6,0);
      le3reducirregul = new FieldDef("le3reducirregul",FieldDef.FLOAT,6,0);
      le3rdtonetoredu = new FieldDef("le3rdtonetoredu",FieldDef.FLOAT,6,0);
      le3redempleo = new FieldDef("le3redempleo",FieldDef.CHAR,1);
      le3salarioredem = new FieldDef("le3salarioredem",FieldDef.FLOAT,6,0);
      le3coddeclara = new FieldDef("le3coddeclara",FieldDef.INTEGER,0);
      le3clave = new FieldDef("le3clave",FieldDef.CHAR,1);
      le3ayudagricola = new FieldDef("le3ayudagricola",FieldDef.FLOAT,6,0);
      le3gravaunico = new FieldDef("le3gravaunico",FieldDef.CHAR,1);
      le3indregadio = new FieldDef("le3indregadio",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        le3ejeraplic,
        le3declaran,
        le3muf,
        le3tipocalculo,
        le3nactividad,
        le3titular,
        le3cobropago,
        le3ingresprod1,
        le3indiceprod1,
        le3rdtoprod1,
        le3ingresprod2,
        le3indiceprod2,
        le3rdtoprod2,
        le3ingresprod3,
        le3indiceprod3,
        le3rdtoprod3,
        le3ingresprod4,
        le3indiceprod4,
        le3rdtoprod4,
        le3ingresprod5,
        le3indiceprod5,
        le3rdtoprod5,
        le3ingresprod6,
        le3indiceprod6,
        le3rdtoprod6,
        le3ingresprod7,
        le3indiceprod7,
        le3rdtoprod7,
        le3ingresprod8,
        le3indiceprod8,
        le3rdtoprod8,
        le3ingresprod9,
        le3indiceprod9,
        le3rdtoprod9,
        le3ingresprod10,
        le3indiceprod10,
        le3rdtoprod10,
        le3ingresprod11,
        le3indiceprod11,
        le3rdtoprod11,
        le3ingresprod12,
        le3indiceprod12,
        le3rdtoprod12,
        le3ingresprod13,
        le3indiceprod13,
        le3rdtoprod13,
        le3totingresos,
        le3rdtoprevio,
        le3redgasoleo,
        le3redfertiliza,
        le3redamortizac,
        le3rdtominorado,
        le3indprodajeno,
        le3indpersonal,
        le3indarrendada,
        le3indpiensos,
        le3indecologica,
        le3indpeqempres,
        le3indforestal,
        le3rdtomodulos,
        le3reducgral,
        le3diferencia,
        le3reducjovenes,
        le3gastextraord,
        le3rdtoneto,
        le3reducirregul,
        le3rdtonetoredu,
        le3redempleo,
        le3salarioredem,
        le3coddeclara,
        le3clave,
        le3ayudagricola,
        le3gravaunico,
        le3indregadio        
        };
      setColumns(array);
      FieldDef arrayf[] = {le3ejeraplic,le3declaran,le3muf,le3tipocalculo,le3nactividad };
      setDescription("Liquidacion renta apartado E3: actividades EO agricolas");
      setPrimaryKeys(arrayf);
      le3ejeraplic.setDescription("Ejercicio aplicacion");
      le3declaran.setDescription("Codigo de declarante");
      le3muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      le3tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      le3nactividad.setDescription("Codigo de actividad");
      le3titular.setDescription("Titular");
      le3cobropago.setDescription("Imputacion temporal por cobro o pago");
      le3ingresprod1.setDescription("Ingresos integros producto 1");
      le3indiceprod1.setDescription("Indice producto 1");
      le3rdtoprod1.setDescription("Rendimiento base producto 1");
      le3ingresprod2.setDescription("Ingresos integros producto 2");
      le3indiceprod2.setDescription("Indice producto 2");
      le3rdtoprod2.setDescription("Rendimiento base producto 2");
      le3ingresprod3.setDescription("Ingresos integros producto 3");
      le3indiceprod3.setDescription("Indice producto 3");
      le3rdtoprod3.setDescription("Rendimiento base producto 3");
      le3ingresprod4.setDescription("Ingresos integros producto 4");
      le3indiceprod4.setDescription("Indice producto 4");
      le3rdtoprod4.setDescription("Rendimiento base producto 4");
      le3ingresprod5.setDescription("Ingresos integros producto 5");
      le3indiceprod5.setDescription("Indice producto 5");
      le3rdtoprod5.setDescription("Rendimiento base producto 5");
      le3ingresprod6.setDescription("Ingresos integros producto 6");
      le3indiceprod6.setDescription("Indice producto 6");
      le3rdtoprod6.setDescription("Rendimiento base producto 6");
      le3ingresprod7.setDescription("Ingresos integros producto 7");
      le3indiceprod7.setDescription("Indice producto 7");
      le3rdtoprod7.setDescription("Rendimiento base producto 7");
      le3ingresprod8.setDescription("Ingresos integros producto 8");
      le3indiceprod8.setDescription("Indice producto 8");
      le3rdtoprod8.setDescription("Rendimiento base producto 8");
      le3ingresprod9.setDescription("Ingresos integros producto 9");
      le3indiceprod9.setDescription("Indice producto 9");
      le3rdtoprod9.setDescription("Rendimiento base producto 9");
      le3ingresprod10.setDescription("Ingresos integros producto 10");
      le3indiceprod10.setDescription("Indice producto 10");
      le3rdtoprod10.setDescription("Rendimiento base producto 10");
      le3ingresprod11.setDescription("Ingresos integros producto 11");
      le3indiceprod11.setDescription("Indice producto 11");
      le3rdtoprod11.setDescription("Rendimiento base producto 11");
      le3ingresprod12.setDescription("Ingresos integros producto 12");
      le3indiceprod12.setDescription("Indice producto 12");
      le3rdtoprod12.setDescription("Rendimiento base producto 12");
      le3ingresprod13.setDescription("Ingresos integros producto 13");
      le3indiceprod13.setDescription("Indice producto 13");
      le3rdtoprod13.setDescription("Rendimiento base producto 13");
      le3totingresos.setDescription("Total ingresos");
      le3rdtoprevio.setDescription("Rendimiento neto previo");
      le3redgasoleo.setDescription("Reduccion adquisicion gasoleo");
      le3redfertiliza.setDescription("Reduccion fertilizantes");
      le3redamortizac.setDescription("Reduccion amortizacion");
      le3rdtominorado.setDescription("Rendimiento neto minorado");
      le3indprodajeno.setDescription("Indice utilizacion medios ajenos");
      le3indpersonal.setDescription("Indice utilizacion personal asalariado");
      le3indarrendada.setDescription("Indice tierras arrendadas");
      le3indpiensos.setDescription("Indice piensos adquiridos a terceros");
      le3indecologica.setDescription("Indice actividades ecologicas");
      le3indpeqempres.setDescription("Indice empresa pequeña dimension");
      le3indforestal.setDescription("Indice actividades forestales");
      le3rdtomodulos.setDescription("Rendimiento neto modulos");
      le3reducgral.setDescription("Reduccion general");
      le3diferencia.setDescription("Diferencia");
      le3reducjovenes.setDescription("Reduccion agricultores jovenes");
      le3gastextraord.setDescription("Gastos extraordinarios");
      le3rdtoneto.setDescription("Rendimiento neto actividad");
      le3reducirregul.setDescription("Reduccion irregular");
      le3rdtonetoredu.setDescription("Rendimiento neto reducido");
      le3redempleo.setDescription("Aplicar reduccion empleo");
      le3salarioredem.setDescription("Importe salario aplicacion reduccion empleo");
      le3coddeclara.setDescription("Codigo declaracion");
      le3clave.setDescription("Clave actividad");
      le3ayudagricola.setDescription("Importe ayuda agricola Ley 3/2010");
      le3gravaunico.setDescription("Presento autoliq.de gravamen unico");
      le3indregadio.setDescription("Indice corrector regadio-consumo elect.");
      }
    }
    
  public class TabImputatribucion extends TableDef
    {
    // Campos
    public FieldDef imaejeraplic;
    public FieldDef imadeclaran;
    public FieldDef imacontador;
    public FieldDef imadeclaracion;
    public FieldDef imamuf;
    public FieldDef imanombre;
    public FieldDef imacif;
    public FieldDef imaporcparticip;
    public FieldDef imaaplicprorcen;
    public FieldDef imardtocapinmob;
    public FieldDef imacapinmredire;
    public FieldDef imacapinmredvda;
    public FieldDef imardtocompinmo;
    public FieldDef imardtomobilgra;
    public FieldDef imamobilgralred;
    public FieldDef imardtocompmobg;
    public FieldDef imardtomobilaho;
    public FieldDef imamobilahorred;
    public FieldDef imardtocompmoba;
    public FieldDef imardtomobdivid;
    public FieldDef imardtoactecopr;
    public FieldDef imareducactecon;
    public FieldDef imardtoactivida;
    public FieldDef imareduempleo;
    public FieldDef imasalari;
    public FieldDef imagananbasgral;
    public FieldDef imaperdbasegral;
    public FieldDef imagananbasahor;
    public FieldDef imaperdbasahor;
    public FieldDef imaretenciones;
    public FieldDef imapagofracc;
    public FieldDef imaimpredempleo;
    public FieldDef imardtoactiveo;
    public FieldDef imagravaunico;
    public FieldDef imaganabgral2;
    public FieldDef imaperdbgral2;
    public FieldDef imanifext;
    public FieldDef imamobpospref;
    public FieldDef imamobnegpref;
    public FieldDef imaganabapref;
    public FieldDef imaperdbapref;
    public TabImputatribucion(String name)
      {
      super(name);
      imaejeraplic = new FieldDef("imaejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      imadeclaran = new FieldDef("imadeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      imacontador = new FieldDef("imacontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      imadeclaracion = new FieldDef("imadeclaracion",FieldDef.INTEGER,0);
      imamuf = new FieldDef("imamuf",FieldDef.CHAR,6);
      imanombre = new FieldDef("imanombre",FieldDef.CHAR,35);
      imacif = new FieldDef("imacif",FieldDef.CHAR,15);
      imaporcparticip = new FieldDef("imaporcparticip",FieldDef.FLOAT,6,0);
      imaaplicprorcen = new FieldDef("imaaplicprorcen",FieldDef.CHAR,1);
      imardtocapinmob = new FieldDef("imardtocapinmob",FieldDef.FLOAT,6,0);
      imacapinmredire = new FieldDef("imacapinmredire",FieldDef.FLOAT,6,0);
      imacapinmredvda = new FieldDef("imacapinmredvda",FieldDef.FLOAT,6,0);
      imardtocompinmo = new FieldDef("imardtocompinmo",FieldDef.FLOAT,6,0);
      imardtomobilgra = new FieldDef("imardtomobilgra",FieldDef.FLOAT,6,0);
      imamobilgralred = new FieldDef("imamobilgralred",FieldDef.FLOAT,6,0);
      imardtocompmobg = new FieldDef("imardtocompmobg",FieldDef.FLOAT,6,0);
      imardtomobilaho = new FieldDef("imardtomobilaho",FieldDef.FLOAT,6,0);
      imamobilahorred = new FieldDef("imamobilahorred",FieldDef.FLOAT,6,0);
      imardtocompmoba = new FieldDef("imardtocompmoba",FieldDef.FLOAT,6,0);
      imardtomobdivid = new FieldDef("imardtomobdivid",FieldDef.FLOAT,6,0);
      imardtoactecopr = new FieldDef("imardtoactecopr",FieldDef.FLOAT,6,0);
      imareducactecon = new FieldDef("imareducactecon",FieldDef.FLOAT,6,0);
      imardtoactivida = new FieldDef("imardtoactivida",FieldDef.FLOAT,6,0);
      imareduempleo = new FieldDef("imareduempleo",FieldDef.CHAR,1);
      imasalari = new FieldDef("imasalari",FieldDef.FLOAT,6,0);
      imagananbasgral = new FieldDef("imagananbasgral",FieldDef.FLOAT,6,0);
      imaperdbasegral = new FieldDef("imaperdbasegral",FieldDef.FLOAT,6,0);
      imagananbasahor = new FieldDef("imagananbasahor",FieldDef.FLOAT,6,0);
      imaperdbasahor = new FieldDef("imaperdbasahor",FieldDef.FLOAT,6,0);
      imaretenciones = new FieldDef("imaretenciones",FieldDef.FLOAT,6,0);
      imapagofracc = new FieldDef("imapagofracc",FieldDef.FLOAT,6,0);
      imaimpredempleo = new FieldDef("imaimpredempleo",FieldDef.FLOAT,6,0);
      imardtoactiveo = new FieldDef("imardtoactiveo",FieldDef.FLOAT,6,0);
      imagravaunico = new FieldDef("imagravaunico",FieldDef.CHAR,1);
      imaganabgral2 = new FieldDef("imaganabgral2",FieldDef.FLOAT,6,0);
      imaperdbgral2 = new FieldDef("imaperdbgral2",FieldDef.FLOAT,6,0);
      imanifext = new FieldDef("imanifext",FieldDef.CHAR,25);
      imamobpospref = new FieldDef("imamobpospref",FieldDef.FLOAT,6,0);
      imamobnegpref = new FieldDef("imamobnegpref",FieldDef.FLOAT,6,0);
      imaganabapref = new FieldDef("imaganabapref",FieldDef.FLOAT,6,0);
      imaperdbapref = new FieldDef("imaperdbapref",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        imaejeraplic,
        imadeclaran,
        imacontador,
        imadeclaracion,
        imamuf,
        imanombre,
        imacif,
        imaporcparticip,
        imaaplicprorcen,
        imardtocapinmob,
        imacapinmredire,
        imacapinmredvda,
        imardtocompinmo,
        imardtomobilgra,
        imamobilgralred,
        imardtocompmobg,
        imardtomobilaho,
        imamobilahorred,
        imardtocompmoba,
        imardtomobdivid,
        imardtoactecopr,
        imareducactecon,
        imardtoactivida,
        imareduempleo,
        imasalari,
        imagananbasgral,
        imaperdbasegral,
        imagananbasahor,
        imaperdbasahor,
        imaretenciones,
        imapagofracc,
        imaimpredempleo,
        imardtoactiveo,
        imagravaunico,
        imaganabgral2,
        imaperdbgral2,
        imanifext,
        imamobpospref,
        imamobnegpref,
        imaganabapref,
        imaperdbapref        
        };
      setColumns(array);
      FieldDef arrayf[] = {imaejeraplic,imadeclaran,imacontador };
      setDescription("Imputacion atribucion de rentas");
      setPrimaryKeys(arrayf);
      imaejeraplic.setDescription("Ejercicio aplicacion");
      imadeclaran.setDescription("CODIGO DE DECLARANTE");
      imacontador.setDescription("Contador");
      imadeclaracion.setDescription("Codigo Declaracion");
      imamuf.setDescription("M.U.F.");
      imanombre.setDescription("Nombre entidad");
      imacif.setDescription("NIF entidad");
      imaporcparticip.setDescription("% Participacion");
      imaaplicprorcen.setDescription("Aplicar % sobre rendimientos");
      imardtocapinmob.setDescription("Rdto. capital inmobiliario");
      imacapinmredire.setDescription("Reduc.irregular capital inmob.");
      imacapinmredvda.setDescription("Reduc.vda capital inmob.");
      imardtocompinmo.setDescription("Rdto.computable capital inmob.");
      imardtomobilgra.setDescription("Rdto. cap.mobiliario base gral.");
      imamobilgralred.setDescription("Reducc.cap.mobiliario base gral.");
      imardtocompmobg.setDescription("Rdto.computable mobiliario gral.");
      imardtomobilaho.setDescription("Rdto. Mobil. base ahorro no dividendos");
      imamobilahorred.setDescription("Reducc.cap.mobiliario base ahorro no dividendos");
      imardtocompmoba.setDescription("Rdto.computable mobiliario ahorro no dividendos");
      imardtomobdivid.setDescription("Rdto. Mobil. base ahorro dividendos");
      imardtoactecopr.setDescription("Rdto. actividades economicas");
      imareducactecon.setDescription("Reducciones activ.economicas");
      imardtoactivida.setDescription("Rdto.reducido activ.economicas");
      imareduempleo.setDescription("Aplicar reduc. DA 27");
      imasalari.setDescription("Retribucion trabajadores");
      imagananbasgral.setDescription("Ganancias base general (NO derivada transmision patrimonial)");
      imaperdbasegral.setDescription("Perdidas base general  (NO derivada transmision patrimonial)");
      imagananbasahor.setDescription("Ganancias base ahorro");
      imaperdbasahor.setDescription("Perdidas base ahorro");
      imaretenciones.setDescription("Retenciones");
      imapagofracc.setDescription("Pagos fraccionados");
      imaimpredempleo.setDescription("Importe reduccion empleo actividad");
      imardtoactiveo.setDescription("Rendimiento actividades EO");
      imagravaunico.setDescription("Presentado autoliquidacion gravamen Unico");
      imaganabgral2.setDescription("Ganancias base general (Si derivada transmision patrimonial)");
      imaperdbgral2.setDescription("Perdidas base general  (Si derivada transmision patrimonial)");
      imanifext.setDescription("Nro identificativo en pais de residencia");
      imamobpospref.setDescription("Importe positivo participaciones preferentes o deuda subordinada base ahorro");
      imamobnegpref.setDescription("Importe negativo participaciones preferentes o deuda subordinada base ahorro");
      imaganabapref.setDescription("Ganancias base ahorro participaciones preferentes o deuda subordinada");
      imaperdbapref.setDescription("Perdidas  base ahorro participaciones preferentes o deuda subordinada");
      }
    }
    
  public class TabLiquidaapartf1 extends TableDef
    {
    // Campos
    public FieldDef lf1ejeraplic;
    public FieldDef lf1declaran;
    public FieldDef lf1muf;
    public FieldDef lf1tipocalculo;
    public FieldDef lf1natribucion;
    public FieldDef lf1titular;
    public FieldDef lf1nifentidad;
    public FieldDef lf1porcen;
    public FieldDef lf1mobgrlrdtoa;
    public FieldDef lf1mobgrlreduc;
    public FieldDef lf1mobgrlrdto;
    public FieldDef lf1mobahorrdto;
    public FieldDef lf1capinmrdtoa;
    public FieldDef lf1capinmreduc;
    public FieldDef lf1capinmrdto;
    public FieldDef lf1activrdtoa;
    public FieldDef lf1activreduc;
    public FieldDef lf1activrdto;
    public FieldDef lf1ganannoelem;
    public FieldDef lf1perdinoelem;
    public FieldDef lf1gananelemen;
    public FieldDef lf1perdielemen;
    public FieldDef lf1retenciones;
    public FieldDef lf1coddeclara;
    public FieldDef lf1redempleo;
    public FieldDef lf1salarioredem;
    public FieldDef lf1basedividend;
    public FieldDef lf1mobahordtoa;
    public FieldDef lf1mobahoreduc;
    public FieldDef lf1exendividend;
    public FieldDef lf1activredempl;
    public FieldDef lf1rdtoactiveo;
    public FieldDef lf1gravaunico;
    public FieldDef lf1gananelembg;
    public FieldDef lf1perdielembg;
    public FieldDef lf1nifext;
    public FieldDef lf1mobbapospref;
    public FieldDef lf1mobbanegpref;
    public FieldDef lf1ganabapref;
    public FieldDef lf1perdbapref;
    public TabLiquidaapartf1(String name)
      {
      super(name);
      lf1ejeraplic = new FieldDef("lf1ejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lf1declaran = new FieldDef("lf1declaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lf1muf = new FieldDef("lf1muf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lf1tipocalculo = new FieldDef("lf1tipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lf1natribucion = new FieldDef("lf1natribucion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lf1titular = new FieldDef("lf1titular",FieldDef.CHAR,1);
      lf1nifentidad = new FieldDef("lf1nifentidad",FieldDef.CHAR,15);
      lf1porcen = new FieldDef("lf1porcen",FieldDef.FLOAT,6,0);
      lf1mobgrlrdtoa = new FieldDef("lf1mobgrlrdtoa",FieldDef.FLOAT,6,0);
      lf1mobgrlreduc = new FieldDef("lf1mobgrlreduc",FieldDef.FLOAT,6,0);
      lf1mobgrlrdto = new FieldDef("lf1mobgrlrdto",FieldDef.FLOAT,6,0);
      lf1mobahorrdto = new FieldDef("lf1mobahorrdto",FieldDef.FLOAT,6,0);
      lf1capinmrdtoa = new FieldDef("lf1capinmrdtoa",FieldDef.FLOAT,6,0);
      lf1capinmreduc = new FieldDef("lf1capinmreduc",FieldDef.FLOAT,6,0);
      lf1capinmrdto = new FieldDef("lf1capinmrdto",FieldDef.FLOAT,6,0);
      lf1activrdtoa = new FieldDef("lf1activrdtoa",FieldDef.FLOAT,6,0);
      lf1activreduc = new FieldDef("lf1activreduc",FieldDef.FLOAT,6,0);
      lf1activrdto = new FieldDef("lf1activrdto",FieldDef.FLOAT,6,0);
      lf1ganannoelem = new FieldDef("lf1ganannoelem",FieldDef.FLOAT,6,0);
      lf1perdinoelem = new FieldDef("lf1perdinoelem",FieldDef.FLOAT,6,0);
      lf1gananelemen = new FieldDef("lf1gananelemen",FieldDef.FLOAT,6,0);
      lf1perdielemen = new FieldDef("lf1perdielemen",FieldDef.FLOAT,6,0);
      lf1retenciones = new FieldDef("lf1retenciones",FieldDef.FLOAT,6,0);
      lf1coddeclara = new FieldDef("lf1coddeclara",FieldDef.INTEGER,0);
      lf1redempleo = new FieldDef("lf1redempleo",FieldDef.CHAR,1);
      lf1salarioredem = new FieldDef("lf1salarioredem",FieldDef.FLOAT,6,0);
      lf1basedividend = new FieldDef("lf1basedividend",FieldDef.FLOAT,6,0);
      lf1mobahordtoa = new FieldDef("lf1mobahordtoa",FieldDef.FLOAT,6,0);
      lf1mobahoreduc = new FieldDef("lf1mobahoreduc",FieldDef.FLOAT,6,0);
      lf1exendividend = new FieldDef("lf1exendividend",FieldDef.FLOAT,6,0);
      lf1activredempl = new FieldDef("lf1activredempl",FieldDef.FLOAT,6,0);
      lf1rdtoactiveo = new FieldDef("lf1rdtoactiveo",FieldDef.FLOAT,6,0);
      lf1gravaunico = new FieldDef("lf1gravaunico",FieldDef.CHAR,1);
      lf1gananelembg = new FieldDef("lf1gananelembg",FieldDef.FLOAT,6,0);
      lf1perdielembg = new FieldDef("lf1perdielembg",FieldDef.FLOAT,6,0);
      lf1nifext = new FieldDef("lf1nifext",FieldDef.CHAR,25);
      lf1mobbapospref = new FieldDef("lf1mobbapospref",FieldDef.FLOAT,6,0);
      lf1mobbanegpref = new FieldDef("lf1mobbanegpref",FieldDef.FLOAT,6,0);
      lf1ganabapref = new FieldDef("lf1ganabapref",FieldDef.FLOAT,6,0);
      lf1perdbapref = new FieldDef("lf1perdbapref",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lf1ejeraplic,
        lf1declaran,
        lf1muf,
        lf1tipocalculo,
        lf1natribucion,
        lf1titular,
        lf1nifentidad,
        lf1porcen,
        lf1mobgrlrdtoa,
        lf1mobgrlreduc,
        lf1mobgrlrdto,
        lf1mobahorrdto,
        lf1capinmrdtoa,
        lf1capinmreduc,
        lf1capinmrdto,
        lf1activrdtoa,
        lf1activreduc,
        lf1activrdto,
        lf1ganannoelem,
        lf1perdinoelem,
        lf1gananelemen,
        lf1perdielemen,
        lf1retenciones,
        lf1coddeclara,
        lf1redempleo,
        lf1salarioredem,
        lf1basedividend,
        lf1mobahordtoa,
        lf1mobahoreduc,
        lf1exendividend,
        lf1activredempl,
        lf1rdtoactiveo,
        lf1gravaunico,
        lf1gananelembg,
        lf1perdielembg,
        lf1nifext,
        lf1mobbapospref,
        lf1mobbanegpref,
        lf1ganabapref,
        lf1perdbapref        
        };
      setColumns(array);
      FieldDef arrayf[] = {lf1ejeraplic,lf1declaran,lf1muf,lf1tipocalculo,lf1natribucion };
      setDescription("Liquidacion renta apartado F1: atribucion");
      setPrimaryKeys(arrayf);
      lf1ejeraplic.setDescription("Ejercicio aplicacion");
      lf1declaran.setDescription("Codigo de declarante");
      lf1muf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lf1tipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lf1natribucion.setDescription("Codigo de atribucion");
      lf1titular.setDescription("Titular");
      lf1nifentidad.setDescription("NIF entidad");
      lf1porcen.setDescription("% participacion en la entidad");
      lf1mobgrlrdtoa.setDescription("Rendimiento neto atribuido capital mobiliario b.general");
      lf1mobgrlreduc.setDescription("Reducciones y minoraciones capital mobiliario b.general");
      lf1mobgrlrdto.setDescription("Rendimiento neto computable capital mobiliario b.general");
      lf1mobahorrdto.setDescription("Rendimiento neto computable capital mobiliario ahorro");
      lf1capinmrdtoa.setDescription("Rendimiento neto atribuido capital inmobiliario");
      lf1capinmreduc.setDescription("Reducciones y minoraciones capital inmobiliario");
      lf1capinmrdto.setDescription("Rendimiento neto computable capital inmobiliario");
      lf1activrdtoa.setDescription("Rendimiento neto atribuido actividades");
      lf1activreduc.setDescription("Reducciones y minoraciones actividades");
      lf1activrdto.setDescription("Rendimiento neto computable actividades");
      lf1ganannoelem.setDescription("Ganancias patrimoniales NO derivadas elementos patrimoniales base gral");
      lf1perdinoelem.setDescription("Perdidas patrimoniales  NO derivadas elementos patrimoniales base gral");
      lf1gananelemen.setDescription("Ganancias patrimoniales derivadas elementos patrimoniales  bAhorro >1");
      lf1perdielemen.setDescription("Perdidas patrimoniales derivadas elementos patrimoniales   bAhorro >1");
      lf1retenciones.setDescription("Retenciones");
      lf1coddeclara.setDescription("Codigo declaracion");
      lf1redempleo.setDescription("Aplicar reduccion empleo");
      lf1salarioredem.setDescription("Importe salario aplicacion reduccion empleo");
      lf1basedividend.setDescription("Rdto. neto atribuido capital mobiliario b.ahorro dividendos");
      lf1mobahordtoa.setDescription("Rendimiento neto atribuido capital mobiliario b.ahorro");
      lf1mobahoreduc.setDescription("Reducciones y minoraciones capital mobiliario b.ahorro");
      lf1exendividend.setDescription("Base ahorro dividendos exento");
      lf1activredempl.setDescription("Reduccion empleo actividades");
      lf1rdtoactiveo.setDescription("Rendimiento neto actividades EO");
      lf1gravaunico.setDescription("Presento autoliq.de gravamen unico");
      lf1gananelembg.setDescription("Ganancias patrimoniales derivadas elementos patrimoniales  base gral <=1 any");
      lf1perdielembg.setDescription("Perdidas patrimoniales derivadas elementos patrimoniales   base gral <=1 any");
      lf1nifext.setDescription("Nro de identifiacion de la entitat pais residencia");
      lf1mobbapospref.setDescription("Mobil.B.Ahorro Importe positivo participaciones preferentes o deuda subordinada");
      lf1mobbanegpref.setDescription("Mobil.B.Ahorro Importe negativo participaciones preferentes o deuda subordinada");
      lf1ganabapref.setDescription("Ganancias Base Ahorro Participaciones preferentes o deuda subordinada");
      lf1perdbapref.setDescription("Perdidas  Base Ahorro Participaciones preferentes o deuda subordinada");
      }
    }
    
  public class TabLiquidares extends TableDef
    {
    // Campos
    public FieldDef lrsejeraplic;
    public FieldDef lrsdeclaran;
    public FieldDef lrsmuf;
    public FieldDef lrstipocalculo;
    public FieldDef lrsrdtotrabajo;
    public FieldDef lrsrdtomobilah;
    public FieldDef lrsrdtomobilgr;
    public FieldDef lrstotalimputac;
    public FieldDef lrstotalrdtredu;
    public FieldDef lrstotalrdtosed;
    public FieldDef lrsreducactived;
    public FieldDef lrsredempleoed;
    public FieldDef lrsrdttotaled;
    public FieldDef lrstotalrdtoseo;
    public FieldDef lrsredempleoeo;
    public FieldDef lrsrdttotaleo;
    public FieldDef lrstotalrdtoeoa;
    public FieldDef lrsredempleoeoa;
    public FieldDef lrsrdttotaleoag;
    public FieldDef lrsatribmobgral;
    public FieldDef lrsatribmobahor;
    public FieldDef lrsatribinmobil;
    public FieldDef lrsatribactivid;
    public FieldDef lrsatribgannotr;
    public FieldDef lrsatribpernotr;
    public FieldDef lrsatribgantran;
    public FieldDef lrsatribpertran;
    public FieldDef lrsatribretenci;
    public FieldDef lrsuteimputacio;
    public FieldDef lrsuteretencion;
    public FieldDef lrstfintimputac;
    public FieldDef lrsdimagimputac;
    public FieldDef lrsinvcoimputac;
    public FieldDef lrsg5bgresganan;
    public FieldDef lrsg5bgresperdi;
    public FieldDef lrsg5baresganan;
    public FieldDef lrsg5baresperdi;
    public FieldDef lrsbgperdejantg;
    public FieldDef lrsbgtotalrdtos;
    public FieldDef lrsbgperdejantb;
    public FieldDef lrsbgperdejactb;
    public FieldDef lrsbasegeneral;
    public FieldDef lrsbgperdejactp;
    public FieldDef lrsbaperdejantg;
    public FieldDef lrsbatotrdtoneg;
    public FieldDef lrsbatotrdtopos;
    public FieldDef lrsbaperdejantb;
    public FieldDef lrsbaseahorro;
    public FieldDef lrsbgredconjunt;
    public FieldDef lrsbgredfpe;
    public FieldDef lrsbgredfpc;
    public FieldDef lrsbgredfpm;
    public FieldDef lrsbgredapd;
    public FieldDef lrsbgredpc;
    public FieldDef lrsbgredpolitic;
    public FieldDef lrsbgredfpd;
    public FieldDef lrsbaseliqgral;
    public FieldDef lrsbgbasesant;
    public FieldDef lrsbgraliqgrav;
    public FieldDef lrsbaredconjunt;
    public FieldDef lrsbaredpc;
    public FieldDef lrsbaredpolitic;
    public FieldDef lrsbaseliqahor;
    public FieldDef lrsbgminimoest;
    public FieldDef lrsbgminimoaut;
    public FieldDef lrsbaminimoest;
    public FieldDef lrsbaminimoaut;
    public FieldDef lrscuotaintest;
    public FieldDef lrscuotaintaut;
    public FieldDef lrsdedvdaest;
    public FieldDef lrsdedvdaaut;
    public FieldDef lrsdedbicest;
    public FieldDef lrsdedbicaut;
    public FieldDef lrsdeddonest;
    public FieldDef lrsdeddonaut;
    public FieldDef lrsdedempest;
    public FieldDef lrsdedempaut;
    public FieldDef lrsdedricest;
    public FieldDef lrsdedricaut;
    public FieldDef lrsdedpacest;
    public FieldDef lrsdedpacaut;
    public FieldDef lrsdedceuest;
    public FieldDef lrsdedceuaut;
    public FieldDef lrsdedcheest;
    public FieldDef lrsdedcheaut;
    public FieldDef lrsdedavdest;
    public FieldDef lrsdedavdaut;
    public FieldDef lrsdedovdest;
    public FieldDef lrstotdedaut;
    public FieldDef lrscuotaliqest;
    public FieldDef lrscuotaliqaut;
    public FieldDef lrsperdded1est;
    public FieldDef lrsperdint1est;
    public FieldDef lrsperdded2est;
    public FieldDef lrsperdint2est;
    public FieldDef lrsperdded2aut;
    public FieldDef lrsperdint2aut;
    public FieldDef lrsperdded3aut;
    public FieldDef lrsperdint3aut;
    public FieldDef lrscuotliqiest;
    public FieldDef lrscuotliqiaut;
    public FieldDef lrscuotaliqinc;
    public FieldDef lrsdeddividend;
    public FieldDef lrsdedinterext;
    public FieldDef lrsdedtrabajo;
    public FieldDef lrsdedinternac;
    public FieldDef lrsdedderimagen;
    public FieldDef lrscompenvda;
    public FieldDef lrscompenmobili;
    public FieldDef lrsretenbonifi;
    public FieldDef lrscuotaresult;
    public FieldDef lrstotalreten;
    public FieldDef lrscuotadiferen;
    public FieldDef lrsdedmaternida;
    public FieldDef lrsdedmateranti;
    public FieldDef lrsdednacimient;
    public FieldDef lrsdednacimanti;
    public FieldDef lrsresultdeclar;
    public FieldDef lrsrdtoactceuta;
    public FieldDef lrsatribucceuta;
    public FieldDef lrsatribacceuta;
    public FieldDef lrsimputacceuta;
    public FieldDef lrsrdtoinmceuta;
    public FieldDef lrsbggananceuta;
    public FieldDef lrsbagananceuta;
    public FieldDef lrsprimerpago;
    public FieldDef lrssegundopago;
    public FieldDef lrsdedovdest2;
    public FieldDef lrsrednovaacted;
    public FieldDef lrsdedencest;
    public FieldDef lrsbapreferantm;
    public FieldDef lrsbapreferantg;
    public FieldDef lrsbgpreferantg;
    public FieldDef lrsg5baresganas;
    public FieldDef lrsg5baresperds;
    public FieldDef lrsg5baresganap;
    public FieldDef lrsg5baresperdp;
    public FieldDef lrsatribgan1bg;
    public FieldDef lrsatribgan2bg;
    public FieldDef lrsatribper1bg;
    public FieldDef lrsatribper2bg;
    public FieldDef lrsatribganbas;
    public FieldDef lrsatribganbap;
    public FieldDef lrsatribperbas;
    public FieldDef lrsatribperbap;
    public FieldDef lrsbamobipos;
    public FieldDef lrsbamobinegnp;
    public FieldDef lrsbamobinegp;
    public FieldDef lrsbgperdejan1;
    public FieldDef lrsatrmobahos;
    public FieldDef lrsatrmobahoppo;
    public FieldDef lrsatrmobahopne;
    public TabLiquidares(String name)
      {
      super(name);
      lrsejeraplic = new FieldDef("lrsejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lrsdeclaran = new FieldDef("lrsdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lrsmuf = new FieldDef("lrsmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lrstipocalculo = new FieldDef("lrstipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lrsrdtotrabajo = new FieldDef("lrsrdtotrabajo",FieldDef.FLOAT,6,0);
      lrsrdtomobilah = new FieldDef("lrsrdtomobilah",FieldDef.FLOAT,6,0);
      lrsrdtomobilgr = new FieldDef("lrsrdtomobilgr",FieldDef.FLOAT,6,0);
      lrstotalimputac = new FieldDef("lrstotalimputac",FieldDef.FLOAT,6,0);
      lrstotalrdtredu = new FieldDef("lrstotalrdtredu",FieldDef.FLOAT,6,0);
      lrstotalrdtosed = new FieldDef("lrstotalrdtosed",FieldDef.FLOAT,6,0);
      lrsreducactived = new FieldDef("lrsreducactived",FieldDef.FLOAT,6,0);
      lrsredempleoed = new FieldDef("lrsredempleoed",FieldDef.FLOAT,6,0);
      lrsrdttotaled = new FieldDef("lrsrdttotaled",FieldDef.FLOAT,6,0);
      lrstotalrdtoseo = new FieldDef("lrstotalrdtoseo",FieldDef.FLOAT,6,0);
      lrsredempleoeo = new FieldDef("lrsredempleoeo",FieldDef.FLOAT,6,0);
      lrsrdttotaleo = new FieldDef("lrsrdttotaleo",FieldDef.FLOAT,6,0);
      lrstotalrdtoeoa = new FieldDef("lrstotalrdtoeoa",FieldDef.FLOAT,6,0);
      lrsredempleoeoa = new FieldDef("lrsredempleoeoa",FieldDef.FLOAT,6,0);
      lrsrdttotaleoag = new FieldDef("lrsrdttotaleoag",FieldDef.FLOAT,6,0);
      lrsatribmobgral = new FieldDef("lrsatribmobgral",FieldDef.FLOAT,6,0);
      lrsatribmobahor = new FieldDef("lrsatribmobahor",FieldDef.FLOAT,6,0);
      lrsatribinmobil = new FieldDef("lrsatribinmobil",FieldDef.FLOAT,6,0);
      lrsatribactivid = new FieldDef("lrsatribactivid",FieldDef.FLOAT,6,0);
      lrsatribgannotr = new FieldDef("lrsatribgannotr",FieldDef.FLOAT,6,0);
      lrsatribpernotr = new FieldDef("lrsatribpernotr",FieldDef.FLOAT,6,0);
      lrsatribgantran = new FieldDef("lrsatribgantran",FieldDef.FLOAT,6,0);
      lrsatribpertran = new FieldDef("lrsatribpertran",FieldDef.FLOAT,6,0);
      lrsatribretenci = new FieldDef("lrsatribretenci",FieldDef.FLOAT,6,0);
      lrsuteimputacio = new FieldDef("lrsuteimputacio",FieldDef.FLOAT,6,0);
      lrsuteretencion = new FieldDef("lrsuteretencion",FieldDef.FLOAT,6,0);
      lrstfintimputac = new FieldDef("lrstfintimputac",FieldDef.FLOAT,6,0);
      lrsdimagimputac = new FieldDef("lrsdimagimputac",FieldDef.FLOAT,6,0);
      lrsinvcoimputac = new FieldDef("lrsinvcoimputac",FieldDef.FLOAT,6,0);
      lrsg5bgresganan = new FieldDef("lrsg5bgresganan",FieldDef.FLOAT,6,0);
      lrsg5bgresperdi = new FieldDef("lrsg5bgresperdi",FieldDef.FLOAT,6,0);
      lrsg5baresganan = new FieldDef("lrsg5baresganan",FieldDef.FLOAT,6,0);
      lrsg5baresperdi = new FieldDef("lrsg5baresperdi",FieldDef.FLOAT,6,0);
      lrsbgperdejantg = new FieldDef("lrsbgperdejantg",FieldDef.FLOAT,6,0);
      lrsbgtotalrdtos = new FieldDef("lrsbgtotalrdtos",FieldDef.FLOAT,6,0);
      lrsbgperdejantb = new FieldDef("lrsbgperdejantb",FieldDef.FLOAT,6,0);
      lrsbgperdejactb = new FieldDef("lrsbgperdejactb",FieldDef.FLOAT,6,0);
      lrsbasegeneral = new FieldDef("lrsbasegeneral",FieldDef.FLOAT,6,0);
      lrsbgperdejactp = new FieldDef("lrsbgperdejactp",FieldDef.FLOAT,6,0);
      lrsbaperdejantg = new FieldDef("lrsbaperdejantg",FieldDef.FLOAT,6,0);
      lrsbatotrdtoneg = new FieldDef("lrsbatotrdtoneg",FieldDef.FLOAT,6,0);
      lrsbatotrdtopos = new FieldDef("lrsbatotrdtopos",FieldDef.FLOAT,6,0);
      lrsbaperdejantb = new FieldDef("lrsbaperdejantb",FieldDef.FLOAT,6,0);
      lrsbaseahorro = new FieldDef("lrsbaseahorro",FieldDef.FLOAT,6,0);
      lrsbgredconjunt = new FieldDef("lrsbgredconjunt",FieldDef.FLOAT,6,0);
      lrsbgredfpe = new FieldDef("lrsbgredfpe",FieldDef.FLOAT,6,0);
      lrsbgredfpc = new FieldDef("lrsbgredfpc",FieldDef.FLOAT,6,0);
      lrsbgredfpm = new FieldDef("lrsbgredfpm",FieldDef.FLOAT,6,0);
      lrsbgredapd = new FieldDef("lrsbgredapd",FieldDef.FLOAT,6,0);
      lrsbgredpc = new FieldDef("lrsbgredpc",FieldDef.FLOAT,6,0);
      lrsbgredpolitic = new FieldDef("lrsbgredpolitic",FieldDef.FLOAT,6,0);
      lrsbgredfpd = new FieldDef("lrsbgredfpd",FieldDef.FLOAT,6,0);
      lrsbaseliqgral = new FieldDef("lrsbaseliqgral",FieldDef.FLOAT,6,0);
      lrsbgbasesant = new FieldDef("lrsbgbasesant",FieldDef.FLOAT,6,0);
      lrsbgraliqgrav = new FieldDef("lrsbgraliqgrav",FieldDef.FLOAT,6,0);
      lrsbaredconjunt = new FieldDef("lrsbaredconjunt",FieldDef.FLOAT,6,0);
      lrsbaredpc = new FieldDef("lrsbaredpc",FieldDef.FLOAT,6,0);
      lrsbaredpolitic = new FieldDef("lrsbaredpolitic",FieldDef.FLOAT,6,0);
      lrsbaseliqahor = new FieldDef("lrsbaseliqahor",FieldDef.FLOAT,6,0);
      lrsbgminimoest = new FieldDef("lrsbgminimoest",FieldDef.FLOAT,6,0);
      lrsbgminimoaut = new FieldDef("lrsbgminimoaut",FieldDef.FLOAT,6,0);
      lrsbaminimoest = new FieldDef("lrsbaminimoest",FieldDef.FLOAT,6,0);
      lrsbaminimoaut = new FieldDef("lrsbaminimoaut",FieldDef.FLOAT,6,0);
      lrscuotaintest = new FieldDef("lrscuotaintest",FieldDef.FLOAT,6,0);
      lrscuotaintaut = new FieldDef("lrscuotaintaut",FieldDef.FLOAT,6,0);
      lrsdedvdaest = new FieldDef("lrsdedvdaest",FieldDef.FLOAT,6,0);
      lrsdedvdaaut = new FieldDef("lrsdedvdaaut",FieldDef.FLOAT,6,0);
      lrsdedbicest = new FieldDef("lrsdedbicest",FieldDef.FLOAT,6,0);
      lrsdedbicaut = new FieldDef("lrsdedbicaut",FieldDef.FLOAT,6,0);
      lrsdeddonest = new FieldDef("lrsdeddonest",FieldDef.FLOAT,6,0);
      lrsdeddonaut = new FieldDef("lrsdeddonaut",FieldDef.FLOAT,6,0);
      lrsdedempest = new FieldDef("lrsdedempest",FieldDef.FLOAT,6,0);
      lrsdedempaut = new FieldDef("lrsdedempaut",FieldDef.FLOAT,6,0);
      lrsdedricest = new FieldDef("lrsdedricest",FieldDef.FLOAT,6,0);
      lrsdedricaut = new FieldDef("lrsdedricaut",FieldDef.FLOAT,6,0);
      lrsdedpacest = new FieldDef("lrsdedpacest",FieldDef.FLOAT,6,0);
      lrsdedpacaut = new FieldDef("lrsdedpacaut",FieldDef.FLOAT,6,0);
      lrsdedceuest = new FieldDef("lrsdedceuest",FieldDef.FLOAT,6,0);
      lrsdedceuaut = new FieldDef("lrsdedceuaut",FieldDef.FLOAT,6,0);
      lrsdedcheest = new FieldDef("lrsdedcheest",FieldDef.FLOAT,6,0);
      lrsdedcheaut = new FieldDef("lrsdedcheaut",FieldDef.FLOAT,6,0);
      lrsdedavdest = new FieldDef("lrsdedavdest",FieldDef.FLOAT,6,0);
      lrsdedavdaut = new FieldDef("lrsdedavdaut",FieldDef.FLOAT,6,0);
      lrsdedovdest = new FieldDef("lrsdedovdest",FieldDef.FLOAT,6,0);
      lrstotdedaut = new FieldDef("lrstotdedaut",FieldDef.FLOAT,6,0);
      lrscuotaliqest = new FieldDef("lrscuotaliqest",FieldDef.FLOAT,6,0);
      lrscuotaliqaut = new FieldDef("lrscuotaliqaut",FieldDef.FLOAT,6,0);
      lrsperdded1est = new FieldDef("lrsperdded1est",FieldDef.FLOAT,6,0);
      lrsperdint1est = new FieldDef("lrsperdint1est",FieldDef.FLOAT,6,0);
      lrsperdded2est = new FieldDef("lrsperdded2est",FieldDef.FLOAT,6,0);
      lrsperdint2est = new FieldDef("lrsperdint2est",FieldDef.FLOAT,6,0);
      lrsperdded2aut = new FieldDef("lrsperdded2aut",FieldDef.FLOAT,6,0);
      lrsperdint2aut = new FieldDef("lrsperdint2aut",FieldDef.FLOAT,6,0);
      lrsperdded3aut = new FieldDef("lrsperdded3aut",FieldDef.FLOAT,6,0);
      lrsperdint3aut = new FieldDef("lrsperdint3aut",FieldDef.FLOAT,6,0);
      lrscuotliqiest = new FieldDef("lrscuotliqiest",FieldDef.FLOAT,6,0);
      lrscuotliqiaut = new FieldDef("lrscuotliqiaut",FieldDef.FLOAT,6,0);
      lrscuotaliqinc = new FieldDef("lrscuotaliqinc",FieldDef.FLOAT,6,0);
      lrsdeddividend = new FieldDef("lrsdeddividend",FieldDef.FLOAT,6,0);
      lrsdedinterext = new FieldDef("lrsdedinterext",FieldDef.FLOAT,6,0);
      lrsdedtrabajo = new FieldDef("lrsdedtrabajo",FieldDef.FLOAT,6,0);
      lrsdedinternac = new FieldDef("lrsdedinternac",FieldDef.FLOAT,6,0);
      lrsdedderimagen = new FieldDef("lrsdedderimagen",FieldDef.FLOAT,6,0);
      lrscompenvda = new FieldDef("lrscompenvda",FieldDef.FLOAT,6,0);
      lrscompenmobili = new FieldDef("lrscompenmobili",FieldDef.FLOAT,6,0);
      lrsretenbonifi = new FieldDef("lrsretenbonifi",FieldDef.FLOAT,6,0);
      lrscuotaresult = new FieldDef("lrscuotaresult",FieldDef.FLOAT,6,0);
      lrstotalreten = new FieldDef("lrstotalreten",FieldDef.FLOAT,6,0);
      lrscuotadiferen = new FieldDef("lrscuotadiferen",FieldDef.FLOAT,6,0);
      lrsdedmaternida = new FieldDef("lrsdedmaternida",FieldDef.FLOAT,6,0);
      lrsdedmateranti = new FieldDef("lrsdedmateranti",FieldDef.FLOAT,6,0);
      lrsdednacimient = new FieldDef("lrsdednacimient",FieldDef.FLOAT,6,0);
      lrsdednacimanti = new FieldDef("lrsdednacimanti",FieldDef.FLOAT,6,0);
      lrsresultdeclar = new FieldDef("lrsresultdeclar",FieldDef.FLOAT,6,0);
      lrsrdtoactceuta = new FieldDef("lrsrdtoactceuta",FieldDef.FLOAT,6,0);
      lrsatribucceuta = new FieldDef("lrsatribucceuta",FieldDef.FLOAT,6,0);
      lrsatribacceuta = new FieldDef("lrsatribacceuta",FieldDef.FLOAT,6,0);
      lrsimputacceuta = new FieldDef("lrsimputacceuta",FieldDef.FLOAT,6,0);
      lrsrdtoinmceuta = new FieldDef("lrsrdtoinmceuta",FieldDef.FLOAT,6,0);
      lrsbggananceuta = new FieldDef("lrsbggananceuta",FieldDef.FLOAT,6,0);
      lrsbagananceuta = new FieldDef("lrsbagananceuta",FieldDef.FLOAT,6,0);
      lrsprimerpago = new FieldDef("lrsprimerpago",FieldDef.FLOAT,6,0);
      lrssegundopago = new FieldDef("lrssegundopago",FieldDef.FLOAT,6,0);
      lrsdedovdest2 = new FieldDef("lrsdedovdest2",FieldDef.FLOAT,6,0);
      lrsrednovaacted = new FieldDef("lrsrednovaacted",FieldDef.FLOAT,6,0);
      lrsdedencest = new FieldDef("lrsdedencest",FieldDef.FLOAT,6,0);
      lrsbapreferantm = new FieldDef("lrsbapreferantm",FieldDef.FLOAT,6,0);
      lrsbapreferantg = new FieldDef("lrsbapreferantg",FieldDef.FLOAT,6,0);
      lrsbgpreferantg = new FieldDef("lrsbgpreferantg",FieldDef.FLOAT,6,0);
      lrsg5baresganas = new FieldDef("lrsg5baresganas",FieldDef.FLOAT,6,0);
      lrsg5baresperds = new FieldDef("lrsg5baresperds",FieldDef.FLOAT,6,0);
      lrsg5baresganap = new FieldDef("lrsg5baresganap",FieldDef.FLOAT,6,0);
      lrsg5baresperdp = new FieldDef("lrsg5baresperdp",FieldDef.FLOAT,6,0);
      lrsatribgan1bg = new FieldDef("lrsatribgan1bg",FieldDef.FLOAT,6,0);
      lrsatribgan2bg = new FieldDef("lrsatribgan2bg",FieldDef.FLOAT,6,0);
      lrsatribper1bg = new FieldDef("lrsatribper1bg",FieldDef.FLOAT,6,0);
      lrsatribper2bg = new FieldDef("lrsatribper2bg",FieldDef.FLOAT,6,0);
      lrsatribganbas = new FieldDef("lrsatribganbas",FieldDef.FLOAT,6,0);
      lrsatribganbap = new FieldDef("lrsatribganbap",FieldDef.FLOAT,6,0);
      lrsatribperbas = new FieldDef("lrsatribperbas",FieldDef.FLOAT,6,0);
      lrsatribperbap = new FieldDef("lrsatribperbap",FieldDef.FLOAT,6,0);
      lrsbamobipos = new FieldDef("lrsbamobipos",FieldDef.FLOAT,6,0);
      lrsbamobinegnp = new FieldDef("lrsbamobinegnp",FieldDef.FLOAT,6,0);
      lrsbamobinegp = new FieldDef("lrsbamobinegp",FieldDef.FLOAT,6,0);
      lrsbgperdejan1 = new FieldDef("lrsbgperdejan1",FieldDef.FLOAT,6,0);
      lrsatrmobahos = new FieldDef("lrsatrmobahos",FieldDef.FLOAT,6,0);
      lrsatrmobahoppo = new FieldDef("lrsatrmobahoppo",FieldDef.FLOAT,6,0);
      lrsatrmobahopne = new FieldDef("lrsatrmobahopne",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lrsejeraplic,
        lrsdeclaran,
        lrsmuf,
        lrstipocalculo,
        lrsrdtotrabajo,
        lrsrdtomobilah,
        lrsrdtomobilgr,
        lrstotalimputac,
        lrstotalrdtredu,
        lrstotalrdtosed,
        lrsreducactived,
        lrsredempleoed,
        lrsrdttotaled,
        lrstotalrdtoseo,
        lrsredempleoeo,
        lrsrdttotaleo,
        lrstotalrdtoeoa,
        lrsredempleoeoa,
        lrsrdttotaleoag,
        lrsatribmobgral,
        lrsatribmobahor,
        lrsatribinmobil,
        lrsatribactivid,
        lrsatribgannotr,
        lrsatribpernotr,
        lrsatribgantran,
        lrsatribpertran,
        lrsatribretenci,
        lrsuteimputacio,
        lrsuteretencion,
        lrstfintimputac,
        lrsdimagimputac,
        lrsinvcoimputac,
        lrsg5bgresganan,
        lrsg5bgresperdi,
        lrsg5baresganan,
        lrsg5baresperdi,
        lrsbgperdejantg,
        lrsbgtotalrdtos,
        lrsbgperdejantb,
        lrsbgperdejactb,
        lrsbasegeneral,
        lrsbgperdejactp,
        lrsbaperdejantg,
        lrsbatotrdtoneg,
        lrsbatotrdtopos,
        lrsbaperdejantb,
        lrsbaseahorro,
        lrsbgredconjunt,
        lrsbgredfpe,
        lrsbgredfpc,
        lrsbgredfpm,
        lrsbgredapd,
        lrsbgredpc,
        lrsbgredpolitic,
        lrsbgredfpd,
        lrsbaseliqgral,
        lrsbgbasesant,
        lrsbgraliqgrav,
        lrsbaredconjunt,
        lrsbaredpc,
        lrsbaredpolitic,
        lrsbaseliqahor,
        lrsbgminimoest,
        lrsbgminimoaut,
        lrsbaminimoest,
        lrsbaminimoaut,
        lrscuotaintest,
        lrscuotaintaut,
        lrsdedvdaest,
        lrsdedvdaaut,
        lrsdedbicest,
        lrsdedbicaut,
        lrsdeddonest,
        lrsdeddonaut,
        lrsdedempest,
        lrsdedempaut,
        lrsdedricest,
        lrsdedricaut,
        lrsdedpacest,
        lrsdedpacaut,
        lrsdedceuest,
        lrsdedceuaut,
        lrsdedcheest,
        lrsdedcheaut,
        lrsdedavdest,
        lrsdedavdaut,
        lrsdedovdest,
        lrstotdedaut,
        lrscuotaliqest,
        lrscuotaliqaut,
        lrsperdded1est,
        lrsperdint1est,
        lrsperdded2est,
        lrsperdint2est,
        lrsperdded2aut,
        lrsperdint2aut,
        lrsperdded3aut,
        lrsperdint3aut,
        lrscuotliqiest,
        lrscuotliqiaut,
        lrscuotaliqinc,
        lrsdeddividend,
        lrsdedinterext,
        lrsdedtrabajo,
        lrsdedinternac,
        lrsdedderimagen,
        lrscompenvda,
        lrscompenmobili,
        lrsretenbonifi,
        lrscuotaresult,
        lrstotalreten,
        lrscuotadiferen,
        lrsdedmaternida,
        lrsdedmateranti,
        lrsdednacimient,
        lrsdednacimanti,
        lrsresultdeclar,
        lrsrdtoactceuta,
        lrsatribucceuta,
        lrsatribacceuta,
        lrsimputacceuta,
        lrsrdtoinmceuta,
        lrsbggananceuta,
        lrsbagananceuta,
        lrsprimerpago,
        lrssegundopago,
        lrsdedovdest2,
        lrsrednovaacted,
        lrsdedencest,
        lrsbapreferantm,
        lrsbapreferantg,
        lrsbgpreferantg,
        lrsg5baresganas,
        lrsg5baresperds,
        lrsg5baresganap,
        lrsg5baresperdp,
        lrsatribgan1bg,
        lrsatribgan2bg,
        lrsatribper1bg,
        lrsatribper2bg,
        lrsatribganbas,
        lrsatribganbap,
        lrsatribperbas,
        lrsatribperbap,
        lrsbamobipos,
        lrsbamobinegnp,
        lrsbamobinegp,
        lrsbgperdejan1,
        lrsatrmobahos,
        lrsatrmobahoppo,
        lrsatrmobahopne        
        };
      setColumns(array);
      FieldDef arrayf[] = {lrsejeraplic,lrsdeclaran,lrsmuf,lrstipocalculo };
      setDescription("Resumen liquidacion de renta");
      setPrimaryKeys(arrayf);
      lrsejeraplic.setDescription("Ejercicio aplicacion");
      lrsdeclaran.setDescription("Codigo de declarante");
      lrsmuf.setDescription("Miembro unidad familiar  [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lrstipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lrsrdtotrabajo.setDescription("Rendimiento neto reducido trabajo personal");
      lrsrdtomobilah.setDescription("Rendimiento neto reducido capital mobiliario base ahorro");
      lrsrdtomobilgr.setDescription("Rendimiento neto reducido capital mobiliario base general");
      lrstotalimputac.setDescription("Total imputaciones inmuebles");
      lrstotalrdtredu.setDescription("Total rendimiento neto reducido inmuebles");
      lrstotalrdtosed.setDescription("Total rendimiento neto reducido ED");
      lrsreducactived.setDescription("Reduccion ciertas actividades ED  (Art 32.2)");
      lrsredempleoed.setDescription("Reduccion mantenimiento empleo actividades ED");
      lrsrdttotaled.setDescription("Rendimiento neto reducido total actividad ED");
      lrstotalrdtoseo.setDescription("Total rendimiento neto reducido EO no agricola");
      lrsredempleoeo.setDescription("Reduccion mantenimiento empleo actividades EO no agricola");
      lrsrdttotaleo.setDescription("Rendimiento neto reducido total actividad EO no agricola");
      lrstotalrdtoeoa.setDescription("Total rendimiento neto reducido EO agricola");
      lrsredempleoeoa.setDescription("Reduccion mantenimiento empleo actividades EO agricola");
      lrsrdttotaleoag.setDescription("Rendimiento neto reducido total actividad EO agricola");
      lrsatribmobgral.setDescription("Rendimiento neto cap.mobiliario atribucion b.gral");
      lrsatribmobahor.setDescription("Rendimiento neto cap.mobiliario atribucion b.ahorro");
      lrsatribinmobil.setDescription("Rendimiento neto capital inmobiliario atribucion");
      lrsatribactivid.setDescription("Rendimiento neto actividades atribucion");
      lrsatribgannotr.setDescription("Ganancias atribucion BG total derivada y no derivada transmision");
      lrsatribpernotr.setDescription("Perdidas  atribucion BG total derivada y no derivada transmision");
      lrsatribgantran.setDescription("Ganancias atribucion derivadas de transmision elementos");
      lrsatribpertran.setDescription("Perdidas atribucion derivadas de transmision elementos");
      lrsatribretenci.setDescription("Retenciones atribucion");
      lrsuteimputacio.setDescription("Base imponible imputada UTE");
      lrsuteretencion.setDescription("Retenciones UTE");
      lrstfintimputac.setDescription("Importe imputacion Transparencia fiscal internacional");
      lrsdimagimputac.setDescription("Importe imputacion Derechos de imagen");
      lrsinvcoimputac.setDescription("Importe imputacion Institucion Inversion Colectiva");
      lrsg5bgresganan.setDescription("Base general: gananacias - perdidas, resultado positivo");
      lrsg5bgresperdi.setDescription("Base general: gananacias - perdidas, resultado negativo");
      lrsg5baresganan.setDescription("Base ahorro: gananacias - perdidas, resultado positivo");
      lrsg5baresperdi.setDescription("Base ahorro: gananacias - perdidas, resultado negativo");
      lrsbgperdejantg.setDescription("Base general: perdidas ejer.anterior compensar ganancias");
      lrsbgtotalrdtos.setDescription("Base general: saldo neto rdtos. integrar base gral.");
      lrsbgperdejantb.setDescription("Base general: resto perdidas ej.anter.compensar base (3 ejers.anteriores)");
      lrsbgperdejactb.setDescription("Base general: resto perdidas ej.actual.compensar base");
      lrsbasegeneral.setDescription("Base imponible general");
      lrsbgperdejactp.setDescription("Base imponible general: perdidas ejer.actual pendiente compensar");
      lrsbaperdejantg.setDescription("Base ahorro: perdidas ejer.anterior compensar ganancias");
      lrsbatotrdtoneg.setDescription("Base ahorro: rdtos.negativos a integrar base ahorro");
      lrsbatotrdtopos.setDescription("Base ahorro: rdtos.positivos a integrar base ahorro");
      lrsbaperdejantb.setDescription("Base ahorro: rdtos.negativos ejer.ant. compensar base ahorro");
      lrsbaseahorro.setDescription("Base imponible ahorro");
      lrsbgredconjunt.setDescription("Base general: Reduccion tributacion conjunta");
      lrsbgredfpe.setDescription("Base general: Reduccion aportacion planes pensiones");
      lrsbgredfpc.setDescription("Base general: Reduccion aportacion planes pensiones a favor conyuge");
      lrsbgredfpm.setDescription("Base general: Reduccion aportacion planes pensiones minusvalidos");
      lrsbgredapd.setDescription("Base general: Reduccion aportacion patrimonios protegidos");
      lrsbgredpc.setDescription("Base general: Reduccion pensiones compensatorias");
      lrsbgredpolitic.setDescription("Base general: Reduccion afiliacion partidos politicos");
      lrsbgredfpd.setDescription("Base general: Reduccion aportacion planes pensiones deportistas");
      lrsbaseliqgral.setDescription("Base liquidable general");
      lrsbgbasesant.setDescription("Compensacion bases liquidables negativas anteriores");
      lrsbgraliqgrav.setDescription("Base liquidable general sometida a gravamen");
      lrsbaredconjunt.setDescription("Base ahorro: Reduccion tributacion conjunta");
      lrsbaredpc.setDescription("Base ahorro: Reduccion pensiones compensatorias");
      lrsbaredpolitic.setDescription("Base ahorro: Reduccion afiliacion partidos politicos");
      lrsbaseliqahor.setDescription("Base liquidable ahorro");
      lrsbgminimoest.setDescription("Base liquidable general: minimo personal y familiar a efectos escala estatal");
      lrsbgminimoaut.setDescription("Base liquidable general: minimo personal y familiar a efectos escala autonomica");
      lrsbaminimoest.setDescription("Base liquidable ahorro: minimo personal y familiar a efectos escala estatal");
      lrsbaminimoaut.setDescription("Base liquidable ahorro: minimo personal y familiar a efectos escala autonomica");
      lrscuotaintest.setDescription("Cuota integra estatal");
      lrscuotaintaut.setDescription("Cuota integra autonomica");
      lrsdedvdaest.setDescription("Deduccion vivienda habitual, parte estatal");
      lrsdedvdaaut.setDescription("Deduccion vivienda habitual, parte autonomica");
      lrsdedbicest.setDescription("Deduccion Bienes interes cultural, parte estatal");
      lrsdedbicaut.setDescription("Deduccion Bienes interes cultural, parte autonomica");
      lrsdeddonest.setDescription("Deduccion por donativos, parte estatal");
      lrsdeddonaut.setDescription("Deduccion por donativos, parte autonomica");
      lrsdedempest.setDescription("Deduccion inversion empresarial, parte estatal");
      lrsdedempaut.setDescription("Deduccion inversion empresarial, parte autonomica");
      lrsdedricest.setDescription("Deduccion por dotacion al RIC, parte estatal");
      lrsdedricaut.setDescription("Deduccion por dotacion al RIC, parte autonomica");
      lrsdedpacest.setDescription("Deduccion Bienes producidos Canarias, parte estatal");
      lrsdedpacaut.setDescription("Deduccion Bienes producidos Canarias, parte autonomica");
      lrsdedceuest.setDescription("Deduccion Ceuta o Melilla, parte estatal");
      lrsdedceuaut.setDescription("Deduccion Ceuta o Melilla, parte autonomica");
      lrsdedcheest.setDescription("Deduccion Cuenta ahorro empresa, parte estatal");
      lrsdedcheaut.setDescription("Deduccion Cuenta ahorro empresa, parte autonomica");
      lrsdedavdest.setDescription("Deduccion alquiler vivienda habitual, parte estatal");
      lrsdedavdaut.setDescription("Deduccion alquiler vivienda habitual, parte autonomica");
      lrsdedovdest.setDescription("Deduccion obras vivienda habitual, parte estatal");
      lrstotdedaut.setDescription("Total deducciones autonomicas");
      lrscuotaliqest.setDescription("Cuota liquida estatal");
      lrscuotaliqaut.setDescription("Cuota liquida autonomica");
      lrsperdded1est.setDescription("Importe estatal deduccion anterior a 1997 que se ha perdido derecho");
      lrsperdint1est.setDescription("Importe estatal intereses demora ded. anterior a 1997");
      lrsperdded2est.setDescription("Importe estatal deduccion posterior a 1996 que se ha perdido derecho");
      lrsperdint2est.setDescription("Importe estatal intereses demora ded. posterior a 1996");
      lrsperdded2aut.setDescription("Importe autonomica deduccion posterior a 1996 que se ha perdido derecho");
      lrsperdint2aut.setDescription("Importe autonomica intereses demora ded. posterior a 1996");
      lrsperdded3aut.setDescription("Importe autonomica deduccion posterior a 1997 que se ha perdido derecho");
      lrsperdint3aut.setDescription("Importe autonomica intereses demora ded. posterior a 1997");
      lrscuotliqiest.setDescription("Cuota liquida estatal incrementada");
      lrscuotliqiaut.setDescription("Cuota liquida autonomica incrementada");
      lrscuotaliqinc.setDescription("Cuota liquida incrementada total");
      lrsdeddividend.setDescription("Deduccion doble imposicion de dividendos");
      lrsdedinterext.setDescription("Deduccion doble imposicion internacional por rentas gravadas extranjero");
      lrsdedtrabajo.setDescription("Deduccion obtencion rendimientos del trabajo");
      lrsdedinternac.setDescription("Deduccion doble imposicion internacional");
      lrsdedderimagen.setDescription("Deduccion doble imposicion por derechos imagen");
      lrscompenvda.setDescription("Compensacion fiscal por deduccion vivienda");
      lrscompenmobili.setDescription("Compensacion fiscal por rendimientos capital mobiliario");
      lrsretenbonifi.setDescription("Retenciones por rendimientos bonificados");
      lrscuotaresult.setDescription("Cuota resultante autoliquidacion");
      lrstotalreten.setDescription("Total retenciones");
      lrscuotadiferen.setDescription("Cuota diferencial");
      lrsdedmaternida.setDescription("Deduccion maternidad");
      lrsdedmateranti.setDescription("Deduccion maternidad: importe del abono anticipado");
      lrsdednacimient.setDescription("Deduccion por nacimiento o adopcion");
      lrsdednacimanti.setDescription("Deduccion por nacimiento o adopcion: importe del abono anticipado");
      lrsresultdeclar.setDescription("Resultado declaracion");
      lrsrdtoactceuta.setDescription("Rendimientos actividades CEUTA");
      lrsatribucceuta.setDescription("Atribuciones general CEUTA");
      lrsatribacceuta.setDescription("Atribuciones ahorro  CEUTA");
      lrsimputacceuta.setDescription("Imputaciones reg.especial CEUTA");
      lrsrdtoinmceuta.setDescription("Rdto inmuebles CEUTA");
      lrsbggananceuta.setDescription("Ganancias base general CEUTA");
      lrsbagananceuta.setDescription("Ganancias base ahorro CEUTA");
      lrsprimerpago.setDescription("Importe fraccionado primer  pago");
      lrssegundopago.setDescription("Importe fraccionado segundo pago");
      lrsdedovdest2.setDescription("Deduccion obras vivienda habitual, parte estatal (desde 7/5/11)");
      lrsrednovaacted.setDescription("Reduccion por nueva actividad directa (Art.32.3)");
      lrsdedencest.setDescription("Ded.inversion en empresas nueva creación (acc o particip)");
      lrsbapreferantm.setDescription("Base Ahorro rentas negativas preferentes pdtes compensa mobiliario");
      lrsbapreferantg.setDescription("Base Ahorro rentas negativas preferentes pdtes compensa ganancia");
      lrsbgpreferantg.setDescription("Base Gral   rentas negativas preferentes pdtes compensa ganancia gral");
      lrsg5baresganas.setDescription("BAhorro: ganan-perdida saldo positivo sin preferentes");
      lrsg5baresperds.setDescription("BAhorro: ganan-perdida saldo negativo sin preferentes");
      lrsg5baresganap.setDescription("BAhorro: ganan-perdida saldo positivo preferentes");
      lrsg5baresperdp.setDescription("BAhorro: ganan-perdida saldo negativo preferertes");
      lrsatribgan1bg.setDescription("Atrib.BGral   Ganancias no derivada de transmision elementos");
      lrsatribgan2bg.setDescription("Atrib.BGral   Ganancias derivada de transmision elementos");
      lrsatribper1bg.setDescription("Atrib.BGral   Perdidas no derivada de transmision elementos");
      lrsatribper2bg.setDescription("Atrib.BGral   Perdidas derivada de transmision elementos");
      lrsatribganbas.setDescription("Atrib.BAhorro Ganancias sin preferentes");
      lrsatribganbap.setDescription("Atrib.BAhorro Ganancias preferentes");
      lrsatribperbas.setDescription("Atrib.BAhorro Perdidas sin preferentes");
      lrsatribperbap.setDescription("Atrib.BAhorro Perdidas preferentes");
      lrsbamobipos.setDescription("Mobil BAhorro postivo");
      lrsbamobinegnp.setDescription("Mobil BAhorro negativo no preferentes");
      lrsbamobinegp.setDescription("Mobil BAhorro negativo preferentes");
      lrsbgperdejan1.setDescription("BGral: resto perdida ejercicio anterior.compensar base (-1 ejer)");
      lrsatrmobahos.setDescription("Atrib.BAhorro Mobiliario no preferentes saldo neto");
      lrsatrmobahoppo.setDescription("Atrib.BAhorro Mobiliario preferentes saldo positivo");
      lrsatrmobahopne.setDescription("Atrib.BAhorro Mobiliario preferentes saldo negativo");
      }
    }
    
  public class TabLiquidah extends TableDef
    {
    // Campos
    public FieldDef lhejeraplic;
    public FieldDef lhdeclaran;
    public FieldDef lhmuf;
    public FieldDef lhtipocalculo;
    public FieldDef lhgrestomobiant;
    public FieldDef lhgrestoperdant;
    public FieldDef lhgrestomobiact;
    public FieldDef lhgrestoperdact;
    public FieldDef lhbaperdant;
    public FieldDef lhbamobant;
    public FieldDef lhbaperdact;
    public FieldDef lhbamobiact;
    public FieldDef lhbarestomobant;
    public FieldDef lhbarestoperant;
    public FieldDef lhbgexcesoperd;
    public FieldDef lhbaexcperdnop;
    public FieldDef lhbaexcmobinop;
    public FieldDef lhbaexcesoperd;
    public FieldDef lhbaexcesomobi;
    public TabLiquidah(String name)
      {
      super(name);
      lhejeraplic = new FieldDef("lhejeraplic",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lhdeclaran = new FieldDef("lhdeclaran",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lhmuf = new FieldDef("lhmuf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lhtipocalculo = new FieldDef("lhtipocalculo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      lhgrestomobiant = new FieldDef("lhgrestomobiant",FieldDef.FLOAT,6,0);
      lhgrestoperdant = new FieldDef("lhgrestoperdant",FieldDef.FLOAT,6,0);
      lhgrestomobiact = new FieldDef("lhgrestomobiact",FieldDef.FLOAT,6,0);
      lhgrestoperdact = new FieldDef("lhgrestoperdact",FieldDef.FLOAT,6,0);
      lhbaperdant = new FieldDef("lhbaperdant",FieldDef.FLOAT,6,0);
      lhbamobant = new FieldDef("lhbamobant",FieldDef.FLOAT,6,0);
      lhbaperdact = new FieldDef("lhbaperdact",FieldDef.FLOAT,6,0);
      lhbamobiact = new FieldDef("lhbamobiact",FieldDef.FLOAT,6,0);
      lhbarestomobant = new FieldDef("lhbarestomobant",FieldDef.FLOAT,6,0);
      lhbarestoperant = new FieldDef("lhbarestoperant",FieldDef.FLOAT,6,0);
      lhbgexcesoperd = new FieldDef("lhbgexcesoperd",FieldDef.FLOAT,6,0);
      lhbaexcperdnop = new FieldDef("lhbaexcperdnop",FieldDef.FLOAT,6,0);
      lhbaexcmobinop = new FieldDef("lhbaexcmobinop",FieldDef.FLOAT,6,0);
      lhbaexcesoperd = new FieldDef("lhbaexcesoperd",FieldDef.FLOAT,6,0);
      lhbaexcesomobi = new FieldDef("lhbaexcesomobi",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lhejeraplic,
        lhdeclaran,
        lhmuf,
        lhtipocalculo,
        lhgrestomobiant,
        lhgrestoperdant,
        lhgrestomobiact,
        lhgrestoperdact,
        lhbaperdant,
        lhbamobant,
        lhbaperdact,
        lhbamobiact,
        lhbarestomobant,
        lhbarestoperant,
        lhbgexcesoperd,
        lhbaexcperdnop,
        lhbaexcmobinop,
        lhbaexcesoperd,
        lhbaexcesomobi        
        };
      setColumns(array);
      FieldDef arrayf[] = {lhejeraplic,lhdeclaran,lhmuf,lhtipocalculo };
      setDescription("Apartado H integracion compensacion preferentes");
      setPrimaryKeys(arrayf);
      lhejeraplic.setDescription("Ejercicio aplicacion");
      lhdeclaran.setDescription("Codigo de declarante");
      lhmuf.setDescription("Miembro unidad [T]odos, [D]eclarante, [C]onyuge, [n] nro. miembro");
      lhtipocalculo.setDescription("Tipo calculo: [S]imulacion, [R]eal");
      lhgrestomobiant.setDescription("BGral Resto mobiliario preferentes ejer.anterior a compensar c419");
      lhgrestoperdant.setDescription("BGral Resto perdidas   preferentes ejer.anterior a compensar c420");
      lhgrestomobiact.setDescription("BGral Resto mobiliario preferentes ejer.actual a compensar   c421");
      lhgrestoperdact.setDescription("BGral Resto perdidas   preferentes ejer.actual a compensar   c423");
      lhbaperdant.setDescription("BAhor Perdidas preferentes ejer.anterior a integrar c433");
      lhbamobant.setDescription("BAhor Mobiliario preferent ejer.anterior a integrar c438");
      lhbaperdact.setDescription("BAhor Perdidas preferentes ejer.actual a integrar   c440");
      lhbamobiact.setDescription("BAhor Mobiliario preferent ejer.actual a integrar   c435");
      lhbarestomobant.setDescription("BAhor Resto mobiliario preferentes ej.anter c434");
      lhbarestoperant.setDescription("BAhor Resto perdidas   preferentes ej.anter c439");
      lhbgexcesoperd.setDescription("Exceso pdte BGral perdidas c446");
      lhbaexcperdnop.setDescription("Exceso pdte no preferentes perdidas   c405");
      lhbaexcmobinop.setDescription("Exceso pdte no preferentes mobiliario c406");
      lhbaexcesoperd.setDescription("Exceso pdte preferentes perdidas   c449");
      lhbaexcesomobi.setDescription("Exceso pdte preferentes mobiliario c450");
      }
    }
    
  public CatJrenta()
    {
    tabbds = new TabBds("bds");
    tabgycauto = new TabGycauto("gycauto");
    tabvaloresaplic = new TabValoresaplic("valoresaplic");
    tabbajadeclaran = new TabBajadeclaran("bajadeclaran");
    tabversionzips = new TabVersionzips("versionzips");
    tabmenurenta = new TabMenurenta("menurenta");
    tabseleccion = new TabSeleccion("seleccion");
    tabcabecera = new TabCabecera("cabecera");
    tabestadodeclaran = new TabEstadodeclaran("estadodeclaran");
    tabequivtablas = new TabEquivtablas("equivtablas");
    tabconfigusuario = new TabConfigusuario("configusuario");
    tabquefrase = new TabQuefrase("quefrase");
    tabquevariables = new TabQuevariables("quevariables");
    tabquetabla = new TabQuetabla("quetabla");
    tabquecolumn = new TabQuecolumn("quecolumn");
    tabdocumentos = new TabDocumentos("documentos");
    tabdoccampos = new TabDoccampos("doccampos");
    tabdocdtabla = new TabDocdtabla("docdtabla");
    tabdocfiltro = new TabDocfiltro("docfiltro");
    tabdoclista = new TabDoclista("doclista");
    tabdoctabla = new TabDoctabla("doctabla");
    tabcalautonomia = new TabCalautonomia("calautonomia");
    tabcoeficactual = new TabCoeficactual("coeficactual");
    tabdefvalmobil = new TabDefvalmobil("defvalmobil");
    tabescalasbases = new TabEscalasbases("escalasbases");
    tabdefmodagr = new TabDefmodagr("defmodagr");
    tabdefindiceagr = new TabDefindiceagr("defindiceagr");
    tabdomiextranjero = new TabDomiextranjero("domiextranjero");
    tabinmobcontrato = new TabInmobcontrato("inmobcontrato");
    tabprestvdahabit = new TabPrestvdahabit("prestvdahabit");
    tabhistoramortiz = new TabHistoramortiz("historamortiz");
    tabpagosactivida = new TabPagosactivida("pagosactivida");
    tabdedinvdetalle = new TabDedinvdetalle("dedinvdetalle");
    tabdedgastosid = new TabDedgastosid("dedgastosid");
    tabdedgastosfp = new TabDedgastosfp("dedgastosfp");
    tabdedplanpensione = new TabDedplanpensione("dedplanpensione");
    tabric = new TabRic("ric");
    tabimpututes = new TabImpututes("impututes");
    tabvaladquiactual = new TabValadquiactual("valadquiactual");
    tabcormonetvalcont = new TabCormonetvalcont("cormonetvalcont");
    tabcormonetcoefici = new TabCormonetcoefici("cormonetcoefici");
    tabcormonetdrenta = new TabCormonetdrenta("cormonetdrenta");
    tabdefdeducciones = new TabDefdeducciones("defdeducciones");
    tabhistdedvivienda = new TabHistdedvivienda("histdedvivienda");
    tabdatosfiscales = new TabDatosfiscales("datosfiscales");
    tabaeatactividades = new TabAeatactividades("aeatactividades");
    tabaeatdeducciones = new TabAeatdeducciones("aeatdeducciones");
    tabaeatdomicilios = new TabAeatdomicilios("aeatdomicilios");
    tabaeatmobiliario = new TabAeatmobiliario("aeatmobiliario");
    tabaeatmiembros = new TabAeatmiembros("aeatmiembros");
    tabdatadiconsumo = new TabDatadiconsumo("datadiconsumo");
    tabopciondeclaran = new TabOpciondeclaran("opciondeclaran");
    tabhistorgastos = new TabHistorgastos("historgastos");
    tabliquidaapartl = new TabLiquidaapartl("liquidaapartl");
    tabcarteravalor = new TabCarteravalor("carteravalor");
    tabliquidaapartb2 = new TabLiquidaapartb2("liquidaapartb2");
    tabparamlis = new TabParamlis("paramlis");
    tabpatrima1 = new TabPatrima1("patrima1");
    tabpatrima2 = new TabPatrima2("patrima2");
    tabpatrimb = new TabPatrimb("patrimb");
    tabpatrimc2 = new TabPatrimc2("patrimc2");
    tabpatrimd = new TabPatrimd("patrimd");
    tabpatrimf = new TabPatrimf("patrimf");
    tabpatrimh = new TabPatrimh("patrimh");
    tabpatrimi = new TabPatrimi("patrimi");
    tabpatrimj = new TabPatrimj("patrimj");
    tabpatrimk = new TabPatrimk("patrimk");
    tabpatrimm = new TabPatrimm("patrimm");
    tabpatrimn = new TabPatrimn("patrimn");
    tabpatrimde = new TabPatrimde("patrimde");
    tabpatrime = new TabPatrime("patrime");
    tabpatrimc1 = new TabPatrimc1("patrimc1");
    tabconsumodes = new TabConsumodes("consumodes");
    tabliquidaconsum2 = new TabLiquidaconsum2("liquidaconsum2");
    tabliquidaconsum = new TabLiquidaconsum("liquidaconsum");
    tabescalascab = new TabEscalascab("escalascab");
    tabaeattrabajo = new TabAeattrabajo("aeattrabajo");
    tabaeatatribucion = new TabAeatatribucion("aeatatribucion");
    tabcnvverifcal = new TabCnvverifcal("cnvverifcal");
    tabliquidamensaje = new TabLiquidamensaje("liquidamensaje");
    tabcnvtablas = new TabCnvtablas("cnvtablas");
    tabmuniactualiz = new TabMuniactualiz("muniactualiz");
    tabhistdedobramejo = new TabHistdedobramejo("histdedobramejo");
    tabdeducpendiente = new TabDeducpendiente("deducpendiente");
    tabpatrimres = new TabPatrimres("patrimres");
    tabformapago210 = new TabFormapago210("formapago210");
    tabcarteravalor2 = new TabCarteravalor2("carteravalor2");
    tabobligreal = new TabObligreal("obligreal");
    tabconversion = new TabConversion("conversion");
    tabliquidaaparta2 = new TabLiquidaaparta2("liquidaaparta2");
    tabmobiliario = new TabMobiliario("mobiliario");
    tabfechasacceso = new TabFechasacceso("fechasacceso");
    tabliquidaaparte1 = new TabLiquidaaparte1("liquidaaparte1");
    tabliquidaaparte2 = new TabLiquidaaparte2("liquidaaparte2");
    tabliquidaapartf2 = new TabLiquidaapartf2("liquidaapartf2");
    tabdedemprendedor = new TabDedemprendedor("dedemprendedor");
    tabaeatinmobiliar = new TabAeatinmobiliar("aeatinmobiliar");
    tabfinalizacion = new TabFinalizacion("finalizacion");
    tabenlaexp = new TabEnlaexp("enlaexp");
    tabrdtoactividaed = new TabRdtoactividaed("rdtoactividaed");
    tabliquidaanexoa2 = new TabLiquidaanexoa2("liquidaanexoa2");
    tabdedinversion = new TabDedinversion("dedinversion");
    tabdedcreaempleo = new TabDedcreaempleo("dedcreaempleo");
    tabdedinvcanarias = new TabDedinvcanarias("dedinvcanarias");
    tabliquidaanexoa3 = new TabLiquidaanexoa3("liquidaanexoa3");
    tabotrdatospatrim = new TabOtrdatospatrim("otrdatospatrim");
    tabliquidaapartn = new TabLiquidaapartn("liquidaapartn");
    tabaccesodatos = new TabAccesodatos("accesodatos");
    tabcompenpendiente = new TabCompenpendiente("compenpendiente");
    tabliquidaapartk = new TabLiquidaapartk("liquidaapartk");
    tabcalculo = new TabCalculo("calculo");
    tabmiembrosunidad = new TabMiembrosunidad("miembrosunidad");
    tabliquidaaparta = new TabLiquidaaparta("liquidaaparta");
    tabliquidaanexoa1 = new TabLiquidaanexoa1("liquidaanexoa1");
    tabactividad = new TabActividad("actividad");
    tabrdtoactividaeo = new TabRdtoactividaeo("rdtoactividaeo");
    tabaeatganancias = new TabAeatganancias("aeatganancias");
    tabtrabajopersonal = new TabTrabajopersonal("trabajopersonal");
    tabdeducciones = new TabDeducciones("deducciones");
    tabliquidaapartc = new TabLiquidaapartc("liquidaapartc");
    tabcalculoautonom = new TabCalculoautonom("calculoautonom");
    tabdedinversion2 = new TabDedinversion2("dedinversion2");
    tabliquidaanexoa2a = new TabLiquidaanexoa2a("liquidaanexoa2a");
    tabdeclarante = new TabDeclarante("declarante");
    tabdedcvf = new TabDedcvf("dedcvf");
    tabdatosvivienda = new TabDatosvivienda("datosvivienda");
    tabparamdespacho = new TabParamdespacho("paramdespacho");
    tabinmobdetalle = new TabInmobdetalle("inmobdetalle");
    tabingresosagric = new TabIngresosagric("ingresosagric");
    tabrdtoacteoagric = new TabRdtoacteoagric("rdtoacteoagric");
    tabliquidaanexob2 = new TabLiquidaanexob2("liquidaanexob2");
    tabliquidaanexob3 = new TabLiquidaanexob3("liquidaanexob3");
    tabliquidaanexob4 = new TabLiquidaanexob4("liquidaanexob4");
    tabperdgananmej = new TabPerdgananmej("perdgananmej");
    tabperdganpatrimon = new TabPerdganpatrimon("perdganpatrimon");
    tabliquidaanexob1 = new TabLiquidaanexob1("liquidaanexob1");
    tabliquidag5bgral = new TabLiquidag5bgral("liquidag5bgral");
    tabliquidag5bahor = new TabLiquidag5bahor("liquidag5bahor");
    tabliquidaapartg2 = new TabLiquidaapartg2("liquidaapartg2");
    tabliquidaapartb1 = new TabLiquidaapartb1("liquidaapartb1");
    tabliquidaaparti = new TabLiquidaaparti("liquidaaparti");
    tabinmobiliario = new TabInmobiliario("inmobiliario");
    tabliquidaaparte3 = new TabLiquidaaparte3("liquidaaparte3");
    tabimputatribucion = new TabImputatribucion("imputatribucion");
    tabliquidaapartf1 = new TabLiquidaapartf1("liquidaapartf1");
    tabliquidares = new TabLiquidares("liquidares");
    tabliquidah = new TabLiquidah("liquidah");
    TableDef array[] = {
      tabbds,
      tabgycauto,
      tabvaloresaplic,
      tabbajadeclaran,
      tabversionzips,
      tabmenurenta,
      tabseleccion,
      tabcabecera,
      tabestadodeclaran,
      tabequivtablas,
      tabconfigusuario,
      tabquefrase,
      tabquevariables,
      tabquetabla,
      tabquecolumn,
      tabdocumentos,
      tabdoccampos,
      tabdocdtabla,
      tabdocfiltro,
      tabdoclista,
      tabdoctabla,
      tabcalautonomia,
      tabcoeficactual,
      tabdefvalmobil,
      tabescalasbases,
      tabdefmodagr,
      tabdefindiceagr,
      tabdomiextranjero,
      tabinmobcontrato,
      tabprestvdahabit,
      tabhistoramortiz,
      tabpagosactivida,
      tabdedinvdetalle,
      tabdedgastosid,
      tabdedgastosfp,
      tabdedplanpensione,
      tabric,
      tabimpututes,
      tabvaladquiactual,
      tabcormonetvalcont,
      tabcormonetcoefici,
      tabcormonetdrenta,
      tabdefdeducciones,
      tabhistdedvivienda,
      tabdatosfiscales,
      tabaeatactividades,
      tabaeatdeducciones,
      tabaeatdomicilios,
      tabaeatmobiliario,
      tabaeatmiembros,
      tabdatadiconsumo,
      tabopciondeclaran,
      tabhistorgastos,
      tabliquidaapartl,
      tabcarteravalor,
      tabliquidaapartb2,
      tabparamlis,
      tabpatrima1,
      tabpatrima2,
      tabpatrimb,
      tabpatrimc2,
      tabpatrimd,
      tabpatrimf,
      tabpatrimh,
      tabpatrimi,
      tabpatrimj,
      tabpatrimk,
      tabpatrimm,
      tabpatrimn,
      tabpatrimde,
      tabpatrime,
      tabpatrimc1,
      tabconsumodes,
      tabliquidaconsum2,
      tabliquidaconsum,
      tabescalascab,
      tabaeattrabajo,
      tabaeatatribucion,
      tabcnvverifcal,
      tabliquidamensaje,
      tabcnvtablas,
      tabmuniactualiz,
      tabhistdedobramejo,
      tabdeducpendiente,
      tabpatrimres,
      tabformapago210,
      tabcarteravalor2,
      tabobligreal,
      tabconversion,
      tabliquidaaparta2,
      tabmobiliario,
      tabfechasacceso,
      tabliquidaaparte1,
      tabliquidaaparte2,
      tabliquidaapartf2,
      tabdedemprendedor,
      tabaeatinmobiliar,
      tabfinalizacion,
      tabenlaexp,
      tabrdtoactividaed,
      tabliquidaanexoa2,
      tabdedinversion,
      tabdedcreaempleo,
      tabdedinvcanarias,
      tabliquidaanexoa3,
      tabotrdatospatrim,
      tabliquidaapartn,
      tabaccesodatos,
      tabcompenpendiente,
      tabliquidaapartk,
      tabcalculo,
      tabmiembrosunidad,
      tabliquidaaparta,
      tabliquidaanexoa1,
      tabactividad,
      tabrdtoactividaeo,
      tabaeatganancias,
      tabtrabajopersonal,
      tabdeducciones,
      tabliquidaapartc,
      tabcalculoautonom,
      tabdedinversion2,
      tabliquidaanexoa2a,
      tabdeclarante,
      tabdedcvf,
      tabdatosvivienda,
      tabparamdespacho,
      tabinmobdetalle,
      tabingresosagric,
      tabrdtoacteoagric,
      tabliquidaanexob2,
      tabliquidaanexob3,
      tabliquidaanexob4,
      tabperdgananmej,
      tabperdganpatrimon,
      tabliquidaanexob1,
      tabliquidag5bgral,
      tabliquidag5bahor,
      tabliquidaapartg2,
      tabliquidaapartb1,
      tabliquidaaparti,
      tabinmobiliario,
      tabliquidaaparte3,
      tabimputatribucion,
      tabliquidaapartf1,
      tabliquidares,
      tabliquidah      
      };
    setTables(array);
    FieldDef tabdomiextranjeroArrayf1[] = { tabdomiextranjero.dexejeraplic,tabdomiextranjero.dexdeclaran };
    ForeignKey tabdomiextranjeroArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdomiextranjeroArrayf1)      
      };
    tabdomiextranjero.setForeignKeys(tabdomiextranjeroArrayfk);
    FieldDef tabinmobcontratoArrayf1[] = { tabinmobcontrato.incejeraplic,tabinmobcontrato.incdeclaran,tabinmobcontrato.incidentinmob };
    ForeignKey tabinmobcontratoArrayfk[] = { 
      new ForeignKey(tabinmobiliario,tabinmobcontratoArrayf1)      
      };
    tabinmobcontrato.setForeignKeys(tabinmobcontratoArrayfk);
    FieldDef tabpagosactividaArrayf1[] = { tabpagosactivida.pacejeraplic,tabpagosactivida.pacdeclaran,tabpagosactivida.pacidentactiv };
    ForeignKey tabpagosactividaArrayfk[] = { 
      new ForeignKey(tabactividad,tabpagosactividaArrayf1)      
      };
    tabpagosactivida.setForeignKeys(tabpagosactividaArrayfk);
    FieldDef tabdedinvdetalleArrayf1[] = { tabdedinvdetalle.dieejeraplic,tabdedinvdetalle.diedeclaran };
    ForeignKey tabdedinvdetalleArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdedinvdetalleArrayf1)      
      };
    tabdedinvdetalle.setForeignKeys(tabdedinvdetalleArrayfk);
    FieldDef tabdedgastosidArrayf1[] = { tabdedgastosid.didejeraplic,tabdedgastosid.diddeclaran };
    ForeignKey tabdedgastosidArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdedgastosidArrayf1)      
      };
    tabdedgastosid.setForeignKeys(tabdedgastosidArrayfk);
    FieldDef tabdedgastosfpArrayf1[] = { tabdedgastosfp.dfpejeraplic,tabdedgastosfp.dfpdeclaran };
    ForeignKey tabdedgastosfpArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdedgastosfpArrayf1)      
      };
    tabdedgastosfp.setForeignKeys(tabdedgastosfpArrayfk);
    FieldDef tabdedplanpensioneArrayf1[] = { tabdedplanpensione.dppejeraplic,tabdedplanpensione.dppdeclaran };
    ForeignKey tabdedplanpensioneArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdedplanpensioneArrayf1)      
      };
    tabdedplanpensione.setForeignKeys(tabdedplanpensioneArrayfk);
    FieldDef tabricArrayf1[] = { tabric.ricejeraplic,tabric.ricdeclaran };
    ForeignKey tabricArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabricArrayf1)      
      };
    tabric.setForeignKeys(tabricArrayfk);
    FieldDef tabimpututesArrayf1[] = { tabimpututes.impejeraplic,tabimpututes.impdeclaran };
    ForeignKey tabimpututesArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabimpututesArrayf1)      
      };
    tabimpututes.setForeignKeys(tabimpututesArrayfk);
    FieldDef tabvaladquiactualArrayf1[] = { tabvaladquiactual.vaaejeraplic,tabvaladquiactual.vaadeclaran,tabvaladquiactual.vaaidentgananc };
    ForeignKey tabvaladquiactualArrayfk[] = { 
      new ForeignKey(tabperdganpatrimon,tabvaladquiactualArrayf1)      
      };
    tabvaladquiactual.setForeignKeys(tabvaladquiactualArrayfk);
    FieldDef tabcormonetvalcontArrayf1[] = { tabcormonetvalcont.cmoejeraplic,tabcormonetvalcont.cmodeclaran,tabcormonetvalcont.cmoidentgananc };
    ForeignKey tabcormonetvalcontArrayfk[] = { 
      new ForeignKey(tabperdganpatrimon,tabcormonetvalcontArrayf1)      
      };
    tabcormonetvalcont.setForeignKeys(tabcormonetvalcontArrayfk);
    FieldDef tabcormonetcoeficiArrayf1[] = { tabcormonetcoefici.cmcejeraplic,tabcormonetcoefici.cmcdeclaran,tabcormonetcoefici.cmcidentgananc };
    ForeignKey tabcormonetcoeficiArrayfk[] = { 
      new ForeignKey(tabperdganpatrimon,tabcormonetcoeficiArrayf1)      
      };
    tabcormonetcoefici.setForeignKeys(tabcormonetcoeficiArrayfk);
    FieldDef tabcormonetdrentaArrayf1[] = { tabcormonetdrenta.cmrejeraplic,tabcormonetdrenta.cmrdeclaran,tabcormonetdrenta.cmridentgananc };
    ForeignKey tabcormonetdrentaArrayfk[] = { 
      new ForeignKey(tabperdganpatrimon,tabcormonetdrentaArrayf1)      
      };
    tabcormonetdrenta.setForeignKeys(tabcormonetdrentaArrayfk);
    FieldDef tabdatosfiscalesArrayf1[] = { tabdatosfiscales.dfiejeraplic,tabdatosfiscales.dfideclaran };
    ForeignKey tabdatosfiscalesArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdatosfiscalesArrayf1)      
      };
    tabdatosfiscales.setForeignKeys(tabdatosfiscalesArrayfk);
    FieldDef tabaeatactividadesArrayf1[] = { tabaeatactividades.aacejeraplic,tabaeatactividades.aacdeclaran };
    ForeignKey tabaeatactividadesArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabaeatactividadesArrayf1)      
      };
    tabaeatactividades.setForeignKeys(tabaeatactividadesArrayfk);
    FieldDef tabaeatdeduccionesArrayf1[] = { tabaeatdeducciones.adeejeraplic,tabaeatdeducciones.adedeclaran };
    ForeignKey tabaeatdeduccionesArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabaeatdeduccionesArrayf1)      
      };
    tabaeatdeducciones.setForeignKeys(tabaeatdeduccionesArrayfk);
    FieldDef tabaeatdomiciliosArrayf1[] = { tabaeatdomicilios.adoejeraplic,tabaeatdomicilios.adodeclaran };
    ForeignKey tabaeatdomiciliosArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabaeatdomiciliosArrayf1)      
      };
    tabaeatdomicilios.setForeignKeys(tabaeatdomiciliosArrayfk);
    FieldDef tabaeatmobiliarioArrayf1[] = { tabaeatmobiliario.amoejeraplic,tabaeatmobiliario.amodeclaran };
    ForeignKey tabaeatmobiliarioArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabaeatmobiliarioArrayf1)      
      };
    tabaeatmobiliario.setForeignKeys(tabaeatmobiliarioArrayfk);
    FieldDef tabaeatmiembrosArrayf1[] = { tabaeatmiembros.amiejeraplic,tabaeatmiembros.amideclaran };
    ForeignKey tabaeatmiembrosArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabaeatmiembrosArrayf1)      
      };
    tabaeatmiembros.setForeignKeys(tabaeatmiembrosArrayfk);
    FieldDef tabdatadiconsumoArrayf1[] = { tabdatadiconsumo.dacejeraplic,tabdatadiconsumo.dacdeclaran };
    ForeignKey tabdatadiconsumoArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdatadiconsumoArrayf1)      
      };
    tabdatadiconsumo.setForeignKeys(tabdatadiconsumoArrayfk);
    FieldDef tabopciondeclaranArrayf1[] = { tabopciondeclaran.opdejeraplic,tabopciondeclaran.opddeclaran };
    ForeignKey tabopciondeclaranArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabopciondeclaranArrayf1)      
      };
    tabopciondeclaran.setForeignKeys(tabopciondeclaranArrayfk);
    FieldDef tabhistorgastosArrayf1[] = { tabhistorgastos.hgiejeraplic,tabhistorgastos.hgideclaran,tabhistorgastos.hgiidentinmob };
    ForeignKey tabhistorgastosArrayfk[] = { 
      new ForeignKey(tabinmobiliario,tabhistorgastosArrayf1)      
      };
    tabhistorgastos.setForeignKeys(tabhistorgastosArrayfk);
    FieldDef tabliquidaapartlArrayf1[] = { tabliquidaapartl.lilejeraplic,tabliquidaapartl.lildeclaran };
    ForeignKey tabliquidaapartlArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaapartlArrayf1)      
      };
    tabliquidaapartl.setForeignKeys(tabliquidaapartlArrayfk);
    FieldDef tabcarteravalorArrayf1[] = { tabcarteravalor.carejeraplic,tabcarteravalor.cardeclaran };
    ForeignKey tabcarteravalorArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabcarteravalorArrayf1)      
      };
    tabcarteravalor.setForeignKeys(tabcarteravalorArrayfk);
    FieldDef tabliquidaapartb2Arrayf1[] = { tabliquidaapartb2.lb2ejeraplic,tabliquidaapartb2.lb2declaran };
    ForeignKey tabliquidaapartb2Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaapartb2Arrayf1)      
      };
    tabliquidaapartb2.setForeignKeys(tabliquidaapartb2Arrayfk);
    FieldDef tabpatrima1Arrayf1[] = { tabpatrima1.pa1ejeraplic,tabpatrima1.pa1declaran };
    ForeignKey tabpatrima1Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrima1Arrayf1)      
      };
    tabpatrima1.setForeignKeys(tabpatrima1Arrayfk);
    FieldDef tabpatrima2Arrayf1[] = { tabpatrima2.pa2ejeraplic,tabpatrima2.pa2declaran };
    ForeignKey tabpatrima2Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrima2Arrayf1)      
      };
    tabpatrima2.setForeignKeys(tabpatrima2Arrayfk);
    FieldDef tabpatrimbArrayf1[] = { tabpatrimb.pbejeraplic,tabpatrimb.pbdeclaran };
    ForeignKey tabpatrimbArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimbArrayf1)      
      };
    tabpatrimb.setForeignKeys(tabpatrimbArrayfk);
    FieldDef tabpatrimc2Arrayf1[] = { tabpatrimc2.pc2ejeraplic,tabpatrimc2.pc2declaran };
    ForeignKey tabpatrimc2Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimc2Arrayf1)      
      };
    tabpatrimc2.setForeignKeys(tabpatrimc2Arrayfk);
    FieldDef tabpatrimdArrayf1[] = { tabpatrimd.pdejeraplic,tabpatrimd.pddeclaran };
    ForeignKey tabpatrimdArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimdArrayf1)      
      };
    tabpatrimd.setForeignKeys(tabpatrimdArrayfk);
    FieldDef tabpatrimfArrayf1[] = { tabpatrimf.pfejeraplic,tabpatrimf.pfdeclaran };
    ForeignKey tabpatrimfArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimfArrayf1)      
      };
    tabpatrimf.setForeignKeys(tabpatrimfArrayfk);
    FieldDef tabpatrimhArrayf1[] = { tabpatrimh.phejeraplic,tabpatrimh.phdeclaran };
    ForeignKey tabpatrimhArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimhArrayf1)      
      };
    tabpatrimh.setForeignKeys(tabpatrimhArrayfk);
    FieldDef tabpatrimiArrayf1[] = { tabpatrimi.piejeraplic,tabpatrimi.pideclaran };
    ForeignKey tabpatrimiArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimiArrayf1)      
      };
    tabpatrimi.setForeignKeys(tabpatrimiArrayfk);
    FieldDef tabpatrimjArrayf1[] = { tabpatrimj.pjejeraplic,tabpatrimj.pjdeclaran };
    ForeignKey tabpatrimjArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimjArrayf1)      
      };
    tabpatrimj.setForeignKeys(tabpatrimjArrayfk);
    FieldDef tabpatrimkArrayf1[] = { tabpatrimk.pkejeraplic,tabpatrimk.pkdeclaran };
    ForeignKey tabpatrimkArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimkArrayf1)      
      };
    tabpatrimk.setForeignKeys(tabpatrimkArrayfk);
    FieldDef tabpatrimmArrayf1[] = { tabpatrimm.pmejeraplic,tabpatrimm.pmdeclaran };
    ForeignKey tabpatrimmArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimmArrayf1)      
      };
    tabpatrimm.setForeignKeys(tabpatrimmArrayfk);
    FieldDef tabpatrimnArrayf1[] = { tabpatrimn.pnejeraplic,tabpatrimn.pndeclaran };
    ForeignKey tabpatrimnArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimnArrayf1)      
      };
    tabpatrimn.setForeignKeys(tabpatrimnArrayfk);
    FieldDef tabpatrimdeArrayf1[] = { tabpatrimde.pdeejeraplic,tabpatrimde.pdedeclaran };
    ForeignKey tabpatrimdeArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimdeArrayf1)      
      };
    tabpatrimde.setForeignKeys(tabpatrimdeArrayfk);
    FieldDef tabpatrimeArrayf1[] = { tabpatrime.peejeraplic,tabpatrime.pedeclaran };
    ForeignKey tabpatrimeArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimeArrayf1)      
      };
    tabpatrime.setForeignKeys(tabpatrimeArrayfk);
    FieldDef tabpatrimc1Arrayf1[] = { tabpatrimc1.pc1ejeraplic,tabpatrimc1.pc1declaran };
    ForeignKey tabpatrimc1Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimc1Arrayf1)      
      };
    tabpatrimc1.setForeignKeys(tabpatrimc1Arrayfk);
    FieldDef tabconsumodesArrayf1[] = { tabconsumodes.codejeraplic,tabconsumodes.coddeclaran };
    ForeignKey tabconsumodesArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabconsumodesArrayf1)      
      };
    tabconsumodes.setForeignKeys(tabconsumodesArrayfk);
    FieldDef tabliquidaconsum2Arrayf1[] = { tabliquidaconsum2.lco2ejeraplic,tabliquidaconsum2.lco2declaran };
    ForeignKey tabliquidaconsum2Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaconsum2Arrayf1)      
      };
    tabliquidaconsum2.setForeignKeys(tabliquidaconsum2Arrayfk);
    FieldDef tabliquidaconsumArrayf1[] = { tabliquidaconsum.lcoejeraplic,tabliquidaconsum.lcodeclaran };
    ForeignKey tabliquidaconsumArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaconsumArrayf1)      
      };
    tabliquidaconsum.setForeignKeys(tabliquidaconsumArrayfk);
    FieldDef tabaeattrabajoArrayf1[] = { tabaeattrabajo.atrejeraplic,tabaeattrabajo.atrdeclaran };
    ForeignKey tabaeattrabajoArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabaeattrabajoArrayf1)      
      };
    tabaeattrabajo.setForeignKeys(tabaeattrabajoArrayfk);
    FieldDef tabaeatatribucionArrayf1[] = { tabaeatatribucion.aimejeraplic,tabaeatatribucion.aimdeclaran };
    ForeignKey tabaeatatribucionArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabaeatatribucionArrayf1)      
      };
    tabaeatatribucion.setForeignKeys(tabaeatatribucionArrayfk);
    FieldDef tabliquidamensajeArrayf1[] = { tabliquidamensaje.lmsejeraplic,tabliquidamensaje.lmsdeclaran };
    ForeignKey tabliquidamensajeArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidamensajeArrayf1)      
      };
    tabliquidamensaje.setForeignKeys(tabliquidamensajeArrayfk);
    FieldDef tabpatrimresArrayf1[] = { tabpatrimres.patejeraplic,tabpatrimres.patdeclaran };
    ForeignKey tabpatrimresArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabpatrimresArrayf1)      
      };
    tabpatrimres.setForeignKeys(tabpatrimresArrayfk);
    FieldDef tabformapago210Arrayf1[] = { tabformapago210.fp2ejeraplic,tabformapago210.fp2declaran };
    ForeignKey tabformapago210Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabformapago210Arrayf1)      
      };
    tabformapago210.setForeignKeys(tabformapago210Arrayfk);
    FieldDef tabobligrealArrayf1[] = { tabobligreal.obrejeraplic,tabobligreal.obrdeclaran };
    ForeignKey tabobligrealArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabobligrealArrayf1)      
      };
    tabobligreal.setForeignKeys(tabobligrealArrayfk);
    FieldDef tabliquidaaparta2Arrayf1[] = { tabliquidaaparta2.lia2ejeraplic,tabliquidaaparta2.lia2declaran };
    ForeignKey tabliquidaaparta2Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaaparta2Arrayf1)      
      };
    tabliquidaaparta2.setForeignKeys(tabliquidaaparta2Arrayfk);
    FieldDef tabmobiliarioArrayf1[] = { tabmobiliario.mobejeraplic,tabmobiliario.mobclase };
    FieldDef tabmobiliarioArrayf2[] = { tabmobiliario.mobejeraplic,tabmobiliario.mobdeclaran };
    ForeignKey tabmobiliarioArrayfk[] = { 
      new ForeignKey(tabdefvalmobil,tabmobiliarioArrayf1),
      new ForeignKey(tabdeclarante,tabmobiliarioArrayf2)      
      };
    tabmobiliario.setForeignKeys(tabmobiliarioArrayfk);
    FieldDef tabfechasaccesoArrayf1[] = { tabfechasacceso.fecejeraplic,tabfechasacceso.fecdeclaran };
    ForeignKey tabfechasaccesoArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabfechasaccesoArrayf1)      
      };
    tabfechasacceso.setForeignKeys(tabfechasaccesoArrayfk);
    FieldDef tabliquidaaparte1Arrayf1[] = { tabliquidaaparte1.le1ejeraplic,tabliquidaaparte1.le1declaran };
    ForeignKey tabliquidaaparte1Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaaparte1Arrayf1)      
      };
    tabliquidaaparte1.setForeignKeys(tabliquidaaparte1Arrayfk);
    FieldDef tabliquidaaparte2Arrayf1[] = { tabliquidaaparte2.le2ejeraplic,tabliquidaaparte2.le2declaran };
    ForeignKey tabliquidaaparte2Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaaparte2Arrayf1)      
      };
    tabliquidaaparte2.setForeignKeys(tabliquidaaparte2Arrayfk);
    FieldDef tabliquidaapartf2Arrayf1[] = { tabliquidaapartf2.lf2ejeraplic,tabliquidaapartf2.lf2declaran };
    ForeignKey tabliquidaapartf2Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaapartf2Arrayf1)      
      };
    tabliquidaapartf2.setForeignKeys(tabliquidaapartf2Arrayfk);
    FieldDef tabdedemprendedorArrayf1[] = { tabdedemprendedor.dceejeraplic,tabdedemprendedor.dcedeclaran };
    ForeignKey tabdedemprendedorArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdedemprendedorArrayf1)      
      };
    tabdedemprendedor.setForeignKeys(tabdedemprendedorArrayfk);
    FieldDef tabaeatinmobiliarArrayf1[] = { tabaeatinmobiliar.ainejeraplic,tabaeatinmobiliar.aindeclaran };
    ForeignKey tabaeatinmobiliarArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabaeatinmobiliarArrayf1)      
      };
    tabaeatinmobiliar.setForeignKeys(tabaeatinmobiliarArrayfk);
    FieldDef tabfinalizacionArrayf1[] = { tabfinalizacion.finejeraplic,tabfinalizacion.findeclaran };
    ForeignKey tabfinalizacionArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabfinalizacionArrayf1)      
      };
    tabfinalizacion.setForeignKeys(tabfinalizacionArrayfk);
    FieldDef tabrdtoactividaedArrayf1[] = { tabrdtoactividaed.radejeraplic,tabrdtoactividaed.raddeclaran,tabrdtoactividaed.radidentactiv };
    ForeignKey tabrdtoactividaedArrayfk[] = { 
      new ForeignKey(tabactividad,tabrdtoactividaedArrayf1)      
      };
    tabrdtoactividaed.setForeignKeys(tabrdtoactividaedArrayfk);
    FieldDef tabliquidaanexoa2Arrayf1[] = { tabliquidaanexoa2.la2ejeraplic,tabliquidaanexoa2.la2declaran };
    ForeignKey tabliquidaanexoa2Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaanexoa2Arrayf1)      
      };
    tabliquidaanexoa2.setForeignKeys(tabliquidaanexoa2Arrayfk);
    FieldDef tabdedinversionArrayf1[] = { tabdedinversion.diiejeraplic,tabdedinversion.diideclaran };
    ForeignKey tabdedinversionArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdedinversionArrayf1)      
      };
    tabdedinversion.setForeignKeys(tabdedinversionArrayfk);
    FieldDef tabdedcreaempleoArrayf1[] = { tabdedcreaempleo.dceejeraplic,tabdedcreaempleo.dcedeclaran };
    ForeignKey tabdedcreaempleoArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdedcreaempleoArrayf1)      
      };
    tabdedcreaempleo.setForeignKeys(tabdedcreaempleoArrayfk);
    FieldDef tabdedinvcanariasArrayf1[] = { tabdedinvcanarias.dicejeraplic,tabdedinvcanarias.dicdeclaran };
    ForeignKey tabdedinvcanariasArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdedinvcanariasArrayf1)      
      };
    tabdedinvcanarias.setForeignKeys(tabdedinvcanariasArrayfk);
    FieldDef tabliquidaanexoa3Arrayf1[] = { tabliquidaanexoa3.la3ejeraplic,tabliquidaanexoa3.la3declaran };
    ForeignKey tabliquidaanexoa3Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaanexoa3Arrayf1)      
      };
    tabliquidaanexoa3.setForeignKeys(tabliquidaanexoa3Arrayfk);
    FieldDef tabotrdatospatrimArrayf1[] = { tabotrdatospatrim.otrejeraplic,tabotrdatospatrim.otrdeclaran };
    ForeignKey tabotrdatospatrimArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabotrdatospatrimArrayf1)      
      };
    tabotrdatospatrim.setForeignKeys(tabotrdatospatrimArrayfk);
    FieldDef tabliquidaapartnArrayf1[] = { tabliquidaapartn.linejeraplic,tabliquidaapartn.lindeclaran };
    ForeignKey tabliquidaapartnArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaapartnArrayf1)      
      };
    tabliquidaapartn.setForeignKeys(tabliquidaapartnArrayfk);
    FieldDef tabaccesodatosArrayf1[] = { tabaccesodatos.accejeraplic,tabaccesodatos.accdeclaran };
    ForeignKey tabaccesodatosArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabaccesodatosArrayf1)      
      };
    tabaccesodatos.setForeignKeys(tabaccesodatosArrayfk);
    FieldDef tabcompenpendienteArrayf1[] = { tabcompenpendiente.cpdejeraplic,tabcompenpendiente.cpddeclaran };
    ForeignKey tabcompenpendienteArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabcompenpendienteArrayf1)      
      };
    tabcompenpendiente.setForeignKeys(tabcompenpendienteArrayfk);
    FieldDef tabliquidaapartkArrayf1[] = { tabliquidaapartk.likejeraplic,tabliquidaapartk.likdeclaran };
    ForeignKey tabliquidaapartkArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaapartkArrayf1)      
      };
    tabliquidaapartk.setForeignKeys(tabliquidaapartkArrayfk);
    FieldDef tabmiembrosunidadArrayf1[] = { tabmiembrosunidad.mieejeraplic,tabmiembrosunidad.miedeclaran };
    ForeignKey tabmiembrosunidadArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabmiembrosunidadArrayf1)      
      };
    tabmiembrosunidad.setForeignKeys(tabmiembrosunidadArrayfk);
    FieldDef tabliquidaapartaArrayf1[] = { tabliquidaaparta.liaejeraplic,tabliquidaaparta.liadeclaran };
    ForeignKey tabliquidaapartaArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaapartaArrayf1)      
      };
    tabliquidaaparta.setForeignKeys(tabliquidaapartaArrayfk);
    FieldDef tabliquidaanexoa1Arrayf1[] = { tabliquidaanexoa1.la1ejeraplic,tabliquidaanexoa1.la1declaran };
    ForeignKey tabliquidaanexoa1Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaanexoa1Arrayf1)      
      };
    tabliquidaanexoa1.setForeignKeys(tabliquidaanexoa1Arrayfk);
    FieldDef tabactividadArrayf1[] = { tabactividad.actejeraplic,tabactividad.actdeclaran };
    ForeignKey tabactividadArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabactividadArrayf1)      
      };
    tabactividad.setForeignKeys(tabactividadArrayfk);
    FieldDef tabrdtoactividaeoArrayf1[] = { tabrdtoactividaeo.reoejeraplic,tabrdtoactividaeo.reodeclaran,tabrdtoactividaeo.reoidentactiv };
    ForeignKey tabrdtoactividaeoArrayfk[] = { 
      new ForeignKey(tabactividad,tabrdtoactividaeoArrayf1)      
      };
    tabrdtoactividaeo.setForeignKeys(tabrdtoactividaeoArrayfk);
    FieldDef tabaeatgananciasArrayf1[] = { tabaeatganancias.agaejeraplic,tabaeatganancias.agadeclaran };
    ForeignKey tabaeatgananciasArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabaeatgananciasArrayf1)      
      };
    tabaeatganancias.setForeignKeys(tabaeatgananciasArrayfk);
    FieldDef tabtrabajopersonalArrayf1[] = { tabtrabajopersonal.traejeraplic,tabtrabajopersonal.tradeclaran };
    ForeignKey tabtrabajopersonalArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabtrabajopersonalArrayf1)      
      };
    tabtrabajopersonal.setForeignKeys(tabtrabajopersonalArrayfk);
    FieldDef tabdeduccionesArrayf1[] = { tabdeducciones.dedejeraplic,tabdeducciones.deddeclaran };
    ForeignKey tabdeduccionesArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdeduccionesArrayf1)      
      };
    tabdeducciones.setForeignKeys(tabdeduccionesArrayfk);
    FieldDef tabliquidaapartcArrayf1[] = { tabliquidaapartc.licejeraplic,tabliquidaapartc.licdeclaran };
    ForeignKey tabliquidaapartcArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaapartcArrayf1)      
      };
    tabliquidaapartc.setForeignKeys(tabliquidaapartcArrayfk);
    FieldDef tabdedinversion2Arrayf1[] = { tabdedinversion2.di2ejeraplic,tabdedinversion2.di2declaran };
    ForeignKey tabdedinversion2Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdedinversion2Arrayf1)      
      };
    tabdedinversion2.setForeignKeys(tabdedinversion2Arrayfk);
    FieldDef tabliquidaanexoa2aArrayf1[] = { tabliquidaanexoa2a.laa2ejeraplic,tabliquidaanexoa2a.laa2declaran };
    ForeignKey tabliquidaanexoa2aArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaanexoa2aArrayf1)      
      };
    tabliquidaanexoa2a.setForeignKeys(tabliquidaanexoa2aArrayfk);
    FieldDef tabdatosviviendaArrayf1[] = { tabdatosvivienda.dvdejeraplic,tabdatosvivienda.dvddeclaran };
    ForeignKey tabdatosviviendaArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabdatosviviendaArrayf1)      
      };
    tabdatosvivienda.setForeignKeys(tabdatosviviendaArrayfk);
    FieldDef tabinmobdetalleArrayf1[] = { tabinmobdetalle.indejeraplic,tabinmobdetalle.inddeclaran,tabinmobdetalle.indidentinmob };
    ForeignKey tabinmobdetalleArrayfk[] = { 
      new ForeignKey(tabinmobiliario,tabinmobdetalleArrayf1)      
      };
    tabinmobdetalle.setForeignKeys(tabinmobdetalleArrayfk);
    FieldDef tabingresosagricArrayf1[] = { tabingresosagric.ingejeraplic,tabingresosagric.ingdeclaran };
    FieldDef tabingresosagricArrayf2[] = { tabingresosagric.ingejeraplic,tabingresosagric.ingdeclaran,tabingresosagric.ingidentactiv };
    FieldDef tabingresosagricArrayf3[] = { tabingresosagric.ingejeraplic,tabingresosagric.ingdeclaran,tabingresosagric.ingidentactiv };
    ForeignKey tabingresosagricArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabingresosagricArrayf1),
      new ForeignKey(tabactividad,tabingresosagricArrayf2),
      new ForeignKey(tabrdtoacteoagric,tabingresosagricArrayf3)      
      };
    tabingresosagric.setForeignKeys(tabingresosagricArrayfk);
    FieldDef tabrdtoacteoagricArrayf1[] = { tabrdtoacteoagric.reaejeraplic,tabrdtoacteoagric.readeclaran,tabrdtoacteoagric.reaidentactiv };
    ForeignKey tabrdtoacteoagricArrayfk[] = { 
      new ForeignKey(tabactividad,tabrdtoacteoagricArrayf1)      
      };
    tabrdtoacteoagric.setForeignKeys(tabrdtoacteoagricArrayfk);
    FieldDef tabliquidaanexob2Arrayf1[] = { tabliquidaanexob2.lb2ejeraplic,tabliquidaanexob2.lb2declaran };
    ForeignKey tabliquidaanexob2Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaanexob2Arrayf1)      
      };
    tabliquidaanexob2.setForeignKeys(tabliquidaanexob2Arrayfk);
    FieldDef tabliquidaanexob3Arrayf1[] = { tabliquidaanexob3.lb3ejeraplic,tabliquidaanexob3.lb3declaran };
    ForeignKey tabliquidaanexob3Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaanexob3Arrayf1)      
      };
    tabliquidaanexob3.setForeignKeys(tabliquidaanexob3Arrayfk);
    FieldDef tabliquidaanexob4Arrayf1[] = { tabliquidaanexob4.lb4ejeraplic,tabliquidaanexob4.lb4declaran };
    ForeignKey tabliquidaanexob4Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaanexob4Arrayf1)      
      };
    tabliquidaanexob4.setForeignKeys(tabliquidaanexob4Arrayfk);
    FieldDef tabperdgananmejArrayf1[] = { tabperdgananmej.pgoejeraplic,tabperdgananmej.pgodeclaran,tabperdgananmej.pgoident };
    ForeignKey tabperdgananmejArrayfk[] = { 
      new ForeignKey(tabperdganpatrimon,tabperdgananmejArrayf1)      
      };
    tabperdgananmej.setForeignKeys(tabperdgananmejArrayfk);
    FieldDef tabperdganpatrimonArrayf1[] = { tabperdganpatrimon.pgpejeraplic,tabperdganpatrimon.pgpdeclaran };
    ForeignKey tabperdganpatrimonArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabperdganpatrimonArrayf1)      
      };
    tabperdganpatrimon.setForeignKeys(tabperdganpatrimonArrayfk);
    FieldDef tabliquidaanexob1Arrayf1[] = { tabliquidaanexob1.lb1ejeraplic,tabliquidaanexob1.lb1declaran };
    ForeignKey tabliquidaanexob1Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaanexob1Arrayf1)      
      };
    tabliquidaanexob1.setForeignKeys(tabliquidaanexob1Arrayfk);
    FieldDef tabliquidag5bgralArrayf1[] = { tabliquidag5bgral.lggejeraplic,tabliquidag5bgral.lggdeclaran };
    ForeignKey tabliquidag5bgralArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidag5bgralArrayf1)      
      };
    tabliquidag5bgral.setForeignKeys(tabliquidag5bgralArrayfk);
    FieldDef tabliquidag5bahorArrayf1[] = { tabliquidag5bahor.lgaejeraplic,tabliquidag5bahor.lgadeclaran };
    ForeignKey tabliquidag5bahorArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidag5bahorArrayf1)      
      };
    tabliquidag5bahor.setForeignKeys(tabliquidag5bahorArrayfk);
    FieldDef tabliquidaapartg2Arrayf1[] = { tabliquidaapartg2.lg2ejeraplic,tabliquidaapartg2.lg2declaran };
    ForeignKey tabliquidaapartg2Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaapartg2Arrayf1)      
      };
    tabliquidaapartg2.setForeignKeys(tabliquidaapartg2Arrayfk);
    FieldDef tabliquidaapartb1Arrayf1[] = { tabliquidaapartb1.lb1ejeraplic,tabliquidaapartb1.lb1declaran };
    ForeignKey tabliquidaapartb1Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaapartb1Arrayf1)      
      };
    tabliquidaapartb1.setForeignKeys(tabliquidaapartb1Arrayfk);
    FieldDef tabliquidaapartiArrayf1[] = { tabliquidaaparti.liiejeraplic,tabliquidaaparti.liideclaran };
    ForeignKey tabliquidaapartiArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaapartiArrayf1)      
      };
    tabliquidaaparti.setForeignKeys(tabliquidaapartiArrayfk);
    FieldDef tabinmobiliarioArrayf1[] = { tabinmobiliario.inmejeraplic,tabinmobiliario.inmdeclaran };
    ForeignKey tabinmobiliarioArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabinmobiliarioArrayf1)      
      };
    tabinmobiliario.setForeignKeys(tabinmobiliarioArrayfk);
    FieldDef tabliquidaaparte3Arrayf1[] = { tabliquidaaparte3.le3ejeraplic,tabliquidaaparte3.le3declaran };
    ForeignKey tabliquidaaparte3Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaaparte3Arrayf1)      
      };
    tabliquidaaparte3.setForeignKeys(tabliquidaaparte3Arrayfk);
    FieldDef tabimputatribucionArrayf1[] = { tabimputatribucion.imaejeraplic,tabimputatribucion.imadeclaran };
    ForeignKey tabimputatribucionArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabimputatribucionArrayf1)      
      };
    tabimputatribucion.setForeignKeys(tabimputatribucionArrayfk);
    FieldDef tabliquidaapartf1Arrayf1[] = { tabliquidaapartf1.lf1ejeraplic,tabliquidaapartf1.lf1declaran };
    ForeignKey tabliquidaapartf1Arrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidaapartf1Arrayf1)      
      };
    tabliquidaapartf1.setForeignKeys(tabliquidaapartf1Arrayfk);
    FieldDef tabliquidaresArrayf1[] = { tabliquidares.lrsejeraplic,tabliquidares.lrsdeclaran,tabliquidares.lrsmuf };
    FieldDef tabliquidaresArrayf2[] = { tabliquidares.lrsejeraplic,tabliquidares.lrsdeclaran };
    ForeignKey tabliquidaresArrayfk[] = { 
      new ForeignKey(tabfinalizacion,tabliquidaresArrayf1),
      new ForeignKey(tabdeclarante,tabliquidaresArrayf2)      
      };
    tabliquidares.setForeignKeys(tabliquidaresArrayfk);
    FieldDef tabliquidahArrayf1[] = { tabliquidah.lhejeraplic,tabliquidah.lhdeclaran };
    ForeignKey tabliquidahArrayfk[] = { 
      new ForeignKey(tabdeclarante,tabliquidahArrayf1)      
      };
    tabliquidah.setForeignKeys(tabliquidahArrayfk);
    }
  }
  
