package mae.easp.insprconver;

import mae.easp.general.Easp;
import mae.modasp.general.Modasp;

public class Sentencias {
	
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
}
