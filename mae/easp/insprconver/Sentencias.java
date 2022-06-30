package mae.easp.insprconver;

import mae.easp.general.Easp;

public class Sentencias {
	public static String sentencias19_3[] = {
			"CREATE TABLE DFSCORRECCION("+
			"	    dfcoejer       INTEGER NOT NULL,"+
			"	    dfconif        VARCHAR(15) NOT NULL,"+
			"	    dfcocodigo     VARCHAR(7) NOT NULL,"+
			"	    dfcocoddesc    INTEGER,"+
			"	    dfcoimporteaum FLOAT,"+
			"	    dfcocasactaun  VARCHAR(6),"+
			"	    dfcocasantaum  VARCHAR(6),"+
			"	    dfcoimportedis FLOAT,"+
			"	    dfcocasactdism VARCHAR(6),"+
			"	    dfcocasantdism VARCHAR(6),"+
			"	    PRIMARY KEY(dfcoejer, dfconif, dfcocodigo));"};
	
	public static String sentencias19_2[] = {
			"CREATE TABLE DFSINTERESES("+
			"    dfiejer INTEGER NOT NULL,"+
			"    dfinif VARCHAR(15) NOT NULL,"+
			"    dficodigo VARCHAR(7) NOT NULL,"+
			"    dfinifpagador VARCHAR(9),"+
			"    dfinompagador VARCHAR(40),"+
			"    dficuenta VARCHAR(10),"+
			"    dfiimporte FLOAT,"+
			"    PRIMARY KEY(dfiejer, dfinif, dficodigo));"};


	public static String sentencias18_9[]= {
			"ALTER TABLE BANCOCLI add bccsepa INTEGER;",
			"ALTER TABLE BANCOCLI add bcciban VARCHAR(34);",
			"ALTER TABLE BANCOCLI add bcccodswift VARCHAR(11);",
			"ALTER TABLE BANCOCLI add bccbanconame VARCHAR(70);",
			"ALTER TABLE BANCOCLI add bccbancadress VARCHAR(35);",
			"ALTER TABLE BANCOCLI add bccbanccity VARCHAR(30);",
			"ALTER TABLE BANCOCLI add bcccodpais VARCHAR(2);",
			"ALTER TABLE BANCOCLI add bccbancpais VARCHAR(40);"
	};
	public static String sentencias18_8[]={"DELETE FROM EPIGRAFES WHERE epitipoact='2' AND epiepigrafe='863';",
       "INSERT INTO EPIGRAFES (epitipoact,epiepigrafe,epidescripcion,epiepisinpunto) VALUES ('2','863','Periodistas y otros prof.información-comunicación','863');"
	};
	public static String sentencias18_7[]={"DELETE FROM INDEMORA WHERE indejercicio=2022;",
    "INSERT INTO INDEMORA (indejercicio,inddesdefecha,indhastafecha,indtipo_vigente) VALUES (2022,'01/01/2022','31/12/2022',3.75);"};

	public static String sentencias18_6[]= {
			"DELETE FROM AMORTIZACION where amocodigo>=3000"
		};

	public static String sentencias18_5[]= {
		"UPDATE PCMORANUAL SET pcmtipo='C' where pcmtipo='L'"
	};
	
	public static String sentencias18_4[]= {
		"ALTER TABLE PCINMOV ADD pcilimiteinver FLOAT;",
		"ALTER TABLE PCINMOV ADD pciincrplantil FLOAT;",
		"ALTER TABLE PCINMOV ADD pcicoeffiscal FLOAT;",
		"ALTER TABLE PCINMOV ADD pcitipofiscal VARCHAR(5);", 	
		"ALTER TABLE PCINMOV ALTER COLUMN pcitipofiscal VARCHAR(5);", 	
		"ALTER TABLE PCINMOVHIS ADD pcihlimiteinver FLOAT;",
		"ALTER TABLE PCINMOVHIS ADD pcihincrplantil FLOAT;",
		"ALTER TABLE PCINMOVHIS ADD pcihcoeffiscal FLOAT;",
		"ALTER TABLE PCINMOVHIS ADD pcihtipofiscal VARCHAR(5);", 	
		"ALTER TABLE PCINMOVHIS ALTER COLUMN pcihtipofiscal VARCHAR(5);" 	
	};
	
