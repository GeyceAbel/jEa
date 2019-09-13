// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Fri Sep 13 10:03:23 CEST 2019
// 
// Aplicación: easp
// 
package mae.easp.db;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.general.*;
// 
public class CatModelos1 extends Catalog
    {
    // tablas
    public TabMod300 tabmod300;
    public TabMod300des tabmod300des;
    public TabMod300desb tabmod300desb;
    public TabMod300pro tabmod300pro;
    public TabMod370 tabmod370;
    public TabMod110 tabmod110;
    public TabMod115 tabmod115;
    public TabMod130 tabmod130;
    public TabMod131 tabmod131;
    public TabMod310 tabmod310;
    public TabMod311 tabmod311;
    public TabMod180e tabmod180e;
    public TabMod190c tabmod190c;
    public TabMod190d tabmod190d;
    public TabCertifgral tabcertifgral;
    public TabCertiprof tabcertiprof;
    public TabMod347c tabmod347c;
    public TabMod347d tabmod347d;
    public TabMod347a tabmod347a;
    public TabMod193c tabmod193c;
    public TabMod193d tabmod193d;
    public TabMod123 tabmod123;
    public TabMod349c tabmod349c;
    public TabMod349d tabmod349d;
    public TabMod349r tabmod349r;
    public TabModintc tabmodintc;
    public TabModintd tabmodintd;
    public TabMod110d tabmod110d;
    public TabMod300prodes tabmod300prodes;
    public TabMod390des tabmod390des;
    public TabMod110acum tabmod110acum;
    public TabMod349acum tabmod349acum;
    public TabMod123d tabmod123d;
    public TabMod216 tabmod216;
    public TabMod216d tabmod216d;
    public TabMod296r tabmod296r;
    public TabMod296d tabmod296d;
    public TabMod322 tabmod322;
    public TabMod322pro tabmod322pro;
    public TabMod202 tabmod202;
    public TabMod20a tabmod20a;
    public TabMod303rs tabmod303rs;
    public TabMod303p4 tabmod303p4;
    public TabMod102 tabmod102;
    public TabMod180r tabmod180r;
    public TabMod115d tabmod115d;
    public TabMod3901 tabmod3901;
    public TabMod3902 tabmod3902;
    public TabMod3902b tabmod3902b;
    public TabMod3903 tabmod3903;
    public TabMod390act tabmod390act;
    public TabMod3904 tabmod3904;
    public TabMod3925 tabmod3925;
    public class TabMod300 extends TableDef
        {
        // campos
        public FieldDef m300dominio;
        public FieldDef m300nif;
        public FieldDef m300ejercicio;
        public FieldDef m300periodo;
        public FieldDef m300modelo;
        public FieldDef m300deleg;
        public FieldDef m300admon;
        public FieldDef m300codadmon;
        public FieldDef m300apellidos;
        public FieldDef m300nombre;
        public FieldDef m300siglas;
        public FieldDef m300calle;
        public FieldDef m300numero;
        public FieldDef m300escalera;
        public FieldDef m300piso;
        public FieldDef m300puerta;
        public FieldDef m300cpostal;
        public FieldDef m300municipio;
        public FieldDef m300provincia;
        public FieldDef m300telefono;
        public FieldDef m300devivbase1;
        public FieldDef m300devivpor1;
        public FieldDef m300devivcuota1;
        public FieldDef m300devivbase2;
        public FieldDef m300devivpor2;
        public FieldDef m300devivcuota2;
        public FieldDef m300devivbase3;
        public FieldDef m300devivpor3;
        public FieldDef m300devivcuota3;
        public FieldDef m300devrebase1;
        public FieldDef m300devrepor1;
        public FieldDef m300devrecuota1;
        public FieldDef m300devrebase2;
        public FieldDef m300devrepor2;
        public FieldDef m300devrecuota2;
        public FieldDef m300devrebase3;
        public FieldDef m300devrepor3;
        public FieldDef m300devrecuota3;
        public FieldDef m300devadqbase;
        public FieldDef m300devadqquota;
        public FieldDef m300totcuotdev;
        public FieldDef m300dedopin;
        public FieldDef m300dedimpor;
        public FieldDef m300dedadq;
        public FieldDef m300dedopinb;
        public FieldDef m300dedimporb;
        public FieldDef m300dedadqb;
        public FieldDef m300dedragp;
        public FieldDef m300dedrinv;
        public FieldDef m300totded;
        public FieldDef m300diferencia;
        public FieldDef m300atradmonpor;
        public FieldDef m300atradmon;
        public FieldDef m300cuotcompen;
        public FieldDef m300entregas;
        public FieldDef m300estydiput;
        public FieldDef m300resultado;
        public FieldDef m300impcompen;
        public FieldDef m300sinactiv;
        public FieldDef m300impdevol;
        public FieldDef m300entdevol;
        public FieldDef m300ofidevol;
        public FieldDef m300digidevol;
        public FieldDef m300ctadevol;
        public FieldDef m300cruzefec;
        public FieldDef m300cruzadeu;
        public FieldDef m300impingreso;
        public FieldDef m300entingreso;
        public FieldDef m300ofiingreso;
        public FieldDef m300digiingreso;
        public FieldDef m300ctaingreso;
        public FieldDef m300munifirma;
        public FieldDef m300dia;
        public FieldDef m300mes;
        public FieldDef m300anyo;
        public FieldDef m300fecha;
        public FieldDef m300percont;
        public FieldDef m300telcont;
        public FieldDef m300observa;
        public FieldDef m300letetiq;
        public FieldDef m300exporta;
        public FieldDef m300otrasopex;
        public FieldDef m300opsujdev;
        public FieldDef m300opnosujdev;
        public FieldDef m300maxdevol;
        public FieldDef m300adevolver;
        public FieldDef m300acompensar;
        public FieldDef m300tipodecl;
        public FieldDef m300cruzccc;
        public FieldDef m300formapago;
        public FieldDef m300regpro;
        public FieldDef m300adeducir;
        public FieldDef m300resultliq;
        public FieldDef m300codelec;
        public FieldDef m300numjustif;
        public FieldDef m300dedopinivb;
        public FieldDef m300dedopinivc;
        public FieldDef m300dedimpivb;
        public FieldDef m300dedimpivc;
        public FieldDef m300dedadqivb;
        public FieldDef m300dedadqivc;
        public FieldDef m300devmensual;
        public FieldDef m300mesmodelo;
        public FieldDef m300cruzcomp;
        public FieldDef m300presconj;
        public FieldDef m300concurso;
        public FieldDef m300devispb;
        public FieldDef m300devispc;
        public FieldDef m300devmbqb;
        public FieldDef m300devmbqc;
        public FieldDef m300devmbqrb;
        public FieldDef m300devmbqrc;
        public FieldDef m300dedrectib;
        public FieldDef m300dedrectic;
        public FieldDef m300resreggen;
        public FieldDef m300regsim;
        public FieldDef m300concacre;
        public FieldDef m300recc;
        public FieldDef m300destrecc;
        public FieldDef m300apliproesp;
        public FieldDef m300revproesp;
        public FieldDef m300fechaconac;
        public FieldDef m300ressuma;
        public FieldDef m300iadevb;
        public FieldDef m300iadevc;
        public FieldDef m300iasopb;
        public FieldDef m300iasopc;
        public FieldDef m300ibanpaisi;
        public FieldDef m300ibandci;
        public FieldDef m300ibanpaisd;
        public FieldDef m300ibandcd;
        public FieldDef m300exoactpral;
        public FieldDef m300exoclapral;
        public FieldDef m300exoepipral;
        public FieldDef m300exoact1;
        public FieldDef m300exocla1;
        public FieldDef m300exoepi1;
        public FieldDef m300exoact2;
        public FieldDef m300exocla2;
        public FieldDef m300exoepi2;
        public FieldDef m300exoact3;
        public FieldDef m300exocla3;
        public FieldDef m300exoepi3;
        public FieldDef m300exoact4;
        public FieldDef m300exocla4;
        public FieldDef m300exoepi4;
        public FieldDef m300exoact5;
        public FieldDef m300exocla5;
        public FieldDef m300exoepi5;
        public FieldDef m300exotercera;
        public FieldDef m300exoreggral;
        public FieldDef m300exoregrecc;
        public FieldDef m300exoregsimp;
        public FieldDef m300exoexporta;
        public FieldDef m300exoexensin;
        public FieldDef m300exototal;
        public FieldDef m300exoinvsuje;
        public FieldDef m300exoinstala;
        public FieldDef m300exoinmob;
        public FieldDef m300regulaquo;
        public FieldDef m300reguladua;
        public FieldDef m300swift;
        public FieldDef m300exon390;
        public FieldDef m300alava;
        public FieldDef m300guipuzcoa;
        public FieldDef m300vizcaya;
        public FieldDef m300navarra;
        public FieldDef m300exoentrega;
        public FieldDef m300exoragp;
        public FieldDef m300exoreceq;
        public FieldDef m300exobus;
        public FieldDef m300exoagviajes;
        public FieldDef m300exobinv;
        public FieldDef m300foralpdte;
        public FieldDef m300voluntario;
        public FieldDef m300exonvo;
        public FieldDef m300tercomu;
        public TabMod300(String name)
            {
            super(name);
            m300dominio = new FieldDef("m300dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m300nif = new FieldDef("m300nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m300ejercicio = new FieldDef("m300ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m300periodo = new FieldDef("m300periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m300modelo = new FieldDef("m300modelo",FieldDef.CHAR,5);
            m300deleg = new FieldDef("m300deleg",FieldDef.CHAR,30);
            m300admon = new FieldDef("m300admon",FieldDef.CHAR,30);
            m300codadmon = new FieldDef("m300codadmon",FieldDef.INTEGER,0);
            m300apellidos = new FieldDef("m300apellidos",FieldDef.CHAR,60);
            m300nombre = new FieldDef("m300nombre",FieldDef.CHAR,20);
            m300siglas = new FieldDef("m300siglas",FieldDef.CHAR,2);
            m300calle = new FieldDef("m300calle",FieldDef.CHAR,17);
            m300numero = new FieldDef("m300numero",FieldDef.CHAR,4);
            m300escalera = new FieldDef("m300escalera",FieldDef.CHAR,2);
            m300piso = new FieldDef("m300piso",FieldDef.CHAR,2);
            m300puerta = new FieldDef("m300puerta",FieldDef.CHAR,2);
            m300cpostal = new FieldDef("m300cpostal",FieldDef.CHAR,5);
            m300municipio = new FieldDef("m300municipio",FieldDef.CHAR,20);
            m300provincia = new FieldDef("m300provincia",FieldDef.CHAR,15);
            m300telefono = new FieldDef("m300telefono",FieldDef.CHAR,9);
            m300devivbase1 = new FieldDef("m300devivbase1",FieldDef.FLOAT,6,0);
            m300devivpor1 = new FieldDef("m300devivpor1",FieldDef.FLOAT,6,0);
            m300devivcuota1 = new FieldDef("m300devivcuota1",FieldDef.FLOAT,6,0);
            m300devivbase2 = new FieldDef("m300devivbase2",FieldDef.FLOAT,6,0);
            m300devivpor2 = new FieldDef("m300devivpor2",FieldDef.FLOAT,6,0);
            m300devivcuota2 = new FieldDef("m300devivcuota2",FieldDef.FLOAT,6,0);
            m300devivbase3 = new FieldDef("m300devivbase3",FieldDef.FLOAT,6,0);
            m300devivpor3 = new FieldDef("m300devivpor3",FieldDef.FLOAT,6,0);
            m300devivcuota3 = new FieldDef("m300devivcuota3",FieldDef.FLOAT,6,0);
            m300devrebase1 = new FieldDef("m300devrebase1",FieldDef.FLOAT,6,0);
            m300devrepor1 = new FieldDef("m300devrepor1",FieldDef.FLOAT,6,0);
            m300devrecuota1 = new FieldDef("m300devrecuota1",FieldDef.FLOAT,6,0);
            m300devrebase2 = new FieldDef("m300devrebase2",FieldDef.FLOAT,6,0);
            m300devrepor2 = new FieldDef("m300devrepor2",FieldDef.FLOAT,6,0);
            m300devrecuota2 = new FieldDef("m300devrecuota2",FieldDef.FLOAT,6,0);
            m300devrebase3 = new FieldDef("m300devrebase3",FieldDef.FLOAT,6,0);
            m300devrepor3 = new FieldDef("m300devrepor3",FieldDef.FLOAT,6,0);
            m300devrecuota3 = new FieldDef("m300devrecuota3",FieldDef.FLOAT,6,0);
            m300devadqbase = new FieldDef("m300devadqbase",FieldDef.FLOAT,6,0);
            m300devadqquota = new FieldDef("m300devadqquota",FieldDef.FLOAT,6,0);
            m300totcuotdev = new FieldDef("m300totcuotdev",FieldDef.FLOAT,6,0);
            m300dedopin = new FieldDef("m300dedopin",FieldDef.FLOAT,6,0);
            m300dedimpor = new FieldDef("m300dedimpor",FieldDef.FLOAT,6,0);
            m300dedadq = new FieldDef("m300dedadq",FieldDef.FLOAT,6,0);
            m300dedopinb = new FieldDef("m300dedopinb",FieldDef.FLOAT,6,0);
            m300dedimporb = new FieldDef("m300dedimporb",FieldDef.FLOAT,6,0);
            m300dedadqb = new FieldDef("m300dedadqb",FieldDef.FLOAT,6,0);
            m300dedragp = new FieldDef("m300dedragp",FieldDef.FLOAT,6,0);
            m300dedrinv = new FieldDef("m300dedrinv",FieldDef.FLOAT,6,0);
            m300totded = new FieldDef("m300totded",FieldDef.FLOAT,6,0);
            m300diferencia = new FieldDef("m300diferencia",FieldDef.FLOAT,6,0);
            m300atradmonpor = new FieldDef("m300atradmonpor",FieldDef.FLOAT,6,0);
            m300atradmon = new FieldDef("m300atradmon",FieldDef.FLOAT,6,0);
            m300cuotcompen = new FieldDef("m300cuotcompen",FieldDef.FLOAT,6,0);
            m300entregas = new FieldDef("m300entregas",FieldDef.FLOAT,6,0);
            m300estydiput = new FieldDef("m300estydiput",FieldDef.FLOAT,6,0);
            m300resultado = new FieldDef("m300resultado",FieldDef.FLOAT,6,0);
            m300impcompen = new FieldDef("m300impcompen",FieldDef.FLOAT,6,0);
            m300sinactiv = new FieldDef("m300sinactiv",FieldDef.CHAR,1);
            m300impdevol = new FieldDef("m300impdevol",FieldDef.FLOAT,6,0);
            m300entdevol = new FieldDef("m300entdevol",FieldDef.CHAR,4);
            m300ofidevol = new FieldDef("m300ofidevol",FieldDef.CHAR,4);
            m300digidevol = new FieldDef("m300digidevol",FieldDef.CHAR,2);
            m300ctadevol = new FieldDef("m300ctadevol",FieldDef.CHAR,10);
            m300cruzefec = new FieldDef("m300cruzefec",FieldDef.CHAR,1);
            m300cruzadeu = new FieldDef("m300cruzadeu",FieldDef.CHAR,1);
            m300impingreso = new FieldDef("m300impingreso",FieldDef.FLOAT,6,0);
            m300entingreso = new FieldDef("m300entingreso",FieldDef.CHAR,4);
            m300ofiingreso = new FieldDef("m300ofiingreso",FieldDef.CHAR,4);
            m300digiingreso = new FieldDef("m300digiingreso",FieldDef.CHAR,2);
            m300ctaingreso = new FieldDef("m300ctaingreso",FieldDef.CHAR,10);
            m300munifirma = new FieldDef("m300munifirma",FieldDef.CHAR,30);
            m300dia = new FieldDef("m300dia",FieldDef.CHAR,2);
            m300mes = new FieldDef("m300mes",FieldDef.CHAR,10);
            m300anyo = new FieldDef("m300anyo",FieldDef.CHAR,4);
            m300fecha = new FieldDef("m300fecha",FieldDef.DATE);
            m300percont = new FieldDef("m300percont",FieldDef.CHAR,100);
            m300telcont = new FieldDef("m300telcont",FieldDef.CHAR,9);
            m300observa = new FieldDef("m300observa",FieldDef.CHAR,4000);
            m300letetiq = new FieldDef("m300letetiq",FieldDef.CHAR,4);
            m300exporta = new FieldDef("m300exporta",FieldDef.FLOAT,6,0);
            m300otrasopex = new FieldDef("m300otrasopex",FieldDef.FLOAT,6,0);
            m300opsujdev = new FieldDef("m300opsujdev",FieldDef.FLOAT,6,0);
            m300opnosujdev = new FieldDef("m300opnosujdev",FieldDef.FLOAT,6,0);
            m300maxdevol = new FieldDef("m300maxdevol",FieldDef.FLOAT,6,0);
            m300adevolver = new FieldDef("m300adevolver",FieldDef.FLOAT,6,0);
            m300acompensar = new FieldDef("m300acompensar",FieldDef.FLOAT,6,0);
            m300tipodecl = new FieldDef("m300tipodecl",FieldDef.CHAR,1);
            m300cruzccc = new FieldDef("m300cruzccc",FieldDef.CHAR,1);
            m300formapago = new FieldDef("m300formapago",FieldDef.INTEGER,0);
            m300regpro = new FieldDef("m300regpro",FieldDef.FLOAT,6,0);
            m300adeducir = new FieldDef("m300adeducir",FieldDef.FLOAT,6,0);
            m300resultliq = new FieldDef("m300resultliq",FieldDef.FLOAT,6,0);
            m300codelec = new FieldDef("m300codelec",FieldDef.CHAR,16);
            m300numjustif = new FieldDef("m300numjustif",FieldDef.CHAR,13);
            m300dedopinivb = new FieldDef("m300dedopinivb",FieldDef.FLOAT,6,0);
            m300dedopinivc = new FieldDef("m300dedopinivc",FieldDef.FLOAT,6,0);
            m300dedimpivb = new FieldDef("m300dedimpivb",FieldDef.FLOAT,6,0);
            m300dedimpivc = new FieldDef("m300dedimpivc",FieldDef.FLOAT,6,0);
            m300dedadqivb = new FieldDef("m300dedadqivb",FieldDef.FLOAT,6,0);
            m300dedadqivc = new FieldDef("m300dedadqivc",FieldDef.FLOAT,6,0);
            m300devmensual = new FieldDef("m300devmensual",FieldDef.CHAR,1);
            m300mesmodelo = new FieldDef("m300mesmodelo",FieldDef.INTEGER,0);
            m300cruzcomp = new FieldDef("m300cruzcomp",FieldDef.CHAR,1);
            m300presconj = new FieldDef("m300presconj",FieldDef.CHAR,1);
            m300concurso = new FieldDef("m300concurso",FieldDef.CHAR,1);
            m300devispb = new FieldDef("m300devispb",FieldDef.FLOAT,6,0);
            m300devispc = new FieldDef("m300devispc",FieldDef.FLOAT,6,0);
            m300devmbqb = new FieldDef("m300devmbqb",FieldDef.FLOAT,6,0);
            m300devmbqc = new FieldDef("m300devmbqc",FieldDef.FLOAT,6,0);
            m300devmbqrb = new FieldDef("m300devmbqrb",FieldDef.FLOAT,6,0);
            m300devmbqrc = new FieldDef("m300devmbqrc",FieldDef.FLOAT,6,0);
            m300dedrectib = new FieldDef("m300dedrectib",FieldDef.FLOAT,6,0);
            m300dedrectic = new FieldDef("m300dedrectic",FieldDef.FLOAT,6,0);
            m300resreggen = new FieldDef("m300resreggen",FieldDef.FLOAT,6,0);
            m300regsim = new FieldDef("m300regsim",FieldDef.CHAR,1);
            m300concacre = new FieldDef("m300concacre",FieldDef.CHAR,1);
            m300recc = new FieldDef("m300recc",FieldDef.CHAR,1);
            m300destrecc = new FieldDef("m300destrecc",FieldDef.CHAR,1);
            m300apliproesp = new FieldDef("m300apliproesp",FieldDef.CHAR,1);
            m300revproesp = new FieldDef("m300revproesp",FieldDef.CHAR,1);
            m300fechaconac = new FieldDef("m300fechaconac",FieldDef.DATE);
            m300ressuma = new FieldDef("m300ressuma",FieldDef.FLOAT,6,0);
            m300iadevb = new FieldDef("m300iadevb",FieldDef.FLOAT,6,0);
            m300iadevc = new FieldDef("m300iadevc",FieldDef.FLOAT,6,0);
            m300iasopb = new FieldDef("m300iasopb",FieldDef.FLOAT,6,0);
            m300iasopc = new FieldDef("m300iasopc",FieldDef.FLOAT,6,0);
            m300ibanpaisi = new FieldDef("m300ibanpaisi",FieldDef.CHAR,2);
            m300ibandci = new FieldDef("m300ibandci",FieldDef.CHAR,2);
            m300ibanpaisd = new FieldDef("m300ibanpaisd",FieldDef.CHAR,2);
            m300ibandcd = new FieldDef("m300ibandcd",FieldDef.CHAR,2);
            m300exoactpral = new FieldDef("m300exoactpral",FieldDef.CHAR,40);
            m300exoclapral = new FieldDef("m300exoclapral",FieldDef.FLOAT,6,0);
            m300exoepipral = new FieldDef("m300exoepipral",FieldDef.CHAR,7);
            m300exoact1 = new FieldDef("m300exoact1",FieldDef.CHAR,40);
            m300exocla1 = new FieldDef("m300exocla1",FieldDef.FLOAT,6,0);
            m300exoepi1 = new FieldDef("m300exoepi1",FieldDef.CHAR,7);
            m300exoact2 = new FieldDef("m300exoact2",FieldDef.CHAR,40);
            m300exocla2 = new FieldDef("m300exocla2",FieldDef.FLOAT,6,0);
            m300exoepi2 = new FieldDef("m300exoepi2",FieldDef.CHAR,7);
            m300exoact3 = new FieldDef("m300exoact3",FieldDef.CHAR,40);
            m300exocla3 = new FieldDef("m300exocla3",FieldDef.FLOAT,6,0);
            m300exoepi3 = new FieldDef("m300exoepi3",FieldDef.CHAR,7);
            m300exoact4 = new FieldDef("m300exoact4",FieldDef.CHAR,40);
            m300exocla4 = new FieldDef("m300exocla4",FieldDef.FLOAT,6,0);
            m300exoepi4 = new FieldDef("m300exoepi4",FieldDef.CHAR,7);
            m300exoact5 = new FieldDef("m300exoact5",FieldDef.CHAR,40);
            m300exocla5 = new FieldDef("m300exocla5",FieldDef.FLOAT,6,0);
            m300exoepi5 = new FieldDef("m300exoepi5",FieldDef.CHAR,7);
            m300exotercera = new FieldDef("m300exotercera",FieldDef.CHAR,1);
            m300exoreggral = new FieldDef("m300exoreggral",FieldDef.FLOAT,6,0);
            m300exoregrecc = new FieldDef("m300exoregrecc",FieldDef.FLOAT,6,0);
            m300exoregsimp = new FieldDef("m300exoregsimp",FieldDef.FLOAT,6,0);
            m300exoexporta = new FieldDef("m300exoexporta",FieldDef.FLOAT,6,0);
            m300exoexensin = new FieldDef("m300exoexensin",FieldDef.FLOAT,6,0);
            m300exototal = new FieldDef("m300exototal",FieldDef.FLOAT,6,0);
            m300exoinvsuje = new FieldDef("m300exoinvsuje",FieldDef.FLOAT,6,0);
            m300exoinstala = new FieldDef("m300exoinstala",FieldDef.FLOAT,6,0);
            m300exoinmob = new FieldDef("m300exoinmob",FieldDef.FLOAT,6,0);
            m300regulaquo = new FieldDef("m300regulaquo",FieldDef.FLOAT,6,0);
            m300reguladua = new FieldDef("m300reguladua",FieldDef.FLOAT,6,0);
            m300swift = new FieldDef("m300swift",FieldDef.CHAR,11);
            m300exon390 = new FieldDef("m300exon390",FieldDef.INTEGER,0);
            m300alava = new FieldDef("m300alava",FieldDef.FLOAT,6,0);
            m300guipuzcoa = new FieldDef("m300guipuzcoa",FieldDef.FLOAT,6,0);
            m300vizcaya = new FieldDef("m300vizcaya",FieldDef.FLOAT,6,0);
            m300navarra = new FieldDef("m300navarra",FieldDef.FLOAT,6,0);
            m300exoentrega = new FieldDef("m300exoentrega",FieldDef.FLOAT,6,0);
            m300exoragp = new FieldDef("m300exoragp",FieldDef.FLOAT,6,0);
            m300exoreceq = new FieldDef("m300exoreceq",FieldDef.FLOAT,6,0);
            m300exobus = new FieldDef("m300exobus",FieldDef.FLOAT,6,0);
            m300exoagviajes = new FieldDef("m300exoagviajes",FieldDef.FLOAT,6,0);
            m300exobinv = new FieldDef("m300exobinv",FieldDef.FLOAT,6,0);
            m300foralpdte = new FieldDef("m300foralpdte",FieldDef.INTEGER,0);
            m300voluntario = new FieldDef("m300voluntario",FieldDef.INTEGER,0);
            m300exonvo = new FieldDef("m300exonvo",FieldDef.INTEGER,0);
            m300tercomu = new FieldDef("m300tercomu",FieldDef.FLOAT,0,2);
            FieldDef array[] = {
                m300dominio,
                m300nif,
                m300ejercicio,
                m300periodo,
                m300modelo,
                m300deleg,
                m300admon,
                m300codadmon,
                m300apellidos,
                m300nombre,
                m300siglas,
                m300calle,
                m300numero,
                m300escalera,
                m300piso,
                m300puerta,
                m300cpostal,
                m300municipio,
                m300provincia,
                m300telefono,
                m300devivbase1,
                m300devivpor1,
                m300devivcuota1,
                m300devivbase2,
                m300devivpor2,
                m300devivcuota2,
                m300devivbase3,
                m300devivpor3,
                m300devivcuota3,
                m300devrebase1,
                m300devrepor1,
                m300devrecuota1,
                m300devrebase2,
                m300devrepor2,
                m300devrecuota2,
                m300devrebase3,
                m300devrepor3,
                m300devrecuota3,
                m300devadqbase,
                m300devadqquota,
                m300totcuotdev,
                m300dedopin,
                m300dedimpor,
                m300dedadq,
                m300dedopinb,
                m300dedimporb,
                m300dedadqb,
                m300dedragp,
                m300dedrinv,
                m300totded,
                m300diferencia,
                m300atradmonpor,
                m300atradmon,
                m300cuotcompen,
                m300entregas,
                m300estydiput,
                m300resultado,
                m300impcompen,
                m300sinactiv,
                m300impdevol,
                m300entdevol,
                m300ofidevol,
                m300digidevol,
                m300ctadevol,
                m300cruzefec,
                m300cruzadeu,
                m300impingreso,
                m300entingreso,
                m300ofiingreso,
                m300digiingreso,
                m300ctaingreso,
                m300munifirma,
                m300dia,
                m300mes,
                m300anyo,
                m300fecha,
                m300percont,
                m300telcont,
                m300observa,
                m300letetiq,
                m300exporta,
                m300otrasopex,
                m300opsujdev,
                m300opnosujdev,
                m300maxdevol,
                m300adevolver,
                m300acompensar,
                m300tipodecl,
                m300cruzccc,
                m300formapago,
                m300regpro,
                m300adeducir,
                m300resultliq,
                m300codelec,
                m300numjustif,
                m300dedopinivb,
                m300dedopinivc,
                m300dedimpivb,
                m300dedimpivc,
                m300dedadqivb,
                m300dedadqivc,
                m300devmensual,
                m300mesmodelo,
                m300cruzcomp,
                m300presconj,
                m300concurso,
                m300devispb,
                m300devispc,
                m300devmbqb,
                m300devmbqc,
                m300devmbqrb,
                m300devmbqrc,
                m300dedrectib,
                m300dedrectic,
                m300resreggen,
                m300regsim,
                m300concacre,
                m300recc,
                m300destrecc,
                m300apliproesp,
                m300revproesp,
                m300fechaconac,
                m300ressuma,
                m300iadevb,
                m300iadevc,
                m300iasopb,
                m300iasopc,
                m300ibanpaisi,
                m300ibandci,
                m300ibanpaisd,
                m300ibandcd,
                m300exoactpral,
                m300exoclapral,
                m300exoepipral,
                m300exoact1,
                m300exocla1,
                m300exoepi1,
                m300exoact2,
                m300exocla2,
                m300exoepi2,
                m300exoact3,
                m300exocla3,
                m300exoepi3,
                m300exoact4,
                m300exocla4,
                m300exoepi4,
                m300exoact5,
                m300exocla5,
                m300exoepi5,
                m300exotercera,
                m300exoreggral,
                m300exoregrecc,
                m300exoregsimp,
                m300exoexporta,
                m300exoexensin,
                m300exototal,
                m300exoinvsuje,
                m300exoinstala,
                m300exoinmob,
                m300regulaquo,
                m300reguladua,
                m300swift,
                m300exon390,
                m300alava,
                m300guipuzcoa,
                m300vizcaya,
                m300navarra,
                m300exoentrega,
                m300exoragp,
                m300exoreceq,
                m300exobus,
                m300exoagviajes,
                m300exobinv,
                m300foralpdte,
                m300voluntario,
                m300exonvo,
                m300tercomu                
                };
            setColumns(array);
            FieldDef arrayf[] = {m300dominio,m300nif,m300ejercicio,m300periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod300des extends TableDef
        {
        // campos
        public FieldDef m300ddominio;
        public FieldDef m300dnif;
        public FieldDef m300dejercicio;
        public FieldDef m300dperiodo;
        public FieldDef m300dgrupo;
        public FieldDef m300dactividad;
        public FieldDef m300ddevadqbas1;
        public FieldDef m300ddevadqquo1;
        public FieldDef m300ddevadqbas2;
        public FieldDef m300ddevadqquo2;
        public FieldDef m300ddevadqbas3;
        public FieldDef m300ddevadqquo3;
        public FieldDef m300ddevinvspb1;
        public FieldDef m300ddevinvspc1;
        public FieldDef m300ddevinvspb2;
        public FieldDef m300ddevinvspc2;
        public FieldDef m300ddevinvspb3;
        public FieldDef m300ddevinvspc3;
        public FieldDef m300ddevmodbycb;
        public FieldDef m300ddevmodbycc;
        public FieldDef m300ddevmdbcqb1;
        public FieldDef m300ddevmdbcqc1;
        public FieldDef m300ddevmdbcqb2;
        public FieldDef m300ddevmdbcqc2;
        public FieldDef m300ddevmdbcqb3;
        public FieldDef m300ddevmdbcqc3;
        public FieldDef m300ddevmodrecb;
        public FieldDef m300ddevmodrecc;
        public FieldDef m300ddevmdreqb1;
        public FieldDef m300ddevmdreqc1;
        public FieldDef m300ddevmdreqb2;
        public FieldDef m300ddevmdreqc2;
        public FieldDef m300ddevmdreqb3;
        public FieldDef m300ddevmdreqc3;
        public FieldDef m300ddevmdreqb4;
        public FieldDef m300ddevmdreqc4;
        public FieldDef m300ddedinbcb;
        public FieldDef m300ddedinbcc;
        public FieldDef m300ddedinbcb1;
        public FieldDef m300ddedinbcc1;
        public FieldDef m300ddedinbcb2;
        public FieldDef m300ddedinbcc2;
        public FieldDef m300ddedinbcb3;
        public FieldDef m300ddedinbcc3;
        public FieldDef m300ddedinbib;
        public FieldDef m300ddedinbic;
        public FieldDef m300ddedinbib1;
        public FieldDef m300ddedinbic1;
        public FieldDef m300ddedinbib2;
        public FieldDef m300ddedinbic2;
        public FieldDef m300ddedinbib3;
        public FieldDef m300ddedinbic3;
        public FieldDef m300ddedimbcb;
        public FieldDef m300ddedimbcc;
        public FieldDef m300ddedimbcb1;
        public FieldDef m300ddedimbcc1;
        public FieldDef m300ddedimbcb2;
        public FieldDef m300ddedimbcc2;
        public FieldDef m300ddedimbcb3;
        public FieldDef m300ddedimbcc3;
        public FieldDef m300ddedimbib;
        public FieldDef m300ddedimbic;
        public FieldDef m300ddedimbib1;
        public FieldDef m300ddedimbic1;
        public FieldDef m300ddedimbib2;
        public FieldDef m300ddedimbic2;
        public FieldDef m300ddedimbib3;
        public FieldDef m300ddedimbic3;
        public FieldDef m300ddedadbcb;
        public FieldDef m300ddedadbcc;
        public FieldDef m300ddedadbcb1;
        public FieldDef m300ddedadbcc1;
        public FieldDef m300ddedadbcb2;
        public FieldDef m300ddedadbcc2;
        public FieldDef m300ddedadbcb3;
        public FieldDef m300ddedadbcc3;
        public FieldDef m300ddedadbib;
        public FieldDef m300ddedadbic;
        public FieldDef m300ddedadbib1;
        public FieldDef m300ddedadbic1;
        public FieldDef m300ddedadbib2;
        public FieldDef m300ddedadbic2;
        public FieldDef m300ddedadbib3;
        public FieldDef m300ddedadbic3;
        public FieldDef m300ddedragp;
        public FieldDef m300ddedragpb;
        public FieldDef m300ddedrinv;
        public FieldDef m300drectifdedu;
        public FieldDef m300dvoloper;
        public FieldDef m300dvoloperdd;
        public FieldDef m300ddevregorb1;
        public FieldDef m300ddevregorb2;
        public FieldDef m300ddevregorb3;
        public FieldDef m300ddevregorq1;
        public FieldDef m300ddevregorq2;
        public FieldDef m300ddevregorq3;
        public FieldDef m300ddevbieusb1;
        public FieldDef m300ddevbieusc1;
        public FieldDef m300ddevbieusb2;
        public FieldDef m300ddevbieusc2;
        public FieldDef m300ddevbieusb3;
        public FieldDef m300ddevbieusc3;
        public FieldDef m300ddevagviab;
        public FieldDef m300ddevagviac;
        public FieldDef m300ddevmodbcb1;
        public FieldDef m300ddevmodbcc1;
        public FieldDef m300ddevmodbcb2;
        public FieldDef m300ddevmodbcc2;
        public FieldDef m300ddevmodbcb3;
        public FieldDef m300ddevmodbcc3;
        public FieldDef m300ddevreceqb1;
        public FieldDef m300ddevreceqc1;
        public FieldDef m300ddevreceqb2;
        public FieldDef m300ddevreceqc2;
        public FieldDef m300ddevreceqb3;
        public FieldDef m300ddevreceqc3;
        public FieldDef m300ddevreceqb4;
        public FieldDef m300ddevreceqc4;
        public FieldDef m300ddevmodreb1;
        public FieldDef m300ddevmodrec1;
        public FieldDef m300ddevmodreb2;
        public FieldDef m300ddevmodrec2;
        public FieldDef m300ddevmodreb3;
        public FieldDef m300ddevmodrec3;
        public FieldDef m300ddevmodreb4;
        public FieldDef m300ddevmodrec4;
        public FieldDef m300ddedoirceqb;
        public FieldDef m300ddedoirceqq;
        public FieldDef m300ddedimrceqb;
        public FieldDef m300ddedimrceqq;
        public FieldDef m300ddedairceqb;
        public FieldDef m300ddedairceqq;
        public FieldDef m300ddedcmrceqb;
        public FieldDef m300ddedcmrceqq;
        public FieldDef m300ddeventbas;
        public FieldDef m300ddevexpbas;
        public FieldDef m300ddevoexbas;
        public FieldDef m300ddevosdbas;
        public FieldDef m300ddevondbas;
        public FieldDef m300dliqiva;
        public FieldDef m300ddevopintb1;
        public FieldDef m300ddevopintq1;
        public FieldDef m300ddevopintb2;
        public FieldDef m300ddevopintq2;
        public FieldDef m300ddevopintb3;
        public FieldDef m300ddevopintq3;
        public FieldDef m300ddedinscb1;
        public FieldDef m300ddedinscc1;
        public FieldDef m300ddedinscb2;
        public FieldDef m300ddedinscc2;
        public FieldDef m300ddedinscb3;
        public FieldDef m300ddedinscc3;
        public FieldDef m300ddedinscb;
        public FieldDef m300ddedinscc;
        public FieldDef m300ddediibib1;
        public FieldDef m300ddediibic1;
        public FieldDef m300ddediibib2;
        public FieldDef m300ddediibic2;
        public FieldDef m300ddediibib3;
        public FieldDef m300ddediibic3;
        public FieldDef m300ddediibib;
        public FieldDef m300ddediibic;
        public FieldDef m300ddedoieqbib;
        public FieldDef m300ddedoieqbiq;
        public FieldDef m300ddedimeqbib;
        public FieldDef m300ddedimeqbiq;
        public FieldDef m300ddedaieqbib;
        public FieldDef m300ddedaieqbiq;
        public FieldDef m300ddeviservb1;
        public FieldDef m300ddeviservc1;
        public FieldDef m300ddeviservb2;
        public FieldDef m300ddeviservc2;
        public FieldDef m300ddeviservb3;
        public FieldDef m300ddeviservc3;
        public FieldDef m300ddediservb1;
        public FieldDef m300ddediservc1;
        public FieldDef m300ddediservb2;
        public FieldDef m300ddediservc2;
        public FieldDef m300ddediservb3;
        public FieldDef m300ddediservc3;
        public FieldDef m300ddediservb;
        public FieldDef m300ddediservc;
        public FieldDef m300ddevadqbas4;
        public FieldDef m300ddevadqquo4;
        public FieldDef m300ddevadqbas5;
        public FieldDef m300ddevadqquo5;
        public FieldDef m300ddevinvspb4;
        public FieldDef m300ddevinvspc4;
        public FieldDef m300ddevinvspb5;
        public FieldDef m300ddevinvspc5;
        public FieldDef m300ddevmdbcqb4;
        public FieldDef m300ddevmdbcqc4;
        public FieldDef m300ddevmdbcqb5;
        public FieldDef m300ddevmdbcqc5;
        public FieldDef m300ddedinbcb4;
        public FieldDef m300ddedinbcc4;
        public FieldDef m300ddedinbcb5;
        public FieldDef m300ddedinbcc5;
        public FieldDef m300ddedinbib4;
        public FieldDef m300ddedinbic4;
        public FieldDef m300ddedinbib5;
        public FieldDef m300ddedinbic5;
        public FieldDef m300ddedimbcb4;
        public FieldDef m300ddedimbcc4;
        public FieldDef m300ddedimbcb5;
        public FieldDef m300ddedimbcc5;
        public FieldDef m300ddedimbib4;
        public FieldDef m300ddedimbic4;
        public FieldDef m300ddedimbib5;
        public FieldDef m300ddedimbic5;
        public FieldDef m300ddedadbcb4;
        public FieldDef m300ddedadbcc4;
        public FieldDef m300ddedadbcb5;
        public FieldDef m300ddedadbcc5;
        public FieldDef m300ddedadbib4;
        public FieldDef m300ddedadbic4;
        public FieldDef m300ddedadbib5;
        public FieldDef m300ddedadbic5;
        public FieldDef m300ddevregorb4;
        public FieldDef m300ddevregorb5;
        public FieldDef m300ddevregorq4;
        public FieldDef m300ddevregorq5;
        public FieldDef m300ddevbieusb4;
        public FieldDef m300ddevbieusc4;
        public FieldDef m300ddevbieusb5;
        public FieldDef m300ddevbieusc5;
        public FieldDef m300ddevmodbcb4;
        public FieldDef m300ddevmodbcc4;
        public FieldDef m300ddevmodbcb5;
        public FieldDef m300ddevmodbcc5;
        public FieldDef m300ddevopintb4;
        public FieldDef m300ddevopintq4;
        public FieldDef m300ddevopintb5;
        public FieldDef m300ddevopintq5;
        public FieldDef m300ddedinscb4;
        public FieldDef m300ddedinscc4;
        public FieldDef m300ddedinscb5;
        public FieldDef m300ddedinscc5;
        public FieldDef m300ddediibib4;
        public FieldDef m300ddediibic4;
        public FieldDef m300ddediibib5;
        public FieldDef m300ddediibic5;
        public FieldDef m300ddeviservb4;
        public FieldDef m300ddeviservc4;
        public FieldDef m300ddeviservb5;
        public FieldDef m300ddeviservc5;
        public FieldDef m300ddediservb4;
        public FieldDef m300ddediservc4;
        public FieldDef m300ddediservb5;
        public FieldDef m300ddediservc5;
        public FieldDef m300ddevagviab2;
        public FieldDef m300ddevagviac2;
        public FieldDef m300dregart80;
        public FieldDef m300daduana;
        public TabMod300des(String name)
            {
            super(name);
            m300ddominio = new FieldDef("m300ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m300dnif = new FieldDef("m300dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m300dejercicio = new FieldDef("m300dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m300dperiodo = new FieldDef("m300dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m300dgrupo = new FieldDef("m300dgrupo",FieldDef.CHAR,1,FieldDef.NOTNULL);
            m300dactividad = new FieldDef("m300dactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m300ddevadqbas1 = new FieldDef("m300ddevadqbas1",FieldDef.FLOAT,6,0);
            m300ddevadqquo1 = new FieldDef("m300ddevadqquo1",FieldDef.FLOAT,6,0);
            m300ddevadqbas2 = new FieldDef("m300ddevadqbas2",FieldDef.FLOAT,6,0);
            m300ddevadqquo2 = new FieldDef("m300ddevadqquo2",FieldDef.FLOAT,6,0);
            m300ddevadqbas3 = new FieldDef("m300ddevadqbas3",FieldDef.FLOAT,6,0);
            m300ddevadqquo3 = new FieldDef("m300ddevadqquo3",FieldDef.FLOAT,6,0);
            m300ddevinvspb1 = new FieldDef("m300ddevinvspb1",FieldDef.FLOAT,6,0);
            m300ddevinvspc1 = new FieldDef("m300ddevinvspc1",FieldDef.FLOAT,6,0);
            m300ddevinvspb2 = new FieldDef("m300ddevinvspb2",FieldDef.FLOAT,6,0);
            m300ddevinvspc2 = new FieldDef("m300ddevinvspc2",FieldDef.FLOAT,6,0);
            m300ddevinvspb3 = new FieldDef("m300ddevinvspb3",FieldDef.FLOAT,6,0);
            m300ddevinvspc3 = new FieldDef("m300ddevinvspc3",FieldDef.FLOAT,6,0);
            m300ddevmodbycb = new FieldDef("m300ddevmodbycb",FieldDef.FLOAT,6,0);
            m300ddevmodbycc = new FieldDef("m300ddevmodbycc",FieldDef.FLOAT,6,0);
            m300ddevmdbcqb1 = new FieldDef("m300ddevmdbcqb1",FieldDef.FLOAT,6,0);
            m300ddevmdbcqc1 = new FieldDef("m300ddevmdbcqc1",FieldDef.FLOAT,6,0);
            m300ddevmdbcqb2 = new FieldDef("m300ddevmdbcqb2",FieldDef.FLOAT,6,0);
            m300ddevmdbcqc2 = new FieldDef("m300ddevmdbcqc2",FieldDef.FLOAT,6,0);
            m300ddevmdbcqb3 = new FieldDef("m300ddevmdbcqb3",FieldDef.FLOAT,6,0);
            m300ddevmdbcqc3 = new FieldDef("m300ddevmdbcqc3",FieldDef.FLOAT,6,0);
            m300ddevmodrecb = new FieldDef("m300ddevmodrecb",FieldDef.FLOAT,6,0);
            m300ddevmodrecc = new FieldDef("m300ddevmodrecc",FieldDef.FLOAT,6,0);
            m300ddevmdreqb1 = new FieldDef("m300ddevmdreqb1",FieldDef.FLOAT,6,0);
            m300ddevmdreqc1 = new FieldDef("m300ddevmdreqc1",FieldDef.FLOAT,6,0);
            m300ddevmdreqb2 = new FieldDef("m300ddevmdreqb2",FieldDef.FLOAT,6,0);
            m300ddevmdreqc2 = new FieldDef("m300ddevmdreqc2",FieldDef.FLOAT,6,0);
            m300ddevmdreqb3 = new FieldDef("m300ddevmdreqb3",FieldDef.FLOAT,6,0);
            m300ddevmdreqc3 = new FieldDef("m300ddevmdreqc3",FieldDef.FLOAT,6,0);
            m300ddevmdreqb4 = new FieldDef("m300ddevmdreqb4",FieldDef.FLOAT,6,0);
            m300ddevmdreqc4 = new FieldDef("m300ddevmdreqc4",FieldDef.FLOAT,6,0);
            m300ddedinbcb = new FieldDef("m300ddedinbcb",FieldDef.FLOAT,6,0);
            m300ddedinbcc = new FieldDef("m300ddedinbcc",FieldDef.FLOAT,6,0);
            m300ddedinbcb1 = new FieldDef("m300ddedinbcb1",FieldDef.FLOAT,6,0);
            m300ddedinbcc1 = new FieldDef("m300ddedinbcc1",FieldDef.FLOAT,6,0);
            m300ddedinbcb2 = new FieldDef("m300ddedinbcb2",FieldDef.FLOAT,6,0);
            m300ddedinbcc2 = new FieldDef("m300ddedinbcc2",FieldDef.FLOAT,6,0);
            m300ddedinbcb3 = new FieldDef("m300ddedinbcb3",FieldDef.FLOAT,6,0);
            m300ddedinbcc3 = new FieldDef("m300ddedinbcc3",FieldDef.FLOAT,6,0);
            m300ddedinbib = new FieldDef("m300ddedinbib",FieldDef.FLOAT,6,0);
            m300ddedinbic = new FieldDef("m300ddedinbic",FieldDef.FLOAT,6,0);
            m300ddedinbib1 = new FieldDef("m300ddedinbib1",FieldDef.FLOAT,6,0);
            m300ddedinbic1 = new FieldDef("m300ddedinbic1",FieldDef.FLOAT,6,0);
            m300ddedinbib2 = new FieldDef("m300ddedinbib2",FieldDef.FLOAT,6,0);
            m300ddedinbic2 = new FieldDef("m300ddedinbic2",FieldDef.FLOAT,6,0);
            m300ddedinbib3 = new FieldDef("m300ddedinbib3",FieldDef.FLOAT,6,0);
            m300ddedinbic3 = new FieldDef("m300ddedinbic3",FieldDef.FLOAT,6,0);
            m300ddedimbcb = new FieldDef("m300ddedimbcb",FieldDef.FLOAT,6,0);
            m300ddedimbcc = new FieldDef("m300ddedimbcc",FieldDef.FLOAT,6,0);
            m300ddedimbcb1 = new FieldDef("m300ddedimbcb1",FieldDef.FLOAT,6,0);
            m300ddedimbcc1 = new FieldDef("m300ddedimbcc1",FieldDef.FLOAT,6,0);
            m300ddedimbcb2 = new FieldDef("m300ddedimbcb2",FieldDef.FLOAT,6,0);
            m300ddedimbcc2 = new FieldDef("m300ddedimbcc2",FieldDef.FLOAT,6,0);
            m300ddedimbcb3 = new FieldDef("m300ddedimbcb3",FieldDef.FLOAT,6,0);
            m300ddedimbcc3 = new FieldDef("m300ddedimbcc3",FieldDef.FLOAT,6,0);
            m300ddedimbib = new FieldDef("m300ddedimbib",FieldDef.FLOAT,6,0);
            m300ddedimbic = new FieldDef("m300ddedimbic",FieldDef.FLOAT,6,0);
            m300ddedimbib1 = new FieldDef("m300ddedimbib1",FieldDef.FLOAT,6,0);
            m300ddedimbic1 = new FieldDef("m300ddedimbic1",FieldDef.FLOAT,6,0);
            m300ddedimbib2 = new FieldDef("m300ddedimbib2",FieldDef.FLOAT,6,0);
            m300ddedimbic2 = new FieldDef("m300ddedimbic2",FieldDef.FLOAT,6,0);
            m300ddedimbib3 = new FieldDef("m300ddedimbib3",FieldDef.FLOAT,6,0);
            m300ddedimbic3 = new FieldDef("m300ddedimbic3",FieldDef.FLOAT,6,0);
            m300ddedadbcb = new FieldDef("m300ddedadbcb",FieldDef.FLOAT,6,0);
            m300ddedadbcc = new FieldDef("m300ddedadbcc",FieldDef.FLOAT,6,0);
            m300ddedadbcb1 = new FieldDef("m300ddedadbcb1",FieldDef.FLOAT,6,0);
            m300ddedadbcc1 = new FieldDef("m300ddedadbcc1",FieldDef.FLOAT,6,0);
            m300ddedadbcb2 = new FieldDef("m300ddedadbcb2",FieldDef.FLOAT,6,0);
            m300ddedadbcc2 = new FieldDef("m300ddedadbcc2",FieldDef.FLOAT,6,0);
            m300ddedadbcb3 = new FieldDef("m300ddedadbcb3",FieldDef.FLOAT,6,0);
            m300ddedadbcc3 = new FieldDef("m300ddedadbcc3",FieldDef.FLOAT,6,0);
            m300ddedadbib = new FieldDef("m300ddedadbib",FieldDef.FLOAT,6,0);
            m300ddedadbic = new FieldDef("m300ddedadbic",FieldDef.FLOAT,6,0);
            m300ddedadbib1 = new FieldDef("m300ddedadbib1",FieldDef.FLOAT,6,0);
            m300ddedadbic1 = new FieldDef("m300ddedadbic1",FieldDef.FLOAT,6,0);
            m300ddedadbib2 = new FieldDef("m300ddedadbib2",FieldDef.FLOAT,6,0);
            m300ddedadbic2 = new FieldDef("m300ddedadbic2",FieldDef.FLOAT,6,0);
            m300ddedadbib3 = new FieldDef("m300ddedadbib3",FieldDef.FLOAT,6,0);
            m300ddedadbic3 = new FieldDef("m300ddedadbic3",FieldDef.FLOAT,6,0);
            m300ddedragp = new FieldDef("m300ddedragp",FieldDef.FLOAT,6,0);
            m300ddedragpb = new FieldDef("m300ddedragpb",FieldDef.FLOAT,6,0);
            m300ddedrinv = new FieldDef("m300ddedrinv",FieldDef.FLOAT,6,0);
            m300drectifdedu = new FieldDef("m300drectifdedu",FieldDef.FLOAT,6,0);
            m300dvoloper = new FieldDef("m300dvoloper",FieldDef.FLOAT,6,0);
            m300dvoloperdd = new FieldDef("m300dvoloperdd",FieldDef.FLOAT,6,0);
            m300ddevregorb1 = new FieldDef("m300ddevregorb1",FieldDef.FLOAT,6,0);
            m300ddevregorb2 = new FieldDef("m300ddevregorb2",FieldDef.FLOAT,6,0);
            m300ddevregorb3 = new FieldDef("m300ddevregorb3",FieldDef.FLOAT,6,0);
            m300ddevregorq1 = new FieldDef("m300ddevregorq1",FieldDef.FLOAT,6,0);
            m300ddevregorq2 = new FieldDef("m300ddevregorq2",FieldDef.FLOAT,6,0);
            m300ddevregorq3 = new FieldDef("m300ddevregorq3",FieldDef.FLOAT,6,0);
            m300ddevbieusb1 = new FieldDef("m300ddevbieusb1",FieldDef.FLOAT,6,0);
            m300ddevbieusc1 = new FieldDef("m300ddevbieusc1",FieldDef.FLOAT,6,0);
            m300ddevbieusb2 = new FieldDef("m300ddevbieusb2",FieldDef.FLOAT,6,0);
            m300ddevbieusc2 = new FieldDef("m300ddevbieusc2",FieldDef.FLOAT,6,0);
            m300ddevbieusb3 = new FieldDef("m300ddevbieusb3",FieldDef.FLOAT,6,0);
            m300ddevbieusc3 = new FieldDef("m300ddevbieusc3",FieldDef.FLOAT,6,0);
            m300ddevagviab = new FieldDef("m300ddevagviab",FieldDef.FLOAT,6,0);
            m300ddevagviac = new FieldDef("m300ddevagviac",FieldDef.FLOAT,6,0);
            m300ddevmodbcb1 = new FieldDef("m300ddevmodbcb1",FieldDef.FLOAT,6,0);
            m300ddevmodbcc1 = new FieldDef("m300ddevmodbcc1",FieldDef.FLOAT,6,0);
            m300ddevmodbcb2 = new FieldDef("m300ddevmodbcb2",FieldDef.FLOAT,6,0);
            m300ddevmodbcc2 = new FieldDef("m300ddevmodbcc2",FieldDef.FLOAT,6,0);
            m300ddevmodbcb3 = new FieldDef("m300ddevmodbcb3",FieldDef.FLOAT,6,0);
            m300ddevmodbcc3 = new FieldDef("m300ddevmodbcc3",FieldDef.FLOAT,6,0);
            m300ddevreceqb1 = new FieldDef("m300ddevreceqb1",FieldDef.FLOAT,6,0);
            m300ddevreceqc1 = new FieldDef("m300ddevreceqc1",FieldDef.FLOAT,6,0);
            m300ddevreceqb2 = new FieldDef("m300ddevreceqb2",FieldDef.FLOAT,6,0);
            m300ddevreceqc2 = new FieldDef("m300ddevreceqc2",FieldDef.FLOAT,6,0);
            m300ddevreceqb3 = new FieldDef("m300ddevreceqb3",FieldDef.FLOAT,6,0);
            m300ddevreceqc3 = new FieldDef("m300ddevreceqc3",FieldDef.FLOAT,6,0);
            m300ddevreceqb4 = new FieldDef("m300ddevreceqb4",FieldDef.FLOAT,6,0);
            m300ddevreceqc4 = new FieldDef("m300ddevreceqc4",FieldDef.FLOAT,6,0);
            m300ddevmodreb1 = new FieldDef("m300ddevmodreb1",FieldDef.FLOAT,6,0);
            m300ddevmodrec1 = new FieldDef("m300ddevmodrec1",FieldDef.FLOAT,6,0);
            m300ddevmodreb2 = new FieldDef("m300ddevmodreb2",FieldDef.FLOAT,6,0);
            m300ddevmodrec2 = new FieldDef("m300ddevmodrec2",FieldDef.FLOAT,6,0);
            m300ddevmodreb3 = new FieldDef("m300ddevmodreb3",FieldDef.FLOAT,6,0);
            m300ddevmodrec3 = new FieldDef("m300ddevmodrec3",FieldDef.FLOAT,6,0);
            m300ddevmodreb4 = new FieldDef("m300ddevmodreb4",FieldDef.FLOAT,6,0);
            m300ddevmodrec4 = new FieldDef("m300ddevmodrec4",FieldDef.FLOAT,6,0);
            m300ddedoirceqb = new FieldDef("m300ddedoirceqb",FieldDef.FLOAT,6,0);
            m300ddedoirceqq = new FieldDef("m300ddedoirceqq",FieldDef.FLOAT,6,0);
            m300ddedimrceqb = new FieldDef("m300ddedimrceqb",FieldDef.FLOAT,6,0);
            m300ddedimrceqq = new FieldDef("m300ddedimrceqq",FieldDef.FLOAT,6,0);
            m300ddedairceqb = new FieldDef("m300ddedairceqb",FieldDef.FLOAT,6,0);
            m300ddedairceqq = new FieldDef("m300ddedairceqq",FieldDef.FLOAT,6,0);
            m300ddedcmrceqb = new FieldDef("m300ddedcmrceqb",FieldDef.FLOAT,6,0);
            m300ddedcmrceqq = new FieldDef("m300ddedcmrceqq",FieldDef.FLOAT,6,0);
            m300ddeventbas = new FieldDef("m300ddeventbas",FieldDef.FLOAT,6,0);
            m300ddevexpbas = new FieldDef("m300ddevexpbas",FieldDef.FLOAT,6,0);
            m300ddevoexbas = new FieldDef("m300ddevoexbas",FieldDef.FLOAT,6,0);
            m300ddevosdbas = new FieldDef("m300ddevosdbas",FieldDef.FLOAT,6,0);
            m300ddevondbas = new FieldDef("m300ddevondbas",FieldDef.FLOAT,6,0);
            m300dliqiva = new FieldDef("m300dliqiva",FieldDef.CHAR,1);
            m300ddevopintb1 = new FieldDef("m300ddevopintb1",FieldDef.FLOAT,6,0);
            m300ddevopintq1 = new FieldDef("m300ddevopintq1",FieldDef.FLOAT,6,0);
            m300ddevopintb2 = new FieldDef("m300ddevopintb2",FieldDef.FLOAT,6,0);
            m300ddevopintq2 = new FieldDef("m300ddevopintq2",FieldDef.FLOAT,6,0);
            m300ddevopintb3 = new FieldDef("m300ddevopintb3",FieldDef.FLOAT,6,0);
            m300ddevopintq3 = new FieldDef("m300ddevopintq3",FieldDef.FLOAT,6,0);
            m300ddedinscb1 = new FieldDef("m300ddedinscb1",FieldDef.FLOAT,6,0);
            m300ddedinscc1 = new FieldDef("m300ddedinscc1",FieldDef.FLOAT,6,0);
            m300ddedinscb2 = new FieldDef("m300ddedinscb2",FieldDef.FLOAT,6,0);
            m300ddedinscc2 = new FieldDef("m300ddedinscc2",FieldDef.FLOAT,6,0);
            m300ddedinscb3 = new FieldDef("m300ddedinscb3",FieldDef.FLOAT,6,0);
            m300ddedinscc3 = new FieldDef("m300ddedinscc3",FieldDef.FLOAT,6,0);
            m300ddedinscb = new FieldDef("m300ddedinscb",FieldDef.FLOAT,6,0);
            m300ddedinscc = new FieldDef("m300ddedinscc",FieldDef.FLOAT,6,0);
            m300ddediibib1 = new FieldDef("m300ddediibib1",FieldDef.FLOAT,6,0);
            m300ddediibic1 = new FieldDef("m300ddediibic1",FieldDef.FLOAT,6,0);
            m300ddediibib2 = new FieldDef("m300ddediibib2",FieldDef.FLOAT,6,0);
            m300ddediibic2 = new FieldDef("m300ddediibic2",FieldDef.FLOAT,6,0);
            m300ddediibib3 = new FieldDef("m300ddediibib3",FieldDef.FLOAT,6,0);
            m300ddediibic3 = new FieldDef("m300ddediibic3",FieldDef.FLOAT,6,0);
            m300ddediibib = new FieldDef("m300ddediibib",FieldDef.FLOAT,6,0);
            m300ddediibic = new FieldDef("m300ddediibic",FieldDef.FLOAT,6,0);
            m300ddedoieqbib = new FieldDef("m300ddedoieqbib",FieldDef.FLOAT,6,0);
            m300ddedoieqbiq = new FieldDef("m300ddedoieqbiq",FieldDef.FLOAT,6,0);
            m300ddedimeqbib = new FieldDef("m300ddedimeqbib",FieldDef.FLOAT,6,0);
            m300ddedimeqbiq = new FieldDef("m300ddedimeqbiq",FieldDef.FLOAT,6,0);
            m300ddedaieqbib = new FieldDef("m300ddedaieqbib",FieldDef.FLOAT,6,0);
            m300ddedaieqbiq = new FieldDef("m300ddedaieqbiq",FieldDef.FLOAT,6,0);
            m300ddeviservb1 = new FieldDef("m300ddeviservb1",FieldDef.FLOAT,6,0);
            m300ddeviservc1 = new FieldDef("m300ddeviservc1",FieldDef.FLOAT,6,0);
            m300ddeviservb2 = new FieldDef("m300ddeviservb2",FieldDef.FLOAT,6,0);
            m300ddeviservc2 = new FieldDef("m300ddeviservc2",FieldDef.FLOAT,6,0);
            m300ddeviservb3 = new FieldDef("m300ddeviservb3",FieldDef.FLOAT,6,0);
            m300ddeviservc3 = new FieldDef("m300ddeviservc3",FieldDef.FLOAT,6,0);
            m300ddediservb1 = new FieldDef("m300ddediservb1",FieldDef.FLOAT,6,0);
            m300ddediservc1 = new FieldDef("m300ddediservc1",FieldDef.FLOAT,6,0);
            m300ddediservb2 = new FieldDef("m300ddediservb2",FieldDef.FLOAT,6,0);
            m300ddediservc2 = new FieldDef("m300ddediservc2",FieldDef.FLOAT,6,0);
            m300ddediservb3 = new FieldDef("m300ddediservb3",FieldDef.FLOAT,6,0);
            m300ddediservc3 = new FieldDef("m300ddediservc3",FieldDef.FLOAT,6,0);
            m300ddediservb = new FieldDef("m300ddediservb",FieldDef.FLOAT,6,0);
            m300ddediservc = new FieldDef("m300ddediservc",FieldDef.FLOAT,6,0);
            m300ddevadqbas4 = new FieldDef("m300ddevadqbas4",FieldDef.FLOAT,6,0);
            m300ddevadqquo4 = new FieldDef("m300ddevadqquo4",FieldDef.FLOAT,6,0);
            m300ddevadqbas5 = new FieldDef("m300ddevadqbas5",FieldDef.FLOAT,6,0);
            m300ddevadqquo5 = new FieldDef("m300ddevadqquo5",FieldDef.FLOAT,6,0);
            m300ddevinvspb4 = new FieldDef("m300ddevinvspb4",FieldDef.FLOAT,6,0);
            m300ddevinvspc4 = new FieldDef("m300ddevinvspc4",FieldDef.FLOAT,6,0);
            m300ddevinvspb5 = new FieldDef("m300ddevinvspb5",FieldDef.FLOAT,6,0);
            m300ddevinvspc5 = new FieldDef("m300ddevinvspc5",FieldDef.FLOAT,6,0);
            m300ddevmdbcqb4 = new FieldDef("m300ddevmdbcqb4",FieldDef.FLOAT,6,0);
            m300ddevmdbcqc4 = new FieldDef("m300ddevmdbcqc4",FieldDef.FLOAT,6,0);
            m300ddevmdbcqb5 = new FieldDef("m300ddevmdbcqb5",FieldDef.FLOAT,6,0);
            m300ddevmdbcqc5 = new FieldDef("m300ddevmdbcqc5",FieldDef.FLOAT,6,0);
            m300ddedinbcb4 = new FieldDef("m300ddedinbcb4",FieldDef.FLOAT,6,0);
            m300ddedinbcc4 = new FieldDef("m300ddedinbcc4",FieldDef.FLOAT,6,0);
            m300ddedinbcb5 = new FieldDef("m300ddedinbcb5",FieldDef.FLOAT,6,0);
            m300ddedinbcc5 = new FieldDef("m300ddedinbcc5",FieldDef.FLOAT,6,0);
            m300ddedinbib4 = new FieldDef("m300ddedinbib4",FieldDef.FLOAT,6,0);
            m300ddedinbic4 = new FieldDef("m300ddedinbic4",FieldDef.FLOAT,6,0);
            m300ddedinbib5 = new FieldDef("m300ddedinbib5",FieldDef.FLOAT,6,0);
            m300ddedinbic5 = new FieldDef("m300ddedinbic5",FieldDef.FLOAT,6,0);
            m300ddedimbcb4 = new FieldDef("m300ddedimbcb4",FieldDef.FLOAT,6,0);
            m300ddedimbcc4 = new FieldDef("m300ddedimbcc4",FieldDef.FLOAT,6,0);
            m300ddedimbcb5 = new FieldDef("m300ddedimbcb5",FieldDef.FLOAT,6,0);
            m300ddedimbcc5 = new FieldDef("m300ddedimbcc5",FieldDef.FLOAT,6,0);
            m300ddedimbib4 = new FieldDef("m300ddedimbib4",FieldDef.FLOAT,6,0);
            m300ddedimbic4 = new FieldDef("m300ddedimbic4",FieldDef.FLOAT,6,0);
            m300ddedimbib5 = new FieldDef("m300ddedimbib5",FieldDef.FLOAT,6,0);
            m300ddedimbic5 = new FieldDef("m300ddedimbic5",FieldDef.FLOAT,6,0);
            m300ddedadbcb4 = new FieldDef("m300ddedadbcb4",FieldDef.FLOAT,6,0);
            m300ddedadbcc4 = new FieldDef("m300ddedadbcc4",FieldDef.FLOAT,6,0);
            m300ddedadbcb5 = new FieldDef("m300ddedadbcb5",FieldDef.FLOAT,6,0);
            m300ddedadbcc5 = new FieldDef("m300ddedadbcc5",FieldDef.FLOAT,6,0);
            m300ddedadbib4 = new FieldDef("m300ddedadbib4",FieldDef.FLOAT,6,0);
            m300ddedadbic4 = new FieldDef("m300ddedadbic4",FieldDef.FLOAT,6,0);
            m300ddedadbib5 = new FieldDef("m300ddedadbib5",FieldDef.FLOAT,6,0);
            m300ddedadbic5 = new FieldDef("m300ddedadbic5",FieldDef.FLOAT,6,0);
            m300ddevregorb4 = new FieldDef("m300ddevregorb4",FieldDef.FLOAT,6,0);
            m300ddevregorb5 = new FieldDef("m300ddevregorb5",FieldDef.FLOAT,6,0);
            m300ddevregorq4 = new FieldDef("m300ddevregorq4",FieldDef.FLOAT,6,0);
            m300ddevregorq5 = new FieldDef("m300ddevregorq5",FieldDef.FLOAT,6,0);
            m300ddevbieusb4 = new FieldDef("m300ddevbieusb4",FieldDef.FLOAT,6,0);
            m300ddevbieusc4 = new FieldDef("m300ddevbieusc4",FieldDef.FLOAT,6,0);
            m300ddevbieusb5 = new FieldDef("m300ddevbieusb5",FieldDef.FLOAT,6,0);
            m300ddevbieusc5 = new FieldDef("m300ddevbieusc5",FieldDef.FLOAT,6,0);
            m300ddevmodbcb4 = new FieldDef("m300ddevmodbcb4",FieldDef.FLOAT,6,0);
            m300ddevmodbcc4 = new FieldDef("m300ddevmodbcc4",FieldDef.FLOAT,6,0);
            m300ddevmodbcb5 = new FieldDef("m300ddevmodbcb5",FieldDef.FLOAT,6,0);
            m300ddevmodbcc5 = new FieldDef("m300ddevmodbcc5",FieldDef.FLOAT,6,0);
            m300ddevopintb4 = new FieldDef("m300ddevopintb4",FieldDef.FLOAT,6,0);
            m300ddevopintq4 = new FieldDef("m300ddevopintq4",FieldDef.FLOAT,6,0);
            m300ddevopintb5 = new FieldDef("m300ddevopintb5",FieldDef.FLOAT,6,0);
            m300ddevopintq5 = new FieldDef("m300ddevopintq5",FieldDef.FLOAT,6,0);
            m300ddedinscb4 = new FieldDef("m300ddedinscb4",FieldDef.FLOAT,6,0);
            m300ddedinscc4 = new FieldDef("m300ddedinscc4",FieldDef.FLOAT,6,0);
            m300ddedinscb5 = new FieldDef("m300ddedinscb5",FieldDef.FLOAT,6,0);
            m300ddedinscc5 = new FieldDef("m300ddedinscc5",FieldDef.FLOAT,6,0);
            m300ddediibib4 = new FieldDef("m300ddediibib4",FieldDef.FLOAT,6,0);
            m300ddediibic4 = new FieldDef("m300ddediibic4",FieldDef.FLOAT,6,0);
            m300ddediibib5 = new FieldDef("m300ddediibib5",FieldDef.FLOAT,6,0);
            m300ddediibic5 = new FieldDef("m300ddediibic5",FieldDef.FLOAT,6,0);
            m300ddeviservb4 = new FieldDef("m300ddeviservb4",FieldDef.FLOAT,6,0);
            m300ddeviservc4 = new FieldDef("m300ddeviservc4",FieldDef.FLOAT,6,0);
            m300ddeviservb5 = new FieldDef("m300ddeviservb5",FieldDef.FLOAT,6,0);
            m300ddeviservc5 = new FieldDef("m300ddeviservc5",FieldDef.FLOAT,6,0);
            m300ddediservb4 = new FieldDef("m300ddediservb4",FieldDef.FLOAT,6,0);
            m300ddediservc4 = new FieldDef("m300ddediservc4",FieldDef.FLOAT,6,0);
            m300ddediservb5 = new FieldDef("m300ddediservb5",FieldDef.FLOAT,6,0);
            m300ddediservc5 = new FieldDef("m300ddediservc5",FieldDef.FLOAT,6,0);
            m300ddevagviab2 = new FieldDef("m300ddevagviab2",FieldDef.FLOAT,6,0);
            m300ddevagviac2 = new FieldDef("m300ddevagviac2",FieldDef.FLOAT,6,0);
            m300dregart80 = new FieldDef("m300dregart80",FieldDef.FLOAT,6,0);
            m300daduana = new FieldDef("m300daduana",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m300ddominio,
                m300dnif,
                m300dejercicio,
                m300dperiodo,
                m300dgrupo,
                m300dactividad,
                m300ddevadqbas1,
                m300ddevadqquo1,
                m300ddevadqbas2,
                m300ddevadqquo2,
                m300ddevadqbas3,
                m300ddevadqquo3,
                m300ddevinvspb1,
                m300ddevinvspc1,
                m300ddevinvspb2,
                m300ddevinvspc2,
                m300ddevinvspb3,
                m300ddevinvspc3,
                m300ddevmodbycb,
                m300ddevmodbycc,
                m300ddevmdbcqb1,
                m300ddevmdbcqc1,
                m300ddevmdbcqb2,
                m300ddevmdbcqc2,
                m300ddevmdbcqb3,
                m300ddevmdbcqc3,
                m300ddevmodrecb,
                m300ddevmodrecc,
                m300ddevmdreqb1,
                m300ddevmdreqc1,
                m300ddevmdreqb2,
                m300ddevmdreqc2,
                m300ddevmdreqb3,
                m300ddevmdreqc3,
                m300ddevmdreqb4,
                m300ddevmdreqc4,
                m300ddedinbcb,
                m300ddedinbcc,
                m300ddedinbcb1,
                m300ddedinbcc1,
                m300ddedinbcb2,
                m300ddedinbcc2,
                m300ddedinbcb3,
                m300ddedinbcc3,
                m300ddedinbib,
                m300ddedinbic,
                m300ddedinbib1,
                m300ddedinbic1,
                m300ddedinbib2,
                m300ddedinbic2,
                m300ddedinbib3,
                m300ddedinbic3,
                m300ddedimbcb,
                m300ddedimbcc,
                m300ddedimbcb1,
                m300ddedimbcc1,
                m300ddedimbcb2,
                m300ddedimbcc2,
                m300ddedimbcb3,
                m300ddedimbcc3,
                m300ddedimbib,
                m300ddedimbic,
                m300ddedimbib1,
                m300ddedimbic1,
                m300ddedimbib2,
                m300ddedimbic2,
                m300ddedimbib3,
                m300ddedimbic3,
                m300ddedadbcb,
                m300ddedadbcc,
                m300ddedadbcb1,
                m300ddedadbcc1,
                m300ddedadbcb2,
                m300ddedadbcc2,
                m300ddedadbcb3,
                m300ddedadbcc3,
                m300ddedadbib,
                m300ddedadbic,
                m300ddedadbib1,
                m300ddedadbic1,
                m300ddedadbib2,
                m300ddedadbic2,
                m300ddedadbib3,
                m300ddedadbic3,
                m300ddedragp,
                m300ddedragpb,
                m300ddedrinv,
                m300drectifdedu,
                m300dvoloper,
                m300dvoloperdd,
                m300ddevregorb1,
                m300ddevregorb2,
                m300ddevregorb3,
                m300ddevregorq1,
                m300ddevregorq2,
                m300ddevregorq3,
                m300ddevbieusb1,
                m300ddevbieusc1,
                m300ddevbieusb2,
                m300ddevbieusc2,
                m300ddevbieusb3,
                m300ddevbieusc3,
                m300ddevagviab,
                m300ddevagviac,
                m300ddevmodbcb1,
                m300ddevmodbcc1,
                m300ddevmodbcb2,
                m300ddevmodbcc2,
                m300ddevmodbcb3,
                m300ddevmodbcc3,
                m300ddevreceqb1,
                m300ddevreceqc1,
                m300ddevreceqb2,
                m300ddevreceqc2,
                m300ddevreceqb3,
                m300ddevreceqc3,
                m300ddevreceqb4,
                m300ddevreceqc4,
                m300ddevmodreb1,
                m300ddevmodrec1,
                m300ddevmodreb2,
                m300ddevmodrec2,
                m300ddevmodreb3,
                m300ddevmodrec3,
                m300ddevmodreb4,
                m300ddevmodrec4,
                m300ddedoirceqb,
                m300ddedoirceqq,
                m300ddedimrceqb,
                m300ddedimrceqq,
                m300ddedairceqb,
                m300ddedairceqq,
                m300ddedcmrceqb,
                m300ddedcmrceqq,
                m300ddeventbas,
                m300ddevexpbas,
                m300ddevoexbas,
                m300ddevosdbas,
                m300ddevondbas,
                m300dliqiva,
                m300ddevopintb1,
                m300ddevopintq1,
                m300ddevopintb2,
                m300ddevopintq2,
                m300ddevopintb3,
                m300ddevopintq3,
                m300ddedinscb1,
                m300ddedinscc1,
                m300ddedinscb2,
                m300ddedinscc2,
                m300ddedinscb3,
                m300ddedinscc3,
                m300ddedinscb,
                m300ddedinscc,
                m300ddediibib1,
                m300ddediibic1,
                m300ddediibib2,
                m300ddediibic2,
                m300ddediibib3,
                m300ddediibic3,
                m300ddediibib,
                m300ddediibic,
                m300ddedoieqbib,
                m300ddedoieqbiq,
                m300ddedimeqbib,
                m300ddedimeqbiq,
                m300ddedaieqbib,
                m300ddedaieqbiq,
                m300ddeviservb1,
                m300ddeviservc1,
                m300ddeviservb2,
                m300ddeviservc2,
                m300ddeviservb3,
                m300ddeviservc3,
                m300ddediservb1,
                m300ddediservc1,
                m300ddediservb2,
                m300ddediservc2,
                m300ddediservb3,
                m300ddediservc3,
                m300ddediservb,
                m300ddediservc,
                m300ddevadqbas4,
                m300ddevadqquo4,
                m300ddevadqbas5,
                m300ddevadqquo5,
                m300ddevinvspb4,
                m300ddevinvspc4,
                m300ddevinvspb5,
                m300ddevinvspc5,
                m300ddevmdbcqb4,
                m300ddevmdbcqc4,
                m300ddevmdbcqb5,
                m300ddevmdbcqc5,
                m300ddedinbcb4,
                m300ddedinbcc4,
                m300ddedinbcb5,
                m300ddedinbcc5,
                m300ddedinbib4,
                m300ddedinbic4,
                m300ddedinbib5,
                m300ddedinbic5,
                m300ddedimbcb4,
                m300ddedimbcc4,
                m300ddedimbcb5,
                m300ddedimbcc5,
                m300ddedimbib4,
                m300ddedimbic4,
                m300ddedimbib5,
                m300ddedimbic5,
                m300ddedadbcb4,
                m300ddedadbcc4,
                m300ddedadbcb5,
                m300ddedadbcc5,
                m300ddedadbib4,
                m300ddedadbic4,
                m300ddedadbib5,
                m300ddedadbic5,
                m300ddevregorb4,
                m300ddevregorb5,
                m300ddevregorq4,
                m300ddevregorq5,
                m300ddevbieusb4,
                m300ddevbieusc4,
                m300ddevbieusb5,
                m300ddevbieusc5,
                m300ddevmodbcb4,
                m300ddevmodbcc4,
                m300ddevmodbcb5,
                m300ddevmodbcc5,
                m300ddevopintb4,
                m300ddevopintq4,
                m300ddevopintb5,
                m300ddevopintq5,
                m300ddedinscb4,
                m300ddedinscc4,
                m300ddedinscb5,
                m300ddedinscc5,
                m300ddediibib4,
                m300ddediibic4,
                m300ddediibib5,
                m300ddediibic5,
                m300ddeviservb4,
                m300ddeviservc4,
                m300ddeviservb5,
                m300ddeviservc5,
                m300ddediservb4,
                m300ddediservc4,
                m300ddediservb5,
                m300ddediservc5,
                m300ddevagviab2,
                m300ddevagviac2,
                m300dregart80,
                m300daduana                
                };
            setColumns(array);
            FieldDef arrayf[] = {m300ddominio,m300dnif,m300dejercicio,m300dperiodo,m300dgrupo,m300dactividad };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod300desb extends TableDef
        {
        // campos
        public FieldDef m300bdominio;
        public FieldDef m300bnif;
        public FieldDef m300bejercicio;
        public FieldDef m300bperiodo;
        public FieldDef m300bgrupo;
        public FieldDef m300bactividad;
        public FieldDef m300bdevreceqb5;
        public FieldDef m300bdevreceqc5;
        public FieldDef m300bdevreceqb6;
        public FieldDef m300bdevreceqc6;
        public FieldDef m300bdevmodreb5;
        public FieldDef m300bdevmodrec5;
        public FieldDef m300bdevmodreb6;
        public FieldDef m300bdevmodrec6;
        public FieldDef m300bdevmdreqb5;
        public FieldDef m300bdevmdreqc5;
        public FieldDef m300bdevmdreqb6;
        public FieldDef m300bdevmdreqc6;
        public FieldDef m300bliqiva;
        public TabMod300desb(String name)
            {
            super(name);
            m300bdominio = new FieldDef("m300bdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m300bnif = new FieldDef("m300bnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m300bejercicio = new FieldDef("m300bejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m300bperiodo = new FieldDef("m300bperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m300bgrupo = new FieldDef("m300bgrupo",FieldDef.CHAR,1,FieldDef.NOTNULL);
            m300bactividad = new FieldDef("m300bactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m300bdevreceqb5 = new FieldDef("m300bdevreceqb5",FieldDef.FLOAT,6,0);
            m300bdevreceqc5 = new FieldDef("m300bdevreceqc5",FieldDef.FLOAT,6,0);
            m300bdevreceqb6 = new FieldDef("m300bdevreceqb6",FieldDef.FLOAT,6,0);
            m300bdevreceqc6 = new FieldDef("m300bdevreceqc6",FieldDef.FLOAT,6,0);
            m300bdevmodreb5 = new FieldDef("m300bdevmodreb5",FieldDef.FLOAT,6,0);
            m300bdevmodrec5 = new FieldDef("m300bdevmodrec5",FieldDef.FLOAT,6,0);
            m300bdevmodreb6 = new FieldDef("m300bdevmodreb6",FieldDef.FLOAT,6,0);
            m300bdevmodrec6 = new FieldDef("m300bdevmodrec6",FieldDef.FLOAT,6,0);
            m300bdevmdreqb5 = new FieldDef("m300bdevmdreqb5",FieldDef.FLOAT,6,0);
            m300bdevmdreqc5 = new FieldDef("m300bdevmdreqc5",FieldDef.FLOAT,6,0);
            m300bdevmdreqb6 = new FieldDef("m300bdevmdreqb6",FieldDef.FLOAT,6,0);
            m300bdevmdreqc6 = new FieldDef("m300bdevmdreqc6",FieldDef.FLOAT,6,0);
            m300bliqiva = new FieldDef("m300bliqiva",FieldDef.CHAR,1);
            FieldDef array[] = {
                m300bdominio,
                m300bnif,
                m300bejercicio,
                m300bperiodo,
                m300bgrupo,
                m300bactividad,
                m300bdevreceqb5,
                m300bdevreceqc5,
                m300bdevreceqb6,
                m300bdevreceqc6,
                m300bdevmodreb5,
                m300bdevmodrec5,
                m300bdevmodreb6,
                m300bdevmodrec6,
                m300bdevmdreqb5,
                m300bdevmdreqc5,
                m300bdevmdreqb6,
                m300bdevmdreqc6,
                m300bliqiva                
                };
            setColumns(array);
            FieldDef arrayf[] = {m300bdominio,m300bnif,m300bejercicio,m300bperiodo,m300bgrupo,m300bactividad };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod300pro extends TableDef
        {
        // campos
        public FieldDef mprodominio;
        public FieldDef mpronif;
        public FieldDef mproejercicio;
        public FieldDef mproperiodo;
        public FieldDef mproactividad;
        public FieldDef mproactdescrip;
        public FieldDef mprocnae;
        public FieldDef mprovoloper;
        public FieldDef mprovoloperdd;
        public FieldDef mprotipo;
        public FieldDef mproporcen;
        public FieldDef mprosopded;
        public FieldDef mprosoppror;
        public FieldDef mproporcendef;
        public FieldDef mpronoded;
        public TabMod300pro(String name)
            {
            super(name);
            mprodominio = new FieldDef("mprodominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            mpronif = new FieldDef("mpronif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mproejercicio = new FieldDef("mproejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mproperiodo = new FieldDef("mproperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mproactividad = new FieldDef("mproactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mproactdescrip = new FieldDef("mproactdescrip",FieldDef.CHAR,40);
            mprocnae = new FieldDef("mprocnae",FieldDef.CHAR,6);
            mprovoloper = new FieldDef("mprovoloper",FieldDef.FLOAT,6,0);
            mprovoloperdd = new FieldDef("mprovoloperdd",FieldDef.FLOAT,6,0);
            mprotipo = new FieldDef("mprotipo",FieldDef.CHAR,1);
            mproporcen = new FieldDef("mproporcen",FieldDef.FLOAT,6,0);
            mprosopded = new FieldDef("mprosopded",FieldDef.FLOAT,6,0);
            mprosoppror = new FieldDef("mprosoppror",FieldDef.FLOAT,6,0);
            mproporcendef = new FieldDef("mproporcendef",FieldDef.FLOAT,6,0);
            mpronoded = new FieldDef("mpronoded",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                mprodominio,
                mpronif,
                mproejercicio,
                mproperiodo,
                mproactividad,
                mproactdescrip,
                mprocnae,
                mprovoloper,
                mprovoloperdd,
                mprotipo,
                mproporcen,
                mprosopded,
                mprosoppror,
                mproporcendef,
                mpronoded                
                };
            setColumns(array);
            FieldDef arrayf[] = {mprodominio,mpronif,mproejercicio,mproperiodo,mproactividad };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod370 extends TableDef
        {
        // campos
        public FieldDef m370dominio;
        public FieldDef m370nif;
        public FieldDef m370ejercicio;
        public FieldDef m370periodo;
        public FieldDef m370deleg;
        public FieldDef m370admon;
        public FieldDef m370codadmon;
        public FieldDef m370apellidos;
        public FieldDef m370nombre;
        public FieldDef m370siglas;
        public FieldDef m370calle;
        public FieldDef m370numero;
        public FieldDef m370escalera;
        public FieldDef m370piso;
        public FieldDef m370puerta;
        public FieldDef m370cpostal;
        public FieldDef m370municipio;
        public FieldDef m370provincia;
        public FieldDef m370telefono;
        public FieldDef m370devivbase1;
        public FieldDef m370devivpor1;
        public FieldDef m370devivcuota1;
        public FieldDef m370devivbase2;
        public FieldDef m370devivpor2;
        public FieldDef m370devivcuota2;
        public FieldDef m370devivbase3;
        public FieldDef m370devivpor3;
        public FieldDef m370devivcuota3;
        public FieldDef m370devrebase1;
        public FieldDef m370devrepor1;
        public FieldDef m370devrecuota1;
        public FieldDef m370devrebase2;
        public FieldDef m370devrepor2;
        public FieldDef m370devrecuota2;
        public FieldDef m370devrebase3;
        public FieldDef m370devrepor3;
        public FieldDef m370devrecuota3;
        public FieldDef m370devadqbase;
        public FieldDef m370devadqquota;
        public FieldDef m370totcuotdev;
        public FieldDef m370dedopin;
        public FieldDef m370dedimpor;
        public FieldDef m370dedadq;
        public FieldDef m370dedopinb;
        public FieldDef m370dedimporb;
        public FieldDef m370dedadqb;
        public FieldDef m370dedragp;
        public FieldDef m370dedrinv;
        public FieldDef m370dedragpb;
        public FieldDef m370dedrinvb;
        public FieldDef m370totded;
        public FieldDef m370diferencia;
        public FieldDef m370modacteo1;
        public FieldDef m370epigrafe1;
        public FieldDef m370ingrsimpli1;
        public FieldDef m370modacteo2;
        public FieldDef m370epigrafe2;
        public FieldDef m370ingrsimpli2;
        public FieldDef m370modacteo3;
        public FieldDef m370epigrafe3;
        public FieldDef m370ingrsimpli3;
        public FieldDef m370modagriva1;
        public FieldDef m370descagric1;
        public FieldDef m370ingragric1;
        public FieldDef m370modagriva2;
        public FieldDef m370descagric2;
        public FieldDef m370ingragric2;
        public FieldDef m370modagriva3;
        public FieldDef m370descagric3;
        public FieldDef m370ingragric3;
        public FieldDef m370sumingresos;
        public FieldDef m370sumcuotder;
        public FieldDef m370sumingrejer;
        public FieldDef m370difcuotding;
        public FieldDef m370devadqintr;
        public FieldDef m370deventract;
        public FieldDef m370devinvers;
        public FieldDef m370regulbienes;
        public FieldDef m370totivadeduc;
        public FieldDef m370totcuotres;
        public FieldDef m370tdedactfijo;
        public FieldDef m370tdiferencia;
        public FieldDef m370sumaresults;
        public FieldDef m370cuotcompen;
        public FieldDef m370resdifcomp;
        public FieldDef m370impcomplem;
        public FieldDef m370entregas;
        public FieldDef m370resultado;
        public FieldDef m370impcompen;
        public FieldDef m370sinactiv;
        public FieldDef m370impdevol;
        public FieldDef m370entdevol;
        public FieldDef m370ofidevol;
        public FieldDef m370digidevol;
        public FieldDef m370ctadevol;
        public FieldDef m370cruzefec;
        public FieldDef m370cruzadeu;
        public FieldDef m370impingreso;
        public FieldDef m370entingreso;
        public FieldDef m370ofiingreso;
        public FieldDef m370digiingreso;
        public FieldDef m370ctaingreso;
        public FieldDef m370munifirma;
        public FieldDef m370dia;
        public FieldDef m370mes;
        public FieldDef m370anyo;
        public FieldDef m370fecha;
        public FieldDef m370percont;
        public FieldDef m370telcont;
        public FieldDef m370observa;
        public FieldDef m370letetiq;
        public FieldDef m370modelo;
        public FieldDef m370numjusti;
        public FieldDef m370cruzcompl;
        public FieldDef m370tipodecl;
        public FieldDef m370cruzccc;
        public TabMod370(String name)
            {
            super(name);
            m370dominio = new FieldDef("m370dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m370nif = new FieldDef("m370nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m370ejercicio = new FieldDef("m370ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m370periodo = new FieldDef("m370periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m370deleg = new FieldDef("m370deleg",FieldDef.CHAR,30);
            m370admon = new FieldDef("m370admon",FieldDef.CHAR,30);
            m370codadmon = new FieldDef("m370codadmon",FieldDef.INTEGER,0);
            m370apellidos = new FieldDef("m370apellidos",FieldDef.CHAR,30);
            m370nombre = new FieldDef("m370nombre",FieldDef.CHAR,15);
            m370siglas = new FieldDef("m370siglas",FieldDef.CHAR,2);
            m370calle = new FieldDef("m370calle",FieldDef.CHAR,17);
            m370numero = new FieldDef("m370numero",FieldDef.CHAR,4);
            m370escalera = new FieldDef("m370escalera",FieldDef.CHAR,2);
            m370piso = new FieldDef("m370piso",FieldDef.CHAR,2);
            m370puerta = new FieldDef("m370puerta",FieldDef.CHAR,2);
            m370cpostal = new FieldDef("m370cpostal",FieldDef.CHAR,5);
            m370municipio = new FieldDef("m370municipio",FieldDef.CHAR,20);
            m370provincia = new FieldDef("m370provincia",FieldDef.CHAR,15);
            m370telefono = new FieldDef("m370telefono",FieldDef.CHAR,9);
            m370devivbase1 = new FieldDef("m370devivbase1",FieldDef.FLOAT,6,0);
            m370devivpor1 = new FieldDef("m370devivpor1",FieldDef.FLOAT,6,0);
            m370devivcuota1 = new FieldDef("m370devivcuota1",FieldDef.FLOAT,6,0);
            m370devivbase2 = new FieldDef("m370devivbase2",FieldDef.FLOAT,6,0);
            m370devivpor2 = new FieldDef("m370devivpor2",FieldDef.FLOAT,6,0);
            m370devivcuota2 = new FieldDef("m370devivcuota2",FieldDef.FLOAT,6,0);
            m370devivbase3 = new FieldDef("m370devivbase3",FieldDef.FLOAT,6,0);
            m370devivpor3 = new FieldDef("m370devivpor3",FieldDef.FLOAT,6,0);
            m370devivcuota3 = new FieldDef("m370devivcuota3",FieldDef.FLOAT,6,0);
            m370devrebase1 = new FieldDef("m370devrebase1",FieldDef.FLOAT,6,0);
            m370devrepor1 = new FieldDef("m370devrepor1",FieldDef.FLOAT,6,0);
            m370devrecuota1 = new FieldDef("m370devrecuota1",FieldDef.FLOAT,6,0);
            m370devrebase2 = new FieldDef("m370devrebase2",FieldDef.FLOAT,6,0);
            m370devrepor2 = new FieldDef("m370devrepor2",FieldDef.FLOAT,6,0);
            m370devrecuota2 = new FieldDef("m370devrecuota2",FieldDef.FLOAT,6,0);
            m370devrebase3 = new FieldDef("m370devrebase3",FieldDef.FLOAT,6,0);
            m370devrepor3 = new FieldDef("m370devrepor3",FieldDef.FLOAT,6,0);
            m370devrecuota3 = new FieldDef("m370devrecuota3",FieldDef.FLOAT,6,0);
            m370devadqbase = new FieldDef("m370devadqbase",FieldDef.FLOAT,6,0);
            m370devadqquota = new FieldDef("m370devadqquota",FieldDef.FLOAT,6,0);
            m370totcuotdev = new FieldDef("m370totcuotdev",FieldDef.FLOAT,6,0);
            m370dedopin = new FieldDef("m370dedopin",FieldDef.FLOAT,6,0);
            m370dedimpor = new FieldDef("m370dedimpor",FieldDef.FLOAT,6,0);
            m370dedadq = new FieldDef("m370dedadq",FieldDef.FLOAT,6,0);
            m370dedopinb = new FieldDef("m370dedopinb",FieldDef.FLOAT,6,0);
            m370dedimporb = new FieldDef("m370dedimporb",FieldDef.FLOAT,6,0);
            m370dedadqb = new FieldDef("m370dedadqb",FieldDef.FLOAT,6,0);
            m370dedragp = new FieldDef("m370dedragp",FieldDef.FLOAT,6,0);
            m370dedrinv = new FieldDef("m370dedrinv",FieldDef.FLOAT,6,0);
            m370dedragpb = new FieldDef("m370dedragpb",FieldDef.FLOAT,6,0);
            m370dedrinvb = new FieldDef("m370dedrinvb",FieldDef.FLOAT,6,0);
            m370totded = new FieldDef("m370totded",FieldDef.FLOAT,6,0);
            m370diferencia = new FieldDef("m370diferencia",FieldDef.FLOAT,6,0);
            m370modacteo1 = new FieldDef("m370modacteo1",FieldDef.INTEGER,0);
            m370epigrafe1 = new FieldDef("m370epigrafe1",FieldDef.CHAR,7);
            m370ingrsimpli1 = new FieldDef("m370ingrsimpli1",FieldDef.FLOAT,6,0);
            m370modacteo2 = new FieldDef("m370modacteo2",FieldDef.INTEGER,0);
            m370epigrafe2 = new FieldDef("m370epigrafe2",FieldDef.CHAR,7);
            m370ingrsimpli2 = new FieldDef("m370ingrsimpli2",FieldDef.FLOAT,6,0);
            m370modacteo3 = new FieldDef("m370modacteo3",FieldDef.INTEGER,0);
            m370epigrafe3 = new FieldDef("m370epigrafe3",FieldDef.CHAR,7);
            m370ingrsimpli3 = new FieldDef("m370ingrsimpli3",FieldDef.FLOAT,6,0);
            m370modagriva1 = new FieldDef("m370modagriva1",FieldDef.INTEGER,0);
            m370descagric1 = new FieldDef("m370descagric1",FieldDef.CHAR,50);
            m370ingragric1 = new FieldDef("m370ingragric1",FieldDef.FLOAT,6,0);
            m370modagriva2 = new FieldDef("m370modagriva2",FieldDef.INTEGER,0);
            m370descagric2 = new FieldDef("m370descagric2",FieldDef.CHAR,50);
            m370ingragric2 = new FieldDef("m370ingragric2",FieldDef.FLOAT,6,0);
            m370modagriva3 = new FieldDef("m370modagriva3",FieldDef.INTEGER,0);
            m370descagric3 = new FieldDef("m370descagric3",FieldDef.CHAR,50);
            m370ingragric3 = new FieldDef("m370ingragric3",FieldDef.FLOAT,6,0);
            m370sumingresos = new FieldDef("m370sumingresos",FieldDef.FLOAT,6,0);
            m370sumcuotder = new FieldDef("m370sumcuotder",FieldDef.FLOAT,6,0);
            m370sumingrejer = new FieldDef("m370sumingrejer",FieldDef.FLOAT,6,0);
            m370difcuotding = new FieldDef("m370difcuotding",FieldDef.FLOAT,6,0);
            m370devadqintr = new FieldDef("m370devadqintr",FieldDef.FLOAT,6,0);
            m370deventract = new FieldDef("m370deventract",FieldDef.FLOAT,6,0);
            m370devinvers = new FieldDef("m370devinvers",FieldDef.FLOAT,6,0);
            m370regulbienes = new FieldDef("m370regulbienes",FieldDef.FLOAT,6,0);
            m370totivadeduc = new FieldDef("m370totivadeduc",FieldDef.FLOAT,6,0);
            m370totcuotres = new FieldDef("m370totcuotres",FieldDef.FLOAT,6,0);
            m370tdedactfijo = new FieldDef("m370tdedactfijo",FieldDef.FLOAT,6,0);
            m370tdiferencia = new FieldDef("m370tdiferencia",FieldDef.FLOAT,6,0);
            m370sumaresults = new FieldDef("m370sumaresults",FieldDef.FLOAT,6,0);
            m370cuotcompen = new FieldDef("m370cuotcompen",FieldDef.FLOAT,6,0);
            m370resdifcomp = new FieldDef("m370resdifcomp",FieldDef.FLOAT,6,0);
            m370impcomplem = new FieldDef("m370impcomplem",FieldDef.FLOAT,6,0);
            m370entregas = new FieldDef("m370entregas",FieldDef.FLOAT,6,0);
            m370resultado = new FieldDef("m370resultado",FieldDef.FLOAT,6,0);
            m370impcompen = new FieldDef("m370impcompen",FieldDef.FLOAT,6,0);
            m370sinactiv = new FieldDef("m370sinactiv",FieldDef.CHAR,1);
            m370impdevol = new FieldDef("m370impdevol",FieldDef.FLOAT,6,0);
            m370entdevol = new FieldDef("m370entdevol",FieldDef.CHAR,4);
            m370ofidevol = new FieldDef("m370ofidevol",FieldDef.CHAR,4);
            m370digidevol = new FieldDef("m370digidevol",FieldDef.CHAR,2);
            m370ctadevol = new FieldDef("m370ctadevol",FieldDef.CHAR,10);
            m370cruzefec = new FieldDef("m370cruzefec",FieldDef.CHAR,1);
            m370cruzadeu = new FieldDef("m370cruzadeu",FieldDef.CHAR,1);
            m370impingreso = new FieldDef("m370impingreso",FieldDef.FLOAT,6,0);
            m370entingreso = new FieldDef("m370entingreso",FieldDef.CHAR,4);
            m370ofiingreso = new FieldDef("m370ofiingreso",FieldDef.CHAR,4);
            m370digiingreso = new FieldDef("m370digiingreso",FieldDef.CHAR,2);
            m370ctaingreso = new FieldDef("m370ctaingreso",FieldDef.CHAR,10);
            m370munifirma = new FieldDef("m370munifirma",FieldDef.CHAR,30);
            m370dia = new FieldDef("m370dia",FieldDef.CHAR,2);
            m370mes = new FieldDef("m370mes",FieldDef.CHAR,10);
            m370anyo = new FieldDef("m370anyo",FieldDef.CHAR,4);
            m370fecha = new FieldDef("m370fecha",FieldDef.DATE);
            m370percont = new FieldDef("m370percont",FieldDef.CHAR,100);
            m370telcont = new FieldDef("m370telcont",FieldDef.CHAR,9);
            m370observa = new FieldDef("m370observa",FieldDef.CHAR,350);
            m370letetiq = new FieldDef("m370letetiq",FieldDef.CHAR,4);
            m370modelo = new FieldDef("m370modelo",FieldDef.CHAR,5);
            m370numjusti = new FieldDef("m370numjusti",FieldDef.CHAR,16);
            m370cruzcompl = new FieldDef("m370cruzcompl",FieldDef.CHAR,1);
            m370tipodecl = new FieldDef("m370tipodecl",FieldDef.CHAR,1);
            m370cruzccc = new FieldDef("m370cruzccc",FieldDef.CHAR,1);
            FieldDef array[] = {
                m370dominio,
                m370nif,
                m370ejercicio,
                m370periodo,
                m370deleg,
                m370admon,
                m370codadmon,
                m370apellidos,
                m370nombre,
                m370siglas,
                m370calle,
                m370numero,
                m370escalera,
                m370piso,
                m370puerta,
                m370cpostal,
                m370municipio,
                m370provincia,
                m370telefono,
                m370devivbase1,
                m370devivpor1,
                m370devivcuota1,
                m370devivbase2,
                m370devivpor2,
                m370devivcuota2,
                m370devivbase3,
                m370devivpor3,
                m370devivcuota3,
                m370devrebase1,
                m370devrepor1,
                m370devrecuota1,
                m370devrebase2,
                m370devrepor2,
                m370devrecuota2,
                m370devrebase3,
                m370devrepor3,
                m370devrecuota3,
                m370devadqbase,
                m370devadqquota,
                m370totcuotdev,
                m370dedopin,
                m370dedimpor,
                m370dedadq,
                m370dedopinb,
                m370dedimporb,
                m370dedadqb,
                m370dedragp,
                m370dedrinv,
                m370dedragpb,
                m370dedrinvb,
                m370totded,
                m370diferencia,
                m370modacteo1,
                m370epigrafe1,
                m370ingrsimpli1,
                m370modacteo2,
                m370epigrafe2,
                m370ingrsimpli2,
                m370modacteo3,
                m370epigrafe3,
                m370ingrsimpli3,
                m370modagriva1,
                m370descagric1,
                m370ingragric1,
                m370modagriva2,
                m370descagric2,
                m370ingragric2,
                m370modagriva3,
                m370descagric3,
                m370ingragric3,
                m370sumingresos,
                m370sumcuotder,
                m370sumingrejer,
                m370difcuotding,
                m370devadqintr,
                m370deventract,
                m370devinvers,
                m370regulbienes,
                m370totivadeduc,
                m370totcuotres,
                m370tdedactfijo,
                m370tdiferencia,
                m370sumaresults,
                m370cuotcompen,
                m370resdifcomp,
                m370impcomplem,
                m370entregas,
                m370resultado,
                m370impcompen,
                m370sinactiv,
                m370impdevol,
                m370entdevol,
                m370ofidevol,
                m370digidevol,
                m370ctadevol,
                m370cruzefec,
                m370cruzadeu,
                m370impingreso,
                m370entingreso,
                m370ofiingreso,
                m370digiingreso,
                m370ctaingreso,
                m370munifirma,
                m370dia,
                m370mes,
                m370anyo,
                m370fecha,
                m370percont,
                m370telcont,
                m370observa,
                m370letetiq,
                m370modelo,
                m370numjusti,
                m370cruzcompl,
                m370tipodecl,
                m370cruzccc                
                };
            setColumns(array);
            FieldDef arrayf[] = {m370dominio,m370nif,m370ejercicio,m370periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod110 extends TableDef
        {
        // campos
        public FieldDef m110dominio;
        public FieldDef m110nif;
        public FieldDef m110ejercicio;
        public FieldDef m110periodo;
        public FieldDef m110deleg;
        public FieldDef m110admon;
        public FieldDef m110codadmon;
        public FieldDef m110apellidos;
        public FieldDef m110nombre;
        public FieldDef m110siglas;
        public FieldDef m110calle;
        public FieldDef m110numero;
        public FieldDef m110escalera;
        public FieldDef m110piso;
        public FieldDef m110puerta;
        public FieldDef m110cpostal;
        public FieldDef m110municipio;
        public FieldDef m110provincia;
        public FieldDef m110telefono;
        public FieldDef m110rtdnp;
        public FieldDef m110rtdimpp;
        public FieldDef m110rtdimpr;
        public FieldDef m110rtenp;
        public FieldDef m110rteimpp;
        public FieldDef m110rteimpi;
        public FieldDef m110racdnp;
        public FieldDef m110racdimpp;
        public FieldDef m110racdimpr;
        public FieldDef m110racenp;
        public FieldDef m110raceimpp;
        public FieldDef m110raceimpi;
        public FieldDef m110prednp;
        public FieldDef m110predimpp;
        public FieldDef m110predimpr;
        public FieldDef m110preenp;
        public FieldDef m110preeimpp;
        public FieldDef m110preeimpi;
        public FieldDef m110cdinp;
        public FieldDef m110cdicsat;
        public FieldDef m110cdiimpi;
        public FieldDef m110totsric;
        public FieldDef m110totdeduc;
        public FieldDef m110totresing;
        public FieldDef m110ingimp;
        public FieldDef m110cruzefec;
        public FieldDef m110cruzadeu;
        public FieldDef m110entingreso;
        public FieldDef m110ofiingreso;
        public FieldDef m110digiingreso;
        public FieldDef m110ctaingreso;
        public FieldDef m110cruzneg;
        public FieldDef m110cruzcomp;
        public FieldDef m110numjusti;
        public FieldDef m110munifirma;
        public FieldDef m110dia;
        public FieldDef m110mes;
        public FieldDef m110anyo;
        public FieldDef m110fecha;
        public FieldDef m110percont;
        public FieldDef m110telcont;
        public FieldDef m110observa;
        public FieldDef m110letetiq;
        public FieldDef m110modelo;
        public FieldDef m110gppdnp;
        public FieldDef m110gppdip;
        public FieldDef m110gppdir;
        public FieldDef m110gpenp;
        public FieldDef m110gpeip;
        public FieldDef m110gpeir;
        public FieldDef m110cruzccc;
        public FieldDef m110codelec;
        public FieldDef m110tipodecl;
        public FieldDef m110formapago;
        public FieldDef m110colcom;
        public FieldDef m110paisiban;
        public FieldDef m110dciban;
        public TabMod110(String name)
            {
            super(name);
            m110dominio = new FieldDef("m110dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m110nif = new FieldDef("m110nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m110ejercicio = new FieldDef("m110ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m110periodo = new FieldDef("m110periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m110deleg = new FieldDef("m110deleg",FieldDef.CHAR,30);
            m110admon = new FieldDef("m110admon",FieldDef.CHAR,30);
            m110codadmon = new FieldDef("m110codadmon",FieldDef.INTEGER,0);
            m110apellidos = new FieldDef("m110apellidos",FieldDef.CHAR,30);
            m110nombre = new FieldDef("m110nombre",FieldDef.CHAR,15);
            m110siglas = new FieldDef("m110siglas",FieldDef.CHAR,2);
            m110calle = new FieldDef("m110calle",FieldDef.CHAR,17);
            m110numero = new FieldDef("m110numero",FieldDef.CHAR,4);
            m110escalera = new FieldDef("m110escalera",FieldDef.CHAR,2);
            m110piso = new FieldDef("m110piso",FieldDef.CHAR,2);
            m110puerta = new FieldDef("m110puerta",FieldDef.CHAR,2);
            m110cpostal = new FieldDef("m110cpostal",FieldDef.CHAR,5);
            m110municipio = new FieldDef("m110municipio",FieldDef.CHAR,20);
            m110provincia = new FieldDef("m110provincia",FieldDef.CHAR,15);
            m110telefono = new FieldDef("m110telefono",FieldDef.CHAR,9);
            m110rtdnp = new FieldDef("m110rtdnp",FieldDef.FLOAT,6,0);
            m110rtdimpp = new FieldDef("m110rtdimpp",FieldDef.FLOAT,6,0);
            m110rtdimpr = new FieldDef("m110rtdimpr",FieldDef.FLOAT,6,0);
            m110rtenp = new FieldDef("m110rtenp",FieldDef.FLOAT,6,0);
            m110rteimpp = new FieldDef("m110rteimpp",FieldDef.FLOAT,6,0);
            m110rteimpi = new FieldDef("m110rteimpi",FieldDef.FLOAT,6,0);
            m110racdnp = new FieldDef("m110racdnp",FieldDef.FLOAT,6,0);
            m110racdimpp = new FieldDef("m110racdimpp",FieldDef.FLOAT,6,0);
            m110racdimpr = new FieldDef("m110racdimpr",FieldDef.FLOAT,6,0);
            m110racenp = new FieldDef("m110racenp",FieldDef.FLOAT,6,0);
            m110raceimpp = new FieldDef("m110raceimpp",FieldDef.FLOAT,6,0);
            m110raceimpi = new FieldDef("m110raceimpi",FieldDef.FLOAT,6,0);
            m110prednp = new FieldDef("m110prednp",FieldDef.FLOAT,6,0);
            m110predimpp = new FieldDef("m110predimpp",FieldDef.FLOAT,6,0);
            m110predimpr = new FieldDef("m110predimpr",FieldDef.FLOAT,6,0);
            m110preenp = new FieldDef("m110preenp",FieldDef.FLOAT,6,0);
            m110preeimpp = new FieldDef("m110preeimpp",FieldDef.FLOAT,6,0);
            m110preeimpi = new FieldDef("m110preeimpi",FieldDef.FLOAT,6,0);
            m110cdinp = new FieldDef("m110cdinp",FieldDef.FLOAT,6,0);
            m110cdicsat = new FieldDef("m110cdicsat",FieldDef.FLOAT,6,0);
            m110cdiimpi = new FieldDef("m110cdiimpi",FieldDef.FLOAT,6,0);
            m110totsric = new FieldDef("m110totsric",FieldDef.FLOAT,6,0);
            m110totdeduc = new FieldDef("m110totdeduc",FieldDef.FLOAT,6,0);
            m110totresing = new FieldDef("m110totresing",FieldDef.FLOAT,6,0);
            m110ingimp = new FieldDef("m110ingimp",FieldDef.FLOAT,6,0);
            m110cruzefec = new FieldDef("m110cruzefec",FieldDef.CHAR,1);
            m110cruzadeu = new FieldDef("m110cruzadeu",FieldDef.CHAR,1);
            m110entingreso = new FieldDef("m110entingreso",FieldDef.CHAR,4);
            m110ofiingreso = new FieldDef("m110ofiingreso",FieldDef.CHAR,4);
            m110digiingreso = new FieldDef("m110digiingreso",FieldDef.CHAR,2);
            m110ctaingreso = new FieldDef("m110ctaingreso",FieldDef.CHAR,10);
            m110cruzneg = new FieldDef("m110cruzneg",FieldDef.CHAR,1);
            m110cruzcomp = new FieldDef("m110cruzcomp",FieldDef.CHAR,1);
            m110numjusti = new FieldDef("m110numjusti",FieldDef.CHAR,16);
            m110munifirma = new FieldDef("m110munifirma",FieldDef.CHAR,16);
            m110dia = new FieldDef("m110dia",FieldDef.CHAR,2);
            m110mes = new FieldDef("m110mes",FieldDef.CHAR,10);
            m110anyo = new FieldDef("m110anyo",FieldDef.CHAR,4);
            m110fecha = new FieldDef("m110fecha",FieldDef.DATE);
            m110percont = new FieldDef("m110percont",FieldDef.CHAR,100);
            m110telcont = new FieldDef("m110telcont",FieldDef.CHAR,9);
            m110observa = new FieldDef("m110observa",FieldDef.CHAR,350);
            m110letetiq = new FieldDef("m110letetiq",FieldDef.CHAR,4);
            m110modelo = new FieldDef("m110modelo",FieldDef.CHAR,5);
            m110gppdnp = new FieldDef("m110gppdnp",FieldDef.FLOAT,6,0);
            m110gppdip = new FieldDef("m110gppdip",FieldDef.FLOAT,6,0);
            m110gppdir = new FieldDef("m110gppdir",FieldDef.FLOAT,6,0);
            m110gpenp = new FieldDef("m110gpenp",FieldDef.FLOAT,6,0);
            m110gpeip = new FieldDef("m110gpeip",FieldDef.FLOAT,6,0);
            m110gpeir = new FieldDef("m110gpeir",FieldDef.FLOAT,6,0);
            m110cruzccc = new FieldDef("m110cruzccc",FieldDef.CHAR,1);
            m110codelec = new FieldDef("m110codelec",FieldDef.CHAR,16);
            m110tipodecl = new FieldDef("m110tipodecl",FieldDef.CHAR,1);
            m110formapago = new FieldDef("m110formapago",FieldDef.INTEGER,0);
            m110colcom = new FieldDef("m110colcom",FieldDef.CHAR,1);
            m110paisiban = new FieldDef("m110paisiban",FieldDef.CHAR,2);
            m110dciban = new FieldDef("m110dciban",FieldDef.CHAR,2);
            FieldDef array[] = {
                m110dominio,
                m110nif,
                m110ejercicio,
                m110periodo,
                m110deleg,
                m110admon,
                m110codadmon,
                m110apellidos,
                m110nombre,
                m110siglas,
                m110calle,
                m110numero,
                m110escalera,
                m110piso,
                m110puerta,
                m110cpostal,
                m110municipio,
                m110provincia,
                m110telefono,
                m110rtdnp,
                m110rtdimpp,
                m110rtdimpr,
                m110rtenp,
                m110rteimpp,
                m110rteimpi,
                m110racdnp,
                m110racdimpp,
                m110racdimpr,
                m110racenp,
                m110raceimpp,
                m110raceimpi,
                m110prednp,
                m110predimpp,
                m110predimpr,
                m110preenp,
                m110preeimpp,
                m110preeimpi,
                m110cdinp,
                m110cdicsat,
                m110cdiimpi,
                m110totsric,
                m110totdeduc,
                m110totresing,
                m110ingimp,
                m110cruzefec,
                m110cruzadeu,
                m110entingreso,
                m110ofiingreso,
                m110digiingreso,
                m110ctaingreso,
                m110cruzneg,
                m110cruzcomp,
                m110numjusti,
                m110munifirma,
                m110dia,
                m110mes,
                m110anyo,
                m110fecha,
                m110percont,
                m110telcont,
                m110observa,
                m110letetiq,
                m110modelo,
                m110gppdnp,
                m110gppdip,
                m110gppdir,
                m110gpenp,
                m110gpeip,
                m110gpeir,
                m110cruzccc,
                m110codelec,
                m110tipodecl,
                m110formapago,
                m110colcom,
                m110paisiban,
                m110dciban                
                };
            setColumns(array);
            FieldDef arrayf[] = {m110dominio,m110nif,m110ejercicio,m110periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod115 extends TableDef
        {
        // campos
        public FieldDef m115dominio;
        public FieldDef m115nif;
        public FieldDef m115ejercicio;
        public FieldDef m115periodo;
        public FieldDef m115deleg;
        public FieldDef m115admon;
        public FieldDef m115codadmon;
        public FieldDef m115apellidos;
        public FieldDef m115nombre;
        public FieldDef m115siglas;
        public FieldDef m115calle;
        public FieldDef m115numero;
        public FieldDef m115escalera;
        public FieldDef m115piso;
        public FieldDef m115puerta;
        public FieldDef m115cpostal;
        public FieldDef m115municipio;
        public FieldDef m115provincia;
        public FieldDef m115telefono;
        public FieldDef m115liqnp;
        public FieldDef m115liqbaseric;
        public FieldDef m115liqric;
        public FieldDef m115liqdeduc;
        public FieldDef m115liqresulti;
        public FieldDef m115cruzcomp;
        public FieldDef m115numjusti;
        public FieldDef m115cruzefec;
        public FieldDef m115cruzadeu;
        public FieldDef m115ingimpor;
        public FieldDef m115entingreso;
        public FieldDef m115ofiingreso;
        public FieldDef m115digiingreso;
        public FieldDef m115ctaingreso;
        public FieldDef m115munifirma;
        public FieldDef m115dia;
        public FieldDef m115mes;
        public FieldDef m115anyo;
        public FieldDef m115fecha;
        public FieldDef m115percont;
        public FieldDef m115telcont;
        public FieldDef m115observa;
        public FieldDef m115letetiq;
        public FieldDef m115cruzccc;
        public FieldDef m115codelec;
        public FieldDef m115tipodecl;
        public FieldDef m115razon;
        public FieldDef m115paisiban;
        public FieldDef m115dciban;
        public TabMod115(String name)
            {
            super(name);
            m115dominio = new FieldDef("m115dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m115nif = new FieldDef("m115nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m115ejercicio = new FieldDef("m115ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m115periodo = new FieldDef("m115periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m115deleg = new FieldDef("m115deleg",FieldDef.CHAR,30);
            m115admon = new FieldDef("m115admon",FieldDef.CHAR,30);
            m115codadmon = new FieldDef("m115codadmon",FieldDef.INTEGER,0);
            m115apellidos = new FieldDef("m115apellidos",FieldDef.CHAR,30);
            m115nombre = new FieldDef("m115nombre",FieldDef.CHAR,20);
            m115siglas = new FieldDef("m115siglas",FieldDef.CHAR,2);
            m115calle = new FieldDef("m115calle",FieldDef.CHAR,17);
            m115numero = new FieldDef("m115numero",FieldDef.CHAR,4);
            m115escalera = new FieldDef("m115escalera",FieldDef.CHAR,2);
            m115piso = new FieldDef("m115piso",FieldDef.CHAR,2);
            m115puerta = new FieldDef("m115puerta",FieldDef.CHAR,2);
            m115cpostal = new FieldDef("m115cpostal",FieldDef.CHAR,5);
            m115municipio = new FieldDef("m115municipio",FieldDef.CHAR,20);
            m115provincia = new FieldDef("m115provincia",FieldDef.CHAR,15);
            m115telefono = new FieldDef("m115telefono",FieldDef.CHAR,9);
            m115liqnp = new FieldDef("m115liqnp",FieldDef.FLOAT,6,0);
            m115liqbaseric = new FieldDef("m115liqbaseric",FieldDef.FLOAT,6,0);
            m115liqric = new FieldDef("m115liqric",FieldDef.FLOAT,6,0);
            m115liqdeduc = new FieldDef("m115liqdeduc",FieldDef.FLOAT,6,0);
            m115liqresulti = new FieldDef("m115liqresulti",FieldDef.FLOAT,6,0);
            m115cruzcomp = new FieldDef("m115cruzcomp",FieldDef.CHAR,1);
            m115numjusti = new FieldDef("m115numjusti",FieldDef.CHAR,16);
            m115cruzefec = new FieldDef("m115cruzefec",FieldDef.CHAR,1);
            m115cruzadeu = new FieldDef("m115cruzadeu",FieldDef.CHAR,1);
            m115ingimpor = new FieldDef("m115ingimpor",FieldDef.FLOAT,6,0);
            m115entingreso = new FieldDef("m115entingreso",FieldDef.CHAR,4);
            m115ofiingreso = new FieldDef("m115ofiingreso",FieldDef.CHAR,4);
            m115digiingreso = new FieldDef("m115digiingreso",FieldDef.CHAR,2);
            m115ctaingreso = new FieldDef("m115ctaingreso",FieldDef.CHAR,10);
            m115munifirma = new FieldDef("m115munifirma",FieldDef.CHAR,16);
            m115dia = new FieldDef("m115dia",FieldDef.CHAR,2);
            m115mes = new FieldDef("m115mes",FieldDef.CHAR,10);
            m115anyo = new FieldDef("m115anyo",FieldDef.CHAR,4);
            m115fecha = new FieldDef("m115fecha",FieldDef.DATE);
            m115percont = new FieldDef("m115percont",FieldDef.CHAR,100);
            m115telcont = new FieldDef("m115telcont",FieldDef.CHAR,9);
            m115observa = new FieldDef("m115observa",FieldDef.CHAR,350);
            m115letetiq = new FieldDef("m115letetiq",FieldDef.CHAR,4);
            m115cruzccc = new FieldDef("m115cruzccc",FieldDef.CHAR,1);
            m115codelec = new FieldDef("m115codelec",FieldDef.CHAR,16);
            m115tipodecl = new FieldDef("m115tipodecl",FieldDef.CHAR,1);
            m115razon = new FieldDef("m115razon",FieldDef.CHAR,60);
            m115paisiban = new FieldDef("m115paisiban",FieldDef.CHAR,2);
            m115dciban = new FieldDef("m115dciban",FieldDef.CHAR,2);
            FieldDef array[] = {
                m115dominio,
                m115nif,
                m115ejercicio,
                m115periodo,
                m115deleg,
                m115admon,
                m115codadmon,
                m115apellidos,
                m115nombre,
                m115siglas,
                m115calle,
                m115numero,
                m115escalera,
                m115piso,
                m115puerta,
                m115cpostal,
                m115municipio,
                m115provincia,
                m115telefono,
                m115liqnp,
                m115liqbaseric,
                m115liqric,
                m115liqdeduc,
                m115liqresulti,
                m115cruzcomp,
                m115numjusti,
                m115cruzefec,
                m115cruzadeu,
                m115ingimpor,
                m115entingreso,
                m115ofiingreso,
                m115digiingreso,
                m115ctaingreso,
                m115munifirma,
                m115dia,
                m115mes,
                m115anyo,
                m115fecha,
                m115percont,
                m115telcont,
                m115observa,
                m115letetiq,
                m115cruzccc,
                m115codelec,
                m115tipodecl,
                m115razon,
                m115paisiban,
                m115dciban                
                };
            setColumns(array);
            FieldDef arrayf[] = {m115dominio,m115nif,m115ejercicio,m115periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod130 extends TableDef
        {
        // campos
        public FieldDef m130dominio;
        public FieldDef m130nif;
        public FieldDef m130ejercicio;
        public FieldDef m130periodo;
        public FieldDef m130deleg;
        public FieldDef m130admon;
        public FieldDef m130codadmon;
        public FieldDef m130apellidos;
        public FieldDef m130nombre;
        public FieldDef m130siglas;
        public FieldDef m130calle;
        public FieldDef m130numero;
        public FieldDef m130escalera;
        public FieldDef m130piso;
        public FieldDef m130puerta;
        public FieldDef m130cpostal;
        public FieldDef m130municipio;
        public FieldDef m130provincia;
        public FieldDef m130telefono;
        public FieldDef m130ingrnormal;
        public FieldDef m130gastos;
        public FieldDef m130rendimiento;
        public FieldDef m130porcenrendi;
        public FieldDef m130porrdto;
        public FieldDef m130pagfracant;
        public FieldDef m130retennormal;
        public FieldDef m130pagfracnorm;
        public FieldDef m130ingragric;
        public FieldDef m130porcenvolum;
        public FieldDef m130poringragri;
        public FieldDef m130retenagric;
        public FieldDef m130pagfracagri;
        public FieldDef m130sumpagfrac;
        public FieldDef m130deducant;
        public FieldDef m130cuotaingr;
        public FieldDef m130impingreso;
        public FieldDef m130cruzneg;
        public FieldDef m130cruzefec;
        public FieldDef m130cruzadeu;
        public FieldDef m130entingreso;
        public FieldDef m130ofiingreso;
        public FieldDef m130digiingreso;
        public FieldDef m130ctaingreso;
        public FieldDef m130cruzcomp;
        public FieldDef m130numjusti;
        public FieldDef m130munifirma;
        public FieldDef m130dia;
        public FieldDef m130mes;
        public FieldDef m130anyo;
        public FieldDef m130fecha;
        public FieldDef m130percont;
        public FieldDef m130telcont;
        public FieldDef m130observa;
        public FieldDef m130letetiq;
        public FieldDef m130tipodecl;
        public FieldDef m130formapago;
        public FieldDef m130codelec;
        public FieldDef m130minley;
        public FieldDef m130difley;
        public FieldDef m130dedtrimant;
        public FieldDef m130totalliq;
        public FieldDef m130resultliq;
        public FieldDef m130chdedpag;
        public FieldDef m130adqvivhab;
        public FieldDef m130paisiban;
        public FieldDef m130dciban;
        public TabMod130(String name)
            {
            super(name);
            m130dominio = new FieldDef("m130dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m130nif = new FieldDef("m130nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m130ejercicio = new FieldDef("m130ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m130periodo = new FieldDef("m130periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m130deleg = new FieldDef("m130deleg",FieldDef.CHAR,30);
            m130admon = new FieldDef("m130admon",FieldDef.CHAR,30);
            m130codadmon = new FieldDef("m130codadmon",FieldDef.INTEGER,0);
            m130apellidos = new FieldDef("m130apellidos",FieldDef.CHAR,60);
            m130nombre = new FieldDef("m130nombre",FieldDef.CHAR,20);
            m130siglas = new FieldDef("m130siglas",FieldDef.CHAR,2);
            m130calle = new FieldDef("m130calle",FieldDef.CHAR,17);
            m130numero = new FieldDef("m130numero",FieldDef.CHAR,4);
            m130escalera = new FieldDef("m130escalera",FieldDef.CHAR,2);
            m130piso = new FieldDef("m130piso",FieldDef.CHAR,2);
            m130puerta = new FieldDef("m130puerta",FieldDef.CHAR,2);
            m130cpostal = new FieldDef("m130cpostal",FieldDef.CHAR,5);
            m130municipio = new FieldDef("m130municipio",FieldDef.CHAR,20);
            m130provincia = new FieldDef("m130provincia",FieldDef.CHAR,15);
            m130telefono = new FieldDef("m130telefono",FieldDef.CHAR,9);
            m130ingrnormal = new FieldDef("m130ingrnormal",FieldDef.FLOAT,6,0);
            m130gastos = new FieldDef("m130gastos",FieldDef.FLOAT,6,0);
            m130rendimiento = new FieldDef("m130rendimiento",FieldDef.FLOAT,6,0);
            m130porcenrendi = new FieldDef("m130porcenrendi",FieldDef.FLOAT,6,0);
            m130porrdto = new FieldDef("m130porrdto",FieldDef.FLOAT,6,0);
            m130pagfracant = new FieldDef("m130pagfracant",FieldDef.FLOAT,6,0);
            m130retennormal = new FieldDef("m130retennormal",FieldDef.FLOAT,6,0);
            m130pagfracnorm = new FieldDef("m130pagfracnorm",FieldDef.FLOAT,6,0);
            m130ingragric = new FieldDef("m130ingragric",FieldDef.FLOAT,6,0);
            m130porcenvolum = new FieldDef("m130porcenvolum",FieldDef.FLOAT,6,0);
            m130poringragri = new FieldDef("m130poringragri",FieldDef.FLOAT,6,0);
            m130retenagric = new FieldDef("m130retenagric",FieldDef.FLOAT,6,0);
            m130pagfracagri = new FieldDef("m130pagfracagri",FieldDef.FLOAT,6,0);
            m130sumpagfrac = new FieldDef("m130sumpagfrac",FieldDef.FLOAT,6,0);
            m130deducant = new FieldDef("m130deducant",FieldDef.FLOAT,6,0);
            m130cuotaingr = new FieldDef("m130cuotaingr",FieldDef.FLOAT,6,0);
            m130impingreso = new FieldDef("m130impingreso",FieldDef.FLOAT,6,0);
            m130cruzneg = new FieldDef("m130cruzneg",FieldDef.CHAR,1);
            m130cruzefec = new FieldDef("m130cruzefec",FieldDef.CHAR,1);
            m130cruzadeu = new FieldDef("m130cruzadeu",FieldDef.CHAR,1);
            m130entingreso = new FieldDef("m130entingreso",FieldDef.CHAR,4);
            m130ofiingreso = new FieldDef("m130ofiingreso",FieldDef.CHAR,4);
            m130digiingreso = new FieldDef("m130digiingreso",FieldDef.CHAR,2);
            m130ctaingreso = new FieldDef("m130ctaingreso",FieldDef.CHAR,10);
            m130cruzcomp = new FieldDef("m130cruzcomp",FieldDef.CHAR,1);
            m130numjusti = new FieldDef("m130numjusti",FieldDef.CHAR,16);
            m130munifirma = new FieldDef("m130munifirma",FieldDef.CHAR,30);
            m130dia = new FieldDef("m130dia",FieldDef.CHAR,2);
            m130mes = new FieldDef("m130mes",FieldDef.CHAR,10);
            m130anyo = new FieldDef("m130anyo",FieldDef.CHAR,4);
            m130fecha = new FieldDef("m130fecha",FieldDef.DATE);
            m130percont = new FieldDef("m130percont",FieldDef.CHAR,100);
            m130telcont = new FieldDef("m130telcont",FieldDef.CHAR,9);
            m130observa = new FieldDef("m130observa",FieldDef.CHAR,350);
            m130letetiq = new FieldDef("m130letetiq",FieldDef.CHAR,4);
            m130tipodecl = new FieldDef("m130tipodecl",FieldDef.CHAR,1);
            m130formapago = new FieldDef("m130formapago",FieldDef.INTEGER,0);
            m130codelec = new FieldDef("m130codelec",FieldDef.CHAR,16);
            m130minley = new FieldDef("m130minley",FieldDef.FLOAT,6,0);
            m130difley = new FieldDef("m130difley",FieldDef.FLOAT,6,0);
            m130dedtrimant = new FieldDef("m130dedtrimant",FieldDef.FLOAT,6,0);
            m130totalliq = new FieldDef("m130totalliq",FieldDef.FLOAT,6,0);
            m130resultliq = new FieldDef("m130resultliq",FieldDef.FLOAT,6,0);
            m130chdedpag = new FieldDef("m130chdedpag",FieldDef.CHAR,1);
            m130adqvivhab = new FieldDef("m130adqvivhab",FieldDef.FLOAT,6,0);
            m130paisiban = new FieldDef("m130paisiban",FieldDef.CHAR,2);
            m130dciban = new FieldDef("m130dciban",FieldDef.CHAR,2);
            FieldDef array[] = {
                m130dominio,
                m130nif,
                m130ejercicio,
                m130periodo,
                m130deleg,
                m130admon,
                m130codadmon,
                m130apellidos,
                m130nombre,
                m130siglas,
                m130calle,
                m130numero,
                m130escalera,
                m130piso,
                m130puerta,
                m130cpostal,
                m130municipio,
                m130provincia,
                m130telefono,
                m130ingrnormal,
                m130gastos,
                m130rendimiento,
                m130porcenrendi,
                m130porrdto,
                m130pagfracant,
                m130retennormal,
                m130pagfracnorm,
                m130ingragric,
                m130porcenvolum,
                m130poringragri,
                m130retenagric,
                m130pagfracagri,
                m130sumpagfrac,
                m130deducant,
                m130cuotaingr,
                m130impingreso,
                m130cruzneg,
                m130cruzefec,
                m130cruzadeu,
                m130entingreso,
                m130ofiingreso,
                m130digiingreso,
                m130ctaingreso,
                m130cruzcomp,
                m130numjusti,
                m130munifirma,
                m130dia,
                m130mes,
                m130anyo,
                m130fecha,
                m130percont,
                m130telcont,
                m130observa,
                m130letetiq,
                m130tipodecl,
                m130formapago,
                m130codelec,
                m130minley,
                m130difley,
                m130dedtrimant,
                m130totalliq,
                m130resultliq,
                m130chdedpag,
                m130adqvivhab,
                m130paisiban,
                m130dciban                
                };
            setColumns(array);
            FieldDef arrayf[] = {m130dominio,m130nif,m130ejercicio,m130periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod131 extends TableDef
        {
        // campos
        public FieldDef m131dominio;
        public FieldDef m131nif;
        public FieldDef m131ejercicio;
        public FieldDef m131periodo;
        public FieldDef m131deleg;
        public FieldDef m131admon;
        public FieldDef m131codadmon;
        public FieldDef m131apellidos;
        public FieldDef m131nombre;
        public FieldDef m131siglas;
        public FieldDef m131calle;
        public FieldDef m131numero;
        public FieldDef m131escalera;
        public FieldDef m131piso;
        public FieldDef m131puerta;
        public FieldDef m131cpostal;
        public FieldDef m131municipio;
        public FieldDef m131provincia;
        public FieldDef m131telefono;
        public FieldDef m131epigrafe1;
        public FieldDef m131modacteo1;
        public FieldDef m131rendimient1;
        public FieldDef m131porcen1;
        public FieldDef m131resultado1;
        public FieldDef m131modacteo2;
        public FieldDef m131epigrafe2;
        public FieldDef m131rendimient2;
        public FieldDef m131porcen2;
        public FieldDef m131resultado2;
        public FieldDef m131modacteo3;
        public FieldDef m131epigrafe3;
        public FieldDef m131rendimient3;
        public FieldDef m131porcen3;
        public FieldDef m131resultado3;
        public FieldDef m131modacteo4;
        public FieldDef m131epigrafe4;
        public FieldDef m131rendimient4;
        public FieldDef m131porcen4;
        public FieldDef m131resultado4;
        public FieldDef m131modacteo5;
        public FieldDef m131epigrafe5;
        public FieldDef m131rendimient5;
        public FieldDef m131porcen5;
        public FieldDef m131resultado5;
        public FieldDef m131sumaresult;
        public FieldDef m131reteneo;
        public FieldDef m131pagfraceo;
        public FieldDef m131ingragric;
        public FieldDef m131porcenvolum;
        public FieldDef m131porcenagri;
        public FieldDef m131retenagric;
        public FieldDef m131pagfracagr;
        public FieldDef m131sumpagfrac;
        public FieldDef m131deducant;
        public FieldDef m131cuotaingr;
        public FieldDef m131impingreso;
        public FieldDef m131cruzneg;
        public FieldDef m131cruzefec;
        public FieldDef m131cruzadeu;
        public FieldDef m131entingreso;
        public FieldDef m131ofiingreso;
        public FieldDef m131digiingreso;
        public FieldDef m131ctaingreso;
        public FieldDef m131cruzcomp;
        public FieldDef m131numjusti;
        public FieldDef m131cruzdomicil;
        public FieldDef m131entdomicili;
        public FieldDef m131ofidomicili;
        public FieldDef m131digidomicil;
        public FieldDef m131ctadomicili;
        public FieldDef m131munifirma;
        public FieldDef m131dia;
        public FieldDef m131mes;
        public FieldDef m131anyo;
        public FieldDef m131fecha;
        public FieldDef m131percont;
        public FieldDef m131telcont;
        public FieldDef m131observa;
        public FieldDef m131letetiq;
        public FieldDef m131formapago;
        public FieldDef m131tipodecl;
        public FieldDef m131codelec;
        public FieldDef m131volventri;
        public FieldDef m131pagofrac;
        public FieldDef m131retingcta;
        public FieldDef m131totliqdif;
        public FieldDef m131resnegtrim;
        public FieldDef m131totalliq;
        public FieldDef m131resultliq;
        public FieldDef m131dedpagfrac;
        public FieldDef m131minley;
        public FieldDef m131sumrdtnet;
        public FieldDef m131adqvivhab;
        public FieldDef m131paisiban;
        public FieldDef m131dciban;
        public TabMod131(String name)
            {
            super(name);
            m131dominio = new FieldDef("m131dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m131nif = new FieldDef("m131nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m131ejercicio = new FieldDef("m131ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m131periodo = new FieldDef("m131periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m131deleg = new FieldDef("m131deleg",FieldDef.CHAR,30);
            m131admon = new FieldDef("m131admon",FieldDef.CHAR,30);
            m131codadmon = new FieldDef("m131codadmon",FieldDef.INTEGER,0);
            m131apellidos = new FieldDef("m131apellidos",FieldDef.CHAR,60);
            m131nombre = new FieldDef("m131nombre",FieldDef.CHAR,20);
            m131siglas = new FieldDef("m131siglas",FieldDef.CHAR,2);
            m131calle = new FieldDef("m131calle",FieldDef.CHAR,17);
            m131numero = new FieldDef("m131numero",FieldDef.CHAR,4);
            m131escalera = new FieldDef("m131escalera",FieldDef.CHAR,2);
            m131piso = new FieldDef("m131piso",FieldDef.CHAR,2);
            m131puerta = new FieldDef("m131puerta",FieldDef.CHAR,2);
            m131cpostal = new FieldDef("m131cpostal",FieldDef.CHAR,5);
            m131municipio = new FieldDef("m131municipio",FieldDef.CHAR,20);
            m131provincia = new FieldDef("m131provincia",FieldDef.CHAR,15);
            m131telefono = new FieldDef("m131telefono",FieldDef.CHAR,9);
            m131epigrafe1 = new FieldDef("m131epigrafe1",FieldDef.CHAR,7);
            m131modacteo1 = new FieldDef("m131modacteo1",FieldDef.INTEGER,0);
            m131rendimient1 = new FieldDef("m131rendimient1",FieldDef.FLOAT,6,0);
            m131porcen1 = new FieldDef("m131porcen1",FieldDef.FLOAT,6,0);
            m131resultado1 = new FieldDef("m131resultado1",FieldDef.FLOAT,6,0);
            m131modacteo2 = new FieldDef("m131modacteo2",FieldDef.INTEGER,0);
            m131epigrafe2 = new FieldDef("m131epigrafe2",FieldDef.CHAR,7);
            m131rendimient2 = new FieldDef("m131rendimient2",FieldDef.FLOAT,6,0);
            m131porcen2 = new FieldDef("m131porcen2",FieldDef.FLOAT,6,0);
            m131resultado2 = new FieldDef("m131resultado2",FieldDef.FLOAT,6,0);
            m131modacteo3 = new FieldDef("m131modacteo3",FieldDef.INTEGER,0);
            m131epigrafe3 = new FieldDef("m131epigrafe3",FieldDef.CHAR,7);
            m131rendimient3 = new FieldDef("m131rendimient3",FieldDef.FLOAT,6,0);
            m131porcen3 = new FieldDef("m131porcen3",FieldDef.FLOAT,6,0);
            m131resultado3 = new FieldDef("m131resultado3",FieldDef.FLOAT,6,0);
            m131modacteo4 = new FieldDef("m131modacteo4",FieldDef.INTEGER,0);
            m131epigrafe4 = new FieldDef("m131epigrafe4",FieldDef.CHAR,7);
            m131rendimient4 = new FieldDef("m131rendimient4",FieldDef.FLOAT,6,0);
            m131porcen4 = new FieldDef("m131porcen4",FieldDef.FLOAT,6,0);
            m131resultado4 = new FieldDef("m131resultado4",FieldDef.FLOAT,6,0);
            m131modacteo5 = new FieldDef("m131modacteo5",FieldDef.INTEGER,0);
            m131epigrafe5 = new FieldDef("m131epigrafe5",FieldDef.CHAR,7);
            m131rendimient5 = new FieldDef("m131rendimient5",FieldDef.FLOAT,6,0);
            m131porcen5 = new FieldDef("m131porcen5",FieldDef.FLOAT,6,0);
            m131resultado5 = new FieldDef("m131resultado5",FieldDef.FLOAT,6,0);
            m131sumaresult = new FieldDef("m131sumaresult",FieldDef.FLOAT,6,0);
            m131reteneo = new FieldDef("m131reteneo",FieldDef.FLOAT,6,0);
            m131pagfraceo = new FieldDef("m131pagfraceo",FieldDef.FLOAT,6,0);
            m131ingragric = new FieldDef("m131ingragric",FieldDef.FLOAT,6,0);
            m131porcenvolum = new FieldDef("m131porcenvolum",FieldDef.FLOAT,6,0);
            m131porcenagri = new FieldDef("m131porcenagri",FieldDef.FLOAT,6,0);
            m131retenagric = new FieldDef("m131retenagric",FieldDef.FLOAT,6,0);
            m131pagfracagr = new FieldDef("m131pagfracagr",FieldDef.FLOAT,6,0);
            m131sumpagfrac = new FieldDef("m131sumpagfrac",FieldDef.FLOAT,6,0);
            m131deducant = new FieldDef("m131deducant",FieldDef.FLOAT,6,0);
            m131cuotaingr = new FieldDef("m131cuotaingr",FieldDef.FLOAT,6,0);
            m131impingreso = new FieldDef("m131impingreso",FieldDef.FLOAT,6,0);
            m131cruzneg = new FieldDef("m131cruzneg",FieldDef.CHAR,1);
            m131cruzefec = new FieldDef("m131cruzefec",FieldDef.CHAR,1);
            m131cruzadeu = new FieldDef("m131cruzadeu",FieldDef.CHAR,1);
            m131entingreso = new FieldDef("m131entingreso",FieldDef.CHAR,4);
            m131ofiingreso = new FieldDef("m131ofiingreso",FieldDef.CHAR,4);
            m131digiingreso = new FieldDef("m131digiingreso",FieldDef.CHAR,2);
            m131ctaingreso = new FieldDef("m131ctaingreso",FieldDef.CHAR,10);
            m131cruzcomp = new FieldDef("m131cruzcomp",FieldDef.CHAR,1);
            m131numjusti = new FieldDef("m131numjusti",FieldDef.CHAR,16);
            m131cruzdomicil = new FieldDef("m131cruzdomicil",FieldDef.CHAR,1);
            m131entdomicili = new FieldDef("m131entdomicili",FieldDef.CHAR,4);
            m131ofidomicili = new FieldDef("m131ofidomicili",FieldDef.CHAR,4);
            m131digidomicil = new FieldDef("m131digidomicil",FieldDef.CHAR,2);
            m131ctadomicili = new FieldDef("m131ctadomicili",FieldDef.CHAR,10);
            m131munifirma = new FieldDef("m131munifirma",FieldDef.CHAR,30);
            m131dia = new FieldDef("m131dia",FieldDef.CHAR,2);
            m131mes = new FieldDef("m131mes",FieldDef.CHAR,10);
            m131anyo = new FieldDef("m131anyo",FieldDef.CHAR,4);
            m131fecha = new FieldDef("m131fecha",FieldDef.DATE);
            m131percont = new FieldDef("m131percont",FieldDef.CHAR,100);
            m131telcont = new FieldDef("m131telcont",FieldDef.CHAR,9);
            m131observa = new FieldDef("m131observa",FieldDef.CHAR,350);
            m131letetiq = new FieldDef("m131letetiq",FieldDef.CHAR,4);
            m131formapago = new FieldDef("m131formapago",FieldDef.INTEGER,0);
            m131tipodecl = new FieldDef("m131tipodecl",FieldDef.CHAR,1);
            m131codelec = new FieldDef("m131codelec",FieldDef.CHAR,16);
            m131volventri = new FieldDef("m131volventri",FieldDef.FLOAT,6,0);
            m131pagofrac = new FieldDef("m131pagofrac",FieldDef.FLOAT,6,0);
            m131retingcta = new FieldDef("m131retingcta",FieldDef.FLOAT,6,0);
            m131totliqdif = new FieldDef("m131totliqdif",FieldDef.FLOAT,6,0);
            m131resnegtrim = new FieldDef("m131resnegtrim",FieldDef.FLOAT,6,0);
            m131totalliq = new FieldDef("m131totalliq",FieldDef.FLOAT,6,0);
            m131resultliq = new FieldDef("m131resultliq",FieldDef.FLOAT,6,0);
            m131dedpagfrac = new FieldDef("m131dedpagfrac",FieldDef.CHAR,1);
            m131minley = new FieldDef("m131minley",FieldDef.FLOAT,6,0);
            m131sumrdtnet = new FieldDef("m131sumrdtnet",FieldDef.FLOAT,6,0);
            m131adqvivhab = new FieldDef("m131adqvivhab",FieldDef.FLOAT,6,0);
            m131paisiban = new FieldDef("m131paisiban",FieldDef.CHAR,2);
            m131dciban = new FieldDef("m131dciban",FieldDef.CHAR,2);
            FieldDef array[] = {
                m131dominio,
                m131nif,
                m131ejercicio,
                m131periodo,
                m131deleg,
                m131admon,
                m131codadmon,
                m131apellidos,
                m131nombre,
                m131siglas,
                m131calle,
                m131numero,
                m131escalera,
                m131piso,
                m131puerta,
                m131cpostal,
                m131municipio,
                m131provincia,
                m131telefono,
                m131epigrafe1,
                m131modacteo1,
                m131rendimient1,
                m131porcen1,
                m131resultado1,
                m131modacteo2,
                m131epigrafe2,
                m131rendimient2,
                m131porcen2,
                m131resultado2,
                m131modacteo3,
                m131epigrafe3,
                m131rendimient3,
                m131porcen3,
                m131resultado3,
                m131modacteo4,
                m131epigrafe4,
                m131rendimient4,
                m131porcen4,
                m131resultado4,
                m131modacteo5,
                m131epigrafe5,
                m131rendimient5,
                m131porcen5,
                m131resultado5,
                m131sumaresult,
                m131reteneo,
                m131pagfraceo,
                m131ingragric,
                m131porcenvolum,
                m131porcenagri,
                m131retenagric,
                m131pagfracagr,
                m131sumpagfrac,
                m131deducant,
                m131cuotaingr,
                m131impingreso,
                m131cruzneg,
                m131cruzefec,
                m131cruzadeu,
                m131entingreso,
                m131ofiingreso,
                m131digiingreso,
                m131ctaingreso,
                m131cruzcomp,
                m131numjusti,
                m131cruzdomicil,
                m131entdomicili,
                m131ofidomicili,
                m131digidomicil,
                m131ctadomicili,
                m131munifirma,
                m131dia,
                m131mes,
                m131anyo,
                m131fecha,
                m131percont,
                m131telcont,
                m131observa,
                m131letetiq,
                m131formapago,
                m131tipodecl,
                m131codelec,
                m131volventri,
                m131pagofrac,
                m131retingcta,
                m131totliqdif,
                m131resnegtrim,
                m131totalliq,
                m131resultliq,
                m131dedpagfrac,
                m131minley,
                m131sumrdtnet,
                m131adqvivhab,
                m131paisiban,
                m131dciban                
                };
            setColumns(array);
            FieldDef arrayf[] = {m131dominio,m131nif,m131ejercicio,m131periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod310 extends TableDef
        {
        // campos
        public FieldDef m310dominio;
        public FieldDef m310nif;
        public FieldDef m310ejercicio;
        public FieldDef m310periodo;
        public FieldDef m310deleg;
        public FieldDef m310admon;
        public FieldDef m310codadmon;
        public FieldDef m310apellidos;
        public FieldDef m310nombre;
        public FieldDef m310siglas;
        public FieldDef m310calle;
        public FieldDef m310numero;
        public FieldDef m310escalera;
        public FieldDef m310piso;
        public FieldDef m310puerta;
        public FieldDef m310cpostal;
        public FieldDef m310municipio;
        public FieldDef m310provincia;
        public FieldDef m310telefono;
        public FieldDef m310modacteo1;
        public FieldDef m310epigrafe1;
        public FieldDef m310ingrsimpli1;
        public FieldDef m310modacteo2;
        public FieldDef m310epigrafe2;
        public FieldDef m310ingrsimpli2;
        public FieldDef m310modacteo3;
        public FieldDef m310epigrafe3;
        public FieldDef m310ingrsimpli3;
        public FieldDef m310modacteo4;
        public FieldDef m310epigrafe4;
        public FieldDef m310ingrsimpli4;
        public FieldDef m310modacteo5;
        public FieldDef m310epigrafe5;
        public FieldDef m310ingrsimpli5;
        public FieldDef m310modagriva1;
        public FieldDef m310descagric1;
        public FieldDef m310ingragric1;
        public FieldDef m310modagriva2;
        public FieldDef m310descagric2;
        public FieldDef m310ingragric2;
        public FieldDef m310modagriva3;
        public FieldDef m310descagric3;
        public FieldDef m310ingragric3;
        public FieldDef m310modagriva4;
        public FieldDef m310descagric4;
        public FieldDef m310ingragric4;
        public FieldDef m310sumingresos;
        public FieldDef m310devadqintr;
        public FieldDef m310deventract;
        public FieldDef m310devinvers;
        public FieldDef m310totcuotres;
        public FieldDef m310tdedactfijo;
        public FieldDef m310tdiferencia;
        public FieldDef m310tcuotcompen;
        public FieldDef m310tresultado;
        public FieldDef m310entregasint;
        public FieldDef m310deducant;
        public FieldDef m310resultliq;
        public FieldDef m310impingreso;
        public FieldDef m310impcompen;
        public FieldDef m310cruzefec;
        public FieldDef m310cruzadeu;
        public FieldDef m310cruzsinact;
        public FieldDef m310entingreso;
        public FieldDef m310ofiingreso;
        public FieldDef m310digiingreso;
        public FieldDef m310ctaingreso;
        public FieldDef m310cruzcomp;
        public FieldDef m310numjusti;
        public FieldDef m310cruzdomicil;
        public FieldDef m310entdomicili;
        public FieldDef m310ofidomicili;
        public FieldDef m310digidomicil;
        public FieldDef m310ctadomicili;
        public FieldDef m310munifirma;
        public FieldDef m310dia;
        public FieldDef m310mes;
        public FieldDef m310anyo;
        public FieldDef m310fecha;
        public FieldDef m310percont;
        public FieldDef m310telcont;
        public FieldDef m310observa;
        public FieldDef m310letetiq;
        public FieldDef m310tipodecl;
        public FieldDef m310codelec;
        public FieldDef m310formapago;
        public TabMod310(String name)
            {
            super(name);
            m310dominio = new FieldDef("m310dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m310nif = new FieldDef("m310nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m310ejercicio = new FieldDef("m310ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m310periodo = new FieldDef("m310periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m310deleg = new FieldDef("m310deleg",FieldDef.CHAR,30);
            m310admon = new FieldDef("m310admon",FieldDef.CHAR,30);
            m310codadmon = new FieldDef("m310codadmon",FieldDef.INTEGER,0);
            m310apellidos = new FieldDef("m310apellidos",FieldDef.CHAR,30);
            m310nombre = new FieldDef("m310nombre",FieldDef.CHAR,15);
            m310siglas = new FieldDef("m310siglas",FieldDef.CHAR,2);
            m310calle = new FieldDef("m310calle",FieldDef.CHAR,17);
            m310numero = new FieldDef("m310numero",FieldDef.CHAR,4);
            m310escalera = new FieldDef("m310escalera",FieldDef.CHAR,2);
            m310piso = new FieldDef("m310piso",FieldDef.CHAR,2);
            m310puerta = new FieldDef("m310puerta",FieldDef.CHAR,2);
            m310cpostal = new FieldDef("m310cpostal",FieldDef.CHAR,5);
            m310municipio = new FieldDef("m310municipio",FieldDef.CHAR,20);
            m310provincia = new FieldDef("m310provincia",FieldDef.CHAR,15);
            m310telefono = new FieldDef("m310telefono",FieldDef.CHAR,9);
            m310modacteo1 = new FieldDef("m310modacteo1",FieldDef.INTEGER,0);
            m310epigrafe1 = new FieldDef("m310epigrafe1",FieldDef.CHAR,7);
            m310ingrsimpli1 = new FieldDef("m310ingrsimpli1",FieldDef.FLOAT,6,0);
            m310modacteo2 = new FieldDef("m310modacteo2",FieldDef.INTEGER,0);
            m310epigrafe2 = new FieldDef("m310epigrafe2",FieldDef.CHAR,7);
            m310ingrsimpli2 = new FieldDef("m310ingrsimpli2",FieldDef.FLOAT,6,0);
            m310modacteo3 = new FieldDef("m310modacteo3",FieldDef.INTEGER,0);
            m310epigrafe3 = new FieldDef("m310epigrafe3",FieldDef.CHAR,7);
            m310ingrsimpli3 = new FieldDef("m310ingrsimpli3",FieldDef.FLOAT,6,0);
            m310modacteo4 = new FieldDef("m310modacteo4",FieldDef.INTEGER,0);
            m310epigrafe4 = new FieldDef("m310epigrafe4",FieldDef.CHAR,7);
            m310ingrsimpli4 = new FieldDef("m310ingrsimpli4",FieldDef.FLOAT,6,0);
            m310modacteo5 = new FieldDef("m310modacteo5",FieldDef.INTEGER,0);
            m310epigrafe5 = new FieldDef("m310epigrafe5",FieldDef.CHAR,7);
            m310ingrsimpli5 = new FieldDef("m310ingrsimpli5",FieldDef.FLOAT,6,0);
            m310modagriva1 = new FieldDef("m310modagriva1",FieldDef.INTEGER,0);
            m310descagric1 = new FieldDef("m310descagric1",FieldDef.CHAR,50);
            m310ingragric1 = new FieldDef("m310ingragric1",FieldDef.FLOAT,6,0);
            m310modagriva2 = new FieldDef("m310modagriva2",FieldDef.INTEGER,0);
            m310descagric2 = new FieldDef("m310descagric2",FieldDef.CHAR,50);
            m310ingragric2 = new FieldDef("m310ingragric2",FieldDef.FLOAT,6,0);
            m310modagriva3 = new FieldDef("m310modagriva3",FieldDef.INTEGER,0);
            m310descagric3 = new FieldDef("m310descagric3",FieldDef.CHAR,50);
            m310ingragric3 = new FieldDef("m310ingragric3",FieldDef.FLOAT,6,0);
            m310modagriva4 = new FieldDef("m310modagriva4",FieldDef.INTEGER,0);
            m310descagric4 = new FieldDef("m310descagric4",FieldDef.CHAR,50);
            m310ingragric4 = new FieldDef("m310ingragric4",FieldDef.FLOAT,6,0);
            m310sumingresos = new FieldDef("m310sumingresos",FieldDef.FLOAT,6,0);
            m310devadqintr = new FieldDef("m310devadqintr",FieldDef.FLOAT,6,0);
            m310deventract = new FieldDef("m310deventract",FieldDef.FLOAT,6,0);
            m310devinvers = new FieldDef("m310devinvers",FieldDef.FLOAT,6,0);
            m310totcuotres = new FieldDef("m310totcuotres",FieldDef.FLOAT,6,0);
            m310tdedactfijo = new FieldDef("m310tdedactfijo",FieldDef.FLOAT,6,0);
            m310tdiferencia = new FieldDef("m310tdiferencia",FieldDef.FLOAT,6,0);
            m310tcuotcompen = new FieldDef("m310tcuotcompen",FieldDef.FLOAT,6,0);
            m310tresultado = new FieldDef("m310tresultado",FieldDef.FLOAT,6,0);
            m310entregasint = new FieldDef("m310entregasint",FieldDef.FLOAT,6,0);
            m310deducant = new FieldDef("m310deducant",FieldDef.FLOAT,6,0);
            m310resultliq = new FieldDef("m310resultliq",FieldDef.FLOAT,6,0);
            m310impingreso = new FieldDef("m310impingreso",FieldDef.FLOAT,6,0);
            m310impcompen = new FieldDef("m310impcompen",FieldDef.FLOAT,6,0);
            m310cruzefec = new FieldDef("m310cruzefec",FieldDef.CHAR,1);
            m310cruzadeu = new FieldDef("m310cruzadeu",FieldDef.CHAR,1);
            m310cruzsinact = new FieldDef("m310cruzsinact",FieldDef.CHAR,1);
            m310entingreso = new FieldDef("m310entingreso",FieldDef.CHAR,4);
            m310ofiingreso = new FieldDef("m310ofiingreso",FieldDef.CHAR,4);
            m310digiingreso = new FieldDef("m310digiingreso",FieldDef.CHAR,2);
            m310ctaingreso = new FieldDef("m310ctaingreso",FieldDef.CHAR,10);
            m310cruzcomp = new FieldDef("m310cruzcomp",FieldDef.CHAR,1);
            m310numjusti = new FieldDef("m310numjusti",FieldDef.CHAR,16);
            m310cruzdomicil = new FieldDef("m310cruzdomicil",FieldDef.CHAR,1);
            m310entdomicili = new FieldDef("m310entdomicili",FieldDef.CHAR,4);
            m310ofidomicili = new FieldDef("m310ofidomicili",FieldDef.CHAR,4);
            m310digidomicil = new FieldDef("m310digidomicil",FieldDef.CHAR,2);
            m310ctadomicili = new FieldDef("m310ctadomicili",FieldDef.CHAR,10);
            m310munifirma = new FieldDef("m310munifirma",FieldDef.CHAR,30);
            m310dia = new FieldDef("m310dia",FieldDef.CHAR,2);
            m310mes = new FieldDef("m310mes",FieldDef.CHAR,10);
            m310anyo = new FieldDef("m310anyo",FieldDef.CHAR,4);
            m310fecha = new FieldDef("m310fecha",FieldDef.DATE);
            m310percont = new FieldDef("m310percont",FieldDef.CHAR,100);
            m310telcont = new FieldDef("m310telcont",FieldDef.CHAR,9);
            m310observa = new FieldDef("m310observa",FieldDef.CHAR,350);
            m310letetiq = new FieldDef("m310letetiq",FieldDef.CHAR,4);
            m310tipodecl = new FieldDef("m310tipodecl",FieldDef.CHAR,1);
            m310codelec = new FieldDef("m310codelec",FieldDef.CHAR,16);
            m310formapago = new FieldDef("m310formapago",FieldDef.INTEGER,0);
            FieldDef array[] = {
                m310dominio,
                m310nif,
                m310ejercicio,
                m310periodo,
                m310deleg,
                m310admon,
                m310codadmon,
                m310apellidos,
                m310nombre,
                m310siglas,
                m310calle,
                m310numero,
                m310escalera,
                m310piso,
                m310puerta,
                m310cpostal,
                m310municipio,
                m310provincia,
                m310telefono,
                m310modacteo1,
                m310epigrafe1,
                m310ingrsimpli1,
                m310modacteo2,
                m310epigrafe2,
                m310ingrsimpli2,
                m310modacteo3,
                m310epigrafe3,
                m310ingrsimpli3,
                m310modacteo4,
                m310epigrafe4,
                m310ingrsimpli4,
                m310modacteo5,
                m310epigrafe5,
                m310ingrsimpli5,
                m310modagriva1,
                m310descagric1,
                m310ingragric1,
                m310modagriva2,
                m310descagric2,
                m310ingragric2,
                m310modagriva3,
                m310descagric3,
                m310ingragric3,
                m310modagriva4,
                m310descagric4,
                m310ingragric4,
                m310sumingresos,
                m310devadqintr,
                m310deventract,
                m310devinvers,
                m310totcuotres,
                m310tdedactfijo,
                m310tdiferencia,
                m310tcuotcompen,
                m310tresultado,
                m310entregasint,
                m310deducant,
                m310resultliq,
                m310impingreso,
                m310impcompen,
                m310cruzefec,
                m310cruzadeu,
                m310cruzsinact,
                m310entingreso,
                m310ofiingreso,
                m310digiingreso,
                m310ctaingreso,
                m310cruzcomp,
                m310numjusti,
                m310cruzdomicil,
                m310entdomicili,
                m310ofidomicili,
                m310digidomicil,
                m310ctadomicili,
                m310munifirma,
                m310dia,
                m310mes,
                m310anyo,
                m310fecha,
                m310percont,
                m310telcont,
                m310observa,
                m310letetiq,
                m310tipodecl,
                m310codelec,
                m310formapago                
                };
            setColumns(array);
            FieldDef arrayf[] = {m310dominio,m310nif,m310ejercicio,m310periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod311 extends TableDef
        {
        // campos
        public FieldDef m311dominio;
        public FieldDef m311nif;
        public FieldDef m311ejercicio;
        public FieldDef m311periodo;
        public FieldDef m311deleg;
        public FieldDef m311admon;
        public FieldDef m311codadmon;
        public FieldDef m311apellidos;
        public FieldDef m311nombre;
        public FieldDef m311siglas;
        public FieldDef m311calle;
        public FieldDef m311numero;
        public FieldDef m311escalera;
        public FieldDef m311piso;
        public FieldDef m311puerta;
        public FieldDef m311cpostal;
        public FieldDef m311municipio;
        public FieldDef m311provincia;
        public FieldDef m311telefono;
        public FieldDef m311modacteo1;
        public FieldDef m311epigrafe1;
        public FieldDef m311ingrsimpli1;
        public FieldDef m311modacteo2;
        public FieldDef m311epigrafe2;
        public FieldDef m311ingrsimpli2;
        public FieldDef m311modacteo3;
        public FieldDef m311epigrafe3;
        public FieldDef m311ingrsimpli3;
        public FieldDef m311modacteo4;
        public FieldDef m311epigrafe4;
        public FieldDef m311ingrsimpli4;
        public FieldDef m311modacteo5;
        public FieldDef m311epigrafe5;
        public FieldDef m311ingrsimpli5;
        public FieldDef m311modagriva1;
        public FieldDef m311descagric1;
        public FieldDef m311ingragric1;
        public FieldDef m311modagriva2;
        public FieldDef m311descagric2;
        public FieldDef m311ingragric2;
        public FieldDef m311modagriva3;
        public FieldDef m311descagric3;
        public FieldDef m311ingragric3;
        public FieldDef m311modagriva4;
        public FieldDef m311descagric4;
        public FieldDef m311ingragric4;
        public FieldDef m311sumcuot;
        public FieldDef m311sumingresos;
        public FieldDef m311resultado;
        public FieldDef m311devadqintr;
        public FieldDef m311deventract;
        public FieldDef m311devinvers;
        public FieldDef m311totcuotres;
        public FieldDef m311tdedactfijo;
        public FieldDef m311regulbienes;
        public FieldDef m311tivadeduc;
        public FieldDef m311tdiferencia;
        public FieldDef m311tcuotcompen;
        public FieldDef m311tresultado;
        public FieldDef m311entregasint;
        public FieldDef m311deducant;
        public FieldDef m311resultliq;
        public FieldDef m311impingreso;
        public FieldDef m311impcompen;
        public FieldDef m311cruzefec;
        public FieldDef m311cruzadeu;
        public FieldDef m311cruzsinact;
        public FieldDef m311entingreso;
        public FieldDef m311ofiingreso;
        public FieldDef m311digiingreso;
        public FieldDef m311ctaingreso;
        public FieldDef m311impdevol;
        public FieldDef m311entdevol;
        public FieldDef m311ofidevol;
        public FieldDef m311digidevol;
        public FieldDef m311ctadevol;
        public FieldDef m311cruzcomp;
        public FieldDef m311numjusti;
        public FieldDef m311munifirma;
        public FieldDef m311dia;
        public FieldDef m311mes;
        public FieldDef m311anyo;
        public FieldDef m311fecha;
        public FieldDef m311percont;
        public FieldDef m311telcont;
        public FieldDef m311observa;
        public FieldDef m311letetiq;
        public FieldDef m311codelec;
        public FieldDef m311tipodecl;
        public FieldDef m311cruzccc;
        public FieldDef m311formapago;
        public TabMod311(String name)
            {
            super(name);
            m311dominio = new FieldDef("m311dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m311nif = new FieldDef("m311nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m311ejercicio = new FieldDef("m311ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m311periodo = new FieldDef("m311periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m311deleg = new FieldDef("m311deleg",FieldDef.CHAR,30);
            m311admon = new FieldDef("m311admon",FieldDef.CHAR,30);
            m311codadmon = new FieldDef("m311codadmon",FieldDef.INTEGER,0);
            m311apellidos = new FieldDef("m311apellidos",FieldDef.CHAR,30);
            m311nombre = new FieldDef("m311nombre",FieldDef.CHAR,15);
            m311siglas = new FieldDef("m311siglas",FieldDef.CHAR,2);
            m311calle = new FieldDef("m311calle",FieldDef.CHAR,17);
            m311numero = new FieldDef("m311numero",FieldDef.CHAR,4);
            m311escalera = new FieldDef("m311escalera",FieldDef.CHAR,2);
            m311piso = new FieldDef("m311piso",FieldDef.CHAR,2);
            m311puerta = new FieldDef("m311puerta",FieldDef.CHAR,2);
            m311cpostal = new FieldDef("m311cpostal",FieldDef.CHAR,5);
            m311municipio = new FieldDef("m311municipio",FieldDef.CHAR,20);
            m311provincia = new FieldDef("m311provincia",FieldDef.CHAR,15);
            m311telefono = new FieldDef("m311telefono",FieldDef.CHAR,9);
            m311modacteo1 = new FieldDef("m311modacteo1",FieldDef.INTEGER,0);
            m311epigrafe1 = new FieldDef("m311epigrafe1",FieldDef.CHAR,7);
            m311ingrsimpli1 = new FieldDef("m311ingrsimpli1",FieldDef.FLOAT,6,0);
            m311modacteo2 = new FieldDef("m311modacteo2",FieldDef.INTEGER,0);
            m311epigrafe2 = new FieldDef("m311epigrafe2",FieldDef.CHAR,7);
            m311ingrsimpli2 = new FieldDef("m311ingrsimpli2",FieldDef.FLOAT,6,0);
            m311modacteo3 = new FieldDef("m311modacteo3",FieldDef.INTEGER,0);
            m311epigrafe3 = new FieldDef("m311epigrafe3",FieldDef.CHAR,7);
            m311ingrsimpli3 = new FieldDef("m311ingrsimpli3",FieldDef.FLOAT,6,0);
            m311modacteo4 = new FieldDef("m311modacteo4",FieldDef.INTEGER,0);
            m311epigrafe4 = new FieldDef("m311epigrafe4",FieldDef.CHAR,7);
            m311ingrsimpli4 = new FieldDef("m311ingrsimpli4",FieldDef.FLOAT,6,0);
            m311modacteo5 = new FieldDef("m311modacteo5",FieldDef.INTEGER,0);
            m311epigrafe5 = new FieldDef("m311epigrafe5",FieldDef.CHAR,7);
            m311ingrsimpli5 = new FieldDef("m311ingrsimpli5",FieldDef.FLOAT,6,0);
            m311modagriva1 = new FieldDef("m311modagriva1",FieldDef.INTEGER,0);
            m311descagric1 = new FieldDef("m311descagric1",FieldDef.CHAR,50);
            m311ingragric1 = new FieldDef("m311ingragric1",FieldDef.FLOAT,6,0);
            m311modagriva2 = new FieldDef("m311modagriva2",FieldDef.INTEGER,0);
            m311descagric2 = new FieldDef("m311descagric2",FieldDef.CHAR,50);
            m311ingragric2 = new FieldDef("m311ingragric2",FieldDef.FLOAT,6,0);
            m311modagriva3 = new FieldDef("m311modagriva3",FieldDef.INTEGER,0);
            m311descagric3 = new FieldDef("m311descagric3",FieldDef.CHAR,50);
            m311ingragric3 = new FieldDef("m311ingragric3",FieldDef.FLOAT,6,0);
            m311modagriva4 = new FieldDef("m311modagriva4",FieldDef.INTEGER,0);
            m311descagric4 = new FieldDef("m311descagric4",FieldDef.CHAR,50);
            m311ingragric4 = new FieldDef("m311ingragric4",FieldDef.FLOAT,6,0);
            m311sumcuot = new FieldDef("m311sumcuot",FieldDef.FLOAT,6,0);
            m311sumingresos = new FieldDef("m311sumingresos",FieldDef.FLOAT,6,0);
            m311resultado = new FieldDef("m311resultado",FieldDef.FLOAT,6,0);
            m311devadqintr = new FieldDef("m311devadqintr",FieldDef.FLOAT,6,0);
            m311deventract = new FieldDef("m311deventract",FieldDef.FLOAT,6,0);
            m311devinvers = new FieldDef("m311devinvers",FieldDef.FLOAT,6,0);
            m311totcuotres = new FieldDef("m311totcuotres",FieldDef.FLOAT,6,0);
            m311tdedactfijo = new FieldDef("m311tdedactfijo",FieldDef.FLOAT,6,0);
            m311regulbienes = new FieldDef("m311regulbienes",FieldDef.FLOAT,6,0);
            m311tivadeduc = new FieldDef("m311tivadeduc",FieldDef.FLOAT,6,0);
            m311tdiferencia = new FieldDef("m311tdiferencia",FieldDef.FLOAT,6,0);
            m311tcuotcompen = new FieldDef("m311tcuotcompen",FieldDef.FLOAT,6,0);
            m311tresultado = new FieldDef("m311tresultado",FieldDef.FLOAT,6,0);
            m311entregasint = new FieldDef("m311entregasint",FieldDef.FLOAT,6,0);
            m311deducant = new FieldDef("m311deducant",FieldDef.FLOAT,6,0);
            m311resultliq = new FieldDef("m311resultliq",FieldDef.FLOAT,6,0);
            m311impingreso = new FieldDef("m311impingreso",FieldDef.FLOAT,6,0);
            m311impcompen = new FieldDef("m311impcompen",FieldDef.FLOAT,6,0);
            m311cruzefec = new FieldDef("m311cruzefec",FieldDef.CHAR,1);
            m311cruzadeu = new FieldDef("m311cruzadeu",FieldDef.CHAR,1);
            m311cruzsinact = new FieldDef("m311cruzsinact",FieldDef.CHAR,1);
            m311entingreso = new FieldDef("m311entingreso",FieldDef.CHAR,4);
            m311ofiingreso = new FieldDef("m311ofiingreso",FieldDef.CHAR,4);
            m311digiingreso = new FieldDef("m311digiingreso",FieldDef.CHAR,2);
            m311ctaingreso = new FieldDef("m311ctaingreso",FieldDef.CHAR,10);
            m311impdevol = new FieldDef("m311impdevol",FieldDef.FLOAT,6,0);
            m311entdevol = new FieldDef("m311entdevol",FieldDef.CHAR,4);
            m311ofidevol = new FieldDef("m311ofidevol",FieldDef.CHAR,4);
            m311digidevol = new FieldDef("m311digidevol",FieldDef.CHAR,2);
            m311ctadevol = new FieldDef("m311ctadevol",FieldDef.CHAR,10);
            m311cruzcomp = new FieldDef("m311cruzcomp",FieldDef.CHAR,1);
            m311numjusti = new FieldDef("m311numjusti",FieldDef.CHAR,16);
            m311munifirma = new FieldDef("m311munifirma",FieldDef.CHAR,30);
            m311dia = new FieldDef("m311dia",FieldDef.CHAR,2);
            m311mes = new FieldDef("m311mes",FieldDef.CHAR,10);
            m311anyo = new FieldDef("m311anyo",FieldDef.CHAR,4);
            m311fecha = new FieldDef("m311fecha",FieldDef.DATE);
            m311percont = new FieldDef("m311percont",FieldDef.CHAR,100);
            m311telcont = new FieldDef("m311telcont",FieldDef.CHAR,9);
            m311observa = new FieldDef("m311observa",FieldDef.CHAR,350);
            m311letetiq = new FieldDef("m311letetiq",FieldDef.CHAR,4);
            m311codelec = new FieldDef("m311codelec",FieldDef.CHAR,16);
            m311tipodecl = new FieldDef("m311tipodecl",FieldDef.CHAR,1);
            m311cruzccc = new FieldDef("m311cruzccc",FieldDef.CHAR,1);
            m311formapago = new FieldDef("m311formapago",FieldDef.INTEGER,0);
            FieldDef array[] = {
                m311dominio,
                m311nif,
                m311ejercicio,
                m311periodo,
                m311deleg,
                m311admon,
                m311codadmon,
                m311apellidos,
                m311nombre,
                m311siglas,
                m311calle,
                m311numero,
                m311escalera,
                m311piso,
                m311puerta,
                m311cpostal,
                m311municipio,
                m311provincia,
                m311telefono,
                m311modacteo1,
                m311epigrafe1,
                m311ingrsimpli1,
                m311modacteo2,
                m311epigrafe2,
                m311ingrsimpli2,
                m311modacteo3,
                m311epigrafe3,
                m311ingrsimpli3,
                m311modacteo4,
                m311epigrafe4,
                m311ingrsimpli4,
                m311modacteo5,
                m311epigrafe5,
                m311ingrsimpli5,
                m311modagriva1,
                m311descagric1,
                m311ingragric1,
                m311modagriva2,
                m311descagric2,
                m311ingragric2,
                m311modagriva3,
                m311descagric3,
                m311ingragric3,
                m311modagriva4,
                m311descagric4,
                m311ingragric4,
                m311sumcuot,
                m311sumingresos,
                m311resultado,
                m311devadqintr,
                m311deventract,
                m311devinvers,
                m311totcuotres,
                m311tdedactfijo,
                m311regulbienes,
                m311tivadeduc,
                m311tdiferencia,
                m311tcuotcompen,
                m311tresultado,
                m311entregasint,
                m311deducant,
                m311resultliq,
                m311impingreso,
                m311impcompen,
                m311cruzefec,
                m311cruzadeu,
                m311cruzsinact,
                m311entingreso,
                m311ofiingreso,
                m311digiingreso,
                m311ctaingreso,
                m311impdevol,
                m311entdevol,
                m311ofidevol,
                m311digidevol,
                m311ctadevol,
                m311cruzcomp,
                m311numjusti,
                m311munifirma,
                m311dia,
                m311mes,
                m311anyo,
                m311fecha,
                m311percont,
                m311telcont,
                m311observa,
                m311letetiq,
                m311codelec,
                m311tipodecl,
                m311cruzccc,
                m311formapago                
                };
            setColumns(array);
            FieldDef arrayf[] = {m311dominio,m311nif,m311ejercicio,m311periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod180e extends TableDef
        {
        // campos
        public FieldDef m180edominio;
        public FieldDef m180enif;
        public FieldDef m180eejercicio;
        public FieldDef m180eperiodo;
        public FieldDef m180edeleg;
        public FieldDef m180eadmon;
        public FieldDef m180ecodadmon;
        public FieldDef m180etelefono;
        public FieldDef m180eapellidos;
        public FieldDef m180esigla;
        public FieldDef m180ecalle;
        public FieldDef m180enumero;
        public FieldDef m180emunicipio;
        public FieldDef m180eprovincia;
        public FieldDef m180ecpostal;
        public FieldDef m180efecha;
        public FieldDef m180edecla;
        public FieldDef m180efirma;
        public FieldDef m180ecargofirm;
        public FieldDef m180edeccomp;
        public FieldDef m180edecsust;
        public FieldDef m180enrojusant;
        public FieldDef m180enrototper;
        public FieldDef m180eimporte;
        public FieldDef m180ereting;
        public FieldDef m180enumdecsop;
        public FieldDef m180enumpersop;
        public FieldDef m180epercont;
        public FieldDef m180etelcont;
        public FieldDef m180eobserva;
        public FieldDef m180eletetiq;
        public FieldDef m180eescalera;
        public FieldDef m180episo;
        public FieldDef m180epuerta;
        public TabMod180e(String name)
            {
            super(name);
            m180edominio = new FieldDef("m180edominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m180enif = new FieldDef("m180enif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m180eejercicio = new FieldDef("m180eejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m180eperiodo = new FieldDef("m180eperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m180edeleg = new FieldDef("m180edeleg",FieldDef.CHAR,30);
            m180eadmon = new FieldDef("m180eadmon",FieldDef.CHAR,30);
            m180ecodadmon = new FieldDef("m180ecodadmon",FieldDef.INTEGER,0);
            m180etelefono = new FieldDef("m180etelefono",FieldDef.CHAR,9);
            m180eapellidos = new FieldDef("m180eapellidos",FieldDef.CHAR,40);
            m180esigla = new FieldDef("m180esigla",FieldDef.CHAR,2);
            m180ecalle = new FieldDef("m180ecalle",FieldDef.CHAR,40);
            m180enumero = new FieldDef("m180enumero",FieldDef.CHAR,5);
            m180emunicipio = new FieldDef("m180emunicipio",FieldDef.CHAR,15);
            m180eprovincia = new FieldDef("m180eprovincia",FieldDef.INTEGER,0);
            m180ecpostal = new FieldDef("m180ecpostal",FieldDef.CHAR,5);
            m180efecha = new FieldDef("m180efecha",FieldDef.DATE);
            m180edecla = new FieldDef("m180edecla",FieldDef.CHAR,1);
            m180efirma = new FieldDef("m180efirma",FieldDef.CHAR,30);
            m180ecargofirm = new FieldDef("m180ecargofirm",FieldDef.CHAR,25);
            m180edeccomp = new FieldDef("m180edeccomp",FieldDef.CHAR,1);
            m180edecsust = new FieldDef("m180edecsust",FieldDef.CHAR,1);
            m180enrojusant = new FieldDef("m180enrojusant",FieldDef.CHAR,16);
            m180enrototper = new FieldDef("m180enrototper",FieldDef.INTEGER,0);
            m180eimporte = new FieldDef("m180eimporte",FieldDef.FLOAT,6,0);
            m180ereting = new FieldDef("m180ereting",FieldDef.FLOAT,6,0);
            m180enumdecsop = new FieldDef("m180enumdecsop",FieldDef.INTEGER,0);
            m180enumpersop = new FieldDef("m180enumpersop",FieldDef.INTEGER,0);
            m180epercont = new FieldDef("m180epercont",FieldDef.CHAR,100);
            m180etelcont = new FieldDef("m180etelcont",FieldDef.CHAR,9);
            m180eobserva = new FieldDef("m180eobserva",FieldDef.CHAR,350);
            m180eletetiq = new FieldDef("m180eletetiq",FieldDef.CHAR,4);
            m180eescalera = new FieldDef("m180eescalera",FieldDef.CHAR,2);
            m180episo = new FieldDef("m180episo",FieldDef.CHAR,2);
            m180epuerta = new FieldDef("m180epuerta",FieldDef.CHAR,2);
            FieldDef array[] = {
                m180edominio,
                m180enif,
                m180eejercicio,
                m180eperiodo,
                m180edeleg,
                m180eadmon,
                m180ecodadmon,
                m180etelefono,
                m180eapellidos,
                m180esigla,
                m180ecalle,
                m180enumero,
                m180emunicipio,
                m180eprovincia,
                m180ecpostal,
                m180efecha,
                m180edecla,
                m180efirma,
                m180ecargofirm,
                m180edeccomp,
                m180edecsust,
                m180enrojusant,
                m180enrototper,
                m180eimporte,
                m180ereting,
                m180enumdecsop,
                m180enumpersop,
                m180epercont,
                m180etelcont,
                m180eobserva,
                m180eletetiq,
                m180eescalera,
                m180episo,
                m180epuerta                
                };
            setColumns(array);
            FieldDef arrayf[] = {m180edominio,m180enif,m180eejercicio,m180eperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod190c extends TableDef
        {
        // campos
        public FieldDef m190cdominio;
        public FieldDef m190cnif;
        public FieldDef m190cejercicio;
        public FieldDef m190cperiodo;
        public FieldDef m190cdelegacio;
        public FieldDef m190cadmon;
        public FieldDef m190ccodiadmon;
        public FieldDef m190crazon;
        public FieldDef m190ctelef;
        public FieldDef m190csigla;
        public FieldDef m190cvia;
        public FieldDef m190cnumero;
        public FieldDef m190cescala;
        public FieldDef m190cpiso;
        public FieldDef m190cpuerta;
        public FieldDef m190cmuni;
        public FieldDef m190cprovin;
        public FieldDef m190cpostal;
        public FieldDef m190ctiposop;
        public FieldDef m190cnomrel;
        public FieldDef m190cjustif;
        public FieldDef m190csigno;
        public FieldDef m190cimpreso;
        public FieldDef m190cindivi;
        public FieldDef m190ccolpre;
        public FieldDef m190ccolrete;
        public FieldDef m190ccomplem;
        public FieldDef m190csusti;
        public FieldDef m190cnumdecla;
        public FieldDef m190ctotalper;
        public FieldDef m190cimppercep;
        public FieldDef m190cimpreten;
        public FieldDef m190cnumcolec;
        public FieldDef m190cnumpercol;
        public FieldDef m190cnumpresen;
        public FieldDef m190cfecha;
        public FieldDef m190cretenedor;
        public FieldDef m190cprecolec;
        public FieldDef m190cfirmante;
        public FieldDef m190ccargofirma;
        public FieldDef m190cpercont;
        public FieldDef m190ctelcont;
        public FieldDef m190cobserva;
        public FieldDef m190cletetiq;
        public FieldDef m190cemail;
        public TabMod190c(String name)
            {
            super(name);
            m190cdominio = new FieldDef("m190cdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m190cnif = new FieldDef("m190cnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m190cejercicio = new FieldDef("m190cejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m190cperiodo = new FieldDef("m190cperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m190cdelegacio = new FieldDef("m190cdelegacio",FieldDef.CHAR,30);
            m190cadmon = new FieldDef("m190cadmon",FieldDef.CHAR,30);
            m190ccodiadmon = new FieldDef("m190ccodiadmon",FieldDef.CHAR,5);
            m190crazon = new FieldDef("m190crazon",FieldDef.CHAR,40);
            m190ctelef = new FieldDef("m190ctelef",FieldDef.CHAR,9);
            m190csigla = new FieldDef("m190csigla",FieldDef.CHAR,2);
            m190cvia = new FieldDef("m190cvia",FieldDef.CHAR,20);
            m190cnumero = new FieldDef("m190cnumero",FieldDef.CHAR,4);
            m190cescala = new FieldDef("m190cescala",FieldDef.CHAR,2);
            m190cpiso = new FieldDef("m190cpiso",FieldDef.CHAR,2);
            m190cpuerta = new FieldDef("m190cpuerta",FieldDef.CHAR,2);
            m190cmuni = new FieldDef("m190cmuni",FieldDef.CHAR,20);
            m190cprovin = new FieldDef("m190cprovin",FieldDef.CHAR,15);
            m190cpostal = new FieldDef("m190cpostal",FieldDef.CHAR,5);
            m190ctiposop = new FieldDef("m190ctiposop",FieldDef.CHAR,1);
            m190cnomrel = new FieldDef("m190cnomrel",FieldDef.CHAR,40);
            m190cjustif = new FieldDef("m190cjustif",FieldDef.CHAR,16);
            m190csigno = new FieldDef("m190csigno",FieldDef.CHAR,1);
            m190cimpreso = new FieldDef("m190cimpreso",FieldDef.CHAR,1);
            m190cindivi = new FieldDef("m190cindivi",FieldDef.CHAR,1);
            m190ccolpre = new FieldDef("m190ccolpre",FieldDef.CHAR,1);
            m190ccolrete = new FieldDef("m190ccolrete",FieldDef.CHAR,1);
            m190ccomplem = new FieldDef("m190ccomplem",FieldDef.CHAR,1);
            m190csusti = new FieldDef("m190csusti",FieldDef.CHAR,1);
            m190cnumdecla = new FieldDef("m190cnumdecla",FieldDef.CHAR,16);
            m190ctotalper = new FieldDef("m190ctotalper",FieldDef.INTEGER,0);
            m190cimppercep = new FieldDef("m190cimppercep",FieldDef.FLOAT,6,0);
            m190cimpreten = new FieldDef("m190cimpreten",FieldDef.FLOAT,6,0);
            m190cnumcolec = new FieldDef("m190cnumcolec",FieldDef.INTEGER,0);
            m190cnumpercol = new FieldDef("m190cnumpercol",FieldDef.FLOAT,6,0);
            m190cnumpresen = new FieldDef("m190cnumpresen",FieldDef.CHAR,13);
            m190cfecha = new FieldDef("m190cfecha",FieldDef.DATE);
            m190cretenedor = new FieldDef("m190cretenedor",FieldDef.CHAR,1);
            m190cprecolec = new FieldDef("m190cprecolec",FieldDef.CHAR,1);
            m190cfirmante = new FieldDef("m190cfirmante",FieldDef.CHAR,30);
            m190ccargofirma = new FieldDef("m190ccargofirma",FieldDef.CHAR,30);
            m190cpercont = new FieldDef("m190cpercont",FieldDef.CHAR,100);
            m190ctelcont = new FieldDef("m190ctelcont",FieldDef.CHAR,9);
            m190cobserva = new FieldDef("m190cobserva",FieldDef.CHAR,350);
            m190cletetiq = new FieldDef("m190cletetiq",FieldDef.CHAR,4);
            m190cemail = new FieldDef("m190cemail",FieldDef.CHAR,50);
            FieldDef array[] = {
                m190cdominio,
                m190cnif,
                m190cejercicio,
                m190cperiodo,
                m190cdelegacio,
                m190cadmon,
                m190ccodiadmon,
                m190crazon,
                m190ctelef,
                m190csigla,
                m190cvia,
                m190cnumero,
                m190cescala,
                m190cpiso,
                m190cpuerta,
                m190cmuni,
                m190cprovin,
                m190cpostal,
                m190ctiposop,
                m190cnomrel,
                m190cjustif,
                m190csigno,
                m190cimpreso,
                m190cindivi,
                m190ccolpre,
                m190ccolrete,
                m190ccomplem,
                m190csusti,
                m190cnumdecla,
                m190ctotalper,
                m190cimppercep,
                m190cimpreten,
                m190cnumcolec,
                m190cnumpercol,
                m190cnumpresen,
                m190cfecha,
                m190cretenedor,
                m190cprecolec,
                m190cfirmante,
                m190ccargofirma,
                m190cpercont,
                m190ctelcont,
                m190cobserva,
                m190cletetiq,
                m190cemail                
                };
            setColumns(array);
            FieldDef arrayf[] = {m190cdominio,m190cnif,m190cejercicio,m190cperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod190d extends TableDef
        {
        // campos
        public FieldDef m190dident;
        public FieldDef m190ddominio;
        public FieldDef m190dnif;
        public FieldDef m190dejercicio;
        public FieldDef m190dperiodo;
        public FieldDef m190dnumhoja;
        public FieldDef m190dtotalhoja;
        public FieldDef m190dnifper;
        public FieldDef m190dnifrepre;
        public FieldDef m190dnombre;
        public FieldDef m190dprovincia;
        public FieldDef m190dclave;
        public FieldDef m190dsubclave;
        public FieldDef m190ddineraria;
        public FieldDef m190dretencio;
        public FieldDef m190despecie;
        public FieldDef m190dingcta;
        public FieldDef m190dingrepercu;
        public FieldDef m190dejerdev;
        public FieldDef m190dceuta;
        public FieldDef m190dnacimi;
        public FieldDef m190discapa;
        public FieldDef m190dtipocto;
        public FieldDef m190dsitfami;
        public FieldDef m190dnifconyu;
        public FieldDef m190dreduccion;
        public FieldDef m190dgastos;
        public FieldDef m190dpension;
        public FieldDef m190danualid;
        public FieldDef m190dmenos3;
        public FieldDef m190dmenos16;
        public FieldDef m190dmenos25;
        public FieldDef m190dmenos65;
        public FieldDef m190dmas65;
        public FieldDef m190dtotaldes;
        public FieldDef m190descentero;
        public FieldDef m190dtotalasce;
        public FieldDef m190dascentero;
        public FieldDef m190dascmenos65;
        public FieldDef m190dascmas65;
        public FieldDef m190dtotal1;
        public FieldDef m190dtotalret;
        public FieldDef m190dliscertif;
        public FieldDef m190dpensioemp;
        public FieldDef m190dproactlab;
        public FieldDef m190dmoviligeo;
        public FieldDef m190dmenos3ent;
        public FieldDef m190desresto;
        public FieldDef m190desrestoent;
        public FieldDef m190dmenos65ent;
        public FieldDef m190ddmovred;
        public FieldDef m190ddmovredent;
        public FieldDef m190dmas65ent;
        public FieldDef m190dasmen75;
        public FieldDef m190dasmen75ent;
        public FieldDef m190dasmas75;
        public FieldDef m190dasmas75ent;
        public FieldDef m190dasmen65ent;
        public FieldDef m190damovred;
        public FieldDef m190damovredent;
        public FieldDef m190dasmas65ent;
        public FieldDef m190dmufrevi;
        public FieldDef m190dcentrotrab;
        public FieldDef m190dcodtrab;
        public FieldDef m190dcompuhijo1;
        public FieldDef m190dcompuhijo2;
        public FieldDef m190dcompuhijo3;
        public FieldDef m190dvivfinan;
        public FieldDef m190dmovgeo15;
        public FieldDef m190dinlaperint;
        public FieldDef m190dinlareten;
        public FieldDef m190dinlaingcta;
        public FieldDef m190dinlavalora;
        public FieldDef m190dinlaingefe;
        public TabMod190d(String name)
            {
            super(name);
            m190dident = new FieldDef("m190dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m190ddominio = new FieldDef("m190ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m190dnif = new FieldDef("m190dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m190dejercicio = new FieldDef("m190dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m190dperiodo = new FieldDef("m190dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m190dnumhoja = new FieldDef("m190dnumhoja",FieldDef.INTEGER,0);
            m190dtotalhoja = new FieldDef("m190dtotalhoja",FieldDef.INTEGER,0);
            m190dnifper = new FieldDef("m190dnifper",FieldDef.CHAR,15);
            m190dnifrepre = new FieldDef("m190dnifrepre",FieldDef.CHAR,15);
            m190dnombre = new FieldDef("m190dnombre",FieldDef.CHAR,30);
            m190dprovincia = new FieldDef("m190dprovincia",FieldDef.INTEGER,0);
            m190dclave = new FieldDef("m190dclave",FieldDef.CHAR,1);
            m190dsubclave = new FieldDef("m190dsubclave",FieldDef.CHAR,2);
            m190ddineraria = new FieldDef("m190ddineraria",FieldDef.FLOAT,6,0);
            m190dretencio = new FieldDef("m190dretencio",FieldDef.FLOAT,6,0);
            m190despecie = new FieldDef("m190despecie",FieldDef.FLOAT,6,0);
            m190dingcta = new FieldDef("m190dingcta",FieldDef.FLOAT,6,0);
            m190dingrepercu = new FieldDef("m190dingrepercu",FieldDef.FLOAT,6,0);
            m190dejerdev = new FieldDef("m190dejerdev",FieldDef.INTEGER,0);
            m190dceuta = new FieldDef("m190dceuta",FieldDef.CHAR,1);
            m190dnacimi = new FieldDef("m190dnacimi",FieldDef.INTEGER,0);
            m190discapa = new FieldDef("m190discapa",FieldDef.CHAR,1);
            m190dtipocto = new FieldDef("m190dtipocto",FieldDef.CHAR,1);
            m190dsitfami = new FieldDef("m190dsitfami",FieldDef.CHAR,1);
            m190dnifconyu = new FieldDef("m190dnifconyu",FieldDef.CHAR,15);
            m190dreduccion = new FieldDef("m190dreduccion",FieldDef.FLOAT,6,0);
            m190dgastos = new FieldDef("m190dgastos",FieldDef.FLOAT,6,0);
            m190dpension = new FieldDef("m190dpension",FieldDef.FLOAT,6,0);
            m190danualid = new FieldDef("m190danualid",FieldDef.FLOAT,6,0);
            m190dmenos3 = new FieldDef("m190dmenos3",FieldDef.INTEGER,0);
            m190dmenos16 = new FieldDef("m190dmenos16",FieldDef.INTEGER,0);
            m190dmenos25 = new FieldDef("m190dmenos25",FieldDef.INTEGER,0);
            m190dmenos65 = new FieldDef("m190dmenos65",FieldDef.INTEGER,0);
            m190dmas65 = new FieldDef("m190dmas65",FieldDef.INTEGER,0);
            m190dtotaldes = new FieldDef("m190dtotaldes",FieldDef.INTEGER,0);
            m190descentero = new FieldDef("m190descentero",FieldDef.INTEGER,0);
            m190dtotalasce = new FieldDef("m190dtotalasce",FieldDef.INTEGER,0);
            m190dascentero = new FieldDef("m190dascentero",FieldDef.INTEGER,0);
            m190dascmenos65 = new FieldDef("m190dascmenos65",FieldDef.INTEGER,0);
            m190dascmas65 = new FieldDef("m190dascmas65",FieldDef.INTEGER,0);
            m190dtotal1 = new FieldDef("m190dtotal1",FieldDef.FLOAT,6,0);
            m190dtotalret = new FieldDef("m190dtotalret",FieldDef.FLOAT,6,0);
            m190dliscertif = new FieldDef("m190dliscertif",FieldDef.CHAR,1);
            m190dpensioemp = new FieldDef("m190dpensioemp",FieldDef.FLOAT,6,0);
            m190dproactlab = new FieldDef("m190dproactlab",FieldDef.CHAR,1);
            m190dmoviligeo = new FieldDef("m190dmoviligeo",FieldDef.CHAR,1);
            m190dmenos3ent = new FieldDef("m190dmenos3ent",FieldDef.INTEGER,0);
            m190desresto = new FieldDef("m190desresto",FieldDef.INTEGER,0);
            m190desrestoent = new FieldDef("m190desrestoent",FieldDef.INTEGER,0);
            m190dmenos65ent = new FieldDef("m190dmenos65ent",FieldDef.INTEGER,0);
            m190ddmovred = new FieldDef("m190ddmovred",FieldDef.INTEGER,0);
            m190ddmovredent = new FieldDef("m190ddmovredent",FieldDef.INTEGER,0);
            m190dmas65ent = new FieldDef("m190dmas65ent",FieldDef.INTEGER,0);
            m190dasmen75 = new FieldDef("m190dasmen75",FieldDef.INTEGER,0);
            m190dasmen75ent = new FieldDef("m190dasmen75ent",FieldDef.INTEGER,0);
            m190dasmas75 = new FieldDef("m190dasmas75",FieldDef.INTEGER,0);
            m190dasmas75ent = new FieldDef("m190dasmas75ent",FieldDef.INTEGER,0);
            m190dasmen65ent = new FieldDef("m190dasmen65ent",FieldDef.INTEGER,0);
            m190damovred = new FieldDef("m190damovred",FieldDef.INTEGER,0);
            m190damovredent = new FieldDef("m190damovredent",FieldDef.INTEGER,0);
            m190dasmas65ent = new FieldDef("m190dasmas65ent",FieldDef.INTEGER,0);
            m190dmufrevi = new FieldDef("m190dmufrevi",FieldDef.CHAR,1);
            m190dcentrotrab = new FieldDef("m190dcentrotrab",FieldDef.CHAR,12);
            m190dcodtrab = new FieldDef("m190dcodtrab",FieldDef.CHAR,12);
            m190dcompuhijo1 = new FieldDef("m190dcompuhijo1",FieldDef.INTEGER,0);
            m190dcompuhijo2 = new FieldDef("m190dcompuhijo2",FieldDef.INTEGER,0);
            m190dcompuhijo3 = new FieldDef("m190dcompuhijo3",FieldDef.INTEGER,0);
            m190dvivfinan = new FieldDef("m190dvivfinan",FieldDef.INTEGER,0);
            m190dmovgeo15 = new FieldDef("m190dmovgeo15",FieldDef.CHAR,1);
            m190dinlaperint = new FieldDef("m190dinlaperint",FieldDef.FLOAT,6,0);
            m190dinlareten = new FieldDef("m190dinlareten",FieldDef.FLOAT,6,0);
            m190dinlaingcta = new FieldDef("m190dinlaingcta",FieldDef.FLOAT,6,0);
            m190dinlavalora = new FieldDef("m190dinlavalora",FieldDef.FLOAT,6,0);
            m190dinlaingefe = new FieldDef("m190dinlaingefe",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m190dident,
                m190ddominio,
                m190dnif,
                m190dejercicio,
                m190dperiodo,
                m190dnumhoja,
                m190dtotalhoja,
                m190dnifper,
                m190dnifrepre,
                m190dnombre,
                m190dprovincia,
                m190dclave,
                m190dsubclave,
                m190ddineraria,
                m190dretencio,
                m190despecie,
                m190dingcta,
                m190dingrepercu,
                m190dejerdev,
                m190dceuta,
                m190dnacimi,
                m190discapa,
                m190dtipocto,
                m190dsitfami,
                m190dnifconyu,
                m190dreduccion,
                m190dgastos,
                m190dpension,
                m190danualid,
                m190dmenos3,
                m190dmenos16,
                m190dmenos25,
                m190dmenos65,
                m190dmas65,
                m190dtotaldes,
                m190descentero,
                m190dtotalasce,
                m190dascentero,
                m190dascmenos65,
                m190dascmas65,
                m190dtotal1,
                m190dtotalret,
                m190dliscertif,
                m190dpensioemp,
                m190dproactlab,
                m190dmoviligeo,
                m190dmenos3ent,
                m190desresto,
                m190desrestoent,
                m190dmenos65ent,
                m190ddmovred,
                m190ddmovredent,
                m190dmas65ent,
                m190dasmen75,
                m190dasmen75ent,
                m190dasmas75,
                m190dasmas75ent,
                m190dasmen65ent,
                m190damovred,
                m190damovredent,
                m190dasmas65ent,
                m190dmufrevi,
                m190dcentrotrab,
                m190dcodtrab,
                m190dcompuhijo1,
                m190dcompuhijo2,
                m190dcompuhijo3,
                m190dvivfinan,
                m190dmovgeo15,
                m190dinlaperint,
                m190dinlareten,
                m190dinlaingcta,
                m190dinlavalora,
                m190dinlaingefe                
                };
            setColumns(array);
            FieldDef arrayf[] = {m190dident };
            setPrimaryKeys(arrayf);
            m190dident.setAutoIncrementable(true);
            m190dinlaperint.setDescription("Percepción íntegra/valoración derivada de incapacidad laboral");
            m190dinlareten.setDescription("Retenciones practicadas/ingresos a cuenta efectuados derivadas de incapacidad laboral");
            m190dinlaingcta.setDescription("Ingresos a cuenta repercutidos derivados de incapacidad laboral");
            m190dinlavalora.setDescription("Valoracion en especies de incapacidad laboral");
            m190dinlaingefe.setDescription("Ingresos a cuenta efectuados derivados de incapacidad laboral");
            }
        }
        
    public class TabCertifgral extends TableDef
        {
        // campos
        public FieldDef cerdominio;
        public FieldDef cerpercepnif;
        public FieldDef cerejercicio;
        public FieldDef cerperiodo;
        public FieldDef cernomperce;
        public FieldDef cernompaga;
        public FieldDef cerpaganif;
        public FieldDef cerpagadomi;
        public FieldDef cerpaganum;
        public FieldDef cerpagaesc;
        public FieldDef cerpagapiso;
        public FieldDef cerpagapuerta;
        public FieldDef cerpagatelf;
        public FieldDef cerpagamuni;
        public FieldDef cerpagaprovin;
        public FieldDef cerpagapostal;
        public FieldDef cerretencion;
        public FieldDef cerimpintegro;
        public FieldDef cervaloracion;
        public FieldDef ceringrecta;
        public FieldDef ceringrereperc;
        public FieldDef cerimpimputado;
        public FieldDef cerreducciones;
        public FieldDef cergastos;
        public FieldDef cerejercdev1;
        public FieldDef cerejercdev2;
        public FieldDef cerejercdev3;
        public FieldDef cerejercdev4;
        public FieldDef cerretencion1;
        public FieldDef cerretencion2;
        public FieldDef cerretencion3;
        public FieldDef cerretencion4;
        public FieldDef cerimporte1;
        public FieldDef cerimporte2;
        public FieldDef cerimporte3;
        public FieldDef cerimporte4;
        public FieldDef cerejercper1;
        public FieldDef cerejercper2;
        public FieldDef cerejercper3;
        public FieldDef cerimpor1;
        public FieldDef cerimpor2;
        public FieldDef cerimpor3;
        public FieldDef cerimpordiet;
        public FieldDef cerimpexenta;
        public FieldDef cerpremimeta;
        public FieldDef cerpremiimpo;
        public FieldDef cerpremiespe;
        public FieldDef cerpremicta;
        public FieldDef cerpremireper;
        public FieldDef cerlugarfirma;
        public FieldDef cerdiafirma;
        public FieldDef cermesfirma;
        public FieldDef ceranofirma;
        public FieldDef cerfirmante;
        public TabCertifgral(String name)
            {
            super(name);
            cerdominio = new FieldDef("cerdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            cerpercepnif = new FieldDef("cerpercepnif",FieldDef.CHAR,15);
            cerejercicio = new FieldDef("cerejercicio",FieldDef.INTEGER,0);
            cerperiodo = new FieldDef("cerperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            cernomperce = new FieldDef("cernomperce",FieldDef.CHAR,30);
            cernompaga = new FieldDef("cernompaga",FieldDef.CHAR,30);
            cerpaganif = new FieldDef("cerpaganif",FieldDef.CHAR,15);
            cerpagadomi = new FieldDef("cerpagadomi",FieldDef.CHAR,20);
            cerpaganum = new FieldDef("cerpaganum",FieldDef.CHAR,4);
            cerpagaesc = new FieldDef("cerpagaesc",FieldDef.CHAR,2);
            cerpagapiso = new FieldDef("cerpagapiso",FieldDef.CHAR,2);
            cerpagapuerta = new FieldDef("cerpagapuerta",FieldDef.CHAR,2);
            cerpagatelf = new FieldDef("cerpagatelf",FieldDef.CHAR,9);
            cerpagamuni = new FieldDef("cerpagamuni",FieldDef.CHAR,20);
            cerpagaprovin = new FieldDef("cerpagaprovin",FieldDef.INTEGER,0);
            cerpagapostal = new FieldDef("cerpagapostal",FieldDef.CHAR,5);
            cerretencion = new FieldDef("cerretencion",FieldDef.FLOAT,6,0);
            cerimpintegro = new FieldDef("cerimpintegro",FieldDef.FLOAT,6,0);
            cervaloracion = new FieldDef("cervaloracion",FieldDef.FLOAT,6,0);
            ceringrecta = new FieldDef("ceringrecta",FieldDef.FLOAT,6,0);
            ceringrereperc = new FieldDef("ceringrereperc",FieldDef.FLOAT,6,0);
            cerimpimputado = new FieldDef("cerimpimputado",FieldDef.FLOAT,6,0);
            cerreducciones = new FieldDef("cerreducciones",FieldDef.FLOAT,6,0);
            cergastos = new FieldDef("cergastos",FieldDef.FLOAT,6,0);
            cerejercdev1 = new FieldDef("cerejercdev1",FieldDef.INTEGER,0);
            cerejercdev2 = new FieldDef("cerejercdev2",FieldDef.INTEGER,0);
            cerejercdev3 = new FieldDef("cerejercdev3",FieldDef.INTEGER,0);
            cerejercdev4 = new FieldDef("cerejercdev4",FieldDef.INTEGER,0);
            cerretencion1 = new FieldDef("cerretencion1",FieldDef.FLOAT,6,0);
            cerretencion2 = new FieldDef("cerretencion2",FieldDef.FLOAT,6,0);
            cerretencion3 = new FieldDef("cerretencion3",FieldDef.FLOAT,6,0);
            cerretencion4 = new FieldDef("cerretencion4",FieldDef.FLOAT,6,0);
            cerimporte1 = new FieldDef("cerimporte1",FieldDef.FLOAT,6,0);
            cerimporte2 = new FieldDef("cerimporte2",FieldDef.FLOAT,6,0);
            cerimporte3 = new FieldDef("cerimporte3",FieldDef.FLOAT,6,0);
            cerimporte4 = new FieldDef("cerimporte4",FieldDef.FLOAT,6,0);
            cerejercper1 = new FieldDef("cerejercper1",FieldDef.INTEGER,0);
            cerejercper2 = new FieldDef("cerejercper2",FieldDef.INTEGER,0);
            cerejercper3 = new FieldDef("cerejercper3",FieldDef.INTEGER,0);
            cerimpor1 = new FieldDef("cerimpor1",FieldDef.FLOAT,6,0);
            cerimpor2 = new FieldDef("cerimpor2",FieldDef.FLOAT,6,0);
            cerimpor3 = new FieldDef("cerimpor3",FieldDef.FLOAT,6,0);
            cerimpordiet = new FieldDef("cerimpordiet",FieldDef.FLOAT,6,0);
            cerimpexenta = new FieldDef("cerimpexenta",FieldDef.FLOAT,6,0);
            cerpremimeta = new FieldDef("cerpremimeta",FieldDef.FLOAT,6,0);
            cerpremiimpo = new FieldDef("cerpremiimpo",FieldDef.FLOAT,6,0);
            cerpremiespe = new FieldDef("cerpremiespe",FieldDef.FLOAT,6,0);
            cerpremicta = new FieldDef("cerpremicta",FieldDef.FLOAT,6,0);
            cerpremireper = new FieldDef("cerpremireper",FieldDef.FLOAT,6,0);
            cerlugarfirma = new FieldDef("cerlugarfirma",FieldDef.CHAR,20);
            cerdiafirma = new FieldDef("cerdiafirma",FieldDef.CHAR,2);
            cermesfirma = new FieldDef("cermesfirma",FieldDef.CHAR,20);
            ceranofirma = new FieldDef("ceranofirma",FieldDef.INTEGER,0);
            cerfirmante = new FieldDef("cerfirmante",FieldDef.CHAR,30);
            FieldDef array[] = {
                cerdominio,
                cerpercepnif,
                cerejercicio,
                cerperiodo,
                cernomperce,
                cernompaga,
                cerpaganif,
                cerpagadomi,
                cerpaganum,
                cerpagaesc,
                cerpagapiso,
                cerpagapuerta,
                cerpagatelf,
                cerpagamuni,
                cerpagaprovin,
                cerpagapostal,
                cerretencion,
                cerimpintegro,
                cervaloracion,
                ceringrecta,
                ceringrereperc,
                cerimpimputado,
                cerreducciones,
                cergastos,
                cerejercdev1,
                cerejercdev2,
                cerejercdev3,
                cerejercdev4,
                cerretencion1,
                cerretencion2,
                cerretencion3,
                cerretencion4,
                cerimporte1,
                cerimporte2,
                cerimporte3,
                cerimporte4,
                cerejercper1,
                cerejercper2,
                cerejercper3,
                cerimpor1,
                cerimpor2,
                cerimpor3,
                cerimpordiet,
                cerimpexenta,
                cerpremimeta,
                cerpremiimpo,
                cerpremiespe,
                cerpremicta,
                cerpremireper,
                cerlugarfirma,
                cerdiafirma,
                cermesfirma,
                ceranofirma,
                cerfirmante                
                };
            setColumns(array);
            FieldDef arrayf[] = {cerdominio,cerpercepnif,cerejercicio,cerperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabCertiprof extends TableDef
        {
        // campos
        public FieldDef cepdominio;
        public FieldDef ceppercepnif;
        public FieldDef cepejercicio;
        public FieldDef cepperiodo;
        public FieldDef cepnomperce;
        public FieldDef cepnompaga;
        public FieldDef ceppaganif;
        public FieldDef ceppagadomi;
        public FieldDef ceppaganum;
        public FieldDef ceppagaesc;
        public FieldDef ceppagapiso;
        public FieldDef ceppagapuerta;
        public FieldDef ceppagatelf;
        public FieldDef ceppagamuni;
        public FieldDef ceppagaprovin;
        public FieldDef ceppagapostal;
        public FieldDef cepretencion;
        public FieldDef cepimpintegro;
        public FieldDef cepvaloracion;
        public FieldDef cepingrecta;
        public FieldDef cepingrereper;
        public FieldDef cepagrireten;
        public FieldDef cepagriimpor;
        public FieldDef cepagrivalora;
        public FieldDef cepagringcta;
        public FieldDef cepagringreper;
        public FieldDef cepcontraret;
        public FieldDef cepcontraimp;
        public FieldDef cepcontraespe;
        public FieldDef cepcontraingr;
        public FieldDef cepcontrareper;
        public FieldDef ceplugarfirma;
        public FieldDef cepdiafirma;
        public FieldDef cepmesfirma;
        public FieldDef cepanofirma;
        public FieldDef cepfirmante;
        public TabCertiprof(String name)
            {
            super(name);
            cepdominio = new FieldDef("cepdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            ceppercepnif = new FieldDef("ceppercepnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            cepejercicio = new FieldDef("cepejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            cepperiodo = new FieldDef("cepperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            cepnomperce = new FieldDef("cepnomperce",FieldDef.CHAR,30);
            cepnompaga = new FieldDef("cepnompaga",FieldDef.CHAR,30);
            ceppaganif = new FieldDef("ceppaganif",FieldDef.CHAR,15);
            ceppagadomi = new FieldDef("ceppagadomi",FieldDef.CHAR,20);
            ceppaganum = new FieldDef("ceppaganum",FieldDef.CHAR,4);
            ceppagaesc = new FieldDef("ceppagaesc",FieldDef.CHAR,2);
            ceppagapiso = new FieldDef("ceppagapiso",FieldDef.CHAR,2);
            ceppagapuerta = new FieldDef("ceppagapuerta",FieldDef.CHAR,2);
            ceppagatelf = new FieldDef("ceppagatelf",FieldDef.CHAR,9);
            ceppagamuni = new FieldDef("ceppagamuni",FieldDef.CHAR,20);
            ceppagaprovin = new FieldDef("ceppagaprovin",FieldDef.INTEGER,0);
            ceppagapostal = new FieldDef("ceppagapostal",FieldDef.CHAR,5);
            cepretencion = new FieldDef("cepretencion",FieldDef.FLOAT,6,0);
            cepimpintegro = new FieldDef("cepimpintegro",FieldDef.FLOAT,6,0);
            cepvaloracion = new FieldDef("cepvaloracion",FieldDef.FLOAT,6,0);
            cepingrecta = new FieldDef("cepingrecta",FieldDef.FLOAT,6,0);
            cepingrereper = new FieldDef("cepingrereper",FieldDef.FLOAT,6,0);
            cepagrireten = new FieldDef("cepagrireten",FieldDef.FLOAT,6,0);
            cepagriimpor = new FieldDef("cepagriimpor",FieldDef.FLOAT,6,0);
            cepagrivalora = new FieldDef("cepagrivalora",FieldDef.FLOAT,6,0);
            cepagringcta = new FieldDef("cepagringcta",FieldDef.FLOAT,6,0);
            cepagringreper = new FieldDef("cepagringreper",FieldDef.FLOAT,6,0);
            cepcontraret = new FieldDef("cepcontraret",FieldDef.FLOAT,6,0);
            cepcontraimp = new FieldDef("cepcontraimp",FieldDef.FLOAT,6,0);
            cepcontraespe = new FieldDef("cepcontraespe",FieldDef.FLOAT,6,0);
            cepcontraingr = new FieldDef("cepcontraingr",FieldDef.FLOAT,6,0);
            cepcontrareper = new FieldDef("cepcontrareper",FieldDef.FLOAT,6,0);
            ceplugarfirma = new FieldDef("ceplugarfirma",FieldDef.CHAR,20);
            cepdiafirma = new FieldDef("cepdiafirma",FieldDef.CHAR,2);
            cepmesfirma = new FieldDef("cepmesfirma",FieldDef.CHAR,20);
            cepanofirma = new FieldDef("cepanofirma",FieldDef.INTEGER,0);
            cepfirmante = new FieldDef("cepfirmante",FieldDef.CHAR,30);
            FieldDef array[] = {
                cepdominio,
                ceppercepnif,
                cepejercicio,
                cepperiodo,
                cepnomperce,
                cepnompaga,
                ceppaganif,
                ceppagadomi,
                ceppaganum,
                ceppagaesc,
                ceppagapiso,
                ceppagapuerta,
                ceppagatelf,
                ceppagamuni,
                ceppagaprovin,
                ceppagapostal,
                cepretencion,
                cepimpintegro,
                cepvaloracion,
                cepingrecta,
                cepingrereper,
                cepagrireten,
                cepagriimpor,
                cepagrivalora,
                cepagringcta,
                cepagringreper,
                cepcontraret,
                cepcontraimp,
                cepcontraespe,
                cepcontraingr,
                cepcontrareper,
                ceplugarfirma,
                cepdiafirma,
                cepmesfirma,
                cepanofirma,
                cepfirmante                
                };
            setColumns(array);
            FieldDef arrayf[] = {cepdominio,ceppercepnif,cepejercicio,cepperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod347c extends TableDef
        {
        // campos
        public FieldDef m347cdominio;
        public FieldDef m347cnif;
        public FieldDef m347cejercicio;
        public FieldDef m347cperiodo;
        public FieldDef m347cdelegacio;
        public FieldDef m347cadmon;
        public FieldDef m347ccodiadmon;
        public FieldDef m347crazon;
        public FieldDef m347ctelef;
        public FieldDef m347csigla;
        public FieldDef m347cvia;
        public FieldDef m347cnumero;
        public FieldDef m347cescala;
        public FieldDef m347cpiso;
        public FieldDef m347cpuerta;
        public FieldDef m347cmuni;
        public FieldDef m347cprovin;
        public FieldDef m347cpostal;
        public FieldDef m347ctiposop;
        public FieldDef m347cnomrel;
        public FieldDef m347cimpreso;
        public FieldDef m347cindivi;
        public FieldDef m347ccolpre;
        public FieldDef m347ccolrete;
        public FieldDef m347ccomplem;
        public FieldDef m347csusti;
        public FieldDef m347cnumdecla;
        public FieldDef m347ctotalper;
        public FieldDef m347cimpsop;
        public FieldDef m347ctotinmue;
        public FieldDef m347cimplocal;
        public FieldDef m347cdeclarants;
        public FieldDef m347cdeclarados;
        public FieldDef m347cnumpre;
        public FieldDef m347cfecha;
        public FieldDef m347cdecla;
        public FieldDef m347cfirmante;
        public FieldDef m347ccargofirma;
        public FieldDef m347ctelcont;
        public FieldDef m347cpercont;
        public FieldDef m347cobserva;
        public FieldDef m347cletetiq;
        public FieldDef m347cnifrepre;
        public TabMod347c(String name)
            {
            super(name);
            m347cdominio = new FieldDef("m347cdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m347cnif = new FieldDef("m347cnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m347cejercicio = new FieldDef("m347cejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m347cperiodo = new FieldDef("m347cperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m347cdelegacio = new FieldDef("m347cdelegacio",FieldDef.INTEGER,0);
            m347cadmon = new FieldDef("m347cadmon",FieldDef.CHAR,30);
            m347ccodiadmon = new FieldDef("m347ccodiadmon",FieldDef.INTEGER,0);
            m347crazon = new FieldDef("m347crazon",FieldDef.CHAR,40);
            m347ctelef = new FieldDef("m347ctelef",FieldDef.CHAR,9);
            m347csigla = new FieldDef("m347csigla",FieldDef.CHAR,2);
            m347cvia = new FieldDef("m347cvia",FieldDef.CHAR,20);
            m347cnumero = new FieldDef("m347cnumero",FieldDef.CHAR,4);
            m347cescala = new FieldDef("m347cescala",FieldDef.CHAR,2);
            m347cpiso = new FieldDef("m347cpiso",FieldDef.CHAR,2);
            m347cpuerta = new FieldDef("m347cpuerta",FieldDef.CHAR,2);
            m347cmuni = new FieldDef("m347cmuni",FieldDef.CHAR,20);
            m347cprovin = new FieldDef("m347cprovin",FieldDef.INTEGER,0);
            m347cpostal = new FieldDef("m347cpostal",FieldDef.CHAR,5);
            m347ctiposop = new FieldDef("m347ctiposop",FieldDef.CHAR,1);
            m347cnomrel = new FieldDef("m347cnomrel",FieldDef.CHAR,40);
            m347cimpreso = new FieldDef("m347cimpreso",FieldDef.CHAR,1);
            m347cindivi = new FieldDef("m347cindivi",FieldDef.CHAR,1);
            m347ccolpre = new FieldDef("m347ccolpre",FieldDef.CHAR,1);
            m347ccolrete = new FieldDef("m347ccolrete",FieldDef.CHAR,1);
            m347ccomplem = new FieldDef("m347ccomplem",FieldDef.CHAR,1);
            m347csusti = new FieldDef("m347csusti",FieldDef.CHAR,1);
            m347cnumdecla = new FieldDef("m347cnumdecla",FieldDef.CHAR,16);
            m347ctotalper = new FieldDef("m347ctotalper",FieldDef.INTEGER,0);
            m347cimpsop = new FieldDef("m347cimpsop",FieldDef.FLOAT,6,0);
            m347ctotinmue = new FieldDef("m347ctotinmue",FieldDef.INTEGER,0);
            m347cimplocal = new FieldDef("m347cimplocal",FieldDef.FLOAT,6,0);
            m347cdeclarants = new FieldDef("m347cdeclarants",FieldDef.INTEGER,0);
            m347cdeclarados = new FieldDef("m347cdeclarados",FieldDef.INTEGER,0);
            m347cnumpre = new FieldDef("m347cnumpre",FieldDef.CHAR,13);
            m347cfecha = new FieldDef("m347cfecha",FieldDef.DATE);
            m347cdecla = new FieldDef("m347cdecla",FieldDef.CHAR,1);
            m347cfirmante = new FieldDef("m347cfirmante",FieldDef.CHAR,30);
            m347ccargofirma = new FieldDef("m347ccargofirma",FieldDef.CHAR,25);
            m347ctelcont = new FieldDef("m347ctelcont",FieldDef.CHAR,9);
            m347cpercont = new FieldDef("m347cpercont",FieldDef.CHAR,100);
            m347cobserva = new FieldDef("m347cobserva",FieldDef.CHAR,350);
            m347cletetiq = new FieldDef("m347cletetiq",FieldDef.CHAR,4);
            m347cnifrepre = new FieldDef("m347cnifrepre",FieldDef.CHAR,9);
            FieldDef array[] = {
                m347cdominio,
                m347cnif,
                m347cejercicio,
                m347cperiodo,
                m347cdelegacio,
                m347cadmon,
                m347ccodiadmon,
                m347crazon,
                m347ctelef,
                m347csigla,
                m347cvia,
                m347cnumero,
                m347cescala,
                m347cpiso,
                m347cpuerta,
                m347cmuni,
                m347cprovin,
                m347cpostal,
                m347ctiposop,
                m347cnomrel,
                m347cimpreso,
                m347cindivi,
                m347ccolpre,
                m347ccolrete,
                m347ccomplem,
                m347csusti,
                m347cnumdecla,
                m347ctotalper,
                m347cimpsop,
                m347ctotinmue,
                m347cimplocal,
                m347cdeclarants,
                m347cdeclarados,
                m347cnumpre,
                m347cfecha,
                m347cdecla,
                m347cfirmante,
                m347ccargofirma,
                m347ctelcont,
                m347cpercont,
                m347cobserva,
                m347cletetiq,
                m347cnifrepre                
                };
            setColumns(array);
            FieldDef arrayf[] = {m347cdominio,m347cnif,m347cejercicio,m347cperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod347d extends TableDef
        {
        // campos
        public FieldDef m347dident;
        public FieldDef m347ddominio;
        public FieldDef m347dnif;
        public FieldDef m347dejercicio;
        public FieldDef m347dperiodo;
        public FieldDef m347dnifado;
        public FieldDef m347dnifrepre;
        public FieldDef m347drazon;
        public FieldDef m347dprovin;
        public FieldDef m347dpais;
        public FieldDef m347dclave;
        public FieldDef m347dimporte;
        public FieldDef m347dseguro;
        public FieldDef m347darrend;
        public FieldDef m347dpais2;
        public FieldDef m347dimporteef;
        public FieldDef m347dimportin;
        public FieldDef m347dejeref;
        public FieldDef m347dimporte1t;
        public FieldDef m347dimporte2t;
        public FieldDef m347dimporte3t;
        public FieldDef m347dimporte4t;
        public FieldDef m347dimporin1t;
        public FieldDef m347dimporin2t;
        public FieldDef m347dimporin3t;
        public FieldDef m347dimporin4t;
        public FieldDef m347dnifcomun;
        public FieldDef m347doperacrecc;
        public FieldDef m347doperinvsp;
        public FieldDef m347doperdespos;
        public FieldDef m347dianualrecc;
        public TabMod347d(String name)
            {
            super(name);
            m347dident = new FieldDef("m347dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m347ddominio = new FieldDef("m347ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m347dnif = new FieldDef("m347dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m347dejercicio = new FieldDef("m347dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m347dperiodo = new FieldDef("m347dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m347dnifado = new FieldDef("m347dnifado",FieldDef.CHAR,15);
            m347dnifrepre = new FieldDef("m347dnifrepre",FieldDef.CHAR,15);
            m347drazon = new FieldDef("m347drazon",FieldDef.CHAR,40);
            m347dprovin = new FieldDef("m347dprovin",FieldDef.INTEGER,0);
            m347dpais = new FieldDef("m347dpais",FieldDef.INTEGER,0);
            m347dclave = new FieldDef("m347dclave",FieldDef.CHAR,1);
            m347dimporte = new FieldDef("m347dimporte",FieldDef.FLOAT,6,0);
            m347dseguro = new FieldDef("m347dseguro",FieldDef.CHAR,1);
            m347darrend = new FieldDef("m347darrend",FieldDef.CHAR,1);
            m347dpais2 = new FieldDef("m347dpais2",FieldDef.CHAR,3);
            m347dimporteef = new FieldDef("m347dimporteef",FieldDef.FLOAT,6,0);
            m347dimportin = new FieldDef("m347dimportin",FieldDef.FLOAT,6,0);
            m347dejeref = new FieldDef("m347dejeref",FieldDef.INTEGER,0);
            m347dimporte1t = new FieldDef("m347dimporte1t",FieldDef.FLOAT,6,0);
            m347dimporte2t = new FieldDef("m347dimporte2t",FieldDef.FLOAT,6,0);
            m347dimporte3t = new FieldDef("m347dimporte3t",FieldDef.FLOAT,6,0);
            m347dimporte4t = new FieldDef("m347dimporte4t",FieldDef.FLOAT,6,0);
            m347dimporin1t = new FieldDef("m347dimporin1t",FieldDef.FLOAT,6,0);
            m347dimporin2t = new FieldDef("m347dimporin2t",FieldDef.FLOAT,6,0);
            m347dimporin3t = new FieldDef("m347dimporin3t",FieldDef.FLOAT,6,0);
            m347dimporin4t = new FieldDef("m347dimporin4t",FieldDef.FLOAT,6,0);
            m347dnifcomun = new FieldDef("m347dnifcomun",FieldDef.CHAR,17);
            m347doperacrecc = new FieldDef("m347doperacrecc",FieldDef.CHAR,1);
            m347doperinvsp = new FieldDef("m347doperinvsp",FieldDef.CHAR,1);
            m347doperdespos = new FieldDef("m347doperdespos",FieldDef.CHAR,1);
            m347dianualrecc = new FieldDef("m347dianualrecc",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m347dident,
                m347ddominio,
                m347dnif,
                m347dejercicio,
                m347dperiodo,
                m347dnifado,
                m347dnifrepre,
                m347drazon,
                m347dprovin,
                m347dpais,
                m347dclave,
                m347dimporte,
                m347dseguro,
                m347darrend,
                m347dpais2,
                m347dimporteef,
                m347dimportin,
                m347dejeref,
                m347dimporte1t,
                m347dimporte2t,
                m347dimporte3t,
                m347dimporte4t,
                m347dimporin1t,
                m347dimporin2t,
                m347dimporin3t,
                m347dimporin4t,
                m347dnifcomun,
                m347doperacrecc,
                m347doperinvsp,
                m347doperdespos,
                m347dianualrecc                
                };
            setColumns(array);
            FieldDef arrayf[] = {m347dident };
            setPrimaryKeys(arrayf);
            m347dident.setAutoIncrementable(true);
            m347dnifcomun.setDescription("NIF Operador comunitario");
            m347doperacrecc.setDescription("Operaciones Reg.Especial Criterio de Caja IVA");
            m347doperinvsp.setDescription("Operacion con Inversion del Sujeto Pasivo");
            m347doperdespos.setDescription("Oper.con bienes destinados Reg.Deposito (distinto del aduanero)");
            m347dianualrecc.setDescription("Importe anual operaciones devengadas RECC");
            }
        }
        
    public class TabMod347a extends TableDef
        {
        // campos
        public FieldDef m347aident;
        public FieldDef m347adominio;
        public FieldDef m347anif;
        public FieldDef m347aejercicio;
        public FieldDef m347aperiodo;
        public FieldDef m347aidentd;
        public FieldDef m347anifarren;
        public FieldDef m347anifrepre;
        public FieldDef m347anombre;
        public FieldDef m347aimporte;
        public FieldDef m347acatas;
        public FieldDef m347aprovin;
        public FieldDef m347amuni;
        public FieldDef m347asigla;
        public FieldDef m347avia;
        public FieldDef m347anumero;
        public FieldDef m347aescala;
        public FieldDef m347apiso;
        public FieldDef m347apuerta;
        public FieldDef m347asituacion;
        public FieldDef m347atipovia;
        public FieldDef m347atiponum;
        public FieldDef m347acalifnum;
        public FieldDef m347abloque;
        public FieldDef m347aportal;
        public FieldDef m347acomplem;
        public FieldDef m347alocal;
        public FieldDef m347acodmuni;
        public FieldDef m347acodpostal;
        public TabMod347a(String name)
            {
            super(name);
            m347aident = new FieldDef("m347aident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m347adominio = new FieldDef("m347adominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m347anif = new FieldDef("m347anif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m347aejercicio = new FieldDef("m347aejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m347aperiodo = new FieldDef("m347aperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m347aidentd = new FieldDef("m347aidentd",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m347anifarren = new FieldDef("m347anifarren",FieldDef.CHAR,15);
            m347anifrepre = new FieldDef("m347anifrepre",FieldDef.CHAR,15);
            m347anombre = new FieldDef("m347anombre",FieldDef.CHAR,40);
            m347aimporte = new FieldDef("m347aimporte",FieldDef.FLOAT,6,0);
            m347acatas = new FieldDef("m347acatas",FieldDef.CHAR,25);
            m347aprovin = new FieldDef("m347aprovin",FieldDef.INTEGER,0);
            m347amuni = new FieldDef("m347amuni",FieldDef.CHAR,30);
            m347asigla = new FieldDef("m347asigla",FieldDef.CHAR,2);
            m347avia = new FieldDef("m347avia",FieldDef.CHAR,40);
            m347anumero = new FieldDef("m347anumero",FieldDef.CHAR,5);
            m347aescala = new FieldDef("m347aescala",FieldDef.CHAR,3);
            m347apiso = new FieldDef("m347apiso",FieldDef.CHAR,3);
            m347apuerta = new FieldDef("m347apuerta",FieldDef.CHAR,3);
            m347asituacion = new FieldDef("m347asituacion",FieldDef.INTEGER,0);
            m347atipovia = new FieldDef("m347atipovia",FieldDef.CHAR,5);
            m347atiponum = new FieldDef("m347atiponum",FieldDef.CHAR,3);
            m347acalifnum = new FieldDef("m347acalifnum",FieldDef.CHAR,3);
            m347abloque = new FieldDef("m347abloque",FieldDef.CHAR,3);
            m347aportal = new FieldDef("m347aportal",FieldDef.CHAR,3);
            m347acomplem = new FieldDef("m347acomplem",FieldDef.CHAR,40);
            m347alocal = new FieldDef("m347alocal",FieldDef.CHAR,30);
            m347acodmuni = new FieldDef("m347acodmuni",FieldDef.CHAR,5);
            m347acodpostal = new FieldDef("m347acodpostal",FieldDef.CHAR,5);
            FieldDef array[] = {
                m347aident,
                m347adominio,
                m347anif,
                m347aejercicio,
                m347aperiodo,
                m347aidentd,
                m347anifarren,
                m347anifrepre,
                m347anombre,
                m347aimporte,
                m347acatas,
                m347aprovin,
                m347amuni,
                m347asigla,
                m347avia,
                m347anumero,
                m347aescala,
                m347apiso,
                m347apuerta,
                m347asituacion,
                m347atipovia,
                m347atiponum,
                m347acalifnum,
                m347abloque,
                m347aportal,
                m347acomplem,
                m347alocal,
                m347acodmuni,
                m347acodpostal                
                };
            setColumns(array);
            FieldDef arrayf[] = {m347aident,m347adominio,m347anif,m347aejercicio,m347aperiodo };
            setPrimaryKeys(arrayf);
            m347aident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod193c extends TableDef
        {
        // campos
        public FieldDef m193cdominio;
        public FieldDef m193cnif;
        public FieldDef m193cejercicio;
        public FieldDef m193cperiodo;
        public FieldDef m193cdeleg;
        public FieldDef m193cadmin;
        public FieldDef m193ccodadmon;
        public FieldDef m193crazon;
        public FieldDef m193csoporte;
        public FieldDef m193ctelefono;
        public FieldDef m193capellidos;
        public FieldDef m193csiglas;
        public FieldDef m193ccalle;
        public FieldDef m193cnumero;
        public FieldDef m193cmunicipio;
        public FieldDef m193codprov;
        public FieldDef m193cprovincia;
        public FieldDef m193ccpostal;
        public FieldDef m193cfecha;
        public FieldDef m193cfirma;
        public FieldDef m193ccargofirm;
        public FieldDef m193cjustif;
        public FieldDef m193cdeccomp;
        public FieldDef m193cdecsust;
        public FieldDef m193cjustifant;
        public FieldDef m193ctotalper;
        public FieldDef m193cbase;
        public FieldDef m193cretencta;
        public FieldDef m193creteingre;
        public FieldDef m193cperioingre;
        public FieldDef m193cperioreten;
        public FieldDef m193cgastos;
        public FieldDef m193cnaturaleza;
        public FieldDef m193cpercont;
        public FieldDef m193ctelcont;
        public FieldDef m193cobserva;
        public FieldDef m193cletetiq;
        public FieldDef m193csimplific;
        public TabMod193c(String name)
            {
            super(name);
            m193cdominio = new FieldDef("m193cdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m193cnif = new FieldDef("m193cnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m193cejercicio = new FieldDef("m193cejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m193cperiodo = new FieldDef("m193cperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m193cdeleg = new FieldDef("m193cdeleg",FieldDef.CHAR,15);
            m193cadmin = new FieldDef("m193cadmin",FieldDef.CHAR,15);
            m193ccodadmon = new FieldDef("m193ccodadmon",FieldDef.INTEGER,0);
            m193crazon = new FieldDef("m193crazon",FieldDef.CHAR,40);
            m193csoporte = new FieldDef("m193csoporte",FieldDef.CHAR,1);
            m193ctelefono = new FieldDef("m193ctelefono",FieldDef.CHAR,9);
            m193capellidos = new FieldDef("m193capellidos",FieldDef.CHAR,40);
            m193csiglas = new FieldDef("m193csiglas",FieldDef.CHAR,2);
            m193ccalle = new FieldDef("m193ccalle",FieldDef.CHAR,40);
            m193cnumero = new FieldDef("m193cnumero",FieldDef.CHAR,5);
            m193cmunicipio = new FieldDef("m193cmunicipio",FieldDef.CHAR,15);
            m193codprov = new FieldDef("m193codprov",FieldDef.INTEGER,0);
            m193cprovincia = new FieldDef("m193cprovincia",FieldDef.CHAR,15);
            m193ccpostal = new FieldDef("m193ccpostal",FieldDef.CHAR,5);
            m193cfecha = new FieldDef("m193cfecha",FieldDef.DATE);
            m193cfirma = new FieldDef("m193cfirma",FieldDef.CHAR,15);
            m193ccargofirm = new FieldDef("m193ccargofirm",FieldDef.CHAR,15);
            m193cjustif = new FieldDef("m193cjustif",FieldDef.CHAR,16);
            m193cdeccomp = new FieldDef("m193cdeccomp",FieldDef.CHAR,1);
            m193cdecsust = new FieldDef("m193cdecsust",FieldDef.CHAR,1);
            m193cjustifant = new FieldDef("m193cjustifant",FieldDef.CHAR,16);
            m193ctotalper = new FieldDef("m193ctotalper",FieldDef.INTEGER,0);
            m193cbase = new FieldDef("m193cbase",FieldDef.FLOAT,6,0);
            m193cretencta = new FieldDef("m193cretencta",FieldDef.FLOAT,6,0);
            m193creteingre = new FieldDef("m193creteingre",FieldDef.FLOAT,6,0);
            m193cperioingre = new FieldDef("m193cperioingre",FieldDef.FLOAT,6,0);
            m193cperioreten = new FieldDef("m193cperioreten",FieldDef.FLOAT,6,0);
            m193cgastos = new FieldDef("m193cgastos",FieldDef.FLOAT,6,0);
            m193cnaturaleza = new FieldDef("m193cnaturaleza",FieldDef.CHAR,1);
            m193cpercont = new FieldDef("m193cpercont",FieldDef.CHAR,100);
            m193ctelcont = new FieldDef("m193ctelcont",FieldDef.CHAR,9);
            m193cobserva = new FieldDef("m193cobserva",FieldDef.CHAR,350);
            m193cletetiq = new FieldDef("m193cletetiq",FieldDef.CHAR,4);
            m193csimplific = new FieldDef("m193csimplific",FieldDef.CHAR,1);
            FieldDef array[] = {
                m193cdominio,
                m193cnif,
                m193cejercicio,
                m193cperiodo,
                m193cdeleg,
                m193cadmin,
                m193ccodadmon,
                m193crazon,
                m193csoporte,
                m193ctelefono,
                m193capellidos,
                m193csiglas,
                m193ccalle,
                m193cnumero,
                m193cmunicipio,
                m193codprov,
                m193cprovincia,
                m193ccpostal,
                m193cfecha,
                m193cfirma,
                m193ccargofirm,
                m193cjustif,
                m193cdeccomp,
                m193cdecsust,
                m193cjustifant,
                m193ctotalper,
                m193cbase,
                m193cretencta,
                m193creteingre,
                m193cperioingre,
                m193cperioreten,
                m193cgastos,
                m193cnaturaleza,
                m193cpercont,
                m193ctelcont,
                m193cobserva,
                m193cletetiq,
                m193csimplific                
                };
            setColumns(array);
            FieldDef arrayf[] = {m193cdominio,m193cnif,m193cejercicio,m193cperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod193d extends TableDef
        {
        // campos
        public FieldDef m193dident;
        public FieldDef m193ddominio;
        public FieldDef m193dnif;
        public FieldDef m193dejercicio;
        public FieldDef m193dperiodo;
        public FieldDef m193dhoja;
        public FieldDef m193dtotalhoja;
        public FieldDef m193dnifper;
        public FieldDef m193dnifrepre;
        public FieldDef m193drazon;
        public FieldDef m193dmediador;
        public FieldDef m193dprovincia;
        public FieldDef m193dclave;
        public FieldDef m193dcodemisor;
        public FieldDef m193dclaveper;
        public FieldDef m193dnatura;
        public FieldDef m193dpago;
        public FieldDef m193dtipocod;
        public FieldDef m193dctavalores;
        public FieldDef m193dpte;
        public FieldDef m193dejerdev;
        public FieldDef m193dtipoper;
        public FieldDef m193dimporte;
        public FieldDef m193dmulta;
        public FieldDef m193dreduccio;
        public FieldDef m193dbaseret;
        public FieldDef m193dporcen;
        public FieldDef m193dingcta;
        public FieldDef m193dingrperi;
        public FieldDef m193dnaturadec;
        public FieldDef m193dgastos;
        public FieldDef m193dliscertif;
        public FieldDef m193dfecinipres;
        public FieldDef m193dfecfinpres;
        public FieldDef m193dcompensa;
        public FieldDef m193dgarantias;
        public FieldDef m193dpenaliz;
        public TabMod193d(String name)
            {
            super(name);
            m193dident = new FieldDef("m193dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m193ddominio = new FieldDef("m193ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m193dnif = new FieldDef("m193dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m193dejercicio = new FieldDef("m193dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m193dperiodo = new FieldDef("m193dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m193dhoja = new FieldDef("m193dhoja",FieldDef.CHAR,3);
            m193dtotalhoja = new FieldDef("m193dtotalhoja",FieldDef.CHAR,3);
            m193dnifper = new FieldDef("m193dnifper",FieldDef.CHAR,15);
            m193dnifrepre = new FieldDef("m193dnifrepre",FieldDef.CHAR,15);
            m193drazon = new FieldDef("m193drazon",FieldDef.CHAR,40);
            m193dmediador = new FieldDef("m193dmediador",FieldDef.CHAR,1);
            m193dprovincia = new FieldDef("m193dprovincia",FieldDef.INTEGER,0);
            m193dclave = new FieldDef("m193dclave",FieldDef.CHAR,1);
            m193dcodemisor = new FieldDef("m193dcodemisor",FieldDef.CHAR,12);
            m193dclaveper = new FieldDef("m193dclaveper",FieldDef.CHAR,1);
            m193dnatura = new FieldDef("m193dnatura",FieldDef.CHAR,2);
            m193dpago = new FieldDef("m193dpago",FieldDef.CHAR,1);
            m193dtipocod = new FieldDef("m193dtipocod",FieldDef.CHAR,1);
            m193dctavalores = new FieldDef("m193dctavalores",FieldDef.CHAR,20);
            m193dpte = new FieldDef("m193dpte",FieldDef.CHAR,1);
            m193dejerdev = new FieldDef("m193dejerdev",FieldDef.INTEGER,0);
            m193dtipoper = new FieldDef("m193dtipoper",FieldDef.CHAR,1);
            m193dimporte = new FieldDef("m193dimporte",FieldDef.FLOAT,6,0);
            m193dmulta = new FieldDef("m193dmulta",FieldDef.FLOAT,6,0);
            m193dreduccio = new FieldDef("m193dreduccio",FieldDef.FLOAT,6,0);
            m193dbaseret = new FieldDef("m193dbaseret",FieldDef.FLOAT,6,0);
            m193dporcen = new FieldDef("m193dporcen",FieldDef.FLOAT,6,0);
            m193dingcta = new FieldDef("m193dingcta",FieldDef.FLOAT,6,0);
            m193dingrperi = new FieldDef("m193dingrperi",FieldDef.FLOAT,6,0);
            m193dnaturadec = new FieldDef("m193dnaturadec",FieldDef.CHAR,1);
            m193dgastos = new FieldDef("m193dgastos",FieldDef.FLOAT,6,0);
            m193dliscertif = new FieldDef("m193dliscertif",FieldDef.CHAR,1);
            m193dfecinipres = new FieldDef("m193dfecinipres",FieldDef.DATE);
            m193dfecfinpres = new FieldDef("m193dfecfinpres",FieldDef.DATE);
            m193dcompensa = new FieldDef("m193dcompensa",FieldDef.FLOAT,6,0);
            m193dgarantias = new FieldDef("m193dgarantias",FieldDef.FLOAT,6,0);
            m193dpenaliz = new FieldDef("m193dpenaliz",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m193dident,
                m193ddominio,
                m193dnif,
                m193dejercicio,
                m193dperiodo,
                m193dhoja,
                m193dtotalhoja,
                m193dnifper,
                m193dnifrepre,
                m193drazon,
                m193dmediador,
                m193dprovincia,
                m193dclave,
                m193dcodemisor,
                m193dclaveper,
                m193dnatura,
                m193dpago,
                m193dtipocod,
                m193dctavalores,
                m193dpte,
                m193dejerdev,
                m193dtipoper,
                m193dimporte,
                m193dmulta,
                m193dreduccio,
                m193dbaseret,
                m193dporcen,
                m193dingcta,
                m193dingrperi,
                m193dnaturadec,
                m193dgastos,
                m193dliscertif,
                m193dfecinipres,
                m193dfecfinpres,
                m193dcompensa,
                m193dgarantias,
                m193dpenaliz                
                };
            setColumns(array);
            FieldDef arrayf[] = {m193dident };
            setPrimaryKeys(arrayf);
            m193dident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod123 extends TableDef
        {
        // campos
        public FieldDef m123dominio;
        public FieldDef m123nif;
        public FieldDef m123ejercicio;
        public FieldDef m123periodo;
        public FieldDef m123deleg;
        public FieldDef m123admon;
        public FieldDef m123codadmon;
        public FieldDef m123letetiq;
        public FieldDef m123apellidos;
        public FieldDef m123nombre;
        public FieldDef m123siglas;
        public FieldDef m123calle;
        public FieldDef m123numero;
        public FieldDef m123escalera;
        public FieldDef m123piso;
        public FieldDef m123puerta;
        public FieldDef m123telefono;
        public FieldDef m123municipio;
        public FieldDef m123codprov;
        public FieldDef m123provincia;
        public FieldDef m123cpostal;
        public FieldDef m123numpercep;
        public FieldDef m123base;
        public FieldDef m123reten;
        public FieldDef m123ingrant;
        public FieldDef m123regul;
        public FieldDef m123result;
        public FieldDef m123fecha;
        public FieldDef m123dia;
        public FieldDef m123mes;
        public FieldDef m123anyo;
        public FieldDef m123cruzefec;
        public FieldDef m123cruzadeu;
        public FieldDef m123ingreso;
        public FieldDef m123entingreso;
        public FieldDef m123ofiingreso;
        public FieldDef m123digiingreso;
        public FieldDef m123ctaingreso;
        public FieldDef m123percont;
        public FieldDef m123telcont;
        public FieldDef m123observa;
        public FieldDef m123cruzccc;
        public FieldDef m123tipodecl;
        public FieldDef m123formapago;
        public FieldDef m123totalliq;
        public FieldDef m123resingant;
        public FieldDef m123numjustif;
        public FieldDef m123codelec;
        public FieldDef m123munifirma;
        public FieldDef m123razon;
        public FieldDef m123nompf;
        public FieldDef m123paisiban;
        public FieldDef m123dciban;
        public FieldDef m123complem;
        public TabMod123(String name)
            {
            super(name);
            m123dominio = new FieldDef("m123dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m123nif = new FieldDef("m123nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m123ejercicio = new FieldDef("m123ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m123periodo = new FieldDef("m123periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m123deleg = new FieldDef("m123deleg",FieldDef.CHAR,30);
            m123admon = new FieldDef("m123admon",FieldDef.CHAR,30);
            m123codadmon = new FieldDef("m123codadmon",FieldDef.INTEGER,0);
            m123letetiq = new FieldDef("m123letetiq",FieldDef.CHAR,4);
            m123apellidos = new FieldDef("m123apellidos",FieldDef.CHAR,30);
            m123nombre = new FieldDef("m123nombre",FieldDef.CHAR,15);
            m123siglas = new FieldDef("m123siglas",FieldDef.CHAR,2);
            m123calle = new FieldDef("m123calle",FieldDef.CHAR,17);
            m123numero = new FieldDef("m123numero",FieldDef.CHAR,4);
            m123escalera = new FieldDef("m123escalera",FieldDef.CHAR,2);
            m123piso = new FieldDef("m123piso",FieldDef.CHAR,2);
            m123puerta = new FieldDef("m123puerta",FieldDef.CHAR,2);
            m123telefono = new FieldDef("m123telefono",FieldDef.CHAR,9);
            m123municipio = new FieldDef("m123municipio",FieldDef.CHAR,20);
            m123codprov = new FieldDef("m123codprov",FieldDef.INTEGER,0);
            m123provincia = new FieldDef("m123provincia",FieldDef.CHAR,15);
            m123cpostal = new FieldDef("m123cpostal",FieldDef.CHAR,5);
            m123numpercep = new FieldDef("m123numpercep",FieldDef.FLOAT,6,0);
            m123base = new FieldDef("m123base",FieldDef.FLOAT,6,0);
            m123reten = new FieldDef("m123reten",FieldDef.FLOAT,6,0);
            m123ingrant = new FieldDef("m123ingrant",FieldDef.FLOAT,6,0);
            m123regul = new FieldDef("m123regul",FieldDef.FLOAT,6,0);
            m123result = new FieldDef("m123result",FieldDef.FLOAT,6,0);
            m123fecha = new FieldDef("m123fecha",FieldDef.DATE);
            m123dia = new FieldDef("m123dia",FieldDef.CHAR,2);
            m123mes = new FieldDef("m123mes",FieldDef.CHAR,10);
            m123anyo = new FieldDef("m123anyo",FieldDef.CHAR,4);
            m123cruzefec = new FieldDef("m123cruzefec",FieldDef.CHAR,1);
            m123cruzadeu = new FieldDef("m123cruzadeu",FieldDef.CHAR,1);
            m123ingreso = new FieldDef("m123ingreso",FieldDef.FLOAT,6,0);
            m123entingreso = new FieldDef("m123entingreso",FieldDef.CHAR,4);
            m123ofiingreso = new FieldDef("m123ofiingreso",FieldDef.CHAR,4);
            m123digiingreso = new FieldDef("m123digiingreso",FieldDef.CHAR,2);
            m123ctaingreso = new FieldDef("m123ctaingreso",FieldDef.CHAR,10);
            m123percont = new FieldDef("m123percont",FieldDef.CHAR,100);
            m123telcont = new FieldDef("m123telcont",FieldDef.CHAR,9);
            m123observa = new FieldDef("m123observa",FieldDef.CHAR,350);
            m123cruzccc = new FieldDef("m123cruzccc",FieldDef.CHAR,1);
            m123tipodecl = new FieldDef("m123tipodecl",FieldDef.CHAR,1);
            m123formapago = new FieldDef("m123formapago",FieldDef.INTEGER,0);
            m123totalliq = new FieldDef("m123totalliq",FieldDef.FLOAT,6,0);
            m123resingant = new FieldDef("m123resingant",FieldDef.FLOAT,6,0);
            m123numjustif = new FieldDef("m123numjustif",FieldDef.CHAR,13);
            m123codelec = new FieldDef("m123codelec",FieldDef.CHAR,16);
            m123munifirma = new FieldDef("m123munifirma",FieldDef.CHAR,16);
            m123razon = new FieldDef("m123razon",FieldDef.CHAR,60);
            m123nompf = new FieldDef("m123nompf",FieldDef.CHAR,20);
            m123paisiban = new FieldDef("m123paisiban",FieldDef.CHAR,2);
            m123dciban = new FieldDef("m123dciban",FieldDef.CHAR,2);
            m123complem = new FieldDef("m123complem",FieldDef.CHAR,1);
            FieldDef array[] = {
                m123dominio,
                m123nif,
                m123ejercicio,
                m123periodo,
                m123deleg,
                m123admon,
                m123codadmon,
                m123letetiq,
                m123apellidos,
                m123nombre,
                m123siglas,
                m123calle,
                m123numero,
                m123escalera,
                m123piso,
                m123puerta,
                m123telefono,
                m123municipio,
                m123codprov,
                m123provincia,
                m123cpostal,
                m123numpercep,
                m123base,
                m123reten,
                m123ingrant,
                m123regul,
                m123result,
                m123fecha,
                m123dia,
                m123mes,
                m123anyo,
                m123cruzefec,
                m123cruzadeu,
                m123ingreso,
                m123entingreso,
                m123ofiingreso,
                m123digiingreso,
                m123ctaingreso,
                m123percont,
                m123telcont,
                m123observa,
                m123cruzccc,
                m123tipodecl,
                m123formapago,
                m123totalliq,
                m123resingant,
                m123numjustif,
                m123codelec,
                m123munifirma,
                m123razon,
                m123nompf,
                m123paisiban,
                m123dciban,
                m123complem                
                };
            setColumns(array);
            FieldDef arrayf[] = {m123dominio,m123nif,m123ejercicio,m123periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod349c extends TableDef
        {
        // campos
        public FieldDef m349cdominio;
        public FieldDef m349cnif;
        public FieldDef m349cejercicio;
        public FieldDef m349cperiodo;
        public FieldDef m349cdelegacio;
        public FieldDef m349cadmon;
        public FieldDef m349ccodiadmon;
        public FieldDef m349crazon;
        public FieldDef m349ctelefono;
        public FieldDef m349csigla;
        public FieldDef m349cvia;
        public FieldDef m349cnumero;
        public FieldDef m349cescalera;
        public FieldDef m349cpiso;
        public FieldDef m349cpuerta;
        public FieldDef m349cmunicipio;
        public FieldDef m349cprovincia;
        public FieldDef m349ccpostal;
        public FieldDef m349ctiposop;
        public FieldDef m349cnomrel;
        public FieldDef m349ctelefrel;
        public FieldDef m349cimpreso;
        public FieldDef m349cindivi;
        public FieldDef m349ccolpre;
        public FieldDef m349ccolrete;
        public FieldDef m349ccomplem;
        public FieldDef m349csusti;
        public FieldDef m349cnjustifant;
        public FieldDef m349cnumope;
        public FieldDef m349cimporte;
        public FieldDef m349cnumoperec;
        public FieldDef m349cimprectif;
        public FieldDef m349cnumdecsop;
        public FieldDef m349cnumpersop;
        public FieldDef m349cfecha;
        public FieldDef m349cfirma;
        public FieldDef m349ccargofirma;
        public FieldDef m349cletetiq;
        public FieldDef m349cpercont;
        public FieldDef m349ctelcont;
        public FieldDef m349cobserva;
        public FieldDef m349ccodprov;
        public FieldDef m349ccoddeleg;
        public FieldDef m349ccambioper;
        public FieldDef m349cnifrepleg;
        public TabMod349c(String name)
            {
            super(name);
            m349cdominio = new FieldDef("m349cdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m349cnif = new FieldDef("m349cnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m349cejercicio = new FieldDef("m349cejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m349cperiodo = new FieldDef("m349cperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m349cdelegacio = new FieldDef("m349cdelegacio",FieldDef.CHAR,30);
            m349cadmon = new FieldDef("m349cadmon",FieldDef.CHAR,30);
            m349ccodiadmon = new FieldDef("m349ccodiadmon",FieldDef.CHAR,5);
            m349crazon = new FieldDef("m349crazon",FieldDef.CHAR,40);
            m349ctelefono = new FieldDef("m349ctelefono",FieldDef.CHAR,9);
            m349csigla = new FieldDef("m349csigla",FieldDef.CHAR,2);
            m349cvia = new FieldDef("m349cvia",FieldDef.CHAR,20);
            m349cnumero = new FieldDef("m349cnumero",FieldDef.CHAR,4);
            m349cescalera = new FieldDef("m349cescalera",FieldDef.CHAR,2);
            m349cpiso = new FieldDef("m349cpiso",FieldDef.CHAR,2);
            m349cpuerta = new FieldDef("m349cpuerta",FieldDef.CHAR,2);
            m349cmunicipio = new FieldDef("m349cmunicipio",FieldDef.CHAR,20);
            m349cprovincia = new FieldDef("m349cprovincia",FieldDef.CHAR,15);
            m349ccpostal = new FieldDef("m349ccpostal",FieldDef.CHAR,5);
            m349ctiposop = new FieldDef("m349ctiposop",FieldDef.CHAR,1);
            m349cnomrel = new FieldDef("m349cnomrel",FieldDef.CHAR,40);
            m349ctelefrel = new FieldDef("m349ctelefrel",FieldDef.CHAR,9);
            m349cimpreso = new FieldDef("m349cimpreso",FieldDef.CHAR,1);
            m349cindivi = new FieldDef("m349cindivi",FieldDef.CHAR,1);
            m349ccolpre = new FieldDef("m349ccolpre",FieldDef.CHAR,1);
            m349ccolrete = new FieldDef("m349ccolrete",FieldDef.CHAR,1);
            m349ccomplem = new FieldDef("m349ccomplem",FieldDef.CHAR,1);
            m349csusti = new FieldDef("m349csusti",FieldDef.CHAR,1);
            m349cnjustifant = new FieldDef("m349cnjustifant",FieldDef.FLOAT,6,0);
            m349cnumope = new FieldDef("m349cnumope",FieldDef.FLOAT,6,0);
            m349cimporte = new FieldDef("m349cimporte",FieldDef.FLOAT,6,0);
            m349cnumoperec = new FieldDef("m349cnumoperec",FieldDef.FLOAT,6,0);
            m349cimprectif = new FieldDef("m349cimprectif",FieldDef.FLOAT,6,0);
            m349cnumdecsop = new FieldDef("m349cnumdecsop",FieldDef.FLOAT,6,0);
            m349cnumpersop = new FieldDef("m349cnumpersop",FieldDef.FLOAT,6,0);
            m349cfecha = new FieldDef("m349cfecha",FieldDef.DATE);
            m349cfirma = new FieldDef("m349cfirma",FieldDef.CHAR,30);
            m349ccargofirma = new FieldDef("m349ccargofirma",FieldDef.CHAR,30);
            m349cletetiq = new FieldDef("m349cletetiq",FieldDef.CHAR,4);
            m349cpercont = new FieldDef("m349cpercont",FieldDef.CHAR,100);
            m349ctelcont = new FieldDef("m349ctelcont",FieldDef.CHAR,9);
            m349cobserva = new FieldDef("m349cobserva",FieldDef.CHAR,350);
            m349ccodprov = new FieldDef("m349ccodprov",FieldDef.INTEGER,0);
            m349ccoddeleg = new FieldDef("m349ccoddeleg",FieldDef.INTEGER,0);
            m349ccambioper = new FieldDef("m349ccambioper",FieldDef.CHAR,1);
            m349cnifrepleg = new FieldDef("m349cnifrepleg",FieldDef.CHAR,9);
            FieldDef array[] = {
                m349cdominio,
                m349cnif,
                m349cejercicio,
                m349cperiodo,
                m349cdelegacio,
                m349cadmon,
                m349ccodiadmon,
                m349crazon,
                m349ctelefono,
                m349csigla,
                m349cvia,
                m349cnumero,
                m349cescalera,
                m349cpiso,
                m349cpuerta,
                m349cmunicipio,
                m349cprovincia,
                m349ccpostal,
                m349ctiposop,
                m349cnomrel,
                m349ctelefrel,
                m349cimpreso,
                m349cindivi,
                m349ccolpre,
                m349ccolrete,
                m349ccomplem,
                m349csusti,
                m349cnjustifant,
                m349cnumope,
                m349cimporte,
                m349cnumoperec,
                m349cimprectif,
                m349cnumdecsop,
                m349cnumpersop,
                m349cfecha,
                m349cfirma,
                m349ccargofirma,
                m349cletetiq,
                m349cpercont,
                m349ctelcont,
                m349cobserva,
                m349ccodprov,
                m349ccoddeleg,
                m349ccambioper,
                m349cnifrepleg                
                };
            setColumns(array);
            FieldDef arrayf[] = {m349cdominio,m349cnif,m349cejercicio,m349cperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod349d extends TableDef
        {
        // campos
        public FieldDef m349dident;
        public FieldDef m349ddominio;
        public FieldDef m349dnif;
        public FieldDef m349dejercicio;
        public FieldDef m349dperiodo;
        public FieldDef m349dcodpais;
        public FieldDef m349dnifcomun;
        public FieldDef m349drazon;
        public FieldDef m349dbase;
        public FieldDef m349dclave;
        public TabMod349d(String name)
            {
            super(name);
            m349dident = new FieldDef("m349dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m349ddominio = new FieldDef("m349ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m349dnif = new FieldDef("m349dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m349dejercicio = new FieldDef("m349dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m349dperiodo = new FieldDef("m349dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m349dcodpais = new FieldDef("m349dcodpais",FieldDef.CHAR,2);
            m349dnifcomun = new FieldDef("m349dnifcomun",FieldDef.CHAR,15);
            m349drazon = new FieldDef("m349drazon",FieldDef.CHAR,40);
            m349dbase = new FieldDef("m349dbase",FieldDef.FLOAT,6,0);
            m349dclave = new FieldDef("m349dclave",FieldDef.CHAR,1);
            FieldDef array[] = {
                m349dident,
                m349ddominio,
                m349dnif,
                m349dejercicio,
                m349dperiodo,
                m349dcodpais,
                m349dnifcomun,
                m349drazon,
                m349dbase,
                m349dclave                
                };
            setColumns(array);
            FieldDef arrayf[] = {m349dident };
            setPrimaryKeys(arrayf);
            m349dident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod349r extends TableDef
        {
        // campos
        public FieldDef m349rident;
        public FieldDef m349rdominio;
        public FieldDef m349rnif;
        public FieldDef m349rejercicio;
        public FieldDef m349rperiodo;
        public FieldDef m349rcodpais;
        public FieldDef m349rnifcomun;
        public FieldDef m349rrazon;
        public FieldDef m349rclave;
        public FieldDef m349ranyrectif;
        public FieldDef m349rperirecti;
        public FieldDef m349rbaserecti;
        public FieldDef m349rbaseantre;
        public TabMod349r(String name)
            {
            super(name);
            m349rident = new FieldDef("m349rident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m349rdominio = new FieldDef("m349rdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m349rnif = new FieldDef("m349rnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m349rejercicio = new FieldDef("m349rejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m349rperiodo = new FieldDef("m349rperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m349rcodpais = new FieldDef("m349rcodpais",FieldDef.CHAR,2);
            m349rnifcomun = new FieldDef("m349rnifcomun",FieldDef.CHAR,15);
            m349rrazon = new FieldDef("m349rrazon",FieldDef.CHAR,40);
            m349rclave = new FieldDef("m349rclave",FieldDef.CHAR,1);
            m349ranyrectif = new FieldDef("m349ranyrectif",FieldDef.INTEGER,0);
            m349rperirecti = new FieldDef("m349rperirecti",FieldDef.CHAR,2);
            m349rbaserecti = new FieldDef("m349rbaserecti",FieldDef.FLOAT,6,0);
            m349rbaseantre = new FieldDef("m349rbaseantre",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m349rident,
                m349rdominio,
                m349rnif,
                m349rejercicio,
                m349rperiodo,
                m349rcodpais,
                m349rnifcomun,
                m349rrazon,
                m349rclave,
                m349ranyrectif,
                m349rperirecti,
                m349rbaserecti,
                m349rbaseantre                
                };
            setColumns(array);
            FieldDef arrayf[] = {m349rident };
            setPrimaryKeys(arrayf);
            m349rident.setAutoIncrementable(true);
            }
        }
        
    public class TabModintc extends TableDef
        {
        // campos
        public FieldDef mintcdominio;
        public FieldDef mintcnif;
        public FieldDef mintcejercicio;
        public FieldDef mintcperiodo;
        public FieldDef mintcflujo;
        public FieldDef mintcnumdecl;
        public FieldDef mintctipodec;
        public FieldDef mintcmoneda;
        public FieldDef mintcfechaemi;
        public FieldDef mintcniftercero;
        public FieldDef mintcnomtercero;
        public FieldDef mintctotalmasa;
        public FieldDef mintctotalunid;
        public FieldDef mintctotalfact;
        public FieldDef mintctotalestad;
        public FieldDef mintcnomnif;
        public FieldDef mintclugaremi;
        public FieldDef mintcnumtotpart;
        public TabModintc(String name)
            {
            super(name);
            mintcdominio = new FieldDef("mintcdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            mintcnif = new FieldDef("mintcnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mintcejercicio = new FieldDef("mintcejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mintcperiodo = new FieldDef("mintcperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mintcflujo = new FieldDef("mintcflujo",FieldDef.CHAR,1,FieldDef.NOTNULL);
            mintcnumdecl = new FieldDef("mintcnumdecl",FieldDef.INTEGER,0);
            mintctipodec = new FieldDef("mintctipodec",FieldDef.CHAR,1);
            mintcmoneda = new FieldDef("mintcmoneda",FieldDef.CHAR,1);
            mintcfechaemi = new FieldDef("mintcfechaemi",FieldDef.DATE);
            mintcniftercero = new FieldDef("mintcniftercero",FieldDef.CHAR,15);
            mintcnomtercero = new FieldDef("mintcnomtercero",FieldDef.CHAR,40);
            mintctotalmasa = new FieldDef("mintctotalmasa",FieldDef.FLOAT,6,0);
            mintctotalunid = new FieldDef("mintctotalunid",FieldDef.FLOAT,6,0);
            mintctotalfact = new FieldDef("mintctotalfact",FieldDef.FLOAT,6,0);
            mintctotalestad = new FieldDef("mintctotalestad",FieldDef.FLOAT,6,0);
            mintcnomnif = new FieldDef("mintcnomnif",FieldDef.CHAR,40);
            mintclugaremi = new FieldDef("mintclugaremi",FieldDef.CHAR,40);
            mintcnumtotpart = new FieldDef("mintcnumtotpart",FieldDef.INTEGER,0);
            FieldDef array[] = {
                mintcdominio,
                mintcnif,
                mintcejercicio,
                mintcperiodo,
                mintcflujo,
                mintcnumdecl,
                mintctipodec,
                mintcmoneda,
                mintcfechaemi,
                mintcniftercero,
                mintcnomtercero,
                mintctotalmasa,
                mintctotalunid,
                mintctotalfact,
                mintctotalestad,
                mintcnomnif,
                mintclugaremi,
                mintcnumtotpart                
                };
            setColumns(array);
            FieldDef arrayf[] = {mintcdominio,mintcnif,mintcejercicio,mintcperiodo,mintcflujo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabModintd extends TableDef
        {
        // campos
        public FieldDef mintdident;
        public FieldDef mintddominio;
        public FieldDef mintdnif;
        public FieldDef mintdejercicio;
        public FieldDef mintdperiodo;
        public FieldDef mintdflujo;
        public FieldDef mintdestamiem;
        public FieldDef mintdprovdo;
        public FieldDef mintdcondentr;
        public FieldDef mintdnatutran;
        public FieldDef mintdmodatran;
        public FieldDef mintdportcarg;
        public FieldDef mintdcodmerca;
        public FieldDef mintdpaisori;
        public FieldDef mintdregiesta;
        public FieldDef mintdmasaneta;
        public FieldDef mintdunisuple;
        public FieldDef mintdimpofact;
        public FieldDef mintdvalorest;
        public FieldDef mintdnumpartida;
        public FieldDef mintddesigmerca;
        public TabModintd(String name)
            {
            super(name);
            mintdident = new FieldDef("mintdident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mintddominio = new FieldDef("mintddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            mintdnif = new FieldDef("mintdnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            mintdejercicio = new FieldDef("mintdejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            mintdperiodo = new FieldDef("mintdperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            mintdflujo = new FieldDef("mintdflujo",FieldDef.CHAR,1,FieldDef.NOTNULL);
            mintdestamiem = new FieldDef("mintdestamiem",FieldDef.CHAR,2);
            mintdprovdo = new FieldDef("mintdprovdo",FieldDef.INTEGER,0);
            mintdcondentr = new FieldDef("mintdcondentr",FieldDef.CHAR,3);
            mintdnatutran = new FieldDef("mintdnatutran",FieldDef.INTEGER,0);
            mintdmodatran = new FieldDef("mintdmodatran",FieldDef.INTEGER,0);
            mintdportcarg = new FieldDef("mintdportcarg",FieldDef.CHAR,4);
            mintdcodmerca = new FieldDef("mintdcodmerca",FieldDef.CHAR,14);
            mintdpaisori = new FieldDef("mintdpaisori",FieldDef.CHAR,2);
            mintdregiesta = new FieldDef("mintdregiesta",FieldDef.INTEGER,0);
            mintdmasaneta = new FieldDef("mintdmasaneta",FieldDef.FLOAT,6,0);
            mintdunisuple = new FieldDef("mintdunisuple",FieldDef.FLOAT,6,0);
            mintdimpofact = new FieldDef("mintdimpofact",FieldDef.FLOAT,6,0);
            mintdvalorest = new FieldDef("mintdvalorest",FieldDef.FLOAT,6,0);
            mintdnumpartida = new FieldDef("mintdnumpartida",FieldDef.INTEGER,0);
            mintddesigmerca = new FieldDef("mintddesigmerca",FieldDef.CHAR,250);
            FieldDef array[] = {
                mintdident,
                mintddominio,
                mintdnif,
                mintdejercicio,
                mintdperiodo,
                mintdflujo,
                mintdestamiem,
                mintdprovdo,
                mintdcondentr,
                mintdnatutran,
                mintdmodatran,
                mintdportcarg,
                mintdcodmerca,
                mintdpaisori,
                mintdregiesta,
                mintdmasaneta,
                mintdunisuple,
                mintdimpofact,
                mintdvalorest,
                mintdnumpartida,
                mintddesigmerca                
                };
            setColumns(array);
            FieldDef arrayf[] = {mintdident };
            setPrimaryKeys(arrayf);
            mintdident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod110d extends TableDef
        {
        // campos
        public FieldDef m110dident;
        public FieldDef m110ddominio;
        public FieldDef m110dnif;
        public FieldDef m110dejercicio;
        public FieldDef m110dnifper;
        public FieldDef m110dnifrepre;
        public FieldDef m110dnombre;
        public FieldDef m110dprovincia;
        public FieldDef m110dclave;
        public FieldDef m110dsubclave;
        public FieldDef m110dejerdev;
        public FieldDef m110dceuta;
        public FieldDef m110dorigen;
        public FieldDef m110dautomatico;
        public FieldDef m110dmodelo;
        public FieldDef m110dapartado;
        public FieldDef m110ddinera1;
        public FieldDef m110dretencio1;
        public FieldDef m110despecie1;
        public FieldDef m110dingcta1;
        public FieldDef m110dingreper1;
        public FieldDef m110ddinera2;
        public FieldDef m110dretencio2;
        public FieldDef m110despecie2;
        public FieldDef m110dingcta2;
        public FieldDef m110dingreper2;
        public FieldDef m110ddinera3;
        public FieldDef m110dretencio3;
        public FieldDef m110despecie3;
        public FieldDef m110dingcta3;
        public FieldDef m110dingreper3;
        public FieldDef m110ddinera4;
        public FieldDef m110dretencio4;
        public FieldDef m110despecie4;
        public FieldDef m110dingcta4;
        public FieldDef m110dingreper4;
        public FieldDef m110ddinera5;
        public FieldDef m110dretencio5;
        public FieldDef m110despecie5;
        public FieldDef m110dingcta5;
        public FieldDef m110dingreper5;
        public FieldDef m110ddinera6;
        public FieldDef m110dretencio6;
        public FieldDef m110despecie6;
        public FieldDef m110dingcta6;
        public FieldDef m110dingreper6;
        public FieldDef m110ddinera7;
        public FieldDef m110dretencio7;
        public FieldDef m110despecie7;
        public FieldDef m110dingcta7;
        public FieldDef m110dingreper7;
        public FieldDef m110ddinera8;
        public FieldDef m110dretencio8;
        public FieldDef m110despecie8;
        public FieldDef m110dingcta8;
        public FieldDef m110dingreper8;
        public FieldDef m110ddinera9;
        public FieldDef m110dretencio9;
        public FieldDef m110despecie9;
        public FieldDef m110dingcta9;
        public FieldDef m110dingreper9;
        public FieldDef m110ddinera10;
        public FieldDef m110dretencio10;
        public FieldDef m110despecie10;
        public FieldDef m110dingcta10;
        public FieldDef m110dingreper10;
        public FieldDef m110ddinera11;
        public FieldDef m110dretencio11;
        public FieldDef m110despecie11;
        public FieldDef m110dingcta11;
        public FieldDef m110dingreper11;
        public FieldDef m110ddinera12;
        public FieldDef m110dretencio12;
        public FieldDef m110despecie12;
        public FieldDef m110dingcta12;
        public FieldDef m110dingreper12;
        public FieldDef m110dactividad;
        public TabMod110d(String name)
            {
            super(name);
            m110dident = new FieldDef("m110dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m110ddominio = new FieldDef("m110ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m110dnif = new FieldDef("m110dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m110dejercicio = new FieldDef("m110dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m110dnifper = new FieldDef("m110dnifper",FieldDef.CHAR,15);
            m110dnifrepre = new FieldDef("m110dnifrepre",FieldDef.CHAR,15);
            m110dnombre = new FieldDef("m110dnombre",FieldDef.CHAR,30);
            m110dprovincia = new FieldDef("m110dprovincia",FieldDef.INTEGER,0);
            m110dclave = new FieldDef("m110dclave",FieldDef.CHAR,1);
            m110dsubclave = new FieldDef("m110dsubclave",FieldDef.CHAR,2);
            m110dejerdev = new FieldDef("m110dejerdev",FieldDef.INTEGER,0);
            m110dceuta = new FieldDef("m110dceuta",FieldDef.CHAR,1);
            m110dorigen = new FieldDef("m110dorigen",FieldDef.CHAR,15);
            m110dautomatico = new FieldDef("m110dautomatico",FieldDef.CHAR,1);
            m110dmodelo = new FieldDef("m110dmodelo",FieldDef.CHAR,5);
            m110dapartado = new FieldDef("m110dapartado",FieldDef.INTEGER,0);
            m110ddinera1 = new FieldDef("m110ddinera1",FieldDef.FLOAT,6,0);
            m110dretencio1 = new FieldDef("m110dretencio1",FieldDef.FLOAT,6,0);
            m110despecie1 = new FieldDef("m110despecie1",FieldDef.FLOAT,6,0);
            m110dingcta1 = new FieldDef("m110dingcta1",FieldDef.FLOAT,6,0);
            m110dingreper1 = new FieldDef("m110dingreper1",FieldDef.FLOAT,6,0);
            m110ddinera2 = new FieldDef("m110ddinera2",FieldDef.FLOAT,6,0);
            m110dretencio2 = new FieldDef("m110dretencio2",FieldDef.FLOAT,6,0);
            m110despecie2 = new FieldDef("m110despecie2",FieldDef.FLOAT,6,0);
            m110dingcta2 = new FieldDef("m110dingcta2",FieldDef.FLOAT,6,0);
            m110dingreper2 = new FieldDef("m110dingreper2",FieldDef.FLOAT,6,0);
            m110ddinera3 = new FieldDef("m110ddinera3",FieldDef.FLOAT,6,0);
            m110dretencio3 = new FieldDef("m110dretencio3",FieldDef.FLOAT,6,0);
            m110despecie3 = new FieldDef("m110despecie3",FieldDef.FLOAT,6,0);
            m110dingcta3 = new FieldDef("m110dingcta3",FieldDef.FLOAT,6,0);
            m110dingreper3 = new FieldDef("m110dingreper3",FieldDef.FLOAT,6,0);
            m110ddinera4 = new FieldDef("m110ddinera4",FieldDef.FLOAT,6,0);
            m110dretencio4 = new FieldDef("m110dretencio4",FieldDef.FLOAT,6,0);
            m110despecie4 = new FieldDef("m110despecie4",FieldDef.FLOAT,6,0);
            m110dingcta4 = new FieldDef("m110dingcta4",FieldDef.FLOAT,6,0);
            m110dingreper4 = new FieldDef("m110dingreper4",FieldDef.FLOAT,6,0);
            m110ddinera5 = new FieldDef("m110ddinera5",FieldDef.FLOAT,6,0);
            m110dretencio5 = new FieldDef("m110dretencio5",FieldDef.FLOAT,6,0);
            m110despecie5 = new FieldDef("m110despecie5",FieldDef.FLOAT,6,0);
            m110dingcta5 = new FieldDef("m110dingcta5",FieldDef.FLOAT,6,0);
            m110dingreper5 = new FieldDef("m110dingreper5",FieldDef.FLOAT,6,0);
            m110ddinera6 = new FieldDef("m110ddinera6",FieldDef.FLOAT,6,0);
            m110dretencio6 = new FieldDef("m110dretencio6",FieldDef.FLOAT,6,0);
            m110despecie6 = new FieldDef("m110despecie6",FieldDef.FLOAT,6,0);
            m110dingcta6 = new FieldDef("m110dingcta6",FieldDef.FLOAT,6,0);
            m110dingreper6 = new FieldDef("m110dingreper6",FieldDef.FLOAT,6,0);
            m110ddinera7 = new FieldDef("m110ddinera7",FieldDef.FLOAT,6,0);
            m110dretencio7 = new FieldDef("m110dretencio7",FieldDef.FLOAT,6,0);
            m110despecie7 = new FieldDef("m110despecie7",FieldDef.FLOAT,6,0);
            m110dingcta7 = new FieldDef("m110dingcta7",FieldDef.FLOAT,6,0);
            m110dingreper7 = new FieldDef("m110dingreper7",FieldDef.FLOAT,6,0);
            m110ddinera8 = new FieldDef("m110ddinera8",FieldDef.FLOAT,6,0);
            m110dretencio8 = new FieldDef("m110dretencio8",FieldDef.FLOAT,6,0);
            m110despecie8 = new FieldDef("m110despecie8",FieldDef.FLOAT,6,0);
            m110dingcta8 = new FieldDef("m110dingcta8",FieldDef.FLOAT,6,0);
            m110dingreper8 = new FieldDef("m110dingreper8",FieldDef.FLOAT,6,0);
            m110ddinera9 = new FieldDef("m110ddinera9",FieldDef.FLOAT,6,0);
            m110dretencio9 = new FieldDef("m110dretencio9",FieldDef.FLOAT,6,0);
            m110despecie9 = new FieldDef("m110despecie9",FieldDef.FLOAT,6,0);
            m110dingcta9 = new FieldDef("m110dingcta9",FieldDef.FLOAT,6,0);
            m110dingreper9 = new FieldDef("m110dingreper9",FieldDef.FLOAT,6,0);
            m110ddinera10 = new FieldDef("m110ddinera10",FieldDef.FLOAT,6,0);
            m110dretencio10 = new FieldDef("m110dretencio10",FieldDef.FLOAT,6,0);
            m110despecie10 = new FieldDef("m110despecie10",FieldDef.FLOAT,6,0);
            m110dingcta10 = new FieldDef("m110dingcta10",FieldDef.FLOAT,6,0);
            m110dingreper10 = new FieldDef("m110dingreper10",FieldDef.FLOAT,6,0);
            m110ddinera11 = new FieldDef("m110ddinera11",FieldDef.FLOAT,6,0);
            m110dretencio11 = new FieldDef("m110dretencio11",FieldDef.FLOAT,6,0);
            m110despecie11 = new FieldDef("m110despecie11",FieldDef.FLOAT,6,0);
            m110dingcta11 = new FieldDef("m110dingcta11",FieldDef.FLOAT,6,0);
            m110dingreper11 = new FieldDef("m110dingreper11",FieldDef.FLOAT,6,0);
            m110ddinera12 = new FieldDef("m110ddinera12",FieldDef.FLOAT,6,0);
            m110dretencio12 = new FieldDef("m110dretencio12",FieldDef.FLOAT,6,0);
            m110despecie12 = new FieldDef("m110despecie12",FieldDef.FLOAT,6,0);
            m110dingcta12 = new FieldDef("m110dingcta12",FieldDef.FLOAT,6,0);
            m110dingreper12 = new FieldDef("m110dingreper12",FieldDef.FLOAT,6,0);
            m110dactividad = new FieldDef("m110dactividad",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m110dident,
                m110ddominio,
                m110dnif,
                m110dejercicio,
                m110dnifper,
                m110dnifrepre,
                m110dnombre,
                m110dprovincia,
                m110dclave,
                m110dsubclave,
                m110dejerdev,
                m110dceuta,
                m110dorigen,
                m110dautomatico,
                m110dmodelo,
                m110dapartado,
                m110ddinera1,
                m110dretencio1,
                m110despecie1,
                m110dingcta1,
                m110dingreper1,
                m110ddinera2,
                m110dretencio2,
                m110despecie2,
                m110dingcta2,
                m110dingreper2,
                m110ddinera3,
                m110dretencio3,
                m110despecie3,
                m110dingcta3,
                m110dingreper3,
                m110ddinera4,
                m110dretencio4,
                m110despecie4,
                m110dingcta4,
                m110dingreper4,
                m110ddinera5,
                m110dretencio5,
                m110despecie5,
                m110dingcta5,
                m110dingreper5,
                m110ddinera6,
                m110dretencio6,
                m110despecie6,
                m110dingcta6,
                m110dingreper6,
                m110ddinera7,
                m110dretencio7,
                m110despecie7,
                m110dingcta7,
                m110dingreper7,
                m110ddinera8,
                m110dretencio8,
                m110despecie8,
                m110dingcta8,
                m110dingreper8,
                m110ddinera9,
                m110dretencio9,
                m110despecie9,
                m110dingcta9,
                m110dingreper9,
                m110ddinera10,
                m110dretencio10,
                m110despecie10,
                m110dingcta10,
                m110dingreper10,
                m110ddinera11,
                m110dretencio11,
                m110despecie11,
                m110dingcta11,
                m110dingreper11,
                m110ddinera12,
                m110dretencio12,
                m110despecie12,
                m110dingcta12,
                m110dingreper12,
                m110dactividad                
                };
            setColumns(array);
            FieldDef arrayf[] = {m110dident };
            setPrimaryKeys(arrayf);
            m110dident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod300prodes extends TableDef
        {
        // campos
        public FieldDef m300pdominio;
        public FieldDef m300pnif;
        public FieldDef m300pejercicio;
        public FieldDef m300pperiodo;
        public FieldDef m300pgrupo;
        public FieldDef m300pactividad;
        public FieldDef m300pdedinbcb;
        public FieldDef m300pdedinbcc;
        public FieldDef m300pdedinbcb1;
        public FieldDef m300pdedinbcc1;
        public FieldDef m300pdedinbcb2;
        public FieldDef m300pdedinbcc2;
        public FieldDef m300pdedinbcb3;
        public FieldDef m300pdedinbcc3;
        public FieldDef m300pdedinbib;
        public FieldDef m300pdedinbic;
        public FieldDef m300pdedinbib1;
        public FieldDef m300pdedinbic1;
        public FieldDef m300pdedinbib2;
        public FieldDef m300pdedinbic2;
        public FieldDef m300pdedinbib3;
        public FieldDef m300pdedinbic3;
        public FieldDef m300pdedimbcb;
        public FieldDef m300pdedimbcc;
        public FieldDef m300pdedimbcb1;
        public FieldDef m300pdedimbcc1;
        public FieldDef m300pdedimbcb2;
        public FieldDef m300pdedimbcc2;
        public FieldDef m300pdedimbcb3;
        public FieldDef m300pdedimbcc3;
        public FieldDef m300pdedimbib;
        public FieldDef m300pdedimbic;
        public FieldDef m300pdedimbib1;
        public FieldDef m300pdedimbic1;
        public FieldDef m300pdedimbib2;
        public FieldDef m300pdedimbic2;
        public FieldDef m300pdedimbib3;
        public FieldDef m300pdedimbic3;
        public FieldDef m300pdedadbcb;
        public FieldDef m300pdedadbcc;
        public FieldDef m300pdedadbcb1;
        public FieldDef m300pdedadbcc1;
        public FieldDef m300pdedadbcb2;
        public FieldDef m300pdedadbcc2;
        public FieldDef m300pdedadbcb3;
        public FieldDef m300pdedadbcc3;
        public FieldDef m300pdedadbib;
        public FieldDef m300pdedadbic;
        public FieldDef m300pdedadbib1;
        public FieldDef m300pdedadbic1;
        public FieldDef m300pdedadbib2;
        public FieldDef m300pdedadbic2;
        public FieldDef m300pdedadbib3;
        public FieldDef m300pdedadbic3;
        public FieldDef m300pdedragp;
        public FieldDef m300pdedragpb;
        public FieldDef m300pdedrinv;
        public FieldDef m300pdedoirceqb;
        public FieldDef m300pdedoirceqq;
        public FieldDef m300pdedimrceqb;
        public FieldDef m300pdedimrceqq;
        public FieldDef m300pdedairceqb;
        public FieldDef m300pdedairceqq;
        public FieldDef m300pdedcmrceqb;
        public FieldDef m300pdedcmrceqq;
        public FieldDef m300pdedinscb1;
        public FieldDef m300pdedinscb2;
        public FieldDef m300pdedinscb3;
        public FieldDef m300pdedinscc1;
        public FieldDef m300pdedinscc2;
        public FieldDef m300pdedinscc3;
        public FieldDef m300pdedinscb;
        public FieldDef m300pdedinscc;
        public FieldDef m300pdediibib1;
        public FieldDef m300pdediibib2;
        public FieldDef m300pdediibib3;
        public FieldDef m300pdediibic1;
        public FieldDef m300pdediibic2;
        public FieldDef m300pdediibic3;
        public FieldDef m300pdediibib;
        public FieldDef m300pdediibic;
        public FieldDef m300pdedoieqbib;
        public FieldDef m300pdedoieqbiq;
        public FieldDef m300pdedimeqbib;
        public FieldDef m300pdedimeqbiq;
        public FieldDef m300pdedaieqbib;
        public FieldDef m300pdedaieqbiq;
        public FieldDef m300pdediservb1;
        public FieldDef m300pdediservc1;
        public FieldDef m300pdediservb2;
        public FieldDef m300pdediservc2;
        public FieldDef m300pdediservb3;
        public FieldDef m300pdediservc3;
        public FieldDef m300pdediservb;
        public FieldDef m300pdediservc;
        public FieldDef m300pdedinbcb4;
        public FieldDef m300pdedinbcc4;
        public FieldDef m300pdedinbcb5;
        public FieldDef m300pdedinbcc5;
        public FieldDef m300pdedinbib4;
        public FieldDef m300pdedinbic4;
        public FieldDef m300pdedinbib5;
        public FieldDef m300pdedinbic5;
        public FieldDef m300pdedimbcb4;
        public FieldDef m300pdedimbcc4;
        public FieldDef m300pdedimbcb5;
        public FieldDef m300pdedimbcc5;
        public FieldDef m300pdedimbib4;
        public FieldDef m300pdedimbic4;
        public FieldDef m300pdedimbib5;
        public FieldDef m300pdedimbic5;
        public FieldDef m300pdedadbcb4;
        public FieldDef m300pdedadbcc4;
        public FieldDef m300pdedadbcb5;
        public FieldDef m300pdedadbcc5;
        public FieldDef m300pdedadbib4;
        public FieldDef m300pdedadbic4;
        public FieldDef m300pdedadbib5;
        public FieldDef m300pdedadbic5;
        public FieldDef m300pdedinscb4;
        public FieldDef m300pdedinscb5;
        public FieldDef m300pdedinscc4;
        public FieldDef m300pdedinscc5;
        public FieldDef m300pdediibib4;
        public FieldDef m300pdediibib5;
        public FieldDef m300pdediibic4;
        public FieldDef m300pdediibic5;
        public FieldDef m300pdediservb4;
        public FieldDef m300pdediservc4;
        public FieldDef m300pdediservb5;
        public FieldDef m300pdediservc5;
        public TabMod300prodes(String name)
            {
            super(name);
            m300pdominio = new FieldDef("m300pdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m300pnif = new FieldDef("m300pnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m300pejercicio = new FieldDef("m300pejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m300pperiodo = new FieldDef("m300pperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m300pgrupo = new FieldDef("m300pgrupo",FieldDef.CHAR,1,FieldDef.NOTNULL);
            m300pactividad = new FieldDef("m300pactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m300pdedinbcb = new FieldDef("m300pdedinbcb",FieldDef.FLOAT,6,0);
            m300pdedinbcc = new FieldDef("m300pdedinbcc",FieldDef.FLOAT,6,0);
            m300pdedinbcb1 = new FieldDef("m300pdedinbcb1",FieldDef.FLOAT,6,0);
            m300pdedinbcc1 = new FieldDef("m300pdedinbcc1",FieldDef.FLOAT,6,0);
            m300pdedinbcb2 = new FieldDef("m300pdedinbcb2",FieldDef.FLOAT,6,0);
            m300pdedinbcc2 = new FieldDef("m300pdedinbcc2",FieldDef.FLOAT,6,0);
            m300pdedinbcb3 = new FieldDef("m300pdedinbcb3",FieldDef.FLOAT,6,0);
            m300pdedinbcc3 = new FieldDef("m300pdedinbcc3",FieldDef.FLOAT,6,0);
            m300pdedinbib = new FieldDef("m300pdedinbib",FieldDef.FLOAT,6,0);
            m300pdedinbic = new FieldDef("m300pdedinbic",FieldDef.FLOAT,6,0);
            m300pdedinbib1 = new FieldDef("m300pdedinbib1",FieldDef.FLOAT,6,0);
            m300pdedinbic1 = new FieldDef("m300pdedinbic1",FieldDef.FLOAT,6,0);
            m300pdedinbib2 = new FieldDef("m300pdedinbib2",FieldDef.FLOAT,6,0);
            m300pdedinbic2 = new FieldDef("m300pdedinbic2",FieldDef.FLOAT,6,0);
            m300pdedinbib3 = new FieldDef("m300pdedinbib3",FieldDef.FLOAT,6,0);
            m300pdedinbic3 = new FieldDef("m300pdedinbic3",FieldDef.FLOAT,6,0);
            m300pdedimbcb = new FieldDef("m300pdedimbcb",FieldDef.FLOAT,6,0);
            m300pdedimbcc = new FieldDef("m300pdedimbcc",FieldDef.FLOAT,6,0);
            m300pdedimbcb1 = new FieldDef("m300pdedimbcb1",FieldDef.FLOAT,6,0);
            m300pdedimbcc1 = new FieldDef("m300pdedimbcc1",FieldDef.FLOAT,6,0);
            m300pdedimbcb2 = new FieldDef("m300pdedimbcb2",FieldDef.FLOAT,6,0);
            m300pdedimbcc2 = new FieldDef("m300pdedimbcc2",FieldDef.FLOAT,6,0);
            m300pdedimbcb3 = new FieldDef("m300pdedimbcb3",FieldDef.FLOAT,6,0);
            m300pdedimbcc3 = new FieldDef("m300pdedimbcc3",FieldDef.FLOAT,6,0);
            m300pdedimbib = new FieldDef("m300pdedimbib",FieldDef.FLOAT,6,0);
            m300pdedimbic = new FieldDef("m300pdedimbic",FieldDef.FLOAT,6,0);
            m300pdedimbib1 = new FieldDef("m300pdedimbib1",FieldDef.FLOAT,6,0);
            m300pdedimbic1 = new FieldDef("m300pdedimbic1",FieldDef.FLOAT,6,0);
            m300pdedimbib2 = new FieldDef("m300pdedimbib2",FieldDef.FLOAT,6,0);
            m300pdedimbic2 = new FieldDef("m300pdedimbic2",FieldDef.FLOAT,6,0);
            m300pdedimbib3 = new FieldDef("m300pdedimbib3",FieldDef.FLOAT,6,0);
            m300pdedimbic3 = new FieldDef("m300pdedimbic3",FieldDef.FLOAT,6,0);
            m300pdedadbcb = new FieldDef("m300pdedadbcb",FieldDef.FLOAT,6,0);
            m300pdedadbcc = new FieldDef("m300pdedadbcc",FieldDef.FLOAT,6,0);
            m300pdedadbcb1 = new FieldDef("m300pdedadbcb1",FieldDef.FLOAT,6,0);
            m300pdedadbcc1 = new FieldDef("m300pdedadbcc1",FieldDef.FLOAT,6,0);
            m300pdedadbcb2 = new FieldDef("m300pdedadbcb2",FieldDef.FLOAT,6,0);
            m300pdedadbcc2 = new FieldDef("m300pdedadbcc2",FieldDef.FLOAT,6,0);
            m300pdedadbcb3 = new FieldDef("m300pdedadbcb3",FieldDef.FLOAT,6,0);
            m300pdedadbcc3 = new FieldDef("m300pdedadbcc3",FieldDef.FLOAT,6,0);
            m300pdedadbib = new FieldDef("m300pdedadbib",FieldDef.FLOAT,6,0);
            m300pdedadbic = new FieldDef("m300pdedadbic",FieldDef.FLOAT,6,0);
            m300pdedadbib1 = new FieldDef("m300pdedadbib1",FieldDef.FLOAT,6,0);
            m300pdedadbic1 = new FieldDef("m300pdedadbic1",FieldDef.FLOAT,6,0);
            m300pdedadbib2 = new FieldDef("m300pdedadbib2",FieldDef.FLOAT,6,0);
            m300pdedadbic2 = new FieldDef("m300pdedadbic2",FieldDef.FLOAT,6,0);
            m300pdedadbib3 = new FieldDef("m300pdedadbib3",FieldDef.FLOAT,6,0);
            m300pdedadbic3 = new FieldDef("m300pdedadbic3",FieldDef.FLOAT,6,0);
            m300pdedragp = new FieldDef("m300pdedragp",FieldDef.FLOAT,6,0);
            m300pdedragpb = new FieldDef("m300pdedragpb",FieldDef.FLOAT,6,0);
            m300pdedrinv = new FieldDef("m300pdedrinv",FieldDef.FLOAT,6,0);
            m300pdedoirceqb = new FieldDef("m300pdedoirceqb",FieldDef.FLOAT,6,0);
            m300pdedoirceqq = new FieldDef("m300pdedoirceqq",FieldDef.FLOAT,6,0);
            m300pdedimrceqb = new FieldDef("m300pdedimrceqb",FieldDef.FLOAT,6,0);
            m300pdedimrceqq = new FieldDef("m300pdedimrceqq",FieldDef.FLOAT,6,0);
            m300pdedairceqb = new FieldDef("m300pdedairceqb",FieldDef.FLOAT,6,0);
            m300pdedairceqq = new FieldDef("m300pdedairceqq",FieldDef.FLOAT,6,0);
            m300pdedcmrceqb = new FieldDef("m300pdedcmrceqb",FieldDef.FLOAT,6,0);
            m300pdedcmrceqq = new FieldDef("m300pdedcmrceqq",FieldDef.FLOAT,6,0);
            m300pdedinscb1 = new FieldDef("m300pdedinscb1",FieldDef.FLOAT,6,0);
            m300pdedinscb2 = new FieldDef("m300pdedinscb2",FieldDef.FLOAT,6,0);
            m300pdedinscb3 = new FieldDef("m300pdedinscb3",FieldDef.FLOAT,6,0);
            m300pdedinscc1 = new FieldDef("m300pdedinscc1",FieldDef.FLOAT,6,0);
            m300pdedinscc2 = new FieldDef("m300pdedinscc2",FieldDef.FLOAT,6,0);
            m300pdedinscc3 = new FieldDef("m300pdedinscc3",FieldDef.FLOAT,6,0);
            m300pdedinscb = new FieldDef("m300pdedinscb",FieldDef.FLOAT,6,0);
            m300pdedinscc = new FieldDef("m300pdedinscc",FieldDef.FLOAT,6,0);
            m300pdediibib1 = new FieldDef("m300pdediibib1",FieldDef.FLOAT,6,0);
            m300pdediibib2 = new FieldDef("m300pdediibib2",FieldDef.FLOAT,6,0);
            m300pdediibib3 = new FieldDef("m300pdediibib3",FieldDef.FLOAT,6,0);
            m300pdediibic1 = new FieldDef("m300pdediibic1",FieldDef.FLOAT,6,0);
            m300pdediibic2 = new FieldDef("m300pdediibic2",FieldDef.FLOAT,6,0);
            m300pdediibic3 = new FieldDef("m300pdediibic3",FieldDef.FLOAT,6,0);
            m300pdediibib = new FieldDef("m300pdediibib",FieldDef.FLOAT,6,0);
            m300pdediibic = new FieldDef("m300pdediibic",FieldDef.FLOAT,6,0);
            m300pdedoieqbib = new FieldDef("m300pdedoieqbib",FieldDef.FLOAT,6,0);
            m300pdedoieqbiq = new FieldDef("m300pdedoieqbiq",FieldDef.FLOAT,6,0);
            m300pdedimeqbib = new FieldDef("m300pdedimeqbib",FieldDef.FLOAT,6,0);
            m300pdedimeqbiq = new FieldDef("m300pdedimeqbiq",FieldDef.FLOAT,6,0);
            m300pdedaieqbib = new FieldDef("m300pdedaieqbib",FieldDef.FLOAT,6,0);
            m300pdedaieqbiq = new FieldDef("m300pdedaieqbiq",FieldDef.FLOAT,6,0);
            m300pdediservb1 = new FieldDef("m300pdediservb1",FieldDef.FLOAT,6,0);
            m300pdediservc1 = new FieldDef("m300pdediservc1",FieldDef.FLOAT,6,0);
            m300pdediservb2 = new FieldDef("m300pdediservb2",FieldDef.FLOAT,6,0);
            m300pdediservc2 = new FieldDef("m300pdediservc2",FieldDef.FLOAT,6,0);
            m300pdediservb3 = new FieldDef("m300pdediservb3",FieldDef.FLOAT,6,0);
            m300pdediservc3 = new FieldDef("m300pdediservc3",FieldDef.FLOAT,6,0);
            m300pdediservb = new FieldDef("m300pdediservb",FieldDef.FLOAT,6,0);
            m300pdediservc = new FieldDef("m300pdediservc",FieldDef.FLOAT,6,0);
            m300pdedinbcb4 = new FieldDef("m300pdedinbcb4",FieldDef.FLOAT,6,0);
            m300pdedinbcc4 = new FieldDef("m300pdedinbcc4",FieldDef.FLOAT,6,0);
            m300pdedinbcb5 = new FieldDef("m300pdedinbcb5",FieldDef.FLOAT,6,0);
            m300pdedinbcc5 = new FieldDef("m300pdedinbcc5",FieldDef.FLOAT,6,0);
            m300pdedinbib4 = new FieldDef("m300pdedinbib4",FieldDef.FLOAT,6,0);
            m300pdedinbic4 = new FieldDef("m300pdedinbic4",FieldDef.FLOAT,6,0);
            m300pdedinbib5 = new FieldDef("m300pdedinbib5",FieldDef.FLOAT,6,0);
            m300pdedinbic5 = new FieldDef("m300pdedinbic5",FieldDef.FLOAT,6,0);
            m300pdedimbcb4 = new FieldDef("m300pdedimbcb4",FieldDef.FLOAT,6,0);
            m300pdedimbcc4 = new FieldDef("m300pdedimbcc4",FieldDef.FLOAT,6,0);
            m300pdedimbcb5 = new FieldDef("m300pdedimbcb5",FieldDef.FLOAT,6,0);
            m300pdedimbcc5 = new FieldDef("m300pdedimbcc5",FieldDef.FLOAT,6,0);
            m300pdedimbib4 = new FieldDef("m300pdedimbib4",FieldDef.FLOAT,6,0);
            m300pdedimbic4 = new FieldDef("m300pdedimbic4",FieldDef.FLOAT,6,0);
            m300pdedimbib5 = new FieldDef("m300pdedimbib5",FieldDef.FLOAT,6,0);
            m300pdedimbic5 = new FieldDef("m300pdedimbic5",FieldDef.FLOAT,6,0);
            m300pdedadbcb4 = new FieldDef("m300pdedadbcb4",FieldDef.FLOAT,6,0);
            m300pdedadbcc4 = new FieldDef("m300pdedadbcc4",FieldDef.FLOAT,6,0);
            m300pdedadbcb5 = new FieldDef("m300pdedadbcb5",FieldDef.FLOAT,6,0);
            m300pdedadbcc5 = new FieldDef("m300pdedadbcc5",FieldDef.FLOAT,6,0);
            m300pdedadbib4 = new FieldDef("m300pdedadbib4",FieldDef.FLOAT,6,0);
            m300pdedadbic4 = new FieldDef("m300pdedadbic4",FieldDef.FLOAT,6,0);
            m300pdedadbib5 = new FieldDef("m300pdedadbib5",FieldDef.FLOAT,6,0);
            m300pdedadbic5 = new FieldDef("m300pdedadbic5",FieldDef.FLOAT,6,0);
            m300pdedinscb4 = new FieldDef("m300pdedinscb4",FieldDef.FLOAT,6,0);
            m300pdedinscb5 = new FieldDef("m300pdedinscb5",FieldDef.FLOAT,6,0);
            m300pdedinscc4 = new FieldDef("m300pdedinscc4",FieldDef.FLOAT,6,0);
            m300pdedinscc5 = new FieldDef("m300pdedinscc5",FieldDef.FLOAT,6,0);
            m300pdediibib4 = new FieldDef("m300pdediibib4",FieldDef.FLOAT,6,0);
            m300pdediibib5 = new FieldDef("m300pdediibib5",FieldDef.FLOAT,6,0);
            m300pdediibic4 = new FieldDef("m300pdediibic4",FieldDef.FLOAT,6,0);
            m300pdediibic5 = new FieldDef("m300pdediibic5",FieldDef.FLOAT,6,0);
            m300pdediservb4 = new FieldDef("m300pdediservb4",FieldDef.FLOAT,6,0);
            m300pdediservc4 = new FieldDef("m300pdediservc4",FieldDef.FLOAT,6,0);
            m300pdediservb5 = new FieldDef("m300pdediservb5",FieldDef.FLOAT,6,0);
            m300pdediservc5 = new FieldDef("m300pdediservc5",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m300pdominio,
                m300pnif,
                m300pejercicio,
                m300pperiodo,
                m300pgrupo,
                m300pactividad,
                m300pdedinbcb,
                m300pdedinbcc,
                m300pdedinbcb1,
                m300pdedinbcc1,
                m300pdedinbcb2,
                m300pdedinbcc2,
                m300pdedinbcb3,
                m300pdedinbcc3,
                m300pdedinbib,
                m300pdedinbic,
                m300pdedinbib1,
                m300pdedinbic1,
                m300pdedinbib2,
                m300pdedinbic2,
                m300pdedinbib3,
                m300pdedinbic3,
                m300pdedimbcb,
                m300pdedimbcc,
                m300pdedimbcb1,
                m300pdedimbcc1,
                m300pdedimbcb2,
                m300pdedimbcc2,
                m300pdedimbcb3,
                m300pdedimbcc3,
                m300pdedimbib,
                m300pdedimbic,
                m300pdedimbib1,
                m300pdedimbic1,
                m300pdedimbib2,
                m300pdedimbic2,
                m300pdedimbib3,
                m300pdedimbic3,
                m300pdedadbcb,
                m300pdedadbcc,
                m300pdedadbcb1,
                m300pdedadbcc1,
                m300pdedadbcb2,
                m300pdedadbcc2,
                m300pdedadbcb3,
                m300pdedadbcc3,
                m300pdedadbib,
                m300pdedadbic,
                m300pdedadbib1,
                m300pdedadbic1,
                m300pdedadbib2,
                m300pdedadbic2,
                m300pdedadbib3,
                m300pdedadbic3,
                m300pdedragp,
                m300pdedragpb,
                m300pdedrinv,
                m300pdedoirceqb,
                m300pdedoirceqq,
                m300pdedimrceqb,
                m300pdedimrceqq,
                m300pdedairceqb,
                m300pdedairceqq,
                m300pdedcmrceqb,
                m300pdedcmrceqq,
                m300pdedinscb1,
                m300pdedinscb2,
                m300pdedinscb3,
                m300pdedinscc1,
                m300pdedinscc2,
                m300pdedinscc3,
                m300pdedinscb,
                m300pdedinscc,
                m300pdediibib1,
                m300pdediibib2,
                m300pdediibib3,
                m300pdediibic1,
                m300pdediibic2,
                m300pdediibic3,
                m300pdediibib,
                m300pdediibic,
                m300pdedoieqbib,
                m300pdedoieqbiq,
                m300pdedimeqbib,
                m300pdedimeqbiq,
                m300pdedaieqbib,
                m300pdedaieqbiq,
                m300pdediservb1,
                m300pdediservc1,
                m300pdediservb2,
                m300pdediservc2,
                m300pdediservb3,
                m300pdediservc3,
                m300pdediservb,
                m300pdediservc,
                m300pdedinbcb4,
                m300pdedinbcc4,
                m300pdedinbcb5,
                m300pdedinbcc5,
                m300pdedinbib4,
                m300pdedinbic4,
                m300pdedinbib5,
                m300pdedinbic5,
                m300pdedimbcb4,
                m300pdedimbcc4,
                m300pdedimbcb5,
                m300pdedimbcc5,
                m300pdedimbib4,
                m300pdedimbic4,
                m300pdedimbib5,
                m300pdedimbic5,
                m300pdedadbcb4,
                m300pdedadbcc4,
                m300pdedadbcb5,
                m300pdedadbcc5,
                m300pdedadbib4,
                m300pdedadbic4,
                m300pdedadbib5,
                m300pdedadbic5,
                m300pdedinscb4,
                m300pdedinscb5,
                m300pdedinscc4,
                m300pdedinscc5,
                m300pdediibib4,
                m300pdediibib5,
                m300pdediibic4,
                m300pdediibic5,
                m300pdediservb4,
                m300pdediservc4,
                m300pdediservb5,
                m300pdediservc5                
                };
            setColumns(array);
            FieldDef arrayf[] = {m300pdominio,m300pnif,m300pejercicio,m300pperiodo,m300pgrupo,m300pactividad };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod390des extends TableDef
        {
        // campos
        public FieldDef m390dnif;
        public FieldDef m390dejercicio;
        public FieldDef m390dactividad;
        public FieldDef m390dperiodo;
        public FieldDef m390dvopgen;
        public FieldDef m390dvopsimp;
        public FieldDef m390dvopesp;
        public FieldDef m390dvusados;
        public FieldDef m390dvreav;
        public FieldDef m390dvoprecequ;
        public FieldDef m390dvopintex;
        public FieldDef m390dvopexport;
        public FieldDef m390dvopotrexe;
        public FieldDef m390dvopentinm;
        public FieldDef m390dvopentinv;
        public FieldDef m390doespadqint;
        public FieldDef m390doespadqexe;
        public FieldDef m390doespiexent;
        public FieldDef m390doespbisond;
        public FieldDef m390doespnosuje;
        public FieldDef m390doespsujeta;
        public FieldDef m390doespentbie;
        public FieldDef m390doespentint;
        public FieldDef m390doespentpas;
        public TabMod390des(String name)
            {
            super(name);
            m390dnif = new FieldDef("m390dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m390dejercicio = new FieldDef("m390dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m390dactividad = new FieldDef("m390dactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m390dperiodo = new FieldDef("m390dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m390dvopgen = new FieldDef("m390dvopgen",FieldDef.FLOAT,6,0);
            m390dvopsimp = new FieldDef("m390dvopsimp",FieldDef.FLOAT,6,0);
            m390dvopesp = new FieldDef("m390dvopesp",FieldDef.FLOAT,6,0);
            m390dvusados = new FieldDef("m390dvusados",FieldDef.FLOAT,6,0);
            m390dvreav = new FieldDef("m390dvreav",FieldDef.FLOAT,6,0);
            m390dvoprecequ = new FieldDef("m390dvoprecequ",FieldDef.FLOAT,6,0);
            m390dvopintex = new FieldDef("m390dvopintex",FieldDef.FLOAT,6,0);
            m390dvopexport = new FieldDef("m390dvopexport",FieldDef.FLOAT,6,0);
            m390dvopotrexe = new FieldDef("m390dvopotrexe",FieldDef.FLOAT,6,0);
            m390dvopentinm = new FieldDef("m390dvopentinm",FieldDef.FLOAT,6,0);
            m390dvopentinv = new FieldDef("m390dvopentinv",FieldDef.FLOAT,6,0);
            m390doespadqint = new FieldDef("m390doespadqint",FieldDef.FLOAT,6,0);
            m390doespadqexe = new FieldDef("m390doespadqexe",FieldDef.FLOAT,6,0);
            m390doespiexent = new FieldDef("m390doespiexent",FieldDef.FLOAT,6,0);
            m390doespbisond = new FieldDef("m390doespbisond",FieldDef.FLOAT,6,0);
            m390doespnosuje = new FieldDef("m390doespnosuje",FieldDef.FLOAT,6,0);
            m390doespsujeta = new FieldDef("m390doespsujeta",FieldDef.FLOAT,6,0);
            m390doespentbie = new FieldDef("m390doespentbie",FieldDef.FLOAT,6,0);
            m390doespentint = new FieldDef("m390doespentint",FieldDef.FLOAT,6,0);
            m390doespentpas = new FieldDef("m390doespentpas",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m390dnif,
                m390dejercicio,
                m390dactividad,
                m390dperiodo,
                m390dvopgen,
                m390dvopsimp,
                m390dvopesp,
                m390dvusados,
                m390dvreav,
                m390dvoprecequ,
                m390dvopintex,
                m390dvopexport,
                m390dvopotrexe,
                m390dvopentinm,
                m390dvopentinv,
                m390doespadqint,
                m390doespadqexe,
                m390doespiexent,
                m390doespbisond,
                m390doespnosuje,
                m390doespsujeta,
                m390doespentbie,
                m390doespentint,
                m390doespentpas                
                };
            setColumns(array);
            FieldDef arrayf[] = {m390dnif,m390dejercicio,m390dactividad,m390dperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod110acum extends TableDef
        {
        // campos
        public FieldDef m110adominio;
        public FieldDef m110anif;
        public FieldDef m110aejercicio;
        public FieldDef m110aperiodo;
        public FieldDef m110aaplic;
        public FieldDef m110artdnp;
        public FieldDef m110artdimpp;
        public FieldDef m110artdimpr;
        public FieldDef m110artenp;
        public FieldDef m110arteimpp;
        public FieldDef m110arteimpi;
        public FieldDef m110aracdnp;
        public FieldDef m110aracdimpp;
        public FieldDef m110aracdimpr;
        public FieldDef m110aracenp;
        public FieldDef m110araceimpp;
        public FieldDef m110araceimpi;
        public FieldDef m110aprednp;
        public FieldDef m110apredimpp;
        public FieldDef m110apredimpr;
        public FieldDef m110apreenp;
        public FieldDef m110apreeimpp;
        public FieldDef m110apreeimpi;
        public FieldDef m110acdinp;
        public FieldDef m110acdicsat;
        public FieldDef m110acdiimpi;
        public FieldDef m110aingimp;
        public FieldDef m110agppdnp;
        public FieldDef m110agppdip;
        public FieldDef m110agppdir;
        public FieldDef m110agpenp;
        public FieldDef m110agpeip;
        public FieldDef m110agpeir;
        public TabMod110acum(String name)
            {
            super(name);
            m110adominio = new FieldDef("m110adominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m110anif = new FieldDef("m110anif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m110aejercicio = new FieldDef("m110aejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m110aperiodo = new FieldDef("m110aperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m110aaplic = new FieldDef("m110aaplic",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m110artdnp = new FieldDef("m110artdnp",FieldDef.FLOAT,6,0);
            m110artdimpp = new FieldDef("m110artdimpp",FieldDef.FLOAT,6,0);
            m110artdimpr = new FieldDef("m110artdimpr",FieldDef.FLOAT,6,0);
            m110artenp = new FieldDef("m110artenp",FieldDef.FLOAT,6,0);
            m110arteimpp = new FieldDef("m110arteimpp",FieldDef.FLOAT,6,0);
            m110arteimpi = new FieldDef("m110arteimpi",FieldDef.FLOAT,6,0);
            m110aracdnp = new FieldDef("m110aracdnp",FieldDef.FLOAT,6,0);
            m110aracdimpp = new FieldDef("m110aracdimpp",FieldDef.FLOAT,6,0);
            m110aracdimpr = new FieldDef("m110aracdimpr",FieldDef.FLOAT,6,0);
            m110aracenp = new FieldDef("m110aracenp",FieldDef.FLOAT,6,0);
            m110araceimpp = new FieldDef("m110araceimpp",FieldDef.FLOAT,6,0);
            m110araceimpi = new FieldDef("m110araceimpi",FieldDef.FLOAT,6,0);
            m110aprednp = new FieldDef("m110aprednp",FieldDef.FLOAT,6,0);
            m110apredimpp = new FieldDef("m110apredimpp",FieldDef.FLOAT,6,0);
            m110apredimpr = new FieldDef("m110apredimpr",FieldDef.FLOAT,6,0);
            m110apreenp = new FieldDef("m110apreenp",FieldDef.FLOAT,6,0);
            m110apreeimpp = new FieldDef("m110apreeimpp",FieldDef.FLOAT,6,0);
            m110apreeimpi = new FieldDef("m110apreeimpi",FieldDef.FLOAT,6,0);
            m110acdinp = new FieldDef("m110acdinp",FieldDef.FLOAT,6,0);
            m110acdicsat = new FieldDef("m110acdicsat",FieldDef.FLOAT,6,0);
            m110acdiimpi = new FieldDef("m110acdiimpi",FieldDef.FLOAT,6,0);
            m110aingimp = new FieldDef("m110aingimp",FieldDef.FLOAT,6,0);
            m110agppdnp = new FieldDef("m110agppdnp",FieldDef.FLOAT,6,0);
            m110agppdip = new FieldDef("m110agppdip",FieldDef.FLOAT,6,0);
            m110agppdir = new FieldDef("m110agppdir",FieldDef.FLOAT,6,0);
            m110agpenp = new FieldDef("m110agpenp",FieldDef.FLOAT,6,0);
            m110agpeip = new FieldDef("m110agpeip",FieldDef.FLOAT,6,0);
            m110agpeir = new FieldDef("m110agpeir",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m110adominio,
                m110anif,
                m110aejercicio,
                m110aperiodo,
                m110aaplic,
                m110artdnp,
                m110artdimpp,
                m110artdimpr,
                m110artenp,
                m110arteimpp,
                m110arteimpi,
                m110aracdnp,
                m110aracdimpp,
                m110aracdimpr,
                m110aracenp,
                m110araceimpp,
                m110araceimpi,
                m110aprednp,
                m110apredimpp,
                m110apredimpr,
                m110apreenp,
                m110apreeimpp,
                m110apreeimpi,
                m110acdinp,
                m110acdicsat,
                m110acdiimpi,
                m110aingimp,
                m110agppdnp,
                m110agppdip,
                m110agppdir,
                m110agpenp,
                m110agpeip,
                m110agpeir                
                };
            setColumns(array);
            FieldDef arrayf[] = {m110adominio,m110anif,m110aejercicio,m110aperiodo,m110aaplic };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod349acum extends TableDef
        {
        // campos
        public FieldDef m349aident;
        public FieldDef m349adominio;
        public FieldDef m349anif;
        public FieldDef m349aejercicio;
        public FieldDef m349aactividad;
        public FieldDef m349acodpais;
        public FieldDef m349anifcomun;
        public FieldDef m349arazon;
        public FieldDef m349aclave;
        public FieldDef m349abase1t;
        public FieldDef m349aanyrec1t;
        public FieldDef m349aperirec1t;
        public FieldDef m349abaserec1t;
        public FieldDef m349abasearec1t;
        public FieldDef m349abase2t;
        public FieldDef m349aanyrec2t;
        public FieldDef m349aperirec2t;
        public FieldDef m349abaserec2t;
        public FieldDef m349abasearec2t;
        public FieldDef m349abase3t;
        public FieldDef m349aanyrec3t;
        public FieldDef m349aperirec3t;
        public FieldDef m349abaserec3t;
        public FieldDef m349abasearec3t;
        public FieldDef m349abase4t;
        public FieldDef m349aanyrec4t;
        public FieldDef m349aperirec4t;
        public FieldDef m349abaserec4t;
        public FieldDef m349abasearec4t;
        public FieldDef m349abase1;
        public FieldDef m349aanyrec1;
        public FieldDef m349aperirec1;
        public FieldDef m349abaserec1;
        public FieldDef m349abasearec1;
        public FieldDef m349abase2;
        public FieldDef m349aanyrec2;
        public FieldDef m349aperirec2;
        public FieldDef m349abaserec2;
        public FieldDef m349abasearec2;
        public FieldDef m349abase3;
        public FieldDef m349aanyrec3;
        public FieldDef m349aperirec3;
        public FieldDef m349abaserec3;
        public FieldDef m349abasearec3;
        public FieldDef m349abase4;
        public FieldDef m349aanyrec4;
        public FieldDef m349aperirec4;
        public FieldDef m349abaserec4;
        public FieldDef m349abasearec4;
        public FieldDef m349abase5;
        public FieldDef m349aanyrec5;
        public FieldDef m349aperirec5;
        public FieldDef m349abaserec5;
        public FieldDef m349abasearec5;
        public FieldDef m349abase6;
        public FieldDef m349aanyrec6;
        public FieldDef m349aperirec6;
        public FieldDef m349abaserec6;
        public FieldDef m349abasearec6;
        public FieldDef m349abase7;
        public FieldDef m349aanyrec7;
        public FieldDef m349aperirec7;
        public FieldDef m349abaserec7;
        public FieldDef m349abasearec7;
        public FieldDef m349abase8;
        public FieldDef m349aanyrec8;
        public FieldDef m349aperirec8;
        public FieldDef m349abaserec8;
        public FieldDef m349abasearec8;
        public FieldDef m349abase9;
        public FieldDef m349aanyrec9;
        public FieldDef m349aperirec9;
        public FieldDef m349abaserec9;
        public FieldDef m349abasearec9;
        public FieldDef m349abase10;
        public FieldDef m349aanyrec10;
        public FieldDef m349aperirec10;
        public FieldDef m349abaserec10;
        public FieldDef m349abasearec10;
        public FieldDef m349abase11;
        public FieldDef m349aanyrec11;
        public FieldDef m349aperirec11;
        public FieldDef m349abaserec11;
        public FieldDef m349abasearec11;
        public FieldDef m349abase12;
        public FieldDef m349aanyrec12;
        public FieldDef m349aperirec12;
        public FieldDef m349abaserec12;
        public FieldDef m349abasearec12;
        public TabMod349acum(String name)
            {
            super(name);
            m349aident = new FieldDef("m349aident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m349adominio = new FieldDef("m349adominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m349anif = new FieldDef("m349anif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m349aejercicio = new FieldDef("m349aejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m349aactividad = new FieldDef("m349aactividad",FieldDef.INTEGER,0);
            m349acodpais = new FieldDef("m349acodpais",FieldDef.CHAR,2);
            m349anifcomun = new FieldDef("m349anifcomun",FieldDef.CHAR,15);
            m349arazon = new FieldDef("m349arazon",FieldDef.CHAR,40);
            m349aclave = new FieldDef("m349aclave",FieldDef.CHAR,1);
            m349abase1t = new FieldDef("m349abase1t",FieldDef.FLOAT,6,0);
            m349aanyrec1t = new FieldDef("m349aanyrec1t",FieldDef.INTEGER,0);
            m349aperirec1t = new FieldDef("m349aperirec1t",FieldDef.CHAR,2);
            m349abaserec1t = new FieldDef("m349abaserec1t",FieldDef.FLOAT,6,0);
            m349abasearec1t = new FieldDef("m349abasearec1t",FieldDef.FLOAT,6,0);
            m349abase2t = new FieldDef("m349abase2t",FieldDef.FLOAT,6,0);
            m349aanyrec2t = new FieldDef("m349aanyrec2t",FieldDef.INTEGER,0);
            m349aperirec2t = new FieldDef("m349aperirec2t",FieldDef.CHAR,2);
            m349abaserec2t = new FieldDef("m349abaserec2t",FieldDef.FLOAT,6,0);
            m349abasearec2t = new FieldDef("m349abasearec2t",FieldDef.FLOAT,6,0);
            m349abase3t = new FieldDef("m349abase3t",FieldDef.FLOAT,6,0);
            m349aanyrec3t = new FieldDef("m349aanyrec3t",FieldDef.INTEGER,0);
            m349aperirec3t = new FieldDef("m349aperirec3t",FieldDef.CHAR,2);
            m349abaserec3t = new FieldDef("m349abaserec3t",FieldDef.FLOAT,6,0);
            m349abasearec3t = new FieldDef("m349abasearec3t",FieldDef.FLOAT,6,0);
            m349abase4t = new FieldDef("m349abase4t",FieldDef.FLOAT,6,0);
            m349aanyrec4t = new FieldDef("m349aanyrec4t",FieldDef.INTEGER,0);
            m349aperirec4t = new FieldDef("m349aperirec4t",FieldDef.CHAR,2);
            m349abaserec4t = new FieldDef("m349abaserec4t",FieldDef.FLOAT,6,0);
            m349abasearec4t = new FieldDef("m349abasearec4t",FieldDef.FLOAT,6,0);
            m349abase1 = new FieldDef("m349abase1",FieldDef.FLOAT,6,0);
            m349aanyrec1 = new FieldDef("m349aanyrec1",FieldDef.INTEGER,0);
            m349aperirec1 = new FieldDef("m349aperirec1",FieldDef.CHAR,2);
            m349abaserec1 = new FieldDef("m349abaserec1",FieldDef.FLOAT,6,0);
            m349abasearec1 = new FieldDef("m349abasearec1",FieldDef.FLOAT,6,0);
            m349abase2 = new FieldDef("m349abase2",FieldDef.FLOAT,6,0);
            m349aanyrec2 = new FieldDef("m349aanyrec2",FieldDef.INTEGER,0);
            m349aperirec2 = new FieldDef("m349aperirec2",FieldDef.CHAR,2);
            m349abaserec2 = new FieldDef("m349abaserec2",FieldDef.FLOAT,6,0);
            m349abasearec2 = new FieldDef("m349abasearec2",FieldDef.FLOAT,6,0);
            m349abase3 = new FieldDef("m349abase3",FieldDef.FLOAT,6,0);
            m349aanyrec3 = new FieldDef("m349aanyrec3",FieldDef.INTEGER,0);
            m349aperirec3 = new FieldDef("m349aperirec3",FieldDef.CHAR,2);
            m349abaserec3 = new FieldDef("m349abaserec3",FieldDef.FLOAT,6,0);
            m349abasearec3 = new FieldDef("m349abasearec3",FieldDef.FLOAT,6,0);
            m349abase4 = new FieldDef("m349abase4",FieldDef.FLOAT,6,0);
            m349aanyrec4 = new FieldDef("m349aanyrec4",FieldDef.INTEGER,0);
            m349aperirec4 = new FieldDef("m349aperirec4",FieldDef.CHAR,2);
            m349abaserec4 = new FieldDef("m349abaserec4",FieldDef.FLOAT,6,0);
            m349abasearec4 = new FieldDef("m349abasearec4",FieldDef.FLOAT,6,0);
            m349abase5 = new FieldDef("m349abase5",FieldDef.FLOAT,6,0);
            m349aanyrec5 = new FieldDef("m349aanyrec5",FieldDef.INTEGER,0);
            m349aperirec5 = new FieldDef("m349aperirec5",FieldDef.CHAR,2);
            m349abaserec5 = new FieldDef("m349abaserec5",FieldDef.FLOAT,6,0);
            m349abasearec5 = new FieldDef("m349abasearec5",FieldDef.FLOAT,6,0);
            m349abase6 = new FieldDef("m349abase6",FieldDef.FLOAT,6,0);
            m349aanyrec6 = new FieldDef("m349aanyrec6",FieldDef.INTEGER,0);
            m349aperirec6 = new FieldDef("m349aperirec6",FieldDef.CHAR,2);
            m349abaserec6 = new FieldDef("m349abaserec6",FieldDef.FLOAT,6,0);
            m349abasearec6 = new FieldDef("m349abasearec6",FieldDef.FLOAT,6,0);
            m349abase7 = new FieldDef("m349abase7",FieldDef.FLOAT,6,0);
            m349aanyrec7 = new FieldDef("m349aanyrec7",FieldDef.INTEGER,0);
            m349aperirec7 = new FieldDef("m349aperirec7",FieldDef.CHAR,2);
            m349abaserec7 = new FieldDef("m349abaserec7",FieldDef.FLOAT,6,0);
            m349abasearec7 = new FieldDef("m349abasearec7",FieldDef.FLOAT,6,0);
            m349abase8 = new FieldDef("m349abase8",FieldDef.FLOAT,6,0);
            m349aanyrec8 = new FieldDef("m349aanyrec8",FieldDef.INTEGER,0);
            m349aperirec8 = new FieldDef("m349aperirec8",FieldDef.CHAR,2);
            m349abaserec8 = new FieldDef("m349abaserec8",FieldDef.FLOAT,6,0);
            m349abasearec8 = new FieldDef("m349abasearec8",FieldDef.FLOAT,6,0);
            m349abase9 = new FieldDef("m349abase9",FieldDef.FLOAT,6,0);
            m349aanyrec9 = new FieldDef("m349aanyrec9",FieldDef.INTEGER,0);
            m349aperirec9 = new FieldDef("m349aperirec9",FieldDef.CHAR,2);
            m349abaserec9 = new FieldDef("m349abaserec9",FieldDef.FLOAT,6,0);
            m349abasearec9 = new FieldDef("m349abasearec9",FieldDef.FLOAT,6,0);
            m349abase10 = new FieldDef("m349abase10",FieldDef.FLOAT,6,0);
            m349aanyrec10 = new FieldDef("m349aanyrec10",FieldDef.INTEGER,0);
            m349aperirec10 = new FieldDef("m349aperirec10",FieldDef.CHAR,2);
            m349abaserec10 = new FieldDef("m349abaserec10",FieldDef.FLOAT,6,0);
            m349abasearec10 = new FieldDef("m349abasearec10",FieldDef.FLOAT,6,0);
            m349abase11 = new FieldDef("m349abase11",FieldDef.FLOAT,6,0);
            m349aanyrec11 = new FieldDef("m349aanyrec11",FieldDef.INTEGER,0);
            m349aperirec11 = new FieldDef("m349aperirec11",FieldDef.CHAR,2);
            m349abaserec11 = new FieldDef("m349abaserec11",FieldDef.FLOAT,6,0);
            m349abasearec11 = new FieldDef("m349abasearec11",FieldDef.FLOAT,6,0);
            m349abase12 = new FieldDef("m349abase12",FieldDef.FLOAT,6,0);
            m349aanyrec12 = new FieldDef("m349aanyrec12",FieldDef.INTEGER,0);
            m349aperirec12 = new FieldDef("m349aperirec12",FieldDef.CHAR,2);
            m349abaserec12 = new FieldDef("m349abaserec12",FieldDef.FLOAT,6,0);
            m349abasearec12 = new FieldDef("m349abasearec12",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m349aident,
                m349adominio,
                m349anif,
                m349aejercicio,
                m349aactividad,
                m349acodpais,
                m349anifcomun,
                m349arazon,
                m349aclave,
                m349abase1t,
                m349aanyrec1t,
                m349aperirec1t,
                m349abaserec1t,
                m349abasearec1t,
                m349abase2t,
                m349aanyrec2t,
                m349aperirec2t,
                m349abaserec2t,
                m349abasearec2t,
                m349abase3t,
                m349aanyrec3t,
                m349aperirec3t,
                m349abaserec3t,
                m349abasearec3t,
                m349abase4t,
                m349aanyrec4t,
                m349aperirec4t,
                m349abaserec4t,
                m349abasearec4t,
                m349abase1,
                m349aanyrec1,
                m349aperirec1,
                m349abaserec1,
                m349abasearec1,
                m349abase2,
                m349aanyrec2,
                m349aperirec2,
                m349abaserec2,
                m349abasearec2,
                m349abase3,
                m349aanyrec3,
                m349aperirec3,
                m349abaserec3,
                m349abasearec3,
                m349abase4,
                m349aanyrec4,
                m349aperirec4,
                m349abaserec4,
                m349abasearec4,
                m349abase5,
                m349aanyrec5,
                m349aperirec5,
                m349abaserec5,
                m349abasearec5,
                m349abase6,
                m349aanyrec6,
                m349aperirec6,
                m349abaserec6,
                m349abasearec6,
                m349abase7,
                m349aanyrec7,
                m349aperirec7,
                m349abaserec7,
                m349abasearec7,
                m349abase8,
                m349aanyrec8,
                m349aperirec8,
                m349abaserec8,
                m349abasearec8,
                m349abase9,
                m349aanyrec9,
                m349aperirec9,
                m349abaserec9,
                m349abasearec9,
                m349abase10,
                m349aanyrec10,
                m349aperirec10,
                m349abaserec10,
                m349abasearec10,
                m349abase11,
                m349aanyrec11,
                m349aperirec11,
                m349abaserec11,
                m349abasearec11,
                m349abase12,
                m349aanyrec12,
                m349aperirec12,
                m349abaserec12,
                m349abasearec12                
                };
            setColumns(array);
            FieldDef arrayf[] = {m349aident };
            setPrimaryKeys(arrayf);
            m349aident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod123d extends TableDef
        {
        // campos
        public FieldDef m123dident;
        public FieldDef m123ddominio;
        public FieldDef m123dnif;
        public FieldDef m123dejercicio;
        public FieldDef m123dactividad;
        public FieldDef m123dnifper;
        public FieldDef m123dnifrepre;
        public FieldDef m123drazon;
        public FieldDef m123dprovincia;
        public FieldDef m123dclaveper;
        public FieldDef m123dnatura;
        public FieldDef m123dejerdev;
        public FieldDef m123dtipoper;
        public FieldDef m123dimporte;
        public FieldDef m123dreduccio;
        public FieldDef m123dbaseret;
        public FieldDef m123dporcen;
        public FieldDef m123dingcta;
        public FieldDef m123dclave;
        public FieldDef m123dcodemisor;
        public FieldDef m123dpago;
        public FieldDef m123dtipocod;
        public FieldDef m123dctavalores;
        public FieldDef m123dfecinipres;
        public FieldDef m123dfecfinpres;
        public FieldDef m123dcompensa;
        public FieldDef m123dgarantias;
        public FieldDef m123dmediador;
        public FieldDef m123dpte;
        public FieldDef m123dorigen;
        public FieldDef m123dautomatico;
        public FieldDef m123dbaseret1;
        public FieldDef m123dporcen1;
        public FieldDef m123dingcta1;
        public FieldDef m123dingrper1;
        public FieldDef m123dbaseret2;
        public FieldDef m123dporcen2;
        public FieldDef m123dingcta2;
        public FieldDef m123dingrper2;
        public FieldDef m123dbaseret3;
        public FieldDef m123dporcen3;
        public FieldDef m123dingcta3;
        public FieldDef m123dingrper3;
        public FieldDef m123dbaseret4;
        public FieldDef m123dporcen4;
        public FieldDef m123dingcta4;
        public FieldDef m123dingrper4;
        public FieldDef m123dbaseret5;
        public FieldDef m123dporcen5;
        public FieldDef m123dingcta5;
        public FieldDef m123dingrper5;
        public FieldDef m123dbaseret6;
        public FieldDef m123dporcen6;
        public FieldDef m123dingcta6;
        public FieldDef m123dingrper6;
        public FieldDef m123dbaseret7;
        public FieldDef m123dporcen7;
        public FieldDef m123dingcta7;
        public FieldDef m123dingrper7;
        public FieldDef m123dbaseret8;
        public FieldDef m123dporcen8;
        public FieldDef m123dingcta8;
        public FieldDef m123dingrper8;
        public FieldDef m123dbaseret9;
        public FieldDef m123dporcen9;
        public FieldDef m123dingcta9;
        public FieldDef m123dingrper9;
        public FieldDef m123dbaseret10;
        public FieldDef m123dporcen10;
        public FieldDef m123dingcta10;
        public FieldDef m123dingrper10;
        public FieldDef m123dbaseret11;
        public FieldDef m123dporcen11;
        public FieldDef m123dingcta11;
        public FieldDef m123dingrper11;
        public FieldDef m123dbaseret12;
        public FieldDef m123dporcen12;
        public FieldDef m123dingcta12;
        public FieldDef m123dingrper12;
        public TabMod123d(String name)
            {
            super(name);
            m123dident = new FieldDef("m123dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m123ddominio = new FieldDef("m123ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m123dnif = new FieldDef("m123dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m123dejercicio = new FieldDef("m123dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m123dactividad = new FieldDef("m123dactividad",FieldDef.FLOAT,6,0,FieldDef.NOTNULL);
            m123dnifper = new FieldDef("m123dnifper",FieldDef.CHAR,15);
            m123dnifrepre = new FieldDef("m123dnifrepre",FieldDef.CHAR,15);
            m123drazon = new FieldDef("m123drazon",FieldDef.CHAR,40);
            m123dprovincia = new FieldDef("m123dprovincia",FieldDef.INTEGER,0);
            m123dclaveper = new FieldDef("m123dclaveper",FieldDef.CHAR,1);
            m123dnatura = new FieldDef("m123dnatura",FieldDef.CHAR,2);
            m123dejerdev = new FieldDef("m123dejerdev",FieldDef.INTEGER,0);
            m123dtipoper = new FieldDef("m123dtipoper",FieldDef.CHAR,1);
            m123dimporte = new FieldDef("m123dimporte",FieldDef.FLOAT,6,0);
            m123dreduccio = new FieldDef("m123dreduccio",FieldDef.FLOAT,6,0);
            m123dbaseret = new FieldDef("m123dbaseret",FieldDef.FLOAT,6,0);
            m123dporcen = new FieldDef("m123dporcen",FieldDef.FLOAT,6,0);
            m123dingcta = new FieldDef("m123dingcta",FieldDef.FLOAT,6,0);
            m123dclave = new FieldDef("m123dclave",FieldDef.CHAR,1);
            m123dcodemisor = new FieldDef("m123dcodemisor",FieldDef.CHAR,12);
            m123dpago = new FieldDef("m123dpago",FieldDef.CHAR,1);
            m123dtipocod = new FieldDef("m123dtipocod",FieldDef.CHAR,1);
            m123dctavalores = new FieldDef("m123dctavalores",FieldDef.CHAR,20);
            m123dfecinipres = new FieldDef("m123dfecinipres",FieldDef.DATE);
            m123dfecfinpres = new FieldDef("m123dfecfinpres",FieldDef.DATE);
            m123dcompensa = new FieldDef("m123dcompensa",FieldDef.FLOAT,6,0);
            m123dgarantias = new FieldDef("m123dgarantias",FieldDef.FLOAT,6,0);
            m123dmediador = new FieldDef("m123dmediador",FieldDef.CHAR,1);
            m123dpte = new FieldDef("m123dpte",FieldDef.CHAR,1);
            m123dorigen = new FieldDef("m123dorigen",FieldDef.CHAR,15);
            m123dautomatico = new FieldDef("m123dautomatico",FieldDef.CHAR,1);
            m123dbaseret1 = new FieldDef("m123dbaseret1",FieldDef.FLOAT,6,0);
            m123dporcen1 = new FieldDef("m123dporcen1",FieldDef.FLOAT,6,0);
            m123dingcta1 = new FieldDef("m123dingcta1",FieldDef.FLOAT,6,0);
            m123dingrper1 = new FieldDef("m123dingrper1",FieldDef.FLOAT,6,0);
            m123dbaseret2 = new FieldDef("m123dbaseret2",FieldDef.FLOAT,6,0);
            m123dporcen2 = new FieldDef("m123dporcen2",FieldDef.FLOAT,6,0);
            m123dingcta2 = new FieldDef("m123dingcta2",FieldDef.FLOAT,6,0);
            m123dingrper2 = new FieldDef("m123dingrper2",FieldDef.FLOAT,6,0);
            m123dbaseret3 = new FieldDef("m123dbaseret3",FieldDef.FLOAT,6,0);
            m123dporcen3 = new FieldDef("m123dporcen3",FieldDef.FLOAT,6,0);
            m123dingcta3 = new FieldDef("m123dingcta3",FieldDef.FLOAT,6,0);
            m123dingrper3 = new FieldDef("m123dingrper3",FieldDef.FLOAT,6,0);
            m123dbaseret4 = new FieldDef("m123dbaseret4",FieldDef.FLOAT,6,0);
            m123dporcen4 = new FieldDef("m123dporcen4",FieldDef.FLOAT,6,0);
            m123dingcta4 = new FieldDef("m123dingcta4",FieldDef.FLOAT,6,0);
            m123dingrper4 = new FieldDef("m123dingrper4",FieldDef.FLOAT,6,0);
            m123dbaseret5 = new FieldDef("m123dbaseret5",FieldDef.FLOAT,6,0);
            m123dporcen5 = new FieldDef("m123dporcen5",FieldDef.FLOAT,6,0);
            m123dingcta5 = new FieldDef("m123dingcta5",FieldDef.FLOAT,6,0);
            m123dingrper5 = new FieldDef("m123dingrper5",FieldDef.FLOAT,6,0);
            m123dbaseret6 = new FieldDef("m123dbaseret6",FieldDef.FLOAT,6,0);
            m123dporcen6 = new FieldDef("m123dporcen6",FieldDef.FLOAT,6,0);
            m123dingcta6 = new FieldDef("m123dingcta6",FieldDef.FLOAT,6,0);
            m123dingrper6 = new FieldDef("m123dingrper6",FieldDef.FLOAT,6,0);
            m123dbaseret7 = new FieldDef("m123dbaseret7",FieldDef.FLOAT,6,0);
            m123dporcen7 = new FieldDef("m123dporcen7",FieldDef.FLOAT,6,0);
            m123dingcta7 = new FieldDef("m123dingcta7",FieldDef.FLOAT,6,0);
            m123dingrper7 = new FieldDef("m123dingrper7",FieldDef.FLOAT,6,0);
            m123dbaseret8 = new FieldDef("m123dbaseret8",FieldDef.FLOAT,6,0);
            m123dporcen8 = new FieldDef("m123dporcen8",FieldDef.FLOAT,6,0);
            m123dingcta8 = new FieldDef("m123dingcta8",FieldDef.FLOAT,6,0);
            m123dingrper8 = new FieldDef("m123dingrper8",FieldDef.FLOAT,6,0);
            m123dbaseret9 = new FieldDef("m123dbaseret9",FieldDef.FLOAT,6,0);
            m123dporcen9 = new FieldDef("m123dporcen9",FieldDef.FLOAT,6,0);
            m123dingcta9 = new FieldDef("m123dingcta9",FieldDef.FLOAT,6,0);
            m123dingrper9 = new FieldDef("m123dingrper9",FieldDef.FLOAT,6,0);
            m123dbaseret10 = new FieldDef("m123dbaseret10",FieldDef.FLOAT,6,0);
            m123dporcen10 = new FieldDef("m123dporcen10",FieldDef.FLOAT,6,0);
            m123dingcta10 = new FieldDef("m123dingcta10",FieldDef.FLOAT,6,0);
            m123dingrper10 = new FieldDef("m123dingrper10",FieldDef.FLOAT,6,0);
            m123dbaseret11 = new FieldDef("m123dbaseret11",FieldDef.FLOAT,6,0);
            m123dporcen11 = new FieldDef("m123dporcen11",FieldDef.FLOAT,6,0);
            m123dingcta11 = new FieldDef("m123dingcta11",FieldDef.FLOAT,6,0);
            m123dingrper11 = new FieldDef("m123dingrper11",FieldDef.FLOAT,6,0);
            m123dbaseret12 = new FieldDef("m123dbaseret12",FieldDef.FLOAT,6,0);
            m123dporcen12 = new FieldDef("m123dporcen12",FieldDef.FLOAT,6,0);
            m123dingcta12 = new FieldDef("m123dingcta12",FieldDef.FLOAT,6,0);
            m123dingrper12 = new FieldDef("m123dingrper12",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m123dident,
                m123ddominio,
                m123dnif,
                m123dejercicio,
                m123dactividad,
                m123dnifper,
                m123dnifrepre,
                m123drazon,
                m123dprovincia,
                m123dclaveper,
                m123dnatura,
                m123dejerdev,
                m123dtipoper,
                m123dimporte,
                m123dreduccio,
                m123dbaseret,
                m123dporcen,
                m123dingcta,
                m123dclave,
                m123dcodemisor,
                m123dpago,
                m123dtipocod,
                m123dctavalores,
                m123dfecinipres,
                m123dfecfinpres,
                m123dcompensa,
                m123dgarantias,
                m123dmediador,
                m123dpte,
                m123dorigen,
                m123dautomatico,
                m123dbaseret1,
                m123dporcen1,
                m123dingcta1,
                m123dingrper1,
                m123dbaseret2,
                m123dporcen2,
                m123dingcta2,
                m123dingrper2,
                m123dbaseret3,
                m123dporcen3,
                m123dingcta3,
                m123dingrper3,
                m123dbaseret4,
                m123dporcen4,
                m123dingcta4,
                m123dingrper4,
                m123dbaseret5,
                m123dporcen5,
                m123dingcta5,
                m123dingrper5,
                m123dbaseret6,
                m123dporcen6,
                m123dingcta6,
                m123dingrper6,
                m123dbaseret7,
                m123dporcen7,
                m123dingcta7,
                m123dingrper7,
                m123dbaseret8,
                m123dporcen8,
                m123dingcta8,
                m123dingrper8,
                m123dbaseret9,
                m123dporcen9,
                m123dingcta9,
                m123dingrper9,
                m123dbaseret10,
                m123dporcen10,
                m123dingcta10,
                m123dingrper10,
                m123dbaseret11,
                m123dporcen11,
                m123dingcta11,
                m123dingrper11,
                m123dbaseret12,
                m123dporcen12,
                m123dingcta12,
                m123dingrper12                
                };
            setColumns(array);
            FieldDef arrayf[] = {m123dident };
            setPrimaryKeys(arrayf);
            m123dident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod216 extends TableDef
        {
        // campos
        public FieldDef m216dominio;
        public FieldDef m216nif;
        public FieldDef m216ejercicio;
        public FieldDef m216periodo;
        public FieldDef m216conceptof;
        public FieldDef m216tipodecla;
        public FieldDef m216razon;
        public FieldDef m216primerape;
        public FieldDef m216retnrentas;
        public FieldDef m216retbase;
        public FieldDef m216retimporte;
        public FieldDef m216noretnrent;
        public FieldDef m216noretimpor;
        public FieldDef m216adeducir;
        public FieldDef m216resultado;
        public FieldDef m216impingreso;
        public FieldDef m216entingreso;
        public FieldDef m216ofiingreso;
        public FieldDef m216digiingreso;
        public FieldDef m216ctaingreso;
        public FieldDef m216cruzefec;
        public FieldDef m216cruzadeu;
        public FieldDef m216cruzccc;
        public FieldDef m216cruzneg;
        public FieldDef m216cruzcomp;
        public FieldDef m216codigoante;
        public FieldDef m216justifican;
        public FieldDef m216perscont;
        public FieldDef m216telefono;
        public FieldDef m216observa;
        public FieldDef m216fecha;
        public FieldDef m216apellidos;
        public FieldDef m216nombre;
        public FieldDef m216ibanpa;
        public FieldDef m216ibandc;
        public TabMod216(String name)
            {
            super(name);
            m216dominio = new FieldDef("m216dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m216nif = new FieldDef("m216nif",FieldDef.CHAR,9,FieldDef.NOTNULL);
            m216ejercicio = new FieldDef("m216ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m216periodo = new FieldDef("m216periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m216conceptof = new FieldDef("m216conceptof",FieldDef.CHAR,3);
            m216tipodecla = new FieldDef("m216tipodecla",FieldDef.CHAR,1);
            m216razon = new FieldDef("m216razon",FieldDef.CHAR,40);
            m216primerape = new FieldDef("m216primerape",FieldDef.CHAR,4);
            m216retnrentas = new FieldDef("m216retnrentas",FieldDef.FLOAT,6,0);
            m216retbase = new FieldDef("m216retbase",FieldDef.FLOAT,6,0);
            m216retimporte = new FieldDef("m216retimporte",FieldDef.FLOAT,6,0);
            m216noretnrent = new FieldDef("m216noretnrent",FieldDef.FLOAT,6,0);
            m216noretimpor = new FieldDef("m216noretimpor",FieldDef.FLOAT,6,0);
            m216adeducir = new FieldDef("m216adeducir",FieldDef.FLOAT,6,0);
            m216resultado = new FieldDef("m216resultado",FieldDef.FLOAT,6,0);
            m216impingreso = new FieldDef("m216impingreso",FieldDef.FLOAT,6,0);
            m216entingreso = new FieldDef("m216entingreso",FieldDef.CHAR,4);
            m216ofiingreso = new FieldDef("m216ofiingreso",FieldDef.CHAR,4);
            m216digiingreso = new FieldDef("m216digiingreso",FieldDef.CHAR,2);
            m216ctaingreso = new FieldDef("m216ctaingreso",FieldDef.CHAR,10);
            m216cruzefec = new FieldDef("m216cruzefec",FieldDef.CHAR,1);
            m216cruzadeu = new FieldDef("m216cruzadeu",FieldDef.CHAR,1);
            m216cruzccc = new FieldDef("m216cruzccc",FieldDef.CHAR,1);
            m216cruzneg = new FieldDef("m216cruzneg",FieldDef.CHAR,1);
            m216cruzcomp = new FieldDef("m216cruzcomp",FieldDef.CHAR,1);
            m216codigoante = new FieldDef("m216codigoante",FieldDef.CHAR,16);
            m216justifican = new FieldDef("m216justifican",FieldDef.CHAR,13);
            m216perscont = new FieldDef("m216perscont",FieldDef.CHAR,100);
            m216telefono = new FieldDef("m216telefono",FieldDef.CHAR,20);
            m216observa = new FieldDef("m216observa",FieldDef.CHAR,250);
            m216fecha = new FieldDef("m216fecha",FieldDef.DATE);
            m216apellidos = new FieldDef("m216apellidos",FieldDef.CHAR,60);
            m216nombre = new FieldDef("m216nombre",FieldDef.CHAR,20);
            m216ibanpa = new FieldDef("m216ibanpa",FieldDef.CHAR,2);
            m216ibandc = new FieldDef("m216ibandc",FieldDef.CHAR,2);
            FieldDef array[] = {
                m216dominio,
                m216nif,
                m216ejercicio,
                m216periodo,
                m216conceptof,
                m216tipodecla,
                m216razon,
                m216primerape,
                m216retnrentas,
                m216retbase,
                m216retimporte,
                m216noretnrent,
                m216noretimpor,
                m216adeducir,
                m216resultado,
                m216impingreso,
                m216entingreso,
                m216ofiingreso,
                m216digiingreso,
                m216ctaingreso,
                m216cruzefec,
                m216cruzadeu,
                m216cruzccc,
                m216cruzneg,
                m216cruzcomp,
                m216codigoante,
                m216justifican,
                m216perscont,
                m216telefono,
                m216observa,
                m216fecha,
                m216apellidos,
                m216nombre,
                m216ibanpa,
                m216ibandc                
                };
            setColumns(array);
            FieldDef arrayf[] = {m216dominio,m216nif,m216ejercicio,m216periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod216d extends TableDef
        {
        // campos
        public FieldDef m216dident;
        public FieldDef m216ddominio;
        public FieldDef m216dnif;
        public FieldDef m216dejercicio;
        public FieldDef m216dnifpercep;
        public FieldDef m216dnifrepres;
        public FieldDef m216dfj;
        public FieldDef m216dapellidos;
        public FieldDef m216dfechadeve;
        public FieldDef m216dnaturalez;
        public FieldDef m216dclave;
        public FieldDef m216dsubclave;
        public FieldDef m216dsigno;
        public FieldDef m216dmediador;
        public FieldDef m216dcodigo;
        public FieldDef m216dcodemisor;
        public FieldDef m216dpago;
        public FieldDef m216dtipocodig;
        public FieldDef m216entingreso;
        public FieldDef m216ofiingreso;
        public FieldDef m216digiingreso;
        public FieldDef m216ctaingreso;
        public FieldDef m216dpendiente;
        public FieldDef m216dejerdeven;
        public FieldDef m216dfechainip;
        public FieldDef m216dfechafinp;
        public FieldDef m216dremuprest;
        public FieldDef m216dcompensac;
        public FieldDef m216dgarantias;
        public FieldDef m216ddomicilio;
        public FieldDef m216dcdomicili;
        public FieldDef m216dpoblacion;
        public FieldDef m216dprovincia;
        public FieldDef m216dcodpostal;
        public FieldDef m216dcodpais;
        public FieldDef m216dnifpais;
        public FieldDef m216dfechanaci;
        public FieldDef m216dlugarnaci;
        public FieldDef m216dcpaisnaci;
        public FieldDef m216dpaisfiscal;
        public FieldDef m216dbase1;
        public FieldDef m216dporcen1;
        public FieldDef m216dingcta1;
        public FieldDef m216noretimp1;
        public FieldDef m216dbase2;
        public FieldDef m216dporcen2;
        public FieldDef m216dingcta2;
        public FieldDef m216noretimp2;
        public FieldDef m216dbase3;
        public FieldDef m216dporcen3;
        public FieldDef m216dingcta3;
        public FieldDef m216noretimp3;
        public FieldDef m216dbase4;
        public FieldDef m216dporcen4;
        public FieldDef m216dingcta4;
        public FieldDef m216noretimp4;
        public FieldDef m216dbase5;
        public FieldDef m216dporcen5;
        public FieldDef m216dingcta5;
        public FieldDef m216noretimp5;
        public FieldDef m216dbase6;
        public FieldDef m216dporcen6;
        public FieldDef m216dingcta6;
        public FieldDef m216noretimp6;
        public FieldDef m216dbase7;
        public FieldDef m216dporcen7;
        public FieldDef m216dingcta7;
        public FieldDef m216noretimp7;
        public FieldDef m216dbase8;
        public FieldDef m216dporcen8;
        public FieldDef m216dingcta8;
        public FieldDef m216noretimp8;
        public FieldDef m216dbase9;
        public FieldDef m216dporcen9;
        public FieldDef m216dingcta9;
        public FieldDef m216noretimp9;
        public FieldDef m216dbase10;
        public FieldDef m216dporcen10;
        public FieldDef m216dingcta10;
        public FieldDef m216noretimp10;
        public FieldDef m216dbase11;
        public FieldDef m216dporcen11;
        public FieldDef m216dingcta11;
        public FieldDef m216noretimp11;
        public FieldDef m216dbase12;
        public FieldDef m216dporcen12;
        public FieldDef m216dingcta12;
        public FieldDef m216noretimp12;
        public TabMod216d(String name)
            {
            super(name);
            m216dident = new FieldDef("m216dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m216ddominio = new FieldDef("m216ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m216dnif = new FieldDef("m216dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m216dejercicio = new FieldDef("m216dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m216dnifpercep = new FieldDef("m216dnifpercep",FieldDef.CHAR,9);
            m216dnifrepres = new FieldDef("m216dnifrepres",FieldDef.CHAR,9);
            m216dfj = new FieldDef("m216dfj",FieldDef.CHAR,1);
            m216dapellidos = new FieldDef("m216dapellidos",FieldDef.CHAR,40);
            m216dfechadeve = new FieldDef("m216dfechadeve",FieldDef.DATE);
            m216dnaturalez = new FieldDef("m216dnaturalez",FieldDef.CHAR,1);
            m216dclave = new FieldDef("m216dclave",FieldDef.INTEGER,0);
            m216dsubclave = new FieldDef("m216dsubclave",FieldDef.INTEGER,0);
            m216dsigno = new FieldDef("m216dsigno",FieldDef.CHAR,1);
            m216dmediador = new FieldDef("m216dmediador",FieldDef.CHAR,1);
            m216dcodigo = new FieldDef("m216dcodigo",FieldDef.INTEGER,0);
            m216dcodemisor = new FieldDef("m216dcodemisor",FieldDef.CHAR,12);
            m216dpago = new FieldDef("m216dpago",FieldDef.INTEGER,0);
            m216dtipocodig = new FieldDef("m216dtipocodig",FieldDef.CHAR,1);
            m216entingreso = new FieldDef("m216entingreso",FieldDef.CHAR,4);
            m216ofiingreso = new FieldDef("m216ofiingreso",FieldDef.CHAR,4);
            m216digiingreso = new FieldDef("m216digiingreso",FieldDef.CHAR,2);
            m216ctaingreso = new FieldDef("m216ctaingreso",FieldDef.CHAR,10);
            m216dpendiente = new FieldDef("m216dpendiente",FieldDef.CHAR,1);
            m216dejerdeven = new FieldDef("m216dejerdeven",FieldDef.INTEGER,0);
            m216dfechainip = new FieldDef("m216dfechainip",FieldDef.DATE);
            m216dfechafinp = new FieldDef("m216dfechafinp",FieldDef.DATE);
            m216dremuprest = new FieldDef("m216dremuprest",FieldDef.FLOAT,6,0);
            m216dcompensac = new FieldDef("m216dcompensac",FieldDef.FLOAT,6,0);
            m216dgarantias = new FieldDef("m216dgarantias",FieldDef.FLOAT,6,0);
            m216ddomicilio = new FieldDef("m216ddomicilio",FieldDef.CHAR,50);
            m216dcdomicili = new FieldDef("m216dcdomicili",FieldDef.CHAR,40);
            m216dpoblacion = new FieldDef("m216dpoblacion",FieldDef.CHAR,30);
            m216dprovincia = new FieldDef("m216dprovincia",FieldDef.CHAR,30);
            m216dcodpostal = new FieldDef("m216dcodpostal",FieldDef.CHAR,10);
            m216dcodpais = new FieldDef("m216dcodpais",FieldDef.CHAR,2);
            m216dnifpais = new FieldDef("m216dnifpais",FieldDef.CHAR,20);
            m216dfechanaci = new FieldDef("m216dfechanaci",FieldDef.DATE);
            m216dlugarnaci = new FieldDef("m216dlugarnaci",FieldDef.CHAR,35);
            m216dcpaisnaci = new FieldDef("m216dcpaisnaci",FieldDef.CHAR,2);
            m216dpaisfiscal = new FieldDef("m216dpaisfiscal",FieldDef.CHAR,2);
            m216dbase1 = new FieldDef("m216dbase1",FieldDef.FLOAT,6,0);
            m216dporcen1 = new FieldDef("m216dporcen1",FieldDef.FLOAT,6,0);
            m216dingcta1 = new FieldDef("m216dingcta1",FieldDef.FLOAT,6,0);
            m216noretimp1 = new FieldDef("m216noretimp1",FieldDef.FLOAT,6,0);
            m216dbase2 = new FieldDef("m216dbase2",FieldDef.FLOAT,6,0);
            m216dporcen2 = new FieldDef("m216dporcen2",FieldDef.FLOAT,6,0);
            m216dingcta2 = new FieldDef("m216dingcta2",FieldDef.FLOAT,6,0);
            m216noretimp2 = new FieldDef("m216noretimp2",FieldDef.FLOAT,6,0);
            m216dbase3 = new FieldDef("m216dbase3",FieldDef.FLOAT,6,0);
            m216dporcen3 = new FieldDef("m216dporcen3",FieldDef.FLOAT,6,0);
            m216dingcta3 = new FieldDef("m216dingcta3",FieldDef.FLOAT,6,0);
            m216noretimp3 = new FieldDef("m216noretimp3",FieldDef.FLOAT,6,0);
            m216dbase4 = new FieldDef("m216dbase4",FieldDef.FLOAT,6,0);
            m216dporcen4 = new FieldDef("m216dporcen4",FieldDef.FLOAT,6,0);
            m216dingcta4 = new FieldDef("m216dingcta4",FieldDef.FLOAT,6,0);
            m216noretimp4 = new FieldDef("m216noretimp4",FieldDef.FLOAT,6,0);
            m216dbase5 = new FieldDef("m216dbase5",FieldDef.FLOAT,6,0);
            m216dporcen5 = new FieldDef("m216dporcen5",FieldDef.FLOAT,6,0);
            m216dingcta5 = new FieldDef("m216dingcta5",FieldDef.FLOAT,6,0);
            m216noretimp5 = new FieldDef("m216noretimp5",FieldDef.FLOAT,6,0);
            m216dbase6 = new FieldDef("m216dbase6",FieldDef.FLOAT,6,0);
            m216dporcen6 = new FieldDef("m216dporcen6",FieldDef.FLOAT,6,0);
            m216dingcta6 = new FieldDef("m216dingcta6",FieldDef.FLOAT,6,0);
            m216noretimp6 = new FieldDef("m216noretimp6",FieldDef.FLOAT,6,0);
            m216dbase7 = new FieldDef("m216dbase7",FieldDef.FLOAT,6,0);
            m216dporcen7 = new FieldDef("m216dporcen7",FieldDef.FLOAT,6,0);
            m216dingcta7 = new FieldDef("m216dingcta7",FieldDef.FLOAT,6,0);
            m216noretimp7 = new FieldDef("m216noretimp7",FieldDef.FLOAT,6,0);
            m216dbase8 = new FieldDef("m216dbase8",FieldDef.FLOAT,6,0);
            m216dporcen8 = new FieldDef("m216dporcen8",FieldDef.FLOAT,6,0);
            m216dingcta8 = new FieldDef("m216dingcta8",FieldDef.FLOAT,6,0);
            m216noretimp8 = new FieldDef("m216noretimp8",FieldDef.FLOAT,6,0);
            m216dbase9 = new FieldDef("m216dbase9",FieldDef.FLOAT,6,0);
            m216dporcen9 = new FieldDef("m216dporcen9",FieldDef.FLOAT,6,0);
            m216dingcta9 = new FieldDef("m216dingcta9",FieldDef.FLOAT,6,0);
            m216noretimp9 = new FieldDef("m216noretimp9",FieldDef.FLOAT,6,0);
            m216dbase10 = new FieldDef("m216dbase10",FieldDef.FLOAT,6,0);
            m216dporcen10 = new FieldDef("m216dporcen10",FieldDef.FLOAT,6,0);
            m216dingcta10 = new FieldDef("m216dingcta10",FieldDef.FLOAT,6,0);
            m216noretimp10 = new FieldDef("m216noretimp10",FieldDef.FLOAT,6,0);
            m216dbase11 = new FieldDef("m216dbase11",FieldDef.FLOAT,6,0);
            m216dporcen11 = new FieldDef("m216dporcen11",FieldDef.FLOAT,6,0);
            m216dingcta11 = new FieldDef("m216dingcta11",FieldDef.FLOAT,6,0);
            m216noretimp11 = new FieldDef("m216noretimp11",FieldDef.FLOAT,6,0);
            m216dbase12 = new FieldDef("m216dbase12",FieldDef.FLOAT,6,0);
            m216dporcen12 = new FieldDef("m216dporcen12",FieldDef.FLOAT,6,0);
            m216dingcta12 = new FieldDef("m216dingcta12",FieldDef.FLOAT,6,0);
            m216noretimp12 = new FieldDef("m216noretimp12",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m216dident,
                m216ddominio,
                m216dnif,
                m216dejercicio,
                m216dnifpercep,
                m216dnifrepres,
                m216dfj,
                m216dapellidos,
                m216dfechadeve,
                m216dnaturalez,
                m216dclave,
                m216dsubclave,
                m216dsigno,
                m216dmediador,
                m216dcodigo,
                m216dcodemisor,
                m216dpago,
                m216dtipocodig,
                m216entingreso,
                m216ofiingreso,
                m216digiingreso,
                m216ctaingreso,
                m216dpendiente,
                m216dejerdeven,
                m216dfechainip,
                m216dfechafinp,
                m216dremuprest,
                m216dcompensac,
                m216dgarantias,
                m216ddomicilio,
                m216dcdomicili,
                m216dpoblacion,
                m216dprovincia,
                m216dcodpostal,
                m216dcodpais,
                m216dnifpais,
                m216dfechanaci,
                m216dlugarnaci,
                m216dcpaisnaci,
                m216dpaisfiscal,
                m216dbase1,
                m216dporcen1,
                m216dingcta1,
                m216noretimp1,
                m216dbase2,
                m216dporcen2,
                m216dingcta2,
                m216noretimp2,
                m216dbase3,
                m216dporcen3,
                m216dingcta3,
                m216noretimp3,
                m216dbase4,
                m216dporcen4,
                m216dingcta4,
                m216noretimp4,
                m216dbase5,
                m216dporcen5,
                m216dingcta5,
                m216noretimp5,
                m216dbase6,
                m216dporcen6,
                m216dingcta6,
                m216noretimp6,
                m216dbase7,
                m216dporcen7,
                m216dingcta7,
                m216noretimp7,
                m216dbase8,
                m216dporcen8,
                m216dingcta8,
                m216noretimp8,
                m216dbase9,
                m216dporcen9,
                m216dingcta9,
                m216noretimp9,
                m216dbase10,
                m216dporcen10,
                m216dingcta10,
                m216noretimp10,
                m216dbase11,
                m216dporcen11,
                m216dingcta11,
                m216noretimp11,
                m216dbase12,
                m216dporcen12,
                m216dingcta12,
                m216noretimp12                
                };
            setColumns(array);
            FieldDef arrayf[] = {m216dident };
            setPrimaryKeys(arrayf);
            m216dident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod296r extends TableDef
        {
        // campos
        public FieldDef m296rdominio;
        public FieldDef m296rnif;
        public FieldDef m296rejercicio;
        public FieldDef m296rperiodo;
        public FieldDef m296rapellidos;
        public FieldDef m296rtelrelac;
        public FieldDef m296raperelac;
        public FieldDef m296riddecla;
        public FieldDef m296rdecomplem;
        public FieldDef m296rdecsustit;
        public FieldDef m296rnumdecant;
        public FieldDef m296rnumtotper;
        public FieldDef m296rsigno;
        public FieldDef m296rbaseret;
        public FieldDef m296ringracuen;
        public FieldDef m296ringresado;
        public FieldDef m296rnifrepre;
        public FieldDef m296rfecha;
        public FieldDef m296rnomfirman;
        public FieldDef m296rcargo;
        public TabMod296r(String name)
            {
            super(name);
            m296rdominio = new FieldDef("m296rdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m296rnif = new FieldDef("m296rnif",FieldDef.CHAR,9,FieldDef.NOTNULL);
            m296rejercicio = new FieldDef("m296rejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m296rperiodo = new FieldDef("m296rperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m296rapellidos = new FieldDef("m296rapellidos",FieldDef.CHAR,40);
            m296rtelrelac = new FieldDef("m296rtelrelac",FieldDef.INTEGER,0);
            m296raperelac = new FieldDef("m296raperelac",FieldDef.CHAR,40);
            m296riddecla = new FieldDef("m296riddecla",FieldDef.INTEGER,0);
            m296rdecomplem = new FieldDef("m296rdecomplem",FieldDef.CHAR,1);
            m296rdecsustit = new FieldDef("m296rdecsustit",FieldDef.CHAR,1);
            m296rnumdecant = new FieldDef("m296rnumdecant",FieldDef.CHAR,13);
            m296rnumtotper = new FieldDef("m296rnumtotper",FieldDef.INTEGER,0);
            m296rsigno = new FieldDef("m296rsigno",FieldDef.CHAR,1);
            m296rbaseret = new FieldDef("m296rbaseret",FieldDef.FLOAT,6,0);
            m296ringracuen = new FieldDef("m296ringracuen",FieldDef.FLOAT,6,0);
            m296ringresado = new FieldDef("m296ringresado",FieldDef.FLOAT,6,0);
            m296rnifrepre = new FieldDef("m296rnifrepre",FieldDef.CHAR,9);
            m296rfecha = new FieldDef("m296rfecha",FieldDef.DATE);
            m296rnomfirman = new FieldDef("m296rnomfirman",FieldDef.CHAR,40);
            m296rcargo = new FieldDef("m296rcargo",FieldDef.CHAR,40);
            FieldDef array[] = {
                m296rdominio,
                m296rnif,
                m296rejercicio,
                m296rperiodo,
                m296rapellidos,
                m296rtelrelac,
                m296raperelac,
                m296riddecla,
                m296rdecomplem,
                m296rdecsustit,
                m296rnumdecant,
                m296rnumtotper,
                m296rsigno,
                m296rbaseret,
                m296ringracuen,
                m296ringresado,
                m296rnifrepre,
                m296rfecha,
                m296rnomfirman,
                m296rcargo                
                };
            setColumns(array);
            FieldDef arrayf[] = {m296rdominio,m296rnif,m296rejercicio,m296rperiodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod296d extends TableDef
        {
        // campos
        public FieldDef m296dident;
        public FieldDef m296ddominio;
        public FieldDef m296dnif;
        public FieldDef m296dejercicio;
        public FieldDef m296dperiodo;
        public FieldDef m296dnifpercep;
        public FieldDef m296dnifrepres;
        public FieldDef m296dfj;
        public FieldDef m296dapellidos;
        public FieldDef m296dfechadeve;
        public FieldDef m296dnaturalez;
        public FieldDef m296dclave;
        public FieldDef m296dsubclave;
        public FieldDef m296dsigno;
        public FieldDef m296dbaseret;
        public FieldDef m296dporretenc;
        public FieldDef m296dingracuen;
        public FieldDef m296dmediador;
        public FieldDef m296dcodigo;
        public FieldDef m296dcodemisor;
        public FieldDef m296dpago;
        public FieldDef m296dtipocodig;
        public FieldDef m296entingreso;
        public FieldDef m296ofiingreso;
        public FieldDef m296digiingreso;
        public FieldDef m296ctaingreso;
        public FieldDef m296dpendiente;
        public FieldDef m296dejerdeven;
        public FieldDef m296dfechainip;
        public FieldDef m296dfechafinp;
        public FieldDef m296dremuprest;
        public FieldDef m296dcompensac;
        public FieldDef m296dgarantias;
        public FieldDef m296ddomicilio;
        public FieldDef m296dcdomicili;
        public FieldDef m296dpoblacion;
        public FieldDef m296dprovincia;
        public FieldDef m296dcodpostal;
        public FieldDef m296dcodpais;
        public FieldDef m296dnifpais;
        public FieldDef m296dfechanaci;
        public FieldDef m296dlugarnaci;
        public FieldDef m296dcpaisnaci;
        public FieldDef m296dpaisfiscal;
        public FieldDef m296dliscertif;
        public TabMod296d(String name)
            {
            super(name);
            m296dident = new FieldDef("m296dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m296ddominio = new FieldDef("m296ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m296dnif = new FieldDef("m296dnif",FieldDef.CHAR,9,FieldDef.NOTNULL);
            m296dejercicio = new FieldDef("m296dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m296dperiodo = new FieldDef("m296dperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m296dnifpercep = new FieldDef("m296dnifpercep",FieldDef.CHAR,9);
            m296dnifrepres = new FieldDef("m296dnifrepres",FieldDef.CHAR,9);
            m296dfj = new FieldDef("m296dfj",FieldDef.CHAR,1);
            m296dapellidos = new FieldDef("m296dapellidos",FieldDef.CHAR,40);
            m296dfechadeve = new FieldDef("m296dfechadeve",FieldDef.DATE);
            m296dnaturalez = new FieldDef("m296dnaturalez",FieldDef.CHAR,1);
            m296dclave = new FieldDef("m296dclave",FieldDef.INTEGER,0);
            m296dsubclave = new FieldDef("m296dsubclave",FieldDef.INTEGER,0);
            m296dsigno = new FieldDef("m296dsigno",FieldDef.CHAR,1);
            m296dbaseret = new FieldDef("m296dbaseret",FieldDef.FLOAT,6,0);
            m296dporretenc = new FieldDef("m296dporretenc",FieldDef.FLOAT,6,0);
            m296dingracuen = new FieldDef("m296dingracuen",FieldDef.FLOAT,6,0);
            m296dmediador = new FieldDef("m296dmediador",FieldDef.CHAR,1);
            m296dcodigo = new FieldDef("m296dcodigo",FieldDef.INTEGER,0);
            m296dcodemisor = new FieldDef("m296dcodemisor",FieldDef.CHAR,12);
            m296dpago = new FieldDef("m296dpago",FieldDef.INTEGER,0);
            m296dtipocodig = new FieldDef("m296dtipocodig",FieldDef.CHAR,1);
            m296entingreso = new FieldDef("m296entingreso",FieldDef.CHAR,4);
            m296ofiingreso = new FieldDef("m296ofiingreso",FieldDef.CHAR,4);
            m296digiingreso = new FieldDef("m296digiingreso",FieldDef.CHAR,2);
            m296ctaingreso = new FieldDef("m296ctaingreso",FieldDef.CHAR,10);
            m296dpendiente = new FieldDef("m296dpendiente",FieldDef.CHAR,1);
            m296dejerdeven = new FieldDef("m296dejerdeven",FieldDef.INTEGER,0);
            m296dfechainip = new FieldDef("m296dfechainip",FieldDef.DATE);
            m296dfechafinp = new FieldDef("m296dfechafinp",FieldDef.DATE);
            m296dremuprest = new FieldDef("m296dremuprest",FieldDef.FLOAT,6,0);
            m296dcompensac = new FieldDef("m296dcompensac",FieldDef.FLOAT,6,0);
            m296dgarantias = new FieldDef("m296dgarantias",FieldDef.FLOAT,6,0);
            m296ddomicilio = new FieldDef("m296ddomicilio",FieldDef.CHAR,50);
            m296dcdomicili = new FieldDef("m296dcdomicili",FieldDef.CHAR,40);
            m296dpoblacion = new FieldDef("m296dpoblacion",FieldDef.CHAR,30);
            m296dprovincia = new FieldDef("m296dprovincia",FieldDef.CHAR,30);
            m296dcodpostal = new FieldDef("m296dcodpostal",FieldDef.CHAR,10);
            m296dcodpais = new FieldDef("m296dcodpais",FieldDef.CHAR,2);
            m296dnifpais = new FieldDef("m296dnifpais",FieldDef.CHAR,20);
            m296dfechanaci = new FieldDef("m296dfechanaci",FieldDef.DATE);
            m296dlugarnaci = new FieldDef("m296dlugarnaci",FieldDef.CHAR,35);
            m296dcpaisnaci = new FieldDef("m296dcpaisnaci",FieldDef.CHAR,2);
            m296dpaisfiscal = new FieldDef("m296dpaisfiscal",FieldDef.CHAR,2);
            m296dliscertif = new FieldDef("m296dliscertif",FieldDef.CHAR,1);
            FieldDef array[] = {
                m296dident,
                m296ddominio,
                m296dnif,
                m296dejercicio,
                m296dperiodo,
                m296dnifpercep,
                m296dnifrepres,
                m296dfj,
                m296dapellidos,
                m296dfechadeve,
                m296dnaturalez,
                m296dclave,
                m296dsubclave,
                m296dsigno,
                m296dbaseret,
                m296dporretenc,
                m296dingracuen,
                m296dmediador,
                m296dcodigo,
                m296dcodemisor,
                m296dpago,
                m296dtipocodig,
                m296entingreso,
                m296ofiingreso,
                m296digiingreso,
                m296ctaingreso,
                m296dpendiente,
                m296dejerdeven,
                m296dfechainip,
                m296dfechafinp,
                m296dremuprest,
                m296dcompensac,
                m296dgarantias,
                m296ddomicilio,
                m296dcdomicili,
                m296dpoblacion,
                m296dprovincia,
                m296dcodpostal,
                m296dcodpais,
                m296dnifpais,
                m296dfechanaci,
                m296dlugarnaci,
                m296dcpaisnaci,
                m296dpaisfiscal,
                m296dliscertif                
                };
            setColumns(array);
            FieldDef arrayf[] = {m296dident };
            setPrimaryKeys(arrayf);
            m296dident.setAutoIncrementable(true);
            }
        }
        
    public class TabMod322 extends TableDef
        {
        // campos
        public FieldDef m322dominio;
        public FieldDef m322nif;
        public FieldDef m322ejercicio;
        public FieldDef m322periodo;
        public FieldDef m322denominac;
        public FieldDef m322numgrupo;
        public FieldDef m322dominante;
        public FieldDef m322nifentdomi;
        public FieldDef m322regespecial;
        public FieldDef m322devlmensual;
        public FieldDef m322opsintrab1;
        public FieldDef m322opsintrat1;
        public FieldDef m322opsintrac1;
        public FieldDef m322opsintrab2;
        public FieldDef m322opsintrat2;
        public FieldDef m322opsintrac2;
        public FieldDef m322opsintrab3;
        public FieldDef m322opsintrat3;
        public FieldDef m322opsintrac3;
        public FieldDef m322restoopsb1;
        public FieldDef m322restoopst1;
        public FieldDef m322restoopsc1;
        public FieldDef m322restoopsb2;
        public FieldDef m322restoopst2;
        public FieldDef m322restoopsc2;
        public FieldDef m322restoopsb3;
        public FieldDef m322restoopst3;
        public FieldDef m322restoopsc3;
        public FieldDef m322opsrecarb1;
        public FieldDef m322opsrecart1;
        public FieldDef m322opsrecarc1;
        public FieldDef m322opsrecarb2;
        public FieldDef m322opsrecart2;
        public FieldDef m322opsrecarc2;
        public FieldDef m322opsrecarb3;
        public FieldDef m322opsrecart3;
        public FieldDef m322opsrecarc3;
        public FieldDef m322adqintrab;
        public FieldDef m322adqintrac;
        public FieldDef m322totalcuota;
        public FieldDef m322intragrupb;
        public FieldDef m322intragrupc;
        public FieldDef m322interioreb;
        public FieldDef m322interiorec;
        public FieldDef m322importacib;
        public FieldDef m322importacic;
        public FieldDef m322intracomub;
        public FieldDef m322intracomuc;
        public FieldDef m322compensac;
        public FieldDef m322regulinver;
        public FieldDef m322regprorrat;
        public FieldDef m322totaldeduc;
        public FieldDef m322diferencia;
        public FieldDef m322atribadmonb;
        public FieldDef m322atribadmonc;
        public FieldDef m322cuotacompen;
        public FieldDef m322entintracom;
        public FieldDef m322exportacion;
        public FieldDef m322otrasopsex;
        public FieldDef m322resulregula;
        public FieldDef m322resultado;
        public FieldDef m322resuliqant;
        public FieldDef m322resulautoli;
        public FieldDef m322autoliqcomp;
        public FieldDef m322codigoanter;
        public FieldDef m322sinactivida;
        public FieldDef m322recc;
        public FieldDef m322proesp;
        public FieldDef m322opsintrabm;
        public FieldDef m322opsintracm;
        public FieldDef m322ispb;
        public FieldDef m322ispc;
        public FieldDef m322restoopsb;
        public FieldDef m322restoopsc;
        public FieldDef m322opsrecarbm;
        public FieldDef m322opsrecarcm;
        public FieldDef m322intragrupbi;
        public FieldDef m322intragrupci;
        public FieldDef m322intragrupbr;
        public FieldDef m322intragrupcr;
        public FieldDef m322interbi;
        public FieldDef m322interci;
        public FieldDef m322interbr;
        public FieldDef m322intercr;
        public FieldDef m322adqintbi;
        public FieldDef m322adqintci;
        public FieldDef m322adqintbr;
        public FieldDef m322adqintcr;
        public FieldDef m322restoreb;
        public FieldDef m322restorec;
        public FieldDef m322regcuo80;
        public FieldDef m322impaduana;
        public FieldDef m322reccdesb;
        public FieldDef m322reccdesc;
        public FieldDef m322exoactpral;
        public FieldDef m322exoclapral;
        public FieldDef m322exoepipral;
        public FieldDef m322exoact1;
        public FieldDef m322exocla1;
        public FieldDef m322exoepi1;
        public FieldDef m322exoact2;
        public FieldDef m322exocla2;
        public FieldDef m322exoepi2;
        public FieldDef m322exoact3;
        public FieldDef m322exocla3;
        public FieldDef m322exoepi3;
        public FieldDef m322exoact4;
        public FieldDef m322exocla4;
        public FieldDef m322exoepi4;
        public FieldDef m322exoact5;
        public FieldDef m322exocla5;
        public FieldDef m322exoepi5;
        public FieldDef m322exon390;
        public FieldDef m322alava;
        public FieldDef m322guipuzcoa;
        public FieldDef m322vizcaya;
        public FieldDef m322navarra;
        public FieldDef m322exoreggral;
        public FieldDef m322exoregrecc;
        public FieldDef m322exoentrega;
        public FieldDef m322exoexporta;
        public FieldDef m322exoexensin;
        public FieldDef m322exoinvsuje;
        public FieldDef m322exoinstala;
        public FieldDef m322exoregsimp;
        public FieldDef m322exoragp;
        public FieldDef m322exoreceq;
        public FieldDef m322exobus;
        public FieldDef m322exoagviajes;
        public FieldDef m322exoinmob;
        public FieldDef m322exobinv;
        public FieldDef m322exototal;
        public FieldDef m322foralpdte;
        public FieldDef m322exonvo;
        public FieldDef m322tercomu;
        public TabMod322(String name)
            {
            super(name);
            m322dominio = new FieldDef("m322dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m322nif = new FieldDef("m322nif",FieldDef.CHAR,9,FieldDef.NOTNULL);
            m322ejercicio = new FieldDef("m322ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m322periodo = new FieldDef("m322periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m322denominac = new FieldDef("m322denominac",FieldDef.CHAR,125);
            m322numgrupo = new FieldDef("m322numgrupo",FieldDef.CHAR,10);
            m322dominante = new FieldDef("m322dominante",FieldDef.CHAR,1);
            m322nifentdomi = new FieldDef("m322nifentdomi",FieldDef.CHAR,9);
            m322regespecial = new FieldDef("m322regespecial",FieldDef.CHAR,1);
            m322devlmensual = new FieldDef("m322devlmensual",FieldDef.CHAR,1);
            m322opsintrab1 = new FieldDef("m322opsintrab1",FieldDef.FLOAT,6,0);
            m322opsintrat1 = new FieldDef("m322opsintrat1",FieldDef.FLOAT,6,0);
            m322opsintrac1 = new FieldDef("m322opsintrac1",FieldDef.FLOAT,6,0);
            m322opsintrab2 = new FieldDef("m322opsintrab2",FieldDef.FLOAT,6,0);
            m322opsintrat2 = new FieldDef("m322opsintrat2",FieldDef.FLOAT,6,0);
            m322opsintrac2 = new FieldDef("m322opsintrac2",FieldDef.FLOAT,6,0);
            m322opsintrab3 = new FieldDef("m322opsintrab3",FieldDef.FLOAT,6,0);
            m322opsintrat3 = new FieldDef("m322opsintrat3",FieldDef.FLOAT,6,0);
            m322opsintrac3 = new FieldDef("m322opsintrac3",FieldDef.FLOAT,6,0);
            m322restoopsb1 = new FieldDef("m322restoopsb1",FieldDef.FLOAT,6,0);
            m322restoopst1 = new FieldDef("m322restoopst1",FieldDef.FLOAT,6,0);
            m322restoopsc1 = new FieldDef("m322restoopsc1",FieldDef.FLOAT,6,0);
            m322restoopsb2 = new FieldDef("m322restoopsb2",FieldDef.FLOAT,6,0);
            m322restoopst2 = new FieldDef("m322restoopst2",FieldDef.FLOAT,6,0);
            m322restoopsc2 = new FieldDef("m322restoopsc2",FieldDef.FLOAT,6,0);
            m322restoopsb3 = new FieldDef("m322restoopsb3",FieldDef.FLOAT,6,0);
            m322restoopst3 = new FieldDef("m322restoopst3",FieldDef.FLOAT,6,0);
            m322restoopsc3 = new FieldDef("m322restoopsc3",FieldDef.FLOAT,6,0);
            m322opsrecarb1 = new FieldDef("m322opsrecarb1",FieldDef.FLOAT,6,0);
            m322opsrecart1 = new FieldDef("m322opsrecart1",FieldDef.FLOAT,6,0);
            m322opsrecarc1 = new FieldDef("m322opsrecarc1",FieldDef.FLOAT,6,0);
            m322opsrecarb2 = new FieldDef("m322opsrecarb2",FieldDef.FLOAT,6,0);
            m322opsrecart2 = new FieldDef("m322opsrecart2",FieldDef.FLOAT,6,0);
            m322opsrecarc2 = new FieldDef("m322opsrecarc2",FieldDef.FLOAT,6,0);
            m322opsrecarb3 = new FieldDef("m322opsrecarb3",FieldDef.FLOAT,6,0);
            m322opsrecart3 = new FieldDef("m322opsrecart3",FieldDef.FLOAT,6,0);
            m322opsrecarc3 = new FieldDef("m322opsrecarc3",FieldDef.FLOAT,6,0);
            m322adqintrab = new FieldDef("m322adqintrab",FieldDef.FLOAT,6,0);
            m322adqintrac = new FieldDef("m322adqintrac",FieldDef.FLOAT,6,0);
            m322totalcuota = new FieldDef("m322totalcuota",FieldDef.FLOAT,6,0);
            m322intragrupb = new FieldDef("m322intragrupb",FieldDef.FLOAT,6,0);
            m322intragrupc = new FieldDef("m322intragrupc",FieldDef.FLOAT,6,0);
            m322interioreb = new FieldDef("m322interioreb",FieldDef.FLOAT,6,0);
            m322interiorec = new FieldDef("m322interiorec",FieldDef.FLOAT,6,0);
            m322importacib = new FieldDef("m322importacib",FieldDef.FLOAT,6,0);
            m322importacic = new FieldDef("m322importacic",FieldDef.FLOAT,6,0);
            m322intracomub = new FieldDef("m322intracomub",FieldDef.FLOAT,6,0);
            m322intracomuc = new FieldDef("m322intracomuc",FieldDef.FLOAT,6,0);
            m322compensac = new FieldDef("m322compensac",FieldDef.FLOAT,6,0);
            m322regulinver = new FieldDef("m322regulinver",FieldDef.FLOAT,6,0);
            m322regprorrat = new FieldDef("m322regprorrat",FieldDef.FLOAT,6,0);
            m322totaldeduc = new FieldDef("m322totaldeduc",FieldDef.FLOAT,6,0);
            m322diferencia = new FieldDef("m322diferencia",FieldDef.FLOAT,6,0);
            m322atribadmonb = new FieldDef("m322atribadmonb",FieldDef.FLOAT,6,0);
            m322atribadmonc = new FieldDef("m322atribadmonc",FieldDef.FLOAT,6,0);
            m322cuotacompen = new FieldDef("m322cuotacompen",FieldDef.FLOAT,6,0);
            m322entintracom = new FieldDef("m322entintracom",FieldDef.FLOAT,6,0);
            m322exportacion = new FieldDef("m322exportacion",FieldDef.FLOAT,6,0);
            m322otrasopsex = new FieldDef("m322otrasopsex",FieldDef.FLOAT,6,0);
            m322resulregula = new FieldDef("m322resulregula",FieldDef.FLOAT,6,0);
            m322resultado = new FieldDef("m322resultado",FieldDef.FLOAT,6,0);
            m322resuliqant = new FieldDef("m322resuliqant",FieldDef.FLOAT,6,0);
            m322resulautoli = new FieldDef("m322resulautoli",FieldDef.FLOAT,6,0);
            m322autoliqcomp = new FieldDef("m322autoliqcomp",FieldDef.CHAR,1);
            m322codigoanter = new FieldDef("m322codigoanter",FieldDef.CHAR,16);
            m322sinactivida = new FieldDef("m322sinactivida",FieldDef.CHAR,1);
            m322recc = new FieldDef("m322recc",FieldDef.INTEGER,0);
            m322proesp = new FieldDef("m322proesp",FieldDef.INTEGER,0);
            m322opsintrabm = new FieldDef("m322opsintrabm",FieldDef.FLOAT,6,0);
            m322opsintracm = new FieldDef("m322opsintracm",FieldDef.FLOAT,6,0);
            m322ispb = new FieldDef("m322ispb",FieldDef.FLOAT,6,0);
            m322ispc = new FieldDef("m322ispc",FieldDef.FLOAT,6,0);
            m322restoopsb = new FieldDef("m322restoopsb",FieldDef.FLOAT,6,0);
            m322restoopsc = new FieldDef("m322restoopsc",FieldDef.FLOAT,6,0);
            m322opsrecarbm = new FieldDef("m322opsrecarbm",FieldDef.FLOAT,6,0);
            m322opsrecarcm = new FieldDef("m322opsrecarcm",FieldDef.FLOAT,6,0);
            m322intragrupbi = new FieldDef("m322intragrupbi",FieldDef.FLOAT,6,0);
            m322intragrupci = new FieldDef("m322intragrupci",FieldDef.FLOAT,6,0);
            m322intragrupbr = new FieldDef("m322intragrupbr",FieldDef.FLOAT,6,0);
            m322intragrupcr = new FieldDef("m322intragrupcr",FieldDef.FLOAT,6,0);
            m322interbi = new FieldDef("m322interbi",FieldDef.FLOAT,6,0);
            m322interci = new FieldDef("m322interci",FieldDef.FLOAT,6,0);
            m322interbr = new FieldDef("m322interbr",FieldDef.FLOAT,6,0);
            m322intercr = new FieldDef("m322intercr",FieldDef.FLOAT,6,0);
            m322adqintbi = new FieldDef("m322adqintbi",FieldDef.FLOAT,6,0);
            m322adqintci = new FieldDef("m322adqintci",FieldDef.FLOAT,6,0);
            m322adqintbr = new FieldDef("m322adqintbr",FieldDef.FLOAT,6,0);
            m322adqintcr = new FieldDef("m322adqintcr",FieldDef.FLOAT,6,0);
            m322restoreb = new FieldDef("m322restoreb",FieldDef.FLOAT,6,0);
            m322restorec = new FieldDef("m322restorec",FieldDef.FLOAT,6,0);
            m322regcuo80 = new FieldDef("m322regcuo80",FieldDef.FLOAT,6,0);
            m322impaduana = new FieldDef("m322impaduana",FieldDef.FLOAT,6,0);
            m322reccdesb = new FieldDef("m322reccdesb",FieldDef.FLOAT,6,0);
            m322reccdesc = new FieldDef("m322reccdesc",FieldDef.FLOAT,6,0);
            m322exoactpral = new FieldDef("m322exoactpral",FieldDef.CHAR,40);
            m322exoclapral = new FieldDef("m322exoclapral",FieldDef.INTEGER,0);
            m322exoepipral = new FieldDef("m322exoepipral",FieldDef.CHAR,7);
            m322exoact1 = new FieldDef("m322exoact1",FieldDef.CHAR,40);
            m322exocla1 = new FieldDef("m322exocla1",FieldDef.INTEGER,0);
            m322exoepi1 = new FieldDef("m322exoepi1",FieldDef.CHAR,7);
            m322exoact2 = new FieldDef("m322exoact2",FieldDef.CHAR,40);
            m322exocla2 = new FieldDef("m322exocla2",FieldDef.INTEGER,0);
            m322exoepi2 = new FieldDef("m322exoepi2",FieldDef.CHAR,7);
            m322exoact3 = new FieldDef("m322exoact3",FieldDef.CHAR,40);
            m322exocla3 = new FieldDef("m322exocla3",FieldDef.INTEGER,0);
            m322exoepi3 = new FieldDef("m322exoepi3",FieldDef.CHAR,7);
            m322exoact4 = new FieldDef("m322exoact4",FieldDef.CHAR,40);
            m322exocla4 = new FieldDef("m322exocla4",FieldDef.INTEGER,0);
            m322exoepi4 = new FieldDef("m322exoepi4",FieldDef.CHAR,7);
            m322exoact5 = new FieldDef("m322exoact5",FieldDef.CHAR,40);
            m322exocla5 = new FieldDef("m322exocla5",FieldDef.INTEGER,0);
            m322exoepi5 = new FieldDef("m322exoepi5",FieldDef.CHAR,7);
            m322exon390 = new FieldDef("m322exon390",FieldDef.INTEGER,0);
            m322alava = new FieldDef("m322alava",FieldDef.FLOAT,6,0);
            m322guipuzcoa = new FieldDef("m322guipuzcoa",FieldDef.FLOAT,6,0);
            m322vizcaya = new FieldDef("m322vizcaya",FieldDef.FLOAT,6,0);
            m322navarra = new FieldDef("m322navarra",FieldDef.FLOAT,6,0);
            m322exoreggral = new FieldDef("m322exoreggral",FieldDef.FLOAT,6,0);
            m322exoregrecc = new FieldDef("m322exoregrecc",FieldDef.FLOAT,6,0);
            m322exoentrega = new FieldDef("m322exoentrega",FieldDef.FLOAT,6,0);
            m322exoexporta = new FieldDef("m322exoexporta",FieldDef.FLOAT,6,0);
            m322exoexensin = new FieldDef("m322exoexensin",FieldDef.FLOAT,6,0);
            m322exoinvsuje = new FieldDef("m322exoinvsuje",FieldDef.FLOAT,6,0);
            m322exoinstala = new FieldDef("m322exoinstala",FieldDef.FLOAT,6,0);
            m322exoregsimp = new FieldDef("m322exoregsimp",FieldDef.FLOAT,6,0);
            m322exoragp = new FieldDef("m322exoragp",FieldDef.FLOAT,6,0);
            m322exoreceq = new FieldDef("m322exoreceq",FieldDef.FLOAT,6,0);
            m322exobus = new FieldDef("m322exobus",FieldDef.FLOAT,6,0);
            m322exoagviajes = new FieldDef("m322exoagviajes",FieldDef.FLOAT,6,0);
            m322exoinmob = new FieldDef("m322exoinmob",FieldDef.FLOAT,6,0);
            m322exobinv = new FieldDef("m322exobinv",FieldDef.FLOAT,6,0);
            m322exototal = new FieldDef("m322exototal",FieldDef.FLOAT,6,0);
            m322foralpdte = new FieldDef("m322foralpdte",FieldDef.CHAR,1);
            m322exonvo = new FieldDef("m322exonvo",FieldDef.INTEGER,0);
            m322tercomu = new FieldDef("m322tercomu",FieldDef.FLOAT,0,2);
            FieldDef array[] = {
                m322dominio,
                m322nif,
                m322ejercicio,
                m322periodo,
                m322denominac,
                m322numgrupo,
                m322dominante,
                m322nifentdomi,
                m322regespecial,
                m322devlmensual,
                m322opsintrab1,
                m322opsintrat1,
                m322opsintrac1,
                m322opsintrab2,
                m322opsintrat2,
                m322opsintrac2,
                m322opsintrab3,
                m322opsintrat3,
                m322opsintrac3,
                m322restoopsb1,
                m322restoopst1,
                m322restoopsc1,
                m322restoopsb2,
                m322restoopst2,
                m322restoopsc2,
                m322restoopsb3,
                m322restoopst3,
                m322restoopsc3,
                m322opsrecarb1,
                m322opsrecart1,
                m322opsrecarc1,
                m322opsrecarb2,
                m322opsrecart2,
                m322opsrecarc2,
                m322opsrecarb3,
                m322opsrecart3,
                m322opsrecarc3,
                m322adqintrab,
                m322adqintrac,
                m322totalcuota,
                m322intragrupb,
                m322intragrupc,
                m322interioreb,
                m322interiorec,
                m322importacib,
                m322importacic,
                m322intracomub,
                m322intracomuc,
                m322compensac,
                m322regulinver,
                m322regprorrat,
                m322totaldeduc,
                m322diferencia,
                m322atribadmonb,
                m322atribadmonc,
                m322cuotacompen,
                m322entintracom,
                m322exportacion,
                m322otrasopsex,
                m322resulregula,
                m322resultado,
                m322resuliqant,
                m322resulautoli,
                m322autoliqcomp,
                m322codigoanter,
                m322sinactivida,
                m322recc,
                m322proesp,
                m322opsintrabm,
                m322opsintracm,
                m322ispb,
                m322ispc,
                m322restoopsb,
                m322restoopsc,
                m322opsrecarbm,
                m322opsrecarcm,
                m322intragrupbi,
                m322intragrupci,
                m322intragrupbr,
                m322intragrupcr,
                m322interbi,
                m322interci,
                m322interbr,
                m322intercr,
                m322adqintbi,
                m322adqintci,
                m322adqintbr,
                m322adqintcr,
                m322restoreb,
                m322restorec,
                m322regcuo80,
                m322impaduana,
                m322reccdesb,
                m322reccdesc,
                m322exoactpral,
                m322exoclapral,
                m322exoepipral,
                m322exoact1,
                m322exocla1,
                m322exoepi1,
                m322exoact2,
                m322exocla2,
                m322exoepi2,
                m322exoact3,
                m322exocla3,
                m322exoepi3,
                m322exoact4,
                m322exocla4,
                m322exoepi4,
                m322exoact5,
                m322exocla5,
                m322exoepi5,
                m322exon390,
                m322alava,
                m322guipuzcoa,
                m322vizcaya,
                m322navarra,
                m322exoreggral,
                m322exoregrecc,
                m322exoentrega,
                m322exoexporta,
                m322exoexensin,
                m322exoinvsuje,
                m322exoinstala,
                m322exoregsimp,
                m322exoragp,
                m322exoreceq,
                m322exobus,
                m322exoagviajes,
                m322exoinmob,
                m322exobinv,
                m322exototal,
                m322foralpdte,
                m322exonvo,
                m322tercomu                
                };
            setColumns(array);
            FieldDef arrayf[] = {m322dominio,m322nif,m322ejercicio,m322periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod322pro extends TableDef
        {
        // campos
        public FieldDef m32pcodi;
        public FieldDef m32pdominio;
        public FieldDef m32pnif;
        public FieldDef m32pejercicio;
        public FieldDef m32pperiodo;
        public FieldDef m32pnumpag;
        public FieldDef m32pcomplemen;
        public FieldDef m32ppro1codcnae;
        public FieldDef m32ppro1impoper;
        public FieldDef m32ppro1impopde;
        public FieldDef m32ppro1tipo;
        public FieldDef m32ppro1pormeno;
        public FieldDef m32ppro2codcnae;
        public FieldDef m32ppro2impoper;
        public FieldDef m32ppro2impopde;
        public FieldDef m32ppro2tipo;
        public FieldDef m32ppro2pormeno;
        public FieldDef m32ppro3codcnae;
        public FieldDef m32ppro3impoper;
        public FieldDef m32ppro3impopde;
        public FieldDef m32ppro3tipo;
        public FieldDef m32ppro3pormeno;
        public FieldDef m32ppro4codcnae;
        public FieldDef m32ppro4impoper;
        public FieldDef m32ppro4impopde;
        public FieldDef m32ppro4tipo;
        public FieldDef m32ppro4pormeno;
        public FieldDef m32ppro5codcnae;
        public FieldDef m32ppro5impoper;
        public FieldDef m32ppro5impopde;
        public FieldDef m32ppro5tipo;
        public FieldDef m32ppro5pormeno;
        public FieldDef m32pdeddif1b1;
        public FieldDef m32pdeddif1c1;
        public FieldDef m32pdeddif1b2;
        public FieldDef m32pdeddif1c2;
        public FieldDef m32pdeddif1b3;
        public FieldDef m32pdeddif1c3;
        public FieldDef m32pdeddif1b4;
        public FieldDef m32pdeddif1c4;
        public FieldDef m32pdeddif1b5;
        public FieldDef m32pdeddif1c5;
        public FieldDef m32pdeddif1b6;
        public FieldDef m32pdeddif1c6;
        public FieldDef m32pdeddif1b7;
        public FieldDef m32pdeddif1c7;
        public FieldDef m32pdeddif1b8;
        public FieldDef m32pdeddif1c8;
        public FieldDef m32pdeddif1c9;
        public FieldDef m32pdeddif1to;
        public FieldDef m32pdeddif2b1;
        public FieldDef m32pdeddif2c1;
        public FieldDef m32pdeddif2b2;
        public FieldDef m32pdeddif2c2;
        public FieldDef m32pdeddif2b3;
        public FieldDef m32pdeddif2c3;
        public FieldDef m32pdeddif2b4;
        public FieldDef m32pdeddif2c4;
        public FieldDef m32pdeddif2b5;
        public FieldDef m32pdeddif2c5;
        public FieldDef m32pdeddif2b6;
        public FieldDef m32pdeddif2c6;
        public FieldDef m32pdeddif2b7;
        public FieldDef m32pdeddif2c7;
        public FieldDef m32pdeddif2b8;
        public FieldDef m32pdeddif2c8;
        public FieldDef m32pdeddif2c9;
        public FieldDef m32pdeddif2to;
        public TabMod322pro(String name)
            {
            super(name);
            m32pcodi = new FieldDef("m32pcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m32pdominio = new FieldDef("m32pdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m32pnif = new FieldDef("m32pnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m32pejercicio = new FieldDef("m32pejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m32pperiodo = new FieldDef("m32pperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m32pnumpag = new FieldDef("m32pnumpag",FieldDef.INTEGER,0);
            m32pcomplemen = new FieldDef("m32pcomplemen",FieldDef.CHAR,1);
            m32ppro1codcnae = new FieldDef("m32ppro1codcnae",FieldDef.CHAR,3);
            m32ppro1impoper = new FieldDef("m32ppro1impoper",FieldDef.FLOAT,6,0);
            m32ppro1impopde = new FieldDef("m32ppro1impopde",FieldDef.FLOAT,6,0);
            m32ppro1tipo = new FieldDef("m32ppro1tipo",FieldDef.CHAR,1);
            m32ppro1pormeno = new FieldDef("m32ppro1pormeno",FieldDef.FLOAT,6,0);
            m32ppro2codcnae = new FieldDef("m32ppro2codcnae",FieldDef.CHAR,3);
            m32ppro2impoper = new FieldDef("m32ppro2impoper",FieldDef.FLOAT,6,0);
            m32ppro2impopde = new FieldDef("m32ppro2impopde",FieldDef.FLOAT,6,0);
            m32ppro2tipo = new FieldDef("m32ppro2tipo",FieldDef.CHAR,1);
            m32ppro2pormeno = new FieldDef("m32ppro2pormeno",FieldDef.FLOAT,6,0);
            m32ppro3codcnae = new FieldDef("m32ppro3codcnae",FieldDef.CHAR,3);
            m32ppro3impoper = new FieldDef("m32ppro3impoper",FieldDef.FLOAT,6,0);
            m32ppro3impopde = new FieldDef("m32ppro3impopde",FieldDef.FLOAT,6,0);
            m32ppro3tipo = new FieldDef("m32ppro3tipo",FieldDef.CHAR,1);
            m32ppro3pormeno = new FieldDef("m32ppro3pormeno",FieldDef.FLOAT,6,0);
            m32ppro4codcnae = new FieldDef("m32ppro4codcnae",FieldDef.CHAR,3);
            m32ppro4impoper = new FieldDef("m32ppro4impoper",FieldDef.FLOAT,6,0);
            m32ppro4impopde = new FieldDef("m32ppro4impopde",FieldDef.FLOAT,6,0);
            m32ppro4tipo = new FieldDef("m32ppro4tipo",FieldDef.CHAR,1);
            m32ppro4pormeno = new FieldDef("m32ppro4pormeno",FieldDef.FLOAT,6,0);
            m32ppro5codcnae = new FieldDef("m32ppro5codcnae",FieldDef.CHAR,3);
            m32ppro5impoper = new FieldDef("m32ppro5impoper",FieldDef.FLOAT,6,0);
            m32ppro5impopde = new FieldDef("m32ppro5impopde",FieldDef.FLOAT,6,0);
            m32ppro5tipo = new FieldDef("m32ppro5tipo",FieldDef.CHAR,1);
            m32ppro5pormeno = new FieldDef("m32ppro5pormeno",FieldDef.FLOAT,6,0);
            m32pdeddif1b1 = new FieldDef("m32pdeddif1b1",FieldDef.FLOAT,6,0);
            m32pdeddif1c1 = new FieldDef("m32pdeddif1c1",FieldDef.FLOAT,6,0);
            m32pdeddif1b2 = new FieldDef("m32pdeddif1b2",FieldDef.FLOAT,6,0);
            m32pdeddif1c2 = new FieldDef("m32pdeddif1c2",FieldDef.FLOAT,6,0);
            m32pdeddif1b3 = new FieldDef("m32pdeddif1b3",FieldDef.FLOAT,6,0);
            m32pdeddif1c3 = new FieldDef("m32pdeddif1c3",FieldDef.FLOAT,6,0);
            m32pdeddif1b4 = new FieldDef("m32pdeddif1b4",FieldDef.FLOAT,6,0);
            m32pdeddif1c4 = new FieldDef("m32pdeddif1c4",FieldDef.FLOAT,6,0);
            m32pdeddif1b5 = new FieldDef("m32pdeddif1b5",FieldDef.FLOAT,6,0);
            m32pdeddif1c5 = new FieldDef("m32pdeddif1c5",FieldDef.FLOAT,6,0);
            m32pdeddif1b6 = new FieldDef("m32pdeddif1b6",FieldDef.FLOAT,6,0);
            m32pdeddif1c6 = new FieldDef("m32pdeddif1c6",FieldDef.FLOAT,6,0);
            m32pdeddif1b7 = new FieldDef("m32pdeddif1b7",FieldDef.FLOAT,6,0);
            m32pdeddif1c7 = new FieldDef("m32pdeddif1c7",FieldDef.FLOAT,6,0);
            m32pdeddif1b8 = new FieldDef("m32pdeddif1b8",FieldDef.FLOAT,6,0);
            m32pdeddif1c8 = new FieldDef("m32pdeddif1c8",FieldDef.FLOAT,6,0);
            m32pdeddif1c9 = new FieldDef("m32pdeddif1c9",FieldDef.FLOAT,6,0);
            m32pdeddif1to = new FieldDef("m32pdeddif1to",FieldDef.FLOAT,6,0);
            m32pdeddif2b1 = new FieldDef("m32pdeddif2b1",FieldDef.FLOAT,6,0);
            m32pdeddif2c1 = new FieldDef("m32pdeddif2c1",FieldDef.FLOAT,6,0);
            m32pdeddif2b2 = new FieldDef("m32pdeddif2b2",FieldDef.FLOAT,6,0);
            m32pdeddif2c2 = new FieldDef("m32pdeddif2c2",FieldDef.FLOAT,6,0);
            m32pdeddif2b3 = new FieldDef("m32pdeddif2b3",FieldDef.FLOAT,6,0);
            m32pdeddif2c3 = new FieldDef("m32pdeddif2c3",FieldDef.FLOAT,6,0);
            m32pdeddif2b4 = new FieldDef("m32pdeddif2b4",FieldDef.FLOAT,6,0);
            m32pdeddif2c4 = new FieldDef("m32pdeddif2c4",FieldDef.FLOAT,6,0);
            m32pdeddif2b5 = new FieldDef("m32pdeddif2b5",FieldDef.FLOAT,6,0);
            m32pdeddif2c5 = new FieldDef("m32pdeddif2c5",FieldDef.FLOAT,6,0);
            m32pdeddif2b6 = new FieldDef("m32pdeddif2b6",FieldDef.FLOAT,6,0);
            m32pdeddif2c6 = new FieldDef("m32pdeddif2c6",FieldDef.FLOAT,6,0);
            m32pdeddif2b7 = new FieldDef("m32pdeddif2b7",FieldDef.FLOAT,6,0);
            m32pdeddif2c7 = new FieldDef("m32pdeddif2c7",FieldDef.FLOAT,6,0);
            m32pdeddif2b8 = new FieldDef("m32pdeddif2b8",FieldDef.FLOAT,6,0);
            m32pdeddif2c8 = new FieldDef("m32pdeddif2c8",FieldDef.FLOAT,6,0);
            m32pdeddif2c9 = new FieldDef("m32pdeddif2c9",FieldDef.FLOAT,6,0);
            m32pdeddif2to = new FieldDef("m32pdeddif2to",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m32pcodi,
                m32pdominio,
                m32pnif,
                m32pejercicio,
                m32pperiodo,
                m32pnumpag,
                m32pcomplemen,
                m32ppro1codcnae,
                m32ppro1impoper,
                m32ppro1impopde,
                m32ppro1tipo,
                m32ppro1pormeno,
                m32ppro2codcnae,
                m32ppro2impoper,
                m32ppro2impopde,
                m32ppro2tipo,
                m32ppro2pormeno,
                m32ppro3codcnae,
                m32ppro3impoper,
                m32ppro3impopde,
                m32ppro3tipo,
                m32ppro3pormeno,
                m32ppro4codcnae,
                m32ppro4impoper,
                m32ppro4impopde,
                m32ppro4tipo,
                m32ppro4pormeno,
                m32ppro5codcnae,
                m32ppro5impoper,
                m32ppro5impopde,
                m32ppro5tipo,
                m32ppro5pormeno,
                m32pdeddif1b1,
                m32pdeddif1c1,
                m32pdeddif1b2,
                m32pdeddif1c2,
                m32pdeddif1b3,
                m32pdeddif1c3,
                m32pdeddif1b4,
                m32pdeddif1c4,
                m32pdeddif1b5,
                m32pdeddif1c5,
                m32pdeddif1b6,
                m32pdeddif1c6,
                m32pdeddif1b7,
                m32pdeddif1c7,
                m32pdeddif1b8,
                m32pdeddif1c8,
                m32pdeddif1c9,
                m32pdeddif1to,
                m32pdeddif2b1,
                m32pdeddif2c1,
                m32pdeddif2b2,
                m32pdeddif2c2,
                m32pdeddif2b3,
                m32pdeddif2c3,
                m32pdeddif2b4,
                m32pdeddif2c4,
                m32pdeddif2b5,
                m32pdeddif2c5,
                m32pdeddif2b6,
                m32pdeddif2c6,
                m32pdeddif2b7,
                m32pdeddif2c7,
                m32pdeddif2b8,
                m32pdeddif2c8,
                m32pdeddif2c9,
                m32pdeddif2to                
                };
            setColumns(array);
            FieldDef arrayf[] = {m32pcodi };
            setPrimaryKeys(arrayf);
            m32pcodi.setAutoIncrementable(true);
            }
        }
        
    public class TabMod202 extends TableDef
        {
        // campos
        public FieldDef m202dominio;
        public FieldDef m202nif;
        public FieldDef m202ejercicio;
        public FieldDef m202periodo;
        public FieldDef m202deleg;
        public FieldDef m202admon;
        public FieldDef m202tipdecl;
        public FieldDef m202codadmon;
        public FieldDef m202letetiq;
        public FieldDef m202apellidos;
        public FieldDef m202nombre;
        public FieldDef m202siglas;
        public FieldDef m202calle;
        public FieldDef m202numero;
        public FieldDef m202escalera;
        public FieldDef m202piso;
        public FieldDef m202puerta;
        public FieldDef m202cpostal;
        public FieldDef m202municipio;
        public FieldDef m202codmuni;
        public FieldDef m202codprov;
        public FieldDef m202provincia;
        public FieldDef m202telefono;
        public FieldDef m202basepagoa;
        public FieldDef m202ingra;
        public FieldDef m202basepagob1;
        public FieldDef m202porcenb1;
        public FieldDef m202rtdob1;
        public FieldDef m202basepagob2;
        public FieldDef m202hastab2;
        public FieldDef m202restob2;
        public FieldDef m202porcen21b2;
        public FieldDef m202porcen25b2;
        public FieldDef m202rtdob2;
        public FieldDef m202bonif;
        public FieldDef m202reten;
        public FieldDef m202pagoanter;
        public FieldDef m202ingrb1b2;
        public FieldDef m202fecha;
        public FieldDef m202dia;
        public FieldDef m202mes;
        public FieldDef m202anyo;
        public FieldDef m202cruzefec;
        public FieldDef m202cruzadeu;
        public FieldDef m202ingreso;
        public FieldDef m202entingreso;
        public FieldDef m202ofiingreso;
        public FieldDef m202digiingreso;
        public FieldDef m202ctaingreso;
        public FieldDef m202percont;
        public FieldDef m202telcont;
        public FieldDef m202observa;
        public FieldDef m202diasperiodo;
        public FieldDef m202modelo;
        public FieldDef m202rtdoanta;
        public FieldDef m202basepagogb3;
        public FieldDef m202pagogenb3;
        public FieldDef m202basepagoeb3;
        public FieldDef m202pagoespb3;
        public FieldDef m202rtdob3;
        public FieldDef m202rtdoantb;
        public FieldDef m202numjusti;
        public FieldDef m202fechainiper;
        public FieldDef m202diainiper;
        public FieldDef m202mesiniper;
        public FieldDef m202anyoiniper;
        public FieldDef m202rtdoconsol;
        public FieldDef m202sumbimpantc;
        public FieldDef m202corrdifeint;
        public FieldDef m202otrcorrec;
        public FieldDef m202compbasnegg;
        public FieldDef m202compbasnegi;
        public FieldDef m202infartdoord;
        public FieldDef m202infartdoext;
        public FieldDef m202rtdoantiss;
        public FieldDef m202correcrtdo;
        public FieldDef m202combiantneg;
        public FieldDef m202opecomunfor;
        public FieldDef m202numerogrupo;
        public FieldDef m202cruzccc;
        public FieldDef m202codelec;
        public FieldDef m202pymep1;
        public FieldDef m202pymep2;
        public FieldDef m202granemp;
        public FieldDef m202tipo1b2;
        public FieldDef m202tipo2b2;
        public FieldDef m202formapago;
        public FieldDef m202complemen;
        public FieldDef m202movcon;
        public FieldDef m202emailcon;
        public FieldDef m202espyme;
        public FieldDef m202escreaemp;
        public FieldDef m202tipo21b2;
        public FieldDef m202tipo25b2;
        public FieldDef m202chcom;
        public FieldDef m202nrs;
        public FieldDef m202cnae;
        public FieldDef m202tipoentidad;
        public FieldDef m202coopuotras;
        public FieldDef m202graviss;
        public FieldDef m202ent85;
        public FieldDef m202aumiss;
        public FieldDef m202dismiss;
        public FieldDef m202dismotras;
        public FieldDef m202impdividen;
        public FieldDef m202baseprevia;
        public FieldDef m202resultado;
        public FieldDef m202minimoing;
        public FieldDef m202sumbasind;
        public FieldDef m202discordif;
        public FieldDef m202datadicion;
        public FieldDef m202nrefiss;
        public FieldDef m202negativa;
        public FieldDef m202aplicnav;
        public FieldDef m202gasamoraum;
        public FieldDef m202gasamordis;
        public FieldDef m202totalaum;
        public FieldDef m202totaldis;
        public FieldDef m202copgencneg;
        public FieldDef m202copespcneg;
        public FieldDef m202cogecnein;
        public FieldDef m202coescnein;
        public FieldDef m202ibanpais;
        public FieldDef m202ibandc;
        public FieldDef m202fundacion;
        public FieldDef m202socimi;
        public FieldDef m202sup6millon;
        public FieldDef m202impdivi100;
        public FieldDef m202remrescapit;
        public FieldDef m202elimdot1112;
        public FieldDef m202dot1112;
        public FieldDef m202dotpr1112;
        public FieldDef m202b1resnivela;
        public FieldDef m202b1resniveld;
        public FieldDef m202b1dot1112;
        public FieldDef m202b1dotpr1112;
        public FieldDef m202resnivcuaum;
        public FieldDef m202resnivcudis;
        public FieldDef m202b2dot1112;
        public FieldDef m202b2dotpr1112;
        public FieldDef m202b2resnivela;
        public FieldDef m202b2resniveld;
        public FieldDef m202impexcquita;
        public FieldDef m202impintquita;
        public FieldDef m202nifentrepre;
        public FieldDef m202razonrepre;
        public FieldDef m202circun;
        public FieldDef m202quitacoop;
        public FieldDef m202reverdeter;
        public FieldDef m202ric;
        public FieldDef m202bonifart26;
        public FieldDef m202imporzec;
        public FieldDef m202bonifart33;
        public FieldDef m202fondprop172;
        public FieldDef m202renexcapxiv;
        public FieldDef m202bonifart34;
        public FieldDef m202correc131a;
        public FieldDef m202correc131b;
        public FieldDef m202discneg;
        public FieldDef m202terforal;
        public FieldDef m202espart50;
        public FieldDef m202paisotforal;
        public FieldDef m202repreodom;
        public FieldDef m202nifdom;
        public FieldDef m202razondom;
        public TabMod202(String name)
            {
            super(name);
            m202dominio = new FieldDef("m202dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m202nif = new FieldDef("m202nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m202ejercicio = new FieldDef("m202ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m202periodo = new FieldDef("m202periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m202deleg = new FieldDef("m202deleg",FieldDef.CHAR,30);
            m202admon = new FieldDef("m202admon",FieldDef.CHAR,30);
            m202tipdecl = new FieldDef("m202tipdecl",FieldDef.CHAR,1);
            m202codadmon = new FieldDef("m202codadmon",FieldDef.INTEGER,0);
            m202letetiq = new FieldDef("m202letetiq",FieldDef.CHAR,4);
            m202apellidos = new FieldDef("m202apellidos",FieldDef.CHAR,60);
            m202nombre = new FieldDef("m202nombre",FieldDef.CHAR,15);
            m202siglas = new FieldDef("m202siglas",FieldDef.CHAR,2);
            m202calle = new FieldDef("m202calle",FieldDef.CHAR,17);
            m202numero = new FieldDef("m202numero",FieldDef.CHAR,4);
            m202escalera = new FieldDef("m202escalera",FieldDef.CHAR,2);
            m202piso = new FieldDef("m202piso",FieldDef.CHAR,2);
            m202puerta = new FieldDef("m202puerta",FieldDef.CHAR,2);
            m202cpostal = new FieldDef("m202cpostal",FieldDef.CHAR,5);
            m202municipio = new FieldDef("m202municipio",FieldDef.CHAR,20);
            m202codmuni = new FieldDef("m202codmuni",FieldDef.INTEGER,0);
            m202codprov = new FieldDef("m202codprov",FieldDef.INTEGER,0);
            m202provincia = new FieldDef("m202provincia",FieldDef.CHAR,15);
            m202telefono = new FieldDef("m202telefono",FieldDef.CHAR,9);
            m202basepagoa = new FieldDef("m202basepagoa",FieldDef.FLOAT,6,0);
            m202ingra = new FieldDef("m202ingra",FieldDef.FLOAT,6,0);
            m202basepagob1 = new FieldDef("m202basepagob1",FieldDef.FLOAT,6,0);
            m202porcenb1 = new FieldDef("m202porcenb1",FieldDef.FLOAT,6,0);
            m202rtdob1 = new FieldDef("m202rtdob1",FieldDef.FLOAT,6,0);
            m202basepagob2 = new FieldDef("m202basepagob2",FieldDef.FLOAT,6,0);
            m202hastab2 = new FieldDef("m202hastab2",FieldDef.FLOAT,6,0);
            m202restob2 = new FieldDef("m202restob2",FieldDef.FLOAT,6,0);
            m202porcen21b2 = new FieldDef("m202porcen21b2",FieldDef.FLOAT,6,0);
            m202porcen25b2 = new FieldDef("m202porcen25b2",FieldDef.FLOAT,6,0);
            m202rtdob2 = new FieldDef("m202rtdob2",FieldDef.FLOAT,6,0);
            m202bonif = new FieldDef("m202bonif",FieldDef.FLOAT,6,0);
            m202reten = new FieldDef("m202reten",FieldDef.FLOAT,6,0);
            m202pagoanter = new FieldDef("m202pagoanter",FieldDef.FLOAT,6,0);
            m202ingrb1b2 = new FieldDef("m202ingrb1b2",FieldDef.FLOAT,6,0);
            m202fecha = new FieldDef("m202fecha",FieldDef.DATE);
            m202dia = new FieldDef("m202dia",FieldDef.INTEGER,0);
            m202mes = new FieldDef("m202mes",FieldDef.CHAR,10);
            m202anyo = new FieldDef("m202anyo",FieldDef.INTEGER,0);
            m202cruzefec = new FieldDef("m202cruzefec",FieldDef.CHAR,1);
            m202cruzadeu = new FieldDef("m202cruzadeu",FieldDef.CHAR,1);
            m202ingreso = new FieldDef("m202ingreso",FieldDef.FLOAT,6,0);
            m202entingreso = new FieldDef("m202entingreso",FieldDef.CHAR,4);
            m202ofiingreso = new FieldDef("m202ofiingreso",FieldDef.CHAR,4);
            m202digiingreso = new FieldDef("m202digiingreso",FieldDef.CHAR,2);
            m202ctaingreso = new FieldDef("m202ctaingreso",FieldDef.CHAR,10);
            m202percont = new FieldDef("m202percont",FieldDef.CHAR,100);
            m202telcont = new FieldDef("m202telcont",FieldDef.CHAR,9);
            m202observa = new FieldDef("m202observa",FieldDef.CHAR,4000);
            m202diasperiodo = new FieldDef("m202diasperiodo",FieldDef.INTEGER,0);
            m202modelo = new FieldDef("m202modelo",FieldDef.CHAR,5);
            m202rtdoanta = new FieldDef("m202rtdoanta",FieldDef.FLOAT,6,0);
            m202basepagogb3 = new FieldDef("m202basepagogb3",FieldDef.FLOAT,6,0);
            m202pagogenb3 = new FieldDef("m202pagogenb3",FieldDef.FLOAT,6,0);
            m202basepagoeb3 = new FieldDef("m202basepagoeb3",FieldDef.FLOAT,6,0);
            m202pagoespb3 = new FieldDef("m202pagoespb3",FieldDef.FLOAT,6,0);
            m202rtdob3 = new FieldDef("m202rtdob3",FieldDef.FLOAT,6,0);
            m202rtdoantb = new FieldDef("m202rtdoantb",FieldDef.FLOAT,6,0);
            m202numjusti = new FieldDef("m202numjusti",FieldDef.CHAR,16);
            m202fechainiper = new FieldDef("m202fechainiper",FieldDef.DATE);
            m202diainiper = new FieldDef("m202diainiper",FieldDef.INTEGER,0);
            m202mesiniper = new FieldDef("m202mesiniper",FieldDef.INTEGER,0);
            m202anyoiniper = new FieldDef("m202anyoiniper",FieldDef.INTEGER,0);
            m202rtdoconsol = new FieldDef("m202rtdoconsol",FieldDef.FLOAT,6,0);
            m202sumbimpantc = new FieldDef("m202sumbimpantc",FieldDef.FLOAT,6,0);
            m202corrdifeint = new FieldDef("m202corrdifeint",FieldDef.FLOAT,6,0);
            m202otrcorrec = new FieldDef("m202otrcorrec",FieldDef.FLOAT,6,0);
            m202compbasnegg = new FieldDef("m202compbasnegg",FieldDef.FLOAT,6,0);
            m202compbasnegi = new FieldDef("m202compbasnegi",FieldDef.FLOAT,6,0);
            m202infartdoord = new FieldDef("m202infartdoord",FieldDef.FLOAT,6,0);
            m202infartdoext = new FieldDef("m202infartdoext",FieldDef.FLOAT,6,0);
            m202rtdoantiss = new FieldDef("m202rtdoantiss",FieldDef.FLOAT,6,0);
            m202correcrtdo = new FieldDef("m202correcrtdo",FieldDef.FLOAT,6,0);
            m202combiantneg = new FieldDef("m202combiantneg",FieldDef.FLOAT,6,0);
            m202opecomunfor = new FieldDef("m202opecomunfor",FieldDef.FLOAT,6,0);
            m202numerogrupo = new FieldDef("m202numerogrupo",FieldDef.CHAR,10);
            m202cruzccc = new FieldDef("m202cruzccc",FieldDef.CHAR,1);
            m202codelec = new FieldDef("m202codelec",FieldDef.CHAR,16);
            m202pymep1 = new FieldDef("m202pymep1",FieldDef.FLOAT,6,0);
            m202pymep2 = new FieldDef("m202pymep2",FieldDef.FLOAT,6,0);
            m202granemp = new FieldDef("m202granemp",FieldDef.CHAR,1);
            m202tipo1b2 = new FieldDef("m202tipo1b2",FieldDef.FLOAT,6,0);
            m202tipo2b2 = new FieldDef("m202tipo2b2",FieldDef.FLOAT,6,0);
            m202formapago = new FieldDef("m202formapago",FieldDef.FLOAT,6,0);
            m202complemen = new FieldDef("m202complemen",FieldDef.CHAR,1);
            m202movcon = new FieldDef("m202movcon",FieldDef.CHAR,9);
            m202emailcon = new FieldDef("m202emailcon",FieldDef.CHAR,50);
            m202espyme = new FieldDef("m202espyme",FieldDef.CHAR,1);
            m202escreaemp = new FieldDef("m202escreaemp",FieldDef.CHAR,1);
            m202tipo21b2 = new FieldDef("m202tipo21b2",FieldDef.FLOAT,6,0);
            m202tipo25b2 = new FieldDef("m202tipo25b2",FieldDef.FLOAT,6,0);
            m202chcom = new FieldDef("m202chcom",FieldDef.CHAR,1);
            m202nrs = new FieldDef("m202nrs",FieldDef.CHAR,22);
            m202cnae = new FieldDef("m202cnae",FieldDef.INTEGER,0);
            m202tipoentidad = new FieldDef("m202tipoentidad",FieldDef.INTEGER,0);
            m202coopuotras = new FieldDef("m202coopuotras",FieldDef.INTEGER,0);
            m202graviss = new FieldDef("m202graviss",FieldDef.CHAR,5);
            m202ent85 = new FieldDef("m202ent85",FieldDef.CHAR,1);
            m202aumiss = new FieldDef("m202aumiss",FieldDef.FLOAT,6,0);
            m202dismiss = new FieldDef("m202dismiss",FieldDef.FLOAT,6,0);
            m202dismotras = new FieldDef("m202dismotras",FieldDef.FLOAT,6,0);
            m202impdividen = new FieldDef("m202impdividen",FieldDef.FLOAT,6,0);
            m202baseprevia = new FieldDef("m202baseprevia",FieldDef.FLOAT,6,0);
            m202resultado = new FieldDef("m202resultado",FieldDef.FLOAT,6,0);
            m202minimoing = new FieldDef("m202minimoing",FieldDef.FLOAT,6,0);
            m202sumbasind = new FieldDef("m202sumbasind",FieldDef.FLOAT,6,0);
            m202discordif = new FieldDef("m202discordif",FieldDef.FLOAT,6,0);
            m202datadicion = new FieldDef("m202datadicion",FieldDef.CHAR,1);
            m202nrefiss = new FieldDef("m202nrefiss",FieldDef.CHAR,22);
            m202negativa = new FieldDef("m202negativa",FieldDef.CHAR,1);
            m202aplicnav = new FieldDef("m202aplicnav",FieldDef.CHAR,1);
            m202gasamoraum = new FieldDef("m202gasamoraum",FieldDef.FLOAT,6,0);
            m202gasamordis = new FieldDef("m202gasamordis",FieldDef.FLOAT,6,0);
            m202totalaum = new FieldDef("m202totalaum",FieldDef.FLOAT,6,0);
            m202totaldis = new FieldDef("m202totaldis",FieldDef.FLOAT,6,0);
            m202copgencneg = new FieldDef("m202copgencneg",FieldDef.FLOAT,6,0);
            m202copespcneg = new FieldDef("m202copespcneg",FieldDef.FLOAT,6,0);
            m202cogecnein = new FieldDef("m202cogecnein",FieldDef.FLOAT,6,0);
            m202coescnein = new FieldDef("m202coescnein",FieldDef.FLOAT,6,0);
            m202ibanpais = new FieldDef("m202ibanpais",FieldDef.CHAR,2);
            m202ibandc = new FieldDef("m202ibandc",FieldDef.CHAR,2);
            m202fundacion = new FieldDef("m202fundacion",FieldDef.CHAR,1);
            m202socimi = new FieldDef("m202socimi",FieldDef.CHAR,1);
            m202sup6millon = new FieldDef("m202sup6millon",FieldDef.CHAR,1);
            m202impdivi100 = new FieldDef("m202impdivi100",FieldDef.FLOAT,6,0);
            m202remrescapit = new FieldDef("m202remrescapit",FieldDef.FLOAT,6,0);
            m202elimdot1112 = new FieldDef("m202elimdot1112",FieldDef.FLOAT,6,0);
            m202dot1112 = new FieldDef("m202dot1112",FieldDef.FLOAT,6,0);
            m202dotpr1112 = new FieldDef("m202dotpr1112",FieldDef.FLOAT,6,0);
            m202b1resnivela = new FieldDef("m202b1resnivela",FieldDef.FLOAT,6,0);
            m202b1resniveld = new FieldDef("m202b1resniveld",FieldDef.FLOAT,6,0);
            m202b1dot1112 = new FieldDef("m202b1dot1112",FieldDef.FLOAT,6,0);
            m202b1dotpr1112 = new FieldDef("m202b1dotpr1112",FieldDef.FLOAT,6,0);
            m202resnivcuaum = new FieldDef("m202resnivcuaum",FieldDef.FLOAT,6,0);
            m202resnivcudis = new FieldDef("m202resnivcudis",FieldDef.FLOAT,6,0);
            m202b2dot1112 = new FieldDef("m202b2dot1112",FieldDef.FLOAT,6,0);
            m202b2dotpr1112 = new FieldDef("m202b2dotpr1112",FieldDef.FLOAT,6,0);
            m202b2resnivela = new FieldDef("m202b2resnivela",FieldDef.FLOAT,6,0);
            m202b2resniveld = new FieldDef("m202b2resniveld",FieldDef.FLOAT,6,0);
            m202impexcquita = new FieldDef("m202impexcquita",FieldDef.FLOAT,6,0);
            m202impintquita = new FieldDef("m202impintquita",FieldDef.FLOAT,6,0);
            m202nifentrepre = new FieldDef("m202nifentrepre",FieldDef.CHAR,15);
            m202razonrepre = new FieldDef("m202razonrepre",FieldDef.CHAR,60);
            m202circun = new FieldDef("m202circun",FieldDef.CHAR,1);
            m202quitacoop = new FieldDef("m202quitacoop",FieldDef.FLOAT,6,0);
            m202reverdeter = new FieldDef("m202reverdeter",FieldDef.FLOAT,6,0);
            m202ric = new FieldDef("m202ric",FieldDef.FLOAT,6,0);
            m202bonifart26 = new FieldDef("m202bonifart26",FieldDef.FLOAT,6,0);
            m202imporzec = new FieldDef("m202imporzec",FieldDef.FLOAT,6,0);
            m202bonifart33 = new FieldDef("m202bonifart33",FieldDef.FLOAT,6,0);
            m202fondprop172 = new FieldDef("m202fondprop172",FieldDef.FLOAT,6,0);
            m202renexcapxiv = new FieldDef("m202renexcapxiv",FieldDef.FLOAT,6,0);
            m202bonifart34 = new FieldDef("m202bonifart34",FieldDef.FLOAT,6,0);
            m202correc131a = new FieldDef("m202correc131a",FieldDef.FLOAT,6,0);
            m202correc131b = new FieldDef("m202correc131b",FieldDef.FLOAT,6,0);
            m202discneg = new FieldDef("m202discneg",FieldDef.CHAR,1);
            m202terforal = new FieldDef("m202terforal",FieldDef.CHAR,1);
            m202espart50 = new FieldDef("m202espart50",FieldDef.CHAR,1);
            m202paisotforal = new FieldDef("m202paisotforal",FieldDef.CHAR,2);
            m202repreodom = new FieldDef("m202repreodom",FieldDef.CHAR,1);
            m202nifdom = new FieldDef("m202nifdom",FieldDef.CHAR,15);
            m202razondom = new FieldDef("m202razondom",FieldDef.CHAR,60);
            FieldDef array[] = {
                m202dominio,
                m202nif,
                m202ejercicio,
                m202periodo,
                m202deleg,
                m202admon,
                m202tipdecl,
                m202codadmon,
                m202letetiq,
                m202apellidos,
                m202nombre,
                m202siglas,
                m202calle,
                m202numero,
                m202escalera,
                m202piso,
                m202puerta,
                m202cpostal,
                m202municipio,
                m202codmuni,
                m202codprov,
                m202provincia,
                m202telefono,
                m202basepagoa,
                m202ingra,
                m202basepagob1,
                m202porcenb1,
                m202rtdob1,
                m202basepagob2,
                m202hastab2,
                m202restob2,
                m202porcen21b2,
                m202porcen25b2,
                m202rtdob2,
                m202bonif,
                m202reten,
                m202pagoanter,
                m202ingrb1b2,
                m202fecha,
                m202dia,
                m202mes,
                m202anyo,
                m202cruzefec,
                m202cruzadeu,
                m202ingreso,
                m202entingreso,
                m202ofiingreso,
                m202digiingreso,
                m202ctaingreso,
                m202percont,
                m202telcont,
                m202observa,
                m202diasperiodo,
                m202modelo,
                m202rtdoanta,
                m202basepagogb3,
                m202pagogenb3,
                m202basepagoeb3,
                m202pagoespb3,
                m202rtdob3,
                m202rtdoantb,
                m202numjusti,
                m202fechainiper,
                m202diainiper,
                m202mesiniper,
                m202anyoiniper,
                m202rtdoconsol,
                m202sumbimpantc,
                m202corrdifeint,
                m202otrcorrec,
                m202compbasnegg,
                m202compbasnegi,
                m202infartdoord,
                m202infartdoext,
                m202rtdoantiss,
                m202correcrtdo,
                m202combiantneg,
                m202opecomunfor,
                m202numerogrupo,
                m202cruzccc,
                m202codelec,
                m202pymep1,
                m202pymep2,
                m202granemp,
                m202tipo1b2,
                m202tipo2b2,
                m202formapago,
                m202complemen,
                m202movcon,
                m202emailcon,
                m202espyme,
                m202escreaemp,
                m202tipo21b2,
                m202tipo25b2,
                m202chcom,
                m202nrs,
                m202cnae,
                m202tipoentidad,
                m202coopuotras,
                m202graviss,
                m202ent85,
                m202aumiss,
                m202dismiss,
                m202dismotras,
                m202impdividen,
                m202baseprevia,
                m202resultado,
                m202minimoing,
                m202sumbasind,
                m202discordif,
                m202datadicion,
                m202nrefiss,
                m202negativa,
                m202aplicnav,
                m202gasamoraum,
                m202gasamordis,
                m202totalaum,
                m202totaldis,
                m202copgencneg,
                m202copespcneg,
                m202cogecnein,
                m202coescnein,
                m202ibanpais,
                m202ibandc,
                m202fundacion,
                m202socimi,
                m202sup6millon,
                m202impdivi100,
                m202remrescapit,
                m202elimdot1112,
                m202dot1112,
                m202dotpr1112,
                m202b1resnivela,
                m202b1resniveld,
                m202b1dot1112,
                m202b1dotpr1112,
                m202resnivcuaum,
                m202resnivcudis,
                m202b2dot1112,
                m202b2dotpr1112,
                m202b2resnivela,
                m202b2resniveld,
                m202impexcquita,
                m202impintquita,
                m202nifentrepre,
                m202razonrepre,
                m202circun,
                m202quitacoop,
                m202reverdeter,
                m202ric,
                m202bonifart26,
                m202imporzec,
                m202bonifart33,
                m202fondprop172,
                m202renexcapxiv,
                m202bonifart34,
                m202correc131a,
                m202correc131b,
                m202discneg,
                m202terforal,
                m202espart50,
                m202paisotforal,
                m202repreodom,
                m202nifdom,
                m202razondom                
                };
            setColumns(array);
            FieldDef arrayf[] = {m202dominio,m202nif,m202ejercicio,m202periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod20a extends TableDef
        {
        // campos
        public FieldDef m20adominio;
        public FieldDef m20anif;
        public FieldDef m20aejercicio;
        public FieldDef m20aperiodo;
        public FieldDef m20arazon;
        public FieldDef m20anombre;
        public FieldDef m20acnae;
        public FieldDef m20afiniper;
        public FieldDef m20aentnra;
        public FieldDef m20aentnrd;
        public FieldDef m20aotrdiftiga;
        public FieldDef m20aotrdiftigd;
        public FieldDef m20aotrdifama;
        public FieldDef m20aotrdifamd;
        public FieldDef m20alamora;
        public FieldDef m20alamord;
        public FieldDef m20apdet131a;
        public FieldDef m20apdet131d;
        public FieldDef m20apdetima;
        public FieldDef m20apdetimd;
        public FieldDef m20avrcapfp13a;
        public FieldDef m20avrcapfp13d;
        public FieldDef m20apdetdeua;
        public FieldDef m20apdetdeud;
        public FieldDef m20avrcapfp16a;
        public FieldDef m20avrcapfp16d;
        public FieldDef m20aprgasta;
        public FieldDef m20aprgastd;
        public FieldDef m20alimprgasta;
        public FieldDef m20alimprgastd;
        public FieldDef m20aprgastnoa;
        public FieldDef m20aprgastnod;
        public FieldDef m20aotrpronoda;
        public FieldDef m20aotrpronodd;
        public FieldDef m20agastderiva;
        public FieldDef m20agastderivd;
        public FieldDef m20aajgastfina;
        public FieldDef m20aajgastfind;
        public FieldDef m20aexdiva;
        public FieldDef m20aexdivd;
        public FieldDef m20aexreextra;
        public FieldDef m20aexreextrd;
        public FieldDef m20aagrintecoa;
        public FieldDef m20aagrintecod;
        public FieldDef m20avbiendera;
        public FieldDef m20avbienderd;
        public FieldDef m20aentvextra;
        public FieldDef m20aentvextrd;
        public FieldDef m20aotrcorrca;
        public FieldDef m20aotrcorrcd;
        public FieldDef m20atotcorana;
        public FieldDef m20atotcorand;
        public FieldDef m20atotcornet;
        public FieldDef m20agfadqpart;
        public FieldDef m20alimaddegf;
        public FieldDef m20agftraslim;
        public FieldDef m20agfndetlim;
        public FieldDef m20agfpdttlim;
        public FieldDef m20adfnoaflim;
        public FieldDef m20agfperimp;
        public FieldDef m20aif3cappro;
        public FieldDef m20agfnetpimp;
        public FieldDef m20alimdgfnet;
        public FieldDef m20aresexplot;
        public FieldDef m20aamorinmov;
        public FieldDef m20aisubyotra;
        public FieldDef m20adetresenaj;
        public FieldDef m20aifinstpat;
        public FieldDef m20alimben5ant;
        public FieldDef m20agfnetdedu;
        public FieldDef m20agfnetndedu;
        public FieldDef m20agfpdtdedu;
        public FieldDef m20agfpdtdedun;
        public FieldDef m20atotgfdedup;
        public FieldDef m20abinocomp14;
        public FieldDef m20acomplem;
        public FieldDef m20asustitu;
        public FieldDef m20anumjustant;
        public FieldDef m20aestadopres;
        public FieldDef m20aficherotel;
        public TabMod20a(String name)
            {
            super(name);
            m20adominio = new FieldDef("m20adominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m20anif = new FieldDef("m20anif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m20aejercicio = new FieldDef("m20aejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m20aperiodo = new FieldDef("m20aperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m20arazon = new FieldDef("m20arazon",FieldDef.CHAR,60);
            m20anombre = new FieldDef("m20anombre",FieldDef.CHAR,20);
            m20acnae = new FieldDef("m20acnae",FieldDef.CHAR,4);
            m20afiniper = new FieldDef("m20afiniper",FieldDef.DATE);
            m20aentnra = new FieldDef("m20aentnra",FieldDef.FLOAT,6,0);
            m20aentnrd = new FieldDef("m20aentnrd",FieldDef.FLOAT,6,0);
            m20aotrdiftiga = new FieldDef("m20aotrdiftiga",FieldDef.FLOAT,6,0);
            m20aotrdiftigd = new FieldDef("m20aotrdiftigd",FieldDef.FLOAT,6,0);
            m20aotrdifama = new FieldDef("m20aotrdifama",FieldDef.FLOAT,6,0);
            m20aotrdifamd = new FieldDef("m20aotrdifamd",FieldDef.FLOAT,6,0);
            m20alamora = new FieldDef("m20alamora",FieldDef.FLOAT,6,0);
            m20alamord = new FieldDef("m20alamord",FieldDef.FLOAT,6,0);
            m20apdet131a = new FieldDef("m20apdet131a",FieldDef.FLOAT,6,0);
            m20apdet131d = new FieldDef("m20apdet131d",FieldDef.FLOAT,6,0);
            m20apdetima = new FieldDef("m20apdetima",FieldDef.FLOAT,6,0);
            m20apdetimd = new FieldDef("m20apdetimd",FieldDef.FLOAT,6,0);
            m20avrcapfp13a = new FieldDef("m20avrcapfp13a",FieldDef.FLOAT,6,0);
            m20avrcapfp13d = new FieldDef("m20avrcapfp13d",FieldDef.FLOAT,6,0);
            m20apdetdeua = new FieldDef("m20apdetdeua",FieldDef.FLOAT,6,0);
            m20apdetdeud = new FieldDef("m20apdetdeud",FieldDef.FLOAT,6,0);
            m20avrcapfp16a = new FieldDef("m20avrcapfp16a",FieldDef.FLOAT,6,0);
            m20avrcapfp16d = new FieldDef("m20avrcapfp16d",FieldDef.FLOAT,6,0);
            m20aprgasta = new FieldDef("m20aprgasta",FieldDef.FLOAT,6,0);
            m20aprgastd = new FieldDef("m20aprgastd",FieldDef.FLOAT,6,0);
            m20alimprgasta = new FieldDef("m20alimprgasta",FieldDef.FLOAT,6,0);
            m20alimprgastd = new FieldDef("m20alimprgastd",FieldDef.FLOAT,6,0);
            m20aprgastnoa = new FieldDef("m20aprgastnoa",FieldDef.FLOAT,6,0);
            m20aprgastnod = new FieldDef("m20aprgastnod",FieldDef.FLOAT,6,0);
            m20aotrpronoda = new FieldDef("m20aotrpronoda",FieldDef.FLOAT,6,0);
            m20aotrpronodd = new FieldDef("m20aotrpronodd",FieldDef.FLOAT,6,0);
            m20agastderiva = new FieldDef("m20agastderiva",FieldDef.FLOAT,6,0);
            m20agastderivd = new FieldDef("m20agastderivd",FieldDef.FLOAT,6,0);
            m20aajgastfina = new FieldDef("m20aajgastfina",FieldDef.FLOAT,6,0);
            m20aajgastfind = new FieldDef("m20aajgastfind",FieldDef.FLOAT,6,0);
            m20aexdiva = new FieldDef("m20aexdiva",FieldDef.FLOAT,6,0);
            m20aexdivd = new FieldDef("m20aexdivd",FieldDef.FLOAT,6,0);
            m20aexreextra = new FieldDef("m20aexreextra",FieldDef.FLOAT,6,0);
            m20aexreextrd = new FieldDef("m20aexreextrd",FieldDef.FLOAT,6,0);
            m20aagrintecoa = new FieldDef("m20aagrintecoa",FieldDef.FLOAT,6,0);
            m20aagrintecod = new FieldDef("m20aagrintecod",FieldDef.FLOAT,6,0);
            m20avbiendera = new FieldDef("m20avbiendera",FieldDef.FLOAT,6,0);
            m20avbienderd = new FieldDef("m20avbienderd",FieldDef.FLOAT,6,0);
            m20aentvextra = new FieldDef("m20aentvextra",FieldDef.FLOAT,6,0);
            m20aentvextrd = new FieldDef("m20aentvextrd",FieldDef.FLOAT,6,0);
            m20aotrcorrca = new FieldDef("m20aotrcorrca",FieldDef.FLOAT,6,0);
            m20aotrcorrcd = new FieldDef("m20aotrcorrcd",FieldDef.FLOAT,6,0);
            m20atotcorana = new FieldDef("m20atotcorana",FieldDef.FLOAT,6,0);
            m20atotcorand = new FieldDef("m20atotcorand",FieldDef.FLOAT,6,0);
            m20atotcornet = new FieldDef("m20atotcornet",FieldDef.FLOAT,6,0);
            m20agfadqpart = new FieldDef("m20agfadqpart",FieldDef.FLOAT,6,0);
            m20alimaddegf = new FieldDef("m20alimaddegf",FieldDef.FLOAT,6,0);
            m20agftraslim = new FieldDef("m20agftraslim",FieldDef.FLOAT,6,0);
            m20agfndetlim = new FieldDef("m20agfndetlim",FieldDef.FLOAT,6,0);
            m20agfpdttlim = new FieldDef("m20agfpdttlim",FieldDef.FLOAT,6,0);
            m20adfnoaflim = new FieldDef("m20adfnoaflim",FieldDef.FLOAT,6,0);
            m20agfperimp = new FieldDef("m20agfperimp",FieldDef.FLOAT,6,0);
            m20aif3cappro = new FieldDef("m20aif3cappro",FieldDef.FLOAT,6,0);
            m20agfnetpimp = new FieldDef("m20agfnetpimp",FieldDef.FLOAT,6,0);
            m20alimdgfnet = new FieldDef("m20alimdgfnet",FieldDef.FLOAT,6,0);
            m20aresexplot = new FieldDef("m20aresexplot",FieldDef.FLOAT,6,0);
            m20aamorinmov = new FieldDef("m20aamorinmov",FieldDef.FLOAT,6,0);
            m20aisubyotra = new FieldDef("m20aisubyotra",FieldDef.FLOAT,6,0);
            m20adetresenaj = new FieldDef("m20adetresenaj",FieldDef.FLOAT,6,0);
            m20aifinstpat = new FieldDef("m20aifinstpat",FieldDef.FLOAT,6,0);
            m20alimben5ant = new FieldDef("m20alimben5ant",FieldDef.FLOAT,6,0);
            m20agfnetdedu = new FieldDef("m20agfnetdedu",FieldDef.FLOAT,6,0);
            m20agfnetndedu = new FieldDef("m20agfnetndedu",FieldDef.FLOAT,6,0);
            m20agfpdtdedu = new FieldDef("m20agfpdtdedu",FieldDef.FLOAT,6,0);
            m20agfpdtdedun = new FieldDef("m20agfpdtdedun",FieldDef.FLOAT,6,0);
            m20atotgfdedup = new FieldDef("m20atotgfdedup",FieldDef.FLOAT,6,0);
            m20abinocomp14 = new FieldDef("m20abinocomp14",FieldDef.FLOAT,6,0);
            m20acomplem = new FieldDef("m20acomplem",FieldDef.CHAR,1);
            m20asustitu = new FieldDef("m20asustitu",FieldDef.CHAR,1);
            m20anumjustant = new FieldDef("m20anumjustant",FieldDef.CHAR,13);
            m20aestadopres = new FieldDef("m20aestadopres",FieldDef.CHAR,2);
            m20aficherotel = new FieldDef("m20aficherotel",FieldDef.CHAR,2000);
            FieldDef array[] = {
                m20adominio,
                m20anif,
                m20aejercicio,
                m20aperiodo,
                m20arazon,
                m20anombre,
                m20acnae,
                m20afiniper,
                m20aentnra,
                m20aentnrd,
                m20aotrdiftiga,
                m20aotrdiftigd,
                m20aotrdifama,
                m20aotrdifamd,
                m20alamora,
                m20alamord,
                m20apdet131a,
                m20apdet131d,
                m20apdetima,
                m20apdetimd,
                m20avrcapfp13a,
                m20avrcapfp13d,
                m20apdetdeua,
                m20apdetdeud,
                m20avrcapfp16a,
                m20avrcapfp16d,
                m20aprgasta,
                m20aprgastd,
                m20alimprgasta,
                m20alimprgastd,
                m20aprgastnoa,
                m20aprgastnod,
                m20aotrpronoda,
                m20aotrpronodd,
                m20agastderiva,
                m20agastderivd,
                m20aajgastfina,
                m20aajgastfind,
                m20aexdiva,
                m20aexdivd,
                m20aexreextra,
                m20aexreextrd,
                m20aagrintecoa,
                m20aagrintecod,
                m20avbiendera,
                m20avbienderd,
                m20aentvextra,
                m20aentvextrd,
                m20aotrcorrca,
                m20aotrcorrcd,
                m20atotcorana,
                m20atotcorand,
                m20atotcornet,
                m20agfadqpart,
                m20alimaddegf,
                m20agftraslim,
                m20agfndetlim,
                m20agfpdttlim,
                m20adfnoaflim,
                m20agfperimp,
                m20aif3cappro,
                m20agfnetpimp,
                m20alimdgfnet,
                m20aresexplot,
                m20aamorinmov,
                m20aisubyotra,
                m20adetresenaj,
                m20aifinstpat,
                m20alimben5ant,
                m20agfnetdedu,
                m20agfnetndedu,
                m20agfpdtdedu,
                m20agfpdtdedun,
                m20atotgfdedup,
                m20abinocomp14,
                m20acomplem,
                m20asustitu,
                m20anumjustant,
                m20aestadopres,
                m20aficherotel                
                };
            setColumns(array);
            FieldDef arrayf[] = {m20adominio,m20anif,m20aejercicio,m20aperiodo };
            setPrimaryKeys(arrayf);
            m20aperiodo.setDescription("Período.  1P (abril), 2P (octubre), 3P (diciembre)");
            m20arazon.setDescription("Apellidos, razón social o denominación");
            m20anombre.setDescription("Nombre (solamente personas físicas)");
            m20acnae.setDescription("C.N.A.E actividad principal");
            m20afiniper.setDescription("Fecha inicio periodo impositivo.");
            m20aentnra.setDescription("Det. correc. al res. cont. (3) - Adq. part. entidades NR (DT 14ª LIS). Aumentos");
            m20aentnrd.setDescription("Det. correc. al res. cont. (3) - Adq. part. entidades NR (DT 14ª LIS). Disminuciones");
            m20aotrdiftiga.setDescription("Det. correc. al res. cont. (3) - Otras dif. imp. temp. ing. gastos (art. 11 LIS). Aumentos");
            m20aotrdiftigd.setDescription("Det. correc. al res. cont. (3) - Otras dif. imp. temp. ing. gastos (art. 11 LIS). Disminuciones");
            m20aotrdifama.setDescription("Det. correc. al res. cont. (3) - Otras diferencias entre amortización contable y fiscal (art. 12 LIS). Aumentos");
            m20aotrdifamd.setDescription("Det. correc. al res. cont. (3) - Otras diferencias entre amortización contable y fiscal (art. 12 LIS). Disminuciones");
            m20alamora.setDescription("Det. correc. al res. cont. (3) - Libertad amortización  (art. 12.3 e LIS). Aumentos.");
            m20alamord.setDescription("Det. correc. al res. cont. (3) - Libertad amortización  (art. 12.3 e LIS). Disminuciones.");
            m20apdet131a.setDescription("Det. correc. al res. cont. (3) - Pérdidas deterioro art. 13.1 LIS no art. 11.12 LIS. Aumentos.");
            m20apdet131d.setDescription("Det. correc. al res. cont. (3) - Pérdidas deterioro art. 13.1 LIS no art. 11.12 LIS. Disminuciones.");
            m20apdetima.setDescription("Det. correc. al res. cont. (3) - Pérdidas deterioro IM, inv. inm. e II (art. 13.2 a) y DT 15ª LIS). Aumentos");
            m20apdetimd.setDescription("Det. correc. al res. cont. (3) - Pérdidas deterioro IM, inv. inm. e II (art. 13.2 a) y DT 15ª LIS). Disminuciones");
            m20avrcapfp13a.setDescription("Det. correc. al res. cont. (3) -  Pérdidas deterioro valores repr. part. cap. fond.p. (art. 13.2 b LIS). Aumentos");
            m20avrcapfp13d.setDescription("Det. correc. al res. cont. (3) -  Pérdidas deterioro valores repr. part. cap. fond.p. (art. 13.2 b LIS). Disminuciones");
            m20apdetdeua.setDescription("Det. correc. al res. cont. (3) - Pérdidas deterioro valores repr. Deuda (art. 13.2 c) y DT 15ª LIS). Aumentos");
            m20apdetdeud.setDescription("Det. correc. al res. cont. (3) - Pérdidas deterioro valores repr. Deuda (art. 13.2 c) y DT 15ª LIS). Disminuciones");
            m20avrcapfp16a.setDescription("Det. correc. al res. cont. (3) - Ajustes deterioro valores representativos partic. cap. o fond.pr. (DT 16ª.1 y 2 y 3 LIS) Aumentos");
            m20avrcapfp16d.setDescription("Det. correc. al res. cont. (3) - Ajustes deterioro valores representativos partic. cap. o fond.pr. (DT 16ª.1 y 2 y 3 LIS) Dismin.");
            m20aprgasta.setDescription("Det. correc. al res. cont. (3) - Perd. deterio valores 13.1 LIS y prov. gastos 14.1 y 2 LIS 11,12 LIS Aumentos");
            m20aprgastd.setDescription("Det. correc. al res. cont. (3) - Perd. deterio valores 13.1 LIS y prov. gastos 14.1 y 2 LIS 11,12 LIS Disminuciones");
            m20alimprgasta.setDescription("Det. correc. al res. cont. (3) - Aplic. lím. Art 11.12 a pérdidas deterioro art. 13.1 y prov. Gastos art.14.1 y .2. Aumentos");
            m20alimprgastd.setDescription("Det. correc. al res. cont. (3) - Aplic. lím. Art 11.12 a pérdidas deterioro art. 13.1 y prov. Gastos art.14.1 y .2. Disminuciones");
            m20aprgastnoa.setDescription("Det. correc. al res. cont. (3) - Provisiones y gastos pensiones no art. 11.12 LIS. Aumentos");
            m20aprgastnod.setDescription("Det. correc. al res. cont. (3) - Provisiones y gastos pensiones no art. 11.12 LIS. Disminuciones");
            m20aotrpronoda.setDescription("Det. correc. al res. cont. (3) - Otras provisiones no deducibles art. 14 LIS no art. 11.12 LIS. Aumentos");
            m20aotrpronodd.setDescription("Det. correc. al res. cont. (3) - Otras provisiones no deducibles art. 14 LIS no art. 11.12 LIS. Disminuciones");
            m20agastderiva.setDescription("Det. correc. al res. cont. (3) - Gastos derivados deudas entidades grupo art. 15 .h LIS.");
            m20agastderivd.setDescription("Det. correc. al res. cont. (3) - Gastos derivados deudas entidades grupo art. 15 .h LIS. Disminuciones");
            m20aajgastfina.setDescription("Det. correc. al res. cont. (3) - Ajustes lim. dedu. Gastos financieros art. 16 y 83 LIS. Aumentos");
            m20aajgastfind.setDescription("Det. correc. al res. cont. (3) - Ajustes lim. dedu. Gastos financieros art. 16 y 83 LIS. Disminuciones");
            m20aexdiva.setDescription("Det. correc. al res. cont. (3) - Exenc. div. tran. valores. FF.PP. E.R. y E.N.R. (art, 21 LIS).  Aumentos");
            m20aexdivd.setDescription("Det. correc. al res. cont. (3) - Exenc. div. tran. valores. FF.PP. E.R. y E.N.R. (art, 21 LIS).  Disminuciones");
            m20aexreextra.setDescription("Det. correc. al res. cont. (3) - Exención de rentas en el extranjero de EP art. 22. Aumentos");
            m20aexreextrd.setDescription("Det. correc. al res. cont. (3) - Exención de rentas en el extranjero de EP art. 22. Disminuciones");
            m20aagrintecoa.setDescription("Det. correc. al res. cont. (3) - Agrupaciones interes económico y UTE Cap. II Tít. VII LIS. Aumentos");
            m20aagrintecod.setDescription("Det. correc. al res. cont. (3) - Agrupaciones interes económico y UTE Cap. II Tít. VII LIS. Disminuciones");
            m20avbiendera.setDescription("Det. correc. al res. cont. (3) - Valoración bienes y derechos. Reg. esp. op. rees. Cap. VII Tít. VII LIS. Aumentos");
            m20avbienderd.setDescription("Det. correc. al res. cont. (3) - Valoración bienes y derechos. Reg. esp. op. rees. Cap. VII Tít. VII LIS. Disminuciones");
            m20aentvextra.setDescription("Det. correc. al res. cont. (3) - Entidades tenencia valores extranjeros (Cap. XIII Tít. VII LIS). Aumentos");
            m20aentvextrd.setDescription("Det. correc. al res. cont. (3) - Entidades tenencia valores extranjeros (Cap. XIII Tít. VII LIS). Disminuciones");
            m20aotrcorrca.setDescription("Det. correc. al res. cont. (3) - Otras correcciones al resultado contable. Aumentos");
            m20aotrcorrcd.setDescription("Det. correc. al res. cont. (3) - Otras correcciones al resultado contable. Disminuciones");
            m20atotcorana.setDescription("Det. correc. al res. cont. (3) - Total correcciones anteriores. Aumentos");
            m20atotcorand.setDescription("Det. correc. al res. cont. (3) - Total correcciones anteriores. Disminuciones");
            m20atotcornet.setDescription("Det. correc. al res. cont. (3) - Total correcciones netas al resultado (excl. corrección por IS)");
            m20agfadqpart.setDescription("Lim. deduc. gastos finan. (4) - Gastos fin. deudas adq. Part. Art. 16.5 u 83 LIS");
            m20alimaddegf.setDescription("Lim. deduc. gastos finan. (4) -  Límite adicional a la deducc. de gastos fin. Art. 16.5 u 83 LIS");
            m20agftraslim.setDescription("Lim. deduc. gastos finan. (4) -  Gastos financieros deducc. tras lim. Art 16.5 u 83 LIS");
            m20agfndetlim.setDescription("Lim. deduc. gastos finan. (4) -  Gastos financieros NO deducc. tras lim. Art 16.5 u 83 LIS");
            m20agfpdttlim.setDescription("Lim. deduc. gastos finan. (4) -  Gastos financieros pendientes deducc. tras lim. Art 16.5 u 83 LIS");
            m20adfnoaflim.setDescription("Lim. deduc. gastos finan. (4) -  Gastos financieros no afectados lim. Art 16.5 u 83 LIS");
            m20agfperimp.setDescription("Lim. deduc. gastos finan. (4) -  Gastos financieros periodo impositivo");
            m20aif3cappro.setDescription("Lim. deduc. gastos finan. (4) -  Ingresos financieros derivados cesión terceros capitales propios");
            m20agfnetpimp.setDescription("Lim. deduc. gastos finan. (4) -  Gastos financieros netos del período impositivo");
            m20alimdgfnet.setDescription("Lim. deduc. gastos finan. (4) -  Límite deducción gastos financieros netos");
            m20aresexplot.setDescription("Lim. deduc. gastos finan. (4) -  Resultado de explotación");
            m20aamorinmov.setDescription("Lim. deduc. gastos finan. (4) -  Amortización inmovilizado");
            m20aisubyotra.setDescription("Lim. deduc. gastos finan. (4) -  Imputación de subvenciones inmovilizado no financiero y otras");
            m20adetresenaj.setDescription("Lim. deduc. gastos finan. (4) -  Deterioro y resultado  enajenaciones inmovilizado");
            m20aifinstpat.setDescription("Lim. deduc. gastos finan. (4) -  Ingresos financieros participación instrumentos patrimonio.");
            m20alimben5ant.setDescription("Lim. deduc. gastos finan. (4) -  Adición límite beneficio operativo no aplicado 5 años anteriores");
            m20agfnetdedu.setDescription("Lim. deduc. gastos finan. (4) -  Gastos financieros netos del período impositivo deducibles");
            m20agfnetndedu.setDescription("Lim. deduc. gastos finan. (4) -  Gastos financieros netos del período impositivo no deducibles");
            m20agfpdtdedu.setDescription("Lim. deduc. gastos finan. (4) -  Gastos financieros pendientes deducir afectados art. 16.5 u 83 LIS");
            m20agfpdtdedun.setDescription("Lim. deduc. gastos finan. (4) -  Gastos financieros pendientes deducir NO afectados art. 16.5 u 83 LIS");
            m20atotgfdedup.setDescription("Lim. deduc. gastos finan. (4) -  Total gastos financieros deducibles en el período");
            m20abinocomp14.setDescription("Información adicional (5) - B.I. negativas pendientes no compensadas en casilla [14] por insuficiencia de base 15 enteros y 2 decimales");
            m20acomplem.setDescription("Declaración complementaria o sustitutiva (6) - Declaración complementaria. X o blanco");
            m20asustitu.setDescription("Declaración complementaria o sustitutiva (6) - Declaración sustitutiva. X o blanco");
            m20anumjustant.setDescription("Declaración complementaria o sustitutiva (6) - Número justificante declaración anterior.");
            m20aestadopres.setDescription("Estado presentación telemática: P (pendiente), TT (terminado telemático), TE (terminado errores)");
            m20aficherotel.setDescription("Ruta al fichero de presentación telemática");
            }
        }
        
    public class TabMod303rs extends TableDef
        {
        // campos
        public FieldDef m03acodi;
        public FieldDef m03adominio;
        public FieldDef m03anif;
        public FieldDef m03aejercicio;
        public FieldDef m03aperiodo;
        public FieldDef m03anumpag;
        public FieldDef m03acomplemen;
        public FieldDef m03aa1codigo;
        public FieldDef m03aa1numact;
        public FieldDef m03aa1voling;
        public FieldDef m03aa1indice;
        public FieldDef m03aa1cuodev;
        public FieldDef m03aa2codigo;
        public FieldDef m03aa2numact;
        public FieldDef m03aa2voling;
        public FieldDef m03aa2indice;
        public FieldDef m03aa2cuodev;
        public FieldDef m03aa1123por;
        public FieldDef m03aa1123incta;
        public FieldDef m03aa2123por;
        public FieldDef m03aa2123incta;
        public FieldDef m03aa14cuosop;
        public FieldDef m03aa14cuoanu;
        public FieldDef m03aa24cuosop;
        public FieldDef m03aa24cuoanu;
        public FieldDef m03ab1codigo;
        public FieldDef m03ab2codigo;
        public FieldDef m03ab1epigrafe;
        public FieldDef m03ab2epigrafe;
        public FieldDef m03ab1moduni1;
        public FieldDef m03ab1modimp1;
        public FieldDef m03ab2moduni1;
        public FieldDef m03ab2modimp1;
        public FieldDef m03ab1moduni2;
        public FieldDef m03ab1modimp2;
        public FieldDef m03ab2moduni2;
        public FieldDef m03ab2modimp2;
        public FieldDef m03ab1moduni3;
        public FieldDef m03ab1modimp3;
        public FieldDef m03ab2moduni3;
        public FieldDef m03ab2modimp3;
        public FieldDef m03ab1moduni4;
        public FieldDef m03ab1modimp4;
        public FieldDef m03ab2moduni4;
        public FieldDef m03ab2modimp4;
        public FieldDef m03ab1moduni5;
        public FieldDef m03ab1modimp5;
        public FieldDef m03ab2moduni5;
        public FieldDef m03ab2modimp5;
        public FieldDef m03ab1moduni6;
        public FieldDef m03ab1modimp6;
        public FieldDef m03ab2moduni6;
        public FieldDef m03ab2modimp6;
        public FieldDef m03ab1moduni7;
        public FieldDef m03ab1modimp7;
        public FieldDef m03ab2moduni7;
        public FieldDef m03ab2modimp7;
        public FieldDef m03ab1cuodeven;
        public FieldDef m03ab2cuodeven;
        public FieldDef m03ab1reduc;
        public FieldDef m03ab2reduc;
        public FieldDef m03ab1123ind;
        public FieldDef m03ab2123ind;
        public FieldDef m03ab1123por;
        public FieldDef m03ab2123por;
        public FieldDef m03ab1123incta;
        public FieldDef m03ab2123incta;
        public FieldDef m03a123sumaing;
        public FieldDef m03ab14cuosop;
        public FieldDef m03ab24cuosop;
        public FieldDef m03ab14indice;
        public FieldDef m03ab24indice;
        public FieldDef m03ab14resul;
        public FieldDef m03ab24resul;
        public FieldDef m03ab14porcen;
        public FieldDef m03ab24porcen;
        public FieldDef m03ab14devol;
        public FieldDef m03ab24devol;
        public FieldDef m03ab14cuomin;
        public FieldDef m03ab24cuomin;
        public FieldDef m03ab14cuoanu;
        public FieldDef m03ab24cuoanu;
        public FieldDef m03ab4sumcude;
        public FieldDef m03ab4suming;
        public FieldDef m03ab4resul;
        public FieldDef m03aadqintra;
        public FieldDef m03aentregas;
        public FieldDef m03adevisp;
        public FieldDef m03adevtotal;
        public FieldDef m03aadqfijos;
        public FieldDef m03aregul;
        public FieldDef m03adedtotal;
        public FieldDef m03arsresul;
        public TabMod303rs(String name)
            {
            super(name);
            m03acodi = new FieldDef("m03acodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m03adominio = new FieldDef("m03adominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m03anif = new FieldDef("m03anif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m03aejercicio = new FieldDef("m03aejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m03aperiodo = new FieldDef("m03aperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m03anumpag = new FieldDef("m03anumpag",FieldDef.INTEGER,0);
            m03acomplemen = new FieldDef("m03acomplemen",FieldDef.CHAR,1);
            m03aa1codigo = new FieldDef("m03aa1codigo",FieldDef.INTEGER,0);
            m03aa1numact = new FieldDef("m03aa1numact",FieldDef.INTEGER,0);
            m03aa1voling = new FieldDef("m03aa1voling",FieldDef.FLOAT,6,0);
            m03aa1indice = new FieldDef("m03aa1indice",FieldDef.FLOAT,6,0);
            m03aa1cuodev = new FieldDef("m03aa1cuodev",FieldDef.FLOAT,6,0);
            m03aa2codigo = new FieldDef("m03aa2codigo",FieldDef.INTEGER,0);
            m03aa2numact = new FieldDef("m03aa2numact",FieldDef.INTEGER,0);
            m03aa2voling = new FieldDef("m03aa2voling",FieldDef.FLOAT,6,0);
            m03aa2indice = new FieldDef("m03aa2indice",FieldDef.FLOAT,6,0);
            m03aa2cuodev = new FieldDef("m03aa2cuodev",FieldDef.FLOAT,6,0);
            m03aa1123por = new FieldDef("m03aa1123por",FieldDef.FLOAT,6,0);
            m03aa1123incta = new FieldDef("m03aa1123incta",FieldDef.FLOAT,6,0);
            m03aa2123por = new FieldDef("m03aa2123por",FieldDef.FLOAT,6,0);
            m03aa2123incta = new FieldDef("m03aa2123incta",FieldDef.FLOAT,6,0);
            m03aa14cuosop = new FieldDef("m03aa14cuosop",FieldDef.FLOAT,6,0);
            m03aa14cuoanu = new FieldDef("m03aa14cuoanu",FieldDef.FLOAT,6,0);
            m03aa24cuosop = new FieldDef("m03aa24cuosop",FieldDef.FLOAT,6,0);
            m03aa24cuoanu = new FieldDef("m03aa24cuoanu",FieldDef.FLOAT,6,0);
            m03ab1codigo = new FieldDef("m03ab1codigo",FieldDef.INTEGER,0);
            m03ab2codigo = new FieldDef("m03ab2codigo",FieldDef.INTEGER,0);
            m03ab1epigrafe = new FieldDef("m03ab1epigrafe",FieldDef.CHAR,4);
            m03ab2epigrafe = new FieldDef("m03ab2epigrafe",FieldDef.CHAR,4);
            m03ab1moduni1 = new FieldDef("m03ab1moduni1",FieldDef.FLOAT,6,0);
            m03ab1modimp1 = new FieldDef("m03ab1modimp1",FieldDef.FLOAT,6,0);
            m03ab2moduni1 = new FieldDef("m03ab2moduni1",FieldDef.FLOAT,6,0);
            m03ab2modimp1 = new FieldDef("m03ab2modimp1",FieldDef.FLOAT,6,0);
            m03ab1moduni2 = new FieldDef("m03ab1moduni2",FieldDef.FLOAT,6,0);
            m03ab1modimp2 = new FieldDef("m03ab1modimp2",FieldDef.FLOAT,6,0);
            m03ab2moduni2 = new FieldDef("m03ab2moduni2",FieldDef.FLOAT,6,0);
            m03ab2modimp2 = new FieldDef("m03ab2modimp2",FieldDef.FLOAT,6,0);
            m03ab1moduni3 = new FieldDef("m03ab1moduni3",FieldDef.FLOAT,6,0);
            m03ab1modimp3 = new FieldDef("m03ab1modimp3",FieldDef.FLOAT,6,0);
            m03ab2moduni3 = new FieldDef("m03ab2moduni3",FieldDef.FLOAT,6,0);
            m03ab2modimp3 = new FieldDef("m03ab2modimp3",FieldDef.FLOAT,6,0);
            m03ab1moduni4 = new FieldDef("m03ab1moduni4",FieldDef.FLOAT,6,0);
            m03ab1modimp4 = new FieldDef("m03ab1modimp4",FieldDef.FLOAT,6,0);
            m03ab2moduni4 = new FieldDef("m03ab2moduni4",FieldDef.FLOAT,6,0);
            m03ab2modimp4 = new FieldDef("m03ab2modimp4",FieldDef.FLOAT,6,0);
            m03ab1moduni5 = new FieldDef("m03ab1moduni5",FieldDef.FLOAT,6,0);
            m03ab1modimp5 = new FieldDef("m03ab1modimp5",FieldDef.FLOAT,6,0);
            m03ab2moduni5 = new FieldDef("m03ab2moduni5",FieldDef.FLOAT,6,0);
            m03ab2modimp5 = new FieldDef("m03ab2modimp5",FieldDef.FLOAT,6,0);
            m03ab1moduni6 = new FieldDef("m03ab1moduni6",FieldDef.FLOAT,6,0);
            m03ab1modimp6 = new FieldDef("m03ab1modimp6",FieldDef.FLOAT,6,0);
            m03ab2moduni6 = new FieldDef("m03ab2moduni6",FieldDef.FLOAT,6,0);
            m03ab2modimp6 = new FieldDef("m03ab2modimp6",FieldDef.FLOAT,6,0);
            m03ab1moduni7 = new FieldDef("m03ab1moduni7",FieldDef.FLOAT,6,0);
            m03ab1modimp7 = new FieldDef("m03ab1modimp7",FieldDef.FLOAT,6,0);
            m03ab2moduni7 = new FieldDef("m03ab2moduni7",FieldDef.FLOAT,6,0);
            m03ab2modimp7 = new FieldDef("m03ab2modimp7",FieldDef.FLOAT,6,0);
            m03ab1cuodeven = new FieldDef("m03ab1cuodeven",FieldDef.FLOAT,6,0);
            m03ab2cuodeven = new FieldDef("m03ab2cuodeven",FieldDef.FLOAT,6,0);
            m03ab1reduc = new FieldDef("m03ab1reduc",FieldDef.FLOAT,6,0);
            m03ab2reduc = new FieldDef("m03ab2reduc",FieldDef.FLOAT,6,0);
            m03ab1123ind = new FieldDef("m03ab1123ind",FieldDef.FLOAT,6,0);
            m03ab2123ind = new FieldDef("m03ab2123ind",FieldDef.FLOAT,6,0);
            m03ab1123por = new FieldDef("m03ab1123por",FieldDef.FLOAT,6,0);
            m03ab2123por = new FieldDef("m03ab2123por",FieldDef.FLOAT,6,0);
            m03ab1123incta = new FieldDef("m03ab1123incta",FieldDef.FLOAT,6,0);
            m03ab2123incta = new FieldDef("m03ab2123incta",FieldDef.FLOAT,6,0);
            m03a123sumaing = new FieldDef("m03a123sumaing",FieldDef.FLOAT,6,0);
            m03ab14cuosop = new FieldDef("m03ab14cuosop",FieldDef.FLOAT,6,0);
            m03ab24cuosop = new FieldDef("m03ab24cuosop",FieldDef.FLOAT,6,0);
            m03ab14indice = new FieldDef("m03ab14indice",FieldDef.FLOAT,6,0);
            m03ab24indice = new FieldDef("m03ab24indice",FieldDef.FLOAT,6,0);
            m03ab14resul = new FieldDef("m03ab14resul",FieldDef.FLOAT,6,0);
            m03ab24resul = new FieldDef("m03ab24resul",FieldDef.FLOAT,6,0);
            m03ab14porcen = new FieldDef("m03ab14porcen",FieldDef.FLOAT,6,0);
            m03ab24porcen = new FieldDef("m03ab24porcen",FieldDef.FLOAT,6,0);
            m03ab14devol = new FieldDef("m03ab14devol",FieldDef.FLOAT,6,0);
            m03ab24devol = new FieldDef("m03ab24devol",FieldDef.FLOAT,6,0);
            m03ab14cuomin = new FieldDef("m03ab14cuomin",FieldDef.FLOAT,6,0);
            m03ab24cuomin = new FieldDef("m03ab24cuomin",FieldDef.FLOAT,6,0);
            m03ab14cuoanu = new FieldDef("m03ab14cuoanu",FieldDef.FLOAT,6,0);
            m03ab24cuoanu = new FieldDef("m03ab24cuoanu",FieldDef.FLOAT,6,0);
            m03ab4sumcude = new FieldDef("m03ab4sumcude",FieldDef.FLOAT,6,0);
            m03ab4suming = new FieldDef("m03ab4suming",FieldDef.FLOAT,6,0);
            m03ab4resul = new FieldDef("m03ab4resul",FieldDef.FLOAT,6,0);
            m03aadqintra = new FieldDef("m03aadqintra",FieldDef.FLOAT,6,0);
            m03aentregas = new FieldDef("m03aentregas",FieldDef.FLOAT,6,0);
            m03adevisp = new FieldDef("m03adevisp",FieldDef.FLOAT,6,0);
            m03adevtotal = new FieldDef("m03adevtotal",FieldDef.FLOAT,6,0);
            m03aadqfijos = new FieldDef("m03aadqfijos",FieldDef.FLOAT,6,0);
            m03aregul = new FieldDef("m03aregul",FieldDef.FLOAT,6,0);
            m03adedtotal = new FieldDef("m03adedtotal",FieldDef.FLOAT,6,0);
            m03arsresul = new FieldDef("m03arsresul",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m03acodi,
                m03adominio,
                m03anif,
                m03aejercicio,
                m03aperiodo,
                m03anumpag,
                m03acomplemen,
                m03aa1codigo,
                m03aa1numact,
                m03aa1voling,
                m03aa1indice,
                m03aa1cuodev,
                m03aa2codigo,
                m03aa2numact,
                m03aa2voling,
                m03aa2indice,
                m03aa2cuodev,
                m03aa1123por,
                m03aa1123incta,
                m03aa2123por,
                m03aa2123incta,
                m03aa14cuosop,
                m03aa14cuoanu,
                m03aa24cuosop,
                m03aa24cuoanu,
                m03ab1codigo,
                m03ab2codigo,
                m03ab1epigrafe,
                m03ab2epigrafe,
                m03ab1moduni1,
                m03ab1modimp1,
                m03ab2moduni1,
                m03ab2modimp1,
                m03ab1moduni2,
                m03ab1modimp2,
                m03ab2moduni2,
                m03ab2modimp2,
                m03ab1moduni3,
                m03ab1modimp3,
                m03ab2moduni3,
                m03ab2modimp3,
                m03ab1moduni4,
                m03ab1modimp4,
                m03ab2moduni4,
                m03ab2modimp4,
                m03ab1moduni5,
                m03ab1modimp5,
                m03ab2moduni5,
                m03ab2modimp5,
                m03ab1moduni6,
                m03ab1modimp6,
                m03ab2moduni6,
                m03ab2modimp6,
                m03ab1moduni7,
                m03ab1modimp7,
                m03ab2moduni7,
                m03ab2modimp7,
                m03ab1cuodeven,
                m03ab2cuodeven,
                m03ab1reduc,
                m03ab2reduc,
                m03ab1123ind,
                m03ab2123ind,
                m03ab1123por,
                m03ab2123por,
                m03ab1123incta,
                m03ab2123incta,
                m03a123sumaing,
                m03ab14cuosop,
                m03ab24cuosop,
                m03ab14indice,
                m03ab24indice,
                m03ab14resul,
                m03ab24resul,
                m03ab14porcen,
                m03ab24porcen,
                m03ab14devol,
                m03ab24devol,
                m03ab14cuomin,
                m03ab24cuomin,
                m03ab14cuoanu,
                m03ab24cuoanu,
                m03ab4sumcude,
                m03ab4suming,
                m03ab4resul,
                m03aadqintra,
                m03aentregas,
                m03adevisp,
                m03adevtotal,
                m03aadqfijos,
                m03aregul,
                m03adedtotal,
                m03arsresul                
                };
            setColumns(array);
            FieldDef arrayf[] = {m03acodi };
            setPrimaryKeys(arrayf);
            m03acodi.setAutoIncrementable(true);
            }
        }
        
    public class TabMod303p4 extends TableDef
        {
        // campos
        public FieldDef m304codi;
        public FieldDef m304dominio;
        public FieldDef m304nif;
        public FieldDef m304ejercicio;
        public FieldDef m304periodo;
        public FieldDef m304numpag;
        public FieldDef m304complemen;
        public FieldDef m304pro1codcnae;
        public FieldDef m304pro1impoper;
        public FieldDef m304pro1impopde;
        public FieldDef m304pro1tipo;
        public FieldDef m304pro1pormeno;
        public FieldDef m304pro2codcnae;
        public FieldDef m304pro2impoper;
        public FieldDef m304pro2impopde;
        public FieldDef m304pro2tipo;
        public FieldDef m304pro2pormeno;
        public FieldDef m304pro3codcnae;
        public FieldDef m304pro3impoper;
        public FieldDef m304pro3impopde;
        public FieldDef m304pro3tipo;
        public FieldDef m304pro3pormeno;
        public FieldDef m304pro4codcnae;
        public FieldDef m304pro4impoper;
        public FieldDef m304pro4impopde;
        public FieldDef m304pro4tipo;
        public FieldDef m304pro4pormeno;
        public FieldDef m304pro5codcnae;
        public FieldDef m304pro5impoper;
        public FieldDef m304pro5impopde;
        public FieldDef m304pro5tipo;
        public FieldDef m304pro5pormeno;
        public FieldDef m304deddif1b1;
        public FieldDef m304deddif1c1;
        public FieldDef m304deddif1b2;
        public FieldDef m304deddif1c2;
        public FieldDef m304deddif1b3;
        public FieldDef m304deddif1c3;
        public FieldDef m304deddif1b4;
        public FieldDef m304deddif1c4;
        public FieldDef m304deddif1b5;
        public FieldDef m304deddif1c5;
        public FieldDef m304deddif1b6;
        public FieldDef m304deddif1c6;
        public FieldDef m304deddif1b7;
        public FieldDef m304deddif1c7;
        public FieldDef m304deddif1b8;
        public FieldDef m304deddif1c8;
        public FieldDef m304deddif1c9;
        public FieldDef m304deddif1to;
        public FieldDef m304deddif2b1;
        public FieldDef m304deddif2c1;
        public FieldDef m304deddif2b2;
        public FieldDef m304deddif2c2;
        public FieldDef m304deddif2b3;
        public FieldDef m304deddif2c3;
        public FieldDef m304deddif2b4;
        public FieldDef m304deddif2c4;
        public FieldDef m304deddif2b5;
        public FieldDef m304deddif2c5;
        public FieldDef m304deddif2b6;
        public FieldDef m304deddif2c6;
        public FieldDef m304deddif2b7;
        public FieldDef m304deddif2c7;
        public FieldDef m304deddif2b8;
        public FieldDef m304deddif2c8;
        public FieldDef m304deddif2c9;
        public FieldDef m304deddif2to;
        public TabMod303p4(String name)
            {
            super(name);
            m304codi = new FieldDef("m304codi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m304dominio = new FieldDef("m304dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m304nif = new FieldDef("m304nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m304ejercicio = new FieldDef("m304ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m304periodo = new FieldDef("m304periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m304numpag = new FieldDef("m304numpag",FieldDef.INTEGER,0);
            m304complemen = new FieldDef("m304complemen",FieldDef.CHAR,1);
            m304pro1codcnae = new FieldDef("m304pro1codcnae",FieldDef.CHAR,3);
            m304pro1impoper = new FieldDef("m304pro1impoper",FieldDef.FLOAT,6,0);
            m304pro1impopde = new FieldDef("m304pro1impopde",FieldDef.FLOAT,6,0);
            m304pro1tipo = new FieldDef("m304pro1tipo",FieldDef.CHAR,1);
            m304pro1pormeno = new FieldDef("m304pro1pormeno",FieldDef.FLOAT,6,0);
            m304pro2codcnae = new FieldDef("m304pro2codcnae",FieldDef.CHAR,3);
            m304pro2impoper = new FieldDef("m304pro2impoper",FieldDef.FLOAT,6,0);
            m304pro2impopde = new FieldDef("m304pro2impopde",FieldDef.FLOAT,6,0);
            m304pro2tipo = new FieldDef("m304pro2tipo",FieldDef.CHAR,1);
            m304pro2pormeno = new FieldDef("m304pro2pormeno",FieldDef.FLOAT,6,0);
            m304pro3codcnae = new FieldDef("m304pro3codcnae",FieldDef.CHAR,3);
            m304pro3impoper = new FieldDef("m304pro3impoper",FieldDef.FLOAT,6,0);
            m304pro3impopde = new FieldDef("m304pro3impopde",FieldDef.FLOAT,6,0);
            m304pro3tipo = new FieldDef("m304pro3tipo",FieldDef.CHAR,1);
            m304pro3pormeno = new FieldDef("m304pro3pormeno",FieldDef.FLOAT,6,0);
            m304pro4codcnae = new FieldDef("m304pro4codcnae",FieldDef.CHAR,3);
            m304pro4impoper = new FieldDef("m304pro4impoper",FieldDef.FLOAT,6,0);
            m304pro4impopde = new FieldDef("m304pro4impopde",FieldDef.FLOAT,6,0);
            m304pro4tipo = new FieldDef("m304pro4tipo",FieldDef.CHAR,1);
            m304pro4pormeno = new FieldDef("m304pro4pormeno",FieldDef.FLOAT,6,0);
            m304pro5codcnae = new FieldDef("m304pro5codcnae",FieldDef.CHAR,3);
            m304pro5impoper = new FieldDef("m304pro5impoper",FieldDef.FLOAT,6,0);
            m304pro5impopde = new FieldDef("m304pro5impopde",FieldDef.FLOAT,6,0);
            m304pro5tipo = new FieldDef("m304pro5tipo",FieldDef.CHAR,1);
            m304pro5pormeno = new FieldDef("m304pro5pormeno",FieldDef.FLOAT,6,0);
            m304deddif1b1 = new FieldDef("m304deddif1b1",FieldDef.FLOAT,6,0);
            m304deddif1c1 = new FieldDef("m304deddif1c1",FieldDef.FLOAT,6,0);
            m304deddif1b2 = new FieldDef("m304deddif1b2",FieldDef.FLOAT,6,0);
            m304deddif1c2 = new FieldDef("m304deddif1c2",FieldDef.FLOAT,6,0);
            m304deddif1b3 = new FieldDef("m304deddif1b3",FieldDef.FLOAT,6,0);
            m304deddif1c3 = new FieldDef("m304deddif1c3",FieldDef.FLOAT,6,0);
            m304deddif1b4 = new FieldDef("m304deddif1b4",FieldDef.FLOAT,6,0);
            m304deddif1c4 = new FieldDef("m304deddif1c4",FieldDef.FLOAT,6,0);
            m304deddif1b5 = new FieldDef("m304deddif1b5",FieldDef.FLOAT,6,0);
            m304deddif1c5 = new FieldDef("m304deddif1c5",FieldDef.FLOAT,6,0);
            m304deddif1b6 = new FieldDef("m304deddif1b6",FieldDef.FLOAT,6,0);
            m304deddif1c6 = new FieldDef("m304deddif1c6",FieldDef.FLOAT,6,0);
            m304deddif1b7 = new FieldDef("m304deddif1b7",FieldDef.FLOAT,6,0);
            m304deddif1c7 = new FieldDef("m304deddif1c7",FieldDef.FLOAT,6,0);
            m304deddif1b8 = new FieldDef("m304deddif1b8",FieldDef.FLOAT,6,0);
            m304deddif1c8 = new FieldDef("m304deddif1c8",FieldDef.FLOAT,6,0);
            m304deddif1c9 = new FieldDef("m304deddif1c9",FieldDef.FLOAT,6,0);
            m304deddif1to = new FieldDef("m304deddif1to",FieldDef.FLOAT,6,0);
            m304deddif2b1 = new FieldDef("m304deddif2b1",FieldDef.FLOAT,6,0);
            m304deddif2c1 = new FieldDef("m304deddif2c1",FieldDef.FLOAT,6,0);
            m304deddif2b2 = new FieldDef("m304deddif2b2",FieldDef.FLOAT,6,0);
            m304deddif2c2 = new FieldDef("m304deddif2c2",FieldDef.FLOAT,6,0);
            m304deddif2b3 = new FieldDef("m304deddif2b3",FieldDef.FLOAT,6,0);
            m304deddif2c3 = new FieldDef("m304deddif2c3",FieldDef.FLOAT,6,0);
            m304deddif2b4 = new FieldDef("m304deddif2b4",FieldDef.FLOAT,6,0);
            m304deddif2c4 = new FieldDef("m304deddif2c4",FieldDef.FLOAT,6,0);
            m304deddif2b5 = new FieldDef("m304deddif2b5",FieldDef.FLOAT,6,0);
            m304deddif2c5 = new FieldDef("m304deddif2c5",FieldDef.FLOAT,6,0);
            m304deddif2b6 = new FieldDef("m304deddif2b6",FieldDef.FLOAT,6,0);
            m304deddif2c6 = new FieldDef("m304deddif2c6",FieldDef.FLOAT,6,0);
            m304deddif2b7 = new FieldDef("m304deddif2b7",FieldDef.FLOAT,6,0);
            m304deddif2c7 = new FieldDef("m304deddif2c7",FieldDef.FLOAT,6,0);
            m304deddif2b8 = new FieldDef("m304deddif2b8",FieldDef.FLOAT,6,0);
            m304deddif2c8 = new FieldDef("m304deddif2c8",FieldDef.FLOAT,6,0);
            m304deddif2c9 = new FieldDef("m304deddif2c9",FieldDef.FLOAT,6,0);
            m304deddif2to = new FieldDef("m304deddif2to",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m304codi,
                m304dominio,
                m304nif,
                m304ejercicio,
                m304periodo,
                m304numpag,
                m304complemen,
                m304pro1codcnae,
                m304pro1impoper,
                m304pro1impopde,
                m304pro1tipo,
                m304pro1pormeno,
                m304pro2codcnae,
                m304pro2impoper,
                m304pro2impopde,
                m304pro2tipo,
                m304pro2pormeno,
                m304pro3codcnae,
                m304pro3impoper,
                m304pro3impopde,
                m304pro3tipo,
                m304pro3pormeno,
                m304pro4codcnae,
                m304pro4impoper,
                m304pro4impopde,
                m304pro4tipo,
                m304pro4pormeno,
                m304pro5codcnae,
                m304pro5impoper,
                m304pro5impopde,
                m304pro5tipo,
                m304pro5pormeno,
                m304deddif1b1,
                m304deddif1c1,
                m304deddif1b2,
                m304deddif1c2,
                m304deddif1b3,
                m304deddif1c3,
                m304deddif1b4,
                m304deddif1c4,
                m304deddif1b5,
                m304deddif1c5,
                m304deddif1b6,
                m304deddif1c6,
                m304deddif1b7,
                m304deddif1c7,
                m304deddif1b8,
                m304deddif1c8,
                m304deddif1c9,
                m304deddif1to,
                m304deddif2b1,
                m304deddif2c1,
                m304deddif2b2,
                m304deddif2c2,
                m304deddif2b3,
                m304deddif2c3,
                m304deddif2b4,
                m304deddif2c4,
                m304deddif2b5,
                m304deddif2c5,
                m304deddif2b6,
                m304deddif2c6,
                m304deddif2b7,
                m304deddif2c7,
                m304deddif2b8,
                m304deddif2c8,
                m304deddif2c9,
                m304deddif2to                
                };
            setColumns(array);
            FieldDef arrayf[] = {m304codi };
            setPrimaryKeys(arrayf);
            m304codi.setAutoIncrementable(true);
            }
        }
        
    public class TabMod102 extends TableDef
        {
        // campos
        public FieldDef m102dominio;
        public FieldDef m102nif;
        public FieldDef m102ejercicio;
        public FieldDef m102periodo;
        public FieldDef m102apellido1;
        public FieldDef m102apellido2;
        public FieldDef m102nombre;
        public FieldDef m102nifc;
        public FieldDef m102apellido1c;
        public FieldDef m102apellido2c;
        public FieldDef m102nombrec;
        public FieldDef m102resultado;
        public FieldDef m102imp1plazo;
        public FieldDef m102imp2plazo;
        public FieldDef m102efectivo;
        public FieldDef m102adeudo;
        public FieldDef m102importe;
        public FieldDef m102entingreso;
        public FieldDef m102ofiingreso;
        public FieldDef m102digiingreso;
        public FieldDef m102ctaingreso;
        public FieldDef m102lugar;
        public FieldDef m102dia;
        public FieldDef m102mes;
        public FieldDef m102anyo;
        public FieldDef m102fecha;
        public FieldDef m102ctaiban;
        public TabMod102(String name)
            {
            super(name);
            m102dominio = new FieldDef("m102dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m102nif = new FieldDef("m102nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m102ejercicio = new FieldDef("m102ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m102periodo = new FieldDef("m102periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m102apellido1 = new FieldDef("m102apellido1",FieldDef.CHAR,40);
            m102apellido2 = new FieldDef("m102apellido2",FieldDef.CHAR,40);
            m102nombre = new FieldDef("m102nombre",FieldDef.CHAR,30);
            m102nifc = new FieldDef("m102nifc",FieldDef.CHAR,15);
            m102apellido1c = new FieldDef("m102apellido1c",FieldDef.CHAR,40);
            m102apellido2c = new FieldDef("m102apellido2c",FieldDef.CHAR,40);
            m102nombrec = new FieldDef("m102nombrec",FieldDef.CHAR,30);
            m102resultado = new FieldDef("m102resultado",FieldDef.FLOAT,6,0);
            m102imp1plazo = new FieldDef("m102imp1plazo",FieldDef.FLOAT,6,0);
            m102imp2plazo = new FieldDef("m102imp2plazo",FieldDef.FLOAT,6,0);
            m102efectivo = new FieldDef("m102efectivo",FieldDef.CHAR,1);
            m102adeudo = new FieldDef("m102adeudo",FieldDef.CHAR,1);
            m102importe = new FieldDef("m102importe",FieldDef.FLOAT,6,0);
            m102entingreso = new FieldDef("m102entingreso",FieldDef.CHAR,4);
            m102ofiingreso = new FieldDef("m102ofiingreso",FieldDef.CHAR,4);
            m102digiingreso = new FieldDef("m102digiingreso",FieldDef.CHAR,2);
            m102ctaingreso = new FieldDef("m102ctaingreso",FieldDef.CHAR,10);
            m102lugar = new FieldDef("m102lugar",FieldDef.CHAR,30);
            m102dia = new FieldDef("m102dia",FieldDef.CHAR,2);
            m102mes = new FieldDef("m102mes",FieldDef.CHAR,10);
            m102anyo = new FieldDef("m102anyo",FieldDef.CHAR,4);
            m102fecha = new FieldDef("m102fecha",FieldDef.DATE);
            m102ctaiban = new FieldDef("m102ctaiban",FieldDef.CHAR,34);
            FieldDef array[] = {
                m102dominio,
                m102nif,
                m102ejercicio,
                m102periodo,
                m102apellido1,
                m102apellido2,
                m102nombre,
                m102nifc,
                m102apellido1c,
                m102apellido2c,
                m102nombrec,
                m102resultado,
                m102imp1plazo,
                m102imp2plazo,
                m102efectivo,
                m102adeudo,
                m102importe,
                m102entingreso,
                m102ofiingreso,
                m102digiingreso,
                m102ctaingreso,
                m102lugar,
                m102dia,
                m102mes,
                m102anyo,
                m102fecha,
                m102ctaiban                
                };
            setColumns(array);
            FieldDef arrayf[] = {m102dominio,m102nif,m102ejercicio,m102periodo };
            setPrimaryKeys(arrayf);
            m102ctaiban.setDescription("2013 Cuenta cliente formato IBAN");
            }
        }
        
    public class TabMod180r extends TableDef
        {
        // campos
        public FieldDef m180rident;
        public FieldDef m180rdominio;
        public FieldDef m180rnif;
        public FieldDef m180rejercicio;
        public FieldDef m180rperiodo;
        public FieldDef m180rnifper;
        public FieldDef m180rnifrepres;
        public FieldDef m180rrazon;
        public FieldDef m180rcodprov;
        public FieldDef m180rmodal;
        public FieldDef m180rimport;
        public FieldDef m180rporreten;
        public FieldDef m180rretening;
        public FieldDef m180rejerdev;
        public FieldDef m180rliscertif;
        public FieldDef m180rsitua;
        public FieldDef m180refcatas;
        public FieldDef m180rtipovia;
        public FieldDef m180rvia;
        public FieldDef m180rtiponum;
        public FieldDef m180rnumcasa;
        public FieldDef m180rcalifnum;
        public FieldDef m180rbloque;
        public FieldDef m180rportal;
        public FieldDef m180rescalera;
        public FieldDef m180rplanta;
        public FieldDef m180rpuerta;
        public FieldDef m180rdatcomp;
        public FieldDef m180rpoblacion;
        public FieldDef m180rmunicipio;
        public FieldDef m180rcodine;
        public FieldDef m180rprovincia;
        public FieldDef m180rcpostal;
        public TabMod180r(String name)
            {
            super(name);
            m180rident = new FieldDef("m180rident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m180rdominio = new FieldDef("m180rdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m180rnif = new FieldDef("m180rnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m180rejercicio = new FieldDef("m180rejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m180rperiodo = new FieldDef("m180rperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m180rnifper = new FieldDef("m180rnifper",FieldDef.CHAR,15);
            m180rnifrepres = new FieldDef("m180rnifrepres",FieldDef.CHAR,15);
            m180rrazon = new FieldDef("m180rrazon",FieldDef.CHAR,40);
            m180rcodprov = new FieldDef("m180rcodprov",FieldDef.INTEGER,0);
            m180rmodal = new FieldDef("m180rmodal",FieldDef.CHAR,1);
            m180rimport = new FieldDef("m180rimport",FieldDef.FLOAT,6,0);
            m180rporreten = new FieldDef("m180rporreten",FieldDef.FLOAT,6,0);
            m180rretening = new FieldDef("m180rretening",FieldDef.FLOAT,6,0);
            m180rejerdev = new FieldDef("m180rejerdev",FieldDef.INTEGER,0);
            m180rliscertif = new FieldDef("m180rliscertif",FieldDef.CHAR,1);
            m180rsitua = new FieldDef("m180rsitua",FieldDef.INTEGER,0);
            m180refcatas = new FieldDef("m180refcatas",FieldDef.CHAR,20);
            m180rtipovia = new FieldDef("m180rtipovia",FieldDef.CHAR,5);
            m180rvia = new FieldDef("m180rvia",FieldDef.CHAR,50);
            m180rtiponum = new FieldDef("m180rtiponum",FieldDef.CHAR,3);
            m180rnumcasa = new FieldDef("m180rnumcasa",FieldDef.CHAR,5);
            m180rcalifnum = new FieldDef("m180rcalifnum",FieldDef.CHAR,3);
            m180rbloque = new FieldDef("m180rbloque",FieldDef.CHAR,3);
            m180rportal = new FieldDef("m180rportal",FieldDef.CHAR,3);
            m180rescalera = new FieldDef("m180rescalera",FieldDef.CHAR,3);
            m180rplanta = new FieldDef("m180rplanta",FieldDef.CHAR,3);
            m180rpuerta = new FieldDef("m180rpuerta",FieldDef.CHAR,3);
            m180rdatcomp = new FieldDef("m180rdatcomp",FieldDef.CHAR,40);
            m180rpoblacion = new FieldDef("m180rpoblacion",FieldDef.CHAR,30);
            m180rmunicipio = new FieldDef("m180rmunicipio",FieldDef.CHAR,30);
            m180rcodine = new FieldDef("m180rcodine",FieldDef.CHAR,5);
            m180rprovincia = new FieldDef("m180rprovincia",FieldDef.CHAR,2);
            m180rcpostal = new FieldDef("m180rcpostal",FieldDef.CHAR,5);
            FieldDef array[] = {
                m180rident,
                m180rdominio,
                m180rnif,
                m180rejercicio,
                m180rperiodo,
                m180rnifper,
                m180rnifrepres,
                m180rrazon,
                m180rcodprov,
                m180rmodal,
                m180rimport,
                m180rporreten,
                m180rretening,
                m180rejerdev,
                m180rliscertif,
                m180rsitua,
                m180refcatas,
                m180rtipovia,
                m180rvia,
                m180rtiponum,
                m180rnumcasa,
                m180rcalifnum,
                m180rbloque,
                m180rportal,
                m180rescalera,
                m180rplanta,
                m180rpuerta,
                m180rdatcomp,
                m180rpoblacion,
                m180rmunicipio,
                m180rcodine,
                m180rprovincia,
                m180rcpostal                
                };
            setColumns(array);
            FieldDef arrayf[] = {m180rident };
            setPrimaryKeys(arrayf);
            m180rident.setAutoIncrementable(true);
            m180rsitua.setDescription("Situacion del inmueble");
            m180refcatas.setDescription("Referencia catastral");
            m180rtipovia.setDescription("Tipo Via");
            m180rvia.setDescription("Via Publica");
            m180rtiponum.setDescription("Tipo numeracion (NUM KM S/N)");
            m180rnumcasa.setDescription("Numero de casa");
            m180rcalifnum.setDescription("Calificador de numero (BIS DUP MOD ANT)");
            m180rbloque.setDescription("Bloque");
            m180rportal.setDescription("Portal");
            m180rescalera.setDescription("Escalera");
            m180rplanta.setDescription("Planta o piso");
            m180rpuerta.setDescription("Puerta");
            m180rdatcomp.setDescription("Complemento datos adicionales  domicilio");
            m180rpoblacion.setDescription("Poblacion / Localidad  (distinta  Municipio)");
            m180rmunicipio.setDescription("Municipio (nombre)");
            m180rcodine.setDescription("Municipio (Codigo INE)");
            m180rprovincia.setDescription("Cod.Provincia Inmueble (01 a 50)");
            m180rcpostal.setDescription("Codigo postal");
            }
        }
        
    public class TabMod115d extends TableDef
        {
        // campos
        public FieldDef m115dident;
        public FieldDef m115ddominio;
        public FieldDef m115dnif;
        public FieldDef m115dejercicio;
        public FieldDef m115dnifper;
        public FieldDef m115dnifrepres;
        public FieldDef m115drazon;
        public FieldDef m115dcodprov;
        public FieldDef m115dmodal;
        public FieldDef m115dejerdev;
        public FieldDef m115dorigen;
        public FieldDef m115dautomatico;
        public FieldDef m115dimport1;
        public FieldDef m115dporreten1;
        public FieldDef m115dretening1;
        public FieldDef m115dimport2;
        public FieldDef m115dporreten2;
        public FieldDef m115dretening2;
        public FieldDef m115dimport3;
        public FieldDef m115dporreten3;
        public FieldDef m115dretening3;
        public FieldDef m115dimport4;
        public FieldDef m115dporreten4;
        public FieldDef m115dretening4;
        public FieldDef m115dimport5;
        public FieldDef m115dporreten5;
        public FieldDef m115dretening5;
        public FieldDef m115dimport6;
        public FieldDef m115dporreten6;
        public FieldDef m115dretening6;
        public FieldDef m115dimport7;
        public FieldDef m115dporreten7;
        public FieldDef m115dretening7;
        public FieldDef m115dimport8;
        public FieldDef m115dporreten8;
        public FieldDef m115dretening8;
        public FieldDef m115dimport9;
        public FieldDef m115dporreten9;
        public FieldDef m115dretening9;
        public FieldDef m115dimport10;
        public FieldDef m115dporreten10;
        public FieldDef m115dretening10;
        public FieldDef m115dimport11;
        public FieldDef m115dporreten11;
        public FieldDef m115dretening11;
        public FieldDef m115dimport12;
        public FieldDef m115dporreten12;
        public FieldDef m115dretening12;
        public FieldDef m115dactividad;
        public FieldDef m115dsitua;
        public FieldDef m115drefcatas;
        public FieldDef m115dtipovia;
        public FieldDef m115dvia;
        public FieldDef m115dtiponum;
        public FieldDef m115dnumcasa;
        public FieldDef m115dcalifnum;
        public FieldDef m115dbloque;
        public FieldDef m115dportal;
        public FieldDef m115descalera;
        public FieldDef m115dplanta;
        public FieldDef m115dpuerta;
        public FieldDef m115ddatcomp;
        public FieldDef m115dpoblacion;
        public FieldDef m115dmunicipio;
        public FieldDef m115dcodine;
        public FieldDef m115dprovincia;
        public FieldDef m115dcpostal;
        public TabMod115d(String name)
            {
            super(name);
            m115dident = new FieldDef("m115dident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m115ddominio = new FieldDef("m115ddominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m115dnif = new FieldDef("m115dnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m115dejercicio = new FieldDef("m115dejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m115dnifper = new FieldDef("m115dnifper",FieldDef.CHAR,15);
            m115dnifrepres = new FieldDef("m115dnifrepres",FieldDef.CHAR,15);
            m115drazon = new FieldDef("m115drazon",FieldDef.CHAR,40);
            m115dcodprov = new FieldDef("m115dcodprov",FieldDef.INTEGER,0);
            m115dmodal = new FieldDef("m115dmodal",FieldDef.CHAR,1);
            m115dejerdev = new FieldDef("m115dejerdev",FieldDef.INTEGER,0);
            m115dorigen = new FieldDef("m115dorigen",FieldDef.CHAR,15);
            m115dautomatico = new FieldDef("m115dautomatico",FieldDef.CHAR,1);
            m115dimport1 = new FieldDef("m115dimport1",FieldDef.FLOAT,6,0);
            m115dporreten1 = new FieldDef("m115dporreten1",FieldDef.FLOAT,6,0);
            m115dretening1 = new FieldDef("m115dretening1",FieldDef.FLOAT,6,0);
            m115dimport2 = new FieldDef("m115dimport2",FieldDef.FLOAT,6,0);
            m115dporreten2 = new FieldDef("m115dporreten2",FieldDef.FLOAT,6,0);
            m115dretening2 = new FieldDef("m115dretening2",FieldDef.FLOAT,6,0);
            m115dimport3 = new FieldDef("m115dimport3",FieldDef.FLOAT,6,0);
            m115dporreten3 = new FieldDef("m115dporreten3",FieldDef.FLOAT,6,0);
            m115dretening3 = new FieldDef("m115dretening3",FieldDef.FLOAT,6,0);
            m115dimport4 = new FieldDef("m115dimport4",FieldDef.FLOAT,6,0);
            m115dporreten4 = new FieldDef("m115dporreten4",FieldDef.FLOAT,6,0);
            m115dretening4 = new FieldDef("m115dretening4",FieldDef.FLOAT,6,0);
            m115dimport5 = new FieldDef("m115dimport5",FieldDef.FLOAT,6,0);
            m115dporreten5 = new FieldDef("m115dporreten5",FieldDef.FLOAT,6,0);
            m115dretening5 = new FieldDef("m115dretening5",FieldDef.FLOAT,6,0);
            m115dimport6 = new FieldDef("m115dimport6",FieldDef.FLOAT,6,0);
            m115dporreten6 = new FieldDef("m115dporreten6",FieldDef.FLOAT,6,0);
            m115dretening6 = new FieldDef("m115dretening6",FieldDef.FLOAT,6,0);
            m115dimport7 = new FieldDef("m115dimport7",FieldDef.FLOAT,6,0);
            m115dporreten7 = new FieldDef("m115dporreten7",FieldDef.FLOAT,6,0);
            m115dretening7 = new FieldDef("m115dretening7",FieldDef.FLOAT,6,0);
            m115dimport8 = new FieldDef("m115dimport8",FieldDef.FLOAT,6,0);
            m115dporreten8 = new FieldDef("m115dporreten8",FieldDef.FLOAT,6,0);
            m115dretening8 = new FieldDef("m115dretening8",FieldDef.FLOAT,6,0);
            m115dimport9 = new FieldDef("m115dimport9",FieldDef.FLOAT,6,0);
            m115dporreten9 = new FieldDef("m115dporreten9",FieldDef.FLOAT,6,0);
            m115dretening9 = new FieldDef("m115dretening9",FieldDef.FLOAT,6,0);
            m115dimport10 = new FieldDef("m115dimport10",FieldDef.FLOAT,6,0);
            m115dporreten10 = new FieldDef("m115dporreten10",FieldDef.FLOAT,6,0);
            m115dretening10 = new FieldDef("m115dretening10",FieldDef.FLOAT,6,0);
            m115dimport11 = new FieldDef("m115dimport11",FieldDef.FLOAT,6,0);
            m115dporreten11 = new FieldDef("m115dporreten11",FieldDef.FLOAT,6,0);
            m115dretening11 = new FieldDef("m115dretening11",FieldDef.FLOAT,6,0);
            m115dimport12 = new FieldDef("m115dimport12",FieldDef.FLOAT,6,0);
            m115dporreten12 = new FieldDef("m115dporreten12",FieldDef.FLOAT,6,0);
            m115dretening12 = new FieldDef("m115dretening12",FieldDef.FLOAT,6,0);
            m115dactividad = new FieldDef("m115dactividad",FieldDef.FLOAT,6,0);
            m115dsitua = new FieldDef("m115dsitua",FieldDef.INTEGER,0);
            m115drefcatas = new FieldDef("m115drefcatas",FieldDef.CHAR,20);
            m115dtipovia = new FieldDef("m115dtipovia",FieldDef.CHAR,5);
            m115dvia = new FieldDef("m115dvia",FieldDef.CHAR,50);
            m115dtiponum = new FieldDef("m115dtiponum",FieldDef.CHAR,3);
            m115dnumcasa = new FieldDef("m115dnumcasa",FieldDef.CHAR,5);
            m115dcalifnum = new FieldDef("m115dcalifnum",FieldDef.CHAR,3);
            m115dbloque = new FieldDef("m115dbloque",FieldDef.CHAR,3);
            m115dportal = new FieldDef("m115dportal",FieldDef.CHAR,3);
            m115descalera = new FieldDef("m115descalera",FieldDef.CHAR,3);
            m115dplanta = new FieldDef("m115dplanta",FieldDef.CHAR,3);
            m115dpuerta = new FieldDef("m115dpuerta",FieldDef.CHAR,3);
            m115ddatcomp = new FieldDef("m115ddatcomp",FieldDef.CHAR,40);
            m115dpoblacion = new FieldDef("m115dpoblacion",FieldDef.CHAR,30);
            m115dmunicipio = new FieldDef("m115dmunicipio",FieldDef.CHAR,30);
            m115dcodine = new FieldDef("m115dcodine",FieldDef.CHAR,5);
            m115dprovincia = new FieldDef("m115dprovincia",FieldDef.CHAR,2);
            m115dcpostal = new FieldDef("m115dcpostal",FieldDef.CHAR,5);
            FieldDef array[] = {
                m115dident,
                m115ddominio,
                m115dnif,
                m115dejercicio,
                m115dnifper,
                m115dnifrepres,
                m115drazon,
                m115dcodprov,
                m115dmodal,
                m115dejerdev,
                m115dorigen,
                m115dautomatico,
                m115dimport1,
                m115dporreten1,
                m115dretening1,
                m115dimport2,
                m115dporreten2,
                m115dretening2,
                m115dimport3,
                m115dporreten3,
                m115dretening3,
                m115dimport4,
                m115dporreten4,
                m115dretening4,
                m115dimport5,
                m115dporreten5,
                m115dretening5,
                m115dimport6,
                m115dporreten6,
                m115dretening6,
                m115dimport7,
                m115dporreten7,
                m115dretening7,
                m115dimport8,
                m115dporreten8,
                m115dretening8,
                m115dimport9,
                m115dporreten9,
                m115dretening9,
                m115dimport10,
                m115dporreten10,
                m115dretening10,
                m115dimport11,
                m115dporreten11,
                m115dretening11,
                m115dimport12,
                m115dporreten12,
                m115dretening12,
                m115dactividad,
                m115dsitua,
                m115drefcatas,
                m115dtipovia,
                m115dvia,
                m115dtiponum,
                m115dnumcasa,
                m115dcalifnum,
                m115dbloque,
                m115dportal,
                m115descalera,
                m115dplanta,
                m115dpuerta,
                m115ddatcomp,
                m115dpoblacion,
                m115dmunicipio,
                m115dcodine,
                m115dprovincia,
                m115dcpostal                
                };
            setColumns(array);
            FieldDef arrayf[] = {m115dident };
            setPrimaryKeys(arrayf);
            m115dident.setAutoIncrementable(true);
            m115dsitua.setDescription("Situacion del inmueble");
            m115drefcatas.setDescription("Referencia catastral");
            m115dtipovia.setDescription("Tipo Via");
            m115dvia.setDescription("Via Publica");
            m115dtiponum.setDescription("Tipo numeracion (NUM KM S/N)");
            m115dnumcasa.setDescription("Numero de casa");
            m115dcalifnum.setDescription("Calificador de numero (BIS DUP MOD ANT)");
            m115dbloque.setDescription("Bloque");
            m115dportal.setDescription("Portal");
            m115descalera.setDescription("Escalera");
            m115dplanta.setDescription("Planta o piso");
            m115dpuerta.setDescription("Puerta");
            m115ddatcomp.setDescription("Complemento datos adicionales  domicilio");
            m115dpoblacion.setDescription("Poblacion / Localidad  (distinta  Municipio)");
            m115dmunicipio.setDescription("Municipio (nombre)");
            m115dcodine.setDescription("Municipio (Codigo INE)");
            m115dprovincia.setDescription("Cod.Provincia Inmueble (01 a 50)");
            m115dcpostal.setDescription("Codigo postal");
            }
        }
        
    public class TabMod3901 extends TableDef
        {
        // campos
        public FieldDef m901dominio;
        public FieldDef m901nif;
        public FieldDef m901ejercicio;
        public FieldDef m901periodo;
        public FieldDef m901deleg;
        public FieldDef m901admon;
        public FieldDef m901codadmon;
        public FieldDef m901apellidos;
        public FieldDef m901nombre;
        public FieldDef m901telefono;
        public FieldDef m901siglas;
        public FieldDef m901calle;
        public FieldDef m901numero;
        public FieldDef m901municipio;
        public FieldDef m901provincia;
        public FieldDef m901cpostal;
        public FieldDef m901devexport;
        public FieldDef m901devjustant;
        public FieldDef m901estactpcpal;
        public FieldDef m901estclapcpal;
        public FieldDef m901estepipcpal;
        public FieldDef m901estactvtra1;
        public FieldDef m901estclaotra1;
        public FieldDef m901estepiotra1;
        public FieldDef m901estactvtra2;
        public FieldDef m901estclaotra2;
        public FieldDef m901estepiotra2;
        public FieldDef m901estactvtra3;
        public FieldDef m901estclaotra3;
        public FieldDef m901estepiotra3;
        public FieldDef m901estactvtra4;
        public FieldDef m901estclaotra4;
        public FieldDef m901estepiotra4;
        public FieldDef m901estactvtra5;
        public FieldDef m901estclaotra5;
        public FieldDef m901estepiotra5;
        public FieldDef m901estdopterc;
        public FieldDef m901estdconjnif;
        public FieldDef m901estdconjrso;
        public FieldDef m901repfisnif;
        public FieldDef m901repfisapell;
        public FieldDef m901repfissigla;
        public FieldDef m901repfiscalle;
        public FieldDef m901repfisnumer;
        public FieldDef m901repfisescal;
        public FieldDef m901repfispiso;
        public FieldDef m901repfispuert;
        public FieldDef m901repfistelef;
        public FieldDef m901repfismuni;
        public FieldDef m901repfisprov;
        public FieldDef m901repfiscpost;
        public FieldDef m901repfechadec;
        public FieldDef m901repjurfirmu;
        public FieldDef m901repjurfirdi;
        public FieldDef m901repjurfirme;
        public FieldDef m901repjurfiran;
        public FieldDef m901repjurapel1;
        public FieldDef m901repjurnif1;
        public FieldDef m901repjurfecp1;
        public FieldDef m901repjurnota1;
        public FieldDef m901repjurapel2;
        public FieldDef m901repjurnif2;
        public FieldDef m901repjurfecp2;
        public FieldDef m901repjurnota2;
        public FieldDef m901repjurapel3;
        public FieldDef m901repjurnif3;
        public FieldDef m901repjurfecp3;
        public FieldDef m901repjurnota3;
        public FieldDef m901fecha;
        public FieldDef m901percont;
        public FieldDef m901telcont;
        public FieldDef m901observa;
        public FieldDef m901letetiq;
        public FieldDef m901modelo;
        public FieldDef m901ape1;
        public FieldDef m901ape2;
        public FieldDef m901codprov;
        public FieldDef m901escalera;
        public FieldDef m901piso;
        public FieldDef m901puerta;
        public FieldDef m901repfiscprov;
        public FieldDef m901devsustitu;
        public FieldDef m901reggrup;
        public FieldDef m901numgrup;
        public FieldDef m901dom;
        public FieldDef m901dep;
        public FieldDef m901espsi;
        public FieldDef m901espno;
        public FieldDef m901entdom;
        public FieldDef m901ultregents;
        public FieldDef m901ultregentn;
        public FieldDef m901acreju;
        public FieldDef m901acrepe;
        public FieldDef m901acreesi;
        public FieldDef m901acreeno;
        public FieldDef m901cajano;
        public FieldDef m901cajasi;
        public FieldDef m901cajadestis;
        public FieldDef m901cajadestin;
        public FieldDef m901decsusacre;
        public FieldDef m901calvolope;
        public TabMod3901(String name)
            {
            super(name);
            m901dominio = new FieldDef("m901dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m901nif = new FieldDef("m901nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m901ejercicio = new FieldDef("m901ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m901periodo = new FieldDef("m901periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m901deleg = new FieldDef("m901deleg",FieldDef.CHAR,30);
            m901admon = new FieldDef("m901admon",FieldDef.CHAR,30);
            m901codadmon = new FieldDef("m901codadmon",FieldDef.INTEGER,0);
            m901apellidos = new FieldDef("m901apellidos",FieldDef.CHAR,30);
            m901nombre = new FieldDef("m901nombre",FieldDef.CHAR,15);
            m901telefono = new FieldDef("m901telefono",FieldDef.CHAR,9);
            m901siglas = new FieldDef("m901siglas",FieldDef.CHAR,2);
            m901calle = new FieldDef("m901calle",FieldDef.CHAR,17);
            m901numero = new FieldDef("m901numero",FieldDef.CHAR,4);
            m901municipio = new FieldDef("m901municipio",FieldDef.CHAR,20);
            m901provincia = new FieldDef("m901provincia",FieldDef.CHAR,15);
            m901cpostal = new FieldDef("m901cpostal",FieldDef.CHAR,5);
            m901devexport = new FieldDef("m901devexport",FieldDef.CHAR,1);
            m901devjustant = new FieldDef("m901devjustant",FieldDef.CHAR,16);
            m901estactpcpal = new FieldDef("m901estactpcpal",FieldDef.CHAR,40);
            m901estclapcpal = new FieldDef("m901estclapcpal",FieldDef.FLOAT,6,0);
            m901estepipcpal = new FieldDef("m901estepipcpal",FieldDef.CHAR,7);
            m901estactvtra1 = new FieldDef("m901estactvtra1",FieldDef.CHAR,40);
            m901estclaotra1 = new FieldDef("m901estclaotra1",FieldDef.FLOAT,6,0);
            m901estepiotra1 = new FieldDef("m901estepiotra1",FieldDef.CHAR,7);
            m901estactvtra2 = new FieldDef("m901estactvtra2",FieldDef.CHAR,40);
            m901estclaotra2 = new FieldDef("m901estclaotra2",FieldDef.FLOAT,6,0);
            m901estepiotra2 = new FieldDef("m901estepiotra2",FieldDef.CHAR,7);
            m901estactvtra3 = new FieldDef("m901estactvtra3",FieldDef.CHAR,40);
            m901estclaotra3 = new FieldDef("m901estclaotra3",FieldDef.FLOAT,6,0);
            m901estepiotra3 = new FieldDef("m901estepiotra3",FieldDef.CHAR,7);
            m901estactvtra4 = new FieldDef("m901estactvtra4",FieldDef.CHAR,40);
            m901estclaotra4 = new FieldDef("m901estclaotra4",FieldDef.FLOAT,6,0);
            m901estepiotra4 = new FieldDef("m901estepiotra4",FieldDef.CHAR,7);
            m901estactvtra5 = new FieldDef("m901estactvtra5",FieldDef.CHAR,40);
            m901estclaotra5 = new FieldDef("m901estclaotra5",FieldDef.FLOAT,6,0);
            m901estepiotra5 = new FieldDef("m901estepiotra5",FieldDef.CHAR,7);
            m901estdopterc = new FieldDef("m901estdopterc",FieldDef.CHAR,1);
            m901estdconjnif = new FieldDef("m901estdconjnif",FieldDef.CHAR,9);
            m901estdconjrso = new FieldDef("m901estdconjrso",FieldDef.CHAR,37);
            m901repfisnif = new FieldDef("m901repfisnif",FieldDef.CHAR,9);
            m901repfisapell = new FieldDef("m901repfisapell",FieldDef.CHAR,37);
            m901repfissigla = new FieldDef("m901repfissigla",FieldDef.CHAR,2);
            m901repfiscalle = new FieldDef("m901repfiscalle",FieldDef.CHAR,17);
            m901repfisnumer = new FieldDef("m901repfisnumer",FieldDef.CHAR,4);
            m901repfisescal = new FieldDef("m901repfisescal",FieldDef.CHAR,2);
            m901repfispiso = new FieldDef("m901repfispiso",FieldDef.CHAR,2);
            m901repfispuert = new FieldDef("m901repfispuert",FieldDef.CHAR,2);
            m901repfistelef = new FieldDef("m901repfistelef",FieldDef.CHAR,9);
            m901repfismuni = new FieldDef("m901repfismuni",FieldDef.CHAR,20);
            m901repfisprov = new FieldDef("m901repfisprov",FieldDef.CHAR,15);
            m901repfiscpost = new FieldDef("m901repfiscpost",FieldDef.CHAR,5);
            m901repfechadec = new FieldDef("m901repfechadec",FieldDef.DATE);
            m901repjurfirmu = new FieldDef("m901repjurfirmu",FieldDef.CHAR,26);
            m901repjurfirdi = new FieldDef("m901repjurfirdi",FieldDef.CHAR,2);
            m901repjurfirme = new FieldDef("m901repjurfirme",FieldDef.CHAR,10);
            m901repjurfiran = new FieldDef("m901repjurfiran",FieldDef.CHAR,4);
            m901repjurapel1 = new FieldDef("m901repjurapel1",FieldDef.CHAR,37);
            m901repjurnif1 = new FieldDef("m901repjurnif1",FieldDef.CHAR,9);
            m901repjurfecp1 = new FieldDef("m901repjurfecp1",FieldDef.DATE);
            m901repjurnota1 = new FieldDef("m901repjurnota1",FieldDef.CHAR,12);
            m901repjurapel2 = new FieldDef("m901repjurapel2",FieldDef.CHAR,37);
            m901repjurnif2 = new FieldDef("m901repjurnif2",FieldDef.CHAR,9);
            m901repjurfecp2 = new FieldDef("m901repjurfecp2",FieldDef.DATE);
            m901repjurnota2 = new FieldDef("m901repjurnota2",FieldDef.CHAR,12);
            m901repjurapel3 = new FieldDef("m901repjurapel3",FieldDef.CHAR,37);
            m901repjurnif3 = new FieldDef("m901repjurnif3",FieldDef.CHAR,9);
            m901repjurfecp3 = new FieldDef("m901repjurfecp3",FieldDef.DATE);
            m901repjurnota3 = new FieldDef("m901repjurnota3",FieldDef.CHAR,12);
            m901fecha = new FieldDef("m901fecha",FieldDef.DATE);
            m901percont = new FieldDef("m901percont",FieldDef.CHAR,100);
            m901telcont = new FieldDef("m901telcont",FieldDef.CHAR,9);
            m901observa = new FieldDef("m901observa",FieldDef.CHAR,350);
            m901letetiq = new FieldDef("m901letetiq",FieldDef.CHAR,4);
            m901modelo = new FieldDef("m901modelo",FieldDef.CHAR,5);
            m901ape1 = new FieldDef("m901ape1",FieldDef.CHAR,30);
            m901ape2 = new FieldDef("m901ape2",FieldDef.CHAR,30);
            m901codprov = new FieldDef("m901codprov",FieldDef.CHAR,2);
            m901escalera = new FieldDef("m901escalera",FieldDef.CHAR,2);
            m901piso = new FieldDef("m901piso",FieldDef.CHAR,2);
            m901puerta = new FieldDef("m901puerta",FieldDef.CHAR,2);
            m901repfiscprov = new FieldDef("m901repfiscprov",FieldDef.INTEGER,0);
            m901devsustitu = new FieldDef("m901devsustitu",FieldDef.CHAR,1);
            m901reggrup = new FieldDef("m901reggrup",FieldDef.CHAR,1);
            m901numgrup = new FieldDef("m901numgrup",FieldDef.CHAR,7);
            m901dom = new FieldDef("m901dom",FieldDef.CHAR,1);
            m901dep = new FieldDef("m901dep",FieldDef.CHAR,1);
            m901espsi = new FieldDef("m901espsi",FieldDef.CHAR,1);
            m901espno = new FieldDef("m901espno",FieldDef.CHAR,1);
            m901entdom = new FieldDef("m901entdom",FieldDef.CHAR,9);
            m901ultregents = new FieldDef("m901ultregents",FieldDef.CHAR,1);
            m901ultregentn = new FieldDef("m901ultregentn",FieldDef.CHAR,1);
            m901acreju = new FieldDef("m901acreju",FieldDef.CHAR,1);
            m901acrepe = new FieldDef("m901acrepe",FieldDef.CHAR,1);
            m901acreesi = new FieldDef("m901acreesi",FieldDef.CHAR,1);
            m901acreeno = new FieldDef("m901acreeno",FieldDef.CHAR,1);
            m901cajano = new FieldDef("m901cajano",FieldDef.CHAR,1);
            m901cajasi = new FieldDef("m901cajasi",FieldDef.CHAR,1);
            m901cajadestis = new FieldDef("m901cajadestis",FieldDef.CHAR,1);
            m901cajadestin = new FieldDef("m901cajadestin",FieldDef.CHAR,1);
            m901decsusacre = new FieldDef("m901decsusacre",FieldDef.CHAR,1);
            m901calvolope = new FieldDef("m901calvolope",FieldDef.INTEGER,0);
            FieldDef array[] = {
                m901dominio,
                m901nif,
                m901ejercicio,
                m901periodo,
                m901deleg,
                m901admon,
                m901codadmon,
                m901apellidos,
                m901nombre,
                m901telefono,
                m901siglas,
                m901calle,
                m901numero,
                m901municipio,
                m901provincia,
                m901cpostal,
                m901devexport,
                m901devjustant,
                m901estactpcpal,
                m901estclapcpal,
                m901estepipcpal,
                m901estactvtra1,
                m901estclaotra1,
                m901estepiotra1,
                m901estactvtra2,
                m901estclaotra2,
                m901estepiotra2,
                m901estactvtra3,
                m901estclaotra3,
                m901estepiotra3,
                m901estactvtra4,
                m901estclaotra4,
                m901estepiotra4,
                m901estactvtra5,
                m901estclaotra5,
                m901estepiotra5,
                m901estdopterc,
                m901estdconjnif,
                m901estdconjrso,
                m901repfisnif,
                m901repfisapell,
                m901repfissigla,
                m901repfiscalle,
                m901repfisnumer,
                m901repfisescal,
                m901repfispiso,
                m901repfispuert,
                m901repfistelef,
                m901repfismuni,
                m901repfisprov,
                m901repfiscpost,
                m901repfechadec,
                m901repjurfirmu,
                m901repjurfirdi,
                m901repjurfirme,
                m901repjurfiran,
                m901repjurapel1,
                m901repjurnif1,
                m901repjurfecp1,
                m901repjurnota1,
                m901repjurapel2,
                m901repjurnif2,
                m901repjurfecp2,
                m901repjurnota2,
                m901repjurapel3,
                m901repjurnif3,
                m901repjurfecp3,
                m901repjurnota3,
                m901fecha,
                m901percont,
                m901telcont,
                m901observa,
                m901letetiq,
                m901modelo,
                m901ape1,
                m901ape2,
                m901codprov,
                m901escalera,
                m901piso,
                m901puerta,
                m901repfiscprov,
                m901devsustitu,
                m901reggrup,
                m901numgrup,
                m901dom,
                m901dep,
                m901espsi,
                m901espno,
                m901entdom,
                m901ultregents,
                m901ultregentn,
                m901acreju,
                m901acrepe,
                m901acreesi,
                m901acreeno,
                m901cajano,
                m901cajasi,
                m901cajadestis,
                m901cajadestin,
                m901decsusacre,
                m901calvolope                
                };
            setColumns(array);
            FieldDef arrayf[] = {m901dominio,m901nif,m901ejercicio,m901periodo };
            setPrimaryKeys(arrayf);
            m901acreesi.setDescription("Si ha sido declarado en concurso de acreedores en este ejercicio");
            m901acreeno.setDescription("No ha sido declarado en concurso de acreedores en este ejercicio");
            m901cajano.setDescription("No ha optado Reg.Esp.Criterio Caja");
            m901cajasi.setDescription("Si ha optado RECC");
            m901cajadestis.setDescription("Si es destinatario de operaciones con RECC");
            m901cajadestin.setDescription("No es destinatario de operaciones con RECC");
            m901decsusacre.setDescription("Declarac.sustitutiva por rectific.cuotas caso concurso acreedores");
            m901calvolope.setDescription("Uso interno: Tipo de calculo vol op");
            }
        }
        
    public class TabMod3902 extends TableDef
        {
        // campos
        public FieldDef m902dominio;
        public FieldDef m902nif;
        public FieldDef m902ejercicio;
        public FieldDef m902periodo;
        public FieldDef m902opgalordin1;
        public FieldDef m902opgalordin2;
        public FieldDef m902opgalordin3;
        public FieldDef m902opgalordin4;
        public FieldDef m902opgalordin5;
        public FieldDef m902opgalordin6;
        public FieldDef m902opgalesbu7;
        public FieldDef m902opgalesbu8;
        public FieldDef m902opgalesbu9;
        public FieldDef m902opgalesbu10;
        public FieldDef m902opgalesbu11;
        public FieldDef m902opgalesbu12;
        public FieldDef m902opgalesav13;
        public FieldDef m902opgalesav14;
        public FieldDef m902opgaladqu21;
        public FieldDef m902opgaladqu22;
        public FieldDef m902opgaladqu23;
        public FieldDef m902opgaladqu24;
        public FieldDef m902opgaladqu25;
        public FieldDef m902opgaladqu26;
        public FieldDef m902opgalsupa27;
        public FieldDef m902opgalsupa28;
        public FieldDef m902opgalmod29;
        public FieldDef m902opgalmod30;
        public FieldDef m902opgalmodq31;
        public FieldDef m902opgalmodq32;
        public FieldDef m902opgaltotbas;
        public FieldDef m902opgaltotcuo;
        public FieldDef m902opgalre35;
        public FieldDef m902opgalre36;
        public FieldDef m902opgalre37;
        public FieldDef m902opgalre38;
        public FieldDef m902opgalre39;
        public FieldDef m902opgalre40;
        public FieldDef m902opgalre41;
        public FieldDef m902opgalre42;
        public FieldDef m902opgalmdre43;
        public FieldDef m902opgalmdre44;
        public FieldDef m902opgalmdrq45;
        public FieldDef m902opgalmdrq46;
        public FieldDef m902opgaltotcur;
        public FieldDef m902opgaldedu48;
        public FieldDef m902opgalde48b1;
        public FieldDef m902opgalde48b2;
        public FieldDef m902opgalde48b3;
        public FieldDef m902opgaldedu49;
        public FieldDef m902opgalde49c1;
        public FieldDef m902opgalde49c2;
        public FieldDef m902opgalde49c3;
        public FieldDef m902opgaldedu50;
        public FieldDef m902opgalde50b1;
        public FieldDef m902opgalde50b2;
        public FieldDef m902opgalde50b3;
        public FieldDef m902opgaldedu51;
        public FieldDef m902opgalde51c1;
        public FieldDef m902opgalde51c2;
        public FieldDef m902opgalde51c3;
        public FieldDef m902opgaldedu52;
        public FieldDef m902opgalde52b1;
        public FieldDef m902opgalde52b2;
        public FieldDef m902opgalde52b3;
        public FieldDef m902opgaldedu53;
        public FieldDef m902opgalde53c1;
        public FieldDef m902opgalde53c2;
        public FieldDef m902opgalde53c3;
        public FieldDef m902opgaldedu54;
        public FieldDef m902opgalde54b1;
        public FieldDef m902opgalde54b2;
        public FieldDef m902opgalde54b3;
        public FieldDef m902opgaldedu55;
        public FieldDef m902opgalde55c1;
        public FieldDef m902opgalde55c2;
        public FieldDef m902opgalde55c3;
        public FieldDef m902opgaldedu56;
        public FieldDef m902opgalde56b1;
        public FieldDef m902opgalde56b2;
        public FieldDef m902opgalde56b3;
        public FieldDef m902opgaldedu57;
        public FieldDef m902opgalde57c1;
        public FieldDef m902opgalde57c2;
        public FieldDef m902opgalde57c3;
        public FieldDef m902opgaldedu58;
        public FieldDef m902opgalde58b1;
        public FieldDef m902opgalde58b2;
        public FieldDef m902opgalde58b3;
        public FieldDef m902opgaldedu59;
        public FieldDef m902opgalde59c1;
        public FieldDef m902opgalde59c2;
        public FieldDef m902opgalde59c3;
        public FieldDef m902opgaldedu60;
        public FieldDef m902opgaldedu61;
        public FieldDef m902opgaldedu62;
        public FieldDef m902opgaldedu63;
        public FieldDef m902opgaldedu64;
        public FieldDef m902opgalresurg;
        public FieldDef m902opsmpac1epi;
        public FieldDef m902opsmpac1mu1;
        public FieldDef m902opsmpac1mi1;
        public FieldDef m902opsmpac1mu2;
        public FieldDef m902opsmpac1mi2;
        public FieldDef m902opsmpac1mu3;
        public FieldDef m902opsmpac1mi3;
        public FieldDef m902opsmpac1mu4;
        public FieldDef m902opsmpac1mi4;
        public FieldDef m902opsmpac1mu5;
        public FieldDef m902opsmpac1mi5;
        public FieldDef m902opsmpac1mu6;
        public FieldDef m902opsmpac1mi6;
        public FieldDef m902opsmpac1mu7;
        public FieldDef m902opsmpac1mi7;
        public FieldDef m902opsmpac1cdc;
        public FieldDef m902opsmpac1cs;
        public FieldDef m902opsmpac1ic;
        public FieldDef m902opsmpac1res;
        public FieldDef m902opsmpac1pcm;
        public FieldDef m902opsmpac1dcs;
        public FieldDef m902opsmpac1cm;
        public FieldDef m902opsmpac1cds;
        public FieldDef m902opsmpac2epi;
        public FieldDef m902opsmpac2mu1;
        public FieldDef m902opsmpac2mi1;
        public FieldDef m902opsmpac2mu2;
        public FieldDef m902opsmpac2mi2;
        public FieldDef m902opsmpac2mu3;
        public FieldDef m902opsmpac2mi3;
        public FieldDef m902opsmpac2mu4;
        public FieldDef m902opsmpac2mi4;
        public FieldDef m902opsmpac2mu5;
        public FieldDef m902opsmpac2mi5;
        public FieldDef m902opsmpac2mu6;
        public FieldDef m902opsmpac2mi6;
        public FieldDef m902opsmpac2mu7;
        public FieldDef m902opsmpac2mi7;
        public FieldDef m902opsmpac2cdc;
        public FieldDef m902opsmpac2cs;
        public FieldDef m902opsmpac2ic;
        public FieldDef m902opsmpac2res;
        public FieldDef m902opsmpac2pcm;
        public FieldDef m902opsmpac2dcs;
        public FieldDef m902opsmpac2cm;
        public FieldDef m902opsmpac2cds;
        public FieldDef m902opgalgr500;
        public FieldDef m902opgalgr501;
        public FieldDef m902opgalgr502;
        public FieldDef m902opgalgr503;
        public FieldDef m902opgalgr504;
        public FieldDef m902opgalgr505;
        public FieldDef m902opgalded512;
        public FieldDef m902opgalded513;
        public FieldDef m902opgalded520;
        public FieldDef m902opgalded521;
        public FieldDef m902opgalpdr522;
        public FieldDef m902opglde506b3;
        public FieldDef m902opglde507b3;
        public FieldDef m902opglde508b3;
        public FieldDef m902opglde509b3;
        public FieldDef m902opglde510b3;
        public FieldDef m902opglde511b3;
        public FieldDef m902opglde514b3;
        public FieldDef m902opglde515b3;
        public FieldDef m902opglde516b3;
        public FieldDef m902opglde517b3;
        public FieldDef m902opglde518b3;
        public FieldDef m902opglde519b3;
        public FieldDef m902opgalord527;
        public FieldDef m902opgalord528;
        public FieldDef m902opgalord529;
        public FieldDef m902opgalord530;
        public FieldDef m902opgalgr531;
        public FieldDef m902opgalgr532;
        public FieldDef m902opgalgr533;
        public FieldDef m902opgalgr534;
        public FieldDef m902opgaleb535;
        public FieldDef m902opgaleb536;
        public FieldDef m902opgaleb537;
        public FieldDef m902opgaleb538;
        public FieldDef m902opgalev539;
        public FieldDef m902opgalev540;
        public FieldDef m902opgaladq541;
        public FieldDef m902opgaladq542;
        public FieldDef m902opgaladq543;
        public FieldDef m902opgaladq544;
        public FieldDef m902opgaladq545;
        public FieldDef m902opgaladq546;
        public FieldDef m902opgaladq547;
        public FieldDef m902opgaladq548;
        public FieldDef m902opgaladq549;
        public FieldDef m902opgaladq550;
        public FieldDef m902opgaladq551;
        public FieldDef m902opgaladq552;
        public FieldDef m902opgaladq553;
        public FieldDef m902opgaladq554;
        public FieldDef m902opgalde48b4;
        public FieldDef m902opgalde48b5;
        public FieldDef m902opgalde49c4;
        public FieldDef m902opgalde49c5;
        public FieldDef m902opglde559b3;
        public FieldDef m902opglde561b3;
        public FieldDef m902opglde560b3;
        public FieldDef m902opglde562b3;
        public FieldDef m902opgalde50b4;
        public FieldDef m902opgalde50b5;
        public FieldDef m902opgalde51c4;
        public FieldDef m902opgalde51c5;
        public FieldDef m902opglde567b3;
        public FieldDef m902opglde569b3;
        public FieldDef m902opglde568b3;
        public FieldDef m902opglde570b3;
        public FieldDef m902opgalde52b4;
        public FieldDef m902opgalde52b5;
        public FieldDef m902opgalde53c4;
        public FieldDef m902opgalde53c5;
        public FieldDef m902opgalde54b4;
        public FieldDef m902opgalde54b5;
        public FieldDef m902opgalde55c4;
        public FieldDef m902opgalde55c5;
        public FieldDef m902opgalde56b4;
        public FieldDef m902opgalde56b5;
        public FieldDef m902opgalde57c4;
        public FieldDef m902opgalde57c5;
        public FieldDef m902opgalde58b4;
        public FieldDef m902opgalde58b5;
        public FieldDef m902opgalde59c4;
        public FieldDef m902opgalde59c5;
        public FieldDef m902opglde597b1;
        public FieldDef m902opglde597b2;
        public FieldDef m902opglde597b4;
        public FieldDef m902opglde597b3;
        public FieldDef m902opglde597b5;
        public FieldDef m902opglde598c1;
        public FieldDef m902opglde598c2;
        public FieldDef m902opglde598c4;
        public FieldDef m902opglde598c3;
        public FieldDef m902opglde598c5;
        public FieldDef m902opglde597;
        public FieldDef m902opglde598;
        public FieldDef m902opgalded639;
        public TabMod3902(String name)
            {
            super(name);
            m902dominio = new FieldDef("m902dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m902nif = new FieldDef("m902nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m902ejercicio = new FieldDef("m902ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m902periodo = new FieldDef("m902periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m902opgalordin1 = new FieldDef("m902opgalordin1",FieldDef.FLOAT,6,0);
            m902opgalordin2 = new FieldDef("m902opgalordin2",FieldDef.FLOAT,6,0);
            m902opgalordin3 = new FieldDef("m902opgalordin3",FieldDef.FLOAT,6,0);
            m902opgalordin4 = new FieldDef("m902opgalordin4",FieldDef.FLOAT,6,0);
            m902opgalordin5 = new FieldDef("m902opgalordin5",FieldDef.FLOAT,6,0);
            m902opgalordin6 = new FieldDef("m902opgalordin6",FieldDef.FLOAT,6,0);
            m902opgalesbu7 = new FieldDef("m902opgalesbu7",FieldDef.FLOAT,6,0);
            m902opgalesbu8 = new FieldDef("m902opgalesbu8",FieldDef.FLOAT,6,0);
            m902opgalesbu9 = new FieldDef("m902opgalesbu9",FieldDef.FLOAT,6,0);
            m902opgalesbu10 = new FieldDef("m902opgalesbu10",FieldDef.FLOAT,6,0);
            m902opgalesbu11 = new FieldDef("m902opgalesbu11",FieldDef.FLOAT,6,0);
            m902opgalesbu12 = new FieldDef("m902opgalesbu12",FieldDef.FLOAT,6,0);
            m902opgalesav13 = new FieldDef("m902opgalesav13",FieldDef.FLOAT,6,0);
            m902opgalesav14 = new FieldDef("m902opgalesav14",FieldDef.FLOAT,6,0);
            m902opgaladqu21 = new FieldDef("m902opgaladqu21",FieldDef.FLOAT,6,0);
            m902opgaladqu22 = new FieldDef("m902opgaladqu22",FieldDef.FLOAT,6,0);
            m902opgaladqu23 = new FieldDef("m902opgaladqu23",FieldDef.FLOAT,6,0);
            m902opgaladqu24 = new FieldDef("m902opgaladqu24",FieldDef.FLOAT,6,0);
            m902opgaladqu25 = new FieldDef("m902opgaladqu25",FieldDef.FLOAT,6,0);
            m902opgaladqu26 = new FieldDef("m902opgaladqu26",FieldDef.FLOAT,6,0);
            m902opgalsupa27 = new FieldDef("m902opgalsupa27",FieldDef.FLOAT,6,0);
            m902opgalsupa28 = new FieldDef("m902opgalsupa28",FieldDef.FLOAT,6,0);
            m902opgalmod29 = new FieldDef("m902opgalmod29",FieldDef.FLOAT,6,0);
            m902opgalmod30 = new FieldDef("m902opgalmod30",FieldDef.FLOAT,6,0);
            m902opgalmodq31 = new FieldDef("m902opgalmodq31",FieldDef.FLOAT,6,0);
            m902opgalmodq32 = new FieldDef("m902opgalmodq32",FieldDef.FLOAT,6,0);
            m902opgaltotbas = new FieldDef("m902opgaltotbas",FieldDef.FLOAT,6,0);
            m902opgaltotcuo = new FieldDef("m902opgaltotcuo",FieldDef.FLOAT,6,0);
            m902opgalre35 = new FieldDef("m902opgalre35",FieldDef.FLOAT,6,0);
            m902opgalre36 = new FieldDef("m902opgalre36",FieldDef.FLOAT,6,0);
            m902opgalre37 = new FieldDef("m902opgalre37",FieldDef.FLOAT,6,0);
            m902opgalre38 = new FieldDef("m902opgalre38",FieldDef.FLOAT,6,0);
            m902opgalre39 = new FieldDef("m902opgalre39",FieldDef.FLOAT,6,0);
            m902opgalre40 = new FieldDef("m902opgalre40",FieldDef.FLOAT,6,0);
            m902opgalre41 = new FieldDef("m902opgalre41",FieldDef.FLOAT,6,0);
            m902opgalre42 = new FieldDef("m902opgalre42",FieldDef.FLOAT,6,0);
            m902opgalmdre43 = new FieldDef("m902opgalmdre43",FieldDef.FLOAT,6,0);
            m902opgalmdre44 = new FieldDef("m902opgalmdre44",FieldDef.FLOAT,6,0);
            m902opgalmdrq45 = new FieldDef("m902opgalmdrq45",FieldDef.FLOAT,6,0);
            m902opgalmdrq46 = new FieldDef("m902opgalmdrq46",FieldDef.FLOAT,6,0);
            m902opgaltotcur = new FieldDef("m902opgaltotcur",FieldDef.FLOAT,6,0);
            m902opgaldedu48 = new FieldDef("m902opgaldedu48",FieldDef.FLOAT,6,0);
            m902opgalde48b1 = new FieldDef("m902opgalde48b1",FieldDef.FLOAT,6,0);
            m902opgalde48b2 = new FieldDef("m902opgalde48b2",FieldDef.FLOAT,6,0);
            m902opgalde48b3 = new FieldDef("m902opgalde48b3",FieldDef.FLOAT,6,0);
            m902opgaldedu49 = new FieldDef("m902opgaldedu49",FieldDef.FLOAT,6,0);
            m902opgalde49c1 = new FieldDef("m902opgalde49c1",FieldDef.FLOAT,6,0);
            m902opgalde49c2 = new FieldDef("m902opgalde49c2",FieldDef.FLOAT,6,0);
            m902opgalde49c3 = new FieldDef("m902opgalde49c3",FieldDef.FLOAT,6,0);
            m902opgaldedu50 = new FieldDef("m902opgaldedu50",FieldDef.FLOAT,6,0);
            m902opgalde50b1 = new FieldDef("m902opgalde50b1",FieldDef.FLOAT,6,0);
            m902opgalde50b2 = new FieldDef("m902opgalde50b2",FieldDef.FLOAT,6,0);
            m902opgalde50b3 = new FieldDef("m902opgalde50b3",FieldDef.FLOAT,6,0);
            m902opgaldedu51 = new FieldDef("m902opgaldedu51",FieldDef.FLOAT,6,0);
            m902opgalde51c1 = new FieldDef("m902opgalde51c1",FieldDef.FLOAT,6,0);
            m902opgalde51c2 = new FieldDef("m902opgalde51c2",FieldDef.FLOAT,6,0);
            m902opgalde51c3 = new FieldDef("m902opgalde51c3",FieldDef.FLOAT,6,0);
            m902opgaldedu52 = new FieldDef("m902opgaldedu52",FieldDef.FLOAT,6,0);
            m902opgalde52b1 = new FieldDef("m902opgalde52b1",FieldDef.FLOAT,6,0);
            m902opgalde52b2 = new FieldDef("m902opgalde52b2",FieldDef.FLOAT,6,0);
            m902opgalde52b3 = new FieldDef("m902opgalde52b3",FieldDef.FLOAT,6,0);
            m902opgaldedu53 = new FieldDef("m902opgaldedu53",FieldDef.FLOAT,6,0);
            m902opgalde53c1 = new FieldDef("m902opgalde53c1",FieldDef.FLOAT,6,0);
            m902opgalde53c2 = new FieldDef("m902opgalde53c2",FieldDef.FLOAT,6,0);
            m902opgalde53c3 = new FieldDef("m902opgalde53c3",FieldDef.FLOAT,6,0);
            m902opgaldedu54 = new FieldDef("m902opgaldedu54",FieldDef.FLOAT,6,0);
            m902opgalde54b1 = new FieldDef("m902opgalde54b1",FieldDef.FLOAT,6,0);
            m902opgalde54b2 = new FieldDef("m902opgalde54b2",FieldDef.FLOAT,6,0);
            m902opgalde54b3 = new FieldDef("m902opgalde54b3",FieldDef.FLOAT,6,0);
            m902opgaldedu55 = new FieldDef("m902opgaldedu55",FieldDef.FLOAT,6,0);
            m902opgalde55c1 = new FieldDef("m902opgalde55c1",FieldDef.FLOAT,6,0);
            m902opgalde55c2 = new FieldDef("m902opgalde55c2",FieldDef.FLOAT,6,0);
            m902opgalde55c3 = new FieldDef("m902opgalde55c3",FieldDef.FLOAT,6,0);
            m902opgaldedu56 = new FieldDef("m902opgaldedu56",FieldDef.FLOAT,6,0);
            m902opgalde56b1 = new FieldDef("m902opgalde56b1",FieldDef.FLOAT,6,0);
            m902opgalde56b2 = new FieldDef("m902opgalde56b2",FieldDef.FLOAT,6,0);
            m902opgalde56b3 = new FieldDef("m902opgalde56b3",FieldDef.FLOAT,6,0);
            m902opgaldedu57 = new FieldDef("m902opgaldedu57",FieldDef.FLOAT,6,0);
            m902opgalde57c1 = new FieldDef("m902opgalde57c1",FieldDef.FLOAT,6,0);
            m902opgalde57c2 = new FieldDef("m902opgalde57c2",FieldDef.FLOAT,6,0);
            m902opgalde57c3 = new FieldDef("m902opgalde57c3",FieldDef.FLOAT,6,0);
            m902opgaldedu58 = new FieldDef("m902opgaldedu58",FieldDef.FLOAT,6,0);
            m902opgalde58b1 = new FieldDef("m902opgalde58b1",FieldDef.FLOAT,6,0);
            m902opgalde58b2 = new FieldDef("m902opgalde58b2",FieldDef.FLOAT,6,0);
            m902opgalde58b3 = new FieldDef("m902opgalde58b3",FieldDef.FLOAT,6,0);
            m902opgaldedu59 = new FieldDef("m902opgaldedu59",FieldDef.FLOAT,6,0);
            m902opgalde59c1 = new FieldDef("m902opgalde59c1",FieldDef.FLOAT,6,0);
            m902opgalde59c2 = new FieldDef("m902opgalde59c2",FieldDef.FLOAT,6,0);
            m902opgalde59c3 = new FieldDef("m902opgalde59c3",FieldDef.FLOAT,6,0);
            m902opgaldedu60 = new FieldDef("m902opgaldedu60",FieldDef.FLOAT,6,0);
            m902opgaldedu61 = new FieldDef("m902opgaldedu61",FieldDef.FLOAT,6,0);
            m902opgaldedu62 = new FieldDef("m902opgaldedu62",FieldDef.FLOAT,6,0);
            m902opgaldedu63 = new FieldDef("m902opgaldedu63",FieldDef.FLOAT,6,0);
            m902opgaldedu64 = new FieldDef("m902opgaldedu64",FieldDef.FLOAT,6,0);
            m902opgalresurg = new FieldDef("m902opgalresurg",FieldDef.FLOAT,6,0);
            m902opsmpac1epi = new FieldDef("m902opsmpac1epi",FieldDef.CHAR,7);
            m902opsmpac1mu1 = new FieldDef("m902opsmpac1mu1",FieldDef.FLOAT,6,0);
            m902opsmpac1mi1 = new FieldDef("m902opsmpac1mi1",FieldDef.FLOAT,6,0);
            m902opsmpac1mu2 = new FieldDef("m902opsmpac1mu2",FieldDef.FLOAT,6,0);
            m902opsmpac1mi2 = new FieldDef("m902opsmpac1mi2",FieldDef.FLOAT,6,0);
            m902opsmpac1mu3 = new FieldDef("m902opsmpac1mu3",FieldDef.FLOAT,6,0);
            m902opsmpac1mi3 = new FieldDef("m902opsmpac1mi3",FieldDef.FLOAT,6,0);
            m902opsmpac1mu4 = new FieldDef("m902opsmpac1mu4",FieldDef.FLOAT,6,0);
            m902opsmpac1mi4 = new FieldDef("m902opsmpac1mi4",FieldDef.FLOAT,6,0);
            m902opsmpac1mu5 = new FieldDef("m902opsmpac1mu5",FieldDef.FLOAT,6,0);
            m902opsmpac1mi5 = new FieldDef("m902opsmpac1mi5",FieldDef.FLOAT,6,0);
            m902opsmpac1mu6 = new FieldDef("m902opsmpac1mu6",FieldDef.FLOAT,6,0);
            m902opsmpac1mi6 = new FieldDef("m902opsmpac1mi6",FieldDef.FLOAT,6,0);
            m902opsmpac1mu7 = new FieldDef("m902opsmpac1mu7",FieldDef.FLOAT,6,0);
            m902opsmpac1mi7 = new FieldDef("m902opsmpac1mi7",FieldDef.FLOAT,6,0);
            m902opsmpac1cdc = new FieldDef("m902opsmpac1cdc",FieldDef.FLOAT,6,0);
            m902opsmpac1cs = new FieldDef("m902opsmpac1cs",FieldDef.FLOAT,6,0);
            m902opsmpac1ic = new FieldDef("m902opsmpac1ic",FieldDef.FLOAT,6,0);
            m902opsmpac1res = new FieldDef("m902opsmpac1res",FieldDef.FLOAT,6,0);
            m902opsmpac1pcm = new FieldDef("m902opsmpac1pcm",FieldDef.FLOAT,6,0);
            m902opsmpac1dcs = new FieldDef("m902opsmpac1dcs",FieldDef.FLOAT,6,0);
            m902opsmpac1cm = new FieldDef("m902opsmpac1cm",FieldDef.FLOAT,6,0);
            m902opsmpac1cds = new FieldDef("m902opsmpac1cds",FieldDef.FLOAT,6,0);
            m902opsmpac2epi = new FieldDef("m902opsmpac2epi",FieldDef.CHAR,7);
            m902opsmpac2mu1 = new FieldDef("m902opsmpac2mu1",FieldDef.FLOAT,6,0);
            m902opsmpac2mi1 = new FieldDef("m902opsmpac2mi1",FieldDef.FLOAT,6,0);
            m902opsmpac2mu2 = new FieldDef("m902opsmpac2mu2",FieldDef.FLOAT,6,0);
            m902opsmpac2mi2 = new FieldDef("m902opsmpac2mi2",FieldDef.FLOAT,6,0);
            m902opsmpac2mu3 = new FieldDef("m902opsmpac2mu3",FieldDef.FLOAT,6,0);
            m902opsmpac2mi3 = new FieldDef("m902opsmpac2mi3",FieldDef.FLOAT,6,0);
            m902opsmpac2mu4 = new FieldDef("m902opsmpac2mu4",FieldDef.FLOAT,6,0);
            m902opsmpac2mi4 = new FieldDef("m902opsmpac2mi4",FieldDef.FLOAT,6,0);
            m902opsmpac2mu5 = new FieldDef("m902opsmpac2mu5",FieldDef.FLOAT,6,0);
            m902opsmpac2mi5 = new FieldDef("m902opsmpac2mi5",FieldDef.FLOAT,6,0);
            m902opsmpac2mu6 = new FieldDef("m902opsmpac2mu6",FieldDef.FLOAT,6,0);
            m902opsmpac2mi6 = new FieldDef("m902opsmpac2mi6",FieldDef.FLOAT,6,0);
            m902opsmpac2mu7 = new FieldDef("m902opsmpac2mu7",FieldDef.FLOAT,6,0);
            m902opsmpac2mi7 = new FieldDef("m902opsmpac2mi7",FieldDef.FLOAT,6,0);
            m902opsmpac2cdc = new FieldDef("m902opsmpac2cdc",FieldDef.FLOAT,6,0);
            m902opsmpac2cs = new FieldDef("m902opsmpac2cs",FieldDef.FLOAT,6,0);
            m902opsmpac2ic = new FieldDef("m902opsmpac2ic",FieldDef.FLOAT,6,0);
            m902opsmpac2res = new FieldDef("m902opsmpac2res",FieldDef.FLOAT,6,0);
            m902opsmpac2pcm = new FieldDef("m902opsmpac2pcm",FieldDef.FLOAT,6,0);
            m902opsmpac2dcs = new FieldDef("m902opsmpac2dcs",FieldDef.FLOAT,6,0);
            m902opsmpac2cm = new FieldDef("m902opsmpac2cm",FieldDef.FLOAT,6,0);
            m902opsmpac2cds = new FieldDef("m902opsmpac2cds",FieldDef.FLOAT,6,0);
            m902opgalgr500 = new FieldDef("m902opgalgr500",FieldDef.FLOAT,6,0);
            m902opgalgr501 = new FieldDef("m902opgalgr501",FieldDef.FLOAT,6,0);
            m902opgalgr502 = new FieldDef("m902opgalgr502",FieldDef.FLOAT,6,0);
            m902opgalgr503 = new FieldDef("m902opgalgr503",FieldDef.FLOAT,6,0);
            m902opgalgr504 = new FieldDef("m902opgalgr504",FieldDef.FLOAT,6,0);
            m902opgalgr505 = new FieldDef("m902opgalgr505",FieldDef.FLOAT,6,0);
            m902opgalded512 = new FieldDef("m902opgalded512",FieldDef.FLOAT,6,0);
            m902opgalded513 = new FieldDef("m902opgalded513",FieldDef.FLOAT,6,0);
            m902opgalded520 = new FieldDef("m902opgalded520",FieldDef.FLOAT,6,0);
            m902opgalded521 = new FieldDef("m902opgalded521",FieldDef.FLOAT,6,0);
            m902opgalpdr522 = new FieldDef("m902opgalpdr522",FieldDef.FLOAT,6,0);
            m902opglde506b3 = new FieldDef("m902opglde506b3",FieldDef.FLOAT,6,0);
            m902opglde507b3 = new FieldDef("m902opglde507b3",FieldDef.FLOAT,6,0);
            m902opglde508b3 = new FieldDef("m902opglde508b3",FieldDef.FLOAT,6,0);
            m902opglde509b3 = new FieldDef("m902opglde509b3",FieldDef.FLOAT,6,0);
            m902opglde510b3 = new FieldDef("m902opglde510b3",FieldDef.FLOAT,6,0);
            m902opglde511b3 = new FieldDef("m902opglde511b3",FieldDef.FLOAT,6,0);
            m902opglde514b3 = new FieldDef("m902opglde514b3",FieldDef.FLOAT,6,0);
            m902opglde515b3 = new FieldDef("m902opglde515b3",FieldDef.FLOAT,6,0);
            m902opglde516b3 = new FieldDef("m902opglde516b3",FieldDef.FLOAT,6,0);
            m902opglde517b3 = new FieldDef("m902opglde517b3",FieldDef.FLOAT,6,0);
            m902opglde518b3 = new FieldDef("m902opglde518b3",FieldDef.FLOAT,6,0);
            m902opglde519b3 = new FieldDef("m902opglde519b3",FieldDef.FLOAT,6,0);
            m902opgalord527 = new FieldDef("m902opgalord527",FieldDef.FLOAT,6,0);
            m902opgalord528 = new FieldDef("m902opgalord528",FieldDef.FLOAT,6,0);
            m902opgalord529 = new FieldDef("m902opgalord529",FieldDef.FLOAT,6,0);
            m902opgalord530 = new FieldDef("m902opgalord530",FieldDef.FLOAT,6,0);
            m902opgalgr531 = new FieldDef("m902opgalgr531",FieldDef.FLOAT,6,0);
            m902opgalgr532 = new FieldDef("m902opgalgr532",FieldDef.FLOAT,6,0);
            m902opgalgr533 = new FieldDef("m902opgalgr533",FieldDef.FLOAT,6,0);
            m902opgalgr534 = new FieldDef("m902opgalgr534",FieldDef.FLOAT,6,0);
            m902opgaleb535 = new FieldDef("m902opgaleb535",FieldDef.FLOAT,6,0);
            m902opgaleb536 = new FieldDef("m902opgaleb536",FieldDef.FLOAT,6,0);
            m902opgaleb537 = new FieldDef("m902opgaleb537",FieldDef.FLOAT,6,0);
            m902opgaleb538 = new FieldDef("m902opgaleb538",FieldDef.FLOAT,6,0);
            m902opgalev539 = new FieldDef("m902opgalev539",FieldDef.FLOAT,6,0);
            m902opgalev540 = new FieldDef("m902opgalev540",FieldDef.FLOAT,6,0);
            m902opgaladq541 = new FieldDef("m902opgaladq541",FieldDef.FLOAT,6,0);
            m902opgaladq542 = new FieldDef("m902opgaladq542",FieldDef.FLOAT,6,0);
            m902opgaladq543 = new FieldDef("m902opgaladq543",FieldDef.FLOAT,6,0);
            m902opgaladq544 = new FieldDef("m902opgaladq544",FieldDef.FLOAT,6,0);
            m902opgaladq545 = new FieldDef("m902opgaladq545",FieldDef.FLOAT,6,0);
            m902opgaladq546 = new FieldDef("m902opgaladq546",FieldDef.FLOAT,6,0);
            m902opgaladq547 = new FieldDef("m902opgaladq547",FieldDef.FLOAT,6,0);
            m902opgaladq548 = new FieldDef("m902opgaladq548",FieldDef.FLOAT,6,0);
            m902opgaladq549 = new FieldDef("m902opgaladq549",FieldDef.FLOAT,6,0);
            m902opgaladq550 = new FieldDef("m902opgaladq550",FieldDef.FLOAT,6,0);
            m902opgaladq551 = new FieldDef("m902opgaladq551",FieldDef.FLOAT,6,0);
            m902opgaladq552 = new FieldDef("m902opgaladq552",FieldDef.FLOAT,6,0);
            m902opgaladq553 = new FieldDef("m902opgaladq553",FieldDef.FLOAT,6,0);
            m902opgaladq554 = new FieldDef("m902opgaladq554",FieldDef.FLOAT,6,0);
            m902opgalde48b4 = new FieldDef("m902opgalde48b4",FieldDef.FLOAT,6,0);
            m902opgalde48b5 = new FieldDef("m902opgalde48b5",FieldDef.FLOAT,6,0);
            m902opgalde49c4 = new FieldDef("m902opgalde49c4",FieldDef.FLOAT,6,0);
            m902opgalde49c5 = new FieldDef("m902opgalde49c5",FieldDef.FLOAT,6,0);
            m902opglde559b3 = new FieldDef("m902opglde559b3",FieldDef.FLOAT,6,0);
            m902opglde561b3 = new FieldDef("m902opglde561b3",FieldDef.FLOAT,6,0);
            m902opglde560b3 = new FieldDef("m902opglde560b3",FieldDef.FLOAT,6,0);
            m902opglde562b3 = new FieldDef("m902opglde562b3",FieldDef.FLOAT,6,0);
            m902opgalde50b4 = new FieldDef("m902opgalde50b4",FieldDef.FLOAT,6,0);
            m902opgalde50b5 = new FieldDef("m902opgalde50b5",FieldDef.FLOAT,6,0);
            m902opgalde51c4 = new FieldDef("m902opgalde51c4",FieldDef.FLOAT,6,0);
            m902opgalde51c5 = new FieldDef("m902opgalde51c5",FieldDef.FLOAT,6,0);
            m902opglde567b3 = new FieldDef("m902opglde567b3",FieldDef.FLOAT,6,0);
            m902opglde569b3 = new FieldDef("m902opglde569b3",FieldDef.FLOAT,6,0);
            m902opglde568b3 = new FieldDef("m902opglde568b3",FieldDef.FLOAT,6,0);
            m902opglde570b3 = new FieldDef("m902opglde570b3",FieldDef.FLOAT,6,0);
            m902opgalde52b4 = new FieldDef("m902opgalde52b4",FieldDef.FLOAT,6,0);
            m902opgalde52b5 = new FieldDef("m902opgalde52b5",FieldDef.FLOAT,6,0);
            m902opgalde53c4 = new FieldDef("m902opgalde53c4",FieldDef.FLOAT,6,0);
            m902opgalde53c5 = new FieldDef("m902opgalde53c5",FieldDef.FLOAT,6,0);
            m902opgalde54b4 = new FieldDef("m902opgalde54b4",FieldDef.FLOAT,6,0);
            m902opgalde54b5 = new FieldDef("m902opgalde54b5",FieldDef.FLOAT,6,0);
            m902opgalde55c4 = new FieldDef("m902opgalde55c4",FieldDef.FLOAT,6,0);
            m902opgalde55c5 = new FieldDef("m902opgalde55c5",FieldDef.FLOAT,6,0);
            m902opgalde56b4 = new FieldDef("m902opgalde56b4",FieldDef.FLOAT,6,0);
            m902opgalde56b5 = new FieldDef("m902opgalde56b5",FieldDef.FLOAT,6,0);
            m902opgalde57c4 = new FieldDef("m902opgalde57c4",FieldDef.FLOAT,6,0);
            m902opgalde57c5 = new FieldDef("m902opgalde57c5",FieldDef.FLOAT,6,0);
            m902opgalde58b4 = new FieldDef("m902opgalde58b4",FieldDef.FLOAT,6,0);
            m902opgalde58b5 = new FieldDef("m902opgalde58b5",FieldDef.FLOAT,6,0);
            m902opgalde59c4 = new FieldDef("m902opgalde59c4",FieldDef.FLOAT,6,0);
            m902opgalde59c5 = new FieldDef("m902opgalde59c5",FieldDef.FLOAT,6,0);
            m902opglde597b1 = new FieldDef("m902opglde597b1",FieldDef.FLOAT,6,0);
            m902opglde597b2 = new FieldDef("m902opglde597b2",FieldDef.FLOAT,6,0);
            m902opglde597b4 = new FieldDef("m902opglde597b4",FieldDef.FLOAT,6,0);
            m902opglde597b3 = new FieldDef("m902opglde597b3",FieldDef.FLOAT,6,0);
            m902opglde597b5 = new FieldDef("m902opglde597b5",FieldDef.FLOAT,6,0);
            m902opglde598c1 = new FieldDef("m902opglde598c1",FieldDef.FLOAT,6,0);
            m902opglde598c2 = new FieldDef("m902opglde598c2",FieldDef.FLOAT,6,0);
            m902opglde598c4 = new FieldDef("m902opglde598c4",FieldDef.FLOAT,6,0);
            m902opglde598c3 = new FieldDef("m902opglde598c3",FieldDef.FLOAT,6,0);
            m902opglde598c5 = new FieldDef("m902opglde598c5",FieldDef.FLOAT,6,0);
            m902opglde597 = new FieldDef("m902opglde597",FieldDef.FLOAT,6,0);
            m902opglde598 = new FieldDef("m902opglde598",FieldDef.FLOAT,6,0);
            m902opgalded639 = new FieldDef("m902opgalded639",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m902dominio,
                m902nif,
                m902ejercicio,
                m902periodo,
                m902opgalordin1,
                m902opgalordin2,
                m902opgalordin3,
                m902opgalordin4,
                m902opgalordin5,
                m902opgalordin6,
                m902opgalesbu7,
                m902opgalesbu8,
                m902opgalesbu9,
                m902opgalesbu10,
                m902opgalesbu11,
                m902opgalesbu12,
                m902opgalesav13,
                m902opgalesav14,
                m902opgaladqu21,
                m902opgaladqu22,
                m902opgaladqu23,
                m902opgaladqu24,
                m902opgaladqu25,
                m902opgaladqu26,
                m902opgalsupa27,
                m902opgalsupa28,
                m902opgalmod29,
                m902opgalmod30,
                m902opgalmodq31,
                m902opgalmodq32,
                m902opgaltotbas,
                m902opgaltotcuo,
                m902opgalre35,
                m902opgalre36,
                m902opgalre37,
                m902opgalre38,
                m902opgalre39,
                m902opgalre40,
                m902opgalre41,
                m902opgalre42,
                m902opgalmdre43,
                m902opgalmdre44,
                m902opgalmdrq45,
                m902opgalmdrq46,
                m902opgaltotcur,
                m902opgaldedu48,
                m902opgalde48b1,
                m902opgalde48b2,
                m902opgalde48b3,
                m902opgaldedu49,
                m902opgalde49c1,
                m902opgalde49c2,
                m902opgalde49c3,
                m902opgaldedu50,
                m902opgalde50b1,
                m902opgalde50b2,
                m902opgalde50b3,
                m902opgaldedu51,
                m902opgalde51c1,
                m902opgalde51c2,
                m902opgalde51c3,
                m902opgaldedu52,
                m902opgalde52b1,
                m902opgalde52b2,
                m902opgalde52b3,
                m902opgaldedu53,
                m902opgalde53c1,
                m902opgalde53c2,
                m902opgalde53c3,
                m902opgaldedu54,
                m902opgalde54b1,
                m902opgalde54b2,
                m902opgalde54b3,
                m902opgaldedu55,
                m902opgalde55c1,
                m902opgalde55c2,
                m902opgalde55c3,
                m902opgaldedu56,
                m902opgalde56b1,
                m902opgalde56b2,
                m902opgalde56b3,
                m902opgaldedu57,
                m902opgalde57c1,
                m902opgalde57c2,
                m902opgalde57c3,
                m902opgaldedu58,
                m902opgalde58b1,
                m902opgalde58b2,
                m902opgalde58b3,
                m902opgaldedu59,
                m902opgalde59c1,
                m902opgalde59c2,
                m902opgalde59c3,
                m902opgaldedu60,
                m902opgaldedu61,
                m902opgaldedu62,
                m902opgaldedu63,
                m902opgaldedu64,
                m902opgalresurg,
                m902opsmpac1epi,
                m902opsmpac1mu1,
                m902opsmpac1mi1,
                m902opsmpac1mu2,
                m902opsmpac1mi2,
                m902opsmpac1mu3,
                m902opsmpac1mi3,
                m902opsmpac1mu4,
                m902opsmpac1mi4,
                m902opsmpac1mu5,
                m902opsmpac1mi5,
                m902opsmpac1mu6,
                m902opsmpac1mi6,
                m902opsmpac1mu7,
                m902opsmpac1mi7,
                m902opsmpac1cdc,
                m902opsmpac1cs,
                m902opsmpac1ic,
                m902opsmpac1res,
                m902opsmpac1pcm,
                m902opsmpac1dcs,
                m902opsmpac1cm,
                m902opsmpac1cds,
                m902opsmpac2epi,
                m902opsmpac2mu1,
                m902opsmpac2mi1,
                m902opsmpac2mu2,
                m902opsmpac2mi2,
                m902opsmpac2mu3,
                m902opsmpac2mi3,
                m902opsmpac2mu4,
                m902opsmpac2mi4,
                m902opsmpac2mu5,
                m902opsmpac2mi5,
                m902opsmpac2mu6,
                m902opsmpac2mi6,
                m902opsmpac2mu7,
                m902opsmpac2mi7,
                m902opsmpac2cdc,
                m902opsmpac2cs,
                m902opsmpac2ic,
                m902opsmpac2res,
                m902opsmpac2pcm,
                m902opsmpac2dcs,
                m902opsmpac2cm,
                m902opsmpac2cds,
                m902opgalgr500,
                m902opgalgr501,
                m902opgalgr502,
                m902opgalgr503,
                m902opgalgr504,
                m902opgalgr505,
                m902opgalded512,
                m902opgalded513,
                m902opgalded520,
                m902opgalded521,
                m902opgalpdr522,
                m902opglde506b3,
                m902opglde507b3,
                m902opglde508b3,
                m902opglde509b3,
                m902opglde510b3,
                m902opglde511b3,
                m902opglde514b3,
                m902opglde515b3,
                m902opglde516b3,
                m902opglde517b3,
                m902opglde518b3,
                m902opglde519b3,
                m902opgalord527,
                m902opgalord528,
                m902opgalord529,
                m902opgalord530,
                m902opgalgr531,
                m902opgalgr532,
                m902opgalgr533,
                m902opgalgr534,
                m902opgaleb535,
                m902opgaleb536,
                m902opgaleb537,
                m902opgaleb538,
                m902opgalev539,
                m902opgalev540,
                m902opgaladq541,
                m902opgaladq542,
                m902opgaladq543,
                m902opgaladq544,
                m902opgaladq545,
                m902opgaladq546,
                m902opgaladq547,
                m902opgaladq548,
                m902opgaladq549,
                m902opgaladq550,
                m902opgaladq551,
                m902opgaladq552,
                m902opgaladq553,
                m902opgaladq554,
                m902opgalde48b4,
                m902opgalde48b5,
                m902opgalde49c4,
                m902opgalde49c5,
                m902opglde559b3,
                m902opglde561b3,
                m902opglde560b3,
                m902opglde562b3,
                m902opgalde50b4,
                m902opgalde50b5,
                m902opgalde51c4,
                m902opgalde51c5,
                m902opglde567b3,
                m902opglde569b3,
                m902opglde568b3,
                m902opglde570b3,
                m902opgalde52b4,
                m902opgalde52b5,
                m902opgalde53c4,
                m902opgalde53c5,
                m902opgalde54b4,
                m902opgalde54b5,
                m902opgalde55c4,
                m902opgalde55c5,
                m902opgalde56b4,
                m902opgalde56b5,
                m902opgalde57c4,
                m902opgalde57c5,
                m902opgalde58b4,
                m902opgalde58b5,
                m902opgalde59c4,
                m902opgalde59c5,
                m902opglde597b1,
                m902opglde597b2,
                m902opglde597b4,
                m902opglde597b3,
                m902opglde597b5,
                m902opglde598c1,
                m902opglde598c2,
                m902opglde598c4,
                m902opglde598c3,
                m902opglde598c5,
                m902opglde597,
                m902opglde598,
                m902opgalded639                
                };
            setColumns(array);
            FieldDef arrayf[] = {m902dominio,m902nif,m902ejercicio,m902periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod3902b extends TableDef
        {
        // campos
        public FieldDef m9b2dominio;
        public FieldDef m9b2nif;
        public FieldDef m9b2ejercicio;
        public FieldDef m9b2periodo;
        public FieldDef m9b2opgalordb10;
        public FieldDef m9b2opgalordc10;
        public FieldDef m9b2opgalordb21;
        public FieldDef m9b2opgalordc21;
        public FieldDef m9b2opgalgrb10;
        public FieldDef m9b2opgalgrc10;
        public FieldDef m9b2opgalgrb21;
        public FieldDef m9b2opgalgrc21;
        public FieldDef m9b2opgalebb10;
        public FieldDef m9b2opgalebc10;
        public FieldDef m9b2opgalebb21;
        public FieldDef m9b2opgalebc21;
        public FieldDef m9b2opgalavb21;
        public FieldDef m9b2opgalavc21;
        public FieldDef m9b2opgaladqb10;
        public FieldDef m9b2opgaladqc10;
        public FieldDef m9b2opgaladqb21;
        public FieldDef m9b2opgaladqc21;
        public FieldDef m9b2opgaladsb10;
        public FieldDef m9b2opgaladsc10;
        public FieldDef m9b2opgaladsb21;
        public FieldDef m9b2opgaladsc21;
        public FieldDef m9b2opgalreb14;
        public FieldDef m9b2opgalrec14;
        public FieldDef m9b2opgalreb52;
        public FieldDef m9b2opgalrec52;
        public FieldDef m9b2opglde48b10;
        public FieldDef m9b2opglde49c10;
        public FieldDef m9b2opglde48b21;
        public FieldDef m9b2opglde49c21;
        public FieldDef m9b2opgde561b10;
        public FieldDef m9b2opgde562c10;
        public FieldDef m9b2opgde561b21;
        public FieldDef m9b2opgde562c21;
        public FieldDef m9b2opglde50b10;
        public FieldDef m9b2opglde51c10;
        public FieldDef m9b2opglde50b21;
        public FieldDef m9b2opglde51c21;
        public FieldDef m9b2opgde569b10;
        public FieldDef m9b2opgde570c10;
        public FieldDef m9b2opgde569b21;
        public FieldDef m9b2opgde570c21;
        public FieldDef m9b2opglde52b10;
        public FieldDef m9b2opglde53c10;
        public FieldDef m9b2opglde52b21;
        public FieldDef m9b2opglde53c21;
        public FieldDef m9b2opgade54b10;
        public FieldDef m9b2opgade55c10;
        public FieldDef m9b2opgade54b21;
        public FieldDef m9b2opgade55c21;
        public FieldDef m9b2opglde56b10;
        public FieldDef m9b2opglde57c10;
        public FieldDef m9b2opglde56b21;
        public FieldDef m9b2opglde57c21;
        public FieldDef m9b2opglde58b10;
        public FieldDef m9b2opglde59c10;
        public FieldDef m9b2opglde58b21;
        public FieldDef m9b2opglde59c21;
        public FieldDef m9b2opgde597b10;
        public FieldDef m9b2opgde598c10;
        public FieldDef m9b2opgde597b21;
        public FieldDef m9b2opgde598c21;
        public FieldDef m9b2opgalcaja1;
        public FieldDef m9b2opgalcaja2;
        public FieldDef m9b2opgalcaja3;
        public FieldDef m9b2opgalcaja4;
        public FieldDef m9b2opgalcaja5;
        public FieldDef m9b2opgalcaja6;
        public FieldDef m9b2opgalded646;
        public FieldDef m9b2opgalded647;
        public FieldDef m9b2opgalmodboi;
        public FieldDef m9b2opgalmodqoi;
        public FieldDef m9b2a1lorca;
        public FieldDef m9b2a2lorca;
        public FieldDef m9b2opgalded660;
        public FieldDef m9b2opgalded661;
        public TabMod3902b(String name)
            {
            super(name);
            m9b2dominio = new FieldDef("m9b2dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m9b2nif = new FieldDef("m9b2nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m9b2ejercicio = new FieldDef("m9b2ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m9b2periodo = new FieldDef("m9b2periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m9b2opgalordb10 = new FieldDef("m9b2opgalordb10",FieldDef.FLOAT,6,0);
            m9b2opgalordc10 = new FieldDef("m9b2opgalordc10",FieldDef.FLOAT,6,0);
            m9b2opgalordb21 = new FieldDef("m9b2opgalordb21",FieldDef.FLOAT,6,0);
            m9b2opgalordc21 = new FieldDef("m9b2opgalordc21",FieldDef.FLOAT,6,0);
            m9b2opgalgrb10 = new FieldDef("m9b2opgalgrb10",FieldDef.FLOAT,6,0);
            m9b2opgalgrc10 = new FieldDef("m9b2opgalgrc10",FieldDef.FLOAT,6,0);
            m9b2opgalgrb21 = new FieldDef("m9b2opgalgrb21",FieldDef.FLOAT,6,0);
            m9b2opgalgrc21 = new FieldDef("m9b2opgalgrc21",FieldDef.FLOAT,6,0);
            m9b2opgalebb10 = new FieldDef("m9b2opgalebb10",FieldDef.FLOAT,6,0);
            m9b2opgalebc10 = new FieldDef("m9b2opgalebc10",FieldDef.FLOAT,6,0);
            m9b2opgalebb21 = new FieldDef("m9b2opgalebb21",FieldDef.FLOAT,6,0);
            m9b2opgalebc21 = new FieldDef("m9b2opgalebc21",FieldDef.FLOAT,6,0);
            m9b2opgalavb21 = new FieldDef("m9b2opgalavb21",FieldDef.FLOAT,6,0);
            m9b2opgalavc21 = new FieldDef("m9b2opgalavc21",FieldDef.FLOAT,6,0);
            m9b2opgaladqb10 = new FieldDef("m9b2opgaladqb10",FieldDef.FLOAT,6,0);
            m9b2opgaladqc10 = new FieldDef("m9b2opgaladqc10",FieldDef.FLOAT,6,0);
            m9b2opgaladqb21 = new FieldDef("m9b2opgaladqb21",FieldDef.FLOAT,6,0);
            m9b2opgaladqc21 = new FieldDef("m9b2opgaladqc21",FieldDef.FLOAT,6,0);
            m9b2opgaladsb10 = new FieldDef("m9b2opgaladsb10",FieldDef.FLOAT,6,0);
            m9b2opgaladsc10 = new FieldDef("m9b2opgaladsc10",FieldDef.FLOAT,6,0);
            m9b2opgaladsb21 = new FieldDef("m9b2opgaladsb21",FieldDef.FLOAT,6,0);
            m9b2opgaladsc21 = new FieldDef("m9b2opgaladsc21",FieldDef.FLOAT,6,0);
            m9b2opgalreb14 = new FieldDef("m9b2opgalreb14",FieldDef.FLOAT,6,0);
            m9b2opgalrec14 = new FieldDef("m9b2opgalrec14",FieldDef.FLOAT,6,0);
            m9b2opgalreb52 = new FieldDef("m9b2opgalreb52",FieldDef.FLOAT,6,0);
            m9b2opgalrec52 = new FieldDef("m9b2opgalrec52",FieldDef.FLOAT,6,0);
            m9b2opglde48b10 = new FieldDef("m9b2opglde48b10",FieldDef.FLOAT,6,0);
            m9b2opglde49c10 = new FieldDef("m9b2opglde49c10",FieldDef.FLOAT,6,0);
            m9b2opglde48b21 = new FieldDef("m9b2opglde48b21",FieldDef.FLOAT,6,0);
            m9b2opglde49c21 = new FieldDef("m9b2opglde49c21",FieldDef.FLOAT,6,0);
            m9b2opgde561b10 = new FieldDef("m9b2opgde561b10",FieldDef.FLOAT,6,0);
            m9b2opgde562c10 = new FieldDef("m9b2opgde562c10",FieldDef.FLOAT,6,0);
            m9b2opgde561b21 = new FieldDef("m9b2opgde561b21",FieldDef.FLOAT,6,0);
            m9b2opgde562c21 = new FieldDef("m9b2opgde562c21",FieldDef.FLOAT,6,0);
            m9b2opglde50b10 = new FieldDef("m9b2opglde50b10",FieldDef.FLOAT,6,0);
            m9b2opglde51c10 = new FieldDef("m9b2opglde51c10",FieldDef.FLOAT,6,0);
            m9b2opglde50b21 = new FieldDef("m9b2opglde50b21",FieldDef.FLOAT,6,0);
            m9b2opglde51c21 = new FieldDef("m9b2opglde51c21",FieldDef.FLOAT,6,0);
            m9b2opgde569b10 = new FieldDef("m9b2opgde569b10",FieldDef.FLOAT,6,0);
            m9b2opgde570c10 = new FieldDef("m9b2opgde570c10",FieldDef.FLOAT,6,0);
            m9b2opgde569b21 = new FieldDef("m9b2opgde569b21",FieldDef.FLOAT,6,0);
            m9b2opgde570c21 = new FieldDef("m9b2opgde570c21",FieldDef.FLOAT,6,0);
            m9b2opglde52b10 = new FieldDef("m9b2opglde52b10",FieldDef.FLOAT,6,0);
            m9b2opglde53c10 = new FieldDef("m9b2opglde53c10",FieldDef.FLOAT,6,0);
            m9b2opglde52b21 = new FieldDef("m9b2opglde52b21",FieldDef.FLOAT,6,0);
            m9b2opglde53c21 = new FieldDef("m9b2opglde53c21",FieldDef.FLOAT,6,0);
            m9b2opgade54b10 = new FieldDef("m9b2opgade54b10",FieldDef.FLOAT,6,0);
            m9b2opgade55c10 = new FieldDef("m9b2opgade55c10",FieldDef.FLOAT,6,0);
            m9b2opgade54b21 = new FieldDef("m9b2opgade54b21",FieldDef.FLOAT,6,0);
            m9b2opgade55c21 = new FieldDef("m9b2opgade55c21",FieldDef.FLOAT,6,0);
            m9b2opglde56b10 = new FieldDef("m9b2opglde56b10",FieldDef.FLOAT,6,0);
            m9b2opglde57c10 = new FieldDef("m9b2opglde57c10",FieldDef.FLOAT,6,0);
            m9b2opglde56b21 = new FieldDef("m9b2opglde56b21",FieldDef.FLOAT,6,0);
            m9b2opglde57c21 = new FieldDef("m9b2opglde57c21",FieldDef.FLOAT,6,0);
            m9b2opglde58b10 = new FieldDef("m9b2opglde58b10",FieldDef.FLOAT,6,0);
            m9b2opglde59c10 = new FieldDef("m9b2opglde59c10",FieldDef.FLOAT,6,0);
            m9b2opglde58b21 = new FieldDef("m9b2opglde58b21",FieldDef.FLOAT,6,0);
            m9b2opglde59c21 = new FieldDef("m9b2opglde59c21",FieldDef.FLOAT,6,0);
            m9b2opgde597b10 = new FieldDef("m9b2opgde597b10",FieldDef.FLOAT,6,0);
            m9b2opgde598c10 = new FieldDef("m9b2opgde598c10",FieldDef.FLOAT,6,0);
            m9b2opgde597b21 = new FieldDef("m9b2opgde597b21",FieldDef.FLOAT,6,0);
            m9b2opgde598c21 = new FieldDef("m9b2opgde598c21",FieldDef.FLOAT,6,0);
            m9b2opgalcaja1 = new FieldDef("m9b2opgalcaja1",FieldDef.FLOAT,6,0);
            m9b2opgalcaja2 = new FieldDef("m9b2opgalcaja2",FieldDef.FLOAT,6,0);
            m9b2opgalcaja3 = new FieldDef("m9b2opgalcaja3",FieldDef.FLOAT,6,0);
            m9b2opgalcaja4 = new FieldDef("m9b2opgalcaja4",FieldDef.FLOAT,6,0);
            m9b2opgalcaja5 = new FieldDef("m9b2opgalcaja5",FieldDef.FLOAT,6,0);
            m9b2opgalcaja6 = new FieldDef("m9b2opgalcaja6",FieldDef.FLOAT,6,0);
            m9b2opgalded646 = new FieldDef("m9b2opgalded646",FieldDef.FLOAT,6,0);
            m9b2opgalded647 = new FieldDef("m9b2opgalded647",FieldDef.FLOAT,6,0);
            m9b2opgalmodboi = new FieldDef("m9b2opgalmodboi",FieldDef.FLOAT,6,0);
            m9b2opgalmodqoi = new FieldDef("m9b2opgalmodqoi",FieldDef.FLOAT,6,0);
            m9b2a1lorca = new FieldDef("m9b2a1lorca",FieldDef.FLOAT,6,0);
            m9b2a2lorca = new FieldDef("m9b2a2lorca",FieldDef.FLOAT,6,0);
            m9b2opgalded660 = new FieldDef("m9b2opgalded660",FieldDef.FLOAT,0,2);
            m9b2opgalded661 = new FieldDef("m9b2opgalded661",FieldDef.FLOAT,0,2);
            FieldDef array[] = {
                m9b2dominio,
                m9b2nif,
                m9b2ejercicio,
                m9b2periodo,
                m9b2opgalordb10,
                m9b2opgalordc10,
                m9b2opgalordb21,
                m9b2opgalordc21,
                m9b2opgalgrb10,
                m9b2opgalgrc10,
                m9b2opgalgrb21,
                m9b2opgalgrc21,
                m9b2opgalebb10,
                m9b2opgalebc10,
                m9b2opgalebb21,
                m9b2opgalebc21,
                m9b2opgalavb21,
                m9b2opgalavc21,
                m9b2opgaladqb10,
                m9b2opgaladqc10,
                m9b2opgaladqb21,
                m9b2opgaladqc21,
                m9b2opgaladsb10,
                m9b2opgaladsc10,
                m9b2opgaladsb21,
                m9b2opgaladsc21,
                m9b2opgalreb14,
                m9b2opgalrec14,
                m9b2opgalreb52,
                m9b2opgalrec52,
                m9b2opglde48b10,
                m9b2opglde49c10,
                m9b2opglde48b21,
                m9b2opglde49c21,
                m9b2opgde561b10,
                m9b2opgde562c10,
                m9b2opgde561b21,
                m9b2opgde562c21,
                m9b2opglde50b10,
                m9b2opglde51c10,
                m9b2opglde50b21,
                m9b2opglde51c21,
                m9b2opgde569b10,
                m9b2opgde570c10,
                m9b2opgde569b21,
                m9b2opgde570c21,
                m9b2opglde52b10,
                m9b2opglde53c10,
                m9b2opglde52b21,
                m9b2opglde53c21,
                m9b2opgade54b10,
                m9b2opgade55c10,
                m9b2opgade54b21,
                m9b2opgade55c21,
                m9b2opglde56b10,
                m9b2opglde57c10,
                m9b2opglde56b21,
                m9b2opglde57c21,
                m9b2opglde58b10,
                m9b2opglde59c10,
                m9b2opglde58b21,
                m9b2opglde59c21,
                m9b2opgde597b10,
                m9b2opgde598c10,
                m9b2opgde597b21,
                m9b2opgde598c21,
                m9b2opgalcaja1,
                m9b2opgalcaja2,
                m9b2opgalcaja3,
                m9b2opgalcaja4,
                m9b2opgalcaja5,
                m9b2opgalcaja6,
                m9b2opgalded646,
                m9b2opgalded647,
                m9b2opgalmodboi,
                m9b2opgalmodqoi,
                m9b2a1lorca,
                m9b2a2lorca,
                m9b2opgalded660,
                m9b2opgalded661                
                };
            setColumns(array);
            FieldDef arrayf[] = {m9b2dominio,m9b2nif,m9b2ejercicio,m9b2periodo };
            setPrimaryKeys(arrayf);
            m9b2opgalcaja1.setDescription("Operac.Reg.Gral Devengado Criterio caja base1  c643 4%");
            m9b2opgalcaja2.setDescription("Operac.Reg.Gral Devengado Criterio caja cuota1 c644 4%");
            m9b2opgalcaja3.setDescription("Operac.Reg.Gral Devengado Criterio caja base2  c645 10%");
            m9b2opgalcaja4.setDescription("Operac.Reg.Gral Devengado Criterio caja cuota2 c646 10%");
            m9b2opgalcaja5.setDescription("Operac.Reg.Gral Devengado Criterio caja base3  c647 21%");
            m9b2opgalcaja6.setDescription("Operac.Reg.Gral Devengado Criterio caja cuota4 c648 21%");
            m9b2opgalded646.setDescription("Rectific.deducciones por operaciones intragrupo Base  c651");
            m9b2opgalded647.setDescription("Rectific.deducciones por operaciones intragrupo Cuota c652");
            m9b2opgalmodboi.setDescription("Operac.Reg.Gral Devengado Modif bases y cuotas operac.intragrupo base  c649");
            m9b2opgalmodqoi.setDescription("Operac.Reg.Gral Devengado Modif bases y cuotas operac.intragrupo cuota c650");
            m9b2a1lorca.setDescription("6. Operaciones Reg. Simplificado - Actividad 1 - Lorca 2015");
            m9b2a2lorca.setDescription("6. Operaciones Reg. Simplificado - Actividad 2 - Lorca 2015");
            }
        }
        
    public class TabMod3903 extends TableDef
        {
        // campos
        public FieldDef m903dominio;
        public FieldDef m903nif;
        public FieldDef m903ejercicio;
        public FieldDef m903periodo;
        public FieldDef m903opsmpagac1c;
        public FieldDef m903opsmpagac1v;
        public FieldDef m903opsmpagac1i;
        public FieldDef m903opsmpagac1r;
        public FieldDef m903opsmpagac1s;
        public FieldDef m903opsmpagac1d;
        public FieldDef m903opsmpagac2c;
        public FieldDef m903opsmpagac2v;
        public FieldDef m903opsmpagac2i;
        public FieldDef m903opsmpagac2r;
        public FieldDef m903opsmpagac2s;
        public FieldDef m903opsmpagac2d;
        public FieldDef m903opsmpagac3c;
        public FieldDef m903opsmpagac3v;
        public FieldDef m903opsmpagac3i;
        public FieldDef m903opsmpagac3r;
        public FieldDef m903opsmpagac3s;
        public FieldDef m903opsmpagac3d;
        public FieldDef m903opsmpagac4c;
        public FieldDef m903opsmpagac4v;
        public FieldDef m903opsmpagac4i;
        public FieldDef m903opsmpagac4r;
        public FieldDef m903opsmpagac4s;
        public FieldDef m903opsmpagac4d;
        public FieldDef m903opsmpagac5c;
        public FieldDef m903opsmpagac5v;
        public FieldDef m903opsmpagac5i;
        public FieldDef m903opsmpagac5r;
        public FieldDef m903opsmpagac5s;
        public FieldDef m903opsmpagac5d;
        public FieldDef m903opsmpivdsna;
        public FieldDef m903opsmpivdsag;
        public FieldDef m903opsmpivdadq;
        public FieldDef m903opsmpivdinv;
        public FieldDef m903opsmpivdent;
        public FieldDef m903opsmpivdtot;
        public FieldDef m903opsmpdedadq;
        public FieldDef m903opsmpdedreg;
        public FieldDef m903opsmpdedsum;
        public FieldDef m903opsmpresult;
        public FieldDef m903reslqanusum;
        public FieldDef m903reslqanucmp;
        public FieldDef m903reslqanures;
        public FieldDef m903tribcheck;
        public FieldDef m903tribcomun;
        public FieldDef m903tribalava;
        public FieldDef m903tribguipuzc;
        public FieldDef m903tribvizcaya;
        public FieldDef m903tribnavarra;
        public FieldDef m903tribsumares;
        public FieldDef m903tribresatri;
        public FieldDef m903tribcmpcuo;
        public FieldDef m903tribresuliq;
        public FieldDef m903resliqtoing;
        public FieldDef m903resliqtodev;
        public FieldDef m903resliqredec;
        public FieldDef m903resliqreded;
        public FieldDef m903volopgen;
        public FieldDef m903volopsimp;
        public FieldDef m903volopesp;
        public FieldDef m903volusados;
        public FieldDef m903volreav;
        public FieldDef m903volopord;
        public FieldDef m903voloprecequ;
        public FieldDef m903volopintex;
        public FieldDef m903volopexport;
        public FieldDef m903volopotrexe;
        public FieldDef m903volopentinm;
        public FieldDef m903volopentinv;
        public FieldDef m903voloptotvol;
        public FieldDef m903opespadqint;
        public FieldDef m903opespadqexe;
        public FieldDef m903opespiexent;
        public FieldDef m903opespbisond;
        public FieldDef m903opespnosuje;
        public FieldDef m903opespsujeta;
        public FieldDef m903opespentbie;
        public FieldDef m903opespentint;
        public FieldDef m903opespsujpas;
        public FieldDef m903resliqadqel;
        public FieldDef m903resliq322p;
        public FieldDef m903resliq322n;
        public FieldDef m903exclbaja;
        public FieldDef m903volopcaja;
        public FieldDef m903opespcaja1;
        public FieldDef m903opespcaja2;
        public FieldDef m903opespcaja3;
        public FieldDef m903opespcaja4;
        public FieldDef m903a7regliva;
        public FieldDef m903a7ivaadu;
        public FieldDef m903a8regliva;
        public FieldDef m903a8ivaadu;
        public FieldDef m903cpdte662;
        public TabMod3903(String name)
            {
            super(name);
            m903dominio = new FieldDef("m903dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m903nif = new FieldDef("m903nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m903ejercicio = new FieldDef("m903ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m903periodo = new FieldDef("m903periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m903opsmpagac1c = new FieldDef("m903opsmpagac1c",FieldDef.FLOAT,6,0);
            m903opsmpagac1v = new FieldDef("m903opsmpagac1v",FieldDef.FLOAT,6,0);
            m903opsmpagac1i = new FieldDef("m903opsmpagac1i",FieldDef.FLOAT,6,0);
            m903opsmpagac1r = new FieldDef("m903opsmpagac1r",FieldDef.FLOAT,6,0);
            m903opsmpagac1s = new FieldDef("m903opsmpagac1s",FieldDef.FLOAT,6,0);
            m903opsmpagac1d = new FieldDef("m903opsmpagac1d",FieldDef.FLOAT,6,0);
            m903opsmpagac2c = new FieldDef("m903opsmpagac2c",FieldDef.FLOAT,6,0);
            m903opsmpagac2v = new FieldDef("m903opsmpagac2v",FieldDef.FLOAT,6,0);
            m903opsmpagac2i = new FieldDef("m903opsmpagac2i",FieldDef.FLOAT,6,0);
            m903opsmpagac2r = new FieldDef("m903opsmpagac2r",FieldDef.FLOAT,6,0);
            m903opsmpagac2s = new FieldDef("m903opsmpagac2s",FieldDef.FLOAT,6,0);
            m903opsmpagac2d = new FieldDef("m903opsmpagac2d",FieldDef.FLOAT,6,0);
            m903opsmpagac3c = new FieldDef("m903opsmpagac3c",FieldDef.FLOAT,6,0);
            m903opsmpagac3v = new FieldDef("m903opsmpagac3v",FieldDef.FLOAT,6,0);
            m903opsmpagac3i = new FieldDef("m903opsmpagac3i",FieldDef.FLOAT,6,0);
            m903opsmpagac3r = new FieldDef("m903opsmpagac3r",FieldDef.FLOAT,6,0);
            m903opsmpagac3s = new FieldDef("m903opsmpagac3s",FieldDef.FLOAT,6,0);
            m903opsmpagac3d = new FieldDef("m903opsmpagac3d",FieldDef.FLOAT,6,0);
            m903opsmpagac4c = new FieldDef("m903opsmpagac4c",FieldDef.FLOAT,6,0);
            m903opsmpagac4v = new FieldDef("m903opsmpagac4v",FieldDef.FLOAT,6,0);
            m903opsmpagac4i = new FieldDef("m903opsmpagac4i",FieldDef.FLOAT,6,0);
            m903opsmpagac4r = new FieldDef("m903opsmpagac4r",FieldDef.FLOAT,6,0);
            m903opsmpagac4s = new FieldDef("m903opsmpagac4s",FieldDef.FLOAT,6,0);
            m903opsmpagac4d = new FieldDef("m903opsmpagac4d",FieldDef.FLOAT,6,0);
            m903opsmpagac5c = new FieldDef("m903opsmpagac5c",FieldDef.FLOAT,6,0);
            m903opsmpagac5v = new FieldDef("m903opsmpagac5v",FieldDef.FLOAT,6,0);
            m903opsmpagac5i = new FieldDef("m903opsmpagac5i",FieldDef.FLOAT,6,0);
            m903opsmpagac5r = new FieldDef("m903opsmpagac5r",FieldDef.FLOAT,6,0);
            m903opsmpagac5s = new FieldDef("m903opsmpagac5s",FieldDef.FLOAT,6,0);
            m903opsmpagac5d = new FieldDef("m903opsmpagac5d",FieldDef.FLOAT,6,0);
            m903opsmpivdsna = new FieldDef("m903opsmpivdsna",FieldDef.FLOAT,6,0);
            m903opsmpivdsag = new FieldDef("m903opsmpivdsag",FieldDef.FLOAT,6,0);
            m903opsmpivdadq = new FieldDef("m903opsmpivdadq",FieldDef.FLOAT,6,0);
            m903opsmpivdinv = new FieldDef("m903opsmpivdinv",FieldDef.FLOAT,6,0);
            m903opsmpivdent = new FieldDef("m903opsmpivdent",FieldDef.FLOAT,6,0);
            m903opsmpivdtot = new FieldDef("m903opsmpivdtot",FieldDef.FLOAT,6,0);
            m903opsmpdedadq = new FieldDef("m903opsmpdedadq",FieldDef.FLOAT,6,0);
            m903opsmpdedreg = new FieldDef("m903opsmpdedreg",FieldDef.FLOAT,6,0);
            m903opsmpdedsum = new FieldDef("m903opsmpdedsum",FieldDef.FLOAT,6,0);
            m903opsmpresult = new FieldDef("m903opsmpresult",FieldDef.FLOAT,6,0);
            m903reslqanusum = new FieldDef("m903reslqanusum",FieldDef.FLOAT,6,0);
            m903reslqanucmp = new FieldDef("m903reslqanucmp",FieldDef.FLOAT,6,0);
            m903reslqanures = new FieldDef("m903reslqanures",FieldDef.FLOAT,6,0);
            m903tribcheck = new FieldDef("m903tribcheck",FieldDef.CHAR,1);
            m903tribcomun = new FieldDef("m903tribcomun",FieldDef.FLOAT,6,0);
            m903tribalava = new FieldDef("m903tribalava",FieldDef.FLOAT,6,0);
            m903tribguipuzc = new FieldDef("m903tribguipuzc",FieldDef.FLOAT,6,0);
            m903tribvizcaya = new FieldDef("m903tribvizcaya",FieldDef.FLOAT,6,0);
            m903tribnavarra = new FieldDef("m903tribnavarra",FieldDef.FLOAT,6,0);
            m903tribsumares = new FieldDef("m903tribsumares",FieldDef.FLOAT,6,0);
            m903tribresatri = new FieldDef("m903tribresatri",FieldDef.FLOAT,6,0);
            m903tribcmpcuo = new FieldDef("m903tribcmpcuo",FieldDef.FLOAT,6,0);
            m903tribresuliq = new FieldDef("m903tribresuliq",FieldDef.FLOAT,6,0);
            m903resliqtoing = new FieldDef("m903resliqtoing",FieldDef.FLOAT,6,0);
            m903resliqtodev = new FieldDef("m903resliqtodev",FieldDef.FLOAT,6,0);
            m903resliqredec = new FieldDef("m903resliqredec",FieldDef.FLOAT,6,0);
            m903resliqreded = new FieldDef("m903resliqreded",FieldDef.FLOAT,6,0);
            m903volopgen = new FieldDef("m903volopgen",FieldDef.FLOAT,6,0);
            m903volopsimp = new FieldDef("m903volopsimp",FieldDef.FLOAT,6,0);
            m903volopesp = new FieldDef("m903volopesp",FieldDef.FLOAT,6,0);
            m903volusados = new FieldDef("m903volusados",FieldDef.FLOAT,6,0);
            m903volreav = new FieldDef("m903volreav",FieldDef.FLOAT,6,0);
            m903volopord = new FieldDef("m903volopord",FieldDef.FLOAT,6,0);
            m903voloprecequ = new FieldDef("m903voloprecequ",FieldDef.FLOAT,6,0);
            m903volopintex = new FieldDef("m903volopintex",FieldDef.FLOAT,6,0);
            m903volopexport = new FieldDef("m903volopexport",FieldDef.FLOAT,6,0);
            m903volopotrexe = new FieldDef("m903volopotrexe",FieldDef.FLOAT,6,0);
            m903volopentinm = new FieldDef("m903volopentinm",FieldDef.FLOAT,6,0);
            m903volopentinv = new FieldDef("m903volopentinv",FieldDef.FLOAT,6,0);
            m903voloptotvol = new FieldDef("m903voloptotvol",FieldDef.FLOAT,6,0);
            m903opespadqint = new FieldDef("m903opespadqint",FieldDef.FLOAT,6,0);
            m903opespadqexe = new FieldDef("m903opespadqexe",FieldDef.FLOAT,6,0);
            m903opespiexent = new FieldDef("m903opespiexent",FieldDef.FLOAT,6,0);
            m903opespbisond = new FieldDef("m903opespbisond",FieldDef.FLOAT,6,0);
            m903opespnosuje = new FieldDef("m903opespnosuje",FieldDef.FLOAT,6,0);
            m903opespsujeta = new FieldDef("m903opespsujeta",FieldDef.FLOAT,6,0);
            m903opespentbie = new FieldDef("m903opespentbie",FieldDef.FLOAT,6,0);
            m903opespentint = new FieldDef("m903opespentint",FieldDef.FLOAT,6,0);
            m903opespsujpas = new FieldDef("m903opespsujpas",FieldDef.FLOAT,6,0);
            m903resliqadqel = new FieldDef("m903resliqadqel",FieldDef.FLOAT,6,0);
            m903resliq322p = new FieldDef("m903resliq322p",FieldDef.FLOAT,6,0);
            m903resliq322n = new FieldDef("m903resliq322n",FieldDef.FLOAT,6,0);
            m903exclbaja = new FieldDef("m903exclbaja",FieldDef.CHAR,1);
            m903volopcaja = new FieldDef("m903volopcaja",FieldDef.FLOAT,6,0);
            m903opespcaja1 = new FieldDef("m903opespcaja1",FieldDef.FLOAT,6,0);
            m903opespcaja2 = new FieldDef("m903opespcaja2",FieldDef.FLOAT,6,0);
            m903opespcaja3 = new FieldDef("m903opespcaja3",FieldDef.FLOAT,6,0);
            m903opespcaja4 = new FieldDef("m903opespcaja4",FieldDef.FLOAT,6,0);
            m903a7regliva = new FieldDef("m903a7regliva",FieldDef.FLOAT,6,0);
            m903a7ivaadu = new FieldDef("m903a7ivaadu",FieldDef.FLOAT,6,0);
            m903a8regliva = new FieldDef("m903a8regliva",FieldDef.FLOAT,6,0);
            m903a8ivaadu = new FieldDef("m903a8ivaadu",FieldDef.FLOAT,6,0);
            m903cpdte662 = new FieldDef("m903cpdte662",FieldDef.FLOAT,0,2);
            FieldDef array[] = {
                m903dominio,
                m903nif,
                m903ejercicio,
                m903periodo,
                m903opsmpagac1c,
                m903opsmpagac1v,
                m903opsmpagac1i,
                m903opsmpagac1r,
                m903opsmpagac1s,
                m903opsmpagac1d,
                m903opsmpagac2c,
                m903opsmpagac2v,
                m903opsmpagac2i,
                m903opsmpagac2r,
                m903opsmpagac2s,
                m903opsmpagac2d,
                m903opsmpagac3c,
                m903opsmpagac3v,
                m903opsmpagac3i,
                m903opsmpagac3r,
                m903opsmpagac3s,
                m903opsmpagac3d,
                m903opsmpagac4c,
                m903opsmpagac4v,
                m903opsmpagac4i,
                m903opsmpagac4r,
                m903opsmpagac4s,
                m903opsmpagac4d,
                m903opsmpagac5c,
                m903opsmpagac5v,
                m903opsmpagac5i,
                m903opsmpagac5r,
                m903opsmpagac5s,
                m903opsmpagac5d,
                m903opsmpivdsna,
                m903opsmpivdsag,
                m903opsmpivdadq,
                m903opsmpivdinv,
                m903opsmpivdent,
                m903opsmpivdtot,
                m903opsmpdedadq,
                m903opsmpdedreg,
                m903opsmpdedsum,
                m903opsmpresult,
                m903reslqanusum,
                m903reslqanucmp,
                m903reslqanures,
                m903tribcheck,
                m903tribcomun,
                m903tribalava,
                m903tribguipuzc,
                m903tribvizcaya,
                m903tribnavarra,
                m903tribsumares,
                m903tribresatri,
                m903tribcmpcuo,
                m903tribresuliq,
                m903resliqtoing,
                m903resliqtodev,
                m903resliqredec,
                m903resliqreded,
                m903volopgen,
                m903volopsimp,
                m903volopesp,
                m903volusados,
                m903volreav,
                m903volopord,
                m903voloprecequ,
                m903volopintex,
                m903volopexport,
                m903volopotrexe,
                m903volopentinm,
                m903volopentinv,
                m903voloptotvol,
                m903opespadqint,
                m903opespadqexe,
                m903opespiexent,
                m903opespbisond,
                m903opespnosuje,
                m903opespsujeta,
                m903opespentbie,
                m903opespentint,
                m903opespsujpas,
                m903resliqadqel,
                m903resliq322p,
                m903resliq322n,
                m903exclbaja,
                m903volopcaja,
                m903opespcaja1,
                m903opespcaja2,
                m903opespcaja3,
                m903opespcaja4,
                m903a7regliva,
                m903a7ivaadu,
                m903a8regliva,
                m903a8ivaadu,
                m903cpdte662                
                };
            setColumns(array);
            FieldDef arrayf[] = {m903dominio,m903nif,m903ejercicio,m903periodo };
            setPrimaryKeys(arrayf);
            m903volopcaja.setDescription("Vol.Operaciones. Reg.Esp.Criterio Caja  art.75");
            m903opespcaja1.setDescription("Oper.Especifica. Destinatarios RECC Entregas Bienes Base");
            m903opespcaja2.setDescription("Oper.Especifica. Destinatarios RECC Entregas Bienes Cuota");
            m903opespcaja3.setDescription("Oper.Especifica. Destinatarios RECC Adquisic.Bienes Base");
            m903opespcaja4.setDescription("Oper.Especifica. Destinatarios RECC Adquisic.Bienes Cuota");
            m903a7regliva.setDescription("7. Resultado liquidación anual - Regularización cuotas art. 80.Cinco.5ª LIVA [658]");
            m903a7ivaadu.setDescription("7. Resultado liquidación anual - IVA a la importación liquidado por la Aduana [659]");
            m903a8regliva.setDescription("8. Tributación razón de territorio - Administraciones - Regularización cuotas art. 80.Cinco.5ª LIVA [658]");
            m903a8ivaadu.setDescription("8. Tributación razón de territorio - Administraciones - IVA a la importación liquidado por la Aduana [659]");
            }
        }
        
    public class TabMod390act extends TableDef
        {
        // campos
        public FieldDef m90adominio;
        public FieldDef m90anif;
        public FieldDef m90aejercicio;
        public FieldDef m90aperiodo;
        public FieldDef m90anumactiv;
        public FieldDef m90aopsmpacepi;
        public FieldDef m90aopsmpacmu1;
        public FieldDef m90aopsmpacmi1;
        public FieldDef m90aopsmpacmu2;
        public FieldDef m90aopsmpacmi2;
        public FieldDef m90aopsmpacmu3;
        public FieldDef m90aopsmpacmi3;
        public FieldDef m90aopsmpacmu4;
        public FieldDef m90aopsmpacmi4;
        public FieldDef m90aopsmpacmu5;
        public FieldDef m90aopsmpacmi5;
        public FieldDef m90aopsmpacmu6;
        public FieldDef m90aopsmpacmi6;
        public FieldDef m90aopsmpacmu7;
        public FieldDef m90aopsmpacmi7;
        public FieldDef m90aopsmpaccdc;
        public FieldDef m90aopsmpaccs;
        public FieldDef m90aopsmpacic;
        public FieldDef m90aopsmpacres;
        public FieldDef m90aopsmpacpcm;
        public FieldDef m90aopsmpacdcs;
        public FieldDef m90aopsmpaccm;
        public FieldDef m90aopsmpaccds;
        public FieldDef m90alorca;
        public TabMod390act(String name)
            {
            super(name);
            m90adominio = new FieldDef("m90adominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m90anif = new FieldDef("m90anif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m90aejercicio = new FieldDef("m90aejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m90aperiodo = new FieldDef("m90aperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m90anumactiv = new FieldDef("m90anumactiv",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m90aopsmpacepi = new FieldDef("m90aopsmpacepi",FieldDef.CHAR,7);
            m90aopsmpacmu1 = new FieldDef("m90aopsmpacmu1",FieldDef.FLOAT,6,0);
            m90aopsmpacmi1 = new FieldDef("m90aopsmpacmi1",FieldDef.FLOAT,6,0);
            m90aopsmpacmu2 = new FieldDef("m90aopsmpacmu2",FieldDef.FLOAT,6,0);
            m90aopsmpacmi2 = new FieldDef("m90aopsmpacmi2",FieldDef.FLOAT,6,0);
            m90aopsmpacmu3 = new FieldDef("m90aopsmpacmu3",FieldDef.FLOAT,6,0);
            m90aopsmpacmi3 = new FieldDef("m90aopsmpacmi3",FieldDef.FLOAT,6,0);
            m90aopsmpacmu4 = new FieldDef("m90aopsmpacmu4",FieldDef.FLOAT,6,0);
            m90aopsmpacmi4 = new FieldDef("m90aopsmpacmi4",FieldDef.FLOAT,6,0);
            m90aopsmpacmu5 = new FieldDef("m90aopsmpacmu5",FieldDef.FLOAT,6,0);
            m90aopsmpacmi5 = new FieldDef("m90aopsmpacmi5",FieldDef.FLOAT,6,0);
            m90aopsmpacmu6 = new FieldDef("m90aopsmpacmu6",FieldDef.FLOAT,6,0);
            m90aopsmpacmi6 = new FieldDef("m90aopsmpacmi6",FieldDef.FLOAT,6,0);
            m90aopsmpacmu7 = new FieldDef("m90aopsmpacmu7",FieldDef.FLOAT,6,0);
            m90aopsmpacmi7 = new FieldDef("m90aopsmpacmi7",FieldDef.FLOAT,6,0);
            m90aopsmpaccdc = new FieldDef("m90aopsmpaccdc",FieldDef.FLOAT,6,0);
            m90aopsmpaccs = new FieldDef("m90aopsmpaccs",FieldDef.FLOAT,6,0);
            m90aopsmpacic = new FieldDef("m90aopsmpacic",FieldDef.FLOAT,6,0);
            m90aopsmpacres = new FieldDef("m90aopsmpacres",FieldDef.FLOAT,6,0);
            m90aopsmpacpcm = new FieldDef("m90aopsmpacpcm",FieldDef.FLOAT,6,0);
            m90aopsmpacdcs = new FieldDef("m90aopsmpacdcs",FieldDef.FLOAT,6,0);
            m90aopsmpaccm = new FieldDef("m90aopsmpaccm",FieldDef.FLOAT,6,0);
            m90aopsmpaccds = new FieldDef("m90aopsmpaccds",FieldDef.FLOAT,6,0);
            m90alorca = new FieldDef("m90alorca",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m90adominio,
                m90anif,
                m90aejercicio,
                m90aperiodo,
                m90anumactiv,
                m90aopsmpacepi,
                m90aopsmpacmu1,
                m90aopsmpacmi1,
                m90aopsmpacmu2,
                m90aopsmpacmi2,
                m90aopsmpacmu3,
                m90aopsmpacmi3,
                m90aopsmpacmu4,
                m90aopsmpacmi4,
                m90aopsmpacmu5,
                m90aopsmpacmi5,
                m90aopsmpacmu6,
                m90aopsmpacmi6,
                m90aopsmpacmu7,
                m90aopsmpacmi7,
                m90aopsmpaccdc,
                m90aopsmpaccs,
                m90aopsmpacic,
                m90aopsmpacres,
                m90aopsmpacpcm,
                m90aopsmpacdcs,
                m90aopsmpaccm,
                m90aopsmpaccds,
                m90alorca                
                };
            setColumns(array);
            FieldDef arrayf[] = {m90adominio,m90anif,m90aejercicio,m90aperiodo,m90anumactiv };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod3904 extends TableDef
        {
        // campos
        public FieldDef m904dominio;
        public FieldDef m904nif;
        public FieldDef m904ejercicio;
        public FieldDef m904periodo;
        public FieldDef m904pro1activ;
        public FieldDef m904pro1codcnae;
        public FieldDef m904pro1impoper;
        public FieldDef m904pro1impopde;
        public FieldDef m904pro1tipo;
        public FieldDef m904pro1pormeno;
        public FieldDef m904pro2activ;
        public FieldDef m904pro2codcnae;
        public FieldDef m904pro2impoper;
        public FieldDef m904pro2impopde;
        public FieldDef m904pro2tipo;
        public FieldDef m904pro2pormeno;
        public FieldDef m904pro3activ;
        public FieldDef m904pro3codcnae;
        public FieldDef m904pro3impoper;
        public FieldDef m904pro3impopde;
        public FieldDef m904pro3tipo;
        public FieldDef m904pro3pormeno;
        public FieldDef m904pro4activ;
        public FieldDef m904pro4codcnae;
        public FieldDef m904pro4impoper;
        public FieldDef m904pro4impopde;
        public FieldDef m904pro4tipo;
        public FieldDef m904pro4pormeno;
        public FieldDef m904pro5activ;
        public FieldDef m904pro5codcnae;
        public FieldDef m904pro5impoper;
        public FieldDef m904pro5impopde;
        public FieldDef m904pro5tipo;
        public FieldDef m904pro5pormeno;
        public FieldDef m904pro6activ;
        public FieldDef m904pro6codcnae;
        public FieldDef m904pro6impoper;
        public FieldDef m904pro6impopde;
        public FieldDef m904pro6tipo;
        public FieldDef m904pro6pormeno;
        public FieldDef m904pro7activ;
        public FieldDef m904pro7codcnae;
        public FieldDef m904pro7impoper;
        public FieldDef m904pro7impopde;
        public FieldDef m904pro7tipo;
        public FieldDef m904pro7pormeno;
        public FieldDef m904pro8activ;
        public FieldDef m904pro8codcnae;
        public FieldDef m904pro8impoper;
        public FieldDef m904pro8impopde;
        public FieldDef m904pro8tipo;
        public FieldDef m904pro8pormeno;
        public FieldDef m904pro9activ;
        public FieldDef m904pro9codcnae;
        public FieldDef m904pro9impoper;
        public FieldDef m904pro9impopde;
        public FieldDef m904pro9tipo;
        public FieldDef m904pro9pormeno;
        public TabMod3904(String name)
            {
            super(name);
            m904dominio = new FieldDef("m904dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m904nif = new FieldDef("m904nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m904ejercicio = new FieldDef("m904ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m904periodo = new FieldDef("m904periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m904pro1activ = new FieldDef("m904pro1activ",FieldDef.CHAR,40);
            m904pro1codcnae = new FieldDef("m904pro1codcnae",FieldDef.CHAR,3);
            m904pro1impoper = new FieldDef("m904pro1impoper",FieldDef.FLOAT,6,0);
            m904pro1impopde = new FieldDef("m904pro1impopde",FieldDef.FLOAT,6,0);
            m904pro1tipo = new FieldDef("m904pro1tipo",FieldDef.CHAR,1);
            m904pro1pormeno = new FieldDef("m904pro1pormeno",FieldDef.FLOAT,6,0);
            m904pro2activ = new FieldDef("m904pro2activ",FieldDef.CHAR,40);
            m904pro2codcnae = new FieldDef("m904pro2codcnae",FieldDef.CHAR,3);
            m904pro2impoper = new FieldDef("m904pro2impoper",FieldDef.FLOAT,6,0);
            m904pro2impopde = new FieldDef("m904pro2impopde",FieldDef.FLOAT,6,0);
            m904pro2tipo = new FieldDef("m904pro2tipo",FieldDef.CHAR,1);
            m904pro2pormeno = new FieldDef("m904pro2pormeno",FieldDef.FLOAT,6,0);
            m904pro3activ = new FieldDef("m904pro3activ",FieldDef.CHAR,40);
            m904pro3codcnae = new FieldDef("m904pro3codcnae",FieldDef.CHAR,3);
            m904pro3impoper = new FieldDef("m904pro3impoper",FieldDef.FLOAT,6,0);
            m904pro3impopde = new FieldDef("m904pro3impopde",FieldDef.FLOAT,6,0);
            m904pro3tipo = new FieldDef("m904pro3tipo",FieldDef.CHAR,1);
            m904pro3pormeno = new FieldDef("m904pro3pormeno",FieldDef.FLOAT,6,0);
            m904pro4activ = new FieldDef("m904pro4activ",FieldDef.CHAR,40);
            m904pro4codcnae = new FieldDef("m904pro4codcnae",FieldDef.CHAR,3);
            m904pro4impoper = new FieldDef("m904pro4impoper",FieldDef.FLOAT,6,0);
            m904pro4impopde = new FieldDef("m904pro4impopde",FieldDef.FLOAT,6,0);
            m904pro4tipo = new FieldDef("m904pro4tipo",FieldDef.CHAR,1);
            m904pro4pormeno = new FieldDef("m904pro4pormeno",FieldDef.FLOAT,6,0);
            m904pro5activ = new FieldDef("m904pro5activ",FieldDef.CHAR,40);
            m904pro5codcnae = new FieldDef("m904pro5codcnae",FieldDef.CHAR,3);
            m904pro5impoper = new FieldDef("m904pro5impoper",FieldDef.FLOAT,6,0);
            m904pro5impopde = new FieldDef("m904pro5impopde",FieldDef.FLOAT,6,0);
            m904pro5tipo = new FieldDef("m904pro5tipo",FieldDef.CHAR,1);
            m904pro5pormeno = new FieldDef("m904pro5pormeno",FieldDef.FLOAT,6,0);
            m904pro6activ = new FieldDef("m904pro6activ",FieldDef.CHAR,40);
            m904pro6codcnae = new FieldDef("m904pro6codcnae",FieldDef.CHAR,3);
            m904pro6impoper = new FieldDef("m904pro6impoper",FieldDef.FLOAT,6,0);
            m904pro6impopde = new FieldDef("m904pro6impopde",FieldDef.FLOAT,6,0);
            m904pro6tipo = new FieldDef("m904pro6tipo",FieldDef.CHAR,1);
            m904pro6pormeno = new FieldDef("m904pro6pormeno",FieldDef.FLOAT,6,0);
            m904pro7activ = new FieldDef("m904pro7activ",FieldDef.CHAR,40);
            m904pro7codcnae = new FieldDef("m904pro7codcnae",FieldDef.CHAR,3);
            m904pro7impoper = new FieldDef("m904pro7impoper",FieldDef.FLOAT,6,0);
            m904pro7impopde = new FieldDef("m904pro7impopde",FieldDef.FLOAT,6,0);
            m904pro7tipo = new FieldDef("m904pro7tipo",FieldDef.CHAR,1);
            m904pro7pormeno = new FieldDef("m904pro7pormeno",FieldDef.FLOAT,6,0);
            m904pro8activ = new FieldDef("m904pro8activ",FieldDef.CHAR,40);
            m904pro8codcnae = new FieldDef("m904pro8codcnae",FieldDef.CHAR,3);
            m904pro8impoper = new FieldDef("m904pro8impoper",FieldDef.FLOAT,6,0);
            m904pro8impopde = new FieldDef("m904pro8impopde",FieldDef.FLOAT,6,0);
            m904pro8tipo = new FieldDef("m904pro8tipo",FieldDef.CHAR,1);
            m904pro8pormeno = new FieldDef("m904pro8pormeno",FieldDef.FLOAT,6,0);
            m904pro9activ = new FieldDef("m904pro9activ",FieldDef.CHAR,40);
            m904pro9codcnae = new FieldDef("m904pro9codcnae",FieldDef.CHAR,3);
            m904pro9impoper = new FieldDef("m904pro9impoper",FieldDef.FLOAT,6,0);
            m904pro9impopde = new FieldDef("m904pro9impopde",FieldDef.FLOAT,6,0);
            m904pro9tipo = new FieldDef("m904pro9tipo",FieldDef.CHAR,1);
            m904pro9pormeno = new FieldDef("m904pro9pormeno",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m904dominio,
                m904nif,
                m904ejercicio,
                m904periodo,
                m904pro1activ,
                m904pro1codcnae,
                m904pro1impoper,
                m904pro1impopde,
                m904pro1tipo,
                m904pro1pormeno,
                m904pro2activ,
                m904pro2codcnae,
                m904pro2impoper,
                m904pro2impopde,
                m904pro2tipo,
                m904pro2pormeno,
                m904pro3activ,
                m904pro3codcnae,
                m904pro3impoper,
                m904pro3impopde,
                m904pro3tipo,
                m904pro3pormeno,
                m904pro4activ,
                m904pro4codcnae,
                m904pro4impoper,
                m904pro4impopde,
                m904pro4tipo,
                m904pro4pormeno,
                m904pro5activ,
                m904pro5codcnae,
                m904pro5impoper,
                m904pro5impopde,
                m904pro5tipo,
                m904pro5pormeno,
                m904pro6activ,
                m904pro6codcnae,
                m904pro6impoper,
                m904pro6impopde,
                m904pro6tipo,
                m904pro6pormeno,
                m904pro7activ,
                m904pro7codcnae,
                m904pro7impoper,
                m904pro7impopde,
                m904pro7tipo,
                m904pro7pormeno,
                m904pro8activ,
                m904pro8codcnae,
                m904pro8impoper,
                m904pro8impopde,
                m904pro8tipo,
                m904pro8pormeno,
                m904pro9activ,
                m904pro9codcnae,
                m904pro9impoper,
                m904pro9impopde,
                m904pro9tipo,
                m904pro9pormeno                
                };
            setColumns(array);
            FieldDef arrayf[] = {m904dominio,m904nif,m904ejercicio,m904periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabMod3925 extends TableDef
        {
        // campos
        public FieldDef m925dominio;
        public FieldDef m925nif;
        public FieldDef m925ejercicio;
        public FieldDef m925periodo;
        public FieldDef m925deddif1b1;
        public FieldDef m925deddif1c1;
        public FieldDef m925deddif1b2;
        public FieldDef m925deddif1c2;
        public FieldDef m925deddif1b3;
        public FieldDef m925deddif1c3;
        public FieldDef m925deddif1b4;
        public FieldDef m925deddif1c4;
        public FieldDef m925deddif1b5;
        public FieldDef m925deddif1c5;
        public FieldDef m925deddif1b6;
        public FieldDef m925deddif1c6;
        public FieldDef m925deddif1b7;
        public FieldDef m925deddif1c7;
        public FieldDef m925deddif1c8;
        public FieldDef m925deddif1c9;
        public FieldDef m925deddif1to;
        public FieldDef m925deddif2b1;
        public FieldDef m925deddif2c1;
        public FieldDef m925deddif2b2;
        public FieldDef m925deddif2c2;
        public FieldDef m925deddif2b3;
        public FieldDef m925deddif2c3;
        public FieldDef m925deddif2b4;
        public FieldDef m925deddif2c4;
        public FieldDef m925deddif2b5;
        public FieldDef m925deddif2c5;
        public FieldDef m925deddif2b6;
        public FieldDef m925deddif2c6;
        public FieldDef m925deddif2b7;
        public FieldDef m925deddif2c7;
        public FieldDef m925deddif2c8;
        public FieldDef m925deddif2c9;
        public FieldDef m925deddif2to;
        public FieldDef m925deddif3b1;
        public FieldDef m925deddif3c1;
        public FieldDef m925deddif3b2;
        public FieldDef m925deddif3c2;
        public FieldDef m925deddif3b3;
        public FieldDef m925deddif3c3;
        public FieldDef m925deddif3b4;
        public FieldDef m925deddif3c4;
        public FieldDef m925deddif3b5;
        public FieldDef m925deddif3c5;
        public FieldDef m925deddif3b6;
        public FieldDef m925deddif3c6;
        public FieldDef m925deddif3b7;
        public FieldDef m925deddif3c7;
        public FieldDef m925deddif3c8;
        public FieldDef m925deddif3c9;
        public FieldDef m925deddif3to;
        public FieldDef m925deddif1b8;
        public FieldDef m925deddif2b8;
        public FieldDef m925deddif3b8;
        public TabMod3925(String name)
            {
            super(name);
            m925dominio = new FieldDef("m925dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
            m925nif = new FieldDef("m925nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            m925ejercicio = new FieldDef("m925ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            m925periodo = new FieldDef("m925periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
            m925deddif1b1 = new FieldDef("m925deddif1b1",FieldDef.FLOAT,6,0);
            m925deddif1c1 = new FieldDef("m925deddif1c1",FieldDef.FLOAT,6,0);
            m925deddif1b2 = new FieldDef("m925deddif1b2",FieldDef.FLOAT,6,0);
            m925deddif1c2 = new FieldDef("m925deddif1c2",FieldDef.FLOAT,6,0);
            m925deddif1b3 = new FieldDef("m925deddif1b3",FieldDef.FLOAT,6,0);
            m925deddif1c3 = new FieldDef("m925deddif1c3",FieldDef.FLOAT,6,0);
            m925deddif1b4 = new FieldDef("m925deddif1b4",FieldDef.FLOAT,6,0);
            m925deddif1c4 = new FieldDef("m925deddif1c4",FieldDef.FLOAT,6,0);
            m925deddif1b5 = new FieldDef("m925deddif1b5",FieldDef.FLOAT,6,0);
            m925deddif1c5 = new FieldDef("m925deddif1c5",FieldDef.FLOAT,6,0);
            m925deddif1b6 = new FieldDef("m925deddif1b6",FieldDef.FLOAT,6,0);
            m925deddif1c6 = new FieldDef("m925deddif1c6",FieldDef.FLOAT,6,0);
            m925deddif1b7 = new FieldDef("m925deddif1b7",FieldDef.FLOAT,6,0);
            m925deddif1c7 = new FieldDef("m925deddif1c7",FieldDef.FLOAT,6,0);
            m925deddif1c8 = new FieldDef("m925deddif1c8",FieldDef.FLOAT,6,0);
            m925deddif1c9 = new FieldDef("m925deddif1c9",FieldDef.FLOAT,6,0);
            m925deddif1to = new FieldDef("m925deddif1to",FieldDef.FLOAT,6,0);
            m925deddif2b1 = new FieldDef("m925deddif2b1",FieldDef.FLOAT,6,0);
            m925deddif2c1 = new FieldDef("m925deddif2c1",FieldDef.FLOAT,6,0);
            m925deddif2b2 = new FieldDef("m925deddif2b2",FieldDef.FLOAT,6,0);
            m925deddif2c2 = new FieldDef("m925deddif2c2",FieldDef.FLOAT,6,0);
            m925deddif2b3 = new FieldDef("m925deddif2b3",FieldDef.FLOAT,6,0);
            m925deddif2c3 = new FieldDef("m925deddif2c3",FieldDef.FLOAT,6,0);
            m925deddif2b4 = new FieldDef("m925deddif2b4",FieldDef.FLOAT,6,0);
            m925deddif2c4 = new FieldDef("m925deddif2c4",FieldDef.FLOAT,6,0);
            m925deddif2b5 = new FieldDef("m925deddif2b5",FieldDef.FLOAT,6,0);
            m925deddif2c5 = new FieldDef("m925deddif2c5",FieldDef.FLOAT,6,0);
            m925deddif2b6 = new FieldDef("m925deddif2b6",FieldDef.FLOAT,6,0);
            m925deddif2c6 = new FieldDef("m925deddif2c6",FieldDef.FLOAT,6,0);
            m925deddif2b7 = new FieldDef("m925deddif2b7",FieldDef.FLOAT,6,0);
            m925deddif2c7 = new FieldDef("m925deddif2c7",FieldDef.FLOAT,6,0);
            m925deddif2c8 = new FieldDef("m925deddif2c8",FieldDef.FLOAT,6,0);
            m925deddif2c9 = new FieldDef("m925deddif2c9",FieldDef.FLOAT,6,0);
            m925deddif2to = new FieldDef("m925deddif2to",FieldDef.FLOAT,6,0);
            m925deddif3b1 = new FieldDef("m925deddif3b1",FieldDef.FLOAT,6,0);
            m925deddif3c1 = new FieldDef("m925deddif3c1",FieldDef.FLOAT,6,0);
            m925deddif3b2 = new FieldDef("m925deddif3b2",FieldDef.FLOAT,6,0);
            m925deddif3c2 = new FieldDef("m925deddif3c2",FieldDef.FLOAT,6,0);
            m925deddif3b3 = new FieldDef("m925deddif3b3",FieldDef.FLOAT,6,0);
            m925deddif3c3 = new FieldDef("m925deddif3c3",FieldDef.FLOAT,6,0);
            m925deddif3b4 = new FieldDef("m925deddif3b4",FieldDef.FLOAT,6,0);
            m925deddif3c4 = new FieldDef("m925deddif3c4",FieldDef.FLOAT,6,0);
            m925deddif3b5 = new FieldDef("m925deddif3b5",FieldDef.FLOAT,6,0);
            m925deddif3c5 = new FieldDef("m925deddif3c5",FieldDef.FLOAT,6,0);
            m925deddif3b6 = new FieldDef("m925deddif3b6",FieldDef.FLOAT,6,0);
            m925deddif3c6 = new FieldDef("m925deddif3c6",FieldDef.FLOAT,6,0);
            m925deddif3b7 = new FieldDef("m925deddif3b7",FieldDef.FLOAT,6,0);
            m925deddif3c7 = new FieldDef("m925deddif3c7",FieldDef.FLOAT,6,0);
            m925deddif3c8 = new FieldDef("m925deddif3c8",FieldDef.FLOAT,6,0);
            m925deddif3c9 = new FieldDef("m925deddif3c9",FieldDef.FLOAT,6,0);
            m925deddif3to = new FieldDef("m925deddif3to",FieldDef.FLOAT,6,0);
            m925deddif1b8 = new FieldDef("m925deddif1b8",FieldDef.FLOAT,6,0);
            m925deddif2b8 = new FieldDef("m925deddif2b8",FieldDef.FLOAT,6,0);
            m925deddif3b8 = new FieldDef("m925deddif3b8",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                m925dominio,
                m925nif,
                m925ejercicio,
                m925periodo,
                m925deddif1b1,
                m925deddif1c1,
                m925deddif1b2,
                m925deddif1c2,
                m925deddif1b3,
                m925deddif1c3,
                m925deddif1b4,
                m925deddif1c4,
                m925deddif1b5,
                m925deddif1c5,
                m925deddif1b6,
                m925deddif1c6,
                m925deddif1b7,
                m925deddif1c7,
                m925deddif1c8,
                m925deddif1c9,
                m925deddif1to,
                m925deddif2b1,
                m925deddif2c1,
                m925deddif2b2,
                m925deddif2c2,
                m925deddif2b3,
                m925deddif2c3,
                m925deddif2b4,
                m925deddif2c4,
                m925deddif2b5,
                m925deddif2c5,
                m925deddif2b6,
                m925deddif2c6,
                m925deddif2b7,
                m925deddif2c7,
                m925deddif2c8,
                m925deddif2c9,
                m925deddif2to,
                m925deddif3b1,
                m925deddif3c1,
                m925deddif3b2,
                m925deddif3c2,
                m925deddif3b3,
                m925deddif3c3,
                m925deddif3b4,
                m925deddif3c4,
                m925deddif3b5,
                m925deddif3c5,
                m925deddif3b6,
                m925deddif3c6,
                m925deddif3b7,
                m925deddif3c7,
                m925deddif3c8,
                m925deddif3c9,
                m925deddif3to,
                m925deddif1b8,
                m925deddif2b8,
                m925deddif3b8                
                };
            setColumns(array);
            FieldDef arrayf[] = {m925dominio,m925nif,m925ejercicio,m925periodo };
            setPrimaryKeys(arrayf);
            }
        }
        
    public CatModelos1()
        {
        tabmod300 = new TabMod300("mod300");
        tabmod300des = new TabMod300des("mod300des");
        tabmod300desb = new TabMod300desb("mod300desb");
        tabmod300pro = new TabMod300pro("mod300pro");
        tabmod370 = new TabMod370("mod370");
        tabmod110 = new TabMod110("mod110");
        tabmod115 = new TabMod115("mod115");
        tabmod130 = new TabMod130("mod130");
        tabmod131 = new TabMod131("mod131");
        tabmod310 = new TabMod310("mod310");
        tabmod311 = new TabMod311("mod311");
        tabmod180e = new TabMod180e("mod180e");
        tabmod190c = new TabMod190c("mod190c");
        tabmod190d = new TabMod190d("mod190d");
        tabcertifgral = new TabCertifgral("certifgral");
        tabcertiprof = new TabCertiprof("certiprof");
        tabmod347c = new TabMod347c("mod347c");
        tabmod347d = new TabMod347d("mod347d");
        tabmod347a = new TabMod347a("mod347a");
        tabmod193c = new TabMod193c("mod193c");
        tabmod193d = new TabMod193d("mod193d");
        tabmod123 = new TabMod123("mod123");
        tabmod349c = new TabMod349c("mod349c");
        tabmod349d = new TabMod349d("mod349d");
        tabmod349r = new TabMod349r("mod349r");
        tabmodintc = new TabModintc("modintc");
        tabmodintd = new TabModintd("modintd");
        tabmod110d = new TabMod110d("mod110d");
        tabmod300prodes = new TabMod300prodes("mod300prodes");
        tabmod390des = new TabMod390des("mod390des");
        tabmod110acum = new TabMod110acum("mod110acum");
        tabmod349acum = new TabMod349acum("mod349acum");
        tabmod123d = new TabMod123d("mod123d");
        tabmod216 = new TabMod216("mod216");
        tabmod216d = new TabMod216d("mod216d");
        tabmod296r = new TabMod296r("mod296r");
        tabmod296d = new TabMod296d("mod296d");
        tabmod322 = new TabMod322("mod322");
        tabmod322pro = new TabMod322pro("mod322pro");
        tabmod202 = new TabMod202("mod202");
        tabmod20a = new TabMod20a("mod20a");
        tabmod303rs = new TabMod303rs("mod303rs");
        tabmod303p4 = new TabMod303p4("mod303p4");
        tabmod102 = new TabMod102("mod102");
        tabmod180r = new TabMod180r("mod180r");
        tabmod115d = new TabMod115d("mod115d");
        tabmod3901 = new TabMod3901("mod3901");
        tabmod3902 = new TabMod3902("mod3902");
        tabmod3902b = new TabMod3902b("mod3902b");
        tabmod3903 = new TabMod3903("mod3903");
        tabmod390act = new TabMod390act("mod390act");
        tabmod3904 = new TabMod3904("mod3904");
        tabmod3925 = new TabMod3925("mod3925");
        TableDef array[] = {
            tabmod300,
            tabmod300des,
            tabmod300desb,
            tabmod300pro,
            tabmod370,
            tabmod110,
            tabmod115,
            tabmod130,
            tabmod131,
            tabmod310,
            tabmod311,
            tabmod180e,
            tabmod190c,
            tabmod190d,
            tabcertifgral,
            tabcertiprof,
            tabmod347c,
            tabmod347d,
            tabmod347a,
            tabmod193c,
            tabmod193d,
            tabmod123,
            tabmod349c,
            tabmod349d,
            tabmod349r,
            tabmodintc,
            tabmodintd,
            tabmod110d,
            tabmod300prodes,
            tabmod390des,
            tabmod110acum,
            tabmod349acum,
            tabmod123d,
            tabmod216,
            tabmod216d,
            tabmod296r,
            tabmod296d,
            tabmod322,
            tabmod322pro,
            tabmod202,
            tabmod20a,
            tabmod303rs,
            tabmod303p4,
            tabmod102,
            tabmod180r,
            tabmod115d,
            tabmod3901,
            tabmod3902,
            tabmod3902b,
            tabmod3903,
            tabmod390act,
            tabmod3904,
            tabmod3925            
            };
        setTables(array);
        FieldDef tabmod300desArrayf1[] = { tabmod300des.m300ddominio,tabmod300des.m300dnif,tabmod300des.m300dejercicio,tabmod300des.m300dperiodo };
        ForeignKey tabmod300desArrayfk[] = { 
            new ForeignKey(tabmod300,tabmod300desArrayf1)            
            };
        tabmod300des.setForeignKeys(tabmod300desArrayfk);
        FieldDef tabmod190dArrayf1[] = { tabmod190d.m190ddominio,tabmod190d.m190dnif,tabmod190d.m190dejercicio,tabmod190d.m190dperiodo };
        ForeignKey tabmod190dArrayfk[] = { 
            new ForeignKey(tabmod190c,tabmod190dArrayf1)            
            };
        tabmod190d.setForeignKeys(tabmod190dArrayfk);
        FieldDef tabmod347dArrayf1[] = { tabmod347d.m347ddominio,tabmod347d.m347dnif,tabmod347d.m347dejercicio,tabmod347d.m347dperiodo };
        ForeignKey tabmod347dArrayfk[] = { 
            new ForeignKey(tabmod347c,tabmod347dArrayf1)            
            };
        tabmod347d.setForeignKeys(tabmod347dArrayfk);
        FieldDef tabmod347aArrayf1[] = { tabmod347a.m347adominio,tabmod347a.m347anif,tabmod347a.m347aejercicio,tabmod347a.m347aperiodo };
        FieldDef tabmod347aArrayf2[] = { tabmod347a.m347aidentd };
        ForeignKey tabmod347aArrayfk[] = { 
            new ForeignKey(tabmod347c,tabmod347aArrayf1),
            new ForeignKey(tabmod347d,tabmod347aArrayf2)            
            };
        tabmod347a.setForeignKeys(tabmod347aArrayfk);
        FieldDef tabmod193dArrayf1[] = { tabmod193d.m193ddominio,tabmod193d.m193dnif,tabmod193d.m193dejercicio,tabmod193d.m193dperiodo };
        ForeignKey tabmod193dArrayfk[] = { 
            new ForeignKey(tabmod193c,tabmod193dArrayf1)            
            };
        tabmod193d.setForeignKeys(tabmod193dArrayfk);
        FieldDef tabmod349dArrayf1[] = { tabmod349d.m349ddominio,tabmod349d.m349dnif,tabmod349d.m349dejercicio,tabmod349d.m349dperiodo };
        ForeignKey tabmod349dArrayfk[] = { 
            new ForeignKey(tabmod349c,tabmod349dArrayf1)            
            };
        tabmod349d.setForeignKeys(tabmod349dArrayfk);
        FieldDef tabmod349rArrayf1[] = { tabmod349r.m349rdominio,tabmod349r.m349rnif,tabmod349r.m349rejercicio,tabmod349r.m349rperiodo };
        ForeignKey tabmod349rArrayfk[] = { 
            new ForeignKey(tabmod349c,tabmod349rArrayf1)            
            };
        tabmod349r.setForeignKeys(tabmod349rArrayfk);
        FieldDef tabmodintdArrayf1[] = { tabmodintd.mintddominio,tabmodintd.mintdnif,tabmodintd.mintdejercicio,tabmodintd.mintdperiodo,tabmodintd.mintdflujo };
        ForeignKey tabmodintdArrayfk[] = { 
            new ForeignKey(tabmodintc,tabmodintdArrayf1)            
            };
        tabmodintd.setForeignKeys(tabmodintdArrayfk);
        FieldDef tabmod300prodesArrayf1[] = { tabmod300prodes.m300pdominio,tabmod300prodes.m300pnif,tabmod300prodes.m300pejercicio,tabmod300prodes.m300pperiodo };
        ForeignKey tabmod300prodesArrayfk[] = { 
            new ForeignKey(tabmod300,tabmod300prodesArrayf1)            
            };
        tabmod300prodes.setForeignKeys(tabmod300prodesArrayfk);
        FieldDef tabmod296dArrayf1[] = { tabmod296d.m296ddominio,tabmod296d.m296dnif,tabmod296d.m296dejercicio,tabmod296d.m296dperiodo };
        ForeignKey tabmod296dArrayfk[] = { 
            new ForeignKey(tabmod296r,tabmod296dArrayf1)            
            };
        tabmod296d.setForeignKeys(tabmod296dArrayfk);
        FieldDef tabmod20aArrayf1[] = { tabmod20a.m20adominio,tabmod20a.m20anif,tabmod20a.m20aejercicio,tabmod20a.m20aperiodo };
        ForeignKey tabmod20aArrayfk[] = { 
            new ForeignKey(tabmod202,tabmod20aArrayf1)            
            };
        tabmod20a.setForeignKeys(tabmod20aArrayfk);
        FieldDef tabmod180rArrayf1[] = { tabmod180r.m180rdominio,tabmod180r.m180rnif,tabmod180r.m180rejercicio,tabmod180r.m180rperiodo };
        ForeignKey tabmod180rArrayfk[] = { 
            new ForeignKey(tabmod180e,tabmod180rArrayf1)            
            };
        tabmod180r.setForeignKeys(tabmod180rArrayfk);
        FieldDef tabmod3902Arrayf1[] = { tabmod3902.m902dominio,tabmod3902.m902nif,tabmod3902.m902ejercicio,tabmod3902.m902periodo };
        ForeignKey tabmod3902Arrayfk[] = { 
            new ForeignKey(tabmod3901,tabmod3902Arrayf1)            
            };
        tabmod3902.setForeignKeys(tabmod3902Arrayfk);
        FieldDef tabmod3902bArrayf1[] = { tabmod3902b.m9b2dominio,tabmod3902b.m9b2nif,tabmod3902b.m9b2ejercicio,tabmod3902b.m9b2periodo };
        ForeignKey tabmod3902bArrayfk[] = { 
            new ForeignKey(tabmod3901,tabmod3902bArrayf1)            
            };
        tabmod3902b.setForeignKeys(tabmod3902bArrayfk);
        FieldDef tabmod3903Arrayf1[] = { tabmod3903.m903dominio,tabmod3903.m903nif,tabmod3903.m903ejercicio,tabmod3903.m903periodo };
        ForeignKey tabmod3903Arrayfk[] = { 
            new ForeignKey(tabmod3901,tabmod3903Arrayf1)            
            };
        tabmod3903.setForeignKeys(tabmod3903Arrayfk);
        FieldDef tabmod390actArrayf1[] = { tabmod390act.m90adominio,tabmod390act.m90anif,tabmod390act.m90aejercicio,tabmod390act.m90aperiodo };
        ForeignKey tabmod390actArrayfk[] = { 
            new ForeignKey(tabmod3901,tabmod390actArrayf1)            
            };
        tabmod390act.setForeignKeys(tabmod390actArrayfk);
        FieldDef tabmod3904Arrayf1[] = { tabmod3904.m904dominio,tabmod3904.m904nif,tabmod3904.m904ejercicio,tabmod3904.m904periodo };
        ForeignKey tabmod3904Arrayfk[] = { 
            new ForeignKey(tabmod3901,tabmod3904Arrayf1)            
            };
        tabmod3904.setForeignKeys(tabmod3904Arrayfk);
        FieldDef tabmod3925Arrayf1[] = { tabmod3925.m925dominio,tabmod3925.m925nif,tabmod3925.m925ejercicio,tabmod3925.m925periodo };
        ForeignKey tabmod3925Arrayfk[] = { 
            new ForeignKey(tabmod3901,tabmod3925Arrayf1)            
            };
        tabmod3925.setForeignKeys(tabmod3925Arrayfk);
        }
    }
    
