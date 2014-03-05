// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20140305
// Hora:             17:18:40
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
public class CatModgen extends Catalog
  {
  // Tablas
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
  public TabModrdtoagr tabmodrdtoagr;
  public TabModingagr tabmodingagr;
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
    
  public class TabModelos extends TableDef
    {
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
      mesficherotel = new FieldDef("mesficherotel",FieldDef.CHAR,80);
      mestipodecl = new FieldDef("mestipodecl",FieldDef.CHAR,1);
      mesbanco = new FieldDef("mesbanco",FieldDef.INTEGER,0);
      mesficherolote = new FieldDef("mesficherolote",FieldDef.CHAR,80);
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
        mesperentrega        
        };
      setColumns(array);
      FieldDef arrayind1[] = { mesnif };
      FieldDef arrayind2[] = { mesejercicio,mesperiodo,mesestado };
      Index arrayi[] = { 
        new Index("id_mesnif",arrayind1),
        new Index("id_estado",arrayind2)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {mesdominio,mesmodelo,mesnif,mesejercicio,mesperiodo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabModnifcdp extends TableDef
    {
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    
  public class TabTiposunid extends TableDef
    {
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    
  public class TabModirpfagr extends TableDef
    {
    // Campos
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
    
  public class TabModrdtoagr extends TableDef
    {
    // Campos
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
        mraporingven        
        };
      setColumns(array);
      FieldDef arrayf[] = {mraejercicio,mranif,mraactividad };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabModingagr extends TableDef
    {
    // Campos
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
        mnaliqirpf        
        };
      setColumns(array);
      FieldDef arrayf[] = {mnaejercicio,mnanif,mnaactividad,mnacodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabValoresmod extends TableDef
    {
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    
  public class TabSeleccion extends TableDef
    {
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
    // Campos
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
        m720ivalventa        
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
      }
    }
    
  public class TabMod720m extends TableDef
    {
    // Campos
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
        m720msaldmedant        
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
      }
    }
    
  public class TabParamlis extends TableDef
    {
    // Campos
    public FieldDef pardominio;
    public FieldDef parusuario;
    public FieldDef parprograma;
    public FieldDef parlinea;
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
    public FieldDef parcampon51;
    public FieldDef parcampon52;
    public FieldDef parcampon53;
    public FieldDef parcampon54;
    public FieldDef parcampon55;
    public FieldDef parcampon56;
    public FieldDef parcampon57;
    public FieldDef parcampon58;
    public FieldDef parcampon59;
    public FieldDef parcampon60;
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
      parcampoa1 = new FieldDef("parcampoa1",FieldDef.CHAR,80);
      parcampoa2 = new FieldDef("parcampoa2",FieldDef.CHAR,80);
      parcampoa3 = new FieldDef("parcampoa3",FieldDef.CHAR,80);
      parcampoa4 = new FieldDef("parcampoa4",FieldDef.CHAR,80);
      parcampoa5 = new FieldDef("parcampoa5",FieldDef.CHAR,80);
      parcampoa6 = new FieldDef("parcampoa6",FieldDef.CHAR,80);
      parcampoa7 = new FieldDef("parcampoa7",FieldDef.CHAR,80);
      parcampoa8 = new FieldDef("parcampoa8",FieldDef.CHAR,80);
      parcampoa9 = new FieldDef("parcampoa9",FieldDef.CHAR,80);
      parcampoa10 = new FieldDef("parcampoa10",FieldDef.CHAR,80);
      parcampoa11 = new FieldDef("parcampoa11",FieldDef.CHAR,80);
      parcampoa12 = new FieldDef("parcampoa12",FieldDef.CHAR,80);
      parcampoa13 = new FieldDef("parcampoa13",FieldDef.CHAR,80);
      parcampoa14 = new FieldDef("parcampoa14",FieldDef.CHAR,80);
      parcampoa15 = new FieldDef("parcampoa15",FieldDef.CHAR,80);
      parcampoa16 = new FieldDef("parcampoa16",FieldDef.CHAR,80);
      parcampoa17 = new FieldDef("parcampoa17",FieldDef.CHAR,80);
      parcampoa18 = new FieldDef("parcampoa18",FieldDef.CHAR,80);
      parcampoa19 = new FieldDef("parcampoa19",FieldDef.CHAR,80);
      parcampoa20 = new FieldDef("parcampoa20",FieldDef.CHAR,80);
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
      parcampon51 = new FieldDef("parcampon51",FieldDef.FLOAT,6,0);
      parcampon52 = new FieldDef("parcampon52",FieldDef.FLOAT,6,0);
      parcampon53 = new FieldDef("parcampon53",FieldDef.FLOAT,6,0);
      parcampon54 = new FieldDef("parcampon54",FieldDef.FLOAT,6,0);
      parcampon55 = new FieldDef("parcampon55",FieldDef.FLOAT,6,0);
      parcampon56 = new FieldDef("parcampon56",FieldDef.FLOAT,6,0);
      parcampon57 = new FieldDef("parcampon57",FieldDef.FLOAT,6,0);
      parcampon58 = new FieldDef("parcampon58",FieldDef.FLOAT,6,0);
      parcampon59 = new FieldDef("parcampon59",FieldDef.FLOAT,6,0);
      parcampon60 = new FieldDef("parcampon60",FieldDef.FLOAT,6,0);
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
        parcampon51,
        parcampon52,
        parcampon53,
        parcampon54,
        parcampon55,
        parcampon56,
        parcampon57,
        parcampon58,
        parcampon59,
        parcampon60,
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
      FieldDef arrayf[] = {pardominio,parusuario,parprograma,parlinea };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabIffacturas extends TableDef
    {
    // Campos
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
    // Campos
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
    tabmodrdtoagr = new TabModrdtoagr("modrdtoagr");
    tabmodingagr = new TabModingagr("modingagr");
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
      tabmodrdtoagr,
      tabmodingagr,
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
      tabdeflis303      
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
    }
  }
  
