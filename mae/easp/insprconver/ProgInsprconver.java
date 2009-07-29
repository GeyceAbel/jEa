// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090729
// Hora:             13:57:16
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.insprconver;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
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
  // Inicio declaraciones globales
  // Indica la versión mínima desde la que este programa puede convertir
  public String versionMinima="1.1";
  public String errorMessage="";
  public String sqlOperation="";
  
  public String tipoDB=Aplication.getAplication().getDataBase().getDB().getType();
  
  public String getMemo(int tamany) {
    if (tipoDB.toUpperCase().equals("ACCESS"))
      return " MEMO,";
    else
      return " VARCHAR("+tamany+"),";
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
  
  // Fin declaraciones globales
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
    // Inicio declaraciones globales
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
    
    
    
    
      }
      catch(Exception e) {
        System.out.println("Error en conversión: ["+e+"]");
        return false;
        }
      return true;
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
    
    // Fin declaraciones globales
    // Controles
    public CtrlVvveractual vvveractual;
    public CtrlVvvernueva vvvernueva;
    // Acciones
    public LinkCalconver calconver;
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
        }
      }
      
    public class CtrlVvvernueva extends ControlEdit
      {
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
        }
      }
      
    public class LinkCalconver extends Action
      {
      public LinkCalconver(Form form)
        {
        super(form);
        setName("calconver");
        setTitle("&1.Convertir");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
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
      addControl(vvveractual=new CtrlVvveractual(this));
      addControl(vvvernueva=new CtrlVvvernueva(this));
      addAction(calconver=new LinkCalconver(this));
      }
    public void onInit()
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
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vproceso=new FormVproceso(this));
    }
  public ProgInsprconver(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  }
  
