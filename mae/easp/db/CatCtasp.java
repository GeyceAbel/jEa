// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20111110
// Hora:             18:26:06
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
public class CatCtasp extends Catalog
  {
  // Tablas
  public TabGycauto tabgycauto;
  public TabParamlis tabparamlis;
  public TabDiarios tabdiarios;
  public TabIrpf tabirpf;
  public TabIva tabiva;
  public TabConceptos tabconceptos;
  public TabParametros tabparametros;
  public TabInciden tabinciden;
  public TabBdejer tabbdejer;
  public TabVtoscond tabvtoscond;
  public TabEstructura tabestructura;
  public TabPcepigrafe tabpcepigrafe;
  public TabPcgrupos tabpcgrupos;
  public TabEmpresa tabempresa;
  public TabEjercicio tabejercicio;
  public TabDepartamentos tabdepartamentos;
  public TabProyectos tabproyectos;
  public TabActividades tabactividades;
  public TabSeries tabseries;
  public TabPrefijos tabprefijos;
  public TabPcuentas tabpcuentas;
  public TabPcacumulados tabpcacumulados;
  public TabPresupuesto tabpresupuesto;
  public TabEspeciales tabespeciales;
  public TabPcinmov tabpcinmov;
  public TabPcmoranual tabpcmoranual;
  public TabPclocales tabpclocales;
  public TabRatiosc tabratiosc;
  public TabRatiosl tabratiosl;
  public TabTipcabecera tabtipcabecera;
  public TabTiplineas tabtiplineas;
  public TabTipbases tabtipbases;
  public TabAsientos tabasientos;
  public TabCobropago tabcobropago;
  public TabIvacabecera tabivacabecera;
  public TabIvalineas tabivalineas;
  public TabImportcab tabimportcab;
  public TabImportlin tabimportlin;
  public TabTempbalan tabtempbalan;
  public TabTempdescua tabtempdescua;
  public TabTarea tabtarea;
  public TabTareadet tabtareadet;
  public TabTareas tabtareas;
  public TabPerasiento tabperasiento;
  public TabPerlineas tabperlineas;
  public TabPerciva tabperciva;
  public TabPerliva tabperliva;
  public TabAyudatxt tabayudatxt;
  public TabImportdef tabimportdef;
  public TabImportdet tabimportdet;
  public TabImpasientos tabimpasientos;
  public TabImpivacab tabimpivacab;
  public TabImpivalineas tabimpivalineas;
  public TabBds tabbds;
  public TabInfcabecera tabinfcabecera;
  public TabInfcolumnas tabinfcolumnas;
  public TabInfoperacion tabinfoperacion;
  public TabNpgequival tabnpgequival;
  public TabNpgcuenta tabnpgcuenta;
  public TabNpgestruct tabnpgestruct;
  public TabNpgepigraf tabnpgepigraf;
  public TabTablaequival tabtablaequival;
  public TabNotas tabnotas;
  public TabCuentanota tabcuentanota;
  public TabEstadoflujo tabestadoflujo;
  public TabCambiospat tabcambiospat;
  public TabEstcampat tabestcampat;
  public TabCalendario tabcalendario;
  public TabCalendariodet tabcalendariodet;
  public TabAcum347 tabacum347;
  public TabAcum130 tabacum130;
  public TabSocis130 tabsocis130;
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
    
  public class TabParamlis extends TableDef
    {
    // Campos
    public FieldDef pardominio;
    public FieldDef parusuario;
    public FieldDef parprograma;
    public FieldDef paropcion;
    public FieldDef parcampoa1;
    public FieldDef parcampoa2;
    public FieldDef parcampoa3;
    public FieldDef parcampoa4;
    public FieldDef parcampoa5;
    public FieldDef parcampoa6;
    public FieldDef parcampoa7;
    public FieldDef parcampoa8;
    public FieldDef parcampoa9;
    public FieldDef parcampoa10;
    public FieldDef parcampoa11;
    public FieldDef parcampoa12;
    public FieldDef parcampoa13;
    public FieldDef parcampoa14;
    public FieldDef parcampoa15;
    public FieldDef parcampoa16;
    public FieldDef parcampoa17;
    public FieldDef parcampoa18;
    public FieldDef parcampoa19;
    public FieldDef parcampoa20;
    public FieldDef parcampoi21;
    public FieldDef parcampoi22;
    public FieldDef parcampoi23;
    public FieldDef parcampoi24;
    public FieldDef parcampoi25;
    public FieldDef parcampoi26;
    public FieldDef parcampoi27;
    public FieldDef parcampoi28;
    public FieldDef parcampoi29;
    public FieldDef parcampoi30;
    public FieldDef parcampoi31;
    public FieldDef parcampoi32;
    public FieldDef parcampoi33;
    public FieldDef parcampoi34;
    public FieldDef parcampoi35;
    public FieldDef parcampoi36;
    public FieldDef parcampoi37;
    public FieldDef parcampoi38;
    public FieldDef parcampoi39;
    public FieldDef parcampoi40;
    public FieldDef parcampon41;
    public FieldDef parcampon42;
    public FieldDef parcampon43;
    public FieldDef parcampon44;
    public FieldDef parcampon45;
    public FieldDef parcampon46;
    public FieldDef parcampon47;
    public FieldDef parcampon48;
    public FieldDef parcampon49;
    public FieldDef parcampon50;
    public FieldDef parcampod51;
    public FieldDef parcampod52;
    public FieldDef parcampod53;
    public FieldDef parcampod54;
    public FieldDef parcampod55;
    public FieldDef parcampod56;
    public FieldDef parcampod57;
    public FieldDef parcampod58;
    public FieldDef parcampod59;
    public FieldDef parcampod60;
    public FieldDef parcampoa61;
    public TabParamlis(String name)
      {
      super(name);
      pardominio = new FieldDef("pardominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      parusuario = new FieldDef("parusuario",FieldDef.CHAR,25,FieldDef.NOTNULL);
      parprograma = new FieldDef("parprograma",FieldDef.CHAR,15,FieldDef.NOTNULL);
      paropcion = new FieldDef("paropcion",FieldDef.CHAR,2,FieldDef.NOTNULL);
      parcampoa1 = new FieldDef("parcampoa1",FieldDef.CHAR,30);
      parcampoa2 = new FieldDef("parcampoa2",FieldDef.CHAR,30);
      parcampoa3 = new FieldDef("parcampoa3",FieldDef.CHAR,30);
      parcampoa4 = new FieldDef("parcampoa4",FieldDef.CHAR,30);
      parcampoa5 = new FieldDef("parcampoa5",FieldDef.CHAR,30);
      parcampoa6 = new FieldDef("parcampoa6",FieldDef.CHAR,30);
      parcampoa7 = new FieldDef("parcampoa7",FieldDef.CHAR,30);
      parcampoa8 = new FieldDef("parcampoa8",FieldDef.CHAR,30);
      parcampoa9 = new FieldDef("parcampoa9",FieldDef.CHAR,30);
      parcampoa10 = new FieldDef("parcampoa10",FieldDef.CHAR,30);
      parcampoa11 = new FieldDef("parcampoa11",FieldDef.CHAR,30);
      parcampoa12 = new FieldDef("parcampoa12",FieldDef.CHAR,30);
      parcampoa13 = new FieldDef("parcampoa13",FieldDef.CHAR,30);
      parcampoa14 = new FieldDef("parcampoa14",FieldDef.CHAR,30);
      parcampoa15 = new FieldDef("parcampoa15",FieldDef.CHAR,30);
      parcampoa16 = new FieldDef("parcampoa16",FieldDef.CHAR,30);
      parcampoa17 = new FieldDef("parcampoa17",FieldDef.CHAR,30);
      parcampoa18 = new FieldDef("parcampoa18",FieldDef.CHAR,30);
      parcampoa19 = new FieldDef("parcampoa19",FieldDef.CHAR,30);
      parcampoa20 = new FieldDef("parcampoa20",FieldDef.CHAR,30);
      parcampoi21 = new FieldDef("parcampoi21",FieldDef.INTEGER,0);
      parcampoi22 = new FieldDef("parcampoi22",FieldDef.INTEGER,0);
      parcampoi23 = new FieldDef("parcampoi23",FieldDef.INTEGER,0);
      parcampoi24 = new FieldDef("parcampoi24",FieldDef.INTEGER,0);
      parcampoi25 = new FieldDef("parcampoi25",FieldDef.INTEGER,0);
      parcampoi26 = new FieldDef("parcampoi26",FieldDef.INTEGER,0);
      parcampoi27 = new FieldDef("parcampoi27",FieldDef.INTEGER,0);
      parcampoi28 = new FieldDef("parcampoi28",FieldDef.INTEGER,0);
      parcampoi29 = new FieldDef("parcampoi29",FieldDef.INTEGER,0);
      parcampoi30 = new FieldDef("parcampoi30",FieldDef.INTEGER,0);
      parcampoi31 = new FieldDef("parcampoi31",FieldDef.INTEGER,0);
      parcampoi32 = new FieldDef("parcampoi32",FieldDef.INTEGER,0);
      parcampoi33 = new FieldDef("parcampoi33",FieldDef.INTEGER,0);
      parcampoi34 = new FieldDef("parcampoi34",FieldDef.INTEGER,0);
      parcampoi35 = new FieldDef("parcampoi35",FieldDef.INTEGER,0);
      parcampoi36 = new FieldDef("parcampoi36",FieldDef.INTEGER,0);
      parcampoi37 = new FieldDef("parcampoi37",FieldDef.INTEGER,0);
      parcampoi38 = new FieldDef("parcampoi38",FieldDef.INTEGER,0);
      parcampoi39 = new FieldDef("parcampoi39",FieldDef.INTEGER,0);
      parcampoi40 = new FieldDef("parcampoi40",FieldDef.INTEGER,0);
      parcampon41 = new FieldDef("parcampon41",FieldDef.FLOAT,6,0);
      parcampon42 = new FieldDef("parcampon42",FieldDef.FLOAT,6,0);
      parcampon43 = new FieldDef("parcampon43",FieldDef.FLOAT,6,0);
      parcampon44 = new FieldDef("parcampon44",FieldDef.FLOAT,6,0);
      parcampon45 = new FieldDef("parcampon45",FieldDef.FLOAT,6,0);
      parcampon46 = new FieldDef("parcampon46",FieldDef.FLOAT,6,0);
      parcampon47 = new FieldDef("parcampon47",FieldDef.FLOAT,6,0);
      parcampon48 = new FieldDef("parcampon48",FieldDef.FLOAT,6,0);
      parcampon49 = new FieldDef("parcampon49",FieldDef.FLOAT,6,0);
      parcampon50 = new FieldDef("parcampon50",FieldDef.FLOAT,6,0);
      parcampod51 = new FieldDef("parcampod51",FieldDef.DATE);
      parcampod52 = new FieldDef("parcampod52",FieldDef.DATE);
      parcampod53 = new FieldDef("parcampod53",FieldDef.DATE);
      parcampod54 = new FieldDef("parcampod54",FieldDef.DATE);
      parcampod55 = new FieldDef("parcampod55",FieldDef.DATE);
      parcampod56 = new FieldDef("parcampod56",FieldDef.DATE);
      parcampod57 = new FieldDef("parcampod57",FieldDef.DATE);
      parcampod58 = new FieldDef("parcampod58",FieldDef.DATE);
      parcampod59 = new FieldDef("parcampod59",FieldDef.DATE);
      parcampod60 = new FieldDef("parcampod60",FieldDef.DATE);
      parcampoa61 = new FieldDef("parcampoa61",FieldDef.CHAR,100);
      FieldDef array[] = {
        pardominio,
        parusuario,
        parprograma,
        paropcion,
        parcampoa1,
        parcampoa2,
        parcampoa3,
        parcampoa4,
        parcampoa5,
        parcampoa6,
        parcampoa7,
        parcampoa8,
        parcampoa9,
        parcampoa10,
        parcampoa11,
        parcampoa12,
        parcampoa13,
        parcampoa14,
        parcampoa15,
        parcampoa16,
        parcampoa17,
        parcampoa18,
        parcampoa19,
        parcampoa20,
        parcampoi21,
        parcampoi22,
        parcampoi23,
        parcampoi24,
        parcampoi25,
        parcampoi26,
        parcampoi27,
        parcampoi28,
        parcampoi29,
        parcampoi30,
        parcampoi31,
        parcampoi32,
        parcampoi33,
        parcampoi34,
        parcampoi35,
        parcampoi36,
        parcampoi37,
        parcampoi38,
        parcampoi39,
        parcampoi40,
        parcampon41,
        parcampon42,
        parcampon43,
        parcampon44,
        parcampon45,
        parcampon46,
        parcampon47,
        parcampon48,
        parcampon49,
        parcampon50,
        parcampod51,
        parcampod52,
        parcampod53,
        parcampod54,
        parcampod55,
        parcampod56,
        parcampod57,
        parcampod58,
        parcampod59,
        parcampod60,
        parcampoa61        
        };
      setColumns(array);
      FieldDef arrayf[] = {pardominio,parusuario,parprograma,paropcion };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDiarios extends TableDef
    {
    // Campos
    public FieldDef diacodigo;
    public FieldDef diadesc;
    public TabDiarios(String name)
      {
      super(name);
      diacodigo = new FieldDef("diacodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      diadesc = new FieldDef("diadesc",FieldDef.CHAR,30);
      FieldDef array[] = {
        diacodigo,
        diadesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {diacodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabIrpf extends TableDef
    {
    // Campos
    public FieldDef irpcodigo;
    public FieldDef irpporcen;
    public TabIrpf(String name)
      {
      super(name);
      irpcodigo = new FieldDef("irpcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      irpporcen = new FieldDef("irpporcen",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        irpcodigo,
        irpporcen        
        };
      setColumns(array);
      FieldDef arrayf[] = {irpcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabIva extends TableDef
    {
    // Campos
    public FieldDef ivacodigo;
    public FieldDef ivatipo;
    public FieldDef ivaiva;
    public FieldDef ivarec;
    public TabIva(String name)
      {
      super(name);
      ivacodigo = new FieldDef("ivacodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ivatipo = new FieldDef("ivatipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      ivaiva = new FieldDef("ivaiva",FieldDef.FLOAT,6,0);
      ivarec = new FieldDef("ivarec",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ivacodigo,
        ivatipo,
        ivaiva,
        ivarec        
        };
      setColumns(array);
      FieldDef arrayf[] = {ivacodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabConceptos extends TableDef
    {
    // Campos
    public FieldDef concodigo;
    public FieldDef condesc;
    public TabConceptos(String name)
      {
      super(name);
      concodigo = new FieldDef("concodigo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      condesc = new FieldDef("condesc",FieldDef.CHAR,30,FieldDef.NOTNULL);
      FieldDef array[] = {
        concodigo,
        condesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {concodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabParametros extends TableDef
    {
    // Campos
    public FieldDef parejer;
    public FieldDef parlim1;
    public FieldDef parlim2;
    public FieldDef parlim3;
    public TabParametros(String name)
      {
      super(name);
      parejer = new FieldDef("parejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      parlim1 = new FieldDef("parlim1",FieldDef.FLOAT,6,0);
      parlim2 = new FieldDef("parlim2",FieldDef.FLOAT,6,0);
      parlim3 = new FieldDef("parlim3",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        parejer,
        parlim1,
        parlim2,
        parlim3        
        };
      setColumns(array);
      FieldDef arrayf[] = {parejer };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabInciden extends TableDef
    {
    // Campos
    public FieldDef inccodigo;
    public FieldDef incusuario;
    public FieldDef incaplicacion;
    public FieldDef incprograma;
    public FieldDef incfecha;
    public FieldDef incdesc;
    public TabInciden(String name)
      {
      super(name);
      inccodigo = new FieldDef("inccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      incusuario = new FieldDef("incusuario",FieldDef.CHAR,20,FieldDef.NOTNULL);
      incaplicacion = new FieldDef("incaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      incprograma = new FieldDef("incprograma",FieldDef.CHAR,15,FieldDef.NOTNULL);
      incfecha = new FieldDef("incfecha",FieldDef.DATE,FieldDef.NOTNULL);
      incdesc = new FieldDef("incdesc",FieldDef.CHAR,200);
      FieldDef array[] = {
        inccodigo,
        incusuario,
        incaplicacion,
        incprograma,
        incfecha,
        incdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {inccodigo };
      setPrimaryKeys(arrayf);
      inccodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabBdejer extends TableDef
    {
    // Campos
    public FieldDef bdeejer;
    public FieldDef bdeestado;
    public FieldDef bdenombre;
    public TabBdejer(String name)
      {
      super(name);
      bdeejer = new FieldDef("bdeejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bdeestado = new FieldDef("bdeestado",FieldDef.CHAR,1);
      bdenombre = new FieldDef("bdenombre",FieldDef.CHAR,80);
      FieldDef array[] = {
        bdeejer,
        bdeestado,
        bdenombre        
        };
      setColumns(array);
      FieldDef arrayf[] = {bdeejer };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabVtoscond extends TableDef
    {
    // Campos
    public FieldDef vtocodigo;
    public FieldDef vtodesc;
    public FieldDef vtodias1;
    public FieldDef vtodias2;
    public FieldDef vtodias3;
    public FieldDef vtodias4;
    public FieldDef vtodias5;
    public FieldDef vtodias6;
    public TabVtoscond(String name)
      {
      super(name);
      vtocodigo = new FieldDef("vtocodigo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      vtodesc = new FieldDef("vtodesc",FieldDef.CHAR,30);
      vtodias1 = new FieldDef("vtodias1",FieldDef.INTEGER,0);
      vtodias2 = new FieldDef("vtodias2",FieldDef.INTEGER,0);
      vtodias3 = new FieldDef("vtodias3",FieldDef.INTEGER,0);
      vtodias4 = new FieldDef("vtodias4",FieldDef.INTEGER,0);
      vtodias5 = new FieldDef("vtodias5",FieldDef.INTEGER,0);
      vtodias6 = new FieldDef("vtodias6",FieldDef.INTEGER,0);
      FieldDef array[] = {
        vtocodigo,
        vtodesc,
        vtodias1,
        vtodias2,
        vtodias3,
        vtodias4,
        vtodias5,
        vtodias6        
        };
      setColumns(array);
      FieldDef arrayf[] = {vtocodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEstructura extends TableDef
    {
    // Campos
    public FieldDef estcodigo;
    public FieldDef estelemento;
    public FieldDef estpertenece;
    public FieldDef esttipo;
    public FieldDef estacumula;
    public TabEstructura(String name)
      {
      super(name);
      estcodigo = new FieldDef("estcodigo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      estelemento = new FieldDef("estelemento",FieldDef.CHAR,10,FieldDef.NOTNULL);
      estpertenece = new FieldDef("estpertenece",FieldDef.CHAR,10);
      esttipo = new FieldDef("esttipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      estacumula = new FieldDef("estacumula",FieldDef.CHAR,1);
      FieldDef array[] = {
        estcodigo,
        estelemento,
        estpertenece,
        esttipo,
        estacumula        
        };
      setColumns(array);
      FieldDef arrayind1[] = { estcodigo,estpertenece };
      Index arrayi[] = { 
        new Index("id_estpertenece",arrayind1)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {estcodigo,estelemento };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPcepigrafe extends TableDef
    {
    // Campos
    public FieldDef pceestructura;
    public FieldDef pceelemento;
    public FieldDef pcedescripcion;
    public FieldDef pcenegativo;
    public FieldDef pceimpresion;
    public FieldDef pceident;
    public FieldDef pceformula;
    public FieldDef pcedesglose;
    public TabPcepigrafe(String name)
      {
      super(name);
      pceestructura = new FieldDef("pceestructura",FieldDef.CHAR,3,FieldDef.NOTNULL);
      pceelemento = new FieldDef("pceelemento",FieldDef.CHAR,10,FieldDef.NOTNULL);
      pcedescripcion = new FieldDef("pcedescripcion",FieldDef.CHAR,60);
      pcenegativo = new FieldDef("pcenegativo",FieldDef.CHAR,1);
      pceimpresion = new FieldDef("pceimpresion",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pceident = new FieldDef("pceident",FieldDef.INTEGER,0);
      pceformula = new FieldDef("pceformula",FieldDef.CHAR,100);
      pcedesglose = new FieldDef("pcedesglose",FieldDef.CHAR,1);
      FieldDef array[] = {
        pceestructura,
        pceelemento,
        pcedescripcion,
        pcenegativo,
        pceimpresion,
        pceident,
        pceformula,
        pcedesglose        
        };
      setColumns(array);
      FieldDef arrayf[] = {pceestructura,pceelemento };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPcgrupos extends TableDef
    {
    // Campos
    public FieldDef pcgestructura;
    public FieldDef pcgcodigo;
    public FieldDef pcgdesc;
    public TabPcgrupos(String name)
      {
      super(name);
      pcgestructura = new FieldDef("pcgestructura",FieldDef.CHAR,3,FieldDef.NOTNULL);
      pcgcodigo = new FieldDef("pcgcodigo",FieldDef.CHAR,4,FieldDef.NOTNULL);
      pcgdesc = new FieldDef("pcgdesc",FieldDef.CHAR,60);
      FieldDef array[] = {
        pcgestructura,
        pcgcodigo,
        pcgdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {pcgestructura,pcgcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEmpresa extends TableDef
    {
    // Campos
    public FieldDef empcodigo;
    public FieldDef empgranemp;
    public FieldDef emprecargo;
    public FieldDef emplonsub;
    public FieldDef empobser;
    public FieldDef empivaigic;
    public FieldDef empivagral;
    public FieldDef empirpfgral;
    public FieldDef empregimen;
    public FieldDef empprogral;
    public FieldDef empproesp;
    public FieldDef empdescuadre;
    public FieldDef empestructura;
    public FieldDef empnegatius;
    public FieldDef empcuadre;
    public FieldDef empnif;
    public FieldDef emptipocta;
    public FieldDef empexporta;
    public FieldDef empcodiant;
    public FieldDef emptipifcomu;
    public FieldDef emptipif;
    public FieldDef empcnvnpg;
    public FieldDef emptipoeq;
    public FieldDef empgesfradup;
    public FieldDef empivamensual;
    public FieldDef empformapago;
    public FieldDef empprorrata;
    public FieldDef empcnae;
    public TabEmpresa(String name)
      {
      super(name);
      empcodigo = new FieldDef("empcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      empgranemp = new FieldDef("empgranemp",FieldDef.CHAR,1,FieldDef.NOTNULL);
      emprecargo = new FieldDef("emprecargo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      emplonsub = new FieldDef("emplonsub",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      empobser = new FieldDef("empobser",FieldDef.CHAR,2000);
      empivaigic = new FieldDef("empivaigic",FieldDef.CHAR,1,FieldDef.NOTNULL);
      empivagral = new FieldDef("empivagral",FieldDef.INTEGER,0);
      empirpfgral = new FieldDef("empirpfgral",FieldDef.INTEGER,0);
      empregimen = new FieldDef("empregimen",FieldDef.CHAR,2);
      empprogral = new FieldDef("empprogral",FieldDef.FLOAT,6,0);
      empproesp = new FieldDef("empproesp",FieldDef.FLOAT,6,0);
      empdescuadre = new FieldDef("empdescuadre",FieldDef.CHAR,1,FieldDef.NOTNULL);
      empestructura = new FieldDef("empestructura",FieldDef.CHAR,3,FieldDef.NOTNULL);
      empnegatius = new FieldDef("empnegatius",FieldDef.CHAR,1);
      empcuadre = new FieldDef("empcuadre",FieldDef.CHAR,1);
      empnif = new FieldDef("empnif",FieldDef.CHAR,15);
      emptipocta = new FieldDef("emptipocta",FieldDef.CHAR,1,FieldDef.NOTNULL);
      empexporta = new FieldDef("empexporta",FieldDef.CHAR,1,FieldDef.NOTNULL);
      empcodiant = new FieldDef("empcodiant",FieldDef.INTEGER,0);
      emptipifcomu = new FieldDef("emptipifcomu",FieldDef.CHAR,1);
      emptipif = new FieldDef("emptipif",FieldDef.CHAR,5);
      empcnvnpg = new FieldDef("empcnvnpg",FieldDef.CHAR,1);
      emptipoeq = new FieldDef("emptipoeq",FieldDef.CHAR,1);
      empgesfradup = new FieldDef("empgesfradup",FieldDef.CHAR,1);
      empivamensual = new FieldDef("empivamensual",FieldDef.CHAR,1);
      empformapago = new FieldDef("empformapago",FieldDef.CHAR,2);
      empprorrata = new FieldDef("empprorrata",FieldDef.CHAR,1);
      empcnae = new FieldDef("empcnae",FieldDef.CHAR,6);
      FieldDef array[] = {
        empcodigo,
        empgranemp,
        emprecargo,
        emplonsub,
        empobser,
        empivaigic,
        empivagral,
        empirpfgral,
        empregimen,
        empprogral,
        empproesp,
        empdescuadre,
        empestructura,
        empnegatius,
        empcuadre,
        empnif,
        emptipocta,
        empexporta,
        empcodiant,
        emptipifcomu,
        emptipif,
        empcnvnpg,
        emptipoeq,
        empgesfradup,
        empivamensual,
        empformapago,
        empprorrata,
        empcnae        
        };
      setColumns(array);
      FieldDef arrayind1[] = { empnif };
      Index arrayi[] = { 
        new Index("id_empnif",arrayind1)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {empcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEjercicio extends TableDef
    {
    // Campos
    public FieldDef ejeempresa;
    public FieldDef ejeejercicio;
    public FieldDef ejeasiento;
    public FieldDef ejemes;
    public FieldDef ejecierre;
    public FieldDef ejeinibal;
    public FieldDef ejefinbal;
    public FieldDef ejeiniexp;
    public FieldDef ejefinexp;
    public FieldDef ejeastoce;
    public FieldDef ejeastocc;
    public FieldDef ejeastoap;
    public FieldDef ejestatus;
    public FieldDef ejesalida;
    public TabEjercicio(String name)
      {
      super(name);
      ejeempresa = new FieldDef("ejeempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ejeejercicio = new FieldDef("ejeejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ejeasiento = new FieldDef("ejeasiento",FieldDef.INTEGER,0);
      ejemes = new FieldDef("ejemes",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ejecierre = new FieldDef("ejecierre",FieldDef.DATE);
      ejeinibal = new FieldDef("ejeinibal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ejefinbal = new FieldDef("ejefinbal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ejeiniexp = new FieldDef("ejeiniexp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ejefinexp = new FieldDef("ejefinexp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ejeastoce = new FieldDef("ejeastoce",FieldDef.INTEGER,0);
      ejeastocc = new FieldDef("ejeastocc",FieldDef.INTEGER,0);
      ejeastoap = new FieldDef("ejeastoap",FieldDef.INTEGER,0);
      ejestatus = new FieldDef("ejestatus",FieldDef.CHAR,1);
      ejesalida = new FieldDef("ejesalida",FieldDef.INTEGER,0);
      FieldDef array[] = {
        ejeempresa,
        ejeejercicio,
        ejeasiento,
        ejemes,
        ejecierre,
        ejeinibal,
        ejefinbal,
        ejeiniexp,
        ejefinexp,
        ejeastoce,
        ejeastocc,
        ejeastoap,
        ejestatus,
        ejesalida        
        };
      setColumns(array);
      FieldDef arrayf[] = {ejeempresa,ejeejercicio };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDepartamentos extends TableDef
    {
    // Campos
    public FieldDef depempresa;
    public FieldDef depdepartamento;
    public FieldDef depdesc;
    public TabDepartamentos(String name)
      {
      super(name);
      depempresa = new FieldDef("depempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      depdepartamento = new FieldDef("depdepartamento",FieldDef.CHAR,5,FieldDef.NOTNULL);
      depdesc = new FieldDef("depdesc",FieldDef.CHAR,40);
      FieldDef array[] = {
        depempresa,
        depdepartamento,
        depdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {depempresa,depdepartamento };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabProyectos extends TableDef
    {
    // Campos
    public FieldDef proempresa;
    public FieldDef proproyecto;
    public FieldDef prodesc;
    public TabProyectos(String name)
      {
      super(name);
      proempresa = new FieldDef("proempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      proproyecto = new FieldDef("proproyecto",FieldDef.CHAR,5,FieldDef.NOTNULL);
      prodesc = new FieldDef("prodesc",FieldDef.CHAR,30);
      FieldDef array[] = {
        proempresa,
        proproyecto,
        prodesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {proempresa,proproyecto };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabActividades extends TableDef
    {
    // Campos
    public FieldDef actempresa;
    public FieldDef actactividad;
    public FieldDef actclave;
    public FieldDef actepigrafe;
    public FieldDef actprincipal;
    public TabActividades(String name)
      {
      super(name);
      actempresa = new FieldDef("actempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      actactividad = new FieldDef("actactividad",FieldDef.CHAR,1,FieldDef.NOTNULL);
      actclave = new FieldDef("actclave",FieldDef.CHAR,1,FieldDef.NOTNULL);
      actepigrafe = new FieldDef("actepigrafe",FieldDef.CHAR,7);
      actprincipal = new FieldDef("actprincipal",FieldDef.CHAR,1,FieldDef.NOTNULL);
      FieldDef array[] = {
        actempresa,
        actactividad,
        actclave,
        actepigrafe,
        actprincipal        
        };
      setColumns(array);
      FieldDef arrayf[] = {actempresa,actactividad };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSeries extends TableDef
    {
    // Campos
    public FieldDef serempresa;
    public FieldDef serejercicio;
    public FieldDef serserie;
    public FieldDef seremitida;
    public FieldDef serecibida;
    public TabSeries(String name)
      {
      super(name);
      serempresa = new FieldDef("serempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      serejercicio = new FieldDef("serejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      serserie = new FieldDef("serserie",FieldDef.CHAR,2,FieldDef.NOTNULL);
      seremitida = new FieldDef("seremitida",FieldDef.INTEGER,0);
      serecibida = new FieldDef("serecibida",FieldDef.INTEGER,0);
      FieldDef array[] = {
        serempresa,
        serejercicio,
        serserie,
        seremitida,
        serecibida        
        };
      setColumns(array);
      FieldDef arrayf[] = {serempresa,serejercicio,serserie };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPrefijos extends TableDef
    {
    // Campos
    public FieldDef prfempresa;
    public FieldDef prfejercicio;
    public FieldDef prfaccion;
    public FieldDef prfprefijo1;
    public FieldDef prfprefijo2;
    public FieldDef prfprefijo3;
    public FieldDef prfprefijo4;
    public FieldDef prfprefijo5;
    public FieldDef prfprefijo6;
    public FieldDef prfprefijo7;
    public FieldDef prfprefijo8;
    public FieldDef prfprefijo9;
    public FieldDef prfprefijo10;
    public TabPrefijos(String name)
      {
      super(name);
      prfempresa = new FieldDef("prfempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      prfejercicio = new FieldDef("prfejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      prfaccion = new FieldDef("prfaccion",FieldDef.CHAR,4,FieldDef.NOTNULL);
      prfprefijo1 = new FieldDef("prfprefijo1",FieldDef.CHAR,4,FieldDef.NOTNULL);
      prfprefijo2 = new FieldDef("prfprefijo2",FieldDef.CHAR,4);
      prfprefijo3 = new FieldDef("prfprefijo3",FieldDef.CHAR,4);
      prfprefijo4 = new FieldDef("prfprefijo4",FieldDef.CHAR,4);
      prfprefijo5 = new FieldDef("prfprefijo5",FieldDef.CHAR,4);
      prfprefijo6 = new FieldDef("prfprefijo6",FieldDef.CHAR,4);
      prfprefijo7 = new FieldDef("prfprefijo7",FieldDef.CHAR,4);
      prfprefijo8 = new FieldDef("prfprefijo8",FieldDef.CHAR,4);
      prfprefijo9 = new FieldDef("prfprefijo9",FieldDef.CHAR,4);
      prfprefijo10 = new FieldDef("prfprefijo10",FieldDef.CHAR,4);
      FieldDef array[] = {
        prfempresa,
        prfejercicio,
        prfaccion,
        prfprefijo1,
        prfprefijo2,
        prfprefijo3,
        prfprefijo4,
        prfprefijo5,
        prfprefijo6,
        prfprefijo7,
        prfprefijo8,
        prfprefijo9,
        prfprefijo10        
        };
      setColumns(array);
      FieldDef arrayf[] = {prfempresa,prfejercicio,prfaccion };
      setPrimaryKeys(arrayf);
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
        pcuclave110        
        };
      setColumns(array);
      FieldDef arrayind1[] = { pcuempresa,pcunif };
      FieldDef arrayind2[] = { pcuempresa,pcudesc };
      Index arrayi[] = { 
        new Index("id_pcunif",arrayind1),
        new Index("id_pcudesc",arrayind2)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {pcuempresa,pcuejercicio,pcucuenta,pcusubcuenta };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPcacumulados extends TableDef
    {
    // Campos
    public FieldDef pcaempresa;
    public FieldDef pcaejercicio;
    public FieldDef pcacuenta;
    public FieldDef pcasubcuenta;
    public FieldDef pcatipoacum;
    public FieldDef pcadebeapert;
    public FieldDef pcahaberapert;
    public FieldDef pcadebe1;
    public FieldDef pcahaber1;
    public FieldDef pcadebe2;
    public FieldDef pcahaber2;
    public FieldDef pcadebe3;
    public FieldDef pcahaber3;
    public FieldDef pcadebe4;
    public FieldDef pcahaber4;
    public FieldDef pcadebe5;
    public FieldDef pcahaber5;
    public FieldDef pcadebe6;
    public FieldDef pcahaber6;
    public FieldDef pcadebe7;
    public FieldDef pcahaber7;
    public FieldDef pcadebe8;
    public FieldDef pcahaber8;
    public FieldDef pcadebe9;
    public FieldDef pcahaber9;
    public FieldDef pcadebe10;
    public FieldDef pcahaber10;
    public FieldDef pcadebe11;
    public FieldDef pcahaber11;
    public FieldDef pcadebe12;
    public FieldDef pcahaber12;
    public FieldDef pcadebecieejer;
    public FieldDef pcahabercieejer;
    public FieldDef pcadebeciecon;
    public FieldDef pcahaberciecon;
    public FieldDef pcaacum347;
    public FieldDef pcaacum349t1;
    public FieldDef pcaacum349t2;
    public FieldDef pcaacum349t3;
    public FieldDef pcaacum349t4;
    public TabPcacumulados(String name)
      {
      super(name);
      pcaempresa = new FieldDef("pcaempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcaejercicio = new FieldDef("pcaejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcacuenta = new FieldDef("pcacuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      pcasubcuenta = new FieldDef("pcasubcuenta",FieldDef.CHAR,12);
      pcatipoacum = new FieldDef("pcatipoacum",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pcadebeapert = new FieldDef("pcadebeapert",FieldDef.FLOAT,6,0);
      pcahaberapert = new FieldDef("pcahaberapert",FieldDef.FLOAT,6,0);
      pcadebe1 = new FieldDef("pcadebe1",FieldDef.FLOAT,6,0);
      pcahaber1 = new FieldDef("pcahaber1",FieldDef.FLOAT,6,0);
      pcadebe2 = new FieldDef("pcadebe2",FieldDef.FLOAT,6,0);
      pcahaber2 = new FieldDef("pcahaber2",FieldDef.FLOAT,6,0);
      pcadebe3 = new FieldDef("pcadebe3",FieldDef.FLOAT,6,0);
      pcahaber3 = new FieldDef("pcahaber3",FieldDef.FLOAT,6,0);
      pcadebe4 = new FieldDef("pcadebe4",FieldDef.FLOAT,6,0);
      pcahaber4 = new FieldDef("pcahaber4",FieldDef.FLOAT,6,0);
      pcadebe5 = new FieldDef("pcadebe5",FieldDef.FLOAT,6,0);
      pcahaber5 = new FieldDef("pcahaber5",FieldDef.FLOAT,6,0);
      pcadebe6 = new FieldDef("pcadebe6",FieldDef.FLOAT,6,0);
      pcahaber6 = new FieldDef("pcahaber6",FieldDef.FLOAT,6,0);
      pcadebe7 = new FieldDef("pcadebe7",FieldDef.FLOAT,6,0);
      pcahaber7 = new FieldDef("pcahaber7",FieldDef.FLOAT,6,0);
      pcadebe8 = new FieldDef("pcadebe8",FieldDef.FLOAT,6,0);
      pcahaber8 = new FieldDef("pcahaber8",FieldDef.FLOAT,6,0);
      pcadebe9 = new FieldDef("pcadebe9",FieldDef.FLOAT,6,0);
      pcahaber9 = new FieldDef("pcahaber9",FieldDef.FLOAT,6,0);
      pcadebe10 = new FieldDef("pcadebe10",FieldDef.FLOAT,6,0);
      pcahaber10 = new FieldDef("pcahaber10",FieldDef.FLOAT,6,0);
      pcadebe11 = new FieldDef("pcadebe11",FieldDef.FLOAT,6,0);
      pcahaber11 = new FieldDef("pcahaber11",FieldDef.FLOAT,6,0);
      pcadebe12 = new FieldDef("pcadebe12",FieldDef.FLOAT,6,0);
      pcahaber12 = new FieldDef("pcahaber12",FieldDef.FLOAT,6,0);
      pcadebecieejer = new FieldDef("pcadebecieejer",FieldDef.FLOAT,6,0);
      pcahabercieejer = new FieldDef("pcahabercieejer",FieldDef.FLOAT,6,0);
      pcadebeciecon = new FieldDef("pcadebeciecon",FieldDef.FLOAT,6,0);
      pcahaberciecon = new FieldDef("pcahaberciecon",FieldDef.FLOAT,6,0);
      pcaacum347 = new FieldDef("pcaacum347",FieldDef.FLOAT,6,0);
      pcaacum349t1 = new FieldDef("pcaacum349t1",FieldDef.FLOAT,6,0);
      pcaacum349t2 = new FieldDef("pcaacum349t2",FieldDef.FLOAT,6,0);
      pcaacum349t3 = new FieldDef("pcaacum349t3",FieldDef.FLOAT,6,0);
      pcaacum349t4 = new FieldDef("pcaacum349t4",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pcaempresa,
        pcaejercicio,
        pcacuenta,
        pcasubcuenta,
        pcatipoacum,
        pcadebeapert,
        pcahaberapert,
        pcadebe1,
        pcahaber1,
        pcadebe2,
        pcahaber2,
        pcadebe3,
        pcahaber3,
        pcadebe4,
        pcahaber4,
        pcadebe5,
        pcahaber5,
        pcadebe6,
        pcahaber6,
        pcadebe7,
        pcahaber7,
        pcadebe8,
        pcahaber8,
        pcadebe9,
        pcahaber9,
        pcadebe10,
        pcahaber10,
        pcadebe11,
        pcahaber11,
        pcadebe12,
        pcahaber12,
        pcadebecieejer,
        pcahabercieejer,
        pcadebeciecon,
        pcahaberciecon,
        pcaacum347,
        pcaacum349t1,
        pcaacum349t2,
        pcaacum349t3,
        pcaacum349t4        
        };
      setColumns(array);
      FieldDef arrayf[] = {pcaempresa,pcaejercicio,pcacuenta,pcasubcuenta,pcatipoacum };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPresupuesto extends TableDef
    {
    // Campos
    public FieldDef preempresa;
    public FieldDef preejercicio;
    public FieldDef precuenta;
    public FieldDef presubcuenta;
    public FieldDef presaldoant;
    public FieldDef preporc;
    public FieldDef pretotanual;
    public FieldDef premes1;
    public FieldDef premes2;
    public FieldDef premes3;
    public FieldDef premes4;
    public FieldDef premes5;
    public FieldDef premes6;
    public FieldDef premes7;
    public FieldDef premes8;
    public FieldDef premes9;
    public FieldDef premes10;
    public FieldDef premes11;
    public FieldDef premes12;
    public TabPresupuesto(String name)
      {
      super(name);
      preempresa = new FieldDef("preempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      preejercicio = new FieldDef("preejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      precuenta = new FieldDef("precuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      presubcuenta = new FieldDef("presubcuenta",FieldDef.CHAR,12);
      presaldoant = new FieldDef("presaldoant",FieldDef.FLOAT,6,0);
      preporc = new FieldDef("preporc",FieldDef.FLOAT,6,0);
      pretotanual = new FieldDef("pretotanual",FieldDef.FLOAT,6,0);
      premes1 = new FieldDef("premes1",FieldDef.FLOAT,6,0);
      premes2 = new FieldDef("premes2",FieldDef.FLOAT,6,0);
      premes3 = new FieldDef("premes3",FieldDef.FLOAT,6,0);
      premes4 = new FieldDef("premes4",FieldDef.FLOAT,6,0);
      premes5 = new FieldDef("premes5",FieldDef.FLOAT,6,0);
      premes6 = new FieldDef("premes6",FieldDef.FLOAT,6,0);
      premes7 = new FieldDef("premes7",FieldDef.FLOAT,6,0);
      premes8 = new FieldDef("premes8",FieldDef.FLOAT,6,0);
      premes9 = new FieldDef("premes9",FieldDef.FLOAT,6,0);
      premes10 = new FieldDef("premes10",FieldDef.FLOAT,6,0);
      premes11 = new FieldDef("premes11",FieldDef.FLOAT,6,0);
      premes12 = new FieldDef("premes12",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        preempresa,
        preejercicio,
        precuenta,
        presubcuenta,
        presaldoant,
        preporc,
        pretotanual,
        premes1,
        premes2,
        premes3,
        premes4,
        premes5,
        premes6,
        premes7,
        premes8,
        premes9,
        premes10,
        premes11,
        premes12        
        };
      setColumns(array);
      FieldDef arrayf[] = {preempresa,preejercicio,precuenta,presubcuenta };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEspeciales extends TableDef
    {
    // Campos
    public FieldDef espempresa;
    public FieldDef espejercicio;
    public FieldDef espcodigo;
    public FieldDef espcuenta;
    public FieldDef espsubcuenta;
    public TabEspeciales(String name)
      {
      super(name);
      espempresa = new FieldDef("espempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      espejercicio = new FieldDef("espejercicio",FieldDef.INTEGER,0);
      espcodigo = new FieldDef("espcodigo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      espcuenta = new FieldDef("espcuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      espsubcuenta = new FieldDef("espsubcuenta",FieldDef.CHAR,12);
      FieldDef array[] = {
        espempresa,
        espejercicio,
        espcodigo,
        espcuenta,
        espsubcuenta        
        };
      setColumns(array);
      FieldDef arrayf[] = {espempresa,espejercicio,espcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPcinmov extends TableDef
    {
    // Campos
    public FieldDef pcielemento;
    public FieldDef pciempresa;
    public FieldDef pciejercicio;
    public FieldDef pcicuenta;
    public FieldDef pcisubcuenta;
    public FieldDef pciarticulo;
    public FieldDef pcitipoamort;
    public FieldDef pcicodigoamor;
    public FieldDef pcidesc;
    public FieldDef pcisubctaamort;
    public FieldDef pciregistro;
    public FieldDef pcictadot;
    public FieldDef pcihoras;
    public FieldDef pcisubctadot;
    public FieldDef pcicoefapli;
    public FieldDef pcifecalta;
    public FieldDef pcifecbaja;
    public FieldDef pcictaamort;
    public FieldDef pcicoste;
    public FieldDef pciperapli;
    public FieldDef pciadquis;
    public FieldDef pcifecplan;
    public FieldDef pciunidades;
    public FieldDef pcireserva;
    public FieldDef pcinoamort;
    public FieldDef pcinuevousado;
    public FieldDef pciobser;
    public TabPcinmov(String name)
      {
      super(name);
      pcielemento = new FieldDef("pcielemento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pciempresa = new FieldDef("pciempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pciejercicio = new FieldDef("pciejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcicuenta = new FieldDef("pcicuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      pcisubcuenta = new FieldDef("pcisubcuenta",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pciarticulo = new FieldDef("pciarticulo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcitipoamort = new FieldDef("pcitipoamort",FieldDef.CHAR,3,FieldDef.NOTNULL);
      pcicodigoamor = new FieldDef("pcicodigoamor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcidesc = new FieldDef("pcidesc",FieldDef.CHAR,40);
      pcisubctaamort = new FieldDef("pcisubctaamort",FieldDef.CHAR,12);
      pciregistro = new FieldDef("pciregistro",FieldDef.CHAR,8);
      pcictadot = new FieldDef("pcictadot",FieldDef.CHAR,4);
      pcihoras = new FieldDef("pcihoras",FieldDef.FLOAT,6,0);
      pcisubctadot = new FieldDef("pcisubctadot",FieldDef.CHAR,12);
      pcicoefapli = new FieldDef("pcicoefapli",FieldDef.FLOAT,6,0);
      pcifecalta = new FieldDef("pcifecalta",FieldDef.DATE);
      pcifecbaja = new FieldDef("pcifecbaja",FieldDef.DATE);
      pcictaamort = new FieldDef("pcictaamort",FieldDef.CHAR,4);
      pcicoste = new FieldDef("pcicoste",FieldDef.FLOAT,6,0);
      pciperapli = new FieldDef("pciperapli",FieldDef.INTEGER,0);
      pciadquis = new FieldDef("pciadquis",FieldDef.FLOAT,6,0);
      pcifecplan = new FieldDef("pcifecplan",FieldDef.DATE);
      pciunidades = new FieldDef("pciunidades",FieldDef.INTEGER,0);
      pcireserva = new FieldDef("pcireserva",FieldDef.FLOAT,6,0);
      pcinoamort = new FieldDef("pcinoamort",FieldDef.FLOAT,6,0);
      pcinuevousado = new FieldDef("pcinuevousado",FieldDef.CHAR,3,FieldDef.NOTNULL);
      pciobser = new FieldDef("pciobser",FieldDef.CHAR,2000);
      FieldDef array[] = {
        pcielemento,
        pciempresa,
        pciejercicio,
        pcicuenta,
        pcisubcuenta,
        pciarticulo,
        pcitipoamort,
        pcicodigoamor,
        pcidesc,
        pcisubctaamort,
        pciregistro,
        pcictadot,
        pcihoras,
        pcisubctadot,
        pcicoefapli,
        pcifecalta,
        pcifecbaja,
        pcictaamort,
        pcicoste,
        pciperapli,
        pciadquis,
        pcifecplan,
        pciunidades,
        pcireserva,
        pcinoamort,
        pcinuevousado,
        pciobser        
        };
      setColumns(array);
      FieldDef arrayind1[] = { pciempresa,pciejercicio,pcicuenta,pcisubcuenta };
      Index arrayi[] = { 
        new Index("id_pcicuenta",arrayind1)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {pcielemento };
      setPrimaryKeys(arrayf);
      pcielemento.setAutoIncrementable(true);
      }
    }
    
  public class TabPcmoranual extends TableDef
    {
    // Campos
    public FieldDef pcmelemento;
    public FieldDef pcmamorejer;
    public FieldDef pcmtipo;
    public FieldDef pcmcoefamort;
    public FieldDef pcmamortanual;
    public FieldDef pcmamortacum;
    public FieldDef pcmamortpdte;
    public FieldDef pcmultfecha;
    public FieldDef pcmcuotaapli;
    public TabPcmoranual(String name)
      {
      super(name);
      pcmelemento = new FieldDef("pcmelemento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcmamorejer = new FieldDef("pcmamorejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcmtipo = new FieldDef("pcmtipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pcmcoefamort = new FieldDef("pcmcoefamort",FieldDef.FLOAT,6,0);
      pcmamortanual = new FieldDef("pcmamortanual",FieldDef.FLOAT,6,0);
      pcmamortacum = new FieldDef("pcmamortacum",FieldDef.FLOAT,6,0);
      pcmamortpdte = new FieldDef("pcmamortpdte",FieldDef.FLOAT,6,0);
      pcmultfecha = new FieldDef("pcmultfecha",FieldDef.DATE);
      pcmcuotaapli = new FieldDef("pcmcuotaapli",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pcmelemento,
        pcmamorejer,
        pcmtipo,
        pcmcoefamort,
        pcmamortanual,
        pcmamortacum,
        pcmamortpdte,
        pcmultfecha,
        pcmcuotaapli        
        };
      setColumns(array);
      FieldDef arrayf[] = {pcmelemento,pcmamorejer };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPclocales extends TableDef
    {
    // Campos
    public FieldDef pclempresa;
    public FieldDef pclejercicio;
    public FieldDef pclcuenta;
    public FieldDef pclsubcuenta;
    public FieldDef pclreferencia;
    public FieldDef pclsiglas;
    public FieldDef pclcalle;
    public FieldDef pclnumero;
    public FieldDef pclescalera;
    public FieldDef pclpiso;
    public FieldDef pclpuerta;
    public FieldDef pclcodimuni;
    public FieldDef pclmunicipio;
    public FieldDef pclprovincia;
    public FieldDef pclpais;
    public FieldDef pclsituacion;
    public FieldDef pcltipovia;
    public FieldDef pcltiponum;
    public FieldDef pclcalifnum;
    public FieldDef pclbloque;
    public FieldDef pclcomplem;
    public FieldDef pcllocal;
    public FieldDef pclcodpostal;
    public FieldDef pclportal2;
    public TabPclocales(String name)
      {
      super(name);
      pclempresa = new FieldDef("pclempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pclejercicio = new FieldDef("pclejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pclcuenta = new FieldDef("pclcuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      pclsubcuenta = new FieldDef("pclsubcuenta",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pclreferencia = new FieldDef("pclreferencia",FieldDef.CHAR,25);
      pclsiglas = new FieldDef("pclsiglas",FieldDef.CHAR,2);
      pclcalle = new FieldDef("pclcalle",FieldDef.CHAR,30);
      pclnumero = new FieldDef("pclnumero",FieldDef.CHAR,5);
      pclescalera = new FieldDef("pclescalera",FieldDef.CHAR,2);
      pclpiso = new FieldDef("pclpiso",FieldDef.CHAR,2);
      pclpuerta = new FieldDef("pclpuerta",FieldDef.CHAR,2);
      pclcodimuni = new FieldDef("pclcodimuni",FieldDef.INTEGER,0);
      pclmunicipio = new FieldDef("pclmunicipio",FieldDef.CHAR,25);
      pclprovincia = new FieldDef("pclprovincia",FieldDef.INTEGER,0);
      pclpais = new FieldDef("pclpais",FieldDef.INTEGER,0);
      pclsituacion = new FieldDef("pclsituacion",FieldDef.INTEGER,0);
      pcltipovia = new FieldDef("pcltipovia",FieldDef.CHAR,5);
      pcltiponum = new FieldDef("pcltiponum",FieldDef.CHAR,3);
      pclcalifnum = new FieldDef("pclcalifnum",FieldDef.CHAR,3);
      pclbloque = new FieldDef("pclbloque",FieldDef.CHAR,3);
      pclcomplem = new FieldDef("pclcomplem",FieldDef.CHAR,40);
      pcllocal = new FieldDef("pcllocal",FieldDef.CHAR,30);
      pclcodpostal = new FieldDef("pclcodpostal",FieldDef.CHAR,5);
      pclportal2 = new FieldDef("pclportal2",FieldDef.CHAR,3);
      FieldDef array[] = {
        pclempresa,
        pclejercicio,
        pclcuenta,
        pclsubcuenta,
        pclreferencia,
        pclsiglas,
        pclcalle,
        pclnumero,
        pclescalera,
        pclpiso,
        pclpuerta,
        pclcodimuni,
        pclmunicipio,
        pclprovincia,
        pclpais,
        pclsituacion,
        pcltipovia,
        pcltiponum,
        pclcalifnum,
        pclbloque,
        pclcomplem,
        pcllocal,
        pclcodpostal,
        pclportal2        
        };
      setColumns(array);
      FieldDef arrayf[] = {pclempresa,pclejercicio,pclcuenta,pclsubcuenta };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabRatiosc extends TableDef
    {
    // Campos
    public FieldDef ratcodigo;
    public FieldDef ratdesc;
    public FieldDef ratdescdiv;
    public FieldDef ratdescdis;
    public FieldDef ratideal;
    public TabRatiosc(String name)
      {
      super(name);
      ratcodigo = new FieldDef("ratcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ratdesc = new FieldDef("ratdesc",FieldDef.CHAR,40);
      ratdescdiv = new FieldDef("ratdescdiv",FieldDef.CHAR,40);
      ratdescdis = new FieldDef("ratdescdis",FieldDef.CHAR,40);
      ratideal = new FieldDef("ratideal",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ratcodigo,
        ratdesc,
        ratdescdiv,
        ratdescdis,
        ratideal        
        };
      setColumns(array);
      FieldDef arrayf[] = {ratcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabRatiosl extends TableDef
    {
    // Campos
    public FieldDef ralcodi;
    public FieldDef ralcodigo;
    public FieldDef raldivdivisor;
    public FieldDef raloperacion;
    public FieldDef ralsaldocons;
    public FieldDef rallitsalpre;
    public TabRatiosl(String name)
      {
      super(name);
      ralcodi = new FieldDef("ralcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ralcodigo = new FieldDef("ralcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      raldivdivisor = new FieldDef("raldivdivisor",FieldDef.CHAR,1,FieldDef.NOTNULL);
      raloperacion = new FieldDef("raloperacion",FieldDef.CHAR,1,FieldDef.NOTNULL);
      ralsaldocons = new FieldDef("ralsaldocons",FieldDef.CHAR,1,FieldDef.NOTNULL);
      rallitsalpre = new FieldDef("rallitsalpre",FieldDef.CHAR,10,FieldDef.NOTNULL);
      FieldDef array[] = {
        ralcodi,
        ralcodigo,
        raldivdivisor,
        raloperacion,
        ralsaldocons,
        rallitsalpre        
        };
      setColumns(array);
      FieldDef arrayind1[] = { ralcodigo };
      Index arrayi[] = { 
        new Index("id_ralcodigo",arrayind1)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {ralcodi };
      setPrimaryKeys(arrayf);
      ralcodi.setAutoIncrementable(true);
      }
    }
    
  public class TabTipcabecera extends TableDef
    {
    // Campos
    public FieldDef ticcodigo;
    public FieldDef ticdesc;
    public FieldDef ticiva;
    public FieldDef ticcobropago;
    public FieldDef tictitcuenta;
    public FieldDef ticcuenta;
    public FieldDef tictitdoc;
    public FieldDef ticdocumento;
    public FieldDef tictitdescri;
    public FieldDef ticdescri;
    public FieldDef tictitimpor;
    public FieldDef ticimporte;
    public FieldDef tictitcontra;
    public FieldDef ticcontrapa;
    public FieldDef tictitproyec;
    public FieldDef ticproyecto;
    public FieldDef tictitdepar;
    public FieldDef ticdepar;
    public FieldDef tictitivaigic;
    public FieldDef ticivaigic;
    public FieldDef tictitserie;
    public FieldDef ticserie;
    public FieldDef tictitregistro;
    public FieldDef ticregistro;
    public FieldDef tictitfecha;
    public FieldDef ticfecha;
    public FieldDef tictitdocumiva;
    public FieldDef ticdocumiva;
    public FieldDef tictitdesci;
    public FieldDef ticdesciva;
    public FieldDef tictitnifiva;
    public FieldDef ticnifiva;
    public FieldDef tictitimpfra;
    public FieldDef ticimportefra;
    public FieldDef tictitemirep;
    public FieldDef ticemirep;
    public FieldDef tictitregiva;
    public FieldDef ticregimeniva;
    public FieldDef tictitporirpf;
    public FieldDef ticporirpf;
    public FieldDef tictitimpirpf;
    public FieldDef ticimpirpf;
    public FieldDef tictitbaseir;
    public FieldDef ticbaseirpf;
    public FieldDef tictitporiva;
    public FieldDef ticporiva;
    public FieldDef tictitporrec;
    public FieldDef ticporrecargo;
    public FieldDef tictitbaseiva;
    public FieldDef ticbaseiva;
    public FieldDef tictitimpiva;
    public FieldDef ticimpiva;
    public FieldDef tictitimprec;
    public FieldDef ticimprec;
    public FieldDef tictitobra;
    public FieldDef ticobra;
    public FieldDef tictitrectif;
    public FieldDef ticrectif;
    public FieldDef tictitejerect;
    public FieldDef ticejerrect;
    public FieldDef tictita347;
    public FieldDef ticacum347;
    public FieldDef tictita349;
    public FieldDef ticacum349;
    public FieldDef tictitmedia;
    public FieldDef ticmediacion;
    public FieldDef tictitdeduc;
    public FieldDef ticdeducible;
    public FieldDef tictittrans;
    public FieldDef tictransaccion;
    public FieldDef tictitflujo;
    public FieldDef ticflujo;
    public FieldDef tictitopefec;
    public FieldDef ticopefec;
    public FieldDef tictitprorrata;
    public FieldDef ticprorrata;
    public TabTipcabecera(String name)
      {
      super(name);
      ticcodigo = new FieldDef("ticcodigo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      ticdesc = new FieldDef("ticdesc",FieldDef.CHAR,40);
      ticiva = new FieldDef("ticiva",FieldDef.CHAR,1,FieldDef.NOTNULL);
      ticcobropago = new FieldDef("ticcobropago",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitcuenta = new FieldDef("tictitcuenta",FieldDef.CHAR,40);
      ticcuenta = new FieldDef("ticcuenta",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitdoc = new FieldDef("tictitdoc",FieldDef.CHAR,40);
      ticdocumento = new FieldDef("ticdocumento",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitdescri = new FieldDef("tictitdescri",FieldDef.CHAR,40);
      ticdescri = new FieldDef("ticdescri",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitimpor = new FieldDef("tictitimpor",FieldDef.CHAR,40);
      ticimporte = new FieldDef("ticimporte",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitcontra = new FieldDef("tictitcontra",FieldDef.CHAR,40);
      ticcontrapa = new FieldDef("ticcontrapa",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitproyec = new FieldDef("tictitproyec",FieldDef.CHAR,40);
      ticproyecto = new FieldDef("ticproyecto",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitdepar = new FieldDef("tictitdepar",FieldDef.CHAR,40);
      ticdepar = new FieldDef("ticdepar",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitivaigic = new FieldDef("tictitivaigic",FieldDef.CHAR,40);
      ticivaigic = new FieldDef("ticivaigic",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitserie = new FieldDef("tictitserie",FieldDef.CHAR,40);
      ticserie = new FieldDef("ticserie",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitregistro = new FieldDef("tictitregistro",FieldDef.CHAR,40);
      ticregistro = new FieldDef("ticregistro",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitfecha = new FieldDef("tictitfecha",FieldDef.CHAR,40);
      ticfecha = new FieldDef("ticfecha",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitdocumiva = new FieldDef("tictitdocumiva",FieldDef.CHAR,40);
      ticdocumiva = new FieldDef("ticdocumiva",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitdesci = new FieldDef("tictitdesci",FieldDef.CHAR,40);
      ticdesciva = new FieldDef("ticdesciva",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitnifiva = new FieldDef("tictitnifiva",FieldDef.CHAR,40);
      ticnifiva = new FieldDef("ticnifiva",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitimpfra = new FieldDef("tictitimpfra",FieldDef.CHAR,40);
      ticimportefra = new FieldDef("ticimportefra",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitemirep = new FieldDef("tictitemirep",FieldDef.CHAR,40);
      ticemirep = new FieldDef("ticemirep",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitregiva = new FieldDef("tictitregiva",FieldDef.CHAR,40);
      ticregimeniva = new FieldDef("ticregimeniva",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitporirpf = new FieldDef("tictitporirpf",FieldDef.CHAR,40);
      ticporirpf = new FieldDef("ticporirpf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitimpirpf = new FieldDef("tictitimpirpf",FieldDef.CHAR,40);
      ticimpirpf = new FieldDef("ticimpirpf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitbaseir = new FieldDef("tictitbaseir",FieldDef.CHAR,40);
      ticbaseirpf = new FieldDef("ticbaseirpf",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitporiva = new FieldDef("tictitporiva",FieldDef.CHAR,40);
      ticporiva = new FieldDef("ticporiva",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitporrec = new FieldDef("tictitporrec",FieldDef.CHAR,40);
      ticporrecargo = new FieldDef("ticporrecargo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitbaseiva = new FieldDef("tictitbaseiva",FieldDef.CHAR,40);
      ticbaseiva = new FieldDef("ticbaseiva",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitimpiva = new FieldDef("tictitimpiva",FieldDef.CHAR,40);
      ticimpiva = new FieldDef("ticimpiva",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitimprec = new FieldDef("tictitimprec",FieldDef.CHAR,40);
      ticimprec = new FieldDef("ticimprec",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitobra = new FieldDef("tictitobra",FieldDef.CHAR,40);
      ticobra = new FieldDef("ticobra",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitrectif = new FieldDef("tictitrectif",FieldDef.CHAR,40);
      ticrectif = new FieldDef("ticrectif",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitejerect = new FieldDef("tictitejerect",FieldDef.CHAR,40);
      ticejerrect = new FieldDef("ticejerrect",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictita347 = new FieldDef("tictita347",FieldDef.CHAR,40);
      ticacum347 = new FieldDef("ticacum347",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictita349 = new FieldDef("tictita349",FieldDef.CHAR,40);
      ticacum349 = new FieldDef("ticacum349",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitmedia = new FieldDef("tictitmedia",FieldDef.CHAR,40);
      ticmediacion = new FieldDef("ticmediacion",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitdeduc = new FieldDef("tictitdeduc",FieldDef.CHAR,40);
      ticdeducible = new FieldDef("ticdeducible",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictittrans = new FieldDef("tictittrans",FieldDef.CHAR,40);
      tictransaccion = new FieldDef("tictransaccion",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tictitflujo = new FieldDef("tictitflujo",FieldDef.CHAR,40);
      ticflujo = new FieldDef("ticflujo",FieldDef.CHAR,1);
      tictitopefec = new FieldDef("tictitopefec",FieldDef.CHAR,40);
      ticopefec = new FieldDef("ticopefec",FieldDef.CHAR,1);
      tictitprorrata = new FieldDef("tictitprorrata",FieldDef.CHAR,40);
      ticprorrata = new FieldDef("ticprorrata",FieldDef.CHAR,1);
      FieldDef array[] = {
        ticcodigo,
        ticdesc,
        ticiva,
        ticcobropago,
        tictitcuenta,
        ticcuenta,
        tictitdoc,
        ticdocumento,
        tictitdescri,
        ticdescri,
        tictitimpor,
        ticimporte,
        tictitcontra,
        ticcontrapa,
        tictitproyec,
        ticproyecto,
        tictitdepar,
        ticdepar,
        tictitivaigic,
        ticivaigic,
        tictitserie,
        ticserie,
        tictitregistro,
        ticregistro,
        tictitfecha,
        ticfecha,
        tictitdocumiva,
        ticdocumiva,
        tictitdesci,
        ticdesciva,
        tictitnifiva,
        ticnifiva,
        tictitimpfra,
        ticimportefra,
        tictitemirep,
        ticemirep,
        tictitregiva,
        ticregimeniva,
        tictitporirpf,
        ticporirpf,
        tictitimpirpf,
        ticimpirpf,
        tictitbaseir,
        ticbaseirpf,
        tictitporiva,
        ticporiva,
        tictitporrec,
        ticporrecargo,
        tictitbaseiva,
        ticbaseiva,
        tictitimpiva,
        ticimpiva,
        tictitimprec,
        ticimprec,
        tictitobra,
        ticobra,
        tictitrectif,
        ticrectif,
        tictitejerect,
        ticejerrect,
        tictita347,
        ticacum347,
        tictita349,
        ticacum349,
        tictitmedia,
        ticmediacion,
        tictitdeduc,
        ticdeducible,
        tictittrans,
        tictransaccion,
        tictitflujo,
        ticflujo,
        tictitopefec,
        ticopefec,
        tictitprorrata,
        ticprorrata        
        };
      setColumns(array);
      FieldDef arrayf[] = {ticcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTiplineas extends TableDef
    {
    // Campos
    public FieldDef tilcodigo;
    public FieldDef tilnumero;
    public FieldDef tiliva;
    public FieldDef tilcobropago;
    public FieldDef tildebehaber;
    public FieldDef tilopercuenta;
    public FieldDef tilvalcuenta;
    public FieldDef tiloperdocum;
    public FieldDef tilvaldocum;
    public FieldDef tiloperdes;
    public FieldDef tilvaldes;
    public FieldDef tiloperimporte;
    public FieldDef tilvalimporte;
    public FieldDef tilopercontra;
    public FieldDef tilvalcontra;
    public FieldDef tiloperproyec;
    public FieldDef tilvalproyec;
    public FieldDef tiloperdepar;
    public FieldDef tilvaldepar;
    public FieldDef tiloperivaigic;
    public FieldDef tilvalivaigic;
    public FieldDef tiloperserie;
    public FieldDef tilvalserie;
    public FieldDef tiloperregistro;
    public FieldDef tilvalregistro;
    public FieldDef tiloperfeciva;
    public FieldDef tilvalfeciva;
    public FieldDef tiloperdociva;
    public FieldDef tilvaldociva;
    public FieldDef tiloperdesiva;
    public FieldDef tilvaldesiva;
    public FieldDef tilopernif;
    public FieldDef tilvalnif;
    public FieldDef tiloperimpfra;
    public FieldDef tilvalimpfra;
    public FieldDef tiloperemirep;
    public FieldDef tilvalemirep;
    public FieldDef tiloperregimen;
    public FieldDef tilvalregimen;
    public FieldDef tiloperporirpf;
    public FieldDef tilvalporirpf;
    public FieldDef tiloperbaseirpf;
    public FieldDef tilvalbaseirpf;
    public FieldDef tiloperimpirpf;
    public FieldDef tilvalimpirpf;
    public FieldDef tiltipoimp;
    public FieldDef tiloperflujo;
    public FieldDef tilvalflujo;
    public TabTiplineas(String name)
      {
      super(name);
      tilcodigo = new FieldDef("tilcodigo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      tilnumero = new FieldDef("tilnumero",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tiliva = new FieldDef("tiliva",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tilcobropago = new FieldDef("tilcobropago",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tildebehaber = new FieldDef("tildebehaber",FieldDef.CHAR,1);
      tilopercuenta = new FieldDef("tilopercuenta",FieldDef.CHAR,2);
      tilvalcuenta = new FieldDef("tilvalcuenta",FieldDef.CHAR,40);
      tiloperdocum = new FieldDef("tiloperdocum",FieldDef.CHAR,2);
      tilvaldocum = new FieldDef("tilvaldocum",FieldDef.CHAR,40);
      tiloperdes = new FieldDef("tiloperdes",FieldDef.CHAR,2);
      tilvaldes = new FieldDef("tilvaldes",FieldDef.CHAR,40);
      tiloperimporte = new FieldDef("tiloperimporte",FieldDef.CHAR,2);
      tilvalimporte = new FieldDef("tilvalimporte",FieldDef.CHAR,40);
      tilopercontra = new FieldDef("tilopercontra",FieldDef.CHAR,2);
      tilvalcontra = new FieldDef("tilvalcontra",FieldDef.CHAR,40);
      tiloperproyec = new FieldDef("tiloperproyec",FieldDef.CHAR,2);
      tilvalproyec = new FieldDef("tilvalproyec",FieldDef.CHAR,40);
      tiloperdepar = new FieldDef("tiloperdepar",FieldDef.CHAR,2);
      tilvaldepar = new FieldDef("tilvaldepar",FieldDef.CHAR,40);
      tiloperivaigic = new FieldDef("tiloperivaigic",FieldDef.CHAR,2);
      tilvalivaigic = new FieldDef("tilvalivaigic",FieldDef.CHAR,40);
      tiloperserie = new FieldDef("tiloperserie",FieldDef.CHAR,2);
      tilvalserie = new FieldDef("tilvalserie",FieldDef.CHAR,40);
      tiloperregistro = new FieldDef("tiloperregistro",FieldDef.CHAR,2);
      tilvalregistro = new FieldDef("tilvalregistro",FieldDef.CHAR,40);
      tiloperfeciva = new FieldDef("tiloperfeciva",FieldDef.CHAR,2);
      tilvalfeciva = new FieldDef("tilvalfeciva",FieldDef.CHAR,40);
      tiloperdociva = new FieldDef("tiloperdociva",FieldDef.CHAR,2);
      tilvaldociva = new FieldDef("tilvaldociva",FieldDef.CHAR,40);
      tiloperdesiva = new FieldDef("tiloperdesiva",FieldDef.CHAR,2);
      tilvaldesiva = new FieldDef("tilvaldesiva",FieldDef.CHAR,40);
      tilopernif = new FieldDef("tilopernif",FieldDef.CHAR,2);
      tilvalnif = new FieldDef("tilvalnif",FieldDef.CHAR,40);
      tiloperimpfra = new FieldDef("tiloperimpfra",FieldDef.CHAR,2);
      tilvalimpfra = new FieldDef("tilvalimpfra",FieldDef.CHAR,40);
      tiloperemirep = new FieldDef("tiloperemirep",FieldDef.CHAR,2);
      tilvalemirep = new FieldDef("tilvalemirep",FieldDef.CHAR,40);
      tiloperregimen = new FieldDef("tiloperregimen",FieldDef.CHAR,2);
      tilvalregimen = new FieldDef("tilvalregimen",FieldDef.CHAR,40);
      tiloperporirpf = new FieldDef("tiloperporirpf",FieldDef.CHAR,2);
      tilvalporirpf = new FieldDef("tilvalporirpf",FieldDef.CHAR,40);
      tiloperbaseirpf = new FieldDef("tiloperbaseirpf",FieldDef.CHAR,2);
      tilvalbaseirpf = new FieldDef("tilvalbaseirpf",FieldDef.CHAR,40);
      tiloperimpirpf = new FieldDef("tiloperimpirpf",FieldDef.CHAR,2);
      tilvalimpirpf = new FieldDef("tilvalimpirpf",FieldDef.CHAR,40);
      tiltipoimp = new FieldDef("tiltipoimp",FieldDef.CHAR,15);
      tiloperflujo = new FieldDef("tiloperflujo",FieldDef.CHAR,2);
      tilvalflujo = new FieldDef("tilvalflujo",FieldDef.CHAR,5);
      FieldDef array[] = {
        tilcodigo,
        tilnumero,
        tiliva,
        tilcobropago,
        tildebehaber,
        tilopercuenta,
        tilvalcuenta,
        tiloperdocum,
        tilvaldocum,
        tiloperdes,
        tilvaldes,
        tiloperimporte,
        tilvalimporte,
        tilopercontra,
        tilvalcontra,
        tiloperproyec,
        tilvalproyec,
        tiloperdepar,
        tilvaldepar,
        tiloperivaigic,
        tilvalivaigic,
        tiloperserie,
        tilvalserie,
        tiloperregistro,
        tilvalregistro,
        tiloperfeciva,
        tilvalfeciva,
        tiloperdociva,
        tilvaldociva,
        tiloperdesiva,
        tilvaldesiva,
        tilopernif,
        tilvalnif,
        tiloperimpfra,
        tilvalimpfra,
        tiloperemirep,
        tilvalemirep,
        tiloperregimen,
        tilvalregimen,
        tiloperporirpf,
        tilvalporirpf,
        tiloperbaseirpf,
        tilvalbaseirpf,
        tiloperimpirpf,
        tilvalimpirpf,
        tiltipoimp,
        tiloperflujo,
        tilvalflujo        
        };
      setColumns(array);
      FieldDef arrayf[] = {tilcodigo,tilnumero };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTipbases extends TableDef
    {
    // Campos
    public FieldDef tibcodigo;
    public FieldDef tibnumero;
    public FieldDef tibbasenum;
    public FieldDef tibopporiva;
    public FieldDef tibvalporiva;
    public FieldDef tibopporrec;
    public FieldDef tibvalporrec;
    public FieldDef tibopbaseiva;
    public FieldDef tibvalbaseiva;
    public FieldDef tibopimpiva;
    public FieldDef tibvalimpiva;
    public FieldDef tibopimprec;
    public FieldDef tibvalimprec;
    public FieldDef tibopobra;
    public FieldDef tibvalobra;
    public FieldDef tiboprectif;
    public FieldDef tibvalrectif;
    public FieldDef tibopejerec;
    public FieldDef tibvalejerec;
    public FieldDef tibopa347;
    public FieldDef tibvala347;
    public FieldDef tibopa349;
    public FieldDef tibvala349;
    public FieldDef tibopmedia;
    public FieldDef tibvalmedia;
    public FieldDef tibopdeduc;
    public FieldDef tibvaldeduc;
    public FieldDef tiboptransac;
    public FieldDef tibvaltransac;
    public FieldDef tiboperopefec;
    public FieldDef tibvalopefec;
    public FieldDef tiboperprorrata;
    public FieldDef tibvalprorrata;
    public TabTipbases(String name)
      {
      super(name);
      tibcodigo = new FieldDef("tibcodigo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      tibnumero = new FieldDef("tibnumero",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibbasenum = new FieldDef("tibbasenum",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tibopporiva = new FieldDef("tibopporiva",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvalporiva = new FieldDef("tibvalporiva",FieldDef.CHAR,40);
      tibopporrec = new FieldDef("tibopporrec",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvalporrec = new FieldDef("tibvalporrec",FieldDef.CHAR,40);
      tibopbaseiva = new FieldDef("tibopbaseiva",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvalbaseiva = new FieldDef("tibvalbaseiva",FieldDef.CHAR,40);
      tibopimpiva = new FieldDef("tibopimpiva",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvalimpiva = new FieldDef("tibvalimpiva",FieldDef.CHAR,40);
      tibopimprec = new FieldDef("tibopimprec",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvalimprec = new FieldDef("tibvalimprec",FieldDef.CHAR,40);
      tibopobra = new FieldDef("tibopobra",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvalobra = new FieldDef("tibvalobra",FieldDef.CHAR,40);
      tiboprectif = new FieldDef("tiboprectif",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvalrectif = new FieldDef("tibvalrectif",FieldDef.CHAR,40);
      tibopejerec = new FieldDef("tibopejerec",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvalejerec = new FieldDef("tibvalejerec",FieldDef.CHAR,40);
      tibopa347 = new FieldDef("tibopa347",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvala347 = new FieldDef("tibvala347",FieldDef.CHAR,40);
      tibopa349 = new FieldDef("tibopa349",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvala349 = new FieldDef("tibvala349",FieldDef.CHAR,40);
      tibopmedia = new FieldDef("tibopmedia",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvalmedia = new FieldDef("tibvalmedia",FieldDef.CHAR,40);
      tibopdeduc = new FieldDef("tibopdeduc",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvaldeduc = new FieldDef("tibvaldeduc",FieldDef.CHAR,40);
      tiboptransac = new FieldDef("tiboptransac",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tibvaltransac = new FieldDef("tibvaltransac",FieldDef.CHAR,40);
      tiboperopefec = new FieldDef("tiboperopefec",FieldDef.CHAR,2);
      tibvalopefec = new FieldDef("tibvalopefec",FieldDef.CHAR,1);
      tiboperprorrata = new FieldDef("tiboperprorrata",FieldDef.CHAR,2);
      tibvalprorrata = new FieldDef("tibvalprorrata",FieldDef.CHAR,1);
      FieldDef array[] = {
        tibcodigo,
        tibnumero,
        tibbasenum,
        tibopporiva,
        tibvalporiva,
        tibopporrec,
        tibvalporrec,
        tibopbaseiva,
        tibvalbaseiva,
        tibopimpiva,
        tibvalimpiva,
        tibopimprec,
        tibvalimprec,
        tibopobra,
        tibvalobra,
        tiboprectif,
        tibvalrectif,
        tibopejerec,
        tibvalejerec,
        tibopa347,
        tibvala347,
        tibopa349,
        tibvala349,
        tibopmedia,
        tibvalmedia,
        tibopdeduc,
        tibvaldeduc,
        tiboptransac,
        tibvaltransac,
        tiboperopefec,
        tibvalopefec,
        tiboperprorrata,
        tibvalprorrata        
        };
      setColumns(array);
      FieldDef arrayf[] = {tibcodigo,tibnumero,tibbasenum };
      setPrimaryKeys(arrayf);
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
      FieldDef arrayind1[] = { asiempresa,asiejercicio,asicuenta,asisubcuenta };
      FieldDef arrayind2[] = { asiempresa,asiejercicio,asicontraconta,asicontrasub };
      FieldDef arrayind3[] = { asiempresa,asiejercicio,asiasiento };
      FieldDef arrayind4[] = { asiempresa,asiejercicio,asifecha,asiasiento };
      FieldDef arrayind5[] = { asiempresa,asiejercicio,asidiario2,asifecha,asiasiento };
      FieldDef arrayind6[] = { asiempresa,asiejercicio,asidiario2,asiasiento };
      FieldDef arrayind7[] = { asiempresa,asiejercicio,asiproyecto };
      FieldDef arrayind8[] = { asiempresa,asiejercicio,asidepartamento };
      FieldDef arrayind9[] = { asiempresa,asiejercicio,asiimporte };
      Index arrayi[] = { 
        new Index("id_asicuenta",arrayind1),
        new Index("id_asicontraconta",arrayind2),
        new Index("id_asiasiento",arrayind3),
        new Index("id_asifecha",arrayind4),
        new Index("id_asidiario2fec",arrayind5),
        new Index("id_asidiario2asi",arrayind6),
        new Index("id_asiproyecto",arrayind7),
        new Index("id_asidepartamento",arrayind8),
        new Index("id_asiimporte",arrayind9)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {asicodi };
      setPrimaryKeys(arrayf);
      asicodi.setAutoIncrementable(true);
      }
    }
    
  public class TabCobropago extends TableDef
    {
    // Campos
    public FieldDef cobcodi;
    public FieldDef cobempresa;
    public FieldDef cobejercicio;
    public FieldDef cobcuenta;
    public FieldDef cobsubcuenta;
    public FieldDef cobasicodi;
    public FieldDef cobcobropago;
    public FieldDef cobvto;
    public FieldDef cobcuentaban;
    public FieldDef cobsubctaban;
    public FieldDef cobconcepto;
    public FieldDef cobimporte;
    public FieldDef cobestado;
    public FieldDef cobdocumento;
    public FieldDef cobtrasp;
    public TabCobropago(String name)
      {
      super(name);
      cobcodi = new FieldDef("cobcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cobempresa = new FieldDef("cobempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cobejercicio = new FieldDef("cobejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cobcuenta = new FieldDef("cobcuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      cobsubcuenta = new FieldDef("cobsubcuenta",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cobasicodi = new FieldDef("cobasicodi",FieldDef.INTEGER,0);
      cobcobropago = new FieldDef("cobcobropago",FieldDef.CHAR,1,FieldDef.NOTNULL);
      cobvto = new FieldDef("cobvto",FieldDef.DATE);
      cobcuentaban = new FieldDef("cobcuentaban",FieldDef.CHAR,4);
      cobsubctaban = new FieldDef("cobsubctaban",FieldDef.CHAR,12);
      cobconcepto = new FieldDef("cobconcepto",FieldDef.CHAR,40);
      cobimporte = new FieldDef("cobimporte",FieldDef.FLOAT,6,0);
      cobestado = new FieldDef("cobestado",FieldDef.CHAR,1,FieldDef.NOTNULL);
      cobdocumento = new FieldDef("cobdocumento",FieldDef.CHAR,10);
      cobtrasp = new FieldDef("cobtrasp",FieldDef.CHAR,1);
      FieldDef array[] = {
        cobcodi,
        cobempresa,
        cobejercicio,
        cobcuenta,
        cobsubcuenta,
        cobasicodi,
        cobcobropago,
        cobvto,
        cobcuentaban,
        cobsubctaban,
        cobconcepto,
        cobimporte,
        cobestado,
        cobdocumento,
        cobtrasp        
        };
      setColumns(array);
      FieldDef arrayind1[] = { cobempresa,cobejercicio,cobcuenta,cobsubcuenta };
      FieldDef arrayind2[] = { cobempresa,cobejercicio,cobasicodi };
      FieldDef arrayind3[] = { cobempresa,cobejercicio,cobcobropago,cobvto };
      FieldDef arrayind4[] = { cobempresa,cobejercicio,cobcuentaban,cobsubctaban };
      Index arrayi[] = { 
        new Index("id_cobcuenta",arrayind1),
        new Index("id_cobasicodi",arrayind2),
        new Index("id_cobvto",arrayind3),
        new Index("id_cobcuentaban",arrayind4)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {cobcodi };
      setPrimaryKeys(arrayf);
      cobcodi.setAutoIncrementable(true);
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
      FieldDef arrayind1[] = { civempresa,civejercicio,civemirep,civserie,civregistro };
      FieldDef arrayind2[] = { civempresa,civejercicio,civfecha };
      FieldDef arrayind3[] = { civempresa,civejercicio,civnif };
      FieldDef arrayind4[] = { civempresa,civejercicio,civserie,civregistro };
      Index arrayi[] = { 
        new Index("id_civregistro",arrayind1),
        new Index("id_civfecha",arrayind2),
        new Index("id_civnif",arrayind3),
        new Index("id_civserie",arrayind4)        
        };
      setIndexes(arrayi);
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
    
  public class TabImportcab extends TableDef
    {
    // Campos
    public FieldDef imccodigo;
    public FieldDef imcdesc;
    public FieldDef imcformato;
    public FieldDef imcseparador;
    public TabImportcab(String name)
      {
      super(name);
      imccodigo = new FieldDef("imccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      imcdesc = new FieldDef("imcdesc",FieldDef.CHAR,40);
      imcformato = new FieldDef("imcformato",FieldDef.CHAR,1,FieldDef.NOTNULL);
      imcseparador = new FieldDef("imcseparador",FieldDef.CHAR,1);
      FieldDef array[] = {
        imccodigo,
        imcdesc,
        imcformato,
        imcseparador        
        };
      setColumns(array);
      FieldDef arrayf[] = {imccodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabImportlin extends TableDef
    {
    // Campos
    public FieldDef imdcodigo;
    public FieldDef imdcampo;
    public FieldDef imddesc;
    public FieldDef imdtipo;
    public FieldDef imdlongitud;
    public FieldDef imdfijovar;
    public FieldDef imdnumerocampo;
    public FieldDef imdpinicial;
    public FieldDef imdpfinal;
    public FieldDef imdvalor;
    public TabImportlin(String name)
      {
      super(name);
      imdcodigo = new FieldDef("imdcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      imdcampo = new FieldDef("imdcampo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      imddesc = new FieldDef("imddesc",FieldDef.CHAR,40);
      imdtipo = new FieldDef("imdtipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      imdlongitud = new FieldDef("imdlongitud",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      imdfijovar = new FieldDef("imdfijovar",FieldDef.CHAR,1,FieldDef.NOTNULL);
      imdnumerocampo = new FieldDef("imdnumerocampo",FieldDef.INTEGER,0);
      imdpinicial = new FieldDef("imdpinicial",FieldDef.INTEGER,0);
      imdpfinal = new FieldDef("imdpfinal",FieldDef.INTEGER,0);
      imdvalor = new FieldDef("imdvalor",FieldDef.CHAR,40);
      FieldDef array[] = {
        imdcodigo,
        imdcampo,
        imddesc,
        imdtipo,
        imdlongitud,
        imdfijovar,
        imdnumerocampo,
        imdpinicial,
        imdpfinal,
        imdvalor        
        };
      setColumns(array);
      FieldDef arrayf[] = {imdcodigo,imdcampo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTempbalan extends TableDef
    {
    // Campos
    public FieldDef temempresa;
    public FieldDef temusuario;
    public FieldDef temcodigo;
    public FieldDef temejercicio;
    public FieldDef temproyecto;
    public FieldDef temdepartamento;
    public FieldDef temcuenta;
    public FieldDef temsubcuenta;
    public FieldDef temdebe1;
    public FieldDef temhaber1;
    public FieldDef temdebe2;
    public FieldDef temhaber2;
    public FieldDef temdebe3;
    public FieldDef temhaber3;
    public FieldDef temdebe4;
    public FieldDef temhaber4;
    public FieldDef temdebe5;
    public FieldDef temhaber5;
    public FieldDef temdebe6;
    public FieldDef temhaber6;
    public FieldDef temdebe7;
    public FieldDef temhaber7;
    public FieldDef temdebe8;
    public FieldDef temhaber8;
    public FieldDef temdebe9;
    public FieldDef temhaber9;
    public FieldDef temdebe10;
    public FieldDef temhaber10;
    public FieldDef temdebe11;
    public FieldDef temhaber11;
    public FieldDef temdebe12;
    public FieldDef temhaber12;
    public FieldDef temdebecieejer;
    public FieldDef temhabercieejer;
    public FieldDef temdebeciecon;
    public FieldDef temhaberciecon;
    public FieldDef temdebeapert;
    public FieldDef temhaberapert;
    public TabTempbalan(String name)
      {
      super(name);
      temempresa = new FieldDef("temempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      temusuario = new FieldDef("temusuario",FieldDef.CHAR,20,FieldDef.NOTNULL);
      temcodigo = new FieldDef("temcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      temejercicio = new FieldDef("temejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      temproyecto = new FieldDef("temproyecto",FieldDef.CHAR,5);
      temdepartamento = new FieldDef("temdepartamento",FieldDef.CHAR,5);
      temcuenta = new FieldDef("temcuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      temsubcuenta = new FieldDef("temsubcuenta",FieldDef.CHAR,12);
      temdebe1 = new FieldDef("temdebe1",FieldDef.FLOAT,6,0);
      temhaber1 = new FieldDef("temhaber1",FieldDef.FLOAT,6,0);
      temdebe2 = new FieldDef("temdebe2",FieldDef.FLOAT,6,0);
      temhaber2 = new FieldDef("temhaber2",FieldDef.FLOAT,6,0);
      temdebe3 = new FieldDef("temdebe3",FieldDef.FLOAT,6,0);
      temhaber3 = new FieldDef("temhaber3",FieldDef.FLOAT,6,0);
      temdebe4 = new FieldDef("temdebe4",FieldDef.FLOAT,6,0);
      temhaber4 = new FieldDef("temhaber4",FieldDef.FLOAT,6,0);
      temdebe5 = new FieldDef("temdebe5",FieldDef.FLOAT,6,0);
      temhaber5 = new FieldDef("temhaber5",FieldDef.FLOAT,6,0);
      temdebe6 = new FieldDef("temdebe6",FieldDef.FLOAT,6,0);
      temhaber6 = new FieldDef("temhaber6",FieldDef.FLOAT,6,0);
      temdebe7 = new FieldDef("temdebe7",FieldDef.FLOAT,6,0);
      temhaber7 = new FieldDef("temhaber7",FieldDef.FLOAT,6,0);
      temdebe8 = new FieldDef("temdebe8",FieldDef.FLOAT,6,0);
      temhaber8 = new FieldDef("temhaber8",FieldDef.FLOAT,6,0);
      temdebe9 = new FieldDef("temdebe9",FieldDef.FLOAT,6,0);
      temhaber9 = new FieldDef("temhaber9",FieldDef.FLOAT,6,0);
      temdebe10 = new FieldDef("temdebe10",FieldDef.FLOAT,6,0);
      temhaber10 = new FieldDef("temhaber10",FieldDef.FLOAT,6,0);
      temdebe11 = new FieldDef("temdebe11",FieldDef.FLOAT,6,0);
      temhaber11 = new FieldDef("temhaber11",FieldDef.FLOAT,6,0);
      temdebe12 = new FieldDef("temdebe12",FieldDef.FLOAT,6,0);
      temhaber12 = new FieldDef("temhaber12",FieldDef.FLOAT,6,0);
      temdebecieejer = new FieldDef("temdebecieejer",FieldDef.FLOAT,6,0);
      temhabercieejer = new FieldDef("temhabercieejer",FieldDef.FLOAT,6,0);
      temdebeciecon = new FieldDef("temdebeciecon",FieldDef.FLOAT,6,0);
      temhaberciecon = new FieldDef("temhaberciecon",FieldDef.FLOAT,6,0);
      temdebeapert = new FieldDef("temdebeapert",FieldDef.FLOAT,6,0);
      temhaberapert = new FieldDef("temhaberapert",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        temempresa,
        temusuario,
        temcodigo,
        temejercicio,
        temproyecto,
        temdepartamento,
        temcuenta,
        temsubcuenta,
        temdebe1,
        temhaber1,
        temdebe2,
        temhaber2,
        temdebe3,
        temhaber3,
        temdebe4,
        temhaber4,
        temdebe5,
        temhaber5,
        temdebe6,
        temhaber6,
        temdebe7,
        temhaber7,
        temdebe8,
        temhaber8,
        temdebe9,
        temhaber9,
        temdebe10,
        temhaber10,
        temdebe11,
        temhaber11,
        temdebe12,
        temhaber12,
        temdebecieejer,
        temhabercieejer,
        temdebeciecon,
        temhaberciecon,
        temdebeapert,
        temhaberapert        
        };
      setColumns(array);
      FieldDef arrayf[] = {temempresa,temusuario,temcodigo };
      setPrimaryKeys(arrayf);
      temcodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabTempdescua extends TableDef
    {
    // Campos
    public FieldDef tedempresa;
    public FieldDef tedejercicio;
    public FieldDef tedfecha;
    public FieldDef tedasiento;
    public FieldDef teddiario;
    public FieldDef teddebe;
    public FieldDef tedhaber;
    public FieldDef tedrevisado;
    public TabTempdescua(String name)
      {
      super(name);
      tedempresa = new FieldDef("tedempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tedejercicio = new FieldDef("tedejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tedfecha = new FieldDef("tedfecha",FieldDef.DATE,FieldDef.NOTNULL);
      tedasiento = new FieldDef("tedasiento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      teddiario = new FieldDef("teddiario",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      teddebe = new FieldDef("teddebe",FieldDef.FLOAT,6,0);
      tedhaber = new FieldDef("tedhaber",FieldDef.FLOAT,6,0);
      tedrevisado = new FieldDef("tedrevisado",FieldDef.CHAR,1);
      FieldDef array[] = {
        tedempresa,
        tedejercicio,
        tedfecha,
        tedasiento,
        teddiario,
        teddebe,
        tedhaber,
        tedrevisado        
        };
      setColumns(array);
      FieldDef arrayf[] = {tedempresa,tedejercicio,tedfecha,tedasiento };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTarea extends TableDef
    {
    // Campos
    public FieldDef tacodigo;
    public FieldDef tadesc;
    public TabTarea(String name)
      {
      super(name);
      tacodigo = new FieldDef("tacodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tadesc = new FieldDef("tadesc",FieldDef.CHAR,45);
      FieldDef array[] = {
        tacodigo,
        tadesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {tacodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTareadet extends TableDef
    {
    // Campos
    public FieldDef tdtarea;
    public FieldDef tdorden;
    public FieldDef tdprograma;
    public FieldDef tdopcion;
    public FieldDef tddesc;
    public FieldDef tdactivo;
    public FieldDef tdfitexcel;
    public TabTareadet(String name)
      {
      super(name);
      tdtarea = new FieldDef("tdtarea",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tdorden = new FieldDef("tdorden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tdprograma = new FieldDef("tdprograma",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tdopcion = new FieldDef("tdopcion",FieldDef.CHAR,2);
      tddesc = new FieldDef("tddesc",FieldDef.CHAR,45);
      tdactivo = new FieldDef("tdactivo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tdfitexcel = new FieldDef("tdfitexcel",FieldDef.CHAR,100);
      FieldDef array[] = {
        tdtarea,
        tdorden,
        tdprograma,
        tdopcion,
        tddesc,
        tdactivo,
        tdfitexcel        
        };
      setColumns(array);
      FieldDef arrayf[] = {tdtarea,tdorden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTareas extends TableDef
    {
    // Campos
    public FieldDef tscodigo;
    public FieldDef tsdesdeorden;
    public FieldDef tsdominioorden;
    public FieldDef tsusuarioorden;
    public FieldDef tsfechaorden;
    public FieldDef tshoraorden;
    public FieldDef tsempresa;
    public FieldDef tsejercicio;
    public FieldDef tstarea;
    public FieldDef tsperiodoi;
    public FieldDef tsperiodof;
    public FieldDef tssalida;
    public FieldDef tsformato;
    public FieldDef tsfecaejecutar;
    public FieldDef tsregmercantil;
    public TabTareas(String name)
      {
      super(name);
      tscodigo = new FieldDef("tscodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tsdesdeorden = new FieldDef("tsdesdeorden",FieldDef.CHAR,1);
      tsdominioorden = new FieldDef("tsdominioorden",FieldDef.CHAR,12);
      tsusuarioorden = new FieldDef("tsusuarioorden",FieldDef.CHAR,25);
      tsfechaorden = new FieldDef("tsfechaorden",FieldDef.DATE,FieldDef.NOTNULL);
      tshoraorden = new FieldDef("tshoraorden",FieldDef.CHAR,8);
      tsempresa = new FieldDef("tsempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tsejercicio = new FieldDef("tsejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tstarea = new FieldDef("tstarea",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tsperiodoi = new FieldDef("tsperiodoi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tsperiodof = new FieldDef("tsperiodof",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tssalida = new FieldDef("tssalida",FieldDef.INTEGER,0);
      tsformato = new FieldDef("tsformato",FieldDef.CHAR,1,FieldDef.NOTNULL);
      tsfecaejecutar = new FieldDef("tsfecaejecutar",FieldDef.DATE,FieldDef.NOTNULL);
      tsregmercantil = new FieldDef("tsregmercantil",FieldDef.CHAR,1);
      FieldDef array[] = {
        tscodigo,
        tsdesdeorden,
        tsdominioorden,
        tsusuarioorden,
        tsfechaorden,
        tshoraorden,
        tsempresa,
        tsejercicio,
        tstarea,
        tsperiodoi,
        tsperiodof,
        tssalida,
        tsformato,
        tsfecaejecutar,
        tsregmercantil        
        };
      setColumns(array);
      FieldDef arrayf[] = {tscodigo };
      setPrimaryKeys(arrayf);
      tscodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabPerasiento extends TableDef
    {
    // Campos
    public FieldDef aspempresa;
    public FieldDef aspejercicio;
    public FieldDef aspcodigo;
    public FieldDef aspdesc;
    public FieldDef aspperiodicidad;
    public FieldDef aspultimo;
    public TabPerasiento(String name)
      {
      super(name);
      aspempresa = new FieldDef("aspempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aspejercicio = new FieldDef("aspejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aspcodigo = new FieldDef("aspcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aspdesc = new FieldDef("aspdesc",FieldDef.CHAR,50);
      aspperiodicidad = new FieldDef("aspperiodicidad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aspultimo = new FieldDef("aspultimo",FieldDef.DATE,FieldDef.NOTNULL);
      FieldDef array[] = {
        aspempresa,
        aspejercicio,
        aspcodigo,
        aspdesc,
        aspperiodicidad,
        aspultimo        
        };
      setColumns(array);
      FieldDef arrayf[] = {aspempresa,aspejercicio,aspcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPerlineas extends TableDef
    {
    // Campos
    public FieldDef pelempresa;
    public FieldDef pelejercicio;
    public FieldDef pelcodigo;
    public FieldDef pellinea;
    public FieldDef pelcuenta;
    public FieldDef pelsubcuenta;
    public FieldDef peldiario;
    public FieldDef peldocumento;
    public FieldDef peldesc;
    public FieldDef peldebehaber;
    public FieldDef pelimporte;
    public FieldDef pelcontraconta;
    public FieldDef pelcontrasub;
    public FieldDef pelmoneda;
    public FieldDef pelproyecto;
    public FieldDef peldepartamento;
    public TabPerlineas(String name)
      {
      super(name);
      pelempresa = new FieldDef("pelempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pelejercicio = new FieldDef("pelejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pelcodigo = new FieldDef("pelcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pellinea = new FieldDef("pellinea",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pelcuenta = new FieldDef("pelcuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      pelsubcuenta = new FieldDef("pelsubcuenta",FieldDef.CHAR,12,FieldDef.NOTNULL);
      peldiario = new FieldDef("peldiario",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      peldocumento = new FieldDef("peldocumento",FieldDef.CHAR,10);
      peldesc = new FieldDef("peldesc",FieldDef.CHAR,40);
      peldebehaber = new FieldDef("peldebehaber",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pelimporte = new FieldDef("pelimporte",FieldDef.FLOAT,6,0);
      pelcontraconta = new FieldDef("pelcontraconta",FieldDef.CHAR,4);
      pelcontrasub = new FieldDef("pelcontrasub",FieldDef.CHAR,12);
      pelmoneda = new FieldDef("pelmoneda",FieldDef.CHAR,1,FieldDef.NOTNULL);
      pelproyecto = new FieldDef("pelproyecto",FieldDef.CHAR,5);
      peldepartamento = new FieldDef("peldepartamento",FieldDef.CHAR,5);
      FieldDef array[] = {
        pelempresa,
        pelejercicio,
        pelcodigo,
        pellinea,
        pelcuenta,
        pelsubcuenta,
        peldiario,
        peldocumento,
        peldesc,
        peldebehaber,
        pelimporte,
        pelcontraconta,
        pelcontrasub,
        pelmoneda,
        pelproyecto,
        peldepartamento        
        };
      setColumns(array);
      FieldDef arrayf[] = {pelempresa,pelejercicio,pelcodigo,pellinea };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPerciva extends TableDef
    {
    // Campos
    public FieldDef apcempresa;
    public FieldDef apcejercicio;
    public FieldDef apccodigo;
    public FieldDef apclinea;
    public FieldDef apcivaigic;
    public FieldDef apcserie;
    public FieldDef apcdocumento;
    public FieldDef apcdesc;
    public FieldDef apcnif;
    public FieldDef apcimporte;
    public FieldDef apcemirep;
    public FieldDef apcregimen;
    public TabPerciva(String name)
      {
      super(name);
      apcempresa = new FieldDef("apcempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apcejercicio = new FieldDef("apcejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apccodigo = new FieldDef("apccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apclinea = new FieldDef("apclinea",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apcivaigic = new FieldDef("apcivaigic",FieldDef.CHAR,1,FieldDef.NOTNULL);
      apcserie = new FieldDef("apcserie",FieldDef.CHAR,2);
      apcdocumento = new FieldDef("apcdocumento",FieldDef.CHAR,10);
      apcdesc = new FieldDef("apcdesc",FieldDef.CHAR,40);
      apcnif = new FieldDef("apcnif",FieldDef.CHAR,15);
      apcimporte = new FieldDef("apcimporte",FieldDef.FLOAT,6,0);
      apcemirep = new FieldDef("apcemirep",FieldDef.CHAR,1,FieldDef.NOTNULL);
      apcregimen = new FieldDef("apcregimen",FieldDef.CHAR,2);
      FieldDef array[] = {
        apcempresa,
        apcejercicio,
        apccodigo,
        apclinea,
        apcivaigic,
        apcserie,
        apcdocumento,
        apcdesc,
        apcnif,
        apcimporte,
        apcemirep,
        apcregimen        
        };
      setColumns(array);
      FieldDef arrayf[] = {apcempresa,apcejercicio,apccodigo,apclinea };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPerliva extends TableDef
    {
    // Campos
    public FieldDef apiempresa;
    public FieldDef apiejercicio;
    public FieldDef apicodigo;
    public FieldDef apilinea;
    public FieldDef apilineaiva;
    public FieldDef apicodiva;
    public FieldDef apicodiirpf;
    public FieldDef apibase;
    public FieldDef apiimpiva;
    public FieldDef apiimprec;
    public FieldDef apiimpirpf;
    public FieldDef apiobra;
    public FieldDef apirectif;
    public FieldDef apiejerrect;
    public FieldDef apiacum347;
    public FieldDef apiacum349;
    public FieldDef apimediacion;
    public FieldDef apideducible;
    public FieldDef apitransaccion;
    public TabPerliva(String name)
      {
      super(name);
      apiempresa = new FieldDef("apiempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apiejercicio = new FieldDef("apiejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apicodigo = new FieldDef("apicodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apilinea = new FieldDef("apilinea",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apilineaiva = new FieldDef("apilineaiva",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apicodiva = new FieldDef("apicodiva",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apicodiirpf = new FieldDef("apicodiirpf",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apibase = new FieldDef("apibase",FieldDef.FLOAT,6,0);
      apiimpiva = new FieldDef("apiimpiva",FieldDef.FLOAT,6,0);
      apiimprec = new FieldDef("apiimprec",FieldDef.FLOAT,6,0);
      apiimpirpf = new FieldDef("apiimpirpf",FieldDef.FLOAT,6,0);
      apiobra = new FieldDef("apiobra",FieldDef.CHAR,1,FieldDef.NOTNULL);
      apirectif = new FieldDef("apirectif",FieldDef.CHAR,1,FieldDef.NOTNULL);
      apiejerrect = new FieldDef("apiejerrect",FieldDef.INTEGER,0);
      apiacum347 = new FieldDef("apiacum347",FieldDef.CHAR,1,FieldDef.NOTNULL);
      apiacum349 = new FieldDef("apiacum349",FieldDef.CHAR,1,FieldDef.NOTNULL);
      apimediacion = new FieldDef("apimediacion",FieldDef.CHAR,1,FieldDef.NOTNULL);
      apideducible = new FieldDef("apideducible",FieldDef.CHAR,1,FieldDef.NOTNULL);
      apitransaccion = new FieldDef("apitransaccion",FieldDef.CHAR,5);
      FieldDef array[] = {
        apiempresa,
        apiejercicio,
        apicodigo,
        apilinea,
        apilineaiva,
        apicodiva,
        apicodiirpf,
        apibase,
        apiimpiva,
        apiimprec,
        apiimpirpf,
        apiobra,
        apirectif,
        apiejerrect,
        apiacum347,
        apiacum349,
        apimediacion,
        apideducible,
        apitransaccion        
        };
      setColumns(array);
      FieldDef arrayf[] = {apiempresa,apiejercicio,apicodigo,apilinea,apilineaiva };
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
    
  public class TabImportdef extends TableDef
    {
    // Campos
    public FieldDef impident;
    public FieldDef impdesc;
    public FieldDef impfichero;
    public FieldDef imptificado;
    public FieldDef imptipo;
    public FieldDef impseparador;
    public FieldDef impalfachar;
    public FieldDef impdecchar;
    public FieldDef implinini;
    public FieldDef imphoja;
    public FieldDef imptipoimp;
    public TabImportdef(String name)
      {
      super(name);
      impident = new FieldDef("impident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      impdesc = new FieldDef("impdesc",FieldDef.CHAR,80);
      impfichero = new FieldDef("impfichero",FieldDef.CHAR,80);
      imptificado = new FieldDef("imptificado",FieldDef.CHAR,5);
      imptipo = new FieldDef("imptipo",FieldDef.CHAR,1);
      impseparador = new FieldDef("impseparador",FieldDef.CHAR,1);
      impalfachar = new FieldDef("impalfachar",FieldDef.CHAR,1);
      impdecchar = new FieldDef("impdecchar",FieldDef.CHAR,1);
      implinini = new FieldDef("implinini",FieldDef.INTEGER,0);
      imphoja = new FieldDef("imphoja",FieldDef.CHAR,20);
      imptipoimp = new FieldDef("imptipoimp",FieldDef.CHAR,1);
      FieldDef array[] = {
        impident,
        impdesc,
        impfichero,
        imptificado,
        imptipo,
        impseparador,
        impalfachar,
        impdecchar,
        implinini,
        imphoja,
        imptipoimp        
        };
      setColumns(array);
      FieldDef arrayf[] = {impident };
      setPrimaryKeys(arrayf);
      impident.setAutoIncrementable(true);
      }
    }
    
  public class TabImportdet extends TableDef
    {
    // Campos
    public FieldDef imfident;
    public FieldDef imfnumcol;
    public FieldDef imfnombre;
    public FieldDef imfposini;
    public FieldDef imfposfin;
    public FieldDef imftipo;
    public TabImportdet(String name)
      {
      super(name);
      imfident = new FieldDef("imfident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      imfnumcol = new FieldDef("imfnumcol",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      imfnombre = new FieldDef("imfnombre",FieldDef.CHAR,15);
      imfposini = new FieldDef("imfposini",FieldDef.INTEGER,0);
      imfposfin = new FieldDef("imfposfin",FieldDef.INTEGER,0);
      imftipo = new FieldDef("imftipo",FieldDef.CHAR,1);
      FieldDef array[] = {
        imfident,
        imfnumcol,
        imfnombre,
        imfposini,
        imfposfin,
        imftipo        
        };
      setColumns(array);
      FieldDef arrayf[] = {imfident,imfnumcol };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabImpasientos extends TableDef
    {
    // Campos
    public FieldDef iascodi;
    public FieldDef iasempresa;
    public FieldDef iasejercicio;
    public FieldDef iascuenta;
    public FieldDef iassubcuenta;
    public FieldDef iasfecha;
    public FieldDef iasasiento;
    public FieldDef iasdiario;
    public FieldDef iasdiario2;
    public FieldDef iasdocumento;
    public FieldDef iasdesc;
    public FieldDef iasdebehaber;
    public FieldDef iasimporte;
    public FieldDef iascontraconta;
    public FieldDef iascontrasub;
    public FieldDef iasrenumerado;
    public FieldDef iasstatustras;
    public FieldDef iasfechatras;
    public FieldDef iasproyecto;
    public FieldDef iasdepartamento;
    public FieldDef iasstatuscon;
    public FieldDef iasfechacon;
    public FieldDef iasstatuscas;
    public FieldDef iasfechacas;
    public FieldDef iasastocas;
    public FieldDef iasstatuspunteo;
    public FieldDef iasfechapunteo;
    public FieldDef iascuadra;
    public FieldDef iaserror;
    public FieldDef iascuentainex;
    public TabImpasientos(String name)
      {
      super(name);
      iascodi = new FieldDef("iascodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      iasempresa = new FieldDef("iasempresa",FieldDef.INTEGER,0);
      iasejercicio = new FieldDef("iasejercicio",FieldDef.INTEGER,0);
      iascuenta = new FieldDef("iascuenta",FieldDef.CHAR,4);
      iassubcuenta = new FieldDef("iassubcuenta",FieldDef.CHAR,12);
      iasfecha = new FieldDef("iasfecha",FieldDef.DATE);
      iasasiento = new FieldDef("iasasiento",FieldDef.INTEGER,0);
      iasdiario = new FieldDef("iasdiario",FieldDef.INTEGER,0);
      iasdiario2 = new FieldDef("iasdiario2",FieldDef.INTEGER,0);
      iasdocumento = new FieldDef("iasdocumento",FieldDef.CHAR,10);
      iasdesc = new FieldDef("iasdesc",FieldDef.CHAR,40);
      iasdebehaber = new FieldDef("iasdebehaber",FieldDef.CHAR,1);
      iasimporte = new FieldDef("iasimporte",FieldDef.FLOAT,6,0);
      iascontraconta = new FieldDef("iascontraconta",FieldDef.CHAR,4);
      iascontrasub = new FieldDef("iascontrasub",FieldDef.CHAR,12);
      iasrenumerado = new FieldDef("iasrenumerado",FieldDef.INTEGER,0);
      iasstatustras = new FieldDef("iasstatustras",FieldDef.CHAR,1);
      iasfechatras = new FieldDef("iasfechatras",FieldDef.DATE);
      iasproyecto = new FieldDef("iasproyecto",FieldDef.CHAR,5);
      iasdepartamento = new FieldDef("iasdepartamento",FieldDef.CHAR,5);
      iasstatuscon = new FieldDef("iasstatuscon",FieldDef.CHAR,1);
      iasfechacon = new FieldDef("iasfechacon",FieldDef.DATE);
      iasstatuscas = new FieldDef("iasstatuscas",FieldDef.CHAR,1);
      iasfechacas = new FieldDef("iasfechacas",FieldDef.DATE);
      iasastocas = new FieldDef("iasastocas",FieldDef.INTEGER,0);
      iasstatuspunteo = new FieldDef("iasstatuspunteo",FieldDef.CHAR,1);
      iasfechapunteo = new FieldDef("iasfechapunteo",FieldDef.DATE);
      iascuadra = new FieldDef("iascuadra",FieldDef.CHAR,1);
      iaserror = new FieldDef("iaserror",FieldDef.CHAR,1);
      iascuentainex = new FieldDef("iascuentainex",FieldDef.CHAR,1);
      FieldDef array[] = {
        iascodi,
        iasempresa,
        iasejercicio,
        iascuenta,
        iassubcuenta,
        iasfecha,
        iasasiento,
        iasdiario,
        iasdiario2,
        iasdocumento,
        iasdesc,
        iasdebehaber,
        iasimporte,
        iascontraconta,
        iascontrasub,
        iasrenumerado,
        iasstatustras,
        iasfechatras,
        iasproyecto,
        iasdepartamento,
        iasstatuscon,
        iasfechacon,
        iasstatuscas,
        iasfechacas,
        iasastocas,
        iasstatuspunteo,
        iasfechapunteo,
        iascuadra,
        iaserror,
        iascuentainex        
        };
      setColumns(array);
      FieldDef arrayf[] = {iascodi };
      setPrimaryKeys(arrayf);
      iascodi.setAutoIncrementable(true);
      }
    }
    
  public class TabImpivacab extends TableDef
    {
    // Campos
    public FieldDef icivcodi;
    public FieldDef icivempresa;
    public FieldDef icivejercicio;
    public FieldDef icivivaigic;
    public FieldDef icivserie;
    public FieldDef icivregistro;
    public FieldDef icivfecha;
    public FieldDef icivdocumento;
    public FieldDef icivdesc;
    public FieldDef icivnif;
    public FieldDef icivimporte;
    public FieldDef icivemirep;
    public FieldDef icivregimen;
    public FieldDef icivasicodi;
    public FieldDef icivporirpf;
    public FieldDef icivbaseirpf;
    public FieldDef icivimpiva;
    public TabImpivacab(String name)
      {
      super(name);
      icivcodi = new FieldDef("icivcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      icivempresa = new FieldDef("icivempresa",FieldDef.INTEGER,0);
      icivejercicio = new FieldDef("icivejercicio",FieldDef.INTEGER,0);
      icivivaigic = new FieldDef("icivivaigic",FieldDef.CHAR,1);
      icivserie = new FieldDef("icivserie",FieldDef.CHAR,2);
      icivregistro = new FieldDef("icivregistro",FieldDef.INTEGER,0);
      icivfecha = new FieldDef("icivfecha",FieldDef.DATE);
      icivdocumento = new FieldDef("icivdocumento",FieldDef.CHAR,10);
      icivdesc = new FieldDef("icivdesc",FieldDef.CHAR,40);
      icivnif = new FieldDef("icivnif",FieldDef.CHAR,15);
      icivimporte = new FieldDef("icivimporte",FieldDef.FLOAT,6,0);
      icivemirep = new FieldDef("icivemirep",FieldDef.CHAR,1);
      icivregimen = new FieldDef("icivregimen",FieldDef.CHAR,2);
      icivasicodi = new FieldDef("icivasicodi",FieldDef.INTEGER,0);
      icivporirpf = new FieldDef("icivporirpf",FieldDef.FLOAT,6,0);
      icivbaseirpf = new FieldDef("icivbaseirpf",FieldDef.FLOAT,6,0);
      icivimpiva = new FieldDef("icivimpiva",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        icivcodi,
        icivempresa,
        icivejercicio,
        icivivaigic,
        icivserie,
        icivregistro,
        icivfecha,
        icivdocumento,
        icivdesc,
        icivnif,
        icivimporte,
        icivemirep,
        icivregimen,
        icivasicodi,
        icivporirpf,
        icivbaseirpf,
        icivimpiva        
        };
      setColumns(array);
      FieldDef arrayf[] = {icivcodi };
      setPrimaryKeys(arrayf);
      icivcodi.setAutoIncrementable(true);
      }
    }
    
  public class TabImpivalineas extends TableDef
    {
    // Campos
    public FieldDef ilivcodi;
    public FieldDef ilivcodilin;
    public FieldDef ilivasto;
    public FieldDef ilivporiva;
    public FieldDef ilivporrec;
    public FieldDef ilivbase;
    public FieldDef ilivimpiva;
    public FieldDef ilivimprec;
    public FieldDef ilivobra;
    public FieldDef ilivrectif;
    public FieldDef ilivejerrect;
    public FieldDef ilivperrect;
    public FieldDef ilivacum347;
    public FieldDef ilivacum349;
    public FieldDef ilivmediacion;
    public FieldDef ilivdeducible;
    public FieldDef ilivtransaccion;
    public TabImpivalineas(String name)
      {
      super(name);
      ilivcodi = new FieldDef("ilivcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ilivcodilin = new FieldDef("ilivcodilin",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ilivasto = new FieldDef("ilivasto",FieldDef.INTEGER,0);
      ilivporiva = new FieldDef("ilivporiva",FieldDef.FLOAT,6,0);
      ilivporrec = new FieldDef("ilivporrec",FieldDef.FLOAT,6,0);
      ilivbase = new FieldDef("ilivbase",FieldDef.FLOAT,6,0);
      ilivimpiva = new FieldDef("ilivimpiva",FieldDef.FLOAT,6,0);
      ilivimprec = new FieldDef("ilivimprec",FieldDef.FLOAT,6,0);
      ilivobra = new FieldDef("ilivobra",FieldDef.CHAR,1);
      ilivrectif = new FieldDef("ilivrectif",FieldDef.FLOAT,6,0);
      ilivejerrect = new FieldDef("ilivejerrect",FieldDef.INTEGER,0);
      ilivperrect = new FieldDef("ilivperrect",FieldDef.INTEGER,0);
      ilivacum347 = new FieldDef("ilivacum347",FieldDef.CHAR,1);
      ilivacum349 = new FieldDef("ilivacum349",FieldDef.CHAR,1);
      ilivmediacion = new FieldDef("ilivmediacion",FieldDef.CHAR,1);
      ilivdeducible = new FieldDef("ilivdeducible",FieldDef.CHAR,1);
      ilivtransaccion = new FieldDef("ilivtransaccion",FieldDef.CHAR,5);
      FieldDef array[] = {
        ilivcodi,
        ilivcodilin,
        ilivasto,
        ilivporiva,
        ilivporrec,
        ilivbase,
        ilivimpiva,
        ilivimprec,
        ilivobra,
        ilivrectif,
        ilivejerrect,
        ilivperrect,
        ilivacum347,
        ilivacum349,
        ilivmediacion,
        ilivdeducible,
        ilivtransaccion        
        };
      setColumns(array);
      FieldDef arrayf[] = {ilivcodi,ilivcodilin };
      setPrimaryKeys(arrayf);
      ilivcodilin.setAutoIncrementable(true);
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
    
  public class TabInfcabecera extends TableDef
    {
    // Campos
    public FieldDef ifccodicab;
    public FieldDef ifcdesc;
    public TabInfcabecera(String name)
      {
      super(name);
      ifccodicab = new FieldDef("ifccodicab",FieldDef.CHAR,5,FieldDef.NOTNULL);
      ifcdesc = new FieldDef("ifcdesc",FieldDef.CHAR,255);
      FieldDef array[] = {
        ifccodicab,
        ifcdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {ifccodicab };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabInfcolumnas extends TableDef
    {
    // Campos
    public FieldDef iflcodicab;
    public FieldDef iflordencol;
    public FieldDef ifltitulo;
    public FieldDef iflsigno;
    public FieldDef iflcoladi;
    public TabInfcolumnas(String name)
      {
      super(name);
      iflcodicab = new FieldDef("iflcodicab",FieldDef.CHAR,5,FieldDef.NOTNULL);
      iflordencol = new FieldDef("iflordencol",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ifltitulo = new FieldDef("ifltitulo",FieldDef.CHAR,35,FieldDef.NOTNULL);
      iflsigno = new FieldDef("iflsigno",FieldDef.CHAR,1);
      iflcoladi = new FieldDef("iflcoladi",FieldDef.CHAR,1);
      FieldDef array[] = {
        iflcodicab,
        iflordencol,
        ifltitulo,
        iflsigno,
        iflcoladi        
        };
      setColumns(array);
      FieldDef arrayf[] = {iflcodicab,iflordencol };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabInfoperacion extends TableDef
    {
    // Campos
    public FieldDef ifocodi;
    public FieldDef ifocodicab;
    public FieldDef ifoordencol;
    public FieldDef ifooperador;
    public FieldDef ifotipo;
    public FieldDef ifoano;
    public TabInfoperacion(String name)
      {
      super(name);
      ifocodi = new FieldDef("ifocodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ifocodicab = new FieldDef("ifocodicab",FieldDef.CHAR,5,FieldDef.NOTNULL);
      ifoordencol = new FieldDef("ifoordencol",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ifooperador = new FieldDef("ifooperador",FieldDef.CHAR,3,FieldDef.NOTNULL);
      ifotipo = new FieldDef("ifotipo",FieldDef.CHAR,1);
      ifoano = new FieldDef("ifoano",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        ifocodi,
        ifocodicab,
        ifoordencol,
        ifooperador,
        ifotipo,
        ifoano        
        };
      setColumns(array);
      FieldDef arrayf[] = {ifocodi };
      setPrimaryKeys(arrayf);
      ifocodi.setAutoIncrementable(true);
      }
    }
    
  public class TabNpgequival extends TableDef
    {
    // Campos
    public FieldDef neqcodi;
    public FieldDef neqtipo;
    public FieldDef neqempresa;
    public FieldDef neqctaant;
    public FieldDef neqdescant;
    public FieldDef neqctapos;
    public FieldDef neqdescpos;
    public TabNpgequival(String name)
      {
      super(name);
      neqcodi = new FieldDef("neqcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      neqtipo = new FieldDef("neqtipo",FieldDef.CHAR,1);
      neqempresa = new FieldDef("neqempresa",FieldDef.INTEGER,0);
      neqctaant = new FieldDef("neqctaant",FieldDef.CHAR,4);
      neqdescant = new FieldDef("neqdescant",FieldDef.CHAR,40);
      neqctapos = new FieldDef("neqctapos",FieldDef.CHAR,4);
      neqdescpos = new FieldDef("neqdescpos",FieldDef.CHAR,40);
      FieldDef array[] = {
        neqcodi,
        neqtipo,
        neqempresa,
        neqctaant,
        neqdescant,
        neqctapos,
        neqdescpos        
        };
      setColumns(array);
      FieldDef arrayf[] = {neqcodi };
      setPrimaryKeys(arrayf);
      neqcodi.setAutoIncrementable(true);
      }
    }
    
  public class TabNpgcuenta extends TableDef
    {
    // Campos
    public FieldDef ncutipo;
    public FieldDef ncucuenta;
    public FieldDef ncudesc;
    public TabNpgcuenta(String name)
      {
      super(name);
      ncutipo = new FieldDef("ncutipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      ncucuenta = new FieldDef("ncucuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      ncudesc = new FieldDef("ncudesc",FieldDef.CHAR,40);
      FieldDef array[] = {
        ncutipo,
        ncucuenta,
        ncudesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {ncutipo,ncucuenta };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabNpgestruct extends TableDef
    {
    // Campos
    public FieldDef nescodigo;
    public FieldDef neselemento;
    public FieldDef nespertenece;
    public FieldDef nestipo;
    public FieldDef nesacumula;
    public TabNpgestruct(String name)
      {
      super(name);
      nescodigo = new FieldDef("nescodigo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      neselemento = new FieldDef("neselemento",FieldDef.CHAR,10,FieldDef.NOTNULL);
      nespertenece = new FieldDef("nespertenece",FieldDef.CHAR,10);
      nestipo = new FieldDef("nestipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      nesacumula = new FieldDef("nesacumula",FieldDef.CHAR,1);
      FieldDef array[] = {
        nescodigo,
        neselemento,
        nespertenece,
        nestipo,
        nesacumula        
        };
      setColumns(array);
      FieldDef arrayf[] = {nescodigo,neselemento };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabNpgepigraf extends TableDef
    {
    // Campos
    public FieldDef nefestructura;
    public FieldDef nefelemento;
    public FieldDef nefdescripcion;
    public FieldDef nefnegativo;
    public FieldDef nefimpresion;
    public FieldDef nefident;
    public FieldDef nefformula;
    public FieldDef npfcedesglose;
    public TabNpgepigraf(String name)
      {
      super(name);
      nefestructura = new FieldDef("nefestructura",FieldDef.CHAR,3,FieldDef.NOTNULL);
      nefelemento = new FieldDef("nefelemento",FieldDef.CHAR,10,FieldDef.NOTNULL);
      nefdescripcion = new FieldDef("nefdescripcion",FieldDef.CHAR,60);
      nefnegativo = new FieldDef("nefnegativo",FieldDef.CHAR,1);
      nefimpresion = new FieldDef("nefimpresion",FieldDef.CHAR,1,FieldDef.NOTNULL);
      nefident = new FieldDef("nefident",FieldDef.INTEGER,0);
      nefformula = new FieldDef("nefformula",FieldDef.CHAR,100);
      npfcedesglose = new FieldDef("npfcedesglose",FieldDef.CHAR,1);
      FieldDef array[] = {
        nefestructura,
        nefelemento,
        nefdescripcion,
        nefnegativo,
        nefimpresion,
        nefident,
        nefformula,
        npfcedesglose        
        };
      setColumns(array);
      FieldDef arrayf[] = {nefestructura,nefelemento };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTablaequival extends TableDef
    {
    // Campos
    public FieldDef teqcodi;
    public FieldDef teqempresa;
    public FieldDef teqctaant;
    public FieldDef teqdescant;
    public FieldDef teqctapos;
    public FieldDef teqdescpos;
    public TabTablaequival(String name)
      {
      super(name);
      teqcodi = new FieldDef("teqcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      teqempresa = new FieldDef("teqempresa",FieldDef.INTEGER,0);
      teqctaant = new FieldDef("teqctaant",FieldDef.CHAR,4);
      teqdescant = new FieldDef("teqdescant",FieldDef.CHAR,40);
      teqctapos = new FieldDef("teqctapos",FieldDef.CHAR,4);
      teqdescpos = new FieldDef("teqdescpos",FieldDef.CHAR,40);
      FieldDef array[] = {
        teqcodi,
        teqempresa,
        teqctaant,
        teqdescant,
        teqctapos,
        teqdescpos        
        };
      setColumns(array);
      FieldDef arrayf[] = {teqcodi };
      setPrimaryKeys(arrayf);
      teqcodi.setAutoIncrementable(true);
      }
    }
    
  public class TabNotas extends TableDef
    {
    // Campos
    public FieldDef notcodi;
    public FieldDef notempresa;
    public FieldDef notejercicio;
    public FieldDef notnumero;
    public FieldDef notdesc;
    public TabNotas(String name)
      {
      super(name);
      notcodi = new FieldDef("notcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      notempresa = new FieldDef("notempresa",FieldDef.INTEGER,0);
      notejercicio = new FieldDef("notejercicio",FieldDef.INTEGER,0);
      notnumero = new FieldDef("notnumero",FieldDef.INTEGER,0);
      notdesc = new FieldDef("notdesc",FieldDef.CHAR,2000);
      FieldDef array[] = {
        notcodi,
        notempresa,
        notejercicio,
        notnumero,
        notdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {notcodi };
      setPrimaryKeys(arrayf);
      notcodi.setAutoIncrementable(true);
      }
    }
    
  public class TabCuentanota extends TableDef
    {
    // Campos
    public FieldDef cnoempresa;
    public FieldDef cnoejercicio;
    public FieldDef cnocuenta;
    public FieldDef cnocodinota;
    public TabCuentanota(String name)
      {
      super(name);
      cnoempresa = new FieldDef("cnoempresa",FieldDef.INTEGER,0);
      cnoejercicio = new FieldDef("cnoejercicio",FieldDef.INTEGER,0);
      cnocuenta = new FieldDef("cnocuenta",FieldDef.CHAR,5);
      cnocodinota = new FieldDef("cnocodinota",FieldDef.INTEGER,0);
      FieldDef array[] = {
        cnoempresa,
        cnoejercicio,
        cnocuenta,
        cnocodinota        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnoempresa,cnoejercicio,cnocuenta,cnocodinota };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEstadoflujo extends TableDef
    {
    // Campos
    public FieldDef eflempresa;
    public FieldDef eflejercicio;
    public FieldDef eflperiodo;
    public FieldDef efla;
    public FieldDef efla1;
    public FieldDef efla2;
    public FieldDef efla2a;
    public FieldDef efla2b;
    public FieldDef efla2c;
    public FieldDef efla2d;
    public FieldDef efla2e;
    public FieldDef efla2f;
    public FieldDef efla2g;
    public FieldDef efla2h;
    public FieldDef efla2i;
    public FieldDef efla2j;
    public FieldDef efla2k;
    public FieldDef efla3;
    public FieldDef efla3a;
    public FieldDef efla3b;
    public FieldDef efla3c;
    public FieldDef efla3d;
    public FieldDef efla3e;
    public FieldDef efla3f;
    public FieldDef efla4;
    public FieldDef efla4a;
    public FieldDef efla4b;
    public FieldDef efla4c;
    public FieldDef efla4d;
    public FieldDef efla4e;
    public FieldDef efla5;
    public FieldDef eflb;
    public FieldDef eflb6;
    public FieldDef eflb6a;
    public FieldDef eflb6b;
    public FieldDef eflb6c;
    public FieldDef eflb6d;
    public FieldDef eflb6e;
    public FieldDef eflb6f;
    public FieldDef eflb6g;
    public FieldDef eflb7;
    public FieldDef eflb7a;
    public FieldDef eflb7b;
    public FieldDef eflb7c;
    public FieldDef eflb7d;
    public FieldDef eflb7e;
    public FieldDef eflb7f;
    public FieldDef eflb7g;
    public FieldDef eflb8;
    public FieldDef eflc;
    public FieldDef eflc9;
    public FieldDef eflc9a;
    public FieldDef eflc9b;
    public FieldDef eflc9c;
    public FieldDef eflc9d;
    public FieldDef eflc9e;
    public FieldDef eflc10;
    public FieldDef eflc10a;
    public FieldDef eflc10a1;
    public FieldDef eflc10a2;
    public FieldDef eflc10a3;
    public FieldDef eflc10a4;
    public FieldDef eflc10b;
    public FieldDef eflc10b1;
    public FieldDef eflc10b2;
    public FieldDef eflc10b3;
    public FieldDef eflc10b4;
    public FieldDef eflc11;
    public FieldDef eflc11a;
    public FieldDef eflc11b;
    public FieldDef eflc12;
    public FieldDef efld;
    public FieldDef efle;
    public FieldDef eflefiniejer;
    public FieldDef efleffinejer;
    public FieldDef eflb6g2;
    public FieldDef eflb7g2;
    public FieldDef eflc10a42;
    public FieldDef eflc10b42;
    public TabEstadoflujo(String name)
      {
      super(name);
      eflempresa = new FieldDef("eflempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      eflejercicio = new FieldDef("eflejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      eflperiodo = new FieldDef("eflperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      efla = new FieldDef("efla",FieldDef.FLOAT,6,0);
      efla1 = new FieldDef("efla1",FieldDef.FLOAT,6,0);
      efla2 = new FieldDef("efla2",FieldDef.FLOAT,6,0);
      efla2a = new FieldDef("efla2a",FieldDef.FLOAT,6,0);
      efla2b = new FieldDef("efla2b",FieldDef.FLOAT,6,0);
      efla2c = new FieldDef("efla2c",FieldDef.FLOAT,6,0);
      efla2d = new FieldDef("efla2d",FieldDef.FLOAT,6,0);
      efla2e = new FieldDef("efla2e",FieldDef.FLOAT,6,0);
      efla2f = new FieldDef("efla2f",FieldDef.FLOAT,6,0);
      efla2g = new FieldDef("efla2g",FieldDef.FLOAT,6,0);
      efla2h = new FieldDef("efla2h",FieldDef.FLOAT,6,0);
      efla2i = new FieldDef("efla2i",FieldDef.FLOAT,6,0);
      efla2j = new FieldDef("efla2j",FieldDef.FLOAT,6,0);
      efla2k = new FieldDef("efla2k",FieldDef.FLOAT,6,0);
      efla3 = new FieldDef("efla3",FieldDef.FLOAT,6,0);
      efla3a = new FieldDef("efla3a",FieldDef.FLOAT,6,0);
      efla3b = new FieldDef("efla3b",FieldDef.FLOAT,6,0);
      efla3c = new FieldDef("efla3c",FieldDef.FLOAT,6,0);
      efla3d = new FieldDef("efla3d",FieldDef.FLOAT,6,0);
      efla3e = new FieldDef("efla3e",FieldDef.FLOAT,6,0);
      efla3f = new FieldDef("efla3f",FieldDef.FLOAT,6,0);
      efla4 = new FieldDef("efla4",FieldDef.FLOAT,6,0);
      efla4a = new FieldDef("efla4a",FieldDef.FLOAT,6,0);
      efla4b = new FieldDef("efla4b",FieldDef.FLOAT,6,0);
      efla4c = new FieldDef("efla4c",FieldDef.FLOAT,6,0);
      efla4d = new FieldDef("efla4d",FieldDef.FLOAT,6,0);
      efla4e = new FieldDef("efla4e",FieldDef.FLOAT,6,0);
      efla5 = new FieldDef("efla5",FieldDef.FLOAT,6,0);
      eflb = new FieldDef("eflb",FieldDef.FLOAT,6,0);
      eflb6 = new FieldDef("eflb6",FieldDef.FLOAT,6,0);
      eflb6a = new FieldDef("eflb6a",FieldDef.FLOAT,6,0);
      eflb6b = new FieldDef("eflb6b",FieldDef.FLOAT,6,0);
      eflb6c = new FieldDef("eflb6c",FieldDef.FLOAT,6,0);
      eflb6d = new FieldDef("eflb6d",FieldDef.FLOAT,6,0);
      eflb6e = new FieldDef("eflb6e",FieldDef.FLOAT,6,0);
      eflb6f = new FieldDef("eflb6f",FieldDef.FLOAT,6,0);
      eflb6g = new FieldDef("eflb6g",FieldDef.FLOAT,6,0);
      eflb7 = new FieldDef("eflb7",FieldDef.FLOAT,6,0);
      eflb7a = new FieldDef("eflb7a",FieldDef.FLOAT,6,0);
      eflb7b = new FieldDef("eflb7b",FieldDef.FLOAT,6,0);
      eflb7c = new FieldDef("eflb7c",FieldDef.FLOAT,6,0);
      eflb7d = new FieldDef("eflb7d",FieldDef.FLOAT,6,0);
      eflb7e = new FieldDef("eflb7e",FieldDef.FLOAT,6,0);
      eflb7f = new FieldDef("eflb7f",FieldDef.FLOAT,6,0);
      eflb7g = new FieldDef("eflb7g",FieldDef.FLOAT,6,0);
      eflb8 = new FieldDef("eflb8",FieldDef.FLOAT,6,0);
      eflc = new FieldDef("eflc",FieldDef.FLOAT,6,0);
      eflc9 = new FieldDef("eflc9",FieldDef.FLOAT,6,0);
      eflc9a = new FieldDef("eflc9a",FieldDef.FLOAT,6,0);
      eflc9b = new FieldDef("eflc9b",FieldDef.FLOAT,6,0);
      eflc9c = new FieldDef("eflc9c",FieldDef.FLOAT,6,0);
      eflc9d = new FieldDef("eflc9d",FieldDef.FLOAT,6,0);
      eflc9e = new FieldDef("eflc9e",FieldDef.FLOAT,6,0);
      eflc10 = new FieldDef("eflc10",FieldDef.FLOAT,6,0);
      eflc10a = new FieldDef("eflc10a",FieldDef.FLOAT,6,0);
      eflc10a1 = new FieldDef("eflc10a1",FieldDef.FLOAT,6,0);
      eflc10a2 = new FieldDef("eflc10a2",FieldDef.FLOAT,6,0);
      eflc10a3 = new FieldDef("eflc10a3",FieldDef.FLOAT,6,0);
      eflc10a4 = new FieldDef("eflc10a4",FieldDef.FLOAT,6,0);
      eflc10b = new FieldDef("eflc10b",FieldDef.FLOAT,6,0);
      eflc10b1 = new FieldDef("eflc10b1",FieldDef.FLOAT,6,0);
      eflc10b2 = new FieldDef("eflc10b2",FieldDef.FLOAT,6,0);
      eflc10b3 = new FieldDef("eflc10b3",FieldDef.FLOAT,6,0);
      eflc10b4 = new FieldDef("eflc10b4",FieldDef.FLOAT,6,0);
      eflc11 = new FieldDef("eflc11",FieldDef.FLOAT,6,0);
      eflc11a = new FieldDef("eflc11a",FieldDef.FLOAT,6,0);
      eflc11b = new FieldDef("eflc11b",FieldDef.FLOAT,6,0);
      eflc12 = new FieldDef("eflc12",FieldDef.FLOAT,6,0);
      efld = new FieldDef("efld",FieldDef.FLOAT,6,0);
      efle = new FieldDef("efle",FieldDef.FLOAT,6,0);
      eflefiniejer = new FieldDef("eflefiniejer",FieldDef.FLOAT,6,0);
      efleffinejer = new FieldDef("efleffinejer",FieldDef.FLOAT,6,0);
      eflb6g2 = new FieldDef("eflb6g2",FieldDef.FLOAT,6,0);
      eflb7g2 = new FieldDef("eflb7g2",FieldDef.FLOAT,6,0);
      eflc10a42 = new FieldDef("eflc10a42",FieldDef.FLOAT,6,0);
      eflc10b42 = new FieldDef("eflc10b42",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        eflempresa,
        eflejercicio,
        eflperiodo,
        efla,
        efla1,
        efla2,
        efla2a,
        efla2b,
        efla2c,
        efla2d,
        efla2e,
        efla2f,
        efla2g,
        efla2h,
        efla2i,
        efla2j,
        efla2k,
        efla3,
        efla3a,
        efla3b,
        efla3c,
        efla3d,
        efla3e,
        efla3f,
        efla4,
        efla4a,
        efla4b,
        efla4c,
        efla4d,
        efla4e,
        efla5,
        eflb,
        eflb6,
        eflb6a,
        eflb6b,
        eflb6c,
        eflb6d,
        eflb6e,
        eflb6f,
        eflb6g,
        eflb7,
        eflb7a,
        eflb7b,
        eflb7c,
        eflb7d,
        eflb7e,
        eflb7f,
        eflb7g,
        eflb8,
        eflc,
        eflc9,
        eflc9a,
        eflc9b,
        eflc9c,
        eflc9d,
        eflc9e,
        eflc10,
        eflc10a,
        eflc10a1,
        eflc10a2,
        eflc10a3,
        eflc10a4,
        eflc10b,
        eflc10b1,
        eflc10b2,
        eflc10b3,
        eflc10b4,
        eflc11,
        eflc11a,
        eflc11b,
        eflc12,
        efld,
        efle,
        eflefiniejer,
        efleffinejer,
        eflb6g2,
        eflb7g2,
        eflc10a42,
        eflc10b42        
        };
      setColumns(array);
      FieldDef arrayf[] = {eflempresa,eflejercicio,eflperiodo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCambiospat extends TableDef
    {
    // Campos
    public FieldDef ecpempresa;
    public FieldDef ecpejercicio;
    public FieldDef ecpperiodo;
    public FieldDef ecpepigrafe;
    public FieldDef ecpcol1;
    public FieldDef ecpcol2;
    public FieldDef ecpcol3;
    public FieldDef ecpcol4;
    public FieldDef ecpcol5;
    public FieldDef ecpcol6;
    public FieldDef ecpcol7;
    public FieldDef ecpcol8;
    public FieldDef ecpcol9;
    public FieldDef ecpcol10;
    public FieldDef ecpcol11;
    public FieldDef ecpcol12;
    public FieldDef ecpcol13;
    public TabCambiospat(String name)
      {
      super(name);
      ecpempresa = new FieldDef("ecpempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ecpejercicio = new FieldDef("ecpejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ecpperiodo = new FieldDef("ecpperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      ecpepigrafe = new FieldDef("ecpepigrafe",FieldDef.CHAR,4,FieldDef.NOTNULL);
      ecpcol1 = new FieldDef("ecpcol1",FieldDef.FLOAT,6,0);
      ecpcol2 = new FieldDef("ecpcol2",FieldDef.FLOAT,6,0);
      ecpcol3 = new FieldDef("ecpcol3",FieldDef.FLOAT,6,0);
      ecpcol4 = new FieldDef("ecpcol4",FieldDef.FLOAT,6,0);
      ecpcol5 = new FieldDef("ecpcol5",FieldDef.FLOAT,6,0);
      ecpcol6 = new FieldDef("ecpcol6",FieldDef.FLOAT,6,0);
      ecpcol7 = new FieldDef("ecpcol7",FieldDef.FLOAT,6,0);
      ecpcol8 = new FieldDef("ecpcol8",FieldDef.FLOAT,6,0);
      ecpcol9 = new FieldDef("ecpcol9",FieldDef.FLOAT,6,0);
      ecpcol10 = new FieldDef("ecpcol10",FieldDef.FLOAT,6,0);
      ecpcol11 = new FieldDef("ecpcol11",FieldDef.FLOAT,6,0);
      ecpcol12 = new FieldDef("ecpcol12",FieldDef.FLOAT,6,0);
      ecpcol13 = new FieldDef("ecpcol13",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ecpempresa,
        ecpejercicio,
        ecpperiodo,
        ecpepigrafe,
        ecpcol1,
        ecpcol2,
        ecpcol3,
        ecpcol4,
        ecpcol5,
        ecpcol6,
        ecpcol7,
        ecpcol8,
        ecpcol9,
        ecpcol10,
        ecpcol11,
        ecpcol12,
        ecpcol13        
        };
      setColumns(array);
      FieldDef arrayf[] = {ecpempresa,ecpejercicio,ecpperiodo,ecpepigrafe };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEstcampat extends TableDef
    {
    // Campos
    public FieldDef ecpempresa;
    public FieldDef ecpejercicio;
    public FieldDef ecpperiodo;
    public FieldDef ecpf1c1;
    public FieldDef ecpf1c2;
    public FieldDef ecpf1c3;
    public FieldDef ecpf1c4;
    public FieldDef ecpf1c5;
    public FieldDef ecpf1c6;
    public FieldDef ecpf1c7;
    public FieldDef ecpf1c8;
    public FieldDef ecpf1c9;
    public FieldDef ecpf1c10;
    public FieldDef ecpf1c11;
    public FieldDef ecpf1c12;
    public FieldDef ecpf2c1;
    public FieldDef ecpf2c2;
    public FieldDef ecpf2c3;
    public FieldDef ecpf2c4;
    public FieldDef ecpf2c5;
    public FieldDef ecpf2c6;
    public FieldDef ecpf2c7;
    public FieldDef ecpf2c8;
    public FieldDef ecpf2c9;
    public FieldDef ecpf2c10;
    public FieldDef ecpf2c11;
    public FieldDef ecpf2c12;
    public FieldDef ecpf3c1;
    public FieldDef ecpf3c2;
    public FieldDef ecpf3c3;
    public FieldDef ecpf3c4;
    public FieldDef ecpf3c5;
    public FieldDef ecpf3c6;
    public FieldDef ecpf3c7;
    public FieldDef ecpf3c8;
    public FieldDef ecpf3c9;
    public FieldDef ecpf3c10;
    public FieldDef ecpf3c11;
    public FieldDef ecpf3c12;
    public FieldDef ecpf4c1;
    public FieldDef ecpf4c2;
    public FieldDef ecpf4c3;
    public FieldDef ecpf4c4;
    public FieldDef ecpf4c5;
    public FieldDef ecpf4c6;
    public FieldDef ecpf4c7;
    public FieldDef ecpf4c8;
    public FieldDef ecpf4c9;
    public FieldDef ecpf4c10;
    public FieldDef ecpf4c11;
    public FieldDef ecpf4c12;
    public FieldDef ecpf5c1;
    public FieldDef ecpf5c2;
    public FieldDef ecpf5c3;
    public FieldDef ecpf5c4;
    public FieldDef ecpf5c5;
    public FieldDef ecpf5c6;
    public FieldDef ecpf5c7;
    public FieldDef ecpf5c8;
    public FieldDef ecpf5c9;
    public FieldDef ecpf5c10;
    public FieldDef ecpf5c11;
    public FieldDef ecpf5c12;
    public FieldDef ecpf6c1;
    public FieldDef ecpf6c2;
    public FieldDef ecpf6c3;
    public FieldDef ecpf6c4;
    public FieldDef ecpf6c5;
    public FieldDef ecpf6c6;
    public FieldDef ecpf6c7;
    public FieldDef ecpf6c8;
    public FieldDef ecpf6c9;
    public FieldDef ecpf6c10;
    public FieldDef ecpf6c11;
    public FieldDef ecpf6c12;
    public FieldDef ecpf7c1;
    public FieldDef ecpf7c2;
    public FieldDef ecpf7c3;
    public FieldDef ecpf7c4;
    public FieldDef ecpf7c5;
    public FieldDef ecpf7c6;
    public FieldDef ecpf7c7;
    public FieldDef ecpf7c8;
    public FieldDef ecpf7c9;
    public FieldDef ecpf7c10;
    public FieldDef ecpf7c11;
    public FieldDef ecpf7c12;
    public FieldDef ecpf8c1;
    public FieldDef ecpf8c2;
    public FieldDef ecpf8c3;
    public FieldDef ecpf8c4;
    public FieldDef ecpf8c5;
    public FieldDef ecpf8c6;
    public FieldDef ecpf8c7;
    public FieldDef ecpf8c8;
    public FieldDef ecpf8c9;
    public FieldDef ecpf8c10;
    public FieldDef ecpf8c11;
    public FieldDef ecpf8c12;
    public FieldDef ecpf9c1;
    public FieldDef ecpf9c2;
    public FieldDef ecpf9c3;
    public FieldDef ecpf9c4;
    public FieldDef ecpf9c5;
    public FieldDef ecpf9c6;
    public FieldDef ecpf9c7;
    public FieldDef ecpf9c8;
    public FieldDef ecpf9c9;
    public FieldDef ecpf9c10;
    public FieldDef ecpf9c11;
    public FieldDef ecpf9c12;
    public FieldDef ecpf10c1;
    public FieldDef ecpf10c2;
    public FieldDef ecpf10c3;
    public FieldDef ecpf10c4;
    public FieldDef ecpf10c5;
    public FieldDef ecpf10c6;
    public FieldDef ecpf10c7;
    public FieldDef ecpf10c8;
    public FieldDef ecpf10c9;
    public FieldDef ecpf10c10;
    public FieldDef ecpf10c11;
    public FieldDef ecpf10c12;
    public FieldDef ecpf11c1;
    public FieldDef ecpf11c2;
    public FieldDef ecpf11c3;
    public FieldDef ecpf11c4;
    public FieldDef ecpf11c5;
    public FieldDef ecpf11c6;
    public FieldDef ecpf11c7;
    public FieldDef ecpf11c8;
    public FieldDef ecpf11c9;
    public FieldDef ecpf11c10;
    public FieldDef ecpf11c11;
    public FieldDef ecpf11c12;
    public FieldDef ecpf12c1;
    public FieldDef ecpf12c2;
    public FieldDef ecpf12c3;
    public FieldDef ecpf12c4;
    public FieldDef ecpf12c5;
    public FieldDef ecpf12c6;
    public FieldDef ecpf12c7;
    public FieldDef ecpf12c8;
    public FieldDef ecpf12c9;
    public FieldDef ecpf12c10;
    public FieldDef ecpf12c11;
    public FieldDef ecpf12c12;
    public FieldDef ecpsalfin1;
    public FieldDef ecpsalfin2;
    public FieldDef ecpsalfin3;
    public FieldDef ecpsalfin4;
    public FieldDef ecpsalfin5;
    public FieldDef ecpsalfin6;
    public FieldDef ecpsalfin7;
    public FieldDef ecpsalfin8;
    public FieldDef ecpsalfin9;
    public FieldDef ecpsalfin10;
    public FieldDef ecpsalfin11;
    public FieldDef ecpsalfin12;
    public FieldDef ecpfp1c1;
    public FieldDef ecpfp1c2;
    public FieldDef ecpfp1c3;
    public FieldDef ecpfp1c4;
    public FieldDef ecpfp1c5;
    public FieldDef ecpfp1c6;
    public FieldDef ecpfp1c7;
    public FieldDef ecpfp1c8;
    public FieldDef ecpfp1c9;
    public FieldDef ecpfp1c10;
    public FieldDef ecpfp1c11;
    public FieldDef ecpfp1c12;
    public FieldDef ecpfp2c1;
    public FieldDef ecpfp2c2;
    public FieldDef ecpfp2c3;
    public FieldDef ecpfp2c4;
    public FieldDef ecpfp2c5;
    public FieldDef ecpfp2c6;
    public FieldDef ecpfp2c7;
    public FieldDef ecpfp2c8;
    public FieldDef ecpfp2c9;
    public FieldDef ecpfp2c10;
    public FieldDef ecpfp2c11;
    public FieldDef ecpfp2c12;
    public FieldDef ecpfp3c1;
    public FieldDef ecpfp3c2;
    public FieldDef ecpfp3c3;
    public FieldDef ecpfp3c4;
    public FieldDef ecpfp3c5;
    public FieldDef ecpfp3c6;
    public FieldDef ecpfp3c7;
    public FieldDef ecpfp3c8;
    public FieldDef ecpfp3c9;
    public FieldDef ecpfp3c10;
    public FieldDef ecpfp3c11;
    public FieldDef ecpfp3c12;
    public FieldDef ecpfp4c1;
    public FieldDef ecpfp4c2;
    public FieldDef ecpfp4c3;
    public FieldDef ecpfp4c4;
    public FieldDef ecpfp4c5;
    public FieldDef ecpfp4c6;
    public FieldDef ecpfp4c7;
    public FieldDef ecpfp4c8;
    public FieldDef ecpfp4c9;
    public FieldDef ecpfp4c10;
    public FieldDef ecpfp4c11;
    public FieldDef ecpfp4c12;
    public TabEstcampat(String name)
      {
      super(name);
      ecpempresa = new FieldDef("ecpempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ecpejercicio = new FieldDef("ecpejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ecpperiodo = new FieldDef("ecpperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      ecpf1c1 = new FieldDef("ecpf1c1",FieldDef.FLOAT,6,0);
      ecpf1c2 = new FieldDef("ecpf1c2",FieldDef.FLOAT,6,0);
      ecpf1c3 = new FieldDef("ecpf1c3",FieldDef.FLOAT,6,0);
      ecpf1c4 = new FieldDef("ecpf1c4",FieldDef.FLOAT,6,0);
      ecpf1c5 = new FieldDef("ecpf1c5",FieldDef.FLOAT,6,0);
      ecpf1c6 = new FieldDef("ecpf1c6",FieldDef.FLOAT,6,0);
      ecpf1c7 = new FieldDef("ecpf1c7",FieldDef.FLOAT,6,0);
      ecpf1c8 = new FieldDef("ecpf1c8",FieldDef.FLOAT,6,0);
      ecpf1c9 = new FieldDef("ecpf1c9",FieldDef.FLOAT,6,0);
      ecpf1c10 = new FieldDef("ecpf1c10",FieldDef.FLOAT,6,0);
      ecpf1c11 = new FieldDef("ecpf1c11",FieldDef.FLOAT,6,0);
      ecpf1c12 = new FieldDef("ecpf1c12",FieldDef.FLOAT,6,0);
      ecpf2c1 = new FieldDef("ecpf2c1",FieldDef.FLOAT,6,0);
      ecpf2c2 = new FieldDef("ecpf2c2",FieldDef.FLOAT,6,0);
      ecpf2c3 = new FieldDef("ecpf2c3",FieldDef.FLOAT,6,0);
      ecpf2c4 = new FieldDef("ecpf2c4",FieldDef.FLOAT,6,0);
      ecpf2c5 = new FieldDef("ecpf2c5",FieldDef.FLOAT,6,0);
      ecpf2c6 = new FieldDef("ecpf2c6",FieldDef.FLOAT,6,0);
      ecpf2c7 = new FieldDef("ecpf2c7",FieldDef.FLOAT,6,0);
      ecpf2c8 = new FieldDef("ecpf2c8",FieldDef.FLOAT,6,0);
      ecpf2c9 = new FieldDef("ecpf2c9",FieldDef.FLOAT,6,0);
      ecpf2c10 = new FieldDef("ecpf2c10",FieldDef.FLOAT,6,0);
      ecpf2c11 = new FieldDef("ecpf2c11",FieldDef.FLOAT,6,0);
      ecpf2c12 = new FieldDef("ecpf2c12",FieldDef.FLOAT,6,0);
      ecpf3c1 = new FieldDef("ecpf3c1",FieldDef.FLOAT,6,0);
      ecpf3c2 = new FieldDef("ecpf3c2",FieldDef.FLOAT,6,0);
      ecpf3c3 = new FieldDef("ecpf3c3",FieldDef.FLOAT,6,0);
      ecpf3c4 = new FieldDef("ecpf3c4",FieldDef.FLOAT,6,0);
      ecpf3c5 = new FieldDef("ecpf3c5",FieldDef.FLOAT,6,0);
      ecpf3c6 = new FieldDef("ecpf3c6",FieldDef.FLOAT,6,0);
      ecpf3c7 = new FieldDef("ecpf3c7",FieldDef.FLOAT,6,0);
      ecpf3c8 = new FieldDef("ecpf3c8",FieldDef.FLOAT,6,0);
      ecpf3c9 = new FieldDef("ecpf3c9",FieldDef.FLOAT,6,0);
      ecpf3c10 = new FieldDef("ecpf3c10",FieldDef.FLOAT,6,0);
      ecpf3c11 = new FieldDef("ecpf3c11",FieldDef.FLOAT,6,0);
      ecpf3c12 = new FieldDef("ecpf3c12",FieldDef.FLOAT,6,0);
      ecpf4c1 = new FieldDef("ecpf4c1",FieldDef.FLOAT,6,0);
      ecpf4c2 = new FieldDef("ecpf4c2",FieldDef.FLOAT,6,0);
      ecpf4c3 = new FieldDef("ecpf4c3",FieldDef.FLOAT,6,0);
      ecpf4c4 = new FieldDef("ecpf4c4",FieldDef.FLOAT,6,0);
      ecpf4c5 = new FieldDef("ecpf4c5",FieldDef.FLOAT,6,0);
      ecpf4c6 = new FieldDef("ecpf4c6",FieldDef.FLOAT,6,0);
      ecpf4c7 = new FieldDef("ecpf4c7",FieldDef.FLOAT,6,0);
      ecpf4c8 = new FieldDef("ecpf4c8",FieldDef.FLOAT,6,0);
      ecpf4c9 = new FieldDef("ecpf4c9",FieldDef.FLOAT,6,0);
      ecpf4c10 = new FieldDef("ecpf4c10",FieldDef.FLOAT,6,0);
      ecpf4c11 = new FieldDef("ecpf4c11",FieldDef.FLOAT,6,0);
      ecpf4c12 = new FieldDef("ecpf4c12",FieldDef.FLOAT,6,0);
      ecpf5c1 = new FieldDef("ecpf5c1",FieldDef.FLOAT,6,0);
      ecpf5c2 = new FieldDef("ecpf5c2",FieldDef.FLOAT,6,0);
      ecpf5c3 = new FieldDef("ecpf5c3",FieldDef.FLOAT,6,0);
      ecpf5c4 = new FieldDef("ecpf5c4",FieldDef.FLOAT,6,0);
      ecpf5c5 = new FieldDef("ecpf5c5",FieldDef.FLOAT,6,0);
      ecpf5c6 = new FieldDef("ecpf5c6",FieldDef.FLOAT,6,0);
      ecpf5c7 = new FieldDef("ecpf5c7",FieldDef.FLOAT,6,0);
      ecpf5c8 = new FieldDef("ecpf5c8",FieldDef.FLOAT,6,0);
      ecpf5c9 = new FieldDef("ecpf5c9",FieldDef.FLOAT,6,0);
      ecpf5c10 = new FieldDef("ecpf5c10",FieldDef.FLOAT,6,0);
      ecpf5c11 = new FieldDef("ecpf5c11",FieldDef.FLOAT,6,0);
      ecpf5c12 = new FieldDef("ecpf5c12",FieldDef.FLOAT,6,0);
      ecpf6c1 = new FieldDef("ecpf6c1",FieldDef.FLOAT,6,0);
      ecpf6c2 = new FieldDef("ecpf6c2",FieldDef.FLOAT,6,0);
      ecpf6c3 = new FieldDef("ecpf6c3",FieldDef.FLOAT,6,0);
      ecpf6c4 = new FieldDef("ecpf6c4",FieldDef.FLOAT,6,0);
      ecpf6c5 = new FieldDef("ecpf6c5",FieldDef.FLOAT,6,0);
      ecpf6c6 = new FieldDef("ecpf6c6",FieldDef.FLOAT,6,0);
      ecpf6c7 = new FieldDef("ecpf6c7",FieldDef.FLOAT,6,0);
      ecpf6c8 = new FieldDef("ecpf6c8",FieldDef.FLOAT,6,0);
      ecpf6c9 = new FieldDef("ecpf6c9",FieldDef.FLOAT,6,0);
      ecpf6c10 = new FieldDef("ecpf6c10",FieldDef.FLOAT,6,0);
      ecpf6c11 = new FieldDef("ecpf6c11",FieldDef.FLOAT,6,0);
      ecpf6c12 = new FieldDef("ecpf6c12",FieldDef.FLOAT,6,0);
      ecpf7c1 = new FieldDef("ecpf7c1",FieldDef.FLOAT,6,0);
      ecpf7c2 = new FieldDef("ecpf7c2",FieldDef.FLOAT,6,0);
      ecpf7c3 = new FieldDef("ecpf7c3",FieldDef.FLOAT,6,0);
      ecpf7c4 = new FieldDef("ecpf7c4",FieldDef.FLOAT,6,0);
      ecpf7c5 = new FieldDef("ecpf7c5",FieldDef.FLOAT,6,0);
      ecpf7c6 = new FieldDef("ecpf7c6",FieldDef.FLOAT,6,0);
      ecpf7c7 = new FieldDef("ecpf7c7",FieldDef.FLOAT,6,0);
      ecpf7c8 = new FieldDef("ecpf7c8",FieldDef.FLOAT,6,0);
      ecpf7c9 = new FieldDef("ecpf7c9",FieldDef.FLOAT,6,0);
      ecpf7c10 = new FieldDef("ecpf7c10",FieldDef.FLOAT,6,0);
      ecpf7c11 = new FieldDef("ecpf7c11",FieldDef.FLOAT,6,0);
      ecpf7c12 = new FieldDef("ecpf7c12",FieldDef.FLOAT,6,0);
      ecpf8c1 = new FieldDef("ecpf8c1",FieldDef.FLOAT,6,0);
      ecpf8c2 = new FieldDef("ecpf8c2",FieldDef.FLOAT,6,0);
      ecpf8c3 = new FieldDef("ecpf8c3",FieldDef.FLOAT,6,0);
      ecpf8c4 = new FieldDef("ecpf8c4",FieldDef.FLOAT,6,0);
      ecpf8c5 = new FieldDef("ecpf8c5",FieldDef.FLOAT,6,0);
      ecpf8c6 = new FieldDef("ecpf8c6",FieldDef.FLOAT,6,0);
      ecpf8c7 = new FieldDef("ecpf8c7",FieldDef.FLOAT,6,0);
      ecpf8c8 = new FieldDef("ecpf8c8",FieldDef.FLOAT,6,0);
      ecpf8c9 = new FieldDef("ecpf8c9",FieldDef.FLOAT,6,0);
      ecpf8c10 = new FieldDef("ecpf8c10",FieldDef.FLOAT,6,0);
      ecpf8c11 = new FieldDef("ecpf8c11",FieldDef.FLOAT,6,0);
      ecpf8c12 = new FieldDef("ecpf8c12",FieldDef.FLOAT,6,0);
      ecpf9c1 = new FieldDef("ecpf9c1",FieldDef.FLOAT,6,0);
      ecpf9c2 = new FieldDef("ecpf9c2",FieldDef.FLOAT,6,0);
      ecpf9c3 = new FieldDef("ecpf9c3",FieldDef.FLOAT,6,0);
      ecpf9c4 = new FieldDef("ecpf9c4",FieldDef.FLOAT,6,0);
      ecpf9c5 = new FieldDef("ecpf9c5",FieldDef.FLOAT,6,0);
      ecpf9c6 = new FieldDef("ecpf9c6",FieldDef.FLOAT,6,0);
      ecpf9c7 = new FieldDef("ecpf9c7",FieldDef.FLOAT,6,0);
      ecpf9c8 = new FieldDef("ecpf9c8",FieldDef.FLOAT,6,0);
      ecpf9c9 = new FieldDef("ecpf9c9",FieldDef.FLOAT,6,0);
      ecpf9c10 = new FieldDef("ecpf9c10",FieldDef.FLOAT,6,0);
      ecpf9c11 = new FieldDef("ecpf9c11",FieldDef.FLOAT,6,0);
      ecpf9c12 = new FieldDef("ecpf9c12",FieldDef.FLOAT,6,0);
      ecpf10c1 = new FieldDef("ecpf10c1",FieldDef.FLOAT,6,0);
      ecpf10c2 = new FieldDef("ecpf10c2",FieldDef.FLOAT,6,0);
      ecpf10c3 = new FieldDef("ecpf10c3",FieldDef.FLOAT,6,0);
      ecpf10c4 = new FieldDef("ecpf10c4",FieldDef.FLOAT,6,0);
      ecpf10c5 = new FieldDef("ecpf10c5",FieldDef.FLOAT,6,0);
      ecpf10c6 = new FieldDef("ecpf10c6",FieldDef.FLOAT,6,0);
      ecpf10c7 = new FieldDef("ecpf10c7",FieldDef.FLOAT,6,0);
      ecpf10c8 = new FieldDef("ecpf10c8",FieldDef.FLOAT,6,0);
      ecpf10c9 = new FieldDef("ecpf10c9",FieldDef.FLOAT,6,0);
      ecpf10c10 = new FieldDef("ecpf10c10",FieldDef.FLOAT,6,0);
      ecpf10c11 = new FieldDef("ecpf10c11",FieldDef.FLOAT,6,0);
      ecpf10c12 = new FieldDef("ecpf10c12",FieldDef.FLOAT,6,0);
      ecpf11c1 = new FieldDef("ecpf11c1",FieldDef.FLOAT,6,0);
      ecpf11c2 = new FieldDef("ecpf11c2",FieldDef.FLOAT,6,0);
      ecpf11c3 = new FieldDef("ecpf11c3",FieldDef.FLOAT,6,0);
      ecpf11c4 = new FieldDef("ecpf11c4",FieldDef.FLOAT,6,0);
      ecpf11c5 = new FieldDef("ecpf11c5",FieldDef.FLOAT,6,0);
      ecpf11c6 = new FieldDef("ecpf11c6",FieldDef.FLOAT,6,0);
      ecpf11c7 = new FieldDef("ecpf11c7",FieldDef.FLOAT,6,0);
      ecpf11c8 = new FieldDef("ecpf11c8",FieldDef.FLOAT,6,0);
      ecpf11c9 = new FieldDef("ecpf11c9",FieldDef.FLOAT,6,0);
      ecpf11c10 = new FieldDef("ecpf11c10",FieldDef.FLOAT,6,0);
      ecpf11c11 = new FieldDef("ecpf11c11",FieldDef.FLOAT,6,0);
      ecpf11c12 = new FieldDef("ecpf11c12",FieldDef.FLOAT,6,0);
      ecpf12c1 = new FieldDef("ecpf12c1",FieldDef.FLOAT,6,0);
      ecpf12c2 = new FieldDef("ecpf12c2",FieldDef.FLOAT,6,0);
      ecpf12c3 = new FieldDef("ecpf12c3",FieldDef.FLOAT,6,0);
      ecpf12c4 = new FieldDef("ecpf12c4",FieldDef.FLOAT,6,0);
      ecpf12c5 = new FieldDef("ecpf12c5",FieldDef.FLOAT,6,0);
      ecpf12c6 = new FieldDef("ecpf12c6",FieldDef.FLOAT,6,0);
      ecpf12c7 = new FieldDef("ecpf12c7",FieldDef.FLOAT,6,0);
      ecpf12c8 = new FieldDef("ecpf12c8",FieldDef.FLOAT,6,0);
      ecpf12c9 = new FieldDef("ecpf12c9",FieldDef.FLOAT,6,0);
      ecpf12c10 = new FieldDef("ecpf12c10",FieldDef.FLOAT,6,0);
      ecpf12c11 = new FieldDef("ecpf12c11",FieldDef.FLOAT,6,0);
      ecpf12c12 = new FieldDef("ecpf12c12",FieldDef.FLOAT,6,0);
      ecpsalfin1 = new FieldDef("ecpsalfin1",FieldDef.FLOAT,6,0);
      ecpsalfin2 = new FieldDef("ecpsalfin2",FieldDef.FLOAT,6,0);
      ecpsalfin3 = new FieldDef("ecpsalfin3",FieldDef.FLOAT,6,0);
      ecpsalfin4 = new FieldDef("ecpsalfin4",FieldDef.FLOAT,6,0);
      ecpsalfin5 = new FieldDef("ecpsalfin5",FieldDef.FLOAT,6,0);
      ecpsalfin6 = new FieldDef("ecpsalfin6",FieldDef.FLOAT,6,0);
      ecpsalfin7 = new FieldDef("ecpsalfin7",FieldDef.FLOAT,6,0);
      ecpsalfin8 = new FieldDef("ecpsalfin8",FieldDef.FLOAT,6,0);
      ecpsalfin9 = new FieldDef("ecpsalfin9",FieldDef.FLOAT,6,0);
      ecpsalfin10 = new FieldDef("ecpsalfin10",FieldDef.FLOAT,6,0);
      ecpsalfin11 = new FieldDef("ecpsalfin11",FieldDef.FLOAT,6,0);
      ecpsalfin12 = new FieldDef("ecpsalfin12",FieldDef.FLOAT,6,0);
      ecpfp1c1 = new FieldDef("ecpfp1c1",FieldDef.FLOAT,6,0);
      ecpfp1c2 = new FieldDef("ecpfp1c2",FieldDef.FLOAT,6,0);
      ecpfp1c3 = new FieldDef("ecpfp1c3",FieldDef.FLOAT,6,0);
      ecpfp1c4 = new FieldDef("ecpfp1c4",FieldDef.FLOAT,6,0);
      ecpfp1c5 = new FieldDef("ecpfp1c5",FieldDef.FLOAT,6,0);
      ecpfp1c6 = new FieldDef("ecpfp1c6",FieldDef.FLOAT,6,0);
      ecpfp1c7 = new FieldDef("ecpfp1c7",FieldDef.FLOAT,6,0);
      ecpfp1c8 = new FieldDef("ecpfp1c8",FieldDef.FLOAT,6,0);
      ecpfp1c9 = new FieldDef("ecpfp1c9",FieldDef.FLOAT,6,0);
      ecpfp1c10 = new FieldDef("ecpfp1c10",FieldDef.FLOAT,6,0);
      ecpfp1c11 = new FieldDef("ecpfp1c11",FieldDef.FLOAT,6,0);
      ecpfp1c12 = new FieldDef("ecpfp1c12",FieldDef.FLOAT,6,0);
      ecpfp2c1 = new FieldDef("ecpfp2c1",FieldDef.FLOAT,6,0);
      ecpfp2c2 = new FieldDef("ecpfp2c2",FieldDef.FLOAT,6,0);
      ecpfp2c3 = new FieldDef("ecpfp2c3",FieldDef.FLOAT,6,0);
      ecpfp2c4 = new FieldDef("ecpfp2c4",FieldDef.FLOAT,6,0);
      ecpfp2c5 = new FieldDef("ecpfp2c5",FieldDef.FLOAT,6,0);
      ecpfp2c6 = new FieldDef("ecpfp2c6",FieldDef.FLOAT,6,0);
      ecpfp2c7 = new FieldDef("ecpfp2c7",FieldDef.FLOAT,6,0);
      ecpfp2c8 = new FieldDef("ecpfp2c8",FieldDef.FLOAT,6,0);
      ecpfp2c9 = new FieldDef("ecpfp2c9",FieldDef.FLOAT,6,0);
      ecpfp2c10 = new FieldDef("ecpfp2c10",FieldDef.FLOAT,6,0);
      ecpfp2c11 = new FieldDef("ecpfp2c11",FieldDef.FLOAT,6,0);
      ecpfp2c12 = new FieldDef("ecpfp2c12",FieldDef.FLOAT,6,0);
      ecpfp3c1 = new FieldDef("ecpfp3c1",FieldDef.FLOAT,6,0);
      ecpfp3c2 = new FieldDef("ecpfp3c2",FieldDef.FLOAT,6,0);
      ecpfp3c3 = new FieldDef("ecpfp3c3",FieldDef.FLOAT,6,0);
      ecpfp3c4 = new FieldDef("ecpfp3c4",FieldDef.FLOAT,6,0);
      ecpfp3c5 = new FieldDef("ecpfp3c5",FieldDef.FLOAT,6,0);
      ecpfp3c6 = new FieldDef("ecpfp3c6",FieldDef.FLOAT,6,0);
      ecpfp3c7 = new FieldDef("ecpfp3c7",FieldDef.FLOAT,6,0);
      ecpfp3c8 = new FieldDef("ecpfp3c8",FieldDef.FLOAT,6,0);
      ecpfp3c9 = new FieldDef("ecpfp3c9",FieldDef.FLOAT,6,0);
      ecpfp3c10 = new FieldDef("ecpfp3c10",FieldDef.FLOAT,6,0);
      ecpfp3c11 = new FieldDef("ecpfp3c11",FieldDef.FLOAT,6,0);
      ecpfp3c12 = new FieldDef("ecpfp3c12",FieldDef.FLOAT,6,0);
      ecpfp4c1 = new FieldDef("ecpfp4c1",FieldDef.FLOAT,6,0);
      ecpfp4c2 = new FieldDef("ecpfp4c2",FieldDef.FLOAT,6,0);
      ecpfp4c3 = new FieldDef("ecpfp4c3",FieldDef.FLOAT,6,0);
      ecpfp4c4 = new FieldDef("ecpfp4c4",FieldDef.FLOAT,6,0);
      ecpfp4c5 = new FieldDef("ecpfp4c5",FieldDef.FLOAT,6,0);
      ecpfp4c6 = new FieldDef("ecpfp4c6",FieldDef.FLOAT,6,0);
      ecpfp4c7 = new FieldDef("ecpfp4c7",FieldDef.FLOAT,6,0);
      ecpfp4c8 = new FieldDef("ecpfp4c8",FieldDef.FLOAT,6,0);
      ecpfp4c9 = new FieldDef("ecpfp4c9",FieldDef.FLOAT,6,0);
      ecpfp4c10 = new FieldDef("ecpfp4c10",FieldDef.FLOAT,6,0);
      ecpfp4c11 = new FieldDef("ecpfp4c11",FieldDef.FLOAT,6,0);
      ecpfp4c12 = new FieldDef("ecpfp4c12",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ecpempresa,
        ecpejercicio,
        ecpperiodo,
        ecpf1c1,
        ecpf1c2,
        ecpf1c3,
        ecpf1c4,
        ecpf1c5,
        ecpf1c6,
        ecpf1c7,
        ecpf1c8,
        ecpf1c9,
        ecpf1c10,
        ecpf1c11,
        ecpf1c12,
        ecpf2c1,
        ecpf2c2,
        ecpf2c3,
        ecpf2c4,
        ecpf2c5,
        ecpf2c6,
        ecpf2c7,
        ecpf2c8,
        ecpf2c9,
        ecpf2c10,
        ecpf2c11,
        ecpf2c12,
        ecpf3c1,
        ecpf3c2,
        ecpf3c3,
        ecpf3c4,
        ecpf3c5,
        ecpf3c6,
        ecpf3c7,
        ecpf3c8,
        ecpf3c9,
        ecpf3c10,
        ecpf3c11,
        ecpf3c12,
        ecpf4c1,
        ecpf4c2,
        ecpf4c3,
        ecpf4c4,
        ecpf4c5,
        ecpf4c6,
        ecpf4c7,
        ecpf4c8,
        ecpf4c9,
        ecpf4c10,
        ecpf4c11,
        ecpf4c12,
        ecpf5c1,
        ecpf5c2,
        ecpf5c3,
        ecpf5c4,
        ecpf5c5,
        ecpf5c6,
        ecpf5c7,
        ecpf5c8,
        ecpf5c9,
        ecpf5c10,
        ecpf5c11,
        ecpf5c12,
        ecpf6c1,
        ecpf6c2,
        ecpf6c3,
        ecpf6c4,
        ecpf6c5,
        ecpf6c6,
        ecpf6c7,
        ecpf6c8,
        ecpf6c9,
        ecpf6c10,
        ecpf6c11,
        ecpf6c12,
        ecpf7c1,
        ecpf7c2,
        ecpf7c3,
        ecpf7c4,
        ecpf7c5,
        ecpf7c6,
        ecpf7c7,
        ecpf7c8,
        ecpf7c9,
        ecpf7c10,
        ecpf7c11,
        ecpf7c12,
        ecpf8c1,
        ecpf8c2,
        ecpf8c3,
        ecpf8c4,
        ecpf8c5,
        ecpf8c6,
        ecpf8c7,
        ecpf8c8,
        ecpf8c9,
        ecpf8c10,
        ecpf8c11,
        ecpf8c12,
        ecpf9c1,
        ecpf9c2,
        ecpf9c3,
        ecpf9c4,
        ecpf9c5,
        ecpf9c6,
        ecpf9c7,
        ecpf9c8,
        ecpf9c9,
        ecpf9c10,
        ecpf9c11,
        ecpf9c12,
        ecpf10c1,
        ecpf10c2,
        ecpf10c3,
        ecpf10c4,
        ecpf10c5,
        ecpf10c6,
        ecpf10c7,
        ecpf10c8,
        ecpf10c9,
        ecpf10c10,
        ecpf10c11,
        ecpf10c12,
        ecpf11c1,
        ecpf11c2,
        ecpf11c3,
        ecpf11c4,
        ecpf11c5,
        ecpf11c6,
        ecpf11c7,
        ecpf11c8,
        ecpf11c9,
        ecpf11c10,
        ecpf11c11,
        ecpf11c12,
        ecpf12c1,
        ecpf12c2,
        ecpf12c3,
        ecpf12c4,
        ecpf12c5,
        ecpf12c6,
        ecpf12c7,
        ecpf12c8,
        ecpf12c9,
        ecpf12c10,
        ecpf12c11,
        ecpf12c12,
        ecpsalfin1,
        ecpsalfin2,
        ecpsalfin3,
        ecpsalfin4,
        ecpsalfin5,
        ecpsalfin6,
        ecpsalfin7,
        ecpsalfin8,
        ecpsalfin9,
        ecpsalfin10,
        ecpsalfin11,
        ecpsalfin12,
        ecpfp1c1,
        ecpfp1c2,
        ecpfp1c3,
        ecpfp1c4,
        ecpfp1c5,
        ecpfp1c6,
        ecpfp1c7,
        ecpfp1c8,
        ecpfp1c9,
        ecpfp1c10,
        ecpfp1c11,
        ecpfp1c12,
        ecpfp2c1,
        ecpfp2c2,
        ecpfp2c3,
        ecpfp2c4,
        ecpfp2c5,
        ecpfp2c6,
        ecpfp2c7,
        ecpfp2c8,
        ecpfp2c9,
        ecpfp2c10,
        ecpfp2c11,
        ecpfp2c12,
        ecpfp3c1,
        ecpfp3c2,
        ecpfp3c3,
        ecpfp3c4,
        ecpfp3c5,
        ecpfp3c6,
        ecpfp3c7,
        ecpfp3c8,
        ecpfp3c9,
        ecpfp3c10,
        ecpfp3c11,
        ecpfp3c12,
        ecpfp4c1,
        ecpfp4c2,
        ecpfp4c3,
        ecpfp4c4,
        ecpfp4c5,
        ecpfp4c6,
        ecpfp4c7,
        ecpfp4c8,
        ecpfp4c9,
        ecpfp4c10,
        ecpfp4c11,
        ecpfp4c12        
        };
      setColumns(array);
      FieldDef arrayf[] = {ecpempresa,ecpejercicio,ecpperiodo };
      setPrimaryKeys(arrayf);
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
    public TabCalendario(String name)
      {
      super(name);
      calcodigo = new FieldDef("calcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      calejercicio = new FieldDef("calejercicio",FieldDef.INTEGER,0);
      calautonomia = new FieldDef("calautonomia",FieldDef.INTEGER,0);
      calprovincia = new FieldDef("calprovincia",FieldDef.INTEGER,0);
      calmunicipio = new FieldDef("calmunicipio",FieldDef.INTEGER,0);
      calempresa = new FieldDef("calempresa",FieldDef.INTEGER,0);
      FieldDef array[] = {
        calcodigo,
        calejercicio,
        calautonomia,
        calprovincia,
        calmunicipio,
        calempresa        
        };
      setColumns(array);
      FieldDef arrayf[] = {calcodigo };
      setDescription("Calendario laboral");
      setPrimaryKeys(arrayf);
      calcodigo.setAutoIncrementable(true);
      calejercicio.setDescription("Ejercicio");
      calautonomia.setDescription("Autonomia");
      calprovincia.setDescription("Provincia");
      calmunicipio.setDescription("Municipio");
      calempresa.setDescription("Empresa");
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
      setDescription("Detalle calendario");
      setPrimaryKeys(arrayf);
      caldperiodo.setDescription("Periodo");
      calddia.setDescription("Día");
      caldtipo.setDescription("Tipo");
      }
    }
    
  public class TabAcum347 extends TableDef
    {
    // Campos
    public FieldDef a347codigo;
    public FieldDef a347empresa;
    public FieldDef a347ejercicio;
    public FieldDef a347clave;
    public FieldDef a347nif;
    public FieldDef a347nombre;
    public FieldDef a347provincia;
    public FieldDef a347pais;
    public FieldDef a347importe;
    public FieldDef a347importeef;
    public FieldDef a347importelc;
    public FieldDef a347cuenta;
    public FieldDef a347subcuenta;
    public FieldDef a347local;
    public FieldDef a347tipogen;
    public TabAcum347(String name)
      {
      super(name);
      a347codigo = new FieldDef("a347codigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      a347empresa = new FieldDef("a347empresa",FieldDef.INTEGER,0);
      a347ejercicio = new FieldDef("a347ejercicio",FieldDef.INTEGER,0);
      a347clave = new FieldDef("a347clave",FieldDef.CHAR,1);
      a347nif = new FieldDef("a347nif",FieldDef.CHAR,15);
      a347nombre = new FieldDef("a347nombre",FieldDef.CHAR,40);
      a347provincia = new FieldDef("a347provincia",FieldDef.INTEGER,0);
      a347pais = new FieldDef("a347pais",FieldDef.CHAR,2);
      a347importe = new FieldDef("a347importe",FieldDef.FLOAT,6,0);
      a347importeef = new FieldDef("a347importeef",FieldDef.FLOAT,6,0);
      a347importelc = new FieldDef("a347importelc",FieldDef.FLOAT,6,0);
      a347cuenta = new FieldDef("a347cuenta",FieldDef.CHAR,4);
      a347subcuenta = new FieldDef("a347subcuenta",FieldDef.CHAR,12);
      a347local = new FieldDef("a347local",FieldDef.CHAR,1);
      a347tipogen = new FieldDef("a347tipogen",FieldDef.CHAR,1);
      FieldDef array[] = {
        a347codigo,
        a347empresa,
        a347ejercicio,
        a347clave,
        a347nif,
        a347nombre,
        a347provincia,
        a347pais,
        a347importe,
        a347importeef,
        a347importelc,
        a347cuenta,
        a347subcuenta,
        a347local,
        a347tipogen        
        };
      setColumns(array);
      FieldDef arrayf[] = {a347codigo };
      setPrimaryKeys(arrayf);
      a347codigo.setAutoIncrementable(true);
      }
    }
    
  public class TabAcum130 extends TableDef
    {
    // Campos
    public FieldDef a130empresa;
    public FieldDef a130ejercicio;
    public FieldDef a130tipo;
    public FieldDef a130linea;
    public FieldDef a130cuenta;
    public FieldDef a130dh;
    public TabAcum130(String name)
      {
      super(name);
      a130empresa = new FieldDef("a130empresa",FieldDef.INTEGER,0);
      a130ejercicio = new FieldDef("a130ejercicio",FieldDef.INTEGER,0);
      a130tipo = new FieldDef("a130tipo",FieldDef.CHAR,1);
      a130linea = new FieldDef("a130linea",FieldDef.INTEGER,0);
      a130cuenta = new FieldDef("a130cuenta",FieldDef.CHAR,4);
      a130dh = new FieldDef("a130dh",FieldDef.CHAR,1);
      FieldDef array[] = {
        a130empresa,
        a130ejercicio,
        a130tipo,
        a130linea,
        a130cuenta,
        a130dh        
        };
      setColumns(array);
      FieldDef arrayf[] = {a130empresa,a130ejercicio,a130tipo,a130linea,a130cuenta };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSocis130 extends TableDef
    {
    // Campos
    public FieldDef s130codigo;
    public FieldDef s130empresa;
    public FieldDef s130ejercicio;
    public FieldDef s130cdp;
    public FieldDef s130nif;
    public FieldDef s130nombre;
    public FieldDef s130port1;
    public FieldDef s130port2;
    public FieldDef s130port3;
    public FieldDef s130port4;
    public TabSocis130(String name)
      {
      super(name);
      s130codigo = new FieldDef("s130codigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      s130empresa = new FieldDef("s130empresa",FieldDef.INTEGER,0);
      s130ejercicio = new FieldDef("s130ejercicio",FieldDef.INTEGER,0);
      s130cdp = new FieldDef("s130cdp",FieldDef.CHAR,12);
      s130nif = new FieldDef("s130nif",FieldDef.CHAR,15);
      s130nombre = new FieldDef("s130nombre",FieldDef.CHAR,150);
      s130port1 = new FieldDef("s130port1",FieldDef.FLOAT,6,0);
      s130port2 = new FieldDef("s130port2",FieldDef.FLOAT,6,0);
      s130port3 = new FieldDef("s130port3",FieldDef.FLOAT,6,0);
      s130port4 = new FieldDef("s130port4",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        s130codigo,
        s130empresa,
        s130ejercicio,
        s130cdp,
        s130nif,
        s130nombre,
        s130port1,
        s130port2,
        s130port3,
        s130port4        
        };
      setColumns(array);
      FieldDef arrayf[] = {s130codigo };
      setPrimaryKeys(arrayf);
      s130codigo.setAutoIncrementable(true);
      }
    }
    
  public CatCtasp()
    {
    tabgycauto = new TabGycauto("gycauto");
    tabparamlis = new TabParamlis("paramlis");
    tabdiarios = new TabDiarios("diarios");
    tabirpf = new TabIrpf("irpf");
    tabiva = new TabIva("iva");
    tabconceptos = new TabConceptos("conceptos");
    tabparametros = new TabParametros("parametros");
    tabinciden = new TabInciden("inciden");
    tabbdejer = new TabBdejer("bdejer");
    tabvtoscond = new TabVtoscond("vtoscond");
    tabestructura = new TabEstructura("estructura");
    tabpcepigrafe = new TabPcepigrafe("pcepigrafe");
    tabpcgrupos = new TabPcgrupos("pcgrupos");
    tabempresa = new TabEmpresa("empresa");
    tabejercicio = new TabEjercicio("ejercicio");
    tabdepartamentos = new TabDepartamentos("departamentos");
    tabproyectos = new TabProyectos("proyectos");
    tabactividades = new TabActividades("actividades");
    tabseries = new TabSeries("series");
    tabprefijos = new TabPrefijos("prefijos");
    tabpcuentas = new TabPcuentas("pcuentas");
    tabpcacumulados = new TabPcacumulados("pcacumulados");
    tabpresupuesto = new TabPresupuesto("presupuesto");
    tabespeciales = new TabEspeciales("especiales");
    tabpcinmov = new TabPcinmov("pcinmov");
    tabpcmoranual = new TabPcmoranual("pcmoranual");
    tabpclocales = new TabPclocales("pclocales");
    tabratiosc = new TabRatiosc("ratiosc");
    tabratiosl = new TabRatiosl("ratiosl");
    tabtipcabecera = new TabTipcabecera("tipcabecera");
    tabtiplineas = new TabTiplineas("tiplineas");
    tabtipbases = new TabTipbases("tipbases");
    tabasientos = new TabAsientos("asientos");
    tabcobropago = new TabCobropago("cobropago");
    tabivacabecera = new TabIvacabecera("ivacabecera");
    tabivalineas = new TabIvalineas("ivalineas");
    tabimportcab = new TabImportcab("importcab");
    tabimportlin = new TabImportlin("importlin");
    tabtempbalan = new TabTempbalan("tempbalan");
    tabtempdescua = new TabTempdescua("tempdescua");
    tabtarea = new TabTarea("tarea");
    tabtareadet = new TabTareadet("tareadet");
    tabtareas = new TabTareas("tareas");
    tabperasiento = new TabPerasiento("perasiento");
    tabperlineas = new TabPerlineas("perlineas");
    tabperciva = new TabPerciva("perciva");
    tabperliva = new TabPerliva("perliva");
    tabayudatxt = new TabAyudatxt("ayudatxt");
    tabimportdef = new TabImportdef("importdef");
    tabimportdet = new TabImportdet("importdet");
    tabimpasientos = new TabImpasientos("impasientos");
    tabimpivacab = new TabImpivacab("impivacab");
    tabimpivalineas = new TabImpivalineas("impivalineas");
    tabbds = new TabBds("bds");
    tabinfcabecera = new TabInfcabecera("infcabecera");
    tabinfcolumnas = new TabInfcolumnas("infcolumnas");
    tabinfoperacion = new TabInfoperacion("infoperacion");
    tabnpgequival = new TabNpgequival("npgequival");
    tabnpgcuenta = new TabNpgcuenta("npgcuenta");
    tabnpgestruct = new TabNpgestruct("npgestruct");
    tabnpgepigraf = new TabNpgepigraf("npgepigraf");
    tabtablaequival = new TabTablaequival("tablaequival");
    tabnotas = new TabNotas("notas");
    tabcuentanota = new TabCuentanota("cuentanota");
    tabestadoflujo = new TabEstadoflujo("estadoflujo");
    tabcambiospat = new TabCambiospat("cambiospat");
    tabestcampat = new TabEstcampat("estcampat");
    tabcalendario = new TabCalendario("calendario");
    tabcalendariodet = new TabCalendariodet("calendariodet");
    tabacum347 = new TabAcum347("acum347");
    tabacum130 = new TabAcum130("acum130");
    tabsocis130 = new TabSocis130("socis130");
    TableDef array[] = {
      tabgycauto,
      tabparamlis,
      tabdiarios,
      tabirpf,
      tabiva,
      tabconceptos,
      tabparametros,
      tabinciden,
      tabbdejer,
      tabvtoscond,
      tabestructura,
      tabpcepigrafe,
      tabpcgrupos,
      tabempresa,
      tabejercicio,
      tabdepartamentos,
      tabproyectos,
      tabactividades,
      tabseries,
      tabprefijos,
      tabpcuentas,
      tabpcacumulados,
      tabpresupuesto,
      tabespeciales,
      tabpcinmov,
      tabpcmoranual,
      tabpclocales,
      tabratiosc,
      tabratiosl,
      tabtipcabecera,
      tabtiplineas,
      tabtipbases,
      tabasientos,
      tabcobropago,
      tabivacabecera,
      tabivalineas,
      tabimportcab,
      tabimportlin,
      tabtempbalan,
      tabtempdescua,
      tabtarea,
      tabtareadet,
      tabtareas,
      tabperasiento,
      tabperlineas,
      tabperciva,
      tabperliva,
      tabayudatxt,
      tabimportdef,
      tabimportdet,
      tabimpasientos,
      tabimpivacab,
      tabimpivalineas,
      tabbds,
      tabinfcabecera,
      tabinfcolumnas,
      tabinfoperacion,
      tabnpgequival,
      tabnpgcuenta,
      tabnpgestruct,
      tabnpgepigraf,
      tabtablaequival,
      tabnotas,
      tabcuentanota,
      tabestadoflujo,
      tabcambiospat,
      tabestcampat,
      tabcalendario,
      tabcalendariodet,
      tabacum347,
      tabacum130,
      tabsocis130      
      };
    setTables(array);
    FieldDef tabempresaArrayf1[] = { tabempresa.empirpfgral };
    FieldDef tabempresaArrayf2[] = { tabempresa.empivagral };
    ForeignKey tabempresaArrayfk[] = { 
      new ForeignKey(tabirpf,tabempresaArrayf1),
      new ForeignKey(tabiva,tabempresaArrayf2)      
      };
    tabempresa.setForeignKeys(tabempresaArrayfk);
    FieldDef tabejercicioArrayf1[] = { tabejercicio.ejeempresa };
    ForeignKey tabejercicioArrayfk[] = { 
      new ForeignKey(tabempresa,tabejercicioArrayf1)      
      };
    tabejercicio.setForeignKeys(tabejercicioArrayfk);
    FieldDef tabdepartamentosArrayf1[] = { tabdepartamentos.depempresa };
    ForeignKey tabdepartamentosArrayfk[] = { 
      new ForeignKey(tabempresa,tabdepartamentosArrayf1)      
      };
    tabdepartamentos.setForeignKeys(tabdepartamentosArrayfk);
    FieldDef tabproyectosArrayf1[] = { tabproyectos.proempresa };
    ForeignKey tabproyectosArrayfk[] = { 
      new ForeignKey(tabempresa,tabproyectosArrayf1)      
      };
    tabproyectos.setForeignKeys(tabproyectosArrayfk);
    FieldDef tabactividadesArrayf1[] = { tabactividades.actempresa };
    ForeignKey tabactividadesArrayfk[] = { 
      new ForeignKey(tabempresa,tabactividadesArrayf1)      
      };
    tabactividades.setForeignKeys(tabactividadesArrayfk);
    FieldDef tabseriesArrayf1[] = { tabseries.serempresa };
    FieldDef tabseriesArrayf2[] = { tabseries.serempresa,tabseries.serejercicio };
    ForeignKey tabseriesArrayfk[] = { 
      new ForeignKey(tabempresa,tabseriesArrayf1),
      new ForeignKey(tabejercicio,tabseriesArrayf2)      
      };
    tabseries.setForeignKeys(tabseriesArrayfk);
    FieldDef tabprefijosArrayf1[] = { tabprefijos.prfempresa };
    FieldDef tabprefijosArrayf2[] = { tabprefijos.prfempresa,tabprefijos.prfejercicio };
    ForeignKey tabprefijosArrayfk[] = { 
      new ForeignKey(tabempresa,tabprefijosArrayf1),
      new ForeignKey(tabejercicio,tabprefijosArrayf2)      
      };
    tabprefijos.setForeignKeys(tabprefijosArrayfk);
    FieldDef tabpcuentasArrayf1[] = { tabpcuentas.pcuempresa };
    FieldDef tabpcuentasArrayf2[] = { tabpcuentas.pcuempresa,tabpcuentas.pcuejercicio };
    FieldDef tabpcuentasArrayf3[] = { tabpcuentas.pcucodiva };
    FieldDef tabpcuentasArrayf4[] = { tabpcuentas.pcucodirpf };
    FieldDef tabpcuentasArrayf5[] = { tabpcuentas.pcucodvto };
    ForeignKey tabpcuentasArrayfk[] = { 
      new ForeignKey(tabempresa,tabpcuentasArrayf1),
      new ForeignKey(tabejercicio,tabpcuentasArrayf2),
      new ForeignKey(tabiva,tabpcuentasArrayf3),
      new ForeignKey(tabirpf,tabpcuentasArrayf4),
      new ForeignKey(tabvtoscond,tabpcuentasArrayf5)      
      };
    tabpcuentas.setForeignKeys(tabpcuentasArrayfk);
    FieldDef tabpcacumuladosArrayf1[] = { tabpcacumulados.pcaempresa };
    FieldDef tabpcacumuladosArrayf2[] = { tabpcacumulados.pcaempresa,tabpcacumulados.pcaejercicio };
    FieldDef tabpcacumuladosArrayf3[] = { tabpcacumulados.pcaempresa,tabpcacumulados.pcaejercicio,tabpcacumulados.pcacuenta,tabpcacumulados.pcasubcuenta };
    ForeignKey tabpcacumuladosArrayfk[] = { 
      new ForeignKey(tabempresa,tabpcacumuladosArrayf1),
      new ForeignKey(tabejercicio,tabpcacumuladosArrayf2),
      new ForeignKey(tabpcuentas,tabpcacumuladosArrayf3)      
      };
    tabpcacumulados.setForeignKeys(tabpcacumuladosArrayfk);
    FieldDef tabpresupuestoArrayf1[] = { tabpresupuesto.preempresa };
    FieldDef tabpresupuestoArrayf2[] = { tabpresupuesto.preempresa,tabpresupuesto.preejercicio };
    FieldDef tabpresupuestoArrayf3[] = { tabpresupuesto.preempresa,tabpresupuesto.preejercicio,tabpresupuesto.precuenta,tabpresupuesto.presubcuenta };
    ForeignKey tabpresupuestoArrayfk[] = { 
      new ForeignKey(tabempresa,tabpresupuestoArrayf1),
      new ForeignKey(tabejercicio,tabpresupuestoArrayf2),
      new ForeignKey(tabpcuentas,tabpresupuestoArrayf3)      
      };
    tabpresupuesto.setForeignKeys(tabpresupuestoArrayfk);
    FieldDef tabespecialesArrayf1[] = { tabespeciales.espempresa };
    FieldDef tabespecialesArrayf2[] = { tabespeciales.espempresa,tabespeciales.espejercicio };
    FieldDef tabespecialesArrayf3[] = { tabespeciales.espempresa,tabespeciales.espejercicio,tabespeciales.espcuenta,tabespeciales.espsubcuenta };
    ForeignKey tabespecialesArrayfk[] = { 
      new ForeignKey(tabempresa,tabespecialesArrayf1),
      new ForeignKey(tabejercicio,tabespecialesArrayf2),
      new ForeignKey(tabpcuentas,tabespecialesArrayf3)      
      };
    tabespeciales.setForeignKeys(tabespecialesArrayfk);
    FieldDef tabpcinmovArrayf1[] = { tabpcinmov.pciempresa };
    FieldDef tabpcinmovArrayf2[] = { tabpcinmov.pciempresa,tabpcinmov.pciejercicio,tabpcinmov.pcicuenta,tabpcinmov.pcisubcuenta };
    ForeignKey tabpcinmovArrayfk[] = { 
      new ForeignKey(tabempresa,tabpcinmovArrayf1),
      new ForeignKey(tabpcuentas,tabpcinmovArrayf2)      
      };
    tabpcinmov.setForeignKeys(tabpcinmovArrayfk);
    FieldDef tabpcmoranualArrayf1[] = { tabpcmoranual.pcmelemento };
    ForeignKey tabpcmoranualArrayfk[] = { 
      new ForeignKey(tabpcinmov,tabpcmoranualArrayf1)      
      };
    tabpcmoranual.setForeignKeys(tabpcmoranualArrayfk);
    FieldDef tabpclocalesArrayf1[] = { tabpclocales.pclempresa };
    FieldDef tabpclocalesArrayf2[] = { tabpclocales.pclempresa,tabpclocales.pclejercicio };
    FieldDef tabpclocalesArrayf3[] = { tabpclocales.pclempresa,tabpclocales.pclejercicio,tabpclocales.pclcuenta,tabpclocales.pclsubcuenta };
    ForeignKey tabpclocalesArrayfk[] = { 
      new ForeignKey(tabempresa,tabpclocalesArrayf1),
      new ForeignKey(tabejercicio,tabpclocalesArrayf2),
      new ForeignKey(tabpcuentas,tabpclocalesArrayf3)      
      };
    tabpclocales.setForeignKeys(tabpclocalesArrayfk);
    FieldDef tabratioslArrayf1[] = { tabratiosl.ralcodigo };
    ForeignKey tabratioslArrayfk[] = { 
      new ForeignKey(tabratiosc,tabratioslArrayf1)      
      };
    tabratiosl.setForeignKeys(tabratioslArrayfk);
    FieldDef tabtiplineasArrayf1[] = { tabtiplineas.tilcodigo };
    ForeignKey tabtiplineasArrayfk[] = { 
      new ForeignKey(tabtipcabecera,tabtiplineasArrayf1)      
      };
    tabtiplineas.setForeignKeys(tabtiplineasArrayfk);
    FieldDef tabtipbasesArrayf1[] = { tabtipbases.tibcodigo };
    FieldDef tabtipbasesArrayf2[] = { tabtipbases.tibcodigo,tabtipbases.tibnumero };
    ForeignKey tabtipbasesArrayfk[] = { 
      new ForeignKey(tabtipcabecera,tabtipbasesArrayf1),
      new ForeignKey(tabtiplineas,tabtipbasesArrayf2)      
      };
    tabtipbases.setForeignKeys(tabtipbasesArrayfk);
    FieldDef tabasientosArrayf1[] = { tabasientos.asiempresa };
    FieldDef tabasientosArrayf2[] = { tabasientos.asiempresa,tabasientos.asiejercicio };
    FieldDef tabasientosArrayf3[] = { tabasientos.asiempresa,tabasientos.asiejercicio,tabasientos.asicuenta,tabasientos.asisubcuenta };
    FieldDef tabasientosArrayf4[] = { tabasientos.asiempresa,tabasientos.asiejercicio,tabasientos.asicontraconta,tabasientos.asicontrasub };
    FieldDef tabasientosArrayf5[] = { tabasientos.asidiario };
    FieldDef tabasientosArrayf6[] = { tabasientos.asidiario2 };
    FieldDef tabasientosArrayf7[] = { tabasientos.asiempresa,tabasientos.asiproyecto };
    FieldDef tabasientosArrayf8[] = { tabasientos.asiempresa,tabasientos.asidepartamento };
    ForeignKey tabasientosArrayfk[] = { 
      new ForeignKey(tabempresa,tabasientosArrayf1),
      new ForeignKey(tabejercicio,tabasientosArrayf2),
      new ForeignKey(tabpcuentas,tabasientosArrayf3),
      new ForeignKey(tabpcuentas,tabasientosArrayf4),
      new ForeignKey(tabdiarios,tabasientosArrayf5),
      new ForeignKey(tabdiarios,tabasientosArrayf6),
      new ForeignKey(tabproyectos,tabasientosArrayf7),
      new ForeignKey(tabdepartamentos,tabasientosArrayf8)      
      };
    tabasientos.setForeignKeys(tabasientosArrayfk);
    FieldDef tabcobropagoArrayf1[] = { tabcobropago.cobempresa };
    FieldDef tabcobropagoArrayf2[] = { tabcobropago.cobempresa,tabcobropago.cobejercicio };
    FieldDef tabcobropagoArrayf3[] = { tabcobropago.cobempresa,tabcobropago.cobejercicio,tabcobropago.cobcuenta,tabcobropago.cobsubcuenta };
    FieldDef tabcobropagoArrayf4[] = { tabcobropago.cobempresa,tabcobropago.cobejercicio,tabcobropago.cobcuentaban,tabcobropago.cobsubctaban };
    FieldDef tabcobropagoArrayf5[] = { tabcobropago.cobasicodi };
    ForeignKey tabcobropagoArrayfk[] = { 
      new ForeignKey(tabempresa,tabcobropagoArrayf1),
      new ForeignKey(tabejercicio,tabcobropagoArrayf2),
      new ForeignKey(tabpcuentas,tabcobropagoArrayf3),
      new ForeignKey(tabpcuentas,tabcobropagoArrayf4),
      new ForeignKey(tabasientos,tabcobropagoArrayf5)      
      };
    tabcobropago.setForeignKeys(tabcobropagoArrayfk);
    FieldDef tabivacabeceraArrayf1[] = { tabivacabecera.civasicodi };
    FieldDef tabivacabeceraArrayf2[] = { tabivacabecera.civempresa };
    FieldDef tabivacabeceraArrayf3[] = { tabivacabecera.civempresa,tabivacabecera.civejercicio };
    ForeignKey tabivacabeceraArrayfk[] = { 
      new ForeignKey(tabasientos,tabivacabeceraArrayf1),
      new ForeignKey(tabempresa,tabivacabeceraArrayf2),
      new ForeignKey(tabejercicio,tabivacabeceraArrayf3)      
      };
    tabivacabecera.setForeignKeys(tabivacabeceraArrayfk);
    FieldDef tabivalineasArrayf1[] = { tabivalineas.livcodi };
    FieldDef tabivalineasArrayf2[] = { tabivalineas.livasto };
    ForeignKey tabivalineasArrayfk[] = { 
      new ForeignKey(tabivacabecera,tabivalineasArrayf1),
      new ForeignKey(tabasientos,tabivalineasArrayf2)      
      };
    tabivalineas.setForeignKeys(tabivalineasArrayfk);
    FieldDef tabimportlinArrayf1[] = { tabimportlin.imdcodigo };
    ForeignKey tabimportlinArrayfk[] = { 
      new ForeignKey(tabimportcab,tabimportlinArrayf1)      
      };
    tabimportlin.setForeignKeys(tabimportlinArrayfk);
    FieldDef tabtempbalanArrayf1[] = { tabtempbalan.temempresa };
    FieldDef tabtempbalanArrayf2[] = { tabtempbalan.temempresa,tabtempbalan.temejercicio };
    FieldDef tabtempbalanArrayf3[] = { tabtempbalan.temempresa,tabtempbalan.temejercicio,tabtempbalan.temcuenta,tabtempbalan.temsubcuenta };
    FieldDef tabtempbalanArrayf4[] = { tabtempbalan.temempresa,tabtempbalan.temproyecto };
    FieldDef tabtempbalanArrayf5[] = { tabtempbalan.temempresa,tabtempbalan.temdepartamento };
    ForeignKey tabtempbalanArrayfk[] = { 
      new ForeignKey(tabempresa,tabtempbalanArrayf1),
      new ForeignKey(tabejercicio,tabtempbalanArrayf2),
      new ForeignKey(tabpcuentas,tabtempbalanArrayf3),
      new ForeignKey(tabproyectos,tabtempbalanArrayf4),
      new ForeignKey(tabdepartamentos,tabtempbalanArrayf5)      
      };
    tabtempbalan.setForeignKeys(tabtempbalanArrayfk);
    FieldDef tabtempdescuaArrayf1[] = { tabtempdescua.teddiario };
    FieldDef tabtempdescuaArrayf2[] = { tabtempdescua.tedempresa };
    FieldDef tabtempdescuaArrayf3[] = { tabtempdescua.tedempresa,tabtempdescua.tedejercicio };
    ForeignKey tabtempdescuaArrayfk[] = { 
      new ForeignKey(tabdiarios,tabtempdescuaArrayf1),
      new ForeignKey(tabempresa,tabtempdescuaArrayf2),
      new ForeignKey(tabejercicio,tabtempdescuaArrayf3)      
      };
    tabtempdescua.setForeignKeys(tabtempdescuaArrayfk);
    FieldDef tabtareadetArrayf1[] = { tabtareadet.tdtarea };
    ForeignKey tabtareadetArrayfk[] = { 
      new ForeignKey(tabtarea,tabtareadetArrayf1)      
      };
    tabtareadet.setForeignKeys(tabtareadetArrayfk);
    FieldDef tabtareasArrayf1[] = { tabtareas.tsempresa };
    FieldDef tabtareasArrayf2[] = { tabtareas.tstarea };
    ForeignKey tabtareasArrayfk[] = { 
      new ForeignKey(tabempresa,tabtareasArrayf1),
      new ForeignKey(tabtarea,tabtareasArrayf2)      
      };
    tabtareas.setForeignKeys(tabtareasArrayfk);
    FieldDef tabperasientoArrayf1[] = { tabperasiento.aspempresa };
    ForeignKey tabperasientoArrayfk[] = { 
      new ForeignKey(tabempresa,tabperasientoArrayf1)      
      };
    tabperasiento.setForeignKeys(tabperasientoArrayfk);
    FieldDef tabperlineasArrayf1[] = { tabperlineas.pelempresa,tabperlineas.pelejercicio,tabperlineas.pelcodigo };
    FieldDef tabperlineasArrayf2[] = { tabperlineas.pelempresa,tabperlineas.pelejercicio,tabperlineas.pelcuenta,tabperlineas.pelsubcuenta };
    FieldDef tabperlineasArrayf3[] = { tabperlineas.peldiario };
    FieldDef tabperlineasArrayf4[] = { tabperlineas.pelempresa,tabperlineas.pelproyecto };
    FieldDef tabperlineasArrayf5[] = { tabperlineas.pelempresa,tabperlineas.peldepartamento };
    ForeignKey tabperlineasArrayfk[] = { 
      new ForeignKey(tabperasiento,tabperlineasArrayf1),
      new ForeignKey(tabpcuentas,tabperlineasArrayf2),
      new ForeignKey(tabdiarios,tabperlineasArrayf3),
      new ForeignKey(tabproyectos,tabperlineasArrayf4),
      new ForeignKey(tabdepartamentos,tabperlineasArrayf5)      
      };
    tabperlineas.setForeignKeys(tabperlineasArrayfk);
    FieldDef tabpercivaArrayf1[] = { tabperciva.apcempresa,tabperciva.apcejercicio,tabperciva.apccodigo };
    FieldDef tabpercivaArrayf2[] = { tabperciva.apcempresa,tabperciva.apcejercicio,tabperciva.apccodigo,tabperciva.apclinea };
    ForeignKey tabpercivaArrayfk[] = { 
      new ForeignKey(tabperasiento,tabpercivaArrayf1),
      new ForeignKey(tabperlineas,tabpercivaArrayf2)      
      };
    tabperciva.setForeignKeys(tabpercivaArrayfk);
    FieldDef tabperlivaArrayf1[] = { tabperliva.apiempresa,tabperliva.apiejercicio,tabperliva.apicodigo,tabperliva.apilinea };
    FieldDef tabperlivaArrayf2[] = { tabperliva.apiempresa,tabperliva.apiejercicio,tabperliva.apicodigo,tabperliva.apilinea };
    FieldDef tabperlivaArrayf3[] = { tabperliva.apiempresa,tabperliva.apiejercicio,tabperliva.apicodigo };
    FieldDef tabperlivaArrayf4[] = { tabperliva.apicodiva };
    FieldDef tabperlivaArrayf5[] = { tabperliva.apicodiirpf };
    ForeignKey tabperlivaArrayfk[] = { 
      new ForeignKey(tabperlineas,tabperlivaArrayf1),
      new ForeignKey(tabperciva,tabperlivaArrayf2),
      new ForeignKey(tabperasiento,tabperlivaArrayf3),
      new ForeignKey(tabiva,tabperlivaArrayf4),
      new ForeignKey(tabirpf,tabperlivaArrayf5)      
      };
    tabperliva.setForeignKeys(tabperlivaArrayfk);
    FieldDef tabimportdetArrayf1[] = { tabimportdet.imfident };
    ForeignKey tabimportdetArrayfk[] = { 
      new ForeignKey(tabimportdef,tabimportdetArrayf1)      
      };
    tabimportdet.setForeignKeys(tabimportdetArrayfk);
    FieldDef tabimpivacabArrayf1[] = { tabimpivacab.icivasicodi };
    ForeignKey tabimpivacabArrayfk[] = { 
      new ForeignKey(tabimpasientos,tabimpivacabArrayf1)      
      };
    tabimpivacab.setForeignKeys(tabimpivacabArrayfk);
    FieldDef tabimpivalineasArrayf1[] = { tabimpivalineas.ilivcodi };
    FieldDef tabimpivalineasArrayf2[] = { tabimpivalineas.ilivasto };
    ForeignKey tabimpivalineasArrayfk[] = { 
      new ForeignKey(tabimpivacab,tabimpivalineasArrayf1),
      new ForeignKey(tabimpasientos,tabimpivalineasArrayf2)      
      };
    tabimpivalineas.setForeignKeys(tabimpivalineasArrayfk);
    FieldDef tabinfcolumnasArrayf1[] = { tabinfcolumnas.iflcodicab };
    ForeignKey tabinfcolumnasArrayfk[] = { 
      new ForeignKey(tabinfcabecera,tabinfcolumnasArrayf1)      
      };
    tabinfcolumnas.setForeignKeys(tabinfcolumnasArrayfk);
    FieldDef tabinfoperacionArrayf1[] = { tabinfoperacion.ifocodicab,tabinfoperacion.ifoordencol };
    ForeignKey tabinfoperacionArrayfk[] = { 
      new ForeignKey(tabinfcolumnas,tabinfoperacionArrayf1)      
      };
    tabinfoperacion.setForeignKeys(tabinfoperacionArrayfk);
    FieldDef tabcuentanotaArrayf1[] = { tabcuentanota.cnocodinota };
    ForeignKey tabcuentanotaArrayfk[] = { 
      new ForeignKey(tabcuentanota,tabcuentanotaArrayf1)      
      };
    tabcuentanota.setForeignKeys(tabcuentanotaArrayfk);
    FieldDef tabcalendariodetArrayf1[] = { tabcalendariodet.caldcodigo };
    ForeignKey tabcalendariodetArrayfk[] = { 
      new ForeignKey(tabcalendario,tabcalendariodetArrayf1)      
      };
    tabcalendariodet.setForeignKeys(tabcalendariodetArrayfk);
    }
  }
  
