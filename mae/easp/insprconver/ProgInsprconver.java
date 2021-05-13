// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Thu May 13 16:54:12 CEST 2021
// 
// Aplicación: easp
// 
package mae.easp.insprconver;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: insprconver
// Nombre:   Actualizar BD a versión vigente de EA
// Versión:  4.1
// 
public class ProgInsprconver extends Program
    {
    public AppEasp easp;
    public ProgInsprconver insprconver;
    // GLOBALES: PROGRAMA
    // Indica la versión mínima desde la que este programa puede convertir
public String versionMinima="1.1";
public String errorMessage="";
public String sqlOperation="";

//public String tipoDB=Aplication.getAplication().getDataBase().getDB().getType();
public String tipoDB=Easp.connEA.getDB().getType();

public String getMemo(int tamany) {
  if (tipoDB.toUpperCase().equals("ACCESS"))
    return " MEMO,";
  else
    return " VARCHAR("+tamany+"),";
  }
public String getMemoSinComa(int tamany) {
  if (tipoDB.toUpperCase().equals("ACCESS"))
    return " MEMO";
  else
    return " VARCHAR("+tamany+")";
  }
public String formatoData() {
    if (tipoDB.toUpperCase().equals("ACCESS")) return " DATE";
    else
      return " DATETIME";
    }

public String formatData() {
  if (tipoDB.toUpperCase().equals("ACCESS"))
    return " DATE,";
  else
    return " DATETIME,";
  }

// 27-5-2002 idjoan 1.1 -> 2.1 -------------------------------------------------------
// Taula SETUPAPL nova
// VALORES.VADESC canvi de tipus. Posat com varchar
// Taula PAIS afegits dos camps nous. Codis per aeat i ss
// Taula NIFES afegits dos camps: datletraseti i datipf
// FI --------------------------------------------------------------------------------
// 12-07-2002 idtxetxu 2.1 -> 2.2--------------------------------
// Afegir la impresora IMPWIN per poder imprimir en modus gràfic
// S'afegeixen registres a IMPRESOR i IMPGRUPO
// 30-09-2002 apmanel 2.1 -> 2.2 canvi del codi de compta a BANCOCLI i ASIGNACIONES de
// integer a varchar
// 12-11-2002 apmanel 2.2 -> 2.3--------------------------------
// crear taula BDSCARGADAS, omplir de dades a partir de BDSENLINEA
// i borrar BDSENLINEA. generar camps nous a CDP per bd propia o no i si esta local o viatjant
// 15-01-2003 apmanel 2.3 -> 2.4---------------------------------
// borrar i crear SETUPAPL per ajustar per usuari
// netejar taula USPERMGE i afegir nous registres
// 26-03-2003 idtxetxu 2.4 -> 2.5
// s'afegeix el camp domini a 6 taules
// camp cbienes al NIFES i camp observacions a CDP
// per ACCESS es canvia la longitud del camp datletraseti (4)
// es borra registre de taula USPERMGE
// s'inserten registres de demo a les taules NIFES y CDP
// 9-04-2003 idtxetxu 2.5 -> 2.6
// update de dominio
// 5-05-2003 idtxetxu 2.6 -> 2.7
// nova taula NIFESMUF
// nova taula PARAMETROS (plena)
// s'elimina i es torna aposar la taula AYUDATXT
// delete dels registres 8-600 i 28-600 de ADMHACIENDA
// actualitzar registres de la taula MUNICIPIO
  String sentencias[]={
    "DROP TABLE VALORES",
    "CREATE TABLE SETUPAPL"+
    "  (setapl CHAR(8) NOT NULL,"+
    "   setvariable VARCHAR(15) NOT NULL,"+
    "   settitulo VARCHAR(30),"+
    "   setdesc VARCHAR(255),"+
    "   setvalor VARCHAR(80),"+
    "   PRIMARY KEY (setapl,setvariable))",
    "CREATE TABLE VALORES"+
    "  (vaapl CHAR(8) NOT NULL,"+
    "   vacampo CHAR(15) NOT NULL,"+
    "   vacodigo CHAR(15) NOT NULL,"+
    "   vadesc VARCHAR(45),"+
    "   vaorden INTEGER,"+
    "   vavalor FLOAT,"+
    "   PRIMARY KEY (vaapl,vacampo,vacodigo))",
    "ALTER TABLE NIFES ADD datletraseti CHAR(4), datipf CHAR(1)",
    "ALTER TABLE PAIS ADD picodigoaeat INTEGER, picodigoss INTEGER",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','AL','Alameda',17,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','AP','Apartamento',15,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','AV','Avenida',4,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','BL','Bloque',14,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','BO','Barrio',12,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','CH','Chalet',7,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','CL','Calle',1,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','CM','Camino',16,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','CO','Colonia',10,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','CR','Carretera',5,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','CS','Caserio',9,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','CT','Cuesta',8,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','ED','Edificio',11,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','GL','Glorieta',30,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','GR','Grupo',18,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','LU','Lugar',13,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','MC','Mercado',20,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','MN','Municipio',21,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','MZ','Manzana',22,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','PB','Poblado',23,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','PG','Polígono',24,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','PJ','Pasaje',25,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','PQ','Parque',26,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','PR','Prolongación',27,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','PS','Paseo',2,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','PZ','Plaza',3,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','RB','Rambla',28,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','RD','Ronda',6,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','TR','Travesía',29,NULL)",
    "INSERT INTO VALORES VALUES ('EA','DATSIGLAS','UR','Urbanización',19,NULL)"
    };
  String sentencias2[]={
    "DELETE FROM IMPGRUPO WHERE GRIMPRE ='IMPWIN'",
    "DELETE FROM IMPRESOR WHERE IMNOMBRE ='IMPWIN'",
    "INSERT INTO IMPRESOR VALUES (1,'IMPWIN','Impresoras de Windows',NULL,'HP','DIN-A4','F')",
    "INSERT INTO IMPGRUPO VALUES (1,'TODAS','IMPWIN','G')",
    "DROP TABLE BANCOCLI",
    "CREATE TABLE BANCOCLI"+
    "  (bcccodigo CHAR(12) NOT NULL,"+
    "   bccbanco INTEGER NOT NULL,"+
    "   bccsucursal INTEGER NOT NULL,"+
    "   bccnumero VARCHAR(10),"+
    "   bccdigitos INTEGER NOT NULL,"+
    "   bccsg CHAR(2),"+
    "   bccvia VARCHAR(45),"+
    "   bccnum VARCHAR(6),"+
    "   bccescalera VARCHAR(2),"+
    "   bccpiso VARCHAR(6),"+
    "   bccletra VARCHAR(2),"+
    "   bccpoblacion VARCHAR(30),"+
    "   bcccodmuni INTEGER,"+
    "   bcccodpostal CHAR(5),"+
    "   bccprovincia INTEGER,"+
    "   PRIMARY KEY (bcccodigo,bccbanco,bccsucursal,bccnumero,bccdigitos),"+
    "   FOREIGN KEY (bcccodigo) REFERENCES CDP(cdpcodi),"+
    "   FOREIGN KEY (bccbanco) REFERENCES BANCO(bncodigo),"+
    "   FOREIGN KEY (bccprovincia,bcccodmuni) REFERENCES MUNICIPIO(muprov,mucodigo),"+
    "   FOREIGN KEY (bccprovincia) REFERENCES PROVINCIA(pvcodigo));",
    "DROP TABLE ASIGNACIONES",
    "CREATE TABLE ASIGNACIONES"+
    "  (abacodigo CHAR(12) NOT NULL,"+
    "   abatipo CHAR(3) NOT NULL,"+
    "   ababanco INTEGER,"+
    "   absucursal INTEGER,"+
    "   abnumero VARCHAR(10),"+
    "   abadigito INTEGER,"+
    "   PRIMARY KEY (abacodigo,abatipo),"+
    "   FOREIGN KEY (abacodigo) REFERENCES CDP(cdpcodi));"
    };
  String sentencias3[]={
   "CREATE TABLE BDSCARGADAS"+
   "(bdaplic       CHAR(15) NOT NULL,"+
   " bddominio     CHAR(12) NOT NULL,"+
   " bdejer        INTEGER NOT NULL,"+
   " bddesc        VARCHAR(45) NOT NULL,"+
   " bdtipo        VARCHAR(15),"+
   " bdbdnom       VARCHAR(30),"+
   " bdbduser      VARCHAR(15),"+
   " bdbdpass      VARCHAR(15),"+
   " bdbdserv      VARCHAR(255),"+
   " PRIMARY KEY (bdaplic,bddominio,bdejer));",
   "DROP TABLE BDSENLINEA",
   "ALTER TABLE CDP ADD cdpbdcomunomina CHAR(1),cdpbdcomuconta CHAR(1),cdpbdcomueo CHAR(1),cdpbdcomuiss CHAR(1),cdpbdcomurenta CHAR(1),cdpbdestanomina CHAR(1),cdpbdestaconta CHAR(1),cdpbdestaeo CHAR(1),cdpbdestaiss CHAR(1),cdpbdestarenta CHAR(1)"
    };

private void checkTablasInformeJConta () {
}
    // Metodos
    // Ventana
    public FormVproceso vproceso;
    // Selects
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Actualizar BD a versión vigente de EA");
            }
        }
        
    public class FormVproceso extends ProcessForm
        {
        // GLOBALES: VENTANA
        boolean conversion() {

  String sentencias4[]={
   "DROP TABLE SETUPAPL",
   "CREATE TABLE SETUPAPL"+
   "(setapl CHAR(8) NOT NULL,"+
   " setusuario CHAR(20) NOT NULL,"+
   " setvariable VARCHAR(15) NOT NULL,"+
   " settitulo VARCHAR(30),"+
   " setdesc VARCHAR(255),"+
   " setvalor VARCHAR(80),"+
   " PRIMARY KEY (setapl,setusuario,setvariable));",
   "INSERT INTO USUARIO VALUES(1,'bloqueado','Usuario para bloqueo de empresas',null,null,null,null,null,null,null,null,null,null,null,null,null)",
   "INSERT INTO USAGRUP VALUES(1,'Todos','bloqueado')",
   "DELETE FROM USPERMGE",
   "INSERT INTO USPERMGE VALUES ('Administradores','ADMON','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.auxcambio','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.auxcondlist','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.auxdefimport','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.auxdeflis','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.auxrecons','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.auxrenumera','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.empprborra','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.empprejercicio','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.insconverant','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.insconverant2','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.insprparam','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.plaprestructura','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','EASP','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.anutra347','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.asiapertura','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.asiasiento','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.asidescuadre','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.asipunteo','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.auximportasigyc','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.auxtraspaso','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.cobprgestion','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.ivaprregistro','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.plaprcuentas.vclipro','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','CONTAASP.PLAPRCUENTAS.VPLANCUENTAS.@DELETE','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','CONTAASP.PLAPRCUENTAS.VPLANCUENTAS.@EDIT','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','CONTAASP.PLAPRCUENTAS.VPLANCUENTAS.@INSERT','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.plaprcuentas.vplancuentas.restodatsubcta','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.anacompro','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.anucierre','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.anuinvcierre','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.asitipif','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.auxtareadef','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.baldefratios','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.empprcontrol','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.empprgestion.vactividad','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.empprgestion.vcontrol','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.empprgestion.vduplica.acopiaplan','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','CONTAASP.EMPPRGESTION.VEMPRESA1.@EDIT','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.empprtareas','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','CONTAASP.INSPRFECHAS.VFECHAS.BTALTAEMPRESA','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.invprcuadamor','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.invprgenerar','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.asiprasiento.vasientol.iraasiento','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','CONTAASP.EMPPRCONTROL.VDUPLICA','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','CONTAASP.AUXBAJAASIENTOS','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','CONTAASP.EMPRGESTION.VDUPLICA','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.invprgestion','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.plaprconsolida','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','contaasp.plaprcuentas.vplancuentas.iraestructura','+')",
   "INSERT INTO USPERMGE VALUES ('Administradores','contaasp.auxinciden','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','CONTAASP.ASIPREXTRACTO.VEXTRACTOL.CALPUNTEO','+')",
   "INSERT INTO USPERMGE VALUES ('CONTABLE','CONTAASP.ASIPREXTRACTO.VEXTRACTOL.CALCONCILIACION','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','contaasp.asiasientos.vasientos.iraasientos','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','CONTAASP.ASIASIENTOS.VASIENTOS.IRAVCOPIA','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','CONTAASP.ASIASIENTOS.VASIENTOS.IRACOBROSPAGOS','+')",
   "INSERT INTO USPERMGE VALUES ('ASIENTOS','CONTAASP.ASIASIENTOS.VASIENTOS.@DELETE','+')",
   "INSERT INTO USRECURSOS VALUES ('CONTAASP.AUXBAJAASIENTOS',null)",
   "INSERT INTO USRECURSOS VALUES ('CONTAASP.EMPRGESTION.VDUPLICA','Duplicar plan de cuentas')",
   "INSERT INTO USRECURSOS VALUES ('CONTAASP.ASIPREXTRACTO.VEXTRACTOL.CALPUNTEO','Punteo')",
   "INSERT INTO USRECURSOS VALUES ('CONTAASP.ASIPREXTRACTO.VEXTRACTOL.CALCONCILIACION','Conciliación')",
   "INSERT INTO USRECURSOS VALUES ('CONTAASP.ASIASIENTOS.VASIENTOS.IRAVCOPIA','Copia')",
   "INSERT INTO USRECURSOS VALUES ('CONTAASP.ASIASIENTOS.VASIENTOS.@DELETE','borrar')",
   "INSERT INTO USRECURSOS VALUES ('CONTAASP.ASIASIENTOS.VASIENTOS.IRACOBROSPAGOS','Cobros/Pagos')"
    };
  String sentencias5[]={
  "DELETE FROM USPERMGE WHERE USPGRUPO='CONTABLE' AND USPRECURSO='CONTAASP.EMPPRCONTROL.VDUPLICA';",
  "ALTER TABLE NIFES ADD datdominio CHAR(12),datcbienes CHAR(1);",
  "ALTER TABLE CDP ADD cdpdominio CHAR(12),cdpobserv VARCHAR(255);",
  "ALTER TABLE REPRESENTANTES ADD repdominio CHAR(12);",
  "ALTER TABLE ASIGNACIONES ADD abadominio CHAR(12);",
  "ALTER TABLE NUMERACIONES ADD numdominio CHAR(12);",
  "ALTER TABLE BANCOCLI ADD bccdominio CHAR(12);",
  "INSERT INTO NIFES (datprov, danifcif, datapell1, datapell2, datcbienes, datcontacto, datcpos, datdominio, datemail, datfisicajuri, datipf, datipo, datletraseti, datmuni, datnombre, datnum, datpais, datpobla, datsiglas, dattel, datvia) VALUES (8, '39338681X', 'APELLIDO', 'SEGUNDO', 'N', 'JOSE MARIA APELLIDO SEGUNDO', '08640', '999999000000', 'dada@geyce.es', 'F', '1', 'D', 'RERE', 1, 'JOSE MARIA', '78', 108, 'ABRERA', 'CL', '934564373', 'MIQUEL COLL I ALENTORN');",
  "INSERT INTO NIFES (datprov, danifcif, datapell1, datapell2, datcbienes, datcontacto, datcpos,datdominio, datfisicajuri, datipf, datipo, datletraseti,datmuni, datnombre, datnum, datpais, datpobla, datsiglas, dattel, datvia) VALUES (2, '33000000Z', 'EMPRESA', 'EXPORTADORA', 'N', 'NOMBRE EMPRESA EXPORTADORA', '02154', '999999000000', 'F', '1', 'D', 'RERE',11, 'NOMBRE', '100', 108, 'AYNA', 'CL', '3427823', 'DIRECCION');",
  "INSERT INTO NIFES (datprov, danifcif, datapell1, datapell2, datcbienes, datcontacto, datcpos, datdominio, datfisicajuri, datipf, datipo, datletraseti,datmuni, datnombre, datnum, datpais, datpobla, datsiglas, dattel, datvia) VALUES (10, '04000000R', 'MODULOS', 'ESTIMACION', 'N', 'NOMBRE MODULOS ESTIMACION', '10154', '999999000000', 'F', '1', 'D', 'RERE',13, 'NOMBRE', '10', 108, 'ALDEA DE TRUJILLO', 'CL', '343221213', 'DIRECCION');",
  "INSERT INTO NIFES (datprov, danifcif, datapell1, datcbienes, datcontacto, datcpos, datdominio, datemail, datesc, datfisicajuri, datipf, datipo,datmuni, datnum, datpais, datpiso, datpobla, datsiglas, dattel, datvia) VALUES (8, 'A58000001', 'RAZON SOCIAL S.A.', 'N', 'PERSONA DE CONTACTO', '08198','999999000000', 'razon@geyce.es', 'A', 'J', '9', 'D', 88, '12', 108, '1', 'BARCELONA', 'AV', '934545666', 'ALAMEDA');",
  "INSERT INTO CDP (cdpaeatdele, cdpaeatadm, cdpcodi, cdpdominio, cdpnifcif, cdpref) VALUES (8, 279, '999999999991', '999999000000', '39338681X', 'APELLIDO');",
  "INSERT INTO CDP (cdpaeatdele, cdpaeatadm, cdpcodi, cdpdominio, cdpnifcif, cdpref) VALUES (8, 600, '999999999992', '999999000000', 'A58000001', 'RAZON SOCIAL S.A.');",
  "INSERT INTO CDP (cdpaeatdele, cdpaeatadm, cdpcodi, cdpdominio, cdpnifcif, cdpref) VALUES (10, 134, '999999999993', '999999000000', '04000000R', 'MODULOS');",
  "INSERT INTO CDP (cdpaeatdele, cdpaeatadm, cdpcodi, cdpdominio, cdpnifcif, cdpref) VALUES (2, 69, '999999999994', '999999000000', '33000000Z', 'EMPRESA');"};
  String sentencias6[]={
  "UPDATE NIFES SET datdominio='"+Easp.dominio+"';",
  "UPDATE CDP SET cdpdominio='"+Easp.dominio+"';",
  "UPDATE REPRESENTANTES SET repdominio='"+Easp.dominio+"';",
  "UPDATE ASIGNACIONES SET abadominio='"+Easp.dominio+"';",
  "UPDATE NUMERACIONES SET numdominio='"+Easp.dominio+"';",
  "UPDATE BANCOCLI SET bccdominio='"+Easp.dominio+"';"};
  String sentencias7[]={
  "DROP TABLE AYUDATXT;",
  "DROP TABLE NIFESMUF;",
  "DROP TABLE PARAMETROS;",
  "CREATE TABLE AYUDATXT"+
  "   (ayprocedure VARCHAR(50) NOT NULL,"+
  "    ayidioma    CHAR(3) NOT NULL,"+
  "    aytexto     "+getMemo(4000)+
  "    PRIMARY KEY (ayprocedure,ayidioma));",
  "CREATE TABLE NIFESMUF "+
  " (mufnif      CHAR(15) NOT NULL,"+
  " mufnum       INTEGER NOT NULL,"+
  " mufad        VARCHAR(1),"+
  " muftipod     VARCHAR(1),"+
  " mufpercont   FLOAT,"+
  " mufnifad     VARCHAR(15),"+
  " mufnombre    VARCHAR(50),"+
  " mufsexo      VARCHAR(1),"+
  " muffecnac    "+formatData()+
  " muffecadop   "+formatData()+
  " mufperdisc   FLOAT,"+
  " mufayudadesp VARCHAR(1),"+
  " mufingresos  FLOAT,"+
  " mufnumreparto INTEGER,"+
  " mufdeducible VARCHAR(1),"+
  " PRIMARY KEY (mufnif,mufnum),"+
  " FOREIGN KEY (mufnif) REFERENCES NIFES (danifcif));",
  "CREATE TABLE PARAMETROS "+
  "(pardominio    VARCHAR(12)  NOT NULL,"+
  " parusuario     VARCHAR(25)  NOT NULL,"+
  " parambito      VARCHAR(20)  NOT NULL,"+
  " parvariable    VARCHAR(15)  NOT NULL,"+
  " pardesc        VARCHAR(80),"+
  " partipo        VARCHAR(1), "+
  " paragrup       VARCHAR(8), "+
  " parvalor       VARCHAR(255),"+
  " parespecific   VARCHAR(1),  "+
  " PRIMARY KEY (pardominio,parusuario,parambito,parvariable));",
  " DELETE FROM ADMHACIENDA WHERE ahdele=8 AND ahcodigo=600;",
  " DELETE FROM ADMHACIENDA WHERE ahdele=28 AND ahcodigo=600;",
  " UPDATE MUNICIPIO SET MUDESC='POLLENÇA' WHERE MUPROV=7 AND MUCODIGO=42;",
  " UPDATE MUNICIPIO SET MUDESC='SANT LLORENÇ DES CAR' WHERE MUPROV=7 AND MUCODIGO=51;",
  " UPDATE MUNICIPIO SET MUDESC='ARGENÇOLA' WHERE MUPROV=8 AND MUCODIGO=8;",
  " UPDATE MUNICIPIO SET MUDESC='VILLA' WHERE MUPROV=8 AND MUCODIGO=62;",
  " UPDATE MUNICIPIO SET MUDESC='CASTELLTERÇOL' WHERE MUPROV=8 AND MUCODIGO=64;",
  " UPDATE MUNICIPIO SET MUDESC='CORÇA' WHERE MUPROV=17 AND MUCODIGO=57;",
  " UPDATE MUNICIPIO SET MUDESC='FLAÇA' WHERE MUPROV=17 AND MUCODIGO=67;",
  " UPDATE MUNICIPIO SET MUDESC='LLANÇA' WHERE MUPROV=17 AND MUCODIGO=92;",
  " UPDATE MUNICIPIO SET MUDESC='MAÇANET DE CABRENYS' WHERE MUPROV=17 AND MUCODIGO=102;",
  " UPDATE MUNICIPIO SET MUDESC='MAÇANET DE LA SELVA' WHERE MUPROV=17 AND MUCODIGO=103;",
  " UPDATE MUNICIPIO SET MUDESC='SANT LLORENÇ DE LA M' WHERE MUPROV=17 AND MUCODIGO=171;"};

  // "INSERT INTO TRANSACCIONES (tratipo , tradesc , traemre , traregimen) VALUES ('EBU','Emitida bienes usados','E','IN');",
  // "INSERT INTO TRANSACCIONES (tratipo , tradesc , traemre , traregimen) VALUES ('EAV','Emitida agencias viajes','E','IN');",
  String sentencias8[]={
  "ALTER TABLE NIFES ALTER COLUMN datletraseti CHAR(4);",
  "INSERT INTO BANCO ( bncodigo,bndesc  ) VALUES (3189,'MULTICAJA' );",
  "DELETE FROM ADMHACIENDA WHERE ahdele=8 AND ahcodigo=601;",
  "DELETE FROM ADMHACIENDA WHERE ahdele=8 AND ahcodigo=609;",
  "UPDATE CDP SET cdpaeatdele=8 , cdpaeatadm=602 WHERE cdpaeatdele=8 and cdpaeatadm=601;",
  "UPDATE CDP , NIFES  SET cdpaeatdele=8 , cdpaeatadm=605 WHERE cdpaeatdele=8 and cdpaeatadm=609 and datcpos='08025' and cdpnifcif = danifcif ;",
  "UPDATE CDP , NIFES  SET cdpaeatdele=8 , cdpaeatadm=608 WHERE cdpaeatdele=8 and cdpaeatadm=609 and datcpos='08026' and cdpnifcif = danifcif ;",
  "UPDATE CDP , NIFES  SET cdpaeatdele=8 , cdpaeatadm=606 WHERE cdpaeatdele=8 and cdpaeatadm=609 and datcpos='08041' and cdpnifcif = danifcif ;",
  "DELETE FROM ADMHACIENDA WHERE ahcodigo=850;",
  "DELETE FROM ADMHACIENDA WHERE ahcodigo=950;",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (1,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (2,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (3,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (4,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (5,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (6,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (7,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (8,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (9,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (10,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (11,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (12,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (13,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (14,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (15,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (16,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (17,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (18,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (19,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (20,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (21,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (22,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (23,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (24,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (25,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (26,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (27,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (28,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (29,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (30,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (31,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (32,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (33,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (34,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (35,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (36,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (37,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (38,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (39,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (40,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (41,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (42,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (43,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (44,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (45,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (46,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (47,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (48,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (49,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (50,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (51,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (52,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (53,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (54,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (55,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (56,850,'UGGE (DRI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (1,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (2,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (3,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (4,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (5,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (6,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (7,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (8,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (9,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (10,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (11,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (12,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (13,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (14,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (15,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (16,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (17,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (18,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (19,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (20,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (21,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (22,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (23,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (24,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (25,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (26,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (27,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (28,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (29,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (30,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (31,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (32,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (33,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (34,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (35,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (36,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (37,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (38,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (39,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (40,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (41,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (42,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (43,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (44,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (45,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (46,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (47,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (48,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (49,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (50,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (51,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (52,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (53,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (54,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (55,950,'UCGGE (ONI)');",
  "INSERT INTO ADMHACIENDA (ahdele,ahcodigo,ahdesc) VALUES (56,950,'UCGGE (ONI)');"};

  String sentencias9[]={
  "ALTER TABLE NIFES ADD datnacional INTEGER;",
  "ALTER TABLE BDSCARGADAS ADD bdauxiliar CHAR(1),bddisponible CHAR(1),bdobser VARCHAR(255);"};

  String sentencias4_3[]={
  "DROP TABLE PAIS",
  "CREATE TABLE PAIS            "+
  " (picodigo INTEGER NOT NULL, "+
  "  pidesc VARCHAR(50),        "+
  "  picodigoaeat INTEGER,      "+
  "  picodigoss INTEGER,        "+
  "  picodigo347 VARCHAR(3),    "+
  "  PRIMARY KEY (picodigo));   "};

  String sentencias4_4[]={
" CREATE TABLE LOPDACC                     "+
"    (lopdacodigo INTEGER NOT NULL ,       "+
"     lopdaaplic     VARCHAR(15) ,         "+
"     lopdaejer      INTEGER   ,           "+
"     lopdauser      VARCHAR(15),          "+
"     lopdapuesto    VARCHAR(45),          "+
"     lopdafechaacc  "+formatData()+
"     lopdahoraacc   VARCHAR(8),           "+
"     lopdatipacc    CHAR(1) ,             "+
"     lopdaprogram   VARCHAR(15),          "+
"     lopdadescprog  VARCHAR(50),          "+
"     lopdacodicdp   CHAR(12),             "+
"     lopdanif       VARCHAR(15),          "+
"     PRIMARY KEY (lopdacodigo));          ",
" CREATE TABLE LOPDCOP                     "+
"    (lopdccodigo INTEGER NOT NULL ,       "+
"     lopdcfecha     "+formatData()+
"     lopdchora      VARCHAR(8),           "+
"     lopdctipo      CHAR(1) ,             "+
"     lopdsoporte    VARCHAR(15),          "+
"     lopdcaplic     VARCHAR(15) ,         "+
"     lopdcambito    VARCHAR(30) ,         "+
"     lopdcdestino   VARCHAR(30) ,         "+
"     lopdcuser      VARCHAR(15) ,         "+
"     lopdcfecdevolu  "+formatData()+
"     lopdcfecdestru  "+formatData()+
"     PRIMARY KEY (lopdccodigo));          ",
" CREATE TABLE LOPDINCI                    "+
"    (lopdicodigo INTEGER NOT NULL ,       "+
"     lopdifecha     "+formatData()+
"     lopdihora      VARCHAR(8),           "+
"     lopditipo      VARCHAR(20),          "+
"     lopdiaplic     VARCHAR(15),          "+
"     lopdiuserorig  VARCHAR(15),          "+
"     lopdifechaleid "+formatData()+
"     lopdiuserdest  VARCHAR(15),          "+
"     lopdiconsecuen VARCHAR(70),          "+
"     lopdileido     CHAR(1),              "+
"     PRIMARY KEY (lopdicodigo));          "};

  String sentencias4_5[]={
" create table quefrase                                           "+
"   (qefaplicacion varchar(15) not null,                          "+
"   qeffrase varchar(15) not null,                                "+
"   qefdescripcion varchar(80),                                   "+
"   qefmaster varchar(15) ,                               "+
"   qeftitulo varchar(80),                                        "+
"   qefapaisado char(1) ,                                 "+
"   qefletra integer ,                                    "+
"   qefpaginado char(1) ,                                 "+
"   qeffrom varchar(255),                                         "+
"   qefwhere varchar(255),                                        "+
"   qefect char(1),                                               "+
"   primary key (qefaplicacion, qeffrase));                       ",
" create table quevariables                                       "+
"   (qevaplicacion varchar(15) not null,                          "+
"   qevfrase varchar(15) not null,                                "+
"   qevorden integer not null,                                    "+
"   qevvariable varchar(15) ,                             "+
"   qevtipo integer ,                                     "+
"   qevlongitud integer ,                                 "+
"   qevtitulo varchar(20),                                        "+
"   qevobligatorio char(1) ,                              "+
"   qevpredef varchar(15),                                        "+
"   qevvalor varchar(255),                                        "+
"   qevvisible char(1) ,                                  "+
"   qevcomparacion char(2) ,                              "+
"   qevformato varchar(15),                                       "+
"   primary key (qevaplicacion, qevfrase, qevorden));             ",
" create table quetabla                                           "+
"    (qetaplicacion varchar(15) not null,                         "+
"    qetfrase varchar(15) not null,                               "+
"    qetorden integer not null,                                   "+
"    qettabla varchar(15) ,                               "+
"    primary key (qetaplicacion,qetfrase,qetorden));              ",
" create table quecolumn                                          "+
"    (qecaplicacion varchar(15) not null,                         "+
"    qecfrase varchar(15) not null,                               "+
"    qecorden integer not null,                                   "+
"    qeccampo varchar(15) ,                               "+
"    qectitulo varchar(80),                                       "+
"    qeclongitud integer ,                                "+
"    qectipo integer ,                                    "+
"    qectabla varchar(15) ,                               "+
"    qecvisible char(1) ,                                 "+
"    qecrestriccion varchar(255),                                 "+
"    qecorderby char(1),                                          "+
"    qecacumula char(1) ,                                 "+
"    qecsaltapag char(1) ,                                "+
"    qecinipag char(1) ,                                  "+
"    qecformato varchar(80),                                      "+
"    primary key (qecaplicacion,qecfrase,qecorden));              "};

String sentencias4_6[]={
  " UPDATE PROVINCIA SET PVDESC='LA RIOJA' WHERE PVCODIGO=26;",
  " UPDATE PROVINCIA SET PVDESC='ASTURIAS' WHERE PVCODIGO=33;"};

  String sentencias4_7[]={
  " UPDATE PROVINCIA SET PVDESC='LA RIOJA' WHERE PVCODIGO=26;",
  " UPDATE PROVINCIA SET PVDESC='ASTURIAS' WHERE PVCODIGO=33;",
  " UPDATE ADMHACIENDA SET AHDESC='PALMA DE MALLORCA' WHERE AHDELE=7 AND AHCODIGO=600;",
  " DELETE FROM ADMHACIENDA WHERE AHDELE=28 AND AHCODIGO=605;",
  " UPDATE ADMHACIENDA SET AHDESC='MARIA DE MOLINA' WHERE AHDELE=28 AND AHCODIGO=612;",
  " UPDATE ADMHACIENDA SET AHDESC='EJEA CABALLEROS' WHERE AHDELE=50 AND AHCODIGO=95;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=1 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=2 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=3 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=4 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=5 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=6 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=7 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=8 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=9 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=10 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=11 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=12 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=13 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=14 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=15 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=16 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=17 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=18 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=19 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=20 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=21 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=22 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=23 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=24 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=25 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=26 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=27 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=28 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=29 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=30 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=31 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=32 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=33 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=34 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=35 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=36 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=37 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=38 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=39 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=40 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=41 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=42 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=43 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=44 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=45 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=46 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=47 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=48 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=49 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=50 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=51 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=52 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=53 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=54 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=55 AND AHCODIGO=850;",
  " UPDATE ADMHACIENDA SET AHDESC='UGGE (URI)' WHERE AHDELE=56 AND AHCODIGO=850;"};

  String sentencias4_8[]={
    "CREATE TABLE MIR                                           "+
    "  (mircodi      INTEGER NOT NULL ,                         "+
    "   mircdp       VARCHAR(12),                               "+
    "   mircif       CHAR(15),                                  "+
    "   miractivado  CHAR(1),                                   "+
    "   mirestado    CHAR(1),                                   "+
    "   mirfechacrea  "+formatData()+
    "   mirfechaenvio "+formatData()+
    "   mirdesc      VARCHAR(100),                              "+
    "   miraplic     VARCHAR(15),                               "+
    "   mirtipdoc    VARCHAR(20),                                "+
    "   mirtipfile   VARCHAR(3),                                "+
    "   mirmcodemp      INTEGER,                                "+
    "   mirnomcodcen    INTEGER,                                "+
    "   mirnomcodtra    INTEGER,                                "+
    "   mirubicacion VARCHAR(200),                              "+
    "   PRIMARY KEY (mircodi));                                 "};

  String sentencias4_9[]={
  " DELETE FROM BANCO WHERE bncodigo=2024;",
  " DELETE FROM BANCO WHERE bncodigo=2025;",
  " INSERT INTO BANCO (bncodigo,bndesc) VALUES (2024,'CAJASUR');"};

  String sentencias5_0[]={
    "CREATE TABLE NOTAS "+
    "  (nocodigo        INTEGER NOT NULL,"+
    "    noorigen        VARCHAR(12),"+
    "    nousorigen      CHAR(20),"+
    "    noaplorigen     VARCHAR(15),"+
    "    nousdestino     CHAR(20),"+
    "    noapldestino    VARCHAR(15),"+
    "    noproceso       VARCHAR(15),"+
    "    noestado        CHAR(1),"+
    "    nodescripcion  "+getMemo(512)+
    "    nofecvenc      "+formatData()+
    "    nofecalta      "+formatData()+
    "    nofecvisto     "+formatData()+
    "    PRIMARY KEY (nocodigo));"
    };

  String sentencias5_3[]={
      " UPDATE CDP SET CDPAEATADM=601 where CDPAEATDELE=3 and CDPAEATADM=600;",
      " UPDATE CDP SET CDPAEATADM=601 where CDPAEATDELE=7 and CDPAEATADM=600;",
      " UPDATE CDP SET CDPAEATADM=601 where CDPAEATDELE=14 and CDPAEATADM=602;",
      " UPDATE CDP SET CDPAEATADM=603 where CDPAEATDELE=28 and CDPAEATADM=601;",
      " UPDATE CDP SET CDPAEATADM=603 where CDPAEATDELE=28 and CDPAEATADM=611;",
      " UPDATE CDP SET CDPAEATADM=601 where CDPAEATDELE=30 and CDPAEATADM=600;",
      " UPDATE CDP SET CDPAEATADM=601 where CDPAEATDELE=35 and CDPAEATADM=600;",
      " UPDATE CDP SET CDPAEATADM=606 where CDPAEATDELE=41 and CDPAEATADM=607;"
  };
//  String sentencias5_4[]={
//      " ALTER TABLE AMORTIZACION ADD amoparent VARCHAR(8);",
//      " ALTER TABLE AMORTIZACION ADD amonum VARCHAR(1);",
//      " DELETE FROM AMORTIZACION;",
//      " DELETE FROM VALORES where vaapl='EA' and vacampo='DATSIGLAS';"
//  };
  String sentencias5_4[]={
      " DROP TABLE AMORTIZACION;",
      " CREATE TABLE AMORTIZACION "+
      "  (amocodigo        INTEGER NOT NULL,"+
      "    amogrupo        CHAR(4) NOT NULL,"+
      "    amonumero       INTEGER,"+
      "    amoletra        CHAR(1),"+
      "    amosubdivision     CHAR(2),"+
      "    amodesc    VARCHAR(100),"+
      "    amocoef       FLOAT,"+
      "    amoperiodo        INTEGER,"+
      "    amoparent        VARCHAR(8),"+
      "    amonum         VARCHAR(1),"+
      "    PRIMARY KEY (amocodigo));",
      " DELETE FROM AMORTIZACION;",
      " DELETE FROM VALORES where vaapl='EA' and vacampo='DATSIGLAS';"
  };
  String sentencias5_5[]={
      " UPDATE ADMHACIENDA SET AHDESC='PALMA MALLORCA' WHERE AHDELE=7 AND AHCODIGO=601;",
      " UPDATE ADMHACIENDA SET AHDESC='CORDOBA ESTE' WHERE AHDELE=14 AND AHCODIGO=601;"
  };
  String sentencias5_6[]={
      "CREATE TABLE PERFILTRIBUT       "+
      " (pftejercicio INTEGER NOT NULL,"+
      "  pftnif VARCHAR(15) NOT NULL,  "+
      "  pftgranemp CHAR(1),           "+
      "  pfttipoavisos CHAR(1),        "+
      "  pftemail VARCHAR(80),         "+
      "  pftmovil VARCHAR(15),         "+
      "  pftalquileres CHAR(1),        "+
      "  pftintracom CHAR(1),          "+
      "  pftintrastat CHAR(1),         "+
      "  pftfechafin "+formatData()+
      "  PRIMARY KEY (PFTEJERCICIO,PFTNIF));",
      "CREATE TABLE EMPMODELOS                          "+
      " (emodejercicio INTEGER NOT NULL,                "+
      "  emodnif VARCHAR(15) NOT NULL,                  "+
      "  emodmodelo VARCHAR(5) NOT NULL,                "+
      "  emodtipoper VARCHAR(2),                        "+
      "  emodactivo CHAR(1),                            "+
      "  PRIMARY KEY (EMODEJERCICIO,EMODNIF,EMODMODELO),"+
      "  FOREIGN KEY (EMODEJERCICIO,EMODNIF) REFERENCES PERFILTRIBUT(PFTEJERCICIO,PFTNIF));",
      "CREATE TABLE AVISADO                     "+
      " (aviejercicio INTEGER NOT NULL,         "+
      "  avinif VARCHAR(15) NOT NULL,           "+
      "  avimodelo VARCHAR(5) NOT NULL,         "+
      "  aviperiodo VARCHAR(2) NOT NULL,        "+
      "  avinivel INTEGER NOT NULL,             "+
      "  avifecha "+formatData()+
      "  PRIMARY KEY (AVIEJERCICIO,AVINIF,AVIMODELO,AVIPERIODO,AVINIVEL),"+
      "  FOREIGN KEY (AVIEJERCICIO,AVINIF) REFERENCES PERFILTRIBUT(PFTEJERCICIO,PFTNIF));"
  };
  String sentencias5_7[]={
      "CREATE TABLE AVISADO                     "+
      " (aviejercicio INTEGER NOT NULL,         "+
      "  avinif VARCHAR(15) NOT NULL,           "+
      "  avimodelo VARCHAR(5) NOT NULL,         "+
      "  aviperiodo VARCHAR(2) NOT NULL,        "+
      "  avinivel INTEGER NOT NULL,             "+
      "  avifecha "+formatData()+
      "  PRIMARY KEY (AVIEJERCICIO,AVINIF,AVIMODELO,AVIPERIODO,AVINIVEL),"+
      "  FOREIGN KEY (AVIEJERCICIO,AVINIF) REFERENCES PERFILTRIBUT(PFTEJERCICIO,PFTNIF));"
  };
String sentencias5_8[]={
      "CREATE TABLE PERFILTRIBUT       "+
      " (pftejercicio INTEGER NOT NULL,"+
      "  pftnif VARCHAR(15) NOT NULL,  "+
      "  pftgranemp CHAR(1),           "+
      "  pfttipoavisos CHAR(1),        "+
      "  pftemail VARCHAR(80),         "+
      "  pftmovil VARCHAR(15),         "+
      "  pftalquileres CHAR(1),        "+
      "  pftintracom CHAR(1),          "+
      "  pftintrastat CHAR(1),         "+
      "  pftfechafin "+formatData()+
      "  PRIMARY KEY (PFTEJERCICIO,PFTNIF));",
      "CREATE TABLE EMPMODELOS                          "+
      " (emodejercicio INTEGER NOT NULL,                "+
      "  emodnif VARCHAR(15) NOT NULL,                  "+
      "  emodmodelo VARCHAR(5) NOT NULL,                "+
      "  emodtipoper VARCHAR(2),                        "+
      "  emodactivo CHAR(1),                            "+
      "  PRIMARY KEY (EMODEJERCICIO,EMODNIF,EMODMODELO),"+
      "  FOREIGN KEY (EMODEJERCICIO,EMODNIF) REFERENCES PERFILTRIBUT(PFTEJERCICIO,PFTNIF));",
      "CREATE TABLE AVISADO                     "+
      " (aviejercicio INTEGER NOT NULL,         "+
      "  avinif VARCHAR(15) NOT NULL,           "+
      "  avimodelo VARCHAR(5) NOT NULL,         "+
      "  aviperiodo VARCHAR(2) NOT NULL,        "+
      "  avinivel INTEGER NOT NULL,             "+
      "  avifecha "+formatData()+
      "  PRIMARY KEY (AVIEJERCICIO,AVINIF,AVIMODELO,AVIPERIODO,AVINIVEL),"+
      "  FOREIGN KEY (AVIEJERCICIO,AVINIF) REFERENCES PERFILTRIBUT(PFTEJERCICIO,PFTNIF));"
  };
  String sentencias5_9[]={" DELETE FROM AMORTIZACION;"};

  String sentencias6_0[]={" DELETE FROM AYUDATXT WHERE ayprocedure like 'JEO%';"};
  String sentencias6_1[]={
    "CREATE TABLE TIPOVIAS"+
    "  (tvscodigo  VARCHAR(5) NOT NULL,"+
    "   tvsdesc    VARCHAR(30),"+
    "   tvscodant  VARCHAR(2),"+
    "   PRIMARY KEY (tvscodigo));",
    "DELETE FROM TIPOVIAS",
    "CREATE TABLE MUNI347"+
    "  (mu7codprov  INTEGER NOT NULL,"+
    "   mu7codmuni  INTEGER NOT NULL,"+
    "   mu7desc     VARCHAR(50),"+
    "   mu7muniant  INTEGER,"+
    "   PRIMARY KEY (mu7codprov,mu7codmuni));",
    "DELETE FROM MUNI347",};
  String sentencias6_2[]={"ALTER TABLE PERFILTRIBUT ADD pftregdevmen CHAR(1);",
  "UPDATE PERFILTRIBUT SET pftregdevmen='N' where pftregdevmen is null;"};

  String sentencias6_3[]={
    "ALTER TABLE TRANSACCIONES ADD tratipoiva CHAR(3)",
    "ALTER TABLE TRANSACCIONES ADD travoloper CHAR(3)",
    "ALTER TABLE TRANSACCIONES ADD traoperespec CHAR(3)"
  };
  String sentencias6_4[]={
    "DROP TABLE MUNI347",
    "CREATE TABLE MUNI347"+
    "  (mu7codprov  INTEGER NOT NULL,"+
    "   mu7codmuni  INTEGER NOT NULL,"+
    "   mu7desc     VARCHAR(50),"+
    "   mu7muniant  INTEGER,"+
    "   mu7provmuni VARCHAR(5),"+
    "   PRIMARY KEY (mu7codprov,mu7codmuni));"
  };

  String sentencias6_5[]={
    " INSERT INTO BANCO (bncodigo,bndesc) VALUES (2106,'MONTE PIEDAD CAJA AHORROS SAN FERNANDO HUELVA');",
    " INSERT INTO MUNICIPIO (muprov,mucodigo,mudesc) VALUES (28,903,'TRES CANTOS');"
  };

  String sentencias6_6[]={
    "CREATE TABLE CNAE2009 " +
    " (cn9codigo VARCHAR(6) NOT NULL," +
    "  cn9desc   VARCHAR(120)," +
    "  PRIMARY KEY (cn9codigo));",
    "CREATE TABLE CNAEEQUIV "+
    " (cnecod93   VARCHAR(6) NOT NULL,"+
    "  cnecod09   VARCHAR(6) NOT NULL,"+
    "  cnedesc93  VARCHAR(120),"+
    "  cnedesc09  VARCHAR(120),"+
    "  PRIMARY KEY (cnecod93,cnecod09));",
    " DELETE FROM CNAE2009;",
    " DELETE FROM CNAEEQUIV;"
  };
  String sentencias6_7[]={
    "ALTER TABLE EPIGRAFES ADD epiepisinpunto VARCHAR(4);",
    "DELETE FROM EPIGRAFES;",
  };
  String sentencias6_8[]={
    "DELETE FROM VALORES;",
    "ALTER TABLE NIFES ADD datfftvia  VARCHAR(5);",
    "ALTER TABLE NIFES ADD datfvia    VARCHAR(50);",
    "ALTER TABLE NIFES ADD datftnum   VARCHAR(3);",
    "ALTER TABLE NIFES ADD datfnum    INTEGER;",
    "ALTER TABLE NIFES ADD datfcalnum VARCHAR(3);",
    "ALTER TABLE NIFES ADD datfbloque VARCHAR(3);",
    "ALTER TABLE NIFES ADD datfportal VARCHAR(3);",
    "ALTER TABLE NIFES ADD datfescal  VARCHAR(3);",
    "ALTER TABLE NIFES ADD datfplanta VARCHAR(3);",
    "ALTER TABLE NIFES ADD datfpuerta VARCHAR(3);",
    "ALTER TABLE NIFES ADD datfcomp   VARCHAR(40);",
    "ALTER TABLE NIFES ADD datflocal  VARCHAR(30);",
    "ALTER TABLE NIFES ADD datfemail  VARCHAR(100);",
    "ALTER TABLE NIFES ADD datfprov   INTEGER;",
    "ALTER TABLE NIFES ADD datfcodmun VARCHAR(5);",
    "ALTER TABLE NIFES ADD datfnommun VARCHAR(30);",
    "ALTER TABLE NIFES ADD datfcpost  VARCHAR(5);",
    "ALTER TABLE NIFES ADD datftel    INTEGER;",
    "ALTER TABLE NIFES ADD datfmovil  INTEGER;",
    "ALTER TABLE NIFES ADD datffax    INTEGER;",
    "ALTER TABLE NIFES ADD datnftvia  VARCHAR(5);",
    "ALTER TABLE NIFES ADD datnvia    VARCHAR(50);",
    "ALTER TABLE NIFES ADD datntnum   VARCHAR(3);",
    "ALTER TABLE NIFES ADD datnnum    INTEGER;",
    "ALTER TABLE NIFES ADD datncalnum VARCHAR(3);",
    "ALTER TABLE NIFES ADD datnbloque VARCHAR(3);",
    "ALTER TABLE NIFES ADD datnportal VARCHAR(3);",
    "ALTER TABLE NIFES ADD datnescal  VARCHAR(3);",
    "ALTER TABLE NIFES ADD datnplanta VARCHAR(3);",
    "ALTER TABLE NIFES ADD datnpuerta VARCHAR(3);",
    "ALTER TABLE NIFES ADD datncomp   VARCHAR(40);",
    "ALTER TABLE NIFES ADD datnlocal  VARCHAR(30);",
    "ALTER TABLE NIFES ADD datnemail  VARCHAR(100);",
    "ALTER TABLE NIFES ADD datnprov   INTEGER;",
    "ALTER TABLE NIFES ADD datncodmun VARCHAR(5);",
    "ALTER TABLE NIFES ADD datnnommun VARCHAR(30);",
    "ALTER TABLE NIFES ADD datncpost  VARCHAR(5);",
    "ALTER TABLE NIFES ADD datntel    INTEGER;",
    "ALTER TABLE NIFES ADD datnmovil  INTEGER;",
    "ALTER TABLE NIFES ADD datnfax    INTEGER;",
    "ALTER TABLE NIFES ADD datnapcor VARCHAR(10);",
    "ALTER TABLE NIFES ADD datnpobla VARCHAR(30);",
    "ALTER TABLE NIFES ADD datnprov2 INTEGER;",
    "ALTER TABLE NIFES ADD datncpost2 VARCHAR(5);",
    "ALTER TABLE NIFES ADD datntel2 INTEGER;",
    "ALTER TABLE NIFES ADD datnmovil2 INTEGER;",
    "ALTER TABLE NIFES ADD datnfax2 INTEGER;",
    "ALTER TABLE NIFES ADD datsftvia  VARCHAR(5);",
    "ALTER TABLE NIFES ADD datsvia    VARCHAR(50);",
    "ALTER TABLE NIFES ADD datstnum   VARCHAR(3);",
    "ALTER TABLE NIFES ADD datsnum    INTEGER;",
    "ALTER TABLE NIFES ADD datscalnum VARCHAR(3);",
    "ALTER TABLE NIFES ADD datsbloque VARCHAR(3);",
    "ALTER TABLE NIFES ADD datsportal VARCHAR(3);",
    "ALTER TABLE NIFES ADD datsescal  VARCHAR(3);",
    "ALTER TABLE NIFES ADD datsplanta VARCHAR(3);",
    "ALTER TABLE NIFES ADD datspuerta VARCHAR(3);",
    "ALTER TABLE NIFES ADD datscomp   VARCHAR(40);",
    "ALTER TABLE NIFES ADD datslocal  VARCHAR(30);",
    "ALTER TABLE NIFES ADD datsemail  VARCHAR(100);",
    "ALTER TABLE NIFES ADD datsprov   INTEGER;",
    "ALTER TABLE NIFES ADD datscodmun VARCHAR(5);",
    "ALTER TABLE NIFES ADD datsnommun VARCHAR(30);",
    "ALTER TABLE NIFES ADD datscpost  VARCHAR(5);",
    "ALTER TABLE NIFES ADD datstel    INTEGER;",
    "ALTER TABLE NIFES ADD datsmovil  INTEGER;",
    "ALTER TABLE NIFES ADD datsfax    INTEGER;",
    "ALTER TABLE NIFES ADD datmovil   INTEGER;"
  };
  String sentencias7_0[]={
    "ALTER TABLE NIFES ALTER COLUMN datemail VARCHAR(100);"
  };
  String sentencias7_1[]={
    "ALTER TABLE NIFES ALTER COLUMN datapell1 VARCHAR(100);",
    "CREATE TABLE CODIGOREGISTRO           "+
    "   (crenombre     CHAR(30) NOT NULL,  "+
    "    crecodigo     VARCHAR(5),         "+
    "    PRIMARY KEY (CRENOMBRE));         ",
    "CREATE TABLE COEFICCORREC                     "+
    "   (coeejerfiscal   INTEGER NOT NULL,         "+
    "    coeejercicio    INTEGER NOT NULL,         "+
    "    coecoeficiente  FLOAT,                    "+
    "    PRIMARY KEY (COEEJERFISCAL,COEEJERCICIO));",
    "CREATE TABLE INDEMORA                  "+
    "   (indejercicio    INTEGER NOT NULL,  "+
    "    inddesdefecha   "+formatData()+
    "    indhastafecha   "+formatData()+
    "    indtipo_vigente FLOAT,             "+
    "    PRIMARY KEY (INDEJERCICIO,INDDESDEFECHA,INDHASTAFECHA));       "
  };

  String sentencias7_2[]={
    "CREATE TABLE PERFILUSUARIO            "+
    "(PFCODIGO VARCHAR(25) NOT NULL ,      "+
    " PFNOMBREPC VARCHAR(25) NOT NULL,     "+
    " PFRESPONSABLE VARCHAR(25),           "+
    " PFPANTALLA INTEGER,                  "+
    " PFUSERGELIX VARCHAR(10),             "+
    " PFGRUPOGELIX VARCHAR(5),             "+
    " PFURLGEYCE "+getMemo(600)+"          "+
    " PFASESOR   INTEGER ,                 "+
    " PRIMARY KEY (PFCODIGO,PFNOMBREPC));  "};

  String sentencias7_4[]={
    "CREATE TABLE DATOSREGISTRAL    "+
    "(drenifcif CHAR(15) NOT NULL,  "+
    "  dreregistro      VARCHAR(5), "+
    "  dretomo          VARCHAR(6), "+
    "  drelibro         VARCHAR(6), "+
    "  dreseccion       VARCHAR(3), "+
    "  drefolio         VARCHAR(5), "+
    "  drehoja          VARCHAR(9), "+
    "  dreinscripcion   VARCHAR(4), "+
    "  drefechainscrip  "+formatData()+
    "  PRIMARY KEY (DRENIFCIF));     "};

  String sentencias7_5[]={
    "ALTER TABLE USUARIO ADD USREMOTO varchar(1)  "};

  String sentencias7_6[]={
    " CREATE TABLE SESIONES                      "+
    "  (sescodigo       INTEGER NOT NULL,        "+
    "   sesmachine      VARCHAR(50),             "+
    "   sesusuario      CHAR(25),                "+
    "   sesfecha        "+formatData()+
    "   seshora         CHAR(8),                 "+
    "   sesaplicacion   VARCHAR(15),             "+
    "   sespermitido    CHAR(1),                 "+
    "   PRIMARY KEY (sescodigo));                ",

    " CREATE TABLE IMPUSER                      "+
    "  (imucodigo       INTEGER NOT NULL,        "+
    "   imumachine      VARCHAR(50),             "+
    "   imuusuario      CHAR(25),                "+
    "   imufecha        "+formatData()+
    "   imuhora         CHAR(8),                 "+
    "   imuaplicacion   VARCHAR(15),             "+
    "   PRIMARY KEY (imucodigo));                "

    };
  String sentencias7_7[]={"DELETE FROM CODIGOREGISTRO"};
  String sentencias7_8[]={"ALTER TABLE TRANSACCIONES ADD traoper349 CHAR(3)"};

  String sentencias7_9[]={
  " CREATE TABLE CNAE1993                       "+
  "   (cn93codigo VARCHAR(4) NOT NULL,          "+
  "    cn93desc   VARCHAR(160),                 "+
  "    PRIMARY KEY (cn93codigo));               "
  };

  String sentencias8_0[]={
    " CREATE TABLE SESIONES                      "+
    "  (sescodigo       INTEGER NOT NULL,        "+
    "   sesmachine      VARCHAR(50),             "+
    "   sesusuario      CHAR(25),                "+
    "   sesfecha        "+formatData()+
    "   seshora         CHAR(8),                 "+
    "   sesaplicacion   VARCHAR(15),             "+
    "   sespermitido    CHAR(1),                 "+
    "   PRIMARY KEY (sescodigo));                ",
    " CREATE TABLE IMPUSER                      "+
    "  (imucodigo       INTEGER NOT NULL,        "+
    "   imumachine      VARCHAR(50),             "+
    "   imuusuario      CHAR(25),                "+
    "   imufecha        "+formatData()+
    "   imuhora         CHAR(8),                 "+
    "   imuaplicacion   VARCHAR(15),             "+
    "   PRIMARY KEY (imucodigo));                "};

  String sentencias8_1[]={"DELETE FROM CNAE1993"};

  String sentencias8_2[]={"DELETE FROM CNAE1993"};
  String sentencias8_4[]={"DELETE FROM MUNI347"};
  String sentencias8_5[]={"DELETE FROM PAIS"};

  String sentencias8_6[]={
  " DELETE FROM BANCO WHERE bncodigo=2107;",
  " INSERT INTO BANCO (bncodigo,bndesc) VALUES (2107,'UNNIM');"};

  String sentencias8_7[]={
  " ALTER TABLE MIR ADD mircliente   CHAR(15)",
  " ALTER TABLE MIR ADD mirexpediente VARCHAR(15)"
  };
String sentencias8_8[]={"DELETE FROM MUNI347"};

String sentencias8_9[]={"DELETE FROM COEFICCORREC WHERE coeejerfiscal=2010"};

  String sentencias9_1[]={
  " ALTER TABLE NIFES ADD datuser    VARCHAR(25)",
  " ALTER TABLE NIFES ADD datgrupo   VARCHAR(15)"
  };
  String sentencias9_2[]={
  " UPDATE MUNI347 SET mu7desc='ODENA' where mu7codprov=8 and mu7codmuni=1430"
  };

  String sentencias9_3[]={"DELETE FROM COEFICCORREC WHERE coeejerfiscal=2011"};

  String sentencias9_4[]={
  " DELETE FROM BANCO WHERE bncodigo=3188;",
  " INSERT INTO BANCO (bncodigo,bndesc) VALUES (3188,'CREDIT VALENCIA C.R.C.C.V.');"};

  String sentencias9_5[]={
   "ALTER TABLE QUEFRASE ADD qefplantilla varchar(15) ",
  };

  String sentencias9_6[]={
   " CREATE TABLE PLANTILLAS                            "+
    "  (PLAPLICACION       VARCHAR(15) NOT NULL,         "+
    "   PLCODIGO           VARCHAR(15) NOT NULL,         "+
    "   PLVENTANA          VARCHAR(15) NOT NULL,         "+
    "   PLDESCRIPCION      VARCHAR(50),                  "+
    "   PLUSUARIO          VARCHAR(25),                  "+
    "   PLCATALOGO         VARCHAR(15),                  "+
    "   PLCODIQUERY        VARCHAR(15),                  "+
    "   PLURLPLANTILLA     VARCHAR(250),                 "+
    "   PLORIGENDADES      VARCHAR(250),                 "+
    "   PLCAMPSCOMBI       INTEGER,                      "+
    "   PLTIPOORIG         CHAR(2),                      "+
    "   PRIMARY KEY (PLAPLICACION,PLCODIGO,PLVENTANA));  ",
  };


  String sentencias9_8[]={
   "ALTER TABLE PLANTILLAS ADD PLTIPOPLAN INTEGER",
  };

  String sentencias9_9[]={"DELETE FROM COEFICCORREC WHERE coeejerfiscal=2012"};

  String sentencias10_1[]={
    "ALTER TABLE NIFES ALTER COLUMN datnombre CHAR(50);",
    "ALTER TABLE NIFES ALTER COLUMN datapell2 CHAR(50);",
    "ALTER TABLE TRANSACCIONES ADD traregemp VARCHAR(1);",
    "UPDATE TRANSACCIONES SET travoloper = 'NO' WHERE tratipo='END' and travoloper='EX' and traoperespec='NDM';"
  };

  String sentencias10_3[]={
    "alter table quefrase  add  qefrepetir char(1);",
    "alter table quefrase  add  qefcount char(1);",
    "alter table quetabla add   qetbbdd varchar(15);",
    "alter table quetabla add   qetrelacion varchar(15);",
    "alter table quecolumn add  qecbbdd varchar(15);",
    "alter table quecolumn add  qecsum char(1);",
    "alter table quecolumn add  qecgrupby char(1);"
  };


  String sentencias10_5[]={
    "DELETE FROM PLANTILLAS WHERE PLAPLICACION = 'JEO' and PLCODIGO='gyc-carta347' and PLVENTANA='GYC-CARTA347';",
    "INSERT INTO PLANTILLAS (PLAPLICACION       , PLCODIGO                      ,       PLVENTANA                       , PLDESCRIPCION ,       PLURLPLANTILLA, PLTIPOPLAN              ) VALUES ('JEO','gyc-carta347','GYC-CARTA347','Plantilla carta informativa modelo 347','.\\plantillas\\gyccarta347.doc',0);"
  };

  String sentencias10_6[]={
    "DELETE FROM QUEFRASE WHERE qeffrase = 'GYC-CARTA347' and qefaplicacion='JCONTA';",
    "DELETE FROM QUETABLA WHERE qetfrase = 'GYC-CARTA347' and qetaplicacion='JCONTA';",
    "DELETE FROM QUECOLUMN WHERE qecfrase = 'GYC-CARTA347' and qecaplicacion='JCONTA';",
    "DELETE FROM QUEVARIABLES WHERE qevfrase = 'GYC-CARTA347' and qevaplicacion='JCONTA';",
    "DELETE FROM PLANTILLAS WHERE PLAPLICACION = 'JCONTA' and PLCODIGO='GYCPLAC347' and PLVENTANA='GYC-CARTA347';",
    "INSERT INTO PLANTILLAS (PLAPLICACION , PLCODIGO      , PLVENTANA   , PLDESCRIPCION , PLURLPLANTILLA, PLTIPOPLAN  ) VALUES ('JCONTA','GYCPLAC347','GYC-CARTA347','Plantilla carta informativa modelo 347','.\\plantillas\\GYCPLAC347.dot',0);",
    "INSERT INTO quefrase (qefaplicacion  , qeffrase      , qefdescripcion   , qefmaster , qeftitulo, qefapaisado, qefpaginado,qefrepetir,qefplantilla  )  VALUES ('JCONTA','GYC-CARTA347','Cartas informativas modelo 347','acum347','Acumulados modelo 347','S','N','N','GYCPLAC347');"
  };

  String sentencias10_7[]={
   " CREATE TABLE FORMACOBPAG                 "+
    "  (fcpforma     VARCHAR(3) NOT NULL,     "+
    "   fcpdesc      VARCHAR(40),             "+
    "   PRIMARY KEY (fcpforma));  ",
    "INSERT INTO FORMACOBPAG (fcpforma,fcpdesc) VALUES ('CON','Contado');",
    "INSERT INTO FORMACOBPAG (fcpforma,fcpdesc) VALUES ('TRA','Transferencia bancaria');",
    "INSERT INTO FORMACOBPAG (fcpforma,fcpdesc) VALUES ('PAG','Pagaré');",
    "INSERT INTO FORMACOBPAG (fcpforma,fcpdesc) VALUES ('DOM','Domiciliación');"
  };

  String sentencias10_8[]={
  "ALTER TABLE EMPMODELOS add emodfechaini "+formatoData(),
  "ALTER TABLE EMPMODELOS add emodfechafin "+formatoData()};

  String sentencias10_9[]={
    "DELETE FROM VALORES WHERE vaapl = 'EA' and vacampo='DESCMOD';",
  };

  String sentencias11_0[]={
    "alter table quecolumn  add  qecmedia char(1);",
    "alter table quecolumn  add  qeccontador char(1);",
    "alter table quecolumn add   qecrotura char(1);",
    "alter table quecolumn add   qectitrotura varchar(20);",
  };

  String sentencias11_2[]={
   "UPDATE ADMHACIENDA SET AHDESC='VIA AUGUSTA' WHERE AHDELE=8 AND AHCODIGO=605;",
  };

  String sentencias11_3[]={"DELETE FROM COEFICCORREC WHERE coeejerfiscal=2013"};

  String sentencias11_4[]={"ALTER TABLE CDP add cdpresponsable VARCHAR(25);"};

String sentencias11_5[]={
   " CREATE TABLE TAREAJASPER                           "+
    "   (tjscodi INTEGER NOT NULL,                      "+
    "    tjstitulo  VARCHAR(25),                         "+
    "    tjsdesc  VARCHAR(45),                           "+
    "    tjsaplic VARCHAR(10),                           "+
    "    tjstipo  VARCHAR(2),                            "+
    "    PRIMARY KEY (tjscodi));                         ",
   " CREATE TABLE TAREAJASPERDET                                     "+
    "   (tjdcodi INTEGER NOT NULL,             "+
    "    tjdtarea INTEGER NOT NULL,                                  "+
    "    tjdlistado VARCHAR(15) NOT NULL,                            "+
    "    tjdactivo VARCHAR(1),                                       "+
    "    tjdorden  INTEGER,                                          "+
    "    tjdcfgs1  VARCHAR(50),                                      "+
    "    tjdcfgs2  VARCHAR(50),                                      "+
    "    tjdcfgs3  VARCHAR(50),                                      "+
    "    tjdcfgs4  VARCHAR(50),                                      "+
    "    tjdcfgs5  VARCHAR(50),                                      "+
    "    tjdcfgs6  VARCHAR(50),                                      "+
    "    tjdcfgs7  VARCHAR(50),                                      "+
    "    tjdcfgs8  VARCHAR(50),                                      "+
    "    tjdcfgs9  VARCHAR(50),                                      "+
    "    tjdcfgs10 VARCHAR(50),                                      "+
    "    tjdcfgs11 VARCHAR(50),                                      "+
    "    tjdcfgs12 VARCHAR(50),                                      "+
    "    tjdcfgs13 VARCHAR(50),                                      "+
    "    tjdcfgs14 VARCHAR(50),                                      "+
    "    tjdcfgs15 VARCHAR(50),                                      "+
    "    tjdcfgs16 VARCHAR(50),                                      "+
    "    tjdcfgs17 VARCHAR(50),                                      "+
    "    tjdcfgs18 VARCHAR(50),                                      "+
    "    tjdcfgs19 VARCHAR(50),                                      "+
    "    tjdcfgs20 VARCHAR(50),                                      "+
    "    tjdcfgi1  INTEGER,                                          "+
    "    tjdcfgi2  INTEGER,                                          "+
    "    tjdcfgi3  INTEGER,                                          "+
    "    tjdcfgi4  INTEGER,                                          "+
    "    tjdcfgi5  INTEGER,                                          "+
    "    tjdcfgi6  INTEGER,                                          "+
    "    tjdcfgi7  INTEGER,                                          "+
    "    tjdcfgi8  INTEGER,                                          "+
    "    tjdcfgi9  INTEGER,                                          "+
    "    tjdcfgi10 INTEGER,                                          "+
    "    tjdcfgi11 INTEGER,                                          "+
    "    tjdcfgi12 INTEGER,                                          "+
    "    tjdcfgi13 INTEGER,                                          "+
    "    tjdcfgi14 INTEGER,                                          "+
    "    tjdcfgi15 INTEGER,                                          "+
    "    tjdcfgi16 INTEGER,                                          "+
    "    tjdcfgi17 INTEGER,                                          "+
    "    tjdcfgi18 INTEGER,                                          "+
    "    tjdcfgi19 INTEGER,                                          "+
    "    tjdcfgi20 INTEGER,                                          "+
    "    tjdcfgd1  FLOAT,                                            "+
    "    tjdcfgd2  FLOAT,                                            "+
    "    tjdcfgd3  FLOAT,                                            "+
    "    tjdcfgd4  FLOAT,                                            "+
    "    tjdcfgd5  FLOAT,                                            "+
    "    tjdcfgd6  FLOAT,                                            "+
    "    tjdcfgd7  FLOAT,                                            "+
    "    tjdcfgd8  FLOAT,                                            "+
    "    tjdcfgd9  FLOAT,                                            "+
    "    tjdcfgd10 FLOAT,                                            "+
    "    tjdcfgd11 FLOAT,                                            "+
    "    tjdcfgd12 FLOAT,                                            "+
    "    tjdcfgd13 FLOAT,                                            "+
    "    tjdcfgd14 FLOAT,                                            "+
    "    tjdcfgd15 FLOAT,                                            "+
    "    tjdcfgd16 FLOAT,                                            "+
    "    tjdcfgd17 FLOAT,                                            "+
    "    tjdcfgd18 FLOAT,                                            "+
    "    tjdcfgd19 FLOAT,                                            "+
    "    tjdcfgd20 FLOAT,                                            "+
    "    tjdcfgf1  "+formatData()+
    "    tjdcfgf2  "+formatData()+
    "    tjdcfgf3  "+formatData()+
    "    tjdcfgf4  "+formatData()+
    "    tjdcfgf5  "+formatData()+
    "    tjdcfgf6  "+formatData()+
    "    tjdcfgf7  "+formatData()+
    "    tjdcfgf8  "+formatData()+
    "    tjdcfgf9  "+formatData()+
    "    tjdcfgf10 "+formatData()+
    "    tjdcfgf11 "+formatData()+
    "    tjdcfgf12 "+formatData()+
    "    tjdcfgf13 "+formatData()+
    "    tjdcfgf14 "+formatData()+
    "    tjdcfgf15 "+formatData()+
    "    tjdcfgf16 "+formatData()+
    "    tjdcfgf17 "+formatData()+
    "    tjdcfgf18 "+formatData()+
    "    tjdcfgf19 "+formatData()+
    "    tjdcfgf20 "+formatData()+
    "    PRIMARY KEY (tjdcodi,tjdtarea),                             "+
    "    FOREIGN KEY (tjdtarea) REFERENCES TAREAJASPER (tjscodi));   "};


  String sentencias11_6[]={
    "alter table FORMACOBPAG  add  fcptipo varchar(2);",
    "DELETE FROM FORMACOBPAG where fcpforma='CON' or  fcpforma='TRA' or fcpforma='PAG' or fcpforma='DOM';",
    "INSERT INTO FORMACOBPAG (fcpforma,fcpdesc,fcptipo) VALUES ('CON','Contado','EF');",
    "INSERT INTO FORMACOBPAG (fcpforma,fcpdesc,fcptipo) VALUES ('TRA','Transferencia bancaria','TB');",
    "INSERT INTO FORMACOBPAG (fcpforma,fcpdesc) VALUES ('PAG','Pagaré');",
    "INSERT INTO FORMACOBPAG (fcpforma,fcpdesc,fcptipo) VALUES ('DOM','Domiciliación','TB');"
  };
  String sentencias11_9[]={
    "UPDATE TRANSACCIONES set tratipoiva='EN' where traoper349='S'"
  };

  String sentencias12_0[] = {
    "CREATE TABLE JCOPREEST             "+
    " (jpeestruc VARCHAR(3) NOT NULL,            "+
    "  jpeidepi  VARCHAR(15) NOT NULL,           "+
    "  jpeepiest VARCHAR(6) NOT NULL,            "+
    "  jpetipoimp VARCHAR(1),           "+
    "  PRIMARY KEY (jpeestruc,jpeidepi,jpeepiest));          ",
  "CREATE TABLE JCORATIS              "+
    " (jpeidrati VARCHAR(3) NOT NULL,            "+
    "  jpenomrati VARCHAR(30),          "+
    "  jpenumer VARCHAR(255),           "+
    "  jpedenom VARCHAR(255),           "+
    "  jpedesc "+getMemo(2000)           +
    "  jpemin  FLOAT,                   "+
    "  jpemax  FLOAT,                   "+
    "  jpedescmin "+getMemo(2000)        +
    "  jpedescmax "+getMemo(2000)        +
    "  jpedescok "+getMemo(2000)         +
    "  PRIMARY KEY (jpeidrati));          ",
    "CREATE TABLE JCOEPIGRAFE           "+
    " (jepidepi  VARCHAR(15) NOT NULL,  "+
    "  jepdesc   VARCHAR(40),           "+
    "  PRIMARY KEY (jepidepi));         "};

  String sentencias12_2[]={"DELETE FROM COEFICCORREC WHERE coeejerfiscal=2014"};

  String sentencias12_3[] = {
   "CREATE TABLE CODCNVOTRAPLC              "+
   "(ccocodi             INTEGER NOT NULL,  "+
   " ccoaplic            VARCHAR(15),       "+
   " ccofecha            "+formatData()+
   " ccoservidor         VARCHAR(50),       "+
   " ccoinstancia        VARCHAR(50),       "+
   " ccouserbd           VARCHAR(25),       "+
   " ccopwdbd            VARCHAR(25),       "+
   " ccobbdd             VARCHAR(50),       "+
   " ccousuario          VARCHAR(15),       "+
   " ccohistorico        VARCHAR(1),        "+
   " ccoempini           INTEGER,           "+
   " ccoempfin           INTEGER,           "+
   " ccoejeini           INTEGER,           "+
   " ccoejefin           INTEGER,           "+
   " ccotraspjco         VARCHAR(1),        "+
   " ccotraspjeo         VARCHAR(1),        "+
   " ccotraspjre         VARCHAR(1),        "+
   " ccotraspjsoc        VARCHAR(1),        "+
   " ccotraspjges        VARCHAR(1),        "+
   " ccotraspjnom        VARCHAR(1),        "+
   " ccojcotipocta       VARCHAR(1),        "+
   " ccojcoctamayor      VARCHAR(1),        "+
   " ccojcocanales       VARCHAR(1),        "+
   " ccojcosql           VARCHAR(1),        "+
   " ccoestimacion       VARCHAR(1),        "+
   " ccomercantil        VARCHAR(1),        "+
   " ccomodelos          VARCHAR(1),        "+
   " ccodecdesde         VARCHAR(15),       "+
   " ccodechasta         VARCHAR(15),       "+
   " ccodecsimul         VARCHAR(1),        "+
   " ccodepartamento     VARCHAR(1),        "+
   " PRIMARY KEY (ccocodi));                ",
   "CREATE TABLE CODCNVOTRAPLL              "+
   "(cclcodi          INTEGER NOT NULL,     "+
   " cclccocodi       INTEGER,              "+
   " cclsel           VARCHAR(1),           "+
   " cclcodiorigen    INTEGER,              "+
   " cclcodiorigens   VARCHAR(15),          "+
   " cclnombre        VARCHAR(255),         "+
   " cclnif           VARCHAR(15),          "+
   " cclcodigeyce     INTEGER,              "+
   " ccltraspjco      VARCHAR(1),           "+
   " ccltraspjeo      VARCHAR(1),           "+
   " ccltraspjre      VARCHAR(1),           "+
   " ccltraspjsoc     VARCHAR(1),           "+
   " ccltraspjges     VARCHAR(1),           "+
   " ccltraspjnom     VARCHAR(1),           "+
   " PRIMARY KEY (cclcodi));                ",
   "CREATE TABLE CODCNVINCIDEN              "+
   "(ccicodi          INTEGER NOT NULL,     "+
   " cciccocodi       INTEGER,              "+
   " ccicodiorigen    INTEGER,              "+
   " ccicodiorigens   VARCHAR(15),          "+
   " ccicodigeyce     INTEGER,              "+
   " cciejercicio     INTEGER,              "+
   " ccinombre        VARCHAR(255),         "+
   " ccinif           VARCHAR(15),          "+
   " cciaplic         VARCHAR(15),          "+
   " ccimsg           VARCHAR(255),         "+
   " PRIMARY KEY (ccicodi));                "};

  String sentencias12_4[]={"INSERT INTO INDEMORA (indejercicio,inddesdefecha,indhastafecha,indtipo_vigente) VALUES (2015,'01/01/2015','31/12/2015',4.375);"};

     String sentencias12_5[]={
              "DELETE FROM QUEFRASE WHERE qeffrase = 'GYC-C347-14' and qefaplicacion='JCONTA';",
              "DELETE FROM QUETABLA WHERE qetfrase = 'GYC-C347-14' and qetaplicacion='JCONTA';",
              "DELETE FROM QUECOLUMN WHERE qecfrase = 'GYC-C347-14' and qecaplicacion='JCONTA';",
              "DELETE FROM QUEVARIABLES WHERE qevfrase = 'GYC-C347-14' and qevaplicacion='JCONTA';",
              "DELETE FROM PLANTILLAS WHERE PLAPLICACION = 'JCONTA' and PLCODIGO='GYCPLAC347_14' and PLVENTANA='GYC-C347-14';",
              "INSERT INTO PLANTILLAS (PLAPLICACION , PLCODIGO      , PLVENTANA   , PLDESCRIPCION , PLURLPLANTILLA, PLTIPOPLAN  ) VALUES ('JCONTA','GYCPLAC347_14','GYC-C347-14','Plantilla carta informativa modelo 347 2014','.\\plantillas\\GYCPLAC347_14.dot',0);",
              "INSERT INTO quefrase (qefaplicacion  , qeffrase      , qefdescripcion   , qefmaster , qeftitulo, qefapaisado, qefpaginado,qefrepetir,qefplantilla  )  VALUES ('JCONTA','GYC-C347-14','Cartas informativas modelo 347 2014','acum347','Acumulados modelo 347','S','N','N','GYCPLAC347_14');"
            };
  String sentencias12_6[] = {"ALTER TABLE EMPMODELOS add emodpreasesor CHAR(1);",
  "UPDATE EMPMODELOS SET emodpreasesor='S' where emodpreasesor is null or emodpreasesor='';"};
  String sentencias12_7[] = {"UPDATE PARAMETROS SET PARVARIABLE='MAXIMIZAR_JISS' WHERE PARVARIABLE='MAXIMIZAR' AND PARAGRUP='JISS';"};

String sentencias12_8[]={
  "CREATE TABLE LIBREGMEREXT "+
   "(lbgcodi          INTEGER NOT NULL, "+
    "lbgempjco        INTEGER, "+
    "lbgejercicio     INTEGER, "+
    "lbgtipo          VARCHAR(15), "+
    "lbgruta          VARCHAR(255), "+
    "lbgnumero        INTEGER, "+
    "PRIMARY KEY (lbgcodi));"
};

String sentencias12_9[]={
  "alter table AMORTIZACION  add  amoejercicio INTEGER",
  "DELETE FROM AMORTIZACION WHERE amocodigo>=2000"
};

String sentencias13_0[]={
  "INSERT INTO TRANSACCIONES (tratipo,tradesc,traemre,traregimen,tratipoiva,travoloper,traoperespec) VALUES ('RCP','Regularización art.80.','R','IN','CP','NO','NO')",
  "INSERT INTO TRANSACCIONES (tratipo,tradesc,traemre,traregimen,tratipoiva,travoloper,traoperespec) VALUES ('RDU','Importación Aduana pdte ingreso','R','IN','DU','NO','NO')"
};

String sentencias13_1[]={
  "CREATE TABLE LOGJCONTAX "+
   "(lgxcodi          INTEGER NOT NULL, "+
    "lgxemp           INTEGER, "+
    "lgxejercicio     INTEGER, "+
    "lgxfecha         "+formatData()+
    "lgxhora          VARCHAR(9), "+
    "lgxusuario       VARCHAR(25), "+
    "lgxenvrec        VARCHAR(1), "+
    "lgxcdpafinity    VARCHAR(12), "+
    "PRIMARY KEY (lgxcodi));"
};

String sentencias13_2[]={
      "CREATE TABLE AVISOS                      "+
      " (AVCODIGO     INTEGER NOT NULL,        "+
      "  AVAPLICACION  VARCHAR(15),             "+
      "  AVCODCDP      CHAR(12),                "+
      "  AVEMPRESA     INTEGER,                 "+
      "  AVNOMEMPRESA  VARCHAR(35),             "+
      "  AVTRABAJADOR  INTEGER,                 "+
      "  AVNOMTRABAJ   VARCHAR(35),              "+
      "  AVRELACION    INTEGER,                 "+
      "  AVCENTRO      INTEGER,                 "+
      "  AVCODINCID    INTEGER,                 "+
      "  AVCODFINIQ    INTEGER,                 "+
      "  AVCODBONIF    INTEGER,                 "+
      "  AVCODACTIVI   INTEGER,                 "+
      "  AVNOMACTIVI   VARCHAR(35),             "+
      "  AVDECLARA     CHAR(12),                "+
      "  AVCODOTR1     INTEGER,                 "+
      "  AVCODOTR2     INTEGER,                 "+
      "  AVCODOTR3     INTEGER,                 "+
      "  AVEJERCICIO   INTEGER,                 "+
      "  AVPERIODO     INTEGER,                 "+
      "  AVTIPORECO    CHAR(5),                 "+
      "  AVTIPOAVISO   CHAR(10),                "+
      "  AVTITULO      VARCHAR(250),            "+
      "  AVORIGEN      CHAR(1),                 "+
      "  AVESTADO      CHAR(2),                 "+
      "  AVESTADOCTRL  CHAR(2),                 "+
      "  AVURGENCIA    INTEGER ,                "+
      "  AVDESCRIP     "+getMemo(2000)+
      "  AVFECHACREA   "+formatData()+
      "  AVRESPONSCREA CHAR(25),                "+
      "  AVRESPONSORIG CHAR(25),                "+
      "  AVFECHAORIG   "+formatData()+
      "  AVHORAORIG    VARCHAR(8),              "+
      "  AVRESPONSVENC CHAR(25),                "+
      "  AVFECHAVENCI  "+formatData()+
      "  AVHORAVENCI   VARCHAR(8),              "+
      "  AVFECHASOLU   "+formatData()+
      "  AVRESPONSSOLU CHAR(25),                "+
      "  AVHORASOLU    VARCHAR(8),              "+
      "  AVRESPONSREVI CHAR(25),                "+
      "  AVFECHAREVI   "+formatData()+
      "  AVHORAREVI    VARCHAR(8),              "+
      "  PRIMARY KEY (AVCODIGO));               "
   };

String sentencias13_3[]={
  "alter table AMORTIZACION  add  amocodequiv INTEGER"
};

String sentencias13_4[]={"DELETE FROM INDEMORA WHERE indejercicio=2016;",
"INSERT INTO INDEMORA (indejercicio,inddesdefecha,indhastafecha,indtipo_vigente) VALUES (2016,'01/01/2016','31/12/2016',3.75);"};

String sentencias13_5[]={"UPDATE TRANSACCIONES SET tratipoiva='ISP' where tratipo='EISP' and tratipoiva='DI';"};

String sentencias13_6[]={"UPDATE MUNI347 SET mu7desc='URBEL DEL CASTILLO'  WHERE mu7codprov=9 AND mu7codmuni=3983;"};

String sentencias13_7[]={
"UPDATE MUNI347 SET mu7desc='CASTRILLO MOTA DE JUDIOS'  WHERE mu7codprov=9 AND mu7codmuni=905;",
"INSERT INTO INDEMORA (indejercicio,inddesdefecha,indhastafecha,indtipo_vigente) VALUES (2017,'01/01/2017','31/12/2017',3.750);"};

String sentencias13_8[]={"UPDATE MUNI347 SET mu7desc='LAS PALMAS DE GRAN CANARIA'  WHERE mu7codprov=35 AND mu7codmuni=167;",
"UPDATE MUNICIPIO SET mudesc='LAS PALMAS DE GRAN CANARIA'  WHERE muprov=35 AND mucodigo=16;"};

String sentencias13_9[]={"ALTER TABLE PAIS ADD piparaisofiscal CHAR(1);",
"UPDATE pais set piparaisofiscal='S' WHERE (picodigo347='AG' or picodigo347='AI' or picodigo347='BH' or picodigo347='BM' or picodigo347='BN' or picodigo347='CK' or picodigo347='CY' or picodigo347='DM' or picodigo347='FJ' or picodigo347='FK' or picodigo347='GD');",
"UPDATE pais set piparaisofiscal='S' WHERE (picodigo347='GG' or picodigo347='GI' or picodigo347='HK' or picodigo347='IM' or picodigo347='JE' or picodigo347='JO' or picodigo347='KY' or picodigo347='LB' or picodigo347='LC' or picodigo347='LI' or picodigo347='LR');",
"UPDATE pais set piparaisofiscal='S' WHERE (picodigo347='MC' or picodigo347='MO' or picodigo347='MP' or picodigo347='MS' or picodigo347='MU' or picodigo347='NR' or picodigo347='OM' or picodigo347='SB' or picodigo347='SC' or picodigo347='TC' or picodigo347='VC');",
"UPDATE pais set piparaisofiscal='S' WHERE (picodigo347='VG' or picodigo347='VI' or picodigo347='VU');"};

String sentencias14_0[]={
"CREATE TABLE JCOIMPEXCEL           "+
"  (JCECODIGO      INTEGER NOT NULL, "+
"   JCEEMPRESA     INTEGER,         "+
"   JCETODASEMP    VARCHAR(1),      "+
"   JCEDESC        VARCHAR(255),    "+
"   JCETIPO        VARCHAR(2),      "+
"   JCERUTA        VARCHAR(155),    "+
"   JCEHOJA        VARCHAR(50),     "+
"   JCE1LIN        INTEGER,         "+
"   JCEULIN        INTEGER,         "+
"   JCEDEFCOL      "+getMemo(4000)+
"   JCELMIN        INTEGER,         "+
"   JCELCTAMAY     INTEGER,         "+
"   JCEDEFCTA      "+getMemo(4000)+
"   PRIMARY KEY (JCECODIGO));       "};

String sentencias14_1[]={
"CREATE TABLE ESTILOS"+
"  (estcodigo   VARCHAR(10) NOT NULL,"+
"   estnombre   VARCHAR(30) NOT NULL,"+
"   estcolor    VARCHAR(7),"+
"   estfuente   INTEGER,"+
"   estnegrita  VARCHAR(1),"+
"   estcursiva  VARCHAR(1),"+
"   estauxi1    INTEGER,"+
"   estauxi2    INTEGER,"+
"   estauxi3    INTEGER,"+
"   estauxa1    VARCHAR(100),"+
"   estauxa2    VARCHAR(100),"+
"   estauxa3    VARCHAR(100),"+
"   PRIMARY KEY (estcodigo));",

"CREATE TABLE INFPLANTILLA" +
"   (ipcodplant VARCHAR(10) NOT NULL," +
"    ipdesc     VARCHAR (60) NOT NULL," +
"    ipmostrar0 VARCHAR (1)," +
"   PRIMARY KEY (ipcodplant));",

"CREATE TABLE INFPLANTLINEA" +
" (iplcodigo    INTEGER NOT NULL," +
"  iplcodplant    VARCHAR(10) NOT NULL," +
"  iplnumero    INTEGER NOT NULL," +
"  iplcodlin    VARCHAR(20)," +
"  ipldesc      VARCHAR(60)," +
"  ipltotalizar VARCHAR(1)," +
"  ipltotaldesc VARCHAR(60)," +
"  ipldesde     VARCHAR(17)," +
"  iplhasta     VARCHAR(17)," +
"  iplmayor     VARCHAR(1)," +
"  iplformula   VARCHAR(255)," +
"  iplestilo    VARCHAR(10)," +
"  iplestilot   VARCHAR(10)," +
"  PRIMARY KEY (iplcodigo)," +
"  FOREIGN KEY (iplcodplant) REFERENCES INFPLANTILLA(ipcodplant),"+
"  FOREIGN KEY (iplestilo) REFERENCES ESTILOS(estcodigo),"+
"  FOREIGN KEY (iplestilot) REFERENCES ESTILOS(estcodigo));",

"CREATE TABLE INFPLANTCOL" +
" (ipccodigo    INTEGER NOT NULL," +
"  ipccodplant  VARCHAR(10) NOT NULL," +
"  ipcnumero    INTEGER NOT NULL," +
"  ipcdesc      VARCHAR(30)," +
"  ipcejercol   INTEGER ," +
"  ipcdesdemes  INTEGER ," +
"  ipchastames  INTEGER ," +
"  ipcpositivos VARCHAR(1)," +
"  ipctiposaldo VARCHAR(1)," +
"  ipcformula   VARCHAR(255)," +
"  PRIMARY KEY (ipccodigo)," +
"  FOREIGN KEY (ipccodplant) REFERENCES INFPLANTILLA(ipcodplant));"};

String sentencias14_2[]={
"DELETE FROM INFPLANTCOL where ipccodplant in ('GYC01','GYC02','GYC03')",
"DELETE FROM INFPLANTLINEA where iplcodplant in ('GYC01','GYC02','GYC03')",
"DELETE FROM INFPLANTILLA where  ipcodplant in ('GYC01','GYC02','GYC03')"};

String sentencias14_3[]={

  " CREATE TABLE VALIDANOMAEAT                     " +
  "     (vnacodi         INTEGER NOT NULL,         " +
  "      vnacodigoemp    INTEGER,                  " +
  "      vnanombreemp    VARCHAR(40),              " +
  "      vnacodigo       VARCHAR(100),             " +
  "      vnanombre       VARCHAR(200),             " +
  "      vnanif          VARCHAR(15),              " +
  "      vnaestadoaeat   VARCHAR(15),              " +
  "      vnanombreaeat   VARCHAR(200),             " +
  "      vnanom          VARCHAR(50),              " +
  "      vnaapell1       VARCHAR(100),             " +
  "      vnaapell2       VARCHAR(50),              " +
  "      vnaestadoctrl   VARCHAR(15),              " +
  "      vnafechactrl    "+formatData()+
  "     PRIMARY KEY (vnacodi));                    ",
  " alter table nifes add  datnombreant VARCHAR(50)  ",
  " alter table nifes add  datapell1ant VARCHAR(100) ",
  " alter table nifes add  datapell2ant VARCHAR(50)  "
  };

String sentencias14_4[]={"ALTER table VALIDANOMAEAT  add  vnabasedatos    VARCHAR(15);",
"ALTER TABLE VALIDANOMAEAT ADD vnatabla        VARCHAR(15);",
"ALTER TABLE VALIDANOMAEAT ADD vnanifemp       VARCHAR(15);"};

String sentencias14_5[]={
    "DELETE FROM PLANTILLAS WHERE PLAPLICACION = 'JEO' and PLCODIGO='gyc-carta415' and PLVENTANA='GYC-CARTA415';",
    "INSERT INTO PLANTILLAS (PLAPLICACION       , PLCODIGO                      ,       PLVENTANA                       , PLDESCRIPCION ,       PLURLPLANTILLA, PLTIPOPLAN              ) VALUES ('JEO','gyc-carta415','GYC-CARTA415','Plantilla carta informativa modelo 415','.\\plantillas\\gyccarta415.doc',0);"  };

String sentencias14_6[]={
  "DELETE FROM QUEFRASE WHERE qeffrase = 'GYC-C347-17' and qefaplicacion='JCONTA';",
  "DELETE FROM QUETABLA WHERE qetfrase = 'GYC-C347-17' and qetaplicacion='JCONTA';",
  "DELETE FROM QUECOLUMN WHERE qecfrase = 'GYC-C347-17' and qecaplicacion='JCONTA';",
  "DELETE FROM QUEVARIABLES WHERE qevfrase = 'GYC-C347-17' and qevaplicacion='JCONTA';",
  "DELETE FROM PLANTILLAS WHERE PLAPLICACION = 'JCONTA' and PLCODIGO='GYCPLAC347_14' and PLVENTANA='GYC-C347-17';",
  "DELETE FROM QUEFRASE WHERE qeffrase = 'GYC-C415-17' and qefaplicacion='JCONTA';",
  "DELETE FROM QUETABLA WHERE qetfrase = 'GYC-C415-17' and qetaplicacion='JCONTA';",
  "DELETE FROM QUECOLUMN WHERE qecfrase = 'GYC-C415-17' and qecaplicacion='JCONTA';",
  "DELETE FROM QUEVARIABLES WHERE qevfrase = 'GYC-C415-17' and qevaplicacion='JCONTA';",
  "DELETE FROM PLANTILLAS WHERE PLAPLICACION = 'JCONTA' and PLCODIGO='GYCPLAC415_17' and PLVENTANA='GYC-C415-17';"
};

String sentencias14_7[]={"DELETE FROM INDEMORA WHERE indejercicio=2018;",
"INSERT INTO INDEMORA (indejercicio,inddesdefecha,indhastafecha,indtipo_vigente) VALUES (2018,'01/01/2018','31/12/2018',3.75);"};

  String sentencias14_8[]={"DELETE FROM CODIGOREGISTRO"};

  String sentencias14_9[]={
    "ALTER TABLE TRANSACCIONES ALTER COLUMN tradesc VARCHAR(150);"
  };

  String sentencias15_0[]={
    "ALTER TABLE CDP ADD cdpsiifacil VARCHAR(1);"
  };

String sentencias15_1[]={
	"CREATE TABLE JCOCNVPRC                                               "+
	"   (jcnprcodi INTEGER NOT NULL ,                "+
	"    jcnprtipo VARCHAR(20),                                           "+
	"    jcnprempresa INTEGER,                                            "+
	"    jcnprfecha "+formatData()+
	"    jcnpruser VARCHAR(25),                                           "+
	"    PRIMARY KEY (jcnprcodi));                                        ",
	"CREATE TABLE PCINMOVLOG                                              "+
	"   (pcilcodi INTEGER NOT NULL ,                 "+
	"    pciltipo VARCHAR(20),                                            "+
	"    pcilrempresa INTEGER,                                            "+
	"    pcilrfecha "+formatData()+
	"    pcilruser VARCHAR(25),                                           "+
	"    pcilprcorigen VARCHAR(100),                                      "+
	"    PRIMARY KEY (pcilcodi));                                         ",
	"CREATE TABLE PCINMOV                                                 "+
	"   (pcielemento INTEGER NOT NULL ,              "+
	"    pciempresa INTEGER NOT NULL,                                     "+
	"    pciejercicio INTEGER NOT NULL,                                   "+
	"    pcicuenta VARCHAR(4) NOT NULL,                                   "+
	"    pcisubcuenta VARCHAR(12) NOT NULL,                               "+
	"    pciarticulo INTEGER NOT NULL,                                    "+
	"    pcitipoamort VARCHAR(3) NOT NULL,                                "+
	"    pcicodigoamor INTEGER NOT NULL,                                  "+
	"    pcidesc VARCHAR(40),                                             "+
	"    pcisubctaamort VARCHAR(12),                                      "+
	"    pciregistro VARCHAR(8),                                          "+
	"    pcictadot VARCHAR(4),                                            "+
	"    pcihoras FLOAT,                                                  "+
	"    pcisubctadot VARCHAR(12),                                        "+
	"    pcicoefapli FLOAT,                                               "+
	"    pcifecalta "+formatData()+
	"    pcifecbaja "+formatData()+
	"    pcictaamort VARCHAR(4),                                          "+
	"    pcicoste FLOAT,                                                  "+
	"    pciperapli INTEGER,                                              "+
	"    pciadquis FLOAT,                                                 "+
	"    pcifecplan "+formatData()+
	"    pciunidades INTEGER,                                             "+
	"    pcireserva FLOAT,                                                "+
	"    pcinoamort FLOAT,                                                "+
	"    pcinuevousado VARCHAR(3) NOT NULL,                               "+
	"    pciobser "+getMemo(2000)+
	"    PRIMARY KEY (pcielemento));                                      ",
};

String sentencias15_2[]={
	"CREATE TABLE PCINMOVHIS                                              "+
	"   (pcihelemento INTEGER NOT NULL ,             "+
	"    pcihempresa INTEGER NOT NULL,                                    "+
	"    pcihejercicio INTEGER NOT NULL,                                  "+
	"    pcihcuenta VARCHAR(4) NOT NULL,                                  "+
	"    pcihsubcuenta VARCHAR(12) NOT NULL,                              "+
	"    pciharticulo INTEGER NOT NULL,                                   "+
	"    pcihtipoamort VARCHAR(3) NOT NULL,                               "+
	"    pcihcodigoamor INTEGER NOT NULL,                                 "+
	"    pcihdesc VARCHAR(40),                                            "+
	"    pcihsubctaamort VARCHAR(12),                                     "+
	"    pcihregistro VARCHAR(8),                                         "+
	"    pcihctadot VARCHAR(4),                                           "+
	"    pcihhoras FLOAT,                                                 "+
	"    pcihsubctadot VARCHAR(12),                                       "+
	"    pcihcoefapli FLOAT,                                              "+
	"    pcihfecalta "+formatData()+
	"    pcihfecbaja "+formatData()+
	"    pcihctaamort VARCHAR(4),                                         "+
	"    pcihcoste FLOAT,                                                 "+
	"    pcihperapli INTEGER,                                             "+
	"    pcihadquis FLOAT,                                                "+
	"    pcihfecplan "+formatData()+
	"    pcihunidades INTEGER,                                            "+
	"    pcihreserva FLOAT,                                               "+
	"    pcihnoamort FLOAT,                                               "+
	"    pcihnuevousado VARCHAR(3) NOT NULL,                              "+
	"    pcihobser"+getMemo(2000)+
	"    pcihlog INTEGER,                                                 "+
	"    PRIMARY KEY (pcihelemento),                                      "+
	"    FOREIGN KEY (pcihlog) REFERENCES PCINMOVLOG(pcilcodi));          ",
	"CREATE TABLE PCMORANUALHIS                                           "+
	"   (pcmhelemento INTEGER NOT NULL,                                   "+
	"    pcmhamorejer INTEGER NOT NULL,                                   "+
	"    pcmhtipo VARCHAR(1) NOT NULL,                                    "+
	"    pcmhcoefamort FLOAT,                                             "+
	"    pcmhamortanual FLOAT,                                            "+
	"    pcmhamortacum FLOAT,                                             "+
	"    pcmhamortpdte FLOAT,                                             "+
	"    pcmhultfecha "+formatData()+
	"    pcmhcuotaapli FLOAT,                                             "+
	"    PRIMARY KEY (pcmhelemento,pcmhamorejer),                         "+
	"    FOREIGN KEY (pcmhelemento) REFERENCES PCINMOVHIS(pcihelemento)); ",
	"CREATE TABLE PCMORANUAL                                              "+
	"   (pcmelemento INTEGER NOT NULL,                                    "+
	"    pcmamorejer INTEGER NOT NULL,                                    "+
	"    pcmtipo VARCHAR(1) NOT NULL,                                     "+
	"    pcmcoefamort FLOAT,                                              "+
	"    pcmamortanual FLOAT,                                             "+
	"    pcmamortacum FLOAT,                                              "+
	"    pcmamortpdte FLOAT,                                              "+
	"    pcmultfecha "+formatData()+
	"    pcmcuotaapli FLOAT,                                              "+
	"    PRIMARY KEY (pcmelemento,pcmamorejer),                           "+
	"    FOREIGN KEY (pcmelemento) REFERENCES PCINMOV(pcielemento));      "
};

String sentencias15_3[]={
"DELETE FROM PLANTILLAS WHERE PLAPLICACION='JRENTA' AND PLCODIGO='gyccarta1' and PLVENTANA='GYC-CARTA1';",
"DELETE FROM PLANTILLAS WHERE PLAPLICACION='JRENTA' AND PLCODIGO='gyccarta1' and PLVENTANA='GYC-CARTA2';",
"INSERT INTO PLANTILLAS (PLAPLICACION,PLCODIGO,PLVENTANA,PLDESCRIPCION ,PLURLPLANTILLA, PLTIPOPLAN) VALUES ('JRENTA','gyccarta1','GYC-CARTA1','Carta modelo jRenta','.\\plantillas\\gyccarta1.doc',0);",
"INSERT INTO PLANTILLAS (PLAPLICACION,PLCODIGO,PLVENTANA,PLDESCRIPCION ,PLURLPLANTILLA, PLTIPOPLAN) VALUES ('JRENTA','gyccarta1','GYC-CARTA2','Carta modelo jRenta','.\\plantillas\\gyccarta1.doc',0);"
};

String sentencias15_4[]={
"ALTER TABLE PCINMOV ADD pcicodini INTEGER",
"ALTER TABLE PCINMOVHIS ADD pcihcodini INTEGER"
};

String sentencias15_5[]={
"ALTER TABLE CDP ADD cdpomiterel VARCHAR(1)",
};

String sentencias15_6[]={
    "CREATE TABLE DICCUENTAS"
    +"  (diccodigo  INTEGER,"
    +"	 dicempresa INTEGER,"
    +"	 dicconcepto VARCHAR(40),"
    +"	 diccuenta  VARCHAR(4),"
    +"	 dicscuenta VARCHAR(12),"
    +"	 PRIMARY KEY (diccodigo));"
};

String sentencias15_7[]={
"ALTER TABLE USUARIO ADD USMD5 VARCHAR(100)"
};
String sentencias15_8[]={"DELETE FROM EPIGRAFES WHERE epitipoact='1' AND epiepigrafe='913';",
"UPDATE EPIGRAFES SET epidescripcion='SERVICIOS FORESTALES, PESCA Y ACUICULTURA' WHERE epitipoact='1' AND epiepigrafe='912';"};
String sentencias15_9[]={
	"CREATE TABLE CAMBIOEURO"+
	"	(cmbfecha   "+formatData()+
	"	 cmbmoneda  VARCHAR(40),"+
	"	 cmbimporte FLOAT,"+
	"	 PRIMARY KEY (cmbfecha, cmbmoneda));"
};
String sentencias16_0[]={
"CREATE TABLE SEGURIDAD"+
"    (SEGCODIGO           integer NOT NULL,"+
"     SEGCONTROBLIG       char(1),"+               
"     SEGLONGMINIMA       integer,"+               
"     SEGINCLLETRAS       char(1),"+               
"     SEGINCNUMEROS       char(1),"+               
"     SEGINCCARESPEC      char(1),"+               
"     SEGCONTREXPIRA      integer,"+               
"     SEGREUTILIZA        char(1),"+               
"     SEGHISTORICO        integer,"+               
"     SEGINTENTO          integer,"+               
"     SEGPRIMERAVEZ       char(1),"+               
"     SEGSESINACTIVA      integer,"+               
"     SEGMAXSESION        integer,"+               
"     SEGSESIONSIMUL      char(1),"+               
"     PRIMARY KEY (SEGCODIGO));",
"CREATE TABLE USHISTORICO"+
"       (UHCODCON      INTEGER NOT NULL,"+
"        UHLOGIN       CHAR(25) NOT NULL,"+
"        UHFECHA       "+formatoData()+" NOT NULL,"+            
"        UHHORA        CHAR(10) NOT NULL,"+	
"        UHPASSWD      VARCHAR(20),"+              
"        UHMD5         VARCHAR(100),"+             
"        UHPRIMERA     CHAR(1),"+                  
"        PRIMARY KEY (UHCODCON,UHLOGIN,UHFECHA,UHHORA));",
"ALTER TABLE USUARIO ALTER COLUMN USPASSWD      varchar(20);"};

String sentencias16_1[]={"ALTER TABLE USHISTORICO ADD UHREINTENTO   INTEGER;",
"DELETE FROM INDEMORA WHERE indejercicio=2019;",
"INSERT INTO INDEMORA (indejercicio,inddesdefecha,indhastafecha,indtipo_vigente) VALUES (2019,'01/01/2019','31/12/2019',3.75);"};

String sentencias16_3[]={
	"CREATE TABLE DICPATRON           "+
	"	(dcpcodigo  INTEGER NOT NULL, "+
	"	 dcpempresa INTEGER,         "+
	"	 dcpcta     VARCHAR(4),      "+
	"	 dcpscta    VARCHAR(12),     "+
	"	 dcpctascta VARCHAR(17),     "+
	"	 dcpcampo   VARCHAR(20),     "+
	"	 dcpcond    VARCHAR(1),      "+
	"	 dcpvalor   VARCHAR(100),    "+
	"	 PRIMARY KEY (dcpcodigo));   "
};

String sentencias16_4[]={
	"ALTER TABLE PCINMOV ADD pcifradoc VARCHAR(60)",
	"ALTER TABLE PCINMOV ADD pcifrafecha "+formatoData(), 
	"ALTER TABLE PCINMOV ADD pcifratotal FLOAT",
	"ALTER TABLE PCINMOV ADD pcifrabase FLOAT",
	"ALTER TABLE PCINMOV ADD pcifracuota FLOAT",
	"ALTER TABLE PCINMOV ADD pcifraporc FLOAT",
	"ALTER TABLE PCINMOV ADD pcinifprov CHAR(15)",
	"ALTER TABLE PCINMOV ADD pcinomprov VARCHAR(200)",
	"ALTER TABLE PCINMOV ADD pcicausabaja VARCHAR(200)",
	"ALTER TABLE PCINMOVHIS ADD pcihfradoc VARCHAR(60)",
	"ALTER TABLE PCINMOVHIS ADD pcihfrafecha "+formatoData(), 
	"ALTER TABLE PCINMOVHIS ADD pcihfratotal FLOAT",
	"ALTER TABLE PCINMOVHIS ADD pcihfrabase FLOAT",
	"ALTER TABLE PCINMOVHIS ADD pcihfracuota FLOAT",
	"ALTER TABLE PCINMOVHIS ADD pcihfraporc FLOAT",
	"ALTER TABLE PCINMOVHIS ADD pcihnifprov CHAR(15)",
	"ALTER TABLE PCINMOVHIS ADD pcihnomprov VARCHAR(200)",
	"ALTER TABLE PCINMOVHIS ADD pcihcausabaja VARCHAR(200)"
};

String sentencias16_5[]={
	"ALTER TABLE PCINMOV ADD pciproyecto CHAR(5)",
	"ALTER TABLE PCINMOV ADD pcideparta CHAR(5)",
	"ALTER TABLE PCINMOV ADD pcianyosreg INTEGER",
	"ALTER TABLE PCINMOV ADD pcidivisor INTEGER",
	"ALTER TABLE PCINMOV ADD pcicoefdefi FLOAT",
	"ALTER TABLE PCINMOVHIS ADD pcihproyecto CHAR(5)",
	"ALTER TABLE PCINMOVHIS ADD pcihdeparta CHAR(5)",
	"ALTER TABLE PCINMOVHIS ADD pcihanyosreg INTEGER",
	"ALTER TABLE PCINMOVHIS ADD pcihdivisor INTEGER",
	"ALTER TABLE PCINMOVHIS ADD pcihcoefdefi FLOAT",
};
String sentencias16_6[]={"UPDATE MUNI347 SET mu7desc='GÜIMAR'  WHERE mu7codprov=38 AND mu7codmuni=201;"};

String sentencias16_7[]={
		"CREATE TABLE PARAMLIS(           "+
		"	pliasesor INTEGER NOT NULL,         "+
		"	pliusuario VARCHAR(25) NOT NULL,    "+
		"	pliprograma VARCHAR(15) NOT NULL,   "+
		"	pliopcion VARCHAR(2) NOT NULL,      "+
		"	plicampoa1 VARCHAR(30),        "+
		"	plicampoa2 VARCHAR(30),        "+
		"	plicampoa3 VARCHAR(30),        "+
		"	plicampoa4 VARCHAR(30),        "+
		"	plicampoa5 VARCHAR(30),        "+
		"	plicampoa6 VARCHAR(30),        "+
		"	plicampoa7 VARCHAR(30),        "+
		"	plicampoa8 VARCHAR(30),        "+
		"	plicampoa9 VARCHAR(30),        "+
		"	plicampoa10 VARCHAR(30),       "+
		"	plicampoa11 VARCHAR(30),       "+
		"	plicampoa12 VARCHAR(30),       "+
		"	plicampoa13 VARCHAR(30),       "+
		"	plicampoa14 VARCHAR(30),       "+
		"	plicampoa15 VARCHAR(30),       "+
		"	plicampoa16 VARCHAR(30),       "+
		"	plicampoa17 VARCHAR(30),       "+
		"	plicampoa18 VARCHAR(30),       "+
		"	plicampoa19 VARCHAR(30),       "+
		"	plicampoa20 VARCHAR(30),       "+
		"	plicampoi21 INTEGER,           "+
		"	plicampoi22 INTEGER,           "+
		"	plicampoi23 INTEGER,           "+
		"	plicampoi24 INTEGER,           "+
		"	plicampoi25 INTEGER,           "+
		"	plicampoi26 INTEGER,           "+
		"	plicampoi27 INTEGER,           "+
		"	plicampoi28 INTEGER,           "+
		"	plicampoi29 INTEGER,           "+
		"	plicampoi30 INTEGER,           "+
		"	plicampoi31 INTEGER,           "+
		"	plicampoi32 INTEGER,           "+
		"	plicampoi33 INTEGER,           "+
		"	plicampoi34 INTEGER,           "+
		"	plicampoi35 INTEGER,           "+
		"	plicampoi36 INTEGER,           "+
		"	plicampoi37 INTEGER,           "+
		"	plicampoi38 INTEGER,           "+
		"	plicampoi39 INTEGER,           "+
		"	plicampoi40 INTEGER,           "+
		"	plicampon41 FLOAT,             "+
		"	plicampon42 FLOAT,             "+
		"	plicampon43 FLOAT,             "+
		"	plicampon44 FLOAT,             "+
		"	plicampon45 FLOAT,             "+
		"	plicampon46 FLOAT,             "+
		"	plicampon47 FLOAT,             "+
		"	plicampon48 FLOAT,             "+
		"	plicampon49 FLOAT,             "+
		"	plicampon50 FLOAT,             "+
		"	plicampod51 "+formatData()+
		"	plicampod52 "+formatData()+
		"	plicampod53 "+formatData()+
		"	plicampod54 "+formatData()+
		"	plicampod55 "+formatData()+
		"	plicampod56 "+formatData()+
		"	plicampod57 "+formatData()+
		"	plicampod58 "+formatData()+
		"	plicampod59 "+formatData()+
		"	plicampod60 "+formatData()+
		"	plicampoa61 VARCHAR(100),      "+
		"	plicampoa62 VARCHAR(100),      "+
		"	plicampoa63 VARCHAR(100),      "+
		"	plicampoa64 VARCHAR(100),      "+
		"	plicampoa65 VARCHAR(100),      "+
		"	plicampoa66 VARCHAR(100),      "+
		"	plicampoa67 VARCHAR(100),      "+
		"	plicampoa68 VARCHAR(100),      "+
		"	plicampoa69 VARCHAR(100),      "+
		"	plicampoa70 VARCHAR(100),      "+
		"	plicampon71 FLOAT,             "+
		"	plicampon72 FLOAT,             "+
		"	plicampon73 FLOAT,             "+
		"	plicampon74 FLOAT,             "+
		"	plicampon75 FLOAT,             "+
		"	plicampon76 FLOAT,             "+
		"	plicampon77 FLOAT,             "+
		"	plicampon78 FLOAT,             "+
		"	plicampon79 FLOAT,             "+
		"	plicampon80 FLOAT,             "+
		"	plicampoa81 "+ getMemo(2000)+
		"	plicampoa82 "+ getMemo(2000)+
		"PRIMARY KEY (pliasesor, pliusuario, pliprograma, pliopcion))"
};


String sentencias16_8[]={"UPDATE MUNI347 SET mu7desc='UBEDA' WHERE mu7codprov=23 AND mu7codmuni=927;"};	

String sentencias16_9[]={"DELETE FROM INDEMORA WHERE indejercicio=2020;",
"INSERT INTO INDEMORA (indejercicio,inddesdefecha,indhastafecha,indtipo_vigente) VALUES (2020,'01/01/2020','31/12/2020',3.75);"};

String sentencias17_0[] = {"INSERT INTO BANCO (bncodigo, bndesc) VALUES (239, 'EVO BANCO');"};

String sentencias17_4[] = {"DELETE FROM AMORTIZACION WHERE amocodigo>=2000"};

// a partir d'ara utilitzem el sentencies de la classe externa que hi ha a insprconver
  int i=0;
  try {
    if (vvveractual.getString().equals("1.1")) {
      for (i=0;i<sentencias.length;++i)
        Easp.connEA.executeUpdate(sentencias[i]);
      Easp.setVersionBD("bdeasp","2.1");
      Easp.connEA.commit();
      // AQUI ES MARCA LA VARIABLE DE CONTROL DE VERSIO A L'ACTUAL PEL CONTROL FINAL
      vvveractual.setValue("2.1");
      }
    if (vvveractual.getString().equals("2.1")) {
      for (i=0;i<sentencias2.length;++i)
        Easp.connEA.executeUpdate(sentencias2[i]);
      Easp.setVersionBD("bdeasp","2.2");
      Easp.connEA.commit();
      vvveractual.setValue("2.2");
      }
    if (vvveractual.getString().equals("2.2")) {
      for (i=0;i<sentencias3.length;++i)
        Easp.connEA.executeUpdate(sentencias3[i]);
      if (grabaBDSCargadas(Easp.connEA)) {
        Easp.setVersionBD("bdeasp","2.3");
        Easp.connEA.commit();
        vvveractual.setValue("2.3");
        }
      }
    if (vvveractual.getString().equals("2.3")) {
      for (i=0;i<sentencias4.length;++i)
        Easp.connEA.executeUpdate(sentencias4[i]);
      Easp.setVersionBD("bdeasp","2.4");
      Easp.connEA.commit();
      vvveractual.setValue("2.4");
      }
    if (vvveractual.getString().equals("2.4")) {
      for (i=0;i<sentencias5.length;++i)
        Easp.connEA.executeUpdate(sentencias5[i]);
      if (Aplication.getAplication().getDataBase().getDB().getType().equals("access"))
        Easp.connEA.executeUpdate("ALTER TABLE NIFES ALTER COLUMN datletraseti CHAR(4);");
      Easp.setVersionBD("bdeasp","2.5");
      Easp.connEA.commit();
      vvveractual.setValue("2.5");
      }
    if (vvveractual.getString().equals("2.5")) {
      for (i=0;i<sentencias6.length;++i)
        Easp.connEA.executeUpdate(sentencias6[i]);
      Easp.setVersionBD("bdeasp","2.6");
      Easp.connEA.commit();
      vvveractual.setValue("2.6");
      }
    if (vvveractual.getString().equals("2.6")) {
      for (i=0;i<sentencias7.length;++i) {
        try {
          Easp.chivato("2.7 Exec : ["+sentencias7[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias7[i]);
          }
        catch(Exception e) {
          sqlOperation=sentencias7[i];
          Easp.chivato("2.7 *** Error : ["+sentencias7[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
          if (i >= 3 && i < 6 ) {
            Easp.connEA.rollback();
            return false;
            }
          }
        }

      String tablas[]= {"PARAMETROS","AYUDATXT"};
      if ( !Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0207","easp.jar"))
        return false;
      Easp.setVersionBD("bdeasp","2.7");
      Easp.connEA.commit();
      vvveractual.setValue("2.7");
      }

    if (vvveractual.getString().equals("2.7")) {
      for (i=0;i<sentencias8.length;++i) {
        try {
          Easp.chivato("2.8 Exec : ["+sentencias8[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias8[i]);
          }
        catch(Exception e) {
          sqlOperation=sentencias8[i];
          Easp.chivato("2.8 *** Error : ["+sentencias8[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
          }
        }
      Easp.setVersionBD("bdeasp","2.8");
      Easp.connEA.commit();
      vvveractual.setValue("2.8");
      }


    double versio=Double.valueOf(vvveractual.getString()).doubleValue();
    // if (vvveractual.getString().equals("2.8")) {
    if (versio < 4.2) {
      for (i=0;i<sentencias9.length;++i) {
        try {
          Easp.chivato("4.2 Exec : ["+sentencias9[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias9[i]);
          }
        catch(Exception e) {
          sqlOperation=sentencias9[i];
          Easp.chivato("4.2 *** Error : ["+sentencias9[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
          }
        }
      Easp.setVersionBD("bdeasp","4.2");
      Easp.connEA.commit();
      vvveractual.setValue("4.2");
      }

      if (versio < 4.3) {
        for (i=0;i<sentencias4_3.length;++i) {
          try {
            Easp.chivato("4.3 Exec : ["+sentencias4_3[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias4_3[i]);
            }
          catch(Exception e) {
            sqlOperation=sentencias4_3[i];
            Easp.chivato("4.3 *** Error : ["+sentencias4_3[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
            }
          }

        Easp.connEA.commit();
        String tablas[]= {"PAIS"};
        if ( !Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0403","easp.jar"))
          return false;
        Easp.setVersionBD("bdeasp","4.3");
        Easp.connEA.commit();
        vvveractual.setValue("4.3");
        }

      if (versio < 4.4) {
        for (i=0;i<sentencias4_4.length;++i) {
          try {
            Easp.chivato("4.4 Exec : ["+sentencias4_4[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias4_4[i]);
            }
          catch(Exception e) {
            sqlOperation=sentencias4_4[i];
            Easp.chivato("4.4 *** Error : ["+sentencias4_4[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
            }
          }
        Easp.setVersionBD("bdeasp","4.4");
        Easp.connEA.commit();
        vvveractual.setValue("4.4");
        }

      if (versio < 4.5) {
        for (i=0;i<sentencias4_5.length;++i) {
          try {
            Easp.chivato("4.5 Exec : ["+sentencias4_5[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias4_5[i]);
            }
          catch(Exception e) {
            sqlOperation=sentencias4_5[i];
            Easp.chivato("4.5 *** Error : ["+sentencias4_5[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
            }
          }
        Easp.setVersionBD("bdeasp","4.5");
        Easp.connEA.commit();
        vvveractual.setValue("4.5");
        }
      if (versio < 4.6) {
        for (i=0;i<sentencias4_6.length;++i) {
          try {
            Easp.chivato("4.6 Exec : ["+sentencias4_6[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias4_6[i]);
            }
          catch(Exception e) {
            sqlOperation=sentencias4_6[i];
            Easp.chivato("4.6 *** Error : ["+sentencias4_6[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
            }
          }
        Easp.setVersionBD("bdeasp","4.6");
        Easp.connEA.commit();
        vvveractual.setValue("4.6");
        }
      if (versio < 4.7) {
        for (i=0;i<sentencias4_7.length;++i) {
          try {
            Easp.chivato("4.7 Exec : ["+sentencias4_7[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias4_7[i]);
            }
          catch(Exception e) {
            sqlOperation=sentencias4_7[i];
            Easp.chivato("4.7 *** Error : ["+sentencias4_7[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
            }
          }
        Easp.setVersionBD("bdeasp","4.7");
        Easp.connEA.commit();
        vvveractual.setValue("4.7");
        }

      if (versio < 4.8) {
        for (i=0;i<sentencias4_8.length;++i) {
          try {
            Easp.chivato("4.8 Exec : ["+sentencias4_8[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias4_8[i]);
            }
          catch(Exception e) {
            sqlOperation=sentencias4_8[i];
            Easp.chivato("4.8 *** Error : ["+sentencias4_8[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
            }
          }
        Easp.setVersionBD("bdeasp","4.8");
        Easp.connEA.commit();
        vvveractual.setValue("4.8");
        }

      if (versio < 4.9) {
        for (i=0;i<sentencias4_9.length;++i) {
          try {
            Easp.chivato("4.9 Exec : ["+sentencias4_9[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias4_9[i]);
            }
          catch(Exception e) {
            sqlOperation=sentencias4_9[i];
            Easp.chivato("4.9 *** Error : ["+sentencias4_9[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
            }
          }
        Easp.setVersionBD("bdeasp","4.9");
        Easp.connEA.commit();
        vvveractual.setValue("4.9");
        }

      if (versio < 5.0) {
        for (i=0;i<sentencias5_0.length;++i) {
          try {
            Easp.chivato("5.0 Exec : ["+sentencias5_0[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias5_0[i]);
            }
          catch(Exception e) {
            sqlOperation=sentencias5_0[i];
            Easp.chivato("5.0 *** Error : ["+sentencias5_0[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
            }
          }
        Easp.setVersionBD("bdeasp","5.0");
        Easp.connEA.commit();
        vvveractual.setValue("5.0");
        }
      if (versio < 5.1) {
        try {
          Easp.chivato("5.1 Exec : [DELETE FROM EPIGRAFES]",1);
          Easp.connEA.executeUpdate("DELETE FROM EPIGRAFES");
          String tablas[]= {"EPIGRAFES"};
          Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0501","easp.jar");
        }
        catch(Exception e) {
          sqlOperation="DELETE FROM EPIGRAFES";
          Easp.chivato("5.1 *** Error : [DELETE FROM EPIGRAFES]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
        Easp.setVersionBD("bdeasp","5.1");
        Easp.connEA.commit();
        vvveractual.setValue("5.1");
      }
      if (versio < 5.2) {
        try {
          Easp.chivato("5.2 Exec : [DELETE FROM ADMHACIENDA]",1);
          Easp.connEA.executeUpdate("DELETE FROM ADMHACIENDA");
          String tablas[]= {"ADMHACIENDA"};
          Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0502","easp.jar");
        }
        catch(Exception e) {
          sqlOperation="DELETE FROM ADMHACIENDA";
          Easp.chivato("5.2 *** Error : [DELETE FROM ADMHACIENDA]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
        Easp.setVersionBD("bdeasp","5.2");
        Easp.connEA.commit();
        vvveractual.setValue("5.2");
      }
      if (versio < 5.3) {
        for (i=0;i<sentencias5_3.length;++i) {
          try {
            Easp.chivato("5.3 Exec : ["+sentencias5_3[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias5_3[i]);
          }
          catch(Exception e) {
            sqlOperation=sentencias5_3[i];
            Easp.chivato("5.3 *** Error : ["+sentencias5_3[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
          }
        }
        Easp.setVersionBD("bdeasp","5.3");
        Easp.connEA.commit();
        vvveractual.setValue("5.3");
      }
      if (versio < 5.4) {
        try {
          for (i=0;i<sentencias5_4.length;++i) {
            Easp.chivato("5.4 Exec : ["+sentencias5_4[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias5_4[i]);
          }
          String tablas[]= {"AMORTIZACION","VALORES"};
          Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0504","easp.jar");
        }
        catch(Exception e) {
          sqlOperation=sentencias5_4[i];
          Easp.chivato("5.4 *** Error : ["+sentencias5_4[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
        Easp.setVersionBD("bdeasp","5.4");
        Easp.connEA.commit();
        vvveractual.setValue("5.4");
      }
      if (versio < 5.5) {
        for (i=0;i<sentencias5_5.length;++i) {
          try {
            Easp.chivato("5.5 Exec : ["+sentencias5_5[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias5_5[i]);
          }
          catch(Exception e) {
            sqlOperation=sentencias5_5[i];
            Easp.chivato("5.5 *** Error : ["+sentencias5_5[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
          }
        }
        Easp.setVersionBD("bdeasp","5.5");
        Easp.connEA.commit();
        vvveractual.setValue("5.5");
      }
      if (versio < 5.6) {
        for (i=0;i<sentencias5_6.length;++i) {
          try {
            Easp.chivato("5.6 Exec : ["+sentencias5_6[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias5_6[i]);
          }
          catch(Exception e) {
            sqlOperation=sentencias5_6[i];
            Easp.chivato("5.6 *** Error : ["+sentencias5_6[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
          }
        }
        Easp.setVersionBD("bdeasp","5.6");
        Easp.connEA.commit();
        vvveractual.setValue("5.6");
      }
      if (versio < 5.7) {
        for (i=0;i<sentencias5_7.length;++i) {
          try {
            Easp.chivato("5.7 Exec : ["+sentencias5_7[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias5_7[i]);
          }
          catch(Exception e) {
            sqlOperation=sentencias5_7[i];
            Easp.chivato("5.7 *** Error : ["+sentencias5_7[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
          }
        }
        Easp.setVersionBD("bdeasp","5.7");
        Easp.connEA.commit();
        vvveractual.setValue("5.7");
      }
      if (versio < 5.8) {
        for (i=0;i<sentencias5_8.length;++i) {
          try {
            Easp.chivato("5.8 Exec : ["+sentencias5_8[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias5_8[i]);
          }
          catch(Exception e) {
            sqlOperation=sentencias5_8[i];
            Easp.chivato("5.8 *** Error : ["+sentencias5_8[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
          }
        }
        Easp.setVersionBD("bdeasp","5.8");
        Easp.connEA.commit();
        vvveractual.setValue("5.8");
      }
      if (versio < 5.9) {
        try {
          for (i=0;i<sentencias5_9.length;++i) {
            Easp.chivato("5.9 Exec : ["+sentencias5_9[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias5_9[i]);
          }
          String tablas[]= {"AMORTIZACION"};
          Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0509","easp.jar");
        }
        catch(Exception e) {
          sqlOperation=sentencias5_9[i];
          Easp.chivato("5.9 *** Error : ["+sentencias5_9[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
        Easp.setVersionBD("bdeasp","5.9");
        Easp.connEA.commit();
        vvveractual.setValue("5.9");
      }
      if (versio < 6.0) {
         try {
          for (i=0;i<sentencias6_0.length;++i) {
            Easp.chivato("6.0 Exec : ["+sentencias6_0[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias6_0[i]);
          }
         String tablas[]= {"AYUDATXT"};
         Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0600","easp.jar");
        }
        catch(Exception e) {
          sqlOperation=sentencias6_0[i];
          Easp.chivato("6.0 *** Error : ["+sentencias6_0[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }

        Easp.setVersionBD("bdeasp","6.0");
        Easp.connEA.commit();
        vvveractual.setValue("6.0");
      }
      if (versio < 6.1) {
        for (i=0;i<sentencias6_1.length;++i) {
          try {
            Easp.chivato("6.1 Exec : ["+sentencias6_1[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias6_1[i]);
          }
          catch(Exception e) {
            sqlOperation=sentencias6_1[i];
            Easp.chivato("6.1 *** Error : ["+sentencias6_1[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
          }
        }
        String tablas[]= {"TIPOVIAS","MUNI347"};
        Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0601","easp.jar");

        Easp.setVersionBD("bdeasp","6.1");
        Easp.connEA.commit();
        vvveractual.setValue("6.1");
      }
    if (versio < 6.2) {
        for (i=0;i<sentencias6_2.length;++i) {
          try {
            Easp.chivato("6.2 Exec : ["+sentencias6_2[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias6_2[i]);
          }
          catch(Exception e) {
            sqlOperation=sentencias6_2[i];
            Easp.chivato("6.2 *** Error : ["+sentencias6_2[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
          }
        }

        Easp.setVersionBD("bdeasp","6.2");
        Easp.connEA.commit();
        vvveractual.setValue("6.2");
      }
    if (versio < 6.3) {
      for (i=0;i<sentencias6_3.length;++i) {
        try {
          Easp.chivato("6.3 Exec : ["+sentencias6_3[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias6_3[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias6_3[i];
          Easp.chivato("6.3 *** Error : ["+sentencias6_3[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      actualizaTransaccion ("EAB","Adq. Intra. Bienes Inversión","E","AD","AD","NO","AIE");
      actualizaTransaccion ("EAD","Adquisición Intracomunitaria","E","AD","AD","NO","AIE");
      actualizaTransaccion ("EBM","Importación Bienes Inversión","E","AD",null,null,null);
      actualizaTransaccion ("EDI","Devengos por Inversion","E","IN","DI","NO","NO");
      actualizaTransaccion ("EEN","Entrega Intracomunitaria","E","EN","EN","EIE","NO");
      actualizaTransaccion ("EEX","Exportación","E","IN","EX","EX","NO");
      actualizaTransaccion ("END","Op. no sujetas dcho. deduc","E","IN","OND","EX","NDM");
      actualizaTransaccion ("EIB","Oper. Interiores de Bienes","E","IN","IN","NO","NO");
      actualizaTransaccion ("EIM","Importación","E","IN",null,null,null);
      actualizaTransaccion ("EIN","Operaciones Interiores","E","IN","IN","NO","NO");
      actualizaTransaccion ("EMB","Modificación B. y Q.","E","IN","MB","NO","NO");
      actualizaTransaccion ("EMQ","Modificación B. y Q. Quiebra","E","IN","MBQ","NO","NO");
      actualizaTransaccion ("EOE","Otras Operaciones Exentas","E","IN","OE","ESD","NO");
      actualizaTransaccion ("ERA","Reg. Esp. Agricultura y Pesca","E","IN","C","AG","NO");
      actualizaTransaccion ("ERD","Rectificación Deducciones","E","IN",null,null,null);
      actualizaTransaccion ("ERI","Regulación Inversión","E","IN",null,null,null);
      actualizaTransaccion ("EGI","Operaciones Intragrupo","E","IN","IG","NO","NO");

      actualizaTransaccion ("RGB","Op. Intragrupo Bienes invers.","R","IN","IGB","NO","NO");
      actualizaTransaccion ("RGI","Operaciones Intragrupo","R","IN","IG","NO","NO");
      actualizaTransaccion ("RRI","Regularizacion inversiones","R","IN","RI","NO","NO");
      actualizaTransaccion ("RRD","Rectificacion Deducciones","R","IN","RD","NO","NO");
      actualizaTransaccion ("RRA","Reg. Especial Agricultura","R","IN",null,null,null);
      actualizaTransaccion ("RR1","Deduc. regular. inversiones","R","IN","RI","NO","NO");
      actualizaTransaccion ("ROE","Otras operaciones Exentas","R","IN",null,null,null);
      actualizaTransaccion ("RMQ","Modificación B. y Q. Quiebra","R","IN",null,null,null);
      actualizaTransaccion ("RIN","Operaciones Interiores","R","IN","IN","NO","NO");
      actualizaTransaccion ("RIM","Deducible importaciones","R","IN","IM","NO","NO");
      actualizaTransaccion ("RIB","Oper. Interior de Bienes","R","IN","INB","NO","NO");
      actualizaTransaccion ("REX","Exportación","R","IN",null,null,null);
      actualizaTransaccion ("REN","Entrega Intracomunitaria","R","EN",null,null,null);
      actualizaTransaccion ("RDI","Devengos por Inversión","R","EN",null,null,null);
      actualizaTransaccion ("RBM","Importacion Bienes Inversion","R","IN","IMB","NO","NO");
      actualizaTransaccion ("RAG","Deducible RAGP","R","IN","RA","NO","NO");
      actualizaTransaccion ("RAD","Adquisición Intracomunitaria","R","AD","AD","NO","AIE");
      actualizaTransaccion ("RAB","Adq. Intra. Bienes Inversión","R","AD","ADB","NO","AIE");

      Easp.setVersionBD("bdeasp","6.3");
      Easp.connEA.commit();
      vvveractual.setValue("6.3");
    }
    if (versio < 6.4) {
      for (i=0;i<sentencias6_4.length;++i) {
        try {
          Easp.chivato("6.4 Exec : ["+sentencias6_4[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias6_4[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias6_4[i];
          Easp.chivato("6.4 *** Error : ["+sentencias6_4[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"MUNI347"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0601","easp.jar");
      Easp.setVersionBD("bdeasp","6.4");
      Easp.connEA.commit();
      vvveractual.setValue("6.4");
    }

    if (versio < 6.5) {
      for (i=0;i<sentencias6_5.length;++i) {
        try {
          Easp.chivato("6.5 Exec : ["+sentencias6_5[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias6_5[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias6_5[i];
          Easp.chivato("6.5 *** Error : ["+sentencias6_5[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }

      Easp.setVersionBD("bdeasp","6.5");
      Easp.connEA.commit();
      vvveractual.setValue("6.5");
    }

    if (versio < 6.6) {
      try {
        for (i=0;i<sentencias6_6.length;++i) {
          Easp.chivato("6.6 Exec : ["+sentencias6_6[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias6_6[i]);
        }
        String tablas[]= {"CNAE2009","CNAEEQUIV"};
        Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0606","easp.jar");
      }
      catch(Exception e) {
        sqlOperation=sentencias6_6[i];
        Easp.chivato("6.6 *** Error : ["+sentencias6_6[i]+"]  Error: ["+e+"]",1);
        errorMessage=e.getMessage();
      }
      Easp.setVersionBD("bdeasp","6.6");
      Easp.connEA.commit();
      vvveractual.setValue("6.6");
    }
    if (versio < 6.7) {
      try {
        for (i=0;i<sentencias6_7.length;++i) {
          Easp.chivato("6.7 Exec : ["+sentencias6_7[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias6_7[i]);
        }
        String tablas[]= {"EPIGRAFES"};
        Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0607","easp.jar");
      }
      catch(Exception e) {
        sqlOperation=sentencias6_7[i];
        Easp.chivato("6.7 *** Error : ["+sentencias6_7[i]+"]  Error: ["+e+"]",1);
        errorMessage=e.getMessage();
      }
      Easp.setVersionBD("bdeasp","6.7");
      Easp.connEA.commit();
      vvveractual.setValue("6.7");
    }
    if (versio < 6.8) {
      try {
        for (i=0;i<sentencias6_8.length;++i) {
          Easp.chivato("6.8 Exec : ["+sentencias6_8[i]+"]",1);
          try {
            Easp.connEA.executeUpdate(sentencias6_8[i]);
          }
          catch (Exception e) {
            Easp.chivato("6.8 *** Error : ["+sentencias6_8[i]+"]  seguimos.",1);
          }
        }
        String tablas[]= {"VALORES"};
        Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0608","easp.jar");
      }
      catch(Exception e) {
        sqlOperation=sentencias6_8[i];
        Easp.chivato("6.8 *** Error : ["+sentencias6_8[i]+"]  Error: ["+e+"]",1);
        errorMessage=e.getMessage();
      }
      Easp.setVersionBD("bdeasp","6.8");
      Easp.connEA.commit();
      vvveractual.setValue("6.8");
    }
    if (versio < 6.9) {
      try {
        Selector snifcdp = new Selector (Easp.connEA);
        snifcdp.execute("Select distinct cdpnifcif from CDP");
        while (snifcdp.next()) {
          String niftmp = snifcdp.getString("cdpnifcif");
          Easp.actualizarDomicilioFiscal(niftmp);
          Easp.actualizarDomicilioEnvio(niftmp);
        }
        snifcdp.close();
      }
      catch(Exception e) {
        Easp.chivato("6.9 *** Error: ["+e+"]",1);
        errorMessage=e.getMessage();
      }
      Easp.setVersionBD("bdeasp","6.9");
      Easp.connEA.commit();
      vvveractual.setValue("6.9");
    }
    if (versio < 7.0) {
      for (i=0;i<sentencias7_0.length;++i) {
        try {
          Easp.chivato("7.0 Exec : ["+sentencias7_0[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias7_0[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias7_0[i];
          Easp.chivato("7.0 *** Error : ["+sentencias7_0[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","7.0");
      Easp.connEA.commit();
      vvveractual.setValue("7.0");
    }
    if (versio < 7.1) {
      for (i=0;i<sentencias7_1.length;++i) {
        try {
          Easp.chivato("7.1 Exec : ["+sentencias7_1[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias7_1[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias7_1[i];
          Easp.chivato("7.1 *** Error : ["+sentencias7_1[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"CODIGOREGISTRO","COEFICCORREC"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0701","easp.jar");
      grabarINDEMORA (1991,Fecha.getDate(1991,1,1),Fecha.getDate(1991,12,31),12);
      grabarINDEMORA (1992,Fecha.getDate(1992,1,1),Fecha.getDate(1992,12,31),12);
      grabarINDEMORA (1993,Fecha.getDate(1993,1,1),Fecha.getDate(1993,12,31),12);
      grabarINDEMORA (1994,Fecha.getDate(1994,1,1),Fecha.getDate(1994,12,31),11);
      grabarINDEMORA (1995,Fecha.getDate(1995,1,1),Fecha.getDate(1995,12,31),11);
      grabarINDEMORA (1996,Fecha.getDate(1996,1,1),Fecha.getDate(1996,12,31),11);
      grabarINDEMORA (1997,Fecha.getDate(1997,1,1),Fecha.getDate(1997,12,31),9.5);
      grabarINDEMORA (1998,Fecha.getDate(1998,1,1),Fecha.getDate(1998,12,31),7.5);
      grabarINDEMORA (1999,Fecha.getDate(1999,1,1),Fecha.getDate(1999,12,31),5.5);
      grabarINDEMORA (2000,Fecha.getDate(2000,1,1),Fecha.getDate(2000,12,31),5.5);
      grabarINDEMORA (2001,Fecha.getDate(2001,1,1),Fecha.getDate(2001,12,31),6.5);
      grabarINDEMORA (2002,Fecha.getDate(2002,1,1),Fecha.getDate(2002,12,31),5.5);
      grabarINDEMORA (2003,Fecha.getDate(2003,1,1),Fecha.getDate(2003,12,31),5.5);
      grabarINDEMORA (2004,Fecha.getDate(2004,1,1),Fecha.getDate(2004,12,31),4.75);
      grabarINDEMORA (2005,Fecha.getDate(2005,1,1),Fecha.getDate(2005,12,31),5);
      grabarINDEMORA (2006,Fecha.getDate(2006,1,1),Fecha.getDate(2006,12,31),5);
      grabarINDEMORA (2007,Fecha.getDate(2007,1,1),Fecha.getDate(2007,12,31),6.25);
      grabarINDEMORA (2008,Fecha.getDate(2008,1,1),Fecha.getDate(2008,12,31),7);
      grabarINDEMORA (2009,Fecha.getDate(2009,1,1),Fecha.getDate(2009,03,31),7);
      grabarINDEMORA (2009,Fecha.getDate(2009,4,1),Fecha.getDate(2009,12,31),5);
      Easp.setVersionBD("bdeasp","7.1");
      Easp.connEA.commit();
      vvveractual.setValue("7.1");
    }
    if (versio < 7.2) {
      for (i=0;i<sentencias7_2.length;++i) {
        try {
          Easp.chivato("7.2 Exec : ["+sentencias7_2[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias7_2[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias7_2[i];
          Easp.chivato("7.2 *** Error : ["+sentencias7_2[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","7.2");
      Easp.connEA.commit();
      vvveractual.setValue("7.2");
    }
    if (versio < 7.3) {
      String tablas[]= {"COEFICCORREC"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0703","easp.jar");
      grabarINDEMORA (2010,Fecha.getDate(2010,1,1),Fecha.getDate(2010,12,31),5);
      Easp.setVersionBD("bdeasp","7.3");
      Easp.connEA.commit();
      vvveractual.setValue("7.3");
    }
    if (versio < 7.4) {
      for (i=0;i<sentencias7_4.length;++i) {
        try {
          Easp.chivato("7.4 Exec : ["+sentencias7_4[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias7_4[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias7_4[i];
          Easp.chivato("7.4 *** Error : ["+sentencias7_4[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","7.4");
      Easp.connEA.commit();
      vvveractual.setValue("7.4");
    }
    if (versio < 7.5) {
      for (i=0;i<sentencias7_5.length;++i) {
        try {
          Easp.chivato("7.5 Exec : ["+sentencias7_5[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias7_5[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias7_5[i];
          Easp.chivato("7.5 *** Error : ["+sentencias7_5[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","7.5");
      Easp.connEA.commit();
      vvveractual.setValue("7.5");
    }
    if (versio < 7.6) {
      for (i=0;i<sentencias7_6.length;++i) {
        try {
          Easp.chivato("7.6 Exec : ["+sentencias7_6[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias7_6[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias7_6[i];
          Easp.chivato("7.6 *** Error : ["+sentencias7_6[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","7.6");
      Easp.connEA.commit();
      vvveractual.setValue("7.6");
    }
    if (versio < 7.7) {
      for (i=0;i<sentencias7_7.length;++i) {
        try {
          Easp.chivato("7.7 Exec : ["+sentencias7_7[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias7_7[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias7_7[i];
          Easp.chivato("7.7 *** Error : ["+sentencias7_7[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"CODIGOREGISTRO"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0707","easp.jar");
      Easp.setVersionBD("bdeasp","7.7");
      Easp.connEA.commit();
      vvveractual.setValue("7.7");
    }
    if (versio < 7.8) {
      for (i=0;i<sentencias7_8.length;++i) {
        try {
          Easp.chivato("7.8 Exec : ["+sentencias7_8[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias7_8[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias7_8[i];
          Easp.chivato("7.8 *** Error : ["+sentencias7_8[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","7.8");
      Easp.connEA.commit();
      vvveractual.setValue("7.8");
    }
    if (versio < 7.9) {
      for (i=0;i<sentencias7_9.length;++i) {
        try {
          Easp.chivato("7.9 Exec : ["+sentencias7_9[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias7_9[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias7_9[i];
          Easp.chivato("7.9 *** Error : ["+sentencias7_9[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"CNAE1993"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0709","easp.jar");
      Easp.setVersionBD("bdeasp","7.9");
      Easp.connEA.commit();
      vvveractual.setValue("7.9");
    }
    if (versio < 8.0) {
      for (i=0;i<sentencias8_0.length;++i) {
        try {
          Easp.chivato("8.0 Exec : ["+sentencias8_0[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias8_0[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias8_0[i];
          Easp.chivato("8.0 *** Error : ["+sentencias8_0[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","8.0");
      Easp.connEA.commit();
      vvveractual.setValue("8.0");
    }
    if (versio < 8.1) {
      for (i=0;i<sentencias8_1.length;++i) {
        try {
          Easp.chivato("8.1 Exec : ["+sentencias8_1[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias8_1[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias8_1[i];
          Easp.chivato("8.1 *** Error : ["+sentencias8_1[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"CNAE1993"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0801","easp.jar");
      Easp.setVersionBD("bdeasp","8.1");
      Easp.connEA.commit();
      vvveractual.setValue("8.1");
    }
    if (versio < 8.3) {
      for (i=0;i<sentencias8_2.length;++i) {
        try {
          Easp.chivato("8.3 Exec : ["+sentencias8_2[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias8_2[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias8_2[i];
          Easp.chivato("8.3 *** Error : ["+sentencias8_2[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"CNAE1993"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0802","easp.jar");
      Easp.setVersionBD("bdeasp","8.3");
      Easp.connEA.commit();
      vvveractual.setValue("8.3");
    }
    if (versio < 8.4) {
      for (i=0;i<sentencias8_4.length;++i) {
        try {
          Easp.chivato("8.4 Exec : ["+sentencias8_4[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias8_4[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias8_4[i];
          Easp.chivato("8.4 *** Error : ["+sentencias8_4[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"MUNI347"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0804","easp.jar");
      Easp.setVersionBD("bdeasp","8.4");
      Easp.connEA.commit();
      vvveractual.setValue("8.4");
    }
    if (versio < 8.5) {
      for (i=0;i<sentencias8_5.length;++i) {
        try {
          Easp.chivato("8.5 Exec : ["+sentencias8_5[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias8_5[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias8_5[i];
          Easp.chivato("8.5 *** Error : ["+sentencias8_5[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"PAIS"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0805","easp.jar");
      Easp.setVersionBD("bdeasp","8.5");
      Easp.connEA.commit();
      vvveractual.setValue("8.5");
    }
  if (versio < 8.6) {
      for (i=0;i<sentencias8_6.length;++i) {
        try {
          Easp.chivato("8.6 Exec : ["+sentencias8_6[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias8_6[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias8_6[i];
          Easp.chivato("8.6 *** Error : ["+sentencias8_6[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","8.6");
      Easp.connEA.commit();
      vvveractual.setValue("8.6");
    }

  if (versio < 8.7) {
      for (i=0;i<sentencias8_7.length;++i) {
        try {
          Easp.chivato("8.7 Exec : ["+sentencias8_7[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias8_7[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias8_7[i];
          Easp.chivato("8.7 *** Error : ["+sentencias8_7[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","8.7");
      Easp.connEA.commit();
      vvveractual.setValue("8.7");
    }
    if (versio < 8.8) {
      for (i=0;i<sentencias8_8.length;++i) {
        try {
          Easp.chivato("8.8 Exec : ["+sentencias8_8[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias8_8[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias8_8[i];
          Easp.chivato("8.8 *** Error : ["+sentencias8_8[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"MUNI347"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0808","easp.jar");
      Easp.setVersionBD("bdeasp","8.8");
      Easp.connEA.commit();
      vvveractual.setValue("8.8");
    }
    if (versio < 8.9) {
      for (i=0;i<sentencias8_9.length;++i) {
        try {
          Easp.chivato("8.9 Exec : ["+sentencias8_9[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias8_9[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias8_9[i];
          Easp.chivato("8.9 *** Error : ["+sentencias8_9[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"COEFICCORREC"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0809","easp.jar");
      Easp.setVersionBD("bdeasp","8.9");
      Easp.connEA.commit();
      vvveractual.setValue("8.9");
    }
    if (versio < 9.0) {
      grabarINDEMORA (2011,Fecha.getDate(2011,1,1),Fecha.getDate(2011,12,31),5);
      Easp.setVersionBD("bdeasp","9.0");
      Easp.connEA.commit();
      vvveractual.setValue("9.0");
    }

    if (versio < 9.1) {
      for (i=0;i<sentencias9_1.length;++i) {
        try {
          Easp.chivato("9.1 Exec : ["+sentencias9_1[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias9_1[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias9_1[i];
          Easp.chivato("9.1*** Error : ["+sentencias9_1[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","9.1");
      Easp.connEA.commit();
      vvveractual.setValue("9.1");
    }

    if (versio < 9.2) {
      for (i=0;i<sentencias9_2.length;++i) {
        try {
          Easp.chivato("9.2 Exec : ["+sentencias9_2[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias9_2[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias9_2[i];
          Easp.chivato("9.2*** Error : ["+sentencias9_2[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","9.2");
      Easp.connEA.commit();
      vvveractual.setValue("9.2");
    }
    if (versio < 9.3) {
      for (i=0;i<sentencias9_3.length;++i) {
        try {
          Easp.chivato("9.3 Exec : ["+sentencias9_3[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias9_3[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias9_3[i];
          Easp.chivato("9.3 *** Error : ["+sentencias9_3[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"COEFICCORREC"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0903","easp.jar");
      Easp.setVersionBD("bdeasp","9.3");
      Easp.connEA.commit();
      vvveractual.setValue("9.3");
    }
    if (versio < 9.4) {
      for (i=0;i<sentencias9_4.length;++i) {
        try {
          Easp.chivato("9.4 Exec : ["+sentencias9_4[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias9_4[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias9_4[i];
          Easp.chivato("9.4 *** Error : ["+sentencias9_4[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","9.4");
      Easp.connEA.commit();
      vvveractual.setValue("9.4");
    }


    if (versio < 9.5) {
      for (i=0;i<sentencias9_5.length;++i) {
        try {
          Easp.chivato("9.5 Exec : ["+sentencias9_5[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias9_5[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias9_5[i];
          Easp.chivato("9.5 *** Error : ["+sentencias9_5[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","9.5");
      Easp.connEA.commit();
      vvveractual.setValue("9.5");
    }

    if (versio < 9.6) {
      for (i=0;i<sentencias9_6.length;++i) {
        try {
          Easp.chivato("9.6 Exec : ["+sentencias9_6[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias9_6[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias9_6[i];
          Easp.chivato("9.6 *** Error : ["+sentencias9_6[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","9.6");
      Easp.connEA.commit();
      vvveractual.setValue("9.6");
    }
    if (versio < 9.7) {
      grabarINDEMORA (2012,Fecha.getDate(2012,1,1),Fecha.getDate(2012,12,31),5);
      Easp.setVersionBD("bdeasp","9.7");
      Easp.connEA.commit();
      vvveractual.setValue("9.7");
    }

    if (versio < 9.8) {
      for (i=0;i<sentencias9_8.length;++i) {
        try {
          Easp.chivato("9.8 Exec : ["+sentencias9_8[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias9_8[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias9_8[i];
          Easp.chivato("9.8 *** Error : ["+sentencias9_8[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","9.8");
      Easp.connEA.commit();
      vvveractual.setValue("9.8");
    }
    if (versio < 9.9) {
      for (i=0;i<sentencias9_9.length;++i) {
        try {
          Easp.chivato("9.9 Exec : ["+sentencias9_9[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias9_9[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias9_9[i];
          Easp.chivato("9.9 *** Error : ["+sentencias9_9[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"COEFICCORREC"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver0909","easp.jar");
      Easp.setVersionBD("bdeasp","9.9");
      Easp.connEA.commit();
      vvveractual.setValue("9.9");
    }
    if (versio < 10.0) {
            java.util.Hashtable <String,String> htbancos = new java.util.Hashtable <String,String> ();
            htbancos.put("3   ".trim()," BANCO DE DEPOSITOS, S.A.                                                                       ".trim());
            htbancos.put("11  ".trim()," ALLFUNDS BANK, S.A.                                                                            ".trim());
            htbancos.put("19  ".trim()," DEUTSCHE BANK, S.A.E.                                                                          ".trim());
            htbancos.put("30  ".trim()," BANCO ESPAÑOL DE CREDITO, S.A.                                                                 ".trim());
            htbancos.put("31  ".trim()," BANCO ETCHEVERRIA, S.A.                                                                        ".trim());
            htbancos.put("36  ".trim()," SANTANDER INVESTMENT, S.A                                                                      ".trim());
            htbancos.put("38  ".trim()," BANESTO BANCO DE EMISIONES, S.A.                                                               ".trim());
            htbancos.put("46  ".trim()," BANCO GALLEGO, S.A.                                                                            ".trim());
            htbancos.put("49  ".trim()," BANCO SANTANDER, S.A.                                                                          ".trim());
            htbancos.put("57  ".trim()," BANCO DEPOSITARIO BBVA, S.A.                                                                   ".trim());
            htbancos.put("58  ".trim()," BNP PARIBAS ESPAÑA, S.A.                                                                       ".trim());
            htbancos.put("59  ".trim()," BANCO DE MADRID, S.A.                                                                          ".trim());
            htbancos.put("61  ".trim()," BANCA MARCH, S.A.                                                                              ".trim());
            htbancos.put("65  ".trim()," BARCLAYS BANK, S.A.                                                                            ".trim());
            htbancos.put("72  ".trim()," BANCO PASTOR, S.A.                                                                             ".trim());
            htbancos.put("73  ".trim()," OPEN BANK, S.A.                                                                                ".trim());
            htbancos.put("75  ".trim()," BANCO POPULAR ESPAÑOL, S.A.                                                                    ".trim());
            htbancos.put("78  ".trim()," BANCA PUEYO, S.A.                                                                              ".trim());
            htbancos.put("81  ".trim()," BANCO DE SABADELL, S.A.                                                                        ".trim());
            htbancos.put("83  ".trim()," RENTA 4 BANCO, S.A.                                                                            ".trim());
            htbancos.put("86  ".trim()," BANCO BANIF, S.A.                                                                              ".trim());
            htbancos.put("91  ".trim()," BANCO DE ALBACETE, S.A.                                                                        ".trim());
            htbancos.put("93  ".trim()," BANCO DE VALENCIA, S.A.                                                                        ".trim());
            htbancos.put("94  ".trim()," RBC DEXIA INVESTOR SERVICES ESPAÑA, S.A.                                                       ".trim());
            htbancos.put("99  ".trim()," BANKIA BANCA PRIVADA, S.A.                                                                     ".trim());
            htbancos.put("108 ".trim()," SOCIETE GENERALE, S.E.                                                                         ".trim());
            htbancos.put("113 ".trim()," BANCO INDUSTRIAL DE BILBAO, S.A.                                                               ".trim());
            htbancos.put("115 ".trim()," BANCO DE CASTILLA-LA MANCHA, S.A.                                                              ".trim());
            htbancos.put("121 ".trim()," BANCO OCCIDENTAL, S.A.                                                                         ".trim());
            htbancos.put("122 ".trim()," CITIBANK ESPAÑA, S.A.                                                                          ".trim());
            htbancos.put("125 ".trim()," BANCOFAR, S.A.                                                                                 ".trim());
            htbancos.put("128 ".trim()," BANKINTER, S.A.                                                                                ".trim());
            htbancos.put("129 ".trim()," BBVA BANCO DE FINANCIACION, S.A.                                                               ".trim());
            htbancos.put("130 ".trim()," BANCO CAIXA GERAL, S.A.                                                                        ".trim());
            htbancos.put("131 ".trim()," BANCO ESPIRITO SANTO, S.A., S.E.                                                               ".trim());
            htbancos.put("132 ".trim()," BANCO DE PROMOCION DE NEGOCIOS, S.A. (PROMOBANC)                                               ".trim());
            htbancos.put("133 ".trim()," NUEVO MICRO BANK, S.A.                                                                         ".trim());
            htbancos.put("136 ".trim()," ARESBANK, S.A                                                                                  ".trim());
            htbancos.put("138 ".trim()," BANKOA, S.A.                                                                                   ".trim());
            htbancos.put("142 ".trim()," BANCO DE LA PEQUEÑA Y MEDIANA EMPRESA, S.A.                                                    ".trim());
            htbancos.put("144 ".trim()," BNP PARIBAS SECURITIES SERVICES, S.E.                                                          ".trim());
            htbancos.put("145 ".trim()," DEUTSCHE BANK A.G., S.E.                                                                       ".trim());
            htbancos.put("149 ".trim()," BNP PARIBAS, S.E.                                                                              ".trim());
            htbancos.put("151 ".trim()," JPMORGAN CHASE BANK NATIONAL ASSOCIATION, S.E.                                                 ".trim());
            htbancos.put("152 ".trim()," BARCLAYS BANK PLC, S.E.                                                                        ".trim());
            htbancos.put("154 ".trim()," CREDIT AGRICOLE CORPORATE AND INVESTMENT BANK,S.E.                                             ".trim());
            htbancos.put("155 ".trim()," BANCO DO BRASIL, S.A., S.E.                                                                    ".trim());
            htbancos.put("156 ".trim()," THE ROYAL BANK OF SCOTLAND N.V. S.E.                                                           ".trim());
            htbancos.put("159 ".trim()," COMMERZBANK AKTIENGESELLSCHAFT, S.E.                                                           ".trim());
            htbancos.put("160 ".trim()," THE BANK OF TOKYO-MITSUBISHI UFJ, LTD, S.E.                                                    ".trim());
            htbancos.put("161 ".trim()," DEUTSCHE BANK TRUST COMPANY AMERICAS, S.E.                                                     ".trim());
            htbancos.put("162 ".trim()," HSBC BANK PLC, S.E.                                                                            ".trim());
            htbancos.put("167 ".trim()," FORTIS BANK, S.A., S.E.                                                                        ".trim());
            htbancos.put("168 ".trim()," ING BELGIUM, S.A., S.E.                                                                        ".trim());
            htbancos.put("169 ".trim()," BANCO DE LA NACION ARGENTINA, S.E.                                                             ".trim());
            htbancos.put("182 ".trim()," BANCO BILBAO VIZCAYA ARGENTARIA, S.A.                                                          ".trim());
            htbancos.put("184 ".trim()," BANCO EUROPEO DE FINANZAS, S.A.                                                                ".trim());
            htbancos.put("186 ".trim()," BANCO MEDIOLANUM, S.A.                                                                         ".trim());
            htbancos.put("188 ".trim()," BANCO ALCALA, S.A.                                                                             ".trim());
            htbancos.put("190 ".trim()," BANCO BPI, S.A., S.E.                                                                          ".trim());
            htbancos.put("196 ".trim()," WESTLB AG, S.E.                                                                                ".trim());
            htbancos.put("198 ".trim()," BANCO COOPERATIVO ESPAÑOL, S.A.                                                                ".trim());
            htbancos.put("200 ".trim()," PRIVAT BANK DEGROOF, S.A.                                                                      ".trim());
            htbancos.put("211 ".trim()," EBN BANCO DE NEGOCIOS, S.A.                                                                    ".trim());
            htbancos.put("216 ".trim()," TARGOBANK, S.A.                                                                                ".trim());
            htbancos.put("218 ".trim()," FCE BANK PLC S.E.                                                                              ".trim());
            htbancos.put("219 ".trim()," BANQUE MAROCAINE COMMERCE EXTERIEUR INTERNAT.,S.A.                                             ".trim());
            htbancos.put("220 ".trim()," BANCO FINANTIA SOFINLOC, S.A.                                                                  ".trim());
            htbancos.put("223 ".trim()," GENERAL ELECTRIC CAPITAL BANK, S.A.                                                            ".trim());
            htbancos.put("224 ".trim()," SANTANDER CONSUMER FINANCE, S.A.                                                               ".trim());
            htbancos.put("225 ".trim()," BANCO CETELEM, S.A.                                                                            ".trim());
            htbancos.put("226 ".trim()," UBS BANK, S.A                                                                                  ".trim());
            htbancos.put("227 ".trim()," UNOE BANK, S.A.                                                                                ".trim());
            htbancos.put("229 ".trim()," BANCOPOPULAR-E, S.A.                                                                           ".trim());
            htbancos.put("231 ".trim()," DEXIA SABADELL, S.A.                                                                           ".trim());
            htbancos.put("232 ".trim()," BANCO INVERSIS, S.A.                                                                           ".trim());
            htbancos.put("233 ".trim()," POPULAR BANCA PRIVADA, S.A.                                                                    ".trim());
            htbancos.put("234 ".trim()," BANCO CAMINOS, S.A.                                                                            ".trim());
            htbancos.put("235 ".trim()," BANCO PICHINCHA ESPAÑA, S.A.                                                                   ".trim());
            htbancos.put("236 ".trim()," LLOYDS BANK INTERNATIONAL, S.A.                                                                ".trim());
            htbancos.put("237 ".trim()," BBK BANK CAJASUR, S.A.                                                                         ".trim());
            htbancos.put("487 ".trim()," BANCO MARE NOSTRUM, S.A.                                                                       ".trim());
            htbancos.put("488 ".trim()," BANCO FINANCIERO Y DE AHORROS, S.A.                                                            ".trim());
            htbancos.put("490 ".trim()," BANCA CIVICA, S.A.                                                                             ".trim());
            htbancos.put("1451".trim(),"CAISSE REGIONALE CREDIT AGRICOLE MUTUEL SUD MED,SE                                              ".trim());
            htbancos.put("1457".trim(),"DE LAGE LANDEN INTERNATIONAL B.V., S.E.                                                         ".trim());
            htbancos.put("1459".trim(),"COOP.CENTR. RAIFFEISEN-BOERENL.(RABOBANK NED.)S.E.                                              ".trim());
            htbancos.put("1460".trim(),"CREDIT SUISSE AG, S.E.                                                                          ".trim());
            htbancos.put("1463".trim(),"BANQUE PSA FINANCE, S.E.                                                                        ".trim());
            htbancos.put("1465".trim(),"ING DIRECT, N.V. S.E.                                                                           ".trim());
            htbancos.put("1467".trim(),"EUROHYPO A.G., S.E.                                                                             ".trim());
            htbancos.put("1469".trim(),"BANCO SYGMA HISPANIA, S.E.                                                                      ".trim());
            htbancos.put("1470".trim(),"BANCO PORTUGUES DE INVESTIMENTO, S.A. S.E.                                                      ".trim());
            htbancos.put("1472".trim(),"CREDIT AGRICOLE LEASING & FACTORING, S.E.                                                       ".trim());
            htbancos.put("1473".trim(),"BANQUE PRIVEE EDMOND DE ROTHSCHILD EUROPE, S.E.                                                 ".trim());
            htbancos.put("1474".trim(),"CITIBANK INTERNATIONAL PLC, S.E.                                                                ".trim());
            htbancos.put("1475".trim(),"CORTAL CONSORS, S.E.                                                                            ".trim());
            htbancos.put("1477".trim(),"THE ROYAL BANK OF SCOTLAND PLC, S.E.                                                            ".trim());
            htbancos.put("1479".trim(),"NATIXIS, S.A., S.E.                                                                             ".trim());
            htbancos.put("1480".trim(),"VOLKSWAGEN BANK GMBH, S.E.                                                                      ".trim());
            htbancos.put("1481".trim(),"BANCO MAIS, S.A. (ESPANHA), S.E.                                                                ".trim());
            htbancos.put("1482".trim(),"JOHN DEERE BANK, S.A., S.E.                                                                     ".trim());
            htbancos.put("1483".trim(),"BANK OF SCOTLAND, S.E.                                                                          ".trim());
            htbancos.put("1485".trim(),"BANK OF AMERICA, NATIONAL ASSOCIATION, S.E.                                                     ".trim());
            htbancos.put("1487".trim(),"TOYOTA KREDITBANK GMBH, S.E.                                                                    ".trim());
            htbancos.put("1488".trim(),"PICTET & CIE (EUROPE), S.A., S.E.                                                               ".trim());
            htbancos.put("1490".trim(),"SELF TRADE BANK, S.A.                                                                           ".trim());
            htbancos.put("1491".trim(),"TRIODOS BANK, N.V., S.E.                                                                        ".trim());
            htbancos.put("1492".trim(),"BNP PARIBAS LEASE GROUP, S.A. S.E.                                                              ".trim());
            htbancos.put("1493".trim(),"CAIXA BANCO DE INVESTIMENTO, S.A., S.E.                                                         ".trim());
            htbancos.put("1494".trim(),"INTESA SANPAOLO S.P.A., S.E.                                                                    ".trim());
            htbancos.put("1496".trim(),"GENEFIM, S.E.                                                                                   ".trim());
            htbancos.put("1497".trim(),"BANCO ESPIRITO SANTO DE INVESTIMENTO, S.A., S.E.                                                ".trim());
            htbancos.put("1499".trim(),"CLAAS FINANCIAL SERVICES, S.A.S., S.E.                                                          ".trim());
            htbancos.put("1500".trim(),"NATIXIS LEASE S.A., S.E.                                                                        ".trim());
            htbancos.put("1501".trim(),"DEUTSCHE PFANDBRIEFBANK AG, S.E.                                                                ".trim());
            htbancos.put("1502".trim(),"IKB DEUTSCHE INDUSTRIEBANK AG, S.E.                                                             ".trim());
            htbancos.put("1504".trim(),"HONDA BANK GMBH, S.E.                                                                           ".trim());
            htbancos.put("1505".trim(),"EUROPE ARAB BANK PLC, S.E.                                                                      ".trim());
            htbancos.put("1506".trim(),"MERRILL LYNCH INTERNATIONAL BANK LTD., S.E.                                                     ".trim());
            htbancos.put("1508".trim(),"RCI BANQUE, S.A., S.E.                                                                          ".trim());
            htbancos.put("1509".trim(),"BANCO PRIMUS, S.A., S.E.                                                                        ".trim());
            htbancos.put("1510".trim(),"SAXO BANK A/S S.E.                                                                              ".trim());
            htbancos.put("1512".trim(),"ELAVON FINANCIAL SERVICES LIMITED, S.E.                                                         ".trim());
            htbancos.put("1513".trim(),"CAIXA GERAL DE DEPOSITOS, S.A. SUCURSAL EN ESPAÑA                                               ".trim());
            htbancos.put("1514".trim(),"CNH FINANCIAL SERVICES, S.E.                                                                    ".trim());
            htbancos.put("1515".trim(),"CITIBANK, N.A., S.E.                                                                            ".trim());
            htbancos.put("1516".trim(),"J.P. MORGAN INTERNATIONAL BANK LIMITED, S.E.                                                    ".trim());
            htbancos.put("1520".trim(),"MEDIOBANCA, S.E.                                                                                ".trim());
            htbancos.put("1521".trim(),"BINCKBANK NV, S.E.                                                                              ".trim());
            htbancos.put("1522".trim(),"EFG BANK (LUXEMBOURG) S.A., S.E.                                                                ".trim());
            htbancos.put("1523".trim(),"MERCEDES-BENZ BANK AG, SUCURSAL EN ESPAÑA                                                       ".trim());
            htbancos.put("1524".trim(),"UBI BANCA INTERNATIONAL, S.A., S.E.                                                             ".trim());
            htbancos.put("1525".trim(),"BANQUE CHAABI DU MAROC, S.E.                                                                    ".trim());
            htbancos.put("1526".trim(),"CLOSE BROTHERS LIMITED, S.E.                                                                    ".trim());
            htbancos.put("1528".trim(),"JCB FINANCE, S.A.S., S. E.                                                                      ".trim());
            htbancos.put("1529".trim(),"MCE BANK GMBH, S.E.                                                                             ".trim());
            htbancos.put("1530".trim(),"SOFINLOC INSTITUIÇAO FINANCEIRA DE CTO., S.A.,S.E.                                              ".trim());
            htbancos.put("1531".trim(),"CREDIT SUISSE INTERNATIONAL,S.E.                                                                ".trim());
            htbancos.put("1532".trim(),"BNP PARIBAS FACTOR, S.A. S.E.                                                                   ".trim());
            htbancos.put("1533".trim(),"BMW BANK GMBH, SUCURSAL EN ESPAÑA.                                                              ".trim());
            htbancos.put("1534".trim(),"KBL EUROPEAN PRIVATE BANKERS, S.A. S.E.                                                         ".trim());
            htbancos.put("1535".trim(),"AKF BANK GMBH & CO KG, S.E.                                                                     ".trim());
            htbancos.put("1536".trim(),"OREY FINANCIAL-INSTITUIÇAO FINANC. CTO. S.A. S.E.                                               ".trim());
            htbancos.put("1537".trim(),"LLOYDS TSB BANK PLC, S.E.                                                                       ".trim());
            htbancos.put("1538".trim(),"INDUSTRIAL & COMMERCIAL BANK OF CHINA(EUROPE)SA,SE                                              ".trim());
            htbancos.put("1539".trim(),"BIGBANK AS CONSUMER FINANCE, S.E.                                                               ".trim());
            htbancos.put("1541".trim(),"ATTIJARIWAFA BANK EUROPE, S.E.                                                                  ".trim());
            htbancos.put("1542".trim(),"J.P. MORGAN SECURITIES LTD, S.E.                                                                ".trim());
            htbancos.put("1543".trim(),"COFIDIS, S.A. SUCURSAL EN ESPAÑA                                                                ".trim());
            htbancos.put("1544".trim(),"ANDBANC LUXEMBOURG, S.A., SUCURSAL EN ESPAÑA                                                    ".trim());
            htbancos.put("2000".trim(),"CONFEDERACION ESPAÑOLA DE CAJAS DE AHORROS                                                      ".trim());
            htbancos.put("2013".trim(),"CATALUNYA BANC, S.A.                                                                            ".trim());
            htbancos.put("2038".trim(),"BANKIA, S.A.                                                                                    ".trim());
            htbancos.put("2045".trim(),"CAJA DE AHORROS Y M.P. DE ONTINYENT                                                             ".trim());
            htbancos.put("2048".trim(),"LIBERBANK, S.A.                                                                                 ".trim());
            htbancos.put("2056".trim(),"COLONYA - CAIXA D'ESTALVIS DE POLLENSA                                                          ".trim());
            htbancos.put("2080".trim(),"NCG BANCO, S.A.                                                                                 ".trim());
            htbancos.put("2085".trim(),"IBERCAJA BANCO, S.A.                                                                            ".trim());
            htbancos.put("2086".trim(),"BANCO GRUPO CAJATRES, S.A.                                                                      ".trim());
            htbancos.put("2090".trim(),"BANCO CAM, S.A.                                                                                 ".trim());
            htbancos.put("2095".trim(),"KUTXABANK, S.A                                                                                  ".trim());
            htbancos.put("2100".trim(),"CAIXABANK, S.A.                                                                                 ".trim());
            htbancos.put("2103".trim(),"UNICAJA BANCO, S.A.                                                                             ".trim());
            htbancos.put("2107".trim(),"UNNIM BANC, S.A                                                                                 ".trim());
            htbancos.put("2108".trim(),"BANCO DE CAJA ESPAÑA INVER. SALAMANCA Y SORIA,S.A.                                              ".trim());
            htbancos.put("2401".trim(),"CAJA DE AHORROS Y PENSIONES DE BARCELONA                                                        ".trim());
            htbancos.put("2402".trim(),"CAJA DE AHORROS Y M.P. DE MADRID                                                                ".trim());
            htbancos.put("2403".trim(),"CAJA AH. VALENCIA, CASTELLON Y ALICANTE, BANCAJA                                                ".trim());
            htbancos.put("2404".trim(),"CAJA INSULAR DE AHORROS DE CANARIAS                                                             ".trim());
            htbancos.put("2405".trim(),"CAIXA D'ESTALVIS LAIETANA                                                                       ".trim());
            htbancos.put("2406".trim(),"CAJA DE AHORROS DE LA RIOJA                                                                     ".trim());
            htbancos.put("2407".trim(),"CAJA DE AHORROS Y M.P. DE AVILA                                                                 ".trim());
            htbancos.put("2408".trim(),"CAJA DE AHORROS Y M.P. DE SEGOVIA                                                               ".trim());
            htbancos.put("2409".trim(),"CAJA DE AHORROS DEL MEDITERRANEO                                                                ".trim());
            htbancos.put("2410".trim(),"CAJA DE AHORROS Y M.P. DE NAVARRA                                                               ".trim());
            htbancos.put("2411".trim(),"MPCA S.FERNANDO GUADALAJARA,HUELVA,JEREZ Y SEVILLA                                              ".trim());
            htbancos.put("2412".trim(),"CAJA GENERAL DE AHORROS DE CANARIAS                                                             ".trim());
            htbancos.put("2413".trim(),"CAJA DE AHORROS MUNICIPAL DE BURGOS                                                             ".trim());
            htbancos.put("2414".trim(),"CAJA DE AHORROS DE ASTURIAS                                                                     ".trim());
            htbancos.put("2415".trim(),"CAJA DE AHORROS Y M.P. DE EXTREMADURA                                                           ".trim());
            htbancos.put("2416".trim(),"CAJA DE AHORROS DE SANTANDER Y CANTABRIA                                                        ".trim());
            htbancos.put("2417".trim(),"CAIXA AFORROS DE GALICIA,VIGO,OURENSE E PONTEVEDRA                                              ".trim());
            htbancos.put("2418".trim(),"CAIXA D'ESTALVIS DE CATALUNYA,TARRAGONA I MANRESA                                               ".trim());
            htbancos.put("2419".trim(),"CAIXA E. UNIO CAIXES MANLLEU, SABADELL I TERRASSA                                               ".trim());
            htbancos.put("2420".trim(),"CAJA DE AHORROS Y M.P. DE ZARAGOZA, ARAGON Y RIOJA                                              ".trim());
            htbancos.put("2421".trim(),"CAJA GENERAL DE AHORROS DE GRANADA                                                              ".trim());
            htbancos.put("2422".trim(),"CAJA DE AHORROS DE MURCIA                                                                       ".trim());
            htbancos.put("2423".trim(),"CAIXA D'ESTALVIS DEL PENEDES                                                                    ".trim());
            htbancos.put("2424".trim(),"CAJA DE AHORROS Y M.P. DE LAS BALEARES                                                          ".trim());
            htbancos.put("2425".trim(),"CAJA ESPAÑA DE INVERSIONES, SALAMANCA Y SORIA,CAMP                                              ".trim());
            htbancos.put("2426".trim(),"MPCA RONDA,CADIZ,ALMERIA,MALAGA,ANTEQUERA Y JAEN                                                ".trim());
            htbancos.put("2427".trim(),"CAJA DE AHORROS DE LA INMACULADA DE ARAGON                                                      ".trim());
            htbancos.put("2428".trim(),"C.A.M.P. CIRCULO CATOLICO DE OBREROS DE BURGOS                                                  ".trim());
            htbancos.put("2429".trim(),"M.P. Y CAJA GENERAL AHORROS DE BADAJOZ                                                          ".trim());
            htbancos.put("2430".trim(),"BILBAO BIZKAIA KUTXA,AURREZKI KUTXA ETA BAHITETXEA                                              ".trim());
            htbancos.put("2431".trim(),"CAJA DE AHORROS Y M.P. DE GIPUZKOA Y SAN SEBASTIAN                                              ".trim());
            htbancos.put("2432".trim(),"CAJA DE AHORROS DE VITORIA Y ALAVA                                                              ".trim());
            htbancos.put("3001".trim(),"CAJA R. DE ALMENDRALEJO, S.C.C.                                                                 ".trim());
            htbancos.put("3005".trim(),"CAJA R. CENTRAL, S.C.C.                                                                         ".trim());
            htbancos.put("3007".trim(),"CAJA R. DE GIJON, C.C                                                                           ".trim());
            htbancos.put("3008".trim(),"CAJA R. DE NAVARRA, S.C.C.                                                                      ".trim());
            htbancos.put("3009".trim(),"CAJA R. DE EXTREMADURA, S.C.C.                                                                  ".trim());
            htbancos.put("3016".trim(),"CAJA R. DE SALAMANCA, S.C.C.                                                                    ".trim());
            htbancos.put("3017".trim(),"CAJA R. DE SORIA, S.C.C.                                                                        ".trim());
            htbancos.put("3018".trim(),"CAJA R.R.S.AGUSTIN DE FUENTE ALAMO M., S.C.C.                                                   ".trim());
            htbancos.put("3020".trim(),"CAJA R. DE UTRERA, S.C.A.C.                                                                     ".trim());
            htbancos.put("3022".trim(),"CAJA R. DE FUENTEPELAYO, S.C.C.                                                                 ".trim());
            htbancos.put("3023".trim(),"CAJA R. DE GRANADA, S.C.C.                                                                      ".trim());
            htbancos.put("3025".trim(),"CAIXA DE C. DELS ENGINYERS-C.C. INGENIEROS, S.C.C                                               ".trim());
            htbancos.put("3029".trim(),"CAJA DE CREDITO DE PETREL, CAJA RURAL, C.C.V.                                                   ".trim());
            htbancos.put("3035".trim(),"CAJA LABORAL POPULAR C.C.                                                                       ".trim());
            htbancos.put("3045".trim(),"CAIXA R. ALTEA, C.C.V.                                                                          ".trim());
            htbancos.put("3058".trim(),"CAJAMAR CAJA RURAL, S.C.C.                                                                      ".trim());
            htbancos.put("3059".trim(),"CAJA R. DE ASTURIAS, S.C.C.                                                                     ".trim());
            htbancos.put("3060".trim(),"CAJA R. DE BURGOS,S.C.C.                                                                        ".trim());
            htbancos.put("3063".trim(),"CAJA R. DE CORDOBA, S.C.C.                                                                      ".trim());
            htbancos.put("3067".trim(),"CAJA R. DE JAEN, BARCELONA Y MADRID, S.C.C.                                                     ".trim());
            htbancos.put("3070".trim(),"CAIXA R. GALEGA, S.C.C.L.G.                                                                     ".trim());
            htbancos.put("3076".trim(),"CAJASIETE, CAJA RURAL, S.C.C.                                                                   ".trim());
            htbancos.put("3078".trim(),"CAJA R. DE SEGOVIA, C.C.                                                                        ".trim());
            htbancos.put("3080".trim(),"CAJA R. DE TERUEL, S.C.C.                                                                       ".trim());
            htbancos.put("3081".trim(),"CAJA R. DE CASTILLA-LA MANCHA, S.C.C.                                                           ".trim());
            htbancos.put("3082".trim(),"CAJA R. DEL MEDITERRANEO, RURALCAJA, S.C.C.                                                     ".trim());
            htbancos.put("3084".trim(),"IPAR KUTXA RURAL, S.C.C.                                                                        ".trim());
            htbancos.put("3085".trim(),"CAJA R. DE ZAMORA, C.C.                                                                         ".trim());
            htbancos.put("3089".trim(),"CAJA R. BAENA NTRA. SRA. GUADALUPE S.C.C.A.                                                     ".trim());
            htbancos.put("3095".trim(),"CAJA R. S. ROQUE DE ALMENARA S.C.C.V.                                                           ".trim());
            htbancos.put("3096".trim(),"CAIXA R. DE L'ALCUDIA, S.C.V.C.                                                                 ".trim());
            htbancos.put("3098".trim(),"CAJA R. NTRA. SRA. DEL ROSARIO, S.C.A.C.                                                        ".trim());
            htbancos.put("3102".trim(),"CAIXA R. S. VICENT FERRER DE LA VALL D'UIXO,C.C.V.                                              ".trim());
            htbancos.put("3104".trim(),"CAJA R. DE CAÑETE TORRES NTRA.SRA.DEL CAMPO,S.C.A.                                              ".trim());
            htbancos.put("3105".trim(),"CAIXA R. DE CALLOSA D'EN SARRIA, C.C.V.                                                         ".trim());
            htbancos.put("3110".trim(),"CAJA R. CATOLICO AGRARIA, S.C.C.V.                                                              ".trim());
            htbancos.put("3111".trim(),"CAIXA R. LA VALL 'S. ISIDRO', S.C.C.V.                                                          ".trim());
            htbancos.put("3112".trim(),"CAJA R. S. JOSE DE BURRIANA, S.C.C.V.                                                           ".trim());
            htbancos.put("3113".trim(),"CAJA R. S. JOSE DE ALCORA S.C.C.V.                                                              ".trim());
            htbancos.put("3114".trim(),"CAJA R. CASTELLON S. ISIDRO, S.C.C.V.                                                           ".trim());
            htbancos.put("3115".trim(),"CAJA R. 'NUESTRA MADRE DEL SOL', S.C.A.C.                                                       ".trim());
            htbancos.put("3116".trim(),"CAJA R. COMARCAL DE MOTA DEL CUERVO, S.C.L.C.A.                                                 ".trim());
            htbancos.put("3117".trim(),"CAIXA R. D'ALGEMESI, S.C.V.C.                                                                   ".trim());
            htbancos.put("3118".trim(),"CAIXA RURAL TORRENT C.C.V.                                                                      ".trim());
            htbancos.put("3119".trim(),"CAJA R. S. JAIME ALQUERIAS NIÑO PERDIDO S.C.C.V.                                                ".trim());
            htbancos.put("3121".trim(),"CAJA R. DE CHESTE, S.C.C.                                                                       ".trim());
            htbancos.put("3123".trim(),"CAIXA R. DE TURIS, C.C.V.                                                                       ".trim());
            htbancos.put("3127".trim(),"CAJA R. DE CASAS IBAÑEZ, S.C.C.CASTILLA-LA MANCHA                                               ".trim());
            htbancos.put("3130".trim(),"CAJA R. S. JOSE DE ALMASSORA, S.C.C.V.                                                          ".trim());
            htbancos.put("3134".trim(),"CAJA R. NTRA. SRA. LA ESPERANZA DE ONDA, S.C.C.V.                                               ".trim());
            htbancos.put("3135".trim(),"CAJA R. S. JOSE DE NULES S.C.C.V.                                                               ".trim());
            htbancos.put("3137".trim(),"CAJA R. DE CASINOS S.C.C.V.                                                                     ".trim());
            htbancos.put("3138".trim(),"CAJA R. DE BETXI, S.C.C.V.                                                                      ".trim());
            htbancos.put("3140".trim(),"CAJA R. DE GUISSONA, S.C.C.                                                                     ".trim());
            htbancos.put("3144".trim(),"CAJA R. DE VILLAMALEA, S.C.C.A. CASTILLA-LA MANCHA                                              ".trim());
            htbancos.put("3146".trim(),"CAJA DE CREDITO COOPERATIVO, S.C.C.                                                             ".trim());
            htbancos.put("3150".trim(),"CAJA R. DE ALBAL, C.C.V.                                                                        ".trim());
            htbancos.put("3152".trim(),"CAJA R. DE VILLAR C.C.V.                                                                        ".trim());
            htbancos.put("3154".trim(),"CAJA R. DE LA CARLOTA, S.C.A.C.L. (EN LIQUIDACION)                                              ".trim());
            htbancos.put("3157".trim(),"CAJA R. LA JUNQUERA DE CHILCHES, S.C.C.V.                                                       ".trim());
            htbancos.put("3159".trim(),"CAIXA POPULAR-CAIXA RURAL, S.C.C.V.                                                             ".trim());
            htbancos.put("3160".trim(),"CAIXA R.S.JOSEP DE VILAVELLA, S.C.C.V.                                                          ".trim());
            htbancos.put("3161".trim(),"CAJA R. S. FORTUNATO, S.C.C.C.L.                                                                ".trim());
            htbancos.put("3162".trim(),"CAIXA R. BENICARLO, S.C.C.V.                                                                    ".trim());
            htbancos.put("3165".trim(),"CAJA R. S. ISIDRO DE VILAFAMES, S.C.C.V.                                                        ".trim());
            htbancos.put("3166".trim(),"CAIXA RURAL LES COVES DE VINROMA, S.C.C.V.                                                      ".trim());
            htbancos.put("3174".trim(),"CAIXA R. VINAROS, S.C.C.V.                                                                      ".trim());
            htbancos.put("3177".trim(),"CAJA R. DE CANARIAS, S.C.C.                                                                     ".trim());
            htbancos.put("3179".trim(),"CAJA R. DE ALGINET, S.C.C.V.                                                                    ".trim());
            htbancos.put("3183".trim(),"CAJA DE ARQUITECTOS S.C.C.                                                                      ".trim());
            htbancos.put("3184".trim(),"CAJA DE CREDITO DE ALCOY, C.C.V. (EN LIQUIDACION)                                               ".trim());
            htbancos.put("3186".trim(),"CAIXA R. ALBALAT DELS SORELLS, C.C.V.                                                           ".trim());
            htbancos.put("3187".trim(),"CAJA R. DEL SUR, S. COOP. DE CREDITO                                                            ".trim());
            htbancos.put("3188".trim(),"CREDIT VALENCIA, C.R.C.C.V.                                                                     ".trim());
            htbancos.put("3190".trim(),"C.R. DE ALBACETE, CIUDAD REAL Y CUENCA, S.C.C.                                                  ".trim());
            htbancos.put("3191".trim(),"NUEVA CAJA RURAL DE ARAGON SOC. COOP. DE CREDITO                                                ".trim());
            for (java.util.Enumeration<String> e = htbancos.keys() ; e.hasMoreElements();) {
              String banc = e.nextElement();
              String desc = htbancos.get(banc);
              Selector s = new Selector (Easp.connEA);
              s.execute("Select * from BANCO where bncodigo="+banc);
              if (s.next()) {
                System.out.println("Actualitzo "+banc+" ["+desc+"]");
                Update u = new Update (Easp.connEA,"BANCO");
                u.valor("bndesc", desc);
                u.execute("bncodigo="+banc);
              }
              else {
                System.out.println("Afegeixo "+banc+" ["+desc+"]");
                Insert in = new Insert (Easp.connEA,"BANCO");
                in.valor("bndesc", desc);
                in.valor("bncodigo", banc);
                in.execute();
              }
              s.close();
            }
          Easp.setVersionBD("bdeasp","10.0");
          Easp.connEA.commit();
          vvveractual.setValue("10.0");
    }


    if (versio < 10.1) {
      for (i=0;i<sentencias10_1.length;++i) {
        try {
          Easp.chivato("10.1 Exec : ["+sentencias10_1[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias10_1[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias10_1[i];
          Easp.chivato("10.1 *** Error : ["+sentencias10_1[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","10.1");
      Easp.connEA.commit();
      vvveractual.setValue("10.1");
    }

    if (versio < 10.3) {
      for (i=0;i<sentencias10_3.length;++i) {
        try {
          Easp.chivato("10.3 Exec : ["+sentencias10_3[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias10_3[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias10_3[i];
          Easp.chivato("10.3 *** Error : ["+sentencias10_3[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","10.3");
      Easp.connEA.commit();
      vvveractual.setValue("10.3");
    }

  if (versio < 10.5) {
      for (i=0;i<sentencias10_5.length;++i) {
        try {
          Easp.chivato("10.5 Exec : ["+sentencias10_5[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias10_5[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias10_5[i];
          Easp.chivato("10.5 *** Error : ["+sentencias10_5[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","10.5");
      Easp.connEA.commit();
      vvveractual.setValue("10.5");
    }
    if (versio < 10.6) {
      for (i=0;i<sentencias10_6.length;++i) {
        try {
          Easp.chivato("10.6 Exec : ["+sentencias10_6[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias10_6[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias10_6[i];
          Easp.chivato("10.6 *** Error : ["+sentencias10_6[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[] = {"quetabla","quecolumn","quevariables"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1006","easp.jar");
      Easp.setVersionBD("bdeasp","10.6");
      Easp.connEA.commit();
      vvveractual.setValue("10.6");
    }
    if (versio < 10.7) {
      for (i=0;i<sentencias10_7.length;++i) {
        try {
          Easp.chivato("10.7 Exec : ["+sentencias10_7[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias10_7[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias10_7[i];
          Easp.chivato("10.7 *** Error : ["+sentencias10_7[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","10.7");
      Easp.connEA.commit();
      vvveractual.setValue("10.7");
    }
    if (versio < 10.8) {
      for (i=0;i<sentencias10_8.length;++i) {
        try {
          Easp.chivato("10.8 Exec : ["+sentencias10_8[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias10_8[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias10_8[i];
          Easp.chivato("10.8 *** Error : ["+sentencias10_8[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","10.8");
      Easp.connEA.commit();
      vvveractual.setValue("10.8");
    }
    if (versio < 10.9) {
      for (i=0;i<sentencias10_9.length;++i) {
        try {
          Easp.chivato("10.9 Exec : ["+sentencias10_9[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias10_9[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias10_9[i];
          Easp.chivato("10.9 *** Error : ["+sentencias10_9[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[] = {"VALORES"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1009","easp.jar");
      Easp.setVersionBD("bdeasp","10.9");
      Easp.connEA.commit();
      vvveractual.setValue("10.9");
    }
    if (versio < 11.0) {
      for (i=0;i<sentencias11_0.length;++i) {
        try {
          Easp.chivato("11.0 Exec : ["+sentencias11_0[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias11_0[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias11_0[i];
          Easp.chivato("11.0 *** Error : ["+sentencias11_0[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","11.0");
      Easp.connEA.commit();
      vvveractual.setValue("11.0");
    }

    if (versio < 11.1) {
        grabarINDEMORA (2013,Fecha.getDate(2013,1,1),Fecha.getDate(2013,12,31),5);
        Easp.setVersionBD("bdeasp","11.1");
        Easp.connEA.commit();
        vvveractual.setValue("11.1");
    }
    if (versio < 11.2) {
          for (i=0;i<sentencias11_2.length;++i) {
            try {
              Easp.chivato("11.2 Exec : ["+sentencias11_2[i]+"]",1);
              Easp.connEA.executeUpdate(sentencias11_2[i]);
            }
            catch(Exception e) {
              sqlOperation=sentencias11_2[i];
              Easp.chivato("11.2 *** Error : ["+sentencias11_2[i]+"]  Error: ["+e+"]",1);
              errorMessage=e.getMessage();
            }
          }
          Easp.setVersionBD("bdeasp","11.2");
          Easp.connEA.commit();
          vvveractual.setValue("11.2");
    }
    if (versio < 11.3) {
      for (i=0;i<sentencias11_3.length;++i) {
        try {
          Easp.chivato("11.3 Exec : ["+sentencias11_3[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias11_3[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias11_3[i];
          Easp.chivato("11.3 *** Error : ["+sentencias11_3[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"COEFICCORREC"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1103","easp.jar");
      Easp.setVersionBD("bdeasp","11.3");
      Easp.connEA.commit();
      vvveractual.setValue("11.3");
    }
    if (versio < 11.4) {
          for (i=0;i<sentencias11_4.length;++i) {
            try {
              Easp.chivato("11.4 Exec : ["+sentencias11_4[i]+"]",1);
              Easp.connEA.executeUpdate(sentencias11_4[i]);
            }
            catch(Exception e) {
              sqlOperation=sentencias11_4[i];
              Easp.chivato("11.4 *** Error : ["+sentencias11_4[i]+"]  Error: ["+e+"]",1);
              errorMessage=e.getMessage();
            }
          }
          Easp.setVersionBD("bdeasp","11.4");
          Easp.connEA.commit();
          vvveractual.setValue("11.4");
    }

    if (versio < 11.5) {
          for (i=0;i<sentencias11_5.length;++i) {
            try {
              Easp.chivato("11.5 Exec : ["+sentencias11_5[i]+"]",1);
              Easp.connEA.executeUpdate(sentencias11_5[i]);
            }
            catch(Exception e) {
              sqlOperation=sentencias11_5[i];
              Easp.chivato("11.5 *** Error : ["+sentencias11_5[i]+"]  Error: ["+e+"]",1);
              errorMessage=e.getMessage();
            }
          }
          Easp.setVersionBD("bdeasp","11.5");
          Easp.connEA.commit();
          vvveractual.setValue("11.5");
    }

    if (versio < 11.6) {
          for (i=0;i<sentencias11_6.length;++i) {
            try {
              Easp.chivato("11.6 Exec : ["+sentencias11_6[i]+"]",1);
              Easp.connEA.executeUpdate(sentencias11_6[i]);
            }
            catch(Exception e) {
              sqlOperation=sentencias11_6[i];
              Easp.chivato("11.6 *** Error : ["+sentencias11_6[i]+"]  Error: ["+e+"]",1);
              errorMessage=e.getMessage();
            }
          }
          Easp.setVersionBD("bdeasp","11.6");
          Easp.connEA.commit();
          vvveractual.setValue("11.6");
    }

    if (versio < 11.7) {
        grabarINDEMORA (2014,Fecha.getDate(2014,1,1),Fecha.getDate(2014,12,31),5);
        Easp.setVersionBD("bdeasp","11.7");
        Easp.connEA.commit();
        vvveractual.setValue("11.7");
    }

     if (versio < 11.8) {
        grabaPerfilConta ();
        Easp.setVersionBD("bdeasp","11.8");
        Easp.connEA.commit();
        vvveractual.setValue("11.8");
    }
    if (versio < 11.9) {
      for (i=0;i<sentencias11_9.length;++i) {
        try {
          Easp.chivato("11.9 Exec : ["+sentencias11_9[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias11_9[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias11_9[i];
          Easp.chivato("11.9 *** Error : ["+sentencias11_9[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","11.9");
      Easp.connEA.commit();
      vvveractual.setValue("11.9");
    }
    if (versio < 12.0) {
      for (i=0;i<sentencias12_0.length;++i) {
        try {
          Easp.chivato("12.0 Exec : ["+sentencias12_0[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias12_0[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias12_0[i];
          Easp.chivato("12.0 *** Error : ["+sentencias12_0[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","12.0");
      Easp.connEA.commit();
      vvveractual.setValue("12.0");
    }
    if (versio < 12.1) {
      String tablas[]= {"JCOEPIGRAFE","JCOPREEST","JCORATIS"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1201","easp.jar");
      Easp.setVersionBD("bdeasp","12.1");
      Easp.connEA.commit();
      vvveractual.setValue("12.1");
    }
    if (versio < 12.2) {
        for (i=0;i<sentencias12_2.length;++i) {
            try {
              Easp.chivato("12.2 Exec : ["+sentencias12_2[i]+"]",1);
              Easp.connEA.executeUpdate(sentencias12_2[i]);
            }
            catch(Exception e) {
              sqlOperation=sentencias12_2[i];
              Easp.chivato("12.2 *** Error : ["+sentencias12_2[i]+"]  Error: ["+e+"]",1);
              errorMessage=e.getMessage();
            }
        }
        String tablas[]= {"COEFICCORREC"};
        Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1202","easp.jar");
        Easp.setVersionBD("bdeasp","12.2");
        Easp.connEA.commit();
        vvveractual.setValue("12.2");
    }
    if (versio < 12.3) {
        for (i=0;i<sentencias12_3.length;++i) {
            try {
              Easp.chivato("12.3 Exec : ["+sentencias12_3[i]+"]",1);
              Easp.connEA.executeUpdate(sentencias12_3[i]);
            }
            catch(Exception e) {
              sqlOperation=sentencias12_3[i];
              Easp.chivato("12.3 *** Error : ["+sentencias12_3[i]+"]  Error: ["+e+"]",1);
              errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","12.3");
        Easp.connEA.commit();
        vvveractual.setValue("12.3");

    }

    if (versio < 12.4) {
        for (i=0;i<sentencias12_4.length;++i) {
              try {
                Easp.chivato("12.4 Exec : ["+sentencias12_4[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias12_4[i]);
              }
              catch(Exception e) {
                sqlOperation=sentencias12_4[i];
                Easp.chivato("12.4 *** Error : ["+sentencias12_4[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
              }
        }
        Easp.setVersionBD("bdeasp","12.4");
        Easp.connEA.commit();
        vvveractual.setValue("12.4");
    }
   if (versio < 12.5) {
      for (i=0;i<sentencias12_5.length;++i) {
        try {
          Easp.chivato("12.5 Exec : ["+sentencias12_5[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias12_5[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias12_5[i];
          Easp.chivato("12.5 *** Error : ["+sentencias12_5[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[] = {"quetabla","quecolumn","quevariables"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1205","easp.jar");
      Easp.setVersionBD("bdeasp","12.5");
      Easp.connEA.commit();
      vvveractual.setValue("12.5");
    }
    if (versio < 12.6) {
        for (i=0;i<sentencias12_6.length;++i) {
              try {
                Easp.chivato("12.6 Exec : ["+sentencias12_6[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias12_6[i]);
              }
              catch(Exception e) {
                sqlOperation=sentencias12_6[i];
                Easp.chivato("12.6 *** Error : ["+sentencias12_6[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
              }
        }
        Easp.setVersionBD("bdeasp","12.6");
        Easp.connEA.commit();
        vvveractual.setValue("12.6");
    }

    if (versio < 12.7) {
        for (i=0;i<sentencias12_7.length;++i) {
              try {
                Easp.chivato("12.7 Exec : ["+sentencias12_7[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias12_7[i]);
              }
              catch(Exception e) {
                sqlOperation=sentencias12_7[i];
                Easp.chivato("12.7 *** Error : ["+sentencias12_7[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
              }
        }
        Easp.setVersionBD("bdeasp","12.7");
        Easp.connEA.commit();
        vvveractual.setValue("12.7");
    }

    if (versio < 12.8) {
      for (i=0;i<sentencias12_8.length;++i) {
        try {
          Easp.chivato("12.8 Exec : ["+sentencias12_8[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias12_8[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias12_8[i];
          Easp.chivato("12.8 *** Error : ["+sentencias12_8[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","12.8");
      Easp.connEA.commit();
      vvveractual.setValue("12.8");
    }

    if (versio < 12.9) {
      for (i=0;i<sentencias12_9.length;++i) {
        try {
          Easp.chivato("12.9 Exec : ["+sentencias12_9[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias12_9[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias12_9[i];
          Easp.chivato("12.9 *** Error : ["+sentencias12_9[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[] = {"AMORTIZACION"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1209","easp.jar");
      Easp.setVersionBD("bdeasp","12.9");
      Easp.connEA.commit();
      vvveractual.setValue("12.9");
    }

    if (versio < 13.0) {
      for (i=0;i<sentencias13_0.length;++i) {
        try {
          Easp.chivato("13.0 Exec : ["+sentencias13_0[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias13_0[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias13_0[i];
          Easp.chivato("13.0 *** Error : ["+sentencias13_0[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      Easp.setVersionBD("bdeasp","13.0");
      Easp.connEA.commit();
      vvveractual.setValue("13.0");
    }

    if (versio < 13.1) {
        for (i=0;i<sentencias13_1.length;++i) {
          try {
            Easp.chivato("13.1 Exec : ["+sentencias13_1[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias13_1[i]);
          }
          catch(Exception e) {
            sqlOperation=sentencias13_1[i];
            Easp.chivato("13.1 *** Error : ["+sentencias13_1[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
          }
        }
        String tablas[] = {"AMORTIZACION"};
        Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1301","easp.jar");
        Easp.setVersionBD("bdeasp","13.1");
        Easp.connEA.commit();
        vvveractual.setValue("13.1");
      }

    if (versio < 13.2) {
        for (i=0;i<sentencias13_2.length;++i) {
          try {
            Easp.chivato("13.2 Exec : ["+sentencias13_2[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias13_2[i]);
          }
          catch(Exception e) {
            sqlOperation=sentencias13_2[i];
            Easp.chivato("13.2 *** Error : ["+sentencias13_2[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
          }
        }
        String tablas[] = {"AMORTIZACION"};
        Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1301","easp.jar");
        Easp.setVersionBD("bdeasp","13.2");
        Easp.connEA.commit();
        vvveractual.setValue("13.2");
      }

    if (versio < 13.3) {
        for (i=0;i<sentencias13_3.length;++i) {
          try {
            Easp.chivato("13.3 Exec : ["+sentencias13_3[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias13_3[i]);
          }
          catch(Exception e) {
            sqlOperation=sentencias13_3[i];
            Easp.chivato("13.3 *** Error : ["+sentencias13_3[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
          }
        }
        Easp.setVersionBD("bdeasp","13.3");
        Easp.connEA.commit();
        vvveractual.setValue("13.3");
      }
      if (versio < 13.4) {
        for (i=0;i<sentencias13_4.length;++i) {
              try {
                Easp.chivato("13.4 Exec : ["+sentencias13_4[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias13_4[i]);
              }
              catch(Exception e) {
                sqlOperation=sentencias13_4[i];
                Easp.chivato("13.4 *** Error : ["+sentencias13_4[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
              }
        }
        Easp.setVersionBD("bdeasp","13.4");
        Easp.connEA.commit();
        vvveractual.setValue("13.4");
    }
      if (versio < 13.5) {
        for (i=0;i<sentencias13_5.length;++i) {
              try {
                Easp.chivato("13.5 Exec : ["+sentencias13_5[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias13_5[i]);
              }
              catch(Exception e) {
                sqlOperation=sentencias13_5[i];
                Easp.chivato("13.5 *** Error : ["+sentencias13_5[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
              }
        }
        Easp.setVersionBD("bdeasp","13.5");
        Easp.connEA.commit();
        vvveractual.setValue("13.5");
    }

    if (versio < 13.6) {
        for (i=0;i<sentencias13_6.length;++i) {
              try {
                Easp.chivato("13.6 Exec : ["+sentencias13_6[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias13_6[i]);
              }
              catch(Exception e) {
                sqlOperation=sentencias13_6[i];
                Easp.chivato("13.6 *** Error : ["+sentencias13_6[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
              }
        }
        Easp.setVersionBD("bdeasp","13.6");
        Easp.connEA.commit();
        vvveractual.setValue("13.6");
    }
    if (versio < 13.7) {
        for (i=0;i<sentencias13_7.length;++i) {
            try {
                Easp.chivato("13.7 Exec : ["+sentencias13_7[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias13_7[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias13_7[i];
                Easp.chivato("13.7 *** Error : ["+sentencias13_7[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","13.7");
        Easp.connEA.commit();
        vvveractual.setValue("13.7");
    }

    if (versio < 13.8) {
        for (i=0;i<sentencias13_8.length;++i) {
            try {
                Easp.chivato("13.8 Exec : ["+sentencias13_8[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias13_8[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias13_8[i];
                Easp.chivato("13.8 *** Error : ["+sentencias13_8[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","13.8");
        Easp.connEA.commit();
        vvveractual.setValue("13.8");
    }
    if (versio < 13.9) {
        for (i=0;i<sentencias13_9.length;++i) {
            try {
                Easp.chivato("13.9 Exec : ["+sentencias13_9[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias13_9[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias13_9[i];
                Easp.chivato("13.9 *** Error : ["+sentencias13_9[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","13.9");
        Easp.connEA.commit();
        vvveractual.setValue("13.9");
    }
    if (versio < 14.0) {
        for (i=0;i<sentencias14_0.length;++i) {
            try {
                Easp.chivato("14.0 Exec : ["+sentencias14_0[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias14_0[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias14_0[i];
                Easp.chivato("14.0 *** Error : ["+sentencias14_0[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","14.0");
        Easp.connEA.commit();
        vvveractual.setValue("14.0");
    }
    if (versio < 14.1) {
        for (i=0;i<sentencias14_1.length;++i) {
            try {
                Easp.chivato("14.1 Exec : ["+sentencias14_1[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias14_1[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias14_1[i];
                Easp.chivato("14.1 *** Error : ["+sentencias14_1[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","14.1");
        Easp.connEA.commit();
        vvveractual.setValue("14.1");
    }

    if (versio < 14.2) {
        for (i=0;i<sentencias14_2.length;++i) {
          try {
            Easp.chivato("14.2 Exec : ["+sentencias14_2[i]+"]",1);
            Easp.connEA.executeUpdate(sentencias14_2[i]);
          }
          catch(Exception e) {
            sqlOperation=sentencias14_2[i];
            Easp.chivato("14.2 *** Error : ["+sentencias14_2[i]+"]  Error: ["+e+"]",1);
            errorMessage=e.getMessage();
          }
        }
        String tablas[] = {"ESTILOS", "INFPLANTILLA","INFPLANTLINEA","INFPLANTCOL"};
        Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1402","easp.jar");
        Easp.setVersionBD("bdeasp","14.2");
        Easp.connEA.commit();
        vvveractual.setValue("14.2");
      }

    if (versio < 14.3) {
        for (i=0;i<sentencias14_3.length;++i) {
            try {
                Easp.chivato("14.3 Exec : ["+sentencias14_3[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias14_3[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias14_3[i];
                Easp.chivato("14.3 *** Error : ["+sentencias14_3[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","14.3");
        Easp.connEA.commit();
        vvveractual.setValue("14.3");
    }
    if (versio < 14.4) {
        for (i=0;i<sentencias14_4.length;++i) {
            try {
                Easp.chivato("14.4 Exec : ["+sentencias14_4[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias14_4[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias14_4[i];
                Easp.chivato("14.4 *** Error : ["+sentencias14_4[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","14.4");
        Easp.connEA.commit();
        vvveractual.setValue("14.4");
    }
    if (versio < 14.5) {
        for (i=0;i<sentencias14_5.length;++i) {
            try {
                Easp.chivato("14.5 Exec : ["+sentencias14_5[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias14_5[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias14_5[i];
                Easp.chivato("14.5 *** Error : ["+sentencias14_5[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","14.5");
        Easp.connEA.commit();
        vvveractual.setValue("14.5");
    }

   if (versio < 14.6) {
      for (i=0;i<sentencias14_6.length;++i) {
        try {
          Easp.chivato("14.6 Exec : ["+sentencias14_6[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias14_6[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias14_6[i];
          Easp.chivato("14.6 *** Error : ["+sentencias14_6[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[] = {"PLANTILLAS","quefrase","quetabla","quecolumn","quevariables"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1406","easp.jar");
      Easp.setVersionBD("bdeasp","14.6");
      Easp.connEA.commit();
      vvveractual.setValue("14.6");
    }
   if (versio < 14.7) {
        for (i=0;i<sentencias14_7.length;++i) {
            try {
                Easp.chivato("14.7 Exec : ["+sentencias14_7[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias14_7[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias14_7[i];
                Easp.chivato("14.7 *** Error : ["+sentencias14_7[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","14.7");
        Easp.connEA.commit();
        vvveractual.setValue("14.7");
    }
    if (versio < 14.8) {
      for (i=0;i<sentencias14_8.length;++i) {
        try {
          Easp.chivato("14.8 Exec : ["+sentencias14_8[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias14_8[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias14_8[i];
          Easp.chivato("14.8 *** Error : ["+sentencias14_8[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[]= {"CODIGOREGISTRO"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1408","easp.jar");
      Easp.setVersionBD("bdeasp","14.8");
      Easp.connEA.commit();
      vvveractual.setValue("14.8");
    }
    if (versio < 14.9) {
        for (i=0;i<sentencias14_9.length;++i) {
            try {
                Easp.chivato("14.9 Exec : ["+sentencias14_9[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias14_9[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias14_9[i];
                Easp.chivato("14.9 *** Error : ["+sentencias14_9[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","14.9");
        Easp.connEA.commit();
        vvveractual.setValue("14.9");
    }
    if (versio < 15.0) {
        for (i=0;i<sentencias15_0.length;++i) {
            try {
                Easp.chivato("15.0 Exec : ["+sentencias15_0[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias15_0[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias15_0[i];
                Easp.chivato("15.0 *** Error : ["+sentencias15_0[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","15.0");
        Easp.connEA.commit();
        vvveractual.setValue("15.0");
    }
    if (versio < 15.1) {
        for (i=0;i<sentencias15_1.length;++i) {
            try {
                Easp.chivato("15.1 Exec : ["+sentencias15_1[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias15_1[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias15_1[i];
                Easp.chivato("15.1 *** Error : ["+sentencias15_1[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","15.1");
        Easp.connEA.commit();
        vvveractual.setValue("15.1");
    }
    if (versio < 15.2) {
        for (i=0;i<sentencias15_2.length;++i) {
            try {
                Easp.chivato("15.2 Exec : ["+sentencias15_2[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias15_2[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias15_2[i];
                Easp.chivato("15.2 *** Error : ["+sentencias15_2[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","15.2");
        Easp.connEA.commit();
        vvveractual.setValue("15.2");
    }
    if (versio < 15.3) {
        for (i=0;i<sentencias15_3.length;++i) {
            try {
                Easp.chivato("15.3 Exec : ["+sentencias15_3[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias15_3[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias15_3[i];
                Easp.chivato("15.3 *** Error : ["+sentencias15_3[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","15.3");
        Easp.connEA.commit();
        vvveractual.setValue("15.3");
    } 
    if (versio < 15.4) {
        for (i=0;i<sentencias15_4.length;++i) {
            try {
                Easp.chivato("15.4 Exec : ["+sentencias15_4[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias15_4[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias15_4[i];
                Easp.chivato("15.4 *** Error : ["+sentencias15_4[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","15.4");
        Easp.connEA.commit();
        vvveractual.setValue("15.4");
    }
    if (versio < 15.5) {
        for (i=0;i<sentencias15_5.length;++i) {
            try {
                Easp.chivato("15.5 Exec : ["+sentencias15_5[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias15_5[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias15_5[i];
                Easp.chivato("15.5 *** Error : ["+sentencias15_5[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","15.5");
        Easp.connEA.commit();
        vvveractual.setValue("15.5");
    }
    if (versio < 15.6) {
        for (i=0;i<sentencias15_6.length;++i) {
        	try {
        		Easp.chivato("15.6 Exec : ["+sentencias15_6[i]+"]",1);
        		Easp.connEA.executeUpdate(sentencias15_6[i]);
        	}
        	catch(Exception e) {
        		sqlOperation=sentencias15_6[i];
        		Easp.chivato("15.6 *** Error : ["+sentencias15_6[i]+"]  Error: ["+e+"]",1);
        		errorMessage=e.getMessage();
        	}
        }
        Easp.setVersionBD("bdeasp","15.6");
        Easp.connEA.commit();
        vvveractual.setValue("15.6");
    }
    if (versio < 15.7) {
        for (i=0;i<sentencias15_7.length;++i) {
        	try {
        		Easp.chivato("15.7 Exec : ["+sentencias15_7[i]+"]",1);
        		Easp.connEA.executeUpdate(sentencias15_7[i]);        	
        		Selector s = new Selector (Easp.connEA);
        		s.execute ("Select * from usuario");
        		while (s.next()) {
        			String USPASSWD = s.getString("USPASSWD");
        			String USMD5 = s.getString("USMD5");
        			String USLOGIN = s.getString("USLOGIN");
        			int USCODCON = s.getint("USCODCON");
        			if (USMD5 == null)  {
        				USMD5 = Login.encryptMD5 (USPASSWD);
        				Update u = new Update (Easp.connEA,"USUARIO");
        				u.valor("USMD5",USMD5);
        				u.execute("USCODCON="+USCODCON+" and USLOGIN='"+USLOGIN+"'");
        			}
        		}
        		s.close();
        	}
        	catch(Exception e) {
        		sqlOperation=sentencias15_7[i];
        		Easp.chivato("15.7 *** Error : ["+sentencias15_7[i]+"]  Error: ["+e+"]",1);
        		errorMessage=e.getMessage();
        	}
        }
        Easp.setVersionBD("bdeasp","15.7");
        Easp.connEA.commit();
        vvveractual.setValue("15.7");
    }
    if (versio < 15.8) {
        for (i=0;i<sentencias15_8.length;++i) {
                try {
                        Easp.chivato("15.8 Exec : ["+sentencias15_8[i]+"]",1);
                        Easp.connEA.executeUpdate(sentencias15_8[i]);
                }
                catch(Exception e) {
                        sqlOperation=sentencias15_8[i];
                        Easp.chivato("15.8 *** Error : ["+sentencias15_8[i]+"]  Error: ["+e+"]",1);
                        errorMessage=e.getMessage();
                }
        }
        Easp.setVersionBD("bdeasp","15.8");
        Easp.connEA.commit();
        vvveractual.setValue("15.8");
    }
    if (versio < 15.9) {
        for (i=0;i<sentencias15_9.length;++i) {
                try {
                        Easp.chivato("15.9 Exec : ["+sentencias15_9[i]+"]",1);
                        Easp.connEA.executeUpdate(sentencias15_9[i]);
                }
                catch(Exception e) {
                        sqlOperation=sentencias15_9[i];
                        Easp.chivato("15.9 *** Error : ["+sentencias15_9[i]+"]  Error: ["+e+"]",1);
                        errorMessage=e.getMessage();
                }
        }
        Easp.setVersionBD("bdeasp","15.9");
        Easp.connEA.commit();
        vvveractual.setValue("15.9");
    }
    if (versio < 16.0) {
        for (i=0;i<sentencias16_0.length;++i) {
                try {
                        Easp.chivato("16.0 Exec : ["+sentencias16_0[i]+"]",1);
                        Easp.connEA.executeUpdate(sentencias16_0[i]);
                }
                catch(Exception e) {
                        sqlOperation=sentencias16_0[i];
                        Easp.chivato("16.0 *** Error : ["+sentencias16_0[i]+"]  Error: ["+e+"]",1);
                        errorMessage=e.getMessage();
                }
        }
        Easp.setVersionBD("bdeasp","16.0");
        Easp.connEA.commit();
        vvveractual.setValue("16.0");
    }
   if (versio < 16.1) {
        for (i=0;i<sentencias16_1.length;++i) {
                try {
                        Easp.chivato("16.1 Exec : ["+sentencias16_1[i]+"]",1);
                        Easp.connEA.executeUpdate(sentencias16_1[i]);
                }
                catch(Exception e) {
                        sqlOperation=sentencias16_1[i];
                        Easp.chivato("16.1 *** Error : ["+sentencias16_1[i]+"]  Error: ["+e+"]",1);
                        errorMessage=e.getMessage();
                }
        }
        Easp.setVersionBD("bdeasp","16.1");
        Easp.connEA.commit();
        vvveractual.setValue("16.1");
    }

    if (versio < 16.2) {
    	   try {
        	Selector s = new Selector (Easp.connEA);
        	s.execute ("Select * from usuario");
        	boolean esOk = true;
        	while (s.next() && esOk) {
        		String USPASSWD = s.getString("USPASSWD");
        		String USMD5 = s.getString("USMD5");
        		String USLOGIN = s.getString("USLOGIN");
        		int USCODCON = s.getint("USCODCON");
        	     if ((USPASSWD!=null && !"".equals(USPASSWD.trim())) || (USMD5!=null && !"".equals(USMD5)))  {
      	     	mae.easp.general.Seguridad seguridad = new mae.easp.general.Seguridad(Easp.connEA,USCODCON);
      	     	seguridad.remAutoCommit();
      	     	esOk = seguridad.setHistorico(USCODCON, USLOGIN, USPASSWD, USMD5, "N");
        	     }        			
        	}
        	s.close();
        }
        catch(Exception e) {
        		errorMessage=e.getMessage();
        }
    	   Easp.setVersionBD("bdeasp","16.2");
        Easp.connEA.commit();
        vvveractual.setValue("16.2");
    }

       if (versio < 16.3) {
        for (i=0;i<sentencias16_3.length;++i) {
                try {
                        Easp.chivato("16.3 Exec : ["+sentencias16_3[i]+"]",1);
                        Easp.connEA.executeUpdate(sentencias16_3[i]);
                }
                catch(Exception e) {
                        sqlOperation=sentencias16_3[i];
                        Easp.chivato("16.3 *** Error : ["+sentencias16_3[i]+"]  Error: ["+e+"]",1);
                        errorMessage=e.getMessage();
                }
        }
        Easp.setVersionBD("bdeasp","16.3");
        Easp.connEA.commit();
        vvveractual.setValue("16.3");
    }

	if (versio < 16.4) {
        for (i=0;i<sentencias16_4.length;++i) {
                try {
                        Easp.chivato("16.4 Exec : ["+sentencias16_4[i]+"]",1);
                        Easp.connEA.executeUpdate(sentencias16_4[i]);
                }
                catch(Exception e) {
                        sqlOperation=sentencias16_4[i];
                        Easp.chivato("16.4 *** Error : ["+sentencias16_4[i]+"]  Error: ["+e+"]",1);
                        errorMessage=e.getMessage();
                }
        }
        Easp.setVersionBD("bdeasp","16.4");
        Easp.connEA.commit();
        vvveractual.setValue("16.4");
    }

    if (versio < 16.5) {
    	for (i=0;i<sentencias16_5.length;++i) {
    		try {
    			Easp.chivato("16.5 Exec : ["+sentencias16_5[i]+"]",1);
    			Easp.connEA.executeUpdate(sentencias16_5[i]);
    		}
    		catch(Exception e) {
    			sqlOperation=sentencias16_5[i];
    			Easp.chivato("16.5 *** Error : ["+sentencias16_5[i]+"]  Error: ["+e+"]",1);
    			errorMessage=e.getMessage();
    		}
    	}
    	Easp.setVersionBD("bdeasp","16.5");
    	Easp.connEA.commit();
    	vvveractual.setValue("16.5");
    }
    if (versio < 16.6) {
        for (i=0;i<sentencias16_6.length;++i) {
                try {
                        Easp.chivato("16.6 Exec : ["+sentencias16_6[i]+"]",1);
                        Easp.connEA.executeUpdate(sentencias16_6[i]);
                }
                catch(Exception e) {
                        sqlOperation=sentencias16_6[i];
                        Easp.chivato("16.6 *** Error : ["+sentencias16_6[i]+"]  Error: ["+e+"]",1);
                        errorMessage=e.getMessage();
                }
        }
        Easp.setVersionBD("bdeasp","16.6");
        Easp.connEA.commit();
        vvveractual.setValue("16.6");
    }
    if (versio < 16.7) {
    	for (i=0;i<sentencias16_7.length;++i) {
    		try {
    			Easp.chivato("16.7 Exec : ["+sentencias16_7[i]+"]",1);
    			Easp.connEA.executeUpdate(sentencias16_7[i]);
    		}
    		catch(Exception e) {
    			sqlOperation=sentencias16_7[i];
    			Easp.chivato("16.7 *** Error : ["+sentencias16_7[i]+"]  Error: ["+e+"]",1);
    			errorMessage=e.getMessage();
    		}
    	}
    	Easp.setVersionBD("bdeasp","16.7");
    	Easp.connEA.commit();
    	vvveractual.setValue("16.7");
    }
    if (versio < 16.8) {
        for (i=0;i<sentencias16_8.length;++i) {
                try {
                        Easp.chivato("16.8 Exec : ["+sentencias16_8[i]+"]",1);
                        Easp.connEA.executeUpdate(sentencias16_8[i]);
                }
                catch(Exception e) {
                        sqlOperation=sentencias16_8[i];
                        Easp.chivato("16.8 *** Error : ["+sentencias16_8[i]+"]  Error: ["+e+"]",1);
                        errorMessage=e.getMessage();
                }
        }
        Easp.setVersionBD("bdeasp","16.8");
        Easp.connEA.commit();
        vvveractual.setValue("16.8");
    }

    if (versio < 16.9) {
        for (i=0;i<sentencias16_9.length;++i) {
            try {
                Easp.chivato("16.9 Exec : ["+sentencias16_9[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias16_9[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias16_9[i];
                Easp.chivato("16.9 *** Error : ["+sentencias16_9[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","16.9");
        Easp.connEA.commit();
        vvveractual.setValue("16.9");
    }

    if (versio < 17.0) {
        for (i=0;i<sentencias17_0.length;++i) {
            try {
                Easp.chivato("17.0 Exec : ["+sentencias17_0[i]+"]",1);
                Easp.connEA.executeUpdate(sentencias17_0[i]);
            }
            catch(Exception e) {
                sqlOperation=sentencias17_0[i];
                Easp.chivato("17.0 *** Error : ["+sentencias17_0[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","17.0");
        Easp.connEA.commit();
        vvveractual.setValue("17.0");
    }

  
    if (versio < 17.1) {
        validaBanco ();
        Easp.setVersionBD("bdeasp","17.1");
        Easp.connEA.commit();
        vvveractual.setValue("17.1");
    }

    if (versio < 17.2) { //TAULES DADES FISCALS SOCIETATS
        for (i=0;i<Sentencias.sentencias17_2.length;++i) {
            try {
                Easp.chivato("17.2 Exec : ["+Sentencias.sentencias17_2[i]+"]",1);
                Easp.connEA.executeUpdate(Sentencias.sentencias17_2[i]);
            }
            catch(Exception e) {
                sqlOperation=Sentencias.sentencias17_2[i];
                Easp.chivato("17.2 *** Error : ["+Sentencias.sentencias17_2[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","17.2");
        Easp.connEA.commit();
        vvveractual.setValue("17.2");
    }
    if (versio < 17.3) {
        for (i=0;i<Sentencias.sentencias17_3.length;++i) {
            try {
                Easp.chivato("17.3 Exec : ["+Sentencias.sentencias17_3[i]+"]",1);
                Easp.connEA.executeUpdate(Sentencias.sentencias17_3[i]);
            }
            catch(Exception e) {
                sqlOperation=Sentencias.sentencias17_3[i];
                Easp.chivato("17.3 *** Error : ["+Sentencias.sentencias17_3[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","17.3");
        Easp.connEA.commit();
        vvveractual.setValue("17.3");
    }
    
    if (versio < 17.4) {
      for (i=0;i<sentencias17_4.length;++i) {
        try {
          Easp.chivato("17.4 Exec : ["+sentencias17_4[i]+"]",1);
          Easp.connEA.executeUpdate(sentencias17_4[i]);
        }
        catch(Exception e) {
          sqlOperation=sentencias17_4[i];
          Easp.chivato("17.4 *** Error : ["+sentencias17_4[i]+"]  Error: ["+e+"]",1);
          errorMessage=e.getMessage();
        }
      }
      String tablas[] = {"AMORTIZACION"};
      Easp.leerSecuencial(Easp.connEA,tablas,"mae/easp/ver1704","easp.jar");
      Easp.setVersionBD("bdeasp","17.4");
      Easp.connEA.commit();
      vvveractual.setValue("17.4");
    }

	if (versio < 17.5) {
        for (i=0;i<Sentencias.sentencias17_5.length;++i) {
            try {
                Easp.chivato("17.2 Exec : ["+Sentencias.sentencias17_5[i]+"]",1);
                Easp.connEA.executeUpdate(Sentencias.sentencias17_5[i]);
            }
            catch(Exception e) {
                sqlOperation=Sentencias.sentencias17_5[i];
                Easp.chivato("17.5 *** Error : ["+Sentencias.sentencias17_5[i]+"]  Error: ["+e+"]",1);
                errorMessage=e.getMessage();
            }
        }
        Easp.setVersionBD("bdeasp","17.5");
        Easp.connEA.commit();
        vvveractual.setValue("17.5");
    }
    
  }
  catch(Exception e) {
    System.out.println("Error en conversión: ["+e+"]");
    return false;
  }
  return true;
}

public void grabaPerfilConta () {
  Selector scdp = new Selector (Easp.connEA);
  scdp.execute ("Select distinct(cdpnifcif) as nif from CDP where cdpckconta = 'S'");
  while (scdp.next()) {
    String nif = scdp.getString ("nif");
    Selector semod = new Selector (Easp.connEA);
    semod.execute ("Select * from EMPMODELOS where (emodejercicio=2014 or emodejercicio=2013) and emodnif='"+nif+"'");
    boolean tieneModelos2014 = false;
    boolean tieneModelos2013 = false;
    while (semod.next()) {
      int emodejercicio = semod.getint("emodejercicio");
      if (emodejercicio == 2014) tieneModelos2014 = true;
      else if (emodejercicio == 2013) tieneModelos2013 = true;
    }
    semod.close();
    if (tieneModelos2013 && !tieneModelos2014) {
      Selector sper = new Selector (Easp.connEA);
      sper.execute ("Select * from PERFILTRIBUT where pftejercicio=2014 and pftnif='"+nif+"'");
      boolean tienePerfil2014 = sper.next();
      sper.close();
      if (tienePerfil2014) {
        try {
          Easp.connEA.executeUpdate("INSERT INTO EMPMODELOS (emodejercicio,emodnif,emodmodelo,emodtipoper,emodactivo,emodfechaini,emodfechafin) SELECT 2014 as emodejercicio,emodnif,emodmodelo,emodtipoper,emodactivo,emodfechaini,emodfechafin from EMPMODELOS where emodejercicio=2013 and emodnif='"+nif+"'");
          System.out.println ("Grabo models perfil 2013 a 2014 de ["+nif+"]");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
  scdp.close();
  Easp.connEA.commit();
}

// 15-07-2020
public void validaBanco(){
	String codiCdp="";	
	boolean bExiste=true;
	
	Selector sb = new Selector (Easp.connEA);
	sb.execute ("Select * from BANCOCLI where bcccodigo is not null");
	while (sb.next()){
		   codiCdp=sb.getString("bcccodigo");		   
		   int banco=sb.getint("bccbanco");
             int ofici=sb.getint("bccsucursal");
             int dc   =sb.getint("bccdigitos");
             String cc=sb.getString("bccnumero");            
		   //
		   Selector s = new Selector (Easp.connEA);
		   s.execute("Select * from CDP where cdpcodi='"+codiCdp+"'");
		   if (s.next()) bExiste=true;	
		   else bExiste=false;
		   s.close();
		   //
		   if (!bExiste){
		   	   System.out.println("jEA 17.1 ("+codiCdp+") "+banco+"-"+ofici+"-"+dc+"-"+cc);
			   borraBancocli(codiCdp);			  			   
		   }
	}
	sb.close();
}
public void borraBancocli(String codigo){ 
    try {
          Easp.connEA.executeUpdate("delete from BANCOCLI where bcccodigo = '"+codigo+"'");
          Easp.connEA.executeUpdate("delete from ASIGNACIONES where abacodigo = '"+codigo+"'");         
    }
    catch(Exception e) {
    	    Easp.chivato("  Error: ["+e+"]",1);
        errorMessage=e.getMessage();  
    }         
}
//

public void grabarINDEMORA (int ejer, java.util.Date fechaini, java.util.Date fechafin, double tipo) {
      Insert iindemora = new Insert(Easp.connEA,"INDEMORA");
      iindemora.valor("indejercicio",ejer);
      iindemora.valor("inddesdefecha",fechaini);
      iindemora.valor("indhastafecha",fechafin);
      iindemora.valor("indtipo_vigente",tipo);
      iindemora.execute();
}
public void actualizaTransaccion (String cod, String desc,String emirep,String regimen,String tipo,String voloper,String operespec) {
  Selector s = new Selector (Easp.connEA);
  s.execute ("Select * from TRANSACCIONES where tratipo='"+cod+"'");
  boolean existe = s.next();
  s.close();
  if (existe) {
    Update u = new Update(Easp.connEA,"TRANSACCIONES");
    u.valor("tratipoiva",tipo);
    u.valor("travoloper",voloper);
    u.valor("traoperespec",operespec);
    u.execute("tratipo='"+cod+"'");
  }
  else {
    Insert i = new Insert(Easp.connEA,"TRANSACCIONES");
    i.valor("tratipo",cod);
    i.valor("tradesc",desc);
    i.valor("traemre",emirep);
    i.valor("traregimen",regimen);
    i.valor("tratipoiva",tipo);
    i.valor("travoloper",voloper);
    i.valor("traoperespec",operespec);
    i.execute();
  }

}
boolean grabaBDSCargadas (DBConnection db) {
  boolean result = true;
  Select scdp      = new Select(db);
  Table tcdp       = new Table(scdp,"cdp");
  Field cdpcodi    = new Field(scdp,tcdp,"cdpcodi");
  Field cdpbdcomuconta  = new Field(scdp,tcdp,"cdpbdcomuconta");
  Select sbds        = new Select(db);
  Table tbdscargadas = new Table(sbds,"bdscargadas");
  Field bdaplic      = new Field(sbds,tbdscargadas,"bdaplic");
  Field bddominio    = new Field(sbds,tbdscargadas,"bddominio");
  Field bdejer       = new Field(sbds,tbdscargadas,"bdejer");
  Field bddesc       = new Field(sbds,tbdscargadas,"bddesc");
  Field bdtipo       = new Field(sbds,tbdscargadas,"bdtipo");
  Field bdbdnom      = new Field(sbds,tbdscargadas,"bdbdnom");
  Field bdbduser     = new Field(sbds,tbdscargadas,"bdbduser");
  Field bdbdpass     = new Field(sbds,tbdscargadas,"bdbdpass");
  Field bdbdserv     = new Field(sbds,tbdscargadas,"bdbdserv");
  scdp.execute();
  while (!scdp.isEof() && result) {
    sbds.addNew();
    bdaplic.setValue("contaasp");
    bddominio.setValue(cdpcodi.getString());
    bdejer.setValue(2002);
    bddesc.setValue("bd común ejercicio 2002");
    bdbdnom.setValue("ctasp2002");
    bdtipo.setValue(Aplication.getDB().getType());
    bdbduser.setValue(Aplication.getDB().getUser());
    bdbdpass.setValue(Aplication.getDB().getPassword());
    bdbdserv.setValue(Aplication.getDB().getServer());
    result=sbds.insert();
    cdpbdcomuconta.setValue("S");
    result=scdp.update();
    scdp.next();
    }
  return result;
  }
        // Metodos
        // Controles
        public CtrlVvveractual vvveractual;
        public CtrlVvvernueva vvvernueva;
        // Acciones
        public LinkCalconver calconver;
        // Fieldsets
        class Location extends LocationGridBag
            {
            public Location( )
                {
                super();
                setWidth(REMAINDER);
                setHeight(REMAINDER);
                setWeightx(1.0);
                setWeighty(1.0);
                setFill(BOTH);
                setAnchor(CENTER);
                }
            }
            
        public class CtrlVvveractual extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvveractual(Form form)
                {
                super(form);
                setName("vvveractual");
                setMessageHelp("Versión actual a convertir");
                setTitle("Versión Actual");
                setType(STRING);
                setMaskInput("U");
                setLength(10);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvvernueva extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvvernueva(Form form)
                {
                super(form);
                setName("vvvernueva");
                setMessageHelp("Nueva versión descargada");
                setTitle("Nueva versión");
                setType(STRING);
                setMaskInput("U");
                setLength(10);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkCalconver extends Action
            {
            public LinkCalconver(Form form)
                {
                super(form);
                setName("calconver");
                setTitle("&1.Convertir");
                // SET: ACCION
                setOptions(SEARCH | SHOW | UPDATE | INSERT);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                
                // PRIMER ES COMPROBA QUE LA VERSIO ACTUAL ES CONVERTIBLE
                if (!Easp.versionValid(vvveractual.getString(),versionMinima))
                  Maefc.message("Sólo es posible convertir desde la versión "+versionMinima+"\n\n.Póngase en contacto con GEYCE,S.A.","Aviso",Maefc.WARNING_MESSAGE);
                else {
                  // AQUI ES COMPROVA QUE CALGUI LA CONVERSIO O SI JA S'HA FET
                  if (!vvveractual.getString().equals(vvvernueva.getString())) {
                
                  if (conversion())
                      Easp.connEA.commit();
                  else
                      Easp.connEA.rollback();
                    }
                  // AQUI ES COMPROVA QUE SI HA CALGUT FER-LA LES OPERACIONS D'ACTUALITZACIO NO HAN
                  // DONAT CAP ERROR
                  if (vvveractual.getString().equals(vvvernueva.getString()))
                    Maefc.message("Versión actualizada","información");
                  else
                //    Maefc.message("El proceso de conversión ha fallado.\n"+errorMessage+"\n\nPóngase en contacto con GEYCE,S.A.","Error",Maefc.ERROR_MESSAGE);
                  mae.admon.general.Admon.doMessage(Aplication.getAplication(),
                                                    "CONVERSION",
                                                    vvvernueva.getString(),
                                                    "insprconver",
                                                    null,
                                                    sqlOperation,
                                                    errorMessage,
                                                    true);
                  }
                }
            }
            
        public FormVproceso(ProgInsprconver insprconver)
            {
            super(insprconver);
            setName("vproceso");
            setTitle("Proceso de actualización de versiones de EA");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addControl(vvveractual=new CtrlVvveractual(this));
            addControl(vvvernueva=new CtrlVvvernueva(this));
            addAction(calconver=new LinkCalconver(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            vvveractual.setValue(Easp.getVersionBD("bdeasp"));
            vvvernueva.setValue(Easp.versionBDEA);
            super.onInit();
            }
        }
        
    public ProgInsprconver()
        {
        this.insprconver=this;
        setName("insprconver");
        setTitle("Actualizar BD a versión vigente de EA");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vproceso=new FormVproceso(this));
        }
    public ProgInsprconver(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    }
    
