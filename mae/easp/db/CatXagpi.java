// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20130403
// Hora:             16:50:38
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
public class CatXagpi extends Catalog
  {
  // Tablas
  public TabGycauto tabgycauto;
  public TabComuniauton tabcomuniauton;
  public TabProvincia tabprovincia;
  public TabMunicipio tabmunicipio;
  public TabPais tabpais;
  public TabDelhacienda tabdelhacienda;
  public TabAdmhacienda tabadmhacienda;
  public TabBanco tabbanco;
  public TabIdioma tabidioma;
  public TabTexto tabtexto;
  public TabTraduccion tabtraduccion;
  public TabValores tabvalores;
  public TabDatgen tabdatgen;
  public TabGeyce tabgeyce;
  public TabDp tabdp;
  public TabClientedp tabclientedp;
  public TabPoten tabpoten;
  public TabPotenagrup tabpotenagrup;
  public TabFormapago tabformapago;
  public TabUsuario tabusuario;
  public TabAplicacion tabaplicacion;
  public TabProducto tabproducto;
  public TabTarifa tabtarifa;
  public TabFuturasver tabfuturasver;
  public TabRegla tabregla;
  public TabDemo tabdemo;
  public TabManual tabmanual;
  public TabVersion tabversion;
  public TabFaq tabfaq;
  public TabAvisos tabavisos;
  public TabConsulta tabconsulta;
  public TabContratado tabcontratado;
  public TabAsp tabasp;
  public TabUso tabuso;
  public TabFormulario tabformulario;
  public TabEoperfil tabeoperfil;
  public TabConceptogasto tabconceptogasto;
  public TabEoactividad tabeoactividad;
  public TabEoapunte tabeoapunte;
  public TabEotiposiva tabeotiposiva;
  public TabEoacumiva tabeoacumiva;
  public TabEoacumret tabeoacumret;
  public TabLabproductor tablabproductor;
  public TabLabacumula tablabacumula;
  public TabLabfechas tablabfechas;
  public TabLababsentismo tablababsentismo;
  public TabLabdatbanc tablabdatbanc;
  public TabLabpuesto tablabpuesto;
  public TabLabdatcont tablabdatcont;
  public TabLabconcepvar tablabconcepvar;
  public TabLabconvarcdp tablabconvarcdp;
  public TabLabperfil tablabperfil;
  public TabLabproceso tablabproceso;
  public TabLabaccioncdp tablabaccioncdp;
  public TabLabretvar tablabretvar;
  public TabLabcontrato tablabcontrato;
  public TabLabcontvence tablabcontvence;
  public TabLabit tablabit;
  public TabControl tabcontrol;
  public TabPubpdfref tabpubpdfref;
  public TabEntrega tabentrega;
  public TabPartetecnico tabpartetecnico;
  public TabLink tablink;
  public TabGif tabgif;
  public TabAyudatxt tabayudatxt;
  public TabWebtxt tabwebtxt;
  public TabDescarga tabdescarga;
  public TabTransaccion tabtransaccion;
  public TabTransacciondet tabtransacciondet;
  public TabSeminario tabseminario;
  public TabPostit tabpostit;
  public TabCurso tabcurso;
  public TabConvocatorias tabconvocatorias;
  public TabReservas tabreservas;
  public TabEstadis tabestadis;
  public TabCpcomer tabcpcomer;
  public TabComseg tabcomseg;
  public TabObjectius tabobjectius;
  public TabStparams tabstparams;
  public TabEstattec tabestattec;
  public TabServei tabservei;
  public TabServtec tabservtec;
  public TabCampanya tabcampanya;
  public TabCampamir tabcampamir;
  public TabImpactos tabimpactos;
  public TabJars tabjars;
  public TabPartner tabpartner;
  public TabClivoffice tabclivoffice;
  public TabAvisosvistos tabavisosvistos;
  public TabDocspub tabdocspub;
  public TabEnquestes tabenquestes;
  public TabEnqarees tabenqarees;
  public TabEnquesta tabenquesta;
  public TabEnqxclient tabenqxclient;
  public TabEnqxclientdet tabenqxclientdet;
  public TabSeries tabseries;
  public TabOfcomanda tabofcomanda;
  public TabOferta taboferta;
  public TabOfertadet tabofertadet;
  public TabOfertaprojtec tabofertaprojtec;
  public TabOftarifadep taboftarifadep;
  public TabOfdescomptes tabofdescomptes;
  public TabOftartasques taboftartasques;
  public TabDatgennum tabdatgennum;
  public TabFacrebudes tabfacrebudes;
  public TabProveedor tabproveedor;
  public TabIsoaccioncorrec tabisoaccioncorrec;
  public TabIsoncrecsug tabisoncrecsug;
  public TabIsoprocedim tabisoprocedim;
  public TabIsoprocxambit tabisoprocxambit;
  public TabIsoambits tabisoambits;
  public TabPromocion tabpromocion;
  public TabMails tabmails;
  public TabVologpagouso tabvologpagouso;
  public TabEportemdocs tabeportemdocs;
  public TabClimat tabclimat;
  public TabSrvrdwnld tabsrvrdwnld;
  public TabSis_hardware tabsis_hardware;
  public TabVisitas tabvisitas;
  public TabCursos tabcursos;
  public TabIsotemas tabisotemas;
  public TabIsoareasfunc tabisoareasfunc;
  public TabAccmarketing tabaccmarketing;
  public TabAccesoremoto tabaccesoremoto;
  public TabControlicencia tabcontrolicencia;
  public TabActcomer tabactcomer;
  public TabBaixes tabbaixes;
  public TabIsosprintiso tabisosprintiso;
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
      valor = new FieldDef("valor",FieldDef.INTEGER,0);
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
    
  public class TabPais extends TableDef
    {
    // Campos
    public FieldDef picodigo;
    public FieldDef pidesc;
    public FieldDef picodigoaeat;
    public FieldDef picodigoss;
    public TabPais(String name)
      {
      super(name);
      picodigo = new FieldDef("picodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pidesc = new FieldDef("pidesc",FieldDef.CHAR,50);
      picodigoaeat = new FieldDef("picodigoaeat",FieldDef.INTEGER,0);
      picodigoss = new FieldDef("picodigoss",FieldDef.INTEGER,0);
      FieldDef array[] = {
        picodigo,
        pidesc,
        picodigoaeat,
        picodigoss        
        };
      setColumns(array);
      FieldDef arrayf[] = {picodigo };
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
    
  public class TabIdioma extends TableDef
    {
    // Campos
    public FieldDef idcodigo;
    public FieldDef iddescrip;
    public TabIdioma(String name)
      {
      super(name);
      idcodigo = new FieldDef("idcodigo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      iddescrip = new FieldDef("iddescrip",FieldDef.CHAR,15);
      FieldDef array[] = {
        idcodigo,
        iddescrip        
        };
      setColumns(array);
      FieldDef arrayf[] = {idcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTexto extends TableDef
    {
    // Campos
    public FieldDef txiden;
    public FieldDef txtitulo;
    public FieldDef txdescrip;
    public FieldDef txtabla;
    public FieldDef txcampo;
    public FieldDef txfecalta;
    public FieldDef txfecmodif;
    public TabTexto(String name)
      {
      super(name);
      txiden = new FieldDef("txiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      txtitulo = new FieldDef("txtitulo",FieldDef.CHAR,45);
      txdescrip = new FieldDef("txdescrip",FieldDef.CHAR,4000);
      txtabla = new FieldDef("txtabla",FieldDef.CHAR,15);
      txcampo = new FieldDef("txcampo",FieldDef.CHAR,15);
      txfecalta = new FieldDef("txfecalta",FieldDef.DATE);
      txfecmodif = new FieldDef("txfecmodif",FieldDef.DATE);
      FieldDef array[] = {
        txiden,
        txtitulo,
        txdescrip,
        txtabla,
        txcampo,
        txfecalta,
        txfecmodif        
        };
      setColumns(array);
      FieldDef arrayf[] = {txiden };
      setPrimaryKeys(arrayf);
      txiden.setAutoIncrementable(true);
      }
    }
    
  public class TabTraduccion extends TableDef
    {
    // Campos
    public FieldDef ttxtexto;
    public FieldDef ttxidioma;
    public FieldDef ttxtitulo;
    public FieldDef ttxdescrip;
    public FieldDef ttxfecalta;
    public FieldDef ttxfecmodif;
    public TabTraduccion(String name)
      {
      super(name);
      ttxtexto = new FieldDef("ttxtexto",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ttxidioma = new FieldDef("ttxidioma",FieldDef.CHAR,3,FieldDef.NOTNULL);
      ttxtitulo = new FieldDef("ttxtitulo",FieldDef.CHAR,30);
      ttxdescrip = new FieldDef("ttxdescrip",FieldDef.CHAR,4000);
      ttxfecalta = new FieldDef("ttxfecalta",FieldDef.DATE);
      ttxfecmodif = new FieldDef("ttxfecmodif",FieldDef.DATE);
      FieldDef array[] = {
        ttxtexto,
        ttxidioma,
        ttxtitulo,
        ttxdescrip,
        ttxfecalta,
        ttxfecmodif        
        };
      setColumns(array);
      FieldDef arrayf[] = {ttxtexto,ttxidioma };
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
      vadesc = new FieldDef("vadesc",FieldDef.INTEGER,0);
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
    
  public class TabDatgen extends TableDef
    {
    // Campos
    public FieldDef datcodigo;
    public FieldDef datipo;
    public FieldDef datnombre;
    public FieldDef datapell1;
    public FieldDef datapell2;
    public FieldDef datnifcif;
    public FieldDef datsiglas;
    public FieldDef datvia;
    public FieldDef datnum;
    public FieldDef datesc;
    public FieldDef datpiso;
    public FieldDef datletra;
    public FieldDef datpobla;
    public FieldDef datmuni;
    public FieldDef datprov;
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
    public FieldDef datecpos;
    public FieldDef dateatt;
    public FieldDef dataltaen;
    public FieldDef datalias;
    public FieldDef dattel2;
    public FieldDef datmovil;
    public FieldDef datperfil;
    public FieldDef dattipocli;
    public FieldDef datcomer;
    public FieldDef datfuente;
    public FieldDef datcomunicados;
    public FieldDef datactividad;
    public FieldDef datcompetencia;
    public FieldDef dathoraini01;
    public FieldDef datminutoini01;
    public FieldDef dathorafin01;
    public FieldDef datminutofin01;
    public FieldDef dathoraini02;
    public FieldDef datminutoini02;
    public FieldDef dathorafin02;
    public FieldDef datminutofin02;
    public FieldDef dathoraini03;
    public FieldDef datminutoini03;
    public FieldDef dathorafin03;
    public FieldDef datminutofin03;
    public FieldDef datlunestipo;
    public FieldDef datmartestipo;
    public FieldDef datmiercotipo;
    public FieldDef datjuevestipo;
    public FieldDef datviernetipo;
    public FieldDef datsabadotipo;
    public FieldDef datdomingtipo;
    public FieldDef dattipo3desde;
    public FieldDef dattipo3hasta;
    public FieldDef datlvlfactura;
    public FieldDef datimpfactura;
    public FieldDef datlvlrecomen;
    public FieldDef datimprecomen;
    public FieldDef datlvlcompra;
    public FieldDef datultcompra;
    public FieldDef datdistri;
    public TabDatgen(String name)
      {
      super(name);
      datcodigo = new FieldDef("datcodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      datipo = new FieldDef("datipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      datnombre = new FieldDef("datnombre",FieldDef.CHAR,20);
      datapell1 = new FieldDef("datapell1",FieldDef.CHAR,80,FieldDef.NOTNULL);
      datapell2 = new FieldDef("datapell2",FieldDef.CHAR,25);
      datnifcif = new FieldDef("datnifcif",FieldDef.CHAR,15);
      datsiglas = new FieldDef("datsiglas",FieldDef.CHAR,2);
      datvia = new FieldDef("datvia",FieldDef.CHAR,45);
      datnum = new FieldDef("datnum",FieldDef.CHAR,6);
      datesc = new FieldDef("datesc",FieldDef.CHAR,2);
      datpiso = new FieldDef("datpiso",FieldDef.CHAR,6);
      datletra = new FieldDef("datletra",FieldDef.CHAR,2);
      datpobla = new FieldDef("datpobla",FieldDef.CHAR,30);
      datmuni = new FieldDef("datmuni",FieldDef.INTEGER,0);
      datprov = new FieldDef("datprov",FieldDef.INTEGER,0);
      datcpos = new FieldDef("datcpos",FieldDef.CHAR,5);
      dattel = new FieldDef("dattel",FieldDef.CHAR,15);
      datfax = new FieldDef("datfax",FieldDef.CHAR,15);
      datfisicajuri = new FieldDef("datfisicajuri",FieldDef.CHAR,1);
      datemail = new FieldDef("datemail",FieldDef.CHAR,50);
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
      datecpos = new FieldDef("datecpos",FieldDef.CHAR,5);
      dateatt = new FieldDef("dateatt",FieldDef.CHAR,35);
      dataltaen = new FieldDef("dataltaen",FieldDef.CHAR,1);
      datalias = new FieldDef("datalias",FieldDef.CHAR,15);
      dattel2 = new FieldDef("dattel2",FieldDef.CHAR,15);
      datmovil = new FieldDef("datmovil",FieldDef.CHAR,15);
      datperfil = new FieldDef("datperfil",FieldDef.CHAR,2);
      dattipocli = new FieldDef("dattipocli",FieldDef.CHAR,2);
      datcomer = new FieldDef("datcomer",FieldDef.CHAR,20);
      datfuente = new FieldDef("datfuente",FieldDef.CHAR,1);
      datcomunicados = new FieldDef("datcomunicados",FieldDef.CHAR,1);
      datactividad = new FieldDef("datactividad",FieldDef.CHAR,250);
      datcompetencia = new FieldDef("datcompetencia",FieldDef.CHAR,25);
      dathoraini01 = new FieldDef("dathoraini01",FieldDef.INTEGER,0);
      datminutoini01 = new FieldDef("datminutoini01",FieldDef.INTEGER,0);
      dathorafin01 = new FieldDef("dathorafin01",FieldDef.INTEGER,0);
      datminutofin01 = new FieldDef("datminutofin01",FieldDef.INTEGER,0);
      dathoraini02 = new FieldDef("dathoraini02",FieldDef.INTEGER,0);
      datminutoini02 = new FieldDef("datminutoini02",FieldDef.INTEGER,0);
      dathorafin02 = new FieldDef("dathorafin02",FieldDef.INTEGER,0);
      datminutofin02 = new FieldDef("datminutofin02",FieldDef.INTEGER,0);
      dathoraini03 = new FieldDef("dathoraini03",FieldDef.INTEGER,0);
      datminutoini03 = new FieldDef("datminutoini03",FieldDef.INTEGER,0);
      dathorafin03 = new FieldDef("dathorafin03",FieldDef.INTEGER,0);
      datminutofin03 = new FieldDef("datminutofin03",FieldDef.INTEGER,0);
      datlunestipo = new FieldDef("datlunestipo",FieldDef.INTEGER,0);
      datmartestipo = new FieldDef("datmartestipo",FieldDef.INTEGER,0);
      datmiercotipo = new FieldDef("datmiercotipo",FieldDef.INTEGER,0);
      datjuevestipo = new FieldDef("datjuevestipo",FieldDef.INTEGER,0);
      datviernetipo = new FieldDef("datviernetipo",FieldDef.INTEGER,0);
      datsabadotipo = new FieldDef("datsabadotipo",FieldDef.INTEGER,0);
      datdomingtipo = new FieldDef("datdomingtipo",FieldDef.INTEGER,0);
      dattipo3desde = new FieldDef("dattipo3desde",FieldDef.DATE);
      dattipo3hasta = new FieldDef("dattipo3hasta",FieldDef.DATE);
      datlvlfactura = new FieldDef("datlvlfactura",FieldDef.CHAR,1);
      datimpfactura = new FieldDef("datimpfactura",FieldDef.FLOAT,6,0);
      datlvlrecomen = new FieldDef("datlvlrecomen",FieldDef.CHAR,1);
      datimprecomen = new FieldDef("datimprecomen",FieldDef.FLOAT,6,0);
      datlvlcompra = new FieldDef("datlvlcompra",FieldDef.CHAR,1);
      datultcompra = new FieldDef("datultcompra",FieldDef.DATE);
      datdistri = new FieldDef("datdistri",FieldDef.CHAR,12);
      FieldDef array[] = {
        datcodigo,
        datipo,
        datnombre,
        datapell1,
        datapell2,
        datnifcif,
        datsiglas,
        datvia,
        datnum,
        datesc,
        datpiso,
        datletra,
        datpobla,
        datmuni,
        datprov,
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
        datecpos,
        dateatt,
        dataltaen,
        datalias,
        dattel2,
        datmovil,
        datperfil,
        dattipocli,
        datcomer,
        datfuente,
        datcomunicados,
        datactividad,
        datcompetencia,
        dathoraini01,
        datminutoini01,
        dathorafin01,
        datminutofin01,
        dathoraini02,
        datminutoini02,
        dathorafin02,
        datminutofin02,
        dathoraini03,
        datminutoini03,
        dathorafin03,
        datminutofin03,
        datlunestipo,
        datmartestipo,
        datmiercotipo,
        datjuevestipo,
        datviernetipo,
        datsabadotipo,
        datdomingtipo,
        dattipo3desde,
        dattipo3hasta,
        datlvlfactura,
        datimpfactura,
        datlvlrecomen,
        datimprecomen,
        datlvlcompra,
        datultcompra,
        datdistri        
        };
      setColumns(array);
      FieldDef arrayf[] = {datcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabGeyce extends TableDef
    {
    // Campos
    public FieldDef gecodigo;
    public FieldDef gediascarencia;
    public FieldDef gediasvisacdp;
    public FieldDef gediasvisadp;
    public FieldDef geidioma;
    public FieldDef geivadef;
    public FieldDef genumfac;
    public FieldDef gectaqaf;
    public FieldDef gectams;
    public FieldDef gectavaf;
    public TabGeyce(String name)
      {
      super(name);
      gecodigo = new FieldDef("gecodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      gediascarencia = new FieldDef("gediascarencia",FieldDef.INTEGER,0);
      gediasvisacdp = new FieldDef("gediasvisacdp",FieldDef.INTEGER,0);
      gediasvisadp = new FieldDef("gediasvisadp",FieldDef.INTEGER,0);
      geidioma = new FieldDef("geidioma",FieldDef.CHAR,3);
      geivadef = new FieldDef("geivadef",FieldDef.FLOAT,6,0);
      genumfac = new FieldDef("genumfac",FieldDef.INTEGER,0);
      gectaqaf = new FieldDef("gectaqaf",FieldDef.CHAR,12);
      gectams = new FieldDef("gectams",FieldDef.CHAR,12);
      gectavaf = new FieldDef("gectavaf",FieldDef.CHAR,12);
      FieldDef array[] = {
        gecodigo,
        gediascarencia,
        gediasvisacdp,
        gediasvisadp,
        geidioma,
        geivadef,
        genumfac,
        gectaqaf,
        gectams,
        gectavaf        
        };
      setColumns(array);
      FieldDef arrayf[] = {gecodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDp extends TableDef
    {
    // Campos
    public FieldDef dpcodigo;
    public FieldDef dptipoaltascli;
    public FieldDef dpfechaalta;
    public FieldDef dpfechafin;
    public FieldDef dpdiascarencia;
    public FieldDef dpbloqueo;
    public FieldDef dpunidisp;
    public FieldDef dpafinity;
    public FieldDef dpnivellafinity;
    public FieldDef dpobjfec;
    public FieldDef dpobjmir;
    public FieldDef dpobjelab;
    public FieldDef dpobjelib;
    public FieldDef dpobjeacum;
    public FieldDef dpobjefactur;
    public FieldDef dpobjeconta;
    public FieldDef dpobjcdps;
    public FieldDef dptotmir;
    public FieldDef dptotelab;
    public FieldDef dptotelib;
    public FieldDef dptoteacum;
    public FieldDef dptotefactur;
    public FieldDef dptoteconta;
    public FieldDef dptotcdps;
    public FieldDef dpfecharev;
    public FieldDef dpobservaciones;
    public FieldDef dpestimorigen;
    public FieldDef dpestimsw;
    public FieldDef dpestimhw;
    public FieldDef dpprimario;
    public TabDp(String name)
      {
      super(name);
      dpcodigo = new FieldDef("dpcodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dptipoaltascli = new FieldDef("dptipoaltascli",FieldDef.CHAR,1);
      dpfechaalta = new FieldDef("dpfechaalta",FieldDef.DATE);
      dpfechafin = new FieldDef("dpfechafin",FieldDef.DATE);
      dpdiascarencia = new FieldDef("dpdiascarencia",FieldDef.INTEGER,0);
      dpbloqueo = new FieldDef("dpbloqueo",FieldDef.CHAR,1);
      dpunidisp = new FieldDef("dpunidisp",FieldDef.INTEGER,0);
      dpafinity = new FieldDef("dpafinity",FieldDef.CHAR,10);
      dpnivellafinity = new FieldDef("dpnivellafinity",FieldDef.INTEGER,0);
      dpobjfec = new FieldDef("dpobjfec",FieldDef.DATE);
      dpobjmir = new FieldDef("dpobjmir",FieldDef.INTEGER,0);
      dpobjelab = new FieldDef("dpobjelab",FieldDef.INTEGER,0);
      dpobjelib = new FieldDef("dpobjelib",FieldDef.INTEGER,0);
      dpobjeacum = new FieldDef("dpobjeacum",FieldDef.INTEGER,0);
      dpobjefactur = new FieldDef("dpobjefactur",FieldDef.INTEGER,0);
      dpobjeconta = new FieldDef("dpobjeconta",FieldDef.INTEGER,0);
      dpobjcdps = new FieldDef("dpobjcdps",FieldDef.INTEGER,0);
      dptotmir = new FieldDef("dptotmir",FieldDef.INTEGER,0);
      dptotelab = new FieldDef("dptotelab",FieldDef.INTEGER,0);
      dptotelib = new FieldDef("dptotelib",FieldDef.INTEGER,0);
      dptoteacum = new FieldDef("dptoteacum",FieldDef.INTEGER,0);
      dptotefactur = new FieldDef("dptotefactur",FieldDef.INTEGER,0);
      dptoteconta = new FieldDef("dptoteconta",FieldDef.INTEGER,0);
      dptotcdps = new FieldDef("dptotcdps",FieldDef.INTEGER,0);
      dpfecharev = new FieldDef("dpfecharev",FieldDef.DATE);
      dpobservaciones = new FieldDef("dpobservaciones",FieldDef.CHAR,4000);
      dpestimorigen = new FieldDef("dpestimorigen",FieldDef.CHAR,1);
      dpestimsw = new FieldDef("dpestimsw",FieldDef.FLOAT,6,0);
      dpestimhw = new FieldDef("dpestimhw",FieldDef.FLOAT,6,0);
      dpprimario = new FieldDef("dpprimario",FieldDef.CHAR,12);
      FieldDef array[] = {
        dpcodigo,
        dptipoaltascli,
        dpfechaalta,
        dpfechafin,
        dpdiascarencia,
        dpbloqueo,
        dpunidisp,
        dpafinity,
        dpnivellafinity,
        dpobjfec,
        dpobjmir,
        dpobjelab,
        dpobjelib,
        dpobjeacum,
        dpobjefactur,
        dpobjeconta,
        dpobjcdps,
        dptotmir,
        dptotelab,
        dptotelib,
        dptoteacum,
        dptotefactur,
        dptoteconta,
        dptotcdps,
        dpfecharev,
        dpobservaciones,
        dpestimorigen,
        dpestimsw,
        dpestimhw,
        dpprimario        
        };
      setColumns(array);
      FieldDef arrayf[] = {dpcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabClientedp extends TableDef
    {
    // Campos
    public FieldDef clicodigo;
    public FieldDef clidpcodigo;
    public FieldDef cliafacturar;
    public FieldDef clifechaalta;
    public FieldDef clifechafin;
    public FieldDef clibloqueo;
    public FieldDef clibloqueodp;
    public TabClientedp(String name)
      {
      super(name);
      clicodigo = new FieldDef("clicodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      clidpcodigo = new FieldDef("clidpcodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cliafacturar = new FieldDef("cliafacturar",FieldDef.CHAR,12);
      clifechaalta = new FieldDef("clifechaalta",FieldDef.DATE);
      clifechafin = new FieldDef("clifechafin",FieldDef.DATE);
      clibloqueo = new FieldDef("clibloqueo",FieldDef.CHAR,1);
      clibloqueodp = new FieldDef("clibloqueodp",FieldDef.CHAR,1);
      FieldDef array[] = {
        clicodigo,
        clidpcodigo,
        cliafacturar,
        clifechaalta,
        clifechafin,
        clibloqueo,
        clibloqueodp        
        };
      setColumns(array);
      FieldDef arrayf[] = {clicodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPoten extends TableDef
    {
    // Campos
    public FieldDef pocodigo;
    public FieldDef pofechareg;
    public TabPoten(String name)
      {
      super(name);
      pocodigo = new FieldDef("pocodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pofechareg = new FieldDef("pofechareg",FieldDef.DATE);
      FieldDef array[] = {
        pocodigo,
        pofechareg        
        };
      setColumns(array);
      FieldDef arrayf[] = {pocodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPotenagrup extends TableDef
    {
    // Campos
    public FieldDef paident;
    public FieldDef pacodigo;
    public FieldDef paagrup;
    public FieldDef pacomer;
    public FieldDef paestado;
    public FieldDef pafechaest;
    public FieldDef pacorreoult;
    public FieldDef paselec;
    public TabPotenagrup(String name)
      {
      super(name);
      paident = new FieldDef("paident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pacodigo = new FieldDef("pacodigo",FieldDef.CHAR,12);
      paagrup = new FieldDef("paagrup",FieldDef.CHAR,10);
      pacomer = new FieldDef("pacomer",FieldDef.CHAR,20);
      paestado = new FieldDef("paestado",FieldDef.CHAR,1);
      pafechaest = new FieldDef("pafechaest",FieldDef.DATE);
      pacorreoult = new FieldDef("pacorreoult",FieldDef.INTEGER,0);
      paselec = new FieldDef("paselec",FieldDef.CHAR,1);
      FieldDef array[] = {
        paident,
        pacodigo,
        paagrup,
        pacomer,
        paestado,
        pafechaest,
        pacorreoult,
        paselec        
        };
      setColumns(array);
      FieldDef arrayf[] = {paident };
      setPrimaryKeys(arrayf);
      paident.setAutoIncrementable(true);
      }
    }
    
  public class TabFormapago extends TableDef
    {
    // Campos
    public FieldDef fpcodigo;
    public FieldDef fpformapago;
    public FieldDef fpdiapago;
    public FieldDef fpbanco;
    public FieldDef fpagencia;
    public FieldDef fpcc;
    public FieldDef fpccdc;
    public FieldDef fpvinum;
    public FieldDef fpvinombre;
    public FieldDef fpvivia;
    public FieldDef fpvicad;
    public FieldDef fpperiodos;
    public FieldDef fpiva;
    public FieldDef fptransac;
    public FieldDef fpsubcuenta;
    public FieldDef fpclifacven;
    public FieldDef fpclifacmante;
    public FieldDef fpclirecequi;
    public FieldDef fpavisar;
    public FieldDef fpobservaciones;
    public TabFormapago(String name)
      {
      super(name);
      fpcodigo = new FieldDef("fpcodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      fpformapago = new FieldDef("fpformapago",FieldDef.CHAR,2,FieldDef.NOTNULL);
      fpdiapago = new FieldDef("fpdiapago",FieldDef.INTEGER,0);
      fpbanco = new FieldDef("fpbanco",FieldDef.INTEGER,0);
      fpagencia = new FieldDef("fpagencia",FieldDef.INTEGER,0);
      fpcc = new FieldDef("fpcc",FieldDef.CHAR,12);
      fpccdc = new FieldDef("fpccdc",FieldDef.CHAR,2);
      fpvinum = new FieldDef("fpvinum",FieldDef.CHAR,16);
      fpvinombre = new FieldDef("fpvinombre",FieldDef.CHAR,45);
      fpvivia = new FieldDef("fpvivia",FieldDef.CHAR,45);
      fpvicad = new FieldDef("fpvicad",FieldDef.DATE);
      fpperiodos = new FieldDef("fpperiodos",FieldDef.INTEGER,0);
      fpiva = new FieldDef("fpiva",FieldDef.FLOAT,6,0);
      fptransac = new FieldDef("fptransac",FieldDef.CHAR,40);
      fpsubcuenta = new FieldDef("fpsubcuenta",FieldDef.CHAR,15);
      fpclifacven = new FieldDef("fpclifacven",FieldDef.CHAR,12);
      fpclifacmante = new FieldDef("fpclifacmante",FieldDef.CHAR,12);
      fpclirecequi = new FieldDef("fpclirecequi",FieldDef.FLOAT,6,0);
      fpavisar = new FieldDef("fpavisar",FieldDef.CHAR,1);
      fpobservaciones = new FieldDef("fpobservaciones",FieldDef.CHAR,2000);
      FieldDef array[] = {
        fpcodigo,
        fpformapago,
        fpdiapago,
        fpbanco,
        fpagencia,
        fpcc,
        fpccdc,
        fpvinum,
        fpvinombre,
        fpvivia,
        fpvicad,
        fpperiodos,
        fpiva,
        fptransac,
        fpsubcuenta,
        fpclifacven,
        fpclifacmante,
        fpclirecequi,
        fpavisar,
        fpobservaciones        
        };
      setColumns(array);
      FieldDef arrayf[] = {fpcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabUsuario extends TableDef
    {
    // Campos
    public FieldDef uscodigo;
    public FieldDef usalias;
    public FieldDef usnombre;
    public FieldDef usemail;
    public FieldDef usidioma;
    public FieldDef usmovil;
    public FieldDef uscargo;
    public FieldDef usdepar;
    public FieldDef uspwd;
    public FieldDef usisadmin;
    public FieldDef usayudavisible;
    public FieldDef ussaldo;
    public FieldDef usremoto;
    public TabUsuario(String name)
      {
      super(name);
      uscodigo = new FieldDef("uscodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      usalias = new FieldDef("usalias",FieldDef.CHAR,20,FieldDef.NOTNULL);
      usnombre = new FieldDef("usnombre",FieldDef.CHAR,45);
      usemail = new FieldDef("usemail",FieldDef.CHAR,50);
      usidioma = new FieldDef("usidioma",FieldDef.CHAR,3);
      usmovil = new FieldDef("usmovil",FieldDef.CHAR,12);
      uscargo = new FieldDef("uscargo",FieldDef.CHAR,20);
      usdepar = new FieldDef("usdepar",FieldDef.CHAR,20);
      uspwd = new FieldDef("uspwd",FieldDef.CHAR,50);
      usisadmin = new FieldDef("usisadmin",FieldDef.CHAR,1);
      usayudavisible = new FieldDef("usayudavisible",FieldDef.CHAR,1);
      ussaldo = new FieldDef("ussaldo",FieldDef.INTEGER,0);
      usremoto = new FieldDef("usremoto",FieldDef.CHAR,1);
      FieldDef array[] = {
        uscodigo,
        usalias,
        usnombre,
        usemail,
        usidioma,
        usmovil,
        uscargo,
        usdepar,
        uspwd,
        usisadmin,
        usayudavisible,
        ussaldo,
        usremoto        
        };
      setColumns(array);
      FieldDef arrayf[] = {uscodigo,usalias };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAplicacion extends TableDef
    {
    // Campos
    public FieldDef apalias;
    public FieldDef apdescrip;
    public FieldDef aptipo;
    public FieldDef apresp;
    public FieldDef approves;
    public FieldDef apvigent;
    public FieldDef apclient;
    public TabAplicacion(String name)
      {
      super(name);
      apalias = new FieldDef("apalias",FieldDef.CHAR,8,FieldDef.NOTNULL);
      apdescrip = new FieldDef("apdescrip",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aptipo = new FieldDef("aptipo",FieldDef.CHAR,1);
      apresp = new FieldDef("apresp",FieldDef.CHAR,20);
      approves = new FieldDef("approves",FieldDef.CHAR,20);
      apvigent = new FieldDef("apvigent",FieldDef.CHAR,1);
      apclient = new FieldDef("apclient",FieldDef.CHAR,12);
      FieldDef array[] = {
        apalias,
        apdescrip,
        aptipo,
        apresp,
        approves,
        apvigent,
        apclient        
        };
      setColumns(array);
      FieldDef arrayf[] = {apalias };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabProducto extends TableDef
    {
    // Campos
    public FieldDef proalias;
    public FieldDef prodesc;
    public FieldDef proambito;
    public FieldDef procontratable;
    public FieldDef proprecio;
    public FieldDef promante;
    public FieldDef properiodo;
    public FieldDef proaplicacion;
    public TabProducto(String name)
      {
      super(name);
      proalias = new FieldDef("proalias",FieldDef.CHAR,15,FieldDef.NOTNULL);
      prodesc = new FieldDef("prodesc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      proambito = new FieldDef("proambito",FieldDef.CHAR,1);
      procontratable = new FieldDef("procontratable",FieldDef.CHAR,1);
      proprecio = new FieldDef("proprecio",FieldDef.FLOAT,6,0);
      promante = new FieldDef("promante",FieldDef.CHAR,1);
      properiodo = new FieldDef("properiodo",FieldDef.INTEGER,0);
      proaplicacion = new FieldDef("proaplicacion",FieldDef.CHAR,8);
      FieldDef array[] = {
        proalias,
        prodesc,
        proambito,
        procontratable,
        proprecio,
        promante,
        properiodo,
        proaplicacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {proalias };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTarifa extends TableDef
    {
    // Campos
    public FieldDef tarcodigo;
    public FieldDef tardesc;
    public FieldDef tardescopcion;
    public FieldDef tarproducto;
    public FieldDef tarprecio;
    public FieldDef tartemante;
    public FieldDef tarvacontratado;
    public FieldDef tarcanviversio;
    public FieldDef tarsubcuenta;
    public FieldDef tarvigenciaini;
    public FieldDef tarvigenciafin;
    public TabTarifa(String name)
      {
      super(name);
      tarcodigo = new FieldDef("tarcodigo",FieldDef.CHAR,10,FieldDef.NOTNULL);
      tardesc = new FieldDef("tardesc",FieldDef.CHAR,80);
      tardescopcion = new FieldDef("tardescopcion",FieldDef.CHAR,45);
      tarproducto = new FieldDef("tarproducto",FieldDef.CHAR,15);
      tarprecio = new FieldDef("tarprecio",FieldDef.FLOAT,6,0);
      tartemante = new FieldDef("tartemante",FieldDef.CHAR,1);
      tarvacontratado = new FieldDef("tarvacontratado",FieldDef.CHAR,1);
      tarcanviversio = new FieldDef("tarcanviversio",FieldDef.CHAR,1);
      tarsubcuenta = new FieldDef("tarsubcuenta",FieldDef.CHAR,12);
      tarvigenciaini = new FieldDef("tarvigenciaini",FieldDef.DATE);
      tarvigenciafin = new FieldDef("tarvigenciafin",FieldDef.DATE);
      FieldDef array[] = {
        tarcodigo,
        tardesc,
        tardescopcion,
        tarproducto,
        tarprecio,
        tartemante,
        tarvacontratado,
        tarcanviversio,
        tarsubcuenta,
        tarvigenciaini,
        tarvigenciafin        
        };
      setColumns(array);
      FieldDef arrayf[] = {tarcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabFuturasver extends TableDef
    {
    // Campos
    public FieldDef fuiden;
    public FieldDef fuproducto;
    public FieldDef fuversion;
    public FieldDef futipo;
    public FieldDef fudescrip;
    public FieldDef fufechareg;
    public FieldDef fufechaprev;
    public FieldDef fufechadisp;
    public FieldDef fuaplicacion;
    public FieldDef fuprioridad;
    public TabFuturasver(String name)
      {
      super(name);
      fuiden = new FieldDef("fuiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fuproducto = new FieldDef("fuproducto",FieldDef.CHAR,15,FieldDef.NOTNULL);
      fuversion = new FieldDef("fuversion",FieldDef.CHAR,7,FieldDef.NOTNULL);
      futipo = new FieldDef("futipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      fudescrip = new FieldDef("fudescrip",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fufechareg = new FieldDef("fufechareg",FieldDef.DATE);
      fufechaprev = new FieldDef("fufechaprev",FieldDef.DATE);
      fufechadisp = new FieldDef("fufechadisp",FieldDef.DATE);
      fuaplicacion = new FieldDef("fuaplicacion",FieldDef.CHAR,8);
      fuprioridad = new FieldDef("fuprioridad",FieldDef.INTEGER,0);
      FieldDef array[] = {
        fuiden,
        fuproducto,
        fuversion,
        futipo,
        fudescrip,
        fufechareg,
        fufechaprev,
        fufechadisp,
        fuaplicacion,
        fuprioridad        
        };
      setColumns(array);
      FieldDef arrayf[] = {fuiden };
      setPrimaryKeys(arrayf);
      fuiden.setAutoIncrementable(true);
      }
    }
    
  public class TabRegla extends TableDef
    {
    // Campos
    public FieldDef retipo;
    public FieldDef reiden;
    public FieldDef recontador;
    public FieldDef reemisor;
    public FieldDef reemiuser;
    public FieldDef reambito;
    public FieldDef reproducto;
    public FieldDef redestino;
    public FieldDef redesuser;
    public FieldDef reestado;
    public FieldDef reurgencia;
    public TabRegla(String name)
      {
      super(name);
      retipo = new FieldDef("retipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      reiden = new FieldDef("reiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      recontador = new FieldDef("recontador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      reemisor = new FieldDef("reemisor",FieldDef.CHAR,12,FieldDef.NOTNULL);
      reemiuser = new FieldDef("reemiuser",FieldDef.CHAR,20);
      reambito = new FieldDef("reambito",FieldDef.CHAR,1);
      reproducto = new FieldDef("reproducto",FieldDef.CHAR,15);
      redestino = new FieldDef("redestino",FieldDef.CHAR,12);
      redesuser = new FieldDef("redesuser",FieldDef.CHAR,20);
      reestado = new FieldDef("reestado",FieldDef.CHAR,1);
      reurgencia = new FieldDef("reurgencia",FieldDef.CHAR,1);
      FieldDef array[] = {
        retipo,
        reiden,
        recontador,
        reemisor,
        reemiuser,
        reambito,
        reproducto,
        redestino,
        redesuser,
        reestado,
        reurgencia        
        };
      setColumns(array);
      FieldDef arrayf[] = {retipo,reiden,recontador };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDemo extends TableDef
    {
    // Campos
    public FieldDef deiden;
    public FieldDef decodigo;
    public FieldDef dedesc;
    public FieldDef deproducto;
    public FieldDef defechaalta;
    public FieldDef devisible;
    public TabDemo(String name)
      {
      super(name);
      deiden = new FieldDef("deiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      decodigo = new FieldDef("decodigo",FieldDef.CHAR,7);
      dedesc = new FieldDef("dedesc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      deproducto = new FieldDef("deproducto",FieldDef.CHAR,15,FieldDef.NOTNULL);
      defechaalta = new FieldDef("defechaalta",FieldDef.DATE);
      devisible = new FieldDef("devisible",FieldDef.CHAR,1);
      FieldDef array[] = {
        deiden,
        decodigo,
        dedesc,
        deproducto,
        defechaalta,
        devisible        
        };
      setColumns(array);
      FieldDef arrayf[] = {deiden };
      setPrimaryKeys(arrayf);
      deiden.setAutoIncrementable(true);
      }
    }
    
  public class TabManual extends TableDef
    {
    // Campos
    public FieldDef maiden;
    public FieldDef maref;
    public FieldDef maproducto;
    public FieldDef madesc;
    public FieldDef maversion;
    public FieldDef mafechadisp;
    public FieldDef mavisible;
    public TabManual(String name)
      {
      super(name);
      maiden = new FieldDef("maiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      maref = new FieldDef("maref",FieldDef.CHAR,7,FieldDef.NOTNULL);
      maproducto = new FieldDef("maproducto",FieldDef.CHAR,15,FieldDef.NOTNULL);
      madesc = new FieldDef("madesc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      maversion = new FieldDef("maversion",FieldDef.CHAR,7);
      mafechadisp = new FieldDef("mafechadisp",FieldDef.DATE);
      mavisible = new FieldDef("mavisible",FieldDef.CHAR,1);
      FieldDef array[] = {
        maiden,
        maref,
        maproducto,
        madesc,
        maversion,
        mafechadisp,
        mavisible        
        };
      setColumns(array);
      FieldDef arrayf[] = {maiden };
      setPrimaryKeys(arrayf);
      maiden.setAutoIncrementable(true);
      }
    }
    
  public class TabVersion extends TableDef
    {
    // Campos
    public FieldDef veiden;
    public FieldDef vepaquete;
    public FieldDef veproducto;
    public FieldDef vedesc;
    public FieldDef vefechadisp;
    public FieldDef vefechacad;
    public FieldDef vevisible;
    public FieldDef vetipo;
    public FieldDef veplazo;
    public TabVersion(String name)
      {
      super(name);
      veiden = new FieldDef("veiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      vepaquete = new FieldDef("vepaquete",FieldDef.CHAR,7,FieldDef.NOTNULL);
      veproducto = new FieldDef("veproducto",FieldDef.CHAR,15,FieldDef.NOTNULL);
      vedesc = new FieldDef("vedesc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      vefechadisp = new FieldDef("vefechadisp",FieldDef.DATE);
      vefechacad = new FieldDef("vefechacad",FieldDef.DATE);
      vevisible = new FieldDef("vevisible",FieldDef.CHAR,1);
      vetipo = new FieldDef("vetipo",FieldDef.CHAR,1);
      veplazo = new FieldDef("veplazo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        veiden,
        vepaquete,
        veproducto,
        vedesc,
        vefechadisp,
        vefechacad,
        vevisible,
        vetipo,
        veplazo        
        };
      setColumns(array);
      FieldDef arrayf[] = {veiden };
      setPrimaryKeys(arrayf);
      veiden.setAutoIncrementable(true);
      }
    }
    
  public class TabFaq extends TableDef
    {
    // Campos
    public FieldDef faqiden;
    public FieldDef faqtipo;
    public FieldDef faqproducto;
    public FieldDef faqproceso;
    public FieldDef faqversion;
    public FieldDef faqfechareg;
    public FieldDef faqpregunta;
    public FieldDef faqrespuesta;
    public FieldDef faqversionsol;
    public FieldDef faqprioridad;
    public FieldDef faqfechacad;
    public FieldDef faqnaccesos;
    public FieldDef faqaplicacion;
    public FieldDef faqtecnico;
    public FieldDef faqcontext;
    public FieldDef faqprograma;
    public TabFaq(String name)
      {
      super(name);
      faqiden = new FieldDef("faqiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      faqtipo = new FieldDef("faqtipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      faqproducto = new FieldDef("faqproducto",FieldDef.CHAR,15);
      faqproceso = new FieldDef("faqproceso",FieldDef.CHAR,20);
      faqversion = new FieldDef("faqversion",FieldDef.CHAR,7);
      faqfechareg = new FieldDef("faqfechareg",FieldDef.DATE);
      faqpregunta = new FieldDef("faqpregunta",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      faqrespuesta = new FieldDef("faqrespuesta",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      faqversionsol = new FieldDef("faqversionsol",FieldDef.CHAR,7);
      faqprioridad = new FieldDef("faqprioridad",FieldDef.INTEGER,0);
      faqfechacad = new FieldDef("faqfechacad",FieldDef.DATE);
      faqnaccesos = new FieldDef("faqnaccesos",FieldDef.INTEGER,0);
      faqaplicacion = new FieldDef("faqaplicacion",FieldDef.CHAR,8);
      faqtecnico = new FieldDef("faqtecnico",FieldDef.CHAR,20);
      faqcontext = new FieldDef("faqcontext",FieldDef.CHAR,60);
      faqprograma = new FieldDef("faqprograma",FieldDef.CHAR,15);
      FieldDef array[] = {
        faqiden,
        faqtipo,
        faqproducto,
        faqproceso,
        faqversion,
        faqfechareg,
        faqpregunta,
        faqrespuesta,
        faqversionsol,
        faqprioridad,
        faqfechacad,
        faqnaccesos,
        faqaplicacion,
        faqtecnico,
        faqcontext,
        faqprograma        
        };
      setColumns(array);
      FieldDef arrayf[] = {faqiden };
      setPrimaryKeys(arrayf);
      faqiden.setAutoIncrementable(true);
      }
    }
    
  public class TabAvisos extends TableDef
    {
    // Campos
    public FieldDef aviden;
    public FieldDef avtexto;
    public FieldDef avfechacre;
    public FieldDef avfechavis;
    public FieldDef avfechalim;
    public FieldDef avfechacad;
    public FieldDef avvisible;
    public FieldDef avarchivo;
    public FieldDef avtipo;
    public FieldDef avambito;
    public TabAvisos(String name)
      {
      super(name);
      aviden = new FieldDef("aviden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      avtexto = new FieldDef("avtexto",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      avfechacre = new FieldDef("avfechacre",FieldDef.DATE);
      avfechavis = new FieldDef("avfechavis",FieldDef.DATE);
      avfechalim = new FieldDef("avfechalim",FieldDef.DATE);
      avfechacad = new FieldDef("avfechacad",FieldDef.DATE);
      avvisible = new FieldDef("avvisible",FieldDef.CHAR,1);
      avarchivo = new FieldDef("avarchivo",FieldDef.CHAR,300);
      avtipo = new FieldDef("avtipo",FieldDef.CHAR,2);
      avambito = new FieldDef("avambito",FieldDef.CHAR,15);
      FieldDef array[] = {
        aviden,
        avtexto,
        avfechacre,
        avfechavis,
        avfechalim,
        avfechacad,
        avvisible,
        avarchivo,
        avtipo,
        avambito        
        };
      setColumns(array);
      FieldDef arrayf[] = {aviden };
      setPrimaryKeys(arrayf);
      aviden.setAutoIncrementable(true);
      }
    }
    
  public class TabConsulta extends TableDef
    {
    // Campos
    public FieldDef cniden;
    public FieldDef cnpregunta;
    public FieldDef cnrespuesta;
    public FieldDef cnfechacre;
    public FieldDef cnfecharesp;
    public TabConsulta(String name)
      {
      super(name);
      cniden = new FieldDef("cniden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnpregunta = new FieldDef("cnpregunta",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnrespuesta = new FieldDef("cnrespuesta",FieldDef.INTEGER,0);
      cnfechacre = new FieldDef("cnfechacre",FieldDef.DATE);
      cnfecharesp = new FieldDef("cnfecharesp",FieldDef.DATE);
      FieldDef array[] = {
        cniden,
        cnpregunta,
        cnrespuesta,
        cnfechacre,
        cnfecharesp        
        };
      setColumns(array);
      FieldDef arrayf[] = {cniden };
      setPrimaryKeys(arrayf);
      cniden.setAutoIncrementable(true);
      }
    }
    
  public class TabContratado extends TableDef
    {
    // Campos
    public FieldDef coniden;
    public FieldDef concodigo;
    public FieldDef conproducto;
    public FieldDef conso;
    public FieldDef confechaalta;
    public FieldDef confechafin;
    public FieldDef confechabaja;
    public FieldDef conperiodo;
    public FieldDef confecultfac;
    public FieldDef conbloqueo;
    public FieldDef confacturaen;
    public FieldDef conclavegeyce;
    public FieldDef confacturadp;
    public FieldDef contarifa;
    public FieldDef conformato;
    public FieldDef connumfac;
    public FieldDef conpromocion;
    public FieldDef consaldous;
    public FieldDef conbajavis;
    public TabContratado(String name)
      {
      super(name);
      coniden = new FieldDef("coniden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      concodigo = new FieldDef("concodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      conproducto = new FieldDef("conproducto",FieldDef.CHAR,15,FieldDef.NOTNULL);
      conso = new FieldDef("conso",FieldDef.CHAR,2);
      confechaalta = new FieldDef("confechaalta",FieldDef.DATE);
      confechafin = new FieldDef("confechafin",FieldDef.DATE);
      confechabaja = new FieldDef("confechabaja",FieldDef.DATE);
      conperiodo = new FieldDef("conperiodo",FieldDef.INTEGER,0);
      confecultfac = new FieldDef("confecultfac",FieldDef.DATE);
      conbloqueo = new FieldDef("conbloqueo",FieldDef.CHAR,1);
      confacturaen = new FieldDef("confacturaen",FieldDef.CHAR,1);
      conclavegeyce = new FieldDef("conclavegeyce",FieldDef.CHAR,20);
      confacturadp = new FieldDef("confacturadp",FieldDef.CHAR,12);
      contarifa = new FieldDef("contarifa",FieldDef.CHAR,10);
      conformato = new FieldDef("conformato",FieldDef.CHAR,10);
      connumfac = new FieldDef("connumfac",FieldDef.CHAR,15);
      conpromocion = new FieldDef("conpromocion",FieldDef.CHAR,5);
      consaldous = new FieldDef("consaldous",FieldDef.INTEGER,0);
      conbajavis = new FieldDef("conbajavis",FieldDef.CHAR,1);
      FieldDef array[] = {
        coniden,
        concodigo,
        conproducto,
        conso,
        confechaalta,
        confechafin,
        confechabaja,
        conperiodo,
        confecultfac,
        conbloqueo,
        confacturaen,
        conclavegeyce,
        confacturadp,
        contarifa,
        conformato,
        connumfac,
        conpromocion,
        consaldous,
        conbajavis        
        };
      setColumns(array);
      FieldDef arrayf[] = {coniden };
      setPrimaryKeys(arrayf);
      coniden.setAutoIncrementable(true);
      }
    }
    
  public class TabAsp extends TableDef
    {
    // Campos
    public FieldDef aspcodigo;
    public FieldDef aspproducto;
    public FieldDef asphost;
    public FieldDef aspsgbdr;
    public FieldDef aspftpuser;
    public FieldDef aspftppwd;
    public FieldDef aspmaxemp;
    public FieldDef aspmaxusers;
    public FieldDef aspmaxregs;
    public FieldDef aspopciones;
    public FieldDef aspbduser;
    public FieldDef aspbdpasswd;
    public FieldDef aspbdnombre;
    public FieldDef asphome;
    public FieldDef aspserver;
    public FieldDef aspmain;
    public FieldDef aspmx;
    public FieldDef aspms;
    public TabAsp(String name)
      {
      super(name);
      aspcodigo = new FieldDef("aspcodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      aspproducto = new FieldDef("aspproducto",FieldDef.CHAR,15,FieldDef.NOTNULL);
      asphost = new FieldDef("asphost",FieldDef.CHAR,255);
      aspsgbdr = new FieldDef("aspsgbdr",FieldDef.CHAR,10);
      aspftpuser = new FieldDef("aspftpuser",FieldDef.CHAR,15);
      aspftppwd = new FieldDef("aspftppwd",FieldDef.CHAR,15);
      aspmaxemp = new FieldDef("aspmaxemp",FieldDef.INTEGER,0);
      aspmaxusers = new FieldDef("aspmaxusers",FieldDef.INTEGER,0);
      aspmaxregs = new FieldDef("aspmaxregs",FieldDef.INTEGER,0);
      aspopciones = new FieldDef("aspopciones",FieldDef.CHAR,512);
      aspbduser = new FieldDef("aspbduser",FieldDef.CHAR,15);
      aspbdpasswd = new FieldDef("aspbdpasswd",FieldDef.CHAR,15);
      aspbdnombre = new FieldDef("aspbdnombre",FieldDef.CHAR,128);
      asphome = new FieldDef("asphome",FieldDef.CHAR,255);
      aspserver = new FieldDef("aspserver",FieldDef.CHAR,80);
      aspmain = new FieldDef("aspmain",FieldDef.CHAR,80);
      aspmx = new FieldDef("aspmx",FieldDef.FLOAT,6,0);
      aspms = new FieldDef("aspms",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        aspcodigo,
        aspproducto,
        asphost,
        aspsgbdr,
        aspftpuser,
        aspftppwd,
        aspmaxemp,
        aspmaxusers,
        aspmaxregs,
        aspopciones,
        aspbduser,
        aspbdpasswd,
        aspbdnombre,
        asphome,
        aspserver,
        aspmain,
        aspmx,
        aspms        
        };
      setColumns(array);
      FieldDef arrayf[] = {aspcodigo,aspproducto };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabUso extends TableDef
    {
    // Campos
    public FieldDef usocodigo;
    public FieldDef usoalias;
    public FieldDef usoproducto;
    public FieldDef usofecultacc;
    public FieldDef usoaccesos;
    public TabUso(String name)
      {
      super(name);
      usocodigo = new FieldDef("usocodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      usoalias = new FieldDef("usoalias",FieldDef.CHAR,20,FieldDef.NOTNULL);
      usoproducto = new FieldDef("usoproducto",FieldDef.CHAR,15,FieldDef.NOTNULL);
      usofecultacc = new FieldDef("usofecultacc",FieldDef.DATE);
      usoaccesos = new FieldDef("usoaccesos",FieldDef.INTEGER,0);
      FieldDef array[] = {
        usocodigo,
        usoalias,
        usoproducto,
        usofecultacc,
        usoaccesos        
        };
      setColumns(array);
      FieldDef arrayf[] = {usocodigo,usoalias,usoproducto };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabFormulario extends TableDef
    {
    // Campos
    public FieldDef foiden;
    public FieldDef fodescripcion;
    public FieldDef foproducto;
    public FieldDef fotipo;
    public FieldDef fohtml;
    public TabFormulario(String name)
      {
      super(name);
      foiden = new FieldDef("foiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fodescripcion = new FieldDef("fodescripcion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      foproducto = new FieldDef("foproducto",FieldDef.CHAR,15,FieldDef.NOTNULL);
      fotipo = new FieldDef("fotipo",FieldDef.CHAR,1);
      fohtml = new FieldDef("fohtml",FieldDef.CHAR,16);
      FieldDef array[] = {
        foiden,
        fodescripcion,
        foproducto,
        fotipo,
        fohtml        
        };
      setColumns(array);
      FieldDef arrayf[] = {foiden };
      setPrimaryKeys(arrayf);
      foiden.setAutoIncrementable(true);
      }
    }
    
  public class TabEoperfil extends TableDef
    {
    // Campos
    public FieldDef pfcliente;
    public FieldDef pfacumulados;
    public FieldDef pfivadef;
    public FieldDef pfrecequidef;
    public FieldDef pfirpfdef;
    public FieldDef pfseriedef;
    public FieldDef pfformventa;
    public FieldDef pfformcompra;
    public FieldDef pfformgasto;
    public TabEoperfil(String name)
      {
      super(name);
      pfcliente = new FieldDef("pfcliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pfacumulados = new FieldDef("pfacumulados",FieldDef.CHAR,1);
      pfivadef = new FieldDef("pfivadef",FieldDef.FLOAT,6,0);
      pfrecequidef = new FieldDef("pfrecequidef",FieldDef.FLOAT,6,0);
      pfirpfdef = new FieldDef("pfirpfdef",FieldDef.FLOAT,6,0);
      pfseriedef = new FieldDef("pfseriedef",FieldDef.CHAR,1);
      pfformventa = new FieldDef("pfformventa",FieldDef.INTEGER,0);
      pfformcompra = new FieldDef("pfformcompra",FieldDef.INTEGER,0);
      pfformgasto = new FieldDef("pfformgasto",FieldDef.INTEGER,0);
      FieldDef array[] = {
        pfcliente,
        pfacumulados,
        pfivadef,
        pfrecequidef,
        pfirpfdef,
        pfseriedef,
        pfformventa,
        pfformcompra,
        pfformgasto        
        };
      setColumns(array);
      FieldDef arrayf[] = {pfcliente };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabConceptogasto extends TableDef
    {
    // Campos
    public FieldDef gaejer;
    public FieldDef gacodigo;
    public FieldDef gadesc;
    public TabConceptogasto(String name)
      {
      super(name);
      gaejer = new FieldDef("gaejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      gacodigo = new FieldDef("gacodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      gadesc = new FieldDef("gadesc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        gaejer,
        gacodigo,
        gadesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {gaejer,gacodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEoactividad extends TableDef
    {
    // Campos
    public FieldDef acclientedp;
    public FieldDef acnumero;
    public FieldDef acdesc;
    public FieldDef acformventa;
    public FieldDef acformgasto;
    public FieldDef acformcompra;
    public FieldDef acmonedadef;
    public TabEoactividad(String name)
      {
      super(name);
      acclientedp = new FieldDef("acclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      acnumero = new FieldDef("acnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acdesc = new FieldDef("acdesc",FieldDef.CHAR,45);
      acformventa = new FieldDef("acformventa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acformgasto = new FieldDef("acformgasto",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acformcompra = new FieldDef("acformcompra",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acmonedadef = new FieldDef("acmonedadef",FieldDef.CHAR,1);
      FieldDef array[] = {
        acclientedp,
        acnumero,
        acdesc,
        acformventa,
        acformgasto,
        acformcompra,
        acmonedadef        
        };
      setColumns(array);
      FieldDef arrayf[] = {acclientedp,acnumero };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEoapunte extends TableDef
    {
    // Campos
    public FieldDef eoiden;
    public FieldDef eoclientedp;
    public FieldDef eoactividad;
    public FieldDef eotipofra;
    public FieldDef eofechafra;
    public FieldDef eoejer;
    public FieldDef eoseriefra;
    public FieldDef eonumdoc;
    public FieldDef eomoneda;
    public FieldDef eocongasto;
    public FieldDef eointracomun;
    public FieldDef eonifcif;
    public FieldDef eonombre;
    public FieldDef eoiva1;
    public FieldDef eobase1iva;
    public FieldDef eocuota1iva;
    public FieldDef eoiva2;
    public FieldDef eobase2iva;
    public FieldDef eocuota2iva;
    public FieldDef eoiva3;
    public FieldDef eobase3iva;
    public FieldDef eocuota3iva;
    public FieldDef eorecequi1;
    public FieldDef eobase1rec;
    public FieldDef eocuota1rec;
    public FieldDef eorecequi2;
    public FieldDef eobase2rec;
    public FieldDef eocuota2rec;
    public FieldDef eorecequi3;
    public FieldDef eobase3rec;
    public FieldDef eocuota3rec;
    public FieldDef eoirpf;
    public FieldDef eobaseirpf;
    public FieldDef eocuotairpf;
    public FieldDef eobaseexenta;
    public FieldDef eototalfra;
    public TabEoapunte(String name)
      {
      super(name);
      eoiden = new FieldDef("eoiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      eoclientedp = new FieldDef("eoclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      eoactividad = new FieldDef("eoactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      eotipofra = new FieldDef("eotipofra",FieldDef.CHAR,1,FieldDef.NOTNULL);
      eofechafra = new FieldDef("eofechafra",FieldDef.DATE);
      eoejer = new FieldDef("eoejer",FieldDef.INTEGER,0);
      eoseriefra = new FieldDef("eoseriefra",FieldDef.CHAR,1);
      eonumdoc = new FieldDef("eonumdoc",FieldDef.CHAR,10);
      eomoneda = new FieldDef("eomoneda",FieldDef.CHAR,1,FieldDef.NOTNULL);
      eocongasto = new FieldDef("eocongasto",FieldDef.INTEGER,0);
      eointracomun = new FieldDef("eointracomun",FieldDef.CHAR,1);
      eonifcif = new FieldDef("eonifcif",FieldDef.CHAR,15);
      eonombre = new FieldDef("eonombre",FieldDef.CHAR,30);
      eoiva1 = new FieldDef("eoiva1",FieldDef.FLOAT,6,0);
      eobase1iva = new FieldDef("eobase1iva",FieldDef.FLOAT,6,0);
      eocuota1iva = new FieldDef("eocuota1iva",FieldDef.FLOAT,6,0);
      eoiva2 = new FieldDef("eoiva2",FieldDef.FLOAT,6,0);
      eobase2iva = new FieldDef("eobase2iva",FieldDef.FLOAT,6,0);
      eocuota2iva = new FieldDef("eocuota2iva",FieldDef.FLOAT,6,0);
      eoiva3 = new FieldDef("eoiva3",FieldDef.FLOAT,6,0);
      eobase3iva = new FieldDef("eobase3iva",FieldDef.FLOAT,6,0);
      eocuota3iva = new FieldDef("eocuota3iva",FieldDef.FLOAT,6,0);
      eorecequi1 = new FieldDef("eorecequi1",FieldDef.FLOAT,6,0);
      eobase1rec = new FieldDef("eobase1rec",FieldDef.FLOAT,6,0);
      eocuota1rec = new FieldDef("eocuota1rec",FieldDef.FLOAT,6,0);
      eorecequi2 = new FieldDef("eorecequi2",FieldDef.FLOAT,6,0);
      eobase2rec = new FieldDef("eobase2rec",FieldDef.FLOAT,6,0);
      eocuota2rec = new FieldDef("eocuota2rec",FieldDef.FLOAT,6,0);
      eorecequi3 = new FieldDef("eorecequi3",FieldDef.FLOAT,6,0);
      eobase3rec = new FieldDef("eobase3rec",FieldDef.FLOAT,6,0);
      eocuota3rec = new FieldDef("eocuota3rec",FieldDef.FLOAT,6,0);
      eoirpf = new FieldDef("eoirpf",FieldDef.FLOAT,6,0);
      eobaseirpf = new FieldDef("eobaseirpf",FieldDef.FLOAT,6,0);
      eocuotairpf = new FieldDef("eocuotairpf",FieldDef.FLOAT,6,0);
      eobaseexenta = new FieldDef("eobaseexenta",FieldDef.FLOAT,6,0);
      eototalfra = new FieldDef("eototalfra",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        eoiden,
        eoclientedp,
        eoactividad,
        eotipofra,
        eofechafra,
        eoejer,
        eoseriefra,
        eonumdoc,
        eomoneda,
        eocongasto,
        eointracomun,
        eonifcif,
        eonombre,
        eoiva1,
        eobase1iva,
        eocuota1iva,
        eoiva2,
        eobase2iva,
        eocuota2iva,
        eoiva3,
        eobase3iva,
        eocuota3iva,
        eorecequi1,
        eobase1rec,
        eocuota1rec,
        eorecequi2,
        eobase2rec,
        eocuota2rec,
        eorecequi3,
        eobase3rec,
        eocuota3rec,
        eoirpf,
        eobaseirpf,
        eocuotairpf,
        eobaseexenta,
        eototalfra        
        };
      setColumns(array);
      FieldDef arrayf[] = {eoiden };
      setPrimaryKeys(arrayf);
      eoiden.setAutoIncrementable(true);
      }
    }
    
  public class TabEotiposiva extends TableDef
    {
    // Campos
    public FieldDef tiejercicio;
    public FieldDef tiiva1;
    public FieldDef tiiva2;
    public FieldDef tiiva3;
    public FieldDef tiiva4;
    public FieldDef tirec1;
    public FieldDef tirec2;
    public FieldDef tirec3;
    public FieldDef tirec4;
    public FieldDef ticomagr1;
    public FieldDef ticomagr2;
    public FieldDef ticomagr3;
    public FieldDef ticomagr4;
    public TabEotiposiva(String name)
      {
      super(name);
      tiejercicio = new FieldDef("tiejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tiiva1 = new FieldDef("tiiva1",FieldDef.FLOAT,6,0);
      tiiva2 = new FieldDef("tiiva2",FieldDef.FLOAT,6,0);
      tiiva3 = new FieldDef("tiiva3",FieldDef.FLOAT,6,0);
      tiiva4 = new FieldDef("tiiva4",FieldDef.FLOAT,6,0);
      tirec1 = new FieldDef("tirec1",FieldDef.FLOAT,6,0);
      tirec2 = new FieldDef("tirec2",FieldDef.FLOAT,6,0);
      tirec3 = new FieldDef("tirec3",FieldDef.FLOAT,6,0);
      tirec4 = new FieldDef("tirec4",FieldDef.FLOAT,6,0);
      ticomagr1 = new FieldDef("ticomagr1",FieldDef.FLOAT,6,0);
      ticomagr2 = new FieldDef("ticomagr2",FieldDef.FLOAT,6,0);
      ticomagr3 = new FieldDef("ticomagr3",FieldDef.FLOAT,6,0);
      ticomagr4 = new FieldDef("ticomagr4",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        tiejercicio,
        tiiva1,
        tiiva2,
        tiiva3,
        tiiva4,
        tirec1,
        tirec2,
        tirec3,
        tirec4,
        ticomagr1,
        ticomagr2,
        ticomagr3,
        ticomagr4        
        };
      setColumns(array);
      FieldDef arrayf[] = {tiejercicio };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEoacumiva extends TableDef
    {
    // Campos
    public FieldDef eiiden;
    public FieldDef eicliente;
    public FieldDef eiactividad;
    public FieldDef eiejercicio;
    public FieldDef eiperiodo;
    public FieldDef eiregimgen1;
    public FieldDef eiregimgen2;
    public FieldDef eiregimgen3;
    public FieldDef eireggenir1;
    public FieldDef eireggenir2;
    public FieldDef eireggenir3;
    public FieldDef eirecequi1;
    public FieldDef eirecequi2;
    public FieldDef eirecequi3;
    public FieldDef eirecequiir1;
    public FieldDef eirecequiir2;
    public FieldDef eirecequiir3;
    public FieldDef eiadquisicom;
    public FieldDef eiadquisicir;
    public FieldDef eibasecuotas;
    public FieldDef eibasecompag;
    public FieldDef eibaseadintr;
    public FieldDef eicuotcuotas;
    public FieldDef eicuotcompag;
    public FieldDef eicuotadintr;
    public FieldDef eiopexentas;
    public FieldDef eigastosded;
    public FieldDef eiretencion;
    public TabEoacumiva(String name)
      {
      super(name);
      eiiden = new FieldDef("eiiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      eicliente = new FieldDef("eicliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      eiactividad = new FieldDef("eiactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      eiejercicio = new FieldDef("eiejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      eiperiodo = new FieldDef("eiperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      eiregimgen1 = new FieldDef("eiregimgen1",FieldDef.FLOAT,6,0);
      eiregimgen2 = new FieldDef("eiregimgen2",FieldDef.FLOAT,6,0);
      eiregimgen3 = new FieldDef("eiregimgen3",FieldDef.FLOAT,6,0);
      eireggenir1 = new FieldDef("eireggenir1",FieldDef.FLOAT,6,0);
      eireggenir2 = new FieldDef("eireggenir2",FieldDef.FLOAT,6,0);
      eireggenir3 = new FieldDef("eireggenir3",FieldDef.FLOAT,6,0);
      eirecequi1 = new FieldDef("eirecequi1",FieldDef.FLOAT,6,0);
      eirecequi2 = new FieldDef("eirecequi2",FieldDef.FLOAT,6,0);
      eirecequi3 = new FieldDef("eirecequi3",FieldDef.FLOAT,6,0);
      eirecequiir1 = new FieldDef("eirecequiir1",FieldDef.FLOAT,6,0);
      eirecequiir2 = new FieldDef("eirecequiir2",FieldDef.FLOAT,6,0);
      eirecequiir3 = new FieldDef("eirecequiir3",FieldDef.FLOAT,6,0);
      eiadquisicom = new FieldDef("eiadquisicom",FieldDef.FLOAT,6,0);
      eiadquisicir = new FieldDef("eiadquisicir",FieldDef.FLOAT,6,0);
      eibasecuotas = new FieldDef("eibasecuotas",FieldDef.FLOAT,6,0);
      eibasecompag = new FieldDef("eibasecompag",FieldDef.FLOAT,6,0);
      eibaseadintr = new FieldDef("eibaseadintr",FieldDef.FLOAT,6,0);
      eicuotcuotas = new FieldDef("eicuotcuotas",FieldDef.FLOAT,6,0);
      eicuotcompag = new FieldDef("eicuotcompag",FieldDef.FLOAT,6,0);
      eicuotadintr = new FieldDef("eicuotadintr",FieldDef.FLOAT,6,0);
      eiopexentas = new FieldDef("eiopexentas",FieldDef.FLOAT,6,0);
      eigastosded = new FieldDef("eigastosded",FieldDef.FLOAT,6,0);
      eiretencion = new FieldDef("eiretencion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        eiiden,
        eicliente,
        eiactividad,
        eiejercicio,
        eiperiodo,
        eiregimgen1,
        eiregimgen2,
        eiregimgen3,
        eireggenir1,
        eireggenir2,
        eireggenir3,
        eirecequi1,
        eirecequi2,
        eirecequi3,
        eirecequiir1,
        eirecequiir2,
        eirecequiir3,
        eiadquisicom,
        eiadquisicir,
        eibasecuotas,
        eibasecompag,
        eibaseadintr,
        eicuotcuotas,
        eicuotcompag,
        eicuotadintr,
        eiopexentas,
        eigastosded,
        eiretencion        
        };
      setColumns(array);
      FieldDef arrayf[] = {eiiden };
      setPrimaryKeys(arrayf);
      eiiden.setAutoIncrementable(true);
      }
    }
    
  public class TabEoacumret extends TableDef
    {
    // Campos
    public FieldDef eriden;
    public FieldDef ercliente;
    public FieldDef eractividad;
    public FieldDef erejercicio;
    public FieldDef erperiodo;
    public FieldDef erinmupercp;
    public FieldDef erinmubret;
    public FieldDef erinmureten;
    public FieldDef ertrabpercp;
    public FieldDef ertrabimp;
    public FieldDef ertrabret;
    public FieldDef ertrabperes;
    public FieldDef ertrabimpes;
    public FieldDef ertrabretes;
    public FieldDef eraeconpercp;
    public FieldDef eraeconimp;
    public FieldDef eraeconret;
    public FieldDef eraeconperes;
    public FieldDef eraeconimpes;
    public FieldDef eraeconretes;
    public TabEoacumret(String name)
      {
      super(name);
      eriden = new FieldDef("eriden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ercliente = new FieldDef("ercliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      eractividad = new FieldDef("eractividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      erejercicio = new FieldDef("erejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      erperiodo = new FieldDef("erperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      erinmupercp = new FieldDef("erinmupercp",FieldDef.FLOAT,6,0);
      erinmubret = new FieldDef("erinmubret",FieldDef.FLOAT,6,0);
      erinmureten = new FieldDef("erinmureten",FieldDef.FLOAT,6,0);
      ertrabpercp = new FieldDef("ertrabpercp",FieldDef.FLOAT,6,0);
      ertrabimp = new FieldDef("ertrabimp",FieldDef.FLOAT,6,0);
      ertrabret = new FieldDef("ertrabret",FieldDef.FLOAT,6,0);
      ertrabperes = new FieldDef("ertrabperes",FieldDef.FLOAT,6,0);
      ertrabimpes = new FieldDef("ertrabimpes",FieldDef.FLOAT,6,0);
      ertrabretes = new FieldDef("ertrabretes",FieldDef.FLOAT,6,0);
      eraeconpercp = new FieldDef("eraeconpercp",FieldDef.FLOAT,6,0);
      eraeconimp = new FieldDef("eraeconimp",FieldDef.FLOAT,6,0);
      eraeconret = new FieldDef("eraeconret",FieldDef.FLOAT,6,0);
      eraeconperes = new FieldDef("eraeconperes",FieldDef.FLOAT,6,0);
      eraeconimpes = new FieldDef("eraeconimpes",FieldDef.FLOAT,6,0);
      eraeconretes = new FieldDef("eraeconretes",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        eriden,
        ercliente,
        eractividad,
        erejercicio,
        erperiodo,
        erinmupercp,
        erinmubret,
        erinmureten,
        ertrabpercp,
        ertrabimp,
        ertrabret,
        ertrabperes,
        ertrabimpes,
        ertrabretes,
        eraeconpercp,
        eraeconimp,
        eraeconret,
        eraeconperes,
        eraeconimpes,
        eraeconretes        
        };
      setColumns(array);
      FieldDef arrayf[] = {eriden };
      setPrimaryKeys(arrayf);
      eriden.setAutoIncrementable(true);
      }
    }
    
  public class TabLabproductor extends TableDef
    {
    // Campos
    public FieldDef pdclientedp;
    public FieldDef pdcodigo;
    public FieldDef pdapellido1;
    public FieldDef pdapellido2;
    public FieldDef pdnombre;
    public FieldDef pdsg;
    public FieldDef pdcalle;
    public FieldDef pdnumero;
    public FieldDef pddistrito;
    public FieldDef pdcodigomun;
    public FieldDef pdmunicipio;
    public FieldDef pdprovincia;
    public FieldDef pdtelefono;
    public FieldDef pdnacionalidad;
    public FieldDef pdmatricula;
    public FieldDef pdsoeprovincia;
    public FieldDef pdsoenumero;
    public FieldDef pdsoecontrol;
    public FieldDef pddni;
    public FieldDef pdsexo;
    public FieldDef pdestado;
    public FieldDef pdregimen;
    public FieldDef pdhijos;
    public FieldDef pddiscapacitado;
    public TabLabproductor(String name)
      {
      super(name);
      pdclientedp = new FieldDef("pdclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pdcodigo = new FieldDef("pdcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pdapellido1 = new FieldDef("pdapellido1",FieldDef.CHAR,20,FieldDef.NOTNULL);
      pdapellido2 = new FieldDef("pdapellido2",FieldDef.CHAR,20);
      pdnombre = new FieldDef("pdnombre",FieldDef.CHAR,15);
      pdsg = new FieldDef("pdsg",FieldDef.CHAR,2);
      pdcalle = new FieldDef("pdcalle",FieldDef.CHAR,30);
      pdnumero = new FieldDef("pdnumero",FieldDef.CHAR,5);
      pddistrito = new FieldDef("pddistrito",FieldDef.CHAR,5);
      pdcodigomun = new FieldDef("pdcodigomun",FieldDef.INTEGER,0);
      pdmunicipio = new FieldDef("pdmunicipio",FieldDef.CHAR,20);
      pdprovincia = new FieldDef("pdprovincia",FieldDef.INTEGER,0);
      pdtelefono = new FieldDef("pdtelefono",FieldDef.CHAR,12);
      pdnacionalidad = new FieldDef("pdnacionalidad",FieldDef.CHAR,15);
      pdmatricula = new FieldDef("pdmatricula",FieldDef.INTEGER,0);
      pdsoeprovincia = new FieldDef("pdsoeprovincia",FieldDef.INTEGER,0);
      pdsoenumero = new FieldDef("pdsoenumero",FieldDef.FLOAT,6,0);
      pdsoecontrol = new FieldDef("pdsoecontrol",FieldDef.INTEGER,0);
      pddni = new FieldDef("pddni",FieldDef.CHAR,15);
      pdsexo = new FieldDef("pdsexo",FieldDef.CHAR,1);
      pdestado = new FieldDef("pdestado",FieldDef.CHAR,1);
      pdregimen = new FieldDef("pdregimen",FieldDef.CHAR,1);
      pdhijos = new FieldDef("pdhijos",FieldDef.INTEGER,0);
      pddiscapacitado = new FieldDef("pddiscapacitado",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        pdclientedp,
        pdcodigo,
        pdapellido1,
        pdapellido2,
        pdnombre,
        pdsg,
        pdcalle,
        pdnumero,
        pddistrito,
        pdcodigomun,
        pdmunicipio,
        pdprovincia,
        pdtelefono,
        pdnacionalidad,
        pdmatricula,
        pdsoeprovincia,
        pdsoenumero,
        pdsoecontrol,
        pddni,
        pdsexo,
        pdestado,
        pdregimen,
        pdhijos,
        pddiscapacitado        
        };
      setColumns(array);
      FieldDef arrayf[] = {pdclientedp,pdcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabacumula extends TableDef
    {
    // Campos
    public FieldDef acuclientedp;
    public FieldDef acuproductor;
    public FieldDef acuany;
    public FieldDef acumes;
    public FieldDef acubrentadin;
    public FieldDef acubrentaesp;
    public FieldDef acubnsdin;
    public FieldDef acubnsesp;
    public FieldDef acuhextrases;
    public FieldDef acuhextrasnes;
    public FieldDef acudedsegsoc;
    public FieldDef acuretdin;
    public FieldDef acuretesp;
    public FieldDef aculiquidos;
    public TabLabacumula(String name)
      {
      super(name);
      acuclientedp = new FieldDef("acuclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      acuproductor = new FieldDef("acuproductor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acuany = new FieldDef("acuany",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acumes = new FieldDef("acumes",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acubrentadin = new FieldDef("acubrentadin",FieldDef.FLOAT,6,0);
      acubrentaesp = new FieldDef("acubrentaesp",FieldDef.FLOAT,6,0);
      acubnsdin = new FieldDef("acubnsdin",FieldDef.FLOAT,6,0);
      acubnsesp = new FieldDef("acubnsesp",FieldDef.FLOAT,6,0);
      acuhextrases = new FieldDef("acuhextrases",FieldDef.FLOAT,6,0);
      acuhextrasnes = new FieldDef("acuhextrasnes",FieldDef.FLOAT,6,0);
      acudedsegsoc = new FieldDef("acudedsegsoc",FieldDef.FLOAT,6,0);
      acuretdin = new FieldDef("acuretdin",FieldDef.FLOAT,6,0);
      acuretesp = new FieldDef("acuretesp",FieldDef.FLOAT,6,0);
      aculiquidos = new FieldDef("aculiquidos",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        acuclientedp,
        acuproductor,
        acuany,
        acumes,
        acubrentadin,
        acubrentaesp,
        acubnsdin,
        acubnsesp,
        acuhextrases,
        acuhextrasnes,
        acudedsegsoc,
        acuretdin,
        acuretesp,
        aculiquidos        
        };
      setColumns(array);
      FieldDef arrayf[] = {acuclientedp,acuproductor,acuany,acumes };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabfechas extends TableDef
    {
    // Campos
    public FieldDef feclientedp;
    public FieldDef feproductor;
    public FieldDef fefalta;
    public FieldDef fefnac;
    public FieldDef fefaltaemp;
    public FieldDef fefpagas;
    public FieldDef fefantig;
    public FieldDef fefcalantig;
    public FieldDef fefbaja;
    public FieldDef feffincon;
    public TabLabfechas(String name)
      {
      super(name);
      feclientedp = new FieldDef("feclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      feproductor = new FieldDef("feproductor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fefalta = new FieldDef("fefalta",FieldDef.DATE);
      fefnac = new FieldDef("fefnac",FieldDef.DATE);
      fefaltaemp = new FieldDef("fefaltaemp",FieldDef.DATE);
      fefpagas = new FieldDef("fefpagas",FieldDef.DATE);
      fefantig = new FieldDef("fefantig",FieldDef.DATE);
      fefcalantig = new FieldDef("fefcalantig",FieldDef.DATE);
      fefbaja = new FieldDef("fefbaja",FieldDef.DATE);
      feffincon = new FieldDef("feffincon",FieldDef.DATE);
      FieldDef array[] = {
        feclientedp,
        feproductor,
        fefalta,
        fefnac,
        fefaltaemp,
        fefpagas,
        fefantig,
        fefcalantig,
        fefbaja,
        feffincon        
        };
      setColumns(array);
      FieldDef arrayf[] = {feclientedp,feproductor };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLababsentismo extends TableDef
    {
    // Campos
    public FieldDef abclientedp;
    public FieldDef abproductor;
    public FieldDef abany;
    public FieldDef abmes;
    public FieldDef abdiasenf;
    public FieldDef abdiasmat;
    public FieldDef abdiasacc;
    public FieldDef abdiasvar;
    public FieldDef abdiashue;
    public FieldDef abdiasfal;
    public FieldDef abhorasret;
    public FieldDef abhorasimp;
    public FieldDef abhorasper;
    public TabLababsentismo(String name)
      {
      super(name);
      abclientedp = new FieldDef("abclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      abproductor = new FieldDef("abproductor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      abany = new FieldDef("abany",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      abmes = new FieldDef("abmes",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      abdiasenf = new FieldDef("abdiasenf",FieldDef.INTEGER,0);
      abdiasmat = new FieldDef("abdiasmat",FieldDef.INTEGER,0);
      abdiasacc = new FieldDef("abdiasacc",FieldDef.INTEGER,0);
      abdiasvar = new FieldDef("abdiasvar",FieldDef.INTEGER,0);
      abdiashue = new FieldDef("abdiashue",FieldDef.INTEGER,0);
      abdiasfal = new FieldDef("abdiasfal",FieldDef.INTEGER,0);
      abhorasret = new FieldDef("abhorasret",FieldDef.FLOAT,6,0);
      abhorasimp = new FieldDef("abhorasimp",FieldDef.FLOAT,6,0);
      abhorasper = new FieldDef("abhorasper",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        abclientedp,
        abproductor,
        abany,
        abmes,
        abdiasenf,
        abdiasmat,
        abdiasacc,
        abdiasvar,
        abdiashue,
        abdiasfal,
        abhorasret,
        abhorasimp,
        abhorasper        
        };
      setColumns(array);
      FieldDef arrayf[] = {abclientedp,abproductor,abany,abmes };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabdatbanc extends TableDef
    {
    // Campos
    public FieldDef dbclientedp;
    public FieldDef dbproductor;
    public FieldDef dbcobro;
    public FieldDef dbbancoemp;
    public FieldDef dbbancoprod;
    public FieldDef dbagencia;
    public FieldDef dbentidad;
    public FieldDef dboficina;
    public FieldDef dbdigcontrol;
    public FieldDef dbnumcuenta;
    public TabLabdatbanc(String name)
      {
      super(name);
      dbclientedp = new FieldDef("dbclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dbproductor = new FieldDef("dbproductor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dbcobro = new FieldDef("dbcobro",FieldDef.CHAR,1);
      dbbancoemp = new FieldDef("dbbancoemp",FieldDef.INTEGER,0);
      dbbancoprod = new FieldDef("dbbancoprod",FieldDef.INTEGER,0);
      dbagencia = new FieldDef("dbagencia",FieldDef.CHAR,15);
      dbentidad = new FieldDef("dbentidad",FieldDef.INTEGER,0);
      dboficina = new FieldDef("dboficina",FieldDef.INTEGER,0);
      dbdigcontrol = new FieldDef("dbdigcontrol",FieldDef.CHAR,2);
      dbnumcuenta = new FieldDef("dbnumcuenta",FieldDef.CHAR,10);
      FieldDef array[] = {
        dbclientedp,
        dbproductor,
        dbcobro,
        dbbancoemp,
        dbbancoprod,
        dbagencia,
        dbentidad,
        dboficina,
        dbdigcontrol,
        dbnumcuenta        
        };
      setColumns(array);
      FieldDef arrayf[] = {dbclientedp,dbproductor };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabpuesto extends TableDef
    {
    // Campos
    public FieldDef puclientedp;
    public FieldDef puproductor;
    public FieldDef puconvenio;
    public FieldDef pucentrotrab;
    public FieldDef pucentrotc2;
    public FieldDef puseccion;
    public FieldDef pupuesto;
    public FieldDef pucategoria;
    public FieldDef pudesccateg;
    public FieldDef putarifa;
    public FieldDef puepigrafe;
    public FieldDef putipocot;
    public TabLabpuesto(String name)
      {
      super(name);
      puclientedp = new FieldDef("puclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      puproductor = new FieldDef("puproductor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      puconvenio = new FieldDef("puconvenio",FieldDef.CHAR,7);
      pucentrotrab = new FieldDef("pucentrotrab",FieldDef.CHAR,5);
      pucentrotc2 = new FieldDef("pucentrotc2",FieldDef.INTEGER,0);
      puseccion = new FieldDef("puseccion",FieldDef.CHAR,5);
      pupuesto = new FieldDef("pupuesto",FieldDef.CHAR,15);
      pucategoria = new FieldDef("pucategoria",FieldDef.INTEGER,0);
      pudesccateg = new FieldDef("pudesccateg",FieldDef.CHAR,20);
      putarifa = new FieldDef("putarifa",FieldDef.INTEGER,0);
      puepigrafe = new FieldDef("puepigrafe",FieldDef.INTEGER,0);
      putipocot = new FieldDef("putipocot",FieldDef.CHAR,1);
      FieldDef array[] = {
        puclientedp,
        puproductor,
        puconvenio,
        pucentrotrab,
        pucentrotc2,
        puseccion,
        pupuesto,
        pucategoria,
        pudesccateg,
        putarifa,
        puepigrafe,
        putipocot        
        };
      setColumns(array);
      FieldDef arrayf[] = {puclientedp,puproductor };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabdatcont extends TableDef
    {
    // Campos
    public FieldDef dcclientedp;
    public FieldDef dcproductor;
    public FieldDef dcrecibos;
    public FieldDef dctipocont;
    public FieldDef dcctdurde;
    public FieldDef dchoras;
    public FieldDef dchoraspresenci;
    public FieldDef dchorasdistanci;
    public FieldDef dctparcial;
    public FieldDef dcdiashoras;
    public FieldDef dcreductp;
    public FieldDef dcclaveirpf;
    public FieldDef dctipoirpf;
    public FieldDef dcporirpf;
    public FieldDef dcpluri;
    public FieldDef dcporpluri;
    public FieldDef dcbminsegsoc;
    public FieldDef dcbmaxsegsoc;
    public FieldDef dcbminacc;
    public FieldDef dcbmaxacc;
    public FieldDef dctextotc2;
    public FieldDef dcbonif;
    public FieldDef dcfinicio;
    public FieldDef dcffinal;
    public FieldDef dcfconcesion;
    public FieldDef dcautonomo;
    public FieldDef dccotautonomo;
    public FieldDef dctipoagrar;
    public FieldDef dcbaseagrar;
    public TabLabdatcont(String name)
      {
      super(name);
      dcclientedp = new FieldDef("dcclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dcproductor = new FieldDef("dcproductor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcrecibos = new FieldDef("dcrecibos",FieldDef.CHAR,5);
      dctipocont = new FieldDef("dctipocont",FieldDef.INTEGER,0);
      dcctdurde = new FieldDef("dcctdurde",FieldDef.CHAR,2);
      dchoras = new FieldDef("dchoras",FieldDef.FLOAT,6,0);
      dchoraspresenci = new FieldDef("dchoraspresenci",FieldDef.FLOAT,6,0);
      dchorasdistanci = new FieldDef("dchorasdistanci",FieldDef.FLOAT,6,0);
      dctparcial = new FieldDef("dctparcial",FieldDef.CHAR,1);
      dcdiashoras = new FieldDef("dcdiashoras",FieldDef.FLOAT,6,0);
      dcreductp = new FieldDef("dcreductp",FieldDef.FLOAT,6,0);
      dcclaveirpf = new FieldDef("dcclaveirpf",FieldDef.CHAR,3);
      dctipoirpf = new FieldDef("dctipoirpf",FieldDef.CHAR,1);
      dcporirpf = new FieldDef("dcporirpf",FieldDef.FLOAT,6,0);
      dcpluri = new FieldDef("dcpluri",FieldDef.CHAR,1);
      dcporpluri = new FieldDef("dcporpluri",FieldDef.FLOAT,6,0);
      dcbminsegsoc = new FieldDef("dcbminsegsoc",FieldDef.FLOAT,6,0);
      dcbmaxsegsoc = new FieldDef("dcbmaxsegsoc",FieldDef.FLOAT,6,0);
      dcbminacc = new FieldDef("dcbminacc",FieldDef.FLOAT,6,0);
      dcbmaxacc = new FieldDef("dcbmaxacc",FieldDef.FLOAT,6,0);
      dctextotc2 = new FieldDef("dctextotc2",FieldDef.CHAR,30);
      dcbonif = new FieldDef("dcbonif",FieldDef.INTEGER,0);
      dcfinicio = new FieldDef("dcfinicio",FieldDef.DATE);
      dcffinal = new FieldDef("dcffinal",FieldDef.DATE);
      dcfconcesion = new FieldDef("dcfconcesion",FieldDef.DATE);
      dcautonomo = new FieldDef("dcautonomo",FieldDef.CHAR,1);
      dccotautonomo = new FieldDef("dccotautonomo",FieldDef.FLOAT,6,0);
      dctipoagrar = new FieldDef("dctipoagrar",FieldDef.CHAR,1);
      dcbaseagrar = new FieldDef("dcbaseagrar",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        dcclientedp,
        dcproductor,
        dcrecibos,
        dctipocont,
        dcctdurde,
        dchoras,
        dchoraspresenci,
        dchorasdistanci,
        dctparcial,
        dcdiashoras,
        dcreductp,
        dcclaveirpf,
        dctipoirpf,
        dcporirpf,
        dcpluri,
        dcporpluri,
        dcbminsegsoc,
        dcbmaxsegsoc,
        dcbminacc,
        dcbmaxacc,
        dctextotc2,
        dcbonif,
        dcfinicio,
        dcffinal,
        dcfconcesion,
        dcautonomo,
        dccotautonomo,
        dctipoagrar,
        dcbaseagrar        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcclientedp,dcproductor };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabconcepvar extends TableDef
    {
    // Campos
    public FieldDef cvcliente;
    public FieldDef cvcodigo;
    public FieldDef cvdesc;
    public TabLabconcepvar(String name)
      {
      super(name);
      cvcliente = new FieldDef("cvcliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cvcodigo = new FieldDef("cvcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cvdesc = new FieldDef("cvdesc",FieldDef.CHAR,45,FieldDef.NOTNULL);
      FieldDef array[] = {
        cvcliente,
        cvcodigo,
        cvdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {cvcodigo,cvcliente };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabconvarcdp extends TableDef
    {
    // Campos
    public FieldDef cvccliente;
    public FieldDef cvcconcep;
    public TabLabconvarcdp(String name)
      {
      super(name);
      cvccliente = new FieldDef("cvccliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cvcconcep = new FieldDef("cvcconcep",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        cvccliente,
        cvcconcep        
        };
      setColumns(array);
      FieldDef arrayf[] = {cvccliente,cvcconcep };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabperfil extends TableDef
    {
    // Campos
    public FieldDef pecliente;
    public FieldDef peformrevar;
    public FieldDef pediasconven;
    public FieldDef pemescarenrv;
    public FieldDef pemescarenit;
    public TabLabperfil(String name)
      {
      super(name);
      pecliente = new FieldDef("pecliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      peformrevar = new FieldDef("peformrevar",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pediasconven = new FieldDef("pediasconven",FieldDef.INTEGER,0);
      pemescarenrv = new FieldDef("pemescarenrv",FieldDef.INTEGER,0);
      pemescarenit = new FieldDef("pemescarenit",FieldDef.INTEGER,0);
      FieldDef array[] = {
        pecliente,
        peformrevar,
        pediasconven,
        pemescarenrv,
        pemescarenit        
        };
      setColumns(array);
      FieldDef arrayf[] = {pecliente };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabproceso extends TableDef
    {
    // Campos
    public FieldDef prcodigo;
    public FieldDef prdesc;
    public TabLabproceso(String name)
      {
      super(name);
      prcodigo = new FieldDef("prcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      prdesc = new FieldDef("prdesc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        prcodigo,
        prdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {prcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabaccioncdp extends TableDef
    {
    // Campos
    public FieldDef accodigo;
    public FieldDef acdesc;
    public TabLabaccioncdp(String name)
      {
      super(name);
      accodigo = new FieldDef("accodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acdesc = new FieldDef("acdesc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        accodigo,
        acdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {accodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabretvar extends TableDef
    {
    // Campos
    public FieldDef rviden;
    public FieldDef rvclientedp;
    public FieldDef rvproduc;
    public FieldDef rvejer;
    public FieldDef rvperiodo;
    public FieldDef rvproceso;
    public FieldDef rvconcep;
    public FieldDef rvimporte;
    public TabLabretvar(String name)
      {
      super(name);
      rviden = new FieldDef("rviden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      rvclientedp = new FieldDef("rvclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      rvproduc = new FieldDef("rvproduc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      rvejer = new FieldDef("rvejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      rvperiodo = new FieldDef("rvperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      rvproceso = new FieldDef("rvproceso",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      rvconcep = new FieldDef("rvconcep",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      rvimporte = new FieldDef("rvimporte",FieldDef.FLOAT,6,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        rviden,
        rvclientedp,
        rvproduc,
        rvejer,
        rvperiodo,
        rvproceso,
        rvconcep,
        rvimporte        
        };
      setColumns(array);
      FieldDef arrayf[] = {rviden };
      setPrimaryKeys(arrayf);
      rviden.setAutoIncrementable(true);
      }
    }
    
  public class TabLabcontrato extends TableDef
    {
    // Campos
    public FieldDef ctcodigo;
    public FieldDef ctdesc;
    public TabLabcontrato(String name)
      {
      super(name);
      ctcodigo = new FieldDef("ctcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ctdesc = new FieldDef("ctdesc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        ctcodigo,
        ctdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {ctcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLabcontvence extends TableDef
    {
    // Campos
    public FieldDef cviden;
    public FieldDef cvclientedp;
    public FieldDef cvproduc;
    public FieldDef cvaccioncdp;
    public FieldDef cvcontrato;
    public FieldDef cvtextocdp;
    public FieldDef cvestado;
    public FieldDef cvtextodp;
    public TabLabcontvence(String name)
      {
      super(name);
      cviden = new FieldDef("cviden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cvclientedp = new FieldDef("cvclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cvproduc = new FieldDef("cvproduc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cvaccioncdp = new FieldDef("cvaccioncdp",FieldDef.INTEGER,0);
      cvcontrato = new FieldDef("cvcontrato",FieldDef.INTEGER,0);
      cvtextocdp = new FieldDef("cvtextocdp",FieldDef.CHAR,2000);
      cvestado = new FieldDef("cvestado",FieldDef.CHAR,3);
      cvtextodp = new FieldDef("cvtextodp",FieldDef.CHAR,2000);
      FieldDef array[] = {
        cviden,
        cvclientedp,
        cvproduc,
        cvaccioncdp,
        cvcontrato,
        cvtextocdp,
        cvestado,
        cvtextodp        
        };
      setColumns(array);
      FieldDef arrayf[] = {cviden };
      setPrimaryKeys(arrayf);
      cviden.setAutoIncrementable(true);
      }
    }
    
  public class TabLabit extends TableDef
    {
    // Campos
    public FieldDef itiden;
    public FieldDef itclientedp;
    public FieldDef itproduc;
    public FieldDef itejer;
    public FieldDef itperiodo;
    public FieldDef itproceso;
    public FieldDef itfecbaja;
    public FieldDef itfecalta;
    public FieldDef ittipo;
    public FieldDef itrecaida;
    public TabLabit(String name)
      {
      super(name);
      itiden = new FieldDef("itiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      itclientedp = new FieldDef("itclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      itproduc = new FieldDef("itproduc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      itejer = new FieldDef("itejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      itperiodo = new FieldDef("itperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      itproceso = new FieldDef("itproceso",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      itfecbaja = new FieldDef("itfecbaja",FieldDef.DATE);
      itfecalta = new FieldDef("itfecalta",FieldDef.DATE);
      ittipo = new FieldDef("ittipo",FieldDef.CHAR,2);
      itrecaida = new FieldDef("itrecaida",FieldDef.CHAR,1);
      FieldDef array[] = {
        itiden,
        itclientedp,
        itproduc,
        itejer,
        itperiodo,
        itproceso,
        itfecbaja,
        itfecalta,
        ittipo,
        itrecaida        
        };
      setColumns(array);
      FieldDef arrayf[] = {itiden };
      setPrimaryKeys(arrayf);
      itiden.setAutoIncrementable(true);
      }
    }
    
  public class TabControl extends TableDef
    {
    // Campos
    public FieldDef ctrtabla;
    public FieldDef ctriden;
    public FieldDef ctrestado;
    public FieldDef ctrfecalta;
    public FieldDef ctrfeccapt;
    public FieldDef ctrfecval;
    public FieldDef ctrfecultmodif;
    public FieldDef ctrclialta;
    public FieldDef ctrusralta;
    public FieldDef ctrclimodif;
    public FieldDef ctrusrmodif;
    public FieldDef ctrclicapt;
    public FieldDef ctrusrcapt;
    public FieldDef ctrclival;
    public FieldDef ctrusrval;
    public TabControl(String name)
      {
      super(name);
      ctrtabla = new FieldDef("ctrtabla",FieldDef.CHAR,15,FieldDef.NOTNULL);
      ctriden = new FieldDef("ctriden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ctrestado = new FieldDef("ctrestado",FieldDef.CHAR,1,FieldDef.NOTNULL);
      ctrfecalta = new FieldDef("ctrfecalta",FieldDef.DATE);
      ctrfeccapt = new FieldDef("ctrfeccapt",FieldDef.DATE);
      ctrfecval = new FieldDef("ctrfecval",FieldDef.DATE);
      ctrfecultmodif = new FieldDef("ctrfecultmodif",FieldDef.DATE);
      ctrclialta = new FieldDef("ctrclialta",FieldDef.CHAR,12);
      ctrusralta = new FieldDef("ctrusralta",FieldDef.CHAR,20);
      ctrclimodif = new FieldDef("ctrclimodif",FieldDef.CHAR,12);
      ctrusrmodif = new FieldDef("ctrusrmodif",FieldDef.CHAR,20);
      ctrclicapt = new FieldDef("ctrclicapt",FieldDef.CHAR,12);
      ctrusrcapt = new FieldDef("ctrusrcapt",FieldDef.CHAR,20);
      ctrclival = new FieldDef("ctrclival",FieldDef.CHAR,12);
      ctrusrval = new FieldDef("ctrusrval",FieldDef.CHAR,20);
      FieldDef array[] = {
        ctrtabla,
        ctriden,
        ctrestado,
        ctrfecalta,
        ctrfeccapt,
        ctrfecval,
        ctrfecultmodif,
        ctrclialta,
        ctrusralta,
        ctrclimodif,
        ctrusrmodif,
        ctrclicapt,
        ctrusrcapt,
        ctrclival,
        ctrusrval        
        };
      setColumns(array);
      FieldDef arrayf[] = {ctrtabla,ctriden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPubpdfref extends TableDef
    {
    // Campos
    public FieldDef pupdp;
    public FieldDef pupiden;
    public FieldDef pupclientedp;
    public FieldDef pupproducto;
    public FieldDef pupambito;
    public FieldDef puptitulo;
    public FieldDef pupdesc;
    public FieldDef pupfechacre;
    public FieldDef pupfechapub;
    public FieldDef pupfechalec;
    public FieldDef pupejer;
    public FieldDef pupperiodo;
    public FieldDef pupusuario;
    public FieldDef pupfechadel;
    public TabPubpdfref(String name)
      {
      super(name);
      pupdp = new FieldDef("pupdp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pupiden = new FieldDef("pupiden",FieldDef.CHAR,80,FieldDef.NOTNULL);
      pupclientedp = new FieldDef("pupclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      pupproducto = new FieldDef("pupproducto",FieldDef.CHAR,15);
      pupambito = new FieldDef("pupambito",FieldDef.CHAR,15);
      puptitulo = new FieldDef("puptitulo",FieldDef.CHAR,30);
      pupdesc = new FieldDef("pupdesc",FieldDef.CHAR,2000);
      pupfechacre = new FieldDef("pupfechacre",FieldDef.DATE);
      pupfechapub = new FieldDef("pupfechapub",FieldDef.DATE);
      pupfechalec = new FieldDef("pupfechalec",FieldDef.DATE);
      pupejer = new FieldDef("pupejer",FieldDef.INTEGER,0);
      pupperiodo = new FieldDef("pupperiodo",FieldDef.CHAR,2);
      pupusuario = new FieldDef("pupusuario",FieldDef.CHAR,20);
      pupfechadel = new FieldDef("pupfechadel",FieldDef.DATE);
      FieldDef array[] = {
        pupdp,
        pupiden,
        pupclientedp,
        pupproducto,
        pupambito,
        puptitulo,
        pupdesc,
        pupfechacre,
        pupfechapub,
        pupfechalec,
        pupejer,
        pupperiodo,
        pupusuario,
        pupfechadel        
        };
      setColumns(array);
      FieldDef arrayf[] = {pupdp,pupiden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEntrega extends TableDef
    {
    // Campos
    public FieldDef eniden;
    public FieldDef enemisor;
    public FieldDef enreceptor;
    public FieldDef entipoenv;
    public FieldDef encodigoenv;
    public FieldDef enfecha;
    public FieldDef enformato;
    public TabEntrega(String name)
      {
      super(name);
      eniden = new FieldDef("eniden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      enemisor = new FieldDef("enemisor",FieldDef.CHAR,12,FieldDef.NOTNULL);
      enreceptor = new FieldDef("enreceptor",FieldDef.CHAR,12,FieldDef.NOTNULL);
      entipoenv = new FieldDef("entipoenv",FieldDef.CHAR,1,FieldDef.NOTNULL);
      encodigoenv = new FieldDef("encodigoenv",FieldDef.INTEGER,0);
      enfecha = new FieldDef("enfecha",FieldDef.DATE);
      enformato = new FieldDef("enformato",FieldDef.CHAR,10);
      FieldDef array[] = {
        eniden,
        enemisor,
        enreceptor,
        entipoenv,
        encodigoenv,
        enfecha,
        enformato        
        };
      setColumns(array);
      FieldDef arrayf[] = {eniden };
      setPrimaryKeys(arrayf);
      eniden.setAutoIncrementable(true);
      }
    }
    
  public class TabPartetecnico extends TableDef
    {
    // Campos
    public FieldDef ptiden;
    public FieldDef ptcliente;
    public FieldDef ptproducto;
    public FieldDef ptfechain;
    public FieldDef pthorain;
    public FieldDef ptcontacto;
    public FieldDef pttelefono;
    public FieldDef ptfax;
    public FieldDef ptemail;
    public FieldDef ptaplicacion;
    public FieldDef ptversion;
    public FieldDef ptmenu;
    public FieldDef ptcodigoerr;
    public FieldDef ptgerundio;
    public FieldDef ptfichero;
    public FieldDef ptprograma;
    public FieldDef ptambito;
    public FieldDef ptentorno;
    public FieldDef pttipologia;
    public FieldDef pttitulo;
    public FieldDef ptdesc;
    public FieldDef ptarchivo;
    public FieldDef ptfechast;
    public FieldDef pttipoges;
    public FieldDef ptestado;
    public FieldDef ptrespuesta;
    public FieldDef ptfechares;
    public FieldDef pttecnico;
    public FieldDef ptcodigores;
    public FieldDef ptobservaciones;
    public FieldDef pturgencia;
    public FieldDef pttrucsin;
    public FieldDef pttrucsout;
    public FieldDef pttecnicosel;
    public FieldDef ptfecharecep;
    public FieldDef ptisoncrecsug;
    public FieldDef ptfecha1;
    public FieldDef pterrorparam;
    public FieldDef ptcontext;
    public FieldDef ptdemoraaten;
    public FieldDef ptdemorasolu;
    public TabPartetecnico(String name)
      {
      super(name);
      ptiden = new FieldDef("ptiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ptcliente = new FieldDef("ptcliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      ptproducto = new FieldDef("ptproducto",FieldDef.CHAR,15);
      ptfechain = new FieldDef("ptfechain",FieldDef.DATE);
      pthorain = new FieldDef("pthorain",FieldDef.CHAR,8);
      ptcontacto = new FieldDef("ptcontacto",FieldDef.CHAR,40);
      pttelefono = new FieldDef("pttelefono",FieldDef.CHAR,15);
      ptfax = new FieldDef("ptfax",FieldDef.CHAR,15);
      ptemail = new FieldDef("ptemail",FieldDef.CHAR,50);
      ptaplicacion = new FieldDef("ptaplicacion",FieldDef.CHAR,8);
      ptversion = new FieldDef("ptversion",FieldDef.CHAR,10);
      ptmenu = new FieldDef("ptmenu",FieldDef.CHAR,15);
      ptcodigoerr = new FieldDef("ptcodigoerr",FieldDef.CHAR,9);
      ptgerundio = new FieldDef("ptgerundio",FieldDef.CHAR,10);
      ptfichero = new FieldDef("ptfichero",FieldDef.CHAR,80);
      ptprograma = new FieldDef("ptprograma",FieldDef.CHAR,15);
      ptambito = new FieldDef("ptambito",FieldDef.CHAR,8);
      ptentorno = new FieldDef("ptentorno",FieldDef.CHAR,8);
      pttipologia = new FieldDef("pttipologia",FieldDef.CHAR,15);
      pttitulo = new FieldDef("pttitulo",FieldDef.CHAR,80);
      ptdesc = new FieldDef("ptdesc",FieldDef.CHAR,4000);
      ptarchivo = new FieldDef("ptarchivo",FieldDef.CHAR,30);
      ptfechast = new FieldDef("ptfechast",FieldDef.DATE);
      pttipoges = new FieldDef("pttipoges",FieldDef.CHAR,1);
      ptestado = new FieldDef("ptestado",FieldDef.CHAR,1);
      ptrespuesta = new FieldDef("ptrespuesta",FieldDef.CHAR,1);
      ptfechares = new FieldDef("ptfechares",FieldDef.DATE);
      pttecnico = new FieldDef("pttecnico",FieldDef.CHAR,20);
      ptcodigores = new FieldDef("ptcodigores",FieldDef.INTEGER,0);
      ptobservaciones = new FieldDef("ptobservaciones",FieldDef.CHAR,4000);
      pturgencia = new FieldDef("pturgencia",FieldDef.INTEGER,0);
      pttrucsin = new FieldDef("pttrucsin",FieldDef.INTEGER,0);
      pttrucsout = new FieldDef("pttrucsout",FieldDef.INTEGER,0);
      pttecnicosel = new FieldDef("pttecnicosel",FieldDef.CHAR,20);
      ptfecharecep = new FieldDef("ptfecharecep",FieldDef.DATE);
      ptisoncrecsug = new FieldDef("ptisoncrecsug",FieldDef.INTEGER,0);
      ptfecha1 = new FieldDef("ptfecha1",FieldDef.DATE);
      pterrorparam = new FieldDef("pterrorparam",FieldDef.CHAR,4000);
      ptcontext = new FieldDef("ptcontext",FieldDef.CHAR,60);
      ptdemoraaten = new FieldDef("ptdemoraaten",FieldDef.FLOAT,6,0);
      ptdemorasolu = new FieldDef("ptdemorasolu",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ptiden,
        ptcliente,
        ptproducto,
        ptfechain,
        pthorain,
        ptcontacto,
        pttelefono,
        ptfax,
        ptemail,
        ptaplicacion,
        ptversion,
        ptmenu,
        ptcodigoerr,
        ptgerundio,
        ptfichero,
        ptprograma,
        ptambito,
        ptentorno,
        pttipologia,
        pttitulo,
        ptdesc,
        ptarchivo,
        ptfechast,
        pttipoges,
        ptestado,
        ptrespuesta,
        ptfechares,
        pttecnico,
        ptcodigores,
        ptobservaciones,
        pturgencia,
        pttrucsin,
        pttrucsout,
        pttecnicosel,
        ptfecharecep,
        ptisoncrecsug,
        ptfecha1,
        pterrorparam,
        ptcontext,
        ptdemoraaten,
        ptdemorasolu        
        };
      setColumns(array);
      FieldDef arrayf[] = {ptiden };
      setPrimaryKeys(arrayf);
      ptiden.setAutoIncrementable(true);
      }
    }
    
  public class TabLink extends TableDef
    {
    // Campos
    public FieldDef lkiden;
    public FieldDef lkdesc;
    public FieldDef lkcliente;
    public FieldDef lkusalias;
    public FieldDef lkurl;
    public FieldDef lkambito;
    public TabLink(String name)
      {
      super(name);
      lkiden = new FieldDef("lkiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lkdesc = new FieldDef("lkdesc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lkcliente = new FieldDef("lkcliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      lkusalias = new FieldDef("lkusalias",FieldDef.CHAR,20);
      lkurl = new FieldDef("lkurl",FieldDef.CHAR,255);
      lkambito = new FieldDef("lkambito",FieldDef.CHAR,1);
      FieldDef array[] = {
        lkiden,
        lkdesc,
        lkcliente,
        lkusalias,
        lkurl,
        lkambito        
        };
      setColumns(array);
      FieldDef arrayf[] = {lkiden };
      setPrimaryKeys(arrayf);
      lkiden.setAutoIncrementable(true);
      }
    }
    
  public class TabGif extends TableDef
    {
    // Campos
    public FieldDef giiden;
    public FieldDef gidesc;
    public FieldDef gicliente;
    public FieldDef giusalias;
    public FieldDef giurl;
    public FieldDef giambito;
    public FieldDef gitipo;
    public TabGif(String name)
      {
      super(name);
      giiden = new FieldDef("giiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      gidesc = new FieldDef("gidesc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      gicliente = new FieldDef("gicliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      giusalias = new FieldDef("giusalias",FieldDef.CHAR,20);
      giurl = new FieldDef("giurl",FieldDef.CHAR,255);
      giambito = new FieldDef("giambito",FieldDef.CHAR,1);
      gitipo = new FieldDef("gitipo",FieldDef.CHAR,1);
      FieldDef array[] = {
        giiden,
        gidesc,
        gicliente,
        giusalias,
        giurl,
        giambito,
        gitipo        
        };
      setColumns(array);
      FieldDef arrayf[] = {giiden };
      setPrimaryKeys(arrayf);
      giiden.setAutoIncrementable(true);
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
    
  public class TabWebtxt extends TableDef
    {
    // Campos
    public FieldDef webprocedure;
    public FieldDef webidioma;
    public FieldDef weborden;
    public FieldDef webtexto;
    public TabWebtxt(String name)
      {
      super(name);
      webprocedure = new FieldDef("webprocedure",FieldDef.CHAR,50,FieldDef.NOTNULL);
      webidioma = new FieldDef("webidioma",FieldDef.CHAR,3,FieldDef.NOTNULL);
      weborden = new FieldDef("weborden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      webtexto = new FieldDef("webtexto",FieldDef.CHAR,300);
      FieldDef array[] = {
        webprocedure,
        webidioma,
        weborden,
        webtexto        
        };
      setColumns(array);
      FieldDef arrayf[] = {webprocedure,webidioma,weborden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDescarga extends TableDef
    {
    // Campos
    public FieldDef dsclientedp;
    public FieldDef dsejercicio;
    public FieldDef dsperiodo;
    public FieldDef dsobjeto;
    public FieldDef dsestado;
    public FieldDef dsaplicacion;
    public FieldDef dsuserdp;
    public FieldDef dsusercdp;
    public FieldDef dsfechadp;
    public FieldDef dsfechacdp;
    public FieldDef dsfechaestado;
    public TabDescarga(String name)
      {
      super(name);
      dsclientedp = new FieldDef("dsclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      dsejercicio = new FieldDef("dsejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dsperiodo = new FieldDef("dsperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dsobjeto = new FieldDef("dsobjeto",FieldDef.CHAR,15,FieldDef.NOTNULL);
      dsestado = new FieldDef("dsestado",FieldDef.CHAR,1);
      dsaplicacion = new FieldDef("dsaplicacion",FieldDef.CHAR,8);
      dsuserdp = new FieldDef("dsuserdp",FieldDef.CHAR,20);
      dsusercdp = new FieldDef("dsusercdp",FieldDef.CHAR,20);
      dsfechadp = new FieldDef("dsfechadp",FieldDef.DATE);
      dsfechacdp = new FieldDef("dsfechacdp",FieldDef.DATE);
      dsfechaestado = new FieldDef("dsfechaestado",FieldDef.DATE);
      FieldDef array[] = {
        dsclientedp,
        dsejercicio,
        dsperiodo,
        dsobjeto,
        dsestado,
        dsaplicacion,
        dsuserdp,
        dsusercdp,
        dsfechadp,
        dsfechacdp,
        dsfechaestado        
        };
      setColumns(array);
      FieldDef arrayf[] = {dsclientedp,dsejercicio,dsperiodo,dsobjeto };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabTransaccion extends TableDef
    {
    // Campos
    public FieldDef tsiden;
    public FieldDef tscliente;
    public FieldDef tsidtrans;
    public FieldDef tsfechatrans;
    public FieldDef tscodaprobacion;
    public FieldDef tscoderror;
    public FieldDef tsimportetotal;
    public FieldDef tsfechageyce;
    public FieldDef tsnumfac;
    public FieldDef tsestado;
    public FieldDef tsseriefac;
    public FieldDef tsnumven;
    public FieldDef tsfechavenc;
    public FieldDef tsrefpedido;
    public FieldDef tsfpago;
    public FieldDef tsestadorec;
    public FieldDef tsfechacobro;
    public FieldDef tsbanc;
    public FieldDef tsimportebase;
    public FieldDef tspordto;
    public FieldDef tsimportedto;
    public FieldDef tsporiva;
    public FieldDef tsimporteiva;
    public FieldDef tsgastosdev;
    public FieldDef tsempresagyc;
    public FieldDef tsmotivoimpago;
    public FieldDef tsdesc12;
    public FieldDef tsdesc21;
    public FieldDef tsdesc22;
    public FieldDef tsdesc41;
    public FieldDef tsdesc42;
    public FieldDef tssubcta;
    public FieldDef tsnumrec;
    public FieldDef tsobser;
    public TabTransaccion(String name)
      {
      super(name);
      tsiden = new FieldDef("tsiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tscliente = new FieldDef("tscliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      tsidtrans = new FieldDef("tsidtrans",FieldDef.CHAR,30);
      tsfechatrans = new FieldDef("tsfechatrans",FieldDef.DATE);
      tscodaprobacion = new FieldDef("tscodaprobacion",FieldDef.CHAR,30);
      tscoderror = new FieldDef("tscoderror",FieldDef.CHAR,30);
      tsimportetotal = new FieldDef("tsimportetotal",FieldDef.FLOAT,6,0);
      tsfechageyce = new FieldDef("tsfechageyce",FieldDef.DATE);
      tsnumfac = new FieldDef("tsnumfac",FieldDef.INTEGER,0);
      tsestado = new FieldDef("tsestado",FieldDef.CHAR,1);
      tsseriefac = new FieldDef("tsseriefac",FieldDef.CHAR,1);
      tsnumven = new FieldDef("tsnumven",FieldDef.INTEGER,0);
      tsfechavenc = new FieldDef("tsfechavenc",FieldDef.DATE);
      tsrefpedido = new FieldDef("tsrefpedido",FieldDef.CHAR,15);
      tsfpago = new FieldDef("tsfpago",FieldDef.CHAR,1);
      tsestadorec = new FieldDef("tsestadorec",FieldDef.CHAR,1);
      tsfechacobro = new FieldDef("tsfechacobro",FieldDef.DATE);
      tsbanc = new FieldDef("tsbanc",FieldDef.CHAR,4);
      tsimportebase = new FieldDef("tsimportebase",FieldDef.FLOAT,6,0);
      tspordto = new FieldDef("tspordto",FieldDef.FLOAT,6,0);
      tsimportedto = new FieldDef("tsimportedto",FieldDef.FLOAT,6,0);
      tsporiva = new FieldDef("tsporiva",FieldDef.FLOAT,6,0);
      tsimporteiva = new FieldDef("tsimporteiva",FieldDef.FLOAT,6,0);
      tsgastosdev = new FieldDef("tsgastosdev",FieldDef.FLOAT,6,0);
      tsempresagyc = new FieldDef("tsempresagyc",FieldDef.INTEGER,0);
      tsmotivoimpago = new FieldDef("tsmotivoimpago",FieldDef.CHAR,2);
      tsdesc12 = new FieldDef("tsdesc12",FieldDef.CHAR,40);
      tsdesc21 = new FieldDef("tsdesc21",FieldDef.CHAR,40);
      tsdesc22 = new FieldDef("tsdesc22",FieldDef.CHAR,40);
      tsdesc41 = new FieldDef("tsdesc41",FieldDef.CHAR,40);
      tsdesc42 = new FieldDef("tsdesc42",FieldDef.CHAR,40);
      tssubcta = new FieldDef("tssubcta",FieldDef.CHAR,15);
      tsnumrec = new FieldDef("tsnumrec",FieldDef.INTEGER,0);
      tsobser = new FieldDef("tsobser",FieldDef.CHAR,2000);
      FieldDef array[] = {
        tsiden,
        tscliente,
        tsidtrans,
        tsfechatrans,
        tscodaprobacion,
        tscoderror,
        tsimportetotal,
        tsfechageyce,
        tsnumfac,
        tsestado,
        tsseriefac,
        tsnumven,
        tsfechavenc,
        tsrefpedido,
        tsfpago,
        tsestadorec,
        tsfechacobro,
        tsbanc,
        tsimportebase,
        tspordto,
        tsimportedto,
        tsporiva,
        tsimporteiva,
        tsgastosdev,
        tsempresagyc,
        tsmotivoimpago,
        tsdesc12,
        tsdesc21,
        tsdesc22,
        tsdesc41,
        tsdesc42,
        tssubcta,
        tsnumrec,
        tsobser        
        };
      setColumns(array);
      FieldDef arrayf[] = {tsiden };
      setPrimaryKeys(arrayf);
      tsiden.setAutoIncrementable(true);
      }
    }
    
  public class TabTransacciondet extends TableDef
    {
    // Campos
    public FieldDef tdtransaccion;
    public FieldDef tdlinea;
    public FieldDef tdcontratado;
    public FieldDef tdproducto;
    public FieldDef tdunidades;
    public FieldDef tdprecio;
    public FieldDef tdpordto;
    public FieldDef tddto;
    public FieldDef tdiva;
    public FieldDef tdimporte;
    public FieldDef tdfechageyce;
    public FieldDef tddesc;
    public FieldDef tdfechafin;
    public FieldDef tdsubcta;
    public TabTransacciondet(String name)
      {
      super(name);
      tdtransaccion = new FieldDef("tdtransaccion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tdlinea = new FieldDef("tdlinea",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tdcontratado = new FieldDef("tdcontratado",FieldDef.INTEGER,0);
      tdproducto = new FieldDef("tdproducto",FieldDef.CHAR,15);
      tdunidades = new FieldDef("tdunidades",FieldDef.FLOAT,6,0);
      tdprecio = new FieldDef("tdprecio",FieldDef.FLOAT,6,0);
      tdpordto = new FieldDef("tdpordto",FieldDef.FLOAT,6,0);
      tddto = new FieldDef("tddto",FieldDef.FLOAT,6,0);
      tdiva = new FieldDef("tdiva",FieldDef.FLOAT,6,0);
      tdimporte = new FieldDef("tdimporte",FieldDef.FLOAT,6,0);
      tdfechageyce = new FieldDef("tdfechageyce",FieldDef.DATE);
      tddesc = new FieldDef("tddesc",FieldDef.CHAR,80);
      tdfechafin = new FieldDef("tdfechafin",FieldDef.DATE);
      tdsubcta = new FieldDef("tdsubcta",FieldDef.CHAR,15);
      FieldDef array[] = {
        tdtransaccion,
        tdlinea,
        tdcontratado,
        tdproducto,
        tdunidades,
        tdprecio,
        tdpordto,
        tddto,
        tdiva,
        tdimporte,
        tdfechageyce,
        tddesc,
        tdfechafin,
        tdsubcta        
        };
      setColumns(array);
      FieldDef arrayf[] = {tdtransaccion,tdlinea };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSeminario extends TableDef
    {
    // Campos
    public FieldDef seseminario;
    public FieldDef secliente;
    public FieldDef seconfirma;
    public FieldDef sedocum;
    public FieldDef secontacto;
    public FieldDef seasistentes;
    public FieldDef selugar;
    public FieldDef sereservadesde;
    public FieldDef secargo;
    public FieldDef sefechareserva;
    public FieldDef seusuario;
    public TabSeminario(String name)
      {
      super(name);
      seseminario = new FieldDef("seseminario",FieldDef.CHAR,15,FieldDef.NOTNULL);
      secliente = new FieldDef("secliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      seconfirma = new FieldDef("seconfirma",FieldDef.CHAR,1);
      sedocum = new FieldDef("sedocum",FieldDef.CHAR,1);
      secontacto = new FieldDef("secontacto",FieldDef.CHAR,45);
      seasistentes = new FieldDef("seasistentes",FieldDef.INTEGER,0);
      selugar = new FieldDef("selugar",FieldDef.CHAR,20);
      sereservadesde = new FieldDef("sereservadesde",FieldDef.CHAR,10);
      secargo = new FieldDef("secargo",FieldDef.CHAR,45);
      sefechareserva = new FieldDef("sefechareserva",FieldDef.DATE);
      seusuario = new FieldDef("seusuario",FieldDef.CHAR,20);
      FieldDef array[] = {
        seseminario,
        secliente,
        seconfirma,
        sedocum,
        secontacto,
        seasistentes,
        selugar,
        sereservadesde,
        secargo,
        sefechareserva,
        seusuario        
        };
      setColumns(array);
      FieldDef arrayf[] = {seseminario,secliente };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPostit extends TableDef
    {
    // Campos
    public FieldDef psiden;
    public FieldDef pstexto;
    public FieldDef pscolor;
    public FieldDef psdataini;
    public FieldDef psdatafin;
    public FieldDef psenlace;
    public FieldDef psancho;
    public FieldDef psalto;
    public FieldDef psposix;
    public FieldDef psposiy;
    public FieldDef psfuente;
    public FieldDef pssize;
    public FieldDef psnegrita;
    public FieldDef pstxtlink;
    public TabPostit(String name)
      {
      super(name);
      psiden = new FieldDef("psiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pstexto = new FieldDef("pstexto",FieldDef.CHAR,255,FieldDef.NOTNULL);
      pscolor = new FieldDef("pscolor",FieldDef.CHAR,6);
      psdataini = new FieldDef("psdataini",FieldDef.DATE);
      psdatafin = new FieldDef("psdatafin",FieldDef.DATE);
      psenlace = new FieldDef("psenlace",FieldDef.CHAR,200);
      psancho = new FieldDef("psancho",FieldDef.INTEGER,0);
      psalto = new FieldDef("psalto",FieldDef.INTEGER,0);
      psposix = new FieldDef("psposix",FieldDef.INTEGER,0);
      psposiy = new FieldDef("psposiy",FieldDef.INTEGER,0);
      psfuente = new FieldDef("psfuente",FieldDef.CHAR,200);
      pssize = new FieldDef("pssize",FieldDef.INTEGER,0);
      psnegrita = new FieldDef("psnegrita",FieldDef.CHAR,1);
      pstxtlink = new FieldDef("pstxtlink",FieldDef.CHAR,30);
      FieldDef array[] = {
        psiden,
        pstexto,
        pscolor,
        psdataini,
        psdatafin,
        psenlace,
        psancho,
        psalto,
        psposix,
        psposiy,
        psfuente,
        pssize,
        psnegrita,
        pstxtlink        
        };
      setColumns(array);
      FieldDef arrayf[] = {psiden };
      setPrimaryKeys(arrayf);
      psiden.setAutoIncrementable(true);
      }
    }
    
  public class TabCurso extends TableDef
    {
    // Campos
    public FieldDef cucodi;
    public FieldDef culogo;
    public FieldDef cutitulo;
    public FieldDef cudescrip;
    public FieldDef curequisit;
    public FieldDef cuescurso;
    public TabCurso(String name)
      {
      super(name);
      cucodi = new FieldDef("cucodi",FieldDef.CHAR,15,FieldDef.NOTNULL);
      culogo = new FieldDef("culogo",FieldDef.CHAR,20);
      cutitulo = new FieldDef("cutitulo",FieldDef.CHAR,2000);
      cudescrip = new FieldDef("cudescrip",FieldDef.CHAR,4000);
      curequisit = new FieldDef("curequisit",FieldDef.CHAR,4000);
      cuescurso = new FieldDef("cuescurso",FieldDef.CHAR,1);
      FieldDef array[] = {
        cucodi,
        culogo,
        cutitulo,
        cudescrip,
        curequisit,
        cuescurso        
        };
      setColumns(array);
      FieldDef arrayf[] = {cucodi };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabConvocatorias extends TableDef
    {
    // Campos
    public FieldDef cnvcodi;
    public FieldDef cnvcodicurs;
    public FieldDef cnvprecio;
    public FieldDef cnvdias;
    public FieldDef cnvdataini;
    public FieldDef cnvdatafin;
    public FieldDef cnvdurhoras;
    public FieldDef cnvhorari;
    public FieldDef cnvlugar;
    public FieldDef cnvmapa;
    public FieldDef cnvdireccion;
    public TabConvocatorias(String name)
      {
      super(name);
      cnvcodi = new FieldDef("cnvcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnvcodicurs = new FieldDef("cnvcodicurs",FieldDef.CHAR,15);
      cnvprecio = new FieldDef("cnvprecio",FieldDef.FLOAT,6,0);
      cnvdias = new FieldDef("cnvdias",FieldDef.INTEGER,0);
      cnvdataini = new FieldDef("cnvdataini",FieldDef.DATE);
      cnvdatafin = new FieldDef("cnvdatafin",FieldDef.DATE);
      cnvdurhoras = new FieldDef("cnvdurhoras",FieldDef.FLOAT,6,0);
      cnvhorari = new FieldDef("cnvhorari",FieldDef.CHAR,4000);
      cnvlugar = new FieldDef("cnvlugar",FieldDef.CHAR,20);
      cnvmapa = new FieldDef("cnvmapa",FieldDef.CHAR,20);
      cnvdireccion = new FieldDef("cnvdireccion",FieldDef.CHAR,200);
      FieldDef array[] = {
        cnvcodi,
        cnvcodicurs,
        cnvprecio,
        cnvdias,
        cnvdataini,
        cnvdatafin,
        cnvdurhoras,
        cnvhorari,
        cnvlugar,
        cnvmapa,
        cnvdireccion        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnvcodi };
      setPrimaryKeys(arrayf);
      cnvcodi.setAutoIncrementable(true);
      }
    }
    
  public class TabReservas extends TableDef
    {
    // Campos
    public FieldDef residen;
    public FieldDef resconvocatoria;
    public FieldDef restipo;
    public FieldDef resdominio;
    public FieldDef resreferencia;
    public FieldDef resconfirma;
    public FieldDef resdocum;
    public FieldDef rescontacto;
    public FieldDef resasistentes;
    public FieldDef reslugar;
    public FieldDef resreservadesde;
    public FieldDef rescargo;
    public FieldDef resfechareserva;
    public FieldDef resusuario;
    public TabReservas(String name)
      {
      super(name);
      residen = new FieldDef("residen",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      resconvocatoria = new FieldDef("resconvocatoria",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      restipo = new FieldDef("restipo",FieldDef.CHAR,1);
      resdominio = new FieldDef("resdominio",FieldDef.CHAR,12);
      resreferencia = new FieldDef("resreferencia",FieldDef.CHAR,12);
      resconfirma = new FieldDef("resconfirma",FieldDef.CHAR,1);
      resdocum = new FieldDef("resdocum",FieldDef.CHAR,1);
      rescontacto = new FieldDef("rescontacto",FieldDef.CHAR,45);
      resasistentes = new FieldDef("resasistentes",FieldDef.INTEGER,0);
      reslugar = new FieldDef("reslugar",FieldDef.CHAR,20);
      resreservadesde = new FieldDef("resreservadesde",FieldDef.CHAR,10);
      rescargo = new FieldDef("rescargo",FieldDef.CHAR,45);
      resfechareserva = new FieldDef("resfechareserva",FieldDef.DATE);
      resusuario = new FieldDef("resusuario",FieldDef.CHAR,20);
      FieldDef array[] = {
        residen,
        resconvocatoria,
        restipo,
        resdominio,
        resreferencia,
        resconfirma,
        resdocum,
        rescontacto,
        resasistentes,
        reslugar,
        resreservadesde,
        rescargo,
        resfechareserva,
        resusuario        
        };
      setColumns(array);
      FieldDef arrayf[] = {residen };
      setPrimaryKeys(arrayf);
      residen.setAutoIncrementable(true);
      }
    }
    
  public class TabEstadis extends TableDef
    {
    // Campos
    public FieldDef estcodi;
    public FieldDef estagrup;
    public FieldDef estfecha;
    public FieldDef esti1;
    public FieldDef esti2;
    public FieldDef esti3;
    public FieldDef esti4;
    public FieldDef esti5;
    public FieldDef esti6;
    public FieldDef esti7;
    public FieldDef esti8;
    public FieldDef esti9;
    public FieldDef esti10;
    public FieldDef esti11;
    public FieldDef esti12;
    public FieldDef esti13;
    public FieldDef esti14;
    public FieldDef esti15;
    public FieldDef esti16;
    public FieldDef esti17;
    public FieldDef esti18;
    public FieldDef esti19;
    public FieldDef esti20;
    public FieldDef esti21;
    public FieldDef esti22;
    public TabEstadis(String name)
      {
      super(name);
      estcodi = new FieldDef("estcodi",FieldDef.CHAR,15,FieldDef.NOTNULL);
      estagrup = new FieldDef("estagrup",FieldDef.CHAR,10,FieldDef.NOTNULL);
      estfecha = new FieldDef("estfecha",FieldDef.DATE,FieldDef.NOTNULL);
      esti1 = new FieldDef("esti1",FieldDef.INTEGER,0);
      esti2 = new FieldDef("esti2",FieldDef.INTEGER,0);
      esti3 = new FieldDef("esti3",FieldDef.INTEGER,0);
      esti4 = new FieldDef("esti4",FieldDef.INTEGER,0);
      esti5 = new FieldDef("esti5",FieldDef.INTEGER,0);
      esti6 = new FieldDef("esti6",FieldDef.INTEGER,0);
      esti7 = new FieldDef("esti7",FieldDef.INTEGER,0);
      esti8 = new FieldDef("esti8",FieldDef.INTEGER,0);
      esti9 = new FieldDef("esti9",FieldDef.INTEGER,0);
      esti10 = new FieldDef("esti10",FieldDef.INTEGER,0);
      esti11 = new FieldDef("esti11",FieldDef.INTEGER,0);
      esti12 = new FieldDef("esti12",FieldDef.INTEGER,0);
      esti13 = new FieldDef("esti13",FieldDef.INTEGER,0);
      esti14 = new FieldDef("esti14",FieldDef.INTEGER,0);
      esti15 = new FieldDef("esti15",FieldDef.INTEGER,0);
      esti16 = new FieldDef("esti16",FieldDef.INTEGER,0);
      esti17 = new FieldDef("esti17",FieldDef.INTEGER,0);
      esti18 = new FieldDef("esti18",FieldDef.INTEGER,0);
      esti19 = new FieldDef("esti19",FieldDef.INTEGER,0);
      esti20 = new FieldDef("esti20",FieldDef.INTEGER,0);
      esti21 = new FieldDef("esti21",FieldDef.INTEGER,0);
      esti22 = new FieldDef("esti22",FieldDef.INTEGER,0);
      FieldDef array[] = {
        estcodi,
        estagrup,
        estfecha,
        esti1,
        esti2,
        esti3,
        esti4,
        esti5,
        esti6,
        esti7,
        esti8,
        esti9,
        esti10,
        esti11,
        esti12,
        esti13,
        esti14,
        esti15,
        esti16,
        esti17,
        esti18,
        esti19,
        esti20,
        esti21,
        esti22        
        };
      setColumns(array);
      FieldDef arrayf[] = {estcodi,estagrup,estfecha };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCpcomer extends TableDef
    {
    // Campos
    public FieldDef cpcprefixe;
    public FieldDef cpcdelegacion;
    public FieldDef cpccomer;
    public TabCpcomer(String name)
      {
      super(name);
      cpcprefixe = new FieldDef("cpcprefixe",FieldDef.CHAR,3,FieldDef.NOTNULL);
      cpcdelegacion = new FieldDef("cpcdelegacion",FieldDef.CHAR,10);
      cpccomer = new FieldDef("cpccomer",FieldDef.CHAR,10);
      FieldDef array[] = {
        cpcprefixe,
        cpcdelegacion,
        cpccomer        
        };
      setColumns(array);
      FieldDef arrayf[] = {cpcprefixe };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabComseg extends TableDef
    {
    // Campos
    public FieldDef comiden;
    public FieldDef comdominio;
    public FieldDef comusuario;
    public FieldDef comfechamov;
    public FieldDef comtipocli;
    public FieldDef comcliente;
    public FieldDef comusuariocli;
    public FieldDef comestado;
    public FieldDef comfechanext;
    public FieldDef comtipomov;
    public FieldDef comtexto;
    public FieldDef comtipocon;
    public FieldDef comduracion;
    public TabComseg(String name)
      {
      super(name);
      comiden = new FieldDef("comiden",FieldDef.INTEGER,0);
      comdominio = new FieldDef("comdominio",FieldDef.CHAR,12);
      comusuario = new FieldDef("comusuario",FieldDef.CHAR,20);
      comfechamov = new FieldDef("comfechamov",FieldDef.DATE);
      comtipocli = new FieldDef("comtipocli",FieldDef.CHAR,1);
      comcliente = new FieldDef("comcliente",FieldDef.CHAR,12);
      comusuariocli = new FieldDef("comusuariocli",FieldDef.CHAR,20);
      comestado = new FieldDef("comestado",FieldDef.CHAR,1);
      comfechanext = new FieldDef("comfechanext",FieldDef.DATE);
      comtipomov = new FieldDef("comtipomov",FieldDef.CHAR,30);
      comtexto = new FieldDef("comtexto",FieldDef.CHAR,2000);
      comtipocon = new FieldDef("comtipocon",FieldDef.CHAR,2);
      comduracion = new FieldDef("comduracion",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        comiden,
        comdominio,
        comusuario,
        comfechamov,
        comtipocli,
        comcliente,
        comusuariocli,
        comestado,
        comfechanext,
        comtipomov,
        comtexto,
        comtipocon,
        comduracion        
        };
      setColumns(array);
      FieldDef arrayf[] = {comiden };
      setPrimaryKeys(arrayf);
      comiden.setAutoIncrementable(true);
      }
    }
    
  public class TabObjectius extends TableDef
    {
    // Campos
    public FieldDef estcodi;
    public FieldDef estagrup;
    public FieldDef estfecha;
    public FieldDef esto1;
    public FieldDef esto2;
    public FieldDef esto3;
    public FieldDef esto4;
    public FieldDef esto5;
    public FieldDef esto6;
    public FieldDef esto7;
    public FieldDef esto8;
    public FieldDef esto9;
    public FieldDef esto10;
    public FieldDef esto11;
    public FieldDef esto12;
    public FieldDef esto13;
    public FieldDef esto14;
    public FieldDef esto15;
    public FieldDef esto16;
    public FieldDef esto17;
    public FieldDef esto18;
    public FieldDef esto19;
    public FieldDef esto20;
    public FieldDef esto21;
    public FieldDef esto22;
    public TabObjectius(String name)
      {
      super(name);
      estcodi = new FieldDef("estcodi",FieldDef.CHAR,15,FieldDef.NOTNULL);
      estagrup = new FieldDef("estagrup",FieldDef.CHAR,10,FieldDef.NOTNULL);
      estfecha = new FieldDef("estfecha",FieldDef.DATE,FieldDef.NOTNULL);
      esto1 = new FieldDef("esto1",FieldDef.INTEGER,0);
      esto2 = new FieldDef("esto2",FieldDef.INTEGER,0);
      esto3 = new FieldDef("esto3",FieldDef.INTEGER,0);
      esto4 = new FieldDef("esto4",FieldDef.INTEGER,0);
      esto5 = new FieldDef("esto5",FieldDef.INTEGER,0);
      esto6 = new FieldDef("esto6",FieldDef.INTEGER,0);
      esto7 = new FieldDef("esto7",FieldDef.INTEGER,0);
      esto8 = new FieldDef("esto8",FieldDef.INTEGER,0);
      esto9 = new FieldDef("esto9",FieldDef.INTEGER,0);
      esto10 = new FieldDef("esto10",FieldDef.INTEGER,0);
      esto11 = new FieldDef("esto11",FieldDef.INTEGER,0);
      esto12 = new FieldDef("esto12",FieldDef.INTEGER,0);
      esto13 = new FieldDef("esto13",FieldDef.INTEGER,0);
      esto14 = new FieldDef("esto14",FieldDef.INTEGER,0);
      esto15 = new FieldDef("esto15",FieldDef.INTEGER,0);
      esto16 = new FieldDef("esto16",FieldDef.INTEGER,0);
      esto17 = new FieldDef("esto17",FieldDef.INTEGER,0);
      esto18 = new FieldDef("esto18",FieldDef.INTEGER,0);
      esto19 = new FieldDef("esto19",FieldDef.INTEGER,0);
      esto20 = new FieldDef("esto20",FieldDef.INTEGER,0);
      esto21 = new FieldDef("esto21",FieldDef.INTEGER,0);
      esto22 = new FieldDef("esto22",FieldDef.INTEGER,0);
      FieldDef array[] = {
        estcodi,
        estagrup,
        estfecha,
        esto1,
        esto2,
        esto3,
        esto4,
        esto5,
        esto6,
        esto7,
        esto8,
        esto9,
        esto10,
        esto11,
        esto12,
        esto13,
        esto14,
        esto15,
        esto16,
        esto17,
        esto18,
        esto19,
        esto20,
        esto21,
        esto22        
        };
      setColumns(array);
      FieldDef arrayf[] = {estcodi,estagrup,estfecha };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabStparams extends TableDef
    {
    // Campos
    public FieldDef stpdomini;
    public FieldDef stplots;
    public TabStparams(String name)
      {
      super(name);
      stpdomini = new FieldDef("stpdomini",FieldDef.CHAR,12,FieldDef.NOTNULL);
      stplots = new FieldDef("stplots",FieldDef.INTEGER,0);
      FieldDef array[] = {
        stpdomini,
        stplots        
        };
      setColumns(array);
      FieldDef arrayf[] = {stpdomini };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEstattec extends TableDef
    {
    // Campos
    public FieldDef tecusuari;
    public FieldDef tecestat;
    public FieldDef tecclient;
    public FieldDef tecextensio;
    public FieldDef tecsqlobjectiu;
    public FieldDef tecvalobjectiu;
    public TabEstattec(String name)
      {
      super(name);
      tecusuari = new FieldDef("tecusuari",FieldDef.CHAR,20,FieldDef.NOTNULL);
      tecestat = new FieldDef("tecestat",FieldDef.CHAR,2,FieldDef.NOTNULL);
      tecclient = new FieldDef("tecclient",FieldDef.CHAR,12);
      tecextensio = new FieldDef("tecextensio",FieldDef.CHAR,8);
      tecsqlobjectiu = new FieldDef("tecsqlobjectiu",FieldDef.CHAR,512);
      tecvalobjectiu = new FieldDef("tecvalobjectiu",FieldDef.CHAR,15);
      FieldDef array[] = {
        tecusuari,
        tecestat,
        tecclient,
        tecextensio,
        tecsqlobjectiu,
        tecvalobjectiu        
        };
      setColumns(array);
      FieldDef arrayf[] = {tecusuari };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabServei extends TableDef
    {
    // Campos
    public FieldDef srvcodi;
    public FieldDef srvdesc;
    public FieldDef srvsqlobjectiu;
    public FieldDef srvvalobjectiu;
    public TabServei(String name)
      {
      super(name);
      srvcodi = new FieldDef("srvcodi",FieldDef.CHAR,8,FieldDef.NOTNULL);
      srvdesc = new FieldDef("srvdesc",FieldDef.CHAR,45);
      srvsqlobjectiu = new FieldDef("srvsqlobjectiu",FieldDef.CHAR,512);
      srvvalobjectiu = new FieldDef("srvvalobjectiu",FieldDef.CHAR,15);
      FieldDef array[] = {
        srvcodi,
        srvdesc,
        srvsqlobjectiu,
        srvvalobjectiu        
        };
      setColumns(array);
      FieldDef arrayf[] = {srvcodi };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabServtec extends TableDef
    {
    // Campos
    public FieldDef srtiden;
    public FieldDef srtdominio;
    public FieldDef srttecnic;
    public FieldDef srtambit;
    public FieldDef srtaplicacio;
    public FieldDef srtlock;
    public TabServtec(String name)
      {
      super(name);
      srtiden = new FieldDef("srtiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      srtdominio = new FieldDef("srtdominio",FieldDef.CHAR,12);
      srttecnic = new FieldDef("srttecnic",FieldDef.CHAR,20,FieldDef.NOTNULL);
      srtambit = new FieldDef("srtambit",FieldDef.CHAR,8);
      srtaplicacio = new FieldDef("srtaplicacio",FieldDef.CHAR,8);
      srtlock = new FieldDef("srtlock",FieldDef.CHAR,1);
      FieldDef array[] = {
        srtiden,
        srtdominio,
        srttecnic,
        srtambit,
        srtaplicacio,
        srtlock        
        };
      setColumns(array);
      FieldDef arrayf[] = {srtiden };
      setPrimaryKeys(arrayf);
      srtiden.setAutoIncrementable(true);
      }
    }
    
  public class TabCampanya extends TableDef
    {
    // Campos
    public FieldDef cmpcodigo;
    public FieldDef cmptitulo;
    public FieldDef cmpdesc;
    public FieldDef cmpfechacre;
    public FieldDef cmpfechavis;
    public FieldDef cmpfechacad;
    public FieldDef cmpvisible;
    public FieldDef cmpxsl;
    public FieldDef cmpambito;
    public FieldDef cmpaplic;
    public FieldDef cmplogo;
    public TabCampanya(String name)
      {
      super(name);
      cmpcodigo = new FieldDef("cmpcodigo",FieldDef.CHAR,30,FieldDef.NOTNULL);
      cmptitulo = new FieldDef("cmptitulo",FieldDef.CHAR,80);
      cmpdesc = new FieldDef("cmpdesc",FieldDef.CHAR,255);
      cmpfechacre = new FieldDef("cmpfechacre",FieldDef.DATE);
      cmpfechavis = new FieldDef("cmpfechavis",FieldDef.DATE);
      cmpfechacad = new FieldDef("cmpfechacad",FieldDef.DATE);
      cmpvisible = new FieldDef("cmpvisible",FieldDef.CHAR,1);
      cmpxsl = new FieldDef("cmpxsl",FieldDef.CHAR,255);
      cmpambito = new FieldDef("cmpambito",FieldDef.CHAR,7);
      cmpaplic = new FieldDef("cmpaplic",FieldDef.CHAR,8);
      cmplogo = new FieldDef("cmplogo",FieldDef.CHAR,255);
      FieldDef array[] = {
        cmpcodigo,
        cmptitulo,
        cmpdesc,
        cmpfechacre,
        cmpfechavis,
        cmpfechacad,
        cmpvisible,
        cmpxsl,
        cmpambito,
        cmpaplic,
        cmplogo        
        };
      setColumns(array);
      FieldDef arrayf[] = {cmpcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCampamir extends TableDef
    {
    // Campos
    public FieldDef camcodigo;
    public FieldDef camusuario;
    public FieldDef camfecha;
    public FieldDef camrespuesta;
    public FieldDef camfechaseg;
    public FieldDef camcomen;
    public FieldDef camestado;
    public FieldDef camnpacks;
    public FieldDef camcampanya;
    public FieldDef camtecnico;
    public TabCampamir(String name)
      {
      super(name);
      camcodigo = new FieldDef("camcodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      camusuario = new FieldDef("camusuario",FieldDef.CHAR,20);
      camfecha = new FieldDef("camfecha",FieldDef.DATE);
      camrespuesta = new FieldDef("camrespuesta",FieldDef.CHAR,1);
      camfechaseg = new FieldDef("camfechaseg",FieldDef.DATE);
      camcomen = new FieldDef("camcomen",FieldDef.CHAR,2000);
      camestado = new FieldDef("camestado",FieldDef.CHAR,1);
      camnpacks = new FieldDef("camnpacks",FieldDef.INTEGER,0);
      camcampanya = new FieldDef("camcampanya",FieldDef.CHAR,15);
      camtecnico = new FieldDef("camtecnico",FieldDef.CHAR,20);
      FieldDef array[] = {
        camcodigo,
        camusuario,
        camfecha,
        camrespuesta,
        camfechaseg,
        camcomen,
        camestado,
        camnpacks,
        camcampanya,
        camtecnico        
        };
      setColumns(array);
      FieldDef arrayf[] = {camcampanya,camcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabImpactos extends TableDef
    {
    // Campos
    public FieldDef impcodigo;
    public FieldDef impusuario;
    public FieldDef imprefer;
    public FieldDef impfechault;
    public FieldDef impcontador;
    public FieldDef impsegundosacum;
    public TabImpactos(String name)
      {
      super(name);
      impcodigo = new FieldDef("impcodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      impusuario = new FieldDef("impusuario",FieldDef.CHAR,20,FieldDef.NOTNULL);
      imprefer = new FieldDef("imprefer",FieldDef.CHAR,15,FieldDef.NOTNULL);
      impfechault = new FieldDef("impfechault",FieldDef.DATE);
      impcontador = new FieldDef("impcontador",FieldDef.INTEGER,0);
      impsegundosacum = new FieldDef("impsegundosacum",FieldDef.INTEGER,0);
      FieldDef array[] = {
        impcodigo,
        impusuario,
        imprefer,
        impfechault,
        impcontador,
        impsegundosacum        
        };
      setColumns(array);
      FieldDef arrayf[] = {impcodigo,impusuario,imprefer };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabJars extends TableDef
    {
    // Campos
    public FieldDef jarversion;
    public FieldDef jarnom;
    public FieldDef jarordre;
    public FieldDef jardesc;
    public FieldDef jarfechadisp;
    public FieldDef jarversio;
    public FieldDef jartipo;
    public FieldDef jarnivelact;
    public FieldDef jarcarpeta;
    public TabJars(String name)
      {
      super(name);
      jarversion = new FieldDef("jarversion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      jarnom = new FieldDef("jarnom",FieldDef.CHAR,30,FieldDef.NOTNULL);
      jarordre = new FieldDef("jarordre",FieldDef.INTEGER,0);
      jardesc = new FieldDef("jardesc",FieldDef.CHAR,45);
      jarfechadisp = new FieldDef("jarfechadisp",FieldDef.DATE);
      jarversio = new FieldDef("jarversio",FieldDef.CHAR,20);
      jartipo = new FieldDef("jartipo",FieldDef.CHAR,3);
      jarnivelact = new FieldDef("jarnivelact",FieldDef.INTEGER,0);
      jarcarpeta = new FieldDef("jarcarpeta",FieldDef.CHAR,15);
      FieldDef array[] = {
        jarversion,
        jarnom,
        jarordre,
        jardesc,
        jarfechadisp,
        jarversio,
        jartipo,
        jarnivelact,
        jarcarpeta        
        };
      setColumns(array);
      FieldDef arrayf[] = {jarversion,jarnom };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPartner extends TableDef
    {
    // Campos
    public FieldDef ptncodigo;
    public FieldDef ptnfechareg;
    public FieldDef ptncolor;
    public FieldDef ptnpresentador;
    public FieldDef ptnbanc;
    public FieldDef ptnsubcta;
    public FieldDef ptncomis1;
    public FieldDef ptntram1;
    public FieldDef ptncomis2;
    public FieldDef ptntram2;
    public FieldDef ptncomis3;
    public FieldDef ptntram3;
    public FieldDef ptnurl;
    public FieldDef ptncomisvl1;
    public FieldDef ptntramvl1;
    public FieldDef ptncomisvl2;
    public FieldDef ptntramvl2;
    public FieldDef ptncomisvl3;
    public FieldDef ptntramvl3;
    public FieldDef ptncamino;
    public FieldDef ptnurlbanc;
    public FieldDef ptncolorhead;
    public TabPartner(String name)
      {
      super(name);
      ptncodigo = new FieldDef("ptncodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      ptnfechareg = new FieldDef("ptnfechareg",FieldDef.DATE);
      ptncolor = new FieldDef("ptncolor",FieldDef.CHAR,7);
      ptnpresentador = new FieldDef("ptnpresentador",FieldDef.CHAR,12);
      ptnbanc = new FieldDef("ptnbanc",FieldDef.CHAR,4);
      ptnsubcta = new FieldDef("ptnsubcta",FieldDef.CHAR,15);
      ptncomis1 = new FieldDef("ptncomis1",FieldDef.FLOAT,6,0);
      ptntram1 = new FieldDef("ptntram1",FieldDef.FLOAT,6,0);
      ptncomis2 = new FieldDef("ptncomis2",FieldDef.FLOAT,6,0);
      ptntram2 = new FieldDef("ptntram2",FieldDef.FLOAT,6,0);
      ptncomis3 = new FieldDef("ptncomis3",FieldDef.FLOAT,6,0);
      ptntram3 = new FieldDef("ptntram3",FieldDef.FLOAT,6,0);
      ptnurl = new FieldDef("ptnurl",FieldDef.CHAR,255);
      ptncomisvl1 = new FieldDef("ptncomisvl1",FieldDef.FLOAT,6,0);
      ptntramvl1 = new FieldDef("ptntramvl1",FieldDef.FLOAT,6,0);
      ptncomisvl2 = new FieldDef("ptncomisvl2",FieldDef.FLOAT,6,0);
      ptntramvl2 = new FieldDef("ptntramvl2",FieldDef.FLOAT,6,0);
      ptncomisvl3 = new FieldDef("ptncomisvl3",FieldDef.FLOAT,6,0);
      ptntramvl3 = new FieldDef("ptntramvl3",FieldDef.FLOAT,6,0);
      ptncamino = new FieldDef("ptncamino",FieldDef.CHAR,4);
      ptnurlbanc = new FieldDef("ptnurlbanc",FieldDef.CHAR,255);
      ptncolorhead = new FieldDef("ptncolorhead",FieldDef.CHAR,7);
      FieldDef array[] = {
        ptncodigo,
        ptnfechareg,
        ptncolor,
        ptnpresentador,
        ptnbanc,
        ptnsubcta,
        ptncomis1,
        ptntram1,
        ptncomis2,
        ptntram2,
        ptncomis3,
        ptntram3,
        ptnurl,
        ptncomisvl1,
        ptntramvl1,
        ptncomisvl2,
        ptntramvl2,
        ptncomisvl3,
        ptntramvl3,
        ptncamino,
        ptnurlbanc,
        ptncolorhead        
        };
      setColumns(array);
      FieldDef arrayf[] = {ptncodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabClivoffice extends TableDef
    {
    // Campos
    public FieldDef vofcodigo;
    public FieldDef vofpartner;
    public FieldDef voffechaalta;
    public FieldDef voffechafin;
    public FieldDef vofbloqueo;
    public FieldDef vofbloqueopar;
    public FieldDef vofbloqdesc;
    public FieldDef vofinformacion;
    public TabClivoffice(String name)
      {
      super(name);
      vofcodigo = new FieldDef("vofcodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      vofpartner = new FieldDef("vofpartner",FieldDef.CHAR,12,FieldDef.NOTNULL);
      voffechaalta = new FieldDef("voffechaalta",FieldDef.DATE);
      voffechafin = new FieldDef("voffechafin",FieldDef.DATE);
      vofbloqueo = new FieldDef("vofbloqueo",FieldDef.CHAR,1);
      vofbloqueopar = new FieldDef("vofbloqueopar",FieldDef.CHAR,1);
      vofbloqdesc = new FieldDef("vofbloqdesc",FieldDef.CHAR,255);
      vofinformacion = new FieldDef("vofinformacion",FieldDef.CHAR,1);
      FieldDef array[] = {
        vofcodigo,
        vofpartner,
        voffechaalta,
        voffechafin,
        vofbloqueo,
        vofbloqueopar,
        vofbloqdesc,
        vofinformacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {vofcodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAvisosvistos extends TableDef
    {
    // Campos
    public FieldDef vicodigo;
    public FieldDef viaviso;
    public FieldDef vifecha;
    public TabAvisosvistos(String name)
      {
      super(name);
      vicodigo = new FieldDef("vicodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      viaviso = new FieldDef("viaviso",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      vifecha = new FieldDef("vifecha",FieldDef.DATE);
      FieldDef array[] = {
        vicodigo,
        viaviso,
        vifecha        
        };
      setColumns(array);
      FieldDef arrayf[] = {vicodigo,viaviso };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDocspub extends TableDef
    {
    // Campos
    public FieldDef doident;
    public FieldDef doambito;
    public FieldDef dofecha;
    public FieldDef dopropietario;
    public FieldDef doarchivo;
    public FieldDef dodesc;
    public TabDocspub(String name)
      {
      super(name);
      doident = new FieldDef("doident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      doambito = new FieldDef("doambito",FieldDef.CHAR,15);
      dofecha = new FieldDef("dofecha",FieldDef.DATE);
      dopropietario = new FieldDef("dopropietario",FieldDef.CHAR,20);
      doarchivo = new FieldDef("doarchivo",FieldDef.CHAR,300);
      dodesc = new FieldDef("dodesc",FieldDef.CHAR,80);
      FieldDef array[] = {
        doident,
        doambito,
        dofecha,
        dopropietario,
        doarchivo,
        dodesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {doident };
      setPrimaryKeys(arrayf);
      doident.setAutoIncrementable(true);
      }
    }
    
  public class TabEnquestes extends TableDef
    {
    // Campos
    public FieldDef enqlident;
    public FieldDef enqlalias;
    public FieldDef enqldesc;
    public FieldDef enqldata;
    public FieldDef enqlcaduca;
    public TabEnquestes(String name)
      {
      super(name);
      enqlident = new FieldDef("enqlident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      enqlalias = new FieldDef("enqlalias",FieldDef.CHAR,15);
      enqldesc = new FieldDef("enqldesc",FieldDef.CHAR,255);
      enqldata = new FieldDef("enqldata",FieldDef.DATE);
      enqlcaduca = new FieldDef("enqlcaduca",FieldDef.DATE);
      FieldDef array[] = {
        enqlident,
        enqlalias,
        enqldesc,
        enqldata,
        enqlcaduca        
        };
      setColumns(array);
      FieldDef arrayf[] = {enqlident };
      setPrimaryKeys(arrayf);
      enqlident.setAutoIncrementable(true);
      }
    }
    
  public class TabEnqarees extends TableDef
    {
    // Campos
    public FieldDef areenquesta;
    public FieldDef arearea;
    public FieldDef aretexte;
    public TabEnqarees(String name)
      {
      super(name);
      areenquesta = new FieldDef("areenquesta",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      arearea = new FieldDef("arearea",FieldDef.CHAR,5,FieldDef.NOTNULL);
      aretexte = new FieldDef("aretexte",FieldDef.CHAR,100);
      FieldDef array[] = {
        areenquesta,
        arearea,
        aretexte        
        };
      setColumns(array);
      FieldDef arrayf[] = {areenquesta,arearea };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEnquesta extends TableDef
    {
    // Campos
    public FieldDef enqcodi;
    public FieldDef enqpregunta;
    public FieldDef enqarea;
    public FieldDef enqtexte;
    public TabEnquesta(String name)
      {
      super(name);
      enqcodi = new FieldDef("enqcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      enqpregunta = new FieldDef("enqpregunta",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      enqarea = new FieldDef("enqarea",FieldDef.CHAR,5);
      enqtexte = new FieldDef("enqtexte",FieldDef.CHAR,100);
      FieldDef array[] = {
        enqcodi,
        enqpregunta,
        enqarea,
        enqtexte        
        };
      setColumns(array);
      FieldDef arrayf[] = {enqcodi,enqpregunta };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEnqxclient extends TableDef
    {
    // Campos
    public FieldDef quacodi;
    public FieldDef quaenquesta;
    public FieldDef quadata;
    public FieldDef quaclient;
    public FieldDef quausuari;
    public FieldDef quacargo;
    public FieldDef quaantiguetat;
    public FieldDef quaanonimo;
    public TabEnqxclient(String name)
      {
      super(name);
      quacodi = new FieldDef("quacodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      quaenquesta = new FieldDef("quaenquesta",FieldDef.INTEGER,0);
      quadata = new FieldDef("quadata",FieldDef.DATE);
      quaclient = new FieldDef("quaclient",FieldDef.CHAR,12);
      quausuari = new FieldDef("quausuari",FieldDef.CHAR,20);
      quacargo = new FieldDef("quacargo",FieldDef.CHAR,1);
      quaantiguetat = new FieldDef("quaantiguetat",FieldDef.INTEGER,0);
      quaanonimo = new FieldDef("quaanonimo",FieldDef.CHAR,1);
      FieldDef array[] = {
        quacodi,
        quaenquesta,
        quadata,
        quaclient,
        quausuari,
        quacargo,
        quaantiguetat,
        quaanonimo        
        };
      setColumns(array);
      FieldDef arrayf[] = {quacodi };
      setPrimaryKeys(arrayf);
      quacodi.setAutoIncrementable(true);
      }
    }
    
  public class TabEnqxclientdet extends TableDef
    {
    // Campos
    public FieldDef quadcodi;
    public FieldDef quadenquesta;
    public FieldDef quadpregunta;
    public FieldDef quadsatisfac;
    public FieldDef quadimportant;
    public TabEnqxclientdet(String name)
      {
      super(name);
      quadcodi = new FieldDef("quadcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      quadenquesta = new FieldDef("quadenquesta",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      quadpregunta = new FieldDef("quadpregunta",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      quadsatisfac = new FieldDef("quadsatisfac",FieldDef.CHAR,1);
      quadimportant = new FieldDef("quadimportant",FieldDef.CHAR,1);
      FieldDef array[] = {
        quadcodi,
        quadenquesta,
        quadpregunta,
        quadsatisfac,
        quadimportant        
        };
      setColumns(array);
      FieldDef arrayf[] = {quadcodi,quadenquesta,quadpregunta };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSeries extends TableDef
    {
    // Campos
    public FieldDef sercodi;
    public FieldDef sernumfac;
    public TabSeries(String name)
      {
      super(name);
      sercodi = new FieldDef("sercodi",FieldDef.CHAR,1,FieldDef.NOTNULL);
      sernumfac = new FieldDef("sernumfac",FieldDef.INTEGER,0);
      FieldDef array[] = {
        sercodi,
        sernumfac        
        };
      setColumns(array);
      FieldDef arrayf[] = {sercodi };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabOfcomanda extends TableDef
    {
    // Campos
    public FieldDef ofccodi;
    public FieldDef ofcversio;
    public FieldDef ofcestat;
    public FieldDef ofcdesc;
    public FieldDef ofccomer;
    public FieldDef ofcprob;
    public FieldDef ofctipus;
    public FieldDef ofcpartner;
    public FieldDef ofcdataini;
    public FieldDef ofcdataemissio;
    public FieldDef ofcmitjae;
    public FieldDef ofcdataresposta;
    public FieldDef ofcmitjar;
    public FieldDef ofcclient;
    public FieldDef ofcclientus;
    public FieldDef ofcdatavalid;
    public FieldDef ofcdatavalid2;
    public FieldDef ofcusuarivalid;
    public FieldDef ofcusuarivalid2;
    public FieldDef ofcdataprefac;
    public FieldDef ofccoditrans;
    public FieldDef ofcfpago0;
    public FieldDef ofcfechav0;
    public FieldDef ofcporcomptat;
    public FieldDef ofcfpago1;
    public FieldDef ofcdiasv1;
    public FieldDef ofcporv1;
    public FieldDef ofcfpago2;
    public FieldDef ofcdiasv2;
    public FieldDef ofcporv2;
    public FieldDef ofcfpago3;
    public FieldDef ofcdiasv3;
    public FieldDef ofcporv3;
    public FieldDef ofcfpago4;
    public FieldDef ofcdiasv4;
    public FieldDef ofcporv4;
    public FieldDef ofcbanco;
    public FieldDef ofcagencia;
    public FieldDef ofccc;
    public FieldDef ofcccdc;
    public FieldDef ofcempresa;
    public FieldDef ofcorigen;
    public FieldDef ofccampanya;
    public FieldDef ofcclirec;
    public FieldDef ofccolecprof;
    public TabOfcomanda(String name)
      {
      super(name);
      ofccodi = new FieldDef("ofccodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ofcversio = new FieldDef("ofcversio",FieldDef.INTEGER,0);
      ofcestat = new FieldDef("ofcestat",FieldDef.CHAR,2);
      ofcdesc = new FieldDef("ofcdesc",FieldDef.CHAR,4000);
      ofccomer = new FieldDef("ofccomer",FieldDef.CHAR,20);
      ofcprob = new FieldDef("ofcprob",FieldDef.INTEGER,0);
      ofctipus = new FieldDef("ofctipus",FieldDef.CHAR,2);
      ofcpartner = new FieldDef("ofcpartner",FieldDef.CHAR,12);
      ofcdataini = new FieldDef("ofcdataini",FieldDef.DATE);
      ofcdataemissio = new FieldDef("ofcdataemissio",FieldDef.DATE);
      ofcmitjae = new FieldDef("ofcmitjae",FieldDef.CHAR,1);
      ofcdataresposta = new FieldDef("ofcdataresposta",FieldDef.DATE);
      ofcmitjar = new FieldDef("ofcmitjar",FieldDef.CHAR,1);
      ofcclient = new FieldDef("ofcclient",FieldDef.CHAR,12);
      ofcclientus = new FieldDef("ofcclientus",FieldDef.CHAR,20);
      ofcdatavalid = new FieldDef("ofcdatavalid",FieldDef.DATE);
      ofcdatavalid2 = new FieldDef("ofcdatavalid2",FieldDef.DATE);
      ofcusuarivalid = new FieldDef("ofcusuarivalid",FieldDef.CHAR,20);
      ofcusuarivalid2 = new FieldDef("ofcusuarivalid2",FieldDef.CHAR,20);
      ofcdataprefac = new FieldDef("ofcdataprefac",FieldDef.DATE);
      ofccoditrans = new FieldDef("ofccoditrans",FieldDef.INTEGER,0);
      ofcfpago0 = new FieldDef("ofcfpago0",FieldDef.CHAR,2);
      ofcfechav0 = new FieldDef("ofcfechav0",FieldDef.DATE);
      ofcporcomptat = new FieldDef("ofcporcomptat",FieldDef.FLOAT,6,0);
      ofcfpago1 = new FieldDef("ofcfpago1",FieldDef.CHAR,2);
      ofcdiasv1 = new FieldDef("ofcdiasv1",FieldDef.INTEGER,0);
      ofcporv1 = new FieldDef("ofcporv1",FieldDef.FLOAT,6,0);
      ofcfpago2 = new FieldDef("ofcfpago2",FieldDef.CHAR,2);
      ofcdiasv2 = new FieldDef("ofcdiasv2",FieldDef.INTEGER,0);
      ofcporv2 = new FieldDef("ofcporv2",FieldDef.FLOAT,6,0);
      ofcfpago3 = new FieldDef("ofcfpago3",FieldDef.CHAR,2);
      ofcdiasv3 = new FieldDef("ofcdiasv3",FieldDef.INTEGER,0);
      ofcporv3 = new FieldDef("ofcporv3",FieldDef.FLOAT,6,0);
      ofcfpago4 = new FieldDef("ofcfpago4",FieldDef.CHAR,2);
      ofcdiasv4 = new FieldDef("ofcdiasv4",FieldDef.INTEGER,0);
      ofcporv4 = new FieldDef("ofcporv4",FieldDef.FLOAT,6,0);
      ofcbanco = new FieldDef("ofcbanco",FieldDef.INTEGER,0);
      ofcagencia = new FieldDef("ofcagencia",FieldDef.INTEGER,0);
      ofccc = new FieldDef("ofccc",FieldDef.CHAR,10);
      ofcccdc = new FieldDef("ofcccdc",FieldDef.CHAR,2);
      ofcempresa = new FieldDef("ofcempresa",FieldDef.INTEGER,0);
      ofcorigen = new FieldDef("ofcorigen",FieldDef.CHAR,1);
      ofccampanya = new FieldDef("ofccampanya",FieldDef.CHAR,30);
      ofcclirec = new FieldDef("ofcclirec",FieldDef.CHAR,12);
      ofccolecprof = new FieldDef("ofccolecprof",FieldDef.CHAR,1);
      FieldDef array[] = {
        ofccodi,
        ofcversio,
        ofcestat,
        ofcdesc,
        ofccomer,
        ofcprob,
        ofctipus,
        ofcpartner,
        ofcdataini,
        ofcdataemissio,
        ofcmitjae,
        ofcdataresposta,
        ofcmitjar,
        ofcclient,
        ofcclientus,
        ofcdatavalid,
        ofcdatavalid2,
        ofcusuarivalid,
        ofcusuarivalid2,
        ofcdataprefac,
        ofccoditrans,
        ofcfpago0,
        ofcfechav0,
        ofcporcomptat,
        ofcfpago1,
        ofcdiasv1,
        ofcporv1,
        ofcfpago2,
        ofcdiasv2,
        ofcporv2,
        ofcfpago3,
        ofcdiasv3,
        ofcporv3,
        ofcfpago4,
        ofcdiasv4,
        ofcporv4,
        ofcbanco,
        ofcagencia,
        ofccc,
        ofcccdc,
        ofcempresa,
        ofcorigen,
        ofccampanya,
        ofcclirec,
        ofccolecprof        
        };
      setColumns(array);
      FieldDef arrayf[] = {ofccodi };
      setPrimaryKeys(arrayf);
      ofccodi.setAutoIncrementable(true);
      }
    }
    
  public class TabOferta extends TableDef
    {
    // Campos
    public FieldDef ofecodi;
    public FieldDef ofeversio;
    public FieldDef ofedata;
    public FieldDef ofedesc;
    public FieldDef ofedataobj;
    public FieldDef ofeprojectetec;
    public FieldDef ofedoc;
    public FieldDef ofeimportebase;
    public FieldDef ofepordto;
    public FieldDef ofeimportedto;
    public FieldDef ofeporiva;
    public FieldDef ofeimporteiva;
    public FieldDef ofeimportetotal;
    public FieldDef ofeestat;
    public FieldDef oferespostacli;
    public TabOferta(String name)
      {
      super(name);
      ofecodi = new FieldDef("ofecodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ofeversio = new FieldDef("ofeversio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ofedata = new FieldDef("ofedata",FieldDef.DATE);
      ofedesc = new FieldDef("ofedesc",FieldDef.CHAR,4000);
      ofedataobj = new FieldDef("ofedataobj",FieldDef.DATE);
      ofeprojectetec = new FieldDef("ofeprojectetec",FieldDef.CHAR,4000);
      ofedoc = new FieldDef("ofedoc",FieldDef.CHAR,255);
      ofeimportebase = new FieldDef("ofeimportebase",FieldDef.FLOAT,6,0);
      ofepordto = new FieldDef("ofepordto",FieldDef.FLOAT,6,0);
      ofeimportedto = new FieldDef("ofeimportedto",FieldDef.FLOAT,6,0);
      ofeporiva = new FieldDef("ofeporiva",FieldDef.FLOAT,6,0);
      ofeimporteiva = new FieldDef("ofeimporteiva",FieldDef.FLOAT,6,0);
      ofeimportetotal = new FieldDef("ofeimportetotal",FieldDef.FLOAT,6,0);
      ofeestat = new FieldDef("ofeestat",FieldDef.CHAR,1);
      oferespostacli = new FieldDef("oferespostacli",FieldDef.CHAR,4000);
      FieldDef array[] = {
        ofecodi,
        ofeversio,
        ofedata,
        ofedesc,
        ofedataobj,
        ofeprojectetec,
        ofedoc,
        ofeimportebase,
        ofepordto,
        ofeimportedto,
        ofeporiva,
        ofeimporteiva,
        ofeimportetotal,
        ofeestat,
        oferespostacli        
        };
      setColumns(array);
      FieldDef arrayf[] = {ofecodi,ofeversio };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabOfertadet extends TableDef
    {
    // Campos
    public FieldDef ofdcodi;
    public FieldDef ofdversio;
    public FieldDef ofdlinia;
    public FieldDef ofdtipusvcv;
    public FieldDef ofdmovant;
    public FieldDef ofdtarifa;
    public FieldDef ofddatadisp;
    public FieldDef ofddesc;
    public FieldDef ofdunidades;
    public FieldDef ofdprecio;
    public FieldDef ofdpordto;
    public FieldDef ofddto;
    public FieldDef ofdimporte;
    public FieldDef ofdfechafin;
    public TabOfertadet(String name)
      {
      super(name);
      ofdcodi = new FieldDef("ofdcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ofdversio = new FieldDef("ofdversio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ofdlinia = new FieldDef("ofdlinia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ofdtipusvcv = new FieldDef("ofdtipusvcv",FieldDef.CHAR,1);
      ofdmovant = new FieldDef("ofdmovant",FieldDef.INTEGER,0);
      ofdtarifa = new FieldDef("ofdtarifa",FieldDef.CHAR,10);
      ofddatadisp = new FieldDef("ofddatadisp",FieldDef.DATE);
      ofddesc = new FieldDef("ofddesc",FieldDef.CHAR,200);
      ofdunidades = new FieldDef("ofdunidades",FieldDef.FLOAT,6,0);
      ofdprecio = new FieldDef("ofdprecio",FieldDef.FLOAT,6,0);
      ofdpordto = new FieldDef("ofdpordto",FieldDef.FLOAT,6,0);
      ofddto = new FieldDef("ofddto",FieldDef.FLOAT,6,0);
      ofdimporte = new FieldDef("ofdimporte",FieldDef.FLOAT,6,0);
      ofdfechafin = new FieldDef("ofdfechafin",FieldDef.DATE);
      FieldDef array[] = {
        ofdcodi,
        ofdversio,
        ofdlinia,
        ofdtipusvcv,
        ofdmovant,
        ofdtarifa,
        ofddatadisp,
        ofddesc,
        ofdunidades,
        ofdprecio,
        ofdpordto,
        ofddto,
        ofdimporte,
        ofdfechafin        
        };
      setColumns(array);
      FieldDef arrayf[] = {ofdcodi,ofdversio,ofdlinia };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabOfertaprojtec extends TableDef
    {
    // Campos
    public FieldDef ofpcodi;
    public FieldDef ofpversio;
    public FieldDef ofplinia;
    public FieldDef ofpcount;
    public FieldDef ofptarea;
    public FieldDef ofddesc;
    public FieldDef ofptecnic;
    public FieldDef ofphores;
    public FieldDef ofpdatainici;
    public FieldDef ofpdatafi;
    public FieldDef ofpprogres;
    public FieldDef ofpnotes;
    public TabOfertaprojtec(String name)
      {
      super(name);
      ofpcodi = new FieldDef("ofpcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ofpversio = new FieldDef("ofpversio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ofplinia = new FieldDef("ofplinia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ofpcount = new FieldDef("ofpcount",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ofptarea = new FieldDef("ofptarea",FieldDef.CHAR,10);
      ofddesc = new FieldDef("ofddesc",FieldDef.CHAR,200);
      ofptecnic = new FieldDef("ofptecnic",FieldDef.CHAR,20);
      ofphores = new FieldDef("ofphores",FieldDef.FLOAT,6,0);
      ofpdatainici = new FieldDef("ofpdatainici",FieldDef.DATE);
      ofpdatafi = new FieldDef("ofpdatafi",FieldDef.DATE);
      ofpprogres = new FieldDef("ofpprogres",FieldDef.INTEGER,0);
      ofpnotes = new FieldDef("ofpnotes",FieldDef.CHAR,2000);
      FieldDef array[] = {
        ofpcodi,
        ofpversio,
        ofplinia,
        ofpcount,
        ofptarea,
        ofddesc,
        ofptecnic,
        ofphores,
        ofpdatainici,
        ofpdatafi,
        ofpprogres,
        ofpnotes        
        };
      setColumns(array);
      FieldDef arrayf[] = {ofpcodi,ofpversio,ofplinia,ofpcount };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabOftarifadep extends TableDef
    {
    // Campos
    public FieldDef oftprefijo;
    public FieldDef ofttarifa;
    public TabOftarifadep(String name)
      {
      super(name);
      oftprefijo = new FieldDef("oftprefijo",FieldDef.CHAR,10,FieldDef.NOTNULL);
      ofttarifa = new FieldDef("ofttarifa",FieldDef.CHAR,10,FieldDef.NOTNULL);
      FieldDef array[] = {
        oftprefijo,
        ofttarifa        
        };
      setColumns(array);
      FieldDef arrayf[] = {oftprefijo,ofttarifa };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabOfdescomptes extends TableDef
    {
    // Campos
    public FieldDef dtotarifa;
    public FieldDef dtodataini;
    public FieldDef dtodatafi;
    public FieldDef dtopordto;
    public TabOfdescomptes(String name)
      {
      super(name);
      dtotarifa = new FieldDef("dtotarifa",FieldDef.CHAR,10,FieldDef.NOTNULL);
      dtodataini = new FieldDef("dtodataini",FieldDef.DATE);
      dtodatafi = new FieldDef("dtodatafi",FieldDef.DATE);
      dtopordto = new FieldDef("dtopordto",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        dtotarifa,
        dtodataini,
        dtodatafi,
        dtopordto        
        };
      setColumns(array);
      FieldDef arrayf[] = {dtotarifa };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabOftartasques extends TableDef
    {
    // Campos
    public FieldDef tasprefixe;
    public FieldDef tascount;
    public FieldDef tastarea;
    public FieldDef tasdesc;
    public FieldDef tastecnic;
    public FieldDef tashores;
    public FieldDef tasdatainici;
    public FieldDef tasdatafi;
    public FieldDef tasprogres;
    public FieldDef tasnotes;
    public TabOftartasques(String name)
      {
      super(name);
      tasprefixe = new FieldDef("tasprefixe",FieldDef.CHAR,10,FieldDef.NOTNULL);
      tascount = new FieldDef("tascount",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tastarea = new FieldDef("tastarea",FieldDef.CHAR,10);
      tasdesc = new FieldDef("tasdesc",FieldDef.CHAR,200);
      tastecnic = new FieldDef("tastecnic",FieldDef.CHAR,20);
      tashores = new FieldDef("tashores",FieldDef.FLOAT,6,0);
      tasdatainici = new FieldDef("tasdatainici",FieldDef.DATE);
      tasdatafi = new FieldDef("tasdatafi",FieldDef.DATE);
      tasprogres = new FieldDef("tasprogres",FieldDef.INTEGER,0);
      tasnotes = new FieldDef("tasnotes",FieldDef.CHAR,2000);
      FieldDef array[] = {
        tasprefixe,
        tascount,
        tastarea,
        tasdesc,
        tastecnic,
        tashores,
        tasdatainici,
        tasdatafi,
        tasprogres,
        tasnotes        
        };
      setColumns(array);
      FieldDef arrayf[] = {tasprefixe,tascount };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabDatgennum extends TableDef
    {
    // Campos
    public FieldDef dntipo;
    public FieldDef dncodigo;
    public TabDatgennum(String name)
      {
      super(name);
      dntipo = new FieldDef("dntipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      dncodigo = new FieldDef("dncodigo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        dntipo,
        dncodigo        
        };
      setColumns(array);
      FieldDef arrayf[] = {dntipo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabFacrebudes extends TableDef
    {
    // Campos
    public FieldDef faciden;
    public FieldDef facproveidor;
    public FieldDef facdata;
    public FieldDef facref;
    public FieldDef facdesc;
    public FieldDef facbase;
    public TabFacrebudes(String name)
      {
      super(name);
      faciden = new FieldDef("faciden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      facproveidor = new FieldDef("facproveidor",FieldDef.CHAR,12);
      facdata = new FieldDef("facdata",FieldDef.DATE);
      facref = new FieldDef("facref",FieldDef.CHAR,30);
      facdesc = new FieldDef("facdesc",FieldDef.CHAR,200);
      facbase = new FieldDef("facbase",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        faciden,
        facproveidor,
        facdata,
        facref,
        facdesc,
        facbase        
        };
      setColumns(array);
      FieldDef arrayf[] = {faciden };
      setPrimaryKeys(arrayf);
      faciden.setAutoIncrementable(true);
      }
    }
    
  public class TabProveedor extends TableDef
    {
    // Campos
    public FieldDef procodigo;
    public FieldDef proestado;
    public FieldDef profecalta;
    public FieldDef prosuministro;
    public FieldDef pronivel;
    public FieldDef procomentarios;
    public TabProveedor(String name)
      {
      super(name);
      procodigo = new FieldDef("procodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      proestado = new FieldDef("proestado",FieldDef.CHAR,1);
      profecalta = new FieldDef("profecalta",FieldDef.DATE);
      prosuministro = new FieldDef("prosuministro",FieldDef.CHAR,255);
      pronivel = new FieldDef("pronivel",FieldDef.INTEGER,0);
      procomentarios = new FieldDef("procomentarios",FieldDef.CHAR,255);
      FieldDef array[] = {
        procodigo,
        proestado,
        profecalta,
        prosuministro,
        pronivel,
        procomentarios        
        };
      setColumns(array);
      FieldDef arrayf[] = {procodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabIsoaccioncorrec extends TableDef
    {
    // Campos
    public FieldDef aciden;
    public FieldDef acestado;
    public FieldDef acprocedim;
    public FieldDef acusuario;
    public FieldDef acfechai;
    public FieldDef acfechaf;
    public FieldDef acdescrip;
    public FieldDef acambito;
    public FieldDef acservicio;
    public FieldDef acprojecte;
    public TabIsoaccioncorrec(String name)
      {
      super(name);
      aciden = new FieldDef("aciden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acestado = new FieldDef("acestado",FieldDef.CHAR,1);
      acprocedim = new FieldDef("acprocedim",FieldDef.CHAR,15);
      acusuario = new FieldDef("acusuario",FieldDef.CHAR,20);
      acfechai = new FieldDef("acfechai",FieldDef.DATE);
      acfechaf = new FieldDef("acfechaf",FieldDef.DATE);
      acdescrip = new FieldDef("acdescrip",FieldDef.CHAR,4000);
      acambito = new FieldDef("acambito",FieldDef.CHAR,8);
      acservicio = new FieldDef("acservicio",FieldDef.CHAR,8);
      acprojecte = new FieldDef("acprojecte",FieldDef.CHAR,20);
      FieldDef array[] = {
        aciden,
        acestado,
        acprocedim,
        acusuario,
        acfechai,
        acfechaf,
        acdescrip,
        acambito,
        acservicio,
        acprojecte        
        };
      setColumns(array);
      FieldDef arrayf[] = {aciden };
      setPrimaryKeys(arrayf);
      aciden.setAutoIncrementable(true);
      }
    }
    
  public class TabIsoncrecsug extends TableDef
    {
    // Campos
    public FieldDef nciden;
    public FieldDef nctipo;
    public FieldDef ncestat;
    public FieldDef ncnivell;
    public FieldDef ncdominioo;
    public FieldDef ncdominiod;
    public FieldDef ncusuarioe;
    public FieldDef ncfechae;
    public FieldDef ncusuarior;
    public FieldDef ncfechar;
    public FieldDef ncusuarios;
    public FieldDef ncfechas;
    public FieldDef ncresolucio;
    public FieldDef ncusuariot;
    public FieldDef ncfechat;
    public FieldDef ncacciocor;
    public FieldDef ncrespmodo;
    public FieldDef ncrespref;
    public FieldDef ncprocedim;
    public FieldDef ncambito;
    public FieldDef ncservicio;
    public FieldDef ncreferencia;
    public FieldDef ncparte;
    public FieldDef nctipologia;
    public FieldDef ncdesc;
    public FieldDef ncresposta;
    public FieldDef ncprojecte;
    public FieldDef nctemaiso;
    public FieldDef ncareafuncional;
    public TabIsoncrecsug(String name)
      {
      super(name);
      nciden = new FieldDef("nciden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      nctipo = new FieldDef("nctipo",FieldDef.CHAR,1);
      ncestat = new FieldDef("ncestat",FieldDef.CHAR,1);
      ncnivell = new FieldDef("ncnivell",FieldDef.CHAR,1);
      ncdominioo = new FieldDef("ncdominioo",FieldDef.CHAR,12);
      ncdominiod = new FieldDef("ncdominiod",FieldDef.CHAR,12);
      ncusuarioe = new FieldDef("ncusuarioe",FieldDef.CHAR,20);
      ncfechae = new FieldDef("ncfechae",FieldDef.DATE);
      ncusuarior = new FieldDef("ncusuarior",FieldDef.CHAR,20);
      ncfechar = new FieldDef("ncfechar",FieldDef.DATE);
      ncusuarios = new FieldDef("ncusuarios",FieldDef.CHAR,20);
      ncfechas = new FieldDef("ncfechas",FieldDef.DATE);
      ncresolucio = new FieldDef("ncresolucio",FieldDef.CHAR,1);
      ncusuariot = new FieldDef("ncusuariot",FieldDef.CHAR,20);
      ncfechat = new FieldDef("ncfechat",FieldDef.DATE);
      ncacciocor = new FieldDef("ncacciocor",FieldDef.INTEGER,0);
      ncrespmodo = new FieldDef("ncrespmodo",FieldDef.CHAR,1);
      ncrespref = new FieldDef("ncrespref",FieldDef.CHAR,80);
      ncprocedim = new FieldDef("ncprocedim",FieldDef.CHAR,15);
      ncambito = new FieldDef("ncambito",FieldDef.CHAR,8);
      ncservicio = new FieldDef("ncservicio",FieldDef.CHAR,8);
      ncreferencia = new FieldDef("ncreferencia",FieldDef.CHAR,15);
      ncparte = new FieldDef("ncparte",FieldDef.INTEGER,0);
      nctipologia = new FieldDef("nctipologia",FieldDef.CHAR,15);
      ncdesc = new FieldDef("ncdesc",FieldDef.CHAR,4000);
      ncresposta = new FieldDef("ncresposta",FieldDef.CHAR,4000);
      ncprojecte = new FieldDef("ncprojecte",FieldDef.CHAR,20);
      nctemaiso = new FieldDef("nctemaiso",FieldDef.CHAR,20);
      ncareafuncional = new FieldDef("ncareafuncional",FieldDef.CHAR,20);
      FieldDef array[] = {
        nciden,
        nctipo,
        ncestat,
        ncnivell,
        ncdominioo,
        ncdominiod,
        ncusuarioe,
        ncfechae,
        ncusuarior,
        ncfechar,
        ncusuarios,
        ncfechas,
        ncresolucio,
        ncusuariot,
        ncfechat,
        ncacciocor,
        ncrespmodo,
        ncrespref,
        ncprocedim,
        ncambito,
        ncservicio,
        ncreferencia,
        ncparte,
        nctipologia,
        ncdesc,
        ncresposta,
        ncprojecte,
        nctemaiso,
        ncareafuncional        
        };
      setColumns(array);
      FieldDef arrayf[] = {nciden };
      setPrimaryKeys(arrayf);
      nciden.setAutoIncrementable(true);
      }
    }
    
  public class TabIsoprocedim extends TableDef
    {
    // Campos
    public FieldDef prref;
    public FieldDef prdesc;
    public TabIsoprocedim(String name)
      {
      super(name);
      prref = new FieldDef("prref",FieldDef.CHAR,15,FieldDef.NOTNULL);
      prdesc = new FieldDef("prdesc",FieldDef.CHAR,80);
      FieldDef array[] = {
        prref,
        prdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {prref };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabIsoprocxambit extends TableDef
    {
    // Campos
    public FieldDef paiden;
    public FieldDef paref;
    public FieldDef paambit;
    public TabIsoprocxambit(String name)
      {
      super(name);
      paiden = new FieldDef("paiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      paref = new FieldDef("paref",FieldDef.CHAR,15);
      paambit = new FieldDef("paambit",FieldDef.CHAR,8);
      FieldDef array[] = {
        paiden,
        paref,
        paambit        
        };
      setColumns(array);
      FieldDef arrayf[] = {paiden };
      setPrimaryKeys(arrayf);
      paiden.setAutoIncrementable(true);
      }
    }
    
  public class TabIsoambits extends TableDef
    {
    // Campos
    public FieldDef ambref;
    public FieldDef ambdesc;
    public TabIsoambits(String name)
      {
      super(name);
      ambref = new FieldDef("ambref",FieldDef.CHAR,8,FieldDef.NOTNULL);
      ambdesc = new FieldDef("ambdesc",FieldDef.CHAR,45);
      FieldDef array[] = {
        ambref,
        ambdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {ambref };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabPromocion extends TableDef
    {
    // Campos
    public FieldDef prmiden;
    public FieldDef prmpartner;
    public FieldDef prmservicio;
    public FieldDef prmtitulo;
    public FieldDef prmdesc;
    public FieldDef prmfechad;
    public FieldDef prmfechah;
    public FieldDef prmdias;
    public FieldDef prmnumreg;
    public FieldDef prmpordto;
    public FieldDef prmimpdto;
    public FieldDef prmactivo;
    public FieldDef prmref;
    public TabPromocion(String name)
      {
      super(name);
      prmiden = new FieldDef("prmiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      prmpartner = new FieldDef("prmpartner",FieldDef.CHAR,12);
      prmservicio = new FieldDef("prmservicio",FieldDef.CHAR,15);
      prmtitulo = new FieldDef("prmtitulo",FieldDef.CHAR,45);
      prmdesc = new FieldDef("prmdesc",FieldDef.CHAR,255);
      prmfechad = new FieldDef("prmfechad",FieldDef.DATE);
      prmfechah = new FieldDef("prmfechah",FieldDef.DATE);
      prmdias = new FieldDef("prmdias",FieldDef.INTEGER,0);
      prmnumreg = new FieldDef("prmnumreg",FieldDef.INTEGER,0);
      prmpordto = new FieldDef("prmpordto",FieldDef.INTEGER,0);
      prmimpdto = new FieldDef("prmimpdto",FieldDef.FLOAT,6,0);
      prmactivo = new FieldDef("prmactivo",FieldDef.CHAR,1);
      prmref = new FieldDef("prmref",FieldDef.CHAR,5);
      FieldDef array[] = {
        prmiden,
        prmpartner,
        prmservicio,
        prmtitulo,
        prmdesc,
        prmfechad,
        prmfechah,
        prmdias,
        prmnumreg,
        prmpordto,
        prmimpdto,
        prmactivo,
        prmref        
        };
      setColumns(array);
      FieldDef arrayf[] = {prmiden };
      setPrimaryKeys(arrayf);
      prmiden.setAutoIncrementable(true);
      }
    }
    
  public class TabMails extends TableDef
    {
    // Campos
    public FieldDef emiden;
    public FieldDef emref;
    public FieldDef emtexto;
    public FieldDef emtxlinks;
    public FieldDef emlogos;
    public FieldDef emfechacre;
    public FieldDef emfechavis;
    public FieldDef emfechalim;
    public FieldDef emfechacad;
    public FieldDef emvisible;
    public FieldDef emtipo;
    public FieldDef emambito;
    public FieldDef emorden;
    public FieldDef emdocxsl;
    public FieldDef emfirma;
    public FieldDef emdesc;
    public FieldDef emsubject;
    public TabMails(String name)
      {
      super(name);
      emiden = new FieldDef("emiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      emref = new FieldDef("emref",FieldDef.CHAR,15,FieldDef.NOTNULL);
      emtexto = new FieldDef("emtexto",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      emtxlinks = new FieldDef("emtxlinks",FieldDef.CHAR,1000);
      emlogos = new FieldDef("emlogos",FieldDef.CHAR,2000);
      emfechacre = new FieldDef("emfechacre",FieldDef.DATE);
      emfechavis = new FieldDef("emfechavis",FieldDef.DATE);
      emfechalim = new FieldDef("emfechalim",FieldDef.DATE);
      emfechacad = new FieldDef("emfechacad",FieldDef.DATE);
      emvisible = new FieldDef("emvisible",FieldDef.CHAR,1);
      emtipo = new FieldDef("emtipo",FieldDef.CHAR,2);
      emambito = new FieldDef("emambito",FieldDef.CHAR,15);
      emorden = new FieldDef("emorden",FieldDef.INTEGER,0);
      emdocxsl = new FieldDef("emdocxsl",FieldDef.CHAR,15);
      emfirma = new FieldDef("emfirma",FieldDef.CHAR,20);
      emdesc = new FieldDef("emdesc",FieldDef.CHAR,45);
      emsubject = new FieldDef("emsubject",FieldDef.CHAR,80);
      FieldDef array[] = {
        emiden,
        emref,
        emtexto,
        emtxlinks,
        emlogos,
        emfechacre,
        emfechavis,
        emfechalim,
        emfechacad,
        emvisible,
        emtipo,
        emambito,
        emorden,
        emdocxsl,
        emfirma,
        emdesc,
        emsubject        
        };
      setColumns(array);
      FieldDef arrayf[] = {emiden };
      setPrimaryKeys(arrayf);
      emiden.setAutoIncrementable(true);
      }
    }
    
  public class TabVologpagouso extends TableDef
    {
    // Campos
    public FieldDef vliden;
    public FieldDef vlproducto;
    public FieldDef vlcliente;
    public FieldDef vlfecha;
    public FieldDef vloperacion;
    public FieldDef vlcoste;
    public FieldDef vlsaldoini;
    public FieldDef vlsaldofin;
    public TabVologpagouso(String name)
      {
      super(name);
      vliden = new FieldDef("vliden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      vlproducto = new FieldDef("vlproducto",FieldDef.CHAR,15);
      vlcliente = new FieldDef("vlcliente",FieldDef.CHAR,12);
      vlfecha = new FieldDef("vlfecha",FieldDef.DATE);
      vloperacion = new FieldDef("vloperacion",FieldDef.CHAR,30);
      vlcoste = new FieldDef("vlcoste",FieldDef.FLOAT,6,0);
      vlsaldoini = new FieldDef("vlsaldoini",FieldDef.INTEGER,0);
      vlsaldofin = new FieldDef("vlsaldofin",FieldDef.INTEGER,0);
      FieldDef array[] = {
        vliden,
        vlproducto,
        vlcliente,
        vlfecha,
        vloperacion,
        vlcoste,
        vlsaldoini,
        vlsaldofin        
        };
      setColumns(array);
      FieldDef arrayf[] = {vliden };
      setPrimaryKeys(arrayf);
      vliden.setAutoIncrementable(true);
      }
    }
    
  public class TabEportemdocs extends TableDef
    {
    // Campos
    public FieldDef epdp;
    public FieldDef epiden;
    public FieldDef epclientedp;
    public FieldDef epproducto;
    public FieldDef epambito;
    public FieldDef eptitulo;
    public FieldDef epdesc;
    public FieldDef epfechacre;
    public FieldDef epfechapub;
    public FieldDef epfechalec;
    public FieldDef epejer;
    public FieldDef epperiodo;
    public FieldDef epusuario;
    public FieldDef epfechadel;
    public FieldDef epvisible;
    public TabEportemdocs(String name)
      {
      super(name);
      epdp = new FieldDef("epdp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      epiden = new FieldDef("epiden",FieldDef.CHAR,80,FieldDef.NOTNULL);
      epclientedp = new FieldDef("epclientedp",FieldDef.CHAR,12,FieldDef.NOTNULL);
      epproducto = new FieldDef("epproducto",FieldDef.CHAR,15);
      epambito = new FieldDef("epambito",FieldDef.CHAR,15);
      eptitulo = new FieldDef("eptitulo",FieldDef.CHAR,30);
      epdesc = new FieldDef("epdesc",FieldDef.CHAR,2000);
      epfechacre = new FieldDef("epfechacre",FieldDef.DATE);
      epfechapub = new FieldDef("epfechapub",FieldDef.DATE);
      epfechalec = new FieldDef("epfechalec",FieldDef.DATE);
      epejer = new FieldDef("epejer",FieldDef.INTEGER,0);
      epperiodo = new FieldDef("epperiodo",FieldDef.CHAR,2);
      epusuario = new FieldDef("epusuario",FieldDef.CHAR,20);
      epfechadel = new FieldDef("epfechadel",FieldDef.DATE);
      epvisible = new FieldDef("epvisible",FieldDef.CHAR,1);
      FieldDef array[] = {
        epdp,
        epiden,
        epclientedp,
        epproducto,
        epambito,
        eptitulo,
        epdesc,
        epfechacre,
        epfechapub,
        epfechalec,
        epejer,
        epperiodo,
        epusuario,
        epfechadel,
        epvisible        
        };
      setColumns(array);
      FieldDef arrayf[] = {epdp,epiden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabClimat extends TableDef
    {
    // Campos
    public FieldDef matiden;
    public FieldDef matcliente;
    public FieldDef matcontacto;
    public FieldDef matusgeyce;
    public FieldDef matfechaent;
    public FieldDef matfechadev;
    public FieldDef matfechadest;
    public FieldDef matinformado;
    public FieldDef matref;
    public FieldDef mataplic;
    public FieldDef matdesc;
    public TabClimat(String name)
      {
      super(name);
      matiden = new FieldDef("matiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      matcliente = new FieldDef("matcliente",FieldDef.CHAR,12);
      matcontacto = new FieldDef("matcontacto",FieldDef.CHAR,45);
      matusgeyce = new FieldDef("matusgeyce",FieldDef.CHAR,20);
      matfechaent = new FieldDef("matfechaent",FieldDef.DATE);
      matfechadev = new FieldDef("matfechadev",FieldDef.DATE);
      matfechadest = new FieldDef("matfechadest",FieldDef.DATE);
      matinformado = new FieldDef("matinformado",FieldDef.CHAR,1);
      matref = new FieldDef("matref",FieldDef.CHAR,45);
      mataplic = new FieldDef("mataplic",FieldDef.CHAR,8);
      matdesc = new FieldDef("matdesc",FieldDef.CHAR,2000);
      FieldDef array[] = {
        matiden,
        matcliente,
        matcontacto,
        matusgeyce,
        matfechaent,
        matfechadev,
        matfechadest,
        matinformado,
        matref,
        mataplic,
        matdesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {matiden };
      setPrimaryKeys(arrayf);
      matiden.setAutoIncrementable(true);
      }
    }
    
  public class TabSrvrdwnld extends TableDef
    {
    // Campos
    public FieldDef srdaplicacion;
    public FieldDef srdurl;
    public TabSrvrdwnld(String name)
      {
      super(name);
      srdaplicacion = new FieldDef("srdaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      srdurl = new FieldDef("srdurl",FieldDef.CHAR,100);
      FieldDef array[] = {
        srdaplicacion,
        srdurl        
        };
      setColumns(array);
      FieldDef arrayf[] = {srdaplicacion };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabSis_hardware extends TableDef
    {
    // Campos
    public FieldDef sisiden;
    public FieldDef sisnomequip;
    public FieldDef siscpu;
    public FieldDef sisplacabas;
    public FieldDef sisteclat;
    public FieldDef sismouse;
    public FieldDef sisresol;
    public FieldDef sismonitor;
    public FieldDef sisdiscdur;
    public FieldDef sisunitats;
    public FieldDef sisunitxarx;
    public FieldDef sismemram;
    public FieldDef sismemus;
    public FieldDef siscd_dvd;
    public FieldDef sisempresa;
    public FieldDef sisnum_tarx;
    public FieldDef sistip_tarx;
    public FieldDef sissistem;
    public FieldDef sisservpack;
    public FieldDef sisdominiw;
    public FieldDef sisfuncions;
    public FieldDef sis_confip;
    public FieldDef sis_confip1;
    public FieldDef sisubicacio;
    public FieldDef sisfecharev;
    public FieldDef sisnotasrev;
    public FieldDef sisfechacom;
    public TabSis_hardware(String name)
      {
      super(name);
      sisiden = new FieldDef("sisiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sisnomequip = new FieldDef("sisnomequip",FieldDef.CHAR,30);
      siscpu = new FieldDef("siscpu",FieldDef.CHAR,250);
      sisplacabas = new FieldDef("sisplacabas",FieldDef.CHAR,50);
      sisteclat = new FieldDef("sisteclat",FieldDef.CHAR,2);
      sismouse = new FieldDef("sismouse",FieldDef.CHAR,2);
      sisresol = new FieldDef("sisresol",FieldDef.CHAR,10);
      sismonitor = new FieldDef("sismonitor",FieldDef.CHAR,2);
      sisdiscdur = new FieldDef("sisdiscdur",FieldDef.CHAR,10);
      sisunitats = new FieldDef("sisunitats",FieldDef.CHAR,50);
      sisunitxarx = new FieldDef("sisunitxarx",FieldDef.CHAR,50);
      sismemram = new FieldDef("sismemram",FieldDef.CHAR,25);
      sismemus = new FieldDef("sismemus",FieldDef.CHAR,25);
      siscd_dvd = new FieldDef("siscd_dvd",FieldDef.CHAR,10);
      sisempresa = new FieldDef("sisempresa",FieldDef.CHAR,25);
      sisnum_tarx = new FieldDef("sisnum_tarx",FieldDef.CHAR,5);
      sistip_tarx = new FieldDef("sistip_tarx",FieldDef.CHAR,100);
      sissistem = new FieldDef("sissistem",FieldDef.CHAR,100);
      sisservpack = new FieldDef("sisservpack",FieldDef.CHAR,100);
      sisdominiw = new FieldDef("sisdominiw",FieldDef.CHAR,10);
      sisfuncions = new FieldDef("sisfuncions",FieldDef.CHAR,1000);
      sis_confip = new FieldDef("sis_confip",FieldDef.CHAR,100);
      sis_confip1 = new FieldDef("sis_confip1",FieldDef.CHAR,100);
      sisubicacio = new FieldDef("sisubicacio",FieldDef.CHAR,75);
      sisfecharev = new FieldDef("sisfecharev",FieldDef.DATE);
      sisnotasrev = new FieldDef("sisnotasrev",FieldDef.CHAR,1000);
      sisfechacom = new FieldDef("sisfechacom",FieldDef.DATE);
      FieldDef array[] = {
        sisiden,
        sisnomequip,
        siscpu,
        sisplacabas,
        sisteclat,
        sismouse,
        sisresol,
        sismonitor,
        sisdiscdur,
        sisunitats,
        sisunitxarx,
        sismemram,
        sismemus,
        siscd_dvd,
        sisempresa,
        sisnum_tarx,
        sistip_tarx,
        sissistem,
        sisservpack,
        sisdominiw,
        sisfuncions,
        sis_confip,
        sis_confip1,
        sisubicacio,
        sisfecharev,
        sisnotasrev,
        sisfechacom        
        };
      setColumns(array);
      FieldDef arrayf[] = {sisiden };
      setPrimaryKeys(arrayf);
      sisiden.setAutoIncrementable(true);
      }
    }
    
  public class TabVisitas extends TableDef
    {
    // Campos
    public FieldDef visiden;
    public FieldDef viscliente;
    public FieldDef viscontacto;
    public FieldDef visfechaent;
    public FieldDef visfechasal;
    public FieldDef vismotivo;
    public FieldDef vistecnico;
    public TabVisitas(String name)
      {
      super(name);
      visiden = new FieldDef("visiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      viscliente = new FieldDef("viscliente",FieldDef.CHAR,12);
      viscontacto = new FieldDef("viscontacto",FieldDef.CHAR,45);
      visfechaent = new FieldDef("visfechaent",FieldDef.DATE);
      visfechasal = new FieldDef("visfechasal",FieldDef.DATE);
      vismotivo = new FieldDef("vismotivo",FieldDef.CHAR,1000);
      vistecnico = new FieldDef("vistecnico",FieldDef.CHAR,15);
      FieldDef array[] = {
        visiden,
        viscliente,
        viscontacto,
        visfechaent,
        visfechasal,
        vismotivo,
        vistecnico        
        };
      setColumns(array);
      FieldDef arrayf[] = {visiden };
      setPrimaryKeys(arrayf);
      visiden.setAutoIncrementable(true);
      }
    }
    
  public class TabCursos extends TableDef
    {
    // Campos
    public FieldDef curiden;
    public FieldDef curclient;
    public FieldDef curdatapre;
    public FieldDef curhoraspre;
    public FieldDef curformador;
    public FieldDef curaplica;
    public FieldDef curdataini;
    public FieldDef curhoraini;
    public FieldDef curdatafi;
    public FieldDef curhorai;
    public FieldDef curhorasreal;
    public FieldDef currevsis;
    public FieldDef curtecsis;
    public FieldDef currevfor;
    public FieldDef curtecfor;
    public FieldDef curobserv;
    public FieldDef curoferta;
    public FieldDef curfacturar;
    public FieldDef curfacturat;
    public TabCursos(String name)
      {
      super(name);
      curiden = new FieldDef("curiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      curclient = new FieldDef("curclient",FieldDef.CHAR,12);
      curdatapre = new FieldDef("curdatapre",FieldDef.DATE);
      curhoraspre = new FieldDef("curhoraspre",FieldDef.FLOAT,6,0);
      curformador = new FieldDef("curformador",FieldDef.CHAR,20);
      curaplica = new FieldDef("curaplica",FieldDef.CHAR,8);
      curdataini = new FieldDef("curdataini",FieldDef.DATE);
      curhoraini = new FieldDef("curhoraini",FieldDef.CHAR,5);
      curdatafi = new FieldDef("curdatafi",FieldDef.DATE);
      curhorai = new FieldDef("curhorai",FieldDef.CHAR,5);
      curhorasreal = new FieldDef("curhorasreal",FieldDef.FLOAT,6,0);
      currevsis = new FieldDef("currevsis",FieldDef.DATE);
      curtecsis = new FieldDef("curtecsis",FieldDef.CHAR,20);
      currevfor = new FieldDef("currevfor",FieldDef.DATE);
      curtecfor = new FieldDef("curtecfor",FieldDef.CHAR,20);
      curobserv = new FieldDef("curobserv",FieldDef.CHAR,2000);
      curoferta = new FieldDef("curoferta",FieldDef.CHAR,38);
      curfacturar = new FieldDef("curfacturar",FieldDef.CHAR,1);
      curfacturat = new FieldDef("curfacturat",FieldDef.CHAR,1);
      FieldDef array[] = {
        curiden,
        curclient,
        curdatapre,
        curhoraspre,
        curformador,
        curaplica,
        curdataini,
        curhoraini,
        curdatafi,
        curhorai,
        curhorasreal,
        currevsis,
        curtecsis,
        currevfor,
        curtecfor,
        curobserv,
        curoferta,
        curfacturar,
        curfacturat        
        };
      setColumns(array);
      FieldDef arrayf[] = {curiden };
      setPrimaryKeys(arrayf);
      curiden.setAutoIncrementable(true);
      }
    }
    
  public class TabIsotemas extends TableDef
    {
    // Campos
    public FieldDef tmisoservicio;
    public FieldDef tmisocodigo;
    public FieldDef tmisodesc;
    public FieldDef tmisourgencia;
    public FieldDef tmiestado;
    public FieldDef tmisoprojecte;
    public TabIsotemas(String name)
      {
      super(name);
      tmisoservicio = new FieldDef("tmisoservicio",FieldDef.CHAR,8,FieldDef.NOTNULL);
      tmisocodigo = new FieldDef("tmisocodigo",FieldDef.CHAR,20,FieldDef.NOTNULL);
      tmisodesc = new FieldDef("tmisodesc",FieldDef.CHAR,100);
      tmisourgencia = new FieldDef("tmisourgencia",FieldDef.INTEGER,0);
      tmiestado = new FieldDef("tmiestado",FieldDef.CHAR,2);
      tmisoprojecte = new FieldDef("tmisoprojecte",FieldDef.CHAR,20);
      FieldDef array[] = {
        tmisoservicio,
        tmisocodigo,
        tmisodesc,
        tmisourgencia,
        tmiestado,
        tmisoprojecte        
        };
      setColumns(array);
      FieldDef arrayf[] = {tmisoservicio,tmisocodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabIsoareasfunc extends TableDef
    {
    // Campos
    public FieldDef afisoservicio;
    public FieldDef afisocodigo;
    public FieldDef afisodesc;
    public TabIsoareasfunc(String name)
      {
      super(name);
      afisoservicio = new FieldDef("afisoservicio",FieldDef.CHAR,8,FieldDef.NOTNULL);
      afisocodigo = new FieldDef("afisocodigo",FieldDef.CHAR,20,FieldDef.NOTNULL);
      afisodesc = new FieldDef("afisodesc",FieldDef.CHAR,100);
      FieldDef array[] = {
        afisoservicio,
        afisocodigo,
        afisodesc        
        };
      setColumns(array);
      FieldDef arrayf[] = {afisoservicio,afisocodigo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAccmarketing extends TableDef
    {
    // Campos
    public FieldDef mktiden;
    public FieldDef mktcampanya;
    public FieldDef mktpublic;
    public FieldDef mkttipodest;
    public FieldDef mktproducte;
    public FieldDef mktdatasortida;
    public FieldDef mktdatafi;
    public FieldDef mktnumemails;
    public FieldDef mktnumclicks;
    public FieldDef mkttipo;
    public FieldDef mktasunto;
    public FieldDef mktvendes;
    public FieldDef mktarguments;
    public FieldDef mktremitent;
    public FieldDef mktidioma;
    public FieldDef mtktipcomunicat;
    public FieldDef mktformat;
    public FieldDef mktaudio;
    public FieldDef mktvideo;
    public FieldDef mktcodiemail;
    public TabAccmarketing(String name)
      {
      super(name);
      mktiden = new FieldDef("mktiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      mktcampanya = new FieldDef("mktcampanya",FieldDef.CHAR,30);
      mktpublic = new FieldDef("mktpublic",FieldDef.CHAR,255);
      mkttipodest = new FieldDef("mkttipodest",FieldDef.CHAR,1);
      mktproducte = new FieldDef("mktproducte",FieldDef.CHAR,100);
      mktdatasortida = new FieldDef("mktdatasortida",FieldDef.DATE);
      mktdatafi = new FieldDef("mktdatafi",FieldDef.DATE);
      mktnumemails = new FieldDef("mktnumemails",FieldDef.INTEGER,0);
      mktnumclicks = new FieldDef("mktnumclicks",FieldDef.INTEGER,0);
      mkttipo = new FieldDef("mkttipo",FieldDef.CHAR,1);
      mktasunto = new FieldDef("mktasunto",FieldDef.CHAR,70);
      mktvendes = new FieldDef("mktvendes",FieldDef.FLOAT,6,0);
      mktarguments = new FieldDef("mktarguments",FieldDef.CHAR,250);
      mktremitent = new FieldDef("mktremitent",FieldDef.CHAR,50);
      mktidioma = new FieldDef("mktidioma",FieldDef.CHAR,3);
      mtktipcomunicat = new FieldDef("mtktipcomunicat",FieldDef.CHAR,1);
      mktformat = new FieldDef("mktformat",FieldDef.CHAR,1);
      mktaudio = new FieldDef("mktaudio",FieldDef.CHAR,1);
      mktvideo = new FieldDef("mktvideo",FieldDef.CHAR,1);
      mktcodiemail = new FieldDef("mktcodiemail",FieldDef.INTEGER,0);
      FieldDef array[] = {
        mktiden,
        mktcampanya,
        mktpublic,
        mkttipodest,
        mktproducte,
        mktdatasortida,
        mktdatafi,
        mktnumemails,
        mktnumclicks,
        mkttipo,
        mktasunto,
        mktvendes,
        mktarguments,
        mktremitent,
        mktidioma,
        mtktipcomunicat,
        mktformat,
        mktaudio,
        mktvideo,
        mktcodiemail        
        };
      setColumns(array);
      FieldDef arrayf[] = {mktiden };
      setPrimaryKeys(arrayf);
      mktiden.setAutoIncrementable(true);
      }
    }
    
  public class TabAccesoremoto extends TableDef
    {
    // Campos
    public FieldDef arecodigo;
    public FieldDef arealias;
    public FieldDef areproducto;
    public TabAccesoremoto(String name)
      {
      super(name);
      arecodigo = new FieldDef("arecodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
      arealias = new FieldDef("arealias",FieldDef.CHAR,20,FieldDef.NOTNULL);
      areproducto = new FieldDef("areproducto",FieldDef.CHAR,15,FieldDef.NOTNULL);
      FieldDef array[] = {
        arecodigo,
        arealias,
        areproducto        
        };
      setColumns(array);
      FieldDef arrayf[] = {arecodigo,arealias,areproducto };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabControlicencia extends TableDef
    {
    // Campos
    public FieldDef ctlcliente;
    public FieldDef ctlreferencia;
    public FieldDef ctlfecha;
    public FieldDef ctlmachine;
    public FieldDef ctlusuario;
    public FieldDef ctlaplicacion;
    public FieldDef ctlpermitido;
    public FieldDef ctltarifa;
    public FieldDef ctlpuestosper;
    public FieldDef ctlpuestosocu;
    public FieldDef ctlnomspcocu;
    public TabControlicencia(String name)
      {
      super(name);
      ctlcliente = new FieldDef("ctlcliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      ctlreferencia = new FieldDef("ctlreferencia",FieldDef.CHAR,17);
      ctlfecha = new FieldDef("ctlfecha",FieldDef.DATE);
      ctlmachine = new FieldDef("ctlmachine",FieldDef.CHAR,50);
      ctlusuario = new FieldDef("ctlusuario",FieldDef.CHAR,25);
      ctlaplicacion = new FieldDef("ctlaplicacion",FieldDef.CHAR,15);
      ctlpermitido = new FieldDef("ctlpermitido",FieldDef.CHAR,1);
      ctltarifa = new FieldDef("ctltarifa",FieldDef.CHAR,10);
      ctlpuestosper = new FieldDef("ctlpuestosper",FieldDef.INTEGER,0);
      ctlpuestosocu = new FieldDef("ctlpuestosocu",FieldDef.INTEGER,0);
      ctlnomspcocu = new FieldDef("ctlnomspcocu",FieldDef.CHAR,150);
      FieldDef array[] = {
        ctlcliente,
        ctlreferencia,
        ctlfecha,
        ctlmachine,
        ctlusuario,
        ctlaplicacion,
        ctlpermitido,
        ctltarifa,
        ctlpuestosper,
        ctlpuestosocu,
        ctlnomspcocu        
        };
      setColumns(array);
      FieldDef arrayf[] = {ctlcliente,ctlreferencia };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabActcomer extends TableDef
    {
    // Campos
    public FieldDef acident;
    public FieldDef acsemdesde;
    public FieldDef acsemhasta;
    public FieldDef accomer;
    public FieldDef acnumofcli;
    public FieldDef acnumvencli;
    public FieldDef acnumofpon;
    public FieldDef acnumvenpon;
    public FieldDef acconefec;
    public FieldDef acvisefec;
    public FieldDef acvisform;
    public TabActcomer(String name)
      {
      super(name);
      acident = new FieldDef("acident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acsemdesde = new FieldDef("acsemdesde",FieldDef.DATE);
      acsemhasta = new FieldDef("acsemhasta",FieldDef.DATE);
      accomer = new FieldDef("accomer",FieldDef.CHAR,15);
      acnumofcli = new FieldDef("acnumofcli",FieldDef.INTEGER,0);
      acnumvencli = new FieldDef("acnumvencli",FieldDef.INTEGER,0);
      acnumofpon = new FieldDef("acnumofpon",FieldDef.INTEGER,0);
      acnumvenpon = new FieldDef("acnumvenpon",FieldDef.INTEGER,0);
      acconefec = new FieldDef("acconefec",FieldDef.INTEGER,0);
      acvisefec = new FieldDef("acvisefec",FieldDef.INTEGER,0);
      acvisform = new FieldDef("acvisform",FieldDef.INTEGER,0);
      FieldDef array[] = {
        acident,
        acsemdesde,
        acsemhasta,
        accomer,
        acnumofcli,
        acnumvencli,
        acnumofpon,
        acnumvenpon,
        acconefec,
        acvisefec,
        acvisform        
        };
      setColumns(array);
      FieldDef arrayf[] = {acident };
      setPrimaryKeys(arrayf);
      acident.setAutoIncrementable(true);
      }
    }
    
  public class TabBaixes extends TableDef
    {
    // Campos
    public FieldDef bxiden;
    public FieldDef bxcliente;
    public FieldDef bxfechareg;
    public FieldDef bxfechabaj;
    public FieldDef bxfechaalta;
    public FieldDef bxtipo;
    public FieldDef bxestado;
    public FieldDef bxaplicacion;
    public FieldDef bxproducto;
    public FieldDef bxaplicaciones;
    public FieldDef bxnivfactura;
    public FieldDef bxcausa;
    public FieldDef bxdesc;
    public FieldDef bxfirmaquali;
    public FieldDef bxafecfis;
    public FieldDef bxfirmafis;
    public FieldDef bxafeclab;
    public FieldDef bxfirmalab;
    public FieldDef bxcomer;
    public FieldDef bxfirmacomer;
    public FieldDef bxcontacto;
    public FieldDef bxusuario;
    public TabBaixes(String name)
      {
      super(name);
      bxiden = new FieldDef("bxiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bxcliente = new FieldDef("bxcliente",FieldDef.CHAR,12,FieldDef.NOTNULL);
      bxfechareg = new FieldDef("bxfechareg",FieldDef.DATE);
      bxfechabaj = new FieldDef("bxfechabaj",FieldDef.DATE);
      bxfechaalta = new FieldDef("bxfechaalta",FieldDef.DATE);
      bxtipo = new FieldDef("bxtipo",FieldDef.CHAR,1);
      bxestado = new FieldDef("bxestado",FieldDef.CHAR,1);
      bxaplicacion = new FieldDef("bxaplicacion",FieldDef.CHAR,8);
      bxproducto = new FieldDef("bxproducto",FieldDef.CHAR,15);
      bxaplicaciones = new FieldDef("bxaplicaciones",FieldDef.CHAR,300);
      bxnivfactura = new FieldDef("bxnivfactura",FieldDef.CHAR,1);
      bxcausa = new FieldDef("bxcausa",FieldDef.INTEGER,0);
      bxdesc = new FieldDef("bxdesc",FieldDef.CHAR,500);
      bxfirmaquali = new FieldDef("bxfirmaquali",FieldDef.DATE);
      bxafecfis = new FieldDef("bxafecfis",FieldDef.CHAR,1);
      bxfirmafis = new FieldDef("bxfirmafis",FieldDef.DATE);
      bxafeclab = new FieldDef("bxafeclab",FieldDef.CHAR,1);
      bxfirmalab = new FieldDef("bxfirmalab",FieldDef.DATE);
      bxcomer = new FieldDef("bxcomer",FieldDef.CHAR,20);
      bxfirmacomer = new FieldDef("bxfirmacomer",FieldDef.DATE);
      bxcontacto = new FieldDef("bxcontacto",FieldDef.CHAR,30);
      bxusuario = new FieldDef("bxusuario",FieldDef.CHAR,20);
      FieldDef array[] = {
        bxiden,
        bxcliente,
        bxfechareg,
        bxfechabaj,
        bxfechaalta,
        bxtipo,
        bxestado,
        bxaplicacion,
        bxproducto,
        bxaplicaciones,
        bxnivfactura,
        bxcausa,
        bxdesc,
        bxfirmaquali,
        bxafecfis,
        bxfirmafis,
        bxafeclab,
        bxfirmalab,
        bxcomer,
        bxfirmacomer,
        bxcontacto,
        bxusuario        
        };
      setColumns(array);
      FieldDef arrayf[] = {bxiden };
      setPrimaryKeys(arrayf);
      bxiden.setAutoIncrementable(true);
      }
    }
    
  public class TabIsosprintiso extends TableDef
    {
    // Campos
    public FieldDef ipiiden;
    public FieldDef ipirqiden;
    public FieldDef ipinciden;
    public TabIsosprintiso(String name)
      {
      super(name);
      ipiiden = new FieldDef("ipiiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ipirqiden = new FieldDef("ipirqiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ipinciden = new FieldDef("ipinciden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        ipiiden,
        ipirqiden,
        ipinciden        
        };
      setColumns(array);
      FieldDef arrayf[] = {ipiiden };
      setPrimaryKeys(arrayf);
      ipiiden.setAutoIncrementable(true);
      }
    }
    
  public CatXagpi()
    {
    tabgycauto = new TabGycauto("gycauto");
    tabcomuniauton = new TabComuniauton("comuniauton");
    tabprovincia = new TabProvincia("provincia");
    tabmunicipio = new TabMunicipio("municipio");
    tabpais = new TabPais("pais");
    tabdelhacienda = new TabDelhacienda("delhacienda");
    tabadmhacienda = new TabAdmhacienda("admhacienda");
    tabbanco = new TabBanco("banco");
    tabidioma = new TabIdioma("idioma");
    tabtexto = new TabTexto("texto");
    tabtraduccion = new TabTraduccion("traduccion");
    tabvalores = new TabValores("valores");
    tabdatgen = new TabDatgen("datgen");
    tabgeyce = new TabGeyce("geyce");
    tabdp = new TabDp("dp");
    tabclientedp = new TabClientedp("clientedp");
    tabpoten = new TabPoten("poten");
    tabpotenagrup = new TabPotenagrup("potenagrup");
    tabformapago = new TabFormapago("formapago");
    tabusuario = new TabUsuario("usuario");
    tabaplicacion = new TabAplicacion("aplicacion");
    tabproducto = new TabProducto("producto");
    tabtarifa = new TabTarifa("tarifa");
    tabfuturasver = new TabFuturasver("futurasver");
    tabregla = new TabRegla("regla");
    tabdemo = new TabDemo("demo");
    tabmanual = new TabManual("manual");
    tabversion = new TabVersion("version");
    tabfaq = new TabFaq("faq");
    tabavisos = new TabAvisos("avisos");
    tabconsulta = new TabConsulta("consulta");
    tabcontratado = new TabContratado("contratado");
    tabasp = new TabAsp("asp");
    tabuso = new TabUso("uso");
    tabformulario = new TabFormulario("formulario");
    tabeoperfil = new TabEoperfil("eoperfil");
    tabconceptogasto = new TabConceptogasto("conceptogasto");
    tabeoactividad = new TabEoactividad("eoactividad");
    tabeoapunte = new TabEoapunte("eoapunte");
    tabeotiposiva = new TabEotiposiva("eotiposiva");
    tabeoacumiva = new TabEoacumiva("eoacumiva");
    tabeoacumret = new TabEoacumret("eoacumret");
    tablabproductor = new TabLabproductor("labproductor");
    tablabacumula = new TabLabacumula("labacumula");
    tablabfechas = new TabLabfechas("labfechas");
    tablababsentismo = new TabLababsentismo("lababsentismo");
    tablabdatbanc = new TabLabdatbanc("labdatbanc");
    tablabpuesto = new TabLabpuesto("labpuesto");
    tablabdatcont = new TabLabdatcont("labdatcont");
    tablabconcepvar = new TabLabconcepvar("labconcepvar");
    tablabconvarcdp = new TabLabconvarcdp("labconvarcdp");
    tablabperfil = new TabLabperfil("labperfil");
    tablabproceso = new TabLabproceso("labproceso");
    tablabaccioncdp = new TabLabaccioncdp("labaccioncdp");
    tablabretvar = new TabLabretvar("labretvar");
    tablabcontrato = new TabLabcontrato("labcontrato");
    tablabcontvence = new TabLabcontvence("labcontvence");
    tablabit = new TabLabit("labit");
    tabcontrol = new TabControl("control");
    tabpubpdfref = new TabPubpdfref("pubpdfref");
    tabentrega = new TabEntrega("entrega");
    tabpartetecnico = new TabPartetecnico("partetecnico");
    tablink = new TabLink("link");
    tabgif = new TabGif("gif");
    tabayudatxt = new TabAyudatxt("ayudatxt");
    tabwebtxt = new TabWebtxt("webtxt");
    tabdescarga = new TabDescarga("descarga");
    tabtransaccion = new TabTransaccion("transaccion");
    tabtransacciondet = new TabTransacciondet("transacciondet");
    tabseminario = new TabSeminario("seminario");
    tabpostit = new TabPostit("postit");
    tabcurso = new TabCurso("curso");
    tabconvocatorias = new TabConvocatorias("convocatorias");
    tabreservas = new TabReservas("reservas");
    tabestadis = new TabEstadis("estadis");
    tabcpcomer = new TabCpcomer("cpcomer");
    tabcomseg = new TabComseg("comseg");
    tabobjectius = new TabObjectius("objectius");
    tabstparams = new TabStparams("stparams");
    tabestattec = new TabEstattec("estattec");
    tabservei = new TabServei("servei");
    tabservtec = new TabServtec("servtec");
    tabcampanya = new TabCampanya("campanya");
    tabcampamir = new TabCampamir("campamir");
    tabimpactos = new TabImpactos("impactos");
    tabjars = new TabJars("jars");
    tabpartner = new TabPartner("partner");
    tabclivoffice = new TabClivoffice("clivoffice");
    tabavisosvistos = new TabAvisosvistos("avisosvistos");
    tabdocspub = new TabDocspub("docspub");
    tabenquestes = new TabEnquestes("enquestes");
    tabenqarees = new TabEnqarees("enqarees");
    tabenquesta = new TabEnquesta("enquesta");
    tabenqxclient = new TabEnqxclient("enqxclient");
    tabenqxclientdet = new TabEnqxclientdet("enqxclientdet");
    tabseries = new TabSeries("series");
    tabofcomanda = new TabOfcomanda("ofcomanda");
    taboferta = new TabOferta("oferta");
    tabofertadet = new TabOfertadet("ofertadet");
    tabofertaprojtec = new TabOfertaprojtec("ofertaprojtec");
    taboftarifadep = new TabOftarifadep("oftarifadep");
    tabofdescomptes = new TabOfdescomptes("ofdescomptes");
    taboftartasques = new TabOftartasques("oftartasques");
    tabdatgennum = new TabDatgennum("datgennum");
    tabfacrebudes = new TabFacrebudes("facrebudes");
    tabproveedor = new TabProveedor("proveedor");
    tabisoaccioncorrec = new TabIsoaccioncorrec("isoaccioncorrec");
    tabisoncrecsug = new TabIsoncrecsug("isoncrecsug");
    tabisoprocedim = new TabIsoprocedim("isoprocedim");
    tabisoprocxambit = new TabIsoprocxambit("isoprocxambit");
    tabisoambits = new TabIsoambits("isoambits");
    tabpromocion = new TabPromocion("promocion");
    tabmails = new TabMails("mails");
    tabvologpagouso = new TabVologpagouso("vologpagouso");
    tabeportemdocs = new TabEportemdocs("eportemdocs");
    tabclimat = new TabClimat("climat");
    tabsrvrdwnld = new TabSrvrdwnld("srvrdwnld");
    tabsis_hardware = new TabSis_hardware("sis_hardware");
    tabvisitas = new TabVisitas("visitas");
    tabcursos = new TabCursos("cursos");
    tabisotemas = new TabIsotemas("isotemas");
    tabisoareasfunc = new TabIsoareasfunc("isoareasfunc");
    tabaccmarketing = new TabAccmarketing("accmarketing");
    tabaccesoremoto = new TabAccesoremoto("accesoremoto");
    tabcontrolicencia = new TabControlicencia("controlicencia");
    tabactcomer = new TabActcomer("actcomer");
    tabbaixes = new TabBaixes("baixes");
    tabisosprintiso = new TabIsosprintiso("isosprintiso");
    TableDef array[] = {
      tabgycauto,
      tabcomuniauton,
      tabprovincia,
      tabmunicipio,
      tabpais,
      tabdelhacienda,
      tabadmhacienda,
      tabbanco,
      tabidioma,
      tabtexto,
      tabtraduccion,
      tabvalores,
      tabdatgen,
      tabgeyce,
      tabdp,
      tabclientedp,
      tabpoten,
      tabpotenagrup,
      tabformapago,
      tabusuario,
      tabaplicacion,
      tabproducto,
      tabtarifa,
      tabfuturasver,
      tabregla,
      tabdemo,
      tabmanual,
      tabversion,
      tabfaq,
      tabavisos,
      tabconsulta,
      tabcontratado,
      tabasp,
      tabuso,
      tabformulario,
      tabeoperfil,
      tabconceptogasto,
      tabeoactividad,
      tabeoapunte,
      tabeotiposiva,
      tabeoacumiva,
      tabeoacumret,
      tablabproductor,
      tablabacumula,
      tablabfechas,
      tablababsentismo,
      tablabdatbanc,
      tablabpuesto,
      tablabdatcont,
      tablabconcepvar,
      tablabconvarcdp,
      tablabperfil,
      tablabproceso,
      tablabaccioncdp,
      tablabretvar,
      tablabcontrato,
      tablabcontvence,
      tablabit,
      tabcontrol,
      tabpubpdfref,
      tabentrega,
      tabpartetecnico,
      tablink,
      tabgif,
      tabayudatxt,
      tabwebtxt,
      tabdescarga,
      tabtransaccion,
      tabtransacciondet,
      tabseminario,
      tabpostit,
      tabcurso,
      tabconvocatorias,
      tabreservas,
      tabestadis,
      tabcpcomer,
      tabcomseg,
      tabobjectius,
      tabstparams,
      tabestattec,
      tabservei,
      tabservtec,
      tabcampanya,
      tabcampamir,
      tabimpactos,
      tabjars,
      tabpartner,
      tabclivoffice,
      tabavisosvistos,
      tabdocspub,
      tabenquestes,
      tabenqarees,
      tabenquesta,
      tabenqxclient,
      tabenqxclientdet,
      tabseries,
      tabofcomanda,
      taboferta,
      tabofertadet,
      tabofertaprojtec,
      taboftarifadep,
      tabofdescomptes,
      taboftartasques,
      tabdatgennum,
      tabfacrebudes,
      tabproveedor,
      tabisoaccioncorrec,
      tabisoncrecsug,
      tabisoprocedim,
      tabisoprocxambit,
      tabisoambits,
      tabpromocion,
      tabmails,
      tabvologpagouso,
      tabeportemdocs,
      tabclimat,
      tabsrvrdwnld,
      tabsis_hardware,
      tabvisitas,
      tabcursos,
      tabisotemas,
      tabisoareasfunc,
      tabaccmarketing,
      tabaccesoremoto,
      tabcontrolicencia,
      tabactcomer,
      tabbaixes,
      tabisosprintiso      
      };
    setTables(array);
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
    FieldDef tabadmhaciendaArrayf1[] = { tabadmhacienda.ahdele };
    ForeignKey tabadmhaciendaArrayfk[] = { 
      new ForeignKey(tabdelhacienda,tabadmhaciendaArrayf1)      
      };
    tabadmhacienda.setForeignKeys(tabadmhaciendaArrayfk);
    FieldDef tabtraduccionArrayf1[] = { tabtraduccion.ttxidioma };
    FieldDef tabtraduccionArrayf2[] = { tabtraduccion.ttxtexto };
    ForeignKey tabtraduccionArrayfk[] = { 
      new ForeignKey(tabidioma,tabtraduccionArrayf1),
      new ForeignKey(tabtexto,tabtraduccionArrayf2)      
      };
    tabtraduccion.setForeignKeys(tabtraduccionArrayfk);
    FieldDef tabvaloresArrayf1[] = { tabvalores.vadesc };
    ForeignKey tabvaloresArrayfk[] = { 
      new ForeignKey(tabtexto,tabvaloresArrayf1)      
      };
    tabvalores.setForeignKeys(tabvaloresArrayfk);
    FieldDef tabgeyceArrayf1[] = { tabgeyce.gecodigo };
    FieldDef tabgeyceArrayf2[] = { tabgeyce.geidioma };
    ForeignKey tabgeyceArrayfk[] = { 
      new ForeignKey(tabdatgen,tabgeyceArrayf1),
      new ForeignKey(tabidioma,tabgeyceArrayf2)      
      };
    tabgeyce.setForeignKeys(tabgeyceArrayfk);
    FieldDef tabdpArrayf1[] = { tabdp.dpcodigo };
    ForeignKey tabdpArrayfk[] = { 
      new ForeignKey(tabdatgen,tabdpArrayf1)      
      };
    tabdp.setForeignKeys(tabdpArrayfk);
    FieldDef tabclientedpArrayf1[] = { tabclientedp.clicodigo };
    FieldDef tabclientedpArrayf2[] = { tabclientedp.clidpcodigo };
    ForeignKey tabclientedpArrayfk[] = { 
      new ForeignKey(tabdatgen,tabclientedpArrayf1),
      new ForeignKey(tabdp,tabclientedpArrayf2)      
      };
    tabclientedp.setForeignKeys(tabclientedpArrayfk);
    FieldDef tabpotenArrayf1[] = { tabpoten.pocodigo };
    ForeignKey tabpotenArrayfk[] = { 
      new ForeignKey(tabdatgen,tabpotenArrayf1)      
      };
    tabpoten.setForeignKeys(tabpotenArrayfk);
    FieldDef tabpotenagrupArrayf1[] = { tabpotenagrup.pacodigo };
    FieldDef tabpotenagrupArrayf2[] = { tabpotenagrup.pacorreoult };
    ForeignKey tabpotenagrupArrayfk[] = { 
      new ForeignKey(tabdatgen,tabpotenagrupArrayf1),
      new ForeignKey(tabmails,tabpotenagrupArrayf2)      
      };
    tabpotenagrup.setForeignKeys(tabpotenagrupArrayfk);
    FieldDef tabformapagoArrayf1[] = { tabformapago.fpbanco };
    FieldDef tabformapagoArrayf2[] = { tabformapago.fpcodigo };
    ForeignKey tabformapagoArrayfk[] = { 
      new ForeignKey(tabbanco,tabformapagoArrayf1),
      new ForeignKey(tabdatgen,tabformapagoArrayf2)      
      };
    tabformapago.setForeignKeys(tabformapagoArrayfk);
    FieldDef tabusuarioArrayf1[] = { tabusuario.uscodigo };
    FieldDef tabusuarioArrayf2[] = { tabusuario.usidioma };
    ForeignKey tabusuarioArrayfk[] = { 
      new ForeignKey(tabdatgen,tabusuarioArrayf1),
      new ForeignKey(tabidioma,tabusuarioArrayf2)      
      };
    tabusuario.setForeignKeys(tabusuarioArrayfk);
    FieldDef tabaplicacionArrayf1[] = { tabaplicacion.apdescrip };
    ForeignKey tabaplicacionArrayfk[] = { 
      new ForeignKey(tabtexto,tabaplicacionArrayf1)      
      };
    tabaplicacion.setForeignKeys(tabaplicacionArrayfk);
    FieldDef tabproductoArrayf1[] = { tabproducto.prodesc };
    FieldDef tabproductoArrayf2[] = { tabproducto.proaplicacion };
    ForeignKey tabproductoArrayfk[] = { 
      new ForeignKey(tabtexto,tabproductoArrayf1),
      new ForeignKey(tabaplicacion,tabproductoArrayf2)      
      };
    tabproducto.setForeignKeys(tabproductoArrayfk);
    FieldDef tabtarifaArrayf1[] = { tabtarifa.tarproducto };
    ForeignKey tabtarifaArrayfk[] = { 
      new ForeignKey(tabproducto,tabtarifaArrayf1)      
      };
    tabtarifa.setForeignKeys(tabtarifaArrayfk);
    FieldDef tabfuturasverArrayf1[] = { tabfuturasver.fuproducto };
    FieldDef tabfuturasverArrayf2[] = { tabfuturasver.fuaplicacion };
    FieldDef tabfuturasverArrayf3[] = { tabfuturasver.fudescrip };
    ForeignKey tabfuturasverArrayfk[] = { 
      new ForeignKey(tabproducto,tabfuturasverArrayf1),
      new ForeignKey(tabaplicacion,tabfuturasverArrayf2),
      new ForeignKey(tabtexto,tabfuturasverArrayf3)      
      };
    tabfuturasver.setForeignKeys(tabfuturasverArrayfk);
    FieldDef tabreglaArrayf1[] = { tabregla.reproducto };
    FieldDef tabreglaArrayf2[] = { tabregla.redestino };
    FieldDef tabreglaArrayf3[] = { tabregla.reemisor };
    ForeignKey tabreglaArrayfk[] = { 
      new ForeignKey(tabproducto,tabreglaArrayf1),
      new ForeignKey(tabdatgen,tabreglaArrayf2),
      new ForeignKey(tabdatgen,tabreglaArrayf3)      
      };
    tabregla.setForeignKeys(tabreglaArrayfk);
    FieldDef tabdemoArrayf1[] = { tabdemo.deproducto };
    FieldDef tabdemoArrayf2[] = { tabdemo.dedesc };
    ForeignKey tabdemoArrayfk[] = { 
      new ForeignKey(tabproducto,tabdemoArrayf1),
      new ForeignKey(tabtexto,tabdemoArrayf2)      
      };
    tabdemo.setForeignKeys(tabdemoArrayfk);
    FieldDef tabmanualArrayf1[] = { tabmanual.madesc };
    ForeignKey tabmanualArrayfk[] = { 
      new ForeignKey(tabtexto,tabmanualArrayf1)      
      };
    tabmanual.setForeignKeys(tabmanualArrayfk);
    FieldDef tabversionArrayf1[] = { tabversion.veproducto };
    FieldDef tabversionArrayf2[] = { tabversion.vedesc };
    ForeignKey tabversionArrayfk[] = { 
      new ForeignKey(tabaplicacion,tabversionArrayf1),
      new ForeignKey(tabtexto,tabversionArrayf2)      
      };
    tabversion.setForeignKeys(tabversionArrayfk);
    FieldDef tabfaqArrayf1[] = { tabfaq.faqproducto };
    FieldDef tabfaqArrayf2[] = { tabfaq.faqaplicacion };
    FieldDef tabfaqArrayf3[] = { tabfaq.faqpregunta };
    FieldDef tabfaqArrayf4[] = { tabfaq.faqrespuesta };
    ForeignKey tabfaqArrayfk[] = { 
      new ForeignKey(tabproducto,tabfaqArrayf1),
      new ForeignKey(tabaplicacion,tabfaqArrayf2),
      new ForeignKey(tabtexto,tabfaqArrayf3),
      new ForeignKey(tabtexto,tabfaqArrayf4)      
      };
    tabfaq.setForeignKeys(tabfaqArrayfk);
    FieldDef tabavisosArrayf1[] = { tabavisos.avtexto };
    ForeignKey tabavisosArrayfk[] = { 
      new ForeignKey(tabtexto,tabavisosArrayf1)      
      };
    tabavisos.setForeignKeys(tabavisosArrayfk);
    FieldDef tabconsultaArrayf1[] = { tabconsulta.cnpregunta };
    FieldDef tabconsultaArrayf2[] = { tabconsulta.cnrespuesta };
    ForeignKey tabconsultaArrayfk[] = { 
      new ForeignKey(tabtexto,tabconsultaArrayf1),
      new ForeignKey(tabtexto,tabconsultaArrayf2)      
      };
    tabconsulta.setForeignKeys(tabconsultaArrayfk);
    FieldDef tabcontratadoArrayf1[] = { tabcontratado.concodigo };
    FieldDef tabcontratadoArrayf2[] = { tabcontratado.contarifa };
    FieldDef tabcontratadoArrayf3[] = { tabcontratado.conproducto };
    ForeignKey tabcontratadoArrayfk[] = { 
      new ForeignKey(tabdatgen,tabcontratadoArrayf1),
      new ForeignKey(tabtarifa,tabcontratadoArrayf2),
      new ForeignKey(tabproducto,tabcontratadoArrayf3)      
      };
    tabcontratado.setForeignKeys(tabcontratadoArrayfk);
    FieldDef tabaspArrayf1[] = { tabasp.aspcodigo };
    FieldDef tabaspArrayf2[] = { tabasp.aspproducto };
    ForeignKey tabaspArrayfk[] = { 
      new ForeignKey(tabdatgen,tabaspArrayf1),
      new ForeignKey(tabproducto,tabaspArrayf2)      
      };
    tabasp.setForeignKeys(tabaspArrayfk);
    FieldDef tabusoArrayf1[] = { tabuso.usocodigo,tabuso.usoalias };
    FieldDef tabusoArrayf2[] = { tabuso.usoproducto };
    ForeignKey tabusoArrayfk[] = { 
      new ForeignKey(tabusuario,tabusoArrayf1),
      new ForeignKey(tabproducto,tabusoArrayf2)      
      };
    tabuso.setForeignKeys(tabusoArrayfk);
    FieldDef tabformularioArrayf1[] = { tabformulario.fodescripcion };
    ForeignKey tabformularioArrayfk[] = { 
      new ForeignKey(tabtexto,tabformularioArrayf1)      
      };
    tabformulario.setForeignKeys(tabformularioArrayfk);
    FieldDef tabeoperfilArrayf1[] = { tabeoperfil.pfcliente };
    ForeignKey tabeoperfilArrayfk[] = { 
      new ForeignKey(tabdatgen,tabeoperfilArrayf1)      
      };
    tabeoperfil.setForeignKeys(tabeoperfilArrayfk);
    FieldDef tabconceptogastoArrayf1[] = { tabconceptogasto.gadesc };
    ForeignKey tabconceptogastoArrayfk[] = { 
      new ForeignKey(tabtexto,tabconceptogastoArrayf1)      
      };
    tabconceptogasto.setForeignKeys(tabconceptogastoArrayfk);
    FieldDef tabeoactividadArrayf1[] = { tabeoactividad.acdesc };
    FieldDef tabeoactividadArrayf2[] = { tabeoactividad.acformventa };
    FieldDef tabeoactividadArrayf3[] = { tabeoactividad.acformgasto };
    FieldDef tabeoactividadArrayf4[] = { tabeoactividad.acformcompra };
    ForeignKey tabeoactividadArrayfk[] = { 
      new ForeignKey(tabtexto,tabeoactividadArrayf1),
      new ForeignKey(tabformulario,tabeoactividadArrayf2),
      new ForeignKey(tabformulario,tabeoactividadArrayf3),
      new ForeignKey(tabformulario,tabeoactividadArrayf4)      
      };
    tabeoactividad.setForeignKeys(tabeoactividadArrayfk);
    FieldDef tabeoapunteArrayf1[] = { tabeoapunte.eoejer,tabeoapunte.eocongasto };
    FieldDef tabeoapunteArrayf2[] = { tabeoapunte.eoclientedp,tabeoapunte.eoactividad };
    ForeignKey tabeoapunteArrayfk[] = { 
      new ForeignKey(tabconceptogasto,tabeoapunteArrayf1),
      new ForeignKey(tabeoactividad,tabeoapunteArrayf2)      
      };
    tabeoapunte.setForeignKeys(tabeoapunteArrayfk);
    FieldDef tabeoacumivaArrayf1[] = { tabeoacumiva.eicliente,tabeoacumiva.eiactividad };
    ForeignKey tabeoacumivaArrayfk[] = { 
      new ForeignKey(tabeoactividad,tabeoacumivaArrayf1)      
      };
    tabeoacumiva.setForeignKeys(tabeoacumivaArrayfk);
    FieldDef tabeoacumretArrayf1[] = { tabeoacumret.ercliente,tabeoacumret.eractividad };
    ForeignKey tabeoacumretArrayfk[] = { 
      new ForeignKey(tabeoactividad,tabeoacumretArrayf1)      
      };
    tabeoacumret.setForeignKeys(tabeoacumretArrayfk);
    FieldDef tablabproductorArrayf1[] = { tablabproductor.pdclientedp };
    ForeignKey tablabproductorArrayfk[] = { 
      new ForeignKey(tabclientedp,tablabproductorArrayf1)      
      };
    tablabproductor.setForeignKeys(tablabproductorArrayfk);
    FieldDef tablabacumulaArrayf1[] = { tablabacumula.acuclientedp,tablabacumula.acuproductor };
    ForeignKey tablabacumulaArrayfk[] = { 
      new ForeignKey(tablabproductor,tablabacumulaArrayf1)      
      };
    tablabacumula.setForeignKeys(tablabacumulaArrayfk);
    FieldDef tablabfechasArrayf1[] = { tablabfechas.feclientedp,tablabfechas.feproductor };
    ForeignKey tablabfechasArrayfk[] = { 
      new ForeignKey(tablabproductor,tablabfechasArrayf1)      
      };
    tablabfechas.setForeignKeys(tablabfechasArrayfk);
    FieldDef tablababsentismoArrayf1[] = { tablababsentismo.abclientedp,tablababsentismo.abproductor };
    ForeignKey tablababsentismoArrayfk[] = { 
      new ForeignKey(tablabproductor,tablababsentismoArrayf1)      
      };
    tablababsentismo.setForeignKeys(tablababsentismoArrayfk);
    FieldDef tablabdatbancArrayf1[] = { tablabdatbanc.dbclientedp,tablabdatbanc.dbproductor };
    ForeignKey tablabdatbancArrayfk[] = { 
      new ForeignKey(tablabproductor,tablabdatbancArrayf1)      
      };
    tablabdatbanc.setForeignKeys(tablabdatbancArrayfk);
    FieldDef tablabpuestoArrayf1[] = { tablabpuesto.puclientedp,tablabpuesto.puproductor };
    ForeignKey tablabpuestoArrayfk[] = { 
      new ForeignKey(tablabproductor,tablabpuestoArrayf1)      
      };
    tablabpuesto.setForeignKeys(tablabpuestoArrayfk);
    FieldDef tablabdatcontArrayf1[] = { tablabdatcont.dcclientedp,tablabdatcont.dcproductor };
    FieldDef tablabdatcontArrayf2[] = { tablabdatcont.dctipocont };
    ForeignKey tablabdatcontArrayfk[] = { 
      new ForeignKey(tablabproductor,tablabdatcontArrayf1),
      new ForeignKey(tablabcontrato,tablabdatcontArrayf2)      
      };
    tablabdatcont.setForeignKeys(tablabdatcontArrayfk);
    FieldDef tablabconcepvarArrayf1[] = { tablabconcepvar.cvcliente };
    ForeignKey tablabconcepvarArrayfk[] = { 
      new ForeignKey(tabdatgen,tablabconcepvarArrayf1)      
      };
    tablabconcepvar.setForeignKeys(tablabconcepvarArrayfk);
    FieldDef tablabconvarcdpArrayf1[] = { tablabconvarcdp.cvccliente };
    FieldDef tablabconvarcdpArrayf2[] = { tablabconvarcdp.cvcconcep };
    ForeignKey tablabconvarcdpArrayfk[] = { 
      new ForeignKey(tabdatgen,tablabconvarcdpArrayf1),
      new ForeignKey(tablabconcepvar,tablabconvarcdpArrayf2)      
      };
    tablabconvarcdp.setForeignKeys(tablabconvarcdpArrayfk);
    FieldDef tablabperfilArrayf1[] = { tablabperfil.pecliente };
    FieldDef tablabperfilArrayf2[] = { tablabperfil.peformrevar };
    ForeignKey tablabperfilArrayfk[] = { 
      new ForeignKey(tabdatgen,tablabperfilArrayf1),
      new ForeignKey(tabformulario,tablabperfilArrayf2)      
      };
    tablabperfil.setForeignKeys(tablabperfilArrayfk);
    FieldDef tablabprocesoArrayf1[] = { tablabproceso.prdesc };
    ForeignKey tablabprocesoArrayfk[] = { 
      new ForeignKey(tabtexto,tablabprocesoArrayf1)      
      };
    tablabproceso.setForeignKeys(tablabprocesoArrayfk);
    FieldDef tablabaccioncdpArrayf1[] = { tablabaccioncdp.acdesc };
    ForeignKey tablabaccioncdpArrayfk[] = { 
      new ForeignKey(tabtexto,tablabaccioncdpArrayf1)      
      };
    tablabaccioncdp.setForeignKeys(tablabaccioncdpArrayfk);
    FieldDef tablabretvarArrayf1[] = { tablabretvar.rvproceso };
    FieldDef tablabretvarArrayf2[] = { tablabretvar.rvclientedp,tablabretvar.rvproduc };
    FieldDef tablabretvarArrayf3[] = { tablabretvar.rvconcep };
    ForeignKey tablabretvarArrayfk[] = { 
      new ForeignKey(tablabproceso,tablabretvarArrayf1),
      new ForeignKey(tablabproductor,tablabretvarArrayf2),
      new ForeignKey(tablabconcepvar,tablabretvarArrayf3)      
      };
    tablabretvar.setForeignKeys(tablabretvarArrayfk);
    FieldDef tablabcontratoArrayf1[] = { tablabcontrato.ctdesc };
    ForeignKey tablabcontratoArrayfk[] = { 
      new ForeignKey(tabtexto,tablabcontratoArrayf1)      
      };
    tablabcontrato.setForeignKeys(tablabcontratoArrayfk);
    FieldDef tablabcontvenceArrayf1[] = { tablabcontvence.cvclientedp,tablabcontvence.cvproduc };
    ForeignKey tablabcontvenceArrayfk[] = { 
      new ForeignKey(tablabproductor,tablabcontvenceArrayf1)      
      };
    tablabcontvence.setForeignKeys(tablabcontvenceArrayfk);
    FieldDef tablabitArrayf1[] = { tablabit.itproceso };
    FieldDef tablabitArrayf2[] = { tablabit.itclientedp,tablabit.itproduc };
    ForeignKey tablabitArrayfk[] = { 
      new ForeignKey(tablabproceso,tablabitArrayf1),
      new ForeignKey(tablabproductor,tablabitArrayf2)      
      };
    tablabit.setForeignKeys(tablabitArrayfk);
    FieldDef tabcontrolArrayf1[] = { tabcontrol.ctrclialta,tabcontrol.ctrusralta };
    FieldDef tabcontrolArrayf2[] = { tabcontrol.ctrclimodif,tabcontrol.ctrusrmodif };
    FieldDef tabcontrolArrayf3[] = { tabcontrol.ctrclicapt,tabcontrol.ctrusrcapt };
    FieldDef tabcontrolArrayf4[] = { tabcontrol.ctrclival,tabcontrol.ctrusrval };
    ForeignKey tabcontrolArrayfk[] = { 
      new ForeignKey(tabusuario,tabcontrolArrayf1),
      new ForeignKey(tabusuario,tabcontrolArrayf2),
      new ForeignKey(tabusuario,tabcontrolArrayf3),
      new ForeignKey(tabusuario,tabcontrolArrayf4)      
      };
    tabcontrol.setForeignKeys(tabcontrolArrayfk);
    FieldDef tabpubpdfrefArrayf1[] = { tabpubpdfref.pupdp };
    FieldDef tabpubpdfrefArrayf2[] = { tabpubpdfref.pupclientedp };
    FieldDef tabpubpdfrefArrayf3[] = { tabpubpdfref.pupproducto };
    ForeignKey tabpubpdfrefArrayfk[] = { 
      new ForeignKey(tabdp,tabpubpdfrefArrayf1),
      new ForeignKey(tabclientedp,tabpubpdfrefArrayf2),
      new ForeignKey(tabproducto,tabpubpdfrefArrayf3)      
      };
    tabpubpdfref.setForeignKeys(tabpubpdfrefArrayfk);
    FieldDef tabentregaArrayf1[] = { tabentrega.enemisor };
    FieldDef tabentregaArrayf2[] = { tabentrega.enreceptor };
    ForeignKey tabentregaArrayfk[] = { 
      new ForeignKey(tabdatgen,tabentregaArrayf1),
      new ForeignKey(tabdatgen,tabentregaArrayf2)      
      };
    tabentrega.setForeignKeys(tabentregaArrayfk);
    FieldDef tabpartetecnicoArrayf1[] = { tabpartetecnico.ptcliente };
    FieldDef tabpartetecnicoArrayf2[] = { tabpartetecnico.ptproducto };
    FieldDef tabpartetecnicoArrayf3[] = { tabpartetecnico.ptisoncrecsug };
    FieldDef tabpartetecnicoArrayf4[] = { tabpartetecnico.ptaplicacion };
    ForeignKey tabpartetecnicoArrayfk[] = { 
      new ForeignKey(tabdatgen,tabpartetecnicoArrayf1),
      new ForeignKey(tabproducto,tabpartetecnicoArrayf2),
      new ForeignKey(tabisoncrecsug,tabpartetecnicoArrayf3),
      new ForeignKey(tabaplicacion,tabpartetecnicoArrayf4)      
      };
    tabpartetecnico.setForeignKeys(tabpartetecnicoArrayfk);
    FieldDef tablinkArrayf1[] = { tablink.lkdesc };
    FieldDef tablinkArrayf2[] = { tablink.lkcliente };
    ForeignKey tablinkArrayfk[] = { 
      new ForeignKey(tabtexto,tablinkArrayf1),
      new ForeignKey(tabdatgen,tablinkArrayf2)      
      };
    tablink.setForeignKeys(tablinkArrayfk);
    FieldDef tabgifArrayf1[] = { tabgif.gidesc };
    FieldDef tabgifArrayf2[] = { tabgif.gicliente };
    ForeignKey tabgifArrayfk[] = { 
      new ForeignKey(tabtexto,tabgifArrayf1),
      new ForeignKey(tabdatgen,tabgifArrayf2)      
      };
    tabgif.setForeignKeys(tabgifArrayfk);
    FieldDef tabdescargaArrayf1[] = { tabdescarga.dsclientedp };
    FieldDef tabdescargaArrayf2[] = { tabdescarga.dsaplicacion };
    ForeignKey tabdescargaArrayfk[] = { 
      new ForeignKey(tabclientedp,tabdescargaArrayf1),
      new ForeignKey(tabaplicacion,tabdescargaArrayf2)      
      };
    tabdescarga.setForeignKeys(tabdescargaArrayfk);
    FieldDef tabtransaccionArrayf1[] = { tabtransaccion.tscliente };
    ForeignKey tabtransaccionArrayfk[] = { 
      new ForeignKey(tabdatgen,tabtransaccionArrayf1)      
      };
    tabtransaccion.setForeignKeys(tabtransaccionArrayfk);
    FieldDef tabtransacciondetArrayf1[] = { tabtransacciondet.tdtransaccion };
    FieldDef tabtransacciondetArrayf2[] = { tabtransacciondet.tdcontratado };
    ForeignKey tabtransacciondetArrayfk[] = { 
      new ForeignKey(tabtransaccion,tabtransacciondetArrayf1),
      new ForeignKey(tabcontratado,tabtransacciondetArrayf2)      
      };
    tabtransacciondet.setForeignKeys(tabtransacciondetArrayfk);
    FieldDef tabseminarioArrayf1[] = { tabseminario.seseminario };
    FieldDef tabseminarioArrayf2[] = { tabseminario.secliente };
    ForeignKey tabseminarioArrayfk[] = { 
      new ForeignKey(tabconvocatorias,tabseminarioArrayf1),
      new ForeignKey(tabdatgen,tabseminarioArrayf2)      
      };
    tabseminario.setForeignKeys(tabseminarioArrayfk);
    FieldDef tabconvocatoriasArrayf1[] = { tabconvocatorias.cnvcodicurs };
    ForeignKey tabconvocatoriasArrayfk[] = { 
      new ForeignKey(tabcurso,tabconvocatoriasArrayf1)      
      };
    tabconvocatorias.setForeignKeys(tabconvocatoriasArrayfk);
    FieldDef tabreservasArrayf1[] = { tabreservas.resconvocatoria };
    FieldDef tabreservasArrayf2[] = { tabreservas.resdominio };
    ForeignKey tabreservasArrayfk[] = { 
      new ForeignKey(tabconvocatorias,tabreservasArrayf1),
      new ForeignKey(tabdatgen,tabreservasArrayf2)      
      };
    tabreservas.setForeignKeys(tabreservasArrayfk);
    FieldDef tabcomsegArrayf1[] = { tabcomseg.comcliente };
    ForeignKey tabcomsegArrayfk[] = { 
      new ForeignKey(tabdatgen,tabcomsegArrayf1)      
      };
    tabcomseg.setForeignKeys(tabcomsegArrayfk);
    FieldDef tabcampamirArrayf1[] = { tabcampamir.camcampanya };
    FieldDef tabcampamirArrayf2[] = { tabcampamir.camcodigo };
    ForeignKey tabcampamirArrayfk[] = { 
      new ForeignKey(tabcampanya,tabcampamirArrayf1),
      new ForeignKey(tabdatgen,tabcampamirArrayf2)      
      };
    tabcampamir.setForeignKeys(tabcampamirArrayfk);
    FieldDef tabimpactosArrayf1[] = { tabimpactos.impcodigo };
    ForeignKey tabimpactosArrayfk[] = { 
      new ForeignKey(tabdatgen,tabimpactosArrayf1)      
      };
    tabimpactos.setForeignKeys(tabimpactosArrayfk);
    FieldDef tabjarsArrayf1[] = { tabjars.jarversion };
    ForeignKey tabjarsArrayfk[] = { 
      new ForeignKey(tabversion,tabjarsArrayf1)      
      };
    tabjars.setForeignKeys(tabjarsArrayfk);
    FieldDef tabpartnerArrayf1[] = { tabpartner.ptncodigo };
    ForeignKey tabpartnerArrayfk[] = { 
      new ForeignKey(tabdatgen,tabpartnerArrayf1)      
      };
    tabpartner.setForeignKeys(tabpartnerArrayfk);
    FieldDef tabclivofficeArrayf1[] = { tabclivoffice.vofcodigo };
    FieldDef tabclivofficeArrayf2[] = { tabclivoffice.vofpartner };
    ForeignKey tabclivofficeArrayfk[] = { 
      new ForeignKey(tabdatgen,tabclivofficeArrayf1),
      new ForeignKey(tabpartner,tabclivofficeArrayf2)      
      };
    tabclivoffice.setForeignKeys(tabclivofficeArrayfk);
    FieldDef tabenqareesArrayf1[] = { tabenqarees.areenquesta };
    ForeignKey tabenqareesArrayfk[] = { 
      new ForeignKey(tabenquestes,tabenqareesArrayf1)      
      };
    tabenqarees.setForeignKeys(tabenqareesArrayfk);
    FieldDef tabenquestaArrayf1[] = { tabenquesta.enqcodi };
    FieldDef tabenquestaArrayf2[] = { tabenquesta.enqcodi,tabenquesta.enqarea };
    ForeignKey tabenquestaArrayfk[] = { 
      new ForeignKey(tabenquestes,tabenquestaArrayf1),
      new ForeignKey(tabenqarees,tabenquestaArrayf2)      
      };
    tabenquesta.setForeignKeys(tabenquestaArrayfk);
    FieldDef tabenqxclientArrayf1[] = { tabenqxclient.quaclient };
    ForeignKey tabenqxclientArrayfk[] = { 
      new ForeignKey(tabdatgen,tabenqxclientArrayf1)      
      };
    tabenqxclient.setForeignKeys(tabenqxclientArrayfk);
    FieldDef tabenqxclientdetArrayf1[] = { tabenqxclientdet.quadenquesta,tabenqxclientdet.quadpregunta };
    FieldDef tabenqxclientdetArrayf2[] = { tabenqxclientdet.quadcodi };
    ForeignKey tabenqxclientdetArrayfk[] = { 
      new ForeignKey(tabenquesta,tabenqxclientdetArrayf1),
      new ForeignKey(tabenqxclient,tabenqxclientdetArrayf2)      
      };
    tabenqxclientdet.setForeignKeys(tabenqxclientdetArrayfk);
    FieldDef tabofcomandaArrayf1[] = { tabofcomanda.ofcclient };
    FieldDef tabofcomandaArrayf2[] = { tabofcomanda.ofccampanya };
    FieldDef tabofcomandaArrayf3[] = { tabofcomanda.ofccoditrans };
    ForeignKey tabofcomandaArrayfk[] = { 
      new ForeignKey(tabdatgen,tabofcomandaArrayf1),
      new ForeignKey(tabcampanya,tabofcomandaArrayf2),
      new ForeignKey(tabtransaccion,tabofcomandaArrayf3)      
      };
    tabofcomanda.setForeignKeys(tabofcomandaArrayfk);
    FieldDef tabofertaArrayf1[] = { taboferta.ofecodi };
    ForeignKey tabofertaArrayfk[] = { 
      new ForeignKey(tabofcomanda,tabofertaArrayf1)      
      };
    taboferta.setForeignKeys(tabofertaArrayfk);
    FieldDef tabofertadetArrayf1[] = { tabofertadet.ofdtarifa };
    FieldDef tabofertadetArrayf2[] = { tabofertadet.ofdcodi,tabofertadet.ofdversio };
    ForeignKey tabofertadetArrayfk[] = { 
      new ForeignKey(tabtarifa,tabofertadetArrayf1),
      new ForeignKey(taboferta,tabofertadetArrayf2)      
      };
    tabofertadet.setForeignKeys(tabofertadetArrayfk);
    FieldDef tabofertaprojtecArrayf1[] = { tabofertaprojtec.ofpcodi,tabofertaprojtec.ofpversio,tabofertaprojtec.ofplinia };
    ForeignKey tabofertaprojtecArrayfk[] = { 
      new ForeignKey(tabofertadet,tabofertaprojtecArrayf1)      
      };
    tabofertaprojtec.setForeignKeys(tabofertaprojtecArrayfk);
    FieldDef taboftarifadepArrayf1[] = { taboftarifadep.ofttarifa };
    ForeignKey taboftarifadepArrayfk[] = { 
      new ForeignKey(tabtarifa,taboftarifadepArrayf1)      
      };
    taboftarifadep.setForeignKeys(taboftarifadepArrayfk);
    FieldDef tabfacrebudesArrayf1[] = { tabfacrebudes.facproveidor };
    ForeignKey tabfacrebudesArrayfk[] = { 
      new ForeignKey(tabdatgen,tabfacrebudesArrayf1)      
      };
    tabfacrebudes.setForeignKeys(tabfacrebudesArrayfk);
    FieldDef tabproveedorArrayf1[] = { tabproveedor.procodigo };
    ForeignKey tabproveedorArrayfk[] = { 
      new ForeignKey(tabdatgen,tabproveedorArrayf1)      
      };
    tabproveedor.setForeignKeys(tabproveedorArrayfk);
    FieldDef tabisoaccioncorrecArrayf1[] = { tabisoaccioncorrec.acambito };
    ForeignKey tabisoaccioncorrecArrayfk[] = { 
      new ForeignKey(tabisoambits,tabisoaccioncorrecArrayf1)      
      };
    tabisoaccioncorrec.setForeignKeys(tabisoaccioncorrecArrayfk);
    FieldDef tabisoncrecsugArrayf1[] = { tabisoncrecsug.ncdominioo };
    FieldDef tabisoncrecsugArrayf2[] = { tabisoncrecsug.ncdominiod };
    FieldDef tabisoncrecsugArrayf3[] = { tabisoncrecsug.ncacciocor };
    FieldDef tabisoncrecsugArrayf4[] = { tabisoncrecsug.ncparte };
    ForeignKey tabisoncrecsugArrayfk[] = { 
      new ForeignKey(tabdatgen,tabisoncrecsugArrayf1),
      new ForeignKey(tabdatgen,tabisoncrecsugArrayf2),
      new ForeignKey(tabisoaccioncorrec,tabisoncrecsugArrayf3),
      new ForeignKey(tabpartetecnico,tabisoncrecsugArrayf4)      
      };
    tabisoncrecsug.setForeignKeys(tabisoncrecsugArrayfk);
    FieldDef tabisoprocxambitArrayf1[] = { tabisoprocxambit.paref };
    FieldDef tabisoprocxambitArrayf2[] = { tabisoprocxambit.paambit };
    ForeignKey tabisoprocxambitArrayfk[] = { 
      new ForeignKey(tabisoprocedim,tabisoprocxambitArrayf1),
      new ForeignKey(tabisoambits,tabisoprocxambitArrayf2)      
      };
    tabisoprocxambit.setForeignKeys(tabisoprocxambitArrayfk);
    FieldDef tabpromocionArrayf1[] = { tabpromocion.prmpartner };
    FieldDef tabpromocionArrayf2[] = { tabpromocion.prmservicio };
    ForeignKey tabpromocionArrayfk[] = { 
      new ForeignKey(tabpartner,tabpromocionArrayf1),
      new ForeignKey(tabproducto,tabpromocionArrayf2)      
      };
    tabpromocion.setForeignKeys(tabpromocionArrayfk);
    FieldDef tabmailsArrayf1[] = { tabmails.emtexto };
    FieldDef tabmailsArrayf2[] = { tabmails.emfirma };
    ForeignKey tabmailsArrayfk[] = { 
      new ForeignKey(tabtexto,tabmailsArrayf1),
      new ForeignKey(tabusuario,tabmailsArrayf2)      
      };
    tabmails.setForeignKeys(tabmailsArrayfk);
    FieldDef tabvologpagousoArrayf1[] = { tabvologpagouso.vlproducto };
    ForeignKey tabvologpagousoArrayfk[] = { 
      new ForeignKey(tabproducto,tabvologpagousoArrayf1)      
      };
    tabvologpagouso.setForeignKeys(tabvologpagousoArrayfk);
    FieldDef tabeportemdocsArrayf1[] = { tabeportemdocs.epdp };
    FieldDef tabeportemdocsArrayf2[] = { tabeportemdocs.epproducto };
    ForeignKey tabeportemdocsArrayfk[] = { 
      new ForeignKey(tabdp,tabeportemdocsArrayf1),
      new ForeignKey(tabproducto,tabeportemdocsArrayf2)      
      };
    tabeportemdocs.setForeignKeys(tabeportemdocsArrayfk);
    FieldDef tabclimatArrayf1[] = { tabclimat.matcliente };
    FieldDef tabclimatArrayf2[] = { tabclimat.mataplic };
    ForeignKey tabclimatArrayfk[] = { 
      new ForeignKey(tabdatgen,tabclimatArrayf1),
      new ForeignKey(tabaplicacion,tabclimatArrayf2)      
      };
    tabclimat.setForeignKeys(tabclimatArrayfk);
    FieldDef tabvisitasArrayf1[] = { tabvisitas.viscliente };
    ForeignKey tabvisitasArrayfk[] = { 
      new ForeignKey(tabdatgen,tabvisitasArrayf1)      
      };
    tabvisitas.setForeignKeys(tabvisitasArrayfk);
    FieldDef tabcursosArrayf1[] = { tabcursos.curclient };
    ForeignKey tabcursosArrayfk[] = { 
      new ForeignKey(tabdatgen,tabcursosArrayf1)      
      };
    tabcursos.setForeignKeys(tabcursosArrayfk);
    }
  }
  
