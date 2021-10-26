// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Tue Oct 26 09:33:33 CEST 2021
// 
// Aplicación: easp
// 
package mae.easp.db;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.general.*;
// 
public class CatModigic extends Catalog
    {
    // tablas
    public TabMod420 tabmod420;
    public TabMod425 tabmod425;
    public TabMod4251 tabmod4251;
    public TabMod4252 tabmod4252;
    public TabMod415 tabmod415;
    public TabMod415d tabmod415d;
    public TabMod415i tabmod415i;
    public TabModigicc tabmodigicc;
    public TabModigicl tabmodigicl;
    public TabModigicagr tabmodigicagr;
    public TabModigic tabmodigic;
    public TabMod421des tabmod421des;
    public TabModagrigic tabmodagrigic;
    public TabMod421 tabmod421;
    public TabMod421m tabmod421m;
    public TabMod417 tabmod417;
    public TabMod417p4 tabmod417p4;
    public TabMod417p5 tabmod417p5;
    public TabMod420n tabmod420n;
    public TabMod420f tabmod420f;
    public class TabMod420 extends TableDef
        {
        // campos
        public FieldDef m420nif;
        public FieldDef m420ejercicio;
        public FieldDef m420periodo;
        public FieldDef m420modelo;
        public FieldDef m420apellidos;
        public FieldDef m420nombre;
        public FieldDef m420codadmon;
        public FieldDef m420siglas;
        public FieldDef m420calle;
        public FieldDef m420numero;
        public FieldDef m420escalera;
        public FieldDef m420piso;
        public FieldDef m420puerta;
        public FieldDef m420cpostal;
        public FieldDef m420municipio;
        public FieldDef m420provincia;
        public FieldDef m420telefono;
        public FieldDef m420fax;
        public FieldDef m420devbase1;
        public FieldDef m420devbase2;
        public FieldDef m420devbase3;
        public FieldDef m420devbase4;
        public FieldDef m420devbase5;
        public FieldDef m420devbase6;
        public FieldDef m420devporcen1;
        public FieldDef m420devporcen2;
        public FieldDef m420devporcen3;
        public FieldDef m420devporcen4;
        public FieldDef m420devporcen5;
        public FieldDef m420devporcen6;
        public FieldDef m420devcuota1;
        public FieldDef m420devcuota2;
        public FieldDef m420devcuota3;
        public FieldDef m420devcuota4;
        public FieldDef m420devcuota5;
        public FieldDef m420devcuota6;
        public FieldDef m420devcuoisp;
        public FieldDef m420devcuorec;
        public FieldDef m420devcuotot;
        public FieldDef m420dedopin;
        public FieldDef m420dedimpor;
        public FieldDef m420dedragp;
        public FieldDef m420dedreginv;
        public FieldDef m420dedcuovia;
        public FieldDef m420dedcuorec;
        public FieldDef m420dedcuotot;
        public FieldDef m420diferencia;
        public FieldDef m420cuocompen;
        public FieldDef m420adeducir;
        public FieldDef m420resultado;
        public FieldDef m420cruzefec;
        public FieldDef m420cruzadeu;
        public FieldDef m420impingreso;
        public FieldDef m420entingreso;
        public FieldDef m420ofiingreso;
        public FieldDef m420digiingreso;
        public FieldDef m420ctaingreso;
        public FieldDef m420impcompen;
        public FieldDef m420sinactiv;
        public FieldDef m420complemen;
        public FieldDef m420impdevol;
        public FieldDef m420entdevol;
        public FieldDef m420ofidevol;
        public FieldDef m420digidevol;
        public FieldDef m420ctadevol;
        public FieldDef m420numjustif;
        public FieldDef m420tipodecl;
        public FieldDef m420fecha;
        public FieldDef m420acreed;
        public FieldDef m420ibanpaing;
        public FieldDef m420ibandcing;
        public FieldDef m420ibanpadev;
        public FieldDef m420ibandcdev;
        public FieldDef m420formapago;
        public TabMod420(String name)
            {
            super(name);
            m420nif = new FieldDef("m420nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m420ejercicio = new FieldDef("m420ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m420periodo = new FieldDef("m420periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m420modelo = new FieldDef("m420modelo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            m420apellidos = new FieldDef("m420apellidos",FieldDef.CHAR,75);
            m420nombre = new FieldDef("m420nombre",FieldDef.CHAR,15);
            m420codadmon = new FieldDef("m420codadmon",FieldDef.CHAR,5);
            m420siglas = new FieldDef("m420siglas",FieldDef.CHAR,2);
            m420calle = new FieldDef("m420calle",FieldDef.CHAR,17);
            m420numero = new FieldDef("m420numero",FieldDef.CHAR,4);
            m420escalera = new FieldDef("m420escalera",FieldDef.CHAR,2);
            m420piso = new FieldDef("m420piso",FieldDef.CHAR,2);
            m420puerta = new FieldDef("m420puerta",FieldDef.CHAR,2);
            m420cpostal = new FieldDef("m420cpostal",FieldDef.CHAR,5);
            m420municipio = new FieldDef("m420municipio",FieldDef.INTEGER,0);
            m420provincia = new FieldDef("m420provincia",FieldDef.INTEGER,0);
            m420telefono = new FieldDef("m420telefono",FieldDef.CHAR,9);
            m420fax = new FieldDef("m420fax",FieldDef.CHAR,9);
            m420devbase1 = new FieldDef("m420devbase1",FieldDef.FLOAT,6,0);
            m420devbase2 = new FieldDef("m420devbase2",FieldDef.FLOAT,6,0);
            m420devbase3 = new FieldDef("m420devbase3",FieldDef.FLOAT,6,0);
            m420devbase4 = new FieldDef("m420devbase4",FieldDef.FLOAT,6,0);
            m420devbase5 = new FieldDef("m420devbase5",FieldDef.FLOAT,6,0);
            m420devbase6 = new FieldDef("m420devbase6",FieldDef.FLOAT,6,0);
            m420devporcen1 = new FieldDef("m420devporcen1",FieldDef.FLOAT,6,0);
            m420devporcen2 = new FieldDef("m420devporcen2",FieldDef.FLOAT,6,0);
            m420devporcen3 = new FieldDef("m420devporcen3",FieldDef.FLOAT,6,0);
            m420devporcen4 = new FieldDef("m420devporcen4",FieldDef.FLOAT,6,0);
            m420devporcen5 = new FieldDef("m420devporcen5",FieldDef.FLOAT,6,0);
            m420devporcen6 = new FieldDef("m420devporcen6",FieldDef.FLOAT,6,0);
            m420devcuota1 = new FieldDef("m420devcuota1",FieldDef.FLOAT,6,0);
            m420devcuota2 = new FieldDef("m420devcuota2",FieldDef.FLOAT,6,0);
            m420devcuota3 = new FieldDef("m420devcuota3",FieldDef.FLOAT,6,0);
            m420devcuota4 = new FieldDef("m420devcuota4",FieldDef.FLOAT,6,0);
            m420devcuota5 = new FieldDef("m420devcuota5",FieldDef.FLOAT,6,0);
            m420devcuota6 = new FieldDef("m420devcuota6",FieldDef.FLOAT,6,0);
            m420devcuoisp = new FieldDef("m420devcuoisp",FieldDef.FLOAT,6,0);
            m420devcuorec = new FieldDef("m420devcuorec",FieldDef.FLOAT,6,0);
            m420devcuotot = new FieldDef("m420devcuotot",FieldDef.FLOAT,6,0);
            m420dedopin = new FieldDef("m420dedopin",FieldDef.FLOAT,6,0);
            m420dedimpor = new FieldDef("m420dedimpor",FieldDef.FLOAT,6,0);
            m420dedragp = new FieldDef("m420dedragp",FieldDef.FLOAT,6,0);
            m420dedreginv = new FieldDef("m420dedreginv",FieldDef.FLOAT,6,0);
            m420dedcuovia = new FieldDef("m420dedcuovia",FieldDef.FLOAT,6,0);
            m420dedcuorec = new FieldDef("m420dedcuorec",FieldDef.FLOAT,6,0);
            m420dedcuotot = new FieldDef("m420dedcuotot",FieldDef.FLOAT,6,0);
            m420diferencia = new FieldDef("m420diferencia",FieldDef.FLOAT,6,0);
            m420cuocompen = new FieldDef("m420cuocompen",FieldDef.FLOAT,6,0);
            m420adeducir = new FieldDef("m420adeducir",FieldDef.FLOAT,6,0);
            m420resultado = new FieldDef("m420resultado",FieldDef.FLOAT,6,0);
            m420cruzefec = new FieldDef("m420cruzefec",FieldDef.CHAR,1);
            m420cruzadeu = new FieldDef("m420cruzadeu",FieldDef.CHAR,1);
            m420impingreso = new FieldDef("m420impingreso",FieldDef.FLOAT,6,0);
            m420entingreso = new FieldDef("m420entingreso",FieldDef.CHAR,4);
            m420ofiingreso = new FieldDef("m420ofiingreso",FieldDef.CHAR,4);
            m420digiingreso = new FieldDef("m420digiingreso",FieldDef.CHAR,2);
            m420ctaingreso = new FieldDef("m420ctaingreso",FieldDef.CHAR,10);
            m420impcompen = new FieldDef("m420impcompen",FieldDef.FLOAT,6,0);
            m420sinactiv = new FieldDef("m420sinactiv",FieldDef.CHAR,1);
            m420complemen = new FieldDef("m420complemen",FieldDef.CHAR,1);
            m420impdevol = new FieldDef("m420impdevol",FieldDef.FLOAT,6,0);
            m420entdevol = new FieldDef("m420entdevol",FieldDef.CHAR,4);
            m420ofidevol = new FieldDef("m420ofidevol",FieldDef.CHAR,4);
            m420digidevol = new FieldDef("m420digidevol",FieldDef.CHAR,2);
            m420ctadevol = new FieldDef("m420ctadevol",FieldDef.CHAR,10);
            m420numjustif = new FieldDef("m420numjustif",FieldDef.CHAR,13);
            m420tipodecl = new FieldDef("m420tipodecl",FieldDef.CHAR,1);
            m420fecha = new FieldDef("m420fecha",FieldDef.DATE);
            m420acreed = new FieldDef("m420acreed",FieldDef.CHAR,1);
            m420ibanpaing = new FieldDef("m420ibanpaing",FieldDef.CHAR,2);
            m420ibandcing = new FieldDef("m420ibandcing",FieldDef.CHAR,2);
            m420ibanpadev = new FieldDef("m420ibanpadev",FieldDef.CHAR,2);
            m420ibandcdev = new FieldDef("m420ibandcdev",FieldDef.CHAR,2);
            m420formapago = new FieldDef("m420formapago",FieldDef.INTEGER,0);
            FieldDef array[] = {
                m420nif,
                m420ejercicio,
                m420periodo,
                m420modelo,
                m420apellidos,
                m420nombre,
                m420codadmon,
                m420siglas,
                m420calle,
                m420numero,
                m420escalera,
                m420piso,
                m420puerta,
                m420cpostal,
                m420municipio,
                m420provincia,
                m420telefono,
                m420fax,
                m420devbase1,
                m420devbase2,
                m420devbase3,
                m420devbase4,
                m420devbase5,
                m420devbase6,
                m420devporcen1,
                m420devporcen2,
                m420devporcen3,
                m420devporcen4,
                m420devporcen5,
                m420devporcen6,
                m420devcuota1,
                m420devcuota2,
                m420devcuota3,
                m420devcuota4,
                m420devcuota5,
                m420devcuota6,
                m420devcuoisp,
                m420devcuorec,
                m420devcuotot,
                m420dedopin,
                m420dedimpor,
                m420dedragp,
                m420dedreginv,
                m420dedcuovia,
                m420dedcuorec,
                m420dedcuotot,
                m420diferencia,
                m420cuocompen,
                m420adeducir,
                m420resultado,
                m420cruzefec,
                m420cruzadeu,
                m420impingreso,
                m420entingreso,
                m420ofiingreso,
                m420digiingreso,
                m420ctaingreso,
                m420impcompen,
                m420sinactiv,
                m420complemen,
                m420impdevol,
                m420entdevol,
                m420ofidevol,
                m420digidevol,
                m420ctadevol,
                m420numjustif,
                m420tipodecl,
                m420fecha,
                m420acreed,
                m420ibanpaing,
                m420ibandcing,
                m420ibanpadev,
                m420ibandcdev,
                m420formapago                
                };
            setColumns(array);
            FieldDef arrayf[] = {m420nif,m420ejercicio,m420periodo,m420modelo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod425 extends TableDef
        {
        // campos
        public FieldDef m4250dominio;
        public FieldDef m4250nif;
        public FieldDef m4250ejercicio;
        public FieldDef m4250periodo;
        public FieldDef m4250modelo;
        public FieldDef m4250nombre;
        public FieldDef m4250codadmon;
        public FieldDef m4250granemp;
        public FieldDef m4250devmensual;
        public FieldDef m4250sustitu;
        public FieldDef m4250nrojusti;
        public FieldDef m4250tipvia;
        public FieldDef m4250via;
        public FieldDef m4250nro;
        public FieldDef m4250esc;
        public FieldDef m4250piso;
        public FieldDef m4250pta;
        public FieldDef m4250telf;
        public FieldDef m4250prov;
        public FieldDef m4250municipio;
        public FieldDef m4250cpostal;
        public FieldDef m4250fax;
        public FieldDef m4250opsuper;
        public FieldDef m4250regusados;
        public FieldDef m4250regarte;
        public FieldDef m4250repfnif;
        public FieldDef m4250repfapell;
        public FieldDef m4250repftipvia;
        public FieldDef m4250repfcalle;
        public FieldDef m4250repfnro;
        public FieldDef m4250repfesc;
        public FieldDef m4250repfpiso;
        public FieldDef m4250repfpta;
        public FieldDef m4250repftelf;
        public FieldDef m4250repfprov;
        public FieldDef m4250repfmuni;
        public FieldDef m4250repfcpos;
        public FieldDef m4250repffax;
        public FieldDef m4250repflugar;
        public FieldDef m4250repjnif1;
        public FieldDef m4250repjapell1;
        public FieldDef m4250repjnotar1;
        public FieldDef m4250repjfec1;
        public FieldDef m4250repjnif2;
        public FieldDef m4250repjapell2;
        public FieldDef m4250repjnotar2;
        public FieldDef m4250repjfec2;
        public FieldDef m4250repjnif3;
        public FieldDef m4250repjapell3;
        public FieldDef m4250repjnotar3;
        public FieldDef m4250repjfec3;
        public FieldDef m4250porcen1;
        public FieldDef m4250porcen2;
        public FieldDef m4250porcen3;
        public FieldDef m4250porcen4;
        public FieldDef m4250porcen5;
        public FieldDef m4250porcen6;
        public FieldDef m4250porcen7;
        public FieldDef m4250porcen8;
        public FieldDef m4250porcen9;
        public FieldDef m4250porcen10;
        public FieldDef m4250porcen11;
        public FieldDef m4250porcen12;
        public FieldDef m4250porcen13;
        public FieldDef m4250porcen14;
        public FieldDef m4250porcen15;
        public FieldDef m4250porcen16;
        public FieldDef m4250porcen17;
        public FieldDef m4250porcen18;
        public FieldDef m4250ordinbase1;
        public FieldDef m4250ordincuot1;
        public FieldDef m4250ordinbase2;
        public FieldDef m4250ordincuot2;
        public FieldDef m4250ordinbase3;
        public FieldDef m4250ordincuot3;
        public FieldDef m4250ordinbase4;
        public FieldDef m4250ordincuot4;
        public FieldDef m4250ordinbase5;
        public FieldDef m4250ordincuot5;
        public FieldDef m4250ordinbase6;
        public FieldDef m4250ordincuot6;
        public FieldDef m4250ordinbase7;
        public FieldDef m4250ordincuot7;
        public FieldDef m4250usadobase1;
        public FieldDef m4250usadocuot1;
        public FieldDef m4250usadobase2;
        public FieldDef m4250usadocuot2;
        public FieldDef m4250usadobase3;
        public FieldDef m4250usadocuot3;
        public FieldDef m4250usadobase4;
        public FieldDef m4250usadocuot4;
        public FieldDef m4250usadobase5;
        public FieldDef m4250usadocuot5;
        public FieldDef m4250artebase1;
        public FieldDef m4250artecuot1;
        public FieldDef m4250artebase2;
        public FieldDef m4250artecuot2;
        public FieldDef m4250artebase3;
        public FieldDef m4250artecuot3;
        public FieldDef m4250artebase4;
        public FieldDef m4250artecuot4;
        public FieldDef m4250artebase5;
        public FieldDef m4250artecuot5;
        public FieldDef m4250viajebase1;
        public FieldDef m4250viajecuot1;
        public FieldDef m4250modifbase1;
        public FieldDef m4250modifcuot1;
        public FieldDef m4250modcobase1;
        public FieldDef m4250modcocuot1;
        public FieldDef m4250totbasecuo;
        public FieldDef m4250invsujeto;
        public FieldDef m4250totalcigic;
        public FieldDef m4250sopcorrien;
        public FieldDef m4250sopinver;
        public FieldDef m4250imporcorri;
        public FieldDef m4250imporinver;
        public FieldDef m4250compenreag;
        public FieldDef m4250regularinv;
        public FieldDef m4250devenviaje;
        public FieldDef m4250rectifsop;
        public FieldDef m4250sumadeduc;
        public FieldDef m4250resareggra;
        public FieldDef m4250resacomeja;
        public FieldDef m4250resaautoli;
        public FieldDef m4250rscdevenga;
        public FieldDef m4250rscinvsp;
        public FieldDef m4250rscarrend;
        public FieldDef m4250rsrectifi;
        public FieldDef m4250rstotcuota;
        public FieldDef m4250ocuoactivo;
        public FieldDef m4250ocuoarrend;
        public FieldDef m4250ocuototded;
        public FieldDef m4250rresultado;
        public FieldDef m4250rcompejant;
        public FieldDef m4250rrautoliq;
        public FieldDef m4250aingejer;
        public FieldDef m4250adevmes;
        public FieldDef m4250acompensar;
        public FieldDef m4250adevolver;
        public FieldDef m4250espreggral;
        public FieldDef m4250espexporta;
        public FieldDef m4250espaexenta;
        public FieldDef m4250espexentas;
        public FieldDef m4250espexensin;
        public FieldDef m4250espregsimp;
        public FieldDef m4250espregagr;
        public FieldDef m4250esptotal;
        public FieldDef m4250espinvsuj;
        public FieldDef m4250espeinm;
        public FieldDef m4250espinvtra;
        public FieldDef m4250espinvadq;
        public FieldDef m4250espinvex;
        public FieldDef m4250espsopno;
        public FieldDef m4250espnosujet;
        public FieldDef m4250sustiturec;
        public FieldDef m4250destcaja;
        public FieldDef m4250estconjnif;
        public FieldDef m4250estconjrso;
        public FieldDef m4250reccbase1;
        public FieldDef m4250recccuot1;
        public FieldDef m4250reccbase2;
        public FieldDef m4250recccuot2;
        public FieldDef m4250reccbase3;
        public FieldDef m4250recccuot3;
        public FieldDef m4250reccbase4;
        public FieldDef m4250recccuot4;
        public FieldDef m4250reccbase5;
        public FieldDef m4250recccuot5;
        public FieldDef m4250reccbase6;
        public FieldDef m4250recccuot6;
        public FieldDef m4250reccbase7;
        public FieldDef m4250recccuot7;
        public FieldDef m4250esprecc;
        public FieldDef m4250opespcaja1;
        public FieldDef m4250opespcaja2;
        public FieldDef m4250opespcaja3;
        public FieldDef m4250opespcaja4;
        public FieldDef m4250esrepep;
        public FieldDef m4250ispbase;
        public FieldDef m4250ispcuota;
        public FieldDef m4250viajerobas;
        public FieldDef m4250viajerocuo;
        public FieldDef m4250sopcorrieb;
        public FieldDef m4250sopinverb;
        public FieldDef m4250imporcorrb;
        public FieldDef m4250imporinveb;
        public FieldDef m4250rectifsopb;
        public FieldDef m4250cuotasopbi;
        public FieldDef m4250porcdefpro;
        public FieldDef m4250regula2285;
        public FieldDef m4250rlasumres;
        public FieldDef m4250rlaresult;
        public FieldDef m4250esprecc18;
        public FieldDef m4250espexe25sp;
        public FieldDef m4250espnlocisp;
        public FieldDef m4250espbuarte;
        public FieldDef m4250espaviajes;
        public FieldDef m4250repep142;
        public FieldDef m4250repep143;
        public FieldDef m4250repep144;
        public FieldDef m4250repep145;
        public FieldDef m4250repep146;
        public FieldDef m4250repep147;
        public FieldDef m4250ordinbisb;
        public FieldDef m4250ordinbisc;
        public FieldDef m4250ordinbisp;
        public FieldDef m4250reccbisb;
        public FieldDef m4250reccbisc;
        public FieldDef m4250reccbisp;
        public TabMod425(String name)
            {
            super(name);
            m4250dominio = new FieldDef("m4250dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m4250nif = new FieldDef("m4250nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m4250ejercicio = new FieldDef("m4250ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m4250periodo = new FieldDef("m4250periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m4250modelo = new FieldDef("m4250modelo",FieldDef.CHAR,3,FieldDef.NOTNULL);
            m4250nombre = new FieldDef("m4250nombre",FieldDef.CHAR,75);
            m4250codadmon = new FieldDef("m4250codadmon",FieldDef.CHAR,5);
            m4250granemp = new FieldDef("m4250granemp",FieldDef.CHAR,1);
            m4250devmensual = new FieldDef("m4250devmensual",FieldDef.CHAR,1);
            m4250sustitu = new FieldDef("m4250sustitu",FieldDef.CHAR,1);
            m4250nrojusti = new FieldDef("m4250nrojusti",FieldDef.CHAR,13);
            m4250tipvia = new FieldDef("m4250tipvia",FieldDef.CHAR,2);
            m4250via = new FieldDef("m4250via",FieldDef.CHAR,50);
            m4250nro = new FieldDef("m4250nro",FieldDef.INTEGER,0);
            m4250esc = new FieldDef("m4250esc",FieldDef.CHAR,2);
            m4250piso = new FieldDef("m4250piso",FieldDef.CHAR,2);
            m4250pta = new FieldDef("m4250pta",FieldDef.CHAR,4);
            m4250telf = new FieldDef("m4250telf",FieldDef.CHAR,9);
            m4250prov = new FieldDef("m4250prov",FieldDef.INTEGER,0);
            m4250municipio = new FieldDef("m4250municipio",FieldDef.INTEGER,0);
            m4250cpostal = new FieldDef("m4250cpostal",FieldDef.CHAR,5);
            m4250fax = new FieldDef("m4250fax",FieldDef.CHAR,9);
            m4250opsuper = new FieldDef("m4250opsuper",FieldDef.CHAR,1);
            m4250regusados = new FieldDef("m4250regusados",FieldDef.CHAR,1);
            m4250regarte = new FieldDef("m4250regarte",FieldDef.CHAR,1);
            m4250repfnif = new FieldDef("m4250repfnif",FieldDef.CHAR,9);
            m4250repfapell = new FieldDef("m4250repfapell",FieldDef.CHAR,75);
            m4250repftipvia = new FieldDef("m4250repftipvia",FieldDef.CHAR,2);
            m4250repfcalle = new FieldDef("m4250repfcalle",FieldDef.CHAR,17);
            m4250repfnro = new FieldDef("m4250repfnro",FieldDef.INTEGER,0);
            m4250repfesc = new FieldDef("m4250repfesc",FieldDef.CHAR,2);
            m4250repfpiso = new FieldDef("m4250repfpiso",FieldDef.CHAR,2);
            m4250repfpta = new FieldDef("m4250repfpta",FieldDef.CHAR,4);
            m4250repftelf = new FieldDef("m4250repftelf",FieldDef.CHAR,9);
            m4250repfprov = new FieldDef("m4250repfprov",FieldDef.INTEGER,0);
            m4250repfmuni = new FieldDef("m4250repfmuni",FieldDef.INTEGER,0);
            m4250repfcpos = new FieldDef("m4250repfcpos",FieldDef.CHAR,5);
            m4250repffax = new FieldDef("m4250repffax",FieldDef.CHAR,9);
            m4250repflugar = new FieldDef("m4250repflugar",FieldDef.CHAR,30);
            m4250repjnif1 = new FieldDef("m4250repjnif1",FieldDef.CHAR,9);
            m4250repjapell1 = new FieldDef("m4250repjapell1",FieldDef.CHAR,37);
            m4250repjnotar1 = new FieldDef("m4250repjnotar1",FieldDef.CHAR,25);
            m4250repjfec1 = new FieldDef("m4250repjfec1",FieldDef.DATE);
            m4250repjnif2 = new FieldDef("m4250repjnif2",FieldDef.CHAR,9);
            m4250repjapell2 = new FieldDef("m4250repjapell2",FieldDef.CHAR,37);
            m4250repjnotar2 = new FieldDef("m4250repjnotar2",FieldDef.CHAR,25);
            m4250repjfec2 = new FieldDef("m4250repjfec2",FieldDef.DATE);
            m4250repjnif3 = new FieldDef("m4250repjnif3",FieldDef.CHAR,9);
            m4250repjapell3 = new FieldDef("m4250repjapell3",FieldDef.CHAR,37);
            m4250repjnotar3 = new FieldDef("m4250repjnotar3",FieldDef.CHAR,25);
            m4250repjfec3 = new FieldDef("m4250repjfec3",FieldDef.DATE);
            m4250porcen1 = new FieldDef("m4250porcen1",FieldDef.FLOAT,6,0);
            m4250porcen2 = new FieldDef("m4250porcen2",FieldDef.FLOAT,6,0);
            m4250porcen3 = new FieldDef("m4250porcen3",FieldDef.FLOAT,6,0);
            m4250porcen4 = new FieldDef("m4250porcen4",FieldDef.FLOAT,6,0);
            m4250porcen5 = new FieldDef("m4250porcen5",FieldDef.FLOAT,6,0);
            m4250porcen6 = new FieldDef("m4250porcen6",FieldDef.FLOAT,6,0);
            m4250porcen7 = new FieldDef("m4250porcen7",FieldDef.FLOAT,6,0);
            m4250porcen8 = new FieldDef("m4250porcen8",FieldDef.FLOAT,6,0);
            m4250porcen9 = new FieldDef("m4250porcen9",FieldDef.FLOAT,6,0);
            m4250porcen10 = new FieldDef("m4250porcen10",FieldDef.FLOAT,6,0);
            m4250porcen11 = new FieldDef("m4250porcen11",FieldDef.FLOAT,6,0);
            m4250porcen12 = new FieldDef("m4250porcen12",FieldDef.FLOAT,6,0);
            m4250porcen13 = new FieldDef("m4250porcen13",FieldDef.FLOAT,6,0);
            m4250porcen14 = new FieldDef("m4250porcen14",FieldDef.FLOAT,6,0);
            m4250porcen15 = new FieldDef("m4250porcen15",FieldDef.FLOAT,6,0);
            m4250porcen16 = new FieldDef("m4250porcen16",FieldDef.FLOAT,6,0);
            m4250porcen17 = new FieldDef("m4250porcen17",FieldDef.FLOAT,6,0);
            m4250porcen18 = new FieldDef("m4250porcen18",FieldDef.FLOAT,6,0);
            m4250ordinbase1 = new FieldDef("m4250ordinbase1",FieldDef.FLOAT,6,0);
            m4250ordincuot1 = new FieldDef("m4250ordincuot1",FieldDef.FLOAT,6,0);
            m4250ordinbase2 = new FieldDef("m4250ordinbase2",FieldDef.FLOAT,6,0);
            m4250ordincuot2 = new FieldDef("m4250ordincuot2",FieldDef.FLOAT,6,0);
            m4250ordinbase3 = new FieldDef("m4250ordinbase3",FieldDef.FLOAT,6,0);
            m4250ordincuot3 = new FieldDef("m4250ordincuot3",FieldDef.FLOAT,6,0);
            m4250ordinbase4 = new FieldDef("m4250ordinbase4",FieldDef.FLOAT,6,0);
            m4250ordincuot4 = new FieldDef("m4250ordincuot4",FieldDef.FLOAT,6,0);
            m4250ordinbase5 = new FieldDef("m4250ordinbase5",FieldDef.FLOAT,6,0);
            m4250ordincuot5 = new FieldDef("m4250ordincuot5",FieldDef.FLOAT,6,0);
            m4250ordinbase6 = new FieldDef("m4250ordinbase6",FieldDef.FLOAT,6,0);
            m4250ordincuot6 = new FieldDef("m4250ordincuot6",FieldDef.FLOAT,6,0);
            m4250ordinbase7 = new FieldDef("m4250ordinbase7",FieldDef.FLOAT,6,0);
            m4250ordincuot7 = new FieldDef("m4250ordincuot7",FieldDef.FLOAT,6,0);
            m4250usadobase1 = new FieldDef("m4250usadobase1",FieldDef.FLOAT,6,0);
            m4250usadocuot1 = new FieldDef("m4250usadocuot1",FieldDef.FLOAT,6,0);
            m4250usadobase2 = new FieldDef("m4250usadobase2",FieldDef.FLOAT,6,0);
            m4250usadocuot2 = new FieldDef("m4250usadocuot2",FieldDef.FLOAT,6,0);
            m4250usadobase3 = new FieldDef("m4250usadobase3",FieldDef.FLOAT,6,0);
            m4250usadocuot3 = new FieldDef("m4250usadocuot3",FieldDef.FLOAT,6,0);
            m4250usadobase4 = new FieldDef("m4250usadobase4",FieldDef.FLOAT,6,0);
            m4250usadocuot4 = new FieldDef("m4250usadocuot4",FieldDef.FLOAT,6,0);
            m4250usadobase5 = new FieldDef("m4250usadobase5",FieldDef.FLOAT,6,0);
            m4250usadocuot5 = new FieldDef("m4250usadocuot5",FieldDef.FLOAT,6,0);
            m4250artebase1 = new FieldDef("m4250artebase1",FieldDef.FLOAT,6,0);
            m4250artecuot1 = new FieldDef("m4250artecuot1",FieldDef.FLOAT,6,0);
            m4250artebase2 = new FieldDef("m4250artebase2",FieldDef.FLOAT,6,0);
            m4250artecuot2 = new FieldDef("m4250artecuot2",FieldDef.FLOAT,6,0);
            m4250artebase3 = new FieldDef("m4250artebase3",FieldDef.FLOAT,6,0);
            m4250artecuot3 = new FieldDef("m4250artecuot3",FieldDef.FLOAT,6,0);
            m4250artebase4 = new FieldDef("m4250artebase4",FieldDef.FLOAT,6,0);
            m4250artecuot4 = new FieldDef("m4250artecuot4",FieldDef.FLOAT,6,0);
            m4250artebase5 = new FieldDef("m4250artebase5",FieldDef.FLOAT,6,0);
            m4250artecuot5 = new FieldDef("m4250artecuot5",FieldDef.FLOAT,6,0);
            m4250viajebase1 = new FieldDef("m4250viajebase1",FieldDef.FLOAT,6,0);
            m4250viajecuot1 = new FieldDef("m4250viajecuot1",FieldDef.FLOAT,6,0);
            m4250modifbase1 = new FieldDef("m4250modifbase1",FieldDef.FLOAT,6,0);
            m4250modifcuot1 = new FieldDef("m4250modifcuot1",FieldDef.FLOAT,6,0);
            m4250modcobase1 = new FieldDef("m4250modcobase1",FieldDef.FLOAT,6,0);
            m4250modcocuot1 = new FieldDef("m4250modcocuot1",FieldDef.FLOAT,6,0);
            m4250totbasecuo = new FieldDef("m4250totbasecuo",FieldDef.FLOAT,6,0);
            m4250invsujeto = new FieldDef("m4250invsujeto",FieldDef.FLOAT,6,0);
            m4250totalcigic = new FieldDef("m4250totalcigic",FieldDef.FLOAT,6,0);
            m4250sopcorrien = new FieldDef("m4250sopcorrien",FieldDef.FLOAT,6,0);
            m4250sopinver = new FieldDef("m4250sopinver",FieldDef.FLOAT,6,0);
            m4250imporcorri = new FieldDef("m4250imporcorri",FieldDef.FLOAT,6,0);
            m4250imporinver = new FieldDef("m4250imporinver",FieldDef.FLOAT,6,0);
            m4250compenreag = new FieldDef("m4250compenreag",FieldDef.FLOAT,6,0);
            m4250regularinv = new FieldDef("m4250regularinv",FieldDef.FLOAT,6,0);
            m4250devenviaje = new FieldDef("m4250devenviaje",FieldDef.FLOAT,6,0);
            m4250rectifsop = new FieldDef("m4250rectifsop",FieldDef.FLOAT,6,0);
            m4250sumadeduc = new FieldDef("m4250sumadeduc",FieldDef.FLOAT,6,0);
            m4250resareggra = new FieldDef("m4250resareggra",FieldDef.FLOAT,6,0);
            m4250resacomeja = new FieldDef("m4250resacomeja",FieldDef.FLOAT,6,0);
            m4250resaautoli = new FieldDef("m4250resaautoli",FieldDef.FLOAT,6,0);
            m4250rscdevenga = new FieldDef("m4250rscdevenga",FieldDef.FLOAT,6,0);
            m4250rscinvsp = new FieldDef("m4250rscinvsp",FieldDef.FLOAT,6,0);
            m4250rscarrend = new FieldDef("m4250rscarrend",FieldDef.FLOAT,6,0);
            m4250rsrectifi = new FieldDef("m4250rsrectifi",FieldDef.FLOAT,6,0);
            m4250rstotcuota = new FieldDef("m4250rstotcuota",FieldDef.FLOAT,6,0);
            m4250ocuoactivo = new FieldDef("m4250ocuoactivo",FieldDef.FLOAT,6,0);
            m4250ocuoarrend = new FieldDef("m4250ocuoarrend",FieldDef.FLOAT,6,0);
            m4250ocuototded = new FieldDef("m4250ocuototded",FieldDef.FLOAT,6,0);
            m4250rresultado = new FieldDef("m4250rresultado",FieldDef.FLOAT,6,0);
            m4250rcompejant = new FieldDef("m4250rcompejant",FieldDef.FLOAT,6,0);
            m4250rrautoliq = new FieldDef("m4250rrautoliq",FieldDef.FLOAT,6,0);
            m4250aingejer = new FieldDef("m4250aingejer",FieldDef.FLOAT,6,0);
            m4250adevmes = new FieldDef("m4250adevmes",FieldDef.FLOAT,6,0);
            m4250acompensar = new FieldDef("m4250acompensar",FieldDef.FLOAT,6,0);
            m4250adevolver = new FieldDef("m4250adevolver",FieldDef.FLOAT,6,0);
            m4250espreggral = new FieldDef("m4250espreggral",FieldDef.FLOAT,6,0);
            m4250espexporta = new FieldDef("m4250espexporta",FieldDef.FLOAT,6,0);
            m4250espaexenta = new FieldDef("m4250espaexenta",FieldDef.FLOAT,6,0);
            m4250espexentas = new FieldDef("m4250espexentas",FieldDef.FLOAT,6,0);
            m4250espexensin = new FieldDef("m4250espexensin",FieldDef.FLOAT,6,0);
            m4250espregsimp = new FieldDef("m4250espregsimp",FieldDef.FLOAT,6,0);
            m4250espregagr = new FieldDef("m4250espregagr",FieldDef.FLOAT,6,0);
            m4250esptotal = new FieldDef("m4250esptotal",FieldDef.FLOAT,6,0);
            m4250espinvsuj = new FieldDef("m4250espinvsuj",FieldDef.FLOAT,6,0);
            m4250espeinm = new FieldDef("m4250espeinm",FieldDef.FLOAT,6,0);
            m4250espinvtra = new FieldDef("m4250espinvtra",FieldDef.FLOAT,6,0);
            m4250espinvadq = new FieldDef("m4250espinvadq",FieldDef.FLOAT,6,0);
            m4250espinvex = new FieldDef("m4250espinvex",FieldDef.FLOAT,6,0);
            m4250espsopno = new FieldDef("m4250espsopno",FieldDef.FLOAT,6,0);
            m4250espnosujet = new FieldDef("m4250espnosujet",FieldDef.FLOAT,6,0);
            m4250sustiturec = new FieldDef("m4250sustiturec",FieldDef.CHAR,1);
            m4250destcaja = new FieldDef("m4250destcaja",FieldDef.CHAR,1);
            m4250estconjnif = new FieldDef("m4250estconjnif",FieldDef.CHAR,9);
            m4250estconjrso = new FieldDef("m4250estconjrso",FieldDef.CHAR,37);
            m4250reccbase1 = new FieldDef("m4250reccbase1",FieldDef.FLOAT,6,0);
            m4250recccuot1 = new FieldDef("m4250recccuot1",FieldDef.FLOAT,6,0);
            m4250reccbase2 = new FieldDef("m4250reccbase2",FieldDef.FLOAT,6,0);
            m4250recccuot2 = new FieldDef("m4250recccuot2",FieldDef.FLOAT,6,0);
            m4250reccbase3 = new FieldDef("m4250reccbase3",FieldDef.FLOAT,6,0);
            m4250recccuot3 = new FieldDef("m4250recccuot3",FieldDef.FLOAT,6,0);
            m4250reccbase4 = new FieldDef("m4250reccbase4",FieldDef.FLOAT,6,0);
            m4250recccuot4 = new FieldDef("m4250recccuot4",FieldDef.FLOAT,6,0);
            m4250reccbase5 = new FieldDef("m4250reccbase5",FieldDef.FLOAT,6,0);
            m4250recccuot5 = new FieldDef("m4250recccuot5",FieldDef.FLOAT,6,0);
            m4250reccbase6 = new FieldDef("m4250reccbase6",FieldDef.FLOAT,6,0);
            m4250recccuot6 = new FieldDef("m4250recccuot6",FieldDef.FLOAT,6,0);
            m4250reccbase7 = new FieldDef("m4250reccbase7",FieldDef.FLOAT,6,0);
            m4250recccuot7 = new FieldDef("m4250recccuot7",FieldDef.FLOAT,6,0);
            m4250esprecc = new FieldDef("m4250esprecc",FieldDef.FLOAT,6,0);
            m4250opespcaja1 = new FieldDef("m4250opespcaja1",FieldDef.FLOAT,6,0);
            m4250opespcaja2 = new FieldDef("m4250opespcaja2",FieldDef.FLOAT,6,0);
            m4250opespcaja3 = new FieldDef("m4250opespcaja3",FieldDef.FLOAT,6,0);
            m4250opespcaja4 = new FieldDef("m4250opespcaja4",FieldDef.FLOAT,6,0);
            m4250esrepep = new FieldDef("m4250esrepep",FieldDef.CHAR,1);
            m4250ispbase = new FieldDef("m4250ispbase",FieldDef.FLOAT,6,0);
            m4250ispcuota = new FieldDef("m4250ispcuota",FieldDef.FLOAT,6,0);
            m4250viajerobas = new FieldDef("m4250viajerobas",FieldDef.FLOAT,6,0);
            m4250viajerocuo = new FieldDef("m4250viajerocuo",FieldDef.FLOAT,6,0);
            m4250sopcorrieb = new FieldDef("m4250sopcorrieb",FieldDef.FLOAT,6,0);
            m4250sopinverb = new FieldDef("m4250sopinverb",FieldDef.FLOAT,6,0);
            m4250imporcorrb = new FieldDef("m4250imporcorrb",FieldDef.FLOAT,6,0);
            m4250imporinveb = new FieldDef("m4250imporinveb",FieldDef.FLOAT,6,0);
            m4250rectifsopb = new FieldDef("m4250rectifsopb",FieldDef.FLOAT,6,0);
            m4250cuotasopbi = new FieldDef("m4250cuotasopbi",FieldDef.FLOAT,6,0);
            m4250porcdefpro = new FieldDef("m4250porcdefpro",FieldDef.FLOAT,6,0);
            m4250regula2285 = new FieldDef("m4250regula2285",FieldDef.FLOAT,6,0);
            m4250rlasumres = new FieldDef("m4250rlasumres",FieldDef.FLOAT,6,0);
            m4250rlaresult = new FieldDef("m4250rlaresult",FieldDef.FLOAT,6,0);
            m4250esprecc18 = new FieldDef("m4250esprecc18",FieldDef.FLOAT,6,0);
            m4250espexe25sp = new FieldDef("m4250espexe25sp",FieldDef.FLOAT,6,0);
            m4250espnlocisp = new FieldDef("m4250espnlocisp",FieldDef.FLOAT,6,0);
            m4250espbuarte = new FieldDef("m4250espbuarte",FieldDef.FLOAT,6,0);
            m4250espaviajes = new FieldDef("m4250espaviajes",FieldDef.FLOAT,6,0);
            m4250repep142 = new FieldDef("m4250repep142",FieldDef.FLOAT,6,0);
            m4250repep143 = new FieldDef("m4250repep143",FieldDef.FLOAT,6,0);
            m4250repep144 = new FieldDef("m4250repep144",FieldDef.FLOAT,6,0);
            m4250repep145 = new FieldDef("m4250repep145",FieldDef.FLOAT,6,0);
            m4250repep146 = new FieldDef("m4250repep146",FieldDef.FLOAT,6,0);
            m4250repep147 = new FieldDef("m4250repep147",FieldDef.FLOAT,6,0);
            m4250ordinbisb = new FieldDef("m4250ordinbisb",FieldDef.FLOAT,0,2);
            m4250ordinbisc = new FieldDef("m4250ordinbisc",FieldDef.FLOAT,0,2);
            m4250ordinbisp = new FieldDef("m4250ordinbisp",FieldDef.FLOAT,0,2);
            m4250reccbisb = new FieldDef("m4250reccbisb",FieldDef.FLOAT,0,2);
            m4250reccbisc = new FieldDef("m4250reccbisc",FieldDef.FLOAT,0,2);
            m4250reccbisp = new FieldDef("m4250reccbisp",FieldDef.FLOAT,0,2);
            FieldDef array[] = {
                m4250dominio,
                m4250nif,
                m4250ejercicio,
                m4250periodo,
                m4250modelo,
                m4250nombre,
                m4250codadmon,
                m4250granemp,
                m4250devmensual,
                m4250sustitu,
                m4250nrojusti,
                m4250tipvia,
                m4250via,
                m4250nro,
                m4250esc,
                m4250piso,
                m4250pta,
                m4250telf,
                m4250prov,
                m4250municipio,
                m4250cpostal,
                m4250fax,
                m4250opsuper,
                m4250regusados,
                m4250regarte,
                m4250repfnif,
                m4250repfapell,
                m4250repftipvia,
                m4250repfcalle,
                m4250repfnro,
                m4250repfesc,
                m4250repfpiso,
                m4250repfpta,
                m4250repftelf,
                m4250repfprov,
                m4250repfmuni,
                m4250repfcpos,
                m4250repffax,
                m4250repflugar,
                m4250repjnif1,
                m4250repjapell1,
                m4250repjnotar1,
                m4250repjfec1,
                m4250repjnif2,
                m4250repjapell2,
                m4250repjnotar2,
                m4250repjfec2,
                m4250repjnif3,
                m4250repjapell3,
                m4250repjnotar3,
                m4250repjfec3,
                m4250porcen1,
                m4250porcen2,
                m4250porcen3,
                m4250porcen4,
                m4250porcen5,
                m4250porcen6,
                m4250porcen7,
                m4250porcen8,
                m4250porcen9,
                m4250porcen10,
                m4250porcen11,
                m4250porcen12,
                m4250porcen13,
                m4250porcen14,
                m4250porcen15,
                m4250porcen16,
                m4250porcen17,
                m4250porcen18,
                m4250ordinbase1,
                m4250ordincuot1,
                m4250ordinbase2,
                m4250ordincuot2,
                m4250ordinbase3,
                m4250ordincuot3,
                m4250ordinbase4,
                m4250ordincuot4,
                m4250ordinbase5,
                m4250ordincuot5,
                m4250ordinbase6,
                m4250ordincuot6,
                m4250ordinbase7,
                m4250ordincuot7,
                m4250usadobase1,
                m4250usadocuot1,
                m4250usadobase2,
                m4250usadocuot2,
                m4250usadobase3,
                m4250usadocuot3,
                m4250usadobase4,
                m4250usadocuot4,
                m4250usadobase5,
                m4250usadocuot5,
                m4250artebase1,
                m4250artecuot1,
                m4250artebase2,
                m4250artecuot2,
                m4250artebase3,
                m4250artecuot3,
                m4250artebase4,
                m4250artecuot4,
                m4250artebase5,
                m4250artecuot5,
                m4250viajebase1,
                m4250viajecuot1,
                m4250modifbase1,
                m4250modifcuot1,
                m4250modcobase1,
                m4250modcocuot1,
                m4250totbasecuo,
                m4250invsujeto,
                m4250totalcigic,
                m4250sopcorrien,
                m4250sopinver,
                m4250imporcorri,
                m4250imporinver,
                m4250compenreag,
                m4250regularinv,
                m4250devenviaje,
                m4250rectifsop,
                m4250sumadeduc,
                m4250resareggra,
                m4250resacomeja,
                m4250resaautoli,
                m4250rscdevenga,
                m4250rscinvsp,
                m4250rscarrend,
                m4250rsrectifi,
                m4250rstotcuota,
                m4250ocuoactivo,
                m4250ocuoarrend,
                m4250ocuototded,
                m4250rresultado,
                m4250rcompejant,
                m4250rrautoliq,
                m4250aingejer,
                m4250adevmes,
                m4250acompensar,
                m4250adevolver,
                m4250espreggral,
                m4250espexporta,
                m4250espaexenta,
                m4250espexentas,
                m4250espexensin,
                m4250espregsimp,
                m4250espregagr,
                m4250esptotal,
                m4250espinvsuj,
                m4250espeinm,
                m4250espinvtra,
                m4250espinvadq,
                m4250espinvex,
                m4250espsopno,
                m4250espnosujet,
                m4250sustiturec,
                m4250destcaja,
                m4250estconjnif,
                m4250estconjrso,
                m4250reccbase1,
                m4250recccuot1,
                m4250reccbase2,
                m4250recccuot2,
                m4250reccbase3,
                m4250recccuot3,
                m4250reccbase4,
                m4250recccuot4,
                m4250reccbase5,
                m4250recccuot5,
                m4250reccbase6,
                m4250recccuot6,
                m4250reccbase7,
                m4250recccuot7,
                m4250esprecc,
                m4250opespcaja1,
                m4250opespcaja2,
                m4250opespcaja3,
                m4250opespcaja4,
                m4250esrepep,
                m4250ispbase,
                m4250ispcuota,
                m4250viajerobas,
                m4250viajerocuo,
                m4250sopcorrieb,
                m4250sopinverb,
                m4250imporcorrb,
                m4250imporinveb,
                m4250rectifsopb,
                m4250cuotasopbi,
                m4250porcdefpro,
                m4250regula2285,
                m4250rlasumres,
                m4250rlaresult,
                m4250esprecc18,
                m4250espexe25sp,
                m4250espnlocisp,
                m4250espbuarte,
                m4250espaviajes,
                m4250repep142,
                m4250repep143,
                m4250repep144,
                m4250repep145,
                m4250repep146,
                m4250repep147,
                m4250ordinbisb,
                m4250ordinbisc,
                m4250ordinbisp,
                m4250reccbisb,
                m4250reccbisc,
                m4250reccbisp                
                };
            setColumns(array);
            FieldDef arrayf[] = {m4250dominio,m4250nif,m4250ejercicio,m4250periodo,m4250modelo };
            setDescription("425 IGIC Anual Tipo Reg 0 pag 1-2-3");
            setPrimaryKeys(arrayf);
            m4250nombre.setDescription("Apellidos y nombre / Razon social");
            m4250repjnif2.setDescription("Rep.Pers.Juridica 2 NIF");
            m4250repjapell2.setDescription("Rep.Pers.Juridica 2 Nombre y apellidos");
            m4250repjnotar2.setDescription("Rep.Pers.Juridica 2 Notaria");
            m4250repjfec2.setDescription("Rep.Pers.Juridica 2 Fecha poder");
            m4250repjnif3.setDescription("Rep.Pers.Juridica 3 NIF");
            m4250repjapell3.setDescription("Rep.Pers.Juridica 3 Nombre y apellidos");
            m4250repjnotar3.setDescription("Rep.Pers.Juridica 3 Notaria");
            m4250repjfec3.setDescription("Rep.Pers.Juridica 3 Fecha poder");
            m4250porcen1.setDescription("PAGINA2 -- Tipo impositivo 1 0%");
            m4250porcen2.setDescription("Tipo impositivo 2    3.00%");
            }
        }
        
    public class TabMod4251 extends TableDef
        {
        // campos
        public FieldDef m4251id;
        public FieldDef m4251dominio;
        public FieldDef m4251nif;
        public FieldDef m4251ejercicio;
        public FieldDef m4251periodo;
        public FieldDef m4251activ;
        public FieldDef m4251epigrafe;
        public FieldDef m4251regimen;
        public FieldDef m4251porprov;
        public FieldDef m4251pordef;
        public FieldDef m4251prorespec;
        public TabMod4251(String name)
            {
            super(name);
            m4251id = new FieldDef("m4251id",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m4251dominio = new FieldDef("m4251dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m4251nif = new FieldDef("m4251nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m4251ejercicio = new FieldDef("m4251ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m4251periodo = new FieldDef("m4251periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m4251activ = new FieldDef("m4251activ",FieldDef.INTEGER,0);
            m4251epigrafe = new FieldDef("m4251epigrafe",FieldDef.CHAR,5);
            m4251regimen = new FieldDef("m4251regimen",FieldDef.INTEGER,0);
            m4251porprov = new FieldDef("m4251porprov",FieldDef.FLOAT,6,0);
            m4251pordef = new FieldDef("m4251pordef",FieldDef.FLOAT,6,0);
            m4251prorespec = new FieldDef("m4251prorespec",FieldDef.CHAR,1);
            FieldDef array[] = {
                m4251id,
                m4251dominio,
                m4251nif,
                m4251ejercicio,
                m4251periodo,
                m4251activ,
                m4251epigrafe,
                m4251regimen,
                m4251porprov,
                m4251pordef,
                m4251prorespec                
                };
            setColumns(array);
            FieldDef arrayf[] = {m4251id };
            setDescription("425 IGIC Anual Tipo Reg 1 pag 1 Datos estadisticos");
            setPrimaryKeys(arrayf);
            m4251id.setAutoIncrementable(true);
            m4251activ.setDescription("Clave de la actividad    Dato estadístico");
            m4251epigrafe.setDescription("Epígrafe de la actividad Dato estadístico");
            m4251regimen.setDescription("Régimen aplicable al     Dato estadístico");
            m4251porprov.setDescription("%provisional prorrata general Dato estadístico");
            m4251pordef.setDescription("%definitivo  prorrata general Dato estadístico");
            m4251prorespec.setDescription("S/N prorrata especial Dato estadístico");
            }
        }
        
    public class TabMod4252 extends TableDef
        {
        // campos
        public FieldDef m4252id;
        public FieldDef m4252dominio;
        public FieldDef m4252nif;
        public FieldDef m4252ejercicio;
        public FieldDef m4252periodo;
        public FieldDef m4252epig;
        public FieldDef m4252modul1;
        public FieldDef m4252modul2;
        public FieldDef m4252modul3;
        public FieldDef m4252modul4;
        public FieldDef m4252modul5;
        public FieldDef m4252modul6;
        public FieldDef m4252modul7;
        public FieldDef m4252casillaa;
        public FieldDef m4252casillab;
        public FieldDef m4252casillac;
        public FieldDef m4252casillad;
        public FieldDef m4252casillae;
        public FieldDef m4252casillaf;
        public FieldDef m4252casillag;
        public FieldDef m4252imp1;
        public FieldDef m4252imp2;
        public FieldDef m4252imp3;
        public FieldDef m4252imp4;
        public FieldDef m4252imp5;
        public FieldDef m4252imp6;
        public FieldDef m4252imp7;
        public FieldDef m4252activ;
        public TabMod4252(String name)
            {
            super(name);
            m4252id = new FieldDef("m4252id",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m4252dominio = new FieldDef("m4252dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m4252nif = new FieldDef("m4252nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m4252ejercicio = new FieldDef("m4252ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m4252periodo = new FieldDef("m4252periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m4252epig = new FieldDef("m4252epig",FieldDef.CHAR,5);
            m4252modul1 = new FieldDef("m4252modul1",FieldDef.FLOAT,6,0);
            m4252modul2 = new FieldDef("m4252modul2",FieldDef.FLOAT,6,0);
            m4252modul3 = new FieldDef("m4252modul3",FieldDef.FLOAT,6,0);
            m4252modul4 = new FieldDef("m4252modul4",FieldDef.FLOAT,6,0);
            m4252modul5 = new FieldDef("m4252modul5",FieldDef.FLOAT,6,0);
            m4252modul6 = new FieldDef("m4252modul6",FieldDef.FLOAT,6,0);
            m4252modul7 = new FieldDef("m4252modul7",FieldDef.FLOAT,6,0);
            m4252casillaa = new FieldDef("m4252casillaa",FieldDef.FLOAT,6,0);
            m4252casillab = new FieldDef("m4252casillab",FieldDef.FLOAT,6,0);
            m4252casillac = new FieldDef("m4252casillac",FieldDef.FLOAT,6,0);
            m4252casillad = new FieldDef("m4252casillad",FieldDef.FLOAT,6,0);
            m4252casillae = new FieldDef("m4252casillae",FieldDef.FLOAT,6,0);
            m4252casillaf = new FieldDef("m4252casillaf",FieldDef.FLOAT,6,0);
            m4252casillag = new FieldDef("m4252casillag",FieldDef.FLOAT,6,0);
            m4252imp1 = new FieldDef("m4252imp1",FieldDef.FLOAT,6,0);
            m4252imp2 = new FieldDef("m4252imp2",FieldDef.FLOAT,6,0);
            m4252imp3 = new FieldDef("m4252imp3",FieldDef.FLOAT,6,0);
            m4252imp4 = new FieldDef("m4252imp4",FieldDef.FLOAT,6,0);
            m4252imp5 = new FieldDef("m4252imp5",FieldDef.FLOAT,6,0);
            m4252imp6 = new FieldDef("m4252imp6",FieldDef.FLOAT,6,0);
            m4252imp7 = new FieldDef("m4252imp7",FieldDef.FLOAT,6,0);
            m4252activ = new FieldDef("m4252activ",FieldDef.INTEGER,0);
            FieldDef array[] = {
                m4252id,
                m4252dominio,
                m4252nif,
                m4252ejercicio,
                m4252periodo,
                m4252epig,
                m4252modul1,
                m4252modul2,
                m4252modul3,
                m4252modul4,
                m4252modul5,
                m4252modul6,
                m4252modul7,
                m4252casillaa,
                m4252casillab,
                m4252casillac,
                m4252casillad,
                m4252casillae,
                m4252casillaf,
                m4252casillag,
                m4252imp1,
                m4252imp2,
                m4252imp3,
                m4252imp4,
                m4252imp5,
                m4252imp6,
                m4252imp7,
                m4252activ                
                };
            setColumns(array);
            FieldDef arrayf[] = {m4252id };
            setDescription("425 IGIC Anual Tipo Reg 2 pag 2 Op.Reg.Simplificado");
            setPrimaryKeys(arrayf);
            m4252id.setAutoIncrementable(true);
            m4252epig.setDescription("Epígrafe  Reg.Simplificado");
            m4252modul1.setDescription("Módulo  1 Reg.Simplif. o Volumen Ingr/Valor productos activ.agrícola");
            m4252modul2.setDescription("Módulo  2 Reg.Simplificado");
            m4252modul3.setDescription("Módulo  3 Reg.Simplificado");
            m4252modul4.setDescription("Módulo  4 Reg.Simplificado");
            m4252modul5.setDescription("Módulo  5 Reg.Simplificado");
            m4252modul6.setDescription("Módulo  6 Reg.Simplificado");
            m4252modul7.setDescription("Módulo  7 Reg.Simplificado");
            m4252casillaa.setDescription("Casilla A Reg.Simplificado");
            m4252casillab.setDescription("Casilla B Reg.Simplificado");
            m4252casillac.setDescription("Casilla C Reg.Simplificado Indice");
            m4252casillad.setDescription("Casilla D Reg.Simplificado");
            m4252casillae.setDescription("Casilla E Reg.Simplificado Porcen");
            m4252casillaf.setDescription("Casilla F Reg.Simplificado");
            m4252casillag.setDescription("Casilla G Reg.Simplificado");
            m4252imp1.setDescription("Módulo  1 Importe");
            m4252imp2.setDescription("Módulo  2 Importe");
            m4252imp3.setDescription("Módulo  3 Importe");
            m4252imp4.setDescription("Módulo  4 Importe");
            m4252imp5.setDescription("Módulo  5 Importe");
            m4252imp6.setDescription("Módulo  6 Importe");
            m4252imp7.setDescription("Módulo  7 Importe");
            m4252activ.setDescription("Clave de la actividad");
            }
        }
        
    public class TabMod415 extends TableDef
        {
        // campos
        public FieldDef m415dominio;
        public FieldDef m415nif;
        public FieldDef m415ejercicio;
        public FieldDef m415periodo;
        public FieldDef m415delegacio;
        public FieldDef m415admon;
        public FieldDef m415codiadmon;
        public FieldDef m415tipodecl;
        public FieldDef m415razon;
        public FieldDef m415tipovia;
        public FieldDef m415via;
        public FieldDef m415tiponum;
        public FieldDef m415numero;
        public FieldDef m415califnum;
        public FieldDef m415bloque;
        public FieldDef m415portal;
        public FieldDef m415escala;
        public FieldDef m415piso;
        public FieldDef m415puerta;
        public FieldDef m415complem;
        public FieldDef m415local;
        public FieldDef m415email;
        public FieldDef m415muni;
        public FieldDef m415codmuni;
        public FieldDef m415provin;
        public FieldDef m415codpostal;
        public FieldDef m415telef;
        public FieldDef m415movil;
        public FieldDef m415fax;
        public FieldDef m415claveanum;
        public FieldDef m415claveaimp;
        public FieldDef m415clavebnum;
        public FieldDef m415clavebimp;
        public FieldDef m415clavecnum;
        public FieldDef m415clavecimp;
        public FieldDef m415clavednum;
        public FieldDef m415clavedimp;
        public FieldDef m415claveenum;
        public FieldDef m415claveeimp;
        public FieldDef m415clavefnum;
        public FieldDef m415clavefimp;
        public FieldDef m415clavegnum;
        public FieldDef m415clavegimp;
        public FieldDef m415declarants;
        public FieldDef m415declarados;
        public FieldDef m415numjusant;
        public FieldDef m415nifrep;
        public FieldDef m415nomrep;
        public FieldDef m415cargorep;
        public TabMod415(String name)
            {
            super(name);
            m415dominio = new FieldDef("m415dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m415nif = new FieldDef("m415nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m415ejercicio = new FieldDef("m415ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m415periodo = new FieldDef("m415periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m415delegacio = new FieldDef("m415delegacio",FieldDef.INTEGER,0);
            m415admon = new FieldDef("m415admon",FieldDef.CHAR,30);
            m415codiadmon = new FieldDef("m415codiadmon",FieldDef.INTEGER,0);
            m415tipodecl = new FieldDef("m415tipodecl",FieldDef.CHAR,1);
            m415razon = new FieldDef("m415razon",FieldDef.CHAR,40);
            m415tipovia = new FieldDef("m415tipovia",FieldDef.CHAR,5);
            m415via = new FieldDef("m415via",FieldDef.CHAR,40);
            m415tiponum = new FieldDef("m415tiponum",FieldDef.CHAR,3);
            m415numero = new FieldDef("m415numero",FieldDef.CHAR,5);
            m415califnum = new FieldDef("m415califnum",FieldDef.CHAR,3);
            m415bloque = new FieldDef("m415bloque",FieldDef.CHAR,3);
            m415portal = new FieldDef("m415portal",FieldDef.CHAR,3);
            m415escala = new FieldDef("m415escala",FieldDef.CHAR,3);
            m415piso = new FieldDef("m415piso",FieldDef.CHAR,3);
            m415puerta = new FieldDef("m415puerta",FieldDef.CHAR,3);
            m415complem = new FieldDef("m415complem",FieldDef.CHAR,40);
            m415local = new FieldDef("m415local",FieldDef.CHAR,30);
            m415email = new FieldDef("m415email",FieldDef.CHAR,60);
            m415muni = new FieldDef("m415muni",FieldDef.CHAR,30);
            m415codmuni = new FieldDef("m415codmuni",FieldDef.CHAR,5);
            m415provin = new FieldDef("m415provin",FieldDef.INTEGER,0);
            m415codpostal = new FieldDef("m415codpostal",FieldDef.INTEGER,0);
            m415telef = new FieldDef("m415telef",FieldDef.CHAR,10);
            m415movil = new FieldDef("m415movil",FieldDef.CHAR,15);
            m415fax = new FieldDef("m415fax",FieldDef.CHAR,15);
            m415claveanum = new FieldDef("m415claveanum",FieldDef.INTEGER,0);
            m415claveaimp = new FieldDef("m415claveaimp",FieldDef.FLOAT,6,0);
            m415clavebnum = new FieldDef("m415clavebnum",FieldDef.INTEGER,0);
            m415clavebimp = new FieldDef("m415clavebimp",FieldDef.FLOAT,6,0);
            m415clavecnum = new FieldDef("m415clavecnum",FieldDef.INTEGER,0);
            m415clavecimp = new FieldDef("m415clavecimp",FieldDef.FLOAT,6,0);
            m415clavednum = new FieldDef("m415clavednum",FieldDef.INTEGER,0);
            m415clavedimp = new FieldDef("m415clavedimp",FieldDef.FLOAT,6,0);
            m415claveenum = new FieldDef("m415claveenum",FieldDef.INTEGER,0);
            m415claveeimp = new FieldDef("m415claveeimp",FieldDef.FLOAT,6,0);
            m415clavefnum = new FieldDef("m415clavefnum",FieldDef.INTEGER,0);
            m415clavefimp = new FieldDef("m415clavefimp",FieldDef.FLOAT,6,0);
            m415clavegnum = new FieldDef("m415clavegnum",FieldDef.INTEGER,0);
            m415clavegimp = new FieldDef("m415clavegimp",FieldDef.FLOAT,6,0);
            m415declarants = new FieldDef("m415declarants",FieldDef.INTEGER,0);
            m415declarados = new FieldDef("m415declarados",FieldDef.INTEGER,0);
            m415numjusant = new FieldDef("m415numjusant",FieldDef.CHAR,13);
            m415nifrep = new FieldDef("m415nifrep",FieldDef.CHAR,9);
            m415nomrep = new FieldDef("m415nomrep",FieldDef.CHAR,40);
            m415cargorep = new FieldDef("m415cargorep",FieldDef.CHAR,30);
            FieldDef array[] = {
                m415dominio,
                m415nif,
                m415ejercicio,
                m415periodo,
                m415delegacio,
                m415admon,
                m415codiadmon,
                m415tipodecl,
                m415razon,
                m415tipovia,
                m415via,
                m415tiponum,
                m415numero,
                m415califnum,
                m415bloque,
                m415portal,
                m415escala,
                m415piso,
                m415puerta,
                m415complem,
                m415local,
                m415email,
                m415muni,
                m415codmuni,
                m415provin,
                m415codpostal,
                m415telef,
                m415movil,
                m415fax,
                m415claveanum,
                m415claveaimp,
                m415clavebnum,
                m415clavebimp,
                m415clavecnum,
                m415clavecimp,
                m415clavednum,
                m415clavedimp,
                m415claveenum,
                m415claveeimp,
                m415clavefnum,
                m415clavefimp,
                m415clavegnum,
                m415clavegimp,
                m415declarants,
                m415declarados,
                m415numjusant,
                m415nifrep,
                m415nomrep,
                m415cargorep                
                };
            setColumns(array);
            FieldDef arrayf[] = {m415dominio,m415nif,m415ejercicio,m415periodo };
            setPrimaryKeys(arrayf);
            m415tipodecl.setDescription("C / S / Blanco");
            m415email.setDescription("comprobar longitud");
            }
        }
        
    public class TabMod415d extends TableDef
        {
        // campos
        public FieldDef m415dident;
        public FieldDef m415ddominio;
        public FieldDef m415dnif;
        public FieldDef m415dejercicio;
        public FieldDef m415dperiodo;
        public FieldDef m415dnifado;
        public FieldDef m415dnifrepre;
        public FieldDef m415dclave;
        public FieldDef m415drazon;
        public FieldDef m415dprovin;
        public FieldDef m415dpaisres;
        public FieldDef m415dimpteef;
        public FieldDef m415dimportin;
        public FieldDef m415dejeref;
        public FieldDef m415dimpteop;
        public FieldDef m415dimptear;
        public FieldDef m415dimptetr;
        public FieldDef m415dimpteop1t;
        public FieldDef m415dimpteop2t;
        public FieldDef m415dimpteop3t;
        public FieldDef m415dimpteop4t;
        public FieldDef m415dimptear1t;
        public FieldDef m415dimptear2t;
        public FieldDef m415dimptear3t;
        public FieldDef m415dimptear4t;
        public FieldDef m415dimptetr1t;
        public FieldDef m415dimptetr2t;
        public FieldDef m415dimptetr3t;
        public FieldDef m415dimptetr4t;
        public FieldDef m415dnifcomun;
        public FieldDef m415dopeigickja;
        public FieldDef m415doperinvsp;
        public FieldDef m415dopeexenta;
        public FieldDef m415dimpigickja;
        public TabMod415d(String name)
            {
            super(name);
            m415dident = new FieldDef("m415dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m415ddominio = new FieldDef("m415ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m415dnif = new FieldDef("m415dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m415dejercicio = new FieldDef("m415dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m415dperiodo = new FieldDef("m415dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m415dnifado = new FieldDef("m415dnifado",FieldDef.CHAR,15);
            m415dnifrepre = new FieldDef("m415dnifrepre",FieldDef.CHAR,15);
            m415dclave = new FieldDef("m415dclave",FieldDef.CHAR,1);
            m415drazon = new FieldDef("m415drazon",FieldDef.CHAR,40);
            m415dprovin = new FieldDef("m415dprovin",FieldDef.INTEGER,0);
            m415dpaisres = new FieldDef("m415dpaisres",FieldDef.CHAR,2);
            m415dimpteef = new FieldDef("m415dimpteef",FieldDef.FLOAT,6,0);
            m415dimportin = new FieldDef("m415dimportin",FieldDef.FLOAT,6,0);
            m415dejeref = new FieldDef("m415dejeref",FieldDef.INTEGER,0);
            m415dimpteop = new FieldDef("m415dimpteop",FieldDef.FLOAT,6,0);
            m415dimptear = new FieldDef("m415dimptear",FieldDef.FLOAT,6,0);
            m415dimptetr = new FieldDef("m415dimptetr",FieldDef.FLOAT,6,0);
            m415dimpteop1t = new FieldDef("m415dimpteop1t",FieldDef.FLOAT,6,0);
            m415dimpteop2t = new FieldDef("m415dimpteop2t",FieldDef.FLOAT,6,0);
            m415dimpteop3t = new FieldDef("m415dimpteop3t",FieldDef.FLOAT,6,0);
            m415dimpteop4t = new FieldDef("m415dimpteop4t",FieldDef.FLOAT,6,0);
            m415dimptear1t = new FieldDef("m415dimptear1t",FieldDef.FLOAT,6,0);
            m415dimptear2t = new FieldDef("m415dimptear2t",FieldDef.FLOAT,6,0);
            m415dimptear3t = new FieldDef("m415dimptear3t",FieldDef.FLOAT,6,0);
            m415dimptear4t = new FieldDef("m415dimptear4t",FieldDef.FLOAT,6,0);
            m415dimptetr1t = new FieldDef("m415dimptetr1t",FieldDef.FLOAT,6,0);
            m415dimptetr2t = new FieldDef("m415dimptetr2t",FieldDef.FLOAT,6,0);
            m415dimptetr3t = new FieldDef("m415dimptetr3t",FieldDef.FLOAT,6,0);
            m415dimptetr4t = new FieldDef("m415dimptetr4t",FieldDef.FLOAT,6,0);
            m415dnifcomun = new FieldDef("m415dnifcomun",FieldDef.CHAR,17);
            m415dopeigickja = new FieldDef("m415dopeigickja",FieldDef.CHAR,1);
            m415doperinvsp = new FieldDef("m415doperinvsp",FieldDef.CHAR,1);
            m415dopeexenta = new FieldDef("m415dopeexenta",FieldDef.CHAR,1);
            m415dimpigickja = new FieldDef("m415dimpigickja",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m415dident,
                m415ddominio,
                m415dnif,
                m415dejercicio,
                m415dperiodo,
                m415dnifado,
                m415dnifrepre,
                m415dclave,
                m415drazon,
                m415dprovin,
                m415dpaisres,
                m415dimpteef,
                m415dimportin,
                m415dejeref,
                m415dimpteop,
                m415dimptear,
                m415dimptetr,
                m415dimpteop1t,
                m415dimpteop2t,
                m415dimpteop3t,
                m415dimpteop4t,
                m415dimptear1t,
                m415dimptear2t,
                m415dimptear3t,
                m415dimptear4t,
                m415dimptetr1t,
                m415dimptetr2t,
                m415dimptetr3t,
                m415dimptetr4t,
                m415dnifcomun,
                m415dopeigickja,
                m415doperinvsp,
                m415dopeexenta,
                m415dimpigickja                
                };
            setColumns(array);
            FieldDef arrayf[] = {m415dident };
            setPrimaryKeys(arrayf);
            m415dident.setAutoIncrementable(true);
            m415dnifcomun.setDescription("NIF Operador comunitario");
            m415dopeigickja.setDescription("Operaciones Reg.Especial Criterio IGIC de caja");
            m415doperinvsp.setDescription("Operacion con Inversion del Sujeto Pasivo");
            m415dopeexenta.setDescription("Oper.exenta arft 13 Ley 20/1991");
            m415dimpigickja.setDescription("Importe anual operaciones devengadas Criterio IGIC de caja");
            }
        }
        
    public class TabMod415i extends TableDef
        {
        // campos
        public FieldDef m415iident;
        public FieldDef m415idominio;
        public FieldDef m415inif;
        public FieldDef m415iejercicio;
        public FieldDef m415iperiodo;
        public FieldDef m415iidentd;
        public FieldDef m415inifarren;
        public FieldDef m415inifrepre;
        public FieldDef m415inombre;
        public FieldDef m415iimporte;
        public FieldDef m415icatas;
        public FieldDef m415isinrc;
        public FieldDef m415itipovia;
        public FieldDef m415ivia;
        public FieldDef m415itiponum;
        public FieldDef m415inumero;
        public FieldDef m415icalifnum;
        public FieldDef m415ibloque;
        public FieldDef m415iportal;
        public FieldDef m415iescala;
        public FieldDef m415ipiso;
        public FieldDef m415ipuerta;
        public FieldDef m415icomplem;
        public FieldDef m415ilocal;
        public FieldDef m415imuni;
        public FieldDef m415icodmuni;
        public FieldDef m415iprovin;
        public FieldDef m415icodpostal;
        public TabMod415i(String name)
            {
            super(name);
            m415iident = new FieldDef("m415iident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m415idominio = new FieldDef("m415idominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m415inif = new FieldDef("m415inif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m415iejercicio = new FieldDef("m415iejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m415iperiodo = new FieldDef("m415iperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m415iidentd = new FieldDef("m415iidentd",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m415inifarren = new FieldDef("m415inifarren",FieldDef.CHAR,9);
            m415inifrepre = new FieldDef("m415inifrepre",FieldDef.CHAR,9);
            m415inombre = new FieldDef("m415inombre",FieldDef.CHAR,40);
            m415iimporte = new FieldDef("m415iimporte",FieldDef.FLOAT,6,0);
            m415icatas = new FieldDef("m415icatas",FieldDef.CHAR,25);
            m415isinrc = new FieldDef("m415isinrc",FieldDef.CHAR,1);
            m415itipovia = new FieldDef("m415itipovia",FieldDef.CHAR,5);
            m415ivia = new FieldDef("m415ivia",FieldDef.CHAR,40);
            m415itiponum = new FieldDef("m415itiponum",FieldDef.CHAR,3);
            m415inumero = new FieldDef("m415inumero",FieldDef.CHAR,5);
            m415icalifnum = new FieldDef("m415icalifnum",FieldDef.CHAR,3);
            m415ibloque = new FieldDef("m415ibloque",FieldDef.CHAR,3);
            m415iportal = new FieldDef("m415iportal",FieldDef.CHAR,3);
            m415iescala = new FieldDef("m415iescala",FieldDef.CHAR,3);
            m415ipiso = new FieldDef("m415ipiso",FieldDef.CHAR,3);
            m415ipuerta = new FieldDef("m415ipuerta",FieldDef.CHAR,3);
            m415icomplem = new FieldDef("m415icomplem",FieldDef.CHAR,40);
            m415ilocal = new FieldDef("m415ilocal",FieldDef.CHAR,30);
            m415imuni = new FieldDef("m415imuni",FieldDef.CHAR,30);
            m415icodmuni = new FieldDef("m415icodmuni",FieldDef.CHAR,5);
            m415iprovin = new FieldDef("m415iprovin",FieldDef.INTEGER,0);
            m415icodpostal = new FieldDef("m415icodpostal",FieldDef.INTEGER,0);
            FieldDef array[] = {
                m415iident,
                m415idominio,
                m415inif,
                m415iejercicio,
                m415iperiodo,
                m415iidentd,
                m415inifarren,
                m415inifrepre,
                m415inombre,
                m415iimporte,
                m415icatas,
                m415isinrc,
                m415itipovia,
                m415ivia,
                m415itiponum,
                m415inumero,
                m415icalifnum,
                m415ibloque,
                m415iportal,
                m415iescala,
                m415ipiso,
                m415ipuerta,
                m415icomplem,
                m415ilocal,
                m415imuni,
                m415icodmuni,
                m415iprovin,
                m415icodpostal                
                };
            setColumns(array);
            FieldDef arrayf[] = {m415iident,m415idominio,m415inif,m415iejercicio,m415iperiodo };
            setPrimaryKeys(arrayf);
            m415iident.setAutoIncrementable(true);
            }
        }
        
    public class TabModigicc extends TableDef
        {
        // campos
        public FieldDef mgcejercicio;
        public FieldDef mgcperiodo;
        public FieldDef mgcepigrafe;
        public FieldDef mgcletra;
        public FieldDef mgcdescripcion;
        public FieldDef mgctipomaximo;
        public FieldDef mgcmagmaximo;
        public FieldDef mgcporcuota;
        public FieldDef mgcpordeven;
        public FieldDef mgcporcomis;
        public FieldDef mgcredcuota;
        public TabModigicc(String name)
            {
            super(name);
            mgcejercicio = new FieldDef("mgcejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mgcperiodo = new FieldDef("mgcperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mgcepigrafe = new FieldDef("mgcepigrafe",FieldDef.CHAR,7,FieldDef.NOTNULL);
            mgcletra = new FieldDef("mgcletra",FieldDef.CHAR,1);
            mgcdescripcion = new FieldDef("mgcdescripcion",FieldDef.CHAR,200);
            mgctipomaximo = new FieldDef("mgctipomaximo",FieldDef.CHAR,3);
            mgcmagmaximo = new FieldDef("mgcmagmaximo",FieldDef.INTEGER,0);
            mgcporcuota = new FieldDef("mgcporcuota",FieldDef.FLOAT,6,0);
            mgcpordeven = new FieldDef("mgcpordeven",FieldDef.FLOAT,6,0);
            mgcporcomis = new FieldDef("mgcporcomis",FieldDef.FLOAT,6,0);
            mgcredcuota = new FieldDef("mgcredcuota",FieldDef.FLOAT,12,0);
            FieldDef array[] = {
                mgcejercicio,
                mgcperiodo,
                mgcepigrafe,
                mgcletra,
                mgcdescripcion,
                mgctipomaximo,
                mgcmagmaximo,
                mgcporcuota,
                mgcpordeven,
                mgcporcomis,
                mgcredcuota                
                };
            setColumns(array);
            FieldDef arrayf[] = {mgcejercicio,mgcperiodo,mgcepigrafe,mgcletra };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModigicl extends TableDef
        {
        // campos
        public FieldDef mglejercicio;
        public FieldDef mglperiodo;
        public FieldDef mglepigrafe;
        public FieldDef mglletra;
        public FieldDef mglmodulo;
        public FieldDef mglunidad;
        public FieldDef mglrdtoanual;
        public FieldDef mgltipo;
        public TabModigicl(String name)
            {
            super(name);
            mglejercicio = new FieldDef("mglejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mglperiodo = new FieldDef("mglperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mglepigrafe = new FieldDef("mglepigrafe",FieldDef.CHAR,7,FieldDef.NOTNULL);
            mglletra = new FieldDef("mglletra",FieldDef.CHAR,1);
            mglmodulo = new FieldDef("mglmodulo",FieldDef.INTEGER,0);
            mglunidad = new FieldDef("mglunidad",FieldDef.CHAR,20);
            mglrdtoanual = new FieldDef("mglrdtoanual",FieldDef.FLOAT,6,0);
            mgltipo = new FieldDef("mgltipo",FieldDef.CHAR,3);
            FieldDef array[] = {
                mglejercicio,
                mglperiodo,
                mglepigrafe,
                mglletra,
                mglmodulo,
                mglunidad,
                mglrdtoanual,
                mgltipo                
                };
            setColumns(array);
            FieldDef arrayf[] = {mglejercicio,mglperiodo,mglepigrafe,mglletra,mglmodulo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModigicagr extends TableDef
        {
        // campos
        public FieldDef mggejercicio;
        public FieldDef mggmodulo;
        public FieldDef mggdescripcion;
        public FieldDef mggporcuota;
        public FieldDef mggpordeven2;
        public TabModigicagr(String name)
            {
            super(name);
            mggejercicio = new FieldDef("mggejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mggmodulo = new FieldDef("mggmodulo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mggdescripcion = new FieldDef("mggdescripcion",FieldDef.CHAR,255);
            mggporcuota = new FieldDef("mggporcuota",FieldDef.FLOAT,6,0);
            mggpordeven2 = new FieldDef("mggpordeven2",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                mggejercicio,
                mggmodulo,
                mggdescripcion,
                mggporcuota,
                mggpordeven2                
                };
            setColumns(array);
            FieldDef arrayf[] = {mggejercicio,mggmodulo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModigic extends TableDef
        {
        // campos
        public FieldDef mgidominio;
        public FieldDef mginif;
        public FieldDef mgicodigo;
        public FieldDef mgi4t;
        public FieldDef mgiunidad1;
        public FieldDef mgitipo1;
        public FieldDef mgiunidad2;
        public FieldDef mgitipo2;
        public FieldDef mgiunidad3;
        public FieldDef mgitipo3;
        public FieldDef mgiunidad4;
        public FieldDef mgitipo4;
        public FieldDef mgiunidad5;
        public FieldDef mgitipo5;
        public FieldDef mgiunidad6;
        public FieldDef mgitipo6;
        public FieldDef mgiunidad7;
        public FieldDef mgitipo7;
        public FieldDef mgidevengada;
        public FieldDef mgitemporada;
        public FieldDef mgiporcuota;
        public FieldDef mgicomist1;
        public FieldDef mgicomist2;
        public FieldDef mgicomist3;
        public FieldDef mgiingresot1;
        public FieldDef mgiingresot2;
        public FieldDef mgiingresot3;
        public FieldDef mgisoportado;
        public FieldDef mgicuotadert4;
        public FieldDef mgimodejer;
        public FieldDef mgimodper;
        public FieldDef mgiactividad;
        public FieldDef mgiejercicio;
        public FieldDef mgiliqigic;
        public FieldDef mgiredrd35;
        public TabModigic(String name)
            {
            super(name);
            mgidominio = new FieldDef("mgidominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            mginif = new FieldDef("mginif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mgicodigo = new FieldDef("mgicodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mgi4t = new FieldDef("mgi4t",FieldDef.CHAR,1,FieldDef.NOTNULL);
            mgiunidad1 = new FieldDef("mgiunidad1",FieldDef.FLOAT,6,0);
            mgitipo1 = new FieldDef("mgitipo1",FieldDef.CHAR,3);
            mgiunidad2 = new FieldDef("mgiunidad2",FieldDef.FLOAT,6,0);
            mgitipo2 = new FieldDef("mgitipo2",FieldDef.CHAR,3);
            mgiunidad3 = new FieldDef("mgiunidad3",FieldDef.FLOAT,6,0);
            mgitipo3 = new FieldDef("mgitipo3",FieldDef.CHAR,3);
            mgiunidad4 = new FieldDef("mgiunidad4",FieldDef.FLOAT,6,0);
            mgitipo4 = new FieldDef("mgitipo4",FieldDef.CHAR,3);
            mgiunidad5 = new FieldDef("mgiunidad5",FieldDef.FLOAT,6,0);
            mgitipo5 = new FieldDef("mgitipo5",FieldDef.CHAR,3);
            mgiunidad6 = new FieldDef("mgiunidad6",FieldDef.FLOAT,6,0);
            mgitipo6 = new FieldDef("mgitipo6",FieldDef.CHAR,3);
            mgiunidad7 = new FieldDef("mgiunidad7",FieldDef.FLOAT,6,0);
            mgitipo7 = new FieldDef("mgitipo7",FieldDef.CHAR,3);
            mgidevengada = new FieldDef("mgidevengada",FieldDef.FLOAT,6,0);
            mgitemporada = new FieldDef("mgitemporada",FieldDef.FLOAT,6,0);
            mgiporcuota = new FieldDef("mgiporcuota",FieldDef.FLOAT,6,0);
            mgicomist1 = new FieldDef("mgicomist1",FieldDef.FLOAT,6,0);
            mgicomist2 = new FieldDef("mgicomist2",FieldDef.FLOAT,6,0);
            mgicomist3 = new FieldDef("mgicomist3",FieldDef.FLOAT,6,0);
            mgiingresot1 = new FieldDef("mgiingresot1",FieldDef.FLOAT,6,0);
            mgiingresot2 = new FieldDef("mgiingresot2",FieldDef.FLOAT,6,0);
            mgiingresot3 = new FieldDef("mgiingresot3",FieldDef.FLOAT,6,0);
            mgisoportado = new FieldDef("mgisoportado",FieldDef.FLOAT,6,0);
            mgicuotadert4 = new FieldDef("mgicuotadert4",FieldDef.FLOAT,6,0);
            mgimodejer = new FieldDef("mgimodejer",FieldDef.INTEGER,0);
            mgimodper = new FieldDef("mgimodper",FieldDef.CHAR,2);
            mgiactividad = new FieldDef("mgiactividad",FieldDef.INTEGER,0);
            mgiejercicio = new FieldDef("mgiejercicio",FieldDef.INTEGER,0);
            mgiliqigic = new FieldDef("mgiliqigic",FieldDef.CHAR,1);
            mgiredrd35 = new FieldDef("mgiredrd35",FieldDef.FLOAT,12,0);
            FieldDef array[] = {
                mgidominio,
                mginif,
                mgicodigo,
                mgi4t,
                mgiunidad1,
                mgitipo1,
                mgiunidad2,
                mgitipo2,
                mgiunidad3,
                mgitipo3,
                mgiunidad4,
                mgitipo4,
                mgiunidad5,
                mgitipo5,
                mgiunidad6,
                mgitipo6,
                mgiunidad7,
                mgitipo7,
                mgidevengada,
                mgitemporada,
                mgiporcuota,
                mgicomist1,
                mgicomist2,
                mgicomist3,
                mgiingresot1,
                mgiingresot2,
                mgiingresot3,
                mgisoportado,
                mgicuotadert4,
                mgimodejer,
                mgimodper,
                mgiactividad,
                mgiejercicio,
                mgiliqigic,
                mgiredrd35                
                };
            setColumns(array);
            FieldDef arrayf[] = {mgidominio,mginif,mgicodigo,mgi4t };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod421des extends TableDef
        {
        // campos
        public FieldDef m421ddominio;
        public FieldDef m421dnif;
        public FieldDef m421dejercicio;
        public FieldDef m421dactividad;
        public FieldDef m421ddevbadqin1;
        public FieldDef m421ddevcadqin1;
        public FieldDef m421ddevbadqin2;
        public FieldDef m421ddevcadqin2;
        public FieldDef m421ddevbadqin3;
        public FieldDef m421ddevcadqin3;
        public FieldDef m421ddevbadqin4;
        public FieldDef m421ddevcadqin4;
        public FieldDef m421ddevbarren1;
        public FieldDef m421ddevcarren1;
        public FieldDef m421ddevbarren2;
        public FieldDef m421ddevcarren2;
        public FieldDef m421ddevbarren3;
        public FieldDef m421ddevcarren3;
        public FieldDef m421ddevbarren4;
        public FieldDef m421ddevcarren4;
        public FieldDef m421ddevbrecti1;
        public FieldDef m421ddevcrecti1;
        public FieldDef m421ddevbrecti2;
        public FieldDef m421ddevcrecti2;
        public FieldDef m421ddevbrecti3;
        public FieldDef m421ddevcrecti3;
        public FieldDef m421ddevbrecti4;
        public FieldDef m421ddevcrecti4;
        public FieldDef m421ddedbadqac1;
        public FieldDef m421ddedcadqac1;
        public FieldDef m421ddedbadqac2;
        public FieldDef m421ddedcadqac2;
        public FieldDef m421ddedbadqac3;
        public FieldDef m421ddedcadqac3;
        public FieldDef m421ddedbadqac4;
        public FieldDef m421ddedcadqac4;
        public FieldDef m421ddedbarren1;
        public FieldDef m421ddedcarren1;
        public FieldDef m421ddedbarren2;
        public FieldDef m421ddedcarren2;
        public FieldDef m421ddedbarren3;
        public FieldDef m421ddedcarren3;
        public FieldDef m421ddedbarren4;
        public FieldDef m421ddedcarren4;
        public FieldDef m421dliqigic;
        public FieldDef m421ddeccadatri;
        public TabMod421des(String name)
            {
            super(name);
            m421ddominio = new FieldDef("m421ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m421dnif = new FieldDef("m421dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m421dejercicio = new FieldDef("m421dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m421dactividad = new FieldDef("m421dactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m421ddevbadqin1 = new FieldDef("m421ddevbadqin1",FieldDef.FLOAT,6,0);
            m421ddevcadqin1 = new FieldDef("m421ddevcadqin1",FieldDef.FLOAT,6,0);
            m421ddevbadqin2 = new FieldDef("m421ddevbadqin2",FieldDef.FLOAT,6,0);
            m421ddevcadqin2 = new FieldDef("m421ddevcadqin2",FieldDef.FLOAT,6,0);
            m421ddevbadqin3 = new FieldDef("m421ddevbadqin3",FieldDef.FLOAT,6,0);
            m421ddevcadqin3 = new FieldDef("m421ddevcadqin3",FieldDef.FLOAT,6,0);
            m421ddevbadqin4 = new FieldDef("m421ddevbadqin4",FieldDef.FLOAT,6,0);
            m421ddevcadqin4 = new FieldDef("m421ddevcadqin4",FieldDef.FLOAT,6,0);
            m421ddevbarren1 = new FieldDef("m421ddevbarren1",FieldDef.FLOAT,6,0);
            m421ddevcarren1 = new FieldDef("m421ddevcarren1",FieldDef.FLOAT,6,0);
            m421ddevbarren2 = new FieldDef("m421ddevbarren2",FieldDef.FLOAT,6,0);
            m421ddevcarren2 = new FieldDef("m421ddevcarren2",FieldDef.FLOAT,6,0);
            m421ddevbarren3 = new FieldDef("m421ddevbarren3",FieldDef.FLOAT,6,0);
            m421ddevcarren3 = new FieldDef("m421ddevcarren3",FieldDef.FLOAT,6,0);
            m421ddevbarren4 = new FieldDef("m421ddevbarren4",FieldDef.FLOAT,6,0);
            m421ddevcarren4 = new FieldDef("m421ddevcarren4",FieldDef.FLOAT,6,0);
            m421ddevbrecti1 = new FieldDef("m421ddevbrecti1",FieldDef.FLOAT,6,0);
            m421ddevcrecti1 = new FieldDef("m421ddevcrecti1",FieldDef.FLOAT,6,0);
            m421ddevbrecti2 = new FieldDef("m421ddevbrecti2",FieldDef.FLOAT,6,0);
            m421ddevcrecti2 = new FieldDef("m421ddevcrecti2",FieldDef.FLOAT,6,0);
            m421ddevbrecti3 = new FieldDef("m421ddevbrecti3",FieldDef.FLOAT,6,0);
            m421ddevcrecti3 = new FieldDef("m421ddevcrecti3",FieldDef.FLOAT,6,0);
            m421ddevbrecti4 = new FieldDef("m421ddevbrecti4",FieldDef.FLOAT,6,0);
            m421ddevcrecti4 = new FieldDef("m421ddevcrecti4",FieldDef.FLOAT,6,0);
            m421ddedbadqac1 = new FieldDef("m421ddedbadqac1",FieldDef.FLOAT,6,0);
            m421ddedcadqac1 = new FieldDef("m421ddedcadqac1",FieldDef.FLOAT,6,0);
            m421ddedbadqac2 = new FieldDef("m421ddedbadqac2",FieldDef.FLOAT,6,0);
            m421ddedcadqac2 = new FieldDef("m421ddedcadqac2",FieldDef.FLOAT,6,0);
            m421ddedbadqac3 = new FieldDef("m421ddedbadqac3",FieldDef.FLOAT,6,0);
            m421ddedcadqac3 = new FieldDef("m421ddedcadqac3",FieldDef.FLOAT,6,0);
            m421ddedbadqac4 = new FieldDef("m421ddedbadqac4",FieldDef.FLOAT,6,0);
            m421ddedcadqac4 = new FieldDef("m421ddedcadqac4",FieldDef.FLOAT,6,0);
            m421ddedbarren1 = new FieldDef("m421ddedbarren1",FieldDef.FLOAT,6,0);
            m421ddedcarren1 = new FieldDef("m421ddedcarren1",FieldDef.FLOAT,6,0);
            m421ddedbarren2 = new FieldDef("m421ddedbarren2",FieldDef.FLOAT,6,0);
            m421ddedcarren2 = new FieldDef("m421ddedcarren2",FieldDef.FLOAT,6,0);
            m421ddedbarren3 = new FieldDef("m421ddedbarren3",FieldDef.FLOAT,6,0);
            m421ddedcarren3 = new FieldDef("m421ddedcarren3",FieldDef.FLOAT,6,0);
            m421ddedbarren4 = new FieldDef("m421ddedbarren4",FieldDef.FLOAT,6,0);
            m421ddedcarren4 = new FieldDef("m421ddedcarren4",FieldDef.FLOAT,6,0);
            m421dliqigic = new FieldDef("m421dliqigic",FieldDef.CHAR,1);
            m421ddeccadatri = new FieldDef("m421ddeccadatri",FieldDef.CHAR,1);
            FieldDef array[] = {
                m421ddominio,
                m421dnif,
                m421dejercicio,
                m421dactividad,
                m421ddevbadqin1,
                m421ddevcadqin1,
                m421ddevbadqin2,
                m421ddevcadqin2,
                m421ddevbadqin3,
                m421ddevcadqin3,
                m421ddevbadqin4,
                m421ddevcadqin4,
                m421ddevbarren1,
                m421ddevcarren1,
                m421ddevbarren2,
                m421ddevcarren2,
                m421ddevbarren3,
                m421ddevcarren3,
                m421ddevbarren4,
                m421ddevcarren4,
                m421ddevbrecti1,
                m421ddevcrecti1,
                m421ddevbrecti2,
                m421ddevcrecti2,
                m421ddevbrecti3,
                m421ddevcrecti3,
                m421ddevbrecti4,
                m421ddevcrecti4,
                m421ddedbadqac1,
                m421ddedcadqac1,
                m421ddedbadqac2,
                m421ddedcadqac2,
                m421ddedbadqac3,
                m421ddedcadqac3,
                m421ddedbadqac4,
                m421ddedcadqac4,
                m421ddedbarren1,
                m421ddedcarren1,
                m421ddedbarren2,
                m421ddedcarren2,
                m421ddedbarren3,
                m421ddedcarren3,
                m421ddedbarren4,
                m421ddedcarren4,
                m421dliqigic,
                m421ddeccadatri                
                };
            setColumns(array);
            FieldDef arrayf[] = {m421ddominio,m421dnif,m421dejercicio,m421dactividad };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModagrigic extends TableDef
        {
        // campos
        public FieldDef macdominio;
        public FieldDef macnif;
        public FieldDef maccodigo;
        public FieldDef macepigrafe;
        public FieldDef macdescripcion;
        public FieldDef macingresot1;
        public FieldDef macingresot2;
        public FieldDef macingresot3;
        public FieldDef macingresot4;
        public FieldDef macsoportado;
        public FieldDef maccuotader;
        public FieldDef macmodejer;
        public FieldDef macmodper;
        public FieldDef macactividad;
        public FieldDef macejercicio;
        public FieldDef macliqigic;
        public TabModagrigic(String name)
            {
            super(name);
            macdominio = new FieldDef("macdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            macnif = new FieldDef("macnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            maccodigo = new FieldDef("maccodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            macepigrafe = new FieldDef("macepigrafe",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            macdescripcion = new FieldDef("macdescripcion",FieldDef.CHAR,200);
            macingresot1 = new FieldDef("macingresot1",FieldDef.FLOAT,6,0);
            macingresot2 = new FieldDef("macingresot2",FieldDef.FLOAT,6,0);
            macingresot3 = new FieldDef("macingresot3",FieldDef.FLOAT,6,0);
            macingresot4 = new FieldDef("macingresot4",FieldDef.FLOAT,6,0);
            macsoportado = new FieldDef("macsoportado",FieldDef.FLOAT,6,0);
            maccuotader = new FieldDef("maccuotader",FieldDef.FLOAT,6,0);
            macmodejer = new FieldDef("macmodejer",FieldDef.INTEGER,0);
            macmodper = new FieldDef("macmodper",FieldDef.CHAR,2);
            macactividad = new FieldDef("macactividad",FieldDef.INTEGER,0);
            macejercicio = new FieldDef("macejercicio",FieldDef.INTEGER,0);
            macliqigic = new FieldDef("macliqigic",FieldDef.CHAR,1);
            FieldDef array[] = {
                macdominio,
                macnif,
                maccodigo,
                macepigrafe,
                macdescripcion,
                macingresot1,
                macingresot2,
                macingresot3,
                macingresot4,
                macsoportado,
                maccuotader,
                macmodejer,
                macmodper,
                macactividad,
                macejercicio,
                macliqigic                
                };
            setColumns(array);
            FieldDef arrayf[] = {macdominio,macnif,maccodigo };
            setPrimaryKeys(arrayf);
            maccodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabMod421 extends TableDef
        {
        // campos
        public FieldDef m421dominio;
        public FieldDef m421nif;
        public FieldDef m421ejercicio;
        public FieldDef m421periodo;
        public FieldDef m421apellidos;
        public FieldDef m421nombre;
        public FieldDef m421codadmon;
        public FieldDef m421siglas;
        public FieldDef m421calle;
        public FieldDef m421numero;
        public FieldDef m421escalera;
        public FieldDef m421piso;
        public FieldDef m421puerta;
        public FieldDef m421telefono;
        public FieldDef m421provincia;
        public FieldDef m421municipio;
        public FieldDef m421cpostal;
        public FieldDef m421fax;
        public FieldDef m421complemen;
        public FieldDef m421numjustif;
        public FieldDef m421acreed;
        public FieldDef m421impacta;
        public FieldDef m421cuotanual;
        public FieldDef m421soportado;
        public FieldDef m421cuotderiv;
        public FieldDef m421trimanter;
        public FieldDef m421diferenc;
        public FieldDef m421devactfij;
        public FieldDef m421devarrend;
        public FieldDef m421devrectif;
        public FieldDef m421dedactfij;
        public FieldDef m421dedarrend;
        public FieldDef m421acompensa;
        public FieldDef m421adeducir;
        public FieldDef m421resultado;
        public FieldDef m421aingresar;
        public FieldDef m421adevolver;
        public FieldDef m421acompens;
        public FieldDef m421sinactiv;
        public FieldDef m421fecha;
        public FieldDef m421tipodecl;
        public FieldDef m421formapago;
        public FieldDef m421ibanpaing;
        public FieldDef m421ibandcing;
        public FieldDef m421entingreso;
        public FieldDef m421ofiingreso;
        public FieldDef m421digiingreso;
        public FieldDef m421ctaingreso;
        public FieldDef m421ibanpadev;
        public FieldDef m421ibandcdev;
        public FieldDef m421entdevol;
        public FieldDef m421ofidevol;
        public FieldDef m421digidevol;
        public FieldDef m421ctadevol;
        public TabMod421(String name)
            {
            super(name);
            m421dominio = new FieldDef("m421dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m421nif = new FieldDef("m421nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m421ejercicio = new FieldDef("m421ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m421periodo = new FieldDef("m421periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m421apellidos = new FieldDef("m421apellidos",FieldDef.CHAR,75);
            m421nombre = new FieldDef("m421nombre",FieldDef.CHAR,15);
            m421codadmon = new FieldDef("m421codadmon",FieldDef.CHAR,5);
            m421siglas = new FieldDef("m421siglas",FieldDef.CHAR,2);
            m421calle = new FieldDef("m421calle",FieldDef.CHAR,50);
            m421numero = new FieldDef("m421numero",FieldDef.CHAR,5);
            m421escalera = new FieldDef("m421escalera",FieldDef.CHAR,2);
            m421piso = new FieldDef("m421piso",FieldDef.CHAR,2);
            m421puerta = new FieldDef("m421puerta",FieldDef.CHAR,4);
            m421telefono = new FieldDef("m421telefono",FieldDef.CHAR,15);
            m421provincia = new FieldDef("m421provincia",FieldDef.INTEGER,0);
            m421municipio = new FieldDef("m421municipio",FieldDef.INTEGER,0);
            m421cpostal = new FieldDef("m421cpostal",FieldDef.CHAR,5);
            m421fax = new FieldDef("m421fax",FieldDef.CHAR,15);
            m421complemen = new FieldDef("m421complemen",FieldDef.CHAR,1);
            m421numjustif = new FieldDef("m421numjustif",FieldDef.CHAR,13);
            m421acreed = new FieldDef("m421acreed",FieldDef.CHAR,1);
            m421impacta = new FieldDef("m421impacta",FieldDef.FLOAT,6,0);
            m421cuotanual = new FieldDef("m421cuotanual",FieldDef.FLOAT,6,0);
            m421soportado = new FieldDef("m421soportado",FieldDef.FLOAT,6,0);
            m421cuotderiv = new FieldDef("m421cuotderiv",FieldDef.FLOAT,6,0);
            m421trimanter = new FieldDef("m421trimanter",FieldDef.FLOAT,6,0);
            m421diferenc = new FieldDef("m421diferenc",FieldDef.FLOAT,6,0);
            m421devactfij = new FieldDef("m421devactfij",FieldDef.FLOAT,6,0);
            m421devarrend = new FieldDef("m421devarrend",FieldDef.FLOAT,6,0);
            m421devrectif = new FieldDef("m421devrectif",FieldDef.FLOAT,6,0);
            m421dedactfij = new FieldDef("m421dedactfij",FieldDef.FLOAT,6,0);
            m421dedarrend = new FieldDef("m421dedarrend",FieldDef.FLOAT,6,0);
            m421acompensa = new FieldDef("m421acompensa",FieldDef.FLOAT,6,0);
            m421adeducir = new FieldDef("m421adeducir",FieldDef.FLOAT,6,0);
            m421resultado = new FieldDef("m421resultado",FieldDef.FLOAT,6,0);
            m421aingresar = new FieldDef("m421aingresar",FieldDef.FLOAT,6,0);
            m421adevolver = new FieldDef("m421adevolver",FieldDef.FLOAT,6,0);
            m421acompens = new FieldDef("m421acompens",FieldDef.FLOAT,6,0);
            m421sinactiv = new FieldDef("m421sinactiv",FieldDef.CHAR,1);
            m421fecha = new FieldDef("m421fecha",FieldDef.DATE);
            m421tipodecl = new FieldDef("m421tipodecl",FieldDef.CHAR,1);
            m421formapago = new FieldDef("m421formapago",FieldDef.INTEGER,0);
            m421ibanpaing = new FieldDef("m421ibanpaing",FieldDef.CHAR,2);
            m421ibandcing = new FieldDef("m421ibandcing",FieldDef.CHAR,2);
            m421entingreso = new FieldDef("m421entingreso",FieldDef.CHAR,4);
            m421ofiingreso = new FieldDef("m421ofiingreso",FieldDef.CHAR,4);
            m421digiingreso = new FieldDef("m421digiingreso",FieldDef.CHAR,2);
            m421ctaingreso = new FieldDef("m421ctaingreso",FieldDef.CHAR,10);
            m421ibanpadev = new FieldDef("m421ibanpadev",FieldDef.CHAR,2);
            m421ibandcdev = new FieldDef("m421ibandcdev",FieldDef.CHAR,2);
            m421entdevol = new FieldDef("m421entdevol",FieldDef.CHAR,4);
            m421ofidevol = new FieldDef("m421ofidevol",FieldDef.CHAR,4);
            m421digidevol = new FieldDef("m421digidevol",FieldDef.CHAR,2);
            m421ctadevol = new FieldDef("m421ctadevol",FieldDef.CHAR,10);
            FieldDef array[] = {
                m421dominio,
                m421nif,
                m421ejercicio,
                m421periodo,
                m421apellidos,
                m421nombre,
                m421codadmon,
                m421siglas,
                m421calle,
                m421numero,
                m421escalera,
                m421piso,
                m421puerta,
                m421telefono,
                m421provincia,
                m421municipio,
                m421cpostal,
                m421fax,
                m421complemen,
                m421numjustif,
                m421acreed,
                m421impacta,
                m421cuotanual,
                m421soportado,
                m421cuotderiv,
                m421trimanter,
                m421diferenc,
                m421devactfij,
                m421devarrend,
                m421devrectif,
                m421dedactfij,
                m421dedarrend,
                m421acompensa,
                m421adeducir,
                m421resultado,
                m421aingresar,
                m421adevolver,
                m421acompens,
                m421sinactiv,
                m421fecha,
                m421tipodecl,
                m421formapago,
                m421ibanpaing,
                m421ibandcing,
                m421entingreso,
                m421ofiingreso,
                m421digiingreso,
                m421ctaingreso,
                m421ibanpadev,
                m421ibandcdev,
                m421entdevol,
                m421ofidevol,
                m421digidevol,
                m421ctadevol                
                };
            setColumns(array);
            FieldDef arrayf[] = {m421dominio,m421nif,m421ejercicio,m421periodo };
            setDescription("421 IGIC Trimestral Tipo Reg 0");
            setPrimaryKeys(arrayf);
            m421apellidos.setDescription("Apellidos");
            m421nombre.setDescription("Nombre");
            m421codadmon.setDescription("Administracion");
            m421siglas.setDescription("Siglas");
            m421calle.setDescription("Via");
            m421numero.setDescription("Numero");
            m421escalera.setDescription("Escalera");
            m421piso.setDescription("Piso");
            m421puerta.setDescription("Puerta");
            m421telefono.setDescription("Telefono");
            m421provincia.setDescription("Provincia");
            m421municipio.setDescription("Municipio");
            m421cpostal.setDescription("C.Postal");
            m421fax.setDescription("Fax");
            m421complemen.setDescription("Declaracion complementaria");
            m421numjustif.setDescription("Num.justificante");
            m421acreed.setDescription("Concurso de Acreedores");
            m421impacta.setDescription("[06] Cantidad a cuenta de acuerdo con los datos-base provisionales");
            m421cuotanual.setDescription("[07] Cuota anual devengada por operaciones corrientes");
            m421soportado.setDescription("[08] Cuotas soportadas o satisfechas en el ejercicio por operaciones corrientes");
            m421cuotderiv.setDescription("[09] Cuota anual derivada del régimen simplificado");
            m421trimanter.setDescription("[10] Cantidad a cuenta trimestrales anteriores");
            m421diferenc.setDescription("[11] Diferencia");
            m421devactfij.setDescription("[12] Cuotas devengadas por entregas o transmisiones de activos fijos y por inversión del sujeto pasivo");
            m421devarrend.setDescription("[13] Cuotas devengadas por arrendamiento de bienes immuebles");
            m421devrectif.setDescription("[14] Rectificación de cuotas imporsitivas repercutidas");
            m421dedactfij.setDescription("[15] Cuotas deducibles por adquisiciones o importaciones de activos fijos");
            m421dedarrend.setDescription("[16] Cuotas deducibles correspondientes a la actividad de arrendamiento de bienes immuebles");
            m421acompensa.setDescription("[17] Cuotas del I.G.I.C a compensar de periodos anteriores");
            m421adeducir.setDescription("[18] A deducir");
            m421resultado.setDescription("[19] Resultado de la liquidación");
            m421aingresar.setDescription("[I] Importe a ingresar");
            m421adevolver.setDescription("[D] Importe a devolver");
            m421acompens.setDescription("[D] Importe a compensar");
            m421sinactiv.setDescription("Sin Actividad (S/N)");
            m421fecha.setDescription("Sujeto pasivo - Fecha");
            m421tipodecl.setDescription("Ingreso / Devolución / Compensación ( I/C/D)");
            m421formapago.setDescription("Forma de pago");
            m421ibanpaing.setDescription("A Ingresar: iban codigo pais");
            m421ibandcing.setDescription("A Ingresar: iban codigo control");
            m421entingreso.setDescription("A Ingresar: iban entidad");
            m421ofiingreso.setDescription("A Ingresar: iban oficina");
            m421digiingreso.setDescription("A Ingresar: iban digito cuenta");
            m421ctaingreso.setDescription("A Ingresar: iban cuenta");
            m421ibanpadev.setDescription("A devolver: iban codigo pais");
            m421ibandcdev.setDescription("A devolver: iban codigo control");
            m421entdevol.setDescription("A devolver: iban entidad");
            m421ofidevol.setDescription("A devolver: iban oficina");
            m421digidevol.setDescription("A devolver: iban digito cuenta");
            m421ctadevol.setDescription("A devolver: iban cuenta");
            }
        }
        
    public class TabMod421m extends TableDef
        {
        // campos
        public FieldDef m421mid;
        public FieldDef m421mdominio;
        public FieldDef m421mnif;
        public FieldDef m421mejercicio;
        public FieldDef m421mperiodo;
        public FieldDef m421mepig;
        public FieldDef m421mmodul1;
        public FieldDef m421mmodul2;
        public FieldDef m421mmodul3;
        public FieldDef m421mmodul4;
        public FieldDef m421mmodul5;
        public FieldDef m421mmodul6;
        public FieldDef m421mmodul7;
        public FieldDef m421mtotalanual;
        public FieldDef m421msoportado;
        public FieldDef m421mindtempor;
        public FieldDef m421mcminima;
        public FieldDef m421mcderivada;
        public FieldDef m421mnumact;
        public FieldDef m421magricola;
        public FieldDef m421mingragri;
        public FieldDef m421mingacta123;
        public TabMod421m(String name)
            {
            super(name);
            m421mid = new FieldDef("m421mid",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m421mdominio = new FieldDef("m421mdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m421mnif = new FieldDef("m421mnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m421mejercicio = new FieldDef("m421mejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m421mperiodo = new FieldDef("m421mperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m421mepig = new FieldDef("m421mepig",FieldDef.CHAR,5);
            m421mmodul1 = new FieldDef("m421mmodul1",FieldDef.FLOAT,6,0);
            m421mmodul2 = new FieldDef("m421mmodul2",FieldDef.FLOAT,6,0);
            m421mmodul3 = new FieldDef("m421mmodul3",FieldDef.FLOAT,6,0);
            m421mmodul4 = new FieldDef("m421mmodul4",FieldDef.FLOAT,6,0);
            m421mmodul5 = new FieldDef("m421mmodul5",FieldDef.FLOAT,6,0);
            m421mmodul6 = new FieldDef("m421mmodul6",FieldDef.FLOAT,6,0);
            m421mmodul7 = new FieldDef("m421mmodul7",FieldDef.FLOAT,6,0);
            m421mtotalanual = new FieldDef("m421mtotalanual",FieldDef.FLOAT,6,0);
            m421msoportado = new FieldDef("m421msoportado",FieldDef.FLOAT,6,0);
            m421mindtempor = new FieldDef("m421mindtempor",FieldDef.FLOAT,6,0);
            m421mcminima = new FieldDef("m421mcminima",FieldDef.FLOAT,6,0);
            m421mcderivada = new FieldDef("m421mcderivada",FieldDef.FLOAT,6,0);
            m421mnumact = new FieldDef("m421mnumact",FieldDef.INTEGER,0);
            m421magricola = new FieldDef("m421magricola",FieldDef.CHAR,1);
            m421mingragri = new FieldDef("m421mingragri",FieldDef.FLOAT,6,0);
            m421mingacta123 = new FieldDef("m421mingacta123",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m421mid,
                m421mdominio,
                m421mnif,
                m421mejercicio,
                m421mperiodo,
                m421mepig,
                m421mmodul1,
                m421mmodul2,
                m421mmodul3,
                m421mmodul4,
                m421mmodul5,
                m421mmodul6,
                m421mmodul7,
                m421mtotalanual,
                m421msoportado,
                m421mindtempor,
                m421mcminima,
                m421mcderivada,
                m421mnumact,
                m421magricola,
                m421mingragri,
                m421mingacta123                
                };
            setColumns(array);
            FieldDef arrayf[] = {m421mid };
            setDescription("421 IGIC Trimestral Tipo Reg 1 Op.Reg.Simplificado");
            setPrimaryKeys(arrayf);
            m421mid.setAutoIncrementable(true);
            m421mepig.setDescription("Epígrafe  Reg.Simplificado");
            m421mmodul1.setDescription("Módulo  1 Reg.Simplif.");
            m421mmodul2.setDescription("Módulo  2 Reg.Simplificado");
            m421mmodul3.setDescription("Módulo  3 Reg.Simplificado");
            m421mmodul4.setDescription("Módulo  4 Reg.Simplificado");
            m421mmodul5.setDescription("Módulo  5 Reg.Simplificado");
            m421mmodul6.setDescription("Módulo  6 Reg.Simplificado");
            m421mmodul7.setDescription("Módulo  7 Reg.Simplificado");
            m421mtotalanual.setDescription("Total anual o cuota devengada");
            m421msoportado.setDescription("Soportado");
            m421mindtempor.setDescription("Indice de temporada");
            m421mcminima.setDescription("Cuota minima");
            m421mcderivada.setDescription("Cuota derivada");
            m421mnumact.setDescription("Numero actividad para enlace acumulados");
            m421magricola.setDescription("Es agricola (0 agricola, 1 no agricola)");
            m421mingragri.setDescription("Volumen Ingr/Valor productos activ.agrícola");
            m421mingacta123.setDescription("Ingreso a cuenta 1T,2T o 3T agricola");
            }
        }
        
    public class TabMod417 extends TableDef
        {
        // campos
        public FieldDef m417dominio;
        public FieldDef m417nif;
        public FieldDef m417ejercicio;
        public FieldDef m417periodo;
        public FieldDef m417apellidos;
        public FieldDef m417nombre;
        public FieldDef m417codadmon;
        public FieldDef m417siglas;
        public FieldDef m417calle;
        public FieldDef m417numero;
        public FieldDef m417escalera;
        public FieldDef m417piso;
        public FieldDef m417puerta;
        public FieldDef m417telefono;
        public FieldDef m417provincia;
        public FieldDef m417municipio;
        public FieldDef m417cpostal;
        public FieldDef m417fax;
        public FieldDef m417complemen;
        public FieldDef m417numjustif;
        public FieldDef m417devmensual;
        public FieldDef m417recc;
        public FieldDef m417destrecc;
        public FieldDef m417entestab;
        public FieldDef m417concacre;
        public FieldDef m417fechaconac;
        public FieldDef m417concurso;
        public FieldDef m417aingresar;
        public FieldDef m417ibanpaing;
        public FieldDef m417ibandcing;
        public FieldDef m417entingreso;
        public FieldDef m417ofiingreso;
        public FieldDef m417digiingreso;
        public FieldDef m417ctaingreso;
        public FieldDef m417adevolver;
        public FieldDef m417ibanpadev;
        public FieldDef m417ibandcdev;
        public FieldDef m417entdevol;
        public FieldDef m417ofidevol;
        public FieldDef m417digidevol;
        public FieldDef m417ctadevol;
        public FieldDef m417acompens;
        public FieldDef m417tipodecl;
        public FieldDef m417formapago;
        public FieldDef m417sinactiv;
        public FieldDef m417fecha;
        public FieldDef m417devbase1;
        public FieldDef m417devbase2;
        public FieldDef m417devbase3;
        public FieldDef m417devbase4;
        public FieldDef m417devbase5;
        public FieldDef m417devbase6;
        public FieldDef m417devporcen1;
        public FieldDef m417devporcen2;
        public FieldDef m417devporcen3;
        public FieldDef m417devporcen4;
        public FieldDef m417devporcen5;
        public FieldDef m417devporcen6;
        public FieldDef m417devcuota1;
        public FieldDef m417devcuota2;
        public FieldDef m417devcuota3;
        public FieldDef m417devcuota4;
        public FieldDef m417devcuota5;
        public FieldDef m417devcuota6;
        public FieldDef m417devbaseisp;
        public FieldDef m417devcuotaisp;
        public FieldDef m417devbasembc;
        public FieldDef m417devcuotambc;
        public FieldDef m417devbasevia;
        public FieldDef m417devcuotavia;
        public FieldDef m417devcuotot;
        public FieldDef m417dedbopint;
        public FieldDef m417dedcopint;
        public FieldDef m417dedbopintin;
        public FieldDef m417dedcopintin;
        public FieldDef m417dedbopimp;
        public FieldDef m417dedcopimp;
        public FieldDef m417dedbopimpin;
        public FieldDef m417dedcopimpin;
        public FieldDef m417dedbrectif;
        public FieldDef m417dedcrectif;
        public FieldDef m417dedragp;
        public FieldDef m417dedreginv;
        public FieldDef m417dedinicio;
        public FieldDef m417dedregpro;
        public FieldDef m417dedcuotot;
        public FieldDef m417diferencia;
        public FieldDef m417cuocompen;
        public FieldDef m417adeducir;
        public FieldDef m417resultado;
        public FieldDef m417exporta;
        public FieldDef m417otrasopex;
        public FieldDef m417iadevb;
        public FieldDef m417iadevc;
        public FieldDef m417iasopb;
        public FieldDef m417iasopc;
        public FieldDef m417exoactpral;
        public FieldDef m417exoclapral;
        public FieldDef m417exoepipral;
        public FieldDef m417exoregpral;
        public FieldDef m417exoact1;
        public FieldDef m417exocla1;
        public FieldDef m417exoepi1;
        public FieldDef m417exoreg1;
        public FieldDef m417exoact2;
        public FieldDef m417exocla2;
        public FieldDef m417exoepi2;
        public FieldDef m417exoreg2;
        public FieldDef m417exoact3;
        public FieldDef m417exocla3;
        public FieldDef m417exoepi3;
        public FieldDef m417exoreg3;
        public FieldDef m417exoact4;
        public FieldDef m417exocla4;
        public FieldDef m417exoepi4;
        public FieldDef m417exoreg4;
        public FieldDef m417exoact5;
        public FieldDef m417exocla5;
        public FieldDef m417exoepi5;
        public FieldDef m417exoreg5;
        public FieldDef m417exoreggral;
        public FieldDef m417exoregrecc;
        public FieldDef m417exoexporta;
        public FieldDef m417exoarexenta;
        public FieldDef m417exoart25;
        public FieldDef m417exoexencon;
        public FieldDef m417exoexensin;
        public FieldDef m417exoinvsuje;
        public FieldDef m417exoragp;
        public FieldDef m417exobus;
        public FieldDef m417exoagviajes;
        public FieldDef m417exoinmob;
        public FieldDef m417exobinv;
        public FieldDef m417exototal;
        public FieldDef m417mesmodelo;
        public FieldDef m417regcuot2285;
        public TabMod417(String name)
            {
            super(name);
            m417dominio = new FieldDef("m417dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m417nif = new FieldDef("m417nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m417ejercicio = new FieldDef("m417ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m417periodo = new FieldDef("m417periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m417apellidos = new FieldDef("m417apellidos",FieldDef.CHAR,75);
            m417nombre = new FieldDef("m417nombre",FieldDef.CHAR,15);
            m417codadmon = new FieldDef("m417codadmon",FieldDef.CHAR,5);
            m417siglas = new FieldDef("m417siglas",FieldDef.CHAR,2);
            m417calle = new FieldDef("m417calle",FieldDef.CHAR,50);
            m417numero = new FieldDef("m417numero",FieldDef.CHAR,5);
            m417escalera = new FieldDef("m417escalera",FieldDef.CHAR,2);
            m417piso = new FieldDef("m417piso",FieldDef.CHAR,2);
            m417puerta = new FieldDef("m417puerta",FieldDef.CHAR,4);
            m417telefono = new FieldDef("m417telefono",FieldDef.CHAR,15);
            m417provincia = new FieldDef("m417provincia",FieldDef.INTEGER,0);
            m417municipio = new FieldDef("m417municipio",FieldDef.INTEGER,0);
            m417cpostal = new FieldDef("m417cpostal",FieldDef.CHAR,5);
            m417fax = new FieldDef("m417fax",FieldDef.CHAR,15);
            m417complemen = new FieldDef("m417complemen",FieldDef.CHAR,1);
            m417numjustif = new FieldDef("m417numjustif",FieldDef.CHAR,13);
            m417devmensual = new FieldDef("m417devmensual",FieldDef.CHAR,1);
            m417recc = new FieldDef("m417recc",FieldDef.CHAR,1);
            m417destrecc = new FieldDef("m417destrecc",FieldDef.CHAR,1);
            m417entestab = new FieldDef("m417entestab",FieldDef.CHAR,1);
            m417concacre = new FieldDef("m417concacre",FieldDef.CHAR,1);
            m417fechaconac = new FieldDef("m417fechaconac",FieldDef.DATE);
            m417concurso = new FieldDef("m417concurso",FieldDef.CHAR,1);
            m417aingresar = new FieldDef("m417aingresar",FieldDef.FLOAT,6,0);
            m417ibanpaing = new FieldDef("m417ibanpaing",FieldDef.CHAR,2);
            m417ibandcing = new FieldDef("m417ibandcing",FieldDef.CHAR,2);
            m417entingreso = new FieldDef("m417entingreso",FieldDef.CHAR,4);
            m417ofiingreso = new FieldDef("m417ofiingreso",FieldDef.CHAR,4);
            m417digiingreso = new FieldDef("m417digiingreso",FieldDef.CHAR,2);
            m417ctaingreso = new FieldDef("m417ctaingreso",FieldDef.CHAR,10);
            m417adevolver = new FieldDef("m417adevolver",FieldDef.FLOAT,6,0);
            m417ibanpadev = new FieldDef("m417ibanpadev",FieldDef.CHAR,2);
            m417ibandcdev = new FieldDef("m417ibandcdev",FieldDef.CHAR,2);
            m417entdevol = new FieldDef("m417entdevol",FieldDef.CHAR,4);
            m417ofidevol = new FieldDef("m417ofidevol",FieldDef.CHAR,4);
            m417digidevol = new FieldDef("m417digidevol",FieldDef.CHAR,2);
            m417ctadevol = new FieldDef("m417ctadevol",FieldDef.CHAR,10);
            m417acompens = new FieldDef("m417acompens",FieldDef.FLOAT,6,0);
            m417tipodecl = new FieldDef("m417tipodecl",FieldDef.CHAR,1);
            m417formapago = new FieldDef("m417formapago",FieldDef.INTEGER,0);
            m417sinactiv = new FieldDef("m417sinactiv",FieldDef.CHAR,1);
            m417fecha = new FieldDef("m417fecha",FieldDef.DATE);
            m417devbase1 = new FieldDef("m417devbase1",FieldDef.FLOAT,6,0);
            m417devbase2 = new FieldDef("m417devbase2",FieldDef.FLOAT,6,0);
            m417devbase3 = new FieldDef("m417devbase3",FieldDef.FLOAT,6,0);
            m417devbase4 = new FieldDef("m417devbase4",FieldDef.FLOAT,6,0);
            m417devbase5 = new FieldDef("m417devbase5",FieldDef.FLOAT,6,0);
            m417devbase6 = new FieldDef("m417devbase6",FieldDef.FLOAT,6,0);
            m417devporcen1 = new FieldDef("m417devporcen1",FieldDef.FLOAT,6,0);
            m417devporcen2 = new FieldDef("m417devporcen2",FieldDef.FLOAT,6,0);
            m417devporcen3 = new FieldDef("m417devporcen3",FieldDef.FLOAT,6,0);
            m417devporcen4 = new FieldDef("m417devporcen4",FieldDef.FLOAT,6,0);
            m417devporcen5 = new FieldDef("m417devporcen5",FieldDef.FLOAT,6,0);
            m417devporcen6 = new FieldDef("m417devporcen6",FieldDef.FLOAT,6,0);
            m417devcuota1 = new FieldDef("m417devcuota1",FieldDef.FLOAT,6,0);
            m417devcuota2 = new FieldDef("m417devcuota2",FieldDef.FLOAT,6,0);
            m417devcuota3 = new FieldDef("m417devcuota3",FieldDef.FLOAT,6,0);
            m417devcuota4 = new FieldDef("m417devcuota4",FieldDef.FLOAT,6,0);
            m417devcuota5 = new FieldDef("m417devcuota5",FieldDef.FLOAT,6,0);
            m417devcuota6 = new FieldDef("m417devcuota6",FieldDef.FLOAT,6,0);
            m417devbaseisp = new FieldDef("m417devbaseisp",FieldDef.FLOAT,6,0);
            m417devcuotaisp = new FieldDef("m417devcuotaisp",FieldDef.FLOAT,6,0);
            m417devbasembc = new FieldDef("m417devbasembc",FieldDef.FLOAT,6,0);
            m417devcuotambc = new FieldDef("m417devcuotambc",FieldDef.FLOAT,6,0);
            m417devbasevia = new FieldDef("m417devbasevia",FieldDef.FLOAT,6,0);
            m417devcuotavia = new FieldDef("m417devcuotavia",FieldDef.FLOAT,6,0);
            m417devcuotot = new FieldDef("m417devcuotot",FieldDef.FLOAT,6,0);
            m417dedbopint = new FieldDef("m417dedbopint",FieldDef.FLOAT,6,0);
            m417dedcopint = new FieldDef("m417dedcopint",FieldDef.FLOAT,6,0);
            m417dedbopintin = new FieldDef("m417dedbopintin",FieldDef.FLOAT,6,0);
            m417dedcopintin = new FieldDef("m417dedcopintin",FieldDef.FLOAT,6,0);
            m417dedbopimp = new FieldDef("m417dedbopimp",FieldDef.FLOAT,6,0);
            m417dedcopimp = new FieldDef("m417dedcopimp",FieldDef.FLOAT,6,0);
            m417dedbopimpin = new FieldDef("m417dedbopimpin",FieldDef.FLOAT,6,0);
            m417dedcopimpin = new FieldDef("m417dedcopimpin",FieldDef.FLOAT,6,0);
            m417dedbrectif = new FieldDef("m417dedbrectif",FieldDef.FLOAT,6,0);
            m417dedcrectif = new FieldDef("m417dedcrectif",FieldDef.FLOAT,6,0);
            m417dedragp = new FieldDef("m417dedragp",FieldDef.FLOAT,6,0);
            m417dedreginv = new FieldDef("m417dedreginv",FieldDef.FLOAT,6,0);
            m417dedinicio = new FieldDef("m417dedinicio",FieldDef.FLOAT,6,0);
            m417dedregpro = new FieldDef("m417dedregpro",FieldDef.FLOAT,6,0);
            m417dedcuotot = new FieldDef("m417dedcuotot",FieldDef.FLOAT,6,0);
            m417diferencia = new FieldDef("m417diferencia",FieldDef.FLOAT,6,0);
            m417cuocompen = new FieldDef("m417cuocompen",FieldDef.FLOAT,6,0);
            m417adeducir = new FieldDef("m417adeducir",FieldDef.FLOAT,6,0);
            m417resultado = new FieldDef("m417resultado",FieldDef.FLOAT,6,0);
            m417exporta = new FieldDef("m417exporta",FieldDef.FLOAT,6,0);
            m417otrasopex = new FieldDef("m417otrasopex",FieldDef.FLOAT,6,0);
            m417iadevb = new FieldDef("m417iadevb",FieldDef.FLOAT,6,0);
            m417iadevc = new FieldDef("m417iadevc",FieldDef.FLOAT,6,0);
            m417iasopb = new FieldDef("m417iasopb",FieldDef.FLOAT,6,0);
            m417iasopc = new FieldDef("m417iasopc",FieldDef.FLOAT,6,0);
            m417exoactpral = new FieldDef("m417exoactpral",FieldDef.CHAR,40);
            m417exoclapral = new FieldDef("m417exoclapral",FieldDef.FLOAT,6,0);
            m417exoepipral = new FieldDef("m417exoepipral",FieldDef.CHAR,7);
            m417exoregpral = new FieldDef("m417exoregpral",FieldDef.CHAR,2);
            m417exoact1 = new FieldDef("m417exoact1",FieldDef.CHAR,40);
            m417exocla1 = new FieldDef("m417exocla1",FieldDef.FLOAT,6,0);
            m417exoepi1 = new FieldDef("m417exoepi1",FieldDef.CHAR,7);
            m417exoreg1 = new FieldDef("m417exoreg1",FieldDef.CHAR,2);
            m417exoact2 = new FieldDef("m417exoact2",FieldDef.CHAR,40);
            m417exocla2 = new FieldDef("m417exocla2",FieldDef.FLOAT,6,0);
            m417exoepi2 = new FieldDef("m417exoepi2",FieldDef.CHAR,7);
            m417exoreg2 = new FieldDef("m417exoreg2",FieldDef.CHAR,2);
            m417exoact3 = new FieldDef("m417exoact3",FieldDef.CHAR,40);
            m417exocla3 = new FieldDef("m417exocla3",FieldDef.FLOAT,6,0);
            m417exoepi3 = new FieldDef("m417exoepi3",FieldDef.CHAR,7);
            m417exoreg3 = new FieldDef("m417exoreg3",FieldDef.CHAR,2);
            m417exoact4 = new FieldDef("m417exoact4",FieldDef.CHAR,40);
            m417exocla4 = new FieldDef("m417exocla4",FieldDef.FLOAT,6,0);
            m417exoepi4 = new FieldDef("m417exoepi4",FieldDef.CHAR,7);
            m417exoreg4 = new FieldDef("m417exoreg4",FieldDef.CHAR,2);
            m417exoact5 = new FieldDef("m417exoact5",FieldDef.CHAR,40);
            m417exocla5 = new FieldDef("m417exocla5",FieldDef.FLOAT,6,0);
            m417exoepi5 = new FieldDef("m417exoepi5",FieldDef.CHAR,7);
            m417exoreg5 = new FieldDef("m417exoreg5",FieldDef.CHAR,2);
            m417exoreggral = new FieldDef("m417exoreggral",FieldDef.FLOAT,6,0);
            m417exoregrecc = new FieldDef("m417exoregrecc",FieldDef.FLOAT,6,0);
            m417exoexporta = new FieldDef("m417exoexporta",FieldDef.FLOAT,6,0);
            m417exoarexenta = new FieldDef("m417exoarexenta",FieldDef.FLOAT,6,0);
            m417exoart25 = new FieldDef("m417exoart25",FieldDef.FLOAT,6,0);
            m417exoexencon = new FieldDef("m417exoexencon",FieldDef.FLOAT,6,0);
            m417exoexensin = new FieldDef("m417exoexensin",FieldDef.FLOAT,6,0);
            m417exoinvsuje = new FieldDef("m417exoinvsuje",FieldDef.FLOAT,6,0);
            m417exoragp = new FieldDef("m417exoragp",FieldDef.FLOAT,6,0);
            m417exobus = new FieldDef("m417exobus",FieldDef.FLOAT,6,0);
            m417exoagviajes = new FieldDef("m417exoagviajes",FieldDef.FLOAT,6,0);
            m417exoinmob = new FieldDef("m417exoinmob",FieldDef.FLOAT,6,0);
            m417exobinv = new FieldDef("m417exobinv",FieldDef.FLOAT,6,0);
            m417exototal = new FieldDef("m417exototal",FieldDef.FLOAT,6,0);
            m417mesmodelo = new FieldDef("m417mesmodelo",FieldDef.INTEGER,0);
            m417regcuot2285 = new FieldDef("m417regcuot2285",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m417dominio,
                m417nif,
                m417ejercicio,
                m417periodo,
                m417apellidos,
                m417nombre,
                m417codadmon,
                m417siglas,
                m417calle,
                m417numero,
                m417escalera,
                m417piso,
                m417puerta,
                m417telefono,
                m417provincia,
                m417municipio,
                m417cpostal,
                m417fax,
                m417complemen,
                m417numjustif,
                m417devmensual,
                m417recc,
                m417destrecc,
                m417entestab,
                m417concacre,
                m417fechaconac,
                m417concurso,
                m417aingresar,
                m417ibanpaing,
                m417ibandcing,
                m417entingreso,
                m417ofiingreso,
                m417digiingreso,
                m417ctaingreso,
                m417adevolver,
                m417ibanpadev,
                m417ibandcdev,
                m417entdevol,
                m417ofidevol,
                m417digidevol,
                m417ctadevol,
                m417acompens,
                m417tipodecl,
                m417formapago,
                m417sinactiv,
                m417fecha,
                m417devbase1,
                m417devbase2,
                m417devbase3,
                m417devbase4,
                m417devbase5,
                m417devbase6,
                m417devporcen1,
                m417devporcen2,
                m417devporcen3,
                m417devporcen4,
                m417devporcen5,
                m417devporcen6,
                m417devcuota1,
                m417devcuota2,
                m417devcuota3,
                m417devcuota4,
                m417devcuota5,
                m417devcuota6,
                m417devbaseisp,
                m417devcuotaisp,
                m417devbasembc,
                m417devcuotambc,
                m417devbasevia,
                m417devcuotavia,
                m417devcuotot,
                m417dedbopint,
                m417dedcopint,
                m417dedbopintin,
                m417dedcopintin,
                m417dedbopimp,
                m417dedcopimp,
                m417dedbopimpin,
                m417dedcopimpin,
                m417dedbrectif,
                m417dedcrectif,
                m417dedragp,
                m417dedreginv,
                m417dedinicio,
                m417dedregpro,
                m417dedcuotot,
                m417diferencia,
                m417cuocompen,
                m417adeducir,
                m417resultado,
                m417exporta,
                m417otrasopex,
                m417iadevb,
                m417iadevc,
                m417iasopb,
                m417iasopc,
                m417exoactpral,
                m417exoclapral,
                m417exoepipral,
                m417exoregpral,
                m417exoact1,
                m417exocla1,
                m417exoepi1,
                m417exoreg1,
                m417exoact2,
                m417exocla2,
                m417exoepi2,
                m417exoreg2,
                m417exoact3,
                m417exocla3,
                m417exoepi3,
                m417exoreg3,
                m417exoact4,
                m417exocla4,
                m417exoepi4,
                m417exoreg4,
                m417exoact5,
                m417exocla5,
                m417exoepi5,
                m417exoreg5,
                m417exoreggral,
                m417exoregrecc,
                m417exoexporta,
                m417exoarexenta,
                m417exoart25,
                m417exoexencon,
                m417exoexensin,
                m417exoinvsuje,
                m417exoragp,
                m417exobus,
                m417exoagviajes,
                m417exoinmob,
                m417exobinv,
                m417exototal,
                m417mesmodelo,
                m417regcuot2285                
                };
            setColumns(array);
            FieldDef arrayf[] = {m417dominio,m417nif,m417ejercicio,m417periodo };
            setDescription("417 IGIC Mensual Tipo Reg 0");
            setPrimaryKeys(arrayf);
            m417apellidos.setDescription("Apellidos");
            m417nombre.setDescription("Nombre");
            m417codadmon.setDescription("Administracion");
            m417siglas.setDescription("Siglas");
            m417calle.setDescription("Via");
            m417numero.setDescription("Numero");
            m417escalera.setDescription("Escalera");
            m417piso.setDescription("Piso");
            m417puerta.setDescription("Puerta");
            m417telefono.setDescription("Telefono");
            m417provincia.setDescription("Provincia");
            m417municipio.setDescription("Municipio");
            m417cpostal.setDescription("C.Postal");
            m417fax.setDescription("Fax");
            m417complemen.setDescription("Declaracion complementaria");
            m417numjustif.setDescription("Num.justificante");
            m417devmensual.setDescription("Esta inscrito en registro devolucion mensual");
            m417recc.setDescription("Regimen especial criterio de caja");
            m417destrecc.setDescription("Destinatario operaciones criterio de caja");
            m417entestab.setDescription("Entidad no establecida con obligaciones periodicas");
            m417concacre.setDescription("Concurso de Acreedores");
            m417fechaconac.setDescription("Fecha en que se dicto auto declaracion concurso");
            m417concurso.setDescription("Tipo autoliquidacion concurso acreedores");
            m417aingresar.setDescription("[I] Importe a ingresar");
            m417ibanpaing.setDescription("A Ingresar: iban codigo pais");
            m417ibandcing.setDescription("A Ingresar: iban codigo control");
            m417entingreso.setDescription("A Ingresar: iban entidad");
            m417ofiingreso.setDescription("A Ingresar: iban oficina");
            m417digiingreso.setDescription("A Ingresar: iban digito cuenta");
            m417ctaingreso.setDescription("A Ingresar: iban cuenta");
            m417adevolver.setDescription("[D] Importe a devolver");
            m417ibanpadev.setDescription("A devolver: iban codigo pais");
            m417ibandcdev.setDescription("A devolver: iban codigo control");
            m417entdevol.setDescription("A devolver: iban entidad");
            m417ofidevol.setDescription("A devolver: iban oficina");
            m417digidevol.setDescription("A devolver: iban digito cuenta");
            m417ctadevol.setDescription("A devolver: iban cuenta");
            m417acompens.setDescription("[D] Importe a compensar");
            m417tipodecl.setDescription("Ingreso / Devolución / Compensación ( I/C/D)");
            m417formapago.setDescription("Forma de pago");
            m417sinactiv.setDescription("Sin Actividad (S/N)");
            m417fecha.setDescription("Sujeto pasivo - Fecha");
            m417devbase1.setDescription("Devengado base 1");
            m417devbase2.setDescription("Devengado base 2");
            m417devbase3.setDescription("Devengado base 3");
            m417devbase4.setDescription("Devengado base 4");
            m417devbase5.setDescription("Devengado base 5");
            m417devbase6.setDescription("Devengado base 6");
            m417devporcen1.setDescription("Devengado % 1");
            m417devporcen2.setDescription("Devengado % 2");
            m417devporcen3.setDescription("Devengado % 3");
            m417devporcen4.setDescription("Devengado % 4");
            m417devporcen5.setDescription("Devengado % 5");
            m417devporcen6.setDescription("Devengado % 6");
            m417devcuota1.setDescription("Devengado cuota 1");
            m417devcuota2.setDescription("Devengado cuota 2");
            m417devcuota3.setDescription("Devengado cuota 3");
            m417devcuota4.setDescription("Devengado cuota 4");
            m417devcuota5.setDescription("Devengado cuota 5");
            m417devcuota6.setDescription("Devengado cuota 6");
            m417devbaseisp.setDescription("Devengado base inversion sujeto pasivo");
            m417devcuotaisp.setDescription("Devengado cuota inversion sujeto pasivo");
            m417devbasembc.setDescription("Devengado base modificacion bases y cuotas");
            m417devcuotambc.setDescription("Devengado cuota modificacion bases y cuotas");
            m417devbasevia.setDescription("Devengado base cuotas devueltas en regimen viajeros");
            m417devcuotavia.setDescription("Devengado cuota cuotas devueltas en regimen viajeros");
            m417devcuotot.setDescription("Total cuotas devengadas");
            m417dedbopint.setDescription("Soportado operaciones interiores base");
            m417dedcopint.setDescription("Soportado operaciones interiores cuota");
            m417dedbopintin.setDescription("Soportado operaciones interiores bienes inversion base");
            m417dedcopintin.setDescription("Soportado operaciones interiores bienes inversion cuota");
            m417dedbopimp.setDescription("Soportado importaciones base");
            m417dedcopimp.setDescription("Soportado importaciones cuota");
            m417dedbopimpin.setDescription("Soportado importaciones bienes inversion base");
            m417dedcopimpin.setDescription("Soportado importaciones bienes inversion cuota");
            m417dedbrectif.setDescription("Soportado rectificaciones base");
            m417dedcrectif.setDescription("Soportado rectificaciones cuota");
            m417dedragp.setDescription("Soportado regimen agricultura y pesca cuota");
            m417dedreginv.setDescription("Soportado bienes inversion cuota");
            m417dedinicio.setDescription("Soportado antes inicio actividad cuota");
            m417dedregpro.setDescription("Soportado regularizacion aplicacion porcentaje definitivo prorrata");
            m417dedcuotot.setDescription("Total cuotas soportadas");
            m417diferencia.setDescription("Diferencia");
            m417cuocompen.setDescription("Cuotas IGIC a compensar");
            m417adeducir.setDescription("A deducir si declaracion complementaria");
            m417resultado.setDescription("Resultado de la autoliquidacion");
            m417exporta.setDescription("Exportaciones y operaciones asimiladas");
            m417otrasopex.setDescription("Operaciones no sujetas  o con inversion sujeto pasivo");
            m417iadevb.setDescription("Operaciones criterio caja devengado, base");
            m417iadevc.setDescription("Operaciones criterio caja devengado, cuota");
            m417iasopb.setDescription("Operaciones criterio caja soportado, base");
            m417iasopc.setDescription("Operaciones criterio caja soportado, cuota");
            m417exoactpral.setDescription("Exonerados Actividad principal");
            m417exoclapral.setDescription("Exonerados Clave     Act.principal");
            m417exoepipral.setDescription("Exonerados Epigrafe  Act principal");
            m417exoregpral.setDescription("Exonerados Regimen  Act principal");
            m417exoact1.setDescription("Exonerados Actividad Otras Act.1");
            m417exocla1.setDescription("Exonerados Clave     Otras Act.1");
            m417exoepi1.setDescription("Exonerados Epigrafe  Otras Act.1");
            m417exoreg1.setDescription("Exonerados Regimen   Otras Act.1");
            m417exoact2.setDescription("Exonerados Actividad Otras Act.2");
            m417exocla2.setDescription("Exonerados Clave     Otras Act.2");
            m417exoepi2.setDescription("Exonerados Epigrafe  Otras Act.2");
            m417exoreg2.setDescription("Exonerados Regimen   Otras Act.2");
            m417exoact3.setDescription("Exonerados Actividad Otras Act.3");
            m417exocla3.setDescription("Exonerados Clave     Otras Act.3");
            m417exoepi3.setDescription("Exonerados Epigrafe  Otras Act.3");
            m417exoreg3.setDescription("Exonerados Regimen   Otras Act.3");
            m417exoact4.setDescription("Exonerados Actividad Otras Act.4");
            m417exocla4.setDescription("Exonerados Clave     Otras Act.4");
            m417exoepi4.setDescription("Exonerados Epigrafe  Otras Act.4");
            m417exoreg4.setDescription("Exonerados Regimen   Otras Act.4");
            m417exoact5.setDescription("Exonerados Actividad Otras Act.5");
            m417exocla5.setDescription("Exonerados Clave     Otras Act.5");
            m417exoepi5.setDescription("Exonerados Epigrafe  Otras Act.5");
            m417exoreg5.setDescription("Exonerados Regimen   Otras Act.5");
            m417exoreggral.setDescription("Exonerados Op.Regimen Gral");
            m417exoregrecc.setDescription("Exonerados Op.Reg.Esp.Criterio Caja");
            m417exoexporta.setDescription("Exonerados Exportaciones");
            m417exoarexenta.setDescription("Exonerados Op. areas exentas");
            m417exoart25.setDescription("Exonerados Op. interiores exentas art.25 Ley 19/1994");
            m417exoexencon.setDescription("Exonerados Op.exentas con derecho a deduc.");
            m417exoexensin.setDescription("Exonerados Op.exentas sin derecho a deduc.");
            m417exoinvsuje.setDescription("Exonerados Op.no sujetas reglas localizac.o inver.sujeto pasivo.");
            m417exoragp.setDescription("Operaciones en regimen especial de la agricultura, ganaderia y pesca");
            m417exobus.setDescription("Operaciones en Regimen especial bienes usados, objetos de arte, antiguedades");
            m417exoagviajes.setDescription("Operaciones en regimen especial de Agencias de Viajes");
            m417exoinmob.setDescription("Exonerados Entregas bienes inmuebles y oper.finan. no habituales");
            m417exobinv.setDescription("Entregas de bienes de inversión para el transmitiente");
            m417exototal.setDescription("Exonerados Total volumen operac");
            m417mesmodelo.setDescription("Mes modelos");
            m417regcuot2285.setDescription("Regularizacion cuotas art. 22.8.5 Ley 20/1991");
            }
        }
        
    public class TabMod417p4 extends TableDef
        {
        // campos
        public FieldDef m4174codi;
        public FieldDef m4174dominio;
        public FieldDef m4174nif;
        public FieldDef m4174ejercicio;
        public FieldDef m4174periodo;
        public FieldDef m4174numpag;
        public FieldDef m4174complemen;
        public FieldDef m4174pr1codcnae;
        public FieldDef m4174pr1impoper;
        public FieldDef m4174pr1impopde;
        public FieldDef m4174pr1tipo;
        public FieldDef m4174pr1pormeno;
        public FieldDef m4174pr2codcnae;
        public FieldDef m4174pr2impoper;
        public FieldDef m4174pr2impopde;
        public FieldDef m4174pr2tipo;
        public FieldDef m4174pr2pormeno;
        public FieldDef m4174pr3codcnae;
        public FieldDef m4174pr3impoper;
        public FieldDef m4174pr3impopde;
        public FieldDef m4174pr3tipo;
        public FieldDef m4174pr3pormeno;
        public FieldDef m4174pr4codcnae;
        public FieldDef m4174pr4impoper;
        public FieldDef m4174pr4impopde;
        public FieldDef m4174pr4tipo;
        public FieldDef m4174pr4pormeno;
        public FieldDef m4174pr5codcnae;
        public FieldDef m4174pr5impoper;
        public FieldDef m4174pr5impopde;
        public FieldDef m4174pr5tipo;
        public FieldDef m4174pr5pormeno;
        public TabMod417p4(String name)
            {
            super(name);
            m4174codi = new FieldDef("m4174codi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m4174dominio = new FieldDef("m4174dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m4174nif = new FieldDef("m4174nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m4174ejercicio = new FieldDef("m4174ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m4174periodo = new FieldDef("m4174periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m4174numpag = new FieldDef("m4174numpag",FieldDef.INTEGER,0);
            m4174complemen = new FieldDef("m4174complemen",FieldDef.CHAR,1);
            m4174pr1codcnae = new FieldDef("m4174pr1codcnae",FieldDef.CHAR,3);
            m4174pr1impoper = new FieldDef("m4174pr1impoper",FieldDef.FLOAT,6,0);
            m4174pr1impopde = new FieldDef("m4174pr1impopde",FieldDef.FLOAT,6,0);
            m4174pr1tipo = new FieldDef("m4174pr1tipo",FieldDef.CHAR,1);
            m4174pr1pormeno = new FieldDef("m4174pr1pormeno",FieldDef.FLOAT,6,0);
            m4174pr2codcnae = new FieldDef("m4174pr2codcnae",FieldDef.CHAR,3);
            m4174pr2impoper = new FieldDef("m4174pr2impoper",FieldDef.FLOAT,6,0);
            m4174pr2impopde = new FieldDef("m4174pr2impopde",FieldDef.FLOAT,6,0);
            m4174pr2tipo = new FieldDef("m4174pr2tipo",FieldDef.CHAR,1);
            m4174pr2pormeno = new FieldDef("m4174pr2pormeno",FieldDef.FLOAT,6,0);
            m4174pr3codcnae = new FieldDef("m4174pr3codcnae",FieldDef.CHAR,3);
            m4174pr3impoper = new FieldDef("m4174pr3impoper",FieldDef.FLOAT,6,0);
            m4174pr3impopde = new FieldDef("m4174pr3impopde",FieldDef.FLOAT,6,0);
            m4174pr3tipo = new FieldDef("m4174pr3tipo",FieldDef.CHAR,1);
            m4174pr3pormeno = new FieldDef("m4174pr3pormeno",FieldDef.FLOAT,6,0);
            m4174pr4codcnae = new FieldDef("m4174pr4codcnae",FieldDef.CHAR,3);
            m4174pr4impoper = new FieldDef("m4174pr4impoper",FieldDef.FLOAT,6,0);
            m4174pr4impopde = new FieldDef("m4174pr4impopde",FieldDef.FLOAT,6,0);
            m4174pr4tipo = new FieldDef("m4174pr4tipo",FieldDef.CHAR,1);
            m4174pr4pormeno = new FieldDef("m4174pr4pormeno",FieldDef.FLOAT,6,0);
            m4174pr5codcnae = new FieldDef("m4174pr5codcnae",FieldDef.CHAR,3);
            m4174pr5impoper = new FieldDef("m4174pr5impoper",FieldDef.FLOAT,6,0);
            m4174pr5impopde = new FieldDef("m4174pr5impopde",FieldDef.FLOAT,6,0);
            m4174pr5tipo = new FieldDef("m4174pr5tipo",FieldDef.CHAR,1);
            m4174pr5pormeno = new FieldDef("m4174pr5pormeno",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m4174codi,
                m4174dominio,
                m4174nif,
                m4174ejercicio,
                m4174periodo,
                m4174numpag,
                m4174complemen,
                m4174pr1codcnae,
                m4174pr1impoper,
                m4174pr1impopde,
                m4174pr1tipo,
                m4174pr1pormeno,
                m4174pr2codcnae,
                m4174pr2impoper,
                m4174pr2impopde,
                m4174pr2tipo,
                m4174pr2pormeno,
                m4174pr3codcnae,
                m4174pr3impoper,
                m4174pr3impopde,
                m4174pr3tipo,
                m4174pr3pormeno,
                m4174pr4codcnae,
                m4174pr4impoper,
                m4174pr4impopde,
                m4174pr4tipo,
                m4174pr4pormeno,
                m4174pr5codcnae,
                m4174pr5impoper,
                m4174pr5impopde,
                m4174pr5tipo,
                m4174pr5pormeno                
                };
            setColumns(array);
            FieldDef arrayf[] = {m4174codi };
            setPrimaryKeys(arrayf);
            m4174codi.setAutoIncrementable(true);
            }
        }
        
    public class TabMod417p5 extends TableDef
        {
        // campos
        public FieldDef m4175codi;
        public FieldDef m4175dominio;
        public FieldDef m4175nif;
        public FieldDef m4175ejercicio;
        public FieldDef m4175periodo;
        public FieldDef m4175numpag;
        public FieldDef m4175complemen;
        public FieldDef m4175deddif1b1;
        public FieldDef m4175deddif1c1;
        public FieldDef m4175deddif1b2;
        public FieldDef m4175deddif1c2;
        public FieldDef m4175deddif1b3;
        public FieldDef m4175deddif1c3;
        public FieldDef m4175deddif1b4;
        public FieldDef m4175deddif1c4;
        public FieldDef m4175deddif1b5;
        public FieldDef m4175deddif1c5;
        public FieldDef m4175deddif1b6;
        public FieldDef m4175deddif1c6;
        public FieldDef m4175deddif1c7;
        public FieldDef m4175deddif1to;
        public FieldDef m4175deddif2b1;
        public FieldDef m4175deddif2c1;
        public FieldDef m4175deddif2b2;
        public FieldDef m4175deddif2c2;
        public FieldDef m4175deddif2b3;
        public FieldDef m4175deddif2c3;
        public FieldDef m4175deddif2b4;
        public FieldDef m4175deddif2c4;
        public FieldDef m4175deddif2b5;
        public FieldDef m4175deddif2c5;
        public FieldDef m4175deddif2b6;
        public FieldDef m4175deddif2c6;
        public FieldDef m4175deddif2c7;
        public FieldDef m4175deddif2to;
        public FieldDef m4175deddif3b1;
        public FieldDef m4175deddif3c1;
        public FieldDef m4175deddif3b2;
        public FieldDef m4175deddif3c2;
        public FieldDef m4175deddif3b3;
        public FieldDef m4175deddif3c3;
        public FieldDef m4175deddif3b4;
        public FieldDef m4175deddif3c4;
        public FieldDef m4175deddif3b5;
        public FieldDef m4175deddif3c5;
        public FieldDef m4175deddif3b6;
        public FieldDef m4175deddif3c6;
        public FieldDef m4175deddif3c7;
        public FieldDef m4175deddif3to;
        public TabMod417p5(String name)
            {
            super(name);
            m4175codi = new FieldDef("m4175codi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m4175dominio = new FieldDef("m4175dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m4175nif = new FieldDef("m4175nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m4175ejercicio = new FieldDef("m4175ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m4175periodo = new FieldDef("m4175periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m4175numpag = new FieldDef("m4175numpag",FieldDef.INTEGER,0);
            m4175complemen = new FieldDef("m4175complemen",FieldDef.CHAR,1);
            m4175deddif1b1 = new FieldDef("m4175deddif1b1",FieldDef.FLOAT,6,0);
            m4175deddif1c1 = new FieldDef("m4175deddif1c1",FieldDef.FLOAT,6,0);
            m4175deddif1b2 = new FieldDef("m4175deddif1b2",FieldDef.FLOAT,6,0);
            m4175deddif1c2 = new FieldDef("m4175deddif1c2",FieldDef.FLOAT,6,0);
            m4175deddif1b3 = new FieldDef("m4175deddif1b3",FieldDef.FLOAT,6,0);
            m4175deddif1c3 = new FieldDef("m4175deddif1c3",FieldDef.FLOAT,6,0);
            m4175deddif1b4 = new FieldDef("m4175deddif1b4",FieldDef.FLOAT,6,0);
            m4175deddif1c4 = new FieldDef("m4175deddif1c4",FieldDef.FLOAT,6,0);
            m4175deddif1b5 = new FieldDef("m4175deddif1b5",FieldDef.FLOAT,6,0);
            m4175deddif1c5 = new FieldDef("m4175deddif1c5",FieldDef.FLOAT,6,0);
            m4175deddif1b6 = new FieldDef("m4175deddif1b6",FieldDef.FLOAT,6,0);
            m4175deddif1c6 = new FieldDef("m4175deddif1c6",FieldDef.FLOAT,6,0);
            m4175deddif1c7 = new FieldDef("m4175deddif1c7",FieldDef.FLOAT,6,0);
            m4175deddif1to = new FieldDef("m4175deddif1to",FieldDef.FLOAT,6,0);
            m4175deddif2b1 = new FieldDef("m4175deddif2b1",FieldDef.FLOAT,6,0);
            m4175deddif2c1 = new FieldDef("m4175deddif2c1",FieldDef.FLOAT,6,0);
            m4175deddif2b2 = new FieldDef("m4175deddif2b2",FieldDef.FLOAT,6,0);
            m4175deddif2c2 = new FieldDef("m4175deddif2c2",FieldDef.FLOAT,6,0);
            m4175deddif2b3 = new FieldDef("m4175deddif2b3",FieldDef.FLOAT,6,0);
            m4175deddif2c3 = new FieldDef("m4175deddif2c3",FieldDef.FLOAT,6,0);
            m4175deddif2b4 = new FieldDef("m4175deddif2b4",FieldDef.FLOAT,6,0);
            m4175deddif2c4 = new FieldDef("m4175deddif2c4",FieldDef.FLOAT,6,0);
            m4175deddif2b5 = new FieldDef("m4175deddif2b5",FieldDef.FLOAT,6,0);
            m4175deddif2c5 = new FieldDef("m4175deddif2c5",FieldDef.FLOAT,6,0);
            m4175deddif2b6 = new FieldDef("m4175deddif2b6",FieldDef.FLOAT,6,0);
            m4175deddif2c6 = new FieldDef("m4175deddif2c6",FieldDef.FLOAT,6,0);
            m4175deddif2c7 = new FieldDef("m4175deddif2c7",FieldDef.FLOAT,6,0);
            m4175deddif2to = new FieldDef("m4175deddif2to",FieldDef.FLOAT,6,0);
            m4175deddif3b1 = new FieldDef("m4175deddif3b1",FieldDef.FLOAT,6,0);
            m4175deddif3c1 = new FieldDef("m4175deddif3c1",FieldDef.FLOAT,6,0);
            m4175deddif3b2 = new FieldDef("m4175deddif3b2",FieldDef.FLOAT,6,0);
            m4175deddif3c2 = new FieldDef("m4175deddif3c2",FieldDef.FLOAT,6,0);
            m4175deddif3b3 = new FieldDef("m4175deddif3b3",FieldDef.FLOAT,6,0);
            m4175deddif3c3 = new FieldDef("m4175deddif3c3",FieldDef.FLOAT,6,0);
            m4175deddif3b4 = new FieldDef("m4175deddif3b4",FieldDef.FLOAT,6,0);
            m4175deddif3c4 = new FieldDef("m4175deddif3c4",FieldDef.FLOAT,6,0);
            m4175deddif3b5 = new FieldDef("m4175deddif3b5",FieldDef.FLOAT,6,0);
            m4175deddif3c5 = new FieldDef("m4175deddif3c5",FieldDef.FLOAT,6,0);
            m4175deddif3b6 = new FieldDef("m4175deddif3b6",FieldDef.FLOAT,6,0);
            m4175deddif3c6 = new FieldDef("m4175deddif3c6",FieldDef.FLOAT,6,0);
            m4175deddif3c7 = new FieldDef("m4175deddif3c7",FieldDef.FLOAT,6,0);
            m4175deddif3to = new FieldDef("m4175deddif3to",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m4175codi,
                m4175dominio,
                m4175nif,
                m4175ejercicio,
                m4175periodo,
                m4175numpag,
                m4175complemen,
                m4175deddif1b1,
                m4175deddif1c1,
                m4175deddif1b2,
                m4175deddif1c2,
                m4175deddif1b3,
                m4175deddif1c3,
                m4175deddif1b4,
                m4175deddif1c4,
                m4175deddif1b5,
                m4175deddif1c5,
                m4175deddif1b6,
                m4175deddif1c6,
                m4175deddif1c7,
                m4175deddif1to,
                m4175deddif2b1,
                m4175deddif2c1,
                m4175deddif2b2,
                m4175deddif2c2,
                m4175deddif2b3,
                m4175deddif2c3,
                m4175deddif2b4,
                m4175deddif2c4,
                m4175deddif2b5,
                m4175deddif2c5,
                m4175deddif2b6,
                m4175deddif2c6,
                m4175deddif2c7,
                m4175deddif2to,
                m4175deddif3b1,
                m4175deddif3c1,
                m4175deddif3b2,
                m4175deddif3c2,
                m4175deddif3b3,
                m4175deddif3c3,
                m4175deddif3b4,
                m4175deddif3c4,
                m4175deddif3b5,
                m4175deddif3c5,
                m4175deddif3b6,
                m4175deddif3c6,
                m4175deddif3c7,
                m4175deddif3to                
                };
            setColumns(array);
            FieldDef arrayf[] = {m4175codi };
            setPrimaryKeys(arrayf);
            m4175codi.setAutoIncrementable(true);
            }
        }
        
    public class TabMod420n extends TableDef
        {
        // campos
        public FieldDef m42ndominio;
        public FieldDef m42nnif;
        public FieldDef m42nejercicio;
        public FieldDef m42nperiodo;
        public FieldDef m42napellidos;
        public FieldDef m42nnombre;
        public FieldDef m42ncodadmon;
        public FieldDef m42nsiglas;
        public FieldDef m42ncalle;
        public FieldDef m42nnumero;
        public FieldDef m42nescalera;
        public FieldDef m42npiso;
        public FieldDef m42npuerta;
        public FieldDef m42ntelefono;
        public FieldDef m42nprovincia;
        public FieldDef m42nmunicipio;
        public FieldDef m42ncpostal;
        public FieldDef m42nfax;
        public FieldDef m42ncomplemen;
        public FieldDef m42nnumjustif;
        public FieldDef m42ndevmensual;
        public FieldDef m42nrecc;
        public FieldDef m42ndestrecc;
        public FieldDef m42nentestab;
        public FieldDef m42nconcacre;
        public FieldDef m42nfechaconac;
        public FieldDef m42nconcurso;
        public FieldDef m42naingresar;
        public FieldDef m42nibanpaing;
        public FieldDef m42nibandcing;
        public FieldDef m42nentingreso;
        public FieldDef m42nofiingreso;
        public FieldDef m42ndigiingreso;
        public FieldDef m42nctaingreso;
        public FieldDef m42nadevolver;
        public FieldDef m42nibanpadev;
        public FieldDef m42nibandcdev;
        public FieldDef m42nentdevol;
        public FieldDef m42nofidevol;
        public FieldDef m42ndigidevol;
        public FieldDef m42nctadevol;
        public FieldDef m42nacompens;
        public FieldDef m42ntipodecl;
        public FieldDef m42nformapago;
        public FieldDef m42nsinactiv;
        public FieldDef m42nfecha;
        public FieldDef m42ndevbase1;
        public FieldDef m42ndevbase2;
        public FieldDef m42ndevbase3;
        public FieldDef m42ndevbase4;
        public FieldDef m42ndevbase5;
        public FieldDef m42ndevbase6;
        public FieldDef m42ndevporcen1;
        public FieldDef m42ndevporcen2;
        public FieldDef m42ndevporcen3;
        public FieldDef m42ndevporcen4;
        public FieldDef m42ndevporcen5;
        public FieldDef m42ndevporcen6;
        public FieldDef m42ndevcuota1;
        public FieldDef m42ndevcuota2;
        public FieldDef m42ndevcuota3;
        public FieldDef m42ndevcuota4;
        public FieldDef m42ndevcuota5;
        public FieldDef m42ndevcuota6;
        public FieldDef m42ndevbaseisp;
        public FieldDef m42ndevcuotaisp;
        public FieldDef m42ndevbasembc;
        public FieldDef m42ndevcuotambc;
        public FieldDef m42ndevbasevia;
        public FieldDef m42ndevcuotavia;
        public FieldDef m42ndevcuotot;
        public FieldDef m42ndedbopint;
        public FieldDef m42ndedcopint;
        public FieldDef m42ndedbopintin;
        public FieldDef m42ndedcopintin;
        public FieldDef m42ndedbopimp;
        public FieldDef m42ndedcopimp;
        public FieldDef m42ndedbopimpin;
        public FieldDef m42ndedcopimpin;
        public FieldDef m42ndedbrectif;
        public FieldDef m42ndedcrectif;
        public FieldDef m42ndedragp;
        public FieldDef m42ndedreginv;
        public FieldDef m42ndedinicio;
        public FieldDef m42ndedregpro;
        public FieldDef m42ndedcuotot;
        public FieldDef m42ndiferencia;
        public FieldDef m42ncuocompen;
        public FieldDef m42nadeducir;
        public FieldDef m42nresultado;
        public FieldDef m42nexporta;
        public FieldDef m42notrasopex;
        public FieldDef m42niadevb;
        public FieldDef m42niadevc;
        public FieldDef m42niasopb;
        public FieldDef m42niasopc;
        public FieldDef m42nmesmodelo;
        public FieldDef m42nregcuot2285;
        public TabMod420n(String name)
            {
            super(name);
            m42ndominio = new FieldDef("m42ndominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m42nnif = new FieldDef("m42nnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m42nejercicio = new FieldDef("m42nejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m42nperiodo = new FieldDef("m42nperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m42napellidos = new FieldDef("m42napellidos",FieldDef.CHAR,75);
            m42nnombre = new FieldDef("m42nnombre",FieldDef.CHAR,15);
            m42ncodadmon = new FieldDef("m42ncodadmon",FieldDef.CHAR,5);
            m42nsiglas = new FieldDef("m42nsiglas",FieldDef.CHAR,2);
            m42ncalle = new FieldDef("m42ncalle",FieldDef.CHAR,50);
            m42nnumero = new FieldDef("m42nnumero",FieldDef.CHAR,5);
            m42nescalera = new FieldDef("m42nescalera",FieldDef.CHAR,2);
            m42npiso = new FieldDef("m42npiso",FieldDef.CHAR,2);
            m42npuerta = new FieldDef("m42npuerta",FieldDef.CHAR,4);
            m42ntelefono = new FieldDef("m42ntelefono",FieldDef.CHAR,15);
            m42nprovincia = new FieldDef("m42nprovincia",FieldDef.INTEGER,0);
            m42nmunicipio = new FieldDef("m42nmunicipio",FieldDef.INTEGER,0);
            m42ncpostal = new FieldDef("m42ncpostal",FieldDef.CHAR,5);
            m42nfax = new FieldDef("m42nfax",FieldDef.CHAR,15);
            m42ncomplemen = new FieldDef("m42ncomplemen",FieldDef.CHAR,1);
            m42nnumjustif = new FieldDef("m42nnumjustif",FieldDef.CHAR,13);
            m42ndevmensual = new FieldDef("m42ndevmensual",FieldDef.CHAR,1);
            m42nrecc = new FieldDef("m42nrecc",FieldDef.CHAR,1);
            m42ndestrecc = new FieldDef("m42ndestrecc",FieldDef.CHAR,1);
            m42nentestab = new FieldDef("m42nentestab",FieldDef.CHAR,1);
            m42nconcacre = new FieldDef("m42nconcacre",FieldDef.CHAR,1);
            m42nfechaconac = new FieldDef("m42nfechaconac",FieldDef.DATE);
            m42nconcurso = new FieldDef("m42nconcurso",FieldDef.CHAR,1);
            m42naingresar = new FieldDef("m42naingresar",FieldDef.FLOAT,0,2);
            m42nibanpaing = new FieldDef("m42nibanpaing",FieldDef.CHAR,2);
            m42nibandcing = new FieldDef("m42nibandcing",FieldDef.CHAR,2);
            m42nentingreso = new FieldDef("m42nentingreso",FieldDef.CHAR,4);
            m42nofiingreso = new FieldDef("m42nofiingreso",FieldDef.CHAR,4);
            m42ndigiingreso = new FieldDef("m42ndigiingreso",FieldDef.CHAR,2);
            m42nctaingreso = new FieldDef("m42nctaingreso",FieldDef.CHAR,10);
            m42nadevolver = new FieldDef("m42nadevolver",FieldDef.FLOAT,0,2);
            m42nibanpadev = new FieldDef("m42nibanpadev",FieldDef.CHAR,2);
            m42nibandcdev = new FieldDef("m42nibandcdev",FieldDef.CHAR,2);
            m42nentdevol = new FieldDef("m42nentdevol",FieldDef.CHAR,4);
            m42nofidevol = new FieldDef("m42nofidevol",FieldDef.CHAR,4);
            m42ndigidevol = new FieldDef("m42ndigidevol",FieldDef.CHAR,2);
            m42nctadevol = new FieldDef("m42nctadevol",FieldDef.CHAR,10);
            m42nacompens = new FieldDef("m42nacompens",FieldDef.FLOAT,0,2);
            m42ntipodecl = new FieldDef("m42ntipodecl",FieldDef.CHAR,1);
            m42nformapago = new FieldDef("m42nformapago",FieldDef.INTEGER,0);
            m42nsinactiv = new FieldDef("m42nsinactiv",FieldDef.CHAR,1);
            m42nfecha = new FieldDef("m42nfecha",FieldDef.DATE);
            m42ndevbase1 = new FieldDef("m42ndevbase1",FieldDef.FLOAT,0,2);
            m42ndevbase2 = new FieldDef("m42ndevbase2",FieldDef.FLOAT,0,2);
            m42ndevbase3 = new FieldDef("m42ndevbase3",FieldDef.FLOAT,0,2);
            m42ndevbase4 = new FieldDef("m42ndevbase4",FieldDef.FLOAT,0,2);
            m42ndevbase5 = new FieldDef("m42ndevbase5",FieldDef.FLOAT,0,2);
            m42ndevbase6 = new FieldDef("m42ndevbase6",FieldDef.FLOAT,0,2);
            m42ndevporcen1 = new FieldDef("m42ndevporcen1",FieldDef.FLOAT,0,2);
            m42ndevporcen2 = new FieldDef("m42ndevporcen2",FieldDef.FLOAT,0,2);
            m42ndevporcen3 = new FieldDef("m42ndevporcen3",FieldDef.FLOAT,0,2);
            m42ndevporcen4 = new FieldDef("m42ndevporcen4",FieldDef.FLOAT,0,2);
            m42ndevporcen5 = new FieldDef("m42ndevporcen5",FieldDef.FLOAT,0,2);
            m42ndevporcen6 = new FieldDef("m42ndevporcen6",FieldDef.FLOAT,0,2);
            m42ndevcuota1 = new FieldDef("m42ndevcuota1",FieldDef.FLOAT,0,2);
            m42ndevcuota2 = new FieldDef("m42ndevcuota2",FieldDef.FLOAT,0,2);
            m42ndevcuota3 = new FieldDef("m42ndevcuota3",FieldDef.FLOAT,0,2);
            m42ndevcuota4 = new FieldDef("m42ndevcuota4",FieldDef.FLOAT,0,2);
            m42ndevcuota5 = new FieldDef("m42ndevcuota5",FieldDef.FLOAT,0,2);
            m42ndevcuota6 = new FieldDef("m42ndevcuota6",FieldDef.FLOAT,0,2);
            m42ndevbaseisp = new FieldDef("m42ndevbaseisp",FieldDef.FLOAT,0,2);
            m42ndevcuotaisp = new FieldDef("m42ndevcuotaisp",FieldDef.FLOAT,0,2);
            m42ndevbasembc = new FieldDef("m42ndevbasembc",FieldDef.FLOAT,0,2);
            m42ndevcuotambc = new FieldDef("m42ndevcuotambc",FieldDef.FLOAT,0,2);
            m42ndevbasevia = new FieldDef("m42ndevbasevia",FieldDef.FLOAT,0,2);
            m42ndevcuotavia = new FieldDef("m42ndevcuotavia",FieldDef.FLOAT,0,2);
            m42ndevcuotot = new FieldDef("m42ndevcuotot",FieldDef.FLOAT,0,2);
            m42ndedbopint = new FieldDef("m42ndedbopint",FieldDef.FLOAT,0,2);
            m42ndedcopint = new FieldDef("m42ndedcopint",FieldDef.FLOAT,0,2);
            m42ndedbopintin = new FieldDef("m42ndedbopintin",FieldDef.FLOAT,0,2);
            m42ndedcopintin = new FieldDef("m42ndedcopintin",FieldDef.FLOAT,0,2);
            m42ndedbopimp = new FieldDef("m42ndedbopimp",FieldDef.FLOAT,0,2);
            m42ndedcopimp = new FieldDef("m42ndedcopimp",FieldDef.FLOAT,0,2);
            m42ndedbopimpin = new FieldDef("m42ndedbopimpin",FieldDef.FLOAT,0,2);
            m42ndedcopimpin = new FieldDef("m42ndedcopimpin",FieldDef.FLOAT,0,2);
            m42ndedbrectif = new FieldDef("m42ndedbrectif",FieldDef.FLOAT,0,2);
            m42ndedcrectif = new FieldDef("m42ndedcrectif",FieldDef.FLOAT,0,2);
            m42ndedragp = new FieldDef("m42ndedragp",FieldDef.FLOAT,0,2);
            m42ndedreginv = new FieldDef("m42ndedreginv",FieldDef.FLOAT,0,2);
            m42ndedinicio = new FieldDef("m42ndedinicio",FieldDef.FLOAT,0,2);
            m42ndedregpro = new FieldDef("m42ndedregpro",FieldDef.FLOAT,0,2);
            m42ndedcuotot = new FieldDef("m42ndedcuotot",FieldDef.FLOAT,0,2);
            m42ndiferencia = new FieldDef("m42ndiferencia",FieldDef.FLOAT,0,2);
            m42ncuocompen = new FieldDef("m42ncuocompen",FieldDef.FLOAT,0,2);
            m42nadeducir = new FieldDef("m42nadeducir",FieldDef.FLOAT,0,2);
            m42nresultado = new FieldDef("m42nresultado",FieldDef.FLOAT,0,2);
            m42nexporta = new FieldDef("m42nexporta",FieldDef.FLOAT,0,2);
            m42notrasopex = new FieldDef("m42notrasopex",FieldDef.FLOAT,0,2);
            m42niadevb = new FieldDef("m42niadevb",FieldDef.FLOAT,0,2);
            m42niadevc = new FieldDef("m42niadevc",FieldDef.FLOAT,0,2);
            m42niasopb = new FieldDef("m42niasopb",FieldDef.FLOAT,0,2);
            m42niasopc = new FieldDef("m42niasopc",FieldDef.FLOAT,0,2);
            m42nmesmodelo = new FieldDef("m42nmesmodelo",FieldDef.INTEGER,0);
            m42nregcuot2285 = new FieldDef("m42nregcuot2285",FieldDef.FLOAT,0,2);
            FieldDef array[] = {
                m42ndominio,
                m42nnif,
                m42nejercicio,
                m42nperiodo,
                m42napellidos,
                m42nnombre,
                m42ncodadmon,
                m42nsiglas,
                m42ncalle,
                m42nnumero,
                m42nescalera,
                m42npiso,
                m42npuerta,
                m42ntelefono,
                m42nprovincia,
                m42nmunicipio,
                m42ncpostal,
                m42nfax,
                m42ncomplemen,
                m42nnumjustif,
                m42ndevmensual,
                m42nrecc,
                m42ndestrecc,
                m42nentestab,
                m42nconcacre,
                m42nfechaconac,
                m42nconcurso,
                m42naingresar,
                m42nibanpaing,
                m42nibandcing,
                m42nentingreso,
                m42nofiingreso,
                m42ndigiingreso,
                m42nctaingreso,
                m42nadevolver,
                m42nibanpadev,
                m42nibandcdev,
                m42nentdevol,
                m42nofidevol,
                m42ndigidevol,
                m42nctadevol,
                m42nacompens,
                m42ntipodecl,
                m42nformapago,
                m42nsinactiv,
                m42nfecha,
                m42ndevbase1,
                m42ndevbase2,
                m42ndevbase3,
                m42ndevbase4,
                m42ndevbase5,
                m42ndevbase6,
                m42ndevporcen1,
                m42ndevporcen2,
                m42ndevporcen3,
                m42ndevporcen4,
                m42ndevporcen5,
                m42ndevporcen6,
                m42ndevcuota1,
                m42ndevcuota2,
                m42ndevcuota3,
                m42ndevcuota4,
                m42ndevcuota5,
                m42ndevcuota6,
                m42ndevbaseisp,
                m42ndevcuotaisp,
                m42ndevbasembc,
                m42ndevcuotambc,
                m42ndevbasevia,
                m42ndevcuotavia,
                m42ndevcuotot,
                m42ndedbopint,
                m42ndedcopint,
                m42ndedbopintin,
                m42ndedcopintin,
                m42ndedbopimp,
                m42ndedcopimp,
                m42ndedbopimpin,
                m42ndedcopimpin,
                m42ndedbrectif,
                m42ndedcrectif,
                m42ndedragp,
                m42ndedreginv,
                m42ndedinicio,
                m42ndedregpro,
                m42ndedcuotot,
                m42ndiferencia,
                m42ncuocompen,
                m42nadeducir,
                m42nresultado,
                m42nexporta,
                m42notrasopex,
                m42niadevb,
                m42niadevc,
                m42niasopb,
                m42niasopc,
                m42nmesmodelo,
                m42nregcuot2285                
                };
            setColumns(array);
            FieldDef arrayf[] = {m42ndominio,m42nnif,m42nejercicio,m42nperiodo };
            setDescription("Modelo 420 del 2019");
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod420f extends TableDef
        {
        // campos
        public FieldDef m42fdominio;
        public FieldDef m42fnif;
        public FieldDef m42fejercicio;
        public FieldDef m42fperiodo;
        public FieldDef m42fapellidos;
        public FieldDef m42fnombre;
        public FieldDef m42fnifrep;
        public FieldDef m42fapellrep;
        public FieldDef m42fnomrep;
        public FieldDef m42fmailrep;
        public FieldDef m42ffaxrep;
        public FieldDef m42ftelrep;
        public FieldDef m42fmovilrep;
        public FieldDef m42ftipodir;
        public FieldDef m42fsujnotif;
        public FieldDef m42fsiglas;
        public FieldDef m42fcalle;
        public FieldDef m42fnumero;
        public FieldDef m42fbloque;
        public FieldDef m42fescalera;
        public FieldDef m42fpiso;
        public FieldDef m42fpuerta;
        public FieldDef m42fprovincia;
        public FieldDef m42fmunicipio;
        public FieldDef m42fcpostal;
        public FieldDef m42fexpediente;
        public FieldDef m42fimporte;
        public FieldDef m42fclaveauto;
        public FieldDef m42fingacuenta;
        public FieldDef m42fcausadif;
        public FieldDef m42fcausaotr;
        public FieldDef m42fcauotrdes;
        public FieldDef m42fhasta30k;
        public FieldDef m42fsuper30k;
        public FieldDef m42fpropuesta;
        public FieldDef m42fmodofiauto;
        public FieldDef m42faval;
        public FieldDef m42fcaucion;
        public FieldDef m42fotrasgar;
        public FieldDef m42frelfraemi;
        public FieldDef m42fjustifdoc;
        public FieldDef m42frelfrarec;
        public FieldDef m42freclampago;
        public FieldDef m42fotradocum;
        public TabMod420f(String name)
            {
            super(name);
            m42fdominio = new FieldDef("m42fdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m42fnif = new FieldDef("m42fnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m42fejercicio = new FieldDef("m42fejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m42fperiodo = new FieldDef("m42fperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m42fapellidos = new FieldDef("m42fapellidos",FieldDef.CHAR,75);
            m42fnombre = new FieldDef("m42fnombre",FieldDef.CHAR,15);
            m42fnifrep = new FieldDef("m42fnifrep",FieldDef.CHAR,15);
            m42fapellrep = new FieldDef("m42fapellrep",FieldDef.CHAR,75);
            m42fnomrep = new FieldDef("m42fnomrep",FieldDef.CHAR,15);
            m42fmailrep = new FieldDef("m42fmailrep",FieldDef.CHAR,60);
            m42ffaxrep = new FieldDef("m42ffaxrep",FieldDef.CHAR,9);
            m42ftelrep = new FieldDef("m42ftelrep",FieldDef.CHAR,9);
            m42fmovilrep = new FieldDef("m42fmovilrep",FieldDef.CHAR,15);
            m42ftipodir = new FieldDef("m42ftipodir",FieldDef.CHAR,2);
            m42fsujnotif = new FieldDef("m42fsujnotif",FieldDef.CHAR,2);
            m42fsiglas = new FieldDef("m42fsiglas",FieldDef.CHAR,2);
            m42fcalle = new FieldDef("m42fcalle",FieldDef.CHAR,50);
            m42fnumero = new FieldDef("m42fnumero",FieldDef.CHAR,5);
            m42fbloque = new FieldDef("m42fbloque",FieldDef.CHAR,3);
            m42fescalera = new FieldDef("m42fescalera",FieldDef.CHAR,2);
            m42fpiso = new FieldDef("m42fpiso",FieldDef.CHAR,2);
            m42fpuerta = new FieldDef("m42fpuerta",FieldDef.CHAR,4);
            m42fprovincia = new FieldDef("m42fprovincia",FieldDef.INTEGER,0);
            m42fmunicipio = new FieldDef("m42fmunicipio",FieldDef.INTEGER,0);
            m42fcpostal = new FieldDef("m42fcpostal",FieldDef.CHAR,5);
            m42fexpediente = new FieldDef("m42fexpediente",FieldDef.CHAR,25);
            m42fimporte = new FieldDef("m42fimporte",FieldDef.FLOAT,0,2);
            m42fclaveauto = new FieldDef("m42fclaveauto",FieldDef.CHAR,13);
            m42fingacuenta = new FieldDef("m42fingacuenta",FieldDef.FLOAT,0,2);
            m42fcausadif = new FieldDef("m42fcausadif",FieldDef.CHAR,1);
            m42fcausaotr = new FieldDef("m42fcausaotr",FieldDef.CHAR,1);
            m42fcauotrdes = new FieldDef("m42fcauotrdes",FieldDef.CHAR,350);
            m42fhasta30k = new FieldDef("m42fhasta30k",FieldDef.CHAR,1);
            m42fsuper30k = new FieldDef("m42fsuper30k",FieldDef.CHAR,1);
            m42fpropuesta = new FieldDef("m42fpropuesta",FieldDef.CHAR,350);
            m42fmodofiauto = new FieldDef("m42fmodofiauto",FieldDef.CHAR,1);
            m42faval = new FieldDef("m42faval",FieldDef.CHAR,1);
            m42fcaucion = new FieldDef("m42fcaucion",FieldDef.CHAR,1);
            m42fotrasgar = new FieldDef("m42fotrasgar",FieldDef.CHAR,1);
            m42frelfraemi = new FieldDef("m42frelfraemi",FieldDef.CHAR,1);
            m42fjustifdoc = new FieldDef("m42fjustifdoc",FieldDef.CHAR,1);
            m42frelfrarec = new FieldDef("m42frelfrarec",FieldDef.CHAR,1);
            m42freclampago = new FieldDef("m42freclampago",FieldDef.CHAR,1);
            m42fotradocum = new FieldDef("m42fotradocum",FieldDef.CHAR,350);
            FieldDef array[] = {
                m42fdominio,
                m42fnif,
                m42fejercicio,
                m42fperiodo,
                m42fapellidos,
                m42fnombre,
                m42fnifrep,
                m42fapellrep,
                m42fnomrep,
                m42fmailrep,
                m42ffaxrep,
                m42ftelrep,
                m42fmovilrep,
                m42ftipodir,
                m42fsujnotif,
                m42fsiglas,
                m42fcalle,
                m42fnumero,
                m42fbloque,
                m42fescalera,
                m42fpiso,
                m42fpuerta,
                m42fprovincia,
                m42fmunicipio,
                m42fcpostal,
                m42fexpediente,
                m42fimporte,
                m42fclaveauto,
                m42fingacuenta,
                m42fcausadif,
                m42fcausaotr,
                m42fcauotrdes,
                m42fhasta30k,
                m42fsuper30k,
                m42fpropuesta,
                m42fmodofiauto,
                m42faval,
                m42fcaucion,
                m42fotrasgar,
                m42frelfraemi,
                m42fjustifdoc,
                m42frelfrarec,
                m42freclampago,
                m42fotradocum                
                };
            setColumns(array);
            FieldDef arrayf[] = {m42fdominio,m42fnif,m42fejercicio,m42fperiodo };
            setDescription("Pagos fraccionados modelo 420");
            setPrimaryKeys(arrayf);
            }
        }
        
    public CatModigic()
        {
        tabmod420 = new TabMod420("mod420");
        tabmod425 = new TabMod425("mod425");
        tabmod4251 = new TabMod4251("mod4251");
        tabmod4252 = new TabMod4252("mod4252");
        tabmod415 = new TabMod415("mod415");
        tabmod415d = new TabMod415d("mod415d");
        tabmod415i = new TabMod415i("mod415i");
        tabmodigicc = new TabModigicc("modigicc");
        tabmodigicl = new TabModigicl("modigicl");
        tabmodigicagr = new TabModigicagr("modigicagr");
        tabmodigic = new TabModigic("modigic");
        tabmod421des = new TabMod421des("mod421des");
        tabmodagrigic = new TabModagrigic("modagrigic");
        tabmod421 = new TabMod421("mod421");
        tabmod421m = new TabMod421m("mod421m");
        tabmod417 = new TabMod417("mod417");
        tabmod417p4 = new TabMod417p4("mod417p4");
        tabmod417p5 = new TabMod417p5("mod417p5");
        tabmod420n = new TabMod420n("mod420n");
        tabmod420f = new TabMod420f("mod420f");
        TableDef array[] = {
            tabmod420,
            tabmod425,
            tabmod4251,
            tabmod4252,
            tabmod415,
            tabmod415d,
            tabmod415i,
            tabmodigicc,
            tabmodigicl,
            tabmodigicagr,
            tabmodigic,
            tabmod421des,
            tabmodagrigic,
            tabmod421,
            tabmod421m,
            tabmod417,
            tabmod417p4,
            tabmod417p5,
            tabmod420n,
            tabmod420f            
            };
        setTables(array);
        FieldDef tabmod4251Arrayf1[] = { tabmod4251.m4251dominio,tabmod4251.m4251nif,tabmod4251.m4251ejercicio,tabmod4251.m4251periodo };
        ForeignKey tabmod4251Arrayfk[] = { 
            new ForeignKey(tabmod425,tabmod4251Arrayf1)            
            };
        tabmod4251.setForeignKeys(tabmod4251Arrayfk);
        FieldDef tabmod4252Arrayf1[] = { tabmod4252.m4252dominio,tabmod4252.m4252nif,tabmod4252.m4252ejercicio,tabmod4252.m4252periodo };
        ForeignKey tabmod4252Arrayfk[] = { 
            new ForeignKey(tabmod425,tabmod4252Arrayf1)            
            };
        tabmod4252.setForeignKeys(tabmod4252Arrayfk);
        FieldDef tabmod415dArrayf1[] = { tabmod415d.m415ddominio,tabmod415d.m415dnif,tabmod415d.m415dejercicio,tabmod415d.m415dperiodo };
        ForeignKey tabmod415dArrayfk[] = { 
            new ForeignKey(tabmod415,tabmod415dArrayf1)            
            };
        tabmod415d.setForeignKeys(tabmod415dArrayfk);
        FieldDef tabmod415iArrayf1[] = { tabmod415i.m415idominio,tabmod415i.m415inif,tabmod415i.m415iejercicio,tabmod415i.m415iperiodo };
        FieldDef tabmod415iArrayf2[] = { tabmod415i.m415iidentd };
        ForeignKey tabmod415iArrayfk[] = { 
            new ForeignKey(tabmod415,tabmod415iArrayf1),
            new ForeignKey(tabmod415d,tabmod415iArrayf2)            
            };
        tabmod415i.setForeignKeys(tabmod415iArrayfk);
        FieldDef tabmodigiclArrayf1[] = { tabmodigicl.mglejercicio,tabmodigicl.mglperiodo,tabmodigicl.mglepigrafe,tabmodigicl.mglletra };
        FieldDef tabmodigiclArrayf2[] = { tabmodigicl.mgltipo };
        ForeignKey tabmodigiclArrayfk[] = { 
            new ForeignKey(tabmodigic,tabmodigiclArrayf1),
            new ForeignKey(tabmodigic,tabmodigiclArrayf2)            
            };
        tabmodigicl.setForeignKeys(tabmodigiclArrayfk);
        FieldDef tabmodagrigicArrayf1[] = { tabmodagrigic.macmodejer,tabmodagrigic.macepigrafe };
        ForeignKey tabmodagrigicArrayfk[] = { 
            new ForeignKey(tabmodigicagr,tabmodagrigicArrayf1)            
            };
        tabmodagrigic.setForeignKeys(tabmodagrigicArrayfk);
        FieldDef tabmod421mArrayf1[] = { tabmod421m.m421mdominio,tabmod421m.m421mnif,tabmod421m.m421mejercicio,tabmod421m.m421mperiodo };
        ForeignKey tabmod421mArrayfk[] = { 
            new ForeignKey(tabmod421,tabmod421mArrayf1)            
            };
        tabmod421m.setForeignKeys(tabmod421mArrayfk);
        }
    }
    