	public static String sentencias18_2[]={//ampliació PK de PCMORANUALHIS i PCMORANUAL
			"DROP TABLE PCMORANUALHIS2;",
			"DROP TABLE PCMORANUAL2;",
			"CREATE TABLE PCMORANUALHIS2                                          "+
			"   (pcmhelemento INTEGER NOT NULL,                                   "+
			"    pcmhamorejer INTEGER NOT NULL,                                   "+
			"    pcmhtipo VARCHAR(1) NOT NULL,                                    "+
			"    pcmhcoefamort FLOAT,                                             "+
			"    pcmhamortanual FLOAT,                                            "+
			"    pcmhamortacum FLOAT,                                             "+
			"    pcmhamortpdte FLOAT,                                             "+
			"    pcmhultfecha "+formatData()+
			"    pcmhcuotaapli FLOAT,                                             "+
			"    PRIMARY KEY (pcmhelemento,pcmhamorejer, pcmhtipo),               "+
			"    FOREIGN KEY (pcmhelemento) REFERENCES PCINMOVHIS(pcihelemento)); ",
			"CREATE TABLE PCMORANUAL2                                             "+
			"   (pcmelemento INTEGER NOT NULL,                                    "+
			"    pcmamorejer INTEGER NOT NULL,                                    "+
			"    pcmtipo VARCHAR(1) NOT NULL,                                     "+
			"    pcmcoefamort FLOAT,                                              "+
			"    pcmamortanual FLOAT,                                             "+
			"    pcmamortacum FLOAT,                                              "+
			"    pcmamortpdte FLOAT,                                              "+
			"    pcmultfecha "+formatData()+
			"    pcmcuotaapli FLOAT,                                              "+
			"    PRIMARY KEY (pcmelemento,pcmamorejer, pcmtipo),                  "+
			"    FOREIGN KEY (pcmelemento) REFERENCES PCINMOV(pcielemento));      ",
			"INSERT INTO PCMORANUALHIS2 SELECT * FROM PCMORANUALHIS;",
			"INSERT INTO PCMORANUAL2 SELECT * FROM PCMORANUAL",
			"DROP TABLE PCMORANUALHIS;",
			"DROP TABLE PCMORANUAL;",
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
			"    PRIMARY KEY (pcmhelemento,pcmhamorejer, pcmhtipo),               "+
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
			"    PRIMARY KEY (pcmelemento,pcmamorejer, pcmtipo),                  "+
			"    FOREIGN KEY (pcmelemento) REFERENCES PCINMOV(pcielemento));      ",
			"INSERT INTO PCMORANUALHIS SELECT * FROM PCMORANUALHIS2;",
			"INSERT INTO PCMORANUAL SELECT * FROM PCMORANUAL2;"
	};
	
	public static String sentencias18_1[]={
			  "INSERT INTO TRANSACCIONES (tratipo,tradesc,traemre,traregimen,tratipoiva,travoloper,traoperespec) VALUES ('EOSN','Operaciones no sujetas por reglas de localización acogidas a los regímenes especiales de ventanilla única','E','IN','OSN','OSN','NO')",
			  "INSERT INTO TRANSACCIONES (tratipo,tradesc,traemre,traregimen,tratipoiva,travoloper,traoperespec) VALUES ('EOSS','Operaciones sujetas y acogidas a los regímenes especiales de ventanilla única','E','IN','OSS','OSS','NO')",
			  "INSERT INTO TRANSACCIONES (tratipo,tradesc,traemre,traregimen,tratipoiva,travoloper,traoperespec) VALUES ('EOE','Operaciones exentas sin derecho a deducción','E','IN','OE','ESD','NO')",
			  "UPDATE TRANSACCIONES set travoloper='ISP' where traemre='E' and tratipoiva='ISP'",
			  "UPDATE TRANSACCIONES set travoloper='OSS', tradesc='Operaciones sujetas y acogidas a los regímenes especiales de ventanilla única' where traemre='E' and tratipoiva='OSS'",
			  "UPDATE TRANSACCIONES set travoloper='OSN', tradesc='Operaciones no sujetas por reglas de localización acogidas a los regímenes especiales de ventanilla única' where traemre='E' and tratipoiva='OSN'"
			};
	
