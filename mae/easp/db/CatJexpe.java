// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20121210
// Hora:             09:38:56
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
public class CatJexpe extends Catalog
  {
  // Tablas
  public TabPerfilusuario tabperfilusuario;
  public TabAsesor tabasesor;
  public TabAsesordomi tabasesordomi;
  public TabResponsables tabresponsables;
  public TabResponsperfiles tabresponsperfiles;
  public TabCategorias tabcategorias;
  public TabDepartamento tabdepartamento;
  public TabTipodocs tabtipodocs;
  public TabSubtipodocs tabsubtipodocs;
  public TabAreaservicio tabareaservicio;
  public TabServicio tabservicio;
  public TabTareasservicio tabtareasservicio;
  public TabGestion tabgestion;
  public TabTramite tabtramite;
  public TabTextram tabtextram;
  public TabTarifas tabtarifas;
  public TabTartramite tabtartramite;
  public TabDefexpe tabdefexpe;
  public TabClientes tabclientes;
  public TabClienterel tabclienterel;
  public TabClicontactos tabclicontactos;
  public TabHclicontactos tabhclicontactos;
  public TabDomi tabdomi;
  public TabHdomi tabhdomi;
  public TabCliservicios tabcliservicios;
  public TabClitareas tabclitareas;
  public TabClinotas tabclinotas;
  public TabFitgen tabfitgen;
  public TabFitgenrepres tabfitgenrepres;
  public TabFitgenbancos tabfitgenbancos;
  public TabExpe tabexpe;
  public TabDocumento tabdocumento;
  public TabHdocumento tabhdocumento;
  public TabDocmovimientos tabdocmovimientos;
  public TabDocacciones tabdocacciones;
  public TabDoccopias tabdoccopias;
  public TabValoresexpe tabvaloresexpe;
  public TabQuefrase tabquefrase;
  public TabQuevariables tabquevariables;
  public TabQuetabla tabquetabla;
  public TabQuecolumn tabquecolumn;
  public TabAuxhojas tabauxhojas;
  public TabAuxfielddef tabauxfielddef;
  public TabAuxclientes tabauxclientes;
  public TabAuxexpe tabauxexpe;
  public TabGycauto tabgycauto;
  public TabBds tabbds;
  public TabHclientes tabhclientes;
  public TabHexpe tabhexpe;
  public TabSeries tabseries;
  public TabMovtos tabmovtos;
  public TabHmovtos tabhmovtos;
  public TabMovtotext tabmovtotext;
  public TabHmovtotext tabhmovtotext;
  public TabFactura tabfactura;
  public TabHfactura tabhfactura;
  public TabAbonodet tababonodet;
  public TabHabonodet tabhabonodet;
  public TabAbonohistor tababonohistor;
  public TabAbonotex tababonotex;
  public TabRebuts tabrebuts;
  public TabHrebuts tabhrebuts;
  public TabCaja tabcaja;
  public TabHcaja tabhcaja;
  public TabCajalin tabcajalin;
  public TabHcajalin tabhcajalin;
  public TabDefastos tabdefastos;
  public TabFormatos tabformatos;
  public TabHoras tabhoras;
  public TabObshoras tabobshoras;
  public TabSeleccion tabseleccion;
  public TabObser tabobser;
  public TabFicherosbanco tabficherosbanco;
  public TabParamlis tabparamlis;
  public TabTarnomge tabtarnomge;
  public TabTarifnom tabtarifnom;
  public TabTarnomva tabtarnomva;
  public TabFacnom tabfacnom;
  public TabAuxcab tabauxcab;
  public TabAuxdet tabauxdet;
  public TabAuxrel tabauxrel;
  public TabAuxproc tabauxproc;
  public TabAuxval tabauxval;
  public TabPlantillas tabplantillas;
  public TabCitas tabcitas;
  public TabTipocitas tabtipocitas;
  public TabUsuarioscitas tabusuarioscitas;
  public TabUbicacitas tabubicacitas;
  public TabConversion tabconversion;
  public TabAsientos tabasientos;
  public TabPcuentas tabpcuentas;
  public TabIvacabecera tabivacabecera;
  public TabIvalineas tabivalineas;
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
    
  public class TabAsesor extends TableDef
    {
    // Campos
    public FieldDef asecodi;
    public FieldDef asenif;
    public FieldDef asenombre;
    public FieldDef aseretencion;
    public FieldDef aseporirpf;
    public FieldDef aseurlgeyce;
    public FieldDef asedirecexpe;
    public FieldDef asedirectoriexp;
    public FieldDef asectacli;
    public FieldDef asectapro;
    public FieldDef asectacaja;
    public FieldDef asectagastos;
    public FieldDef asectaiva;
    public FieldDef asectadto;
    public FieldDef asectabanco;
    public FieldDef aseidioma;
    public FieldDef asesctacli;
    public FieldDef asesctapro;
    public FieldDef asesctacaja;
    public FieldDef asesctagastos;
    public FieldDef asesctaiva;
    public FieldDef asesctadto;
    public FieldDef asesctabanco;
    public FieldDef asenumeracion;
    public FieldDef asedevengocobro;
    public FieldDef aseauxcli;
    public FieldDef aseauxcol;
    public FieldDef asemovcaja;
    public FieldDef asemodiffrap;
    public FieldDef asemodifhoras;
    public FieldDef asemodiffrae;
    public FieldDef asegraexpasien;
    public FieldDef aselibre10;
    public FieldDef aseempresa;
    public FieldDef asediario1;
    public FieldDef asediario2;
    public FieldDef aseporiva;
    public FieldDef aseultnum;
    public FieldDef aseultivas;
    public FieldDef aseultfracob;
    public FieldDef aseultrecibo;
    public FieldDef asenumgral1;
    public FieldDef asenumgral2;
    public FieldDef asetipdesgdisco;
    public FieldDef asedesglprovis;
    public FieldDef asetipvenci;
    public FieldDef asecnvpaso01;
    public FieldDef asecnvpaso02;
    public FieldDef asecnvpaso03;
    public FieldDef asecnvpaso04;
    public FieldDef asecnvpaso05;
    public FieldDef asecnvpaso06;
    public FieldDef asecnvpaso07;
    public FieldDef asecnvpaso08;
    public FieldDef asecnvpaso09;
    public FieldDef asecnvpaso10;
    public FieldDef asecnvpaso11;
    public FieldDef asecnvpaso12;
    public FieldDef asecnvpaso13;
    public FieldDef asecnvpaso14;
    public FieldDef asecnvpaso15;
    public FieldDef asecnvpaso16;
    public FieldDef asecnvpaso17;
    public FieldDef asecnvpaso18;
    public FieldDef asecnvpaso19;
    public FieldDef asecnvpaso20;
    public FieldDef asecnvpaso21;
    public FieldDef asecnvpaso22;
    public FieldDef asecnvpaso23;
    public FieldDef asecnvpaso24;
    public FieldDef asecnvpaso25;
    public FieldDef asecnvpaso26;
    public FieldDef asecnvpaso27;
    public FieldDef asecnvpaso28;
    public FieldDef asecnvpaso29;
    public FieldDef asecnvpaso30;
    public FieldDef asedocsfolder;
    public FieldDef asedocsorganiza;
    public FieldDef asectasup;
    public FieldDef asesctasup;
    public FieldDef asectasupiva;
    public FieldDef asesctasupiva;
    public FieldDef asectahon;
    public FieldDef asesctahon;
    public FieldDef asectaivar;
    public FieldDef asesctaivar;
    public FieldDef asectairpf;
    public FieldDef asesctairpf;
    public FieldDef asetipocon;
    public FieldDef asebaseexenta;
    public FieldDef aseporiva02;
    public FieldDef aseporiva03;
    public FieldDef asediainiejer;
    public FieldDef asemesiniejer;
    public FieldDef asediafinejer;
    public FieldDef asemesfinejer;
    public FieldDef asecodiiva;
    public FieldDef asecodiirpf;
    public FieldDef asecodasemaster;
    public FieldDef asedomiasesor;
    public FieldDef asetiponorma;
    public FieldDef asetipocodicli;
    public FieldDef asecodclicount;
    public FieldDef asetipocrearebs;
    public FieldDef asefpago;
    public FieldDef asefpago2;
    public FieldDef aseformfra;
    public FieldDef asemodofactur;
    public FieldDef aseusuario;
    public FieldDef asegrupo;
    public FieldDef asetipoperconsu;
    public TabAsesor(String name)
      {
      super(name);
      asecodi = new FieldDef("asecodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      asenif = new FieldDef("asenif",FieldDef.CHAR,15);
      asenombre = new FieldDef("asenombre",FieldDef.CHAR,50);
      aseretencion = new FieldDef("aseretencion",FieldDef.CHAR,1);
      aseporirpf = new FieldDef("aseporirpf",FieldDef.FLOAT,6,0);
      aseurlgeyce = new FieldDef("aseurlgeyce",FieldDef.CHAR,600);
      asedirecexpe = new FieldDef("asedirecexpe",FieldDef.CHAR,8);
      asedirectoriexp = new FieldDef("asedirectoriexp",FieldDef.CHAR,8);
      asectacli = new FieldDef("asectacli",FieldDef.CHAR,4);
      asectapro = new FieldDef("asectapro",FieldDef.CHAR,4);
      asectacaja = new FieldDef("asectacaja",FieldDef.CHAR,4);
      asectagastos = new FieldDef("asectagastos",FieldDef.CHAR,4);
      asectaiva = new FieldDef("asectaiva",FieldDef.CHAR,4);
      asectadto = new FieldDef("asectadto",FieldDef.CHAR,4);
      asectabanco = new FieldDef("asectabanco",FieldDef.CHAR,4);
      aseidioma = new FieldDef("aseidioma",FieldDef.CHAR,10);
      asesctacli = new FieldDef("asesctacli",FieldDef.CHAR,10);
      asesctapro = new FieldDef("asesctapro",FieldDef.CHAR,10);
      asesctacaja = new FieldDef("asesctacaja",FieldDef.CHAR,10);
      asesctagastos = new FieldDef("asesctagastos",FieldDef.CHAR,10);
      asesctaiva = new FieldDef("asesctaiva",FieldDef.CHAR,10);
      asesctadto = new FieldDef("asesctadto",FieldDef.CHAR,10);
      asesctabanco = new FieldDef("asesctabanco",FieldDef.CHAR,10);
      asenumeracion = new FieldDef("asenumeracion",FieldDef.CHAR,1);
      asedevengocobro = new FieldDef("asedevengocobro",FieldDef.CHAR,1);
      aseauxcli = new FieldDef("aseauxcli",FieldDef.CHAR,15);
      aseauxcol = new FieldDef("aseauxcol",FieldDef.CHAR,15);
      asemovcaja = new FieldDef("asemovcaja",FieldDef.CHAR,1);
      asemodiffrap = new FieldDef("asemodiffrap",FieldDef.CHAR,10);
      asemodifhoras = new FieldDef("asemodifhoras",FieldDef.CHAR,10);
      asemodiffrae = new FieldDef("asemodiffrae",FieldDef.CHAR,10);
      asegraexpasien = new FieldDef("asegraexpasien",FieldDef.CHAR,10);
      aselibre10 = new FieldDef("aselibre10",FieldDef.CHAR,10);
      aseempresa = new FieldDef("aseempresa",FieldDef.INTEGER,0);
      asediario1 = new FieldDef("asediario1",FieldDef.INTEGER,0);
      asediario2 = new FieldDef("asediario2",FieldDef.INTEGER,0);
      aseporiva = new FieldDef("aseporiva",FieldDef.FLOAT,6,0);
      aseultnum = new FieldDef("aseultnum",FieldDef.FLOAT,6,0);
      aseultivas = new FieldDef("aseultivas",FieldDef.FLOAT,6,0);
      aseultfracob = new FieldDef("aseultfracob",FieldDef.FLOAT,6,0);
      aseultrecibo = new FieldDef("aseultrecibo",FieldDef.FLOAT,6,0);
      asenumgral1 = new FieldDef("asenumgral1",FieldDef.FLOAT,6,0);
      asenumgral2 = new FieldDef("asenumgral2",FieldDef.FLOAT,6,0);
      asetipdesgdisco = new FieldDef("asetipdesgdisco",FieldDef.CHAR,1);
      asedesglprovis = new FieldDef("asedesglprovis",FieldDef.CHAR,1);
      asetipvenci = new FieldDef("asetipvenci",FieldDef.CHAR,1);
      asecnvpaso01 = new FieldDef("asecnvpaso01",FieldDef.CHAR,1);
      asecnvpaso02 = new FieldDef("asecnvpaso02",FieldDef.CHAR,1);
      asecnvpaso03 = new FieldDef("asecnvpaso03",FieldDef.CHAR,1);
      asecnvpaso04 = new FieldDef("asecnvpaso04",FieldDef.CHAR,1);
      asecnvpaso05 = new FieldDef("asecnvpaso05",FieldDef.CHAR,1);
      asecnvpaso06 = new FieldDef("asecnvpaso06",FieldDef.CHAR,1);
      asecnvpaso07 = new FieldDef("asecnvpaso07",FieldDef.CHAR,1);
      asecnvpaso08 = new FieldDef("asecnvpaso08",FieldDef.CHAR,1);
      asecnvpaso09 = new FieldDef("asecnvpaso09",FieldDef.CHAR,1);
      asecnvpaso10 = new FieldDef("asecnvpaso10",FieldDef.CHAR,1);
      asecnvpaso11 = new FieldDef("asecnvpaso11",FieldDef.CHAR,1);
      asecnvpaso12 = new FieldDef("asecnvpaso12",FieldDef.CHAR,1);
      asecnvpaso13 = new FieldDef("asecnvpaso13",FieldDef.CHAR,1);
      asecnvpaso14 = new FieldDef("asecnvpaso14",FieldDef.CHAR,1);
      asecnvpaso15 = new FieldDef("asecnvpaso15",FieldDef.CHAR,1);
      asecnvpaso16 = new FieldDef("asecnvpaso16",FieldDef.CHAR,1);
      asecnvpaso17 = new FieldDef("asecnvpaso17",FieldDef.CHAR,1);
      asecnvpaso18 = new FieldDef("asecnvpaso18",FieldDef.CHAR,1);
      asecnvpaso19 = new FieldDef("asecnvpaso19",FieldDef.CHAR,1);
      asecnvpaso20 = new FieldDef("asecnvpaso20",FieldDef.CHAR,1);
      asecnvpaso21 = new FieldDef("asecnvpaso21",FieldDef.CHAR,1);
      asecnvpaso22 = new FieldDef("asecnvpaso22",FieldDef.CHAR,1);
      asecnvpaso23 = new FieldDef("asecnvpaso23",FieldDef.CHAR,1);
      asecnvpaso24 = new FieldDef("asecnvpaso24",FieldDef.CHAR,1);
      asecnvpaso25 = new FieldDef("asecnvpaso25",FieldDef.CHAR,1);
      asecnvpaso26 = new FieldDef("asecnvpaso26",FieldDef.CHAR,1);
      asecnvpaso27 = new FieldDef("asecnvpaso27",FieldDef.CHAR,1);
      asecnvpaso28 = new FieldDef("asecnvpaso28",FieldDef.CHAR,1);
      asecnvpaso29 = new FieldDef("asecnvpaso29",FieldDef.CHAR,1);
      asecnvpaso30 = new FieldDef("asecnvpaso30",FieldDef.CHAR,1);
      asedocsfolder = new FieldDef("asedocsfolder",FieldDef.CHAR,2000);
      asedocsorganiza = new FieldDef("asedocsorganiza",FieldDef.CHAR,2);
      asectasup = new FieldDef("asectasup",FieldDef.CHAR,4);
      asesctasup = new FieldDef("asesctasup",FieldDef.CHAR,10);
      asectasupiva = new FieldDef("asectasupiva",FieldDef.CHAR,4);
      asesctasupiva = new FieldDef("asesctasupiva",FieldDef.CHAR,10);
      asectahon = new FieldDef("asectahon",FieldDef.CHAR,4);
      asesctahon = new FieldDef("asesctahon",FieldDef.CHAR,10);
      asectaivar = new FieldDef("asectaivar",FieldDef.CHAR,4);
      asesctaivar = new FieldDef("asesctaivar",FieldDef.CHAR,10);
      asectairpf = new FieldDef("asectairpf",FieldDef.CHAR,4);
      asesctairpf = new FieldDef("asesctairpf",FieldDef.CHAR,10);
      asetipocon = new FieldDef("asetipocon",FieldDef.CHAR,1);
      asebaseexenta = new FieldDef("asebaseexenta",FieldDef.CHAR,1);
      aseporiva02 = new FieldDef("aseporiva02",FieldDef.FLOAT,6,0);
      aseporiva03 = new FieldDef("aseporiva03",FieldDef.FLOAT,6,0);
      asediainiejer = new FieldDef("asediainiejer",FieldDef.INTEGER,0);
      asemesiniejer = new FieldDef("asemesiniejer",FieldDef.INTEGER,0);
      asediafinejer = new FieldDef("asediafinejer",FieldDef.INTEGER,0);
      asemesfinejer = new FieldDef("asemesfinejer",FieldDef.INTEGER,0);
      asecodiiva = new FieldDef("asecodiiva",FieldDef.INTEGER,0);
      asecodiirpf = new FieldDef("asecodiirpf",FieldDef.INTEGER,0);
      asecodasemaster = new FieldDef("asecodasemaster",FieldDef.INTEGER,0);
      asedomiasesor = new FieldDef("asedomiasesor",FieldDef.INTEGER,0);
      asetiponorma = new FieldDef("asetiponorma",FieldDef.CHAR,2);
      asetipocodicli = new FieldDef("asetipocodicli",FieldDef.CHAR,2);
      asecodclicount = new FieldDef("asecodclicount",FieldDef.INTEGER,0);
      asetipocrearebs = new FieldDef("asetipocrearebs",FieldDef.CHAR,2);
      asefpago = new FieldDef("asefpago",FieldDef.INTEGER,0);
      asefpago2 = new FieldDef("asefpago2",FieldDef.INTEGER,0);
      aseformfra = new FieldDef("aseformfra",FieldDef.CHAR,2);
      asemodofactur = new FieldDef("asemodofactur",FieldDef.CHAR,1);
      aseusuario = new FieldDef("aseusuario",FieldDef.CHAR,25);
      asegrupo = new FieldDef("asegrupo",FieldDef.CHAR,15);
      asetipoperconsu = new FieldDef("asetipoperconsu",FieldDef.CHAR,1);
      FieldDef array[] = {
        asecodi,
        asenif,
        asenombre,
        aseretencion,
        aseporirpf,
        aseurlgeyce,
        asedirecexpe,
        asedirectoriexp,
        asectacli,
        asectapro,
        asectacaja,
        asectagastos,
        asectaiva,
        asectadto,
        asectabanco,
        aseidioma,
        asesctacli,
        asesctapro,
        asesctacaja,
        asesctagastos,
        asesctaiva,
        asesctadto,
        asesctabanco,
        asenumeracion,
        asedevengocobro,
        aseauxcli,
        aseauxcol,
        asemovcaja,
        asemodiffrap,
        asemodifhoras,
        asemodiffrae,
        asegraexpasien,
        aselibre10,
        aseempresa,
        asediario1,
        asediario2,
        aseporiva,
        aseultnum,
        aseultivas,
        aseultfracob,
        aseultrecibo,
        asenumgral1,
        asenumgral2,
        asetipdesgdisco,
        asedesglprovis,
        asetipvenci,
        asecnvpaso01,
        asecnvpaso02,
        asecnvpaso03,
        asecnvpaso04,
        asecnvpaso05,
        asecnvpaso06,
        asecnvpaso07,
        asecnvpaso08,
        asecnvpaso09,
        asecnvpaso10,
        asecnvpaso11,
        asecnvpaso12,
        asecnvpaso13,
        asecnvpaso14,
        asecnvpaso15,
        asecnvpaso16,
        asecnvpaso17,
        asecnvpaso18,
        asecnvpaso19,
        asecnvpaso20,
        asecnvpaso21,
        asecnvpaso22,
        asecnvpaso23,
        asecnvpaso24,
        asecnvpaso25,
        asecnvpaso26,
        asecnvpaso27,
        asecnvpaso28,
        asecnvpaso29,
        asecnvpaso30,
        asedocsfolder,
        asedocsorganiza,
        asectasup,
        asesctasup,
        asectasupiva,
        asesctasupiva,
        asectahon,
        asesctahon,
        asectaivar,
        asesctaivar,
        asectairpf,
        asesctairpf,
        asetipocon,
        asebaseexenta,
        aseporiva02,
        aseporiva03,
        asediainiejer,
        asemesiniejer,
        asediafinejer,
        asemesfinejer,
        asecodiiva,
        asecodiirpf,
        asecodasemaster,
        asedomiasesor,
        asetiponorma,
        asetipocodicli,
        asecodclicount,
        asetipocrearebs,
        asefpago,
        asefpago2,
        aseformfra,
        asemodofactur,
        aseusuario,
        asegrupo,
        asetipoperconsu        
        };
      setColumns(array);
      FieldDef arrayf[] = {asecodi };
      setDescription("Asesores-Despacho");
      setPrimaryKeys(arrayf);
      asecodi.setDescription("Codigo Asesor");
      asenif.setDescription("Nif Asesor");
      asenombre.setDescription("Nombre Assesor-Empresa");
      aseretencion.setDescription("Aplicar Retencion IRPF");
      aseporirpf.setDescription("Porcentaje IRPF");
      aseurlgeyce.setDescription("Directorio datos GEYCE_EXPE");
      asedirecexpe.setDescription("Directorio aplicacion EXPE");
      asedirectoriexp.setDescription("Directorio datos carpeta EXP");
      }
    }
    
  public class TabAsesordomi extends TableDef
    {
    // Campos
    public FieldDef adoasesor;
    public FieldDef adocontador;
    public FieldDef adoentidad;
    public FieldDef adooficina;
    public FieldDef adodigcon;
    public FieldDef adocuenta;
    public FieldDef adonombre;
    public FieldDef adodomicilio;
    public FieldDef adopoblacion;
    public FieldDef adoprovincia;
    public FieldDef adourlbancoe;
    public TabAsesordomi(String name)
      {
      super(name);
      adoasesor = new FieldDef("adoasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      adocontador = new FieldDef("adocontador",FieldDef.INTEGER,0);
      adoentidad = new FieldDef("adoentidad",FieldDef.CHAR,4);
      adooficina = new FieldDef("adooficina",FieldDef.CHAR,4);
      adodigcon = new FieldDef("adodigcon",FieldDef.CHAR,2);
      adocuenta = new FieldDef("adocuenta",FieldDef.CHAR,10);
      adonombre = new FieldDef("adonombre",FieldDef.CHAR,30);
      adodomicilio = new FieldDef("adodomicilio",FieldDef.CHAR,30);
      adopoblacion = new FieldDef("adopoblacion",FieldDef.CHAR,20);
      adoprovincia = new FieldDef("adoprovincia",FieldDef.INTEGER,0);
      adourlbancoe = new FieldDef("adourlbancoe",FieldDef.CHAR,255);
      FieldDef array[] = {
        adoasesor,
        adocontador,
        adoentidad,
        adooficina,
        adodigcon,
        adocuenta,
        adonombre,
        adodomicilio,
        adopoblacion,
        adoprovincia,
        adourlbancoe        
        };
      setColumns(array);
      FieldDef arrayf[] = {adoasesor,adocontador };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabResponsables extends TableDef
    {
    // Campos
    public FieldDef resasesor;
    public FieldDef rescodigo;
    public FieldDef resnombre;
    public FieldDef rescateg;
    public FieldDef resdepar;
    public FieldDef rescoste;
    public FieldDef resusuario;
    public FieldDef resperfil;
    public TabResponsables(String name)
      {
      super(name);
      resasesor = new FieldDef("resasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      rescodigo = new FieldDef("rescodigo",FieldDef.CHAR,25,FieldDef.NOTNULL);
      resnombre = new FieldDef("resnombre",FieldDef.CHAR,50);
      rescateg = new FieldDef("rescateg",FieldDef.CHAR,15);
      resdepar = new FieldDef("resdepar",FieldDef.CHAR,15);
      rescoste = new FieldDef("rescoste",FieldDef.FLOAT,6,0);
      resusuario = new FieldDef("resusuario",FieldDef.CHAR,25);
      resperfil = new FieldDef("resperfil",FieldDef.CHAR,25);
      FieldDef array[] = {
        resasesor,
        rescodigo,
        resnombre,
        rescateg,
        resdepar,
        rescoste,
        resusuario,
        resperfil        
        };
      setColumns(array);
      FieldDef arrayf[] = {resasesor,rescodigo };
      setDescription("Personal Asesoria");
      setPrimaryKeys(arrayf);
      resasesor.setDescription("Codigo Asesor");
      rescodigo.setDescription("Codigo Responsable");
      resnombre.setDescription("Nombre");
      rescateg.setDescription("Codigo Categoria");
      resdepar.setDescription("Codigo Departamento");
      rescoste.setDescription("Coste Hora");
      resusuario.setDescription("Usuario Entorno jEA");
      resperfil.setDescription("Perfil responsable");
      }
    }
    
  public class TabResponsperfiles extends TableDef
    {
    // Campos
    public FieldDef preasesor;
    public FieldDef precodigo;
    public FieldDef preperasever;
    public FieldDef preperasemodif;
    public FieldDef prepercliver;
    public FieldDef preperclinew;
    public FieldDef preperclimodif;
    public FieldDef preperclidel;
    public FieldDef prepercliacumv;
    public FieldDef prepercliacumm;
    public FieldDef preperexpver;
    public FieldDef preperexpnew;
    public FieldDef preperexpmodif;
    public FieldDef preperexpdel;
    public FieldDef preperexpacumv;
    public FieldDef preperexpacumm;
    public FieldDef preperdocver;
    public FieldDef preperdocnew;
    public FieldDef preperdocmodif;
    public FieldDef preperdocdel;
    public FieldDef prepercolver;
    public FieldDef prepercolnew;
    public FieldDef prepercolmodif;
    public FieldDef prepercoldel;
    public FieldDef prepermovver;
    public FieldDef prepermovnew;
    public FieldDef prepermovmodif;
    public FieldDef prepermovdel;
    public FieldDef preperfacver;
    public FieldDef preperfacnew;
    public FieldDef preperfacmodif;
    public FieldDef preperfacdel;
    public FieldDef preperrebver;
    public FieldDef preperrebnew;
    public FieldDef preperrebmodif;
    public FieldDef preperrebdel;
    public FieldDef prepercajver;
    public FieldDef prepercajnew;
    public FieldDef prepercajmodif;
    public FieldDef prepercajdel;
    public TabResponsperfiles(String name)
      {
      super(name);
      preasesor = new FieldDef("preasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      precodigo = new FieldDef("precodigo",FieldDef.CHAR,25,FieldDef.NOTNULL);
      preperasever = new FieldDef("preperasever",FieldDef.CHAR,1);
      preperasemodif = new FieldDef("preperasemodif",FieldDef.CHAR,1);
      prepercliver = new FieldDef("prepercliver",FieldDef.CHAR,1);
      preperclinew = new FieldDef("preperclinew",FieldDef.CHAR,1);
      preperclimodif = new FieldDef("preperclimodif",FieldDef.CHAR,1);
      preperclidel = new FieldDef("preperclidel",FieldDef.CHAR,1);
      prepercliacumv = new FieldDef("prepercliacumv",FieldDef.CHAR,1);
      prepercliacumm = new FieldDef("prepercliacumm",FieldDef.CHAR,1);
      preperexpver = new FieldDef("preperexpver",FieldDef.CHAR,1);
      preperexpnew = new FieldDef("preperexpnew",FieldDef.CHAR,1);
      preperexpmodif = new FieldDef("preperexpmodif",FieldDef.CHAR,1);
      preperexpdel = new FieldDef("preperexpdel",FieldDef.CHAR,1);
      preperexpacumv = new FieldDef("preperexpacumv",FieldDef.CHAR,1);
      preperexpacumm = new FieldDef("preperexpacumm",FieldDef.CHAR,1);
      preperdocver = new FieldDef("preperdocver",FieldDef.CHAR,1);
      preperdocnew = new FieldDef("preperdocnew",FieldDef.CHAR,1);
      preperdocmodif = new FieldDef("preperdocmodif",FieldDef.CHAR,1);
      preperdocdel = new FieldDef("preperdocdel",FieldDef.CHAR,1);
      prepercolver = new FieldDef("prepercolver",FieldDef.CHAR,1);
      prepercolnew = new FieldDef("prepercolnew",FieldDef.CHAR,1);
      prepercolmodif = new FieldDef("prepercolmodif",FieldDef.CHAR,1);
      prepercoldel = new FieldDef("prepercoldel",FieldDef.CHAR,1);
      prepermovver = new FieldDef("prepermovver",FieldDef.CHAR,1);
      prepermovnew = new FieldDef("prepermovnew",FieldDef.CHAR,1);
      prepermovmodif = new FieldDef("prepermovmodif",FieldDef.CHAR,1);
      prepermovdel = new FieldDef("prepermovdel",FieldDef.CHAR,1);
      preperfacver = new FieldDef("preperfacver",FieldDef.CHAR,1);
      preperfacnew = new FieldDef("preperfacnew",FieldDef.CHAR,1);
      preperfacmodif = new FieldDef("preperfacmodif",FieldDef.CHAR,1);
      preperfacdel = new FieldDef("preperfacdel",FieldDef.CHAR,1);
      preperrebver = new FieldDef("preperrebver",FieldDef.CHAR,1);
      preperrebnew = new FieldDef("preperrebnew",FieldDef.CHAR,1);
      preperrebmodif = new FieldDef("preperrebmodif",FieldDef.CHAR,1);
      preperrebdel = new FieldDef("preperrebdel",FieldDef.CHAR,1);
      prepercajver = new FieldDef("prepercajver",FieldDef.CHAR,1);
      prepercajnew = new FieldDef("prepercajnew",FieldDef.CHAR,1);
      prepercajmodif = new FieldDef("prepercajmodif",FieldDef.CHAR,1);
      prepercajdel = new FieldDef("prepercajdel",FieldDef.CHAR,1);
      FieldDef array[] = {
        preasesor,
        precodigo,
        preperasever,
        preperasemodif,
        prepercliver,
        preperclinew,
        preperclimodif,
        preperclidel,
        prepercliacumv,
        prepercliacumm,
        preperexpver,
        preperexpnew,
        preperexpmodif,
        preperexpdel,
        preperexpacumv,
        preperexpacumm,
        preperdocver,
        preperdocnew,
        preperdocmodif,
        preperdocdel,
        prepercolver,
        prepercolnew,
        prepercolmodif,
        prepercoldel,
        prepermovver,
        prepermovnew,
        prepermovmodif,
        prepermovdel,
        preperfacver,
        preperfacnew,
        preperfacmodif,
        preperfacdel,
        preperrebver,
        preperrebnew,
        preperrebmodif,
        preperrebdel,
        prepercajver,
        prepercajnew,
        prepercajmodif,
        prepercajdel        
        };
      setColumns(array);
      FieldDef arrayf[] = {preasesor,precodigo };
      setDescription("Perfiles de los reponsables");
      setPrimaryKeys(arrayf);
      preasesor.setDescription("Codigo Asesor");
      precodigo.setDescription("Codigo perfil");
      preperasever.setDescription("Permiso ver datos despacho");
      preperasemodif.setDescription("Permiso modifciar datos despacho");
      prepercliver.setDescription("Permiso ver datos clientes");
      preperclinew.setDescription("Permiso altas datos clientes");
      preperclimodif.setDescription("Permiso modifciar datos clientes");
      preperclidel.setDescription("Permiso borrar datos clientes");
      prepercliacumv.setDescription("Permiso ver datos ACUMULADOS DEL CLIENTE");
      prepercliacumm.setDescription("Permiso modificar datos ACUMULADOS DEL CLIENTE");
      preperexpver.setDescription("Permiso ver datos expedientes");
      preperexpnew.setDescription("Permiso altas datos expedientes");
      preperexpmodif.setDescription("Permiso modifciar datos expedientes");
      preperexpdel.setDescription("Permiso borrar datos expedientes");
      preperexpacumv.setDescription("Permiso ver datos ACUMULADOS del Expediente");
      preperexpacumm.setDescription("Permiso modificar datos ACUMULADOS del Expediente");
      preperdocver.setDescription("Permiso ver datos documentos");
      preperdocnew.setDescription("Permiso altas datos documentos");
      preperdocmodif.setDescription("Permiso modifciar datos documentos");
      preperdocdel.setDescription("Permiso borrar datos documentos");
      prepercolver.setDescription("Permiso ver datos colaboradores,comercial.representante");
      prepercolnew.setDescription("Permiso altas datos colaboradores,comercial.representante");
      prepercolmodif.setDescription("Permiso modifciar datos colaboradores,comercial.representante");
      prepercoldel.setDescription("Permiso borrar datos colaboradores,comercial.representante");
      prepermovver.setDescription("Permiso ver datos movimientos");
      prepermovnew.setDescription("Permiso altas datos movimientos");
      prepermovmodif.setDescription("Permiso modifciar datos movimientos");
      prepermovdel.setDescription("Permiso borrar datos movimientos");
      preperfacver.setDescription("Permiso ver datos facturas");
      preperfacnew.setDescription("Permiso altas datos facturas");
      preperfacmodif.setDescription("Permiso modifciar datos facturas");
      preperfacdel.setDescription("Permiso borrar datos facturas");
      preperrebver.setDescription("Permiso ver datos recibos");
      preperrebnew.setDescription("Permiso altas datos recibos");
      preperrebmodif.setDescription("Permiso modifciar datos recibos");
      preperrebdel.setDescription("Permiso borrar datos recibos");
      prepercajver.setDescription("Permiso ver datos caja");
      prepercajnew.setDescription("Permiso altas datos caja");
      prepercajmodif.setDescription("Permiso modifciar datos caja");
      prepercajdel.setDescription("Permiso borrar datos caja");
      }
    }
    
  public class TabCategorias extends TableDef
    {
    // Campos
    public FieldDef catasesor;
    public FieldDef catcodigo;
    public FieldDef catdescri;
    public FieldDef catcoste;
    public FieldDef catprecio;
    public FieldDef catcalculo;
    public FieldDef catfecha;
    public FieldDef catgrupo;
    public TabCategorias(String name)
      {
      super(name);
      catasesor = new FieldDef("catasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      catcodigo = new FieldDef("catcodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      catdescri = new FieldDef("catdescri",FieldDef.CHAR,30);
      catcoste = new FieldDef("catcoste",FieldDef.FLOAT,6,0);
      catprecio = new FieldDef("catprecio",FieldDef.FLOAT,6,0);
      catcalculo = new FieldDef("catcalculo",FieldDef.CHAR,1);
      catfecha = new FieldDef("catfecha",FieldDef.DATE);
      catgrupo = new FieldDef("catgrupo",FieldDef.CHAR,15);
      FieldDef array[] = {
        catasesor,
        catcodigo,
        catdescri,
        catcoste,
        catprecio,
        catcalculo,
        catfecha,
        catgrupo        
        };
      setColumns(array);
      FieldDef arrayf[] = {catasesor,catcodigo };
      setDescription("Categorias Asesoria");
      setPrimaryKeys(arrayf);
      catasesor.setDescription("Codigo Asesor");
      catcodigo.setDescription("Codigo Categoria");
      catdescri.setDescription("Descripcion Categoria");
      catcoste.setDescription("Coste Maximo");
      catprecio.setDescription("Precio Hora");
      catcalculo.setDescription("Calculo Horas Completas o Horas y minutos");
      catfecha.setDescription("Fecha Ultima Actualizacion");
      catgrupo.setDescription("Codigo Categoria");
      }
    }
    
  public class TabDepartamento extends TableDef
    {
    // Campos
    public FieldDef depasesor;
    public FieldDef depcodigo;
    public FieldDef depdescri;
    public FieldDef depprecio;
    public FieldDef depcalculo;
    public FieldDef depgrupo;
    public FieldDef depsuperior;
    public TabDepartamento(String name)
      {
      super(name);
      depasesor = new FieldDef("depasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      depcodigo = new FieldDef("depcodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      depdescri = new FieldDef("depdescri",FieldDef.CHAR,30);
      depprecio = new FieldDef("depprecio",FieldDef.FLOAT,6,0);
      depcalculo = new FieldDef("depcalculo",FieldDef.CHAR,1);
      depgrupo = new FieldDef("depgrupo",FieldDef.CHAR,15);
      depsuperior = new FieldDef("depsuperior",FieldDef.CHAR,25);
      FieldDef array[] = {
        depasesor,
        depcodigo,
        depdescri,
        depprecio,
        depcalculo,
        depgrupo,
        depsuperior        
        };
      setColumns(array);
      FieldDef arrayf[] = {depasesor,depcodigo };
      setDescription("Departamentos Asesoria");
      setPrimaryKeys(arrayf);
      depasesor.setDescription("Codigo Asesor");
      depcodigo.setDescription("Codigo Departamento");
      depdescri.setDescription("Descripcion Departamento");
      depprecio.setDescription("Precio Hora");
      depcalculo.setDescription("Calculo Horas Completas o Horas y minutos");
      depgrupo.setDescription("Codigo Grupo");
      depsuperior.setDescription("Responsable del departamento");
      }
    }
    
  public class TabTipodocs extends TableDef
    {
    // Campos
    public FieldDef tdocasesor;
    public FieldDef tdoccodigo;
    public FieldDef tdocdescrip;
    public TabTipodocs(String name)
      {
      super(name);
      tdocasesor = new FieldDef("tdocasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tdoccodigo = new FieldDef("tdoccodigo",FieldDef.CHAR,25,FieldDef.NOTNULL);
      tdocdescrip = new FieldDef("tdocdescrip",FieldDef.CHAR,255);
      FieldDef array[] = {
        tdocasesor,
        tdoccodigo,
        tdocdescrip        
        };
      setColumns(array);
      FieldDef arrayf[] = {tdocasesor,tdoccodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSubtipodocs extends TableDef
    {
    // Campos
    public FieldDef sdocasesor;
    public FieldDef sdoctipo;
    public FieldDef sdoccodigo;
    public FieldDef sdocdescrip;
    public TabSubtipodocs(String name)
      {
      super(name);
      sdocasesor = new FieldDef("sdocasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sdoctipo = new FieldDef("sdoctipo",FieldDef.CHAR,25,FieldDef.NOTNULL);
      sdoccodigo = new FieldDef("sdoccodigo",FieldDef.CHAR,25,FieldDef.NOTNULL);
      sdocdescrip = new FieldDef("sdocdescrip",FieldDef.CHAR,255);
      FieldDef array[] = {
        sdocasesor,
        sdoctipo,
        sdoccodigo,
        sdocdescrip        
        };
      setColumns(array);
      FieldDef arrayf[] = {sdocasesor,sdoctipo,sdoccodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAreaservicio extends TableDef
    {
    // Campos
    public FieldDef areasesor;
    public FieldDef areareaserv;
    public FieldDef aredesc;
    public FieldDef areresponsable;
    public FieldDef aredepar;
    public TabAreaservicio(String name)
      {
      super(name);
      areasesor = new FieldDef("areasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      areareaserv = new FieldDef("areareaserv",FieldDef.CHAR,25,FieldDef.NOTNULL);
      aredesc = new FieldDef("aredesc",FieldDef.CHAR,255);
      areresponsable = new FieldDef("areresponsable",FieldDef.CHAR,25);
      aredepar = new FieldDef("aredepar",FieldDef.CHAR,15);
      FieldDef array[] = {
        areasesor,
        areareaserv,
        aredesc,
        areresponsable,
        aredepar        
        };
      setColumns(array);
      FieldDef arrayf[] = {areasesor,areareaserv };
      setDescription("Areas Servicio Asesor");
      setPrimaryKeys(arrayf);
      areasesor.setDescription("Codigo Asesor");
      areareaserv.setDescription("Codigo Servicio");
      aredesc.setDescription("Descripcion Area Servicio");
      areresponsable.setDescription("Responsable Area");
      aredepar.setDescription("Departamento Area");
      }
    }
    
  public class TabServicio extends TableDef
    {
    // Campos
    public FieldDef serasesor;
    public FieldDef serarea;
    public FieldDef serservicio;
    public FieldDef serdesc;
    public FieldDef serresponsable;
    public FieldDef serperiodicidad;
    public FieldDef serdepar;
    public FieldDef sersuperior;
    public FieldDef serduraesthor;
    public FieldDef serduraestmin;
    public FieldDef serduracion;
    public FieldDef sergestion;
    public FieldDef sertramite;
    public TabServicio(String name)
      {
      super(name);
      serasesor = new FieldDef("serasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      serarea = new FieldDef("serarea",FieldDef.CHAR,25,FieldDef.NOTNULL);
      serservicio = new FieldDef("serservicio",FieldDef.CHAR,25,FieldDef.NOTNULL);
      serdesc = new FieldDef("serdesc",FieldDef.CHAR,255);
      serresponsable = new FieldDef("serresponsable",FieldDef.CHAR,25);
      serperiodicidad = new FieldDef("serperiodicidad",FieldDef.CHAR,1);
      serdepar = new FieldDef("serdepar",FieldDef.CHAR,15);
      sersuperior = new FieldDef("sersuperior",FieldDef.CHAR,25);
      serduraesthor = new FieldDef("serduraesthor",FieldDef.INTEGER,0);
      serduraestmin = new FieldDef("serduraestmin",FieldDef.INTEGER,0);
      serduracion = new FieldDef("serduracion",FieldDef.FLOAT,6,0);
      sergestion = new FieldDef("sergestion",FieldDef.CHAR,15);
      sertramite = new FieldDef("sertramite",FieldDef.INTEGER,0);
      FieldDef array[] = {
        serasesor,
        serarea,
        serservicio,
        serdesc,
        serresponsable,
        serperiodicidad,
        serdepar,
        sersuperior,
        serduraesthor,
        serduraestmin,
        serduracion,
        sergestion,
        sertramite        
        };
      setColumns(array);
      FieldDef arrayf[] = {serasesor,serarea,serservicio };
      setDescription("Servicios Asesor por Area");
      setPrimaryKeys(arrayf);
      serasesor.setDescription("Codigo Asesor");
      serarea.setDescription("Codigo Area Servicio");
      serservicio.setDescription("Codigo Servicio");
      serdesc.setDescription("Descripcion Servicio");
      serresponsable.setDescription("Responsable Servicio");
      serperiodicidad.setDescription("Tipo de periodicidad del servicio");
      serdepar.setDescription("Departamento Servicio");
      sersuperior.setDescription("Superior del Servicio");
      serduraesthor.setDescription("Duracion estimada servicio horas");
      serduraestmin.setDescription("Duracion estimada servicio minutos");
      serduracion.setDescription("Duracion estimada servicio");
      sergestion.setDescription("Codigo Gestion");
      sertramite.setDescription("Codigo Tramite");
      }
    }
    
  public class TabTareasservicio extends TableDef
    {
    // Campos
    public FieldDef treasesor;
    public FieldDef trearea;
    public FieldDef treservicio;
    public FieldDef trecodigo;
    public FieldDef tredesc;
    public FieldDef tresuperior;
    public FieldDef treresponsable;
    public FieldDef treduracion;
    public FieldDef treduraesthor;
    public FieldDef treduraestmin;
    public TabTareasservicio(String name)
      {
      super(name);
      treasesor = new FieldDef("treasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trearea = new FieldDef("trearea",FieldDef.CHAR,25,FieldDef.NOTNULL);
      treservicio = new FieldDef("treservicio",FieldDef.CHAR,25,FieldDef.NOTNULL);
      trecodigo = new FieldDef("trecodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tredesc = new FieldDef("tredesc",FieldDef.CHAR,255);
      tresuperior = new FieldDef("tresuperior",FieldDef.CHAR,25);
      treresponsable = new FieldDef("treresponsable",FieldDef.CHAR,25);
      treduracion = new FieldDef("treduracion",FieldDef.FLOAT,6,0);
      treduraesthor = new FieldDef("treduraesthor",FieldDef.INTEGER,0);
      treduraestmin = new FieldDef("treduraestmin",FieldDef.INTEGER,0);
      FieldDef array[] = {
        treasesor,
        trearea,
        treservicio,
        trecodigo,
        tredesc,
        tresuperior,
        treresponsable,
        treduracion,
        treduraesthor,
        treduraestmin        
        };
      setColumns(array);
      FieldDef arrayf[] = {treasesor,trearea,treservicio,trecodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabGestion extends TableDef
    {
    // Campos
    public FieldDef gesasesor;
    public FieldDef gesgestion;
    public FieldDef gesdesc;
    public FieldDef gesdescamp;
    public FieldDef gesctasup;
    public FieldDef gessctasup;
    public FieldDef gesctasupiva;
    public FieldDef gessctasupiva;
    public FieldDef gesctahon;
    public FieldDef gessctahon;
    public FieldDef gesctaiva;
    public FieldDef gessctaiva;
    public FieldDef gesctairpf;
    public FieldDef gessctairpf;
    public FieldDef gestipocon;
    public FieldDef gesbaseexenta;
    public FieldDef gesivadefecto;
    public FieldDef gesirpfdefecto;
    public TabGestion(String name)
      {
      super(name);
      gesasesor = new FieldDef("gesasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      gesgestion = new FieldDef("gesgestion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      gesdesc = new FieldDef("gesdesc",FieldDef.CHAR,50);
      gesdescamp = new FieldDef("gesdescamp",FieldDef.CHAR,500);
      gesctasup = new FieldDef("gesctasup",FieldDef.CHAR,4);
      gessctasup = new FieldDef("gessctasup",FieldDef.CHAR,10);
      gesctasupiva = new FieldDef("gesctasupiva",FieldDef.CHAR,4);
      gessctasupiva = new FieldDef("gessctasupiva",FieldDef.CHAR,10);
      gesctahon = new FieldDef("gesctahon",FieldDef.CHAR,4);
      gessctahon = new FieldDef("gessctahon",FieldDef.CHAR,10);
      gesctaiva = new FieldDef("gesctaiva",FieldDef.CHAR,4);
      gessctaiva = new FieldDef("gessctaiva",FieldDef.CHAR,10);
      gesctairpf = new FieldDef("gesctairpf",FieldDef.CHAR,4);
      gessctairpf = new FieldDef("gessctairpf",FieldDef.CHAR,10);
      gestipocon = new FieldDef("gestipocon",FieldDef.CHAR,1);
      gesbaseexenta = new FieldDef("gesbaseexenta",FieldDef.CHAR,1);
      gesivadefecto = new FieldDef("gesivadefecto",FieldDef.INTEGER,0);
      gesirpfdefecto = new FieldDef("gesirpfdefecto",FieldDef.INTEGER,0);
      FieldDef array[] = {
        gesasesor,
        gesgestion,
        gesdesc,
        gesdescamp,
        gesctasup,
        gessctasup,
        gesctasupiva,
        gessctasupiva,
        gesctahon,
        gessctahon,
        gesctaiva,
        gessctaiva,
        gesctairpf,
        gessctairpf,
        gestipocon,
        gesbaseexenta,
        gesivadefecto,
        gesirpfdefecto        
        };
      setColumns(array);
      FieldDef arrayf[] = {gesasesor,gesgestion };
      setDescription("Gestiones Asesor");
      setPrimaryKeys(arrayf);
      gesasesor.setDescription("Codigo Asesor");
      gesgestion.setDescription("Codigo Gestion");
      gesdesc.setDescription("Descripcion Gestion");
      gesdescamp.setDescription("Descripcion Ampliada Gestion");
      }
    }
    
  public class TabTramite extends TableDef
    {
    // Campos
    public FieldDef traasesor;
    public FieldDef tragestion;
    public FieldDef tratramite;
    public FieldDef tradesc;
    public FieldDef tradescamp;
    public FieldDef trasuplidos;
    public FieldDef trasuplidosiva;
    public FieldDef trahonorarios;
    public FieldDef traabonos;
    public FieldDef tractasup;
    public FieldDef trasctasup;
    public FieldDef tractasupiva;
    public FieldDef trasctasupiva;
    public FieldDef tractahon;
    public FieldDef trasctahon;
    public FieldDef tractaiva;
    public FieldDef trasctaiva;
    public FieldDef tractairpf;
    public FieldDef trasctairpf;
    public FieldDef tratipocon;
    public FieldDef trabaseexenta;
    public FieldDef traivadefecto;
    public FieldDef trairpfdefecto;
    public TabTramite(String name)
      {
      super(name);
      traasesor = new FieldDef("traasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tragestion = new FieldDef("tragestion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tratramite = new FieldDef("tratramite",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tradesc = new FieldDef("tradesc",FieldDef.CHAR,50);
      tradescamp = new FieldDef("tradescamp",FieldDef.CHAR,500);
      trasuplidos = new FieldDef("trasuplidos",FieldDef.FLOAT,6,0);
      trasuplidosiva = new FieldDef("trasuplidosiva",FieldDef.FLOAT,6,0);
      trahonorarios = new FieldDef("trahonorarios",FieldDef.FLOAT,6,0);
      traabonos = new FieldDef("traabonos",FieldDef.FLOAT,6,0);
      tractasup = new FieldDef("tractasup",FieldDef.CHAR,4);
      trasctasup = new FieldDef("trasctasup",FieldDef.CHAR,10);
      tractasupiva = new FieldDef("tractasupiva",FieldDef.CHAR,4);
      trasctasupiva = new FieldDef("trasctasupiva",FieldDef.CHAR,10);
      tractahon = new FieldDef("tractahon",FieldDef.CHAR,4);
      trasctahon = new FieldDef("trasctahon",FieldDef.CHAR,10);
      tractaiva = new FieldDef("tractaiva",FieldDef.CHAR,4);
      trasctaiva = new FieldDef("trasctaiva",FieldDef.CHAR,10);
      tractairpf = new FieldDef("tractairpf",FieldDef.CHAR,4);
      trasctairpf = new FieldDef("trasctairpf",FieldDef.CHAR,10);
      tratipocon = new FieldDef("tratipocon",FieldDef.CHAR,1);
      trabaseexenta = new FieldDef("trabaseexenta",FieldDef.CHAR,1);
      traivadefecto = new FieldDef("traivadefecto",FieldDef.INTEGER,0);
      trairpfdefecto = new FieldDef("trairpfdefecto",FieldDef.INTEGER,0);
      FieldDef array[] = {
        traasesor,
        tragestion,
        tratramite,
        tradesc,
        tradescamp,
        trasuplidos,
        trasuplidosiva,
        trahonorarios,
        traabonos,
        tractasup,
        trasctasup,
        tractasupiva,
        trasctasupiva,
        tractahon,
        trasctahon,
        tractaiva,
        trasctaiva,
        tractairpf,
        trasctairpf,
        tratipocon,
        trabaseexenta,
        traivadefecto,
        trairpfdefecto        
        };
      setColumns(array);
      FieldDef arrayf[] = {traasesor,tragestion,tratramite };
      setDescription("Tramites Gestion Asesor");
      setPrimaryKeys(arrayf);
      traasesor.setDescription("Codigo Asesor");
      tragestion.setDescription("Codigo Gestion");
      tratramite.setDescription("Codigo Tramite");
      tradesc.setDescription("Descripcion Tramite");
      tradescamp.setDescription("Descripcion Ampliada Tramite");
      }
    }
    
  public class TabTextram extends TableDef
    {
    // Campos
    public FieldDef txtcodigo;
    public FieldDef txtasesor;
    public FieldDef txtgestion;
    public FieldDef txttramite;
    public FieldDef txttexto;
    public TabTextram(String name)
      {
      super(name);
      txtcodigo = new FieldDef("txtcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      txtasesor = new FieldDef("txtasesor",FieldDef.INTEGER,0);
      txtgestion = new FieldDef("txtgestion",FieldDef.CHAR,15);
      txttramite = new FieldDef("txttramite",FieldDef.INTEGER,0);
      txttexto = new FieldDef("txttexto",FieldDef.CHAR,65);
      FieldDef array[] = {
        txtcodigo,
        txtasesor,
        txtgestion,
        txttramite,
        txttexto        
        };
      setColumns(array);
      FieldDef arrayf[] = {txtcodigo };
      setPrimaryKeys(arrayf);
      txtcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabTarifas extends TableDef
    {
    // Campos
    public FieldDef tarasesor;
    public FieldDef tartarifa;
    public FieldDef tardesc;
    public TabTarifas(String name)
      {
      super(name);
      tarasesor = new FieldDef("tarasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tartarifa = new FieldDef("tartarifa",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tardesc = new FieldDef("tardesc",FieldDef.CHAR,50);
      FieldDef array[] = {
        tarasesor,
        tartarifa,
        tardesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {tarasesor,tartarifa };
      setDescription("Tarifas Asesor");
      setPrimaryKeys(arrayf);
      tarasesor.setDescription("Codigo Asesor");
      tartarifa.setDescription("Codigo Tarifa");
      tardesc.setDescription("Descripcion Tarifa");
      }
    }
    
  public class TabTartramite extends TableDef
    {
    // Campos
    public FieldDef ttrasesor;
    public FieldDef ttrgestion;
    public FieldDef ttrtramite;
    public FieldDef ttrtarifa;
    public FieldDef ttrsuplidos;
    public FieldDef ttrsupliva;
    public FieldDef ttrhonorarios;
    public FieldDef ttrabono;
    public TabTartramite(String name)
      {
      super(name);
      ttrasesor = new FieldDef("ttrasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ttrgestion = new FieldDef("ttrgestion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      ttrtramite = new FieldDef("ttrtramite",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ttrtarifa = new FieldDef("ttrtarifa",FieldDef.CHAR,15,FieldDef.NOTNULL);
      ttrsuplidos = new FieldDef("ttrsuplidos",FieldDef.FLOAT,6,0);
      ttrsupliva = new FieldDef("ttrsupliva",FieldDef.FLOAT,6,0);
      ttrhonorarios = new FieldDef("ttrhonorarios",FieldDef.FLOAT,6,0);
      ttrabono = new FieldDef("ttrabono",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ttrasesor,
        ttrgestion,
        ttrtramite,
        ttrtarifa,
        ttrsuplidos,
        ttrsupliva,
        ttrhonorarios,
        ttrabono        
        };
      setColumns(array);
      FieldDef arrayf[] = {ttrasesor,ttrgestion,ttrtramite,ttrtarifa };
      setDescription("Tarifas Tramites Gestion Asesor");
      setPrimaryKeys(arrayf);
      ttrasesor.setDescription("Codigo Asesor");
      ttrgestion.setDescription("Codigo Gestion");
      ttrtramite.setDescription("Codigo Tramite");
      ttrtarifa.setDescription("Codigo Tarifa");
      ttrsuplidos.setDescription("Importe Suplidos");
      ttrsupliva.setDescription("Importe Suplidos con IVA");
      ttrhonorarios.setDescription("Importe Honorarios");
      ttrabono.setDescription("Importe Abonos");
      }
    }
    
  public class TabDefexpe extends TableDef
    {
    // Campos
    public FieldDef dfeasesor;
    public FieldDef dfetipo;
    public FieldDef dfedesc;
    public FieldDef dfenumer;
    public FieldDef dfenum;
    public FieldDef dfenumany;
    public FieldDef dfegestio;
    public FieldDef dfeauxiliar;
    public FieldDef dfectasup;
    public FieldDef dfesctasup;
    public FieldDef dfectasupiva;
    public FieldDef dfesctasupiva;
    public FieldDef dfectahon;
    public FieldDef dfesctahon;
    public FieldDef dfectaiva;
    public FieldDef dfesctaiva;
    public FieldDef dfectairpf;
    public FieldDef dfesctairpf;
    public FieldDef dfetipocon;
    public FieldDef dfebaseexenta;
    public TabDefexpe(String name)
      {
      super(name);
      dfeasesor = new FieldDef("dfeasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dfetipo = new FieldDef("dfetipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      dfedesc = new FieldDef("dfedesc",FieldDef.CHAR,255);
      dfenumer = new FieldDef("dfenumer",FieldDef.CHAR,1);
      dfenum = new FieldDef("dfenum",FieldDef.INTEGER,0);
      dfenumany = new FieldDef("dfenumany",FieldDef.CHAR,1);
      dfegestio = new FieldDef("dfegestio",FieldDef.CHAR,5);
      dfeauxiliar = new FieldDef("dfeauxiliar",FieldDef.CHAR,15);
      dfectasup = new FieldDef("dfectasup",FieldDef.CHAR,4);
      dfesctasup = new FieldDef("dfesctasup",FieldDef.CHAR,10);
      dfectasupiva = new FieldDef("dfectasupiva",FieldDef.CHAR,4);
      dfesctasupiva = new FieldDef("dfesctasupiva",FieldDef.CHAR,10);
      dfectahon = new FieldDef("dfectahon",FieldDef.CHAR,4);
      dfesctahon = new FieldDef("dfesctahon",FieldDef.CHAR,10);
      dfectaiva = new FieldDef("dfectaiva",FieldDef.CHAR,4);
      dfesctaiva = new FieldDef("dfesctaiva",FieldDef.CHAR,10);
      dfectairpf = new FieldDef("dfectairpf",FieldDef.CHAR,4);
      dfesctairpf = new FieldDef("dfesctairpf",FieldDef.CHAR,10);
      dfetipocon = new FieldDef("dfetipocon",FieldDef.CHAR,1);
      dfebaseexenta = new FieldDef("dfebaseexenta",FieldDef.CHAR,1);
      FieldDef array[] = {
        dfeasesor,
        dfetipo,
        dfedesc,
        dfenumer,
        dfenum,
        dfenumany,
        dfegestio,
        dfeauxiliar,
        dfectasup,
        dfesctasup,
        dfectasupiva,
        dfesctasupiva,
        dfectahon,
        dfesctahon,
        dfectaiva,
        dfesctaiva,
        dfectairpf,
        dfesctairpf,
        dfetipocon,
        dfebaseexenta        
        };
      setColumns(array);
      FieldDef arrayf[] = {dfeasesor,dfetipo };
      setDescription("Tipos Expedientes Asesor");
      setPrimaryKeys(arrayf);
      dfeasesor.setDescription("Codigo Asesor");
      dfetipo.setDescription("Tipo Expediente");
      dfedesc.setDescription("Descripcion");
      dfenumer.setDescription("Numeracion General o Particular Expe.");
      dfenum.setDescription("Ultimo Numero Expediente");
      dfenumany.setDescription("Añadir Año a Numero Expediente");
      dfegestio.setDescription("Gestion Habitual");
      dfeauxiliar.setDescription("Archivo Auxiliar");
      }
    }
    
  public class TabClientes extends TableDef
    {
    // Campos
    public FieldDef clasesor;
    public FieldDef clcolectivo;
    public FieldDef clcodigo;
    public FieldDef clprimer;
    public FieldDef clsegundo;
    public FieldDef clnombre;
    public FieldDef clsg;
    public FieldDef clcalle;
    public FieldDef clnumero;
    public FieldDef clescalera;
    public FieldDef clpiso;
    public FieldDef clletra;
    public FieldDef clpoblacion;
    public FieldDef clc_postal;
    public FieldDef clprovincia;
    public FieldDef cltelefono1;
    public FieldDef cltelefono2;
    public FieldDef clcif;
    public FieldDef clgestiones;
    public FieldDef clprovvig;
    public FieldDef clhonorvig;
    public FieldDef clsuplidvig;
    public FieldDef clsupivavig;
    public FieldDef clbasevig;
    public FieldDef clivavig;
    public FieldDef clirpfvig;
    public FieldDef clsaldovig;
    public FieldDef clprovanual;
    public FieldDef clhonoranual;
    public FieldDef clsuplidanual;
    public FieldDef clsupivaanual;
    public FieldDef clbaseanual;
    public FieldDef clivaanual;
    public FieldDef clirpfanual;
    public FieldDef clcalleavis;
    public FieldDef clnumeroavis;
    public FieldDef clescaleraavis;
    public FieldDef clpisoavis;
    public FieldDef clletraavis;
    public FieldDef clpoblacionavis;
    public FieldDef clc_postalavis;
    public FieldDef clprovinciaavis;
    public FieldDef clfpago;
    public FieldDef clresponsable;
    public FieldDef cldescuento;
    public FieldDef clformato;
    public FieldDef cltipocon;
    public FieldDef clirpf;
    public FieldDef clempresa;
    public FieldDef cltarifa;
    public FieldDef clsubcta;
    public FieldDef clrepresentante;
    public FieldDef clcomercial;
    public FieldDef clnombrecomp;
    public FieldDef cldescuentovig;
    public FieldDef cltitavis;
    public FieldDef cldireccomp;
    public FieldDef cldireccompavis;
    public FieldDef cldevengocobro;
    public FieldDef clfax;
    public FieldDef clemail;
    public FieldDef cllibre3;
    public FieldDef clusuario;
    public FieldDef clfechaalta;
    public FieldDef clfechabaja;
    public FieldDef clfechaultfra;
    public FieldDef clinactivo;
    public FieldDef clclimaster;
    public FieldDef clobserv;
    public FieldDef clsgavis;
    public FieldDef clmunicipio;
    public FieldDef clmunicipioavis;
    public FieldDef cldomiciliacion;
    public FieldDef clivadefecto;
    public FieldDef clirpfdefecto;
    public FieldDef cltipofpago;
    public FieldDef cltipodesglbanc;
    public FieldDef cldomiasesor;
    public FieldDef cltiponormadomi;
    public FieldDef clcolaborador;
    public FieldDef clfpago2;
    public FieldDef clporcenirpf;
    public TabClientes(String name)
      {
      super(name);
      clasesor = new FieldDef("clasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      clcolectivo = new FieldDef("clcolectivo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      clcodigo = new FieldDef("clcodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      clprimer = new FieldDef("clprimer",FieldDef.CHAR,60);
      clsegundo = new FieldDef("clsegundo",FieldDef.CHAR,45);
      clnombre = new FieldDef("clnombre",FieldDef.CHAR,30);
      clsg = new FieldDef("clsg",FieldDef.CHAR,2);
      clcalle = new FieldDef("clcalle",FieldDef.CHAR,60);
      clnumero = new FieldDef("clnumero",FieldDef.CHAR,5);
      clescalera = new FieldDef("clescalera",FieldDef.CHAR,2);
      clpiso = new FieldDef("clpiso",FieldDef.CHAR,2);
      clletra = new FieldDef("clletra",FieldDef.CHAR,2);
      clpoblacion = new FieldDef("clpoblacion",FieldDef.CHAR,30);
      clc_postal = new FieldDef("clc_postal",FieldDef.CHAR,7);
      clprovincia = new FieldDef("clprovincia",FieldDef.INTEGER,0);
      cltelefono1 = new FieldDef("cltelefono1",FieldDef.CHAR,12);
      cltelefono2 = new FieldDef("cltelefono2",FieldDef.CHAR,12);
      clcif = new FieldDef("clcif",FieldDef.CHAR,15);
      clgestiones = new FieldDef("clgestiones",FieldDef.CHAR,50);
      clprovvig = new FieldDef("clprovvig",FieldDef.FLOAT,6,0);
      clhonorvig = new FieldDef("clhonorvig",FieldDef.FLOAT,6,0);
      clsuplidvig = new FieldDef("clsuplidvig",FieldDef.FLOAT,6,0);
      clsupivavig = new FieldDef("clsupivavig",FieldDef.FLOAT,6,0);
      clbasevig = new FieldDef("clbasevig",FieldDef.FLOAT,6,0);
      clivavig = new FieldDef("clivavig",FieldDef.FLOAT,6,0);
      clirpfvig = new FieldDef("clirpfvig",FieldDef.FLOAT,6,0);
      clsaldovig = new FieldDef("clsaldovig",FieldDef.FLOAT,6,0);
      clprovanual = new FieldDef("clprovanual",FieldDef.FLOAT,6,0);
      clhonoranual = new FieldDef("clhonoranual",FieldDef.FLOAT,6,0);
      clsuplidanual = new FieldDef("clsuplidanual",FieldDef.FLOAT,6,0);
      clsupivaanual = new FieldDef("clsupivaanual",FieldDef.FLOAT,6,0);
      clbaseanual = new FieldDef("clbaseanual",FieldDef.FLOAT,6,0);
      clivaanual = new FieldDef("clivaanual",FieldDef.FLOAT,6,0);
      clirpfanual = new FieldDef("clirpfanual",FieldDef.FLOAT,6,0);
      clcalleavis = new FieldDef("clcalleavis",FieldDef.CHAR,60);
      clnumeroavis = new FieldDef("clnumeroavis",FieldDef.CHAR,5);
      clescaleraavis = new FieldDef("clescaleraavis",FieldDef.CHAR,2);
      clpisoavis = new FieldDef("clpisoavis",FieldDef.CHAR,2);
      clletraavis = new FieldDef("clletraavis",FieldDef.CHAR,2);
      clpoblacionavis = new FieldDef("clpoblacionavis",FieldDef.CHAR,30);
      clc_postalavis = new FieldDef("clc_postalavis",FieldDef.CHAR,7);
      clprovinciaavis = new FieldDef("clprovinciaavis",FieldDef.INTEGER,0);
      clfpago = new FieldDef("clfpago",FieldDef.INTEGER,0);
      clresponsable = new FieldDef("clresponsable",FieldDef.CHAR,25);
      cldescuento = new FieldDef("cldescuento",FieldDef.FLOAT,6,0);
      clformato = new FieldDef("clformato",FieldDef.CHAR,2);
      cltipocon = new FieldDef("cltipocon",FieldDef.INTEGER,0);
      clirpf = new FieldDef("clirpf",FieldDef.CHAR,1);
      clempresa = new FieldDef("clempresa",FieldDef.INTEGER,0);
      cltarifa = new FieldDef("cltarifa",FieldDef.CHAR,15);
      clsubcta = new FieldDef("clsubcta",FieldDef.CHAR,10);
      clrepresentante = new FieldDef("clrepresentante",FieldDef.CHAR,3);
      clcomercial = new FieldDef("clcomercial",FieldDef.CHAR,3);
      clnombrecomp = new FieldDef("clnombrecomp",FieldDef.CHAR,120);
      cldescuentovig = new FieldDef("cldescuentovig",FieldDef.FLOAT,6,0);
      cltitavis = new FieldDef("cltitavis",FieldDef.CHAR,60);
      cldireccomp = new FieldDef("cldireccomp",FieldDef.CHAR,120);
      cldireccompavis = new FieldDef("cldireccompavis",FieldDef.CHAR,120);
      cldevengocobro = new FieldDef("cldevengocobro",FieldDef.CHAR,1);
      clfax = new FieldDef("clfax",FieldDef.CHAR,12);
      clemail = new FieldDef("clemail",FieldDef.CHAR,80);
      cllibre3 = new FieldDef("cllibre3",FieldDef.CHAR,10);
      clusuario = new FieldDef("clusuario",FieldDef.CHAR,25);
      clfechaalta = new FieldDef("clfechaalta",FieldDef.DATE);
      clfechabaja = new FieldDef("clfechabaja",FieldDef.DATE);
      clfechaultfra = new FieldDef("clfechaultfra",FieldDef.DATE);
      clinactivo = new FieldDef("clinactivo",FieldDef.CHAR,1);
      clclimaster = new FieldDef("clclimaster",FieldDef.CHAR,1);
      clobserv = new FieldDef("clobserv",FieldDef.CHAR,2000);
      clsgavis = new FieldDef("clsgavis",FieldDef.CHAR,2);
      clmunicipio = new FieldDef("clmunicipio",FieldDef.INTEGER,0);
      clmunicipioavis = new FieldDef("clmunicipioavis",FieldDef.INTEGER,0);
      cldomiciliacion = new FieldDef("cldomiciliacion",FieldDef.INTEGER,0);
      clivadefecto = new FieldDef("clivadefecto",FieldDef.INTEGER,0);
      clirpfdefecto = new FieldDef("clirpfdefecto",FieldDef.INTEGER,0);
      cltipofpago = new FieldDef("cltipofpago",FieldDef.CHAR,2);
      cltipodesglbanc = new FieldDef("cltipodesglbanc",FieldDef.CHAR,1);
      cldomiasesor = new FieldDef("cldomiasesor",FieldDef.INTEGER,0);
      cltiponormadomi = new FieldDef("cltiponormadomi",FieldDef.CHAR,2);
      clcolaborador = new FieldDef("clcolaborador",FieldDef.CHAR,15);
      clfpago2 = new FieldDef("clfpago2",FieldDef.INTEGER,0);
      clporcenirpf = new FieldDef("clporcenirpf",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        clasesor,
        clcolectivo,
        clcodigo,
        clprimer,
        clsegundo,
        clnombre,
        clsg,
        clcalle,
        clnumero,
        clescalera,
        clpiso,
        clletra,
        clpoblacion,
        clc_postal,
        clprovincia,
        cltelefono1,
        cltelefono2,
        clcif,
        clgestiones,
        clprovvig,
        clhonorvig,
        clsuplidvig,
        clsupivavig,
        clbasevig,
        clivavig,
        clirpfvig,
        clsaldovig,
        clprovanual,
        clhonoranual,
        clsuplidanual,
        clsupivaanual,
        clbaseanual,
        clivaanual,
        clirpfanual,
        clcalleavis,
        clnumeroavis,
        clescaleraavis,
        clpisoavis,
        clletraavis,
        clpoblacionavis,
        clc_postalavis,
        clprovinciaavis,
        clfpago,
        clresponsable,
        cldescuento,
        clformato,
        cltipocon,
        clirpf,
        clempresa,
        cltarifa,
        clsubcta,
        clrepresentante,
        clcomercial,
        clnombrecomp,
        cldescuentovig,
        cltitavis,
        cldireccomp,
        cldireccompavis,
        cldevengocobro,
        clfax,
        clemail,
        cllibre3,
        clusuario,
        clfechaalta,
        clfechabaja,
        clfechaultfra,
        clinactivo,
        clclimaster,
        clobserv,
        clsgavis,
        clmunicipio,
        clmunicipioavis,
        cldomiciliacion,
        clivadefecto,
        clirpfdefecto,
        cltipofpago,
        cltipodesglbanc,
        cldomiasesor,
        cltiponormadomi,
        clcolaborador,
        clfpago2,
        clporcenirpf        
        };
      setColumns(array);
      FieldDef arrayf[] = {clasesor,clcolectivo,clcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabClienterel extends TableDef
    {
    // Campos
    public FieldDef crasesor;
    public FieldDef crcliente;
    public FieldDef crclienterel;
    public TabClienterel(String name)
      {
      super(name);
      crasesor = new FieldDef("crasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      crcliente = new FieldDef("crcliente",FieldDef.CHAR,15,FieldDef.NOTNULL);
      crclienterel = new FieldDef("crclienterel",FieldDef.CHAR,15,FieldDef.NOTNULL);
      FieldDef array[] = {
        crasesor,
        crcliente,
        crclienterel        
        };
      setColumns(array);
      FieldDef arrayf[] = {crasesor,crcliente,crclienterel };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabClicontactos extends TableDef
    {
    // Campos
    public FieldDef cctasesor;
    public FieldDef cctcolectivo;
    public FieldDef cctcliente;
    public FieldDef cctcodigo;
    public FieldDef cctnombre;
    public FieldDef ccttelefono;
    public FieldDef cctextension;
    public FieldDef cctmobil;
    public FieldDef cctemail;
    public FieldDef cctcargo;
    public FieldDef cctdepart;
    public FieldDef cctuserafinity;
    public TabClicontactos(String name)
      {
      super(name);
      cctasesor = new FieldDef("cctasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cctcolectivo = new FieldDef("cctcolectivo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cctcliente = new FieldDef("cctcliente",FieldDef.CHAR,15,FieldDef.NOTNULL);
      cctcodigo = new FieldDef("cctcodigo",FieldDef.CHAR,25,FieldDef.NOTNULL);
      cctnombre = new FieldDef("cctnombre",FieldDef.CHAR,75);
      ccttelefono = new FieldDef("ccttelefono",FieldDef.CHAR,12);
      cctextension = new FieldDef("cctextension",FieldDef.CHAR,12);
      cctmobil = new FieldDef("cctmobil",FieldDef.CHAR,12);
      cctemail = new FieldDef("cctemail",FieldDef.CHAR,80);
      cctcargo = new FieldDef("cctcargo",FieldDef.CHAR,40);
      cctdepart = new FieldDef("cctdepart",FieldDef.CHAR,40);
      cctuserafinity = new FieldDef("cctuserafinity",FieldDef.CHAR,20);
      FieldDef array[] = {
        cctasesor,
        cctcolectivo,
        cctcliente,
        cctcodigo,
        cctnombre,
        ccttelefono,
        cctextension,
        cctmobil,
        cctemail,
        cctcargo,
        cctdepart,
        cctuserafinity        
        };
      setColumns(array);
      FieldDef arrayf[] = {cctasesor,cctcolectivo,cctcliente,cctcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabHclicontactos extends TableDef
    {
    // Campos
    public FieldDef hctasesor;
    public FieldDef hctcolectivo;
    public FieldDef hctcliente;
    public FieldDef hctcodigo;
    public FieldDef hctnombre;
    public FieldDef hcttelefono;
    public FieldDef hctextension;
    public FieldDef hctmobil;
    public FieldDef hctemail;
    public FieldDef hctcargo;
    public FieldDef hctdepart;
    public FieldDef hctuserafinity;
    public TabHclicontactos(String name)
      {
      super(name);
      hctasesor = new FieldDef("hctasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hctcolectivo = new FieldDef("hctcolectivo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hctcliente = new FieldDef("hctcliente",FieldDef.CHAR,15,FieldDef.NOTNULL);
      hctcodigo = new FieldDef("hctcodigo",FieldDef.CHAR,25,FieldDef.NOTNULL);
      hctnombre = new FieldDef("hctnombre",FieldDef.CHAR,75);
      hcttelefono = new FieldDef("hcttelefono",FieldDef.CHAR,12);
      hctextension = new FieldDef("hctextension",FieldDef.CHAR,12);
      hctmobil = new FieldDef("hctmobil",FieldDef.CHAR,12);
      hctemail = new FieldDef("hctemail",FieldDef.CHAR,80);
      hctcargo = new FieldDef("hctcargo",FieldDef.CHAR,40);
      hctdepart = new FieldDef("hctdepart",FieldDef.CHAR,40);
      hctuserafinity = new FieldDef("hctuserafinity",FieldDef.CHAR,20);
      FieldDef array[] = {
        hctasesor,
        hctcolectivo,
        hctcliente,
        hctcodigo,
        hctnombre,
        hcttelefono,
        hctextension,
        hctmobil,
        hctemail,
        hctcargo,
        hctdepart,
        hctuserafinity        
        };
      setColumns(array);
      FieldDef arrayf[] = {hctasesor,hctcolectivo,hctcliente,hctcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDomi extends TableDef
    {
    // Campos
    public FieldDef doasesor;
    public FieldDef docolectivo;
    public FieldDef docliente;
    public FieldDef docontador;
    public FieldDef dobanco;
    public FieldDef donombre;
    public FieldDef dodomicilio;
    public FieldDef dopoblacion;
    public FieldDef doprovincia;
    public FieldDef doentidad;
    public FieldDef dooficina;
    public FieldDef dodigcon;
    public FieldDef docuenta;
    public TabDomi(String name)
      {
      super(name);
      doasesor = new FieldDef("doasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      docolectivo = new FieldDef("docolectivo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      docliente = new FieldDef("docliente",FieldDef.CHAR,15);
      docontador = new FieldDef("docontador",FieldDef.INTEGER,0);
      dobanco = new FieldDef("dobanco",FieldDef.CHAR,4);
      donombre = new FieldDef("donombre",FieldDef.CHAR,30);
      dodomicilio = new FieldDef("dodomicilio",FieldDef.CHAR,30);
      dopoblacion = new FieldDef("dopoblacion",FieldDef.CHAR,20);
      doprovincia = new FieldDef("doprovincia",FieldDef.INTEGER,0);
      doentidad = new FieldDef("doentidad",FieldDef.CHAR,4);
      dooficina = new FieldDef("dooficina",FieldDef.CHAR,4);
      dodigcon = new FieldDef("dodigcon",FieldDef.CHAR,2);
      docuenta = new FieldDef("docuenta",FieldDef.CHAR,10);
      FieldDef array[] = {
        doasesor,
        docolectivo,
        docliente,
        docontador,
        dobanco,
        donombre,
        dodomicilio,
        dopoblacion,
        doprovincia,
        doentidad,
        dooficina,
        dodigcon,
        docuenta        
        };
      setColumns(array);
      FieldDef arrayf[] = {doasesor,docolectivo,docliente,docontador };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabHdomi extends TableDef
    {
    // Campos
    public FieldDef hoasesor;
    public FieldDef hocolectivo;
    public FieldDef hocliente;
    public FieldDef hocontador;
    public FieldDef hobanco;
    public FieldDef honombre;
    public FieldDef hodomicilio;
    public FieldDef hopoblacion;
    public FieldDef hoprovincia;
    public FieldDef hoentidad;
    public FieldDef hooficina;
    public FieldDef hodigcon;
    public FieldDef hocuenta;
    public TabHdomi(String name)
      {
      super(name);
      hoasesor = new FieldDef("hoasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hocolectivo = new FieldDef("hocolectivo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hocliente = new FieldDef("hocliente",FieldDef.CHAR,15);
      hocontador = new FieldDef("hocontador",FieldDef.INTEGER,0);
      hobanco = new FieldDef("hobanco",FieldDef.CHAR,4);
      honombre = new FieldDef("honombre",FieldDef.CHAR,30);
      hodomicilio = new FieldDef("hodomicilio",FieldDef.CHAR,30);
      hopoblacion = new FieldDef("hopoblacion",FieldDef.CHAR,20);
      hoprovincia = new FieldDef("hoprovincia",FieldDef.INTEGER,0);
      hoentidad = new FieldDef("hoentidad",FieldDef.CHAR,4);
      hooficina = new FieldDef("hooficina",FieldDef.CHAR,4);
      hodigcon = new FieldDef("hodigcon",FieldDef.CHAR,2);
      hocuenta = new FieldDef("hocuenta",FieldDef.CHAR,10);
      FieldDef array[] = {
        hoasesor,
        hocolectivo,
        hocliente,
        hocontador,
        hobanco,
        honombre,
        hodomicilio,
        hopoblacion,
        hoprovincia,
        hoentidad,
        hooficina,
        hodigcon,
        hocuenta        
        };
      setColumns(array);
      FieldDef arrayf[] = {hoasesor,hocolectivo,hocliente,hocontador };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCliservicios extends TableDef
    {
    // Campos
    public FieldDef csercodigo;
    public FieldDef cserasesor;
    public FieldDef csercliente;
    public FieldDef cserarea;
    public FieldDef cserservicio;
    public FieldDef cserdesc;
    public FieldDef cserestado;
    public FieldDef cserexpediente;
    public FieldDef csersupervisor;
    public FieldDef cserrespons01;
    public FieldDef cserrespons02;
    public FieldDef cserrespons03;
    public FieldDef cserrespons04;
    public FieldDef cserrespons05;
    public FieldDef csercontroler;
    public FieldDef cserfechaini;
    public FieldDef cserfechaprvis;
    public FieldDef cserfechafin;
    public FieldDef cserfecharevi;
    public FieldDef cserhoraini;
    public FieldDef cserhorafin;
    public FieldDef cserhoras;
    public FieldDef cserminutos;
    public FieldDef csersegundos;
    public FieldDef csertiempo;
    public FieldDef cserhorasfra;
    public FieldDef cserminutosfra;
    public TabCliservicios(String name)
      {
      super(name);
      csercodigo = new FieldDef("csercodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cserasesor = new FieldDef("cserasesor",FieldDef.INTEGER,0);
      csercliente = new FieldDef("csercliente",FieldDef.CHAR,15);
      cserarea = new FieldDef("cserarea",FieldDef.CHAR,25);
      cserservicio = new FieldDef("cserservicio",FieldDef.CHAR,25);
      cserdesc = new FieldDef("cserdesc",FieldDef.CHAR,255);
      cserestado = new FieldDef("cserestado",FieldDef.CHAR,1);
      cserexpediente = new FieldDef("cserexpediente",FieldDef.CHAR,15);
      csersupervisor = new FieldDef("csersupervisor",FieldDef.CHAR,25);
      cserrespons01 = new FieldDef("cserrespons01",FieldDef.CHAR,25);
      cserrespons02 = new FieldDef("cserrespons02",FieldDef.CHAR,25);
      cserrespons03 = new FieldDef("cserrespons03",FieldDef.CHAR,25);
      cserrespons04 = new FieldDef("cserrespons04",FieldDef.CHAR,25);
      cserrespons05 = new FieldDef("cserrespons05",FieldDef.CHAR,25);
      csercontroler = new FieldDef("csercontroler",FieldDef.CHAR,25);
      cserfechaini = new FieldDef("cserfechaini",FieldDef.DATE);
      cserfechaprvis = new FieldDef("cserfechaprvis",FieldDef.DATE);
      cserfechafin = new FieldDef("cserfechafin",FieldDef.DATE);
      cserfecharevi = new FieldDef("cserfecharevi",FieldDef.DATE);
      cserhoraini = new FieldDef("cserhoraini",FieldDef.CHAR,8);
      cserhorafin = new FieldDef("cserhorafin",FieldDef.CHAR,8);
      cserhoras = new FieldDef("cserhoras",FieldDef.INTEGER,0);
      cserminutos = new FieldDef("cserminutos",FieldDef.INTEGER,0);
      csersegundos = new FieldDef("csersegundos",FieldDef.INTEGER,0);
      csertiempo = new FieldDef("csertiempo",FieldDef.FLOAT,6,0);
      cserhorasfra = new FieldDef("cserhorasfra",FieldDef.INTEGER,0);
      cserminutosfra = new FieldDef("cserminutosfra",FieldDef.INTEGER,0);
      FieldDef array[] = {
        csercodigo,
        cserasesor,
        csercliente,
        cserarea,
        cserservicio,
        cserdesc,
        cserestado,
        cserexpediente,
        csersupervisor,
        cserrespons01,
        cserrespons02,
        cserrespons03,
        cserrespons04,
        cserrespons05,
        csercontroler,
        cserfechaini,
        cserfechaprvis,
        cserfechafin,
        cserfecharevi,
        cserhoraini,
        cserhorafin,
        cserhoras,
        cserminutos,
        csersegundos,
        csertiempo,
        cserhorasfra,
        cserminutosfra        
        };
      setColumns(array);
      FieldDef arrayf[] = {csercodigo };
      setPrimaryKeys(arrayf);
      csercodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabClitareas extends TableDef
    {
    // Campos
    public FieldDef ctrecodigo;
    public FieldDef ctreasesor;
    public FieldDef ctrecliente;
    public FieldDef ctrearea;
    public FieldDef ctreservicio;
    public FieldDef ctretarea;
    public FieldDef ctredesc;
    public FieldDef ctreestado;
    public FieldDef ctreexpediente;
    public FieldDef ctresupervisor;
    public FieldDef ctrerespons01;
    public FieldDef ctrecontroler;
    public FieldDef ctrefechaini;
    public FieldDef ctrefechaprvis;
    public FieldDef ctrefechafin;
    public FieldDef ctrefecharevi;
    public FieldDef ctrehoraini;
    public FieldDef ctrehorafin;
    public FieldDef ctrehoras;
    public FieldDef ctreminutos;
    public FieldDef ctresegundos;
    public FieldDef ctretiempo;
    public TabClitareas(String name)
      {
      super(name);
      ctrecodigo = new FieldDef("ctrecodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ctreasesor = new FieldDef("ctreasesor",FieldDef.INTEGER,0);
      ctrecliente = new FieldDef("ctrecliente",FieldDef.CHAR,15);
      ctrearea = new FieldDef("ctrearea",FieldDef.CHAR,25);
      ctreservicio = new FieldDef("ctreservicio",FieldDef.CHAR,25);
      ctretarea = new FieldDef("ctretarea",FieldDef.INTEGER,0);
      ctredesc = new FieldDef("ctredesc",FieldDef.CHAR,1500);
      ctreestado = new FieldDef("ctreestado",FieldDef.CHAR,1);
      ctreexpediente = new FieldDef("ctreexpediente",FieldDef.CHAR,15);
      ctresupervisor = new FieldDef("ctresupervisor",FieldDef.CHAR,25);
      ctrerespons01 = new FieldDef("ctrerespons01",FieldDef.CHAR,25);
      ctrecontroler = new FieldDef("ctrecontroler",FieldDef.CHAR,25);
      ctrefechaini = new FieldDef("ctrefechaini",FieldDef.DATE);
      ctrefechaprvis = new FieldDef("ctrefechaprvis",FieldDef.DATE);
      ctrefechafin = new FieldDef("ctrefechafin",FieldDef.DATE);
      ctrefecharevi = new FieldDef("ctrefecharevi",FieldDef.DATE);
      ctrehoraini = new FieldDef("ctrehoraini",FieldDef.CHAR,8);
      ctrehorafin = new FieldDef("ctrehorafin",FieldDef.CHAR,8);
      ctrehoras = new FieldDef("ctrehoras",FieldDef.INTEGER,0);
      ctreminutos = new FieldDef("ctreminutos",FieldDef.INTEGER,0);
      ctresegundos = new FieldDef("ctresegundos",FieldDef.INTEGER,0);
      ctretiempo = new FieldDef("ctretiempo",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ctrecodigo,
        ctreasesor,
        ctrecliente,
        ctrearea,
        ctreservicio,
        ctretarea,
        ctredesc,
        ctreestado,
        ctreexpediente,
        ctresupervisor,
        ctrerespons01,
        ctrecontroler,
        ctrefechaini,
        ctrefechaprvis,
        ctrefechafin,
        ctrefecharevi,
        ctrehoraini,
        ctrehorafin,
        ctrehoras,
        ctreminutos,
        ctresegundos,
        ctretiempo        
        };
      setColumns(array);
      FieldDef arrayf[] = {ctrecodigo };
      setPrimaryKeys(arrayf);
      ctrecodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabClinotas extends TableDef
    {
    // Campos
    public FieldDef cnotcodigo;
    public FieldDef cnotasesor;
    public FieldDef cnotcliente;
    public FieldDef cnotexpediente;
    public FieldDef cnotcontacto;
    public FieldDef cnotnombre;
    public FieldDef cnottelefono;
    public FieldDef cnotextension;
    public FieldDef cnotmobil;
    public FieldDef cnotemail;
    public FieldDef cnotcargo;
    public FieldDef cnotdepart;
    public FieldDef cnottipo;
    public FieldDef cnotestado;
    public FieldDef cnottipoaccion;
    public FieldDef cnotnivelurgen;
    public FieldDef cnotdesc;
    public FieldDef cnotfechaorigen;
    public FieldDef cnotfechaleido;
    public FieldDef cnotfechacierre;
    public FieldDef cnothoraorigen;
    public FieldDef cnothoraleido;
    public FieldDef cnothoracierre;
    public FieldDef cnotresporigen;
    public FieldDef cnotrespdestino;
    public TabClinotas(String name)
      {
      super(name);
      cnotcodigo = new FieldDef("cnotcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnotasesor = new FieldDef("cnotasesor",FieldDef.INTEGER,0);
      cnotcliente = new FieldDef("cnotcliente",FieldDef.CHAR,15);
      cnotexpediente = new FieldDef("cnotexpediente",FieldDef.CHAR,15);
      cnotcontacto = new FieldDef("cnotcontacto",FieldDef.CHAR,25);
      cnotnombre = new FieldDef("cnotnombre",FieldDef.CHAR,75);
      cnottelefono = new FieldDef("cnottelefono",FieldDef.CHAR,12);
      cnotextension = new FieldDef("cnotextension",FieldDef.CHAR,12);
      cnotmobil = new FieldDef("cnotmobil",FieldDef.CHAR,12);
      cnotemail = new FieldDef("cnotemail",FieldDef.CHAR,80);
      cnotcargo = new FieldDef("cnotcargo",FieldDef.CHAR,40);
      cnotdepart = new FieldDef("cnotdepart",FieldDef.CHAR,40);
      cnottipo = new FieldDef("cnottipo",FieldDef.CHAR,1);
      cnotestado = new FieldDef("cnotestado",FieldDef.CHAR,1);
      cnottipoaccion = new FieldDef("cnottipoaccion",FieldDef.CHAR,1);
      cnotnivelurgen = new FieldDef("cnotnivelurgen",FieldDef.CHAR,1);
      cnotdesc = new FieldDef("cnotdesc",FieldDef.CHAR,15000);
      cnotfechaorigen = new FieldDef("cnotfechaorigen",FieldDef.DATE);
      cnotfechaleido = new FieldDef("cnotfechaleido",FieldDef.DATE);
      cnotfechacierre = new FieldDef("cnotfechacierre",FieldDef.DATE);
      cnothoraorigen = new FieldDef("cnothoraorigen",FieldDef.CHAR,8);
      cnothoraleido = new FieldDef("cnothoraleido",FieldDef.CHAR,8);
      cnothoracierre = new FieldDef("cnothoracierre",FieldDef.CHAR,8);
      cnotresporigen = new FieldDef("cnotresporigen",FieldDef.CHAR,25);
      cnotrespdestino = new FieldDef("cnotrespdestino",FieldDef.CHAR,25);
      FieldDef array[] = {
        cnotcodigo,
        cnotasesor,
        cnotcliente,
        cnotexpediente,
        cnotcontacto,
        cnotnombre,
        cnottelefono,
        cnotextension,
        cnotmobil,
        cnotemail,
        cnotcargo,
        cnotdepart,
        cnottipo,
        cnotestado,
        cnottipoaccion,
        cnotnivelurgen,
        cnotdesc,
        cnotfechaorigen,
        cnotfechaleido,
        cnotfechacierre,
        cnothoraorigen,
        cnothoraleido,
        cnothoracierre,
        cnotresporigen,
        cnotrespdestino        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnotcodigo };
      setPrimaryKeys(arrayf);
      cnotcodigo.setAutoIncrementable(true);
      cnottipo.setDescription("LLAMADA , MENSAJE");
      cnotestado.setDescription("ENVIADA , RECIBIDA , CERRADA");
      cnottipoaccion.setDescription("HA TELEONEADO , VOLVERA A LLAMAR , DESEA QUE UD. LE LLAME , HA VENIDO A VISITARTE , DESDE QUE UESTED VAYA A VERLE");
      cnotnivelurgen.setDescription("Nivel urgencia - Baja , Normal , Critica");
      }
    }
    
  public class TabFitgen extends TableDef
    {
    // Campos
    public FieldDef fgasesor;
    public FieldDef fgcliente;
    public FieldDef fgaplicacion;
    public FieldDef fgcodigocdp;
    public FieldDef fgdatfiscales;
    public FieldDef fgdatafilia;
    public FieldDef fgdatrepres;
    public FieldDef fgdatreplegal;
    public FieldDef fgdatbancos;
    public FieldDef fgfactabo;
    public TabFitgen(String name)
      {
      super(name);
      fgasesor = new FieldDef("fgasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fgcliente = new FieldDef("fgcliente",FieldDef.CHAR,15,FieldDef.NOTNULL);
      fgaplicacion = new FieldDef("fgaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      fgcodigocdp = new FieldDef("fgcodigocdp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      fgdatfiscales = new FieldDef("fgdatfiscales",FieldDef.CHAR,1);
      fgdatafilia = new FieldDef("fgdatafilia",FieldDef.CHAR,1);
      fgdatrepres = new FieldDef("fgdatrepres",FieldDef.CHAR,1);
      fgdatreplegal = new FieldDef("fgdatreplegal",FieldDef.CHAR,1);
      fgdatbancos = new FieldDef("fgdatbancos",FieldDef.CHAR,1);
      fgfactabo = new FieldDef("fgfactabo",FieldDef.CHAR,1);
      FieldDef array[] = {
        fgasesor,
        fgcliente,
        fgaplicacion,
        fgcodigocdp,
        fgdatfiscales,
        fgdatafilia,
        fgdatrepres,
        fgdatreplegal,
        fgdatbancos,
        fgfactabo        
        };
      setColumns(array);
      FieldDef arrayf[] = {fgasesor,fgcliente,fgaplicacion,fgcodigocdp };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabFitgenrepres extends TableDef
    {
    // Campos
    public FieldDef frasesor;
    public FieldDef frcliente;
    public FieldDef frnifcif;
    public FieldDef frpresentante;
    public FieldDef frreplegal;
    public FieldDef fradministrado;
    public FieldDef frsocios;
    public FieldDef frsecretario;
    public FieldDef frfechapoder;
    public FieldDef frnotaria;
    public FieldDef frvtopoder;
    public FieldDef frresidente;
    public FieldDef frfirma;
    public FieldDef frdominio;
    public TabFitgenrepres(String name)
      {
      super(name);
      frasesor = new FieldDef("frasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      frcliente = new FieldDef("frcliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      frnifcif = new FieldDef("frnifcif",FieldDef.CHAR,15);
      frpresentante = new FieldDef("frpresentante",FieldDef.CHAR,1);
      frreplegal = new FieldDef("frreplegal",FieldDef.CHAR,1);
      fradministrado = new FieldDef("fradministrado",FieldDef.CHAR,1);
      frsocios = new FieldDef("frsocios",FieldDef.CHAR,1);
      frsecretario = new FieldDef("frsecretario",FieldDef.CHAR,1);
      frfechapoder = new FieldDef("frfechapoder",FieldDef.DATE);
      frnotaria = new FieldDef("frnotaria",FieldDef.CHAR,40);
      frvtopoder = new FieldDef("frvtopoder",FieldDef.DATE);
      frresidente = new FieldDef("frresidente",FieldDef.CHAR,1);
      frfirma = new FieldDef("frfirma",FieldDef.CHAR,1);
      frdominio = new FieldDef("frdominio",FieldDef.CHAR,12);
      FieldDef array[] = {
        frasesor,
        frcliente,
        frnifcif,
        frpresentante,
        frreplegal,
        fradministrado,
        frsocios,
        frsecretario,
        frfechapoder,
        frnotaria,
        frvtopoder,
        frresidente,
        frfirma,
        frdominio        
        };
      setColumns(array);
      FieldDef arrayf[] = {frasesor,frcliente,frnifcif };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabFitgenbancos extends TableDef
    {
    // Campos
    public FieldDef fbccasesor;
    public FieldDef fbccliente;
    public FieldDef fbcccodigo;
    public FieldDef fbccbanco;
    public FieldDef fbccsucursal;
    public FieldDef fbccnumero;
    public FieldDef fbccdigitos;
    public FieldDef fbccsg;
    public FieldDef fbccvia;
    public FieldDef fbccnum;
    public FieldDef fbccescalera;
    public FieldDef fbccpiso;
    public FieldDef fbccletra;
    public FieldDef fbccpoblacion;
    public FieldDef fbcccodmuni;
    public FieldDef fbcccodpostal;
    public FieldDef fbccprovincia;
    public FieldDef fbccdominio;
    public TabFitgenbancos(String name)
      {
      super(name);
      fbccasesor = new FieldDef("fbccasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fbccliente = new FieldDef("fbccliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      fbcccodigo = new FieldDef("fbcccodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      fbccbanco = new FieldDef("fbccbanco",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fbccsucursal = new FieldDef("fbccsucursal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fbccnumero = new FieldDef("fbccnumero",FieldDef.CHAR,10,FieldDef.NOTNULL);
      fbccdigitos = new FieldDef("fbccdigitos",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fbccsg = new FieldDef("fbccsg",FieldDef.CHAR,2);
      fbccvia = new FieldDef("fbccvia",FieldDef.CHAR,45);
      fbccnum = new FieldDef("fbccnum",FieldDef.CHAR,6);
      fbccescalera = new FieldDef("fbccescalera",FieldDef.CHAR,2);
      fbccpiso = new FieldDef("fbccpiso",FieldDef.CHAR,6);
      fbccletra = new FieldDef("fbccletra",FieldDef.CHAR,2);
      fbccpoblacion = new FieldDef("fbccpoblacion",FieldDef.CHAR,30);
      fbcccodmuni = new FieldDef("fbcccodmuni",FieldDef.INTEGER,0);
      fbcccodpostal = new FieldDef("fbcccodpostal",FieldDef.CHAR,5);
      fbccprovincia = new FieldDef("fbccprovincia",FieldDef.INTEGER,0);
      fbccdominio = new FieldDef("fbccdominio",FieldDef.CHAR,12);
      FieldDef array[] = {
        fbccasesor,
        fbccliente,
        fbcccodigo,
        fbccbanco,
        fbccsucursal,
        fbccnumero,
        fbccdigitos,
        fbccsg,
        fbccvia,
        fbccnum,
        fbccescalera,
        fbccpiso,
        fbccletra,
        fbccpoblacion,
        fbcccodmuni,
        fbcccodpostal,
        fbccprovincia,
        fbccdominio        
        };
      setColumns(array);
      FieldDef arrayf[] = {fbccasesor,fbccliente,fbcccodigo,fbccbanco,fbccsucursal,fbccnumero,fbccdigitos };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabExpe extends TableDef
    {
    // Campos
    public FieldDef exasesor;
    public FieldDef extipo;
    public FieldDef excodigo;
    public FieldDef exexpediente;
    public FieldDef excliente;
    public FieldDef exnomtit;
    public FieldDef exsgtit;
    public FieldDef exviatit;
    public FieldDef exnumtit;
    public FieldDef exesctit;
    public FieldDef expisotit;
    public FieldDef exletratit;
    public FieldDef expobtit;
    public FieldDef excpostaltit;
    public FieldDef exprovtit;
    public FieldDef exciftit;
    public FieldDef excolaborador;
    public FieldDef exrefcolab;
    public FieldDef exgestion;
    public FieldDef exdescripcion;
    public FieldDef exfecinici;
    public FieldDef exfecultfra;
    public FieldDef exfecbaja;
    public FieldDef extipocon;
    public FieldDef extipoiva;
    public FieldDef exfpago;
    public FieldDef exresponsable;
    public FieldDef exdescuento;
    public FieldDef exforfra;
    public FieldDef exirpfsn;
    public FieldDef exempresa;
    public FieldDef extarifa;
    public FieldDef exfacturaciona;
    public FieldDef exdomiciliacion;
    public FieldDef exrepresentante;
    public FieldDef excomercial;
    public FieldDef exprovisiones;
    public FieldDef exsuplidos;
    public FieldDef exsuplidosiva;
    public FieldDef exhonorarios;
    public FieldDef exbase;
    public FieldDef exiva;
    public FieldDef exirpf;
    public FieldDef exsaldo;
    public FieldDef exauxiliar;
    public FieldDef exacum_dto;
    public FieldDef extitular;
    public FieldDef exdireccomp;
    public FieldDef exusuario;
    public FieldDef exfrecuencia;
    public FieldDef exultimoany;
    public FieldDef exultimomes;
    public FieldDef exultimaqui;
    public FieldDef exempresanom;
    public FieldDef excuotassegsoc;
    public FieldDef excuotairpf;
    public FieldDef extarifanomina;
    public FieldDef extarifairpf;
    public FieldDef exempresaeos;
    public FieldDef extipopago;
    public FieldDef excaducidad;
    public FieldDef exenlazado;
    public FieldDef exempresacon;
    public FieldDef extarifaconta;
    public FieldDef exivadefecto;
    public FieldDef exirpfdefecto;
    public FieldDef extipofpago;
    public FieldDef extipodesglbanc;
    public FieldDef exdomiasesor;
    public FieldDef extiponormadomi;
    public FieldDef exfpago2;
    public FieldDef excolectivo;
    public TabExpe(String name)
      {
      super(name);
      exasesor = new FieldDef("exasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      extipo = new FieldDef("extipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      excodigo = new FieldDef("excodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      exexpediente = new FieldDef("exexpediente",FieldDef.CHAR,15);
      excliente = new FieldDef("excliente",FieldDef.CHAR,15);
      exnomtit = new FieldDef("exnomtit",FieldDef.CHAR,40);
      exsgtit = new FieldDef("exsgtit",FieldDef.CHAR,2);
      exviatit = new FieldDef("exviatit",FieldDef.CHAR,40);
      exnumtit = new FieldDef("exnumtit",FieldDef.CHAR,5);
      exesctit = new FieldDef("exesctit",FieldDef.CHAR,2);
      expisotit = new FieldDef("expisotit",FieldDef.CHAR,2);
      exletratit = new FieldDef("exletratit",FieldDef.CHAR,2);
      expobtit = new FieldDef("expobtit",FieldDef.CHAR,30);
      excpostaltit = new FieldDef("excpostaltit",FieldDef.CHAR,7);
      exprovtit = new FieldDef("exprovtit",FieldDef.INTEGER,0);
      exciftit = new FieldDef("exciftit",FieldDef.CHAR,15);
      excolaborador = new FieldDef("excolaborador",FieldDef.CHAR,15);
      exrefcolab = new FieldDef("exrefcolab",FieldDef.CHAR,10);
      exgestion = new FieldDef("exgestion",FieldDef.CHAR,3);
      exdescripcion = new FieldDef("exdescripcion",FieldDef.CHAR,2000);
      exfecinici = new FieldDef("exfecinici",FieldDef.DATE);
      exfecultfra = new FieldDef("exfecultfra",FieldDef.DATE);
      exfecbaja = new FieldDef("exfecbaja",FieldDef.DATE);
      extipocon = new FieldDef("extipocon",FieldDef.INTEGER,0);
      extipoiva = new FieldDef("extipoiva",FieldDef.FLOAT,6,0);
      exfpago = new FieldDef("exfpago",FieldDef.INTEGER,0);
      exresponsable = new FieldDef("exresponsable",FieldDef.CHAR,25);
      exdescuento = new FieldDef("exdescuento",FieldDef.FLOAT,6,0);
      exforfra = new FieldDef("exforfra",FieldDef.CHAR,2);
      exirpfsn = new FieldDef("exirpfsn",FieldDef.CHAR,1);
      exempresa = new FieldDef("exempresa",FieldDef.INTEGER,0);
      extarifa = new FieldDef("extarifa",FieldDef.CHAR,15);
      exfacturaciona = new FieldDef("exfacturaciona",FieldDef.CHAR,1);
      exdomiciliacion = new FieldDef("exdomiciliacion",FieldDef.INTEGER,0);
      exrepresentante = new FieldDef("exrepresentante",FieldDef.CHAR,3);
      excomercial = new FieldDef("excomercial",FieldDef.CHAR,3);
      exprovisiones = new FieldDef("exprovisiones",FieldDef.FLOAT,6,0);
      exsuplidos = new FieldDef("exsuplidos",FieldDef.FLOAT,6,0);
      exsuplidosiva = new FieldDef("exsuplidosiva",FieldDef.FLOAT,6,0);
      exhonorarios = new FieldDef("exhonorarios",FieldDef.FLOAT,6,0);
      exbase = new FieldDef("exbase",FieldDef.FLOAT,6,0);
      exiva = new FieldDef("exiva",FieldDef.FLOAT,6,0);
      exirpf = new FieldDef("exirpf",FieldDef.FLOAT,6,0);
      exsaldo = new FieldDef("exsaldo",FieldDef.FLOAT,6,0);
      exauxiliar = new FieldDef("exauxiliar",FieldDef.CHAR,15);
      exacum_dto = new FieldDef("exacum_dto",FieldDef.FLOAT,6,0);
      extitular = new FieldDef("extitular",FieldDef.CHAR,15);
      exdireccomp = new FieldDef("exdireccomp",FieldDef.CHAR,60);
      exusuario = new FieldDef("exusuario",FieldDef.CHAR,25);
      exfrecuencia = new FieldDef("exfrecuencia",FieldDef.CHAR,1);
      exultimoany = new FieldDef("exultimoany",FieldDef.INTEGER,0);
      exultimomes = new FieldDef("exultimomes",FieldDef.INTEGER,0);
      exultimaqui = new FieldDef("exultimaqui",FieldDef.INTEGER,0);
      exempresanom = new FieldDef("exempresanom",FieldDef.INTEGER,0);
      excuotassegsoc = new FieldDef("excuotassegsoc",FieldDef.CHAR,1);
      excuotairpf = new FieldDef("excuotairpf",FieldDef.CHAR,1);
      extarifanomina = new FieldDef("extarifanomina",FieldDef.INTEGER,0);
      extarifairpf = new FieldDef("extarifairpf",FieldDef.INTEGER,0);
      exempresaeos = new FieldDef("exempresaeos",FieldDef.INTEGER,0);
      extipopago = new FieldDef("extipopago",FieldDef.CHAR,1);
      excaducidad = new FieldDef("excaducidad",FieldDef.INTEGER,0);
      exenlazado = new FieldDef("exenlazado",FieldDef.CHAR,1);
      exempresacon = new FieldDef("exempresacon",FieldDef.INTEGER,0);
      extarifaconta = new FieldDef("extarifaconta",FieldDef.INTEGER,0);
      exivadefecto = new FieldDef("exivadefecto",FieldDef.INTEGER,0);
      exirpfdefecto = new FieldDef("exirpfdefecto",FieldDef.INTEGER,0);
      extipofpago = new FieldDef("extipofpago",FieldDef.CHAR,2);
      extipodesglbanc = new FieldDef("extipodesglbanc",FieldDef.CHAR,1);
      exdomiasesor = new FieldDef("exdomiasesor",FieldDef.INTEGER,0);
      extiponormadomi = new FieldDef("extiponormadomi",FieldDef.CHAR,2);
      exfpago2 = new FieldDef("exfpago2",FieldDef.INTEGER,0);
      excolectivo = new FieldDef("excolectivo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        exasesor,
        extipo,
        excodigo,
        exexpediente,
        excliente,
        exnomtit,
        exsgtit,
        exviatit,
        exnumtit,
        exesctit,
        expisotit,
        exletratit,
        expobtit,
        excpostaltit,
        exprovtit,
        exciftit,
        excolaborador,
        exrefcolab,
        exgestion,
        exdescripcion,
        exfecinici,
        exfecultfra,
        exfecbaja,
        extipocon,
        extipoiva,
        exfpago,
        exresponsable,
        exdescuento,
        exforfra,
        exirpfsn,
        exempresa,
        extarifa,
        exfacturaciona,
        exdomiciliacion,
        exrepresentante,
        excomercial,
        exprovisiones,
        exsuplidos,
        exsuplidosiva,
        exhonorarios,
        exbase,
        exiva,
        exirpf,
        exsaldo,
        exauxiliar,
        exacum_dto,
        extitular,
        exdireccomp,
        exusuario,
        exfrecuencia,
        exultimoany,
        exultimomes,
        exultimaqui,
        exempresanom,
        excuotassegsoc,
        excuotairpf,
        extarifanomina,
        extarifairpf,
        exempresaeos,
        extipopago,
        excaducidad,
        exenlazado,
        exempresacon,
        extarifaconta,
        exivadefecto,
        exirpfdefecto,
        extipofpago,
        extipodesglbanc,
        exdomiasesor,
        extiponormadomi,
        exfpago2,
        excolectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {exasesor,extipo,excodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDocumento extends TableDef
    {
    // Campos
    public FieldDef doccodigo;
    public FieldDef docasesor;
    public FieldDef doccodcli;
    public FieldDef docexpediente;
    public FieldDef docfolder;
    public FieldDef docfile;
    public FieldDef docorganizacion;
    public FieldDef docurl;
    public FieldDef docresponsable;
    public FieldDef docaplicacion;
    public FieldDef docusuario;
    public FieldDef docusuario02;
    public FieldDef docusuario03;
    public FieldDef docusuario04;
    public FieldDef docusuario05;
    public FieldDef doctipodoc;
    public FieldDef docsubtipodoc;
    public FieldDef doctitulo;
    public FieldDef docdescrip;
    public FieldDef dockeys;
    public FieldDef docarea;
    public FieldDef docservicio;
    public FieldDef doctipofile;
    public FieldDef docfechacrea;
    public FieldDef docfecharegis;
    public FieldDef docfechamodif;
    public FieldDef docrefarchivo;
    public FieldDef docrefestante;
    public FieldDef docrefcarpeta;
    public FieldDef docrefseccion;
    public FieldDef docejercicio;
    public FieldDef doccolectivo;
    public FieldDef docperiodo;
    public FieldDef docmodelo;
    public FieldDef docorganismo;
    public FieldDef docobjeto;
    public FieldDef docentidad;
    public FieldDef doccolaborador;
    public FieldDef doccodexterno;
    public FieldDef docrepres;
    public FieldDef doccomercial;
    public FieldDef docisfolder;
    public TabDocumento(String name)
      {
      super(name);
      doccodigo = new FieldDef("doccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      docasesor = new FieldDef("docasesor",FieldDef.INTEGER,0);
      doccodcli = new FieldDef("doccodcli",FieldDef.CHAR,15);
      docexpediente = new FieldDef("docexpediente",FieldDef.CHAR,15);
      docfolder = new FieldDef("docfolder",FieldDef.CHAR,2000);
      docfile = new FieldDef("docfile",FieldDef.CHAR,255);
      docorganizacion = new FieldDef("docorganizacion",FieldDef.CHAR,2);
      docurl = new FieldDef("docurl",FieldDef.CHAR,2000);
      docresponsable = new FieldDef("docresponsable",FieldDef.CHAR,25);
      docaplicacion = new FieldDef("docaplicacion",FieldDef.CHAR,15);
      docusuario = new FieldDef("docusuario",FieldDef.CHAR,25);
      docusuario02 = new FieldDef("docusuario02",FieldDef.CHAR,25);
      docusuario03 = new FieldDef("docusuario03",FieldDef.CHAR,25);
      docusuario04 = new FieldDef("docusuario04",FieldDef.CHAR,25);
      docusuario05 = new FieldDef("docusuario05",FieldDef.CHAR,25);
      doctipodoc = new FieldDef("doctipodoc",FieldDef.CHAR,25);
      docsubtipodoc = new FieldDef("docsubtipodoc",FieldDef.CHAR,25);
      doctitulo = new FieldDef("doctitulo",FieldDef.CHAR,100);
      docdescrip = new FieldDef("docdescrip",FieldDef.CHAR,2000);
      dockeys = new FieldDef("dockeys",FieldDef.CHAR,255);
      docarea = new FieldDef("docarea",FieldDef.CHAR,25);
      docservicio = new FieldDef("docservicio",FieldDef.CHAR,25);
      doctipofile = new FieldDef("doctipofile",FieldDef.CHAR,5);
      docfechacrea = new FieldDef("docfechacrea",FieldDef.DATE);
      docfecharegis = new FieldDef("docfecharegis",FieldDef.DATE);
      docfechamodif = new FieldDef("docfechamodif",FieldDef.DATE);
      docrefarchivo = new FieldDef("docrefarchivo",FieldDef.CHAR,30);
      docrefestante = new FieldDef("docrefestante",FieldDef.CHAR,30);
      docrefcarpeta = new FieldDef("docrefcarpeta",FieldDef.CHAR,30);
      docrefseccion = new FieldDef("docrefseccion",FieldDef.CHAR,30);
      docejercicio = new FieldDef("docejercicio",FieldDef.INTEGER,0);
      doccolectivo = new FieldDef("doccolectivo",FieldDef.INTEGER,0);
      docperiodo = new FieldDef("docperiodo",FieldDef.CHAR,5);
      docmodelo = new FieldDef("docmodelo",FieldDef.CHAR,15);
      docorganismo = new FieldDef("docorganismo",FieldDef.CHAR,25);
      docobjeto = new FieldDef("docobjeto",FieldDef.CHAR,25);
      docentidad = new FieldDef("docentidad",FieldDef.CHAR,25);
      doccolaborador = new FieldDef("doccolaborador",FieldDef.CHAR,15);
      doccodexterno = new FieldDef("doccodexterno",FieldDef.CHAR,40);
      docrepres = new FieldDef("docrepres",FieldDef.CHAR,3);
      doccomercial = new FieldDef("doccomercial",FieldDef.CHAR,3);
      docisfolder = new FieldDef("docisfolder",FieldDef.CHAR,1);
      FieldDef array[] = {
        doccodigo,
        docasesor,
        doccodcli,
        docexpediente,
        docfolder,
        docfile,
        docorganizacion,
        docurl,
        docresponsable,
        docaplicacion,
        docusuario,
        docusuario02,
        docusuario03,
        docusuario04,
        docusuario05,
        doctipodoc,
        docsubtipodoc,
        doctitulo,
        docdescrip,
        dockeys,
        docarea,
        docservicio,
        doctipofile,
        docfechacrea,
        docfecharegis,
        docfechamodif,
        docrefarchivo,
        docrefestante,
        docrefcarpeta,
        docrefseccion,
        docejercicio,
        doccolectivo,
        docperiodo,
        docmodelo,
        docorganismo,
        docobjeto,
        docentidad,
        doccolaborador,
        doccodexterno,
        docrepres,
        doccomercial,
        docisfolder        
        };
      setColumns(array);
      FieldDef arrayf[] = {doccodigo };
      setPrimaryKeys(arrayf);
      doccodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabHdocumento extends TableDef
    {
    // Campos
    public FieldDef hoccodigo;
    public FieldDef hocasesor;
    public FieldDef hoccodcli;
    public FieldDef hocexpediente;
    public FieldDef hocfolder;
    public FieldDef hocfile;
    public FieldDef hocorganizacion;
    public FieldDef hocurl;
    public FieldDef hocresponsable;
    public FieldDef hocaplicacion;
    public FieldDef hocusuario;
    public FieldDef hocusuario02;
    public FieldDef hocusuario03;
    public FieldDef hocusuario04;
    public FieldDef hocusuario05;
    public FieldDef hoctipodoc;
    public FieldDef hocsubtipodoc;
    public FieldDef hoctitulo;
    public FieldDef hocdescrip;
    public FieldDef hockeys;
    public FieldDef hocarea;
    public FieldDef hocservicio;
    public FieldDef hoctipofile;
    public FieldDef hocfechacrea;
    public FieldDef hocfecharegis;
    public FieldDef hocfechamodif;
    public FieldDef hocrefarchivo;
    public FieldDef hocrefestante;
    public FieldDef hocrefcarpeta;
    public FieldDef hocrefseccion;
    public FieldDef hocejercicio;
    public FieldDef hoccolectivo;
    public FieldDef hocperiodo;
    public FieldDef hocmodelo;
    public FieldDef hocorganismo;
    public FieldDef hocobjeto;
    public FieldDef hocentidad;
    public FieldDef hoccolaborador;
    public FieldDef hoccodexterno;
    public FieldDef hocrepres;
    public FieldDef hoccomercial;
    public FieldDef hocisfolder;
    public TabHdocumento(String name)
      {
      super(name);
      hoccodigo = new FieldDef("hoccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hocasesor = new FieldDef("hocasesor",FieldDef.INTEGER,0);
      hoccodcli = new FieldDef("hoccodcli",FieldDef.CHAR,15);
      hocexpediente = new FieldDef("hocexpediente",FieldDef.CHAR,15);
      hocfolder = new FieldDef("hocfolder",FieldDef.CHAR,2000);
      hocfile = new FieldDef("hocfile",FieldDef.CHAR,255);
      hocorganizacion = new FieldDef("hocorganizacion",FieldDef.CHAR,2);
      hocurl = new FieldDef("hocurl",FieldDef.CHAR,2000);
      hocresponsable = new FieldDef("hocresponsable",FieldDef.CHAR,25);
      hocaplicacion = new FieldDef("hocaplicacion",FieldDef.CHAR,15);
      hocusuario = new FieldDef("hocusuario",FieldDef.CHAR,25);
      hocusuario02 = new FieldDef("hocusuario02",FieldDef.CHAR,25);
      hocusuario03 = new FieldDef("hocusuario03",FieldDef.CHAR,25);
      hocusuario04 = new FieldDef("hocusuario04",FieldDef.CHAR,25);
      hocusuario05 = new FieldDef("hocusuario05",FieldDef.CHAR,25);
      hoctipodoc = new FieldDef("hoctipodoc",FieldDef.CHAR,25);
      hocsubtipodoc = new FieldDef("hocsubtipodoc",FieldDef.CHAR,25);
      hoctitulo = new FieldDef("hoctitulo",FieldDef.CHAR,100);
      hocdescrip = new FieldDef("hocdescrip",FieldDef.CHAR,2000);
      hockeys = new FieldDef("hockeys",FieldDef.CHAR,255);
      hocarea = new FieldDef("hocarea",FieldDef.CHAR,25);
      hocservicio = new FieldDef("hocservicio",FieldDef.CHAR,25);
      hoctipofile = new FieldDef("hoctipofile",FieldDef.CHAR,5);
      hocfechacrea = new FieldDef("hocfechacrea",FieldDef.DATE);
      hocfecharegis = new FieldDef("hocfecharegis",FieldDef.DATE);
      hocfechamodif = new FieldDef("hocfechamodif",FieldDef.DATE);
      hocrefarchivo = new FieldDef("hocrefarchivo",FieldDef.CHAR,30);
      hocrefestante = new FieldDef("hocrefestante",FieldDef.CHAR,30);
      hocrefcarpeta = new FieldDef("hocrefcarpeta",FieldDef.CHAR,30);
      hocrefseccion = new FieldDef("hocrefseccion",FieldDef.CHAR,30);
      hocejercicio = new FieldDef("hocejercicio",FieldDef.INTEGER,0);
      hoccolectivo = new FieldDef("hoccolectivo",FieldDef.INTEGER,0);
      hocperiodo = new FieldDef("hocperiodo",FieldDef.CHAR,5);
      hocmodelo = new FieldDef("hocmodelo",FieldDef.CHAR,15);
      hocorganismo = new FieldDef("hocorganismo",FieldDef.CHAR,25);
      hocobjeto = new FieldDef("hocobjeto",FieldDef.CHAR,25);
      hocentidad = new FieldDef("hocentidad",FieldDef.CHAR,25);
      hoccolaborador = new FieldDef("hoccolaborador",FieldDef.CHAR,15);
      hoccodexterno = new FieldDef("hoccodexterno",FieldDef.CHAR,40);
      hocrepres = new FieldDef("hocrepres",FieldDef.CHAR,3);
      hoccomercial = new FieldDef("hoccomercial",FieldDef.CHAR,3);
      hocisfolder = new FieldDef("hocisfolder",FieldDef.CHAR,1);
      FieldDef array[] = {
        hoccodigo,
        hocasesor,
        hoccodcli,
        hocexpediente,
        hocfolder,
        hocfile,
        hocorganizacion,
        hocurl,
        hocresponsable,
        hocaplicacion,
        hocusuario,
        hocusuario02,
        hocusuario03,
        hocusuario04,
        hocusuario05,
        hoctipodoc,
        hocsubtipodoc,
        hoctitulo,
        hocdescrip,
        hockeys,
        hocarea,
        hocservicio,
        hoctipofile,
        hocfechacrea,
        hocfecharegis,
        hocfechamodif,
        hocrefarchivo,
        hocrefestante,
        hocrefcarpeta,
        hocrefseccion,
        hocejercicio,
        hoccolectivo,
        hocperiodo,
        hocmodelo,
        hocorganismo,
        hocobjeto,
        hocentidad,
        hoccolaborador,
        hoccodexterno,
        hocrepres,
        hoccomercial,
        hocisfolder        
        };
      setColumns(array);
      FieldDef arrayf[] = {hoccodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDocmovimientos extends TableDef
    {
    // Campos
    public FieldDef dmvcodigo;
    public FieldDef dmvdocumento;
    public FieldDef dmvcopia;
    public FieldDef dmvresponsable;
    public FieldDef dmvfechasalida;
    public FieldDef dmvhorasalida;
    public FieldDef dmvfecharetorno;
    public FieldDef dmvhoraretorno;
    public FieldDef dmvfecharetprev;
    public FieldDef dmvhoraretprev;
    public FieldDef dmvubicacion;
    public FieldDef dmvobserva;
    public TabDocmovimientos(String name)
      {
      super(name);
      dmvcodigo = new FieldDef("dmvcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dmvdocumento = new FieldDef("dmvdocumento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dmvcopia = new FieldDef("dmvcopia",FieldDef.INTEGER,0);
      dmvresponsable = new FieldDef("dmvresponsable",FieldDef.CHAR,25);
      dmvfechasalida = new FieldDef("dmvfechasalida",FieldDef.DATE);
      dmvhorasalida = new FieldDef("dmvhorasalida",FieldDef.CHAR,8);
      dmvfecharetorno = new FieldDef("dmvfecharetorno",FieldDef.DATE);
      dmvhoraretorno = new FieldDef("dmvhoraretorno",FieldDef.CHAR,8);
      dmvfecharetprev = new FieldDef("dmvfecharetprev",FieldDef.DATE);
      dmvhoraretprev = new FieldDef("dmvhoraretprev",FieldDef.CHAR,8);
      dmvubicacion = new FieldDef("dmvubicacion",FieldDef.CHAR,100);
      dmvobserva = new FieldDef("dmvobserva",FieldDef.CHAR,255);
      FieldDef array[] = {
        dmvcodigo,
        dmvdocumento,
        dmvcopia,
        dmvresponsable,
        dmvfechasalida,
        dmvhorasalida,
        dmvfecharetorno,
        dmvhoraretorno,
        dmvfecharetprev,
        dmvhoraretprev,
        dmvubicacion,
        dmvobserva        
        };
      setColumns(array);
      FieldDef arrayf[] = {dmvcodigo };
      setPrimaryKeys(arrayf);
      dmvcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabDocacciones extends TableDef
    {
    // Campos
    public FieldDef daccodigo;
    public FieldDef dacdocumento;
    public FieldDef dacnumero;
    public FieldDef dacaccion;
    public FieldDef dacresponsable;
    public FieldDef dacusuario;
    public FieldDef dacpc;
    public FieldDef dacfecha;
    public FieldDef dachora;
    public TabDocacciones(String name)
      {
      super(name);
      daccodigo = new FieldDef("daccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dacdocumento = new FieldDef("dacdocumento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dacnumero = new FieldDef("dacnumero",FieldDef.INTEGER,0);
      dacaccion = new FieldDef("dacaccion",FieldDef.CHAR,2);
      dacresponsable = new FieldDef("dacresponsable",FieldDef.CHAR,25);
      dacusuario = new FieldDef("dacusuario",FieldDef.CHAR,25);
      dacpc = new FieldDef("dacpc",FieldDef.CHAR,25);
      dacfecha = new FieldDef("dacfecha",FieldDef.DATE);
      dachora = new FieldDef("dachora",FieldDef.CHAR,8);
      FieldDef array[] = {
        daccodigo,
        dacdocumento,
        dacnumero,
        dacaccion,
        dacresponsable,
        dacusuario,
        dacpc,
        dacfecha,
        dachora        
        };
      setColumns(array);
      FieldDef arrayf[] = {daccodigo };
      setPrimaryKeys(arrayf);
      daccodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabDoccopias extends TableDef
    {
    // Campos
    public FieldDef dcpdocumento;
    public FieldDef dcpnumero;
    public FieldDef dcpresponsable;
    public FieldDef dcpfechacrea;
    public FieldDef dcphoracrea;
    public FieldDef dcpubicacion;
    public FieldDef dcpuso;
    public FieldDef dcpobserva;
    public TabDoccopias(String name)
      {
      super(name);
      dcpdocumento = new FieldDef("dcpdocumento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcpnumero = new FieldDef("dcpnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcpresponsable = new FieldDef("dcpresponsable",FieldDef.CHAR,25);
      dcpfechacrea = new FieldDef("dcpfechacrea",FieldDef.DATE);
      dcphoracrea = new FieldDef("dcphoracrea",FieldDef.CHAR,8);
      dcpubicacion = new FieldDef("dcpubicacion",FieldDef.CHAR,100);
      dcpuso = new FieldDef("dcpuso",FieldDef.CHAR,100);
      dcpobserva = new FieldDef("dcpobserva",FieldDef.CHAR,255);
      FieldDef array[] = {
        dcpdocumento,
        dcpnumero,
        dcpresponsable,
        dcpfechacrea,
        dcphoracrea,
        dcpubicacion,
        dcpuso,
        dcpobserva        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcpdocumento,dcpnumero };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabValoresexpe extends TableDef
    {
    // Campos
    public FieldDef vaapl;
    public FieldDef vacampo;
    public FieldDef vacodigo;
    public FieldDef vadesc;
    public FieldDef vaorden;
    public FieldDef vavalornum;
    public FieldDef vavaloralfa;
    public TabValoresexpe(String name)
      {
      super(name);
      vaapl = new FieldDef("vaapl",FieldDef.CHAR,8,FieldDef.NOTNULL);
      vacampo = new FieldDef("vacampo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      vacodigo = new FieldDef("vacodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      vadesc = new FieldDef("vadesc",FieldDef.CHAR,45);
      vaorden = new FieldDef("vaorden",FieldDef.INTEGER,0);
      vavalornum = new FieldDef("vavalornum",FieldDef.FLOAT,6,0);
      vavaloralfa = new FieldDef("vavaloralfa",FieldDef.CHAR,15);
      FieldDef array[] = {
        vaapl,
        vacampo,
        vacodigo,
        vadesc,
        vaorden,
        vavalornum,
        vavaloralfa        
        };
      setColumns(array);
      FieldDef arrayf[] = {vaapl,vacampo,vacodigo };
      setPrimaryKeys(arrayf);
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
    
  public class TabAuxhojas extends TableDef
    {
    // Campos
    public FieldDef codigo;
    public FieldDef hojaname;
    public FieldDef tablename;
    public FieldDef type;
    public FieldDef views;
    public FieldDef description;
    public TabAuxhojas(String name)
      {
      super(name);
      codigo = new FieldDef("codigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hojaname = new FieldDef("hojaname",FieldDef.CHAR,30);
      tablename = new FieldDef("tablename",FieldDef.CHAR,30);
      type = new FieldDef("type",FieldDef.INTEGER,0);
      views = new FieldDef("views",FieldDef.INTEGER,0);
      description = new FieldDef("description",FieldDef.CHAR,255);
      FieldDef array[] = {
        codigo,
        hojaname,
        tablename,
        type,
        views,
        description        
        };
      setColumns(array);
      FieldDef arrayf[] = {codigo };
      setPrimaryKeys(arrayf);
      codigo.setAutoIncrementable(true);
      }
    }
    
  public class TabAuxfielddef extends TableDef
    {
    // Campos
    public FieldDef auxcodigo;
    public FieldDef auxhoja;
    public FieldDef auxtable;
    public FieldDef auxname;
    public FieldDef auxtype;
    public FieldDef auxlength;
    public FieldDef auxscale;
    public FieldDef auxnullable;
    public FieldDef auxdescription;
    public FieldDef auxprintable;
    public FieldDef auxtextoayuda;
    public FieldDef auxorden;
    public FieldDef auxauxiliar;
    public FieldDef auxpickup;
    public TabAuxfielddef(String name)
      {
      super(name);
      auxcodigo = new FieldDef("auxcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      auxhoja = new FieldDef("auxhoja",FieldDef.INTEGER,0);
      auxtable = new FieldDef("auxtable",FieldDef.CHAR,30);
      auxname = new FieldDef("auxname",FieldDef.CHAR,30);
      auxtype = new FieldDef("auxtype",FieldDef.INTEGER,0);
      auxlength = new FieldDef("auxlength",FieldDef.INTEGER,0);
      auxscale = new FieldDef("auxscale",FieldDef.INTEGER,0);
      auxnullable = new FieldDef("auxnullable",FieldDef.CHAR,1);
      auxdescription = new FieldDef("auxdescription",FieldDef.CHAR,255);
      auxprintable = new FieldDef("auxprintable",FieldDef.CHAR,1);
      auxtextoayuda = new FieldDef("auxtextoayuda",FieldDef.CHAR,255);
      auxorden = new FieldDef("auxorden",FieldDef.INTEGER,0);
      auxauxiliar = new FieldDef("auxauxiliar",FieldDef.CHAR,255);
      auxpickup = new FieldDef("auxpickup",FieldDef.CHAR,255);
      FieldDef array[] = {
        auxcodigo,
        auxhoja,
        auxtable,
        auxname,
        auxtype,
        auxlength,
        auxscale,
        auxnullable,
        auxdescription,
        auxprintable,
        auxtextoayuda,
        auxorden,
        auxauxiliar,
        auxpickup        
        };
      setColumns(array);
      FieldDef arrayf[] = {auxcodigo };
      setDescription("Definición campos auxiliares");
      setPrimaryKeys(arrayf);
      auxcodigo.setAutoIncrementable(true);
      auxcodigo.setDescription("Código campo");
      auxtable.setDescription("Tabla donde pertenece el campo");
      auxname.setDescription("FieldDef.name");
      auxtype.setDescription("FieldDef.type");
      auxlength.setDescription("FieldDef.length");
      auxscale.setDescription("FieldDef.scale");
      auxnullable.setDescription("FieldDef.nullable");
      auxdescription.setDescription("FieldDef.description");
      auxprintable.setDescription("Printable");
      auxtextoayuda.setDescription("Texto Ayuda");
      auxorden.setDescription("Orden visualización");
      auxauxiliar.setDescription("Opciones de cuadro de selección introducidas de forma manual.");
      auxpickup.setDescription("Opciones de cuadro de selección alimentadas por información guardada en tablas.");
      }
    }
    
  public class TabAuxclientes extends TableDef
    {
    // Campos
    public FieldDef auxcodicli;
    public FieldDef axthoja;
    public FieldDef axtcodigo;
    public TabAuxclientes(String name)
      {
      super(name);
      auxcodicli = new FieldDef("auxcodicli",FieldDef.INTEGER,0);
      axthoja = new FieldDef("axthoja",FieldDef.INTEGER,0);
      axtcodigo = new FieldDef("axtcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        auxcodicli,
        axthoja,
        axtcodigo        
        };
      setColumns(array);
      FieldDef arrayf[] = {axtcodigo };
      setDescription("Auxiliares Clientes");
      setPrimaryKeys(arrayf);
      auxcodicli.setDescription("Codigo Cliente");
      axtcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabAuxexpe extends TableDef
    {
    // Campos
    public FieldDef auxcodiexpe;
    public FieldDef axthoja;
    public FieldDef axtcodigo;
    public TabAuxexpe(String name)
      {
      super(name);
      auxcodiexpe = new FieldDef("auxcodiexpe",FieldDef.CHAR,10,FieldDef.NOTNULL);
      axthoja = new FieldDef("axthoja",FieldDef.INTEGER,0);
      axtcodigo = new FieldDef("axtcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        auxcodiexpe,
        axthoja,
        axtcodigo        
        };
      setColumns(array);
      FieldDef arrayf[] = {axtcodigo };
      setDescription("Auxiliares Expedientes");
      setPrimaryKeys(arrayf);
      auxcodiexpe.setDescription("Codigo Expediente");
      axtcodigo.setAutoIncrementable(true);
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
    
  public class TabHclientes extends TableDef
    {
    // Campos
    public FieldDef hlasesor;
    public FieldDef hlcolectivo;
    public FieldDef hlcodigo;
    public FieldDef hlprimer;
    public FieldDef hlsegundo;
    public FieldDef hlnombre;
    public FieldDef hlsg;
    public FieldDef hlcalle;
    public FieldDef hlnumero;
    public FieldDef hlescalera;
    public FieldDef hlpiso;
    public FieldDef hlletra;
    public FieldDef hlpoblacion;
    public FieldDef hlc_postal;
    public FieldDef hlprovincia;
    public FieldDef hltelefono1;
    public FieldDef hltelefono2;
    public FieldDef hlcif;
    public FieldDef hlgestiones;
    public FieldDef hlprovvig;
    public FieldDef hlhonorvig;
    public FieldDef hlsuplidvig;
    public FieldDef hlsupivavig;
    public FieldDef hlbasevig;
    public FieldDef hlivavig;
    public FieldDef hlirpfvig;
    public FieldDef hlsaldovig;
    public FieldDef hlprovanual;
    public FieldDef hlhonoranual;
    public FieldDef hlsuplidanual;
    public FieldDef hlsupivaanual;
    public FieldDef hlbaseanual;
    public FieldDef hlivaanual;
    public FieldDef hlirpfanual;
    public FieldDef hlcalleavis;
    public FieldDef hlnumeroavis;
    public FieldDef hlescaleraavis;
    public FieldDef hlpisoavis;
    public FieldDef hlletraavis;
    public FieldDef hlpoblacionavis;
    public FieldDef hlc_postalavis;
    public FieldDef hlprovinciaavis;
    public FieldDef hlfpago;
    public FieldDef hlresponsable;
    public FieldDef hldescuento;
    public FieldDef hlformato;
    public FieldDef hltipocon;
    public FieldDef hlirpf;
    public FieldDef hlempresa;
    public FieldDef hltarifa;
    public FieldDef hlsubcta;
    public FieldDef hlrepresentante;
    public FieldDef hlcomercial;
    public FieldDef hlnombrecomp;
    public FieldDef hldescuentovig;
    public FieldDef hltitavis;
    public FieldDef hldireccomp;
    public FieldDef hldireccompavis;
    public FieldDef hldevengocobro;
    public FieldDef hlfax;
    public FieldDef hlemail;
    public FieldDef hllibre3;
    public FieldDef hlusuario;
    public FieldDef hlfechaalta;
    public FieldDef hlfechabaja;
    public FieldDef hlfechaultfra;
    public FieldDef hlinactivo;
    public FieldDef hlclimaster;
    public FieldDef hlobserv;
    public FieldDef hlsgavis;
    public FieldDef hlmunicipio;
    public FieldDef hlmunicipioavis;
    public FieldDef hldomiciliacion;
    public FieldDef hlivadefecto;
    public FieldDef hlirpfdefecto;
    public FieldDef hltipofpago;
    public FieldDef hltipodesglbanc;
    public FieldDef hldomiasesor;
    public FieldDef hltiponormadomi;
    public FieldDef hlcolaborador;
    public FieldDef hlfpago2;
    public FieldDef hlporcenirpf;
    public TabHclientes(String name)
      {
      super(name);
      hlasesor = new FieldDef("hlasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hlcolectivo = new FieldDef("hlcolectivo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hlcodigo = new FieldDef("hlcodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      hlprimer = new FieldDef("hlprimer",FieldDef.CHAR,60);
      hlsegundo = new FieldDef("hlsegundo",FieldDef.CHAR,45);
      hlnombre = new FieldDef("hlnombre",FieldDef.CHAR,30);
      hlsg = new FieldDef("hlsg",FieldDef.CHAR,2);
      hlcalle = new FieldDef("hlcalle",FieldDef.CHAR,60);
      hlnumero = new FieldDef("hlnumero",FieldDef.CHAR,5);
      hlescalera = new FieldDef("hlescalera",FieldDef.CHAR,2);
      hlpiso = new FieldDef("hlpiso",FieldDef.CHAR,2);
      hlletra = new FieldDef("hlletra",FieldDef.CHAR,2);
      hlpoblacion = new FieldDef("hlpoblacion",FieldDef.CHAR,30);
      hlc_postal = new FieldDef("hlc_postal",FieldDef.CHAR,7);
      hlprovincia = new FieldDef("hlprovincia",FieldDef.INTEGER,0);
      hltelefono1 = new FieldDef("hltelefono1",FieldDef.CHAR,12);
      hltelefono2 = new FieldDef("hltelefono2",FieldDef.CHAR,12);
      hlcif = new FieldDef("hlcif",FieldDef.CHAR,15);
      hlgestiones = new FieldDef("hlgestiones",FieldDef.CHAR,50);
      hlprovvig = new FieldDef("hlprovvig",FieldDef.FLOAT,6,0);
      hlhonorvig = new FieldDef("hlhonorvig",FieldDef.FLOAT,6,0);
      hlsuplidvig = new FieldDef("hlsuplidvig",FieldDef.FLOAT,6,0);
      hlsupivavig = new FieldDef("hlsupivavig",FieldDef.FLOAT,6,0);
      hlbasevig = new FieldDef("hlbasevig",FieldDef.FLOAT,6,0);
      hlivavig = new FieldDef("hlivavig",FieldDef.FLOAT,6,0);
      hlirpfvig = new FieldDef("hlirpfvig",FieldDef.FLOAT,6,0);
      hlsaldovig = new FieldDef("hlsaldovig",FieldDef.FLOAT,6,0);
      hlprovanual = new FieldDef("hlprovanual",FieldDef.FLOAT,6,0);
      hlhonoranual = new FieldDef("hlhonoranual",FieldDef.FLOAT,6,0);
      hlsuplidanual = new FieldDef("hlsuplidanual",FieldDef.FLOAT,6,0);
      hlsupivaanual = new FieldDef("hlsupivaanual",FieldDef.FLOAT,6,0);
      hlbaseanual = new FieldDef("hlbaseanual",FieldDef.FLOAT,6,0);
      hlivaanual = new FieldDef("hlivaanual",FieldDef.FLOAT,6,0);
      hlirpfanual = new FieldDef("hlirpfanual",FieldDef.FLOAT,6,0);
      hlcalleavis = new FieldDef("hlcalleavis",FieldDef.CHAR,60);
      hlnumeroavis = new FieldDef("hlnumeroavis",FieldDef.CHAR,5);
      hlescaleraavis = new FieldDef("hlescaleraavis",FieldDef.CHAR,2);
      hlpisoavis = new FieldDef("hlpisoavis",FieldDef.CHAR,2);
      hlletraavis = new FieldDef("hlletraavis",FieldDef.CHAR,2);
      hlpoblacionavis = new FieldDef("hlpoblacionavis",FieldDef.CHAR,30);
      hlc_postalavis = new FieldDef("hlc_postalavis",FieldDef.CHAR,7);
      hlprovinciaavis = new FieldDef("hlprovinciaavis",FieldDef.INTEGER,0);
      hlfpago = new FieldDef("hlfpago",FieldDef.INTEGER,0);
      hlresponsable = new FieldDef("hlresponsable",FieldDef.CHAR,25);
      hldescuento = new FieldDef("hldescuento",FieldDef.FLOAT,6,0);
      hlformato = new FieldDef("hlformato",FieldDef.CHAR,2);
      hltipocon = new FieldDef("hltipocon",FieldDef.INTEGER,0);
      hlirpf = new FieldDef("hlirpf",FieldDef.CHAR,1);
      hlempresa = new FieldDef("hlempresa",FieldDef.INTEGER,0);
      hltarifa = new FieldDef("hltarifa",FieldDef.CHAR,15);
      hlsubcta = new FieldDef("hlsubcta",FieldDef.CHAR,10);
      hlrepresentante = new FieldDef("hlrepresentante",FieldDef.CHAR,3);
      hlcomercial = new FieldDef("hlcomercial",FieldDef.CHAR,3);
      hlnombrecomp = new FieldDef("hlnombrecomp",FieldDef.CHAR,120);
      hldescuentovig = new FieldDef("hldescuentovig",FieldDef.FLOAT,6,0);
      hltitavis = new FieldDef("hltitavis",FieldDef.CHAR,60);
      hldireccomp = new FieldDef("hldireccomp",FieldDef.CHAR,120);
      hldireccompavis = new FieldDef("hldireccompavis",FieldDef.CHAR,120);
      hldevengocobro = new FieldDef("hldevengocobro",FieldDef.CHAR,1);
      hlfax = new FieldDef("hlfax",FieldDef.CHAR,12);
      hlemail = new FieldDef("hlemail",FieldDef.CHAR,80);
      hllibre3 = new FieldDef("hllibre3",FieldDef.CHAR,10);
      hlusuario = new FieldDef("hlusuario",FieldDef.CHAR,25);
      hlfechaalta = new FieldDef("hlfechaalta",FieldDef.DATE);
      hlfechabaja = new FieldDef("hlfechabaja",FieldDef.DATE);
      hlfechaultfra = new FieldDef("hlfechaultfra",FieldDef.DATE);
      hlinactivo = new FieldDef("hlinactivo",FieldDef.CHAR,1);
      hlclimaster = new FieldDef("hlclimaster",FieldDef.CHAR,1);
      hlobserv = new FieldDef("hlobserv",FieldDef.CHAR,2000);
      hlsgavis = new FieldDef("hlsgavis",FieldDef.CHAR,2);
      hlmunicipio = new FieldDef("hlmunicipio",FieldDef.INTEGER,0);
      hlmunicipioavis = new FieldDef("hlmunicipioavis",FieldDef.INTEGER,0);
      hldomiciliacion = new FieldDef("hldomiciliacion",FieldDef.INTEGER,0);
      hlivadefecto = new FieldDef("hlivadefecto",FieldDef.INTEGER,0);
      hlirpfdefecto = new FieldDef("hlirpfdefecto",FieldDef.INTEGER,0);
      hltipofpago = new FieldDef("hltipofpago",FieldDef.CHAR,2);
      hltipodesglbanc = new FieldDef("hltipodesglbanc",FieldDef.CHAR,1);
      hldomiasesor = new FieldDef("hldomiasesor",FieldDef.INTEGER,0);
      hltiponormadomi = new FieldDef("hltiponormadomi",FieldDef.CHAR,2);
      hlcolaborador = new FieldDef("hlcolaborador",FieldDef.CHAR,15);
      hlfpago2 = new FieldDef("hlfpago2",FieldDef.INTEGER,0);
      hlporcenirpf = new FieldDef("hlporcenirpf",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        hlasesor,
        hlcolectivo,
        hlcodigo,
        hlprimer,
        hlsegundo,
        hlnombre,
        hlsg,
        hlcalle,
        hlnumero,
        hlescalera,
        hlpiso,
        hlletra,
        hlpoblacion,
        hlc_postal,
        hlprovincia,
        hltelefono1,
        hltelefono2,
        hlcif,
        hlgestiones,
        hlprovvig,
        hlhonorvig,
        hlsuplidvig,
        hlsupivavig,
        hlbasevig,
        hlivavig,
        hlirpfvig,
        hlsaldovig,
        hlprovanual,
        hlhonoranual,
        hlsuplidanual,
        hlsupivaanual,
        hlbaseanual,
        hlivaanual,
        hlirpfanual,
        hlcalleavis,
        hlnumeroavis,
        hlescaleraavis,
        hlpisoavis,
        hlletraavis,
        hlpoblacionavis,
        hlc_postalavis,
        hlprovinciaavis,
        hlfpago,
        hlresponsable,
        hldescuento,
        hlformato,
        hltipocon,
        hlirpf,
        hlempresa,
        hltarifa,
        hlsubcta,
        hlrepresentante,
        hlcomercial,
        hlnombrecomp,
        hldescuentovig,
        hltitavis,
        hldireccomp,
        hldireccompavis,
        hldevengocobro,
        hlfax,
        hlemail,
        hllibre3,
        hlusuario,
        hlfechaalta,
        hlfechabaja,
        hlfechaultfra,
        hlinactivo,
        hlclimaster,
        hlobserv,
        hlsgavis,
        hlmunicipio,
        hlmunicipioavis,
        hldomiciliacion,
        hlivadefecto,
        hlirpfdefecto,
        hltipofpago,
        hltipodesglbanc,
        hldomiasesor,
        hltiponormadomi,
        hlcolaborador,
        hlfpago2,
        hlporcenirpf        
        };
      setColumns(array);
      FieldDef arrayf[] = {hlasesor,hlcolectivo,hlcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabHexpe extends TableDef
    {
    // Campos
    public FieldDef hxasesor;
    public FieldDef hxtipo;
    public FieldDef hxcodigo;
    public FieldDef hxexpediente;
    public FieldDef hxcliente;
    public FieldDef hxnomtit;
    public FieldDef hxsgtit;
    public FieldDef hxviatit;
    public FieldDef hxnumtit;
    public FieldDef hxesctit;
    public FieldDef hxpisotit;
    public FieldDef hxletratit;
    public FieldDef hxpobtit;
    public FieldDef hxcpostaltit;
    public FieldDef hxprovtit;
    public FieldDef hxciftit;
    public FieldDef hxcolaborador;
    public FieldDef hxrefcolab;
    public FieldDef hxgestion;
    public FieldDef hxdescripcion;
    public FieldDef hxfecinici;
    public FieldDef hxfecultfra;
    public FieldDef hxfecbaja;
    public FieldDef hxtipocon;
    public FieldDef hxtipoiva;
    public FieldDef hxfpago;
    public FieldDef hxresponsable;
    public FieldDef hxdescuento;
    public FieldDef hxforfra;
    public FieldDef hxirpfsn;
    public FieldDef hxempresa;
    public FieldDef hxtarifa;
    public FieldDef hxfacturaciona;
    public FieldDef hxdomiciliacion;
    public FieldDef hxrepresentante;
    public FieldDef hxcomercial;
    public FieldDef hxprovisiones;
    public FieldDef hxsuplidos;
    public FieldDef hxsuplidosiva;
    public FieldDef hxhonorarios;
    public FieldDef hxbase;
    public FieldDef hxiva;
    public FieldDef hxirpf;
    public FieldDef hxsaldo;
    public FieldDef hxauxiliar;
    public FieldDef hxacum_dto;
    public FieldDef hxtitular;
    public FieldDef hxdireccomp;
    public FieldDef hxusuario;
    public FieldDef hxfrecuencia;
    public FieldDef hxultimoany;
    public FieldDef hxultimomes;
    public FieldDef hxultimaqui;
    public FieldDef hxempresanom;
    public FieldDef hxcuotassegsoc;
    public FieldDef hxcuotairpf;
    public FieldDef hxtarifanomina;
    public FieldDef hxtarifairpf;
    public FieldDef hxempresaeos;
    public FieldDef hxtipopago;
    public FieldDef hxcaducidad;
    public FieldDef hxenlazado;
    public FieldDef hxempresacon;
    public FieldDef hxtarifaconta;
    public FieldDef hxivadefecto;
    public FieldDef hxirpfdefecto;
    public FieldDef hxtipofpago;
    public FieldDef hxtipodesglbanc;
    public FieldDef hxdomiasesor;
    public FieldDef hxtiponormadomi;
    public FieldDef hexfpago2;
    public FieldDef hxcolectivo;
    public TabHexpe(String name)
      {
      super(name);
      hxasesor = new FieldDef("hxasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hxtipo = new FieldDef("hxtipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      hxcodigo = new FieldDef("hxcodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      hxexpediente = new FieldDef("hxexpediente",FieldDef.CHAR,15);
      hxcliente = new FieldDef("hxcliente",FieldDef.CHAR,15);
      hxnomtit = new FieldDef("hxnomtit",FieldDef.CHAR,40);
      hxsgtit = new FieldDef("hxsgtit",FieldDef.CHAR,2);
      hxviatit = new FieldDef("hxviatit",FieldDef.CHAR,40);
      hxnumtit = new FieldDef("hxnumtit",FieldDef.CHAR,5);
      hxesctit = new FieldDef("hxesctit",FieldDef.CHAR,2);
      hxpisotit = new FieldDef("hxpisotit",FieldDef.CHAR,2);
      hxletratit = new FieldDef("hxletratit",FieldDef.CHAR,2);
      hxpobtit = new FieldDef("hxpobtit",FieldDef.CHAR,30);
      hxcpostaltit = new FieldDef("hxcpostaltit",FieldDef.CHAR,7);
      hxprovtit = new FieldDef("hxprovtit",FieldDef.INTEGER,0);
      hxciftit = new FieldDef("hxciftit",FieldDef.CHAR,15);
      hxcolaborador = new FieldDef("hxcolaborador",FieldDef.CHAR,15);
      hxrefcolab = new FieldDef("hxrefcolab",FieldDef.CHAR,10);
      hxgestion = new FieldDef("hxgestion",FieldDef.CHAR,3);
      hxdescripcion = new FieldDef("hxdescripcion",FieldDef.CHAR,2000);
      hxfecinici = new FieldDef("hxfecinici",FieldDef.DATE);
      hxfecultfra = new FieldDef("hxfecultfra",FieldDef.DATE);
      hxfecbaja = new FieldDef("hxfecbaja",FieldDef.DATE);
      hxtipocon = new FieldDef("hxtipocon",FieldDef.INTEGER,0);
      hxtipoiva = new FieldDef("hxtipoiva",FieldDef.FLOAT,6,0);
      hxfpago = new FieldDef("hxfpago",FieldDef.INTEGER,0);
      hxresponsable = new FieldDef("hxresponsable",FieldDef.CHAR,25);
      hxdescuento = new FieldDef("hxdescuento",FieldDef.FLOAT,6,0);
      hxforfra = new FieldDef("hxforfra",FieldDef.CHAR,2);
      hxirpfsn = new FieldDef("hxirpfsn",FieldDef.CHAR,1);
      hxempresa = new FieldDef("hxempresa",FieldDef.INTEGER,0);
      hxtarifa = new FieldDef("hxtarifa",FieldDef.CHAR,15);
      hxfacturaciona = new FieldDef("hxfacturaciona",FieldDef.CHAR,1);
      hxdomiciliacion = new FieldDef("hxdomiciliacion",FieldDef.INTEGER,0);
      hxrepresentante = new FieldDef("hxrepresentante",FieldDef.CHAR,3);
      hxcomercial = new FieldDef("hxcomercial",FieldDef.CHAR,3);
      hxprovisiones = new FieldDef("hxprovisiones",FieldDef.FLOAT,6,0);
      hxsuplidos = new FieldDef("hxsuplidos",FieldDef.FLOAT,6,0);
      hxsuplidosiva = new FieldDef("hxsuplidosiva",FieldDef.FLOAT,6,0);
      hxhonorarios = new FieldDef("hxhonorarios",FieldDef.FLOAT,6,0);
      hxbase = new FieldDef("hxbase",FieldDef.FLOAT,6,0);
      hxiva = new FieldDef("hxiva",FieldDef.FLOAT,6,0);
      hxirpf = new FieldDef("hxirpf",FieldDef.FLOAT,6,0);
      hxsaldo = new FieldDef("hxsaldo",FieldDef.FLOAT,6,0);
      hxauxiliar = new FieldDef("hxauxiliar",FieldDef.CHAR,15);
      hxacum_dto = new FieldDef("hxacum_dto",FieldDef.FLOAT,6,0);
      hxtitular = new FieldDef("hxtitular",FieldDef.CHAR,15);
      hxdireccomp = new FieldDef("hxdireccomp",FieldDef.CHAR,60);
      hxusuario = new FieldDef("hxusuario",FieldDef.CHAR,25);
      hxfrecuencia = new FieldDef("hxfrecuencia",FieldDef.CHAR,1);
      hxultimoany = new FieldDef("hxultimoany",FieldDef.INTEGER,0);
      hxultimomes = new FieldDef("hxultimomes",FieldDef.INTEGER,0);
      hxultimaqui = new FieldDef("hxultimaqui",FieldDef.INTEGER,0);
      hxempresanom = new FieldDef("hxempresanom",FieldDef.INTEGER,0);
      hxcuotassegsoc = new FieldDef("hxcuotassegsoc",FieldDef.CHAR,1);
      hxcuotairpf = new FieldDef("hxcuotairpf",FieldDef.CHAR,1);
      hxtarifanomina = new FieldDef("hxtarifanomina",FieldDef.INTEGER,0);
      hxtarifairpf = new FieldDef("hxtarifairpf",FieldDef.INTEGER,0);
      hxempresaeos = new FieldDef("hxempresaeos",FieldDef.INTEGER,0);
      hxtipopago = new FieldDef("hxtipopago",FieldDef.CHAR,1);
      hxcaducidad = new FieldDef("hxcaducidad",FieldDef.INTEGER,0);
      hxenlazado = new FieldDef("hxenlazado",FieldDef.CHAR,1);
      hxempresacon = new FieldDef("hxempresacon",FieldDef.INTEGER,0);
      hxtarifaconta = new FieldDef("hxtarifaconta",FieldDef.INTEGER,0);
      hxivadefecto = new FieldDef("hxivadefecto",FieldDef.INTEGER,0);
      hxirpfdefecto = new FieldDef("hxirpfdefecto",FieldDef.INTEGER,0);
      hxtipofpago = new FieldDef("hxtipofpago",FieldDef.CHAR,2);
      hxtipodesglbanc = new FieldDef("hxtipodesglbanc",FieldDef.CHAR,1);
      hxdomiasesor = new FieldDef("hxdomiasesor",FieldDef.INTEGER,0);
      hxtiponormadomi = new FieldDef("hxtiponormadomi",FieldDef.CHAR,2);
      hexfpago2 = new FieldDef("hexfpago2",FieldDef.INTEGER,0);
      hxcolectivo = new FieldDef("hxcolectivo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        hxasesor,
        hxtipo,
        hxcodigo,
        hxexpediente,
        hxcliente,
        hxnomtit,
        hxsgtit,
        hxviatit,
        hxnumtit,
        hxesctit,
        hxpisotit,
        hxletratit,
        hxpobtit,
        hxcpostaltit,
        hxprovtit,
        hxciftit,
        hxcolaborador,
        hxrefcolab,
        hxgestion,
        hxdescripcion,
        hxfecinici,
        hxfecultfra,
        hxfecbaja,
        hxtipocon,
        hxtipoiva,
        hxfpago,
        hxresponsable,
        hxdescuento,
        hxforfra,
        hxirpfsn,
        hxempresa,
        hxtarifa,
        hxfacturaciona,
        hxdomiciliacion,
        hxrepresentante,
        hxcomercial,
        hxprovisiones,
        hxsuplidos,
        hxsuplidosiva,
        hxhonorarios,
        hxbase,
        hxiva,
        hxirpf,
        hxsaldo,
        hxauxiliar,
        hxacum_dto,
        hxtitular,
        hxdireccomp,
        hxusuario,
        hxfrecuencia,
        hxultimoany,
        hxultimomes,
        hxultimaqui,
        hxempresanom,
        hxcuotassegsoc,
        hxcuotairpf,
        hxtarifanomina,
        hxtarifairpf,
        hxempresaeos,
        hxtipopago,
        hxcaducidad,
        hxenlazado,
        hxempresacon,
        hxtarifaconta,
        hxivadefecto,
        hxirpfdefecto,
        hxtipofpago,
        hxtipodesglbanc,
        hxdomiasesor,
        hxtiponormadomi,
        hexfpago2,
        hxcolectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {hxasesor,hxtipo,hxcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSeries extends TableDef
    {
    // Campos
    public FieldDef srasesor;
    public FieldDef srentidad;
    public FieldDef srcodigo;
    public FieldDef srejer;
    public FieldDef srdescrip;
    public FieldDef srultnum;
    public FieldDef sriva;
    public TabSeries(String name)
      {
      super(name);
      srasesor = new FieldDef("srasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      srentidad = new FieldDef("srentidad",FieldDef.CHAR,1,FieldDef.NOTNULL);
      srcodigo = new FieldDef("srcodigo",FieldDef.CHAR,10,FieldDef.NOTNULL);
      srejer = new FieldDef("srejer",FieldDef.INTEGER,0);
      srdescrip = new FieldDef("srdescrip",FieldDef.CHAR,30);
      srultnum = new FieldDef("srultnum",FieldDef.INTEGER,0);
      sriva = new FieldDef("sriva",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        srasesor,
        srentidad,
        srcodigo,
        srejer,
        srdescrip,
        srultnum,
        sriva        
        };
      setColumns(array);
      FieldDef arrayf[] = {srasesor,srentidad,srcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabMovtos extends TableDef
    {
    // Campos
    public FieldDef movcodigo;
    public FieldDef movasesor;
    public FieldDef movcliente;
    public FieldDef movexpediente;
    public FieldDef movcolaborador;
    public FieldDef movfecha;
    public FieldDef movcontador;
    public FieldDef movrealprefac;
    public FieldDef movdescripcion;
    public FieldDef movoperacion;
    public FieldDef movgestion;
    public FieldDef movtramite;
    public FieldDef moventidad;
    public FieldDef movserie;
    public FieldDef movfactura;
    public FieldDef movunidades;
    public FieldDef movimpunitario;
    public FieldDef movimporte;
    public FieldDef movsuplidos;
    public FieldDef movhonorarios;
    public FieldDef movbase;
    public FieldDef moviva;
    public FieldDef movirpf;
    public FieldDef movsefac;
    public FieldDef movdescuento;
    public FieldDef movfporc_iva;
    public FieldDef movfporc_irpf;
    public FieldDef movcodiiva;
    public FieldDef movcodirpf;
    public FieldDef movcodcajalin;
    public FieldDef movcodfactura;
    public FieldDef movcodabonodet;
    public FieldDef movcolectivo;
    public TabMovtos(String name)
      {
      super(name);
      movcodigo = new FieldDef("movcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      movasesor = new FieldDef("movasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      movcliente = new FieldDef("movcliente",FieldDef.CHAR,15);
      movexpediente = new FieldDef("movexpediente",FieldDef.CHAR,15);
      movcolaborador = new FieldDef("movcolaborador",FieldDef.CHAR,15);
      movfecha = new FieldDef("movfecha",FieldDef.DATE);
      movcontador = new FieldDef("movcontador",FieldDef.CHAR,13);
      movrealprefac = new FieldDef("movrealprefac",FieldDef.CHAR,1);
      movdescripcion = new FieldDef("movdescripcion",FieldDef.CHAR,30);
      movoperacion = new FieldDef("movoperacion",FieldDef.CHAR,2);
      movgestion = new FieldDef("movgestion",FieldDef.CHAR,15);
      movtramite = new FieldDef("movtramite",FieldDef.INTEGER,0);
      moventidad = new FieldDef("moventidad",FieldDef.CHAR,1);
      movserie = new FieldDef("movserie",FieldDef.CHAR,10);
      movfactura = new FieldDef("movfactura",FieldDef.INTEGER,0);
      movunidades = new FieldDef("movunidades",FieldDef.FLOAT,6,0);
      movimpunitario = new FieldDef("movimpunitario",FieldDef.FLOAT,6,0);
      movimporte = new FieldDef("movimporte",FieldDef.FLOAT,6,0);
      movsuplidos = new FieldDef("movsuplidos",FieldDef.FLOAT,6,0);
      movhonorarios = new FieldDef("movhonorarios",FieldDef.FLOAT,6,0);
      movbase = new FieldDef("movbase",FieldDef.FLOAT,6,0);
      moviva = new FieldDef("moviva",FieldDef.FLOAT,6,0);
      movirpf = new FieldDef("movirpf",FieldDef.FLOAT,6,0);
      movsefac = new FieldDef("movsefac",FieldDef.CHAR,1);
      movdescuento = new FieldDef("movdescuento",FieldDef.FLOAT,6,0);
      movfporc_iva = new FieldDef("movfporc_iva",FieldDef.FLOAT,6,0);
      movfporc_irpf = new FieldDef("movfporc_irpf",FieldDef.FLOAT,6,0);
      movcodiiva = new FieldDef("movcodiiva",FieldDef.INTEGER,0);
      movcodirpf = new FieldDef("movcodirpf",FieldDef.INTEGER,0);
      movcodcajalin = new FieldDef("movcodcajalin",FieldDef.INTEGER,0);
      movcodfactura = new FieldDef("movcodfactura",FieldDef.INTEGER,0);
      movcodabonodet = new FieldDef("movcodabonodet",FieldDef.INTEGER,0);
      movcolectivo = new FieldDef("movcolectivo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        movcodigo,
        movasesor,
        movcliente,
        movexpediente,
        movcolaborador,
        movfecha,
        movcontador,
        movrealprefac,
        movdescripcion,
        movoperacion,
        movgestion,
        movtramite,
        moventidad,
        movserie,
        movfactura,
        movunidades,
        movimpunitario,
        movimporte,
        movsuplidos,
        movhonorarios,
        movbase,
        moviva,
        movirpf,
        movsefac,
        movdescuento,
        movfporc_iva,
        movfporc_irpf,
        movcodiiva,
        movcodirpf,
        movcodcajalin,
        movcodfactura,
        movcodabonodet,
        movcolectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {movcodigo };
      setPrimaryKeys(arrayf);
      movcodigo.setAutoIncrementable(true);
      moventidad.setDescription("TIPO ENTIDAD:  1=FACTURA  2=ALBARAN 3=PRESSUPUESTO 9=SIMULACION");
      }
    }
    
  public class TabHmovtos extends TableDef
    {
    // Campos
    public FieldDef hovcodigo;
    public FieldDef hovasesor;
    public FieldDef hovcliente;
    public FieldDef hovexpediente;
    public FieldDef hovcolaborador;
    public FieldDef hovfecha;
    public FieldDef hovcontador;
    public FieldDef hovrealprefac;
    public FieldDef hovdescripcion;
    public FieldDef hovoperacion;
    public FieldDef hovgestion;
    public FieldDef hovtramite;
    public FieldDef hoventidad;
    public FieldDef hovserie;
    public FieldDef hovfactura;
    public FieldDef hovunidades;
    public FieldDef hovimpunitario;
    public FieldDef hovimporte;
    public FieldDef hovsuplidos;
    public FieldDef hovhonorarios;
    public FieldDef hovbase;
    public FieldDef hoviva;
    public FieldDef hovirpf;
    public FieldDef hovsefac;
    public FieldDef hovdescuento;
    public FieldDef hovfporc_iva;
    public FieldDef hovfporc_irpf;
    public FieldDef hovcodiiva;
    public FieldDef hovcodirpf;
    public FieldDef hovcodcajalin;
    public FieldDef hovcodfactura;
    public FieldDef hovcodabonodet;
    public FieldDef hovcolectivo;
    public TabHmovtos(String name)
      {
      super(name);
      hovcodigo = new FieldDef("hovcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hovasesor = new FieldDef("hovasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hovcliente = new FieldDef("hovcliente",FieldDef.CHAR,15);
      hovexpediente = new FieldDef("hovexpediente",FieldDef.CHAR,15);
      hovcolaborador = new FieldDef("hovcolaborador",FieldDef.CHAR,15);
      hovfecha = new FieldDef("hovfecha",FieldDef.DATE);
      hovcontador = new FieldDef("hovcontador",FieldDef.CHAR,13);
      hovrealprefac = new FieldDef("hovrealprefac",FieldDef.CHAR,1);
      hovdescripcion = new FieldDef("hovdescripcion",FieldDef.CHAR,30);
      hovoperacion = new FieldDef("hovoperacion",FieldDef.CHAR,2);
      hovgestion = new FieldDef("hovgestion",FieldDef.CHAR,15);
      hovtramite = new FieldDef("hovtramite",FieldDef.INTEGER,0);
      hoventidad = new FieldDef("hoventidad",FieldDef.CHAR,1);
      hovserie = new FieldDef("hovserie",FieldDef.CHAR,10);
      hovfactura = new FieldDef("hovfactura",FieldDef.INTEGER,0);
      hovunidades = new FieldDef("hovunidades",FieldDef.FLOAT,6,0);
      hovimpunitario = new FieldDef("hovimpunitario",FieldDef.FLOAT,6,0);
      hovimporte = new FieldDef("hovimporte",FieldDef.FLOAT,6,0);
      hovsuplidos = new FieldDef("hovsuplidos",FieldDef.FLOAT,6,0);
      hovhonorarios = new FieldDef("hovhonorarios",FieldDef.FLOAT,6,0);
      hovbase = new FieldDef("hovbase",FieldDef.FLOAT,6,0);
      hoviva = new FieldDef("hoviva",FieldDef.FLOAT,6,0);
      hovirpf = new FieldDef("hovirpf",FieldDef.FLOAT,6,0);
      hovsefac = new FieldDef("hovsefac",FieldDef.CHAR,1);
      hovdescuento = new FieldDef("hovdescuento",FieldDef.FLOAT,6,0);
      hovfporc_iva = new FieldDef("hovfporc_iva",FieldDef.FLOAT,6,0);
      hovfporc_irpf = new FieldDef("hovfporc_irpf",FieldDef.FLOAT,6,0);
      hovcodiiva = new FieldDef("hovcodiiva",FieldDef.INTEGER,0);
      hovcodirpf = new FieldDef("hovcodirpf",FieldDef.INTEGER,0);
      hovcodcajalin = new FieldDef("hovcodcajalin",FieldDef.INTEGER,0);
      hovcodfactura = new FieldDef("hovcodfactura",FieldDef.INTEGER,0);
      hovcodabonodet = new FieldDef("hovcodabonodet",FieldDef.INTEGER,0);
      hovcolectivo = new FieldDef("hovcolectivo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        hovcodigo,
        hovasesor,
        hovcliente,
        hovexpediente,
        hovcolaborador,
        hovfecha,
        hovcontador,
        hovrealprefac,
        hovdescripcion,
        hovoperacion,
        hovgestion,
        hovtramite,
        hoventidad,
        hovserie,
        hovfactura,
        hovunidades,
        hovimpunitario,
        hovimporte,
        hovsuplidos,
        hovhonorarios,
        hovbase,
        hoviva,
        hovirpf,
        hovsefac,
        hovdescuento,
        hovfporc_iva,
        hovfporc_irpf,
        hovcodiiva,
        hovcodirpf,
        hovcodcajalin,
        hovcodfactura,
        hovcodabonodet,
        hovcolectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {hovcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabMovtotext extends TableDef
    {
    // Campos
    public FieldDef movtcodigo;
    public FieldDef movtasesor;
    public FieldDef movtcodmovtos;
    public FieldDef movttexto;
    public TabMovtotext(String name)
      {
      super(name);
      movtcodigo = new FieldDef("movtcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      movtasesor = new FieldDef("movtasesor",FieldDef.INTEGER,0);
      movtcodmovtos = new FieldDef("movtcodmovtos",FieldDef.INTEGER,0);
      movttexto = new FieldDef("movttexto",FieldDef.CHAR,65);
      FieldDef array[] = {
        movtcodigo,
        movtasesor,
        movtcodmovtos,
        movttexto        
        };
      setColumns(array);
      FieldDef arrayf[] = {movtcodigo };
      setPrimaryKeys(arrayf);
      movtcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabHmovtotext extends TableDef
    {
    // Campos
    public FieldDef hovtcodigo;
    public FieldDef hovtasesor;
    public FieldDef hovtcodhovtos;
    public FieldDef hovttexto;
    public TabHmovtotext(String name)
      {
      super(name);
      hovtcodigo = new FieldDef("hovtcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hovtasesor = new FieldDef("hovtasesor",FieldDef.INTEGER,0);
      hovtcodhovtos = new FieldDef("hovtcodhovtos",FieldDef.INTEGER,0);
      hovttexto = new FieldDef("hovttexto",FieldDef.CHAR,65);
      FieldDef array[] = {
        hovtcodigo,
        hovtasesor,
        hovtcodhovtos,
        hovttexto        
        };
      setColumns(array);
      FieldDef arrayf[] = {hovtcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabFactura extends TableDef
    {
    // Campos
    public FieldDef frcodigo;
    public FieldDef frasesor;
    public FieldDef frentidad;
    public FieldDef frserie;
    public FieldDef frfactura;
    public FieldDef frexpediente;
    public FieldDef frcliente;
    public FieldDef frcolaborador;
    public FieldDef frfacturadoa;
    public FieldDef frcif;
    public FieldDef frnombre;
    public FieldDef frdomicilio;
    public FieldDef frpoblacion;
    public FieldDef frcodigopostal;
    public FieldDef frprovincia;
    public FieldDef frfechafactura;
    public FieldDef frfechacobro;
    public FieldDef frvencimiento;
    public FieldDef frfacturaalbara;
    public FieldDef frseriefraalb;
    public FieldDef frnumerofraalb;
    public FieldDef frrecibo;
    public FieldDef frregistrocobro;
    public FieldDef frprovisiones;
    public FieldDef frsuplidos;
    public FieldDef frsuplidosiva;
    public FieldDef frhonorarios;
    public FieldDef frbaseimponible;
    public FieldDef friva;
    public FieldDef frirpf;
    public FieldDef frimportefra;
    public FieldDef frcobrosfra;
    public FieldDef frsaldopdte;
    public FieldDef frdescuento;
    public FieldDef frliquido;
    public FieldDef frtipoiva01;
    public FieldDef frtipoiva02;
    public FieldDef frtipoiva03;
    public FieldDef frtipoiva04;
    public FieldDef frbaseiva01;
    public FieldDef frbaseiva02;
    public FieldDef frbaseiva03;
    public FieldDef frbaseiva04;
    public FieldDef friva01;
    public FieldDef friva02;
    public FieldDef friva03;
    public FieldDef friva04;
    public FieldDef frtipoirpf01;
    public FieldDef frtipoirpf02;
    public FieldDef frbaseirpf01;
    public FieldDef frbaseirpf02;
    public FieldDef frirpf01;
    public FieldDef frirpf02;
    public FieldDef frseimprime;
    public FieldDef frnumprints;
    public FieldDef frenlazadactaf;
    public FieldDef frenlazadactac;
    public FieldDef frcodiasientof;
    public FieldDef frcodiasientoc;
    public FieldDef frresponsable;
    public FieldDef fruser;
    public FieldDef frempresajconta;
    public FieldDef frtipoconta;
    public FieldDef frcodcajalin;
    public FieldDef frejerjconta;
    public FieldDef frcodiasientoa;
    public FieldDef frdomiasesor;
    public FieldDef frtiponormadomi;
    public FieldDef frcolectivo;
    public FieldDef frrcomercial;
    public FieldDef frrepresentante;
    public TabFactura(String name)
      {
      super(name);
      frcodigo = new FieldDef("frcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      frasesor = new FieldDef("frasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      frentidad = new FieldDef("frentidad",FieldDef.CHAR,1);
      frserie = new FieldDef("frserie",FieldDef.CHAR,10);
      frfactura = new FieldDef("frfactura",FieldDef.INTEGER,0);
      frexpediente = new FieldDef("frexpediente",FieldDef.CHAR,15);
      frcliente = new FieldDef("frcliente",FieldDef.CHAR,15);
      frcolaborador = new FieldDef("frcolaborador",FieldDef.CHAR,15);
      frfacturadoa = new FieldDef("frfacturadoa",FieldDef.CHAR,1);
      frcif = new FieldDef("frcif",FieldDef.CHAR,15);
      frnombre = new FieldDef("frnombre",FieldDef.CHAR,45);
      frdomicilio = new FieldDef("frdomicilio",FieldDef.CHAR,40);
      frpoblacion = new FieldDef("frpoblacion",FieldDef.CHAR,30);
      frcodigopostal = new FieldDef("frcodigopostal",FieldDef.CHAR,7);
      frprovincia = new FieldDef("frprovincia",FieldDef.INTEGER,0);
      frfechafactura = new FieldDef("frfechafactura",FieldDef.DATE);
      frfechacobro = new FieldDef("frfechacobro",FieldDef.DATE);
      frvencimiento = new FieldDef("frvencimiento",FieldDef.DATE);
      frfacturaalbara = new FieldDef("frfacturaalbara",FieldDef.CHAR,1);
      frseriefraalb = new FieldDef("frseriefraalb",FieldDef.CHAR,10);
      frnumerofraalb = new FieldDef("frnumerofraalb",FieldDef.INTEGER,0);
      frrecibo = new FieldDef("frrecibo",FieldDef.INTEGER,0);
      frregistrocobro = new FieldDef("frregistrocobro",FieldDef.INTEGER,0);
      frprovisiones = new FieldDef("frprovisiones",FieldDef.FLOAT,6,0);
      frsuplidos = new FieldDef("frsuplidos",FieldDef.FLOAT,6,0);
      frsuplidosiva = new FieldDef("frsuplidosiva",FieldDef.FLOAT,6,0);
      frhonorarios = new FieldDef("frhonorarios",FieldDef.FLOAT,6,0);
      frbaseimponible = new FieldDef("frbaseimponible",FieldDef.FLOAT,6,0);
      friva = new FieldDef("friva",FieldDef.FLOAT,6,0);
      frirpf = new FieldDef("frirpf",FieldDef.FLOAT,6,0);
      frimportefra = new FieldDef("frimportefra",FieldDef.FLOAT,6,0);
      frcobrosfra = new FieldDef("frcobrosfra",FieldDef.FLOAT,6,0);
      frsaldopdte = new FieldDef("frsaldopdte",FieldDef.FLOAT,6,0);
      frdescuento = new FieldDef("frdescuento",FieldDef.FLOAT,6,0);
      frliquido = new FieldDef("frliquido",FieldDef.FLOAT,6,0);
      frtipoiva01 = new FieldDef("frtipoiva01",FieldDef.FLOAT,6,0);
      frtipoiva02 = new FieldDef("frtipoiva02",FieldDef.FLOAT,6,0);
      frtipoiva03 = new FieldDef("frtipoiva03",FieldDef.FLOAT,6,0);
      frtipoiva04 = new FieldDef("frtipoiva04",FieldDef.FLOAT,6,0);
      frbaseiva01 = new FieldDef("frbaseiva01",FieldDef.FLOAT,6,0);
      frbaseiva02 = new FieldDef("frbaseiva02",FieldDef.FLOAT,6,0);
      frbaseiva03 = new FieldDef("frbaseiva03",FieldDef.FLOAT,6,0);
      frbaseiva04 = new FieldDef("frbaseiva04",FieldDef.FLOAT,6,0);
      friva01 = new FieldDef("friva01",FieldDef.FLOAT,6,0);
      friva02 = new FieldDef("friva02",FieldDef.FLOAT,6,0);
      friva03 = new FieldDef("friva03",FieldDef.FLOAT,6,0);
      friva04 = new FieldDef("friva04",FieldDef.FLOAT,6,0);
      frtipoirpf01 = new FieldDef("frtipoirpf01",FieldDef.FLOAT,6,0);
      frtipoirpf02 = new FieldDef("frtipoirpf02",FieldDef.FLOAT,6,0);
      frbaseirpf01 = new FieldDef("frbaseirpf01",FieldDef.FLOAT,6,0);
      frbaseirpf02 = new FieldDef("frbaseirpf02",FieldDef.FLOAT,6,0);
      frirpf01 = new FieldDef("frirpf01",FieldDef.FLOAT,6,0);
      frirpf02 = new FieldDef("frirpf02",FieldDef.FLOAT,6,0);
      frseimprime = new FieldDef("frseimprime",FieldDef.CHAR,1);
      frnumprints = new FieldDef("frnumprints",FieldDef.INTEGER,0);
      frenlazadactaf = new FieldDef("frenlazadactaf",FieldDef.CHAR,1);
      frenlazadactac = new FieldDef("frenlazadactac",FieldDef.CHAR,1);
      frcodiasientof = new FieldDef("frcodiasientof",FieldDef.INTEGER,0);
      frcodiasientoc = new FieldDef("frcodiasientoc",FieldDef.INTEGER,0);
      frresponsable = new FieldDef("frresponsable",FieldDef.CHAR,25);
      fruser = new FieldDef("fruser",FieldDef.CHAR,25);
      frempresajconta = new FieldDef("frempresajconta",FieldDef.INTEGER,0);
      frtipoconta = new FieldDef("frtipoconta",FieldDef.INTEGER,0);
      frcodcajalin = new FieldDef("frcodcajalin",FieldDef.INTEGER,0);
      frejerjconta = new FieldDef("frejerjconta",FieldDef.INTEGER,0);
      frcodiasientoa = new FieldDef("frcodiasientoa",FieldDef.INTEGER,0);
      frdomiasesor = new FieldDef("frdomiasesor",FieldDef.INTEGER,0);
      frtiponormadomi = new FieldDef("frtiponormadomi",FieldDef.CHAR,2);
      frcolectivo = new FieldDef("frcolectivo",FieldDef.INTEGER,0);
      frrcomercial = new FieldDef("frrcomercial",FieldDef.CHAR,3);
      frrepresentante = new FieldDef("frrepresentante",FieldDef.CHAR,3);
      FieldDef array[] = {
        frcodigo,
        frasesor,
        frentidad,
        frserie,
        frfactura,
        frexpediente,
        frcliente,
        frcolaborador,
        frfacturadoa,
        frcif,
        frnombre,
        frdomicilio,
        frpoblacion,
        frcodigopostal,
        frprovincia,
        frfechafactura,
        frfechacobro,
        frvencimiento,
        frfacturaalbara,
        frseriefraalb,
        frnumerofraalb,
        frrecibo,
        frregistrocobro,
        frprovisiones,
        frsuplidos,
        frsuplidosiva,
        frhonorarios,
        frbaseimponible,
        friva,
        frirpf,
        frimportefra,
        frcobrosfra,
        frsaldopdte,
        frdescuento,
        frliquido,
        frtipoiva01,
        frtipoiva02,
        frtipoiva03,
        frtipoiva04,
        frbaseiva01,
        frbaseiva02,
        frbaseiva03,
        frbaseiva04,
        friva01,
        friva02,
        friva03,
        friva04,
        frtipoirpf01,
        frtipoirpf02,
        frbaseirpf01,
        frbaseirpf02,
        frirpf01,
        frirpf02,
        frseimprime,
        frnumprints,
        frenlazadactaf,
        frenlazadactac,
        frcodiasientof,
        frcodiasientoc,
        frresponsable,
        fruser,
        frempresajconta,
        frtipoconta,
        frcodcajalin,
        frejerjconta,
        frcodiasientoa,
        frdomiasesor,
        frtiponormadomi,
        frcolectivo,
        frrcomercial,
        frrepresentante        
        };
      setColumns(array);
      FieldDef arrayf[] = {frcodigo };
      setPrimaryKeys(arrayf);
      frcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabHfactura extends TableDef
    {
    // Campos
    public FieldDef hrcodigo;
    public FieldDef hrasesor;
    public FieldDef hrentidad;
    public FieldDef hrserie;
    public FieldDef hrfactura;
    public FieldDef hrexpediente;
    public FieldDef hrcliente;
    public FieldDef hrcolaborador;
    public FieldDef hrfacturadoa;
    public FieldDef hrcif;
    public FieldDef hrnombre;
    public FieldDef hrdomicilio;
    public FieldDef hrpoblacion;
    public FieldDef hrcodigopostal;
    public FieldDef hrprovincia;
    public FieldDef hrfechafactura;
    public FieldDef hrfechacobro;
    public FieldDef hrvencimiento;
    public FieldDef hrfacturaalbara;
    public FieldDef hrseriefraalb;
    public FieldDef hrnumerofraalb;
    public FieldDef hrrecibo;
    public FieldDef hrregistrocobro;
    public FieldDef hrprovisiones;
    public FieldDef hrsuplidos;
    public FieldDef hrsuplidosiva;
    public FieldDef hrhonorarios;
    public FieldDef hrbaseimponible;
    public FieldDef hriva;
    public FieldDef hrirpf;
    public FieldDef hrimportefra;
    public FieldDef hrcobrosfra;
    public FieldDef hrsaldopdte;
    public FieldDef hrdescuento;
    public FieldDef hrliquido;
    public FieldDef hrtipoiva01;
    public FieldDef hrtipoiva02;
    public FieldDef hrtipoiva03;
    public FieldDef hrtipoiva04;
    public FieldDef hrbaseiva01;
    public FieldDef hrbaseiva02;
    public FieldDef hrbaseiva03;
    public FieldDef hrbaseiva04;
    public FieldDef hriva01;
    public FieldDef hriva02;
    public FieldDef hriva03;
    public FieldDef hriva04;
    public FieldDef hrtipoirpf01;
    public FieldDef hrtipoirpf02;
    public FieldDef hrbaseirpf01;
    public FieldDef hrbaseirpf02;
    public FieldDef hrirpf01;
    public FieldDef hrirpf02;
    public FieldDef hrseimprime;
    public FieldDef hrnumprints;
    public FieldDef hrenlazadactaf;
    public FieldDef hrenlazadactac;
    public FieldDef hrcodiasientof;
    public FieldDef hrcodiasientoc;
    public FieldDef hrresponsable;
    public FieldDef hruser;
    public FieldDef hrempresajconta;
    public FieldDef hrtipoconta;
    public FieldDef hrcodcajalin;
    public FieldDef hrcodiasientoa;
    public FieldDef hrejerjconta;
    public FieldDef hrdomiasesor;
    public FieldDef hrtiponormadomi;
    public FieldDef hrcolectivo;
    public FieldDef hrrcomercial;
    public FieldDef hrrepresentante;
    public TabHfactura(String name)
      {
      super(name);
      hrcodigo = new FieldDef("hrcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hrasesor = new FieldDef("hrasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hrentidad = new FieldDef("hrentidad",FieldDef.CHAR,1);
      hrserie = new FieldDef("hrserie",FieldDef.CHAR,10);
      hrfactura = new FieldDef("hrfactura",FieldDef.INTEGER,0);
      hrexpediente = new FieldDef("hrexpediente",FieldDef.CHAR,15);
      hrcliente = new FieldDef("hrcliente",FieldDef.CHAR,15);
      hrcolaborador = new FieldDef("hrcolaborador",FieldDef.CHAR,15);
      hrfacturadoa = new FieldDef("hrfacturadoa",FieldDef.CHAR,1);
      hrcif = new FieldDef("hrcif",FieldDef.CHAR,15);
      hrnombre = new FieldDef("hrnombre",FieldDef.CHAR,45);
      hrdomicilio = new FieldDef("hrdomicilio",FieldDef.CHAR,40);
      hrpoblacion = new FieldDef("hrpoblacion",FieldDef.CHAR,30);
      hrcodigopostal = new FieldDef("hrcodigopostal",FieldDef.CHAR,7);
      hrprovincia = new FieldDef("hrprovincia",FieldDef.INTEGER,0);
      hrfechafactura = new FieldDef("hrfechafactura",FieldDef.DATE);
      hrfechacobro = new FieldDef("hrfechacobro",FieldDef.DATE);
      hrvencimiento = new FieldDef("hrvencimiento",FieldDef.DATE);
      hrfacturaalbara = new FieldDef("hrfacturaalbara",FieldDef.CHAR,1);
      hrseriefraalb = new FieldDef("hrseriefraalb",FieldDef.CHAR,10);
      hrnumerofraalb = new FieldDef("hrnumerofraalb",FieldDef.INTEGER,0);
      hrrecibo = new FieldDef("hrrecibo",FieldDef.INTEGER,0);
      hrregistrocobro = new FieldDef("hrregistrocobro",FieldDef.INTEGER,0);
      hrprovisiones = new FieldDef("hrprovisiones",FieldDef.FLOAT,6,0);
      hrsuplidos = new FieldDef("hrsuplidos",FieldDef.FLOAT,6,0);
      hrsuplidosiva = new FieldDef("hrsuplidosiva",FieldDef.FLOAT,6,0);
      hrhonorarios = new FieldDef("hrhonorarios",FieldDef.FLOAT,6,0);
      hrbaseimponible = new FieldDef("hrbaseimponible",FieldDef.FLOAT,6,0);
      hriva = new FieldDef("hriva",FieldDef.FLOAT,6,0);
      hrirpf = new FieldDef("hrirpf",FieldDef.FLOAT,6,0);
      hrimportefra = new FieldDef("hrimportefra",FieldDef.FLOAT,6,0);
      hrcobrosfra = new FieldDef("hrcobrosfra",FieldDef.FLOAT,6,0);
      hrsaldopdte = new FieldDef("hrsaldopdte",FieldDef.FLOAT,6,0);
      hrdescuento = new FieldDef("hrdescuento",FieldDef.FLOAT,6,0);
      hrliquido = new FieldDef("hrliquido",FieldDef.FLOAT,6,0);
      hrtipoiva01 = new FieldDef("hrtipoiva01",FieldDef.FLOAT,6,0);
      hrtipoiva02 = new FieldDef("hrtipoiva02",FieldDef.FLOAT,6,0);
      hrtipoiva03 = new FieldDef("hrtipoiva03",FieldDef.FLOAT,6,0);
      hrtipoiva04 = new FieldDef("hrtipoiva04",FieldDef.FLOAT,6,0);
      hrbaseiva01 = new FieldDef("hrbaseiva01",FieldDef.FLOAT,6,0);
      hrbaseiva02 = new FieldDef("hrbaseiva02",FieldDef.FLOAT,6,0);
      hrbaseiva03 = new FieldDef("hrbaseiva03",FieldDef.FLOAT,6,0);
      hrbaseiva04 = new FieldDef("hrbaseiva04",FieldDef.FLOAT,6,0);
      hriva01 = new FieldDef("hriva01",FieldDef.FLOAT,6,0);
      hriva02 = new FieldDef("hriva02",FieldDef.FLOAT,6,0);
      hriva03 = new FieldDef("hriva03",FieldDef.FLOAT,6,0);
      hriva04 = new FieldDef("hriva04",FieldDef.FLOAT,6,0);
      hrtipoirpf01 = new FieldDef("hrtipoirpf01",FieldDef.FLOAT,6,0);
      hrtipoirpf02 = new FieldDef("hrtipoirpf02",FieldDef.FLOAT,6,0);
      hrbaseirpf01 = new FieldDef("hrbaseirpf01",FieldDef.FLOAT,6,0);
      hrbaseirpf02 = new FieldDef("hrbaseirpf02",FieldDef.FLOAT,6,0);
      hrirpf01 = new FieldDef("hrirpf01",FieldDef.FLOAT,6,0);
      hrirpf02 = new FieldDef("hrirpf02",FieldDef.FLOAT,6,0);
      hrseimprime = new FieldDef("hrseimprime",FieldDef.CHAR,1);
      hrnumprints = new FieldDef("hrnumprints",FieldDef.INTEGER,0);
      hrenlazadactaf = new FieldDef("hrenlazadactaf",FieldDef.CHAR,1);
      hrenlazadactac = new FieldDef("hrenlazadactac",FieldDef.CHAR,1);
      hrcodiasientof = new FieldDef("hrcodiasientof",FieldDef.INTEGER,0);
      hrcodiasientoc = new FieldDef("hrcodiasientoc",FieldDef.INTEGER,0);
      hrresponsable = new FieldDef("hrresponsable",FieldDef.CHAR,25);
      hruser = new FieldDef("hruser",FieldDef.CHAR,25);
      hrempresajconta = new FieldDef("hrempresajconta",FieldDef.INTEGER,0);
      hrtipoconta = new FieldDef("hrtipoconta",FieldDef.INTEGER,0);
      hrcodcajalin = new FieldDef("hrcodcajalin",FieldDef.INTEGER,0);
      hrcodiasientoa = new FieldDef("hrcodiasientoa",FieldDef.INTEGER,0);
      hrejerjconta = new FieldDef("hrejerjconta",FieldDef.INTEGER,0);
      hrdomiasesor = new FieldDef("hrdomiasesor",FieldDef.INTEGER,0);
      hrtiponormadomi = new FieldDef("hrtiponormadomi",FieldDef.CHAR,2);
      hrcolectivo = new FieldDef("hrcolectivo",FieldDef.INTEGER,0);
      hrrcomercial = new FieldDef("hrrcomercial",FieldDef.CHAR,3);
      hrrepresentante = new FieldDef("hrrepresentante",FieldDef.CHAR,3);
      FieldDef array[] = {
        hrcodigo,
        hrasesor,
        hrentidad,
        hrserie,
        hrfactura,
        hrexpediente,
        hrcliente,
        hrcolaborador,
        hrfacturadoa,
        hrcif,
        hrnombre,
        hrdomicilio,
        hrpoblacion,
        hrcodigopostal,
        hrprovincia,
        hrfechafactura,
        hrfechacobro,
        hrvencimiento,
        hrfacturaalbara,
        hrseriefraalb,
        hrnumerofraalb,
        hrrecibo,
        hrregistrocobro,
        hrprovisiones,
        hrsuplidos,
        hrsuplidosiva,
        hrhonorarios,
        hrbaseimponible,
        hriva,
        hrirpf,
        hrimportefra,
        hrcobrosfra,
        hrsaldopdte,
        hrdescuento,
        hrliquido,
        hrtipoiva01,
        hrtipoiva02,
        hrtipoiva03,
        hrtipoiva04,
        hrbaseiva01,
        hrbaseiva02,
        hrbaseiva03,
        hrbaseiva04,
        hriva01,
        hriva02,
        hriva03,
        hriva04,
        hrtipoirpf01,
        hrtipoirpf02,
        hrbaseirpf01,
        hrbaseirpf02,
        hrirpf01,
        hrirpf02,
        hrseimprime,
        hrnumprints,
        hrenlazadactaf,
        hrenlazadactac,
        hrcodiasientof,
        hrcodiasientoc,
        hrresponsable,
        hruser,
        hrempresajconta,
        hrtipoconta,
        hrcodcajalin,
        hrcodiasientoa,
        hrejerjconta,
        hrdomiasesor,
        hrtiponormadomi,
        hrcolectivo,
        hrrcomercial,
        hrrepresentante        
        };
      setColumns(array);
      FieldDef arrayf[] = {hrcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAbonodet extends TableDef
    {
    // Campos
    public FieldDef abocodigo;
    public FieldDef aboasesor;
    public FieldDef abocliente;
    public FieldDef aboexpediente;
    public FieldDef abogestion;
    public FieldDef abotramite;
    public FieldDef abodescripcion;
    public FieldDef abosuplidos;
    public FieldDef abosuplidosiva;
    public FieldDef abohonorarios;
    public FieldDef abofv;
    public FieldDef aborealprefac;
    public FieldDef abofrecuencia;
    public FieldDef aboultimoany;
    public FieldDef aboultimomes;
    public FieldDef aboultimaqui;
    public FieldDef aboempresanom;
    public FieldDef abocuotassegsoc;
    public FieldDef abocuotairpf;
    public FieldDef abotarifanomina;
    public FieldDef abotarifairpf;
    public FieldDef aboempresaeos;
    public FieldDef abotipopago;
    public FieldDef abocaducidad;
    public FieldDef aboenlazado;
    public FieldDef aboempresacon;
    public FieldDef abotarifaconta;
    public FieldDef abotipoiva;
    public FieldDef abotipoirpf;
    public FieldDef abocolectivo;
    public TabAbonodet(String name)
      {
      super(name);
      abocodigo = new FieldDef("abocodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aboasesor = new FieldDef("aboasesor",FieldDef.INTEGER,0);
      abocliente = new FieldDef("abocliente",FieldDef.CHAR,15);
      aboexpediente = new FieldDef("aboexpediente",FieldDef.CHAR,15);
      abogestion = new FieldDef("abogestion",FieldDef.CHAR,15);
      abotramite = new FieldDef("abotramite",FieldDef.INTEGER,0);
      abodescripcion = new FieldDef("abodescripcion",FieldDef.CHAR,30);
      abosuplidos = new FieldDef("abosuplidos",FieldDef.FLOAT,6,0);
      abosuplidosiva = new FieldDef("abosuplidosiva",FieldDef.FLOAT,6,0);
      abohonorarios = new FieldDef("abohonorarios",FieldDef.FLOAT,6,0);
      abofv = new FieldDef("abofv",FieldDef.CHAR,1);
      aborealprefac = new FieldDef("aborealprefac",FieldDef.CHAR,1);
      abofrecuencia = new FieldDef("abofrecuencia",FieldDef.CHAR,1);
      aboultimoany = new FieldDef("aboultimoany",FieldDef.INTEGER,0);
      aboultimomes = new FieldDef("aboultimomes",FieldDef.INTEGER,0);
      aboultimaqui = new FieldDef("aboultimaqui",FieldDef.INTEGER,0);
      aboempresanom = new FieldDef("aboempresanom",FieldDef.INTEGER,0);
      abocuotassegsoc = new FieldDef("abocuotassegsoc",FieldDef.CHAR,1);
      abocuotairpf = new FieldDef("abocuotairpf",FieldDef.CHAR,1);
      abotarifanomina = new FieldDef("abotarifanomina",FieldDef.INTEGER,0);
      abotarifairpf = new FieldDef("abotarifairpf",FieldDef.INTEGER,0);
      aboempresaeos = new FieldDef("aboempresaeos",FieldDef.INTEGER,0);
      abotipopago = new FieldDef("abotipopago",FieldDef.CHAR,1);
      abocaducidad = new FieldDef("abocaducidad",FieldDef.INTEGER,0);
      aboenlazado = new FieldDef("aboenlazado",FieldDef.CHAR,1);
      aboempresacon = new FieldDef("aboempresacon",FieldDef.INTEGER,0);
      abotarifaconta = new FieldDef("abotarifaconta",FieldDef.INTEGER,0);
      abotipoiva = new FieldDef("abotipoiva",FieldDef.INTEGER,0);
      abotipoirpf = new FieldDef("abotipoirpf",FieldDef.INTEGER,0);
      abocolectivo = new FieldDef("abocolectivo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        abocodigo,
        aboasesor,
        abocliente,
        aboexpediente,
        abogestion,
        abotramite,
        abodescripcion,
        abosuplidos,
        abosuplidosiva,
        abohonorarios,
        abofv,
        aborealprefac,
        abofrecuencia,
        aboultimoany,
        aboultimomes,
        aboultimaqui,
        aboempresanom,
        abocuotassegsoc,
        abocuotairpf,
        abotarifanomina,
        abotarifairpf,
        aboempresaeos,
        abotipopago,
        abocaducidad,
        aboenlazado,
        aboempresacon,
        abotarifaconta,
        abotipoiva,
        abotipoirpf,
        abocolectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {abocodigo };
      setPrimaryKeys(arrayf);
      abocodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabHabonodet extends TableDef
    {
    // Campos
    public FieldDef hbocodigo;
    public FieldDef hboasesor;
    public FieldDef hbocliente;
    public FieldDef hboexpediente;
    public FieldDef hbogestion;
    public FieldDef hbotramite;
    public FieldDef hbodescripcion;
    public FieldDef hbosuplidos;
    public FieldDef hbosuplidosiva;
    public FieldDef hbohonorarios;
    public FieldDef hbofv;
    public FieldDef hborealprefac;
    public FieldDef hbofrecuencia;
    public FieldDef hboultimoany;
    public FieldDef hboultimomes;
    public FieldDef hboultimaqui;
    public FieldDef hboempresanom;
    public FieldDef hbocuotassegsoc;
    public FieldDef hbocuotairpf;
    public FieldDef hbotarifanomina;
    public FieldDef hbotarifairpf;
    public FieldDef hboempresaeos;
    public FieldDef hbotipopago;
    public FieldDef hbocaducidad;
    public FieldDef hboenlazado;
    public FieldDef hboempresacon;
    public FieldDef hbotarifaconta;
    public FieldDef hbotipoiva;
    public FieldDef hbotipoirpf;
    public FieldDef hbocolectivo;
    public TabHabonodet(String name)
      {
      super(name);
      hbocodigo = new FieldDef("hbocodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hboasesor = new FieldDef("hboasesor",FieldDef.INTEGER,0);
      hbocliente = new FieldDef("hbocliente",FieldDef.CHAR,15);
      hboexpediente = new FieldDef("hboexpediente",FieldDef.CHAR,15);
      hbogestion = new FieldDef("hbogestion",FieldDef.CHAR,15);
      hbotramite = new FieldDef("hbotramite",FieldDef.INTEGER,0);
      hbodescripcion = new FieldDef("hbodescripcion",FieldDef.CHAR,30);
      hbosuplidos = new FieldDef("hbosuplidos",FieldDef.FLOAT,6,0);
      hbosuplidosiva = new FieldDef("hbosuplidosiva",FieldDef.FLOAT,6,0);
      hbohonorarios = new FieldDef("hbohonorarios",FieldDef.FLOAT,6,0);
      hbofv = new FieldDef("hbofv",FieldDef.CHAR,1);
      hborealprefac = new FieldDef("hborealprefac",FieldDef.CHAR,1);
      hbofrecuencia = new FieldDef("hbofrecuencia",FieldDef.CHAR,1);
      hboultimoany = new FieldDef("hboultimoany",FieldDef.INTEGER,0);
      hboultimomes = new FieldDef("hboultimomes",FieldDef.INTEGER,0);
      hboultimaqui = new FieldDef("hboultimaqui",FieldDef.INTEGER,0);
      hboempresanom = new FieldDef("hboempresanom",FieldDef.INTEGER,0);
      hbocuotassegsoc = new FieldDef("hbocuotassegsoc",FieldDef.CHAR,1);
      hbocuotairpf = new FieldDef("hbocuotairpf",FieldDef.CHAR,1);
      hbotarifanomina = new FieldDef("hbotarifanomina",FieldDef.INTEGER,0);
      hbotarifairpf = new FieldDef("hbotarifairpf",FieldDef.INTEGER,0);
      hboempresaeos = new FieldDef("hboempresaeos",FieldDef.INTEGER,0);
      hbotipopago = new FieldDef("hbotipopago",FieldDef.CHAR,1);
      hbocaducidad = new FieldDef("hbocaducidad",FieldDef.INTEGER,0);
      hboenlazado = new FieldDef("hboenlazado",FieldDef.CHAR,1);
      hboempresacon = new FieldDef("hboempresacon",FieldDef.INTEGER,0);
      hbotarifaconta = new FieldDef("hbotarifaconta",FieldDef.INTEGER,0);
      hbotipoiva = new FieldDef("hbotipoiva",FieldDef.INTEGER,0);
      hbotipoirpf = new FieldDef("hbotipoirpf",FieldDef.INTEGER,0);
      hbocolectivo = new FieldDef("hbocolectivo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        hbocodigo,
        hboasesor,
        hbocliente,
        hboexpediente,
        hbogestion,
        hbotramite,
        hbodescripcion,
        hbosuplidos,
        hbosuplidosiva,
        hbohonorarios,
        hbofv,
        hborealprefac,
        hbofrecuencia,
        hboultimoany,
        hboultimomes,
        hboultimaqui,
        hboempresanom,
        hbocuotassegsoc,
        hbocuotairpf,
        hbotarifanomina,
        hbotarifairpf,
        hboempresaeos,
        hbotipopago,
        hbocaducidad,
        hboenlazado,
        hboempresacon,
        hbotarifaconta,
        hbotipoiva,
        hbotipoirpf,
        hbocolectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {hbocodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAbonohistor extends TableDef
    {
    // Campos
    public FieldDef abhcodigo;
    public FieldDef abhasesor;
    public FieldDef abhcliente;
    public FieldDef abhexpediente;
    public FieldDef abhgestion;
    public FieldDef abhtramite;
    public FieldDef abhdescripcion;
    public FieldDef abhsuplidos;
    public FieldDef abhsuplidosiva;
    public FieldDef abhhonorarios;
    public FieldDef abhfv;
    public FieldDef abhrealprefac;
    public FieldDef abhfrecuencia;
    public FieldDef abhultimoany;
    public FieldDef abhultimomes;
    public FieldDef abhultimaqui;
    public FieldDef abhempresanom;
    public FieldDef abhcuotassegsoc;
    public FieldDef abhcuotairpf;
    public FieldDef abhtarifanomina;
    public FieldDef abhtarifairpf;
    public FieldDef abhempresaeos;
    public FieldDef abhtipopago;
    public FieldDef abhcaducidad;
    public FieldDef abhenlazado;
    public FieldDef abhempresacon;
    public FieldDef abhtarifaconta;
    public FieldDef abhtipoiva;
    public FieldDef abhtipoirpf;
    public FieldDef abhcodifactura;
    public FieldDef abhserie;
    public FieldDef abhfactura;
    public TabAbonohistor(String name)
      {
      super(name);
      abhcodigo = new FieldDef("abhcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      abhasesor = new FieldDef("abhasesor",FieldDef.INTEGER,0);
      abhcliente = new FieldDef("abhcliente",FieldDef.CHAR,15);
      abhexpediente = new FieldDef("abhexpediente",FieldDef.CHAR,15);
      abhgestion = new FieldDef("abhgestion",FieldDef.CHAR,15);
      abhtramite = new FieldDef("abhtramite",FieldDef.INTEGER,0);
      abhdescripcion = new FieldDef("abhdescripcion",FieldDef.CHAR,30);
      abhsuplidos = new FieldDef("abhsuplidos",FieldDef.FLOAT,6,0);
      abhsuplidosiva = new FieldDef("abhsuplidosiva",FieldDef.FLOAT,6,0);
      abhhonorarios = new FieldDef("abhhonorarios",FieldDef.FLOAT,6,0);
      abhfv = new FieldDef("abhfv",FieldDef.CHAR,1);
      abhrealprefac = new FieldDef("abhrealprefac",FieldDef.CHAR,1);
      abhfrecuencia = new FieldDef("abhfrecuencia",FieldDef.CHAR,1);
      abhultimoany = new FieldDef("abhultimoany",FieldDef.INTEGER,0);
      abhultimomes = new FieldDef("abhultimomes",FieldDef.INTEGER,0);
      abhultimaqui = new FieldDef("abhultimaqui",FieldDef.INTEGER,0);
      abhempresanom = new FieldDef("abhempresanom",FieldDef.INTEGER,0);
      abhcuotassegsoc = new FieldDef("abhcuotassegsoc",FieldDef.CHAR,1);
      abhcuotairpf = new FieldDef("abhcuotairpf",FieldDef.CHAR,1);
      abhtarifanomina = new FieldDef("abhtarifanomina",FieldDef.INTEGER,0);
      abhtarifairpf = new FieldDef("abhtarifairpf",FieldDef.INTEGER,0);
      abhempresaeos = new FieldDef("abhempresaeos",FieldDef.INTEGER,0);
      abhtipopago = new FieldDef("abhtipopago",FieldDef.CHAR,1);
      abhcaducidad = new FieldDef("abhcaducidad",FieldDef.INTEGER,0);
      abhenlazado = new FieldDef("abhenlazado",FieldDef.CHAR,1);
      abhempresacon = new FieldDef("abhempresacon",FieldDef.INTEGER,0);
      abhtarifaconta = new FieldDef("abhtarifaconta",FieldDef.INTEGER,0);
      abhtipoiva = new FieldDef("abhtipoiva",FieldDef.INTEGER,0);
      abhtipoirpf = new FieldDef("abhtipoirpf",FieldDef.INTEGER,0);
      abhcodifactura = new FieldDef("abhcodifactura",FieldDef.INTEGER,0);
      abhserie = new FieldDef("abhserie",FieldDef.CHAR,10);
      abhfactura = new FieldDef("abhfactura",FieldDef.INTEGER,0);
      FieldDef array[] = {
        abhcodigo,
        abhasesor,
        abhcliente,
        abhexpediente,
        abhgestion,
        abhtramite,
        abhdescripcion,
        abhsuplidos,
        abhsuplidosiva,
        abhhonorarios,
        abhfv,
        abhrealprefac,
        abhfrecuencia,
        abhultimoany,
        abhultimomes,
        abhultimaqui,
        abhempresanom,
        abhcuotassegsoc,
        abhcuotairpf,
        abhtarifanomina,
        abhtarifairpf,
        abhempresaeos,
        abhtipopago,
        abhcaducidad,
        abhenlazado,
        abhempresacon,
        abhtarifaconta,
        abhtipoiva,
        abhtipoirpf,
        abhcodifactura,
        abhserie,
        abhfactura        
        };
      setColumns(array);
      FieldDef arrayf[] = {abhcodigo };
      setPrimaryKeys(arrayf);
      abhcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabAbonotex extends TableDef
    {
    // Campos
    public FieldDef abotcodigo;
    public FieldDef abotasesor;
    public FieldDef abotcodabodet;
    public FieldDef abottexto;
    public TabAbonotex(String name)
      {
      super(name);
      abotcodigo = new FieldDef("abotcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      abotasesor = new FieldDef("abotasesor",FieldDef.INTEGER,0);
      abotcodabodet = new FieldDef("abotcodabodet",FieldDef.INTEGER,0);
      abottexto = new FieldDef("abottexto",FieldDef.CHAR,65);
      FieldDef array[] = {
        abotcodigo,
        abotasesor,
        abotcodabodet,
        abottexto        
        };
      setColumns(array);
      FieldDef arrayf[] = {abotcodigo };
      setPrimaryKeys(arrayf);
      abotcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabRebuts extends TableDef
    {
    // Campos
    public FieldDef rebcodigo;
    public FieldDef rebasesor;
    public FieldDef rebcliente;
    public FieldDef rebexpediente;
    public FieldDef rebserie;
    public FieldDef rebfactura;
    public FieldDef rebdiscopapel;
    public FieldDef rebestadobanco;
    public FieldDef rebselec;
    public FieldDef rebpres;
    public FieldDef rebsufp;
    public FieldDef rebpresentador;
    public FieldDef rebentidad;
    public FieldDef reboficina;
    public FieldDef rebdigitos;
    public FieldDef rebcuenta;
    public FieldDef reborden;
    public FieldDef rebsufo;
    public FieldDef rebordenante;
    public FieldDef rebnombrecli;
    public FieldDef rebent;
    public FieldDef rebofic;
    public FieldDef rebdc;
    public FieldDef rebcta;
    public FieldDef rebtotal;
    public FieldDef rebreferencia;
    public FieldDef rebconcepto;
    public FieldDef rebconcepto1;
    public FieldDef rebconcepto2;
    public FieldDef rebconcepto3;
    public FieldDef rebconcepto4;
    public FieldDef rebconcepto5;
    public FieldDef rebconcepto6;
    public FieldDef rebconcepto7;
    public FieldDef rebconcepto8;
    public FieldDef rebconcepto9;
    public FieldDef rebconcepto10;
    public FieldDef rebconcepto11;
    public FieldDef rebconcepto12;
    public FieldDef rebconcepto13;
    public FieldDef rebconcepto14;
    public FieldDef rebconcepto15;
    public FieldDef rebconcepto16;
    public FieldDef rebfechaidisco;
    public FieldDef rebtiporecibo;
    public FieldDef rebnumrecibo;
    public FieldDef rebestadopapel;
    public FieldDef rebfechapapel;
    public FieldDef rebgestion1;
    public FieldDef rebtramite1;
    public FieldDef rebdescrip1;
    public FieldDef rebgestion2;
    public FieldDef rebtramite2;
    public FieldDef rebdescrip2;
    public FieldDef rebgestion3;
    public FieldDef rebtramite3;
    public FieldDef rebdescrip3;
    public FieldDef rebgestion4;
    public FieldDef rebtramite4;
    public FieldDef rebdescrip4;
    public FieldDef rebgestion5;
    public FieldDef rebtramite5;
    public FieldDef rebdescrip5;
    public FieldDef rebprovisiones;
    public FieldDef rebsuplidos;
    public FieldDef rebsuplidosiva;
    public FieldDef rebhonorarios;
    public FieldDef rebbase;
    public FieldDef rebiva;
    public FieldDef rebirpf;
    public FieldDef rebvencimiento;
    public FieldDef rebnifcif;
    public FieldDef rebcodifichero;
    public FieldDef rebcodcajalin;
    public FieldDef rebcodfactura;
    public FieldDef rebdomiasesor;
    public FieldDef rebtiponorma;
    public FieldDef rebcolectivo;
    public TabRebuts(String name)
      {
      super(name);
      rebcodigo = new FieldDef("rebcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      rebasesor = new FieldDef("rebasesor",FieldDef.INTEGER,0);
      rebcliente = new FieldDef("rebcliente",FieldDef.CHAR,15);
      rebexpediente = new FieldDef("rebexpediente",FieldDef.CHAR,15);
      rebserie = new FieldDef("rebserie",FieldDef.CHAR,10);
      rebfactura = new FieldDef("rebfactura",FieldDef.INTEGER,0);
      rebdiscopapel = new FieldDef("rebdiscopapel",FieldDef.CHAR,1);
      rebestadobanco = new FieldDef("rebestadobanco",FieldDef.CHAR,1);
      rebselec = new FieldDef("rebselec",FieldDef.CHAR,1);
      rebpres = new FieldDef("rebpres",FieldDef.CHAR,9);
      rebsufp = new FieldDef("rebsufp",FieldDef.INTEGER,0);
      rebpresentador = new FieldDef("rebpresentador",FieldDef.CHAR,40);
      rebentidad = new FieldDef("rebentidad",FieldDef.CHAR,4);
      reboficina = new FieldDef("reboficina",FieldDef.CHAR,4);
      rebdigitos = new FieldDef("rebdigitos",FieldDef.CHAR,2);
      rebcuenta = new FieldDef("rebcuenta",FieldDef.CHAR,10);
      reborden = new FieldDef("reborden",FieldDef.CHAR,9);
      rebsufo = new FieldDef("rebsufo",FieldDef.CHAR,3);
      rebordenante = new FieldDef("rebordenante",FieldDef.CHAR,40);
      rebnombrecli = new FieldDef("rebnombrecli",FieldDef.CHAR,40);
      rebent = new FieldDef("rebent",FieldDef.CHAR,4);
      rebofic = new FieldDef("rebofic",FieldDef.CHAR,4);
      rebdc = new FieldDef("rebdc",FieldDef.CHAR,2);
      rebcta = new FieldDef("rebcta",FieldDef.CHAR,10);
      rebtotal = new FieldDef("rebtotal",FieldDef.FLOAT,6,0);
      rebreferencia = new FieldDef("rebreferencia",FieldDef.CHAR,12);
      rebconcepto = new FieldDef("rebconcepto",FieldDef.CHAR,17);
      rebconcepto1 = new FieldDef("rebconcepto1",FieldDef.CHAR,40);
      rebconcepto2 = new FieldDef("rebconcepto2",FieldDef.CHAR,40);
      rebconcepto3 = new FieldDef("rebconcepto3",FieldDef.CHAR,40);
      rebconcepto4 = new FieldDef("rebconcepto4",FieldDef.CHAR,40);
      rebconcepto5 = new FieldDef("rebconcepto5",FieldDef.CHAR,40);
      rebconcepto6 = new FieldDef("rebconcepto6",FieldDef.CHAR,40);
      rebconcepto7 = new FieldDef("rebconcepto7",FieldDef.CHAR,40);
      rebconcepto8 = new FieldDef("rebconcepto8",FieldDef.CHAR,40);
      rebconcepto9 = new FieldDef("rebconcepto9",FieldDef.CHAR,40);
      rebconcepto10 = new FieldDef("rebconcepto10",FieldDef.CHAR,40);
      rebconcepto11 = new FieldDef("rebconcepto11",FieldDef.CHAR,40);
      rebconcepto12 = new FieldDef("rebconcepto12",FieldDef.CHAR,40);
      rebconcepto13 = new FieldDef("rebconcepto13",FieldDef.CHAR,40);
      rebconcepto14 = new FieldDef("rebconcepto14",FieldDef.CHAR,40);
      rebconcepto15 = new FieldDef("rebconcepto15",FieldDef.CHAR,40);
      rebconcepto16 = new FieldDef("rebconcepto16",FieldDef.CHAR,40);
      rebfechaidisco = new FieldDef("rebfechaidisco",FieldDef.DATE);
      rebtiporecibo = new FieldDef("rebtiporecibo",FieldDef.CHAR,1);
      rebnumrecibo = new FieldDef("rebnumrecibo",FieldDef.INTEGER,0);
      rebestadopapel = new FieldDef("rebestadopapel",FieldDef.CHAR,1);
      rebfechapapel = new FieldDef("rebfechapapel",FieldDef.DATE);
      rebgestion1 = new FieldDef("rebgestion1",FieldDef.CHAR,15);
      rebtramite1 = new FieldDef("rebtramite1",FieldDef.INTEGER,0);
      rebdescrip1 = new FieldDef("rebdescrip1",FieldDef.CHAR,30);
      rebgestion2 = new FieldDef("rebgestion2",FieldDef.CHAR,15);
      rebtramite2 = new FieldDef("rebtramite2",FieldDef.INTEGER,0);
      rebdescrip2 = new FieldDef("rebdescrip2",FieldDef.CHAR,30);
      rebgestion3 = new FieldDef("rebgestion3",FieldDef.CHAR,15);
      rebtramite3 = new FieldDef("rebtramite3",FieldDef.INTEGER,0);
      rebdescrip3 = new FieldDef("rebdescrip3",FieldDef.CHAR,30);
      rebgestion4 = new FieldDef("rebgestion4",FieldDef.CHAR,15);
      rebtramite4 = new FieldDef("rebtramite4",FieldDef.INTEGER,0);
      rebdescrip4 = new FieldDef("rebdescrip4",FieldDef.CHAR,30);
      rebgestion5 = new FieldDef("rebgestion5",FieldDef.CHAR,15);
      rebtramite5 = new FieldDef("rebtramite5",FieldDef.INTEGER,0);
      rebdescrip5 = new FieldDef("rebdescrip5",FieldDef.CHAR,30);
      rebprovisiones = new FieldDef("rebprovisiones",FieldDef.FLOAT,6,0);
      rebsuplidos = new FieldDef("rebsuplidos",FieldDef.FLOAT,6,0);
      rebsuplidosiva = new FieldDef("rebsuplidosiva",FieldDef.FLOAT,6,0);
      rebhonorarios = new FieldDef("rebhonorarios",FieldDef.FLOAT,6,0);
      rebbase = new FieldDef("rebbase",FieldDef.FLOAT,6,0);
      rebiva = new FieldDef("rebiva",FieldDef.FLOAT,6,0);
      rebirpf = new FieldDef("rebirpf",FieldDef.FLOAT,6,0);
      rebvencimiento = new FieldDef("rebvencimiento",FieldDef.DATE);
      rebnifcif = new FieldDef("rebnifcif",FieldDef.CHAR,15);
      rebcodifichero = new FieldDef("rebcodifichero",FieldDef.INTEGER,0);
      rebcodcajalin = new FieldDef("rebcodcajalin",FieldDef.INTEGER,0);
      rebcodfactura = new FieldDef("rebcodfactura",FieldDef.INTEGER,0);
      rebdomiasesor = new FieldDef("rebdomiasesor",FieldDef.INTEGER,0);
      rebtiponorma = new FieldDef("rebtiponorma",FieldDef.CHAR,2);
      rebcolectivo = new FieldDef("rebcolectivo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        rebcodigo,
        rebasesor,
        rebcliente,
        rebexpediente,
        rebserie,
        rebfactura,
        rebdiscopapel,
        rebestadobanco,
        rebselec,
        rebpres,
        rebsufp,
        rebpresentador,
        rebentidad,
        reboficina,
        rebdigitos,
        rebcuenta,
        reborden,
        rebsufo,
        rebordenante,
        rebnombrecli,
        rebent,
        rebofic,
        rebdc,
        rebcta,
        rebtotal,
        rebreferencia,
        rebconcepto,
        rebconcepto1,
        rebconcepto2,
        rebconcepto3,
        rebconcepto4,
        rebconcepto5,
        rebconcepto6,
        rebconcepto7,
        rebconcepto8,
        rebconcepto9,
        rebconcepto10,
        rebconcepto11,
        rebconcepto12,
        rebconcepto13,
        rebconcepto14,
        rebconcepto15,
        rebconcepto16,
        rebfechaidisco,
        rebtiporecibo,
        rebnumrecibo,
        rebestadopapel,
        rebfechapapel,
        rebgestion1,
        rebtramite1,
        rebdescrip1,
        rebgestion2,
        rebtramite2,
        rebdescrip2,
        rebgestion3,
        rebtramite3,
        rebdescrip3,
        rebgestion4,
        rebtramite4,
        rebdescrip4,
        rebgestion5,
        rebtramite5,
        rebdescrip5,
        rebprovisiones,
        rebsuplidos,
        rebsuplidosiva,
        rebhonorarios,
        rebbase,
        rebiva,
        rebirpf,
        rebvencimiento,
        rebnifcif,
        rebcodifichero,
        rebcodcajalin,
        rebcodfactura,
        rebdomiasesor,
        rebtiponorma,
        rebcolectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {rebcodigo };
      setPrimaryKeys(arrayf);
      rebcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabHrebuts extends TableDef
    {
    // Campos
    public FieldDef hebcodigo;
    public FieldDef hebasesor;
    public FieldDef hebcliente;
    public FieldDef hebexpediente;
    public FieldDef hebserie;
    public FieldDef hebfactura;
    public FieldDef hebdiscopapel;
    public FieldDef hebestadobanco;
    public FieldDef hebselec;
    public FieldDef hebpres;
    public FieldDef hebsufp;
    public FieldDef hebpresentador;
    public FieldDef hebentidad;
    public FieldDef heboficina;
    public FieldDef hebdigitos;
    public FieldDef hebcuenta;
    public FieldDef heborden;
    public FieldDef hebsufo;
    public FieldDef hebordenante;
    public FieldDef hebnombrecli;
    public FieldDef hebent;
    public FieldDef hebofic;
    public FieldDef hebdc;
    public FieldDef hebcta;
    public FieldDef hebtotal;
    public FieldDef hebreferencia;
    public FieldDef hebconcepto;
    public FieldDef hebconcepto1;
    public FieldDef hebconcepto2;
    public FieldDef hebconcepto3;
    public FieldDef hebconcepto4;
    public FieldDef hebconcepto5;
    public FieldDef hebconcepto6;
    public FieldDef hebconcepto7;
    public FieldDef hebconcepto8;
    public FieldDef hebconcepto9;
    public FieldDef hebconcepto10;
    public FieldDef hebconcepto11;
    public FieldDef hebconcepto12;
    public FieldDef hebconcepto13;
    public FieldDef hebconcepto14;
    public FieldDef hebconcepto15;
    public FieldDef hebconcepto16;
    public FieldDef hebfechaidisco;
    public FieldDef hebtiporecibo;
    public FieldDef hebnumrecibo;
    public FieldDef hebestadopapel;
    public FieldDef hebfechapapel;
    public FieldDef hebgestion1;
    public FieldDef hebtramite1;
    public FieldDef hebdescrip1;
    public FieldDef hebgestion2;
    public FieldDef hebtramite2;
    public FieldDef hebdescrip2;
    public FieldDef hebgestion3;
    public FieldDef hebtramite3;
    public FieldDef hebdescrip3;
    public FieldDef hebgestion4;
    public FieldDef hebtramite4;
    public FieldDef hebdescrip4;
    public FieldDef hebgestion5;
    public FieldDef hebtramite5;
    public FieldDef hebdescrip5;
    public FieldDef hebprovisiones;
    public FieldDef hebsuplidos;
    public FieldDef hebsuplidosiva;
    public FieldDef hebhonorarios;
    public FieldDef hebbase;
    public FieldDef hebiva;
    public FieldDef hebirpf;
    public FieldDef hebvencimiento;
    public FieldDef hebnifcif;
    public FieldDef hebcodifichero;
    public FieldDef hebcodcajalin;
    public FieldDef hebcodfactura;
    public FieldDef hebdomiasesor;
    public FieldDef hebtiponorma;
    public FieldDef hebcolectivo;
    public TabHrebuts(String name)
      {
      super(name);
      hebcodigo = new FieldDef("hebcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hebasesor = new FieldDef("hebasesor",FieldDef.INTEGER,0);
      hebcliente = new FieldDef("hebcliente",FieldDef.CHAR,15);
      hebexpediente = new FieldDef("hebexpediente",FieldDef.CHAR,15);
      hebserie = new FieldDef("hebserie",FieldDef.CHAR,10);
      hebfactura = new FieldDef("hebfactura",FieldDef.INTEGER,0);
      hebdiscopapel = new FieldDef("hebdiscopapel",FieldDef.CHAR,1);
      hebestadobanco = new FieldDef("hebestadobanco",FieldDef.CHAR,1);
      hebselec = new FieldDef("hebselec",FieldDef.CHAR,1);
      hebpres = new FieldDef("hebpres",FieldDef.CHAR,9);
      hebsufp = new FieldDef("hebsufp",FieldDef.INTEGER,0);
      hebpresentador = new FieldDef("hebpresentador",FieldDef.CHAR,40);
      hebentidad = new FieldDef("hebentidad",FieldDef.CHAR,4);
      heboficina = new FieldDef("heboficina",FieldDef.CHAR,4);
      hebdigitos = new FieldDef("hebdigitos",FieldDef.CHAR,2);
      hebcuenta = new FieldDef("hebcuenta",FieldDef.CHAR,10);
      heborden = new FieldDef("heborden",FieldDef.CHAR,9);
      hebsufo = new FieldDef("hebsufo",FieldDef.CHAR,3);
      hebordenante = new FieldDef("hebordenante",FieldDef.CHAR,40);
      hebnombrecli = new FieldDef("hebnombrecli",FieldDef.CHAR,40);
      hebent = new FieldDef("hebent",FieldDef.CHAR,4);
      hebofic = new FieldDef("hebofic",FieldDef.CHAR,4);
      hebdc = new FieldDef("hebdc",FieldDef.CHAR,2);
      hebcta = new FieldDef("hebcta",FieldDef.CHAR,10);
      hebtotal = new FieldDef("hebtotal",FieldDef.FLOAT,6,0);
      hebreferencia = new FieldDef("hebreferencia",FieldDef.CHAR,12);
      hebconcepto = new FieldDef("hebconcepto",FieldDef.CHAR,17);
      hebconcepto1 = new FieldDef("hebconcepto1",FieldDef.CHAR,40);
      hebconcepto2 = new FieldDef("hebconcepto2",FieldDef.CHAR,40);
      hebconcepto3 = new FieldDef("hebconcepto3",FieldDef.CHAR,40);
      hebconcepto4 = new FieldDef("hebconcepto4",FieldDef.CHAR,40);
      hebconcepto5 = new FieldDef("hebconcepto5",FieldDef.CHAR,40);
      hebconcepto6 = new FieldDef("hebconcepto6",FieldDef.CHAR,40);
      hebconcepto7 = new FieldDef("hebconcepto7",FieldDef.CHAR,40);
      hebconcepto8 = new FieldDef("hebconcepto8",FieldDef.CHAR,40);
      hebconcepto9 = new FieldDef("hebconcepto9",FieldDef.CHAR,40);
      hebconcepto10 = new FieldDef("hebconcepto10",FieldDef.CHAR,40);
      hebconcepto11 = new FieldDef("hebconcepto11",FieldDef.CHAR,40);
      hebconcepto12 = new FieldDef("hebconcepto12",FieldDef.CHAR,40);
      hebconcepto13 = new FieldDef("hebconcepto13",FieldDef.CHAR,40);
      hebconcepto14 = new FieldDef("hebconcepto14",FieldDef.CHAR,40);
      hebconcepto15 = new FieldDef("hebconcepto15",FieldDef.CHAR,40);
      hebconcepto16 = new FieldDef("hebconcepto16",FieldDef.CHAR,40);
      hebfechaidisco = new FieldDef("hebfechaidisco",FieldDef.DATE);
      hebtiporecibo = new FieldDef("hebtiporecibo",FieldDef.CHAR,1);
      hebnumrecibo = new FieldDef("hebnumrecibo",FieldDef.INTEGER,0);
      hebestadopapel = new FieldDef("hebestadopapel",FieldDef.CHAR,1);
      hebfechapapel = new FieldDef("hebfechapapel",FieldDef.DATE);
      hebgestion1 = new FieldDef("hebgestion1",FieldDef.CHAR,15);
      hebtramite1 = new FieldDef("hebtramite1",FieldDef.INTEGER,0);
      hebdescrip1 = new FieldDef("hebdescrip1",FieldDef.CHAR,30);
      hebgestion2 = new FieldDef("hebgestion2",FieldDef.CHAR,15);
      hebtramite2 = new FieldDef("hebtramite2",FieldDef.INTEGER,0);
      hebdescrip2 = new FieldDef("hebdescrip2",FieldDef.CHAR,30);
      hebgestion3 = new FieldDef("hebgestion3",FieldDef.CHAR,15);
      hebtramite3 = new FieldDef("hebtramite3",FieldDef.INTEGER,0);
      hebdescrip3 = new FieldDef("hebdescrip3",FieldDef.CHAR,30);
      hebgestion4 = new FieldDef("hebgestion4",FieldDef.CHAR,15);
      hebtramite4 = new FieldDef("hebtramite4",FieldDef.INTEGER,0);
      hebdescrip4 = new FieldDef("hebdescrip4",FieldDef.CHAR,30);
      hebgestion5 = new FieldDef("hebgestion5",FieldDef.CHAR,15);
      hebtramite5 = new FieldDef("hebtramite5",FieldDef.INTEGER,0);
      hebdescrip5 = new FieldDef("hebdescrip5",FieldDef.CHAR,30);
      hebprovisiones = new FieldDef("hebprovisiones",FieldDef.FLOAT,6,0);
      hebsuplidos = new FieldDef("hebsuplidos",FieldDef.FLOAT,6,0);
      hebsuplidosiva = new FieldDef("hebsuplidosiva",FieldDef.FLOAT,6,0);
      hebhonorarios = new FieldDef("hebhonorarios",FieldDef.FLOAT,6,0);
      hebbase = new FieldDef("hebbase",FieldDef.FLOAT,6,0);
      hebiva = new FieldDef("hebiva",FieldDef.FLOAT,6,0);
      hebirpf = new FieldDef("hebirpf",FieldDef.FLOAT,6,0);
      hebvencimiento = new FieldDef("hebvencimiento",FieldDef.DATE);
      hebnifcif = new FieldDef("hebnifcif",FieldDef.CHAR,15);
      hebcodifichero = new FieldDef("hebcodifichero",FieldDef.INTEGER,0);
      hebcodcajalin = new FieldDef("hebcodcajalin",FieldDef.INTEGER,0);
      hebcodfactura = new FieldDef("hebcodfactura",FieldDef.INTEGER,0);
      hebdomiasesor = new FieldDef("hebdomiasesor",FieldDef.INTEGER,0);
      hebtiponorma = new FieldDef("hebtiponorma",FieldDef.CHAR,2);
      hebcolectivo = new FieldDef("hebcolectivo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        hebcodigo,
        hebasesor,
        hebcliente,
        hebexpediente,
        hebserie,
        hebfactura,
        hebdiscopapel,
        hebestadobanco,
        hebselec,
        hebpres,
        hebsufp,
        hebpresentador,
        hebentidad,
        heboficina,
        hebdigitos,
        hebcuenta,
        heborden,
        hebsufo,
        hebordenante,
        hebnombrecli,
        hebent,
        hebofic,
        hebdc,
        hebcta,
        hebtotal,
        hebreferencia,
        hebconcepto,
        hebconcepto1,
        hebconcepto2,
        hebconcepto3,
        hebconcepto4,
        hebconcepto5,
        hebconcepto6,
        hebconcepto7,
        hebconcepto8,
        hebconcepto9,
        hebconcepto10,
        hebconcepto11,
        hebconcepto12,
        hebconcepto13,
        hebconcepto14,
        hebconcepto15,
        hebconcepto16,
        hebfechaidisco,
        hebtiporecibo,
        hebnumrecibo,
        hebestadopapel,
        hebfechapapel,
        hebgestion1,
        hebtramite1,
        hebdescrip1,
        hebgestion2,
        hebtramite2,
        hebdescrip2,
        hebgestion3,
        hebtramite3,
        hebdescrip3,
        hebgestion4,
        hebtramite4,
        hebdescrip4,
        hebgestion5,
        hebtramite5,
        hebdescrip5,
        hebprovisiones,
        hebsuplidos,
        hebsuplidosiva,
        hebhonorarios,
        hebbase,
        hebiva,
        hebirpf,
        hebvencimiento,
        hebnifcif,
        hebcodifichero,
        hebcodcajalin,
        hebcodfactura,
        hebdomiasesor,
        hebtiponorma,
        hebcolectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {hebcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCaja extends TableDef
    {
    // Campos
    public FieldDef cjcodigo;
    public FieldDef cjasesor;
    public FieldDef cjcaja;
    public FieldDef cjfecha;
    public FieldDef cjestado;
    public FieldDef cjcuenta;
    public FieldDef cjsubcuenta;
    public FieldDef cjcuentabanc;
    public FieldDef cjsubcuentabanc;
    public TabCaja(String name)
      {
      super(name);
      cjcodigo = new FieldDef("cjcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cjasesor = new FieldDef("cjasesor",FieldDef.INTEGER,0);
      cjcaja = new FieldDef("cjcaja",FieldDef.CHAR,2);
      cjfecha = new FieldDef("cjfecha",FieldDef.DATE);
      cjestado = new FieldDef("cjestado",FieldDef.CHAR,1);
      cjcuenta = new FieldDef("cjcuenta",FieldDef.CHAR,4);
      cjsubcuenta = new FieldDef("cjsubcuenta",FieldDef.CHAR,10);
      cjcuentabanc = new FieldDef("cjcuentabanc",FieldDef.CHAR,4);
      cjsubcuentabanc = new FieldDef("cjsubcuentabanc",FieldDef.CHAR,10);
      FieldDef array[] = {
        cjcodigo,
        cjasesor,
        cjcaja,
        cjfecha,
        cjestado,
        cjcuenta,
        cjsubcuenta,
        cjcuentabanc,
        cjsubcuentabanc        
        };
      setColumns(array);
      FieldDef arrayf[] = {cjcodigo };
      setPrimaryKeys(arrayf);
      cjcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabHcaja extends TableDef
    {
    // Campos
    public FieldDef hjcodigo;
    public FieldDef hjasesor;
    public FieldDef hjcaja;
    public FieldDef hjfecha;
    public FieldDef hjestado;
    public FieldDef hjcuenta;
    public FieldDef hjsubcuenta;
    public FieldDef hjcuentabanc;
    public FieldDef hjsubcuentabanc;
    public TabHcaja(String name)
      {
      super(name);
      hjcodigo = new FieldDef("hjcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hjasesor = new FieldDef("hjasesor",FieldDef.INTEGER,0);
      hjcaja = new FieldDef("hjcaja",FieldDef.CHAR,2);
      hjfecha = new FieldDef("hjfecha",FieldDef.DATE);
      hjestado = new FieldDef("hjestado",FieldDef.CHAR,1);
      hjcuenta = new FieldDef("hjcuenta",FieldDef.CHAR,4);
      hjsubcuenta = new FieldDef("hjsubcuenta",FieldDef.CHAR,10);
      hjcuentabanc = new FieldDef("hjcuentabanc",FieldDef.CHAR,4);
      hjsubcuentabanc = new FieldDef("hjsubcuentabanc",FieldDef.CHAR,10);
      FieldDef array[] = {
        hjcodigo,
        hjasesor,
        hjcaja,
        hjfecha,
        hjestado,
        hjcuenta,
        hjsubcuenta,
        hjcuentabanc,
        hjsubcuentabanc        
        };
      setColumns(array);
      FieldDef arrayf[] = {hjcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCajalin extends TableDef
    {
    // Campos
    public FieldDef cjlcodigo;
    public FieldDef cjlasesor;
    public FieldDef cjlcaja;
    public FieldDef cjlfecha;
    public FieldDef cjlcontador;
    public FieldDef cjlcliente;
    public FieldDef cjlexpediente;
    public FieldDef cjlgestion;
    public FieldDef cjltramite;
    public FieldDef cjldescripcion;
    public FieldDef cjloperacion;
    public FieldDef cjltipoconta;
    public FieldDef cjlserie;
    public FieldDef cjlnuevaserie;
    public FieldDef cjlnuevonumero;
    public FieldDef cjlimporte;
    public FieldDef cjlporivasop;
    public FieldDef cjlbasesop;
    public FieldDef cjlporivarep;
    public FieldDef cjlcuenta1;
    public FieldDef cjlsubcuenta1;
    public FieldDef cjldebehaber1;
    public FieldDef cjlimporte1;
    public FieldDef cjlcuenta2;
    public FieldDef cjlsubcuenta2;
    public FieldDef cjldebehaber2;
    public FieldDef cjlimporte2;
    public FieldDef cjlcuenta3;
    public FieldDef cjlsubcuenta3;
    public FieldDef cjldebehaber3;
    public FieldDef cjlimporte3;
    public FieldDef cjlcuenta4;
    public FieldDef cjlsubcuenta4;
    public FieldDef cjldebehaber4;
    public FieldDef cjlimporte4;
    public FieldDef cjlcuenta5;
    public FieldDef cjlsubcuenta5;
    public FieldDef cjldebehaber5;
    public FieldDef cjlimporte5;
    public FieldDef cjlcuenta6;
    public FieldDef cjlsubcuenta6;
    public FieldDef cjldebehaber6;
    public FieldDef cjlimporte6;
    public FieldDef cjlcuenta7;
    public FieldDef cjlsubcuenta7;
    public FieldDef cjldebehaber7;
    public FieldDef cjlimporte7;
    public FieldDef cjlcuenta8;
    public FieldDef cjlsubcuenta8;
    public FieldDef cjldebehaber8;
    public FieldDef cjlimporte8;
    public FieldDef cjlcuenta9;
    public FieldDef cjlsubcuenta9;
    public FieldDef cjldebehaber9;
    public FieldDef cjlimporte9;
    public FieldDef cjlcuenta10;
    public FieldDef cjlsubcuenta10;
    public FieldDef cjldebehaber10;
    public FieldDef cjlimporte10;
    public FieldDef cjlcuenta11;
    public FieldDef cjlsubcuenta11;
    public FieldDef cjldebehaber11;
    public FieldDef cjlimporte11;
    public FieldDef cjlcuenta12;
    public FieldDef cjlsubcuenta12;
    public FieldDef cjldebehaber12;
    public FieldDef cjlimporte12;
    public FieldDef cjlfactura;
    public FieldDef cjlnif_ivasop;
    public FieldDef cjldescivasop;
    public FieldDef cjlbase_irpf;
    public FieldDef cjlporirpf;
    public FieldDef cjlirpf;
    public FieldDef cjliva;
    public FieldDef cjlnumsop;
    public FieldDef cjltipoiva;
    public FieldDef cjltipoirpf;
    public FieldDef cjlmovsefact;
    public FieldDef cjlcolectivo;
    public TabCajalin(String name)
      {
      super(name);
      cjlcodigo = new FieldDef("cjlcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cjlasesor = new FieldDef("cjlasesor",FieldDef.INTEGER,0);
      cjlcaja = new FieldDef("cjlcaja",FieldDef.CHAR,2);
      cjlfecha = new FieldDef("cjlfecha",FieldDef.DATE);
      cjlcontador = new FieldDef("cjlcontador",FieldDef.INTEGER,0);
      cjlcliente = new FieldDef("cjlcliente",FieldDef.CHAR,15);
      cjlexpediente = new FieldDef("cjlexpediente",FieldDef.CHAR,15);
      cjlgestion = new FieldDef("cjlgestion",FieldDef.CHAR,15);
      cjltramite = new FieldDef("cjltramite",FieldDef.INTEGER,0);
      cjldescripcion = new FieldDef("cjldescripcion",FieldDef.CHAR,30);
      cjloperacion = new FieldDef("cjloperacion",FieldDef.CHAR,3);
      cjltipoconta = new FieldDef("cjltipoconta",FieldDef.INTEGER,0);
      cjlserie = new FieldDef("cjlserie",FieldDef.CHAR,10);
      cjlnuevaserie = new FieldDef("cjlnuevaserie",FieldDef.CHAR,10);
      cjlnuevonumero = new FieldDef("cjlnuevonumero",FieldDef.INTEGER,0);
      cjlimporte = new FieldDef("cjlimporte",FieldDef.FLOAT,6,0);
      cjlporivasop = new FieldDef("cjlporivasop",FieldDef.FLOAT,6,0);
      cjlbasesop = new FieldDef("cjlbasesop",FieldDef.FLOAT,6,0);
      cjlporivarep = new FieldDef("cjlporivarep",FieldDef.FLOAT,6,0);
      cjlcuenta1 = new FieldDef("cjlcuenta1",FieldDef.CHAR,4);
      cjlsubcuenta1 = new FieldDef("cjlsubcuenta1",FieldDef.CHAR,10);
      cjldebehaber1 = new FieldDef("cjldebehaber1",FieldDef.CHAR,1);
      cjlimporte1 = new FieldDef("cjlimporte1",FieldDef.FLOAT,6,0);
      cjlcuenta2 = new FieldDef("cjlcuenta2",FieldDef.CHAR,4);
      cjlsubcuenta2 = new FieldDef("cjlsubcuenta2",FieldDef.CHAR,10);
      cjldebehaber2 = new FieldDef("cjldebehaber2",FieldDef.CHAR,1);
      cjlimporte2 = new FieldDef("cjlimporte2",FieldDef.FLOAT,6,0);
      cjlcuenta3 = new FieldDef("cjlcuenta3",FieldDef.CHAR,4);
      cjlsubcuenta3 = new FieldDef("cjlsubcuenta3",FieldDef.CHAR,10);
      cjldebehaber3 = new FieldDef("cjldebehaber3",FieldDef.CHAR,1);
      cjlimporte3 = new FieldDef("cjlimporte3",FieldDef.FLOAT,6,0);
      cjlcuenta4 = new FieldDef("cjlcuenta4",FieldDef.CHAR,4);
      cjlsubcuenta4 = new FieldDef("cjlsubcuenta4",FieldDef.CHAR,10);
      cjldebehaber4 = new FieldDef("cjldebehaber4",FieldDef.CHAR,1);
      cjlimporte4 = new FieldDef("cjlimporte4",FieldDef.FLOAT,6,0);
      cjlcuenta5 = new FieldDef("cjlcuenta5",FieldDef.CHAR,4);
      cjlsubcuenta5 = new FieldDef("cjlsubcuenta5",FieldDef.CHAR,10);
      cjldebehaber5 = new FieldDef("cjldebehaber5",FieldDef.CHAR,1);
      cjlimporte5 = new FieldDef("cjlimporte5",FieldDef.FLOAT,6,0);
      cjlcuenta6 = new FieldDef("cjlcuenta6",FieldDef.CHAR,4);
      cjlsubcuenta6 = new FieldDef("cjlsubcuenta6",FieldDef.CHAR,10);
      cjldebehaber6 = new FieldDef("cjldebehaber6",FieldDef.CHAR,1);
      cjlimporte6 = new FieldDef("cjlimporte6",FieldDef.FLOAT,6,0);
      cjlcuenta7 = new FieldDef("cjlcuenta7",FieldDef.CHAR,4);
      cjlsubcuenta7 = new FieldDef("cjlsubcuenta7",FieldDef.CHAR,10);
      cjldebehaber7 = new FieldDef("cjldebehaber7",FieldDef.CHAR,1);
      cjlimporte7 = new FieldDef("cjlimporte7",FieldDef.FLOAT,6,0);
      cjlcuenta8 = new FieldDef("cjlcuenta8",FieldDef.CHAR,4);
      cjlsubcuenta8 = new FieldDef("cjlsubcuenta8",FieldDef.CHAR,10);
      cjldebehaber8 = new FieldDef("cjldebehaber8",FieldDef.CHAR,1);
      cjlimporte8 = new FieldDef("cjlimporte8",FieldDef.FLOAT,6,0);
      cjlcuenta9 = new FieldDef("cjlcuenta9",FieldDef.CHAR,4);
      cjlsubcuenta9 = new FieldDef("cjlsubcuenta9",FieldDef.CHAR,10);
      cjldebehaber9 = new FieldDef("cjldebehaber9",FieldDef.CHAR,1);
      cjlimporte9 = new FieldDef("cjlimporte9",FieldDef.FLOAT,6,0);
      cjlcuenta10 = new FieldDef("cjlcuenta10",FieldDef.CHAR,4);
      cjlsubcuenta10 = new FieldDef("cjlsubcuenta10",FieldDef.CHAR,10);
      cjldebehaber10 = new FieldDef("cjldebehaber10",FieldDef.CHAR,1);
      cjlimporte10 = new FieldDef("cjlimporte10",FieldDef.FLOAT,6,0);
      cjlcuenta11 = new FieldDef("cjlcuenta11",FieldDef.CHAR,4);
      cjlsubcuenta11 = new FieldDef("cjlsubcuenta11",FieldDef.CHAR,10);
      cjldebehaber11 = new FieldDef("cjldebehaber11",FieldDef.CHAR,1);
      cjlimporte11 = new FieldDef("cjlimporte11",FieldDef.FLOAT,6,0);
      cjlcuenta12 = new FieldDef("cjlcuenta12",FieldDef.CHAR,4);
      cjlsubcuenta12 = new FieldDef("cjlsubcuenta12",FieldDef.CHAR,10);
      cjldebehaber12 = new FieldDef("cjldebehaber12",FieldDef.CHAR,1);
      cjlimporte12 = new FieldDef("cjlimporte12",FieldDef.FLOAT,6,0);
      cjlfactura = new FieldDef("cjlfactura",FieldDef.INTEGER,0);
      cjlnif_ivasop = new FieldDef("cjlnif_ivasop",FieldDef.CHAR,15);
      cjldescivasop = new FieldDef("cjldescivasop",FieldDef.CHAR,30);
      cjlbase_irpf = new FieldDef("cjlbase_irpf",FieldDef.FLOAT,6,0);
      cjlporirpf = new FieldDef("cjlporirpf",FieldDef.FLOAT,6,0);
      cjlirpf = new FieldDef("cjlirpf",FieldDef.FLOAT,6,0);
      cjliva = new FieldDef("cjliva",FieldDef.FLOAT,6,0);
      cjlnumsop = new FieldDef("cjlnumsop",FieldDef.INTEGER,0);
      cjltipoiva = new FieldDef("cjltipoiva",FieldDef.INTEGER,0);
      cjltipoirpf = new FieldDef("cjltipoirpf",FieldDef.INTEGER,0);
      cjlmovsefact = new FieldDef("cjlmovsefact",FieldDef.CHAR,1);
      cjlcolectivo = new FieldDef("cjlcolectivo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        cjlcodigo,
        cjlasesor,
        cjlcaja,
        cjlfecha,
        cjlcontador,
        cjlcliente,
        cjlexpediente,
        cjlgestion,
        cjltramite,
        cjldescripcion,
        cjloperacion,
        cjltipoconta,
        cjlserie,
        cjlnuevaserie,
        cjlnuevonumero,
        cjlimporte,
        cjlporivasop,
        cjlbasesop,
        cjlporivarep,
        cjlcuenta1,
        cjlsubcuenta1,
        cjldebehaber1,
        cjlimporte1,
        cjlcuenta2,
        cjlsubcuenta2,
        cjldebehaber2,
        cjlimporte2,
        cjlcuenta3,
        cjlsubcuenta3,
        cjldebehaber3,
        cjlimporte3,
        cjlcuenta4,
        cjlsubcuenta4,
        cjldebehaber4,
        cjlimporte4,
        cjlcuenta5,
        cjlsubcuenta5,
        cjldebehaber5,
        cjlimporte5,
        cjlcuenta6,
        cjlsubcuenta6,
        cjldebehaber6,
        cjlimporte6,
        cjlcuenta7,
        cjlsubcuenta7,
        cjldebehaber7,
        cjlimporte7,
        cjlcuenta8,
        cjlsubcuenta8,
        cjldebehaber8,
        cjlimporte8,
        cjlcuenta9,
        cjlsubcuenta9,
        cjldebehaber9,
        cjlimporte9,
        cjlcuenta10,
        cjlsubcuenta10,
        cjldebehaber10,
        cjlimporte10,
        cjlcuenta11,
        cjlsubcuenta11,
        cjldebehaber11,
        cjlimporte11,
        cjlcuenta12,
        cjlsubcuenta12,
        cjldebehaber12,
        cjlimporte12,
        cjlfactura,
        cjlnif_ivasop,
        cjldescivasop,
        cjlbase_irpf,
        cjlporirpf,
        cjlirpf,
        cjliva,
        cjlnumsop,
        cjltipoiva,
        cjltipoirpf,
        cjlmovsefact,
        cjlcolectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {cjlcodigo };
      setPrimaryKeys(arrayf);
      cjlcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabHcajalin extends TableDef
    {
    // Campos
    public FieldDef hjlcodigo;
    public FieldDef hjlasesor;
    public FieldDef hjlcaja;
    public FieldDef hjlfecha;
    public FieldDef hjlcontador;
    public FieldDef hjlcliente;
    public FieldDef hjlexpediente;
    public FieldDef hjlgestion;
    public FieldDef hjltramite;
    public FieldDef hjldescripcion;
    public FieldDef hjloperacion;
    public FieldDef hjltipoconta;
    public FieldDef hjlserie;
    public FieldDef hjlnuevaserie;
    public FieldDef hjlnuevonumero;
    public FieldDef hjlimporte;
    public FieldDef hjlporivasop;
    public FieldDef hjlbasesop;
    public FieldDef hjlporivarep;
    public FieldDef hjlcuenta1;
    public FieldDef hjlsubcuenta1;
    public FieldDef hjldebehaber1;
    public FieldDef hjlimporte1;
    public FieldDef hjlcuenta2;
    public FieldDef hjlsubcuenta2;
    public FieldDef hjldebehaber2;
    public FieldDef hjlimporte2;
    public FieldDef hjlcuenta3;
    public FieldDef hjlsubcuenta3;
    public FieldDef hjldebehaber3;
    public FieldDef hjlimporte3;
    public FieldDef hjlcuenta4;
    public FieldDef hjlsubcuenta4;
    public FieldDef hjldebehaber4;
    public FieldDef hjlimporte4;
    public FieldDef hjlcuenta5;
    public FieldDef hjlsubcuenta5;
    public FieldDef hjldebehaber5;
    public FieldDef hjlimporte5;
    public FieldDef hjlcuenta6;
    public FieldDef hjlsubcuenta6;
    public FieldDef hjldebehaber6;
    public FieldDef hjlimporte6;
    public FieldDef hjlcuenta7;
    public FieldDef hjlsubcuenta7;
    public FieldDef hjldebehaber7;
    public FieldDef hjlimporte7;
    public FieldDef hjlcuenta8;
    public FieldDef hjlsubcuenta8;
    public FieldDef hjldebehaber8;
    public FieldDef hjlimporte8;
    public FieldDef hjlcuenta9;
    public FieldDef hjlsubcuenta9;
    public FieldDef hjldebehaber9;
    public FieldDef hjlimporte9;
    public FieldDef hjlcuenta10;
    public FieldDef hjlsubcuenta10;
    public FieldDef hjldebehaber10;
    public FieldDef hjlimporte10;
    public FieldDef hjlcuenta11;
    public FieldDef hjlsubcuenta11;
    public FieldDef hjldebehaber11;
    public FieldDef hjlimporte11;
    public FieldDef hjlcuenta12;
    public FieldDef hjlsubcuenta12;
    public FieldDef hjldebehaber12;
    public FieldDef hjlimporte12;
    public FieldDef hjlfactura;
    public FieldDef hjlnif_ivasop;
    public FieldDef hjldescivasop;
    public FieldDef hjlbase_irpf;
    public FieldDef hjlporirpf;
    public FieldDef hjlirpf;
    public FieldDef hjlnumsop;
    public FieldDef hjltipoiva;
    public FieldDef hjltipoirpf;
    public FieldDef hjlmovsefact;
    public FieldDef hjliva;
    public FieldDef hjlcolectivo;
    public TabHcajalin(String name)
      {
      super(name);
      hjlcodigo = new FieldDef("hjlcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hjlasesor = new FieldDef("hjlasesor",FieldDef.INTEGER,0);
      hjlcaja = new FieldDef("hjlcaja",FieldDef.CHAR,2);
      hjlfecha = new FieldDef("hjlfecha",FieldDef.DATE);
      hjlcontador = new FieldDef("hjlcontador",FieldDef.INTEGER,0);
      hjlcliente = new FieldDef("hjlcliente",FieldDef.CHAR,15);
      hjlexpediente = new FieldDef("hjlexpediente",FieldDef.CHAR,15);
      hjlgestion = new FieldDef("hjlgestion",FieldDef.CHAR,15);
      hjltramite = new FieldDef("hjltramite",FieldDef.INTEGER,0);
      hjldescripcion = new FieldDef("hjldescripcion",FieldDef.CHAR,30);
      hjloperacion = new FieldDef("hjloperacion",FieldDef.CHAR,3);
      hjltipoconta = new FieldDef("hjltipoconta",FieldDef.INTEGER,0);
      hjlserie = new FieldDef("hjlserie",FieldDef.CHAR,10);
      hjlnuevaserie = new FieldDef("hjlnuevaserie",FieldDef.CHAR,10);
      hjlnuevonumero = new FieldDef("hjlnuevonumero",FieldDef.INTEGER,0);
      hjlimporte = new FieldDef("hjlimporte",FieldDef.FLOAT,6,0);
      hjlporivasop = new FieldDef("hjlporivasop",FieldDef.FLOAT,6,0);
      hjlbasesop = new FieldDef("hjlbasesop",FieldDef.FLOAT,6,0);
      hjlporivarep = new FieldDef("hjlporivarep",FieldDef.FLOAT,6,0);
      hjlcuenta1 = new FieldDef("hjlcuenta1",FieldDef.CHAR,4);
      hjlsubcuenta1 = new FieldDef("hjlsubcuenta1",FieldDef.CHAR,10);
      hjldebehaber1 = new FieldDef("hjldebehaber1",FieldDef.CHAR,1);
      hjlimporte1 = new FieldDef("hjlimporte1",FieldDef.FLOAT,6,0);
      hjlcuenta2 = new FieldDef("hjlcuenta2",FieldDef.CHAR,4);
      hjlsubcuenta2 = new FieldDef("hjlsubcuenta2",FieldDef.CHAR,10);
      hjldebehaber2 = new FieldDef("hjldebehaber2",FieldDef.CHAR,1);
      hjlimporte2 = new FieldDef("hjlimporte2",FieldDef.FLOAT,6,0);
      hjlcuenta3 = new FieldDef("hjlcuenta3",FieldDef.CHAR,4);
      hjlsubcuenta3 = new FieldDef("hjlsubcuenta3",FieldDef.CHAR,10);
      hjldebehaber3 = new FieldDef("hjldebehaber3",FieldDef.CHAR,1);
      hjlimporte3 = new FieldDef("hjlimporte3",FieldDef.FLOAT,6,0);
      hjlcuenta4 = new FieldDef("hjlcuenta4",FieldDef.CHAR,4);
      hjlsubcuenta4 = new FieldDef("hjlsubcuenta4",FieldDef.CHAR,10);
      hjldebehaber4 = new FieldDef("hjldebehaber4",FieldDef.CHAR,1);
      hjlimporte4 = new FieldDef("hjlimporte4",FieldDef.FLOAT,6,0);
      hjlcuenta5 = new FieldDef("hjlcuenta5",FieldDef.CHAR,4);
      hjlsubcuenta5 = new FieldDef("hjlsubcuenta5",FieldDef.CHAR,10);
      hjldebehaber5 = new FieldDef("hjldebehaber5",FieldDef.CHAR,1);
      hjlimporte5 = new FieldDef("hjlimporte5",FieldDef.FLOAT,6,0);
      hjlcuenta6 = new FieldDef("hjlcuenta6",FieldDef.CHAR,4);
      hjlsubcuenta6 = new FieldDef("hjlsubcuenta6",FieldDef.CHAR,10);
      hjldebehaber6 = new FieldDef("hjldebehaber6",FieldDef.CHAR,1);
      hjlimporte6 = new FieldDef("hjlimporte6",FieldDef.FLOAT,6,0);
      hjlcuenta7 = new FieldDef("hjlcuenta7",FieldDef.CHAR,4);
      hjlsubcuenta7 = new FieldDef("hjlsubcuenta7",FieldDef.CHAR,10);
      hjldebehaber7 = new FieldDef("hjldebehaber7",FieldDef.CHAR,1);
      hjlimporte7 = new FieldDef("hjlimporte7",FieldDef.FLOAT,6,0);
      hjlcuenta8 = new FieldDef("hjlcuenta8",FieldDef.CHAR,4);
      hjlsubcuenta8 = new FieldDef("hjlsubcuenta8",FieldDef.CHAR,10);
      hjldebehaber8 = new FieldDef("hjldebehaber8",FieldDef.CHAR,1);
      hjlimporte8 = new FieldDef("hjlimporte8",FieldDef.FLOAT,6,0);
      hjlcuenta9 = new FieldDef("hjlcuenta9",FieldDef.CHAR,4);
      hjlsubcuenta9 = new FieldDef("hjlsubcuenta9",FieldDef.CHAR,10);
      hjldebehaber9 = new FieldDef("hjldebehaber9",FieldDef.CHAR,1);
      hjlimporte9 = new FieldDef("hjlimporte9",FieldDef.FLOAT,6,0);
      hjlcuenta10 = new FieldDef("hjlcuenta10",FieldDef.CHAR,4);
      hjlsubcuenta10 = new FieldDef("hjlsubcuenta10",FieldDef.CHAR,10);
      hjldebehaber10 = new FieldDef("hjldebehaber10",FieldDef.CHAR,1);
      hjlimporte10 = new FieldDef("hjlimporte10",FieldDef.FLOAT,6,0);
      hjlcuenta11 = new FieldDef("hjlcuenta11",FieldDef.CHAR,4);
      hjlsubcuenta11 = new FieldDef("hjlsubcuenta11",FieldDef.CHAR,10);
      hjldebehaber11 = new FieldDef("hjldebehaber11",FieldDef.CHAR,1);
      hjlimporte11 = new FieldDef("hjlimporte11",FieldDef.FLOAT,6,0);
      hjlcuenta12 = new FieldDef("hjlcuenta12",FieldDef.CHAR,4);
      hjlsubcuenta12 = new FieldDef("hjlsubcuenta12",FieldDef.CHAR,10);
      hjldebehaber12 = new FieldDef("hjldebehaber12",FieldDef.CHAR,1);
      hjlimporte12 = new FieldDef("hjlimporte12",FieldDef.FLOAT,6,0);
      hjlfactura = new FieldDef("hjlfactura",FieldDef.INTEGER,0);
      hjlnif_ivasop = new FieldDef("hjlnif_ivasop",FieldDef.CHAR,15);
      hjldescivasop = new FieldDef("hjldescivasop",FieldDef.CHAR,30);
      hjlbase_irpf = new FieldDef("hjlbase_irpf",FieldDef.FLOAT,6,0);
      hjlporirpf = new FieldDef("hjlporirpf",FieldDef.FLOAT,6,0);
      hjlirpf = new FieldDef("hjlirpf",FieldDef.FLOAT,6,0);
      hjlnumsop = new FieldDef("hjlnumsop",FieldDef.INTEGER,0);
      hjltipoiva = new FieldDef("hjltipoiva",FieldDef.INTEGER,0);
      hjltipoirpf = new FieldDef("hjltipoirpf",FieldDef.INTEGER,0);
      hjlmovsefact = new FieldDef("hjlmovsefact",FieldDef.CHAR,1);
      hjliva = new FieldDef("hjliva",FieldDef.FLOAT,6,0);
      hjlcolectivo = new FieldDef("hjlcolectivo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        hjlcodigo,
        hjlasesor,
        hjlcaja,
        hjlfecha,
        hjlcontador,
        hjlcliente,
        hjlexpediente,
        hjlgestion,
        hjltramite,
        hjldescripcion,
        hjloperacion,
        hjltipoconta,
        hjlserie,
        hjlnuevaserie,
        hjlnuevonumero,
        hjlimporte,
        hjlporivasop,
        hjlbasesop,
        hjlporivarep,
        hjlcuenta1,
        hjlsubcuenta1,
        hjldebehaber1,
        hjlimporte1,
        hjlcuenta2,
        hjlsubcuenta2,
        hjldebehaber2,
        hjlimporte2,
        hjlcuenta3,
        hjlsubcuenta3,
        hjldebehaber3,
        hjlimporte3,
        hjlcuenta4,
        hjlsubcuenta4,
        hjldebehaber4,
        hjlimporte4,
        hjlcuenta5,
        hjlsubcuenta5,
        hjldebehaber5,
        hjlimporte5,
        hjlcuenta6,
        hjlsubcuenta6,
        hjldebehaber6,
        hjlimporte6,
        hjlcuenta7,
        hjlsubcuenta7,
        hjldebehaber7,
        hjlimporte7,
        hjlcuenta8,
        hjlsubcuenta8,
        hjldebehaber8,
        hjlimporte8,
        hjlcuenta9,
        hjlsubcuenta9,
        hjldebehaber9,
        hjlimporte9,
        hjlcuenta10,
        hjlsubcuenta10,
        hjldebehaber10,
        hjlimporte10,
        hjlcuenta11,
        hjlsubcuenta11,
        hjldebehaber11,
        hjlimporte11,
        hjlcuenta12,
        hjlsubcuenta12,
        hjldebehaber12,
        hjlimporte12,
        hjlfactura,
        hjlnif_ivasop,
        hjldescivasop,
        hjlbase_irpf,
        hjlporirpf,
        hjlirpf,
        hjlnumsop,
        hjltipoiva,
        hjltipoirpf,
        hjlmovsefact,
        hjliva,
        hjlcolectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {hjlcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDefastos extends TableDef
    {
    // Campos
    public FieldDef dfasesor;
    public FieldDef dfcodigo;
    public FieldDef dfnegativo;
    public FieldDef dfcuenta1;
    public FieldDef dfdebehaber1;
    public FieldDef dfimporte1;
    public FieldDef dfcuenta2;
    public FieldDef dfdebehaber2;
    public FieldDef dfimporte2;
    public FieldDef dfcuenta3;
    public FieldDef dfdebehaber3;
    public FieldDef dfimporte3;
    public FieldDef dfcuenta4;
    public FieldDef dfdebehaber4;
    public FieldDef dfimporte4;
    public FieldDef dfcuenta5;
    public FieldDef dfdebehaber5;
    public FieldDef dfimporte5;
    public FieldDef dfcuenta6;
    public FieldDef dfdebehaber6;
    public FieldDef dfimporte6;
    public FieldDef dfcuenta7;
    public FieldDef dfdebehaber7;
    public FieldDef dfimporte7;
    public FieldDef dfcuenta8;
    public FieldDef dfdebehaber8;
    public FieldDef dfimporte8;
    public FieldDef dfcuenta9;
    public FieldDef dfdebehaber9;
    public FieldDef dfimporte9;
    public FieldDef dfcuenta10;
    public FieldDef dfdebehaber10;
    public FieldDef dfimporte10;
    public FieldDef dfcuenta11;
    public FieldDef dfdebehaber11;
    public FieldDef dfimporte11;
    public FieldDef dfcuenta12;
    public FieldDef dfdebehaber12;
    public FieldDef dfimporte12;
    public FieldDef dfdescripcion1;
    public FieldDef dfdescripcion2;
    public FieldDef dfdescripcion3;
    public FieldDef dfdescripcion4;
    public FieldDef dfdescripcion5;
    public FieldDef dfdescripcion6;
    public FieldDef dfdescripcion7;
    public FieldDef dfdescripcion8;
    public FieldDef dfdescripcion9;
    public FieldDef dfdescripcion10;
    public FieldDef dfdescripcion11;
    public FieldDef dfdescripcion12;
    public TabDefastos(String name)
      {
      super(name);
      dfasesor = new FieldDef("dfasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dfcodigo = new FieldDef("dfcodigo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      dfnegativo = new FieldDef("dfnegativo",FieldDef.CHAR,1);
      dfcuenta1 = new FieldDef("dfcuenta1",FieldDef.CHAR,3);
      dfdebehaber1 = new FieldDef("dfdebehaber1",FieldDef.CHAR,1);
      dfimporte1 = new FieldDef("dfimporte1",FieldDef.CHAR,3);
      dfcuenta2 = new FieldDef("dfcuenta2",FieldDef.CHAR,3);
      dfdebehaber2 = new FieldDef("dfdebehaber2",FieldDef.CHAR,1);
      dfimporte2 = new FieldDef("dfimporte2",FieldDef.CHAR,3);
      dfcuenta3 = new FieldDef("dfcuenta3",FieldDef.CHAR,3);
      dfdebehaber3 = new FieldDef("dfdebehaber3",FieldDef.CHAR,1);
      dfimporte3 = new FieldDef("dfimporte3",FieldDef.CHAR,3);
      dfcuenta4 = new FieldDef("dfcuenta4",FieldDef.CHAR,3);
      dfdebehaber4 = new FieldDef("dfdebehaber4",FieldDef.CHAR,1);
      dfimporte4 = new FieldDef("dfimporte4",FieldDef.CHAR,3);
      dfcuenta5 = new FieldDef("dfcuenta5",FieldDef.CHAR,3);
      dfdebehaber5 = new FieldDef("dfdebehaber5",FieldDef.CHAR,1);
      dfimporte5 = new FieldDef("dfimporte5",FieldDef.CHAR,3);
      dfcuenta6 = new FieldDef("dfcuenta6",FieldDef.CHAR,3);
      dfdebehaber6 = new FieldDef("dfdebehaber6",FieldDef.CHAR,1);
      dfimporte6 = new FieldDef("dfimporte6",FieldDef.CHAR,3);
      dfcuenta7 = new FieldDef("dfcuenta7",FieldDef.CHAR,3);
      dfdebehaber7 = new FieldDef("dfdebehaber7",FieldDef.CHAR,1);
      dfimporte7 = new FieldDef("dfimporte7",FieldDef.CHAR,3);
      dfcuenta8 = new FieldDef("dfcuenta8",FieldDef.CHAR,3);
      dfdebehaber8 = new FieldDef("dfdebehaber8",FieldDef.CHAR,1);
      dfimporte8 = new FieldDef("dfimporte8",FieldDef.CHAR,3);
      dfcuenta9 = new FieldDef("dfcuenta9",FieldDef.CHAR,3);
      dfdebehaber9 = new FieldDef("dfdebehaber9",FieldDef.CHAR,1);
      dfimporte9 = new FieldDef("dfimporte9",FieldDef.CHAR,3);
      dfcuenta10 = new FieldDef("dfcuenta10",FieldDef.CHAR,3);
      dfdebehaber10 = new FieldDef("dfdebehaber10",FieldDef.CHAR,1);
      dfimporte10 = new FieldDef("dfimporte10",FieldDef.CHAR,3);
      dfcuenta11 = new FieldDef("dfcuenta11",FieldDef.CHAR,3);
      dfdebehaber11 = new FieldDef("dfdebehaber11",FieldDef.CHAR,1);
      dfimporte11 = new FieldDef("dfimporte11",FieldDef.CHAR,3);
      dfcuenta12 = new FieldDef("dfcuenta12",FieldDef.CHAR,3);
      dfdebehaber12 = new FieldDef("dfdebehaber12",FieldDef.CHAR,1);
      dfimporte12 = new FieldDef("dfimporte12",FieldDef.CHAR,3);
      dfdescripcion1 = new FieldDef("dfdescripcion1",FieldDef.CHAR,3);
      dfdescripcion2 = new FieldDef("dfdescripcion2",FieldDef.CHAR,3);
      dfdescripcion3 = new FieldDef("dfdescripcion3",FieldDef.CHAR,3);
      dfdescripcion4 = new FieldDef("dfdescripcion4",FieldDef.CHAR,3);
      dfdescripcion5 = new FieldDef("dfdescripcion5",FieldDef.CHAR,3);
      dfdescripcion6 = new FieldDef("dfdescripcion6",FieldDef.CHAR,3);
      dfdescripcion7 = new FieldDef("dfdescripcion7",FieldDef.CHAR,3);
      dfdescripcion8 = new FieldDef("dfdescripcion8",FieldDef.CHAR,3);
      dfdescripcion9 = new FieldDef("dfdescripcion9",FieldDef.CHAR,3);
      dfdescripcion10 = new FieldDef("dfdescripcion10",FieldDef.CHAR,3);
      dfdescripcion11 = new FieldDef("dfdescripcion11",FieldDef.CHAR,3);
      dfdescripcion12 = new FieldDef("dfdescripcion12",FieldDef.CHAR,3);
      FieldDef array[] = {
        dfasesor,
        dfcodigo,
        dfnegativo,
        dfcuenta1,
        dfdebehaber1,
        dfimporte1,
        dfcuenta2,
        dfdebehaber2,
        dfimporte2,
        dfcuenta3,
        dfdebehaber3,
        dfimporte3,
        dfcuenta4,
        dfdebehaber4,
        dfimporte4,
        dfcuenta5,
        dfdebehaber5,
        dfimporte5,
        dfcuenta6,
        dfdebehaber6,
        dfimporte6,
        dfcuenta7,
        dfdebehaber7,
        dfimporte7,
        dfcuenta8,
        dfdebehaber8,
        dfimporte8,
        dfcuenta9,
        dfdebehaber9,
        dfimporte9,
        dfcuenta10,
        dfdebehaber10,
        dfimporte10,
        dfcuenta11,
        dfdebehaber11,
        dfimporte11,
        dfcuenta12,
        dfdebehaber12,
        dfimporte12,
        dfdescripcion1,
        dfdescripcion2,
        dfdescripcion3,
        dfdescripcion4,
        dfdescripcion5,
        dfdescripcion6,
        dfdescripcion7,
        dfdescripcion8,
        dfdescripcion9,
        dfdescripcion10,
        dfdescripcion11,
        dfdescripcion12        
        };
      setColumns(array);
      FieldDef arrayf[] = {dfasesor,dfcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabFormatos extends TableDef
    {
    // Campos
    public FieldDef fmasesor;
    public FieldDef fmcodigo;
    public FieldDef fmdescripcion;
    public FieldDef fmlineas;
    public FieldDef fmtipo;
    public FieldDef fmficheroword;
    public FieldDef fmfraoreb;
    public FieldDef fmmodo;
    public FieldDef fmlindetallfij;
    public FieldDef fmlineaenblanco;
    public TabFormatos(String name)
      {
      super(name);
      fmasesor = new FieldDef("fmasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fmcodigo = new FieldDef("fmcodigo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      fmdescripcion = new FieldDef("fmdescripcion",FieldDef.CHAR,30);
      fmlineas = new FieldDef("fmlineas",FieldDef.INTEGER,0);
      fmtipo = new FieldDef("fmtipo",FieldDef.CHAR,1);
      fmficheroword = new FieldDef("fmficheroword",FieldDef.CHAR,100);
      fmfraoreb = new FieldDef("fmfraoreb",FieldDef.CHAR,1);
      fmmodo = new FieldDef("fmmodo",FieldDef.CHAR,1);
      fmlindetallfij = new FieldDef("fmlindetallfij",FieldDef.CHAR,1);
      fmlineaenblanco = new FieldDef("fmlineaenblanco",FieldDef.CHAR,1);
      FieldDef array[] = {
        fmasesor,
        fmcodigo,
        fmdescripcion,
        fmlineas,
        fmtipo,
        fmficheroword,
        fmfraoreb,
        fmmodo,
        fmlindetallfij,
        fmlineaenblanco        
        };
      setColumns(array);
      FieldDef arrayf[] = {fmasesor,fmcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabHoras extends TableDef
    {
    // Campos
    public FieldDef hocodigo;
    public FieldDef hoasesor;
    public FieldDef hoexpediente;
    public FieldDef hofecha;
    public FieldDef hohini;
    public FieldDef hominutoini;
    public FieldDef hohorafin;
    public FieldDef hominutofin;
    public FieldDef hocliente;
    public FieldDef horesponsable;
    public FieldDef hocategoria;
    public FieldDef hogestion;
    public FieldDef hotramite;
    public FieldDef hoduracionhoras;
    public FieldDef hoduraminutos;
    public FieldDef hoimporte;
    public FieldDef hofacturable;
    public FieldDef hoduracion;
    public FieldDef hoarea;
    public FieldDef hoservicio;
    public FieldDef hotarea;
    public TabHoras(String name)
      {
      super(name);
      hocodigo = new FieldDef("hocodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hoasesor = new FieldDef("hoasesor",FieldDef.INTEGER,0);
      hoexpediente = new FieldDef("hoexpediente",FieldDef.CHAR,15);
      hofecha = new FieldDef("hofecha",FieldDef.DATE);
      hohini = new FieldDef("hohini",FieldDef.INTEGER,0);
      hominutoini = new FieldDef("hominutoini",FieldDef.INTEGER,0);
      hohorafin = new FieldDef("hohorafin",FieldDef.INTEGER,0);
      hominutofin = new FieldDef("hominutofin",FieldDef.INTEGER,0);
      hocliente = new FieldDef("hocliente",FieldDef.CHAR,15);
      horesponsable = new FieldDef("horesponsable",FieldDef.CHAR,25);
      hocategoria = new FieldDef("hocategoria",FieldDef.CHAR,15);
      hogestion = new FieldDef("hogestion",FieldDef.CHAR,15);
      hotramite = new FieldDef("hotramite",FieldDef.INTEGER,0);
      hoduracionhoras = new FieldDef("hoduracionhoras",FieldDef.INTEGER,0);
      hoduraminutos = new FieldDef("hoduraminutos",FieldDef.INTEGER,0);
      hoimporte = new FieldDef("hoimporte",FieldDef.FLOAT,6,0);
      hofacturable = new FieldDef("hofacturable",FieldDef.CHAR,1);
      hoduracion = new FieldDef("hoduracion",FieldDef.FLOAT,6,0);
      hoarea = new FieldDef("hoarea",FieldDef.CHAR,25);
      hoservicio = new FieldDef("hoservicio",FieldDef.CHAR,25);
      hotarea = new FieldDef("hotarea",FieldDef.INTEGER,0);
      FieldDef array[] = {
        hocodigo,
        hoasesor,
        hoexpediente,
        hofecha,
        hohini,
        hominutoini,
        hohorafin,
        hominutofin,
        hocliente,
        horesponsable,
        hocategoria,
        hogestion,
        hotramite,
        hoduracionhoras,
        hoduraminutos,
        hoimporte,
        hofacturable,
        hoduracion,
        hoarea,
        hoservicio,
        hotarea        
        };
      setColumns(array);
      FieldDef arrayf[] = {hocodigo };
      setPrimaryKeys(arrayf);
      hocodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabObshoras extends TableDef
    {
    // Campos
    public FieldDef ohocodigo;
    public FieldDef ohoasesor;
    public FieldDef ohocodhoras;
    public FieldDef ohoobservacion;
    public TabObshoras(String name)
      {
      super(name);
      ohocodigo = new FieldDef("ohocodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ohoasesor = new FieldDef("ohoasesor",FieldDef.INTEGER,0);
      ohocodhoras = new FieldDef("ohocodhoras",FieldDef.INTEGER,0);
      ohoobservacion = new FieldDef("ohoobservacion",FieldDef.CHAR,75);
      FieldDef array[] = {
        ohocodigo,
        ohoasesor,
        ohocodhoras,
        ohoobservacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {ohocodigo };
      setPrimaryKeys(arrayf);
      ohocodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabSeleccion extends TableDef
    {
    // Campos
    public FieldDef selcodigo;
    public FieldDef selusuario;
    public FieldDef selprograma;
    public FieldDef selasesor;
    public FieldDef selcliente;
    public FieldDef selexpe;
    public FieldDef selcolab;
    public FieldDef selrespons;
    public FieldDef selentidad;
    public FieldDef selserie;
    public FieldDef selfactura;
    public TabSeleccion(String name)
      {
      super(name);
      selcodigo = new FieldDef("selcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      selusuario = new FieldDef("selusuario",FieldDef.CHAR,25);
      selprograma = new FieldDef("selprograma",FieldDef.CHAR,15);
      selasesor = new FieldDef("selasesor",FieldDef.INTEGER,0);
      selcliente = new FieldDef("selcliente",FieldDef.CHAR,15);
      selexpe = new FieldDef("selexpe",FieldDef.CHAR,15);
      selcolab = new FieldDef("selcolab",FieldDef.CHAR,15);
      selrespons = new FieldDef("selrespons",FieldDef.CHAR,25);
      selentidad = new FieldDef("selentidad",FieldDef.CHAR,1);
      selserie = new FieldDef("selserie",FieldDef.CHAR,10);
      selfactura = new FieldDef("selfactura",FieldDef.INTEGER,0);
      FieldDef array[] = {
        selcodigo,
        selusuario,
        selprograma,
        selasesor,
        selcliente,
        selexpe,
        selcolab,
        selrespons,
        selentidad,
        selserie,
        selfactura        
        };
      setColumns(array);
      FieldDef arrayf[] = {selcodigo };
      setPrimaryKeys(arrayf);
      selcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabObser extends TableDef
    {
    // Campos
    public FieldDef obscodigo;
    public FieldDef obsasesor;
    public FieldDef obscolectivo;
    public FieldDef obscliente;
    public FieldDef obsobservacion;
    public TabObser(String name)
      {
      super(name);
      obscodigo = new FieldDef("obscodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      obsasesor = new FieldDef("obsasesor",FieldDef.INTEGER,0);
      obscolectivo = new FieldDef("obscolectivo",FieldDef.INTEGER,0);
      obscliente = new FieldDef("obscliente",FieldDef.CHAR,15);
      obsobservacion = new FieldDef("obsobservacion",FieldDef.CHAR,75);
      FieldDef array[] = {
        obscodigo,
        obsasesor,
        obscolectivo,
        obscliente,
        obsobservacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {obscodigo };
      setPrimaryKeys(arrayf);
      obscodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabFicherosbanco extends TableDef
    {
    // Campos
    public FieldDef fibcodigo;
    public FieldDef fibasesor;
    public FieldDef fibnorma;
    public FieldDef fibpres;
    public FieldDef fibsufp;
    public FieldDef fibpresentador;
    public FieldDef fibdomiasesor;
    public FieldDef fibentidad;
    public FieldDef fiboficina;
    public FieldDef fibdigitos;
    public FieldDef fibcuenta;
    public FieldDef fiborden;
    public FieldDef fibsufo;
    public FieldDef fibordenante;
    public FieldDef fibtipnotifica;
    public FieldDef fibfechacrea;
    public FieldDef fibfechacargo;
    public FieldDef fibfolder;
    public FieldDef fibfile;
    public FieldDef fibtotal;
    public FieldDef fibnumrecibos;
    public FieldDef fibcodcaja;
    public FieldDef fibfechacaja;
    public FieldDef fibctacaja;
    public FieldDef fibsctacaja;
    public FieldDef fibestado;
    public FieldDef fibuser;
    public FieldDef fibresponsable;
    public TabFicherosbanco(String name)
      {
      super(name);
      fibcodigo = new FieldDef("fibcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fibasesor = new FieldDef("fibasesor",FieldDef.INTEGER,0);
      fibnorma = new FieldDef("fibnorma",FieldDef.CHAR,12);
      fibpres = new FieldDef("fibpres",FieldDef.CHAR,9);
      fibsufp = new FieldDef("fibsufp",FieldDef.INTEGER,0);
      fibpresentador = new FieldDef("fibpresentador",FieldDef.CHAR,40);
      fibdomiasesor = new FieldDef("fibdomiasesor",FieldDef.INTEGER,0);
      fibentidad = new FieldDef("fibentidad",FieldDef.CHAR,4);
      fiboficina = new FieldDef("fiboficina",FieldDef.CHAR,4);
      fibdigitos = new FieldDef("fibdigitos",FieldDef.CHAR,2);
      fibcuenta = new FieldDef("fibcuenta",FieldDef.CHAR,10);
      fiborden = new FieldDef("fiborden",FieldDef.CHAR,9);
      fibsufo = new FieldDef("fibsufo",FieldDef.CHAR,3);
      fibordenante = new FieldDef("fibordenante",FieldDef.CHAR,40);
      fibtipnotifica = new FieldDef("fibtipnotifica",FieldDef.CHAR,2);
      fibfechacrea = new FieldDef("fibfechacrea",FieldDef.DATE);
      fibfechacargo = new FieldDef("fibfechacargo",FieldDef.DATE);
      fibfolder = new FieldDef("fibfolder",FieldDef.CHAR,255);
      fibfile = new FieldDef("fibfile",FieldDef.CHAR,255);
      fibtotal = new FieldDef("fibtotal",FieldDef.FLOAT,6,0);
      fibnumrecibos = new FieldDef("fibnumrecibos",FieldDef.INTEGER,0);
      fibcodcaja = new FieldDef("fibcodcaja",FieldDef.CHAR,2);
      fibfechacaja = new FieldDef("fibfechacaja",FieldDef.DATE);
      fibctacaja = new FieldDef("fibctacaja",FieldDef.CHAR,4);
      fibsctacaja = new FieldDef("fibsctacaja",FieldDef.CHAR,10);
      fibestado = new FieldDef("fibestado",FieldDef.CHAR,1);
      fibuser = new FieldDef("fibuser",FieldDef.CHAR,25);
      fibresponsable = new FieldDef("fibresponsable",FieldDef.CHAR,25);
      FieldDef array[] = {
        fibcodigo,
        fibasesor,
        fibnorma,
        fibpres,
        fibsufp,
        fibpresentador,
        fibdomiasesor,
        fibentidad,
        fiboficina,
        fibdigitos,
        fibcuenta,
        fiborden,
        fibsufo,
        fibordenante,
        fibtipnotifica,
        fibfechacrea,
        fibfechacargo,
        fibfolder,
        fibfile,
        fibtotal,
        fibnumrecibos,
        fibcodcaja,
        fibfechacaja,
        fibctacaja,
        fibsctacaja,
        fibestado,
        fibuser,
        fibresponsable        
        };
      setColumns(array);
      FieldDef arrayf[] = {fibcodigo };
      setPrimaryKeys(arrayf);
      fibcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabParamlis extends TableDef
    {
    // Campos
    public FieldDef pliasesor;
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
      pliasesor = new FieldDef("pliasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
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
        pliasesor,
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
      FieldDef arrayf[] = {pliasesor,pliusuario,pliprograma,pliopcion };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTarnomge extends TableDef
    {
    // Campos
    public FieldDef trgasesor;
    public FieldDef trgcodigo;
    public FieldDef trgdescripcion;
    public TabTarnomge(String name)
      {
      super(name);
      trgasesor = new FieldDef("trgasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trgcodigo = new FieldDef("trgcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trgdescripcion = new FieldDef("trgdescripcion",FieldDef.CHAR,30);
      FieldDef array[] = {
        trgasesor,
        trgcodigo,
        trgdescripcion        
        };
      setColumns(array);
      FieldDef arrayf[] = {trgasesor,trgcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTarifnom extends TableDef
    {
    // Campos
    public FieldDef trncodigo;
    public FieldDef trnasesor;
    public FieldDef trntarifa;
    public FieldDef trngestion;
    public FieldDef trntramite;
    public FieldDef trntipoimp;
    public FieldDef trntipo1;
    public FieldDef trnvariable1;
    public FieldDef trnconstante1;
    public FieldDef trnoperacion1;
    public FieldDef trntipo2;
    public FieldDef trnvariable2;
    public FieldDef trnconstante2;
    public FieldDef trnoperacion2;
    public FieldDef trntipo3;
    public FieldDef trnvariable3;
    public FieldDef trnconstante3;
    public FieldDef trnoperacion3;
    public FieldDef trntipo4;
    public FieldDef trnvariable4;
    public FieldDef trnconstante4;
    public FieldDef trnoperacion4;
    public FieldDef trntipo5;
    public FieldDef trnvariable5;
    public FieldDef trnconstante5;
    public FieldDef trnoperacion5;
    public FieldDef trntipo6;
    public FieldDef trnvariable6;
    public FieldDef trnconstante6;
    public TabTarifnom(String name)
      {
      super(name);
      trncodigo = new FieldDef("trncodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trnasesor = new FieldDef("trnasesor",FieldDef.INTEGER,0);
      trntarifa = new FieldDef("trntarifa",FieldDef.INTEGER,0);
      trngestion = new FieldDef("trngestion",FieldDef.CHAR,15);
      trntramite = new FieldDef("trntramite",FieldDef.INTEGER,0);
      trntipoimp = new FieldDef("trntipoimp",FieldDef.CHAR,1);
      trntipo1 = new FieldDef("trntipo1",FieldDef.CHAR,1);
      trnvariable1 = new FieldDef("trnvariable1",FieldDef.CHAR,3);
      trnconstante1 = new FieldDef("trnconstante1",FieldDef.FLOAT,6,0);
      trnoperacion1 = new FieldDef("trnoperacion1",FieldDef.CHAR,1);
      trntipo2 = new FieldDef("trntipo2",FieldDef.CHAR,1);
      trnvariable2 = new FieldDef("trnvariable2",FieldDef.CHAR,3);
      trnconstante2 = new FieldDef("trnconstante2",FieldDef.FLOAT,6,0);
      trnoperacion2 = new FieldDef("trnoperacion2",FieldDef.CHAR,1);
      trntipo3 = new FieldDef("trntipo3",FieldDef.CHAR,1);
      trnvariable3 = new FieldDef("trnvariable3",FieldDef.CHAR,3);
      trnconstante3 = new FieldDef("trnconstante3",FieldDef.FLOAT,6,0);
      trnoperacion3 = new FieldDef("trnoperacion3",FieldDef.CHAR,1);
      trntipo4 = new FieldDef("trntipo4",FieldDef.CHAR,1);
      trnvariable4 = new FieldDef("trnvariable4",FieldDef.CHAR,3);
      trnconstante4 = new FieldDef("trnconstante4",FieldDef.FLOAT,6,0);
      trnoperacion4 = new FieldDef("trnoperacion4",FieldDef.CHAR,1);
      trntipo5 = new FieldDef("trntipo5",FieldDef.CHAR,1);
      trnvariable5 = new FieldDef("trnvariable5",FieldDef.CHAR,3);
      trnconstante5 = new FieldDef("trnconstante5",FieldDef.FLOAT,6,0);
      trnoperacion5 = new FieldDef("trnoperacion5",FieldDef.CHAR,1);
      trntipo6 = new FieldDef("trntipo6",FieldDef.CHAR,1);
      trnvariable6 = new FieldDef("trnvariable6",FieldDef.CHAR,3);
      trnconstante6 = new FieldDef("trnconstante6",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        trncodigo,
        trnasesor,
        trntarifa,
        trngestion,
        trntramite,
        trntipoimp,
        trntipo1,
        trnvariable1,
        trnconstante1,
        trnoperacion1,
        trntipo2,
        trnvariable2,
        trnconstante2,
        trnoperacion2,
        trntipo3,
        trnvariable3,
        trnconstante3,
        trnoperacion3,
        trntipo4,
        trnvariable4,
        trnconstante4,
        trnoperacion4,
        trntipo5,
        trnvariable5,
        trnconstante5,
        trnoperacion5,
        trntipo6,
        trnvariable6,
        trnconstante6        
        };
      setColumns(array);
      FieldDef arrayf[] = {trncodigo };
      setPrimaryKeys(arrayf);
      trncodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabTarnomva extends TableDef
    {
    // Campos
    public FieldDef trvasesor;
    public FieldDef trvcodigo;
    public FieldDef trvcontador;
    public FieldDef trvcondinador1;
    public FieldDef trvcondinante1;
    public FieldDef trvcondinado1;
    public FieldDef trvy_o1;
    public FieldDef trvcondinador2;
    public FieldDef trvcondinante2;
    public FieldDef trvcondinado2;
    public FieldDef trvy_o2;
    public FieldDef trvcondinador3;
    public FieldDef trvcondinante3;
    public FieldDef trvcondinado3;
    public FieldDef trvy_o3;
    public FieldDef trvcondinador4;
    public FieldDef trvcondinante4;
    public FieldDef trvcondinado4;
    public FieldDef trvtarifafinal;
    public TabTarnomva(String name)
      {
      super(name);
      trvasesor = new FieldDef("trvasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trvcodigo = new FieldDef("trvcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trvcontador = new FieldDef("trvcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trvcondinador1 = new FieldDef("trvcondinador1",FieldDef.CHAR,3);
      trvcondinante1 = new FieldDef("trvcondinante1",FieldDef.CHAR,2);
      trvcondinado1 = new FieldDef("trvcondinado1",FieldDef.FLOAT,6,0);
      trvy_o1 = new FieldDef("trvy_o1",FieldDef.CHAR,1);
      trvcondinador2 = new FieldDef("trvcondinador2",FieldDef.CHAR,3);
      trvcondinante2 = new FieldDef("trvcondinante2",FieldDef.CHAR,2);
      trvcondinado2 = new FieldDef("trvcondinado2",FieldDef.FLOAT,6,0);
      trvy_o2 = new FieldDef("trvy_o2",FieldDef.CHAR,1);
      trvcondinador3 = new FieldDef("trvcondinador3",FieldDef.CHAR,3);
      trvcondinante3 = new FieldDef("trvcondinante3",FieldDef.CHAR,2);
      trvcondinado3 = new FieldDef("trvcondinado3",FieldDef.FLOAT,6,0);
      trvy_o3 = new FieldDef("trvy_o3",FieldDef.CHAR,1);
      trvcondinador4 = new FieldDef("trvcondinador4",FieldDef.CHAR,3);
      trvcondinante4 = new FieldDef("trvcondinante4",FieldDef.CHAR,2);
      trvcondinado4 = new FieldDef("trvcondinado4",FieldDef.FLOAT,6,0);
      trvtarifafinal = new FieldDef("trvtarifafinal",FieldDef.INTEGER,0);
      FieldDef array[] = {
        trvasesor,
        trvcodigo,
        trvcontador,
        trvcondinador1,
        trvcondinante1,
        trvcondinado1,
        trvy_o1,
        trvcondinador2,
        trvcondinante2,
        trvcondinado2,
        trvy_o2,
        trvcondinador3,
        trvcondinante3,
        trvcondinado3,
        trvy_o3,
        trvcondinador4,
        trvcondinante4,
        trvcondinado4,
        trvtarifafinal        
        };
      setColumns(array);
      FieldDef arrayf[] = {trvasesor,trvcodigo,trvcontador };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabFacnom extends TableDef
    {
    // Campos
    public FieldDef fncodigoemp;
    public FieldDef fnejercicio;
    public FieldDef fnperiodo;
    public FieldDef fnantreb;
    public FieldDef fnbajtreb;
    public FieldDef fnaltreb;
    public FieldDef fnnumtra;
    public FieldDef fnbonif;
    public FieldDef fnpagextra;
    public FieldDef fnobrera;
    public FieldDef fnpatronal;
    public FieldDef fntotsegsoc;
    public FieldDef fnproddin;
    public FieldDef fnbdin;
    public FieldDef fnprodesp;
    public FieldDef fnbesp;
    public FieldDef fntotirpf;
    public FieldDef fnclaug;
    public FieldDef fnclauk;
    public FieldDef fnautonomos;
    public FieldDef fnproddinae;
    public FieldDef fnbdinae;
    public FieldDef fnprodespae;
    public FieldDef fnbespae;
    public TabFacnom(String name)
      {
      super(name);
      fncodigoemp = new FieldDef("fncodigoemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fnejercicio = new FieldDef("fnejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fnperiodo = new FieldDef("fnperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fnantreb = new FieldDef("fnantreb",FieldDef.FLOAT,6,0);
      fnbajtreb = new FieldDef("fnbajtreb",FieldDef.FLOAT,6,0);
      fnaltreb = new FieldDef("fnaltreb",FieldDef.FLOAT,6,0);
      fnnumtra = new FieldDef("fnnumtra",FieldDef.FLOAT,6,0);
      fnbonif = new FieldDef("fnbonif",FieldDef.FLOAT,6,0);
      fnpagextra = new FieldDef("fnpagextra",FieldDef.FLOAT,6,0);
      fnobrera = new FieldDef("fnobrera",FieldDef.FLOAT,6,0);
      fnpatronal = new FieldDef("fnpatronal",FieldDef.FLOAT,6,0);
      fntotsegsoc = new FieldDef("fntotsegsoc",FieldDef.FLOAT,6,0);
      fnproddin = new FieldDef("fnproddin",FieldDef.FLOAT,6,0);
      fnbdin = new FieldDef("fnbdin",FieldDef.FLOAT,6,0);
      fnprodesp = new FieldDef("fnprodesp",FieldDef.FLOAT,6,0);
      fnbesp = new FieldDef("fnbesp",FieldDef.FLOAT,6,0);
      fntotirpf = new FieldDef("fntotirpf",FieldDef.FLOAT,6,0);
      fnclaug = new FieldDef("fnclaug",FieldDef.FLOAT,6,0);
      fnclauk = new FieldDef("fnclauk",FieldDef.FLOAT,6,0);
      fnautonomos = new FieldDef("fnautonomos",FieldDef.FLOAT,6,0);
      fnproddinae = new FieldDef("fnproddinae",FieldDef.FLOAT,6,0);
      fnbdinae = new FieldDef("fnbdinae",FieldDef.FLOAT,6,0);
      fnprodespae = new FieldDef("fnprodespae",FieldDef.FLOAT,6,0);
      fnbespae = new FieldDef("fnbespae",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        fncodigoemp,
        fnejercicio,
        fnperiodo,
        fnantreb,
        fnbajtreb,
        fnaltreb,
        fnnumtra,
        fnbonif,
        fnpagextra,
        fnobrera,
        fnpatronal,
        fntotsegsoc,
        fnproddin,
        fnbdin,
        fnprodesp,
        fnbesp,
        fntotirpf,
        fnclaug,
        fnclauk,
        fnautonomos,
        fnproddinae,
        fnbdinae,
        fnprodespae,
        fnbespae        
        };
      setColumns(array);
      FieldDef arrayf[] = {fncodigoemp,fnejercicio,fnperiodo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAuxcab extends TableDef
    {
    // Campos
    public FieldDef auxcasesor;
    public FieldDef auxcarchivo;
    public FieldDef auxcdescripcion;
    public FieldDef auxctipo;
    public FieldDef auxcenlace1;
    public FieldDef auxcenlace2;
    public FieldDef auxcenlace3;
    public FieldDef auxcenlace4;
    public FieldDef auxcenlace5;
    public FieldDef auxcintegrado;
    public FieldDef auxcorientacion;
    public FieldDef auxcestadobd;
    public FieldDef auxcplantilla;
    public TabAuxcab(String name)
      {
      super(name);
      auxcasesor = new FieldDef("auxcasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      auxcarchivo = new FieldDef("auxcarchivo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      auxcdescripcion = new FieldDef("auxcdescripcion",FieldDef.CHAR,30);
      auxctipo = new FieldDef("auxctipo",FieldDef.CHAR,1);
      auxcenlace1 = new FieldDef("auxcenlace1",FieldDef.CHAR,15);
      auxcenlace2 = new FieldDef("auxcenlace2",FieldDef.CHAR,15);
      auxcenlace3 = new FieldDef("auxcenlace3",FieldDef.CHAR,15);
      auxcenlace4 = new FieldDef("auxcenlace4",FieldDef.CHAR,15);
      auxcenlace5 = new FieldDef("auxcenlace5",FieldDef.CHAR,15);
      auxcintegrado = new FieldDef("auxcintegrado",FieldDef.CHAR,1);
      auxcorientacion = new FieldDef("auxcorientacion",FieldDef.CHAR,1);
      auxcestadobd = new FieldDef("auxcestadobd",FieldDef.CHAR,1);
      auxcplantilla = new FieldDef("auxcplantilla",FieldDef.CHAR,250);
      FieldDef array[] = {
        auxcasesor,
        auxcarchivo,
        auxcdescripcion,
        auxctipo,
        auxcenlace1,
        auxcenlace2,
        auxcenlace3,
        auxcenlace4,
        auxcenlace5,
        auxcintegrado,
        auxcorientacion,
        auxcestadobd,
        auxcplantilla        
        };
      setColumns(array);
      FieldDef arrayf[] = {auxcasesor,auxcarchivo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAuxdet extends TableDef
    {
    // Campos
    public FieldDef auxdasesor;
    public FieldDef auxdarchivo;
    public FieldDef auxdcampo;
    public FieldDef auxdreferencia;
    public FieldDef auxdtitulo;
    public FieldDef auxdtipo;
    public FieldDef auxdlongitud;
    public FieldDef auxddecimales;
    public FieldDef auxdmascara;
    public FieldDef auxdlinea;
    public FieldDef auxdcolumna;
    public FieldDef auxdcumplimenta;
    public FieldDef auxdprocesos;
    public FieldDef auxdventana;
    public FieldDef auxdcomentario;
    public FieldDef auxdliteformula;
    public FieldDef auxdvalautomati;
    public FieldDef auxdarchivopick;
    public FieldDef auxdcodipick;
    public FieldDef auxddescrpick;
    public FieldDef auxdclavepick;
    public FieldDef auxdestadobd;
    public TabAuxdet(String name)
      {
      super(name);
      auxdasesor = new FieldDef("auxdasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      auxdarchivo = new FieldDef("auxdarchivo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      auxdcampo = new FieldDef("auxdcampo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      auxdreferencia = new FieldDef("auxdreferencia",FieldDef.CHAR,15);
      auxdtitulo = new FieldDef("auxdtitulo",FieldDef.CHAR,30);
      auxdtipo = new FieldDef("auxdtipo",FieldDef.CHAR,1);
      auxdlongitud = new FieldDef("auxdlongitud",FieldDef.INTEGER,0);
      auxddecimales = new FieldDef("auxddecimales",FieldDef.INTEGER,0);
      auxdmascara = new FieldDef("auxdmascara",FieldDef.CHAR,30);
      auxdlinea = new FieldDef("auxdlinea",FieldDef.INTEGER,0);
      auxdcolumna = new FieldDef("auxdcolumna",FieldDef.INTEGER,0);
      auxdcumplimenta = new FieldDef("auxdcumplimenta",FieldDef.CHAR,1);
      auxdprocesos = new FieldDef("auxdprocesos",FieldDef.CHAR,1);
      auxdventana = new FieldDef("auxdventana",FieldDef.CHAR,1);
      auxdcomentario = new FieldDef("auxdcomentario",FieldDef.CHAR,70);
      auxdliteformula = new FieldDef("auxdliteformula",FieldDef.CHAR,1);
      auxdvalautomati = new FieldDef("auxdvalautomati",FieldDef.CHAR,250);
      auxdarchivopick = new FieldDef("auxdarchivopick",FieldDef.CHAR,15);
      auxdcodipick = new FieldDef("auxdcodipick",FieldDef.CHAR,15);
      auxddescrpick = new FieldDef("auxddescrpick",FieldDef.CHAR,15);
      auxdclavepick = new FieldDef("auxdclavepick",FieldDef.CHAR,30);
      auxdestadobd = new FieldDef("auxdestadobd",FieldDef.CHAR,1);
      FieldDef array[] = {
        auxdasesor,
        auxdarchivo,
        auxdcampo,
        auxdreferencia,
        auxdtitulo,
        auxdtipo,
        auxdlongitud,
        auxddecimales,
        auxdmascara,
        auxdlinea,
        auxdcolumna,
        auxdcumplimenta,
        auxdprocesos,
        auxdventana,
        auxdcomentario,
        auxdliteformula,
        auxdvalautomati,
        auxdarchivopick,
        auxdcodipick,
        auxddescrpick,
        auxdclavepick,
        auxdestadobd        
        };
      setColumns(array);
      FieldDef arrayf[] = {auxdasesor,auxdarchivo,auxdcampo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAuxrel extends TableDef
    {
    // Campos
    public FieldDef auxrasesor;
    public FieldDef auxrarchivo;
    public FieldDef auxrcampo;
    public FieldDef auxrorden;
    public FieldDef auxrarchivorel;
    public FieldDef auxrcampoorigen;
    public FieldDef auxrcampodestino;
    public TabAuxrel(String name)
      {
      super(name);
      auxrasesor = new FieldDef("auxrasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      auxrarchivo = new FieldDef("auxrarchivo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      auxrcampo = new FieldDef("auxrcampo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      auxrorden = new FieldDef("auxrorden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      auxrarchivorel = new FieldDef("auxrarchivorel",FieldDef.CHAR,15);
      auxrcampoorigen = new FieldDef("auxrcampoorigen",FieldDef.CHAR,15);
      auxrcampodestino = new FieldDef("auxrcampodestino",FieldDef.CHAR,15);
      FieldDef array[] = {
        auxrasesor,
        auxrarchivo,
        auxrcampo,
        auxrorden,
        auxrarchivorel,
        auxrcampoorigen,
        auxrcampodestino        
        };
      setColumns(array);
      FieldDef arrayf[] = {auxrasesor,auxrarchivo,auxrcampo,auxrorden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAuxproc extends TableDef
    {
    // Campos
    public FieldDef auxpasesor;
    public FieldDef auxparchivo;
    public FieldDef auxpcampo;
    public FieldDef auxporden;
    public FieldDef auxpcomparador;
    public FieldDef auxpcamplite;
    public FieldDef auxparchivmodif;
    public FieldDef auxpaccion;
    public FieldDef auxpcampo_modif;
    public FieldDef auxpnew_conten;
    public TabAuxproc(String name)
      {
      super(name);
      auxpasesor = new FieldDef("auxpasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      auxparchivo = new FieldDef("auxparchivo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      auxpcampo = new FieldDef("auxpcampo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      auxporden = new FieldDef("auxporden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      auxpcomparador = new FieldDef("auxpcomparador",FieldDef.CHAR,2);
      auxpcamplite = new FieldDef("auxpcamplite",FieldDef.CHAR,15);
      auxparchivmodif = new FieldDef("auxparchivmodif",FieldDef.CHAR,8);
      auxpaccion = new FieldDef("auxpaccion",FieldDef.CHAR,5);
      auxpcampo_modif = new FieldDef("auxpcampo_modif",FieldDef.CHAR,15);
      auxpnew_conten = new FieldDef("auxpnew_conten",FieldDef.CHAR,70);
      FieldDef array[] = {
        auxpasesor,
        auxparchivo,
        auxpcampo,
        auxporden,
        auxpcomparador,
        auxpcamplite,
        auxparchivmodif,
        auxpaccion,
        auxpcampo_modif,
        auxpnew_conten        
        };
      setColumns(array);
      FieldDef arrayf[] = {auxpasesor,auxparchivo,auxpcampo,auxporden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAuxval extends TableDef
    {
    // Campos
    public FieldDef auxvasesor;
    public FieldDef auxvfiltro;
    public FieldDef auxvcodigo;
    public FieldDef auxvdescripcion;
    public TabAuxval(String name)
      {
      super(name);
      auxvasesor = new FieldDef("auxvasesor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      auxvfiltro = new FieldDef("auxvfiltro",FieldDef.CHAR,30);
      auxvcodigo = new FieldDef("auxvcodigo",FieldDef.CHAR,10);
      auxvdescripcion = new FieldDef("auxvdescripcion",FieldDef.CHAR,30);
      FieldDef array[] = {
        auxvasesor,
        auxvfiltro,
        auxvcodigo,
        auxvdescripcion        
        };
      setColumns(array);
      FieldDef arrayf[] = {auxvasesor,auxvfiltro,auxvcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPlantillas extends TableDef
    {
    // Campos
    public FieldDef plaplicacion;
    public FieldDef plcodigo;
    public FieldDef plventana;
    public FieldDef pldescripcion;
    public FieldDef plusuario;
    public FieldDef plcatalogo;
    public FieldDef plcodiquery;
    public FieldDef plurlplantilla;
    public FieldDef plorigendades;
    public FieldDef plcampscombi;
    public FieldDef pltipoorig;
    public TabPlantillas(String name)
      {
      super(name);
      plaplicacion = new FieldDef("plaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      plcodigo = new FieldDef("plcodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      plventana = new FieldDef("plventana",FieldDef.CHAR,15,FieldDef.NOTNULL);
      pldescripcion = new FieldDef("pldescripcion",FieldDef.CHAR,50);
      plusuario = new FieldDef("plusuario",FieldDef.CHAR,25);
      plcatalogo = new FieldDef("plcatalogo",FieldDef.CHAR,15);
      plcodiquery = new FieldDef("plcodiquery",FieldDef.CHAR,15);
      plurlplantilla = new FieldDef("plurlplantilla",FieldDef.CHAR,250);
      plorigendades = new FieldDef("plorigendades",FieldDef.CHAR,250);
      plcampscombi = new FieldDef("plcampscombi",FieldDef.INTEGER,0);
      pltipoorig = new FieldDef("pltipoorig",FieldDef.CHAR,2);
      FieldDef array[] = {
        plaplicacion,
        plcodigo,
        plventana,
        pldescripcion,
        plusuario,
        plcatalogo,
        plcodiquery,
        plurlplantilla,
        plorigendades,
        plcampscombi,
        pltipoorig        
        };
      setColumns(array);
      FieldDef arrayf[] = {plaplicacion,plcodigo,plventana };
      setPrimaryKeys(arrayf);
      plaplicacion.setDescription("Aplicació Geyce utilitza la plantilla.");
      plcodigo.setDescription("Clau Primaria codi de plantilla");
      plventana.setDescription("Indicador si arriva el query per impresio de finestra");
      pldescripcion.setDescription("Descripció de la plantilla");
      plusuario.setDescription("Usuari creador de la plantilla");
      plcatalogo.setDescription("Cataleg Geyce que utilitza la plantilla.");
      plcodiquery.setDescription("Query associat a la plantilla");
      plurlplantilla.setDescription("Ubicació al disc de la plantilla");
      plorigendades.setDescription("Ubicació al disc del fitxer origen de dades");
      plcampscombi.setDescription("Numero de camps de combinació.");
      pltipoorig.setDescription("Tipus origen de dades (per query o per llistat predifinit)");
      }
    }
    
  public class TabCitas extends TableDef
    {
    // Campos
    public FieldDef cicodigo;
    public FieldDef ciasesor;
    public FieldDef cititulo;
    public FieldDef ciestado;
    public FieldDef citipo;
    public FieldDef cietiqueta;
    public FieldDef cipublico;
    public FieldDef cicliente;
    public FieldDef ciexpediente;
    public FieldDef ciresponsable;
    public FieldDef ciresponsorig;
    public FieldDef cisupervisor;
    public FieldDef cicontroler;
    public FieldDef cifechacrea;
    public FieldDef cifechaini;
    public FieldDef cifechafin;
    public FieldDef cifecharevi;
    public FieldDef ciarea;
    public FieldDef ciservicio;
    public FieldDef cidesc;
    public FieldDef ciurgencia;
    public FieldDef citarea;
    public FieldDef cihora;
    public FieldDef ciminuto;
    public FieldDef cisegundo;
    public FieldDef cihoraavis;
    public FieldDef ciminutoavis;
    public FieldDef cisegundoavis;
    public FieldDef cihoraini;
    public FieldDef cihorafin;
    public FieldDef citiempo;
    public FieldDef ciubicacion;
    public TabCitas(String name)
      {
      super(name);
      cicodigo = new FieldDef("cicodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ciasesor = new FieldDef("ciasesor",FieldDef.INTEGER,0);
      cititulo = new FieldDef("cititulo",FieldDef.CHAR,150);
      ciestado = new FieldDef("ciestado",FieldDef.CHAR,1);
      citipo = new FieldDef("citipo",FieldDef.CHAR,10);
      cietiqueta = new FieldDef("cietiqueta",FieldDef.CHAR,20);
      cipublico = new FieldDef("cipublico",FieldDef.CHAR,1);
      cicliente = new FieldDef("cicliente",FieldDef.CHAR,15);
      ciexpediente = new FieldDef("ciexpediente",FieldDef.CHAR,15);
      ciresponsable = new FieldDef("ciresponsable",FieldDef.CHAR,25);
      ciresponsorig = new FieldDef("ciresponsorig",FieldDef.CHAR,25);
      cisupervisor = new FieldDef("cisupervisor",FieldDef.CHAR,25);
      cicontroler = new FieldDef("cicontroler",FieldDef.CHAR,25);
      cifechacrea = new FieldDef("cifechacrea",FieldDef.DATE);
      cifechaini = new FieldDef("cifechaini",FieldDef.DATE);
      cifechafin = new FieldDef("cifechafin",FieldDef.DATE);
      cifecharevi = new FieldDef("cifecharevi",FieldDef.DATE);
      ciarea = new FieldDef("ciarea",FieldDef.CHAR,25);
      ciservicio = new FieldDef("ciservicio",FieldDef.CHAR,25);
      cidesc = new FieldDef("cidesc",FieldDef.CHAR,2000);
      ciurgencia = new FieldDef("ciurgencia",FieldDef.INTEGER,0);
      citarea = new FieldDef("citarea",FieldDef.INTEGER,0);
      cihora = new FieldDef("cihora",FieldDef.INTEGER,0);
      ciminuto = new FieldDef("ciminuto",FieldDef.INTEGER,0);
      cisegundo = new FieldDef("cisegundo",FieldDef.INTEGER,0);
      cihoraavis = new FieldDef("cihoraavis",FieldDef.INTEGER,0);
      ciminutoavis = new FieldDef("ciminutoavis",FieldDef.INTEGER,0);
      cisegundoavis = new FieldDef("cisegundoavis",FieldDef.INTEGER,0);
      cihoraini = new FieldDef("cihoraini",FieldDef.CHAR,8);
      cihorafin = new FieldDef("cihorafin",FieldDef.CHAR,8);
      citiempo = new FieldDef("citiempo",FieldDef.FLOAT,6,0);
      ciubicacion = new FieldDef("ciubicacion",FieldDef.CHAR,60);
      FieldDef array[] = {
        cicodigo,
        ciasesor,
        cititulo,
        ciestado,
        citipo,
        cietiqueta,
        cipublico,
        cicliente,
        ciexpediente,
        ciresponsable,
        ciresponsorig,
        cisupervisor,
        cicontroler,
        cifechacrea,
        cifechaini,
        cifechafin,
        cifecharevi,
        ciarea,
        ciservicio,
        cidesc,
        ciurgencia,
        citarea,
        cihora,
        ciminuto,
        cisegundo,
        cihoraavis,
        ciminutoavis,
        cisegundoavis,
        cihoraini,
        cihorafin,
        citiempo,
        ciubicacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {cicodigo };
      setPrimaryKeys(arrayf);
      cicodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabTipocitas extends TableDef
    {
    // Campos
    public FieldDef tcicodigo;
    public FieldDef tcititulo;
    public FieldDef tcibackcolorr;
    public FieldDef tcibackcolorg;
    public FieldDef tcibackcolorb;
    public FieldDef tcitextcolorr;
    public FieldDef tcitextcolorg;
    public FieldDef tcitextcolorb;
    public TabTipocitas(String name)
      {
      super(name);
      tcicodigo = new FieldDef("tcicodigo",FieldDef.CHAR,10,FieldDef.NOTNULL);
      tcititulo = new FieldDef("tcititulo",FieldDef.CHAR,50);
      tcibackcolorr = new FieldDef("tcibackcolorr",FieldDef.INTEGER,0);
      tcibackcolorg = new FieldDef("tcibackcolorg",FieldDef.INTEGER,0);
      tcibackcolorb = new FieldDef("tcibackcolorb",FieldDef.INTEGER,0);
      tcitextcolorr = new FieldDef("tcitextcolorr",FieldDef.INTEGER,0);
      tcitextcolorg = new FieldDef("tcitextcolorg",FieldDef.INTEGER,0);
      tcitextcolorb = new FieldDef("tcitextcolorb",FieldDef.INTEGER,0);
      FieldDef array[] = {
        tcicodigo,
        tcititulo,
        tcibackcolorr,
        tcibackcolorg,
        tcibackcolorb,
        tcitextcolorr,
        tcitextcolorg,
        tcitextcolorb        
        };
      setColumns(array);
      FieldDef arrayf[] = {tcicodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabUsuarioscitas extends TableDef
    {
    // Campos
    public FieldDef ucicodigo;
    public FieldDef uciuser;
    public FieldDef uciver;
    public FieldDef uciadd;
    public FieldDef ucimodif;
    public FieldDef ucisuprim;
    public FieldDef ucivar1;
    public FieldDef ucivar2;
    public FieldDef ucivar3;
    public TabUsuarioscitas(String name)
      {
      super(name);
      ucicodigo = new FieldDef("ucicodigo",FieldDef.CHAR,25,FieldDef.NOTNULL);
      uciuser = new FieldDef("uciuser",FieldDef.CHAR,25,FieldDef.NOTNULL);
      uciver = new FieldDef("uciver",FieldDef.CHAR,1);
      uciadd = new FieldDef("uciadd",FieldDef.CHAR,1);
      ucimodif = new FieldDef("ucimodif",FieldDef.CHAR,1);
      ucisuprim = new FieldDef("ucisuprim",FieldDef.CHAR,1);
      ucivar1 = new FieldDef("ucivar1",FieldDef.CHAR,1);
      ucivar2 = new FieldDef("ucivar2",FieldDef.CHAR,1);
      ucivar3 = new FieldDef("ucivar3",FieldDef.CHAR,1);
      FieldDef array[] = {
        ucicodigo,
        uciuser,
        uciver,
        uciadd,
        ucimodif,
        ucisuprim,
        ucivar1,
        ucivar2,
        ucivar3        
        };
      setColumns(array);
      FieldDef arrayf[] = {ucicodigo,uciuser };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabUbicacitas extends TableDef
    {
    // Campos
    public FieldDef bcicodigo;
    public FieldDef bciubicacion;
    public FieldDef bciuser;
    public TabUbicacitas(String name)
      {
      super(name);
      bcicodigo = new FieldDef("bcicodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bciubicacion = new FieldDef("bciubicacion",FieldDef.CHAR,60,FieldDef.NOTNULL);
      bciuser = new FieldDef("bciuser",FieldDef.CHAR,25);
      FieldDef array[] = {
        bcicodigo,
        bciubicacion,
        bciuser        
        };
      setColumns(array);
      FieldDef arrayf[] = {bcicodigo };
      setPrimaryKeys(arrayf);
      bcicodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabConversion extends TableDef
    {
    // Campos
    public FieldDef cnvnombd;
    public FieldDef cnvcodigo;
    public FieldDef cnvnombre;
    public FieldDef cnvcifnif;
    public FieldDef cnvnewcodigo;
    public FieldDef cnvruta;
    public FieldDef cnvestado;
    public FieldDef cnvseleccion;
    public FieldDef cnvfecha;
    public FieldDef cnvobserva;
    public TabConversion(String name)
      {
      super(name);
      cnvnombd = new FieldDef("cnvnombd",FieldDef.CHAR,30,FieldDef.NOTNULL);
      cnvcodigo = new FieldDef("cnvcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnvnombre = new FieldDef("cnvnombre",FieldDef.CHAR,100,FieldDef.NOTNULL);
      cnvcifnif = new FieldDef("cnvcifnif",FieldDef.CHAR,10,FieldDef.NOTNULL);
      cnvnewcodigo = new FieldDef("cnvnewcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnvruta = new FieldDef("cnvruta",FieldDef.CHAR,200);
      cnvestado = new FieldDef("cnvestado",FieldDef.CHAR,1);
      cnvseleccion = new FieldDef("cnvseleccion",FieldDef.CHAR,1);
      cnvfecha = new FieldDef("cnvfecha",FieldDef.DATE);
      cnvobserva = new FieldDef("cnvobserva",FieldDef.CHAR,100);
      FieldDef array[] = {
        cnvnombd,
        cnvcodigo,
        cnvnombre,
        cnvcifnif,
        cnvnewcodigo,
        cnvruta,
        cnvestado,
        cnvseleccion,
        cnvfecha,
        cnvobserva        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnvnombd,cnvcodigo };
      setPrimaryKeys(arrayf);
      cnvnombd.setDescription("Nombre de la base de datos a la que pertenece la empresa o convenio");
      cnvcodigo.setDescription("Código de las empresas o convenios");
      cnvnombre.setDescription("Nombre del ente");
      cnvcifnif.setDescription("Nif/Cif empresa o codigo convenio");
      cnvnewcodigo.setDescription("Codigo con el que se traspasará");
      cnvruta.setDescription("Ruta al servidor o al archivo");
      cnvestado.setDescription("Estado del ente (P pendiente, T traspasado)");
      cnvseleccion.setDescription("Registro seleccionado o no para traspasar");
      cnvfecha.setDescription("Fecha en la que realiza el traspaso");
      cnvobserva.setDescription("Observaciones de la conversion");
      }
    }
    
  public class TabAsientos extends TableDef
    {
    // Campos
    public FieldDef asicodi;
    public FieldDef asiempresa;
    public FieldDef asiejercicio;
    public FieldDef asicuenta;
    public FieldDef asisubcuenta;
    public FieldDef asifecha;
    public FieldDef asiasiento;
    public FieldDef asidiario;
    public FieldDef asidiario2;
    public FieldDef asidocumento;
    public FieldDef asidesc;
    public FieldDef asidebehaber;
    public FieldDef asiimporte;
    public FieldDef asicontraconta;
    public FieldDef asicontrasub;
    public FieldDef asirenumerado;
    public FieldDef asistatustras;
    public FieldDef asifechatras;
    public FieldDef asiproyecto;
    public FieldDef asidepartamento;
    public FieldDef asistatuscon;
    public FieldDef asifechacon;
    public FieldDef asistatuscas;
    public FieldDef asifechacas;
    public FieldDef asiastocas;
    public FieldDef asistatuspunteo;
    public FieldDef asifechapunteo;
    public FieldDef asitipoef;
    public TabAsientos(String name)
      {
      super(name);
      asicodi = new FieldDef("asicodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      asiempresa = new FieldDef("asiempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      asiejercicio = new FieldDef("asiejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      asicuenta = new FieldDef("asicuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      asisubcuenta = new FieldDef("asisubcuenta",FieldDef.CHAR,12,FieldDef.NOTNULL);
      asifecha = new FieldDef("asifecha",FieldDef.DATE);
      asiasiento = new FieldDef("asiasiento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      asidiario = new FieldDef("asidiario",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      asidiario2 = new FieldDef("asidiario2",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      asidocumento = new FieldDef("asidocumento",FieldDef.CHAR,10);
      asidesc = new FieldDef("asidesc",FieldDef.CHAR,40);
      asidebehaber = new FieldDef("asidebehaber",FieldDef.CHAR,1,FieldDef.NOTNULL);
      asiimporte = new FieldDef("asiimporte",FieldDef.FLOAT,6,0);
      asicontraconta = new FieldDef("asicontraconta",FieldDef.CHAR,4);
      asicontrasub = new FieldDef("asicontrasub",FieldDef.CHAR,12);
      asirenumerado = new FieldDef("asirenumerado",FieldDef.INTEGER,0);
      asistatustras = new FieldDef("asistatustras",FieldDef.CHAR,1);
      asifechatras = new FieldDef("asifechatras",FieldDef.DATE);
      asiproyecto = new FieldDef("asiproyecto",FieldDef.CHAR,5);
      asidepartamento = new FieldDef("asidepartamento",FieldDef.CHAR,5);
      asistatuscon = new FieldDef("asistatuscon",FieldDef.CHAR,1);
      asifechacon = new FieldDef("asifechacon",FieldDef.DATE);
      asistatuscas = new FieldDef("asistatuscas",FieldDef.CHAR,1);
      asifechacas = new FieldDef("asifechacas",FieldDef.DATE);
      asiastocas = new FieldDef("asiastocas",FieldDef.INTEGER,0);
      asistatuspunteo = new FieldDef("asistatuspunteo",FieldDef.CHAR,1);
      asifechapunteo = new FieldDef("asifechapunteo",FieldDef.DATE);
      asitipoef = new FieldDef("asitipoef",FieldDef.CHAR,5);
      FieldDef array[] = {
        asicodi,
        asiempresa,
        asiejercicio,
        asicuenta,
        asisubcuenta,
        asifecha,
        asiasiento,
        asidiario,
        asidiario2,
        asidocumento,
        asidesc,
        asidebehaber,
        asiimporte,
        asicontraconta,
        asicontrasub,
        asirenumerado,
        asistatustras,
        asifechatras,
        asiproyecto,
        asidepartamento,
        asistatuscon,
        asifechacon,
        asistatuscas,
        asifechacas,
        asiastocas,
        asistatuspunteo,
        asifechapunteo,
        asitipoef        
        };
      setColumns(array);
      FieldDef arrayf[] = {asicodi };
      setPrimaryKeys(arrayf);
      asicodi.setAutoIncrementable(true);
      }
    }
    
  public class TabPcuentas extends TableDef
    {
    // Campos
    public FieldDef pcuempresa;
    public FieldDef pcuejercicio;
    public FieldDef pcucuenta;
    public FieldDef pcusubcuenta;
    public FieldDef pculongitud;
    public FieldDef pcudesc;
    public FieldDef pcunif;
    public FieldDef pcuclipro;
    public FieldDef pcumediacion;
    public FieldDef pcucodiva;
    public FieldDef pcucodirpf;
    public FieldDef pcuivaded;
    public FieldDef pcu347;
    public FieldDef pcu349;
    public FieldDef pcuttrans;
    public FieldDef pcucodvto;
    public FieldDef pcudias1;
    public FieldDef pcudias2;
    public FieldDef pcudias3;
    public FieldDef pcudias4;
    public FieldDef pcudias5;
    public FieldDef pcudias6;
    public FieldDef pcu349signo;
    public FieldDef pcu349ejercicio;
    public FieldDef pcu349periodo;
    public FieldDef pcu349triangula;
    public FieldDef pcucontralapiz;
    public FieldDef pcuclave110;
    public FieldDef pcuctabanco;
    public FieldDef pcuvtopridia;
    public TabPcuentas(String name)
      {
      super(name);
      pcuempresa = new FieldDef("pcuempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcuejercicio = new FieldDef("pcuejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcucuenta = new FieldDef("pcucuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      pcusubcuenta = new FieldDef("pcusubcuenta",FieldDef.CHAR,12);
      pculongitud = new FieldDef("pculongitud",FieldDef.INTEGER,0);
      pcudesc = new FieldDef("pcudesc",FieldDef.CHAR,40);
      pcunif = new FieldDef("pcunif",FieldDef.CHAR,15);
      pcuclipro = new FieldDef("pcuclipro",FieldDef.CHAR,1);
      pcumediacion = new FieldDef("pcumediacion",FieldDef.CHAR,1);
      pcucodiva = new FieldDef("pcucodiva",FieldDef.INTEGER,0);
      pcucodirpf = new FieldDef("pcucodirpf",FieldDef.INTEGER,0);
      pcuivaded = new FieldDef("pcuivaded",FieldDef.CHAR,1);
      pcu347 = new FieldDef("pcu347",FieldDef.CHAR,1);
      pcu349 = new FieldDef("pcu349",FieldDef.CHAR,1);
      pcuttrans = new FieldDef("pcuttrans",FieldDef.CHAR,5);
      pcucodvto = new FieldDef("pcucodvto",FieldDef.CHAR,3);
      pcudias1 = new FieldDef("pcudias1",FieldDef.INTEGER,0);
      pcudias2 = new FieldDef("pcudias2",FieldDef.INTEGER,0);
      pcudias3 = new FieldDef("pcudias3",FieldDef.INTEGER,0);
      pcudias4 = new FieldDef("pcudias4",FieldDef.INTEGER,0);
      pcudias5 = new FieldDef("pcudias5",FieldDef.INTEGER,0);
      pcudias6 = new FieldDef("pcudias6",FieldDef.INTEGER,0);
      pcu349signo = new FieldDef("pcu349signo",FieldDef.CHAR,1);
      pcu349ejercicio = new FieldDef("pcu349ejercicio",FieldDef.INTEGER,0);
      pcu349periodo = new FieldDef("pcu349periodo",FieldDef.CHAR,2);
      pcu349triangula = new FieldDef("pcu349triangula",FieldDef.CHAR,1);
      pcucontralapiz = new FieldDef("pcucontralapiz",FieldDef.CHAR,20);
      pcuclave110 = new FieldDef("pcuclave110",FieldDef.CHAR,5);
      pcuctabanco = new FieldDef("pcuctabanco",FieldDef.CHAR,20);
      pcuvtopridia = new FieldDef("pcuvtopridia",FieldDef.INTEGER,0);
      FieldDef array[] = {
        pcuempresa,
        pcuejercicio,
        pcucuenta,
        pcusubcuenta,
        pculongitud,
        pcudesc,
        pcunif,
        pcuclipro,
        pcumediacion,
        pcucodiva,
        pcucodirpf,
        pcuivaded,
        pcu347,
        pcu349,
        pcuttrans,
        pcucodvto,
        pcudias1,
        pcudias2,
        pcudias3,
        pcudias4,
        pcudias5,
        pcudias6,
        pcu349signo,
        pcu349ejercicio,
        pcu349periodo,
        pcu349triangula,
        pcucontralapiz,
        pcuclave110,
        pcuctabanco,
        pcuvtopridia        
        };
      setColumns(array);
      FieldDef arrayf[] = {pcuempresa,pcuejercicio,pcucuenta,pcusubcuenta };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabIvacabecera extends TableDef
    {
    // Campos
    public FieldDef civcodi;
    public FieldDef civempresa;
    public FieldDef civejercicio;
    public FieldDef civivaigic;
    public FieldDef civserie;
    public FieldDef civregistro;
    public FieldDef civfecha;
    public FieldDef civdocumento;
    public FieldDef civdesc;
    public FieldDef civnif;
    public FieldDef civimporte;
    public FieldDef civemirep;
    public FieldDef civregimen;
    public FieldDef civasicodi;
    public FieldDef civporirpf;
    public FieldDef civbaseirpf;
    public FieldDef civimpiva;
    public FieldDef civfechaop;
    public FieldDef civmod110;
    public FieldDef civmod115;
    public FieldDef civop340;
    public FieldDef civclave110;
    public TabIvacabecera(String name)
      {
      super(name);
      civcodi = new FieldDef("civcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      civempresa = new FieldDef("civempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      civejercicio = new FieldDef("civejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      civivaigic = new FieldDef("civivaigic",FieldDef.CHAR,1,FieldDef.NOTNULL);
      civserie = new FieldDef("civserie",FieldDef.CHAR,2);
      civregistro = new FieldDef("civregistro",FieldDef.INTEGER,0);
      civfecha = new FieldDef("civfecha",FieldDef.DATE);
      civdocumento = new FieldDef("civdocumento",FieldDef.CHAR,10);
      civdesc = new FieldDef("civdesc",FieldDef.CHAR,40);
      civnif = new FieldDef("civnif",FieldDef.CHAR,15);
      civimporte = new FieldDef("civimporte",FieldDef.FLOAT,6,0);
      civemirep = new FieldDef("civemirep",FieldDef.CHAR,1,FieldDef.NOTNULL);
      civregimen = new FieldDef("civregimen",FieldDef.CHAR,2);
      civasicodi = new FieldDef("civasicodi",FieldDef.INTEGER,0);
      civporirpf = new FieldDef("civporirpf",FieldDef.FLOAT,6,0);
      civbaseirpf = new FieldDef("civbaseirpf",FieldDef.FLOAT,6,0);
      civimpiva = new FieldDef("civimpiva",FieldDef.FLOAT,6,0);
      civfechaop = new FieldDef("civfechaop",FieldDef.DATE);
      civmod110 = new FieldDef("civmod110",FieldDef.CHAR,1);
      civmod115 = new FieldDef("civmod115",FieldDef.CHAR,1);
      civop340 = new FieldDef("civop340",FieldDef.CHAR,1);
      civclave110 = new FieldDef("civclave110",FieldDef.CHAR,5);
      FieldDef array[] = {
        civcodi,
        civempresa,
        civejercicio,
        civivaigic,
        civserie,
        civregistro,
        civfecha,
        civdocumento,
        civdesc,
        civnif,
        civimporte,
        civemirep,
        civregimen,
        civasicodi,
        civporirpf,
        civbaseirpf,
        civimpiva,
        civfechaop,
        civmod110,
        civmod115,
        civop340,
        civclave110        
        };
      setColumns(array);
      FieldDef arrayf[] = {civcodi };
      setPrimaryKeys(arrayf);
      civcodi.setAutoIncrementable(true);
      }
    }
    
  public class TabIvalineas extends TableDef
    {
    // Campos
    public FieldDef livcodi;
    public FieldDef livcodilin;
    public FieldDef livasto;
    public FieldDef livporiva;
    public FieldDef livporrec;
    public FieldDef livbase;
    public FieldDef livimpiva;
    public FieldDef livimprec;
    public FieldDef livobra;
    public FieldDef livrectif;
    public FieldDef livejerrect;
    public FieldDef livperrect;
    public FieldDef livacum347;
    public FieldDef livacum349;
    public FieldDef livmediacion;
    public FieldDef livdeducible;
    public FieldDef livtransaccion;
    public FieldDef livopefec;
    public FieldDef livprorrata;
    public TabIvalineas(String name)
      {
      super(name);
      livcodi = new FieldDef("livcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      livcodilin = new FieldDef("livcodilin",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      livasto = new FieldDef("livasto",FieldDef.INTEGER,0);
      livporiva = new FieldDef("livporiva",FieldDef.FLOAT,6,0);
      livporrec = new FieldDef("livporrec",FieldDef.FLOAT,6,0);
      livbase = new FieldDef("livbase",FieldDef.FLOAT,6,0);
      livimpiva = new FieldDef("livimpiva",FieldDef.FLOAT,6,0);
      livimprec = new FieldDef("livimprec",FieldDef.FLOAT,6,0);
      livobra = new FieldDef("livobra",FieldDef.CHAR,1);
      livrectif = new FieldDef("livrectif",FieldDef.FLOAT,6,0);
      livejerrect = new FieldDef("livejerrect",FieldDef.INTEGER,0);
      livperrect = new FieldDef("livperrect",FieldDef.INTEGER,0);
      livacum347 = new FieldDef("livacum347",FieldDef.CHAR,1,FieldDef.NOTNULL);
      livacum349 = new FieldDef("livacum349",FieldDef.CHAR,1,FieldDef.NOTNULL);
      livmediacion = new FieldDef("livmediacion",FieldDef.CHAR,1,FieldDef.NOTNULL);
      livdeducible = new FieldDef("livdeducible",FieldDef.CHAR,1,FieldDef.NOTNULL);
      livtransaccion = new FieldDef("livtransaccion",FieldDef.CHAR,5,FieldDef.NOTNULL);
      livopefec = new FieldDef("livopefec",FieldDef.CHAR,1);
      livprorrata = new FieldDef("livprorrata",FieldDef.CHAR,1);
      FieldDef array[] = {
        livcodi,
        livcodilin,
        livasto,
        livporiva,
        livporrec,
        livbase,
        livimpiva,
        livimprec,
        livobra,
        livrectif,
        livejerrect,
        livperrect,
        livacum347,
        livacum349,
        livmediacion,
        livdeducible,
        livtransaccion,
        livopefec,
        livprorrata        
        };
      setColumns(array);
      FieldDef arrayf[] = {livcodi,livcodilin };
      setPrimaryKeys(arrayf);
      livcodilin.setAutoIncrementable(true);
      }
    }
    
  public CatJexpe()
    {
    tabperfilusuario = new TabPerfilusuario("perfilusuario");
    tabasesor = new TabAsesor("asesor");
    tabasesordomi = new TabAsesordomi("asesordomi");
    tabresponsables = new TabResponsables("responsables");
    tabresponsperfiles = new TabResponsperfiles("responsperfiles");
    tabcategorias = new TabCategorias("categorias");
    tabdepartamento = new TabDepartamento("departamento");
    tabtipodocs = new TabTipodocs("tipodocs");
    tabsubtipodocs = new TabSubtipodocs("subtipodocs");
    tabareaservicio = new TabAreaservicio("areaservicio");
    tabservicio = new TabServicio("servicio");
    tabtareasservicio = new TabTareasservicio("tareasservicio");
    tabgestion = new TabGestion("gestion");
    tabtramite = new TabTramite("tramite");
    tabtextram = new TabTextram("textram");
    tabtarifas = new TabTarifas("tarifas");
    tabtartramite = new TabTartramite("tartramite");
    tabdefexpe = new TabDefexpe("defexpe");
    tabclientes = new TabClientes("clientes");
    tabclienterel = new TabClienterel("clienterel");
    tabclicontactos = new TabClicontactos("clicontactos");
    tabhclicontactos = new TabHclicontactos("hclicontactos");
    tabdomi = new TabDomi("domi");
    tabhdomi = new TabHdomi("hdomi");
    tabcliservicios = new TabCliservicios("cliservicios");
    tabclitareas = new TabClitareas("clitareas");
    tabclinotas = new TabClinotas("clinotas");
    tabfitgen = new TabFitgen("fitgen");
    tabfitgenrepres = new TabFitgenrepres("fitgenrepres");
    tabfitgenbancos = new TabFitgenbancos("fitgenbancos");
    tabexpe = new TabExpe("expe");
    tabdocumento = new TabDocumento("documento");
    tabhdocumento = new TabHdocumento("hdocumento");
    tabdocmovimientos = new TabDocmovimientos("docmovimientos");
    tabdocacciones = new TabDocacciones("docacciones");
    tabdoccopias = new TabDoccopias("doccopias");
    tabvaloresexpe = new TabValoresexpe("valoresexpe");
    tabquefrase = new TabQuefrase("quefrase");
    tabquevariables = new TabQuevariables("quevariables");
    tabquetabla = new TabQuetabla("quetabla");
    tabquecolumn = new TabQuecolumn("quecolumn");
    tabauxhojas = new TabAuxhojas("auxhojas");
    tabauxfielddef = new TabAuxfielddef("auxfielddef");
    tabauxclientes = new TabAuxclientes("auxclientes");
    tabauxexpe = new TabAuxexpe("auxexpe");
    tabgycauto = new TabGycauto("gycauto");
    tabbds = new TabBds("bds");
    tabhclientes = new TabHclientes("hclientes");
    tabhexpe = new TabHexpe("hexpe");
    tabseries = new TabSeries("series");
    tabmovtos = new TabMovtos("movtos");
    tabhmovtos = new TabHmovtos("hmovtos");
    tabmovtotext = new TabMovtotext("movtotext");
    tabhmovtotext = new TabHmovtotext("hmovtotext");
    tabfactura = new TabFactura("factura");
    tabhfactura = new TabHfactura("hfactura");
    tababonodet = new TabAbonodet("abonodet");
    tabhabonodet = new TabHabonodet("habonodet");
    tababonohistor = new TabAbonohistor("abonohistor");
    tababonotex = new TabAbonotex("abonotex");
    tabrebuts = new TabRebuts("rebuts");
    tabhrebuts = new TabHrebuts("hrebuts");
    tabcaja = new TabCaja("caja");
    tabhcaja = new TabHcaja("hcaja");
    tabcajalin = new TabCajalin("cajalin");
    tabhcajalin = new TabHcajalin("hcajalin");
    tabdefastos = new TabDefastos("defastos");
    tabformatos = new TabFormatos("formatos");
    tabhoras = new TabHoras("horas");
    tabobshoras = new TabObshoras("obshoras");
    tabseleccion = new TabSeleccion("seleccion");
    tabobser = new TabObser("obser");
    tabficherosbanco = new TabFicherosbanco("ficherosbanco");
    tabparamlis = new TabParamlis("paramlis");
    tabtarnomge = new TabTarnomge("tarnomge");
    tabtarifnom = new TabTarifnom("tarifnom");
    tabtarnomva = new TabTarnomva("tarnomva");
    tabfacnom = new TabFacnom("facnom");
    tabauxcab = new TabAuxcab("auxcab");
    tabauxdet = new TabAuxdet("auxdet");
    tabauxrel = new TabAuxrel("auxrel");
    tabauxproc = new TabAuxproc("auxproc");
    tabauxval = new TabAuxval("auxval");
    tabplantillas = new TabPlantillas("plantillas");
    tabcitas = new TabCitas("citas");
    tabtipocitas = new TabTipocitas("tipocitas");
    tabusuarioscitas = new TabUsuarioscitas("usuarioscitas");
    tabubicacitas = new TabUbicacitas("ubicacitas");
    tabconversion = new TabConversion("conversion");
    tabasientos = new TabAsientos("asientos");
    tabpcuentas = new TabPcuentas("pcuentas");
    tabivacabecera = new TabIvacabecera("ivacabecera");
    tabivalineas = new TabIvalineas("ivalineas");
    TableDef array[] = {
      tabperfilusuario,
      tabasesor,
      tabasesordomi,
      tabresponsables,
      tabresponsperfiles,
      tabcategorias,
      tabdepartamento,
      tabtipodocs,
      tabsubtipodocs,
      tabareaservicio,
      tabservicio,
      tabtareasservicio,
      tabgestion,
      tabtramite,
      tabtextram,
      tabtarifas,
      tabtartramite,
      tabdefexpe,
      tabclientes,
      tabclienterel,
      tabclicontactos,
      tabhclicontactos,
      tabdomi,
      tabhdomi,
      tabcliservicios,
      tabclitareas,
      tabclinotas,
      tabfitgen,
      tabfitgenrepres,
      tabfitgenbancos,
      tabexpe,
      tabdocumento,
      tabhdocumento,
      tabdocmovimientos,
      tabdocacciones,
      tabdoccopias,
      tabvaloresexpe,
      tabquefrase,
      tabquevariables,
      tabquetabla,
      tabquecolumn,
      tabauxhojas,
      tabauxfielddef,
      tabauxclientes,
      tabauxexpe,
      tabgycauto,
      tabbds,
      tabhclientes,
      tabhexpe,
      tabseries,
      tabmovtos,
      tabhmovtos,
      tabmovtotext,
      tabhmovtotext,
      tabfactura,
      tabhfactura,
      tababonodet,
      tabhabonodet,
      tababonohistor,
      tababonotex,
      tabrebuts,
      tabhrebuts,
      tabcaja,
      tabhcaja,
      tabcajalin,
      tabhcajalin,
      tabdefastos,
      tabformatos,
      tabhoras,
      tabobshoras,
      tabseleccion,
      tabobser,
      tabficherosbanco,
      tabparamlis,
      tabtarnomge,
      tabtarifnom,
      tabtarnomva,
      tabfacnom,
      tabauxcab,
      tabauxdet,
      tabauxrel,
      tabauxproc,
      tabauxval,
      tabplantillas,
      tabcitas,
      tabtipocitas,
      tabusuarioscitas,
      tabubicacitas,
      tabconversion,
      tabasientos,
      tabpcuentas,
      tabivacabecera,
      tabivalineas      
      };
    setTables(array);
    FieldDef tabservicioArrayf1[] = { tabservicio.serasesor,tabservicio.serarea };
    ForeignKey tabservicioArrayfk[] = { 
      new ForeignKey(tabareaservicio,tabservicioArrayf1)      
      };
    tabservicio.setForeignKeys(tabservicioArrayfk);
    FieldDef tabauxfielddefArrayf1[] = { tabauxfielddef.auxhoja };
    ForeignKey tabauxfielddefArrayfk[] = { 
      new ForeignKey(tabauxhojas,tabauxfielddefArrayf1)      
      };
    tabauxfielddef.setForeignKeys(tabauxfielddefArrayfk);
    FieldDef tabauxclientesArrayf1[] = { tabauxclientes.auxcodicli };
    ForeignKey tabauxclientesArrayfk[] = { 
      new ForeignKey(tabclientes,tabauxclientesArrayf1)      
      };
    tabauxclientes.setForeignKeys(tabauxclientesArrayfk);
    FieldDef tabauxexpeArrayf1[] = { tabauxexpe.auxcodiexpe };
    ForeignKey tabauxexpeArrayfk[] = { 
      new ForeignKey(tabexpe,tabauxexpeArrayf1)      
      };
    tabauxexpe.setForeignKeys(tabauxexpeArrayfk);
    FieldDef tabfacturaArrayf1[] = { tabfactura.frasesor,tabfactura.frcolectivo,tabfactura.frcliente };
    ForeignKey tabfacturaArrayfk[] = { 
      new ForeignKey(tabclientes,tabfacturaArrayf1)      
      };
    tabfactura.setForeignKeys(tabfacturaArrayfk);
    FieldDef tababonodetArrayf1[] = { tababonodet.aboasesor,tababonodet.abocolectivo,tababonodet.abocliente };
    ForeignKey tababonodetArrayfk[] = { 
      new ForeignKey(tabclientes,tababonodetArrayf1)      
      };
    tababonodet.setForeignKeys(tababonodetArrayfk);
    FieldDef tabobserArrayf1[] = { tabobser.obsasesor,tabobser.obscolectivo,tabobser.obscliente };
    ForeignKey tabobserArrayfk[] = { 
      new ForeignKey(tabclientes,tabobserArrayf1)      
      };
    tabobser.setForeignKeys(tabobserArrayfk);
    }
  }
  
