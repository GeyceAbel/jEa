// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Fri Sep 13 10:03:20 CEST 2019
// 
// Aplicación: easp
// 
package mae.easp.db;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.general.*;
// 
public class CatModelos2 extends Catalog
    {
    // tablas
    public TabMod184d tabmod184d;
    public TabMod184e tabmod184e;
    public TabMod184n tabmod184n;
    public TabMod184s tabmod184s;
    public TabMod140 tabmod140;
    public TabMod600c tabmod600c;
    public TabMod600d tabmod600d;
    public TabMod0361 tabmod0361;
    public TabMod0362 tabmod0362;
    public TabMod0363 tabmod0363;
    public TabMod0364 tabmod0364;
    public TabMod0365 tabmod0365;
    public TabMod0366 tabmod0366;
    public TabMod0367 tabmod0367;
    public TabMod0368 tabmod0368;
    public TabMod0369 tabmod0369;
    public TabMod03610 tabmod03610;
    public TabMod03611 tabmod03611;
    public TabMod576 tabmod576;
    public TabMod130des tabmod130des;
    public TabMod036p1 tabmod036p1;
    public TabMod036p2b tabmod036p2b;
    public TabMod036p2c tabmod036p2c;
    public TabMod036p3 tabmod036p3;
    public TabMod036p3n tabmod036p3n;
    public TabMod036p4 tabmod036p4;
    public TabMod036p4n tabmod036p4n;
    public TabMod036p6 tabmod036p6;
    public TabMod036p7 tabmod036p7;
    public TabMod036p8 tabmod036p8;
    public TabMod036p8n tabmod036p8n;
    public TabMod340c tabmod340c;
    public TabMod340e tabmod340e;
    public TabMod340r tabmod340r;
    public TabMod340b tabmod340b;
    public TabMod340i tabmod340i;
    public TabMod310des tabmod310des;
    public TabMod110g tabmod110g;
    public TabMod308 tabmod308;
    public TabMod309 tabmod309;
    public TabMod210 tabmod210;
    public TabMod210cp tabmod210cp;
    public TabMod720c tabmod720c;
    public TabMod720d tabmod720d;
    public TabMod036p2 tabmod036p2;
    public TabMod036p5 tabmod036p5;
    public TabModcensanc tabmodcensanc;
    public TabModcensand tabmodcensand;
    public TabMod353c tabmod353c;
    public TabMod353d tabmod353d;
    public TabMod282 tabmod282;
    public TabMod232c tabmod232c;
    public TabMod232v tabmod232v;
    public TabMod232p tabmod232p;
    public TabMod182c tabmod182c;
    public TabMod182d tabmod182d;
    public TabMod036p9n tabmod036p9n;
    public TabMod036p7b tabmod036p7b;
    public class TabMod184d extends TableDef
        {
        // campos
        public FieldDef m184ddominio;
        public FieldDef m184dnif;
        public FieldDef m184dejercicio;
        public FieldDef m184dperiodo;
        public FieldDef m184ddeleg;
        public FieldDef m184dadmon;
        public FieldDef m184dcodadmon;
        public FieldDef m184dtelefono;
        public FieldDef m184dapellidos;
        public FieldDef m184dsigla;
        public FieldDef m184dcalle;
        public FieldDef m184dnumero;
        public FieldDef m184dmunicipio;
        public FieldDef m184dprovincia;
        public FieldDef m184dcpostal;
        public FieldDef m184dfecha;
        public FieldDef m184ddecla;
        public FieldDef m184dfirma;
        public FieldDef m184dcargofirm;
        public FieldDef m184ddeccomp;
        public FieldDef m184ddecsust;
        public FieldDef m184dnrojusant;
        public FieldDef m184dnumtotreg;
        public FieldDef m184desptipoent;
        public FieldDef m184despactprin;
        public FieldDef m184dexttipoent;
        public FieldDef m184dextobjeto;
        public FieldDef m184dextclvpais;
        public FieldDef m184dextporrent;
        public FieldDef m184dtribregiis;
        public FieldDef m184dimpocifra;
        public FieldDef m184dnifrepre;
        public FieldDef m184dnomprepre;
        public FieldDef m184dsiglarepre;
        public FieldDef m184dcallerepre;
        public FieldDef m184dnumrepre;
        public FieldDef m184dmunirepre;
        public FieldDef m184dprovrepre;
        public FieldDef m184dcpostrepre;
        public FieldDef m184dpercont;
        public FieldDef m184dtelcont;
        public FieldDef m184dobserva;
        public FieldDef m184dletetiq;
        public FieldDef m184descalera;
        public FieldDef m184dpiso;
        public FieldDef m184dpuerta;
        public FieldDef m184dtotardto;
        public FieldDef m184dtotareduc;
        public FieldDef m184dtotbrdto;
        public FieldDef m184dtotcrdto;
        public FieldDef m184dtotcreduc;
        public FieldDef m184dtotdrdto;
        public FieldDef m184dtotdreduc;
        public FieldDef m184dtoterenta;
        public FieldDef m184dtotfganan;
        public FieldDef m184dtotfperdi;
        public FieldDef m184dtotgganan;
        public FieldDef m184dtotgperdi;
        public FieldDef m184dtothrenta;
        public FieldDef m184dtotibdedu;
        public FieldDef m184dtotibded1;
        public FieldDef m184dtotibded2;
        public FieldDef m184dtotibded3;
        public FieldDef m184dtotibded4;
        public FieldDef m184dtotibded5;
        public FieldDef m184dtotibded6;
        public FieldDef m184dtotjbdedu;
        public FieldDef m184dtotjbded1;
        public FieldDef m184dtotjbded2;
        public FieldDef m184dtotjbded3;
        public FieldDef m184dtotjbded4;
        public FieldDef m184dtotjbded5;
        public FieldDef m184dtotjbded6;
        public FieldDef m184dtotkreten;
        public FieldDef m184dtotlexren;
        public FieldDef m184dissnoresid;
        public FieldDef m184dtotmganan;
        public FieldDef m184dtotmperdi;
        public TabMod184d(String name)
            {
            super(name);
            m184ddominio = new FieldDef("m184ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m184dnif = new FieldDef("m184dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m184dejercicio = new FieldDef("m184dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m184dperiodo = new FieldDef("m184dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m184ddeleg = new FieldDef("m184ddeleg",FieldDef.CHAR,30);
            m184dadmon = new FieldDef("m184dadmon",FieldDef.CHAR,30);
            m184dcodadmon = new FieldDef("m184dcodadmon",FieldDef.INTEGER,0);
            m184dtelefono = new FieldDef("m184dtelefono",FieldDef.CHAR,9);
            m184dapellidos = new FieldDef("m184dapellidos",FieldDef.CHAR,40);
            m184dsigla = new FieldDef("m184dsigla",FieldDef.CHAR,2);
            m184dcalle = new FieldDef("m184dcalle",FieldDef.CHAR,40);
            m184dnumero = new FieldDef("m184dnumero",FieldDef.CHAR,5);
            m184dmunicipio = new FieldDef("m184dmunicipio",FieldDef.CHAR,40);
            m184dprovincia = new FieldDef("m184dprovincia",FieldDef.INTEGER,0);
            m184dcpostal = new FieldDef("m184dcpostal",FieldDef.CHAR,5);
            m184dfecha = new FieldDef("m184dfecha",FieldDef.DATE);
            m184ddecla = new FieldDef("m184ddecla",FieldDef.CHAR,1);
            m184dfirma = new FieldDef("m184dfirma",FieldDef.CHAR,30);
            m184dcargofirm = new FieldDef("m184dcargofirm",FieldDef.CHAR,25);
            m184ddeccomp = new FieldDef("m184ddeccomp",FieldDef.CHAR,1);
            m184ddecsust = new FieldDef("m184ddecsust",FieldDef.CHAR,1);
            m184dnrojusant = new FieldDef("m184dnrojusant",FieldDef.CHAR,16);
            m184dnumtotreg = new FieldDef("m184dnumtotreg",FieldDef.INTEGER,0);
            m184desptipoent = new FieldDef("m184desptipoent",FieldDef.CHAR,1);
            m184despactprin = new FieldDef("m184despactprin",FieldDef.CHAR,1);
            m184dexttipoent = new FieldDef("m184dexttipoent",FieldDef.CHAR,1);
            m184dextobjeto = new FieldDef("m184dextobjeto",FieldDef.CHAR,1);
            m184dextclvpais = new FieldDef("m184dextclvpais",FieldDef.CHAR,2);
            m184dextporrent = new FieldDef("m184dextporrent",FieldDef.FLOAT,6,0);
            m184dtribregiis = new FieldDef("m184dtribregiis",FieldDef.CHAR,1);
            m184dimpocifra = new FieldDef("m184dimpocifra",FieldDef.FLOAT,6,0);
            m184dnifrepre = new FieldDef("m184dnifrepre",FieldDef.CHAR,15);
            m184dnomprepre = new FieldDef("m184dnomprepre",FieldDef.CHAR,40);
            m184dsiglarepre = new FieldDef("m184dsiglarepre",FieldDef.CHAR,2);
            m184dcallerepre = new FieldDef("m184dcallerepre",FieldDef.CHAR,40);
            m184dnumrepre = new FieldDef("m184dnumrepre",FieldDef.CHAR,5);
            m184dmunirepre = new FieldDef("m184dmunirepre",FieldDef.CHAR,40);
            m184dprovrepre = new FieldDef("m184dprovrepre",FieldDef.INTEGER,0);
            m184dcpostrepre = new FieldDef("m184dcpostrepre",FieldDef.CHAR,5);
            m184dpercont = new FieldDef("m184dpercont",FieldDef.CHAR,100);
            m184dtelcont = new FieldDef("m184dtelcont",FieldDef.CHAR,9);
            m184dobserva = new FieldDef("m184dobserva",FieldDef.CHAR,350);
            m184dletetiq = new FieldDef("m184dletetiq",FieldDef.CHAR,4);
            m184descalera = new FieldDef("m184descalera",FieldDef.CHAR,2);
            m184dpiso = new FieldDef("m184dpiso",FieldDef.CHAR,2);
            m184dpuerta = new FieldDef("m184dpuerta",FieldDef.CHAR,2);
            m184dtotardto = new FieldDef("m184dtotardto",FieldDef.FLOAT,6,0);
            m184dtotareduc = new FieldDef("m184dtotareduc",FieldDef.FLOAT,6,0);
            m184dtotbrdto = new FieldDef("m184dtotbrdto",FieldDef.FLOAT,6,0);
            m184dtotcrdto = new FieldDef("m184dtotcrdto",FieldDef.FLOAT,6,0);
            m184dtotcreduc = new FieldDef("m184dtotcreduc",FieldDef.FLOAT,6,0);
            m184dtotdrdto = new FieldDef("m184dtotdrdto",FieldDef.FLOAT,6,0);
            m184dtotdreduc = new FieldDef("m184dtotdreduc",FieldDef.FLOAT,6,0);
            m184dtoterenta = new FieldDef("m184dtoterenta",FieldDef.FLOAT,6,0);
            m184dtotfganan = new FieldDef("m184dtotfganan",FieldDef.FLOAT,6,0);
            m184dtotfperdi = new FieldDef("m184dtotfperdi",FieldDef.FLOAT,6,0);
            m184dtotgganan = new FieldDef("m184dtotgganan",FieldDef.FLOAT,6,0);
            m184dtotgperdi = new FieldDef("m184dtotgperdi",FieldDef.FLOAT,6,0);
            m184dtothrenta = new FieldDef("m184dtothrenta",FieldDef.FLOAT,6,0);
            m184dtotibdedu = new FieldDef("m184dtotibdedu",FieldDef.FLOAT,6,0);
            m184dtotibded1 = new FieldDef("m184dtotibded1",FieldDef.FLOAT,6,0);
            m184dtotibded2 = new FieldDef("m184dtotibded2",FieldDef.FLOAT,6,0);
            m184dtotibded3 = new FieldDef("m184dtotibded3",FieldDef.FLOAT,6,0);
            m184dtotibded4 = new FieldDef("m184dtotibded4",FieldDef.FLOAT,6,0);
            m184dtotibded5 = new FieldDef("m184dtotibded5",FieldDef.FLOAT,6,0);
            m184dtotibded6 = new FieldDef("m184dtotibded6",FieldDef.FLOAT,6,0);
            m184dtotjbdedu = new FieldDef("m184dtotjbdedu",FieldDef.FLOAT,6,0);
            m184dtotjbded1 = new FieldDef("m184dtotjbded1",FieldDef.FLOAT,6,0);
            m184dtotjbded2 = new FieldDef("m184dtotjbded2",FieldDef.FLOAT,6,0);
            m184dtotjbded3 = new FieldDef("m184dtotjbded3",FieldDef.FLOAT,6,0);
            m184dtotjbded4 = new FieldDef("m184dtotjbded4",FieldDef.FLOAT,6,0);
            m184dtotjbded5 = new FieldDef("m184dtotjbded5",FieldDef.FLOAT,6,0);
            m184dtotjbded6 = new FieldDef("m184dtotjbded6",FieldDef.FLOAT,6,0);
            m184dtotkreten = new FieldDef("m184dtotkreten",FieldDef.FLOAT,6,0);
            m184dtotlexren = new FieldDef("m184dtotlexren",FieldDef.FLOAT,6,0);
            m184dissnoresid = new FieldDef("m184dissnoresid",FieldDef.CHAR,1);
            m184dtotmganan = new FieldDef("m184dtotmganan",FieldDef.FLOAT,6,0);
            m184dtotmperdi = new FieldDef("m184dtotmperdi",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m184ddominio,
                m184dnif,
                m184dejercicio,
                m184dperiodo,
                m184ddeleg,
                m184dadmon,
                m184dcodadmon,
                m184dtelefono,
                m184dapellidos,
                m184dsigla,
                m184dcalle,
                m184dnumero,
                m184dmunicipio,
                m184dprovincia,
                m184dcpostal,
                m184dfecha,
                m184ddecla,
                m184dfirma,
                m184dcargofirm,
                m184ddeccomp,
                m184ddecsust,
                m184dnrojusant,
                m184dnumtotreg,
                m184desptipoent,
                m184despactprin,
                m184dexttipoent,
                m184dextobjeto,
                m184dextclvpais,
                m184dextporrent,
                m184dtribregiis,
                m184dimpocifra,
                m184dnifrepre,
                m184dnomprepre,
                m184dsiglarepre,
                m184dcallerepre,
                m184dnumrepre,
                m184dmunirepre,
                m184dprovrepre,
                m184dcpostrepre,
                m184dpercont,
                m184dtelcont,
                m184dobserva,
                m184dletetiq,
                m184descalera,
                m184dpiso,
                m184dpuerta,
                m184dtotardto,
                m184dtotareduc,
                m184dtotbrdto,
                m184dtotcrdto,
                m184dtotcreduc,
                m184dtotdrdto,
                m184dtotdreduc,
                m184dtoterenta,
                m184dtotfganan,
                m184dtotfperdi,
                m184dtotgganan,
                m184dtotgperdi,
                m184dtothrenta,
                m184dtotibdedu,
                m184dtotibded1,
                m184dtotibded2,
                m184dtotibded3,
                m184dtotibded4,
                m184dtotibded5,
                m184dtotibded6,
                m184dtotjbdedu,
                m184dtotjbded1,
                m184dtotjbded2,
                m184dtotjbded3,
                m184dtotjbded4,
                m184dtotjbded5,
                m184dtotjbded6,
                m184dtotkreten,
                m184dtotlexren,
                m184dissnoresid,
                m184dtotmganan,
                m184dtotmperdi                
                };
            setColumns(array);
            FieldDef arrayf[] = {m184ddominio,m184dnif,m184dejercicio,m184dperiodo };
            setPrimaryKeys(arrayf);
            m184dtotfganan.setDescription("F Gananc. NO derivadas transmisiones");
            m184dtotfperdi.setDescription("F Perdida NO derivadas transmisiones");
            m184dtotgganan.setDescription("G Gananc. derivadas transmisiones >1 any");
            m184dtotgperdi.setDescription("G Perdida derivadas transmisiones >1 any");
            m184dtotmganan.setDescription("M Gananc. derivadas transmisiones <=1 any");
            m184dtotmperdi.setDescription("M Perdida derivadas transmisiones <=1 any");
            }
        }
        
    public class TabMod184e extends TableDef
        {
        // campos
        public FieldDef m184eident;
        public FieldDef m184edominio;
        public FieldDef m184enif;
        public FieldDef m184eejercicio;
        public FieldDef m184eperiodo;
        public FieldDef m184enifenti;
        public FieldDef m184erazonenti;
        public FieldDef m184eclave;
        public FieldDef m184esubclave;
        public FieldDef m184eclavepais;
        public FieldDef m184eregirdtos;
        public FieldDef m184etipoact;
        public FieldDef m184egrupepiiae;
        public FieldDef m184enifinstitu;
        public FieldDef m184enominstitu;
        public FieldDef m184efechaadqui;
        public FieldDef m184eajustaumen;
        public FieldDef m184eajustdismi;
        public FieldDef m184eingrintegr;
        public FieldDef m184egastos;
        public FieldDef m184erentaatrib;
        public FieldDef m184eporcenredu;
        public FieldDef m184erentderatr;
        public FieldDef m184egananperdi;
        public FieldDef m184ebasededuc;
        public FieldDef m184ereteingcta;
        public FieldDef m184eingrintah;
        public FieldDef m184egastosah;
        public FieldDef m184erentaatrah;
        public FieldDef m184eingrintbg;
        public FieldDef m184egastosbg;
        public FieldDef m184erentaatrbg;
        public FieldDef m184esituacion;
        public FieldDef m184erefcat;
        public FieldDef m184egastosper;
        public FieldDef m184eadqterbs;
        public FieldDef m184etributos;
        public FieldDef m184eotrosgas;
        public FieldDef m184ecobropago;
        public TabMod184e(String name)
            {
            super(name);
            m184eident = new FieldDef("m184eident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m184edominio = new FieldDef("m184edominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m184enif = new FieldDef("m184enif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m184eejercicio = new FieldDef("m184eejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m184eperiodo = new FieldDef("m184eperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m184enifenti = new FieldDef("m184enifenti",FieldDef.CHAR,15);
            m184erazonenti = new FieldDef("m184erazonenti",FieldDef.CHAR,40);
            m184eclave = new FieldDef("m184eclave",FieldDef.CHAR,1);
            m184esubclave = new FieldDef("m184esubclave",FieldDef.CHAR,2);
            m184eclavepais = new FieldDef("m184eclavepais",FieldDef.CHAR,2);
            m184eregirdtos = new FieldDef("m184eregirdtos",FieldDef.CHAR,1);
            m184etipoact = new FieldDef("m184etipoact",FieldDef.CHAR,1);
            m184egrupepiiae = new FieldDef("m184egrupepiiae",FieldDef.CHAR,4);
            m184enifinstitu = new FieldDef("m184enifinstitu",FieldDef.CHAR,15);
            m184enominstitu = new FieldDef("m184enominstitu",FieldDef.CHAR,20);
            m184efechaadqui = new FieldDef("m184efechaadqui",FieldDef.DATE);
            m184eajustaumen = new FieldDef("m184eajustaumen",FieldDef.FLOAT,6,0);
            m184eajustdismi = new FieldDef("m184eajustdismi",FieldDef.FLOAT,6,0);
            m184eingrintegr = new FieldDef("m184eingrintegr",FieldDef.FLOAT,6,0);
            m184egastos = new FieldDef("m184egastos",FieldDef.FLOAT,6,0);
            m184erentaatrib = new FieldDef("m184erentaatrib",FieldDef.FLOAT,6,0);
            m184eporcenredu = new FieldDef("m184eporcenredu",FieldDef.FLOAT,6,0);
            m184erentderatr = new FieldDef("m184erentderatr",FieldDef.FLOAT,6,0);
            m184egananperdi = new FieldDef("m184egananperdi",FieldDef.FLOAT,6,0);
            m184ebasededuc = new FieldDef("m184ebasededuc",FieldDef.FLOAT,6,0);
            m184ereteingcta = new FieldDef("m184ereteingcta",FieldDef.FLOAT,6,0);
            m184eingrintah = new FieldDef("m184eingrintah",FieldDef.FLOAT,6,0);
            m184egastosah = new FieldDef("m184egastosah",FieldDef.FLOAT,6,0);
            m184erentaatrah = new FieldDef("m184erentaatrah",FieldDef.FLOAT,6,0);
            m184eingrintbg = new FieldDef("m184eingrintbg",FieldDef.FLOAT,6,0);
            m184egastosbg = new FieldDef("m184egastosbg",FieldDef.FLOAT,6,0);
            m184erentaatrbg = new FieldDef("m184erentaatrbg",FieldDef.FLOAT,6,0);
            m184esituacion = new FieldDef("m184esituacion",FieldDef.INTEGER,0);
            m184erefcat = new FieldDef("m184erefcat",FieldDef.CHAR,20);
            m184egastosper = new FieldDef("m184egastosper",FieldDef.FLOAT,6,0);
            m184eadqterbs = new FieldDef("m184eadqterbs",FieldDef.FLOAT,6,0);
            m184etributos = new FieldDef("m184etributos",FieldDef.FLOAT,6,0);
            m184eotrosgas = new FieldDef("m184eotrosgas",FieldDef.FLOAT,6,0);
            m184ecobropago = new FieldDef("m184ecobropago",FieldDef.CHAR,1);
            FieldDef array[] = {
                m184eident,
                m184edominio,
                m184enif,
                m184eejercicio,
                m184eperiodo,
                m184enifenti,
                m184erazonenti,
                m184eclave,
                m184esubclave,
                m184eclavepais,
                m184eregirdtos,
                m184etipoact,
                m184egrupepiiae,
                m184enifinstitu,
                m184enominstitu,
                m184efechaadqui,
                m184eajustaumen,
                m184eajustdismi,
                m184eingrintegr,
                m184egastos,
                m184erentaatrib,
                m184eporcenredu,
                m184erentderatr,
                m184egananperdi,
                m184ebasededuc,
                m184ereteingcta,
                m184eingrintah,
                m184egastosah,
                m184erentaatrah,
                m184eingrintbg,
                m184egastosbg,
                m184erentaatrbg,
                m184esituacion,
                m184erefcat,
                m184egastosper,
                m184eadqterbs,
                m184etributos,
                m184eotrosgas,
                m184ecobropago                
                };
            setColumns(array);
            FieldDef arrayf[] = {m184eident };
            setPrimaryKeys(arrayf);
            m184eident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod184n extends TableDef
        {
        // campos
        public FieldDef m184nident;
        public FieldDef m184ndominio;
        public FieldDef m184nnif;
        public FieldDef m184nejercicio;
        public FieldDef m184nperiodo;
        public FieldDef m184nnifmiembr;
        public FieldDef m184nnifrepres;
        public FieldDef m184nrazon;
        public FieldDef m184ncodprov;
        public FieldDef m184nclavepais;
        public FieldDef m184ntipoparti;
        public FieldDef m184nmiembroa31;
        public FieldDef m184nnumdias;
        public FieldDef m184nporceparti;
        public FieldDef m184ndirecmiemb;
        public FieldDef m184ntributaiss;
        public FieldDef m184ncalcauto;
        public FieldDef m184nsigla;
        public FieldDef m184nnumero;
        public FieldDef m184nescalera;
        public FieldDef m184npiso;
        public FieldDef m184npuerta;
        public FieldDef m184nmunicipio;
        public FieldDef m184ncpostal;
        public FieldDef m184nliscertif;
        public FieldDef m184ndomfiscal;
        public TabMod184n(String name)
            {
            super(name);
            m184nident = new FieldDef("m184nident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m184ndominio = new FieldDef("m184ndominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m184nnif = new FieldDef("m184nnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m184nejercicio = new FieldDef("m184nejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m184nperiodo = new FieldDef("m184nperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m184nnifmiembr = new FieldDef("m184nnifmiembr",FieldDef.CHAR,15);
            m184nnifrepres = new FieldDef("m184nnifrepres",FieldDef.CHAR,15);
            m184nrazon = new FieldDef("m184nrazon",FieldDef.CHAR,40);
            m184ncodprov = new FieldDef("m184ncodprov",FieldDef.INTEGER,0);
            m184nclavepais = new FieldDef("m184nclavepais",FieldDef.CHAR,2);
            m184ntipoparti = new FieldDef("m184ntipoparti",FieldDef.CHAR,1);
            m184nmiembroa31 = new FieldDef("m184nmiembroa31",FieldDef.CHAR,1);
            m184nnumdias = new FieldDef("m184nnumdias",FieldDef.INTEGER,0);
            m184nporceparti = new FieldDef("m184nporceparti",FieldDef.FLOAT,6,0);
            m184ndirecmiemb = new FieldDef("m184ndirecmiemb",FieldDef.CHAR,40);
            m184ntributaiss = new FieldDef("m184ntributaiss",FieldDef.CHAR,1);
            m184ncalcauto = new FieldDef("m184ncalcauto",FieldDef.CHAR,1);
            m184nsigla = new FieldDef("m184nsigla",FieldDef.CHAR,2);
            m184nnumero = new FieldDef("m184nnumero",FieldDef.CHAR,5);
            m184nescalera = new FieldDef("m184nescalera",FieldDef.CHAR,5);
            m184npiso = new FieldDef("m184npiso",FieldDef.CHAR,5);
            m184npuerta = new FieldDef("m184npuerta",FieldDef.CHAR,5);
            m184nmunicipio = new FieldDef("m184nmunicipio",FieldDef.CHAR,40);
            m184ncpostal = new FieldDef("m184ncpostal",FieldDef.CHAR,5);
            m184nliscertif = new FieldDef("m184nliscertif",FieldDef.CHAR,1);
            m184ndomfiscal = new FieldDef("m184ndomfiscal",FieldDef.CHAR,40);
            FieldDef array[] = {
                m184nident,
                m184ndominio,
                m184nnif,
                m184nejercicio,
                m184nperiodo,
                m184nnifmiembr,
                m184nnifrepres,
                m184nrazon,
                m184ncodprov,
                m184nclavepais,
                m184ntipoparti,
                m184nmiembroa31,
                m184nnumdias,
                m184nporceparti,
                m184ndirecmiemb,
                m184ntributaiss,
                m184ncalcauto,
                m184nsigla,
                m184nnumero,
                m184nescalera,
                m184npiso,
                m184npuerta,
                m184nmunicipio,
                m184ncpostal,
                m184nliscertif,
                m184ndomfiscal                
                };
            setColumns(array);
            FieldDef arrayf[] = {m184nident };
            setPrimaryKeys(arrayf);
            m184nident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod184s extends TableDef
        {
        // campos
        public FieldDef m184sident;
        public FieldDef m184ssocio;
        public FieldDef m184sclave;
        public FieldDef m184ssubclave;
        public FieldDef m184simporte;
        public FieldDef m184sreduccion;
        public FieldDef m184srdtoprevio;
        public FieldDef m184sgastdifjus;
        public FieldDef m184snaturalez;
        public FieldDef m184ssituacion;
        public FieldDef m184srefcat;
        public FieldDef m184sclavedecla;
        public FieldDef m184stitularida;
        public TabMod184s(String name)
            {
            super(name);
            m184sident = new FieldDef("m184sident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m184ssocio = new FieldDef("m184ssocio",FieldDef.INTEGER,0);
            m184sclave = new FieldDef("m184sclave",FieldDef.CHAR,1);
            m184ssubclave = new FieldDef("m184ssubclave",FieldDef.CHAR,2);
            m184simporte = new FieldDef("m184simporte",FieldDef.FLOAT,6,0);
            m184sreduccion = new FieldDef("m184sreduccion",FieldDef.FLOAT,6,0);
            m184srdtoprevio = new FieldDef("m184srdtoprevio",FieldDef.FLOAT,6,0);
            m184sgastdifjus = new FieldDef("m184sgastdifjus",FieldDef.FLOAT,6,0);
            m184snaturalez = new FieldDef("m184snaturalez",FieldDef.INTEGER,0);
            m184ssituacion = new FieldDef("m184ssituacion",FieldDef.INTEGER,0);
            m184srefcat = new FieldDef("m184srefcat",FieldDef.CHAR,20);
            m184sclavedecla = new FieldDef("m184sclavedecla",FieldDef.CHAR,1);
            m184stitularida = new FieldDef("m184stitularida",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m184sident,
                m184ssocio,
                m184sclave,
                m184ssubclave,
                m184simporte,
                m184sreduccion,
                m184srdtoprevio,
                m184sgastdifjus,
                m184snaturalez,
                m184ssituacion,
                m184srefcat,
                m184sclavedecla,
                m184stitularida                
                };
            setColumns(array);
            FieldDef arrayf[] = {m184sident };
            setPrimaryKeys(arrayf);
            m184sident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod140 extends TableDef
        {
        // campos
        public FieldDef m140dominio;
        public FieldDef m140nif;
        public FieldDef m140ejercicio;
        public FieldDef m140periodo;
        public FieldDef m140nifsol;
        public FieldDef m140apell1;
        public FieldDef m140apell2;
        public FieldDef m140nombre;
        public FieldDef m140nombrecompl;
        public FieldDef m140siglas;
        public FieldDef m140calle;
        public FieldDef m140numero;
        public FieldDef m140escalera;
        public FieldDef m140piso;
        public FieldDef m140puerta;
        public FieldDef m140cpostal;
        public FieldDef m140municipio;
        public FieldDef m140codprov;
        public FieldDef m140provincia;
        public FieldDef m140telefono1;
        public FieldDef m140telefono2;
        public FieldDef m140nifbenefant;
        public FieldDef m140nifhijo1;
        public FieldDef m140apellhijo1;
        public FieldDef m140nomhijo1;
        public FieldDef m140fenachijo1;
        public FieldDef m140feadophijo1;
        public FieldDef m140nifhijo2;
        public FieldDef m140apellhijo2;
        public FieldDef m140nomhijo2;
        public FieldDef m140fenachijo2;
        public FieldDef m140feadophijo2;
        public FieldDef m140nifhijo3;
        public FieldDef m140apellhijo3;
        public FieldDef m140nomhijo3;
        public FieldDef m140fenachijo3;
        public FieldDef m140feadophijo3;
        public FieldDef m140nifhijo4;
        public FieldDef m140apellhijo4;
        public FieldDef m140nomhijo4;
        public FieldDef m140fenachijo4;
        public FieldDef m140feadophijo4;
        public FieldDef m140nifhijo5;
        public FieldDef m140apellhijo5;
        public FieldDef m140nomhijo5;
        public FieldDef m140fenachijo5;
        public FieldDef m140feadophijo5;
        public FieldDef m140nifhijo6;
        public FieldDef m140apellhijo6;
        public FieldDef m140nomhijo6;
        public FieldDef m140fenachijo6;
        public FieldDef m140feadophijo6;
        public FieldDef m140afiliass;
        public FieldDef m140reggen;
        public FieldDef m140regesp;
        public FieldDef m140regfuncio;
        public FieldDef m140codigo;
        public FieldDef m140txtregfunc;
        public FieldDef m140nummutua;
        public FieldDef m140codmutua;
        public FieldDef m140denmutua;
        public FieldDef m140soldnifmad;
        public FieldDef m140fecmuerte;
        public FieldDef m140perderecho;
        public FieldDef m140cambioreg;
        public FieldDef m140bajahijos;
        public FieldDef m140fecvariac;
        public FieldDef m140nifrepre;
        public FieldDef m140nomrepre;
        public FieldDef m140viarepre;
        public FieldDef m140nviarepre;
        public FieldDef m140munirepre;
        public FieldDef m140provrepre;
        public FieldDef m140cposrepre;
        public FieldDef m140cruzefec;
        public FieldDef m140cruzadeu;
        public FieldDef m140entingreso;
        public FieldDef m140ofiingreso;
        public FieldDef m140digiingreso;
        public FieldDef m140ctaingreso;
        public FieldDef m140modifcta;
        public FieldDef m140confirma;
        public FieldDef m140codelectr;
        public FieldDef m140hora;
        public FieldDef m140dia;
        public FieldDef m140mes;
        public FieldDef m140anyo;
        public FieldDef m140fecha;
        public FieldDef m140cheque;
        public FieldDef m140reserva1;
        public FieldDef m140reserva2;
        public FieldDef m140reserva3;
        public TabMod140(String name)
            {
            super(name);
            m140dominio = new FieldDef("m140dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m140nif = new FieldDef("m140nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m140ejercicio = new FieldDef("m140ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m140periodo = new FieldDef("m140periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m140nifsol = new FieldDef("m140nifsol",FieldDef.CHAR,15);
            m140apell1 = new FieldDef("m140apell1",FieldDef.CHAR,15);
            m140apell2 = new FieldDef("m140apell2",FieldDef.CHAR,10);
            m140nombre = new FieldDef("m140nombre",FieldDef.CHAR,15);
            m140nombrecompl = new FieldDef("m140nombrecompl",FieldDef.CHAR,40);
            m140siglas = new FieldDef("m140siglas",FieldDef.CHAR,2);
            m140calle = new FieldDef("m140calle",FieldDef.CHAR,25);
            m140numero = new FieldDef("m140numero",FieldDef.CHAR,5);
            m140escalera = new FieldDef("m140escalera",FieldDef.CHAR,2);
            m140piso = new FieldDef("m140piso",FieldDef.CHAR,2);
            m140puerta = new FieldDef("m140puerta",FieldDef.CHAR,2);
            m140cpostal = new FieldDef("m140cpostal",FieldDef.CHAR,5);
            m140municipio = new FieldDef("m140municipio",FieldDef.CHAR,20);
            m140codprov = new FieldDef("m140codprov",FieldDef.INTEGER,0);
            m140provincia = new FieldDef("m140provincia",FieldDef.CHAR,12);
            m140telefono1 = new FieldDef("m140telefono1",FieldDef.CHAR,9);
            m140telefono2 = new FieldDef("m140telefono2",FieldDef.CHAR,9);
            m140nifbenefant = new FieldDef("m140nifbenefant",FieldDef.CHAR,15);
            m140nifhijo1 = new FieldDef("m140nifhijo1",FieldDef.CHAR,15);
            m140apellhijo1 = new FieldDef("m140apellhijo1",FieldDef.CHAR,30);
            m140nomhijo1 = new FieldDef("m140nomhijo1",FieldDef.CHAR,20);
            m140fenachijo1 = new FieldDef("m140fenachijo1",FieldDef.DATE);
            m140feadophijo1 = new FieldDef("m140feadophijo1",FieldDef.DATE);
            m140nifhijo2 = new FieldDef("m140nifhijo2",FieldDef.CHAR,15);
            m140apellhijo2 = new FieldDef("m140apellhijo2",FieldDef.CHAR,30);
            m140nomhijo2 = new FieldDef("m140nomhijo2",FieldDef.CHAR,20);
            m140fenachijo2 = new FieldDef("m140fenachijo2",FieldDef.DATE);
            m140feadophijo2 = new FieldDef("m140feadophijo2",FieldDef.DATE);
            m140nifhijo3 = new FieldDef("m140nifhijo3",FieldDef.CHAR,15);
            m140apellhijo3 = new FieldDef("m140apellhijo3",FieldDef.CHAR,30);
            m140nomhijo3 = new FieldDef("m140nomhijo3",FieldDef.CHAR,20);
            m140fenachijo3 = new FieldDef("m140fenachijo3",FieldDef.DATE);
            m140feadophijo3 = new FieldDef("m140feadophijo3",FieldDef.DATE);
            m140nifhijo4 = new FieldDef("m140nifhijo4",FieldDef.CHAR,15);
            m140apellhijo4 = new FieldDef("m140apellhijo4",FieldDef.CHAR,30);
            m140nomhijo4 = new FieldDef("m140nomhijo4",FieldDef.CHAR,20);
            m140fenachijo4 = new FieldDef("m140fenachijo4",FieldDef.DATE);
            m140feadophijo4 = new FieldDef("m140feadophijo4",FieldDef.DATE);
            m140nifhijo5 = new FieldDef("m140nifhijo5",FieldDef.CHAR,15);
            m140apellhijo5 = new FieldDef("m140apellhijo5",FieldDef.CHAR,30);
            m140nomhijo5 = new FieldDef("m140nomhijo5",FieldDef.CHAR,20);
            m140fenachijo5 = new FieldDef("m140fenachijo5",FieldDef.DATE);
            m140feadophijo5 = new FieldDef("m140feadophijo5",FieldDef.DATE);
            m140nifhijo6 = new FieldDef("m140nifhijo6",FieldDef.CHAR,15);
            m140apellhijo6 = new FieldDef("m140apellhijo6",FieldDef.CHAR,30);
            m140nomhijo6 = new FieldDef("m140nomhijo6",FieldDef.CHAR,20);
            m140fenachijo6 = new FieldDef("m140fenachijo6",FieldDef.DATE);
            m140feadophijo6 = new FieldDef("m140feadophijo6",FieldDef.DATE);
            m140afiliass = new FieldDef("m140afiliass",FieldDef.CHAR,12);
            m140reggen = new FieldDef("m140reggen",FieldDef.CHAR,1);
            m140regesp = new FieldDef("m140regesp",FieldDef.CHAR,1);
            m140regfuncio = new FieldDef("m140regfuncio",FieldDef.CHAR,1);
            m140codigo = new FieldDef("m140codigo",FieldDef.CHAR,1);
            m140txtregfunc = new FieldDef("m140txtregfunc",FieldDef.CHAR,25);
            m140nummutua = new FieldDef("m140nummutua",FieldDef.CHAR,12);
            m140codmutua = new FieldDef("m140codmutua",FieldDef.CHAR,2);
            m140denmutua = new FieldDef("m140denmutua",FieldDef.CHAR,40);
            m140soldnifmad = new FieldDef("m140soldnifmad",FieldDef.CHAR,15);
            m140fecmuerte = new FieldDef("m140fecmuerte",FieldDef.DATE);
            m140perderecho = new FieldDef("m140perderecho",FieldDef.CHAR,1);
            m140cambioreg = new FieldDef("m140cambioreg",FieldDef.CHAR,1);
            m140bajahijos = new FieldDef("m140bajahijos",FieldDef.CHAR,1);
            m140fecvariac = new FieldDef("m140fecvariac",FieldDef.DATE);
            m140nifrepre = new FieldDef("m140nifrepre",FieldDef.CHAR,15);
            m140nomrepre = new FieldDef("m140nomrepre",FieldDef.CHAR,40);
            m140viarepre = new FieldDef("m140viarepre",FieldDef.CHAR,25);
            m140nviarepre = new FieldDef("m140nviarepre",FieldDef.CHAR,5);
            m140munirepre = new FieldDef("m140munirepre",FieldDef.CHAR,12);
            m140provrepre = new FieldDef("m140provrepre",FieldDef.CHAR,12);
            m140cposrepre = new FieldDef("m140cposrepre",FieldDef.CHAR,5);
            m140cruzefec = new FieldDef("m140cruzefec",FieldDef.CHAR,1);
            m140cruzadeu = new FieldDef("m140cruzadeu",FieldDef.CHAR,1);
            m140entingreso = new FieldDef("m140entingreso",FieldDef.CHAR,4);
            m140ofiingreso = new FieldDef("m140ofiingreso",FieldDef.CHAR,4);
            m140digiingreso = new FieldDef("m140digiingreso",FieldDef.CHAR,2);
            m140ctaingreso = new FieldDef("m140ctaingreso",FieldDef.CHAR,10);
            m140modifcta = new FieldDef("m140modifcta",FieldDef.CHAR,1);
            m140confirma = new FieldDef("m140confirma",FieldDef.CHAR,1);
            m140codelectr = new FieldDef("m140codelectr",FieldDef.CHAR,16);
            m140hora = new FieldDef("m140hora",FieldDef.CHAR,6);
            m140dia = new FieldDef("m140dia",FieldDef.CHAR,2);
            m140mes = new FieldDef("m140mes",FieldDef.CHAR,10);
            m140anyo = new FieldDef("m140anyo",FieldDef.CHAR,4);
            m140fecha = new FieldDef("m140fecha",FieldDef.DATE);
            m140cheque = new FieldDef("m140cheque",FieldDef.CHAR,1);
            m140reserva1 = new FieldDef("m140reserva1",FieldDef.CHAR,1);
            m140reserva2 = new FieldDef("m140reserva2",FieldDef.CHAR,8);
            m140reserva3 = new FieldDef("m140reserva3",FieldDef.CHAR,30);
            FieldDef array[] = {
                m140dominio,
                m140nif,
                m140ejercicio,
                m140periodo,
                m140nifsol,
                m140apell1,
                m140apell2,
                m140nombre,
                m140nombrecompl,
                m140siglas,
                m140calle,
                m140numero,
                m140escalera,
                m140piso,
                m140puerta,
                m140cpostal,
                m140municipio,
                m140codprov,
                m140provincia,
                m140telefono1,
                m140telefono2,
                m140nifbenefant,
                m140nifhijo1,
                m140apellhijo1,
                m140nomhijo1,
                m140fenachijo1,
                m140feadophijo1,
                m140nifhijo2,
                m140apellhijo2,
                m140nomhijo2,
                m140fenachijo2,
                m140feadophijo2,
                m140nifhijo3,
                m140apellhijo3,
                m140nomhijo3,
                m140fenachijo3,
                m140feadophijo3,
                m140nifhijo4,
                m140apellhijo4,
                m140nomhijo4,
                m140fenachijo4,
                m140feadophijo4,
                m140nifhijo5,
                m140apellhijo5,
                m140nomhijo5,
                m140fenachijo5,
                m140feadophijo5,
                m140nifhijo6,
                m140apellhijo6,
                m140nomhijo6,
                m140fenachijo6,
                m140feadophijo6,
                m140afiliass,
                m140reggen,
                m140regesp,
                m140regfuncio,
                m140codigo,
                m140txtregfunc,
                m140nummutua,
                m140codmutua,
                m140denmutua,
                m140soldnifmad,
                m140fecmuerte,
                m140perderecho,
                m140cambioreg,
                m140bajahijos,
                m140fecvariac,
                m140nifrepre,
                m140nomrepre,
                m140viarepre,
                m140nviarepre,
                m140munirepre,
                m140provrepre,
                m140cposrepre,
                m140cruzefec,
                m140cruzadeu,
                m140entingreso,
                m140ofiingreso,
                m140digiingreso,
                m140ctaingreso,
                m140modifcta,
                m140confirma,
                m140codelectr,
                m140hora,
                m140dia,
                m140mes,
                m140anyo,
                m140fecha,
                m140cheque,
                m140reserva1,
                m140reserva2,
                m140reserva3                
                };
            setColumns(array);
            FieldDef arrayf[] = {m140dominio,m140nif,m140ejercicio,m140periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod600c extends TableDef
        {
        // campos
        public FieldDef m600cdominio;
        public FieldDef m600cnif;
        public FieldDef m600cejercicio;
        public FieldDef m600cperiodo;
        public FieldDef m600cmodelo;
        public FieldDef m600c1autonomia;
        public FieldDef m600c1fechalta;
        public FieldDef m600c1fechaltad;
        public FieldDef m600c1fechaltam;
        public FieldDef m600c1fechaltaa;
        public FieldDef m600c1descrip;
        public FieldDef m600c1codofiliq;
        public FieldDef m600c1ofiliq;
        public FieldDef m600c1fechdeven;
        public FieldDef m600c1numsujpas;
        public FieldDef m600c1numtrans;
        public FieldDef m600c2tipodoc;
        public FieldDef m600c2administr;
        public FieldDef m600c2judicial;
        public FieldDef m600c2mercantil;
        public FieldDef m600c2notarial;
        public FieldDef m600c2privado;
        public FieldDef m600c2publico;
        public FieldDef m600c2nifnotari;
        public FieldDef m600c2nomnotari;
        public FieldDef m600c2muniforma;
        public FieldDef m600c2numprotoc;
        public FieldDef m600c2fecprotoc;
        public FieldDef m600c3codnatur;
        public FieldDef m600c3descbien;
        public FieldDef m600c3urbana;
        public FieldDef m600c3rustica;
        public FieldDef m600c3altres;
        public FieldDef m600c3clvconep;
        public FieldDef m600c3deconcep;
        public FieldDef m600c3otrdatid;
        public FieldDef m600c3via;
        public FieldDef m600c3num;
        public FieldDef m600c3esc;
        public FieldDef m600c3piso;
        public FieldDef m600c3puert;
        public FieldDef m600c3prov;
        public FieldDef m600c3muni;
        public FieldDef m600c3cpostal;
        public FieldDef m600c3refcatas;
        public FieldDef m600c3valcatas;
        public FieldDef m600c3super;
        public FieldDef m600c3unimedi;
        public FieldDef m600c3hectar;
        public FieldDef m600c3metros;
        public FieldDef m600c3valdecl;
        public FieldDef m600c4exento;
        public FieldDef m600c4nosujeto;
        public FieldDef m600c4prescrit;
        public FieldDef m600c4codexen;
        public FieldDef m600c4codnosub;
        public FieldDef m600c4fundaben;
        public FieldDef m600c5liqcomple;
        public FieldDef m600c5numpresen;
        public FieldDef m600c5fecpresen;
        public FieldDef m600c5impoingre;
        public FieldDef m600c5codofi;
        public FieldDef m600c6baseimpo;
        public FieldDef m600c6porreduc;
        public FieldDef m600c6reduccio;
        public FieldDef m600c6baseliq;
        public FieldDef m600c6tipo;
        public FieldDef m600c6cuota;
        public FieldDef m600c6porbonif;
        public FieldDef m600c6bonif;
        public FieldDef m600c6aingresar;
        public FieldDef m600c6intdemora;
        public FieldDef m600c6recargo;
        public FieldDef m600c6totingr;
        public FieldDef m600c7nifpres;
        public FieldDef m600c7munipres;
        public FieldDef m600c7fechpres;
        public FieldDef m600c7diapres;
        public FieldDef m600c7mespres;
        public FieldDef m600c7anypres;
        public FieldDef m600c8fechingr;
        public FieldDef m600c8numingre;
        public FieldDef m600c8impoingr;
        public TabMod600c(String name)
            {
            super(name);
            m600cdominio = new FieldDef("m600cdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m600cnif = new FieldDef("m600cnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m600cejercicio = new FieldDef("m600cejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m600cperiodo = new FieldDef("m600cperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m600cmodelo = new FieldDef("m600cmodelo",FieldDef.CHAR,5);
            m600c1autonomia = new FieldDef("m600c1autonomia",FieldDef.CHAR,2);
            m600c1fechalta = new FieldDef("m600c1fechalta",FieldDef.DATE);
            m600c1fechaltad = new FieldDef("m600c1fechaltad",FieldDef.CHAR,2);
            m600c1fechaltam = new FieldDef("m600c1fechaltam",FieldDef.CHAR,2);
            m600c1fechaltaa = new FieldDef("m600c1fechaltaa",FieldDef.CHAR,4);
            m600c1descrip = new FieldDef("m600c1descrip",FieldDef.CHAR,30);
            m600c1codofiliq = new FieldDef("m600c1codofiliq",FieldDef.CHAR,5);
            m600c1ofiliq = new FieldDef("m600c1ofiliq",FieldDef.CHAR,25);
            m600c1fechdeven = new FieldDef("m600c1fechdeven",FieldDef.DATE);
            m600c1numsujpas = new FieldDef("m600c1numsujpas",FieldDef.INTEGER,0);
            m600c1numtrans = new FieldDef("m600c1numtrans",FieldDef.INTEGER,0);
            m600c2tipodoc = new FieldDef("m600c2tipodoc",FieldDef.CHAR,1);
            m600c2administr = new FieldDef("m600c2administr",FieldDef.CHAR,1);
            m600c2judicial = new FieldDef("m600c2judicial",FieldDef.CHAR,1);
            m600c2mercantil = new FieldDef("m600c2mercantil",FieldDef.CHAR,1);
            m600c2notarial = new FieldDef("m600c2notarial",FieldDef.CHAR,1);
            m600c2privado = new FieldDef("m600c2privado",FieldDef.CHAR,1);
            m600c2publico = new FieldDef("m600c2publico",FieldDef.CHAR,1);
            m600c2nifnotari = new FieldDef("m600c2nifnotari",FieldDef.CHAR,15);
            m600c2nomnotari = new FieldDef("m600c2nomnotari",FieldDef.CHAR,40);
            m600c2muniforma = new FieldDef("m600c2muniforma",FieldDef.CHAR,30);
            m600c2numprotoc = new FieldDef("m600c2numprotoc",FieldDef.CHAR,6);
            m600c2fecprotoc = new FieldDef("m600c2fecprotoc",FieldDef.DATE);
            m600c3codnatur = new FieldDef("m600c3codnatur",FieldDef.CHAR,1);
            m600c3descbien = new FieldDef("m600c3descbien",FieldDef.CHAR,25);
            m600c3urbana = new FieldDef("m600c3urbana",FieldDef.CHAR,1);
            m600c3rustica = new FieldDef("m600c3rustica",FieldDef.CHAR,1);
            m600c3altres = new FieldDef("m600c3altres",FieldDef.CHAR,1);
            m600c3clvconep = new FieldDef("m600c3clvconep",FieldDef.CHAR,3);
            m600c3deconcep = new FieldDef("m600c3deconcep",FieldDef.CHAR,50);
            m600c3otrdatid = new FieldDef("m600c3otrdatid",FieldDef.CHAR,35);
            m600c3via = new FieldDef("m600c3via",FieldDef.CHAR,20);
            m600c3num = new FieldDef("m600c3num",FieldDef.CHAR,4);
            m600c3esc = new FieldDef("m600c3esc",FieldDef.CHAR,2);
            m600c3piso = new FieldDef("m600c3piso",FieldDef.CHAR,2);
            m600c3puert = new FieldDef("m600c3puert",FieldDef.CHAR,2);
            m600c3prov = new FieldDef("m600c3prov",FieldDef.CHAR,20);
            m600c3muni = new FieldDef("m600c3muni",FieldDef.CHAR,25);
            m600c3cpostal = new FieldDef("m600c3cpostal",FieldDef.CHAR,5);
            m600c3refcatas = new FieldDef("m600c3refcatas",FieldDef.CHAR,20);
            m600c3valcatas = new FieldDef("m600c3valcatas",FieldDef.FLOAT,6,0);
            m600c3super = new FieldDef("m600c3super",FieldDef.FLOAT,6,0);
            m600c3unimedi = new FieldDef("m600c3unimedi",FieldDef.CHAR,2);
            m600c3hectar = new FieldDef("m600c3hectar",FieldDef.CHAR,1);
            m600c3metros = new FieldDef("m600c3metros",FieldDef.CHAR,1);
            m600c3valdecl = new FieldDef("m600c3valdecl",FieldDef.FLOAT,6,0);
            m600c4exento = new FieldDef("m600c4exento",FieldDef.CHAR,1);
            m600c4nosujeto = new FieldDef("m600c4nosujeto",FieldDef.CHAR,1);
            m600c4prescrit = new FieldDef("m600c4prescrit",FieldDef.CHAR,1);
            m600c4codexen = new FieldDef("m600c4codexen",FieldDef.CHAR,3);
            m600c4codnosub = new FieldDef("m600c4codnosub",FieldDef.CHAR,2);
            m600c4fundaben = new FieldDef("m600c4fundaben",FieldDef.CHAR,35);
            m600c5liqcomple = new FieldDef("m600c5liqcomple",FieldDef.CHAR,1);
            m600c5numpresen = new FieldDef("m600c5numpresen",FieldDef.INTEGER,0);
            m600c5fecpresen = new FieldDef("m600c5fecpresen",FieldDef.DATE);
            m600c5impoingre = new FieldDef("m600c5impoingre",FieldDef.FLOAT,6,0);
            m600c5codofi = new FieldDef("m600c5codofi",FieldDef.CHAR,2);
            m600c6baseimpo = new FieldDef("m600c6baseimpo",FieldDef.FLOAT,6,0);
            m600c6porreduc = new FieldDef("m600c6porreduc",FieldDef.FLOAT,6,0);
            m600c6reduccio = new FieldDef("m600c6reduccio",FieldDef.FLOAT,6,0);
            m600c6baseliq = new FieldDef("m600c6baseliq",FieldDef.FLOAT,6,0);
            m600c6tipo = new FieldDef("m600c6tipo",FieldDef.FLOAT,6,0);
            m600c6cuota = new FieldDef("m600c6cuota",FieldDef.FLOAT,6,0);
            m600c6porbonif = new FieldDef("m600c6porbonif",FieldDef.FLOAT,6,0);
            m600c6bonif = new FieldDef("m600c6bonif",FieldDef.FLOAT,6,0);
            m600c6aingresar = new FieldDef("m600c6aingresar",FieldDef.FLOAT,6,0);
            m600c6intdemora = new FieldDef("m600c6intdemora",FieldDef.FLOAT,6,0);
            m600c6recargo = new FieldDef("m600c6recargo",FieldDef.FLOAT,6,0);
            m600c6totingr = new FieldDef("m600c6totingr",FieldDef.FLOAT,6,0);
            m600c7nifpres = new FieldDef("m600c7nifpres",FieldDef.CHAR,15);
            m600c7munipres = new FieldDef("m600c7munipres",FieldDef.CHAR,25);
            m600c7fechpres = new FieldDef("m600c7fechpres",FieldDef.DATE);
            m600c7diapres = new FieldDef("m600c7diapres",FieldDef.CHAR,2);
            m600c7mespres = new FieldDef("m600c7mespres",FieldDef.CHAR,2);
            m600c7anypres = new FieldDef("m600c7anypres",FieldDef.CHAR,4);
            m600c8fechingr = new FieldDef("m600c8fechingr",FieldDef.DATE);
            m600c8numingre = new FieldDef("m600c8numingre",FieldDef.INTEGER,0);
            m600c8impoingr = new FieldDef("m600c8impoingr",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m600cdominio,
                m600cnif,
                m600cejercicio,
                m600cperiodo,
                m600cmodelo,
                m600c1autonomia,
                m600c1fechalta,
                m600c1fechaltad,
                m600c1fechaltam,
                m600c1fechaltaa,
                m600c1descrip,
                m600c1codofiliq,
                m600c1ofiliq,
                m600c1fechdeven,
                m600c1numsujpas,
                m600c1numtrans,
                m600c2tipodoc,
                m600c2administr,
                m600c2judicial,
                m600c2mercantil,
                m600c2notarial,
                m600c2privado,
                m600c2publico,
                m600c2nifnotari,
                m600c2nomnotari,
                m600c2muniforma,
                m600c2numprotoc,
                m600c2fecprotoc,
                m600c3codnatur,
                m600c3descbien,
                m600c3urbana,
                m600c3rustica,
                m600c3altres,
                m600c3clvconep,
                m600c3deconcep,
                m600c3otrdatid,
                m600c3via,
                m600c3num,
                m600c3esc,
                m600c3piso,
                m600c3puert,
                m600c3prov,
                m600c3muni,
                m600c3cpostal,
                m600c3refcatas,
                m600c3valcatas,
                m600c3super,
                m600c3unimedi,
                m600c3hectar,
                m600c3metros,
                m600c3valdecl,
                m600c4exento,
                m600c4nosujeto,
                m600c4prescrit,
                m600c4codexen,
                m600c4codnosub,
                m600c4fundaben,
                m600c5liqcomple,
                m600c5numpresen,
                m600c5fecpresen,
                m600c5impoingre,
                m600c5codofi,
                m600c6baseimpo,
                m600c6porreduc,
                m600c6reduccio,
                m600c6baseliq,
                m600c6tipo,
                m600c6cuota,
                m600c6porbonif,
                m600c6bonif,
                m600c6aingresar,
                m600c6intdemora,
                m600c6recargo,
                m600c6totingr,
                m600c7nifpres,
                m600c7munipres,
                m600c7fechpres,
                m600c7diapres,
                m600c7mespres,
                m600c7anypres,
                m600c8fechingr,
                m600c8numingre,
                m600c8impoingr                
                };
            setColumns(array);
            FieldDef arrayf[] = {m600cdominio,m600cnif,m600cejercicio,m600cperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod600d extends TableDef
        {
        // campos
        public FieldDef m600dident;
        public FieldDef m600ddominio;
        public FieldDef m600dnif;
        public FieldDef m600dejercicio;
        public FieldDef m600dperiodo;
        public FieldDef m600dtipo;
        public FieldDef m600dnifsujtra;
        public FieldDef m600dcoefparti;
        public FieldDef m600dimpoparti;
        public TabMod600d(String name)
            {
            super(name);
            m600dident = new FieldDef("m600dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m600ddominio = new FieldDef("m600ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m600dnif = new FieldDef("m600dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m600dejercicio = new FieldDef("m600dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m600dperiodo = new FieldDef("m600dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m600dtipo = new FieldDef("m600dtipo",FieldDef.CHAR,1);
            m600dnifsujtra = new FieldDef("m600dnifsujtra",FieldDef.CHAR,15);
            m600dcoefparti = new FieldDef("m600dcoefparti",FieldDef.FLOAT,6,0);
            m600dimpoparti = new FieldDef("m600dimpoparti",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m600dident,
                m600ddominio,
                m600dnif,
                m600dejercicio,
                m600dperiodo,
                m600dtipo,
                m600dnifsujtra,
                m600dcoefparti,
                m600dimpoparti                
                };
            setColumns(array);
            FieldDef arrayf[] = {m600dident };
            setPrimaryKeys(arrayf);
            m600dident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod0361 extends TableDef
        {
        // campos
        public FieldDef m0361dominio;
        public FieldDef m0361nif;
        public FieldDef m0361ejercicio;
        public FieldDef m0361periodo;
        public FieldDef m0361listpag;
        public FieldDef m0361deleg;
        public FieldDef m0361admon;
        public FieldDef m0361fcodadmon;
        public FieldDef m0361fnif5;
        public FieldDef m0361fapenom6;
        public FieldDef m0361fsg10;
        public FieldDef m0361fvia11;
        public FieldDef m0361fnum12;
        public FieldDef m0361fesc13;
        public FieldDef m0361fpiso14;
        public FieldDef m0361fpuerta15;
        public FieldDef m0361ftelef16;
        public FieldDef m0361fcpostal7;
        public FieldDef m0361fmuni18;
        public FieldDef m0361fprov19;
        public FieldDef m0361fcodmuni;
        public FieldDef m0361femail20;
        public FieldDef m0361furl21;
        public FieldDef m0361fsg25;
        public FieldDef m0361fvia26;
        public FieldDef m0361fnum27;
        public FieldDef m0361fesc28;
        public FieldDef m0361fpiso29;
        public FieldDef m0361fpuerta30;
        public FieldDef m0361ftelef31;
        public FieldDef m0361fcpost32;
        public FieldDef m0361fmuni33;
        public FieldDef m0361fprov34;
        public FieldDef m0361fcmuni2;
        public FieldDef m0361jnif35;
        public FieldDef m0361jrazon36;
        public FieldDef m0361janagr37;
        public FieldDef m0361jsg40;
        public FieldDef m0361jvia41;
        public FieldDef m0361jnum42;
        public FieldDef m0361jesc43;
        public FieldDef m0361jpiso44;
        public FieldDef m0361jpuerta45;
        public FieldDef m0361jtelef46;
        public FieldDef m0361jcpost47;
        public FieldDef m0361jmuni48;
        public FieldDef m0361jprov49;
        public FieldDef m0361jcodmuni;
        public FieldDef m0361jemail50;
        public FieldDef m0361jurl51;
        public FieldDef m0361jsg55;
        public FieldDef m0361jvia56;
        public FieldDef m0361jnum57;
        public FieldDef m0361jesc58;
        public FieldDef m0361jpiso59;
        public FieldDef m0361jpuerta60;
        public FieldDef m0361jtelef61;
        public FieldDef m0361jcpostal62;
        public FieldDef m0361jmuni63;
        public FieldDef m0361jprov64;
        public FieldDef m0361jcodmuni2;
        public FieldDef m0361jpersonj65;
        public FieldDef m0361jperjuri68;
        public FieldDef m0361jformjur69;
        public FieldDef m0361jatrirec70;
        public FieldDef m0361jclsenti71;
        public FieldDef m0361jatrires72;
        public FieldDef m0361jclsenti73;
        public FieldDef m0361jotrenti74;
        public FieldDef m0361jclsenti75;
        public FieldDef m0361enif77;
        public FieldDef m0361eapenom78;
        public FieldDef m0361eanagra79;
        public FieldDef m0361esg80;
        public FieldDef m0361evia81;
        public FieldDef m0361enum82;
        public FieldDef m0361eesc83;
        public FieldDef m0361episo84;
        public FieldDef m0361epuerta85;
        public FieldDef m0361etelef86;
        public FieldDef m0361ecpost87;
        public FieldDef m0361emuni88;
        public FieldDef m0361eprov89;
        public FieldDef m0361ecodmuni;
        public FieldDef m0361eemail90;
        public FieldDef m0361eurl91;
        public TabMod0361(String name)
            {
            super(name);
            m0361dominio = new FieldDef("m0361dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m0361nif = new FieldDef("m0361nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m0361ejercicio = new FieldDef("m0361ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m0361periodo = new FieldDef("m0361periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m0361listpag = new FieldDef("m0361listpag",FieldDef.CHAR,1);
            m0361deleg = new FieldDef("m0361deleg",FieldDef.CHAR,30);
            m0361admon = new FieldDef("m0361admon",FieldDef.CHAR,30);
            m0361fcodadmon = new FieldDef("m0361fcodadmon",FieldDef.INTEGER,0);
            m0361fnif5 = new FieldDef("m0361fnif5",FieldDef.CHAR,9);
            m0361fapenom6 = new FieldDef("m0361fapenom6",FieldDef.CHAR,25);
            m0361fsg10 = new FieldDef("m0361fsg10",FieldDef.CHAR,17);
            m0361fvia11 = new FieldDef("m0361fvia11",FieldDef.CHAR,25);
            m0361fnum12 = new FieldDef("m0361fnum12",FieldDef.CHAR,5);
            m0361fesc13 = new FieldDef("m0361fesc13",FieldDef.CHAR,2);
            m0361fpiso14 = new FieldDef("m0361fpiso14",FieldDef.CHAR,2);
            m0361fpuerta15 = new FieldDef("m0361fpuerta15",FieldDef.CHAR,2);
            m0361ftelef16 = new FieldDef("m0361ftelef16",FieldDef.CHAR,9);
            m0361fcpostal7 = new FieldDef("m0361fcpostal7",FieldDef.CHAR,5);
            m0361fmuni18 = new FieldDef("m0361fmuni18",FieldDef.CHAR,25);
            m0361fprov19 = new FieldDef("m0361fprov19",FieldDef.CHAR,2);
            m0361fcodmuni = new FieldDef("m0361fcodmuni",FieldDef.CHAR,6);
            m0361femail20 = new FieldDef("m0361femail20",FieldDef.CHAR,65);
            m0361furl21 = new FieldDef("m0361furl21",FieldDef.CHAR,65);
            m0361fsg25 = new FieldDef("m0361fsg25",FieldDef.CHAR,17);
            m0361fvia26 = new FieldDef("m0361fvia26",FieldDef.CHAR,25);
            m0361fnum27 = new FieldDef("m0361fnum27",FieldDef.CHAR,5);
            m0361fesc28 = new FieldDef("m0361fesc28",FieldDef.CHAR,2);
            m0361fpiso29 = new FieldDef("m0361fpiso29",FieldDef.CHAR,2);
            m0361fpuerta30 = new FieldDef("m0361fpuerta30",FieldDef.CHAR,2);
            m0361ftelef31 = new FieldDef("m0361ftelef31",FieldDef.CHAR,9);
            m0361fcpost32 = new FieldDef("m0361fcpost32",FieldDef.CHAR,5);
            m0361fmuni33 = new FieldDef("m0361fmuni33",FieldDef.CHAR,25);
            m0361fprov34 = new FieldDef("m0361fprov34",FieldDef.CHAR,2);
            m0361fcmuni2 = new FieldDef("m0361fcmuni2",FieldDef.CHAR,6);
            m0361jnif35 = new FieldDef("m0361jnif35",FieldDef.CHAR,9);
            m0361jrazon36 = new FieldDef("m0361jrazon36",FieldDef.CHAR,125);
            m0361janagr37 = new FieldDef("m0361janagr37",FieldDef.CHAR,25);
            m0361jsg40 = new FieldDef("m0361jsg40",FieldDef.CHAR,17);
            m0361jvia41 = new FieldDef("m0361jvia41",FieldDef.CHAR,25);
            m0361jnum42 = new FieldDef("m0361jnum42",FieldDef.CHAR,5);
            m0361jesc43 = new FieldDef("m0361jesc43",FieldDef.CHAR,2);
            m0361jpiso44 = new FieldDef("m0361jpiso44",FieldDef.CHAR,2);
            m0361jpuerta45 = new FieldDef("m0361jpuerta45",FieldDef.CHAR,2);
            m0361jtelef46 = new FieldDef("m0361jtelef46",FieldDef.CHAR,9);
            m0361jcpost47 = new FieldDef("m0361jcpost47",FieldDef.CHAR,5);
            m0361jmuni48 = new FieldDef("m0361jmuni48",FieldDef.CHAR,25);
            m0361jprov49 = new FieldDef("m0361jprov49",FieldDef.CHAR,2);
            m0361jcodmuni = new FieldDef("m0361jcodmuni",FieldDef.CHAR,6);
            m0361jemail50 = new FieldDef("m0361jemail50",FieldDef.CHAR,65);
            m0361jurl51 = new FieldDef("m0361jurl51",FieldDef.CHAR,65);
            m0361jsg55 = new FieldDef("m0361jsg55",FieldDef.CHAR,17);
            m0361jvia56 = new FieldDef("m0361jvia56",FieldDef.CHAR,25);
            m0361jnum57 = new FieldDef("m0361jnum57",FieldDef.CHAR,5);
            m0361jesc58 = new FieldDef("m0361jesc58",FieldDef.CHAR,2);
            m0361jpiso59 = new FieldDef("m0361jpiso59",FieldDef.CHAR,2);
            m0361jpuerta60 = new FieldDef("m0361jpuerta60",FieldDef.CHAR,2);
            m0361jtelef61 = new FieldDef("m0361jtelef61",FieldDef.CHAR,9);
            m0361jcpostal62 = new FieldDef("m0361jcpostal62",FieldDef.CHAR,5);
            m0361jmuni63 = new FieldDef("m0361jmuni63",FieldDef.CHAR,25);
            m0361jprov64 = new FieldDef("m0361jprov64",FieldDef.CHAR,2);
            m0361jcodmuni2 = new FieldDef("m0361jcodmuni2",FieldDef.CHAR,6);
            m0361jpersonj65 = new FieldDef("m0361jpersonj65",FieldDef.CHAR,1);
            m0361jperjuri68 = new FieldDef("m0361jperjuri68",FieldDef.CHAR,1);
            m0361jformjur69 = new FieldDef("m0361jformjur69",FieldDef.CHAR,2);
            m0361jatrirec70 = new FieldDef("m0361jatrirec70",FieldDef.CHAR,1);
            m0361jclsenti71 = new FieldDef("m0361jclsenti71",FieldDef.CHAR,2);
            m0361jatrires72 = new FieldDef("m0361jatrires72",FieldDef.CHAR,1);
            m0361jclsenti73 = new FieldDef("m0361jclsenti73",FieldDef.CHAR,2);
            m0361jotrenti74 = new FieldDef("m0361jotrenti74",FieldDef.CHAR,1);
            m0361jclsenti75 = new FieldDef("m0361jclsenti75",FieldDef.CHAR,2);
            m0361enif77 = new FieldDef("m0361enif77",FieldDef.CHAR,9);
            m0361eapenom78 = new FieldDef("m0361eapenom78",FieldDef.CHAR,125);
            m0361eanagra79 = new FieldDef("m0361eanagra79",FieldDef.CHAR,25);
            m0361esg80 = new FieldDef("m0361esg80",FieldDef.CHAR,17);
            m0361evia81 = new FieldDef("m0361evia81",FieldDef.CHAR,25);
            m0361enum82 = new FieldDef("m0361enum82",FieldDef.CHAR,5);
            m0361eesc83 = new FieldDef("m0361eesc83",FieldDef.CHAR,2);
            m0361episo84 = new FieldDef("m0361episo84",FieldDef.CHAR,2);
            m0361epuerta85 = new FieldDef("m0361epuerta85",FieldDef.CHAR,2);
            m0361etelef86 = new FieldDef("m0361etelef86",FieldDef.CHAR,9);
            m0361ecpost87 = new FieldDef("m0361ecpost87",FieldDef.CHAR,5);
            m0361emuni88 = new FieldDef("m0361emuni88",FieldDef.CHAR,25);
            m0361eprov89 = new FieldDef("m0361eprov89",FieldDef.CHAR,2);
            m0361ecodmuni = new FieldDef("m0361ecodmuni",FieldDef.CHAR,6);
            m0361eemail90 = new FieldDef("m0361eemail90",FieldDef.CHAR,65);
            m0361eurl91 = new FieldDef("m0361eurl91",FieldDef.CHAR,65);
            FieldDef array[] = {
                m0361dominio,
                m0361nif,
                m0361ejercicio,
                m0361periodo,
                m0361listpag,
                m0361deleg,
                m0361admon,
                m0361fcodadmon,
                m0361fnif5,
                m0361fapenom6,
                m0361fsg10,
                m0361fvia11,
                m0361fnum12,
                m0361fesc13,
                m0361fpiso14,
                m0361fpuerta15,
                m0361ftelef16,
                m0361fcpostal7,
                m0361fmuni18,
                m0361fprov19,
                m0361fcodmuni,
                m0361femail20,
                m0361furl21,
                m0361fsg25,
                m0361fvia26,
                m0361fnum27,
                m0361fesc28,
                m0361fpiso29,
                m0361fpuerta30,
                m0361ftelef31,
                m0361fcpost32,
                m0361fmuni33,
                m0361fprov34,
                m0361fcmuni2,
                m0361jnif35,
                m0361jrazon36,
                m0361janagr37,
                m0361jsg40,
                m0361jvia41,
                m0361jnum42,
                m0361jesc43,
                m0361jpiso44,
                m0361jpuerta45,
                m0361jtelef46,
                m0361jcpost47,
                m0361jmuni48,
                m0361jprov49,
                m0361jcodmuni,
                m0361jemail50,
                m0361jurl51,
                m0361jsg55,
                m0361jvia56,
                m0361jnum57,
                m0361jesc58,
                m0361jpiso59,
                m0361jpuerta60,
                m0361jtelef61,
                m0361jcpostal62,
                m0361jmuni63,
                m0361jprov64,
                m0361jcodmuni2,
                m0361jpersonj65,
                m0361jperjuri68,
                m0361jformjur69,
                m0361jatrirec70,
                m0361jclsenti71,
                m0361jatrires72,
                m0361jclsenti73,
                m0361jotrenti74,
                m0361jclsenti75,
                m0361enif77,
                m0361eapenom78,
                m0361eanagra79,
                m0361esg80,
                m0361evia81,
                m0361enum82,
                m0361eesc83,
                m0361episo84,
                m0361epuerta85,
                m0361etelef86,
                m0361ecpost87,
                m0361emuni88,
                m0361eprov89,
                m0361ecodmuni,
                m0361eemail90,
                m0361eurl91                
                };
            setColumns(array);
            FieldDef arrayf[] = {m0361dominio,m0361nif,m0361ejercicio,m0361periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod0362 extends TableDef
        {
        // campos
        public FieldDef m0362dominio;
        public FieldDef m0362nif;
        public FieldDef m0362ejercicio;
        public FieldDef m0362periodo;
        public FieldDef m0362listpag;
        public FieldDef m0362edirecom95;
        public FieldDef m0362epais96;
        public FieldDef m0362enaciona97;
        public FieldDef m0362eperfis100;
        public FieldDef m0362eperjur101;
        public FieldDef m0362eforjur102;
        public FieldDef m0362eatrenc103;
        public FieldDef m0362eclsenc104;
        public FieldDef m0362eatrens105;
        public FieldDef m0362eclsenc106;
        public FieldDef m0362eotrent107;
        public FieldDef m0362eclseno108;
        public FieldDef m0362eestper110;
        public FieldDef m0362eepcuan111;
        public FieldDef m0362eepnif112;
        public FieldDef m0362eepnom113;
        public FieldDef m0362eepnif114;
        public FieldDef m0362eepnom115;
        public FieldDef m0362eepnif116;
        public FieldDef m0362eepnom117;
        public FieldDef m0362nnif125;
        public FieldDef m0362nrazon126;
        public FieldDef m0362nanagr127;
        public FieldDef m0362nsg130;
        public FieldDef m0362nvia131;
        public FieldDef m0362nnum132;
        public FieldDef m0362nesc133;
        public FieldDef m0362npiso134;
        public FieldDef m0362npuert135;
        public FieldDef m0362ntelef136;
        public FieldDef m0362ncpost137;
        public FieldDef m0362nmuni138;
        public FieldDef m0362nprov139;
        public FieldDef m0362ncodmuni;
        public FieldDef m0362nemail140;
        public FieldDef m0362nurl141;
        public FieldDef m0362nsg145;
        public FieldDef m0362nvia146;
        public FieldDef m0362nnum147;
        public FieldDef m0362nesc148;
        public FieldDef m0362npiso149;
        public FieldDef m0362npuer150;
        public FieldDef m0362ntelef151;
        public FieldDef m0362ncpost152;
        public FieldDef m0362nmuni153;
        public FieldDef m0362nprov154;
        public FieldDef m0362ncodmuni2;
        public FieldDef m0362ntipoep155;
        public FieldDef m0362nessucu160;
        public FieldDef m0362ndepnif165;
        public FieldDef m0362ndepnom166;
        public FieldDef m0362ndepest167;
        public FieldDef m0362lugar175;
        public FieldDef m0362dia176;
        public FieldDef m0362mes176;
        public FieldDef m0362anyo176;
        public FieldDef m0362cargo;
        public FieldDef m0362firma;
        public FieldDef m0362fecha176;
        public TabMod0362(String name)
            {
            super(name);
            m0362dominio = new FieldDef("m0362dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m0362nif = new FieldDef("m0362nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m0362ejercicio = new FieldDef("m0362ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m0362periodo = new FieldDef("m0362periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m0362listpag = new FieldDef("m0362listpag",FieldDef.CHAR,1);
            m0362edirecom95 = new FieldDef("m0362edirecom95",FieldDef.CHAR,65);
            m0362epais96 = new FieldDef("m0362epais96",FieldDef.CHAR,3);
            m0362enaciona97 = new FieldDef("m0362enaciona97",FieldDef.CHAR,3);
            m0362eperfis100 = new FieldDef("m0362eperfis100",FieldDef.CHAR,1);
            m0362eperjur101 = new FieldDef("m0362eperjur101",FieldDef.CHAR,1);
            m0362eforjur102 = new FieldDef("m0362eforjur102",FieldDef.CHAR,40);
            m0362eatrenc103 = new FieldDef("m0362eatrenc103",FieldDef.CHAR,1);
            m0362eclsenc104 = new FieldDef("m0362eclsenc104",FieldDef.CHAR,40);
            m0362eatrens105 = new FieldDef("m0362eatrens105",FieldDef.CHAR,1);
            m0362eclsenc106 = new FieldDef("m0362eclsenc106",FieldDef.CHAR,40);
            m0362eotrent107 = new FieldDef("m0362eotrent107",FieldDef.CHAR,1);
            m0362eclseno108 = new FieldDef("m0362eclseno108",FieldDef.CHAR,40);
            m0362eestper110 = new FieldDef("m0362eestper110",FieldDef.CHAR,1);
            m0362eepcuan111 = new FieldDef("m0362eepcuan111",FieldDef.CHAR,3);
            m0362eepnif112 = new FieldDef("m0362eepnif112",FieldDef.CHAR,9);
            m0362eepnom113 = new FieldDef("m0362eepnom113",FieldDef.CHAR,40);
            m0362eepnif114 = new FieldDef("m0362eepnif114",FieldDef.CHAR,9);
            m0362eepnom115 = new FieldDef("m0362eepnom115",FieldDef.CHAR,40);
            m0362eepnif116 = new FieldDef("m0362eepnif116",FieldDef.CHAR,9);
            m0362eepnom117 = new FieldDef("m0362eepnom117",FieldDef.CHAR,40);
            m0362nnif125 = new FieldDef("m0362nnif125",FieldDef.CHAR,9);
            m0362nrazon126 = new FieldDef("m0362nrazon126",FieldDef.CHAR,125);
            m0362nanagr127 = new FieldDef("m0362nanagr127",FieldDef.CHAR,25);
            m0362nsg130 = new FieldDef("m0362nsg130",FieldDef.CHAR,17);
            m0362nvia131 = new FieldDef("m0362nvia131",FieldDef.CHAR,25);
            m0362nnum132 = new FieldDef("m0362nnum132",FieldDef.CHAR,5);
            m0362nesc133 = new FieldDef("m0362nesc133",FieldDef.CHAR,2);
            m0362npiso134 = new FieldDef("m0362npiso134",FieldDef.CHAR,2);
            m0362npuert135 = new FieldDef("m0362npuert135",FieldDef.CHAR,2);
            m0362ntelef136 = new FieldDef("m0362ntelef136",FieldDef.CHAR,9);
            m0362ncpost137 = new FieldDef("m0362ncpost137",FieldDef.CHAR,5);
            m0362nmuni138 = new FieldDef("m0362nmuni138",FieldDef.CHAR,25);
            m0362nprov139 = new FieldDef("m0362nprov139",FieldDef.CHAR,2);
            m0362ncodmuni = new FieldDef("m0362ncodmuni",FieldDef.CHAR,6);
            m0362nemail140 = new FieldDef("m0362nemail140",FieldDef.CHAR,65);
            m0362nurl141 = new FieldDef("m0362nurl141",FieldDef.CHAR,65);
            m0362nsg145 = new FieldDef("m0362nsg145",FieldDef.CHAR,17);
            m0362nvia146 = new FieldDef("m0362nvia146",FieldDef.CHAR,25);
            m0362nnum147 = new FieldDef("m0362nnum147",FieldDef.CHAR,5);
            m0362nesc148 = new FieldDef("m0362nesc148",FieldDef.CHAR,2);
            m0362npiso149 = new FieldDef("m0362npiso149",FieldDef.CHAR,2);
            m0362npuer150 = new FieldDef("m0362npuer150",FieldDef.CHAR,2);
            m0362ntelef151 = new FieldDef("m0362ntelef151",FieldDef.CHAR,9);
            m0362ncpost152 = new FieldDef("m0362ncpost152",FieldDef.CHAR,5);
            m0362nmuni153 = new FieldDef("m0362nmuni153",FieldDef.CHAR,25);
            m0362nprov154 = new FieldDef("m0362nprov154",FieldDef.CHAR,2);
            m0362ncodmuni2 = new FieldDef("m0362ncodmuni2",FieldDef.CHAR,6);
            m0362ntipoep155 = new FieldDef("m0362ntipoep155",FieldDef.CHAR,2);
            m0362nessucu160 = new FieldDef("m0362nessucu160",FieldDef.CHAR,1);
            m0362ndepnif165 = new FieldDef("m0362ndepnif165",FieldDef.CHAR,9);
            m0362ndepnom166 = new FieldDef("m0362ndepnom166",FieldDef.CHAR,125);
            m0362ndepest167 = new FieldDef("m0362ndepest167",FieldDef.CHAR,3);
            m0362lugar175 = new FieldDef("m0362lugar175",FieldDef.CHAR,40);
            m0362dia176 = new FieldDef("m0362dia176",FieldDef.CHAR,2);
            m0362mes176 = new FieldDef("m0362mes176",FieldDef.CHAR,2);
            m0362anyo176 = new FieldDef("m0362anyo176",FieldDef.CHAR,4);
            m0362cargo = new FieldDef("m0362cargo",FieldDef.CHAR,1);
            m0362firma = new FieldDef("m0362firma",FieldDef.CHAR,125);
            m0362fecha176 = new FieldDef("m0362fecha176",FieldDef.DATE);
            FieldDef array[] = {
                m0362dominio,
                m0362nif,
                m0362ejercicio,
                m0362periodo,
                m0362listpag,
                m0362edirecom95,
                m0362epais96,
                m0362enaciona97,
                m0362eperfis100,
                m0362eperjur101,
                m0362eforjur102,
                m0362eatrenc103,
                m0362eclsenc104,
                m0362eatrens105,
                m0362eclsenc106,
                m0362eotrent107,
                m0362eclseno108,
                m0362eestper110,
                m0362eepcuan111,
                m0362eepnif112,
                m0362eepnom113,
                m0362eepnif114,
                m0362eepnom115,
                m0362eepnif116,
                m0362eepnom117,
                m0362nnif125,
                m0362nrazon126,
                m0362nanagr127,
                m0362nsg130,
                m0362nvia131,
                m0362nnum132,
                m0362nesc133,
                m0362npiso134,
                m0362npuert135,
                m0362ntelef136,
                m0362ncpost137,
                m0362nmuni138,
                m0362nprov139,
                m0362ncodmuni,
                m0362nemail140,
                m0362nurl141,
                m0362nsg145,
                m0362nvia146,
                m0362nnum147,
                m0362nesc148,
                m0362npiso149,
                m0362npuer150,
                m0362ntelef151,
                m0362ncpost152,
                m0362nmuni153,
                m0362nprov154,
                m0362ncodmuni2,
                m0362ntipoep155,
                m0362nessucu160,
                m0362ndepnif165,
                m0362ndepnom166,
                m0362ndepest167,
                m0362lugar175,
                m0362dia176,
                m0362mes176,
                m0362anyo176,
                m0362cargo,
                m0362firma,
                m0362fecha176                
                };
            setColumns(array);
            FieldDef arrayf[] = {m0362dominio,m0362nif,m0362ejercicio,m0362periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod0363 extends TableDef
        {
        // campos
        public FieldDef m0363dominio;
        public FieldDef m0363nif;
        public FieldDef m0363ejercicio;
        public FieldDef m0363periodo;
        public FieldDef m0363listpag;
        public FieldDef m0363razon;
        public FieldDef m0363numjust;
        public FieldDef m0363asolnif200;
        public FieldDef m0363aentpre201;
        public FieldDef m0363aentpos202;
        public FieldDef m0363aregint203;
        public FieldDef m0363msolnif210;
        public FieldDef m0363msolnew211;
        public FieldDef m0363mdomifi212;
        public FieldDef m0363motrdat213;
        public FieldDef m0363mdattri214;
        public FieldDef m0363mactloc215;
        public FieldDef m0363motrexp216;
        public FieldDef m0363mintrac217;
        public FieldDef m0363mnewact218;
        public FieldDef m0363mcentre219;
        public FieldDef m0363mdativa220;
        public FieldDef m0363mdairpf221;
        public FieldDef m0363mdatiss222;
        public FieldDef m0363mdairnr223;
        public FieldDef m0363mimpesp224;
        public FieldDef m0363mdatsoc225;
        public FieldDef m0363mregesp226;
        public FieldDef m0363bcesact230;
        public FieldDef m0363bcausa231;
        public FieldDef m0363bfecha232;
        public FieldDef m0363docadjunta;
        public FieldDef m0363fechacrea;
        public TabMod0363(String name)
            {
            super(name);
            m0363dominio = new FieldDef("m0363dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m0363nif = new FieldDef("m0363nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m0363ejercicio = new FieldDef("m0363ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m0363periodo = new FieldDef("m0363periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m0363listpag = new FieldDef("m0363listpag",FieldDef.CHAR,1);
            m0363razon = new FieldDef("m0363razon",FieldDef.CHAR,125);
            m0363numjust = new FieldDef("m0363numjust",FieldDef.CHAR,13);
            m0363asolnif200 = new FieldDef("m0363asolnif200",FieldDef.CHAR,1);
            m0363aentpre201 = new FieldDef("m0363aentpre201",FieldDef.CHAR,1);
            m0363aentpos202 = new FieldDef("m0363aentpos202",FieldDef.CHAR,1);
            m0363aregint203 = new FieldDef("m0363aregint203",FieldDef.CHAR,1);
            m0363msolnif210 = new FieldDef("m0363msolnif210",FieldDef.CHAR,1);
            m0363msolnew211 = new FieldDef("m0363msolnew211",FieldDef.CHAR,1);
            m0363mdomifi212 = new FieldDef("m0363mdomifi212",FieldDef.CHAR,1);
            m0363motrdat213 = new FieldDef("m0363motrdat213",FieldDef.CHAR,1);
            m0363mdattri214 = new FieldDef("m0363mdattri214",FieldDef.CHAR,1);
            m0363mactloc215 = new FieldDef("m0363mactloc215",FieldDef.CHAR,1);
            m0363motrexp216 = new FieldDef("m0363motrexp216",FieldDef.CHAR,1);
            m0363mintrac217 = new FieldDef("m0363mintrac217",FieldDef.CHAR,1);
            m0363mnewact218 = new FieldDef("m0363mnewact218",FieldDef.CHAR,1);
            m0363mcentre219 = new FieldDef("m0363mcentre219",FieldDef.CHAR,1);
            m0363mdativa220 = new FieldDef("m0363mdativa220",FieldDef.CHAR,1);
            m0363mdairpf221 = new FieldDef("m0363mdairpf221",FieldDef.CHAR,1);
            m0363mdatiss222 = new FieldDef("m0363mdatiss222",FieldDef.CHAR,1);
            m0363mdairnr223 = new FieldDef("m0363mdairnr223",FieldDef.CHAR,1);
            m0363mimpesp224 = new FieldDef("m0363mimpesp224",FieldDef.CHAR,1);
            m0363mdatsoc225 = new FieldDef("m0363mdatsoc225",FieldDef.CHAR,1);
            m0363mregesp226 = new FieldDef("m0363mregesp226",FieldDef.CHAR,1);
            m0363bcesact230 = new FieldDef("m0363bcesact230",FieldDef.CHAR,1);
            m0363bcausa231 = new FieldDef("m0363bcausa231",FieldDef.CHAR,1);
            m0363bfecha232 = new FieldDef("m0363bfecha232",FieldDef.DATE);
            m0363docadjunta = new FieldDef("m0363docadjunta",FieldDef.CHAR,1);
            m0363fechacrea = new FieldDef("m0363fechacrea",FieldDef.DATE);
            FieldDef array[] = {
                m0363dominio,
                m0363nif,
                m0363ejercicio,
                m0363periodo,
                m0363listpag,
                m0363razon,
                m0363numjust,
                m0363asolnif200,
                m0363aentpre201,
                m0363aentpos202,
                m0363aregint203,
                m0363msolnif210,
                m0363msolnew211,
                m0363mdomifi212,
                m0363motrdat213,
                m0363mdattri214,
                m0363mactloc215,
                m0363motrexp216,
                m0363mintrac217,
                m0363mnewact218,
                m0363mcentre219,
                m0363mdativa220,
                m0363mdairpf221,
                m0363mdatiss222,
                m0363mdairnr223,
                m0363mimpesp224,
                m0363mdatsoc225,
                m0363mregesp226,
                m0363bcesact230,
                m0363bcausa231,
                m0363bfecha232,
                m0363docadjunta,
                m0363fechacrea                
                };
            setColumns(array);
            FieldDef arrayf[] = {m0363dominio,m0363nif,m0363ejercicio,m0363periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod0364 extends TableDef
        {
        // campos
        public FieldDef m0364dominio;
        public FieldDef m0364nif;
        public FieldDef m0364ejercicio;
        public FieldDef m0364periodo;
        public FieldDef m0364listpag;
        public FieldDef m0364nifrepr300;
        public FieldDef m0364nomrepr301;
        public FieldDef m0364residen302;
        public FieldDef m0364sg303;
        public FieldDef m0364via304;
        public FieldDef m0364num305;
        public FieldDef m0364esc306;
        public FieldDef m0364piso307;
        public FieldDef m0364puerta308;
        public FieldDef m0364telef309;
        public FieldDef m0364cpost310;
        public FieldDef m0364muni311;
        public FieldDef m0364prov312;
        public FieldDef m0364codmuni;
        public FieldDef m0364legal320;
        public FieldDef m0364incap321;
        public FieldDef m0364perjur322;
        public FieldDef m0364nresid323;
        public FieldDef m0364nrep324;
        public FieldDef m036423art325;
        public FieldDef m036432art326;
        public FieldDef m0364reqat327;
        public FieldDef m0364164art328;
        public FieldDef m0364volunt329;
        public FieldDef m0364podern330;
        public FieldDef m0364dprivac331;
        public FieldDef m0364dprivas332;
        public FieldDef m0364compare333;
        public FieldDef m0364dnormal334;
        public FieldDef m0364otr335;
        public FieldDef m0364decotr335;
        public FieldDef m0364cierdia340;
        public FieldDef m0364ciermes340;
        public FieldDef m0364ge341;
        public FieldDef m0364slnew342;
        public FieldDef m0364admpub343;
        public FieldDef m0364obliae344;
        public FieldDef m0364exeiae345;
        public FieldDef m0364letra34678;
        public FieldDef m0364norma349;
        public FieldDef m0364norma357;
        public TabMod0364(String name)
            {
            super(name);
            m0364dominio = new FieldDef("m0364dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m0364nif = new FieldDef("m0364nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m0364ejercicio = new FieldDef("m0364ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m0364periodo = new FieldDef("m0364periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m0364listpag = new FieldDef("m0364listpag",FieldDef.CHAR,1);
            m0364nifrepr300 = new FieldDef("m0364nifrepr300",FieldDef.CHAR,9);
            m0364nomrepr301 = new FieldDef("m0364nomrepr301",FieldDef.CHAR,125);
            m0364residen302 = new FieldDef("m0364residen302",FieldDef.CHAR,1);
            m0364sg303 = new FieldDef("m0364sg303",FieldDef.CHAR,17);
            m0364via304 = new FieldDef("m0364via304",FieldDef.CHAR,25);
            m0364num305 = new FieldDef("m0364num305",FieldDef.CHAR,5);
            m0364esc306 = new FieldDef("m0364esc306",FieldDef.CHAR,2);
            m0364piso307 = new FieldDef("m0364piso307",FieldDef.CHAR,2);
            m0364puerta308 = new FieldDef("m0364puerta308",FieldDef.CHAR,2);
            m0364telef309 = new FieldDef("m0364telef309",FieldDef.CHAR,9);
            m0364cpost310 = new FieldDef("m0364cpost310",FieldDef.CHAR,5);
            m0364muni311 = new FieldDef("m0364muni311",FieldDef.CHAR,25);
            m0364prov312 = new FieldDef("m0364prov312",FieldDef.CHAR,2);
            m0364codmuni = new FieldDef("m0364codmuni",FieldDef.CHAR,6);
            m0364legal320 = new FieldDef("m0364legal320",FieldDef.CHAR,1);
            m0364incap321 = new FieldDef("m0364incap321",FieldDef.CHAR,1);
            m0364perjur322 = new FieldDef("m0364perjur322",FieldDef.CHAR,1);
            m0364nresid323 = new FieldDef("m0364nresid323",FieldDef.CHAR,1);
            m0364nrep324 = new FieldDef("m0364nrep324",FieldDef.CHAR,1);
            m036423art325 = new FieldDef("m036423art325",FieldDef.CHAR,1);
            m036432art326 = new FieldDef("m036432art326",FieldDef.CHAR,1);
            m0364reqat327 = new FieldDef("m0364reqat327",FieldDef.CHAR,1);
            m0364164art328 = new FieldDef("m0364164art328",FieldDef.CHAR,1);
            m0364volunt329 = new FieldDef("m0364volunt329",FieldDef.CHAR,1);
            m0364podern330 = new FieldDef("m0364podern330",FieldDef.CHAR,1);
            m0364dprivac331 = new FieldDef("m0364dprivac331",FieldDef.CHAR,1);
            m0364dprivas332 = new FieldDef("m0364dprivas332",FieldDef.CHAR,1);
            m0364compare333 = new FieldDef("m0364compare333",FieldDef.CHAR,1);
            m0364dnormal334 = new FieldDef("m0364dnormal334",FieldDef.CHAR,1);
            m0364otr335 = new FieldDef("m0364otr335",FieldDef.CHAR,1);
            m0364decotr335 = new FieldDef("m0364decotr335",FieldDef.CHAR,60);
            m0364cierdia340 = new FieldDef("m0364cierdia340",FieldDef.CHAR,2);
            m0364ciermes340 = new FieldDef("m0364ciermes340",FieldDef.CHAR,2);
            m0364ge341 = new FieldDef("m0364ge341",FieldDef.CHAR,1);
            m0364slnew342 = new FieldDef("m0364slnew342",FieldDef.CHAR,1);
            m0364admpub343 = new FieldDef("m0364admpub343",FieldDef.CHAR,1);
            m0364obliae344 = new FieldDef("m0364obliae344",FieldDef.CHAR,1);
            m0364exeiae345 = new FieldDef("m0364exeiae345",FieldDef.CHAR,1);
            m0364letra34678 = new FieldDef("m0364letra34678",FieldDef.CHAR,1);
            m0364norma349 = new FieldDef("m0364norma349",FieldDef.CHAR,1);
            m0364norma357 = new FieldDef("m0364norma357",FieldDef.CHAR,1);
            FieldDef array[] = {
                m0364dominio,
                m0364nif,
                m0364ejercicio,
                m0364periodo,
                m0364listpag,
                m0364nifrepr300,
                m0364nomrepr301,
                m0364residen302,
                m0364sg303,
                m0364via304,
                m0364num305,
                m0364esc306,
                m0364piso307,
                m0364puerta308,
                m0364telef309,
                m0364cpost310,
                m0364muni311,
                m0364prov312,
                m0364codmuni,
                m0364legal320,
                m0364incap321,
                m0364perjur322,
                m0364nresid323,
                m0364nrep324,
                m036423art325,
                m036432art326,
                m0364reqat327,
                m0364164art328,
                m0364volunt329,
                m0364podern330,
                m0364dprivac331,
                m0364dprivas332,
                m0364compare333,
                m0364dnormal334,
                m0364otr335,
                m0364decotr335,
                m0364cierdia340,
                m0364ciermes340,
                m0364ge341,
                m0364slnew342,
                m0364admpub343,
                m0364obliae344,
                m0364exeiae345,
                m0364letra34678,
                m0364norma349,
                m0364norma357                
                };
            setColumns(array);
            FieldDef arrayf[] = {m0364dominio,m0364nif,m0364ejercicio,m0364periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod0365 extends TableDef
        {
        // campos
        public FieldDef m0365dominio;
        public FieldDef m0365nif;
        public FieldDef m0365ejercicio;
        public FieldDef m0365periodo;
        public FieldDef m0365contador;
        public FieldDef m0365listpag;
        public FieldDef m0365descact400;
        public FieldDef m0365iae402;
        public FieldDef m0365epigraf402;
        public FieldDef m0365codtip403;
        public FieldDef m0365alta405;
        public FieldDef m0365fecha406;
        public FieldDef m0365baja408;
        public FieldDef m0365fecha409;
        public FieldDef m0365nref410;
        public FieldDef m0365muni411;
        public FieldDef m0365prov4112;
        public FieldDef m0365cmuni4113;
        public FieldDef m0365refcat412;
        public FieldDef m0365sg413;
        public FieldDef m0365via414;
        public FieldDef m0365num415;
        public FieldDef m0365piso416;
        public FieldDef m0365puerta417;
        public FieldDef m0365cpost418;
        public FieldDef m0365muni419;
        public FieldDef m0365prov420;
        public FieldDef m0365cmuni;
        public FieldDef m0365superf422;
        public FieldDef m0365grafec423;
        public FieldDef m0365alta424;
        public FieldDef m0365fecha425;
        public FieldDef m0365baja427;
        public FieldDef m0365fecha428;
        public FieldDef m0365nrefer429;
        public FieldDef m0365variac430;
        public FieldDef m0365fecha431;
        public FieldDef m0365nrefer432;
        public FieldDef m0365refcat433;
        public FieldDef m0365sg434;
        public FieldDef m0365via435;
        public FieldDef m0365num436;
        public FieldDef m0365piso437;
        public FieldDef m0365puerta438;
        public FieldDef m0365cpost439;
        public FieldDef m0365muni440;
        public FieldDef m0365prov441;
        public FieldDef m0365cmuni442;
        public FieldDef m0365superf443;
        public FieldDef m0365grafec444;
        public FieldDef m0365alta445;
        public FieldDef m0365fecha446;
        public FieldDef m0365baja448;
        public FieldDef m0365fecha449;
        public FieldDef m0365nrefer450;
        public FieldDef m0365variac451;
        public FieldDef m0365fecha452;
        public FieldDef m0365nrefer453;
        public FieldDef m0365refcat454;
        public FieldDef m0365sg455;
        public FieldDef m0365via456;
        public FieldDef m0365num457;
        public FieldDef m0365piso458;
        public FieldDef m0365puerta459;
        public FieldDef m0365cpost460;
        public FieldDef m0365muni461;
        public FieldDef m0365prov462;
        public FieldDef m0365cmuni463;
        public FieldDef m0365superf464;
        public FieldDef m0365grafec465;
        public FieldDef m0365us466;
        public FieldDef m0365alta468;
        public FieldDef m0365fecha469;
        public FieldDef m0365baja471;
        public FieldDef m0365fecha472;
        public FieldDef m0365nrefer473;
        public FieldDef m0365variac474;
        public FieldDef m0365fecha475;
        public FieldDef m0365nrefer476;
        public FieldDef m0365refcat477;
        public FieldDef m0365sg478;
        public FieldDef m0365via479;
        public FieldDef m0365num480;
        public FieldDef m0365piso481;
        public FieldDef m0365puerta482;
        public FieldDef m0365cpost483;
        public FieldDef m0365muni484;
        public FieldDef m0365prov485;
        public FieldDef m0365cmuni486;
        public FieldDef m0365superf487;
        public FieldDef m0365grafec488;
        public FieldDef m0365uso489;
        public FieldDef m0365alta491;
        public FieldDef m0365fecha492;
        public FieldDef m0365baja494;
        public FieldDef m0365fecha495;
        public FieldDef m0365nrefer496;
        public FieldDef m0365variac497;
        public FieldDef m0365fecha498;
        public FieldDef m0365nrefer499;
        public TabMod0365(String name)
            {
            super(name);
            m0365dominio = new FieldDef("m0365dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m0365nif = new FieldDef("m0365nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m0365ejercicio = new FieldDef("m0365ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m0365periodo = new FieldDef("m0365periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m0365contador = new FieldDef("m0365contador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m0365listpag = new FieldDef("m0365listpag",FieldDef.CHAR,1);
            m0365descact400 = new FieldDef("m0365descact400",FieldDef.CHAR,60);
            m0365iae402 = new FieldDef("m0365iae402",FieldDef.CHAR,1);
            m0365epigraf402 = new FieldDef("m0365epigraf402",FieldDef.CHAR,4);
            m0365codtip403 = new FieldDef("m0365codtip403",FieldDef.CHAR,3);
            m0365alta405 = new FieldDef("m0365alta405",FieldDef.CHAR,1);
            m0365fecha406 = new FieldDef("m0365fecha406",FieldDef.DATE);
            m0365baja408 = new FieldDef("m0365baja408",FieldDef.CHAR,1);
            m0365fecha409 = new FieldDef("m0365fecha409",FieldDef.DATE);
            m0365nref410 = new FieldDef("m0365nref410",FieldDef.CHAR,13);
            m0365muni411 = new FieldDef("m0365muni411",FieldDef.CHAR,25);
            m0365prov4112 = new FieldDef("m0365prov4112",FieldDef.CHAR,2);
            m0365cmuni4113 = new FieldDef("m0365cmuni4113",FieldDef.CHAR,6);
            m0365refcat412 = new FieldDef("m0365refcat412",FieldDef.CHAR,20);
            m0365sg413 = new FieldDef("m0365sg413",FieldDef.CHAR,17);
            m0365via414 = new FieldDef("m0365via414",FieldDef.CHAR,25);
            m0365num415 = new FieldDef("m0365num415",FieldDef.CHAR,5);
            m0365piso416 = new FieldDef("m0365piso416",FieldDef.CHAR,2);
            m0365puerta417 = new FieldDef("m0365puerta417",FieldDef.CHAR,2);
            m0365cpost418 = new FieldDef("m0365cpost418",FieldDef.CHAR,5);
            m0365muni419 = new FieldDef("m0365muni419",FieldDef.CHAR,25);
            m0365prov420 = new FieldDef("m0365prov420",FieldDef.CHAR,2);
            m0365cmuni = new FieldDef("m0365cmuni",FieldDef.CHAR,6);
            m0365superf422 = new FieldDef("m0365superf422",FieldDef.CHAR,7);
            m0365grafec423 = new FieldDef("m0365grafec423",FieldDef.CHAR,3);
            m0365alta424 = new FieldDef("m0365alta424",FieldDef.CHAR,1);
            m0365fecha425 = new FieldDef("m0365fecha425",FieldDef.DATE);
            m0365baja427 = new FieldDef("m0365baja427",FieldDef.CHAR,1);
            m0365fecha428 = new FieldDef("m0365fecha428",FieldDef.DATE);
            m0365nrefer429 = new FieldDef("m0365nrefer429",FieldDef.CHAR,13);
            m0365variac430 = new FieldDef("m0365variac430",FieldDef.CHAR,1);
            m0365fecha431 = new FieldDef("m0365fecha431",FieldDef.DATE);
            m0365nrefer432 = new FieldDef("m0365nrefer432",FieldDef.CHAR,13);
            m0365refcat433 = new FieldDef("m0365refcat433",FieldDef.CHAR,20);
            m0365sg434 = new FieldDef("m0365sg434",FieldDef.CHAR,17);
            m0365via435 = new FieldDef("m0365via435",FieldDef.CHAR,25);
            m0365num436 = new FieldDef("m0365num436",FieldDef.CHAR,5);
            m0365piso437 = new FieldDef("m0365piso437",FieldDef.CHAR,2);
            m0365puerta438 = new FieldDef("m0365puerta438",FieldDef.CHAR,2);
            m0365cpost439 = new FieldDef("m0365cpost439",FieldDef.CHAR,5);
            m0365muni440 = new FieldDef("m0365muni440",FieldDef.CHAR,25);
            m0365prov441 = new FieldDef("m0365prov441",FieldDef.CHAR,2);
            m0365cmuni442 = new FieldDef("m0365cmuni442",FieldDef.CHAR,6);
            m0365superf443 = new FieldDef("m0365superf443",FieldDef.CHAR,7);
            m0365grafec444 = new FieldDef("m0365grafec444",FieldDef.CHAR,3);
            m0365alta445 = new FieldDef("m0365alta445",FieldDef.CHAR,1);
            m0365fecha446 = new FieldDef("m0365fecha446",FieldDef.DATE);
            m0365baja448 = new FieldDef("m0365baja448",FieldDef.CHAR,1);
            m0365fecha449 = new FieldDef("m0365fecha449",FieldDef.DATE);
            m0365nrefer450 = new FieldDef("m0365nrefer450",FieldDef.CHAR,13);
            m0365variac451 = new FieldDef("m0365variac451",FieldDef.CHAR,1);
            m0365fecha452 = new FieldDef("m0365fecha452",FieldDef.DATE);
            m0365nrefer453 = new FieldDef("m0365nrefer453",FieldDef.CHAR,13);
            m0365refcat454 = new FieldDef("m0365refcat454",FieldDef.CHAR,20);
            m0365sg455 = new FieldDef("m0365sg455",FieldDef.CHAR,17);
            m0365via456 = new FieldDef("m0365via456",FieldDef.CHAR,25);
            m0365num457 = new FieldDef("m0365num457",FieldDef.CHAR,5);
            m0365piso458 = new FieldDef("m0365piso458",FieldDef.CHAR,2);
            m0365puerta459 = new FieldDef("m0365puerta459",FieldDef.CHAR,2);
            m0365cpost460 = new FieldDef("m0365cpost460",FieldDef.CHAR,5);
            m0365muni461 = new FieldDef("m0365muni461",FieldDef.CHAR,25);
            m0365prov462 = new FieldDef("m0365prov462",FieldDef.CHAR,2);
            m0365cmuni463 = new FieldDef("m0365cmuni463",FieldDef.CHAR,6);
            m0365superf464 = new FieldDef("m0365superf464",FieldDef.CHAR,7);
            m0365grafec465 = new FieldDef("m0365grafec465",FieldDef.CHAR,3);
            m0365us466 = new FieldDef("m0365us466",FieldDef.CHAR,2);
            m0365alta468 = new FieldDef("m0365alta468",FieldDef.CHAR,1);
            m0365fecha469 = new FieldDef("m0365fecha469",FieldDef.DATE);
            m0365baja471 = new FieldDef("m0365baja471",FieldDef.CHAR,1);
            m0365fecha472 = new FieldDef("m0365fecha472",FieldDef.DATE);
            m0365nrefer473 = new FieldDef("m0365nrefer473",FieldDef.CHAR,13);
            m0365variac474 = new FieldDef("m0365variac474",FieldDef.CHAR,1);
            m0365fecha475 = new FieldDef("m0365fecha475",FieldDef.DATE);
            m0365nrefer476 = new FieldDef("m0365nrefer476",FieldDef.CHAR,13);
            m0365refcat477 = new FieldDef("m0365refcat477",FieldDef.CHAR,20);
            m0365sg478 = new FieldDef("m0365sg478",FieldDef.CHAR,17);
            m0365via479 = new FieldDef("m0365via479",FieldDef.CHAR,25);
            m0365num480 = new FieldDef("m0365num480",FieldDef.CHAR,5);
            m0365piso481 = new FieldDef("m0365piso481",FieldDef.CHAR,2);
            m0365puerta482 = new FieldDef("m0365puerta482",FieldDef.CHAR,2);
            m0365cpost483 = new FieldDef("m0365cpost483",FieldDef.CHAR,5);
            m0365muni484 = new FieldDef("m0365muni484",FieldDef.CHAR,25);
            m0365prov485 = new FieldDef("m0365prov485",FieldDef.CHAR,2);
            m0365cmuni486 = new FieldDef("m0365cmuni486",FieldDef.CHAR,6);
            m0365superf487 = new FieldDef("m0365superf487",FieldDef.CHAR,7);
            m0365grafec488 = new FieldDef("m0365grafec488",FieldDef.CHAR,3);
            m0365uso489 = new FieldDef("m0365uso489",FieldDef.CHAR,2);
            m0365alta491 = new FieldDef("m0365alta491",FieldDef.CHAR,1);
            m0365fecha492 = new FieldDef("m0365fecha492",FieldDef.DATE);
            m0365baja494 = new FieldDef("m0365baja494",FieldDef.CHAR,1);
            m0365fecha495 = new FieldDef("m0365fecha495",FieldDef.DATE);
            m0365nrefer496 = new FieldDef("m0365nrefer496",FieldDef.CHAR,13);
            m0365variac497 = new FieldDef("m0365variac497",FieldDef.CHAR,1);
            m0365fecha498 = new FieldDef("m0365fecha498",FieldDef.DATE);
            m0365nrefer499 = new FieldDef("m0365nrefer499",FieldDef.CHAR,13);
            FieldDef array[] = {
                m0365dominio,
                m0365nif,
                m0365ejercicio,
                m0365periodo,
                m0365contador,
                m0365listpag,
                m0365descact400,
                m0365iae402,
                m0365epigraf402,
                m0365codtip403,
                m0365alta405,
                m0365fecha406,
                m0365baja408,
                m0365fecha409,
                m0365nref410,
                m0365muni411,
                m0365prov4112,
                m0365cmuni4113,
                m0365refcat412,
                m0365sg413,
                m0365via414,
                m0365num415,
                m0365piso416,
                m0365puerta417,
                m0365cpost418,
                m0365muni419,
                m0365prov420,
                m0365cmuni,
                m0365superf422,
                m0365grafec423,
                m0365alta424,
                m0365fecha425,
                m0365baja427,
                m0365fecha428,
                m0365nrefer429,
                m0365variac430,
                m0365fecha431,
                m0365nrefer432,
                m0365refcat433,
                m0365sg434,
                m0365via435,
                m0365num436,
                m0365piso437,
                m0365puerta438,
                m0365cpost439,
                m0365muni440,
                m0365prov441,
                m0365cmuni442,
                m0365superf443,
                m0365grafec444,
                m0365alta445,
                m0365fecha446,
                m0365baja448,
                m0365fecha449,
                m0365nrefer450,
                m0365variac451,
                m0365fecha452,
                m0365nrefer453,
                m0365refcat454,
                m0365sg455,
                m0365via456,
                m0365num457,
                m0365piso458,
                m0365puerta459,
                m0365cpost460,
                m0365muni461,
                m0365prov462,
                m0365cmuni463,
                m0365superf464,
                m0365grafec465,
                m0365us466,
                m0365alta468,
                m0365fecha469,
                m0365baja471,
                m0365fecha472,
                m0365nrefer473,
                m0365variac474,
                m0365fecha475,
                m0365nrefer476,
                m0365refcat477,
                m0365sg478,
                m0365via479,
                m0365num480,
                m0365piso481,
                m0365puerta482,
                m0365cpost483,
                m0365muni484,
                m0365prov485,
                m0365cmuni486,
                m0365superf487,
                m0365grafec488,
                m0365uso489,
                m0365alta491,
                m0365fecha492,
                m0365baja494,
                m0365fecha495,
                m0365nrefer496,
                m0365variac497,
                m0365fecha498,
                m0365nrefer499                
                };
            setColumns(array);
            FieldDef arrayf[] = {m0365dominio,m0365nif,m0365ejercicio,m0365periodo,m0365contador };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod0366 extends TableDef
        {
        // campos
        public FieldDef m0366dominio;
        public FieldDef m0366nif;
        public FieldDef m0366ejercicio;
        public FieldDef m0366periodo;
        public FieldDef m0366contador;
        public FieldDef m0366listpag;
        public FieldDef m0366descact401;
        public FieldDef m0366iae402;
        public FieldDef m0366epigraf402;
        public FieldDef m0366codtip403;
        public FieldDef m0366alta405;
        public FieldDef m0366fecha406;
        public FieldDef m0366baja408;
        public FieldDef m0366fecha409;
        public FieldDef m0366nref410;
        public FieldDef m0366muni411;
        public FieldDef m0366prov4112;
        public FieldDef m0366cmuni4113;
        public FieldDef m0366refcat412;
        public FieldDef m0366sg413;
        public FieldDef m0366via414;
        public FieldDef m0366num415;
        public FieldDef m0366piso416;
        public FieldDef m0366puerta417;
        public FieldDef m0366cpost418;
        public FieldDef m0366muni419;
        public FieldDef m0366prov420;
        public FieldDef m0366cmuni;
        public FieldDef m0366superf422;
        public FieldDef m0366grafec423;
        public FieldDef m0366alta424;
        public FieldDef m0366fecha425;
        public FieldDef m0366baja427;
        public FieldDef m0366fecha428;
        public FieldDef m0366nrefer429;
        public FieldDef m0366variac430;
        public FieldDef m0366fecha431;
        public FieldDef m0366nrefer432;
        public FieldDef m0366refcat433;
        public FieldDef m0366sg434;
        public FieldDef m0366via435;
        public FieldDef m0366num436;
        public FieldDef m0366piso437;
        public FieldDef m0366puerta438;
        public FieldDef m0366cpost439;
        public FieldDef m0366muni440;
        public FieldDef m0366prov441;
        public FieldDef m0366cmuni442;
        public FieldDef m0366superf443;
        public FieldDef m0366grafec444;
        public FieldDef m0366alta445;
        public FieldDef m0366fecha446;
        public FieldDef m0366baja448;
        public FieldDef m0366fecha449;
        public FieldDef m0366nrefer450;
        public FieldDef m0366variac451;
        public FieldDef m0366fecha452;
        public FieldDef m0366nrefer453;
        public FieldDef m0366refcat454;
        public FieldDef m0366sg455;
        public FieldDef m0366via456;
        public FieldDef m0366num457;
        public FieldDef m0366piso458;
        public FieldDef m0366puerta459;
        public FieldDef m0366cpost460;
        public FieldDef m0366muni461;
        public FieldDef m0366prov462;
        public FieldDef m0366cmuni463;
        public FieldDef m0366superf464;
        public FieldDef m0366grafec465;
        public FieldDef m0366us466;
        public FieldDef m0366alta468;
        public FieldDef m0366fecha469;
        public FieldDef m0366baja471;
        public FieldDef m0366fecha472;
        public FieldDef m0366nrefer473;
        public FieldDef m0366variac474;
        public FieldDef m0366fecha475;
        public FieldDef m0366nrefer476;
        public FieldDef m0366refcat477;
        public FieldDef m0366sg478;
        public FieldDef m0366via479;
        public FieldDef m0366num480;
        public FieldDef m0366piso481;
        public FieldDef m0366puerta482;
        public FieldDef m0366cpost483;
        public FieldDef m0366muni484;
        public FieldDef m0366prov485;
        public FieldDef m0366cmuni486;
        public FieldDef m0366superf487;
        public FieldDef m0366grafec488;
        public FieldDef m0366uso489;
        public FieldDef m0366alta491;
        public FieldDef m0366fecha492;
        public FieldDef m0366baja494;
        public FieldDef m0366fecha495;
        public FieldDef m0366nrefer496;
        public FieldDef m0366variac497;
        public FieldDef m0366fecha498;
        public FieldDef m0366nrefer499;
        public TabMod0366(String name)
            {
            super(name);
            m0366dominio = new FieldDef("m0366dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m0366nif = new FieldDef("m0366nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m0366ejercicio = new FieldDef("m0366ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m0366periodo = new FieldDef("m0366periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m0366contador = new FieldDef("m0366contador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m0366listpag = new FieldDef("m0366listpag",FieldDef.CHAR,1);
            m0366descact401 = new FieldDef("m0366descact401",FieldDef.CHAR,60);
            m0366iae402 = new FieldDef("m0366iae402",FieldDef.CHAR,1);
            m0366epigraf402 = new FieldDef("m0366epigraf402",FieldDef.CHAR,4);
            m0366codtip403 = new FieldDef("m0366codtip403",FieldDef.CHAR,3);
            m0366alta405 = new FieldDef("m0366alta405",FieldDef.CHAR,1);
            m0366fecha406 = new FieldDef("m0366fecha406",FieldDef.DATE);
            m0366baja408 = new FieldDef("m0366baja408",FieldDef.CHAR,1);
            m0366fecha409 = new FieldDef("m0366fecha409",FieldDef.DATE);
            m0366nref410 = new FieldDef("m0366nref410",FieldDef.CHAR,13);
            m0366muni411 = new FieldDef("m0366muni411",FieldDef.CHAR,25);
            m0366prov4112 = new FieldDef("m0366prov4112",FieldDef.CHAR,2);
            m0366cmuni4113 = new FieldDef("m0366cmuni4113",FieldDef.CHAR,6);
            m0366refcat412 = new FieldDef("m0366refcat412",FieldDef.CHAR,20);
            m0366sg413 = new FieldDef("m0366sg413",FieldDef.CHAR,17);
            m0366via414 = new FieldDef("m0366via414",FieldDef.CHAR,25);
            m0366num415 = new FieldDef("m0366num415",FieldDef.CHAR,5);
            m0366piso416 = new FieldDef("m0366piso416",FieldDef.CHAR,2);
            m0366puerta417 = new FieldDef("m0366puerta417",FieldDef.CHAR,2);
            m0366cpost418 = new FieldDef("m0366cpost418",FieldDef.CHAR,5);
            m0366muni419 = new FieldDef("m0366muni419",FieldDef.CHAR,25);
            m0366prov420 = new FieldDef("m0366prov420",FieldDef.CHAR,2);
            m0366cmuni = new FieldDef("m0366cmuni",FieldDef.CHAR,6);
            m0366superf422 = new FieldDef("m0366superf422",FieldDef.CHAR,7);
            m0366grafec423 = new FieldDef("m0366grafec423",FieldDef.CHAR,3);
            m0366alta424 = new FieldDef("m0366alta424",FieldDef.CHAR,1);
            m0366fecha425 = new FieldDef("m0366fecha425",FieldDef.DATE);
            m0366baja427 = new FieldDef("m0366baja427",FieldDef.CHAR,1);
            m0366fecha428 = new FieldDef("m0366fecha428",FieldDef.DATE);
            m0366nrefer429 = new FieldDef("m0366nrefer429",FieldDef.CHAR,13);
            m0366variac430 = new FieldDef("m0366variac430",FieldDef.CHAR,1);
            m0366fecha431 = new FieldDef("m0366fecha431",FieldDef.DATE);
            m0366nrefer432 = new FieldDef("m0366nrefer432",FieldDef.CHAR,13);
            m0366refcat433 = new FieldDef("m0366refcat433",FieldDef.CHAR,20);
            m0366sg434 = new FieldDef("m0366sg434",FieldDef.CHAR,17);
            m0366via435 = new FieldDef("m0366via435",FieldDef.CHAR,25);
            m0366num436 = new FieldDef("m0366num436",FieldDef.CHAR,5);
            m0366piso437 = new FieldDef("m0366piso437",FieldDef.CHAR,2);
            m0366puerta438 = new FieldDef("m0366puerta438",FieldDef.CHAR,2);
            m0366cpost439 = new FieldDef("m0366cpost439",FieldDef.CHAR,5);
            m0366muni440 = new FieldDef("m0366muni440",FieldDef.CHAR,25);
            m0366prov441 = new FieldDef("m0366prov441",FieldDef.CHAR,2);
            m0366cmuni442 = new FieldDef("m0366cmuni442",FieldDef.CHAR,6);
            m0366superf443 = new FieldDef("m0366superf443",FieldDef.CHAR,7);
            m0366grafec444 = new FieldDef("m0366grafec444",FieldDef.CHAR,3);
            m0366alta445 = new FieldDef("m0366alta445",FieldDef.CHAR,1);
            m0366fecha446 = new FieldDef("m0366fecha446",FieldDef.DATE);
            m0366baja448 = new FieldDef("m0366baja448",FieldDef.CHAR,1);
            m0366fecha449 = new FieldDef("m0366fecha449",FieldDef.DATE);
            m0366nrefer450 = new FieldDef("m0366nrefer450",FieldDef.CHAR,13);
            m0366variac451 = new FieldDef("m0366variac451",FieldDef.CHAR,1);
            m0366fecha452 = new FieldDef("m0366fecha452",FieldDef.DATE);
            m0366nrefer453 = new FieldDef("m0366nrefer453",FieldDef.CHAR,13);
            m0366refcat454 = new FieldDef("m0366refcat454",FieldDef.CHAR,20);
            m0366sg455 = new FieldDef("m0366sg455",FieldDef.CHAR,17);
            m0366via456 = new FieldDef("m0366via456",FieldDef.CHAR,25);
            m0366num457 = new FieldDef("m0366num457",FieldDef.CHAR,5);
            m0366piso458 = new FieldDef("m0366piso458",FieldDef.CHAR,2);
            m0366puerta459 = new FieldDef("m0366puerta459",FieldDef.CHAR,2);
            m0366cpost460 = new FieldDef("m0366cpost460",FieldDef.CHAR,5);
            m0366muni461 = new FieldDef("m0366muni461",FieldDef.CHAR,25);
            m0366prov462 = new FieldDef("m0366prov462",FieldDef.CHAR,2);
            m0366cmuni463 = new FieldDef("m0366cmuni463",FieldDef.CHAR,6);
            m0366superf464 = new FieldDef("m0366superf464",FieldDef.CHAR,7);
            m0366grafec465 = new FieldDef("m0366grafec465",FieldDef.CHAR,3);
            m0366us466 = new FieldDef("m0366us466",FieldDef.CHAR,2);
            m0366alta468 = new FieldDef("m0366alta468",FieldDef.CHAR,1);
            m0366fecha469 = new FieldDef("m0366fecha469",FieldDef.DATE);
            m0366baja471 = new FieldDef("m0366baja471",FieldDef.CHAR,1);
            m0366fecha472 = new FieldDef("m0366fecha472",FieldDef.DATE);
            m0366nrefer473 = new FieldDef("m0366nrefer473",FieldDef.CHAR,13);
            m0366variac474 = new FieldDef("m0366variac474",FieldDef.CHAR,1);
            m0366fecha475 = new FieldDef("m0366fecha475",FieldDef.DATE);
            m0366nrefer476 = new FieldDef("m0366nrefer476",FieldDef.CHAR,13);
            m0366refcat477 = new FieldDef("m0366refcat477",FieldDef.CHAR,20);
            m0366sg478 = new FieldDef("m0366sg478",FieldDef.CHAR,17);
            m0366via479 = new FieldDef("m0366via479",FieldDef.CHAR,25);
            m0366num480 = new FieldDef("m0366num480",FieldDef.CHAR,5);
            m0366piso481 = new FieldDef("m0366piso481",FieldDef.CHAR,2);
            m0366puerta482 = new FieldDef("m0366puerta482",FieldDef.CHAR,2);
            m0366cpost483 = new FieldDef("m0366cpost483",FieldDef.CHAR,5);
            m0366muni484 = new FieldDef("m0366muni484",FieldDef.CHAR,25);
            m0366prov485 = new FieldDef("m0366prov485",FieldDef.CHAR,2);
            m0366cmuni486 = new FieldDef("m0366cmuni486",FieldDef.CHAR,6);
            m0366superf487 = new FieldDef("m0366superf487",FieldDef.CHAR,7);
            m0366grafec488 = new FieldDef("m0366grafec488",FieldDef.CHAR,3);
            m0366uso489 = new FieldDef("m0366uso489",FieldDef.CHAR,2);
            m0366alta491 = new FieldDef("m0366alta491",FieldDef.CHAR,1);
            m0366fecha492 = new FieldDef("m0366fecha492",FieldDef.DATE);
            m0366baja494 = new FieldDef("m0366baja494",FieldDef.CHAR,1);
            m0366fecha495 = new FieldDef("m0366fecha495",FieldDef.DATE);
            m0366nrefer496 = new FieldDef("m0366nrefer496",FieldDef.CHAR,13);
            m0366variac497 = new FieldDef("m0366variac497",FieldDef.CHAR,1);
            m0366fecha498 = new FieldDef("m0366fecha498",FieldDef.DATE);
            m0366nrefer499 = new FieldDef("m0366nrefer499",FieldDef.CHAR,13);
            FieldDef array[] = {
                m0366dominio,
                m0366nif,
                m0366ejercicio,
                m0366periodo,
                m0366contador,
                m0366listpag,
                m0366descact401,
                m0366iae402,
                m0366epigraf402,
                m0366codtip403,
                m0366alta405,
                m0366fecha406,
                m0366baja408,
                m0366fecha409,
                m0366nref410,
                m0366muni411,
                m0366prov4112,
                m0366cmuni4113,
                m0366refcat412,
                m0366sg413,
                m0366via414,
                m0366num415,
                m0366piso416,
                m0366puerta417,
                m0366cpost418,
                m0366muni419,
                m0366prov420,
                m0366cmuni,
                m0366superf422,
                m0366grafec423,
                m0366alta424,
                m0366fecha425,
                m0366baja427,
                m0366fecha428,
                m0366nrefer429,
                m0366variac430,
                m0366fecha431,
                m0366nrefer432,
                m0366refcat433,
                m0366sg434,
                m0366via435,
                m0366num436,
                m0366piso437,
                m0366puerta438,
                m0366cpost439,
                m0366muni440,
                m0366prov441,
                m0366cmuni442,
                m0366superf443,
                m0366grafec444,
                m0366alta445,
                m0366fecha446,
                m0366baja448,
                m0366fecha449,
                m0366nrefer450,
                m0366variac451,
                m0366fecha452,
                m0366nrefer453,
                m0366refcat454,
                m0366sg455,
                m0366via456,
                m0366num457,
                m0366piso458,
                m0366puerta459,
                m0366cpost460,
                m0366muni461,
                m0366prov462,
                m0366cmuni463,
                m0366superf464,
                m0366grafec465,
                m0366us466,
                m0366alta468,
                m0366fecha469,
                m0366baja471,
                m0366fecha472,
                m0366nrefer473,
                m0366variac474,
                m0366fecha475,
                m0366nrefer476,
                m0366refcat477,
                m0366sg478,
                m0366via479,
                m0366num480,
                m0366piso481,
                m0366puerta482,
                m0366cpost483,
                m0366muni484,
                m0366prov485,
                m0366cmuni486,
                m0366superf487,
                m0366grafec488,
                m0366uso489,
                m0366alta491,
                m0366fecha492,
                m0366baja494,
                m0366fecha495,
                m0366nrefer496,
                m0366variac497,
                m0366fecha498,
                m0366nrefer499                
                };
            setColumns(array);
            FieldDef arrayf[] = {m0366dominio,m0366nif,m0366ejercicio,m0366periodo,m0366contador };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod0367 extends TableDef
        {
        // campos
        public FieldDef m0367dominio;
        public FieldDef m0367nif;
        public FieldDef m0367ejercicio;
        public FieldDef m0367periodo;
        public FieldDef m0367listpag;
        public FieldDef m0367terri500;
        public FieldDef m0367exclope501;
        public FieldDef m0367regimen510;
        public FieldDef m0367secciae511;
        public FieldDef m0367secciae512;
        public FieldDef m0367secciae513;
        public FieldDef m0367regimen514;
        public FieldDef m0367secciae515;
        public FieldDef m0367secciae516;
        public FieldDef m0367secciae517;
        public FieldDef m0367regimen518;
        public FieldDef m0367secciae519;
        public FieldDef m0367secciae520;
        public FieldDef m0367secciae521;
        public FieldDef m0367regimen522;
        public FieldDef m0367secciae523;
        public FieldDef m0367secciae524;
        public FieldDef m0367secciae525;
        public FieldDef m0367regimen526;
        public FieldDef m0367secciae527;
        public FieldDef m0367secciae528;
        public FieldDef m0367secciae529;
        public FieldDef m0367regimen530;
        public FieldDef m0367secciae531;
        public FieldDef m0367secciae532;
        public FieldDef m0367secciae533;
        public FieldDef m0367regimen534;
        public FieldDef m0367secciae535;
        public FieldDef m0367secciae536;
        public FieldDef m0367secciae537;
        public FieldDef m0367regimen538;
        public FieldDef m0367secciae539;
        public FieldDef m0367secciae540;
        public FieldDef m0367secciae541;
        public FieldDef m0367regimen542;
        public FieldDef m0367secciae543;
        public FieldDef m0367secciae544;
        public FieldDef m0367secciae545;
        public FieldDef m0367regimen546;
        public FieldDef m0367secciae547;
        public FieldDef m0367secciae548;
        public FieldDef m0367secciae549;
        public FieldDef m0367regimen550;
        public FieldDef m0367secciae551;
        public FieldDef m0367secciae552;
        public FieldDef m0367secciae553;
        public FieldDef m0367regimen554;
        public FieldDef m0367secciae555;
        public FieldDef m0367secciae556;
        public FieldDef m0367secciae557;
        public FieldDef m0367regimen558;
        public FieldDef m0367secciae559;
        public FieldDef m0367secciae560;
        public FieldDef m0367secciae561;
        public FieldDef m0367regimen562;
        public FieldDef m0367secciae563;
        public FieldDef m0367secciae564;
        public FieldDef m0367secciae565;
        public FieldDef m0367regimen566;
        public FieldDef m0367secciae567;
        public FieldDef m0367secciae568;
        public FieldDef m0367secciae569;
        public FieldDef m0367regimen570;
        public FieldDef m0367secciae571;
        public FieldDef m0367secciae572;
        public FieldDef m0367secciae573;
        public FieldDef m0367regimen574;
        public FieldDef m0367secciae575;
        public FieldDef m0367secciae576;
        public FieldDef m0367secciae577;
        public FieldDef m0367export579;
        public FieldDef m0367efecha581;
        public FieldDef m0367operad584;
        public FieldDef m0367ofecha586;
        public FieldDef m0367porcen586;
        public FieldDef m0367secdif587;
        public FieldDef m0367icnae588;
        public FieldDef m0367icnae589;
        public FieldDef m0367icnae590;
        public FieldDef m0367prorr591;
        public FieldDef m0367icnae592;
        public FieldDef m0367icnae593;
        public FieldDef m0367icnae594;
        public FieldDef m0367prorr595;
        public FieldDef m0367icnae596;
        public FieldDef m0367icnae597;
        public FieldDef m0367icnae598;
        public FieldDef m0367prorr599;
        public TabMod0367(String name)
            {
            super(name);
            m0367dominio = new FieldDef("m0367dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m0367nif = new FieldDef("m0367nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m0367ejercicio = new FieldDef("m0367ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m0367periodo = new FieldDef("m0367periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m0367listpag = new FieldDef("m0367listpag",FieldDef.CHAR,1);
            m0367terri500 = new FieldDef("m0367terri500",FieldDef.CHAR,1);
            m0367exclope501 = new FieldDef("m0367exclope501",FieldDef.CHAR,1);
            m0367regimen510 = new FieldDef("m0367regimen510",FieldDef.CHAR,1);
            m0367secciae511 = new FieldDef("m0367secciae511",FieldDef.CHAR,6);
            m0367secciae512 = new FieldDef("m0367secciae512",FieldDef.CHAR,6);
            m0367secciae513 = new FieldDef("m0367secciae513",FieldDef.CHAR,6);
            m0367regimen514 = new FieldDef("m0367regimen514",FieldDef.CHAR,1);
            m0367secciae515 = new FieldDef("m0367secciae515",FieldDef.CHAR,6);
            m0367secciae516 = new FieldDef("m0367secciae516",FieldDef.CHAR,6);
            m0367secciae517 = new FieldDef("m0367secciae517",FieldDef.CHAR,6);
            m0367regimen518 = new FieldDef("m0367regimen518",FieldDef.CHAR,1);
            m0367secciae519 = new FieldDef("m0367secciae519",FieldDef.CHAR,6);
            m0367secciae520 = new FieldDef("m0367secciae520",FieldDef.CHAR,6);
            m0367secciae521 = new FieldDef("m0367secciae521",FieldDef.CHAR,6);
            m0367regimen522 = new FieldDef("m0367regimen522",FieldDef.CHAR,1);
            m0367secciae523 = new FieldDef("m0367secciae523",FieldDef.CHAR,6);
            m0367secciae524 = new FieldDef("m0367secciae524",FieldDef.CHAR,6);
            m0367secciae525 = new FieldDef("m0367secciae525",FieldDef.CHAR,6);
            m0367regimen526 = new FieldDef("m0367regimen526",FieldDef.CHAR,1);
            m0367secciae527 = new FieldDef("m0367secciae527",FieldDef.CHAR,6);
            m0367secciae528 = new FieldDef("m0367secciae528",FieldDef.CHAR,6);
            m0367secciae529 = new FieldDef("m0367secciae529",FieldDef.CHAR,6);
            m0367regimen530 = new FieldDef("m0367regimen530",FieldDef.CHAR,1);
            m0367secciae531 = new FieldDef("m0367secciae531",FieldDef.CHAR,6);
            m0367secciae532 = new FieldDef("m0367secciae532",FieldDef.CHAR,6);
            m0367secciae533 = new FieldDef("m0367secciae533",FieldDef.CHAR,6);
            m0367regimen534 = new FieldDef("m0367regimen534",FieldDef.CHAR,1);
            m0367secciae535 = new FieldDef("m0367secciae535",FieldDef.CHAR,6);
            m0367secciae536 = new FieldDef("m0367secciae536",FieldDef.CHAR,6);
            m0367secciae537 = new FieldDef("m0367secciae537",FieldDef.CHAR,6);
            m0367regimen538 = new FieldDef("m0367regimen538",FieldDef.CHAR,1);
            m0367secciae539 = new FieldDef("m0367secciae539",FieldDef.CHAR,6);
            m0367secciae540 = new FieldDef("m0367secciae540",FieldDef.CHAR,6);
            m0367secciae541 = new FieldDef("m0367secciae541",FieldDef.CHAR,6);
            m0367regimen542 = new FieldDef("m0367regimen542",FieldDef.CHAR,1);
            m0367secciae543 = new FieldDef("m0367secciae543",FieldDef.CHAR,6);
            m0367secciae544 = new FieldDef("m0367secciae544",FieldDef.CHAR,6);
            m0367secciae545 = new FieldDef("m0367secciae545",FieldDef.CHAR,6);
            m0367regimen546 = new FieldDef("m0367regimen546",FieldDef.CHAR,1);
            m0367secciae547 = new FieldDef("m0367secciae547",FieldDef.CHAR,6);
            m0367secciae548 = new FieldDef("m0367secciae548",FieldDef.CHAR,6);
            m0367secciae549 = new FieldDef("m0367secciae549",FieldDef.CHAR,6);
            m0367regimen550 = new FieldDef("m0367regimen550",FieldDef.CHAR,1);
            m0367secciae551 = new FieldDef("m0367secciae551",FieldDef.CHAR,6);
            m0367secciae552 = new FieldDef("m0367secciae552",FieldDef.CHAR,6);
            m0367secciae553 = new FieldDef("m0367secciae553",FieldDef.CHAR,6);
            m0367regimen554 = new FieldDef("m0367regimen554",FieldDef.CHAR,1);
            m0367secciae555 = new FieldDef("m0367secciae555",FieldDef.CHAR,6);
            m0367secciae556 = new FieldDef("m0367secciae556",FieldDef.CHAR,6);
            m0367secciae557 = new FieldDef("m0367secciae557",FieldDef.CHAR,6);
            m0367regimen558 = new FieldDef("m0367regimen558",FieldDef.CHAR,1);
            m0367secciae559 = new FieldDef("m0367secciae559",FieldDef.CHAR,6);
            m0367secciae560 = new FieldDef("m0367secciae560",FieldDef.CHAR,6);
            m0367secciae561 = new FieldDef("m0367secciae561",FieldDef.CHAR,6);
            m0367regimen562 = new FieldDef("m0367regimen562",FieldDef.CHAR,1);
            m0367secciae563 = new FieldDef("m0367secciae563",FieldDef.CHAR,6);
            m0367secciae564 = new FieldDef("m0367secciae564",FieldDef.CHAR,6);
            m0367secciae565 = new FieldDef("m0367secciae565",FieldDef.CHAR,6);
            m0367regimen566 = new FieldDef("m0367regimen566",FieldDef.CHAR,1);
            m0367secciae567 = new FieldDef("m0367secciae567",FieldDef.CHAR,6);
            m0367secciae568 = new FieldDef("m0367secciae568",FieldDef.CHAR,6);
            m0367secciae569 = new FieldDef("m0367secciae569",FieldDef.CHAR,6);
            m0367regimen570 = new FieldDef("m0367regimen570",FieldDef.CHAR,1);
            m0367secciae571 = new FieldDef("m0367secciae571",FieldDef.CHAR,6);
            m0367secciae572 = new FieldDef("m0367secciae572",FieldDef.CHAR,6);
            m0367secciae573 = new FieldDef("m0367secciae573",FieldDef.CHAR,6);
            m0367regimen574 = new FieldDef("m0367regimen574",FieldDef.CHAR,1);
            m0367secciae575 = new FieldDef("m0367secciae575",FieldDef.CHAR,6);
            m0367secciae576 = new FieldDef("m0367secciae576",FieldDef.CHAR,6);
            m0367secciae577 = new FieldDef("m0367secciae577",FieldDef.CHAR,6);
            m0367export579 = new FieldDef("m0367export579",FieldDef.CHAR,1);
            m0367efecha581 = new FieldDef("m0367efecha581",FieldDef.DATE);
            m0367operad584 = new FieldDef("m0367operad584",FieldDef.CHAR,1);
            m0367ofecha586 = new FieldDef("m0367ofecha586",FieldDef.DATE);
            m0367porcen586 = new FieldDef("m0367porcen586",FieldDef.FLOAT,6,0);
            m0367secdif587 = new FieldDef("m0367secdif587",FieldDef.CHAR,1);
            m0367icnae588 = new FieldDef("m0367icnae588",FieldDef.CHAR,3);
            m0367icnae589 = new FieldDef("m0367icnae589",FieldDef.CHAR,3);
            m0367icnae590 = new FieldDef("m0367icnae590",FieldDef.CHAR,3);
            m0367prorr591 = new FieldDef("m0367prorr591",FieldDef.CHAR,1);
            m0367icnae592 = new FieldDef("m0367icnae592",FieldDef.CHAR,3);
            m0367icnae593 = new FieldDef("m0367icnae593",FieldDef.CHAR,3);
            m0367icnae594 = new FieldDef("m0367icnae594",FieldDef.CHAR,3);
            m0367prorr595 = new FieldDef("m0367prorr595",FieldDef.CHAR,1);
            m0367icnae596 = new FieldDef("m0367icnae596",FieldDef.CHAR,3);
            m0367icnae597 = new FieldDef("m0367icnae597",FieldDef.CHAR,3);
            m0367icnae598 = new FieldDef("m0367icnae598",FieldDef.CHAR,3);
            m0367prorr599 = new FieldDef("m0367prorr599",FieldDef.CHAR,1);
            FieldDef array[] = {
                m0367dominio,
                m0367nif,
                m0367ejercicio,
                m0367periodo,
                m0367listpag,
                m0367terri500,
                m0367exclope501,
                m0367regimen510,
                m0367secciae511,
                m0367secciae512,
                m0367secciae513,
                m0367regimen514,
                m0367secciae515,
                m0367secciae516,
                m0367secciae517,
                m0367regimen518,
                m0367secciae519,
                m0367secciae520,
                m0367secciae521,
                m0367regimen522,
                m0367secciae523,
                m0367secciae524,
                m0367secciae525,
                m0367regimen526,
                m0367secciae527,
                m0367secciae528,
                m0367secciae529,
                m0367regimen530,
                m0367secciae531,
                m0367secciae532,
                m0367secciae533,
                m0367regimen534,
                m0367secciae535,
                m0367secciae536,
                m0367secciae537,
                m0367regimen538,
                m0367secciae539,
                m0367secciae540,
                m0367secciae541,
                m0367regimen542,
                m0367secciae543,
                m0367secciae544,
                m0367secciae545,
                m0367regimen546,
                m0367secciae547,
                m0367secciae548,
                m0367secciae549,
                m0367regimen550,
                m0367secciae551,
                m0367secciae552,
                m0367secciae553,
                m0367regimen554,
                m0367secciae555,
                m0367secciae556,
                m0367secciae557,
                m0367regimen558,
                m0367secciae559,
                m0367secciae560,
                m0367secciae561,
                m0367regimen562,
                m0367secciae563,
                m0367secciae564,
                m0367secciae565,
                m0367regimen566,
                m0367secciae567,
                m0367secciae568,
                m0367secciae569,
                m0367regimen570,
                m0367secciae571,
                m0367secciae572,
                m0367secciae573,
                m0367regimen574,
                m0367secciae575,
                m0367secciae576,
                m0367secciae577,
                m0367export579,
                m0367efecha581,
                m0367operad584,
                m0367ofecha586,
                m0367porcen586,
                m0367secdif587,
                m0367icnae588,
                m0367icnae589,
                m0367icnae590,
                m0367prorr591,
                m0367icnae592,
                m0367icnae593,
                m0367icnae594,
                m0367prorr595,
                m0367icnae596,
                m0367icnae597,
                m0367icnae598,
                m0367prorr599                
                };
            setColumns(array);
            FieldDef arrayf[] = {m0367dominio,m0367nif,m0367ejercicio,m0367periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod0368 extends TableDef
        {
        // campos
        public FieldDef m0368dominio;
        public FieldDef m0368nif;
        public FieldDef m0368ejercicio;
        public FieldDef m0368periodo;
        public FieldDef m0368listpag;
        public FieldDef m0368pagfr600;
        public FieldDef m0368pagfrat601;
        public FieldDef m0368nif602;
        public FieldDef m0368nom603;
        public FieldDef m0368eo604;
        public FieldDef m0368eornc605;
        public FieldDef m0368eornv606;
        public FieldDef m0368eoexc607;
        public FieldDef m0368ed608;
        public FieldDef m0368es609;
        public FieldDef m0368esrnc610;
        public FieldDef m0368esrnv611;
        public FieldDef m0368esexc612;
        public FieldDef m03681secc613;
        public FieldDef m03681grup613;
        public FieldDef m03681tipo613;
        public FieldDef m03682secc613;
        public FieldDef m03682grup613;
        public FieldDef m03682tipo613;
        public FieldDef m03683secc613;
        public FieldDef m03683grup613;
        public FieldDef m03683tipo613;
        public FieldDef m03684secc613;
        public FieldDef m03684grup613;
        public FieldDef m03684tipo613;
        public FieldDef m03681secc614;
        public FieldDef m03681grup614;
        public FieldDef m03681tipo614;
        public FieldDef m03682secc614;
        public FieldDef m03682grup614;
        public FieldDef m03682tipo614;
        public FieldDef m03683secc614;
        public FieldDef m03683grup614;
        public FieldDef m03683tipo614;
        public FieldDef m03684secc614;
        public FieldDef m03684grup614;
        public FieldDef m03684tipo614;
        public FieldDef m0368iss620;
        public FieldDef m0368fecha620;
        public FieldDef m0368pagfr621;
        public FieldDef m0368exent622;
        public FieldDef m0368extot623;
        public FieldDef m0368expar624;
        public FieldDef m0368expar625;
        public FieldDef m0368esren626;
        public FieldDef m0368corun627;
        public FieldDef m0368reggen630;
        public FieldDef m0368irnr631;
        public FieldDef m0368irnr632;
        public FieldDef m0368irnr633;
        public FieldDef m0368irnr634;
        public FieldDef m0368irnrfecha;
        public FieldDef m0368irnr635;
        public TabMod0368(String name)
            {
            super(name);
            m0368dominio = new FieldDef("m0368dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m0368nif = new FieldDef("m0368nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m0368ejercicio = new FieldDef("m0368ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m0368periodo = new FieldDef("m0368periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m0368listpag = new FieldDef("m0368listpag",FieldDef.CHAR,1);
            m0368pagfr600 = new FieldDef("m0368pagfr600",FieldDef.CHAR,1);
            m0368pagfrat601 = new FieldDef("m0368pagfrat601",FieldDef.CHAR,1);
            m0368nif602 = new FieldDef("m0368nif602",FieldDef.CHAR,9);
            m0368nom603 = new FieldDef("m0368nom603",FieldDef.CHAR,40);
            m0368eo604 = new FieldDef("m0368eo604",FieldDef.CHAR,1);
            m0368eornc605 = new FieldDef("m0368eornc605",FieldDef.CHAR,1);
            m0368eornv606 = new FieldDef("m0368eornv606",FieldDef.CHAR,1);
            m0368eoexc607 = new FieldDef("m0368eoexc607",FieldDef.CHAR,1);
            m0368ed608 = new FieldDef("m0368ed608",FieldDef.CHAR,1);
            m0368es609 = new FieldDef("m0368es609",FieldDef.CHAR,1);
            m0368esrnc610 = new FieldDef("m0368esrnc610",FieldDef.CHAR,1);
            m0368esrnv611 = new FieldDef("m0368esrnv611",FieldDef.CHAR,1);
            m0368esexc612 = new FieldDef("m0368esexc612",FieldDef.CHAR,1);
            m03681secc613 = new FieldDef("m03681secc613",FieldDef.CHAR,1);
            m03681grup613 = new FieldDef("m03681grup613",FieldDef.CHAR,4);
            m03681tipo613 = new FieldDef("m03681tipo613",FieldDef.CHAR,3);
            m03682secc613 = new FieldDef("m03682secc613",FieldDef.CHAR,1);
            m03682grup613 = new FieldDef("m03682grup613",FieldDef.CHAR,4);
            m03682tipo613 = new FieldDef("m03682tipo613",FieldDef.CHAR,3);
            m03683secc613 = new FieldDef("m03683secc613",FieldDef.CHAR,1);
            m03683grup613 = new FieldDef("m03683grup613",FieldDef.CHAR,4);
            m03683tipo613 = new FieldDef("m03683tipo613",FieldDef.CHAR,3);
            m03684secc613 = new FieldDef("m03684secc613",FieldDef.CHAR,1);
            m03684grup613 = new FieldDef("m03684grup613",FieldDef.CHAR,4);
            m03684tipo613 = new FieldDef("m03684tipo613",FieldDef.CHAR,3);
            m03681secc614 = new FieldDef("m03681secc614",FieldDef.CHAR,1);
            m03681grup614 = new FieldDef("m03681grup614",FieldDef.CHAR,4);
            m03681tipo614 = new FieldDef("m03681tipo614",FieldDef.CHAR,3);
            m03682secc614 = new FieldDef("m03682secc614",FieldDef.CHAR,1);
            m03682grup614 = new FieldDef("m03682grup614",FieldDef.CHAR,4);
            m03682tipo614 = new FieldDef("m03682tipo614",FieldDef.CHAR,3);
            m03683secc614 = new FieldDef("m03683secc614",FieldDef.CHAR,1);
            m03683grup614 = new FieldDef("m03683grup614",FieldDef.CHAR,4);
            m03683tipo614 = new FieldDef("m03683tipo614",FieldDef.CHAR,3);
            m03684secc614 = new FieldDef("m03684secc614",FieldDef.CHAR,1);
            m03684grup614 = new FieldDef("m03684grup614",FieldDef.CHAR,4);
            m03684tipo614 = new FieldDef("m03684tipo614",FieldDef.CHAR,3);
            m0368iss620 = new FieldDef("m0368iss620",FieldDef.CHAR,1);
            m0368fecha620 = new FieldDef("m0368fecha620",FieldDef.DATE);
            m0368pagfr621 = new FieldDef("m0368pagfr621",FieldDef.CHAR,1);
            m0368exent622 = new FieldDef("m0368exent622",FieldDef.CHAR,1);
            m0368extot623 = new FieldDef("m0368extot623",FieldDef.CHAR,1);
            m0368expar624 = new FieldDef("m0368expar624",FieldDef.CHAR,1);
            m0368expar625 = new FieldDef("m0368expar625",FieldDef.CHAR,1);
            m0368esren626 = new FieldDef("m0368esren626",FieldDef.CHAR,1);
            m0368corun627 = new FieldDef("m0368corun627",FieldDef.CHAR,1);
            m0368reggen630 = new FieldDef("m0368reggen630",FieldDef.CHAR,1);
            m0368irnr631 = new FieldDef("m0368irnr631",FieldDef.CHAR,1);
            m0368irnr632 = new FieldDef("m0368irnr632",FieldDef.CHAR,1);
            m0368irnr633 = new FieldDef("m0368irnr633",FieldDef.CHAR,1);
            m0368irnr634 = new FieldDef("m0368irnr634",FieldDef.CHAR,1);
            m0368irnrfecha = new FieldDef("m0368irnrfecha",FieldDef.DATE);
            m0368irnr635 = new FieldDef("m0368irnr635",FieldDef.CHAR,1);
            FieldDef array[] = {
                m0368dominio,
                m0368nif,
                m0368ejercicio,
                m0368periodo,
                m0368listpag,
                m0368pagfr600,
                m0368pagfrat601,
                m0368nif602,
                m0368nom603,
                m0368eo604,
                m0368eornc605,
                m0368eornv606,
                m0368eoexc607,
                m0368ed608,
                m0368es609,
                m0368esrnc610,
                m0368esrnv611,
                m0368esexc612,
                m03681secc613,
                m03681grup613,
                m03681tipo613,
                m03682secc613,
                m03682grup613,
                m03682tipo613,
                m03683secc613,
                m03683grup613,
                m03683tipo613,
                m03684secc613,
                m03684grup613,
                m03684tipo613,
                m03681secc614,
                m03681grup614,
                m03681tipo614,
                m03682secc614,
                m03682grup614,
                m03682tipo614,
                m03683secc614,
                m03683grup614,
                m03683tipo614,
                m03684secc614,
                m03684grup614,
                m03684tipo614,
                m0368iss620,
                m0368fecha620,
                m0368pagfr621,
                m0368exent622,
                m0368extot623,
                m0368expar624,
                m0368expar625,
                m0368esren626,
                m0368corun627,
                m0368reggen630,
                m0368irnr631,
                m0368irnr632,
                m0368irnr633,
                m0368irnr634,
                m0368irnrfecha,
                m0368irnr635                
                };
            setColumns(array);
            FieldDef arrayf[] = {m0368dominio,m0368nif,m0368ejercicio,m0368periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod0369 extends TableDef
        {
        // campos
        public FieldDef m0369dominio;
        public FieldDef m0369nif;
        public FieldDef m0369ejercicio;
        public FieldDef m0369periodo;
        public FieldDef m0369listpag;
        public FieldDef m0369trabper700;
        public FieldDef m0369actprof701;
        public FieldDef m0369115mod702;
        public FieldDef m0369117mod703;
        public FieldDef m0369124mod704;
        public FieldDef m0369126mod705;
        public FieldDef m0369128mod706;
        public FieldDef m0369123mod707;
        public FieldDef m0369regter710;
        public FieldDef m0369minhid711;
        public FieldDef m0369priseg712;
        public TabMod0369(String name)
            {
            super(name);
            m0369dominio = new FieldDef("m0369dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m0369nif = new FieldDef("m0369nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m0369ejercicio = new FieldDef("m0369ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m0369periodo = new FieldDef("m0369periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m0369listpag = new FieldDef("m0369listpag",FieldDef.CHAR,1);
            m0369trabper700 = new FieldDef("m0369trabper700",FieldDef.CHAR,1);
            m0369actprof701 = new FieldDef("m0369actprof701",FieldDef.CHAR,1);
            m0369115mod702 = new FieldDef("m0369115mod702",FieldDef.CHAR,1);
            m0369117mod703 = new FieldDef("m0369117mod703",FieldDef.CHAR,1);
            m0369124mod704 = new FieldDef("m0369124mod704",FieldDef.CHAR,1);
            m0369126mod705 = new FieldDef("m0369126mod705",FieldDef.CHAR,1);
            m0369128mod706 = new FieldDef("m0369128mod706",FieldDef.CHAR,1);
            m0369123mod707 = new FieldDef("m0369123mod707",FieldDef.CHAR,1);
            m0369regter710 = new FieldDef("m0369regter710",FieldDef.CHAR,1);
            m0369minhid711 = new FieldDef("m0369minhid711",FieldDef.CHAR,1);
            m0369priseg712 = new FieldDef("m0369priseg712",FieldDef.CHAR,1);
            FieldDef array[] = {
                m0369dominio,
                m0369nif,
                m0369ejercicio,
                m0369periodo,
                m0369listpag,
                m0369trabper700,
                m0369actprof701,
                m0369115mod702,
                m0369117mod703,
                m0369124mod704,
                m0369126mod705,
                m0369128mod706,
                m0369123mod707,
                m0369regter710,
                m0369minhid711,
                m0369priseg712                
                };
            setColumns(array);
            FieldDef arrayf[] = {m0369dominio,m0369nif,m0369ejercicio,m0369periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod03610 extends TableDef
        {
        // campos
        public FieldDef m03610dominio;
        public FieldDef m03610nif;
        public FieldDef m03610ejercicio;
        public FieldDef m03610periodo;
        public FieldDef m03610listpag;
        public FieldDef m03610contador;
        public FieldDef m03610nif800;
        public FieldDef m03610nom801;
        public FieldDef m03610sg805;
        public FieldDef m03610via806;
        public FieldDef m03610num807;
        public FieldDef m03610esc808;
        public FieldDef m03610piso809;
        public FieldDef m03610puerta810;
        public FieldDef m03610telef811;
        public FieldDef m03610cpost812;
        public FieldDef m03610muni813;
        public FieldDef m03610prov814;
        public FieldDef m03610cmuni813;
        public FieldDef m03610pais815;
        public FieldDef m03610resid816;
        public FieldDef m03610nacio817;
        public FieldDef m03610cuota818;
        public FieldDef m03610irpfeo819;
        public FieldDef m03610irpfed821;
        public FieldDef m03610ivars823;
        public FieldDef m03610ivarea825;
        public FieldDef m03610nif830;
        public FieldDef m03610nom831;
        public FieldDef m03610sg835;
        public FieldDef m03610via836;
        public FieldDef m03610num837;
        public FieldDef m03610esc838;
        public FieldDef m03610piso839;
        public FieldDef m03610puerta840;
        public FieldDef m03610telef841;
        public FieldDef m03610cpost842;
        public FieldDef m03610muni843;
        public FieldDef m03610prov844;
        public FieldDef m03610cmuni843;
        public FieldDef m03610pais845;
        public FieldDef m03610resid846;
        public FieldDef m03610nacio847;
        public FieldDef m03610cuota848;
        public FieldDef m03610irpfeo849;
        public FieldDef m03610irpfed851;
        public FieldDef m03610ivars853;
        public FieldDef m03610ivarea855;
        public FieldDef m03610nif860;
        public FieldDef m03610nom861;
        public FieldDef m03610sg865;
        public FieldDef m03610via866;
        public FieldDef m03610num867;
        public FieldDef m03610esc868;
        public FieldDef m03610piso869;
        public FieldDef m03610puerta870;
        public FieldDef m03610telef871;
        public FieldDef m03610cpost872;
        public FieldDef m03610muni873;
        public FieldDef m03610prov874;
        public FieldDef m03610cmuni873;
        public FieldDef m03610pais875;
        public FieldDef m03610resid876;
        public FieldDef m03610nacio877;
        public FieldDef m03610cuota878;
        public FieldDef m03610irpfeo879;
        public FieldDef m03610irpfed881;
        public FieldDef m03610ivars883;
        public FieldDef m03610ivarea885;
        public TabMod03610(String name)
            {
            super(name);
            m03610dominio = new FieldDef("m03610dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m03610nif = new FieldDef("m03610nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m03610ejercicio = new FieldDef("m03610ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m03610periodo = new FieldDef("m03610periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m03610listpag = new FieldDef("m03610listpag",FieldDef.CHAR,1);
            m03610contador = new FieldDef("m03610contador",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m03610nif800 = new FieldDef("m03610nif800",FieldDef.CHAR,9);
            m03610nom801 = new FieldDef("m03610nom801",FieldDef.CHAR,125);
            m03610sg805 = new FieldDef("m03610sg805",FieldDef.CHAR,17);
            m03610via806 = new FieldDef("m03610via806",FieldDef.CHAR,25);
            m03610num807 = new FieldDef("m03610num807",FieldDef.CHAR,5);
            m03610esc808 = new FieldDef("m03610esc808",FieldDef.CHAR,2);
            m03610piso809 = new FieldDef("m03610piso809",FieldDef.CHAR,2);
            m03610puerta810 = new FieldDef("m03610puerta810",FieldDef.CHAR,2);
            m03610telef811 = new FieldDef("m03610telef811",FieldDef.CHAR,9);
            m03610cpost812 = new FieldDef("m03610cpost812",FieldDef.CHAR,5);
            m03610muni813 = new FieldDef("m03610muni813",FieldDef.CHAR,25);
            m03610prov814 = new FieldDef("m03610prov814",FieldDef.CHAR,2);
            m03610cmuni813 = new FieldDef("m03610cmuni813",FieldDef.CHAR,6);
            m03610pais815 = new FieldDef("m03610pais815",FieldDef.CHAR,3);
            m03610resid816 = new FieldDef("m03610resid816",FieldDef.CHAR,1);
            m03610nacio817 = new FieldDef("m03610nacio817",FieldDef.CHAR,3);
            m03610cuota818 = new FieldDef("m03610cuota818",FieldDef.FLOAT,6,0);
            m03610irpfeo819 = new FieldDef("m03610irpfeo819",FieldDef.CHAR,1);
            m03610irpfed821 = new FieldDef("m03610irpfed821",FieldDef.CHAR,1);
            m03610ivars823 = new FieldDef("m03610ivars823",FieldDef.CHAR,1);
            m03610ivarea825 = new FieldDef("m03610ivarea825",FieldDef.CHAR,1);
            m03610nif830 = new FieldDef("m03610nif830",FieldDef.CHAR,9);
            m03610nom831 = new FieldDef("m03610nom831",FieldDef.CHAR,125);
            m03610sg835 = new FieldDef("m03610sg835",FieldDef.CHAR,17);
            m03610via836 = new FieldDef("m03610via836",FieldDef.CHAR,25);
            m03610num837 = new FieldDef("m03610num837",FieldDef.CHAR,5);
            m03610esc838 = new FieldDef("m03610esc838",FieldDef.CHAR,2);
            m03610piso839 = new FieldDef("m03610piso839",FieldDef.CHAR,2);
            m03610puerta840 = new FieldDef("m03610puerta840",FieldDef.CHAR,2);
            m03610telef841 = new FieldDef("m03610telef841",FieldDef.CHAR,9);
            m03610cpost842 = new FieldDef("m03610cpost842",FieldDef.CHAR,5);
            m03610muni843 = new FieldDef("m03610muni843",FieldDef.CHAR,25);
            m03610prov844 = new FieldDef("m03610prov844",FieldDef.CHAR,2);
            m03610cmuni843 = new FieldDef("m03610cmuni843",FieldDef.CHAR,6);
            m03610pais845 = new FieldDef("m03610pais845",FieldDef.CHAR,3);
            m03610resid846 = new FieldDef("m03610resid846",FieldDef.CHAR,1);
            m03610nacio847 = new FieldDef("m03610nacio847",FieldDef.CHAR,3);
            m03610cuota848 = new FieldDef("m03610cuota848",FieldDef.FLOAT,6,0);
            m03610irpfeo849 = new FieldDef("m03610irpfeo849",FieldDef.CHAR,1);
            m03610irpfed851 = new FieldDef("m03610irpfed851",FieldDef.CHAR,1);
            m03610ivars853 = new FieldDef("m03610ivars853",FieldDef.CHAR,1);
            m03610ivarea855 = new FieldDef("m03610ivarea855",FieldDef.CHAR,1);
            m03610nif860 = new FieldDef("m03610nif860",FieldDef.CHAR,9);
            m03610nom861 = new FieldDef("m03610nom861",FieldDef.CHAR,125);
            m03610sg865 = new FieldDef("m03610sg865",FieldDef.CHAR,17);
            m03610via866 = new FieldDef("m03610via866",FieldDef.CHAR,25);
            m03610num867 = new FieldDef("m03610num867",FieldDef.CHAR,5);
            m03610esc868 = new FieldDef("m03610esc868",FieldDef.CHAR,2);
            m03610piso869 = new FieldDef("m03610piso869",FieldDef.CHAR,2);
            m03610puerta870 = new FieldDef("m03610puerta870",FieldDef.CHAR,2);
            m03610telef871 = new FieldDef("m03610telef871",FieldDef.CHAR,9);
            m03610cpost872 = new FieldDef("m03610cpost872",FieldDef.CHAR,5);
            m03610muni873 = new FieldDef("m03610muni873",FieldDef.CHAR,25);
            m03610prov874 = new FieldDef("m03610prov874",FieldDef.CHAR,2);
            m03610cmuni873 = new FieldDef("m03610cmuni873",FieldDef.CHAR,6);
            m03610pais875 = new FieldDef("m03610pais875",FieldDef.CHAR,3);
            m03610resid876 = new FieldDef("m03610resid876",FieldDef.CHAR,1);
            m03610nacio877 = new FieldDef("m03610nacio877",FieldDef.CHAR,3);
            m03610cuota878 = new FieldDef("m03610cuota878",FieldDef.FLOAT,6,0);
            m03610irpfeo879 = new FieldDef("m03610irpfeo879",FieldDef.CHAR,1);
            m03610irpfed881 = new FieldDef("m03610irpfed881",FieldDef.CHAR,1);
            m03610ivars883 = new FieldDef("m03610ivars883",FieldDef.CHAR,1);
            m03610ivarea885 = new FieldDef("m03610ivarea885",FieldDef.CHAR,1);
            FieldDef array[] = {
                m03610dominio,
                m03610nif,
                m03610ejercicio,
                m03610periodo,
                m03610listpag,
                m03610contador,
                m03610nif800,
                m03610nom801,
                m03610sg805,
                m03610via806,
                m03610num807,
                m03610esc808,
                m03610piso809,
                m03610puerta810,
                m03610telef811,
                m03610cpost812,
                m03610muni813,
                m03610prov814,
                m03610cmuni813,
                m03610pais815,
                m03610resid816,
                m03610nacio817,
                m03610cuota818,
                m03610irpfeo819,
                m03610irpfed821,
                m03610ivars823,
                m03610ivarea825,
                m03610nif830,
                m03610nom831,
                m03610sg835,
                m03610via836,
                m03610num837,
                m03610esc838,
                m03610piso839,
                m03610puerta840,
                m03610telef841,
                m03610cpost842,
                m03610muni843,
                m03610prov844,
                m03610cmuni843,
                m03610pais845,
                m03610resid846,
                m03610nacio847,
                m03610cuota848,
                m03610irpfeo849,
                m03610irpfed851,
                m03610ivars853,
                m03610ivarea855,
                m03610nif860,
                m03610nom861,
                m03610sg865,
                m03610via866,
                m03610num867,
                m03610esc868,
                m03610piso869,
                m03610puerta870,
                m03610telef871,
                m03610cpost872,
                m03610muni873,
                m03610prov874,
                m03610cmuni873,
                m03610pais875,
                m03610resid876,
                m03610nacio877,
                m03610cuota878,
                m03610irpfeo879,
                m03610irpfed881,
                m03610ivars883,
                m03610ivarea885                
                };
            setColumns(array);
            FieldDef arrayf[] = {m03610dominio,m03610nif,m03610ejercicio,m03610periodo,m03610contador };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod03611 extends TableDef
        {
        // campos
        public FieldDef m03611dominio;
        public FieldDef m03611nif;
        public FieldDef m03611ejercicio;
        public FieldDef m03611periodo;
        public FieldDef m03611listpag;
        public FieldDef m03611supaleman;
        public FieldDef m03611desaleman;
        public FieldDef m03611revaleman;
        public FieldDef m03611supaustri;
        public FieldDef m03611desaustri;
        public FieldDef m03611revaustri;
        public FieldDef m03611supbelgic;
        public FieldDef m03611desbelgic;
        public FieldDef m03611revbelgic;
        public FieldDef m03611supdinama;
        public FieldDef m03611desdinama;
        public FieldDef m03611revdinama;
        public FieldDef m03611supfinlan;
        public FieldDef m03611desfinlan;
        public FieldDef m03611revfinlan;
        public FieldDef m03611supfrance;
        public FieldDef m03611desfrance;
        public FieldDef m03611revfrance;
        public FieldDef m03611supgrecia;
        public FieldDef m03611desgrecia;
        public FieldDef m03611revgrecia;
        public FieldDef m03611supirland;
        public FieldDef m03611desirland;
        public FieldDef m03611revirland;
        public FieldDef m03611supitalia;
        public FieldDef m03611desitalia;
        public FieldDef m03611revitalia;
        public FieldDef m03611supluxemb;
        public FieldDef m03611desluxemb;
        public FieldDef m03611revluxemb;
        public FieldDef m03611supholand;
        public FieldDef m03611desholand;
        public FieldDef m03611revholand;
        public FieldDef m03611supportug;
        public FieldDef m03611desportug;
        public FieldDef m03611revportug;
        public FieldDef m03611suprunido;
        public FieldDef m03611desrunido;
        public FieldDef m03611revrunido;
        public FieldDef m03611supsuecia;
        public FieldDef m03611dessuecia;
        public FieldDef m03611revsuecia;
        public FieldDef m03611desimpesp;
        public FieldDef m03611revimpesp;
        public FieldDef m03611supotrbie;
        public FieldDef m03611desotrbie;
        public FieldDef m03611revotrbie;
        public FieldDef m03611ragri910;
        public FieldDef m03611ragri912;
        public FieldDef m03611supchipre;
        public FieldDef m03611deschipre;
        public FieldDef m03611revchipre;
        public FieldDef m03611supeslove;
        public FieldDef m03611deseslove;
        public FieldDef m03611reveslove;
        public FieldDef m03611supestoni;
        public FieldDef m03611desestoni;
        public FieldDef m03611revestoni;
        public FieldDef m03611suphungri;
        public FieldDef m03611deshungri;
        public FieldDef m03611revhungri;
        public FieldDef m03611supletoni;
        public FieldDef m03611desletoni;
        public FieldDef m03611revletoni;
        public FieldDef m03611suplituan;
        public FieldDef m03611deslituan;
        public FieldDef m03611revlituan;
        public FieldDef m03611supmalta;
        public FieldDef m03611desmalta;
        public FieldDef m03611revmalta;
        public FieldDef m03611suppoloni;
        public FieldDef m03611despoloni;
        public FieldDef m03611revpoloni;
        public FieldDef m03611suprechec;
        public FieldDef m03611desrechec;
        public FieldDef m03611revrechec;
        public FieldDef m03611supreeslo;
        public FieldDef m03611desreeslo;
        public FieldDef m03611revreeslo;
        public TabMod03611(String name)
            {
            super(name);
            m03611dominio = new FieldDef("m03611dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m03611nif = new FieldDef("m03611nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m03611ejercicio = new FieldDef("m03611ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m03611periodo = new FieldDef("m03611periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m03611listpag = new FieldDef("m03611listpag",FieldDef.CHAR,1);
            m03611supaleman = new FieldDef("m03611supaleman",FieldDef.CHAR,1);
            m03611desaleman = new FieldDef("m03611desaleman",FieldDef.CHAR,1);
            m03611revaleman = new FieldDef("m03611revaleman",FieldDef.CHAR,1);
            m03611supaustri = new FieldDef("m03611supaustri",FieldDef.CHAR,1);
            m03611desaustri = new FieldDef("m03611desaustri",FieldDef.CHAR,1);
            m03611revaustri = new FieldDef("m03611revaustri",FieldDef.CHAR,1);
            m03611supbelgic = new FieldDef("m03611supbelgic",FieldDef.CHAR,1);
            m03611desbelgic = new FieldDef("m03611desbelgic",FieldDef.CHAR,1);
            m03611revbelgic = new FieldDef("m03611revbelgic",FieldDef.CHAR,1);
            m03611supdinama = new FieldDef("m03611supdinama",FieldDef.CHAR,1);
            m03611desdinama = new FieldDef("m03611desdinama",FieldDef.CHAR,1);
            m03611revdinama = new FieldDef("m03611revdinama",FieldDef.CHAR,1);
            m03611supfinlan = new FieldDef("m03611supfinlan",FieldDef.CHAR,1);
            m03611desfinlan = new FieldDef("m03611desfinlan",FieldDef.CHAR,1);
            m03611revfinlan = new FieldDef("m03611revfinlan",FieldDef.CHAR,1);
            m03611supfrance = new FieldDef("m03611supfrance",FieldDef.CHAR,1);
            m03611desfrance = new FieldDef("m03611desfrance",FieldDef.CHAR,1);
            m03611revfrance = new FieldDef("m03611revfrance",FieldDef.CHAR,1);
            m03611supgrecia = new FieldDef("m03611supgrecia",FieldDef.CHAR,1);
            m03611desgrecia = new FieldDef("m03611desgrecia",FieldDef.CHAR,1);
            m03611revgrecia = new FieldDef("m03611revgrecia",FieldDef.CHAR,1);
            m03611supirland = new FieldDef("m03611supirland",FieldDef.CHAR,1);
            m03611desirland = new FieldDef("m03611desirland",FieldDef.CHAR,1);
            m03611revirland = new FieldDef("m03611revirland",FieldDef.CHAR,1);
            m03611supitalia = new FieldDef("m03611supitalia",FieldDef.CHAR,1);
            m03611desitalia = new FieldDef("m03611desitalia",FieldDef.CHAR,1);
            m03611revitalia = new FieldDef("m03611revitalia",FieldDef.CHAR,1);
            m03611supluxemb = new FieldDef("m03611supluxemb",FieldDef.CHAR,1);
            m03611desluxemb = new FieldDef("m03611desluxemb",FieldDef.CHAR,1);
            m03611revluxemb = new FieldDef("m03611revluxemb",FieldDef.CHAR,1);
            m03611supholand = new FieldDef("m03611supholand",FieldDef.CHAR,1);
            m03611desholand = new FieldDef("m03611desholand",FieldDef.CHAR,1);
            m03611revholand = new FieldDef("m03611revholand",FieldDef.CHAR,1);
            m03611supportug = new FieldDef("m03611supportug",FieldDef.CHAR,1);
            m03611desportug = new FieldDef("m03611desportug",FieldDef.CHAR,1);
            m03611revportug = new FieldDef("m03611revportug",FieldDef.CHAR,1);
            m03611suprunido = new FieldDef("m03611suprunido",FieldDef.CHAR,1);
            m03611desrunido = new FieldDef("m03611desrunido",FieldDef.CHAR,1);
            m03611revrunido = new FieldDef("m03611revrunido",FieldDef.CHAR,1);
            m03611supsuecia = new FieldDef("m03611supsuecia",FieldDef.CHAR,1);
            m03611dessuecia = new FieldDef("m03611dessuecia",FieldDef.CHAR,1);
            m03611revsuecia = new FieldDef("m03611revsuecia",FieldDef.CHAR,1);
            m03611desimpesp = new FieldDef("m03611desimpesp",FieldDef.CHAR,1);
            m03611revimpesp = new FieldDef("m03611revimpesp",FieldDef.CHAR,1);
            m03611supotrbie = new FieldDef("m03611supotrbie",FieldDef.CHAR,1);
            m03611desotrbie = new FieldDef("m03611desotrbie",FieldDef.CHAR,1);
            m03611revotrbie = new FieldDef("m03611revotrbie",FieldDef.CHAR,1);
            m03611ragri910 = new FieldDef("m03611ragri910",FieldDef.CHAR,1);
            m03611ragri912 = new FieldDef("m03611ragri912",FieldDef.CHAR,1);
            m03611supchipre = new FieldDef("m03611supchipre",FieldDef.CHAR,1);
            m03611deschipre = new FieldDef("m03611deschipre",FieldDef.CHAR,1);
            m03611revchipre = new FieldDef("m03611revchipre",FieldDef.CHAR,1);
            m03611supeslove = new FieldDef("m03611supeslove",FieldDef.CHAR,1);
            m03611deseslove = new FieldDef("m03611deseslove",FieldDef.CHAR,1);
            m03611reveslove = new FieldDef("m03611reveslove",FieldDef.CHAR,1);
            m03611supestoni = new FieldDef("m03611supestoni",FieldDef.CHAR,1);
            m03611desestoni = new FieldDef("m03611desestoni",FieldDef.CHAR,1);
            m03611revestoni = new FieldDef("m03611revestoni",FieldDef.CHAR,1);
            m03611suphungri = new FieldDef("m03611suphungri",FieldDef.CHAR,1);
            m03611deshungri = new FieldDef("m03611deshungri",FieldDef.CHAR,1);
            m03611revhungri = new FieldDef("m03611revhungri",FieldDef.CHAR,1);
            m03611supletoni = new FieldDef("m03611supletoni",FieldDef.CHAR,1);
            m03611desletoni = new FieldDef("m03611desletoni",FieldDef.CHAR,1);
            m03611revletoni = new FieldDef("m03611revletoni",FieldDef.CHAR,1);
            m03611suplituan = new FieldDef("m03611suplituan",FieldDef.CHAR,1);
            m03611deslituan = new FieldDef("m03611deslituan",FieldDef.CHAR,1);
            m03611revlituan = new FieldDef("m03611revlituan",FieldDef.CHAR,1);
            m03611supmalta = new FieldDef("m03611supmalta",FieldDef.CHAR,1);
            m03611desmalta = new FieldDef("m03611desmalta",FieldDef.CHAR,1);
            m03611revmalta = new FieldDef("m03611revmalta",FieldDef.CHAR,1);
            m03611suppoloni = new FieldDef("m03611suppoloni",FieldDef.CHAR,1);
            m03611despoloni = new FieldDef("m03611despoloni",FieldDef.CHAR,1);
            m03611revpoloni = new FieldDef("m03611revpoloni",FieldDef.CHAR,1);
            m03611suprechec = new FieldDef("m03611suprechec",FieldDef.CHAR,1);
            m03611desrechec = new FieldDef("m03611desrechec",FieldDef.CHAR,1);
            m03611revrechec = new FieldDef("m03611revrechec",FieldDef.CHAR,1);
            m03611supreeslo = new FieldDef("m03611supreeslo",FieldDef.CHAR,1);
            m03611desreeslo = new FieldDef("m03611desreeslo",FieldDef.CHAR,1);
            m03611revreeslo = new FieldDef("m03611revreeslo",FieldDef.CHAR,1);
            FieldDef array[] = {
                m03611dominio,
                m03611nif,
                m03611ejercicio,
                m03611periodo,
                m03611listpag,
                m03611supaleman,
                m03611desaleman,
                m03611revaleman,
                m03611supaustri,
                m03611desaustri,
                m03611revaustri,
                m03611supbelgic,
                m03611desbelgic,
                m03611revbelgic,
                m03611supdinama,
                m03611desdinama,
                m03611revdinama,
                m03611supfinlan,
                m03611desfinlan,
                m03611revfinlan,
                m03611supfrance,
                m03611desfrance,
                m03611revfrance,
                m03611supgrecia,
                m03611desgrecia,
                m03611revgrecia,
                m03611supirland,
                m03611desirland,
                m03611revirland,
                m03611supitalia,
                m03611desitalia,
                m03611revitalia,
                m03611supluxemb,
                m03611desluxemb,
                m03611revluxemb,
                m03611supholand,
                m03611desholand,
                m03611revholand,
                m03611supportug,
                m03611desportug,
                m03611revportug,
                m03611suprunido,
                m03611desrunido,
                m03611revrunido,
                m03611supsuecia,
                m03611dessuecia,
                m03611revsuecia,
                m03611desimpesp,
                m03611revimpesp,
                m03611supotrbie,
                m03611desotrbie,
                m03611revotrbie,
                m03611ragri910,
                m03611ragri912,
                m03611supchipre,
                m03611deschipre,
                m03611revchipre,
                m03611supeslove,
                m03611deseslove,
                m03611reveslove,
                m03611supestoni,
                m03611desestoni,
                m03611revestoni,
                m03611suphungri,
                m03611deshungri,
                m03611revhungri,
                m03611supletoni,
                m03611desletoni,
                m03611revletoni,
                m03611suplituan,
                m03611deslituan,
                m03611revlituan,
                m03611supmalta,
                m03611desmalta,
                m03611revmalta,
                m03611suppoloni,
                m03611despoloni,
                m03611revpoloni,
                m03611suprechec,
                m03611desrechec,
                m03611revrechec,
                m03611supreeslo,
                m03611desreeslo,
                m03611revreeslo                
                };
            setColumns(array);
            FieldDef arrayf[] = {m03611dominio,m03611nif,m03611ejercicio,m03611periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod576 extends TableDef
        {
        // campos
        public FieldDef m576dominio;
        public FieldDef m576nif;
        public FieldDef m576ejercicio;
        public FieldDef m576periodo;
        public FieldDef m576fechacrea;
        public FieldDef m576letetiq;
        public FieldDef m576deleg;
        public FieldDef m576admon;
        public FieldDef m576codadmon;
        public FieldDef m576telefono;
        public FieldDef m576apellidos;
        public FieldDef m576sigla;
        public FieldDef m576sigladesc;
        public FieldDef m576calle;
        public FieldDef m576numero;
        public FieldDef m576piso;
        public FieldDef m576escalera;
        public FieldDef m576puerta;
        public FieldDef m576municipio;
        public FieldDef m576provincia;
        public FieldDef m576cpostal;
        public FieldDef m576fecha;
        public FieldDef m576munifirma;
        public FieldDef m576dia;
        public FieldDef m576mes;
        public FieldDef m576anyo;
        public FieldDef m576decla;
        public FieldDef m576firma;
        public FieldDef m576cargofirm;
        public FieldDef m576deccomp;
        public FieldDef m576nrojusant;
        public FieldDef m576tipodecla;
        public FieldDef m576tipotrans;
        public FieldDef m576mediotrnou;
        public FieldDef m576adquien;
        public FieldDef m576matricuen;
        public FieldDef m576primmatri;
        public FieldDef m576vehmotor;
        public FieldDef m576vehmarca;
        public FieldDef m576vehmodelo;
        public FieldDef m576vehnumiden;
        public FieldDef m576vehclasif;
        public FieldDef m576vehcilind;
        public FieldDef m576embfabrica;
        public FieldDef m576embmodelo;
        public FieldDef m576embnumiden;
        public FieldDef m576embeslora;
        public FieldDef m576aerfabrica;
        public FieldDef m576aermodelo;
        public FieldDef m576aernumseri;
        public FieldDef m576aeranyofab;
        public FieldDef m576aerpesomax;
        public FieldDef m576premarca;
        public FieldDef m576pretipo;
        public FieldDef m576premodelo;
        public FieldDef m576prenumiden;
        public FieldDef m576preclasif;
        public FieldDef m576prematricu;
        public FieldDef m576base;
        public FieldDef m576basereduc;
        public FieldDef m576tipoliq;
        public FieldDef m576cuota;
        public FieldDef m576deduclinea;
        public FieldDef m576cuotaing;
        public FieldDef m576deducir;
        public FieldDef m576totalliq;
        public FieldDef m576telefrepre;
        public FieldDef m576nifrepre;
        public FieldDef m576nomrepre;
        public FieldDef m576siglarepre;
        public FieldDef m576sigderepre;
        public FieldDef m576callerepre;
        public FieldDef m576numrepre;
        public FieldDef m576pisorepre;
        public FieldDef m576escrepre;
        public FieldDef m576puertrepre;
        public FieldDef m576munirepre;
        public FieldDef m576provrepre;
        public FieldDef m576cpostrepre;
        public FieldDef m576percont;
        public FieldDef m576telcont;
        public FieldDef m576observa;
        public FieldDef m576impcompen;
        public FieldDef m576sinactiv;
        public FieldDef m576impdevol;
        public FieldDef m576entdevol;
        public FieldDef m576ofidevol;
        public FieldDef m576digidevol;
        public FieldDef m576ctadevol;
        public FieldDef m576cruzefec;
        public FieldDef m576cruzadeu;
        public FieldDef m576cruzcomp;
        public FieldDef m576cruzneg;
        public FieldDef m576impingreso;
        public FieldDef m576entingreso;
        public FieldDef m576ofiingreso;
        public FieldDef m576digiingreso;
        public FieldDef m576ctaingreso;
        public FieldDef m576codelecmat;
        public TabMod576(String name)
            {
            super(name);
            m576dominio = new FieldDef("m576dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m576nif = new FieldDef("m576nif",FieldDef.CHAR,9,FieldDef.NOTNULL);
            m576ejercicio = new FieldDef("m576ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m576periodo = new FieldDef("m576periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m576fechacrea = new FieldDef("m576fechacrea",FieldDef.DATE);
            m576letetiq = new FieldDef("m576letetiq",FieldDef.CHAR,4);
            m576deleg = new FieldDef("m576deleg",FieldDef.CHAR,30);
            m576admon = new FieldDef("m576admon",FieldDef.CHAR,30);
            m576codadmon = new FieldDef("m576codadmon",FieldDef.INTEGER,0);
            m576telefono = new FieldDef("m576telefono",FieldDef.CHAR,9);
            m576apellidos = new FieldDef("m576apellidos",FieldDef.CHAR,40);
            m576sigla = new FieldDef("m576sigla",FieldDef.CHAR,2);
            m576sigladesc = new FieldDef("m576sigladesc",FieldDef.CHAR,10);
            m576calle = new FieldDef("m576calle",FieldDef.CHAR,25);
            m576numero = new FieldDef("m576numero",FieldDef.CHAR,10);
            m576piso = new FieldDef("m576piso",FieldDef.CHAR,5);
            m576escalera = new FieldDef("m576escalera",FieldDef.CHAR,5);
            m576puerta = new FieldDef("m576puerta",FieldDef.CHAR,5);
            m576municipio = new FieldDef("m576municipio",FieldDef.CHAR,25);
            m576provincia = new FieldDef("m576provincia",FieldDef.CHAR,15);
            m576cpostal = new FieldDef("m576cpostal",FieldDef.CHAR,5);
            m576fecha = new FieldDef("m576fecha",FieldDef.DATE);
            m576munifirma = new FieldDef("m576munifirma",FieldDef.CHAR,30);
            m576dia = new FieldDef("m576dia",FieldDef.CHAR,2);
            m576mes = new FieldDef("m576mes",FieldDef.CHAR,10);
            m576anyo = new FieldDef("m576anyo",FieldDef.CHAR,4);
            m576decla = new FieldDef("m576decla",FieldDef.CHAR,1);
            m576firma = new FieldDef("m576firma",FieldDef.CHAR,30);
            m576cargofirm = new FieldDef("m576cargofirm",FieldDef.CHAR,25);
            m576deccomp = new FieldDef("m576deccomp",FieldDef.CHAR,1);
            m576nrojusant = new FieldDef("m576nrojusant",FieldDef.CHAR,16);
            m576tipodecla = new FieldDef("m576tipodecla",FieldDef.CHAR,1);
            m576tipotrans = new FieldDef("m576tipotrans",FieldDef.CHAR,1);
            m576mediotrnou = new FieldDef("m576mediotrnou",FieldDef.CHAR,1);
            m576adquien = new FieldDef("m576adquien",FieldDef.CHAR,1);
            m576matricuen = new FieldDef("m576matricuen",FieldDef.CHAR,1);
            m576primmatri = new FieldDef("m576primmatri",FieldDef.CHAR,8);
            m576vehmotor = new FieldDef("m576vehmotor",FieldDef.CHAR,1);
            m576vehmarca = new FieldDef("m576vehmarca",FieldDef.CHAR,40);
            m576vehmodelo = new FieldDef("m576vehmodelo",FieldDef.CHAR,80);
            m576vehnumiden = new FieldDef("m576vehnumiden",FieldDef.CHAR,22);
            m576vehclasif = new FieldDef("m576vehclasif",FieldDef.CHAR,40);
            m576vehcilind = new FieldDef("m576vehcilind",FieldDef.INTEGER,0);
            m576embfabrica = new FieldDef("m576embfabrica",FieldDef.CHAR,40);
            m576embmodelo = new FieldDef("m576embmodelo",FieldDef.CHAR,80);
            m576embnumiden = new FieldDef("m576embnumiden",FieldDef.CHAR,22);
            m576embeslora = new FieldDef("m576embeslora",FieldDef.FLOAT,6,0);
            m576aerfabrica = new FieldDef("m576aerfabrica",FieldDef.CHAR,40);
            m576aermodelo = new FieldDef("m576aermodelo",FieldDef.CHAR,80);
            m576aernumseri = new FieldDef("m576aernumseri",FieldDef.CHAR,22);
            m576aeranyofab = new FieldDef("m576aeranyofab",FieldDef.INTEGER,0);
            m576aerpesomax = new FieldDef("m576aerpesomax",FieldDef.INTEGER,0);
            m576premarca = new FieldDef("m576premarca",FieldDef.CHAR,40);
            m576pretipo = new FieldDef("m576pretipo",FieldDef.CHAR,40);
            m576premodelo = new FieldDef("m576premodelo",FieldDef.CHAR,80);
            m576prenumiden = new FieldDef("m576prenumiden",FieldDef.CHAR,22);
            m576preclasif = new FieldDef("m576preclasif",FieldDef.CHAR,40);
            m576prematricu = new FieldDef("m576prematricu",FieldDef.CHAR,10);
            m576base = new FieldDef("m576base",FieldDef.FLOAT,6,0);
            m576basereduc = new FieldDef("m576basereduc",FieldDef.FLOAT,6,0);
            m576tipoliq = new FieldDef("m576tipoliq",FieldDef.FLOAT,6,0);
            m576cuota = new FieldDef("m576cuota",FieldDef.FLOAT,6,0);
            m576deduclinea = new FieldDef("m576deduclinea",FieldDef.FLOAT,6,0);
            m576cuotaing = new FieldDef("m576cuotaing",FieldDef.FLOAT,6,0);
            m576deducir = new FieldDef("m576deducir",FieldDef.FLOAT,6,0);
            m576totalliq = new FieldDef("m576totalliq",FieldDef.FLOAT,6,0);
            m576telefrepre = new FieldDef("m576telefrepre",FieldDef.CHAR,9);
            m576nifrepre = new FieldDef("m576nifrepre",FieldDef.CHAR,9);
            m576nomrepre = new FieldDef("m576nomrepre",FieldDef.CHAR,40);
            m576siglarepre = new FieldDef("m576siglarepre",FieldDef.CHAR,2);
            m576sigderepre = new FieldDef("m576sigderepre",FieldDef.CHAR,10);
            m576callerepre = new FieldDef("m576callerepre",FieldDef.CHAR,25);
            m576numrepre = new FieldDef("m576numrepre",FieldDef.CHAR,10);
            m576pisorepre = new FieldDef("m576pisorepre",FieldDef.CHAR,5);
            m576escrepre = new FieldDef("m576escrepre",FieldDef.CHAR,5);
            m576puertrepre = new FieldDef("m576puertrepre",FieldDef.CHAR,5);
            m576munirepre = new FieldDef("m576munirepre",FieldDef.CHAR,25);
            m576provrepre = new FieldDef("m576provrepre",FieldDef.CHAR,15);
            m576cpostrepre = new FieldDef("m576cpostrepre",FieldDef.CHAR,5);
            m576percont = new FieldDef("m576percont",FieldDef.CHAR,100);
            m576telcont = new FieldDef("m576telcont",FieldDef.CHAR,9);
            m576observa = new FieldDef("m576observa",FieldDef.CHAR,350);
            m576impcompen = new FieldDef("m576impcompen",FieldDef.FLOAT,6,0);
            m576sinactiv = new FieldDef("m576sinactiv",FieldDef.CHAR,1);
            m576impdevol = new FieldDef("m576impdevol",FieldDef.FLOAT,6,0);
            m576entdevol = new FieldDef("m576entdevol",FieldDef.CHAR,4);
            m576ofidevol = new FieldDef("m576ofidevol",FieldDef.CHAR,4);
            m576digidevol = new FieldDef("m576digidevol",FieldDef.CHAR,2);
            m576ctadevol = new FieldDef("m576ctadevol",FieldDef.CHAR,10);
            m576cruzefec = new FieldDef("m576cruzefec",FieldDef.CHAR,1);
            m576cruzadeu = new FieldDef("m576cruzadeu",FieldDef.CHAR,1);
            m576cruzcomp = new FieldDef("m576cruzcomp",FieldDef.CHAR,1);
            m576cruzneg = new FieldDef("m576cruzneg",FieldDef.CHAR,1);
            m576impingreso = new FieldDef("m576impingreso",FieldDef.FLOAT,6,0);
            m576entingreso = new FieldDef("m576entingreso",FieldDef.CHAR,4);
            m576ofiingreso = new FieldDef("m576ofiingreso",FieldDef.CHAR,4);
            m576digiingreso = new FieldDef("m576digiingreso",FieldDef.CHAR,2);
            m576ctaingreso = new FieldDef("m576ctaingreso",FieldDef.CHAR,10);
            m576codelecmat = new FieldDef("m576codelecmat",FieldDef.CHAR,8);
            FieldDef array[] = {
                m576dominio,
                m576nif,
                m576ejercicio,
                m576periodo,
                m576fechacrea,
                m576letetiq,
                m576deleg,
                m576admon,
                m576codadmon,
                m576telefono,
                m576apellidos,
                m576sigla,
                m576sigladesc,
                m576calle,
                m576numero,
                m576piso,
                m576escalera,
                m576puerta,
                m576municipio,
                m576provincia,
                m576cpostal,
                m576fecha,
                m576munifirma,
                m576dia,
                m576mes,
                m576anyo,
                m576decla,
                m576firma,
                m576cargofirm,
                m576deccomp,
                m576nrojusant,
                m576tipodecla,
                m576tipotrans,
                m576mediotrnou,
                m576adquien,
                m576matricuen,
                m576primmatri,
                m576vehmotor,
                m576vehmarca,
                m576vehmodelo,
                m576vehnumiden,
                m576vehclasif,
                m576vehcilind,
                m576embfabrica,
                m576embmodelo,
                m576embnumiden,
                m576embeslora,
                m576aerfabrica,
                m576aermodelo,
                m576aernumseri,
                m576aeranyofab,
                m576aerpesomax,
                m576premarca,
                m576pretipo,
                m576premodelo,
                m576prenumiden,
                m576preclasif,
                m576prematricu,
                m576base,
                m576basereduc,
                m576tipoliq,
                m576cuota,
                m576deduclinea,
                m576cuotaing,
                m576deducir,
                m576totalliq,
                m576telefrepre,
                m576nifrepre,
                m576nomrepre,
                m576siglarepre,
                m576sigderepre,
                m576callerepre,
                m576numrepre,
                m576pisorepre,
                m576escrepre,
                m576puertrepre,
                m576munirepre,
                m576provrepre,
                m576cpostrepre,
                m576percont,
                m576telcont,
                m576observa,
                m576impcompen,
                m576sinactiv,
                m576impdevol,
                m576entdevol,
                m576ofidevol,
                m576digidevol,
                m576ctadevol,
                m576cruzefec,
                m576cruzadeu,
                m576cruzcomp,
                m576cruzneg,
                m576impingreso,
                m576entingreso,
                m576ofiingreso,
                m576digiingreso,
                m576ctaingreso,
                m576codelecmat                
                };
            setColumns(array);
            FieldDef arrayf[] = {m576dominio,m576nif,m576ejercicio,m576periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod130des extends TableDef
        {
        // campos
        public FieldDef m130dnif;
        public FieldDef m130dejercicio;
        public FieldDef m130dactividad;
        public FieldDef m130dperiodo;
        public FieldDef m130dagricola;
        public FieldDef m130dtipodir;
        public FieldDef m130dporgastos;
        public FieldDef m130dingreso1;
        public FieldDef m130dingreso2;
        public FieldDef m130dingreso3;
        public FieldDef m130dingreso4;
        public FieldDef m130dingreso5;
        public FieldDef m130dingreso6;
        public FieldDef m130dgastos1;
        public FieldDef m130dgastos2;
        public FieldDef m130dgastos3;
        public FieldDef m130dgastos4;
        public FieldDef m130dgastos5;
        public FieldDef m130dgastos6;
        public FieldDef m130dgastos7;
        public FieldDef m130dgastos8;
        public FieldDef m130dgastos9;
        public FieldDef m130dgastos10;
        public FieldDef m130dgastos11;
        public FieldDef m130dgastos12;
        public FieldDef m130dgastos13;
        public FieldDef m130dgastos14;
        public FieldDef m130dgastos15;
        public FieldDef m130dgastos16;
        public FieldDef m130dgastos17;
        public FieldDef m130dgastos18;
        public FieldDef m130dgastos19;
        public FieldDef m130dgastos20;
        public FieldDef m130dgastos21;
        public FieldDef m130dgastos22;
        public FieldDef m130dretencion;
        public FieldDef m130denlacejeo;
        public FieldDef m130dliqirpf;
        public TabMod130des(String name)
            {
            super(name);
            m130dnif = new FieldDef("m130dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m130dejercicio = new FieldDef("m130dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m130dactividad = new FieldDef("m130dactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m130dperiodo = new FieldDef("m130dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m130dagricola = new FieldDef("m130dagricola",FieldDef.CHAR,1);
            m130dtipodir = new FieldDef("m130dtipodir",FieldDef.CHAR,3);
            m130dporgastos = new FieldDef("m130dporgastos",FieldDef.FLOAT,6,0);
            m130dingreso1 = new FieldDef("m130dingreso1",FieldDef.FLOAT,6,0);
            m130dingreso2 = new FieldDef("m130dingreso2",FieldDef.FLOAT,6,0);
            m130dingreso3 = new FieldDef("m130dingreso3",FieldDef.FLOAT,6,0);
            m130dingreso4 = new FieldDef("m130dingreso4",FieldDef.FLOAT,6,0);
            m130dingreso5 = new FieldDef("m130dingreso5",FieldDef.FLOAT,6,0);
            m130dingreso6 = new FieldDef("m130dingreso6",FieldDef.FLOAT,6,0);
            m130dgastos1 = new FieldDef("m130dgastos1",FieldDef.FLOAT,6,0);
            m130dgastos2 = new FieldDef("m130dgastos2",FieldDef.FLOAT,6,0);
            m130dgastos3 = new FieldDef("m130dgastos3",FieldDef.FLOAT,6,0);
            m130dgastos4 = new FieldDef("m130dgastos4",FieldDef.FLOAT,6,0);
            m130dgastos5 = new FieldDef("m130dgastos5",FieldDef.FLOAT,6,0);
            m130dgastos6 = new FieldDef("m130dgastos6",FieldDef.FLOAT,6,0);
            m130dgastos7 = new FieldDef("m130dgastos7",FieldDef.FLOAT,6,0);
            m130dgastos8 = new FieldDef("m130dgastos8",FieldDef.FLOAT,6,0);
            m130dgastos9 = new FieldDef("m130dgastos9",FieldDef.FLOAT,6,0);
            m130dgastos10 = new FieldDef("m130dgastos10",FieldDef.FLOAT,6,0);
            m130dgastos11 = new FieldDef("m130dgastos11",FieldDef.FLOAT,6,0);
            m130dgastos12 = new FieldDef("m130dgastos12",FieldDef.FLOAT,6,0);
            m130dgastos13 = new FieldDef("m130dgastos13",FieldDef.FLOAT,6,0);
            m130dgastos14 = new FieldDef("m130dgastos14",FieldDef.FLOAT,6,0);
            m130dgastos15 = new FieldDef("m130dgastos15",FieldDef.FLOAT,6,0);
            m130dgastos16 = new FieldDef("m130dgastos16",FieldDef.FLOAT,6,0);
            m130dgastos17 = new FieldDef("m130dgastos17",FieldDef.FLOAT,6,0);
            m130dgastos18 = new FieldDef("m130dgastos18",FieldDef.FLOAT,6,0);
            m130dgastos19 = new FieldDef("m130dgastos19",FieldDef.FLOAT,6,0);
            m130dgastos20 = new FieldDef("m130dgastos20",FieldDef.FLOAT,6,0);
            m130dgastos21 = new FieldDef("m130dgastos21",FieldDef.FLOAT,6,0);
            m130dgastos22 = new FieldDef("m130dgastos22",FieldDef.FLOAT,6,0);
            m130dretencion = new FieldDef("m130dretencion",FieldDef.FLOAT,6,0);
            m130denlacejeo = new FieldDef("m130denlacejeo",FieldDef.CHAR,12);
            m130dliqirpf = new FieldDef("m130dliqirpf",FieldDef.CHAR,1);
            FieldDef array[] = {
                m130dnif,
                m130dejercicio,
                m130dactividad,
                m130dperiodo,
                m130dagricola,
                m130dtipodir,
                m130dporgastos,
                m130dingreso1,
                m130dingreso2,
                m130dingreso3,
                m130dingreso4,
                m130dingreso5,
                m130dingreso6,
                m130dgastos1,
                m130dgastos2,
                m130dgastos3,
                m130dgastos4,
                m130dgastos5,
                m130dgastos6,
                m130dgastos7,
                m130dgastos8,
                m130dgastos9,
                m130dgastos10,
                m130dgastos11,
                m130dgastos12,
                m130dgastos13,
                m130dgastos14,
                m130dgastos15,
                m130dgastos16,
                m130dgastos17,
                m130dgastos18,
                m130dgastos19,
                m130dgastos20,
                m130dgastos21,
                m130dgastos22,
                m130dretencion,
                m130denlacejeo,
                m130dliqirpf                
                };
            setColumns(array);
            FieldDef arrayf[] = {m130dnif,m130dejercicio,m130dactividad,m130dperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p1 extends TableDef
        {
        // campos
        public FieldDef m36p1dominio;
        public FieldDef m36p1nif;
        public FieldDef m36p1ejercicio;
        public FieldDef m36p1periodo;
        public FieldDef m36p1modelo;
        public FieldDef m36p1razon;
        public FieldDef m36p1fechacrea;
        public FieldDef m36p1moda;
        public FieldDef m36p1ach110;
        public FieldDef m36p1ach111;
        public FieldDef m36p1modb;
        public FieldDef m36p1bch120;
        public FieldDef m36p1bch121;
        public FieldDef m36p1bch122;
        public FieldDef m36p1bch123;
        public FieldDef m36p1bch124;
        public FieldDef m36p1bch125;
        public FieldDef m36p1bch126;
        public FieldDef m36p1bch127;
        public FieldDef m36p1bch128;
        public FieldDef m36p1bch129;
        public FieldDef m36p1bch130;
        public FieldDef m36p1bch131;
        public FieldDef m36p1bch132;
        public FieldDef m36p1bch133;
        public FieldDef m36p1bch134;
        public FieldDef m36p1bch135;
        public FieldDef m36p1bch136;
        public FieldDef m36p1bch137;
        public FieldDef m36p1bch138;
        public FieldDef m36p1bch139;
        public FieldDef m36p1bch140;
        public FieldDef m36p1bfcesed;
        public FieldDef m36p1bfcesem;
        public FieldDef m36p1bfcesea;
        public FieldDef m36p1modc;
        public FieldDef m36p1cch150;
        public FieldDef m36p1ccausa;
        public FieldDef m36p1cfbajad;
        public FieldDef m36p1cfbajam;
        public FieldDef m36p1cfbajaa;
        public FieldDef m36p1lugar;
        public FieldDef m36p1flugard;
        public FieldDef m36p1flugarm;
        public FieldDef m36p1flugara;
        public FieldDef m36p1firmacal;
        public FieldDef m36p1firma;
        public FieldDef m36p1nombre;
        public FieldDef m36p1bch142;
        public FieldDef m36p1bch143;
        public FieldDef m36p1versio;
        public TabMod036p1(String name)
            {
            super(name);
            m36p1dominio = new FieldDef("m36p1dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p1nif = new FieldDef("m36p1nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p1ejercicio = new FieldDef("m36p1ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p1periodo = new FieldDef("m36p1periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p1modelo = new FieldDef("m36p1modelo",FieldDef.CHAR,3);
            m36p1razon = new FieldDef("m36p1razon",FieldDef.CHAR,125);
            m36p1fechacrea = new FieldDef("m36p1fechacrea",FieldDef.DATE);
            m36p1moda = new FieldDef("m36p1moda",FieldDef.CHAR,1);
            m36p1ach110 = new FieldDef("m36p1ach110",FieldDef.CHAR,1);
            m36p1ach111 = new FieldDef("m36p1ach111",FieldDef.CHAR,1);
            m36p1modb = new FieldDef("m36p1modb",FieldDef.CHAR,1);
            m36p1bch120 = new FieldDef("m36p1bch120",FieldDef.CHAR,1);
            m36p1bch121 = new FieldDef("m36p1bch121",FieldDef.CHAR,1);
            m36p1bch122 = new FieldDef("m36p1bch122",FieldDef.CHAR,1);
            m36p1bch123 = new FieldDef("m36p1bch123",FieldDef.CHAR,1);
            m36p1bch124 = new FieldDef("m36p1bch124",FieldDef.CHAR,1);
            m36p1bch125 = new FieldDef("m36p1bch125",FieldDef.CHAR,1);
            m36p1bch126 = new FieldDef("m36p1bch126",FieldDef.CHAR,1);
            m36p1bch127 = new FieldDef("m36p1bch127",FieldDef.CHAR,1);
            m36p1bch128 = new FieldDef("m36p1bch128",FieldDef.CHAR,1);
            m36p1bch129 = new FieldDef("m36p1bch129",FieldDef.CHAR,1);
            m36p1bch130 = new FieldDef("m36p1bch130",FieldDef.CHAR,1);
            m36p1bch131 = new FieldDef("m36p1bch131",FieldDef.CHAR,1);
            m36p1bch132 = new FieldDef("m36p1bch132",FieldDef.CHAR,1);
            m36p1bch133 = new FieldDef("m36p1bch133",FieldDef.CHAR,1);
            m36p1bch134 = new FieldDef("m36p1bch134",FieldDef.CHAR,1);
            m36p1bch135 = new FieldDef("m36p1bch135",FieldDef.CHAR,1);
            m36p1bch136 = new FieldDef("m36p1bch136",FieldDef.CHAR,1);
            m36p1bch137 = new FieldDef("m36p1bch137",FieldDef.CHAR,1);
            m36p1bch138 = new FieldDef("m36p1bch138",FieldDef.CHAR,1);
            m36p1bch139 = new FieldDef("m36p1bch139",FieldDef.CHAR,1);
            m36p1bch140 = new FieldDef("m36p1bch140",FieldDef.CHAR,1);
            m36p1bfcesed = new FieldDef("m36p1bfcesed",FieldDef.INTEGER,0);
            m36p1bfcesem = new FieldDef("m36p1bfcesem",FieldDef.INTEGER,0);
            m36p1bfcesea = new FieldDef("m36p1bfcesea",FieldDef.INTEGER,0);
            m36p1modc = new FieldDef("m36p1modc",FieldDef.CHAR,1);
            m36p1cch150 = new FieldDef("m36p1cch150",FieldDef.CHAR,1);
            m36p1ccausa = new FieldDef("m36p1ccausa",FieldDef.CHAR,1);
            m36p1cfbajad = new FieldDef("m36p1cfbajad",FieldDef.INTEGER,0);
            m36p1cfbajam = new FieldDef("m36p1cfbajam",FieldDef.INTEGER,0);
            m36p1cfbajaa = new FieldDef("m36p1cfbajaa",FieldDef.INTEGER,0);
            m36p1lugar = new FieldDef("m36p1lugar",FieldDef.CHAR,40);
            m36p1flugard = new FieldDef("m36p1flugard",FieldDef.INTEGER,0);
            m36p1flugarm = new FieldDef("m36p1flugarm",FieldDef.INTEGER,0);
            m36p1flugara = new FieldDef("m36p1flugara",FieldDef.INTEGER,0);
            m36p1firmacal = new FieldDef("m36p1firmacal",FieldDef.CHAR,1);
            m36p1firma = new FieldDef("m36p1firma",FieldDef.CHAR,125);
            m36p1nombre = new FieldDef("m36p1nombre",FieldDef.CHAR,25);
            m36p1bch142 = new FieldDef("m36p1bch142",FieldDef.CHAR,1);
            m36p1bch143 = new FieldDef("m36p1bch143",FieldDef.CHAR,1);
            m36p1versio = new FieldDef("m36p1versio",FieldDef.CHAR,8);
            FieldDef array[] = {
                m36p1dominio,
                m36p1nif,
                m36p1ejercicio,
                m36p1periodo,
                m36p1modelo,
                m36p1razon,
                m36p1fechacrea,
                m36p1moda,
                m36p1ach110,
                m36p1ach111,
                m36p1modb,
                m36p1bch120,
                m36p1bch121,
                m36p1bch122,
                m36p1bch123,
                m36p1bch124,
                m36p1bch125,
                m36p1bch126,
                m36p1bch127,
                m36p1bch128,
                m36p1bch129,
                m36p1bch130,
                m36p1bch131,
                m36p1bch132,
                m36p1bch133,
                m36p1bch134,
                m36p1bch135,
                m36p1bch136,
                m36p1bch137,
                m36p1bch138,
                m36p1bch139,
                m36p1bch140,
                m36p1bfcesed,
                m36p1bfcesem,
                m36p1bfcesea,
                m36p1modc,
                m36p1cch150,
                m36p1ccausa,
                m36p1cfbajad,
                m36p1cfbajam,
                m36p1cfbajaa,
                m36p1lugar,
                m36p1flugard,
                m36p1flugarm,
                m36p1flugara,
                m36p1firmacal,
                m36p1firma,
                m36p1nombre,
                m36p1bch142,
                m36p1bch143,
                m36p1versio                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p1dominio,m36p1nif,m36p1ejercicio,m36p1periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p2b extends TableDef
        {
        // campos
        public FieldDef m36p2bdominio;
        public FieldDef m36p2bnif;
        public FieldDef m36p2bejercicio;
        public FieldDef m36p2bperiodo;
        public FieldDef m36p2b1b2;
        public FieldDef m36p2b3;
        public FieldDef m36p2b4;
        public FieldDef m36p2b5;
        public FieldDef m36p2b6;
        public FieldDef m36p2b7;
        public FieldDef m36p2b8;
        public FieldDef m36p2b9;
        public FieldDef m36p2b10;
        public FieldDef m36p2b11;
        public FieldDef m36p2b12;
        public FieldDef m36p2b13;
        public FieldDef m36p2b14;
        public FieldDef m36p2b15;
        public FieldDef m36p2b16;
        public FieldDef m36p2b17;
        public FieldDef m36p2b18;
        public FieldDef m36p2b19;
        public FieldDef m36p2b20;
        public FieldDef m36p2b21;
        public FieldDef m36p2b22;
        public FieldDef m36p2b23;
        public FieldDef m36p2b24;
        public FieldDef m36p2b24m;
        public FieldDef m36p2b25;
        public FieldDef m36p2b26;
        public FieldDef m36p2b27;
        public FieldDef m36p2b28;
        public FieldDef m36p2b29;
        public FieldDef m36p2b31;
        public FieldDef m36p2b32;
        public FieldDef m36p2b34;
        public FieldDef m36p2b99;
        public FieldDef m36p2b33;
        public FieldDef m36p2b35;
        public FieldDef m36p2b36;
        public FieldDef m36p2b37;
        public FieldDef m36p2b38;
        public FieldDef m36p2b39;
        public FieldDef m36p2b40;
        public FieldDef m36p2b41;
        public FieldDef m36p2b42;
        public FieldDef m36p2b43;
        public FieldDef m36p2b44;
        public FieldDef m36p2b45;
        public FieldDef m36p2b46;
        public FieldDef m36p2b47;
        public FieldDef m36p2b48;
        public FieldDef m36p2b49;
        public FieldDef m36p2b50;
        public FieldDef m36p2b51;
        public FieldDef m36p2b52;
        public FieldDef m36p2b53;
        public FieldDef m36p2b54;
        public FieldDef m36p2b54m;
        public FieldDef m36p2b55;
        public FieldDef m36p2b70;
        public FieldDef m36p2b56;
        public FieldDef m36p2b57;
        public FieldDef m36p2b58;
        public FieldDef m36p2b59;
        public FieldDef m36p2b60;
        public FieldDef m36p2b61;
        public FieldDef m36p2b62;
        public FieldDef m36p2b63;
        public FieldDef m36p2b64;
        public FieldDef m36p2b65;
        public FieldDef m36p2b66;
        public FieldDef m36p2b67;
        public FieldDef m36p2b68;
        public FieldDef m36p2b69;
        public FieldDef m36p2b71;
        public FieldDef m36p2b72;
        public FieldDef m36p2b73;
        public FieldDef m36p2b74;
        public FieldDef m36p2b75;
        public FieldDef m36p2b76;
        public FieldDef m36p2b77;
        public FieldDef m36p2b78;
        public FieldDef m36p2b79;
        public FieldDef m36p2b80;
        public FieldDef m36p2b81;
        public FieldDef m36p2b82;
        public FieldDef m36p2b83;
        public FieldDef m36p2b84;
        public FieldDef m36p2b84m;
        public FieldDef m36p2b85;
        public FieldDef m36p2b86;
        public FieldDef m36p2b87;
        public FieldDef m36p2b88;
        public FieldDef m36p2bb65;
        public FieldDef m36p2bb68;
        public FieldDef m36p2bb69;
        public FieldDef m36p2bb70;
        public FieldDef m36p2bb71;
        public FieldDef m36p2bb72;
        public FieldDef m36p2bb73;
        public FieldDef m36p2bb74;
        public FieldDef m36p2bb75;
        public FieldDef m36p2bb76;
        public FieldDef m36p2bb77;
        public FieldDef m36p2bb78;
        public FieldDef m36p2bb79;
        public FieldDef m36p2b91;
        public FieldDef m36p2b92;
        public FieldDef m36p2b93;
        public FieldDef m36p2b94;
        public FieldDef m36p2b95;
        public FieldDef m36p2b96;
        public FieldDef m36p2b97;
        public FieldDef m36p2b98;
        public FieldDef m36p2b30;
        public FieldDef m36p2b90;
        public FieldDef m36p2bidomi;
        public FieldDef m36p2b26y17;
        public FieldDef m36p2b27y17;
        public FieldDef m36p2b38y17;
        public FieldDef m36p2b28y17;
        public FieldDef m36p2b29y17;
        public FieldDef m36p2b39y17;
        public FieldDef m36p2b40y17;
        public FieldDef m36p2b26y18;
        public FieldDef m36p2b29y18;
        public FieldDef m36p2bbjtm;
        public FieldDef m36p2bbjem;
        public FieldDef m36p2bfecresfis;
        public TabMod036p2b(String name)
            {
            super(name);
            m36p2bdominio = new FieldDef("m36p2bdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p2bnif = new FieldDef("m36p2bnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p2bejercicio = new FieldDef("m36p2bejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p2bperiodo = new FieldDef("m36p2bperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p2b1b2 = new FieldDef("m36p2b1b2",FieldDef.CHAR,1);
            m36p2b3 = new FieldDef("m36p2b3",FieldDef.CHAR,2);
            m36p2b4 = new FieldDef("m36p2b4",FieldDef.CHAR,9);
            m36p2b5 = new FieldDef("m36p2b5",FieldDef.CHAR,125);
            m36p2b6 = new FieldDef("m36p2b6",FieldDef.CHAR,25);
            m36p2b7 = new FieldDef("m36p2b7",FieldDef.CHAR,40);
            m36p2b8 = new FieldDef("m36p2b8",FieldDef.DATE);
            m36p2b9 = new FieldDef("m36p2b9",FieldDef.DATE);
            m36p2b10 = new FieldDef("m36p2b10",FieldDef.DATE);
            m36p2b11 = new FieldDef("m36p2b11",FieldDef.CHAR,5);
            m36p2b12 = new FieldDef("m36p2b12",FieldDef.CHAR,50);
            m36p2b13 = new FieldDef("m36p2b13",FieldDef.CHAR,3);
            m36p2b14 = new FieldDef("m36p2b14",FieldDef.INTEGER,0);
            m36p2b15 = new FieldDef("m36p2b15",FieldDef.CHAR,3);
            m36p2b16 = new FieldDef("m36p2b16",FieldDef.CHAR,3);
            m36p2b17 = new FieldDef("m36p2b17",FieldDef.CHAR,3);
            m36p2b18 = new FieldDef("m36p2b18",FieldDef.CHAR,3);
            m36p2b19 = new FieldDef("m36p2b19",FieldDef.CHAR,3);
            m36p2b20 = new FieldDef("m36p2b20",FieldDef.CHAR,3);
            m36p2b21 = new FieldDef("m36p2b21",FieldDef.CHAR,40);
            m36p2b22 = new FieldDef("m36p2b22",FieldDef.CHAR,30);
            m36p2b23 = new FieldDef("m36p2b23",FieldDef.CHAR,5);
            m36p2b24 = new FieldDef("m36p2b24",FieldDef.CHAR,30);
            m36p2b24m = new FieldDef("m36p2b24m",FieldDef.CHAR,5);
            m36p2b25 = new FieldDef("m36p2b25",FieldDef.CHAR,2);
            m36p2b26 = new FieldDef("m36p2b26",FieldDef.INTEGER,0);
            m36p2b27 = new FieldDef("m36p2b27",FieldDef.INTEGER,0);
            m36p2b28 = new FieldDef("m36p2b28",FieldDef.INTEGER,0);
            m36p2b29 = new FieldDef("m36p2b29",FieldDef.CHAR,100);
            m36p2b31 = new FieldDef("m36p2b31",FieldDef.CHAR,50);
            m36p2b32 = new FieldDef("m36p2b32",FieldDef.CHAR,40);
            m36p2b34 = new FieldDef("m36p2b34",FieldDef.CHAR,30);
            m36p2b99 = new FieldDef("m36p2b99",FieldDef.CHAR,100);
            m36p2b33 = new FieldDef("m36p2b33",FieldDef.CHAR,10);
            m36p2b35 = new FieldDef("m36p2b35",FieldDef.CHAR,30);
            m36p2b36 = new FieldDef("m36p2b36",FieldDef.CHAR,30);
            m36p2b37 = new FieldDef("m36p2b37",FieldDef.CHAR,2);
            m36p2b38 = new FieldDef("m36p2b38",FieldDef.CHAR,15);
            m36p2b39 = new FieldDef("m36p2b39",FieldDef.CHAR,15);
            m36p2b40 = new FieldDef("m36p2b40",FieldDef.CHAR,15);
            m36p2b41 = new FieldDef("m36p2b41",FieldDef.CHAR,5);
            m36p2b42 = new FieldDef("m36p2b42",FieldDef.CHAR,50);
            m36p2b43 = new FieldDef("m36p2b43",FieldDef.CHAR,3);
            m36p2b44 = new FieldDef("m36p2b44",FieldDef.INTEGER,0);
            m36p2b45 = new FieldDef("m36p2b45",FieldDef.CHAR,3);
            m36p2b46 = new FieldDef("m36p2b46",FieldDef.CHAR,3);
            m36p2b47 = new FieldDef("m36p2b47",FieldDef.CHAR,3);
            m36p2b48 = new FieldDef("m36p2b48",FieldDef.CHAR,3);
            m36p2b49 = new FieldDef("m36p2b49",FieldDef.CHAR,3);
            m36p2b50 = new FieldDef("m36p2b50",FieldDef.CHAR,3);
            m36p2b51 = new FieldDef("m36p2b51",FieldDef.CHAR,40);
            m36p2b52 = new FieldDef("m36p2b52",FieldDef.CHAR,30);
            m36p2b53 = new FieldDef("m36p2b53",FieldDef.CHAR,5);
            m36p2b54 = new FieldDef("m36p2b54",FieldDef.CHAR,30);
            m36p2b54m = new FieldDef("m36p2b54m",FieldDef.CHAR,5);
            m36p2b55 = new FieldDef("m36p2b55",FieldDef.CHAR,2);
            m36p2b70 = new FieldDef("m36p2b70",FieldDef.CHAR,100);
            m36p2b56 = new FieldDef("m36p2b56",FieldDef.INTEGER,0);
            m36p2b57 = new FieldDef("m36p2b57",FieldDef.INTEGER,0);
            m36p2b58 = new FieldDef("m36p2b58",FieldDef.INTEGER,0);
            m36p2b59 = new FieldDef("m36p2b59",FieldDef.CHAR,50);
            m36p2b60 = new FieldDef("m36p2b60",FieldDef.CHAR,2);
            m36p2b61 = new FieldDef("m36p2b61",FieldDef.INTEGER,0);
            m36p2b62 = new FieldDef("m36p2b62",FieldDef.CHAR,30);
            m36p2b63 = new FieldDef("m36p2b63",FieldDef.CHAR,5);
            m36p2b64 = new FieldDef("m36p2b64",FieldDef.CHAR,2);
            m36p2b65 = new FieldDef("m36p2b65",FieldDef.INTEGER,0);
            m36p2b66 = new FieldDef("m36p2b66",FieldDef.INTEGER,0);
            m36p2b67 = new FieldDef("m36p2b67",FieldDef.INTEGER,0);
            m36p2b68 = new FieldDef("m36p2b68",FieldDef.CHAR,50);
            m36p2b69 = new FieldDef("m36p2b69",FieldDef.CHAR,2);
            m36p2b71 = new FieldDef("m36p2b71",FieldDef.CHAR,5);
            m36p2b72 = new FieldDef("m36p2b72",FieldDef.CHAR,50);
            m36p2b73 = new FieldDef("m36p2b73",FieldDef.CHAR,3);
            m36p2b74 = new FieldDef("m36p2b74",FieldDef.INTEGER,0);
            m36p2b75 = new FieldDef("m36p2b75",FieldDef.CHAR,3);
            m36p2b76 = new FieldDef("m36p2b76",FieldDef.CHAR,3);
            m36p2b77 = new FieldDef("m36p2b77",FieldDef.CHAR,3);
            m36p2b78 = new FieldDef("m36p2b78",FieldDef.CHAR,3);
            m36p2b79 = new FieldDef("m36p2b79",FieldDef.CHAR,3);
            m36p2b80 = new FieldDef("m36p2b80",FieldDef.CHAR,3);
            m36p2b81 = new FieldDef("m36p2b81",FieldDef.CHAR,40);
            m36p2b82 = new FieldDef("m36p2b82",FieldDef.CHAR,30);
            m36p2b83 = new FieldDef("m36p2b83",FieldDef.CHAR,5);
            m36p2b84 = new FieldDef("m36p2b84",FieldDef.CHAR,30);
            m36p2b84m = new FieldDef("m36p2b84m",FieldDef.CHAR,5);
            m36p2b85 = new FieldDef("m36p2b85",FieldDef.CHAR,2);
            m36p2b86 = new FieldDef("m36p2b86",FieldDef.INTEGER,0);
            m36p2b87 = new FieldDef("m36p2b87",FieldDef.INTEGER,0);
            m36p2b88 = new FieldDef("m36p2b88",FieldDef.INTEGER,0);
            m36p2bb65 = new FieldDef("m36p2bb65",FieldDef.CHAR,1);
            m36p2bb68 = new FieldDef("m36p2bb68",FieldDef.CHAR,1);
            m36p2bb69 = new FieldDef("m36p2bb69",FieldDef.CHAR,2);
            m36p2bb70 = new FieldDef("m36p2bb70",FieldDef.CHAR,1);
            m36p2bb71 = new FieldDef("m36p2bb71",FieldDef.CHAR,2);
            m36p2bb72 = new FieldDef("m36p2bb72",FieldDef.CHAR,1);
            m36p2bb73 = new FieldDef("m36p2bb73",FieldDef.CHAR,2);
            m36p2bb74 = new FieldDef("m36p2bb74",FieldDef.CHAR,1);
            m36p2bb75 = new FieldDef("m36p2bb75",FieldDef.CHAR,2);
            m36p2bb76 = new FieldDef("m36p2bb76",FieldDef.CHAR,1);
            m36p2bb77 = new FieldDef("m36p2bb77",FieldDef.CHAR,2);
            m36p2bb78 = new FieldDef("m36p2bb78",FieldDef.CHAR,1);
            m36p2bb79 = new FieldDef("m36p2bb79",FieldDef.CHAR,2);
            m36p2b91 = new FieldDef("m36p2b91",FieldDef.CHAR,1);
            m36p2b92 = new FieldDef("m36p2b92",FieldDef.INTEGER,0);
            m36p2b93 = new FieldDef("m36p2b93",FieldDef.CHAR,9);
            m36p2b94 = new FieldDef("m36p2b94",FieldDef.CHAR,40);
            m36p2b95 = new FieldDef("m36p2b95",FieldDef.CHAR,9);
            m36p2b96 = new FieldDef("m36p2b96",FieldDef.CHAR,40);
            m36p2b97 = new FieldDef("m36p2b97",FieldDef.CHAR,9);
            m36p2b98 = new FieldDef("m36p2b98",FieldDef.CHAR,40);
            m36p2b30 = new FieldDef("m36p2b30",FieldDef.CHAR,20);
            m36p2b90 = new FieldDef("m36p2b90",FieldDef.CHAR,25);
            m36p2bidomi = new FieldDef("m36p2bidomi",FieldDef.CHAR,1);
            m36p2b26y17 = new FieldDef("m36p2b26y17",FieldDef.INTEGER,0);
            m36p2b27y17 = new FieldDef("m36p2b27y17",FieldDef.INTEGER,0);
            m36p2b38y17 = new FieldDef("m36p2b38y17",FieldDef.CHAR,100);
            m36p2b28y17 = new FieldDef("m36p2b28y17",FieldDef.CHAR,15);
            m36p2b29y17 = new FieldDef("m36p2b29y17",FieldDef.CHAR,15);
            m36p2b39y17 = new FieldDef("m36p2b39y17",FieldDef.CHAR,100);
            m36p2b40y17 = new FieldDef("m36p2b40y17",FieldDef.CHAR,1);
            m36p2b26y18 = new FieldDef("m36p2b26y18",FieldDef.CHAR,4);
            m36p2b29y18 = new FieldDef("m36p2b29y18",FieldDef.CHAR,100);
            m36p2bbjtm = new FieldDef("m36p2bbjtm",FieldDef.CHAR,1);
            m36p2bbjem = new FieldDef("m36p2bbjem",FieldDef.CHAR,1);
            m36p2bfecresfis = new FieldDef("m36p2bfecresfis",FieldDef.DATE);
            FieldDef array[] = {
                m36p2bdominio,
                m36p2bnif,
                m36p2bejercicio,
                m36p2bperiodo,
                m36p2b1b2,
                m36p2b3,
                m36p2b4,
                m36p2b5,
                m36p2b6,
                m36p2b7,
                m36p2b8,
                m36p2b9,
                m36p2b10,
                m36p2b11,
                m36p2b12,
                m36p2b13,
                m36p2b14,
                m36p2b15,
                m36p2b16,
                m36p2b17,
                m36p2b18,
                m36p2b19,
                m36p2b20,
                m36p2b21,
                m36p2b22,
                m36p2b23,
                m36p2b24,
                m36p2b24m,
                m36p2b25,
                m36p2b26,
                m36p2b27,
                m36p2b28,
                m36p2b29,
                m36p2b31,
                m36p2b32,
                m36p2b34,
                m36p2b99,
                m36p2b33,
                m36p2b35,
                m36p2b36,
                m36p2b37,
                m36p2b38,
                m36p2b39,
                m36p2b40,
                m36p2b41,
                m36p2b42,
                m36p2b43,
                m36p2b44,
                m36p2b45,
                m36p2b46,
                m36p2b47,
                m36p2b48,
                m36p2b49,
                m36p2b50,
                m36p2b51,
                m36p2b52,
                m36p2b53,
                m36p2b54,
                m36p2b54m,
                m36p2b55,
                m36p2b70,
                m36p2b56,
                m36p2b57,
                m36p2b58,
                m36p2b59,
                m36p2b60,
                m36p2b61,
                m36p2b62,
                m36p2b63,
                m36p2b64,
                m36p2b65,
                m36p2b66,
                m36p2b67,
                m36p2b68,
                m36p2b69,
                m36p2b71,
                m36p2b72,
                m36p2b73,
                m36p2b74,
                m36p2b75,
                m36p2b76,
                m36p2b77,
                m36p2b78,
                m36p2b79,
                m36p2b80,
                m36p2b81,
                m36p2b82,
                m36p2b83,
                m36p2b84,
                m36p2b84m,
                m36p2b85,
                m36p2b86,
                m36p2b87,
                m36p2b88,
                m36p2bb65,
                m36p2bb68,
                m36p2bb69,
                m36p2bb70,
                m36p2bb71,
                m36p2bb72,
                m36p2bb73,
                m36p2bb74,
                m36p2bb75,
                m36p2bb76,
                m36p2bb77,
                m36p2bb78,
                m36p2bb79,
                m36p2b91,
                m36p2b92,
                m36p2b93,
                m36p2b94,
                m36p2b95,
                m36p2b96,
                m36p2b97,
                m36p2b98,
                m36p2b30,
                m36p2b90,
                m36p2bidomi,
                m36p2b26y17,
                m36p2b27y17,
                m36p2b38y17,
                m36p2b28y17,
                m36p2b29y17,
                m36p2b39y17,
                m36p2b40y17,
                m36p2b26y18,
                m36p2b29y18,
                m36p2bbjtm,
                m36p2bbjem,
                m36p2bfecresfis                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p2bdominio,m36p2bnif,m36p2bejercicio,m36p2bperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p2c extends TableDef
        {
        // campos
        public FieldDef m36p2cdominio;
        public FieldDef m36p2cnif;
        public FieldDef m36p2cejercicio;
        public FieldDef m36p2cperiodo;
        public FieldDef m36p2c1;
        public FieldDef m36p2c2;
        public FieldDef m36p2c3;
        public FieldDef m36p2c4;
        public FieldDef m36p2c5;
        public FieldDef m36p2c6;
        public FieldDef m36p2c7;
        public FieldDef m36p2c8;
        public FieldDef m36p2c11;
        public FieldDef m36p2c12;
        public FieldDef m36p2c13;
        public FieldDef m36p2c14;
        public FieldDef m36p2c15;
        public FieldDef m36p2c16;
        public FieldDef m36p2c17;
        public FieldDef m36p2c18;
        public FieldDef m36p2c19;
        public FieldDef m36p2c20;
        public FieldDef m36p2c21;
        public FieldDef m36p2c22;
        public FieldDef m36p2c23;
        public FieldDef m36p2c24;
        public FieldDef m36p2c24m;
        public FieldDef m36p2c25;
        public FieldDef m36p2c26;
        public FieldDef m36p2c27;
        public FieldDef m36p2c28;
        public FieldDef m36p2c29;
        public FieldDef m36p2c41;
        public FieldDef m36p2c42;
        public FieldDef m36p2c43;
        public FieldDef m36p2c44;
        public FieldDef m36p2c45;
        public FieldDef m36p2c46;
        public FieldDef m36p2c47;
        public FieldDef m36p2c48;
        public FieldDef m36p2c49;
        public FieldDef m36p2c50;
        public FieldDef m36p2c51;
        public FieldDef m36p2c52;
        public FieldDef m36p2c53;
        public FieldDef m36p2c54;
        public FieldDef m36p2c54m;
        public FieldDef m36p2c55;
        public FieldDef m36p2c56;
        public FieldDef m36p2c57;
        public FieldDef m36p2c58;
        public FieldDef m36p2c59;
        public FieldDef m36p2c60;
        public FieldDef m36p2c61;
        public FieldDef m36p2c62;
        public FieldDef m36p2c63;
        public FieldDef m36p2c64;
        public FieldDef m36p2c65;
        public FieldDef m36p2c66;
        public FieldDef m36p2c67;
        public FieldDef m36p2c68;
        public FieldDef m36p2c69;
        public FieldDef m36p2c70;
        public FieldDef m36p2c30;
        public FieldDef m36p2c90;
        public FieldDef m36p2c10y17;
        public FieldDef m36p2c26y17;
        public FieldDef m36p2c29y17;
        public FieldDef m36p2c27y17;
        public FieldDef m36p2c28y17;
        public FieldDef m36p2c31y17;
        public FieldDef m36p2c40;
        public FieldDef m36p2c10y18;
        public FieldDef m36p2c28y18;
        public FieldDef m36p2cbjtm;
        public FieldDef m36p2cbjem;
        public TabMod036p2c(String name)
            {
            super(name);
            m36p2cdominio = new FieldDef("m36p2cdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p2cnif = new FieldDef("m36p2cnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p2cejercicio = new FieldDef("m36p2cejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p2cperiodo = new FieldDef("m36p2cperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p2c1 = new FieldDef("m36p2c1",FieldDef.CHAR,9);
            m36p2c2 = new FieldDef("m36p2c2",FieldDef.CHAR,125);
            m36p2c3 = new FieldDef("m36p2c3",FieldDef.CHAR,25);
            m36p2c4 = new FieldDef("m36p2c4",FieldDef.CHAR,2);
            m36p2c5 = new FieldDef("m36p2c5",FieldDef.CHAR,1);
            m36p2c6 = new FieldDef("m36p2c6",FieldDef.CHAR,9);
            m36p2c7 = new FieldDef("m36p2c7",FieldDef.CHAR,125);
            m36p2c8 = new FieldDef("m36p2c8",FieldDef.CHAR,2);
            m36p2c11 = new FieldDef("m36p2c11",FieldDef.CHAR,5);
            m36p2c12 = new FieldDef("m36p2c12",FieldDef.CHAR,50);
            m36p2c13 = new FieldDef("m36p2c13",FieldDef.CHAR,3);
            m36p2c14 = new FieldDef("m36p2c14",FieldDef.INTEGER,0);
            m36p2c15 = new FieldDef("m36p2c15",FieldDef.CHAR,3);
            m36p2c16 = new FieldDef("m36p2c16",FieldDef.CHAR,3);
            m36p2c17 = new FieldDef("m36p2c17",FieldDef.CHAR,3);
            m36p2c18 = new FieldDef("m36p2c18",FieldDef.CHAR,3);
            m36p2c19 = new FieldDef("m36p2c19",FieldDef.CHAR,3);
            m36p2c20 = new FieldDef("m36p2c20",FieldDef.CHAR,3);
            m36p2c21 = new FieldDef("m36p2c21",FieldDef.CHAR,40);
            m36p2c22 = new FieldDef("m36p2c22",FieldDef.CHAR,30);
            m36p2c23 = new FieldDef("m36p2c23",FieldDef.CHAR,5);
            m36p2c24 = new FieldDef("m36p2c24",FieldDef.CHAR,30);
            m36p2c24m = new FieldDef("m36p2c24m",FieldDef.CHAR,5);
            m36p2c25 = new FieldDef("m36p2c25",FieldDef.CHAR,2);
            m36p2c26 = new FieldDef("m36p2c26",FieldDef.INTEGER,0);
            m36p2c27 = new FieldDef("m36p2c27",FieldDef.INTEGER,0);
            m36p2c28 = new FieldDef("m36p2c28",FieldDef.INTEGER,0);
            m36p2c29 = new FieldDef("m36p2c29",FieldDef.CHAR,100);
            m36p2c41 = new FieldDef("m36p2c41",FieldDef.CHAR,5);
            m36p2c42 = new FieldDef("m36p2c42",FieldDef.CHAR,50);
            m36p2c43 = new FieldDef("m36p2c43",FieldDef.CHAR,3);
            m36p2c44 = new FieldDef("m36p2c44",FieldDef.INTEGER,0);
            m36p2c45 = new FieldDef("m36p2c45",FieldDef.CHAR,3);
            m36p2c46 = new FieldDef("m36p2c46",FieldDef.CHAR,3);
            m36p2c47 = new FieldDef("m36p2c47",FieldDef.CHAR,3);
            m36p2c48 = new FieldDef("m36p2c48",FieldDef.CHAR,3);
            m36p2c49 = new FieldDef("m36p2c49",FieldDef.CHAR,3);
            m36p2c50 = new FieldDef("m36p2c50",FieldDef.CHAR,3);
            m36p2c51 = new FieldDef("m36p2c51",FieldDef.CHAR,40);
            m36p2c52 = new FieldDef("m36p2c52",FieldDef.CHAR,30);
            m36p2c53 = new FieldDef("m36p2c53",FieldDef.CHAR,5);
            m36p2c54 = new FieldDef("m36p2c54",FieldDef.CHAR,30);
            m36p2c54m = new FieldDef("m36p2c54m",FieldDef.CHAR,5);
            m36p2c55 = new FieldDef("m36p2c55",FieldDef.CHAR,2);
            m36p2c56 = new FieldDef("m36p2c56",FieldDef.INTEGER,0);
            m36p2c57 = new FieldDef("m36p2c57",FieldDef.INTEGER,0);
            m36p2c58 = new FieldDef("m36p2c58",FieldDef.INTEGER,0);
            m36p2c59 = new FieldDef("m36p2c59",FieldDef.CHAR,50);
            m36p2c60 = new FieldDef("m36p2c60",FieldDef.CHAR,2);
            m36p2c61 = new FieldDef("m36p2c61",FieldDef.INTEGER,0);
            m36p2c62 = new FieldDef("m36p2c62",FieldDef.CHAR,30);
            m36p2c63 = new FieldDef("m36p2c63",FieldDef.CHAR,5);
            m36p2c64 = new FieldDef("m36p2c64",FieldDef.CHAR,2);
            m36p2c65 = new FieldDef("m36p2c65",FieldDef.INTEGER,0);
            m36p2c66 = new FieldDef("m36p2c66",FieldDef.INTEGER,0);
            m36p2c67 = new FieldDef("m36p2c67",FieldDef.INTEGER,0);
            m36p2c68 = new FieldDef("m36p2c68",FieldDef.CHAR,50);
            m36p2c69 = new FieldDef("m36p2c69",FieldDef.CHAR,2);
            m36p2c70 = new FieldDef("m36p2c70",FieldDef.CHAR,100);
            m36p2c30 = new FieldDef("m36p2c30",FieldDef.CHAR,20);
            m36p2c90 = new FieldDef("m36p2c90",FieldDef.CHAR,25);
            m36p2c10y17 = new FieldDef("m36p2c10y17",FieldDef.INTEGER,0);
            m36p2c26y17 = new FieldDef("m36p2c26y17",FieldDef.INTEGER,0);
            m36p2c29y17 = new FieldDef("m36p2c29y17",FieldDef.CHAR,100);
            m36p2c27y17 = new FieldDef("m36p2c27y17",FieldDef.CHAR,15);
            m36p2c28y17 = new FieldDef("m36p2c28y17",FieldDef.CHAR,15);
            m36p2c31y17 = new FieldDef("m36p2c31y17",FieldDef.CHAR,100);
            m36p2c40 = new FieldDef("m36p2c40",FieldDef.CHAR,1);
            m36p2c10y18 = new FieldDef("m36p2c10y18",FieldDef.CHAR,4);
            m36p2c28y18 = new FieldDef("m36p2c28y18",FieldDef.CHAR,100);
            m36p2cbjtm = new FieldDef("m36p2cbjtm",FieldDef.CHAR,1);
            m36p2cbjem = new FieldDef("m36p2cbjem",FieldDef.CHAR,1);
            FieldDef array[] = {
                m36p2cdominio,
                m36p2cnif,
                m36p2cejercicio,
                m36p2cperiodo,
                m36p2c1,
                m36p2c2,
                m36p2c3,
                m36p2c4,
                m36p2c5,
                m36p2c6,
                m36p2c7,
                m36p2c8,
                m36p2c11,
                m36p2c12,
                m36p2c13,
                m36p2c14,
                m36p2c15,
                m36p2c16,
                m36p2c17,
                m36p2c18,
                m36p2c19,
                m36p2c20,
                m36p2c21,
                m36p2c22,
                m36p2c23,
                m36p2c24,
                m36p2c24m,
                m36p2c25,
                m36p2c26,
                m36p2c27,
                m36p2c28,
                m36p2c29,
                m36p2c41,
                m36p2c42,
                m36p2c43,
                m36p2c44,
                m36p2c45,
                m36p2c46,
                m36p2c47,
                m36p2c48,
                m36p2c49,
                m36p2c50,
                m36p2c51,
                m36p2c52,
                m36p2c53,
                m36p2c54,
                m36p2c54m,
                m36p2c55,
                m36p2c56,
                m36p2c57,
                m36p2c58,
                m36p2c59,
                m36p2c60,
                m36p2c61,
                m36p2c62,
                m36p2c63,
                m36p2c64,
                m36p2c65,
                m36p2c66,
                m36p2c67,
                m36p2c68,
                m36p2c69,
                m36p2c70,
                m36p2c30,
                m36p2c90,
                m36p2c10y17,
                m36p2c26y17,
                m36p2c29y17,
                m36p2c27y17,
                m36p2c28y17,
                m36p2c31y17,
                m36p2c40,
                m36p2c10y18,
                m36p2c28y18,
                m36p2cbjtm,
                m36p2cbjem                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p2cdominio,m36p2cnif,m36p2cejercicio,m36p2cperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p3 extends TableDef
        {
        // campos
        public FieldDef m36p3dominio;
        public FieldDef m36p3nif;
        public FieldDef m36p3ejercicio;
        public FieldDef m36p3periodo;
        public FieldDef m36p300;
        public FieldDef m36p303;
        public FieldDef m36p304;
        public FieldDef m36p305;
        public FieldDef m36p306;
        public FieldDef m36p311;
        public FieldDef m36p312;
        public FieldDef m36p313;
        public FieldDef m36p314;
        public FieldDef m36p315;
        public FieldDef m36p316;
        public FieldDef m36p317;
        public FieldDef m36p318;
        public FieldDef m36p319;
        public FieldDef m36p320;
        public FieldDef m36p321;
        public FieldDef m36p322;
        public FieldDef m36p323;
        public FieldDef m36p324m;
        public FieldDef m36p324;
        public FieldDef m36p325;
        public FieldDef m36p326;
        public FieldDef m36p327;
        public FieldDef m36p328;
        public FieldDef m36p330;
        public FieldDef m36p331;
        public FieldDef m36p333;
        public FieldDef m36p334;
        public FieldDef m36p350;
        public FieldDef m36p353;
        public FieldDef m36p354;
        public FieldDef m36p355;
        public FieldDef m36p356;
        public FieldDef m36p361;
        public FieldDef m36p362;
        public FieldDef m36p363;
        public FieldDef m36p364;
        public FieldDef m36p365;
        public FieldDef m36p366;
        public FieldDef m36p367;
        public FieldDef m36p368;
        public FieldDef m36p369;
        public FieldDef m36p370;
        public FieldDef m36p371;
        public FieldDef m36p372;
        public FieldDef m36p373;
        public FieldDef m36p374m;
        public FieldDef m36p374;
        public FieldDef m36p375;
        public FieldDef m36p376;
        public FieldDef m36p377;
        public FieldDef m36p378;
        public FieldDef m36p380;
        public FieldDef m36p381;
        public FieldDef m36p383;
        public FieldDef m36p384;
        public TabMod036p3(String name)
            {
            super(name);
            m36p3dominio = new FieldDef("m36p3dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p3nif = new FieldDef("m36p3nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p3ejercicio = new FieldDef("m36p3ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p3periodo = new FieldDef("m36p3periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p300 = new FieldDef("m36p300",FieldDef.CHAR,1);
            m36p303 = new FieldDef("m36p303",FieldDef.DATE);
            m36p304 = new FieldDef("m36p304",FieldDef.CHAR,9);
            m36p305 = new FieldDef("m36p305",FieldDef.CHAR,125);
            m36p306 = new FieldDef("m36p306",FieldDef.CHAR,1);
            m36p311 = new FieldDef("m36p311",FieldDef.CHAR,5);
            m36p312 = new FieldDef("m36p312",FieldDef.CHAR,50);
            m36p313 = new FieldDef("m36p313",FieldDef.CHAR,3);
            m36p314 = new FieldDef("m36p314",FieldDef.INTEGER,0);
            m36p315 = new FieldDef("m36p315",FieldDef.CHAR,3);
            m36p316 = new FieldDef("m36p316",FieldDef.CHAR,3);
            m36p317 = new FieldDef("m36p317",FieldDef.CHAR,3);
            m36p318 = new FieldDef("m36p318",FieldDef.CHAR,3);
            m36p319 = new FieldDef("m36p319",FieldDef.CHAR,3);
            m36p320 = new FieldDef("m36p320",FieldDef.CHAR,3);
            m36p321 = new FieldDef("m36p321",FieldDef.CHAR,40);
            m36p322 = new FieldDef("m36p322",FieldDef.CHAR,30);
            m36p323 = new FieldDef("m36p323",FieldDef.CHAR,5);
            m36p324m = new FieldDef("m36p324m",FieldDef.CHAR,5);
            m36p324 = new FieldDef("m36p324",FieldDef.CHAR,30);
            m36p325 = new FieldDef("m36p325",FieldDef.CHAR,2);
            m36p326 = new FieldDef("m36p326",FieldDef.INTEGER,0);
            m36p327 = new FieldDef("m36p327",FieldDef.INTEGER,0);
            m36p328 = new FieldDef("m36p328",FieldDef.INTEGER,0);
            m36p330 = new FieldDef("m36p330",FieldDef.CHAR,1);
            m36p331 = new FieldDef("m36p331",FieldDef.INTEGER,0);
            m36p333 = new FieldDef("m36p333",FieldDef.INTEGER,0);
            m36p334 = new FieldDef("m36p334",FieldDef.INTEGER,0);
            m36p350 = new FieldDef("m36p350",FieldDef.CHAR,1);
            m36p353 = new FieldDef("m36p353",FieldDef.DATE);
            m36p354 = new FieldDef("m36p354",FieldDef.CHAR,9);
            m36p355 = new FieldDef("m36p355",FieldDef.CHAR,125);
            m36p356 = new FieldDef("m36p356",FieldDef.CHAR,1);
            m36p361 = new FieldDef("m36p361",FieldDef.CHAR,5);
            m36p362 = new FieldDef("m36p362",FieldDef.CHAR,50);
            m36p363 = new FieldDef("m36p363",FieldDef.CHAR,3);
            m36p364 = new FieldDef("m36p364",FieldDef.INTEGER,0);
            m36p365 = new FieldDef("m36p365",FieldDef.CHAR,3);
            m36p366 = new FieldDef("m36p366",FieldDef.CHAR,3);
            m36p367 = new FieldDef("m36p367",FieldDef.CHAR,3);
            m36p368 = new FieldDef("m36p368",FieldDef.CHAR,3);
            m36p369 = new FieldDef("m36p369",FieldDef.CHAR,3);
            m36p370 = new FieldDef("m36p370",FieldDef.CHAR,3);
            m36p371 = new FieldDef("m36p371",FieldDef.CHAR,40);
            m36p372 = new FieldDef("m36p372",FieldDef.CHAR,30);
            m36p373 = new FieldDef("m36p373",FieldDef.CHAR,5);
            m36p374m = new FieldDef("m36p374m",FieldDef.CHAR,5);
            m36p374 = new FieldDef("m36p374",FieldDef.CHAR,30);
            m36p375 = new FieldDef("m36p375",FieldDef.CHAR,2);
            m36p376 = new FieldDef("m36p376",FieldDef.INTEGER,0);
            m36p377 = new FieldDef("m36p377",FieldDef.INTEGER,0);
            m36p378 = new FieldDef("m36p378",FieldDef.INTEGER,0);
            m36p380 = new FieldDef("m36p380",FieldDef.CHAR,1);
            m36p381 = new FieldDef("m36p381",FieldDef.INTEGER,0);
            m36p383 = new FieldDef("m36p383",FieldDef.INTEGER,0);
            m36p384 = new FieldDef("m36p384",FieldDef.INTEGER,0);
            FieldDef array[] = {
                m36p3dominio,
                m36p3nif,
                m36p3ejercicio,
                m36p3periodo,
                m36p300,
                m36p303,
                m36p304,
                m36p305,
                m36p306,
                m36p311,
                m36p312,
                m36p313,
                m36p314,
                m36p315,
                m36p316,
                m36p317,
                m36p318,
                m36p319,
                m36p320,
                m36p321,
                m36p322,
                m36p323,
                m36p324m,
                m36p324,
                m36p325,
                m36p326,
                m36p327,
                m36p328,
                m36p330,
                m36p331,
                m36p333,
                m36p334,
                m36p350,
                m36p353,
                m36p354,
                m36p355,
                m36p356,
                m36p361,
                m36p362,
                m36p363,
                m36p364,
                m36p365,
                m36p366,
                m36p367,
                m36p368,
                m36p369,
                m36p370,
                m36p371,
                m36p372,
                m36p373,
                m36p374m,
                m36p374,
                m36p375,
                m36p376,
                m36p377,
                m36p378,
                m36p380,
                m36p381,
                m36p383,
                m36p384                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p3dominio,m36p3nif,m36p3ejercicio,m36p3periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p3n extends TableDef
        {
        // campos
        public FieldDef m36p3dominio;
        public FieldDef m36p3nif;
        public FieldDef m36p3ejercicio;
        public FieldDef m36p3periodo;
        public FieldDef m36p3pagina;
        public FieldDef m36p300;
        public FieldDef m36p303;
        public FieldDef m36p304;
        public FieldDef m36p305;
        public FieldDef m36p306;
        public FieldDef m36p311;
        public FieldDef m36p312;
        public FieldDef m36p313;
        public FieldDef m36p314;
        public FieldDef m36p315;
        public FieldDef m36p316;
        public FieldDef m36p317;
        public FieldDef m36p318;
        public FieldDef m36p319;
        public FieldDef m36p320;
        public FieldDef m36p321;
        public FieldDef m36p322;
        public FieldDef m36p323;
        public FieldDef m36p324m;
        public FieldDef m36p324;
        public FieldDef m36p325;
        public FieldDef m36p326;
        public FieldDef m36p327;
        public FieldDef m36p328;
        public FieldDef m36p330;
        public FieldDef m36p331;
        public FieldDef m36p333;
        public FieldDef m36p334;
        public FieldDef m36p350;
        public FieldDef m36p353;
        public FieldDef m36p354;
        public FieldDef m36p355;
        public FieldDef m36p356;
        public FieldDef m36p361;
        public FieldDef m36p362;
        public FieldDef m36p363;
        public FieldDef m36p364;
        public FieldDef m36p365;
        public FieldDef m36p366;
        public FieldDef m36p367;
        public FieldDef m36p368;
        public FieldDef m36p369;
        public FieldDef m36p370;
        public FieldDef m36p371;
        public FieldDef m36p372;
        public FieldDef m36p373;
        public FieldDef m36p374m;
        public FieldDef m36p374;
        public FieldDef m36p375;
        public FieldDef m36p376;
        public FieldDef m36p377;
        public FieldDef m36p378;
        public FieldDef m36p380;
        public FieldDef m36p381;
        public FieldDef m36p383;
        public FieldDef m36p384;
        public FieldDef m36p311y17;
        public FieldDef m36p313y17;
        public FieldDef m36p307;
        public FieldDef m36p308;
        public FieldDef m36p309;
        public FieldDef m36p310;
        public FieldDef m36p361y17;
        public FieldDef m36p363y17;
        public FieldDef m36p357;
        public FieldDef m36p358;
        public FieldDef m36p359;
        public FieldDef m36p360;
        public TabMod036p3n(String name)
            {
            super(name);
            m36p3dominio = new FieldDef("m36p3dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p3nif = new FieldDef("m36p3nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p3ejercicio = new FieldDef("m36p3ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p3periodo = new FieldDef("m36p3periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p3pagina = new FieldDef("m36p3pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p300 = new FieldDef("m36p300",FieldDef.CHAR,1);
            m36p303 = new FieldDef("m36p303",FieldDef.DATE);
            m36p304 = new FieldDef("m36p304",FieldDef.CHAR,9);
            m36p305 = new FieldDef("m36p305",FieldDef.CHAR,125);
            m36p306 = new FieldDef("m36p306",FieldDef.CHAR,1);
            m36p311 = new FieldDef("m36p311",FieldDef.CHAR,5);
            m36p312 = new FieldDef("m36p312",FieldDef.CHAR,50);
            m36p313 = new FieldDef("m36p313",FieldDef.CHAR,3);
            m36p314 = new FieldDef("m36p314",FieldDef.INTEGER,0);
            m36p315 = new FieldDef("m36p315",FieldDef.CHAR,3);
            m36p316 = new FieldDef("m36p316",FieldDef.CHAR,3);
            m36p317 = new FieldDef("m36p317",FieldDef.CHAR,3);
            m36p318 = new FieldDef("m36p318",FieldDef.CHAR,3);
            m36p319 = new FieldDef("m36p319",FieldDef.CHAR,3);
            m36p320 = new FieldDef("m36p320",FieldDef.CHAR,3);
            m36p321 = new FieldDef("m36p321",FieldDef.CHAR,40);
            m36p322 = new FieldDef("m36p322",FieldDef.CHAR,30);
            m36p323 = new FieldDef("m36p323",FieldDef.CHAR,5);
            m36p324m = new FieldDef("m36p324m",FieldDef.CHAR,5);
            m36p324 = new FieldDef("m36p324",FieldDef.CHAR,30);
            m36p325 = new FieldDef("m36p325",FieldDef.CHAR,2);
            m36p326 = new FieldDef("m36p326",FieldDef.INTEGER,0);
            m36p327 = new FieldDef("m36p327",FieldDef.INTEGER,0);
            m36p328 = new FieldDef("m36p328",FieldDef.INTEGER,0);
            m36p330 = new FieldDef("m36p330",FieldDef.CHAR,1);
            m36p331 = new FieldDef("m36p331",FieldDef.INTEGER,0);
            m36p333 = new FieldDef("m36p333",FieldDef.INTEGER,0);
            m36p334 = new FieldDef("m36p334",FieldDef.INTEGER,0);
            m36p350 = new FieldDef("m36p350",FieldDef.CHAR,1);
            m36p353 = new FieldDef("m36p353",FieldDef.DATE);
            m36p354 = new FieldDef("m36p354",FieldDef.CHAR,9);
            m36p355 = new FieldDef("m36p355",FieldDef.CHAR,125);
            m36p356 = new FieldDef("m36p356",FieldDef.CHAR,1);
            m36p361 = new FieldDef("m36p361",FieldDef.CHAR,5);
            m36p362 = new FieldDef("m36p362",FieldDef.CHAR,50);
            m36p363 = new FieldDef("m36p363",FieldDef.CHAR,3);
            m36p364 = new FieldDef("m36p364",FieldDef.INTEGER,0);
            m36p365 = new FieldDef("m36p365",FieldDef.CHAR,3);
            m36p366 = new FieldDef("m36p366",FieldDef.CHAR,3);
            m36p367 = new FieldDef("m36p367",FieldDef.CHAR,3);
            m36p368 = new FieldDef("m36p368",FieldDef.CHAR,3);
            m36p369 = new FieldDef("m36p369",FieldDef.CHAR,3);
            m36p370 = new FieldDef("m36p370",FieldDef.CHAR,3);
            m36p371 = new FieldDef("m36p371",FieldDef.CHAR,40);
            m36p372 = new FieldDef("m36p372",FieldDef.CHAR,30);
            m36p373 = new FieldDef("m36p373",FieldDef.CHAR,5);
            m36p374m = new FieldDef("m36p374m",FieldDef.CHAR,5);
            m36p374 = new FieldDef("m36p374",FieldDef.CHAR,30);
            m36p375 = new FieldDef("m36p375",FieldDef.CHAR,2);
            m36p376 = new FieldDef("m36p376",FieldDef.INTEGER,0);
            m36p377 = new FieldDef("m36p377",FieldDef.INTEGER,0);
            m36p378 = new FieldDef("m36p378",FieldDef.INTEGER,0);
            m36p380 = new FieldDef("m36p380",FieldDef.CHAR,1);
            m36p381 = new FieldDef("m36p381",FieldDef.INTEGER,0);
            m36p383 = new FieldDef("m36p383",FieldDef.INTEGER,0);
            m36p384 = new FieldDef("m36p384",FieldDef.INTEGER,0);
            m36p311y17 = new FieldDef("m36p311y17",FieldDef.CHAR,1);
            m36p313y17 = new FieldDef("m36p313y17",FieldDef.DATE);
            m36p307 = new FieldDef("m36p307",FieldDef.CHAR,9);
            m36p308 = new FieldDef("m36p308",FieldDef.CHAR,40);
            m36p309 = new FieldDef("m36p309",FieldDef.CHAR,40);
            m36p310 = new FieldDef("m36p310",FieldDef.CHAR,45);
            m36p361y17 = new FieldDef("m36p361y17",FieldDef.CHAR,1);
            m36p363y17 = new FieldDef("m36p363y17",FieldDef.DATE);
            m36p357 = new FieldDef("m36p357",FieldDef.CHAR,9);
            m36p358 = new FieldDef("m36p358",FieldDef.CHAR,40);
            m36p359 = new FieldDef("m36p359",FieldDef.CHAR,40);
            m36p360 = new FieldDef("m36p360",FieldDef.CHAR,45);
            FieldDef array[] = {
                m36p3dominio,
                m36p3nif,
                m36p3ejercicio,
                m36p3periodo,
                m36p3pagina,
                m36p300,
                m36p303,
                m36p304,
                m36p305,
                m36p306,
                m36p311,
                m36p312,
                m36p313,
                m36p314,
                m36p315,
                m36p316,
                m36p317,
                m36p318,
                m36p319,
                m36p320,
                m36p321,
                m36p322,
                m36p323,
                m36p324m,
                m36p324,
                m36p325,
                m36p326,
                m36p327,
                m36p328,
                m36p330,
                m36p331,
                m36p333,
                m36p334,
                m36p350,
                m36p353,
                m36p354,
                m36p355,
                m36p356,
                m36p361,
                m36p362,
                m36p363,
                m36p364,
                m36p365,
                m36p366,
                m36p367,
                m36p368,
                m36p369,
                m36p370,
                m36p371,
                m36p372,
                m36p373,
                m36p374m,
                m36p374,
                m36p375,
                m36p376,
                m36p377,
                m36p378,
                m36p380,
                m36p381,
                m36p383,
                m36p384,
                m36p311y17,
                m36p313y17,
                m36p307,
                m36p308,
                m36p309,
                m36p310,
                m36p361y17,
                m36p363y17,
                m36p357,
                m36p358,
                m36p359,
                m36p360                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p3dominio,m36p3nif,m36p3ejercicio,m36p3periodo,m36p3pagina };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p4 extends TableDef
        {
        // campos
        public FieldDef m36p4dominio;
        public FieldDef m36p4nif;
        public FieldDef m36p4ejercicio;
        public FieldDef m36p4periodo;
        public FieldDef m36p400;
        public FieldDef m36p402;
        public FieldDef m36p402s;
        public FieldDef m36p403;
        public FieldDef m36p405;
        public FieldDef m36p406;
        public FieldDef m36p408;
        public FieldDef m36p409;
        public FieldDef m36p410;
        public FieldDef m36p411;
        public FieldDef m36p411m;
        public FieldDef m36p4provincia;
        public FieldDef m36p412;
        public FieldDef m36p413;
        public FieldDef m36p414;
        public FieldDef m36p415;
        public FieldDef m36p416;
        public FieldDef m36p417;
        public FieldDef m36p418;
        public FieldDef m36p419;
        public FieldDef m36p419m;
        public FieldDef m36p420;
        public FieldDef m36p421;
        public FieldDef m36p422;
        public FieldDef m36p423;
        public FieldDef m36p424;
        public FieldDef m36p425;
        public FieldDef m36p427;
        public FieldDef m36p428;
        public FieldDef m36p429;
        public FieldDef m36p430;
        public FieldDef m36p431;
        public FieldDef m36p432;
        public FieldDef m36p433;
        public FieldDef m36p434;
        public FieldDef m36p435;
        public FieldDef m36p436;
        public FieldDef m36p437;
        public FieldDef m36p438;
        public FieldDef m36p439;
        public FieldDef m36p440;
        public FieldDef m36p440m;
        public FieldDef m36p441;
        public FieldDef m36p442;
        public FieldDef m36p443;
        public FieldDef m36p444;
        public FieldDef m36p445;
        public FieldDef m36p446;
        public FieldDef m36p448;
        public FieldDef m36p449;
        public FieldDef m36p450;
        public FieldDef m36p451;
        public FieldDef m36p452;
        public FieldDef m36p453;
        public FieldDef m36p454;
        public FieldDef m36p455;
        public FieldDef m36p456;
        public FieldDef m36p457;
        public FieldDef m36p458;
        public FieldDef m36p459;
        public FieldDef m36p460;
        public FieldDef m36p461;
        public FieldDef m36p461m;
        public FieldDef m36p462;
        public FieldDef m36p463;
        public FieldDef m36p464;
        public FieldDef m36p465;
        public FieldDef m36p466;
        public FieldDef m36p468;
        public FieldDef m36p469;
        public FieldDef m36p471;
        public FieldDef m36p472;
        public FieldDef m36p473;
        public FieldDef m36p474;
        public FieldDef m36p475;
        public FieldDef m36p476;
        public FieldDef m36p477;
        public FieldDef m36p478;
        public FieldDef m36p479;
        public FieldDef m36p480;
        public FieldDef m36p481;
        public FieldDef m36p482;
        public FieldDef m36p483;
        public FieldDef m36p484;
        public FieldDef m36p484m;
        public FieldDef m36p485;
        public FieldDef m36p486;
        public FieldDef m36p487;
        public FieldDef m36p488;
        public FieldDef m36p489;
        public FieldDef m36p491;
        public FieldDef m36p492;
        public FieldDef m36p494;
        public FieldDef m36p495;
        public FieldDef m36p496;
        public FieldDef m36p497;
        public FieldDef m36p498;
        public FieldDef m36p499;
        public TabMod036p4(String name)
            {
            super(name);
            m36p4dominio = new FieldDef("m36p4dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p4nif = new FieldDef("m36p4nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p4ejercicio = new FieldDef("m36p4ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p4periodo = new FieldDef("m36p4periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p400 = new FieldDef("m36p400",FieldDef.CHAR,60);
            m36p402 = new FieldDef("m36p402",FieldDef.CHAR,1);
            m36p402s = new FieldDef("m36p402s",FieldDef.CHAR,4);
            m36p403 = new FieldDef("m36p403",FieldDef.CHAR,3);
            m36p405 = new FieldDef("m36p405",FieldDef.CHAR,1);
            m36p406 = new FieldDef("m36p406",FieldDef.DATE);
            m36p408 = new FieldDef("m36p408",FieldDef.CHAR,1);
            m36p409 = new FieldDef("m36p409",FieldDef.DATE);
            m36p410 = new FieldDef("m36p410",FieldDef.CHAR,13);
            m36p411 = new FieldDef("m36p411",FieldDef.CHAR,25);
            m36p411m = new FieldDef("m36p411m",FieldDef.CHAR,5);
            m36p4provincia = new FieldDef("m36p4provincia",FieldDef.CHAR,2);
            m36p412 = new FieldDef("m36p412",FieldDef.CHAR,20);
            m36p413 = new FieldDef("m36p413",FieldDef.CHAR,17);
            m36p414 = new FieldDef("m36p414",FieldDef.CHAR,25);
            m36p415 = new FieldDef("m36p415",FieldDef.INTEGER,0);
            m36p416 = new FieldDef("m36p416",FieldDef.CHAR,2);
            m36p417 = new FieldDef("m36p417",FieldDef.CHAR,2);
            m36p418 = new FieldDef("m36p418",FieldDef.CHAR,5);
            m36p419 = new FieldDef("m36p419",FieldDef.CHAR,25);
            m36p419m = new FieldDef("m36p419m",FieldDef.CHAR,5);
            m36p420 = new FieldDef("m36p420",FieldDef.CHAR,2);
            m36p421 = new FieldDef("m36p421",FieldDef.CHAR,30);
            m36p422 = new FieldDef("m36p422",FieldDef.INTEGER,0);
            m36p423 = new FieldDef("m36p423",FieldDef.INTEGER,0);
            m36p424 = new FieldDef("m36p424",FieldDef.CHAR,1);
            m36p425 = new FieldDef("m36p425",FieldDef.DATE);
            m36p427 = new FieldDef("m36p427",FieldDef.CHAR,1);
            m36p428 = new FieldDef("m36p428",FieldDef.DATE);
            m36p429 = new FieldDef("m36p429",FieldDef.CHAR,13);
            m36p430 = new FieldDef("m36p430",FieldDef.CHAR,1);
            m36p431 = new FieldDef("m36p431",FieldDef.DATE);
            m36p432 = new FieldDef("m36p432",FieldDef.CHAR,13);
            m36p433 = new FieldDef("m36p433",FieldDef.CHAR,20);
            m36p434 = new FieldDef("m36p434",FieldDef.CHAR,17);
            m36p435 = new FieldDef("m36p435",FieldDef.CHAR,25);
            m36p436 = new FieldDef("m36p436",FieldDef.INTEGER,0);
            m36p437 = new FieldDef("m36p437",FieldDef.CHAR,2);
            m36p438 = new FieldDef("m36p438",FieldDef.CHAR,2);
            m36p439 = new FieldDef("m36p439",FieldDef.CHAR,5);
            m36p440 = new FieldDef("m36p440",FieldDef.CHAR,25);
            m36p440m = new FieldDef("m36p440m",FieldDef.CHAR,5);
            m36p441 = new FieldDef("m36p441",FieldDef.CHAR,2);
            m36p442 = new FieldDef("m36p442",FieldDef.CHAR,30);
            m36p443 = new FieldDef("m36p443",FieldDef.INTEGER,0);
            m36p444 = new FieldDef("m36p444",FieldDef.INTEGER,0);
            m36p445 = new FieldDef("m36p445",FieldDef.CHAR,1);
            m36p446 = new FieldDef("m36p446",FieldDef.DATE);
            m36p448 = new FieldDef("m36p448",FieldDef.CHAR,1);
            m36p449 = new FieldDef("m36p449",FieldDef.DATE);
            m36p450 = new FieldDef("m36p450",FieldDef.CHAR,13);
            m36p451 = new FieldDef("m36p451",FieldDef.CHAR,1);
            m36p452 = new FieldDef("m36p452",FieldDef.DATE);
            m36p453 = new FieldDef("m36p453",FieldDef.CHAR,13);
            m36p454 = new FieldDef("m36p454",FieldDef.CHAR,20);
            m36p455 = new FieldDef("m36p455",FieldDef.CHAR,17);
            m36p456 = new FieldDef("m36p456",FieldDef.CHAR,25);
            m36p457 = new FieldDef("m36p457",FieldDef.INTEGER,0);
            m36p458 = new FieldDef("m36p458",FieldDef.CHAR,2);
            m36p459 = new FieldDef("m36p459",FieldDef.CHAR,2);
            m36p460 = new FieldDef("m36p460",FieldDef.CHAR,5);
            m36p461 = new FieldDef("m36p461",FieldDef.CHAR,25);
            m36p461m = new FieldDef("m36p461m",FieldDef.CHAR,5);
            m36p462 = new FieldDef("m36p462",FieldDef.CHAR,2);
            m36p463 = new FieldDef("m36p463",FieldDef.CHAR,30);
            m36p464 = new FieldDef("m36p464",FieldDef.INTEGER,0);
            m36p465 = new FieldDef("m36p465",FieldDef.INTEGER,0);
            m36p466 = new FieldDef("m36p466",FieldDef.CHAR,2);
            m36p468 = new FieldDef("m36p468",FieldDef.CHAR,1);
            m36p469 = new FieldDef("m36p469",FieldDef.DATE);
            m36p471 = new FieldDef("m36p471",FieldDef.CHAR,1);
            m36p472 = new FieldDef("m36p472",FieldDef.DATE);
            m36p473 = new FieldDef("m36p473",FieldDef.CHAR,13);
            m36p474 = new FieldDef("m36p474",FieldDef.CHAR,1);
            m36p475 = new FieldDef("m36p475",FieldDef.DATE);
            m36p476 = new FieldDef("m36p476",FieldDef.CHAR,13);
            m36p477 = new FieldDef("m36p477",FieldDef.CHAR,20);
            m36p478 = new FieldDef("m36p478",FieldDef.CHAR,17);
            m36p479 = new FieldDef("m36p479",FieldDef.CHAR,25);
            m36p480 = new FieldDef("m36p480",FieldDef.INTEGER,0);
            m36p481 = new FieldDef("m36p481",FieldDef.CHAR,2);
            m36p482 = new FieldDef("m36p482",FieldDef.CHAR,2);
            m36p483 = new FieldDef("m36p483",FieldDef.CHAR,5);
            m36p484 = new FieldDef("m36p484",FieldDef.CHAR,25);
            m36p484m = new FieldDef("m36p484m",FieldDef.CHAR,5);
            m36p485 = new FieldDef("m36p485",FieldDef.CHAR,2);
            m36p486 = new FieldDef("m36p486",FieldDef.CHAR,30);
            m36p487 = new FieldDef("m36p487",FieldDef.INTEGER,0);
            m36p488 = new FieldDef("m36p488",FieldDef.INTEGER,0);
            m36p489 = new FieldDef("m36p489",FieldDef.CHAR,2);
            m36p491 = new FieldDef("m36p491",FieldDef.CHAR,1);
            m36p492 = new FieldDef("m36p492",FieldDef.DATE);
            m36p494 = new FieldDef("m36p494",FieldDef.CHAR,1);
            m36p495 = new FieldDef("m36p495",FieldDef.DATE);
            m36p496 = new FieldDef("m36p496",FieldDef.CHAR,13);
            m36p497 = new FieldDef("m36p497",FieldDef.CHAR,1);
            m36p498 = new FieldDef("m36p498",FieldDef.DATE);
            m36p499 = new FieldDef("m36p499",FieldDef.CHAR,13);
            FieldDef array[] = {
                m36p4dominio,
                m36p4nif,
                m36p4ejercicio,
                m36p4periodo,
                m36p400,
                m36p402,
                m36p402s,
                m36p403,
                m36p405,
                m36p406,
                m36p408,
                m36p409,
                m36p410,
                m36p411,
                m36p411m,
                m36p4provincia,
                m36p412,
                m36p413,
                m36p414,
                m36p415,
                m36p416,
                m36p417,
                m36p418,
                m36p419,
                m36p419m,
                m36p420,
                m36p421,
                m36p422,
                m36p423,
                m36p424,
                m36p425,
                m36p427,
                m36p428,
                m36p429,
                m36p430,
                m36p431,
                m36p432,
                m36p433,
                m36p434,
                m36p435,
                m36p436,
                m36p437,
                m36p438,
                m36p439,
                m36p440,
                m36p440m,
                m36p441,
                m36p442,
                m36p443,
                m36p444,
                m36p445,
                m36p446,
                m36p448,
                m36p449,
                m36p450,
                m36p451,
                m36p452,
                m36p453,
                m36p454,
                m36p455,
                m36p456,
                m36p457,
                m36p458,
                m36p459,
                m36p460,
                m36p461,
                m36p461m,
                m36p462,
                m36p463,
                m36p464,
                m36p465,
                m36p466,
                m36p468,
                m36p469,
                m36p471,
                m36p472,
                m36p473,
                m36p474,
                m36p475,
                m36p476,
                m36p477,
                m36p478,
                m36p479,
                m36p480,
                m36p481,
                m36p482,
                m36p483,
                m36p484,
                m36p484m,
                m36p485,
                m36p486,
                m36p487,
                m36p488,
                m36p489,
                m36p491,
                m36p492,
                m36p494,
                m36p495,
                m36p496,
                m36p497,
                m36p498,
                m36p499                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p4dominio,m36p4nif,m36p4ejercicio,m36p4periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p4n extends TableDef
        {
        // campos
        public FieldDef m36p4dominio;
        public FieldDef m36p4nif;
        public FieldDef m36p4ejercicio;
        public FieldDef m36p4periodo;
        public FieldDef m36p4pagina;
        public FieldDef m36p400;
        public FieldDef m36p402;
        public FieldDef m36p402s;
        public FieldDef m36p403;
        public FieldDef m36p405;
        public FieldDef m36p406;
        public FieldDef m36p408;
        public FieldDef m36p409;
        public FieldDef m36p410;
        public FieldDef m36p411;
        public FieldDef m36p411m;
        public FieldDef m36p4provincia;
        public FieldDef m36p412;
        public FieldDef m36p413;
        public FieldDef m36p414;
        public FieldDef m36p415;
        public FieldDef m36p416;
        public FieldDef m36p417;
        public FieldDef m36p418;
        public FieldDef m36p419;
        public FieldDef m36p419m;
        public FieldDef m36p420;
        public FieldDef m36p421;
        public FieldDef m36p422;
        public FieldDef m36p423;
        public FieldDef m36p424;
        public FieldDef m36p425;
        public FieldDef m36p427;
        public FieldDef m36p428;
        public FieldDef m36p429;
        public FieldDef m36p430;
        public FieldDef m36p431;
        public FieldDef m36p432;
        public FieldDef m36p433;
        public FieldDef m36p434;
        public FieldDef m36p435;
        public FieldDef m36p436;
        public FieldDef m36p437;
        public FieldDef m36p438;
        public FieldDef m36p439;
        public FieldDef m36p440;
        public FieldDef m36p440m;
        public FieldDef m36p441;
        public FieldDef m36p442;
        public FieldDef m36p443;
        public FieldDef m36p444;
        public FieldDef m36p445;
        public FieldDef m36p446;
        public FieldDef m36p448;
        public FieldDef m36p449;
        public FieldDef m36p450;
        public FieldDef m36p451;
        public FieldDef m36p452;
        public FieldDef m36p453;
        public FieldDef m36p454;
        public FieldDef m36p455;
        public FieldDef m36p456;
        public FieldDef m36p457;
        public FieldDef m36p458;
        public FieldDef m36p459;
        public FieldDef m36p460;
        public FieldDef m36p461;
        public FieldDef m36p461m;
        public FieldDef m36p462;
        public FieldDef m36p463;
        public FieldDef m36p464;
        public FieldDef m36p465;
        public FieldDef m36p466;
        public FieldDef m36p468;
        public FieldDef m36p469;
        public FieldDef m36p471;
        public FieldDef m36p472;
        public FieldDef m36p473;
        public FieldDef m36p474;
        public FieldDef m36p475;
        public FieldDef m36p476;
        public FieldDef m36p477;
        public FieldDef m36p478;
        public FieldDef m36p479;
        public FieldDef m36p480;
        public FieldDef m36p481;
        public FieldDef m36p482;
        public FieldDef m36p483;
        public FieldDef m36p484;
        public FieldDef m36p484m;
        public FieldDef m36p485;
        public FieldDef m36p486;
        public FieldDef m36p487;
        public FieldDef m36p488;
        public FieldDef m36p489;
        public FieldDef m36p491;
        public FieldDef m36p492;
        public FieldDef m36p494;
        public FieldDef m36p495;
        public FieldDef m36p496;
        public FieldDef m36p497;
        public FieldDef m36p498;
        public FieldDef m36p499;
        public TabMod036p4n(String name)
            {
            super(name);
            m36p4dominio = new FieldDef("m36p4dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p4nif = new FieldDef("m36p4nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p4ejercicio = new FieldDef("m36p4ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p4periodo = new FieldDef("m36p4periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p4pagina = new FieldDef("m36p4pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p400 = new FieldDef("m36p400",FieldDef.CHAR,60);
            m36p402 = new FieldDef("m36p402",FieldDef.CHAR,1);
            m36p402s = new FieldDef("m36p402s",FieldDef.CHAR,4);
            m36p403 = new FieldDef("m36p403",FieldDef.CHAR,3);
            m36p405 = new FieldDef("m36p405",FieldDef.CHAR,1);
            m36p406 = new FieldDef("m36p406",FieldDef.DATE);
            m36p408 = new FieldDef("m36p408",FieldDef.CHAR,1);
            m36p409 = new FieldDef("m36p409",FieldDef.DATE);
            m36p410 = new FieldDef("m36p410",FieldDef.CHAR,13);
            m36p411 = new FieldDef("m36p411",FieldDef.CHAR,25);
            m36p411m = new FieldDef("m36p411m",FieldDef.CHAR,5);
            m36p4provincia = new FieldDef("m36p4provincia",FieldDef.CHAR,2);
            m36p412 = new FieldDef("m36p412",FieldDef.CHAR,20);
            m36p413 = new FieldDef("m36p413",FieldDef.CHAR,17);
            m36p414 = new FieldDef("m36p414",FieldDef.CHAR,25);
            m36p415 = new FieldDef("m36p415",FieldDef.INTEGER,0);
            m36p416 = new FieldDef("m36p416",FieldDef.CHAR,2);
            m36p417 = new FieldDef("m36p417",FieldDef.CHAR,2);
            m36p418 = new FieldDef("m36p418",FieldDef.CHAR,5);
            m36p419 = new FieldDef("m36p419",FieldDef.CHAR,25);
            m36p419m = new FieldDef("m36p419m",FieldDef.CHAR,5);
            m36p420 = new FieldDef("m36p420",FieldDef.CHAR,2);
            m36p421 = new FieldDef("m36p421",FieldDef.CHAR,30);
            m36p422 = new FieldDef("m36p422",FieldDef.INTEGER,0);
            m36p423 = new FieldDef("m36p423",FieldDef.INTEGER,0);
            m36p424 = new FieldDef("m36p424",FieldDef.CHAR,1);
            m36p425 = new FieldDef("m36p425",FieldDef.DATE);
            m36p427 = new FieldDef("m36p427",FieldDef.CHAR,1);
            m36p428 = new FieldDef("m36p428",FieldDef.DATE);
            m36p429 = new FieldDef("m36p429",FieldDef.CHAR,13);
            m36p430 = new FieldDef("m36p430",FieldDef.CHAR,1);
            m36p431 = new FieldDef("m36p431",FieldDef.DATE);
            m36p432 = new FieldDef("m36p432",FieldDef.CHAR,13);
            m36p433 = new FieldDef("m36p433",FieldDef.CHAR,20);
            m36p434 = new FieldDef("m36p434",FieldDef.CHAR,17);
            m36p435 = new FieldDef("m36p435",FieldDef.CHAR,25);
            m36p436 = new FieldDef("m36p436",FieldDef.INTEGER,0);
            m36p437 = new FieldDef("m36p437",FieldDef.CHAR,2);
            m36p438 = new FieldDef("m36p438",FieldDef.CHAR,2);
            m36p439 = new FieldDef("m36p439",FieldDef.CHAR,5);
            m36p440 = new FieldDef("m36p440",FieldDef.CHAR,25);
            m36p440m = new FieldDef("m36p440m",FieldDef.CHAR,5);
            m36p441 = new FieldDef("m36p441",FieldDef.CHAR,2);
            m36p442 = new FieldDef("m36p442",FieldDef.CHAR,30);
            m36p443 = new FieldDef("m36p443",FieldDef.INTEGER,0);
            m36p444 = new FieldDef("m36p444",FieldDef.INTEGER,0);
            m36p445 = new FieldDef("m36p445",FieldDef.CHAR,1);
            m36p446 = new FieldDef("m36p446",FieldDef.DATE);
            m36p448 = new FieldDef("m36p448",FieldDef.CHAR,1);
            m36p449 = new FieldDef("m36p449",FieldDef.DATE);
            m36p450 = new FieldDef("m36p450",FieldDef.CHAR,13);
            m36p451 = new FieldDef("m36p451",FieldDef.CHAR,1);
            m36p452 = new FieldDef("m36p452",FieldDef.DATE);
            m36p453 = new FieldDef("m36p453",FieldDef.CHAR,13);
            m36p454 = new FieldDef("m36p454",FieldDef.CHAR,20);
            m36p455 = new FieldDef("m36p455",FieldDef.CHAR,17);
            m36p456 = new FieldDef("m36p456",FieldDef.CHAR,25);
            m36p457 = new FieldDef("m36p457",FieldDef.INTEGER,0);
            m36p458 = new FieldDef("m36p458",FieldDef.CHAR,2);
            m36p459 = new FieldDef("m36p459",FieldDef.CHAR,2);
            m36p460 = new FieldDef("m36p460",FieldDef.CHAR,5);
            m36p461 = new FieldDef("m36p461",FieldDef.CHAR,25);
            m36p461m = new FieldDef("m36p461m",FieldDef.CHAR,5);
            m36p462 = new FieldDef("m36p462",FieldDef.CHAR,2);
            m36p463 = new FieldDef("m36p463",FieldDef.CHAR,30);
            m36p464 = new FieldDef("m36p464",FieldDef.INTEGER,0);
            m36p465 = new FieldDef("m36p465",FieldDef.INTEGER,0);
            m36p466 = new FieldDef("m36p466",FieldDef.CHAR,2);
            m36p468 = new FieldDef("m36p468",FieldDef.CHAR,1);
            m36p469 = new FieldDef("m36p469",FieldDef.DATE);
            m36p471 = new FieldDef("m36p471",FieldDef.CHAR,1);
            m36p472 = new FieldDef("m36p472",FieldDef.DATE);
            m36p473 = new FieldDef("m36p473",FieldDef.CHAR,13);
            m36p474 = new FieldDef("m36p474",FieldDef.CHAR,1);
            m36p475 = new FieldDef("m36p475",FieldDef.DATE);
            m36p476 = new FieldDef("m36p476",FieldDef.CHAR,13);
            m36p477 = new FieldDef("m36p477",FieldDef.CHAR,20);
            m36p478 = new FieldDef("m36p478",FieldDef.CHAR,17);
            m36p479 = new FieldDef("m36p479",FieldDef.CHAR,25);
            m36p480 = new FieldDef("m36p480",FieldDef.INTEGER,0);
            m36p481 = new FieldDef("m36p481",FieldDef.CHAR,2);
            m36p482 = new FieldDef("m36p482",FieldDef.CHAR,2);
            m36p483 = new FieldDef("m36p483",FieldDef.CHAR,5);
            m36p484 = new FieldDef("m36p484",FieldDef.CHAR,25);
            m36p484m = new FieldDef("m36p484m",FieldDef.CHAR,5);
            m36p485 = new FieldDef("m36p485",FieldDef.CHAR,2);
            m36p486 = new FieldDef("m36p486",FieldDef.CHAR,30);
            m36p487 = new FieldDef("m36p487",FieldDef.INTEGER,0);
            m36p488 = new FieldDef("m36p488",FieldDef.INTEGER,0);
            m36p489 = new FieldDef("m36p489",FieldDef.CHAR,2);
            m36p491 = new FieldDef("m36p491",FieldDef.CHAR,1);
            m36p492 = new FieldDef("m36p492",FieldDef.DATE);
            m36p494 = new FieldDef("m36p494",FieldDef.CHAR,1);
            m36p495 = new FieldDef("m36p495",FieldDef.DATE);
            m36p496 = new FieldDef("m36p496",FieldDef.CHAR,13);
            m36p497 = new FieldDef("m36p497",FieldDef.CHAR,1);
            m36p498 = new FieldDef("m36p498",FieldDef.DATE);
            m36p499 = new FieldDef("m36p499",FieldDef.CHAR,13);
            FieldDef array[] = {
                m36p4dominio,
                m36p4nif,
                m36p4ejercicio,
                m36p4periodo,
                m36p4pagina,
                m36p400,
                m36p402,
                m36p402s,
                m36p403,
                m36p405,
                m36p406,
                m36p408,
                m36p409,
                m36p410,
                m36p411,
                m36p411m,
                m36p4provincia,
                m36p412,
                m36p413,
                m36p414,
                m36p415,
                m36p416,
                m36p417,
                m36p418,
                m36p419,
                m36p419m,
                m36p420,
                m36p421,
                m36p422,
                m36p423,
                m36p424,
                m36p425,
                m36p427,
                m36p428,
                m36p429,
                m36p430,
                m36p431,
                m36p432,
                m36p433,
                m36p434,
                m36p435,
                m36p436,
                m36p437,
                m36p438,
                m36p439,
                m36p440,
                m36p440m,
                m36p441,
                m36p442,
                m36p443,
                m36p444,
                m36p445,
                m36p446,
                m36p448,
                m36p449,
                m36p450,
                m36p451,
                m36p452,
                m36p453,
                m36p454,
                m36p455,
                m36p456,
                m36p457,
                m36p458,
                m36p459,
                m36p460,
                m36p461,
                m36p461m,
                m36p462,
                m36p463,
                m36p464,
                m36p465,
                m36p466,
                m36p468,
                m36p469,
                m36p471,
                m36p472,
                m36p473,
                m36p474,
                m36p475,
                m36p476,
                m36p477,
                m36p478,
                m36p479,
                m36p480,
                m36p481,
                m36p482,
                m36p483,
                m36p484,
                m36p484m,
                m36p485,
                m36p486,
                m36p487,
                m36p488,
                m36p489,
                m36p491,
                m36p492,
                m36p494,
                m36p495,
                m36p496,
                m36p497,
                m36p498,
                m36p499                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p4dominio,m36p4nif,m36p4ejercicio,m36p4periodo,m36p4pagina };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p6 extends TableDef
        {
        // campos
        public FieldDef m36p6dominio;
        public FieldDef m36p6nif;
        public FieldDef m36p6ejercicio;
        public FieldDef m36p6periodo;
        public FieldDef m36p600;
        public FieldDef m36p602;
        public FieldDef m36p601;
        public FieldDef m36p603;
        public FieldDef m36p604;
        public FieldDef m36p616;
        public FieldDef m36p608;
        public FieldDef m36p618;
        public FieldDef m36p609;
        public FieldDef m36p650;
        public FieldDef m36p6131a;
        public FieldDef m36p6131b;
        public FieldDef m36p6131c;
        public FieldDef m36p6132a;
        public FieldDef m36p6132b;
        public FieldDef m36p6132c;
        public FieldDef m36p6133a;
        public FieldDef m36p6133b;
        public FieldDef m36p6133c;
        public FieldDef m36p6134a;
        public FieldDef m36p6134b;
        public FieldDef m36p6134c;
        public FieldDef m36p6141a;
        public FieldDef m36p6141b;
        public FieldDef m36p6141c;
        public FieldDef m36p6142a;
        public FieldDef m36p6142b;
        public FieldDef m36p6142c;
        public FieldDef m36p6143a;
        public FieldDef m36p6143b;
        public FieldDef m36p6143c;
        public FieldDef m36p6144a;
        public FieldDef m36p6144b;
        public FieldDef m36p6144c;
        public FieldDef m36p620;
        public FieldDef m36p641;
        public FieldDef m36p640d;
        public FieldDef m36p640m;
        public FieldDef m36p621;
        public FieldDef m36p642;
        public FieldDef m36p622;
        public FieldDef m36p623;
        public FieldDef m36p643;
        public FieldDef m36p644;
        public FieldDef m36p645;
        public FieldDef m36p626;
        public FieldDef m36p646;
        public FieldDef m36p630;
        public FieldDef m36p633;
        public FieldDef m36p636;
        public FieldDef m36p634;
        public FieldDef m36p637;
        public FieldDef m36p635;
        public FieldDef m36p638;
        public FieldDef m36p651;
        public FieldDef m36p653;
        public FieldDef m36p652;
        public FieldDef m36p654;
        public FieldDef m36p647;
        public TabMod036p6(String name)
            {
            super(name);
            m36p6dominio = new FieldDef("m36p6dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p6nif = new FieldDef("m36p6nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p6ejercicio = new FieldDef("m36p6ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p6periodo = new FieldDef("m36p6periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p600 = new FieldDef("m36p600",FieldDef.CHAR,1);
            m36p602 = new FieldDef("m36p602",FieldDef.DATE);
            m36p601 = new FieldDef("m36p601",FieldDef.CHAR,1);
            m36p603 = new FieldDef("m36p603",FieldDef.DATE);
            m36p604 = new FieldDef("m36p604",FieldDef.CHAR,1);
            m36p616 = new FieldDef("m36p616",FieldDef.DATE);
            m36p608 = new FieldDef("m36p608",FieldDef.CHAR,1);
            m36p618 = new FieldDef("m36p618",FieldDef.DATE);
            m36p609 = new FieldDef("m36p609",FieldDef.CHAR,1);
            m36p650 = new FieldDef("m36p650",FieldDef.DATE);
            m36p6131a = new FieldDef("m36p6131a",FieldDef.CHAR,1);
            m36p6131b = new FieldDef("m36p6131b",FieldDef.CHAR,4);
            m36p6131c = new FieldDef("m36p6131c",FieldDef.CHAR,3);
            m36p6132a = new FieldDef("m36p6132a",FieldDef.CHAR,1);
            m36p6132b = new FieldDef("m36p6132b",FieldDef.CHAR,4);
            m36p6132c = new FieldDef("m36p6132c",FieldDef.CHAR,3);
            m36p6133a = new FieldDef("m36p6133a",FieldDef.CHAR,1);
            m36p6133b = new FieldDef("m36p6133b",FieldDef.CHAR,4);
            m36p6133c = new FieldDef("m36p6133c",FieldDef.CHAR,3);
            m36p6134a = new FieldDef("m36p6134a",FieldDef.CHAR,1);
            m36p6134b = new FieldDef("m36p6134b",FieldDef.CHAR,4);
            m36p6134c = new FieldDef("m36p6134c",FieldDef.CHAR,3);
            m36p6141a = new FieldDef("m36p6141a",FieldDef.CHAR,1);
            m36p6141b = new FieldDef("m36p6141b",FieldDef.CHAR,4);
            m36p6141c = new FieldDef("m36p6141c",FieldDef.CHAR,3);
            m36p6142a = new FieldDef("m36p6142a",FieldDef.CHAR,1);
            m36p6142b = new FieldDef("m36p6142b",FieldDef.CHAR,4);
            m36p6142c = new FieldDef("m36p6142c",FieldDef.CHAR,3);
            m36p6143a = new FieldDef("m36p6143a",FieldDef.CHAR,1);
            m36p6143b = new FieldDef("m36p6143b",FieldDef.CHAR,4);
            m36p6143c = new FieldDef("m36p6143c",FieldDef.CHAR,3);
            m36p6144a = new FieldDef("m36p6144a",FieldDef.CHAR,1);
            m36p6144b = new FieldDef("m36p6144b",FieldDef.CHAR,4);
            m36p6144c = new FieldDef("m36p6144c",FieldDef.CHAR,3);
            m36p620 = new FieldDef("m36p620",FieldDef.CHAR,1);
            m36p641 = new FieldDef("m36p641",FieldDef.DATE);
            m36p640d = new FieldDef("m36p640d",FieldDef.INTEGER,0);
            m36p640m = new FieldDef("m36p640m",FieldDef.INTEGER,0);
            m36p621 = new FieldDef("m36p621",FieldDef.CHAR,1);
            m36p642 = new FieldDef("m36p642",FieldDef.DATE);
            m36p622 = new FieldDef("m36p622",FieldDef.CHAR,1);
            m36p623 = new FieldDef("m36p623",FieldDef.CHAR,1);
            m36p643 = new FieldDef("m36p643",FieldDef.DATE);
            m36p644 = new FieldDef("m36p644",FieldDef.DATE);
            m36p645 = new FieldDef("m36p645",FieldDef.DATE);
            m36p626 = new FieldDef("m36p626",FieldDef.CHAR,1);
            m36p646 = new FieldDef("m36p646",FieldDef.DATE);
            m36p630 = new FieldDef("m36p630",FieldDef.CHAR,1);
            m36p633 = new FieldDef("m36p633",FieldDef.CHAR,1);
            m36p636 = new FieldDef("m36p636",FieldDef.DATE);
            m36p634 = new FieldDef("m36p634",FieldDef.CHAR,1);
            m36p637 = new FieldDef("m36p637",FieldDef.DATE);
            m36p635 = new FieldDef("m36p635",FieldDef.CHAR,1);
            m36p638 = new FieldDef("m36p638",FieldDef.DATE);
            m36p651 = new FieldDef("m36p651",FieldDef.CHAR,1);
            m36p653 = new FieldDef("m36p653",FieldDef.DATE);
            m36p652 = new FieldDef("m36p652",FieldDef.CHAR,1);
            m36p654 = new FieldDef("m36p654",FieldDef.DATE);
            m36p647 = new FieldDef("m36p647",FieldDef.DATE);
            FieldDef array[] = {
                m36p6dominio,
                m36p6nif,
                m36p6ejercicio,
                m36p6periodo,
                m36p600,
                m36p602,
                m36p601,
                m36p603,
                m36p604,
                m36p616,
                m36p608,
                m36p618,
                m36p609,
                m36p650,
                m36p6131a,
                m36p6131b,
                m36p6131c,
                m36p6132a,
                m36p6132b,
                m36p6132c,
                m36p6133a,
                m36p6133b,
                m36p6133c,
                m36p6134a,
                m36p6134b,
                m36p6134c,
                m36p6141a,
                m36p6141b,
                m36p6141c,
                m36p6142a,
                m36p6142b,
                m36p6142c,
                m36p6143a,
                m36p6143b,
                m36p6143c,
                m36p6144a,
                m36p6144b,
                m36p6144c,
                m36p620,
                m36p641,
                m36p640d,
                m36p640m,
                m36p621,
                m36p642,
                m36p622,
                m36p623,
                m36p643,
                m36p644,
                m36p645,
                m36p626,
                m36p646,
                m36p630,
                m36p633,
                m36p636,
                m36p634,
                m36p637,
                m36p635,
                m36p638,
                m36p651,
                m36p653,
                m36p652,
                m36p654,
                m36p647                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p6dominio,m36p6nif,m36p6ejercicio,m36p6periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p7 extends TableDef
        {
        // campos
        public FieldDef m36p7dominio;
        public FieldDef m36p7nif;
        public FieldDef m36p7ejercicio;
        public FieldDef m36p7periodo;
        public FieldDef m36p700;
        public FieldDef m36p701;
        public FieldDef m36p702;
        public FieldDef m36p703;
        public FieldDef m36p704;
        public FieldDef m36p705;
        public FieldDef m36p706;
        public FieldDef m36p707;
        public FieldDef m36p720;
        public FieldDef m36p721;
        public FieldDef m36p722;
        public FieldDef m36p723;
        public FieldDef m36p724;
        public FieldDef m36p725;
        public FieldDef m36p726;
        public FieldDef m36p727;
        public FieldDef m36p710;
        public FieldDef m36p711;
        public FieldDef m36p712;
        public FieldDef m36p713;
        public FieldDef m36p730;
        public FieldDef m36p731;
        public FieldDef m36p732;
        public FieldDef m36p733;
        public FieldDef m36p900si1;
        public FieldDef m36p902de1;
        public FieldDef m36p903re1;
        public FieldDef m36p900si2;
        public FieldDef m36p902de2;
        public FieldDef m36p903re2;
        public FieldDef m36p900si3;
        public FieldDef m36p902de3;
        public FieldDef m36p903re3;
        public FieldDef m36p900si4;
        public FieldDef m36p902de4;
        public FieldDef m36p903re4;
        public FieldDef m36p900si5;
        public FieldDef m36p902de5;
        public FieldDef m36p903re5;
        public FieldDef m36p900si6;
        public FieldDef m36p902de6;
        public FieldDef m36p903re6;
        public FieldDef m36p900si7;
        public FieldDef m36p902de7;
        public FieldDef m36p903re7;
        public FieldDef m36p900si8;
        public FieldDef m36p902de8;
        public FieldDef m36p903re8;
        public FieldDef m36p900si9;
        public FieldDef m36p902de9;
        public FieldDef m36p903re9;
        public FieldDef m36p900si10;
        public FieldDef m36p902de10;
        public FieldDef m36p903re10;
        public FieldDef m36p900si11;
        public FieldDef m36p902de11;
        public FieldDef m36p903re11;
        public FieldDef m36p900si12;
        public FieldDef m36p902de12;
        public FieldDef m36p903re12;
        public FieldDef m36p900si13;
        public FieldDef m36p902de13;
        public FieldDef m36p903re13;
        public FieldDef m36p900si14;
        public FieldDef m36p902de14;
        public FieldDef m36p903re14;
        public FieldDef m36p900si15;
        public FieldDef m36p902de15;
        public FieldDef m36p903re15;
        public FieldDef m36p900si16;
        public FieldDef m36p902de16;
        public FieldDef m36p903re16;
        public FieldDef m36p900si17;
        public FieldDef m36p902de17;
        public FieldDef m36p903re17;
        public FieldDef m36p900si18;
        public FieldDef m36p902de18;
        public FieldDef m36p903re18;
        public FieldDef m36p900si19;
        public FieldDef m36p902de19;
        public FieldDef m36p903re19;
        public FieldDef m36p900si20;
        public FieldDef m36p902de20;
        public FieldDef m36p903re20;
        public FieldDef m36p900si21;
        public FieldDef m36p902de21;
        public FieldDef m36p903re21;
        public FieldDef m36p900si22;
        public FieldDef m36p902de22;
        public FieldDef m36p903re22;
        public FieldDef m36p900si23;
        public FieldDef m36p902de23;
        public FieldDef m36p903re23;
        public FieldDef m36p900si24;
        public FieldDef m36p902de24;
        public FieldDef m36p903re24;
        public FieldDef m36p900si25;
        public FieldDef m36p902de25;
        public FieldDef m36p903re25;
        public FieldDef m36p900si26;
        public FieldDef m36p902de26;
        public FieldDef m36p903re26;
        public FieldDef m36p900si27;
        public FieldDef m36p902de27;
        public FieldDef m36p903re27;
        public FieldDef m36p902debi;
        public FieldDef m36p900siot;
        public FieldDef m36p902deot;
        public FieldDef m36p903reot;
        public FieldDef m36p910;
        public FieldDef m36p912;
        public FieldDef m36p708;
        public FieldDef m36p709;
        public TabMod036p7(String name)
            {
            super(name);
            m36p7dominio = new FieldDef("m36p7dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p7nif = new FieldDef("m36p7nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p7ejercicio = new FieldDef("m36p7ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p7periodo = new FieldDef("m36p7periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p700 = new FieldDef("m36p700",FieldDef.CHAR,1);
            m36p701 = new FieldDef("m36p701",FieldDef.CHAR,1);
            m36p702 = new FieldDef("m36p702",FieldDef.CHAR,1);
            m36p703 = new FieldDef("m36p703",FieldDef.CHAR,1);
            m36p704 = new FieldDef("m36p704",FieldDef.CHAR,1);
            m36p705 = new FieldDef("m36p705",FieldDef.CHAR,1);
            m36p706 = new FieldDef("m36p706",FieldDef.CHAR,1);
            m36p707 = new FieldDef("m36p707",FieldDef.CHAR,1);
            m36p720 = new FieldDef("m36p720",FieldDef.DATE);
            m36p721 = new FieldDef("m36p721",FieldDef.DATE);
            m36p722 = new FieldDef("m36p722",FieldDef.DATE);
            m36p723 = new FieldDef("m36p723",FieldDef.DATE);
            m36p724 = new FieldDef("m36p724",FieldDef.DATE);
            m36p725 = new FieldDef("m36p725",FieldDef.DATE);
            m36p726 = new FieldDef("m36p726",FieldDef.DATE);
            m36p727 = new FieldDef("m36p727",FieldDef.DATE);
            m36p710 = new FieldDef("m36p710",FieldDef.CHAR,1);
            m36p711 = new FieldDef("m36p711",FieldDef.CHAR,1);
            m36p712 = new FieldDef("m36p712",FieldDef.CHAR,1);
            m36p713 = new FieldDef("m36p713",FieldDef.CHAR,1);
            m36p730 = new FieldDef("m36p730",FieldDef.DATE);
            m36p731 = new FieldDef("m36p731",FieldDef.DATE);
            m36p732 = new FieldDef("m36p732",FieldDef.DATE);
            m36p733 = new FieldDef("m36p733",FieldDef.DATE);
            m36p900si1 = new FieldDef("m36p900si1",FieldDef.CHAR,1);
            m36p902de1 = new FieldDef("m36p902de1",FieldDef.CHAR,1);
            m36p903re1 = new FieldDef("m36p903re1",FieldDef.CHAR,1);
            m36p900si2 = new FieldDef("m36p900si2",FieldDef.CHAR,1);
            m36p902de2 = new FieldDef("m36p902de2",FieldDef.CHAR,1);
            m36p903re2 = new FieldDef("m36p903re2",FieldDef.CHAR,1);
            m36p900si3 = new FieldDef("m36p900si3",FieldDef.CHAR,1);
            m36p902de3 = new FieldDef("m36p902de3",FieldDef.CHAR,1);
            m36p903re3 = new FieldDef("m36p903re3",FieldDef.CHAR,1);
            m36p900si4 = new FieldDef("m36p900si4",FieldDef.CHAR,1);
            m36p902de4 = new FieldDef("m36p902de4",FieldDef.CHAR,1);
            m36p903re4 = new FieldDef("m36p903re4",FieldDef.CHAR,1);
            m36p900si5 = new FieldDef("m36p900si5",FieldDef.CHAR,1);
            m36p902de5 = new FieldDef("m36p902de5",FieldDef.CHAR,1);
            m36p903re5 = new FieldDef("m36p903re5",FieldDef.CHAR,1);
            m36p900si6 = new FieldDef("m36p900si6",FieldDef.CHAR,1);
            m36p902de6 = new FieldDef("m36p902de6",FieldDef.CHAR,1);
            m36p903re6 = new FieldDef("m36p903re6",FieldDef.CHAR,1);
            m36p900si7 = new FieldDef("m36p900si7",FieldDef.CHAR,1);
            m36p902de7 = new FieldDef("m36p902de7",FieldDef.CHAR,1);
            m36p903re7 = new FieldDef("m36p903re7",FieldDef.CHAR,1);
            m36p900si8 = new FieldDef("m36p900si8",FieldDef.CHAR,1);
            m36p902de8 = new FieldDef("m36p902de8",FieldDef.CHAR,1);
            m36p903re8 = new FieldDef("m36p903re8",FieldDef.CHAR,1);
            m36p900si9 = new FieldDef("m36p900si9",FieldDef.CHAR,1);
            m36p902de9 = new FieldDef("m36p902de9",FieldDef.CHAR,1);
            m36p903re9 = new FieldDef("m36p903re9",FieldDef.CHAR,1);
            m36p900si10 = new FieldDef("m36p900si10",FieldDef.CHAR,1);
            m36p902de10 = new FieldDef("m36p902de10",FieldDef.CHAR,1);
            m36p903re10 = new FieldDef("m36p903re10",FieldDef.CHAR,1);
            m36p900si11 = new FieldDef("m36p900si11",FieldDef.CHAR,1);
            m36p902de11 = new FieldDef("m36p902de11",FieldDef.CHAR,1);
            m36p903re11 = new FieldDef("m36p903re11",FieldDef.CHAR,1);
            m36p900si12 = new FieldDef("m36p900si12",FieldDef.CHAR,1);
            m36p902de12 = new FieldDef("m36p902de12",FieldDef.CHAR,1);
            m36p903re12 = new FieldDef("m36p903re12",FieldDef.CHAR,1);
            m36p900si13 = new FieldDef("m36p900si13",FieldDef.CHAR,1);
            m36p902de13 = new FieldDef("m36p902de13",FieldDef.CHAR,1);
            m36p903re13 = new FieldDef("m36p903re13",FieldDef.CHAR,1);
            m36p900si14 = new FieldDef("m36p900si14",FieldDef.CHAR,1);
            m36p902de14 = new FieldDef("m36p902de14",FieldDef.CHAR,1);
            m36p903re14 = new FieldDef("m36p903re14",FieldDef.CHAR,1);
            m36p900si15 = new FieldDef("m36p900si15",FieldDef.CHAR,1);
            m36p902de15 = new FieldDef("m36p902de15",FieldDef.CHAR,1);
            m36p903re15 = new FieldDef("m36p903re15",FieldDef.CHAR,1);
            m36p900si16 = new FieldDef("m36p900si16",FieldDef.CHAR,1);
            m36p902de16 = new FieldDef("m36p902de16",FieldDef.CHAR,1);
            m36p903re16 = new FieldDef("m36p903re16",FieldDef.CHAR,1);
            m36p900si17 = new FieldDef("m36p900si17",FieldDef.CHAR,1);
            m36p902de17 = new FieldDef("m36p902de17",FieldDef.CHAR,1);
            m36p903re17 = new FieldDef("m36p903re17",FieldDef.CHAR,1);
            m36p900si18 = new FieldDef("m36p900si18",FieldDef.CHAR,1);
            m36p902de18 = new FieldDef("m36p902de18",FieldDef.CHAR,1);
            m36p903re18 = new FieldDef("m36p903re18",FieldDef.CHAR,1);
            m36p900si19 = new FieldDef("m36p900si19",FieldDef.CHAR,1);
            m36p902de19 = new FieldDef("m36p902de19",FieldDef.CHAR,1);
            m36p903re19 = new FieldDef("m36p903re19",FieldDef.CHAR,1);
            m36p900si20 = new FieldDef("m36p900si20",FieldDef.CHAR,1);
            m36p902de20 = new FieldDef("m36p902de20",FieldDef.CHAR,1);
            m36p903re20 = new FieldDef("m36p903re20",FieldDef.CHAR,1);
            m36p900si21 = new FieldDef("m36p900si21",FieldDef.CHAR,1);
            m36p902de21 = new FieldDef("m36p902de21",FieldDef.CHAR,1);
            m36p903re21 = new FieldDef("m36p903re21",FieldDef.CHAR,1);
            m36p900si22 = new FieldDef("m36p900si22",FieldDef.CHAR,1);
            m36p902de22 = new FieldDef("m36p902de22",FieldDef.CHAR,1);
            m36p903re22 = new FieldDef("m36p903re22",FieldDef.CHAR,1);
            m36p900si23 = new FieldDef("m36p900si23",FieldDef.CHAR,1);
            m36p902de23 = new FieldDef("m36p902de23",FieldDef.CHAR,1);
            m36p903re23 = new FieldDef("m36p903re23",FieldDef.CHAR,1);
            m36p900si24 = new FieldDef("m36p900si24",FieldDef.CHAR,1);
            m36p902de24 = new FieldDef("m36p902de24",FieldDef.CHAR,1);
            m36p903re24 = new FieldDef("m36p903re24",FieldDef.CHAR,1);
            m36p900si25 = new FieldDef("m36p900si25",FieldDef.CHAR,1);
            m36p902de25 = new FieldDef("m36p902de25",FieldDef.CHAR,1);
            m36p903re25 = new FieldDef("m36p903re25",FieldDef.CHAR,1);
            m36p900si26 = new FieldDef("m36p900si26",FieldDef.CHAR,1);
            m36p902de26 = new FieldDef("m36p902de26",FieldDef.CHAR,1);
            m36p903re26 = new FieldDef("m36p903re26",FieldDef.CHAR,1);
            m36p900si27 = new FieldDef("m36p900si27",FieldDef.CHAR,1);
            m36p902de27 = new FieldDef("m36p902de27",FieldDef.CHAR,1);
            m36p903re27 = new FieldDef("m36p903re27",FieldDef.CHAR,1);
            m36p902debi = new FieldDef("m36p902debi",FieldDef.CHAR,1);
            m36p900siot = new FieldDef("m36p900siot",FieldDef.CHAR,1);
            m36p902deot = new FieldDef("m36p902deot",FieldDef.CHAR,1);
            m36p903reot = new FieldDef("m36p903reot",FieldDef.CHAR,1);
            m36p910 = new FieldDef("m36p910",FieldDef.CHAR,1);
            m36p912 = new FieldDef("m36p912",FieldDef.CHAR,1);
            m36p708 = new FieldDef("m36p708",FieldDef.CHAR,1);
            m36p709 = new FieldDef("m36p709",FieldDef.DATE);
            FieldDef array[] = {
                m36p7dominio,
                m36p7nif,
                m36p7ejercicio,
                m36p7periodo,
                m36p700,
                m36p701,
                m36p702,
                m36p703,
                m36p704,
                m36p705,
                m36p706,
                m36p707,
                m36p720,
                m36p721,
                m36p722,
                m36p723,
                m36p724,
                m36p725,
                m36p726,
                m36p727,
                m36p710,
                m36p711,
                m36p712,
                m36p713,
                m36p730,
                m36p731,
                m36p732,
                m36p733,
                m36p900si1,
                m36p902de1,
                m36p903re1,
                m36p900si2,
                m36p902de2,
                m36p903re2,
                m36p900si3,
                m36p902de3,
                m36p903re3,
                m36p900si4,
                m36p902de4,
                m36p903re4,
                m36p900si5,
                m36p902de5,
                m36p903re5,
                m36p900si6,
                m36p902de6,
                m36p903re6,
                m36p900si7,
                m36p902de7,
                m36p903re7,
                m36p900si8,
                m36p902de8,
                m36p903re8,
                m36p900si9,
                m36p902de9,
                m36p903re9,
                m36p900si10,
                m36p902de10,
                m36p903re10,
                m36p900si11,
                m36p902de11,
                m36p903re11,
                m36p900si12,
                m36p902de12,
                m36p903re12,
                m36p900si13,
                m36p902de13,
                m36p903re13,
                m36p900si14,
                m36p902de14,
                m36p903re14,
                m36p900si15,
                m36p902de15,
                m36p903re15,
                m36p900si16,
                m36p902de16,
                m36p903re16,
                m36p900si17,
                m36p902de17,
                m36p903re17,
                m36p900si18,
                m36p902de18,
                m36p903re18,
                m36p900si19,
                m36p902de19,
                m36p903re19,
                m36p900si20,
                m36p902de20,
                m36p903re20,
                m36p900si21,
                m36p902de21,
                m36p903re21,
                m36p900si22,
                m36p902de22,
                m36p903re22,
                m36p900si23,
                m36p902de23,
                m36p903re23,
                m36p900si24,
                m36p902de24,
                m36p903re24,
                m36p900si25,
                m36p902de25,
                m36p903re25,
                m36p900si26,
                m36p902de26,
                m36p903re26,
                m36p900si27,
                m36p902de27,
                m36p903re27,
                m36p902debi,
                m36p900siot,
                m36p902deot,
                m36p903reot,
                m36p910,
                m36p912,
                m36p708,
                m36p709                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p7dominio,m36p7nif,m36p7ejercicio,m36p7periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p8 extends TableDef
        {
        // campos
        public FieldDef m36p8dominio;
        public FieldDef m36p8nif;
        public FieldDef m36p8ejercicio;
        public FieldDef m36p8periodo;
        public FieldDef m36p802;
        public FieldDef m36p805;
        public FieldDef m36p800;
        public FieldDef m36p801;
        public FieldDef m36p841;
        public FieldDef m36p842;
        public FieldDef m36p843;
        public FieldDef m36p844;
        public FieldDef m36p845;
        public FieldDef m36p846;
        public FieldDef m36p847;
        public FieldDef m36p848;
        public FieldDef m36p849;
        public FieldDef m36p850;
        public FieldDef m36p851;
        public FieldDef m36p852;
        public FieldDef m36p853;
        public FieldDef m36p854;
        public FieldDef m36p854m;
        public FieldDef m36p855;
        public FieldDef m36p856;
        public FieldDef m36p857;
        public FieldDef m36p858;
        public FieldDef m36p859;
        public FieldDef m36p861;
        public FieldDef m36p862;
        public FieldDef m36p863;
        public FieldDef m36p864;
        public FieldDef m36p865;
        public FieldDef m36p866;
        public FieldDef m36p867;
        public FieldDef m36p868;
        public FieldDef m36p869;
        public FieldDef m36p870;
        public FieldDef m36p871;
        public FieldDef m36p818;
        public FieldDef m36p819;
        public FieldDef m36p821;
        public FieldDef m36p823;
        public FieldDef m36p825;
        public FieldDef m36px802;
        public FieldDef m36px805;
        public FieldDef m36px800;
        public FieldDef m36px801;
        public FieldDef m36px841;
        public FieldDef m36px842;
        public FieldDef m36px843;
        public FieldDef m36px844;
        public FieldDef m36px845;
        public FieldDef m36px846;
        public FieldDef m36px847;
        public FieldDef m36px848;
        public FieldDef m36px849;
        public FieldDef m36px850;
        public FieldDef m36px851;
        public FieldDef m36px852;
        public FieldDef m36px853;
        public FieldDef m36px854;
        public FieldDef m36px854m;
        public FieldDef m36px855;
        public FieldDef m36px856;
        public FieldDef m36px857;
        public FieldDef m36px858;
        public FieldDef m36px859;
        public FieldDef m36px861;
        public FieldDef m36px862;
        public FieldDef m36px863;
        public FieldDef m36px864;
        public FieldDef m36px865;
        public FieldDef m36px866;
        public FieldDef m36px867;
        public FieldDef m36px868;
        public FieldDef m36px869;
        public FieldDef m36px870;
        public FieldDef m36px871;
        public FieldDef m36px818;
        public FieldDef m36px819;
        public FieldDef m36px821;
        public FieldDef m36px823;
        public FieldDef m36px825;
        public FieldDef m36p859soc;
        public FieldDef m36px859soc;
        public TabMod036p8(String name)
            {
            super(name);
            m36p8dominio = new FieldDef("m36p8dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p8nif = new FieldDef("m36p8nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p8ejercicio = new FieldDef("m36p8ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p8periodo = new FieldDef("m36p8periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p802 = new FieldDef("m36p802",FieldDef.CHAR,1);
            m36p805 = new FieldDef("m36p805",FieldDef.DATE);
            m36p800 = new FieldDef("m36p800",FieldDef.CHAR,9);
            m36p801 = new FieldDef("m36p801",FieldDef.CHAR,125);
            m36p841 = new FieldDef("m36p841",FieldDef.CHAR,5);
            m36p842 = new FieldDef("m36p842",FieldDef.CHAR,50);
            m36p843 = new FieldDef("m36p843",FieldDef.CHAR,3);
            m36p844 = new FieldDef("m36p844",FieldDef.INTEGER,0);
            m36p845 = new FieldDef("m36p845",FieldDef.CHAR,3);
            m36p846 = new FieldDef("m36p846",FieldDef.CHAR,3);
            m36p847 = new FieldDef("m36p847",FieldDef.CHAR,3);
            m36p848 = new FieldDef("m36p848",FieldDef.CHAR,3);
            m36p849 = new FieldDef("m36p849",FieldDef.CHAR,3);
            m36p850 = new FieldDef("m36p850",FieldDef.CHAR,3);
            m36p851 = new FieldDef("m36p851",FieldDef.CHAR,40);
            m36p852 = new FieldDef("m36p852",FieldDef.CHAR,30);
            m36p853 = new FieldDef("m36p853",FieldDef.CHAR,5);
            m36p854 = new FieldDef("m36p854",FieldDef.CHAR,30);
            m36p854m = new FieldDef("m36p854m",FieldDef.CHAR,5);
            m36p855 = new FieldDef("m36p855",FieldDef.CHAR,2);
            m36p856 = new FieldDef("m36p856",FieldDef.INTEGER,0);
            m36p857 = new FieldDef("m36p857",FieldDef.INTEGER,0);
            m36p858 = new FieldDef("m36p858",FieldDef.INTEGER,0);
            m36p859 = new FieldDef("m36p859",FieldDef.CHAR,100);
            m36p861 = new FieldDef("m36p861",FieldDef.CHAR,50);
            m36p862 = new FieldDef("m36p862",FieldDef.CHAR,40);
            m36p863 = new FieldDef("m36p863",FieldDef.CHAR,30);
            m36p864 = new FieldDef("m36p864",FieldDef.CHAR,100);
            m36p865 = new FieldDef("m36p865",FieldDef.CHAR,10);
            m36p866 = new FieldDef("m36p866",FieldDef.CHAR,30);
            m36p867 = new FieldDef("m36p867",FieldDef.CHAR,30);
            m36p868 = new FieldDef("m36p868",FieldDef.CHAR,2);
            m36p869 = new FieldDef("m36p869",FieldDef.CHAR,15);
            m36p870 = new FieldDef("m36p870",FieldDef.CHAR,15);
            m36p871 = new FieldDef("m36p871",FieldDef.CHAR,15);
            m36p818 = new FieldDef("m36p818",FieldDef.FLOAT,6,0);
            m36p819 = new FieldDef("m36p819",FieldDef.CHAR,1);
            m36p821 = new FieldDef("m36p821",FieldDef.CHAR,1);
            m36p823 = new FieldDef("m36p823",FieldDef.CHAR,1);
            m36p825 = new FieldDef("m36p825",FieldDef.CHAR,1);
            m36px802 = new FieldDef("m36px802",FieldDef.CHAR,1);
            m36px805 = new FieldDef("m36px805",FieldDef.DATE);
            m36px800 = new FieldDef("m36px800",FieldDef.CHAR,9);
            m36px801 = new FieldDef("m36px801",FieldDef.CHAR,125);
            m36px841 = new FieldDef("m36px841",FieldDef.CHAR,5);
            m36px842 = new FieldDef("m36px842",FieldDef.CHAR,50);
            m36px843 = new FieldDef("m36px843",FieldDef.CHAR,3);
            m36px844 = new FieldDef("m36px844",FieldDef.INTEGER,0);
            m36px845 = new FieldDef("m36px845",FieldDef.CHAR,3);
            m36px846 = new FieldDef("m36px846",FieldDef.CHAR,3);
            m36px847 = new FieldDef("m36px847",FieldDef.CHAR,3);
            m36px848 = new FieldDef("m36px848",FieldDef.CHAR,3);
            m36px849 = new FieldDef("m36px849",FieldDef.CHAR,3);
            m36px850 = new FieldDef("m36px850",FieldDef.CHAR,3);
            m36px851 = new FieldDef("m36px851",FieldDef.CHAR,40);
            m36px852 = new FieldDef("m36px852",FieldDef.CHAR,30);
            m36px853 = new FieldDef("m36px853",FieldDef.CHAR,5);
            m36px854 = new FieldDef("m36px854",FieldDef.CHAR,30);
            m36px854m = new FieldDef("m36px854m",FieldDef.CHAR,5);
            m36px855 = new FieldDef("m36px855",FieldDef.CHAR,2);
            m36px856 = new FieldDef("m36px856",FieldDef.INTEGER,0);
            m36px857 = new FieldDef("m36px857",FieldDef.INTEGER,0);
            m36px858 = new FieldDef("m36px858",FieldDef.INTEGER,0);
            m36px859 = new FieldDef("m36px859",FieldDef.CHAR,100);
            m36px861 = new FieldDef("m36px861",FieldDef.CHAR,50);
            m36px862 = new FieldDef("m36px862",FieldDef.CHAR,40);
            m36px863 = new FieldDef("m36px863",FieldDef.CHAR,30);
            m36px864 = new FieldDef("m36px864",FieldDef.CHAR,100);
            m36px865 = new FieldDef("m36px865",FieldDef.CHAR,10);
            m36px866 = new FieldDef("m36px866",FieldDef.CHAR,30);
            m36px867 = new FieldDef("m36px867",FieldDef.CHAR,30);
            m36px868 = new FieldDef("m36px868",FieldDef.CHAR,2);
            m36px869 = new FieldDef("m36px869",FieldDef.CHAR,15);
            m36px870 = new FieldDef("m36px870",FieldDef.CHAR,15);
            m36px871 = new FieldDef("m36px871",FieldDef.CHAR,15);
            m36px818 = new FieldDef("m36px818",FieldDef.FLOAT,6,0);
            m36px819 = new FieldDef("m36px819",FieldDef.CHAR,1);
            m36px821 = new FieldDef("m36px821",FieldDef.CHAR,1);
            m36px823 = new FieldDef("m36px823",FieldDef.CHAR,1);
            m36px825 = new FieldDef("m36px825",FieldDef.CHAR,1);
            m36p859soc = new FieldDef("m36p859soc",FieldDef.FLOAT,6,0);
            m36px859soc = new FieldDef("m36px859soc",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m36p8dominio,
                m36p8nif,
                m36p8ejercicio,
                m36p8periodo,
                m36p802,
                m36p805,
                m36p800,
                m36p801,
                m36p841,
                m36p842,
                m36p843,
                m36p844,
                m36p845,
                m36p846,
                m36p847,
                m36p848,
                m36p849,
                m36p850,
                m36p851,
                m36p852,
                m36p853,
                m36p854,
                m36p854m,
                m36p855,
                m36p856,
                m36p857,
                m36p858,
                m36p859,
                m36p861,
                m36p862,
                m36p863,
                m36p864,
                m36p865,
                m36p866,
                m36p867,
                m36p868,
                m36p869,
                m36p870,
                m36p871,
                m36p818,
                m36p819,
                m36p821,
                m36p823,
                m36p825,
                m36px802,
                m36px805,
                m36px800,
                m36px801,
                m36px841,
                m36px842,
                m36px843,
                m36px844,
                m36px845,
                m36px846,
                m36px847,
                m36px848,
                m36px849,
                m36px850,
                m36px851,
                m36px852,
                m36px853,
                m36px854,
                m36px854m,
                m36px855,
                m36px856,
                m36px857,
                m36px858,
                m36px859,
                m36px861,
                m36px862,
                m36px863,
                m36px864,
                m36px865,
                m36px866,
                m36px867,
                m36px868,
                m36px869,
                m36px870,
                m36px871,
                m36px818,
                m36px819,
                m36px821,
                m36px823,
                m36px825,
                m36p859soc,
                m36px859soc                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p8dominio,m36p8nif,m36p8ejercicio,m36p8periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p8n extends TableDef
        {
        // campos
        public FieldDef m36p8dominio;
        public FieldDef m36p8nif;
        public FieldDef m36p8ejercicio;
        public FieldDef m36p8periodo;
        public FieldDef m36p8pagina;
        public FieldDef m36p802;
        public FieldDef m36p805;
        public FieldDef m36p800;
        public FieldDef m36p801;
        public FieldDef m36p841;
        public FieldDef m36p842;
        public FieldDef m36p843;
        public FieldDef m36p844;
        public FieldDef m36p845;
        public FieldDef m36p846;
        public FieldDef m36p847;
        public FieldDef m36p848;
        public FieldDef m36p849;
        public FieldDef m36p850;
        public FieldDef m36p851;
        public FieldDef m36p852;
        public FieldDef m36p853;
        public FieldDef m36p854;
        public FieldDef m36p854m;
        public FieldDef m36p855;
        public FieldDef m36p856;
        public FieldDef m36p857;
        public FieldDef m36p858;
        public FieldDef m36p859;
        public FieldDef m36p861;
        public FieldDef m36p862;
        public FieldDef m36p863;
        public FieldDef m36p864;
        public FieldDef m36p865;
        public FieldDef m36p866;
        public FieldDef m36p867;
        public FieldDef m36p868;
        public FieldDef m36p869;
        public FieldDef m36p870;
        public FieldDef m36p871;
        public FieldDef m36p818;
        public FieldDef m36p819;
        public FieldDef m36p821;
        public FieldDef m36p823;
        public FieldDef m36p825;
        public FieldDef m36px802;
        public FieldDef m36px805;
        public FieldDef m36px800;
        public FieldDef m36px801;
        public FieldDef m36px841;
        public FieldDef m36px842;
        public FieldDef m36px843;
        public FieldDef m36px844;
        public FieldDef m36px845;
        public FieldDef m36px846;
        public FieldDef m36px847;
        public FieldDef m36px848;
        public FieldDef m36px849;
        public FieldDef m36px850;
        public FieldDef m36px851;
        public FieldDef m36px852;
        public FieldDef m36px853;
        public FieldDef m36px854;
        public FieldDef m36px854m;
        public FieldDef m36px855;
        public FieldDef m36px856;
        public FieldDef m36px857;
        public FieldDef m36px858;
        public FieldDef m36px859;
        public FieldDef m36px861;
        public FieldDef m36px862;
        public FieldDef m36px863;
        public FieldDef m36px864;
        public FieldDef m36px865;
        public FieldDef m36px866;
        public FieldDef m36px867;
        public FieldDef m36px868;
        public FieldDef m36px869;
        public FieldDef m36px870;
        public FieldDef m36px871;
        public FieldDef m36px818;
        public FieldDef m36px819;
        public FieldDef m36px821;
        public FieldDef m36px823;
        public FieldDef m36px825;
        public FieldDef m36p859soc;
        public FieldDef m36px859soc;
        public FieldDef m36py802;
        public FieldDef m36py801;
        public FieldDef m36py819;
        public FieldDef m36py821;
        public FieldDef m36py823;
        public FieldDef m36py825;
        public FieldDef m36py818;
        public FieldDef m36py859soc;
        public FieldDef m36pz802;
        public FieldDef m36pz801;
        public FieldDef m36pz819;
        public FieldDef m36pz821;
        public FieldDef m36pz823;
        public FieldDef m36pz825;
        public FieldDef m36pz818;
        public FieldDef m36pz859soc;
        public FieldDef m36py805;
        public FieldDef m36py800;
        public FieldDef m36pz805;
        public FieldDef m36pz800;
        public TabMod036p8n(String name)
            {
            super(name);
            m36p8dominio = new FieldDef("m36p8dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p8nif = new FieldDef("m36p8nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p8ejercicio = new FieldDef("m36p8ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p8periodo = new FieldDef("m36p8periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p8pagina = new FieldDef("m36p8pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p802 = new FieldDef("m36p802",FieldDef.CHAR,1);
            m36p805 = new FieldDef("m36p805",FieldDef.DATE);
            m36p800 = new FieldDef("m36p800",FieldDef.CHAR,9);
            m36p801 = new FieldDef("m36p801",FieldDef.CHAR,125);
            m36p841 = new FieldDef("m36p841",FieldDef.CHAR,5);
            m36p842 = new FieldDef("m36p842",FieldDef.CHAR,50);
            m36p843 = new FieldDef("m36p843",FieldDef.CHAR,3);
            m36p844 = new FieldDef("m36p844",FieldDef.INTEGER,0);
            m36p845 = new FieldDef("m36p845",FieldDef.CHAR,3);
            m36p846 = new FieldDef("m36p846",FieldDef.CHAR,3);
            m36p847 = new FieldDef("m36p847",FieldDef.CHAR,3);
            m36p848 = new FieldDef("m36p848",FieldDef.CHAR,3);
            m36p849 = new FieldDef("m36p849",FieldDef.CHAR,3);
            m36p850 = new FieldDef("m36p850",FieldDef.CHAR,3);
            m36p851 = new FieldDef("m36p851",FieldDef.CHAR,40);
            m36p852 = new FieldDef("m36p852",FieldDef.CHAR,30);
            m36p853 = new FieldDef("m36p853",FieldDef.CHAR,5);
            m36p854 = new FieldDef("m36p854",FieldDef.CHAR,30);
            m36p854m = new FieldDef("m36p854m",FieldDef.CHAR,5);
            m36p855 = new FieldDef("m36p855",FieldDef.CHAR,2);
            m36p856 = new FieldDef("m36p856",FieldDef.INTEGER,0);
            m36p857 = new FieldDef("m36p857",FieldDef.INTEGER,0);
            m36p858 = new FieldDef("m36p858",FieldDef.INTEGER,0);
            m36p859 = new FieldDef("m36p859",FieldDef.CHAR,100);
            m36p861 = new FieldDef("m36p861",FieldDef.CHAR,50);
            m36p862 = new FieldDef("m36p862",FieldDef.CHAR,40);
            m36p863 = new FieldDef("m36p863",FieldDef.CHAR,30);
            m36p864 = new FieldDef("m36p864",FieldDef.CHAR,100);
            m36p865 = new FieldDef("m36p865",FieldDef.CHAR,10);
            m36p866 = new FieldDef("m36p866",FieldDef.CHAR,30);
            m36p867 = new FieldDef("m36p867",FieldDef.CHAR,30);
            m36p868 = new FieldDef("m36p868",FieldDef.CHAR,2);
            m36p869 = new FieldDef("m36p869",FieldDef.CHAR,15);
            m36p870 = new FieldDef("m36p870",FieldDef.CHAR,15);
            m36p871 = new FieldDef("m36p871",FieldDef.CHAR,15);
            m36p818 = new FieldDef("m36p818",FieldDef.FLOAT,6,0);
            m36p819 = new FieldDef("m36p819",FieldDef.CHAR,1);
            m36p821 = new FieldDef("m36p821",FieldDef.CHAR,1);
            m36p823 = new FieldDef("m36p823",FieldDef.CHAR,1);
            m36p825 = new FieldDef("m36p825",FieldDef.CHAR,1);
            m36px802 = new FieldDef("m36px802",FieldDef.CHAR,1);
            m36px805 = new FieldDef("m36px805",FieldDef.DATE);
            m36px800 = new FieldDef("m36px800",FieldDef.CHAR,9);
            m36px801 = new FieldDef("m36px801",FieldDef.CHAR,125);
            m36px841 = new FieldDef("m36px841",FieldDef.CHAR,5);
            m36px842 = new FieldDef("m36px842",FieldDef.CHAR,50);
            m36px843 = new FieldDef("m36px843",FieldDef.CHAR,3);
            m36px844 = new FieldDef("m36px844",FieldDef.INTEGER,0);
            m36px845 = new FieldDef("m36px845",FieldDef.CHAR,3);
            m36px846 = new FieldDef("m36px846",FieldDef.CHAR,3);
            m36px847 = new FieldDef("m36px847",FieldDef.CHAR,3);
            m36px848 = new FieldDef("m36px848",FieldDef.CHAR,3);
            m36px849 = new FieldDef("m36px849",FieldDef.CHAR,3);
            m36px850 = new FieldDef("m36px850",FieldDef.CHAR,3);
            m36px851 = new FieldDef("m36px851",FieldDef.CHAR,40);
            m36px852 = new FieldDef("m36px852",FieldDef.CHAR,30);
            m36px853 = new FieldDef("m36px853",FieldDef.CHAR,5);
            m36px854 = new FieldDef("m36px854",FieldDef.CHAR,30);
            m36px854m = new FieldDef("m36px854m",FieldDef.CHAR,5);
            m36px855 = new FieldDef("m36px855",FieldDef.CHAR,2);
            m36px856 = new FieldDef("m36px856",FieldDef.INTEGER,0);
            m36px857 = new FieldDef("m36px857",FieldDef.INTEGER,0);
            m36px858 = new FieldDef("m36px858",FieldDef.INTEGER,0);
            m36px859 = new FieldDef("m36px859",FieldDef.CHAR,100);
            m36px861 = new FieldDef("m36px861",FieldDef.CHAR,50);
            m36px862 = new FieldDef("m36px862",FieldDef.CHAR,40);
            m36px863 = new FieldDef("m36px863",FieldDef.CHAR,30);
            m36px864 = new FieldDef("m36px864",FieldDef.CHAR,100);
            m36px865 = new FieldDef("m36px865",FieldDef.CHAR,10);
            m36px866 = new FieldDef("m36px866",FieldDef.CHAR,30);
            m36px867 = new FieldDef("m36px867",FieldDef.CHAR,30);
            m36px868 = new FieldDef("m36px868",FieldDef.CHAR,2);
            m36px869 = new FieldDef("m36px869",FieldDef.CHAR,15);
            m36px870 = new FieldDef("m36px870",FieldDef.CHAR,15);
            m36px871 = new FieldDef("m36px871",FieldDef.CHAR,15);
            m36px818 = new FieldDef("m36px818",FieldDef.FLOAT,6,0);
            m36px819 = new FieldDef("m36px819",FieldDef.CHAR,1);
            m36px821 = new FieldDef("m36px821",FieldDef.CHAR,1);
            m36px823 = new FieldDef("m36px823",FieldDef.CHAR,1);
            m36px825 = new FieldDef("m36px825",FieldDef.CHAR,1);
            m36p859soc = new FieldDef("m36p859soc",FieldDef.FLOAT,6,0);
            m36px859soc = new FieldDef("m36px859soc",FieldDef.FLOAT,6,0);
            m36py802 = new FieldDef("m36py802",FieldDef.CHAR,1);
            m36py801 = new FieldDef("m36py801",FieldDef.CHAR,125);
            m36py819 = new FieldDef("m36py819",FieldDef.CHAR,1);
            m36py821 = new FieldDef("m36py821",FieldDef.CHAR,1);
            m36py823 = new FieldDef("m36py823",FieldDef.CHAR,1);
            m36py825 = new FieldDef("m36py825",FieldDef.CHAR,1);
            m36py818 = new FieldDef("m36py818",FieldDef.FLOAT,0,2);
            m36py859soc = new FieldDef("m36py859soc",FieldDef.FLOAT,0,2);
            m36pz802 = new FieldDef("m36pz802",FieldDef.CHAR,1);
            m36pz801 = new FieldDef("m36pz801",FieldDef.CHAR,125);
            m36pz819 = new FieldDef("m36pz819",FieldDef.CHAR,1);
            m36pz821 = new FieldDef("m36pz821",FieldDef.CHAR,1);
            m36pz823 = new FieldDef("m36pz823",FieldDef.CHAR,1);
            m36pz825 = new FieldDef("m36pz825",FieldDef.CHAR,1);
            m36pz818 = new FieldDef("m36pz818",FieldDef.FLOAT,0,2);
            m36pz859soc = new FieldDef("m36pz859soc",FieldDef.FLOAT,0,2);
            m36py805 = new FieldDef("m36py805",FieldDef.DATE);
            m36py800 = new FieldDef("m36py800",FieldDef.CHAR,9);
            m36pz805 = new FieldDef("m36pz805",FieldDef.DATE);
            m36pz800 = new FieldDef("m36pz800",FieldDef.CHAR,9);
            FieldDef array[] = {
                m36p8dominio,
                m36p8nif,
                m36p8ejercicio,
                m36p8periodo,
                m36p8pagina,
                m36p802,
                m36p805,
                m36p800,
                m36p801,
                m36p841,
                m36p842,
                m36p843,
                m36p844,
                m36p845,
                m36p846,
                m36p847,
                m36p848,
                m36p849,
                m36p850,
                m36p851,
                m36p852,
                m36p853,
                m36p854,
                m36p854m,
                m36p855,
                m36p856,
                m36p857,
                m36p858,
                m36p859,
                m36p861,
                m36p862,
                m36p863,
                m36p864,
                m36p865,
                m36p866,
                m36p867,
                m36p868,
                m36p869,
                m36p870,
                m36p871,
                m36p818,
                m36p819,
                m36p821,
                m36p823,
                m36p825,
                m36px802,
                m36px805,
                m36px800,
                m36px801,
                m36px841,
                m36px842,
                m36px843,
                m36px844,
                m36px845,
                m36px846,
                m36px847,
                m36px848,
                m36px849,
                m36px850,
                m36px851,
                m36px852,
                m36px853,
                m36px854,
                m36px854m,
                m36px855,
                m36px856,
                m36px857,
                m36px858,
                m36px859,
                m36px861,
                m36px862,
                m36px863,
                m36px864,
                m36px865,
                m36px866,
                m36px867,
                m36px868,
                m36px869,
                m36px870,
                m36px871,
                m36px818,
                m36px819,
                m36px821,
                m36px823,
                m36px825,
                m36p859soc,
                m36px859soc,
                m36py802,
                m36py801,
                m36py819,
                m36py821,
                m36py823,
                m36py825,
                m36py818,
                m36py859soc,
                m36pz802,
                m36pz801,
                m36pz819,
                m36pz821,
                m36pz823,
                m36pz825,
                m36pz818,
                m36pz859soc,
                m36py805,
                m36py800,
                m36pz805,
                m36pz800                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p8dominio,m36p8nif,m36p8ejercicio,m36p8periodo,m36p8pagina };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod340c extends TableDef
        {
        // campos
        public FieldDef m340cdominio;
        public FieldDef m340cnif;
        public FieldDef m340cejercicio;
        public FieldDef m340cperiodo;
        public FieldDef m340crazon;
        public FieldDef m340cnumjustif;
        public FieldDef m340ccomplem;
        public FieldDef m340csustitu;
        public FieldDef m340cnumdecant;
        public FieldDef m340cnumreg;
        public FieldDef m340ctotbase;
        public FieldDef m340ctotcuota;
        public FieldDef m340ctotfactura;
        public FieldDef m340cnifrepres;
        public FieldDef m340cfecha;
        public FieldDef m340cfirma;
        public FieldDef m340ccargofirm;
        public FieldDef m340ctelcont;
        public FieldDef m340cpercont;
        public FieldDef m340cobserva;
        public FieldDef m340ccodeleciva;
        public TabMod340c(String name)
            {
            super(name);
            m340cdominio = new FieldDef("m340cdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m340cnif = new FieldDef("m340cnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m340cejercicio = new FieldDef("m340cejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m340cperiodo = new FieldDef("m340cperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m340crazon = new FieldDef("m340crazon",FieldDef.CHAR,40);
            m340cnumjustif = new FieldDef("m340cnumjustif",FieldDef.CHAR,13);
            m340ccomplem = new FieldDef("m340ccomplem",FieldDef.CHAR,1);
            m340csustitu = new FieldDef("m340csustitu",FieldDef.CHAR,1);
            m340cnumdecant = new FieldDef("m340cnumdecant",FieldDef.CHAR,13);
            m340cnumreg = new FieldDef("m340cnumreg",FieldDef.INTEGER,0);
            m340ctotbase = new FieldDef("m340ctotbase",FieldDef.FLOAT,6,0);
            m340ctotcuota = new FieldDef("m340ctotcuota",FieldDef.FLOAT,6,0);
            m340ctotfactura = new FieldDef("m340ctotfactura",FieldDef.FLOAT,6,0);
            m340cnifrepres = new FieldDef("m340cnifrepres",FieldDef.CHAR,9);
            m340cfecha = new FieldDef("m340cfecha",FieldDef.DATE);
            m340cfirma = new FieldDef("m340cfirma",FieldDef.CHAR,30);
            m340ccargofirm = new FieldDef("m340ccargofirm",FieldDef.CHAR,25);
            m340ctelcont = new FieldDef("m340ctelcont",FieldDef.CHAR,9);
            m340cpercont = new FieldDef("m340cpercont",FieldDef.CHAR,100);
            m340cobserva = new FieldDef("m340cobserva",FieldDef.CHAR,350);
            m340ccodeleciva = new FieldDef("m340ccodeleciva",FieldDef.CHAR,16);
            FieldDef array[] = {
                m340cdominio,
                m340cnif,
                m340cejercicio,
                m340cperiodo,
                m340crazon,
                m340cnumjustif,
                m340ccomplem,
                m340csustitu,
                m340cnumdecant,
                m340cnumreg,
                m340ctotbase,
                m340ctotcuota,
                m340ctotfactura,
                m340cnifrepres,
                m340cfecha,
                m340cfirma,
                m340ccargofirm,
                m340ctelcont,
                m340cpercont,
                m340cobserva,
                m340ccodeleciva                
                };
            setColumns(array);
            FieldDef arrayf[] = {m340cdominio,m340cnif,m340cejercicio,m340cperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod340e extends TableDef
        {
        // campos
        public FieldDef m340eident;
        public FieldDef m340edominio;
        public FieldDef m340enif;
        public FieldDef m340eejercicio;
        public FieldDef m340eperiodo;
        public FieldDef m340enifdecla;
        public FieldDef m340enifrepres;
        public FieldDef m340erazondecla;
        public FieldDef m340epais;
        public FieldDef m340etipopais;
        public FieldDef m340enifcomuni;
        public FieldDef m340etipolibro;
        public FieldDef m340eoperacion;
        public FieldDef m340efechaexp;
        public FieldDef m340efechaope;
        public FieldDef m340eporcen;
        public FieldDef m340ebase;
        public FieldDef m340ecuota;
        public FieldDef m340etotal;
        public FieldDef m340ebasecoste;
        public FieldDef m340eidentifac;
        public FieldDef m340enumfac;
        public FieldDef m340enroreg;
        public FieldDef m340enrodesglos;
        public FieldDef m340enroacumul1;
        public FieldDef m340enroacumul2;
        public FieldDef m340enrorectifi;
        public FieldDef m340eporcenre;
        public FieldDef m340ecuotare;
        public FieldDef m340esituacion;
        public FieldDef m340erefcat;
        public FieldDef m340eimpef;
        public FieldDef m340eejeinm;
        public FieldDef m340eimpefinm;
        public FieldDef m340efecrecc;
        public FieldDef m340eimprecc;
        public FieldDef m340emedrecc;
        public FieldDef m340ecccrec;
        public TabMod340e(String name)
            {
            super(name);
            m340eident = new FieldDef("m340eident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m340edominio = new FieldDef("m340edominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m340enif = new FieldDef("m340enif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m340eejercicio = new FieldDef("m340eejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m340eperiodo = new FieldDef("m340eperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m340enifdecla = new FieldDef("m340enifdecla",FieldDef.CHAR,9);
            m340enifrepres = new FieldDef("m340enifrepres",FieldDef.CHAR,9);
            m340erazondecla = new FieldDef("m340erazondecla",FieldDef.CHAR,40);
            m340epais = new FieldDef("m340epais",FieldDef.CHAR,2);
            m340etipopais = new FieldDef("m340etipopais",FieldDef.INTEGER,0);
            m340enifcomuni = new FieldDef("m340enifcomuni",FieldDef.CHAR,15);
            m340etipolibro = new FieldDef("m340etipolibro",FieldDef.CHAR,1);
            m340eoperacion = new FieldDef("m340eoperacion",FieldDef.CHAR,1);
            m340efechaexp = new FieldDef("m340efechaexp",FieldDef.DATE);
            m340efechaope = new FieldDef("m340efechaope",FieldDef.DATE);
            m340eporcen = new FieldDef("m340eporcen",FieldDef.FLOAT,6,0);
            m340ebase = new FieldDef("m340ebase",FieldDef.FLOAT,6,0);
            m340ecuota = new FieldDef("m340ecuota",FieldDef.FLOAT,6,0);
            m340etotal = new FieldDef("m340etotal",FieldDef.FLOAT,6,0);
            m340ebasecoste = new FieldDef("m340ebasecoste",FieldDef.FLOAT,6,0);
            m340eidentifac = new FieldDef("m340eidentifac",FieldDef.CHAR,40);
            m340enumfac = new FieldDef("m340enumfac",FieldDef.CHAR,18);
            m340enroreg = new FieldDef("m340enroreg",FieldDef.INTEGER,0);
            m340enrodesglos = new FieldDef("m340enrodesglos",FieldDef.INTEGER,0);
            m340enroacumul1 = new FieldDef("m340enroacumul1",FieldDef.CHAR,40);
            m340enroacumul2 = new FieldDef("m340enroacumul2",FieldDef.CHAR,40);
            m340enrorectifi = new FieldDef("m340enrorectifi",FieldDef.CHAR,40);
            m340eporcenre = new FieldDef("m340eporcenre",FieldDef.FLOAT,6,0);
            m340ecuotare = new FieldDef("m340ecuotare",FieldDef.FLOAT,6,0);
            m340esituacion = new FieldDef("m340esituacion",FieldDef.INTEGER,0);
            m340erefcat = new FieldDef("m340erefcat",FieldDef.CHAR,25);
            m340eimpef = new FieldDef("m340eimpef",FieldDef.FLOAT,6,0);
            m340eejeinm = new FieldDef("m340eejeinm",FieldDef.INTEGER,0);
            m340eimpefinm = new FieldDef("m340eimpefinm",FieldDef.FLOAT,6,0);
            m340efecrecc = new FieldDef("m340efecrecc",FieldDef.DATE);
            m340eimprecc = new FieldDef("m340eimprecc",FieldDef.FLOAT,6,0);
            m340emedrecc = new FieldDef("m340emedrecc",FieldDef.CHAR,1);
            m340ecccrec = new FieldDef("m340ecccrec",FieldDef.CHAR,34);
            FieldDef array[] = {
                m340eident,
                m340edominio,
                m340enif,
                m340eejercicio,
                m340eperiodo,
                m340enifdecla,
                m340enifrepres,
                m340erazondecla,
                m340epais,
                m340etipopais,
                m340enifcomuni,
                m340etipolibro,
                m340eoperacion,
                m340efechaexp,
                m340efechaope,
                m340eporcen,
                m340ebase,
                m340ecuota,
                m340etotal,
                m340ebasecoste,
                m340eidentifac,
                m340enumfac,
                m340enroreg,
                m340enrodesglos,
                m340enroacumul1,
                m340enroacumul2,
                m340enrorectifi,
                m340eporcenre,
                m340ecuotare,
                m340esituacion,
                m340erefcat,
                m340eimpef,
                m340eejeinm,
                m340eimpefinm,
                m340efecrecc,
                m340eimprecc,
                m340emedrecc,
                m340ecccrec                
                };
            setColumns(array);
            FieldDef arrayf[] = {m340eident };
            setPrimaryKeys(arrayf);
            m340eident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod340r extends TableDef
        {
        // campos
        public FieldDef m340rident;
        public FieldDef m340rdominio;
        public FieldDef m340rnif;
        public FieldDef m340rejercicio;
        public FieldDef m340rperiodo;
        public FieldDef m340rnifdecla;
        public FieldDef m340rnifrepres;
        public FieldDef m340rrazondecla;
        public FieldDef m340rpais;
        public FieldDef m340rtipopais;
        public FieldDef m340rnifcomuni;
        public FieldDef m340rtipolibro;
        public FieldDef m340roperacion;
        public FieldDef m340rfechaexp;
        public FieldDef m340rfechaope;
        public FieldDef m340rporcen;
        public FieldDef m340rbase;
        public FieldDef m340rcuota;
        public FieldDef m340rtotal;
        public FieldDef m340rbasecoste;
        public FieldDef m340ridentifac;
        public FieldDef m340rnumfac;
        public FieldDef m340rnroreg;
        public FieldDef m340rnrodesglos;
        public FieldDef m340rnroacumul1;
        public FieldDef m340rnroacumul2;
        public FieldDef m340rcuotadeduc;
        public FieldDef m340rfecrecc;
        public FieldDef m340rimprecc;
        public FieldDef m340rmedrecc;
        public FieldDef m340rcccrec;
        public TabMod340r(String name)
            {
            super(name);
            m340rident = new FieldDef("m340rident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m340rdominio = new FieldDef("m340rdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m340rnif = new FieldDef("m340rnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m340rejercicio = new FieldDef("m340rejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m340rperiodo = new FieldDef("m340rperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m340rnifdecla = new FieldDef("m340rnifdecla",FieldDef.CHAR,9);
            m340rnifrepres = new FieldDef("m340rnifrepres",FieldDef.CHAR,9);
            m340rrazondecla = new FieldDef("m340rrazondecla",FieldDef.CHAR,40);
            m340rpais = new FieldDef("m340rpais",FieldDef.CHAR,2);
            m340rtipopais = new FieldDef("m340rtipopais",FieldDef.INTEGER,0);
            m340rnifcomuni = new FieldDef("m340rnifcomuni",FieldDef.CHAR,15);
            m340rtipolibro = new FieldDef("m340rtipolibro",FieldDef.CHAR,1);
            m340roperacion = new FieldDef("m340roperacion",FieldDef.CHAR,1);
            m340rfechaexp = new FieldDef("m340rfechaexp",FieldDef.DATE);
            m340rfechaope = new FieldDef("m340rfechaope",FieldDef.DATE);
            m340rporcen = new FieldDef("m340rporcen",FieldDef.FLOAT,6,0);
            m340rbase = new FieldDef("m340rbase",FieldDef.FLOAT,6,0);
            m340rcuota = new FieldDef("m340rcuota",FieldDef.FLOAT,6,0);
            m340rtotal = new FieldDef("m340rtotal",FieldDef.FLOAT,6,0);
            m340rbasecoste = new FieldDef("m340rbasecoste",FieldDef.FLOAT,6,0);
            m340ridentifac = new FieldDef("m340ridentifac",FieldDef.CHAR,40);
            m340rnumfac = new FieldDef("m340rnumfac",FieldDef.CHAR,18);
            m340rnroreg = new FieldDef("m340rnroreg",FieldDef.INTEGER,0);
            m340rnrodesglos = new FieldDef("m340rnrodesglos",FieldDef.INTEGER,0);
            m340rnroacumul1 = new FieldDef("m340rnroacumul1",FieldDef.CHAR,40);
            m340rnroacumul2 = new FieldDef("m340rnroacumul2",FieldDef.CHAR,40);
            m340rcuotadeduc = new FieldDef("m340rcuotadeduc",FieldDef.FLOAT,6,0);
            m340rfecrecc = new FieldDef("m340rfecrecc",FieldDef.DATE);
            m340rimprecc = new FieldDef("m340rimprecc",FieldDef.FLOAT,6,0);
            m340rmedrecc = new FieldDef("m340rmedrecc",FieldDef.CHAR,1);
            m340rcccrec = new FieldDef("m340rcccrec",FieldDef.CHAR,34);
            FieldDef array[] = {
                m340rident,
                m340rdominio,
                m340rnif,
                m340rejercicio,
                m340rperiodo,
                m340rnifdecla,
                m340rnifrepres,
                m340rrazondecla,
                m340rpais,
                m340rtipopais,
                m340rnifcomuni,
                m340rtipolibro,
                m340roperacion,
                m340rfechaexp,
                m340rfechaope,
                m340rporcen,
                m340rbase,
                m340rcuota,
                m340rtotal,
                m340rbasecoste,
                m340ridentifac,
                m340rnumfac,
                m340rnroreg,
                m340rnrodesglos,
                m340rnroacumul1,
                m340rnroacumul2,
                m340rcuotadeduc,
                m340rfecrecc,
                m340rimprecc,
                m340rmedrecc,
                m340rcccrec                
                };
            setColumns(array);
            FieldDef arrayf[] = {m340rident };
            setPrimaryKeys(arrayf);
            m340rident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod340b extends TableDef
        {
        // campos
        public FieldDef m340bident;
        public FieldDef m340bdominio;
        public FieldDef m340bnif;
        public FieldDef m340bejercicio;
        public FieldDef m340bperiodo;
        public FieldDef m340bnifdecla;
        public FieldDef m340bnifrepres;
        public FieldDef m340brazondecla;
        public FieldDef m340bpais;
        public FieldDef m340btipopais;
        public FieldDef m340bnifcomuni;
        public FieldDef m340btipolibro;
        public FieldDef m340boperacion;
        public FieldDef m340bfechaexp;
        public FieldDef m340bfechaope;
        public FieldDef m340bporcen;
        public FieldDef m340bbase;
        public FieldDef m340bcuota;
        public FieldDef m340btotal;
        public FieldDef m340bbasecoste;
        public FieldDef m340bidentifac;
        public FieldDef m340bnumfac;
        public FieldDef m340bporprorrat;
        public FieldDef m340bregularded;
        public FieldDef m340bidentiexp;
        public FieldDef m340bregulartra;
        public FieldDef m340bfechautil;
        public FieldDef m340bidentibien;
        public TabMod340b(String name)
            {
            super(name);
            m340bident = new FieldDef("m340bident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m340bdominio = new FieldDef("m340bdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m340bnif = new FieldDef("m340bnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m340bejercicio = new FieldDef("m340bejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m340bperiodo = new FieldDef("m340bperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m340bnifdecla = new FieldDef("m340bnifdecla",FieldDef.CHAR,9);
            m340bnifrepres = new FieldDef("m340bnifrepres",FieldDef.CHAR,9);
            m340brazondecla = new FieldDef("m340brazondecla",FieldDef.CHAR,40);
            m340bpais = new FieldDef("m340bpais",FieldDef.CHAR,2);
            m340btipopais = new FieldDef("m340btipopais",FieldDef.INTEGER,0);
            m340bnifcomuni = new FieldDef("m340bnifcomuni",FieldDef.CHAR,15);
            m340btipolibro = new FieldDef("m340btipolibro",FieldDef.CHAR,1);
            m340boperacion = new FieldDef("m340boperacion",FieldDef.CHAR,1);
            m340bfechaexp = new FieldDef("m340bfechaexp",FieldDef.DATE);
            m340bfechaope = new FieldDef("m340bfechaope",FieldDef.DATE);
            m340bporcen = new FieldDef("m340bporcen",FieldDef.FLOAT,6,0);
            m340bbase = new FieldDef("m340bbase",FieldDef.FLOAT,6,0);
            m340bcuota = new FieldDef("m340bcuota",FieldDef.FLOAT,6,0);
            m340btotal = new FieldDef("m340btotal",FieldDef.FLOAT,6,0);
            m340bbasecoste = new FieldDef("m340bbasecoste",FieldDef.FLOAT,6,0);
            m340bidentifac = new FieldDef("m340bidentifac",FieldDef.CHAR,40);
            m340bnumfac = new FieldDef("m340bnumfac",FieldDef.CHAR,18);
            m340bporprorrat = new FieldDef("m340bporprorrat",FieldDef.INTEGER,0);
            m340bregularded = new FieldDef("m340bregularded",FieldDef.FLOAT,6,0);
            m340bidentiexp = new FieldDef("m340bidentiexp",FieldDef.CHAR,40);
            m340bregulartra = new FieldDef("m340bregulartra",FieldDef.FLOAT,6,0);
            m340bfechautil = new FieldDef("m340bfechautil",FieldDef.DATE);
            m340bidentibien = new FieldDef("m340bidentibien",FieldDef.CHAR,17);
            FieldDef array[] = {
                m340bident,
                m340bdominio,
                m340bnif,
                m340bejercicio,
                m340bperiodo,
                m340bnifdecla,
                m340bnifrepres,
                m340brazondecla,
                m340bpais,
                m340btipopais,
                m340bnifcomuni,
                m340btipolibro,
                m340boperacion,
                m340bfechaexp,
                m340bfechaope,
                m340bporcen,
                m340bbase,
                m340bcuota,
                m340btotal,
                m340bbasecoste,
                m340bidentifac,
                m340bnumfac,
                m340bporprorrat,
                m340bregularded,
                m340bidentiexp,
                m340bregulartra,
                m340bfechautil,
                m340bidentibien                
                };
            setColumns(array);
            FieldDef arrayf[] = {m340bident };
            setPrimaryKeys(arrayf);
            m340bident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod340i extends TableDef
        {
        // campos
        public FieldDef m340iident;
        public FieldDef m340idominio;
        public FieldDef m340inif;
        public FieldDef m340iejercicio;
        public FieldDef m340iperiodo;
        public FieldDef m340inifdecla;
        public FieldDef m340inifrepres;
        public FieldDef m340irazondecla;
        public FieldDef m340ipais;
        public FieldDef m340itipopais;
        public FieldDef m340inifcomuni;
        public FieldDef m340itipolibro;
        public FieldDef m340ioperacion;
        public FieldDef m340ifechaexp;
        public FieldDef m340ifechaope;
        public FieldDef m340iporcen;
        public FieldDef m340ibase;
        public FieldDef m340icuota;
        public FieldDef m340itotal;
        public FieldDef m340ibasecoste;
        public FieldDef m340iidentifac;
        public FieldDef m340inumfac;
        public FieldDef m340ioperintra;
        public FieldDef m340iclavedecla;
        public FieldDef m340ipaisue;
        public FieldDef m340idias;
        public FieldDef m340idescrip;
        public FieldDef m340idomicili;
        public FieldDef m340ipoblacio;
        public FieldDef m340ipostal;
        public FieldDef m340iotrasfac;
        public TabMod340i(String name)
            {
            super(name);
            m340iident = new FieldDef("m340iident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m340idominio = new FieldDef("m340idominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m340inif = new FieldDef("m340inif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m340iejercicio = new FieldDef("m340iejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m340iperiodo = new FieldDef("m340iperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m340inifdecla = new FieldDef("m340inifdecla",FieldDef.CHAR,9);
            m340inifrepres = new FieldDef("m340inifrepres",FieldDef.CHAR,9);
            m340irazondecla = new FieldDef("m340irazondecla",FieldDef.CHAR,40);
            m340ipais = new FieldDef("m340ipais",FieldDef.CHAR,2);
            m340itipopais = new FieldDef("m340itipopais",FieldDef.INTEGER,0);
            m340inifcomuni = new FieldDef("m340inifcomuni",FieldDef.CHAR,15);
            m340itipolibro = new FieldDef("m340itipolibro",FieldDef.CHAR,1);
            m340ioperacion = new FieldDef("m340ioperacion",FieldDef.CHAR,1);
            m340ifechaexp = new FieldDef("m340ifechaexp",FieldDef.DATE);
            m340ifechaope = new FieldDef("m340ifechaope",FieldDef.DATE);
            m340iporcen = new FieldDef("m340iporcen",FieldDef.FLOAT,6,0);
            m340ibase = new FieldDef("m340ibase",FieldDef.FLOAT,6,0);
            m340icuota = new FieldDef("m340icuota",FieldDef.FLOAT,6,0);
            m340itotal = new FieldDef("m340itotal",FieldDef.FLOAT,6,0);
            m340ibasecoste = new FieldDef("m340ibasecoste",FieldDef.FLOAT,6,0);
            m340iidentifac = new FieldDef("m340iidentifac",FieldDef.CHAR,40);
            m340inumfac = new FieldDef("m340inumfac",FieldDef.CHAR,18);
            m340ioperintra = new FieldDef("m340ioperintra",FieldDef.CHAR,1);
            m340iclavedecla = new FieldDef("m340iclavedecla",FieldDef.CHAR,1);
            m340ipaisue = new FieldDef("m340ipaisue",FieldDef.CHAR,2);
            m340idias = new FieldDef("m340idias",FieldDef.INTEGER,0);
            m340idescrip = new FieldDef("m340idescrip",FieldDef.CHAR,35);
            m340idomicili = new FieldDef("m340idomicili",FieldDef.CHAR,40);
            m340ipoblacio = new FieldDef("m340ipoblacio",FieldDef.CHAR,22);
            m340ipostal = new FieldDef("m340ipostal",FieldDef.CHAR,10);
            m340iotrasfac = new FieldDef("m340iotrasfac",FieldDef.CHAR,135);
            FieldDef array[] = {
                m340iident,
                m340idominio,
                m340inif,
                m340iejercicio,
                m340iperiodo,
                m340inifdecla,
                m340inifrepres,
                m340irazondecla,
                m340ipais,
                m340itipopais,
                m340inifcomuni,
                m340itipolibro,
                m340ioperacion,
                m340ifechaexp,
                m340ifechaope,
                m340iporcen,
                m340ibase,
                m340icuota,
                m340itotal,
                m340ibasecoste,
                m340iidentifac,
                m340inumfac,
                m340ioperintra,
                m340iclavedecla,
                m340ipaisue,
                m340idias,
                m340idescrip,
                m340idomicili,
                m340ipoblacio,
                m340ipostal,
                m340iotrasfac                
                };
            setColumns(array);
            FieldDef arrayf[] = {m340iident };
            setPrimaryKeys(arrayf);
            m340iident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod310des extends TableDef
        {
        // campos
        public FieldDef m310ddominio;
        public FieldDef m310dnif;
        public FieldDef m310dejercicio;
        public FieldDef m310dactividad;
        public FieldDef m310ddevbadqin1;
        public FieldDef m310ddevcadqin1;
        public FieldDef m310ddevbadqin2;
        public FieldDef m310ddevcadqin2;
        public FieldDef m310ddevbadqin3;
        public FieldDef m310ddevcadqin3;
        public FieldDef m310ddevbadqin4;
        public FieldDef m310ddevcadqin4;
        public FieldDef m310ddevbentre1;
        public FieldDef m310ddevcentre1;
        public FieldDef m310ddevbentre2;
        public FieldDef m310ddevcentre2;
        public FieldDef m310ddevbentre3;
        public FieldDef m310ddevcentre3;
        public FieldDef m310ddevbentre4;
        public FieldDef m310ddevcentre4;
        public FieldDef m310ddevbinvsu1;
        public FieldDef m310ddevcinvsu1;
        public FieldDef m310ddevbinvsu2;
        public FieldDef m310ddevcinvsu2;
        public FieldDef m310ddevbinvsu3;
        public FieldDef m310ddevcinvsu3;
        public FieldDef m310ddevbinvsu4;
        public FieldDef m310ddevcinvsu4;
        public FieldDef m310ddedbadqac1;
        public FieldDef m310ddedcadqac1;
        public FieldDef m310ddedbadqac2;
        public FieldDef m310ddedcadqac2;
        public FieldDef m310ddedbadqac3;
        public FieldDef m310ddedcadqac3;
        public FieldDef m310ddedbadqac4;
        public FieldDef m310ddedcadqac4;
        public FieldDef m310ddedbimpac1;
        public FieldDef m310ddedcimpac1;
        public FieldDef m310ddedbimpac2;
        public FieldDef m310ddedcimpac2;
        public FieldDef m310ddedbimpac3;
        public FieldDef m310ddedcimpac3;
        public FieldDef m310ddedbimpac4;
        public FieldDef m310ddedcimpac4;
        public FieldDef m310ddedcregbi1;
        public FieldDef m310ddedcregbi2;
        public FieldDef m310ddedcregbi3;
        public FieldDef m310ddedcregbi4;
        public FieldDef m310ddeveintra1;
        public FieldDef m310ddeveintra2;
        public FieldDef m310ddeveintra3;
        public FieldDef m310ddeveintra4;
        public FieldDef m310dliqiva;
        public FieldDef m310ddeccadatri;
        public TabMod310des(String name)
            {
            super(name);
            m310ddominio = new FieldDef("m310ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m310dnif = new FieldDef("m310dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m310dejercicio = new FieldDef("m310dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m310dactividad = new FieldDef("m310dactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m310ddevbadqin1 = new FieldDef("m310ddevbadqin1",FieldDef.FLOAT,6,0);
            m310ddevcadqin1 = new FieldDef("m310ddevcadqin1",FieldDef.FLOAT,6,0);
            m310ddevbadqin2 = new FieldDef("m310ddevbadqin2",FieldDef.FLOAT,6,0);
            m310ddevcadqin2 = new FieldDef("m310ddevcadqin2",FieldDef.FLOAT,6,0);
            m310ddevbadqin3 = new FieldDef("m310ddevbadqin3",FieldDef.FLOAT,6,0);
            m310ddevcadqin3 = new FieldDef("m310ddevcadqin3",FieldDef.FLOAT,6,0);
            m310ddevbadqin4 = new FieldDef("m310ddevbadqin4",FieldDef.FLOAT,6,0);
            m310ddevcadqin4 = new FieldDef("m310ddevcadqin4",FieldDef.FLOAT,6,0);
            m310ddevbentre1 = new FieldDef("m310ddevbentre1",FieldDef.FLOAT,6,0);
            m310ddevcentre1 = new FieldDef("m310ddevcentre1",FieldDef.FLOAT,6,0);
            m310ddevbentre2 = new FieldDef("m310ddevbentre2",FieldDef.FLOAT,6,0);
            m310ddevcentre2 = new FieldDef("m310ddevcentre2",FieldDef.FLOAT,6,0);
            m310ddevbentre3 = new FieldDef("m310ddevbentre3",FieldDef.FLOAT,6,0);
            m310ddevcentre3 = new FieldDef("m310ddevcentre3",FieldDef.FLOAT,6,0);
            m310ddevbentre4 = new FieldDef("m310ddevbentre4",FieldDef.FLOAT,6,0);
            m310ddevcentre4 = new FieldDef("m310ddevcentre4",FieldDef.FLOAT,6,0);
            m310ddevbinvsu1 = new FieldDef("m310ddevbinvsu1",FieldDef.FLOAT,6,0);
            m310ddevcinvsu1 = new FieldDef("m310ddevcinvsu1",FieldDef.FLOAT,6,0);
            m310ddevbinvsu2 = new FieldDef("m310ddevbinvsu2",FieldDef.FLOAT,6,0);
            m310ddevcinvsu2 = new FieldDef("m310ddevcinvsu2",FieldDef.FLOAT,6,0);
            m310ddevbinvsu3 = new FieldDef("m310ddevbinvsu3",FieldDef.FLOAT,6,0);
            m310ddevcinvsu3 = new FieldDef("m310ddevcinvsu3",FieldDef.FLOAT,6,0);
            m310ddevbinvsu4 = new FieldDef("m310ddevbinvsu4",FieldDef.FLOAT,6,0);
            m310ddevcinvsu4 = new FieldDef("m310ddevcinvsu4",FieldDef.FLOAT,6,0);
            m310ddedbadqac1 = new FieldDef("m310ddedbadqac1",FieldDef.FLOAT,6,0);
            m310ddedcadqac1 = new FieldDef("m310ddedcadqac1",FieldDef.FLOAT,6,0);
            m310ddedbadqac2 = new FieldDef("m310ddedbadqac2",FieldDef.FLOAT,6,0);
            m310ddedcadqac2 = new FieldDef("m310ddedcadqac2",FieldDef.FLOAT,6,0);
            m310ddedbadqac3 = new FieldDef("m310ddedbadqac3",FieldDef.FLOAT,6,0);
            m310ddedcadqac3 = new FieldDef("m310ddedcadqac3",FieldDef.FLOAT,6,0);
            m310ddedbadqac4 = new FieldDef("m310ddedbadqac4",FieldDef.FLOAT,6,0);
            m310ddedcadqac4 = new FieldDef("m310ddedcadqac4",FieldDef.FLOAT,6,0);
            m310ddedbimpac1 = new FieldDef("m310ddedbimpac1",FieldDef.FLOAT,6,0);
            m310ddedcimpac1 = new FieldDef("m310ddedcimpac1",FieldDef.FLOAT,6,0);
            m310ddedbimpac2 = new FieldDef("m310ddedbimpac2",FieldDef.FLOAT,6,0);
            m310ddedcimpac2 = new FieldDef("m310ddedcimpac2",FieldDef.FLOAT,6,0);
            m310ddedbimpac3 = new FieldDef("m310ddedbimpac3",FieldDef.FLOAT,6,0);
            m310ddedcimpac3 = new FieldDef("m310ddedcimpac3",FieldDef.FLOAT,6,0);
            m310ddedbimpac4 = new FieldDef("m310ddedbimpac4",FieldDef.FLOAT,6,0);
            m310ddedcimpac4 = new FieldDef("m310ddedcimpac4",FieldDef.FLOAT,6,0);
            m310ddedcregbi1 = new FieldDef("m310ddedcregbi1",FieldDef.FLOAT,6,0);
            m310ddedcregbi2 = new FieldDef("m310ddedcregbi2",FieldDef.FLOAT,6,0);
            m310ddedcregbi3 = new FieldDef("m310ddedcregbi3",FieldDef.FLOAT,6,0);
            m310ddedcregbi4 = new FieldDef("m310ddedcregbi4",FieldDef.FLOAT,6,0);
            m310ddeveintra1 = new FieldDef("m310ddeveintra1",FieldDef.FLOAT,6,0);
            m310ddeveintra2 = new FieldDef("m310ddeveintra2",FieldDef.FLOAT,6,0);
            m310ddeveintra3 = new FieldDef("m310ddeveintra3",FieldDef.FLOAT,6,0);
            m310ddeveintra4 = new FieldDef("m310ddeveintra4",FieldDef.FLOAT,6,0);
            m310dliqiva = new FieldDef("m310dliqiva",FieldDef.CHAR,1);
            m310ddeccadatri = new FieldDef("m310ddeccadatri",FieldDef.CHAR,1);
            FieldDef array[] = {
                m310ddominio,
                m310dnif,
                m310dejercicio,
                m310dactividad,
                m310ddevbadqin1,
                m310ddevcadqin1,
                m310ddevbadqin2,
                m310ddevcadqin2,
                m310ddevbadqin3,
                m310ddevcadqin3,
                m310ddevbadqin4,
                m310ddevcadqin4,
                m310ddevbentre1,
                m310ddevcentre1,
                m310ddevbentre2,
                m310ddevcentre2,
                m310ddevbentre3,
                m310ddevcentre3,
                m310ddevbentre4,
                m310ddevcentre4,
                m310ddevbinvsu1,
                m310ddevcinvsu1,
                m310ddevbinvsu2,
                m310ddevcinvsu2,
                m310ddevbinvsu3,
                m310ddevcinvsu3,
                m310ddevbinvsu4,
                m310ddevcinvsu4,
                m310ddedbadqac1,
                m310ddedcadqac1,
                m310ddedbadqac2,
                m310ddedcadqac2,
                m310ddedbadqac3,
                m310ddedcadqac3,
                m310ddedbadqac4,
                m310ddedcadqac4,
                m310ddedbimpac1,
                m310ddedcimpac1,
                m310ddedbimpac2,
                m310ddedcimpac2,
                m310ddedbimpac3,
                m310ddedcimpac3,
                m310ddedbimpac4,
                m310ddedcimpac4,
                m310ddedcregbi1,
                m310ddedcregbi2,
                m310ddedcregbi3,
                m310ddedcregbi4,
                m310ddeveintra1,
                m310ddeveintra2,
                m310ddeveintra3,
                m310ddeveintra4,
                m310dliqiva,
                m310ddeccadatri                
                };
            setColumns(array);
            FieldDef arrayf[] = {m310ddominio,m310dnif,m310dejercicio,m310dactividad };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod110g extends TableDef
        {
        // campos
        public FieldDef m110gident;
        public FieldDef m110greduc1;
        public FieldDef m110ggastos1;
        public FieldDef m110gpension1;
        public FieldDef m110ganualid1;
        public FieldDef m110greduc2;
        public FieldDef m110ggastos2;
        public FieldDef m110gpension2;
        public FieldDef m110ganualid2;
        public FieldDef m110greduc3;
        public FieldDef m110ggastos3;
        public FieldDef m110gpension3;
        public FieldDef m110ganualid3;
        public FieldDef m110greduc4;
        public FieldDef m110ggastos4;
        public FieldDef m110gpension4;
        public FieldDef m110ganualid4;
        public FieldDef m110greduc5;
        public FieldDef m110ggastos5;
        public FieldDef m110gpension5;
        public FieldDef m110ganualid5;
        public FieldDef m110greduc6;
        public FieldDef m110ggastos6;
        public FieldDef m110gpension6;
        public FieldDef m110ganualid6;
        public FieldDef m110greduc7;
        public FieldDef m110ggastos7;
        public FieldDef m110gpension7;
        public FieldDef m110ganualid7;
        public FieldDef m110greduc8;
        public FieldDef m110ggastos8;
        public FieldDef m110gpension8;
        public FieldDef m110ganualid8;
        public FieldDef m110greduc9;
        public FieldDef m110ggastos9;
        public FieldDef m110gpension9;
        public FieldDef m110ganualid9;
        public FieldDef m110greduc10;
        public FieldDef m110ggastos10;
        public FieldDef m110gpension10;
        public FieldDef m110ganualid10;
        public FieldDef m110greduc11;
        public FieldDef m110ggastos11;
        public FieldDef m110gpension11;
        public FieldDef m110ganualid11;
        public FieldDef m110greduc12;
        public FieldDef m110ggastos12;
        public FieldDef m110gpension12;
        public FieldDef m110ganualid12;
        public TabMod110g(String name)
            {
            super(name);
            m110gident = new FieldDef("m110gident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m110greduc1 = new FieldDef("m110greduc1",FieldDef.FLOAT,6,0);
            m110ggastos1 = new FieldDef("m110ggastos1",FieldDef.FLOAT,6,0);
            m110gpension1 = new FieldDef("m110gpension1",FieldDef.FLOAT,6,0);
            m110ganualid1 = new FieldDef("m110ganualid1",FieldDef.FLOAT,6,0);
            m110greduc2 = new FieldDef("m110greduc2",FieldDef.FLOAT,6,0);
            m110ggastos2 = new FieldDef("m110ggastos2",FieldDef.FLOAT,6,0);
            m110gpension2 = new FieldDef("m110gpension2",FieldDef.FLOAT,6,0);
            m110ganualid2 = new FieldDef("m110ganualid2",FieldDef.FLOAT,6,0);
            m110greduc3 = new FieldDef("m110greduc3",FieldDef.FLOAT,6,0);
            m110ggastos3 = new FieldDef("m110ggastos3",FieldDef.FLOAT,6,0);
            m110gpension3 = new FieldDef("m110gpension3",FieldDef.FLOAT,6,0);
            m110ganualid3 = new FieldDef("m110ganualid3",FieldDef.FLOAT,6,0);
            m110greduc4 = new FieldDef("m110greduc4",FieldDef.FLOAT,6,0);
            m110ggastos4 = new FieldDef("m110ggastos4",FieldDef.FLOAT,6,0);
            m110gpension4 = new FieldDef("m110gpension4",FieldDef.FLOAT,6,0);
            m110ganualid4 = new FieldDef("m110ganualid4",FieldDef.FLOAT,6,0);
            m110greduc5 = new FieldDef("m110greduc5",FieldDef.FLOAT,6,0);
            m110ggastos5 = new FieldDef("m110ggastos5",FieldDef.FLOAT,6,0);
            m110gpension5 = new FieldDef("m110gpension5",FieldDef.FLOAT,6,0);
            m110ganualid5 = new FieldDef("m110ganualid5",FieldDef.FLOAT,6,0);
            m110greduc6 = new FieldDef("m110greduc6",FieldDef.FLOAT,6,0);
            m110ggastos6 = new FieldDef("m110ggastos6",FieldDef.FLOAT,6,0);
            m110gpension6 = new FieldDef("m110gpension6",FieldDef.FLOAT,6,0);
            m110ganualid6 = new FieldDef("m110ganualid6",FieldDef.FLOAT,6,0);
            m110greduc7 = new FieldDef("m110greduc7",FieldDef.FLOAT,6,0);
            m110ggastos7 = new FieldDef("m110ggastos7",FieldDef.FLOAT,6,0);
            m110gpension7 = new FieldDef("m110gpension7",FieldDef.FLOAT,6,0);
            m110ganualid7 = new FieldDef("m110ganualid7",FieldDef.FLOAT,6,0);
            m110greduc8 = new FieldDef("m110greduc8",FieldDef.FLOAT,6,0);
            m110ggastos8 = new FieldDef("m110ggastos8",FieldDef.FLOAT,6,0);
            m110gpension8 = new FieldDef("m110gpension8",FieldDef.FLOAT,6,0);
            m110ganualid8 = new FieldDef("m110ganualid8",FieldDef.FLOAT,6,0);
            m110greduc9 = new FieldDef("m110greduc9",FieldDef.FLOAT,6,0);
            m110ggastos9 = new FieldDef("m110ggastos9",FieldDef.FLOAT,6,0);
            m110gpension9 = new FieldDef("m110gpension9",FieldDef.FLOAT,6,0);
            m110ganualid9 = new FieldDef("m110ganualid9",FieldDef.FLOAT,6,0);
            m110greduc10 = new FieldDef("m110greduc10",FieldDef.FLOAT,6,0);
            m110ggastos10 = new FieldDef("m110ggastos10",FieldDef.FLOAT,6,0);
            m110gpension10 = new FieldDef("m110gpension10",FieldDef.FLOAT,6,0);
            m110ganualid10 = new FieldDef("m110ganualid10",FieldDef.FLOAT,6,0);
            m110greduc11 = new FieldDef("m110greduc11",FieldDef.FLOAT,6,0);
            m110ggastos11 = new FieldDef("m110ggastos11",FieldDef.FLOAT,6,0);
            m110gpension11 = new FieldDef("m110gpension11",FieldDef.FLOAT,6,0);
            m110ganualid11 = new FieldDef("m110ganualid11",FieldDef.FLOAT,6,0);
            m110greduc12 = new FieldDef("m110greduc12",FieldDef.FLOAT,6,0);
            m110ggastos12 = new FieldDef("m110ggastos12",FieldDef.FLOAT,6,0);
            m110gpension12 = new FieldDef("m110gpension12",FieldDef.FLOAT,6,0);
            m110ganualid12 = new FieldDef("m110ganualid12",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m110gident,
                m110greduc1,
                m110ggastos1,
                m110gpension1,
                m110ganualid1,
                m110greduc2,
                m110ggastos2,
                m110gpension2,
                m110ganualid2,
                m110greduc3,
                m110ggastos3,
                m110gpension3,
                m110ganualid3,
                m110greduc4,
                m110ggastos4,
                m110gpension4,
                m110ganualid4,
                m110greduc5,
                m110ggastos5,
                m110gpension5,
                m110ganualid5,
                m110greduc6,
                m110ggastos6,
                m110gpension6,
                m110ganualid6,
                m110greduc7,
                m110ggastos7,
                m110gpension7,
                m110ganualid7,
                m110greduc8,
                m110ggastos8,
                m110gpension8,
                m110ganualid8,
                m110greduc9,
                m110ggastos9,
                m110gpension9,
                m110ganualid9,
                m110greduc10,
                m110ggastos10,
                m110gpension10,
                m110ganualid10,
                m110greduc11,
                m110ggastos11,
                m110gpension11,
                m110ganualid11,
                m110greduc12,
                m110ggastos12,
                m110gpension12,
                m110ganualid12                
                };
            setColumns(array);
            FieldDef arrayf[] = {m110gident };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod308 extends TableDef
        {
        // campos
        public FieldDef m308dominio;
        public FieldDef m308nif;
        public FieldDef m308ejercicio;
        public FieldDef m308periodo;
        public FieldDef m308perpresen;
        public FieldDef m308razon;
        public FieldDef m308primerape;
        public FieldDef m308tipodec;
        public FieldDef m308adqnif;
        public FieldDef m308adqpais;
        public FieldDef m308adqrazon;
        public FieldDef m308vehmarca;
        public FieldDef m308vehtipo;
        public FieldDef m308vehmodelo;
        public FieldDef m308vehident;
        public FieldDef m308vehclasif;
        public FieldDef m308embfabric;
        public FieldDef m308embtipo;
        public FieldDef m308embident;
        public FieldDef m308embeslora;
        public FieldDef m308aerfabric;
        public FieldDef m308aermarca;
        public FieldDef m308aerserie;
        public FieldDef m308aeranyof;
        public FieldDef m308aerpeso;
        public FieldDef m308mliqpadq;
        public FieldDef m308mliqtip1;
        public FieldDef m308mliqivaso;
        public FieldDef m308mliqpvent;
        public FieldDef m308mliqtip2;
        public FieldDef m308mliqmaxde;
        public FieldDef m308mliqivade;
        public FieldDef m308rliqbase1;
        public FieldDef m308rliqtipo1;
        public FieldDef m308rliqcuot1;
        public FieldDef m308rliqbase2;
        public FieldDef m308rliqtipo2;
        public FieldDef m308rliqcuot2;
        public FieldDef m308rliqbase3;
        public FieldDef m308rliqtipo3;
        public FieldDef m308rliqcuot3;
        public FieldDef m308rliqivadint;
        public FieldDef m308mliqivadtra;
        public FieldDef m308entingreso;
        public FieldDef m308ofiingreso;
        public FieldDef m308digiingreso;
        public FieldDef m308ctaingreso;
        public FieldDef m308impingreso;
        public FieldDef m308perscont;
        public FieldDef m308telefono;
        public FieldDef m308observa;
        public FieldDef m308munifirma;
        public FieldDef m308fecha;
        public FieldDef mod308ivasopa21;
        public FieldDef mod308ivadeva21;
        public FieldDef m308ivasopa21;
        public FieldDef m308ivadeva21;
        public FieldDef m308paisiban;
        public FieldDef m308dciban;
        public FieldDef m308nombre;
        public FieldDef m308adqnombre;
        public FieldDef m308tipotrib;
        public FieldDef m308swift;
        public TabMod308(String name)
            {
            super(name);
            m308dominio = new FieldDef("m308dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m308nif = new FieldDef("m308nif",FieldDef.CHAR,9,FieldDef.NOTNULL);
            m308ejercicio = new FieldDef("m308ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m308periodo = new FieldDef("m308periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m308perpresen = new FieldDef("m308perpresen",FieldDef.CHAR,2);
            m308razon = new FieldDef("m308razon",FieldDef.CHAR,40);
            m308primerape = new FieldDef("m308primerape",FieldDef.CHAR,4);
            m308tipodec = new FieldDef("m308tipodec",FieldDef.CHAR,1);
            m308adqnif = new FieldDef("m308adqnif",FieldDef.CHAR,9);
            m308adqpais = new FieldDef("m308adqpais",FieldDef.CHAR,14);
            m308adqrazon = new FieldDef("m308adqrazon",FieldDef.CHAR,40);
            m308vehmarca = new FieldDef("m308vehmarca",FieldDef.CHAR,40);
            m308vehtipo = new FieldDef("m308vehtipo",FieldDef.CHAR,40);
            m308vehmodelo = new FieldDef("m308vehmodelo",FieldDef.CHAR,40);
            m308vehident = new FieldDef("m308vehident",FieldDef.CHAR,40);
            m308vehclasif = new FieldDef("m308vehclasif",FieldDef.CHAR,40);
            m308embfabric = new FieldDef("m308embfabric",FieldDef.CHAR,40);
            m308embtipo = new FieldDef("m308embtipo",FieldDef.CHAR,40);
            m308embident = new FieldDef("m308embident",FieldDef.CHAR,40);
            m308embeslora = new FieldDef("m308embeslora",FieldDef.FLOAT,6,0);
            m308aerfabric = new FieldDef("m308aerfabric",FieldDef.CHAR,40);
            m308aermarca = new FieldDef("m308aermarca",FieldDef.CHAR,40);
            m308aerserie = new FieldDef("m308aerserie",FieldDef.CHAR,40);
            m308aeranyof = new FieldDef("m308aeranyof",FieldDef.INTEGER,0);
            m308aerpeso = new FieldDef("m308aerpeso",FieldDef.INTEGER,0);
            m308mliqpadq = new FieldDef("m308mliqpadq",FieldDef.FLOAT,6,0);
            m308mliqtip1 = new FieldDef("m308mliqtip1",FieldDef.FLOAT,6,0);
            m308mliqivaso = new FieldDef("m308mliqivaso",FieldDef.FLOAT,6,0);
            m308mliqpvent = new FieldDef("m308mliqpvent",FieldDef.FLOAT,6,0);
            m308mliqtip2 = new FieldDef("m308mliqtip2",FieldDef.FLOAT,6,0);
            m308mliqmaxde = new FieldDef("m308mliqmaxde",FieldDef.FLOAT,6,0);
            m308mliqivade = new FieldDef("m308mliqivade",FieldDef.FLOAT,6,0);
            m308rliqbase1 = new FieldDef("m308rliqbase1",FieldDef.FLOAT,6,0);
            m308rliqtipo1 = new FieldDef("m308rliqtipo1",FieldDef.FLOAT,6,0);
            m308rliqcuot1 = new FieldDef("m308rliqcuot1",FieldDef.FLOAT,6,0);
            m308rliqbase2 = new FieldDef("m308rliqbase2",FieldDef.FLOAT,6,0);
            m308rliqtipo2 = new FieldDef("m308rliqtipo2",FieldDef.FLOAT,6,0);
            m308rliqcuot2 = new FieldDef("m308rliqcuot2",FieldDef.FLOAT,6,0);
            m308rliqbase3 = new FieldDef("m308rliqbase3",FieldDef.FLOAT,6,0);
            m308rliqtipo3 = new FieldDef("m308rliqtipo3",FieldDef.FLOAT,6,0);
            m308rliqcuot3 = new FieldDef("m308rliqcuot3",FieldDef.FLOAT,6,0);
            m308rliqivadint = new FieldDef("m308rliqivadint",FieldDef.FLOAT,6,0);
            m308mliqivadtra = new FieldDef("m308mliqivadtra",FieldDef.FLOAT,6,0);
            m308entingreso = new FieldDef("m308entingreso",FieldDef.CHAR,4);
            m308ofiingreso = new FieldDef("m308ofiingreso",FieldDef.CHAR,4);
            m308digiingreso = new FieldDef("m308digiingreso",FieldDef.CHAR,2);
            m308ctaingreso = new FieldDef("m308ctaingreso",FieldDef.CHAR,10);
            m308impingreso = new FieldDef("m308impingreso",FieldDef.FLOAT,6,0);
            m308perscont = new FieldDef("m308perscont",FieldDef.CHAR,100);
            m308telefono = new FieldDef("m308telefono",FieldDef.CHAR,20);
            m308observa = new FieldDef("m308observa",FieldDef.CHAR,250);
            m308munifirma = new FieldDef("m308munifirma",FieldDef.CHAR,30);
            m308fecha = new FieldDef("m308fecha",FieldDef.DATE);
            mod308ivasopa21 = new FieldDef("mod308ivasopa21",FieldDef.FLOAT,6,0);
            mod308ivadeva21 = new FieldDef("mod308ivadeva21",FieldDef.FLOAT,6,0);
            m308ivasopa21 = new FieldDef("m308ivasopa21",FieldDef.FLOAT,6,0);
            m308ivadeva21 = new FieldDef("m308ivadeva21",FieldDef.FLOAT,6,0);
            m308paisiban = new FieldDef("m308paisiban",FieldDef.CHAR,2);
            m308dciban = new FieldDef("m308dciban",FieldDef.CHAR,2);
            m308nombre = new FieldDef("m308nombre",FieldDef.CHAR,20);
            m308adqnombre = new FieldDef("m308adqnombre",FieldDef.CHAR,20);
            m308tipotrib = new FieldDef("m308tipotrib",FieldDef.INTEGER,0);
            m308swift = new FieldDef("m308swift",FieldDef.CHAR,11);
            FieldDef array[] = {
                m308dominio,
                m308nif,
                m308ejercicio,
                m308periodo,
                m308perpresen,
                m308razon,
                m308primerape,
                m308tipodec,
                m308adqnif,
                m308adqpais,
                m308adqrazon,
                m308vehmarca,
                m308vehtipo,
                m308vehmodelo,
                m308vehident,
                m308vehclasif,
                m308embfabric,
                m308embtipo,
                m308embident,
                m308embeslora,
                m308aerfabric,
                m308aermarca,
                m308aerserie,
                m308aeranyof,
                m308aerpeso,
                m308mliqpadq,
                m308mliqtip1,
                m308mliqivaso,
                m308mliqpvent,
                m308mliqtip2,
                m308mliqmaxde,
                m308mliqivade,
                m308rliqbase1,
                m308rliqtipo1,
                m308rliqcuot1,
                m308rliqbase2,
                m308rliqtipo2,
                m308rliqcuot2,
                m308rliqbase3,
                m308rliqtipo3,
                m308rliqcuot3,
                m308rliqivadint,
                m308mliqivadtra,
                m308entingreso,
                m308ofiingreso,
                m308digiingreso,
                m308ctaingreso,
                m308impingreso,
                m308perscont,
                m308telefono,
                m308observa,
                m308munifirma,
                m308fecha,
                mod308ivasopa21,
                mod308ivadeva21,
                m308ivasopa21,
                m308ivadeva21,
                m308paisiban,
                m308dciban,
                m308nombre,
                m308adqnombre,
                m308tipotrib,
                m308swift                
                };
            setColumns(array);
            FieldDef arrayf[] = {m308dominio,m308nif,m308ejercicio,m308periodo };
            setPrimaryKeys(arrayf);
            mod308ivasopa21.setDescription("Sin uso");
            mod308ivadeva21.setDescription("Sin uso");
            }
        }
        
    public class TabMod309 extends TableDef
        {
        // campos
        public FieldDef m309dominio;
        public FieldDef m309nif;
        public FieldDef m309ejercicio;
        public FieldDef m309periodo;
        public FieldDef m309apellidos;
        public FieldDef m309nombre;
        public FieldDef m309tipodec;
        public FieldDef m309letras;
        public FieldDef m309perreal;
        public FieldDef m309trnif;
        public FieldDef m309trrazon;
        public FieldDef m309trpais;
        public FieldDef m309sitagric;
        public FieldDef m309sitreeq;
        public FieldDef m309sitsded;
        public FieldDef m309sitpj;
        public FieldDef m309sitpf;
        public FieldDef m309sitotras;
        public FieldDef m309himpint;
        public FieldDef m309himpintn;
        public FieldDef m309himpsujp;
        public FieldDef m309himpentb;
        public FieldDef m309himpentj;
        public FieldDef m309himpotros;
        public FieldDef m309vmarca;
        public FieldDef m309vtipo;
        public FieldDef m309vmodelo;
        public FieldDef m309vident;
        public FieldDef m309vclasif;
        public FieldDef m309efabric;
        public FieldDef m309etipomod;
        public FieldDef m309eident;
        public FieldDef m309eeslora;
        public FieldDef m309afabric;
        public FieldDef m309atipomod;
        public FieldDef m309aident;
        public FieldDef m309aanofab;
        public FieldDef m309apeso;
        public FieldDef m309rgbase1;
        public FieldDef m309rgpor1;
        public FieldDef m309rgcuota1;
        public FieldDef m309rgbase2;
        public FieldDef m309rgpor2;
        public FieldDef m309rgcuota2;
        public FieldDef m309rgbase3;
        public FieldDef m309rgpor3;
        public FieldDef m309rgcuota3;
        public FieldDef m309eqbase1;
        public FieldDef m309eqpor1;
        public FieldDef m309eqcuota1;
        public FieldDef m309eqbase2;
        public FieldDef m309eqpor2;
        public FieldDef m309eqcuota2;
        public FieldDef m309eqbase3;
        public FieldDef m309eqpor3;
        public FieldDef m309eqcuota3;
        public FieldDef m309eqbase4;
        public FieldDef m309eqpor4;
        public FieldDef m309eqcuota4;
        public FieldDef m309tcuota;
        public FieldDef m309adeducir;
        public FieldDef m309resliq;
        public FieldDef m309numjustif;
        public FieldDef m309cruzcomp;
        public FieldDef m309perscont;
        public FieldDef m309telefono;
        public FieldDef m309entingreso;
        public FieldDef m309ofiingreso;
        public FieldDef m309digiingreso;
        public FieldDef m309ctaingreso;
        public FieldDef m309impingreso;
        public FieldDef m309formapago;
        public FieldDef m309observa;
        public FieldDef m309munifirma;
        public FieldDef m309dia;
        public FieldDef m309mes;
        public FieldDef m309anyo;
        public FieldDef m309fecha;
        public FieldDef m309paisiban;
        public FieldDef m309dciban;
        public FieldDef m309sittrib;
        public FieldDef m309hechoimp;
        public FieldDef m309trnombre;
        public FieldDef m309adjnif;
        public FieldDef m309adjape;
        public FieldDef m309adjnom;
        public TabMod309(String name)
            {
            super(name);
            m309dominio = new FieldDef("m309dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m309nif = new FieldDef("m309nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m309ejercicio = new FieldDef("m309ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m309periodo = new FieldDef("m309periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m309apellidos = new FieldDef("m309apellidos",FieldDef.CHAR,30);
            m309nombre = new FieldDef("m309nombre",FieldDef.CHAR,15);
            m309tipodec = new FieldDef("m309tipodec",FieldDef.CHAR,1);
            m309letras = new FieldDef("m309letras",FieldDef.CHAR,4);
            m309perreal = new FieldDef("m309perreal",FieldDef.CHAR,2);
            m309trnif = new FieldDef("m309trnif",FieldDef.CHAR,9);
            m309trrazon = new FieldDef("m309trrazon",FieldDef.CHAR,40);
            m309trpais = new FieldDef("m309trpais",FieldDef.CHAR,14);
            m309sitagric = new FieldDef("m309sitagric",FieldDef.CHAR,1);
            m309sitreeq = new FieldDef("m309sitreeq",FieldDef.CHAR,1);
            m309sitsded = new FieldDef("m309sitsded",FieldDef.CHAR,1);
            m309sitpj = new FieldDef("m309sitpj",FieldDef.CHAR,1);
            m309sitpf = new FieldDef("m309sitpf",FieldDef.CHAR,1);
            m309sitotras = new FieldDef("m309sitotras",FieldDef.CHAR,1);
            m309himpint = new FieldDef("m309himpint",FieldDef.CHAR,1);
            m309himpintn = new FieldDef("m309himpintn",FieldDef.CHAR,1);
            m309himpsujp = new FieldDef("m309himpsujp",FieldDef.CHAR,1);
            m309himpentb = new FieldDef("m309himpentb",FieldDef.CHAR,1);
            m309himpentj = new FieldDef("m309himpentj",FieldDef.CHAR,1);
            m309himpotros = new FieldDef("m309himpotros",FieldDef.CHAR,1);
            m309vmarca = new FieldDef("m309vmarca",FieldDef.CHAR,40);
            m309vtipo = new FieldDef("m309vtipo",FieldDef.CHAR,40);
            m309vmodelo = new FieldDef("m309vmodelo",FieldDef.CHAR,40);
            m309vident = new FieldDef("m309vident",FieldDef.CHAR,40);
            m309vclasif = new FieldDef("m309vclasif",FieldDef.CHAR,40);
            m309efabric = new FieldDef("m309efabric",FieldDef.CHAR,40);
            m309etipomod = new FieldDef("m309etipomod",FieldDef.CHAR,40);
            m309eident = new FieldDef("m309eident",FieldDef.CHAR,40);
            m309eeslora = new FieldDef("m309eeslora",FieldDef.INTEGER,0);
            m309afabric = new FieldDef("m309afabric",FieldDef.CHAR,40);
            m309atipomod = new FieldDef("m309atipomod",FieldDef.CHAR,40);
            m309aident = new FieldDef("m309aident",FieldDef.CHAR,40);
            m309aanofab = new FieldDef("m309aanofab",FieldDef.INTEGER,0);
            m309apeso = new FieldDef("m309apeso",FieldDef.INTEGER,0);
            m309rgbase1 = new FieldDef("m309rgbase1",FieldDef.FLOAT,6,0);
            m309rgpor1 = new FieldDef("m309rgpor1",FieldDef.FLOAT,6,0);
            m309rgcuota1 = new FieldDef("m309rgcuota1",FieldDef.FLOAT,6,0);
            m309rgbase2 = new FieldDef("m309rgbase2",FieldDef.FLOAT,6,0);
            m309rgpor2 = new FieldDef("m309rgpor2",FieldDef.FLOAT,6,0);
            m309rgcuota2 = new FieldDef("m309rgcuota2",FieldDef.FLOAT,6,0);
            m309rgbase3 = new FieldDef("m309rgbase3",FieldDef.FLOAT,6,0);
            m309rgpor3 = new FieldDef("m309rgpor3",FieldDef.FLOAT,6,0);
            m309rgcuota3 = new FieldDef("m309rgcuota3",FieldDef.FLOAT,6,0);
            m309eqbase1 = new FieldDef("m309eqbase1",FieldDef.FLOAT,6,0);
            m309eqpor1 = new FieldDef("m309eqpor1",FieldDef.FLOAT,6,0);
            m309eqcuota1 = new FieldDef("m309eqcuota1",FieldDef.FLOAT,6,0);
            m309eqbase2 = new FieldDef("m309eqbase2",FieldDef.FLOAT,6,0);
            m309eqpor2 = new FieldDef("m309eqpor2",FieldDef.FLOAT,6,0);
            m309eqcuota2 = new FieldDef("m309eqcuota2",FieldDef.FLOAT,6,0);
            m309eqbase3 = new FieldDef("m309eqbase3",FieldDef.FLOAT,6,0);
            m309eqpor3 = new FieldDef("m309eqpor3",FieldDef.FLOAT,6,0);
            m309eqcuota3 = new FieldDef("m309eqcuota3",FieldDef.FLOAT,6,0);
            m309eqbase4 = new FieldDef("m309eqbase4",FieldDef.FLOAT,6,0);
            m309eqpor4 = new FieldDef("m309eqpor4",FieldDef.FLOAT,6,0);
            m309eqcuota4 = new FieldDef("m309eqcuota4",FieldDef.FLOAT,6,0);
            m309tcuota = new FieldDef("m309tcuota",FieldDef.FLOAT,6,0);
            m309adeducir = new FieldDef("m309adeducir",FieldDef.FLOAT,6,0);
            m309resliq = new FieldDef("m309resliq",FieldDef.FLOAT,6,0);
            m309numjustif = new FieldDef("m309numjustif",FieldDef.CHAR,13);
            m309cruzcomp = new FieldDef("m309cruzcomp",FieldDef.CHAR,1);
            m309perscont = new FieldDef("m309perscont",FieldDef.CHAR,100);
            m309telefono = new FieldDef("m309telefono",FieldDef.CHAR,20);
            m309entingreso = new FieldDef("m309entingreso",FieldDef.CHAR,4);
            m309ofiingreso = new FieldDef("m309ofiingreso",FieldDef.CHAR,4);
            m309digiingreso = new FieldDef("m309digiingreso",FieldDef.CHAR,2);
            m309ctaingreso = new FieldDef("m309ctaingreso",FieldDef.CHAR,10);
            m309impingreso = new FieldDef("m309impingreso",FieldDef.FLOAT,6,0);
            m309formapago = new FieldDef("m309formapago",FieldDef.INTEGER,0);
            m309observa = new FieldDef("m309observa",FieldDef.CHAR,250);
            m309munifirma = new FieldDef("m309munifirma",FieldDef.CHAR,30);
            m309dia = new FieldDef("m309dia",FieldDef.CHAR,2);
            m309mes = new FieldDef("m309mes",FieldDef.CHAR,10);
            m309anyo = new FieldDef("m309anyo",FieldDef.CHAR,4);
            m309fecha = new FieldDef("m309fecha",FieldDef.DATE);
            m309paisiban = new FieldDef("m309paisiban",FieldDef.CHAR,2);
            m309dciban = new FieldDef("m309dciban",FieldDef.CHAR,2);
            m309sittrib = new FieldDef("m309sittrib",FieldDef.INTEGER,0);
            m309hechoimp = new FieldDef("m309hechoimp",FieldDef.INTEGER,0);
            m309trnombre = new FieldDef("m309trnombre",FieldDef.CHAR,20);
            m309adjnif = new FieldDef("m309adjnif",FieldDef.CHAR,9);
            m309adjape = new FieldDef("m309adjape",FieldDef.CHAR,60);
            m309adjnom = new FieldDef("m309adjnom",FieldDef.CHAR,20);
            FieldDef array[] = {
                m309dominio,
                m309nif,
                m309ejercicio,
                m309periodo,
                m309apellidos,
                m309nombre,
                m309tipodec,
                m309letras,
                m309perreal,
                m309trnif,
                m309trrazon,
                m309trpais,
                m309sitagric,
                m309sitreeq,
                m309sitsded,
                m309sitpj,
                m309sitpf,
                m309sitotras,
                m309himpint,
                m309himpintn,
                m309himpsujp,
                m309himpentb,
                m309himpentj,
                m309himpotros,
                m309vmarca,
                m309vtipo,
                m309vmodelo,
                m309vident,
                m309vclasif,
                m309efabric,
                m309etipomod,
                m309eident,
                m309eeslora,
                m309afabric,
                m309atipomod,
                m309aident,
                m309aanofab,
                m309apeso,
                m309rgbase1,
                m309rgpor1,
                m309rgcuota1,
                m309rgbase2,
                m309rgpor2,
                m309rgcuota2,
                m309rgbase3,
                m309rgpor3,
                m309rgcuota3,
                m309eqbase1,
                m309eqpor1,
                m309eqcuota1,
                m309eqbase2,
                m309eqpor2,
                m309eqcuota2,
                m309eqbase3,
                m309eqpor3,
                m309eqcuota3,
                m309eqbase4,
                m309eqpor4,
                m309eqcuota4,
                m309tcuota,
                m309adeducir,
                m309resliq,
                m309numjustif,
                m309cruzcomp,
                m309perscont,
                m309telefono,
                m309entingreso,
                m309ofiingreso,
                m309digiingreso,
                m309ctaingreso,
                m309impingreso,
                m309formapago,
                m309observa,
                m309munifirma,
                m309dia,
                m309mes,
                m309anyo,
                m309fecha,
                m309paisiban,
                m309dciban,
                m309sittrib,
                m309hechoimp,
                m309trnombre,
                m309adjnif,
                m309adjape,
                m309adjnom                
                };
            setColumns(array);
            FieldDef arrayf[] = {m309dominio,m309nif,m309ejercicio,m309periodo };
            setPrimaryKeys(arrayf);
            m309adjnif.setDescription("Adjudicatario (4) - NIF");
            m309adjape.setDescription("Adjudicatario (4) - Apellidos o Denominación Social");
            m309adjnom.setDescription("Adjudicatario (4) - Nombre");
            }
        }
        
    public class TabMod210 extends TableDef
        {
        // campos
        public FieldDef m210dominio;
        public FieldDef m210nif;
        public FieldDef m210ejercicio;
        public FieldDef m210periodo;
        public FieldDef m210perpresen;
        public FieldDef m210tipodec;
        public FieldDef m210nombre;
        public FieldDef m210condis;
        public FieldDef m210condir;
        public FieldDef m210condip;
        public FieldDef m210condid;
        public FieldDef m210condig;
        public FieldDef m210condit;
        public FieldDef m210agrupa;
        public FieldDef m210fechadev;
        public FieldDef m210tiporen;
        public FieldDef m210divisa;
        public FieldDef m210nifc;
        public FieldDef m210fisjurc;
        public FieldDef m210nombrec;
        public FieldDef m210nifresc;
        public FieldDef m210fechac;
        public FieldDef m210ciudadc;
        public FieldDef m210paisc;
        public FieldDef m210paisfisc;
        public FieldDef m210domic;
        public FieldDef m210dcomplec;
        public FieldDef m210poblacioc;
        public FieldDef m210emailc;
        public FieldDef m210postalc;
        public FieldDef m210regionc;
        public FieldDef m210paisdomic;
        public FieldDef m210telfc;
        public FieldDef m210movilc;
        public FieldDef m210faxc;
        public FieldDef m210nifr;
        public FieldDef m210fisjurr;
        public FieldDef m210nombrer;
        public FieldDef m210tiporepr;
        public FieldDef m210tipoviar;
        public FieldDef m210viar;
        public FieldDef m210tiponumr;
        public FieldDef m210numcasar;
        public FieldDef m210califr;
        public FieldDef m210bloquer;
        public FieldDef m210portalr;
        public FieldDef m210escalr;
        public FieldDef m210plantar;
        public FieldDef m210puertar;
        public FieldDef m210dcompler;
        public FieldDef m210poblacior;
        public FieldDef m210postalr;
        public FieldDef m210nommunir;
        public FieldDef m210codmunir;
        public FieldDef m210codprovr;
        public FieldDef m210telfr;
        public FieldDef m210movilr;
        public FieldDef m210faxr;
        public FieldDef m210nifp;
        public FieldDef m210fisjurp;
        public FieldDef m210nombrep;
        public FieldDef m210tipoviainm;
        public FieldDef m210viainm;
        public FieldDef m210tiponuminm;
        public FieldDef m210numcasainm;
        public FieldDef m210califinm;
        public FieldDef m210bloqueinm;
        public FieldDef m210portalinm;
        public FieldDef m210escalinm;
        public FieldDef m210plantainm;
        public FieldDef m210puertainm;
        public FieldDef m210dcompleinm;
        public FieldDef m210lpoblacioin;
        public FieldDef m210postalinm;
        public FieldDef m210nommuniinm;
        public FieldDef m210codmuniinm;
        public FieldDef m210provinm;
        public FieldDef m210referinm;
        public FieldDef m210basei;
        public FieldDef m210rdtor;
        public FieldDef m210exenr;
        public FieldDef m210gastor;
        public FieldDef m210baser;
        public FieldDef m210ambosh;
        public FieldDef m210porcendech;
        public FieldDef m210porcenconh;
        public FieldDef m210nifconh;
        public FieldDef m210nomconh;
        public FieldDef m210vventah;
        public FieldDef m210vcomprah;
        public FieldDef m210diferh;
        public FieldDef m210guanyh;
        public FieldDef m210vventa2h;
        public FieldDef m210vcompra2h;
        public FieldDef m210difer2h;
        public FieldDef m210guany2h;
        public FieldDef m210baseh;
        public FieldDef m210fecadqh;
        public FieldDef m210fecadq2h;
        public FieldDef m210nro211h;
        public FieldDef m210baseg;
        public FieldDef m210exencion;
        public FieldDef m210convenio;
        public FieldDef m210tipoimpos;
        public FieldDef m210cuotaint;
        public FieldDef m210deddonac;
        public FieldDef m210cuotaley;
        public FieldDef m210pornconveni;
        public FieldDef m210lteconveni;
        public FieldDef m210redcconveni;
        public FieldDef m210cuotaintred;
        public FieldDef m210reten;
        public FieldDef m210resultant;
        public FieldDef m210resultado;
        public FieldDef m210complem;
        public FieldDef m210nrocompant;
        public FieldDef m210contacto;
        public FieldDef m210telf1firma;
        public FieldDef m210telf2firma;
        public FieldDef m210emailfirma;
        public FieldDef m210fechacrea;
        public FieldDef m210nifperauto;
        public TabMod210(String name)
            {
            super(name);
            m210dominio = new FieldDef("m210dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m210nif = new FieldDef("m210nif",FieldDef.CHAR,9,FieldDef.NOTNULL);
            m210ejercicio = new FieldDef("m210ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m210periodo = new FieldDef("m210periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m210perpresen = new FieldDef("m210perpresen",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m210tipodec = new FieldDef("m210tipodec",FieldDef.CHAR,1);
            m210nombre = new FieldDef("m210nombre",FieldDef.CHAR,125);
            m210condis = new FieldDef("m210condis",FieldDef.CHAR,1);
            m210condir = new FieldDef("m210condir",FieldDef.CHAR,1);
            m210condip = new FieldDef("m210condip",FieldDef.CHAR,1);
            m210condid = new FieldDef("m210condid",FieldDef.CHAR,1);
            m210condig = new FieldDef("m210condig",FieldDef.CHAR,1);
            m210condit = new FieldDef("m210condit",FieldDef.CHAR,1);
            m210agrupa = new FieldDef("m210agrupa",FieldDef.CHAR,1);
            m210fechadev = new FieldDef("m210fechadev",FieldDef.DATE);
            m210tiporen = new FieldDef("m210tiporen",FieldDef.CHAR,2);
            m210divisa = new FieldDef("m210divisa",FieldDef.CHAR,3);
            m210nifc = new FieldDef("m210nifc",FieldDef.CHAR,9);
            m210fisjurc = new FieldDef("m210fisjurc",FieldDef.CHAR,1);
            m210nombrec = new FieldDef("m210nombrec",FieldDef.CHAR,125);
            m210nifresc = new FieldDef("m210nifresc",FieldDef.CHAR,15);
            m210fechac = new FieldDef("m210fechac",FieldDef.DATE);
            m210ciudadc = new FieldDef("m210ciudadc",FieldDef.CHAR,30);
            m210paisc = new FieldDef("m210paisc",FieldDef.CHAR,2);
            m210paisfisc = new FieldDef("m210paisfisc",FieldDef.CHAR,2);
            m210domic = new FieldDef("m210domic",FieldDef.CHAR,50);
            m210dcomplec = new FieldDef("m210dcomplec",FieldDef.CHAR,40);
            m210poblacioc = new FieldDef("m210poblacioc",FieldDef.CHAR,30);
            m210emailc = new FieldDef("m210emailc",FieldDef.CHAR,100);
            m210postalc = new FieldDef("m210postalc",FieldDef.CHAR,10);
            m210regionc = new FieldDef("m210regionc",FieldDef.CHAR,30);
            m210paisdomic = new FieldDef("m210paisdomic",FieldDef.CHAR,2);
            m210telfc = new FieldDef("m210telfc",FieldDef.CHAR,15);
            m210movilc = new FieldDef("m210movilc",FieldDef.CHAR,15);
            m210faxc = new FieldDef("m210faxc",FieldDef.CHAR,15);
            m210nifr = new FieldDef("m210nifr",FieldDef.CHAR,9);
            m210fisjurr = new FieldDef("m210fisjurr",FieldDef.CHAR,1);
            m210nombrer = new FieldDef("m210nombrer",FieldDef.CHAR,125);
            m210tiporepr = new FieldDef("m210tiporepr",FieldDef.CHAR,1);
            m210tipoviar = new FieldDef("m210tipoviar",FieldDef.CHAR,5);
            m210viar = new FieldDef("m210viar",FieldDef.CHAR,50);
            m210tiponumr = new FieldDef("m210tiponumr",FieldDef.CHAR,3);
            m210numcasar = new FieldDef("m210numcasar",FieldDef.INTEGER,0);
            m210califr = new FieldDef("m210califr",FieldDef.CHAR,3);
            m210bloquer = new FieldDef("m210bloquer",FieldDef.CHAR,3);
            m210portalr = new FieldDef("m210portalr",FieldDef.CHAR,3);
            m210escalr = new FieldDef("m210escalr",FieldDef.CHAR,3);
            m210plantar = new FieldDef("m210plantar",FieldDef.CHAR,3);
            m210puertar = new FieldDef("m210puertar",FieldDef.CHAR,3);
            m210dcompler = new FieldDef("m210dcompler",FieldDef.CHAR,40);
            m210poblacior = new FieldDef("m210poblacior",FieldDef.CHAR,30);
            m210postalr = new FieldDef("m210postalr",FieldDef.CHAR,5);
            m210nommunir = new FieldDef("m210nommunir",FieldDef.CHAR,30);
            m210codmunir = new FieldDef("m210codmunir",FieldDef.CHAR,5);
            m210codprovr = new FieldDef("m210codprovr",FieldDef.INTEGER,0);
            m210telfr = new FieldDef("m210telfr",FieldDef.CHAR,9);
            m210movilr = new FieldDef("m210movilr",FieldDef.CHAR,9);
            m210faxr = new FieldDef("m210faxr",FieldDef.CHAR,9);
            m210nifp = new FieldDef("m210nifp",FieldDef.CHAR,9);
            m210fisjurp = new FieldDef("m210fisjurp",FieldDef.CHAR,1);
            m210nombrep = new FieldDef("m210nombrep",FieldDef.CHAR,125);
            m210tipoviainm = new FieldDef("m210tipoviainm",FieldDef.CHAR,5);
            m210viainm = new FieldDef("m210viainm",FieldDef.CHAR,50);
            m210tiponuminm = new FieldDef("m210tiponuminm",FieldDef.CHAR,3);
            m210numcasainm = new FieldDef("m210numcasainm",FieldDef.INTEGER,0);
            m210califinm = new FieldDef("m210califinm",FieldDef.CHAR,3);
            m210bloqueinm = new FieldDef("m210bloqueinm",FieldDef.CHAR,3);
            m210portalinm = new FieldDef("m210portalinm",FieldDef.CHAR,3);
            m210escalinm = new FieldDef("m210escalinm",FieldDef.CHAR,3);
            m210plantainm = new FieldDef("m210plantainm",FieldDef.CHAR,3);
            m210puertainm = new FieldDef("m210puertainm",FieldDef.CHAR,3);
            m210dcompleinm = new FieldDef("m210dcompleinm",FieldDef.CHAR,40);
            m210lpoblacioin = new FieldDef("m210lpoblacioin",FieldDef.CHAR,30);
            m210postalinm = new FieldDef("m210postalinm",FieldDef.CHAR,5);
            m210nommuniinm = new FieldDef("m210nommuniinm",FieldDef.CHAR,30);
            m210codmuniinm = new FieldDef("m210codmuniinm",FieldDef.CHAR,5);
            m210provinm = new FieldDef("m210provinm",FieldDef.INTEGER,0);
            m210referinm = new FieldDef("m210referinm",FieldDef.CHAR,20);
            m210basei = new FieldDef("m210basei",FieldDef.FLOAT,6,0);
            m210rdtor = new FieldDef("m210rdtor",FieldDef.FLOAT,6,0);
            m210exenr = new FieldDef("m210exenr",FieldDef.FLOAT,6,0);
            m210gastor = new FieldDef("m210gastor",FieldDef.FLOAT,6,0);
            m210baser = new FieldDef("m210baser",FieldDef.FLOAT,6,0);
            m210ambosh = new FieldDef("m210ambosh",FieldDef.CHAR,1);
            m210porcendech = new FieldDef("m210porcendech",FieldDef.FLOAT,6,0);
            m210porcenconh = new FieldDef("m210porcenconh",FieldDef.FLOAT,6,0);
            m210nifconh = new FieldDef("m210nifconh",FieldDef.CHAR,9);
            m210nomconh = new FieldDef("m210nomconh",FieldDef.CHAR,40);
            m210vventah = new FieldDef("m210vventah",FieldDef.FLOAT,6,0);
            m210vcomprah = new FieldDef("m210vcomprah",FieldDef.FLOAT,6,0);
            m210diferh = new FieldDef("m210diferh",FieldDef.FLOAT,6,0);
            m210guanyh = new FieldDef("m210guanyh",FieldDef.FLOAT,6,0);
            m210vventa2h = new FieldDef("m210vventa2h",FieldDef.FLOAT,6,0);
            m210vcompra2h = new FieldDef("m210vcompra2h",FieldDef.FLOAT,6,0);
            m210difer2h = new FieldDef("m210difer2h",FieldDef.FLOAT,6,0);
            m210guany2h = new FieldDef("m210guany2h",FieldDef.FLOAT,6,0);
            m210baseh = new FieldDef("m210baseh",FieldDef.FLOAT,6,0);
            m210fecadqh = new FieldDef("m210fecadqh",FieldDef.DATE);
            m210fecadq2h = new FieldDef("m210fecadq2h",FieldDef.DATE);
            m210nro211h = new FieldDef("m210nro211h",FieldDef.CHAR,13);
            m210baseg = new FieldDef("m210baseg",FieldDef.FLOAT,6,0);
            m210exencion = new FieldDef("m210exencion",FieldDef.CHAR,1);
            m210convenio = new FieldDef("m210convenio",FieldDef.CHAR,1);
            m210tipoimpos = new FieldDef("m210tipoimpos",FieldDef.FLOAT,6,0);
            m210cuotaint = new FieldDef("m210cuotaint",FieldDef.FLOAT,6,0);
            m210deddonac = new FieldDef("m210deddonac",FieldDef.FLOAT,6,0);
            m210cuotaley = new FieldDef("m210cuotaley",FieldDef.FLOAT,6,0);
            m210pornconveni = new FieldDef("m210pornconveni",FieldDef.FLOAT,6,0);
            m210lteconveni = new FieldDef("m210lteconveni",FieldDef.FLOAT,6,0);
            m210redcconveni = new FieldDef("m210redcconveni",FieldDef.FLOAT,6,0);
            m210cuotaintred = new FieldDef("m210cuotaintred",FieldDef.FLOAT,6,0);
            m210reten = new FieldDef("m210reten",FieldDef.FLOAT,6,0);
            m210resultant = new FieldDef("m210resultant",FieldDef.FLOAT,6,0);
            m210resultado = new FieldDef("m210resultado",FieldDef.FLOAT,6,0);
            m210complem = new FieldDef("m210complem",FieldDef.CHAR,1);
            m210nrocompant = new FieldDef("m210nrocompant",FieldDef.CHAR,13);
            m210contacto = new FieldDef("m210contacto",FieldDef.CHAR,100);
            m210telf1firma = new FieldDef("m210telf1firma",FieldDef.CHAR,15);
            m210telf2firma = new FieldDef("m210telf2firma",FieldDef.CHAR,15);
            m210emailfirma = new FieldDef("m210emailfirma",FieldDef.CHAR,100);
            m210fechacrea = new FieldDef("m210fechacrea",FieldDef.DATE);
            m210nifperauto = new FieldDef("m210nifperauto",FieldDef.CHAR,9);
            FieldDef array[] = {
                m210dominio,
                m210nif,
                m210ejercicio,
                m210periodo,
                m210perpresen,
                m210tipodec,
                m210nombre,
                m210condis,
                m210condir,
                m210condip,
                m210condid,
                m210condig,
                m210condit,
                m210agrupa,
                m210fechadev,
                m210tiporen,
                m210divisa,
                m210nifc,
                m210fisjurc,
                m210nombrec,
                m210nifresc,
                m210fechac,
                m210ciudadc,
                m210paisc,
                m210paisfisc,
                m210domic,
                m210dcomplec,
                m210poblacioc,
                m210emailc,
                m210postalc,
                m210regionc,
                m210paisdomic,
                m210telfc,
                m210movilc,
                m210faxc,
                m210nifr,
                m210fisjurr,
                m210nombrer,
                m210tiporepr,
                m210tipoviar,
                m210viar,
                m210tiponumr,
                m210numcasar,
                m210califr,
                m210bloquer,
                m210portalr,
                m210escalr,
                m210plantar,
                m210puertar,
                m210dcompler,
                m210poblacior,
                m210postalr,
                m210nommunir,
                m210codmunir,
                m210codprovr,
                m210telfr,
                m210movilr,
                m210faxr,
                m210nifp,
                m210fisjurp,
                m210nombrep,
                m210tipoviainm,
                m210viainm,
                m210tiponuminm,
                m210numcasainm,
                m210califinm,
                m210bloqueinm,
                m210portalinm,
                m210escalinm,
                m210plantainm,
                m210puertainm,
                m210dcompleinm,
                m210lpoblacioin,
                m210postalinm,
                m210nommuniinm,
                m210codmuniinm,
                m210provinm,
                m210referinm,
                m210basei,
                m210rdtor,
                m210exenr,
                m210gastor,
                m210baser,
                m210ambosh,
                m210porcendech,
                m210porcenconh,
                m210nifconh,
                m210nomconh,
                m210vventah,
                m210vcomprah,
                m210diferh,
                m210guanyh,
                m210vventa2h,
                m210vcompra2h,
                m210difer2h,
                m210guany2h,
                m210baseh,
                m210fecadqh,
                m210fecadq2h,
                m210nro211h,
                m210baseg,
                m210exencion,
                m210convenio,
                m210tipoimpos,
                m210cuotaint,
                m210deddonac,
                m210cuotaley,
                m210pornconveni,
                m210lteconveni,
                m210redcconveni,
                m210cuotaintred,
                m210reten,
                m210resultant,
                m210resultado,
                m210complem,
                m210nrocompant,
                m210contacto,
                m210telf1firma,
                m210telf2firma,
                m210emailfirma,
                m210fechacrea,
                m210nifperauto                
                };
            setColumns(array);
            FieldDef arrayf[] = {m210dominio,m210nif,m210ejercicio,m210periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod210cp extends TableDef
        {
        // campos
        public FieldDef m210cpdominio;
        public FieldDef m210cpnif;
        public FieldDef m210cpejercicio;
        public FieldDef m210cpperiodo;
        public FieldDef m210cpformapago;
        public FieldDef m210cpingpref;
        public FieldDef m210cpingiban;
        public FieldDef m210cpingbanc;
        public FieldDef m210cpingofic;
        public FieldDef m210cpingdc;
        public FieldDef m210cpingcta;
        public FieldDef m210cpiextnifue;
        public FieldDef m210cpiextnomue;
        public FieldDef m210cpiextctaue;
        public FieldDef m210cpiextcodiu;
        public FieldDef m210cpiextcodir;
        public FieldDef m210cpiextctare;
        public FieldDef m210cpiextnomre;
        public FieldDef m210cpiextdirre;
        public FieldDef m210cpiextpobre;
        public FieldDef m210cpiextpaisr;
        public FieldDef m210cpiextnpare;
        public FieldDef m210cprenuncia;
        public FieldDef m210cptransfnif;
        public FieldDef m210cptransfnom;
        public FieldDef m210cpdevpref;
        public FieldDef m210cpdeviban;
        public FieldDef m210cpdevbanc;
        public FieldDef m210cpdevofic;
        public FieldDef m210cpdevdc;
        public FieldDef m210cpdevcta;
        public FieldDef m210cpdextnifue;
        public FieldDef m210cpdextnomue;
        public FieldDef m210cpdextctaue;
        public FieldDef m210cpdextcdiue;
        public FieldDef m210cpdextcdire;
        public FieldDef m210cpdextctare;
        public FieldDef m210cpdextnomre;
        public FieldDef m210cpdextdirre;
        public FieldDef m210cpdextpobre;
        public FieldDef m210cpdextpares;
        public FieldDef m210cpdextnpare;
        public FieldDef m210cpcuotacero;
        public FieldDef m210cpbaespiban;
        public FieldDef m210cpbaespbic;
        public TabMod210cp(String name)
            {
            super(name);
            m210cpdominio = new FieldDef("m210cpdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m210cpnif = new FieldDef("m210cpnif",FieldDef.CHAR,9,FieldDef.NOTNULL);
            m210cpejercicio = new FieldDef("m210cpejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m210cpperiodo = new FieldDef("m210cpperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m210cpformapago = new FieldDef("m210cpformapago",FieldDef.CHAR,1);
            m210cpingpref = new FieldDef("m210cpingpref",FieldDef.CHAR,2);
            m210cpingiban = new FieldDef("m210cpingiban",FieldDef.CHAR,2);
            m210cpingbanc = new FieldDef("m210cpingbanc",FieldDef.CHAR,4);
            m210cpingofic = new FieldDef("m210cpingofic",FieldDef.CHAR,4);
            m210cpingdc = new FieldDef("m210cpingdc",FieldDef.CHAR,2);
            m210cpingcta = new FieldDef("m210cpingcta",FieldDef.CHAR,10);
            m210cpiextnifue = new FieldDef("m210cpiextnifue",FieldDef.CHAR,15);
            m210cpiextnomue = new FieldDef("m210cpiextnomue",FieldDef.CHAR,125);
            m210cpiextctaue = new FieldDef("m210cpiextctaue",FieldDef.CHAR,34);
            m210cpiextcodiu = new FieldDef("m210cpiextcodiu",FieldDef.CHAR,11);
            m210cpiextcodir = new FieldDef("m210cpiextcodir",FieldDef.CHAR,11);
            m210cpiextctare = new FieldDef("m210cpiextctare",FieldDef.CHAR,50);
            m210cpiextnomre = new FieldDef("m210cpiextnomre",FieldDef.CHAR,125);
            m210cpiextdirre = new FieldDef("m210cpiextdirre",FieldDef.CHAR,100);
            m210cpiextpobre = new FieldDef("m210cpiextpobre",FieldDef.CHAR,30);
            m210cpiextpaisr = new FieldDef("m210cpiextpaisr",FieldDef.CHAR,30);
            m210cpiextnpare = new FieldDef("m210cpiextnpare",FieldDef.CHAR,2);
            m210cprenuncia = new FieldDef("m210cprenuncia",FieldDef.CHAR,1);
            m210cptransfnif = new FieldDef("m210cptransfnif",FieldDef.CHAR,9);
            m210cptransfnom = new FieldDef("m210cptransfnom",FieldDef.CHAR,125);
            m210cpdevpref = new FieldDef("m210cpdevpref",FieldDef.CHAR,2);
            m210cpdeviban = new FieldDef("m210cpdeviban",FieldDef.CHAR,2);
            m210cpdevbanc = new FieldDef("m210cpdevbanc",FieldDef.CHAR,4);
            m210cpdevofic = new FieldDef("m210cpdevofic",FieldDef.CHAR,4);
            m210cpdevdc = new FieldDef("m210cpdevdc",FieldDef.CHAR,2);
            m210cpdevcta = new FieldDef("m210cpdevcta",FieldDef.CHAR,10);
            m210cpdextnifue = new FieldDef("m210cpdextnifue",FieldDef.CHAR,15);
            m210cpdextnomue = new FieldDef("m210cpdextnomue",FieldDef.CHAR,125);
            m210cpdextctaue = new FieldDef("m210cpdextctaue",FieldDef.CHAR,34);
            m210cpdextcdiue = new FieldDef("m210cpdextcdiue",FieldDef.CHAR,11);
            m210cpdextcdire = new FieldDef("m210cpdextcdire",FieldDef.CHAR,11);
            m210cpdextctare = new FieldDef("m210cpdextctare",FieldDef.CHAR,50);
            m210cpdextnomre = new FieldDef("m210cpdextnomre",FieldDef.CHAR,125);
            m210cpdextdirre = new FieldDef("m210cpdextdirre",FieldDef.CHAR,100);
            m210cpdextpobre = new FieldDef("m210cpdextpobre",FieldDef.CHAR,30);
            m210cpdextpares = new FieldDef("m210cpdextpares",FieldDef.CHAR,30);
            m210cpdextnpare = new FieldDef("m210cpdextnpare",FieldDef.CHAR,2);
            m210cpcuotacero = new FieldDef("m210cpcuotacero",FieldDef.CHAR,1);
            m210cpbaespiban = new FieldDef("m210cpbaespiban",FieldDef.CHAR,24);
            m210cpbaespbic = new FieldDef("m210cpbaespbic",FieldDef.CHAR,11);
            FieldDef array[] = {
                m210cpdominio,
                m210cpnif,
                m210cpejercicio,
                m210cpperiodo,
                m210cpformapago,
                m210cpingpref,
                m210cpingiban,
                m210cpingbanc,
                m210cpingofic,
                m210cpingdc,
                m210cpingcta,
                m210cpiextnifue,
                m210cpiextnomue,
                m210cpiextctaue,
                m210cpiextcodiu,
                m210cpiextcodir,
                m210cpiextctare,
                m210cpiextnomre,
                m210cpiextdirre,
                m210cpiextpobre,
                m210cpiextpaisr,
                m210cpiextnpare,
                m210cprenuncia,
                m210cptransfnif,
                m210cptransfnom,
                m210cpdevpref,
                m210cpdeviban,
                m210cpdevbanc,
                m210cpdevofic,
                m210cpdevdc,
                m210cpdevcta,
                m210cpdextnifue,
                m210cpdextnomue,
                m210cpdextctaue,
                m210cpdextcdiue,
                m210cpdextcdire,
                m210cpdextctare,
                m210cpdextnomre,
                m210cpdextdirre,
                m210cpdextpobre,
                m210cpdextpares,
                m210cpdextnpare,
                m210cpcuotacero,
                m210cpbaespiban,
                m210cpbaespbic                
                };
            setColumns(array);
            FieldDef arrayf[] = {m210cpdominio,m210cpnif,m210cpejercicio,m210cpperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod720c extends TableDef
        {
        // campos
        public FieldDef m720cdominio;
        public FieldDef m720cnif;
        public FieldDef m720cejercicio;
        public FieldDef m720cperiodo;
        public FieldDef m720cnombre;
        public FieldDef m720ctiposop;
        public FieldDef m720ctelfrel;
        public FieldDef m720cnomrel;
        public FieldDef m720cnumjustif;
        public FieldDef m720ccomplem;
        public FieldDef m720csustitu;
        public FieldDef m720cnumdecant;
        public FieldDef m720ctotnumreg;
        public FieldDef m720ctotvalor1;
        public FieldDef m720ctotvalor2;
        public TabMod720c(String name)
            {
            super(name);
            m720cdominio = new FieldDef("m720cdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m720cnif = new FieldDef("m720cnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m720cejercicio = new FieldDef("m720cejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m720cperiodo = new FieldDef("m720cperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m720cnombre = new FieldDef("m720cnombre",FieldDef.CHAR,40);
            m720ctiposop = new FieldDef("m720ctiposop",FieldDef.CHAR,1);
            m720ctelfrel = new FieldDef("m720ctelfrel",FieldDef.CHAR,9);
            m720cnomrel = new FieldDef("m720cnomrel",FieldDef.CHAR,40);
            m720cnumjustif = new FieldDef("m720cnumjustif",FieldDef.CHAR,13);
            m720ccomplem = new FieldDef("m720ccomplem",FieldDef.CHAR,1);
            m720csustitu = new FieldDef("m720csustitu",FieldDef.CHAR,1);
            m720cnumdecant = new FieldDef("m720cnumdecant",FieldDef.CHAR,13);
            m720ctotnumreg = new FieldDef("m720ctotnumreg",FieldDef.INTEGER,0);
            m720ctotvalor1 = new FieldDef("m720ctotvalor1",FieldDef.FLOAT,6,0);
            m720ctotvalor2 = new FieldDef("m720ctotvalor2",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m720cdominio,
                m720cnif,
                m720cejercicio,
                m720cperiodo,
                m720cnombre,
                m720ctiposop,
                m720ctelfrel,
                m720cnomrel,
                m720cnumjustif,
                m720ccomplem,
                m720csustitu,
                m720cnumdecant,
                m720ctotnumreg,
                m720ctotvalor1,
                m720ctotvalor2                
                };
            setColumns(array);
            FieldDef arrayf[] = {m720cdominio,m720cnif,m720cejercicio,m720cperiodo };
            setDescription("720 Declarante Tipo 1");
            setPrimaryKeys(arrayf);
            m720cnif.setDescription("NIF declarante");
            m720cejercicio.setDescription("Ejercicio aplicacion");
            m720cnombre.setDescription("Declarante apellidos,razon social");
            m720ctiposop.setDescription("Tipo soporte T");
            m720ctelfrel.setDescription("Persona con quien relacionarse: Telefono");
            m720cnomrel.setDescription("Persona con quien relacionarse: Nombre");
            m720cnumjustif.setDescription("Nro declaracion 720+numero secuencial");
            m720ccomplem.setDescription("C  Declaracion complementaria");
            m720csustitu.setDescription("S  Declaracion sustitutiva");
            m720cnumdecant.setDescription("Nro identificativo de declarac anterior");
            m720ctotnumreg.setDescription("Nro total registros declarados");
            m720ctotvalor1.setDescription("Total Valoracion1");
            m720ctotvalor2.setDescription("Total Valoracion2");
            }
        }
        
    public class TabMod720d extends TableDef
        {
        // campos
        public FieldDef m720dident;
        public FieldDef m720ddominio;
        public FieldDef m720dnif;
        public FieldDef m720dejercicio;
        public FieldDef m720dperiodo;
        public FieldDef m720dempresa;
        public FieldDef m720dnifper;
        public FieldDef m720dnifrepre;
        public FieldDef m720dnombre;
        public FieldDef m720dcondicion;
        public FieldDef m720dtipotiula;
        public FieldDef m720dclave;
        public FieldDef m720dsubclave;
        public FieldDef m720dtiporeal;
        public FieldDef m720dpais;
        public FieldDef m720dclauident;
        public FieldDef m720disin;
        public FieldDef m720dclaucta;
        public FieldDef m720dbic;
        public FieldDef m720diban;
        public FieldDef m720dbanco;
        public FieldDef m720dnrorigen;
        public FieldDef m720dcalle;
        public FieldDef m720dcalle2;
        public FieldDef m720dciudad;
        public FieldDef m720dregion;
        public FieldDef m720dzipcode;
        public FieldDef m720dpaisinm;
        public FieldDef m720dfeccompra;
        public FieldDef m720dorigen;
        public FieldDef m720dfecventa;
        public FieldDef m720dvalor1;
        public FieldDef m720dvalor2;
        public FieldDef m720dclaveval;
        public FieldDef m720dtitulos;
        public FieldDef m720durbana;
        public FieldDef m720dporcen;
        public TabMod720d(String name)
            {
            super(name);
            m720dident = new FieldDef("m720dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m720ddominio = new FieldDef("m720ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m720dnif = new FieldDef("m720dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m720dejercicio = new FieldDef("m720dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m720dperiodo = new FieldDef("m720dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m720dempresa = new FieldDef("m720dempresa",FieldDef.CHAR,12);
            m720dnifper = new FieldDef("m720dnifper",FieldDef.CHAR,9);
            m720dnifrepre = new FieldDef("m720dnifrepre",FieldDef.CHAR,9);
            m720dnombre = new FieldDef("m720dnombre",FieldDef.CHAR,40);
            m720dcondicion = new FieldDef("m720dcondicion",FieldDef.INTEGER,0);
            m720dtipotiula = new FieldDef("m720dtipotiula",FieldDef.CHAR,25);
            m720dclave = new FieldDef("m720dclave",FieldDef.CHAR,1);
            m720dsubclave = new FieldDef("m720dsubclave",FieldDef.INTEGER,0);
            m720dtiporeal = new FieldDef("m720dtiporeal",FieldDef.CHAR,25);
            m720dpais = new FieldDef("m720dpais",FieldDef.CHAR,2);
            m720dclauident = new FieldDef("m720dclauident",FieldDef.INTEGER,0);
            m720disin = new FieldDef("m720disin",FieldDef.CHAR,12);
            m720dclaucta = new FieldDef("m720dclaucta",FieldDef.CHAR,1);
            m720dbic = new FieldDef("m720dbic",FieldDef.CHAR,11);
            m720diban = new FieldDef("m720diban",FieldDef.CHAR,34);
            m720dbanco = new FieldDef("m720dbanco",FieldDef.CHAR,41);
            m720dnrorigen = new FieldDef("m720dnrorigen",FieldDef.CHAR,20);
            m720dcalle = new FieldDef("m720dcalle",FieldDef.CHAR,52);
            m720dcalle2 = new FieldDef("m720dcalle2",FieldDef.CHAR,40);
            m720dciudad = new FieldDef("m720dciudad",FieldDef.CHAR,30);
            m720dregion = new FieldDef("m720dregion",FieldDef.CHAR,30);
            m720dzipcode = new FieldDef("m720dzipcode",FieldDef.CHAR,10);
            m720dpaisinm = new FieldDef("m720dpaisinm",FieldDef.CHAR,2);
            m720dfeccompra = new FieldDef("m720dfeccompra",FieldDef.DATE);
            m720dorigen = new FieldDef("m720dorigen",FieldDef.CHAR,1);
            m720dfecventa = new FieldDef("m720dfecventa",FieldDef.DATE);
            m720dvalor1 = new FieldDef("m720dvalor1",FieldDef.FLOAT,6,0);
            m720dvalor2 = new FieldDef("m720dvalor2",FieldDef.FLOAT,6,0);
            m720dclaveval = new FieldDef("m720dclaveval",FieldDef.CHAR,1);
            m720dtitulos = new FieldDef("m720dtitulos",FieldDef.FLOAT,6,0);
            m720durbana = new FieldDef("m720durbana",FieldDef.CHAR,1);
            m720dporcen = new FieldDef("m720dporcen",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m720dident,
                m720ddominio,
                m720dnif,
                m720dejercicio,
                m720dperiodo,
                m720dempresa,
                m720dnifper,
                m720dnifrepre,
                m720dnombre,
                m720dcondicion,
                m720dtipotiula,
                m720dclave,
                m720dsubclave,
                m720dtiporeal,
                m720dpais,
                m720dclauident,
                m720disin,
                m720dclaucta,
                m720dbic,
                m720diban,
                m720dbanco,
                m720dnrorigen,
                m720dcalle,
                m720dcalle2,
                m720dciudad,
                m720dregion,
                m720dzipcode,
                m720dpaisinm,
                m720dfeccompra,
                m720dorigen,
                m720dfecventa,
                m720dvalor1,
                m720dvalor2,
                m720dclaveval,
                m720dtitulos,
                m720durbana,
                m720dporcen                
                };
            setColumns(array);
            FieldDef arrayf[] = {m720dident };
            setDescription("720 Detalle Tipo 2");
            setPrimaryKeys(arrayf);
            m720dident.setAutoIncrementable(true);
            m720dident.setDescription("CODIGO DE DECLARANTE");
            m720dnif.setDescription("NIF declarante");
            m720dejercicio.setDescription("Ejercicio aplicacion");
            m720dperiodo.setDescription("codi declarate / empresa Jiss");
            m720dnifper.setDescription("NIF declarado");
            m720dnifrepre.setDescription("NIF representante legal del declarado");
            m720dnombre.setDescription("Declarado apellidos,razon social");
            m720dcondicion.setDescription("Condicion del declarante (titular,repre,usuf...)");
            m720dtipotiula.setDescription("Tipo titularidad sobre el Bien    (condicion=8)");
            m720dclave.setDescription("Clave Tipo del Bien C-V-I-S-B");
            m720dsubclave.setDescription("Subclave tipo del Bien");
            m720dtiporeal.setDescription("Tipo derecho real inmueble  (Clave B Subclave 4)");
            m720dpais.setDescription("Codigo alfab.Pais del Bien");
            m720dclauident.setDescription("Clave identificacion 0-1-2           (Clave V-I)");
            m720disin.setDescription("Codigo ISIN                          (Clave V-I)");
            m720dclaucta.setDescription("Clave ident.cuenta 1-IBAN,2-BIC,0-otro (Clave C)");
            m720dbic.setDescription("Codigo BIC                             (Clave C)");
            m720diban.setDescription("Codigo cuenta IBAN                     (Clave C)");
            m720dbanco.setDescription("Entidad rao social               (Clave C-V-I-S)");
            m720dnrorigen.setDescription("Nr.Ident.Fiscal en el pais de residenc.fisal");
            m720dcalle.setDescription("Entidad o inmueble: Calle-Nro");
            m720dcalle2.setDescription("Entidad o inmueble: Complemento calle");
            m720dciudad.setDescription("Entidad o inmueble: Poblacion-Ciudad");
            m720dregion.setDescription("Entidad o inmueble: Provincia-Region-Estado");
            m720dzipcode.setDescription("Entidad o inmueble: ZIP-CODE postal");
            m720dpaisinm.setDescription("Entidad o inmueble: Codigo alfab.Pais");
            m720dfeccompra.setDescription("Fecha compra-apertura AAAAMMDD");
            m720dorigen.setDescription("Origen del bien  A-M-C");
            m720dfecventa.setDescription("Fecha ventaa-extincion AAAAMMDD");
            m720dvalor1.setDescription("Valoracion1 saldo-valora 31/12 o v.compra");
            m720dvalor2.setDescription("Valoracion2 rescate-capitaliz-compra (Clave B-C)");
            m720dclaveval.setDescription("Clave valoracion A-B                 (Clave V-I)");
            m720dtitulos.setDescription("Nro acciones                         (Clave V-I)");
            m720durbana.setDescription("Urbana-Rustica                         (Clave B)");
            m720dporcen.setDescription("Porc.participacion");
            }
        }
        
    public class TabMod036p2 extends TableDef
        {
        // campos
        public FieldDef m36p2adominio;
        public FieldDef m36p2anif;
        public FieldDef m36p2aejercicio;
        public FieldDef m36p2aperiodo;
        public FieldDef m36p2a1a2;
        public FieldDef m36p2a3;
        public FieldDef m36p2a4;
        public FieldDef m36p2a5;
        public FieldDef m36p2a6;
        public FieldDef m36p2a7;
        public FieldDef m36p2a8;
        public FieldDef m36p2a11;
        public FieldDef m36p2a12;
        public FieldDef m36p2a13;
        public FieldDef m36p2a14;
        public FieldDef m36p2a15;
        public FieldDef m36p2a16;
        public FieldDef m36p2a17;
        public FieldDef m36p2a18;
        public FieldDef m36p2a19;
        public FieldDef m36p2a20;
        public FieldDef m36p2a21;
        public FieldDef m36p2a22;
        public FieldDef m36p2a23;
        public FieldDef m36p2a24;
        public FieldDef m36p2a24m;
        public FieldDef m36p2a25;
        public FieldDef m36p2a26;
        public FieldDef m36p2a27;
        public FieldDef m36p2a28;
        public FieldDef m36p2a29;
        public FieldDef m36p2a99;
        public FieldDef m36p2a31;
        public FieldDef m36p2a32;
        public FieldDef m36p2a33;
        public FieldDef m36p2a34;
        public FieldDef m36p2a35;
        public FieldDef m36p2a36;
        public FieldDef m36p2a37;
        public FieldDef m36p2a38;
        public FieldDef m36p2a39;
        public FieldDef m36p2a40;
        public FieldDef m36p2a41;
        public FieldDef m36p2a42;
        public FieldDef m36p2a43;
        public FieldDef m36p2a44;
        public FieldDef m36p2a45;
        public FieldDef m36p2a46;
        public FieldDef m36p2a47;
        public FieldDef m36p2a48;
        public FieldDef m36p2a49;
        public FieldDef m36p2a50;
        public FieldDef m36p2a51;
        public FieldDef m36p2a52;
        public FieldDef m36p2a53;
        public FieldDef m36p2a54;
        public FieldDef m36p2a54m;
        public FieldDef m36p2a55;
        public FieldDef m36p2a56;
        public FieldDef m36p2a57;
        public FieldDef m36p2a58;
        public FieldDef m36p2a59;
        public FieldDef m36p2a60;
        public FieldDef m36p2a61;
        public FieldDef m36p2a62;
        public FieldDef m36p2a63;
        public FieldDef m36p2a64;
        public FieldDef m36p2a65;
        public FieldDef m36p2a66;
        public FieldDef m36p2a67;
        public FieldDef m36p2a68;
        public FieldDef m36p2a69;
        public FieldDef m36p2a70;
        public FieldDef m36p2a71;
        public FieldDef m36p2a72;
        public FieldDef m36p2a73;
        public FieldDef m36p2a74;
        public FieldDef m36p2a75;
        public FieldDef m36p2a76;
        public FieldDef m36p2a77;
        public FieldDef m36p2a78;
        public FieldDef m36p2a79;
        public FieldDef m36p2a80;
        public FieldDef m36p2a81;
        public FieldDef m36p2a82;
        public FieldDef m36p2a83;
        public FieldDef m36p2a84;
        public FieldDef m36p2a84m;
        public FieldDef m36p2a85;
        public FieldDef m36p2a86;
        public FieldDef m36p2a87;
        public FieldDef m36p2a88;
        public FieldDef m36p2a89;
        public FieldDef m36p2a91;
        public FieldDef m36p2a92;
        public FieldDef m36p2a94;
        public FieldDef m36p2a96;
        public FieldDef m36p2a98;
        public FieldDef m36p2a9;
        public FieldDef m36p2a10;
        public FieldDef m36p2a30;
        public FieldDef m36p2a90;
        public FieldDef m36p2a1;
        public FieldDef m36p2a2;
        public FieldDef m36p2a28y17;
        public FieldDef m36p2a29y17;
        public FieldDef m36p2a38y17;
        public FieldDef m36p2a39y17;
        public FieldDef m36p2a40y17;
        public FieldDef m36p2a26y17;
        public FieldDef m36p2a56y17;
        public FieldDef m36p2a28y18;
        public FieldDef m36p2a38y18;
        public FieldDef m36p2abjtm;
        public FieldDef m36p2abjem;
        public FieldDef m36p2afecresfis;
        public TabMod036p2(String name)
            {
            super(name);
            m36p2adominio = new FieldDef("m36p2adominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p2anif = new FieldDef("m36p2anif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p2aejercicio = new FieldDef("m36p2aejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p2aperiodo = new FieldDef("m36p2aperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p2a1a2 = new FieldDef("m36p2a1a2",FieldDef.CHAR,1);
            m36p2a3 = new FieldDef("m36p2a3",FieldDef.CHAR,2);
            m36p2a4 = new FieldDef("m36p2a4",FieldDef.CHAR,9);
            m36p2a5 = new FieldDef("m36p2a5",FieldDef.CHAR,50);
            m36p2a6 = new FieldDef("m36p2a6",FieldDef.CHAR,50);
            m36p2a7 = new FieldDef("m36p2a7",FieldDef.CHAR,25);
            m36p2a8 = new FieldDef("m36p2a8",FieldDef.CHAR,25);
            m36p2a11 = new FieldDef("m36p2a11",FieldDef.CHAR,5);
            m36p2a12 = new FieldDef("m36p2a12",FieldDef.CHAR,50);
            m36p2a13 = new FieldDef("m36p2a13",FieldDef.CHAR,3);
            m36p2a14 = new FieldDef("m36p2a14",FieldDef.INTEGER,0);
            m36p2a15 = new FieldDef("m36p2a15",FieldDef.CHAR,3);
            m36p2a16 = new FieldDef("m36p2a16",FieldDef.CHAR,3);
            m36p2a17 = new FieldDef("m36p2a17",FieldDef.CHAR,3);
            m36p2a18 = new FieldDef("m36p2a18",FieldDef.CHAR,3);
            m36p2a19 = new FieldDef("m36p2a19",FieldDef.CHAR,3);
            m36p2a20 = new FieldDef("m36p2a20",FieldDef.CHAR,3);
            m36p2a21 = new FieldDef("m36p2a21",FieldDef.CHAR,40);
            m36p2a22 = new FieldDef("m36p2a22",FieldDef.CHAR,30);
            m36p2a23 = new FieldDef("m36p2a23",FieldDef.CHAR,5);
            m36p2a24 = new FieldDef("m36p2a24",FieldDef.CHAR,30);
            m36p2a24m = new FieldDef("m36p2a24m",FieldDef.CHAR,5);
            m36p2a25 = new FieldDef("m36p2a25",FieldDef.CHAR,2);
            m36p2a26 = new FieldDef("m36p2a26",FieldDef.INTEGER,0);
            m36p2a27 = new FieldDef("m36p2a27",FieldDef.INTEGER,0);
            m36p2a28 = new FieldDef("m36p2a28",FieldDef.INTEGER,0);
            m36p2a29 = new FieldDef("m36p2a29",FieldDef.CHAR,100);
            m36p2a99 = new FieldDef("m36p2a99",FieldDef.CHAR,100);
            m36p2a31 = new FieldDef("m36p2a31",FieldDef.CHAR,50);
            m36p2a32 = new FieldDef("m36p2a32",FieldDef.CHAR,40);
            m36p2a33 = new FieldDef("m36p2a33",FieldDef.CHAR,10);
            m36p2a34 = new FieldDef("m36p2a34",FieldDef.CHAR,30);
            m36p2a35 = new FieldDef("m36p2a35",FieldDef.CHAR,30);
            m36p2a36 = new FieldDef("m36p2a36",FieldDef.CHAR,30);
            m36p2a37 = new FieldDef("m36p2a37",FieldDef.CHAR,2);
            m36p2a38 = new FieldDef("m36p2a38",FieldDef.CHAR,15);
            m36p2a39 = new FieldDef("m36p2a39",FieldDef.CHAR,15);
            m36p2a40 = new FieldDef("m36p2a40",FieldDef.CHAR,15);
            m36p2a41 = new FieldDef("m36p2a41",FieldDef.CHAR,5);
            m36p2a42 = new FieldDef("m36p2a42",FieldDef.CHAR,50);
            m36p2a43 = new FieldDef("m36p2a43",FieldDef.CHAR,3);
            m36p2a44 = new FieldDef("m36p2a44",FieldDef.INTEGER,0);
            m36p2a45 = new FieldDef("m36p2a45",FieldDef.CHAR,3);
            m36p2a46 = new FieldDef("m36p2a46",FieldDef.CHAR,3);
            m36p2a47 = new FieldDef("m36p2a47",FieldDef.CHAR,3);
            m36p2a48 = new FieldDef("m36p2a48",FieldDef.CHAR,3);
            m36p2a49 = new FieldDef("m36p2a49",FieldDef.CHAR,3);
            m36p2a50 = new FieldDef("m36p2a50",FieldDef.CHAR,3);
            m36p2a51 = new FieldDef("m36p2a51",FieldDef.CHAR,40);
            m36p2a52 = new FieldDef("m36p2a52",FieldDef.CHAR,30);
            m36p2a53 = new FieldDef("m36p2a53",FieldDef.CHAR,5);
            m36p2a54 = new FieldDef("m36p2a54",FieldDef.CHAR,30);
            m36p2a54m = new FieldDef("m36p2a54m",FieldDef.CHAR,5);
            m36p2a55 = new FieldDef("m36p2a55",FieldDef.CHAR,2);
            m36p2a56 = new FieldDef("m36p2a56",FieldDef.INTEGER,0);
            m36p2a57 = new FieldDef("m36p2a57",FieldDef.INTEGER,0);
            m36p2a58 = new FieldDef("m36p2a58",FieldDef.INTEGER,0);
            m36p2a59 = new FieldDef("m36p2a59",FieldDef.CHAR,50);
            m36p2a60 = new FieldDef("m36p2a60",FieldDef.CHAR,2);
            m36p2a61 = new FieldDef("m36p2a61",FieldDef.INTEGER,0);
            m36p2a62 = new FieldDef("m36p2a62",FieldDef.CHAR,30);
            m36p2a63 = new FieldDef("m36p2a63",FieldDef.CHAR,5);
            m36p2a64 = new FieldDef("m36p2a64",FieldDef.CHAR,2);
            m36p2a65 = new FieldDef("m36p2a65",FieldDef.INTEGER,0);
            m36p2a66 = new FieldDef("m36p2a66",FieldDef.INTEGER,0);
            m36p2a67 = new FieldDef("m36p2a67",FieldDef.INTEGER,0);
            m36p2a68 = new FieldDef("m36p2a68",FieldDef.CHAR,50);
            m36p2a69 = new FieldDef("m36p2a69",FieldDef.CHAR,2);
            m36p2a70 = new FieldDef("m36p2a70",FieldDef.CHAR,100);
            m36p2a71 = new FieldDef("m36p2a71",FieldDef.CHAR,5);
            m36p2a72 = new FieldDef("m36p2a72",FieldDef.CHAR,50);
            m36p2a73 = new FieldDef("m36p2a73",FieldDef.CHAR,3);
            m36p2a74 = new FieldDef("m36p2a74",FieldDef.INTEGER,0);
            m36p2a75 = new FieldDef("m36p2a75",FieldDef.CHAR,3);
            m36p2a76 = new FieldDef("m36p2a76",FieldDef.CHAR,3);
            m36p2a77 = new FieldDef("m36p2a77",FieldDef.CHAR,3);
            m36p2a78 = new FieldDef("m36p2a78",FieldDef.CHAR,3);
            m36p2a79 = new FieldDef("m36p2a79",FieldDef.CHAR,3);
            m36p2a80 = new FieldDef("m36p2a80",FieldDef.CHAR,3);
            m36p2a81 = new FieldDef("m36p2a81",FieldDef.CHAR,40);
            m36p2a82 = new FieldDef("m36p2a82",FieldDef.CHAR,30);
            m36p2a83 = new FieldDef("m36p2a83",FieldDef.CHAR,5);
            m36p2a84 = new FieldDef("m36p2a84",FieldDef.CHAR,30);
            m36p2a84m = new FieldDef("m36p2a84m",FieldDef.CHAR,5);
            m36p2a85 = new FieldDef("m36p2a85",FieldDef.CHAR,2);
            m36p2a86 = new FieldDef("m36p2a86",FieldDef.CHAR,9);
            m36p2a87 = new FieldDef("m36p2a87",FieldDef.INTEGER,0);
            m36p2a88 = new FieldDef("m36p2a88",FieldDef.INTEGER,0);
            m36p2a89 = new FieldDef("m36p2a89",FieldDef.INTEGER,0);
            m36p2a91 = new FieldDef("m36p2a91",FieldDef.CHAR,1);
            m36p2a92 = new FieldDef("m36p2a92",FieldDef.INTEGER,0);
            m36p2a94 = new FieldDef("m36p2a94",FieldDef.CHAR,40);
            m36p2a96 = new FieldDef("m36p2a96",FieldDef.CHAR,40);
            m36p2a98 = new FieldDef("m36p2a98",FieldDef.CHAR,40);
            m36p2a9 = new FieldDef("m36p2a9",FieldDef.CHAR,1);
            m36p2a10 = new FieldDef("m36p2a10",FieldDef.DATE);
            m36p2a30 = new FieldDef("m36p2a30",FieldDef.CHAR,20);
            m36p2a90 = new FieldDef("m36p2a90",FieldDef.CHAR,25);
            m36p2a1 = new FieldDef("m36p2a1",FieldDef.CHAR,1);
            m36p2a2 = new FieldDef("m36p2a2",FieldDef.CHAR,2);
            m36p2a28y17 = new FieldDef("m36p2a28y17",FieldDef.INTEGER,0);
            m36p2a29y17 = new FieldDef("m36p2a29y17",FieldDef.INTEGER,0);
            m36p2a38y17 = new FieldDef("m36p2a38y17",FieldDef.CHAR,15);
            m36p2a39y17 = new FieldDef("m36p2a39y17",FieldDef.CHAR,15);
            m36p2a40y17 = new FieldDef("m36p2a40y17",FieldDef.CHAR,1);
            m36p2a26y17 = new FieldDef("m36p2a26y17",FieldDef.CHAR,100);
            m36p2a56y17 = new FieldDef("m36p2a56y17",FieldDef.CHAR,100);
            m36p2a28y18 = new FieldDef("m36p2a28y18",FieldDef.CHAR,4);
            m36p2a38y18 = new FieldDef("m36p2a38y18",FieldDef.CHAR,100);
            m36p2abjtm = new FieldDef("m36p2abjtm",FieldDef.CHAR,1);
            m36p2abjem = new FieldDef("m36p2abjem",FieldDef.CHAR,1);
            m36p2afecresfis = new FieldDef("m36p2afecresfis",FieldDef.DATE);
            FieldDef array[] = {
                m36p2adominio,
                m36p2anif,
                m36p2aejercicio,
                m36p2aperiodo,
                m36p2a1a2,
                m36p2a3,
                m36p2a4,
                m36p2a5,
                m36p2a6,
                m36p2a7,
                m36p2a8,
                m36p2a11,
                m36p2a12,
                m36p2a13,
                m36p2a14,
                m36p2a15,
                m36p2a16,
                m36p2a17,
                m36p2a18,
                m36p2a19,
                m36p2a20,
                m36p2a21,
                m36p2a22,
                m36p2a23,
                m36p2a24,
                m36p2a24m,
                m36p2a25,
                m36p2a26,
                m36p2a27,
                m36p2a28,
                m36p2a29,
                m36p2a99,
                m36p2a31,
                m36p2a32,
                m36p2a33,
                m36p2a34,
                m36p2a35,
                m36p2a36,
                m36p2a37,
                m36p2a38,
                m36p2a39,
                m36p2a40,
                m36p2a41,
                m36p2a42,
                m36p2a43,
                m36p2a44,
                m36p2a45,
                m36p2a46,
                m36p2a47,
                m36p2a48,
                m36p2a49,
                m36p2a50,
                m36p2a51,
                m36p2a52,
                m36p2a53,
                m36p2a54,
                m36p2a54m,
                m36p2a55,
                m36p2a56,
                m36p2a57,
                m36p2a58,
                m36p2a59,
                m36p2a60,
                m36p2a61,
                m36p2a62,
                m36p2a63,
                m36p2a64,
                m36p2a65,
                m36p2a66,
                m36p2a67,
                m36p2a68,
                m36p2a69,
                m36p2a70,
                m36p2a71,
                m36p2a72,
                m36p2a73,
                m36p2a74,
                m36p2a75,
                m36p2a76,
                m36p2a77,
                m36p2a78,
                m36p2a79,
                m36p2a80,
                m36p2a81,
                m36p2a82,
                m36p2a83,
                m36p2a84,
                m36p2a84m,
                m36p2a85,
                m36p2a86,
                m36p2a87,
                m36p2a88,
                m36p2a89,
                m36p2a91,
                m36p2a92,
                m36p2a94,
                m36p2a96,
                m36p2a98,
                m36p2a9,
                m36p2a10,
                m36p2a30,
                m36p2a90,
                m36p2a1,
                m36p2a2,
                m36p2a28y17,
                m36p2a29y17,
                m36p2a38y17,
                m36p2a39y17,
                m36p2a40y17,
                m36p2a26y17,
                m36p2a56y17,
                m36p2a28y18,
                m36p2a38y18,
                m36p2abjtm,
                m36p2abjem,
                m36p2afecresfis                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p2adominio,m36p2anif,m36p2aejercicio,m36p2aperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p5 extends TableDef
        {
        // campos
        public FieldDef m36p5dominio;
        public FieldDef m36p5nif;
        public FieldDef m36p5ejercicio;
        public FieldDef m36p5periodo;
        public FieldDef m36p541;
        public FieldDef m36p545;
        public FieldDef m36p577;
        public FieldDef m36p578;
        public FieldDef m36p500;
        public FieldDef m36p501;
        public FieldDef m36p502;
        public FieldDef m36p503;
        public FieldDef m36p504;
        public FieldDef m36p505;
        public FieldDef m36p506;
        public FieldDef m36p507;
        public FieldDef m36p508;
        public FieldDef m36p509;
        public FieldDef m36p510;
        public FieldDef m36p511;
        public FieldDef m36p512;
        public FieldDef m36p514;
        public FieldDef m36p515;
        public FieldDef m36p516;
        public FieldDef m36p518;
        public FieldDef m36p519;
        public FieldDef m36p520;
        public FieldDef m36p522;
        public FieldDef m36p523;
        public FieldDef m36p524;
        public FieldDef m36p526;
        public FieldDef m36p527;
        public FieldDef m36p528;
        public FieldDef m36p530;
        public FieldDef m36p531;
        public FieldDef m36p532;
        public FieldDef m36p534;
        public FieldDef m36p535;
        public FieldDef m36p536;
        public FieldDef m36p550;
        public FieldDef m36p551;
        public FieldDef m36p552;
        public FieldDef m36p574;
        public FieldDef m36p575;
        public FieldDef m36p576;
        public FieldDef m36p579;
        public FieldDef m36p582;
        public FieldDef m36p584;
        public FieldDef m36p586;
        public FieldDef m36p587;
        public FieldDef m36p588;
        public FieldDef m36p589;
        public FieldDef m36p590;
        public FieldDef m36p591;
        public FieldDef m36p592;
        public FieldDef m36p593;
        public FieldDef m36p594;
        public FieldDef m36p595;
        public FieldDef m36p596;
        public FieldDef m36p597;
        public FieldDef m36p598;
        public FieldDef m36p599;
        public FieldDef m36p517;
        public FieldDef m36p521;
        public FieldDef m36p525;
        public FieldDef m36p513;
        public FieldDef m36p530i;
        public FieldDef m36p736i;
        public FieldDef m36p532i;
        public FieldDef m36p738i;
        public FieldDef m36p740i;
        public FieldDef m36p739i;
        public TabMod036p5(String name)
            {
            super(name);
            m36p5dominio = new FieldDef("m36p5dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p5nif = new FieldDef("m36p5nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p5ejercicio = new FieldDef("m36p5ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p5periodo = new FieldDef("m36p5periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p541 = new FieldDef("m36p541",FieldDef.CHAR,1);
            m36p545 = new FieldDef("m36p545",FieldDef.DATE);
            m36p577 = new FieldDef("m36p577",FieldDef.CHAR,1);
            m36p578 = new FieldDef("m36p578",FieldDef.DATE);
            m36p500 = new FieldDef("m36p500",FieldDef.CHAR,1);
            m36p501 = new FieldDef("m36p501",FieldDef.CHAR,1);
            m36p502 = new FieldDef("m36p502",FieldDef.CHAR,1);
            m36p503 = new FieldDef("m36p503",FieldDef.DATE);
            m36p504 = new FieldDef("m36p504",FieldDef.CHAR,1);
            m36p505 = new FieldDef("m36p505",FieldDef.DATE);
            m36p506 = new FieldDef("m36p506",FieldDef.CHAR,1);
            m36p507 = new FieldDef("m36p507",FieldDef.DATE);
            m36p508 = new FieldDef("m36p508",FieldDef.CHAR,1);
            m36p509 = new FieldDef("m36p509",FieldDef.DATE);
            m36p510 = new FieldDef("m36p510",FieldDef.CHAR,1);
            m36p511 = new FieldDef("m36p511",FieldDef.CHAR,6);
            m36p512 = new FieldDef("m36p512",FieldDef.DATE);
            m36p514 = new FieldDef("m36p514",FieldDef.CHAR,1);
            m36p515 = new FieldDef("m36p515",FieldDef.CHAR,6);
            m36p516 = new FieldDef("m36p516",FieldDef.DATE);
            m36p518 = new FieldDef("m36p518",FieldDef.CHAR,1);
            m36p519 = new FieldDef("m36p519",FieldDef.CHAR,6);
            m36p520 = new FieldDef("m36p520",FieldDef.DATE);
            m36p522 = new FieldDef("m36p522",FieldDef.CHAR,1);
            m36p523 = new FieldDef("m36p523",FieldDef.CHAR,6);
            m36p524 = new FieldDef("m36p524",FieldDef.DATE);
            m36p526 = new FieldDef("m36p526",FieldDef.CHAR,1);
            m36p527 = new FieldDef("m36p527",FieldDef.CHAR,6);
            m36p528 = new FieldDef("m36p528",FieldDef.DATE);
            m36p530 = new FieldDef("m36p530",FieldDef.CHAR,1);
            m36p531 = new FieldDef("m36p531",FieldDef.CHAR,6);
            m36p532 = new FieldDef("m36p532",FieldDef.DATE);
            m36p534 = new FieldDef("m36p534",FieldDef.CHAR,1);
            m36p535 = new FieldDef("m36p535",FieldDef.CHAR,6);
            m36p536 = new FieldDef("m36p536",FieldDef.DATE);
            m36p550 = new FieldDef("m36p550",FieldDef.CHAR,1);
            m36p551 = new FieldDef("m36p551",FieldDef.CHAR,6);
            m36p552 = new FieldDef("m36p552",FieldDef.DATE);
            m36p574 = new FieldDef("m36p574",FieldDef.CHAR,1);
            m36p575 = new FieldDef("m36p575",FieldDef.CHAR,6);
            m36p576 = new FieldDef("m36p576",FieldDef.DATE);
            m36p579 = new FieldDef("m36p579",FieldDef.CHAR,1);
            m36p582 = new FieldDef("m36p582",FieldDef.CHAR,1);
            m36p584 = new FieldDef("m36p584",FieldDef.DATE);
            m36p586 = new FieldDef("m36p586",FieldDef.FLOAT,6,0);
            m36p587 = new FieldDef("m36p587",FieldDef.CHAR,1);
            m36p588 = new FieldDef("m36p588",FieldDef.CHAR,6);
            m36p589 = new FieldDef("m36p589",FieldDef.CHAR,6);
            m36p590 = new FieldDef("m36p590",FieldDef.CHAR,6);
            m36p591 = new FieldDef("m36p591",FieldDef.CHAR,1);
            m36p592 = new FieldDef("m36p592",FieldDef.CHAR,6);
            m36p593 = new FieldDef("m36p593",FieldDef.CHAR,6);
            m36p594 = new FieldDef("m36p594",FieldDef.CHAR,6);
            m36p595 = new FieldDef("m36p595",FieldDef.CHAR,1);
            m36p596 = new FieldDef("m36p596",FieldDef.CHAR,6);
            m36p597 = new FieldDef("m36p597",FieldDef.CHAR,6);
            m36p598 = new FieldDef("m36p598",FieldDef.CHAR,6);
            m36p599 = new FieldDef("m36p599",FieldDef.CHAR,1);
            m36p517 = new FieldDef("m36p517",FieldDef.CHAR,1);
            m36p521 = new FieldDef("m36p521",FieldDef.CHAR,6);
            m36p525 = new FieldDef("m36p525",FieldDef.DATE);
            m36p513 = new FieldDef("m36p513",FieldDef.CHAR,1);
            m36p530i = new FieldDef("m36p530i",FieldDef.CHAR,1);
            m36p736i = new FieldDef("m36p736i",FieldDef.DATE);
            m36p532i = new FieldDef("m36p532i",FieldDef.CHAR,1);
            m36p738i = new FieldDef("m36p738i",FieldDef.DATE);
            m36p740i = new FieldDef("m36p740i",FieldDef.CHAR,1);
            m36p739i = new FieldDef("m36p739i",FieldDef.DATE);
            FieldDef array[] = {
                m36p5dominio,
                m36p5nif,
                m36p5ejercicio,
                m36p5periodo,
                m36p541,
                m36p545,
                m36p577,
                m36p578,
                m36p500,
                m36p501,
                m36p502,
                m36p503,
                m36p504,
                m36p505,
                m36p506,
                m36p507,
                m36p508,
                m36p509,
                m36p510,
                m36p511,
                m36p512,
                m36p514,
                m36p515,
                m36p516,
                m36p518,
                m36p519,
                m36p520,
                m36p522,
                m36p523,
                m36p524,
                m36p526,
                m36p527,
                m36p528,
                m36p530,
                m36p531,
                m36p532,
                m36p534,
                m36p535,
                m36p536,
                m36p550,
                m36p551,
                m36p552,
                m36p574,
                m36p575,
                m36p576,
                m36p579,
                m36p582,
                m36p584,
                m36p586,
                m36p587,
                m36p588,
                m36p589,
                m36p590,
                m36p591,
                m36p592,
                m36p593,
                m36p594,
                m36p595,
                m36p596,
                m36p597,
                m36p598,
                m36p599,
                m36p517,
                m36p521,
                m36p525,
                m36p513,
                m36p530i,
                m36p736i,
                m36p532i,
                m36p738i,
                m36p740i,
                m36p739i                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p5dominio,m36p5nif,m36p5ejercicio,m36p5periodo };
            setPrimaryKeys(arrayf);
            m36p517.setDescription("Reg.criterio caja 1-Incluido/2-Excluido/3-Renuncia/4-Revocacion/5-baja");
            m36p521.setDescription("Reg.criterio caja Epigrafe");
            m36p525.setDescription("Reg.criterio caja Fecha");
            m36p513.setDescription("Revenedor movil S/N");
            m36p530i.setDescription("Importacion 1-Incluido/2-Excluido/3-Renuncia/4-Revocacion/5-baja");
            m36p736i.setDescription("Importacion Fecha");
            }
        }
        
    public class TabModcensanc extends TableDef
        {
        // campos
        public FieldDef mcsdominio;
        public FieldDef mcsnif;
        public FieldDef mcsejercicio;
        public FieldDef mcsperiodo;
        public FieldDef mcsrazon;
        public FieldDef mcsfechacrea;
        public TabModcensanc(String name)
            {
            super(name);
            mcsdominio = new FieldDef("mcsdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            mcsnif = new FieldDef("mcsnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mcsejercicio = new FieldDef("mcsejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mcsperiodo = new FieldDef("mcsperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mcsrazon = new FieldDef("mcsrazon",FieldDef.CHAR,125);
            mcsfechacrea = new FieldDef("mcsfechacrea",FieldDef.DATE);
            FieldDef array[] = {
                mcsdominio,
                mcsnif,
                mcsejercicio,
                mcsperiodo,
                mcsrazon,
                mcsfechacrea                
                };
            setColumns(array);
            FieldDef arrayf[] = {mcsdominio,mcsnif,mcsejercicio,mcsperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModcensand extends TableDef
        {
        // campos
        public FieldDef mdsdominio;
        public FieldDef mdsnif;
        public FieldDef mdsejercicio;
        public FieldDef mdsperiodo;
        public FieldDef mdscodi;
        public FieldDef mdscomaut;
        public FieldDef mdsidfactura;
        public FieldDef mdsfechafac;
        public FieldDef mdsimporte;
        public FieldDef mdsproducto;
        public FieldDef mdscantidad;
        public FieldDef mdsnifsp;
        public FieldDef mdsrazonsp;
        public FieldDef mdsidensp;
        public TabModcensand(String name)
            {
            super(name);
            mdsdominio = new FieldDef("mdsdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            mdsnif = new FieldDef("mdsnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mdsejercicio = new FieldDef("mdsejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mdsperiodo = new FieldDef("mdsperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mdscodi = new FieldDef("mdscodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mdscomaut = new FieldDef("mdscomaut",FieldDef.CHAR,2);
            mdsidfactura = new FieldDef("mdsidfactura",FieldDef.CHAR,35);
            mdsfechafac = new FieldDef("mdsfechafac",FieldDef.DATE);
            mdsimporte = new FieldDef("mdsimporte",FieldDef.FLOAT,6,0);
            mdsproducto = new FieldDef("mdsproducto",FieldDef.CHAR,1);
            mdscantidad = new FieldDef("mdscantidad",FieldDef.FLOAT,6,0);
            mdsnifsp = new FieldDef("mdsnifsp",FieldDef.CHAR,15);
            mdsrazonsp = new FieldDef("mdsrazonsp",FieldDef.CHAR,125);
            mdsidensp = new FieldDef("mdsidensp",FieldDef.CHAR,35);
            FieldDef array[] = {
                mdsdominio,
                mdsnif,
                mdsejercicio,
                mdsperiodo,
                mdscodi,
                mdscomaut,
                mdsidfactura,
                mdsfechafac,
                mdsimporte,
                mdsproducto,
                mdscantidad,
                mdsnifsp,
                mdsrazonsp,
                mdsidensp                
                };
            setColumns(array);
            FieldDef arrayf[] = {mdsdominio,mdsnif,mdsejercicio,mdsperiodo,mdscodi };
            setPrimaryKeys(arrayf);
            mdscodi.setAutoIncrementable(true);
            }
        }
        
    public class TabMod353c extends TableDef
        {
        // campos
        public FieldDef m353cdominio;
        public FieldDef m353cnif;
        public FieldDef m353cejercicio;
        public FieldDef m353cperiodo;
        public FieldDef m353ctipodecl;
        public FieldDef m353crazon;
        public FieldDef m353cgrupo;
        public FieldDef m353creg163;
        public FieldDef m353creg30;
        public FieldDef m353ctotal;
        public FieldDef m353ccomp;
        public FieldDef m353cresul;
        public FieldDef m353crantlq;
        public FieldDef m353crauto;
        public FieldDef m353cautcom;
        public FieldDef m353cautcomj;
        public FieldDef m353cimpcom;
        public FieldDef m353cimpdev;
        public FieldDef m353csinact;
        public FieldDef m353ciban;
        public FieldDef m353cibanp;
        public FieldDef m353cent;
        public FieldDef m353cofi;
        public FieldDef m353cdigi;
        public FieldDef m353ccta;
        public FieldDef m353cswift;
        public TabMod353c(String name)
            {
            super(name);
            m353cdominio = new FieldDef("m353cdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m353cnif = new FieldDef("m353cnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m353cejercicio = new FieldDef("m353cejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m353cperiodo = new FieldDef("m353cperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m353ctipodecl = new FieldDef("m353ctipodecl",FieldDef.CHAR,1);
            m353crazon = new FieldDef("m353crazon",FieldDef.CHAR,125);
            m353cgrupo = new FieldDef("m353cgrupo",FieldDef.CHAR,10);
            m353creg163 = new FieldDef("m353creg163",FieldDef.CHAR,1,FieldDef.NOTNULL);
            m353creg30 = new FieldDef("m353creg30",FieldDef.CHAR,1,FieldDef.NOTNULL);
            m353ctotal = new FieldDef("m353ctotal",FieldDef.FLOAT,6,0);
            m353ccomp = new FieldDef("m353ccomp",FieldDef.FLOAT,6,0);
            m353cresul = new FieldDef("m353cresul",FieldDef.FLOAT,6,0);
            m353crantlq = new FieldDef("m353crantlq",FieldDef.FLOAT,6,0);
            m353crauto = new FieldDef("m353crauto",FieldDef.FLOAT,6,0);
            m353cautcom = new FieldDef("m353cautcom",FieldDef.CHAR,1);
            m353cautcomj = new FieldDef("m353cautcomj",FieldDef.CHAR,13);
            m353cimpcom = new FieldDef("m353cimpcom",FieldDef.FLOAT,6,0);
            m353cimpdev = new FieldDef("m353cimpdev",FieldDef.FLOAT,6,0);
            m353csinact = new FieldDef("m353csinact",FieldDef.CHAR,1);
            m353ciban = new FieldDef("m353ciban",FieldDef.CHAR,2);
            m353cibanp = new FieldDef("m353cibanp",FieldDef.CHAR,2);
            m353cent = new FieldDef("m353cent",FieldDef.CHAR,4);
            m353cofi = new FieldDef("m353cofi",FieldDef.CHAR,4);
            m353cdigi = new FieldDef("m353cdigi",FieldDef.CHAR,2);
            m353ccta = new FieldDef("m353ccta",FieldDef.CHAR,10);
            m353cswift = new FieldDef("m353cswift",FieldDef.CHAR,11);
            FieldDef array[] = {
                m353cdominio,
                m353cnif,
                m353cejercicio,
                m353cperiodo,
                m353ctipodecl,
                m353crazon,
                m353cgrupo,
                m353creg163,
                m353creg30,
                m353ctotal,
                m353ccomp,
                m353cresul,
                m353crantlq,
                m353crauto,
                m353cautcom,
                m353cautcomj,
                m353cimpcom,
                m353cimpdev,
                m353csinact,
                m353ciban,
                m353cibanp,
                m353cent,
                m353cofi,
                m353cdigi,
                m353ccta,
                m353cswift                
                };
            setColumns(array);
            FieldDef arrayf[] = {m353cdominio,m353cnif,m353cejercicio,m353cperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod353d extends TableDef
        {
        // campos
        public FieldDef m353dident;
        public FieldDef m353ddominio;
        public FieldDef m353dnif;
        public FieldDef m353dejercicio;
        public FieldDef m353dperiodo;
        public FieldDef m353dtipoent;
        public FieldDef m353dnife;
        public FieldDef m353dresult;
        public FieldDef m353dporcpart;
        public FieldDef m353dcode322;
        public TabMod353d(String name)
            {
            super(name);
            m353dident = new FieldDef("m353dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m353ddominio = new FieldDef("m353ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m353dnif = new FieldDef("m353dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m353dejercicio = new FieldDef("m353dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m353dperiodo = new FieldDef("m353dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m353dtipoent = new FieldDef("m353dtipoent",FieldDef.CHAR,1);
            m353dnife = new FieldDef("m353dnife",FieldDef.CHAR,9);
            m353dresult = new FieldDef("m353dresult",FieldDef.FLOAT,6,0);
            m353dporcpart = new FieldDef("m353dporcpart",FieldDef.FLOAT,6,0);
            m353dcode322 = new FieldDef("m353dcode322",FieldDef.CHAR,13);
            FieldDef array[] = {
                m353dident,
                m353ddominio,
                m353dnif,
                m353dejercicio,
                m353dperiodo,
                m353dtipoent,
                m353dnife,
                m353dresult,
                m353dporcpart,
                m353dcode322                
                };
            setColumns(array);
            FieldDef arrayf[] = {m353dident };
            setPrimaryKeys(arrayf);
            m353dident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod282 extends TableDef
        {
        // campos
        public FieldDef m282dominio;
        public FieldDef m282nif;
        public FieldDef m282ejercicio;
        public FieldDef m282periodo;
        public FieldDef m282apellidos;
        public FieldDef m282nombre;
        public FieldDef m282tipoident;
        public FieldDef m282volneg01;
        public FieldDef m282volneg02;
        public FieldDef m282corpor01;
        public FieldDef m282corpor02;
        public FieldDef m282noini01;
        public FieldDef m282noini02;
        public FieldDef m282zesp01;
        public FieldDef m282zesp02;
        public FieldDef m282reserva01;
        public FieldDef m282reserva02;
        public FieldDef m282exen01;
        public FieldDef m282exen02;
        public FieldDef m282aytrans01;
        public FieldDef m282aytrans02;
        public FieldDef m282arftotal01;
        public FieldDef m282arftotal02;
        public FieldDef m282ariincent;
        public FieldDef m282arideduc;
        public FieldDef m282arireserva;
        public FieldDef m282ariotro;
        public FieldDef m282aritotal;
        public FieldDef m282pymeafrica;
        public FieldDef m282pymepubli;
        public FieldDef m282pymetotal;
        public FieldDef m282audiovisual;
        public FieldDef m282otrosincen;
        public TabMod282(String name)
            {
            super(name);
            m282dominio = new FieldDef("m282dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m282nif = new FieldDef("m282nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m282ejercicio = new FieldDef("m282ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m282periodo = new FieldDef("m282periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m282apellidos = new FieldDef("m282apellidos",FieldDef.CHAR,60);
            m282nombre = new FieldDef("m282nombre",FieldDef.CHAR,20);
            m282tipoident = new FieldDef("m282tipoident",FieldDef.CHAR,1);
            m282volneg01 = new FieldDef("m282volneg01",FieldDef.FLOAT,6,0);
            m282volneg02 = new FieldDef("m282volneg02",FieldDef.FLOAT,6,0);
            m282corpor01 = new FieldDef("m282corpor01",FieldDef.FLOAT,6,0);
            m282corpor02 = new FieldDef("m282corpor02",FieldDef.FLOAT,6,0);
            m282noini01 = new FieldDef("m282noini01",FieldDef.FLOAT,6,0);
            m282noini02 = new FieldDef("m282noini02",FieldDef.FLOAT,6,0);
            m282zesp01 = new FieldDef("m282zesp01",FieldDef.FLOAT,6,0);
            m282zesp02 = new FieldDef("m282zesp02",FieldDef.FLOAT,6,0);
            m282reserva01 = new FieldDef("m282reserva01",FieldDef.FLOAT,6,0);
            m282reserva02 = new FieldDef("m282reserva02",FieldDef.FLOAT,6,0);
            m282exen01 = new FieldDef("m282exen01",FieldDef.FLOAT,6,0);
            m282exen02 = new FieldDef("m282exen02",FieldDef.FLOAT,6,0);
            m282aytrans01 = new FieldDef("m282aytrans01",FieldDef.FLOAT,6,0);
            m282aytrans02 = new FieldDef("m282aytrans02",FieldDef.FLOAT,6,0);
            m282arftotal01 = new FieldDef("m282arftotal01",FieldDef.FLOAT,6,0);
            m282arftotal02 = new FieldDef("m282arftotal02",FieldDef.FLOAT,6,0);
            m282ariincent = new FieldDef("m282ariincent",FieldDef.FLOAT,6,0);
            m282arideduc = new FieldDef("m282arideduc",FieldDef.FLOAT,6,0);
            m282arireserva = new FieldDef("m282arireserva",FieldDef.FLOAT,6,0);
            m282ariotro = new FieldDef("m282ariotro",FieldDef.FLOAT,6,0);
            m282aritotal = new FieldDef("m282aritotal",FieldDef.FLOAT,6,0);
            m282pymeafrica = new FieldDef("m282pymeafrica",FieldDef.FLOAT,6,0);
            m282pymepubli = new FieldDef("m282pymepubli",FieldDef.FLOAT,6,0);
            m282pymetotal = new FieldDef("m282pymetotal",FieldDef.FLOAT,6,0);
            m282audiovisual = new FieldDef("m282audiovisual",FieldDef.FLOAT,6,0);
            m282otrosincen = new FieldDef("m282otrosincen",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m282dominio,
                m282nif,
                m282ejercicio,
                m282periodo,
                m282apellidos,
                m282nombre,
                m282tipoident,
                m282volneg01,
                m282volneg02,
                m282corpor01,
                m282corpor02,
                m282noini01,
                m282noini02,
                m282zesp01,
                m282zesp02,
                m282reserva01,
                m282reserva02,
                m282exen01,
                m282exen02,
                m282aytrans01,
                m282aytrans02,
                m282arftotal01,
                m282arftotal02,
                m282ariincent,
                m282arideduc,
                m282arireserva,
                m282ariotro,
                m282aritotal,
                m282pymeafrica,
                m282pymepubli,
                m282pymetotal,
                m282audiovisual,
                m282otrosincen                
                };
            setColumns(array);
            FieldDef arrayf[] = {m282dominio,m282nif,m282ejercicio,m282periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod232c extends TableDef
        {
        // campos
        public FieldDef m232cdominio;
        public FieldDef m232cnif;
        public FieldDef m232cejercicio;
        public FieldDef m232cperiodo;
        public FieldDef m232capellidos;
        public FieldDef m232cnombre;
        public FieldDef m232ctipoejer;
        public FieldDef m232cfechaini;
        public FieldDef m232cfechafin;
        public FieldDef m232ccnae;
        public FieldDef m232ccomplem;
        public FieldDef m232cnjusti;
        public TabMod232c(String name)
            {
            super(name);
            m232cdominio = new FieldDef("m232cdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m232cnif = new FieldDef("m232cnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m232cejercicio = new FieldDef("m232cejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m232cperiodo = new FieldDef("m232cperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m232capellidos = new FieldDef("m232capellidos",FieldDef.CHAR,60);
            m232cnombre = new FieldDef("m232cnombre",FieldDef.CHAR,20);
            m232ctipoejer = new FieldDef("m232ctipoejer",FieldDef.INTEGER,0);
            m232cfechaini = new FieldDef("m232cfechaini",FieldDef.DATE);
            m232cfechafin = new FieldDef("m232cfechafin",FieldDef.DATE);
            m232ccnae = new FieldDef("m232ccnae",FieldDef.INTEGER,0);
            m232ccomplem = new FieldDef("m232ccomplem",FieldDef.CHAR,1);
            m232cnjusti = new FieldDef("m232cnjusti",FieldDef.CHAR,13);
            FieldDef array[] = {
                m232cdominio,
                m232cnif,
                m232cejercicio,
                m232cperiodo,
                m232capellidos,
                m232cnombre,
                m232ctipoejer,
                m232cfechaini,
                m232cfechafin,
                m232ccnae,
                m232ccomplem,
                m232cnjusti                
                };
            setColumns(array);
            FieldDef arrayf[] = {m232cdominio,m232cnif,m232cejercicio,m232cperiodo };
            setPrimaryKeys(arrayf);
            m232capellidos.setDescription("Identificacion - Apellidos o Razon Social.");
            m232cnombre.setDescription("Identificacion - Nombre");
            m232ctipoejer.setDescription("Identificacion - Tipo de ejercicio.");
            m232cfechaini.setDescription("Periodo Impositivo - Fecha inicio");
            m232cfechafin.setDescription("Periodo Impositivo - Fecha fin ejercicio");
            m232ccnae.setDescription("Identificacion - C.N.A.E. Incluido en el fichero CNAE.TXT.");
            m232ccomplem.setDescription("Declaracion complementaria");
            m232cnjusti.setDescription("Nº de justificante de la declaracion anterior");
            }
        }
        
    public class TabMod232v extends TableDef
        {
        // campos
        public FieldDef m232vdominio;
        public FieldDef m232vnif;
        public FieldDef m232vejercicio;
        public FieldDef m232vperiodo;
        public FieldDef m232vpagina;
        public FieldDef m232vopvnif1;
        public FieldDef m232vopvfj1;
        public FieldDef m232vopvnom1;
        public FieldDef m232vopvtipvin1;
        public FieldDef m232vopvprov1;
        public FieldDef m232vopvtipope1;
        public FieldDef m232vopvinggas1;
        public FieldDef m232vopvmetodo1;
        public FieldDef m232vopvimport1;
        public FieldDef m232vopvnif2;
        public FieldDef m232vopvfj2;
        public FieldDef m232vopvnom2;
        public FieldDef m232vopvtipvin2;
        public FieldDef m232vopvprov2;
        public FieldDef m232vopvtipope2;
        public FieldDef m232vopvinggas2;
        public FieldDef m232vopvmetodo2;
        public FieldDef m232vopvimport2;
        public FieldDef m232vopvnif3;
        public FieldDef m232vopvfj3;
        public FieldDef m232vopvnom3;
        public FieldDef m232vopvtipvin3;
        public FieldDef m232vopvprov3;
        public FieldDef m232vopvtipope3;
        public FieldDef m232vopvinggas3;
        public FieldDef m232vopvmetodo3;
        public FieldDef m232vopvimport3;
        public FieldDef m232vopvnif4;
        public FieldDef m232vopvfj4;
        public FieldDef m232vopvnom4;
        public FieldDef m232vopvtipvin4;
        public FieldDef m232vopvprov4;
        public FieldDef m232vopvtipope4;
        public FieldDef m232vopvinggas4;
        public FieldDef m232vopvmetodo4;
        public FieldDef m232vopvimport4;
        public FieldDef m232vopvnif5;
        public FieldDef m232vopvfj5;
        public FieldDef m232vopvnom5;
        public FieldDef m232vopvtipvin5;
        public FieldDef m232vopvprov5;
        public FieldDef m232vopvtipope5;
        public FieldDef m232vopvinggas5;
        public FieldDef m232vopvmetodo5;
        public FieldDef m232vopvimport5;
        public FieldDef m232vovrnidmat;
        public FieldDef m232vovrrazmat;
        public FieldDef m232vovrnif1;
        public FieldDef m232vovrfisjur1;
        public FieldDef m232vovrnombre1;
        public FieldDef m232vovrpais1;
        public FieldDef m232vovrtipov1;
        public FieldDef m232vovrimport1;
        public FieldDef m232vovrnif2;
        public FieldDef m232vovrfisjur2;
        public FieldDef m232vovrnombre2;
        public FieldDef m232vovrpais2;
        public FieldDef m232vovrtipov2;
        public FieldDef m232vovrimport2;
        public FieldDef m232vovrnif3;
        public FieldDef m232vovrfisjur3;
        public FieldDef m232vovrnombre3;
        public FieldDef m232vovrpais3;
        public FieldDef m232vovrtipov3;
        public FieldDef m232vovrimport3;
        public TabMod232v(String name)
            {
            super(name);
            m232vdominio = new FieldDef("m232vdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m232vnif = new FieldDef("m232vnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m232vejercicio = new FieldDef("m232vejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m232vperiodo = new FieldDef("m232vperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m232vpagina = new FieldDef("m232vpagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m232vopvnif1 = new FieldDef("m232vopvnif1",FieldDef.CHAR,15);
            m232vopvfj1 = new FieldDef("m232vopvfj1",FieldDef.CHAR,1);
            m232vopvnom1 = new FieldDef("m232vopvnom1",FieldDef.CHAR,60);
            m232vopvtipvin1 = new FieldDef("m232vopvtipvin1",FieldDef.CHAR,1);
            m232vopvprov1 = new FieldDef("m232vopvprov1",FieldDef.CHAR,2);
            m232vopvtipope1 = new FieldDef("m232vopvtipope1",FieldDef.CHAR,2);
            m232vopvinggas1 = new FieldDef("m232vopvinggas1",FieldDef.CHAR,1);
            m232vopvmetodo1 = new FieldDef("m232vopvmetodo1",FieldDef.CHAR,2);
            m232vopvimport1 = new FieldDef("m232vopvimport1",FieldDef.FLOAT,6,0);
            m232vopvnif2 = new FieldDef("m232vopvnif2",FieldDef.CHAR,15);
            m232vopvfj2 = new FieldDef("m232vopvfj2",FieldDef.CHAR,1);
            m232vopvnom2 = new FieldDef("m232vopvnom2",FieldDef.CHAR,60);
            m232vopvtipvin2 = new FieldDef("m232vopvtipvin2",FieldDef.CHAR,1);
            m232vopvprov2 = new FieldDef("m232vopvprov2",FieldDef.CHAR,2);
            m232vopvtipope2 = new FieldDef("m232vopvtipope2",FieldDef.CHAR,2);
            m232vopvinggas2 = new FieldDef("m232vopvinggas2",FieldDef.CHAR,1);
            m232vopvmetodo2 = new FieldDef("m232vopvmetodo2",FieldDef.CHAR,2);
            m232vopvimport2 = new FieldDef("m232vopvimport2",FieldDef.FLOAT,6,0);
            m232vopvnif3 = new FieldDef("m232vopvnif3",FieldDef.CHAR,15);
            m232vopvfj3 = new FieldDef("m232vopvfj3",FieldDef.CHAR,1);
            m232vopvnom3 = new FieldDef("m232vopvnom3",FieldDef.CHAR,60);
            m232vopvtipvin3 = new FieldDef("m232vopvtipvin3",FieldDef.CHAR,1);
            m232vopvprov3 = new FieldDef("m232vopvprov3",FieldDef.CHAR,2);
            m232vopvtipope3 = new FieldDef("m232vopvtipope3",FieldDef.CHAR,2);
            m232vopvinggas3 = new FieldDef("m232vopvinggas3",FieldDef.CHAR,1);
            m232vopvmetodo3 = new FieldDef("m232vopvmetodo3",FieldDef.CHAR,2);
            m232vopvimport3 = new FieldDef("m232vopvimport3",FieldDef.FLOAT,6,0);
            m232vopvnif4 = new FieldDef("m232vopvnif4",FieldDef.CHAR,15);
            m232vopvfj4 = new FieldDef("m232vopvfj4",FieldDef.CHAR,1);
            m232vopvnom4 = new FieldDef("m232vopvnom4",FieldDef.CHAR,60);
            m232vopvtipvin4 = new FieldDef("m232vopvtipvin4",FieldDef.CHAR,1);
            m232vopvprov4 = new FieldDef("m232vopvprov4",FieldDef.CHAR,2);
            m232vopvtipope4 = new FieldDef("m232vopvtipope4",FieldDef.CHAR,2);
            m232vopvinggas4 = new FieldDef("m232vopvinggas4",FieldDef.CHAR,1);
            m232vopvmetodo4 = new FieldDef("m232vopvmetodo4",FieldDef.CHAR,2);
            m232vopvimport4 = new FieldDef("m232vopvimport4",FieldDef.FLOAT,6,0);
            m232vopvnif5 = new FieldDef("m232vopvnif5",FieldDef.CHAR,15);
            m232vopvfj5 = new FieldDef("m232vopvfj5",FieldDef.CHAR,1);
            m232vopvnom5 = new FieldDef("m232vopvnom5",FieldDef.CHAR,60);
            m232vopvtipvin5 = new FieldDef("m232vopvtipvin5",FieldDef.CHAR,1);
            m232vopvprov5 = new FieldDef("m232vopvprov5",FieldDef.CHAR,2);
            m232vopvtipope5 = new FieldDef("m232vopvtipope5",FieldDef.CHAR,2);
            m232vopvinggas5 = new FieldDef("m232vopvinggas5",FieldDef.CHAR,1);
            m232vopvmetodo5 = new FieldDef("m232vopvmetodo5",FieldDef.CHAR,2);
            m232vopvimport5 = new FieldDef("m232vopvimport5",FieldDef.FLOAT,6,0);
            m232vovrnidmat = new FieldDef("m232vovrnidmat",FieldDef.CHAR,15);
            m232vovrrazmat = new FieldDef("m232vovrrazmat",FieldDef.CHAR,60);
            m232vovrnif1 = new FieldDef("m232vovrnif1",FieldDef.CHAR,15);
            m232vovrfisjur1 = new FieldDef("m232vovrfisjur1",FieldDef.CHAR,1);
            m232vovrnombre1 = new FieldDef("m232vovrnombre1",FieldDef.CHAR,60);
            m232vovrpais1 = new FieldDef("m232vovrpais1",FieldDef.CHAR,2);
            m232vovrtipov1 = new FieldDef("m232vovrtipov1",FieldDef.CHAR,1);
            m232vovrimport1 = new FieldDef("m232vovrimport1",FieldDef.FLOAT,6,0);
            m232vovrnif2 = new FieldDef("m232vovrnif2",FieldDef.CHAR,15);
            m232vovrfisjur2 = new FieldDef("m232vovrfisjur2",FieldDef.CHAR,1);
            m232vovrnombre2 = new FieldDef("m232vovrnombre2",FieldDef.CHAR,60);
            m232vovrpais2 = new FieldDef("m232vovrpais2",FieldDef.CHAR,2);
            m232vovrtipov2 = new FieldDef("m232vovrtipov2",FieldDef.CHAR,1);
            m232vovrimport2 = new FieldDef("m232vovrimport2",FieldDef.FLOAT,6,0);
            m232vovrnif3 = new FieldDef("m232vovrnif3",FieldDef.CHAR,15);
            m232vovrfisjur3 = new FieldDef("m232vovrfisjur3",FieldDef.CHAR,1);
            m232vovrnombre3 = new FieldDef("m232vovrnombre3",FieldDef.CHAR,60);
            m232vovrpais3 = new FieldDef("m232vovrpais3",FieldDef.CHAR,2);
            m232vovrtipov3 = new FieldDef("m232vovrtipov3",FieldDef.CHAR,1);
            m232vovrimport3 = new FieldDef("m232vovrimport3",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m232vdominio,
                m232vnif,
                m232vejercicio,
                m232vperiodo,
                m232vpagina,
                m232vopvnif1,
                m232vopvfj1,
                m232vopvnom1,
                m232vopvtipvin1,
                m232vopvprov1,
                m232vopvtipope1,
                m232vopvinggas1,
                m232vopvmetodo1,
                m232vopvimport1,
                m232vopvnif2,
                m232vopvfj2,
                m232vopvnom2,
                m232vopvtipvin2,
                m232vopvprov2,
                m232vopvtipope2,
                m232vopvinggas2,
                m232vopvmetodo2,
                m232vopvimport2,
                m232vopvnif3,
                m232vopvfj3,
                m232vopvnom3,
                m232vopvtipvin3,
                m232vopvprov3,
                m232vopvtipope3,
                m232vopvinggas3,
                m232vopvmetodo3,
                m232vopvimport3,
                m232vopvnif4,
                m232vopvfj4,
                m232vopvnom4,
                m232vopvtipvin4,
                m232vopvprov4,
                m232vopvtipope4,
                m232vopvinggas4,
                m232vopvmetodo4,
                m232vopvimport4,
                m232vopvnif5,
                m232vopvfj5,
                m232vopvnom5,
                m232vopvtipvin5,
                m232vopvprov5,
                m232vopvtipope5,
                m232vopvinggas5,
                m232vopvmetodo5,
                m232vopvimport5,
                m232vovrnidmat,
                m232vovrrazmat,
                m232vovrnif1,
                m232vovrfisjur1,
                m232vovrnombre1,
                m232vovrpais1,
                m232vovrtipov1,
                m232vovrimport1,
                m232vovrnif2,
                m232vovrfisjur2,
                m232vovrnombre2,
                m232vovrpais2,
                m232vovrtipov2,
                m232vovrimport2,
                m232vovrnif3,
                m232vovrfisjur3,
                m232vovrnombre3,
                m232vovrpais3,
                m232vovrtipov3,
                m232vovrimport3                
                };
            setColumns(array);
            FieldDef arrayf[] = {m232vdominio,m232vnif,m232vejercicio,m232vperiodo,m232vpagina };
            setPrimaryKeys(arrayf);
            m232vopvnif1.setDescription("operaciones personas o entidades vinculadas 1 - NIF Persona o entidad vinculada");
            m232vopvfj1.setDescription("operaciones personas o entidades vinculadas 1 - F/J/O");
            m232vopvnom1.setDescription("operaciones personas o entidades vinculadas 1 - Apellidos y nombre o Razón social");
            m232vopvtipvin1.setDescription("operaciones personas o entidades vinculadas 1 - Tipo Vinculación");
            m232vopvprov1.setDescription("operaciones personas o entidades vinculadas 1 - Código Provincia / País");
            m232vopvtipope1.setDescription("operaciones personas o entidades vinculadas 1 - Tipo Operación");
            m232vopvinggas1.setDescription("operaciones personas o entidades vinculadas 1 - Ingreso / Pago");
            m232vopvmetodo1.setDescription("operaciones personas o entidades vinculadas 1 - Método Valoración");
            m232vopvimport1.setDescription("operaciones personas o entidades vinculadas 1 - Importe Operación");
            m232vopvnif2.setDescription("operaciones personas o entidades vinculadas 2 - NIF Persona o entidad vinculada");
            m232vopvfj2.setDescription("operaciones personas o entidades vinculadas 2 - F/J/O");
            m232vopvnom2.setDescription("operaciones personas o entidades vinculadas 2 - Apellidos y nombre o Razón social");
            m232vopvtipvin2.setDescription("operaciones personas o entidades vinculadas 2 - Tipo Vinculación");
            m232vopvprov2.setDescription("operaciones personas o entidades vinculadas 2 - Código Provincia / País");
            m232vopvtipope2.setDescription("operaciones personas o entidades vinculadas 2 - Tipo Operación");
            m232vopvinggas2.setDescription("operaciones personas o entidades vinculadas 2 - Ingreso / Pago");
            m232vopvmetodo2.setDescription("operaciones personas o entidades vinculadas 2 - Método Valoración");
            m232vopvimport2.setDescription("operaciones personas o entidades vinculadas 2 - Importe Operación");
            m232vopvnif3.setDescription("operaciones personas o entidades vinculadas 3 - NIF Persona o entidad vinculada");
            m232vopvfj3.setDescription("operaciones personas o entidades vinculadas 3 - F/J/O");
            m232vopvnom3.setDescription("operaciones personas o entidades vinculadas 3 - Apellidos y nombre o Razón social");
            m232vopvtipvin3.setDescription("operaciones personas o entidades vinculadas 3 - Tipo Vinculación");
            m232vopvprov3.setDescription("operaciones personas o entidades vinculadas 3 - Código Provincia / País");
            m232vopvtipope3.setDescription("operaciones personas o entidades vinculadas 3 - Tipo Operación");
            m232vopvinggas3.setDescription("operaciones personas o entidades vinculadas 3 - Ingreso / Pago");
            m232vopvmetodo3.setDescription("operaciones personas o entidades vinculadas 3 - Método Valoración");
            m232vopvimport3.setDescription("operaciones personas o entidades vinculadas 3 - Importe Operación");
            m232vopvnif4.setDescription("operaciones personas o entidades vinculadas 4 - NIF Persona o entidad vinculada");
            m232vopvfj4.setDescription("operaciones personas o entidades vinculadas 4 - F/J/O");
            m232vopvnom4.setDescription("operaciones personas o entidades vinculadas 4 - Apellidos y nombre o Razón social");
            m232vopvtipvin4.setDescription("operaciones personas o entidades vinculadas 4 - Tipo Vinculación");
            m232vopvprov4.setDescription("operaciones personas o entidades vinculadas 4 - Código Provincia / País");
            m232vopvtipope4.setDescription("operaciones personas o entidades vinculadas 4 - Tipo Operación");
            m232vopvinggas4.setDescription("operaciones personas o entidades vinculadas 4 - Ingreso / Pago");
            m232vopvmetodo4.setDescription("operaciones personas o entidades vinculadas 4 - Método Valoración");
            m232vopvimport4.setDescription("operaciones personas o entidades vinculadas 4 - Importe Operación");
            m232vopvnif5.setDescription("operaciones personas o entidades vinculadas 5 - NIF Persona o entidad vinculada");
            m232vopvfj5.setDescription("operaciones personas o entidades vinculadas 5 - F/J/O");
            m232vopvnom5.setDescription("operaciones personas o entidades vinculadas 5 - Apellidos y nombre o Razón social");
            m232vopvtipvin5.setDescription("operaciones personas o entidades vinculadas 5 - Tipo Vinculación");
            m232vopvprov5.setDescription("operaciones personas o entidades vinculadas 5 - Código Provincia / País");
            m232vopvtipope5.setDescription("operaciones personas o entidades vinculadas 5 - Tipo Operación");
            m232vopvinggas5.setDescription("operaciones personas o entidades vinculadas 5 - Ingreso / Pago");
            m232vopvmetodo5.setDescription("operaciones personas o entidades vinculadas 5 - Método Valoración");
            m232vopvimport5.setDescription("operaciones personas o entidades vinculadas 5 - Importe Operación");
            m232vovrnidmat.setDescription("Persona o entidad vinculada reduccion rentas. N identificación matriz");
            m232vovrrazmat.setDescription("Persona o entidad vinculada reduccion rentas. Razón social (matriz)");
            m232vovrnif1.setDescription("Persona o entidad vinculada reduccion rentas 1. NIF");
            m232vovrfisjur1.setDescription("Persona o entidad vinculada reduccion rentas 1. F/J/O");
            m232vovrnombre1.setDescription("Persona o entidad vinculada reduccion rentas 1. Apellidos y nombre");
            m232vovrpais1.setDescription("Persona o entidad vinculada reduccion rentas 1. Codigo provincia/pais");
            m232vovrtipov1.setDescription("Persona o entidad vinculada reduccion rentas 1. Tipo vinculacion");
            m232vovrimport1.setDescription("Persona o entidad vinculada reduccion rentas 1. Importe operacion");
            m232vovrnif2.setDescription("Persona o entidad vinculada reduccion rentas 2. NIF");
            m232vovrfisjur2.setDescription("Persona o entidad vinculada reduccion rentas 2. F/J");
            m232vovrnombre2.setDescription("Persona o entidad vinculada reduccion rentas 2. Apellidos y nombre");
            m232vovrpais2.setDescription("Persona o entidad vinculada reduccion rentas 2. Codigo provincia/pais");
            m232vovrtipov2.setDescription("Persona o entidad vinculada reduccion rentas 2. Tipo vinculacion");
            m232vovrimport2.setDescription("Persona o entidad vinculada reduccion rentas 2. Importe operacion");
            m232vovrnif3.setDescription("Persona o entidad vinculada reduccion rentas 3. NIF");
            m232vovrfisjur3.setDescription("Persona o entidad vinculada reduccion rentas 3. F/J");
            m232vovrnombre3.setDescription("Persona o entidad vinculada reduccion rentas 3. Apellidos y nombre");
            m232vovrpais3.setDescription("Persona o entidad vinculada reduccion rentas 3. Codigo provincia/pais");
            m232vovrtipov3.setDescription("Persona o entidad vinculada reduccion rentas 3. Tipo vinculacion");
            m232vovrimport3.setDescription("Persona o entidad vinculada reduccion rentas 3. Importe operacion");
            }
        }
        
    public class TabMod232p extends TableDef
        {
        // campos
        public FieldDef m232pdominio;
        public FieldDef m232pnif;
        public FieldDef m232pejercicio;
        public FieldDef m232pperiodo;
        public FieldDef m232ppagina;
        public FieldDef m232pofoperac1;
        public FieldDef m232pofperson1;
        public FieldDef m232poffisjur1;
        public FieldDef m232pofclave1;
        public FieldDef m232pofimport1;
        public FieldDef m232pofoperac2;
        public FieldDef m232pofperson2;
        public FieldDef m232poffisjur2;
        public FieldDef m232pofclave2;
        public FieldDef m232pofimport2;
        public FieldDef m232pofoperac3;
        public FieldDef m232pofperson3;
        public FieldDef m232poffisjur3;
        public FieldDef m232pofclave3;
        public FieldDef m232pofimport3;
        public FieldDef m232pofoperac4;
        public FieldDef m232pofperson4;
        public FieldDef m232poffisjur4;
        public FieldDef m232pofclave4;
        public FieldDef m232pofimport4;
        public FieldDef m232pofoperac5;
        public FieldDef m232pofperson5;
        public FieldDef m232poffisjur5;
        public FieldDef m232pofclave5;
        public FieldDef m232pofimport5;
        public FieldDef m232pofoperac6;
        public FieldDef m232pofperson6;
        public FieldDef m232poffisjur6;
        public FieldDef m232pofclave6;
        public FieldDef m232pofimport6;
        public FieldDef m232pofoperac7;
        public FieldDef m232pofperson7;
        public FieldDef m232poffisjur7;
        public FieldDef m232pofclave7;
        public FieldDef m232pofimport7;
        public FieldDef m232pofoperac8;
        public FieldDef m232pofperson8;
        public FieldDef m232poffisjur8;
        public FieldDef m232pofclave8;
        public FieldDef m232pofimport8;
        public FieldDef m232pofoperac9;
        public FieldDef m232pofperson9;
        public FieldDef m232poffisjur9;
        public FieldDef m232pofclave9;
        public FieldDef m232pofimport9;
        public FieldDef m232pofoperac10;
        public FieldDef m232pofperson10;
        public FieldDef m232poffisjur10;
        public FieldDef m232pofclave10;
        public FieldDef m232pofimport10;
        public FieldDef m232pofoperac11;
        public FieldDef m232pofperson11;
        public FieldDef m232poffisjur11;
        public FieldDef m232pofclave11;
        public FieldDef m232pofimport11;
        public FieldDef m232pofoperac12;
        public FieldDef m232pofperson12;
        public FieldDef m232poffisjur12;
        public FieldDef m232pofclave12;
        public FieldDef m232pofimport12;
        public FieldDef m232ptftipo1;
        public FieldDef m232ptfentida1;
        public FieldDef m232ptfclpais1;
        public FieldDef m232ptfvalor1;
        public FieldDef m232ptfpparti1;
        public FieldDef m232ptftipo2;
        public FieldDef m232ptfentida2;
        public FieldDef m232ptfclpais2;
        public FieldDef m232ptfvalor2;
        public FieldDef m232ptfpparti2;
        public FieldDef m232ptftipo3;
        public FieldDef m232ptfentida3;
        public FieldDef m232ptfclpais3;
        public FieldDef m232ptfvalor3;
        public FieldDef m232ptfpparti3;
        public FieldDef m232ptftipo4;
        public FieldDef m232ptfentida4;
        public FieldDef m232ptfclpais4;
        public FieldDef m232ptfvalor4;
        public FieldDef m232ptfpparti4;
        public FieldDef m232ptftipo5;
        public FieldDef m232ptfentida5;
        public FieldDef m232ptfclpais5;
        public FieldDef m232ptfvalor5;
        public FieldDef m232ptfpparti5;
        public FieldDef m232ptftipo6;
        public FieldDef m232ptfentida6;
        public FieldDef m232ptfclpais6;
        public FieldDef m232ptfvalor6;
        public FieldDef m232ptfpparti6;
        public FieldDef m232ptftipo7;
        public FieldDef m232ptfentida7;
        public FieldDef m232ptfclpais7;
        public FieldDef m232ptfvalor7;
        public FieldDef m232ptfpparti7;
        public FieldDef m232ptftipo8;
        public FieldDef m232ptfentida8;
        public FieldDef m232ptfclpais8;
        public FieldDef m232ptfvalor8;
        public FieldDef m232ptfpparti8;
        public FieldDef m232ptftipo9;
        public FieldDef m232ptfentida9;
        public FieldDef m232ptfclpais9;
        public FieldDef m232ptfvalor9;
        public FieldDef m232ptfpparti9;
        public FieldDef m232ptftipo10;
        public FieldDef m232ptfentida10;
        public FieldDef m232ptfclpais10;
        public FieldDef m232ptfvalor10;
        public FieldDef m232ptfpparti10;
        public FieldDef m232ptftipo11;
        public FieldDef m232ptfentida11;
        public FieldDef m232ptfclpais11;
        public FieldDef m232ptfvalor11;
        public FieldDef m232ptfpparti11;
        public FieldDef m232ptftipo12;
        public FieldDef m232ptfentida12;
        public FieldDef m232ptfclpais12;
        public FieldDef m232ptfvalor12;
        public FieldDef m232ptfpparti12;
        public TabMod232p(String name)
            {
            super(name);
            m232pdominio = new FieldDef("m232pdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m232pnif = new FieldDef("m232pnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m232pejercicio = new FieldDef("m232pejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m232pperiodo = new FieldDef("m232pperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m232ppagina = new FieldDef("m232ppagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m232pofoperac1 = new FieldDef("m232pofoperac1",FieldDef.CHAR,50);
            m232pofperson1 = new FieldDef("m232pofperson1",FieldDef.CHAR,60);
            m232poffisjur1 = new FieldDef("m232poffisjur1",FieldDef.CHAR,1);
            m232pofclave1 = new FieldDef("m232pofclave1",FieldDef.CHAR,2);
            m232pofimport1 = new FieldDef("m232pofimport1",FieldDef.FLOAT,6,0);
            m232pofoperac2 = new FieldDef("m232pofoperac2",FieldDef.CHAR,50);
            m232pofperson2 = new FieldDef("m232pofperson2",FieldDef.CHAR,60);
            m232poffisjur2 = new FieldDef("m232poffisjur2",FieldDef.CHAR,1);
            m232pofclave2 = new FieldDef("m232pofclave2",FieldDef.CHAR,2);
            m232pofimport2 = new FieldDef("m232pofimport2",FieldDef.FLOAT,6,0);
            m232pofoperac3 = new FieldDef("m232pofoperac3",FieldDef.CHAR,50);
            m232pofperson3 = new FieldDef("m232pofperson3",FieldDef.CHAR,60);
            m232poffisjur3 = new FieldDef("m232poffisjur3",FieldDef.CHAR,1);
            m232pofclave3 = new FieldDef("m232pofclave3",FieldDef.CHAR,2);
            m232pofimport3 = new FieldDef("m232pofimport3",FieldDef.FLOAT,6,0);
            m232pofoperac4 = new FieldDef("m232pofoperac4",FieldDef.CHAR,50);
            m232pofperson4 = new FieldDef("m232pofperson4",FieldDef.CHAR,60);
            m232poffisjur4 = new FieldDef("m232poffisjur4",FieldDef.CHAR,1);
            m232pofclave4 = new FieldDef("m232pofclave4",FieldDef.CHAR,2);
            m232pofimport4 = new FieldDef("m232pofimport4",FieldDef.FLOAT,6,0);
            m232pofoperac5 = new FieldDef("m232pofoperac5",FieldDef.CHAR,50);
            m232pofperson5 = new FieldDef("m232pofperson5",FieldDef.CHAR,60);
            m232poffisjur5 = new FieldDef("m232poffisjur5",FieldDef.CHAR,1);
            m232pofclave5 = new FieldDef("m232pofclave5",FieldDef.CHAR,2);
            m232pofimport5 = new FieldDef("m232pofimport5",FieldDef.FLOAT,6,0);
            m232pofoperac6 = new FieldDef("m232pofoperac6",FieldDef.CHAR,50);
            m232pofperson6 = new FieldDef("m232pofperson6",FieldDef.CHAR,60);
            m232poffisjur6 = new FieldDef("m232poffisjur6",FieldDef.CHAR,1);
            m232pofclave6 = new FieldDef("m232pofclave6",FieldDef.CHAR,2);
            m232pofimport6 = new FieldDef("m232pofimport6",FieldDef.FLOAT,6,0);
            m232pofoperac7 = new FieldDef("m232pofoperac7",FieldDef.CHAR,50);
            m232pofperson7 = new FieldDef("m232pofperson7",FieldDef.CHAR,60);
            m232poffisjur7 = new FieldDef("m232poffisjur7",FieldDef.CHAR,1);
            m232pofclave7 = new FieldDef("m232pofclave7",FieldDef.CHAR,2);
            m232pofimport7 = new FieldDef("m232pofimport7",FieldDef.FLOAT,6,0);
            m232pofoperac8 = new FieldDef("m232pofoperac8",FieldDef.CHAR,50);
            m232pofperson8 = new FieldDef("m232pofperson8",FieldDef.CHAR,60);
            m232poffisjur8 = new FieldDef("m232poffisjur8",FieldDef.CHAR,1);
            m232pofclave8 = new FieldDef("m232pofclave8",FieldDef.CHAR,2);
            m232pofimport8 = new FieldDef("m232pofimport8",FieldDef.FLOAT,6,0);
            m232pofoperac9 = new FieldDef("m232pofoperac9",FieldDef.CHAR,50);
            m232pofperson9 = new FieldDef("m232pofperson9",FieldDef.CHAR,60);
            m232poffisjur9 = new FieldDef("m232poffisjur9",FieldDef.CHAR,1);
            m232pofclave9 = new FieldDef("m232pofclave9",FieldDef.CHAR,2);
            m232pofimport9 = new FieldDef("m232pofimport9",FieldDef.FLOAT,6,0);
            m232pofoperac10 = new FieldDef("m232pofoperac10",FieldDef.CHAR,50);
            m232pofperson10 = new FieldDef("m232pofperson10",FieldDef.CHAR,60);
            m232poffisjur10 = new FieldDef("m232poffisjur10",FieldDef.CHAR,1);
            m232pofclave10 = new FieldDef("m232pofclave10",FieldDef.CHAR,2);
            m232pofimport10 = new FieldDef("m232pofimport10",FieldDef.FLOAT,6,0);
            m232pofoperac11 = new FieldDef("m232pofoperac11",FieldDef.CHAR,50);
            m232pofperson11 = new FieldDef("m232pofperson11",FieldDef.CHAR,60);
            m232poffisjur11 = new FieldDef("m232poffisjur11",FieldDef.CHAR,1);
            m232pofclave11 = new FieldDef("m232pofclave11",FieldDef.CHAR,2);
            m232pofimport11 = new FieldDef("m232pofimport11",FieldDef.FLOAT,6,0);
            m232pofoperac12 = new FieldDef("m232pofoperac12",FieldDef.CHAR,50);
            m232pofperson12 = new FieldDef("m232pofperson12",FieldDef.CHAR,60);
            m232poffisjur12 = new FieldDef("m232poffisjur12",FieldDef.CHAR,1);
            m232pofclave12 = new FieldDef("m232pofclave12",FieldDef.CHAR,2);
            m232pofimport12 = new FieldDef("m232pofimport12",FieldDef.FLOAT,6,0);
            m232ptftipo1 = new FieldDef("m232ptftipo1",FieldDef.CHAR,1);
            m232ptfentida1 = new FieldDef("m232ptfentida1",FieldDef.CHAR,60);
            m232ptfclpais1 = new FieldDef("m232ptfclpais1",FieldDef.CHAR,2);
            m232ptfvalor1 = new FieldDef("m232ptfvalor1",FieldDef.FLOAT,6,0);
            m232ptfpparti1 = new FieldDef("m232ptfpparti1",FieldDef.FLOAT,6,0);
            m232ptftipo2 = new FieldDef("m232ptftipo2",FieldDef.CHAR,1);
            m232ptfentida2 = new FieldDef("m232ptfentida2",FieldDef.CHAR,60);
            m232ptfclpais2 = new FieldDef("m232ptfclpais2",FieldDef.CHAR,2);
            m232ptfvalor2 = new FieldDef("m232ptfvalor2",FieldDef.FLOAT,6,0);
            m232ptfpparti2 = new FieldDef("m232ptfpparti2",FieldDef.FLOAT,6,0);
            m232ptftipo3 = new FieldDef("m232ptftipo3",FieldDef.CHAR,1);
            m232ptfentida3 = new FieldDef("m232ptfentida3",FieldDef.CHAR,60);
            m232ptfclpais3 = new FieldDef("m232ptfclpais3",FieldDef.CHAR,2);
            m232ptfvalor3 = new FieldDef("m232ptfvalor3",FieldDef.FLOAT,6,0);
            m232ptfpparti3 = new FieldDef("m232ptfpparti3",FieldDef.FLOAT,6,0);
            m232ptftipo4 = new FieldDef("m232ptftipo4",FieldDef.CHAR,1);
            m232ptfentida4 = new FieldDef("m232ptfentida4",FieldDef.CHAR,60);
            m232ptfclpais4 = new FieldDef("m232ptfclpais4",FieldDef.CHAR,2);
            m232ptfvalor4 = new FieldDef("m232ptfvalor4",FieldDef.FLOAT,6,0);
            m232ptfpparti4 = new FieldDef("m232ptfpparti4",FieldDef.FLOAT,6,0);
            m232ptftipo5 = new FieldDef("m232ptftipo5",FieldDef.CHAR,1);
            m232ptfentida5 = new FieldDef("m232ptfentida5",FieldDef.CHAR,60);
            m232ptfclpais5 = new FieldDef("m232ptfclpais5",FieldDef.CHAR,2);
            m232ptfvalor5 = new FieldDef("m232ptfvalor5",FieldDef.FLOAT,6,0);
            m232ptfpparti5 = new FieldDef("m232ptfpparti5",FieldDef.FLOAT,6,0);
            m232ptftipo6 = new FieldDef("m232ptftipo6",FieldDef.CHAR,1);
            m232ptfentida6 = new FieldDef("m232ptfentida6",FieldDef.CHAR,60);
            m232ptfclpais6 = new FieldDef("m232ptfclpais6",FieldDef.CHAR,2);
            m232ptfvalor6 = new FieldDef("m232ptfvalor6",FieldDef.FLOAT,6,0);
            m232ptfpparti6 = new FieldDef("m232ptfpparti6",FieldDef.FLOAT,6,0);
            m232ptftipo7 = new FieldDef("m232ptftipo7",FieldDef.CHAR,1);
            m232ptfentida7 = new FieldDef("m232ptfentida7",FieldDef.CHAR,60);
            m232ptfclpais7 = new FieldDef("m232ptfclpais7",FieldDef.CHAR,2);
            m232ptfvalor7 = new FieldDef("m232ptfvalor7",FieldDef.FLOAT,6,0);
            m232ptfpparti7 = new FieldDef("m232ptfpparti7",FieldDef.FLOAT,6,0);
            m232ptftipo8 = new FieldDef("m232ptftipo8",FieldDef.CHAR,1);
            m232ptfentida8 = new FieldDef("m232ptfentida8",FieldDef.CHAR,60);
            m232ptfclpais8 = new FieldDef("m232ptfclpais8",FieldDef.CHAR,2);
            m232ptfvalor8 = new FieldDef("m232ptfvalor8",FieldDef.FLOAT,6,0);
            m232ptfpparti8 = new FieldDef("m232ptfpparti8",FieldDef.FLOAT,6,0);
            m232ptftipo9 = new FieldDef("m232ptftipo9",FieldDef.CHAR,1);
            m232ptfentida9 = new FieldDef("m232ptfentida9",FieldDef.CHAR,60);
            m232ptfclpais9 = new FieldDef("m232ptfclpais9",FieldDef.CHAR,2);
            m232ptfvalor9 = new FieldDef("m232ptfvalor9",FieldDef.FLOAT,6,0);
            m232ptfpparti9 = new FieldDef("m232ptfpparti9",FieldDef.FLOAT,6,0);
            m232ptftipo10 = new FieldDef("m232ptftipo10",FieldDef.CHAR,1);
            m232ptfentida10 = new FieldDef("m232ptfentida10",FieldDef.CHAR,60);
            m232ptfclpais10 = new FieldDef("m232ptfclpais10",FieldDef.CHAR,2);
            m232ptfvalor10 = new FieldDef("m232ptfvalor10",FieldDef.FLOAT,6,0);
            m232ptfpparti10 = new FieldDef("m232ptfpparti10",FieldDef.FLOAT,6,0);
            m232ptftipo11 = new FieldDef("m232ptftipo11",FieldDef.CHAR,1);
            m232ptfentida11 = new FieldDef("m232ptfentida11",FieldDef.CHAR,60);
            m232ptfclpais11 = new FieldDef("m232ptfclpais11",FieldDef.CHAR,2);
            m232ptfvalor11 = new FieldDef("m232ptfvalor11",FieldDef.FLOAT,6,0);
            m232ptfpparti11 = new FieldDef("m232ptfpparti11",FieldDef.FLOAT,6,0);
            m232ptftipo12 = new FieldDef("m232ptftipo12",FieldDef.CHAR,1);
            m232ptfentida12 = new FieldDef("m232ptfentida12",FieldDef.CHAR,60);
            m232ptfclpais12 = new FieldDef("m232ptfclpais12",FieldDef.CHAR,2);
            m232ptfvalor12 = new FieldDef("m232ptfvalor12",FieldDef.FLOAT,6,0);
            m232ptfpparti12 = new FieldDef("m232ptfpparti12",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m232pdominio,
                m232pnif,
                m232pejercicio,
                m232pperiodo,
                m232ppagina,
                m232pofoperac1,
                m232pofperson1,
                m232poffisjur1,
                m232pofclave1,
                m232pofimport1,
                m232pofoperac2,
                m232pofperson2,
                m232poffisjur2,
                m232pofclave2,
                m232pofimport2,
                m232pofoperac3,
                m232pofperson3,
                m232poffisjur3,
                m232pofclave3,
                m232pofimport3,
                m232pofoperac4,
                m232pofperson4,
                m232poffisjur4,
                m232pofclave4,
                m232pofimport4,
                m232pofoperac5,
                m232pofperson5,
                m232poffisjur5,
                m232pofclave5,
                m232pofimport5,
                m232pofoperac6,
                m232pofperson6,
                m232poffisjur6,
                m232pofclave6,
                m232pofimport6,
                m232pofoperac7,
                m232pofperson7,
                m232poffisjur7,
                m232pofclave7,
                m232pofimport7,
                m232pofoperac8,
                m232pofperson8,
                m232poffisjur8,
                m232pofclave8,
                m232pofimport8,
                m232pofoperac9,
                m232pofperson9,
                m232poffisjur9,
                m232pofclave9,
                m232pofimport9,
                m232pofoperac10,
                m232pofperson10,
                m232poffisjur10,
                m232pofclave10,
                m232pofimport10,
                m232pofoperac11,
                m232pofperson11,
                m232poffisjur11,
                m232pofclave11,
                m232pofimport11,
                m232pofoperac12,
                m232pofperson12,
                m232poffisjur12,
                m232pofclave12,
                m232pofimport12,
                m232ptftipo1,
                m232ptfentida1,
                m232ptfclpais1,
                m232ptfvalor1,
                m232ptfpparti1,
                m232ptftipo2,
                m232ptfentida2,
                m232ptfclpais2,
                m232ptfvalor2,
                m232ptfpparti2,
                m232ptftipo3,
                m232ptfentida3,
                m232ptfclpais3,
                m232ptfvalor3,
                m232ptfpparti3,
                m232ptftipo4,
                m232ptfentida4,
                m232ptfclpais4,
                m232ptfvalor4,
                m232ptfpparti4,
                m232ptftipo5,
                m232ptfentida5,
                m232ptfclpais5,
                m232ptfvalor5,
                m232ptfpparti5,
                m232ptftipo6,
                m232ptfentida6,
                m232ptfclpais6,
                m232ptfvalor6,
                m232ptfpparti6,
                m232ptftipo7,
                m232ptfentida7,
                m232ptfclpais7,
                m232ptfvalor7,
                m232ptfpparti7,
                m232ptftipo8,
                m232ptfentida8,
                m232ptfclpais8,
                m232ptfvalor8,
                m232ptfpparti8,
                m232ptftipo9,
                m232ptfentida9,
                m232ptfclpais9,
                m232ptfvalor9,
                m232ptfpparti9,
                m232ptftipo10,
                m232ptfentida10,
                m232ptfclpais10,
                m232ptfvalor10,
                m232ptfpparti10,
                m232ptftipo11,
                m232ptfentida11,
                m232ptfclpais11,
                m232ptfvalor11,
                m232ptfpparti11,
                m232ptftipo12,
                m232ptfentida12,
                m232ptfclpais12,
                m232ptfvalor12,
                m232ptfpparti12                
                };
            setColumns(array);
            FieldDef arrayf[] = {m232pdominio,m232pnif,m232pejercicio,m232pperiodo,m232ppagina };
            setPrimaryKeys(arrayf);
            m232pofoperac1.setDescription("Oper. con paraisos fiscales. 1.Descripcion de la operacion");
            m232pofperson1.setDescription("Oper. con paraisos fiscales. 1. Persona o entidad");
            m232poffisjur1.setDescription("Oper. con paraisos fiscales. 1.F/J F - J");
            m232pofclave1.setDescription("Oper. con paraisos fiscales. 1. Clave pais/territorio");
            m232pofimport1.setDescription("Oper. con paraisos fiscales. 1. Importe");
            m232pofoperac2.setDescription("Oper. con paraisos fiscales. 2.Descripcion de la operacion");
            m232pofperson2.setDescription("Oper. con paraisos fiscales. 2. Persona o entidad");
            m232poffisjur2.setDescription("Oper. con paraisos fiscales. 2.F/J F - J");
            m232pofclave2.setDescription("Oper. con paraisos fiscales. 2. Clave pais/territorio");
            m232pofimport2.setDescription("Oper. con paraisos fiscales. 2. Importe");
            m232pofoperac3.setDescription("Oper. con paraisos fiscales. 3.Descripcion de la operacion");
            m232pofperson3.setDescription("Oper. con paraisos fiscales. 3. Persona o entidad");
            m232poffisjur3.setDescription("Oper. con paraisos fiscales. 3.F/J F - J");
            m232pofclave3.setDescription("Oper. con paraisos fiscales. 3. Clave pais/territorio");
            m232pofimport3.setDescription("Oper. con paraisos fiscales. 3. Importe");
            m232pofoperac4.setDescription("Oper. con paraisos fiscales. 4.Descripcion de la operacion");
            m232pofperson4.setDescription("Oper. con paraisos fiscales. 4. Persona o entidad");
            m232poffisjur4.setDescription("Oper. con paraisos fiscales. 4.F/J F - J");
            m232pofclave4.setDescription("Oper. con paraisos fiscales. 4. Clave pais/territorio");
            m232pofimport4.setDescription("Oper. con paraisos fiscales. 4. Importe");
            m232pofoperac5.setDescription("Oper. con paraisos fiscales. 5.Descripcion de la operacion");
            m232pofperson5.setDescription("Oper. con paraisos fiscales. 5. Persona o entidad");
            m232poffisjur5.setDescription("Oper. con paraisos fiscales. 5.F/J F - J");
            m232pofclave5.setDescription("Oper. con paraisos fiscales. 5. Clave pais/territorio");
            m232pofimport5.setDescription("Oper. con paraisos fiscales. 5. Importe");
            m232pofoperac6.setDescription("Oper. con paraisos fiscales. 6.Descripcion de la operacion");
            m232pofperson6.setDescription("Oper. con paraisos fiscales. 6. Persona o entidad");
            m232poffisjur6.setDescription("Oper. con paraisos fiscales. 6.F/J F - J");
            m232pofclave6.setDescription("Oper. con paraisos fiscales. 6. Clave pais/territorio");
            m232pofimport6.setDescription("Oper. con paraisos fiscales. 6. Importe");
            m232pofoperac7.setDescription("Oper. con paraisos fiscales. 7.Descripcion de la operacion");
            m232pofperson7.setDescription("Oper. con paraisos fiscales. 7. Persona o entidad");
            m232poffisjur7.setDescription("Oper. con paraisos fiscales. 7.F/J F - J");
            m232pofclave7.setDescription("Oper. con paraisos fiscales. 7. Clave pais/territorio");
            m232pofimport7.setDescription("Oper. con paraisos fiscales. 7. Importe");
            m232pofoperac8.setDescription("Oper. con paraisos fiscales. 8.Descripcion de la operacion");
            m232pofperson8.setDescription("Oper. con paraisos fiscales. 8. Persona o entidad");
            m232poffisjur8.setDescription("Oper. con paraisos fiscales. 8.F/J F - J");
            m232pofclave8.setDescription("Oper. con paraisos fiscales. 8. Clave pais/territorio");
            m232pofimport8.setDescription("Oper. con paraisos fiscales. 8. Importe");
            m232pofoperac9.setDescription("Oper. con paraisos fiscales. 9.Descripcion de la operacion");
            m232pofperson9.setDescription("Oper. con paraisos fiscales. 9. Persona o entidad");
            m232poffisjur9.setDescription("Oper. con paraisos fiscales. 9.F/J F - J");
            m232pofclave9.setDescription("Oper. con paraisos fiscales. 9. Clave pais/territorio");
            m232pofimport9.setDescription("Oper. con paraisos fiscales. 9. Importe");
            m232pofoperac10.setDescription("Oper. con paraisos fiscales. 10.Descripcion de la operacion");
            m232pofperson10.setDescription("Oper. con paraisos fiscales. 10. Persona o entidad");
            m232poffisjur10.setDescription("Oper. con paraisos fiscales. 10.F/J F - J");
            m232pofclave10.setDescription("Oper. con paraisos fiscales. 10. Clave pais/territorio");
            m232pofimport10.setDescription("Oper. con paraisos fiscales. 10. Importe");
            m232pofoperac11.setDescription("Oper. con paraisos fiscales. 11 .Descripcion de la operacion");
            m232pofperson11.setDescription("Oper. con paraisos fiscales. 11. Persona o entidad");
            m232poffisjur11.setDescription("Oper. con paraisos fiscales. 11.F/J F - J");
            m232pofclave11.setDescription("Oper. con paraisos fiscales. 11. Clave pais/territorio");
            m232pofimport11.setDescription("Oper. con paraisos fiscales. 11. Importe");
            m232pofoperac12.setDescription("Oper. con paraisos fiscales. 12.Descripcion de la operacion");
            m232pofperson12.setDescription("Oper. con paraisos fiscales. 12. Persona o entidad");
            m232poffisjur12.setDescription("Oper. con paraisos fiscales. 12.F/J F - J");
            m232pofclave12.setDescription("Oper. con paraisos fiscales. 12. Clave pais/territorio");
            m232pofimport12.setDescription("Oper. con paraisos fiscales. 12. Importe");
            m232ptftipo1.setDescription("Tenencia valores con paraisos fiscales. 1. Tipo A - B - C");
            m232ptfentida1.setDescription("Tenencia valores con paraisos fiscales. 1. Entidad participada");
            m232ptfclpais1.setDescription("Tenencia valores con paraisos fiscales. 1. Clave pais/territorio");
            m232ptfvalor1.setDescription("Tenencia valores con paraisos fiscales. 1. Valor adquisicion");
            m232ptfpparti1.setDescription("Tenencia valores con paraisos fiscales. 1. % participacion");
            m232ptftipo2.setDescription("Tenencia valores con paraisos fiscales. 2. Tipo A - B - C");
            m232ptfentida2.setDescription("Tenencia valores con paraisos fiscales. 2. Entidad participada");
            m232ptfclpais2.setDescription("Tenencia valores con paraisos fiscales. 2. Clave pais/territorio");
            m232ptfvalor2.setDescription("Tenencia valores con paraisos fiscales. 2. Valor adquisicion");
            m232ptfpparti2.setDescription("Tenencia valores con paraisos fiscales. 2. % participacion");
            m232ptftipo3.setDescription("Tenencia valores con paraisos fiscales. 3. Tipo A - B - C");
            m232ptfentida3.setDescription("Tenencia valores con paraisos fiscales. 3. Entidad participada");
            m232ptfclpais3.setDescription("Tenencia valores con paraisos fiscales. 3. Clave pais/territorio");
            m232ptfvalor3.setDescription("Tenencia valores con paraisos fiscales. 3. Valor adquisicion");
            m232ptfpparti3.setDescription("Tenencia valores con paraisos fiscales. 3. % participacion");
            m232ptftipo4.setDescription("Tenencia valores con paraisos fiscales. 4. Tipo A - B - C");
            m232ptfentida4.setDescription("Tenencia valores con paraisos fiscales. 4. Entidad participada");
            m232ptfclpais4.setDescription("Tenencia valores con paraisos fiscales. 4. Clave pais/territorio");
            m232ptfvalor4.setDescription("Tenencia valores con paraisos fiscales. 4. Valor adquisicion");
            m232ptfpparti4.setDescription("Tenencia valores con paraisos fiscales. 4. % participacion");
            m232ptftipo5.setDescription("Tenencia valores con paraisos fiscales. 5. Tipo A - B - C");
            m232ptfentida5.setDescription("Tenencia valores con paraisos fiscales. 5. Entidad participada");
            m232ptfclpais5.setDescription("Tenencia valores con paraisos fiscales. 5. Clave pais/territorio");
            m232ptfvalor5.setDescription("Tenencia valores con paraisos fiscales. 5. Valor adquisicion");
            m232ptfpparti5.setDescription("Tenencia valores con paraisos fiscales. 5. % participacion");
            m232ptftipo6.setDescription("Tenencia valores con paraisos fiscales. 6. Tipo A - B - C");
            m232ptfentida6.setDescription("Tenencia valores con paraisos fiscales. 6. Entidad participada");
            m232ptfclpais6.setDescription("Tenencia valores con paraisos fiscales. 6. Clave pais/territorio");
            m232ptfvalor6.setDescription("Tenencia valores con paraisos fiscales. 6. Valor adquisicion");
            m232ptfpparti6.setDescription("Tenencia valores con paraisos fiscales. 6. % participacion");
            m232ptftipo7.setDescription("Tenencia valores con paraisos fiscales. 7. Tipo A - B - C");
            m232ptfentida7.setDescription("Tenencia valores con paraisos fiscales. 7. Entidad participada");
            m232ptfclpais7.setDescription("Tenencia valores con paraisos fiscales. 7. Clave pais/territorio");
            m232ptfvalor7.setDescription("Tenencia valores con paraisos fiscales. 7. Valor adquisicion");
            m232ptfpparti7.setDescription("Tenencia valores con paraisos fiscales. 7. % participacion");
            m232ptftipo8.setDescription("Tenencia valores con paraisos fiscales. 8. Tipo A - B - C");
            m232ptfentida8.setDescription("Tenencia valores con paraisos fiscales. 8. Entidad participada");
            m232ptfclpais8.setDescription("Tenencia valores con paraisos fiscales. 8. Clave pais/territorio");
            m232ptfvalor8.setDescription("Tenencia valores con paraisos fiscales. 8. Valor adquisicion");
            m232ptfpparti8.setDescription("Tenencia valores con paraisos fiscales. 8. % participacion");
            m232ptftipo9.setDescription("Tenencia valores con paraisos fiscales. 9. Tipo A - B - C");
            m232ptfentida9.setDescription("Tenencia valores con paraisos fiscales. 9. Entidad participada");
            m232ptfclpais9.setDescription("Tenencia valores con paraisos fiscales. 9. Clave pais/territorio");
            m232ptfvalor9.setDescription("Tenencia valores con paraisos fiscales. 9. Valor adquisicion");
            m232ptfpparti9.setDescription("Tenencia valores con paraisos fiscales. 9. % participacion");
            m232ptftipo10.setDescription("Tenencia valores con paraisos fiscales. 10. Tipo A - B - C");
            m232ptfentida10.setDescription("Tenencia valores con paraisos fiscales. 10. Entidad participada");
            m232ptfclpais10.setDescription("Tenencia valores con paraisos fiscales. 10. Clave pais/territorio");
            m232ptfvalor10.setDescription("Tenencia valores con paraisos fiscales. 10. Valor adquisicion");
            m232ptfpparti10.setDescription("Tenencia valores con paraisos fiscales. 10. % participacion");
            m232ptftipo11.setDescription("Tenencia valores con paraisos fiscales. 11. Tipo A - B - C");
            m232ptfentida11.setDescription("Tenencia valores con paraisos fiscales. 11. Entidad participada");
            m232ptfclpais11.setDescription("Tenencia valores con paraisos fiscales. 11. Clave pais/territorio");
            m232ptfvalor11.setDescription("Tenencia valores con paraisos fiscales. 11. Valor adquisicion");
            m232ptfpparti11.setDescription("Tenencia valores con paraisos fiscales. 11. % participacion");
            m232ptftipo12.setDescription("Tenencia valores con paraisos fiscales. 12. Tipo A - B - C");
            m232ptfentida12.setDescription("Tenencia valores con paraisos fiscales. 12. Entidad participada");
            m232ptfclpais12.setDescription("Tenencia valores con paraisos fiscales. 12. Clave pais/territorio");
            m232ptfvalor12.setDescription("Tenencia valores con paraisos fiscales. 12. Valor adquisicion");
            m232ptfpparti12.setDescription("Tenencia valores con paraisos fiscales. 12. % participacion");
            }
        }
        
    public class TabMod182c extends TableDef
        {
        // campos
        public FieldDef m182cdominio;
        public FieldDef m182cnif;
        public FieldDef m182cejercicio;
        public FieldDef m182cperiodo;
        public FieldDef m182cuser;
        public FieldDef m182cfecha;
        public FieldDef m182ctiposop;
        public FieldDef m182crazon;
        public FieldDef m182cnombre;
        public FieldDef m182ctelef;
        public FieldDef m182cnjustif;
        public FieldDef m182csusti;
        public FieldDef m182cndecant;
        public FieldDef m182cnumdec;
        public FieldDef m182cimpdec;
        public FieldDef m182cnatural;
        public FieldDef m182cnifpatp;
        public FieldDef m182cnompatp;
        public FieldDef m182ccomple;
        public FieldDef m182cfirma;
        public FieldDef m182ccargofirm;
        public TabMod182c(String name)
            {
            super(name);
            m182cdominio = new FieldDef("m182cdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m182cnif = new FieldDef("m182cnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m182cejercicio = new FieldDef("m182cejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m182cperiodo = new FieldDef("m182cperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m182cuser = new FieldDef("m182cuser",FieldDef.CHAR,25);
            m182cfecha = new FieldDef("m182cfecha",FieldDef.DATE);
            m182ctiposop = new FieldDef("m182ctiposop",FieldDef.CHAR,1);
            m182crazon = new FieldDef("m182crazon",FieldDef.CHAR,40);
            m182cnombre = new FieldDef("m182cnombre",FieldDef.CHAR,40);
            m182ctelef = new FieldDef("m182ctelef",FieldDef.CHAR,9);
            m182cnjustif = new FieldDef("m182cnjustif",FieldDef.CHAR,13);
            m182csusti = new FieldDef("m182csusti",FieldDef.CHAR,1);
            m182cndecant = new FieldDef("m182cndecant",FieldDef.CHAR,13);
            m182cnumdec = new FieldDef("m182cnumdec",FieldDef.INTEGER,0);
            m182cimpdec = new FieldDef("m182cimpdec",FieldDef.FLOAT,6,0);
            m182cnatural = new FieldDef("m182cnatural",FieldDef.INTEGER,0);
            m182cnifpatp = new FieldDef("m182cnifpatp",FieldDef.CHAR,15);
            m182cnompatp = new FieldDef("m182cnompatp",FieldDef.CHAR,40);
            m182ccomple = new FieldDef("m182ccomple",FieldDef.CHAR,1);
            m182cfirma = new FieldDef("m182cfirma",FieldDef.CHAR,30);
            m182ccargofirm = new FieldDef("m182ccargofirm",FieldDef.CHAR,25);
            FieldDef array[] = {
                m182cdominio,
                m182cnif,
                m182cejercicio,
                m182cperiodo,
                m182cuser,
                m182cfecha,
                m182ctiposop,
                m182crazon,
                m182cnombre,
                m182ctelef,
                m182cnjustif,
                m182csusti,
                m182cndecant,
                m182cnumdec,
                m182cimpdec,
                m182cnatural,
                m182cnifpatp,
                m182cnompatp,
                m182ccomple,
                m182cfirma,
                m182ccargofirm                
                };
            setColumns(array);
            FieldDef arrayf[] = {m182cdominio,m182cnif,m182cejercicio,m182cperiodo };
            setDescription("Declar.informativa Donaciones recibidas Tipo 1 Registro de declarante");
            setPrimaryKeys(arrayf);
            m182cnif.setDescription("Nif del declarante");
            m182cejercicio.setDescription("Ejercicio");
            m182cperiodo.setDescription("Periodo 01");
            m182cuser.setDescription("Usuario");
            m182ctiposop.setDescription("Tipo soporte: T-telematic C-CD");
            m182crazon.setDescription("Denominacion declarante Entidad");
            m182cnombre.setDescription("Persona con quien relacionarse: Apel1-Apel2-Nombre (separados 1 espacio)");
            m182ctelef.setDescription("Persona con quien relacionarse: Telefono");
            m182cnjustif.setDescription("Numero justificante (numerico 13 posiciones)");
            m182csusti.setDescription("S-sustitutiva");
            m182cndecant.setDescription("Numero identificativo decl.anterior en sustitutiva o ceros");
            m182cnumdec.setDescription("Nro total registros declarados (tipo 2)");
            m182cimpdec.setDescription("Importe total donaciones (suma tipo 2)");
            m182cnatural.setDescription("Naturaleza declarante: 1-Ent.Mecenazgo 2-Fundac.68.3b IRPF 3-Pat.proteg 4-P.politico");
            m182cnifpatp.setDescription("Patrimonio protegido Nif titular (si declarante es administrador)");
            m182cnompatp.setDescription("Patrimonio protegido Nom titular (si declarante es administrador) Apel1-Apel2-Nombre (separados 1 espacio)");
            m182ccomple.setDescription("C-complementaria");
            }
        }
        
    public class TabMod182d extends TableDef
        {
        // campos
        public FieldDef m182dident;
        public FieldDef m182ddominio;
        public FieldDef m182dnif;
        public FieldDef m182dejercicio;
        public FieldDef m182dperiodo;
        public FieldDef m182dnifdec;
        public FieldDef m182dnifrepre;
        public FieldDef m182dnomdec;
        public FieldDef m182dprov;
        public FieldDef m182dclave;
        public FieldDef m182dporcen;
        public FieldDef m182dimporte;
        public FieldDef m182despecie;
        public FieldDef m182dccaa;
        public FieldDef m182dccaapor;
        public FieldDef m182dnaturdec;
        public FieldDef m182drevoca;
        public FieldDef m182drevocaej;
        public FieldDef m182dtipobien;
        public FieldDef m182didenbien;
        public FieldDef m182drecurre;
        public FieldDef m182dliscertif;
        public TabMod182d(String name)
            {
            super(name);
            m182dident = new FieldDef("m182dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m182ddominio = new FieldDef("m182ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m182dnif = new FieldDef("m182dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m182dejercicio = new FieldDef("m182dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m182dperiodo = new FieldDef("m182dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m182dnifdec = new FieldDef("m182dnifdec",FieldDef.CHAR,15);
            m182dnifrepre = new FieldDef("m182dnifrepre",FieldDef.CHAR,15);
            m182dnomdec = new FieldDef("m182dnomdec",FieldDef.CHAR,30);
            m182dprov = new FieldDef("m182dprov",FieldDef.INTEGER,0);
            m182dclave = new FieldDef("m182dclave",FieldDef.CHAR,1);
            m182dporcen = new FieldDef("m182dporcen",FieldDef.FLOAT,6,0);
            m182dimporte = new FieldDef("m182dimporte",FieldDef.FLOAT,6,0);
            m182despecie = new FieldDef("m182despecie",FieldDef.CHAR,1);
            m182dccaa = new FieldDef("m182dccaa",FieldDef.INTEGER,0);
            m182dccaapor = new FieldDef("m182dccaapor",FieldDef.FLOAT,6,0);
            m182dnaturdec = new FieldDef("m182dnaturdec",FieldDef.CHAR,1);
            m182drevoca = new FieldDef("m182drevoca",FieldDef.CHAR,1);
            m182drevocaej = new FieldDef("m182drevocaej",FieldDef.INTEGER,0);
            m182dtipobien = new FieldDef("m182dtipobien",FieldDef.CHAR,1);
            m182didenbien = new FieldDef("m182didenbien",FieldDef.CHAR,20);
            m182drecurre = new FieldDef("m182drecurre",FieldDef.INTEGER,0);
            m182dliscertif = new FieldDef("m182dliscertif",FieldDef.CHAR,1);
            FieldDef array[] = {
                m182dident,
                m182ddominio,
                m182dnif,
                m182dejercicio,
                m182dperiodo,
                m182dnifdec,
                m182dnifrepre,
                m182dnomdec,
                m182dprov,
                m182dclave,
                m182dporcen,
                m182dimporte,
                m182despecie,
                m182dccaa,
                m182dccaapor,
                m182dnaturdec,
                m182drevoca,
                m182drevocaej,
                m182dtipobien,
                m182didenbien,
                m182drecurre,
                m182dliscertif                
                };
            setColumns(array);
            FieldDef arrayf[] = {m182dident };
            setDescription("Declar.informativa Donaciones recibidas Tipo 2 Registro declarados");
            setPrimaryKeys(arrayf);
            m182dident.setAutoIncrementable(true);
            m182dnif.setDescription("Nif del declarante");
            m182dejercicio.setDescription("Ejercicio");
            m182dperiodo.setDescription("Periodo 01");
            m182dnifdec.setDescription("Nif declarado");
            m182dnifrepre.setDescription("Nif representante");
            m182dnomdec.setDescription("Rao social Apellidos-Nombre del declarado");
            m182dprov.setDescription("Codigo provincia 01-50 y 99 no residente");
            m182dclave.setDescription("Clave A a G");
            m182dporcen.setDescription("Porcentaje");
            m182dimporte.setDescription("Importe");
            m182despecie.setDescription("Es donacio en especie (X o blanc)");
            m182dccaa.setDescription("CCAA (Si naturaleza del declarante 1 o 2)");
            m182dccaapor.setDescription("CCAA porcentaje deduc.cuota integra IRPF");
            m182dnaturdec.setDescription("Naturaleza declarado (clave A o B): F-Pfisica, J-juridica E-atrib.rentas");
            m182drevoca.setDescription("Es revocacion (clave A o B)  X o blanc");
            m182drevocaej.setDescription("Ejercicio revocacion");
            m182dtipobien.setDescription("Tipo de bien (clave C o D) I-inmueble V-mobiliario O-otros");
            m182didenbien.setDescription("Identifiacion del bien NRC(inmuebles) ISIN(mobiliario) o blancos");
            m182drecurre.setDescription("Recurrencia donacion misma entidad 1-si o 2-no");
            }
        }
        
    public class TabMod036p9n extends TableDef
        {
        // campos
        public FieldDef m36p9dominio;
        public FieldDef m36p9nif;
        public FieldDef m36p9ejercicio;
        public FieldDef m36p9periodo;
        public FieldDef m36p9pagina;
        public FieldDef m36p920;
        public FieldDef m36p921;
        public FieldDef m36p922;
        public FieldDef m36p923;
        public FieldDef m36p924;
        public FieldDef m36p925;
        public FieldDef m36p926;
        public FieldDef m36p927;
        public FieldDef m36p928;
        public FieldDef m36p929;
        public FieldDef m36p930;
        public FieldDef m36p931;
        public FieldDef m36p932;
        public FieldDef m36p933;
        public FieldDef m36p934;
        public FieldDef m36p935;
        public FieldDef m36p936;
        public FieldDef m36p937;
        public FieldDef m36p938;
        public FieldDef m36p939;
        public FieldDef m36p940;
        public FieldDef m36p941;
        public FieldDef m36p942;
        public FieldDef m36p943;
        public TabMod036p9n(String name)
            {
            super(name);
            m36p9dominio = new FieldDef("m36p9dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p9nif = new FieldDef("m36p9nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p9ejercicio = new FieldDef("m36p9ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p9periodo = new FieldDef("m36p9periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p9pagina = new FieldDef("m36p9pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p920 = new FieldDef("m36p920",FieldDef.CHAR,9);
            m36p921 = new FieldDef("m36p921",FieldDef.CHAR,125);
            m36p922 = new FieldDef("m36p922",FieldDef.FLOAT,0,2);
            m36p923 = new FieldDef("m36p923",FieldDef.FLOAT,0,2);
            m36p924 = new FieldDef("m36p924",FieldDef.CHAR,9);
            m36p925 = new FieldDef("m36p925",FieldDef.CHAR,125);
            m36p926 = new FieldDef("m36p926",FieldDef.FLOAT,0,2);
            m36p927 = new FieldDef("m36p927",FieldDef.FLOAT,0,2);
            m36p928 = new FieldDef("m36p928",FieldDef.CHAR,9);
            m36p929 = new FieldDef("m36p929",FieldDef.CHAR,125);
            m36p930 = new FieldDef("m36p930",FieldDef.FLOAT,0,2);
            m36p931 = new FieldDef("m36p931",FieldDef.FLOAT,0,2);
            m36p932 = new FieldDef("m36p932",FieldDef.CHAR,9);
            m36p933 = new FieldDef("m36p933",FieldDef.CHAR,125);
            m36p934 = new FieldDef("m36p934",FieldDef.FLOAT,0,2);
            m36p935 = new FieldDef("m36p935",FieldDef.FLOAT,0,2);
            m36p936 = new FieldDef("m36p936",FieldDef.CHAR,9);
            m36p937 = new FieldDef("m36p937",FieldDef.CHAR,125);
            m36p938 = new FieldDef("m36p938",FieldDef.FLOAT,0,2);
            m36p939 = new FieldDef("m36p939",FieldDef.FLOAT,0,2);
            m36p940 = new FieldDef("m36p940",FieldDef.CHAR,9);
            m36p941 = new FieldDef("m36p941",FieldDef.CHAR,125);
            m36p942 = new FieldDef("m36p942",FieldDef.FLOAT,0,2);
            m36p943 = new FieldDef("m36p943",FieldDef.FLOAT,0,2);
            FieldDef array[] = {
                m36p9dominio,
                m36p9nif,
                m36p9ejercicio,
                m36p9periodo,
                m36p9pagina,
                m36p920,
                m36p921,
                m36p922,
                m36p923,
                m36p924,
                m36p925,
                m36p926,
                m36p927,
                m36p928,
                m36p929,
                m36p930,
                m36p931,
                m36p932,
                m36p933,
                m36p934,
                m36p935,
                m36p936,
                m36p937,
                m36p938,
                m36p939,
                m36p940,
                m36p941,
                m36p942,
                m36p943                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p9dominio,m36p9nif,m36p9ejercicio,m36p9periodo,m36p9pagina };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod036p7b extends TableDef
        {
        // campos
        public FieldDef m36p7dominio;
        public FieldDef m36p7nif;
        public FieldDef m36p7ejercicio;
        public FieldDef m36p7periodo;
        public FieldDef m36p750751;
        public FieldDef m36p752;
        public FieldDef m36p753;
        public FieldDef m36p754;
        public FieldDef m36p755756;
        public FieldDef m36p757;
        public FieldDef m36p758;
        public FieldDef m36p759;
        public TabMod036p7b(String name)
            {
            super(name);
            m36p7dominio = new FieldDef("m36p7dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m36p7nif = new FieldDef("m36p7nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m36p7ejercicio = new FieldDef("m36p7ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m36p7periodo = new FieldDef("m36p7periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m36p750751 = new FieldDef("m36p750751",FieldDef.CHAR,1);
            m36p752 = new FieldDef("m36p752",FieldDef.CHAR,1);
            m36p753 = new FieldDef("m36p753",FieldDef.CHAR,1);
            m36p754 = new FieldDef("m36p754",FieldDef.DATE);
            m36p755756 = new FieldDef("m36p755756",FieldDef.CHAR,1);
            m36p757 = new FieldDef("m36p757",FieldDef.CHAR,1);
            m36p758 = new FieldDef("m36p758",FieldDef.CHAR,1);
            m36p759 = new FieldDef("m36p759",FieldDef.DATE);
            FieldDef array[] = {
                m36p7dominio,
                m36p7nif,
                m36p7ejercicio,
                m36p7periodo,
                m36p750751,
                m36p752,
                m36p753,
                m36p754,
                m36p755756,
                m36p757,
                m36p758,
                m36p759                
                };
            setColumns(array);
            FieldDef arrayf[] = {m36p7dominio,m36p7nif,m36p7ejercicio,m36p7periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public CatModelos2()
        {
        tabmod184d = new TabMod184d("mod184d");
        tabmod184e = new TabMod184e("mod184e");
        tabmod184n = new TabMod184n("mod184n");
        tabmod184s = new TabMod184s("mod184s");
        tabmod140 = new TabMod140("mod140");
        tabmod600c = new TabMod600c("mod600c");
        tabmod600d = new TabMod600d("mod600d");
        tabmod0361 = new TabMod0361("mod0361");
        tabmod0362 = new TabMod0362("mod0362");
        tabmod0363 = new TabMod0363("mod0363");
        tabmod0364 = new TabMod0364("mod0364");
        tabmod0365 = new TabMod0365("mod0365");
        tabmod0366 = new TabMod0366("mod0366");
        tabmod0367 = new TabMod0367("mod0367");
        tabmod0368 = new TabMod0368("mod0368");
        tabmod0369 = new TabMod0369("mod0369");
        tabmod03610 = new TabMod03610("mod03610");
        tabmod03611 = new TabMod03611("mod03611");
        tabmod576 = new TabMod576("mod576");
        tabmod130des = new TabMod130des("mod130des");
        tabmod036p1 = new TabMod036p1("mod036p1");
        tabmod036p2b = new TabMod036p2b("mod036p2b");
        tabmod036p2c = new TabMod036p2c("mod036p2c");
        tabmod036p3 = new TabMod036p3("mod036p3");
        tabmod036p3n = new TabMod036p3n("mod036p3n");
        tabmod036p4 = new TabMod036p4("mod036p4");
        tabmod036p4n = new TabMod036p4n("mod036p4n");
        tabmod036p6 = new TabMod036p6("mod036p6");
        tabmod036p7 = new TabMod036p7("mod036p7");
        tabmod036p8 = new TabMod036p8("mod036p8");
        tabmod036p8n = new TabMod036p8n("mod036p8n");
        tabmod340c = new TabMod340c("mod340c");
        tabmod340e = new TabMod340e("mod340e");
        tabmod340r = new TabMod340r("mod340r");
        tabmod340b = new TabMod340b("mod340b");
        tabmod340i = new TabMod340i("mod340i");
        tabmod310des = new TabMod310des("mod310des");
        tabmod110g = new TabMod110g("mod110g");
        tabmod308 = new TabMod308("mod308");
        tabmod309 = new TabMod309("mod309");
        tabmod210 = new TabMod210("mod210");
        tabmod210cp = new TabMod210cp("mod210cp");
        tabmod720c = new TabMod720c("mod720c");
        tabmod720d = new TabMod720d("mod720d");
        tabmod036p2 = new TabMod036p2("mod036p2");
        tabmod036p5 = new TabMod036p5("mod036p5");
        tabmodcensanc = new TabModcensanc("modcensanc");
        tabmodcensand = new TabModcensand("modcensand");
        tabmod353c = new TabMod353c("mod353c");
        tabmod353d = new TabMod353d("mod353d");
        tabmod282 = new TabMod282("mod282");
        tabmod232c = new TabMod232c("mod232c");
        tabmod232v = new TabMod232v("mod232v");
        tabmod232p = new TabMod232p("mod232p");
        tabmod182c = new TabMod182c("mod182c");
        tabmod182d = new TabMod182d("mod182d");
        tabmod036p9n = new TabMod036p9n("mod036p9n");
        tabmod036p7b = new TabMod036p7b("mod036p7b");
        TableDef array[] = {
            tabmod184d,
            tabmod184e,
            tabmod184n,
            tabmod184s,
            tabmod140,
            tabmod600c,
            tabmod600d,
            tabmod0361,
            tabmod0362,
            tabmod0363,
            tabmod0364,
            tabmod0365,
            tabmod0366,
            tabmod0367,
            tabmod0368,
            tabmod0369,
            tabmod03610,
            tabmod03611,
            tabmod576,
            tabmod130des,
            tabmod036p1,
            tabmod036p2b,
            tabmod036p2c,
            tabmod036p3,
            tabmod036p3n,
            tabmod036p4,
            tabmod036p4n,
            tabmod036p6,
            tabmod036p7,
            tabmod036p8,
            tabmod036p8n,
            tabmod340c,
            tabmod340e,
            tabmod340r,
            tabmod340b,
            tabmod340i,
            tabmod310des,
            tabmod110g,
            tabmod308,
            tabmod309,
            tabmod210,
            tabmod210cp,
            tabmod720c,
            tabmod720d,
            tabmod036p2,
            tabmod036p5,
            tabmodcensanc,
            tabmodcensand,
            tabmod353c,
            tabmod353d,
            tabmod282,
            tabmod232c,
            tabmod232v,
            tabmod232p,
            tabmod182c,
            tabmod182d,
            tabmod036p9n,
            tabmod036p7b            
            };
        setTables(array);
        FieldDef tabmod184eArrayf1[] = { tabmod184e.m184edominio,tabmod184e.m184enif,tabmod184e.m184eejercicio,tabmod184e.m184eperiodo };
        ForeignKey tabmod184eArrayfk[] = { 
            new ForeignKey(tabmod184d,tabmod184eArrayf1)            
            };
        tabmod184e.setForeignKeys(tabmod184eArrayfk);
        FieldDef tabmod184nArrayf1[] = { tabmod184n.m184ndominio,tabmod184n.m184nnif,tabmod184n.m184nejercicio,tabmod184n.m184nperiodo };
        ForeignKey tabmod184nArrayfk[] = { 
            new ForeignKey(tabmod184d,tabmod184nArrayf1)            
            };
        tabmod184n.setForeignKeys(tabmod184nArrayfk);
        FieldDef tabmod184sArrayf1[] = { tabmod184s.m184ssocio };
        ForeignKey tabmod184sArrayfk[] = { 
            new ForeignKey(tabmod184n,tabmod184sArrayf1)            
            };
        tabmod184s.setForeignKeys(tabmod184sArrayfk);
        FieldDef tabmod600dArrayf1[] = { tabmod600d.m600ddominio,tabmod600d.m600dnif,tabmod600d.m600dejercicio,tabmod600d.m600dperiodo };
        ForeignKey tabmod600dArrayfk[] = { 
            new ForeignKey(tabmod600c,tabmod600dArrayf1)            
            };
        tabmod600d.setForeignKeys(tabmod600dArrayfk);
        FieldDef tabmod340eArrayf1[] = { tabmod340e.m340edominio,tabmod340e.m340enif,tabmod340e.m340eejercicio,tabmod340e.m340eperiodo };
        ForeignKey tabmod340eArrayfk[] = { 
            new ForeignKey(tabmod340c,tabmod340eArrayf1)            
            };
        tabmod340e.setForeignKeys(tabmod340eArrayfk);
        FieldDef tabmod340rArrayf1[] = { tabmod340r.m340rdominio,tabmod340r.m340rnif,tabmod340r.m340rejercicio,tabmod340r.m340rperiodo };
        ForeignKey tabmod340rArrayfk[] = { 
            new ForeignKey(tabmod340c,tabmod340rArrayf1)            
            };
        tabmod340r.setForeignKeys(tabmod340rArrayfk);
        FieldDef tabmod340bArrayf1[] = { tabmod340b.m340bdominio,tabmod340b.m340bnif,tabmod340b.m340bejercicio,tabmod340b.m340bperiodo };
        ForeignKey tabmod340bArrayfk[] = { 
            new ForeignKey(tabmod340c,tabmod340bArrayf1)            
            };
        tabmod340b.setForeignKeys(tabmod340bArrayfk);
        FieldDef tabmod340iArrayf1[] = { tabmod340i.m340idominio,tabmod340i.m340inif,tabmod340i.m340iejercicio,tabmod340i.m340iperiodo };
        ForeignKey tabmod340iArrayfk[] = { 
            new ForeignKey(tabmod340c,tabmod340iArrayf1)            
            };
        tabmod340i.setForeignKeys(tabmod340iArrayfk);
        FieldDef tabmod720dArrayf1[] = { tabmod720d.m720ddominio,tabmod720d.m720dnif,tabmod720d.m720dejercicio,tabmod720d.m720dperiodo };
        ForeignKey tabmod720dArrayfk[] = { 
            new ForeignKey(tabmod720c,tabmod720dArrayf1)            
            };
        tabmod720d.setForeignKeys(tabmod720dArrayfk);
        FieldDef tabmod353dArrayf1[] = { tabmod353d.m353ddominio,tabmod353d.m353dnif,tabmod353d.m353dejercicio,tabmod353d.m353dperiodo };
        ForeignKey tabmod353dArrayfk[] = { 
            new ForeignKey(tabmod353c,tabmod353dArrayf1)            
            };
        tabmod353d.setForeignKeys(tabmod353dArrayfk);
        FieldDef tabmod232vArrayf1[] = { tabmod232v.m232vdominio,tabmod232v.m232vnif,tabmod232v.m232vejercicio,tabmod232v.m232vperiodo };
        ForeignKey tabmod232vArrayfk[] = { 
            new ForeignKey(tabmod232c,tabmod232vArrayf1)            
            };
        tabmod232v.setForeignKeys(tabmod232vArrayfk);
        FieldDef tabmod232pArrayf1[] = { tabmod232p.m232pdominio,tabmod232p.m232pnif,tabmod232p.m232pejercicio,tabmod232p.m232pperiodo };
        ForeignKey tabmod232pArrayfk[] = { 
            new ForeignKey(tabmod232c,tabmod232pArrayf1)            
            };
        tabmod232p.setForeignKeys(tabmod232pArrayfk);
        FieldDef tabmod182dArrayf1[] = { tabmod182d.m182ddominio,tabmod182d.m182dnif,tabmod182d.m182dejercicio,tabmod182d.m182dperiodo };
        ForeignKey tabmod182dArrayfk[] = { 
            new ForeignKey(tabmod182c,tabmod182dArrayf1)            
            };
        tabmod182d.setForeignKeys(tabmod182dArrayfk);
        }
    }
    