	  public static String sentencias17_9[] = {
			  "CREATE TABLE WNIFES(                "
				+ "datcodigo " + getAuto() + " NOT NULL, "
				+ "danifcif varchar(15) NOT NULL,        "
				+ "datipo varchar(1) NULL,               "
				+ "datnombre varchar(50) NULL,           "
				+ "datapell1 varchar(100) NULL,          "
				+ "datapell2 varchar(50) NULL,           "
				+ "datsiglas varchar(2) NULL,            "
				+ "datvia varchar(45) NULL,              "
				+ "datnum varchar(6) NULL,               "
				+ "datesc varchar(2) NULL,               "
				+ "datpiso varchar(6) NULL,              "
				+ "datletra varchar(2) NULL,             "
				+ "datpobla varchar(30) NULL,            "
				+ "datmuni int NULL,                     "
				+ "datprov int NULL,                     "
				+ "datpais int NULL,                     "
				+ "datcpos varchar(5) NULL,              "
				+ "dattel varchar(15) NULL,              "
				+ "datfax varchar(15) NULL,              "
				+ "datfisicajuri varchar(1) NULL,        "
				+ "datemail varchar(100) NULL,           "
				+ "datcontacto varchar(30) NULL,         "
				+ "datesiglas varchar(2) NULL,           "
				+ "datevia varchar(45) NULL,             "
				+ "datenum varchar(6) NULL,              "
				+ "dateesc varchar(2) NULL,              "
				+ "datepiso varchar(6) NULL,             "
				+ "dateletra varchar(2) NULL,            "
				+ "datepobla varchar(30) NULL,           "
				+ "datemuni int NULL,                    "
				+ "dateprov int NULL,                    "
				+ "datepais int NULL,                    "
				+ "datecpos varchar(5) NULL,             "
				+ "dateatt varchar(35) NULL,             "
				+ "dataltaen varchar(1) NULL,            "
				+ "datletraseti varchar(4) NULL,         "
				+ "datipf varchar(1) NULL,               "
				+ "datdominio varchar(12) NULL,          "
				+ "datcbienes varchar(1) NULL,           "
				+ "datnacional int NULL,                 "
				+ "datfftvia varchar(5) NULL,            "
				+ "datfvia varchar(50) NULL,             "
				+ "datftnum varchar(3) NULL,             "
				+ "datfnum int NULL,                     "
				+ "datfcalnum varchar(3) NULL,           "
				+ "datfbloque varchar(3) NULL,           "
				+ "datfportal varchar(3) NULL,           "
				+ "datfescal varchar(3) NULL,            "
				+ "datfplanta varchar(3) NULL,           "
				+ "datfpuerta varchar(3) NULL,           "
				+ "datfcomp varchar(40) NULL,            "
				+ "datflocal varchar(30) NULL,           "
				+ "datfemail varchar(100) NULL,          "
				+ "datfprov int NULL,                    "
				+ "datfcodmun varchar(5) NULL,           "
				+ "datfnommun varchar(30) NULL,          "
				+ "datfcpost varchar(5) NULL,            "
				+ "datftel int NULL,                     "
				+ "datfmovil int NULL,                   "
				+ "datffax int NULL,                     "
				+ "datnftvia varchar(5) NULL,            "
				+ "datnvia varchar(50) NULL,             "
				+ "datntnum varchar(3) NULL,             "
				+ "datnnum int NULL,                     "
				+ "datncalnum varchar(3) NULL,           "
				+ "datnbloque varchar(3) NULL,           "
				+ "datnportal varchar(3) NULL,           "
				+ "datnescal varchar(3) NULL,            "
				+ "datnplanta varchar(3) NULL,           "
				+ "datnpuerta varchar(3) NULL,           "
				+ "datncomp varchar(40) NULL,            "
				+ "datnlocal varchar(30) NULL,           "
				+ "datnemail varchar(100) NULL,          "
				+ "datnprov int NULL,                    "
				+ "datncodmun varchar(5) NULL,           "
				+ "datnnommun varchar(30) NULL,          "
				+ "datncpost varchar(5) NULL,            "
				+ "datntel int NULL,                     "
				+ "datnmovil int NULL,                   "
				+ "datnfax int NULL,                     "
				+ "datnapcor varchar(10) NULL,           "
				+ "datnpobla varchar(30) NULL,           "
				+ "datnprov2 int NULL,                   "
				+ "datncpost2 varchar(5) NULL,           "
				+ "datntel2 int NULL,                    "
				+ "datnmovil2 int NULL,                  "
				+ "datnfax2 int NULL,                    "
				+ "datsftvia varchar(5) NULL,            "
				+ "datsvia varchar(50) NULL,             "
				+ "datstnum varchar(3) NULL,             "
				+ "datsnum int NULL,                     "
				+ "datscalnum varchar(3) NULL,           "
				+ "datsbloque varchar(3) NULL,           "
				+ "datsportal varchar(3) NULL,           "
				+ "datsescal varchar(3) NULL,            "
				+ "datsplanta varchar(3) NULL,           "
				+ "datspuerta varchar(3) NULL,           "
				+ "datscomp varchar(40) NULL,            "
				+ "datslocal varchar(30) NULL,           "
				+ "datsemail varchar(100) NULL,          "
				+ "datsprov int NULL,                    "
				+ "datscodmun varchar(5) NULL,           "
				+ "datsnommun varchar(30) NULL,          "
				+ "datscpost varchar(5) NULL,            "
				+ "datstel int NULL,                     "
				+ "datsmovil int NULL,                   "
				+ "datsfax int NULL,                     "
				+ "datmovil int NULL,                    "
				+ "datuser varchar(25) NULL,             "
				+ "datgrupo varchar(15) NULL,            "
				+ "datnombreant varchar(50) NULL,        "
				+ "datapell1ant varchar(100) NULL,       "
				+ "datapell2ant varchar(50) NULL,        "
				+ "DATCDPTIPO char(1) NULL,              "
				+ "DATCDPESTADO char(1) NULL,            "
				+ "DATCDPDATEP datetime NULL,            "
				+ "DATCDPDATEV datetime NULL,            "
				+ "DATCDPDATEI datetime NULL,            "
				+ "DATCDPUSERP varchar(25) NULL,         "
				+ "DATCDPUSERV varchar(25) NULL,         "
				+ "DATCDPUSERI varchar(25) NULL,         "
				+ "	PRIMARY KEY(datcodigo));"
				  };

	
	
