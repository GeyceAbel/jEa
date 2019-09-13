// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Fri Sep 13 10:03:15 CEST 2019
// 
// Aplicación: easp
// 
package mae.easp.db;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.general.*;
// 
public class CatModgen extends Catalog
    {
    // tablas
    public TabGycauto tabgycauto;
    public TabModelos tabmodelos;
    public TabCdeflis tabcdeflis;
    public TabDeflis tabdeflis;
    public TabCondlist tabcondlist;
    public TabModestado tabmodestado;
    public TabModnifcdp tabmodnifcdp;
    public TabModaplic tabmodaplic;
    public TabModprograma tabmodprograma;
    public TabPresentador tabpresentador;
    public TabImportacion tabimportacion;
    public TabImport100200jr tabimport100200jr;
    public TabTiposunid tabtiposunid;
    public TabModirpfc tabmodirpfc;
    public TabModirpfl tabmodirpfl;
    public TabModivac tabmodivac;
    public TabModival tabmodival;
    public TabModivac2 tabmodivac2;
    public TabModival2 tabmodival2;
    public TabModivaagr tabmodivaagr;
    public TabModacteo tabmodacteo;
    public TabModirpf tabmodirpf;
    public TabModiva tabmodiva;
    public TabModuni tabmoduni;
    public TabModagriva tabmodagriva;
    public TabPaisaeat tabpaisaeat;
    public TabPaisterri tabpaisterri;
    public TabBds tabbds;
    public TabModirpfagr tabmodirpfagr;
    public TabValoresmod tabvaloresmod;
    public TabCodelecmat tabcodelecmat;
    public TabImportcfg tabimportcfg;
    public TabImportmod tabimportmod;
    public TabImportrel tabimportrel;
    public TabImporthis tabimporthis;
    public TabImportdp tabimportdp;
    public TabQuefrase tabquefrase;
    public TabQuevariables tabquevariables;
    public TabQuetabla tabquetabla;
    public TabQuecolumn tabquecolumn;
    public TabSeleccion tabseleccion;
    public TabPpbbcfg tabppbbcfg;
    public TabPpbbbanco tabppbbbanco;
    public TabLogimpmodaff tablogimpmodaff;
    public TabMod720i tabmod720i;
    public TabMod720m tabmod720m;
    public TabParamlis tabparamlis;
    public TabIffacturas tabiffacturas;
    public TabDeflis303 tabdeflis303;
    public TabAeatfirmamod tabaeatfirmamod;
    public TabModrdtoagr tabmodrdtoagr;
    public TabModingagr tabmodingagr;
    public TabDeflis111 tabdeflis111;
    public TabDeflis115 tabdeflis115;
    public TabDeflis123 tabdeflis123;
    public TabDeflis216 tabdeflis216;
    public TabDeflis130 tabdeflis130;
    public TabDeflis131 tabdeflis131;
    public TabDeflis202 tabdeflis202;
    public TabDeflis222 tabdeflis222;
    public TabDeflis308 tabdeflis308;
    public TabDeflis309 tabdeflis309;
    public TabDeflis353 tabdeflis353;
    public TabModcalendario tabmodcalendario;
    public TabDeflis390 tabdeflis390;
    public TabDeflis282 tabdeflis282;
    public TabMod210r tabmod210r;
    public TabDeflis415 tabdeflis415;
    public TabSiiexpedidas tabsiiexpedidas;
    public TabSiiexpedidasdet tabsiiexpedidasdet;
    public TabSiirecibidas tabsiirecibidas;
    public TabSiirecibidasdet tabsiirecibidasdet;
    public TabSiibienesinv tabsiibienesinv;
    public TabSiiintracom tabsiiintracom;
    public TabSiitrascenden tabsiitrascenden;
    public TabSiicobros tabsiicobros;
    public TabSiipagos tabsiipagos;
    public TabSiilog tabsiilog;
    public TabSiilogdet tabsiilogdet;
    public TabCerstorage tabcerstorage;
    public TabCerinfo tabcerinfo;
    public TabImpexcel tabimpexcel;
    public TabImpexceldef tabimpexceldef;
    public TabDeflis232 tabdeflis232;
    public TabDeflis20a tabdeflis20a;
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
    public TabListadotmp tablistadotmp;
    public TabConfiginforme tabconfiginforme;
    public TabExtractotmpcab tabextractotmpcab;
    public TabExtractotmpdet tabextractotmpdet;
    public class TabGycauto extends TableDef
        {
        // campos
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
        
    public class TabModelos extends TableDef
        {
        // campos
        public FieldDef modmodelo;
        public FieldDef modtitulo;
        public FieldDef modtipoperi;
        public FieldDef modurlaeat;
        public TabModelos(String name)
            {
            super(name);
            modmodelo = new FieldDef("modmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            modtitulo = new FieldDef("modtitulo",FieldDef.CHAR,30);
            modtipoperi = new FieldDef("modtipoperi",FieldDef.CHAR,2);
            modurlaeat = new FieldDef("modurlaeat",FieldDef.CHAR,200);
            FieldDef array[] = {
                modmodelo,
                modtitulo,
                modtipoperi,
                modurlaeat                
                };
            setColumns(array);
            FieldDef arrayf[] = {modmodelo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabCdeflis extends TableDef
        {
        // campos
        public FieldDef decmodelo;
        public FieldDef dechoja;
        public FieldDef decejercicio;
        public FieldDef decperiodo;
        public FieldDef deccampos;
        public FieldDef declongitud;
        public FieldDef decdesc;
        public FieldDef dechtmla;
        public FieldDef dechtmlb;
        public FieldDef dectiporeg;
        public FieldDef decidentif;
        public FieldDef deciniident2;
        public FieldDef decfinident2;
        public FieldDef decidentif2;
        public FieldDef decposiniejer;
        public FieldDef decposfinejer;
        public FieldDef decposiniperi;
        public FieldDef decposfinperi;
        public TabCdeflis(String name)
            {
            super(name);
            decmodelo = new FieldDef("decmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            dechoja = new FieldDef("dechoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            decejercicio = new FieldDef("decejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            decperiodo = new FieldDef("decperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            deccampos = new FieldDef("deccampos",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            declongitud = new FieldDef("declongitud",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            decdesc = new FieldDef("decdesc",FieldDef.CHAR,50);
            dechtmla = new FieldDef("dechtmla",FieldDef.CHAR,255);
            dechtmlb = new FieldDef("dechtmlb",FieldDef.CHAR,255);
            dectiporeg = new FieldDef("dectiporeg",FieldDef.INTEGER,0);
            decidentif = new FieldDef("decidentif",FieldDef.CHAR,10);
            deciniident2 = new FieldDef("deciniident2",FieldDef.INTEGER,0);
            decfinident2 = new FieldDef("decfinident2",FieldDef.INTEGER,0);
            decidentif2 = new FieldDef("decidentif2",FieldDef.CHAR,10);
            decposiniejer = new FieldDef("decposiniejer",FieldDef.INTEGER,0);
            decposfinejer = new FieldDef("decposfinejer",FieldDef.INTEGER,0);
            decposiniperi = new FieldDef("decposiniperi",FieldDef.INTEGER,0);
            decposfinperi = new FieldDef("decposfinperi",FieldDef.INTEGER,0);
            FieldDef array[] = {
                decmodelo,
                dechoja,
                decejercicio,
                decperiodo,
                deccampos,
                declongitud,
                decdesc,
                dechtmla,
                dechtmlb,
                dectiporeg,
                decidentif,
                deciniident2,
                decfinident2,
                decidentif2,
                decposiniejer,
                decposfinejer,
                decposiniperi,
                decposfinperi                
                };
            setColumns(array);
            FieldDef arrayf[] = {decmodelo,dechoja,decejercicio,decperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef defcamponifes;
        public TabDeflis(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            defcamponifes = new FieldDef("defcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                defcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabCondlist extends TableDef
        {
        // campos
        public FieldDef colmodelo;
        public FieldDef colhoja;
        public FieldDef colejercicio;
        public FieldDef colperiodo;
        public FieldDef colnumero;
        public FieldDef coltransaccion;
        public FieldDef colregimen;
        public FieldDef colemirec;
        public FieldDef coldeducible;
        public FieldDef colivarec;
        public FieldDef colporiva;
        public FieldDef colbasecuota;
        public FieldDef colsqlwhere;
        public TabCondlist(String name)
            {
            super(name);
            colmodelo = new FieldDef("colmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            colhoja = new FieldDef("colhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            colejercicio = new FieldDef("colejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            colperiodo = new FieldDef("colperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            colnumero = new FieldDef("colnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            coltransaccion = new FieldDef("coltransaccion",FieldDef.CHAR,5,FieldDef.NOTNULL);
            colregimen = new FieldDef("colregimen",FieldDef.CHAR,2);
            colemirec = new FieldDef("colemirec",FieldDef.CHAR,1,FieldDef.NOTNULL);
            coldeducible = new FieldDef("coldeducible",FieldDef.CHAR,1,FieldDef.NOTNULL);
            colivarec = new FieldDef("colivarec",FieldDef.CHAR,1,FieldDef.NOTNULL);
            colporiva = new FieldDef("colporiva",FieldDef.FLOAT,6,0);
            colbasecuota = new FieldDef("colbasecuota",FieldDef.CHAR,1,FieldDef.NOTNULL);
            colsqlwhere = new FieldDef("colsqlwhere",FieldDef.CHAR,1000);
            FieldDef array[] = {
                colmodelo,
                colhoja,
                colejercicio,
                colperiodo,
                colnumero,
                coltransaccion,
                colregimen,
                colemirec,
                coldeducible,
                colivarec,
                colporiva,
                colbasecuota,
                colsqlwhere                
                };
            setColumns(array);
            FieldDef arrayf[] = {colmodelo,colhoja,colejercicio,colperiodo,colnumero,coltransaccion };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModestado extends TableDef
        {
        // campos
        public FieldDef mesdominio;
        public FieldDef mesmodelo;
        public FieldDef mesnif;
        public FieldDef mesejercicio;
        public FieldDef mesperiodo;
        public FieldDef mesestado;
        public FieldDef mesorigen;
        public FieldDef mesfecha;
        public FieldDef mescomment;
        public FieldDef mesformatop;
        public FieldDef mesestadop;
        public FieldDef mesfechap;
        public FieldDef meserrorp;
        public FieldDef mesformatom;
        public FieldDef mesestadom;
        public FieldDef mesfecham;
        public FieldDef meserrorm;
        public FieldDef mesformatot;
        public FieldDef mesestadot;
        public FieldDef mesfechat;
        public FieldDef meserrort;
        public FieldDef mesformatos;
        public FieldDef mesestados;
        public FieldDef mesfechas;
        public FieldDef meserrors;
        public FieldDef mesformatol;
        public FieldDef mesestadol;
        public FieldDef mesfechal;
        public FieldDef meserrorl;
        public FieldDef meserror;
        public FieldDef mesficherotel;
        public FieldDef mestipodecl;
        public FieldDef mesbanco;
        public FieldDef mesficherolote;
        public FieldDef mesimporteliq;
        public FieldDef mesimportedeuda;
        public FieldDef mesnrcbanco;
        public FieldDef mescccpago;
        public FieldDef mesfechaopenrc;
        public FieldDef mespresentada;
        public FieldDef mesobserv;
        public FieldDef mesuser;
        public FieldDef mescdp;
        public FieldDef mesautomatico;
        public FieldDef mesaplic;
        public FieldDef mesrazon;
        public FieldDef mesquienpres;
        public FieldDef mesquienpaga;
        public FieldDef mesestacobrada;
        public FieldDef mesentregacli;
        public FieldDef mesformatok;
        public FieldDef mesestadok;
        public FieldDef mesfechak;
        public FieldDef meserrork;
        public FieldDef mesuserk;
        public FieldDef mesplatk;
        public FieldDef mesaplazada;
        public FieldDef mesdecljren;
        public FieldDef mesjrdeclar;
        public FieldDef mesperentrega;
        public FieldDef mesnumjustif;
        public FieldDef mescodelec;
        public FieldDef mesestadomirr;
        public FieldDef mesfechamirr;
        public FieldDef meserrormirr;
        public TabModestado(String name)
            {
            super(name);
            mesdominio = new FieldDef("mesdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            mesmodelo = new FieldDef("mesmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            mesnif = new FieldDef("mesnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mesejercicio = new FieldDef("mesejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mesperiodo = new FieldDef("mesperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mesestado = new FieldDef("mesestado",FieldDef.CHAR,1);
            mesorigen = new FieldDef("mesorigen",FieldDef.CHAR,1,FieldDef.NOTNULL);
            mesfecha = new FieldDef("mesfecha",FieldDef.DATE,FieldDef.NOTNULL);
            mescomment = new FieldDef("mescomment",FieldDef.CHAR,2000);
            mesformatop = new FieldDef("mesformatop",FieldDef.CHAR,1);
            mesestadop = new FieldDef("mesestadop",FieldDef.CHAR,1);
            mesfechap = new FieldDef("mesfechap",FieldDef.DATE);
            meserrorp = new FieldDef("meserrorp",FieldDef.CHAR,255);
            mesformatom = new FieldDef("mesformatom",FieldDef.CHAR,1);
            mesestadom = new FieldDef("mesestadom",FieldDef.CHAR,1);
            mesfecham = new FieldDef("mesfecham",FieldDef.DATE);
            meserrorm = new FieldDef("meserrorm",FieldDef.CHAR,255);
            mesformatot = new FieldDef("mesformatot",FieldDef.CHAR,1);
            mesestadot = new FieldDef("mesestadot",FieldDef.CHAR,2);
            mesfechat = new FieldDef("mesfechat",FieldDef.DATE);
            meserrort = new FieldDef("meserrort",FieldDef.CHAR,255);
            mesformatos = new FieldDef("mesformatos",FieldDef.CHAR,1);
            mesestados = new FieldDef("mesestados",FieldDef.CHAR,1);
            mesfechas = new FieldDef("mesfechas",FieldDef.DATE);
            meserrors = new FieldDef("meserrors",FieldDef.CHAR,255);
            mesformatol = new FieldDef("mesformatol",FieldDef.CHAR,1);
            mesestadol = new FieldDef("mesestadol",FieldDef.CHAR,1);
            mesfechal = new FieldDef("mesfechal",FieldDef.DATE);
            meserrorl = new FieldDef("meserrorl",FieldDef.CHAR,255);
            meserror = new FieldDef("meserror",FieldDef.CHAR,2000);
            mesficherotel = new FieldDef("mesficherotel",FieldDef.CHAR,255);
            mestipodecl = new FieldDef("mestipodecl",FieldDef.CHAR,1);
            mesbanco = new FieldDef("mesbanco",FieldDef.INTEGER,0);
            mesficherolote = new FieldDef("mesficherolote",FieldDef.CHAR,255);
            mesimporteliq = new FieldDef("mesimporteliq",FieldDef.FLOAT,6,0);
            mesimportedeuda = new FieldDef("mesimportedeuda",FieldDef.FLOAT,6,0);
            mesnrcbanco = new FieldDef("mesnrcbanco",FieldDef.CHAR,22);
            mescccpago = new FieldDef("mescccpago",FieldDef.CHAR,20);
            mesfechaopenrc = new FieldDef("mesfechaopenrc",FieldDef.DATE);
            mespresentada = new FieldDef("mespresentada",FieldDef.CHAR,1);
            mesobserv = new FieldDef("mesobserv",FieldDef.CHAR,255);
            mesuser = new FieldDef("mesuser",FieldDef.CHAR,25);
            mescdp = new FieldDef("mescdp",FieldDef.CHAR,12);
            mesautomatico = new FieldDef("mesautomatico",FieldDef.CHAR,1);
            mesaplic = new FieldDef("mesaplic",FieldDef.CHAR,8);
            mesrazon = new FieldDef("mesrazon",FieldDef.CHAR,50);
            mesquienpres = new FieldDef("mesquienpres",FieldDef.CHAR,1);
            mesquienpaga = new FieldDef("mesquienpaga",FieldDef.CHAR,1);
            mesestacobrada = new FieldDef("mesestacobrada",FieldDef.CHAR,1);
            mesentregacli = new FieldDef("mesentregacli",FieldDef.DATE);
            mesformatok = new FieldDef("mesformatok",FieldDef.CHAR,1);
            mesestadok = new FieldDef("mesestadok",FieldDef.CHAR,2);
            mesfechak = new FieldDef("mesfechak",FieldDef.DATE);
            meserrork = new FieldDef("meserrork",FieldDef.CHAR,255);
            mesuserk = new FieldDef("mesuserk",FieldDef.CHAR,25);
            mesplatk = new FieldDef("mesplatk",FieldDef.CHAR,15);
            mesaplazada = new FieldDef("mesaplazada",FieldDef.CHAR,1);
            mesdecljren = new FieldDef("mesdecljren",FieldDef.CHAR,12);
            mesjrdeclar = new FieldDef("mesjrdeclar",FieldDef.CHAR,1);
            mesperentrega = new FieldDef("mesperentrega",FieldDef.CHAR,75);
            mesnumjustif = new FieldDef("mesnumjustif",FieldDef.CHAR,50);
            mescodelec = new FieldDef("mescodelec",FieldDef.CHAR,50);
            mesestadomirr = new FieldDef("mesestadomirr",FieldDef.CHAR,2);
            mesfechamirr = new FieldDef("mesfechamirr",FieldDef.DATE);
            meserrormirr = new FieldDef("meserrormirr",FieldDef.CHAR,255);
            FieldDef array[] = {
                mesdominio,
                mesmodelo,
                mesnif,
                mesejercicio,
                mesperiodo,
                mesestado,
                mesorigen,
                mesfecha,
                mescomment,
                mesformatop,
                mesestadop,
                mesfechap,
                meserrorp,
                mesformatom,
                mesestadom,
                mesfecham,
                meserrorm,
                mesformatot,
                mesestadot,
                mesfechat,
                meserrort,
                mesformatos,
                mesestados,
                mesfechas,
                meserrors,
                mesformatol,
                mesestadol,
                mesfechal,
                meserrorl,
                meserror,
                mesficherotel,
                mestipodecl,
                mesbanco,
                mesficherolote,
                mesimporteliq,
                mesimportedeuda,
                mesnrcbanco,
                mescccpago,
                mesfechaopenrc,
                mespresentada,
                mesobserv,
                mesuser,
                mescdp,
                mesautomatico,
                mesaplic,
                mesrazon,
                mesquienpres,
                mesquienpaga,
                mesestacobrada,
                mesentregacli,
                mesformatok,
                mesestadok,
                mesfechak,
                meserrork,
                mesuserk,
                mesplatk,
                mesaplazada,
                mesdecljren,
                mesjrdeclar,
                mesperentrega,
                mesnumjustif,
                mescodelec,
                mesestadomirr,
                mesfechamirr,
                meserrormirr                
                };
            setColumns(array);
            FieldDef arrayf[] = {mesdominio,mesmodelo,mesnif,mesejercicio,mesperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModnifcdp extends TableDef
        {
        // campos
        public FieldDef mncdominio;
        public FieldDef mncmodelo;
        public FieldDef mncnif;
        public FieldDef mncejercicio;
        public FieldDef mncperiodo;
        public FieldDef mnccdp;
        public FieldDef mnaplicacion;
        public TabModnifcdp(String name)
            {
            super(name);
            mncdominio = new FieldDef("mncdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            mncmodelo = new FieldDef("mncmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            mncnif = new FieldDef("mncnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mncejercicio = new FieldDef("mncejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mncperiodo = new FieldDef("mncperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mnccdp = new FieldDef("mnccdp",FieldDef.CHAR,12,FieldDef.NOTNULL);
            mnaplicacion = new FieldDef("mnaplicacion",FieldDef.CHAR,8,FieldDef.NOTNULL);
            FieldDef array[] = {
                mncdominio,
                mncmodelo,
                mncnif,
                mncejercicio,
                mncperiodo,
                mnccdp,
                mnaplicacion                
                };
            setColumns(array);
            FieldDef arrayf[] = {mncdominio,mncmodelo,mncnif,mncejercicio,mncperiodo,mnccdp,mnaplicacion };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModaplic extends TableDef
        {
        // campos
        public FieldDef mapaplic;
        public FieldDef mapmodelo;
        public TabModaplic(String name)
            {
            super(name);
            mapaplic = new FieldDef("mapaplic",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mapmodelo = new FieldDef("mapmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            FieldDef array[] = {
                mapaplic,
                mapmodelo                
                };
            setColumns(array);
            FieldDef arrayf[] = {mapaplic,mapmodelo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModprograma extends TableDef
        {
        // campos
        public FieldDef mprmodelo;
        public FieldDef mprejercicio;
        public FieldDef mprperiodo;
        public FieldDef mprformato;
        public FieldDef mprprog;
        public FieldDef mprlis;
        public FieldDef mprdeflis01;
        public FieldDef mprdeflis02;
        public FieldDef mprdeflis03;
        public FieldDef mprdeflis04;
        public FieldDef mprdeflis05;
        public FieldDef mprdeflis06;
        public FieldDef mprdeflis07;
        public FieldDef mprdeflis08;
        public FieldDef mprdeflis09;
        public FieldDef mprdeflis10;
        public FieldDef mprdeflis11;
        public FieldDef mprdeflis12;
        public FieldDef mprdeflis13;
        public FieldDef mprdeflis14;
        public FieldDef mprdeflis15;
        public FieldDef mprdeflis16;
        public FieldDef mprdeflis17;
        public FieldDef mprdeflis18;
        public FieldDef mprdeflis19;
        public FieldDef mprdeflis20;
        public FieldDef mprdeftxt2;
        public FieldDef mprmirany;
        public FieldDef mprmirmodel;
        public FieldDef mprmirinstalar;
        public FieldDef mprmirexe;
        public FieldDef mprmirparams;
        public FieldDef mprmirerror;
        public FieldDef mprmirtxt1;
        public FieldDef mprmirtxt2;
        public TabModprograma(String name)
            {
            super(name);
            mprmodelo = new FieldDef("mprmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            mprejercicio = new FieldDef("mprejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mprperiodo = new FieldDef("mprperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mprformato = new FieldDef("mprformato",FieldDef.CHAR,1,FieldDef.NOTNULL);
            mprprog = new FieldDef("mprprog",FieldDef.CHAR,255);
            mprlis = new FieldDef("mprlis",FieldDef.CHAR,255);
            mprdeflis01 = new FieldDef("mprdeflis01",FieldDef.INTEGER,0);
            mprdeflis02 = new FieldDef("mprdeflis02",FieldDef.INTEGER,0);
            mprdeflis03 = new FieldDef("mprdeflis03",FieldDef.INTEGER,0);
            mprdeflis04 = new FieldDef("mprdeflis04",FieldDef.INTEGER,0);
            mprdeflis05 = new FieldDef("mprdeflis05",FieldDef.INTEGER,0);
            mprdeflis06 = new FieldDef("mprdeflis06",FieldDef.INTEGER,0);
            mprdeflis07 = new FieldDef("mprdeflis07",FieldDef.INTEGER,0);
            mprdeflis08 = new FieldDef("mprdeflis08",FieldDef.INTEGER,0);
            mprdeflis09 = new FieldDef("mprdeflis09",FieldDef.INTEGER,0);
            mprdeflis10 = new FieldDef("mprdeflis10",FieldDef.INTEGER,0);
            mprdeflis11 = new FieldDef("mprdeflis11",FieldDef.INTEGER,0);
            mprdeflis12 = new FieldDef("mprdeflis12",FieldDef.INTEGER,0);
            mprdeflis13 = new FieldDef("mprdeflis13",FieldDef.INTEGER,0);
            mprdeflis14 = new FieldDef("mprdeflis14",FieldDef.INTEGER,0);
            mprdeflis15 = new FieldDef("mprdeflis15",FieldDef.INTEGER,0);
            mprdeflis16 = new FieldDef("mprdeflis16",FieldDef.INTEGER,0);
            mprdeflis17 = new FieldDef("mprdeflis17",FieldDef.INTEGER,0);
            mprdeflis18 = new FieldDef("mprdeflis18",FieldDef.INTEGER,0);
            mprdeflis19 = new FieldDef("mprdeflis19",FieldDef.INTEGER,0);
            mprdeflis20 = new FieldDef("mprdeflis20",FieldDef.INTEGER,0);
            mprdeftxt2 = new FieldDef("mprdeftxt2",FieldDef.INTEGER,0);
            mprmirany = new FieldDef("mprmirany",FieldDef.CHAR,8);
            mprmirmodel = new FieldDef("mprmirmodel",FieldDef.CHAR,8);
            mprmirinstalar = new FieldDef("mprmirinstalar",FieldDef.CHAR,255);
            mprmirexe = new FieldDef("mprmirexe",FieldDef.CHAR,80);
            mprmirparams = new FieldDef("mprmirparams",FieldDef.CHAR,255);
            mprmirerror = new FieldDef("mprmirerror",FieldDef.CHAR,30);
            mprmirtxt1 = new FieldDef("mprmirtxt1",FieldDef.CHAR,15);
            mprmirtxt2 = new FieldDef("mprmirtxt2",FieldDef.CHAR,15);
            FieldDef array[] = {
                mprmodelo,
                mprejercicio,
                mprperiodo,
                mprformato,
                mprprog,
                mprlis,
                mprdeflis01,
                mprdeflis02,
                mprdeflis03,
                mprdeflis04,
                mprdeflis05,
                mprdeflis06,
                mprdeflis07,
                mprdeflis08,
                mprdeflis09,
                mprdeflis10,
                mprdeflis11,
                mprdeflis12,
                mprdeflis13,
                mprdeflis14,
                mprdeflis15,
                mprdeflis16,
                mprdeflis17,
                mprdeflis18,
                mprdeflis19,
                mprdeflis20,
                mprdeftxt2,
                mprmirany,
                mprmirmodel,
                mprmirinstalar,
                mprmirexe,
                mprmirparams,
                mprmirerror,
                mprmirtxt1,
                mprmirtxt2                
                };
            setColumns(array);
            FieldDef arrayf[] = {mprmodelo,mprejercicio,mprperiodo,mprformato };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabPresentador extends TableDef
        {
        // campos
        public FieldDef predominio;
        public FieldDef precodigo;
        public FieldDef prenif;
        public FieldDef prerazon;
        public FieldDef presiglas;
        public FieldDef predomic;
        public FieldDef prenumero;
        public FieldDef preescala;
        public FieldDef prepiso;
        public FieldDef prepuerta;
        public FieldDef preadmon;
        public FieldDef premunici;
        public FieldDef prepostal;
        public FieldDef preprovinc;
        public FieldDef pretelefono;
        public FieldDef prenombre;
        public FieldDef prefirmante;
        public FieldDef precargofirma;
        public FieldDef prebanco;
        public FieldDef presucursal;
        public FieldDef prenumerocc;
        public FieldDef predigitos;
        public FieldDef presufijo;
        public FieldDef predeleg;
        public FieldDef precodadmon;
        public FieldDef prefax;
        public FieldDef premobil;
        public FieldDef premail;
        public TabPresentador(String name)
            {
            super(name);
            predominio = new FieldDef("predominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            precodigo = new FieldDef("precodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            prenif = new FieldDef("prenif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            prerazon = new FieldDef("prerazon",FieldDef.CHAR,40);
            presiglas = new FieldDef("presiglas",FieldDef.CHAR,2);
            predomic = new FieldDef("predomic",FieldDef.CHAR,20);
            prenumero = new FieldDef("prenumero",FieldDef.CHAR,4);
            preescala = new FieldDef("preescala",FieldDef.CHAR,2);
            prepiso = new FieldDef("prepiso",FieldDef.CHAR,2);
            prepuerta = new FieldDef("prepuerta",FieldDef.CHAR,2);
            preadmon = new FieldDef("preadmon",FieldDef.CHAR,5);
            premunici = new FieldDef("premunici",FieldDef.CHAR,12);
            prepostal = new FieldDef("prepostal",FieldDef.CHAR,5);
            preprovinc = new FieldDef("preprovinc",FieldDef.INTEGER,0);
            pretelefono = new FieldDef("pretelefono",FieldDef.CHAR,9);
            prenombre = new FieldDef("prenombre",FieldDef.CHAR,40);
            prefirmante = new FieldDef("prefirmante",FieldDef.CHAR,30);
            precargofirma = new FieldDef("precargofirma",FieldDef.CHAR,30);
            prebanco = new FieldDef("prebanco",FieldDef.CHAR,4);
            presucursal = new FieldDef("presucursal",FieldDef.CHAR,4);
            prenumerocc = new FieldDef("prenumerocc",FieldDef.CHAR,10);
            predigitos = new FieldDef("predigitos",FieldDef.CHAR,2);
            presufijo = new FieldDef("presufijo",FieldDef.INTEGER,0);
            predeleg = new FieldDef("predeleg",FieldDef.INTEGER,0);
            precodadmon = new FieldDef("precodadmon",FieldDef.INTEGER,0);
            prefax = new FieldDef("prefax",FieldDef.CHAR,9);
            premobil = new FieldDef("premobil",FieldDef.CHAR,9);
            premail = new FieldDef("premail",FieldDef.CHAR,100);
            FieldDef array[] = {
                predominio,
                precodigo,
                prenif,
                prerazon,
                presiglas,
                predomic,
                prenumero,
                preescala,
                prepiso,
                prepuerta,
                preadmon,
                premunici,
                prepostal,
                preprovinc,
                pretelefono,
                prenombre,
                prefirmante,
                precargofirma,
                prebanco,
                presucursal,
                prenumerocc,
                predigitos,
                presufijo,
                predeleg,
                precodadmon,
                prefax,
                premobil,
                premail                
                };
            setColumns(array);
            FieldDef arrayf[] = {predominio,precodigo };
            setPrimaryKeys(arrayf);
            precodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabImportacion extends TableDef
        {
        // campos
        public FieldDef impdominio;
        public FieldDef impident;
        public FieldDef impfichero;
        public FieldDef impmodelo;
        public FieldDef impnif;
        public FieldDef impejercicio;
        public FieldDef impperiodo;
        public FieldDef impfecha;
        public FieldDef imphora;
        public FieldDef imptiporeg;
        public FieldDef impokreg;
        public FieldDef impokdecl;
        public FieldDef imperror;
        public TabImportacion(String name)
            {
            super(name);
            impdominio = new FieldDef("impdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            impident = new FieldDef("impident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            impfichero = new FieldDef("impfichero",FieldDef.CHAR,75);
            impmodelo = new FieldDef("impmodelo",FieldDef.CHAR,5);
            impnif = new FieldDef("impnif",FieldDef.CHAR,15);
            impejercicio = new FieldDef("impejercicio",FieldDef.INTEGER,0);
            impperiodo = new FieldDef("impperiodo",FieldDef.CHAR,2);
            impfecha = new FieldDef("impfecha",FieldDef.DATE);
            imphora = new FieldDef("imphora",FieldDef.CHAR,8);
            imptiporeg = new FieldDef("imptiporeg",FieldDef.CHAR,3);
            impokreg = new FieldDef("impokreg",FieldDef.CHAR,1);
            impokdecl = new FieldDef("impokdecl",FieldDef.CHAR,1);
            imperror = new FieldDef("imperror",FieldDef.CHAR,2000);
            FieldDef array[] = {
                impdominio,
                impident,
                impfichero,
                impmodelo,
                impnif,
                impejercicio,
                impperiodo,
                impfecha,
                imphora,
                imptiporeg,
                impokreg,
                impokdecl,
                imperror                
                };
            setColumns(array);
            FieldDef arrayf[] = {impdominio,impident };
            setPrimaryKeys(arrayf);
            impident.setAutoIncrementable(true);
            }
        }
        
    public class TabImport100200jr extends TableDef
        {
        // campos
        public FieldDef impident;
        public FieldDef impmodelo;
        public FieldDef impnif;
        public FieldDef impejer;
        public FieldDef impnombre;
        public FieldDef impcodgeyce;
        public FieldDef impcodjrenta;
        public FieldDef imprutafic;
        public FieldDef impfecha;
        public FieldDef impestado;
        public FieldDef imperror;
        public TabImport100200jr(String name)
            {
            super(name);
            impident = new FieldDef("impident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            impmodelo = new FieldDef("impmodelo",FieldDef.CHAR,5);
            impnif = new FieldDef("impnif",FieldDef.CHAR,15);
            impejer = new FieldDef("impejer",FieldDef.INTEGER,0);
            impnombre = new FieldDef("impnombre",FieldDef.CHAR,60);
            impcodgeyce = new FieldDef("impcodgeyce",FieldDef.CHAR,12);
            impcodjrenta = new FieldDef("impcodjrenta",FieldDef.CHAR,12);
            imprutafic = new FieldDef("imprutafic",FieldDef.CHAR,2000);
            impfecha = new FieldDef("impfecha",FieldDef.DATE);
            impestado = new FieldDef("impestado",FieldDef.CHAR,1);
            imperror = new FieldDef("imperror",FieldDef.CHAR,2000);
            FieldDef array[] = {
                impident,
                impmodelo,
                impnif,
                impejer,
                impnombre,
                impcodgeyce,
                impcodjrenta,
                imprutafic,
                impfecha,
                impestado,
                imperror                
                };
            setColumns(array);
            FieldDef arrayf[] = {impident };
            setPrimaryKeys(arrayf);
            impident.setAutoIncrementable(true);
            }
        }
        
    public class TabTiposunid extends TableDef
        {
        // campos
        public FieldDef tpucodigo;
        public FieldDef tpudescripcion;
        public FieldDef tpudesglose;
        public FieldDef tpuprograma;
        public TabTiposunid(String name)
            {
            super(name);
            tpucodigo = new FieldDef("tpucodigo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            tpudescripcion = new FieldDef("tpudescripcion",FieldDef.CHAR,40);
            tpudesglose = new FieldDef("tpudesglose",FieldDef.CHAR,1);
            tpuprograma = new FieldDef("tpuprograma",FieldDef.CHAR,80);
            FieldDef array[] = {
                tpucodigo,
                tpudescripcion,
                tpudesglose,
                tpuprograma                
                };
            setColumns(array);
            FieldDef arrayf[] = {tpucodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModirpfc extends TableDef
        {
        // campos
        public FieldDef micejercicio;
        public FieldDef micepigrafe;
        public FieldDef micletra;
        public FieldDef micdescripcion;
        public FieldDef mictipomaximo;
        public FieldDef micmagmaximo;
        public FieldDef micrdtomax;
        public TabModirpfc(String name)
            {
            super(name);
            micejercicio = new FieldDef("micejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            micepigrafe = new FieldDef("micepigrafe",FieldDef.CHAR,7,FieldDef.NOTNULL);
            micletra = new FieldDef("micletra",FieldDef.CHAR,1);
            micdescripcion = new FieldDef("micdescripcion",FieldDef.CHAR,200);
            mictipomaximo = new FieldDef("mictipomaximo",FieldDef.CHAR,3);
            micmagmaximo = new FieldDef("micmagmaximo",FieldDef.INTEGER,0);
            micrdtomax = new FieldDef("micrdtomax",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                micejercicio,
                micepigrafe,
                micletra,
                micdescripcion,
                mictipomaximo,
                micmagmaximo,
                micrdtomax                
                };
            setColumns(array);
            FieldDef arrayf[] = {micejercicio,micepigrafe,micletra };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModirpfl extends TableDef
        {
        // campos
        public FieldDef milejercicio;
        public FieldDef milepigrafe;
        public FieldDef milletra;
        public FieldDef milmodulo;
        public FieldDef milunidad;
        public FieldDef milrdtoanual;
        public FieldDef miltipo;
        public TabModirpfl(String name)
            {
            super(name);
            milejercicio = new FieldDef("milejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            milepigrafe = new FieldDef("milepigrafe",FieldDef.CHAR,7,FieldDef.NOTNULL);
            milletra = new FieldDef("milletra",FieldDef.CHAR,1);
            milmodulo = new FieldDef("milmodulo",FieldDef.INTEGER,0);
            milunidad = new FieldDef("milunidad",FieldDef.CHAR,20);
            milrdtoanual = new FieldDef("milrdtoanual",FieldDef.FLOAT,6,0);
            miltipo = new FieldDef("miltipo",FieldDef.CHAR,3);
            FieldDef array[] = {
                milejercicio,
                milepigrafe,
                milletra,
                milmodulo,
                milunidad,
                milrdtoanual,
                miltipo                
                };
            setColumns(array);
            FieldDef arrayf[] = {milejercicio,milepigrafe,milletra,milmodulo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModivac extends TableDef
        {
        // campos
        public FieldDef mvcejercicio;
        public FieldDef mvcepigrafe;
        public FieldDef mvcletra;
        public FieldDef mvcdescripcion;
        public FieldDef mvctipomaximo;
        public FieldDef mvcmagmaximo;
        public FieldDef mvcporcuota;
        public FieldDef mvcpordeven;
        public FieldDef mvcporcomis;
        public TabModivac(String name)
            {
            super(name);
            mvcejercicio = new FieldDef("mvcejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mvcepigrafe = new FieldDef("mvcepigrafe",FieldDef.CHAR,7,FieldDef.NOTNULL);
            mvcletra = new FieldDef("mvcletra",FieldDef.CHAR,1);
            mvcdescripcion = new FieldDef("mvcdescripcion",FieldDef.CHAR,200);
            mvctipomaximo = new FieldDef("mvctipomaximo",FieldDef.CHAR,3);
            mvcmagmaximo = new FieldDef("mvcmagmaximo",FieldDef.INTEGER,0);
            mvcporcuota = new FieldDef("mvcporcuota",FieldDef.FLOAT,6,0);
            mvcpordeven = new FieldDef("mvcpordeven",FieldDef.FLOAT,6,0);
            mvcporcomis = new FieldDef("mvcporcomis",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                mvcejercicio,
                mvcepigrafe,
                mvcletra,
                mvcdescripcion,
                mvctipomaximo,
                mvcmagmaximo,
                mvcporcuota,
                mvcpordeven,
                mvcporcomis                
                };
            setColumns(array);
            FieldDef arrayf[] = {mvcejercicio,mvcepigrafe,mvcletra };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModival extends TableDef
        {
        // campos
        public FieldDef mvlejercicio;
        public FieldDef mvlepigrafe;
        public FieldDef mvlletra;
        public FieldDef mvlmodulo;
        public FieldDef mvlunidad;
        public FieldDef mvlrdtoanual;
        public FieldDef mvltipo;
        public TabModival(String name)
            {
            super(name);
            mvlejercicio = new FieldDef("mvlejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mvlepigrafe = new FieldDef("mvlepigrafe",FieldDef.CHAR,7,FieldDef.NOTNULL);
            mvlletra = new FieldDef("mvlletra",FieldDef.CHAR,1);
            mvlmodulo = new FieldDef("mvlmodulo",FieldDef.INTEGER,0);
            mvlunidad = new FieldDef("mvlunidad",FieldDef.CHAR,20);
            mvlrdtoanual = new FieldDef("mvlrdtoanual",FieldDef.FLOAT,6,0);
            mvltipo = new FieldDef("mvltipo",FieldDef.CHAR,3);
            FieldDef array[] = {
                mvlejercicio,
                mvlepigrafe,
                mvlletra,
                mvlmodulo,
                mvlunidad,
                mvlrdtoanual,
                mvltipo                
                };
            setColumns(array);
            FieldDef arrayf[] = {mvlejercicio,mvlepigrafe,mvlletra,mvlmodulo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModivac2 extends TableDef
        {
        // campos
        public FieldDef mvcejercicio;
        public FieldDef mvcperiodo;
        public FieldDef mvcepigrafe;
        public FieldDef mvcletra;
        public FieldDef mvcdescripcion;
        public FieldDef mvctipomaximo;
        public FieldDef mvcmagmaximo;
        public FieldDef mvcporcuota;
        public FieldDef mvcpordeven;
        public FieldDef mvcporcomis;
        public TabModivac2(String name)
            {
            super(name);
            mvcejercicio = new FieldDef("mvcejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mvcperiodo = new FieldDef("mvcperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mvcepigrafe = new FieldDef("mvcepigrafe",FieldDef.CHAR,7,FieldDef.NOTNULL);
            mvcletra = new FieldDef("mvcletra",FieldDef.CHAR,1);
            mvcdescripcion = new FieldDef("mvcdescripcion",FieldDef.CHAR,200);
            mvctipomaximo = new FieldDef("mvctipomaximo",FieldDef.CHAR,3);
            mvcmagmaximo = new FieldDef("mvcmagmaximo",FieldDef.INTEGER,0);
            mvcporcuota = new FieldDef("mvcporcuota",FieldDef.FLOAT,6,0);
            mvcpordeven = new FieldDef("mvcpordeven",FieldDef.FLOAT,6,0);
            mvcporcomis = new FieldDef("mvcporcomis",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                mvcejercicio,
                mvcperiodo,
                mvcepigrafe,
                mvcletra,
                mvcdescripcion,
                mvctipomaximo,
                mvcmagmaximo,
                mvcporcuota,
                mvcpordeven,
                mvcporcomis                
                };
            setColumns(array);
            FieldDef arrayf[] = {mvcejercicio,mvcperiodo,mvcepigrafe,mvcletra };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModival2 extends TableDef
        {
        // campos
        public FieldDef mvlejercicio;
        public FieldDef mvlperiodo;
        public FieldDef mvlepigrafe;
        public FieldDef mvlletra;
        public FieldDef mvlmodulo;
        public FieldDef mvlunidad;
        public FieldDef mvlrdtoanual;
        public FieldDef mvltipo;
        public TabModival2(String name)
            {
            super(name);
            mvlejercicio = new FieldDef("mvlejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mvlperiodo = new FieldDef("mvlperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mvlepigrafe = new FieldDef("mvlepigrafe",FieldDef.CHAR,7,FieldDef.NOTNULL);
            mvlletra = new FieldDef("mvlletra",FieldDef.CHAR,1);
            mvlmodulo = new FieldDef("mvlmodulo",FieldDef.INTEGER,0);
            mvlunidad = new FieldDef("mvlunidad",FieldDef.CHAR,20);
            mvlrdtoanual = new FieldDef("mvlrdtoanual",FieldDef.FLOAT,6,0);
            mvltipo = new FieldDef("mvltipo",FieldDef.CHAR,3);
            FieldDef array[] = {
                mvlejercicio,
                mvlperiodo,
                mvlepigrafe,
                mvlletra,
                mvlmodulo,
                mvlunidad,
                mvlrdtoanual,
                mvltipo                
                };
            setColumns(array);
            FieldDef arrayf[] = {mvlejercicio,mvlperiodo,mvlepigrafe,mvlletra,mvlmodulo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModivaagr extends TableDef
        {
        // campos
        public FieldDef magejercicio;
        public FieldDef magmodulo;
        public FieldDef magdescripcion;
        public FieldDef magporcuota;
        public FieldDef magpordeven;
        public FieldDef magpordeven2;
        public TabModivaagr(String name)
            {
            super(name);
            magejercicio = new FieldDef("magejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            magmodulo = new FieldDef("magmodulo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            magdescripcion = new FieldDef("magdescripcion",FieldDef.CHAR,255);
            magporcuota = new FieldDef("magporcuota",FieldDef.FLOAT,6,0);
            magpordeven = new FieldDef("magpordeven",FieldDef.FLOAT,6,0);
            magpordeven2 = new FieldDef("magpordeven2",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                magejercicio,
                magmodulo,
                magdescripcion,
                magporcuota,
                magpordeven,
                magpordeven2                
                };
            setColumns(array);
            FieldDef arrayf[] = {magejercicio,magmodulo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModacteo extends TableDef
        {
        // campos
        public FieldDef maedominio;
        public FieldDef maenif;
        public FieldDef maecodigo;
        public FieldDef maeepigrafe;
        public FieldDef maeletra;
        public FieldDef maedescripcion;
        public FieldDef maetipomuni;
        public FieldDef maehabitan;
        public FieldDef maevehicul;
        public FieldDef maecarga;
        public FieldDef maelocales;
        public FieldDef maelocalexc;
        public FieldDef maediastemp;
        public FieldDef maediast1;
        public FieldDef maediast2;
        public FieldDef maediast3;
        public FieldDef maediast4;
        public FieldDef maeejerini;
        public FieldDef maehorasconv;
        public FieldDef maeceuta;
        public FieldDef maeporcenatri;
        public FieldDef maemodejer;
        public FieldDef maemodper;
        public FieldDef maeactividad;
        public FieldDef maeejercicio;
        public FieldDef maefecini;
        public FieldDef maefecfin;
        public FieldDef maeenlacejeo;
        public FieldDef maenumtracto;
        public FieldDef maenumsemi;
        public FieldDef maedisc;
        public FieldDef maelorca;
        public FieldDef maelorca2011;
        public FieldDef maerenuncia;
        public FieldDef maenumtra;
        public FieldDef maenumtrafin;
        public TabModacteo(String name)
            {
            super(name);
            maedominio = new FieldDef("maedominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            maenif = new FieldDef("maenif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            maecodigo = new FieldDef("maecodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            maeepigrafe = new FieldDef("maeepigrafe",FieldDef.CHAR,7);
            maeletra = new FieldDef("maeletra",FieldDef.CHAR,1);
            maedescripcion = new FieldDef("maedescripcion",FieldDef.CHAR,200);
            maetipomuni = new FieldDef("maetipomuni",FieldDef.CHAR,1);
            maehabitan = new FieldDef("maehabitan",FieldDef.CHAR,2);
            maevehicul = new FieldDef("maevehicul",FieldDef.INTEGER,0);
            maecarga = new FieldDef("maecarga",FieldDef.CHAR,1);
            maelocales = new FieldDef("maelocales",FieldDef.INTEGER,0);
            maelocalexc = new FieldDef("maelocalexc",FieldDef.CHAR,1);
            maediastemp = new FieldDef("maediastemp",FieldDef.INTEGER,0);
            maediast1 = new FieldDef("maediast1",FieldDef.INTEGER,0);
            maediast2 = new FieldDef("maediast2",FieldDef.INTEGER,0);
            maediast3 = new FieldDef("maediast3",FieldDef.INTEGER,0);
            maediast4 = new FieldDef("maediast4",FieldDef.INTEGER,0);
            maeejerini = new FieldDef("maeejerini",FieldDef.INTEGER,0);
            maehorasconv = new FieldDef("maehorasconv",FieldDef.INTEGER,0);
            maeceuta = new FieldDef("maeceuta",FieldDef.CHAR,1);
            maeporcenatri = new FieldDef("maeporcenatri",FieldDef.FLOAT,6,0);
            maemodejer = new FieldDef("maemodejer",FieldDef.INTEGER,0);
            maemodper = new FieldDef("maemodper",FieldDef.CHAR,2);
            maeactividad = new FieldDef("maeactividad",FieldDef.INTEGER,0);
            maeejercicio = new FieldDef("maeejercicio",FieldDef.INTEGER,0);
            maefecini = new FieldDef("maefecini",FieldDef.DATE);
            maefecfin = new FieldDef("maefecfin",FieldDef.DATE);
            maeenlacejeo = new FieldDef("maeenlacejeo",FieldDef.CHAR,12);
            maenumtracto = new FieldDef("maenumtracto",FieldDef.INTEGER,0);
            maenumsemi = new FieldDef("maenumsemi",FieldDef.INTEGER,0);
            maedisc = new FieldDef("maedisc",FieldDef.CHAR,1);
            maelorca = new FieldDef("maelorca",FieldDef.CHAR,1);
            maelorca2011 = new FieldDef("maelorca2011",FieldDef.CHAR,1);
            maerenuncia = new FieldDef("maerenuncia",FieldDef.CHAR,1);
            maenumtra = new FieldDef("maenumtra",FieldDef.FLOAT,6,0);
            maenumtrafin = new FieldDef("maenumtrafin",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                maedominio,
                maenif,
                maecodigo,
                maeepigrafe,
                maeletra,
                maedescripcion,
                maetipomuni,
                maehabitan,
                maevehicul,
                maecarga,
                maelocales,
                maelocalexc,
                maediastemp,
                maediast1,
                maediast2,
                maediast3,
                maediast4,
                maeejerini,
                maehorasconv,
                maeceuta,
                maeporcenatri,
                maemodejer,
                maemodper,
                maeactividad,
                maeejercicio,
                maefecini,
                maefecfin,
                maeenlacejeo,
                maenumtracto,
                maenumsemi,
                maedisc,
                maelorca,
                maelorca2011,
                maerenuncia,
                maenumtra,
                maenumtrafin                
                };
            setColumns(array);
            FieldDef arrayf[] = {maedominio,maenif,maecodigo };
            setPrimaryKeys(arrayf);
            maecodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabModirpf extends TableDef
        {
        // campos
        public FieldDef maidominio;
        public FieldDef mainif;
        public FieldDef maicodigo;
        public FieldDef mai4t;
        public FieldDef maiunidad1;
        public FieldDef maitipo1;
        public FieldDef maiunidad2;
        public FieldDef maitipo2;
        public FieldDef maiunidad3;
        public FieldDef maitipo3;
        public FieldDef maiunidad4;
        public FieldDef maitipo4;
        public FieldDef maiunidad5;
        public FieldDef maitipo5;
        public FieldDef maiunidad6;
        public FieldDef maitipo6;
        public FieldDef maiunidad7;
        public FieldDef maitipo7;
        public FieldDef maiempleo;
        public FieldDef maiinversion;
        public FieldDef maiindespecial;
        public FieldDef maiindpeqdim;
        public FieldDef maitemporada;
        public FieldDef maiexceso;
        public FieldDef mainueva;
        public FieldDef mairdtoneto;
        public FieldDef maiporpago;
        public FieldDef maipagot1;
        public FieldDef maipagot2;
        public FieldDef maipagot3;
        public FieldDef maipagot4;
        public FieldDef maimodejer;
        public FieldDef maimodper;
        public FieldDef maiactividad;
        public FieldDef maiejercicio;
        public FieldDef maiunidadant1;
        public FieldDef maiunidadant2;
        public FieldDef maiunidadant3;
        public FieldDef maiunidadant4;
        public FieldDef maiunidadant5;
        public FieldDef maiunidadant6;
        public FieldDef maiunidadant7;
        public FieldDef maiempleoirpf;
        public FieldDef maiinversioirpf;
        public FieldDef mairdtonetoirpf;
        public FieldDef maipagotret1;
        public FieldDef maipagotret2;
        public FieldDef maipagotret3;
        public FieldDef maipagotret4;
        public FieldDef maiporatrit1;
        public FieldDef maiporatrit2;
        public FieldDef maiporatrit3;
        public FieldDef maiporatrit4;
        public FieldDef mailiqirpf;
        public FieldDef mairedda2;
        public FieldDef mailorca;
        public FieldDef mailorcairpf;
        public TabModirpf(String name)
            {
            super(name);
            maidominio = new FieldDef("maidominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            mainif = new FieldDef("mainif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            maicodigo = new FieldDef("maicodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mai4t = new FieldDef("mai4t",FieldDef.CHAR,1,FieldDef.NOTNULL);
            maiunidad1 = new FieldDef("maiunidad1",FieldDef.FLOAT,6,0);
            maitipo1 = new FieldDef("maitipo1",FieldDef.CHAR,3);
            maiunidad2 = new FieldDef("maiunidad2",FieldDef.FLOAT,6,0);
            maitipo2 = new FieldDef("maitipo2",FieldDef.CHAR,3);
            maiunidad3 = new FieldDef("maiunidad3",FieldDef.FLOAT,6,0);
            maitipo3 = new FieldDef("maitipo3",FieldDef.CHAR,3);
            maiunidad4 = new FieldDef("maiunidad4",FieldDef.FLOAT,6,0);
            maitipo4 = new FieldDef("maitipo4",FieldDef.CHAR,3);
            maiunidad5 = new FieldDef("maiunidad5",FieldDef.FLOAT,6,0);
            maitipo5 = new FieldDef("maitipo5",FieldDef.CHAR,3);
            maiunidad6 = new FieldDef("maiunidad6",FieldDef.FLOAT,6,0);
            maitipo6 = new FieldDef("maitipo6",FieldDef.CHAR,3);
            maiunidad7 = new FieldDef("maiunidad7",FieldDef.FLOAT,6,0);
            maitipo7 = new FieldDef("maitipo7",FieldDef.CHAR,3);
            maiempleo = new FieldDef("maiempleo",FieldDef.FLOAT,6,0);
            maiinversion = new FieldDef("maiinversion",FieldDef.FLOAT,6,0);
            maiindespecial = new FieldDef("maiindespecial",FieldDef.FLOAT,6,0);
            maiindpeqdim = new FieldDef("maiindpeqdim",FieldDef.FLOAT,6,0);
            maitemporada = new FieldDef("maitemporada",FieldDef.FLOAT,6,0);
            maiexceso = new FieldDef("maiexceso",FieldDef.FLOAT,6,0);
            mainueva = new FieldDef("mainueva",FieldDef.FLOAT,6,0);
            mairdtoneto = new FieldDef("mairdtoneto",FieldDef.FLOAT,6,0);
            maiporpago = new FieldDef("maiporpago",FieldDef.FLOAT,6,0);
            maipagot1 = new FieldDef("maipagot1",FieldDef.FLOAT,6,0);
            maipagot2 = new FieldDef("maipagot2",FieldDef.FLOAT,6,0);
            maipagot3 = new FieldDef("maipagot3",FieldDef.FLOAT,6,0);
            maipagot4 = new FieldDef("maipagot4",FieldDef.FLOAT,6,0);
            maimodejer = new FieldDef("maimodejer",FieldDef.INTEGER,0);
            maimodper = new FieldDef("maimodper",FieldDef.CHAR,2);
            maiactividad = new FieldDef("maiactividad",FieldDef.INTEGER,0);
            maiejercicio = new FieldDef("maiejercicio",FieldDef.INTEGER,0);
            maiunidadant1 = new FieldDef("maiunidadant1",FieldDef.FLOAT,6,0);
            maiunidadant2 = new FieldDef("maiunidadant2",FieldDef.FLOAT,6,0);
            maiunidadant3 = new FieldDef("maiunidadant3",FieldDef.FLOAT,6,0);
            maiunidadant4 = new FieldDef("maiunidadant4",FieldDef.FLOAT,6,0);
            maiunidadant5 = new FieldDef("maiunidadant5",FieldDef.FLOAT,6,0);
            maiunidadant6 = new FieldDef("maiunidadant6",FieldDef.FLOAT,6,0);
            maiunidadant7 = new FieldDef("maiunidadant7",FieldDef.FLOAT,6,0);
            maiempleoirpf = new FieldDef("maiempleoirpf",FieldDef.FLOAT,6,0);
            maiinversioirpf = new FieldDef("maiinversioirpf",FieldDef.FLOAT,6,0);
            mairdtonetoirpf = new FieldDef("mairdtonetoirpf",FieldDef.FLOAT,6,0);
            maipagotret1 = new FieldDef("maipagotret1",FieldDef.FLOAT,6,0);
            maipagotret2 = new FieldDef("maipagotret2",FieldDef.FLOAT,6,0);
            maipagotret3 = new FieldDef("maipagotret3",FieldDef.FLOAT,6,0);
            maipagotret4 = new FieldDef("maipagotret4",FieldDef.FLOAT,6,0);
            maiporatrit1 = new FieldDef("maiporatrit1",FieldDef.FLOAT,6,0);
            maiporatrit2 = new FieldDef("maiporatrit2",FieldDef.FLOAT,6,0);
            maiporatrit3 = new FieldDef("maiporatrit3",FieldDef.FLOAT,6,0);
            maiporatrit4 = new FieldDef("maiporatrit4",FieldDef.FLOAT,6,0);
            mailiqirpf = new FieldDef("mailiqirpf",FieldDef.CHAR,1);
            mairedda2 = new FieldDef("mairedda2",FieldDef.FLOAT,6,0);
            mailorca = new FieldDef("mailorca",FieldDef.FLOAT,6,0);
            mailorcairpf = new FieldDef("mailorcairpf",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                maidominio,
                mainif,
                maicodigo,
                mai4t,
                maiunidad1,
                maitipo1,
                maiunidad2,
                maitipo2,
                maiunidad3,
                maitipo3,
                maiunidad4,
                maitipo4,
                maiunidad5,
                maitipo5,
                maiunidad6,
                maitipo6,
                maiunidad7,
                maitipo7,
                maiempleo,
                maiinversion,
                maiindespecial,
                maiindpeqdim,
                maitemporada,
                maiexceso,
                mainueva,
                mairdtoneto,
                maiporpago,
                maipagot1,
                maipagot2,
                maipagot3,
                maipagot4,
                maimodejer,
                maimodper,
                maiactividad,
                maiejercicio,
                maiunidadant1,
                maiunidadant2,
                maiunidadant3,
                maiunidadant4,
                maiunidadant5,
                maiunidadant6,
                maiunidadant7,
                maiempleoirpf,
                maiinversioirpf,
                mairdtonetoirpf,
                maipagotret1,
                maipagotret2,
                maipagotret3,
                maipagotret4,
                maiporatrit1,
                maiporatrit2,
                maiporatrit3,
                maiporatrit4,
                mailiqirpf,
                mairedda2,
                mailorca,
                mailorcairpf                
                };
            setColumns(array);
            FieldDef arrayf[] = {maidominio,mainif,maicodigo,mai4t };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModiva extends TableDef
        {
        // campos
        public FieldDef mavdominio;
        public FieldDef mavnif;
        public FieldDef mavcodigo;
        public FieldDef mav4t;
        public FieldDef mavunidad1;
        public FieldDef mavtipo1;
        public FieldDef mavunidad2;
        public FieldDef mavtipo2;
        public FieldDef mavunidad3;
        public FieldDef mavtipo3;
        public FieldDef mavunidad4;
        public FieldDef mavtipo4;
        public FieldDef mavunidad5;
        public FieldDef mavtipo5;
        public FieldDef mavunidad6;
        public FieldDef mavtipo6;
        public FieldDef mavunidad7;
        public FieldDef mavtipo7;
        public FieldDef mavdevengada;
        public FieldDef mavtemporada;
        public FieldDef mavporcuota;
        public FieldDef mavcomist1;
        public FieldDef mavcomist2;
        public FieldDef mavcomist3;
        public FieldDef mavingresot1;
        public FieldDef mavingresot2;
        public FieldDef mavingresot3;
        public FieldDef mavsoportado;
        public FieldDef mavdevotpais;
        public FieldDef mavcuotadert4;
        public FieldDef mavmodejer;
        public FieldDef mavmodper;
        public FieldDef mavactividad;
        public FieldDef mavejercicio;
        public FieldDef mavliqiva;
        public FieldDef mavunidad8;
        public FieldDef mavtipo8;
        public FieldDef mavlorca;
        public FieldDef mavlorca2011;
        public TabModiva(String name)
            {
            super(name);
            mavdominio = new FieldDef("mavdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            mavnif = new FieldDef("mavnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mavcodigo = new FieldDef("mavcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mav4t = new FieldDef("mav4t",FieldDef.CHAR,1,FieldDef.NOTNULL);
            mavunidad1 = new FieldDef("mavunidad1",FieldDef.FLOAT,6,0);
            mavtipo1 = new FieldDef("mavtipo1",FieldDef.CHAR,3);
            mavunidad2 = new FieldDef("mavunidad2",FieldDef.FLOAT,6,0);
            mavtipo2 = new FieldDef("mavtipo2",FieldDef.CHAR,3);
            mavunidad3 = new FieldDef("mavunidad3",FieldDef.FLOAT,6,0);
            mavtipo3 = new FieldDef("mavtipo3",FieldDef.CHAR,3);
            mavunidad4 = new FieldDef("mavunidad4",FieldDef.FLOAT,6,0);
            mavtipo4 = new FieldDef("mavtipo4",FieldDef.CHAR,3);
            mavunidad5 = new FieldDef("mavunidad5",FieldDef.FLOAT,6,0);
            mavtipo5 = new FieldDef("mavtipo5",FieldDef.CHAR,3);
            mavunidad6 = new FieldDef("mavunidad6",FieldDef.FLOAT,6,0);
            mavtipo6 = new FieldDef("mavtipo6",FieldDef.CHAR,3);
            mavunidad7 = new FieldDef("mavunidad7",FieldDef.FLOAT,6,0);
            mavtipo7 = new FieldDef("mavtipo7",FieldDef.CHAR,3);
            mavdevengada = new FieldDef("mavdevengada",FieldDef.FLOAT,6,0);
            mavtemporada = new FieldDef("mavtemporada",FieldDef.FLOAT,6,0);
            mavporcuota = new FieldDef("mavporcuota",FieldDef.FLOAT,6,0);
            mavcomist1 = new FieldDef("mavcomist1",FieldDef.FLOAT,6,0);
            mavcomist2 = new FieldDef("mavcomist2",FieldDef.FLOAT,6,0);
            mavcomist3 = new FieldDef("mavcomist3",FieldDef.FLOAT,6,0);
            mavingresot1 = new FieldDef("mavingresot1",FieldDef.FLOAT,6,0);
            mavingresot2 = new FieldDef("mavingresot2",FieldDef.FLOAT,6,0);
            mavingresot3 = new FieldDef("mavingresot3",FieldDef.FLOAT,6,0);
            mavsoportado = new FieldDef("mavsoportado",FieldDef.FLOAT,6,0);
            mavdevotpais = new FieldDef("mavdevotpais",FieldDef.FLOAT,6,0);
            mavcuotadert4 = new FieldDef("mavcuotadert4",FieldDef.FLOAT,6,0);
            mavmodejer = new FieldDef("mavmodejer",FieldDef.INTEGER,0);
            mavmodper = new FieldDef("mavmodper",FieldDef.CHAR,2);
            mavactividad = new FieldDef("mavactividad",FieldDef.INTEGER,0);
            mavejercicio = new FieldDef("mavejercicio",FieldDef.INTEGER,0);
            mavliqiva = new FieldDef("mavliqiva",FieldDef.CHAR,1);
            mavunidad8 = new FieldDef("mavunidad8",FieldDef.FLOAT,6,0);
            mavtipo8 = new FieldDef("mavtipo8",FieldDef.CHAR,3);
            mavlorca = new FieldDef("mavlorca",FieldDef.FLOAT,6,0);
            mavlorca2011 = new FieldDef("mavlorca2011",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                mavdominio,
                mavnif,
                mavcodigo,
                mav4t,
                mavunidad1,
                mavtipo1,
                mavunidad2,
                mavtipo2,
                mavunidad3,
                mavtipo3,
                mavunidad4,
                mavtipo4,
                mavunidad5,
                mavtipo5,
                mavunidad6,
                mavtipo6,
                mavunidad7,
                mavtipo7,
                mavdevengada,
                mavtemporada,
                mavporcuota,
                mavcomist1,
                mavcomist2,
                mavcomist3,
                mavingresot1,
                mavingresot2,
                mavingresot3,
                mavsoportado,
                mavdevotpais,
                mavcuotadert4,
                mavmodejer,
                mavmodper,
                mavactividad,
                mavejercicio,
                mavliqiva,
                mavunidad8,
                mavtipo8,
                mavlorca,
                mavlorca2011                
                };
            setColumns(array);
            FieldDef arrayf[] = {mavdominio,mavnif,mavcodigo,mav4t };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModuni extends TableDef
        {
        // campos
        public FieldDef maudominio;
        public FieldDef maunif;
        public FieldDef maucodigo;
        public FieldDef mau4t;
        public FieldDef mautipo;
        public FieldDef maulinea;
        public FieldDef mauhorasper;
        public FieldDef mauminusvalid;
        public FieldDef mauaprend;
        public FieldDef maumen19;
        public FieldDef maumay19;
        public FieldDef mautitular;
        public FieldDef mauconyuge;
        public FieldDef maucapac;
        public FieldDef mauunidades;
        public FieldDef mautotal;
        public FieldDef maufecini;
        public FieldDef maufecfin;
        public FieldDef maudistit;
        public FieldDef maudiscon;
        public FieldDef maudismen;
        public FieldDef mauactividad;
        public FieldDef mauejercicio;
        public FieldDef maudesc;
        public FieldDef mautregulariz;
        public FieldDef mauhorasdia;
        public FieldDef maumenos19;
        public FieldDef maudiscapac;
        public FieldDef mauaprendiz;
        public FieldDef maudiasvacas;
        public FieldDef maudiasbaja;
        public FieldDef mauconhijo;
        public FieldDef mautotalini;
        public TabModuni(String name)
            {
            super(name);
            maudominio = new FieldDef("maudominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            maunif = new FieldDef("maunif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            maucodigo = new FieldDef("maucodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mau4t = new FieldDef("mau4t",FieldDef.CHAR,1,FieldDef.NOTNULL);
            mautipo = new FieldDef("mautipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            maulinea = new FieldDef("maulinea",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mauhorasper = new FieldDef("mauhorasper",FieldDef.FLOAT,6,0);
            mauminusvalid = new FieldDef("mauminusvalid",FieldDef.INTEGER,0);
            mauaprend = new FieldDef("mauaprend",FieldDef.INTEGER,0);
            maumen19 = new FieldDef("maumen19",FieldDef.INTEGER,0);
            maumay19 = new FieldDef("maumay19",FieldDef.INTEGER,0);
            mautitular = new FieldDef("mautitular",FieldDef.INTEGER,0);
            mauconyuge = new FieldDef("mauconyuge",FieldDef.INTEGER,0);
            maucapac = new FieldDef("maucapac",FieldDef.INTEGER,0);
            mauunidades = new FieldDef("mauunidades",FieldDef.FLOAT,6,0);
            mautotal = new FieldDef("mautotal",FieldDef.FLOAT,6,0);
            maufecini = new FieldDef("maufecini",FieldDef.DATE);
            maufecfin = new FieldDef("maufecfin",FieldDef.DATE);
            maudistit = new FieldDef("maudistit",FieldDef.CHAR,1);
            maudiscon = new FieldDef("maudiscon",FieldDef.CHAR,1);
            maudismen = new FieldDef("maudismen",FieldDef.CHAR,1);
            mauactividad = new FieldDef("mauactividad",FieldDef.INTEGER,0);
            mauejercicio = new FieldDef("mauejercicio",FieldDef.INTEGER,0);
            maudesc = new FieldDef("maudesc",FieldDef.CHAR,40);
            mautregulariz = new FieldDef("mautregulariz",FieldDef.CHAR,2);
            mauhorasdia = new FieldDef("mauhorasdia",FieldDef.FLOAT,6,0);
            maumenos19 = new FieldDef("maumenos19",FieldDef.CHAR,1);
            maudiscapac = new FieldDef("maudiscapac",FieldDef.CHAR,1);
            mauaprendiz = new FieldDef("mauaprendiz",FieldDef.CHAR,1);
            maudiasvacas = new FieldDef("maudiasvacas",FieldDef.INTEGER,0);
            maudiasbaja = new FieldDef("maudiasbaja",FieldDef.INTEGER,0);
            mauconhijo = new FieldDef("mauconhijo",FieldDef.CHAR,1);
            mautotalini = new FieldDef("mautotalini",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                maudominio,
                maunif,
                maucodigo,
                mau4t,
                mautipo,
                maulinea,
                mauhorasper,
                mauminusvalid,
                mauaprend,
                maumen19,
                maumay19,
                mautitular,
                mauconyuge,
                maucapac,
                mauunidades,
                mautotal,
                maufecini,
                maufecfin,
                maudistit,
                maudiscon,
                maudismen,
                mauactividad,
                mauejercicio,
                maudesc,
                mautregulariz,
                mauhorasdia,
                maumenos19,
                maudiscapac,
                mauaprendiz,
                maudiasvacas,
                maudiasbaja,
                mauconhijo,
                mautotalini                
                };
            setColumns(array);
            FieldDef arrayf[] = {maudominio,maunif,maucodigo,mau4t,mautipo,maulinea };
            setPrimaryKeys(arrayf);
            maulinea.setAutoIncrementable(true);
            }
        }
        
    public class TabModagriva extends TableDef
        {
        // campos
        public FieldDef maadominio;
        public FieldDef maanif;
        public FieldDef maacodigo;
        public FieldDef maaepigrafe;
        public FieldDef maadescripcion;
        public FieldDef maaingresot1;
        public FieldDef maaingresot2;
        public FieldDef maaingresot3;
        public FieldDef maaingresot4;
        public FieldDef maasoportado;
        public FieldDef maacuotader;
        public FieldDef maamodejer;
        public FieldDef maamodper;
        public FieldDef maaactividad;
        public FieldDef maaejercicio;
        public FieldDef maaliqiva;
        public FieldDef maaingresot3b;
        public TabModagriva(String name)
            {
            super(name);
            maadominio = new FieldDef("maadominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            maanif = new FieldDef("maanif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            maacodigo = new FieldDef("maacodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            maaepigrafe = new FieldDef("maaepigrafe",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            maadescripcion = new FieldDef("maadescripcion",FieldDef.CHAR,200);
            maaingresot1 = new FieldDef("maaingresot1",FieldDef.FLOAT,6,0);
            maaingresot2 = new FieldDef("maaingresot2",FieldDef.FLOAT,6,0);
            maaingresot3 = new FieldDef("maaingresot3",FieldDef.FLOAT,6,0);
            maaingresot4 = new FieldDef("maaingresot4",FieldDef.FLOAT,6,0);
            maasoportado = new FieldDef("maasoportado",FieldDef.FLOAT,6,0);
            maacuotader = new FieldDef("maacuotader",FieldDef.FLOAT,6,0);
            maamodejer = new FieldDef("maamodejer",FieldDef.INTEGER,0);
            maamodper = new FieldDef("maamodper",FieldDef.CHAR,2);
            maaactividad = new FieldDef("maaactividad",FieldDef.INTEGER,0);
            maaejercicio = new FieldDef("maaejercicio",FieldDef.INTEGER,0);
            maaliqiva = new FieldDef("maaliqiva",FieldDef.CHAR,1);
            maaingresot3b = new FieldDef("maaingresot3b",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                maadominio,
                maanif,
                maacodigo,
                maaepigrafe,
                maadescripcion,
                maaingresot1,
                maaingresot2,
                maaingresot3,
                maaingresot4,
                maasoportado,
                maacuotader,
                maamodejer,
                maamodper,
                maaactividad,
                maaejercicio,
                maaliqiva,
                maaingresot3b                
                };
            setColumns(array);
            FieldDef arrayf[] = {maadominio,maanif,maacodigo };
            setPrimaryKeys(arrayf);
            maacodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabPaisaeat extends TableDef
        {
        // campos
        public FieldDef paicodigo;
        public FieldDef painombre;
        public TabPaisaeat(String name)
            {
            super(name);
            paicodigo = new FieldDef("paicodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            painombre = new FieldDef("painombre",FieldDef.CHAR,60);
            FieldDef array[] = {
                paicodigo,
                painombre                
                };
            setColumns(array);
            FieldDef arrayf[] = {paicodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabPaisterri extends TableDef
        {
        // campos
        public FieldDef patcodigo;
        public FieldDef patnombre;
        public TabPaisterri(String name)
            {
            super(name);
            patcodigo = new FieldDef("patcodigo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            patnombre = new FieldDef("patnombre",FieldDef.CHAR,60);
            FieldDef array[] = {
                patcodigo,
                patnombre                
                };
            setColumns(array);
            FieldDef arrayf[] = {patcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabBds extends TableDef
        {
        // campos
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
        
    public class TabModirpfagr extends TableDef
        {
        // campos
        public FieldDef migejercicio;
        public FieldDef migmodulo;
        public FieldDef migdescripcion;
        public FieldDef migindrdto1;
        public FieldDef migindrdto2;
        public FieldDef migvolingmax;
        public FieldDef miglinimprrenta;
        public TabModirpfagr(String name)
            {
            super(name);
            migejercicio = new FieldDef("migejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            migmodulo = new FieldDef("migmodulo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            migdescripcion = new FieldDef("migdescripcion",FieldDef.CHAR,255);
            migindrdto1 = new FieldDef("migindrdto1",FieldDef.FLOAT,6,0);
            migindrdto2 = new FieldDef("migindrdto2",FieldDef.FLOAT,6,0);
            migvolingmax = new FieldDef("migvolingmax",FieldDef.FLOAT,6,0);
            miglinimprrenta = new FieldDef("miglinimprrenta",FieldDef.INTEGER,0);
            FieldDef array[] = {
                migejercicio,
                migmodulo,
                migdescripcion,
                migindrdto1,
                migindrdto2,
                migvolingmax,
                miglinimprrenta                
                };
            setColumns(array);
            FieldDef arrayf[] = {migejercicio,migmodulo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabValoresmod extends TableDef
        {
        // campos
        public FieldDef vacampo;
        public FieldDef vacodigo;
        public FieldDef vadenom;
        public FieldDef vadesc;
        public TabValoresmod(String name)
            {
            super(name);
            vacampo = new FieldDef("vacampo",FieldDef.CHAR,15,FieldDef.NOTNULL);
            vacodigo = new FieldDef("vacodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
            vadenom = new FieldDef("vadenom",FieldDef.CHAR,35);
            vadesc = new FieldDef("vadesc",FieldDef.CHAR,255);
            FieldDef array[] = {
                vacampo,
                vacodigo,
                vadenom,
                vadesc                
                };
            setColumns(array);
            FieldDef arrayf[] = {vacampo,vacodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabCodelecmat extends TableDef
        {
        // campos
        public FieldDef cemident;
        public FieldDef cemnif;
        public FieldDef cemanyo;
        public FieldDef cemfecha;
        public FieldDef cembast;
        public FieldDef cemcodelec;
        public FieldDef cemdiahora;
        public FieldDef cemerror;
        public TabCodelecmat(String name)
            {
            super(name);
            cemident = new FieldDef("cemident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            cemnif = new FieldDef("cemnif",FieldDef.CHAR,9);
            cemanyo = new FieldDef("cemanyo",FieldDef.INTEGER,0);
            cemfecha = new FieldDef("cemfecha",FieldDef.DATE);
            cembast = new FieldDef("cembast",FieldDef.CHAR,22);
            cemcodelec = new FieldDef("cemcodelec",FieldDef.CHAR,8);
            cemdiahora = new FieldDef("cemdiahora",FieldDef.CHAR,20);
            cemerror = new FieldDef("cemerror",FieldDef.CHAR,100);
            FieldDef array[] = {
                cemident,
                cemnif,
                cemanyo,
                cemfecha,
                cembast,
                cemcodelec,
                cemdiahora,
                cemerror                
                };
            setColumns(array);
            FieldDef arrayf[] = {cemident };
            setPrimaryKeys(arrayf);
            cemident.setAutoIncrementable(true);
            }
        }
        
    public class TabImportcfg extends TableDef
        {
        // campos
        public FieldDef imcdominio;
        public FieldDef imcnif;
        public FieldDef imcfpagodef;
        public FieldDef imcfpagoiva;
        public FieldDef imcfpagoirpf;
        public FieldDef imcentdef;
        public FieldDef imcofidef;
        public FieldDef imcdcdef;
        public FieldDef imcctadef;
        public FieldDef imcentiva;
        public FieldDef imcofiiva;
        public FieldDef imcdciva;
        public FieldDef imcctaiva;
        public FieldDef imcentirpf;
        public FieldDef imcofiirpf;
        public FieldDef imcdcirpf;
        public FieldDef imcctairpf;
        public FieldDef imcentdev;
        public FieldDef imcofidev;
        public FieldDef imcdcdev;
        public FieldDef imcctadev;
        public TabImportcfg(String name)
            {
            super(name);
            imcdominio = new FieldDef("imcdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            imcnif = new FieldDef("imcnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            imcfpagodef = new FieldDef("imcfpagodef",FieldDef.CHAR,2);
            imcfpagoiva = new FieldDef("imcfpagoiva",FieldDef.CHAR,2);
            imcfpagoirpf = new FieldDef("imcfpagoirpf",FieldDef.CHAR,2);
            imcentdef = new FieldDef("imcentdef",FieldDef.CHAR,4);
            imcofidef = new FieldDef("imcofidef",FieldDef.CHAR,4);
            imcdcdef = new FieldDef("imcdcdef",FieldDef.CHAR,2);
            imcctadef = new FieldDef("imcctadef",FieldDef.CHAR,10);
            imcentiva = new FieldDef("imcentiva",FieldDef.CHAR,4);
            imcofiiva = new FieldDef("imcofiiva",FieldDef.CHAR,4);
            imcdciva = new FieldDef("imcdciva",FieldDef.CHAR,2);
            imcctaiva = new FieldDef("imcctaiva",FieldDef.CHAR,10);
            imcentirpf = new FieldDef("imcentirpf",FieldDef.CHAR,4);
            imcofiirpf = new FieldDef("imcofiirpf",FieldDef.CHAR,4);
            imcdcirpf = new FieldDef("imcdcirpf",FieldDef.CHAR,2);
            imcctairpf = new FieldDef("imcctairpf",FieldDef.CHAR,10);
            imcentdev = new FieldDef("imcentdev",FieldDef.CHAR,4);
            imcofidev = new FieldDef("imcofidev",FieldDef.CHAR,4);
            imcdcdev = new FieldDef("imcdcdev",FieldDef.CHAR,2);
            imcctadev = new FieldDef("imcctadev",FieldDef.CHAR,10);
            FieldDef array[] = {
                imcdominio,
                imcnif,
                imcfpagodef,
                imcfpagoiva,
                imcfpagoirpf,
                imcentdef,
                imcofidef,
                imcdcdef,
                imcctadef,
                imcentiva,
                imcofiiva,
                imcdciva,
                imcctaiva,
                imcentirpf,
                imcofiirpf,
                imcdcirpf,
                imcctairpf,
                imcentdev,
                imcofidev,
                imcdcdev,
                imcctadev                
                };
            setColumns(array);
            FieldDef arrayf[] = {imcdominio,imcnif };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabImportmod extends TableDef
        {
        // campos
        public FieldDef immdominio;
        public FieldDef immmodelo;
        public FieldDef immcampo;
        public FieldDef immposini;
        public FieldDef immposfin;
        public FieldDef immtipo;
        public FieldDef immvalor;
        public FieldDef immcolumna;
        public TabImportmod(String name)
            {
            super(name);
            immdominio = new FieldDef("immdominio",FieldDef.CHAR,15,FieldDef.NOTNULL);
            immmodelo = new FieldDef("immmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            immcampo = new FieldDef("immcampo",FieldDef.CHAR,15,FieldDef.NOTNULL);
            immposini = new FieldDef("immposini",FieldDef.INTEGER,0);
            immposfin = new FieldDef("immposfin",FieldDef.INTEGER,0);
            immtipo = new FieldDef("immtipo",FieldDef.CHAR,2);
            immvalor = new FieldDef("immvalor",FieldDef.CHAR,50);
            immcolumna = new FieldDef("immcolumna",FieldDef.INTEGER,0);
            FieldDef array[] = {
                immdominio,
                immmodelo,
                immcampo,
                immposini,
                immposfin,
                immtipo,
                immvalor,
                immcolumna                
                };
            setColumns(array);
            FieldDef arrayf[] = {immdominio,immmodelo,immcampo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabImportrel extends TableDef
        {
        // campos
        public FieldDef imrmodelo;
        public FieldDef imrcampo;
        public FieldDef imrdesc;
        public FieldDef imrcampotabla;
        public FieldDef imrorden;
        public TabImportrel(String name)
            {
            super(name);
            imrmodelo = new FieldDef("imrmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            imrcampo = new FieldDef("imrcampo",FieldDef.CHAR,15,FieldDef.NOTNULL);
            imrdesc = new FieldDef("imrdesc",FieldDef.CHAR,100);
            imrcampotabla = new FieldDef("imrcampotabla",FieldDef.CHAR,15);
            imrorden = new FieldDef("imrorden",FieldDef.INTEGER,0);
            FieldDef array[] = {
                imrmodelo,
                imrcampo,
                imrdesc,
                imrcampotabla,
                imrorden                
                };
            setColumns(array);
            FieldDef arrayf[] = {imrmodelo,imrcampo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabImporthis extends TableDef
        {
        // campos
        public FieldDef imhcodigo;
        public FieldDef imhdominio;
        public FieldDef imhnif;
        public FieldDef imhrazon;
        public FieldDef imhmodelo;
        public FieldDef imhejercicio;
        public FieldDef imhperiodo;
        public FieldDef imhfecha;
        public FieldDef imhusuario;
        public FieldDef imhestado;
        public FieldDef imhdescerr;
        public FieldDef imhnombrefit;
        public FieldDef imhidtime;
        public TabImporthis(String name)
            {
            super(name);
            imhcodigo = new FieldDef("imhcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            imhdominio = new FieldDef("imhdominio",FieldDef.CHAR,15);
            imhnif = new FieldDef("imhnif",FieldDef.CHAR,15);
            imhrazon = new FieldDef("imhrazon",FieldDef.CHAR,40);
            imhmodelo = new FieldDef("imhmodelo",FieldDef.CHAR,5);
            imhejercicio = new FieldDef("imhejercicio",FieldDef.INTEGER,0);
            imhperiodo = new FieldDef("imhperiodo",FieldDef.CHAR,2);
            imhfecha = new FieldDef("imhfecha",FieldDef.DATE);
            imhusuario = new FieldDef("imhusuario",FieldDef.CHAR,10);
            imhestado = new FieldDef("imhestado",FieldDef.CHAR,1);
            imhdescerr = new FieldDef("imhdescerr",FieldDef.CHAR,255);
            imhnombrefit = new FieldDef("imhnombrefit",FieldDef.CHAR,255);
            imhidtime = new FieldDef("imhidtime",FieldDef.CHAR,14);
            FieldDef array[] = {
                imhcodigo,
                imhdominio,
                imhnif,
                imhrazon,
                imhmodelo,
                imhejercicio,
                imhperiodo,
                imhfecha,
                imhusuario,
                imhestado,
                imhdescerr,
                imhnombrefit,
                imhidtime                
                };
            setColumns(array);
            FieldDef arrayf[] = {imhcodigo };
            setPrimaryKeys(arrayf);
            imhcodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabImportdp extends TableDef
        {
        // campos
        public FieldDef imddominio;
        public FieldDef imdrutaimp;
        public FieldDef imdrutaerr;
        public FieldDef imdrutahis;
        public FieldDef imdreemplazar;
        public FieldDef imdmovererr;
        public TabImportdp(String name)
            {
            super(name);
            imddominio = new FieldDef("imddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            imdrutaimp = new FieldDef("imdrutaimp",FieldDef.CHAR,255);
            imdrutaerr = new FieldDef("imdrutaerr",FieldDef.CHAR,255);
            imdrutahis = new FieldDef("imdrutahis",FieldDef.CHAR,255);
            imdreemplazar = new FieldDef("imdreemplazar",FieldDef.CHAR,1);
            imdmovererr = new FieldDef("imdmovererr",FieldDef.CHAR,1);
            FieldDef array[] = {
                imddominio,
                imdrutaimp,
                imdrutaerr,
                imdrutahis,
                imdreemplazar,
                imdmovererr                
                };
            setColumns(array);
            FieldDef arrayf[] = {imddominio };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabQuefrase extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        
    public class TabSeleccion extends TableDef
        {
        // campos
        public FieldDef selcodigo;
        public FieldDef selusuario;
        public FieldDef selprograma;
        public FieldDef selnif;
        public TabSeleccion(String name)
            {
            super(name);
            selcodigo = new FieldDef("selcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            selusuario = new FieldDef("selusuario",FieldDef.CHAR,25);
            selprograma = new FieldDef("selprograma",FieldDef.CHAR,15);
            selnif = new FieldDef("selnif",FieldDef.CHAR,15);
            FieldDef array[] = {
                selcodigo,
                selusuario,
                selprograma,
                selnif                
                };
            setColumns(array);
            FieldDef arrayf[] = {selcodigo };
            setPrimaryKeys(arrayf);
            selcodigo.setAutoIncrementable(true);
            selcodigo.setDescription("Código autoincrementable");
            selusuario.setDescription("Usuario");
            selprograma.setDescription("Programa");
            selnif.setDescription("Nif");
            }
        }
        
    public class TabPpbbcfg extends TableDef
        {
        // campos
        public FieldDef pbcdominio;
        public FieldDef pbcidbanco;
        public FieldDef pbcnombrepc;
        public FieldDef pbcrutadec;
        public FieldDef pbcrutalog;
        public TabPpbbcfg(String name)
            {
            super(name);
            pbcdominio = new FieldDef("pbcdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            pbcidbanco = new FieldDef("pbcidbanco",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pbcnombrepc = new FieldDef("pbcnombrepc",FieldDef.CHAR,25,FieldDef.NOTNULL);
            pbcrutadec = new FieldDef("pbcrutadec",FieldDef.CHAR,255);
            pbcrutalog = new FieldDef("pbcrutalog",FieldDef.CHAR,255);
            FieldDef array[] = {
                pbcdominio,
                pbcidbanco,
                pbcnombrepc,
                pbcrutadec,
                pbcrutalog                
                };
            setColumns(array);
            FieldDef arrayf[] = {pbcdominio,pbcidbanco,pbcnombrepc };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabPpbbbanco extends TableDef
        {
        // campos
        public FieldDef pbbdominio;
        public FieldDef pbbidbanco;
        public FieldDef pbbnombre;
        public FieldDef pbbdesc;
        public TabPpbbbanco(String name)
            {
            super(name);
            pbbdominio = new FieldDef("pbbdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            pbbidbanco = new FieldDef("pbbidbanco",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pbbnombre = new FieldDef("pbbnombre",FieldDef.CHAR,15);
            pbbdesc = new FieldDef("pbbdesc",FieldDef.CHAR,255);
            FieldDef array[] = {
                pbbdominio,
                pbbidbanco,
                pbbnombre,
                pbbdesc                
                };
            setColumns(array);
            FieldDef arrayf[] = {pbbdominio,pbbidbanco };
            setPrimaryKeys(arrayf);
            pbbidbanco.setAutoIncrementable(true);
            }
        }
        
    public class TabLogimpmodaff extends TableDef
        {
        // campos
        public FieldDef limid;
        public FieldDef limnif;
        public FieldDef limmodel;
        public FieldDef limejercicio;
        public FieldDef limperiodo;
        public FieldDef limcodigo;
        public FieldDef limhora;
        public FieldDef limfdecl;
        public FieldDef limestado;
        public FieldDef limerror;
        public FieldDef limcontdecl;
        public TabLogimpmodaff(String name)
            {
            super(name);
            limid = new FieldDef("limid",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            limnif = new FieldDef("limnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            limmodel = new FieldDef("limmodel",FieldDef.CHAR,3,FieldDef.NOTNULL);
            limejercicio = new FieldDef("limejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            limperiodo = new FieldDef("limperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            limcodigo = new FieldDef("limcodigo",FieldDef.CHAR,12);
            limhora = new FieldDef("limhora",FieldDef.DATE);
            limfdecl = new FieldDef("limfdecl",FieldDef.CHAR,50);
            limestado = new FieldDef("limestado",FieldDef.CHAR,1);
            limerror = new FieldDef("limerror",FieldDef.CHAR,100);
            limcontdecl = new FieldDef("limcontdecl",FieldDef.CHAR,2000);
            FieldDef array[] = {
                limid,
                limnif,
                limmodel,
                limejercicio,
                limperiodo,
                limcodigo,
                limhora,
                limfdecl,
                limestado,
                limerror,
                limcontdecl                
                };
            setColumns(array);
            FieldDef arrayf[] = {limid };
            setPrimaryKeys(arrayf);
            limid.setAutoIncrementable(true);
            }
        }
        
    public class TabMod720i extends TableDef
        {
        // campos
        public FieldDef m720idominio;
        public FieldDef m720inif;
        public FieldDef m720iejercicio;
        public FieldDef m720iident;
        public FieldDef m720iempresa;
        public FieldDef m720iidentinmob;
        public FieldDef m720imuf;
        public FieldDef m720iapartado;
        public FieldDef m720iedadusufru;
        public FieldDef m720irdtoarr;
        public FieldDef m720imejoras;
        public FieldDef m720ivalcatas;
        public FieldDef m720ivalcompra;
        public FieldDef m720ivalpatrim;
        public FieldDef m720inifper;
        public FieldDef m720inifrepre;
        public FieldDef m720inombre;
        public FieldDef m720icondicion;
        public FieldDef m720itipotiula;
        public FieldDef m720iclave;
        public FieldDef m720isubclave;
        public FieldDef m720itiporeal;
        public FieldDef m720ipais;
        public FieldDef m720icalle;
        public FieldDef m720icalle2;
        public FieldDef m720iciudad;
        public FieldDef m720iregion;
        public FieldDef m720izipcode;
        public FieldDef m720ipaisinm;
        public FieldDef m720ifeccompra;
        public FieldDef m720iorigen;
        public FieldDef m720ifecventa;
        public FieldDef m720iurbana;
        public FieldDef m720iporcen;
        public FieldDef m720itipnuda;
        public FieldDef m720ictto1985;
        public FieldDef m720ivalorejant;
        public FieldDef m720iesdivisa;
        public FieldDef m720icontraval;
        public FieldDef m720ivalventa;
        public FieldDef m720irevisado;
        public TabMod720i(String name)
            {
            super(name);
            m720idominio = new FieldDef("m720idominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m720inif = new FieldDef("m720inif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m720iejercicio = new FieldDef("m720iejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m720iident = new FieldDef("m720iident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m720iempresa = new FieldDef("m720iempresa",FieldDef.CHAR,12);
            m720iidentinmob = new FieldDef("m720iidentinmob",FieldDef.INTEGER,0);
            m720imuf = new FieldDef("m720imuf",FieldDef.CHAR,6);
            m720iapartado = new FieldDef("m720iapartado",FieldDef.CHAR,2);
            m720iedadusufru = new FieldDef("m720iedadusufru",FieldDef.INTEGER,0);
            m720irdtoarr = new FieldDef("m720irdtoarr",FieldDef.FLOAT,6,0);
            m720imejoras = new FieldDef("m720imejoras",FieldDef.FLOAT,6,0);
            m720ivalcatas = new FieldDef("m720ivalcatas",FieldDef.FLOAT,6,0);
            m720ivalcompra = new FieldDef("m720ivalcompra",FieldDef.FLOAT,6,0);
            m720ivalpatrim = new FieldDef("m720ivalpatrim",FieldDef.FLOAT,6,0);
            m720inifper = new FieldDef("m720inifper",FieldDef.CHAR,9);
            m720inifrepre = new FieldDef("m720inifrepre",FieldDef.CHAR,9);
            m720inombre = new FieldDef("m720inombre",FieldDef.CHAR,40);
            m720icondicion = new FieldDef("m720icondicion",FieldDef.INTEGER,0);
            m720itipotiula = new FieldDef("m720itipotiula",FieldDef.CHAR,25);
            m720iclave = new FieldDef("m720iclave",FieldDef.CHAR,1);
            m720isubclave = new FieldDef("m720isubclave",FieldDef.INTEGER,0);
            m720itiporeal = new FieldDef("m720itiporeal",FieldDef.CHAR,25);
            m720ipais = new FieldDef("m720ipais",FieldDef.CHAR,2);
            m720icalle = new FieldDef("m720icalle",FieldDef.CHAR,52);
            m720icalle2 = new FieldDef("m720icalle2",FieldDef.CHAR,40);
            m720iciudad = new FieldDef("m720iciudad",FieldDef.CHAR,30);
            m720iregion = new FieldDef("m720iregion",FieldDef.CHAR,30);
            m720izipcode = new FieldDef("m720izipcode",FieldDef.CHAR,10);
            m720ipaisinm = new FieldDef("m720ipaisinm",FieldDef.CHAR,2);
            m720ifeccompra = new FieldDef("m720ifeccompra",FieldDef.DATE);
            m720iorigen = new FieldDef("m720iorigen",FieldDef.CHAR,1);
            m720ifecventa = new FieldDef("m720ifecventa",FieldDef.DATE);
            m720iurbana = new FieldDef("m720iurbana",FieldDef.CHAR,1);
            m720iporcen = new FieldDef("m720iporcen",FieldDef.FLOAT,6,0);
            m720itipnuda = new FieldDef("m720itipnuda",FieldDef.CHAR,1);
            m720ictto1985 = new FieldDef("m720ictto1985",FieldDef.CHAR,1);
            m720ivalorejant = new FieldDef("m720ivalorejant",FieldDef.FLOAT,6,0);
            m720iesdivisa = new FieldDef("m720iesdivisa",FieldDef.CHAR,1);
            m720icontraval = new FieldDef("m720icontraval",FieldDef.FLOAT,6,0);
            m720ivalventa = new FieldDef("m720ivalventa",FieldDef.FLOAT,6,0);
            m720irevisado = new FieldDef("m720irevisado",FieldDef.CHAR,1);
            FieldDef array[] = {
                m720idominio,
                m720inif,
                m720iejercicio,
                m720iident,
                m720iempresa,
                m720iidentinmob,
                m720imuf,
                m720iapartado,
                m720iedadusufru,
                m720irdtoarr,
                m720imejoras,
                m720ivalcatas,
                m720ivalcompra,
                m720ivalpatrim,
                m720inifper,
                m720inifrepre,
                m720inombre,
                m720icondicion,
                m720itipotiula,
                m720iclave,
                m720isubclave,
                m720itiporeal,
                m720ipais,
                m720icalle,
                m720icalle2,
                m720iciudad,
                m720iregion,
                m720izipcode,
                m720ipaisinm,
                m720ifeccompra,
                m720iorigen,
                m720ifecventa,
                m720iurbana,
                m720iporcen,
                m720itipnuda,
                m720ictto1985,
                m720ivalorejant,
                m720iesdivisa,
                m720icontraval,
                m720ivalventa,
                m720irevisado                
                };
            setColumns(array);
            FieldDef arrayf[] = {m720idominio,m720inif,m720iejercicio,m720iident };
            setDescription("720 Inmobiliario");
            setPrimaryKeys(arrayf);
            m720inif.setDescription("NIF declarante");
            m720iejercicio.setDescription("Ejercicio aplicacion");
            m720iident.setDescription("Identificador");
            m720iempresa.setDescription("codi declarate / empresa Jiss");
            m720iidentinmob.setDescription("Identif inmobiliario origen");
            m720imuf.setDescription("M.U.F.");
            m720iapartado.setDescription("Apartado OTRDATOSPATRIM");
            m720iedadusufru.setDescription("Edad usufructuario");
            m720irdtoarr.setDescription("AR Rdto Integro (ctto anterior 1985)");
            m720imejoras.setDescription("AR Valor mejoras");
            m720ivalcatas.setDescription("Valor catastral");
            m720ivalcompra.setDescription("Valor compra");
            m720ivalpatrim.setDescription("Valor Patrimonio");
            m720inifper.setDescription("NIF declarado");
            m720inifrepre.setDescription("NIF representante legal del declarado");
            m720inombre.setDescription("Declarado apellidos,razon social");
            m720icondicion.setDescription("Condicion del declarante (titular,repre,usuf...)");
            m720itipotiula.setDescription("Tipo titularidad sobre el Bien    (condicion=8)");
            m720iclave.setDescription("Clave Tipo del Bien C-V-I-S-B");
            m720isubclave.setDescription("Subclave tipo del Bien");
            m720itiporeal.setDescription("Tipo derecho real inmueble  (Clave B Subclave 4)");
            m720ipais.setDescription("Codigo alfab.Pais del Bien");
            m720icalle.setDescription("Entidad o inmueble: Calle-Nro");
            m720icalle2.setDescription("Entidad o inmueble: Complemento calle");
            m720iciudad.setDescription("Entidad o inmueble: Poblacion-Ciudad");
            m720iregion.setDescription("Entidad o inmueble: Provincia-Region-Estado");
            m720izipcode.setDescription("Entidad o inmueble: ZIP-CODE postal");
            m720ipaisinm.setDescription("Entidad o inmueble: Codigo alfab.Pais");
            m720ifeccompra.setDescription("Fecha compra-apertura AAAAMMDD");
            m720iorigen.setDescription("Origen del bien  A-M-C");
            m720ifecventa.setDescription("Fecha ventaa-extincion AAAAMMDD");
            m720iurbana.setDescription("Urbana-Rustica");
            m720iporcen.setDescription("Porc.participacion");
            m720itipnuda.setDescription("Nuda propiedad o Renta vitalicia");
            m720ictto1985.setDescription("AR ctto anterior 1985");
            m720ivalorejant.setDescription("Valor Patrimonio ejer.anterior");
            m720iesdivisa.setDescription("Es divisa");
            m720icontraval.setDescription("Valor en euros de la divisa indicada");
            m720ivalventa.setDescription("Valor de venta");
            m720irevisado.setDescription("Revisado");
            }
        }
        
    public class TabMod720m extends TableDef
        {
        // campos
        public FieldDef m720mdominio;
        public FieldDef m720mnif;
        public FieldDef m720mejercicio;
        public FieldDef m720mident;
        public FieldDef m720mempresa;
        public FieldDef m720midentmob;
        public FieldDef m720mmuf;
        public FieldDef m720mapartado;
        public FieldDef m720medadusufru;
        public FieldDef m720msaldo3112;
        public FieldDef m720msaldomedio;
        public FieldDef m720mtitulos;
        public FieldDef m720mnominal;
        public FieldDef m720mvaloractu;
        public FieldDef m720mcotizacion;
        public FieldDef m720mvalcapital;
        public FieldDef m720mvalortotal;
        public FieldDef m720mnifper;
        public FieldDef m720mnifrepre;
        public FieldDef m720mnombre;
        public FieldDef m720mcondicion;
        public FieldDef m720mtipotiula;
        public FieldDef m720mclave;
        public FieldDef m720msubclave;
        public FieldDef m720mpais;
        public FieldDef m720mclauident;
        public FieldDef m720misin;
        public FieldDef m720mclaucta;
        public FieldDef m720mbic;
        public FieldDef m720miban;
        public FieldDef m720mbanco;
        public FieldDef m720mnrorigen;
        public FieldDef m720mcalle;
        public FieldDef m720mcalle2;
        public FieldDef m720mciudad;
        public FieldDef m720mregion;
        public FieldDef m720mzipcode;
        public FieldDef m720mpaisinm;
        public FieldDef m720mfeccompra;
        public FieldDef m720morigen;
        public FieldDef m720mfecventa;
        public FieldDef m720mclaveval;
        public FieldDef m720mporcen;
        public FieldDef m720macnbno;
        public FieldDef m720mtipnuda;
        public FieldDef m720mvalorejant;
        public FieldDef m720mesdivisa;
        public FieldDef m720mcontraval;
        public FieldDef m720msaldmedant;
        public FieldDef m720mrevisado;
        public TabMod720m(String name)
            {
            super(name);
            m720mdominio = new FieldDef("m720mdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m720mnif = new FieldDef("m720mnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m720mejercicio = new FieldDef("m720mejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m720mident = new FieldDef("m720mident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m720mempresa = new FieldDef("m720mempresa",FieldDef.CHAR,12);
            m720midentmob = new FieldDef("m720midentmob",FieldDef.INTEGER,0);
            m720mmuf = new FieldDef("m720mmuf",FieldDef.CHAR,6);
            m720mapartado = new FieldDef("m720mapartado",FieldDef.CHAR,2);
            m720medadusufru = new FieldDef("m720medadusufru",FieldDef.INTEGER,0);
            m720msaldo3112 = new FieldDef("m720msaldo3112",FieldDef.FLOAT,6,0);
            m720msaldomedio = new FieldDef("m720msaldomedio",FieldDef.FLOAT,6,0);
            m720mtitulos = new FieldDef("m720mtitulos",FieldDef.FLOAT,6,0);
            m720mnominal = new FieldDef("m720mnominal",FieldDef.FLOAT,6,0);
            m720mvaloractu = new FieldDef("m720mvaloractu",FieldDef.FLOAT,6,0);
            m720mcotizacion = new FieldDef("m720mcotizacion",FieldDef.FLOAT,6,0);
            m720mvalcapital = new FieldDef("m720mvalcapital",FieldDef.FLOAT,6,0);
            m720mvalortotal = new FieldDef("m720mvalortotal",FieldDef.FLOAT,6,0);
            m720mnifper = new FieldDef("m720mnifper",FieldDef.CHAR,9);
            m720mnifrepre = new FieldDef("m720mnifrepre",FieldDef.CHAR,9);
            m720mnombre = new FieldDef("m720mnombre",FieldDef.CHAR,40);
            m720mcondicion = new FieldDef("m720mcondicion",FieldDef.INTEGER,0);
            m720mtipotiula = new FieldDef("m720mtipotiula",FieldDef.CHAR,25);
            m720mclave = new FieldDef("m720mclave",FieldDef.CHAR,1);
            m720msubclave = new FieldDef("m720msubclave",FieldDef.INTEGER,0);
            m720mpais = new FieldDef("m720mpais",FieldDef.CHAR,2);
            m720mclauident = new FieldDef("m720mclauident",FieldDef.INTEGER,0);
            m720misin = new FieldDef("m720misin",FieldDef.CHAR,12);
            m720mclaucta = new FieldDef("m720mclaucta",FieldDef.CHAR,1);
            m720mbic = new FieldDef("m720mbic",FieldDef.CHAR,11);
            m720miban = new FieldDef("m720miban",FieldDef.CHAR,34);
            m720mbanco = new FieldDef("m720mbanco",FieldDef.CHAR,41);
            m720mnrorigen = new FieldDef("m720mnrorigen",FieldDef.CHAR,20);
            m720mcalle = new FieldDef("m720mcalle",FieldDef.CHAR,52);
            m720mcalle2 = new FieldDef("m720mcalle2",FieldDef.CHAR,40);
            m720mciudad = new FieldDef("m720mciudad",FieldDef.CHAR,30);
            m720mregion = new FieldDef("m720mregion",FieldDef.CHAR,30);
            m720mzipcode = new FieldDef("m720mzipcode",FieldDef.CHAR,10);
            m720mpaisinm = new FieldDef("m720mpaisinm",FieldDef.CHAR,2);
            m720mfeccompra = new FieldDef("m720mfeccompra",FieldDef.DATE);
            m720morigen = new FieldDef("m720morigen",FieldDef.CHAR,1);
            m720mfecventa = new FieldDef("m720mfecventa",FieldDef.DATE);
            m720mclaveval = new FieldDef("m720mclaveval",FieldDef.CHAR,1);
            m720mporcen = new FieldDef("m720mporcen",FieldDef.FLOAT,6,0);
            m720macnbno = new FieldDef("m720macnbno",FieldDef.CHAR,1);
            m720mtipnuda = new FieldDef("m720mtipnuda",FieldDef.CHAR,1);
            m720mvalorejant = new FieldDef("m720mvalorejant",FieldDef.FLOAT,6,0);
            m720mesdivisa = new FieldDef("m720mesdivisa",FieldDef.CHAR,1);
            m720mcontraval = new FieldDef("m720mcontraval",FieldDef.FLOAT,6,0);
            m720msaldmedant = new FieldDef("m720msaldmedant",FieldDef.FLOAT,6,0);
            m720mrevisado = new FieldDef("m720mrevisado",FieldDef.CHAR,1);
            FieldDef array[] = {
                m720mdominio,
                m720mnif,
                m720mejercicio,
                m720mident,
                m720mempresa,
                m720midentmob,
                m720mmuf,
                m720mapartado,
                m720medadusufru,
                m720msaldo3112,
                m720msaldomedio,
                m720mtitulos,
                m720mnominal,
                m720mvaloractu,
                m720mcotizacion,
                m720mvalcapital,
                m720mvalortotal,
                m720mnifper,
                m720mnifrepre,
                m720mnombre,
                m720mcondicion,
                m720mtipotiula,
                m720mclave,
                m720msubclave,
                m720mpais,
                m720mclauident,
                m720misin,
                m720mclaucta,
                m720mbic,
                m720miban,
                m720mbanco,
                m720mnrorigen,
                m720mcalle,
                m720mcalle2,
                m720mciudad,
                m720mregion,
                m720mzipcode,
                m720mpaisinm,
                m720mfeccompra,
                m720morigen,
                m720mfecventa,
                m720mclaveval,
                m720mporcen,
                m720macnbno,
                m720mtipnuda,
                m720mvalorejant,
                m720mesdivisa,
                m720mcontraval,
                m720msaldmedant,
                m720mrevisado                
                };
            setColumns(array);
            FieldDef arrayf[] = {m720mdominio,m720mnif,m720mejercicio,m720mident };
            setDescription("720 Mobiliario");
            setPrimaryKeys(arrayf);
            m720mnif.setDescription("NIF declarante");
            m720mejercicio.setDescription("Ejercicio aplicacion");
            m720mident.setDescription("Identificador");
            m720mempresa.setDescription("codi declarate / empresa Jiss");
            m720midentmob.setDescription("Identificador mobiliario origen");
            m720mmuf.setDescription("M.U.F.");
            m720mapartado.setDescription("Apartado OTRDATOSPATRIM");
            m720medadusufru.setDescription("Edad usufructuario Nuda o declarante Vitalicia");
            m720msaldo3112.setDescription("Saldo 31-12");
            m720msaldomedio.setDescription("Saldo Medio Trimestre 4");
            m720mtitulos.setDescription("Nro titulos/acciones               (Clave V-I)");
            m720mnominal.setDescription("Valor nominal");
            m720mvaloractu.setDescription("Valor actual");
            m720mcotizacion.setDescription("Cotizacion media 4 trimestre");
            m720mvalcapital.setDescription("Valor capitalizacion");
            m720mvalortotal.setDescription("Valor Patrimonio");
            m720mnifper.setDescription("NIF declarado");
            m720mnifrepre.setDescription("NIF representante legal del declardo");
            m720mnombre.setDescription("Declarado apellidos,razon social");
            m720mcondicion.setDescription("Condicion del declarante (titular,repre,usuf...)");
            m720mtipotiula.setDescription("Tipo titularidad sobre el Bien    (condicion=8)");
            m720mclave.setDescription("Clave Tipo del Bien C-V-I-S-B");
            m720msubclave.setDescription("Subclave tipo del Bien");
            m720mpais.setDescription("Codigo alfab.Pais del Bien");
            m720mclauident.setDescription("Clave identificacion 0-1-2           (Clave V-I)");
            m720misin.setDescription("Codigo ISIN                          (Clave V-I)");
            m720mclaucta.setDescription("Clave ident.cuenta 1-IBAN,2-BIC,0-otro (Clave C)");
            m720mbic.setDescription("Codigo BIC                             (Clave C)");
            m720miban.setDescription("Codigo cuenta IBAN                     (Clave C)");
            m720mbanco.setDescription("Entidad rao social               (Clave C-V-I-S)");
            m720mnrorigen.setDescription("Nr.Ident.Fiscal en el pais de residenc.fisal");
            m720mcalle.setDescription("Entidad o inmueble: Calle-Nro");
            m720mcalle2.setDescription("Entidad o inmueble: Complemento calle");
            m720mciudad.setDescription("Entidad o inmueble: Poblacion-Ciudad");
            m720mregion.setDescription("Entidad o inmueble: Provincia-Region-Estado");
            m720mzipcode.setDescription("Entidad o inmueble: ZIP-CODE postal");
            m720mpaisinm.setDescription("Entidad o inmueble: Codigo alfab.Pais");
            m720mfeccompra.setDescription("Fecha compra-apertura AAAAMMDD");
            m720morigen.setDescription("Origen del bien  A-M-C");
            m720mfecventa.setDescription("Fecha ventaa-extincion AAAAMMDD");
            m720mclaveval.setDescription("Clave valoracion A-B                 (Clave V-I)");
            m720mporcen.setDescription("Porc.participacion");
            m720macnbno.setDescription("Es ACNB no auditadas");
            m720mtipnuda.setDescription("Nuda propiedad o Renta vitalicia");
            m720mvalorejant.setDescription("Valor Patrimonio ejer.anterior");
            m720mesdivisa.setDescription("Es divisa");
            m720mcontraval.setDescription("Valor en euros de la divisa indicada");
            m720msaldmedant.setDescription("Saldo Medio Trimestre 4 ejer.anterior");
            m720mrevisado.setDescription("Revisado");
            }
        }
        
    public class TabParamlis extends TableDef
        {
        // campos
        public FieldDef pardominio;
        public FieldDef parusuario;
        public FieldDef parprograma;
        public FieldDef parlinea;
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
        public FieldDef parcampon51;
        public FieldDef parcampod52;
        public FieldDef parcampon52;
        public FieldDef parcampod53;
        public FieldDef parcampon53;
        public FieldDef parcampod54;
        public FieldDef parcampon54;
        public FieldDef parcampod55;
        public FieldDef parcampon55;
        public FieldDef parcampod56;
        public FieldDef parcampon56;
        public FieldDef parcampod57;
        public FieldDef parcampon57;
        public FieldDef parcampod58;
        public FieldDef parcampon58;
        public FieldDef parcampod59;
        public FieldDef parcampon59;
        public FieldDef parcampod60;
        public FieldDef parcampon60;
        public FieldDef parcampoa61;
        public FieldDef parcampod61;
        public FieldDef parcampod62;
        public FieldDef parcampod63;
        public FieldDef parcampod64;
        public FieldDef parcampod65;
        public FieldDef parcampod66;
        public FieldDef parcampod67;
        public FieldDef parcampod68;
        public FieldDef parcampod69;
        public FieldDef parcampod70;
        public TabParamlis(String name)
            {
            super(name);
            pardominio = new FieldDef("pardominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            parusuario = new FieldDef("parusuario",FieldDef.CHAR,25,FieldDef.NOTNULL);
            parprograma = new FieldDef("parprograma",FieldDef.CHAR,15,FieldDef.NOTNULL);
            parlinea = new FieldDef("parlinea",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            paropcion = new FieldDef("paropcion",FieldDef.CHAR,2,FieldDef.NOTNULL);
            parcampoa1 = new FieldDef("parcampoa1",FieldDef.CHAR,250);
            parcampoa2 = new FieldDef("parcampoa2",FieldDef.CHAR,250);
            parcampoa3 = new FieldDef("parcampoa3",FieldDef.CHAR,250);
            parcampoa4 = new FieldDef("parcampoa4",FieldDef.CHAR,250);
            parcampoa5 = new FieldDef("parcampoa5",FieldDef.CHAR,250);
            parcampoa6 = new FieldDef("parcampoa6",FieldDef.CHAR,250);
            parcampoa7 = new FieldDef("parcampoa7",FieldDef.CHAR,250);
            parcampoa8 = new FieldDef("parcampoa8",FieldDef.CHAR,250);
            parcampoa9 = new FieldDef("parcampoa9",FieldDef.CHAR,250);
            parcampoa10 = new FieldDef("parcampoa10",FieldDef.CHAR,250);
            parcampoa11 = new FieldDef("parcampoa11",FieldDef.CHAR,250);
            parcampoa12 = new FieldDef("parcampoa12",FieldDef.CHAR,250);
            parcampoa13 = new FieldDef("parcampoa13",FieldDef.CHAR,250);
            parcampoa14 = new FieldDef("parcampoa14",FieldDef.CHAR,250);
            parcampoa15 = new FieldDef("parcampoa15",FieldDef.CHAR,250);
            parcampoa16 = new FieldDef("parcampoa16",FieldDef.CHAR,250);
            parcampoa17 = new FieldDef("parcampoa17",FieldDef.CHAR,250);
            parcampoa18 = new FieldDef("parcampoa18",FieldDef.CHAR,250);
            parcampoa19 = new FieldDef("parcampoa19",FieldDef.CHAR,250);
            parcampoa20 = new FieldDef("parcampoa20",FieldDef.CHAR,250);
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
            parcampon51 = new FieldDef("parcampon51",FieldDef.FLOAT,6,0);
            parcampod52 = new FieldDef("parcampod52",FieldDef.DATE);
            parcampon52 = new FieldDef("parcampon52",FieldDef.FLOAT,6,0);
            parcampod53 = new FieldDef("parcampod53",FieldDef.DATE);
            parcampon53 = new FieldDef("parcampon53",FieldDef.FLOAT,6,0);
            parcampod54 = new FieldDef("parcampod54",FieldDef.DATE);
            parcampon54 = new FieldDef("parcampon54",FieldDef.FLOAT,6,0);
            parcampod55 = new FieldDef("parcampod55",FieldDef.DATE);
            parcampon55 = new FieldDef("parcampon55",FieldDef.FLOAT,6,0);
            parcampod56 = new FieldDef("parcampod56",FieldDef.DATE);
            parcampon56 = new FieldDef("parcampon56",FieldDef.FLOAT,6,0);
            parcampod57 = new FieldDef("parcampod57",FieldDef.DATE);
            parcampon57 = new FieldDef("parcampon57",FieldDef.FLOAT,6,0);
            parcampod58 = new FieldDef("parcampod58",FieldDef.DATE);
            parcampon58 = new FieldDef("parcampon58",FieldDef.FLOAT,6,0);
            parcampod59 = new FieldDef("parcampod59",FieldDef.DATE);
            parcampon59 = new FieldDef("parcampon59",FieldDef.FLOAT,6,0);
            parcampod60 = new FieldDef("parcampod60",FieldDef.DATE);
            parcampon60 = new FieldDef("parcampon60",FieldDef.FLOAT,6,0);
            parcampoa61 = new FieldDef("parcampoa61",FieldDef.CHAR,100);
            parcampod61 = new FieldDef("parcampod61",FieldDef.DATE);
            parcampod62 = new FieldDef("parcampod62",FieldDef.DATE);
            parcampod63 = new FieldDef("parcampod63",FieldDef.DATE);
            parcampod64 = new FieldDef("parcampod64",FieldDef.DATE);
            parcampod65 = new FieldDef("parcampod65",FieldDef.DATE);
            parcampod66 = new FieldDef("parcampod66",FieldDef.DATE);
            parcampod67 = new FieldDef("parcampod67",FieldDef.DATE);
            parcampod68 = new FieldDef("parcampod68",FieldDef.DATE);
            parcampod69 = new FieldDef("parcampod69",FieldDef.DATE);
            parcampod70 = new FieldDef("parcampod70",FieldDef.DATE);
            FieldDef array[] = {
                pardominio,
                parusuario,
                parprograma,
                parlinea,
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
                parcampon51,
                parcampod52,
                parcampon52,
                parcampod53,
                parcampon53,
                parcampod54,
                parcampon54,
                parcampod55,
                parcampon55,
                parcampod56,
                parcampon56,
                parcampod57,
                parcampon57,
                parcampod58,
                parcampon58,
                parcampod59,
                parcampon59,
                parcampod60,
                parcampon60,
                parcampoa61,
                parcampod61,
                parcampod62,
                parcampod63,
                parcampod64,
                parcampod65,
                parcampod66,
                parcampod67,
                parcampod68,
                parcampod69,
                parcampod70                
                };
            setColumns(array);
            FieldDef arrayf[] = {pardominio,parusuario,parprograma,paropcion,null };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabIffacturas extends TableDef
        {
        // campos
        public FieldDef infcodi;
        public FieldDef infdeclarante;
        public FieldDef infnifdec;
        public FieldDef infemirep;
        public FieldDef infnif;
        public FieldDef infnombre;
        public FieldDef infpais;
        public FieldDef inffecha;
        public FieldDef inffechaop;
        public FieldDef infbase1;
        public FieldDef infbase2;
        public FieldDef infbase3;
        public FieldDef infbaseex;
        public FieldDef infpor1;
        public FieldDef infpor2;
        public FieldDef infpor3;
        public FieldDef infcuota1;
        public FieldDef infcuota2;
        public FieldDef infcuota3;
        public FieldDef infbirpf;
        public FieldDef infpirpf;
        public FieldDef infcirpf;
        public FieldDef inftotal;
        public FieldDef infserie;
        public FieldDef infnumero;
        public FieldDef infiden;
        public FieldDef infdoc;
        public FieldDef infefectivo;
        public FieldDef inftoper;
        public FieldDef infc190;
        public FieldDef infsituacion;
        public FieldDef infrefcat;
        public FieldDef infrecpor1;
        public FieldDef infrecpor2;
        public FieldDef infrecpor3;
        public FieldDef infreccuota1;
        public FieldDef infreccuota2;
        public FieldDef infreccuota3;
        public FieldDef inffichero;
        public FieldDef inffimport;
        public FieldDef infprov;
        public TabIffacturas(String name)
            {
            super(name);
            infcodi = new FieldDef("infcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            infdeclarante = new FieldDef("infdeclarante",FieldDef.CHAR,12);
            infnifdec = new FieldDef("infnifdec",FieldDef.CHAR,15);
            infemirep = new FieldDef("infemirep",FieldDef.CHAR,1);
            infnif = new FieldDef("infnif",FieldDef.CHAR,15);
            infnombre = new FieldDef("infnombre",FieldDef.CHAR,40);
            infpais = new FieldDef("infpais",FieldDef.CHAR,2);
            inffecha = new FieldDef("inffecha",FieldDef.DATE);
            inffechaop = new FieldDef("inffechaop",FieldDef.DATE);
            infbase1 = new FieldDef("infbase1",FieldDef.FLOAT,6,0);
            infbase2 = new FieldDef("infbase2",FieldDef.FLOAT,6,0);
            infbase3 = new FieldDef("infbase3",FieldDef.FLOAT,6,0);
            infbaseex = new FieldDef("infbaseex",FieldDef.FLOAT,6,0);
            infpor1 = new FieldDef("infpor1",FieldDef.FLOAT,6,0);
            infpor2 = new FieldDef("infpor2",FieldDef.FLOAT,6,0);
            infpor3 = new FieldDef("infpor3",FieldDef.FLOAT,6,0);
            infcuota1 = new FieldDef("infcuota1",FieldDef.FLOAT,6,0);
            infcuota2 = new FieldDef("infcuota2",FieldDef.FLOAT,6,0);
            infcuota3 = new FieldDef("infcuota3",FieldDef.FLOAT,6,0);
            infbirpf = new FieldDef("infbirpf",FieldDef.FLOAT,6,0);
            infpirpf = new FieldDef("infpirpf",FieldDef.FLOAT,6,0);
            infcirpf = new FieldDef("infcirpf",FieldDef.FLOAT,6,0);
            inftotal = new FieldDef("inftotal",FieldDef.FLOAT,6,0);
            infserie = new FieldDef("infserie",FieldDef.CHAR,2);
            infnumero = new FieldDef("infnumero",FieldDef.INTEGER,0);
            infiden = new FieldDef("infiden",FieldDef.CHAR,40);
            infdoc = new FieldDef("infdoc",FieldDef.CHAR,15);
            infefectivo = new FieldDef("infefectivo",FieldDef.FLOAT,6,0);
            inftoper = new FieldDef("inftoper",FieldDef.CHAR,3);
            infc190 = new FieldDef("infc190",FieldDef.CHAR,3);
            infsituacion = new FieldDef("infsituacion",FieldDef.INTEGER,0);
            infrefcat = new FieldDef("infrefcat",FieldDef.CHAR,22);
            infrecpor1 = new FieldDef("infrecpor1",FieldDef.FLOAT,6,0);
            infrecpor2 = new FieldDef("infrecpor2",FieldDef.FLOAT,6,0);
            infrecpor3 = new FieldDef("infrecpor3",FieldDef.FLOAT,6,0);
            infreccuota1 = new FieldDef("infreccuota1",FieldDef.FLOAT,6,0);
            infreccuota2 = new FieldDef("infreccuota2",FieldDef.FLOAT,6,0);
            infreccuota3 = new FieldDef("infreccuota3",FieldDef.FLOAT,6,0);
            inffichero = new FieldDef("inffichero",FieldDef.CHAR,255);
            inffimport = new FieldDef("inffimport",FieldDef.DATE);
            infprov = new FieldDef("infprov",FieldDef.INTEGER,0);
            FieldDef array[] = {
                infcodi,
                infdeclarante,
                infnifdec,
                infemirep,
                infnif,
                infnombre,
                infpais,
                inffecha,
                inffechaop,
                infbase1,
                infbase2,
                infbase3,
                infbaseex,
                infpor1,
                infpor2,
                infpor3,
                infcuota1,
                infcuota2,
                infcuota3,
                infbirpf,
                infpirpf,
                infcirpf,
                inftotal,
                infserie,
                infnumero,
                infiden,
                infdoc,
                infefectivo,
                inftoper,
                infc190,
                infsituacion,
                infrefcat,
                infrecpor1,
                infrecpor2,
                infrecpor3,
                infreccuota1,
                infreccuota2,
                infreccuota3,
                inffichero,
                inffimport,
                infprov                
                };
            setColumns(array);
            FieldDef arrayf[] = {infcodi };
            setPrimaryKeys(arrayf);
            infcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabDeflis303 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis303(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabAeatfirmamod extends TableDef
        {
        // campos
        public FieldDef afmcodi;
        public FieldDef afmdominio;
        public FieldDef afmnif;
        public FieldDef afmmodelo;
        public FieldDef afmejercicio;
        public FieldDef afmperiodo;
        public FieldDef afmidproceso;
        public FieldDef afmfirmaorig;
        public FieldDef afmfirmaorig64;
        public FieldDef afmfirmadest;
        public FieldDef afmfecha;
        public FieldDef afmusuario;
        public FieldDef afmestado;
        public FieldDef afmerror;
        public TabAeatfirmamod(String name)
            {
            super(name);
            afmcodi = new FieldDef("afmcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            afmdominio = new FieldDef("afmdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            afmnif = new FieldDef("afmnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            afmmodelo = new FieldDef("afmmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            afmejercicio = new FieldDef("afmejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            afmperiodo = new FieldDef("afmperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            afmidproceso = new FieldDef("afmidproceso",FieldDef.CHAR,255,FieldDef.NOTNULL);
            afmfirmaorig = new FieldDef("afmfirmaorig",FieldDef.CHAR,4000);
            afmfirmaorig64 = new FieldDef("afmfirmaorig64",FieldDef.CHAR,4000);
            afmfirmadest = new FieldDef("afmfirmadest",FieldDef.CHAR,4000);
            afmfecha = new FieldDef("afmfecha",FieldDef.DATE);
            afmusuario = new FieldDef("afmusuario",FieldDef.CHAR,25);
            afmestado = new FieldDef("afmestado",FieldDef.INTEGER,0);
            afmerror = new FieldDef("afmerror",FieldDef.CHAR,255);
            FieldDef array[] = {
                afmcodi,
                afmdominio,
                afmnif,
                afmmodelo,
                afmejercicio,
                afmperiodo,
                afmidproceso,
                afmfirmaorig,
                afmfirmaorig64,
                afmfirmadest,
                afmfecha,
                afmusuario,
                afmestado,
                afmerror                
                };
            setColumns(array);
            FieldDef arrayf[] = {afmcodi };
            setPrimaryKeys(arrayf);
            afmcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabModrdtoagr extends TableDef
        {
        // campos
        public FieldDef mraejercicio;
        public FieldDef mranif;
        public FieldDef mraactividad;
        public FieldDef mraprodajeno;
        public FieldDef mrapiensos;
        public FieldDef mracostepers;
        public FieldDef mraagrieco;
        public FieldDef mraforestal;
        public FieldDef mrajoven;
        public FieldDef mracodprod1;
        public FieldDef mraingprod1;
        public FieldDef mraindice1;
        public FieldDef mrardtoprod1;
        public FieldDef mracodprod2;
        public FieldDef mraingprod2;
        public FieldDef mraindice2;
        public FieldDef mrardtoprod2;
        public FieldDef mracodprod3;
        public FieldDef mraingprod3;
        public FieldDef mraindice3;
        public FieldDef mrardtoprod3;
        public FieldDef mracodprod4;
        public FieldDef mraingprod4;
        public FieldDef mraindice4;
        public FieldDef mrardtoprod4;
        public FieldDef mracodprod5;
        public FieldDef mraingprod5;
        public FieldDef mraindice5;
        public FieldDef mrardtoprod5;
        public FieldDef mracodprod6;
        public FieldDef mraingprod6;
        public FieldDef mraindice6;
        public FieldDef mrardtoprod6;
        public FieldDef mracodprod7;
        public FieldDef mraingprod7;
        public FieldDef mraindice7;
        public FieldDef mrardtoprod7;
        public FieldDef mracodprod8;
        public FieldDef mraingprod8;
        public FieldDef mraindice8;
        public FieldDef mrardtoprod8;
        public FieldDef mracodprod9;
        public FieldDef mraingprod9;
        public FieldDef mraindice9;
        public FieldDef mrardtoprod9;
        public FieldDef mracodprod10;
        public FieldDef mraingprod10;
        public FieldDef mraindice10;
        public FieldDef mrardtoprod10;
        public FieldDef mracodprod11;
        public FieldDef mraingprod11;
        public FieldDef mraindice11;
        public FieldDef mrardtoprod11;
        public FieldDef mracodprod12;
        public FieldDef mraingprod12;
        public FieldDef mraindice12;
        public FieldDef mrardtoprod12;
        public FieldDef mracodprod13;
        public FieldDef mraingprod13;
        public FieldDef mraindice13;
        public FieldDef mrardtoprod13;
        public FieldDef mrardtoprevio;
        public FieldDef mraimpgasoleo;
        public FieldDef mraimpfertil;
        public FieldDef mraimpamortiz;
        public FieldDef mrardtominor;
        public FieldDef mraindajenos;
        public FieldDef mraindpers;
        public FieldDef mraindarren;
        public FieldDef mraindpiensos;
        public FieldDef mraindecolog;
        public FieldDef mraindpeqemp;
        public FieldDef mraindforest;
        public FieldDef mraindjovenes;
        public FieldDef mraindreddisp;
        public FieldDef mrardtoneto;
        public FieldDef mratotingarr;
        public FieldDef mraenlacejeo;
        public FieldDef mraporingven;
        public FieldDef mraindregadio;
        public FieldDef mratotingrega;
        public FieldDef mracodprod14;
        public FieldDef mraingprod14;
        public FieldDef mraindice14;
        public FieldDef mrardtoprod14;
        public FieldDef mracodprod15;
        public FieldDef mraingprod15;
        public FieldDef mraindice15;
        public FieldDef mrardtoprod15;
        public TabModrdtoagr(String name)
            {
            super(name);
            mraejercicio = new FieldDef("mraejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mranif = new FieldDef("mranif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mraactividad = new FieldDef("mraactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mraprodajeno = new FieldDef("mraprodajeno",FieldDef.CHAR,1);
            mrapiensos = new FieldDef("mrapiensos",FieldDef.CHAR,1);
            mracostepers = new FieldDef("mracostepers",FieldDef.FLOAT,6,0);
            mraagrieco = new FieldDef("mraagrieco",FieldDef.CHAR,1);
            mraforestal = new FieldDef("mraforestal",FieldDef.CHAR,1);
            mrajoven = new FieldDef("mrajoven",FieldDef.CHAR,1);
            mracodprod1 = new FieldDef("mracodprod1",FieldDef.INTEGER,0);
            mraingprod1 = new FieldDef("mraingprod1",FieldDef.FLOAT,6,0);
            mraindice1 = new FieldDef("mraindice1",FieldDef.FLOAT,6,0);
            mrardtoprod1 = new FieldDef("mrardtoprod1",FieldDef.FLOAT,6,0);
            mracodprod2 = new FieldDef("mracodprod2",FieldDef.INTEGER,0);
            mraingprod2 = new FieldDef("mraingprod2",FieldDef.FLOAT,6,0);
            mraindice2 = new FieldDef("mraindice2",FieldDef.FLOAT,6,0);
            mrardtoprod2 = new FieldDef("mrardtoprod2",FieldDef.FLOAT,6,0);
            mracodprod3 = new FieldDef("mracodprod3",FieldDef.INTEGER,0);
            mraingprod3 = new FieldDef("mraingprod3",FieldDef.FLOAT,6,0);
            mraindice3 = new FieldDef("mraindice3",FieldDef.FLOAT,6,0);
            mrardtoprod3 = new FieldDef("mrardtoprod3",FieldDef.FLOAT,6,0);
            mracodprod4 = new FieldDef("mracodprod4",FieldDef.INTEGER,0);
            mraingprod4 = new FieldDef("mraingprod4",FieldDef.FLOAT,6,0);
            mraindice4 = new FieldDef("mraindice4",FieldDef.FLOAT,6,0);
            mrardtoprod4 = new FieldDef("mrardtoprod4",FieldDef.FLOAT,6,0);
            mracodprod5 = new FieldDef("mracodprod5",FieldDef.INTEGER,0);
            mraingprod5 = new FieldDef("mraingprod5",FieldDef.FLOAT,6,0);
            mraindice5 = new FieldDef("mraindice5",FieldDef.FLOAT,6,0);
            mrardtoprod5 = new FieldDef("mrardtoprod5",FieldDef.FLOAT,6,0);
            mracodprod6 = new FieldDef("mracodprod6",FieldDef.INTEGER,0);
            mraingprod6 = new FieldDef("mraingprod6",FieldDef.FLOAT,6,0);
            mraindice6 = new FieldDef("mraindice6",FieldDef.FLOAT,6,0);
            mrardtoprod6 = new FieldDef("mrardtoprod6",FieldDef.FLOAT,6,0);
            mracodprod7 = new FieldDef("mracodprod7",FieldDef.INTEGER,0);
            mraingprod7 = new FieldDef("mraingprod7",FieldDef.FLOAT,6,0);
            mraindice7 = new FieldDef("mraindice7",FieldDef.FLOAT,6,0);
            mrardtoprod7 = new FieldDef("mrardtoprod7",FieldDef.FLOAT,6,0);
            mracodprod8 = new FieldDef("mracodprod8",FieldDef.INTEGER,0);
            mraingprod8 = new FieldDef("mraingprod8",FieldDef.FLOAT,6,0);
            mraindice8 = new FieldDef("mraindice8",FieldDef.FLOAT,6,0);
            mrardtoprod8 = new FieldDef("mrardtoprod8",FieldDef.FLOAT,6,0);
            mracodprod9 = new FieldDef("mracodprod9",FieldDef.INTEGER,0);
            mraingprod9 = new FieldDef("mraingprod9",FieldDef.FLOAT,6,0);
            mraindice9 = new FieldDef("mraindice9",FieldDef.FLOAT,6,0);
            mrardtoprod9 = new FieldDef("mrardtoprod9",FieldDef.FLOAT,6,0);
            mracodprod10 = new FieldDef("mracodprod10",FieldDef.INTEGER,0);
            mraingprod10 = new FieldDef("mraingprod10",FieldDef.FLOAT,6,0);
            mraindice10 = new FieldDef("mraindice10",FieldDef.FLOAT,6,0);
            mrardtoprod10 = new FieldDef("mrardtoprod10",FieldDef.FLOAT,6,0);
            mracodprod11 = new FieldDef("mracodprod11",FieldDef.INTEGER,0);
            mraingprod11 = new FieldDef("mraingprod11",FieldDef.FLOAT,6,0);
            mraindice11 = new FieldDef("mraindice11",FieldDef.FLOAT,6,0);
            mrardtoprod11 = new FieldDef("mrardtoprod11",FieldDef.FLOAT,6,0);
            mracodprod12 = new FieldDef("mracodprod12",FieldDef.INTEGER,0);
            mraingprod12 = new FieldDef("mraingprod12",FieldDef.FLOAT,6,0);
            mraindice12 = new FieldDef("mraindice12",FieldDef.FLOAT,6,0);
            mrardtoprod12 = new FieldDef("mrardtoprod12",FieldDef.FLOAT,6,0);
            mracodprod13 = new FieldDef("mracodprod13",FieldDef.INTEGER,0);
            mraingprod13 = new FieldDef("mraingprod13",FieldDef.FLOAT,6,0);
            mraindice13 = new FieldDef("mraindice13",FieldDef.FLOAT,6,0);
            mrardtoprod13 = new FieldDef("mrardtoprod13",FieldDef.FLOAT,6,0);
            mrardtoprevio = new FieldDef("mrardtoprevio",FieldDef.FLOAT,6,0);
            mraimpgasoleo = new FieldDef("mraimpgasoleo",FieldDef.FLOAT,6,0);
            mraimpfertil = new FieldDef("mraimpfertil",FieldDef.FLOAT,6,0);
            mraimpamortiz = new FieldDef("mraimpamortiz",FieldDef.FLOAT,6,0);
            mrardtominor = new FieldDef("mrardtominor",FieldDef.FLOAT,6,0);
            mraindajenos = new FieldDef("mraindajenos",FieldDef.FLOAT,6,0);
            mraindpers = new FieldDef("mraindpers",FieldDef.FLOAT,6,0);
            mraindarren = new FieldDef("mraindarren",FieldDef.FLOAT,6,0);
            mraindpiensos = new FieldDef("mraindpiensos",FieldDef.FLOAT,6,0);
            mraindecolog = new FieldDef("mraindecolog",FieldDef.FLOAT,6,0);
            mraindpeqemp = new FieldDef("mraindpeqemp",FieldDef.FLOAT,6,0);
            mraindforest = new FieldDef("mraindforest",FieldDef.FLOAT,6,0);
            mraindjovenes = new FieldDef("mraindjovenes",FieldDef.FLOAT,6,0);
            mraindreddisp = new FieldDef("mraindreddisp",FieldDef.FLOAT,6,0);
            mrardtoneto = new FieldDef("mrardtoneto",FieldDef.FLOAT,6,0);
            mratotingarr = new FieldDef("mratotingarr",FieldDef.FLOAT,6,0);
            mraenlacejeo = new FieldDef("mraenlacejeo",FieldDef.CHAR,12);
            mraporingven = new FieldDef("mraporingven",FieldDef.FLOAT,6,0);
            mraindregadio = new FieldDef("mraindregadio",FieldDef.FLOAT,6,0);
            mratotingrega = new FieldDef("mratotingrega",FieldDef.FLOAT,6,0);
            mracodprod14 = new FieldDef("mracodprod14",FieldDef.INTEGER,0);
            mraingprod14 = new FieldDef("mraingprod14",FieldDef.FLOAT,6,0);
            mraindice14 = new FieldDef("mraindice14",FieldDef.FLOAT,6,0);
            mrardtoprod14 = new FieldDef("mrardtoprod14",FieldDef.FLOAT,6,0);
            mracodprod15 = new FieldDef("mracodprod15",FieldDef.INTEGER,0);
            mraingprod15 = new FieldDef("mraingprod15",FieldDef.FLOAT,6,0);
            mraindice15 = new FieldDef("mraindice15",FieldDef.FLOAT,6,0);
            mrardtoprod15 = new FieldDef("mrardtoprod15",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                mraejercicio,
                mranif,
                mraactividad,
                mraprodajeno,
                mrapiensos,
                mracostepers,
                mraagrieco,
                mraforestal,
                mrajoven,
                mracodprod1,
                mraingprod1,
                mraindice1,
                mrardtoprod1,
                mracodprod2,
                mraingprod2,
                mraindice2,
                mrardtoprod2,
                mracodprod3,
                mraingprod3,
                mraindice3,
                mrardtoprod3,
                mracodprod4,
                mraingprod4,
                mraindice4,
                mrardtoprod4,
                mracodprod5,
                mraingprod5,
                mraindice5,
                mrardtoprod5,
                mracodprod6,
                mraingprod6,
                mraindice6,
                mrardtoprod6,
                mracodprod7,
                mraingprod7,
                mraindice7,
                mrardtoprod7,
                mracodprod8,
                mraingprod8,
                mraindice8,
                mrardtoprod8,
                mracodprod9,
                mraingprod9,
                mraindice9,
                mrardtoprod9,
                mracodprod10,
                mraingprod10,
                mraindice10,
                mrardtoprod10,
                mracodprod11,
                mraingprod11,
                mraindice11,
                mrardtoprod11,
                mracodprod12,
                mraingprod12,
                mraindice12,
                mrardtoprod12,
                mracodprod13,
                mraingprod13,
                mraindice13,
                mrardtoprod13,
                mrardtoprevio,
                mraimpgasoleo,
                mraimpfertil,
                mraimpamortiz,
                mrardtominor,
                mraindajenos,
                mraindpers,
                mraindarren,
                mraindpiensos,
                mraindecolog,
                mraindpeqemp,
                mraindforest,
                mraindjovenes,
                mraindreddisp,
                mrardtoneto,
                mratotingarr,
                mraenlacejeo,
                mraporingven,
                mraindregadio,
                mratotingrega,
                mracodprod14,
                mraingprod14,
                mraindice14,
                mrardtoprod14,
                mracodprod15,
                mraingprod15,
                mraindice15,
                mrardtoprod15                
                };
            setColumns(array);
            FieldDef arrayf[] = {mraejercicio,mranif,mraactividad };
            setPrimaryKeys(arrayf);
            mraindregadio.setDescription("Indice cultivos en tierra regadio por energia electrica");
            mratotingrega.setDescription("Total ingresos en cultivos realizados en tierras de regadío por energia electrica");
            }
        }
        
    public class TabModingagr extends TableDef
        {
        // campos
        public FieldDef mnaejercicio;
        public FieldDef mnanif;
        public FieldDef mnaactividad;
        public FieldDef mnacodigo;
        public FieldDef mnaingresot1;
        public FieldDef mnaingresot2;
        public FieldDef mnaingresot3;
        public FieldDef mnaingresot4;
        public FieldDef mnaingarret1;
        public FieldDef mnaingarret2;
        public FieldDef mnaingarret3;
        public FieldDef mnaingarret4;
        public FieldDef mnasubcorrt1;
        public FieldDef mnasubcorrt2;
        public FieldDef mnasubcorrt3;
        public FieldDef mnasubcorrt4;
        public FieldDef mnasubcapit1;
        public FieldDef mnasubcapit2;
        public FieldDef mnasubcapit3;
        public FieldDef mnasubcapit4;
        public FieldDef mnasubarret1;
        public FieldDef mnasubarret2;
        public FieldDef mnasubarret3;
        public FieldDef mnasubarret4;
        public FieldDef mnaretent1;
        public FieldDef mnaretent2;
        public FieldDef mnaretent3;
        public FieldDef mnaretent4;
        public FieldDef mnahectpropias;
        public FieldDef mnahectarrend;
        public FieldDef mnaenlacejeo;
        public FieldDef mnaliqirpf;
        public FieldDef mnahectnoregad;
        public FieldDef mnahectregadio;
        public FieldDef mnaingregadt1;
        public FieldDef mnaingregadt2;
        public FieldDef mnaingregadt3;
        public FieldDef mnaingregadt4;
        public FieldDef mnasubregadt1;
        public FieldDef mnasubregadt2;
        public FieldDef mnasubregadt3;
        public FieldDef mnasubregadt4;
        public TabModingagr(String name)
            {
            super(name);
            mnaejercicio = new FieldDef("mnaejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mnanif = new FieldDef("mnanif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mnaactividad = new FieldDef("mnaactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mnacodigo = new FieldDef("mnacodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mnaingresot1 = new FieldDef("mnaingresot1",FieldDef.FLOAT,6,0);
            mnaingresot2 = new FieldDef("mnaingresot2",FieldDef.FLOAT,6,0);
            mnaingresot3 = new FieldDef("mnaingresot3",FieldDef.FLOAT,6,0);
            mnaingresot4 = new FieldDef("mnaingresot4",FieldDef.FLOAT,6,0);
            mnaingarret1 = new FieldDef("mnaingarret1",FieldDef.FLOAT,6,0);
            mnaingarret2 = new FieldDef("mnaingarret2",FieldDef.FLOAT,6,0);
            mnaingarret3 = new FieldDef("mnaingarret3",FieldDef.FLOAT,6,0);
            mnaingarret4 = new FieldDef("mnaingarret4",FieldDef.FLOAT,6,0);
            mnasubcorrt1 = new FieldDef("mnasubcorrt1",FieldDef.FLOAT,6,0);
            mnasubcorrt2 = new FieldDef("mnasubcorrt2",FieldDef.FLOAT,6,0);
            mnasubcorrt3 = new FieldDef("mnasubcorrt3",FieldDef.FLOAT,6,0);
            mnasubcorrt4 = new FieldDef("mnasubcorrt4",FieldDef.FLOAT,6,0);
            mnasubcapit1 = new FieldDef("mnasubcapit1",FieldDef.FLOAT,6,0);
            mnasubcapit2 = new FieldDef("mnasubcapit2",FieldDef.FLOAT,6,0);
            mnasubcapit3 = new FieldDef("mnasubcapit3",FieldDef.FLOAT,6,0);
            mnasubcapit4 = new FieldDef("mnasubcapit4",FieldDef.FLOAT,6,0);
            mnasubarret1 = new FieldDef("mnasubarret1",FieldDef.FLOAT,6,0);
            mnasubarret2 = new FieldDef("mnasubarret2",FieldDef.FLOAT,6,0);
            mnasubarret3 = new FieldDef("mnasubarret3",FieldDef.FLOAT,6,0);
            mnasubarret4 = new FieldDef("mnasubarret4",FieldDef.FLOAT,6,0);
            mnaretent1 = new FieldDef("mnaretent1",FieldDef.FLOAT,6,0);
            mnaretent2 = new FieldDef("mnaretent2",FieldDef.FLOAT,6,0);
            mnaretent3 = new FieldDef("mnaretent3",FieldDef.FLOAT,6,0);
            mnaretent4 = new FieldDef("mnaretent4",FieldDef.FLOAT,6,0);
            mnahectpropias = new FieldDef("mnahectpropias",FieldDef.FLOAT,6,0);
            mnahectarrend = new FieldDef("mnahectarrend",FieldDef.FLOAT,6,0);
            mnaenlacejeo = new FieldDef("mnaenlacejeo",FieldDef.CHAR,12);
            mnaliqirpf = new FieldDef("mnaliqirpf",FieldDef.CHAR,1);
            mnahectnoregad = new FieldDef("mnahectnoregad",FieldDef.FLOAT,6,0);
            mnahectregadio = new FieldDef("mnahectregadio",FieldDef.FLOAT,6,0);
            mnaingregadt1 = new FieldDef("mnaingregadt1",FieldDef.FLOAT,6,0);
            mnaingregadt2 = new FieldDef("mnaingregadt2",FieldDef.FLOAT,6,0);
            mnaingregadt3 = new FieldDef("mnaingregadt3",FieldDef.FLOAT,6,0);
            mnaingregadt4 = new FieldDef("mnaingregadt4",FieldDef.FLOAT,6,0);
            mnasubregadt1 = new FieldDef("mnasubregadt1",FieldDef.FLOAT,6,0);
            mnasubregadt2 = new FieldDef("mnasubregadt2",FieldDef.FLOAT,6,0);
            mnasubregadt3 = new FieldDef("mnasubregadt3",FieldDef.FLOAT,6,0);
            mnasubregadt4 = new FieldDef("mnasubregadt4",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                mnaejercicio,
                mnanif,
                mnaactividad,
                mnacodigo,
                mnaingresot1,
                mnaingresot2,
                mnaingresot3,
                mnaingresot4,
                mnaingarret1,
                mnaingarret2,
                mnaingarret3,
                mnaingarret4,
                mnasubcorrt1,
                mnasubcorrt2,
                mnasubcorrt3,
                mnasubcorrt4,
                mnasubcapit1,
                mnasubcapit2,
                mnasubcapit3,
                mnasubcapit4,
                mnasubarret1,
                mnasubarret2,
                mnasubarret3,
                mnasubarret4,
                mnaretent1,
                mnaretent2,
                mnaretent3,
                mnaretent4,
                mnahectpropias,
                mnahectarrend,
                mnaenlacejeo,
                mnaliqirpf,
                mnahectnoregad,
                mnahectregadio,
                mnaingregadt1,
                mnaingregadt2,
                mnaingregadt3,
                mnaingregadt4,
                mnasubregadt1,
                mnasubregadt2,
                mnasubregadt3,
                mnasubregadt4                
                };
            setColumns(array);
            FieldDef arrayf[] = {mnaejercicio,mnanif,mnaactividad,mnacodigo };
            setPrimaryKeys(arrayf);
            mnahectnoregad.setDescription("Hectareas no regadío");
            mnahectregadio.setDescription("Hectareas destinadas a cultivos en tierra de regadio por energia electrica");
            mnaingregadt1.setDescription("Ingresos cultivos regadio por energia electrica trimestre 1");
            mnaingregadt2.setDescription("Ingresos cultivos regadio por energia electrica trimestre 2");
            mnaingregadt3.setDescription("Ingresos cultivos regadio por energia electrica trimestre 3");
            mnaingregadt4.setDescription("Ingresos cultivos regadio por energia electrica trimestre 4");
            mnasubregadt1.setDescription("Subvenciones cultivos regadio por energia electrica trimestre 1");
            mnasubregadt2.setDescription("Subvenciones cultivos regadio por energia electrica trimestre 2");
            mnasubregadt3.setDescription("Subvenciones cultivos regadio por energia electrica trimestre 3");
            mnasubregadt4.setDescription("Subvenciones cultivos regadio por energia electrica trimestre 4");
            }
        }
        
    public class TabDeflis111 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis111(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis115 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis115(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis123 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis123(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis216 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis216(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis130 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis130(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis131 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis131(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis202 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis202(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis222 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis222(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis308 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis308(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis309 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis309(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis353 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis353(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModcalendario extends TableDef
        {
        // campos
        public FieldDef mclany;
        public FieldDef mclmodelo;
        public FieldDef mcltipoper;
        public FieldDef mclperiodo;
        public FieldDef mcldesde;
        public FieldDef mclhasta;
        public FieldDef mclejercicio;
        public TabModcalendario(String name)
            {
            super(name);
            mclany = new FieldDef("mclany",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mclmodelo = new FieldDef("mclmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            mcltipoper = new FieldDef("mcltipoper",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mclperiodo = new FieldDef("mclperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mcldesde = new FieldDef("mcldesde",FieldDef.DATE);
            mclhasta = new FieldDef("mclhasta",FieldDef.DATE);
            mclejercicio = new FieldDef("mclejercicio",FieldDef.INTEGER,0);
            FieldDef array[] = {
                mclany,
                mclmodelo,
                mcltipoper,
                mclperiodo,
                mcldesde,
                mclhasta,
                mclejercicio                
                };
            setColumns(array);
            FieldDef arrayf[] = {mclany,mclmodelo,mcltipoper,mclperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis390 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis390(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,20);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis282 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis282(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod210r extends TableDef
        {
        // campos
        public FieldDef m210rdominio;
        public FieldDef m210rnif;
        public FieldDef m210rejercicio;
        public FieldDef m210rident;
        public FieldDef m210rempresa;
        public FieldDef m210rmuf;
        public FieldDef m210rtributac;
        public FieldDef m210ractivo;
        public FieldDef m210rrevisado;
        public FieldDef m210ragrupa;
        public FieldDef m210restrim;
        public FieldDef m210rtipo;
        public FieldDef m210rtipograva;
        public FieldDef m210rescala;
        public FieldDef m210rdivisa;
        public FieldDef m210rperiodo;
        public FieldDef m210rejer;
        public FieldDef m210rfechadev;
        public FieldDef m210rporcen;
        public FieldDef m210rimportea;
        public FieldDef m210rimporte1;
        public FieldDef m210rimporte2;
        public FieldDef m210rimporte3;
        public FieldDef m210rimporte4;
        public FieldDef m210rgastoa;
        public FieldDef m210rgasto1;
        public FieldDef m210rgasto2;
        public FieldDef m210rgasto3;
        public FieldDef m210rgasto4;
        public FieldDef m210rcuota;
        public FieldDef m210rcuota1;
        public FieldDef m210rcuota2;
        public FieldDef m210rcuota3;
        public FieldDef m210rcuota4;
        public FieldDef m210rdon;
        public FieldDef m210rdon1;
        public FieldDef m210rdon2;
        public FieldDef m210rdon3;
        public FieldDef m210rdon4;
        public FieldDef m210rreten;
        public FieldDef m210rreten1;
        public FieldDef m210rreten2;
        public FieldDef m210rreten3;
        public FieldDef m210rreten4;
        public FieldDef m210rresultado;
        public FieldDef m210rresultado1;
        public FieldDef m210rresultado2;
        public FieldDef m210rresultado3;
        public FieldDef m210rresultado4;
        public FieldDef m210rconvenio;
        public FieldDef m210ranterior;
        public FieldDef m210rnro210;
        public FieldDef m210rnifp;
        public FieldDef m210rfisjurp;
        public FieldDef m210rnombrep;
        public FieldDef m210ridfinca;
        public FieldDef m210rcalle;
        public FieldDef m210rnumero;
        public FieldDef m210rmunicipio;
        public FieldDef m210rprovincia;
        public FieldDef m210rctipovia;
        public FieldDef m210rctiponum;
        public FieldDef m210rcalifnum;
        public FieldDef m210rcbloque;
        public FieldDef m210rcportal;
        public FieldDef m210rcescalera;
        public FieldDef m210rcplanta;
        public FieldDef m210rcpuerta;
        public FieldDef m210rclavepais;
        public FieldDef m210rcpostal;
        public FieldDef m210rcodigoine;
        public FieldDef m210rpoblacion;
        public FieldDef m210rcatastral;
        public FieldDef m210rfecven1;
        public FieldDef m210rfecadq1;
        public FieldDef m210rventa1;
        public FieldDef m210rcompra1;
        public FieldDef m210rdifer1;
        public FieldDef m210rganan1;
        public FieldDef m210rfecven2;
        public FieldDef m210rfecadq2;
        public FieldDef m210rventa2;
        public FieldDef m210rcompra2;
        public FieldDef m210rdifer2;
        public FieldDef m210rganan2;
        public FieldDef m210rtipgan1;
        public FieldDef m210rpat;
        public FieldDef m210rabatim1;
        public FieldDef m210rsus1;
        public FieldDef m210rdt91;
        public FieldDef m210rreinv1;
        public FieldDef m210rexvda1;
        public FieldDef m210rabatim2;
        public FieldDef m210rsus2;
        public FieldDef m210rdt92;
        public FieldDef m210rreinv2;
        public FieldDef m210rexvda2;
        public FieldDef m210rganancia;
        public FieldDef m210rnro211;
        public FieldDef m210rco;
        public FieldDef m210rpordec;
        public FieldDef m210rporcon;
        public FieldDef m210rnifconh;
        public FieldDef m210rnomconh;
        public TabMod210r(String name)
            {
            super(name);
            m210rdominio = new FieldDef("m210rdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m210rnif = new FieldDef("m210rnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m210rejercicio = new FieldDef("m210rejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m210rident = new FieldDef("m210rident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m210rempresa = new FieldDef("m210rempresa",FieldDef.CHAR,12);
            m210rmuf = new FieldDef("m210rmuf",FieldDef.CHAR,6);
            m210rtributac = new FieldDef("m210rtributac",FieldDef.CHAR,1);
            m210ractivo = new FieldDef("m210ractivo",FieldDef.CHAR,1);
            m210rrevisado = new FieldDef("m210rrevisado",FieldDef.CHAR,1);
            m210ragrupa = new FieldDef("m210ragrupa",FieldDef.CHAR,1);
            m210restrim = new FieldDef("m210restrim",FieldDef.CHAR,1);
            m210rtipo = new FieldDef("m210rtipo",FieldDef.CHAR,2);
            m210rtipograva = new FieldDef("m210rtipograva",FieldDef.FLOAT,6,0);
            m210rescala = new FieldDef("m210rescala",FieldDef.CHAR,1);
            m210rdivisa = new FieldDef("m210rdivisa",FieldDef.CHAR,3);
            m210rperiodo = new FieldDef("m210rperiodo",FieldDef.CHAR,2);
            m210rejer = new FieldDef("m210rejer",FieldDef.INTEGER,0);
            m210rfechadev = new FieldDef("m210rfechadev",FieldDef.DATE);
            m210rporcen = new FieldDef("m210rporcen",FieldDef.FLOAT,6,0);
            m210rimportea = new FieldDef("m210rimportea",FieldDef.FLOAT,6,0);
            m210rimporte1 = new FieldDef("m210rimporte1",FieldDef.FLOAT,6,0);
            m210rimporte2 = new FieldDef("m210rimporte2",FieldDef.FLOAT,6,0);
            m210rimporte3 = new FieldDef("m210rimporte3",FieldDef.FLOAT,6,0);
            m210rimporte4 = new FieldDef("m210rimporte4",FieldDef.FLOAT,6,0);
            m210rgastoa = new FieldDef("m210rgastoa",FieldDef.FLOAT,6,0);
            m210rgasto1 = new FieldDef("m210rgasto1",FieldDef.FLOAT,6,0);
            m210rgasto2 = new FieldDef("m210rgasto2",FieldDef.FLOAT,6,0);
            m210rgasto3 = new FieldDef("m210rgasto3",FieldDef.FLOAT,6,0);
            m210rgasto4 = new FieldDef("m210rgasto4",FieldDef.FLOAT,6,0);
            m210rcuota = new FieldDef("m210rcuota",FieldDef.FLOAT,6,0);
            m210rcuota1 = new FieldDef("m210rcuota1",FieldDef.FLOAT,6,0);
            m210rcuota2 = new FieldDef("m210rcuota2",FieldDef.FLOAT,6,0);
            m210rcuota3 = new FieldDef("m210rcuota3",FieldDef.FLOAT,6,0);
            m210rcuota4 = new FieldDef("m210rcuota4",FieldDef.FLOAT,6,0);
            m210rdon = new FieldDef("m210rdon",FieldDef.FLOAT,6,0);
            m210rdon1 = new FieldDef("m210rdon1",FieldDef.FLOAT,6,0);
            m210rdon2 = new FieldDef("m210rdon2",FieldDef.FLOAT,6,0);
            m210rdon3 = new FieldDef("m210rdon3",FieldDef.FLOAT,6,0);
            m210rdon4 = new FieldDef("m210rdon4",FieldDef.FLOAT,6,0);
            m210rreten = new FieldDef("m210rreten",FieldDef.FLOAT,6,0);
            m210rreten1 = new FieldDef("m210rreten1",FieldDef.FLOAT,6,0);
            m210rreten2 = new FieldDef("m210rreten2",FieldDef.FLOAT,6,0);
            m210rreten3 = new FieldDef("m210rreten3",FieldDef.FLOAT,6,0);
            m210rreten4 = new FieldDef("m210rreten4",FieldDef.FLOAT,6,0);
            m210rresultado = new FieldDef("m210rresultado",FieldDef.FLOAT,6,0);
            m210rresultado1 = new FieldDef("m210rresultado1",FieldDef.FLOAT,6,0);
            m210rresultado2 = new FieldDef("m210rresultado2",FieldDef.FLOAT,6,0);
            m210rresultado3 = new FieldDef("m210rresultado3",FieldDef.FLOAT,6,0);
            m210rresultado4 = new FieldDef("m210rresultado4",FieldDef.FLOAT,6,0);
            m210rconvenio = new FieldDef("m210rconvenio",FieldDef.FLOAT,6,0);
            m210ranterior = new FieldDef("m210ranterior",FieldDef.FLOAT,6,0);
            m210rnro210 = new FieldDef("m210rnro210",FieldDef.CHAR,13);
            m210rnifp = new FieldDef("m210rnifp",FieldDef.CHAR,9);
            m210rfisjurp = new FieldDef("m210rfisjurp",FieldDef.CHAR,1);
            m210rnombrep = new FieldDef("m210rnombrep",FieldDef.CHAR,100);
            m210ridfinca = new FieldDef("m210ridfinca",FieldDef.INTEGER,0);
            m210rcalle = new FieldDef("m210rcalle",FieldDef.CHAR,50);
            m210rnumero = new FieldDef("m210rnumero",FieldDef.CHAR,4);
            m210rmunicipio = new FieldDef("m210rmunicipio",FieldDef.CHAR,30);
            m210rprovincia = new FieldDef("m210rprovincia",FieldDef.INTEGER,0);
            m210rctipovia = new FieldDef("m210rctipovia",FieldDef.CHAR,5);
            m210rctiponum = new FieldDef("m210rctiponum",FieldDef.CHAR,3);
            m210rcalifnum = new FieldDef("m210rcalifnum",FieldDef.CHAR,3);
            m210rcbloque = new FieldDef("m210rcbloque",FieldDef.CHAR,3);
            m210rcportal = new FieldDef("m210rcportal",FieldDef.CHAR,3);
            m210rcescalera = new FieldDef("m210rcescalera",FieldDef.CHAR,3);
            m210rcplanta = new FieldDef("m210rcplanta",FieldDef.CHAR,3);
            m210rcpuerta = new FieldDef("m210rcpuerta",FieldDef.CHAR,3);
            m210rclavepais = new FieldDef("m210rclavepais",FieldDef.CHAR,2);
            m210rcpostal = new FieldDef("m210rcpostal",FieldDef.CHAR,5);
            m210rcodigoine = new FieldDef("m210rcodigoine",FieldDef.CHAR,5);
            m210rpoblacion = new FieldDef("m210rpoblacion",FieldDef.CHAR,30);
            m210rcatastral = new FieldDef("m210rcatastral",FieldDef.CHAR,20);
            m210rfecven1 = new FieldDef("m210rfecven1",FieldDef.DATE);
            m210rfecadq1 = new FieldDef("m210rfecadq1",FieldDef.DATE);
            m210rventa1 = new FieldDef("m210rventa1",FieldDef.FLOAT,6,0);
            m210rcompra1 = new FieldDef("m210rcompra1",FieldDef.FLOAT,6,0);
            m210rdifer1 = new FieldDef("m210rdifer1",FieldDef.FLOAT,6,0);
            m210rganan1 = new FieldDef("m210rganan1",FieldDef.FLOAT,6,0);
            m210rfecven2 = new FieldDef("m210rfecven2",FieldDef.DATE);
            m210rfecadq2 = new FieldDef("m210rfecadq2",FieldDef.DATE);
            m210rventa2 = new FieldDef("m210rventa2",FieldDef.FLOAT,6,0);
            m210rcompra2 = new FieldDef("m210rcompra2",FieldDef.FLOAT,6,0);
            m210rdifer2 = new FieldDef("m210rdifer2",FieldDef.FLOAT,6,0);
            m210rganan2 = new FieldDef("m210rganan2",FieldDef.FLOAT,6,0);
            m210rtipgan1 = new FieldDef("m210rtipgan1",FieldDef.CHAR,3);
            m210rpat = new FieldDef("m210rpat",FieldDef.FLOAT,6,0);
            m210rabatim1 = new FieldDef("m210rabatim1",FieldDef.FLOAT,6,0);
            m210rsus1 = new FieldDef("m210rsus1",FieldDef.FLOAT,6,0);
            m210rdt91 = new FieldDef("m210rdt91",FieldDef.FLOAT,6,0);
            m210rreinv1 = new FieldDef("m210rreinv1",FieldDef.FLOAT,6,0);
            m210rexvda1 = new FieldDef("m210rexvda1",FieldDef.FLOAT,6,0);
            m210rabatim2 = new FieldDef("m210rabatim2",FieldDef.FLOAT,6,0);
            m210rsus2 = new FieldDef("m210rsus2",FieldDef.FLOAT,6,0);
            m210rdt92 = new FieldDef("m210rdt92",FieldDef.FLOAT,6,0);
            m210rreinv2 = new FieldDef("m210rreinv2",FieldDef.FLOAT,6,0);
            m210rexvda2 = new FieldDef("m210rexvda2",FieldDef.FLOAT,6,0);
            m210rganancia = new FieldDef("m210rganancia",FieldDef.FLOAT,6,0);
            m210rnro211 = new FieldDef("m210rnro211",FieldDef.CHAR,13);
            m210rco = new FieldDef("m210rco",FieldDef.CHAR,1);
            m210rpordec = new FieldDef("m210rpordec",FieldDef.FLOAT,6,0);
            m210rporcon = new FieldDef("m210rporcon",FieldDef.FLOAT,6,0);
            m210rnifconh = new FieldDef("m210rnifconh",FieldDef.CHAR,9);
            m210rnomconh = new FieldDef("m210rnomconh",FieldDef.CHAR,40);
            FieldDef array[] = {
                m210rdominio,
                m210rnif,
                m210rejercicio,
                m210rident,
                m210rempresa,
                m210rmuf,
                m210rtributac,
                m210ractivo,
                m210rrevisado,
                m210ragrupa,
                m210restrim,
                m210rtipo,
                m210rtipograva,
                m210rescala,
                m210rdivisa,
                m210rperiodo,
                m210rejer,
                m210rfechadev,
                m210rporcen,
                m210rimportea,
                m210rimporte1,
                m210rimporte2,
                m210rimporte3,
                m210rimporte4,
                m210rgastoa,
                m210rgasto1,
                m210rgasto2,
                m210rgasto3,
                m210rgasto4,
                m210rcuota,
                m210rcuota1,
                m210rcuota2,
                m210rcuota3,
                m210rcuota4,
                m210rdon,
                m210rdon1,
                m210rdon2,
                m210rdon3,
                m210rdon4,
                m210rreten,
                m210rreten1,
                m210rreten2,
                m210rreten3,
                m210rreten4,
                m210rresultado,
                m210rresultado1,
                m210rresultado2,
                m210rresultado3,
                m210rresultado4,
                m210rconvenio,
                m210ranterior,
                m210rnro210,
                m210rnifp,
                m210rfisjurp,
                m210rnombrep,
                m210ridfinca,
                m210rcalle,
                m210rnumero,
                m210rmunicipio,
                m210rprovincia,
                m210rctipovia,
                m210rctiponum,
                m210rcalifnum,
                m210rcbloque,
                m210rcportal,
                m210rcescalera,
                m210rcplanta,
                m210rcpuerta,
                m210rclavepais,
                m210rcpostal,
                m210rcodigoine,
                m210rpoblacion,
                m210rcatastral,
                m210rfecven1,
                m210rfecadq1,
                m210rventa1,
                m210rcompra1,
                m210rdifer1,
                m210rganan1,
                m210rfecven2,
                m210rfecadq2,
                m210rventa2,
                m210rcompra2,
                m210rdifer2,
                m210rganan2,
                m210rtipgan1,
                m210rpat,
                m210rabatim1,
                m210rsus1,
                m210rdt91,
                m210rreinv1,
                m210rexvda1,
                m210rabatim2,
                m210rsus2,
                m210rdt92,
                m210rreinv2,
                m210rexvda2,
                m210rganancia,
                m210rnro211,
                m210rco,
                m210rpordec,
                m210rporcon,
                m210rnifconh,
                m210rnomconh                
                };
            setColumns(array);
            FieldDef arrayf[] = {m210rdominio,m210rnif,m210rejercicio,m210rident };
            setDescription("Rentas no residentes 210 (Jrenta)");
            setPrimaryKeys(arrayf);
            m210rnif.setDescription("NIF declarante");
            m210rejercicio.setDescription("Ejercicio aplicacion");
            m210rident.setDescription("Identificador");
            m210rempresa.setDescription("codi declarante");
            m210rmuf.setDescription("M.U.F.");
            m210rtributac.setDescription("Conjunta/Individual");
            m210ractivo.setDescription("Activado/desactivado");
            m210rrevisado.setDescription("Revisado");
            m210ragrupa.setDescription("Agrupacion");
            m210restrim.setDescription("S/N trimestral");
            m210rtipo.setDescription("Tipo de renta");
            m210rtipograva.setDescription("Tipo de gravamen");
            m210rescala.setDescription("S/N aplica escala");
            m210rdivisa.setDescription("Divisa");
            m210rperiodo.setDescription("Devengo Periodo devengo 0A-1T..,");
            m210rejer.setDescription("Devengo Ejer.");
            m210rfechadev.setDescription("Devengo Fecha");
            m210rporcen.setDescription("Porcentaje");
            m210rimportea.setDescription("Importe anual Rdto/Imputacion");
            m210rimporte1.setDescription("Importe 1T");
            m210rimporte2.setDescription("Importe 2T");
            m210rimporte3.setDescription("Importe 3T");
            m210rimporte4.setDescription("Importe 4T");
            m210rgastoa.setDescription("Gastos deducibles");
            m210rgasto1.setDescription("Gastos 1T");
            m210rgasto2.setDescription("Gastos 2T");
            m210rgasto3.setDescription("Gastos 3T");
            m210rgasto4.setDescription("Gastos 4T");
            m210rcuota.setDescription("Liquidacion: Cuota");
            m210rcuota1.setDescription("Liquidacion: Cuota 1T");
            m210rcuota2.setDescription("Liquidacion: Cuota 2T");
            m210rcuota3.setDescription("Liquidacion: Cuota 3T");
            m210rcuota4.setDescription("Liquidacion: Cuota 4T");
            m210rdon.setDescription("Liquidacion: Ded.Donativos");
            m210rdon1.setDescription("Liquidacion: Ded.Donativos 1T");
            m210rdon2.setDescription("Liquidacion: Ded.Donativos 2T");
            m210rdon3.setDescription("Liquidacion: Ded.Donativos 3T");
            m210rdon4.setDescription("Liquidacion: Ded.Donativos 4T");
            m210rreten.setDescription("Liquidacion: Retencion/Ing.a cta");
            m210rreten1.setDescription("Liquidacion: Retencion/Ing.a cta 1T");
            m210rreten2.setDescription("Liquidacion: Retencion/Ing.a cta 2T");
            m210rreten3.setDescription("Liquidacion: Retencion/Ing.a cta 3T");
            m210rreten4.setDescription("Liquidacion: Retencion/Ing.a cta 4T");
            m210rresultado.setDescription("Liquidacion: Resultado");
            m210rresultado1.setDescription("Liquidacion: Resultado 1T");
            m210rresultado2.setDescription("Liquidacion: Resultado 2T");
            m210rresultado3.setDescription("Liquidacion: Resultado 3T");
            m210rresultado4.setDescription("Liquidacion: Resultado 4T");
            m210rconvenio.setDescription("Liquidacion: Red.Convenio            (SIN USO)");
            m210ranterior.setDescription("Liquidacion: Ing./devolucio anterior (SIN USO)");
            m210rnro210.setDescription("Nro justificante 210 anterior        (SIN USO)");
            m210rnifp.setDescription("Pagador/Retenedor: NIF");
            m210rfisjurp.setDescription("Pagador/Retenedor: Fisica/Juridica");
            m210rnombrep.setDescription("Pagador/Retenedor: Apellidos");
            m210ridfinca.setDescription("Id INMOBILIARIO");
            m210rcalle.setDescription("Situacion inmueble: Calle");
            m210rnumero.setDescription("Numero");
            m210rmunicipio.setDescription("Municipio");
            m210rprovincia.setDescription("Provincia");
            m210rctipovia.setDescription("Tipo de via");
            m210rctiponum.setDescription("Tipo de numeracion");
            m210rcalifnum.setDescription("Calificador de nro");
            m210rcbloque.setDescription("Bloque");
            m210rcportal.setDescription("Portal");
            m210rcescalera.setDescription("Escalera");
            m210rcplanta.setDescription("Planta");
            m210rcpuerta.setDescription("Puerta");
            m210rclavepais.setDescription("Clave pais");
            m210rcpostal.setDescription("Codigo postal");
            m210rcodigoine.setDescription("Codigo INE del municipio");
            m210rpoblacion.setDescription("Poblacion (si es difer.municipio)");
            m210rcatastral.setDescription("Referencia catastral");
            m210rfecven1.setDescription("Ganancia 1: Fecha transmision");
            m210rfecadq1.setDescription("Ganancia 1: Fecha adquisicion");
            m210rventa1.setDescription("Ganancia 1: Valor transmision");
            m210rcompra1.setDescription("Ganancia 1: Valor adquisicion");
            m210rdifer1.setDescription("Ganancia 1: Diferencia");
            m210rganan1.setDescription("Ganancia 1: Ganancia sujeta");
            m210rfecven2.setDescription("Ganancia 2 mejora: Fecha transmision");
            m210rfecadq2.setDescription("Ganancia 2 mejora: Fecha adquisicion");
            m210rventa2.setDescription("Ganancia 2 mejora: Valor transmision");
            m210rcompra2.setDescription("Ganancia 2 mejora: Valor adquisicion");
            m210rdifer2.setDescription("Ganancia 2 mejora: Diferencia");
            m210rganan2.setDescription("Ganancia 2 mejora: Ganancia sujeta");
            m210rtipgan1.setDescription("Tipo de ganancia ACB-FIM-OVM");
            m210rpat.setDescription("Patrimonio 2005");
            m210rabatim1.setDescription("Importe abatimiento");
            m210rsus1.setDescription("Susceptible reduccion DT9");
            m210rdt91.setDescription("Reduc. DT9");
            m210rreinv1.setDescription("Importe reinversion vda hab");
            m210rexvda1.setDescription("Exencion vda hab");
            m210rabatim2.setDescription("Importe abatimiento");
            m210rsus2.setDescription("Susceptible reduccion DT9");
            m210rdt92.setDescription("Reduc. DT9");
            m210rreinv2.setDescription("Importe reinversion vda hab");
            m210rexvda2.setDescription("Exencion vda hab");
            m210rganancia.setDescription("Ganancia total inmueble");
            m210rnro211.setDescription("Ganancia inmueble Nro justificante 211");
            m210rco.setDescription("Ganancia inmueble C/O C-ambos conyuges");
            m210rpordec.setDescription("Ganancia inmueble Declarante porcentaje");
            m210rporcon.setDescription("Ganancia inmueble Conyuge porcentaje");
            m210rnifconh.setDescription("Ganancia inmueble Conyuge NIF");
            m210rnomconh.setDescription("Ganancia inmueble Conyuge Nombre");
            }
        }
        
    public class TabDeflis415 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis415(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabSiiexpedidas extends TableDef
        {
        // campos
        public FieldDef sixcodi;
        public FieldDef sixorigen;
        public FieldDef sixfechacrea;
        public FieldDef sixestado;
        public FieldDef sixempresa;
        public FieldDef sixdescerror;
        public FieldDef sixcodierror;
        public FieldDef sixnif;
        public FieldDef sixejercicio;
        public FieldDef sixperiodo;
        public FieldDef sixnumserie;
        public FieldDef sixnumseriefin;
        public FieldDef sixfecha;
        public FieldDef sixtipo;
        public FieldDef sixtiporec;
        public FieldDef sixnumserieag;
        public FieldDef sixfechaag;
        public FieldDef sixnumserierec;
        public FieldDef sixfecharec;
        public FieldDef sixbaserec;
        public FieldDef sixcuotarec;
        public FieldDef sixcuotarerec;
        public FieldDef sixfechaop;
        public FieldDef sixclave;
        public FieldDef sixclave1;
        public FieldDef sixclave2;
        public FieldDef sixnumacuerdo;
        public FieldDef sixtotal;
        public FieldDef sixbasecoste;
        public FieldDef sixdescripcion;
        public FieldDef sixsitinm;
        public FieldDef sixrefcat;
        public FieldDef siximptrans;
        public FieldDef sixemiterc;
        public FieldDef sixvariosdest;
        public FieldDef sixcupon;
        public FieldDef sixconrazon;
        public FieldDef sixconnifrep;
        public FieldDef sixconnif;
        public FieldDef sixconcpais;
        public FieldDef sixcontipoid;
        public FieldDef sixconid;
        public FieldDef sixcausaex;
        public FieldDef sixtiponex;
        public FieldDef sixsfacilest;
        public FieldDef sixsfacilerr;
        public FieldDef sixrefext;
        public FieldDef sixfsim;
        public FieldDef sixesnom;
        public FieldDef sixesnif;
        public FieldDef sixrprev;
        public FieldDef sixmacro;
        public FieldDef sixfadi3;
        public FieldDef sixsinid;
        public FieldDef sixsiiigic;
        public FieldDef sixgpant;
        public FieldDef sixgtbien;
        public FieldDef sixgtdoc;
        public FieldDef sixgnprot;
        public FieldDef sixgnotar;
        public TabSiiexpedidas(String name)
            {
            super(name);
            sixcodi = new FieldDef("sixcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            sixorigen = new FieldDef("sixorigen",FieldDef.CHAR,12,FieldDef.NOTNULL);
            sixfechacrea = new FieldDef("sixfechacrea",FieldDef.DATE,FieldDef.NOTNULL);
            sixestado = new FieldDef("sixestado",FieldDef.CHAR,2);
            sixempresa = new FieldDef("sixempresa",FieldDef.INTEGER,0);
            sixdescerror = new FieldDef("sixdescerror",FieldDef.CHAR,255);
            sixcodierror = new FieldDef("sixcodierror",FieldDef.INTEGER,0);
            sixnif = new FieldDef("sixnif",FieldDef.CHAR,9);
            sixejercicio = new FieldDef("sixejercicio",FieldDef.INTEGER,0);
            sixperiodo = new FieldDef("sixperiodo",FieldDef.CHAR,2);
            sixnumserie = new FieldDef("sixnumserie",FieldDef.CHAR,60);
            sixnumseriefin = new FieldDef("sixnumseriefin",FieldDef.CHAR,60);
            sixfecha = new FieldDef("sixfecha",FieldDef.DATE);
            sixtipo = new FieldDef("sixtipo",FieldDef.CHAR,2);
            sixtiporec = new FieldDef("sixtiporec",FieldDef.CHAR,1);
            sixnumserieag = new FieldDef("sixnumserieag",FieldDef.CHAR,60);
            sixfechaag = new FieldDef("sixfechaag",FieldDef.DATE);
            sixnumserierec = new FieldDef("sixnumserierec",FieldDef.CHAR,60);
            sixfecharec = new FieldDef("sixfecharec",FieldDef.DATE);
            sixbaserec = new FieldDef("sixbaserec",FieldDef.FLOAT,6,0);
            sixcuotarec = new FieldDef("sixcuotarec",FieldDef.FLOAT,6,0);
            sixcuotarerec = new FieldDef("sixcuotarerec",FieldDef.FLOAT,6,0);
            sixfechaop = new FieldDef("sixfechaop",FieldDef.DATE);
            sixclave = new FieldDef("sixclave",FieldDef.CHAR,2);
            sixclave1 = new FieldDef("sixclave1",FieldDef.CHAR,2);
            sixclave2 = new FieldDef("sixclave2",FieldDef.CHAR,2);
            sixnumacuerdo = new FieldDef("sixnumacuerdo",FieldDef.CHAR,15);
            sixtotal = new FieldDef("sixtotal",FieldDef.FLOAT,6,0);
            sixbasecoste = new FieldDef("sixbasecoste",FieldDef.FLOAT,6,0);
            sixdescripcion = new FieldDef("sixdescripcion",FieldDef.CHAR,500);
            sixsitinm = new FieldDef("sixsitinm",FieldDef.INTEGER,0);
            sixrefcat = new FieldDef("sixrefcat",FieldDef.CHAR,25);
            siximptrans = new FieldDef("siximptrans",FieldDef.FLOAT,6,0);
            sixemiterc = new FieldDef("sixemiterc",FieldDef.CHAR,1);
            sixvariosdest = new FieldDef("sixvariosdest",FieldDef.CHAR,1);
            sixcupon = new FieldDef("sixcupon",FieldDef.CHAR,1);
            sixconrazon = new FieldDef("sixconrazon",FieldDef.CHAR,40);
            sixconnifrep = new FieldDef("sixconnifrep",FieldDef.CHAR,9);
            sixconnif = new FieldDef("sixconnif",FieldDef.CHAR,9);
            sixconcpais = new FieldDef("sixconcpais",FieldDef.CHAR,2);
            sixcontipoid = new FieldDef("sixcontipoid",FieldDef.CHAR,2);
            sixconid = new FieldDef("sixconid",FieldDef.CHAR,20);
            sixcausaex = new FieldDef("sixcausaex",FieldDef.CHAR,2);
            sixtiponex = new FieldDef("sixtiponex",FieldDef.CHAR,2);
            sixsfacilest = new FieldDef("sixsfacilest",FieldDef.CHAR,2);
            sixsfacilerr = new FieldDef("sixsfacilerr",FieldDef.CHAR,255);
            sixrefext = new FieldDef("sixrefext",FieldDef.CHAR,60);
            sixfsim = new FieldDef("sixfsim",FieldDef.CHAR,1);
            sixesnom = new FieldDef("sixesnom",FieldDef.CHAR,120);
            sixesnif = new FieldDef("sixesnif",FieldDef.CHAR,9);
            sixrprev = new FieldDef("sixrprev",FieldDef.CHAR,1);
            sixmacro = new FieldDef("sixmacro",FieldDef.CHAR,1);
            sixfadi3 = new FieldDef("sixfadi3",FieldDef.CHAR,1);
            sixsinid = new FieldDef("sixsinid",FieldDef.CHAR,1);
            sixsiiigic = new FieldDef("sixsiiigic",FieldDef.CHAR,1);
            sixgpant = new FieldDef("sixgpant",FieldDef.CHAR,1);
            sixgtbien = new FieldDef("sixgtbien",FieldDef.CHAR,2);
            sixgtdoc = new FieldDef("sixgtdoc",FieldDef.CHAR,2);
            sixgnprot = new FieldDef("sixgnprot",FieldDef.CHAR,6);
            sixgnotar = new FieldDef("sixgnotar",FieldDef.CHAR,120);
            FieldDef array[] = {
                sixcodi,
                sixorigen,
                sixfechacrea,
                sixestado,
                sixempresa,
                sixdescerror,
                sixcodierror,
                sixnif,
                sixejercicio,
                sixperiodo,
                sixnumserie,
                sixnumseriefin,
                sixfecha,
                sixtipo,
                sixtiporec,
                sixnumserieag,
                sixfechaag,
                sixnumserierec,
                sixfecharec,
                sixbaserec,
                sixcuotarec,
                sixcuotarerec,
                sixfechaop,
                sixclave,
                sixclave1,
                sixclave2,
                sixnumacuerdo,
                sixtotal,
                sixbasecoste,
                sixdescripcion,
                sixsitinm,
                sixrefcat,
                siximptrans,
                sixemiterc,
                sixvariosdest,
                sixcupon,
                sixconrazon,
                sixconnifrep,
                sixconnif,
                sixconcpais,
                sixcontipoid,
                sixconid,
                sixcausaex,
                sixtiponex,
                sixsfacilest,
                sixsfacilerr,
                sixrefext,
                sixfsim,
                sixesnom,
                sixesnif,
                sixrprev,
                sixmacro,
                sixfadi3,
                sixsinid,
                sixsiiigic,
                sixgpant,
                sixgtbien,
                sixgtdoc,
                sixgnprot,
                sixgnotar                
                };
            setColumns(array);
            FieldDef arrayf[] = {sixcodi };
            setPrimaryKeys(arrayf);
            sixcodi.setAutoIncrementable(true);
            sixejercicio.setDescription("Ejercicio impositivo de la factura");
            sixperiodo.setDescription("Periodo impositivo de la factura");
            sixnumserie.setDescription("N Serie+ N Factura que identifica a la factura");
            sixnumseriefin.setDescription("N Serie+ N Factura - última factura (si es asiento resumen)");
            sixfecha.setDescription("Fecha expedición");
            sixtipo.setDescription("Tipo factura (normal, rectificativa, tickets, emitida en sustitución de facturas)");
            sixtiporec.setDescription("Tipo de factura rectificativa / sustitución o por diferencia");
            sixnumserieag.setDescription("N Serie+ N Factura que identifica a la factura agrupada");
            sixfechaag.setDescription("Fecha de expedición factura agrupada");
            sixnumserierec.setDescription("N Serie+ N Factura que identifica a la factura rectificada");
            sixfecharec.setDescription("Fecha de expedición factura rectificada");
            sixbaserec.setDescription("Base imponible de la factura/facturas sustituidas");
            sixcuotarec.setDescription("Cuota iva de la factura/facturas sustituidas");
            sixcuotarerec.setDescription("Cuota recargo de la factura/facturas sustituidas");
            sixfechaop.setDescription("Fecha de operacion siempre que sea distinta de fecha expedicion");
            sixclave.setDescription("Clave régimen especial transcendencia tributaria");
            sixclave1.setDescription("Clave régimen especial transcendencia tributaria 1");
            sixclave2.setDescription("Clave régimen especial transcendencia tributaria 2");
            sixnumacuerdo.setDescription("Número registro obtenido al enviar la autorización en materia de facturanción o de libros");
            sixtotal.setDescription("Importe total de la factura");
            sixbasecoste.setDescription("Para grupos de IVA");
            sixdescripcion.setDescription("Descripción del objeto de la factura");
            sixsitinm.setDescription("Identificador que especifica la situación del inmueble");
            sixrefcat.setDescription("Referencia catastral del inmueble");
            siximptrans.setDescription("Importe Transmision Sujeto A IVA");
            sixemiterc.setDescription("Factura emitida por un tercero. Si no se informa toma valor “N”.");
            sixvariosdest.setDescription("Factura tiene varios destinatarios.Si no se informa toma valor “N”.");
            sixcupon.setDescription("Factura tipo R5 o F4, minoración base imponible por cupones, bonif. descuentos");
            sixconrazon.setDescription("Contraparte - Nombre-razón social (cliente)");
            sixconnifrep.setDescription("Contraparte - NIF del representante de la contraparte");
            sixconnif.setDescription("Contraparte - Identificador del NIF de la contraparte");
            sixconcpais.setDescription("Contraparte - Código del país asociado  a la contraparte");
            sixcontipoid.setDescription("Contraparte - Tipo de identificación en el pais de residencia");
            sixconid.setDescription("Contraparte - Número de identificación en el país de residencia");
            sixcausaex.setDescription("Causa de la exención en los supuestos que aplique");
            sixtiponex.setDescription("Tipo de operación sujeta y no exenta para diferenciación inversión sujeto pasivo");
            }
        }
        
    public class TabSiiexpedidasdet extends TableDef
        {
        // campos
        public FieldDef sixdcodi;
        public FieldDef sixdnumbase;
        public FieldDef sixdsujeta;
        public FieldDef sixdexenta;
        public FieldDef sixdtipointra;
        public FieldDef sixdimporte714;
        public FieldDef sixdimportetai;
        public FieldDef sixdbase;
        public FieldDef sixdporiva;
        public FieldDef sixdcuoiva;
        public FieldDef sixdporrec;
        public FieldDef sixdcuorec;
        public TabSiiexpedidasdet(String name)
            {
            super(name);
            sixdcodi = new FieldDef("sixdcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            sixdnumbase = new FieldDef("sixdnumbase",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            sixdsujeta = new FieldDef("sixdsujeta",FieldDef.CHAR,1);
            sixdexenta = new FieldDef("sixdexenta",FieldDef.CHAR,1);
            sixdtipointra = new FieldDef("sixdtipointra",FieldDef.CHAR,1);
            sixdimporte714 = new FieldDef("sixdimporte714",FieldDef.FLOAT,6,0);
            sixdimportetai = new FieldDef("sixdimportetai",FieldDef.FLOAT,6,0);
            sixdbase = new FieldDef("sixdbase",FieldDef.FLOAT,6,0);
            sixdporiva = new FieldDef("sixdporiva",FieldDef.FLOAT,6,0);
            sixdcuoiva = new FieldDef("sixdcuoiva",FieldDef.FLOAT,6,0);
            sixdporrec = new FieldDef("sixdporrec",FieldDef.FLOAT,6,0);
            sixdcuorec = new FieldDef("sixdcuorec",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                sixdcodi,
                sixdnumbase,
                sixdsujeta,
                sixdexenta,
                sixdtipointra,
                sixdimporte714,
                sixdimportetai,
                sixdbase,
                sixdporiva,
                sixdcuoiva,
                sixdporrec,
                sixdcuorec                
                };
            setColumns(array);
            FieldDef arrayf[] = {sixdcodi,sixdnumbase };
            setPrimaryKeys(arrayf);
            sixdsujeta.setDescription("S/N Sujeta - No sujeta");
            sixdexenta.setDescription("S/N Exenta - No exenta");
            sixdtipointra.setDescription("P/E Presentacion servicios - Entrega");
            sixdimporte714.setDescription("Importe en euros si la sujeción es por el art. 7,14, otros");
            sixdimportetai.setDescription("Importe en euros si la sujeción es por operaciones no sujetas en el TAI por reglas de localización");
            sixdbase.setDescription("Base imponible");
            sixdporiva.setDescription("% IVA");
            sixdcuoiva.setDescription("Cuota IVA");
            sixdporrec.setDescription("% Recargo");
            sixdcuorec.setDescription("Cuota recargo");
            }
        }
        
    public class TabSiirecibidas extends TableDef
        {
        // campos
        public FieldDef sircodi;
        public FieldDef sirorigen;
        public FieldDef sirfechacrea;
        public FieldDef sirestado;
        public FieldDef sirempresa;
        public FieldDef sirdescerror;
        public FieldDef sircodierror;
        public FieldDef sirnif;
        public FieldDef sirejercicio;
        public FieldDef sirperiodo;
        public FieldDef sirnumserie;
        public FieldDef sirnumseriefin;
        public FieldDef sirfecha;
        public FieldDef sirtipo;
        public FieldDef sirtiporec;
        public FieldDef sirnumserieag;
        public FieldDef sirfechaag;
        public FieldDef sirnumserierec;
        public FieldDef sirfecharec;
        public FieldDef sirbaserec;
        public FieldDef sircuotarec;
        public FieldDef sircuotarerec;
        public FieldDef sirfechaop;
        public FieldDef sirclave;
        public FieldDef sirclave1;
        public FieldDef sirclave2;
        public FieldDef sirtotal;
        public FieldDef sirnumacuerdo;
        public FieldDef sirbasecoste;
        public FieldDef sirdescripcion;
        public FieldDef sirconrazon;
        public FieldDef sirconnifrep;
        public FieldDef sirconnif;
        public FieldDef sirconcpais;
        public FieldDef sircontipoid;
        public FieldDef sirconid;
        public FieldDef sirfecregcon;
        public FieldDef sircuoded;
        public FieldDef sirsfacilest;
        public FieldDef sirsfacilerr;
        public FieldDef sirrefext;
        public FieldDef sirfsim;
        public FieldDef siresnom;
        public FieldDef siresnif;
        public FieldDef sirrprev;
        public FieldDef sirmacro;
        public FieldDef sirsiiigic;
        public FieldDef sirgpant;
        public FieldDef sirgtbien;
        public FieldDef sirgtdoc;
        public FieldDef sirgnprot;
        public FieldDef sirgnotar;
        public TabSiirecibidas(String name)
            {
            super(name);
            sircodi = new FieldDef("sircodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            sirorigen = new FieldDef("sirorigen",FieldDef.CHAR,12,FieldDef.NOTNULL);
            sirfechacrea = new FieldDef("sirfechacrea",FieldDef.DATE,FieldDef.NOTNULL);
            sirestado = new FieldDef("sirestado",FieldDef.CHAR,2);
            sirempresa = new FieldDef("sirempresa",FieldDef.INTEGER,0);
            sirdescerror = new FieldDef("sirdescerror",FieldDef.CHAR,255);
            sircodierror = new FieldDef("sircodierror",FieldDef.INTEGER,0);
            sirnif = new FieldDef("sirnif",FieldDef.CHAR,9);
            sirejercicio = new FieldDef("sirejercicio",FieldDef.INTEGER,0);
            sirperiodo = new FieldDef("sirperiodo",FieldDef.CHAR,4);
            sirnumserie = new FieldDef("sirnumserie",FieldDef.CHAR,60);
            sirnumseriefin = new FieldDef("sirnumseriefin",FieldDef.CHAR,60);
            sirfecha = new FieldDef("sirfecha",FieldDef.DATE);
            sirtipo = new FieldDef("sirtipo",FieldDef.CHAR,2);
            sirtiporec = new FieldDef("sirtiporec",FieldDef.CHAR,1);
            sirnumserieag = new FieldDef("sirnumserieag",FieldDef.CHAR,60);
            sirfechaag = new FieldDef("sirfechaag",FieldDef.DATE);
            sirnumserierec = new FieldDef("sirnumserierec",FieldDef.CHAR,60);
            sirfecharec = new FieldDef("sirfecharec",FieldDef.DATE);
            sirbaserec = new FieldDef("sirbaserec",FieldDef.FLOAT,6,0);
            sircuotarec = new FieldDef("sircuotarec",FieldDef.FLOAT,6,0);
            sircuotarerec = new FieldDef("sircuotarerec",FieldDef.FLOAT,6,0);
            sirfechaop = new FieldDef("sirfechaop",FieldDef.DATE);
            sirclave = new FieldDef("sirclave",FieldDef.CHAR,2);
            sirclave1 = new FieldDef("sirclave1",FieldDef.CHAR,2);
            sirclave2 = new FieldDef("sirclave2",FieldDef.CHAR,2);
            sirtotal = new FieldDef("sirtotal",FieldDef.FLOAT,6,0);
            sirnumacuerdo = new FieldDef("sirnumacuerdo",FieldDef.CHAR,15);
            sirbasecoste = new FieldDef("sirbasecoste",FieldDef.FLOAT,6,0);
            sirdescripcion = new FieldDef("sirdescripcion",FieldDef.CHAR,500);
            sirconrazon = new FieldDef("sirconrazon",FieldDef.CHAR,40);
            sirconnifrep = new FieldDef("sirconnifrep",FieldDef.CHAR,9);
            sirconnif = new FieldDef("sirconnif",FieldDef.CHAR,9);
            sirconcpais = new FieldDef("sirconcpais",FieldDef.CHAR,2);
            sircontipoid = new FieldDef("sircontipoid",FieldDef.CHAR,2);
            sirconid = new FieldDef("sirconid",FieldDef.CHAR,20);
            sirfecregcon = new FieldDef("sirfecregcon",FieldDef.DATE);
            sircuoded = new FieldDef("sircuoded",FieldDef.FLOAT,6,0);
            sirsfacilest = new FieldDef("sirsfacilest",FieldDef.CHAR,2);
            sirsfacilerr = new FieldDef("sirsfacilerr",FieldDef.CHAR,255);
            sirrefext = new FieldDef("sirrefext",FieldDef.CHAR,60);
            sirfsim = new FieldDef("sirfsim",FieldDef.CHAR,1);
            siresnom = new FieldDef("siresnom",FieldDef.CHAR,120);
            siresnif = new FieldDef("siresnif",FieldDef.CHAR,9);
            sirrprev = new FieldDef("sirrprev",FieldDef.CHAR,1);
            sirmacro = new FieldDef("sirmacro",FieldDef.CHAR,1);
            sirsiiigic = new FieldDef("sirsiiigic",FieldDef.CHAR,1);
            sirgpant = new FieldDef("sirgpant",FieldDef.CHAR,1);
            sirgtbien = new FieldDef("sirgtbien",FieldDef.CHAR,2);
            sirgtdoc = new FieldDef("sirgtdoc",FieldDef.CHAR,2);
            sirgnprot = new FieldDef("sirgnprot",FieldDef.CHAR,6);
            sirgnotar = new FieldDef("sirgnotar",FieldDef.CHAR,120);
            FieldDef array[] = {
                sircodi,
                sirorigen,
                sirfechacrea,
                sirestado,
                sirempresa,
                sirdescerror,
                sircodierror,
                sirnif,
                sirejercicio,
                sirperiodo,
                sirnumserie,
                sirnumseriefin,
                sirfecha,
                sirtipo,
                sirtiporec,
                sirnumserieag,
                sirfechaag,
                sirnumserierec,
                sirfecharec,
                sirbaserec,
                sircuotarec,
                sircuotarerec,
                sirfechaop,
                sirclave,
                sirclave1,
                sirclave2,
                sirtotal,
                sirnumacuerdo,
                sirbasecoste,
                sirdescripcion,
                sirconrazon,
                sirconnifrep,
                sirconnif,
                sirconcpais,
                sircontipoid,
                sirconid,
                sirfecregcon,
                sircuoded,
                sirsfacilest,
                sirsfacilerr,
                sirrefext,
                sirfsim,
                siresnom,
                siresnif,
                sirrprev,
                sirmacro,
                sirsiiigic,
                sirgpant,
                sirgtbien,
                sirgtdoc,
                sirgnprot,
                sirgnotar                
                };
            setColumns(array);
            FieldDef arrayf[] = {sircodi };
            setPrimaryKeys(arrayf);
            sircodi.setAutoIncrementable(true);
            sirejercicio.setDescription("Ejercicio impositivo de la factura");
            sirperiodo.setDescription("Periodo impositivo de la factura");
            sirnumserie.setDescription("N Serie+ N Factura que identifica a la factura");
            sirnumseriefin.setDescription("N Serie+ N Factura - última factura (si es asiento resumen)");
            sirfecha.setDescription("Fecha de expedición");
            sirtipo.setDescription("Tipo factura (normal, rectificativa, tickets, emitida en sustitución de facturas)");
            sirtiporec.setDescription("Factura rectificativa por Sustitución o por dIferencia (valores S, I)");
            sirnumserieag.setDescription("N Serie+ N Factura factura agrupada");
            sirfechaag.setDescription("Fecha de expedición agrupada");
            sirnumserierec.setDescription("N Serie+ N Factura que identifica a la factura rectificada");
            sirfecharec.setDescription("Fecha de expedición factura rectificada");
            sirbaserec.setDescription("Base imponible de la factura/facturas sustituidas");
            sircuotarec.setDescription("Cuota iva de la factura/facturas sustituidas");
            sircuotarerec.setDescription("Cuota recargo de la factura/facturas sustituidas");
            sirfechaop.setDescription("Fecha de operacion siempre que sea distinta de fecha expedicion");
            sirclave.setDescription("Clave régimen especial transcendencia tributaria");
            sirclave1.setDescription("Clave régimen especial transcendencia tributaria 1");
            sirclave2.setDescription("Clave régimen especial transcendencia tributaria 2");
            sirtotal.setDescription("Importe total de la factura");
            sirnumacuerdo.setDescription("Número registro obtenido al enviar la autorización en materia de facturanción o de libros");
            sirbasecoste.setDescription("Base de coste (Para grupos de IVA)");
            sirdescripcion.setDescription("Descripción del objeto de la factura");
            sirconrazon.setDescription("Contraparte - Nombre-razón social (proveedor)");
            sirconnifrep.setDescription("Contraparte - NIF del representante de la contraparte");
            sirconnif.setDescription("Contraparte - Identificador del NIF de la contraparte");
            sirconcpais.setDescription("Contraparte - Código del país asociado  a la contraparte");
            sircontipoid.setDescription("Contraparte - Tipo de identificación en el pais de residencia");
            sirconid.setDescription("Contraparte - Número de identificación en el país de residencia");
            sirfecregcon.setDescription("Fecha registro contable de la operación. Para el plazo de remisión de las facturas recibidas");
            sircuoded.setDescription("Cuota deducible");
            }
        }
        
    public class TabSiirecibidasdet extends TableDef
        {
        // campos
        public FieldDef sirdcodi;
        public FieldDef sirdnumbase;
        public FieldDef sirdtipo;
        public FieldDef sirdbase;
        public FieldDef sirdporiva;
        public FieldDef sirdcuoiva;
        public FieldDef sirdporrec;
        public FieldDef sirdcuorec;
        public FieldDef sirdporrag;
        public FieldDef sirdimprag;
        public TabSiirecibidasdet(String name)
            {
            super(name);
            sirdcodi = new FieldDef("sirdcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            sirdnumbase = new FieldDef("sirdnumbase",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            sirdtipo = new FieldDef("sirdtipo",FieldDef.CHAR,1);
            sirdbase = new FieldDef("sirdbase",FieldDef.FLOAT,6,0);
            sirdporiva = new FieldDef("sirdporiva",FieldDef.FLOAT,6,0);
            sirdcuoiva = new FieldDef("sirdcuoiva",FieldDef.FLOAT,6,0);
            sirdporrec = new FieldDef("sirdporrec",FieldDef.FLOAT,6,0);
            sirdcuorec = new FieldDef("sirdcuorec",FieldDef.FLOAT,6,0);
            sirdporrag = new FieldDef("sirdporrag",FieldDef.FLOAT,6,0);
            sirdimprag = new FieldDef("sirdimprag",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                sirdcodi,
                sirdnumbase,
                sirdtipo,
                sirdbase,
                sirdporiva,
                sirdcuoiva,
                sirdporrec,
                sirdcuorec,
                sirdporrag,
                sirdimprag                
                };
            setColumns(array);
            FieldDef arrayf[] = {sirdcodi,sirdnumbase };
            setPrimaryKeys(arrayf);
            sirdtipo.setDescription("P/I inversion sujeto Pasivo - desglose Iva");
            sirdbase.setDescription("Base imponible");
            sirdporiva.setDescription("% IVA");
            sirdcuoiva.setDescription("Cuota IVA");
            sirdporrec.setDescription("% Recargo");
            sirdcuorec.setDescription("Cuota recargo");
            sirdporrag.setDescription("% REAGYP");
            sirdimprag.setDescription("Compensacion REAGYP");
            }
        }
        
    public class TabSiibienesinv extends TableDef
        {
        // campos
        public FieldDef sibcodi;
        public FieldDef siborigen;
        public FieldDef sibfechacrea;
        public FieldDef sibestado;
        public FieldDef sibempresa;
        public FieldDef sibdescerror;
        public FieldDef sibcodierror;
        public FieldDef sibnif;
        public FieldDef sibejercicio;
        public FieldDef sibperiodo;
        public FieldDef sibeminif;
        public FieldDef sibemirazon;
        public FieldDef sibemicpais;
        public FieldDef sibemitipoid;
        public FieldDef sibemiid;
        public FieldDef sibnumserie;
        public FieldDef sibfecha;
        public FieldDef sibdesc;
        public FieldDef sibfecini;
        public FieldDef sibprorrata;
        public FieldDef sibregul;
        public FieldDef sibidentrega;
        public FieldDef sibregulded;
        public FieldDef sibrefex;
        public FieldDef sibnumacuerdo;
        public FieldDef sibesnom;
        public FieldDef sibesnif;
        public FieldDef sibsiiigic;
        public TabSiibienesinv(String name)
            {
            super(name);
            sibcodi = new FieldDef("sibcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            siborigen = new FieldDef("siborigen",FieldDef.CHAR,12,FieldDef.NOTNULL);
            sibfechacrea = new FieldDef("sibfechacrea",FieldDef.DATE,FieldDef.NOTNULL);
            sibestado = new FieldDef("sibestado",FieldDef.CHAR,2);
            sibempresa = new FieldDef("sibempresa",FieldDef.INTEGER,0);
            sibdescerror = new FieldDef("sibdescerror",FieldDef.CHAR,255);
            sibcodierror = new FieldDef("sibcodierror",FieldDef.INTEGER,0);
            sibnif = new FieldDef("sibnif",FieldDef.CHAR,9);
            sibejercicio = new FieldDef("sibejercicio",FieldDef.INTEGER,0);
            sibperiodo = new FieldDef("sibperiodo",FieldDef.CHAR,4);
            sibeminif = new FieldDef("sibeminif",FieldDef.CHAR,9);
            sibemirazon = new FieldDef("sibemirazon",FieldDef.CHAR,40);
            sibemicpais = new FieldDef("sibemicpais",FieldDef.CHAR,2);
            sibemitipoid = new FieldDef("sibemitipoid",FieldDef.CHAR,2);
            sibemiid = new FieldDef("sibemiid",FieldDef.CHAR,20);
            sibnumserie = new FieldDef("sibnumserie",FieldDef.CHAR,60);
            sibfecha = new FieldDef("sibfecha",FieldDef.DATE);
            sibdesc = new FieldDef("sibdesc",FieldDef.CHAR,40);
            sibfecini = new FieldDef("sibfecini",FieldDef.DATE);
            sibprorrata = new FieldDef("sibprorrata",FieldDef.FLOAT,6,0);
            sibregul = new FieldDef("sibregul",FieldDef.FLOAT,6,0);
            sibidentrega = new FieldDef("sibidentrega",FieldDef.CHAR,40);
            sibregulded = new FieldDef("sibregulded",FieldDef.FLOAT,6,0);
            sibrefex = new FieldDef("sibrefex",FieldDef.CHAR,60);
            sibnumacuerdo = new FieldDef("sibnumacuerdo",FieldDef.CHAR,15);
            sibesnom = new FieldDef("sibesnom",FieldDef.CHAR,120);
            sibesnif = new FieldDef("sibesnif",FieldDef.CHAR,9);
            sibsiiigic = new FieldDef("sibsiiigic",FieldDef.CHAR,1);
            FieldDef array[] = {
                sibcodi,
                siborigen,
                sibfechacrea,
                sibestado,
                sibempresa,
                sibdescerror,
                sibcodierror,
                sibnif,
                sibejercicio,
                sibperiodo,
                sibeminif,
                sibemirazon,
                sibemicpais,
                sibemitipoid,
                sibemiid,
                sibnumserie,
                sibfecha,
                sibdesc,
                sibfecini,
                sibprorrata,
                sibregul,
                sibidentrega,
                sibregulded,
                sibrefex,
                sibnumacuerdo,
                sibesnom,
                sibesnif,
                sibsiiigic                
                };
            setColumns(array);
            FieldDef arrayf[] = {sibcodi };
            setPrimaryKeys(arrayf);
            sibcodi.setAutoIncrementable(true);
            sibejercicio.setDescription("Ejercicio del Libro registro de los bienes de inversión");
            sibperiodo.setDescription("Periodo (0A)");
            sibeminif.setDescription("Emisor - NIF del emisor de la factura");
            sibemirazon.setDescription("Emisor - Nombre-razón social");
            sibemicpais.setDescription("Emisor - Código del país asociado  al emisor");
            sibemitipoid.setDescription("Emisor - Tipo de identificación en el país de residencia");
            sibemiid.setDescription("Emisor - Número de identificación en el país de residencia");
            sibnumserie.setDescription("N Serie+ N Factura que identifica a la factura emitida (en su caso primera factura del asiento resumen)");
            sibfecha.setDescription("Fecha de expedición");
            sibdesc.setDescription("Descripción de los bienes objeto de la operación");
            sibfecini.setDescription("Fecha de inicio de utilización del mismo");
            sibprorrata.setDescription("Prorrata anual definitiva");
            sibregul.setDescription("Regularización anual deducción");
            sibidentrega.setDescription("Identificación entrega");
            sibregulded.setDescription("Regularización deducción efectuada");
            }
        }
        
    public class TabSiiintracom extends TableDef
        {
        // campos
        public FieldDef siicodi;
        public FieldDef siiorigen;
        public FieldDef siifechacrea;
        public FieldDef siiestado;
        public FieldDef siiempresa;
        public FieldDef siidescerror;
        public FieldDef siicodierror;
        public FieldDef siinif;
        public FieldDef siiejercicio;
        public FieldDef siiperiodo;
        public FieldDef siiemicpais;
        public FieldDef siiemitipoid;
        public FieldDef siiemiid;
        public FieldDef siinumserie;
        public FieldDef siifecha;
        public FieldDef siiconrazon;
        public FieldDef siiconnifrep;
        public FieldDef siiconnif;
        public FieldDef siiconcpais;
        public FieldDef siicontipoid;
        public FieldDef siiconid;
        public FieldDef siitipoope;
        public FieldDef siiclave;
        public FieldDef siiestadomie;
        public FieldDef siiplazo;
        public FieldDef siidescbie;
        public FieldDef siidomi;
        public FieldDef siiotra;
        public FieldDef siirefex;
        public FieldDef siinumacuerdo;
        public FieldDef siiesnom;
        public FieldDef siiesnif;
        public FieldDef siirprev;
        public TabSiiintracom(String name)
            {
            super(name);
            siicodi = new FieldDef("siicodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            siiorigen = new FieldDef("siiorigen",FieldDef.CHAR,12,FieldDef.NOTNULL);
            siifechacrea = new FieldDef("siifechacrea",FieldDef.DATE,FieldDef.NOTNULL);
            siiestado = new FieldDef("siiestado",FieldDef.CHAR,2);
            siiempresa = new FieldDef("siiempresa",FieldDef.INTEGER,0);
            siidescerror = new FieldDef("siidescerror",FieldDef.CHAR,255);
            siicodierror = new FieldDef("siicodierror",FieldDef.INTEGER,0);
            siinif = new FieldDef("siinif",FieldDef.CHAR,9);
            siiejercicio = new FieldDef("siiejercicio",FieldDef.INTEGER,0);
            siiperiodo = new FieldDef("siiperiodo",FieldDef.CHAR,4);
            siiemicpais = new FieldDef("siiemicpais",FieldDef.CHAR,2);
            siiemitipoid = new FieldDef("siiemitipoid",FieldDef.CHAR,2);
            siiemiid = new FieldDef("siiemiid",FieldDef.CHAR,20);
            siinumserie = new FieldDef("siinumserie",FieldDef.CHAR,60);
            siifecha = new FieldDef("siifecha",FieldDef.DATE);
            siiconrazon = new FieldDef("siiconrazon",FieldDef.CHAR,40);
            siiconnifrep = new FieldDef("siiconnifrep",FieldDef.CHAR,9);
            siiconnif = new FieldDef("siiconnif",FieldDef.CHAR,9);
            siiconcpais = new FieldDef("siiconcpais",FieldDef.CHAR,2);
            siicontipoid = new FieldDef("siicontipoid",FieldDef.CHAR,2);
            siiconid = new FieldDef("siiconid",FieldDef.CHAR,20);
            siitipoope = new FieldDef("siitipoope",FieldDef.CHAR,1);
            siiclave = new FieldDef("siiclave",FieldDef.CHAR,1);
            siiestadomie = new FieldDef("siiestadomie",FieldDef.CHAR,2);
            siiplazo = new FieldDef("siiplazo",FieldDef.INTEGER,0);
            siidescbie = new FieldDef("siidescbie",FieldDef.CHAR,40);
            siidomi = new FieldDef("siidomi",FieldDef.CHAR,120);
            siiotra = new FieldDef("siiotra",FieldDef.CHAR,150);
            siirefex = new FieldDef("siirefex",FieldDef.CHAR,60);
            siinumacuerdo = new FieldDef("siinumacuerdo",FieldDef.CHAR,15);
            siiesnom = new FieldDef("siiesnom",FieldDef.CHAR,120);
            siiesnif = new FieldDef("siiesnif",FieldDef.CHAR,9);
            siirprev = new FieldDef("siirprev",FieldDef.CHAR,1);
            FieldDef array[] = {
                siicodi,
                siiorigen,
                siifechacrea,
                siiestado,
                siiempresa,
                siidescerror,
                siicodierror,
                siinif,
                siiejercicio,
                siiperiodo,
                siiemicpais,
                siiemitipoid,
                siiemiid,
                siinumserie,
                siifecha,
                siiconrazon,
                siiconnifrep,
                siiconnif,
                siiconcpais,
                siicontipoid,
                siiconid,
                siitipoope,
                siiclave,
                siiestadomie,
                siiplazo,
                siidescbie,
                siidomi,
                siiotra,
                siirefex,
                siinumacuerdo,
                siiesnom,
                siiesnif,
                siirprev                
                };
            setColumns(array);
            FieldDef arrayf[] = {siicodi };
            setPrimaryKeys(arrayf);
            siicodi.setAutoIncrementable(true);
            siiejercicio.setDescription("Ejercicio impositivo de la factura");
            siiperiodo.setDescription("Periodo impositivo de la factura");
            siiemicpais.setDescription("Código del país asociado al emisor de la factura (ISO 3166-1 alpha-2 codes)");
            siiemitipoid.setDescription("Clave para establecer el tipo de identificación en el país de residencia");
            siiemiid.setDescription("Número de identificación en el país de residencia");
            siinumserie.setDescription("N Serie+ N Factura que identifica a la factura emitida");
            siifecha.setDescription("Fecha de expedicion");
            siiconrazon.setDescription("Contraparte - Nombre-razón social");
            siiconnifrep.setDescription("Contraparte - NIF del representante de la contraparte");
            siiconnif.setDescription("Contraparte - Identificador del NIF de la contraparte");
            siiconcpais.setDescription("Contraparte - Código del país asociado  a la contraparte");
            siicontipoid.setDescription("Contraparte - Tipo de identificación en el pais de residencia");
            siiconid.setDescription("Contraparte - Número de identificación en el país de residencia");
            siitipoope.setDescription("Identificador del tipo de operación intracomunitaria");
            siiclave.setDescription("Identificación de declarante o declarado");
            siiestadomie.setDescription("Código del Estado miembro de origen o de envío");
            siiplazo.setDescription("Plazo de operación (numérico de 3)");
            siidescbie.setDescription("Descripción de los bienes adquiridos");
            siidomi.setDescription("Dirección del operador intracomunitario");
            siiotra.setDescription("Otras facturas o documentación relativas a las operaciones de que se trate");
            }
        }
        
    public class TabSiitrascenden extends TableDef
        {
        // campos
        public FieldDef sitcodi;
        public FieldDef sitorigen;
        public FieldDef sitfechacrea;
        public FieldDef sittipoot;
        public FieldDef sitestado;
        public FieldDef sitempresa;
        public FieldDef sitdescerror;
        public FieldDef sitcodierror;
        public FieldDef sitnif;
        public FieldDef sitejercicio;
        public FieldDef sitperiodo;
        public FieldDef sitconrazon;
        public FieldDef sitconnifrep;
        public FieldDef sitconnif;
        public FieldDef sitconcpais;
        public FieldDef sitcontipoid;
        public FieldDef sitconid;
        public FieldDef sitclaveop;
        public FieldDef sittotal;
        public FieldDef sitesnom;
        public FieldDef sitesnif;
        public TabSiitrascenden(String name)
            {
            super(name);
            sitcodi = new FieldDef("sitcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            sitorigen = new FieldDef("sitorigen",FieldDef.CHAR,12,FieldDef.NOTNULL);
            sitfechacrea = new FieldDef("sitfechacrea",FieldDef.DATE,FieldDef.NOTNULL);
            sittipoot = new FieldDef("sittipoot",FieldDef.CHAR,1,FieldDef.NOTNULL);
            sitestado = new FieldDef("sitestado",FieldDef.CHAR,2);
            sitempresa = new FieldDef("sitempresa",FieldDef.INTEGER,0);
            sitdescerror = new FieldDef("sitdescerror",FieldDef.CHAR,255);
            sitcodierror = new FieldDef("sitcodierror",FieldDef.INTEGER,0);
            sitnif = new FieldDef("sitnif",FieldDef.CHAR,9);
            sitejercicio = new FieldDef("sitejercicio",FieldDef.INTEGER,0);
            sitperiodo = new FieldDef("sitperiodo",FieldDef.CHAR,4);
            sitconrazon = new FieldDef("sitconrazon",FieldDef.CHAR,40);
            sitconnifrep = new FieldDef("sitconnifrep",FieldDef.CHAR,9);
            sitconnif = new FieldDef("sitconnif",FieldDef.CHAR,9);
            sitconcpais = new FieldDef("sitconcpais",FieldDef.CHAR,2);
            sitcontipoid = new FieldDef("sitcontipoid",FieldDef.CHAR,2);
            sitconid = new FieldDef("sitconid",FieldDef.CHAR,20);
            sitclaveop = new FieldDef("sitclaveop",FieldDef.CHAR,1);
            sittotal = new FieldDef("sittotal",FieldDef.FLOAT,6,0);
            sitesnom = new FieldDef("sitesnom",FieldDef.CHAR,120);
            sitesnif = new FieldDef("sitesnif",FieldDef.CHAR,9);
            FieldDef array[] = {
                sitcodi,
                sitorigen,
                sitfechacrea,
                sittipoot,
                sitestado,
                sitempresa,
                sitdescerror,
                sitcodierror,
                sitnif,
                sitejercicio,
                sitperiodo,
                sitconrazon,
                sitconnifrep,
                sitconnif,
                sitconcpais,
                sitcontipoid,
                sitconid,
                sitclaveop,
                sittotal,
                sitesnom,
                sitesnif                
                };
            setColumns(array);
            FieldDef arrayf[] = {sitcodi };
            setPrimaryKeys(arrayf);
            sitcodi.setAutoIncrementable(true);
            sittipoot.setDescription("M/S cobros en Metálico/operaciones de Seguros");
            sitejercicio.setDescription("Ejercicio impositivo");
            sitperiodo.setDescription("Periodo impositivo (0A)");
            sitconrazon.setDescription("Contraparte - Nombre-razón social");
            sitconnifrep.setDescription("Contraparte - NIF del representante de la contraparte");
            sitconnif.setDescription("Contraparte - Identificador del NIF de la contraparte");
            sitconcpais.setDescription("Contraparte - Código del país asociado  a la contraparte");
            sitcontipoid.setDescription("Contraparte - Tipo de identificación en el pais de residencia");
            sitconid.setDescription("Contraparte - Número de identificación en el país de residencia");
            sitclaveop.setDescription("Clave de operación (para operaciones de seguros)");
            sittotal.setDescription("Importe anual de las operaciones de seguros");
            }
        }
        
    public class TabSiicobros extends TableDef
        {
        // campos
        public FieldDef siccodi;
        public FieldDef sicorigen;
        public FieldDef sicfechacrea;
        public FieldDef sicestado;
        public FieldDef sicempresa;
        public FieldDef sicdescerror;
        public FieldDef siccodierror;
        public FieldDef sicnif;
        public FieldDef sicnumserie;
        public FieldDef sicnumseriefin;
        public FieldDef sicfecha;
        public FieldDef sicfechacob;
        public FieldDef sicimporte;
        public FieldDef sicmedio;
        public FieldDef sicctaomedio;
        public TabSiicobros(String name)
            {
            super(name);
            siccodi = new FieldDef("siccodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            sicorigen = new FieldDef("sicorigen",FieldDef.CHAR,12,FieldDef.NOTNULL);
            sicfechacrea = new FieldDef("sicfechacrea",FieldDef.DATE,FieldDef.NOTNULL);
            sicestado = new FieldDef("sicestado",FieldDef.CHAR,2);
            sicempresa = new FieldDef("sicempresa",FieldDef.INTEGER,0);
            sicdescerror = new FieldDef("sicdescerror",FieldDef.CHAR,255);
            siccodierror = new FieldDef("siccodierror",FieldDef.INTEGER,0);
            sicnif = new FieldDef("sicnif",FieldDef.CHAR,9);
            sicnumserie = new FieldDef("sicnumserie",FieldDef.CHAR,60);
            sicnumseriefin = new FieldDef("sicnumseriefin",FieldDef.CHAR,60);
            sicfecha = new FieldDef("sicfecha",FieldDef.DATE);
            sicfechacob = new FieldDef("sicfechacob",FieldDef.DATE);
            sicimporte = new FieldDef("sicimporte",FieldDef.FLOAT,6,0);
            sicmedio = new FieldDef("sicmedio",FieldDef.CHAR,2);
            sicctaomedio = new FieldDef("sicctaomedio",FieldDef.CHAR,34);
            FieldDef array[] = {
                siccodi,
                sicorigen,
                sicfechacrea,
                sicestado,
                sicempresa,
                sicdescerror,
                siccodierror,
                sicnif,
                sicnumserie,
                sicnumseriefin,
                sicfecha,
                sicfechacob,
                sicimporte,
                sicmedio,
                sicctaomedio                
                };
            setColumns(array);
            FieldDef arrayf[] = {siccodi };
            setPrimaryKeys(arrayf);
            siccodi.setAutoIncrementable(true);
            sicnumserie.setDescription("N Serie+ N Factura que identifica a la factura emitida");
            sicnumseriefin.setDescription("N Serie+ N Factura - última factura (si es asiento resumen)");
            sicfecha.setDescription("Fecha de expedición de la factura");
            sicfechacob.setDescription("Fecha de realización del cobro");
            sicimporte.setDescription("Importe cobrado");
            sicmedio.setDescription("Medio de cobro utilizado");
            sicctaomedio.setDescription("Cuenta bancaria o medio de cobro utilizado");
            }
        }
        
    public class TabSiipagos extends TableDef
        {
        // campos
        public FieldDef sipcodi;
        public FieldDef siporigen;
        public FieldDef sipfechacrea;
        public FieldDef sipestado;
        public FieldDef sipempresa;
        public FieldDef sipdescerror;
        public FieldDef sipcodierror;
        public FieldDef sipnif;
        public FieldDef sipemirazon;
        public FieldDef sipeminif;
        public FieldDef sipemicpais;
        public FieldDef sipemitipoid;
        public FieldDef sipemiid;
        public FieldDef sipnumserie;
        public FieldDef sipnumseriefin;
        public FieldDef sipfecha;
        public FieldDef sipfechapago;
        public FieldDef sipimporte;
        public FieldDef sipmedio;
        public FieldDef sipctaomedio;
        public TabSiipagos(String name)
            {
            super(name);
            sipcodi = new FieldDef("sipcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            siporigen = new FieldDef("siporigen",FieldDef.CHAR,12,FieldDef.NOTNULL);
            sipfechacrea = new FieldDef("sipfechacrea",FieldDef.DATE,FieldDef.NOTNULL);
            sipestado = new FieldDef("sipestado",FieldDef.CHAR,2);
            sipempresa = new FieldDef("sipempresa",FieldDef.INTEGER,0);
            sipdescerror = new FieldDef("sipdescerror",FieldDef.CHAR,255);
            sipcodierror = new FieldDef("sipcodierror",FieldDef.INTEGER,0);
            sipnif = new FieldDef("sipnif",FieldDef.CHAR,9);
            sipemirazon = new FieldDef("sipemirazon",FieldDef.CHAR,40);
            sipeminif = new FieldDef("sipeminif",FieldDef.CHAR,9);
            sipemicpais = new FieldDef("sipemicpais",FieldDef.CHAR,2);
            sipemitipoid = new FieldDef("sipemitipoid",FieldDef.CHAR,2);
            sipemiid = new FieldDef("sipemiid",FieldDef.CHAR,20);
            sipnumserie = new FieldDef("sipnumserie",FieldDef.CHAR,60);
            sipnumseriefin = new FieldDef("sipnumseriefin",FieldDef.CHAR,60);
            sipfecha = new FieldDef("sipfecha",FieldDef.DATE);
            sipfechapago = new FieldDef("sipfechapago",FieldDef.DATE);
            sipimporte = new FieldDef("sipimporte",FieldDef.FLOAT,6,0);
            sipmedio = new FieldDef("sipmedio",FieldDef.CHAR,2);
            sipctaomedio = new FieldDef("sipctaomedio",FieldDef.CHAR,34);
            FieldDef array[] = {
                sipcodi,
                siporigen,
                sipfechacrea,
                sipestado,
                sipempresa,
                sipdescerror,
                sipcodierror,
                sipnif,
                sipemirazon,
                sipeminif,
                sipemicpais,
                sipemitipoid,
                sipemiid,
                sipnumserie,
                sipnumseriefin,
                sipfecha,
                sipfechapago,
                sipimporte,
                sipmedio,
                sipctaomedio                
                };
            setColumns(array);
            FieldDef arrayf[] = {sipcodi };
            setPrimaryKeys(arrayf);
            sipcodi.setAutoIncrementable(true);
            sipemirazon.setDescription("Emisor - Nombre-razón social");
            sipeminif.setDescription("Emisor - NIF del emisor de la factura");
            sipemicpais.setDescription("Emisor - Código del país asociado  al emisor");
            sipemitipoid.setDescription("Emisor - Tipo de identificación en el país de residencia");
            sipemiid.setDescription("Emisor - Número de identificación en el país de residencia");
            sipnumserie.setDescription("N Serie+ N Factura que identifica a la factura");
            sipnumseriefin.setDescription("N Serie+ N Factura - última factura (si es asiento resumen)");
            sipfecha.setDescription("Fecha de expedición factura");
            sipfechapago.setDescription("Fecha de realización del pago");
            sipimporte.setDescription("Importe pagado");
            sipmedio.setDescription("Medio de pago utilizado");
            sipctaomedio.setDescription("Cuenta bancaria o medio de pago utilizado");
            }
        }
        
    public class TabSiilog extends TableDef
        {
        // campos
        public FieldDef silcodi;
        public FieldDef silnif;
        public FieldDef silestado;
        public FieldDef sildescerror;
        public FieldDef silcsv;
        public FieldDef silenviadas;
        public FieldDef silnocambia;
        public FieldDef silacperr;
        public FieldDef silcorrectas;
        public FieldDef silincorrectas;
        public FieldDef silfechaenvio;
        public FieldDef silhoraenvio;
        public FieldDef silusuario;
        public FieldDef silidpc;
        public FieldDef siltabla;
        public FieldDef siltipocom;
        public FieldDef silsiiigic;
        public TabSiilog(String name)
            {
            super(name);
            silcodi = new FieldDef("silcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            silnif = new FieldDef("silnif",FieldDef.CHAR,9);
            silestado = new FieldDef("silestado",FieldDef.CHAR,2);
            sildescerror = new FieldDef("sildescerror",FieldDef.CHAR,255);
            silcsv = new FieldDef("silcsv",FieldDef.CHAR,50);
            silenviadas = new FieldDef("silenviadas",FieldDef.INTEGER,0);
            silnocambia = new FieldDef("silnocambia",FieldDef.INTEGER,0);
            silacperr = new FieldDef("silacperr",FieldDef.INTEGER,0);
            silcorrectas = new FieldDef("silcorrectas",FieldDef.INTEGER,0);
            silincorrectas = new FieldDef("silincorrectas",FieldDef.INTEGER,0);
            silfechaenvio = new FieldDef("silfechaenvio",FieldDef.DATE);
            silhoraenvio = new FieldDef("silhoraenvio",FieldDef.CHAR,10);
            silusuario = new FieldDef("silusuario",FieldDef.CHAR,15);
            silidpc = new FieldDef("silidpc",FieldDef.CHAR,30);
            siltabla = new FieldDef("siltabla",FieldDef.CHAR,30);
            siltipocom = new FieldDef("siltipocom",FieldDef.CHAR,2);
            silsiiigic = new FieldDef("silsiiigic",FieldDef.CHAR,1);
            FieldDef array[] = {
                silcodi,
                silnif,
                silestado,
                sildescerror,
                silcsv,
                silenviadas,
                silnocambia,
                silacperr,
                silcorrectas,
                silincorrectas,
                silfechaenvio,
                silhoraenvio,
                silusuario,
                silidpc,
                siltabla,
                siltipocom,
                silsiiigic                
                };
            setColumns(array);
            FieldDef arrayf[] = {silcodi };
            setPrimaryKeys(arrayf);
            silcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabSiilogdet extends TableDef
        {
        // campos
        public FieldDef sildcodidet;
        public FieldDef sildcodi;
        public FieldDef sildidtabla;
        public FieldDef sildestado;
        public FieldDef silddescerror;
        public FieldDef sildcodierror;
        public FieldDef sildidsii;
        public TabSiilogdet(String name)
            {
            super(name);
            sildcodidet = new FieldDef("sildcodidet",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            sildcodi = new FieldDef("sildcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            sildidtabla = new FieldDef("sildidtabla",FieldDef.INTEGER,0);
            sildestado = new FieldDef("sildestado",FieldDef.CHAR,2);
            silddescerror = new FieldDef("silddescerror",FieldDef.CHAR,255);
            sildcodierror = new FieldDef("sildcodierror",FieldDef.INTEGER,0);
            sildidsii = new FieldDef("sildidsii",FieldDef.CHAR,255);
            FieldDef array[] = {
                sildcodidet,
                sildcodi,
                sildidtabla,
                sildestado,
                silddescerror,
                sildcodierror,
                sildidsii                
                };
            setColumns(array);
            FieldDef arrayf[] = {sildcodidet };
            setPrimaryKeys(arrayf);
            sildcodidet.setAutoIncrementable(true);
            }
        }
        
    public class TabCerstorage extends TableDef
        {
        // campos
        public FieldDef cstcodi;
        public FieldDef cstnif;
        public FieldDef cstaliascer;
        public TabCerstorage(String name)
            {
            super(name);
            cstcodi = new FieldDef("cstcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            cstnif = new FieldDef("cstnif",FieldDef.CHAR,15);
            cstaliascer = new FieldDef("cstaliascer",FieldDef.CHAR,255);
            FieldDef array[] = {
                cstcodi,
                cstnif,
                cstaliascer                
                };
            setColumns(array);
            FieldDef arrayf[] = {cstcodi };
            setPrimaryKeys(arrayf);
            cstcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabCerinfo extends TableDef
        {
        // campos
        public FieldDef ceicodi;
        public FieldDef ceialiascer;
        public FieldDef ceinif;
        public FieldDef ceinombre;
        public TabCerinfo(String name)
            {
            super(name);
            ceicodi = new FieldDef("ceicodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ceialiascer = new FieldDef("ceialiascer",FieldDef.CHAR,255);
            ceinif = new FieldDef("ceinif",FieldDef.CHAR,20);
            ceinombre = new FieldDef("ceinombre",FieldDef.CHAR,255);
            FieldDef array[] = {
                ceicodi,
                ceialiascer,
                ceinif,
                ceinombre                
                };
            setColumns(array);
            FieldDef arrayf[] = {ceicodi };
            setPrimaryKeys(arrayf);
            ceicodi.setAutoIncrementable(true);
            }
        }
        
    public class TabImpexcel extends TableDef
        {
        // campos
        public FieldDef iexcodigo;
        public FieldDef iexusuario;
        public FieldDef iexnombre;
        public FieldDef iexhoja;
        public FieldDef iexlinea;
        public FieldDef iexformafecha;
        public TabImpexcel(String name)
            {
            super(name);
            iexcodigo = new FieldDef("iexcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            iexusuario = new FieldDef("iexusuario",FieldDef.CHAR,50);
            iexnombre = new FieldDef("iexnombre",FieldDef.CHAR,50);
            iexhoja = new FieldDef("iexhoja",FieldDef.CHAR,25);
            iexlinea = new FieldDef("iexlinea",FieldDef.INTEGER,0);
            iexformafecha = new FieldDef("iexformafecha",FieldDef.CHAR,10);
            FieldDef array[] = {
                iexcodigo,
                iexusuario,
                iexnombre,
                iexhoja,
                iexlinea,
                iexformafecha                
                };
            setColumns(array);
            FieldDef arrayf[] = {iexcodigo };
            setPrimaryKeys(arrayf);
            iexcodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabImpexceldef extends TableDef
        {
        // campos
        public FieldDef iedcodigo;
        public FieldDef iedposicion;
        public FieldDef iedcampo;
        public FieldDef ieddesc;
        public FieldDef iedcolumna;
        public FieldDef iedconstante;
        public TabImpexceldef(String name)
            {
            super(name);
            iedcodigo = new FieldDef("iedcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            iedposicion = new FieldDef("iedposicion",FieldDef.INTEGER,0);
            iedcampo = new FieldDef("iedcampo",FieldDef.CHAR,50);
            ieddesc = new FieldDef("ieddesc",FieldDef.CHAR,255);
            iedcolumna = new FieldDef("iedcolumna",FieldDef.CHAR,50);
            iedconstante = new FieldDef("iedconstante",FieldDef.CHAR,255);
            FieldDef array[] = {
                iedcodigo,
                iedposicion,
                iedcampo,
                ieddesc,
                iedcolumna,
                iedconstante                
                };
            setColumns(array);
            FieldDef arrayf[] = {iedcodigo,iedposicion };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis232 extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis232(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDeflis20a extends TableDef
        {
        // campos
        public FieldDef defmodelo;
        public FieldDef defhoja;
        public FieldDef defejercicio;
        public FieldDef defperiodo;
        public FieldDef defnumero;
        public FieldDef defposicion;
        public FieldDef deflongitud;
        public FieldDef deftipo;
        public FieldDef deflinea;
        public FieldDef defcolumna;
        public FieldDef defformato;
        public FieldDef defdesc;
        public FieldDef deftabla;
        public FieldDef defcampo;
        public FieldDef defdecimal;
        public FieldDef efcamponifes;
        public TabDeflis20a(String name)
            {
            super(name);
            defmodelo = new FieldDef("defmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            defhoja = new FieldDef("defhoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defperiodo = new FieldDef("defperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            defnumero = new FieldDef("defnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            defposicion = new FieldDef("defposicion",FieldDef.INTEGER,0);
            deflongitud = new FieldDef("deflongitud",FieldDef.INTEGER,0);
            deftipo = new FieldDef("deftipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            deflinea = new FieldDef("deflinea",FieldDef.INTEGER,0);
            defcolumna = new FieldDef("defcolumna",FieldDef.INTEGER,0);
            defformato = new FieldDef("defformato",FieldDef.CHAR,20);
            defdesc = new FieldDef("defdesc",FieldDef.CHAR,200);
            deftabla = new FieldDef("deftabla",FieldDef.CHAR,15);
            defcampo = new FieldDef("defcampo",FieldDef.CHAR,15);
            defdecimal = new FieldDef("defdecimal",FieldDef.INTEGER,0);
            efcamponifes = new FieldDef("efcamponifes",FieldDef.CHAR,15);
            FieldDef array[] = {
                defmodelo,
                defhoja,
                defejercicio,
                defperiodo,
                defnumero,
                defposicion,
                deflongitud,
                deftipo,
                deflinea,
                defcolumna,
                defformato,
                defdesc,
                deftabla,
                defcampo,
                defdecimal,
                efcamponifes                
                };
            setColumns(array);
            FieldDef arrayf[] = {defmodelo,defhoja,defejercicio,defperiodo,defnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDiarios extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
            FieldDef arrayf[] = {estcodigo,estelemento };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabPcepigrafe extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        public FieldDef empsiiaux;
        public FieldDef empultusuario;
        public FieldDef empultacceso;
        public FieldDef empsiiigic;
        public FieldDef empandper;
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
            empsiiaux = new FieldDef("empsiiaux",FieldDef.CHAR,30);
            empultusuario = new FieldDef("empultusuario",FieldDef.CHAR,25);
            empultacceso = new FieldDef("empultacceso",FieldDef.DATE);
            empsiiigic = new FieldDef("empsiiigic",FieldDef.CHAR,1);
            empandper = new FieldDef("empandper",FieldDef.CHAR,1);
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
                empcnae,
                empsiiaux,
                empultusuario,
                empultacceso,
                empsiiigic,
                empandper                
                };
            setColumns(array);
            FieldDef arrayf[] = {empcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabEjercicio extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        public FieldDef pcucobpagfp;
        public FieldDef pcuccc;
        public FieldDef pcurecc;
        public FieldDef pcuobserva;
        public TabPcuentas(String name)
            {
            super(name);
            pcuempresa = new FieldDef("pcuempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pcuejercicio = new FieldDef("pcuejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pcucuenta = new FieldDef("pcucuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
            pcusubcuenta = new FieldDef("pcusubcuenta",FieldDef.CHAR,12,FieldDef.NOTNULL);
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
            pcucobpagfp = new FieldDef("pcucobpagfp",FieldDef.CHAR,3);
            pcuccc = new FieldDef("pcuccc",FieldDef.CHAR,34);
            pcurecc = new FieldDef("pcurecc",FieldDef.CHAR,1);
            pcuobserva = new FieldDef("pcuobserva",FieldDef.CHAR,4000);
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
                pcuvtopridia,
                pcucobpagfp,
                pcuccc,
                pcurecc,
                pcuobserva                
                };
            setColumns(array);
            FieldDef arrayf[] = {pcuempresa,pcuejercicio,pcucuenta,pcusubcuenta };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabPcacumulados extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        public FieldDef pcicodinext;
        public FieldDef pcicodiant;
        public FieldDef pcicodini;
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
            pcicodinext = new FieldDef("pcicodinext",FieldDef.INTEGER,0);
            pcicodiant = new FieldDef("pcicodiant",FieldDef.INTEGER,0);
            pcicodini = new FieldDef("pcicodini",FieldDef.INTEGER,12);
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
                pciobser,
                pcicodinext,
                pcicodiant,
                pcicodini                
                };
            setColumns(array);
            FieldDef arrayf[] = {pcielemento };
            setPrimaryKeys(arrayf);
            pcielemento.setAutoIncrementable(true);
            }
        }
        
    public class TabPcmoranual extends TableDef
        {
        // campos
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
        // campos
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
            pclpiso = new FieldDef("pclpiso",FieldDef.CHAR,3);
            pclpuerta = new FieldDef("pclpuerta",FieldDef.CHAR,3);
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
        // campos
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
        // campos
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
            FieldDef arrayf[] = {ralcodi };
            setPrimaryKeys(arrayf);
            ralcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabTipcabecera extends TableDef
        {
        // campos
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
        public FieldDef ticencadenar;
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
            ticencadenar = new FieldDef("ticencadenar",FieldDef.CHAR,5);
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
                ticprorrata,
                ticencadenar                
                };
            setColumns(array);
            FieldDef arrayf[] = {ticcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabTiplineas extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        public FieldDef asitipoent;
        public FieldDef asitipoasto;
        public FieldDef asicodelem;
        public FieldDef asitipolin;
        public FieldDef asifechacrea;
        public FieldDef asiorigen;
        public FieldDef asicodrefext;
        public FieldDef asicodigesdoc;
        public FieldDef asiobserva;
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
            asidocumento = new FieldDef("asidocumento",FieldDef.CHAR,60);
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
            asitipoent = new FieldDef("asitipoent",FieldDef.INTEGER,0);
            asitipoasto = new FieldDef("asitipoasto",FieldDef.CHAR,10);
            asicodelem = new FieldDef("asicodelem",FieldDef.INTEGER,0);
            asitipolin = new FieldDef("asitipolin",FieldDef.CHAR,20);
            asifechacrea = new FieldDef("asifechacrea",FieldDef.DATE);
            asiorigen = new FieldDef("asiorigen",FieldDef.CHAR,20);
            asicodrefext = new FieldDef("asicodrefext",FieldDef.CHAR,100);
            asicodigesdoc = new FieldDef("asicodigesdoc",FieldDef.INTEGER,0);
            asiobserva = new FieldDef("asiobserva",FieldDef.CHAR,4000);
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
                asitipoef,
                asitipoent,
                asitipoasto,
                asicodelem,
                asitipolin,
                asifechacrea,
                asiorigen,
                asicodrefext,
                asicodigesdoc,
                asiobserva                
                };
            setColumns(array);
            FieldDef arrayf[] = {asicodi };
            setPrimaryKeys(arrayf);
            asicodi.setAutoIncrementable(true);
            }
        }
        
    public class TabCobropago extends TableDef
        {
        // campos
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
        public FieldDef cobnumasto;
        public FieldDef cobnumastogen;
        public FieldDef cobejerasto;
        public FieldDef cobejerastogen;
        public FieldDef cobcobpagfp;
        public FieldDef cobccc;
        public FieldDef cobcivcodi;
        public FieldDef cobcodisii;
        public FieldDef cobivaeje;
        public FieldDef cobivaper;
        public FieldDef cobcasiva;
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
            cobdocumento = new FieldDef("cobdocumento",FieldDef.CHAR,60);
            cobtrasp = new FieldDef("cobtrasp",FieldDef.CHAR,1);
            cobnumasto = new FieldDef("cobnumasto",FieldDef.INTEGER,0);
            cobnumastogen = new FieldDef("cobnumastogen",FieldDef.INTEGER,0);
            cobejerasto = new FieldDef("cobejerasto",FieldDef.INTEGER,0);
            cobejerastogen = new FieldDef("cobejerastogen",FieldDef.INTEGER,0);
            cobcobpagfp = new FieldDef("cobcobpagfp",FieldDef.CHAR,3);
            cobccc = new FieldDef("cobccc",FieldDef.CHAR,34);
            cobcivcodi = new FieldDef("cobcivcodi",FieldDef.INTEGER,0);
            cobcodisii = new FieldDef("cobcodisii",FieldDef.INTEGER,0);
            cobivaeje = new FieldDef("cobivaeje",FieldDef.INTEGER,0);
            cobivaper = new FieldDef("cobivaper",FieldDef.CHAR,2);
            cobcasiva = new FieldDef("cobcasiva",FieldDef.INTEGER,0);
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
                cobtrasp,
                cobnumasto,
                cobnumastogen,
                cobejerasto,
                cobejerastogen,
                cobcobpagfp,
                cobccc,
                cobcivcodi,
                cobcodisii,
                cobivaeje,
                cobivaper,
                cobcasiva                
                };
            setColumns(array);
            FieldDef arrayf[] = {cobcodi };
            setPrimaryKeys(arrayf);
            cobcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabIvacabecera extends TableDef
        {
        // campos
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
        public FieldDef civrecc;
        public FieldDef civirpfeje;
        public FieldDef civirpfper;
        public FieldDef civivaeje;
        public FieldDef civivaper;
        public FieldDef civcasiva;
        public FieldDef civcasirpf;
        public FieldDef civdoc340;
        public FieldDef civesfarec;
        public FieldDef civcodirec;
        public FieldDef civejerrec;
        public FieldDef civesfabus;
        public FieldDef civcodibus;
        public FieldDef civejerbus;
        public FieldDef civmod123;
        public FieldDef civsiitfac;
        public FieldDef civsiicltr;
        public FieldDef civsiidesc;
        public FieldDef civsiisitin;
        public FieldDef civsiircat;
        public FieldDef civsiiimtr;
        public FieldDef civcodisii;
        public FieldDef civsiiidfa;
        public FieldDef civsiicltr1;
        public FieldDef civsiicltr2;
        public FieldDef civsiitnifc;
        public FieldDef civsiicexen;
        public FieldDef civsii714;
        public FieldDef civsiitai;
        public FieldDef civsiinumac;
        public FieldDef civsiitlib;
        public FieldDef civfechareg;
        public FieldDef civivaxfreg;
        public FieldDef civsiiejer;
        public FieldDef civsiiperi;
        public FieldDef civsiiemi3;
        public FieldDef civsiipais;
        public FieldDef civsiitipo;
        public FieldDef civsiiidnif;
        public FieldDef civsiiidfaf;
        public FieldDef civsiifanser;
        public FieldDef civsiifaffac;
        public FieldDef civsiibcoste;
        public FieldDef civsiirefext;
        public FieldDef civsiifsim;
        public FieldDef civsiiesnom;
        public FieldDef civsiiesnif;
        public FieldDef civsiirprev;
        public FieldDef civsiimacro;
        public FieldDef civsiifadi3;
        public FieldDef civsiivardes;
        public FieldDef civsiicupon;
        public FieldDef civsiisinid;
        public FieldDef civsiifacest;
        public FieldDef civsiifacerr;
        public FieldDef civcodisiig;
        public FieldDef civsiiambos;
        public FieldDef civsiigpant;
        public FieldDef civsiigtbien;
        public FieldDef civsiigtdoc;
        public FieldDef civsiignprot;
        public FieldDef civsiignotar;
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
            civdocumento = new FieldDef("civdocumento",FieldDef.CHAR,60);
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
            civrecc = new FieldDef("civrecc",FieldDef.CHAR,1);
            civirpfeje = new FieldDef("civirpfeje",FieldDef.INTEGER,0);
            civirpfper = new FieldDef("civirpfper",FieldDef.CHAR,2);
            civivaeje = new FieldDef("civivaeje",FieldDef.INTEGER,0);
            civivaper = new FieldDef("civivaper",FieldDef.CHAR,2);
            civcasiva = new FieldDef("civcasiva",FieldDef.INTEGER,0);
            civcasirpf = new FieldDef("civcasirpf",FieldDef.INTEGER,0);
            civdoc340 = new FieldDef("civdoc340",FieldDef.CHAR,100);
            civesfarec = new FieldDef("civesfarec",FieldDef.CHAR,1);
            civcodirec = new FieldDef("civcodirec",FieldDef.INTEGER,0);
            civejerrec = new FieldDef("civejerrec",FieldDef.INTEGER,0);
            civesfabus = new FieldDef("civesfabus",FieldDef.CHAR,1);
            civcodibus = new FieldDef("civcodibus",FieldDef.INTEGER,0);
            civejerbus = new FieldDef("civejerbus",FieldDef.INTEGER,0);
            civmod123 = new FieldDef("civmod123",FieldDef.CHAR,1);
            civsiitfac = new FieldDef("civsiitfac",FieldDef.CHAR,2);
            civsiicltr = new FieldDef("civsiicltr",FieldDef.CHAR,2);
            civsiidesc = new FieldDef("civsiidesc",FieldDef.CHAR,500);
            civsiisitin = new FieldDef("civsiisitin",FieldDef.INTEGER,0);
            civsiircat = new FieldDef("civsiircat",FieldDef.CHAR,25);
            civsiiimtr = new FieldDef("civsiiimtr",FieldDef.FLOAT,6,0);
            civcodisii = new FieldDef("civcodisii",FieldDef.INTEGER,0);
            civsiiidfa = new FieldDef("civsiiidfa",FieldDef.CHAR,60);
            civsiicltr1 = new FieldDef("civsiicltr1",FieldDef.CHAR,2);
            civsiicltr2 = new FieldDef("civsiicltr2",FieldDef.CHAR,2);
            civsiitnifc = new FieldDef("civsiitnifc",FieldDef.CHAR,2);
            civsiicexen = new FieldDef("civsiicexen",FieldDef.CHAR,2);
            civsii714 = new FieldDef("civsii714",FieldDef.FLOAT,6,0);
            civsiitai = new FieldDef("civsiitai",FieldDef.FLOAT,6,0);
            civsiinumac = new FieldDef("civsiinumac",FieldDef.CHAR,15);
            civsiitlib = new FieldDef("civsiitlib",FieldDef.CHAR,2);
            civfechareg = new FieldDef("civfechareg",FieldDef.DATE);
            civivaxfreg = new FieldDef("civivaxfreg",FieldDef.CHAR,1);
            civsiiejer = new FieldDef("civsiiejer",FieldDef.INTEGER,0);
            civsiiperi = new FieldDef("civsiiperi",FieldDef.INTEGER,0);
            civsiiemi3 = new FieldDef("civsiiemi3",FieldDef.CHAR,1);
            civsiipais = new FieldDef("civsiipais",FieldDef.CHAR,2);
            civsiitipo = new FieldDef("civsiitipo",FieldDef.CHAR,2);
            civsiiidnif = new FieldDef("civsiiidnif",FieldDef.CHAR,20);
            civsiiidfaf = new FieldDef("civsiiidfaf",FieldDef.CHAR,60);
            civsiifanser = new FieldDef("civsiifanser",FieldDef.CHAR,60);
            civsiifaffac = new FieldDef("civsiifaffac",FieldDef.DATE);
            civsiibcoste = new FieldDef("civsiibcoste",FieldDef.FLOAT,0,2);
            civsiirefext = new FieldDef("civsiirefext",FieldDef.CHAR,60);
            civsiifsim = new FieldDef("civsiifsim",FieldDef.CHAR,1);
            civsiiesnom = new FieldDef("civsiiesnom",FieldDef.CHAR,120);
            civsiiesnif = new FieldDef("civsiiesnif",FieldDef.CHAR,9);
            civsiirprev = new FieldDef("civsiirprev",FieldDef.CHAR,1);
            civsiimacro = new FieldDef("civsiimacro",FieldDef.CHAR,1);
            civsiifadi3 = new FieldDef("civsiifadi3",FieldDef.CHAR,1);
            civsiivardes = new FieldDef("civsiivardes",FieldDef.CHAR,1);
            civsiicupon = new FieldDef("civsiicupon",FieldDef.CHAR,1);
            civsiisinid = new FieldDef("civsiisinid",FieldDef.CHAR,1);
            civsiifacest = new FieldDef("civsiifacest",FieldDef.CHAR,2);
            civsiifacerr = new FieldDef("civsiifacerr",FieldDef.CHAR,255);
            civcodisiig = new FieldDef("civcodisiig",FieldDef.INTEGER,12);
            civsiiambos = new FieldDef("civsiiambos",FieldDef.CHAR,1);
            civsiigpant = new FieldDef("civsiigpant",FieldDef.CHAR,1);
            civsiigtbien = new FieldDef("civsiigtbien",FieldDef.CHAR,2);
            civsiigtdoc = new FieldDef("civsiigtdoc",FieldDef.CHAR,2);
            civsiignprot = new FieldDef("civsiignprot",FieldDef.CHAR,6);
            civsiignotar = new FieldDef("civsiignotar",FieldDef.CHAR,120);
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
                civclave110,
                civrecc,
                civirpfeje,
                civirpfper,
                civivaeje,
                civivaper,
                civcasiva,
                civcasirpf,
                civdoc340,
                civesfarec,
                civcodirec,
                civejerrec,
                civesfabus,
                civcodibus,
                civejerbus,
                civmod123,
                civsiitfac,
                civsiicltr,
                civsiidesc,
                civsiisitin,
                civsiircat,
                civsiiimtr,
                civcodisii,
                civsiiidfa,
                civsiicltr1,
                civsiicltr2,
                civsiitnifc,
                civsiicexen,
                civsii714,
                civsiitai,
                civsiinumac,
                civsiitlib,
                civfechareg,
                civivaxfreg,
                civsiiejer,
                civsiiperi,
                civsiiemi3,
                civsiipais,
                civsiitipo,
                civsiiidnif,
                civsiiidfaf,
                civsiifanser,
                civsiifaffac,
                civsiibcoste,
                civsiirefext,
                civsiifsim,
                civsiiesnom,
                civsiiesnif,
                civsiirprev,
                civsiimacro,
                civsiifadi3,
                civsiivardes,
                civsiicupon,
                civsiisinid,
                civsiifacest,
                civsiifacerr,
                civcodisiig,
                civsiiambos,
                civsiigpant,
                civsiigtbien,
                civsiigtdoc,
                civsiignprot,
                civsiignotar                
                };
            setColumns(array);
            FieldDef arrayf[] = {civcodi };
            setPrimaryKeys(arrayf);
            civcodi.setAutoIncrementable(true);
            civesfarec.setDescription("Camps nous");
            civsiifacest.setDescription("Estado SIIFACIL");
            civsiifacerr.setDescription("Error siifacil");
            }
        }
        
    public class TabIvalineas extends TableDef
        {
        // campos
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
        public FieldDef livcasiva;
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
            livcasiva = new FieldDef("livcasiva",FieldDef.INTEGER,0);
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
                livprorrata,
                livcasiva                
                };
            setColumns(array);
            FieldDef arrayf[] = {livcodi,livcodilin };
            setPrimaryKeys(arrayf);
            livcodilin.setAutoIncrementable(true);
            }
        }
        
    public class TabImportcab extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        public FieldDef iasdesccta;
        public FieldDef iasnifcta;
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
            iasdocumento = new FieldDef("iasdocumento",FieldDef.CHAR,60);
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
            iasdesccta = new FieldDef("iasdesccta",FieldDef.CHAR,40);
            iasnifcta = new FieldDef("iasnifcta",FieldDef.CHAR,15);
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
                iascuentainex,
                iasdesccta,
                iasnifcta                
                };
            setColumns(array);
            FieldDef arrayf[] = {iascodi };
            setPrimaryKeys(arrayf);
            iascodi.setAutoIncrementable(true);
            }
        }
        
    public class TabImpivacab extends TableDef
        {
        // campos
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
        public FieldDef icivsiitfac;
        public FieldDef icivsiicltr;
        public FieldDef icivsiidesc;
        public FieldDef icivsiisitin;
        public FieldDef icivsiircat;
        public FieldDef icivsiiimtr;
        public FieldDef icivsiiidfa;
        public FieldDef icivsiicltr1;
        public FieldDef icivsiicltr2;
        public FieldDef icivsiitnifc;
        public FieldDef icivsiicexen;
        public FieldDef icivsii714;
        public FieldDef icivsiitai;
        public FieldDef icivsiinumac;
        public FieldDef icivsiitlib;
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
            icivdocumento = new FieldDef("icivdocumento",FieldDef.CHAR,60);
            icivdesc = new FieldDef("icivdesc",FieldDef.CHAR,40);
            icivnif = new FieldDef("icivnif",FieldDef.CHAR,15);
            icivimporte = new FieldDef("icivimporte",FieldDef.FLOAT,6,0);
            icivemirep = new FieldDef("icivemirep",FieldDef.CHAR,1);
            icivregimen = new FieldDef("icivregimen",FieldDef.CHAR,2);
            icivasicodi = new FieldDef("icivasicodi",FieldDef.INTEGER,0);
            icivporirpf = new FieldDef("icivporirpf",FieldDef.FLOAT,6,0);
            icivbaseirpf = new FieldDef("icivbaseirpf",FieldDef.FLOAT,6,0);
            icivimpiva = new FieldDef("icivimpiva",FieldDef.FLOAT,6,0);
            icivsiitfac = new FieldDef("icivsiitfac",FieldDef.CHAR,2);
            icivsiicltr = new FieldDef("icivsiicltr",FieldDef.CHAR,2);
            icivsiidesc = new FieldDef("icivsiidesc",FieldDef.CHAR,500);
            icivsiisitin = new FieldDef("icivsiisitin",FieldDef.INTEGER,0);
            icivsiircat = new FieldDef("icivsiircat",FieldDef.CHAR,25);
            icivsiiimtr = new FieldDef("icivsiiimtr",FieldDef.FLOAT,6,0);
            icivsiiidfa = new FieldDef("icivsiiidfa",FieldDef.CHAR,60);
            icivsiicltr1 = new FieldDef("icivsiicltr1",FieldDef.CHAR,2);
            icivsiicltr2 = new FieldDef("icivsiicltr2",FieldDef.CHAR,2);
            icivsiitnifc = new FieldDef("icivsiitnifc",FieldDef.CHAR,2);
            icivsiicexen = new FieldDef("icivsiicexen",FieldDef.CHAR,2);
            icivsii714 = new FieldDef("icivsii714",FieldDef.FLOAT,6,0);
            icivsiitai = new FieldDef("icivsiitai",FieldDef.FLOAT,6,0);
            icivsiinumac = new FieldDef("icivsiinumac",FieldDef.CHAR,15);
            icivsiitlib = new FieldDef("icivsiitlib",FieldDef.CHAR,2);
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
                icivimpiva,
                icivsiitfac,
                icivsiicltr,
                icivsiidesc,
                icivsiisitin,
                icivsiircat,
                icivsiiimtr,
                icivsiiidfa,
                icivsiicltr1,
                icivsiicltr2,
                icivsiitnifc,
                icivsiicexen,
                icivsii714,
                icivsiitai,
                icivsiinumac,
                icivsiitlib                
                };
            setColumns(array);
            FieldDef arrayf[] = {icivcodi };
            setPrimaryKeys(arrayf);
            icivcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabImpivalineas extends TableDef
        {
        // campos
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
        public FieldDef ilivprorrata;
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
            ilivprorrata = new FieldDef("ilivprorrata",FieldDef.CHAR,1);
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
                ilivtransaccion,
                ilivprorrata                
                };
            setColumns(array);
            FieldDef arrayf[] = {ilivcodi,ilivcodilin };
            setPrimaryKeys(arrayf);
            ilivcodilin.setAutoIncrementable(true);
            }
        }
        
    public class TabInfcabecera extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        public FieldDef ecpf12ac1;
        public FieldDef ecpf12ac2;
        public FieldDef ecpf12ac3;
        public FieldDef ecpf12ac4;
        public FieldDef ecpf12ac5;
        public FieldDef ecpf12ac6;
        public FieldDef ecpf12ac7;
        public FieldDef ecpf12ac8;
        public FieldDef ecpf12ac9;
        public FieldDef ecpf12ac10;
        public FieldDef ecpf12ac11;
        public FieldDef ecpf12ac12;
        public FieldDef ecpf12bc1;
        public FieldDef ecpf12bc2;
        public FieldDef ecpf12bc3;
        public FieldDef ecpf12bc4;
        public FieldDef ecpf12bc5;
        public FieldDef ecpf12bc6;
        public FieldDef ecpf12bc7;
        public FieldDef ecpf12bc8;
        public FieldDef ecpf12bc9;
        public FieldDef ecpf12bc10;
        public FieldDef ecpf12bc11;
        public FieldDef ecpf12bc12;
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
            ecpf12ac1 = new FieldDef("ecpf12ac1",FieldDef.FLOAT,6,0);
            ecpf12ac2 = new FieldDef("ecpf12ac2",FieldDef.FLOAT,6,0);
            ecpf12ac3 = new FieldDef("ecpf12ac3",FieldDef.FLOAT,6,0);
            ecpf12ac4 = new FieldDef("ecpf12ac4",FieldDef.FLOAT,6,0);
            ecpf12ac5 = new FieldDef("ecpf12ac5",FieldDef.FLOAT,6,0);
            ecpf12ac6 = new FieldDef("ecpf12ac6",FieldDef.FLOAT,6,0);
            ecpf12ac7 = new FieldDef("ecpf12ac7",FieldDef.FLOAT,6,0);
            ecpf12ac8 = new FieldDef("ecpf12ac8",FieldDef.FLOAT,6,0);
            ecpf12ac9 = new FieldDef("ecpf12ac9",FieldDef.FLOAT,6,0);
            ecpf12ac10 = new FieldDef("ecpf12ac10",FieldDef.FLOAT,6,0);
            ecpf12ac11 = new FieldDef("ecpf12ac11",FieldDef.FLOAT,6,0);
            ecpf12ac12 = new FieldDef("ecpf12ac12",FieldDef.FLOAT,6,0);
            ecpf12bc1 = new FieldDef("ecpf12bc1",FieldDef.FLOAT,6,0);
            ecpf12bc2 = new FieldDef("ecpf12bc2",FieldDef.FLOAT,6,0);
            ecpf12bc3 = new FieldDef("ecpf12bc3",FieldDef.FLOAT,6,0);
            ecpf12bc4 = new FieldDef("ecpf12bc4",FieldDef.FLOAT,6,0);
            ecpf12bc5 = new FieldDef("ecpf12bc5",FieldDef.FLOAT,6,0);
            ecpf12bc6 = new FieldDef("ecpf12bc6",FieldDef.FLOAT,6,0);
            ecpf12bc7 = new FieldDef("ecpf12bc7",FieldDef.FLOAT,6,0);
            ecpf12bc8 = new FieldDef("ecpf12bc8",FieldDef.FLOAT,6,0);
            ecpf12bc9 = new FieldDef("ecpf12bc9",FieldDef.FLOAT,6,0);
            ecpf12bc10 = new FieldDef("ecpf12bc10",FieldDef.FLOAT,6,0);
            ecpf12bc11 = new FieldDef("ecpf12bc11",FieldDef.FLOAT,6,0);
            ecpf12bc12 = new FieldDef("ecpf12bc12",FieldDef.FLOAT,6,0);
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
                ecpfp4c12,
                ecpf12ac1,
                ecpf12ac2,
                ecpf12ac3,
                ecpf12ac4,
                ecpf12ac5,
                ecpf12ac6,
                ecpf12ac7,
                ecpf12ac8,
                ecpf12ac9,
                ecpf12ac10,
                ecpf12ac11,
                ecpf12ac12,
                ecpf12bc1,
                ecpf12bc2,
                ecpf12bc3,
                ecpf12bc4,
                ecpf12bc5,
                ecpf12bc6,
                ecpf12bc7,
                ecpf12bc8,
                ecpf12bc9,
                ecpf12bc10,
                ecpf12bc11,
                ecpf12bc12                
                };
            setColumns(array);
            FieldDef arrayf[] = {ecpempresa,ecpejercicio,ecpperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabCalendario extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        public FieldDef a347importe1t;
        public FieldDef a347importe2t;
        public FieldDef a347importe3t;
        public FieldDef a347importe4t;
        public FieldDef a347implc1t;
        public FieldDef a347implc2t;
        public FieldDef a347implc3t;
        public FieldDef a347implc4t;
        public FieldDef a347direccion;
        public FieldDef a347telf;
        public FieldDef a347municipio;
        public FieldDef a347cpostal;
        public FieldDef a347email;
        public FieldDef a347descclave;
        public FieldDef a347importetot;
        public FieldDef a347impsp;
        public FieldDef a347impsp1t;
        public FieldDef a347impsp2t;
        public FieldDef a347impsp3t;
        public FieldDef a347impsp4t;
        public FieldDef a347impaduana;
        public FieldDef a347efaduana;
        public FieldDef a347impadu1t;
        public FieldDef a347impadu2t;
        public FieldDef a347impadu3t;
        public FieldDef a347impadu4t;
        public FieldDef a347eflocal;
        public FieldDef a347implocrecc;
        public FieldDef a347eflocrecc;
        public FieldDef a347efrecc;
        public FieldDef a347imprecc;
        public FieldDef a347recccob;
        public FieldDef a347recclocob;
        public FieldDef a347esacum415;
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
            a347importe1t = new FieldDef("a347importe1t",FieldDef.FLOAT,6,0);
            a347importe2t = new FieldDef("a347importe2t",FieldDef.FLOAT,6,0);
            a347importe3t = new FieldDef("a347importe3t",FieldDef.FLOAT,6,0);
            a347importe4t = new FieldDef("a347importe4t",FieldDef.FLOAT,6,0);
            a347implc1t = new FieldDef("a347implc1t",FieldDef.FLOAT,6,0);
            a347implc2t = new FieldDef("a347implc2t",FieldDef.FLOAT,6,0);
            a347implc3t = new FieldDef("a347implc3t",FieldDef.FLOAT,6,0);
            a347implc4t = new FieldDef("a347implc4t",FieldDef.FLOAT,6,0);
            a347direccion = new FieldDef("a347direccion",FieldDef.CHAR,100);
            a347telf = new FieldDef("a347telf",FieldDef.CHAR,15);
            a347municipio = new FieldDef("a347municipio",FieldDef.CHAR,40);
            a347cpostal = new FieldDef("a347cpostal",FieldDef.CHAR,5);
            a347email = new FieldDef("a347email",FieldDef.CHAR,100);
            a347descclave = new FieldDef("a347descclave",FieldDef.CHAR,10);
            a347importetot = new FieldDef("a347importetot",FieldDef.FLOAT,6,0);
            a347impsp = new FieldDef("a347impsp",FieldDef.FLOAT,6,0);
            a347impsp1t = new FieldDef("a347impsp1t",FieldDef.FLOAT,6,0);
            a347impsp2t = new FieldDef("a347impsp2t",FieldDef.FLOAT,6,0);
            a347impsp3t = new FieldDef("a347impsp3t",FieldDef.FLOAT,6,0);
            a347impsp4t = new FieldDef("a347impsp4t",FieldDef.FLOAT,6,0);
            a347impaduana = new FieldDef("a347impaduana",FieldDef.FLOAT,6,0);
            a347efaduana = new FieldDef("a347efaduana",FieldDef.FLOAT,6,0);
            a347impadu1t = new FieldDef("a347impadu1t",FieldDef.FLOAT,6,0);
            a347impadu2t = new FieldDef("a347impadu2t",FieldDef.FLOAT,6,0);
            a347impadu3t = new FieldDef("a347impadu3t",FieldDef.FLOAT,6,0);
            a347impadu4t = new FieldDef("a347impadu4t",FieldDef.FLOAT,6,0);
            a347eflocal = new FieldDef("a347eflocal",FieldDef.FLOAT,6,0);
            a347implocrecc = new FieldDef("a347implocrecc",FieldDef.FLOAT,6,0);
            a347eflocrecc = new FieldDef("a347eflocrecc",FieldDef.FLOAT,6,0);
            a347efrecc = new FieldDef("a347efrecc",FieldDef.FLOAT,6,0);
            a347imprecc = new FieldDef("a347imprecc",FieldDef.FLOAT,6,0);
            a347recccob = new FieldDef("a347recccob",FieldDef.FLOAT,6,0);
            a347recclocob = new FieldDef("a347recclocob",FieldDef.FLOAT,6,0);
            a347esacum415 = new FieldDef("a347esacum415",FieldDef.CHAR,1);
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
                a347tipogen,
                a347importe1t,
                a347importe2t,
                a347importe3t,
                a347importe4t,
                a347implc1t,
                a347implc2t,
                a347implc3t,
                a347implc4t,
                a347direccion,
                a347telf,
                a347municipio,
                a347cpostal,
                a347email,
                a347descclave,
                a347importetot,
                a347impsp,
                a347impsp1t,
                a347impsp2t,
                a347impsp3t,
                a347impsp4t,
                a347impaduana,
                a347efaduana,
                a347impadu1t,
                a347impadu2t,
                a347impadu3t,
                a347impadu4t,
                a347eflocal,
                a347implocrecc,
                a347eflocrecc,
                a347efrecc,
                a347imprecc,
                a347recccob,
                a347recclocob,
                a347esacum415                
                };
            setColumns(array);
            FieldDef arrayf[] = {a347codigo };
            setPrimaryKeys(arrayf);
            a347codigo.setAutoIncrementable(true);
            }
        }
        
    public class TabAcum130 extends TableDef
        {
        // campos
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
        // campos
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
        
    public class TabListadotmp extends TableDef
        {
        // campos
        public FieldDef ltmcodigo;
        public FieldDef ltmusuario;
        public FieldDef ltmlistado;
        public FieldDef ltmempresa;
        public FieldDef ltmejercicio;
        public FieldDef ltmcampoa1;
        public FieldDef ltmcampoa2;
        public FieldDef ltmcampoa3;
        public FieldDef ltmcampoa4;
        public FieldDef ltmcampoa5;
        public FieldDef ltmcampoa6;
        public FieldDef ltmcampoa7;
        public FieldDef ltmcampoa8;
        public FieldDef ltmcampoa9;
        public FieldDef ltmcampoa10;
        public FieldDef ltmcampoa11;
        public FieldDef ltmcampoa12;
        public FieldDef ltmcampoa13;
        public FieldDef ltmcampoa14;
        public FieldDef ltmcampoa15;
        public FieldDef ltmcampoa16;
        public FieldDef ltmcampoa17;
        public FieldDef ltmcampoa18;
        public FieldDef ltmcampoa19;
        public FieldDef ltmcampoa20;
        public FieldDef ltmcampoa21;
        public FieldDef ltmcampoa22;
        public FieldDef ltmcampoa23;
        public FieldDef ltmcampoa24;
        public FieldDef ltmcampoa25;
        public FieldDef ltmcampoa26;
        public FieldDef ltmcampoa27;
        public FieldDef ltmcampoa28;
        public FieldDef ltmcampoa29;
        public FieldDef ltmcampoa30;
        public FieldDef ltmcampoa31;
        public FieldDef ltmcampoa32;
        public FieldDef ltmcampoa33;
        public FieldDef ltmcampoa34;
        public FieldDef ltmcampoa35;
        public FieldDef ltmcampoa36;
        public FieldDef ltmcampoa37;
        public FieldDef ltmcampoa38;
        public FieldDef ltmcampoa39;
        public FieldDef ltmcampoa40;
        public FieldDef ltmcampoi1;
        public FieldDef ltmcampoi2;
        public FieldDef ltmcampoi3;
        public FieldDef ltmcampoi4;
        public FieldDef ltmcampoi5;
        public FieldDef ltmcampoi6;
        public FieldDef ltmcampoi7;
        public FieldDef ltmcampoi8;
        public FieldDef ltmcampoi9;
        public FieldDef ltmcampoi10;
        public FieldDef ltmcampoi11;
        public FieldDef ltmcampoi12;
        public FieldDef ltmcampoi13;
        public FieldDef ltmcampoi14;
        public FieldDef ltmcampoi15;
        public FieldDef ltmcampoi16;
        public FieldDef ltmcampoi17;
        public FieldDef ltmcampoi18;
        public FieldDef ltmcampoi19;
        public FieldDef ltmcampoi20;
        public FieldDef ltmcampoi21;
        public FieldDef ltmcampoi22;
        public FieldDef ltmcampoi23;
        public FieldDef ltmcampoi24;
        public FieldDef ltmcampoi25;
        public FieldDef ltmcampoi26;
        public FieldDef ltmcampoi27;
        public FieldDef ltmcampoi28;
        public FieldDef ltmcampoi29;
        public FieldDef ltmcampoi30;
        public FieldDef ltmcampoi31;
        public FieldDef ltmcampoi32;
        public FieldDef ltmcampoi33;
        public FieldDef ltmcampoi34;
        public FieldDef ltmcampoi35;
        public FieldDef ltmcampoi36;
        public FieldDef ltmcampoi37;
        public FieldDef ltmcampoi38;
        public FieldDef ltmcampoi39;
        public FieldDef ltmcampoi40;
        public FieldDef ltmcampof1;
        public FieldDef ltmcampof2;
        public FieldDef ltmcampof3;
        public FieldDef ltmcampof4;
        public FieldDef ltmcampof5;
        public FieldDef ltmcampof6;
        public FieldDef ltmcampof7;
        public FieldDef ltmcampof8;
        public FieldDef ltmcampof9;
        public FieldDef ltmcampof10;
        public FieldDef ltmcampof11;
        public FieldDef ltmcampof12;
        public FieldDef ltmcampof13;
        public FieldDef ltmcampof14;
        public FieldDef ltmcampof15;
        public FieldDef ltmcampof16;
        public FieldDef ltmcampof17;
        public FieldDef ltmcampof18;
        public FieldDef ltmcampof19;
        public FieldDef ltmcampof20;
        public FieldDef ltmcampof21;
        public FieldDef ltmcampof22;
        public FieldDef ltmcampof23;
        public FieldDef ltmcampof24;
        public FieldDef ltmcampof25;
        public FieldDef ltmcampof26;
        public FieldDef ltmcampof27;
        public FieldDef ltmcampof28;
        public FieldDef ltmcampof29;
        public FieldDef ltmcampof30;
        public FieldDef ltmcampof31;
        public FieldDef ltmcampof32;
        public FieldDef ltmcampof33;
        public FieldDef ltmcampof34;
        public FieldDef ltmcampof35;
        public FieldDef ltmcampof36;
        public FieldDef ltmcampof37;
        public FieldDef ltmcampof38;
        public FieldDef ltmcampof39;
        public FieldDef ltmcampof40;
        public FieldDef ltmcampod1;
        public FieldDef ltmcampod2;
        public FieldDef ltmcampod3;
        public FieldDef ltmcampod4;
        public FieldDef ltmcampod5;
        public FieldDef ltmcampod6;
        public FieldDef ltmcampod7;
        public FieldDef ltmcampod8;
        public FieldDef ltmcampod9;
        public FieldDef ltmcampod10;
        public FieldDef ltmcampod11;
        public FieldDef ltmcampod12;
        public FieldDef ltmcampod13;
        public FieldDef ltmcampod14;
        public FieldDef ltmcampod15;
        public FieldDef ltmcampod16;
        public FieldDef ltmcampod17;
        public FieldDef ltmcampod18;
        public FieldDef ltmcampod19;
        public FieldDef ltmcampod20;
        public FieldDef ltmcampod21;
        public FieldDef ltmcampod22;
        public FieldDef ltmcampod23;
        public FieldDef ltmcampod24;
        public FieldDef ltmcampod25;
        public FieldDef ltmcampod26;
        public FieldDef ltmcampod27;
        public FieldDef ltmcampod28;
        public FieldDef ltmcampod29;
        public FieldDef ltmcampod30;
        public FieldDef ltmcampod31;
        public FieldDef ltmcampod32;
        public FieldDef ltmcampod33;
        public FieldDef ltmcampod34;
        public FieldDef ltmcampod35;
        public FieldDef ltmcampod36;
        public FieldDef ltmcampod37;
        public FieldDef ltmcampod38;
        public FieldDef ltmcampod39;
        public FieldDef ltmcampod40;
        public TabListadotmp(String name)
            {
            super(name);
            ltmcodigo = new FieldDef("ltmcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ltmusuario = new FieldDef("ltmusuario",FieldDef.CHAR,25,FieldDef.NOTNULL);
            ltmlistado = new FieldDef("ltmlistado",FieldDef.CHAR,15,FieldDef.NOTNULL);
            ltmempresa = new FieldDef("ltmempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ltmejercicio = new FieldDef("ltmejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ltmcampoa1 = new FieldDef("ltmcampoa1",FieldDef.CHAR,100);
            ltmcampoa2 = new FieldDef("ltmcampoa2",FieldDef.CHAR,100);
            ltmcampoa3 = new FieldDef("ltmcampoa3",FieldDef.CHAR,100);
            ltmcampoa4 = new FieldDef("ltmcampoa4",FieldDef.CHAR,100);
            ltmcampoa5 = new FieldDef("ltmcampoa5",FieldDef.CHAR,100);
            ltmcampoa6 = new FieldDef("ltmcampoa6",FieldDef.CHAR,100);
            ltmcampoa7 = new FieldDef("ltmcampoa7",FieldDef.CHAR,100);
            ltmcampoa8 = new FieldDef("ltmcampoa8",FieldDef.CHAR,100);
            ltmcampoa9 = new FieldDef("ltmcampoa9",FieldDef.CHAR,100);
            ltmcampoa10 = new FieldDef("ltmcampoa10",FieldDef.CHAR,100);
            ltmcampoa11 = new FieldDef("ltmcampoa11",FieldDef.CHAR,100);
            ltmcampoa12 = new FieldDef("ltmcampoa12",FieldDef.CHAR,100);
            ltmcampoa13 = new FieldDef("ltmcampoa13",FieldDef.CHAR,100);
            ltmcampoa14 = new FieldDef("ltmcampoa14",FieldDef.CHAR,100);
            ltmcampoa15 = new FieldDef("ltmcampoa15",FieldDef.CHAR,100);
            ltmcampoa16 = new FieldDef("ltmcampoa16",FieldDef.CHAR,100);
            ltmcampoa17 = new FieldDef("ltmcampoa17",FieldDef.CHAR,100);
            ltmcampoa18 = new FieldDef("ltmcampoa18",FieldDef.CHAR,100);
            ltmcampoa19 = new FieldDef("ltmcampoa19",FieldDef.CHAR,100);
            ltmcampoa20 = new FieldDef("ltmcampoa20",FieldDef.CHAR,100);
            ltmcampoa21 = new FieldDef("ltmcampoa21",FieldDef.CHAR,100);
            ltmcampoa22 = new FieldDef("ltmcampoa22",FieldDef.CHAR,100);
            ltmcampoa23 = new FieldDef("ltmcampoa23",FieldDef.CHAR,100);
            ltmcampoa24 = new FieldDef("ltmcampoa24",FieldDef.CHAR,100);
            ltmcampoa25 = new FieldDef("ltmcampoa25",FieldDef.CHAR,100);
            ltmcampoa26 = new FieldDef("ltmcampoa26",FieldDef.CHAR,100);
            ltmcampoa27 = new FieldDef("ltmcampoa27",FieldDef.CHAR,100);
            ltmcampoa28 = new FieldDef("ltmcampoa28",FieldDef.CHAR,100);
            ltmcampoa29 = new FieldDef("ltmcampoa29",FieldDef.CHAR,100);
            ltmcampoa30 = new FieldDef("ltmcampoa30",FieldDef.CHAR,100);
            ltmcampoa31 = new FieldDef("ltmcampoa31",FieldDef.CHAR,100);
            ltmcampoa32 = new FieldDef("ltmcampoa32",FieldDef.CHAR,100);
            ltmcampoa33 = new FieldDef("ltmcampoa33",FieldDef.CHAR,100);
            ltmcampoa34 = new FieldDef("ltmcampoa34",FieldDef.CHAR,100);
            ltmcampoa35 = new FieldDef("ltmcampoa35",FieldDef.CHAR,100);
            ltmcampoa36 = new FieldDef("ltmcampoa36",FieldDef.CHAR,100);
            ltmcampoa37 = new FieldDef("ltmcampoa37",FieldDef.CHAR,100);
            ltmcampoa38 = new FieldDef("ltmcampoa38",FieldDef.CHAR,100);
            ltmcampoa39 = new FieldDef("ltmcampoa39",FieldDef.CHAR,100);
            ltmcampoa40 = new FieldDef("ltmcampoa40",FieldDef.CHAR,100);
            ltmcampoi1 = new FieldDef("ltmcampoi1",FieldDef.INTEGER,0);
            ltmcampoi2 = new FieldDef("ltmcampoi2",FieldDef.INTEGER,0);
            ltmcampoi3 = new FieldDef("ltmcampoi3",FieldDef.INTEGER,0);
            ltmcampoi4 = new FieldDef("ltmcampoi4",FieldDef.INTEGER,0);
            ltmcampoi5 = new FieldDef("ltmcampoi5",FieldDef.INTEGER,0);
            ltmcampoi6 = new FieldDef("ltmcampoi6",FieldDef.INTEGER,0);
            ltmcampoi7 = new FieldDef("ltmcampoi7",FieldDef.INTEGER,0);
            ltmcampoi8 = new FieldDef("ltmcampoi8",FieldDef.INTEGER,0);
            ltmcampoi9 = new FieldDef("ltmcampoi9",FieldDef.INTEGER,0);
            ltmcampoi10 = new FieldDef("ltmcampoi10",FieldDef.INTEGER,0);
            ltmcampoi11 = new FieldDef("ltmcampoi11",FieldDef.INTEGER,0);
            ltmcampoi12 = new FieldDef("ltmcampoi12",FieldDef.INTEGER,0);
            ltmcampoi13 = new FieldDef("ltmcampoi13",FieldDef.INTEGER,0);
            ltmcampoi14 = new FieldDef("ltmcampoi14",FieldDef.INTEGER,0);
            ltmcampoi15 = new FieldDef("ltmcampoi15",FieldDef.INTEGER,0);
            ltmcampoi16 = new FieldDef("ltmcampoi16",FieldDef.INTEGER,0);
            ltmcampoi17 = new FieldDef("ltmcampoi17",FieldDef.INTEGER,0);
            ltmcampoi18 = new FieldDef("ltmcampoi18",FieldDef.INTEGER,0);
            ltmcampoi19 = new FieldDef("ltmcampoi19",FieldDef.INTEGER,0);
            ltmcampoi20 = new FieldDef("ltmcampoi20",FieldDef.INTEGER,0);
            ltmcampoi21 = new FieldDef("ltmcampoi21",FieldDef.INTEGER,0);
            ltmcampoi22 = new FieldDef("ltmcampoi22",FieldDef.INTEGER,0);
            ltmcampoi23 = new FieldDef("ltmcampoi23",FieldDef.INTEGER,0);
            ltmcampoi24 = new FieldDef("ltmcampoi24",FieldDef.INTEGER,0);
            ltmcampoi25 = new FieldDef("ltmcampoi25",FieldDef.INTEGER,0);
            ltmcampoi26 = new FieldDef("ltmcampoi26",FieldDef.INTEGER,0);
            ltmcampoi27 = new FieldDef("ltmcampoi27",FieldDef.INTEGER,0);
            ltmcampoi28 = new FieldDef("ltmcampoi28",FieldDef.INTEGER,0);
            ltmcampoi29 = new FieldDef("ltmcampoi29",FieldDef.INTEGER,0);
            ltmcampoi30 = new FieldDef("ltmcampoi30",FieldDef.INTEGER,0);
            ltmcampoi31 = new FieldDef("ltmcampoi31",FieldDef.INTEGER,0);
            ltmcampoi32 = new FieldDef("ltmcampoi32",FieldDef.INTEGER,0);
            ltmcampoi33 = new FieldDef("ltmcampoi33",FieldDef.INTEGER,0);
            ltmcampoi34 = new FieldDef("ltmcampoi34",FieldDef.INTEGER,0);
            ltmcampoi35 = new FieldDef("ltmcampoi35",FieldDef.INTEGER,0);
            ltmcampoi36 = new FieldDef("ltmcampoi36",FieldDef.INTEGER,0);
            ltmcampoi37 = new FieldDef("ltmcampoi37",FieldDef.INTEGER,0);
            ltmcampoi38 = new FieldDef("ltmcampoi38",FieldDef.INTEGER,0);
            ltmcampoi39 = new FieldDef("ltmcampoi39",FieldDef.INTEGER,0);
            ltmcampoi40 = new FieldDef("ltmcampoi40",FieldDef.INTEGER,0);
            ltmcampof1 = new FieldDef("ltmcampof1",FieldDef.FLOAT,6,0);
            ltmcampof2 = new FieldDef("ltmcampof2",FieldDef.FLOAT,6,0);
            ltmcampof3 = new FieldDef("ltmcampof3",FieldDef.FLOAT,6,0);
            ltmcampof4 = new FieldDef("ltmcampof4",FieldDef.FLOAT,6,0);
            ltmcampof5 = new FieldDef("ltmcampof5",FieldDef.FLOAT,6,0);
            ltmcampof6 = new FieldDef("ltmcampof6",FieldDef.FLOAT,6,0);
            ltmcampof7 = new FieldDef("ltmcampof7",FieldDef.FLOAT,6,0);
            ltmcampof8 = new FieldDef("ltmcampof8",FieldDef.FLOAT,6,0);
            ltmcampof9 = new FieldDef("ltmcampof9",FieldDef.FLOAT,6,0);
            ltmcampof10 = new FieldDef("ltmcampof10",FieldDef.FLOAT,6,0);
            ltmcampof11 = new FieldDef("ltmcampof11",FieldDef.FLOAT,6,0);
            ltmcampof12 = new FieldDef("ltmcampof12",FieldDef.FLOAT,6,0);
            ltmcampof13 = new FieldDef("ltmcampof13",FieldDef.FLOAT,6,0);
            ltmcampof14 = new FieldDef("ltmcampof14",FieldDef.FLOAT,6,0);
            ltmcampof15 = new FieldDef("ltmcampof15",FieldDef.FLOAT,6,0);
            ltmcampof16 = new FieldDef("ltmcampof16",FieldDef.FLOAT,6,0);
            ltmcampof17 = new FieldDef("ltmcampof17",FieldDef.FLOAT,6,0);
            ltmcampof18 = new FieldDef("ltmcampof18",FieldDef.FLOAT,6,0);
            ltmcampof19 = new FieldDef("ltmcampof19",FieldDef.FLOAT,6,0);
            ltmcampof20 = new FieldDef("ltmcampof20",FieldDef.FLOAT,6,0);
            ltmcampof21 = new FieldDef("ltmcampof21",FieldDef.FLOAT,6,0);
            ltmcampof22 = new FieldDef("ltmcampof22",FieldDef.FLOAT,6,0);
            ltmcampof23 = new FieldDef("ltmcampof23",FieldDef.FLOAT,6,0);
            ltmcampof24 = new FieldDef("ltmcampof24",FieldDef.FLOAT,6,0);
            ltmcampof25 = new FieldDef("ltmcampof25",FieldDef.FLOAT,6,0);
            ltmcampof26 = new FieldDef("ltmcampof26",FieldDef.FLOAT,6,0);
            ltmcampof27 = new FieldDef("ltmcampof27",FieldDef.FLOAT,6,0);
            ltmcampof28 = new FieldDef("ltmcampof28",FieldDef.FLOAT,6,0);
            ltmcampof29 = new FieldDef("ltmcampof29",FieldDef.FLOAT,6,0);
            ltmcampof30 = new FieldDef("ltmcampof30",FieldDef.FLOAT,6,0);
            ltmcampof31 = new FieldDef("ltmcampof31",FieldDef.FLOAT,6,0);
            ltmcampof32 = new FieldDef("ltmcampof32",FieldDef.FLOAT,6,0);
            ltmcampof33 = new FieldDef("ltmcampof33",FieldDef.FLOAT,6,0);
            ltmcampof34 = new FieldDef("ltmcampof34",FieldDef.FLOAT,6,0);
            ltmcampof35 = new FieldDef("ltmcampof35",FieldDef.FLOAT,6,0);
            ltmcampof36 = new FieldDef("ltmcampof36",FieldDef.FLOAT,6,0);
            ltmcampof37 = new FieldDef("ltmcampof37",FieldDef.FLOAT,6,0);
            ltmcampof38 = new FieldDef("ltmcampof38",FieldDef.FLOAT,6,0);
            ltmcampof39 = new FieldDef("ltmcampof39",FieldDef.FLOAT,6,0);
            ltmcampof40 = new FieldDef("ltmcampof40",FieldDef.FLOAT,6,0);
            ltmcampod1 = new FieldDef("ltmcampod1",FieldDef.DATE);
            ltmcampod2 = new FieldDef("ltmcampod2",FieldDef.DATE);
            ltmcampod3 = new FieldDef("ltmcampod3",FieldDef.DATE);
            ltmcampod4 = new FieldDef("ltmcampod4",FieldDef.DATE);
            ltmcampod5 = new FieldDef("ltmcampod5",FieldDef.DATE);
            ltmcampod6 = new FieldDef("ltmcampod6",FieldDef.DATE);
            ltmcampod7 = new FieldDef("ltmcampod7",FieldDef.DATE);
            ltmcampod8 = new FieldDef("ltmcampod8",FieldDef.DATE);
            ltmcampod9 = new FieldDef("ltmcampod9",FieldDef.DATE);
            ltmcampod10 = new FieldDef("ltmcampod10",FieldDef.DATE);
            ltmcampod11 = new FieldDef("ltmcampod11",FieldDef.DATE);
            ltmcampod12 = new FieldDef("ltmcampod12",FieldDef.DATE);
            ltmcampod13 = new FieldDef("ltmcampod13",FieldDef.DATE);
            ltmcampod14 = new FieldDef("ltmcampod14",FieldDef.DATE);
            ltmcampod15 = new FieldDef("ltmcampod15",FieldDef.DATE);
            ltmcampod16 = new FieldDef("ltmcampod16",FieldDef.DATE);
            ltmcampod17 = new FieldDef("ltmcampod17",FieldDef.DATE);
            ltmcampod18 = new FieldDef("ltmcampod18",FieldDef.DATE);
            ltmcampod19 = new FieldDef("ltmcampod19",FieldDef.DATE);
            ltmcampod20 = new FieldDef("ltmcampod20",FieldDef.DATE);
            ltmcampod21 = new FieldDef("ltmcampod21",FieldDef.DATE);
            ltmcampod22 = new FieldDef("ltmcampod22",FieldDef.DATE);
            ltmcampod23 = new FieldDef("ltmcampod23",FieldDef.DATE);
            ltmcampod24 = new FieldDef("ltmcampod24",FieldDef.DATE);
            ltmcampod25 = new FieldDef("ltmcampod25",FieldDef.DATE);
            ltmcampod26 = new FieldDef("ltmcampod26",FieldDef.DATE);
            ltmcampod27 = new FieldDef("ltmcampod27",FieldDef.DATE);
            ltmcampod28 = new FieldDef("ltmcampod28",FieldDef.DATE);
            ltmcampod29 = new FieldDef("ltmcampod29",FieldDef.DATE);
            ltmcampod30 = new FieldDef("ltmcampod30",FieldDef.DATE);
            ltmcampod31 = new FieldDef("ltmcampod31",FieldDef.DATE);
            ltmcampod32 = new FieldDef("ltmcampod32",FieldDef.DATE);
            ltmcampod33 = new FieldDef("ltmcampod33",FieldDef.DATE);
            ltmcampod34 = new FieldDef("ltmcampod34",FieldDef.DATE);
            ltmcampod35 = new FieldDef("ltmcampod35",FieldDef.DATE);
            ltmcampod36 = new FieldDef("ltmcampod36",FieldDef.DATE);
            ltmcampod37 = new FieldDef("ltmcampod37",FieldDef.DATE);
            ltmcampod38 = new FieldDef("ltmcampod38",FieldDef.DATE);
            ltmcampod39 = new FieldDef("ltmcampod39",FieldDef.DATE);
            ltmcampod40 = new FieldDef("ltmcampod40",FieldDef.DATE);
            FieldDef array[] = {
                ltmcodigo,
                ltmusuario,
                ltmlistado,
                ltmempresa,
                ltmejercicio,
                ltmcampoa1,
                ltmcampoa2,
                ltmcampoa3,
                ltmcampoa4,
                ltmcampoa5,
                ltmcampoa6,
                ltmcampoa7,
                ltmcampoa8,
                ltmcampoa9,
                ltmcampoa10,
                ltmcampoa11,
                ltmcampoa12,
                ltmcampoa13,
                ltmcampoa14,
                ltmcampoa15,
                ltmcampoa16,
                ltmcampoa17,
                ltmcampoa18,
                ltmcampoa19,
                ltmcampoa20,
                ltmcampoa21,
                ltmcampoa22,
                ltmcampoa23,
                ltmcampoa24,
                ltmcampoa25,
                ltmcampoa26,
                ltmcampoa27,
                ltmcampoa28,
                ltmcampoa29,
                ltmcampoa30,
                ltmcampoa31,
                ltmcampoa32,
                ltmcampoa33,
                ltmcampoa34,
                ltmcampoa35,
                ltmcampoa36,
                ltmcampoa37,
                ltmcampoa38,
                ltmcampoa39,
                ltmcampoa40,
                ltmcampoi1,
                ltmcampoi2,
                ltmcampoi3,
                ltmcampoi4,
                ltmcampoi5,
                ltmcampoi6,
                ltmcampoi7,
                ltmcampoi8,
                ltmcampoi9,
                ltmcampoi10,
                ltmcampoi11,
                ltmcampoi12,
                ltmcampoi13,
                ltmcampoi14,
                ltmcampoi15,
                ltmcampoi16,
                ltmcampoi17,
                ltmcampoi18,
                ltmcampoi19,
                ltmcampoi20,
                ltmcampoi21,
                ltmcampoi22,
                ltmcampoi23,
                ltmcampoi24,
                ltmcampoi25,
                ltmcampoi26,
                ltmcampoi27,
                ltmcampoi28,
                ltmcampoi29,
                ltmcampoi30,
                ltmcampoi31,
                ltmcampoi32,
                ltmcampoi33,
                ltmcampoi34,
                ltmcampoi35,
                ltmcampoi36,
                ltmcampoi37,
                ltmcampoi38,
                ltmcampoi39,
                ltmcampoi40,
                ltmcampof1,
                ltmcampof2,
                ltmcampof3,
                ltmcampof4,
                ltmcampof5,
                ltmcampof6,
                ltmcampof7,
                ltmcampof8,
                ltmcampof9,
                ltmcampof10,
                ltmcampof11,
                ltmcampof12,
                ltmcampof13,
                ltmcampof14,
                ltmcampof15,
                ltmcampof16,
                ltmcampof17,
                ltmcampof18,
                ltmcampof19,
                ltmcampof20,
                ltmcampof21,
                ltmcampof22,
                ltmcampof23,
                ltmcampof24,
                ltmcampof25,
                ltmcampof26,
                ltmcampof27,
                ltmcampof28,
                ltmcampof29,
                ltmcampof30,
                ltmcampof31,
                ltmcampof32,
                ltmcampof33,
                ltmcampof34,
                ltmcampof35,
                ltmcampof36,
                ltmcampof37,
                ltmcampof38,
                ltmcampof39,
                ltmcampof40,
                ltmcampod1,
                ltmcampod2,
                ltmcampod3,
                ltmcampod4,
                ltmcampod5,
                ltmcampod6,
                ltmcampod7,
                ltmcampod8,
                ltmcampod9,
                ltmcampod10,
                ltmcampod11,
                ltmcampod12,
                ltmcampod13,
                ltmcampod14,
                ltmcampod15,
                ltmcampod16,
                ltmcampod17,
                ltmcampod18,
                ltmcampod19,
                ltmcampod20,
                ltmcampod21,
                ltmcampod22,
                ltmcampod23,
                ltmcampod24,
                ltmcampod25,
                ltmcampod26,
                ltmcampod27,
                ltmcampod28,
                ltmcampod29,
                ltmcampod30,
                ltmcampod31,
                ltmcampod32,
                ltmcampod33,
                ltmcampod34,
                ltmcampod35,
                ltmcampod36,
                ltmcampod37,
                ltmcampod38,
                ltmcampod39,
                ltmcampod40                
                };
            setColumns(array);
            FieldDef arrayf[] = {ltmcodigo };
            setPrimaryKeys(arrayf);
            ltmcodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabConfiginforme extends TableDef
        {
        // campos
        public FieldDef cifempresa;
        public FieldDef cifejercicio;
        public FieldDef cifidcomen;
        public FieldDef cifnumero;
        public FieldDef ciftitulo;
        public FieldDef cifcomen;
        public TabConfiginforme(String name)
            {
            super(name);
            cifempresa = new FieldDef("cifempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            cifejercicio = new FieldDef("cifejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            cifidcomen = new FieldDef("cifidcomen",FieldDef.CHAR,30,FieldDef.NOTNULL);
            cifnumero = new FieldDef("cifnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ciftitulo = new FieldDef("ciftitulo",FieldDef.CHAR,60);
            cifcomen = new FieldDef("cifcomen",FieldDef.CHAR,4000);
            FieldDef array[] = {
                cifempresa,
                cifejercicio,
                cifidcomen,
                cifnumero,
                ciftitulo,
                cifcomen                
                };
            setColumns(array);
            FieldDef arrayf[] = {cifempresa,cifejercicio,cifidcomen,cifnumero };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabExtractotmpcab extends TableDef
        {
        // campos
        public FieldDef etccodigo;
        public FieldDef etcemp;
        public FieldDef etcejer;
        public FieldDef etcdesde;
        public FieldDef etchasta;
        public FieldDef etcusuario;
        public FieldDef etcdesc;
        public FieldDef etccta43;
        public FieldDef etccta43desc;
        public FieldDef etccta43ent;
        public FieldDef etccta43ofi;
        public FieldDef etccta43ccc;
        public FieldDef etcctacble;
        public FieldDef etcsctacble;
        public FieldDef etcfichero;
        public FieldDef etcesfoper;
        public FieldDef etcesfvalor;
        public FieldDef etcvisibles;
        public FieldDef etcfecmodif;
        public FieldDef etctipoconc;
        public TabExtractotmpcab(String name)
            {
            super(name);
            etccodigo = new FieldDef("etccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            etcemp = new FieldDef("etcemp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            etcejer = new FieldDef("etcejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            etcdesde = new FieldDef("etcdesde",FieldDef.DATE);
            etchasta = new FieldDef("etchasta",FieldDef.DATE);
            etcusuario = new FieldDef("etcusuario",FieldDef.CHAR,25,FieldDef.NOTNULL);
            etcdesc = new FieldDef("etcdesc",FieldDef.CHAR,255);
            etccta43 = new FieldDef("etccta43",FieldDef.INTEGER,0);
            etccta43desc = new FieldDef("etccta43desc",FieldDef.CHAR,60);
            etccta43ent = new FieldDef("etccta43ent",FieldDef.CHAR,2);
            etccta43ofi = new FieldDef("etccta43ofi",FieldDef.CHAR,4);
            etccta43ccc = new FieldDef("etccta43ccc",FieldDef.CHAR,10);
            etcctacble = new FieldDef("etcctacble",FieldDef.CHAR,4);
            etcsctacble = new FieldDef("etcsctacble",FieldDef.CHAR,12);
            etcfichero = new FieldDef("etcfichero",FieldDef.CHAR,2000);
            etcesfoper = new FieldDef("etcesfoper",FieldDef.CHAR,1);
            etcesfvalor = new FieldDef("etcesfvalor",FieldDef.CHAR,1);
            etcvisibles = new FieldDef("etcvisibles",FieldDef.CHAR,3);
            etcfecmodif = new FieldDef("etcfecmodif",FieldDef.DATE);
            etctipoconc = new FieldDef("etctipoconc",FieldDef.INTEGER,0);
            FieldDef array[] = {
                etccodigo,
                etcemp,
                etcejer,
                etcdesde,
                etchasta,
                etcusuario,
                etcdesc,
                etccta43,
                etccta43desc,
                etccta43ent,
                etccta43ofi,
                etccta43ccc,
                etcctacble,
                etcsctacble,
                etcfichero,
                etcesfoper,
                etcesfvalor,
                etcvisibles,
                etcfecmodif,
                etctipoconc                
                };
            setColumns(array);
            FieldDef arrayf[] = {etccodigo };
            setPrimaryKeys(arrayf);
            etccodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabExtractotmpdet extends TableDef
        {
        // campos
        public FieldDef etdcodigo;
        public FieldDef etdidmov;
        public FieldDef etdsel;
        public FieldDef etdfecha;
        public FieldDef etdconcepto;
        public FieldDef etdimporte;
        public FieldDef etdcontra;
        public TabExtractotmpdet(String name)
            {
            super(name);
            etdcodigo = new FieldDef("etdcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            etdidmov = new FieldDef("etdidmov",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            etdsel = new FieldDef("etdsel",FieldDef.CHAR,1);
            etdfecha = new FieldDef("etdfecha",FieldDef.DATE);
            etdconcepto = new FieldDef("etdconcepto",FieldDef.CHAR,255);
            etdimporte = new FieldDef("etdimporte",FieldDef.FLOAT,0,2);
            etdcontra = new FieldDef("etdcontra",FieldDef.CHAR,17);
            FieldDef array[] = {
                etdcodigo,
                etdidmov,
                etdsel,
                etdfecha,
                etdconcepto,
                etdimporte,
                etdcontra                
                };
            setColumns(array);
            FieldDef arrayf[] = {etdcodigo,etdidmov };
            setPrimaryKeys(arrayf);
            }
        }
        
    public CatModgen()
        {
        tabgycauto = new TabGycauto("gycauto");
        tabmodelos = new TabModelos("modelos");
        tabcdeflis = new TabCdeflis("cdeflis");
        tabdeflis = new TabDeflis("deflis");
        tabcondlist = new TabCondlist("condlist");
        tabmodestado = new TabModestado("modestado");
        tabmodnifcdp = new TabModnifcdp("modnifcdp");
        tabmodaplic = new TabModaplic("modaplic");
        tabmodprograma = new TabModprograma("modprograma");
        tabpresentador = new TabPresentador("presentador");
        tabimportacion = new TabImportacion("importacion");
        tabimport100200jr = new TabImport100200jr("import100200jr");
        tabtiposunid = new TabTiposunid("tiposunid");
        tabmodirpfc = new TabModirpfc("modirpfc");
        tabmodirpfl = new TabModirpfl("modirpfl");
        tabmodivac = new TabModivac("modivac");
        tabmodival = new TabModival("modival");
        tabmodivac2 = new TabModivac2("modivac2");
        tabmodival2 = new TabModival2("modival2");
        tabmodivaagr = new TabModivaagr("modivaagr");
        tabmodacteo = new TabModacteo("modacteo");
        tabmodirpf = new TabModirpf("modirpf");
        tabmodiva = new TabModiva("modiva");
        tabmoduni = new TabModuni("moduni");
        tabmodagriva = new TabModagriva("modagriva");
        tabpaisaeat = new TabPaisaeat("paisaeat");
        tabpaisterri = new TabPaisterri("paisterri");
        tabbds = new TabBds("bds");
        tabmodirpfagr = new TabModirpfagr("modirpfagr");
        tabvaloresmod = new TabValoresmod("valoresmod");
        tabcodelecmat = new TabCodelecmat("codelecmat");
        tabimportcfg = new TabImportcfg("importcfg");
        tabimportmod = new TabImportmod("importmod");
        tabimportrel = new TabImportrel("importrel");
        tabimporthis = new TabImporthis("importhis");
        tabimportdp = new TabImportdp("importdp");
        tabquefrase = new TabQuefrase("quefrase");
        tabquevariables = new TabQuevariables("quevariables");
        tabquetabla = new TabQuetabla("quetabla");
        tabquecolumn = new TabQuecolumn("quecolumn");
        tabseleccion = new TabSeleccion("seleccion");
        tabppbbcfg = new TabPpbbcfg("ppbbcfg");
        tabppbbbanco = new TabPpbbbanco("ppbbbanco");
        tablogimpmodaff = new TabLogimpmodaff("logimpmodaff");
        tabmod720i = new TabMod720i("mod720i");
        tabmod720m = new TabMod720m("mod720m");
        tabparamlis = new TabParamlis("paramlis");
        tabiffacturas = new TabIffacturas("iffacturas");
        tabdeflis303 = new TabDeflis303("deflis303");
        tabaeatfirmamod = new TabAeatfirmamod("aeatfirmamod");
        tabmodrdtoagr = new TabModrdtoagr("modrdtoagr");
        tabmodingagr = new TabModingagr("modingagr");
        tabdeflis111 = new TabDeflis111("deflis111");
        tabdeflis115 = new TabDeflis115("deflis115");
        tabdeflis123 = new TabDeflis123("deflis123");
        tabdeflis216 = new TabDeflis216("deflis216");
        tabdeflis130 = new TabDeflis130("deflis130");
        tabdeflis131 = new TabDeflis131("deflis131");
        tabdeflis202 = new TabDeflis202("deflis202");
        tabdeflis222 = new TabDeflis222("deflis222");
        tabdeflis308 = new TabDeflis308("deflis308");
        tabdeflis309 = new TabDeflis309("deflis309");
        tabdeflis353 = new TabDeflis353("deflis353");
        tabmodcalendario = new TabModcalendario("modcalendario");
        tabdeflis390 = new TabDeflis390("deflis390");
        tabdeflis282 = new TabDeflis282("deflis282");
        tabmod210r = new TabMod210r("mod210r");
        tabdeflis415 = new TabDeflis415("deflis415");
        tabsiiexpedidas = new TabSiiexpedidas("siiexpedidas");
        tabsiiexpedidasdet = new TabSiiexpedidasdet("siiexpedidasdet");
        tabsiirecibidas = new TabSiirecibidas("siirecibidas");
        tabsiirecibidasdet = new TabSiirecibidasdet("siirecibidasdet");
        tabsiibienesinv = new TabSiibienesinv("siibienesinv");
        tabsiiintracom = new TabSiiintracom("siiintracom");
        tabsiitrascenden = new TabSiitrascenden("siitrascenden");
        tabsiicobros = new TabSiicobros("siicobros");
        tabsiipagos = new TabSiipagos("siipagos");
        tabsiilog = new TabSiilog("siilog");
        tabsiilogdet = new TabSiilogdet("siilogdet");
        tabcerstorage = new TabCerstorage("cerstorage");
        tabcerinfo = new TabCerinfo("cerinfo");
        tabimpexcel = new TabImpexcel("impexcel");
        tabimpexceldef = new TabImpexceldef("impexceldef");
        tabdeflis232 = new TabDeflis232("deflis232");
        tabdeflis20a = new TabDeflis20a("deflis20a");
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
        tablistadotmp = new TabListadotmp("listadotmp");
        tabconfiginforme = new TabConfiginforme("configinforme");
        tabextractotmpcab = new TabExtractotmpcab("extractotmpcab");
        tabextractotmpdet = new TabExtractotmpdet("extractotmpdet");
        TableDef array[] = {
            tabgycauto,
            tabmodelos,
            tabcdeflis,
            tabdeflis,
            tabcondlist,
            tabmodestado,
            tabmodnifcdp,
            tabmodaplic,
            tabmodprograma,
            tabpresentador,
            tabimportacion,
            tabimport100200jr,
            tabtiposunid,
            tabmodirpfc,
            tabmodirpfl,
            tabmodivac,
            tabmodival,
            tabmodivac2,
            tabmodival2,
            tabmodivaagr,
            tabmodacteo,
            tabmodirpf,
            tabmodiva,
            tabmoduni,
            tabmodagriva,
            tabpaisaeat,
            tabpaisterri,
            tabbds,
            tabmodirpfagr,
            tabvaloresmod,
            tabcodelecmat,
            tabimportcfg,
            tabimportmod,
            tabimportrel,
            tabimporthis,
            tabimportdp,
            tabquefrase,
            tabquevariables,
            tabquetabla,
            tabquecolumn,
            tabseleccion,
            tabppbbcfg,
            tabppbbbanco,
            tablogimpmodaff,
            tabmod720i,
            tabmod720m,
            tabparamlis,
            tabiffacturas,
            tabdeflis303,
            tabaeatfirmamod,
            tabmodrdtoagr,
            tabmodingagr,
            tabdeflis111,
            tabdeflis115,
            tabdeflis123,
            tabdeflis216,
            tabdeflis130,
            tabdeflis131,
            tabdeflis202,
            tabdeflis222,
            tabdeflis308,
            tabdeflis309,
            tabdeflis353,
            tabmodcalendario,
            tabdeflis390,
            tabdeflis282,
            tabmod210r,
            tabdeflis415,
            tabsiiexpedidas,
            tabsiiexpedidasdet,
            tabsiirecibidas,
            tabsiirecibidasdet,
            tabsiibienesinv,
            tabsiiintracom,
            tabsiitrascenden,
            tabsiicobros,
            tabsiipagos,
            tabsiilog,
            tabsiilogdet,
            tabcerstorage,
            tabcerinfo,
            tabimpexcel,
            tabimpexceldef,
            tabdeflis232,
            tabdeflis20a,
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
            tabsocis130,
            tablistadotmp,
            tabconfiginforme,
            tabextractotmpcab,
            tabextractotmpdet            
            };
        setTables(array);
        FieldDef tabdeflisArrayf1[] = { tabdeflis.defmodelo,tabdeflis.defhoja,tabdeflis.defejercicio,tabdeflis.defperiodo };
        ForeignKey tabdeflisArrayfk[] = { 
            new ForeignKey(tabcdeflis,tabdeflisArrayf1)            
            };
        tabdeflis.setForeignKeys(tabdeflisArrayfk);
        FieldDef tabcondlistArrayf1[] = { tabcondlist.colmodelo,tabcondlist.colhoja,tabcondlist.colejercicio,tabcondlist.colperiodo };
        FieldDef tabcondlistArrayf2[] = { tabcondlist.colmodelo,tabcondlist.colhoja,tabcondlist.colejercicio,tabcondlist.colperiodo,tabcondlist.colnumero };
        ForeignKey tabcondlistArrayfk[] = { 
            new ForeignKey(tabcdeflis,tabcondlistArrayf1),
            new ForeignKey(tabdeflis,tabcondlistArrayf2)            
            };
        tabcondlist.setForeignKeys(tabcondlistArrayfk);
        FieldDef tabmodnifcdpArrayf1[] = { tabmodnifcdp.mncdominio,tabmodnifcdp.mncmodelo,tabmodnifcdp.mncnif,tabmodnifcdp.mncejercicio,tabmodnifcdp.mncperiodo };
        ForeignKey tabmodnifcdpArrayfk[] = { 
            new ForeignKey(tabmodestado,tabmodnifcdpArrayf1)            
            };
        tabmodnifcdp.setForeignKeys(tabmodnifcdpArrayfk);
        FieldDef tabmodirpfcArrayf1[] = { tabmodirpfc.mictipomaximo };
        ForeignKey tabmodirpfcArrayfk[] = { 
            new ForeignKey(tabtiposunid,tabmodirpfcArrayf1)            
            };
        tabmodirpfc.setForeignKeys(tabmodirpfcArrayfk);
        FieldDef tabmodirpflArrayf1[] = { tabmodirpfl.milejercicio,tabmodirpfl.milepigrafe,tabmodirpfl.milletra };
        FieldDef tabmodirpflArrayf2[] = { tabmodirpfl.miltipo };
        ForeignKey tabmodirpflArrayfk[] = { 
            new ForeignKey(tabmodirpfc,tabmodirpflArrayf1),
            new ForeignKey(tabtiposunid,tabmodirpflArrayf2)            
            };
        tabmodirpfl.setForeignKeys(tabmodirpflArrayfk);
        FieldDef tabmodivacArrayf1[] = { tabmodivac.mvctipomaximo };
        ForeignKey tabmodivacArrayfk[] = { 
            new ForeignKey(tabtiposunid,tabmodivacArrayf1)            
            };
        tabmodivac.setForeignKeys(tabmodivacArrayfk);
        FieldDef tabmodivalArrayf1[] = { tabmodival.mvlejercicio,tabmodival.mvlepigrafe,tabmodival.mvlletra };
        FieldDef tabmodivalArrayf2[] = { tabmodival.mvltipo };
        ForeignKey tabmodivalArrayfk[] = { 
            new ForeignKey(tabmodivac,tabmodivalArrayf1),
            new ForeignKey(tabtiposunid,tabmodivalArrayf2)            
            };
        tabmodival.setForeignKeys(tabmodivalArrayfk);
        FieldDef tabmodivac2Arrayf1[] = { tabmodivac2.mvctipomaximo };
        ForeignKey tabmodivac2Arrayfk[] = { 
            new ForeignKey(tabtiposunid,tabmodivac2Arrayf1)            
            };
        tabmodivac2.setForeignKeys(tabmodivac2Arrayfk);
        FieldDef tabmodival2Arrayf1[] = { tabmodival2.mvlejercicio,tabmodival2.mvlperiodo,tabmodival2.mvlepigrafe,tabmodival2.mvlletra };
        FieldDef tabmodival2Arrayf2[] = { tabmodival2.mvltipo };
        ForeignKey tabmodival2Arrayfk[] = { 
            new ForeignKey(tabmodivac2,tabmodival2Arrayf1),
            new ForeignKey(tabtiposunid,tabmodival2Arrayf2)            
            };
        tabmodival2.setForeignKeys(tabmodival2Arrayfk);
        FieldDef tabmodacteoArrayf1[] = { tabmodacteo.maemodejer,tabmodacteo.maeepigrafe,tabmodacteo.maeletra };
        ForeignKey tabmodacteoArrayfk[] = { 
            new ForeignKey(tabmodivac2,tabmodacteoArrayf1)            
            };
        tabmodacteo.setForeignKeys(tabmodacteoArrayfk);
        FieldDef tabmodirpfArrayf1[] = { tabmodirpf.maidominio,tabmodirpf.mainif,tabmodirpf.maicodigo };
        ForeignKey tabmodirpfArrayfk[] = { 
            new ForeignKey(tabmodacteo,tabmodirpfArrayf1)            
            };
        tabmodirpf.setForeignKeys(tabmodirpfArrayfk);
        FieldDef tabmodivaArrayf1[] = { tabmodiva.mavdominio,tabmodiva.mavnif,tabmodiva.mavcodigo };
        ForeignKey tabmodivaArrayfk[] = { 
            new ForeignKey(tabmodacteo,tabmodivaArrayf1)            
            };
        tabmodiva.setForeignKeys(tabmodivaArrayfk);
        FieldDef tabmoduniArrayf1[] = { tabmoduni.mautipo };
        FieldDef tabmoduniArrayf2[] = { tabmoduni.maudominio,tabmoduni.maunif,tabmoduni.maucodigo };
        ForeignKey tabmoduniArrayfk[] = { 
            new ForeignKey(tabtiposunid,tabmoduniArrayf1),
            new ForeignKey(tabmodacteo,tabmoduniArrayf2)            
            };
        tabmoduni.setForeignKeys(tabmoduniArrayfk);
        FieldDef tabmodagrivaArrayf1[] = { tabmodagriva.maamodejer,tabmodagriva.maaepigrafe };
        ForeignKey tabmodagrivaArrayfk[] = { 
            new ForeignKey(tabmodivaagr,tabmodagrivaArrayf1)            
            };
        tabmodagriva.setForeignKeys(tabmodagrivaArrayfk);
        FieldDef tabsiiexpedidasdetArrayf1[] = { tabsiiexpedidasdet.sixdcodi };
        ForeignKey tabsiiexpedidasdetArrayfk[] = { 
            new ForeignKey(tabsiiexpedidas,tabsiiexpedidasdetArrayf1)            
            };
        tabsiiexpedidasdet.setForeignKeys(tabsiiexpedidasdetArrayfk);
        FieldDef tabsiirecibidasdetArrayf1[] = { tabsiirecibidasdet.sirdcodi };
        ForeignKey tabsiirecibidasdetArrayfk[] = { 
            new ForeignKey(tabsiirecibidas,tabsiirecibidasdetArrayf1)            
            };
        tabsiirecibidasdet.setForeignKeys(tabsiirecibidasdetArrayfk);
        FieldDef tabsiilogdetArrayf1[] = { tabsiilogdet.sildcodi };
        ForeignKey tabsiilogdetArrayfk[] = { 
            new ForeignKey(tabsiilog,tabsiilogdetArrayf1)            
            };
        tabsiilogdet.setForeignKeys(tabsiilogdetArrayfk);
        FieldDef tabimpexceldefArrayf1[] = { tabimpexceldef.iedcodigo };
        ForeignKey tabimpexceldefArrayfk[] = { 
            new ForeignKey(tabimpexcel,tabimpexceldefArrayf1)            
            };
        tabimpexceldef.setForeignKeys(tabimpexceldefArrayfk);
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
        FieldDef tabasientosArrayf4[] = { tabasientos.asicontraconta,tabasientos.asicontrasub };
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
        FieldDef tabcobropagoArrayf4[] = { tabcobropago.cobcuentaban,tabcobropago.cobsubctaban };
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
            new ForeignKey(tabnotas,tabcuentanotaArrayf1)            
            };
        tabcuentanota.setForeignKeys(tabcuentanotaArrayfk);
        FieldDef tabestadoflujoArrayf1[] = { tabestadoflujo.eflempresa };
        ForeignKey tabestadoflujoArrayfk[] = { 
            new ForeignKey(tabempresa,tabestadoflujoArrayf1)            
            };
        tabestadoflujo.setForeignKeys(tabestadoflujoArrayfk);
        FieldDef tabestcampatArrayf1[] = { tabestcampat.ecpempresa };
        ForeignKey tabestcampatArrayfk[] = { 
            new ForeignKey(tabempresa,tabestcampatArrayf1)            
            };
        tabestcampat.setForeignKeys(tabestcampatArrayfk);
        FieldDef tabcalendariodetArrayf1[] = { tabcalendariodet.caldcodigo };
        ForeignKey tabcalendariodetArrayfk[] = { 
            new ForeignKey(tabcalendario,tabcalendariodetArrayf1)            
            };
        tabcalendariodet.setForeignKeys(tabcalendariodetArrayfk);
        FieldDef tabacum130Arrayf1[] = { tabacum130.a130empresa };
        ForeignKey tabacum130Arrayfk[] = { 
            new ForeignKey(tabempresa,tabacum130Arrayf1)            
            };
        tabacum130.setForeignKeys(tabacum130Arrayfk);
        FieldDef tabsocis130Arrayf1[] = { tabsocis130.s130empresa };
        ForeignKey tabsocis130Arrayfk[] = { 
            new ForeignKey(tabempresa,tabsocis130Arrayf1)            
            };
        tabsocis130.setForeignKeys(tabsocis130Arrayfk);
        }
    }
    
