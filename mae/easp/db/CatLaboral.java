// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090127
// Hora:             09:45:43
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
public class CatLaboral extends Catalog
  {
  // Tablas
  public TabGycauto tabgycauto;
  public TabValoresnom tabvaloresnom;
  public TabInem tabinem;
  public TabServicios tabservicios;
  public TabTc1desc tabtc1desc;
  public TabDefredcab tabdefredcab;
  public TabDefredseg tabdefredseg;
  public TabDefredcon tabdefredcon;
  public TabIrpfpv tabirpfpv;
  public TabIrpftc tabirpftc;
  public TabIrpftcescala tabirpftcescala;
  public TabIrpfclaves tabirpfclaves;
  public TabSsjublagunas tabssjublagunas;
  public TabSsjubreg tabssjubreg;
  public TabSsjubanys tabssjubanys;
  public TabSsjubbonif tabssjubbonif;
  public TabSsjubcoef tabssjubcoef;
  public TabSsjubparam tabssjubparam;
  public TabSsembargo tabssembargo;
  public TabSsregimen tabssregimen;
  public TabSscuotas tabsscuotas;
  public TabSsbases tabssbases;
  public TabSsdiasit tabssdiasit;
  public TabSsparametros tabssparametros;
  public TabSsexclusion tabssexclusion;
  public TabSsepigrafes tabssepigrafes;
  public TabSsipc tabssipc;
  public TabMutuas tabmutuas;
  public TabSsbonif tabssbonif;
  public TabSsbontram tabssbontram;
  public TabSsartistas tabssartistas;
  public TabContratos tabcontratos;
  public TabConclaves tabconclaves;
  public TabConbonif tabconbonif;
  public TabConcepto tabconcepto;
  public TabConfactor tabconfactor;
  public TabConfacrel tabconfacrel;
  public TabProcesos tabprocesos;
  public TabEnlaces tabenlaces;
  public TabConvenio tabconvenio;
  public TabCategoria tabcategoria;
  public TabAntiguedad tabantiguedad;
  public TabTramsantig tabtramsantig;
  public TabPagas tabpagas;
  public TabConpagas tabconpagas;
  public TabGarantias tabgarantias;
  public TabTramgarantia tabtramgarantia;
  public TabVacaciones tabvacaciones;
  public TabEmpresa tabempresa;
  public TabEmpservicios tabempservicios;
  public TabEmpclausulas tabempclausulas;
  public TabCentros tabcentros;
  public TabCentrosfor tabcentrosfor;
  public TabCentrosvar tabcentrosvar;
  public TabCentrosexc tabcentrosexc;
  public TabCendpto tabcendpto;
  public TabCendbancos tabcendbancos;
  public TabEstado tabestado;
  public TabTrabajador tabtrabajador;
  public TabTracontrato tabtracontrato;
  public TabTraconclaus tabtraconclaus;
  public TabTrairpf tabtrairpf;
  public TabTraunifam tabtraunifam;
  public TabTraembargo tabtraembargo;
  public TabTraembhistor tabtraembhistor;
  public TabTrabonif tabtrabonif;
  public TabTraparte tabtraparte;
  public TabCalendario tabcalendario;
  public TabCalendariodet tabcalendariodet;
  public TabIncidencias tabincidencias;
  public TabIncvariable tabincvariable;
  public TabFiniquito tabfiniquito;
  public TabHisretri tabhisretri;
  public TabHisdeduc tabhisdeduc;
  public TabHiscostes tabhiscostes;
  public TabHisbonif tabhisbonif;
  public TabHisinciden tabhisinciden;
  public TabHisperso tabhisperso;
  public TabHiscontrol tabhiscontrol;
  public TabSeleccion tabseleccion;
  public TabSimulacion tabsimulacion;
  public TabRedarchivos tabredarchivos;
  public TabRedtemporal tabredtemporal;
  public TabTracalirpf tabtracalirpf;
  public TabTrairpfdet tabtrairpfdet;
  public TabTrairpfcon tabtrairpfcon;
  public TabTrairpfvant tabtrairpfvant;
  public TabTrairpfrel tabtrairpfrel;
  public TabCnvglobal tabcnvglobal;
  public TabCnvdetalle tabcnvdetalle;
  public TabCnverrores tabcnverrores;
  public TabParamred tabparamred;
  public TabMsgestado tabmsgestado;
  public TabSegmento tabsegmento;
  public TabMsgestadodet tabmsgestadodet;
  public TabTc1cab tabtc1cab;
  public TabTc1det tabtc1det;
  public TabTc2 tabtc2;
  public TabTc2abrev tabtc2abrev;
  public TabMsgfdi tabmsgfdi;
  public TabMsgafi tabmsgafi;
  public TabConversion tabconversion;
  public TabCnvtest tabcnvtest;
  public TabCnvtestdet tabcnvtestdet;
  public TabCnvtc1cab tabcnvtc1cab;
  public TabCnvtc1det tabcnvtc1det;
  public TabDefdircab tabdefdircab;
  public TabDefdircol tabdefdircol;
  public TabDefdircon tabdefdircon;
  public TabValoresdir tabvaloresdir;
  public TabBds tabbds;
  public TabQuefrase tabquefrase;
  public TabQuevariables tabquevariables;
  public TabQuetabla tabquetabla;
  public TabQuecolumn tabquecolumn;
  public TabTc18 tabtc18;
  public TabTc119 tabtc119;
  public TabTc13 tabtc13;
  public TabTc16desc tabtc16desc;
  public TabTc16cab tabtc16cab;
  public TabTc16det tabtc16det;
  public TabCambiocodigo tabcambiocodigo;
  public TabTracontrata tabtracontrata;
  public TabConvproc tabconvproc;
  public TabDefctocab tabdefctocab;
  public TabDefctodet tabdefctodet;
  public TabDefctoblock tabdefctoblock;
  public TabPartes tabpartes;
  public TabTextosreb tabtextosreb;
  public TabHistextos tabhistextos;
  public TabSscnae tabsscnae;
  public TabSscnaedet tabsscnaedet;
  public TabSscnae09 tabsscnae09;
  public TabCnaeequival tabcnaeequival;
  public TabXisretri tabxisretri;
  public TabXisdeduc tabxisdeduc;
  public TabXiscostes tabxiscostes;
  public TabXisbonif tabxisbonif;
  public TabXisinciden tabxisinciden;
  public TabXisperso tabxisperso;
  public TabXiscontrol tabxiscontrol;
  public TabHisprorratas tabhisprorratas;
  public TabXisprorratas tabxisprorratas;
  public TabUserseportem tabuserseportem;
  public TabParamscal tabparamscal;
  public TabDefctacab tabdefctacab;
  public TabDefctadet tabdefctadet;
  public TabDefctacon tabdefctacon;
  public TabTareasemp tabtareasemp;
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
    
  public class TabValoresnom extends TableDef
    {
    // Campos
    public FieldDef vaapl;
    public FieldDef vacampo;
    public FieldDef vacodigo;
    public FieldDef vadesc;
    public FieldDef vaorden;
    public FieldDef vavalornum;
    public FieldDef vavaloralfa;
    public TabValoresnom(String name)
      {
      super(name);
      vaapl = new FieldDef("vaapl",FieldDef.CHAR,8,FieldDef.NOTNULL);
      vacampo = new FieldDef("vacampo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      vacodigo = new FieldDef("vacodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      vadesc = new FieldDef("vadesc",FieldDef.CHAR,200);
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
    
  public class TabInem extends TableDef
    {
    // Campos
    public FieldDef inemcodi;
    public FieldDef inemnom;
    public TabInem(String name)
      {
      super(name);
      inemcodi = new FieldDef("inemcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      inemnom = new FieldDef("inemnom",FieldDef.CHAR,40);
      FieldDef array[] = {
        inemcodi,
        inemnom        
        };
      setColumns(array);
      FieldDef arrayf[] = {inemcodi };
      setPrimaryKeys(arrayf);
      inemcodi.setDescription("Codigo Delegacion Inem");
      inemnom.setDescription("NOmbre Delegacion Inem");
      }
    }
    
  public class TabServicios extends TableDef
    {
    // Campos
    public FieldDef sercodi;
    public FieldDef serdescrip;
    public TabServicios(String name)
      {
      super(name);
      sercodi = new FieldDef("sercodi",FieldDef.CHAR,5,FieldDef.NOTNULL);
      serdescrip = new FieldDef("serdescrip",FieldDef.CHAR,40);
      FieldDef array[] = {
        sercodi,
        serdescrip        
        };
      setColumns(array);
      FieldDef arrayf[] = {sercodi };
      setPrimaryKeys(arrayf);
      sercodi.setDescription("Codigo Servicios");
      serdescrip.setDescription("Descripcion Servicios");
      }
    }
    
  public class TabTc1desc extends TableDef
    {
    // Campos
    public FieldDef tdecodigo;
    public FieldDef tdecasilla;
    public FieldDef tdedescrip;
    public TabTc1desc(String name)
      {
      super(name);
      tdecodigo = new FieldDef("tdecodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tdecasilla = new FieldDef("tdecasilla",FieldDef.CHAR,4);
      tdedescrip = new FieldDef("tdedescrip",FieldDef.CHAR,60);
      FieldDef array[] = {
        tdecodigo,
        tdecasilla,
        tdedescrip        
        };
      setColumns(array);
      FieldDef arrayf[] = {tdecodigo };
      setPrimaryKeys(arrayf);
      tdecodigo.setDescription("Codigo Linea TC1");
      tdecasilla.setDescription("Numero De Casilla TC1");
      tdedescrip.setDescription("Descripcion Casilla TC1");
      }
    }
    
  public class TabDefredcab extends TableDef
    {
    // Campos
    public FieldDef drctipomsg;
    public FieldDef drcregimen;
    public FieldDef drcsegmento;
    public FieldDef drcdescri;
    public FieldDef drcobligatorio;
    public FieldDef drclongitud;
    public TabDefredcab(String name)
      {
      super(name);
      drctipomsg = new FieldDef("drctipomsg",FieldDef.CHAR,3,FieldDef.NOTNULL);
      drcregimen = new FieldDef("drcregimen",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      drcsegmento = new FieldDef("drcsegmento",FieldDef.CHAR,5,FieldDef.NOTNULL);
      drcdescri = new FieldDef("drcdescri",FieldDef.CHAR,40);
      drcobligatorio = new FieldDef("drcobligatorio",FieldDef.CHAR,1);
      drclongitud = new FieldDef("drclongitud",FieldDef.INTEGER,0);
      FieldDef array[] = {
        drctipomsg,
        drcregimen,
        drcsegmento,
        drcdescri,
        drcobligatorio,
        drclongitud        
        };
      setColumns(array);
      FieldDef arrayf[] = {drctipomsg,drcregimen,drcsegmento };
      setPrimaryKeys(arrayf);
      drctipomsg.setDescription("Tipo de mensaje");
      drcregimen.setDescription("Régimen de la Seguridad Social");
      drcsegmento.setDescription("Codigo del segmento (EMP, RZS, CER, EXC,TRA...etc..)");
      drcdescri.setDescription("Descripcion del Segmento");
      drcobligatorio.setDescription("Indica si el segmento es obligatorio en la composicion del fichero FAN");
      drclongitud.setDescription("Longitud del segmento");
      }
    }
    
  public class TabDefredseg extends TableDef
    {
    // Campos
    public FieldDef drstipomsg;
    public FieldDef drsregimen;
    public FieldDef drssegmento;
    public FieldDef drsreferencia;
    public FieldDef drsrefagrup;
    public FieldDef drsdescripcion;
    public FieldDef drsposicion;
    public FieldDef drsformato;
    public FieldDef drslongitud;
    public FieldDef drsobligatorio;
    public FieldDef drslitcampo;
    public FieldDef drsvalorlit;
    public FieldDef drstabla;
    public FieldDef drscampo;
    public FieldDef drstablaval;
    public TabDefredseg(String name)
      {
      super(name);
      drstipomsg = new FieldDef("drstipomsg",FieldDef.CHAR,3,FieldDef.NOTNULL);
      drsregimen = new FieldDef("drsregimen",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      drssegmento = new FieldDef("drssegmento",FieldDef.CHAR,5,FieldDef.NOTNULL);
      drsreferencia = new FieldDef("drsreferencia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      drsrefagrup = new FieldDef("drsrefagrup",FieldDef.INTEGER,0);
      drsdescripcion = new FieldDef("drsdescripcion",FieldDef.CHAR,40);
      drsposicion = new FieldDef("drsposicion",FieldDef.INTEGER,0);
      drsformato = new FieldDef("drsformato",FieldDef.CHAR,3);
      drslongitud = new FieldDef("drslongitud",FieldDef.INTEGER,0);
      drsobligatorio = new FieldDef("drsobligatorio",FieldDef.CHAR,1);
      drslitcampo = new FieldDef("drslitcampo",FieldDef.CHAR,1);
      drsvalorlit = new FieldDef("drsvalorlit",FieldDef.CHAR,30);
      drstabla = new FieldDef("drstabla",FieldDef.CHAR,15);
      drscampo = new FieldDef("drscampo",FieldDef.CHAR,15);
      drstablaval = new FieldDef("drstablaval",FieldDef.CHAR,5);
      FieldDef array[] = {
        drstipomsg,
        drsregimen,
        drssegmento,
        drsreferencia,
        drsrefagrup,
        drsdescripcion,
        drsposicion,
        drsformato,
        drslongitud,
        drsobligatorio,
        drslitcampo,
        drsvalorlit,
        drstabla,
        drscampo,
        drstablaval        
        };
      setColumns(array);
      FieldDef arrayf[] = {drstipomsg,drsregimen,drssegmento,drsreferencia };
      setPrimaryKeys(arrayf);
      drstipomsg.setDescription("Tipo de Mensaje");
      drsregimen.setDescription("Regimen de la Seguridad Social");
      drssegmento.setDescription("Codigo del segmento al que pertenece el  campo");
      drsreferencia.setDescription("Referencia de la posicion del campo en el segmento");
      drsrefagrup.setDescription("Referencias agrupadas que forman otra referencia");
      drsdescripcion.setDescription("Descripcion del campo");
      drsposicion.setDescription("Posicion del campo dentro del dise¤o del segmento");
      drsformato.setDescription("Formato del campo (a, an, n )");
      drslongitud.setDescription("Longitud del campo");
      drsobligatorio.setDescription("Indicar si el campo es obligatorio");
      drslitcampo.setDescription("Indica si el campo es Literal");
      drsvalorlit.setDescription("Indica el valor del Literal");
      drstabla.setDescription("Nombre del archivo");
      drscampo.setDescription("Nombre del campo");
      drstablaval.setDescription("Tabla Velores");
      }
    }
    
  public class TabDefredcon extends TableDef
    {
    // Campos
    public FieldDef drotipomsg;
    public FieldDef droregimen;
    public FieldDef drogrupored;
    public FieldDef drosegmento;
    public FieldDef dronumero;
    public FieldDef drogroorden;
    public FieldDef droelemento;
    public FieldDef droclave;
    public FieldDef drotabla;
    public FieldDef drodesdecon;
    public FieldDef drohastacon;
    public FieldDef drobasecuota;
    public FieldDef drodias;
    public FieldDef drobase;
    public FieldDef drofactabla;
    public FieldDef drofaccampo;
    public FieldDef drocuota;
    public FieldDef drotc1det;
    public FieldDef drotc1b;
    public FieldDef drotc1c;
    public FieldDef drotc1p;
    public FieldDef drotipinciden;
    public TabDefredcon(String name)
      {
      super(name);
      drotipomsg = new FieldDef("drotipomsg",FieldDef.CHAR,3,FieldDef.NOTNULL);
      droregimen = new FieldDef("droregimen",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      drogrupored = new FieldDef("drogrupored",FieldDef.CHAR,15,FieldDef.NOTNULL);
      drosegmento = new FieldDef("drosegmento",FieldDef.CHAR,5,FieldDef.NOTNULL);
      dronumero = new FieldDef("dronumero",FieldDef.INTEGER,0);
      drogroorden = new FieldDef("drogroorden",FieldDef.INTEGER,0);
      droelemento = new FieldDef("droelemento",FieldDef.CHAR,5);
      droclave = new FieldDef("droclave",FieldDef.CHAR,5);
      drotabla = new FieldDef("drotabla",FieldDef.CHAR,1);
      drodesdecon = new FieldDef("drodesdecon",FieldDef.INTEGER,0);
      drohastacon = new FieldDef("drohastacon",FieldDef.INTEGER,0);
      drobasecuota = new FieldDef("drobasecuota",FieldDef.CHAR,1);
      drodias = new FieldDef("drodias",FieldDef.CHAR,1);
      drobase = new FieldDef("drobase",FieldDef.CHAR,100);
      drofactabla = new FieldDef("drofactabla",FieldDef.CHAR,15);
      drofaccampo = new FieldDef("drofaccampo",FieldDef.CHAR,15);
      drocuota = new FieldDef("drocuota",FieldDef.CHAR,100);
      drotc1det = new FieldDef("drotc1det",FieldDef.INTEGER,0);
      drotc1b = new FieldDef("drotc1b",FieldDef.CHAR,1);
      drotc1c = new FieldDef("drotc1c",FieldDef.CHAR,1);
      drotc1p = new FieldDef("drotc1p",FieldDef.CHAR,1);
      drotipinciden = new FieldDef("drotipinciden",FieldDef.CHAR,100);
      FieldDef array[] = {
        drotipomsg,
        droregimen,
        drogrupored,
        drosegmento,
        dronumero,
        drogroorden,
        droelemento,
        droclave,
        drotabla,
        drodesdecon,
        drohastacon,
        drobasecuota,
        drodias,
        drobase,
        drofactabla,
        drofaccampo,
        drocuota,
        drotc1det,
        drotc1b,
        drotc1c,
        drotc1p,
        drotipinciden        
        };
      setColumns(array);
      FieldDef arrayf[] = {drotipomsg,droregimen,drogrupored,drosegmento,dronumero };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabIrpfpv extends TableDef
    {
    // Campos
    public FieldDef ipvdiputacion;
    public FieldDef ipvejercicio;
    public FieldDef ipvperiodo;
    public FieldDef ipvdesderet;
    public FieldDef ipvhastaret;
    public FieldDef ipvhijos0;
    public FieldDef ipvhijos1;
    public FieldDef ipvhijos2;
    public FieldDef ipvhijos3;
    public FieldDef ipvhijos4;
    public FieldDef ipvhijos5;
    public FieldDef ipvhijosresto;
    public TabIrpfpv(String name)
      {
      super(name);
      ipvdiputacion = new FieldDef("ipvdiputacion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ipvejercicio = new FieldDef("ipvejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ipvperiodo = new FieldDef("ipvperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ipvdesderet = new FieldDef("ipvdesderet",FieldDef.FLOAT,6,0);
      ipvhastaret = new FieldDef("ipvhastaret",FieldDef.FLOAT,6,0);
      ipvhijos0 = new FieldDef("ipvhijos0",FieldDef.FLOAT,6,0);
      ipvhijos1 = new FieldDef("ipvhijos1",FieldDef.FLOAT,6,0);
      ipvhijos2 = new FieldDef("ipvhijos2",FieldDef.FLOAT,6,0);
      ipvhijos3 = new FieldDef("ipvhijos3",FieldDef.FLOAT,6,0);
      ipvhijos4 = new FieldDef("ipvhijos4",FieldDef.FLOAT,6,0);
      ipvhijos5 = new FieldDef("ipvhijos5",FieldDef.FLOAT,6,0);
      ipvhijosresto = new FieldDef("ipvhijosresto",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ipvdiputacion,
        ipvejercicio,
        ipvperiodo,
        ipvdesderet,
        ipvhastaret,
        ipvhijos0,
        ipvhijos1,
        ipvhijos2,
        ipvhijos3,
        ipvhijos4,
        ipvhijos5,
        ipvhijosresto        
        };
      setColumns(array);
      FieldDef arrayf[] = {ipvdiputacion,ipvejercicio,ipvperiodo };
      setPrimaryKeys(arrayf);
      ipvdiputacion.setDescription("Diputacion");
      ipvejercicio.setDescription("Ejercicio de los parametros de irpf");
      ipvperiodo.setDescription("Periodo de los parametros de irpf");
      ipvdesderet.setDescription("Desde retribucion");
      ipvhastaret.setDescription("Hasta retribucion");
      ipvhijos0.setDescription("Con 0 hijos");
      ipvhijos1.setDescription("Con 1 hijo");
      ipvhijos2.setDescription("Con dos hijos");
      ipvhijos3.setDescription("Con tres hijos");
      ipvhijos4.setDescription("Con cuatro hijos");
      ipvhijos5.setDescription("Con cinco hijos");
      }
    }
    
  public class TabIrpftc extends TableDef
    {
    // Campos
    public FieldDef itcejercicio;
    public FieldDef itcperiodo;
    public FieldDef itccodi;
    public FieldDef itcbasert1;
    public FieldDef itcimprt1;
    public FieldDef itcbasert2;
    public FieldDef itcimprt2;
    public FieldDef itccoefred;
    public FieldDef itcminpergl;
    public FieldDef itccontmin3365;
    public FieldDef itccontmin65;
    public FieldDef itcprolonga;
    public FieldDef itcmovgeograf;
    public FieldDef itcedadcontasc;
    public FieldDef itcasistmas75;
    public FieldDef itccuidahijo;
    public FieldDef itcascdesmin33;
    public FieldDef itcascdesmas65;
    public FieldDef itcactivos33;
    public FieldDef itcactivos65;
    public FieldDef itcgastosasist;
    public FieldDef itchijo1;
    public FieldDef itchijo2;
    public FieldDef itchijo3;
    public FieldDef itchijo4;
    public FieldDef itcbrutminim;
    public FieldDef itcmaxcuota;
    public FieldDef itcsinconyu0;
    public FieldDef itcsinconyu1;
    public FieldDef itcsinconres;
    public FieldDef itcconcon0;
    public FieldDef itcconcon1;
    public FieldDef itcconconres;
    public FieldDef itcsoltero0;
    public FieldDef itcsoltero1;
    public FieldDef itcsoltero2;
    public FieldDef itcpensionis;
    public FieldDef itcirregu;
    public FieldDef itcatrasos;
    public FieldDef itcunany;
    public FieldDef itcespecies;
    public FieldDef itcprof;
    public FieldDef itcadminis;
    public FieldDef itccursos;
    public FieldDef itcespecials;
    public FieldDef itclimitdeduc;
    public FieldDef itclimconyuge;
    public FieldDef itcconredueda75;
    public FieldDef itcminomas2hij;
    public FieldDef itcsumacuota2;
    public FieldDef itcideducrdl;
    public FieldDef itclimitevivfin;
    public TabIrpftc(String name)
      {
      super(name);
      itcejercicio = new FieldDef("itcejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      itcperiodo = new FieldDef("itcperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      itccodi = new FieldDef("itccodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      itcbasert1 = new FieldDef("itcbasert1",FieldDef.FLOAT,6,0);
      itcimprt1 = new FieldDef("itcimprt1",FieldDef.FLOAT,6,0);
      itcbasert2 = new FieldDef("itcbasert2",FieldDef.FLOAT,6,0);
      itcimprt2 = new FieldDef("itcimprt2",FieldDef.FLOAT,6,0);
      itccoefred = new FieldDef("itccoefred",FieldDef.FLOAT,6,0);
      itcminpergl = new FieldDef("itcminpergl",FieldDef.FLOAT,6,0);
      itccontmin3365 = new FieldDef("itccontmin3365",FieldDef.FLOAT,6,0);
      itccontmin65 = new FieldDef("itccontmin65",FieldDef.FLOAT,6,0);
      itcprolonga = new FieldDef("itcprolonga",FieldDef.FLOAT,6,0);
      itcmovgeograf = new FieldDef("itcmovgeograf",FieldDef.FLOAT,6,0);
      itcedadcontasc = new FieldDef("itcedadcontasc",FieldDef.FLOAT,6,0);
      itcasistmas75 = new FieldDef("itcasistmas75",FieldDef.FLOAT,6,0);
      itccuidahijo = new FieldDef("itccuidahijo",FieldDef.FLOAT,6,0);
      itcascdesmin33 = new FieldDef("itcascdesmin33",FieldDef.FLOAT,6,0);
      itcascdesmas65 = new FieldDef("itcascdesmas65",FieldDef.FLOAT,6,0);
      itcactivos33 = new FieldDef("itcactivos33",FieldDef.FLOAT,6,0);
      itcactivos65 = new FieldDef("itcactivos65",FieldDef.FLOAT,6,0);
      itcgastosasist = new FieldDef("itcgastosasist",FieldDef.FLOAT,6,0);
      itchijo1 = new FieldDef("itchijo1",FieldDef.FLOAT,6,0);
      itchijo2 = new FieldDef("itchijo2",FieldDef.FLOAT,6,0);
      itchijo3 = new FieldDef("itchijo3",FieldDef.FLOAT,6,0);
      itchijo4 = new FieldDef("itchijo4",FieldDef.FLOAT,6,0);
      itcbrutminim = new FieldDef("itcbrutminim",FieldDef.FLOAT,6,0);
      itcmaxcuota = new FieldDef("itcmaxcuota",FieldDef.FLOAT,6,0);
      itcsinconyu0 = new FieldDef("itcsinconyu0",FieldDef.FLOAT,6,0);
      itcsinconyu1 = new FieldDef("itcsinconyu1",FieldDef.FLOAT,6,0);
      itcsinconres = new FieldDef("itcsinconres",FieldDef.FLOAT,6,0);
      itcconcon0 = new FieldDef("itcconcon0",FieldDef.FLOAT,6,0);
      itcconcon1 = new FieldDef("itcconcon1",FieldDef.FLOAT,6,0);
      itcconconres = new FieldDef("itcconconres",FieldDef.FLOAT,6,0);
      itcsoltero0 = new FieldDef("itcsoltero0",FieldDef.FLOAT,6,0);
      itcsoltero1 = new FieldDef("itcsoltero1",FieldDef.FLOAT,6,0);
      itcsoltero2 = new FieldDef("itcsoltero2",FieldDef.FLOAT,6,0);
      itcpensionis = new FieldDef("itcpensionis",FieldDef.FLOAT,6,0);
      itcirregu = new FieldDef("itcirregu",FieldDef.FLOAT,6,0);
      itcatrasos = new FieldDef("itcatrasos",FieldDef.FLOAT,6,0);
      itcunany = new FieldDef("itcunany",FieldDef.FLOAT,6,0);
      itcespecies = new FieldDef("itcespecies",FieldDef.FLOAT,6,0);
      itcprof = new FieldDef("itcprof",FieldDef.FLOAT,6,0);
      itcadminis = new FieldDef("itcadminis",FieldDef.FLOAT,6,0);
      itccursos = new FieldDef("itccursos",FieldDef.FLOAT,6,0);
      itcespecials = new FieldDef("itcespecials",FieldDef.FLOAT,6,0);
      itclimitdeduc = new FieldDef("itclimitdeduc",FieldDef.FLOAT,6,0);
      itclimconyuge = new FieldDef("itclimconyuge",FieldDef.FLOAT,6,0);
      itcconredueda75 = new FieldDef("itcconredueda75",FieldDef.FLOAT,6,0);
      itcminomas2hij = new FieldDef("itcminomas2hij",FieldDef.FLOAT,6,0);
      itcsumacuota2 = new FieldDef("itcsumacuota2",FieldDef.FLOAT,6,0);
      itcideducrdl = new FieldDef("itcideducrdl",FieldDef.FLOAT,6,0);
      itclimitevivfin = new FieldDef("itclimitevivfin",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        itcejercicio,
        itcperiodo,
        itccodi,
        itcbasert1,
        itcimprt1,
        itcbasert2,
        itcimprt2,
        itccoefred,
        itcminpergl,
        itccontmin3365,
        itccontmin65,
        itcprolonga,
        itcmovgeograf,
        itcedadcontasc,
        itcasistmas75,
        itccuidahijo,
        itcascdesmin33,
        itcascdesmas65,
        itcactivos33,
        itcactivos65,
        itcgastosasist,
        itchijo1,
        itchijo2,
        itchijo3,
        itchijo4,
        itcbrutminim,
        itcmaxcuota,
        itcsinconyu0,
        itcsinconyu1,
        itcsinconres,
        itcconcon0,
        itcconcon1,
        itcconconres,
        itcsoltero0,
        itcsoltero1,
        itcsoltero2,
        itcpensionis,
        itcirregu,
        itcatrasos,
        itcunany,
        itcespecies,
        itcprof,
        itcadminis,
        itccursos,
        itcespecials,
        itclimitdeduc,
        itclimconyuge,
        itcconredueda75,
        itcminomas2hij,
        itcsumacuota2,
        itcideducrdl,
        itclimitevivfin        
        };
      setColumns(array);
      FieldDef arrayf[] = {itcejercicio,itcperiodo,itccodi };
      setPrimaryKeys(arrayf);
      itcejercicio.setDescription("Ejercicio en vigor");
      itcperiodo.setDescription("Periodo en vigor");
      itccodi.setDescription("codigo tabla irpf");
      itcbasert1.setDescription("Base reducciones del trabajo tramo1");
      itcimprt1.setDescription("Importe reduccion del tramo 1");
      itcbasert2.setDescription("Base reducciones del trabajo tramo2");
      itcimprt2.setDescription("Importe reduccion del tramo 2");
      itccoefred.setDescription("Coeficiente entre bases");
      itcminpergl.setDescription("Minimo personal general por contribuyente");
      itccontmin3365.setDescription("Contribuyente minusvalido entre 33 y 65");
      itccontmin65.setDescription("Contribuyente minusvalido superior a 65");
      itcprolonga.setDescription("Reduccion prolongacion actividad laboral");
      itcmovgeograf.setDescription("Reduccion movilidad geografica");
      itcedadcontasc.setDescription("Reduccion edad declarante y/o ascendentes");
      itcasistmas75.setDescription("Reduccion asistencia mayores de 75 años");
      itccuidahijo.setDescription("Reduccion cuidado hijos");
      itcascdesmin33.setDescription("Ascendiente y descendiente minusvalido entre 33 y 65");
      itcascdesmas65.setDescription("Ascendiente y descendiente minusvalido mas 65");
      itcactivos33.setDescription("Discapacidad de trabajadores activos 33");
      itcactivos65.setDescription("Discapacidad de trabajadores activos 65");
      itcgastosasist.setDescription("Gastos por asistencia a discapacitados");
      itchijo1.setDescription("Euros anuales por el primer hijo");
      itchijo2.setDescription("Euros anuales por el segundo hijo");
      itchijo3.setDescription("Euros anuales por el tercer hijo");
      itchijo4.setDescription("Euros anuales por el cuarto hijo y siguientes");
      itcbrutminim.setDescription("Limite bruto mínimo");
      itcmaxcuota.setDescription("Limite maximo de la cuota de retencion");
      itcsinconyu0.setDescription("Limite sin conyuge a cargo 0 hijos");
      itcsinconyu1.setDescription("Limite sin conyuge a cargo 1 hijo");
      itcsinconres.setDescription("Limite sin conyuge a cargo 2 o mas hijos");
      itcconcon0.setDescription("Limite con conyuge a cargo 0 hijos");
      itcconcon1.setDescription("Limite con conyuge a cargo 1 hijo");
      itcconconres.setDescription("Limite con conyuge a cargo 2 o mas hijos");
      itcsoltero0.setDescription("Limite soltero 0 hijos");
      itcsoltero1.setDescription("Limite soltero 1 hijo");
      itcsoltero2.setDescription("Limite soltero 2 o mas hijos");
      itcpensionis.setDescription("Limite aumentado or pensiones");
      itcirregu.setDescription("Reducciones trabajo personal rendimientos irregulares");
      itcatrasos.setDescription("% irpf atrasos");
      itcunany.setDescription("% irpf contrato inferior a un a¤o");
      itcespecies.setDescription("% irpf Retribuciones en especie");
      itcprof.setDescription("% irpf Profesionales");
      itcadminis.setDescription("% irpf administradores");
      itccursos.setDescription("% irpf cursos");
      itcespecials.setDescription("% irpf regimenes especiales");
      itclimitdeduc.setDescription("Limite para considerar que un descendiente es deducible");
      itcconredueda75.setDescription("Reduccion contribuyente por edad mayor de 75 años");
      itcminomas2hij.setDescription("Minoración contribuyentes con mas de 2 Descendientes");
      itcsumacuota2.setDescription("Importe a sumar a la cuota2");
      itcideducrdl.setDescription("Importe deduccion RDL 2/2008");
      itclimitevivfin.setDescription("Limite para reducción vivienda financiada.");
      }
    }
    
  public class TabIrpftcescala extends TableDef
    {
    // Campos
    public FieldDef itcesejercicio;
    public FieldDef itcesperiodo;
    public FieldDef itcescodi;
    public FieldDef itceshasta;
    public FieldDef itcescuota;
    public FieldDef itcesresto;
    public FieldDef itcetipo;
    public TabIrpftcescala(String name)
      {
      super(name);
      itcesejercicio = new FieldDef("itcesejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      itcesperiodo = new FieldDef("itcesperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      itcescodi = new FieldDef("itcescodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      itceshasta = new FieldDef("itceshasta",FieldDef.FLOAT,6,0);
      itcescuota = new FieldDef("itcescuota",FieldDef.FLOAT,6,0);
      itcesresto = new FieldDef("itcesresto",FieldDef.FLOAT,6,0);
      itcetipo = new FieldDef("itcetipo",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        itcesejercicio,
        itcesperiodo,
        itcescodi,
        itceshasta,
        itcescuota,
        itcesresto,
        itcetipo        
        };
      setColumns(array);
      FieldDef arrayf[] = {itcesejercicio,itcesperiodo,itcescodi,itceshasta };
      setPrimaryKeys(arrayf);
      itcesejercicio.setDescription("Ejercicio en vigor");
      itcesperiodo.setDescription("Periodo en vigor");
      itcescodi.setDescription("Codigo de la escala");
      itceshasta.setDescription("Tramo de retribucion");
      itcescuota.setDescription("Cuota fija aplicable al tramo de retribucion");
      itcesresto.setDescription("Resto de la  retribucion");
      }
    }
    
  public class TabIrpfclaves extends TableDef
    {
    // Campos
    public FieldDef iclcodigo;
    public FieldDef iclejercicio;
    public FieldDef iclperiodo;
    public FieldDef iclclave;
    public FieldDef iclsubclave;
    public FieldDef icldescripcion;
    public TabIrpfclaves(String name)
      {
      super(name);
      iclcodigo = new FieldDef("iclcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      iclejercicio = new FieldDef("iclejercicio",FieldDef.INTEGER,0);
      iclperiodo = new FieldDef("iclperiodo",FieldDef.INTEGER,0);
      iclclave = new FieldDef("iclclave",FieldDef.CHAR,2);
      iclsubclave = new FieldDef("iclsubclave",FieldDef.CHAR,5);
      icldescripcion = new FieldDef("icldescripcion",FieldDef.CHAR,50);
      FieldDef array[] = {
        iclcodigo,
        iclejercicio,
        iclperiodo,
        iclclave,
        iclsubclave,
        icldescripcion        
        };
      setColumns(array);
      FieldDef arrayf[] = {iclcodigo };
      setPrimaryKeys(arrayf);
      iclcodigo.setAutoIncrementable(true);
      iclejercicio.setDescription("Ejercicio");
      iclperiodo.setDescription("Periodo");
      iclclave.setDescription("Clave");
      iclsubclave.setDescription("Subclave");
      icldescripcion.setDescription("Descripcion Clave IRPF");
      }
    }
    
  public class TabSsjublagunas extends TableDef
    {
    // Campos
    public FieldDef ssjlejercicio;
    public FieldDef ssjlperiodo;
    public FieldDef ssjlbase;
    public TabSsjublagunas(String name)
      {
      super(name);
      ssjlejercicio = new FieldDef("ssjlejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssjlperiodo = new FieldDef("ssjlperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssjlbase = new FieldDef("ssjlbase",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ssjlejercicio,
        ssjlperiodo,
        ssjlbase        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssjlejercicio,ssjlperiodo };
      setPrimaryKeys(arrayf);
      ssjlejercicio.setDescription("Ejercicio");
      ssjlperiodo.setDescription("Periodo");
      }
    }
    
  public class TabSsjubreg extends TableDef
    {
    // Campos
    public FieldDef ssjbejercicio;
    public FieldDef ssjbtotalmes;
    public FieldDef ssjbmesesnom;
    public FieldDef ssjbmesesact;
    public FieldDef ssjbdivimes;
    public TabSsjubreg(String name)
      {
      super(name);
      ssjbejercicio = new FieldDef("ssjbejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssjbtotalmes = new FieldDef("ssjbtotalmes",FieldDef.INTEGER,0);
      ssjbmesesnom = new FieldDef("ssjbmesesnom",FieldDef.INTEGER,0);
      ssjbmesesact = new FieldDef("ssjbmesesact",FieldDef.INTEGER,0);
      ssjbdivimes = new FieldDef("ssjbdivimes",FieldDef.INTEGER,0);
      FieldDef array[] = {
        ssjbejercicio,
        ssjbtotalmes,
        ssjbmesesnom,
        ssjbmesesact,
        ssjbdivimes        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssjbejercicio };
      setPrimaryKeys(arrayf);
      ssjbejercicio.setDescription("Ejercicio");
      ssjbtotalmes.setDescription("Total de meses");
      ssjbmesesnom.setDescription("Meses nominales");
      ssjbmesesact.setDescription("Meses actualizados");
      }
    }
    
  public class TabSsjubanys extends TableDef
    {
    // Campos
    public FieldDef ssjaanys;
    public FieldDef ssjaporcen;
    public TabSsjubanys(String name)
      {
      super(name);
      ssjaanys = new FieldDef("ssjaanys",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssjaporcen = new FieldDef("ssjaporcen",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ssjaanys,
        ssjaporcen        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssjaanys };
      setPrimaryKeys(arrayf);
      ssjaanys.setDescription("Años");
      ssjaporcen.setDescription("Porcentaje");
      }
    }
    
  public class TabSsjubbonif extends TableDef
    {
    // Campos
    public FieldDef ssjfedad;
    public FieldDef ssjfanys;
    public FieldDef ssjfdiasbonif;
    public TabSsjubbonif(String name)
      {
      super(name);
      ssjfedad = new FieldDef("ssjfedad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssjfanys = new FieldDef("ssjfanys",FieldDef.INTEGER,0);
      ssjfdiasbonif = new FieldDef("ssjfdiasbonif",FieldDef.INTEGER,0);
      FieldDef array[] = {
        ssjfedad,
        ssjfanys,
        ssjfdiasbonif        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssjfedad };
      setPrimaryKeys(arrayf);
      ssjfedad.setDescription("Edad");
      ssjfanys.setDescription("Años");
      ssjfdiasbonif.setDescription("Dias Bonificacion");
      }
    }
    
  public class TabSsjubcoef extends TableDef
    {
    // Campos
    public FieldDef ssjcedad;
    public FieldDef ssjccoef;
    public TabSsjubcoef(String name)
      {
      super(name);
      ssjcedad = new FieldDef("ssjcedad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssjccoef = new FieldDef("ssjccoef",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ssjcedad,
        ssjccoef        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssjcedad };
      setPrimaryKeys(arrayf);
      ssjcedad.setDescription("Edad");
      ssjccoef.setDescription("Coeficiente");
      }
    }
    
  public class TabSsjubparam extends TableDef
    {
    // Campos
    public FieldDef ssjpejercicio;
    public FieldDef ssjptopemax;
    public FieldDef ssjpmin65conyu;
    public FieldDef ssjpmin65sincon;
    public FieldDef ssjpmin64conyu;
    public FieldDef ssjpmin64sincon;
    public FieldDef ssjpminimoanys;
    public FieldDef ssjpmaximoanys;
    public FieldDef ssjpedad;
    public TabSsjubparam(String name)
      {
      super(name);
      ssjpejercicio = new FieldDef("ssjpejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssjptopemax = new FieldDef("ssjptopemax",FieldDef.FLOAT,6,0);
      ssjpmin65conyu = new FieldDef("ssjpmin65conyu",FieldDef.FLOAT,6,0);
      ssjpmin65sincon = new FieldDef("ssjpmin65sincon",FieldDef.FLOAT,6,0);
      ssjpmin64conyu = new FieldDef("ssjpmin64conyu",FieldDef.FLOAT,6,0);
      ssjpmin64sincon = new FieldDef("ssjpmin64sincon",FieldDef.FLOAT,6,0);
      ssjpminimoanys = new FieldDef("ssjpminimoanys",FieldDef.INTEGER,0);
      ssjpmaximoanys = new FieldDef("ssjpmaximoanys",FieldDef.INTEGER,0);
      ssjpedad = new FieldDef("ssjpedad",FieldDef.INTEGER,0);
      FieldDef array[] = {
        ssjpejercicio,
        ssjptopemax,
        ssjpmin65conyu,
        ssjpmin65sincon,
        ssjpmin64conyu,
        ssjpmin64sincon,
        ssjpminimoanys,
        ssjpmaximoanys,
        ssjpedad        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssjpejercicio };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSsembargo extends TableDef
    {
    // Campos
    public FieldDef sseejercicio;
    public FieldDef sseperiodo;
    public FieldDef ssetramo;
    public FieldDef ssedesde;
    public FieldDef ssehasta;
    public FieldDef sseporcentaje;
    public TabSsembargo(String name)
      {
      super(name);
      sseejercicio = new FieldDef("sseejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sseperiodo = new FieldDef("sseperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssetramo = new FieldDef("ssetramo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssedesde = new FieldDef("ssedesde",FieldDef.FLOAT,6,0);
      ssehasta = new FieldDef("ssehasta",FieldDef.FLOAT,6,0);
      sseporcentaje = new FieldDef("sseporcentaje",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        sseejercicio,
        sseperiodo,
        ssetramo,
        ssedesde,
        ssehasta,
        sseporcentaje        
        };
      setColumns(array);
      FieldDef arrayf[] = {sseejercicio,sseperiodo,ssetramo };
      setPrimaryKeys(arrayf);
      sseejercicio.setDescription("Ejercicio");
      sseperiodo.setDescription("Periodo");
      ssetramo.setDescription("Numero de tramo");
      ssedesde.setDescription("Desde importe");
      ssehasta.setDescription("Hasta importe");
      sseporcentaje.setDescription("Porcentaje");
      }
    }
    
  public class TabSsregimen extends TableDef
    {
    // Campos
    public FieldDef ssregregimen;
    public FieldDef ssregejer;
    public FieldDef ssregper;
    public FieldDef ssregdescrip;
    public TabSsregimen(String name)
      {
      super(name);
      ssregregimen = new FieldDef("ssregregimen",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssregejer = new FieldDef("ssregejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssregper = new FieldDef("ssregper",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssregdescrip = new FieldDef("ssregdescrip",FieldDef.CHAR,50);
      FieldDef array[] = {
        ssregregimen,
        ssregejer,
        ssregper,
        ssregdescrip        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssregregimen,ssregejer,ssregper };
      setPrimaryKeys(arrayf);
      ssregregimen.setDescription("Codigo Regimen");
      ssregejer.setDescription("Ejercicio inicio vigencia");
      ssregper.setDescription("Periodo inicio vigencia");
      ssregdescrip.setDescription("Descripcion");
      }
    }
    
  public class TabSscuotas extends TableDef
    {
    // Campos
    public FieldDef sscuoregimen;
    public FieldDef sscuoejercicio;
    public FieldDef sscuoperiodo;
    public FieldDef sscuocodi;
    public FieldDef sscuodescri;
    public FieldDef sscuobccempr;
    public FieldDef sscuobcctrab;
    public FieldDef sscuohexfmempr;
    public FieldDef sscuohexfmtrab;
    public FieldDef sscuohexresemp;
    public FieldDef sscuohexrestra;
    public FieldDef sscuodesgenemp;
    public FieldDef sscuodesgentra;
    public FieldDef sscuodestcemp;
    public FieldDef sscuodestctra;
    public FieldDef sscuodestpem;
    public FieldDef sscuodestptra;
    public FieldDef sscuofogemp;
    public FieldDef sscuofogtra;
    public FieldDef sscuofpemp;
    public FieldDef sscuofptra;
    public FieldDef sscuofunemp;
    public FieldDef sscuofuntra;
    public FieldDef sscuomutnot;
    public FieldDef sscuo65emp;
    public FieldDef sscuo65tra;
    public FieldDef sscuosercoemp;
    public FieldDef sscuosercotra;
    public FieldDef sscuoflcmes;
    public FieldDef sscuoflcext;
    public FieldDef sscuoforit;
    public FieldDef sscuoforims;
    public FieldDef sscuoforpre;
    public FieldDef sscuofordis;
    public FieldDef sscuoforma;
    public FieldDef sscuo7diasemp;
    public FieldDef sscuo7diastra;
    public FieldDef sscuocodired;
    public FieldDef sscuoagrajena;
    public FieldDef sscuoexcluemp;
    public FieldDef sscuoexclutra;
    public TabSscuotas(String name)
      {
      super(name);
      sscuoregimen = new FieldDef("sscuoregimen",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sscuoejercicio = new FieldDef("sscuoejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sscuoperiodo = new FieldDef("sscuoperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sscuocodi = new FieldDef("sscuocodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sscuodescri = new FieldDef("sscuodescri",FieldDef.CHAR,40);
      sscuobccempr = new FieldDef("sscuobccempr",FieldDef.FLOAT,6,0);
      sscuobcctrab = new FieldDef("sscuobcctrab",FieldDef.FLOAT,6,0);
      sscuohexfmempr = new FieldDef("sscuohexfmempr",FieldDef.FLOAT,6,0);
      sscuohexfmtrab = new FieldDef("sscuohexfmtrab",FieldDef.FLOAT,6,0);
      sscuohexresemp = new FieldDef("sscuohexresemp",FieldDef.FLOAT,6,0);
      sscuohexrestra = new FieldDef("sscuohexrestra",FieldDef.FLOAT,6,0);
      sscuodesgenemp = new FieldDef("sscuodesgenemp",FieldDef.FLOAT,6,0);
      sscuodesgentra = new FieldDef("sscuodesgentra",FieldDef.FLOAT,6,0);
      sscuodestcemp = new FieldDef("sscuodestcemp",FieldDef.FLOAT,6,0);
      sscuodestctra = new FieldDef("sscuodestctra",FieldDef.FLOAT,6,0);
      sscuodestpem = new FieldDef("sscuodestpem",FieldDef.FLOAT,6,0);
      sscuodestptra = new FieldDef("sscuodestptra",FieldDef.FLOAT,6,0);
      sscuofogemp = new FieldDef("sscuofogemp",FieldDef.FLOAT,6,0);
      sscuofogtra = new FieldDef("sscuofogtra",FieldDef.FLOAT,6,0);
      sscuofpemp = new FieldDef("sscuofpemp",FieldDef.FLOAT,6,0);
      sscuofptra = new FieldDef("sscuofptra",FieldDef.FLOAT,6,0);
      sscuofunemp = new FieldDef("sscuofunemp",FieldDef.FLOAT,6,0);
      sscuofuntra = new FieldDef("sscuofuntra",FieldDef.FLOAT,6,0);
      sscuomutnot = new FieldDef("sscuomutnot",FieldDef.FLOAT,6,0);
      sscuo65emp = new FieldDef("sscuo65emp",FieldDef.FLOAT,6,0);
      sscuo65tra = new FieldDef("sscuo65tra",FieldDef.FLOAT,6,0);
      sscuosercoemp = new FieldDef("sscuosercoemp",FieldDef.FLOAT,6,0);
      sscuosercotra = new FieldDef("sscuosercotra",FieldDef.FLOAT,6,0);
      sscuoflcmes = new FieldDef("sscuoflcmes",FieldDef.FLOAT,6,0);
      sscuoflcext = new FieldDef("sscuoflcext",FieldDef.FLOAT,6,0);
      sscuoforit = new FieldDef("sscuoforit",FieldDef.FLOAT,6,0);
      sscuoforims = new FieldDef("sscuoforims",FieldDef.FLOAT,6,0);
      sscuoforpre = new FieldDef("sscuoforpre",FieldDef.FLOAT,6,0);
      sscuofordis = new FieldDef("sscuofordis",FieldDef.FLOAT,6,0);
      sscuoforma = new FieldDef("sscuoforma",FieldDef.CHAR,1);
      sscuo7diasemp = new FieldDef("sscuo7diasemp",FieldDef.FLOAT,6,0);
      sscuo7diastra = new FieldDef("sscuo7diastra",FieldDef.FLOAT,6,0);
      sscuocodired = new FieldDef("sscuocodired",FieldDef.INTEGER,0);
      sscuoagrajena = new FieldDef("sscuoagrajena",FieldDef.FLOAT,6,0);
      sscuoexcluemp = new FieldDef("sscuoexcluemp",FieldDef.FLOAT,6,0);
      sscuoexclutra = new FieldDef("sscuoexclutra",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        sscuoregimen,
        sscuoejercicio,
        sscuoperiodo,
        sscuocodi,
        sscuodescri,
        sscuobccempr,
        sscuobcctrab,
        sscuohexfmempr,
        sscuohexfmtrab,
        sscuohexresemp,
        sscuohexrestra,
        sscuodesgenemp,
        sscuodesgentra,
        sscuodestcemp,
        sscuodestctra,
        sscuodestpem,
        sscuodestptra,
        sscuofogemp,
        sscuofogtra,
        sscuofpemp,
        sscuofptra,
        sscuofunemp,
        sscuofuntra,
        sscuomutnot,
        sscuo65emp,
        sscuo65tra,
        sscuosercoemp,
        sscuosercotra,
        sscuoflcmes,
        sscuoflcext,
        sscuoforit,
        sscuoforims,
        sscuoforpre,
        sscuofordis,
        sscuoforma,
        sscuo7diasemp,
        sscuo7diastra,
        sscuocodired,
        sscuoagrajena,
        sscuoexcluemp,
        sscuoexclutra        
        };
      setColumns(array);
      FieldDef arrayf[] = {sscuoregimen,sscuoejercicio,sscuoperiodo,sscuocodi };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSsbases extends TableDef
    {
    // Campos
    public FieldDef ssbasregimen;
    public FieldDef ssbasejercicio;
    public FieldDef ssbasperiodo;
    public FieldDef ssbascodi;
    public FieldDef ssbastarifa;
    public FieldDef ssbasdescrip;
    public FieldDef ssbasbasemax;
    public FieldDef ssbasbasemin;
    public FieldDef ssbasmaxdia;
    public FieldDef ssbasmindia;
    public FieldDef ssbasminhora;
    public TabSsbases(String name)
      {
      super(name);
      ssbasregimen = new FieldDef("ssbasregimen",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssbasejercicio = new FieldDef("ssbasejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssbasperiodo = new FieldDef("ssbasperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssbascodi = new FieldDef("ssbascodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssbastarifa = new FieldDef("ssbastarifa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssbasdescrip = new FieldDef("ssbasdescrip",FieldDef.CHAR,40);
      ssbasbasemax = new FieldDef("ssbasbasemax",FieldDef.FLOAT,6,0);
      ssbasbasemin = new FieldDef("ssbasbasemin",FieldDef.FLOAT,6,0);
      ssbasmaxdia = new FieldDef("ssbasmaxdia",FieldDef.FLOAT,6,0);
      ssbasmindia = new FieldDef("ssbasmindia",FieldDef.FLOAT,6,0);
      ssbasminhora = new FieldDef("ssbasminhora",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ssbasregimen,
        ssbasejercicio,
        ssbasperiodo,
        ssbascodi,
        ssbastarifa,
        ssbasdescrip,
        ssbasbasemax,
        ssbasbasemin,
        ssbasmaxdia,
        ssbasmindia,
        ssbasminhora        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssbasregimen,ssbasejercicio,ssbasperiodo,ssbascodi,ssbastarifa };
      setPrimaryKeys(arrayf);
      ssbasregimen.setDescription("Regimen de la seguridad social");
      ssbasejercicio.setDescription("Ejercicio de vigencia");
      ssbasperiodo.setDescription("Mes entrada en vigor");
      ssbascodi.setDescription("Codigo del regimen");
      ssbastarifa.setDescription("Tarifa");
      ssbasdescrip.setDescription("Descripcion del grupo de tarifa");
      ssbasbasemax.setDescription("Base maxima cotizacion mensual");
      ssbasbasemin.setDescription("Base minima cotizacion mensual");
      ssbasmaxdia.setDescription("Base maxima diaria cotizacion");
      ssbasmindia.setDescription("Base minima diaria cotizacion");
      ssbasminhora.setDescription("Base minima Horas");
      }
    }
    
  public class TabSsdiasit extends TableDef
    {
    // Campos
    public FieldDef ssitregimen;
    public FieldDef ssitejercicio;
    public FieldDef ssitperiodo;
    public FieldDef ssitecpurga1;
    public FieldDef ssitecpurga2;
    public FieldDef ssitecporpurga;
    public FieldDef ssitecpurgass;
    public FieldDef ssitecdiasemp;
    public FieldDef ssitecporemp;
    public FieldDef ssitecdiaspdel1;
    public FieldDef ssitecporpdel1;
    public FieldDef ssitecdiaspdel2;
    public FieldDef ssitecporpdel2;
    public FieldDef ssiteclimpdel;
    public FieldDef ssitecdiascar;
    public FieldDef ssitapdias;
    public FieldDef ssitapporpdel;
    public FieldDef ssitapdiaspdel;
    public FieldDef ssitapdiascar;
    public FieldDef ssitaltames;
    public FieldDef ssititmensual;
    public TabSsdiasit(String name)
      {
      super(name);
      ssitregimen = new FieldDef("ssitregimen",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssitejercicio = new FieldDef("ssitejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssitperiodo = new FieldDef("ssitperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssitecpurga1 = new FieldDef("ssitecpurga1",FieldDef.INTEGER,0);
      ssitecpurga2 = new FieldDef("ssitecpurga2",FieldDef.INTEGER,0);
      ssitecporpurga = new FieldDef("ssitecporpurga",FieldDef.FLOAT,6,0);
      ssitecpurgass = new FieldDef("ssitecpurgass",FieldDef.INTEGER,0);
      ssitecdiasemp = new FieldDef("ssitecdiasemp",FieldDef.INTEGER,0);
      ssitecporemp = new FieldDef("ssitecporemp",FieldDef.FLOAT,6,0);
      ssitecdiaspdel1 = new FieldDef("ssitecdiaspdel1",FieldDef.INTEGER,0);
      ssitecporpdel1 = new FieldDef("ssitecporpdel1",FieldDef.FLOAT,6,0);
      ssitecdiaspdel2 = new FieldDef("ssitecdiaspdel2",FieldDef.INTEGER,0);
      ssitecporpdel2 = new FieldDef("ssitecporpdel2",FieldDef.FLOAT,6,0);
      ssiteclimpdel = new FieldDef("ssiteclimpdel",FieldDef.INTEGER,0);
      ssitecdiascar = new FieldDef("ssitecdiascar",FieldDef.INTEGER,0);
      ssitapdias = new FieldDef("ssitapdias",FieldDef.INTEGER,0);
      ssitapporpdel = new FieldDef("ssitapporpdel",FieldDef.FLOAT,6,0);
      ssitapdiaspdel = new FieldDef("ssitapdiaspdel",FieldDef.INTEGER,0);
      ssitapdiascar = new FieldDef("ssitapdiascar",FieldDef.INTEGER,0);
      ssitaltames = new FieldDef("ssitaltames",FieldDef.CHAR,1);
      ssititmensual = new FieldDef("ssititmensual",FieldDef.CHAR,1);
      FieldDef array[] = {
        ssitregimen,
        ssitejercicio,
        ssitperiodo,
        ssitecpurga1,
        ssitecpurga2,
        ssitecporpurga,
        ssitecpurgass,
        ssitecdiasemp,
        ssitecporemp,
        ssitecdiaspdel1,
        ssitecporpdel1,
        ssitecdiaspdel2,
        ssitecporpdel2,
        ssiteclimpdel,
        ssitecdiascar,
        ssitapdias,
        ssitapporpdel,
        ssitapdiaspdel,
        ssitapdiascar,
        ssitaltames,
        ssititmensual        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssitregimen,ssitejercicio,ssitperiodo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSsparametros extends TableDef
    {
    // Campos
    public FieldDef ssparegimen;
    public FieldDef sspaejercicio;
    public FieldDef sspaperiodo;
    public FieldDef sspatomaxcot;
    public FieldDef sspatomincot;
    public FieldDef sspatomaxdia;
    public FieldDef sspatomindia;
    public FieldDef sspatopehora;
    public FieldDef sspatsmi;
    public FieldDef sspatsmidia;
    public FieldDef sspatiprem;
    public TabSsparametros(String name)
      {
      super(name);
      ssparegimen = new FieldDef("ssparegimen",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sspaejercicio = new FieldDef("sspaejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sspaperiodo = new FieldDef("sspaperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sspatomaxcot = new FieldDef("sspatomaxcot",FieldDef.FLOAT,6,0);
      sspatomincot = new FieldDef("sspatomincot",FieldDef.FLOAT,6,0);
      sspatomaxdia = new FieldDef("sspatomaxdia",FieldDef.FLOAT,6,0);
      sspatomindia = new FieldDef("sspatomindia",FieldDef.FLOAT,6,0);
      sspatopehora = new FieldDef("sspatopehora",FieldDef.FLOAT,6,0);
      sspatsmi = new FieldDef("sspatsmi",FieldDef.FLOAT,6,0);
      sspatsmidia = new FieldDef("sspatsmidia",FieldDef.FLOAT,6,0);
      sspatiprem = new FieldDef("sspatiprem",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ssparegimen,
        sspaejercicio,
        sspaperiodo,
        sspatomaxcot,
        sspatomincot,
        sspatomaxdia,
        sspatomindia,
        sspatopehora,
        sspatsmi,
        sspatsmidia,
        sspatiprem        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssparegimen,sspaejercicio,sspaperiodo };
      setPrimaryKeys(arrayf);
      ssparegimen.setDescription("Regimen de la seguridad social");
      sspaejercicio.setDescription("Ejercicio en vigor");
      sspaperiodo.setDescription("Periodo entrada en vigor");
      sspatomaxcot.setDescription("Tope máximo de cotización");
      sspatomincot.setDescription("Tope mínimo de cotización");
      sspatomaxdia.setDescription("Tope máximo diario");
      sspatomindia.setDescription("Tope mínimo diario");
      sspatopehora.setDescription("Tope de cotización por hora");
      sspatsmi.setDescription("Smi mensual");
      sspatsmidia.setDescription("Smi diario");
      }
    }
    
  public class TabSsexclusion extends TableDef
    {
    // Campos
    public FieldDef ssexejercicio;
    public FieldDef ssexperiodo;
    public FieldDef ssexcodigo;
    public FieldDef ssexdescri;
    public FieldDef ssexirpfsmi;
    public FieldDef ssexirpfuni;
    public FieldDef ssexirpfimp;
    public FieldDef ssexirpftotal;
    public FieldDef ssexbccsmi;
    public FieldDef ssexbccuni;
    public FieldDef ssexbccimp;
    public FieldDef ssexbcctotal;
    public FieldDef ssexaccsmi;
    public FieldDef ssexaccuni;
    public FieldDef ssexaccimp;
    public FieldDef ssexacctotal;
    public TabSsexclusion(String name)
      {
      super(name);
      ssexejercicio = new FieldDef("ssexejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssexperiodo = new FieldDef("ssexperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssexcodigo = new FieldDef("ssexcodigo",FieldDef.INTEGER,0);
      ssexdescri = new FieldDef("ssexdescri",FieldDef.CHAR,200);
      ssexirpfsmi = new FieldDef("ssexirpfsmi",FieldDef.FLOAT,6,0);
      ssexirpfuni = new FieldDef("ssexirpfuni",FieldDef.INTEGER,0);
      ssexirpfimp = new FieldDef("ssexirpfimp",FieldDef.FLOAT,6,0);
      ssexirpftotal = new FieldDef("ssexirpftotal",FieldDef.FLOAT,6,0);
      ssexbccsmi = new FieldDef("ssexbccsmi",FieldDef.FLOAT,6,0);
      ssexbccuni = new FieldDef("ssexbccuni",FieldDef.INTEGER,0);
      ssexbccimp = new FieldDef("ssexbccimp",FieldDef.FLOAT,6,0);
      ssexbcctotal = new FieldDef("ssexbcctotal",FieldDef.FLOAT,6,0);
      ssexaccsmi = new FieldDef("ssexaccsmi",FieldDef.FLOAT,6,0);
      ssexaccuni = new FieldDef("ssexaccuni",FieldDef.INTEGER,0);
      ssexaccimp = new FieldDef("ssexaccimp",FieldDef.FLOAT,6,0);
      ssexacctotal = new FieldDef("ssexacctotal",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ssexejercicio,
        ssexperiodo,
        ssexcodigo,
        ssexdescri,
        ssexirpfsmi,
        ssexirpfuni,
        ssexirpfimp,
        ssexirpftotal,
        ssexbccsmi,
        ssexbccuni,
        ssexbccimp,
        ssexbcctotal,
        ssexaccsmi,
        ssexaccuni,
        ssexaccimp,
        ssexacctotal        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssexejercicio,ssexperiodo,ssexcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSsepigrafes extends TableDef
    {
    // Campos
    public FieldDef ssepepigrafe;
    public FieldDef ssepejercicio;
    public FieldDef ssepperiodo;
    public FieldDef ssepdescri;
    public FieldDef ssepdivision;
    public FieldDef ssepilt;
    public FieldDef ssepims;
    public FieldDef ssepimpresion;
    public TabSsepigrafes(String name)
      {
      super(name);
      ssepepigrafe = new FieldDef("ssepepigrafe",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssepejercicio = new FieldDef("ssepejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssepperiodo = new FieldDef("ssepperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssepdescri = new FieldDef("ssepdescri",FieldDef.CHAR,2000);
      ssepdivision = new FieldDef("ssepdivision",FieldDef.INTEGER,0);
      ssepilt = new FieldDef("ssepilt",FieldDef.FLOAT,6,0);
      ssepims = new FieldDef("ssepims",FieldDef.FLOAT,6,0);
      ssepimpresion = new FieldDef("ssepimpresion",FieldDef.INTEGER,0);
      FieldDef array[] = {
        ssepepigrafe,
        ssepejercicio,
        ssepperiodo,
        ssepdescri,
        ssepdivision,
        ssepilt,
        ssepims,
        ssepimpresion        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssepepigrafe,ssepejercicio,ssepperiodo };
      setPrimaryKeys(arrayf);
      ssepepigrafe.setDescription("Epigrafe");
      ssepejercicio.setDescription("Ejercicio");
      ssepperiodo.setDescription("Periodo");
      ssepdescri.setDescription("Descripcion del epigrafe");
      ssepdivision.setDescription("Division del epigrafe");
      ssepilt.setDescription("Porcentaje por ILT");
      ssepims.setDescription("Porcentaje por IMS");
      ssepimpresion.setDescription("Codigo Epigrafe Impresion");
      }
    }
    
  public class TabSsipc extends TableDef
    {
    // Campos
    public FieldDef ssipejercicio;
    public FieldDef ssipenero;
    public FieldDef ssipfebrero;
    public FieldDef ssipmarzo;
    public FieldDef ssipabril;
    public FieldDef ssipmayo;
    public FieldDef ssipjunio;
    public FieldDef ssipjulio;
    public FieldDef ssipagosto;
    public FieldDef ssipseptiembre;
    public FieldDef ssipoctubre;
    public FieldDef ssipnoviembre;
    public FieldDef ssipdiciembre;
    public TabSsipc(String name)
      {
      super(name);
      ssipejercicio = new FieldDef("ssipejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ssipenero = new FieldDef("ssipenero",FieldDef.FLOAT,6,0);
      ssipfebrero = new FieldDef("ssipfebrero",FieldDef.FLOAT,6,0);
      ssipmarzo = new FieldDef("ssipmarzo",FieldDef.FLOAT,6,0);
      ssipabril = new FieldDef("ssipabril",FieldDef.FLOAT,6,0);
      ssipmayo = new FieldDef("ssipmayo",FieldDef.FLOAT,6,0);
      ssipjunio = new FieldDef("ssipjunio",FieldDef.FLOAT,6,0);
      ssipjulio = new FieldDef("ssipjulio",FieldDef.FLOAT,6,0);
      ssipagosto = new FieldDef("ssipagosto",FieldDef.FLOAT,6,0);
      ssipseptiembre = new FieldDef("ssipseptiembre",FieldDef.FLOAT,6,0);
      ssipoctubre = new FieldDef("ssipoctubre",FieldDef.FLOAT,6,0);
      ssipnoviembre = new FieldDef("ssipnoviembre",FieldDef.FLOAT,6,0);
      ssipdiciembre = new FieldDef("ssipdiciembre",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ssipejercicio,
        ssipenero,
        ssipfebrero,
        ssipmarzo,
        ssipabril,
        ssipmayo,
        ssipjunio,
        ssipjulio,
        ssipagosto,
        ssipseptiembre,
        ssipoctubre,
        ssipnoviembre,
        ssipdiciembre        
        };
      setColumns(array);
      FieldDef arrayf[] = {ssipejercicio };
      setPrimaryKeys(arrayf);
      ssipejercicio.setDescription("Ejercicio");
      ssipenero.setDescription("Porcentaje IPC enero");
      ssipfebrero.setDescription("Porcentaje IPC febrero");
      ssipmarzo.setDescription("Porcentaje IPC Marzo");
      ssipabril.setDescription("Porcentaje IPC Abril");
      ssipmayo.setDescription("Porcentaje IPC Mayo");
      ssipjunio.setDescription("Porcentaje IPC unio");
      ssipjulio.setDescription("Porcentaje IPC Julio");
      ssipagosto.setDescription("Porcentaje IPC Agosto");
      ssipseptiembre.setDescription("Porcentaje IPC Septiembre");
      ssipoctubre.setDescription("Porcentaje IPC Octubre");
      ssipnoviembre.setDescription("Porcentaje IPC Noviembre");
      ssipdiciembre.setDescription("Porcentaje IPC Noviembre");
      }
    }
    
  public class TabMutuas extends TableDef
    {
    // Campos
    public FieldDef mutcodigo;
    public FieldDef mutdescripcion;
    public TabMutuas(String name)
      {
      super(name);
      mutcodigo = new FieldDef("mutcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mutdescripcion = new FieldDef("mutdescripcion",FieldDef.CHAR,50);
      FieldDef array[] = {
        mutcodigo,
        mutdescripcion        
        };
      setColumns(array);
      FieldDef arrayf[] = {mutcodigo };
      setPrimaryKeys(arrayf);
      mutcodigo.setDescription("Codigo Mutua Accidentes");
      mutdescripcion.setDescription("Nombre Mutua");
      }
    }
    
  public class TabSsbonif extends TableDef
    {
    // Campos
    public FieldDef boncodigo;
    public FieldDef bonbonif;
    public FieldDef bonejer;
    public FieldDef bonper;
    public FieldDef bontipo;
    public FieldDef bonvig;
    public FieldDef boncargo;
    public FieldDef bonrd;
    public FieldDef bondesc;
    public FieldDef bonmujeres;
    public FieldDef bonmesesdes;
    public FieldDef bondesdeedad;
    public FieldDef bonhastaedad;
    public FieldDef boncodiinem;
    public FieldDef boncolecdef;
    public FieldDef boncodifan;
    public FieldDef bontextil;
    public TabSsbonif(String name)
      {
      super(name);
      boncodigo = new FieldDef("boncodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bonbonif = new FieldDef("bonbonif",FieldDef.INTEGER,0);
      bonejer = new FieldDef("bonejer",FieldDef.INTEGER,0);
      bonper = new FieldDef("bonper",FieldDef.INTEGER,0);
      bontipo = new FieldDef("bontipo",FieldDef.CHAR,1);
      bonvig = new FieldDef("bonvig",FieldDef.CHAR,1);
      boncargo = new FieldDef("boncargo",FieldDef.CHAR,1);
      bonrd = new FieldDef("bonrd",FieldDef.CHAR,50);
      bondesc = new FieldDef("bondesc",FieldDef.CHAR,80);
      bonmujeres = new FieldDef("bonmujeres",FieldDef.CHAR,1);
      bonmesesdes = new FieldDef("bonmesesdes",FieldDef.INTEGER,0);
      bondesdeedad = new FieldDef("bondesdeedad",FieldDef.INTEGER,0);
      bonhastaedad = new FieldDef("bonhastaedad",FieldDef.INTEGER,0);
      boncodiinem = new FieldDef("boncodiinem",FieldDef.CHAR,10);
      boncolecdef = new FieldDef("boncolecdef",FieldDef.INTEGER,0);
      boncodifan = new FieldDef("boncodifan",FieldDef.INTEGER,0);
      bontextil = new FieldDef("bontextil",FieldDef.CHAR,1);
      FieldDef array[] = {
        boncodigo,
        bonbonif,
        bonejer,
        bonper,
        bontipo,
        bonvig,
        boncargo,
        bonrd,
        bondesc,
        bonmujeres,
        bonmesesdes,
        bondesdeedad,
        bonhastaedad,
        boncodiinem,
        boncolecdef,
        boncodifan,
        bontextil        
        };
      setColumns(array);
      FieldDef arrayf[] = {boncodigo };
      setPrimaryKeys(arrayf);
      boncodigo.setAutoIncrementable(true);
      bonbonif.setDescription("Codigo Bonificacion");
      bonejer.setDescription("Ejercicio Inicio Vigencia");
      bonper.setDescription("Periodo Inicio Vigencia");
      bontipo.setDescription("Tipo Bonificacion");
      bonvig.setDescription("Bonificacion Vigente");
      boncargo.setDescription("Bonificacion con cargo a");
      bonrd.setDescription("Real Decreto");
      bondesc.setDescription("Descripcion Bonificacion");
      bonmujeres.setDescription("Exclusiva de Mujeres");
      bonmesesdes.setDescription("Meses Desempleo necesarios");
      bondesdeedad.setDescription("Edad Minima");
      bonhastaedad.setDescription("Edad Maxima");
      boncodiinem.setDescription("Codigo Bonificacion Inem");
      boncolecdef.setDescription("Codigo de colectivo defecto");
      boncodifan.setDescription("Codigo de la bonificacion en el fichero FAN");
      bontextil.setDescription("Sector Textil");
      }
    }
    
  public class TabSsbontram extends TableDef
    {
    // Campos
    public FieldDef btbcodigo;
    public FieldDef bttram;
    public FieldDef btbccemp;
    public FieldDef btbcctra;
    public FieldDef btbaccemp;
    public FieldDef btbacctra;
    public FieldDef btdesemp;
    public FieldDef btdestra;
    public FieldDef btfpemp;
    public FieldDef btfptra;
    public FieldDef btfgsemp;
    public FieldDef btfgstra;
    public FieldDef btduracion;
    public FieldDef btimporte;
    public FieldDef btinforcomple;
    public TabSsbontram(String name)
      {
      super(name);
      btbcodigo = new FieldDef("btbcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bttram = new FieldDef("bttram",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      btbccemp = new FieldDef("btbccemp",FieldDef.FLOAT,6,0);
      btbcctra = new FieldDef("btbcctra",FieldDef.FLOAT,6,0);
      btbaccemp = new FieldDef("btbaccemp",FieldDef.FLOAT,6,0);
      btbacctra = new FieldDef("btbacctra",FieldDef.FLOAT,6,0);
      btdesemp = new FieldDef("btdesemp",FieldDef.FLOAT,6,0);
      btdestra = new FieldDef("btdestra",FieldDef.FLOAT,6,0);
      btfpemp = new FieldDef("btfpemp",FieldDef.FLOAT,6,0);
      btfptra = new FieldDef("btfptra",FieldDef.FLOAT,6,0);
      btfgsemp = new FieldDef("btfgsemp",FieldDef.FLOAT,6,0);
      btfgstra = new FieldDef("btfgstra",FieldDef.FLOAT,6,0);
      btduracion = new FieldDef("btduracion",FieldDef.INTEGER,0);
      btimporte = new FieldDef("btimporte",FieldDef.FLOAT,6,0);
      btinforcomple = new FieldDef("btinforcomple",FieldDef.CHAR,5);
      FieldDef array[] = {
        btbcodigo,
        bttram,
        btbccemp,
        btbcctra,
        btbaccemp,
        btbacctra,
        btdesemp,
        btdestra,
        btfpemp,
        btfptra,
        btfgsemp,
        btfgstra,
        btduracion,
        btimporte,
        btinforcomple        
        };
      setColumns(array);
      FieldDef arrayf[] = {btbcodigo,bttram };
      setPrimaryKeys(arrayf);
      btbcodigo.setDescription("Codigo de bonificacion");
      bttram.setDescription("Tramo de la bonificacion");
      btbccemp.setDescription("Contingencias comunes empresa");
      btbcctra.setDescription("Contingencias comunes trabajdor");
      btbaccemp.setDescription("Accidentes empresa");
      btbacctra.setDescription("Accidentes trabajador");
      btdesemp.setDescription("Desempleo empresa");
      btdestra.setDescription("Desempleo trabajador");
      btfpemp.setDescription("Formacion profesional empresa");
      btfptra.setDescription("Formacion profesional trabajador");
      btfgsemp.setDescription("Fogasa empresa");
      btfgstra.setDescription("Fogasa trabajador");
      btduracion.setDescription("Duracion");
      btimporte.setDescription("Importe anual bonificable");
      btinforcomple.setDescription("Informacion complementaria FAN");
      }
    }
    
  public class TabSsartistas extends TableDef
    {
    // Campos
    public FieldDef artejercicio;
    public FieldDef artperiodo;
    public FieldDef arttramo;
    public FieldDef artdesderetrib;
    public FieldDef arthastaretrib;
    public FieldDef artbasemaxima;
    public TabSsartistas(String name)
      {
      super(name);
      artejercicio = new FieldDef("artejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      artperiodo = new FieldDef("artperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      arttramo = new FieldDef("arttramo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      artdesderetrib = new FieldDef("artdesderetrib",FieldDef.FLOAT,6,0);
      arthastaretrib = new FieldDef("arthastaretrib",FieldDef.FLOAT,6,0);
      artbasemaxima = new FieldDef("artbasemaxima",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        artejercicio,
        artperiodo,
        arttramo,
        artdesderetrib,
        arthastaretrib,
        artbasemaxima        
        };
      setColumns(array);
      FieldDef arrayf[] = {artejercicio,artperiodo,arttramo };
      setPrimaryKeys(arrayf);
      artejercicio.setDescription("Ejercicio Inicio Vigencia");
      artperiodo.setDescription("Periodo Inicio Vigencia");
      arttramo.setDescription("Tramo");
      artdesderetrib.setDescription("Desde Retribucion");
      arthastaretrib.setDescription("Hasta Retribucion");
      artbasemaxima.setDescription("Base Maxima");
      }
    }
    
  public class TabContratos extends TableDef
    {
    // Campos
    public FieldDef conejer;
    public FieldDef conper;
    public FieldDef concodi;
    public FieldDef conaux;
    public FieldDef condesc;
    public FieldDef conrd;
    public FieldDef condata;
    public FieldDef convig;
    public FieldDef conindemniz;
    public FieldDef conmeses;
    public TabContratos(String name)
      {
      super(name);
      conejer = new FieldDef("conejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      conper = new FieldDef("conper",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      concodi = new FieldDef("concodi",FieldDef.CHAR,10,FieldDef.NOTNULL);
      conaux = new FieldDef("conaux",FieldDef.CHAR,10,FieldDef.NOTNULL);
      condesc = new FieldDef("condesc",FieldDef.CHAR,100);
      conrd = new FieldDef("conrd",FieldDef.CHAR,10);
      condata = new FieldDef("condata",FieldDef.DATE);
      convig = new FieldDef("convig",FieldDef.CHAR,1);
      conindemniz = new FieldDef("conindemniz",FieldDef.FLOAT,6,0);
      conmeses = new FieldDef("conmeses",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        conejer,
        conper,
        concodi,
        conaux,
        condesc,
        conrd,
        condata,
        convig,
        conindemniz,
        conmeses        
        };
      setColumns(array);
      FieldDef arrayf[] = {conejer,conper,concodi };
      setPrimaryKeys(arrayf);
      conejer.setDescription("Ejercicio");
      conper.setDescription("Periodo del contrato");
      concodi.setDescription("Codigo contrato");
      conaux.setDescription("Codigo de la plantilla word");
      condesc.setDescription("Descripcion del contrato");
      conrd.setDescription("Real decreto del contrato");
      condata.setDescription("Fecha contrato");
      convig.setDescription("Vigencia del contrato");
      conindemniz.setDescription("Dias indemnizacion por a¤o");
      conmeses.setDescription("Meses indemnizacion maximos");
      }
    }
    
  public class TabConclaves extends TableDef
    {
    // Campos
    public FieldDef cvcodigo;
    public FieldDef cvejer;
    public FieldDef cvper;
    public FieldDef cvplant;
    public FieldDef cvcodi;
    public FieldDef cvdesc;
    public FieldDef cvindef;
    public FieldDef cvtemp;
    public FieldDef cvtc;
    public FieldDef cvtp;
    public FieldDef cvfd;
    public FieldDef cvformacion;
    public FieldDef cvminusvalido;
    public TabConclaves(String name)
      {
      super(name);
      cvcodigo = new FieldDef("cvcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cvejer = new FieldDef("cvejer",FieldDef.INTEGER,0);
      cvper = new FieldDef("cvper",FieldDef.INTEGER,0);
      cvplant = new FieldDef("cvplant",FieldDef.CHAR,10);
      cvcodi = new FieldDef("cvcodi",FieldDef.INTEGER,0);
      cvdesc = new FieldDef("cvdesc",FieldDef.CHAR,50);
      cvindef = new FieldDef("cvindef",FieldDef.CHAR,1);
      cvtemp = new FieldDef("cvtemp",FieldDef.CHAR,1);
      cvtc = new FieldDef("cvtc",FieldDef.CHAR,1);
      cvtp = new FieldDef("cvtp",FieldDef.CHAR,1);
      cvfd = new FieldDef("cvfd",FieldDef.CHAR,1);
      cvformacion = new FieldDef("cvformacion",FieldDef.CHAR,1);
      cvminusvalido = new FieldDef("cvminusvalido",FieldDef.CHAR,1);
      FieldDef array[] = {
        cvcodigo,
        cvejer,
        cvper,
        cvplant,
        cvcodi,
        cvdesc,
        cvindef,
        cvtemp,
        cvtc,
        cvtp,
        cvfd,
        cvformacion,
        cvminusvalido        
        };
      setColumns(array);
      FieldDef arrayf[] = {cvcodigo };
      setPrimaryKeys(arrayf);
      cvcodigo.setAutoIncrementable(true);
      cvejer.setDescription("Ejercicio Inicio Vigencia");
      cvper.setDescription("Periodo Inicio Vigencia");
      cvplant.setDescription("Codigo Plantilla");
      cvcodi.setDescription("Codigo Contrato");
      cvdesc.setDescription("Descripcion");
      cvindef.setDescription("Contrato Indefinido");
      cvtemp.setDescription("Contrato Duracion determinada");
      cvtc.setDescription("Tiempo Completo");
      cvtp.setDescription("Tiempo Parcial");
      cvfd.setDescription("Fijo Discontinuo");
      cvformacion.setDescription("Contrato de Formacion");
      cvminusvalido.setDescription("Minusvalidos");
      }
    }
    
  public class TabConbonif extends TableDef
    {
    // Campos
    public FieldDef cbejer;
    public FieldDef cbper;
    public FieldDef cbplant;
    public FieldDef cbcodi;
    public FieldDef cbcodbonif;
    public TabConbonif(String name)
      {
      super(name);
      cbejer = new FieldDef("cbejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cbper = new FieldDef("cbper",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cbplant = new FieldDef("cbplant",FieldDef.CHAR,10,FieldDef.NOTNULL);
      cbcodi = new FieldDef("cbcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cbcodbonif = new FieldDef("cbcodbonif",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        cbejer,
        cbper,
        cbplant,
        cbcodi,
        cbcodbonif        
        };
      setColumns(array);
      FieldDef arrayf[] = {cbejer,cbper,cbplant,cbcodi,cbcodbonif };
      setPrimaryKeys(arrayf);
      cbejer.setDescription("Ejercicio vigencia bonificacion");
      cbper.setDescription("Periodo vigencia de la bonificacion");
      cbplant.setDescription("Codigo Plantilla relacionada");
      cbcodi.setDescription("Codigo contrato");
      cbcodbonif.setDescription("Codigo Bonificacion");
      }
    }
    
  public class TabConcepto extends TableDef
    {
    // Campos
    public FieldDef conconvemp;
    public FieldDef conconcepto;
    public FieldDef contipocon;
    public FieldDef condescrip;
    public FieldDef conrecibos;
    public FieldDef conpagas;
    public FieldDef conafeatrasos;
    public FieldDef conafedtoatr;
    public FieldDef conafevacas;
    public FieldDef conafesolovaca;
    public FieldDef conafecomplemit;
    public FieldDef concotizacomun;
    public FieldDef concotizaacc;
    public FieldDef concotizahext;
    public FieldDef concotizahextf;
    public FieldDef concotizairpf;
    public FieldDef conexclirpf;
    public FieldDef conexclbcc;
    public FieldDef conexclacc;
    public FieldDef conconta;
    public FieldDef consubconta;
    public FieldDef concontadh;
    public FieldDef conenfsin;
    public FieldDef conenfcon;
    public FieldDef conaccsin;
    public FieldDef conacccon;
    public FieldDef conmatsin;
    public FieldDef conmatcon;
    public FieldDef convariable;
    public FieldDef condescrip2;
    public FieldDef conproceso;
    public FieldDef conespcreadeduc;
    public FieldDef connoindemniz;
    public FieldDef conespcreatipo;
    public FieldDef conespdescdeduc;
    public FieldDef conespdescretri;
    public FieldDef conlibre01;
    public FieldDef conlibre02;
    public FieldDef conlibre03;
    public TabConcepto(String name)
      {
      super(name);
      conconvemp = new FieldDef("conconvemp",FieldDef.CHAR,7,FieldDef.NOTNULL);
      conconcepto = new FieldDef("conconcepto",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      contipocon = new FieldDef("contipocon",FieldDef.INTEGER,0);
      condescrip = new FieldDef("condescrip",FieldDef.CHAR,50);
      conrecibos = new FieldDef("conrecibos",FieldDef.CHAR,1);
      conpagas = new FieldDef("conpagas",FieldDef.CHAR,1);
      conafeatrasos = new FieldDef("conafeatrasos",FieldDef.CHAR,1);
      conafedtoatr = new FieldDef("conafedtoatr",FieldDef.CHAR,1);
      conafevacas = new FieldDef("conafevacas",FieldDef.CHAR,1);
      conafesolovaca = new FieldDef("conafesolovaca",FieldDef.CHAR,1);
      conafecomplemit = new FieldDef("conafecomplemit",FieldDef.CHAR,1);
      concotizacomun = new FieldDef("concotizacomun",FieldDef.CHAR,1);
      concotizaacc = new FieldDef("concotizaacc",FieldDef.CHAR,1);
      concotizahext = new FieldDef("concotizahext",FieldDef.CHAR,1);
      concotizahextf = new FieldDef("concotizahextf",FieldDef.CHAR,1);
      concotizairpf = new FieldDef("concotizairpf",FieldDef.INTEGER,0);
      conexclirpf = new FieldDef("conexclirpf",FieldDef.INTEGER,0);
      conexclbcc = new FieldDef("conexclbcc",FieldDef.INTEGER,0);
      conexclacc = new FieldDef("conexclacc",FieldDef.INTEGER,0);
      conconta = new FieldDef("conconta",FieldDef.CHAR,4);
      consubconta = new FieldDef("consubconta",FieldDef.CHAR,12);
      concontadh = new FieldDef("concontadh",FieldDef.CHAR,1);
      conenfsin = new FieldDef("conenfsin",FieldDef.CHAR,1);
      conenfcon = new FieldDef("conenfcon",FieldDef.CHAR,1);
      conaccsin = new FieldDef("conaccsin",FieldDef.CHAR,1);
      conacccon = new FieldDef("conacccon",FieldDef.CHAR,1);
      conmatsin = new FieldDef("conmatsin",FieldDef.CHAR,1);
      conmatcon = new FieldDef("conmatcon",FieldDef.CHAR,1);
      convariable = new FieldDef("convariable",FieldDef.CHAR,1);
      condescrip2 = new FieldDef("condescrip2",FieldDef.CHAR,50);
      conproceso = new FieldDef("conproceso",FieldDef.INTEGER,0);
      conespcreadeduc = new FieldDef("conespcreadeduc",FieldDef.CHAR,1);
      connoindemniz = new FieldDef("connoindemniz",FieldDef.CHAR,1);
      conespcreatipo = new FieldDef("conespcreatipo",FieldDef.CHAR,2);
      conespdescdeduc = new FieldDef("conespdescdeduc",FieldDef.CHAR,40);
      conespdescretri = new FieldDef("conespdescretri",FieldDef.CHAR,40);
      conlibre01 = new FieldDef("conlibre01",FieldDef.CHAR,1);
      conlibre02 = new FieldDef("conlibre02",FieldDef.CHAR,1);
      conlibre03 = new FieldDef("conlibre03",FieldDef.CHAR,2);
      FieldDef array[] = {
        conconvemp,
        conconcepto,
        contipocon,
        condescrip,
        conrecibos,
        conpagas,
        conafeatrasos,
        conafedtoatr,
        conafevacas,
        conafesolovaca,
        conafecomplemit,
        concotizacomun,
        concotizaacc,
        concotizahext,
        concotizahextf,
        concotizairpf,
        conexclirpf,
        conexclbcc,
        conexclacc,
        conconta,
        consubconta,
        concontadh,
        conenfsin,
        conenfcon,
        conaccsin,
        conacccon,
        conmatsin,
        conmatcon,
        convariable,
        condescrip2,
        conproceso,
        conespcreadeduc,
        connoindemniz,
        conespcreatipo,
        conespdescdeduc,
        conespdescretri,
        conlibre01,
        conlibre02,
        conlibre03        
        };
      setColumns(array);
      FieldDef arrayf[] = {conconvemp,conconcepto };
      setPrimaryKeys(arrayf);
      conconvemp.setDescription("codigo convenio empresa archivo enlaces   primer digito C,E,T + 6 de empresa/convenio +6 trabajador");
      conconcepto.setDescription("codigo de concepto");
      contipocon.setDescription("tipo concepto");
      condescrip.setDescription("descripcion del concepto");
      conrecibos.setDescription("Interviene en Recibos mensuales");
      conpagas.setDescription("Interviene en Pagas Extras");
      conafeatrasos.setDescription("afectacion para calculo atrasos");
      conafedtoatr.setDescription("afectacion para descuento en atrasos");
      conafevacas.setDescription("Interviene en periodo  vacaciones");
      conafesolovaca.setDescription("Interviene solo en vacaciones");
      conafecomplemit.setDescription("afectacion complemento IT");
      concotizacomun.setDescription("cotiza contingencias comunes");
      concotizaacc.setDescription("cotiza accidentes");
      concotizahext.setDescription("cotiza horas extras");
      concotizahextf.setDescription("cotiza horas extras fuerza mayor");
      concotizairpf.setDescription("cotiza irpf");
      conexclirpf.setDescription("Codigo exclusion IRPF");
      conexclbcc.setDescription("Codigo exclusion Base Contingencias comunes");
      conexclacc.setDescription("Codigo exclusion Base accidentes");
      conconta.setDescription("Cuenta Contabilidad");
      consubconta.setDescription("Subcuenta contabilidad");
      concontadh.setDescription("Importe Debe/haber");
      conenfsin.setDescription("Complemento enfermedad sin hospitalizacion");
      conenfcon.setDescription("Complemento enfermedad con hospitalizacion");
      conaccsin.setDescription("Complemento accidente sin hospitalizacion");
      conacccon.setDescription("Complemento accidente con hospitalizacion");
      conmatsin.setDescription("Complemento maternidad sin hospitalizacion");
      conmatcon.setDescription("Complemento maternidad con hospitalizacion");
      convariable.setDescription("Concepto retribucion variable (S/N/) por defecto se grava a nivel (CONFACTOR FACNIVEL = 3)");
      condescrip2.setDescription("Descripcion del concepto idioma 2");
      conproceso.setDescription("Codigo de Proceso Especial del concepto");
      conespcreadeduc.setDescription("Concepto en Especie crea deduccion en especie automaticamente");
      connoindemniz.setDescription("Concepto no indemnizatorio");
      }
    }
    
  public class TabConfactor extends TableDef
    {
    // Campos
    public FieldDef faccodi;
    public FieldDef facconvemp;
    public FieldDef facconcept;
    public FieldDef facnivel;
    public FieldDef facconvempori;
    public FieldDef faccateg;
    public FieldDef facempresa;
    public FieldDef factrab;
    public FieldDef factipimp;
    public FieldDef factipcdias;
    public FieldDef faclunes;
    public FieldDef facmartes;
    public FieldDef facmiercol;
    public FieldDef facjueves;
    public FieldDef facviernes;
    public FieldDef facsabado;
    public FieldDef facdomingo;
    public FieldDef fachoras;
    public FieldDef fachorlunes;
    public FieldDef fachormartes;
    public FieldDef fachormiercol;
    public FieldDef fachorjueves;
    public FieldDef fachorviernes;
    public FieldDef fachorsabado;
    public FieldDef fachordomingo;
    public FieldDef facexcfestiv;
    public FieldDef facenero;
    public FieldDef facfebrero;
    public FieldDef facmarzo;
    public FieldDef facabril;
    public FieldDef facmayo;
    public FieldDef facjunio;
    public FieldDef facjulio;
    public FieldDef facagosto;
    public FieldDef facseptiem;
    public FieldDef facoctubre;
    public FieldDef facnoviemb;
    public FieldDef facdiciemb;
    public FieldDef facformula;
    public FieldDef facimporte;
    public FieldDef facexcluir;
    public FieldDef facincluir;
    public FieldDef facimpabrev;
    public FieldDef facimpdescri;
    public FieldDef facimprofi;
    public FieldDef facimplinea;
    public FieldDef facimpcolum;
    public FieldDef facproceso;
    public FieldDef facnoproporcion;
    public FieldDef faccalcpropor;
    public TabConfactor(String name)
      {
      super(name);
      faccodi = new FieldDef("faccodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      facconvemp = new FieldDef("facconvemp",FieldDef.CHAR,7,FieldDef.NOTNULL);
      facconcept = new FieldDef("facconcept",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      facnivel = new FieldDef("facnivel",FieldDef.CHAR,1,FieldDef.NOTNULL);
      facconvempori = new FieldDef("facconvempori",FieldDef.CHAR,13);
      faccateg = new FieldDef("faccateg",FieldDef.INTEGER,0);
      facempresa = new FieldDef("facempresa",FieldDef.INTEGER,0);
      factrab = new FieldDef("factrab",FieldDef.INTEGER,0);
      factipimp = new FieldDef("factipimp",FieldDef.INTEGER,0);
      factipcdias = new FieldDef("factipcdias",FieldDef.FLOAT,6,0);
      faclunes = new FieldDef("faclunes",FieldDef.CHAR,1);
      facmartes = new FieldDef("facmartes",FieldDef.CHAR,1);
      facmiercol = new FieldDef("facmiercol",FieldDef.CHAR,1);
      facjueves = new FieldDef("facjueves",FieldDef.CHAR,1);
      facviernes = new FieldDef("facviernes",FieldDef.CHAR,1);
      facsabado = new FieldDef("facsabado",FieldDef.CHAR,1);
      facdomingo = new FieldDef("facdomingo",FieldDef.CHAR,1);
      fachoras = new FieldDef("fachoras",FieldDef.FLOAT,6,0);
      fachorlunes = new FieldDef("fachorlunes",FieldDef.FLOAT,6,0);
      fachormartes = new FieldDef("fachormartes",FieldDef.FLOAT,6,0);
      fachormiercol = new FieldDef("fachormiercol",FieldDef.FLOAT,6,0);
      fachorjueves = new FieldDef("fachorjueves",FieldDef.FLOAT,6,0);
      fachorviernes = new FieldDef("fachorviernes",FieldDef.FLOAT,6,0);
      fachorsabado = new FieldDef("fachorsabado",FieldDef.FLOAT,6,0);
      fachordomingo = new FieldDef("fachordomingo",FieldDef.FLOAT,6,0);
      facexcfestiv = new FieldDef("facexcfestiv",FieldDef.FLOAT,6,0);
      facenero = new FieldDef("facenero",FieldDef.CHAR,1);
      facfebrero = new FieldDef("facfebrero",FieldDef.CHAR,1);
      facmarzo = new FieldDef("facmarzo",FieldDef.CHAR,1);
      facabril = new FieldDef("facabril",FieldDef.CHAR,1);
      facmayo = new FieldDef("facmayo",FieldDef.CHAR,1);
      facjunio = new FieldDef("facjunio",FieldDef.CHAR,1);
      facjulio = new FieldDef("facjulio",FieldDef.CHAR,1);
      facagosto = new FieldDef("facagosto",FieldDef.CHAR,1);
      facseptiem = new FieldDef("facseptiem",FieldDef.CHAR,1);
      facoctubre = new FieldDef("facoctubre",FieldDef.CHAR,1);
      facnoviemb = new FieldDef("facnoviemb",FieldDef.CHAR,1);
      facdiciemb = new FieldDef("facdiciemb",FieldDef.CHAR,1);
      facformula = new FieldDef("facformula",FieldDef.CHAR,20004);
      facimporte = new FieldDef("facimporte",FieldDef.FLOAT,6,0);
      facexcluir = new FieldDef("facexcluir",FieldDef.CHAR,1);
      facincluir = new FieldDef("facincluir",FieldDef.CHAR,1);
      facimpabrev = new FieldDef("facimpabrev",FieldDef.CHAR,10);
      facimpdescri = new FieldDef("facimpdescri",FieldDef.CHAR,1);
      facimprofi = new FieldDef("facimprofi",FieldDef.INTEGER,0);
      facimplinea = new FieldDef("facimplinea",FieldDef.INTEGER,0);
      facimpcolum = new FieldDef("facimpcolum",FieldDef.INTEGER,0);
      facproceso = new FieldDef("facproceso",FieldDef.INTEGER,0);
      facnoproporcion = new FieldDef("facnoproporcion",FieldDef.CHAR,1);
      faccalcpropor = new FieldDef("faccalcpropor",FieldDef.CHAR,1);
      FieldDef array[] = {
        faccodi,
        facconvemp,
        facconcept,
        facnivel,
        facconvempori,
        faccateg,
        facempresa,
        factrab,
        factipimp,
        factipcdias,
        faclunes,
        facmartes,
        facmiercol,
        facjueves,
        facviernes,
        facsabado,
        facdomingo,
        fachoras,
        fachorlunes,
        fachormartes,
        fachormiercol,
        fachorjueves,
        fachorviernes,
        fachorsabado,
        fachordomingo,
        facexcfestiv,
        facenero,
        facfebrero,
        facmarzo,
        facabril,
        facmayo,
        facjunio,
        facjulio,
        facagosto,
        facseptiem,
        facoctubre,
        facnoviemb,
        facdiciemb,
        facformula,
        facimporte,
        facexcluir,
        facincluir,
        facimpabrev,
        facimpdescri,
        facimprofi,
        facimplinea,
        facimpcolum,
        facproceso,
        facnoproporcion,
        faccalcpropor        
        };
      setColumns(array);
      FieldDef arrayf[] = {faccodi };
      setPrimaryKeys(arrayf);
      faccodi.setAutoIncrementable(true);
      faccodi.setDescription("Codigo Autoincrementable");
      facconvemp.setDescription("Convenio / Empresa de origen ?????? ************** ojo no se que es esto !!!!!!!!!! ************************");
      facconcept.setDescription("Codigo Convenio/empresa (relació amb CONCEPTO)");
      facnivel.setDescription("Codigo concepto");
      facconvempori.setDescription("Nivel 1:Productor, 2:Categoria, 3:Convenio/empresa");
      faccateg.setDescription("Codigo categoria");
      facempresa.setDescription("Código de empresa");
      factrab.setDescription("Codigo trabajador");
      factipimp.setDescription("Tipo Importe");
      factipcdias.setDescription("Numero de dias");
      faclunes.setDescription("Se devenga los lunes");
      facmartes.setDescription("Se devenga los martes");
      facmiercol.setDescription("Se devenga los miercoles");
      facjueves.setDescription("Se devenga los jueves");
      facviernes.setDescription("Se devenga los viernes");
      facsabado.setDescription("Se devenga los sabados");
      facdomingo.setDescription("Se devenga los  domingos");
      fachoras.setDescription("Numero de horas");
      fachorlunes.setDescription("Se considera numero de horas del lunes");
      fachormartes.setDescription("Se considera numero de horas del martes");
      fachormiercol.setDescription("Se considera numero de horas del miercoles");
      fachorjueves.setDescription("Se considera numero de horas del jueves");
      fachorviernes.setDescription("Se considera numero de horas del viernes");
      fachorsabado.setDescription("Se considera numero de horas del sabado");
      fachordomingo.setDescription("Se considera numero de horas del domingo");
      facexcfestiv.setDescription("Inclusion/exclusion festivos");
      facenero.setDescription("Se paga en el mes Enero");
      facfebrero.setDescription("Se paga en el mes Febrero");
      facmarzo.setDescription("Se paga en el mes Marzo");
      facabril.setDescription("Se paga en el mes Abril");
      facmayo.setDescription("Se paga en el mes Mayo");
      facjunio.setDescription("Se paga en el mes Junio");
      facjulio.setDescription("Se paga en el mes Julio");
      facagosto.setDescription("Se paga en el mes Agosto");
      facseptiem.setDescription("Se paga en el mes Septiembre");
      facoctubre.setDescription("Se paga en el mes Octubre");
      facnoviemb.setDescription("Se paga en el mes Noviembre");
      facdiciemb.setDescription("Se paga en el mes Diciembre");
      facformula.setDescription("Formula");
      facimporte.setDescription("Importe");
      facexcluir.setDescription("Se excluye la relacion de conceptos");
      facincluir.setDescription("Se incluye la relacion de conceptos");
      facimpabrev.setDescription("Impresion descripcion abreviada");
      facimpdescri.setDescription("Impresion descripcion");
      facimprofi.setDescription("Impresion linea recibo laser");
      facimplinea.setDescription("Impresion linea recibo casillas");
      facproceso.setDescription("Codigo de Proceso Especial del concepto");
      facnoproporcion.setDescription("Concepto no Proporcionable al Tiempo Parcial");
      faccalcpropor.setDescription("Concepto de calculo proporcionable a dias de alta.");
      }
    }
    
  public class TabConfacrel extends TableDef
    {
    // Campos
    public FieldDef cfrcodi;
    public FieldDef cfrconcept;
    public TabConfacrel(String name)
      {
      super(name);
      cfrcodi = new FieldDef("cfrcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cfrconcept = new FieldDef("cfrconcept",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        cfrcodi,
        cfrconcept        
        };
      setColumns(array);
      FieldDef arrayf[] = {cfrcodi,cfrconcept };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabProcesos extends TableDef
    {
    // Campos
    public FieldDef procodi;
    public FieldDef prodescri;
    public FieldDef procotseg;
    public FieldDef procotacc;
    public FieldDef proirpf;
    public FieldDef proprorrata;
    public FieldDef proactacumu;
    public FieldDef proactilt;
    public FieldDef proceso;
    public FieldDef proliqred;
    public FieldDef propagasdias;
    public TabProcesos(String name)
      {
      super(name);
      procodi = new FieldDef("procodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      prodescri = new FieldDef("prodescri",FieldDef.CHAR,40);
      procotseg = new FieldDef("procotseg",FieldDef.CHAR,1);
      procotacc = new FieldDef("procotacc",FieldDef.CHAR,1);
      proirpf = new FieldDef("proirpf",FieldDef.CHAR,1);
      proprorrata = new FieldDef("proprorrata",FieldDef.CHAR,1);
      proactacumu = new FieldDef("proactacumu",FieldDef.CHAR,1);
      proactilt = new FieldDef("proactilt",FieldDef.CHAR,1);
      proceso = new FieldDef("proceso",FieldDef.CHAR,3);
      proliqred = new FieldDef("proliqred",FieldDef.CHAR,3);
      propagasdias = new FieldDef("propagasdias",FieldDef.CHAR,1);
      FieldDef array[] = {
        procodi,
        prodescri,
        procotseg,
        procotacc,
        proirpf,
        proprorrata,
        proactacumu,
        proactilt,
        proceso,
        proliqred,
        propagasdias        
        };
      setColumns(array);
      FieldDef arrayf[] = {procodi };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEnlaces extends TableDef
    {
    // Campos
    public FieldDef enlcodi;
    public FieldDef enlantig;
    public FieldDef enlpagas;
    public FieldDef enlcateg;
    public FieldDef enlconcep;
    public FieldDef enlgaran;
    public FieldDef enlvacaci;
    public FieldDef enlparamcal;
    public TabEnlaces(String name)
      {
      super(name);
      enlcodi = new FieldDef("enlcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      enlantig = new FieldDef("enlantig",FieldDef.CHAR,13);
      enlpagas = new FieldDef("enlpagas",FieldDef.CHAR,13);
      enlcateg = new FieldDef("enlcateg",FieldDef.CHAR,13);
      enlconcep = new FieldDef("enlconcep",FieldDef.CHAR,7);
      enlgaran = new FieldDef("enlgaran",FieldDef.CHAR,13);
      enlvacaci = new FieldDef("enlvacaci",FieldDef.CHAR,13);
      enlparamcal = new FieldDef("enlparamcal",FieldDef.CHAR,13);
      FieldDef array[] = {
        enlcodi,
        enlantig,
        enlpagas,
        enlcateg,
        enlconcep,
        enlgaran,
        enlvacaci,
        enlparamcal        
        };
      setColumns(array);
      FieldDef arrayf[] = {enlcodi };
      setPrimaryKeys(arrayf);
      enlcodi.setAutoIncrementable(true);
      }
    }
    
  public class TabConvenio extends TableDef
    {
    // Campos
    public FieldDef cnvcodigo;
    public FieldDef cnvdescrip;
    public FieldDef cnvcodconv;
    public FieldDef cnvdatapub;
    public FieldDef cnvdatavigor;
    public FieldDef cnvdatafin;
    public FieldDef cnvdocum;
    public FieldDef cnvenlace;
    public FieldDef cnvobser;
    public FieldDef cnvhoras;
    public FieldDef cnvhorasjor;
    public FieldDef cnvcalhextras;
    public FieldDef cnvcon612;
    public FieldDef cnvcon2436;
    public FieldDef cnvdiasprueba;
    public TabConvenio(String name)
      {
      super(name);
      cnvcodigo = new FieldDef("cnvcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnvdescrip = new FieldDef("cnvdescrip",FieldDef.CHAR,100);
      cnvcodconv = new FieldDef("cnvcodconv",FieldDef.INTEGER,0);
      cnvdatapub = new FieldDef("cnvdatapub",FieldDef.DATE);
      cnvdatavigor = new FieldDef("cnvdatavigor",FieldDef.DATE);
      cnvdatafin = new FieldDef("cnvdatafin",FieldDef.DATE);
      cnvdocum = new FieldDef("cnvdocum",FieldDef.CHAR,100);
      cnvenlace = new FieldDef("cnvenlace",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnvobser = new FieldDef("cnvobser",FieldDef.CHAR,2000);
      cnvhoras = new FieldDef("cnvhoras",FieldDef.FLOAT,6,0);
      cnvhorasjor = new FieldDef("cnvhorasjor",FieldDef.FLOAT,6,0);
      cnvcalhextras = new FieldDef("cnvcalhextras",FieldDef.FLOAT,6,0);
      cnvcon612 = new FieldDef("cnvcon612",FieldDef.CHAR,1);
      cnvcon2436 = new FieldDef("cnvcon2436",FieldDef.CHAR,1);
      cnvdiasprueba = new FieldDef("cnvdiasprueba",FieldDef.INTEGER,0);
      FieldDef array[] = {
        cnvcodigo,
        cnvdescrip,
        cnvcodconv,
        cnvdatapub,
        cnvdatavigor,
        cnvdatafin,
        cnvdocum,
        cnvenlace,
        cnvobser,
        cnvhoras,
        cnvhorasjor,
        cnvcalhextras,
        cnvcon612,
        cnvcon2436,
        cnvdiasprueba        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnvcodigo };
      setPrimaryKeys(arrayf);
      cnvcodigo.setDescription("Codigo convenio");
      cnvdescrip.setDescription("Descripcion del convenio");
      cnvcodconv.setDescription("Codigo oficial");
      cnvdatapub.setDescription("fecha publicacion");
      cnvdatavigor.setDescription("fecha entrada vigor");
      cnvdatafin.setDescription("fecha fin vigencia");
      cnvdocum.setDescription("Ruta acceso documento");
      cnvenlace.setDescription("Codigo de enlace con Archivo enlace");
      cnvobser.setDescription("Observaciones del convenio");
      cnvhoras.setDescription("Numero de horas");
      cnvhorasjor.setDescription("Horas jornada del convenio");
      cnvcalhextras.setDescription("Numero horas extras");
      cnvcon612.setDescription("Permite s/n contratos eventuales de duracion entre 6 y 12 meses");
      cnvcon2436.setDescription("Permite s/n contratos eventuales de duracion entre 24 y 36 meses");
      }
    }
    
  public class TabCategoria extends TableDef
    {
    // Campos
    public FieldDef catconvemp;
    public FieldDef catcodigo;
    public FieldDef catdescripc;
    public FieldDef catdescabre;
    public FieldDef catgrupo;
    public FieldDef catepi;
    public FieldDef catdiasprueba;
    public TabCategoria(String name)
      {
      super(name);
      catconvemp = new FieldDef("catconvemp",FieldDef.CHAR,13,FieldDef.NOTNULL);
      catcodigo = new FieldDef("catcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      catdescripc = new FieldDef("catdescripc",FieldDef.CHAR,30);
      catdescabre = new FieldDef("catdescabre",FieldDef.CHAR,20);
      catgrupo = new FieldDef("catgrupo",FieldDef.INTEGER,0);
      catepi = new FieldDef("catepi",FieldDef.INTEGER,0);
      catdiasprueba = new FieldDef("catdiasprueba",FieldDef.INTEGER,0);
      FieldDef array[] = {
        catconvemp,
        catcodigo,
        catdescripc,
        catdescabre,
        catgrupo,
        catepi,
        catdiasprueba        
        };
      setColumns(array);
      FieldDef arrayf[] = {catconvemp,catcodigo };
      setPrimaryKeys(arrayf);
      catconvemp.setDescription("Codigo de enlace");
      catcodigo.setDescription("Codigo de categoria");
      catdescripc.setDescription("Descripcion de categoria");
      catdescabre.setDescription("Descripcion abreviada de la categoria");
      catgrupo.setDescription("Grupo de cotizacion");
      catepi.setDescription("Epigrafe asignado a la categoria");
      }
    }
    
  public class TabAntiguedad extends TableDef
    {
    // Campos
    public FieldDef antconvemp;
    public FieldDef antcategoria;
    public FieldDef antdescrip;
    public TabAntiguedad(String name)
      {
      super(name);
      antconvemp = new FieldDef("antconvemp",FieldDef.CHAR,13,FieldDef.NOTNULL);
      antcategoria = new FieldDef("antcategoria",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      antdescrip = new FieldDef("antdescrip",FieldDef.CHAR,2000);
      FieldDef array[] = {
        antconvemp,
        antcategoria,
        antdescrip        
        };
      setColumns(array);
      FieldDef arrayf[] = {antconvemp,antcategoria };
      setPrimaryKeys(arrayf);
      antconvemp.setDescription("Codigo de enlace");
      antcategoria.setDescription("Categoria profesional");
      antdescrip.setDescription("Descripcion");
      }
    }
    
  public class TabTramsantig extends TableDef
    {
    // Campos
    public FieldDef tantconvemp;
    public FieldDef tantcategoria;
    public FieldDef tantanys;
    public FieldDef tantimporte;
    public FieldDef tantporcent;
    public TabTramsantig(String name)
      {
      super(name);
      tantconvemp = new FieldDef("tantconvemp",FieldDef.CHAR,13,FieldDef.NOTNULL);
      tantcategoria = new FieldDef("tantcategoria",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tantanys = new FieldDef("tantanys",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tantimporte = new FieldDef("tantimporte",FieldDef.FLOAT,6,0);
      tantporcent = new FieldDef("tantporcent",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        tantconvemp,
        tantcategoria,
        tantanys,
        tantimporte,
        tantporcent        
        };
      setColumns(array);
      FieldDef arrayf[] = {tantconvemp,tantcategoria,tantanys };
      setPrimaryKeys(arrayf);
      tantconvemp.setDescription("Codigo de enlace");
      tantcategoria.setDescription("Categoria profesional");
      tantanys.setDescription("A¤os de el tramo");
      tantimporte.setDescription("Importe por el tramo de a¤os de la tabla de antigedad");
      tantporcent.setDescription("Porcentaje");
      }
    }
    
  public class TabPagas extends TableDef
    {
    // Campos
    public FieldDef pagconvemp;
    public FieldDef pagcodigo;
    public FieldDef pagdescrip;
    public FieldDef pagdiacobro;
    public FieldDef pagmescobro;
    public FieldDef pagdiainidev;
    public FieldDef pagmesinidev;
    public FieldDef paganyinidev;
    public FieldDef pagdiafindev;
    public FieldDef pagmesfindev;
    public FieldDef paganyfindev;
    public FieldDef paganyimport;
    public FieldDef pagporpurga;
    public FieldDef pagporenfemp;
    public FieldDef pagporenfseg1;
    public FieldDef pagporenfseg2;
    public FieldDef pagpormater;
    public FieldDef pagporacc;
    public FieldDef pagporabsen;
    public FieldDef pagporvaga;
    public FieldDef pagpordesem;
    public FieldDef pagatrasos;
    public FieldDef pagprorbaja;
    public FieldDef pagdesglose;
    public FieldDef pagdias;
    public FieldDef pagliquidacion;
    public FieldDef pagporprorrata;
    public FieldDef pagexceso15;
    public FieldDef pagexcesomes;
    public FieldDef pagpordesc01;
    public FieldDef pagpordesc02;
    public FieldDef pagpordesc03;
    public FieldDef pagpordesc04;
    public TabPagas(String name)
      {
      super(name);
      pagconvemp = new FieldDef("pagconvemp",FieldDef.CHAR,13,FieldDef.NOTNULL);
      pagcodigo = new FieldDef("pagcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pagdescrip = new FieldDef("pagdescrip",FieldDef.CHAR,30);
      pagdiacobro = new FieldDef("pagdiacobro",FieldDef.INTEGER,0);
      pagmescobro = new FieldDef("pagmescobro",FieldDef.INTEGER,0);
      pagdiainidev = new FieldDef("pagdiainidev",FieldDef.INTEGER,0);
      pagmesinidev = new FieldDef("pagmesinidev",FieldDef.INTEGER,0);
      paganyinidev = new FieldDef("paganyinidev",FieldDef.CHAR,1);
      pagdiafindev = new FieldDef("pagdiafindev",FieldDef.INTEGER,0);
      pagmesfindev = new FieldDef("pagmesfindev",FieldDef.INTEGER,0);
      paganyfindev = new FieldDef("paganyfindev",FieldDef.CHAR,1);
      paganyimport = new FieldDef("paganyimport",FieldDef.CHAR,1);
      pagporpurga = new FieldDef("pagporpurga",FieldDef.FLOAT,6,0);
      pagporenfemp = new FieldDef("pagporenfemp",FieldDef.FLOAT,6,0);
      pagporenfseg1 = new FieldDef("pagporenfseg1",FieldDef.FLOAT,6,0);
      pagporenfseg2 = new FieldDef("pagporenfseg2",FieldDef.FLOAT,6,0);
      pagpormater = new FieldDef("pagpormater",FieldDef.FLOAT,6,0);
      pagporacc = new FieldDef("pagporacc",FieldDef.FLOAT,6,0);
      pagporabsen = new FieldDef("pagporabsen",FieldDef.FLOAT,6,0);
      pagporvaga = new FieldDef("pagporvaga",FieldDef.FLOAT,6,0);
      pagpordesem = new FieldDef("pagpordesem",FieldDef.FLOAT,6,0);
      pagatrasos = new FieldDef("pagatrasos",FieldDef.CHAR,1);
      pagprorbaja = new FieldDef("pagprorbaja",FieldDef.CHAR,1);
      pagdesglose = new FieldDef("pagdesglose",FieldDef.CHAR,1);
      pagdias = new FieldDef("pagdias",FieldDef.FLOAT,6,0);
      pagliquidacion = new FieldDef("pagliquidacion",FieldDef.CHAR,1);
      pagporprorrata = new FieldDef("pagporprorrata",FieldDef.CHAR,1);
      pagexceso15 = new FieldDef("pagexceso15",FieldDef.CHAR,1);
      pagexcesomes = new FieldDef("pagexcesomes",FieldDef.CHAR,1);
      pagpordesc01 = new FieldDef("pagpordesc01",FieldDef.FLOAT,6,0);
      pagpordesc02 = new FieldDef("pagpordesc02",FieldDef.FLOAT,6,0);
      pagpordesc03 = new FieldDef("pagpordesc03",FieldDef.FLOAT,6,0);
      pagpordesc04 = new FieldDef("pagpordesc04",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pagconvemp,
        pagcodigo,
        pagdescrip,
        pagdiacobro,
        pagmescobro,
        pagdiainidev,
        pagmesinidev,
        paganyinidev,
        pagdiafindev,
        pagmesfindev,
        paganyfindev,
        paganyimport,
        pagporpurga,
        pagporenfemp,
        pagporenfseg1,
        pagporenfseg2,
        pagpormater,
        pagporacc,
        pagporabsen,
        pagporvaga,
        pagpordesem,
        pagatrasos,
        pagprorbaja,
        pagdesglose,
        pagdias,
        pagliquidacion,
        pagporprorrata,
        pagexceso15,
        pagexcesomes,
        pagpordesc01,
        pagpordesc02,
        pagpordesc03,
        pagpordesc04        
        };
      setColumns(array);
      FieldDef arrayf[] = {pagconvemp,pagcodigo };
      setPrimaryKeys(arrayf);
      pagconvemp.setDescription("Codigo de enlace");
      pagcodigo.setDescription("Codigo de la paga extra");
      pagdescrip.setDescription("Descripcion de la paga extra");
      pagdiacobro.setDescription("Dia de cobro");
      pagmescobro.setDescription("Mes de cobro");
      pagdiainidev.setDescription("Dia inicio devengo de la paga extra");
      pagmesinidev.setDescription("Mes inicio devengo de la paga extra");
      paganyinidev.setDescription("A¤o inicio devengo de la paga extra");
      pagdiafindev.setDescription("Dia fin devengo de la paga extra");
      pagmesfindev.setDescription("Mes fin devengo de la paga extra");
      paganyfindev.setDescription("A¤o fin devengo de la paga extra");
      paganyimport.setDescription("Importes a¤o anterior para calculo de las pagas");
      pagporpurga.setDescription("Porcentaje descuento por dias de purga");
      pagporenfemp.setDescription("Porcentaje descuento por dias de enfermedad");
      pagporenfseg1.setDescription("Porcentaje descuento por dias de enfermedad pago delegado 60%");
      pagporenfseg2.setDescription("Porcentaje descuento por dias de enfermedad pago delegado 75%");
      pagpormater.setDescription("Porcentaje descuento por dias de maternidad");
      pagporacc.setDescription("Porcentaje descuento por dias de accidentes");
      pagporabsen.setDescription("Porcentaje descuento por dias de absentismo");
      pagporvaga.setDescription("Porcentaje descuento por dias de huelga");
      pagpordesem.setDescription("Porcentaje descuento por dias de desempleo");
      pagatrasos.setDescription("Interviene en atrasos");
      pagprorbaja.setDescription("Prorrata en periodos de it");
      pagdesglose.setDescription("Desglose de conceptos");
      pagdias.setDescription("Numero de dias de la paga");
      pagliquidacion.setDescription("Pagas por dias de liquidacion (S/N)");
      pagporprorrata.setDescription("Pagas por Prorratas");
      pagexceso15.setDescription("Pagas por dias exceso 15 dias");
      pagexcesomes.setDescription("Pagas por dias exceso Mes");
      pagpordesc01.setDescription("Porcentaje descuento por dias TIPO 01");
      pagpordesc02.setDescription("Porcentaje descuento por dias TIPO 01");
      pagpordesc03.setDescription("Porcentaje descuento por dias TIPO 01");
      pagpordesc04.setDescription("Porcentaje descuento por dias TIPO 01");
      }
    }
    
  public class TabConpagas extends TableDef
    {
    // Campos
    public FieldDef cpagconvemp;
    public FieldDef cpagcodigo;
    public FieldDef cpagconcep;
    public TabConpagas(String name)
      {
      super(name);
      cpagconvemp = new FieldDef("cpagconvemp",FieldDef.CHAR,13,FieldDef.NOTNULL);
      cpagcodigo = new FieldDef("cpagcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cpagconcep = new FieldDef("cpagconcep",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        cpagconvemp,
        cpagcodigo,
        cpagconcep        
        };
      setColumns(array);
      FieldDef arrayf[] = {cpagconvemp,cpagcodigo,cpagconcep };
      setPrimaryKeys(arrayf);
      cpagconvemp.setDescription("Codigo de enlace");
      cpagcodigo.setDescription("Codigo de la paga extra");
      cpagconcep.setDescription("Codigo concepto");
      }
    }
    
  public class TabGarantias extends TableDef
    {
    // Campos
    public FieldDef garconvemp;
    public FieldDef gartipoin;
    public FieldDef garhospi;
    public FieldDef garbruto;
    public FieldDef garbreg;
    public FieldDef garsmi;
    public TabGarantias(String name)
      {
      super(name);
      garconvemp = new FieldDef("garconvemp",FieldDef.CHAR,13,FieldDef.NOTNULL);
      gartipoin = new FieldDef("gartipoin",FieldDef.CHAR,2,FieldDef.NOTNULL);
      garhospi = new FieldDef("garhospi",FieldDef.CHAR,1,FieldDef.NOTNULL);
      garbruto = new FieldDef("garbruto",FieldDef.CHAR,1);
      garbreg = new FieldDef("garbreg",FieldDef.CHAR,1);
      garsmi = new FieldDef("garsmi",FieldDef.CHAR,1);
      FieldDef array[] = {
        garconvemp,
        gartipoin,
        garhospi,
        garbruto,
        garbreg,
        garsmi        
        };
      setColumns(array);
      FieldDef arrayf[] = {garconvemp,gartipoin,garhospi };
      setPrimaryKeys(arrayf);
      gartipoin.setDescription("Tipo Incidencia");
      garhospi.setDescription("Hospitalizacion");
      garbruto.setDescription("Garantia sobre Bruto salarial");
      garbreg.setDescription("Garantia sobre Base reguladora");
      garsmi.setDescription("Garantia sobre el SMI");
      }
    }
    
  public class TabTramgarantia extends TableDef
    {
    // Campos
    public FieldDef tgarconvemp;
    public FieldDef tgartipoin;
    public FieldDef tgarhospi;
    public FieldDef tgartram;
    public FieldDef tgardesde;
    public FieldDef tgarhasta;
    public FieldDef tgarporcen;
    public TabTramgarantia(String name)
      {
      super(name);
      tgarconvemp = new FieldDef("tgarconvemp",FieldDef.CHAR,13,FieldDef.NOTNULL);
      tgartipoin = new FieldDef("tgartipoin",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tgarhospi = new FieldDef("tgarhospi",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tgartram = new FieldDef("tgartram",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tgardesde = new FieldDef("tgardesde",FieldDef.INTEGER,0);
      tgarhasta = new FieldDef("tgarhasta",FieldDef.INTEGER,0);
      tgarporcen = new FieldDef("tgarporcen",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        tgarconvemp,
        tgartipoin,
        tgarhospi,
        tgartram,
        tgardesde,
        tgarhasta,
        tgarporcen        
        };
      setColumns(array);
      FieldDef arrayf[] = {tgarconvemp,tgartipoin,tgarhospi,tgartram };
      setPrimaryKeys(arrayf);
      tgartipoin.setDescription("Tipo Incidencia");
      tgarhospi.setDescription("Hospitalizacion");
      tgartram.setDescription("Numero de tramo garantia");
      tgardesde.setDescription("Dia inicial garantia");
      tgarhasta.setDescription("Dia final garantia");
      tgarporcen.setDescription("Porcentaje garantizado");
      }
    }
    
  public class TabVacaciones extends TableDef
    {
    // Campos
    public FieldDef vacconvemp;
    public FieldDef vacdiainidev;
    public FieldDef vacmesinidev;
    public FieldDef vacanyinidev;
    public FieldDef vacdiafindev;
    public FieldDef vacmesfindev;
    public FieldDef vacanyfindev;
    public FieldDef vacdias;
    public FieldDef vactipodias;
    public TabVacaciones(String name)
      {
      super(name);
      vacconvemp = new FieldDef("vacconvemp",FieldDef.CHAR,13,FieldDef.NOTNULL);
      vacdiainidev = new FieldDef("vacdiainidev",FieldDef.INTEGER,0);
      vacmesinidev = new FieldDef("vacmesinidev",FieldDef.INTEGER,0);
      vacanyinidev = new FieldDef("vacanyinidev",FieldDef.CHAR,1);
      vacdiafindev = new FieldDef("vacdiafindev",FieldDef.INTEGER,0);
      vacmesfindev = new FieldDef("vacmesfindev",FieldDef.INTEGER,0);
      vacanyfindev = new FieldDef("vacanyfindev",FieldDef.CHAR,1);
      vacdias = new FieldDef("vacdias",FieldDef.INTEGER,0);
      vactipodias = new FieldDef("vactipodias",FieldDef.CHAR,1);
      FieldDef array[] = {
        vacconvemp,
        vacdiainidev,
        vacmesinidev,
        vacanyinidev,
        vacdiafindev,
        vacmesfindev,
        vacanyfindev,
        vacdias,
        vactipodias        
        };
      setColumns(array);
      FieldDef arrayf[] = {vacconvemp };
      setPrimaryKeys(arrayf);
      vacconvemp.setDescription("Codigo de enlace");
      vacdiainidev.setDescription("Dia inicio devengo de las vacaciones");
      vacmesinidev.setDescription("Mes inicio devengo de las vacaciones");
      vacanyinidev.setDescription("A¤o inicio devengo de las vacaciones");
      vacdiafindev.setDescription("Dia fin devengo");
      vacmesfindev.setDescription("Mes fin devengo");
      vacanyfindev.setDescription("A¤o fin devengo");
      vacdias.setDescription("Dias de vacaciones");
      vactipodias.setDescription("Tipos de dias");
      }
    }
    
  public class TabEmpresa extends TableDef
    {
    // Campos
    public FieldDef empcodigo;
    public FieldDef empnombre;
    public FieldDef empnif;
    public FieldDef empcodiconv;
    public FieldDef empactiva;
    public FieldDef empsistred;
    public FieldDef empalfabe;
    public FieldDef emprecibo;
    public FieldDef empimprunid;
    public FieldDef empimprit;
    public FieldDef empirpfper;
    public FieldDef empirpffrac;
    public FieldDef empirpfcal;
    public FieldDef empenero;
    public FieldDef empfebrero;
    public FieldDef empmarzo;
    public FieldDef empabril;
    public FieldDef empmayo;
    public FieldDef empjunio;
    public FieldDef empjulio;
    public FieldDef empagosto;
    public FieldDef empseptie;
    public FieldDef empoctub;
    public FieldDef empnoviem;
    public FieldDef empdiciem;
    public FieldDef empestenero;
    public FieldDef empestfebre;
    public FieldDef empestmarzo;
    public FieldDef empestabril;
    public FieldDef empestmayo;
    public FieldDef empestjunio;
    public FieldDef empestjulio;
    public FieldDef empestagosto;
    public FieldDef empestseptie;
    public FieldDef empestoctub;
    public FieldDef empestnovie;
    public FieldDef empestdiciem;
    public FieldDef empatrasos;
    public FieldDef empaltamens;
    public FieldDef empitmensu;
    public FieldDef empobserv;
    public FieldDef empenlace;
    public FieldDef empconvac;
    public FieldDef empconpag;
    public FieldDef empconinde;
    public FieldDef emppagas;
    public FieldDef empuser;
    public FieldDef empgrupo;
    public FieldDef empidioma;
    public FieldDef empcalmensalta;
    public FieldDef empcalmensbaja;
    public FieldDef empcalmensitcob;
    public FieldDef empcalmensitcot;
    public FieldDef empcodiaux;
    public FieldDef empenlcta;
    public FieldDef empsubcta;
    public FieldDef empempcta;
    public FieldDef empcbanccta;
    public FieldDef empsbanccta;
    public FieldDef empconvofic;
    public TabEmpresa(String name)
      {
      super(name);
      empcodigo = new FieldDef("empcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      empnombre = new FieldDef("empnombre",FieldDef.CHAR,40);
      empnif = new FieldDef("empnif",FieldDef.CHAR,15);
      empcodiconv = new FieldDef("empcodiconv",FieldDef.INTEGER,0);
      empactiva = new FieldDef("empactiva",FieldDef.CHAR,1);
      empsistred = new FieldDef("empsistred",FieldDef.CHAR,1);
      empalfabe = new FieldDef("empalfabe",FieldDef.CHAR,2);
      emprecibo = new FieldDef("emprecibo",FieldDef.CHAR,1);
      empimprunid = new FieldDef("empimprunid",FieldDef.CHAR,1);
      empimprit = new FieldDef("empimprit",FieldDef.CHAR,1);
      empirpfper = new FieldDef("empirpfper",FieldDef.CHAR,2);
      empirpffrac = new FieldDef("empirpffrac",FieldDef.CHAR,2);
      empirpfcal = new FieldDef("empirpfcal",FieldDef.CHAR,2);
      empenero = new FieldDef("empenero",FieldDef.CHAR,1);
      empfebrero = new FieldDef("empfebrero",FieldDef.CHAR,1);
      empmarzo = new FieldDef("empmarzo",FieldDef.CHAR,1);
      empabril = new FieldDef("empabril",FieldDef.CHAR,1);
      empmayo = new FieldDef("empmayo",FieldDef.CHAR,1);
      empjunio = new FieldDef("empjunio",FieldDef.CHAR,1);
      empjulio = new FieldDef("empjulio",FieldDef.CHAR,1);
      empagosto = new FieldDef("empagosto",FieldDef.CHAR,1);
      empseptie = new FieldDef("empseptie",FieldDef.CHAR,1);
      empoctub = new FieldDef("empoctub",FieldDef.CHAR,1);
      empnoviem = new FieldDef("empnoviem",FieldDef.CHAR,1);
      empdiciem = new FieldDef("empdiciem",FieldDef.CHAR,1);
      empestenero = new FieldDef("empestenero",FieldDef.CHAR,1);
      empestfebre = new FieldDef("empestfebre",FieldDef.CHAR,1);
      empestmarzo = new FieldDef("empestmarzo",FieldDef.CHAR,1);
      empestabril = new FieldDef("empestabril",FieldDef.CHAR,1);
      empestmayo = new FieldDef("empestmayo",FieldDef.CHAR,1);
      empestjunio = new FieldDef("empestjunio",FieldDef.CHAR,1);
      empestjulio = new FieldDef("empestjulio",FieldDef.CHAR,1);
      empestagosto = new FieldDef("empestagosto",FieldDef.CHAR,1);
      empestseptie = new FieldDef("empestseptie",FieldDef.CHAR,1);
      empestoctub = new FieldDef("empestoctub",FieldDef.CHAR,1);
      empestnovie = new FieldDef("empestnovie",FieldDef.CHAR,1);
      empestdiciem = new FieldDef("empestdiciem",FieldDef.CHAR,1);
      empatrasos = new FieldDef("empatrasos",FieldDef.CHAR,1);
      empaltamens = new FieldDef("empaltamens",FieldDef.CHAR,1);
      empitmensu = new FieldDef("empitmensu",FieldDef.CHAR,1);
      empobserv = new FieldDef("empobserv",FieldDef.CHAR,2000);
      empenlace = new FieldDef("empenlace",FieldDef.INTEGER,0);
      empconvac = new FieldDef("empconvac",FieldDef.INTEGER,0);
      empconpag = new FieldDef("empconpag",FieldDef.INTEGER,0);
      empconinde = new FieldDef("empconinde",FieldDef.INTEGER,0);
      emppagas = new FieldDef("emppagas",FieldDef.CHAR,1);
      empuser = new FieldDef("empuser",FieldDef.CHAR,25);
      empgrupo = new FieldDef("empgrupo",FieldDef.CHAR,15);
      empidioma = new FieldDef("empidioma",FieldDef.INTEGER,0);
      empcalmensalta = new FieldDef("empcalmensalta",FieldDef.CHAR,1);
      empcalmensbaja = new FieldDef("empcalmensbaja",FieldDef.CHAR,1);
      empcalmensitcob = new FieldDef("empcalmensitcob",FieldDef.CHAR,1);
      empcalmensitcot = new FieldDef("empcalmensitcot",FieldDef.CHAR,1);
      empcodiaux = new FieldDef("empcodiaux",FieldDef.CHAR,30);
      empenlcta = new FieldDef("empenlcta",FieldDef.INTEGER,0);
      empsubcta = new FieldDef("empsubcta",FieldDef.CHAR,12);
      empempcta = new FieldDef("empempcta",FieldDef.CHAR,6);
      empcbanccta = new FieldDef("empcbanccta",FieldDef.CHAR,4);
      empsbanccta = new FieldDef("empsbanccta",FieldDef.CHAR,12);
      empconvofic = new FieldDef("empconvofic",FieldDef.INTEGER,0);
      FieldDef array[] = {
        empcodigo,
        empnombre,
        empnif,
        empcodiconv,
        empactiva,
        empsistred,
        empalfabe,
        emprecibo,
        empimprunid,
        empimprit,
        empirpfper,
        empirpffrac,
        empirpfcal,
        empenero,
        empfebrero,
        empmarzo,
        empabril,
        empmayo,
        empjunio,
        empjulio,
        empagosto,
        empseptie,
        empoctub,
        empnoviem,
        empdiciem,
        empestenero,
        empestfebre,
        empestmarzo,
        empestabril,
        empestmayo,
        empestjunio,
        empestjulio,
        empestagosto,
        empestseptie,
        empestoctub,
        empestnovie,
        empestdiciem,
        empatrasos,
        empaltamens,
        empitmensu,
        empobserv,
        empenlace,
        empconvac,
        empconpag,
        empconinde,
        emppagas,
        empuser,
        empgrupo,
        empidioma,
        empcalmensalta,
        empcalmensbaja,
        empcalmensitcob,
        empcalmensitcot,
        empcodiaux,
        empenlcta,
        empsubcta,
        empempcta,
        empcbanccta,
        empsbanccta,
        empconvofic        
        };
      setColumns(array);
      FieldDef arrayf[] = {empcodigo };
      setPrimaryKeys(arrayf);
      empcodigo.setDescription("Codigo empresa");
      empnombre.setDescription("Nombre empresa");
      empnif.setDescription("Nif empresa");
      empcodiconv.setDescription("Codigo convenio");
      empactiva.setDescription("Empresa activa");
      empsistred.setDescription("Sistema red");
      empalfabe.setDescription("Tipo alfabetico empresario sistema red");
      emprecibo.setDescription("Tipo recibo");
      empimprunid.setDescription("Impresion unidades");
      empimprit.setDescription("Impresion it en recibo");
      empirpfper.setDescription("Periodicidad irpf");
      empirpffrac.setDescription("Forma de ingreso IRPF");
      empirpfcal.setDescription("Calculo del pago fraccionado");
      empenero.setDescription("Indicatico regularizacion irpf en Enero");
      empfebrero.setDescription("Indicatico regularizacion irpf en Febrero");
      empmarzo.setDescription("Indicatico regularizacion irpf en Marzo");
      empabril.setDescription("Indicatico regularizacion irpf en Abril");
      empmayo.setDescription("Indicatico regularizacion irpf en Mayo");
      empjunio.setDescription("Indicatico regularizacion irpf en Junio");
      empjulio.setDescription("Indicatico regularizacion irpf en Julio");
      empagosto.setDescription("Indicatico regularizacion irpf en Agosto");
      empseptie.setDescription("Indicatico regularizacion irpf en Septiembre");
      empoctub.setDescription("Indicatico regularizacion irpf en Octubre");
      empnoviem.setDescription("Indicatico regularizacion irpf en Noviembre");
      empdiciem.setDescription("Indicatico regularizacion irpf en Diciembre");
      empestenero.setDescription("Estado regularizacion del mes  Enero");
      empestfebre.setDescription("Estado regularizacion del mes  Febrero");
      empestmarzo.setDescription("Estado regularizacion del mes  Marzo");
      empestabril.setDescription("Estado regularizacion del mes  Abril");
      empestmayo.setDescription("Estado regularizacion del mes  Mayo");
      empestjunio.setDescription("Estado regularizacion del mes  Junio");
      empestjulio.setDescription("Estado regularizacion del mes  Julio");
      empestagosto.setDescription("Estado regularizacion del mes  Agosto");
      empestseptie.setDescription("Estado regularizacion del mes  Septiembre");
      empestoctub.setDescription("Estado regularizacion del mes  Octubre");
      empestnovie.setDescription("Estado regularizacion del mes  Noviembre");
      empestdiciem.setDescription("Estado regularizacion del mes  Diciembre");
      empatrasos.setDescription("interviene en atrasos");
      empaltamens.setDescription("Opcion calculo dias para alta  naturales entre 30");
      empitmensu.setDescription("Opcion calculo it para personal mensual  naturales entre 30");
      empobserv.setDescription("Observaciones sobre empresa");
      empenlace.setDescription("Codigo enlace convenio");
      empconvac.setDescription("Concepto vacaciones para finiquito");
      empconpag.setDescription("Concepto pagas para finiquito");
      empconinde.setDescription("Concepto indemnizacion para finiquito");
      empuser.setDescription("Usuario asignado a empresa");
      empgrupo.setDescription("Grupo asignado a empresa");
      empidioma.setDescription("Idioma documentos empresa");
      empcodiaux.setDescription("Código Empresa Auxiliar");
      }
    }
    
  public class TabEmpservicios extends TableDef
    {
    // Campos
    public FieldDef emsempresa;
    public FieldDef emscodigo;
    public FieldDef emsinactivo;
    public TabEmpservicios(String name)
      {
      super(name);
      emsempresa = new FieldDef("emsempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      emscodigo = new FieldDef("emscodigo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      emsinactivo = new FieldDef("emsinactivo",FieldDef.CHAR,1);
      FieldDef array[] = {
        emsempresa,
        emscodigo,
        emsinactivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {emsempresa,emscodigo };
      setPrimaryKeys(arrayf);
      emsempresa.setDescription("Codigo empresa");
      emscodigo.setDescription("Codigo servicio");
      emsinactivo.setDescription("Servicio Inactivo");
      }
    }
    
  public class TabEmpclausulas extends TableDef
    {
    // Campos
    public FieldDef emcempresa;
    public FieldDef emccodigo;
    public FieldDef emcvigente;
    public FieldDef emctitulo;
    public FieldDef emcdescri;
    public TabEmpclausulas(String name)
      {
      super(name);
      emcempresa = new FieldDef("emcempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      emccodigo = new FieldDef("emccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      emcvigente = new FieldDef("emcvigente",FieldDef.CHAR,1);
      emctitulo = new FieldDef("emctitulo",FieldDef.CHAR,50);
      emcdescri = new FieldDef("emcdescri",FieldDef.CHAR,2000);
      FieldDef array[] = {
        emcempresa,
        emccodigo,
        emcvigente,
        emctitulo,
        emcdescri        
        };
      setColumns(array);
      FieldDef arrayf[] = {emcempresa,emccodigo };
      setPrimaryKeys(arrayf);
      emcempresa.setDescription("Codigo Empresa");
      emccodigo.setAutoIncrementable(true);
      emccodigo.setDescription("Codigo Clausula");
      emcvigente.setDescription("Vigente");
      emctitulo.setDescription("Titulo");
      emcdescri.setDescription("Descripcion");
      }
    }
    
  public class TabCentros extends TableDef
    {
    // Campos
    public FieldDef cencodiemp;
    public FieldDef cencodigo;
    public FieldDef cennombre;
    public FieldDef cenmutua;
    public FieldDef cenactivi;
    public FieldDef cenepigraf;
    public FieldDef cencnae;
    public FieldDef ceninem;
    public FieldDef centipocen;
    public FieldDef cenregimen;
    public FieldDef cencccgral1;
    public FieldDef cencccgral2;
    public FieldDef cencccgral3;
    public FieldDef cenreggral;
    public FieldDef cenrcodgral;
    public FieldDef cencccfor1;
    public FieldDef cencccfor2;
    public FieldDef cencccfor3;
    public FieldDef cenregfor;
    public FieldDef cenrcodfor;
    public FieldDef cenccctp1;
    public FieldDef cenccctp2;
    public FieldDef cenccctp3;
    public FieldDef cenregtp;
    public FieldDef cenrcodtp;
    public FieldDef cencccadmo1;
    public FieldDef cencccadmo2;
    public FieldDef cencccadmo3;
    public FieldDef cenregadmo;
    public FieldDef cenrcodadmo;
    public FieldDef cencccart1;
    public FieldDef cencccart2;
    public FieldDef cencccart3;
    public FieldDef cenregart;
    public FieldDef cenrcodart;
    public FieldDef cenccctaur1;
    public FieldDef cenccctaur2;
    public FieldDef cenccctaur3;
    public FieldDef cenregataur;
    public FieldDef cenrcodtaur;
    public FieldDef cencccrepre1;
    public FieldDef cencccrepre2;
    public FieldDef cencccrepre3;
    public FieldDef cenregrepre;
    public FieldDef cenrcodrepre;
    public FieldDef cencccfunci1;
    public FieldDef cencccfunci2;
    public FieldDef cencccfunci3;
    public FieldDef cenregfunci;
    public FieldDef cenrcodfunci;
    public FieldDef cencccinter1;
    public FieldDef cencccinter2;
    public FieldDef cencccinter3;
    public FieldDef cenreginter;
    public FieldDef cenrcodinter;
    public FieldDef cencccnuevo1;
    public FieldDef cencccnuevo2;
    public FieldDef cencccnuevo3;
    public FieldDef cenregnuevo;
    public FieldDef cenrcodnuevo;
    public FieldDef cencccnewin1;
    public FieldDef cencccnewin2;
    public FieldDef cencccnewin3;
    public FieldDef cenregnewin;
    public FieldDef cenrcodnewin;
    public FieldDef cenobserva;
    public FieldDef cencolabora;
    public FieldDef censscnae;
    public FieldDef cenocupasita;
    public FieldDef cenenlace;
    public FieldDef cenconvenio;
    public FieldDef cenenlcta;
    public FieldDef censubcta;
    public FieldDef cenempcta;
    public FieldDef cencbanccta;
    public FieldDef censbanccta;
    public FieldDef cenconvofic;
    public FieldDef censscnae09;
    public TabCentros(String name)
      {
      super(name);
      cencodiemp = new FieldDef("cencodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cencodigo = new FieldDef("cencodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cennombre = new FieldDef("cennombre",FieldDef.CHAR,40);
      cenmutua = new FieldDef("cenmutua",FieldDef.CHAR,4);
      cenactivi = new FieldDef("cenactivi",FieldDef.CHAR,1);
      cenepigraf = new FieldDef("cenepigraf",FieldDef.CHAR,7);
      cencnae = new FieldDef("cencnae",FieldDef.INTEGER,0);
      ceninem = new FieldDef("ceninem",FieldDef.CHAR,7);
      centipocen = new FieldDef("centipocen",FieldDef.CHAR,1);
      cenregimen = new FieldDef("cenregimen",FieldDef.CHAR,1);
      cencccgral1 = new FieldDef("cencccgral1",FieldDef.INTEGER,0);
      cencccgral2 = new FieldDef("cencccgral2",FieldDef.INTEGER,0);
      cencccgral3 = new FieldDef("cencccgral3",FieldDef.INTEGER,0);
      cenreggral = new FieldDef("cenreggral",FieldDef.INTEGER,0);
      cenrcodgral = new FieldDef("cenrcodgral",FieldDef.INTEGER,0);
      cencccfor1 = new FieldDef("cencccfor1",FieldDef.INTEGER,0);
      cencccfor2 = new FieldDef("cencccfor2",FieldDef.INTEGER,0);
      cencccfor3 = new FieldDef("cencccfor3",FieldDef.INTEGER,0);
      cenregfor = new FieldDef("cenregfor",FieldDef.INTEGER,0);
      cenrcodfor = new FieldDef("cenrcodfor",FieldDef.INTEGER,0);
      cenccctp1 = new FieldDef("cenccctp1",FieldDef.INTEGER,0);
      cenccctp2 = new FieldDef("cenccctp2",FieldDef.INTEGER,0);
      cenccctp3 = new FieldDef("cenccctp3",FieldDef.INTEGER,0);
      cenregtp = new FieldDef("cenregtp",FieldDef.INTEGER,0);
      cenrcodtp = new FieldDef("cenrcodtp",FieldDef.INTEGER,0);
      cencccadmo1 = new FieldDef("cencccadmo1",FieldDef.INTEGER,0);
      cencccadmo2 = new FieldDef("cencccadmo2",FieldDef.INTEGER,0);
      cencccadmo3 = new FieldDef("cencccadmo3",FieldDef.INTEGER,0);
      cenregadmo = new FieldDef("cenregadmo",FieldDef.INTEGER,0);
      cenrcodadmo = new FieldDef("cenrcodadmo",FieldDef.INTEGER,0);
      cencccart1 = new FieldDef("cencccart1",FieldDef.INTEGER,0);
      cencccart2 = new FieldDef("cencccart2",FieldDef.INTEGER,0);
      cencccart3 = new FieldDef("cencccart3",FieldDef.INTEGER,0);
      cenregart = new FieldDef("cenregart",FieldDef.INTEGER,0);
      cenrcodart = new FieldDef("cenrcodart",FieldDef.INTEGER,0);
      cenccctaur1 = new FieldDef("cenccctaur1",FieldDef.INTEGER,0);
      cenccctaur2 = new FieldDef("cenccctaur2",FieldDef.INTEGER,0);
      cenccctaur3 = new FieldDef("cenccctaur3",FieldDef.INTEGER,0);
      cenregataur = new FieldDef("cenregataur",FieldDef.INTEGER,0);
      cenrcodtaur = new FieldDef("cenrcodtaur",FieldDef.INTEGER,0);
      cencccrepre1 = new FieldDef("cencccrepre1",FieldDef.INTEGER,0);
      cencccrepre2 = new FieldDef("cencccrepre2",FieldDef.INTEGER,0);
      cencccrepre3 = new FieldDef("cencccrepre3",FieldDef.INTEGER,0);
      cenregrepre = new FieldDef("cenregrepre",FieldDef.INTEGER,0);
      cenrcodrepre = new FieldDef("cenrcodrepre",FieldDef.INTEGER,0);
      cencccfunci1 = new FieldDef("cencccfunci1",FieldDef.INTEGER,0);
      cencccfunci2 = new FieldDef("cencccfunci2",FieldDef.INTEGER,0);
      cencccfunci3 = new FieldDef("cencccfunci3",FieldDef.INTEGER,0);
      cenregfunci = new FieldDef("cenregfunci",FieldDef.INTEGER,0);
      cenrcodfunci = new FieldDef("cenrcodfunci",FieldDef.INTEGER,0);
      cencccinter1 = new FieldDef("cencccinter1",FieldDef.INTEGER,0);
      cencccinter2 = new FieldDef("cencccinter2",FieldDef.INTEGER,0);
      cencccinter3 = new FieldDef("cencccinter3",FieldDef.INTEGER,0);
      cenreginter = new FieldDef("cenreginter",FieldDef.INTEGER,0);
      cenrcodinter = new FieldDef("cenrcodinter",FieldDef.INTEGER,0);
      cencccnuevo1 = new FieldDef("cencccnuevo1",FieldDef.INTEGER,0);
      cencccnuevo2 = new FieldDef("cencccnuevo2",FieldDef.INTEGER,0);
      cencccnuevo3 = new FieldDef("cencccnuevo3",FieldDef.INTEGER,0);
      cenregnuevo = new FieldDef("cenregnuevo",FieldDef.INTEGER,0);
      cenrcodnuevo = new FieldDef("cenrcodnuevo",FieldDef.INTEGER,0);
      cencccnewin1 = new FieldDef("cencccnewin1",FieldDef.INTEGER,0);
      cencccnewin2 = new FieldDef("cencccnewin2",FieldDef.INTEGER,0);
      cencccnewin3 = new FieldDef("cencccnewin3",FieldDef.INTEGER,0);
      cenregnewin = new FieldDef("cenregnewin",FieldDef.INTEGER,0);
      cenrcodnewin = new FieldDef("cenrcodnewin",FieldDef.INTEGER,0);
      cenobserva = new FieldDef("cenobserva",FieldDef.CHAR,2000);
      cencolabora = new FieldDef("cencolabora",FieldDef.CHAR,1);
      censscnae = new FieldDef("censscnae",FieldDef.CHAR,7);
      cenocupasita = new FieldDef("cenocupasita",FieldDef.CHAR,1);
      cenenlace = new FieldDef("cenenlace",FieldDef.INTEGER,0);
      cenconvenio = new FieldDef("cenconvenio",FieldDef.INTEGER,0);
      cenenlcta = new FieldDef("cenenlcta",FieldDef.INTEGER,0);
      censubcta = new FieldDef("censubcta",FieldDef.CHAR,12);
      cenempcta = new FieldDef("cenempcta",FieldDef.INTEGER,0);
      cencbanccta = new FieldDef("cencbanccta",FieldDef.CHAR,4);
      censbanccta = new FieldDef("censbanccta",FieldDef.CHAR,12);
      cenconvofic = new FieldDef("cenconvofic",FieldDef.INTEGER,0);
      censscnae09 = new FieldDef("censscnae09",FieldDef.CHAR,4);
      FieldDef array[] = {
        cencodiemp,
        cencodigo,
        cennombre,
        cenmutua,
        cenactivi,
        cenepigraf,
        cencnae,
        ceninem,
        centipocen,
        cenregimen,
        cencccgral1,
        cencccgral2,
        cencccgral3,
        cenreggral,
        cenrcodgral,
        cencccfor1,
        cencccfor2,
        cencccfor3,
        cenregfor,
        cenrcodfor,
        cenccctp1,
        cenccctp2,
        cenccctp3,
        cenregtp,
        cenrcodtp,
        cencccadmo1,
        cencccadmo2,
        cencccadmo3,
        cenregadmo,
        cenrcodadmo,
        cencccart1,
        cencccart2,
        cencccart3,
        cenregart,
        cenrcodart,
        cenccctaur1,
        cenccctaur2,
        cenccctaur3,
        cenregataur,
        cenrcodtaur,
        cencccrepre1,
        cencccrepre2,
        cencccrepre3,
        cenregrepre,
        cenrcodrepre,
        cencccfunci1,
        cencccfunci2,
        cencccfunci3,
        cenregfunci,
        cenrcodfunci,
        cencccinter1,
        cencccinter2,
        cencccinter3,
        cenreginter,
        cenrcodinter,
        cencccnuevo1,
        cencccnuevo2,
        cencccnuevo3,
        cenregnuevo,
        cenrcodnuevo,
        cencccnewin1,
        cencccnewin2,
        cencccnewin3,
        cenregnewin,
        cenrcodnewin,
        cenobserva,
        cencolabora,
        censscnae,
        cenocupasita,
        cenenlace,
        cenconvenio,
        cenenlcta,
        censubcta,
        cenempcta,
        cencbanccta,
        censbanccta,
        cenconvofic,
        censscnae09        
        };
      setColumns(array);
      FieldDef arrayf[] = {cencodiemp,cencodigo };
      setPrimaryKeys(arrayf);
      cencodiemp.setDescription("Codigo Empresa");
      cencodigo.setDescription("Codigo centro de Trabajo");
      cennombre.setDescription("Nombre del Centro");
      cenmutua.setDescription("Codigo Mutua Accidentes");
      cenactivi.setDescription("Actividad Principal-Secundaria");
      cenepigraf.setDescription("Epigrafe Accidentes");
      cencnae.setDescription("CNAE");
      ceninem.setDescription("Codigo Oficina INEM");
      centipocen.setDescription("Tipo Centro");
      cenregimen.setDescription("Regimen Seg. Social");
      cencccgral1.setDescription("Codigo Cuenta Cotizacion (1) Reg. Gral.");
      cencccgral2.setDescription("Codigo Cuenta Cotizacion (2) Reg. Gral.");
      cencccgral3.setDescription("Codigo Cuenta Cotizacion (3) Reg. Gral.");
      cenreggral.setDescription("Codigo Regimen Gral.");
      cenrcodgral.setDescription("Codigo Subregimen Gral.");
      cencccfor1.setDescription("Codigo Cuenta Cotizacion (1)  Formacion");
      cencccfor2.setDescription("Codigo Cuenta Cotizacion (2)  Formacion");
      cencccfor3.setDescription("Codigo Cuenta Cotizacion (3)  Formacion");
      cenregfor.setDescription("Codigo Regimen Formacion");
      cenrcodfor.setDescription("Codigo Subregimen Formacion");
      cenccctp1.setDescription("Codigo Cuenta Cotizacion (1)  Tiempo Parcial");
      cenccctp2.setDescription("Codigo Cuenta Cotizacion (2)  Tiempo Parcial");
      cenccctp3.setDescription("Codigo Cuenta Cotizacion (3)  Tiempo Parcial");
      cenregtp.setDescription("Codigo Regimen  Tiempo Parcial");
      cenrcodtp.setDescription("Codigo Subregimen  Tiempo Parcial");
      cencccadmo1.setDescription("Codigo Cuenta Cotizacion (1)  Administrador");
      cencccadmo2.setDescription("Codigo Cuenta Cotizacion (2)  Administrador");
      cencccadmo3.setDescription("Codigo Cuenta Cotizacion (3)  Administrador");
      cenregadmo.setDescription("Codigo Regimen Administrador");
      cenrcodadmo.setDescription("Codigo Subregimen Administrador");
      cencccart1.setDescription("Codigo Cuenta Cotizacion (1)  Artistas");
      cencccart2.setDescription("Codigo Cuenta Cotizacion (2)  Artistas");
      cencccart3.setDescription("Codigo Cuenta Cotizacion (3)  Artistas");
      cenregart.setDescription("Codigo Regimen  Artistas");
      cenrcodart.setDescription("Codigo Subregimen  Artistas");
      cenccctaur1.setDescription("Codigo Cuenta Cotizacion (1)  Taurino");
      cenccctaur2.setDescription("Codigo Cuenta Cotizacion (2)  Taurino");
      cenccctaur3.setDescription("Codigo Cuenta Cotizacion (3)  Taurino");
      cenregataur.setDescription("Codigo Regimen Taurino");
      cenrcodtaur.setDescription("Codigo Subregimen Taurino");
      cencccrepre1.setDescription("Codigo Cuenta Cotizacion (1) Representantes");
      cencccrepre2.setDescription("Codigo Cuenta Cotizacion (2) Representantes");
      cencccrepre3.setDescription("Codigo Cuenta Cotizacion (3) Representantes");
      cenregrepre.setDescription("Codigo Regimen Representantes");
      cenrcodrepre.setDescription("Codigo Subregimen Representantes");
      cencccfunci1.setDescription("Codigo Cuenta Cotizacion (1)  Funcionarios");
      cencccfunci2.setDescription("Codigo Cuenta Cotizacion (2)  Funcionarios");
      cencccfunci3.setDescription("Codigo Cuenta Cotizacion (3)  Funcionarios");
      cenregfunci.setDescription("Codigo Regimen Funcionarios");
      cenrcodfunci.setDescription("Codigo Subregimen Funcionarios");
      cencccinter1.setDescription("Codigo Cuenta Cotizacion (1)  Fun. Interinos");
      cencccinter2.setDescription("Codigo Cuenta Cotizacion (2)  Fun. Interinos");
      cencccinter3.setDescription("Codigo Cuenta Cotizacion (3)  Fun. Interinos");
      cenreginter.setDescription("Codigo Regimen  Fun. Interinos");
      cenrcodinter.setDescription("Codigo Subregimen Fun. Interinos");
      cencccnuevo1.setDescription("Codigo Cuenta Cotizacion (1)  Fun. Nuevo Ingreso");
      cencccnuevo2.setDescription("Codigo Cuenta Cotizacion (2)  Fun. Nuevo Ingreso");
      cencccnuevo3.setDescription("Codigo Cuenta Cotizacion (3)  Fun. Nuevo Ingreso");
      cenregnuevo.setDescription("Codigo Regimen  Fun. Nuevo Ingreso");
      cenrcodnuevo.setDescription("Codigo Subregimen Fun. Nuevo Ingreso");
      cencccnewin1.setDescription("Codigo Cuenta Cotizacion (1) Fun. Nuevo Ing. Inter.");
      cencccnewin2.setDescription("Codigo Cuenta Cotizacion (2) Fun. Nuevo Ing. Inter.");
      cencccnewin3.setDescription("Codigo Cuenta Cotizacion (3) Fun. Nuevo Ing. Inter.");
      cenregnewin.setDescription("Codigo Regimen  Fun. Nuevo Ing. Inter.");
      cenrcodnewin.setDescription("Codigo Subregimen  Fun. Nuevo Ing. Inter.");
      cenobserva.setDescription("Observaciones");
      cencolabora.setDescription("Colaborador Seg. Social");
      censscnae.setDescription("CNAE DEL CENTRO PARA EL CALCULO DE LOS EPIGRAFES A LA S.S.");
      cenocupasita.setDescription("CODIGO OCUPACION O SITUACION POR DEFECTO DE LOS TRABAJADORES");
      censscnae09.setDescription("CNAE 2009 DEL CENTRO PARA EL CALCULO DE LOS EPIGRAFES A LA S.S.");
      }
    }
    
  public class TabCentrosfor extends TableDef
    {
    // Campos
    public FieldDef cenfcodiemp;
    public FieldDef cenfcentro;
    public FieldDef cenfccc;
    public FieldDef cenfejercicio;
    public FieldDef cenfperiodo;
    public FieldDef cenfproceso;
    public FieldDef cenfimporte;
    public FieldDef cenfdesc;
    public TabCentrosfor(String name)
      {
      super(name);
      cenfcodiemp = new FieldDef("cenfcodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cenfcentro = new FieldDef("cenfcentro",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cenfccc = new FieldDef("cenfccc",FieldDef.CHAR,11,FieldDef.NOTNULL);
      cenfejercicio = new FieldDef("cenfejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cenfperiodo = new FieldDef("cenfperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cenfproceso = new FieldDef("cenfproceso",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cenfimporte = new FieldDef("cenfimporte",FieldDef.FLOAT,6,0);
      cenfdesc = new FieldDef("cenfdesc",FieldDef.CHAR,50);
      FieldDef array[] = {
        cenfcodiemp,
        cenfcentro,
        cenfccc,
        cenfejercicio,
        cenfperiodo,
        cenfproceso,
        cenfimporte,
        cenfdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {cenfcodiemp,cenfcentro,cenfccc,cenfejercicio,cenfperiodo,cenfproceso };
      setPrimaryKeys(arrayf);
      cenfcodiemp.setDescription("Codigo Empresa");
      cenfcentro.setDescription("Codigo centro de Trabajo");
      cenfccc.setDescription("CCC al que pertenece la bonificacion por formacion continua");
      cenfejercicio.setDescription("Ejercicio en que se aplica la bonificacion");
      cenfperiodo.setDescription("Periodo en que se aplica la bonificacion");
      cenfproceso.setDescription("Proceso en que se aplica la bonificacion");
      cenfimporte.setDescription("Importe bonificacion por formacion continua");
      cenfdesc.setDescription("Descripcion formacion recibida");
      }
    }
    
  public class TabCentrosvar extends TableDef
    {
    // Campos
    public FieldDef cevcodiemp;
    public FieldDef cevcodigo;
    public FieldDef cevagranom;
    public FieldDef cevmarmatri;
    public FieldDef cevmarcotiz;
    public FieldDef cevmarnombre;
    public FieldDef cevcodfacnom;
    public FieldDef cevtipojr;
    public FieldDef cevtipopagoagra;
    public TabCentrosvar(String name)
      {
      super(name);
      cevcodiemp = new FieldDef("cevcodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cevcodigo = new FieldDef("cevcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cevagranom = new FieldDef("cevagranom",FieldDef.CHAR,30);
      cevmarmatri = new FieldDef("cevmarmatri",FieldDef.CHAR,15);
      cevmarcotiz = new FieldDef("cevmarcotiz",FieldDef.CHAR,2);
      cevmarnombre = new FieldDef("cevmarnombre",FieldDef.CHAR,40);
      cevcodfacnom = new FieldDef("cevcodfacnom",FieldDef.INTEGER,0);
      cevtipojr = new FieldDef("cevtipojr",FieldDef.INTEGER,0);
      cevtipopagoagra = new FieldDef("cevtipopagoagra",FieldDef.CHAR,1);
      FieldDef array[] = {
        cevcodiemp,
        cevcodigo,
        cevagranom,
        cevmarmatri,
        cevmarcotiz,
        cevmarnombre,
        cevcodfacnom,
        cevtipojr,
        cevtipopagoagra        
        };
      setColumns(array);
      FieldDef arrayf[] = {cevcodiemp,cevcodigo };
      setPrimaryKeys(arrayf);
      cevcodiemp.setDescription("Codigo de enlace");
      cevcodigo.setDescription("Codigo del centro");
      cevagranom.setDescription("Nombre explotacion agraria");
      cevmarmatri.setDescription("Centro Mar: Matricula embarcacion");
      cevmarcotiz.setDescription("Centro Mar: cotizacion");
      cevmarnombre.setDescription("Nombre embarcacion");
      cevcodfacnom.setDescription("Codigo enlace facturación");
      cevtipojr.setDescription("Tipo de Jornadas reales");
      cevtipopagoagra.setDescription("Tipo de cobro Agrarios");
      }
    }
    
  public class TabCentrosexc extends TableDef
    {
    // Campos
    public FieldDef cexcodiemp;
    public FieldDef cexcodigo;
    public FieldDef cexprotecfam;
    public FieldDef cexjubila;
    public FieldDef cexit;
    public FieldDef cexinvalprov;
    public FieldDef cexasistencia;
    public FieldDef cexfarmaceu;
    public FieldDef cexreggral;
    public FieldDef cexdesempleo;
    public FieldDef cexforprofe;
    public FieldDef cexfogasa;
    public FieldDef cexmutua;
    public FieldDef cexaporvolun;
    public FieldDef cexcentrominu;
    public FieldDef cexmedicoemp;
    public FieldDef cexmedicoseg;
    public FieldDef cexitmatern;
    public FieldDef cexreducolab;
    public FieldDef cexflc;
    public FieldDef cexflcextra;
    public FieldDef cexflcasturi;
    public FieldDef cexflcperiod;
    public TabCentrosexc(String name)
      {
      super(name);
      cexcodiemp = new FieldDef("cexcodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cexcodigo = new FieldDef("cexcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cexprotecfam = new FieldDef("cexprotecfam",FieldDef.CHAR,1);
      cexjubila = new FieldDef("cexjubila",FieldDef.CHAR,1);
      cexit = new FieldDef("cexit",FieldDef.CHAR,1);
      cexinvalprov = new FieldDef("cexinvalprov",FieldDef.CHAR,1);
      cexasistencia = new FieldDef("cexasistencia",FieldDef.CHAR,1);
      cexfarmaceu = new FieldDef("cexfarmaceu",FieldDef.CHAR,1);
      cexreggral = new FieldDef("cexreggral",FieldDef.CHAR,1);
      cexdesempleo = new FieldDef("cexdesempleo",FieldDef.CHAR,1);
      cexforprofe = new FieldDef("cexforprofe",FieldDef.CHAR,1);
      cexfogasa = new FieldDef("cexfogasa",FieldDef.CHAR,1);
      cexmutua = new FieldDef("cexmutua",FieldDef.CHAR,1);
      cexaporvolun = new FieldDef("cexaporvolun",FieldDef.CHAR,1);
      cexcentrominu = new FieldDef("cexcentrominu",FieldDef.CHAR,1);
      cexmedicoemp = new FieldDef("cexmedicoemp",FieldDef.CHAR,1);
      cexmedicoseg = new FieldDef("cexmedicoseg",FieldDef.CHAR,1);
      cexitmatern = new FieldDef("cexitmatern",FieldDef.CHAR,1);
      cexreducolab = new FieldDef("cexreducolab",FieldDef.CHAR,1);
      cexflc = new FieldDef("cexflc",FieldDef.CHAR,1);
      cexflcextra = new FieldDef("cexflcextra",FieldDef.CHAR,1);
      cexflcasturi = new FieldDef("cexflcasturi",FieldDef.CHAR,1);
      cexflcperiod = new FieldDef("cexflcperiod",FieldDef.CHAR,1);
      FieldDef array[] = {
        cexcodiemp,
        cexcodigo,
        cexprotecfam,
        cexjubila,
        cexit,
        cexinvalprov,
        cexasistencia,
        cexfarmaceu,
        cexreggral,
        cexdesempleo,
        cexforprofe,
        cexfogasa,
        cexmutua,
        cexaporvolun,
        cexcentrominu,
        cexmedicoemp,
        cexmedicoseg,
        cexitmatern,
        cexreducolab,
        cexflc,
        cexflcextra,
        cexflcasturi,
        cexflcperiod        
        };
      setColumns(array);
      FieldDef arrayf[] = {cexcodiemp,cexcodigo };
      setPrimaryKeys(arrayf);
      cexcodiemp.setDescription("Codigo de enlace");
      cexcodigo.setDescription("Codigo centro");
      cexprotecfam.setDescription("Exclusion de cotizacion por proteccion familiar");
      cexjubila.setDescription("Exclusion de cotizacion por jubilacion");
      cexit.setDescription("Exclusion de cotizacion por it");
      cexinvalprov.setDescription("Exclusion de cotizacion por invalidez provisional");
      cexasistencia.setDescription("Exclusion de cotizacion por asistencia sanitaria");
      cexfarmaceu.setDescription("Exclusion de cotizacion por prestacion farmaceutica");
      cexreggral.setDescription("Exclusion de cotizacion por regimen general");
      cexdesempleo.setDescription("Exclusion de cotizacion por desempleo");
      cexforprofe.setDescription("Exclusion de cotizacion por formacion profesional");
      cexfogasa.setDescription("Exclusion de cotizacion por fogasa");
      cexmutua.setDescription("Exclusion de cotizacion por mutua accidentes");
      cexaporvolun.setDescription("Exclusion de cotizacion por aportacióo voluntaria accidentes trabajo");
      cexcentrominu.setDescription("Exclusion de cotizacion por centros especiales minusvalidos");
      cexmedicoemp.setDescription("Empresas colaboradoras con la seguridad social : Honorarios medicos a cargo empresa");
      cexmedicoseg.setDescription("Empresas colaboradoras con la seguridad social : Honorarios medicos a cargo seguridad social");
      cexitmatern.setDescription("Empresas colaboradoras con la seguridad social : Exclusivamente en it y maternidad");
      cexreducolab.setDescription("Reduccion de la entidad colaboradora seguridad social");
      cexflc.setDescription("FLC normal");
      cexflcextra.setDescription("FLC extraordinario");
      cexflcasturi.setDescription("FLC asturias");
      cexflcperiod.setDescription("FLC Periodicidad");
      }
    }
    
  public class TabCendpto extends TableDef
    {
    // Campos
    public FieldDef cedcodiemp;
    public FieldDef cedcodigo;
    public FieldDef cedptocodi;
    public FieldDef cedptonom;
    public FieldDef cedenlcta;
    public FieldDef cedsubcta;
    public FieldDef cedcbanccta;
    public FieldDef cedsbanccta;
    public TabCendpto(String name)
      {
      super(name);
      cedcodiemp = new FieldDef("cedcodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cedcodigo = new FieldDef("cedcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cedptocodi = new FieldDef("cedptocodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cedptonom = new FieldDef("cedptonom",FieldDef.CHAR,30);
      cedenlcta = new FieldDef("cedenlcta",FieldDef.INTEGER,0);
      cedsubcta = new FieldDef("cedsubcta",FieldDef.CHAR,12);
      cedcbanccta = new FieldDef("cedcbanccta",FieldDef.CHAR,4);
      cedsbanccta = new FieldDef("cedsbanccta",FieldDef.CHAR,12);
      FieldDef array[] = {
        cedcodiemp,
        cedcodigo,
        cedptocodi,
        cedptonom,
        cedenlcta,
        cedsubcta,
        cedcbanccta,
        cedsbanccta        
        };
      setColumns(array);
      FieldDef arrayf[] = {cedcodiemp,cedcodigo,cedptocodi };
      setPrimaryKeys(arrayf);
      cedcodiemp.setDescription("Codigo Empresa");
      cedcodigo.setDescription("Codigo Departamento");
      cedptocodi.setDescription("Codigo Departamento");
      cedptonom.setDescription("Nombre Departamento");
      }
    }
    
  public class TabCendbancos extends TableDef
    {
    // Campos
    public FieldDef cebcodiemp;
    public FieldDef cebcodigo;
    public FieldDef cebpago;
    public FieldDef cebbanco;
    public FieldDef cebsucursal;
    public FieldDef cebnumero;
    public FieldDef cebdigito;
    public FieldDef cebpagoss;
    public FieldDef cebtipoidenttit;
    public FieldDef ceboidenttit;
    public FieldDef cebonomtit;
    public FieldDef cebdomiirpf;
    public FieldDef cebventanass;
    public FieldDef cebdesactivado;
    public TabCendbancos(String name)
      {
      super(name);
      cebcodiemp = new FieldDef("cebcodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cebcodigo = new FieldDef("cebcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cebpago = new FieldDef("cebpago",FieldDef.CHAR,5);
      cebbanco = new FieldDef("cebbanco",FieldDef.CHAR,4);
      cebsucursal = new FieldDef("cebsucursal",FieldDef.CHAR,4);
      cebnumero = new FieldDef("cebnumero",FieldDef.CHAR,10);
      cebdigito = new FieldDef("cebdigito",FieldDef.CHAR,2);
      cebpagoss = new FieldDef("cebpagoss",FieldDef.CHAR,1);
      cebtipoidenttit = new FieldDef("cebtipoidenttit",FieldDef.CHAR,1);
      ceboidenttit = new FieldDef("ceboidenttit",FieldDef.CHAR,15);
      cebonomtit = new FieldDef("cebonomtit",FieldDef.CHAR,30);
      cebdomiirpf = new FieldDef("cebdomiirpf",FieldDef.CHAR,1);
      cebventanass = new FieldDef("cebventanass",FieldDef.CHAR,1);
      cebdesactivado = new FieldDef("cebdesactivado",FieldDef.CHAR,1);
      FieldDef array[] = {
        cebcodiemp,
        cebcodigo,
        cebpago,
        cebbanco,
        cebsucursal,
        cebnumero,
        cebdigito,
        cebpagoss,
        cebtipoidenttit,
        ceboidenttit,
        cebonomtit,
        cebdomiirpf,
        cebventanass,
        cebdesactivado        
        };
      setColumns(array);
      FieldDef arrayf[] = {cebcodiemp,cebcodigo,cebpago };
      setPrimaryKeys(arrayf);
      cebcodiemp.setDescription("Codigo Empresa");
      cebcodigo.setDescription("Codigo registro");
      cebpago.setDescription("Codigo del Pago");
      cebbanco.setDescription("Numero Banco");
      cebsucursal.setDescription("Numero Sucursal");
      cebnumero.setDescription("Numero de Cuenta");
      cebdigito.setDescription("Digito de Control");
      cebpagoss.setDescription("Pago seg. Social");
      cebtipoidenttit.setDescription("Tipo Identificacion Titular");
      ceboidenttit.setDescription("Numero Identificacion Titular");
      cebonomtit.setDescription("Nombre Titular");
      }
    }
    
  public class TabEstado extends TableDef
    {
    // Campos
    public FieldDef estcodiemp;
    public FieldDef estusuario;
    public FieldDef estejercicio;
    public FieldDef estperiodo;
    public TabEstado(String name)
      {
      super(name);
      estcodiemp = new FieldDef("estcodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      estusuario = new FieldDef("estusuario",FieldDef.CHAR,20);
      estejercicio = new FieldDef("estejercicio",FieldDef.INTEGER,0);
      estperiodo = new FieldDef("estperiodo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        estcodiemp,
        estusuario,
        estejercicio,
        estperiodo        
        };
      setColumns(array);
      FieldDef arrayf[] = {estcodiemp,estusuario };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTrabajador extends TableDef
    {
    // Campos
    public FieldDef tracodiemp;
    public FieldDef tracodigo;
    public FieldDef tranif;
    public FieldDef tranombre;
    public FieldDef tranaf1;
    public FieldDef tranaf2;
    public FieldDef tranaf3;
    public FieldDef tranacimien;
    public FieldDef trarecibos;
    public FieldDef trapagas;
    public FieldDef traatrasos;
    public FieldDef tracolectivo;
    public FieldDef tracentro;
    public FieldDef tradpto;
    public FieldDef trapuesto;
    public FieldDef traregimenss;
    public FieldDef traregcodi;
    public FieldDef traexcl65;
    public FieldDef traestadociv;
    public FieldDef trasexo;
    public FieldDef traporminus;
    public FieldDef trasitufamil;
    public FieldDef trafecaltass;
    public FieldDef trafecaltaemp;
    public FieldDef trafecbaja;
    public FieldDef trafecantig;
    public FieldDef trafeccalantig;
    public FieldDef trafeccalpagas;
    public FieldDef trafecamcat;
    public FieldDef trafeconantig;
    public FieldDef traexconcep;
    public FieldDef tramesdia;
    public FieldDef traformacob;
    public FieldDef trabcoempbco;
    public FieldDef trabcoempsuc;
    public FieldDef trabcoempnum;
    public FieldDef trabcoempdc;
    public FieldDef trabcotrabco1;
    public FieldDef trabcotrasuc1;
    public FieldDef trabcotranum1;
    public FieldDef trabcotradc1;
    public FieldDef trabcotrabco2;
    public FieldDef trabcotrasuc2;
    public FieldDef trabcotranum2;
    public FieldDef trabcotradc2;
    public FieldDef trabdesti2;
    public FieldDef trabimporbco2;
    public FieldDef trabgarantia;
    public FieldDef trabdtopagas;
    public FieldDef traobserva;
    public FieldDef traenlace;
    public FieldDef trarelacion;
    public FieldDef tradatamovgeo;
    public FieldDef tranivforma;
    public FieldDef traacademico;
    public FieldDef tradircurric;
    public FieldDef tradirfoto;
    public FieldDef trareducida;
    public FieldDef tradesti2nif;
    public FieldDef tracomunitario;
    public FieldDef trafecamantig;
    public FieldDef tractacentro;
    public FieldDef traidioma;
    public FieldDef tranoresidente;
    public FieldDef tratipopagoagra;
    public FieldDef trafecinipermi;
    public FieldDef trafecfinpermi;
    public FieldDef trafeclibre1;
    public FieldDef tracodiaux;
    public FieldDef traexcluportem;
    public FieldDef trasubcta;
    public FieldDef trabanccen;
    public FieldDef tractainactiv;
    public TabTrabajador(String name)
      {
      super(name);
      tracodiemp = new FieldDef("tracodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tracodigo = new FieldDef("tracodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tranif = new FieldDef("tranif",FieldDef.CHAR,15);
      tranombre = new FieldDef("tranombre",FieldDef.CHAR,50);
      tranaf1 = new FieldDef("tranaf1",FieldDef.INTEGER,0);
      tranaf2 = new FieldDef("tranaf2",FieldDef.INTEGER,0);
      tranaf3 = new FieldDef("tranaf3",FieldDef.INTEGER,0);
      tranacimien = new FieldDef("tranacimien",FieldDef.DATE);
      trarecibos = new FieldDef("trarecibos",FieldDef.CHAR,1);
      trapagas = new FieldDef("trapagas",FieldDef.CHAR,1);
      traatrasos = new FieldDef("traatrasos",FieldDef.CHAR,1);
      tracolectivo = new FieldDef("tracolectivo",FieldDef.INTEGER,0);
      tracentro = new FieldDef("tracentro",FieldDef.INTEGER,0);
      tradpto = new FieldDef("tradpto",FieldDef.INTEGER,0);
      trapuesto = new FieldDef("trapuesto",FieldDef.CHAR,30);
      traregimenss = new FieldDef("traregimenss",FieldDef.INTEGER,0);
      traregcodi = new FieldDef("traregcodi",FieldDef.INTEGER,0);
      traexcl65 = new FieldDef("traexcl65",FieldDef.CHAR,1);
      traestadociv = new FieldDef("traestadociv",FieldDef.CHAR,1);
      trasexo = new FieldDef("trasexo",FieldDef.CHAR,1);
      traporminus = new FieldDef("traporminus",FieldDef.FLOAT,6,0);
      trasitufamil = new FieldDef("trasitufamil",FieldDef.CHAR,1);
      trafecaltass = new FieldDef("trafecaltass",FieldDef.DATE);
      trafecaltaemp = new FieldDef("trafecaltaemp",FieldDef.DATE);
      trafecbaja = new FieldDef("trafecbaja",FieldDef.DATE);
      trafecantig = new FieldDef("trafecantig",FieldDef.DATE);
      trafeccalantig = new FieldDef("trafeccalantig",FieldDef.DATE);
      trafeccalpagas = new FieldDef("trafeccalpagas",FieldDef.DATE);
      trafecamcat = new FieldDef("trafecamcat",FieldDef.DATE);
      trafeconantig = new FieldDef("trafeconantig",FieldDef.DATE);
      traexconcep = new FieldDef("traexconcep",FieldDef.CHAR,1);
      tramesdia = new FieldDef("tramesdia",FieldDef.CHAR,1);
      traformacob = new FieldDef("traformacob",FieldDef.CHAR,2);
      trabcoempbco = new FieldDef("trabcoempbco",FieldDef.CHAR,4);
      trabcoempsuc = new FieldDef("trabcoempsuc",FieldDef.CHAR,4);
      trabcoempnum = new FieldDef("trabcoempnum",FieldDef.CHAR,10);
      trabcoempdc = new FieldDef("trabcoempdc",FieldDef.CHAR,2);
      trabcotrabco1 = new FieldDef("trabcotrabco1",FieldDef.CHAR,4);
      trabcotrasuc1 = new FieldDef("trabcotrasuc1",FieldDef.CHAR,4);
      trabcotranum1 = new FieldDef("trabcotranum1",FieldDef.CHAR,10);
      trabcotradc1 = new FieldDef("trabcotradc1",FieldDef.CHAR,2);
      trabcotrabco2 = new FieldDef("trabcotrabco2",FieldDef.CHAR,4);
      trabcotrasuc2 = new FieldDef("trabcotrasuc2",FieldDef.CHAR,4);
      trabcotranum2 = new FieldDef("trabcotranum2",FieldDef.CHAR,10);
      trabcotradc2 = new FieldDef("trabcotradc2",FieldDef.CHAR,2);
      trabdesti2 = new FieldDef("trabdesti2",FieldDef.CHAR,40);
      trabimporbco2 = new FieldDef("trabimporbco2",FieldDef.FLOAT,6,0);
      trabgarantia = new FieldDef("trabgarantia",FieldDef.CHAR,1);
      trabdtopagas = new FieldDef("trabdtopagas",FieldDef.CHAR,1);
      traobserva = new FieldDef("traobserva",FieldDef.CHAR,2000);
      traenlace = new FieldDef("traenlace",FieldDef.INTEGER,0);
      trarelacion = new FieldDef("trarelacion",FieldDef.INTEGER,0);
      tradatamovgeo = new FieldDef("tradatamovgeo",FieldDef.DATE);
      tranivforma = new FieldDef("tranivforma",FieldDef.INTEGER,0);
      traacademico = new FieldDef("traacademico",FieldDef.INTEGER,0);
      tradircurric = new FieldDef("tradircurric",FieldDef.CHAR,100);
      tradirfoto = new FieldDef("tradirfoto",FieldDef.CHAR,100);
      trareducida = new FieldDef("trareducida",FieldDef.CHAR,1);
      tradesti2nif = new FieldDef("tradesti2nif",FieldDef.CHAR,15);
      tracomunitario = new FieldDef("tracomunitario",FieldDef.CHAR,1);
      trafecamantig = new FieldDef("trafecamantig",FieldDef.DATE);
      tractacentro = new FieldDef("tractacentro",FieldDef.CHAR,5);
      traidioma = new FieldDef("traidioma",FieldDef.INTEGER,0);
      tranoresidente = new FieldDef("tranoresidente",FieldDef.CHAR,1);
      tratipopagoagra = new FieldDef("tratipopagoagra",FieldDef.CHAR,1);
      trafecinipermi = new FieldDef("trafecinipermi",FieldDef.DATE);
      trafecfinpermi = new FieldDef("trafecfinpermi",FieldDef.DATE);
      trafeclibre1 = new FieldDef("trafeclibre1",FieldDef.DATE);
      tracodiaux = new FieldDef("tracodiaux",FieldDef.CHAR,30);
      traexcluportem = new FieldDef("traexcluportem",FieldDef.CHAR,1);
      trasubcta = new FieldDef("trasubcta",FieldDef.CHAR,12);
      trabanccen = new FieldDef("trabanccen",FieldDef.CHAR,5);
      tractainactiv = new FieldDef("tractainactiv",FieldDef.CHAR,1);
      FieldDef array[] = {
        tracodiemp,
        tracodigo,
        tranif,
        tranombre,
        tranaf1,
        tranaf2,
        tranaf3,
        tranacimien,
        trarecibos,
        trapagas,
        traatrasos,
        tracolectivo,
        tracentro,
        tradpto,
        trapuesto,
        traregimenss,
        traregcodi,
        traexcl65,
        traestadociv,
        trasexo,
        traporminus,
        trasitufamil,
        trafecaltass,
        trafecaltaemp,
        trafecbaja,
        trafecantig,
        trafeccalantig,
        trafeccalpagas,
        trafecamcat,
        trafeconantig,
        traexconcep,
        tramesdia,
        traformacob,
        trabcoempbco,
        trabcoempsuc,
        trabcoempnum,
        trabcoempdc,
        trabcotrabco1,
        trabcotrasuc1,
        trabcotranum1,
        trabcotradc1,
        trabcotrabco2,
        trabcotrasuc2,
        trabcotranum2,
        trabcotradc2,
        trabdesti2,
        trabimporbco2,
        trabgarantia,
        trabdtopagas,
        traobserva,
        traenlace,
        trarelacion,
        tradatamovgeo,
        tranivforma,
        traacademico,
        tradircurric,
        tradirfoto,
        trareducida,
        tradesti2nif,
        tracomunitario,
        trafecamantig,
        tractacentro,
        traidioma,
        tranoresidente,
        tratipopagoagra,
        trafecinipermi,
        trafecfinpermi,
        trafeclibre1,
        tracodiaux,
        traexcluportem,
        trasubcta,
        trabanccen,
        tractainactiv        
        };
      setColumns(array);
      FieldDef arrayf[] = {tracodiemp,tracodigo };
      setPrimaryKeys(arrayf);
      tracodiemp.setDescription("Codigo Empresa");
      tracodigo.setDescription("Codigo Trabajador");
      tranif.setDescription("NIF Trabajador");
      tranombre.setDescription("Nombre");
      tranaf1.setDescription("Numero Afiliacion Seg. Soc (1)");
      tranaf2.setDescription("Numero Afiliacion Seg. Soc (1)");
      tranaf3.setDescription("Numero Afiliacion Seg. Soc (1)");
      tranacimien.setDescription("Fecha Nacimiento");
      trarecibos.setDescription("Recibos de salario");
      trapagas.setDescription("Pagas Extras");
      traatrasos.setDescription("Atrasos Convenio");
      tracolectivo.setDescription("Codigo Colectivo");
      tracentro.setDescription("Centro de Trabajo");
      tradpto.setDescription("Departamento");
      trapuesto.setDescription("Puesto de Trabajo");
      traregimenss.setDescription("Regimen Seg. Soc.");
      traregcodi.setDescription("Subregimen");
      traexcl65.setDescription("Exclusion Cotizacion > 65 a¤os");
      traestadociv.setDescription("Estado Civil");
      trasexo.setDescription("Sexo");
      traporminus.setDescription("Porcentaje Minusvalia");
      trasitufamil.setDescription("Situacion Familiar");
      trafecaltass.setDescription("Fecha Alta Seg. Soc.");
      trafecaltaemp.setDescription("Fecha Alta Empresa");
      trafecbaja.setDescription("Fecha Baja Empresa");
      trafecantig.setDescription("Fecha Antiguedad");
      trafeccalantig.setDescription("Fecha Calculo Antiguedad");
      trafeccalpagas.setDescription("Fecha calculo pagas extras");
      trafecamcat.setDescription("Fecha Cambio Categoria");
      trafeconantig.setDescription("Fecha consolidacion Antiguedad");
      traexconcep.setDescription("Exclusion Conceptos retribucion categoria");
      tramesdia.setDescription("Mensual-Diario");
      traformacob.setDescription("Forma de Cobro");
      trabcoempbco.setDescription("Numero de Banco de pago de la Empresa.");
      trabcoempsuc.setDescription("Numero Sucursal de pago de la Empresa.");
      trabcoempnum.setDescription("Numero Cuenta de pago de la Empresa.");
      trabcoempdc.setDescription("Digito Control de pago de la Empresa.");
      trabcotrabco1.setDescription("Numero de Banco para primer importe Transfer.");
      trabcotrasuc1.setDescription("Numero Sucursal para primer importe Transfer.");
      trabcotranum1.setDescription("Numero Cuenta para primer importe Transfer.");
      trabcotradc1.setDescription("Digito Control para primer importe Transfer.");
      trabcotrabco2.setDescription("Numero de Banco para segundo importe Transfer.");
      trabcotrasuc2.setDescription("Numero Sucursal para segundo importe Transfer.");
      trabcotranum2.setDescription("Numero Cuenta para segundo importe Transfer.");
      trabcotradc2.setDescription("Digito Control para segundo importe Transfer.");
      trabdesti2.setDescription("Destinatario  Transferencia");
      trabimporbco2.setDescription("Importe de la Transferencia");
      trabgarantia.setDescription("Garantia Empresa IT's");
      trabdtopagas.setDescription("Descuento en Pagas de IT's");
      traobserva.setDescription("Observaciones");
      traenlace.setDescription("Codigo Enlace");
      trarelacion.setDescription("Codigo Relacion Tracontrato");
      tradatamovgeo.setDescription("Fecha Movilidad Geografica");
      tranivforma.setDescription("Nivel de Formacion");
      traacademico.setDescription("Titulo Academico");
      tradircurric.setDescription("Direccion disco de Curriculum");
      tradirfoto.setDescription("Direccion disco de Foto");
      trareducida.setDescription("Movilidad Reducida");
      tradesti2nif.setDescription("Nif Destinatario Transferencia");
      tracomunitario.setDescription("Trabajador Comunitario");
      trafecamantig.setDescription("Fecha cambio Antiguedad");
      tractacentro.setDescription("Cuenta Corriente Centro");
      traidioma.setDescription("Idioma Documentos trabajador");
      tranoresidente.setDescription("Trabajador extranjero no comunitario");
      tratipopagoagra.setDescription("Tipo de cobro Agrarios");
      trafecinipermi.setDescription("Fecha Inicio Permiso de trabajo");
      trafecfinpermi.setDescription("Fecha caducidad permiso de trabajo");
      trafeclibre1.setDescription("Fecha Libre 1");
      tracodiaux.setDescription("Codigo Trabajador Auxiliar");
      traexcluportem.setDescription("Trabajador Excluido de EPORTEM");
      }
    }
    
  public class TabTracontrato extends TableDef
    {
    // Campos
    public FieldDef trccodiemp;
    public FieldDef trccodigo;
    public FieldDef trcrelacion;
    public FieldDef trccausa;
    public FieldDef trciniciocto;
    public FieldDef trcfincto;
    public FieldDef trcconvenio;
    public FieldDef trccodicat;
    public FieldDef trcdescrcat;
    public FieldDef trctarifa;
    public FieldDef trcepigraf;
    public FieldDef trcclauirpf;
    public FieldDef trcporirpf;
    public FieldDef trctipoirpf;
    public FieldDef trccodicto;
    public FieldDef trcconclavescon;
    public FieldDef trcnumctoinem;
    public FieldDef trcdatreginem;
    public FieldDef trcduracto;
    public FieldDef trchorasjorn;
    public FieldDef trcparcial;
    public FieldDef trcdiashoras;
    public FieldDef trcporreduc;
    public FieldDef trcdias;
    public FieldDef trchoras;
    public FieldDef trclunesdia;
    public FieldDef trcluneshor;
    public FieldDef trcmartdia;
    public FieldDef trcmarthor;
    public FieldDef trcmierdia;
    public FieldDef trcmierhor;
    public FieldDef trcjuevdia;
    public FieldDef trcjuevhor;
    public FieldDef trcvierndia;
    public FieldDef trcviernhor;
    public FieldDef trcsabdia;
    public FieldDef trcsabhor;
    public FieldDef trcdomdia;
    public FieldDef trcdomhor;
    public FieldDef trcfestivos;
    public FieldDef trcfestivho;
    public FieldDef trcpluri;
    public FieldDef trcbasespor;
    public FieldDef trcporcen;
    public FieldDef trcbasmaxcom;
    public FieldDef trcbasmincom;
    public FieldDef trcbasmaxacc;
    public FieldDef trcbasminacc;
    public FieldDef trcformacio;
    public FieldDef trchorasdis;
    public FieldDef trchoraspre;
    public FieldDef trcparcialred;
    public FieldDef trcinterinid;
    public FieldDef trcsusti;
    public FieldDef trcbaseauton;
    public FieldDef trccontrata;
    public FieldDef trccno;
    public FieldDef trccnoinem;
    public FieldDef trcdespido;
    public FieldDef trcdescolec;
    public FieldDef trcsistespec;
    public FieldDef trcdiasistesp;
    public FieldDef trccoefperm;
    public FieldDef trccondidesem;
    public FieldDef trcmujersubre;
    public FieldDef trcincapacita;
    public FieldDef trcexclusion;
    public FieldDef trcprimerauto;
    public FieldDef trcfomconind;
    public FieldDef trcrelespecia;
    public FieldDef trccoditrasus;
    public FieldDef trcnafsusti1;
    public FieldDef trcnafsusti2;
    public FieldDef trcnafsusti3;
    public FieldDef trccausasus;
    public FieldDef trcsubroga;
    public FieldDef trcrentainse;
    public FieldDef trcalumbra;
    public FieldDef trccobrosub;
    public FieldDef trcredcalif;
    public FieldDef trcredhorcona;
    public FieldDef trcredhorconv;
    public FieldDef trcredperdias;
    public FieldDef trcempett;
    public FieldDef trctipoinac;
    public FieldDef trccodcontpro;
    public FieldDef trcconclavespro;
    public FieldDef trcfecinipro;
    public FieldDef trcfecfinpro;
    public FieldDef trcdircontra;
    public FieldDef trcdirprorro;
    public FieldDef trcdirfiniq;
    public FieldDef trccontingente;
    public FieldDef trcdircertie;
    public FieldDef trcdirdcljur;
    public FieldDef trcdircertif;
    public FieldDef trcfecfinvac;
    public FieldDef trcsscnae;
    public FieldDef trcocupasita;
    public FieldDef trcfecantig;
    public FieldDef trcfeccalantig;
    public FieldDef trcfeccalpagas;
    public FieldDef trccausaexcagra;
    public FieldDef trctipojor1;
    public FieldDef trcdiasjor1;
    public FieldDef trcinijor1;
    public FieldDef trcfinjor1;
    public FieldDef trctipojor2;
    public FieldDef trcdiasjor2;
    public FieldDef trcinijor2;
    public FieldDef trcfinjor2;
    public FieldDef trctipojor3;
    public FieldDef trcdiasjor3;
    public FieldDef trcinijor3;
    public FieldDef trcfinjor3;
    public FieldDef trctipojor4;
    public FieldDef trcdiasjor4;
    public FieldDef trcinijor4;
    public FieldDef trcfinjor4;
    public FieldDef trccolectra;
    public FieldDef trccampuestra;
    public FieldDef trcconvofic;
    public FieldDef trctipfijodis;
    public FieldDef trcsscnae09;
    public FieldDef trcfecfiprueba;
    public FieldDef trctipocotagra;
    public FieldDef trctipobonagra;
    public TabTracontrato(String name)
      {
      super(name);
      trccodiemp = new FieldDef("trccodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trccodigo = new FieldDef("trccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trcrelacion = new FieldDef("trcrelacion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trccausa = new FieldDef("trccausa",FieldDef.CHAR,50);
      trciniciocto = new FieldDef("trciniciocto",FieldDef.DATE);
      trcfincto = new FieldDef("trcfincto",FieldDef.DATE);
      trcconvenio = new FieldDef("trcconvenio",FieldDef.INTEGER,0);
      trccodicat = new FieldDef("trccodicat",FieldDef.INTEGER,0);
      trcdescrcat = new FieldDef("trcdescrcat",FieldDef.CHAR,20);
      trctarifa = new FieldDef("trctarifa",FieldDef.INTEGER,0);
      trcepigraf = new FieldDef("trcepigraf",FieldDef.INTEGER,0);
      trcclauirpf = new FieldDef("trcclauirpf",FieldDef.CHAR,3);
      trcporirpf = new FieldDef("trcporirpf",FieldDef.FLOAT,6,0);
      trctipoirpf = new FieldDef("trctipoirpf",FieldDef.CHAR,1);
      trccodicto = new FieldDef("trccodicto",FieldDef.INTEGER,0);
      trcconclavescon = new FieldDef("trcconclavescon",FieldDef.INTEGER,0);
      trcnumctoinem = new FieldDef("trcnumctoinem",FieldDef.INTEGER,0);
      trcdatreginem = new FieldDef("trcdatreginem",FieldDef.DATE);
      trcduracto = new FieldDef("trcduracto",FieldDef.CHAR,1);
      trchorasjorn = new FieldDef("trchorasjorn",FieldDef.FLOAT,6,0);
      trcparcial = new FieldDef("trcparcial",FieldDef.CHAR,1);
      trcdiashoras = new FieldDef("trcdiashoras",FieldDef.CHAR,1);
      trcporreduc = new FieldDef("trcporreduc",FieldDef.FLOAT,6,0);
      trcdias = new FieldDef("trcdias",FieldDef.FLOAT,6,0);
      trchoras = new FieldDef("trchoras",FieldDef.FLOAT,6,0);
      trclunesdia = new FieldDef("trclunesdia",FieldDef.CHAR,1);
      trcluneshor = new FieldDef("trcluneshor",FieldDef.FLOAT,6,0);
      trcmartdia = new FieldDef("trcmartdia",FieldDef.CHAR,1);
      trcmarthor = new FieldDef("trcmarthor",FieldDef.FLOAT,6,0);
      trcmierdia = new FieldDef("trcmierdia",FieldDef.CHAR,1);
      trcmierhor = new FieldDef("trcmierhor",FieldDef.FLOAT,6,0);
      trcjuevdia = new FieldDef("trcjuevdia",FieldDef.CHAR,1);
      trcjuevhor = new FieldDef("trcjuevhor",FieldDef.FLOAT,6,0);
      trcvierndia = new FieldDef("trcvierndia",FieldDef.CHAR,1);
      trcviernhor = new FieldDef("trcviernhor",FieldDef.FLOAT,6,0);
      trcsabdia = new FieldDef("trcsabdia",FieldDef.CHAR,1);
      trcsabhor = new FieldDef("trcsabhor",FieldDef.FLOAT,6,0);
      trcdomdia = new FieldDef("trcdomdia",FieldDef.CHAR,1);
      trcdomhor = new FieldDef("trcdomhor",FieldDef.FLOAT,6,0);
      trcfestivos = new FieldDef("trcfestivos",FieldDef.CHAR,1);
      trcfestivho = new FieldDef("trcfestivho",FieldDef.FLOAT,6,0);
      trcpluri = new FieldDef("trcpluri",FieldDef.CHAR,1);
      trcbasespor = new FieldDef("trcbasespor",FieldDef.CHAR,1);
      trcporcen = new FieldDef("trcporcen",FieldDef.FLOAT,6,0);
      trcbasmaxcom = new FieldDef("trcbasmaxcom",FieldDef.FLOAT,6,0);
      trcbasmincom = new FieldDef("trcbasmincom",FieldDef.FLOAT,6,0);
      trcbasmaxacc = new FieldDef("trcbasmaxacc",FieldDef.FLOAT,6,0);
      trcbasminacc = new FieldDef("trcbasminacc",FieldDef.FLOAT,6,0);
      trcformacio = new FieldDef("trcformacio",FieldDef.CHAR,1);
      trchorasdis = new FieldDef("trchorasdis",FieldDef.FLOAT,6,0);
      trchoraspre = new FieldDef("trchoraspre",FieldDef.FLOAT,6,0);
      trcparcialred = new FieldDef("trcparcialred",FieldDef.CHAR,1);
      trcinterinid = new FieldDef("trcinterinid",FieldDef.CHAR,1);
      trcsusti = new FieldDef("trcsusti",FieldDef.CHAR,1);
      trcbaseauton = new FieldDef("trcbaseauton",FieldDef.FLOAT,6,0);
      trccontrata = new FieldDef("trccontrata",FieldDef.CHAR,16);
      trccno = new FieldDef("trccno",FieldDef.CHAR,4);
      trccnoinem = new FieldDef("trccnoinem",FieldDef.CHAR,8);
      trcdespido = new FieldDef("trcdespido",FieldDef.CHAR,1);
      trcdescolec = new FieldDef("trcdescolec",FieldDef.INTEGER,0);
      trcsistespec = new FieldDef("trcsistespec",FieldDef.CHAR,50);
      trcdiasistesp = new FieldDef("trcdiasistesp",FieldDef.INTEGER,0);
      trccoefperm = new FieldDef("trccoefperm",FieldDef.FLOAT,6,0);
      trccondidesem = new FieldDef("trccondidesem",FieldDef.CHAR,2);
      trcmujersubre = new FieldDef("trcmujersubre",FieldDef.CHAR,1);
      trcincapacita = new FieldDef("trcincapacita",FieldDef.CHAR,1);
      trcexclusion = new FieldDef("trcexclusion",FieldDef.CHAR,1);
      trcprimerauto = new FieldDef("trcprimerauto",FieldDef.CHAR,1);
      trcfomconind = new FieldDef("trcfomconind",FieldDef.CHAR,1);
      trcrelespecia = new FieldDef("trcrelespecia",FieldDef.CHAR,4);
      trccoditrasus = new FieldDef("trccoditrasus",FieldDef.INTEGER,0);
      trcnafsusti1 = new FieldDef("trcnafsusti1",FieldDef.CHAR,2);
      trcnafsusti2 = new FieldDef("trcnafsusti2",FieldDef.CHAR,8);
      trcnafsusti3 = new FieldDef("trcnafsusti3",FieldDef.CHAR,2);
      trccausasus = new FieldDef("trccausasus",FieldDef.CHAR,4);
      trcsubroga = new FieldDef("trcsubroga",FieldDef.CHAR,1);
      trcrentainse = new FieldDef("trcrentainse",FieldDef.CHAR,1);
      trcalumbra = new FieldDef("trcalumbra",FieldDef.CHAR,1);
      trccobrosub = new FieldDef("trccobrosub",FieldDef.CHAR,1);
      trcredcalif = new FieldDef("trcredcalif",FieldDef.CHAR,2);
      trcredhorcona = new FieldDef("trcredhorcona",FieldDef.FLOAT,6,0);
      trcredhorconv = new FieldDef("trcredhorconv",FieldDef.FLOAT,6,0);
      trcredperdias = new FieldDef("trcredperdias",FieldDef.INTEGER,0);
      trcempett = new FieldDef("trcempett",FieldDef.CHAR,1);
      trctipoinac = new FieldDef("trctipoinac",FieldDef.CHAR,1);
      trccodcontpro = new FieldDef("trccodcontpro",FieldDef.INTEGER,0);
      trcconclavespro = new FieldDef("trcconclavespro",FieldDef.INTEGER,0);
      trcfecinipro = new FieldDef("trcfecinipro",FieldDef.DATE);
      trcfecfinpro = new FieldDef("trcfecfinpro",FieldDef.DATE);
      trcdircontra = new FieldDef("trcdircontra",FieldDef.CHAR,100);
      trcdirprorro = new FieldDef("trcdirprorro",FieldDef.CHAR,100);
      trcdirfiniq = new FieldDef("trcdirfiniq",FieldDef.CHAR,100);
      trccontingente = new FieldDef("trccontingente",FieldDef.CHAR,1);
      trcdircertie = new FieldDef("trcdircertie",FieldDef.CHAR,100);
      trcdirdcljur = new FieldDef("trcdirdcljur",FieldDef.CHAR,100);
      trcdircertif = new FieldDef("trcdircertif",FieldDef.CHAR,100);
      trcfecfinvac = new FieldDef("trcfecfinvac",FieldDef.DATE);
      trcsscnae = new FieldDef("trcsscnae",FieldDef.CHAR,7);
      trcocupasita = new FieldDef("trcocupasita",FieldDef.CHAR,1);
      trcfecantig = new FieldDef("trcfecantig",FieldDef.DATE);
      trcfeccalantig = new FieldDef("trcfeccalantig",FieldDef.DATE);
      trcfeccalpagas = new FieldDef("trcfeccalpagas",FieldDef.DATE);
      trccausaexcagra = new FieldDef("trccausaexcagra",FieldDef.CHAR,1);
      trctipojor1 = new FieldDef("trctipojor1",FieldDef.CHAR,2);
      trcdiasjor1 = new FieldDef("trcdiasjor1",FieldDef.INTEGER,0);
      trcinijor1 = new FieldDef("trcinijor1",FieldDef.DATE);
      trcfinjor1 = new FieldDef("trcfinjor1",FieldDef.DATE);
      trctipojor2 = new FieldDef("trctipojor2",FieldDef.CHAR,2);
      trcdiasjor2 = new FieldDef("trcdiasjor2",FieldDef.INTEGER,0);
      trcinijor2 = new FieldDef("trcinijor2",FieldDef.DATE);
      trcfinjor2 = new FieldDef("trcfinjor2",FieldDef.DATE);
      trctipojor3 = new FieldDef("trctipojor3",FieldDef.CHAR,2);
      trcdiasjor3 = new FieldDef("trcdiasjor3",FieldDef.INTEGER,0);
      trcinijor3 = new FieldDef("trcinijor3",FieldDef.DATE);
      trcfinjor3 = new FieldDef("trcfinjor3",FieldDef.DATE);
      trctipojor4 = new FieldDef("trctipojor4",FieldDef.CHAR,2);
      trcdiasjor4 = new FieldDef("trcdiasjor4",FieldDef.INTEGER,0);
      trcinijor4 = new FieldDef("trcinijor4",FieldDef.DATE);
      trcfinjor4 = new FieldDef("trcfinjor4",FieldDef.DATE);
      trccolectra = new FieldDef("trccolectra",FieldDef.CHAR,3);
      trccampuestra = new FieldDef("trccampuestra",FieldDef.CHAR,2);
      trcconvofic = new FieldDef("trcconvofic",FieldDef.INTEGER,0);
      trctipfijodis = new FieldDef("trctipfijodis",FieldDef.CHAR,1);
      trcsscnae09 = new FieldDef("trcsscnae09",FieldDef.CHAR,4);
      trcfecfiprueba = new FieldDef("trcfecfiprueba",FieldDef.DATE);
      trctipocotagra = new FieldDef("trctipocotagra",FieldDef.CHAR,1);
      trctipobonagra = new FieldDef("trctipobonagra",FieldDef.INTEGER,0);
      FieldDef array[] = {
        trccodiemp,
        trccodigo,
        trcrelacion,
        trccausa,
        trciniciocto,
        trcfincto,
        trcconvenio,
        trccodicat,
        trcdescrcat,
        trctarifa,
        trcepigraf,
        trcclauirpf,
        trcporirpf,
        trctipoirpf,
        trccodicto,
        trcconclavescon,
        trcnumctoinem,
        trcdatreginem,
        trcduracto,
        trchorasjorn,
        trcparcial,
        trcdiashoras,
        trcporreduc,
        trcdias,
        trchoras,
        trclunesdia,
        trcluneshor,
        trcmartdia,
        trcmarthor,
        trcmierdia,
        trcmierhor,
        trcjuevdia,
        trcjuevhor,
        trcvierndia,
        trcviernhor,
        trcsabdia,
        trcsabhor,
        trcdomdia,
        trcdomhor,
        trcfestivos,
        trcfestivho,
        trcpluri,
        trcbasespor,
        trcporcen,
        trcbasmaxcom,
        trcbasmincom,
        trcbasmaxacc,
        trcbasminacc,
        trcformacio,
        trchorasdis,
        trchoraspre,
        trcparcialred,
        trcinterinid,
        trcsusti,
        trcbaseauton,
        trccontrata,
        trccno,
        trccnoinem,
        trcdespido,
        trcdescolec,
        trcsistespec,
        trcdiasistesp,
        trccoefperm,
        trccondidesem,
        trcmujersubre,
        trcincapacita,
        trcexclusion,
        trcprimerauto,
        trcfomconind,
        trcrelespecia,
        trccoditrasus,
        trcnafsusti1,
        trcnafsusti2,
        trcnafsusti3,
        trccausasus,
        trcsubroga,
        trcrentainse,
        trcalumbra,
        trccobrosub,
        trcredcalif,
        trcredhorcona,
        trcredhorconv,
        trcredperdias,
        trcempett,
        trctipoinac,
        trccodcontpro,
        trcconclavespro,
        trcfecinipro,
        trcfecfinpro,
        trcdircontra,
        trcdirprorro,
        trcdirfiniq,
        trccontingente,
        trcdircertie,
        trcdirdcljur,
        trcdircertif,
        trcfecfinvac,
        trcsscnae,
        trcocupasita,
        trcfecantig,
        trcfeccalantig,
        trcfeccalpagas,
        trccausaexcagra,
        trctipojor1,
        trcdiasjor1,
        trcinijor1,
        trcfinjor1,
        trctipojor2,
        trcdiasjor2,
        trcinijor2,
        trcfinjor2,
        trctipojor3,
        trcdiasjor3,
        trcinijor3,
        trcfinjor3,
        trctipojor4,
        trcdiasjor4,
        trcinijor4,
        trcfinjor4,
        trccolectra,
        trccampuestra,
        trcconvofic,
        trctipfijodis,
        trcsscnae09,
        trcfecfiprueba,
        trctipocotagra,
        trctipobonagra        
        };
      setColumns(array);
      FieldDef arrayf[] = {trccodiemp,trccodigo,trcrelacion };
      setPrimaryKeys(arrayf);
      trccodiemp.setDescription("Codigo Empresa");
      trccodigo.setDescription("Codigo Trabajador");
      trcrelacion.setDescription("Numero relacion contractual");
      trccausa.setDescription("Causa contrato interinidad o relevo");
      trciniciocto.setDescription("Fecha Inicio Contrato");
      trcfincto.setDescription("Fecha Fin Contrato");
      trcconvenio.setDescription("Convenio");
      trccodicat.setDescription("Codigo categoria");
      trcdescrcat.setDescription("Descripcion Categoria");
      trctarifa.setDescription("Codigo tarifa");
      trcepigraf.setDescription("Epigrafe Accidentes");
      trcclauirpf.setDescription("Clave IRPF");
      trcporirpf.setDescription("Porcentaje Retencion IRPF");
      trctipoirpf.setDescription("Tipo Calculo IRPF");
      trccodicto.setDescription("Codigo Contrato");
      trcconclavescon.setDescription("Codigo Claves contrato");
      trcnumctoinem.setDescription("Numero Contrato Inem");
      trcdatreginem.setDescription("Fecha Registro Contrato INEM");
      trcduracto.setDescription("Duracion Contrato");
      trchorasjorn.setDescription("Horas Jornada");
      trcparcial.setDescription("Tiempo Parcial");
      trcdiashoras.setDescription("Tiempo Parcial por Dias/Horas");
      trcporreduc.setDescription("T.P. Porcentaje Reduccion");
      trcdias.setDescription("T.P. Dias");
      trchoras.setDescription("T.P. Horas");
      trclunesdia.setDescription("Trabajo el dia lunes");
      trcluneshor.setDescription("Horas Trabajo lunes");
      trcmartdia.setDescription("Trabajo el dia martes");
      trcmarthor.setDescription("Horas Trabajo martes");
      trcmierdia.setDescription("Trabajo el dia miercoles");
      trcmierhor.setDescription("Horas Trabajo miercoles");
      trcjuevdia.setDescription("Trabajo el dia jueves");
      trcjuevhor.setDescription("Horas Trabajo jueves");
      trcvierndia.setDescription("Trabajo el dia viernes");
      trcviernhor.setDescription("Horas Trabajo viernes");
      trcsabdia.setDescription("Trabajo el dia sabado");
      trcsabhor.setDescription("Horas Trabajo sabado");
      trcdomdia.setDescription("Trabajo el dia domingo");
      trcdomhor.setDescription("Horas Trabajo domingo");
      trcfestivos.setDescription("Trabajo festivos");
      trcfestivho.setDescription("Horas Trabajo  festivos");
      trcpluri.setDescription("Pluriempleo");
      trcbasespor.setDescription("Plu. Porcentaje Bases");
      trcporcen.setDescription("Plu. Porcentaje");
      trcbasmaxcom.setDescription("Plu. Bases Maximas C. Com.");
      trcbasmincom.setDescription("Plu. Bases Minimas C. Com.");
      trcbasmaxacc.setDescription("Plu. Bases Maximas Accidentes");
      trcbasminacc.setDescription("Plu. Bases Minimas Accidentes");
      trcformacio.setDescription("Contrato Formacion");
      trchorasdis.setDescription("Formacion horas distancia");
      trchoraspre.setDescription("Formacion horas presenciales");
      trcparcialred.setDescription("Tiempo Parcial reducido");
      trcinterinid.setDescription("Contrato Interinidad");
      trcsusti.setDescription("Contrato sustitucion");
      trcbaseauton.setDescription("Base Cotizacion autonomos");
      trccontrata.setDescription("Codigo Contrata");
      trccno.setDescription("CNO");
      trccnoinem.setDescription("Codigo CNO Inem");
      trcdespido.setDescription("Tipo despido");
      trcdescolec.setDescription("Colectivo de desempleado");
      trcsistespec.setDescription("Tipo inclusion en el Sistema Especial");
      trcdiasistesp.setDescription("Dias inclusion en el Sistema Especial");
      trccoefperm.setDescription("Coeficiente de permanencia");
      trccondidesem.setDescription("Condicion desempleado");
      trcmujersubre.setDescription("Mujer subrepresentada");
      trcincapacita.setDescription("Incapacitacion");
      trcexclusion.setDescription("Exclusion");
      trcprimerauto.setDescription("Primer autoempleo");
      trcfomconind.setDescription("Fomento contrato indefinido");
      trcrelespecia.setDescription("Relaciones especiales");
      trccoditrasus.setDescription("Codigo Trabajador Sustitucion");
      trcnafsusti1.setDescription("NAF Trabajador sustitucion (1)");
      trcnafsusti2.setDescription("NAF Trabajador sustitucion (2)");
      trcnafsusti3.setDescription("NAF Trabajador sustitucion (3)");
      trccausasus.setDescription("Causa sustitucion");
      trcsubroga.setDescription("Subrogacion");
      trcrentainse.setDescription("Colectivo de renta de insercion");
      trcalumbra.setDescription("Alumbramiento");
      trccobrosub.setDescription("Tipo cobro subsidio");
      trcredcalif.setDescription("Calificador Periodo (Dias,Semanas,Meses)");
      trcredhorcona.setDescription("Calificador Horas Convenio (Anuales,Mensuales,Diarias)");
      trcredhorconv.setDescription("Calculo horas convenio segun calificador del Periodo");
      trcredperdias.setDescription("Permanencia dias trabajados");
      trcempett.setDescription("Empresa usuaria ETT");
      trctipoinac.setDescription("Tipo de inactividad");
      trccodcontpro.setDescription("Codigo contrato prorroga");
      trcconclavespro.setDescription("Codigo claves contrato prorroga");
      trcfecinipro.setDescription("Fecha Inicio Prorroga");
      trcfecfinpro.setDescription("Fecha Fin Prorroga");
      trcdircontra.setDescription("Direccion disco contrato");
      trcdirprorro.setDescription("Direccion disco prorroga");
      trcdirfiniq.setDescription("Direccion disco finiquito");
      trccontingente.setDescription("Trabajador extranjero considerado como Contingente");
      trcdircertie.setDescription("Direccion disco certificado empresa");
      trcdirdcljur.setDescription("Direccion disco declaracion jurada");
      trcdircertif.setDescription("Direccion disco certificado retenciones");
      trcfecfinvac.setDescription("Fecha fin vacaciones");
      trcsscnae.setDescription("CNAE DEL TRACONTRATO PARA EL CALCULO DE LOS EPIGRAFES A LA S.S.");
      trcocupasita.setDescription("Codigo de ocupacion o situación para el calculo de los epigrafes a la S.S.");
      trcfecantig.setDescription("Fecha Antiguedad");
      trcfeccalantig.setDescription("Fecha Calculo Antiguedad");
      trcfeccalpagas.setDescription("Fecha calculo pagas extras");
      trccausaexcagra.setDescription("Causa Exclusion Censo Agrario");
      trctipojor1.setDescription("Tipo   Jornada para certificado de empresa 1");
      trcdiasjor1.setDescription("dias   Jornada para certificado de empresa 1");
      trcinijor1.setDescription("inicio certificado de empresa 1");
      trcfinjor1.setDescription("fin    certificado de empresa 1");
      trctipojor2.setDescription("Tipo   Jornada para certificado de empresa 2");
      trcdiasjor2.setDescription("dias   Jornada para certificado de empresa 2");
      trcinijor2.setDescription("inicio certificado de empresa 2");
      trcfinjor2.setDescription("fin    certificado de empresa 2");
      trctipojor3.setDescription("Tipo   Jornada para certificado de empresa 3");
      trcdiasjor3.setDescription("dias   Jornada para certificado de empresa 3");
      trcinijor3.setDescription("inicio certificado de empresa 3");
      trcfinjor3.setDescription("fin    certificado de empresa 3");
      trctipojor4.setDescription("Tipo   Jornada para certificado de empresa 4");
      trcdiasjor4.setDescription("dias   Jornada para certificado de empresa 4");
      trcinijor4.setDescription("inicio certificado de empresa 4");
      trcfinjor4.setDescription("fin    certificado de empresa 4");
      trccolectra.setDescription("Colectivo Trabajador AFI");
      trccampuestra.setDescription("Cambio puesto de trabajo");
      trcsscnae09.setDescription("CNAE 2009 DEL TRACONTRATO PARA EL CALCULO DE LOS EPIGRAFES A LA S.S.");
      }
    }
    
  public class TabTraconclaus extends TableDef
    {
    // Campos
    public FieldDef trocodiemp;
    public FieldDef trocodigo;
    public FieldDef trorelacion;
    public FieldDef trocodclaus;
    public TabTraconclaus(String name)
      {
      super(name);
      trocodiemp = new FieldDef("trocodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trocodigo = new FieldDef("trocodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trorelacion = new FieldDef("trorelacion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trocodclaus = new FieldDef("trocodclaus",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        trocodiemp,
        trocodigo,
        trorelacion,
        trocodclaus        
        };
      setColumns(array);
      FieldDef arrayf[] = {trocodiemp,trocodigo,trorelacion,trocodclaus };
      setPrimaryKeys(arrayf);
      trocodiemp.setDescription("Codigo Empresa");
      trocodigo.setDescription("Codigo Trabajador");
      trorelacion.setDescription("Codigo relacion contrato");
      trocodclaus.setDescription("Clausula");
      }
    }
    
  public class TabTrairpf extends TableDef
    {
    // Campos
    public FieldDef tricodiemp;
    public FieldDef tricodigo;
    public FieldDef triejercicio;
    public FieldDef tribanual;
    public FieldDef tripension;
    public FieldDef trianualid;
    public FieldDef trivarieneroco;
    public FieldDef trivarifebreco;
    public FieldDef trivarimarzoco;
    public FieldDef trivariabrilco;
    public FieldDef trivarimayoco;
    public FieldDef trivarijunioco;
    public FieldDef trivarijulioco;
    public FieldDef trivariagostoco;
    public FieldDef trivariseptico;
    public FieldDef trivarioctubco;
    public FieldDef trivarinovico;
    public FieldDef trivaridicico;
    public FieldDef trivarienerono;
    public FieldDef trivarifebreno;
    public FieldDef trivarimarzono;
    public FieldDef trivariabrilno;
    public FieldDef trivarimayono;
    public FieldDef trivarijuniono;
    public FieldDef trivarijuliono;
    public FieldDef trivariagostono;
    public FieldDef trivariseptino;
    public FieldDef trivarioctubno;
    public FieldDef trivarinovino;
    public FieldDef trivaridicino;
    public FieldDef trieneroirpf;
    public FieldDef trifebreirpf;
    public FieldDef trimarzoirpf;
    public FieldDef triabrilirpf;
    public FieldDef trimayoirpf;
    public FieldDef trijunioirpf;
    public FieldDef trijulioirpf;
    public FieldDef triagostoirpf;
    public FieldDef triseptiirpf;
    public FieldDef trioctubirpf;
    public FieldDef trinoviirpf;
    public FieldDef tridiciirpf;
    public FieldDef trivivfinaciada;
    public TabTrairpf(String name)
      {
      super(name);
      tricodiemp = new FieldDef("tricodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tricodigo = new FieldDef("tricodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      triejercicio = new FieldDef("triejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tribanual = new FieldDef("tribanual",FieldDef.FLOAT,6,0);
      tripension = new FieldDef("tripension",FieldDef.FLOAT,6,0);
      trianualid = new FieldDef("trianualid",FieldDef.FLOAT,6,0);
      trivarieneroco = new FieldDef("trivarieneroco",FieldDef.FLOAT,6,0);
      trivarifebreco = new FieldDef("trivarifebreco",FieldDef.FLOAT,6,0);
      trivarimarzoco = new FieldDef("trivarimarzoco",FieldDef.FLOAT,6,0);
      trivariabrilco = new FieldDef("trivariabrilco",FieldDef.FLOAT,6,0);
      trivarimayoco = new FieldDef("trivarimayoco",FieldDef.FLOAT,6,0);
      trivarijunioco = new FieldDef("trivarijunioco",FieldDef.FLOAT,6,0);
      trivarijulioco = new FieldDef("trivarijulioco",FieldDef.FLOAT,6,0);
      trivariagostoco = new FieldDef("trivariagostoco",FieldDef.FLOAT,6,0);
      trivariseptico = new FieldDef("trivariseptico",FieldDef.FLOAT,6,0);
      trivarioctubco = new FieldDef("trivarioctubco",FieldDef.FLOAT,6,0);
      trivarinovico = new FieldDef("trivarinovico",FieldDef.FLOAT,6,0);
      trivaridicico = new FieldDef("trivaridicico",FieldDef.FLOAT,6,0);
      trivarienerono = new FieldDef("trivarienerono",FieldDef.FLOAT,6,0);
      trivarifebreno = new FieldDef("trivarifebreno",FieldDef.FLOAT,6,0);
      trivarimarzono = new FieldDef("trivarimarzono",FieldDef.FLOAT,6,0);
      trivariabrilno = new FieldDef("trivariabrilno",FieldDef.FLOAT,6,0);
      trivarimayono = new FieldDef("trivarimayono",FieldDef.FLOAT,6,0);
      trivarijuniono = new FieldDef("trivarijuniono",FieldDef.FLOAT,6,0);
      trivarijuliono = new FieldDef("trivarijuliono",FieldDef.FLOAT,6,0);
      trivariagostono = new FieldDef("trivariagostono",FieldDef.FLOAT,6,0);
      trivariseptino = new FieldDef("trivariseptino",FieldDef.FLOAT,6,0);
      trivarioctubno = new FieldDef("trivarioctubno",FieldDef.FLOAT,6,0);
      trivarinovino = new FieldDef("trivarinovino",FieldDef.FLOAT,6,0);
      trivaridicino = new FieldDef("trivaridicino",FieldDef.FLOAT,6,0);
      trieneroirpf = new FieldDef("trieneroirpf",FieldDef.CHAR,1);
      trifebreirpf = new FieldDef("trifebreirpf",FieldDef.CHAR,1);
      trimarzoirpf = new FieldDef("trimarzoirpf",FieldDef.CHAR,1);
      triabrilirpf = new FieldDef("triabrilirpf",FieldDef.CHAR,1);
      trimayoirpf = new FieldDef("trimayoirpf",FieldDef.CHAR,1);
      trijunioirpf = new FieldDef("trijunioirpf",FieldDef.CHAR,1);
      trijulioirpf = new FieldDef("trijulioirpf",FieldDef.CHAR,1);
      triagostoirpf = new FieldDef("triagostoirpf",FieldDef.CHAR,1);
      triseptiirpf = new FieldDef("triseptiirpf",FieldDef.CHAR,1);
      trioctubirpf = new FieldDef("trioctubirpf",FieldDef.CHAR,1);
      trinoviirpf = new FieldDef("trinoviirpf",FieldDef.CHAR,1);
      tridiciirpf = new FieldDef("tridiciirpf",FieldDef.CHAR,1);
      trivivfinaciada = new FieldDef("trivivfinaciada",FieldDef.CHAR,1);
      FieldDef array[] = {
        tricodiemp,
        tricodigo,
        triejercicio,
        tribanual,
        tripension,
        trianualid,
        trivarieneroco,
        trivarifebreco,
        trivarimarzoco,
        trivariabrilco,
        trivarimayoco,
        trivarijunioco,
        trivarijulioco,
        trivariagostoco,
        trivariseptico,
        trivarioctubco,
        trivarinovico,
        trivaridicico,
        trivarienerono,
        trivarifebreno,
        trivarimarzono,
        trivariabrilno,
        trivarimayono,
        trivarijuniono,
        trivarijuliono,
        trivariagostono,
        trivariseptino,
        trivarioctubno,
        trivarinovino,
        trivaridicino,
        trieneroirpf,
        trifebreirpf,
        trimarzoirpf,
        triabrilirpf,
        trimayoirpf,
        trijunioirpf,
        trijulioirpf,
        triagostoirpf,
        triseptiirpf,
        trioctubirpf,
        trinoviirpf,
        tridiciirpf,
        trivivfinaciada        
        };
      setColumns(array);
      FieldDef arrayf[] = {tricodiemp,tricodigo,triejercicio };
      setPrimaryKeys(arrayf);
      tricodiemp.setDescription("Codigo de enlace");
      tricodigo.setDescription("Codigo de tabajador");
      triejercicio.setDescription("Ejercicio de irpf");
      tribanual.setDescription("Bruto anual");
      tripension.setDescription("Pension compensatoria");
      trianualid.setDescription("Anualidad a favor de los hijos");
      trivarieneroco.setDescription("Importe retribucion variable ENERO no cotiza");
      trivarifebreco.setDescription("Importe retribucion variable FEBRERO no cotiza");
      trivarimarzoco.setDescription("Importe retribucion variable MARZO no cotiza");
      trivariabrilco.setDescription("Importe retribucion variable ABRIL no cotiza");
      trivarimayoco.setDescription("Importe retribucion variable MAYO no cotiza");
      trivarijunioco.setDescription("Importe retribucion variable JUNIO no cotiza");
      trivarijulioco.setDescription("Importe retribucion variable JULIO no cotiza");
      trivariagostoco.setDescription("Importe retribucion variable AGOSTO no cotiza");
      trivariseptico.setDescription("Importe retribucion variable SEPTIEMBRE no cotiza");
      trivarioctubco.setDescription("Importe retribucion variable OCTUBRE no cotiza");
      trivarinovico.setDescription("Importe retribucion variable NOVIEMBRE no cotiza");
      trivaridicico.setDescription("Importe retribucion variable DICIEMBRE no cotiza");
      trivarienerono.setDescription("Importe retribucion variable ENERO cotiza");
      trivarifebreno.setDescription("Importe retribucion variable FEBRERO cotiza");
      trivarimarzono.setDescription("Importe retribucion variable MARZO  cotiza");
      trivariabrilno.setDescription("Importe retribucion variable ABRIL  cotiza");
      trivarimayono.setDescription("Importe retribucion variable MAYO cotiza");
      trivarijuniono.setDescription("Importe retribucion variable JUNIO  cotiza");
      trivarijuliono.setDescription("Importe retribucion variable JULIO  cotiza");
      trivariagostono.setDescription("Importe retribucion variable AGOSTO  cotiza");
      trivariseptino.setDescription("Importe retribucion variable SEPTIEMBRE  cotiza");
      trivarioctubno.setDescription("Importe retribucion variable OCTUBRE cotiza");
      trivarinovino.setDescription("Importe retribucion variable NOVIEMBRE  cotiza");
      trivaridicino.setDescription("Importe retribucion variable DICIEMBRE  cotiza");
      trieneroirpf.setDescription("Regularizacion en Enero");
      trifebreirpf.setDescription("Regularizacion en Febrero");
      trimarzoirpf.setDescription("Regularizacion en Marzo");
      triabrilirpf.setDescription("Regularizacion en Abril");
      trimayoirpf.setDescription("Regularizacion en Mayo");
      trijunioirpf.setDescription("Regularizacion en Junio");
      trijulioirpf.setDescription("Regularizacion en Julio");
      triagostoirpf.setDescription("Regularizacion en Agosto");
      triseptiirpf.setDescription("Regularizacion en Septiembre");
      trioctubirpf.setDescription("Regularizacion en Octubre");
      trinoviirpf.setDescription("Regularizacion en Noviembre");
      tridiciirpf.setDescription("Regularizacion en Diciembre");
      trivivfinaciada.setDescription("Tiene Vivienda Financiada.");
      }
    }
    
  public class TabTraunifam extends TableDef
    {
    // Campos
    public FieldDef trucodiemp;
    public FieldDef trucodigo;
    public FieldDef trunumero;
    public FieldDef trudni;
    public FieldDef trunombre;
    public FieldDef truparentesco;
    public FieldDef truporminus;
    public FieldDef truayuda;
    public FieldDef trudatancim;
    public FieldDef truvincula;
    public FieldDef truporcargo;
    public FieldDef truingresos;
    public FieldDef trudataadop;
    public FieldDef truprofesion;
    public FieldDef trusitprofes;
    public FieldDef truempact;
    public FieldDef trucodestud;
    public FieldDef trunivestud;
    public FieldDef truconvive;
    public TabTraunifam(String name)
      {
      super(name);
      trucodiemp = new FieldDef("trucodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trucodigo = new FieldDef("trucodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trunumero = new FieldDef("trunumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trudni = new FieldDef("trudni",FieldDef.CHAR,15);
      trunombre = new FieldDef("trunombre",FieldDef.CHAR,40);
      truparentesco = new FieldDef("truparentesco",FieldDef.CHAR,1);
      truporminus = new FieldDef("truporminus",FieldDef.FLOAT,6,0);
      truayuda = new FieldDef("truayuda",FieldDef.CHAR,1);
      trudatancim = new FieldDef("trudatancim",FieldDef.DATE);
      truvincula = new FieldDef("truvincula",FieldDef.CHAR,1);
      truporcargo = new FieldDef("truporcargo",FieldDef.FLOAT,6,0);
      truingresos = new FieldDef("truingresos",FieldDef.FLOAT,6,0);
      trudataadop = new FieldDef("trudataadop",FieldDef.DATE);
      truprofesion = new FieldDef("truprofesion",FieldDef.CHAR,30);
      trusitprofes = new FieldDef("trusitprofes",FieldDef.CHAR,30);
      truempact = new FieldDef("truempact",FieldDef.CHAR,40);
      trucodestud = new FieldDef("trucodestud",FieldDef.CHAR,10);
      trunivestud = new FieldDef("trunivestud",FieldDef.CHAR,10);
      truconvive = new FieldDef("truconvive",FieldDef.CHAR,1);
      FieldDef array[] = {
        trucodiemp,
        trucodigo,
        trunumero,
        trudni,
        trunombre,
        truparentesco,
        truporminus,
        truayuda,
        trudatancim,
        truvincula,
        truporcargo,
        truingresos,
        trudataadop,
        truprofesion,
        trusitprofes,
        truempact,
        trucodestud,
        trunivestud,
        truconvive        
        };
      setColumns(array);
      FieldDef arrayf[] = {trucodiemp,trucodigo,trunumero };
      setPrimaryKeys(arrayf);
      trucodiemp.setDescription("Codigo Empresa");
      trucodigo.setDescription("Codigo Trabajador");
      trunumero.setDescription("Numero de miembro");
      trudni.setDescription("DNI");
      trunombre.setDescription("Nombre");
      truparentesco.setDescription("Parentesco");
      truporminus.setDescription("Porcentaje Minusvalia");
      truayuda.setDescription("Necesita Ayuda");
      trudatancim.setDescription("Fecha Nacimiento");
      truvincula.setDescription("Codigo vinculacion");
      truporcargo.setDescription("Porcentaje cargo");
      truingresos.setDescription("Ingresos Brutos");
      trudataadop.setDescription("Fecha adopcion");
      truprofesion.setDescription("Profesion");
      trusitprofes.setDescription("Situacion Profesional");
      truempact.setDescription("Empresa Actual");
      trucodestud.setDescription("Codigo de Estudio");
      trunivestud.setDescription("Nivel de Estudio");
      truconvive.setDescription("Convive");
      }
    }
    
  public class TabTraembargo extends TableDef
    {
    // Campos
    public FieldDef trenumero;
    public FieldDef trecodiemp;
    public FieldDef trecodigo;
    public FieldDef tretipoemb;
    public FieldDef tredescrip;
    public FieldDef tredescabre;
    public FieldDef treinicio;
    public FieldDef trefin;
    public FieldDef treimportetot;
    public FieldDef trecuotames;
    public FieldDef trededucpaga;
    public TabTraembargo(String name)
      {
      super(name);
      trenumero = new FieldDef("trenumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trecodiemp = new FieldDef("trecodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trecodigo = new FieldDef("trecodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tretipoemb = new FieldDef("tretipoemb",FieldDef.CHAR,2);
      tredescrip = new FieldDef("tredescrip",FieldDef.CHAR,40);
      tredescabre = new FieldDef("tredescabre",FieldDef.CHAR,10);
      treinicio = new FieldDef("treinicio",FieldDef.DATE);
      trefin = new FieldDef("trefin",FieldDef.DATE);
      treimportetot = new FieldDef("treimportetot",FieldDef.FLOAT,6,0);
      trecuotames = new FieldDef("trecuotames",FieldDef.FLOAT,6,0);
      trededucpaga = new FieldDef("trededucpaga",FieldDef.CHAR,1);
      FieldDef array[] = {
        trenumero,
        trecodiemp,
        trecodigo,
        tretipoemb,
        tredescrip,
        tredescabre,
        treinicio,
        trefin,
        treimportetot,
        trecuotames,
        trededucpaga        
        };
      setColumns(array);
      FieldDef arrayf[] = {trenumero };
      setPrimaryKeys(arrayf);
      trenumero.setAutoIncrementable(true);
      trenumero.setDescription("Numero de Prestamo/Embargo");
      trecodiemp.setDescription("Codigo Empresa");
      trecodigo.setDescription("Codigo Trabajador");
      tretipoemb.setDescription("Tipo Embargo");
      tredescrip.setDescription("Descripcion");
      tredescabre.setDescription("Descripcion Abreviada");
      treinicio.setDescription("Fecha Inicio");
      trefin.setDescription("Fecha Fin");
      treimportetot.setDescription("Importe Total Deuda");
      trecuotames.setDescription("Cuota mes");
      trededucpaga.setDescription("Deduccion en pagas");
      }
    }
    
  public class TabTraembhistor extends TableDef
    {
    // Campos
    public FieldDef trhnumero;
    public FieldDef trhembargo;
    public FieldDef trhejercicio;
    public FieldDef trhperiodo;
    public FieldDef trhproceso;
    public FieldDef trhtramo;
    public FieldDef trhimporte;
    public TabTraembhistor(String name)
      {
      super(name);
      trhnumero = new FieldDef("trhnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trhembargo = new FieldDef("trhembargo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trhejercicio = new FieldDef("trhejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trhperiodo = new FieldDef("trhperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trhproceso = new FieldDef("trhproceso",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trhtramo = new FieldDef("trhtramo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trhimporte = new FieldDef("trhimporte",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        trhnumero,
        trhembargo,
        trhejercicio,
        trhperiodo,
        trhproceso,
        trhtramo,
        trhimporte        
        };
      setColumns(array);
      FieldDef arrayf[] = {trhnumero };
      setPrimaryKeys(arrayf);
      trhnumero.setAutoIncrementable(true);
      trhnumero.setDescription("Identificador de historico");
      trhembargo.setDescription("Numero Embargo/Prestamo");
      trhejercicio.setDescription("Ejercicio aplicado");
      trhperiodo.setDescription("Periodo aplicado");
      trhproceso.setDescription("Proceso (Recibo mensual-PagasExtras)");
      trhtramo.setDescription("Numero de Tramo de calculo");
      trhimporte.setDescription("Importe");
      }
    }
    
  public class TabTrabonif extends TableDef
    {
    // Campos
    public FieldDef trbcodiemp;
    public FieldDef trbcodigo;
    public FieldDef trbrelacion;
    public FieldDef trbbonif;
    public FieldDef trbtramo;
    public FieldDef trbinicio;
    public FieldDef trbfin;
    public FieldDef trbimpanual;
    public FieldDef trbimpbonif;
    public FieldDef trbimpdia;
    public FieldDef trbcoleboni;
    public FieldDef trbindreduc;
    public TabTrabonif(String name)
      {
      super(name);
      trbcodiemp = new FieldDef("trbcodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trbcodigo = new FieldDef("trbcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trbrelacion = new FieldDef("trbrelacion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trbbonif = new FieldDef("trbbonif",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trbtramo = new FieldDef("trbtramo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trbinicio = new FieldDef("trbinicio",FieldDef.DATE);
      trbfin = new FieldDef("trbfin",FieldDef.DATE);
      trbimpanual = new FieldDef("trbimpanual",FieldDef.FLOAT,6,0);
      trbimpbonif = new FieldDef("trbimpbonif",FieldDef.FLOAT,6,0);
      trbimpdia = new FieldDef("trbimpdia",FieldDef.FLOAT,6,0);
      trbcoleboni = new FieldDef("trbcoleboni",FieldDef.INTEGER,0);
      trbindreduc = new FieldDef("trbindreduc",FieldDef.INTEGER,0);
      FieldDef array[] = {
        trbcodiemp,
        trbcodigo,
        trbrelacion,
        trbbonif,
        trbtramo,
        trbinicio,
        trbfin,
        trbimpanual,
        trbimpbonif,
        trbimpdia,
        trbcoleboni,
        trbindreduc        
        };
      setColumns(array);
      FieldDef arrayf[] = {trbcodiemp,trbcodigo,trbrelacion,trbbonif,trbtramo };
      setPrimaryKeys(arrayf);
      trbcodiemp.setDescription("Codigo Empresa");
      trbcodigo.setDescription("Codigo Trabajador");
      trbrelacion.setDescription("Codigo Relacion contractual");
      trbbonif.setDescription("Bonificacion");
      trbtramo.setDescription("Tramo");
      trbinicio.setDescription("Fecha inicio");
      trbfin.setDescription("Fecha fin");
      trbimpanual.setDescription("Importe anual de bonificacion");
      trbimpbonif.setDescription("Importe anual bonificable");
      trbimpdia.setDescription("Importe diario bonificable");
      trbcoleboni.setDescription("Tipo Colectivo");
      trbindreduc.setDescription("Indicador reducción bonificación");
      }
    }
    
  public class TabTraparte extends TableDef
    {
    // Campos
    public FieldDef trpcodiemp;
    public FieldDef trpcodigo;
    public FieldDef trprelacion;
    public FieldDef trpcontador;
    public FieldDef trpestado;
    public FieldDef trpdataaccio;
    public FieldDef trpredaccion;
    public FieldDef trpredcausa;
    public TabTraparte(String name)
      {
      super(name);
      trpcodiemp = new FieldDef("trpcodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trpcodigo = new FieldDef("trpcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trprelacion = new FieldDef("trprelacion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trpcontador = new FieldDef("trpcontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trpestado = new FieldDef("trpestado",FieldDef.CHAR,1);
      trpdataaccio = new FieldDef("trpdataaccio",FieldDef.DATE);
      trpredaccion = new FieldDef("trpredaccion",FieldDef.CHAR,3);
      trpredcausa = new FieldDef("trpredcausa",FieldDef.CHAR,2);
      FieldDef array[] = {
        trpcodiemp,
        trpcodigo,
        trprelacion,
        trpcontador,
        trpestado,
        trpdataaccio,
        trpredaccion,
        trpredcausa        
        };
      setColumns(array);
      FieldDef arrayf[] = {trpcodiemp,trpcodigo,trprelacion,trpcontador };
      setPrimaryKeys(arrayf);
      trpcodiemp.setDescription("Codigo Empresa");
      trpcodigo.setDescription("Codigo Trabajador");
      trprelacion.setDescription("Numero relacion contractual");
      trpcontador.setAutoIncrementable(true);
      trpestado.setDescription("Estado");
      trpdataaccio.setDescription("Fecha accion");
      trpredaccion.setDescription("Codigo accion");
      trpredcausa.setDescription("Causa");
      }
    }
    
  public class TabCalendario extends TableDef
    {
    // Campos
    public FieldDef calcodigo;
    public FieldDef calejercicio;
    public FieldDef calautonomia;
    public FieldDef calprovincia;
    public FieldDef calmunicipio;
    public FieldDef calempresa;
    public FieldDef calcentro;
    public FieldDef calconvenio;
    public TabCalendario(String name)
      {
      super(name);
      calcodigo = new FieldDef("calcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      calejercicio = new FieldDef("calejercicio",FieldDef.INTEGER,0);
      calautonomia = new FieldDef("calautonomia",FieldDef.INTEGER,0);
      calprovincia = new FieldDef("calprovincia",FieldDef.INTEGER,0);
      calmunicipio = new FieldDef("calmunicipio",FieldDef.INTEGER,0);
      calempresa = new FieldDef("calempresa",FieldDef.INTEGER,0);
      calcentro = new FieldDef("calcentro",FieldDef.INTEGER,0);
      calconvenio = new FieldDef("calconvenio",FieldDef.INTEGER,0);
      FieldDef array[] = {
        calcodigo,
        calejercicio,
        calautonomia,
        calprovincia,
        calmunicipio,
        calempresa,
        calcentro,
        calconvenio        
        };
      setColumns(array);
      FieldDef arrayf[] = {calcodigo };
      setPrimaryKeys(arrayf);
      calcodigo.setAutoIncrementable(true);
      calejercicio.setDescription("Ejercicio");
      calautonomia.setDescription("Autonomia");
      calprovincia.setDescription("Provincia");
      calmunicipio.setDescription("Municipio");
      calempresa.setDescription("Empresa");
      calcentro.setDescription("Centro de Trabajo");
      calconvenio.setDescription("Convenio");
      }
    }
    
  public class TabCalendariodet extends TableDef
    {
    // Campos
    public FieldDef caldcodigo;
    public FieldDef caldperiodo;
    public FieldDef calddia;
    public FieldDef caldtipo;
    public TabCalendariodet(String name)
      {
      super(name);
      caldcodigo = new FieldDef("caldcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      caldperiodo = new FieldDef("caldperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      calddia = new FieldDef("calddia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      caldtipo = new FieldDef("caldtipo",FieldDef.CHAR,1);
      FieldDef array[] = {
        caldcodigo,
        caldperiodo,
        calddia,
        caldtipo        
        };
      setColumns(array);
      FieldDef arrayf[] = {caldcodigo,caldperiodo,calddia };
      setPrimaryKeys(arrayf);
      caldperiodo.setDescription("Periodo");
      calddia.setDescription("Dia");
      caldtipo.setDescription("Tipo");
      }
    }
    
  public class TabIncidencias extends TableDef
    {
    // Campos
    public FieldDef inccodigo;
    public FieldDef inccodiemp;
    public FieldDef inccentro;
    public FieldDef inctrabajador;
    public FieldDef inctipinc;
    public FieldDef incfinicial;
    public FieldDef incffinal;
    public FieldDef incbrenf;
    public FieldDef incbracc;
    public FieldDef increcaida;
    public FieldDef inccodrecaida;
    public FieldDef inchextras;
    public FieldDef inchoras1;
    public FieldDef inccotiza;
    public FieldDef increducmat;
    public FieldDef inchospital;
    public FieldDef incobserv;
    public TabIncidencias(String name)
      {
      super(name);
      inccodigo = new FieldDef("inccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      inccodiemp = new FieldDef("inccodiemp",FieldDef.INTEGER,0);
      inccentro = new FieldDef("inccentro",FieldDef.INTEGER,0);
      inctrabajador = new FieldDef("inctrabajador",FieldDef.INTEGER,0);
      inctipinc = new FieldDef("inctipinc",FieldDef.CHAR,2);
      incfinicial = new FieldDef("incfinicial",FieldDef.DATE);
      incffinal = new FieldDef("incffinal",FieldDef.DATE);
      incbrenf = new FieldDef("incbrenf",FieldDef.FLOAT,6,0);
      incbracc = new FieldDef("incbracc",FieldDef.FLOAT,6,0);
      increcaida = new FieldDef("increcaida",FieldDef.CHAR,1);
      inccodrecaida = new FieldDef("inccodrecaida",FieldDef.INTEGER,0);
      inchextras = new FieldDef("inchextras",FieldDef.FLOAT,6,0);
      inchoras1 = new FieldDef("inchoras1",FieldDef.FLOAT,6,0);
      inccotiza = new FieldDef("inccotiza",FieldDef.CHAR,1);
      increducmat = new FieldDef("increducmat",FieldDef.FLOAT,6,0);
      inchospital = new FieldDef("inchospital",FieldDef.CHAR,1);
      incobserv = new FieldDef("incobserv",FieldDef.CHAR,256);
      FieldDef array[] = {
        inccodigo,
        inccodiemp,
        inccentro,
        inctrabajador,
        inctipinc,
        incfinicial,
        incffinal,
        incbrenf,
        incbracc,
        increcaida,
        inccodrecaida,
        inchextras,
        inchoras1,
        inccotiza,
        increducmat,
        inchospital,
        incobserv        
        };
      setColumns(array);
      FieldDef arrayf[] = {inccodigo };
      setPrimaryKeys(arrayf);
      inccodigo.setAutoIncrementable(true);
      inccodiemp.setDescription("Codigo Empresa");
      inccentro.setDescription("Codigo Centro de Trabajo");
      inctrabajador.setDescription("Codigo Trabajador");
      inctipinc.setDescription("Tipo de Incidencia");
      incfinicial.setDescription("Fecha Inicial");
      incffinal.setDescription("Fecha Final");
      incbrenf.setDescription("Base Reguladora Enfermedad");
      incbracc.setDescription("Base Reguladora Accidentes");
      increcaida.setDescription("Recaida");
      inccodrecaida.setDescription("Codigo incidencia recaida");
      inchextras.setDescription("Promedio Horas Extras");
      inchoras1.setDescription("Numero de Horas");
      inccotiza.setDescription("Cotiza Seg. Social");
      increducmat.setDescription("Reduccion Maternidad");
      inchospital.setDescription("Hospitalizacion");
      incobserv.setDescription("Observaciones");
      }
    }
    
  public class TabIncvariable extends TableDef
    {
    // Campos
    public FieldDef invcodigo;
    public FieldDef invcodiemp;
    public FieldDef invcentro;
    public FieldDef invtrabajador;
    public FieldDef invejercicio;
    public FieldDef invperiodo;
    public FieldDef invconcepto;
    public FieldDef invunidad;
    public FieldDef invfactor;
    public FieldDef invimporte;
    public FieldDef invsetraspasa;
    public FieldDef invrelacion;
    public FieldDef invproceso;
    public TabIncvariable(String name)
      {
      super(name);
      invcodigo = new FieldDef("invcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      invcodiemp = new FieldDef("invcodiemp",FieldDef.INTEGER,0);
      invcentro = new FieldDef("invcentro",FieldDef.INTEGER,0);
      invtrabajador = new FieldDef("invtrabajador",FieldDef.INTEGER,0);
      invejercicio = new FieldDef("invejercicio",FieldDef.INTEGER,0);
      invperiodo = new FieldDef("invperiodo",FieldDef.INTEGER,0);
      invconcepto = new FieldDef("invconcepto",FieldDef.INTEGER,0);
      invunidad = new FieldDef("invunidad",FieldDef.FLOAT,6,0);
      invfactor = new FieldDef("invfactor",FieldDef.FLOAT,6,0);
      invimporte = new FieldDef("invimporte",FieldDef.FLOAT,6,0);
      invsetraspasa = new FieldDef("invsetraspasa",FieldDef.CHAR,1);
      invrelacion = new FieldDef("invrelacion",FieldDef.INTEGER,0);
      invproceso = new FieldDef("invproceso",FieldDef.INTEGER,0);
      FieldDef array[] = {
        invcodigo,
        invcodiemp,
        invcentro,
        invtrabajador,
        invejercicio,
        invperiodo,
        invconcepto,
        invunidad,
        invfactor,
        invimporte,
        invsetraspasa,
        invrelacion,
        invproceso        
        };
      setColumns(array);
      FieldDef arrayf[] = {invcodigo };
      setPrimaryKeys(arrayf);
      invcodigo.setAutoIncrementable(true);
      invcodiemp.setDescription("Codigo Empresa");
      invcentro.setDescription("Codigo Centro de Trabajo");
      invtrabajador.setDescription("Codigo Trabajador");
      invejercicio.setDescription("Ejercicio");
      invperiodo.setDescription("Periodo");
      invconcepto.setDescription("Codigo Concepto Retribucion");
      invunidad.setDescription("Unidades");
      invfactor.setDescription("Factor");
      invimporte.setDescription("Importe");
      invsetraspasa.setDescription("Se traspasa a siguientes periodos");
      invrelacion.setDescription("Codigo relacion contractual");
      invproceso.setDescription("Codigo del Proceso Especial");
      }
    }
    
  public class TabFiniquito extends TableDef
    {
    // Campos
    public FieldDef finqcodigo;
    public FieldDef finqejerci;
    public FieldDef finqperiodo;
    public FieldDef finqempresa;
    public FieldDef finqtrabaj;
    public FieldDef finqinicio;
    public FieldDef finqbaja;
    public FieldDef finqdescri;
    public FieldDef finqrecibo;
    public FieldDef finqconjunto;
    public FieldDef finqdtopaga;
    public FieldDef finqvacaconsu;
    public FieldDef finqtipodesp;
    public FieldDef finqcalcindem;
    public FieldDef finqbruanyant;
    public FieldDef finqbrutanual;
    public FieldDef finqdiasindem;
    public FieldDef finqtotdiaind;
    public FieldDef finqvacacion;
    public FieldDef finqimpvacac;
    public FieldDef finqindemni;
    public FieldDef finqimpindem;
    public FieldDef finqpagextra;
    public FieldDef finqimpextra;
    public FieldDef finqrelacion;
    public FieldDef finqfecindem;
    public FieldDef finqcodcausa;
    public FieldDef finqimpdpreavis;
    public FieldDef finqimpvacconsu;
    public FieldDef finqvacacobro;
    public TabFiniquito(String name)
      {
      super(name);
      finqcodigo = new FieldDef("finqcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      finqejerci = new FieldDef("finqejerci",FieldDef.INTEGER,0);
      finqperiodo = new FieldDef("finqperiodo",FieldDef.INTEGER,0);
      finqempresa = new FieldDef("finqempresa",FieldDef.INTEGER,0);
      finqtrabaj = new FieldDef("finqtrabaj",FieldDef.INTEGER,0);
      finqinicio = new FieldDef("finqinicio",FieldDef.DATE);
      finqbaja = new FieldDef("finqbaja",FieldDef.DATE);
      finqdescri = new FieldDef("finqdescri",FieldDef.CHAR,150);
      finqrecibo = new FieldDef("finqrecibo",FieldDef.CHAR,1);
      finqconjunto = new FieldDef("finqconjunto",FieldDef.CHAR,1);
      finqdtopaga = new FieldDef("finqdtopaga",FieldDef.CHAR,1);
      finqvacaconsu = new FieldDef("finqvacaconsu",FieldDef.FLOAT,6,0);
      finqtipodesp = new FieldDef("finqtipodesp",FieldDef.INTEGER,0);
      finqcalcindem = new FieldDef("finqcalcindem",FieldDef.INTEGER,0);
      finqbruanyant = new FieldDef("finqbruanyant",FieldDef.CHAR,1);
      finqbrutanual = new FieldDef("finqbrutanual",FieldDef.FLOAT,6,0);
      finqdiasindem = new FieldDef("finqdiasindem",FieldDef.FLOAT,6,0);
      finqtotdiaind = new FieldDef("finqtotdiaind",FieldDef.FLOAT,6,0);
      finqvacacion = new FieldDef("finqvacacion",FieldDef.CHAR,1);
      finqimpvacac = new FieldDef("finqimpvacac",FieldDef.FLOAT,6,0);
      finqindemni = new FieldDef("finqindemni",FieldDef.CHAR,1);
      finqimpindem = new FieldDef("finqimpindem",FieldDef.FLOAT,6,0);
      finqpagextra = new FieldDef("finqpagextra",FieldDef.CHAR,1);
      finqimpextra = new FieldDef("finqimpextra",FieldDef.FLOAT,6,0);
      finqrelacion = new FieldDef("finqrelacion",FieldDef.INTEGER,0);
      finqfecindem = new FieldDef("finqfecindem",FieldDef.DATE);
      finqcodcausa = new FieldDef("finqcodcausa",FieldDef.CHAR,2);
      finqimpdpreavis = new FieldDef("finqimpdpreavis",FieldDef.FLOAT,6,0);
      finqimpvacconsu = new FieldDef("finqimpvacconsu",FieldDef.FLOAT,6,0);
      finqvacacobro = new FieldDef("finqvacacobro",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        finqcodigo,
        finqejerci,
        finqperiodo,
        finqempresa,
        finqtrabaj,
        finqinicio,
        finqbaja,
        finqdescri,
        finqrecibo,
        finqconjunto,
        finqdtopaga,
        finqvacaconsu,
        finqtipodesp,
        finqcalcindem,
        finqbruanyant,
        finqbrutanual,
        finqdiasindem,
        finqtotdiaind,
        finqvacacion,
        finqimpvacac,
        finqindemni,
        finqimpindem,
        finqpagextra,
        finqimpextra,
        finqrelacion,
        finqfecindem,
        finqcodcausa,
        finqimpdpreavis,
        finqimpvacconsu,
        finqvacacobro        
        };
      setColumns(array);
      FieldDef arrayf[] = {finqcodigo };
      setPrimaryKeys(arrayf);
      finqcodigo.setAutoIncrementable(true);
      finqejerci.setDescription("Ejercicio");
      finqperiodo.setDescription("Periodo");
      finqempresa.setDescription("Codigo Empresa");
      finqtrabaj.setDescription("Codigo Trabajador");
      finqinicio.setDescription("Fecha Inicial Periodo");
      finqbaja.setDescription("Fecha de Baja");
      finqdescri.setDescription("Descripcion Causa");
      finqrecibo.setDescription("Recibo");
      finqconjunto.setDescription("Recibo Conjunto");
      finqdtopaga.setDescription("Descuento anticipos Pagas");
      finqvacaconsu.setDescription("Dias vacaciones consumidas");
      finqtipodesp.setDescription("Tipo Despido");
      finqcalcindem.setDescription("Calculo Indemnizacion");
      finqbruanyant.setDescription("Bruto Año Anterior");
      finqbrutanual.setDescription("Bruto Anual");
      finqdiasindem.setDescription("Dias Indemnizacion");
      finqtotdiaind.setDescription("Total Dias Indemnizacion");
      finqvacacion.setDescription("Calculo Automatico Vacaciones");
      finqimpvacac.setDescription("Importe manual vacaciones");
      finqindemni.setDescription("Calculo Automatico Vacaciones");
      finqimpindem.setDescription("Importe manual Indemnizacion");
      finqpagextra.setDescription("Calculo Automatico Vacaciones");
      finqimpextra.setDescription("Importe manual Pagas");
      finqrelacion.setDescription("Codigo relacion contractual");
      finqfecindem.setDescription("Fecha calculo imdemnizacion");
      finqcodcausa.setDescription("Codigo Causa");
      finqimpdpreavis.setDescription("Importe descontar por falta dias de preaviso");
      finqimpvacconsu.setDescription("Importe descontar por vacaciones consumidas");
      finqvacacobro.setDescription("Dias vacaciones cobro");
      }
    }
    
  public class TabHisretri extends TableDef
    {
    // Campos
    public FieldDef hisrcodigo;
    public FieldDef hisrcalculo;
    public FieldDef hisrejercicio;
    public FieldDef hisrperiodo;
    public FieldDef hisrproceso;
    public FieldDef hisrempresa;
    public FieldDef hisrtrabajador;
    public FieldDef hisrconvemp;
    public FieldDef hisrconcepto;
    public FieldDef hisrdescripcion;
    public FieldDef hisrfactor;
    public FieldDef hisrunidades;
    public FieldDef hisrimporte;
    public FieldDef hisrporcinc;
    public FieldDef hisrinciden;
    public TabHisretri(String name)
      {
      super(name);
      hisrcodigo = new FieldDef("hisrcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hisrcalculo = new FieldDef("hisrcalculo",FieldDef.INTEGER,0);
      hisrejercicio = new FieldDef("hisrejercicio",FieldDef.INTEGER,0);
      hisrperiodo = new FieldDef("hisrperiodo",FieldDef.INTEGER,0);
      hisrproceso = new FieldDef("hisrproceso",FieldDef.INTEGER,0);
      hisrempresa = new FieldDef("hisrempresa",FieldDef.INTEGER,0);
      hisrtrabajador = new FieldDef("hisrtrabajador",FieldDef.INTEGER,0);
      hisrconvemp = new FieldDef("hisrconvemp",FieldDef.CHAR,7);
      hisrconcepto = new FieldDef("hisrconcepto",FieldDef.INTEGER,0);
      hisrdescripcion = new FieldDef("hisrdescripcion",FieldDef.CHAR,50);
      hisrfactor = new FieldDef("hisrfactor",FieldDef.FLOAT,6,0);
      hisrunidades = new FieldDef("hisrunidades",FieldDef.FLOAT,6,0);
      hisrimporte = new FieldDef("hisrimporte",FieldDef.FLOAT,6,0);
      hisrporcinc = new FieldDef("hisrporcinc",FieldDef.FLOAT,6,0);
      hisrinciden = new FieldDef("hisrinciden",FieldDef.INTEGER,0);
      FieldDef array[] = {
        hisrcodigo,
        hisrcalculo,
        hisrejercicio,
        hisrperiodo,
        hisrproceso,
        hisrempresa,
        hisrtrabajador,
        hisrconvemp,
        hisrconcepto,
        hisrdescripcion,
        hisrfactor,
        hisrunidades,
        hisrimporte,
        hisrporcinc,
        hisrinciden        
        };
      setColumns(array);
      FieldDef arrayf[] = {hisrcodigo };
      setPrimaryKeys(arrayf);
      hisrcodigo.setAutoIncrementable(true);
      hisrcodigo.setDescription("Identificador del registro");
      hisrcalculo.setDescription("Identificador del HISPERSO");
      hisrejercicio.setDescription("Ejercicio calculado");
      hisrperiodo.setDescription("Periodo calculado");
      hisrproceso.setDescription("Proceso calculado");
      hisrempresa.setDescription("Codigo de empresa");
      hisrtrabajador.setDescription("Codigo de trabajador");
      hisrconvemp.setDescription("Codigo Enlace utilizado");
      hisrconcepto.setDescription("Codigo de concepto");
      hisrdescripcion.setDescription("Descripcion del concepto de retribucion");
      hisrfactor.setDescription("Importe de origen segun definición del concepto en registro de la tabla CONFACTOR");
      hisrunidades.setDescription("Unidades (dias u otras unidades) por las que se ha calculado la retribucion final del concepto");
      hisrimporte.setDescription("Importe calculado del concepto de retribucion");
      hisrporcinc.setDescription("En caso de un concepto reservado de IT indica el % de base reguladora que se ha pagado");
      hisrinciden.setDescription("Codigo Incidencia vinculada");
      }
    }
    
  public class TabHisdeduc extends TableDef
    {
    // Campos
    public FieldDef hisdcodigo;
    public FieldDef hisdcalculo;
    public FieldDef hisdejercicio;
    public FieldDef hisdperiodo;
    public FieldDef hisdproceso;
    public FieldDef hisdempresa;
    public FieldDef hisdtrabajador;
    public FieldDef hisdconvemp;
    public FieldDef hisdconcepto;
    public FieldDef hisdbase;
    public FieldDef hisdporcentaje;
    public FieldDef hisdcuota;
    public FieldDef hisddias;
    public FieldDef hisdinciden;
    public FieldDef hisddiastp;
    public FieldDef hisddescripcion;
    public TabHisdeduc(String name)
      {
      super(name);
      hisdcodigo = new FieldDef("hisdcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hisdcalculo = new FieldDef("hisdcalculo",FieldDef.INTEGER,0);
      hisdejercicio = new FieldDef("hisdejercicio",FieldDef.INTEGER,0);
      hisdperiodo = new FieldDef("hisdperiodo",FieldDef.INTEGER,0);
      hisdproceso = new FieldDef("hisdproceso",FieldDef.INTEGER,0);
      hisdempresa = new FieldDef("hisdempresa",FieldDef.INTEGER,0);
      hisdtrabajador = new FieldDef("hisdtrabajador",FieldDef.INTEGER,0);
      hisdconvemp = new FieldDef("hisdconvemp",FieldDef.CHAR,7);
      hisdconcepto = new FieldDef("hisdconcepto",FieldDef.INTEGER,0);
      hisdbase = new FieldDef("hisdbase",FieldDef.FLOAT,6,0);
      hisdporcentaje = new FieldDef("hisdporcentaje",FieldDef.FLOAT,6,0);
      hisdcuota = new FieldDef("hisdcuota",FieldDef.FLOAT,6,0);
      hisddias = new FieldDef("hisddias",FieldDef.INTEGER,0);
      hisdinciden = new FieldDef("hisdinciden",FieldDef.INTEGER,0);
      hisddiastp = new FieldDef("hisddiastp",FieldDef.INTEGER,0);
      hisddescripcion = new FieldDef("hisddescripcion",FieldDef.CHAR,50);
      FieldDef array[] = {
        hisdcodigo,
        hisdcalculo,
        hisdejercicio,
        hisdperiodo,
        hisdproceso,
        hisdempresa,
        hisdtrabajador,
        hisdconvemp,
        hisdconcepto,
        hisdbase,
        hisdporcentaje,
        hisdcuota,
        hisddias,
        hisdinciden,
        hisddiastp,
        hisddescripcion        
        };
      setColumns(array);
      FieldDef arrayf[] = {hisdcodigo };
      setPrimaryKeys(arrayf);
      hisdcodigo.setAutoIncrementable(true);
      hisdcodigo.setDescription("Identificador del registro");
      hisdcalculo.setDescription("Enlace con la tabla HISPERSO ( calculo del que proceden estas bases y deducciones)");
      hisdejercicio.setDescription("Ejercicio calculado");
      hisdperiodo.setDescription("Periodo calculado");
      hisdproceso.setDescription("Codigo Proceso");
      hisdempresa.setDescription("Codigo Empresa");
      hisdtrabajador.setDescription("Codigo trabajador");
      hisdconvemp.setDescription("Codigo Enlace utilizado");
      hisdconcepto.setDescription("Concepto Reservado de la Base");
      hisdbase.setDescription("Importe de la Base");
      hisdporcentaje.setDescription("Porcenta. a aplicar");
      hisdcuota.setDescription("Deducción de la base");
      hisddias.setDescription("Dias correspondientes a la base");
      hisdinciden.setDescription("Codigo incidencia calculada para esta base");
      hisddiastp.setDescription("Dias de cotizacion para contratos a tiempo parcial");
      hisddescripcion.setDescription("Descripcion concepto de deduccion");
      }
    }
    
  public class TabHiscostes extends TableDef
    {
    // Campos
    public FieldDef hisccodigo;
    public FieldDef hisccalculo;
    public FieldDef hiscdeduc;
    public FieldDef hiscejercicio;
    public FieldDef hiscperiodo;
    public FieldDef hiscproceso;
    public FieldDef hiscempresa;
    public FieldDef hisctrabajador;
    public FieldDef hiscconcepto;
    public FieldDef hiscbase;
    public FieldDef hisccostepat;
    public FieldDef hiscbonif;
    public FieldDef hiscepiilt;
    public FieldDef hiscepiims;
    public TabHiscostes(String name)
      {
      super(name);
      hisccodigo = new FieldDef("hisccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hisccalculo = new FieldDef("hisccalculo",FieldDef.INTEGER,0);
      hiscdeduc = new FieldDef("hiscdeduc",FieldDef.INTEGER,0);
      hiscejercicio = new FieldDef("hiscejercicio",FieldDef.INTEGER,0);
      hiscperiodo = new FieldDef("hiscperiodo",FieldDef.INTEGER,0);
      hiscproceso = new FieldDef("hiscproceso",FieldDef.INTEGER,0);
      hiscempresa = new FieldDef("hiscempresa",FieldDef.INTEGER,0);
      hisctrabajador = new FieldDef("hisctrabajador",FieldDef.INTEGER,0);
      hiscconcepto = new FieldDef("hiscconcepto",FieldDef.INTEGER,0);
      hiscbase = new FieldDef("hiscbase",FieldDef.FLOAT,6,0);
      hisccostepat = new FieldDef("hisccostepat",FieldDef.FLOAT,6,0);
      hiscbonif = new FieldDef("hiscbonif",FieldDef.FLOAT,6,0);
      hiscepiilt = new FieldDef("hiscepiilt",FieldDef.FLOAT,6,0);
      hiscepiims = new FieldDef("hiscepiims",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        hisccodigo,
        hisccalculo,
        hiscdeduc,
        hiscejercicio,
        hiscperiodo,
        hiscproceso,
        hiscempresa,
        hisctrabajador,
        hiscconcepto,
        hiscbase,
        hisccostepat,
        hiscbonif,
        hiscepiilt,
        hiscepiims        
        };
      setColumns(array);
      FieldDef arrayf[] = {hisccodigo };
      setPrimaryKeys(arrayf);
      hisccodigo.setAutoIncrementable(true);
      hisccodigo.setDescription("Identificador del registro");
      hisccalculo.setDescription("Enlace con la tabla HISPERSO");
      hiscdeduc.setDescription("Enlace con tabla HISDEDUC");
      hiscejercicio.setDescription("Ejercicio calculado");
      hiscperiodo.setDescription("Periodo calculado");
      hiscproceso.setDescription("Codigo Proceso");
      hiscempresa.setDescription("Codigo Empresa");
      hisctrabajador.setDescription("Codigo trabajador");
      hiscconcepto.setDescription("Codigo Concepto");
      hiscbase.setDescription("Base");
      hisccostepat.setDescription("Coste Patronal");
      hiscbonif.setDescription("Bonificacion");
      hiscepiilt.setDescription("ILT");
      hiscepiims.setDescription("IMS");
      }
    }
    
  public class TabHisbonif extends TableDef
    {
    // Campos
    public FieldDef hisbcodigo;
    public FieldDef hisbcalculo;
    public FieldDef hisbdeduc;
    public FieldDef hisbcostes;
    public FieldDef hisbejercicio;
    public FieldDef hisbperiodo;
    public FieldDef hisbproceso;
    public FieldDef hisbempresa;
    public FieldDef hisbtrabajador;
    public FieldDef hisbbonif;
    public FieldDef histramo;
    public FieldDef hisbimpbonif;
    public FieldDef hisbtipofan;
    public FieldDef hisbdias;
    public FieldDef hisforcomple;
    public TabHisbonif(String name)
      {
      super(name);
      hisbcodigo = new FieldDef("hisbcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hisbcalculo = new FieldDef("hisbcalculo",FieldDef.INTEGER,0);
      hisbdeduc = new FieldDef("hisbdeduc",FieldDef.INTEGER,0);
      hisbcostes = new FieldDef("hisbcostes",FieldDef.INTEGER,0);
      hisbejercicio = new FieldDef("hisbejercicio",FieldDef.INTEGER,0);
      hisbperiodo = new FieldDef("hisbperiodo",FieldDef.INTEGER,0);
      hisbproceso = new FieldDef("hisbproceso",FieldDef.INTEGER,0);
      hisbempresa = new FieldDef("hisbempresa",FieldDef.INTEGER,0);
      hisbtrabajador = new FieldDef("hisbtrabajador",FieldDef.INTEGER,0);
      hisbbonif = new FieldDef("hisbbonif",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      histramo = new FieldDef("histramo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hisbimpbonif = new FieldDef("hisbimpbonif",FieldDef.FLOAT,6,0);
      hisbtipofan = new FieldDef("hisbtipofan",FieldDef.CHAR,2);
      hisbdias = new FieldDef("hisbdias",FieldDef.INTEGER,0);
      hisforcomple = new FieldDef("hisforcomple",FieldDef.CHAR,5);
      FieldDef array[] = {
        hisbcodigo,
        hisbcalculo,
        hisbdeduc,
        hisbcostes,
        hisbejercicio,
        hisbperiodo,
        hisbproceso,
        hisbempresa,
        hisbtrabajador,
        hisbbonif,
        histramo,
        hisbimpbonif,
        hisbtipofan,
        hisbdias,
        hisforcomple        
        };
      setColumns(array);
      FieldDef arrayf[] = {hisbcodigo };
      setPrimaryKeys(arrayf);
      hisbcodigo.setAutoIncrementable(true);
      hisbcodigo.setDescription("Identificador del registro");
      hisbcalculo.setDescription("Enlace con la tabla HISPERSO");
      hisbdeduc.setDescription("Enlace con tabla HISDEDUC");
      hisbcostes.setDescription("Enlace tabla HISCOSTES");
      hisbejercicio.setDescription("Ejercicio calculado");
      hisbperiodo.setDescription("Periodo calculado");
      hisbproceso.setDescription("Codigo Proceso");
      hisbempresa.setDescription("Codigo Empresa");
      hisbtrabajador.setDescription("Codigo trabajador");
      hisbbonif.setDescription("Codigo Bonificacion");
      histramo.setDescription("Tramo Bonificacion");
      hisbimpbonif.setDescription("Importe");
      hisbtipofan.setDescription("Tipo Registro FAN");
      hisbdias.setDescription("Dias");
      }
    }
    
  public class TabHisinciden extends TableDef
    {
    // Campos
    public FieldDef hisicodigo;
    public FieldDef hisicalculo;
    public FieldDef hisiejercicio;
    public FieldDef hisiperiodo;
    public FieldDef hisiproceso;
    public FieldDef hisicodiemp;
    public FieldDef hisicentro;
    public FieldDef hisitrabajador;
    public FieldDef hisitiphisi;
    public FieldDef hisifinicial;
    public FieldDef hisiffinal;
    public FieldDef hisibrenf;
    public FieldDef hisibracc;
    public FieldDef hisirecaida;
    public FieldDef hisicodrecaida;
    public FieldDef hisihextras;
    public FieldDef hisihoras1;
    public FieldDef hisicotiza;
    public FieldDef hisireducmat;
    public FieldDef hisihospital;
    public TabHisinciden(String name)
      {
      super(name);
      hisicodigo = new FieldDef("hisicodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hisicalculo = new FieldDef("hisicalculo",FieldDef.INTEGER,0);
      hisiejercicio = new FieldDef("hisiejercicio",FieldDef.INTEGER,0);
      hisiperiodo = new FieldDef("hisiperiodo",FieldDef.INTEGER,0);
      hisiproceso = new FieldDef("hisiproceso",FieldDef.INTEGER,0);
      hisicodiemp = new FieldDef("hisicodiemp",FieldDef.INTEGER,0);
      hisicentro = new FieldDef("hisicentro",FieldDef.INTEGER,0);
      hisitrabajador = new FieldDef("hisitrabajador",FieldDef.INTEGER,0);
      hisitiphisi = new FieldDef("hisitiphisi",FieldDef.CHAR,2);
      hisifinicial = new FieldDef("hisifinicial",FieldDef.DATE);
      hisiffinal = new FieldDef("hisiffinal",FieldDef.DATE);
      hisibrenf = new FieldDef("hisibrenf",FieldDef.FLOAT,6,0);
      hisibracc = new FieldDef("hisibracc",FieldDef.FLOAT,6,0);
      hisirecaida = new FieldDef("hisirecaida",FieldDef.CHAR,1);
      hisicodrecaida = new FieldDef("hisicodrecaida",FieldDef.INTEGER,0);
      hisihextras = new FieldDef("hisihextras",FieldDef.FLOAT,6,0);
      hisihoras1 = new FieldDef("hisihoras1",FieldDef.FLOAT,6,0);
      hisicotiza = new FieldDef("hisicotiza",FieldDef.CHAR,1);
      hisireducmat = new FieldDef("hisireducmat",FieldDef.FLOAT,6,0);
      hisihospital = new FieldDef("hisihospital",FieldDef.CHAR,1);
      FieldDef array[] = {
        hisicodigo,
        hisicalculo,
        hisiejercicio,
        hisiperiodo,
        hisiproceso,
        hisicodiemp,
        hisicentro,
        hisitrabajador,
        hisitiphisi,
        hisifinicial,
        hisiffinal,
        hisibrenf,
        hisibracc,
        hisirecaida,
        hisicodrecaida,
        hisihextras,
        hisihoras1,
        hisicotiza,
        hisireducmat,
        hisihospital        
        };
      setColumns(array);
      FieldDef arrayf[] = {hisicodigo };
      setPrimaryKeys(arrayf);
      hisicodigo.setAutoIncrementable(true);
      hisicodigo.setDescription("Identificador del registro");
      hisicalculo.setDescription("Enlace con la tabla HISPERSO");
      hisiejercicio.setDescription("Ejercicio calculado");
      hisiperiodo.setDescription("Periodo calculado");
      hisiproceso.setDescription("Codigo Proceso");
      hisicodiemp.setDescription("Codigo Empresa");
      hisicentro.setDescription("Codigo Centro de Trabajo");
      hisitrabajador.setDescription("Codigo Trabajador");
      hisitiphisi.setDescription("Tipo Incidencia");
      hisifinicial.setDescription("Fecha Inicial");
      hisiffinal.setDescription("Fecha Final");
      hisibrenf.setDescription("Base Reguladora Enfermedad");
      hisibracc.setDescription("Base Reguladora Accidentes");
      hisirecaida.setDescription("Recaida");
      hisicodrecaida.setDescription("Codigo Incidencia recaida");
      hisihextras.setDescription("Promedio Horas Extras");
      hisihoras1.setDescription("Horas");
      hisicotiza.setDescription("Cotiza Seg. Social");
      hisireducmat.setDescription("Reduccion Maternidad");
      hisihospital.setDescription("Hospitalizacion");
      }
    }
    
  public class TabHisperso extends TableDef
    {
    // Campos
    public FieldDef hispcodigo;
    public FieldDef hispejercicio;
    public FieldDef hispperiodo;
    public FieldDef hispproceso;
    public FieldDef hispcodiemp;
    public FieldDef hispccc;
    public FieldDef hisptrabajador;
    public FieldDef hispcolectivo;
    public FieldDef hispcentro;
    public FieldDef hispdpto;
    public FieldDef hisppuesto;
    public FieldDef hispconvenio;
    public FieldDef hispregimenss;
    public FieldDef hispregcodi;
    public FieldDef hispcodicat;
    public FieldDef hispdescrcat;
    public FieldDef hisptarifa;
    public FieldDef hispepigraf;
    public FieldDef hispexcl65;
    public FieldDef hispclauirpf;
    public FieldDef hispporirpf;
    public FieldDef hisptipoirpf;
    public FieldDef hispfecantig;
    public FieldDef hispfeccalantig;
    public FieldDef hispfeccalpagas;
    public FieldDef hispfecamcat;
    public FieldDef hispfeconantig;
    public FieldDef hispexconcep;
    public FieldDef hispmesdia;
    public FieldDef hispbgarantia;
    public FieldDef hispbdtopagas;
    public FieldDef hispenlace;
    public FieldDef hispcodicto;
    public FieldDef hispduracto;
    public FieldDef hispcotizdes;
    public FieldDef hispparcial;
    public FieldDef hispdiashoras;
    public FieldDef hispporreduc;
    public FieldDef hispdias;
    public FieldDef hisphoras;
    public FieldDef hisplunesdia;
    public FieldDef hispluneshor;
    public FieldDef hispmartdia;
    public FieldDef hispmarthor;
    public FieldDef hispmierdia;
    public FieldDef hispmierhor;
    public FieldDef hispjuevdia;
    public FieldDef hispjuevhor;
    public FieldDef hispvierndia;
    public FieldDef hispviernhor;
    public FieldDef hispsabdia;
    public FieldDef hispsabhor;
    public FieldDef hispdomdia;
    public FieldDef hispdomhor;
    public FieldDef hispfestivos;
    public FieldDef hispfestivho;
    public FieldDef hisppluri;
    public FieldDef hispbasespor;
    public FieldDef hispporcen;
    public FieldDef hispbasmaxcom;
    public FieldDef hispbasmincom;
    public FieldDef hispbasmaxacc;
    public FieldDef hispbasminacc;
    public FieldDef hispformacio;
    public FieldDef hisphorasdis;
    public FieldDef hisphoraspre;
    public FieldDef hispparcialred;
    public FieldDef hispinterinid;
    public FieldDef hispsusti;
    public FieldDef hispbaseauton;
    public FieldDef hispcodboni1;
    public FieldDef hispporboni1;
    public FieldDef hispcodboni2;
    public FieldDef hispporboni2;
    public FieldDef hispcodboni3;
    public FieldDef hispporboni3;
    public FieldDef hispcodboni4;
    public FieldDef hispporboni4;
    public FieldDef hispcodboni5;
    public FieldDef hispporboni5;
    public FieldDef hispcodboni6;
    public FieldDef hispporboni6;
    public FieldDef hisprelacion;
    public FieldDef hispregfan;
    public FieldDef hispcontingente;
    public FieldDef hispcomunitario;
    public FieldDef hisp7dias;
    public FieldDef hisporigen;
    public FieldDef hispejeratrirpf;
    public FieldDef hispperiatrirpf;
    public FieldDef hispsscnae;
    public FieldDef hispocupasita;
    public FieldDef hisptransno;
    public FieldDef hisptrahijauto;
    public FieldDef hispcampuestra;
    public FieldDef hispatraexigi;
    public FieldDef hispuser;
    public FieldDef hispfechacalc;
    public FieldDef hisphoracalc;
    public FieldDef hispimpreso;
    public FieldDef hisptipocotagra;
    public FieldDef hisptipobonagra;
    public TabHisperso(String name)
      {
      super(name);
      hispcodigo = new FieldDef("hispcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hispejercicio = new FieldDef("hispejercicio",FieldDef.INTEGER,0);
      hispperiodo = new FieldDef("hispperiodo",FieldDef.INTEGER,0);
      hispproceso = new FieldDef("hispproceso",FieldDef.INTEGER,0);
      hispcodiemp = new FieldDef("hispcodiemp",FieldDef.INTEGER,0);
      hispccc = new FieldDef("hispccc",FieldDef.CHAR,11);
      hisptrabajador = new FieldDef("hisptrabajador",FieldDef.INTEGER,0);
      hispcolectivo = new FieldDef("hispcolectivo",FieldDef.INTEGER,0);
      hispcentro = new FieldDef("hispcentro",FieldDef.INTEGER,0);
      hispdpto = new FieldDef("hispdpto",FieldDef.INTEGER,0);
      hisppuesto = new FieldDef("hisppuesto",FieldDef.CHAR,30);
      hispconvenio = new FieldDef("hispconvenio",FieldDef.INTEGER,0);
      hispregimenss = new FieldDef("hispregimenss",FieldDef.INTEGER,0);
      hispregcodi = new FieldDef("hispregcodi",FieldDef.INTEGER,0);
      hispcodicat = new FieldDef("hispcodicat",FieldDef.INTEGER,0);
      hispdescrcat = new FieldDef("hispdescrcat",FieldDef.CHAR,20);
      hisptarifa = new FieldDef("hisptarifa",FieldDef.INTEGER,0);
      hispepigraf = new FieldDef("hispepigraf",FieldDef.INTEGER,0);
      hispexcl65 = new FieldDef("hispexcl65",FieldDef.CHAR,1);
      hispclauirpf = new FieldDef("hispclauirpf",FieldDef.CHAR,2);
      hispporirpf = new FieldDef("hispporirpf",FieldDef.FLOAT,6,0);
      hisptipoirpf = new FieldDef("hisptipoirpf",FieldDef.CHAR,1);
      hispfecantig = new FieldDef("hispfecantig",FieldDef.DATE);
      hispfeccalantig = new FieldDef("hispfeccalantig",FieldDef.DATE);
      hispfeccalpagas = new FieldDef("hispfeccalpagas",FieldDef.DATE);
      hispfecamcat = new FieldDef("hispfecamcat",FieldDef.DATE);
      hispfeconantig = new FieldDef("hispfeconantig",FieldDef.DATE);
      hispexconcep = new FieldDef("hispexconcep",FieldDef.CHAR,1);
      hispmesdia = new FieldDef("hispmesdia",FieldDef.CHAR,1);
      hispbgarantia = new FieldDef("hispbgarantia",FieldDef.CHAR,1);
      hispbdtopagas = new FieldDef("hispbdtopagas",FieldDef.CHAR,1);
      hispenlace = new FieldDef("hispenlace",FieldDef.INTEGER,0);
      hispcodicto = new FieldDef("hispcodicto",FieldDef.CHAR,10);
      hispduracto = new FieldDef("hispduracto",FieldDef.CHAR,1);
      hispcotizdes = new FieldDef("hispcotizdes",FieldDef.CHAR,2);
      hispparcial = new FieldDef("hispparcial",FieldDef.CHAR,1);
      hispdiashoras = new FieldDef("hispdiashoras",FieldDef.CHAR,1);
      hispporreduc = new FieldDef("hispporreduc",FieldDef.FLOAT,6,0);
      hispdias = new FieldDef("hispdias",FieldDef.FLOAT,6,0);
      hisphoras = new FieldDef("hisphoras",FieldDef.FLOAT,6,0);
      hisplunesdia = new FieldDef("hisplunesdia",FieldDef.CHAR,1);
      hispluneshor = new FieldDef("hispluneshor",FieldDef.FLOAT,6,0);
      hispmartdia = new FieldDef("hispmartdia",FieldDef.CHAR,1);
      hispmarthor = new FieldDef("hispmarthor",FieldDef.FLOAT,6,0);
      hispmierdia = new FieldDef("hispmierdia",FieldDef.CHAR,1);
      hispmierhor = new FieldDef("hispmierhor",FieldDef.FLOAT,6,0);
      hispjuevdia = new FieldDef("hispjuevdia",FieldDef.CHAR,1);
      hispjuevhor = new FieldDef("hispjuevhor",FieldDef.FLOAT,6,0);
      hispvierndia = new FieldDef("hispvierndia",FieldDef.CHAR,1);
      hispviernhor = new FieldDef("hispviernhor",FieldDef.FLOAT,6,0);
      hispsabdia = new FieldDef("hispsabdia",FieldDef.CHAR,1);
      hispsabhor = new FieldDef("hispsabhor",FieldDef.FLOAT,6,0);
      hispdomdia = new FieldDef("hispdomdia",FieldDef.CHAR,1);
      hispdomhor = new FieldDef("hispdomhor",FieldDef.FLOAT,6,0);
      hispfestivos = new FieldDef("hispfestivos",FieldDef.CHAR,1);
      hispfestivho = new FieldDef("hispfestivho",FieldDef.FLOAT,6,0);
      hisppluri = new FieldDef("hisppluri",FieldDef.CHAR,1);
      hispbasespor = new FieldDef("hispbasespor",FieldDef.CHAR,1);
      hispporcen = new FieldDef("hispporcen",FieldDef.FLOAT,6,0);
      hispbasmaxcom = new FieldDef("hispbasmaxcom",FieldDef.FLOAT,6,0);
      hispbasmincom = new FieldDef("hispbasmincom",FieldDef.FLOAT,6,0);
      hispbasmaxacc = new FieldDef("hispbasmaxacc",FieldDef.FLOAT,6,0);
      hispbasminacc = new FieldDef("hispbasminacc",FieldDef.FLOAT,6,0);
      hispformacio = new FieldDef("hispformacio",FieldDef.CHAR,1);
      hisphorasdis = new FieldDef("hisphorasdis",FieldDef.FLOAT,6,0);
      hisphoraspre = new FieldDef("hisphoraspre",FieldDef.FLOAT,6,0);
      hispparcialred = new FieldDef("hispparcialred",FieldDef.CHAR,1);
      hispinterinid = new FieldDef("hispinterinid",FieldDef.CHAR,1);
      hispsusti = new FieldDef("hispsusti",FieldDef.CHAR,1);
      hispbaseauton = new FieldDef("hispbaseauton",FieldDef.FLOAT,6,0);
      hispcodboni1 = new FieldDef("hispcodboni1",FieldDef.INTEGER,0);
      hispporboni1 = new FieldDef("hispporboni1",FieldDef.FLOAT,6,0);
      hispcodboni2 = new FieldDef("hispcodboni2",FieldDef.INTEGER,0);
      hispporboni2 = new FieldDef("hispporboni2",FieldDef.FLOAT,6,0);
      hispcodboni3 = new FieldDef("hispcodboni3",FieldDef.INTEGER,0);
      hispporboni3 = new FieldDef("hispporboni3",FieldDef.FLOAT,6,0);
      hispcodboni4 = new FieldDef("hispcodboni4",FieldDef.INTEGER,0);
      hispporboni4 = new FieldDef("hispporboni4",FieldDef.FLOAT,6,0);
      hispcodboni5 = new FieldDef("hispcodboni5",FieldDef.INTEGER,0);
      hispporboni5 = new FieldDef("hispporboni5",FieldDef.FLOAT,6,0);
      hispcodboni6 = new FieldDef("hispcodboni6",FieldDef.INTEGER,0);
      hispporboni6 = new FieldDef("hispporboni6",FieldDef.FLOAT,6,0);
      hisprelacion = new FieldDef("hisprelacion",FieldDef.INTEGER,0);
      hispregfan = new FieldDef("hispregfan",FieldDef.CHAR,3);
      hispcontingente = new FieldDef("hispcontingente",FieldDef.CHAR,1);
      hispcomunitario = new FieldDef("hispcomunitario",FieldDef.CHAR,1);
      hisp7dias = new FieldDef("hisp7dias",FieldDef.CHAR,1);
      hisporigen = new FieldDef("hisporigen",FieldDef.CHAR,1);
      hispejeratrirpf = new FieldDef("hispejeratrirpf",FieldDef.INTEGER,0);
      hispperiatrirpf = new FieldDef("hispperiatrirpf",FieldDef.INTEGER,0);
      hispsscnae = new FieldDef("hispsscnae",FieldDef.CHAR,7);
      hispocupasita = new FieldDef("hispocupasita",FieldDef.CHAR,1);
      hisptransno = new FieldDef("hisptransno",FieldDef.CHAR,1);
      hisptrahijauto = new FieldDef("hisptrahijauto",FieldDef.CHAR,1);
      hispcampuestra = new FieldDef("hispcampuestra",FieldDef.CHAR,1);
      hispatraexigi = new FieldDef("hispatraexigi",FieldDef.CHAR,1);
      hispuser = new FieldDef("hispuser",FieldDef.CHAR,25);
      hispfechacalc = new FieldDef("hispfechacalc",FieldDef.DATE);
      hisphoracalc = new FieldDef("hisphoracalc",FieldDef.CHAR,8);
      hispimpreso = new FieldDef("hispimpreso",FieldDef.CHAR,1);
      hisptipocotagra = new FieldDef("hisptipocotagra",FieldDef.CHAR,1);
      hisptipobonagra = new FieldDef("hisptipobonagra",FieldDef.INTEGER,0);
      FieldDef array[] = {
        hispcodigo,
        hispejercicio,
        hispperiodo,
        hispproceso,
        hispcodiemp,
        hispccc,
        hisptrabajador,
        hispcolectivo,
        hispcentro,
        hispdpto,
        hisppuesto,
        hispconvenio,
        hispregimenss,
        hispregcodi,
        hispcodicat,
        hispdescrcat,
        hisptarifa,
        hispepigraf,
        hispexcl65,
        hispclauirpf,
        hispporirpf,
        hisptipoirpf,
        hispfecantig,
        hispfeccalantig,
        hispfeccalpagas,
        hispfecamcat,
        hispfeconantig,
        hispexconcep,
        hispmesdia,
        hispbgarantia,
        hispbdtopagas,
        hispenlace,
        hispcodicto,
        hispduracto,
        hispcotizdes,
        hispparcial,
        hispdiashoras,
        hispporreduc,
        hispdias,
        hisphoras,
        hisplunesdia,
        hispluneshor,
        hispmartdia,
        hispmarthor,
        hispmierdia,
        hispmierhor,
        hispjuevdia,
        hispjuevhor,
        hispvierndia,
        hispviernhor,
        hispsabdia,
        hispsabhor,
        hispdomdia,
        hispdomhor,
        hispfestivos,
        hispfestivho,
        hisppluri,
        hispbasespor,
        hispporcen,
        hispbasmaxcom,
        hispbasmincom,
        hispbasmaxacc,
        hispbasminacc,
        hispformacio,
        hisphorasdis,
        hisphoraspre,
        hispparcialred,
        hispinterinid,
        hispsusti,
        hispbaseauton,
        hispcodboni1,
        hispporboni1,
        hispcodboni2,
        hispporboni2,
        hispcodboni3,
        hispporboni3,
        hispcodboni4,
        hispporboni4,
        hispcodboni5,
        hispporboni5,
        hispcodboni6,
        hispporboni6,
        hisprelacion,
        hispregfan,
        hispcontingente,
        hispcomunitario,
        hisp7dias,
        hisporigen,
        hispejeratrirpf,
        hispperiatrirpf,
        hispsscnae,
        hispocupasita,
        hisptransno,
        hisptrahijauto,
        hispcampuestra,
        hispatraexigi,
        hispuser,
        hispfechacalc,
        hisphoracalc,
        hispimpreso,
        hisptipocotagra,
        hisptipobonagra        
        };
      setColumns(array);
      FieldDef arrayf[] = {hispcodigo };
      setPrimaryKeys(arrayf);
      hispcodigo.setAutoIncrementable(true);
      hispcodigo.setDescription("Identificador del registro");
      hispejercicio.setDescription("Ejercicio calculado");
      hispperiodo.setDescription("Periodo calculado");
      hispproceso.setDescription("Codigo Proceso");
      hispcodiemp.setDescription("Codigo Empresa");
      hispccc.setDescription("Codigo Cuenta Cotizacion");
      hisptrabajador.setDescription("Codigo Trabajador");
      hispcolectivo.setDescription("Colectivo");
      hispcentro.setDescription("Centro de Trabajo");
      hispdpto.setDescription("Departamento");
      hisppuesto.setDescription("Puesto de trabajo");
      hispconvenio.setDescription("Convenio");
      hispregimenss.setDescription("Regimen Seg. Soc.");
      hispregcodi.setDescription("Subregimen Seg. Soc.");
      hispcodicat.setDescription("Codigo categoria");
      hispdescrcat.setDescription("Descripcion categoria");
      hisptarifa.setDescription("Codigo Tarifa");
      hispepigraf.setDescription("Epigrafe Accidentes");
      hispexcl65.setDescription("Exclusion mayor 65 años");
      hispclauirpf.setDescription("Clave IRPF");
      hispporirpf.setDescription("Porcentaje IRPF");
      hisptipoirpf.setDescription("Tipo Calculo IRPF");
      hispfecantig.setDescription("Fecha Antigüedad");
      hispfeccalantig.setDescription("Fecha Calculo Antigüedad");
      hispfeccalpagas.setDescription("Fecha Calculo Pagas");
      hispfecamcat.setDescription("Fecha Cambio Categoria");
      hispfeconantig.setDescription("Fecha As. Antigúedad");
      hispexconcep.setDescription("Exclusion Conceptos Categoria");
      hispmesdia.setDescription("Mensual-Diario");
      hispbgarantia.setDescription("Garantia Empresa");
      hispbdtopagas.setDescription("Descuento incidencias en Pagas");
      hispenlace.setDescription("Codigo Enlace");
      hispcodicto.setDescription("Codigo Contrato");
      hispduracto.setDescription("Duracion Contrato");
      hispcotizdes.setDescription("Cotiza Desempleo");
      hispparcial.setDescription("Tiempo Parcial");
      hispdiashoras.setDescription("T.P. Dias-Horas");
      hispporreduc.setDescription("Porcentaje Reduccion");
      hispdias.setDescription("Cobro Dias");
      hisphoras.setDescription("Cobro Horas");
      hisplunesdia.setDescription("Cobro Dias Lunes");
      hispluneshor.setDescription("Cobro Horas Lunes");
      hispmartdia.setDescription("Cobro Dias Martes");
      hispmarthor.setDescription("Cobro Horas Martes");
      hispmierdia.setDescription("Cobro Dias Miercoles");
      hispmierhor.setDescription("Cobro Horas Miercoles");
      hispjuevdia.setDescription("Cobro Dias Jueves");
      hispjuevhor.setDescription("Cobro Horas Jueves");
      hispvierndia.setDescription("Cobro Dias Viernes");
      hispviernhor.setDescription("Cobro Horas Viernes");
      hispsabdia.setDescription("Cobro Dias Sabado");
      hispsabhor.setDescription("Cobro Horas Sabado");
      hispdomdia.setDescription("Cobro Dias Domingo");
      hispdomhor.setDescription("Cobro Horas Domingo");
      hispfestivos.setDescription("Cobro Dias Festivos");
      hispfestivho.setDescription("Cobro Horas Festivos");
      hisppluri.setDescription("Pluriempleo");
      hispbasespor.setDescription("Bases Pluriempleo por porcentaje");
      hispporcen.setDescription("Porcentaje Bases Pluriempleo");
      hispbasmaxcom.setDescription("Pluriempleo Base Maxima Comun");
      hispbasmincom.setDescription("Pluriempleo Base Minima Comun");
      hispbasmaxacc.setDescription("Pluriempleo Base Maxima Accidentes");
      hispbasminacc.setDescription("Pluriempleo Base Minima Accidentes");
      hispformacio.setDescription("Contrato Formacion");
      hisphorasdis.setDescription("Formacion Horas Distancia");
      hisphoraspre.setDescription("Formacion Horas Presencia");
      hispparcialred.setDescription("Tiempo Parcial Reducido");
      hispinterinid.setDescription("Contrato Interinidad");
      hispsusti.setDescription("Contrato sustitucion");
      hispbaseauton.setDescription("Base Autonomos");
      hispcodboni1.setDescription("Codigo Bonificacion  1");
      hispporboni1.setDescription("Porcentaje Bonificacion 1");
      hispcodboni2.setDescription("Codigo Bonificacion  2");
      hispporboni2.setDescription("Porcentaje Bonificacion 2");
      hispcodboni3.setDescription("Codigo Bonificacion  3");
      hispporboni3.setDescription("Porcentaje Bonificacion 3");
      hispcodboni4.setDescription("Codigo Bonificacion  4");
      hispporboni4.setDescription("Porcentaje Bonificacion 4");
      hispcodboni5.setDescription("Codigo Bonificacion  5");
      hispporboni5.setDescription("Porcentaje Bonificacion 5");
      hispcodboni6.setDescription("Codigo Bonificacion  6");
      hispporboni6.setDescription("Porcentaje Bonificacion 6");
      hisprelacion.setDescription("Codigo Relacion Contractual");
      hispregfan.setDescription("Registro FAN");
      hispcontingente.setDescription("Contingente");
      hispcomunitario.setDescription("Comunitario");
      hisp7dias.setDescription("Contrato de duracion inferior a 7 dias");
      hisporigen.setDescription("Indica aplicacion origen grabacion (NULL o N = jNOMINA, H = RRHH)");
      hispejeratrirpf.setDescription("Ejercicio acumulado irpf atrasos");
      hispperiatrirpf.setDescription("Periodo   acumulado irpf atrasos");
      hispsscnae.setDescription("CNAE DEL CENTRO PARA EL CALCULO DE LOS EPIGRAFES A LA S.S.");
      hispocupasita.setDescription("CODIGO OCUPACION O SITUACION POR DEFECTO DE LOS TRABAJADORES");
      hisptransno.setDescription("Bloquear Transferencias");
      hisptrahijauto.setDescription("Trabajador hijo de autonomo menor de 30");
      hispcampuestra.setDescription("Trabajdor cambio de puesto de trabajo");
      hispatraexigi.setDescription("Es un calculo de Atrasos Exigibles");
      }
    }
    
  public class TabHiscontrol extends TableDef
    {
    // Campos
    public FieldDef hisccodigo;
    public FieldDef hisccalculo;
    public FieldDef hiscejercicio;
    public FieldDef hiscperiodo;
    public FieldDef hiscproceso;
    public FieldDef hisccodiemp;
    public FieldDef hisctrabajador;
    public FieldDef hisccalculado;
    public FieldDef hisccalfecha;
    public FieldDef hiscimpreso;
    public FieldDef hiscimpfecha;
    public FieldDef hisctransfer;
    public FieldDef hiscfectrans;
    public FieldDef hisctc;
    public FieldDef hiscfectc;
    public TabHiscontrol(String name)
      {
      super(name);
      hisccodigo = new FieldDef("hisccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hisccalculo = new FieldDef("hisccalculo",FieldDef.INTEGER,0);
      hiscejercicio = new FieldDef("hiscejercicio",FieldDef.INTEGER,0);
      hiscperiodo = new FieldDef("hiscperiodo",FieldDef.INTEGER,0);
      hiscproceso = new FieldDef("hiscproceso",FieldDef.INTEGER,0);
      hisccodiemp = new FieldDef("hisccodiemp",FieldDef.INTEGER,0);
      hisctrabajador = new FieldDef("hisctrabajador",FieldDef.INTEGER,0);
      hisccalculado = new FieldDef("hisccalculado",FieldDef.CHAR,1);
      hisccalfecha = new FieldDef("hisccalfecha",FieldDef.DATE);
      hiscimpreso = new FieldDef("hiscimpreso",FieldDef.CHAR,1);
      hiscimpfecha = new FieldDef("hiscimpfecha",FieldDef.DATE);
      hisctransfer = new FieldDef("hisctransfer",FieldDef.CHAR,1);
      hiscfectrans = new FieldDef("hiscfectrans",FieldDef.DATE);
      hisctc = new FieldDef("hisctc",FieldDef.CHAR,1);
      hiscfectc = new FieldDef("hiscfectc",FieldDef.DATE);
      FieldDef array[] = {
        hisccodigo,
        hisccalculo,
        hiscejercicio,
        hiscperiodo,
        hiscproceso,
        hisccodiemp,
        hisctrabajador,
        hisccalculado,
        hisccalfecha,
        hiscimpreso,
        hiscimpfecha,
        hisctransfer,
        hiscfectrans,
        hisctc,
        hiscfectc        
        };
      setColumns(array);
      FieldDef arrayf[] = {hisccodigo };
      setPrimaryKeys(arrayf);
      hisccodigo.setAutoIncrementable(true);
      hisccodigo.setDescription("Identificador del registro");
      hisccalculo.setDescription("Enlace con la tabla HISPERSO");
      hiscejercicio.setDescription("Ejercicio calculado");
      hiscperiodo.setDescription("Periodo calculado");
      hiscproceso.setDescription("Codigo Proceso");
      hisccodiemp.setDescription("Codigo Empresa");
      hisctrabajador.setDescription("Codigo Trabajador");
      hisccalculado.setDescription("Calculado");
      hisccalfecha.setDescription("Fecha Calculo");
      hiscimpreso.setDescription("Impreso");
      hiscimpfecha.setDescription("Fecha Impresion");
      hisctransfer.setDescription("Transferencia");
      hiscfectrans.setDescription("Fecha Transferencia");
      hisctc.setDescription("Obtencion TC");
      hiscfectc.setDescription("Fecha Obtencion TC");
      }
    }
    
  public class TabSeleccion extends TableDef
    {
    // Campos
    public FieldDef selcodigo;
    public FieldDef selusuario;
    public FieldDef selprograma;
    public FieldDef selcodiemp;
    public FieldDef selcentro;
    public FieldDef seltrabajador;
    public FieldDef selrelacion;
    public TabSeleccion(String name)
      {
      super(name);
      selcodigo = new FieldDef("selcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      selusuario = new FieldDef("selusuario",FieldDef.CHAR,25);
      selprograma = new FieldDef("selprograma",FieldDef.CHAR,15);
      selcodiemp = new FieldDef("selcodiemp",FieldDef.INTEGER,0);
      selcentro = new FieldDef("selcentro",FieldDef.INTEGER,0);
      seltrabajador = new FieldDef("seltrabajador",FieldDef.INTEGER,0);
      selrelacion = new FieldDef("selrelacion",FieldDef.INTEGER,0);
      FieldDef array[] = {
        selcodigo,
        selusuario,
        selprograma,
        selcodiemp,
        selcentro,
        seltrabajador,
        selrelacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {selcodigo };
      setPrimaryKeys(arrayf);
      selcodigo.setAutoIncrementable(true);
      selcodigo.setDescription("Código autoincrementable");
      selusuario.setDescription("Usuario");
      selprograma.setDescription("Programa");
      selcodiemp.setDescription("Empresa");
      selcentro.setDescription("Centro");
      seltrabajador.setDescription("Trabajador");
      selrelacion.setDescription("Relacion");
      }
    }
    
  public class TabSimulacion extends TableDef
    {
    // Campos
    public FieldDef simcodigo;
    public FieldDef simusuario;
    public FieldDef simprograma;
    public FieldDef simempresa;
    public FieldDef simcentro;
    public FieldDef simconcepto;
    public FieldDef simcategoria;
    public FieldDef simoperacion;
    public FieldDef simvariacion;
    public TabSimulacion(String name)
      {
      super(name);
      simcodigo = new FieldDef("simcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      simusuario = new FieldDef("simusuario",FieldDef.CHAR,25);
      simprograma = new FieldDef("simprograma",FieldDef.CHAR,15);
      simempresa = new FieldDef("simempresa",FieldDef.INTEGER,0);
      simcentro = new FieldDef("simcentro",FieldDef.INTEGER,0);
      simconcepto = new FieldDef("simconcepto",FieldDef.INTEGER,0);
      simcategoria = new FieldDef("simcategoria",FieldDef.INTEGER,0);
      simoperacion = new FieldDef("simoperacion",FieldDef.CHAR,1);
      simvariacion = new FieldDef("simvariacion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        simcodigo,
        simusuario,
        simprograma,
        simempresa,
        simcentro,
        simconcepto,
        simcategoria,
        simoperacion,
        simvariacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {simcodigo };
      setPrimaryKeys(arrayf);
      simcodigo.setAutoIncrementable(true);
      simcodigo.setDescription("Código autoincrementable");
      simusuario.setDescription("Usuario");
      simprograma.setDescription("Programa");
      simempresa.setDescription("Empresa");
      simcentro.setDescription("Centro");
      simconcepto.setDescription("Concepto");
      simcategoria.setDescription("Categoria");
      simoperacion.setDescription("Operación");
      simvariacion.setDescription("Variacion");
      }
    }
    
  public class TabRedarchivos extends TableDef
    {
    // Campos
    public FieldDef rarcodigo;
    public FieldDef rarnombre;
    public FieldDef rardesde;
    public FieldDef rarhasta;
    public FieldDef rarejercicio;
    public FieldDef rarperiodo;
    public FieldDef rarusuario;
    public FieldDef rarfecha;
    public FieldDef rarruta;
    public TabRedarchivos(String name)
      {
      super(name);
      rarcodigo = new FieldDef("rarcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      rarnombre = new FieldDef("rarnombre",FieldDef.CHAR,15);
      rardesde = new FieldDef("rardesde",FieldDef.INTEGER,0);
      rarhasta = new FieldDef("rarhasta",FieldDef.INTEGER,0);
      rarejercicio = new FieldDef("rarejercicio",FieldDef.INTEGER,0);
      rarperiodo = new FieldDef("rarperiodo",FieldDef.INTEGER,0);
      rarusuario = new FieldDef("rarusuario",FieldDef.CHAR,25);
      rarfecha = new FieldDef("rarfecha",FieldDef.DATE);
      rarruta = new FieldDef("rarruta",FieldDef.CHAR,150);
      FieldDef array[] = {
        rarcodigo,
        rarnombre,
        rardesde,
        rarhasta,
        rarejercicio,
        rarperiodo,
        rarusuario,
        rarfecha,
        rarruta        
        };
      setColumns(array);
      FieldDef arrayf[] = {rarcodigo };
      setPrimaryKeys(arrayf);
      rarcodigo.setDescription("Codigo");
      rarnombre.setDescription("Nombre Archivo");
      rardesde.setDescription("Contenido desde Empresa");
      rarhasta.setDescription("Contenido hasta Empresa");
      rarejercicio.setDescription("Ejercicio");
      rarperiodo.setDescription("Periodo");
      rarusuario.setDescription("Usuario");
      rarfecha.setDescription("Fecha");
      rarruta.setDescription("Ruta");
      }
    }
    
  public class TabRedtemporal extends TableDef
    {
    // Campos
    public FieldDef ratcodigo;
    public FieldDef ratusuario;
    public FieldDef ratempresa;
    public FieldDef rattrabajador;
    public FieldDef ratejercicio;
    public FieldDef ratperiodo;
    public FieldDef ratregistro;
    public TabRedtemporal(String name)
      {
      super(name);
      ratcodigo = new FieldDef("ratcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ratusuario = new FieldDef("ratusuario",FieldDef.CHAR,25);
      ratempresa = new FieldDef("ratempresa",FieldDef.INTEGER,0);
      rattrabajador = new FieldDef("rattrabajador",FieldDef.INTEGER,0);
      ratejercicio = new FieldDef("ratejercicio",FieldDef.INTEGER,0);
      ratperiodo = new FieldDef("ratperiodo",FieldDef.INTEGER,0);
      ratregistro = new FieldDef("ratregistro",FieldDef.CHAR,200);
      FieldDef array[] = {
        ratcodigo,
        ratusuario,
        ratempresa,
        rattrabajador,
        ratejercicio,
        ratperiodo,
        ratregistro        
        };
      setColumns(array);
      FieldDef arrayf[] = {ratcodigo };
      setPrimaryKeys(arrayf);
      ratcodigo.setDescription("Codigo");
      ratusuario.setDescription("Usuario");
      ratempresa.setDescription("Empresa");
      rattrabajador.setDescription("Trabajador");
      ratejercicio.setDescription("Ejercicio");
      ratperiodo.setDescription("Periodo");
      ratregistro.setDescription("Contenido registro RED");
      }
    }
    
  public class TabTracalirpf extends TableDef
    {
    // Campos
    public FieldDef tcicodigo;
    public FieldDef tciempresa;
    public FieldDef tcicentro;
    public FieldDef tcitrabajador;
    public FieldDef tciejercicio;
    public FieldDef tciperiodo;
    public FieldDef tciingvarcot;
    public FieldDef tciingvarnocot;
    public FieldDef tciingvarcotant;
    public FieldDef tciingvnocotant;
    public FieldDef tciingtrabajo;
    public FieldDef tciingbrutocal;
    public FieldDef tciregbrupag;
    public FieldDef tciregbrupdte;
    public FieldDef tciregrethis;
    public FieldDef tciregcuotapdte;
    public FieldDef tcideclminvalia;
    public FieldDef tcideclsitfam;
    public FieldDef tcideclrtoceuta;
    public FieldDef tcidecltipocto;
    public FieldDef tcideclirreg;
    public FieldDef tcideclsegsoc;
    public FieldDef tcideclminper;
    public FieldDef tcideclrdtrab;
    public FieldDef tcideclprolong;
    public FieldDef tcideclmovgeo;
    public FieldDef tcidecltrabact;
    public FieldDef tcidecledad;
    public FieldDef tcideclasis;
    public FieldDef tcidecldis3365;
    public FieldDef tcidecldis65;
    public FieldDef tcidecldismored;
    public FieldDef tcideclhabpasi;
    public FieldDef tcideclmas2desc;
    public FieldDef tcideclpencom;
    public FieldDef tcidescenmenor3;
    public FieldDef tcidescadopmen3;
    public FieldDef tcidescenen3y25;
    public FieldDef tcidescdis3365;
    public FieldDef tcidescdis65;
    public FieldDef tcidescdismred;
    public FieldDef tcidescentero;
    public FieldDef tcidescdeduc;
    public FieldDef tcidescdisc3365;
    public FieldDef tcidescdisc65;
    public FieldDef tcidescdiscmred;
    public FieldDef tcidesccuidhij;
    public FieldDef tcidescedad;
    public FieldDef tciascmayores65;
    public FieldDef tciascmayores75;
    public FieldDef tciascdisc3365;
    public FieldDef tciascdisc65;
    public FieldDef tciascpormovred;
    public FieldDef tciascporentero;
    public FieldDef tciascdeduc;
    public FieldDef tciascedad;
    public FieldDef tciascasist;
    public FieldDef tciascdis3365;
    public FieldDef tciascdis65;
    public FieldDef tciascdismovred;
    public FieldDef tciresttotreduc;
    public FieldDef tciresbasereten;
    public FieldDef tcirescuota;
    public FieldDef tciresbaseanua;
    public FieldDef tcirescuotaanua;
    public FieldDef tcirestipo;
    public FieldDef tcicopaamerica;
    public FieldDef tcicomentario;
    public FieldDef tcicuota1;
    public FieldDef tcicuota2;
    public FieldDef tciresum1;
    public FieldDef tciresum2;
    public FieldDef tciresum3;
    public FieldDef tciresum4;
    public FieldDef tciresum5;
    public FieldDef tciresum6;
    public FieldDef tciresum7;
    public FieldDef tciresum8;
    public FieldDef tciresum9;
    public FieldDef tciresum10;
    public FieldDef tciresum11;
    public FieldDef tcivivfinaciada;
    public FieldDef tcitipprevfinan;
    public FieldDef tcicuoprevfinan;
    public TabTracalirpf(String name)
      {
      super(name);
      tcicodigo = new FieldDef("tcicodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tciempresa = new FieldDef("tciempresa",FieldDef.INTEGER,0);
      tcicentro = new FieldDef("tcicentro",FieldDef.INTEGER,0);
      tcitrabajador = new FieldDef("tcitrabajador",FieldDef.INTEGER,0);
      tciejercicio = new FieldDef("tciejercicio",FieldDef.INTEGER,0);
      tciperiodo = new FieldDef("tciperiodo",FieldDef.INTEGER,0);
      tciingvarcot = new FieldDef("tciingvarcot",FieldDef.FLOAT,6,0);
      tciingvarnocot = new FieldDef("tciingvarnocot",FieldDef.FLOAT,6,0);
      tciingvarcotant = new FieldDef("tciingvarcotant",FieldDef.FLOAT,6,0);
      tciingvnocotant = new FieldDef("tciingvnocotant",FieldDef.FLOAT,6,0);
      tciingtrabajo = new FieldDef("tciingtrabajo",FieldDef.FLOAT,6,0);
      tciingbrutocal = new FieldDef("tciingbrutocal",FieldDef.FLOAT,6,0);
      tciregbrupag = new FieldDef("tciregbrupag",FieldDef.FLOAT,6,0);
      tciregbrupdte = new FieldDef("tciregbrupdte",FieldDef.FLOAT,6,0);
      tciregrethis = new FieldDef("tciregrethis",FieldDef.FLOAT,6,0);
      tciregcuotapdte = new FieldDef("tciregcuotapdte",FieldDef.FLOAT,6,0);
      tcideclminvalia = new FieldDef("tcideclminvalia",FieldDef.FLOAT,6,0);
      tcideclsitfam = new FieldDef("tcideclsitfam",FieldDef.CHAR,1);
      tcideclrtoceuta = new FieldDef("tcideclrtoceuta",FieldDef.CHAR,1);
      tcidecltipocto = new FieldDef("tcidecltipocto",FieldDef.CHAR,10);
      tcideclirreg = new FieldDef("tcideclirreg",FieldDef.FLOAT,6,0);
      tcideclsegsoc = new FieldDef("tcideclsegsoc",FieldDef.FLOAT,6,0);
      tcideclminper = new FieldDef("tcideclminper",FieldDef.FLOAT,6,0);
      tcideclrdtrab = new FieldDef("tcideclrdtrab",FieldDef.FLOAT,6,0);
      tcideclprolong = new FieldDef("tcideclprolong",FieldDef.FLOAT,6,0);
      tcideclmovgeo = new FieldDef("tcideclmovgeo",FieldDef.FLOAT,6,0);
      tcidecltrabact = new FieldDef("tcidecltrabact",FieldDef.FLOAT,6,0);
      tcidecledad = new FieldDef("tcidecledad",FieldDef.FLOAT,6,0);
      tcideclasis = new FieldDef("tcideclasis",FieldDef.FLOAT,6,0);
      tcidecldis3365 = new FieldDef("tcidecldis3365",FieldDef.FLOAT,6,0);
      tcidecldis65 = new FieldDef("tcidecldis65",FieldDef.FLOAT,6,0);
      tcidecldismored = new FieldDef("tcidecldismored",FieldDef.FLOAT,6,0);
      tcideclhabpasi = new FieldDef("tcideclhabpasi",FieldDef.FLOAT,6,0);
      tcideclmas2desc = new FieldDef("tcideclmas2desc",FieldDef.FLOAT,6,0);
      tcideclpencom = new FieldDef("tcideclpencom",FieldDef.FLOAT,6,0);
      tcidescenmenor3 = new FieldDef("tcidescenmenor3",FieldDef.INTEGER,0);
      tcidescadopmen3 = new FieldDef("tcidescadopmen3",FieldDef.INTEGER,0);
      tcidescenen3y25 = new FieldDef("tcidescenen3y25",FieldDef.INTEGER,0);
      tcidescdis3365 = new FieldDef("tcidescdis3365",FieldDef.INTEGER,0);
      tcidescdis65 = new FieldDef("tcidescdis65",FieldDef.INTEGER,0);
      tcidescdismred = new FieldDef("tcidescdismred",FieldDef.INTEGER,0);
      tcidescentero = new FieldDef("tcidescentero",FieldDef.INTEGER,0);
      tcidescdeduc = new FieldDef("tcidescdeduc",FieldDef.INTEGER,0);
      tcidescdisc3365 = new FieldDef("tcidescdisc3365",FieldDef.FLOAT,6,0);
      tcidescdisc65 = new FieldDef("tcidescdisc65",FieldDef.FLOAT,6,0);
      tcidescdiscmred = new FieldDef("tcidescdiscmred",FieldDef.FLOAT,6,0);
      tcidesccuidhij = new FieldDef("tcidesccuidhij",FieldDef.FLOAT,6,0);
      tcidescedad = new FieldDef("tcidescedad",FieldDef.FLOAT,6,0);
      tciascmayores65 = new FieldDef("tciascmayores65",FieldDef.INTEGER,0);
      tciascmayores75 = new FieldDef("tciascmayores75",FieldDef.INTEGER,0);
      tciascdisc3365 = new FieldDef("tciascdisc3365",FieldDef.INTEGER,0);
      tciascdisc65 = new FieldDef("tciascdisc65",FieldDef.INTEGER,0);
      tciascpormovred = new FieldDef("tciascpormovred",FieldDef.INTEGER,0);
      tciascporentero = new FieldDef("tciascporentero",FieldDef.INTEGER,0);
      tciascdeduc = new FieldDef("tciascdeduc",FieldDef.INTEGER,0);
      tciascedad = new FieldDef("tciascedad",FieldDef.FLOAT,6,0);
      tciascasist = new FieldDef("tciascasist",FieldDef.FLOAT,6,0);
      tciascdis3365 = new FieldDef("tciascdis3365",FieldDef.FLOAT,6,0);
      tciascdis65 = new FieldDef("tciascdis65",FieldDef.FLOAT,6,0);
      tciascdismovred = new FieldDef("tciascdismovred",FieldDef.FLOAT,6,0);
      tciresttotreduc = new FieldDef("tciresttotreduc",FieldDef.FLOAT,6,0);
      tciresbasereten = new FieldDef("tciresbasereten",FieldDef.FLOAT,6,0);
      tcirescuota = new FieldDef("tcirescuota",FieldDef.FLOAT,6,0);
      tciresbaseanua = new FieldDef("tciresbaseanua",FieldDef.FLOAT,6,0);
      tcirescuotaanua = new FieldDef("tcirescuotaanua",FieldDef.FLOAT,6,0);
      tcirestipo = new FieldDef("tcirestipo",FieldDef.FLOAT,6,0);
      tcicopaamerica = new FieldDef("tcicopaamerica",FieldDef.FLOAT,6,0);
      tcicomentario = new FieldDef("tcicomentario",FieldDef.CHAR,200);
      tcicuota1 = new FieldDef("tcicuota1",FieldDef.FLOAT,6,0);
      tcicuota2 = new FieldDef("tcicuota2",FieldDef.FLOAT,6,0);
      tciresum1 = new FieldDef("tciresum1",FieldDef.FLOAT,6,0);
      tciresum2 = new FieldDef("tciresum2",FieldDef.FLOAT,6,0);
      tciresum3 = new FieldDef("tciresum3",FieldDef.FLOAT,6,0);
      tciresum4 = new FieldDef("tciresum4",FieldDef.FLOAT,6,0);
      tciresum5 = new FieldDef("tciresum5",FieldDef.FLOAT,6,0);
      tciresum6 = new FieldDef("tciresum6",FieldDef.FLOAT,6,0);
      tciresum7 = new FieldDef("tciresum7",FieldDef.FLOAT,6,0);
      tciresum8 = new FieldDef("tciresum8",FieldDef.FLOAT,6,0);
      tciresum9 = new FieldDef("tciresum9",FieldDef.FLOAT,6,0);
      tciresum10 = new FieldDef("tciresum10",FieldDef.FLOAT,6,0);
      tciresum11 = new FieldDef("tciresum11",FieldDef.FLOAT,6,0);
      tcivivfinaciada = new FieldDef("tcivivfinaciada",FieldDef.CHAR,1);
      tcitipprevfinan = new FieldDef("tcitipprevfinan",FieldDef.FLOAT,6,0);
      tcicuoprevfinan = new FieldDef("tcicuoprevfinan",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        tcicodigo,
        tciempresa,
        tcicentro,
        tcitrabajador,
        tciejercicio,
        tciperiodo,
        tciingvarcot,
        tciingvarnocot,
        tciingvarcotant,
        tciingvnocotant,
        tciingtrabajo,
        tciingbrutocal,
        tciregbrupag,
        tciregbrupdte,
        tciregrethis,
        tciregcuotapdte,
        tcideclminvalia,
        tcideclsitfam,
        tcideclrtoceuta,
        tcidecltipocto,
        tcideclirreg,
        tcideclsegsoc,
        tcideclminper,
        tcideclrdtrab,
        tcideclprolong,
        tcideclmovgeo,
        tcidecltrabact,
        tcidecledad,
        tcideclasis,
        tcidecldis3365,
        tcidecldis65,
        tcidecldismored,
        tcideclhabpasi,
        tcideclmas2desc,
        tcideclpencom,
        tcidescenmenor3,
        tcidescadopmen3,
        tcidescenen3y25,
        tcidescdis3365,
        tcidescdis65,
        tcidescdismred,
        tcidescentero,
        tcidescdeduc,
        tcidescdisc3365,
        tcidescdisc65,
        tcidescdiscmred,
        tcidesccuidhij,
        tcidescedad,
        tciascmayores65,
        tciascmayores75,
        tciascdisc3365,
        tciascdisc65,
        tciascpormovred,
        tciascporentero,
        tciascdeduc,
        tciascedad,
        tciascasist,
        tciascdis3365,
        tciascdis65,
        tciascdismovred,
        tciresttotreduc,
        tciresbasereten,
        tcirescuota,
        tciresbaseanua,
        tcirescuotaanua,
        tcirestipo,
        tcicopaamerica,
        tcicomentario,
        tcicuota1,
        tcicuota2,
        tciresum1,
        tciresum2,
        tciresum3,
        tciresum4,
        tciresum5,
        tciresum6,
        tciresum7,
        tciresum8,
        tciresum9,
        tciresum10,
        tciresum11,
        tcivivfinaciada,
        tcitipprevfinan,
        tcicuoprevfinan        
        };
      setColumns(array);
      FieldDef arrayf[] = {tcicodigo };
      setPrimaryKeys(arrayf);
      tcicodigo.setAutoIncrementable(true);
      tcicodigo.setDescription("Codigo");
      tciempresa.setDescription("Empresa");
      tcicentro.setDescription("Centro de Trabajo");
      tcitrabajador.setDescription("Trabajador");
      tciejercicio.setDescription("Ejercicio");
      tciperiodo.setDescription("Periodo");
      tciingvarcot.setDescription("Ingresos variables que cotizan");
      tciingvarnocot.setDescription("Ingresos variables que no cotizan");
      tciingvarcotant.setDescription("Ingresos variables anteriores que cotizan");
      tciingvnocotant.setDescription("Ingresos variables anteriores que no cotizan");
      tciingtrabajo.setDescription("Ingresos Trabajo");
      tciingbrutocal.setDescription("Ingresos Brutos Calculados");
      tciregbrupag.setDescription("Bruto Pagado");
      tciregbrupdte.setDescription("Bruto Pendiente");
      tciregrethis.setDescription("Retenciones del Bruto pagado");
      tciregcuotapdte.setDescription("Retenciones del Bruto pendiente");
      tcideclminvalia.setDescription("Minusvalia");
      tcideclsitfam.setDescription("Codigo Situacion Familiar");
      tcideclrtoceuta.setDescription("Rendimiento de Ceuta-Melilla");
      tcidecltipocto.setDescription("Tipo Contrato");
      tcideclirreg.setDescription("Reduccion Rdtos. Irregulares");
      tcideclsegsoc.setDescription("Gastos Seguridad Social");
      tcideclminper.setDescription("Red. Minimo Personal");
      tcideclrdtrab.setDescription("Red. Rendimientos del Trabajo");
      tcideclprolong.setDescription("Red. Prolongacion Actividad");
      tcideclmovgeo.setDescription("Red. Movilidad Geografica");
      tcidecltrabact.setDescription("Red. Disca. Trab. Activos");
      tcidecledad.setDescription("Red. por Edad");
      tcideclasis.setDescription("Red. por asistencia");
      tcidecldis3365.setDescription("Red. Discapacidad entre 33 y 65 %");
      tcidecldis65.setDescription("Red. Discapacidad mayor 65%");
      tcidecldismored.setDescription("Red. Discapacidad Movilidad Reducida");
      tcideclmas2desc.setDescription("Red. Mas de dos descendientes");
      tcideclpencom.setDescription("Red. Pensiones Compensatorias");
      tcidescenmenor3.setDescription("Descendientes Menores 3 años");
      tcidescadopmen3.setDescription("Adoptados menores de 3 años");
      tcidescenen3y25.setDescription("Descendientes entre 3 y 25 años");
      tcidescdis3365.setDescription("Descendientes Discapa. entre 33 y 65 %");
      tcidescdis65.setDescription("Descendientes Discapa. mayor de 65 %");
      tcidescdismred.setDescription("Descen. Dicap. Mov. Reducida");
      tcidescentero.setDescription("Descendientes por Entero");
      tcidescdeduc.setDescription("Descendientes Deducibles");
      tcidescdisc3365.setDescription("Red. Descendientes Discapa. entre 33 y 65 %");
      tcidescdisc65.setDescription("Red. Descendientes Discapa. mayor de 65 %");
      tcidescdiscmred.setDescription("Red. Descen. Dicap. Mov. Reducida");
      tcidesccuidhij.setDescription("Red Descendientes Cuidado Hijos");
      tcidescedad.setDescription("Red Descendientes Deducibles");
      tciascmayores65.setDescription("Ascendientes mayores de 65 años");
      tciascmayores75.setDescription("Ascendientes mayores de 75 años");
      tciascdisc3365.setDescription("Ascen. Discap. entre 33 y 65%");
      tciascdisc65.setDescription("Ascen. Discap. mas de  65%");
      tciascpormovred.setDescription("Ascen. Movilidad Reducida");
      tciascporentero.setDescription("Ascendientes por entero");
      tciascdeduc.setDescription("Ascen. Deducibles");
      tciascedad.setDescription("Red. Ascen. por Edad");
      tciascasist.setDescription("Red. Ascen. por asistencia");
      tciascdis3365.setDescription("Red. Ascen. Discap. entre 33 y 65%");
      tciascdis65.setDescription("Red. Ascen. Discap. mas de 65%");
      tciascdismovred.setDescription("Red. Ascen. Movilidad Reducida");
      tciresttotreduc.setDescription("Total reducciones");
      tciresbasereten.setDescription("Base Retenciones");
      tcirescuota.setDescription("Cuota");
      tciresbaseanua.setDescription("Base Anual");
      tcirescuotaanua.setDescription("Cuota Anual");
      tcirestipo.setDescription("Tipo resultante");
      tcicopaamerica.setDescription("Reduccion Copa America");
      tcicomentario.setDescription("Comentario");
      }
    }
    
  public class TabTrairpfdet extends TableDef
    {
    // Campos
    public FieldDef tcdcodigo;
    public FieldDef tcdejercicio;
    public FieldDef tcdperiodo;
    public FieldDef tcdtipoimp;
    public FieldDef tcdtotdev;
    public FieldDef tcdimppaga;
    public FieldDef tcdsegsoc;
    public FieldDef tcdbaserenta;
    public TabTrairpfdet(String name)
      {
      super(name);
      tcdcodigo = new FieldDef("tcdcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tcdejercicio = new FieldDef("tcdejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tcdperiodo = new FieldDef("tcdperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tcdtipoimp = new FieldDef("tcdtipoimp",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tcdtotdev = new FieldDef("tcdtotdev",FieldDef.FLOAT,6,0);
      tcdimppaga = new FieldDef("tcdimppaga",FieldDef.FLOAT,6,0);
      tcdsegsoc = new FieldDef("tcdsegsoc",FieldDef.FLOAT,6,0);
      tcdbaserenta = new FieldDef("tcdbaserenta",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        tcdcodigo,
        tcdejercicio,
        tcdperiodo,
        tcdtipoimp,
        tcdtotdev,
        tcdimppaga,
        tcdsegsoc,
        tcdbaserenta        
        };
      setColumns(array);
      FieldDef arrayf[] = {tcdcodigo,tcdejercicio,tcdperiodo,tcdtipoimp };
      setPrimaryKeys(arrayf);
      tcdcodigo.setDescription("Codigo");
      tcdejercicio.setDescription("Ejercicio");
      tcdperiodo.setDescription("Periodo");
      tcdtipoimp.setDescription("Tipo Importe");
      tcdtotdev.setDescription("Total devengado");
      tcdimppaga.setDescription("Importe Paga");
      tcdsegsoc.setDescription("Seguridad Social");
      tcdbaserenta.setDescription("Base Renta");
      }
    }
    
  public class TabTrairpfcon extends TableDef
    {
    // Campos
    public FieldDef tcccodigo;
    public FieldDef tccejercicio;
    public FieldDef tccperiodo;
    public FieldDef tcctipoimp;
    public FieldDef tccconcepto;
    public FieldDef tccfactor;
    public FieldDef tccimporte;
    public TabTrairpfcon(String name)
      {
      super(name);
      tcccodigo = new FieldDef("tcccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tccejercicio = new FieldDef("tccejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tccperiodo = new FieldDef("tccperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tcctipoimp = new FieldDef("tcctipoimp",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tccconcepto = new FieldDef("tccconcepto",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tccfactor = new FieldDef("tccfactor",FieldDef.FLOAT,6,0);
      tccimporte = new FieldDef("tccimporte",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        tcccodigo,
        tccejercicio,
        tccperiodo,
        tcctipoimp,
        tccconcepto,
        tccfactor,
        tccimporte        
        };
      setColumns(array);
      FieldDef arrayf[] = {tcccodigo,tccejercicio,tccperiodo,tcctipoimp,tccconcepto };
      setPrimaryKeys(arrayf);
      tcccodigo.setDescription("Codigo");
      tccejercicio.setDescription("Ejercicio");
      tccperiodo.setDescription("Periodo");
      tcctipoimp.setDescription("Tipo Importe");
      tccconcepto.setDescription("Concepto");
      tccfactor.setDescription("Factor");
      tccimporte.setDescription("Importe");
      }
    }
    
  public class TabTrairpfvant extends TableDef
    {
    // Campos
    public FieldDef trvcodigo;
    public FieldDef trvvarieneroco;
    public FieldDef trvvarifebreco;
    public FieldDef trvvarimarzoco;
    public FieldDef trvvariabrilco;
    public FieldDef trvvarimayoco;
    public FieldDef trvvarijunioco;
    public FieldDef trvvarijulioco;
    public FieldDef trvvariagostoco;
    public FieldDef trvvariseptico;
    public FieldDef trvvarioctubco;
    public FieldDef trvvarinovico;
    public FieldDef trvvaridicico;
    public FieldDef trvvarienerono;
    public FieldDef trvvarifebreno;
    public FieldDef trvvarimarzono;
    public FieldDef trvvariabrilno;
    public FieldDef trvvarimayono;
    public FieldDef trvvarijuniono;
    public FieldDef trvvarijuliono;
    public FieldDef trvvariagostono;
    public FieldDef trvvariseptino;
    public FieldDef trvvarioctubno;
    public FieldDef trvvarinovino;
    public FieldDef trvvaridicino;
    public TabTrairpfvant(String name)
      {
      super(name);
      trvcodigo = new FieldDef("trvcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trvvarieneroco = new FieldDef("trvvarieneroco",FieldDef.FLOAT,6,0);
      trvvarifebreco = new FieldDef("trvvarifebreco",FieldDef.FLOAT,6,0);
      trvvarimarzoco = new FieldDef("trvvarimarzoco",FieldDef.FLOAT,6,0);
      trvvariabrilco = new FieldDef("trvvariabrilco",FieldDef.FLOAT,6,0);
      trvvarimayoco = new FieldDef("trvvarimayoco",FieldDef.FLOAT,6,0);
      trvvarijunioco = new FieldDef("trvvarijunioco",FieldDef.FLOAT,6,0);
      trvvarijulioco = new FieldDef("trvvarijulioco",FieldDef.FLOAT,6,0);
      trvvariagostoco = new FieldDef("trvvariagostoco",FieldDef.FLOAT,6,0);
      trvvariseptico = new FieldDef("trvvariseptico",FieldDef.FLOAT,6,0);
      trvvarioctubco = new FieldDef("trvvarioctubco",FieldDef.FLOAT,6,0);
      trvvarinovico = new FieldDef("trvvarinovico",FieldDef.FLOAT,6,0);
      trvvaridicico = new FieldDef("trvvaridicico",FieldDef.FLOAT,6,0);
      trvvarienerono = new FieldDef("trvvarienerono",FieldDef.FLOAT,6,0);
      trvvarifebreno = new FieldDef("trvvarifebreno",FieldDef.FLOAT,6,0);
      trvvarimarzono = new FieldDef("trvvarimarzono",FieldDef.FLOAT,6,0);
      trvvariabrilno = new FieldDef("trvvariabrilno",FieldDef.FLOAT,6,0);
      trvvarimayono = new FieldDef("trvvarimayono",FieldDef.FLOAT,6,0);
      trvvarijuniono = new FieldDef("trvvarijuniono",FieldDef.FLOAT,6,0);
      trvvarijuliono = new FieldDef("trvvarijuliono",FieldDef.FLOAT,6,0);
      trvvariagostono = new FieldDef("trvvariagostono",FieldDef.FLOAT,6,0);
      trvvariseptino = new FieldDef("trvvariseptino",FieldDef.FLOAT,6,0);
      trvvarioctubno = new FieldDef("trvvarioctubno",FieldDef.FLOAT,6,0);
      trvvarinovino = new FieldDef("trvvarinovino",FieldDef.FLOAT,6,0);
      trvvaridicino = new FieldDef("trvvaridicino",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        trvcodigo,
        trvvarieneroco,
        trvvarifebreco,
        trvvarimarzoco,
        trvvariabrilco,
        trvvarimayoco,
        trvvarijunioco,
        trvvarijulioco,
        trvvariagostoco,
        trvvariseptico,
        trvvarioctubco,
        trvvarinovico,
        trvvaridicico,
        trvvarienerono,
        trvvarifebreno,
        trvvarimarzono,
        trvvariabrilno,
        trvvarimayono,
        trvvarijuniono,
        trvvarijuliono,
        trvvariagostono,
        trvvariseptino,
        trvvarioctubno,
        trvvarinovino,
        trvvaridicino        
        };
      setColumns(array);
      FieldDef arrayf[] = {trvcodigo };
      setPrimaryKeys(arrayf);
      trvcodigo.setDescription("Codigo");
      trvvarieneroco.setDescription("Conceptos Variables Ejer Ant. Cotizan de Enero");
      trvvarifebreco.setDescription("Conceptos Variables Ejer Ant. Cotizan de Febrero");
      trvvarimarzoco.setDescription("Conceptos Variables Ejer Ant. Cotizan de Marzo");
      trvvariabrilco.setDescription("Conceptos Variables Ejer Ant. Cotizan de Abril");
      trvvarimayoco.setDescription("Conceptos Variables Ejer Ant. Cotizan de Mayo");
      trvvarijunioco.setDescription("Conceptos Variables Ejer Ant. Cotizan de Junio");
      trvvarijulioco.setDescription("Conceptos Variables Ejer Ant. Cotizan de Julio");
      trvvariagostoco.setDescription("Conceptos Variables Ejer Ant. Cotizan de Agosto");
      trvvariseptico.setDescription("Conceptos Variables Ejer Ant. Cotizan de Septiembre");
      trvvarioctubco.setDescription("Conceptos Variables Ejer Ant. Cotizan de Octubre");
      trvvarinovico.setDescription("Conceptos Variables Ejer Ant. Cotizan de Noviembre");
      trvvaridicico.setDescription("Conceptos Variables Ejer Ant. Cotizan de Diciembre");
      trvvarienerono.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Enero");
      trvvarifebreno.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Febrero");
      trvvarimarzono.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Marzo");
      trvvariabrilno.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Abril");
      trvvarimayono.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Mayo");
      trvvarijuniono.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Junio");
      trvvarijuliono.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Julio");
      trvvariagostono.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Agosto");
      trvvariseptino.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Septiembre");
      trvvarioctubno.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Octubre");
      trvvarinovino.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Noviembre");
      trvvaridicino.setDescription("Conceptos Variables Ejer Ant. No Cotizan de Diciembre");
      }
    }
    
  public class TabTrairpfrel extends TableDef
    {
    // Campos
    public FieldDef trrcodigo;
    public FieldDef trrempresa;
    public FieldDef trrtrabajador;
    public FieldDef trrrelacion;
    public FieldDef trrfechaalta;
    public FieldDef trrfechabaja;
    public FieldDef trrcodigocont;
    public TabTrairpfrel(String name)
      {
      super(name);
      trrcodigo = new FieldDef("trrcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trrempresa = new FieldDef("trrempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trrtrabajador = new FieldDef("trrtrabajador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trrrelacion = new FieldDef("trrrelacion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      trrfechaalta = new FieldDef("trrfechaalta",FieldDef.DATE);
      trrfechabaja = new FieldDef("trrfechabaja",FieldDef.DATE);
      trrcodigocont = new FieldDef("trrcodigocont",FieldDef.CHAR,10);
      FieldDef array[] = {
        trrcodigo,
        trrempresa,
        trrtrabajador,
        trrrelacion,
        trrfechaalta,
        trrfechabaja,
        trrcodigocont        
        };
      setColumns(array);
      FieldDef arrayf[] = {trrcodigo,trrempresa,trrtrabajador,trrrelacion };
      setPrimaryKeys(arrayf);
      trrcodigo.setDescription("Codigo");
      trrempresa.setDescription("Empresa");
      trrtrabajador.setDescription("Trabajador");
      trrrelacion.setDescription("Relacion Contractual");
      trrfechaalta.setDescription("Fecha Alta");
      trrfechabaja.setDescription("Fecha Baja");
      trrcodigocont.setDescription("Codigo Contrato");
      }
    }
    
  public class TabCnvglobal extends TableDef
    {
    // Campos
    public FieldDef cngempresa;
    public FieldDef cngfechaini;
    public FieldDef cngejerdesde;
    public FieldDef cngperdesde;
    public FieldDef cngejeractual;
    public FieldDef cngperactual;
    public FieldDef cnghistoricos;
    public FieldDef cngsegsoc;
    public FieldDef cngestado;
    public FieldDef cngusuario;
    public TabCnvglobal(String name)
      {
      super(name);
      cngempresa = new FieldDef("cngempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cngfechaini = new FieldDef("cngfechaini",FieldDef.DATE,FieldDef.NOTNULL);
      cngejerdesde = new FieldDef("cngejerdesde",FieldDef.INTEGER,0);
      cngperdesde = new FieldDef("cngperdesde",FieldDef.INTEGER,0);
      cngejeractual = new FieldDef("cngejeractual",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cngperactual = new FieldDef("cngperactual",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnghistoricos = new FieldDef("cnghistoricos",FieldDef.CHAR,1,FieldDef.NOTNULL);
      cngsegsoc = new FieldDef("cngsegsoc",FieldDef.CHAR,1,FieldDef.NOTNULL);
      cngestado = new FieldDef("cngestado",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cngusuario = new FieldDef("cngusuario",FieldDef.CHAR,15,FieldDef.NOTNULL);
      FieldDef array[] = {
        cngempresa,
        cngfechaini,
        cngejerdesde,
        cngperdesde,
        cngejeractual,
        cngperactual,
        cnghistoricos,
        cngsegsoc,
        cngestado,
        cngusuario        
        };
      setColumns(array);
      FieldDef arrayf[] = {cngempresa };
      setPrimaryKeys(arrayf);
      cngempresa.setDescription("Empresa Conversion");
      cngfechaini.setDescription("Fecha");
      cngejerdesde.setDescription("Desde Ejercicio");
      cngperdesde.setDescription("Desde Periodo");
      cngejeractual.setDescription("Hasta Ejercicio");
      cngperactual.setDescription("Hasta Periodo");
      cnghistoricos.setDescription("Historicos");
      cngsegsoc.setDescription("Seguridad Social");
      cngestado.setDescription("Estado");
      cngusuario.setDescription("Usuario");
      }
    }
    
  public class TabCnvdetalle extends TableDef
    {
    // Campos
    public FieldDef cndempresa;
    public FieldDef cnddetalle;
    public FieldDef cdddescripcion;
    public FieldDef cddestado;
    public FieldDef cddrepeticion;
    public TabCnvdetalle(String name)
      {
      super(name);
      cndempresa = new FieldDef("cndempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnddetalle = new FieldDef("cnddetalle",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cdddescripcion = new FieldDef("cdddescripcion",FieldDef.CHAR,20,FieldDef.NOTNULL);
      cddestado = new FieldDef("cddestado",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cddrepeticion = new FieldDef("cddrepeticion",FieldDef.CHAR,1,FieldDef.NOTNULL);
      FieldDef array[] = {
        cndempresa,
        cnddetalle,
        cdddescripcion,
        cddestado,
        cddrepeticion        
        };
      setColumns(array);
      FieldDef arrayf[] = {cndempresa,cnddetalle };
      setPrimaryKeys(arrayf);
      cndempresa.setDescription("Empresa Conversion");
      cnddetalle.setDescription("Numero registro");
      cdddescripcion.setDescription("Descripcion");
      cddestado.setDescription("Estado");
      cddrepeticion.setDescription("Repeticion");
      }
    }
    
  public class TabCnverrores extends TableDef
    {
    // Campos
    public FieldDef cnrid;
    public FieldDef cnrempresa;
    public FieldDef cnrdetalle;
    public FieldDef cnrcodigo;
    public FieldDef cnrdescripcion;
    public FieldDef cnrsolucion;
    public TabCnverrores(String name)
      {
      super(name);
      cnrid = new FieldDef("cnrid",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnrempresa = new FieldDef("cnrempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnrdetalle = new FieldDef("cnrdetalle",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnrcodigo = new FieldDef("cnrcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnrdescripcion = new FieldDef("cnrdescripcion",FieldDef.CHAR,255,FieldDef.NOTNULL);
      cnrsolucion = new FieldDef("cnrsolucion",FieldDef.CHAR,2000);
      FieldDef array[] = {
        cnrid,
        cnrempresa,
        cnrdetalle,
        cnrcodigo,
        cnrdescripcion,
        cnrsolucion        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnrid };
      setPrimaryKeys(arrayf);
      cnrid.setAutoIncrementable(true);
      cnrid.setDescription("Codigo");
      cnrempresa.setDescription("Empresa");
      cnrdetalle.setDescription("Codigo detalle conversion");
      cnrcodigo.setDescription("Codigo error");
      cnrdescripcion.setDescription("Descripcion");
      cnrsolucion.setDescription("Posible solucion");
      }
    }
    
  public class TabParamred extends TableDef
    {
    // Campos
    public FieldDef pmrid;
    public FieldDef pmrcontactored;
    public FieldDef pmrtelefonored;
    public FieldDef pmrfaxcontacto;
    public FieldDef pmrfechaautori;
    public FieldDef pmrautorizared;
    public FieldDef pmrsilconred;
    public FieldDef pmrindicaprueba;
    public FieldDef pmrcontadorfan;
    public FieldDef pmrubicacionred;
    public TabParamred(String name)
      {
      super(name);
      pmrid = new FieldDef("pmrid",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pmrcontactored = new FieldDef("pmrcontactored",FieldDef.CHAR,34);
      pmrtelefonored = new FieldDef("pmrtelefonored",FieldDef.CHAR,12);
      pmrfaxcontacto = new FieldDef("pmrfaxcontacto",FieldDef.CHAR,12);
      pmrfechaautori = new FieldDef("pmrfechaautori",FieldDef.DATE);
      pmrautorizared = new FieldDef("pmrautorizared",FieldDef.INTEGER,0);
      pmrsilconred = new FieldDef("pmrsilconred",FieldDef.CHAR,8);
      pmrindicaprueba = new FieldDef("pmrindicaprueba",FieldDef.CHAR,1);
      pmrcontadorfan = new FieldDef("pmrcontadorfan",FieldDef.INTEGER,0);
      pmrubicacionred = new FieldDef("pmrubicacionred",FieldDef.CHAR,235);
      FieldDef array[] = {
        pmrid,
        pmrcontactored,
        pmrtelefonored,
        pmrfaxcontacto,
        pmrfechaautori,
        pmrautorizared,
        pmrsilconred,
        pmrindicaprueba,
        pmrcontadorfan,
        pmrubicacionred        
        };
      setColumns(array);
      FieldDef arrayf[] = {pmrid };
      setPrimaryKeys(arrayf);
      pmrid.setDescription("Codiogo parametros sistema RED");
      pmrcontactored.setDescription("Persona de Contacto");
      pmrtelefonored.setDescription("Telefono de contacto");
      pmrfaxcontacto.setDescription("Fax de contacto");
      pmrfechaautori.setDescription("Fecha Autorizacion");
      pmrautorizared.setDescription("Autorizacion RED");
      pmrsilconred.setDescription("SILCON RED");
      pmrindicaprueba.setDescription("Indicativo de Prueba");
      pmrcontadorfan.setDescription("Contador FAN");
      pmrubicacionred.setDescription("Ubicacion sistema RED");
      }
    }
    
  public class TabMsgestado extends TableDef
    {
    // Campos
    public FieldDef msgcodigo;
    public FieldDef msgejercicio;
    public FieldDef msgperiodo;
    public FieldDef msgestados;
    public FieldDef msgselec;
    public FieldDef msgtipomsg;
    public FieldDef msgtipoliq;
    public FieldDef msgregimen;
    public FieldDef msgfechagen;
    public FieldDef msghoragen;
    public FieldDef msgfechapre;
    public FieldDef msgusuario;
    public FieldDef msgfichero;
    public FieldDef msgubicacion;
    public FieldDef msgcodiemp;
    public FieldDef msgcodicentro;
    public FieldDef msgtrabajador;
    public FieldDef msgcodrelacion;
    public TabMsgestado(String name)
      {
      super(name);
      msgcodigo = new FieldDef("msgcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      msgejercicio = new FieldDef("msgejercicio",FieldDef.INTEGER,0);
      msgperiodo = new FieldDef("msgperiodo",FieldDef.INTEGER,0);
      msgestados = new FieldDef("msgestados",FieldDef.CHAR,2);
      msgselec = new FieldDef("msgselec",FieldDef.CHAR,1);
      msgtipomsg = new FieldDef("msgtipomsg",FieldDef.CHAR,1);
      msgtipoliq = new FieldDef("msgtipoliq",FieldDef.CHAR,3);
      msgregimen = new FieldDef("msgregimen",FieldDef.INTEGER,0);
      msgfechagen = new FieldDef("msgfechagen",FieldDef.DATE);
      msghoragen = new FieldDef("msghoragen",FieldDef.CHAR,8);
      msgfechapre = new FieldDef("msgfechapre",FieldDef.DATE);
      msgusuario = new FieldDef("msgusuario",FieldDef.CHAR,25);
      msgfichero = new FieldDef("msgfichero",FieldDef.CHAR,25);
      msgubicacion = new FieldDef("msgubicacion",FieldDef.CHAR,250);
      msgcodiemp = new FieldDef("msgcodiemp",FieldDef.INTEGER,0);
      msgcodicentro = new FieldDef("msgcodicentro",FieldDef.INTEGER,0);
      msgtrabajador = new FieldDef("msgtrabajador",FieldDef.INTEGER,0);
      msgcodrelacion = new FieldDef("msgcodrelacion",FieldDef.INTEGER,0);
      FieldDef array[] = {
        msgcodigo,
        msgejercicio,
        msgperiodo,
        msgestados,
        msgselec,
        msgtipomsg,
        msgtipoliq,
        msgregimen,
        msgfechagen,
        msghoragen,
        msgfechapre,
        msgusuario,
        msgfichero,
        msgubicacion,
        msgcodiemp,
        msgcodicentro,
        msgtrabajador,
        msgcodrelacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {msgcodigo };
      setPrimaryKeys(arrayf);
      msgcodigo.setAutoIncrementable(true);
      msgcodigo.setDescription("Codigo");
      msgejercicio.setDescription("Ejercicio");
      msgperiodo.setDescription("Periodo");
      msgestados.setDescription("Estado Mensaje");
      msgselec.setDescription("Seleccionado");
      msgtipomsg.setDescription("Tipo Mensaje");
      msgtipoliq.setDescription("Tipo Liquidacion sistema RED");
      msgregimen.setDescription("Regimen");
      msgfechagen.setDescription("Fecha Generacion");
      msghoragen.setDescription("Hora Generacion");
      msgfechapre.setDescription("Fecha Presentacion");
      msgusuario.setDescription("Usuario");
      msgfichero.setDescription("Archivo");
      msgubicacion.setDescription("Ubicacion");
      msgcodiemp.setDescription("Empresa");
      msgcodicentro.setDescription("Centro");
      msgtrabajador.setDescription("Trabajador");
      msgcodrelacion.setDescription("Relacion");
      }
    }
    
  public class TabSegmento extends TableDef
    {
    // Campos
    public FieldDef segcodigo;
    public FieldDef segmsgestcod;
    public FieldDef segsubclv;
    public FieldDef segnumlin;
    public FieldDef segsegmento;
    public TabSegmento(String name)
      {
      super(name);
      segcodigo = new FieldDef("segcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      segmsgestcod = new FieldDef("segmsgestcod",FieldDef.INTEGER,0);
      segsubclv = new FieldDef("segsubclv",FieldDef.INTEGER,0);
      segnumlin = new FieldDef("segnumlin",FieldDef.INTEGER,0);
      segsegmento = new FieldDef("segsegmento",FieldDef.CHAR,250);
      FieldDef array[] = {
        segcodigo,
        segmsgestcod,
        segsubclv,
        segnumlin,
        segsegmento        
        };
      setColumns(array);
      FieldDef arrayf[] = {segcodigo };
      setPrimaryKeys(arrayf);
      segcodigo.setAutoIncrementable(true);
      segcodigo.setDescription("Codigo");
      segmsgestcod.setDescription("Codigo Segmento archivo FAN");
      segsubclv.setDescription("Subclave");
      segnumlin.setDescription("Numero de Linea");
      segsegmento.setDescription("Contenido Segmento");
      }
    }
    
  public class TabMsgestadodet extends TableDef
    {
    // Campos
    public FieldDef msgdcodigo;
    public FieldDef msgdmsgestcod;
    public FieldDef msgdcodiemp;
    public FieldDef msgdcentro;
    public FieldDef msgdtrabajador;
    public FieldDef msgdccc;
    public FieldDef msgdnaf;
    public TabMsgestadodet(String name)
      {
      super(name);
      msgdcodigo = new FieldDef("msgdcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      msgdmsgestcod = new FieldDef("msgdmsgestcod",FieldDef.INTEGER,0);
      msgdcodiemp = new FieldDef("msgdcodiemp",FieldDef.INTEGER,0);
      msgdcentro = new FieldDef("msgdcentro",FieldDef.INTEGER,0);
      msgdtrabajador = new FieldDef("msgdtrabajador",FieldDef.INTEGER,0);
      msgdccc = new FieldDef("msgdccc",FieldDef.CHAR,11);
      msgdnaf = new FieldDef("msgdnaf",FieldDef.CHAR,12);
      FieldDef array[] = {
        msgdcodigo,
        msgdmsgestcod,
        msgdcodiemp,
        msgdcentro,
        msgdtrabajador,
        msgdccc,
        msgdnaf        
        };
      setColumns(array);
      FieldDef arrayf[] = {msgdcodigo };
      setPrimaryKeys(arrayf);
      msgdcodigo.setAutoIncrementable(true);
      msgdcodigo.setDescription("Codigo");
      msgdmsgestcod.setDescription("Codigo Segmento archivo FAN");
      msgdcodiemp.setDescription("Cogido empresa");
      msgdcentro.setDescription("Cogido Centro");
      msgdtrabajador.setDescription("Cogido Trabajador");
      msgdccc.setDescription("Codigo Cuenta Cotizacion");
      msgdnaf.setDescription("NAF");
      }
    }
    
  public class TabTc1cab extends TableDef
    {
    // Campos
    public FieldDef tcccodigo;
    public FieldDef tccmsgestcod;
    public FieldDef tccclaseliq;
    public FieldDef tccempresa;
    public FieldDef tcccentro;
    public FieldDef tccccc;
    public FieldDef tccejercicio;
    public FieldDef tccperiodo;
    public FieldDef tccproceso;
    public FieldDef tccnumtrab;
    public FieldDef tccmodpago;
    public FieldDef tccmutua;
    public FieldDef tcccuota;
    public FieldDef tccdperiodo;
    public FieldDef tcchperiodo;
    public FieldDef tccotrcon106;
    public FieldDef tccreduc209;
    public FieldDef tccejerpago;
    public FieldDef tcctrabajador;
    public FieldDef tcccoditc13;
    public TabTc1cab(String name)
      {
      super(name);
      tcccodigo = new FieldDef("tcccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tccmsgestcod = new FieldDef("tccmsgestcod",FieldDef.INTEGER,0);
      tccclaseliq = new FieldDef("tccclaseliq",FieldDef.CHAR,4);
      tccempresa = new FieldDef("tccempresa",FieldDef.INTEGER,0);
      tcccentro = new FieldDef("tcccentro",FieldDef.INTEGER,0);
      tccccc = new FieldDef("tccccc",FieldDef.CHAR,11);
      tccejercicio = new FieldDef("tccejercicio",FieldDef.INTEGER,0);
      tccperiodo = new FieldDef("tccperiodo",FieldDef.INTEGER,0);
      tccproceso = new FieldDef("tccproceso",FieldDef.INTEGER,0);
      tccnumtrab = new FieldDef("tccnumtrab",FieldDef.INTEGER,0);
      tccmodpago = new FieldDef("tccmodpago",FieldDef.CHAR,4);
      tccmutua = new FieldDef("tccmutua",FieldDef.CHAR,4);
      tcccuota = new FieldDef("tcccuota",FieldDef.FLOAT,6,0);
      tccdperiodo = new FieldDef("tccdperiodo",FieldDef.INTEGER,0);
      tcchperiodo = new FieldDef("tcchperiodo",FieldDef.INTEGER,0);
      tccotrcon106 = new FieldDef("tccotrcon106",FieldDef.CHAR,2);
      tccreduc209 = new FieldDef("tccreduc209",FieldDef.CHAR,2);
      tccejerpago = new FieldDef("tccejerpago",FieldDef.INTEGER,0);
      tcctrabajador = new FieldDef("tcctrabajador",FieldDef.INTEGER,0);
      tcccoditc13 = new FieldDef("tcccoditc13",FieldDef.INTEGER,0);
      FieldDef array[] = {
        tcccodigo,
        tccmsgestcod,
        tccclaseliq,
        tccempresa,
        tcccentro,
        tccccc,
        tccejercicio,
        tccperiodo,
        tccproceso,
        tccnumtrab,
        tccmodpago,
        tccmutua,
        tcccuota,
        tccdperiodo,
        tcchperiodo,
        tccotrcon106,
        tccreduc209,
        tccejerpago,
        tcctrabajador,
        tcccoditc13        
        };
      setColumns(array);
      FieldDef arrayf[] = {tcccodigo };
      setPrimaryKeys(arrayf);
      tcccodigo.setAutoIncrementable(true);
      tcccodigo.setDescription("Codigo");
      tccmsgestcod.setDescription("Codigo mensaje");
      tccclaseliq.setDescription("Clase Liquidacion TC1");
      tccempresa.setDescription("Empresa");
      tcccentro.setDescription("Centro Trabajo");
      tccccc.setDescription("Codigo Cuenta Cotizacion");
      tccejercicio.setDescription("Ejercicio");
      tccperiodo.setDescription("Periodo");
      tccproceso.setDescription("Proceso");
      tccnumtrab.setDescription("Numero trabajadores");
      tccmodpago.setDescription("Modalidad Pago");
      tccmutua.setDescription("Mutua accidentes");
      tcccuota.setDescription("Cuota");
      tccdperiodo.setDescription("Desde Periodo");
      tcchperiodo.setDescription("Hasta Periodo");
      tccreduc209.setDescription("Reduccion 209");
      tccejerpago.setDescription("Ejercicio Pago");
      }
    }
    
  public class TabTc1det extends TableDef
    {
    // Campos
    public FieldDef tcdcodigo;
    public FieldDef tcdlinea;
    public FieldDef tcdtipolinea;
    public FieldDef tcdbase;
    public FieldDef tcdporcen;
    public FieldDef tcdcuota;
    public FieldDef tcdpatronal;
    public FieldDef tcdobrero;
    public TabTc1det(String name)
      {
      super(name);
      tcdcodigo = new FieldDef("tcdcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tcdlinea = new FieldDef("tcdlinea",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tcdtipolinea = new FieldDef("tcdtipolinea",FieldDef.INTEGER,0);
      tcdbase = new FieldDef("tcdbase",FieldDef.FLOAT,6,0);
      tcdporcen = new FieldDef("tcdporcen",FieldDef.FLOAT,6,0);
      tcdcuota = new FieldDef("tcdcuota",FieldDef.FLOAT,6,0);
      tcdpatronal = new FieldDef("tcdpatronal",FieldDef.FLOAT,6,0);
      tcdobrero = new FieldDef("tcdobrero",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        tcdcodigo,
        tcdlinea,
        tcdtipolinea,
        tcdbase,
        tcdporcen,
        tcdcuota,
        tcdpatronal,
        tcdobrero        
        };
      setColumns(array);
      FieldDef arrayf[] = {tcdcodigo,tcdlinea };
      setPrimaryKeys(arrayf);
      tcdcodigo.setDescription("Codigo");
      tcdlinea.setDescription("Numero de linea");
      tcdtipolinea.setDescription("Tipo Linea");
      tcdbase.setDescription("Base Cotizacion");
      tcdporcen.setDescription("Porcentaje");
      tcdcuota.setDescription("Cuota Total");
      tcdpatronal.setDescription("Cuota Patronal");
      tcdobrero.setDescription("Cuota Obrera");
      }
    }
    
  public class TabTc2 extends TableDef
    {
    // Campos
    public FieldDef tc2codigo;
    public FieldDef tc2tc1codi;
    public FieldDef tc2ejercicio;
    public FieldDef tc2periodo;
    public FieldDef tc2nombre;
    public FieldDef tc2ipf;
    public FieldDef tc2nif;
    public FieldDef tc2naf;
    public FieldDef tc2epi;
    public FieldDef tc2dias;
    public FieldDef tc2cbase;
    public FieldDef tc2impbase;
    public FieldDef tc2especial;
    public FieldDef tc2contrato;
    public FieldDef tc2cddias;
    public FieldDef tc2cdclave;
    public FieldDef tc2cdimporte;
    public FieldDef tc2cfecha;
    public FieldDef tc2ccc;
    public FieldDef tc2claveie;
    public FieldDef tc2idenemp;
    public TabTc2(String name)
      {
      super(name);
      tc2codigo = new FieldDef("tc2codigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tc2tc1codi = new FieldDef("tc2tc1codi",FieldDef.INTEGER,0);
      tc2ejercicio = new FieldDef("tc2ejercicio",FieldDef.INTEGER,0);
      tc2periodo = new FieldDef("tc2periodo",FieldDef.INTEGER,0);
      tc2nombre = new FieldDef("tc2nombre",FieldDef.CHAR,5);
      tc2ipf = new FieldDef("tc2ipf",FieldDef.CHAR,1);
      tc2nif = new FieldDef("tc2nif",FieldDef.CHAR,15);
      tc2naf = new FieldDef("tc2naf",FieldDef.CHAR,12);
      tc2epi = new FieldDef("tc2epi",FieldDef.CHAR,5);
      tc2dias = new FieldDef("tc2dias",FieldDef.INTEGER,0);
      tc2cbase = new FieldDef("tc2cbase",FieldDef.CHAR,2);
      tc2impbase = new FieldDef("tc2impbase",FieldDef.FLOAT,6,0);
      tc2especial = new FieldDef("tc2especial",FieldDef.CHAR,4);
      tc2contrato = new FieldDef("tc2contrato",FieldDef.INTEGER,0);
      tc2cddias = new FieldDef("tc2cddias",FieldDef.INTEGER,0);
      tc2cdclave = new FieldDef("tc2cdclave",FieldDef.CHAR,2);
      tc2cdimporte = new FieldDef("tc2cdimporte",FieldDef.FLOAT,6,0);
      tc2cfecha = new FieldDef("tc2cfecha",FieldDef.DATE);
      tc2ccc = new FieldDef("tc2ccc",FieldDef.CHAR,15);
      tc2claveie = new FieldDef("tc2claveie",FieldDef.CHAR,5);
      tc2idenemp = new FieldDef("tc2idenemp",FieldDef.CHAR,15);
      FieldDef array[] = {
        tc2codigo,
        tc2tc1codi,
        tc2ejercicio,
        tc2periodo,
        tc2nombre,
        tc2ipf,
        tc2nif,
        tc2naf,
        tc2epi,
        tc2dias,
        tc2cbase,
        tc2impbase,
        tc2especial,
        tc2contrato,
        tc2cddias,
        tc2cdclave,
        tc2cdimporte,
        tc2cfecha,
        tc2ccc,
        tc2claveie,
        tc2idenemp        
        };
      setColumns(array);
      FieldDef arrayf[] = {tc2codigo };
      setPrimaryKeys(arrayf);
      tc2codigo.setAutoIncrementable(true);
      tc2codigo.setDescription("Autoincrementable");
      tc2tc1codi.setDescription("Enlace con TC1CAB");
      tc2ejercicio.setDescription("Ejercicio");
      tc2periodo.setDescription("Periodo");
      tc2nombre.setDescription("Nombre abreviado 5 digitos");
      tc2ipf.setDescription("Tipo IPF");
      tc2nif.setDescription("NIF");
      tc2naf.setDescription("NAF");
      tc2epi.setDescription("Epigrafe");
      tc2dias.setDescription("Dias de la Base");
      tc2cbase.setDescription("Codigo de la Base");
      tc2impbase.setDescription("Importe de la Base");
      tc2especial.setDescription("Situación especial");
      tc2contrato.setDescription("Codigo contrato");
      tc2cddias.setDescription("Compensacion y deduccion numero de dias (Bonificaciones, Pagos Delegados, etc)");
      tc2cdclave.setDescription("Compensacion y deduccion codigo clave");
      tc2cdimporte.setDescription("Compensacion y deduccion importe deduccion");
      tc2cfecha.setDescription("Fecha");
      tc2ccc.setDescription("CCC Empresa para TC2 10");
      tc2claveie.setDescription("Clave IE Empresa para TC2 10");
      tc2idenemp.setDescription("Indentificador empresario TC2 10");
      }
    }
    
  public class TabTc2abrev extends TableDef
    {
    // Campos
    public FieldDef tc2acodigo;
    public FieldDef tc2atc1codi;
    public FieldDef tc2anaf;
    public FieldDef tc2aipf;
    public FieldDef tc2anif;
    public FieldDef tc2adiashoras;
    public FieldDef tc2acontrato;
    public FieldDef tc2aepigrafe;
    public FieldDef tc2adiasit;
    public FieldDef tc2adiasmat;
    public FieldDef tc2abaseacc;
    public FieldDef tc2ahorasex;
    public FieldDef tc2aimphorasex;
    public FieldDef tc2apresenhoras;
    public FieldDef tc2apresenimpor;
    public FieldDef tc2adisthoras;
    public FieldDef tc2adistimpor;
    public FieldDef tc2anombre;
    public FieldDef tc2afechabon;
    public TabTc2abrev(String name)
      {
      super(name);
      tc2acodigo = new FieldDef("tc2acodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tc2atc1codi = new FieldDef("tc2atc1codi",FieldDef.INTEGER,0);
      tc2anaf = new FieldDef("tc2anaf",FieldDef.CHAR,12);
      tc2aipf = new FieldDef("tc2aipf",FieldDef.CHAR,1);
      tc2anif = new FieldDef("tc2anif",FieldDef.CHAR,15);
      tc2adiashoras = new FieldDef("tc2adiashoras",FieldDef.INTEGER,0);
      tc2acontrato = new FieldDef("tc2acontrato",FieldDef.INTEGER,0);
      tc2aepigrafe = new FieldDef("tc2aepigrafe",FieldDef.CHAR,5);
      tc2adiasit = new FieldDef("tc2adiasit",FieldDef.INTEGER,0);
      tc2adiasmat = new FieldDef("tc2adiasmat",FieldDef.INTEGER,0);
      tc2abaseacc = new FieldDef("tc2abaseacc",FieldDef.FLOAT,6,0);
      tc2ahorasex = new FieldDef("tc2ahorasex",FieldDef.INTEGER,0);
      tc2aimphorasex = new FieldDef("tc2aimphorasex",FieldDef.FLOAT,6,0);
      tc2apresenhoras = new FieldDef("tc2apresenhoras",FieldDef.INTEGER,0);
      tc2apresenimpor = new FieldDef("tc2apresenimpor",FieldDef.FLOAT,6,0);
      tc2adisthoras = new FieldDef("tc2adisthoras",FieldDef.INTEGER,0);
      tc2adistimpor = new FieldDef("tc2adistimpor",FieldDef.FLOAT,6,0);
      tc2anombre = new FieldDef("tc2anombre",FieldDef.CHAR,5);
      tc2afechabon = new FieldDef("tc2afechabon",FieldDef.DATE);
      FieldDef array[] = {
        tc2acodigo,
        tc2atc1codi,
        tc2anaf,
        tc2aipf,
        tc2anif,
        tc2adiashoras,
        tc2acontrato,
        tc2aepigrafe,
        tc2adiasit,
        tc2adiasmat,
        tc2abaseacc,
        tc2ahorasex,
        tc2aimphorasex,
        tc2apresenhoras,
        tc2apresenimpor,
        tc2adisthoras,
        tc2adistimpor,
        tc2anombre,
        tc2afechabon        
        };
      setColumns(array);
      FieldDef arrayf[] = {tc2acodigo };
      setPrimaryKeys(arrayf);
      tc2acodigo.setAutoIncrementable(true);
      tc2acodigo.setDescription("Codigo");
      tc2atc1codi.setDescription("Codigo Registro TC1");
      tc2anaf.setDescription("NAF");
      tc2aipf.setDescription("Tipo IPF");
      tc2anif.setDescription("NIF");
      tc2adiashoras.setDescription("Dias-Horas");
      tc2acontrato.setDescription("Contrato");
      tc2aepigrafe.setDescription("Epigrafe");
      tc2adiasit.setDescription("Dias IT");
      tc2adiasmat.setDescription("Dias Maternidad");
      tc2abaseacc.setDescription("Base Accidentes");
      tc2ahorasex.setDescription("Horas Extras");
      tc2aimphorasex.setDescription("Importe Horas Extras");
      tc2apresenhoras.setDescription("Horas Presenciales");
      tc2apresenimpor.setDescription("Importe Horas Presenciales");
      tc2adisthoras.setDescription("Horas Distancia");
      tc2adistimpor.setDescription("Importe Horas Distancia");
      tc2anombre.setDescription("Nombre");
      tc2afechabon.setDescription("Fecha Bonificacion");
      }
    }
    
  public class TabMsgfdi extends TableDef
    {
    // Campos
    public FieldDef fdiidentif;
    public FieldDef fdimsgestado;
    public FieldDef fdiestado;
    public FieldDef fdiempresa;
    public FieldDef fditrabajador;
    public FieldDef fdiejer;
    public FieldDef fdiper;
    public FieldDef fditipo;
    public FieldDef fdiit;
    public FieldDef fdiitc;
    public FieldDef fdicolegprov;
    public FieldDef fdicolegnum;
    public FieldDef fdicias;
    public FieldDef fdifechaconf;
    public FieldDef fdiparteconf;
    public FieldDef fdidiasbaja;
    public FieldDef fdimesesbaja;
    public FieldDef fdiccc;
    public FieldDef fdicausaalta;
    public FieldDef fdicoleprovejer;
    public TabMsgfdi(String name)
      {
      super(name);
      fdiidentif = new FieldDef("fdiidentif",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fdimsgestado = new FieldDef("fdimsgestado",FieldDef.INTEGER,0);
      fdiestado = new FieldDef("fdiestado",FieldDef.CHAR,1);
      fdiempresa = new FieldDef("fdiempresa",FieldDef.INTEGER,0);
      fditrabajador = new FieldDef("fditrabajador",FieldDef.INTEGER,0);
      fdiejer = new FieldDef("fdiejer",FieldDef.INTEGER,0);
      fdiper = new FieldDef("fdiper",FieldDef.INTEGER,0);
      fditipo = new FieldDef("fditipo",FieldDef.CHAR,1);
      fdiit = new FieldDef("fdiit",FieldDef.INTEGER,0);
      fdiitc = new FieldDef("fdiitc",FieldDef.INTEGER,0);
      fdicolegprov = new FieldDef("fdicolegprov",FieldDef.INTEGER,0);
      fdicolegnum = new FieldDef("fdicolegnum",FieldDef.INTEGER,0);
      fdicias = new FieldDef("fdicias",FieldDef.CHAR,11);
      fdifechaconf = new FieldDef("fdifechaconf",FieldDef.DATE);
      fdiparteconf = new FieldDef("fdiparteconf",FieldDef.INTEGER,0);
      fdidiasbaja = new FieldDef("fdidiasbaja",FieldDef.INTEGER,0);
      fdimesesbaja = new FieldDef("fdimesesbaja",FieldDef.INTEGER,0);
      fdiccc = new FieldDef("fdiccc",FieldDef.CHAR,11);
      fdicausaalta = new FieldDef("fdicausaalta",FieldDef.CHAR,2);
      fdicoleprovejer = new FieldDef("fdicoleprovejer",FieldDef.INTEGER,0);
      FieldDef array[] = {
        fdiidentif,
        fdimsgestado,
        fdiestado,
        fdiempresa,
        fditrabajador,
        fdiejer,
        fdiper,
        fditipo,
        fdiit,
        fdiitc,
        fdicolegprov,
        fdicolegnum,
        fdicias,
        fdifechaconf,
        fdiparteconf,
        fdidiasbaja,
        fdimesesbaja,
        fdiccc,
        fdicausaalta,
        fdicoleprovejer        
        };
      setColumns(array);
      FieldDef arrayf[] = {fdiidentif };
      setPrimaryKeys(arrayf);
      fdiidentif.setAutoIncrementable(true);
      fdiidentif.setDescription("Autoincrementable");
      fdimsgestado.setDescription("Puntero al archivo MSGESTADO");
      fdiestado.setDescription("Estado del mensaje (Debe estar pendiente o traspasado al centro de mensajes)");
      fdiempresa.setDescription("Codigo empresa");
      fditrabajador.setDescription("Trabajador");
      fdiejer.setDescription("Ejercicio");
      fdiper.setDescription("Periodo");
      fditipo.setDescription("Tipo de Movimiento");
      fdiit.setDescription("Puntero de la it de la que procede de la tabla INCIDENCIAS");
      fdiitc.setDescription("Puntero de la it original de la que procede la recaida de  la tabla INCIDENCIAS");
      fdicolegprov.setDescription("Provincia del medico colegiado");
      fdicolegnum.setDescription("Numero de colegiado medico");
      fdicias.setDescription("CIAS");
      fdifechaconf.setDescription("Fecha parte de confirmacion");
      fdiparteconf.setDescription("Numero del parte de confirmacion");
      fdidiasbaja.setDescription("Dias probables de baja");
      fdimesesbaja.setDescription("Meses probable de baja");
      fdiccc.setDescription("Codigo Cuenta Cotizacion");
      fdicausaalta.setDescription("Causa Alta");
      fdicoleprovejer.setDescription("Provincia donde ejerce medico colegiado");
      }
    }
    
  public class TabMsgafi extends TableDef
    {
    // Campos
    public FieldDef afiidentif;
    public FieldDef afimsgestado;
    public FieldDef afiempresa;
    public FieldDef afitrabajador;
    public FieldDef afiejer;
    public FieldDef afiper;
    public FieldDef afitipo;
    public FieldDef afitrarelacion;
    public TabMsgafi(String name)
      {
      super(name);
      afiidentif = new FieldDef("afiidentif",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      afimsgestado = new FieldDef("afimsgestado",FieldDef.INTEGER,0);
      afiempresa = new FieldDef("afiempresa",FieldDef.INTEGER,0);
      afitrabajador = new FieldDef("afitrabajador",FieldDef.INTEGER,0);
      afiejer = new FieldDef("afiejer",FieldDef.INTEGER,0);
      afiper = new FieldDef("afiper",FieldDef.INTEGER,0);
      afitipo = new FieldDef("afitipo",FieldDef.CHAR,1);
      afitrarelacion = new FieldDef("afitrarelacion",FieldDef.INTEGER,0);
      FieldDef array[] = {
        afiidentif,
        afimsgestado,
        afiempresa,
        afitrabajador,
        afiejer,
        afiper,
        afitipo,
        afitrarelacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {afiidentif };
      setPrimaryKeys(arrayf);
      afiidentif.setAutoIncrementable(true);
      afiidentif.setDescription("Codigo");
      afimsgestado.setDescription("Estado mensaje");
      afitrabajador.setDescription("Trabajador");
      afiejer.setDescription("Ejercicio");
      afiper.setDescription("Periodo");
      afitipo.setDescription("Tipo mensaje");
      afitrarelacion.setDescription("Codigo relacion contractual");
      }
    }
    
  public class TabConversion extends TableDef
    {
    // Campos
    public FieldDef cnvruta;
    public FieldDef cnvempresagyc;
    public FieldDef cnvempresaasp;
    public FieldDef cnvcambiocod;
    public FieldDef cnvfechaconver;
    public FieldDef cnvejerdesde;
    public FieldDef cnvhastaejer;
    public FieldDef cnvhastaper;
    public FieldDef cnvcdp;
    public FieldDef cnvestado;
    public FieldDef cnvusuario;
    public FieldDef cnvpasos;
    public FieldDef cnvestadoval;
    public FieldDef cnvobserva;
    public TabConversion(String name)
      {
      super(name);
      cnvruta = new FieldDef("cnvruta",FieldDef.CHAR,80,FieldDef.NOTNULL);
      cnvempresagyc = new FieldDef("cnvempresagyc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnvempresaasp = new FieldDef("cnvempresaasp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnvcambiocod = new FieldDef("cnvcambiocod",FieldDef.CHAR,1,FieldDef.NOTNULL);
      cnvfechaconver = new FieldDef("cnvfechaconver",FieldDef.DATE,FieldDef.NOTNULL);
      cnvejerdesde = new FieldDef("cnvejerdesde",FieldDef.INTEGER,0);
      cnvhastaejer = new FieldDef("cnvhastaejer",FieldDef.INTEGER,0);
      cnvhastaper = new FieldDef("cnvhastaper",FieldDef.INTEGER,0);
      cnvcdp = new FieldDef("cnvcdp",FieldDef.CHAR,12);
      cnvestado = new FieldDef("cnvestado",FieldDef.CHAR,1);
      cnvusuario = new FieldDef("cnvusuario",FieldDef.CHAR,15,FieldDef.NOTNULL);
      cnvpasos = new FieldDef("cnvpasos",FieldDef.CHAR,100);
      cnvestadoval = new FieldDef("cnvestadoval",FieldDef.CHAR,1);
      cnvobserva = new FieldDef("cnvobserva",FieldDef.CHAR,100);
      FieldDef array[] = {
        cnvruta,
        cnvempresagyc,
        cnvempresaasp,
        cnvcambiocod,
        cnvfechaconver,
        cnvejerdesde,
        cnvhastaejer,
        cnvhastaper,
        cnvcdp,
        cnvestado,
        cnvusuario,
        cnvpasos,
        cnvestadoval,
        cnvobserva        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnvruta,cnvempresagyc };
      setPrimaryKeys(arrayf);
      cnvruta.setDescription("Ruta Archivos");
      cnvempresagyc.setDescription("Codigo Empresa Anterior Nomina");
      cnvempresaasp.setDescription("Nuevo Codigo Empresa");
      cnvcambiocod.setDescription("Cambio Codigo");
      cnvfechaconver.setDescription("Fecha conversion");
      cnvejerdesde.setDescription("Desde Ejercicio");
      cnvhastaejer.setDescription("Hasta Ejercicio");
      cnvhastaper.setDescription("Hasta Periodo");
      cnvcdp.setDescription("Codigo CDP");
      cnvestado.setDescription("Estado");
      cnvusuario.setDescription("Usuario");
      cnvpasos.setDescription("Estado pasos");
      cnvestadoval.setDescription("Estado validacion");
      cnvobserva.setDescription("Observaciones de la conversion");
      }
    }
    
  public class TabCnvtest extends TableDef
    {
    // Campos
    public FieldDef tesruta;
    public FieldDef tesempresagyc;
    public FieldDef testrabajador;
    public FieldDef tesejercicio;
    public FieldDef tesperiodo;
    public FieldDef tesproceso;
    public FieldDef tesestado;
    public TabCnvtest(String name)
      {
      super(name);
      tesruta = new FieldDef("tesruta",FieldDef.CHAR,80,FieldDef.NOTNULL);
      tesempresagyc = new FieldDef("tesempresagyc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      testrabajador = new FieldDef("testrabajador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tesejercicio = new FieldDef("tesejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tesperiodo = new FieldDef("tesperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tesproceso = new FieldDef("tesproceso",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tesestado = new FieldDef("tesestado",FieldDef.CHAR,1);
      FieldDef array[] = {
        tesruta,
        tesempresagyc,
        testrabajador,
        tesejercicio,
        tesperiodo,
        tesproceso,
        tesestado        
        };
      setColumns(array);
      FieldDef arrayf[] = {tesruta,tesempresagyc,testrabajador,tesejercicio,tesperiodo,tesproceso };
      setPrimaryKeys(arrayf);
      tesruta.setDescription("Ruta Test");
      tesempresagyc.setDescription("Empresa anterior");
      testrabajador.setDescription("Trabajador");
      tesejercicio.setDescription("Ejercicio");
      tesperiodo.setDescription("Periodo");
      tesproceso.setDescription("Proceso");
      tesestado.setDescription("Estado");
      }
    }
    
  public class TabCnvtestdet extends TableDef
    {
    // Campos
    public FieldDef tedruta;
    public FieldDef tedempresagyc;
    public FieldDef tedtrabajador;
    public FieldDef tedejercicio;
    public FieldDef tedperiodo;
    public FieldDef tedproceso;
    public FieldDef tedconcepto;
    public FieldDef teddesc;
    public FieldDef tedimporteant;
    public FieldDef tedimportenew;
    public FieldDef tedanalisis;
    public TabCnvtestdet(String name)
      {
      super(name);
      tedruta = new FieldDef("tedruta",FieldDef.CHAR,80,FieldDef.NOTNULL);
      tedempresagyc = new FieldDef("tedempresagyc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tedtrabajador = new FieldDef("tedtrabajador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tedejercicio = new FieldDef("tedejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tedperiodo = new FieldDef("tedperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tedproceso = new FieldDef("tedproceso",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tedconcepto = new FieldDef("tedconcepto",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      teddesc = new FieldDef("teddesc",FieldDef.CHAR,30);
      tedimporteant = new FieldDef("tedimporteant",FieldDef.FLOAT,6,0);
      tedimportenew = new FieldDef("tedimportenew",FieldDef.FLOAT,6,0);
      tedanalisis = new FieldDef("tedanalisis",FieldDef.CHAR,200);
      FieldDef array[] = {
        tedruta,
        tedempresagyc,
        tedtrabajador,
        tedejercicio,
        tedperiodo,
        tedproceso,
        tedconcepto,
        teddesc,
        tedimporteant,
        tedimportenew,
        tedanalisis        
        };
      setColumns(array);
      FieldDef arrayf[] = {tedruta,tedempresagyc,tedtrabajador,tedejercicio,tedperiodo,tedproceso,tedconcepto };
      setPrimaryKeys(arrayf);
      tedruta.setDescription("Ruta archivos");
      tedempresagyc.setDescription("Codigo Empresa anterior");
      tedtrabajador.setDescription("Trabajador");
      tedejercicio.setDescription("Ejercicio");
      tedperiodo.setDescription("Periodo");
      tedproceso.setDescription("Proceso");
      tedconcepto.setDescription("Concepto de retribucion");
      teddesc.setDescription("Descripcion");
      tedimporteant.setDescription("Importe nomina anterior");
      tedimportenew.setDescription("Importe nueva nomina");
      tedanalisis.setDescription("Analisis diferencia");
      }
    }
    
  public class TabCnvtc1cab extends TableDef
    {
    // Campos
    public FieldDef ctcindice;
    public FieldDef ctcruta;
    public FieldDef ctcempresa;
    public FieldDef ctcejercicio;
    public FieldDef ctcperiodo;
    public FieldDef ctcproceso;
    public FieldDef ctcccc;
    public FieldDef ctcestado;
    public TabCnvtc1cab(String name)
      {
      super(name);
      ctcindice = new FieldDef("ctcindice",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ctcruta = new FieldDef("ctcruta",FieldDef.CHAR,80);
      ctcempresa = new FieldDef("ctcempresa",FieldDef.INTEGER,0);
      ctcejercicio = new FieldDef("ctcejercicio",FieldDef.INTEGER,0);
      ctcperiodo = new FieldDef("ctcperiodo",FieldDef.INTEGER,0);
      ctcproceso = new FieldDef("ctcproceso",FieldDef.INTEGER,0);
      ctcccc = new FieldDef("ctcccc",FieldDef.CHAR,12);
      ctcestado = new FieldDef("ctcestado",FieldDef.CHAR,1);
      FieldDef array[] = {
        ctcindice,
        ctcruta,
        ctcempresa,
        ctcejercicio,
        ctcperiodo,
        ctcproceso,
        ctcccc,
        ctcestado        
        };
      setColumns(array);
      FieldDef arrayf[] = {ctcindice };
      setPrimaryKeys(arrayf);
      ctcindice.setAutoIncrementable(true);
      ctcindice.setDescription("Codigo");
      ctcruta.setDescription("Ruta archivo");
      ctcempresa.setDescription("Empresa");
      ctcejercicio.setDescription("Ejercicio");
      ctcperiodo.setDescription("Periodo");
      ctcproceso.setDescription("Proceso");
      ctcccc.setDescription("Codigo Cuenta Cotizacion");
      ctcestado.setDescription("Estado");
      }
    }
    
  public class TabCnvtc1det extends TableDef
    {
    // Campos
    public FieldDef ctdindice;
    public FieldDef ctdlinia;
    public FieldDef ctdcasilla;
    public FieldDef ctddescrip;
    public FieldDef ctdimporteold;
    public FieldDef ctdimportenew;
    public TabCnvtc1det(String name)
      {
      super(name);
      ctdindice = new FieldDef("ctdindice",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ctdlinia = new FieldDef("ctdlinia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ctdcasilla = new FieldDef("ctdcasilla",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ctddescrip = new FieldDef("ctddescrip",FieldDef.CHAR,50);
      ctdimporteold = new FieldDef("ctdimporteold",FieldDef.FLOAT,6,0);
      ctdimportenew = new FieldDef("ctdimportenew",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ctdindice,
        ctdlinia,
        ctdcasilla,
        ctddescrip,
        ctdimporteold,
        ctdimportenew        
        };
      setColumns(array);
      FieldDef arrayf[] = {ctdindice,ctdlinia,ctdcasilla };
      setPrimaryKeys(arrayf);
      ctdindice.setDescription("Indice");
      ctdlinia.setDescription("Linea TC1");
      ctdcasilla.setDescription("Codigo casilla");
      ctddescrip.setDescription("Descripcion");
      ctdimporteold.setDescription("Importe nomina anterior");
      ctdimportenew.setDescription("Importe actual");
      }
    }
    
  public class TabDefdircab extends TableDef
    {
    // Campos
    public FieldDef ddcdiario;
    public FieldDef ddcdescrip;
    public FieldDef ddcplantilla;
    public TabDefdircab(String name)
      {
      super(name);
      ddcdiario = new FieldDef("ddcdiario",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ddcdescrip = new FieldDef("ddcdescrip",FieldDef.CHAR,50);
      ddcplantilla = new FieldDef("ddcplantilla",FieldDef.CHAR,100);
      FieldDef array[] = {
        ddcdiario,
        ddcdescrip,
        ddcplantilla        
        };
      setColumns(array);
      FieldDef arrayf[] = {ddcdiario };
      setPrimaryKeys(arrayf);
      ddcdiario.setDescription("Codigo Diario");
      ddcdescrip.setDescription("Descripcion");
      ddcplantilla.setDescription("Plantilla");
      }
    }
    
  public class TabDefdircol extends TableDef
    {
    // Campos
    public FieldDef ddodiario;
    public FieldDef ddocolumna;
    public FieldDef ddodescrip;
    public TabDefdircol(String name)
      {
      super(name);
      ddodiario = new FieldDef("ddodiario",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ddocolumna = new FieldDef("ddocolumna",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ddodescrip = new FieldDef("ddodescrip",FieldDef.CHAR,15);
      FieldDef array[] = {
        ddodiario,
        ddocolumna,
        ddodescrip        
        };
      setColumns(array);
      FieldDef arrayf[] = {ddodiario,ddocolumna };
      setPrimaryKeys(arrayf);
      ddodiario.setDescription("Codigo Diario");
      ddocolumna.setDescription("Columna");
      ddodescrip.setDescription("Descripcion Columna");
      }
    }
    
  public class TabDefdircon extends TableDef
    {
    // Campos
    public FieldDef ddndiario;
    public FieldDef ddncolumna;
    public FieldDef ddnitem;
    public FieldDef ddntipo;
    public FieldDef ddnconcepto;
    public FieldDef ddnliteral;
    public FieldDef ddnoperacion;
    public TabDefdircon(String name)
      {
      super(name);
      ddndiario = new FieldDef("ddndiario",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ddncolumna = new FieldDef("ddncolumna",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ddnitem = new FieldDef("ddnitem",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ddntipo = new FieldDef("ddntipo",FieldDef.CHAR,1);
      ddnconcepto = new FieldDef("ddnconcepto",FieldDef.CHAR,6);
      ddnliteral = new FieldDef("ddnliteral",FieldDef.FLOAT,6,0);
      ddnoperacion = new FieldDef("ddnoperacion",FieldDef.CHAR,1);
      FieldDef array[] = {
        ddndiario,
        ddncolumna,
        ddnitem,
        ddntipo,
        ddnconcepto,
        ddnliteral,
        ddnoperacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {ddndiario,ddncolumna,ddnitem };
      setPrimaryKeys(arrayf);
      ddndiario.setDescription("Codigo Diario");
      ddncolumna.setDescription("Numero columna");
      ddnitem.setDescription("Numero concepto");
      ddntipo.setDescription("Tipo concepto");
      ddnconcepto.setDescription("Codigo Concepto");
      ddnliteral.setDescription("Literal");
      ddnoperacion.setDescription("Operacion artitmetica");
      }
    }
    
  public class TabValoresdir extends TableDef
    {
    // Campos
    public FieldDef vadcodigo;
    public FieldDef vaddescrip;
    public FieldDef vadconinicial;
    public FieldDef vadconfinal;
    public FieldDef vadtaula;
    public FieldDef vadtipo;
    public FieldDef vadcodiconver;
    public TabValoresdir(String name)
      {
      super(name);
      vadcodigo = new FieldDef("vadcodigo",FieldDef.CHAR,6,FieldDef.NOTNULL);
      vaddescrip = new FieldDef("vaddescrip",FieldDef.CHAR,50);
      vadconinicial = new FieldDef("vadconinicial",FieldDef.INTEGER,0);
      vadconfinal = new FieldDef("vadconfinal",FieldDef.INTEGER,0);
      vadtaula = new FieldDef("vadtaula",FieldDef.CHAR,15);
      vadtipo = new FieldDef("vadtipo",FieldDef.CHAR,1);
      vadcodiconver = new FieldDef("vadcodiconver",FieldDef.CHAR,3);
      FieldDef array[] = {
        vadcodigo,
        vaddescrip,
        vadconinicial,
        vadconfinal,
        vadtaula,
        vadtipo,
        vadcodiconver        
        };
      setColumns(array);
      FieldDef arrayf[] = {vadcodigo };
      setPrimaryKeys(arrayf);
      vadcodigo.setDescription("Valor que se verá en pantalla: TD(Total Devengado), BCC (Base Contingencias Comunes), etc.");
      vaddescrip.setDescription("Texto largo del contenido TOTAL DEVENGADO, BASE CONTINGENCIAS COMUNES, ETC.");
      vadconinicial.setDescription("Desde codigo concepto que se debe leer en la tabla indicada en  VADTAULA");
      vadconfinal.setDescription("Hasta codigo concepto que se debe leer en la tabla indicada en VADTAULA. HAY QUE ACUMULAR LOS VALORES.");
      vadtaula.setDescription("Tabla que contiene el concepto: HISDEDUC, HISRETRI, etc.");
      vadtipo.setDescription("B=BASES,D=DIAS,C=CUOTAS");
      vadcodiconver.setDescription("Codigo concepto conversion");
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
    
  public class TabTc18 extends TableDef
    {
    // Campos
    public FieldDef tc8codigo;
    public FieldDef tc8msgestcod;
    public FieldDef tc8claseliq;
    public FieldDef tc8empresa;
    public FieldDef tc8centro;
    public FieldDef tc8ccc;
    public FieldDef tc8ejercicio;
    public FieldDef tc8periodo;
    public FieldDef tc8proceso;
    public FieldDef tc8numtrab;
    public FieldDef tc8numtrabjr;
    public FieldDef tc8modpago;
    public FieldDef tc8mutua;
    public FieldDef tc8cuota;
    public FieldDef tc8dperiodo;
    public FieldDef tc8hperiodo;
    public FieldDef tc8otrcon106;
    public FieldDef tc8reduc209;
    public FieldDef tc8ejerpago;
    public FieldDef tc8ntrabfij101;
    public FieldDef tc8base111;
    public FieldDef tc8tipo111;
    public FieldDef tc8cuota121;
    public FieldDef tc8ntranfij102;
    public FieldDef tc8base112;
    public FieldDef tc8tipo112;
    public FieldDef tc8couta122;
    public FieldDef tc8otrconcep;
    public FieldDef tc8base116;
    public FieldDef tc8tipo116;
    public FieldDef tc8cuota126;
    public FieldDef tc8reducpor210;
    public FieldDef tc8cuota210;
    public FieldDef tc8totaltra131;
    public FieldDef tc8liqcotg299;
    public FieldDef tc8sumtotepi301;
    public FieldDef tc8sumtotepi311;
    public FieldDef tc8sumtotepi312;
    public FieldDef tc8sumtotepi499;
    public FieldDef tc8destrafib501;
    public FieldDef tc8destrafit501;
    public FieldDef tc8destrafij511;
    public FieldDef tc8destritib502;
    public FieldDef tc8destritit502;
    public FieldDef tc8destritij512;
    public FieldDef tc8fogasabas503;
    public FieldDef tc8fogasatip503;
    public FieldDef tc8fogasacuo513;
    public FieldDef tc8bonsub610;
    public FieldDef tc8resultado699;
    public FieldDef tc8recamorabase;
    public FieldDef tc8racamoratipo;
    public FieldDef tc8recamora099;
    public FieldDef tc8totperci800;
    public FieldDef tc8totingr700;
    public FieldDef tc8patobrtot;
    public FieldDef tc8nomexplo;
    public FieldDef tc8domiexplo;
    public FieldDef tc8localexplo;
    public FieldDef tc8cpexplo;
    public FieldDef tc8provexplo;
    public TabTc18(String name)
      {
      super(name);
      tc8codigo = new FieldDef("tc8codigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tc8msgestcod = new FieldDef("tc8msgestcod",FieldDef.INTEGER,0);
      tc8claseliq = new FieldDef("tc8claseliq",FieldDef.CHAR,4);
      tc8empresa = new FieldDef("tc8empresa",FieldDef.INTEGER,0);
      tc8centro = new FieldDef("tc8centro",FieldDef.INTEGER,0);
      tc8ccc = new FieldDef("tc8ccc",FieldDef.CHAR,11);
      tc8ejercicio = new FieldDef("tc8ejercicio",FieldDef.INTEGER,0);
      tc8periodo = new FieldDef("tc8periodo",FieldDef.INTEGER,0);
      tc8proceso = new FieldDef("tc8proceso",FieldDef.INTEGER,0);
      tc8numtrab = new FieldDef("tc8numtrab",FieldDef.INTEGER,0);
      tc8numtrabjr = new FieldDef("tc8numtrabjr",FieldDef.INTEGER,0);
      tc8modpago = new FieldDef("tc8modpago",FieldDef.CHAR,4);
      tc8mutua = new FieldDef("tc8mutua",FieldDef.CHAR,4);
      tc8cuota = new FieldDef("tc8cuota",FieldDef.FLOAT,6,0);
      tc8dperiodo = new FieldDef("tc8dperiodo",FieldDef.INTEGER,0);
      tc8hperiodo = new FieldDef("tc8hperiodo",FieldDef.INTEGER,0);
      tc8otrcon106 = new FieldDef("tc8otrcon106",FieldDef.CHAR,2);
      tc8reduc209 = new FieldDef("tc8reduc209",FieldDef.CHAR,2);
      tc8ejerpago = new FieldDef("tc8ejerpago",FieldDef.INTEGER,0);
      tc8ntrabfij101 = new FieldDef("tc8ntrabfij101",FieldDef.INTEGER,0);
      tc8base111 = new FieldDef("tc8base111",FieldDef.FLOAT,6,0);
      tc8tipo111 = new FieldDef("tc8tipo111",FieldDef.FLOAT,6,0);
      tc8cuota121 = new FieldDef("tc8cuota121",FieldDef.FLOAT,6,0);
      tc8ntranfij102 = new FieldDef("tc8ntranfij102",FieldDef.INTEGER,0);
      tc8base112 = new FieldDef("tc8base112",FieldDef.FLOAT,6,0);
      tc8tipo112 = new FieldDef("tc8tipo112",FieldDef.FLOAT,6,0);
      tc8couta122 = new FieldDef("tc8couta122",FieldDef.FLOAT,6,0);
      tc8otrconcep = new FieldDef("tc8otrconcep",FieldDef.FLOAT,6,0);
      tc8base116 = new FieldDef("tc8base116",FieldDef.FLOAT,6,0);
      tc8tipo116 = new FieldDef("tc8tipo116",FieldDef.FLOAT,6,0);
      tc8cuota126 = new FieldDef("tc8cuota126",FieldDef.FLOAT,6,0);
      tc8reducpor210 = new FieldDef("tc8reducpor210",FieldDef.FLOAT,6,0);
      tc8cuota210 = new FieldDef("tc8cuota210",FieldDef.FLOAT,6,0);
      tc8totaltra131 = new FieldDef("tc8totaltra131",FieldDef.INTEGER,0);
      tc8liqcotg299 = new FieldDef("tc8liqcotg299",FieldDef.FLOAT,6,0);
      tc8sumtotepi301 = new FieldDef("tc8sumtotepi301",FieldDef.FLOAT,6,0);
      tc8sumtotepi311 = new FieldDef("tc8sumtotepi311",FieldDef.FLOAT,6,0);
      tc8sumtotepi312 = new FieldDef("tc8sumtotepi312",FieldDef.FLOAT,6,0);
      tc8sumtotepi499 = new FieldDef("tc8sumtotepi499",FieldDef.FLOAT,6,0);
      tc8destrafib501 = new FieldDef("tc8destrafib501",FieldDef.FLOAT,6,0);
      tc8destrafit501 = new FieldDef("tc8destrafit501",FieldDef.FLOAT,6,0);
      tc8destrafij511 = new FieldDef("tc8destrafij511",FieldDef.FLOAT,6,0);
      tc8destritib502 = new FieldDef("tc8destritib502",FieldDef.FLOAT,6,0);
      tc8destritit502 = new FieldDef("tc8destritit502",FieldDef.FLOAT,6,0);
      tc8destritij512 = new FieldDef("tc8destritij512",FieldDef.FLOAT,6,0);
      tc8fogasabas503 = new FieldDef("tc8fogasabas503",FieldDef.FLOAT,6,0);
      tc8fogasatip503 = new FieldDef("tc8fogasatip503",FieldDef.FLOAT,6,0);
      tc8fogasacuo513 = new FieldDef("tc8fogasacuo513",FieldDef.FLOAT,6,0);
      tc8bonsub610 = new FieldDef("tc8bonsub610",FieldDef.FLOAT,6,0);
      tc8resultado699 = new FieldDef("tc8resultado699",FieldDef.FLOAT,6,0);
      tc8recamorabase = new FieldDef("tc8recamorabase",FieldDef.FLOAT,6,0);
      tc8racamoratipo = new FieldDef("tc8racamoratipo",FieldDef.FLOAT,6,0);
      tc8recamora099 = new FieldDef("tc8recamora099",FieldDef.FLOAT,6,0);
      tc8totperci800 = new FieldDef("tc8totperci800",FieldDef.FLOAT,6,0);
      tc8totingr700 = new FieldDef("tc8totingr700",FieldDef.FLOAT,6,0);
      tc8patobrtot = new FieldDef("tc8patobrtot",FieldDef.CHAR,1);
      tc8nomexplo = new FieldDef("tc8nomexplo",FieldDef.CHAR,50);
      tc8domiexplo = new FieldDef("tc8domiexplo",FieldDef.CHAR,50);
      tc8localexplo = new FieldDef("tc8localexplo",FieldDef.CHAR,30);
      tc8cpexplo = new FieldDef("tc8cpexplo",FieldDef.CHAR,5);
      tc8provexplo = new FieldDef("tc8provexplo",FieldDef.CHAR,20);
      FieldDef array[] = {
        tc8codigo,
        tc8msgestcod,
        tc8claseliq,
        tc8empresa,
        tc8centro,
        tc8ccc,
        tc8ejercicio,
        tc8periodo,
        tc8proceso,
        tc8numtrab,
        tc8numtrabjr,
        tc8modpago,
        tc8mutua,
        tc8cuota,
        tc8dperiodo,
        tc8hperiodo,
        tc8otrcon106,
        tc8reduc209,
        tc8ejerpago,
        tc8ntrabfij101,
        tc8base111,
        tc8tipo111,
        tc8cuota121,
        tc8ntranfij102,
        tc8base112,
        tc8tipo112,
        tc8couta122,
        tc8otrconcep,
        tc8base116,
        tc8tipo116,
        tc8cuota126,
        tc8reducpor210,
        tc8cuota210,
        tc8totaltra131,
        tc8liqcotg299,
        tc8sumtotepi301,
        tc8sumtotepi311,
        tc8sumtotepi312,
        tc8sumtotepi499,
        tc8destrafib501,
        tc8destrafit501,
        tc8destrafij511,
        tc8destritib502,
        tc8destritit502,
        tc8destritij512,
        tc8fogasabas503,
        tc8fogasatip503,
        tc8fogasacuo513,
        tc8bonsub610,
        tc8resultado699,
        tc8recamorabase,
        tc8racamoratipo,
        tc8recamora099,
        tc8totperci800,
        tc8totingr700,
        tc8patobrtot,
        tc8nomexplo,
        tc8domiexplo,
        tc8localexplo,
        tc8cpexplo,
        tc8provexplo        
        };
      setColumns(array);
      FieldDef arrayf[] = {tc8codigo };
      setPrimaryKeys(arrayf);
      tc8codigo.setAutoIncrementable(true);
      tc8codigo.setDescription("Codigo");
      tc8msgestcod.setDescription("Codigo mensaje");
      tc8claseliq.setDescription("Clase Liquidacion TC1");
      tc8empresa.setDescription("Empresa");
      tc8centro.setDescription("Centro Trabajo");
      tc8ccc.setDescription("Codigo Cuenta Cotizacion");
      tc8ejercicio.setDescription("Ejercicio");
      tc8periodo.setDescription("Periodo");
      tc8proceso.setDescription("Proceso");
      tc8numtrab.setDescription("Numero trabajadores");
      tc8numtrabjr.setDescription("Numero trabajadores Jornadas Reales");
      tc8modpago.setDescription("Modalidad Pago");
      tc8mutua.setDescription("Mutua accidentes");
      tc8cuota.setDescription("Cuota");
      tc8dperiodo.setDescription("Desde Periodo");
      tc8hperiodo.setDescription("Hasta Periodo");
      tc8reduc209.setDescription("Reduccion 209");
      tc8ejerpago.setDescription("Ejercicio Pago");
      tc8ntrabfij101.setDescription("Numero trabajadores fijos casilla 101");
      tc8base111.setDescription("Numero trabajadores fijos Base casilla 111");
      tc8tipo111.setDescription("Numero trabajadores fijos Tipo casilla 111");
      tc8cuota121.setDescription("Numero trabajadores fijos Cuota casilla 121");
      tc8ntranfij102.setDescription("Numero trabajadores no fijos casilla 102");
      tc8base112.setDescription("Numero trabajadores no fijos Base casilla 112");
      tc8tipo112.setDescription("Numero trabajadores no fijos Tipo casilla 112");
      tc8couta122.setDescription("Numero trabajadores no fijos Cuota casilla 122");
      tc8otrconcep.setDescription("Otros conceptos");
      tc8base116.setDescription("Otros conceptos BASE  casilla 116");
      tc8tipo116.setDescription("Otros conceptos TIPO  casilla 116");
      tc8cuota126.setDescription("Otros conceptos Cuota casilla 126");
      tc8reducpor210.setDescription("Reducciones por  Tipo casilla 210");
      tc8cuota210.setDescription("Reducciones por  Cuota casilla 210");
      tc8totaltra131.setDescription("Total Numero de trabajadores casilla 131");
      tc8liqcotg299.setDescription("Liquido cotizaciones generales");
      tc8sumtotepi301.setDescription("Suma total Epigrafes base  casilla 301");
      tc8sumtotepi311.setDescription("Suma total Epigrafes cuota I.T.  casilla 311");
      tc8sumtotepi312.setDescription("Suma total Epigrafes cuota I.M.S.  casilla 312");
      tc8sumtotepi499.setDescription("Suma total Epigrafes total cuotas casilla 499");
      tc8destrafib501.setDescription("Desempleo Trabajadores Fijos Bases  casilla 501");
      tc8destrafit501.setDescription("Desempleo Trabajadores Fijos Tipos  casilla 501");
      tc8destrafij511.setDescription("Desempleo Trabajadores Fijos Cuotas casilla 511");
      tc8destritib502.setDescription("Desempleo Trabajadores I.T.  Bases  casilla 502");
      tc8destritit502.setDescription("Desempleo Trabajadores I.T.  Tipos  casilla 502");
      tc8destritij512.setDescription("Desempleo Trabajadores I.T.  Cuotas casilla 512");
      tc8fogasabas503.setDescription("Fondo Garantia Salarial  Bases  casilla 503");
      tc8fogasatip503.setDescription("Fondo Garantia Salarial  Tipos  casilla 503");
      tc8fogasacuo513.setDescription("Fondo Garantia Salarial  Cuotas casilla 513");
      tc8bonsub610.setDescription("Bonificaciones Subvenciones casilla 610");
      tc8resultado699.setDescription("Resultado liquido otras cotizaciones casilla 699");
      tc8recamorabase.setDescription("Recargo de mora base");
      tc8racamoratipo.setDescription("Recargo de mora tipo");
      tc8recamora099.setDescription("Recargo de mora  casilla 099");
      tc8totperci800.setDescription("Total a percibir casilla 800");
      tc8totingr700.setDescription("Total a ingresar casilla 700");
      tc8patobrtot.setDescription("Liquidacion [P]atronal . [O]brera . [T]odas.");
      tc8nomexplo.setDescription("Nombre de la explotaciÓn agraria");
      tc8domiexplo.setDescription("Domicilio de la explotaciÓn agraria");
      tc8localexplo.setDescription("Localidad de la explotaciÓn agraria");
      tc8cpexplo.setDescription("C.P. de la explotaciÓn agraria");
      tc8provexplo.setDescription("Provincia de la explotaciÓn agraria");
      }
    }
    
  public class TabTc119 extends TableDef
    {
    // Campos
    public FieldDef tc119codigo;
    public FieldDef tc119msgestcod;
    public FieldDef tc119claseliq;
    public FieldDef tc119empresa;
    public FieldDef tc119centro;
    public FieldDef tc119ccc;
    public FieldDef tc119ejercicio;
    public FieldDef tc119periodo;
    public FieldDef tc119proceso;
    public FieldDef tc119numtrab;
    public FieldDef tc119modpago;
    public FieldDef tc119mutua;
    public FieldDef tc119cuota;
    public FieldDef tc119dperiodo;
    public FieldDef tc119hperiodo;
    public FieldDef tc119artistas;
    public FieldDef tc119taurinos;
    public FieldDef tc119otrcon106;
    public FieldDef tc119reduc209;
    public FieldDef tc119ejerpago;
    public FieldDef tc119base101;
    public FieldDef tc119tipo111;
    public FieldDef tc119cuotas111;
    public FieldDef tc119base105;
    public FieldDef tc119tipo115;
    public FieldDef tc119coutas115;
    public FieldDef tc119otro106;
    public FieldDef tc119base106;
    public FieldDef tc119tipo106;
    public FieldDef tc119cuotas116;
    public FieldDef tc119redpor210;
    public FieldDef tc119cuotas210;
    public FieldDef tc119liqcotg299;
    public FieldDef tc119base301;
    public FieldDef tc119cuotas311;
    public FieldDef tc119cuotas312;
    public FieldDef tc119sum499;
    public FieldDef tc119base501;
    public FieldDef tc119tipo501;
    public FieldDef tc119cuotas511;
    public FieldDef tc119base502;
    public FieldDef tc119tipo502;
    public FieldDef tc119cuotas512;
    public FieldDef tc119bonsub610;
    public FieldDef tc119resul699;
    public FieldDef tc119base099;
    public FieldDef tc119tipo099;
    public FieldDef tc119recargo099;
    public FieldDef tc119totingr700;
    public FieldDef tc119patobrtot;
    public TabTc119(String name)
      {
      super(name);
      tc119codigo = new FieldDef("tc119codigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tc119msgestcod = new FieldDef("tc119msgestcod",FieldDef.INTEGER,0);
      tc119claseliq = new FieldDef("tc119claseliq",FieldDef.CHAR,4);
      tc119empresa = new FieldDef("tc119empresa",FieldDef.INTEGER,0);
      tc119centro = new FieldDef("tc119centro",FieldDef.INTEGER,0);
      tc119ccc = new FieldDef("tc119ccc",FieldDef.CHAR,11);
      tc119ejercicio = new FieldDef("tc119ejercicio",FieldDef.INTEGER,0);
      tc119periodo = new FieldDef("tc119periodo",FieldDef.INTEGER,0);
      tc119proceso = new FieldDef("tc119proceso",FieldDef.INTEGER,0);
      tc119numtrab = new FieldDef("tc119numtrab",FieldDef.INTEGER,0);
      tc119modpago = new FieldDef("tc119modpago",FieldDef.CHAR,4);
      tc119mutua = new FieldDef("tc119mutua",FieldDef.CHAR,4);
      tc119cuota = new FieldDef("tc119cuota",FieldDef.FLOAT,6,0);
      tc119dperiodo = new FieldDef("tc119dperiodo",FieldDef.INTEGER,0);
      tc119hperiodo = new FieldDef("tc119hperiodo",FieldDef.INTEGER,0);
      tc119artistas = new FieldDef("tc119artistas",FieldDef.CHAR,1);
      tc119taurinos = new FieldDef("tc119taurinos",FieldDef.CHAR,1);
      tc119otrcon106 = new FieldDef("tc119otrcon106",FieldDef.CHAR,2);
      tc119reduc209 = new FieldDef("tc119reduc209",FieldDef.CHAR,2);
      tc119ejerpago = new FieldDef("tc119ejerpago",FieldDef.INTEGER,0);
      tc119base101 = new FieldDef("tc119base101",FieldDef.FLOAT,6,0);
      tc119tipo111 = new FieldDef("tc119tipo111",FieldDef.FLOAT,6,0);
      tc119cuotas111 = new FieldDef("tc119cuotas111",FieldDef.FLOAT,6,0);
      tc119base105 = new FieldDef("tc119base105",FieldDef.FLOAT,6,0);
      tc119tipo115 = new FieldDef("tc119tipo115",FieldDef.FLOAT,6,0);
      tc119coutas115 = new FieldDef("tc119coutas115",FieldDef.FLOAT,6,0);
      tc119otro106 = new FieldDef("tc119otro106",FieldDef.FLOAT,6,0);
      tc119base106 = new FieldDef("tc119base106",FieldDef.FLOAT,6,0);
      tc119tipo106 = new FieldDef("tc119tipo106",FieldDef.FLOAT,6,0);
      tc119cuotas116 = new FieldDef("tc119cuotas116",FieldDef.FLOAT,6,0);
      tc119redpor210 = new FieldDef("tc119redpor210",FieldDef.FLOAT,6,0);
      tc119cuotas210 = new FieldDef("tc119cuotas210",FieldDef.FLOAT,6,0);
      tc119liqcotg299 = new FieldDef("tc119liqcotg299",FieldDef.FLOAT,6,0);
      tc119base301 = new FieldDef("tc119base301",FieldDef.FLOAT,6,0);
      tc119cuotas311 = new FieldDef("tc119cuotas311",FieldDef.FLOAT,6,0);
      tc119cuotas312 = new FieldDef("tc119cuotas312",FieldDef.FLOAT,6,0);
      tc119sum499 = new FieldDef("tc119sum499",FieldDef.FLOAT,6,0);
      tc119base501 = new FieldDef("tc119base501",FieldDef.FLOAT,6,0);
      tc119tipo501 = new FieldDef("tc119tipo501",FieldDef.FLOAT,6,0);
      tc119cuotas511 = new FieldDef("tc119cuotas511",FieldDef.FLOAT,6,0);
      tc119base502 = new FieldDef("tc119base502",FieldDef.FLOAT,6,0);
      tc119tipo502 = new FieldDef("tc119tipo502",FieldDef.FLOAT,6,0);
      tc119cuotas512 = new FieldDef("tc119cuotas512",FieldDef.FLOAT,6,0);
      tc119bonsub610 = new FieldDef("tc119bonsub610",FieldDef.FLOAT,6,0);
      tc119resul699 = new FieldDef("tc119resul699",FieldDef.FLOAT,6,0);
      tc119base099 = new FieldDef("tc119base099",FieldDef.FLOAT,6,0);
      tc119tipo099 = new FieldDef("tc119tipo099",FieldDef.FLOAT,6,0);
      tc119recargo099 = new FieldDef("tc119recargo099",FieldDef.FLOAT,6,0);
      tc119totingr700 = new FieldDef("tc119totingr700",FieldDef.FLOAT,6,0);
      tc119patobrtot = new FieldDef("tc119patobrtot",FieldDef.CHAR,1);
      FieldDef array[] = {
        tc119codigo,
        tc119msgestcod,
        tc119claseliq,
        tc119empresa,
        tc119centro,
        tc119ccc,
        tc119ejercicio,
        tc119periodo,
        tc119proceso,
        tc119numtrab,
        tc119modpago,
        tc119mutua,
        tc119cuota,
        tc119dperiodo,
        tc119hperiodo,
        tc119artistas,
        tc119taurinos,
        tc119otrcon106,
        tc119reduc209,
        tc119ejerpago,
        tc119base101,
        tc119tipo111,
        tc119cuotas111,
        tc119base105,
        tc119tipo115,
        tc119coutas115,
        tc119otro106,
        tc119base106,
        tc119tipo106,
        tc119cuotas116,
        tc119redpor210,
        tc119cuotas210,
        tc119liqcotg299,
        tc119base301,
        tc119cuotas311,
        tc119cuotas312,
        tc119sum499,
        tc119base501,
        tc119tipo501,
        tc119cuotas511,
        tc119base502,
        tc119tipo502,
        tc119cuotas512,
        tc119bonsub610,
        tc119resul699,
        tc119base099,
        tc119tipo099,
        tc119recargo099,
        tc119totingr700,
        tc119patobrtot        
        };
      setColumns(array);
      FieldDef arrayf[] = {tc119codigo };
      setPrimaryKeys(arrayf);
      tc119codigo.setAutoIncrementable(true);
      tc119codigo.setDescription("Codigo");
      tc119msgestcod.setDescription("Codigo mensaje");
      tc119claseliq.setDescription("Clase Liquidacion TC1");
      tc119empresa.setDescription("Empresa");
      tc119centro.setDescription("Centro Trabajo");
      tc119ccc.setDescription("Codigo Cuenta Cotizacion");
      tc119ejercicio.setDescription("Ejercicio");
      tc119periodo.setDescription("Periodo");
      tc119proceso.setDescription("Proceso");
      tc119numtrab.setDescription("Numero trabajadores");
      tc119modpago.setDescription("Modalidad Pago");
      tc119mutua.setDescription("Mutua accidentes");
      tc119cuota.setDescription("Cuota");
      tc119dperiodo.setDescription("Desde Periodo");
      tc119hperiodo.setDescription("Hasta Periodo");
      tc119artistas.setDescription("Colectivo artistas");
      tc119taurinos.setDescription("Colectivo profesionales taurinos");
      tc119reduc209.setDescription("Reduccion 209");
      tc119ejerpago.setDescription("Ejercicio Pago");
      tc119base101.setDescription("Cotizaciones Generales Contingencias Comunes Base casilla 101");
      tc119tipo111.setDescription("Cotizaciones Generales Contingencias Comunes Tipo casilla 111");
      tc119cuotas111.setDescription("Cotizaciones Generales Contingencias Comunes Cuota casilla 111");
      tc119base105.setDescription("Cotizaciones Generales Cotización Empresarial Base casilla 105");
      tc119tipo115.setDescription("Cotizaciones Generales Cotización Empresarial Tipo casilla 115");
      tc119coutas115.setDescription("Cotizaciones Generales Cotización Empresarial Cuota casilla 115");
      tc119otro106.setDescription("Otros conceptos");
      tc119base106.setDescription("Otros conceptos BASE  casilla 106");
      tc119tipo106.setDescription("Otros conceptos TIPO  casilla 116");
      tc119cuotas116.setDescription("Otros conceptos Cuota casilla 116");
      tc119redpor210.setDescription("Reducciones por  Tipo casilla 210");
      tc119cuotas210.setDescription("Reducciones por  Cuota casilla 210");
      tc119liqcotg299.setDescription("Liquido cotizaciones generales");
      tc119base301.setDescription("Accidentes de trabajo y enfermedades profesionales casilla 301");
      tc119cuotas311.setDescription("Accidentes de trabajo y enfermedades profesionales cuota I.T.  casilla 311");
      tc119cuotas312.setDescription("Accidentes de trabajo y enfermedades profesionales cuota I.M.S.  casilla 312");
      tc119sum499.setDescription("Suma total cuotas casilla 499");
      tc119base501.setDescription("Desempleo Trabajadores Fijos Bases  casilla 501");
      tc119tipo501.setDescription("Desempleo Trabajadores Fijos Tipos  casilla 501");
      tc119cuotas511.setDescription("Desempleo Trabajadores Fijos Cuotas casilla 511");
      tc119base502.setDescription("Cotización empresarial Bases  casilla 502");
      tc119tipo502.setDescription("Cotización empresarial Tipos  casilla 502");
      tc119cuotas512.setDescription("Cotización empresarial Cuotas casilla 512");
      tc119bonsub610.setDescription("Bonificaciones Subvenciones casilla 610");
      tc119resul699.setDescription("Resultado liquido otras cotizaciones casilla 699");
      tc119base099.setDescription("Recargo de mora base");
      tc119tipo099.setDescription("Recargo de mora tipo");
      tc119recargo099.setDescription("Recargo de mora  casilla 099");
      tc119totingr700.setDescription("Total a ingresar casilla 700");
      tc119patobrtot.setDescription("Liquidacion [P]atronal . [O]brera . [T]odas.");
      }
    }
    
  public class TabTc13 extends TableDef
    {
    // Campos
    public FieldDef tc3codigo;
    public FieldDef tc3msgestcod;
    public FieldDef tc3claseliq;
    public FieldDef tc3empresa;
    public FieldDef tc3centro;
    public FieldDef tc3ccc;
    public FieldDef tc3ejercicio;
    public FieldDef tc3periodo;
    public FieldDef tc3proceso;
    public FieldDef tc3numtrab;
    public FieldDef tc3modpago;
    public FieldDef tc3mutua;
    public FieldDef tc3cuota;
    public FieldDef tc3dperiodo;
    public FieldDef tc3hperiodo;
    public FieldDef tc3otrcon106;
    public FieldDef tc3reduc209;
    public FieldDef tc3ejerpago;
    public FieldDef tc3percepciones;
    public FieldDef tc3ccbases101;
    public FieldDef tc3cctipos101;
    public FieldDef tc3cccuota111;
    public FieldDef tc3otr106;
    public FieldDef tc3otrbases106;
    public FieldDef tc3otrtipos106;
    public FieldDef tc3otrcuota116;
    public FieldDef tc3reduc210;
    public FieldDef tc3redcuot210;
    public FieldDef tc3result299;
    public FieldDef tc3epi301;
    public FieldDef tc3bases301;
    public FieldDef tc3cuoit311;
    public FieldDef tc3cuotims321;
    public FieldDef tc3cuota340;
    public FieldDef tc3epi302;
    public FieldDef tc3bases302;
    public FieldDef tc3cuoit312;
    public FieldDef tc3cuotims322;
    public FieldDef tc3cuota350;
    public FieldDef tc3result499;
    public FieldDef tc3fogabase501;
    public FieldDef tc3fogatipo501;
    public FieldDef tc3fogacuot511;
    public FieldDef tc3bonsub610;
    public FieldDef tc3resul699;
    public FieldDef tc3recamorabase;
    public FieldDef tc3racamoratipo;
    public FieldDef tc3recamora099;
    public FieldDef tc3aingresar700;
    public FieldDef tc3patobrtot;
    public FieldDef tc3trabajador;
    public TabTc13(String name)
      {
      super(name);
      tc3codigo = new FieldDef("tc3codigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tc3msgestcod = new FieldDef("tc3msgestcod",FieldDef.INTEGER,0);
      tc3claseliq = new FieldDef("tc3claseliq",FieldDef.CHAR,4);
      tc3empresa = new FieldDef("tc3empresa",FieldDef.INTEGER,0);
      tc3centro = new FieldDef("tc3centro",FieldDef.INTEGER,0);
      tc3ccc = new FieldDef("tc3ccc",FieldDef.CHAR,11);
      tc3ejercicio = new FieldDef("tc3ejercicio",FieldDef.INTEGER,0);
      tc3periodo = new FieldDef("tc3periodo",FieldDef.INTEGER,0);
      tc3proceso = new FieldDef("tc3proceso",FieldDef.INTEGER,0);
      tc3numtrab = new FieldDef("tc3numtrab",FieldDef.INTEGER,0);
      tc3modpago = new FieldDef("tc3modpago",FieldDef.CHAR,4);
      tc3mutua = new FieldDef("tc3mutua",FieldDef.CHAR,4);
      tc3cuota = new FieldDef("tc3cuota",FieldDef.FLOAT,6,0);
      tc3dperiodo = new FieldDef("tc3dperiodo",FieldDef.INTEGER,0);
      tc3hperiodo = new FieldDef("tc3hperiodo",FieldDef.INTEGER,0);
      tc3otrcon106 = new FieldDef("tc3otrcon106",FieldDef.CHAR,2);
      tc3reduc209 = new FieldDef("tc3reduc209",FieldDef.CHAR,2);
      tc3ejerpago = new FieldDef("tc3ejerpago",FieldDef.INTEGER,0);
      tc3percepciones = new FieldDef("tc3percepciones",FieldDef.FLOAT,6,0);
      tc3ccbases101 = new FieldDef("tc3ccbases101",FieldDef.FLOAT,6,0);
      tc3cctipos101 = new FieldDef("tc3cctipos101",FieldDef.FLOAT,6,0);
      tc3cccuota111 = new FieldDef("tc3cccuota111",FieldDef.FLOAT,6,0);
      tc3otr106 = new FieldDef("tc3otr106",FieldDef.FLOAT,6,0);
      tc3otrbases106 = new FieldDef("tc3otrbases106",FieldDef.FLOAT,6,0);
      tc3otrtipos106 = new FieldDef("tc3otrtipos106",FieldDef.FLOAT,6,0);
      tc3otrcuota116 = new FieldDef("tc3otrcuota116",FieldDef.FLOAT,6,0);
      tc3reduc210 = new FieldDef("tc3reduc210",FieldDef.FLOAT,6,0);
      tc3redcuot210 = new FieldDef("tc3redcuot210",FieldDef.FLOAT,6,0);
      tc3result299 = new FieldDef("tc3result299",FieldDef.FLOAT,6,0);
      tc3epi301 = new FieldDef("tc3epi301",FieldDef.CHAR,25);
      tc3bases301 = new FieldDef("tc3bases301",FieldDef.FLOAT,6,0);
      tc3cuoit311 = new FieldDef("tc3cuoit311",FieldDef.FLOAT,6,0);
      tc3cuotims321 = new FieldDef("tc3cuotims321",FieldDef.FLOAT,6,0);
      tc3cuota340 = new FieldDef("tc3cuota340",FieldDef.FLOAT,6,0);
      tc3epi302 = new FieldDef("tc3epi302",FieldDef.CHAR,25);
      tc3bases302 = new FieldDef("tc3bases302",FieldDef.FLOAT,6,0);
      tc3cuoit312 = new FieldDef("tc3cuoit312",FieldDef.FLOAT,6,0);
      tc3cuotims322 = new FieldDef("tc3cuotims322",FieldDef.FLOAT,6,0);
      tc3cuota350 = new FieldDef("tc3cuota350",FieldDef.FLOAT,6,0);
      tc3result499 = new FieldDef("tc3result499",FieldDef.FLOAT,6,0);
      tc3fogabase501 = new FieldDef("tc3fogabase501",FieldDef.FLOAT,6,0);
      tc3fogatipo501 = new FieldDef("tc3fogatipo501",FieldDef.FLOAT,6,0);
      tc3fogacuot511 = new FieldDef("tc3fogacuot511",FieldDef.FLOAT,6,0);
      tc3bonsub610 = new FieldDef("tc3bonsub610",FieldDef.FLOAT,6,0);
      tc3resul699 = new FieldDef("tc3resul699",FieldDef.FLOAT,6,0);
      tc3recamorabase = new FieldDef("tc3recamorabase",FieldDef.FLOAT,6,0);
      tc3racamoratipo = new FieldDef("tc3racamoratipo",FieldDef.FLOAT,6,0);
      tc3recamora099 = new FieldDef("tc3recamora099",FieldDef.FLOAT,6,0);
      tc3aingresar700 = new FieldDef("tc3aingresar700",FieldDef.FLOAT,6,0);
      tc3patobrtot = new FieldDef("tc3patobrtot",FieldDef.CHAR,1);
      tc3trabajador = new FieldDef("tc3trabajador",FieldDef.INTEGER,0);
      FieldDef array[] = {
        tc3codigo,
        tc3msgestcod,
        tc3claseliq,
        tc3empresa,
        tc3centro,
        tc3ccc,
        tc3ejercicio,
        tc3periodo,
        tc3proceso,
        tc3numtrab,
        tc3modpago,
        tc3mutua,
        tc3cuota,
        tc3dperiodo,
        tc3hperiodo,
        tc3otrcon106,
        tc3reduc209,
        tc3ejerpago,
        tc3percepciones,
        tc3ccbases101,
        tc3cctipos101,
        tc3cccuota111,
        tc3otr106,
        tc3otrbases106,
        tc3otrtipos106,
        tc3otrcuota116,
        tc3reduc210,
        tc3redcuot210,
        tc3result299,
        tc3epi301,
        tc3bases301,
        tc3cuoit311,
        tc3cuotims321,
        tc3cuota340,
        tc3epi302,
        tc3bases302,
        tc3cuoit312,
        tc3cuotims322,
        tc3cuota350,
        tc3result499,
        tc3fogabase501,
        tc3fogatipo501,
        tc3fogacuot511,
        tc3bonsub610,
        tc3resul699,
        tc3recamorabase,
        tc3racamoratipo,
        tc3recamora099,
        tc3aingresar700,
        tc3patobrtot,
        tc3trabajador        
        };
      setColumns(array);
      FieldDef arrayf[] = {tc3codigo };
      setPrimaryKeys(arrayf);
      tc3codigo.setAutoIncrementable(true);
      tc3codigo.setDescription("Codigo");
      tc3msgestcod.setDescription("Codigo mensaje");
      tc3claseliq.setDescription("Clase Liquidacion TC1");
      tc3empresa.setDescription("Empresa");
      tc3centro.setDescription("Centro Trabajo");
      tc3ccc.setDescription("Codigo Cuenta Cotizacion");
      tc3ejercicio.setDescription("Ejercicio");
      tc3periodo.setDescription("Periodo");
      tc3proceso.setDescription("Proceso");
      tc3numtrab.setDescription("Numero trabajadores");
      tc3modpago.setDescription("Modalidad Pago");
      tc3mutua.setDescription("Mutua accidentes");
      tc3cuota.setDescription("Cuota");
      tc3dperiodo.setDescription("Desde Periodo");
      tc3hperiodo.setDescription("Hasta Periodo");
      tc3reduc209.setDescription("Reduccion 209");
      tc3ejerpago.setDescription("Ejercicio Pago");
      tc3percepciones.setDescription("Percepciones");
      tc3ccbases101.setDescription("Contingencias Comunes Bases  casilla 101");
      tc3cctipos101.setDescription("Contingencias Comunes Tipos  casilla 101");
      tc3cccuota111.setDescription("Contingencias Comunes Cuotas casilla 111");
      tc3otr106.setDescription("Otros conceptos");
      tc3otrbases106.setDescription("Otros conceptos Bases casilla 106");
      tc3otrtipos106.setDescription("Otros conceptos Tipos casilla 106");
      tc3otrcuota116.setDescription("Otros conceptos Cuotas casilla 106");
      tc3reduc210.setDescription("Reducciones casilla 210");
      tc3redcuot210.setDescription("Reducciones Cuota casilla 210");
      tc3result299.setDescription("Liquido cotizaciones generales casilla 299");
      tc3epi301.setDescription("Epigrafe casilla 301");
      tc3bases301.setDescription("Base casilla 301");
      tc3cuoit311.setDescription("Cuotas I.T.   casilla 311");
      tc3cuotims321.setDescription("Cuotas I.M.S. casilla 321");
      tc3cuota340.setDescription("Cuotas casilla 340");
      tc3epi302.setDescription("Epigrafe casilla 302");
      tc3bases302.setDescription("Base casilla 302");
      tc3cuoit312.setDescription("Cuotas I.T.   casilla 312");
      tc3cuotims322.setDescription("Cuotas I.M.S. casilla 322");
      tc3cuota350.setDescription("Cuotas casilla 350");
      tc3result499.setDescription("Liquido A.T. E.P. casilla 499");
      tc3fogabase501.setDescription("FOGASA BASE 501");
      tc3fogatipo501.setDescription("FOGASA TIPO (D+F+P) casilla 501");
      tc3fogacuot511.setDescription("FOGASA  CUOTA  casilla  511");
      tc3bonsub610.setDescription("Bonificaciones / Subvenciones casilla 610");
      tc3resul699.setDescription("Liquido otras cotizaciones casilla 699");
      tc3recamorabase.setDescription("Recargo de mora base");
      tc3racamoratipo.setDescription("Recargo de mora tipo");
      tc3recamora099.setDescription("Recargo de mora  casilla 099");
      tc3aingresar700.setDescription("A INGRESAR  casilla 700");
      tc3patobrtot.setDescription("Liquidacion [P]atronal . [O]brera . [T]odas.");
      }
    }
    
  public class TabTc16desc extends TableDef
    {
    // Campos
    public FieldDef tde16codigo;
    public FieldDef tde16casilla;
    public FieldDef tde16descrip;
    public TabTc16desc(String name)
      {
      super(name);
      tde16codigo = new FieldDef("tde16codigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tde16casilla = new FieldDef("tde16casilla",FieldDef.CHAR,4);
      tde16descrip = new FieldDef("tde16descrip",FieldDef.CHAR,60);
      FieldDef array[] = {
        tde16codigo,
        tde16casilla,
        tde16descrip        
        };
      setColumns(array);
      FieldDef arrayf[] = {tde16codigo };
      setPrimaryKeys(arrayf);
      tde16codigo.setDescription("Codigo Linea TC1");
      tde16casilla.setDescription("Numero De Casilla TC1");
      tde16descrip.setDescription("Descripcion Casilla TC1");
      }
    }
    
  public class TabTc16cab extends TableDef
    {
    // Campos
    public FieldDef t16codigo;
    public FieldDef t16msgestcod;
    public FieldDef t16claseliq;
    public FieldDef t16empresa;
    public FieldDef t16centro;
    public FieldDef t16ccc;
    public FieldDef t16ejercicio;
    public FieldDef t16periodo;
    public FieldDef t16proceso;
    public FieldDef t16numtrab;
    public FieldDef t16modpago;
    public FieldDef t16mutua;
    public FieldDef t16cuota;
    public FieldDef t16dperiodo;
    public FieldDef t16hperiodo;
    public FieldDef t16otrcon106;
    public FieldDef t16reduc209;
    public FieldDef t16ejerpago;
    public TabTc16cab(String name)
      {
      super(name);
      t16codigo = new FieldDef("t16codigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      t16msgestcod = new FieldDef("t16msgestcod",FieldDef.INTEGER,0);
      t16claseliq = new FieldDef("t16claseliq",FieldDef.CHAR,4);
      t16empresa = new FieldDef("t16empresa",FieldDef.INTEGER,0);
      t16centro = new FieldDef("t16centro",FieldDef.INTEGER,0);
      t16ccc = new FieldDef("t16ccc",FieldDef.CHAR,11);
      t16ejercicio = new FieldDef("t16ejercicio",FieldDef.INTEGER,0);
      t16periodo = new FieldDef("t16periodo",FieldDef.INTEGER,0);
      t16proceso = new FieldDef("t16proceso",FieldDef.INTEGER,0);
      t16numtrab = new FieldDef("t16numtrab",FieldDef.INTEGER,0);
      t16modpago = new FieldDef("t16modpago",FieldDef.CHAR,4);
      t16mutua = new FieldDef("t16mutua",FieldDef.CHAR,4);
      t16cuota = new FieldDef("t16cuota",FieldDef.FLOAT,6,0);
      t16dperiodo = new FieldDef("t16dperiodo",FieldDef.INTEGER,0);
      t16hperiodo = new FieldDef("t16hperiodo",FieldDef.INTEGER,0);
      t16otrcon106 = new FieldDef("t16otrcon106",FieldDef.CHAR,2);
      t16reduc209 = new FieldDef("t16reduc209",FieldDef.CHAR,2);
      t16ejerpago = new FieldDef("t16ejerpago",FieldDef.INTEGER,0);
      FieldDef array[] = {
        t16codigo,
        t16msgestcod,
        t16claseliq,
        t16empresa,
        t16centro,
        t16ccc,
        t16ejercicio,
        t16periodo,
        t16proceso,
        t16numtrab,
        t16modpago,
        t16mutua,
        t16cuota,
        t16dperiodo,
        t16hperiodo,
        t16otrcon106,
        t16reduc209,
        t16ejerpago        
        };
      setColumns(array);
      FieldDef arrayf[] = {t16codigo };
      setPrimaryKeys(arrayf);
      t16codigo.setAutoIncrementable(true);
      t16codigo.setDescription("Codigo");
      t16msgestcod.setDescription("Codigo mensaje");
      t16claseliq.setDescription("Clase Liquidacion TC1");
      t16empresa.setDescription("Empresa");
      t16centro.setDescription("Centro Trabajo");
      t16ccc.setDescription("Codigo Cuenta Cotizacion");
      t16ejercicio.setDescription("Ejercicio");
      t16periodo.setDescription("Periodo");
      t16proceso.setDescription("Proceso");
      t16numtrab.setDescription("Numero trabajadores");
      t16modpago.setDescription("Modalidad Pago");
      t16mutua.setDescription("Mutua accidentes");
      t16cuota.setDescription("Cuota");
      t16dperiodo.setDescription("Desde Periodo");
      t16hperiodo.setDescription("Hasta Periodo");
      t16reduc209.setDescription("Reduccion 209");
      t16ejerpago.setDescription("Ejercicio Pago");
      }
    }
    
  public class TabTc16det extends TableDef
    {
    // Campos
    public FieldDef d16codigo;
    public FieldDef d16linea;
    public FieldDef d16tipolinea;
    public FieldDef d16base;
    public FieldDef d16porcen;
    public FieldDef d16cuota;
    public FieldDef d16patronal;
    public FieldDef d16obrero;
    public TabTc16det(String name)
      {
      super(name);
      d16codigo = new FieldDef("d16codigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      d16linea = new FieldDef("d16linea",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      d16tipolinea = new FieldDef("d16tipolinea",FieldDef.INTEGER,0);
      d16base = new FieldDef("d16base",FieldDef.FLOAT,6,0);
      d16porcen = new FieldDef("d16porcen",FieldDef.FLOAT,6,0);
      d16cuota = new FieldDef("d16cuota",FieldDef.FLOAT,6,0);
      d16patronal = new FieldDef("d16patronal",FieldDef.FLOAT,6,0);
      d16obrero = new FieldDef("d16obrero",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        d16codigo,
        d16linea,
        d16tipolinea,
        d16base,
        d16porcen,
        d16cuota,
        d16patronal,
        d16obrero        
        };
      setColumns(array);
      FieldDef arrayf[] = {d16codigo,d16linea };
      setPrimaryKeys(arrayf);
      d16codigo.setDescription("Codigo");
      d16linea.setDescription("Numero de linea");
      d16tipolinea.setDescription("Tipo Linea");
      d16base.setDescription("Base Cotizacion");
      d16porcen.setDescription("Porcentaje");
      d16cuota.setDescription("Cuota Total");
      d16patronal.setDescription("Cuota Patronal");
      d16obrero.setDescription("Cuota Obrera");
      }
    }
    
  public class TabCambiocodigo extends TableDef
    {
    // Campos
    public FieldDef ccocodigo;
    public FieldDef ccousuario;
    public FieldDef cconivel;
    public FieldDef ccocodconvorig;
    public FieldDef ccocodemporig;
    public FieldDef ccocodcentorig;
    public FieldDef ccocodtraborig;
    public FieldDef ccocodconvdest;
    public FieldDef ccocodempdest;
    public FieldDef ccocodcentdest;
    public FieldDef ccocodtrabdest;
    public FieldDef ccohistoricos;
    public TabCambiocodigo(String name)
      {
      super(name);
      ccocodigo = new FieldDef("ccocodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ccousuario = new FieldDef("ccousuario",FieldDef.CHAR,25);
      cconivel = new FieldDef("cconivel",FieldDef.CHAR,1);
      ccocodconvorig = new FieldDef("ccocodconvorig",FieldDef.INTEGER,0);
      ccocodemporig = new FieldDef("ccocodemporig",FieldDef.INTEGER,0);
      ccocodcentorig = new FieldDef("ccocodcentorig",FieldDef.INTEGER,0);
      ccocodtraborig = new FieldDef("ccocodtraborig",FieldDef.INTEGER,0);
      ccocodconvdest = new FieldDef("ccocodconvdest",FieldDef.INTEGER,0);
      ccocodempdest = new FieldDef("ccocodempdest",FieldDef.INTEGER,0);
      ccocodcentdest = new FieldDef("ccocodcentdest",FieldDef.INTEGER,0);
      ccocodtrabdest = new FieldDef("ccocodtrabdest",FieldDef.INTEGER,0);
      ccohistoricos = new FieldDef("ccohistoricos",FieldDef.CHAR,1);
      FieldDef array[] = {
        ccocodigo,
        ccousuario,
        cconivel,
        ccocodconvorig,
        ccocodemporig,
        ccocodcentorig,
        ccocodtraborig,
        ccocodconvdest,
        ccocodempdest,
        ccocodcentdest,
        ccocodtrabdest,
        ccohistoricos        
        };
      setColumns(array);
      FieldDef arrayf[] = {ccocodigo };
      setPrimaryKeys(arrayf);
      ccocodigo.setAutoIncrementable(true);
      ccocodigo.setDescription("Codigo");
      ccousuario.setDescription("Usuario");
      cconivel.setDescription("Nivel de la información (C/Convenio, E/Empresa, S/Centro, T/Trabajador");
      ccocodconvorig.setDescription("Codigo convenio origen");
      ccocodemporig.setDescription("Codigo empresa origen");
      ccocodcentorig.setDescription("Codigo centro origen");
      ccocodtraborig.setDescription("Codigo trabajador origen");
      ccocodconvdest.setDescription("Codigo convenio destino");
      ccocodempdest.setDescription("Codigo empresa destino");
      ccocodcentdest.setDescription("Codigo centro destino");
      ccocodtrabdest.setDescription("Codigo trabajador destino");
      ccohistoricos.setDescription("Traspasar histórico trabajador");
      }
    }
    
  public class TabTracontrata extends TableDef
    {
    // Campos
    public FieldDef cnacodiemp;
    public FieldDef cnacodigo;
    public FieldDef cnarelacion;
    public FieldDef cnacodigocto;
    public FieldDef cnacccempprov;
    public FieldDef cnacccempnum;
    public FieldDef cnacccempdc;
    public FieldDef cnaindconvcol;
    public FieldDef cnanivelform;
    public FieldDef cnainddiscap;
    public FieldDef cnacodigoocupa;
    public FieldDef cnaidofertaccaa;
    public FieldDef cnaidofertanyo;
    public FieldDef cnaidofertanum;
    public FieldDef cnaprogempleo;
    public FieldDef cnanacionalct;
    public FieldDef cnaotraslegis;
    public FieldDef cnamodexclusion;
    public FieldDef cnatitulacion;
    public FieldDef cnatipojorn;
    public FieldDef cnahorasjorn;
    public FieldDef cnaminutosjorn;
    public FieldDef cnahorasconv;
    public FieldDef cnaminutosconv;
    public FieldDef cnahorasform;
    public FieldDef cnaminutosform;
    public FieldDef cnaformacteor;
    public FieldDef cnacolectivedad;
    public FieldDef cnaporcjubparc;
    public FieldDef cnaactsinfecha;
    public FieldDef cnacausinterid;
    public FieldDef cnacolectbonif;
    public FieldDef cnaempleadoraut;
    public FieldDef cnacostedesp;
    public FieldDef cnacolecdesp;
    public FieldDef cnatipotrab;
    public FieldDef cnanomrelev;
    public FieldDef cnaapell1rele;
    public FieldDef cnaapell2rele;
    public FieldDef cnacodetcote;
    public FieldDef cnaindempleador;
    public FieldDef cnaindtrab;
    public FieldDef cnaaltadirec;
    public FieldDef cnactoescrito;
    public FieldDef cnacorplocal;
    public FieldDef cnaactuacion;
    public FieldDef cnaejerpresup;
    public FieldDef cnagrupocotiz;
    public FieldDef cnagrpcotizss;
    public FieldDef cnanifusuariett;
    public FieldDef cnanomusuariett;
    public FieldDef cnaindctoplant;
    public FieldDef cnaempextranj;
    public FieldDef cnatipofirma;
    public FieldDef cnatextcbas;
    public FieldDef cnalibreempre;
    public FieldDef cnacodmsg;
    public FieldDef cnaapell2;
    public FieldDef cnaapell1;
    public FieldDef cnapais;
    public FieldDef cnanombre;
    public FieldDef cnanacional;
    public FieldDef cnamuni;
    public FieldDef cnamunict;
    public FieldDef cnaidentpf;
    public FieldDef cnacifemp;
    public FieldDef cnacccemp;
    public FieldDef cnainddiscon;
    public FieldDef cnamatexced;
    public FieldDef cnafijdescper;
    public FieldDef cnatempminbon;
    public TabTracontrata(String name)
      {
      super(name);
      cnacodiemp = new FieldDef("cnacodiemp",FieldDef.INTEGER,0);
      cnacodigo = new FieldDef("cnacodigo",FieldDef.INTEGER,0);
      cnarelacion = new FieldDef("cnarelacion",FieldDef.INTEGER,0);
      cnacodigocto = new FieldDef("cnacodigocto",FieldDef.CHAR,50);
      cnacccempprov = new FieldDef("cnacccempprov",FieldDef.INTEGER,0);
      cnacccempnum = new FieldDef("cnacccempnum",FieldDef.INTEGER,0);
      cnacccempdc = new FieldDef("cnacccempdc",FieldDef.INTEGER,0);
      cnaindconvcol = new FieldDef("cnaindconvcol",FieldDef.CHAR,1);
      cnanivelform = new FieldDef("cnanivelform",FieldDef.CHAR,2);
      cnainddiscap = new FieldDef("cnainddiscap",FieldDef.CHAR,1);
      cnacodigoocupa = new FieldDef("cnacodigoocupa",FieldDef.CHAR,4);
      cnaidofertaccaa = new FieldDef("cnaidofertaccaa",FieldDef.CHAR,2);
      cnaidofertanyo = new FieldDef("cnaidofertanyo",FieldDef.INTEGER,0);
      cnaidofertanum = new FieldDef("cnaidofertanum",FieldDef.INTEGER,0);
      cnaprogempleo = new FieldDef("cnaprogempleo",FieldDef.CHAR,2);
      cnanacionalct = new FieldDef("cnanacionalct",FieldDef.INTEGER,0);
      cnaotraslegis = new FieldDef("cnaotraslegis",FieldDef.CHAR,3);
      cnamodexclusion = new FieldDef("cnamodexclusion",FieldDef.CHAR,3);
      cnatitulacion = new FieldDef("cnatitulacion",FieldDef.CHAR,12);
      cnatipojorn = new FieldDef("cnatipojorn",FieldDef.CHAR,1);
      cnahorasjorn = new FieldDef("cnahorasjorn",FieldDef.INTEGER,0);
      cnaminutosjorn = new FieldDef("cnaminutosjorn",FieldDef.INTEGER,0);
      cnahorasconv = new FieldDef("cnahorasconv",FieldDef.INTEGER,0);
      cnaminutosconv = new FieldDef("cnaminutosconv",FieldDef.INTEGER,0);
      cnahorasform = new FieldDef("cnahorasform",FieldDef.INTEGER,0);
      cnaminutosform = new FieldDef("cnaminutosform",FieldDef.INTEGER,0);
      cnaformacteor = new FieldDef("cnaformacteor",FieldDef.CHAR,1);
      cnacolectivedad = new FieldDef("cnacolectivedad",FieldDef.CHAR,2);
      cnaporcjubparc = new FieldDef("cnaporcjubparc",FieldDef.INTEGER,0);
      cnaactsinfecha = new FieldDef("cnaactsinfecha",FieldDef.CHAR,1);
      cnacausinterid = new FieldDef("cnacausinterid",FieldDef.CHAR,1);
      cnacolectbonif = new FieldDef("cnacolectbonif",FieldDef.CHAR,2);
      cnaempleadoraut = new FieldDef("cnaempleadoraut",FieldDef.CHAR,1);
      cnacostedesp = new FieldDef("cnacostedesp",FieldDef.CHAR,1);
      cnacolecdesp = new FieldDef("cnacolecdesp",FieldDef.CHAR,2);
      cnatipotrab = new FieldDef("cnatipotrab",FieldDef.CHAR,1);
      cnanomrelev = new FieldDef("cnanomrelev",FieldDef.CHAR,50);
      cnaapell1rele = new FieldDef("cnaapell1rele",FieldDef.CHAR,50);
      cnaapell2rele = new FieldDef("cnaapell2rele",FieldDef.CHAR,50);
      cnacodetcote = new FieldDef("cnacodetcote",FieldDef.CHAR,3);
      cnaindempleador = new FieldDef("cnaindempleador",FieldDef.CHAR,1);
      cnaindtrab = new FieldDef("cnaindtrab",FieldDef.CHAR,1);
      cnaaltadirec = new FieldDef("cnaaltadirec",FieldDef.CHAR,1);
      cnactoescrito = new FieldDef("cnactoescrito",FieldDef.CHAR,50);
      cnacorplocal = new FieldDef("cnacorplocal",FieldDef.CHAR,1);
      cnaactuacion = new FieldDef("cnaactuacion",FieldDef.CHAR,3);
      cnaejerpresup = new FieldDef("cnaejerpresup",FieldDef.INTEGER,0);
      cnagrupocotiz = new FieldDef("cnagrupocotiz",FieldDef.CHAR,2);
      cnagrpcotizss = new FieldDef("cnagrpcotizss",FieldDef.CHAR,2);
      cnanifusuariett = new FieldDef("cnanifusuariett",FieldDef.CHAR,12);
      cnanomusuariett = new FieldDef("cnanomusuariett",FieldDef.CHAR,50);
      cnaindctoplant = new FieldDef("cnaindctoplant",FieldDef.CHAR,1);
      cnaempextranj = new FieldDef("cnaempextranj",FieldDef.CHAR,1);
      cnatipofirma = new FieldDef("cnatipofirma",FieldDef.CHAR,1);
      cnatextcbas = new FieldDef("cnatextcbas",FieldDef.CHAR,200);
      cnalibreempre = new FieldDef("cnalibreempre",FieldDef.CHAR,30);
      cnacodmsg = new FieldDef("cnacodmsg",FieldDef.INTEGER,0);
      cnaapell2 = new FieldDef("cnaapell2",FieldDef.CHAR,20);
      cnaapell1 = new FieldDef("cnaapell1",FieldDef.CHAR,20);
      cnapais = new FieldDef("cnapais",FieldDef.CHAR,5);
      cnanombre = new FieldDef("cnanombre",FieldDef.CHAR,20);
      cnanacional = new FieldDef("cnanacional",FieldDef.INTEGER,0);
      cnamuni = new FieldDef("cnamuni",FieldDef.INTEGER,0);
      cnamunict = new FieldDef("cnamunict",FieldDef.INTEGER,0);
      cnaidentpf = new FieldDef("cnaidentpf",FieldDef.CHAR,15);
      cnacifemp = new FieldDef("cnacifemp",FieldDef.CHAR,15);
      cnacccemp = new FieldDef("cnacccemp",FieldDef.CHAR,15);
      cnainddiscon = new FieldDef("cnainddiscon",FieldDef.CHAR,1);
      cnamatexced = new FieldDef("cnamatexced",FieldDef.CHAR,1);
      cnafijdescper = new FieldDef("cnafijdescper",FieldDef.CHAR,1);
      cnatempminbon = new FieldDef("cnatempminbon",FieldDef.CHAR,1);
      FieldDef array[] = {
        cnacodiemp,
        cnacodigo,
        cnarelacion,
        cnacodigocto,
        cnacccempprov,
        cnacccempnum,
        cnacccempdc,
        cnaindconvcol,
        cnanivelform,
        cnainddiscap,
        cnacodigoocupa,
        cnaidofertaccaa,
        cnaidofertanyo,
        cnaidofertanum,
        cnaprogempleo,
        cnanacionalct,
        cnaotraslegis,
        cnamodexclusion,
        cnatitulacion,
        cnatipojorn,
        cnahorasjorn,
        cnaminutosjorn,
        cnahorasconv,
        cnaminutosconv,
        cnahorasform,
        cnaminutosform,
        cnaformacteor,
        cnacolectivedad,
        cnaporcjubparc,
        cnaactsinfecha,
        cnacausinterid,
        cnacolectbonif,
        cnaempleadoraut,
        cnacostedesp,
        cnacolecdesp,
        cnatipotrab,
        cnanomrelev,
        cnaapell1rele,
        cnaapell2rele,
        cnacodetcote,
        cnaindempleador,
        cnaindtrab,
        cnaaltadirec,
        cnactoescrito,
        cnacorplocal,
        cnaactuacion,
        cnaejerpresup,
        cnagrupocotiz,
        cnagrpcotizss,
        cnanifusuariett,
        cnanomusuariett,
        cnaindctoplant,
        cnaempextranj,
        cnatipofirma,
        cnatextcbas,
        cnalibreempre,
        cnacodmsg,
        cnaapell2,
        cnaapell1,
        cnapais,
        cnanombre,
        cnanacional,
        cnamuni,
        cnamunict,
        cnaidentpf,
        cnacifemp,
        cnacccemp,
        cnainddiscon,
        cnamatexced,
        cnafijdescper,
        cnatempminbon        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnacodiemp,cnacodigo,cnarelacion,cnacodigocto };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabConvproc extends TableDef
    {
    // Campos
    public FieldDef cnpprocorig;
    public FieldDef cnpprocoridesc;
    public FieldDef cnpprocdest;
    public TabConvproc(String name)
      {
      super(name);
      cnpprocorig = new FieldDef("cnpprocorig",FieldDef.INTEGER,0);
      cnpprocoridesc = new FieldDef("cnpprocoridesc",FieldDef.CHAR,20);
      cnpprocdest = new FieldDef("cnpprocdest",FieldDef.INTEGER,0);
      FieldDef array[] = {
        cnpprocorig,
        cnpprocoridesc,
        cnpprocdest        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnpprocorig };
      setPrimaryKeys(arrayf);
      cnpprocorig.setDescription("Codigo proceso origen");
      cnpprocoridesc.setDescription("Codigo proceso descripcion");
      cnpprocdest.setDescription("Codigo proceso destino");
      }
    }
    
  public class TabDefctocab extends TableDef
    {
    // Campos
    public FieldDef dcccodigo;
    public FieldDef dccversion;
    public FieldDef dcctype;
    public FieldDef dcccodigocont;
    public TabDefctocab(String name)
      {
      super(name);
      dcccodigo = new FieldDef("dcccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dccversion = new FieldDef("dccversion",FieldDef.CHAR,4,FieldDef.NOTNULL);
      dcctype = new FieldDef("dcctype",FieldDef.CHAR,50,FieldDef.NOTNULL);
      dcccodigocont = new FieldDef("dcccodigocont",FieldDef.INTEGER,0);
      FieldDef array[] = {
        dcccodigo,
        dccversion,
        dcctype,
        dcccodigocont        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcccodigo,dccversion,dcctype };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDefctodet extends TableDef
    {
    // Campos
    public FieldDef dcdcodigo;
    public FieldDef dcdbloquetype;
    public FieldDef dcdobligatorio;
    public FieldDef dcdindex;
    public TabDefctodet(String name)
      {
      super(name);
      dcdcodigo = new FieldDef("dcdcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcdbloquetype = new FieldDef("dcdbloquetype",FieldDef.CHAR,50);
      dcdobligatorio = new FieldDef("dcdobligatorio",FieldDef.CHAR,1);
      dcdindex = new FieldDef("dcdindex",FieldDef.INTEGER,0);
      FieldDef array[] = {
        dcdcodigo,
        dcdbloquetype,
        dcdobligatorio,
        dcdindex        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcdcodigo,dcdbloquetype };
      setPrimaryKeys(arrayf);
      dcdcodigo.setDescription("Codi de relació a la taula DEFCTOCAB");
      dcdbloquetype.setDescription("Nom del block");
      dcdobligatorio.setDescription("Bloque obligatorio (S/N)");
      dcdindex.setDescription("Index d'ordenació");
      }
    }
    
  public class TabDefctoblock extends TableDef
    {
    // Campos
    public FieldDef dcbversion;
    public FieldDef dcbelement;
    public FieldDef dcbnomblock;
    public FieldDef dcbblock_prop;
    public FieldDef dcbetiqueta;
    public FieldDef dcbdependiente;
    public FieldDef dcbindex;
    public FieldDef dcbtaula;
    public FieldDef dcbcamp;
    public FieldDef dcbglobal;
    public FieldDef dcbliteral;
    public FieldDef dcbblockpadre;
    public FieldDef dcbobligatori;
    public FieldDef dcbnivell;
    public FieldDef pickup;
    public TabDefctoblock(String name)
      {
      super(name);
      dcbversion = new FieldDef("dcbversion",FieldDef.CHAR,4,FieldDef.NOTNULL);
      dcbelement = new FieldDef("dcbelement",FieldDef.CHAR,50,FieldDef.NOTNULL);
      dcbnomblock = new FieldDef("dcbnomblock",FieldDef.CHAR,50,FieldDef.NOTNULL);
      dcbblock_prop = new FieldDef("dcbblock_prop",FieldDef.CHAR,1);
      dcbetiqueta = new FieldDef("dcbetiqueta",FieldDef.CHAR,50);
      dcbdependiente = new FieldDef("dcbdependiente",FieldDef.CHAR,50);
      dcbindex = new FieldDef("dcbindex",FieldDef.INTEGER,0);
      dcbtaula = new FieldDef("dcbtaula",FieldDef.CHAR,30);
      dcbcamp = new FieldDef("dcbcamp",FieldDef.CHAR,30);
      dcbglobal = new FieldDef("dcbglobal",FieldDef.CHAR,50);
      dcbliteral = new FieldDef("dcbliteral",FieldDef.CHAR,50);
      dcbblockpadre = new FieldDef("dcbblockpadre",FieldDef.CHAR,50);
      dcbobligatori = new FieldDef("dcbobligatori",FieldDef.CHAR,1);
      dcbnivell = new FieldDef("dcbnivell",FieldDef.CHAR,1);
      pickup = new FieldDef("pickup",FieldDef.CHAR,50);
      FieldDef array[] = {
        dcbversion,
        dcbelement,
        dcbnomblock,
        dcbblock_prop,
        dcbetiqueta,
        dcbdependiente,
        dcbindex,
        dcbtaula,
        dcbcamp,
        dcbglobal,
        dcbliteral,
        dcbblockpadre,
        dcbobligatori,
        dcbnivell,
        pickup        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcbversion,dcbelement,dcbnomblock };
      setPrimaryKeys(arrayf);
      dcbversion.setDescription("Versión INEM del Contrat@");
      dcbelement.setDescription("Element (CONTRATO, PRORROGA, TRANSFORMACION. LLAMAMIENTO)");
      dcbnomblock.setDescription("Nombre del BLOQUE_TYPE");
      dcbblock_prop.setDescription("Block o Propietat (B/P)");
      dcbetiqueta.setDescription("Etiqueta que apareixerà a l'XML");
      dcbdependiente.setDescription("Nombre del bloque dependiente (S/N)");
      dcbindex.setDescription("Index d¡ordenacion de les propietats i block dependents");
      dcbtaula.setDescription("Nom de la taula que conté el valor");
      dcbcamp.setDescription("Nom del camp que conté el valor");
      dcbglobal.setDescription("Nom de la global que retorna el valor");
      dcbliteral.setDescription("Valor literal");
      dcbblockpadre.setDescription("Nom del block pare");
      dcbobligatori.setDescription("Block o propietat obligatoria (S/N)");
      dcbnivell.setDescription("Nivell al que s'ha de buscar a la BBDD d'EASP (E=Empresa / T=Trabajador / C=Centro)");
      pickup.setDescription("Pickup que conté els possibles valors");
      }
    }
    
  public class TabPartes extends TableDef
    {
    // Campos
    public FieldDef parcodigo;
    public FieldDef parcodiemp;
    public FieldDef partrabajador;
    public FieldDef parejercicio;
    public FieldDef parcodinciden;
    public FieldDef parperiodo;
    public FieldDef parproceso;
    public FieldDef parinciden;
    public FieldDef paraccrec;
    public FieldDef parmesantig;
    public FieldDef pardiasantig;
    public FieldDef parsitprof;
    public FieldDef parregimen;
    public FieldDef parplantillacc;
    public FieldDef paractuacioncc;
    public FieldDef parmodpreven;
    public FieldDef parlugaracc;
    public FieldDef paracctrafico;
    public FieldDef parpaisacc;
    public FieldDef parprovacc;
    public FieldDef parmuniacc;
    public FieldDef pardiracc;
    public FieldDef parviakmacc;
    public FieldDef parotrolugacc;
    public FieldDef parcentrabacc;
    public FieldDef parcifcentro;
    public FieldDef parcentrabraz;
    public FieldDef parcentrabdom;
    public FieldDef parcentrabprov;
    public FieldDef parcentrabmuni;
    public FieldDef parcentrabcp;
    public FieldDef parcentrabtelf;
    public FieldDef parcentrabplan;
    public FieldDef parcentrabccc1;
    public FieldDef parcentrabccc2;
    public FieldDef parcentrabccc3;
    public FieldDef parcentrabact;
    public FieldDef parfechaacc;
    public FieldDef parfechabaja;
    public FieldDef pardiasemacc;
    public FieldDef parhoraacc;
    public FieldDef parhoratrabacc;
    public FieldDef partrabahab;
    public FieldDef parevalriesgos;
    public FieldDef pardescripacc1;
    public FieldDef pardescripacc2;
    public FieldDef pardescripacc3;
    public FieldDef paracclugar;
    public FieldDef paracctipotrab;
    public FieldDef paraccactfis;
    public FieldDef paraccagmatfis;
    public FieldDef paraccdesv;
    public FieldDef paraccagmatdes;
    public FieldDef paraccforma;
    public FieldDef paraccagmatfor;
    public FieldDef parmasunatrabr;
    public FieldDef paracctestigos;
    public FieldDef paraccdattest;
    public FieldDef pardesclesion;
    public FieldDef pargradolesion;
    public FieldDef parpartelesion;
    public FieldDef parnommedico;
    public FieldDef partipoasist;
    public FieldDef parhospitaliz;
    public FieldDef parnomhospital;
    public FieldDef parbcotizmesant;
    public FieldDef pardiascotiz;
    public FieldDef parbregmant;
    public FieldDef parb1horextr;
    public FieldDef parb2otrcon;
    public FieldDef parbregdia_a;
    public FieldDef parbregdia_b;
    public FieldDef parasistlegal;
    public FieldDef parcalidad;
    public FieldDef parlugexp;
    public FieldDef parfechaexp;
    public FieldDef parnumgestora;
    public FieldDef parnumexp;
    public FieldDef parnacionalidad;
    public FieldDef pardirmedico;
    public FieldDef partelfmedico;
    public FieldDef parrefalta;
    public FieldDef parcod_egc;
    public FieldDef pargradoreal;
    public FieldDef parfechaalta;
    public FieldDef parcausaalta;
    public FieldDef pardiagnostico;
    public FieldDef parcentrabcnae;
    public FieldDef paridsolserv;
    public FieldDef parnumrevision;
    public FieldDef parnumregistro;
    public FieldDef partipoempacc;
    public TabPartes(String name)
      {
      super(name);
      parcodigo = new FieldDef("parcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      parcodiemp = new FieldDef("parcodiemp",FieldDef.INTEGER,0);
      partrabajador = new FieldDef("partrabajador",FieldDef.INTEGER,0);
      parejercicio = new FieldDef("parejercicio",FieldDef.INTEGER,0);
      parcodinciden = new FieldDef("parcodinciden",FieldDef.INTEGER,0);
      parperiodo = new FieldDef("parperiodo",FieldDef.INTEGER,0);
      parproceso = new FieldDef("parproceso",FieldDef.INTEGER,0);
      parinciden = new FieldDef("parinciden",FieldDef.INTEGER,0);
      paraccrec = new FieldDef("paraccrec",FieldDef.CHAR,1);
      parmesantig = new FieldDef("parmesantig",FieldDef.INTEGER,0);
      pardiasantig = new FieldDef("pardiasantig",FieldDef.INTEGER,0);
      parsitprof = new FieldDef("parsitprof",FieldDef.INTEGER,0);
      parregimen = new FieldDef("parregimen",FieldDef.INTEGER,0);
      parplantillacc = new FieldDef("parplantillacc",FieldDef.INTEGER,0);
      paractuacioncc = new FieldDef("paractuacioncc",FieldDef.INTEGER,0);
      parmodpreven = new FieldDef("parmodpreven",FieldDef.INTEGER,0);
      parlugaracc = new FieldDef("parlugaracc",FieldDef.INTEGER,0);
      paracctrafico = new FieldDef("paracctrafico",FieldDef.CHAR,1);
      parpaisacc = new FieldDef("parpaisacc",FieldDef.INTEGER,0);
      parprovacc = new FieldDef("parprovacc",FieldDef.INTEGER,0);
      parmuniacc = new FieldDef("parmuniacc",FieldDef.INTEGER,0);
      pardiracc = new FieldDef("pardiracc",FieldDef.CHAR,30);
      parviakmacc = new FieldDef("parviakmacc",FieldDef.CHAR,15);
      parotrolugacc = new FieldDef("parotrolugacc",FieldDef.CHAR,20);
      parcentrabacc = new FieldDef("parcentrabacc",FieldDef.INTEGER,0);
      parcifcentro = new FieldDef("parcifcentro",FieldDef.CHAR,15);
      parcentrabraz = new FieldDef("parcentrabraz",FieldDef.CHAR,200);
      parcentrabdom = new FieldDef("parcentrabdom",FieldDef.CHAR,60);
      parcentrabprov = new FieldDef("parcentrabprov",FieldDef.INTEGER,0);
      parcentrabmuni = new FieldDef("parcentrabmuni",FieldDef.INTEGER,0);
      parcentrabcp = new FieldDef("parcentrabcp",FieldDef.INTEGER,0);
      parcentrabtelf = new FieldDef("parcentrabtelf",FieldDef.CHAR,10);
      parcentrabplan = new FieldDef("parcentrabplan",FieldDef.INTEGER,0);
      parcentrabccc1 = new FieldDef("parcentrabccc1",FieldDef.INTEGER,0);
      parcentrabccc2 = new FieldDef("parcentrabccc2",FieldDef.INTEGER,0);
      parcentrabccc3 = new FieldDef("parcentrabccc3",FieldDef.INTEGER,0);
      parcentrabact = new FieldDef("parcentrabact",FieldDef.CHAR,3);
      parfechaacc = new FieldDef("parfechaacc",FieldDef.DATE);
      parfechabaja = new FieldDef("parfechabaja",FieldDef.DATE);
      pardiasemacc = new FieldDef("pardiasemacc",FieldDef.CHAR,10);
      parhoraacc = new FieldDef("parhoraacc",FieldDef.INTEGER,0);
      parhoratrabacc = new FieldDef("parhoratrabacc",FieldDef.INTEGER,0);
      partrabahab = new FieldDef("partrabahab",FieldDef.CHAR,1);
      parevalriesgos = new FieldDef("parevalriesgos",FieldDef.CHAR,1);
      pardescripacc1 = new FieldDef("pardescripacc1",FieldDef.CHAR,60);
      pardescripacc2 = new FieldDef("pardescripacc2",FieldDef.CHAR,60);
      pardescripacc3 = new FieldDef("pardescripacc3",FieldDef.CHAR,60);
      paracclugar = new FieldDef("paracclugar",FieldDef.INTEGER,0);
      paracctipotrab = new FieldDef("paracctipotrab",FieldDef.INTEGER,0);
      paraccactfis = new FieldDef("paraccactfis",FieldDef.INTEGER,0);
      paraccagmatfis = new FieldDef("paraccagmatfis",FieldDef.CHAR,8);
      paraccdesv = new FieldDef("paraccdesv",FieldDef.INTEGER,0);
      paraccagmatdes = new FieldDef("paraccagmatdes",FieldDef.CHAR,8);
      paraccforma = new FieldDef("paraccforma",FieldDef.INTEGER,0);
      paraccagmatfor = new FieldDef("paraccagmatfor",FieldDef.CHAR,8);
      parmasunatrabr = new FieldDef("parmasunatrabr",FieldDef.CHAR,1);
      paracctestigos = new FieldDef("paracctestigos",FieldDef.CHAR,1);
      paraccdattest = new FieldDef("paraccdattest",FieldDef.CHAR,70);
      pardesclesion = new FieldDef("pardesclesion",FieldDef.INTEGER,0);
      pargradolesion = new FieldDef("pargradolesion",FieldDef.INTEGER,0);
      parpartelesion = new FieldDef("parpartelesion",FieldDef.INTEGER,0);
      parnommedico = new FieldDef("parnommedico",FieldDef.CHAR,40);
      partipoasist = new FieldDef("partipoasist",FieldDef.INTEGER,0);
      parhospitaliz = new FieldDef("parhospitaliz",FieldDef.CHAR,1);
      parnomhospital = new FieldDef("parnomhospital",FieldDef.CHAR,30);
      parbcotizmesant = new FieldDef("parbcotizmesant",FieldDef.FLOAT,6,0);
      pardiascotiz = new FieldDef("pardiascotiz",FieldDef.INTEGER,0);
      parbregmant = new FieldDef("parbregmant",FieldDef.FLOAT,6,0);
      parb1horextr = new FieldDef("parb1horextr",FieldDef.FLOAT,6,0);
      parb2otrcon = new FieldDef("parb2otrcon",FieldDef.FLOAT,6,0);
      parbregdia_a = new FieldDef("parbregdia_a",FieldDef.FLOAT,6,0);
      parbregdia_b = new FieldDef("parbregdia_b",FieldDef.FLOAT,6,0);
      parasistlegal = new FieldDef("parasistlegal",FieldDef.CHAR,30);
      parcalidad = new FieldDef("parcalidad",FieldDef.CHAR,15);
      parlugexp = new FieldDef("parlugexp",FieldDef.CHAR,20);
      parfechaexp = new FieldDef("parfechaexp",FieldDef.DATE);
      parnumgestora = new FieldDef("parnumgestora",FieldDef.CHAR,15);
      parnumexp = new FieldDef("parnumexp",FieldDef.CHAR,20);
      parnacionalidad = new FieldDef("parnacionalidad",FieldDef.CHAR,3);
      pardirmedico = new FieldDef("pardirmedico",FieldDef.CHAR,80);
      partelfmedico = new FieldDef("partelfmedico",FieldDef.CHAR,14);
      parrefalta = new FieldDef("parrefalta",FieldDef.INTEGER,0);
      parcod_egc = new FieldDef("parcod_egc",FieldDef.INTEGER,0);
      pargradoreal = new FieldDef("pargradoreal",FieldDef.INTEGER,0);
      parfechaalta = new FieldDef("parfechaalta",FieldDef.DATE);
      parcausaalta = new FieldDef("parcausaalta",FieldDef.INTEGER,0);
      pardiagnostico = new FieldDef("pardiagnostico",FieldDef.CHAR,5);
      parcentrabcnae = new FieldDef("parcentrabcnae",FieldDef.CHAR,5);
      paridsolserv = new FieldDef("paridsolserv",FieldDef.INTEGER,0);
      parnumrevision = new FieldDef("parnumrevision",FieldDef.INTEGER,0);
      parnumregistro = new FieldDef("parnumregistro",FieldDef.CHAR,30);
      partipoempacc = new FieldDef("partipoempacc",FieldDef.INTEGER,0);
      FieldDef array[] = {
        parcodigo,
        parcodiemp,
        partrabajador,
        parejercicio,
        parcodinciden,
        parperiodo,
        parproceso,
        parinciden,
        paraccrec,
        parmesantig,
        pardiasantig,
        parsitprof,
        parregimen,
        parplantillacc,
        paractuacioncc,
        parmodpreven,
        parlugaracc,
        paracctrafico,
        parpaisacc,
        parprovacc,
        parmuniacc,
        pardiracc,
        parviakmacc,
        parotrolugacc,
        parcentrabacc,
        parcifcentro,
        parcentrabraz,
        parcentrabdom,
        parcentrabprov,
        parcentrabmuni,
        parcentrabcp,
        parcentrabtelf,
        parcentrabplan,
        parcentrabccc1,
        parcentrabccc2,
        parcentrabccc3,
        parcentrabact,
        parfechaacc,
        parfechabaja,
        pardiasemacc,
        parhoraacc,
        parhoratrabacc,
        partrabahab,
        parevalriesgos,
        pardescripacc1,
        pardescripacc2,
        pardescripacc3,
        paracclugar,
        paracctipotrab,
        paraccactfis,
        paraccagmatfis,
        paraccdesv,
        paraccagmatdes,
        paraccforma,
        paraccagmatfor,
        parmasunatrabr,
        paracctestigos,
        paraccdattest,
        pardesclesion,
        pargradolesion,
        parpartelesion,
        parnommedico,
        partipoasist,
        parhospitaliz,
        parnomhospital,
        parbcotizmesant,
        pardiascotiz,
        parbregmant,
        parb1horextr,
        parb2otrcon,
        parbregdia_a,
        parbregdia_b,
        parasistlegal,
        parcalidad,
        parlugexp,
        parfechaexp,
        parnumgestora,
        parnumexp,
        parnacionalidad,
        pardirmedico,
        partelfmedico,
        parrefalta,
        parcod_egc,
        pargradoreal,
        parfechaalta,
        parcausaalta,
        pardiagnostico,
        parcentrabcnae,
        paridsolserv,
        parnumrevision,
        parnumregistro,
        partipoempacc        
        };
      setColumns(array);
      FieldDef arrayf[] = {parcodigo };
      setPrimaryKeys(arrayf);
      parcodigo.setAutoIncrementable(true);
      parcodiemp.setDescription("Código de empresa");
      partrabajador.setDescription("Código trabajador");
      parejercicio.setDescription("Ejercicio");
      parcodinciden.setDescription("Código de la incidencia");
      parperiodo.setDescription("Periodo");
      parproceso.setDescription("Proceso");
      parinciden.setDescription("Incidencia");
      paraccrec.setDescription("Accidente o recaida");
      parmesantig.setDescription("Meses antiguedad");
      pardiasantig.setDescription("Dias de antiguedad");
      parsitprof.setDescription("Situación profesional");
      parregimen.setDescription("Régimen seguridad social");
      parplantillacc.setDescription("Plantilla de la C.C.");
      paractuacioncc.setDescription("Actuacion en el momento del accidente");
      parmodpreven.setDescription("Modalidad preventiva");
      parlugaracc.setDescription("Lugar accidente");
      paracctrafico.setDescription("Accidente de trafico");
      parpaisacc.setDescription("Pais del accidente");
      parprovacc.setDescription("Provincia lugar del accidente");
      parmuniacc.setDescription("Municipio lugar del accidente");
      pardiracc.setDescription("Direccion lugar del accidente");
      parviakmacc.setDescription("Via y KM lugar del accidente");
      parotrolugacc.setDescription("Otro lugar del accidente");
      parcentrabacc.setDescription("Centro de trabajo");
      parcifcentro.setDescription("CIF/NIF Otro centro de trabajo");
      parcentrabraz.setDescription("Razon Social centro de trabajo");
      parcentrabdom.setDescription("Domicilio centro de trabajo");
      parcentrabprov.setDescription("Provincia del centro de trabajo");
      parcentrabmuni.setDescription("Municipio centro de trabjo");
      parcentrabcp.setDescription("Codigo postal centro de trabajo");
      parcentrabtelf.setDescription("Telefono centro de trabajo");
      parcentrabplan.setDescription("Plantilla del centro de trabajo");
      parcentrabccc1.setDescription("CCC del centro de trabajo PROV");
      parcentrabccc2.setDescription("CCC del centro de trabajo NUM");
      parcentrabccc3.setDescription("CCC del centro de trabajo DC");
      parcentrabact.setDescription("Actividad principal del centro");
      parfechaacc.setDescription("Fecha del accidente");
      parfechabaja.setDescription("Fecha de baja");
      pardiasemacc.setDescription("Dia de la semana del accidente");
      parhoraacc.setDescription("Hora del accidente");
      parhoratrabacc.setDescription("Hora laboral del accidente");
      partrabahab.setDescription("Trabajo habitual");
      parevalriesgos.setDescription("Evaluacion de riesgos");
      pardescripacc1.setDescription("Descripcion del accidente");
      pardescripacc2.setDescription("Descripcion del accidente");
      pardescripacc3.setDescription("Descripcion del accidente");
      paracclugar.setDescription("Lugar del accidente");
      paracctipotrab.setDescription("Tipo de trabajo");
      paraccactfis.setDescription("Actividad fisica especifica");
      paraccagmatfis.setDescription("Agente mat.asoc. a act. fisica");
      paraccdesv.setDescription("Desviacion del trabajo  habit.");
      paraccagmatdes.setDescription("Agente mat.asoc. a desviacion");
      paraccforma.setDescription("Forma, modalidad lesion");
      paraccagmatfor.setDescription("Agente mat.asoc. a la forma");
      parmasunatrabr.setDescription("Acc. afecta a mas de un trab.");
      paracctestigos.setDescription("Testigos del accidente");
      paraccdattest.setDescription("Datos del testigo");
      pardesclesion.setDescription("Descripcion de la lesion");
      pargradolesion.setDescription("Grado de la lesion");
      parpartelesion.setDescription("Parte lesionada");
      parnommedico.setDescription("Nombre medico asist. inmediata");
      partipoasist.setDescription("Tipo asistencia");
      parhospitaliz.setDescription("Hospitalizacion debido al acc.");
      parnomhospital.setDescription("Nombre del hospital");
      parbcotizmesant.setDescription("Base cotizacion mes anterior");
      pardiascotiz.setDescription("Dias cotizados el mes anterior");
      parbregmant.setDescription("Base reguladora mes anterior");
      parb1horextr.setDescription("Base 1 por horas extra");
      parb2otrcon.setDescription("Base 2 por otros conceptos");
      parbregdia_a.setDescription("Base reguladora diaria A");
      parbregdia_b.setDescription("Base reguladora diaria B");
      parasistlegal.setDescription("Expedidor del parte de acc.");
      parcalidad.setDescription("En calidad de...");
      parlugexp.setDescription("Lugar expedicion del parte");
      parfechaexp.setDescription("Fecha de expedicion");
      parnumgestora.setDescription("Numero entidad gestora o colabor.");
      parnumexp.setDescription("Numero expediente");
      parnacionalidad.setDescription("Nacionalidad");
      pardirmedico.setDescription("Direccion medico asistente");
      partelfmedico.setDescription("Telefono del medico asistente");
      parrefalta.setDescription("Num. ref. del parte en S. Delta");
      parcod_egc.setDescription("Codigo Entid. Gestora/Colab.");
      pargradoreal.setDescription("Grado real de la lesion");
      parfechaalta.setDescription("Fecha de la alta medica");
      parcausaalta.setDescription("Causa del alta");
      pardiagnostico.setDescription("Diagnostico");
      parcentrabcnae.setDescription("CNAE del centro de trabajo");
      paridsolserv.setDescription("ID Solicitud servicio CAT365");
      parnumrevision.setDescription("Num. Version modificacion");
      parnumregistro.setDescription("Codigo registro ZAOCE");
      partipoempacc.setDescription("Tipo de empresa del accidente");
      }
    }
    
  public class TabTextosreb extends TableDef
    {
    // Campos
    public FieldDef txrcodigo;
    public FieldDef txrcodiemp;
    public FieldDef txrcentro;
    public FieldDef txrtrabajador;
    public FieldDef txrproceso;
    public FieldDef txrarea;
    public FieldDef txrtextlin1;
    public FieldDef txrtextlin2;
    public FieldDef txrtextlin3;
    public FieldDef txrtextlin4;
    public FieldDef txrtextlin5;
    public FieldDef txrtextlin6;
    public FieldDef txrvariable1;
    public FieldDef txrvariable2;
    public FieldDef txrvariable3;
    public FieldDef txrvariable4;
    public FieldDef txrvariable5;
    public FieldDef txrvariable6;
    public FieldDef txrtextpie1;
    public FieldDef txrtextpie2;
    public FieldDef txrtextpie3;
    public FieldDef txrtextpie4;
    public FieldDef txrtextpie5;
    public FieldDef txrtextpie6;
    public FieldDef txrvaripie1;
    public FieldDef txrvaripie2;
    public FieldDef txrvaripie3;
    public FieldDef txrvaripie4;
    public FieldDef txrvaripie5;
    public FieldDef txrvaripie6;
    public TabTextosreb(String name)
      {
      super(name);
      txrcodigo = new FieldDef("txrcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      txrcodiemp = new FieldDef("txrcodiemp",FieldDef.INTEGER,0);
      txrcentro = new FieldDef("txrcentro",FieldDef.INTEGER,0);
      txrtrabajador = new FieldDef("txrtrabajador",FieldDef.INTEGER,0);
      txrproceso = new FieldDef("txrproceso",FieldDef.INTEGER,0);
      txrarea = new FieldDef("txrarea",FieldDef.INTEGER,0);
      txrtextlin1 = new FieldDef("txrtextlin1",FieldDef.CHAR,140);
      txrtextlin2 = new FieldDef("txrtextlin2",FieldDef.CHAR,140);
      txrtextlin3 = new FieldDef("txrtextlin3",FieldDef.CHAR,140);
      txrtextlin4 = new FieldDef("txrtextlin4",FieldDef.CHAR,140);
      txrtextlin5 = new FieldDef("txrtextlin5",FieldDef.CHAR,140);
      txrtextlin6 = new FieldDef("txrtextlin6",FieldDef.CHAR,140);
      txrvariable1 = new FieldDef("txrvariable1",FieldDef.CHAR,15);
      txrvariable2 = new FieldDef("txrvariable2",FieldDef.CHAR,15);
      txrvariable3 = new FieldDef("txrvariable3",FieldDef.CHAR,15);
      txrvariable4 = new FieldDef("txrvariable4",FieldDef.CHAR,15);
      txrvariable5 = new FieldDef("txrvariable5",FieldDef.CHAR,15);
      txrvariable6 = new FieldDef("txrvariable6",FieldDef.CHAR,15);
      txrtextpie1 = new FieldDef("txrtextpie1",FieldDef.CHAR,140);
      txrtextpie2 = new FieldDef("txrtextpie2",FieldDef.CHAR,140);
      txrtextpie3 = new FieldDef("txrtextpie3",FieldDef.CHAR,140);
      txrtextpie4 = new FieldDef("txrtextpie4",FieldDef.CHAR,140);
      txrtextpie5 = new FieldDef("txrtextpie5",FieldDef.CHAR,140);
      txrtextpie6 = new FieldDef("txrtextpie6",FieldDef.CHAR,140);
      txrvaripie1 = new FieldDef("txrvaripie1",FieldDef.CHAR,15);
      txrvaripie2 = new FieldDef("txrvaripie2",FieldDef.CHAR,15);
      txrvaripie3 = new FieldDef("txrvaripie3",FieldDef.CHAR,15);
      txrvaripie4 = new FieldDef("txrvaripie4",FieldDef.CHAR,15);
      txrvaripie5 = new FieldDef("txrvaripie5",FieldDef.CHAR,15);
      txrvaripie6 = new FieldDef("txrvaripie6",FieldDef.CHAR,15);
      FieldDef array[] = {
        txrcodigo,
        txrcodiemp,
        txrcentro,
        txrtrabajador,
        txrproceso,
        txrarea,
        txrtextlin1,
        txrtextlin2,
        txrtextlin3,
        txrtextlin4,
        txrtextlin5,
        txrtextlin6,
        txrvariable1,
        txrvariable2,
        txrvariable3,
        txrvariable4,
        txrvariable5,
        txrvariable6,
        txrtextpie1,
        txrtextpie2,
        txrtextpie3,
        txrtextpie4,
        txrtextpie5,
        txrtextpie6,
        txrvaripie1,
        txrvaripie2,
        txrvaripie3,
        txrvaripie4,
        txrvaripie5,
        txrvaripie6        
        };
      setColumns(array);
      FieldDef arrayf[] = {txrcodigo };
      setPrimaryKeys(arrayf);
      txrcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabHistextos extends TableDef
    {
    // Campos
    public FieldDef htxcodigo;
    public FieldDef htxcalculo;
    public FieldDef htxcodiemp;
    public FieldDef htxcentro;
    public FieldDef htxtrabajador;
    public FieldDef htxproceso;
    public FieldDef htxarea;
    public FieldDef htxtextlin1;
    public FieldDef htxtextlin2;
    public FieldDef htxtextlin3;
    public FieldDef htxtextlin4;
    public FieldDef htxtextlin5;
    public FieldDef htxtextlin6;
    public FieldDef htxtextpie1;
    public FieldDef htxtextpie2;
    public FieldDef htxtextpie3;
    public FieldDef htxtextpie4;
    public FieldDef htxtextpie5;
    public FieldDef htxtextpie6;
    public FieldDef htxejercicio;
    public FieldDef htxperiodo;
    public TabHistextos(String name)
      {
      super(name);
      htxcodigo = new FieldDef("htxcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      htxcalculo = new FieldDef("htxcalculo",FieldDef.INTEGER,0);
      htxcodiemp = new FieldDef("htxcodiemp",FieldDef.INTEGER,0);
      htxcentro = new FieldDef("htxcentro",FieldDef.INTEGER,0);
      htxtrabajador = new FieldDef("htxtrabajador",FieldDef.INTEGER,0);
      htxproceso = new FieldDef("htxproceso",FieldDef.INTEGER,0);
      htxarea = new FieldDef("htxarea",FieldDef.INTEGER,0);
      htxtextlin1 = new FieldDef("htxtextlin1",FieldDef.CHAR,140);
      htxtextlin2 = new FieldDef("htxtextlin2",FieldDef.CHAR,140);
      htxtextlin3 = new FieldDef("htxtextlin3",FieldDef.CHAR,140);
      htxtextlin4 = new FieldDef("htxtextlin4",FieldDef.CHAR,140);
      htxtextlin5 = new FieldDef("htxtextlin5",FieldDef.CHAR,140);
      htxtextlin6 = new FieldDef("htxtextlin6",FieldDef.CHAR,140);
      htxtextpie1 = new FieldDef("htxtextpie1",FieldDef.CHAR,140);
      htxtextpie2 = new FieldDef("htxtextpie2",FieldDef.CHAR,140);
      htxtextpie3 = new FieldDef("htxtextpie3",FieldDef.CHAR,140);
      htxtextpie4 = new FieldDef("htxtextpie4",FieldDef.CHAR,140);
      htxtextpie5 = new FieldDef("htxtextpie5",FieldDef.CHAR,140);
      htxtextpie6 = new FieldDef("htxtextpie6",FieldDef.CHAR,140);
      htxejercicio = new FieldDef("htxejercicio",FieldDef.INTEGER,0);
      htxperiodo = new FieldDef("htxperiodo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        htxcodigo,
        htxcalculo,
        htxcodiemp,
        htxcentro,
        htxtrabajador,
        htxproceso,
        htxarea,
        htxtextlin1,
        htxtextlin2,
        htxtextlin3,
        htxtextlin4,
        htxtextlin5,
        htxtextlin6,
        htxtextpie1,
        htxtextpie2,
        htxtextpie3,
        htxtextpie4,
        htxtextpie5,
        htxtextpie6,
        htxejercicio,
        htxperiodo        
        };
      setColumns(array);
      FieldDef arrayf[] = {htxcodigo };
      setPrimaryKeys(arrayf);
      htxcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabSscnae extends TableDef
    {
    // Campos
    public FieldDef scnaejercicio;
    public FieldDef scnaperi;
    public FieldDef scnacodigo;
    public FieldDef scnadescrip;
    public FieldDef scnailt;
    public FieldDef scnaims;
    public FieldDef scnacodimpr;
    public FieldDef scnatipo;
    public TabSscnae(String name)
      {
      super(name);
      scnaejercicio = new FieldDef("scnaejercicio",FieldDef.INTEGER,0);
      scnaperi = new FieldDef("scnaperi",FieldDef.INTEGER,0);
      scnacodigo = new FieldDef("scnacodigo",FieldDef.CHAR,7);
      scnadescrip = new FieldDef("scnadescrip",FieldDef.CHAR,180);
      scnailt = new FieldDef("scnailt",FieldDef.FLOAT,6,0);
      scnaims = new FieldDef("scnaims",FieldDef.FLOAT,6,0);
      scnacodimpr = new FieldDef("scnacodimpr",FieldDef.CHAR,7);
      scnatipo = new FieldDef("scnatipo",FieldDef.CHAR,1);
      FieldDef array[] = {
        scnaejercicio,
        scnaperi,
        scnacodigo,
        scnadescrip,
        scnailt,
        scnaims,
        scnacodimpr,
        scnatipo        
        };
      setColumns(array);
      FieldDef arrayf[] = {scnaejercicio,scnaperi,scnacodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSscnaedet extends TableDef
    {
    // Campos
    public FieldDef scdaejercicio;
    public FieldDef scdaperi;
    public FieldDef scdacodigo;
    public FieldDef scdadescrip;
    public FieldDef scdrelass;
    public TabSscnaedet(String name)
      {
      super(name);
      scdaejercicio = new FieldDef("scdaejercicio",FieldDef.INTEGER,0);
      scdaperi = new FieldDef("scdaperi",FieldDef.INTEGER,0);
      scdacodigo = new FieldDef("scdacodigo",FieldDef.CHAR,5);
      scdadescrip = new FieldDef("scdadescrip",FieldDef.CHAR,180);
      scdrelass = new FieldDef("scdrelass",FieldDef.CHAR,7);
      FieldDef array[] = {
        scdaejercicio,
        scdaperi,
        scdacodigo,
        scdadescrip,
        scdrelass        
        };
      setColumns(array);
      FieldDef arrayf[] = {scdaejercicio,scdaperi,scdacodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSscnae09 extends TableDef
    {
    // Campos
    public FieldDef scna9ejercicio;
    public FieldDef scna9peri;
    public FieldDef scna9codigo;
    public FieldDef scna9descrip;
    public FieldDef scna9ilt;
    public FieldDef scna9ims;
    public FieldDef scna9codimpr;
    public FieldDef scna9tipo;
    public TabSscnae09(String name)
      {
      super(name);
      scna9ejercicio = new FieldDef("scna9ejercicio",FieldDef.INTEGER,0);
      scna9peri = new FieldDef("scna9peri",FieldDef.INTEGER,0);
      scna9codigo = new FieldDef("scna9codigo",FieldDef.CHAR,4);
      scna9descrip = new FieldDef("scna9descrip",FieldDef.CHAR,180);
      scna9ilt = new FieldDef("scna9ilt",FieldDef.FLOAT,6,0);
      scna9ims = new FieldDef("scna9ims",FieldDef.FLOAT,6,0);
      scna9codimpr = new FieldDef("scna9codimpr",FieldDef.CHAR,7);
      scna9tipo = new FieldDef("scna9tipo",FieldDef.CHAR,1);
      FieldDef array[] = {
        scna9ejercicio,
        scna9peri,
        scna9codigo,
        scna9descrip,
        scna9ilt,
        scna9ims,
        scna9codimpr,
        scna9tipo        
        };
      setColumns(array);
      FieldDef arrayf[] = {scna9ejercicio,scna9peri,scna9codigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCnaeequival extends TableDef
    {
    // Campos
    public FieldDef cneqcodigo;
    public FieldDef cneqdescrip;
    public FieldDef cneqcodigo09;
    public FieldDef cneqdescrip09;
    public TabCnaeequival(String name)
      {
      super(name);
      cneqcodigo = new FieldDef("cneqcodigo",FieldDef.CHAR,7);
      cneqdescrip = new FieldDef("cneqdescrip",FieldDef.CHAR,180);
      cneqcodigo09 = new FieldDef("cneqcodigo09",FieldDef.CHAR,4);
      cneqdescrip09 = new FieldDef("cneqdescrip09",FieldDef.CHAR,180);
      FieldDef array[] = {
        cneqcodigo,
        cneqdescrip,
        cneqcodigo09,
        cneqdescrip09        
        };
      setColumns(array);
      FieldDef arrayf[] = {cneqcodigo,cneqcodigo09 };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabXisretri extends TableDef
    {
    // Campos
    public FieldDef xisrcodigo;
    public FieldDef xisrcalculo;
    public FieldDef xisrejercicio;
    public FieldDef xisrperiodo;
    public FieldDef xisrproceso;
    public FieldDef xisrempresa;
    public FieldDef xisrtrabajador;
    public FieldDef xisrconvemp;
    public FieldDef xisrconcepto;
    public FieldDef xisrdescripcion;
    public FieldDef xisrfactor;
    public FieldDef xisrunidades;
    public FieldDef xisrimporte;
    public FieldDef xisrporcinc;
    public FieldDef xisrinciden;
    public TabXisretri(String name)
      {
      super(name);
      xisrcodigo = new FieldDef("xisrcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      xisrcalculo = new FieldDef("xisrcalculo",FieldDef.INTEGER,0);
      xisrejercicio = new FieldDef("xisrejercicio",FieldDef.INTEGER,0);
      xisrperiodo = new FieldDef("xisrperiodo",FieldDef.INTEGER,0);
      xisrproceso = new FieldDef("xisrproceso",FieldDef.INTEGER,0);
      xisrempresa = new FieldDef("xisrempresa",FieldDef.INTEGER,0);
      xisrtrabajador = new FieldDef("xisrtrabajador",FieldDef.INTEGER,0);
      xisrconvemp = new FieldDef("xisrconvemp",FieldDef.CHAR,7);
      xisrconcepto = new FieldDef("xisrconcepto",FieldDef.INTEGER,0);
      xisrdescripcion = new FieldDef("xisrdescripcion",FieldDef.CHAR,50);
      xisrfactor = new FieldDef("xisrfactor",FieldDef.FLOAT,6,0);
      xisrunidades = new FieldDef("xisrunidades",FieldDef.FLOAT,6,0);
      xisrimporte = new FieldDef("xisrimporte",FieldDef.FLOAT,6,0);
      xisrporcinc = new FieldDef("xisrporcinc",FieldDef.FLOAT,6,0);
      xisrinciden = new FieldDef("xisrinciden",FieldDef.INTEGER,0);
      FieldDef array[] = {
        xisrcodigo,
        xisrcalculo,
        xisrejercicio,
        xisrperiodo,
        xisrproceso,
        xisrempresa,
        xisrtrabajador,
        xisrconvemp,
        xisrconcepto,
        xisrdescripcion,
        xisrfactor,
        xisrunidades,
        xisrimporte,
        xisrporcinc,
        xisrinciden        
        };
      setColumns(array);
      FieldDef arrayf[] = {xisrcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabXisdeduc extends TableDef
    {
    // Campos
    public FieldDef xisdcodigo;
    public FieldDef xisdcalculo;
    public FieldDef xisdejercicio;
    public FieldDef xisdperiodo;
    public FieldDef xisdproceso;
    public FieldDef xisdempresa;
    public FieldDef xisdtrabajador;
    public FieldDef xisdconvemp;
    public FieldDef xisdconcepto;
    public FieldDef xisdbase;
    public FieldDef xisdporcentaje;
    public FieldDef xisdcuota;
    public FieldDef xisddias;
    public FieldDef xisdinciden;
    public FieldDef xisddiastp;
    public FieldDef xisddescripcion;
    public TabXisdeduc(String name)
      {
      super(name);
      xisdcodigo = new FieldDef("xisdcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      xisdcalculo = new FieldDef("xisdcalculo",FieldDef.INTEGER,0);
      xisdejercicio = new FieldDef("xisdejercicio",FieldDef.INTEGER,0);
      xisdperiodo = new FieldDef("xisdperiodo",FieldDef.INTEGER,0);
      xisdproceso = new FieldDef("xisdproceso",FieldDef.INTEGER,0);
      xisdempresa = new FieldDef("xisdempresa",FieldDef.INTEGER,0);
      xisdtrabajador = new FieldDef("xisdtrabajador",FieldDef.INTEGER,0);
      xisdconvemp = new FieldDef("xisdconvemp",FieldDef.CHAR,7);
      xisdconcepto = new FieldDef("xisdconcepto",FieldDef.INTEGER,0);
      xisdbase = new FieldDef("xisdbase",FieldDef.FLOAT,6,0);
      xisdporcentaje = new FieldDef("xisdporcentaje",FieldDef.FLOAT,6,0);
      xisdcuota = new FieldDef("xisdcuota",FieldDef.FLOAT,6,0);
      xisddias = new FieldDef("xisddias",FieldDef.INTEGER,0);
      xisdinciden = new FieldDef("xisdinciden",FieldDef.INTEGER,0);
      xisddiastp = new FieldDef("xisddiastp",FieldDef.INTEGER,0);
      xisddescripcion = new FieldDef("xisddescripcion",FieldDef.CHAR,50);
      FieldDef array[] = {
        xisdcodigo,
        xisdcalculo,
        xisdejercicio,
        xisdperiodo,
        xisdproceso,
        xisdempresa,
        xisdtrabajador,
        xisdconvemp,
        xisdconcepto,
        xisdbase,
        xisdporcentaje,
        xisdcuota,
        xisddias,
        xisdinciden,
        xisddiastp,
        xisddescripcion        
        };
      setColumns(array);
      FieldDef arrayf[] = {xisdcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabXiscostes extends TableDef
    {
    // Campos
    public FieldDef xisccodigo;
    public FieldDef xisccalculo;
    public FieldDef xiscdeduc;
    public FieldDef xiscejercicio;
    public FieldDef xiscperiodo;
    public FieldDef xiscproceso;
    public FieldDef xiscempresa;
    public FieldDef xisctrabajador;
    public FieldDef xiscconcepto;
    public FieldDef xiscbase;
    public FieldDef xisccostepat;
    public FieldDef xiscbonif;
    public FieldDef xiscepiilt;
    public FieldDef xiscepiims;
    public TabXiscostes(String name)
      {
      super(name);
      xisccodigo = new FieldDef("xisccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      xisccalculo = new FieldDef("xisccalculo",FieldDef.INTEGER,0);
      xiscdeduc = new FieldDef("xiscdeduc",FieldDef.INTEGER,0);
      xiscejercicio = new FieldDef("xiscejercicio",FieldDef.INTEGER,0);
      xiscperiodo = new FieldDef("xiscperiodo",FieldDef.INTEGER,0);
      xiscproceso = new FieldDef("xiscproceso",FieldDef.INTEGER,0);
      xiscempresa = new FieldDef("xiscempresa",FieldDef.INTEGER,0);
      xisctrabajador = new FieldDef("xisctrabajador",FieldDef.INTEGER,0);
      xiscconcepto = new FieldDef("xiscconcepto",FieldDef.INTEGER,0);
      xiscbase = new FieldDef("xiscbase",FieldDef.FLOAT,6,0);
      xisccostepat = new FieldDef("xisccostepat",FieldDef.FLOAT,6,0);
      xiscbonif = new FieldDef("xiscbonif",FieldDef.FLOAT,6,0);
      xiscepiilt = new FieldDef("xiscepiilt",FieldDef.FLOAT,6,0);
      xiscepiims = new FieldDef("xiscepiims",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        xisccodigo,
        xisccalculo,
        xiscdeduc,
        xiscejercicio,
        xiscperiodo,
        xiscproceso,
        xiscempresa,
        xisctrabajador,
        xiscconcepto,
        xiscbase,
        xisccostepat,
        xiscbonif,
        xiscepiilt,
        xiscepiims        
        };
      setColumns(array);
      FieldDef arrayf[] = {xisccodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabXisbonif extends TableDef
    {
    // Campos
    public FieldDef xisbcodigo;
    public FieldDef xisbcalculo;
    public FieldDef xisbdeduc;
    public FieldDef xisbcostes;
    public FieldDef xisbejercicio;
    public FieldDef xisbperiodo;
    public FieldDef xisbproceso;
    public FieldDef xisbempresa;
    public FieldDef xisbtrabajador;
    public FieldDef xisbbonif;
    public FieldDef xistramo;
    public FieldDef xisbimpbonif;
    public FieldDef xisbtipofan;
    public FieldDef xisbdias;
    public FieldDef xisforcomple;
    public TabXisbonif(String name)
      {
      super(name);
      xisbcodigo = new FieldDef("xisbcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      xisbcalculo = new FieldDef("xisbcalculo",FieldDef.INTEGER,0);
      xisbdeduc = new FieldDef("xisbdeduc",FieldDef.INTEGER,0);
      xisbcostes = new FieldDef("xisbcostes",FieldDef.INTEGER,0);
      xisbejercicio = new FieldDef("xisbejercicio",FieldDef.INTEGER,0);
      xisbperiodo = new FieldDef("xisbperiodo",FieldDef.INTEGER,0);
      xisbproceso = new FieldDef("xisbproceso",FieldDef.INTEGER,0);
      xisbempresa = new FieldDef("xisbempresa",FieldDef.INTEGER,0);
      xisbtrabajador = new FieldDef("xisbtrabajador",FieldDef.INTEGER,0);
      xisbbonif = new FieldDef("xisbbonif",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      xistramo = new FieldDef("xistramo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      xisbimpbonif = new FieldDef("xisbimpbonif",FieldDef.FLOAT,6,0);
      xisbtipofan = new FieldDef("xisbtipofan",FieldDef.CHAR,2);
      xisbdias = new FieldDef("xisbdias",FieldDef.INTEGER,0);
      xisforcomple = new FieldDef("xisforcomple",FieldDef.CHAR,5);
      FieldDef array[] = {
        xisbcodigo,
        xisbcalculo,
        xisbdeduc,
        xisbcostes,
        xisbejercicio,
        xisbperiodo,
        xisbproceso,
        xisbempresa,
        xisbtrabajador,
        xisbbonif,
        xistramo,
        xisbimpbonif,
        xisbtipofan,
        xisbdias,
        xisforcomple        
        };
      setColumns(array);
      FieldDef arrayf[] = {xisbcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabXisinciden extends TableDef
    {
    // Campos
    public FieldDef xisicodigo;
    public FieldDef xisicalculo;
    public FieldDef xisiejercicio;
    public FieldDef xisiperiodo;
    public FieldDef xisiproceso;
    public FieldDef xisicodiemp;
    public FieldDef xisicentro;
    public FieldDef xisitrabajador;
    public FieldDef xisitipxisi;
    public FieldDef xisifinicial;
    public FieldDef xisiffinal;
    public FieldDef xisibrenf;
    public FieldDef xisibracc;
    public FieldDef xisirecaida;
    public FieldDef xisicodrecaida;
    public FieldDef xisihextras;
    public FieldDef xisihoras1;
    public FieldDef xisicotiza;
    public FieldDef xisireducmat;
    public FieldDef xisihospital;
    public TabXisinciden(String name)
      {
      super(name);
      xisicodigo = new FieldDef("xisicodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      xisicalculo = new FieldDef("xisicalculo",FieldDef.INTEGER,0);
      xisiejercicio = new FieldDef("xisiejercicio",FieldDef.INTEGER,0);
      xisiperiodo = new FieldDef("xisiperiodo",FieldDef.INTEGER,0);
      xisiproceso = new FieldDef("xisiproceso",FieldDef.INTEGER,0);
      xisicodiemp = new FieldDef("xisicodiemp",FieldDef.INTEGER,0);
      xisicentro = new FieldDef("xisicentro",FieldDef.INTEGER,0);
      xisitrabajador = new FieldDef("xisitrabajador",FieldDef.INTEGER,0);
      xisitipxisi = new FieldDef("xisitipxisi",FieldDef.CHAR,2);
      xisifinicial = new FieldDef("xisifinicial",FieldDef.DATE);
      xisiffinal = new FieldDef("xisiffinal",FieldDef.DATE);
      xisibrenf = new FieldDef("xisibrenf",FieldDef.FLOAT,6,0);
      xisibracc = new FieldDef("xisibracc",FieldDef.FLOAT,6,0);
      xisirecaida = new FieldDef("xisirecaida",FieldDef.CHAR,1);
      xisicodrecaida = new FieldDef("xisicodrecaida",FieldDef.INTEGER,0);
      xisihextras = new FieldDef("xisihextras",FieldDef.FLOAT,6,0);
      xisihoras1 = new FieldDef("xisihoras1",FieldDef.FLOAT,6,0);
      xisicotiza = new FieldDef("xisicotiza",FieldDef.CHAR,1);
      xisireducmat = new FieldDef("xisireducmat",FieldDef.FLOAT,6,0);
      xisihospital = new FieldDef("xisihospital",FieldDef.CHAR,1);
      FieldDef array[] = {
        xisicodigo,
        xisicalculo,
        xisiejercicio,
        xisiperiodo,
        xisiproceso,
        xisicodiemp,
        xisicentro,
        xisitrabajador,
        xisitipxisi,
        xisifinicial,
        xisiffinal,
        xisibrenf,
        xisibracc,
        xisirecaida,
        xisicodrecaida,
        xisihextras,
        xisihoras1,
        xisicotiza,
        xisireducmat,
        xisihospital        
        };
      setColumns(array);
      FieldDef arrayf[] = {xisicodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabXisperso extends TableDef
    {
    // Campos
    public FieldDef xispcodigo;
    public FieldDef xispejercicio;
    public FieldDef xispperiodo;
    public FieldDef xispproceso;
    public FieldDef xispcodiemp;
    public FieldDef xispccc;
    public FieldDef xisptrabajador;
    public FieldDef xispcolectivo;
    public FieldDef xispcentro;
    public FieldDef xispdpto;
    public FieldDef xisppuesto;
    public FieldDef xispconvenio;
    public FieldDef xispregimenss;
    public FieldDef xispregcodi;
    public FieldDef xispcodicat;
    public FieldDef xispdescrcat;
    public FieldDef xisptarifa;
    public FieldDef xispepigraf;
    public FieldDef xispexcl65;
    public FieldDef xispclauirpf;
    public FieldDef xispporirpf;
    public FieldDef xisptipoirpf;
    public FieldDef xispfecantig;
    public FieldDef xispfeccalantig;
    public FieldDef xispfeccalpagas;
    public FieldDef xispfecamcat;
    public FieldDef xispfeconantig;
    public FieldDef xispexconcep;
    public FieldDef xispmesdia;
    public FieldDef xispbgarantia;
    public FieldDef xispbdtopagas;
    public FieldDef xispenlace;
    public FieldDef xispcodicto;
    public FieldDef xispduracto;
    public FieldDef xispcotizdes;
    public FieldDef xispparcial;
    public FieldDef xispdiashoras;
    public FieldDef xispporreduc;
    public FieldDef xispdias;
    public FieldDef xisphoras;
    public FieldDef xisplunesdia;
    public FieldDef xispluneshor;
    public FieldDef xispmartdia;
    public FieldDef xispmarthor;
    public FieldDef xispmierdia;
    public FieldDef xispmierhor;
    public FieldDef xispjuevdia;
    public FieldDef xispjuevhor;
    public FieldDef xispvierndia;
    public FieldDef xispviernhor;
    public FieldDef xispsabdia;
    public FieldDef xispsabhor;
    public FieldDef xispdomdia;
    public FieldDef xispdomhor;
    public FieldDef xispfestivos;
    public FieldDef xispfestivho;
    public FieldDef xisppluri;
    public FieldDef xispbasespor;
    public FieldDef xispporcen;
    public FieldDef xispbasmaxcom;
    public FieldDef xispbasmincom;
    public FieldDef xispbasmaxacc;
    public FieldDef xispbasminacc;
    public FieldDef xispformacio;
    public FieldDef xisphorasdis;
    public FieldDef xisphoraspre;
    public FieldDef xispparcialred;
    public FieldDef xispinterinid;
    public FieldDef xispsusti;
    public FieldDef xispbaseauton;
    public FieldDef xispcodboni1;
    public FieldDef xispporboni1;
    public FieldDef xispcodboni2;
    public FieldDef xispporboni2;
    public FieldDef xispcodboni3;
    public FieldDef xispporboni3;
    public FieldDef xispcodboni4;
    public FieldDef xispporboni4;
    public FieldDef xispcodboni5;
    public FieldDef xispporboni5;
    public FieldDef xispcodboni6;
    public FieldDef xispporboni6;
    public FieldDef xisprelacion;
    public FieldDef xispregfan;
    public FieldDef xispcontingente;
    public FieldDef xispcomunitario;
    public FieldDef xisp7dias;
    public FieldDef xisporigen;
    public FieldDef xispejeratrirpf;
    public FieldDef xispperiatrirpf;
    public FieldDef xispsscnae;
    public FieldDef xispocupasita;
    public FieldDef xisptrahijauto;
    public FieldDef xispcampuestra;
    public FieldDef xispatraexigi;
    public TabXisperso(String name)
      {
      super(name);
      xispcodigo = new FieldDef("xispcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      xispejercicio = new FieldDef("xispejercicio",FieldDef.INTEGER,0);
      xispperiodo = new FieldDef("xispperiodo",FieldDef.INTEGER,0);
      xispproceso = new FieldDef("xispproceso",FieldDef.INTEGER,0);
      xispcodiemp = new FieldDef("xispcodiemp",FieldDef.INTEGER,0);
      xispccc = new FieldDef("xispccc",FieldDef.CHAR,11);
      xisptrabajador = new FieldDef("xisptrabajador",FieldDef.INTEGER,0);
      xispcolectivo = new FieldDef("xispcolectivo",FieldDef.INTEGER,0);
      xispcentro = new FieldDef("xispcentro",FieldDef.INTEGER,0);
      xispdpto = new FieldDef("xispdpto",FieldDef.INTEGER,0);
      xisppuesto = new FieldDef("xisppuesto",FieldDef.CHAR,30);
      xispconvenio = new FieldDef("xispconvenio",FieldDef.INTEGER,0);
      xispregimenss = new FieldDef("xispregimenss",FieldDef.INTEGER,0);
      xispregcodi = new FieldDef("xispregcodi",FieldDef.INTEGER,0);
      xispcodicat = new FieldDef("xispcodicat",FieldDef.INTEGER,0);
      xispdescrcat = new FieldDef("xispdescrcat",FieldDef.CHAR,20);
      xisptarifa = new FieldDef("xisptarifa",FieldDef.INTEGER,0);
      xispepigraf = new FieldDef("xispepigraf",FieldDef.INTEGER,0);
      xispexcl65 = new FieldDef("xispexcl65",FieldDef.CHAR,1);
      xispclauirpf = new FieldDef("xispclauirpf",FieldDef.CHAR,2);
      xispporirpf = new FieldDef("xispporirpf",FieldDef.FLOAT,6,0);
      xisptipoirpf = new FieldDef("xisptipoirpf",FieldDef.CHAR,1);
      xispfecantig = new FieldDef("xispfecantig",FieldDef.DATE);
      xispfeccalantig = new FieldDef("xispfeccalantig",FieldDef.DATE);
      xispfeccalpagas = new FieldDef("xispfeccalpagas",FieldDef.DATE);
      xispfecamcat = new FieldDef("xispfecamcat",FieldDef.DATE);
      xispfeconantig = new FieldDef("xispfeconantig",FieldDef.DATE);
      xispexconcep = new FieldDef("xispexconcep",FieldDef.CHAR,1);
      xispmesdia = new FieldDef("xispmesdia",FieldDef.CHAR,1);
      xispbgarantia = new FieldDef("xispbgarantia",FieldDef.CHAR,1);
      xispbdtopagas = new FieldDef("xispbdtopagas",FieldDef.CHAR,1);
      xispenlace = new FieldDef("xispenlace",FieldDef.INTEGER,0);
      xispcodicto = new FieldDef("xispcodicto",FieldDef.CHAR,10);
      xispduracto = new FieldDef("xispduracto",FieldDef.CHAR,1);
      xispcotizdes = new FieldDef("xispcotizdes",FieldDef.CHAR,2);
      xispparcial = new FieldDef("xispparcial",FieldDef.CHAR,1);
      xispdiashoras = new FieldDef("xispdiashoras",FieldDef.CHAR,1);
      xispporreduc = new FieldDef("xispporreduc",FieldDef.FLOAT,6,0);
      xispdias = new FieldDef("xispdias",FieldDef.FLOAT,6,0);
      xisphoras = new FieldDef("xisphoras",FieldDef.FLOAT,6,0);
      xisplunesdia = new FieldDef("xisplunesdia",FieldDef.CHAR,1);
      xispluneshor = new FieldDef("xispluneshor",FieldDef.FLOAT,6,0);
      xispmartdia = new FieldDef("xispmartdia",FieldDef.CHAR,1);
      xispmarthor = new FieldDef("xispmarthor",FieldDef.FLOAT,6,0);
      xispmierdia = new FieldDef("xispmierdia",FieldDef.CHAR,1);
      xispmierhor = new FieldDef("xispmierhor",FieldDef.FLOAT,6,0);
      xispjuevdia = new FieldDef("xispjuevdia",FieldDef.CHAR,1);
      xispjuevhor = new FieldDef("xispjuevhor",FieldDef.FLOAT,6,0);
      xispvierndia = new FieldDef("xispvierndia",FieldDef.CHAR,1);
      xispviernhor = new FieldDef("xispviernhor",FieldDef.FLOAT,6,0);
      xispsabdia = new FieldDef("xispsabdia",FieldDef.CHAR,1);
      xispsabhor = new FieldDef("xispsabhor",FieldDef.FLOAT,6,0);
      xispdomdia = new FieldDef("xispdomdia",FieldDef.CHAR,1);
      xispdomhor = new FieldDef("xispdomhor",FieldDef.FLOAT,6,0);
      xispfestivos = new FieldDef("xispfestivos",FieldDef.CHAR,1);
      xispfestivho = new FieldDef("xispfestivho",FieldDef.FLOAT,6,0);
      xisppluri = new FieldDef("xisppluri",FieldDef.CHAR,1);
      xispbasespor = new FieldDef("xispbasespor",FieldDef.CHAR,1);
      xispporcen = new FieldDef("xispporcen",FieldDef.FLOAT,6,0);
      xispbasmaxcom = new FieldDef("xispbasmaxcom",FieldDef.FLOAT,6,0);
      xispbasmincom = new FieldDef("xispbasmincom",FieldDef.FLOAT,6,0);
      xispbasmaxacc = new FieldDef("xispbasmaxacc",FieldDef.FLOAT,6,0);
      xispbasminacc = new FieldDef("xispbasminacc",FieldDef.FLOAT,6,0);
      xispformacio = new FieldDef("xispformacio",FieldDef.CHAR,1);
      xisphorasdis = new FieldDef("xisphorasdis",FieldDef.FLOAT,6,0);
      xisphoraspre = new FieldDef("xisphoraspre",FieldDef.FLOAT,6,0);
      xispparcialred = new FieldDef("xispparcialred",FieldDef.CHAR,1);
      xispinterinid = new FieldDef("xispinterinid",FieldDef.CHAR,1);
      xispsusti = new FieldDef("xispsusti",FieldDef.CHAR,1);
      xispbaseauton = new FieldDef("xispbaseauton",FieldDef.FLOAT,6,0);
      xispcodboni1 = new FieldDef("xispcodboni1",FieldDef.INTEGER,0);
      xispporboni1 = new FieldDef("xispporboni1",FieldDef.FLOAT,6,0);
      xispcodboni2 = new FieldDef("xispcodboni2",FieldDef.INTEGER,0);
      xispporboni2 = new FieldDef("xispporboni2",FieldDef.FLOAT,6,0);
      xispcodboni3 = new FieldDef("xispcodboni3",FieldDef.INTEGER,0);
      xispporboni3 = new FieldDef("xispporboni3",FieldDef.FLOAT,6,0);
      xispcodboni4 = new FieldDef("xispcodboni4",FieldDef.INTEGER,0);
      xispporboni4 = new FieldDef("xispporboni4",FieldDef.FLOAT,6,0);
      xispcodboni5 = new FieldDef("xispcodboni5",FieldDef.INTEGER,0);
      xispporboni5 = new FieldDef("xispporboni5",FieldDef.FLOAT,6,0);
      xispcodboni6 = new FieldDef("xispcodboni6",FieldDef.INTEGER,0);
      xispporboni6 = new FieldDef("xispporboni6",FieldDef.FLOAT,6,0);
      xisprelacion = new FieldDef("xisprelacion",FieldDef.INTEGER,0);
      xispregfan = new FieldDef("xispregfan",FieldDef.CHAR,3);
      xispcontingente = new FieldDef("xispcontingente",FieldDef.CHAR,1);
      xispcomunitario = new FieldDef("xispcomunitario",FieldDef.CHAR,1);
      xisp7dias = new FieldDef("xisp7dias",FieldDef.CHAR,1);
      xisporigen = new FieldDef("xisporigen",FieldDef.CHAR,1);
      xispejeratrirpf = new FieldDef("xispejeratrirpf",FieldDef.INTEGER,0);
      xispperiatrirpf = new FieldDef("xispperiatrirpf",FieldDef.INTEGER,0);
      xispsscnae = new FieldDef("xispsscnae",FieldDef.CHAR,7);
      xispocupasita = new FieldDef("xispocupasita",FieldDef.CHAR,1);
      xisptrahijauto = new FieldDef("xisptrahijauto",FieldDef.CHAR,1);
      xispcampuestra = new FieldDef("xispcampuestra",FieldDef.CHAR,1);
      xispatraexigi = new FieldDef("xispatraexigi",FieldDef.CHAR,1);
      FieldDef array[] = {
        xispcodigo,
        xispejercicio,
        xispperiodo,
        xispproceso,
        xispcodiemp,
        xispccc,
        xisptrabajador,
        xispcolectivo,
        xispcentro,
        xispdpto,
        xisppuesto,
        xispconvenio,
        xispregimenss,
        xispregcodi,
        xispcodicat,
        xispdescrcat,
        xisptarifa,
        xispepigraf,
        xispexcl65,
        xispclauirpf,
        xispporirpf,
        xisptipoirpf,
        xispfecantig,
        xispfeccalantig,
        xispfeccalpagas,
        xispfecamcat,
        xispfeconantig,
        xispexconcep,
        xispmesdia,
        xispbgarantia,
        xispbdtopagas,
        xispenlace,
        xispcodicto,
        xispduracto,
        xispcotizdes,
        xispparcial,
        xispdiashoras,
        xispporreduc,
        xispdias,
        xisphoras,
        xisplunesdia,
        xispluneshor,
        xispmartdia,
        xispmarthor,
        xispmierdia,
        xispmierhor,
        xispjuevdia,
        xispjuevhor,
        xispvierndia,
        xispviernhor,
        xispsabdia,
        xispsabhor,
        xispdomdia,
        xispdomhor,
        xispfestivos,
        xispfestivho,
        xisppluri,
        xispbasespor,
        xispporcen,
        xispbasmaxcom,
        xispbasmincom,
        xispbasmaxacc,
        xispbasminacc,
        xispformacio,
        xisphorasdis,
        xisphoraspre,
        xispparcialred,
        xispinterinid,
        xispsusti,
        xispbaseauton,
        xispcodboni1,
        xispporboni1,
        xispcodboni2,
        xispporboni2,
        xispcodboni3,
        xispporboni3,
        xispcodboni4,
        xispporboni4,
        xispcodboni5,
        xispporboni5,
        xispcodboni6,
        xispporboni6,
        xisprelacion,
        xispregfan,
        xispcontingente,
        xispcomunitario,
        xisp7dias,
        xisporigen,
        xispejeratrirpf,
        xispperiatrirpf,
        xispsscnae,
        xispocupasita,
        xisptrahijauto,
        xispcampuestra,
        xispatraexigi        
        };
      setColumns(array);
      FieldDef arrayf[] = {xispcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabXiscontrol extends TableDef
    {
    // Campos
    public FieldDef xisccodigo;
    public FieldDef xisccalculo;
    public FieldDef xiscejercicio;
    public FieldDef xiscperiodo;
    public FieldDef xiscproceso;
    public FieldDef xisccodiemp;
    public FieldDef xisctrabajador;
    public FieldDef xisccalculado;
    public FieldDef xisccalfecha;
    public FieldDef xiscimpreso;
    public FieldDef xiscimpfecha;
    public FieldDef xisctransfer;
    public FieldDef xiscfectrans;
    public FieldDef xisctc;
    public FieldDef xiscfectc;
    public TabXiscontrol(String name)
      {
      super(name);
      xisccodigo = new FieldDef("xisccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      xisccalculo = new FieldDef("xisccalculo",FieldDef.INTEGER,0);
      xiscejercicio = new FieldDef("xiscejercicio",FieldDef.INTEGER,0);
      xiscperiodo = new FieldDef("xiscperiodo",FieldDef.INTEGER,0);
      xiscproceso = new FieldDef("xiscproceso",FieldDef.INTEGER,0);
      xisccodiemp = new FieldDef("xisccodiemp",FieldDef.INTEGER,0);
      xisctrabajador = new FieldDef("xisctrabajador",FieldDef.INTEGER,0);
      xisccalculado = new FieldDef("xisccalculado",FieldDef.CHAR,1);
      xisccalfecha = new FieldDef("xisccalfecha",FieldDef.DATE);
      xiscimpreso = new FieldDef("xiscimpreso",FieldDef.CHAR,1);
      xiscimpfecha = new FieldDef("xiscimpfecha",FieldDef.DATE);
      xisctransfer = new FieldDef("xisctransfer",FieldDef.CHAR,1);
      xiscfectrans = new FieldDef("xiscfectrans",FieldDef.DATE);
      xisctc = new FieldDef("xisctc",FieldDef.CHAR,1);
      xiscfectc = new FieldDef("xiscfectc",FieldDef.DATE);
      FieldDef array[] = {
        xisccodigo,
        xisccalculo,
        xiscejercicio,
        xiscperiodo,
        xiscproceso,
        xisccodiemp,
        xisctrabajador,
        xisccalculado,
        xisccalfecha,
        xiscimpreso,
        xiscimpfecha,
        xisctransfer,
        xiscfectrans,
        xisctc,
        xiscfectc        
        };
      setColumns(array);
      FieldDef arrayf[] = {xisccodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabHisprorratas extends TableDef
    {
    // Campos
    public FieldDef hisprcodigo;
    public FieldDef hisprcalculo;
    public FieldDef hisprejercicio;
    public FieldDef hisprperiodo;
    public FieldDef hisprproceso;
    public FieldDef hisprcodiemp;
    public FieldDef hisprtrabajador;
    public FieldDef hisprimporte;
    public FieldDef hisprfactor;
    public FieldDef hisrpunidades;
    public FieldDef hisprcodpaga;
    public FieldDef hisprdescrip;
    public FieldDef hisprrelacion;
    public FieldDef hisprconvemp;
    public FieldDef hisprcodconcep;
    public FieldDef hisprdescconcep;
    public FieldDef hisprdiacobro;
    public FieldDef hisprmescobro;
    public FieldDef hisprdiainidev;
    public FieldDef hisprmesinidev;
    public FieldDef hispranyinidev;
    public FieldDef hisprdiafindev;
    public FieldDef hisprmesfindev;
    public FieldDef hispranyfindev;
    public FieldDef hispranyimport;
    public TabHisprorratas(String name)
      {
      super(name);
      hisprcodigo = new FieldDef("hisprcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hisprcalculo = new FieldDef("hisprcalculo",FieldDef.INTEGER,0);
      hisprejercicio = new FieldDef("hisprejercicio",FieldDef.INTEGER,0);
      hisprperiodo = new FieldDef("hisprperiodo",FieldDef.INTEGER,0);
      hisprproceso = new FieldDef("hisprproceso",FieldDef.INTEGER,0);
      hisprcodiemp = new FieldDef("hisprcodiemp",FieldDef.INTEGER,0);
      hisprtrabajador = new FieldDef("hisprtrabajador",FieldDef.INTEGER,0);
      hisprimporte = new FieldDef("hisprimporte",FieldDef.FLOAT,6,0);
      hisprfactor = new FieldDef("hisprfactor",FieldDef.FLOAT,6,0);
      hisrpunidades = new FieldDef("hisrpunidades",FieldDef.FLOAT,6,0);
      hisprcodpaga = new FieldDef("hisprcodpaga",FieldDef.INTEGER,0);
      hisprdescrip = new FieldDef("hisprdescrip",FieldDef.CHAR,30);
      hisprrelacion = new FieldDef("hisprrelacion",FieldDef.INTEGER,0);
      hisprconvemp = new FieldDef("hisprconvemp",FieldDef.CHAR,7);
      hisprcodconcep = new FieldDef("hisprcodconcep",FieldDef.INTEGER,0);
      hisprdescconcep = new FieldDef("hisprdescconcep",FieldDef.CHAR,30);
      hisprdiacobro = new FieldDef("hisprdiacobro",FieldDef.INTEGER,0);
      hisprmescobro = new FieldDef("hisprmescobro",FieldDef.INTEGER,0);
      hisprdiainidev = new FieldDef("hisprdiainidev",FieldDef.INTEGER,0);
      hisprmesinidev = new FieldDef("hisprmesinidev",FieldDef.INTEGER,0);
      hispranyinidev = new FieldDef("hispranyinidev",FieldDef.CHAR,1);
      hisprdiafindev = new FieldDef("hisprdiafindev",FieldDef.INTEGER,0);
      hisprmesfindev = new FieldDef("hisprmesfindev",FieldDef.INTEGER,0);
      hispranyfindev = new FieldDef("hispranyfindev",FieldDef.CHAR,1);
      hispranyimport = new FieldDef("hispranyimport",FieldDef.CHAR,1);
      FieldDef array[] = {
        hisprcodigo,
        hisprcalculo,
        hisprejercicio,
        hisprperiodo,
        hisprproceso,
        hisprcodiemp,
        hisprtrabajador,
        hisprimporte,
        hisprfactor,
        hisrpunidades,
        hisprcodpaga,
        hisprdescrip,
        hisprrelacion,
        hisprconvemp,
        hisprcodconcep,
        hisprdescconcep,
        hisprdiacobro,
        hisprmescobro,
        hisprdiainidev,
        hisprmesinidev,
        hispranyinidev,
        hisprdiafindev,
        hisprmesfindev,
        hispranyfindev,
        hispranyimport        
        };
      setColumns(array);
      FieldDef arrayf[] = {hisprcodigo };
      setPrimaryKeys(arrayf);
      hisprcodigo.setAutoIncrementable(true);
      hisprcodigo.setDescription("Identificador del registro");
      hisprcalculo.setDescription("Enlace con la tabla HISPERSO");
      hisprejercicio.setDescription("Ejercicio calculado");
      hisprperiodo.setDescription("Periodo calculado");
      hisprproceso.setDescription("Codigo Proceso");
      hisprcodiemp.setDescription("Codigo Empresa");
      hisprtrabajador.setDescription("Codigo Trabajador");
      hisprimporte.setDescription("Importe de la paga");
      hisprcodpaga.setDescription("Codigo de la paga extra");
      hisprdescrip.setDescription("Descripcion de la paga extra");
      hisprcodconcep.setDescription("Codigo de la paga extra");
      hisprdescconcep.setDescription("Descripcion de la paga extra");
      hisprdiacobro.setDescription("Dia de cobro");
      hisprmescobro.setDescription("Mes de cobro");
      hisprdiainidev.setDescription("Dia inicio devengo de la paga extra");
      hisprmesinidev.setDescription("Mes inicio devengo de la paga extra");
      hispranyinidev.setDescription("A¤o inicio devengo de la paga extra");
      hisprdiafindev.setDescription("Dia fin devengo de la paga extra");
      hisprmesfindev.setDescription("Mes fin devengo de la paga extra");
      hispranyfindev.setDescription("A¤o fin devengo de la paga extra");
      hispranyimport.setDescription("Importes a¤o anterior para calculo de las pagas");
      }
    }
    
  public class TabXisprorratas extends TableDef
    {
    // Campos
    public FieldDef xisprcodigo;
    public FieldDef xisprcalculo;
    public FieldDef xisprejercicio;
    public FieldDef xisprperiodo;
    public FieldDef xisprproceso;
    public FieldDef xisprcodiemp;
    public FieldDef xisprtrabajador;
    public FieldDef xisprimporte;
    public FieldDef xisprfactor;
    public FieldDef xisrpunidades;
    public FieldDef xisprcodpaga;
    public FieldDef xisprdescrip;
    public FieldDef xisprrelacion;
    public FieldDef xisprconvemp;
    public FieldDef xisprcodconcep;
    public FieldDef xisprdescconcep;
    public FieldDef xisprdiacobro;
    public FieldDef xisprmescobro;
    public FieldDef xisprdiainidev;
    public FieldDef xisprmesinidev;
    public FieldDef xispranyinidev;
    public FieldDef xisprdiafindev;
    public FieldDef xisprmesfindev;
    public FieldDef xispranyfindev;
    public FieldDef xispranyimport;
    public TabXisprorratas(String name)
      {
      super(name);
      xisprcodigo = new FieldDef("xisprcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      xisprcalculo = new FieldDef("xisprcalculo",FieldDef.INTEGER,0);
      xisprejercicio = new FieldDef("xisprejercicio",FieldDef.INTEGER,0);
      xisprperiodo = new FieldDef("xisprperiodo",FieldDef.INTEGER,0);
      xisprproceso = new FieldDef("xisprproceso",FieldDef.INTEGER,0);
      xisprcodiemp = new FieldDef("xisprcodiemp",FieldDef.INTEGER,0);
      xisprtrabajador = new FieldDef("xisprtrabajador",FieldDef.INTEGER,0);
      xisprimporte = new FieldDef("xisprimporte",FieldDef.FLOAT,6,0);
      xisprfactor = new FieldDef("xisprfactor",FieldDef.FLOAT,6,0);
      xisrpunidades = new FieldDef("xisrpunidades",FieldDef.FLOAT,6,0);
      xisprcodpaga = new FieldDef("xisprcodpaga",FieldDef.INTEGER,0);
      xisprdescrip = new FieldDef("xisprdescrip",FieldDef.CHAR,30);
      xisprrelacion = new FieldDef("xisprrelacion",FieldDef.INTEGER,0);
      xisprconvemp = new FieldDef("xisprconvemp",FieldDef.CHAR,7);
      xisprcodconcep = new FieldDef("xisprcodconcep",FieldDef.INTEGER,0);
      xisprdescconcep = new FieldDef("xisprdescconcep",FieldDef.CHAR,30);
      xisprdiacobro = new FieldDef("xisprdiacobro",FieldDef.INTEGER,0);
      xisprmescobro = new FieldDef("xisprmescobro",FieldDef.INTEGER,0);
      xisprdiainidev = new FieldDef("xisprdiainidev",FieldDef.INTEGER,0);
      xisprmesinidev = new FieldDef("xisprmesinidev",FieldDef.INTEGER,0);
      xispranyinidev = new FieldDef("xispranyinidev",FieldDef.CHAR,1);
      xisprdiafindev = new FieldDef("xisprdiafindev",FieldDef.INTEGER,0);
      xisprmesfindev = new FieldDef("xisprmesfindev",FieldDef.INTEGER,0);
      xispranyfindev = new FieldDef("xispranyfindev",FieldDef.CHAR,1);
      xispranyimport = new FieldDef("xispranyimport",FieldDef.CHAR,1);
      FieldDef array[] = {
        xisprcodigo,
        xisprcalculo,
        xisprejercicio,
        xisprperiodo,
        xisprproceso,
        xisprcodiemp,
        xisprtrabajador,
        xisprimporte,
        xisprfactor,
        xisrpunidades,
        xisprcodpaga,
        xisprdescrip,
        xisprrelacion,
        xisprconvemp,
        xisprcodconcep,
        xisprdescconcep,
        xisprdiacobro,
        xisprmescobro,
        xisprdiainidev,
        xisprmesinidev,
        xispranyinidev,
        xisprdiafindev,
        xisprmesfindev,
        xispranyfindev,
        xispranyimport        
        };
      setColumns(array);
      FieldDef arrayf[] = {xisprcodigo };
      setPrimaryKeys(arrayf);
      xisprcodigo.setAutoIncrementable(true);
      xisprcodigo.setDescription("Identificador del registro");
      xisprcalculo.setDescription("Enlace con la tabla HISPERSO");
      xisprejercicio.setDescription("Ejercicio calculado");
      xisprperiodo.setDescription("Periodo calculado");
      xisprproceso.setDescription("Codigo Proceso");
      xisprcodiemp.setDescription("Codigo Empresa");
      xisprtrabajador.setDescription("Codigo Trabajador");
      xisprimporte.setDescription("Importe de la paga");
      xisprcodpaga.setDescription("Codigo de la paga extra");
      xisprdescrip.setDescription("Descripcion de la paga extra");
      xisprcodconcep.setDescription("Codigo de la paga extra");
      xisprdescconcep.setDescription("Descripcion de la paga extra");
      xisprdiacobro.setDescription("Dia de cobro");
      xisprmescobro.setDescription("Mes de cobro");
      xisprdiainidev.setDescription("Dia inicio devengo de la paga extra");
      xisprmesinidev.setDescription("Mes inicio devengo de la paga extra");
      xispranyinidev.setDescription("A¤o inicio devengo de la paga extra");
      xisprdiafindev.setDescription("Dia fin devengo de la paga extra");
      xisprmesfindev.setDescription("Mes fin devengo de la paga extra");
      xispranyfindev.setDescription("A¤o fin devengo de la paga extra");
      xispranyimport.setDescription("Importes a¤o anterior para calculo de las pagas");
      }
    }
    
  public class TabUserseportem extends TableDef
    {
    // Campos
    public FieldDef porcodiemp;
    public FieldDef porcodigo;
    public FieldDef pornif;
    public FieldDef pornombre;
    public FieldDef porpwd;
    public FieldDef pordominio;
    public FieldDef porfechacrea;
    public TabUserseportem(String name)
      {
      super(name);
      porcodiemp = new FieldDef("porcodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      porcodigo = new FieldDef("porcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pornif = new FieldDef("pornif",FieldDef.CHAR,15);
      pornombre = new FieldDef("pornombre",FieldDef.CHAR,50);
      porpwd = new FieldDef("porpwd",FieldDef.CHAR,15);
      pordominio = new FieldDef("pordominio",FieldDef.CHAR,12);
      porfechacrea = new FieldDef("porfechacrea",FieldDef.DATE);
      FieldDef array[] = {
        porcodiemp,
        porcodigo,
        pornif,
        pornombre,
        porpwd,
        pordominio,
        porfechacrea        
        };
      setColumns(array);
      FieldDef arrayf[] = {porcodiemp,porcodigo };
      setPrimaryKeys(arrayf);
      porcodiemp.setDescription("Codigo Empresa");
      porcodigo.setDescription("Codigo Trabajador");
      pornif.setDescription("NIF Trabajador");
      pornombre.setDescription("Nombre");
      porpwd.setDescription("Password acceso EPORTEM");
      pordominio.setDescription("Dominio");
      porfechacrea.setDescription("Fecha creación usuario");
      }
    }
    
  public class TabParamscal extends TableDef
    {
    // Campos
    public FieldDef pcalconvemp;
    public FieldDef pcal001;
    public FieldDef pcal002;
    public FieldDef pcal003;
    public FieldDef pcal004;
    public FieldDef pcal005;
    public FieldDef pcal006;
    public FieldDef pcal007;
    public FieldDef pcal008;
    public FieldDef pcal009;
    public FieldDef pcal010;
    public FieldDef pcal011;
    public FieldDef pcal012;
    public FieldDef pcal013;
    public FieldDef pcal014;
    public FieldDef pcal015;
    public FieldDef pcal016;
    public FieldDef pcal017;
    public FieldDef pcal018;
    public FieldDef pcal019;
    public FieldDef pcal020;
    public FieldDef pcal021;
    public FieldDef pcal022;
    public FieldDef pcal023;
    public FieldDef pcal024;
    public FieldDef pcal025;
    public FieldDef pcal026;
    public FieldDef pcal027;
    public FieldDef pcal028;
    public FieldDef pcal029;
    public FieldDef pcal030;
    public FieldDef pcal031;
    public FieldDef pcal032;
    public FieldDef pcal033;
    public FieldDef pcal034;
    public FieldDef pcal035;
    public FieldDef pcal036;
    public FieldDef pcal037;
    public FieldDef pcal038;
    public FieldDef pcal039;
    public FieldDef pcal040;
    public FieldDef pcal041;
    public FieldDef pcal042;
    public FieldDef pcal043;
    public FieldDef pcal044;
    public FieldDef pcal045;
    public FieldDef pcal046;
    public TabParamscal(String name)
      {
      super(name);
      pcalconvemp = new FieldDef("pcalconvemp",FieldDef.CHAR,13,FieldDef.NOTNULL);
      pcal001 = new FieldDef("pcal001",FieldDef.CHAR,1);
      pcal002 = new FieldDef("pcal002",FieldDef.CHAR,1);
      pcal003 = new FieldDef("pcal003",FieldDef.CHAR,1);
      pcal004 = new FieldDef("pcal004",FieldDef.CHAR,1);
      pcal005 = new FieldDef("pcal005",FieldDef.CHAR,1);
      pcal006 = new FieldDef("pcal006",FieldDef.CHAR,1);
      pcal007 = new FieldDef("pcal007",FieldDef.CHAR,1);
      pcal008 = new FieldDef("pcal008",FieldDef.CHAR,1);
      pcal009 = new FieldDef("pcal009",FieldDef.CHAR,1);
      pcal010 = new FieldDef("pcal010",FieldDef.CHAR,1);
      pcal011 = new FieldDef("pcal011",FieldDef.CHAR,1);
      pcal012 = new FieldDef("pcal012",FieldDef.CHAR,1);
      pcal013 = new FieldDef("pcal013",FieldDef.CHAR,1);
      pcal014 = new FieldDef("pcal014",FieldDef.CHAR,1);
      pcal015 = new FieldDef("pcal015",FieldDef.CHAR,1);
      pcal016 = new FieldDef("pcal016",FieldDef.CHAR,1);
      pcal017 = new FieldDef("pcal017",FieldDef.CHAR,1);
      pcal018 = new FieldDef("pcal018",FieldDef.CHAR,1);
      pcal019 = new FieldDef("pcal019",FieldDef.CHAR,1);
      pcal020 = new FieldDef("pcal020",FieldDef.CHAR,1);
      pcal021 = new FieldDef("pcal021",FieldDef.CHAR,1);
      pcal022 = new FieldDef("pcal022",FieldDef.CHAR,1);
      pcal023 = new FieldDef("pcal023",FieldDef.CHAR,1);
      pcal024 = new FieldDef("pcal024",FieldDef.CHAR,1);
      pcal025 = new FieldDef("pcal025",FieldDef.CHAR,1);
      pcal026 = new FieldDef("pcal026",FieldDef.FLOAT,6,0);
      pcal027 = new FieldDef("pcal027",FieldDef.FLOAT,6,0);
      pcal028 = new FieldDef("pcal028",FieldDef.FLOAT,6,0);
      pcal029 = new FieldDef("pcal029",FieldDef.FLOAT,6,0);
      pcal030 = new FieldDef("pcal030",FieldDef.FLOAT,6,0);
      pcal031 = new FieldDef("pcal031",FieldDef.FLOAT,6,0);
      pcal032 = new FieldDef("pcal032",FieldDef.INTEGER,0);
      pcal033 = new FieldDef("pcal033",FieldDef.INTEGER,0);
      pcal034 = new FieldDef("pcal034",FieldDef.INTEGER,0);
      pcal035 = new FieldDef("pcal035",FieldDef.INTEGER,0);
      pcal036 = new FieldDef("pcal036",FieldDef.INTEGER,0);
      pcal037 = new FieldDef("pcal037",FieldDef.DATE);
      pcal038 = new FieldDef("pcal038",FieldDef.DATE);
      pcal039 = new FieldDef("pcal039",FieldDef.DATE);
      pcal040 = new FieldDef("pcal040",FieldDef.DATE);
      pcal041 = new FieldDef("pcal041",FieldDef.CHAR,150);
      pcal042 = new FieldDef("pcal042",FieldDef.CHAR,150);
      pcal043 = new FieldDef("pcal043",FieldDef.CHAR,150);
      pcal044 = new FieldDef("pcal044",FieldDef.CHAR,150);
      pcal045 = new FieldDef("pcal045",FieldDef.CHAR,150);
      pcal046 = new FieldDef("pcal046",FieldDef.CHAR,150);
      FieldDef array[] = {
        pcalconvemp,
        pcal001,
        pcal002,
        pcal003,
        pcal004,
        pcal005,
        pcal006,
        pcal007,
        pcal008,
        pcal009,
        pcal010,
        pcal011,
        pcal012,
        pcal013,
        pcal014,
        pcal015,
        pcal016,
        pcal017,
        pcal018,
        pcal019,
        pcal020,
        pcal021,
        pcal022,
        pcal023,
        pcal024,
        pcal025,
        pcal026,
        pcal027,
        pcal028,
        pcal029,
        pcal030,
        pcal031,
        pcal032,
        pcal033,
        pcal034,
        pcal035,
        pcal036,
        pcal037,
        pcal038,
        pcal039,
        pcal040,
        pcal041,
        pcal042,
        pcal043,
        pcal044,
        pcal045,
        pcal046        
        };
      setColumns(array);
      FieldDef arrayf[] = {pcalconvemp };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDefctacab extends TableDef
    {
    // Campos
    public FieldDef dctcodigo;
    public FieldDef dctdescenl;
    public FieldDef dctcodasiento;
    public FieldDef dctdescri;
    public FieldDef dcttipoenl;
    public FieldDef dcttipotra;
    public FieldDef dcttipoasi;
    public TabDefctacab(String name)
      {
      super(name);
      dctcodigo = new FieldDef("dctcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dctdescenl = new FieldDef("dctdescenl",FieldDef.CHAR,30);
      dctcodasiento = new FieldDef("dctcodasiento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dctdescri = new FieldDef("dctdescri",FieldDef.CHAR,40);
      dcttipoenl = new FieldDef("dcttipoenl",FieldDef.CHAR,2);
      dcttipotra = new FieldDef("dcttipotra",FieldDef.CHAR,1);
      dcttipoasi = new FieldDef("dcttipoasi",FieldDef.CHAR,2);
      FieldDef array[] = {
        dctcodigo,
        dctdescenl,
        dctcodasiento,
        dctdescri,
        dcttipoenl,
        dcttipotra,
        dcttipoasi        
        };
      setColumns(array);
      FieldDef arrayf[] = {dctcodigo,dctcodasiento };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDefctadet extends TableDef
    {
    // Campos
    public FieldDef dcecodigo;
    public FieldDef dcecodasiento;
    public FieldDef dcelinia;
    public FieldDef dcedebehaber;
    public FieldDef dcecuenta;
    public FieldDef dcesubcuenta;
    public FieldDef dcedescrip;
    public FieldDef dcetipolin;
    public FieldDef dceorigenc;
    public FieldDef dceorigens;
    public TabDefctadet(String name)
      {
      super(name);
      dcecodigo = new FieldDef("dcecodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcecodasiento = new FieldDef("dcecodasiento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcelinia = new FieldDef("dcelinia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcedebehaber = new FieldDef("dcedebehaber",FieldDef.CHAR,1);
      dcecuenta = new FieldDef("dcecuenta",FieldDef.CHAR,4);
      dcesubcuenta = new FieldDef("dcesubcuenta",FieldDef.CHAR,12);
      dcedescrip = new FieldDef("dcedescrip",FieldDef.CHAR,40);
      dcetipolin = new FieldDef("dcetipolin",FieldDef.CHAR,2);
      dceorigenc = new FieldDef("dceorigenc",FieldDef.CHAR,2);
      dceorigens = new FieldDef("dceorigens",FieldDef.CHAR,2);
      FieldDef array[] = {
        dcecodigo,
        dcecodasiento,
        dcelinia,
        dcedebehaber,
        dcecuenta,
        dcesubcuenta,
        dcedescrip,
        dcetipolin,
        dceorigenc,
        dceorigens        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcecodigo,dcecodasiento,dcelinia };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDefctacon extends TableDef
    {
    // Campos
    public FieldDef dcocodigo;
    public FieldDef dcocodasiento;
    public FieldDef dcolinia;
    public FieldDef dcoitem;
    public FieldDef dcotipo;
    public FieldDef dcoconcepto;
    public FieldDef dcoliteral;
    public FieldDef dcooperacion;
    public TabDefctacon(String name)
      {
      super(name);
      dcocodigo = new FieldDef("dcocodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcocodasiento = new FieldDef("dcocodasiento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcolinia = new FieldDef("dcolinia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcoitem = new FieldDef("dcoitem",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcotipo = new FieldDef("dcotipo",FieldDef.CHAR,1);
      dcoconcepto = new FieldDef("dcoconcepto",FieldDef.CHAR,6);
      dcoliteral = new FieldDef("dcoliteral",FieldDef.FLOAT,6,0);
      dcooperacion = new FieldDef("dcooperacion",FieldDef.CHAR,1);
      FieldDef array[] = {
        dcocodigo,
        dcocodasiento,
        dcolinia,
        dcoitem,
        dcotipo,
        dcoconcepto,
        dcoliteral,
        dcooperacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcocodigo,dcocodasiento,dcolinia,dcoitem };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTareasemp extends TableDef
    {
    // Campos
    public FieldDef tarcodiemp;
    public FieldDef tarejercicio;
    public FieldDef tarperiodo;
    public FieldDef tartotestado;
    public FieldDef tartotfecha;
    public FieldDef tartotusuario;
    public FieldDef tarrebestado;
    public FieldDef tarrebfecha;
    public FieldDef tarrebusuario;
    public FieldDef tarssestado;
    public FieldDef tarssfecha;
    public FieldDef tarssusuario;
    public FieldDef tarhacestado;
    public FieldDef tarhacfecha;
    public FieldDef tarhacusuario;
    public FieldDef tar190estado;
    public FieldDef tar190fecha;
    public FieldDef tar190usuario;
    public FieldDef tare01estado;
    public FieldDef tare01fecha;
    public FieldDef tare01usuario;
    public FieldDef tare02estado;
    public FieldDef tare02fecha;
    public FieldDef tare02usuario;
    public FieldDef tare03estado;
    public FieldDef tare03fecha;
    public FieldDef tare03usuario;
    public FieldDef tare04estado;
    public FieldDef tare04fecha;
    public FieldDef tare04usuario;
    public FieldDef tare05estado;
    public FieldDef tare05fecha;
    public FieldDef tare05usuario;
    public FieldDef tarobservacion;
    public TabTareasemp(String name)
      {
      super(name);
      tarcodiemp = new FieldDef("tarcodiemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tarejercicio = new FieldDef("tarejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tarperiodo = new FieldDef("tarperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tartotestado = new FieldDef("tartotestado",FieldDef.CHAR,1);
      tartotfecha = new FieldDef("tartotfecha",FieldDef.DATE);
      tartotusuario = new FieldDef("tartotusuario",FieldDef.CHAR,25);
      tarrebestado = new FieldDef("tarrebestado",FieldDef.CHAR,1);
      tarrebfecha = new FieldDef("tarrebfecha",FieldDef.DATE);
      tarrebusuario = new FieldDef("tarrebusuario",FieldDef.CHAR,25);
      tarssestado = new FieldDef("tarssestado",FieldDef.CHAR,1);
      tarssfecha = new FieldDef("tarssfecha",FieldDef.DATE);
      tarssusuario = new FieldDef("tarssusuario",FieldDef.CHAR,25);
      tarhacestado = new FieldDef("tarhacestado",FieldDef.CHAR,1);
      tarhacfecha = new FieldDef("tarhacfecha",FieldDef.DATE);
      tarhacusuario = new FieldDef("tarhacusuario",FieldDef.CHAR,25);
      tar190estado = new FieldDef("tar190estado",FieldDef.CHAR,1);
      tar190fecha = new FieldDef("tar190fecha",FieldDef.DATE);
      tar190usuario = new FieldDef("tar190usuario",FieldDef.CHAR,25);
      tare01estado = new FieldDef("tare01estado",FieldDef.CHAR,1);
      tare01fecha = new FieldDef("tare01fecha",FieldDef.DATE);
      tare01usuario = new FieldDef("tare01usuario",FieldDef.CHAR,25);
      tare02estado = new FieldDef("tare02estado",FieldDef.CHAR,1);
      tare02fecha = new FieldDef("tare02fecha",FieldDef.DATE);
      tare02usuario = new FieldDef("tare02usuario",FieldDef.CHAR,25);
      tare03estado = new FieldDef("tare03estado",FieldDef.CHAR,1);
      tare03fecha = new FieldDef("tare03fecha",FieldDef.DATE);
      tare03usuario = new FieldDef("tare03usuario",FieldDef.CHAR,25);
      tare04estado = new FieldDef("tare04estado",FieldDef.CHAR,1);
      tare04fecha = new FieldDef("tare04fecha",FieldDef.DATE);
      tare04usuario = new FieldDef("tare04usuario",FieldDef.CHAR,25);
      tare05estado = new FieldDef("tare05estado",FieldDef.CHAR,1);
      tare05fecha = new FieldDef("tare05fecha",FieldDef.DATE);
      tare05usuario = new FieldDef("tare05usuario",FieldDef.CHAR,25);
      tarobservacion = new FieldDef("tarobservacion",FieldDef.CHAR,255);
      FieldDef array[] = {
        tarcodiemp,
        tarejercicio,
        tarperiodo,
        tartotestado,
        tartotfecha,
        tartotusuario,
        tarrebestado,
        tarrebfecha,
        tarrebusuario,
        tarssestado,
        tarssfecha,
        tarssusuario,
        tarhacestado,
        tarhacfecha,
        tarhacusuario,
        tar190estado,
        tar190fecha,
        tar190usuario,
        tare01estado,
        tare01fecha,
        tare01usuario,
        tare02estado,
        tare02fecha,
        tare02usuario,
        tare03estado,
        tare03fecha,
        tare03usuario,
        tare04estado,
        tare04fecha,
        tare04usuario,
        tare05estado,
        tare05fecha,
        tare05usuario,
        tarobservacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {tarcodiemp,tarejercicio,tarperiodo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public CatLaboral()
    {
    tabgycauto = new TabGycauto("gycauto");
    tabvaloresnom = new TabValoresnom("valoresnom");
    tabinem = new TabInem("inem");
    tabservicios = new TabServicios("servicios");
    tabtc1desc = new TabTc1desc("tc1desc");
    tabdefredcab = new TabDefredcab("defredcab");
    tabdefredseg = new TabDefredseg("defredseg");
    tabdefredcon = new TabDefredcon("defredcon");
    tabirpfpv = new TabIrpfpv("irpfpv");
    tabirpftc = new TabIrpftc("irpftc");
    tabirpftcescala = new TabIrpftcescala("irpftcescala");
    tabirpfclaves = new TabIrpfclaves("irpfclaves");
    tabssjublagunas = new TabSsjublagunas("ssjublagunas");
    tabssjubreg = new TabSsjubreg("ssjubreg");
    tabssjubanys = new TabSsjubanys("ssjubanys");
    tabssjubbonif = new TabSsjubbonif("ssjubbonif");
    tabssjubcoef = new TabSsjubcoef("ssjubcoef");
    tabssjubparam = new TabSsjubparam("ssjubparam");
    tabssembargo = new TabSsembargo("ssembargo");
    tabssregimen = new TabSsregimen("ssregimen");
    tabsscuotas = new TabSscuotas("sscuotas");
    tabssbases = new TabSsbases("ssbases");
    tabssdiasit = new TabSsdiasit("ssdiasit");
    tabssparametros = new TabSsparametros("ssparametros");
    tabssexclusion = new TabSsexclusion("ssexclusion");
    tabssepigrafes = new TabSsepigrafes("ssepigrafes");
    tabssipc = new TabSsipc("ssipc");
    tabmutuas = new TabMutuas("mutuas");
    tabssbonif = new TabSsbonif("ssbonif");
    tabssbontram = new TabSsbontram("ssbontram");
    tabssartistas = new TabSsartistas("ssartistas");
    tabcontratos = new TabContratos("contratos");
    tabconclaves = new TabConclaves("conclaves");
    tabconbonif = new TabConbonif("conbonif");
    tabconcepto = new TabConcepto("concepto");
    tabconfactor = new TabConfactor("confactor");
    tabconfacrel = new TabConfacrel("confacrel");
    tabprocesos = new TabProcesos("procesos");
    tabenlaces = new TabEnlaces("enlaces");
    tabconvenio = new TabConvenio("convenio");
    tabcategoria = new TabCategoria("categoria");
    tabantiguedad = new TabAntiguedad("antiguedad");
    tabtramsantig = new TabTramsantig("tramsantig");
    tabpagas = new TabPagas("pagas");
    tabconpagas = new TabConpagas("conpagas");
    tabgarantias = new TabGarantias("garantias");
    tabtramgarantia = new TabTramgarantia("tramgarantia");
    tabvacaciones = new TabVacaciones("vacaciones");
    tabempresa = new TabEmpresa("empresa");
    tabempservicios = new TabEmpservicios("empservicios");
    tabempclausulas = new TabEmpclausulas("empclausulas");
    tabcentros = new TabCentros("centros");
    tabcentrosfor = new TabCentrosfor("centrosfor");
    tabcentrosvar = new TabCentrosvar("centrosvar");
    tabcentrosexc = new TabCentrosexc("centrosexc");
    tabcendpto = new TabCendpto("cendpto");
    tabcendbancos = new TabCendbancos("cendbancos");
    tabestado = new TabEstado("estado");
    tabtrabajador = new TabTrabajador("trabajador");
    tabtracontrato = new TabTracontrato("tracontrato");
    tabtraconclaus = new TabTraconclaus("traconclaus");
    tabtrairpf = new TabTrairpf("trairpf");
    tabtraunifam = new TabTraunifam("traunifam");
    tabtraembargo = new TabTraembargo("traembargo");
    tabtraembhistor = new TabTraembhistor("traembhistor");
    tabtrabonif = new TabTrabonif("trabonif");
    tabtraparte = new TabTraparte("traparte");
    tabcalendario = new TabCalendario("calendario");
    tabcalendariodet = new TabCalendariodet("calendariodet");
    tabincidencias = new TabIncidencias("incidencias");
    tabincvariable = new TabIncvariable("incvariable");
    tabfiniquito = new TabFiniquito("finiquito");
    tabhisretri = new TabHisretri("hisretri");
    tabhisdeduc = new TabHisdeduc("hisdeduc");
    tabhiscostes = new TabHiscostes("hiscostes");
    tabhisbonif = new TabHisbonif("hisbonif");
    tabhisinciden = new TabHisinciden("hisinciden");
    tabhisperso = new TabHisperso("hisperso");
    tabhiscontrol = new TabHiscontrol("hiscontrol");
    tabseleccion = new TabSeleccion("seleccion");
    tabsimulacion = new TabSimulacion("simulacion");
    tabredarchivos = new TabRedarchivos("redarchivos");
    tabredtemporal = new TabRedtemporal("redtemporal");
    tabtracalirpf = new TabTracalirpf("tracalirpf");
    tabtrairpfdet = new TabTrairpfdet("trairpfdet");
    tabtrairpfcon = new TabTrairpfcon("trairpfcon");
    tabtrairpfvant = new TabTrairpfvant("trairpfvant");
    tabtrairpfrel = new TabTrairpfrel("trairpfrel");
    tabcnvglobal = new TabCnvglobal("cnvglobal");
    tabcnvdetalle = new TabCnvdetalle("cnvdetalle");
    tabcnverrores = new TabCnverrores("cnverrores");
    tabparamred = new TabParamred("paramred");
    tabmsgestado = new TabMsgestado("msgestado");
    tabsegmento = new TabSegmento("segmento");
    tabmsgestadodet = new TabMsgestadodet("msgestadodet");
    tabtc1cab = new TabTc1cab("tc1cab");
    tabtc1det = new TabTc1det("tc1det");
    tabtc2 = new TabTc2("tc2");
    tabtc2abrev = new TabTc2abrev("tc2abrev");
    tabmsgfdi = new TabMsgfdi("msgfdi");
    tabmsgafi = new TabMsgafi("msgafi");
    tabconversion = new TabConversion("conversion");
    tabcnvtest = new TabCnvtest("cnvtest");
    tabcnvtestdet = new TabCnvtestdet("cnvtestdet");
    tabcnvtc1cab = new TabCnvtc1cab("cnvtc1cab");
    tabcnvtc1det = new TabCnvtc1det("cnvtc1det");
    tabdefdircab = new TabDefdircab("defdircab");
    tabdefdircol = new TabDefdircol("defdircol");
    tabdefdircon = new TabDefdircon("defdircon");
    tabvaloresdir = new TabValoresdir("valoresdir");
    tabbds = new TabBds("bds");
    tabquefrase = new TabQuefrase("quefrase");
    tabquevariables = new TabQuevariables("quevariables");
    tabquetabla = new TabQuetabla("quetabla");
    tabquecolumn = new TabQuecolumn("quecolumn");
    tabtc18 = new TabTc18("tc18");
    tabtc119 = new TabTc119("tc119");
    tabtc13 = new TabTc13("tc13");
    tabtc16desc = new TabTc16desc("tc16desc");
    tabtc16cab = new TabTc16cab("tc16cab");
    tabtc16det = new TabTc16det("tc16det");
    tabcambiocodigo = new TabCambiocodigo("cambiocodigo");
    tabtracontrata = new TabTracontrata("tracontrata");
    tabconvproc = new TabConvproc("convproc");
    tabdefctocab = new TabDefctocab("defctocab");
    tabdefctodet = new TabDefctodet("defctodet");
    tabdefctoblock = new TabDefctoblock("defctoblock");
    tabpartes = new TabPartes("partes");
    tabtextosreb = new TabTextosreb("textosreb");
    tabhistextos = new TabHistextos("histextos");
    tabsscnae = new TabSscnae("sscnae");
    tabsscnaedet = new TabSscnaedet("sscnaedet");
    tabsscnae09 = new TabSscnae09("sscnae09");
    tabcnaeequival = new TabCnaeequival("cnaeequival");
    tabxisretri = new TabXisretri("xisretri");
    tabxisdeduc = new TabXisdeduc("xisdeduc");
    tabxiscostes = new TabXiscostes("xiscostes");
    tabxisbonif = new TabXisbonif("xisbonif");
    tabxisinciden = new TabXisinciden("xisinciden");
    tabxisperso = new TabXisperso("xisperso");
    tabxiscontrol = new TabXiscontrol("xiscontrol");
    tabhisprorratas = new TabHisprorratas("hisprorratas");
    tabxisprorratas = new TabXisprorratas("xisprorratas");
    tabuserseportem = new TabUserseportem("userseportem");
    tabparamscal = new TabParamscal("paramscal");
    tabdefctacab = new TabDefctacab("defctacab");
    tabdefctadet = new TabDefctadet("defctadet");
    tabdefctacon = new TabDefctacon("defctacon");
    tabtareasemp = new TabTareasemp("tareasemp");
    TableDef array[] = {
      tabgycauto,
      tabvaloresnom,
      tabinem,
      tabservicios,
      tabtc1desc,
      tabdefredcab,
      tabdefredseg,
      tabdefredcon,
      tabirpfpv,
      tabirpftc,
      tabirpftcescala,
      tabirpfclaves,
      tabssjublagunas,
      tabssjubreg,
      tabssjubanys,
      tabssjubbonif,
      tabssjubcoef,
      tabssjubparam,
      tabssembargo,
      tabssregimen,
      tabsscuotas,
      tabssbases,
      tabssdiasit,
      tabssparametros,
      tabssexclusion,
      tabssepigrafes,
      tabssipc,
      tabmutuas,
      tabssbonif,
      tabssbontram,
      tabssartistas,
      tabcontratos,
      tabconclaves,
      tabconbonif,
      tabconcepto,
      tabconfactor,
      tabconfacrel,
      tabprocesos,
      tabenlaces,
      tabconvenio,
      tabcategoria,
      tabantiguedad,
      tabtramsantig,
      tabpagas,
      tabconpagas,
      tabgarantias,
      tabtramgarantia,
      tabvacaciones,
      tabempresa,
      tabempservicios,
      tabempclausulas,
      tabcentros,
      tabcentrosfor,
      tabcentrosvar,
      tabcentrosexc,
      tabcendpto,
      tabcendbancos,
      tabestado,
      tabtrabajador,
      tabtracontrato,
      tabtraconclaus,
      tabtrairpf,
      tabtraunifam,
      tabtraembargo,
      tabtraembhistor,
      tabtrabonif,
      tabtraparte,
      tabcalendario,
      tabcalendariodet,
      tabincidencias,
      tabincvariable,
      tabfiniquito,
      tabhisretri,
      tabhisdeduc,
      tabhiscostes,
      tabhisbonif,
      tabhisinciden,
      tabhisperso,
      tabhiscontrol,
      tabseleccion,
      tabsimulacion,
      tabredarchivos,
      tabredtemporal,
      tabtracalirpf,
      tabtrairpfdet,
      tabtrairpfcon,
      tabtrairpfvant,
      tabtrairpfrel,
      tabcnvglobal,
      tabcnvdetalle,
      tabcnverrores,
      tabparamred,
      tabmsgestado,
      tabsegmento,
      tabmsgestadodet,
      tabtc1cab,
      tabtc1det,
      tabtc2,
      tabtc2abrev,
      tabmsgfdi,
      tabmsgafi,
      tabconversion,
      tabcnvtest,
      tabcnvtestdet,
      tabcnvtc1cab,
      tabcnvtc1det,
      tabdefdircab,
      tabdefdircol,
      tabdefdircon,
      tabvaloresdir,
      tabbds,
      tabquefrase,
      tabquevariables,
      tabquetabla,
      tabquecolumn,
      tabtc18,
      tabtc119,
      tabtc13,
      tabtc16desc,
      tabtc16cab,
      tabtc16det,
      tabcambiocodigo,
      tabtracontrata,
      tabconvproc,
      tabdefctocab,
      tabdefctodet,
      tabdefctoblock,
      tabpartes,
      tabtextosreb,
      tabhistextos,
      tabsscnae,
      tabsscnaedet,
      tabsscnae09,
      tabcnaeequival,
      tabxisretri,
      tabxisdeduc,
      tabxiscostes,
      tabxisbonif,
      tabxisinciden,
      tabxisperso,
      tabxiscontrol,
      tabhisprorratas,
      tabxisprorratas,
      tabuserseportem,
      tabparamscal,
      tabdefctacab,
      tabdefctadet,
      tabdefctacon,
      tabtareasemp      
      };
    setTables(array);
    FieldDef tabdefredsegArrayf1[] = { tabdefredseg.drstipomsg,tabdefredseg.drsregimen,tabdefredseg.drssegmento };
    ForeignKey tabdefredsegArrayfk[] = { 
      new ForeignKey(tabdefredcab,tabdefredsegArrayf1)      
      };
    tabdefredseg.setForeignKeys(tabdefredsegArrayfk);
    FieldDef tabdefredconArrayf1[] = { tabdefredcon.drotipomsg,tabdefredcon.droregimen,tabdefredcon.drosegmento };
    ForeignKey tabdefredconArrayfk[] = { 
      new ForeignKey(tabdefredcab,tabdefredconArrayf1)      
      };
    tabdefredcon.setForeignKeys(tabdefredconArrayfk);
    FieldDef tabsscuotasArrayf1[] = { tabsscuotas.sscuoregimen,tabsscuotas.sscuoejercicio,tabsscuotas.sscuoperiodo };
    ForeignKey tabsscuotasArrayfk[] = { 
      new ForeignKey(tabssregimen,tabsscuotasArrayf1)      
      };
    tabsscuotas.setForeignKeys(tabsscuotasArrayfk);
    FieldDef tabssbasesArrayf1[] = { tabssbases.ssbasregimen,tabssbases.ssbasejercicio,tabssbases.ssbasperiodo };
    ForeignKey tabssbasesArrayfk[] = { 
      new ForeignKey(tabssregimen,tabssbasesArrayf1)      
      };
    tabssbases.setForeignKeys(tabssbasesArrayfk);
    FieldDef tabssdiasitArrayf1[] = { tabssdiasit.ssitregimen,tabssdiasit.ssitejercicio,tabssdiasit.ssitperiodo };
    ForeignKey tabssdiasitArrayfk[] = { 
      new ForeignKey(tabssregimen,tabssdiasitArrayf1)      
      };
    tabssdiasit.setForeignKeys(tabssdiasitArrayfk);
    FieldDef tabssparametrosArrayf1[] = { tabssparametros.ssparegimen,tabssparametros.sspaejercicio,tabssparametros.sspaperiodo };
    ForeignKey tabssparametrosArrayfk[] = { 
      new ForeignKey(tabssregimen,tabssparametrosArrayf1)      
      };
    tabssparametros.setForeignKeys(tabssparametrosArrayfk);
    FieldDef tabssbontramArrayf1[] = { tabssbontram.btbcodigo };
    ForeignKey tabssbontramArrayfk[] = { 
      new ForeignKey(tabssbonif,tabssbontramArrayf1)      
      };
    tabssbontram.setForeignKeys(tabssbontramArrayfk);
    FieldDef tabconclavesArrayf1[] = { tabconclaves.cvejer,tabconclaves.cvper,tabconclaves.cvplant };
    ForeignKey tabconclavesArrayfk[] = { 
      new ForeignKey(tabcontratos,tabconclavesArrayf1)      
      };
    tabconclaves.setForeignKeys(tabconclavesArrayfk);
    FieldDef tabconbonifArrayf1[] = { tabconbonif.cbejer,tabconbonif.cbper,tabconbonif.cbplant };
    FieldDef tabconbonifArrayf2[] = { tabconbonif.cbejer,tabconbonif.cbper,tabconbonif.cbplant,tabconbonif.cbcodi };
    FieldDef tabconbonifArrayf3[] = { tabconbonif.cbcodbonif };
    ForeignKey tabconbonifArrayfk[] = { 
      new ForeignKey(tabcontratos,tabconbonifArrayf1),
      new ForeignKey(tabconclaves,tabconbonifArrayf2),
      new ForeignKey(tabssbonif,tabconbonifArrayf3)      
      };
    tabconbonif.setForeignKeys(tabconbonifArrayfk);
    FieldDef tabconfactorArrayf1[] = { tabconfactor.facconvemp,tabconfactor.facconcept };
    ForeignKey tabconfactorArrayfk[] = { 
      new ForeignKey(tabconcepto,tabconfactorArrayf1)      
      };
    tabconfactor.setForeignKeys(tabconfactorArrayfk);
    FieldDef tabconfacrelArrayf1[] = { tabconfacrel.cfrcodi };
    ForeignKey tabconfacrelArrayfk[] = { 
      new ForeignKey(tabconfactor,tabconfacrelArrayf1)      
      };
    tabconfacrel.setForeignKeys(tabconfacrelArrayfk);
    FieldDef tabenlacesArrayf1[] = { tabenlaces.enlpagas };
    FieldDef tabenlacesArrayf2[] = { tabenlaces.enlcateg };
    FieldDef tabenlacesArrayf3[] = { tabenlaces.enlconcep };
    FieldDef tabenlacesArrayf4[] = { tabenlaces.enlgaran };
    FieldDef tabenlacesArrayf5[] = { tabenlaces.enlvacaci };
    FieldDef tabenlacesArrayf6[] = { tabenlaces.enlantig };
    FieldDef tabenlacesArrayf7[] = { tabenlaces.enlparamcal };
    ForeignKey tabenlacesArrayfk[] = { 
      new ForeignKey(tabpagas,tabenlacesArrayf1),
      new ForeignKey(tabcategoria,tabenlacesArrayf2),
      new ForeignKey(tabconcepto,tabenlacesArrayf3),
      new ForeignKey(tabgarantias,tabenlacesArrayf4),
      new ForeignKey(tabvacaciones,tabenlacesArrayf5),
      new ForeignKey(tabantiguedad,tabenlacesArrayf6),
      new ForeignKey(tabparamscal,tabenlacesArrayf7)      
      };
    tabenlaces.setForeignKeys(tabenlacesArrayfk);
    FieldDef tabconvenioArrayf1[] = { tabconvenio.cnvenlace };
    ForeignKey tabconvenioArrayfk[] = { 
      new ForeignKey(tabenlaces,tabconvenioArrayf1)      
      };
    tabconvenio.setForeignKeys(tabconvenioArrayfk);
    FieldDef tabtramsantigArrayf1[] = { tabtramsantig.tantconvemp,tabtramsantig.tantcategoria };
    ForeignKey tabtramsantigArrayfk[] = { 
      new ForeignKey(tabantiguedad,tabtramsantigArrayf1)      
      };
    tabtramsantig.setForeignKeys(tabtramsantigArrayfk);
    FieldDef tabconpagasArrayf1[] = { tabconpagas.cpagconvemp,tabconpagas.cpagcodigo };
    ForeignKey tabconpagasArrayfk[] = { 
      new ForeignKey(tabpagas,tabconpagasArrayf1)      
      };
    tabconpagas.setForeignKeys(tabconpagasArrayfk);
    FieldDef tabtramgarantiaArrayf1[] = { tabtramgarantia.tgarconvemp,tabtramgarantia.tgartipoin,tabtramgarantia.tgarhospi };
    ForeignKey tabtramgarantiaArrayfk[] = { 
      new ForeignKey(tabgarantias,tabtramgarantiaArrayf1)      
      };
    tabtramgarantia.setForeignKeys(tabtramgarantiaArrayfk);
    FieldDef tabempresaArrayf1[] = { tabempresa.empenlace };
    FieldDef tabempresaArrayf2[] = { tabempresa.empcodiconv };
    ForeignKey tabempresaArrayfk[] = { 
      new ForeignKey(tabenlaces,tabempresaArrayf1),
      new ForeignKey(tabconvenio,tabempresaArrayf2)      
      };
    tabempresa.setForeignKeys(tabempresaArrayfk);
    FieldDef tabempserviciosArrayf1[] = { tabempservicios.emscodigo };
    ForeignKey tabempserviciosArrayfk[] = { 
      new ForeignKey(tabservicios,tabempserviciosArrayf1)      
      };
    tabempservicios.setForeignKeys(tabempserviciosArrayfk);
    FieldDef tabempclausulasArrayf1[] = { tabempclausulas.emcempresa };
    ForeignKey tabempclausulasArrayfk[] = { 
      new ForeignKey(tabempresa,tabempclausulasArrayf1)      
      };
    tabempclausulas.setForeignKeys(tabempclausulasArrayfk);
    FieldDef tabcentrosArrayf1[] = { tabcentros.cencodiemp };
    ForeignKey tabcentrosArrayfk[] = { 
      new ForeignKey(tabempresa,tabcentrosArrayf1)      
      };
    tabcentros.setForeignKeys(tabcentrosArrayfk);
    FieldDef tabcentrosforArrayf1[] = { tabcentrosfor.cenfcodiemp,tabcentrosfor.cenfcentro };
    ForeignKey tabcentrosforArrayfk[] = { 
      new ForeignKey(tabcentros,tabcentrosforArrayf1)      
      };
    tabcentrosfor.setForeignKeys(tabcentrosforArrayfk);
    FieldDef tabcentrosvarArrayf1[] = { tabcentrosvar.cevcodiemp };
    FieldDef tabcentrosvarArrayf2[] = { tabcentrosvar.cevcodiemp,tabcentrosvar.cevcodigo };
    ForeignKey tabcentrosvarArrayfk[] = { 
      new ForeignKey(tabempresa,tabcentrosvarArrayf1),
      new ForeignKey(tabcentros,tabcentrosvarArrayf2)      
      };
    tabcentrosvar.setForeignKeys(tabcentrosvarArrayfk);
    FieldDef tabcentrosexcArrayf1[] = { tabcentrosexc.cexcodiemp };
    FieldDef tabcentrosexcArrayf2[] = { tabcentrosexc.cexcodiemp,tabcentrosexc.cexcodigo };
    ForeignKey tabcentrosexcArrayfk[] = { 
      new ForeignKey(tabempresa,tabcentrosexcArrayf1),
      new ForeignKey(tabcentros,tabcentrosexcArrayf2)      
      };
    tabcentrosexc.setForeignKeys(tabcentrosexcArrayfk);
    FieldDef tabcendptoArrayf1[] = { tabcendpto.cedcodiemp,tabcendpto.cedcodigo };
    ForeignKey tabcendptoArrayfk[] = { 
      new ForeignKey(tabcentros,tabcendptoArrayf1)      
      };
    tabcendpto.setForeignKeys(tabcendptoArrayfk);
    FieldDef tabcendbancosArrayf1[] = { tabcendbancos.cebcodiemp,tabcendbancos.cebcodigo };
    ForeignKey tabcendbancosArrayfk[] = { 
      new ForeignKey(tabcentros,tabcendbancosArrayf1)      
      };
    tabcendbancos.setForeignKeys(tabcendbancosArrayfk);
    FieldDef tabestadoArrayf1[] = { tabestado.estcodiemp };
    ForeignKey tabestadoArrayfk[] = { 
      new ForeignKey(tabempresa,tabestadoArrayf1)      
      };
    tabestado.setForeignKeys(tabestadoArrayfk);
    FieldDef tabtrabajadorArrayf1[] = { tabtrabajador.tracodiemp };
    FieldDef tabtrabajadorArrayf2[] = { tabtrabajador.traenlace };
    FieldDef tabtrabajadorArrayf3[] = { tabtrabajador.tracodiemp,tabtrabajador.tracentro };
    FieldDef tabtrabajadorArrayf4[] = { tabtrabajador.tracodiemp,tabtrabajador.tracodigo,tabtrabajador.trarelacion };
    ForeignKey tabtrabajadorArrayfk[] = { 
      new ForeignKey(tabempresa,tabtrabajadorArrayf1),
      new ForeignKey(tabenlaces,tabtrabajadorArrayf2),
      new ForeignKey(tabcentros,tabtrabajadorArrayf3),
      new ForeignKey(tabtracontrato,tabtrabajadorArrayf4)      
      };
    tabtrabajador.setForeignKeys(tabtrabajadorArrayfk);
    FieldDef tabtracontratoArrayf1[] = { tabtracontrato.trcconvenio };
    FieldDef tabtracontratoArrayf2[] = { tabtracontrato.trcconclavespro };
    FieldDef tabtracontratoArrayf3[] = { tabtracontrato.trcconclavescon };
    FieldDef tabtracontratoArrayf4[] = { tabtracontrato.trccodiemp,tabtracontrato.trccodigo };
    ForeignKey tabtracontratoArrayfk[] = { 
      new ForeignKey(tabconvenio,tabtracontratoArrayf1),
      new ForeignKey(tabconclaves,tabtracontratoArrayf2),
      new ForeignKey(tabconclaves,tabtracontratoArrayf3),
      new ForeignKey(tabtrabajador,tabtracontratoArrayf4)      
      };
    tabtracontrato.setForeignKeys(tabtracontratoArrayfk);
    FieldDef tabtraconclausArrayf1[] = { tabtraconclaus.trocodiemp,tabtraconclaus.trocodigo };
    FieldDef tabtraconclausArrayf2[] = { tabtraconclaus.trocodiemp,tabtraconclaus.trocodigo,tabtraconclaus.trorelacion };
    ForeignKey tabtraconclausArrayfk[] = { 
      new ForeignKey(tabtrabajador,tabtraconclausArrayf1),
      new ForeignKey(tabtracontrato,tabtraconclausArrayf2)      
      };
    tabtraconclaus.setForeignKeys(tabtraconclausArrayfk);
    FieldDef tabtrairpfArrayf1[] = { tabtrairpf.tricodiemp,tabtrairpf.tricodigo };
    ForeignKey tabtrairpfArrayfk[] = { 
      new ForeignKey(tabtrabajador,tabtrairpfArrayf1)      
      };
    tabtrairpf.setForeignKeys(tabtrairpfArrayfk);
    FieldDef tabtraunifamArrayf1[] = { tabtraunifam.trucodiemp,tabtraunifam.trucodigo };
    ForeignKey tabtraunifamArrayfk[] = { 
      new ForeignKey(tabtrabajador,tabtraunifamArrayf1)      
      };
    tabtraunifam.setForeignKeys(tabtraunifamArrayfk);
    FieldDef tabtraembargoArrayf1[] = { tabtraembargo.trecodiemp,tabtraembargo.trecodigo };
    ForeignKey tabtraembargoArrayfk[] = { 
      new ForeignKey(tabtrabajador,tabtraembargoArrayf1)      
      };
    tabtraembargo.setForeignKeys(tabtraembargoArrayfk);
    FieldDef tabtraembhistorArrayf1[] = { tabtraembhistor.trhembargo };
    ForeignKey tabtraembhistorArrayfk[] = { 
      new ForeignKey(tabtraembargo,tabtraembhistorArrayf1)      
      };
    tabtraembhistor.setForeignKeys(tabtraembhistorArrayfk);
    FieldDef tabtrabonifArrayf1[] = { tabtrabonif.trbcodiemp };
    FieldDef tabtrabonifArrayf2[] = { tabtrabonif.trbcodiemp,tabtrabonif.trbcodigo };
    ForeignKey tabtrabonifArrayfk[] = { 
      new ForeignKey(tabempresa,tabtrabonifArrayf1),
      new ForeignKey(tabtrabajador,tabtrabonifArrayf2)      
      };
    tabtrabonif.setForeignKeys(tabtrabonifArrayfk);
    FieldDef tabtraparteArrayf1[] = { tabtraparte.trpcodiemp,tabtraparte.trpcodigo,tabtraparte.trprelacion };
    FieldDef tabtraparteArrayf2[] = { tabtraparte.trpcodiemp,tabtraparte.trpcodigo };
    ForeignKey tabtraparteArrayfk[] = { 
      new ForeignKey(tabtracontrato,tabtraparteArrayf1),
      new ForeignKey(tabtrabajador,tabtraparteArrayf2)      
      };
    tabtraparte.setForeignKeys(tabtraparteArrayfk);
    FieldDef tabcalendariodetArrayf1[] = { tabcalendariodet.caldcodigo };
    ForeignKey tabcalendariodetArrayfk[] = { 
      new ForeignKey(tabcalendario,tabcalendariodetArrayf1)      
      };
    tabcalendariodet.setForeignKeys(tabcalendariodetArrayfk);
    FieldDef tabincidenciasArrayf1[] = { tabincidencias.inccodiemp };
    FieldDef tabincidenciasArrayf2[] = { tabincidencias.inccodiemp,tabincidencias.inccentro };
    FieldDef tabincidenciasArrayf3[] = { tabincidencias.inccodiemp,tabincidencias.inctrabajador };
    ForeignKey tabincidenciasArrayfk[] = { 
      new ForeignKey(tabempresa,tabincidenciasArrayf1),
      new ForeignKey(tabcentros,tabincidenciasArrayf2),
      new ForeignKey(tabtrabajador,tabincidenciasArrayf3)      
      };
    tabincidencias.setForeignKeys(tabincidenciasArrayfk);
    FieldDef tabincvariableArrayf1[] = { tabincvariable.invcodiemp };
    FieldDef tabincvariableArrayf2[] = { tabincvariable.invcodiemp,tabincvariable.invcentro };
    FieldDef tabincvariableArrayf3[] = { tabincvariable.invcodiemp,tabincvariable.invtrabajador };
    FieldDef tabincvariableArrayf4[] = { tabincvariable.invcodiemp,tabincvariable.invtrabajador,tabincvariable.invrelacion };
    ForeignKey tabincvariableArrayfk[] = { 
      new ForeignKey(tabempresa,tabincvariableArrayf1),
      new ForeignKey(tabcentros,tabincvariableArrayf2),
      new ForeignKey(tabtrabajador,tabincvariableArrayf3),
      new ForeignKey(tabtracontrato,tabincvariableArrayf4)      
      };
    tabincvariable.setForeignKeys(tabincvariableArrayfk);
    FieldDef tabfiniquitoArrayf1[] = { tabfiniquito.finqempresa };
    FieldDef tabfiniquitoArrayf2[] = { tabfiniquito.finqempresa,tabfiniquito.finqtrabaj };
    FieldDef tabfiniquitoArrayf3[] = { tabfiniquito.finqempresa,tabfiniquito.finqtrabaj,tabfiniquito.finqrelacion };
    ForeignKey tabfiniquitoArrayfk[] = { 
      new ForeignKey(tabempresa,tabfiniquitoArrayf1),
      new ForeignKey(tabtrabajador,tabfiniquitoArrayf2),
      new ForeignKey(tabtracontrato,tabfiniquitoArrayf3)      
      };
    tabfiniquito.setForeignKeys(tabfiniquitoArrayfk);
    FieldDef tabhisretriArrayf1[] = { tabhisretri.hisrempresa };
    FieldDef tabhisretriArrayf2[] = { tabhisretri.hisrinciden };
    FieldDef tabhisretriArrayf3[] = { tabhisretri.hisrcalculo };
    FieldDef tabhisretriArrayf4[] = { tabhisretri.hisrempresa,tabhisretri.hisrtrabajador };
    ForeignKey tabhisretriArrayfk[] = { 
      new ForeignKey(tabempresa,tabhisretriArrayf1),
      new ForeignKey(tabhisinciden,tabhisretriArrayf2),
      new ForeignKey(tabhisperso,tabhisretriArrayf3),
      new ForeignKey(tabtrabajador,tabhisretriArrayf4)      
      };
    tabhisretri.setForeignKeys(tabhisretriArrayfk);
    FieldDef tabhisdeducArrayf1[] = { tabhisdeduc.hisdempresa };
    FieldDef tabhisdeducArrayf2[] = { tabhisdeduc.hisdcalculo };
    FieldDef tabhisdeducArrayf3[] = { tabhisdeduc.hisdempresa,tabhisdeduc.hisdtrabajador };
    FieldDef tabhisdeducArrayf4[] = { tabhisdeduc.hisdinciden };
    ForeignKey tabhisdeducArrayfk[] = { 
      new ForeignKey(tabempresa,tabhisdeducArrayf1),
      new ForeignKey(tabhisperso,tabhisdeducArrayf2),
      new ForeignKey(tabtrabajador,tabhisdeducArrayf3),
      new ForeignKey(tabhisinciden,tabhisdeducArrayf4)      
      };
    tabhisdeduc.setForeignKeys(tabhisdeducArrayfk);
    FieldDef tabhiscostesArrayf1[] = { tabhiscostes.hiscempresa };
    FieldDef tabhiscostesArrayf2[] = { tabhiscostes.hisccalculo };
    FieldDef tabhiscostesArrayf3[] = { tabhiscostes.hiscempresa,tabhiscostes.hisctrabajador };
    FieldDef tabhiscostesArrayf4[] = { tabhiscostes.hiscdeduc };
    ForeignKey tabhiscostesArrayfk[] = { 
      new ForeignKey(tabempresa,tabhiscostesArrayf1),
      new ForeignKey(tabhisperso,tabhiscostesArrayf2),
      new ForeignKey(tabtrabajador,tabhiscostesArrayf3),
      new ForeignKey(tabhisdeduc,tabhiscostesArrayf4)      
      };
    tabhiscostes.setForeignKeys(tabhiscostesArrayfk);
    FieldDef tabhisbonifArrayf1[] = { tabhisbonif.hisbempresa };
    FieldDef tabhisbonifArrayf2[] = { tabhisbonif.hisbcalculo };
    FieldDef tabhisbonifArrayf3[] = { tabhisbonif.hisbempresa,tabhisbonif.hisbtrabajador };
    FieldDef tabhisbonifArrayf4[] = { tabhisbonif.hisbdeduc };
    FieldDef tabhisbonifArrayf5[] = { tabhisbonif.hisbcostes };
    ForeignKey tabhisbonifArrayfk[] = { 
      new ForeignKey(tabempresa,tabhisbonifArrayf1),
      new ForeignKey(tabhisperso,tabhisbonifArrayf2),
      new ForeignKey(tabtrabajador,tabhisbonifArrayf3),
      new ForeignKey(tabhisdeduc,tabhisbonifArrayf4),
      new ForeignKey(tabhiscostes,tabhisbonifArrayf5)      
      };
    tabhisbonif.setForeignKeys(tabhisbonifArrayfk);
    FieldDef tabhisincidenArrayf1[] = { tabhisinciden.hisicodiemp };
    FieldDef tabhisincidenArrayf2[] = { tabhisinciden.hisicalculo };
    FieldDef tabhisincidenArrayf3[] = { tabhisinciden.hisicodiemp,tabhisinciden.hisicentro };
    FieldDef tabhisincidenArrayf4[] = { tabhisinciden.hisicodiemp,tabhisinciden.hisitrabajador };
    ForeignKey tabhisincidenArrayfk[] = { 
      new ForeignKey(tabempresa,tabhisincidenArrayf1),
      new ForeignKey(tabhisperso,tabhisincidenArrayf2),
      new ForeignKey(tabcentros,tabhisincidenArrayf3),
      new ForeignKey(tabtrabajador,tabhisincidenArrayf4)      
      };
    tabhisinciden.setForeignKeys(tabhisincidenArrayfk);
    FieldDef tabhispersoArrayf1[] = { tabhisperso.hispcodiemp };
    FieldDef tabhispersoArrayf2[] = { tabhisperso.hispcodiemp,tabhisperso.hispcentro };
    FieldDef tabhispersoArrayf3[] = { tabhisperso.hispcodiemp,tabhisperso.hisptrabajador };
    ForeignKey tabhispersoArrayfk[] = { 
      new ForeignKey(tabempresa,tabhispersoArrayf1),
      new ForeignKey(tabcentros,tabhispersoArrayf2),
      new ForeignKey(tabtrabajador,tabhispersoArrayf3)      
      };
    tabhisperso.setForeignKeys(tabhispersoArrayfk);
    FieldDef tabhiscontrolArrayf1[] = { tabhiscontrol.hisccodiemp };
    FieldDef tabhiscontrolArrayf2[] = { tabhiscontrol.hisccalculo };
    FieldDef tabhiscontrolArrayf3[] = { tabhiscontrol.hisccodiemp,tabhiscontrol.hisctrabajador };
    ForeignKey tabhiscontrolArrayfk[] = { 
      new ForeignKey(tabempresa,tabhiscontrolArrayf1),
      new ForeignKey(tabhisperso,tabhiscontrolArrayf2),
      new ForeignKey(tabtrabajador,tabhiscontrolArrayf3)      
      };
    tabhiscontrol.setForeignKeys(tabhiscontrolArrayfk);
    FieldDef tabtracalirpfArrayf1[] = { tabtracalirpf.tciempresa };
    FieldDef tabtracalirpfArrayf2[] = { tabtracalirpf.tciempresa,tabtracalirpf.tcicentro };
    FieldDef tabtracalirpfArrayf3[] = { tabtracalirpf.tciempresa,tabtracalirpf.tcitrabajador };
    ForeignKey tabtracalirpfArrayfk[] = { 
      new ForeignKey(tabempresa,tabtracalirpfArrayf1),
      new ForeignKey(tabcentros,tabtracalirpfArrayf2),
      new ForeignKey(tabtrabajador,tabtracalirpfArrayf3)      
      };
    tabtracalirpf.setForeignKeys(tabtracalirpfArrayfk);
    FieldDef tabtrairpfdetArrayf1[] = { tabtrairpfdet.tcdcodigo };
    ForeignKey tabtrairpfdetArrayfk[] = { 
      new ForeignKey(tabtracalirpf,tabtrairpfdetArrayf1)      
      };
    tabtrairpfdet.setForeignKeys(tabtrairpfdetArrayfk);
    FieldDef tabtrairpfconArrayf1[] = { tabtrairpfcon.tcccodigo,tabtrairpfcon.tccejercicio,tabtrairpfcon.tccperiodo,tabtrairpfcon.tcctipoimp };
    ForeignKey tabtrairpfconArrayfk[] = { 
      new ForeignKey(tabtrairpfdet,tabtrairpfconArrayf1)      
      };
    tabtrairpfcon.setForeignKeys(tabtrairpfconArrayfk);
    FieldDef tabtrairpfvantArrayf1[] = { tabtrairpfvant.trvcodigo };
    ForeignKey tabtrairpfvantArrayfk[] = { 
      new ForeignKey(tabtracalirpf,tabtrairpfvantArrayf1)      
      };
    tabtrairpfvant.setForeignKeys(tabtrairpfvantArrayfk);
    FieldDef tabtrairpfrelArrayf1[] = { tabtrairpfrel.trrcodigo };
    FieldDef tabtrairpfrelArrayf2[] = { tabtrairpfrel.trrempresa };
    ForeignKey tabtrairpfrelArrayfk[] = { 
      new ForeignKey(tabtracalirpf,tabtrairpfrelArrayf1),
      new ForeignKey(tabempresa,tabtrairpfrelArrayf2)      
      };
    tabtrairpfrel.setForeignKeys(tabtrairpfrelArrayfk);
    FieldDef tabcnvdetalleArrayf1[] = { tabcnvdetalle.cndempresa };
    ForeignKey tabcnvdetalleArrayfk[] = { 
      new ForeignKey(tabcnvglobal,tabcnvdetalleArrayf1)      
      };
    tabcnvdetalle.setForeignKeys(tabcnvdetalleArrayfk);
    FieldDef tabcnverroresArrayf1[] = { tabcnverrores.cnrempresa,tabcnverrores.cnrdetalle };
    ForeignKey tabcnverroresArrayfk[] = { 
      new ForeignKey(tabcnvdetalle,tabcnverroresArrayf1)      
      };
    tabcnverrores.setForeignKeys(tabcnverroresArrayfk);
    FieldDef tabsegmentoArrayf1[] = { tabsegmento.segmsgestcod };
    ForeignKey tabsegmentoArrayfk[] = { 
      new ForeignKey(tabmsgestado,tabsegmentoArrayf1)      
      };
    tabsegmento.setForeignKeys(tabsegmentoArrayfk);
    FieldDef tabmsgestadodetArrayf1[] = { tabmsgestadodet.msgdmsgestcod };
    ForeignKey tabmsgestadodetArrayfk[] = { 
      new ForeignKey(tabmsgestado,tabmsgestadodetArrayf1)      
      };
    tabmsgestadodet.setForeignKeys(tabmsgestadodetArrayfk);
    FieldDef tabtc1cabArrayf1[] = { tabtc1cab.tccempresa };
    FieldDef tabtc1cabArrayf2[] = { tabtc1cab.tccmsgestcod };
    FieldDef tabtc1cabArrayf3[] = { tabtc1cab.tccempresa,tabtc1cab.tcccentro };
    ForeignKey tabtc1cabArrayfk[] = { 
      new ForeignKey(tabempresa,tabtc1cabArrayf1),
      new ForeignKey(tabmsgestado,tabtc1cabArrayf2),
      new ForeignKey(tabcentros,tabtc1cabArrayf3)      
      };
    tabtc1cab.setForeignKeys(tabtc1cabArrayfk);
    FieldDef tabtc1detArrayf1[] = { tabtc1det.tcdcodigo };
    ForeignKey tabtc1detArrayfk[] = { 
      new ForeignKey(tabtc1cab,tabtc1detArrayf1)      
      };
    tabtc1det.setForeignKeys(tabtc1detArrayfk);
    FieldDef tabtc2Arrayf1[] = { tabtc2.tc2tc1codi };
    ForeignKey tabtc2Arrayfk[] = { 
      new ForeignKey(tabtc1cab,tabtc2Arrayf1)      
      };
    tabtc2.setForeignKeys(tabtc2Arrayfk);
    FieldDef tabtc2abrevArrayf1[] = { tabtc2abrev.tc2atc1codi };
    ForeignKey tabtc2abrevArrayfk[] = { 
      new ForeignKey(tabtc1cab,tabtc2abrevArrayf1)      
      };
    tabtc2abrev.setForeignKeys(tabtc2abrevArrayfk);
    FieldDef tabmsgfdiArrayf1[] = { tabmsgfdi.fdimsgestado };
    FieldDef tabmsgfdiArrayf2[] = { tabmsgfdi.fdiit };
    ForeignKey tabmsgfdiArrayfk[] = { 
      new ForeignKey(tabmsgestado,tabmsgfdiArrayf1),
      new ForeignKey(tabincidencias,tabmsgfdiArrayf2)      
      };
    tabmsgfdi.setForeignKeys(tabmsgfdiArrayfk);
    FieldDef tabmsgafiArrayf1[] = { tabmsgafi.afimsgestado };
    FieldDef tabmsgafiArrayf2[] = { tabmsgafi.afiempresa,tabmsgafi.afitrabajador,tabmsgafi.afitrarelacion };
    ForeignKey tabmsgafiArrayfk[] = { 
      new ForeignKey(tabmsgestado,tabmsgafiArrayf1),
      new ForeignKey(tabtracontrato,tabmsgafiArrayf2)      
      };
    tabmsgafi.setForeignKeys(tabmsgafiArrayfk);
    FieldDef tabcnvtestArrayf1[] = { tabcnvtest.tesruta,tabcnvtest.tesempresagyc };
    ForeignKey tabcnvtestArrayfk[] = { 
      new ForeignKey(tabconversion,tabcnvtestArrayf1)      
      };
    tabcnvtest.setForeignKeys(tabcnvtestArrayfk);
    FieldDef tabcnvtestdetArrayf1[] = { tabcnvtestdet.tedruta,tabcnvtestdet.tedempresagyc,tabcnvtestdet.tedtrabajador,tabcnvtestdet.tedejercicio,tabcnvtestdet.tedperiodo,tabcnvtestdet.tedproceso };
    ForeignKey tabcnvtestdetArrayfk[] = { 
      new ForeignKey(tabcnvtest,tabcnvtestdetArrayf1)      
      };
    tabcnvtestdet.setForeignKeys(tabcnvtestdetArrayfk);
    FieldDef tabcnvtc1detArrayf1[] = { tabcnvtc1det.ctdindice };
    ForeignKey tabcnvtc1detArrayfk[] = { 
      new ForeignKey(tabcnvtc1cab,tabcnvtc1detArrayf1)      
      };
    tabcnvtc1det.setForeignKeys(tabcnvtc1detArrayfk);
    FieldDef tabdefdircolArrayf1[] = { tabdefdircol.ddodiario };
    ForeignKey tabdefdircolArrayfk[] = { 
      new ForeignKey(tabdefdircab,tabdefdircolArrayf1)      
      };
    tabdefdircol.setForeignKeys(tabdefdircolArrayfk);
    FieldDef tabdefdirconArrayf1[] = { tabdefdircon.ddndiario,tabdefdircon.ddncolumna };
    ForeignKey tabdefdirconArrayfk[] = { 
      new ForeignKey(tabdefdircol,tabdefdirconArrayf1)      
      };
    tabdefdircon.setForeignKeys(tabdefdirconArrayfk);
    FieldDef tabtc18Arrayf1[] = { tabtc18.tc8empresa };
    FieldDef tabtc18Arrayf2[] = { tabtc18.tc8msgestcod };
    FieldDef tabtc18Arrayf3[] = { tabtc18.tc8empresa,tabtc18.tc8centro };
    ForeignKey tabtc18Arrayfk[] = { 
      new ForeignKey(tabempresa,tabtc18Arrayf1),
      new ForeignKey(tabmsgestado,tabtc18Arrayf2),
      new ForeignKey(tabcentros,tabtc18Arrayf3)      
      };
    tabtc18.setForeignKeys(tabtc18Arrayfk);
    FieldDef tabtc119Arrayf1[] = { tabtc119.tc119empresa };
    FieldDef tabtc119Arrayf2[] = { tabtc119.tc119msgestcod };
    FieldDef tabtc119Arrayf3[] = { tabtc119.tc119empresa,tabtc119.tc119centro };
    ForeignKey tabtc119Arrayfk[] = { 
      new ForeignKey(tabempresa,tabtc119Arrayf1),
      new ForeignKey(tabmsgestado,tabtc119Arrayf2),
      new ForeignKey(tabcentros,tabtc119Arrayf3)      
      };
    tabtc119.setForeignKeys(tabtc119Arrayfk);
    FieldDef tabtc13Arrayf1[] = { tabtc13.tc3empresa };
    FieldDef tabtc13Arrayf2[] = { tabtc13.tc3msgestcod };
    FieldDef tabtc13Arrayf3[] = { tabtc13.tc3empresa,tabtc13.tc3centro };
    ForeignKey tabtc13Arrayfk[] = { 
      new ForeignKey(tabempresa,tabtc13Arrayf1),
      new ForeignKey(tabmsgestado,tabtc13Arrayf2),
      new ForeignKey(tabcentros,tabtc13Arrayf3)      
      };
    tabtc13.setForeignKeys(tabtc13Arrayfk);
    FieldDef tabtc16cabArrayf1[] = { tabtc16cab.t16empresa };
    FieldDef tabtc16cabArrayf2[] = { tabtc16cab.t16msgestcod };
    FieldDef tabtc16cabArrayf3[] = { tabtc16cab.t16empresa,tabtc16cab.t16centro };
    ForeignKey tabtc16cabArrayfk[] = { 
      new ForeignKey(tabempresa,tabtc16cabArrayf1),
      new ForeignKey(tabmsgestado,tabtc16cabArrayf2),
      new ForeignKey(tabcentros,tabtc16cabArrayf3)      
      };
    tabtc16cab.setForeignKeys(tabtc16cabArrayfk);
    FieldDef tabtc16detArrayf1[] = { tabtc16det.d16codigo };
    ForeignKey tabtc16detArrayfk[] = { 
      new ForeignKey(tabtc16cab,tabtc16detArrayf1)      
      };
    tabtc16det.setForeignKeys(tabtc16detArrayfk);
    FieldDef tabtracontrataArrayf1[] = { tabtracontrata.cnacodiemp,tabtracontrata.cnacodigo,tabtracontrata.cnarelacion };
    ForeignKey tabtracontrataArrayfk[] = { 
      new ForeignKey(tabtracontrato,tabtracontrataArrayf1)      
      };
    tabtracontrata.setForeignKeys(tabtracontrataArrayfk);
    FieldDef tabpartesArrayf1[] = { tabpartes.parcodiemp };
    FieldDef tabpartesArrayf2[] = { tabpartes.parcodiemp,tabpartes.partrabajador };
    FieldDef tabpartesArrayf3[] = { tabpartes.parcodinciden };
    ForeignKey tabpartesArrayfk[] = { 
      new ForeignKey(tabempresa,tabpartesArrayf1),
      new ForeignKey(tabtrabajador,tabpartesArrayf2),
      new ForeignKey(tabincidencias,tabpartesArrayf3)      
      };
    tabpartes.setForeignKeys(tabpartesArrayfk);
    FieldDef tabhistextosArrayf1[] = { tabhistextos.htxcalculo };
    ForeignKey tabhistextosArrayfk[] = { 
      new ForeignKey(tabhisperso,tabhistextosArrayf1)      
      };
    tabhistextos.setForeignKeys(tabhistextosArrayfk);
    FieldDef tabxisretriArrayf1[] = { tabxisretri.xisrempresa };
    FieldDef tabxisretriArrayf2[] = { tabxisretri.xisrinciden };
    FieldDef tabxisretriArrayf3[] = { tabxisretri.xisrcalculo };
    FieldDef tabxisretriArrayf4[] = { tabxisretri.xisrempresa,tabxisretri.xisrtrabajador };
    ForeignKey tabxisretriArrayfk[] = { 
      new ForeignKey(tabempresa,tabxisretriArrayf1),
      new ForeignKey(tabxisinciden,tabxisretriArrayf2),
      new ForeignKey(tabxisperso,tabxisretriArrayf3),
      new ForeignKey(tabtrabajador,tabxisretriArrayf4)      
      };
    tabxisretri.setForeignKeys(tabxisretriArrayfk);
    FieldDef tabxisdeducArrayf1[] = { tabxisdeduc.xisdempresa };
    FieldDef tabxisdeducArrayf2[] = { tabxisdeduc.xisdcalculo };
    FieldDef tabxisdeducArrayf3[] = { tabxisdeduc.xisdempresa,tabxisdeduc.xisdtrabajador };
    FieldDef tabxisdeducArrayf4[] = { tabxisdeduc.xisdinciden };
    ForeignKey tabxisdeducArrayfk[] = { 
      new ForeignKey(tabempresa,tabxisdeducArrayf1),
      new ForeignKey(tabxisperso,tabxisdeducArrayf2),
      new ForeignKey(tabtrabajador,tabxisdeducArrayf3),
      new ForeignKey(tabxisinciden,tabxisdeducArrayf4)      
      };
    tabxisdeduc.setForeignKeys(tabxisdeducArrayfk);
    FieldDef tabxiscostesArrayf1[] = { tabxiscostes.xiscempresa };
    FieldDef tabxiscostesArrayf2[] = { tabxiscostes.xisccalculo };
    FieldDef tabxiscostesArrayf3[] = { tabxiscostes.xiscempresa,tabxiscostes.xisctrabajador };
    FieldDef tabxiscostesArrayf4[] = { tabxiscostes.xiscdeduc };
    ForeignKey tabxiscostesArrayfk[] = { 
      new ForeignKey(tabempresa,tabxiscostesArrayf1),
      new ForeignKey(tabxisperso,tabxiscostesArrayf2),
      new ForeignKey(tabtrabajador,tabxiscostesArrayf3),
      new ForeignKey(tabxisdeduc,tabxiscostesArrayf4)      
      };
    tabxiscostes.setForeignKeys(tabxiscostesArrayfk);
    FieldDef tabxisincidenArrayf1[] = { tabxisinciden.xisicodiemp };
    FieldDef tabxisincidenArrayf2[] = { tabxisinciden.xisicalculo };
    FieldDef tabxisincidenArrayf3[] = { tabxisinciden.xisicodiemp,tabxisinciden.xisicentro };
    FieldDef tabxisincidenArrayf4[] = { tabxisinciden.xisicodiemp,tabxisinciden.xisitrabajador };
    ForeignKey tabxisincidenArrayfk[] = { 
      new ForeignKey(tabempresa,tabxisincidenArrayf1),
      new ForeignKey(tabxisperso,tabxisincidenArrayf2),
      new ForeignKey(tabcentros,tabxisincidenArrayf3),
      new ForeignKey(tabtrabajador,tabxisincidenArrayf4)      
      };
    tabxisinciden.setForeignKeys(tabxisincidenArrayfk);
    FieldDef tabxispersoArrayf1[] = { tabxisperso.xispcodiemp };
    FieldDef tabxispersoArrayf2[] = { tabxisperso.xispcodiemp,tabxisperso.xispcentro };
    FieldDef tabxispersoArrayf3[] = { tabxisperso.xispcodiemp,tabxisperso.xisptrabajador };
    ForeignKey tabxispersoArrayfk[] = { 
      new ForeignKey(tabempresa,tabxispersoArrayf1),
      new ForeignKey(tabcentros,tabxispersoArrayf2),
      new ForeignKey(tabtrabajador,tabxispersoArrayf3)      
      };
    tabxisperso.setForeignKeys(tabxispersoArrayfk);
    FieldDef tabhisprorratasArrayf1[] = { tabhisprorratas.hisprcodiemp };
    FieldDef tabhisprorratasArrayf2[] = { tabhisprorratas.hisprcalculo };
    FieldDef tabhisprorratasArrayf3[] = { tabhisprorratas.hisprcodiemp,tabhisprorratas.hisprtrabajador };
    ForeignKey tabhisprorratasArrayfk[] = { 
      new ForeignKey(tabempresa,tabhisprorratasArrayf1),
      new ForeignKey(tabhisperso,tabhisprorratasArrayf2),
      new ForeignKey(tabtrabajador,tabhisprorratasArrayf3)      
      };
    tabhisprorratas.setForeignKeys(tabhisprorratasArrayfk);
    FieldDef tabxisprorratasArrayf1[] = { tabxisprorratas.xisprcodiemp };
    FieldDef tabxisprorratasArrayf2[] = { tabxisprorratas.xisprcalculo };
    FieldDef tabxisprorratasArrayf3[] = { tabxisprorratas.xisprcodiemp,tabxisprorratas.xisprtrabajador };
    ForeignKey tabxisprorratasArrayfk[] = { 
      new ForeignKey(tabempresa,tabxisprorratasArrayf1),
      new ForeignKey(tabxisperso,tabxisprorratasArrayf2),
      new ForeignKey(tabtrabajador,tabxisprorratasArrayf3)      
      };
    tabxisprorratas.setForeignKeys(tabxisprorratasArrayfk);
    FieldDef tabuserseportemArrayf1[] = { tabuserseportem.porcodiemp };
    FieldDef tabuserseportemArrayf2[] = { tabuserseportem.porcodiemp,tabuserseportem.porcodigo };
    ForeignKey tabuserseportemArrayfk[] = { 
      new ForeignKey(tabempresa,tabuserseportemArrayf1),
      new ForeignKey(tabtrabajador,tabuserseportemArrayf2)      
      };
    tabuserseportem.setForeignKeys(tabuserseportemArrayfk);
    FieldDef tabdefctadetArrayf1[] = { tabdefctadet.dcecodigo,tabdefctadet.dcecodasiento };
    ForeignKey tabdefctadetArrayfk[] = { 
      new ForeignKey(tabdefctacab,tabdefctadetArrayf1)      
      };
    tabdefctadet.setForeignKeys(tabdefctadetArrayfk);
    FieldDef tabdefctaconArrayf1[] = { tabdefctacon.dcocodigo,tabdefctacon.dcocodasiento,tabdefctacon.dcolinia };
    ForeignKey tabdefctaconArrayfk[] = { 
      new ForeignKey(tabdefctadet,tabdefctaconArrayf1)      
      };
    tabdefctacon.setForeignKeys(tabdefctaconArrayfk);
    }
  }
  