  public static String sentencias17_6[] = {
	"ALTER TABLE DFSADMINS ADD dfarepresent CHAR(1);",
	"ALTER TABLE DFSADMINS ADD dfadomiciliof VARCHAR(50);",
	"ALTER TABLE DFSADMINS ADD dfaprovincia VARCHAR(2);",
	"CREATE TABLE DFSADMINSNINFO ("
	+ "	dfanejer	INTEGER NOT NULL,"
	+ "	dfannif		VARCHAR(15) NOT NULL,"
	+ "	dfancodigo	VARCHAR(7) NOT NULL,"
	+ "	PRIMARY KEY(dfanejer, dfannif, dfancodigo));",
	"CREATE TABLE DFSSOCIOSNINFO ("
	+ "	dfsnejer	INTEGER NOT NULL,"
	+ "	dfsnnif		VARCHAR(15) NOT NULL,"
	+ "	dfsncodigo	VARCHAR(7) NOT NULL,"
	+ "	PRIMARY KEY(dfsnejer, dfsnnif, dfsncodigo));",
	"CREATE TABLE DFSREGDECLARADO ("
	+ "	dfrdejer 	INTEGER,"
	+ "	dfrdnif  	VARCHAR(15),"
	+ "	dfrdcodigo  VARCHAR(7),"
	+ "	dfrdclave   VARCHAR(3),"
	+ "	dfrdpercep  FLOAT,"
	+ "	dfrdretenc  FLOAT,"
	+ "	dfrdvperes  FLOAT,"
	+ "	dfrdingefc  FLOAT,"
	+ "	dfrdingrep  FLOAT,"
	+ "	dfrdpercepilt FLOAT,"
	+ "	dfrdretencilt FLOAT,"
	+ "	dfrdvperesilt FLOAT,"
	+ "	dfrdingefcilt FLOAT,"
	+ "	dfrdingrepilt FLOAT,"
	+ "	dfrdimpcalcul FLOAT,"
	+ "	PRIMARY KEY(dfrdejer, dfrdnif, dfrdcodigo));",
	"CREATE TABLE DFSRDTIMPINFO ("
	+ "	dfriejer   	INTEGER,"
	+ "	dfrinif 	VARCHAR(15),"
	+ "	dfricodigo  VARCHAR(7),"
	+ "	dfrinifemis VARCHAR(9),"
	+ "	dfrinomemis VARCHAR(40),"
	+ "	dfrinifdecl VARCHAR(9),"
	+ "	dfrinomdecl VARCHAR(40),"
	+ "	dfriclave   VARCHAR(3),"
	+ "	dfritipo    INTEGER,"
	+ "	dfriimpinte FLOAT,"
	+ "	dfriretenci FLOAT,"
	+ "	dfrigtodedu FLOAT,"
	+ "	dfripenaliz FLOAT,"
	+ "	PRIMARY KEY(dfriejer, dfrinif, dfricodigo));",
	"CREATE TABLE DFSARRLOCALIMP ("
	+ "	dfarejer INTEGER,"
	+ "	dfarnif	 VARCHAR(15),"
	+ "	dfarcodigo VARCHAR(7),"
	+ "	dfarnifpaga VARCHAR(9),"
	+ "	dfarnompaga VARCHAR(40),"
	+ "	dfarrefcata VARCHAR(20),"
	+ "	dfarclave INTEGER,"
	+ "	dfaringreso FLOAT,"
	+ "	dfarretenci FLOAT,"
	+ "	PRIMARY KEY(dfarejer, dfarnif, dfarcodigo));"	
  };
	
