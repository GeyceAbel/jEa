// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20020321
// Hora:             10:20:55
// Driver BD:        ODBC
// Base de Datos:    bdadmonprog
// 
// Aplicación: admon - ADMON
// Versión:    1.3.1
// 
package mae.admon.db;
// 
import geyce.maefc.*;
import mae.admon.general.*;
import mae.general.*;
// 
public class CatBdadmon extends Catalog
  {
  // Tablas
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
  public TabGrupos tabgrupos;
  public TabAgrup tabagrup;
  public TabRbdses tabrbdses;
  public TabRbdcam tabrbdcam;
  public TabRbdctrap tabrbdctrap;
  public TabRbdctrse tabrbdctrse;
  public TabRbdfirma tabrbdfirma;
  public TabRbdstate tabrbdstate;
  public TabRbdcoms tabrbdcoms;
  public TabRbdctrta tabrbdctrta;
  public TabRbdlog tabrbdlog;
  public TabGycauto tabgycauto;
  public TabRbdcrc tabrbdcrc;
  public TabRbdresin tabrbdresin;
  public TabUsuario tabusuario;
  public TabUsgrupo tabusgrupo;
  public TabUsagrup tabusagrup;
  public TabUsrecursos tabusrecursos;
  public TabUspermge tabuspermge;
  public TabUspermlo tabuspermlo;
  public class TabInerrcod extends TableDef
    {
    // Campos
    public FieldDef ercodigo;
    public FieldDef erambito;
    public FieldDef ermodulo;
    public FieldDef erprog;
    public FieldDef errefer;
    public FieldDef ernumer;
    public FieldDef erdescri;
    public FieldDef ersoluci;
    public FieldDef erexec;
    public FieldDef ercritic;
    public FieldDef erincide;
    public FieldDef eropcion;
    public TabInerrcod(String name)
      {
      super(name);
      ercodigo = new FieldDef("ercodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      erambito = new FieldDef("erambito",FieldDef.CHAR,10,FieldDef.NOTNULL);
      ermodulo = new FieldDef("ermodulo",FieldDef.CHAR,10,FieldDef.NOTNULL);
      erprog = new FieldDef("erprog",FieldDef.CHAR,80);
      errefer = new FieldDef("errefer",FieldDef.CHAR,10,FieldDef.NOTNULL);
      ernumer = new FieldDef("ernumer",FieldDef.CHAR,10);
      erdescri = new FieldDef("erdescri",FieldDef.CHAR,1024);
      ersoluci = new FieldDef("ersoluci",FieldDef.CHAR,1024);
      erexec = new FieldDef("erexec",FieldDef.CHAR,80);
      ercritic = new FieldDef("ercritic",FieldDef.CHAR,1,FieldDef.NOTNULL);
      erincide = new FieldDef("erincide",FieldDef.CHAR,1,FieldDef.NOTNULL);
      eropcion = new FieldDef("eropcion",FieldDef.INTEGER,0);
      FieldDef array[] = {
        ercodigo,
        erambito,
        ermodulo,
        erprog,
        errefer,
        ernumer,
        erdescri,
        ersoluci,
        erexec,
        ercritic,
        erincide,
        eropcion        
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
    public TabSede(String name)
      {
      super(name);
      cocodcon = new FieldDef("cocodcon",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      codescon = new FieldDef("codescon",FieldDef.CHAR,15);
      cocodpai = new FieldDef("cocodpai",FieldDef.INTEGER,0);
      codomini = new FieldDef("codomini",FieldDef.CHAR,25);
      codip = new FieldDef("codip",FieldDef.CHAR,15);
      FieldDef array[] = {
        cocodcon,
        codescon,
        cocodpai,
        codomini,
        codip        
        };
      setColumns(array);
      FieldDef arrayf[] = {cocodcon };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabGrupos extends TableDef
    {
    // Campos
    public FieldDef grupo;
    public FieldDef descripcion;
    public TabGrupos(String name)
      {
      super(name);
      grupo = new FieldDef("grupo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      descripcion = new FieldDef("descripcion",FieldDef.CHAR,15);
      FieldDef array[] = {
        grupo,
        descripcion        
        };
      setColumns(array);
      FieldDef arrayf[] = {grupo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabAgrup extends TableDef
    {
    // Campos
    public FieldDef grupo;
    public FieldDef sede;
    public TabAgrup(String name)
      {
      super(name);
      grupo = new FieldDef("grupo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      sede = new FieldDef("sede",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        grupo,
        sede        
        };
      setColumns(array);
      FieldDef arrayf[] = {grupo,sede };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabRbdses extends TableDef
    {
    // Campos
    public FieldDef sedepropia;
    public FieldDef fase;
    public FieldDef fechases;
    public FieldDef nsesion;
    public FieldDef hora;
    public FieldDef usuario;
    public TabRbdses(String name)
      {
      super(name);
      sedepropia = new FieldDef("sedepropia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fase = new FieldDef("fase",FieldDef.CHAR,1,FieldDef.NOTNULL);
      fechases = new FieldDef("fechases",FieldDef.DATE,FieldDef.NOTNULL);
      nsesion = new FieldDef("nsesion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      hora = new FieldDef("hora",FieldDef.CHAR,8);
      usuario = new FieldDef("usuario",FieldDef.CHAR,25);
      FieldDef array[] = {
        sedepropia,
        fase,
        fechases,
        nsesion,
        hora,
        usuario        
        };
      setColumns(array);
      FieldDef arrayf[] = {sedepropia,fase,fechases,nsesion };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabRbdcam extends TableDef
    {
    // Campos
    public FieldDef ident;
    public FieldDef sedeorigen;
    public FieldDef instante;
    public FieldDef userorigen;
    public FieldDef aplicacion;
    public FieldDef tabla;
    public FieldDef propietario;
    public FieldDef accion;
    public FieldDef clave;
    public FieldDef sentencia;
    public FieldDef fechases;
    public FieldDef nsesion;
    public FieldDef fechacarga;
    public FieldDef fechaexe;
    public FieldDef resultadoexe;
    public FieldDef datoselect;
    public TabRbdcam(String name)
      {
      super(name);
      ident = new FieldDef("ident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sedeorigen = new FieldDef("sedeorigen",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      instante = new FieldDef("instante",FieldDef.DATE);
      userorigen = new FieldDef("userorigen",FieldDef.CHAR,25);
      aplicacion = new FieldDef("aplicacion",FieldDef.CHAR,15);
      tabla = new FieldDef("tabla",FieldDef.CHAR,15);
      propietario = new FieldDef("propietario",FieldDef.INTEGER,0);
      accion = new FieldDef("accion",FieldDef.CHAR,2);
      clave = new FieldDef("clave",FieldDef.CHAR,512);
      sentencia = new FieldDef("sentencia",FieldDef.LONGVARCHAR);
      fechases = new FieldDef("fechases",FieldDef.DATE);
      nsesion = new FieldDef("nsesion",FieldDef.INTEGER,0);
      fechacarga = new FieldDef("fechacarga",FieldDef.DATE);
      fechaexe = new FieldDef("fechaexe",FieldDef.DATE);
      resultadoexe = new FieldDef("resultadoexe",FieldDef.INTEGER,0);
      datoselect = new FieldDef("datoselect",FieldDef.LONGVARCHAR);
      FieldDef array[] = {
        ident,
        sedeorigen,
        instante,
        userorigen,
        aplicacion,
        tabla,
        propietario,
        accion,
        clave,
        sentencia,
        fechases,
        nsesion,
        fechacarga,
        fechaexe,
        resultadoexe,
        datoselect        
        };
      setColumns(array);
      FieldDef arrayf[] = {ident,sedeorigen };
      setPrimaryKeys(arrayf);
      ident.setAutoIncrementable(true);
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
    
  public class TabRbdctrse extends TableDef
    {
    // Campos
    public FieldDef sedelocal;
    public FieldDef aplicacion;
    public FieldDef tabla;
    public FieldDef sederemota;
    public FieldDef descarga;
    public FieldDef carga;
    public TabRbdctrse(String name)
      {
      super(name);
      sedelocal = new FieldDef("sedelocal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aplicacion = new FieldDef("aplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tabla = new FieldDef("tabla",FieldDef.CHAR,15,FieldDef.NOTNULL);
      sederemota = new FieldDef("sederemota",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      descarga = new FieldDef("descarga",FieldDef.CHAR,1);
      carga = new FieldDef("carga",FieldDef.CHAR,1);
      FieldDef array[] = {
        sedelocal,
        aplicacion,
        tabla,
        sederemota,
        descarga,
        carga        
        };
      setColumns(array);
      FieldDef arrayf[] = {sedelocal,aplicacion,tabla,sederemota };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabRbdfirma extends TableDef
    {
    // Campos
    public FieldDef sedelocal;
    public FieldDef aplicacion;
    public FieldDef tabla;
    public FieldDef sede;
    public FieldDef fechases;
    public FieldDef nsesion;
    public FieldDef firmaobj;
    public FieldDef firma;
    public TabRbdfirma(String name)
      {
      super(name);
      sedelocal = new FieldDef("sedelocal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aplicacion = new FieldDef("aplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tabla = new FieldDef("tabla",FieldDef.CHAR,15,FieldDef.NOTNULL);
      sede = new FieldDef("sede",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fechases = new FieldDef("fechases",FieldDef.DATE,FieldDef.NOTNULL);
      nsesion = new FieldDef("nsesion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      firmaobj = new FieldDef("firmaobj",FieldDef.FLOAT,6,0);
      firma = new FieldDef("firma",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        sedelocal,
        aplicacion,
        tabla,
        sede,
        fechases,
        nsesion,
        firmaobj,
        firma        
        };
      setColumns(array);
      FieldDef arrayind1[] = { sedelocal,tabla,sede,fechases,nsesion };
      Index arrayi[] = { 
        new Index("indice",arrayind1)        
        };
      setIndexes(arrayi);
      FieldDef arrayf[] = {sedelocal,aplicacion,tabla,sede,fechases,nsesion };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabRbdstate extends TableDef
    {
    // Campos
    public FieldDef fechases;
    public FieldDef nsesion;
    public FieldDef aplicacion;
    public FieldDef sedeorig;
    public FieldDef sededest;
    public FieldDef fase;
    public FieldDef fechares;
    public FieldDef resultado;
    public TabRbdstate(String name)
      {
      super(name);
      fechases = new FieldDef("fechases",FieldDef.DATE,FieldDef.NOTNULL);
      nsesion = new FieldDef("nsesion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aplicacion = new FieldDef("aplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      sedeorig = new FieldDef("sedeorig",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sededest = new FieldDef("sededest",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fase = new FieldDef("fase",FieldDef.CHAR,1);
      fechares = new FieldDef("fechares",FieldDef.DATE);
      resultado = new FieldDef("resultado",FieldDef.INTEGER,0);
      FieldDef array[] = {
        fechases,
        nsesion,
        aplicacion,
        sedeorig,
        sededest,
        fase,
        fechares,
        resultado        
        };
      setColumns(array);
      FieldDef arrayf[] = {fechases,nsesion,aplicacion,sedeorig,sededest };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabRbdcoms extends TableDef
    {
    // Campos
    public FieldDef sede;
    public FieldDef fechases;
    public FieldDef nsesion;
    public FieldDef contador;
    public FieldDef comsx;
    public TabRbdcoms(String name)
      {
      super(name);
      sede = new FieldDef("sede",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fechases = new FieldDef("fechases",FieldDef.DATE,FieldDef.NOTNULL);
      nsesion = new FieldDef("nsesion",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      contador = new FieldDef("contador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      comsx = new FieldDef("comsx",FieldDef.CHAR,512);
      FieldDef array[] = {
        sede,
        fechases,
        nsesion,
        contador,
        comsx        
        };
      setColumns(array);
      FieldDef arrayf[] = {sede,fechases,nsesion,contador };
      setPrimaryKeys(arrayf);
      contador.setAutoIncrementable(true);
      }
    }
    
  public class TabRbdctrta extends TableDef
    {
    // Campos
    public FieldDef sedelocal;
    public FieldDef aplicacion;
    public FieldDef tabla;
    public FieldDef tipo;
    public FieldDef propiet;
    public FieldDef cpropiet;
    public FieldDef destino;
    public FieldDef descarga;
    public FieldDef carga;
    public FieldDef descripcion;
    public FieldDef cambios;
    public TabRbdctrta(String name)
      {
      super(name);
      sedelocal = new FieldDef("sedelocal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aplicacion = new FieldDef("aplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tabla = new FieldDef("tabla",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tipo = new FieldDef("tipo",FieldDef.CHAR,2);
      propiet = new FieldDef("propiet",FieldDef.INTEGER,0);
      cpropiet = new FieldDef("cpropiet",FieldDef.CHAR,15);
      destino = new FieldDef("destino",FieldDef.INTEGER,0);
      descarga = new FieldDef("descarga",FieldDef.CHAR,1);
      carga = new FieldDef("carga",FieldDef.CHAR,1);
      descripcion = new FieldDef("descripcion",FieldDef.CHAR,45);
      cambios = new FieldDef("cambios",FieldDef.INTEGER,0);
      FieldDef array[] = {
        sedelocal,
        aplicacion,
        tabla,
        tipo,
        propiet,
        cpropiet,
        destino,
        descarga,
        carga,
        descripcion,
        cambios        
        };
      setColumns(array);
      FieldDef arrayf[] = {sedelocal,aplicacion,tabla };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabRbdlog extends TableDef
    {
    // Campos
    public FieldDef ident;
    public FieldDef sede;
    public FieldDef instante;
    public FieldDef fechases;
    public FieldDef nsesion;
    public FieldDef aplicacion;
    public FieldDef fase;
    public FieldDef resultado;
    public FieldDef detalle;
    public TabRbdlog(String name)
      {
      super(name);
      ident = new FieldDef("ident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      sede = new FieldDef("sede",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      instante = new FieldDef("instante",FieldDef.DATE);
      fechases = new FieldDef("fechases",FieldDef.DATE);
      nsesion = new FieldDef("nsesion",FieldDef.INTEGER,0);
      aplicacion = new FieldDef("aplicacion",FieldDef.CHAR,15);
      fase = new FieldDef("fase",FieldDef.CHAR,1);
      resultado = new FieldDef("resultado",FieldDef.INTEGER,0);
      detalle = new FieldDef("detalle",FieldDef.CHAR,512);
      FieldDef array[] = {
        ident,
        sede,
        instante,
        fechases,
        nsesion,
        aplicacion,
        fase,
        resultado,
        detalle        
        };
      setColumns(array);
      FieldDef arrayf[] = {ident,sede };
      setPrimaryKeys(arrayf);
      ident.setAutoIncrementable(true);
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
    
  public class TabRbdcrc extends TableDef
    {
    // Campos
    public FieldDef sedelocal;
    public FieldDef aplicacion;
    public FieldDef tabla;
    public FieldDef propietario;
    public FieldDef crc;
    public TabRbdcrc(String name)
      {
      super(name);
      sedelocal = new FieldDef("sedelocal",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      aplicacion = new FieldDef("aplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      tabla = new FieldDef("tabla",FieldDef.CHAR,15,FieldDef.NOTNULL);
      propietario = new FieldDef("propietario",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      crc = new FieldDef("crc",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        sedelocal,
        aplicacion,
        tabla,
        propietario,
        crc        
        };
      setColumns(array);
      FieldDef arrayf[] = {sedelocal,aplicacion,tabla,propietario };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabRbdresin extends TableDef
    {
    // Campos
    public FieldDef aplicacion;
    public FieldDef sede;
    public FieldDef fechases;
    public FieldDef nsesion;
    public TabRbdresin(String name)
      {
      super(name);
      aplicacion = new FieldDef("aplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      sede = new FieldDef("sede",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      fechases = new FieldDef("fechases",FieldDef.DATE);
      nsesion = new FieldDef("nsesion",FieldDef.INTEGER,0);
      FieldDef array[] = {
        aplicacion,
        sede,
        fechases,
        nsesion        
        };
      setColumns(array);
      FieldDef arrayf[] = {aplicacion,sede };
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
    
  public CatBdadmon()
    {
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
    tabgrupos = new TabGrupos("grupos");
    tabagrup = new TabAgrup("agrup");
    tabrbdses = new TabRbdses("rbdses");
    tabrbdcam = new TabRbdcam("rbdcam");
    tabrbdctrap = new TabRbdctrap("rbdctrap");
    tabrbdctrse = new TabRbdctrse("rbdctrse");
    tabrbdfirma = new TabRbdfirma("rbdfirma");
    tabrbdstate = new TabRbdstate("rbdstate");
    tabrbdcoms = new TabRbdcoms("rbdcoms");
    tabrbdctrta = new TabRbdctrta("rbdctrta");
    tabrbdlog = new TabRbdlog("rbdlog");
    tabgycauto = new TabGycauto("gycauto");
    tabrbdcrc = new TabRbdcrc("rbdcrc");
    tabrbdresin = new TabRbdresin("rbdresin");
    tabusuario = new TabUsuario("usuario");
    tabusgrupo = new TabUsgrupo("usgrupo");
    tabusagrup = new TabUsagrup("usagrup");
    tabusrecursos = new TabUsrecursos("usrecursos");
    tabuspermge = new TabUspermge("uspermge");
    tabuspermlo = new TabUspermlo("uspermlo");
    TableDef array[] = {
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
      tabgrupos,
      tabagrup,
      tabrbdses,
      tabrbdcam,
      tabrbdctrap,
      tabrbdctrse,
      tabrbdfirma,
      tabrbdstate,
      tabrbdcoms,
      tabrbdctrta,
      tabrbdlog,
      tabgycauto,
      tabrbdcrc,
      tabrbdresin,
      tabusuario,
      tabusgrupo,
      tabusagrup,
      tabusrecursos,
      tabuspermge,
      tabuspermlo      
      };
    setTables(array);
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
    FieldDef tabagrupArrayf1[] = { tabagrup.sede };
    ForeignKey tabagrupArrayfk[] = { 
      new ForeignKey(tabsede,tabagrupArrayf1)      
      };
    tabagrup.setForeignKeys(tabagrupArrayfk);
    FieldDef tabrbdctrapArrayf1[] = { tabrbdctrap.sederemota };
    ForeignKey tabrbdctrapArrayfk[] = { 
      new ForeignKey(tabsede,tabrbdctrapArrayf1)      
      };
    tabrbdctrap.setForeignKeys(tabrbdctrapArrayfk);
    FieldDef tabrbdctrseArrayf1[] = { tabrbdctrse.sederemota };
    ForeignKey tabrbdctrseArrayfk[] = { 
      new ForeignKey(tabsede,tabrbdctrseArrayf1)      
      };
    tabrbdctrse.setForeignKeys(tabrbdctrseArrayfk);
    FieldDef tabrbdfirmaArrayf1[] = { tabrbdfirma.sedelocal };
    ForeignKey tabrbdfirmaArrayfk[] = { 
      new ForeignKey(tabsede,tabrbdfirmaArrayf1)      
      };
    tabrbdfirma.setForeignKeys(tabrbdfirmaArrayfk);
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
    }
  }
  
