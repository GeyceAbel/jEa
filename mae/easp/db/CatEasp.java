// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Thu Jun 30 10:01:11 CEST 2022
// 
// Aplicación: easp
// 
package mae.easp.db;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.general.*;
// 
public class CatEasp extends Catalog
    {
    // tablas
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
    public TabDatosregistral tabdatosregistral;
    public TabSesiones tabsesiones;
    public TabImpuser tabimpuser;
    public TabCnae1993 tabcnae1993;
    public TabPlantillas tabplantillas;
    public TabFormacobpag tabformacobpag;
    public TabTareajasper tabtareajasper;
    public TabTareajasperdet tabtareajasperdet;
    public TabJcopreest tabjcopreest;
    public TabJcoratis tabjcoratis;
    public TabJcoepigrafe tabjcoepigrafe;
    public TabCodcnvotraplc tabcodcnvotraplc;
    public TabCodcnvotrapll tabcodcnvotrapll;
    public TabCodcnvinciden tabcodcnvinciden;
    public TabLibregmerext tablibregmerext;
    public TabLogjcontax tablogjcontax;
    public TabAvisos tabavisos;
    public TabJcoimpexcel tabjcoimpexcel;
    public TabEstilos tabestilos;
    public TabInfplantilla tabinfplantilla;
    public TabInfplantlinea tabinfplantlinea;
    public TabInfplantcol tabinfplantcol;
    public TabValidanomaeat tabvalidanomaeat;
    public TabJcocnvprc tabjcocnvprc;
    public TabPcinmovlog tabpcinmovlog;
    public TabPcinmovhis tabpcinmovhis;
    public TabPcmoranualhis tabpcmoranualhis;
    public TabPcinmov tabpcinmov;
    public TabPcmoranual tabpcmoranual;
    public TabDiccuentas tabdiccuentas;
    public TabCambioeuro tabcambioeuro;
    public TabSeguridad tabseguridad;
    public TabUshistorico tabushistorico;
    public TabDicpatron tabdicpatron;
    public TabDfsdomicilio tabdfsdomicilio;
    public TabDfscensales tabdfscensales;
    public TabDfsperiodoycnae tabdfsperiodoycnae;
    public TabDfscaracteres tabdfscaracteres;
    public TabDfsadmins tabdfsadmins;
    public TabDfsentidpart tabdfsentidpart;
    public TabDfsperspart tabdfsperspart;
    public TabDfssecrerepre tabdfssecrerepre;
    public TabDfspagosfrac tabdfspagosfrac;
    public TabDfsvoloper tabdfsvoloper;
    public TabDfsrdtotrab tabdfsrdtotrab;
    public TabDfsdeducybases tabdfsdeducybases;
    public TabDfsdonaciones tabdfsdonaciones;
    public TabDfsmultasdgt tabdfsmultasdgt;
    public TabDfsrdtoctasban tabdfsrdtoctasban;
    public TabDfssanciones tabdfssanciones;
    public TabCdpnotificacion tabcdpnotificacion;
    public TabParamlis tabparamlis;
    public TabDfsadminsninfo tabdfsadminsninfo;
    public TabDfssociosninfo tabdfssociosninfo;
    public TabDfsregdeclarado tabdfsregdeclarado;
    public TabDfsrdtimpinfo tabdfsrdtimpinfo;
    public TabDfsarrlocalimp tabdfsarrlocalimp;
    public TabWnifes tabwnifes;
    public TabDfsintereses tabdfsintereses;
    public TabDfscorreccion tabdfscorreccion;
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
        
    public class TabSetupapl extends TableDef
        {
        // campos
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
        // campos
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
        // campos
        public FieldDef tratipo;
        public FieldDef tradesc;
        public FieldDef traemre;
        public FieldDef traregimen;
        public FieldDef tratipoiva;
        public FieldDef travoloper;
        public FieldDef traoperespec;
        public FieldDef traoper349;
        public FieldDef traregemp;
        public TabTransacciones(String name)
            {
            super(name);
            tratipo = new FieldDef("tratipo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            tradesc = new FieldDef("tradesc",FieldDef.CHAR,150,FieldDef.NOTNULL);
            traemre = new FieldDef("traemre",FieldDef.CHAR,1,FieldDef.NOTNULL);
            traregimen = new FieldDef("traregimen",FieldDef.CHAR,2,FieldDef.NOTNULL);
            tratipoiva = new FieldDef("tratipoiva",FieldDef.CHAR,3);
            travoloper = new FieldDef("travoloper",FieldDef.CHAR,3);
            traoperespec = new FieldDef("traoperespec",FieldDef.CHAR,3);
            traoper349 = new FieldDef("traoper349",FieldDef.CHAR,3);
            traregemp = new FieldDef("traregemp",FieldDef.CHAR,1);
            FieldDef array[] = {
                tratipo,
                tradesc,
                traemre,
                traregimen,
                tratipoiva,
                travoloper,
                traoperespec,
                traoper349,
                traregemp                
                };
            setColumns(array);
            FieldDef arrayf[] = {tratipo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabCnae extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
        public FieldDef picodigo;
        public FieldDef pidesc;
        public FieldDef picodigoaeat;
        public FieldDef picodigoss;
        public FieldDef picodigo347;
        public FieldDef piparaisofiscal;
        public TabPais(String name)
            {
            super(name);
            picodigo = new FieldDef("picodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pidesc = new FieldDef("pidesc",FieldDef.CHAR,50);
            picodigoaeat = new FieldDef("picodigoaeat",FieldDef.INTEGER,0);
            picodigoss = new FieldDef("picodigoss",FieldDef.INTEGER,0);
            picodigo347 = new FieldDef("picodigo347",FieldDef.CHAR,3);
            piparaisofiscal = new FieldDef("piparaisofiscal",FieldDef.CHAR,1);
            FieldDef array[] = {
                picodigo,
                pidesc,
                picodigoaeat,
                picodigoss,
                picodigo347,
                piparaisofiscal                
                };
            setColumns(array);
            FieldDef arrayf[] = {picodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabComuniauton extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        public FieldDef datuser;
        public FieldDef datgrupo;
        public FieldDef datnombreant;
        public FieldDef datapell1ant;
        public FieldDef datapell2ant;
        public TabNifes(String name)
            {
            super(name);
            danifcif = new FieldDef("danifcif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            datipo = new FieldDef("datipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
            datnombre = new FieldDef("datnombre",FieldDef.CHAR,50);
            datapell1 = new FieldDef("datapell1",FieldDef.CHAR,100,FieldDef.NOTNULL);
            datapell2 = new FieldDef("datapell2",FieldDef.CHAR,50);
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
            datuser = new FieldDef("datuser",FieldDef.CHAR,25);
            datgrupo = new FieldDef("datgrupo",FieldDef.CHAR,15);
            datnombreant = new FieldDef("datnombreant",FieldDef.CHAR,50);
            datapell1ant = new FieldDef("datapell1ant",FieldDef.CHAR,100);
            datapell2ant = new FieldDef("datapell2ant",FieldDef.CHAR,50);
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
                datmovil,
                datuser,
                datgrupo,
                datnombreant,
                datapell1ant,
                datapell2ant                
                };
            setColumns(array);
            FieldDef arrayf[] = {danifcif };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabNifesmuf extends TableDef
        {
        // campos
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
        // campos
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
        public FieldDef cdpresponsable;
        public FieldDef cdpsiifacil;
        public FieldDef cdpomiterel;
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
            cdpresponsable = new FieldDef("cdpresponsable",FieldDef.CHAR,25);
            cdpsiifacil = new FieldDef("cdpsiifacil",FieldDef.CHAR,1);
            cdpomiterel = new FieldDef("cdpomiterel",FieldDef.CHAR,1);
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
                cdpdominio,
                cdpresponsable,
                cdpsiifacil,
                cdpomiterel                
                };
            setColumns(array);
            FieldDef arrayf[] = {cdpcodi };
            setPrimaryKeys(arrayf);
            cdpsiifacil.setDescription("SII Facil habilitado");
            cdpomiterel.setDescription("Omitir campo relacionado con");
            }
        }
        
    public class TabRepresentantes extends TableDef
        {
        // campos
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
            FieldDef arrayf[] = {repcodigo,repnifcif };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabAgpi extends TableDef
        {
        // campos
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
        // campos
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
            FieldDef arrayf[] = {pdfcodi };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabAmortizacion extends TableDef
        {
        // campos
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
        public FieldDef amoejercicio;
        public FieldDef amocodequiv;
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
            amoejercicio = new FieldDef("amoejercicio",FieldDef.INTEGER,0);
            amocodequiv = new FieldDef("amocodequiv",FieldDef.INTEGER,0);
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
                amonum,
                amoejercicio,
                amocodequiv                
                };
            setColumns(array);
            FieldDef arrayf[] = {amocodigo };
            setPrimaryKeys(arrayf);
            amocodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabEpigrafes extends TableDef
        {
        // campos
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
        // campos
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
        public FieldDef bccsepa;
        public FieldDef bcciban;
        public FieldDef bcccodswift;
        public FieldDef bccbanconame;
        public FieldDef bccbancadress;
        public FieldDef bccbanccity;
        public FieldDef bcccodpais;
        public FieldDef bccbancpais;
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
            bccsepa = new FieldDef("bccsepa",FieldDef.INTEGER,12);
            bcciban = new FieldDef("bcciban",FieldDef.CHAR,34);
            bcccodswift = new FieldDef("bcccodswift",FieldDef.CHAR,11);
            bccbanconame = new FieldDef("bccbanconame",FieldDef.CHAR,70);
            bccbancadress = new FieldDef("bccbancadress",FieldDef.CHAR,35);
            bccbanccity = new FieldDef("bccbanccity",FieldDef.CHAR,30);
            bcccodpais = new FieldDef("bcccodpais",FieldDef.CHAR,2);
            bccbancpais = new FieldDef("bccbancpais",FieldDef.CHAR,40);
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
                bccdominio,
                bccsepa,
                bcciban,
                bcccodswift,
                bccbanconame,
                bccbancadress,
                bccbanccity,
                bcccodpais,
                bccbancpais                
                };
            setColumns(array);
            FieldDef arrayf[] = {bcccodigo,bccbanco,bccsucursal,bccnumero,bccdigitos };
            setPrimaryKeys(arrayf);
            bccsepa.setDescription("Marca SEPA (1 – Cuenta España, 2 – Unión Europea SEPA, 3 – Resto países)");
            bcccodswift.setDescription("Codigo SWIFT-BIC");
            bccbanconame.setDescription("Banco/Bank name");
            bccbancadress.setDescription("Dirección del Banco/ Bank adress");
            bccbanccity.setDescription("Ciudad/City");
            bcccodpais.setDescription("Código País/Country code");
            bccbancpais.setDescription("País/Country");
            }
        }
        
    public class TabAsignaciones extends TableDef
        {
        // campos
        public FieldDef abacodigo;
        public FieldDef abatipo;
        public FieldDef ababanco;
        public FieldDef absucursal;
        public FieldDef abnumero;
        public FieldDef abadigito;
        public FieldDef abadominio;
        public TabAsignaciones(String name)
            {
            super(name);
            abacodigo = new FieldDef("abacodigo",FieldDef.CHAR,12,FieldDef.NOTNULL);
            abatipo = new FieldDef("abatipo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            ababanco = new FieldDef("ababanco",FieldDef.INTEGER,0);
            absucursal = new FieldDef("absucursal",FieldDef.INTEGER,0);
            abnumero = new FieldDef("abnumero",FieldDef.CHAR,10);
            abadigito = new FieldDef("abadigito",FieldDef.INTEGER,0);
            abadominio = new FieldDef("abadominio",FieldDef.CHAR,12);
            FieldDef array[] = {
                abacodigo,
                abatipo,
                ababanco,
                absucursal,
                abnumero,
                abadigito,
                abadominio                
                };
            setColumns(array);
            FieldDef arrayf[] = {abacodigo,abatipo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabNumeraciones extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        
    public class TabInerrcod extends TableDef
        {
        // campos
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
            FieldDef arrayf[] = {ercodigo };
            setPrimaryKeys(arrayf);
            ercodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabInincide extends TableDef
        {
        // campos
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
            FieldDef arrayf[] = {incodigo,insede,inusuari,inpuesto };
            setPrimaryKeys(arrayf);
            incodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabImpemul extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        
    public class TabApl extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        public FieldDef usremoto;
        public FieldDef usmd5;
        public TabUsuario(String name)
            {
            super(name);
            uscodcon = new FieldDef("uscodcon",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            uslogin = new FieldDef("uslogin",FieldDef.CHAR,25,FieldDef.NOTNULL);
            usnombre = new FieldDef("usnombre",FieldDef.CHAR,45);
            uspasswd = new FieldDef("uspasswd",FieldDef.CHAR,20);
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
            usremoto = new FieldDef("usremoto",FieldDef.CHAR,1);
            usmd5 = new FieldDef("usmd5",FieldDef.CHAR,100);
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
                usfoto,
                usremoto,
                usmd5                
                };
            setColumns(array);
            FieldDef arrayf[] = {uscodcon,uslogin };
            setPrimaryKeys(arrayf);
            usfoto.setDescription("Utilitzado en jconta para saber si la aplicacion remota es de Lectura o de Control Total");
            usmd5.setDescription("password md5");
            }
        }
        
    public class TabUsgrupo extends TableDef
        {
        // campos
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
        // campos
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
            FieldDef arrayf[] = {usacodco,usagrupo,usalogin };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabUsrecursos extends TableDef
        {
        // campos
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
        // campos
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
            FieldDef arrayf[] = {uspgrupo,usprecurso };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabUspermlo extends TableDef
        {
        // campos
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
            FieldDef arrayf[] = {uslcodco,usluser,uslrecurso };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabParametros extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        public FieldDef qecmedia;
        public FieldDef qeccontador;
        public FieldDef qecrotura;
        public FieldDef qectitrotura;
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
            qecmedia = new FieldDef("qecmedia",FieldDef.CHAR,1);
            qeccontador = new FieldDef("qeccontador",FieldDef.CHAR,1);
            qecrotura = new FieldDef("qecrotura",FieldDef.CHAR,1);
            qectitrotura = new FieldDef("qectitrotura",FieldDef.CHAR,20);
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
                qecgrupby,
                qecmedia,
                qeccontador,
                qecrotura,
                qectitrotura                
                };
            setColumns(array);
            FieldDef arrayf[] = {qecaplicacion,qecfrase,qecorden };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMir extends TableDef
        {
        // campos
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
        public FieldDef mircliente;
        public FieldDef mirexpediente;
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
            mircliente = new FieldDef("mircliente",FieldDef.CHAR,15);
            mirexpediente = new FieldDef("mirexpediente",FieldDef.CHAR,15);
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
                mirubicacion,
                mircliente,
                mirexpediente                
                };
            setColumns(array);
            FieldDef arrayf[] = {mircodi };
            setPrimaryKeys(arrayf);
            mircodi.setAutoIncrementable(true);
            }
        }
        
    public class TabNotas extends TableDef
        {
        // campos
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
        // campos
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
        // campos
        public FieldDef emodejercicio;
        public FieldDef emodnif;
        public FieldDef emodmodelo;
        public FieldDef emodtipoper;
        public FieldDef emodactivo;
        public FieldDef emodfechaini;
        public FieldDef emodfechafin;
        public FieldDef emodpreasesor;
        public TabEmpmodelos(String name)
            {
            super(name);
            emodejercicio = new FieldDef("emodejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            emodnif = new FieldDef("emodnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            emodmodelo = new FieldDef("emodmodelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            emodtipoper = new FieldDef("emodtipoper",FieldDef.CHAR,2);
            emodactivo = new FieldDef("emodactivo",FieldDef.CHAR,1);
            emodfechaini = new FieldDef("emodfechaini",FieldDef.DATE);
            emodfechafin = new FieldDef("emodfechafin",FieldDef.DATE);
            emodpreasesor = new FieldDef("emodpreasesor",FieldDef.CHAR,1);
            FieldDef array[] = {
                emodejercicio,
                emodnif,
                emodmodelo,
                emodtipoper,
                emodactivo,
                emodfechaini,
                emodfechafin,
                emodpreasesor                
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
            emodfechaini.setDescription("Fecha inicio obligacion");
            emodfechafin.setDescription("Fecha fin obligacion");
            emodpreasesor.setDescription("Presenta asesor declaracion");
            }
        }
        
    public class TabAvisado extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        
    public class TabDatosregistral extends TableDef
        {
        // campos
        public FieldDef drenifcif;
        public FieldDef dreregistro;
        public FieldDef dretomo;
        public FieldDef drelibro;
        public FieldDef dreseccion;
        public FieldDef drefolio;
        public FieldDef drehoja;
        public FieldDef dreinscripcion;
        public FieldDef drefechainscrip;
        public TabDatosregistral(String name)
            {
            super(name);
            drenifcif = new FieldDef("drenifcif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dreregistro = new FieldDef("dreregistro",FieldDef.CHAR,5);
            dretomo = new FieldDef("dretomo",FieldDef.CHAR,6);
            drelibro = new FieldDef("drelibro",FieldDef.CHAR,6);
            dreseccion = new FieldDef("dreseccion",FieldDef.CHAR,3);
            drefolio = new FieldDef("drefolio",FieldDef.CHAR,5);
            drehoja = new FieldDef("drehoja",FieldDef.CHAR,9);
            dreinscripcion = new FieldDef("dreinscripcion",FieldDef.CHAR,4);
            drefechainscrip = new FieldDef("drefechainscrip",FieldDef.DATE);
            FieldDef array[] = {
                drenifcif,
                dreregistro,
                dretomo,
                drelibro,
                dreseccion,
                drefolio,
                drehoja,
                dreinscripcion,
                drefechainscrip                
                };
            setColumns(array);
            FieldDef arrayf[] = {drenifcif };
            setPrimaryKeys(arrayf);
            dreregistro.setDescription("Código de Registro Mercantil");
            dretomo.setDescription("Tomo");
            drelibro.setDescription("Libro");
            dreseccion.setDescription("Seccion");
            drefolio.setDescription("Folio");
            drehoja.setDescription("Hoja");
            dreinscripcion.setDescription("Inscripcion");
            drefechainscrip.setDescription("Fecha Inscripcion");
            }
        }
        
    public class TabSesiones extends TableDef
        {
        // campos
        public FieldDef sescodigo;
        public FieldDef sesmachine;
        public FieldDef sesusuario;
        public FieldDef sesfecha;
        public FieldDef seshora;
        public FieldDef sesaplicacion;
        public FieldDef sespermitido;
        public TabSesiones(String name)
            {
            super(name);
            sescodigo = new FieldDef("sescodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            sesmachine = new FieldDef("sesmachine",FieldDef.CHAR,50);
            sesusuario = new FieldDef("sesusuario",FieldDef.CHAR,25);
            sesfecha = new FieldDef("sesfecha",FieldDef.DATE);
            seshora = new FieldDef("seshora",FieldDef.CHAR,8);
            sesaplicacion = new FieldDef("sesaplicacion",FieldDef.CHAR,15);
            sespermitido = new FieldDef("sespermitido",FieldDef.CHAR,1);
            FieldDef array[] = {
                sescodigo,
                sesmachine,
                sesusuario,
                sesfecha,
                seshora,
                sesaplicacion,
                sespermitido                
                };
            setColumns(array);
            FieldDef arrayf[] = {sescodigo };
            setPrimaryKeys(arrayf);
            sescodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabImpuser extends TableDef
        {
        // campos
        public FieldDef imucodigo;
        public FieldDef imumachine;
        public FieldDef imuusuario;
        public FieldDef imufecha;
        public FieldDef imuhora;
        public FieldDef imuaplicacion;
        public TabImpuser(String name)
            {
            super(name);
            imucodigo = new FieldDef("imucodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            imumachine = new FieldDef("imumachine",FieldDef.CHAR,50);
            imuusuario = new FieldDef("imuusuario",FieldDef.CHAR,25);
            imufecha = new FieldDef("imufecha",FieldDef.DATE);
            imuhora = new FieldDef("imuhora",FieldDef.CHAR,8);
            imuaplicacion = new FieldDef("imuaplicacion",FieldDef.CHAR,15);
            FieldDef array[] = {
                imucodigo,
                imumachine,
                imuusuario,
                imufecha,
                imuhora,
                imuaplicacion                
                };
            setColumns(array);
            FieldDef arrayf[] = {imucodigo };
            setPrimaryKeys(arrayf);
            imucodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabCnae1993 extends TableDef
        {
        // campos
        public FieldDef cn93codigo;
        public FieldDef cn93desc;
        public TabCnae1993(String name)
            {
            super(name);
            cn93codigo = new FieldDef("cn93codigo",FieldDef.CHAR,4,FieldDef.NOTNULL);
            cn93desc = new FieldDef("cn93desc",FieldDef.CHAR,160);
            FieldDef array[] = {
                cn93codigo,
                cn93desc                
                };
            setColumns(array);
            FieldDef arrayf[] = {cn93codigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabPlantillas extends TableDef
        {
        // campos
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
        public FieldDef pltipoplan;
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
            pltipoplan = new FieldDef("pltipoplan",FieldDef.INTEGER,0);
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
                pltipoorig,
                pltipoplan                
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
            pltipoplan.setDescription("Tipus de plantilla (0=carta, 1=etiqueta, -1=mergeDocument)");
            }
        }
        
    public class TabFormacobpag extends TableDef
        {
        // campos
        public FieldDef fcpforma;
        public FieldDef fcpdesc;
        public FieldDef fcptipo;
        public TabFormacobpag(String name)
            {
            super(name);
            fcpforma = new FieldDef("fcpforma",FieldDef.CHAR,3,FieldDef.NOTNULL);
            fcpdesc = new FieldDef("fcpdesc",FieldDef.CHAR,40);
            fcptipo = new FieldDef("fcptipo",FieldDef.CHAR,2);
            FieldDef array[] = {
                fcpforma,
                fcpdesc,
                fcptipo                
                };
            setColumns(array);
            FieldDef arrayf[] = {fcpforma };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabTareajasper extends TableDef
        {
        // campos
        public FieldDef tjscodi;
        public FieldDef tjstitulo;
        public FieldDef tjsdesc;
        public FieldDef tjsaplic;
        public FieldDef tjstipo;
        public TabTareajasper(String name)
            {
            super(name);
            tjscodi = new FieldDef("tjscodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            tjstitulo = new FieldDef("tjstitulo",FieldDef.CHAR,25);
            tjsdesc = new FieldDef("tjsdesc",FieldDef.CHAR,45);
            tjsaplic = new FieldDef("tjsaplic",FieldDef.CHAR,10);
            tjstipo = new FieldDef("tjstipo",FieldDef.CHAR,2);
            FieldDef array[] = {
                tjscodi,
                tjstitulo,
                tjsdesc,
                tjsaplic,
                tjstipo                
                };
            setColumns(array);
            FieldDef arrayf[] = {tjscodi };
            setPrimaryKeys(arrayf);
            tjscodi.setAutoIncrementable(true);
            }
        }
        
    public class TabTareajasperdet extends TableDef
        {
        // campos
        public FieldDef tjdcodi;
        public FieldDef tjdtarea;
        public FieldDef tjdlistado;
        public FieldDef tjdactivo;
        public FieldDef tjdorden;
        public FieldDef tjdcfgs1;
        public FieldDef tjdcfgs2;
        public FieldDef tjdcfgs3;
        public FieldDef tjdcfgs4;
        public FieldDef tjdcfgs5;
        public FieldDef tjdcfgs6;
        public FieldDef tjdcfgs7;
        public FieldDef tjdcfgs8;
        public FieldDef tjdcfgs9;
        public FieldDef tjdcfgs10;
        public FieldDef tjdcfgs11;
        public FieldDef tjdcfgs12;
        public FieldDef tjdcfgs13;
        public FieldDef tjdcfgs14;
        public FieldDef tjdcfgs15;
        public FieldDef tjdcfgs16;
        public FieldDef tjdcfgs17;
        public FieldDef tjdcfgs18;
        public FieldDef tjdcfgs19;
        public FieldDef tjdcfgs20;
        public FieldDef tjdcfgi1;
        public FieldDef tjdcfgi2;
        public FieldDef tjdcfgi3;
        public FieldDef tjdcfgi4;
        public FieldDef tjdcfgi5;
        public FieldDef tjdcfgi6;
        public FieldDef tjdcfgi7;
        public FieldDef tjdcfgi8;
        public FieldDef tjdcfgi9;
        public FieldDef tjdcfgi10;
        public FieldDef tjdcfgi11;
        public FieldDef tjdcfgi12;
        public FieldDef tjdcfgi13;
        public FieldDef tjdcfgi14;
        public FieldDef tjdcfgi15;
        public FieldDef tjdcfgi16;
        public FieldDef tjdcfgi17;
        public FieldDef tjdcfgi18;
        public FieldDef tjdcfgi19;
        public FieldDef tjdcfgi20;
        public FieldDef tjdcfgd1;
        public FieldDef tjdcfgd2;
        public FieldDef tjdcfgd3;
        public FieldDef tjdcfgd4;
        public FieldDef tjdcfgd5;
        public FieldDef tjdcfgd6;
        public FieldDef tjdcfgd7;
        public FieldDef tjdcfgd8;
        public FieldDef tjdcfgd9;
        public FieldDef tjdcfgd10;
        public FieldDef tjdcfgd11;
        public FieldDef tjdcfgd12;
        public FieldDef tjdcfgd13;
        public FieldDef tjdcfgd14;
        public FieldDef tjdcfgd15;
        public FieldDef tjdcfgd16;
        public FieldDef tjdcfgd17;
        public FieldDef tjdcfgd18;
        public FieldDef tjdcfgd19;
        public FieldDef tjdcfgd20;
        public FieldDef tjdcfgf1;
        public FieldDef tjdcfgf2;
        public FieldDef tjdcfgf3;
        public FieldDef tjdcfgf4;
        public FieldDef tjdcfgf5;
        public FieldDef tjdcfgf6;
        public FieldDef tjdcfgf7;
        public FieldDef tjdcfgf8;
        public FieldDef tjdcfgf9;
        public FieldDef tjdcfgf10;
        public FieldDef tjdcfgf11;
        public FieldDef tjdcfgf12;
        public FieldDef tjdcfgf13;
        public FieldDef tjdcfgf14;
        public FieldDef tjdcfgf15;
        public FieldDef tjdcfgf16;
        public FieldDef tjdcfgf17;
        public FieldDef tjdcfgf18;
        public FieldDef tjdcfgf19;
        public FieldDef tjdcfgf20;
        public TabTareajasperdet(String name)
            {
            super(name);
            tjdcodi = new FieldDef("tjdcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            tjdtarea = new FieldDef("tjdtarea",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            tjdlistado = new FieldDef("tjdlistado",FieldDef.CHAR,15,FieldDef.NOTNULL);
            tjdactivo = new FieldDef("tjdactivo",FieldDef.CHAR,1);
            tjdorden = new FieldDef("tjdorden",FieldDef.INTEGER,0);
            tjdcfgs1 = new FieldDef("tjdcfgs1",FieldDef.CHAR,50);
            tjdcfgs2 = new FieldDef("tjdcfgs2",FieldDef.CHAR,50);
            tjdcfgs3 = new FieldDef("tjdcfgs3",FieldDef.CHAR,50);
            tjdcfgs4 = new FieldDef("tjdcfgs4",FieldDef.CHAR,50);
            tjdcfgs5 = new FieldDef("tjdcfgs5",FieldDef.CHAR,50);
            tjdcfgs6 = new FieldDef("tjdcfgs6",FieldDef.CHAR,50);
            tjdcfgs7 = new FieldDef("tjdcfgs7",FieldDef.CHAR,50);
            tjdcfgs8 = new FieldDef("tjdcfgs8",FieldDef.CHAR,50);
            tjdcfgs9 = new FieldDef("tjdcfgs9",FieldDef.CHAR,50);
            tjdcfgs10 = new FieldDef("tjdcfgs10",FieldDef.CHAR,50);
            tjdcfgs11 = new FieldDef("tjdcfgs11",FieldDef.CHAR,50);
            tjdcfgs12 = new FieldDef("tjdcfgs12",FieldDef.CHAR,50);
            tjdcfgs13 = new FieldDef("tjdcfgs13",FieldDef.CHAR,50);
            tjdcfgs14 = new FieldDef("tjdcfgs14",FieldDef.CHAR,50);
            tjdcfgs15 = new FieldDef("tjdcfgs15",FieldDef.CHAR,50);
            tjdcfgs16 = new FieldDef("tjdcfgs16",FieldDef.CHAR,50);
            tjdcfgs17 = new FieldDef("tjdcfgs17",FieldDef.CHAR,50);
            tjdcfgs18 = new FieldDef("tjdcfgs18",FieldDef.CHAR,50);
            tjdcfgs19 = new FieldDef("tjdcfgs19",FieldDef.CHAR,50);
            tjdcfgs20 = new FieldDef("tjdcfgs20",FieldDef.CHAR,50);
            tjdcfgi1 = new FieldDef("tjdcfgi1",FieldDef.INTEGER,0);
            tjdcfgi2 = new FieldDef("tjdcfgi2",FieldDef.INTEGER,0);
            tjdcfgi3 = new FieldDef("tjdcfgi3",FieldDef.INTEGER,0);
            tjdcfgi4 = new FieldDef("tjdcfgi4",FieldDef.INTEGER,0);
            tjdcfgi5 = new FieldDef("tjdcfgi5",FieldDef.INTEGER,0);
            tjdcfgi6 = new FieldDef("tjdcfgi6",FieldDef.INTEGER,0);
            tjdcfgi7 = new FieldDef("tjdcfgi7",FieldDef.INTEGER,0);
            tjdcfgi8 = new FieldDef("tjdcfgi8",FieldDef.INTEGER,0);
            tjdcfgi9 = new FieldDef("tjdcfgi9",FieldDef.INTEGER,0);
            tjdcfgi10 = new FieldDef("tjdcfgi10",FieldDef.INTEGER,0);
            tjdcfgi11 = new FieldDef("tjdcfgi11",FieldDef.INTEGER,0);
            tjdcfgi12 = new FieldDef("tjdcfgi12",FieldDef.INTEGER,0);
            tjdcfgi13 = new FieldDef("tjdcfgi13",FieldDef.INTEGER,0);
            tjdcfgi14 = new FieldDef("tjdcfgi14",FieldDef.INTEGER,0);
            tjdcfgi15 = new FieldDef("tjdcfgi15",FieldDef.INTEGER,0);
            tjdcfgi16 = new FieldDef("tjdcfgi16",FieldDef.INTEGER,0);
            tjdcfgi17 = new FieldDef("tjdcfgi17",FieldDef.INTEGER,0);
            tjdcfgi18 = new FieldDef("tjdcfgi18",FieldDef.INTEGER,0);
            tjdcfgi19 = new FieldDef("tjdcfgi19",FieldDef.INTEGER,0);
            tjdcfgi20 = new FieldDef("tjdcfgi20",FieldDef.INTEGER,0);
            tjdcfgd1 = new FieldDef("tjdcfgd1",FieldDef.FLOAT,6,0);
            tjdcfgd2 = new FieldDef("tjdcfgd2",FieldDef.FLOAT,6,0);
            tjdcfgd3 = new FieldDef("tjdcfgd3",FieldDef.FLOAT,6,0);
            tjdcfgd4 = new FieldDef("tjdcfgd4",FieldDef.FLOAT,6,0);
            tjdcfgd5 = new FieldDef("tjdcfgd5",FieldDef.FLOAT,6,0);
            tjdcfgd6 = new FieldDef("tjdcfgd6",FieldDef.FLOAT,6,0);
            tjdcfgd7 = new FieldDef("tjdcfgd7",FieldDef.FLOAT,6,0);
            tjdcfgd8 = new FieldDef("tjdcfgd8",FieldDef.FLOAT,6,0);
            tjdcfgd9 = new FieldDef("tjdcfgd9",FieldDef.FLOAT,6,0);
            tjdcfgd10 = new FieldDef("tjdcfgd10",FieldDef.FLOAT,6,0);
            tjdcfgd11 = new FieldDef("tjdcfgd11",FieldDef.FLOAT,6,0);
            tjdcfgd12 = new FieldDef("tjdcfgd12",FieldDef.FLOAT,6,0);
            tjdcfgd13 = new FieldDef("tjdcfgd13",FieldDef.FLOAT,6,0);
            tjdcfgd14 = new FieldDef("tjdcfgd14",FieldDef.FLOAT,6,0);
            tjdcfgd15 = new FieldDef("tjdcfgd15",FieldDef.FLOAT,6,0);
            tjdcfgd16 = new FieldDef("tjdcfgd16",FieldDef.FLOAT,6,0);
            tjdcfgd17 = new FieldDef("tjdcfgd17",FieldDef.FLOAT,6,0);
            tjdcfgd18 = new FieldDef("tjdcfgd18",FieldDef.FLOAT,6,0);
            tjdcfgd19 = new FieldDef("tjdcfgd19",FieldDef.FLOAT,6,0);
            tjdcfgd20 = new FieldDef("tjdcfgd20",FieldDef.FLOAT,6,0);
            tjdcfgf1 = new FieldDef("tjdcfgf1",FieldDef.DATE);
            tjdcfgf2 = new FieldDef("tjdcfgf2",FieldDef.DATE);
            tjdcfgf3 = new FieldDef("tjdcfgf3",FieldDef.DATE);
            tjdcfgf4 = new FieldDef("tjdcfgf4",FieldDef.DATE);
            tjdcfgf5 = new FieldDef("tjdcfgf5",FieldDef.DATE);
            tjdcfgf6 = new FieldDef("tjdcfgf6",FieldDef.DATE);
            tjdcfgf7 = new FieldDef("tjdcfgf7",FieldDef.DATE);
            tjdcfgf8 = new FieldDef("tjdcfgf8",FieldDef.DATE);
            tjdcfgf9 = new FieldDef("tjdcfgf9",FieldDef.DATE);
            tjdcfgf10 = new FieldDef("tjdcfgf10",FieldDef.DATE);
            tjdcfgf11 = new FieldDef("tjdcfgf11",FieldDef.DATE);
            tjdcfgf12 = new FieldDef("tjdcfgf12",FieldDef.DATE);
            tjdcfgf13 = new FieldDef("tjdcfgf13",FieldDef.DATE);
            tjdcfgf14 = new FieldDef("tjdcfgf14",FieldDef.DATE);
            tjdcfgf15 = new FieldDef("tjdcfgf15",FieldDef.DATE);
            tjdcfgf16 = new FieldDef("tjdcfgf16",FieldDef.DATE);
            tjdcfgf17 = new FieldDef("tjdcfgf17",FieldDef.DATE);
            tjdcfgf18 = new FieldDef("tjdcfgf18",FieldDef.DATE);
            tjdcfgf19 = new FieldDef("tjdcfgf19",FieldDef.DATE);
            tjdcfgf20 = new FieldDef("tjdcfgf20",FieldDef.DATE);
            FieldDef array[] = {
                tjdcodi,
                tjdtarea,
                tjdlistado,
                tjdactivo,
                tjdorden,
                tjdcfgs1,
                tjdcfgs2,
                tjdcfgs3,
                tjdcfgs4,
                tjdcfgs5,
                tjdcfgs6,
                tjdcfgs7,
                tjdcfgs8,
                tjdcfgs9,
                tjdcfgs10,
                tjdcfgs11,
                tjdcfgs12,
                tjdcfgs13,
                tjdcfgs14,
                tjdcfgs15,
                tjdcfgs16,
                tjdcfgs17,
                tjdcfgs18,
                tjdcfgs19,
                tjdcfgs20,
                tjdcfgi1,
                tjdcfgi2,
                tjdcfgi3,
                tjdcfgi4,
                tjdcfgi5,
                tjdcfgi6,
                tjdcfgi7,
                tjdcfgi8,
                tjdcfgi9,
                tjdcfgi10,
                tjdcfgi11,
                tjdcfgi12,
                tjdcfgi13,
                tjdcfgi14,
                tjdcfgi15,
                tjdcfgi16,
                tjdcfgi17,
                tjdcfgi18,
                tjdcfgi19,
                tjdcfgi20,
                tjdcfgd1,
                tjdcfgd2,
                tjdcfgd3,
                tjdcfgd4,
                tjdcfgd5,
                tjdcfgd6,
                tjdcfgd7,
                tjdcfgd8,
                tjdcfgd9,
                tjdcfgd10,
                tjdcfgd11,
                tjdcfgd12,
                tjdcfgd13,
                tjdcfgd14,
                tjdcfgd15,
                tjdcfgd16,
                tjdcfgd17,
                tjdcfgd18,
                tjdcfgd19,
                tjdcfgd20,
                tjdcfgf1,
                tjdcfgf2,
                tjdcfgf3,
                tjdcfgf4,
                tjdcfgf5,
                tjdcfgf6,
                tjdcfgf7,
                tjdcfgf8,
                tjdcfgf9,
                tjdcfgf10,
                tjdcfgf11,
                tjdcfgf12,
                tjdcfgf13,
                tjdcfgf14,
                tjdcfgf15,
                tjdcfgf16,
                tjdcfgf17,
                tjdcfgf18,
                tjdcfgf19,
                tjdcfgf20                
                };
            setColumns(array);
            FieldDef arrayf[] = {tjdcodi,tjdtarea };
            setPrimaryKeys(arrayf);
            tjdcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabJcopreest extends TableDef
        {
        // campos
        public FieldDef jpeestruc;
        public FieldDef jpeidepi;
        public FieldDef jpeepiest;
        public FieldDef jpetipoimp;
        public TabJcopreest(String name)
            {
            super(name);
            jpeestruc = new FieldDef("jpeestruc",FieldDef.CHAR,3,FieldDef.NOTNULL);
            jpeidepi = new FieldDef("jpeidepi",FieldDef.CHAR,15,FieldDef.NOTNULL);
            jpeepiest = new FieldDef("jpeepiest",FieldDef.CHAR,6,FieldDef.NOTNULL);
            jpetipoimp = new FieldDef("jpetipoimp",FieldDef.CHAR,1);
            FieldDef array[] = {
                jpeestruc,
                jpeidepi,
                jpeepiest,
                jpetipoimp                
                };
            setColumns(array);
            FieldDef arrayf[] = {jpeestruc,jpeidepi,jpeepiest };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabJcoratis extends TableDef
        {
        // campos
        public FieldDef jpeidrati;
        public FieldDef jpenomrati;
        public FieldDef jpenumer;
        public FieldDef jpedenom;
        public FieldDef jpedesc;
        public FieldDef jpemin;
        public FieldDef jpemax;
        public FieldDef jpedescmin;
        public FieldDef jpedescmax;
        public FieldDef jpedescok;
        public TabJcoratis(String name)
            {
            super(name);
            jpeidrati = new FieldDef("jpeidrati",FieldDef.CHAR,3,FieldDef.NOTNULL);
            jpenomrati = new FieldDef("jpenomrati",FieldDef.CHAR,30);
            jpenumer = new FieldDef("jpenumer",FieldDef.CHAR,255);
            jpedenom = new FieldDef("jpedenom",FieldDef.CHAR,255);
            jpedesc = new FieldDef("jpedesc",FieldDef.CHAR,2000);
            jpemin = new FieldDef("jpemin",FieldDef.FLOAT,6,0);
            jpemax = new FieldDef("jpemax",FieldDef.FLOAT,6,0);
            jpedescmin = new FieldDef("jpedescmin",FieldDef.CHAR,2000);
            jpedescmax = new FieldDef("jpedescmax",FieldDef.CHAR,2000);
            jpedescok = new FieldDef("jpedescok",FieldDef.CHAR,2000);
            FieldDef array[] = {
                jpeidrati,
                jpenomrati,
                jpenumer,
                jpedenom,
                jpedesc,
                jpemin,
                jpemax,
                jpedescmin,
                jpedescmax,
                jpedescok                
                };
            setColumns(array);
            FieldDef arrayf[] = {jpeidrati };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabJcoepigrafe extends TableDef
        {
        // campos
        public FieldDef jepidepi;
        public FieldDef jepdesc;
        public TabJcoepigrafe(String name)
            {
            super(name);
            jepidepi = new FieldDef("jepidepi",FieldDef.CHAR,15,FieldDef.NOTNULL);
            jepdesc = new FieldDef("jepdesc",FieldDef.CHAR,40);
            FieldDef array[] = {
                jepidepi,
                jepdesc                
                };
            setColumns(array);
            FieldDef arrayf[] = {jepidepi };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabCodcnvotraplc extends TableDef
        {
        // campos
        public FieldDef ccocodi;
        public FieldDef ccoaplic;
        public FieldDef ccofecha;
        public FieldDef ccoservidor;
        public FieldDef ccoinstancia;
        public FieldDef ccouserbd;
        public FieldDef ccopwdbd;
        public FieldDef ccobbdd;
        public FieldDef ccousuario;
        public FieldDef ccohistorico;
        public FieldDef ccoempini;
        public FieldDef ccoempfin;
        public FieldDef ccoejeini;
        public FieldDef ccoejefin;
        public FieldDef ccotraspjco;
        public FieldDef ccotraspjeo;
        public FieldDef ccotraspjre;
        public FieldDef ccotraspjsoc;
        public FieldDef ccotraspjges;
        public FieldDef ccotraspjnom;
        public FieldDef ccojcotipocta;
        public FieldDef ccojcoctamayor;
        public FieldDef ccojcocanales;
        public FieldDef ccojcosql;
        public FieldDef ccoestimacion;
        public FieldDef ccomercantil;
        public FieldDef ccomodelos;
        public FieldDef ccodecdesde;
        public FieldDef ccodechasta;
        public FieldDef ccodecsimul;
        public FieldDef ccodepartamento;
        public TabCodcnvotraplc(String name)
            {
            super(name);
            ccocodi = new FieldDef("ccocodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ccoaplic = new FieldDef("ccoaplic",FieldDef.CHAR,15);
            ccofecha = new FieldDef("ccofecha",FieldDef.DATE);
            ccoservidor = new FieldDef("ccoservidor",FieldDef.CHAR,50);
            ccoinstancia = new FieldDef("ccoinstancia",FieldDef.CHAR,50);
            ccouserbd = new FieldDef("ccouserbd",FieldDef.CHAR,25);
            ccopwdbd = new FieldDef("ccopwdbd",FieldDef.CHAR,25);
            ccobbdd = new FieldDef("ccobbdd",FieldDef.CHAR,50);
            ccousuario = new FieldDef("ccousuario",FieldDef.CHAR,15);
            ccohistorico = new FieldDef("ccohistorico",FieldDef.CHAR,1);
            ccoempini = new FieldDef("ccoempini",FieldDef.INTEGER,0);
            ccoempfin = new FieldDef("ccoempfin",FieldDef.INTEGER,0);
            ccoejeini = new FieldDef("ccoejeini",FieldDef.INTEGER,0);
            ccoejefin = new FieldDef("ccoejefin",FieldDef.INTEGER,0);
            ccotraspjco = new FieldDef("ccotraspjco",FieldDef.CHAR,1);
            ccotraspjeo = new FieldDef("ccotraspjeo",FieldDef.CHAR,1);
            ccotraspjre = new FieldDef("ccotraspjre",FieldDef.CHAR,1);
            ccotraspjsoc = new FieldDef("ccotraspjsoc",FieldDef.CHAR,1);
            ccotraspjges = new FieldDef("ccotraspjges",FieldDef.CHAR,1);
            ccotraspjnom = new FieldDef("ccotraspjnom",FieldDef.CHAR,1);
            ccojcotipocta = new FieldDef("ccojcotipocta",FieldDef.CHAR,1);
            ccojcoctamayor = new FieldDef("ccojcoctamayor",FieldDef.CHAR,1);
            ccojcocanales = new FieldDef("ccojcocanales",FieldDef.CHAR,1);
            ccojcosql = new FieldDef("ccojcosql",FieldDef.CHAR,1);
            ccoestimacion = new FieldDef("ccoestimacion",FieldDef.CHAR,1);
            ccomercantil = new FieldDef("ccomercantil",FieldDef.CHAR,1);
            ccomodelos = new FieldDef("ccomodelos",FieldDef.CHAR,1);
            ccodecdesde = new FieldDef("ccodecdesde",FieldDef.CHAR,15);
            ccodechasta = new FieldDef("ccodechasta",FieldDef.CHAR,15);
            ccodecsimul = new FieldDef("ccodecsimul",FieldDef.CHAR,1);
            ccodepartamento = new FieldDef("ccodepartamento",FieldDef.CHAR,1);
            FieldDef array[] = {
                ccocodi,
                ccoaplic,
                ccofecha,
                ccoservidor,
                ccoinstancia,
                ccouserbd,
                ccopwdbd,
                ccobbdd,
                ccousuario,
                ccohistorico,
                ccoempini,
                ccoempfin,
                ccoejeini,
                ccoejefin,
                ccotraspjco,
                ccotraspjeo,
                ccotraspjre,
                ccotraspjsoc,
                ccotraspjges,
                ccotraspjnom,
                ccojcotipocta,
                ccojcoctamayor,
                ccojcocanales,
                ccojcosql,
                ccoestimacion,
                ccomercantil,
                ccomodelos,
                ccodecdesde,
                ccodechasta,
                ccodecsimul,
                ccodepartamento                
                };
            setColumns(array);
            FieldDef arrayf[] = {ccocodi };
            setPrimaryKeys(arrayf);
            ccocodi.setAutoIncrementable(true);
            ccodecdesde.setDescription("Desde declarante");
            ccodechasta.setDescription("Hasta declarante");
            ccodecsimul.setDescription("Simulacion");
            }
        }
        
    public class TabCodcnvotrapll extends TableDef
        {
        // campos
        public FieldDef cclcodi;
        public FieldDef cclccocodi;
        public FieldDef cclsel;
        public FieldDef cclcodiorigen;
        public FieldDef cclcodiorigens;
        public FieldDef cclnombre;
        public FieldDef cclnif;
        public FieldDef cclcodigeyce;
        public FieldDef ccltraspjco;
        public FieldDef ccltraspjeo;
        public FieldDef ccltraspjre;
        public FieldDef ccltraspjsoc;
        public FieldDef ccltraspjges;
        public FieldDef ccltraspjnom;
        public TabCodcnvotrapll(String name)
            {
            super(name);
            cclcodi = new FieldDef("cclcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            cclccocodi = new FieldDef("cclccocodi",FieldDef.INTEGER,0);
            cclsel = new FieldDef("cclsel",FieldDef.CHAR,1);
            cclcodiorigen = new FieldDef("cclcodiorigen",FieldDef.INTEGER,0);
            cclcodiorigens = new FieldDef("cclcodiorigens",FieldDef.CHAR,15);
            cclnombre = new FieldDef("cclnombre",FieldDef.CHAR,255);
            cclnif = new FieldDef("cclnif",FieldDef.CHAR,15);
            cclcodigeyce = new FieldDef("cclcodigeyce",FieldDef.INTEGER,0);
            ccltraspjco = new FieldDef("ccltraspjco",FieldDef.CHAR,1);
            ccltraspjeo = new FieldDef("ccltraspjeo",FieldDef.CHAR,1);
            ccltraspjre = new FieldDef("ccltraspjre",FieldDef.CHAR,1);
            ccltraspjsoc = new FieldDef("ccltraspjsoc",FieldDef.CHAR,1);
            ccltraspjges = new FieldDef("ccltraspjges",FieldDef.CHAR,1);
            ccltraspjnom = new FieldDef("ccltraspjnom",FieldDef.CHAR,1);
            FieldDef array[] = {
                cclcodi,
                cclccocodi,
                cclsel,
                cclcodiorigen,
                cclcodiorigens,
                cclnombre,
                cclnif,
                cclcodigeyce,
                ccltraspjco,
                ccltraspjeo,
                ccltraspjre,
                ccltraspjsoc,
                ccltraspjges,
                ccltraspjnom                
                };
            setColumns(array);
            FieldDef arrayf[] = {cclcodi };
            setPrimaryKeys(arrayf);
            cclcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabCodcnvinciden extends TableDef
        {
        // campos
        public FieldDef ccicodi;
        public FieldDef cciccocodi;
        public FieldDef ccicodiorigen;
        public FieldDef ccicodiorigens;
        public FieldDef ccicodigeyce;
        public FieldDef cciejercicio;
        public FieldDef ccinombre;
        public FieldDef ccinif;
        public FieldDef cciaplic;
        public FieldDef ccimsg;
        public TabCodcnvinciden(String name)
            {
            super(name);
            ccicodi = new FieldDef("ccicodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            cciccocodi = new FieldDef("cciccocodi",FieldDef.INTEGER,0);
            ccicodiorigen = new FieldDef("ccicodiorigen",FieldDef.INTEGER,0);
            ccicodiorigens = new FieldDef("ccicodiorigens",FieldDef.CHAR,15);
            ccicodigeyce = new FieldDef("ccicodigeyce",FieldDef.INTEGER,0);
            cciejercicio = new FieldDef("cciejercicio",FieldDef.INTEGER,0);
            ccinombre = new FieldDef("ccinombre",FieldDef.CHAR,255);
            ccinif = new FieldDef("ccinif",FieldDef.CHAR,15);
            cciaplic = new FieldDef("cciaplic",FieldDef.CHAR,15);
            ccimsg = new FieldDef("ccimsg",FieldDef.CHAR,255);
            FieldDef array[] = {
                ccicodi,
                cciccocodi,
                ccicodiorigen,
                ccicodiorigens,
                ccicodigeyce,
                cciejercicio,
                ccinombre,
                ccinif,
                cciaplic,
                ccimsg                
                };
            setColumns(array);
            FieldDef arrayf[] = {ccicodi };
            setPrimaryKeys(arrayf);
            ccicodi.setAutoIncrementable(true);
            }
        }
        
    public class TabLibregmerext extends TableDef
        {
        // campos
        public FieldDef lbgcodi;
        public FieldDef lbgempjco;
        public FieldDef lbgejercicio;
        public FieldDef lbgtipo;
        public FieldDef lbgruta;
        public FieldDef lbgnumero;
        public TabLibregmerext(String name)
            {
            super(name);
            lbgcodi = new FieldDef("lbgcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            lbgempjco = new FieldDef("lbgempjco",FieldDef.INTEGER,0);
            lbgejercicio = new FieldDef("lbgejercicio",FieldDef.INTEGER,0);
            lbgtipo = new FieldDef("lbgtipo",FieldDef.CHAR,15);
            lbgruta = new FieldDef("lbgruta",FieldDef.CHAR,255);
            lbgnumero = new FieldDef("lbgnumero",FieldDef.INTEGER,0);
            FieldDef array[] = {
                lbgcodi,
                lbgempjco,
                lbgejercicio,
                lbgtipo,
                lbgruta,
                lbgnumero                
                };
            setColumns(array);
            FieldDef arrayf[] = {lbgcodi };
            setPrimaryKeys(arrayf);
            lbgcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabLogjcontax extends TableDef
        {
        // campos
        public FieldDef lgxcodi;
        public FieldDef lgxemp;
        public FieldDef lgxejercicio;
        public FieldDef lgxfecha;
        public FieldDef lgxhora;
        public FieldDef lgxusuario;
        public FieldDef lgxenvrec;
        public FieldDef lgxcdpafinity;
        public TabLogjcontax(String name)
            {
            super(name);
            lgxcodi = new FieldDef("lgxcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            lgxemp = new FieldDef("lgxemp",FieldDef.INTEGER,0);
            lgxejercicio = new FieldDef("lgxejercicio",FieldDef.INTEGER,0);
            lgxfecha = new FieldDef("lgxfecha",FieldDef.DATE);
            lgxhora = new FieldDef("lgxhora",FieldDef.CHAR,8);
            lgxusuario = new FieldDef("lgxusuario",FieldDef.CHAR,25);
            lgxenvrec = new FieldDef("lgxenvrec",FieldDef.CHAR,1);
            lgxcdpafinity = new FieldDef("lgxcdpafinity",FieldDef.CHAR,12);
            FieldDef array[] = {
                lgxcodi,
                lgxemp,
                lgxejercicio,
                lgxfecha,
                lgxhora,
                lgxusuario,
                lgxenvrec,
                lgxcdpafinity                
                };
            setColumns(array);
            FieldDef arrayf[] = {lgxcodi };
            setPrimaryKeys(arrayf);
            lgxcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabAvisos extends TableDef
        {
        // campos
        public FieldDef avcodigo;
        public FieldDef avaplicacion;
        public FieldDef avcodcdp;
        public FieldDef avempresa;
        public FieldDef avnomempresa;
        public FieldDef avtrabajador;
        public FieldDef avnomtrabaj;
        public FieldDef avrelacion;
        public FieldDef avcentro;
        public FieldDef avcodincid;
        public FieldDef avcodfiniq;
        public FieldDef avcodbonif;
        public FieldDef avcodactivi;
        public FieldDef avnomactivi;
        public FieldDef avdeclara;
        public FieldDef avcodotr1;
        public FieldDef avcodotr2;
        public FieldDef avcodotr3;
        public FieldDef avejercicio;
        public FieldDef avperiodo;
        public FieldDef avtiporeco;
        public FieldDef avtipoaviso;
        public FieldDef avtitulo;
        public FieldDef avorigen;
        public FieldDef avestado;
        public FieldDef avestadoctrl;
        public FieldDef avurgencia;
        public FieldDef avdescrip;
        public FieldDef avfechacrea;
        public FieldDef avresponscrea;
        public FieldDef avresponsorig;
        public FieldDef avfechaorig;
        public FieldDef avhoraorig;
        public FieldDef avresponsvenc;
        public FieldDef avfechavenci;
        public FieldDef avhoravenci;
        public FieldDef avfechasolu;
        public FieldDef avresponssolu;
        public FieldDef avhorasolu;
        public FieldDef avresponsrevi;
        public FieldDef avfecharevi;
        public FieldDef avhorarevi;
        public TabAvisos(String name)
            {
            super(name);
            avcodigo = new FieldDef("avcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            avaplicacion = new FieldDef("avaplicacion",FieldDef.CHAR,15);
            avcodcdp = new FieldDef("avcodcdp",FieldDef.CHAR,12);
            avempresa = new FieldDef("avempresa",FieldDef.INTEGER,0);
            avnomempresa = new FieldDef("avnomempresa",FieldDef.CHAR,35);
            avtrabajador = new FieldDef("avtrabajador",FieldDef.INTEGER,0);
            avnomtrabaj = new FieldDef("avnomtrabaj",FieldDef.CHAR,35);
            avrelacion = new FieldDef("avrelacion",FieldDef.INTEGER,0);
            avcentro = new FieldDef("avcentro",FieldDef.INTEGER,0);
            avcodincid = new FieldDef("avcodincid",FieldDef.INTEGER,0);
            avcodfiniq = new FieldDef("avcodfiniq",FieldDef.INTEGER,0);
            avcodbonif = new FieldDef("avcodbonif",FieldDef.INTEGER,0);
            avcodactivi = new FieldDef("avcodactivi",FieldDef.INTEGER,0);
            avnomactivi = new FieldDef("avnomactivi",FieldDef.CHAR,35);
            avdeclara = new FieldDef("avdeclara",FieldDef.CHAR,12);
            avcodotr1 = new FieldDef("avcodotr1",FieldDef.INTEGER,0);
            avcodotr2 = new FieldDef("avcodotr2",FieldDef.INTEGER,0);
            avcodotr3 = new FieldDef("avcodotr3",FieldDef.INTEGER,0);
            avejercicio = new FieldDef("avejercicio",FieldDef.INTEGER,0);
            avperiodo = new FieldDef("avperiodo",FieldDef.INTEGER,0);
            avtiporeco = new FieldDef("avtiporeco",FieldDef.CHAR,5);
            avtipoaviso = new FieldDef("avtipoaviso",FieldDef.CHAR,10);
            avtitulo = new FieldDef("avtitulo",FieldDef.CHAR,250);
            avorigen = new FieldDef("avorigen",FieldDef.CHAR,1);
            avestado = new FieldDef("avestado",FieldDef.CHAR,2);
            avestadoctrl = new FieldDef("avestadoctrl",FieldDef.CHAR,2);
            avurgencia = new FieldDef("avurgencia",FieldDef.INTEGER,0);
            avdescrip = new FieldDef("avdescrip",FieldDef.CHAR,2000);
            avfechacrea = new FieldDef("avfechacrea",FieldDef.DATE);
            avresponscrea = new FieldDef("avresponscrea",FieldDef.CHAR,25);
            avresponsorig = new FieldDef("avresponsorig",FieldDef.CHAR,25);
            avfechaorig = new FieldDef("avfechaorig",FieldDef.DATE);
            avhoraorig = new FieldDef("avhoraorig",FieldDef.CHAR,8);
            avresponsvenc = new FieldDef("avresponsvenc",FieldDef.CHAR,25);
            avfechavenci = new FieldDef("avfechavenci",FieldDef.DATE);
            avhoravenci = new FieldDef("avhoravenci",FieldDef.CHAR,8);
            avfechasolu = new FieldDef("avfechasolu",FieldDef.DATE);
            avresponssolu = new FieldDef("avresponssolu",FieldDef.CHAR,25);
            avhorasolu = new FieldDef("avhorasolu",FieldDef.CHAR,8);
            avresponsrevi = new FieldDef("avresponsrevi",FieldDef.CHAR,25);
            avfecharevi = new FieldDef("avfecharevi",FieldDef.DATE);
            avhorarevi = new FieldDef("avhorarevi",FieldDef.CHAR,8);
            FieldDef array[] = {
                avcodigo,
                avaplicacion,
                avcodcdp,
                avempresa,
                avnomempresa,
                avtrabajador,
                avnomtrabaj,
                avrelacion,
                avcentro,
                avcodincid,
                avcodfiniq,
                avcodbonif,
                avcodactivi,
                avnomactivi,
                avdeclara,
                avcodotr1,
                avcodotr2,
                avcodotr3,
                avejercicio,
                avperiodo,
                avtiporeco,
                avtipoaviso,
                avtitulo,
                avorigen,
                avestado,
                avestadoctrl,
                avurgencia,
                avdescrip,
                avfechacrea,
                avresponscrea,
                avresponsorig,
                avfechaorig,
                avhoraorig,
                avresponsvenc,
                avfechavenci,
                avhoravenci,
                avfechasolu,
                avresponssolu,
                avhorasolu,
                avresponsrevi,
                avfecharevi,
                avhorarevi                
                };
            setColumns(array);
            FieldDef arrayf[] = {avcodigo };
            setPrimaryKeys(arrayf);
            avcodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabJcoimpexcel extends TableDef
        {
        // campos
        public FieldDef jcecodigo;
        public FieldDef jceempresa;
        public FieldDef jcetodasemp;
        public FieldDef jcedesc;
        public FieldDef jcetipo;
        public FieldDef jceruta;
        public FieldDef jcehoja;
        public FieldDef jce1lin;
        public FieldDef jceulin;
        public FieldDef jcedefcol;
        public FieldDef jcelmin;
        public FieldDef jcelctamay;
        public FieldDef jcedefcta;
        public TabJcoimpexcel(String name)
            {
            super(name);
            jcecodigo = new FieldDef("jcecodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            jceempresa = new FieldDef("jceempresa",FieldDef.INTEGER,0);
            jcetodasemp = new FieldDef("jcetodasemp",FieldDef.CHAR,1);
            jcedesc = new FieldDef("jcedesc",FieldDef.CHAR,255);
            jcetipo = new FieldDef("jcetipo",FieldDef.CHAR,2);
            jceruta = new FieldDef("jceruta",FieldDef.CHAR,155);
            jcehoja = new FieldDef("jcehoja",FieldDef.CHAR,50);
            jce1lin = new FieldDef("jce1lin",FieldDef.INTEGER,0);
            jceulin = new FieldDef("jceulin",FieldDef.INTEGER,0);
            jcedefcol = new FieldDef("jcedefcol",FieldDef.CHAR,4000);
            jcelmin = new FieldDef("jcelmin",FieldDef.INTEGER,0);
            jcelctamay = new FieldDef("jcelctamay",FieldDef.INTEGER,0);
            jcedefcta = new FieldDef("jcedefcta",FieldDef.CHAR,4000);
            FieldDef array[] = {
                jcecodigo,
                jceempresa,
                jcetodasemp,
                jcedesc,
                jcetipo,
                jceruta,
                jcehoja,
                jce1lin,
                jceulin,
                jcedefcol,
                jcelmin,
                jcelctamay,
                jcedefcta                
                };
            setColumns(array);
            FieldDef arrayf[] = {jcecodigo };
            setPrimaryKeys(arrayf);
            jcecodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabEstilos extends TableDef
        {
        // campos
        public FieldDef estcodigo;
        public FieldDef estnombre;
        public FieldDef estcolor;
        public FieldDef estfuente;
        public FieldDef estnegrita;
        public FieldDef estcursiva;
        public FieldDef estauxi1;
        public FieldDef estauxi2;
        public FieldDef estauxi3;
        public FieldDef estauxa1;
        public FieldDef estauxa2;
        public FieldDef estauxa3;
        public TabEstilos(String name)
            {
            super(name);
            estcodigo = new FieldDef("estcodigo",FieldDef.CHAR,10);
            estnombre = new FieldDef("estnombre",FieldDef.CHAR,30,FieldDef.NOTNULL);
            estcolor = new FieldDef("estcolor",FieldDef.CHAR,7);
            estfuente = new FieldDef("estfuente",FieldDef.INTEGER,0);
            estnegrita = new FieldDef("estnegrita",FieldDef.CHAR,1);
            estcursiva = new FieldDef("estcursiva",FieldDef.CHAR,1);
            estauxi1 = new FieldDef("estauxi1",FieldDef.INTEGER,0);
            estauxi2 = new FieldDef("estauxi2",FieldDef.INTEGER,0);
            estauxi3 = new FieldDef("estauxi3",FieldDef.INTEGER,0);
            estauxa1 = new FieldDef("estauxa1",FieldDef.CHAR,100);
            estauxa2 = new FieldDef("estauxa2",FieldDef.CHAR,100);
            estauxa3 = new FieldDef("estauxa3",FieldDef.CHAR,100);
            FieldDef array[] = {
                estcodigo,
                estnombre,
                estcolor,
                estfuente,
                estnegrita,
                estcursiva,
                estauxi1,
                estauxi2,
                estauxi3,
                estauxa1,
                estauxa2,
                estauxa3                
                };
            setColumns(array);
            FieldDef arrayf[] = {estcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabInfplantilla extends TableDef
        {
        // campos
        public FieldDef ipcodplant;
        public FieldDef ipdesc;
        public FieldDef ipmostrar0;
        public TabInfplantilla(String name)
            {
            super(name);
            ipcodplant = new FieldDef("ipcodplant",FieldDef.CHAR,10,FieldDef.NOTNULL);
            ipdesc = new FieldDef("ipdesc",FieldDef.CHAR,60,FieldDef.NOTNULL);
            ipmostrar0 = new FieldDef("ipmostrar0",FieldDef.CHAR,1);
            FieldDef array[] = {
                ipcodplant,
                ipdesc,
                ipmostrar0                
                };
            setColumns(array);
            FieldDef arrayf[] = {ipcodplant };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabInfplantlinea extends TableDef
        {
        // campos
        public FieldDef iplcodigo;
        public FieldDef iplcodplant;
        public FieldDef iplnumero;
        public FieldDef iplcodlin;
        public FieldDef ipldesc;
        public FieldDef ipltotalizar;
        public FieldDef ipltotaldesc;
        public FieldDef ipldesde;
        public FieldDef iplhasta;
        public FieldDef iplmayor;
        public FieldDef iplformula;
        public FieldDef iplestilo;
        public FieldDef iplestilot;
        public TabInfplantlinea(String name)
            {
            super(name);
            iplcodigo = new FieldDef("iplcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            iplcodplant = new FieldDef("iplcodplant",FieldDef.CHAR,10,FieldDef.NOTNULL);
            iplnumero = new FieldDef("iplnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            iplcodlin = new FieldDef("iplcodlin",FieldDef.CHAR,20);
            ipldesc = new FieldDef("ipldesc",FieldDef.CHAR,60);
            ipltotalizar = new FieldDef("ipltotalizar",FieldDef.CHAR,1);
            ipltotaldesc = new FieldDef("ipltotaldesc",FieldDef.CHAR,60);
            ipldesde = new FieldDef("ipldesde",FieldDef.CHAR,17);
            iplhasta = new FieldDef("iplhasta",FieldDef.CHAR,17);
            iplmayor = new FieldDef("iplmayor",FieldDef.CHAR,1);
            iplformula = new FieldDef("iplformula",FieldDef.CHAR,255);
            iplestilo = new FieldDef("iplestilo",FieldDef.CHAR,10);
            iplestilot = new FieldDef("iplestilot",FieldDef.CHAR,10);
            FieldDef array[] = {
                iplcodigo,
                iplcodplant,
                iplnumero,
                iplcodlin,
                ipldesc,
                ipltotalizar,
                ipltotaldesc,
                ipldesde,
                iplhasta,
                iplmayor,
                iplformula,
                iplestilo,
                iplestilot                
                };
            setColumns(array);
            FieldDef arrayf[] = {iplcodigo };
            setPrimaryKeys(arrayf);
            iplcodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabInfplantcol extends TableDef
        {
        // campos
        public FieldDef ipccodigo;
        public FieldDef ipccodplant;
        public FieldDef ipcnumero;
        public FieldDef ipcdesc;
        public FieldDef ipcejercol;
        public FieldDef ipcdesdemes;
        public FieldDef ipchastames;
        public FieldDef ipcpositivos;
        public FieldDef ipctiposaldo;
        public FieldDef ipcformula;
        public TabInfplantcol(String name)
            {
            super(name);
            ipccodigo = new FieldDef("ipccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ipccodplant = new FieldDef("ipccodplant",FieldDef.CHAR,10,FieldDef.NOTNULL);
            ipcnumero = new FieldDef("ipcnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ipcdesc = new FieldDef("ipcdesc",FieldDef.CHAR,30);
            ipcejercol = new FieldDef("ipcejercol",FieldDef.INTEGER,0);
            ipcdesdemes = new FieldDef("ipcdesdemes",FieldDef.INTEGER,0);
            ipchastames = new FieldDef("ipchastames",FieldDef.INTEGER,0);
            ipcpositivos = new FieldDef("ipcpositivos",FieldDef.CHAR,1);
            ipctiposaldo = new FieldDef("ipctiposaldo",FieldDef.CHAR,1);
            ipcformula = new FieldDef("ipcformula",FieldDef.CHAR,255);
            FieldDef array[] = {
                ipccodigo,
                ipccodplant,
                ipcnumero,
                ipcdesc,
                ipcejercol,
                ipcdesdemes,
                ipchastames,
                ipcpositivos,
                ipctiposaldo,
                ipcformula                
                };
            setColumns(array);
            FieldDef arrayf[] = {ipccodigo };
            setPrimaryKeys(arrayf);
            ipccodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabValidanomaeat extends TableDef
        {
        // campos
        public FieldDef vnacodi;
        public FieldDef vnacodigoemp;
        public FieldDef vnanombreemp;
        public FieldDef vnacodigo;
        public FieldDef vnanombre;
        public FieldDef vnanif;
        public FieldDef vnaestadoaeat;
        public FieldDef vnanombreaeat;
        public FieldDef vnanom;
        public FieldDef vnaapell1;
        public FieldDef vnaapell2;
        public FieldDef vnaestadoctrl;
        public FieldDef vnafechactrl;
        public FieldDef vnabasedatos;
        public FieldDef vnatabla;
        public FieldDef vnanifemp;
        public TabValidanomaeat(String name)
            {
            super(name);
            vnacodi = new FieldDef("vnacodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            vnacodigoemp = new FieldDef("vnacodigoemp",FieldDef.INTEGER,0);
            vnanombreemp = new FieldDef("vnanombreemp",FieldDef.CHAR,40);
            vnacodigo = new FieldDef("vnacodigo",FieldDef.CHAR,100);
            vnanombre = new FieldDef("vnanombre",FieldDef.CHAR,200);
            vnanif = new FieldDef("vnanif",FieldDef.CHAR,15);
            vnaestadoaeat = new FieldDef("vnaestadoaeat",FieldDef.CHAR,15);
            vnanombreaeat = new FieldDef("vnanombreaeat",FieldDef.CHAR,200);
            vnanom = new FieldDef("vnanom",FieldDef.CHAR,50);
            vnaapell1 = new FieldDef("vnaapell1",FieldDef.CHAR,100);
            vnaapell2 = new FieldDef("vnaapell2",FieldDef.CHAR,50);
            vnaestadoctrl = new FieldDef("vnaestadoctrl",FieldDef.CHAR,15);
            vnafechactrl = new FieldDef("vnafechactrl",FieldDef.DATE);
            vnabasedatos = new FieldDef("vnabasedatos",FieldDef.CHAR,15);
            vnatabla = new FieldDef("vnatabla",FieldDef.CHAR,15);
            vnanifemp = new FieldDef("vnanifemp",FieldDef.CHAR,15);
            FieldDef array[] = {
                vnacodi,
                vnacodigoemp,
                vnanombreemp,
                vnacodigo,
                vnanombre,
                vnanif,
                vnaestadoaeat,
                vnanombreaeat,
                vnanom,
                vnaapell1,
                vnaapell2,
                vnaestadoctrl,
                vnafechactrl,
                vnabasedatos,
                vnatabla,
                vnanifemp                
                };
            setColumns(array);
            FieldDef arrayf[] = {vnacodi };
            setPrimaryKeys(arrayf);
            vnacodi.setAutoIncrementable(true);
            }
        }
        
    public class TabJcocnvprc extends TableDef
        {
        // campos
        public FieldDef jcnprcodi;
        public FieldDef jcnprtipo;
        public FieldDef jcnprempresa;
        public FieldDef jcnprfecha;
        public FieldDef jcnpruser;
        public TabJcocnvprc(String name)
            {
            super(name);
            jcnprcodi = new FieldDef("jcnprcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            jcnprtipo = new FieldDef("jcnprtipo",FieldDef.CHAR,20);
            jcnprempresa = new FieldDef("jcnprempresa",FieldDef.INTEGER,0);
            jcnprfecha = new FieldDef("jcnprfecha",FieldDef.DATE);
            jcnpruser = new FieldDef("jcnpruser",FieldDef.CHAR,25);
            FieldDef array[] = {
                jcnprcodi,
                jcnprtipo,
                jcnprempresa,
                jcnprfecha,
                jcnpruser                
                };
            setColumns(array);
            FieldDef arrayf[] = {jcnprcodi };
            setPrimaryKeys(arrayf);
            jcnprcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabPcinmovlog extends TableDef
        {
        // campos
        public FieldDef pcilcodi;
        public FieldDef pciltipo;
        public FieldDef pcilrempresa;
        public FieldDef pcilrfecha;
        public FieldDef pcilruser;
        public FieldDef pcilprcorigen;
        public TabPcinmovlog(String name)
            {
            super(name);
            pcilcodi = new FieldDef("pcilcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pciltipo = new FieldDef("pciltipo",FieldDef.CHAR,20);
            pcilrempresa = new FieldDef("pcilrempresa",FieldDef.INTEGER,0);
            pcilrfecha = new FieldDef("pcilrfecha",FieldDef.DATE);
            pcilruser = new FieldDef("pcilruser",FieldDef.CHAR,25);
            pcilprcorigen = new FieldDef("pcilprcorigen",FieldDef.CHAR,100);
            FieldDef array[] = {
                pcilcodi,
                pciltipo,
                pcilrempresa,
                pcilrfecha,
                pcilruser,
                pcilprcorigen                
                };
            setColumns(array);
            FieldDef arrayf[] = {pcilcodi };
            setPrimaryKeys(arrayf);
            pcilcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabPcinmovhis extends TableDef
        {
        // campos
        public FieldDef pcihelemento;
        public FieldDef pcihempresa;
        public FieldDef pcihejercicio;
        public FieldDef pcihcuenta;
        public FieldDef pcihsubcuenta;
        public FieldDef pciharticulo;
        public FieldDef pcihtipoamort;
        public FieldDef pcihcodigoamor;
        public FieldDef pcihdesc;
        public FieldDef pcihsubctaamort;
        public FieldDef pcihregistro;
        public FieldDef pcihctadot;
        public FieldDef pcihhoras;
        public FieldDef pcihsubctadot;
        public FieldDef pcihcoefapli;
        public FieldDef pcihfecalta;
        public FieldDef pcihfecbaja;
        public FieldDef pcihctaamort;
        public FieldDef pcihcoste;
        public FieldDef pcihperapli;
        public FieldDef pcihadquis;
        public FieldDef pcihfecplan;
        public FieldDef pcihunidades;
        public FieldDef pcihreserva;
        public FieldDef pcihnoamort;
        public FieldDef pcihnuevousado;
        public FieldDef pcihobser;
        public FieldDef pcihlog;
        public FieldDef pcihcodini;
        public FieldDef pcihfradoc;
        public FieldDef pcihfrafecha;
        public FieldDef pcihfratotal;
        public FieldDef pcihfrabase;
        public FieldDef pcihfracuota;
        public FieldDef pcihfraporc;
        public FieldDef pcihnifprov;
        public FieldDef pcihnomprov;
        public FieldDef pcihcausabaja;
        public FieldDef pcihproyecto;
        public FieldDef pcihdeparta;
        public FieldDef pcihanyosreg;
        public FieldDef pcihdivisor;
        public FieldDef pcihcoefdefi;
        public FieldDef pcihlimiteinver;
        public FieldDef pcihincrplantil;
        public FieldDef pcihcoeffiscal;
        public FieldDef pcihtipofiscal;
        public FieldDef pcihleavresid;
        public FieldDef pcihleaporcint;
        public FieldDef pcihleaespyme;
        public TabPcinmovhis(String name)
            {
            super(name);
            pcihelemento = new FieldDef("pcihelemento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pcihempresa = new FieldDef("pcihempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pcihejercicio = new FieldDef("pcihejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pcihcuenta = new FieldDef("pcihcuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
            pcihsubcuenta = new FieldDef("pcihsubcuenta",FieldDef.CHAR,12,FieldDef.NOTNULL);
            pciharticulo = new FieldDef("pciharticulo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pcihtipoamort = new FieldDef("pcihtipoamort",FieldDef.CHAR,3,FieldDef.NOTNULL);
            pcihcodigoamor = new FieldDef("pcihcodigoamor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pcihdesc = new FieldDef("pcihdesc",FieldDef.CHAR,40);
            pcihsubctaamort = new FieldDef("pcihsubctaamort",FieldDef.CHAR,12);
            pcihregistro = new FieldDef("pcihregistro",FieldDef.CHAR,8);
            pcihctadot = new FieldDef("pcihctadot",FieldDef.CHAR,4);
            pcihhoras = new FieldDef("pcihhoras",FieldDef.FLOAT,6,0);
            pcihsubctadot = new FieldDef("pcihsubctadot",FieldDef.CHAR,12);
            pcihcoefapli = new FieldDef("pcihcoefapli",FieldDef.FLOAT,6,0);
            pcihfecalta = new FieldDef("pcihfecalta",FieldDef.DATE);
            pcihfecbaja = new FieldDef("pcihfecbaja",FieldDef.DATE);
            pcihctaamort = new FieldDef("pcihctaamort",FieldDef.CHAR,4);
            pcihcoste = new FieldDef("pcihcoste",FieldDef.FLOAT,6,0);
            pcihperapli = new FieldDef("pcihperapli",FieldDef.INTEGER,0);
            pcihadquis = new FieldDef("pcihadquis",FieldDef.FLOAT,6,0);
            pcihfecplan = new FieldDef("pcihfecplan",FieldDef.DATE);
            pcihunidades = new FieldDef("pcihunidades",FieldDef.INTEGER,0);
            pcihreserva = new FieldDef("pcihreserva",FieldDef.FLOAT,6,0);
            pcihnoamort = new FieldDef("pcihnoamort",FieldDef.FLOAT,6,0);
            pcihnuevousado = new FieldDef("pcihnuevousado",FieldDef.CHAR,3,FieldDef.NOTNULL);
            pcihobser = new FieldDef("pcihobser",FieldDef.CHAR,2000);
            pcihlog = new FieldDef("pcihlog",FieldDef.INTEGER,0);
            pcihcodini = new FieldDef("pcihcodini",FieldDef.INTEGER,0);
            pcihfradoc = new FieldDef("pcihfradoc",FieldDef.CHAR,60);
            pcihfrafecha = new FieldDef("pcihfrafecha",FieldDef.DATE);
            pcihfratotal = new FieldDef("pcihfratotal",FieldDef.FLOAT,6,0);
            pcihfrabase = new FieldDef("pcihfrabase",FieldDef.FLOAT,6,0);
            pcihfracuota = new FieldDef("pcihfracuota",FieldDef.FLOAT,6,0);
            pcihfraporc = new FieldDef("pcihfraporc",FieldDef.FLOAT,6,0);
            pcihnifprov = new FieldDef("pcihnifprov",FieldDef.CHAR,15);
            pcihnomprov = new FieldDef("pcihnomprov",FieldDef.CHAR,200);
            pcihcausabaja = new FieldDef("pcihcausabaja",FieldDef.CHAR,200);
            pcihproyecto = new FieldDef("pcihproyecto",FieldDef.CHAR,5);
            pcihdeparta = new FieldDef("pcihdeparta",FieldDef.CHAR,5);
            pcihanyosreg = new FieldDef("pcihanyosreg",FieldDef.INTEGER,0);
            pcihdivisor = new FieldDef("pcihdivisor",FieldDef.INTEGER,0);
            pcihcoefdefi = new FieldDef("pcihcoefdefi",FieldDef.FLOAT,6,0);
            pcihlimiteinver = new FieldDef("pcihlimiteinver",FieldDef.FLOAT,0,2);
            pcihincrplantil = new FieldDef("pcihincrplantil",FieldDef.FLOAT,0,2);
            pcihcoeffiscal = new FieldDef("pcihcoeffiscal",FieldDef.FLOAT,0,2);
            pcihtipofiscal = new FieldDef("pcihtipofiscal",FieldDef.CHAR,5);
            pcihleavresid = new FieldDef("pcihleavresid",FieldDef.FLOAT,0,2);
            pcihleaporcint = new FieldDef("pcihleaporcint",FieldDef.FLOAT,0,2);
            pcihleaespyme = new FieldDef("pcihleaespyme",FieldDef.CHAR,1);
            FieldDef array[] = {
                pcihelemento,
                pcihempresa,
                pcihejercicio,
                pcihcuenta,
                pcihsubcuenta,
                pciharticulo,
                pcihtipoamort,
                pcihcodigoamor,
                pcihdesc,
                pcihsubctaamort,
                pcihregistro,
                pcihctadot,
                pcihhoras,
                pcihsubctadot,
                pcihcoefapli,
                pcihfecalta,
                pcihfecbaja,
                pcihctaamort,
                pcihcoste,
                pcihperapli,
                pcihadquis,
                pcihfecplan,
                pcihunidades,
                pcihreserva,
                pcihnoamort,
                pcihnuevousado,
                pcihobser,
                pcihlog,
                pcihcodini,
                pcihfradoc,
                pcihfrafecha,
                pcihfratotal,
                pcihfrabase,
                pcihfracuota,
                pcihfraporc,
                pcihnifprov,
                pcihnomprov,
                pcihcausabaja,
                pcihproyecto,
                pcihdeparta,
                pcihanyosreg,
                pcihdivisor,
                pcihcoefdefi,
                pcihlimiteinver,
                pcihincrplantil,
                pcihcoeffiscal,
                pcihtipofiscal,
                pcihleavresid,
                pcihleaporcint,
                pcihleaespyme                
                };
            setColumns(array);
            FieldDef arrayf[] = {pcihelemento };
            setPrimaryKeys(arrayf);
            pcihelemento.setAutoIncrementable(true);
            }
        }
        
    public class TabPcmoranualhis extends TableDef
        {
        // campos
        public FieldDef pcmhelemento;
        public FieldDef pcmhamorejer;
        public FieldDef pcmhtipo;
        public FieldDef pcmhcoefamort;
        public FieldDef pcmhamortanual;
        public FieldDef pcmhamortacum;
        public FieldDef pcmhamortpdte;
        public FieldDef pcmhultfecha;
        public FieldDef pcmhcuotaapli;
        public FieldDef pcmhporcint;
        public FieldDef pcmhintereses;
        public TabPcmoranualhis(String name)
            {
            super(name);
            pcmhelemento = new FieldDef("pcmhelemento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pcmhamorejer = new FieldDef("pcmhamorejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            pcmhtipo = new FieldDef("pcmhtipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
            pcmhcoefamort = new FieldDef("pcmhcoefamort",FieldDef.FLOAT,6,0);
            pcmhamortanual = new FieldDef("pcmhamortanual",FieldDef.FLOAT,6,0);
            pcmhamortacum = new FieldDef("pcmhamortacum",FieldDef.FLOAT,6,0);
            pcmhamortpdte = new FieldDef("pcmhamortpdte",FieldDef.FLOAT,6,0);
            pcmhultfecha = new FieldDef("pcmhultfecha",FieldDef.DATE);
            pcmhcuotaapli = new FieldDef("pcmhcuotaapli",FieldDef.FLOAT,6,0);
            pcmhporcint = new FieldDef("pcmhporcint",FieldDef.FLOAT,0,2);
            pcmhintereses = new FieldDef("pcmhintereses",FieldDef.FLOAT,0,2);
            FieldDef array[] = {
                pcmhelemento,
                pcmhamorejer,
                pcmhtipo,
                pcmhcoefamort,
                pcmhamortanual,
                pcmhamortacum,
                pcmhamortpdte,
                pcmhultfecha,
                pcmhcuotaapli,
                pcmhporcint,
                pcmhintereses                
                };
            setColumns(array);
            FieldDef arrayf[] = {pcmhelemento,pcmhamorejer,pcmhtipo };
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
        public FieldDef pcicodini;
        public FieldDef pcifradoc;
        public FieldDef pcifrafecha;
        public FieldDef pcifratotal;
        public FieldDef pcifrabase;
        public FieldDef pcifracuota;
        public FieldDef pcifraporc;
        public FieldDef pcinifprov;
        public FieldDef pcinomprov;
        public FieldDef pcicausabaja;
        public FieldDef pciproyecto;
        public FieldDef pcideparta;
        public FieldDef pcianyosreg;
        public FieldDef pcidivisor;
        public FieldDef pcicoefdefi;
        public FieldDef pcilimiteinver;
        public FieldDef pciincrplantil;
        public FieldDef pcicoeffiscal;
        public FieldDef pcitipofiscal;
        public FieldDef pcileavresid;
        public FieldDef pcileaporcint;
        public FieldDef pcileaespyme;
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
            pcicodini = new FieldDef("pcicodini",FieldDef.INTEGER,0);
            pcifradoc = new FieldDef("pcifradoc",FieldDef.CHAR,60);
            pcifrafecha = new FieldDef("pcifrafecha",FieldDef.DATE);
            pcifratotal = new FieldDef("pcifratotal",FieldDef.FLOAT,6,0);
            pcifrabase = new FieldDef("pcifrabase",FieldDef.FLOAT,6,0);
            pcifracuota = new FieldDef("pcifracuota",FieldDef.FLOAT,6,0);
            pcifraporc = new FieldDef("pcifraporc",FieldDef.FLOAT,6,0);
            pcinifprov = new FieldDef("pcinifprov",FieldDef.CHAR,15);
            pcinomprov = new FieldDef("pcinomprov",FieldDef.CHAR,200);
            pcicausabaja = new FieldDef("pcicausabaja",FieldDef.CHAR,200);
            pciproyecto = new FieldDef("pciproyecto",FieldDef.CHAR,5);
            pcideparta = new FieldDef("pcideparta",FieldDef.CHAR,5);
            pcianyosreg = new FieldDef("pcianyosreg",FieldDef.INTEGER,0);
            pcidivisor = new FieldDef("pcidivisor",FieldDef.INTEGER,0);
            pcicoefdefi = new FieldDef("pcicoefdefi",FieldDef.FLOAT,6,0);
            pcilimiteinver = new FieldDef("pcilimiteinver",FieldDef.FLOAT,0,2);
            pciincrplantil = new FieldDef("pciincrplantil",FieldDef.FLOAT,0,2);
            pcicoeffiscal = new FieldDef("pcicoeffiscal",FieldDef.FLOAT,0,2);
            pcitipofiscal = new FieldDef("pcitipofiscal",FieldDef.CHAR,5);
            pcileavresid = new FieldDef("pcileavresid",FieldDef.FLOAT,0,2);
            pcileaporcint = new FieldDef("pcileaporcint",FieldDef.FLOAT,0,2);
            pcileaespyme = new FieldDef("pcileaespyme",FieldDef.CHAR,1);
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
                pcicodini,
                pcifradoc,
                pcifrafecha,
                pcifratotal,
                pcifrabase,
                pcifracuota,
                pcifraporc,
                pcinifprov,
                pcinomprov,
                pcicausabaja,
                pciproyecto,
                pcideparta,
                pcianyosreg,
                pcidivisor,
                pcicoefdefi,
                pcilimiteinver,
                pciincrplantil,
                pcicoeffiscal,
                pcitipofiscal,
                pcileavresid,
                pcileaporcint,
                pcileaespyme                
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
        public FieldDef pcmporcint;
        public FieldDef pcmintereses;
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
            pcmporcint = new FieldDef("pcmporcint",FieldDef.FLOAT,0,2);
            pcmintereses = new FieldDef("pcmintereses",FieldDef.FLOAT,0,2);
            FieldDef array[] = {
                pcmelemento,
                pcmamorejer,
                pcmtipo,
                pcmcoefamort,
                pcmamortanual,
                pcmamortacum,
                pcmamortpdte,
                pcmultfecha,
                pcmcuotaapli,
                pcmporcint,
                pcmintereses                
                };
            setColumns(array);
            FieldDef arrayf[] = {pcmelemento,pcmamorejer,pcmtipo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDiccuentas extends TableDef
        {
        // campos
        public FieldDef diccodigo;
        public FieldDef dicempresa;
        public FieldDef dicconcepto;
        public FieldDef diccuenta;
        public FieldDef dicscuenta;
        public TabDiccuentas(String name)
            {
            super(name);
            diccodigo = new FieldDef("diccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dicempresa = new FieldDef("dicempresa",FieldDef.INTEGER,0);
            dicconcepto = new FieldDef("dicconcepto",FieldDef.CHAR,40);
            diccuenta = new FieldDef("diccuenta",FieldDef.CHAR,4);
            dicscuenta = new FieldDef("dicscuenta",FieldDef.CHAR,12);
            FieldDef array[] = {
                diccodigo,
                dicempresa,
                dicconcepto,
                diccuenta,
                dicscuenta                
                };
            setColumns(array);
            FieldDef arrayf[] = {diccodigo };
            setDescription("Diccionario de cuentas");
            setPrimaryKeys(arrayf);
            diccodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabCambioeuro extends TableDef
        {
        // campos
        public FieldDef cmbfecha;
        public FieldDef cmbmoneda;
        public FieldDef cmbimporte;
        public TabCambioeuro(String name)
            {
            super(name);
            cmbfecha = new FieldDef("cmbfecha",FieldDef.DATE);
            cmbmoneda = new FieldDef("cmbmoneda",FieldDef.CHAR,40);
            cmbimporte = new FieldDef("cmbimporte",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                cmbfecha,
                cmbmoneda,
                cmbimporte                
                };
            setColumns(array);
            FieldDef arrayf[] = {cmbfecha,cmbmoneda };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabSeguridad extends TableDef
        {
        // campos
        public FieldDef segcodigo;
        public FieldDef segcontroblig;
        public FieldDef seglongminima;
        public FieldDef seginclletras;
        public FieldDef segincnumeros;
        public FieldDef seginccarespec;
        public FieldDef segcontrexpira;
        public FieldDef segreutiliza;
        public FieldDef seghistorico;
        public FieldDef segintento;
        public FieldDef segprimeravez;
        public FieldDef segsesinactiva;
        public FieldDef segmaxsesion;
        public FieldDef segsesionsimul;
        public TabSeguridad(String name)
            {
            super(name);
            segcodigo = new FieldDef("segcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            segcontroblig = new FieldDef("segcontroblig",FieldDef.CHAR,1);
            seglongminima = new FieldDef("seglongminima",FieldDef.INTEGER,0);
            seginclletras = new FieldDef("seginclletras",FieldDef.CHAR,1);
            segincnumeros = new FieldDef("segincnumeros",FieldDef.CHAR,1);
            seginccarespec = new FieldDef("seginccarespec",FieldDef.CHAR,1);
            segcontrexpira = new FieldDef("segcontrexpira",FieldDef.INTEGER,0);
            segreutiliza = new FieldDef("segreutiliza",FieldDef.CHAR,1);
            seghistorico = new FieldDef("seghistorico",FieldDef.INTEGER,0);
            segintento = new FieldDef("segintento",FieldDef.INTEGER,0);
            segprimeravez = new FieldDef("segprimeravez",FieldDef.CHAR,1);
            segsesinactiva = new FieldDef("segsesinactiva",FieldDef.INTEGER,0);
            segmaxsesion = new FieldDef("segmaxsesion",FieldDef.INTEGER,0);
            segsesionsimul = new FieldDef("segsesionsimul",FieldDef.CHAR,1);
            FieldDef array[] = {
                segcodigo,
                segcontroblig,
                seglongminima,
                seginclletras,
                segincnumeros,
                seginccarespec,
                segcontrexpira,
                segreutiliza,
                seghistorico,
                segintento,
                segprimeravez,
                segsesinactiva,
                segmaxsesion,
                segsesionsimul                
                };
            setColumns(array);
            FieldDef arrayf[] = {segcodigo };
            setPrimaryKeys(arrayf);
            segcontroblig.setDescription("La contraseña es obligatoria");
            seglongminima.setDescription("Longitud mínima");
            seginclletras.setDescription("Debe incluir [U] solo mayusculas, [L] solo minusculas, [M] mayusculas y minusculas");
            segincnumeros.setDescription("Debe incluir numeros");
            seginccarespec.setDescription("Debe incluir caracteres especiales");
            segcontrexpira.setDescription("Numero de dias en los que expira la contraseña (0 o blanco no caduca)");
            segreutiliza.setDescription("[S]e puede reutilizar una contraseña que ya se utilizo");
            seghistorico.setDescription("Se permite reutilizar una contraseña de n-veces anteriores");
            segintento.setDescription("Numero de intentos");
            segprimeravez.setDescription("Forzar cambio primer acceso");
            segsesinactiva.setDescription("Despues de n-minutos de inactividad expira la sesion");
            segmaxsesion.setDescription("Despues de n-horas expira la sesion");
            segsesionsimul.setDescription("se permite acceder a la aplicacion con el mismo usuario");
            }
        }
        
    public class TabUshistorico extends TableDef
        {
        // campos
        public FieldDef uhcodcon;
        public FieldDef uhlogin;
        public FieldDef uhfecha;
        public FieldDef uhhora;
        public FieldDef uhpasswd;
        public FieldDef uhmd5;
        public FieldDef uhprimera;
        public FieldDef uhreintento;
        public TabUshistorico(String name)
            {
            super(name);
            uhcodcon = new FieldDef("uhcodcon",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            uhlogin = new FieldDef("uhlogin",FieldDef.CHAR,25,FieldDef.NOTNULL);
            uhfecha = new FieldDef("uhfecha",FieldDef.DATE,FieldDef.NOTNULL);
            uhhora = new FieldDef("uhhora",FieldDef.CHAR,10,FieldDef.NOTNULL);
            uhpasswd = new FieldDef("uhpasswd",FieldDef.CHAR,20);
            uhmd5 = new FieldDef("uhmd5",FieldDef.CHAR,100);
            uhprimera = new FieldDef("uhprimera",FieldDef.CHAR,1);
            uhreintento = new FieldDef("uhreintento",FieldDef.INTEGER,0);
            FieldDef array[] = {
                uhcodcon,
                uhlogin,
                uhfecha,
                uhhora,
                uhpasswd,
                uhmd5,
                uhprimera,
                uhreintento                
                };
            setColumns(array);
            FieldDef arrayf[] = {uhcodcon,uhlogin,uhfecha,uhhora };
            setPrimaryKeys(arrayf);
            uhfecha.setDescription("Fecha en la que se cambio la contraseña");
            uhhora.setDescription("Hora");
            uhpasswd.setDescription("Password");
            uhmd5.setDescription("Password formato MD5");
            uhprimera.setDescription("Primer password");
            uhreintento.setDescription("Reintentos");
            }
        }
        
    public class TabDicpatron extends TableDef
        {
        // campos
        public FieldDef dcpcodigo;
        public FieldDef dcpempresa;
        public FieldDef dcpcta;
        public FieldDef dcpscta;
        public FieldDef dcpctascta;
        public FieldDef dcpcampo;
        public FieldDef dcpcond;
        public FieldDef dcpvalor;
        public TabDicpatron(String name)
            {
            super(name);
            dcpcodigo = new FieldDef("dcpcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dcpempresa = new FieldDef("dcpempresa",FieldDef.INTEGER,0);
            dcpcta = new FieldDef("dcpcta",FieldDef.CHAR,4);
            dcpscta = new FieldDef("dcpscta",FieldDef.CHAR,12);
            dcpctascta = new FieldDef("dcpctascta",FieldDef.CHAR,17);
            dcpcampo = new FieldDef("dcpcampo",FieldDef.CHAR,20);
            dcpcond = new FieldDef("dcpcond",FieldDef.CHAR,1);
            dcpvalor = new FieldDef("dcpvalor",FieldDef.CHAR,100);
            FieldDef array[] = {
                dcpcodigo,
                dcpempresa,
                dcpcta,
                dcpscta,
                dcpctascta,
                dcpcampo,
                dcpcond,
                dcpvalor                
                };
            setColumns(array);
            FieldDef arrayf[] = {dcpcodigo };
            setPrimaryKeys(arrayf);
            dcpcodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabDfsdomicilio extends TableDef
        {
        // campos
        public FieldDef dfdejer;
        public FieldDef dfdnif;
        public FieldDef dfdcodigo;
        public FieldDef dfdtipodom;
        public FieldDef dfdtipovia;
        public FieldDef dfdcodvia;
        public FieldDef dfdnomvial;
        public FieldDef dfdnomviac;
        public FieldDef dfdtiponum;
        public FieldDef dfdcalifnum;
        public FieldDef dfdbloque;
        public FieldDef dfdportal;
        public FieldDef dfdescalera;
        public FieldDef dfdpiso;
        public FieldDef dfdpuerta;
        public FieldDef dfdcomplem;
        public FieldDef dfdpoblacion;
        public FieldDef dfdcodpos;
        public FieldDef dfdcodmuni;
        public FieldDef dfdmuni;
        public FieldDef dfdcodprov;
        public FieldDef dfdprov;
        public FieldDef dfdrefcat;
        public FieldDef dfd21address;
        public FieldDef dfd21compl;
        public FieldDef dfd21pobla;
        public FieldDef dfd21codpos;
        public FieldDef dfd21provre;
        public FieldDef dfd21pais;
        public FieldDef dfd21codpais;
        public FieldDef dfd21nacional;
        public TabDfsdomicilio(String name)
            {
            super(name);
            dfdejer = new FieldDef("dfdejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfdnif = new FieldDef("dfdnif",FieldDef.CHAR,15);
            dfdcodigo = new FieldDef("dfdcodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfdtipodom = new FieldDef("dfdtipodom",FieldDef.CHAR,2,FieldDef.NOTNULL);
            dfdtipovia = new FieldDef("dfdtipovia",FieldDef.CHAR,5);
            dfdcodvia = new FieldDef("dfdcodvia",FieldDef.CHAR,5);
            dfdnomvial = new FieldDef("dfdnomvial",FieldDef.CHAR,50);
            dfdnomviac = new FieldDef("dfdnomviac",FieldDef.CHAR,25);
            dfdtiponum = new FieldDef("dfdtiponum",FieldDef.CHAR,3);
            dfdcalifnum = new FieldDef("dfdcalifnum",FieldDef.CHAR,3);
            dfdbloque = new FieldDef("dfdbloque",FieldDef.CHAR,3);
            dfdportal = new FieldDef("dfdportal",FieldDef.CHAR,3);
            dfdescalera = new FieldDef("dfdescalera",FieldDef.CHAR,3);
            dfdpiso = new FieldDef("dfdpiso",FieldDef.CHAR,3);
            dfdpuerta = new FieldDef("dfdpuerta",FieldDef.CHAR,3);
            dfdcomplem = new FieldDef("dfdcomplem",FieldDef.CHAR,40);
            dfdpoblacion = new FieldDef("dfdpoblacion",FieldDef.CHAR,30);
            dfdcodpos = new FieldDef("dfdcodpos",FieldDef.CHAR,5);
            dfdcodmuni = new FieldDef("dfdcodmuni",FieldDef.CHAR,5);
            dfdmuni = new FieldDef("dfdmuni",FieldDef.CHAR,30);
            dfdcodprov = new FieldDef("dfdcodprov",FieldDef.INTEGER,0);
            dfdprov = new FieldDef("dfdprov",FieldDef.CHAR,20);
            dfdrefcat = new FieldDef("dfdrefcat",FieldDef.CHAR,20);
            dfd21address = new FieldDef("dfd21address",FieldDef.CHAR,50);
            dfd21compl = new FieldDef("dfd21compl",FieldDef.CHAR,40);
            dfd21pobla = new FieldDef("dfd21pobla",FieldDef.CHAR,30);
            dfd21codpos = new FieldDef("dfd21codpos",FieldDef.CHAR,10);
            dfd21provre = new FieldDef("dfd21provre",FieldDef.CHAR,30);
            dfd21pais = new FieldDef("dfd21pais",FieldDef.CHAR,30);
            dfd21codpais = new FieldDef("dfd21codpais",FieldDef.CHAR,2);
            dfd21nacional = new FieldDef("dfd21nacional",FieldDef.CHAR,2);
            FieldDef array[] = {
                dfdejer,
                dfdnif,
                dfdcodigo,
                dfdtipodom,
                dfdtipovia,
                dfdcodvia,
                dfdnomvial,
                dfdnomviac,
                dfdtiponum,
                dfdcalifnum,
                dfdbloque,
                dfdportal,
                dfdescalera,
                dfdpiso,
                dfdpuerta,
                dfdcomplem,
                dfdpoblacion,
                dfdcodpos,
                dfdcodmuni,
                dfdmuni,
                dfdcodprov,
                dfdprov,
                dfdrefcat,
                dfd21address,
                dfd21compl,
                dfd21pobla,
                dfd21codpos,
                dfd21provre,
                dfd21pais,
                dfd21codpais,
                dfd21nacional                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfdejer,dfdnif,dfdcodigo };
            setDescription("Datos fiscales sociedades. Domicilio");
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfscensales extends TableDef
        {
        // campos
        public FieldDef dfcejer;
        public FieldDef dfcnif;
        public FieldDef dfccodigo;
        public FieldDef dfccodact;
        public FieldDef dfcdescact;
        public FieldDef dfcgrupoiae;
        public FieldDef dfccodcnae;
        public TabDfscensales(String name)
            {
            super(name);
            dfcejer = new FieldDef("dfcejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfcnif = new FieldDef("dfcnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfccodigo = new FieldDef("dfccodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfccodact = new FieldDef("dfccodact",FieldDef.CHAR,3);
            dfcdescact = new FieldDef("dfcdescact",FieldDef.CHAR,40);
            dfcgrupoiae = new FieldDef("dfcgrupoiae",FieldDef.CHAR,5);
            dfccodcnae = new FieldDef("dfccodcnae",FieldDef.CHAR,5);
            FieldDef array[] = {
                dfcejer,
                dfcnif,
                dfccodigo,
                dfccodact,
                dfcdescact,
                dfcgrupoiae,
                dfccodcnae                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfcejer,dfcnif,dfccodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsperiodoycnae extends TableDef
        {
        // campos
        public FieldDef dfpejer;
        public FieldDef dfpnif;
        public FieldDef dfpcodigo;
        public FieldDef dfpfecini;
        public FieldDef dfpfecfin;
        public FieldDef dfptipoper;
        public FieldDef dfpcnae2009;
        public TabDfsperiodoycnae(String name)
            {
            super(name);
            dfpejer = new FieldDef("dfpejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfpnif = new FieldDef("dfpnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfpcodigo = new FieldDef("dfpcodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfpfecini = new FieldDef("dfpfecini",FieldDef.DATE);
            dfpfecfin = new FieldDef("dfpfecfin",FieldDef.DATE);
            dfptipoper = new FieldDef("dfptipoper",FieldDef.INTEGER,0);
            dfpcnae2009 = new FieldDef("dfpcnae2009",FieldDef.CHAR,5);
            FieldDef array[] = {
                dfpejer,
                dfpnif,
                dfpcodigo,
                dfpfecini,
                dfpfecfin,
                dfptipoper,
                dfpcnae2009                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfpejer,dfpnif,dfpcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfscaracteres extends TableDef
        {
        // campos
        public FieldDef dfcejer;
        public FieldDef dfcnif;
        public FieldDef dfccodigo;
        public FieldDef dfccaracter;
        public TabDfscaracteres(String name)
            {
            super(name);
            dfcejer = new FieldDef("dfcejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfcnif = new FieldDef("dfcnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfccodigo = new FieldDef("dfccodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfccaracter = new FieldDef("dfccaracter",FieldDef.CHAR,5);
            FieldDef array[] = {
                dfcejer,
                dfcnif,
                dfccodigo,
                dfccaracter                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfcejer,dfcnif,dfccodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsadmins extends TableDef
        {
        // campos
        public FieldDef dfaejer;
        public FieldDef dfanif;
        public FieldDef dfacodigo;
        public FieldDef dfanifadmin;
        public FieldDef dfatiponif;
        public FieldDef dfanombre;
        public FieldDef dfarepresent;
        public FieldDef dfadomiciliof;
        public FieldDef dfaprovincia;
        public TabDfsadmins(String name)
            {
            super(name);
            dfaejer = new FieldDef("dfaejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfanif = new FieldDef("dfanif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfacodigo = new FieldDef("dfacodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfanifadmin = new FieldDef("dfanifadmin",FieldDef.CHAR,9);
            dfatiponif = new FieldDef("dfatiponif",FieldDef.CHAR,1);
            dfanombre = new FieldDef("dfanombre",FieldDef.CHAR,60);
            dfarepresent = new FieldDef("dfarepresent",FieldDef.CHAR,1);
            dfadomiciliof = new FieldDef("dfadomiciliof",FieldDef.CHAR,50);
            dfaprovincia = new FieldDef("dfaprovincia",FieldDef.CHAR,2);
            FieldDef array[] = {
                dfaejer,
                dfanif,
                dfacodigo,
                dfanifadmin,
                dfatiponif,
                dfanombre,
                dfarepresent,
                dfadomiciliof,
                dfaprovincia                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfaejer,dfanif,dfacodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsentidpart extends TableDef
        {
        // campos
        public FieldDef dfeejer;
        public FieldDef dfenif;
        public FieldDef dfecodigo;
        public FieldDef dfeentnifid;
        public FieldDef dfenombre;
        public FieldDef dfeprovpais;
        public FieldDef dfeporcpart;
        public FieldDef dfevalornom;
        public FieldDef dfevalorlib;
        public FieldDef dfeingrdivej;
        public TabDfsentidpart(String name)
            {
            super(name);
            dfeejer = new FieldDef("dfeejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfenif = new FieldDef("dfenif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfecodigo = new FieldDef("dfecodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfeentnifid = new FieldDef("dfeentnifid",FieldDef.CHAR,20);
            dfenombre = new FieldDef("dfenombre",FieldDef.CHAR,60);
            dfeprovpais = new FieldDef("dfeprovpais",FieldDef.CHAR,2);
            dfeporcpart = new FieldDef("dfeporcpart",FieldDef.FLOAT,6,0);
            dfevalornom = new FieldDef("dfevalornom",FieldDef.FLOAT,6,0);
            dfevalorlib = new FieldDef("dfevalorlib",FieldDef.FLOAT,6,0);
            dfeingrdivej = new FieldDef("dfeingrdivej",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfeejer,
                dfenif,
                dfecodigo,
                dfeentnifid,
                dfenombre,
                dfeprovpais,
                dfeporcpart,
                dfevalornom,
                dfevalorlib,
                dfeingrdivej                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfeejer,dfenif,dfecodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsperspart extends TableDef
        {
        // campos
        public FieldDef dfpejer;
        public FieldDef dfpnif;
        public FieldDef dfpcodigo;
        public FieldDef dfppersnif;
        public FieldDef dfptiponif;
        public FieldDef dfpesrepre;
        public FieldDef dfpnombre;
        public FieldDef dfpprovpais;
        public FieldDef dfpvalornom;
        public FieldDef dfpporcpart;
        public TabDfsperspart(String name)
            {
            super(name);
            dfpejer = new FieldDef("dfpejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfpnif = new FieldDef("dfpnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfpcodigo = new FieldDef("dfpcodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfppersnif = new FieldDef("dfppersnif",FieldDef.CHAR,9);
            dfptiponif = new FieldDef("dfptiponif",FieldDef.CHAR,1);
            dfpesrepre = new FieldDef("dfpesrepre",FieldDef.CHAR,1);
            dfpnombre = new FieldDef("dfpnombre",FieldDef.CHAR,60);
            dfpprovpais = new FieldDef("dfpprovpais",FieldDef.CHAR,2);
            dfpvalornom = new FieldDef("dfpvalornom",FieldDef.FLOAT,6,0);
            dfpporcpart = new FieldDef("dfpporcpart",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfpejer,
                dfpnif,
                dfpcodigo,
                dfppersnif,
                dfptiponif,
                dfpesrepre,
                dfpnombre,
                dfpprovpais,
                dfpvalornom,
                dfpporcpart                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfpejer,dfpnif,dfpcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfssecrerepre extends TableDef
        {
        // campos
        public FieldDef dfsejer;
        public FieldDef dfsnif;
        public FieldDef dfscodigo;
        public FieldDef dfspersnif;
        public FieldDef dfsnombre;
        public FieldDef dfsfuncion;
        public FieldDef dfsfecfirma;
        public TabDfssecrerepre(String name)
            {
            super(name);
            dfsejer = new FieldDef("dfsejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfsnif = new FieldDef("dfsnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfscodigo = new FieldDef("dfscodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfspersnif = new FieldDef("dfspersnif",FieldDef.CHAR,9);
            dfsnombre = new FieldDef("dfsnombre",FieldDef.CHAR,60);
            dfsfuncion = new FieldDef("dfsfuncion",FieldDef.CHAR,1);
            dfsfecfirma = new FieldDef("dfsfecfirma",FieldDef.DATE);
            FieldDef array[] = {
                dfsejer,
                dfsnif,
                dfscodigo,
                dfspersnif,
                dfsnombre,
                dfsfuncion,
                dfsfecfirma                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfsejer,dfsnif,dfscodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfspagosfrac extends TableDef
        {
        // campos
        public FieldDef dfpejer;
        public FieldDef dfpnif;
        public FieldDef dfpcodigo;
        public FieldDef dfpmodelo;
        public FieldDef dfptipo;
        public FieldDef dfpperiodo;
        public FieldDef dfpdeleg;
        public FieldDef dfpjustif;
        public FieldDef dfpimporte;
        public TabDfspagosfrac(String name)
            {
            super(name);
            dfpejer = new FieldDef("dfpejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfpnif = new FieldDef("dfpnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfpcodigo = new FieldDef("dfpcodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfpmodelo = new FieldDef("dfpmodelo",FieldDef.CHAR,3);
            dfptipo = new FieldDef("dfptipo",FieldDef.CHAR,1);
            dfpperiodo = new FieldDef("dfpperiodo",FieldDef.CHAR,2);
            dfpdeleg = new FieldDef("dfpdeleg",FieldDef.CHAR,2);
            dfpjustif = new FieldDef("dfpjustif",FieldDef.CHAR,13);
            dfpimporte = new FieldDef("dfpimporte",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfpejer,
                dfpnif,
                dfpcodigo,
                dfpmodelo,
                dfptipo,
                dfpperiodo,
                dfpdeleg,
                dfpjustif,
                dfpimporte                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfpejer,dfpnif,dfpcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsvoloper extends TableDef
        {
        // campos
        public FieldDef dfvejer;
        public FieldDef dfvnif;
        public FieldDef dfvcodigo;
        public FieldDef dfvmodelo;
        public FieldDef dfvtotvol;
        public TabDfsvoloper(String name)
            {
            super(name);
            dfvejer = new FieldDef("dfvejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfvnif = new FieldDef("dfvnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfvcodigo = new FieldDef("dfvcodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfvmodelo = new FieldDef("dfvmodelo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            dfvtotvol = new FieldDef("dfvtotvol",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfvejer,
                dfvnif,
                dfvcodigo,
                dfvmodelo,
                dfvtotvol                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfvejer,dfvnif,dfvcodigo,dfvmodelo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsrdtotrab extends TableDef
        {
        // campos
        public FieldDef dfrejer;
        public FieldDef dfrnif;
        public FieldDef dfrcodigo;
        public FieldDef dfrnifpaga;
        public FieldDef dfrnombre;
        public FieldDef dfrclave;
        public FieldDef dfrdinera;
        public FieldDef dfrreten;
        public FieldDef dfrespecie;
        public FieldDef dfringcta;
        public FieldDef dfringctarep;
        public FieldDef dfrgastosded;
        public FieldDef dfrreduc;
        public TabDfsrdtotrab(String name)
            {
            super(name);
            dfrejer = new FieldDef("dfrejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfrnif = new FieldDef("dfrnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfrcodigo = new FieldDef("dfrcodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfrnifpaga = new FieldDef("dfrnifpaga",FieldDef.CHAR,9);
            dfrnombre = new FieldDef("dfrnombre",FieldDef.CHAR,40);
            dfrclave = new FieldDef("dfrclave",FieldDef.CHAR,2);
            dfrdinera = new FieldDef("dfrdinera",FieldDef.FLOAT,6,0);
            dfrreten = new FieldDef("dfrreten",FieldDef.FLOAT,6,0);
            dfrespecie = new FieldDef("dfrespecie",FieldDef.FLOAT,6,0);
            dfringcta = new FieldDef("dfringcta",FieldDef.FLOAT,6,0);
            dfringctarep = new FieldDef("dfringctarep",FieldDef.FLOAT,6,0);
            dfrgastosded = new FieldDef("dfrgastosded",FieldDef.FLOAT,6,0);
            dfrreduc = new FieldDef("dfrreduc",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfrejer,
                dfrnif,
                dfrcodigo,
                dfrnifpaga,
                dfrnombre,
                dfrclave,
                dfrdinera,
                dfrreten,
                dfrespecie,
                dfringcta,
                dfringctarep,
                dfrgastosded,
                dfrreduc                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfrejer,dfrnif,dfrcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsdeducybases extends TableDef
        {
        // campos
        public FieldDef dfdejer;
        public FieldDef dfdnif;
        public FieldDef dfdcodigo;
        public FieldDef dfdtipoded;
        public FieldDef dfdanyded;
        public FieldDef dfdcasejer;
        public FieldDef dfdcasejerant;
        public FieldDef dfdimporte;
        public TabDfsdeducybases(String name)
            {
            super(name);
            dfdejer = new FieldDef("dfdejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfdnif = new FieldDef("dfdnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfdcodigo = new FieldDef("dfdcodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfdtipoded = new FieldDef("dfdtipoded",FieldDef.CHAR,3,FieldDef.NOTNULL);
            dfdanyded = new FieldDef("dfdanyded",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfdcasejer = new FieldDef("dfdcasejer",FieldDef.CHAR,255,FieldDef.NOTNULL);
            dfdcasejerant = new FieldDef("dfdcasejerant",FieldDef.CHAR,255,FieldDef.NOTNULL);
            dfdimporte = new FieldDef("dfdimporte",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfdejer,
                dfdnif,
                dfdcodigo,
                dfdtipoded,
                dfdanyded,
                dfdcasejer,
                dfdcasejerant,
                dfdimporte                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfdejer,dfdnif,dfdcodigo,dfdtipoded,dfdanyded,dfdcasejer,dfdcasejerant };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsdonaciones extends TableDef
        {
        // campos
        public FieldDef dfdejer;
        public FieldDef dfdnif;
        public FieldDef dfdcodigo;
        public FieldDef dfdnifent;
        public FieldDef dfdnombre;
        public FieldDef dfdtipo;
        public FieldDef dfdclave;
        public FieldDef dfdimporte;
        public FieldDef dfdrecur;
        public TabDfsdonaciones(String name)
            {
            super(name);
            dfdejer = new FieldDef("dfdejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfdnif = new FieldDef("dfdnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfdcodigo = new FieldDef("dfdcodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfdnifent = new FieldDef("dfdnifent",FieldDef.CHAR,9);
            dfdnombre = new FieldDef("dfdnombre",FieldDef.CHAR,40);
            dfdtipo = new FieldDef("dfdtipo",FieldDef.CHAR,1);
            dfdclave = new FieldDef("dfdclave",FieldDef.CHAR,1);
            dfdimporte = new FieldDef("dfdimporte",FieldDef.FLOAT,6,0);
            dfdrecur = new FieldDef("dfdrecur",FieldDef.CHAR,1);
            FieldDef array[] = {
                dfdejer,
                dfdnif,
                dfdcodigo,
                dfdnifent,
                dfdnombre,
                dfdtipo,
                dfdclave,
                dfdimporte,
                dfdrecur                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfdejer,dfdnif,dfdcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsmultasdgt extends TableDef
        {
        // campos
        public FieldDef dfmejer;
        public FieldDef dfmnif;
        public FieldDef dfmcodigo;
        public FieldDef dfmejermulta;
        public FieldDef dfmmatricula;
        public FieldDef dfmtvolunta;
        public FieldDef dfmrecargoa;
        public FieldDef dfmtejecut;
        public TabDfsmultasdgt(String name)
            {
            super(name);
            dfmejer = new FieldDef("dfmejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfmnif = new FieldDef("dfmnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfmcodigo = new FieldDef("dfmcodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfmejermulta = new FieldDef("dfmejermulta",FieldDef.INTEGER,0);
            dfmmatricula = new FieldDef("dfmmatricula",FieldDef.CHAR,10);
            dfmtvolunta = new FieldDef("dfmtvolunta",FieldDef.FLOAT,6,0);
            dfmrecargoa = new FieldDef("dfmrecargoa",FieldDef.FLOAT,6,0);
            dfmtejecut = new FieldDef("dfmtejecut",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfmejer,
                dfmnif,
                dfmcodigo,
                dfmejermulta,
                dfmmatricula,
                dfmtvolunta,
                dfmrecargoa,
                dfmtejecut                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfmejer,dfmnif,dfmcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsrdtoctasban extends TableDef
        {
        // campos
        public FieldDef dfrejer;
        public FieldDef dfrnif;
        public FieldDef dfrcodigo;
        public FieldDef dfrnifpaga;
        public FieldDef dfrnombre;
        public FieldDef dfrcuenta;
        public FieldDef dfrtipo;
        public FieldDef dfrtitulares;
        public FieldDef dfrrdtodiner;
        public FieldDef dfrreten;
        public FieldDef dfrrdtoespec;
        public FieldDef dfringcta;
        public TabDfsrdtoctasban(String name)
            {
            super(name);
            dfrejer = new FieldDef("dfrejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfrnif = new FieldDef("dfrnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfrcodigo = new FieldDef("dfrcodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfrnifpaga = new FieldDef("dfrnifpaga",FieldDef.CHAR,9);
            dfrnombre = new FieldDef("dfrnombre",FieldDef.CHAR,40);
            dfrcuenta = new FieldDef("dfrcuenta",FieldDef.CHAR,10);
            dfrtipo = new FieldDef("dfrtipo",FieldDef.CHAR,1);
            dfrtitulares = new FieldDef("dfrtitulares",FieldDef.CHAR,3);
            dfrrdtodiner = new FieldDef("dfrrdtodiner",FieldDef.FLOAT,6,0);
            dfrreten = new FieldDef("dfrreten",FieldDef.FLOAT,6,0);
            dfrrdtoespec = new FieldDef("dfrrdtoespec",FieldDef.FLOAT,6,0);
            dfringcta = new FieldDef("dfringcta",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfrejer,
                dfrnif,
                dfrcodigo,
                dfrnifpaga,
                dfrnombre,
                dfrcuenta,
                dfrtipo,
                dfrtitulares,
                dfrrdtodiner,
                dfrreten,
                dfrrdtoespec,
                dfringcta                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfrejer,dfrnif,dfrcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfssanciones extends TableDef
        {
        // campos
        public FieldDef dfsejer;
        public FieldDef dfsnif;
        public FieldDef dfscodigo;
        public FieldDef dfsconcepto;
        public FieldDef dfsdesc;
        public FieldDef dfssancion;
        public FieldDef dfsrecargoo;
        public FieldDef dfsrecargoa;
        public FieldDef dfscalculado;
        public TabDfssanciones(String name)
            {
            super(name);
            dfsejer = new FieldDef("dfsejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfsnif = new FieldDef("dfsnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfscodigo = new FieldDef("dfscodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            dfsconcepto = new FieldDef("dfsconcepto",FieldDef.CHAR,40);
            dfsdesc = new FieldDef("dfsdesc",FieldDef.CHAR,70);
            dfssancion = new FieldDef("dfssancion",FieldDef.FLOAT,6,0);
            dfsrecargoo = new FieldDef("dfsrecargoo",FieldDef.FLOAT,6,0);
            dfsrecargoa = new FieldDef("dfsrecargoa",FieldDef.FLOAT,6,0);
            dfscalculado = new FieldDef("dfscalculado",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfsejer,
                dfsnif,
                dfscodigo,
                dfsconcepto,
                dfsdesc,
                dfssancion,
                dfsrecargoo,
                dfsrecargoa,
                dfscalculado                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfsejer,dfsnif,dfscodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabCdpnotificacion extends TableDef
        {
        // campos
        public FieldDef notid;
        public FieldDef notdp;
        public FieldDef notclientedp;
        public FieldDef notusuario;
        public FieldDef notfecha;
        public FieldDef nottipo;
        public FieldDef notidform;
        public FieldDef notnifemp;
        public FieldDef notcodiemp;
        public FieldDef notcodicen;
        public FieldDef notcoditra;
        public FieldDef notniftra;
        public FieldDef notcrud;
        public FieldDef notfecharev;
        public FieldDef notestado;
        public FieldDef notestadocdp;
        public TabCdpnotificacion(String name)
            {
            super(name);
            notid = new FieldDef("notid",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            notdp = new FieldDef("notdp",FieldDef.CHAR,12);
            notclientedp = new FieldDef("notclientedp",FieldDef.CHAR,12);
            notusuario = new FieldDef("notusuario",FieldDef.CHAR,60);
            notfecha = new FieldDef("notfecha",FieldDef.DATE);
            nottipo = new FieldDef("nottipo",FieldDef.CHAR,20);
            notidform = new FieldDef("notidform",FieldDef.INTEGER,12);
            notnifemp = new FieldDef("notnifemp",FieldDef.CHAR,9);
            notcodiemp = new FieldDef("notcodiemp",FieldDef.INTEGER,12);
            notcodicen = new FieldDef("notcodicen",FieldDef.INTEGER,12);
            notcoditra = new FieldDef("notcoditra",FieldDef.INTEGER,12);
            notniftra = new FieldDef("notniftra",FieldDef.CHAR,9);
            notcrud = new FieldDef("notcrud",FieldDef.CHAR,1);
            notfecharev = new FieldDef("notfecharev",FieldDef.DATE);
            notestado = new FieldDef("notestado",FieldDef.CHAR,1);
            notestadocdp = new FieldDef("notestadocdp",FieldDef.CHAR,1);
            FieldDef array[] = {
                notid,
                notdp,
                notclientedp,
                notusuario,
                notfecha,
                nottipo,
                notidform,
                notnifemp,
                notcodiemp,
                notcodicen,
                notcoditra,
                notniftra,
                notcrud,
                notfecharev,
                notestado,
                notestadocdp                
                };
            setColumns(array);
            FieldDef arrayf[] = {notid };
            setPrimaryKeys(arrayf);
            notid.setAutoIncrementable(true);
            }
        }
        
    public class TabParamlis extends TableDef
        {
        // campos
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
        public FieldDef plicampoa62;
        public FieldDef plicampoa63;
        public FieldDef plicampoa64;
        public FieldDef plicampoa65;
        public FieldDef plicampoa66;
        public FieldDef plicampoa67;
        public FieldDef plicampoa68;
        public FieldDef plicampoa69;
        public FieldDef plicampoa70;
        public FieldDef plicampon71;
        public FieldDef plicampon72;
        public FieldDef plicampon73;
        public FieldDef plicampon74;
        public FieldDef plicampon75;
        public FieldDef plicampon76;
        public FieldDef plicampon77;
        public FieldDef plicampon78;
        public FieldDef plicampon79;
        public FieldDef plicampon80;
        public FieldDef plicampoa81;
        public FieldDef plicampoa82;
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
            plicampoa62 = new FieldDef("plicampoa62",FieldDef.CHAR,100);
            plicampoa63 = new FieldDef("plicampoa63",FieldDef.CHAR,100);
            plicampoa64 = new FieldDef("plicampoa64",FieldDef.CHAR,100);
            plicampoa65 = new FieldDef("plicampoa65",FieldDef.CHAR,100);
            plicampoa66 = new FieldDef("plicampoa66",FieldDef.CHAR,100);
            plicampoa67 = new FieldDef("plicampoa67",FieldDef.CHAR,100);
            plicampoa68 = new FieldDef("plicampoa68",FieldDef.CHAR,100);
            plicampoa69 = new FieldDef("plicampoa69",FieldDef.CHAR,100);
            plicampoa70 = new FieldDef("plicampoa70",FieldDef.CHAR,100);
            plicampon71 = new FieldDef("plicampon71",FieldDef.FLOAT,6,0);
            plicampon72 = new FieldDef("plicampon72",FieldDef.FLOAT,6,0);
            plicampon73 = new FieldDef("plicampon73",FieldDef.FLOAT,6,0);
            plicampon74 = new FieldDef("plicampon74",FieldDef.FLOAT,6,0);
            plicampon75 = new FieldDef("plicampon75",FieldDef.FLOAT,6,0);
            plicampon76 = new FieldDef("plicampon76",FieldDef.FLOAT,6,0);
            plicampon77 = new FieldDef("plicampon77",FieldDef.FLOAT,6,0);
            plicampon78 = new FieldDef("plicampon78",FieldDef.FLOAT,6,0);
            plicampon79 = new FieldDef("plicampon79",FieldDef.FLOAT,6,0);
            plicampon80 = new FieldDef("plicampon80",FieldDef.FLOAT,6,0);
            plicampoa81 = new FieldDef("plicampoa81",FieldDef.CHAR,2000);
            plicampoa82 = new FieldDef("plicampoa82",FieldDef.CHAR,2000);
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
                plicampoa61,
                plicampoa62,
                plicampoa63,
                plicampoa64,
                plicampoa65,
                plicampoa66,
                plicampoa67,
                plicampoa68,
                plicampoa69,
                plicampoa70,
                plicampon71,
                plicampon72,
                plicampon73,
                plicampon74,
                plicampon75,
                plicampon76,
                plicampon77,
                plicampon78,
                plicampon79,
                plicampon80,
                plicampoa81,
                plicampoa82                
                };
            setColumns(array);
            FieldDef arrayf[] = {pliasesor,pliusuario,pliprograma,pliopcion };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsadminsninfo extends TableDef
        {
        // campos
        public FieldDef dfanejer;
        public FieldDef dfannif;
        public FieldDef dfancodigo;
        public TabDfsadminsninfo(String name)
            {
            super(name);
            dfanejer = new FieldDef("dfanejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfannif = new FieldDef("dfannif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfancodigo = new FieldDef("dfancodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            FieldDef array[] = {
                dfanejer,
                dfannif,
                dfancodigo                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfanejer,dfannif,dfancodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfssociosninfo extends TableDef
        {
        // campos
        public FieldDef dfsnejer;
        public FieldDef dfsnnif;
        public FieldDef dfsncodigo;
        public TabDfssociosninfo(String name)
            {
            super(name);
            dfsnejer = new FieldDef("dfsnejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            dfsnnif = new FieldDef("dfsnnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            dfsncodigo = new FieldDef("dfsncodigo",FieldDef.CHAR,7,FieldDef.NOTNULL);
            FieldDef array[] = {
                dfsnejer,
                dfsnnif,
                dfsncodigo                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfsnejer,dfsnnif,dfsncodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsregdeclarado extends TableDef
        {
        // campos
        public FieldDef dfrdejer;
        public FieldDef dfrdnif;
        public FieldDef dfrdcodigo;
        public FieldDef dfrdclave;
        public FieldDef dfrdpercep;
        public FieldDef dfrdretenc;
        public FieldDef dfrdvperes;
        public FieldDef dfrdingefc;
        public FieldDef dfrdingrep;
        public FieldDef dfrdpercepilt;
        public FieldDef dfrdretencilt;
        public FieldDef dfrdvperesilt;
        public FieldDef dfrdingefcilt;
        public FieldDef dfrdingrepilt;
        public FieldDef dfrdimpcalcul;
        public TabDfsregdeclarado(String name)
            {
            super(name);
            dfrdejer = new FieldDef("dfrdejer",FieldDef.INTEGER,0);
            dfrdnif = new FieldDef("dfrdnif",FieldDef.CHAR,15);
            dfrdcodigo = new FieldDef("dfrdcodigo",FieldDef.CHAR,7);
            dfrdclave = new FieldDef("dfrdclave",FieldDef.CHAR,3);
            dfrdpercep = new FieldDef("dfrdpercep",FieldDef.FLOAT,6,0);
            dfrdretenc = new FieldDef("dfrdretenc",FieldDef.FLOAT,6,0);
            dfrdvperes = new FieldDef("dfrdvperes",FieldDef.FLOAT,6,0);
            dfrdingefc = new FieldDef("dfrdingefc",FieldDef.FLOAT,6,0);
            dfrdingrep = new FieldDef("dfrdingrep",FieldDef.FLOAT,6,0);
            dfrdpercepilt = new FieldDef("dfrdpercepilt",FieldDef.FLOAT,6,0);
            dfrdretencilt = new FieldDef("dfrdretencilt",FieldDef.FLOAT,6,0);
            dfrdvperesilt = new FieldDef("dfrdvperesilt",FieldDef.FLOAT,6,0);
            dfrdingefcilt = new FieldDef("dfrdingefcilt",FieldDef.FLOAT,6,0);
            dfrdingrepilt = new FieldDef("dfrdingrepilt",FieldDef.FLOAT,6,0);
            dfrdimpcalcul = new FieldDef("dfrdimpcalcul",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfrdejer,
                dfrdnif,
                dfrdcodigo,
                dfrdclave,
                dfrdpercep,
                dfrdretenc,
                dfrdvperes,
                dfrdingefc,
                dfrdingrep,
                dfrdpercepilt,
                dfrdretencilt,
                dfrdvperesilt,
                dfrdingefcilt,
                dfrdingrepilt,
                dfrdimpcalcul                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfrdejer,dfrdnif,dfrdcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsrdtimpinfo extends TableDef
        {
        // campos
        public FieldDef dfriejer;
        public FieldDef dfrinif;
        public FieldDef dfricodigo;
        public FieldDef dfrinifemis;
        public FieldDef dfrinomemis;
        public FieldDef dfrinifdecl;
        public FieldDef dfrinomdecl;
        public FieldDef dfriclave;
        public FieldDef dfritipo;
        public FieldDef dfriimpinte;
        public FieldDef dfriretenci;
        public FieldDef dfrigtodedu;
        public FieldDef dfripenaliz;
        public TabDfsrdtimpinfo(String name)
            {
            super(name);
            dfriejer = new FieldDef("dfriejer",FieldDef.INTEGER,0);
            dfrinif = new FieldDef("dfrinif",FieldDef.CHAR,15);
            dfricodigo = new FieldDef("dfricodigo",FieldDef.CHAR,7);
            dfrinifemis = new FieldDef("dfrinifemis",FieldDef.CHAR,9);
            dfrinomemis = new FieldDef("dfrinomemis",FieldDef.CHAR,40);
            dfrinifdecl = new FieldDef("dfrinifdecl",FieldDef.CHAR,9);
            dfrinomdecl = new FieldDef("dfrinomdecl",FieldDef.CHAR,40);
            dfriclave = new FieldDef("dfriclave",FieldDef.CHAR,3);
            dfritipo = new FieldDef("dfritipo",FieldDef.INTEGER,0);
            dfriimpinte = new FieldDef("dfriimpinte",FieldDef.FLOAT,6,0);
            dfriretenci = new FieldDef("dfriretenci",FieldDef.FLOAT,6,0);
            dfrigtodedu = new FieldDef("dfrigtodedu",FieldDef.FLOAT,6,0);
            dfripenaliz = new FieldDef("dfripenaliz",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfriejer,
                dfrinif,
                dfricodigo,
                dfrinifemis,
                dfrinomemis,
                dfrinifdecl,
                dfrinomdecl,
                dfriclave,
                dfritipo,
                dfriimpinte,
                dfriretenci,
                dfrigtodedu,
                dfripenaliz                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfriejer,dfrinif,dfricodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsarrlocalimp extends TableDef
        {
        // campos
        public FieldDef dfarejer;
        public FieldDef dfarnif;
        public FieldDef dfarcodigo;
        public FieldDef dfarnifpaga;
        public FieldDef dfarnompaga;
        public FieldDef dfarrefcata;
        public FieldDef dfarclave;
        public FieldDef dfaringreso;
        public FieldDef dfarretenci;
        public TabDfsarrlocalimp(String name)
            {
            super(name);
            dfarejer = new FieldDef("dfarejer",FieldDef.INTEGER,0);
            dfarnif = new FieldDef("dfarnif",FieldDef.CHAR,15);
            dfarcodigo = new FieldDef("dfarcodigo",FieldDef.CHAR,7);
            dfarnifpaga = new FieldDef("dfarnifpaga",FieldDef.CHAR,9);
            dfarnompaga = new FieldDef("dfarnompaga",FieldDef.CHAR,40);
            dfarrefcata = new FieldDef("dfarrefcata",FieldDef.CHAR,20);
            dfarclave = new FieldDef("dfarclave",FieldDef.INTEGER,0);
            dfaringreso = new FieldDef("dfaringreso",FieldDef.FLOAT,6,0);
            dfarretenci = new FieldDef("dfarretenci",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                dfarejer,
                dfarnif,
                dfarcodigo,
                dfarnifpaga,
                dfarnompaga,
                dfarrefcata,
                dfarclave,
                dfaringreso,
                dfarretenci                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfarejer,dfarnif,dfarcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabWnifes extends TableDef
        {
        // campos
        public FieldDef datcodigo;
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
        public FieldDef datipf;
        public FieldDef datdominio;
        public FieldDef datcbienes;
        public FieldDef datnacional;
        public FieldDef datmovil;
        public FieldDef datuser;
        public FieldDef datgrupo;
        public FieldDef datcdptipo;
        public FieldDef datcdpestado;
        public FieldDef datcdpdatep;
        public FieldDef datcdpdatev;
        public FieldDef datcdpdatei;
        public FieldDef datcdpuserp;
        public FieldDef datcdpuserv;
        public FieldDef datcdpuseri;
        public TabWnifes(String name)
            {
            super(name);
            datcodigo = new FieldDef("datcodigo",FieldDef.INTEGER,12);
            danifcif = new FieldDef("danifcif",FieldDef.CHAR,15);
            datipo = new FieldDef("datipo",FieldDef.CHAR,1);
            datnombre = new FieldDef("datnombre",FieldDef.CHAR,50);
            datapell1 = new FieldDef("datapell1",FieldDef.CHAR,100);
            datapell2 = new FieldDef("datapell2",FieldDef.CHAR,50);
            datsiglas = new FieldDef("datsiglas",FieldDef.CHAR,2);
            datvia = new FieldDef("datvia",FieldDef.CHAR,45);
            datnum = new FieldDef("datnum",FieldDef.CHAR,6);
            datesc = new FieldDef("datesc",FieldDef.CHAR,2);
            datpiso = new FieldDef("datpiso",FieldDef.CHAR,6);
            datletra = new FieldDef("datletra",FieldDef.CHAR,2);
            datpobla = new FieldDef("datpobla",FieldDef.CHAR,30);
            datmuni = new FieldDef("datmuni",FieldDef.INTEGER,12);
            datprov = new FieldDef("datprov",FieldDef.INTEGER,12);
            datpais = new FieldDef("datpais",FieldDef.INTEGER,12);
            datcpos = new FieldDef("datcpos",FieldDef.CHAR,5);
            dattel = new FieldDef("dattel",FieldDef.CHAR,15);
            datfax = new FieldDef("datfax",FieldDef.CHAR,15);
            datfisicajuri = new FieldDef("datfisicajuri",FieldDef.CHAR,1);
            datemail = new FieldDef("datemail",FieldDef.CHAR,100);
            datcontacto = new FieldDef("datcontacto",FieldDef.CHAR,30);
            datipf = new FieldDef("datipf",FieldDef.CHAR,1);
            datdominio = new FieldDef("datdominio",FieldDef.CHAR,12);
            datcbienes = new FieldDef("datcbienes",FieldDef.CHAR,1);
            datnacional = new FieldDef("datnacional",FieldDef.INTEGER,12);
            datmovil = new FieldDef("datmovil",FieldDef.INTEGER,12);
            datuser = new FieldDef("datuser",FieldDef.CHAR,25);
            datgrupo = new FieldDef("datgrupo",FieldDef.CHAR,25);
            datcdptipo = new FieldDef("datcdptipo",FieldDef.CHAR,1);
            datcdpestado = new FieldDef("datcdpestado",FieldDef.CHAR,1);
            datcdpdatep = new FieldDef("datcdpdatep",FieldDef.DATE);
            datcdpdatev = new FieldDef("datcdpdatev",FieldDef.DATE);
            datcdpdatei = new FieldDef("datcdpdatei",FieldDef.DATE);
            datcdpuserp = new FieldDef("datcdpuserp",FieldDef.CHAR,25);
            datcdpuserv = new FieldDef("datcdpuserv",FieldDef.CHAR,25);
            datcdpuseri = new FieldDef("datcdpuseri",FieldDef.CHAR,25);
            FieldDef array[] = {
                datcodigo,
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
                datipf,
                datdominio,
                datcbienes,
                datnacional,
                datmovil,
                datuser,
                datgrupo,
                datcdptipo,
                datcdpestado,
                datcdpdatep,
                datcdpdatev,
                datcdpdatei,
                datcdpuserp,
                datcdpuserv,
                datcdpuseri                
                };
            setColumns(array);
            FieldDef arrayf[] = {datcodigo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfsintereses extends TableDef
        {
        // campos
        public FieldDef dfiejer;
        public FieldDef dfinif;
        public FieldDef dficodigo;
        public FieldDef dfinifpagador;
        public FieldDef dfinompagador;
        public FieldDef dficuenta;
        public FieldDef dfiimporte;
        public TabDfsintereses(String name)
            {
            super(name);
            dfiejer = new FieldDef("dfiejer",FieldDef.INTEGER,12);
            dfinif = new FieldDef("dfinif",FieldDef.CHAR,15);
            dficodigo = new FieldDef("dficodigo",FieldDef.CHAR,7);
            dfinifpagador = new FieldDef("dfinifpagador",FieldDef.CHAR,9);
            dfinompagador = new FieldDef("dfinompagador",FieldDef.CHAR,40);
            dficuenta = new FieldDef("dficuenta",FieldDef.CHAR,10);
            dfiimporte = new FieldDef("dfiimporte",FieldDef.FLOAT,12,0);
            FieldDef array[] = {
                dfiejer,
                dfinif,
                dficodigo,
                dfinifpagador,
                dfinompagador,
                dficuenta,
                dfiimporte                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfiejer,dfinif,dficodigo };
            setDescription("Datos fiscales sociedad");
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDfscorreccion extends TableDef
        {
        // campos
        public FieldDef dfcoejer;
        public FieldDef dfconif;
        public FieldDef dfcocodigo;
        public FieldDef dfcocoddesc;
        public FieldDef dfcoimporteaum;
        public FieldDef dfcocasactaun;
        public FieldDef dfcocasantaum;
        public FieldDef dfcoimportedis;
        public FieldDef dfcocasactdism;
        public FieldDef dfcocasantdism;
        public TabDfscorreccion(String name)
            {
            super(name);
            dfcoejer = new FieldDef("dfcoejer",FieldDef.INTEGER,12);
            dfconif = new FieldDef("dfconif",FieldDef.CHAR,15);
            dfcocodigo = new FieldDef("dfcocodigo",FieldDef.CHAR,7);
            dfcocoddesc = new FieldDef("dfcocoddesc",FieldDef.INTEGER,12);
            dfcoimporteaum = new FieldDef("dfcoimporteaum",FieldDef.FLOAT,12,0);
            dfcocasactaun = new FieldDef("dfcocasactaun",FieldDef.CHAR,6);
            dfcocasantaum = new FieldDef("dfcocasantaum",FieldDef.CHAR,6);
            dfcoimportedis = new FieldDef("dfcoimportedis",FieldDef.FLOAT,12,0);
            dfcocasactdism = new FieldDef("dfcocasactdism",FieldDef.CHAR,6);
            dfcocasantdism = new FieldDef("dfcocasantdism",FieldDef.CHAR,6);
            FieldDef array[] = {
                dfcoejer,
                dfconif,
                dfcocodigo,
                dfcocoddesc,
                dfcoimporteaum,
                dfcocasactaun,
                dfcocasantaum,
                dfcoimportedis,
                dfcocasactdism,
                dfcocasantdism                
                };
            setColumns(array);
            FieldDef arrayf[] = {dfcoejer,dfconif,dfcocodigo };
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
        tabdatosregistral = new TabDatosregistral("datosregistral");
        tabsesiones = new TabSesiones("sesiones");
        tabimpuser = new TabImpuser("impuser");
        tabcnae1993 = new TabCnae1993("cnae1993");
        tabplantillas = new TabPlantillas("plantillas");
        tabformacobpag = new TabFormacobpag("formacobpag");
        tabtareajasper = new TabTareajasper("tareajasper");
        tabtareajasperdet = new TabTareajasperdet("tareajasperdet");
        tabjcopreest = new TabJcopreest("jcopreest");
        tabjcoratis = new TabJcoratis("jcoratis");
        tabjcoepigrafe = new TabJcoepigrafe("jcoepigrafe");
        tabcodcnvotraplc = new TabCodcnvotraplc("codcnvotraplc");
        tabcodcnvotrapll = new TabCodcnvotrapll("codcnvotrapll");
        tabcodcnvinciden = new TabCodcnvinciden("codcnvinciden");
        tablibregmerext = new TabLibregmerext("libregmerext");
        tablogjcontax = new TabLogjcontax("logjcontax");
        tabavisos = new TabAvisos("avisos");
        tabjcoimpexcel = new TabJcoimpexcel("jcoimpexcel");
        tabestilos = new TabEstilos("estilos");
        tabinfplantilla = new TabInfplantilla("infplantilla");
        tabinfplantlinea = new TabInfplantlinea("infplantlinea");
        tabinfplantcol = new TabInfplantcol("infplantcol");
        tabvalidanomaeat = new TabValidanomaeat("validanomaeat");
        tabjcocnvprc = new TabJcocnvprc("jcocnvprc");
        tabpcinmovlog = new TabPcinmovlog("pcinmovlog");
        tabpcinmovhis = new TabPcinmovhis("pcinmovhis");
        tabpcmoranualhis = new TabPcmoranualhis("pcmoranualhis");
        tabpcinmov = new TabPcinmov("pcinmov");
        tabpcmoranual = new TabPcmoranual("pcmoranual");
        tabdiccuentas = new TabDiccuentas("diccuentas");
        tabcambioeuro = new TabCambioeuro("cambioeuro");
        tabseguridad = new TabSeguridad("seguridad");
        tabushistorico = new TabUshistorico("ushistorico");
        tabdicpatron = new TabDicpatron("dicpatron");
        tabdfsdomicilio = new TabDfsdomicilio("dfsdomicilio");
        tabdfscensales = new TabDfscensales("dfscensales");
        tabdfsperiodoycnae = new TabDfsperiodoycnae("dfsperiodoycnae");
        tabdfscaracteres = new TabDfscaracteres("dfscaracteres");
        tabdfsadmins = new TabDfsadmins("dfsadmins");
        tabdfsentidpart = new TabDfsentidpart("dfsentidpart");
        tabdfsperspart = new TabDfsperspart("dfsperspart");
        tabdfssecrerepre = new TabDfssecrerepre("dfssecrerepre");
        tabdfspagosfrac = new TabDfspagosfrac("dfspagosfrac");
        tabdfsvoloper = new TabDfsvoloper("dfsvoloper");
        tabdfsrdtotrab = new TabDfsrdtotrab("dfsrdtotrab");
        tabdfsdeducybases = new TabDfsdeducybases("dfsdeducybases");
        tabdfsdonaciones = new TabDfsdonaciones("dfsdonaciones");
        tabdfsmultasdgt = new TabDfsmultasdgt("dfsmultasdgt");
        tabdfsrdtoctasban = new TabDfsrdtoctasban("dfsrdtoctasban");
        tabdfssanciones = new TabDfssanciones("dfssanciones");
        tabcdpnotificacion = new TabCdpnotificacion("cdpnotificacion");
        tabparamlis = new TabParamlis("paramlis");
        tabdfsadminsninfo = new TabDfsadminsninfo("dfsadminsninfo");
        tabdfssociosninfo = new TabDfssociosninfo("dfssociosninfo");
        tabdfsregdeclarado = new TabDfsregdeclarado("dfsregdeclarado");
        tabdfsrdtimpinfo = new TabDfsrdtimpinfo("dfsrdtimpinfo");
        tabdfsarrlocalimp = new TabDfsarrlocalimp("dfsarrlocalimp");
        tabwnifes = new TabWnifes("wnifes");
        tabdfsintereses = new TabDfsintereses("dfsintereses");
        tabdfscorreccion = new TabDfscorreccion("dfscorreccion");
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
            tabperfilusuario,
            tabdatosregistral,
            tabsesiones,
            tabimpuser,
            tabcnae1993,
            tabplantillas,
            tabformacobpag,
            tabtareajasper,
            tabtareajasperdet,
            tabjcopreest,
            tabjcoratis,
            tabjcoepigrafe,
            tabcodcnvotraplc,
            tabcodcnvotrapll,
            tabcodcnvinciden,
            tablibregmerext,
            tablogjcontax,
            tabavisos,
            tabjcoimpexcel,
            tabestilos,
            tabinfplantilla,
            tabinfplantlinea,
            tabinfplantcol,
            tabvalidanomaeat,
            tabjcocnvprc,
            tabpcinmovlog,
            tabpcinmovhis,
            tabpcmoranualhis,
            tabpcinmov,
            tabpcmoranual,
            tabdiccuentas,
            tabcambioeuro,
            tabseguridad,
            tabushistorico,
            tabdicpatron,
            tabdfsdomicilio,
            tabdfscensales,
            tabdfsperiodoycnae,
            tabdfscaracteres,
            tabdfsadmins,
            tabdfsentidpart,
            tabdfsperspart,
            tabdfssecrerepre,
            tabdfspagosfrac,
            tabdfsvoloper,
            tabdfsrdtotrab,
            tabdfsdeducybases,
            tabdfsdonaciones,
            tabdfsmultasdgt,
            tabdfsrdtoctasban,
            tabdfssanciones,
            tabcdpnotificacion,
            tabparamlis,
            tabdfsadminsninfo,
            tabdfssociosninfo,
            tabdfsregdeclarado,
            tabdfsrdtimpinfo,
            tabdfsarrlocalimp,
            tabwnifes,
            tabdfsintereses,
            tabdfscorreccion            
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
        FieldDef tabusagrupArrayf1[] = { tabusagrup.usacodco,tabusagrup.usalogin };
        FieldDef tabusagrupArrayf2[] = { tabusagrup.usagrupo };
        ForeignKey tabusagrupArrayfk[] = { 
            new ForeignKey(tabusuario,tabusagrupArrayf1),
            new ForeignKey(tabusgrupo,tabusagrupArrayf2)            
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
        FieldDef tabtareajasperdetArrayf1[] = { tabtareajasperdet.tjdtarea };
        ForeignKey tabtareajasperdetArrayfk[] = { 
            new ForeignKey(tabtareajasper,tabtareajasperdetArrayf1)            
            };
        tabtareajasperdet.setForeignKeys(tabtareajasperdetArrayfk);
        FieldDef tabinfplantlineaArrayf1[] = { tabinfplantlinea.iplcodplant };
        FieldDef tabinfplantlineaArrayf2[] = { tabinfplantlinea.iplestilo };
        FieldDef tabinfplantlineaArrayf3[] = { tabinfplantlinea.iplestilot };
        ForeignKey tabinfplantlineaArrayfk[] = { 
            new ForeignKey(tabinfplantilla,tabinfplantlineaArrayf1),
            new ForeignKey(tabestilos,tabinfplantlineaArrayf2),
            new ForeignKey(tabestilos,tabinfplantlineaArrayf3)            
            };
        tabinfplantlinea.setForeignKeys(tabinfplantlineaArrayfk);
        FieldDef tabinfplantcolArrayf1[] = { tabinfplantcol.ipccodplant };
        ForeignKey tabinfplantcolArrayfk[] = { 
            new ForeignKey(tabinfplantilla,tabinfplantcolArrayf1)            
            };
        tabinfplantcol.setForeignKeys(tabinfplantcolArrayfk);
        FieldDef tabpcinmovhisArrayf1[] = { tabpcinmovhis.pcihlog };
        ForeignKey tabpcinmovhisArrayfk[] = { 
            new ForeignKey(tabpcinmovlog,tabpcinmovhisArrayf1)            
            };
        tabpcinmovhis.setForeignKeys(tabpcinmovhisArrayfk);
        FieldDef tabpcmoranualhisArrayf1[] = { tabpcmoranualhis.pcmhelemento };
        ForeignKey tabpcmoranualhisArrayfk[] = { 
            new ForeignKey(tabpcinmovhis,tabpcmoranualhisArrayf1)            
            };
        tabpcmoranualhis.setForeignKeys(tabpcmoranualhisArrayfk);
        FieldDef tabpcmoranualArrayf1[] = { tabpcmoranual.pcmelemento };
        ForeignKey tabpcmoranualArrayfk[] = { 
            new ForeignKey(tabpcinmov,tabpcmoranualArrayf1)            
            };
        tabpcmoranual.setForeignKeys(tabpcmoranualArrayfk);
        }
    }
    