  public static String sentencias17_5[]={
		  "INSERT INTO EPIGRAFES (epitipoact, epiepigrafe, epidescripcion, epiepisinpunto) VALUES ('1', '151.6', 'COMERCIALIZACIÓN DE ENERGÍA ELÉCTRICA', '1516')"
  };

  public static String sentencias17_3[]={"DELETE FROM INDEMORA WHERE indejercicio=2021;",
      "INSERT INTO INDEMORA (indejercicio,inddesdefecha,indhastafecha,indtipo_vigente) VALUES (2021,'01/01/2021','31/12/2021',3.75);"};

	public static String sentencias17_2[] ={
			"CREATE TABLE DFSDOMICILIO(      " +
			" dfdejer INTEGER NOT NULL,      " +
			" dfdnif VARCHAR(15) NOT  NULL,  " +
			" dfdcodigo VARCHAR(7) NOT NULL, " +
			" dfdtipodom VARCHAR(2) NOT NULL," +
			" dfdtipovia VARCHAR(5),         " +
			" dfdcodvia VARCHAR(5),          " +
			" dfdnomvial VARCHAR(50),        " +
			" dfdnomviac	VARCHAR(25),     " +
			" dfdtiponum VARCHAR(3),         " +
			" dfdcalifnum VARCHAR(3),        " +
			" dfdbloque	VARCHAR(3),          " +
			" dfdportal	VARCHAR(3),          " +
			" dfdescalera VARCHAR(3),        " +
			" dfdpiso     VARCHAR(3),        " +
			" dfdpuerta   VARCHAR(3),        " +
			" dfdcomplem VARCHAR(40),        " +
			" dfdpoblacion VARCHAR(30),      " +
			" dfdcodpos VARCHAR(5),          " +
			" dfdcodmuni VARCHAR(5),         " +
			" dfdmuni VARCHAR(30),           " +
			" dfdcodprov INTEGER,            " +
			" dfdprov	VARCHAR(20),         " +
			" dfdrefcat VARCHAR(20),         " +
			" dfd21address VARCHAR(50),      " +
			" dfd21compl VARCHAR(40),        " +
			" dfd21pobla VARCHAR(30),        " +
			" dfd21codpos VARCHAR(10),       " +
			" dfd21provre	VARCHAR(30),     " +
			" dfd21pais	VARCHAR(30),         " +
			" dfd21codpais VARCHAR(2),       " +
			" dfd21nacional VARCHAR(2),      " +
			" PRIMARY KEY (dfdejer, dfdnif, dfdcodigo));",

			"CREATE TABLE DFSCENSALES(      " +
			" dfcejer INTEGER NOT NULL,     " +
			" dfcnif VARCHAR(15) NOT NULL,  " +
			" dfccodigo VARCHAR(7) NOT NULL," +
			" dfccodact	VARCHAR(3),         " +
			" dfcdescact VARCHAR(40),       " +
			" dfcgrupoiae	VARCHAR(5),     " +
			" dfccodcnae  VARCHAR(5),       " +
			" PRIMARY KEY (dfcejer, dfcnif, dfccodigo));",

			"CREATE TABLE DFSPERIODOYCNAE(   " +
			" dfpejer	INTEGER NOT NULL,    " +
			" dfpnif 	VARCHAR(15) NOT NULL," +
			" dfpcodigo	VARCHAR(7) NOT NULL, " +
			" dfpfecini	" + formatData() +
			" dfpfecfin	" + formatData() +
			" dfptipoper	INTEGER,         " +
			" dfpcnae2009	VARCHAR(5),      " +
			" PRIMARY KEY(dfpejer, dfpnif, dfpcodigo));",

			"CREATE TABLE DFSCARACTERES(     " +
			" dfcejer INTEGER NOT NULL,      " +
			" dfcnif 	VARCHAR(15) NOT NULL," +
			" dfccodigo	VARCHAR(7) NOT NULL, " +
			" dfccaracter VARCHAR(5),        " +
			" PRIMARY KEY (dfcejer, dfcnif, dfccodigo));",

			"CREATE TABLE DFSADMINS(         " +
			" dfaejer	INTEGER NOT NULL,    " +
			" dfanif	VARCHAR(15) NOT NULL," +
			" dfacodigo	VARCHAR(7) NOT NULL, " +
			" dfanifadmin	VARCHAR(9),      " +
			" dfatiponif	VARCHAR(1),      " +
			" dfanombre	VARCHAR(60),         " +
			" PRIMARY KEY(dfaejer, dfanif, dfacodigo));",

			"CREATE TABLE DFSENTIDPART(      " +
			" dfeejer	INTEGER NOT NULL,    " +
			" dfenif	VARCHAR(15) NOT NULL," +
			" dfecodigo	VARCHAR(7) NOT NULL, " +
			" dfeentnifid	VARCHAR(20),     " +
			" dfenombre	VARCHAR(60),         " +
			" dfeprovpais	VARCHAR(2),      " +
			" dfeporcpart	FLOAT,           " +
			" dfevalornom	FLOAT,           " +
			" dfevalorlib	FLOAT,           " +
			" dfeingrdivej	FLOAT,           " +
			" PRIMARY KEY(dfeejer, dfenif, dfecodigo));",

			"CREATE TABLE DFSPERSPART(       " +
			" dfpejer	INTEGER NOT NULL,    " +
			" dfpnif	VARCHAR(15) NOT NULL," +
			" dfpcodigo	VARCHAR(7) NOT NULL, " +
			" dfppersnif	VARCHAR(9),      " +
			" dfptiponif	VARCHAR(1),      " +
			" dfpesrepre	VARCHAR(1),      " +
			" dfpnombre	VARCHAR(60),         " +
			" dfpprovpais	VARCHAR(2),      " +
			" dfpvalornom	FLOAT,           " +
			" dfpporcpart	FLOAT,           " +
			" PRIMARY KEY(dfpejer, dfpnif, dfpcodigo));",

			"CREATE TABLE DFSSECREREPRE(     " +
			" dfsejer	INTEGER NOT NULL,    " +
			" dfsnif	VARCHAR(15) NOT NULL," +
			" dfscodigo	VARCHAR(7) NOT NULL, " +
			" dfspersnif	VARCHAR(9),      " +
			" dfsnombre	VARCHAR(60),         " +
			" dfsfuncion	VARCHAR(1),      " +
			" dfsfecfirma " + formatData() +
			" PRIMARY KEY(dfsejer, dfsnif, dfscodigo));",

			"CREATE TABLE DFSPAGOSFRAC(      " +
			" dfpejer	INTEGER NOT NULL,    " +
			" dfpnif	VARCHAR(15) NOT NULL," +
			" dfpcodigo	VARCHAR(7) NOT NULL, " +
			" dfpmodelo	VARCHAR(3),          " +
			" dfptipo	VARCHAR(1),          " +
			" dfpperiodo	VARCHAR(2),      " +
			" dfpdeleg	VARCHAR(2),          " +
			" dfpjustif	VARCHAR(13),         " +
			" dfpimporte	FLOAT,           " +
			" PRIMARY KEY(dfpejer, dfpnif, dfpcodigo));",

			"CREATE TABLE DFSVOLOPER(        " +
			" dfvejer	INTEGER NOT NULL,    " +
			" dfvnif	VARCHAR(15) NOT NULL," +
			" dfvcodigo	VARCHAR(7) NOT NULL, " +
			" dfvmodelo	VARCHAR(3) NOT NULL, " +
			" dfvtotvol	FLOAT,               " +
			" PRIMARY KEY(dfvejer, dfvnif, dfvcodigo, dfvmodelo));",

			"CREATE TABLE DFSRDTOTRAB(       " +
			" dfrejer	INTEGER NOT NULL,    " +
			" dfrnif	VARCHAR(15) NOT NULL," +
			" dfrcodigo	VARCHAR(7) NOT NULL, " +
			" dfrnifpaga	VARCHAR(9),      " +
			" dfrnombre	VARCHAR(40),         " +
			" dfrclave	VARCHAR(2),          " +
			" dfrdinera	FLOAT,               " +
			" dfrreten	FLOAT,               " +
			" dfrespecie	FLOAT,           " +
			" dfringcta	FLOAT,               " +
			" dfringctarep FLOAT,            " +
			" dfrgastosded	FLOAT,           " +
			" dfrreduc		FLOAT,	         " +
			" PRIMARY KEY(dfrejer, dfrnif, dfrcodigo));",

			"CREATE TABLE DFSDEDUCYBASES(       " +
			" dfdejer	INTEGER NOT NULL,       " +
			" dfdnif	VARCHAR(15) NOT NULL,   " +
			" dfdcodigo	VARCHAR(7) NOT NULL,    " +
			" dfdtipoded	VARCHAR(3) NOT NULL," +
			" dfdanyded	INTEGER NOT NULL,       " +
			" dfdcasejer	VARCHAR(255) NOT NULL," +
			" dfdcasejerant VARCHAR(255) NOT NULL," +
			" dfdimporte	FLOAT,              " +
			" PRIMARY KEY(dfdejer, dfdnif, dfdcodigo, dfdtipoded, dfdanyded, dfdcasejer, dfdcasejerant));",

			"CREATE TABLE DFSDONACIONES(     " +
			" dfdejer	INTEGER NOT NULL,    " +
			" dfdnif	VARCHAR(15) NOT NULL," +
			" dfdcodigo	VARCHAR(7) NOT NULL, " +
			" dfdnifent	VARCHAR(9),          " +
			" dfdnombre	VARCHAR(40),         " +
			" dfdtipo	VARCHAR(1),          " +
			" dfdclave	VARCHAR(1),          " +
			" dfdimporte	FLOAT,           " +
			" dfdrecur	VARCHAR(1),          " +
			" PRIMARY KEY (dfdejer, dfdnif,dfdcodigo));",

			"CREATE TABLE DFSMULTASDGT(      " +
			" dfmejer	INTEGER NOT NULL,    " +
			" dfmnif	VARCHAR(15) NOT NULL," +
			" dfmcodigo	VARCHAR(7) NOT NULL, " +
			" dfmejermulta	INTEGER,         " +
			" dfmmatricula	VARCHAR(10),     " +
			" dfmtvolunta	FLOAT,           " +
			" dfmrecargoa	FLOAT,           " +
			" dfmtejecut	FLOAT,           " +
			" PRIMARY KEY(dfmejer, dfmnif, dfmcodigo));",

			"CREATE TABLE DFSRDTOCTASBAN(    " +
			" dfrejer INTEGER NOT NULL,      " +
			" dfrnif 	VARCHAR(15) NOT NULL," +
			" dfrcodigo	VARCHAR(7) NOT NULL, " +
			" dfrnifpaga	VARCHAR(9),      " +
			" dfrnombre	VARCHAR(40),         " +
			" dfrcuenta	VARCHAR(10),         " +
			" dfrtipo	VARCHAR(1),          " +
			" dfrtitulares VARCHAR(3),       " +
			" dfrrdtodiner	FLOAT,           " +
			" dfrreten	FLOAT,               " +
			" dfrrdtoespec	FLOAT,           " +
			" dfringcta	FLOAT,	             " +
			" PRIMARY KEY(dfrejer,dfrnif,dfrcodigo));",

			"CREATE TABLE DFSSANCIONES(     " +
			" dfsejer INTEGER NOT NULL,     " +
			" dfsnif VARCHAR(15) NOT NULL,  " +
			" dfscodigo VARCHAR(7) NOT NULL," +
			" dfsconcepto VARCHAR(40),      " +
			" dfsdesc VARCHAR(70),          " +
			" dfssancion FLOAT,             " +
			" dfsrecargoo FLOAT,            " +
			" dfsrecargoa FLOAT,            " +
			" dfscalculado FLOAT,           " +
			" PRIMARY KEY(dfsejer, dfsnif, dfscodigo));"
	};

	public static String getMemo(int tamany) {
		String tipoDB=Easp.connEA.getDB().getType();
		if (tipoDB.toUpperCase().equals("ACCESS")) return " MEMO,";
		else                                       return " VARCHAR("+tamany+"),";
	}

	public static String formatData() {
		String tipoDB=Easp.connEA.getDB().getType();
		if (tipoDB.toUpperCase().equals("ACCESS")) return " DATE,";
		else return " DATETIME,";
	}

	public static String formatoData() {
		String tipoDB=Easp.connEA.getDB().getType();
		if (tipoDB.toUpperCase().equals("ACCESS")) return " DATE";
		else
			return " DATETIME";
	}
	
	public static String getAuto() {
		String tipoDB=Easp.connEA.getDB().getType();
	    if (tipoDB.toUpperCase().equals("ACCESS")) return " int";
	    else                                       return " int IDENTITY(1,1)"; 
	}
	  
}
