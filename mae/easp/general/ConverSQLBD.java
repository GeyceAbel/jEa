package mae.easp.general;

import geyce.maefc.*;
import mae.general.*;

public class ConverSQLBD {

	public static final int NO_ERR                   = 0;
	public static final int ERR_DB_EXISTE            = 1;
	public static final int ERR_SQL_NO_INSTALADO     = 2;
	public static final int ERR_DESCONOCIDO          = 3;
	public static final int ERR_BD_ACCESS_NO_EXISTE	 = 4;
	public static final int ERR_CONECTAR_SQLSERVER   = 5;
	public static final int ERR_DB_NO_EXISTE         = 6;

	private int iNumError;
	private String sErrDesconocido;

	private int iPasoActual;

	private String sServidor;
	private String sBD;
	private String sBDOrigen;
	private String sUser;
	private String sPwd;
	private String sBDtmp;
	private boolean bOk;
	private ProgressBarForm pbf;


	public ConverSQLBD (String _sServidor, String _sBD, String _sBDOrigen) {
		sServidor = _sServidor;
		sBD = _sBD;
		sBDOrigen = _sBDOrigen;
		pbf = null;
		iPasoActual = 1;
		bOk = true;
		sUser = "sa";
		sPwd = "sa";
		iNumError = NO_ERR;
	}

   public ConverSQLBD (String _sServidor, String _sBD, String _sBDOrigen, String _sUser, String _sPwd ) {
		sServidor = _sServidor;
		sBD = _sBD;
		sBDOrigen = _sBDOrigen;
		pbf = null;
		iPasoActual = 1;
		bOk = true;
		sUser = _sUser;
		sPwd = _sPwd;
		iNumError = NO_ERR;
	}

	public void xiv (String s) {
		System.out.println (s);
	}
	public String getERR_CONECTAR_SQLSERVER () {
		return ""+ERR_CONECTAR_SQLSERVER;
	}

	public String getERR_DB_EXISTE () {
		return ""+ERR_DB_EXISTE;
	}
	public String getERR_SQL_NO_INSTALADO () {
		return ""+ERR_SQL_NO_INSTALADO;
	}
	public String getERR_DESCONOCIDO () {
		return ""+ERR_DESCONOCIDO;
	}
	public String getERR_BD_ACCESS_NO_EXISTE () {
		return ""+ERR_BD_ACCESS_NO_EXISTE;
	}

	public void nada () {
			System.out.println ("nada de nada");
	}
	public String readScript (String sRuta) {
		java.io.InputStream in = null;
		String scriptEA = "";
    try {
				in = ClassLoader.getSystemResourceAsStream(sRuta);
        StringBuffer script = new StringBuffer();
        int readed;
        byte[] buffer=new byte[1024];
        while((readed=in.read(buffer))>0) {
          String line=new String(buffer,0,readed);
          script.append(line);
          }
        scriptEA = script.toString();
      } catch (Exception ex) {
				bOk = false;
        ex.printStackTrace();
      }
      finally {
          try { if (in!=null) in.close(); } catch(Exception ex) { ex.printStackTrace();bOk = false; }
      }
		if (!bOk) scriptEA = null;
		return scriptEA;
	}

  public boolean creaDB()  {
    try {
			resetError ();
			boolean bOk = true;
			setMessagePBF ("Leyendo datos ...",0,false);
      String sScript = readScript ("mae/easp/scripts/creaEA.vbs");
			if (sScript == null) bOk = false;
			if (bOk) {
      	Scripting scrip = new Scripting();
    		scrip.RunScript(sScript,"Report",this);
			}
    }
    catch (Exception ex) {
			bOk = false;
      ex.printStackTrace();
    }
		return bOk;
  }

		public int iTotalPBF2;
		public int iAugmentPBF2;
		public int iAc2;
		public void setTotalPBF2 (int i) {
			iTotalPBF2 = i;
			iAugmentPBF2 = (i/10);
			iAc2=0;
		}
		public void incPBF2 () {
			//iAc2 += iAugmentPBF2;
			//pbf.setSecondaryPercent ((iAc2 * 100)/iTotalPBF2);
			iAc2 ++;
			pbf.setSecondaryPercent ((iAc2 * 100)/iTotalPBF2);

		}

	 public boolean eliminaDB( String sDB )  {
    try {
			resetError();
      Scripting scrip = new Scripting();
      scrip.RunScript(getScriptDropDB(sDB),"Report",this) ;
        }
    catch (Exception ex) {
			bOk = false;
      ex.printStackTrace();
    }
		return bOk;
	 }

	 public boolean existeDB( String sDB )  {
    try {
			resetError();
      Scripting scrip = new Scripting();
      scrip.RunScript(getScriptExisteDB(sDB),"Report",this) ;
        }
    catch (Exception ex) {
			bOk = false;
      ex.printStackTrace();
    }
		return bOk;
	 }


  public boolean checkTaules (String _sBDtmp)  {
    try {
			resetError ();
			boolean bOk = true;
			sBDtmp = _sBDtmp;
			setMessagePBF ("Leyendo datos ...",0,false);
      String sScript = readScript ("mae/easp/scripts/checkTaules.vbs");
			if (sScript == null) bOk = false;
			if (bOk) {
      	Scripting scrip = new Scripting();
    		scrip.RunScript(sScript,"Report",this);
			}
    }
    catch (Exception ex) {
			bOk = false;
      ex.printStackTrace();
    }
		return bOk;
  }

	public String getBDtmp() {
		return sBDtmp;
	}
	public void setPBF (ProgressBarForm _pbf) {
		pbf = _pbf;
	}

	public void setError (String sError) {
		try {
			iNumError = Integer.parseInt (sError);
		}
		catch (Exception e) {
			iNumError = ERR_DESCONOCIDO;
			setDescError ("Error al asignar numero de error ("+sError+")");
		}
		bOk = false;
	}

	public void setDescError (String sError) {
		sErrDesconocido = sError;
	}

	public int getError () {return iNumError;}

	public String getDescError () {return sErrDesconocido;}

	public void resetError () {
		iNumError = NO_ERR;
		sErrDesconocido = "";
		bOk = true;
	}

	public void setMessagePBF (String sMsg, int iNumPasos, boolean bPas) {
		if (pbf != null) {
			pbf.setState(sMsg);
			if (bPas) {
				pbf.setPercent((iPasoActual *100) / iNumPasos);
				iPasoActual++;
			}
		}
	}

	public void resetPBF () {
		if (pbf != null) {
			pbf.setPercent(0);
		}
		iPasoActual = 1;
		resetPBF2();
	}

	public void resetPBF2 () {
		if (pbf != null) {
			pbf.setSecondaryPercent(0);
		}
		iP2 = 1;
	}

	public int iP2;
	public void setStatePBF2 (int iNumPasos) {
		if (pbf != null) {
			pbf.setSecondaryPercent((iP2 *100) / iNumPasos);
			iP2++;
		}
	}


	public String getServidor() { return sServidor; }
	public String getBD() 			{ return sBD; 			}
	public String getBDOrigen() { return sBDOrigen; }
	public String getUser() 			{ return sUser; 			}
	public String getPassword() { return sPwd; }

	public String getScriptDropDB (String sDB2delete) {
		String script = "";
		script += "\n On Error Resume Next                                                                                               ";
		script += "\n param1 = \"" +sDB2delete+"\"";
		script += "\n param2 = Report.getServidor()                                                                                             ";
		script += "\n Set DMOServer= CreateObject(\"SQLDMO.SQLServer\")                                                                    ";
		script += "\n If DMOServer is Nothing then                                                                                       ";
		script += "\n   Report.setError (\""+ERR_SQL_NO_INSTALADO+"\")";
		script += "\n Else                                                                                                             ";
		script += "\n 	DMOServer.LoginSecure = True                                                                                       ";
		script += "\n 	DMOServer.Connect  param2																																																";
		script += "\n 	If Err.number <> 0 then";
		script += "\n      Report.setError (\""+ERR_CONECTAR_SQLSERVER+"\")";
		script += "\n   Else";
		script += "\n     strSQL= \"DROP DATABASE \" & param1                                            ";
		script += "\n     DMOServer.Executeimmediate strSQL                                                                                ";
		script += "\n     DMOServer.disconnect                                                                                                ";
		script += "\n     if (Err.number<>0) then                                                                                        ";
		script += "\n       Report.setError (\""+ERR_DESCONOCIDO+"\")                                                                        ";
		script += "\n       Report.setDescError (Err.description)                                                            ";
		script += "\n     End if                                                                                                         ";
		script += "\n   End If                                                                                                           ";
		script += "\n End If                                                                                                           ";
		script += "\n Set DMOServer= Nothing                                                                                              ";
		return script;
	}
	public String getScriptExisteDB (String sDB2check) {
		String script = "";
		script += "\n On Error Resume Next                                                                                               ";
		script += "\n param1 = \"" +sDB2check+"\"";
		script += "\n param2 = Report.getServidor()                                                                                             ";
		script += "\n Set DMOServer= CreateObject(\"SQLDMO.SQLServer\")                                                                    ";
		script += "\n If DMOServer is Nothing then                                                                                       ";
		script += "\n   Report.setError (\""+ERR_SQL_NO_INSTALADO+"\")";
		script += "\n Else                                                                                                             ";
		script += "\n 	DMOServer.LoginSecure = True                                                                                       ";
		script += "\n 	DMOServer.Connect  param2																																																";
		script += "\n 	If Err.number <> 0 then";
		script += "\n      Report.setError (\""+ERR_CONECTAR_SQLSERVER+"\")";
		script += "\n   Else";
		script += "\n     bTrobat = false                                                                                                ";
		script += "\n     For K=1 to DMOServer.Databases.Count                                            ";
		script += "\n       If UCase(DMOServer.Databases(K).name) = UCase(param1) and not bTrobat then                                                                                ";
		script += "\n         bTrobat = true                                                                                                ";
		script += "\n       End if                                                                                        ";
		script += "\n     Next                                                                        ";
		script += "\n   	If Err.number <> 0 then";
		script += "\n       Report.setError (\""+ERR_DESCONOCIDO+"\")";
		script += "\n       Report.setDescError (Err.description)";
		script += "\n     Else		                                                                                                           ";
		script += "\n       If (bTrobat) then                                                                                                            ";
		script += "\n         Report.setError (\""+ERR_DB_EXISTE+"\")";
		script += "\n       Else                                                                                                           ";
		script += "\n         Report.setError (\""+ERR_DB_NO_EXISTE+"\")";
		script += "\n       End If                                                                                                           ";
		script += "\n     End if                                                                                                         ";
		script += "\n   End if                                                                                                         ";
		script += "\n End If                                                                                                           ";
    script += "\n If Not (DMOServer is Nothing) then                                                                                       ";
		script += "\n   DMOServer.close                                                                                                         ";
		script += "\n End If                                                                                                           ";
		script += "\n Set DMOServer= Nothing                                                                                              ";
		return script;
	}

	public boolean setRegistre(String sCodi, String sAplic, String sHome, String sTipoBD, String sServer) {
		String sResult = "";
		Azure az = new Azure ("agpi2dp.registraraplicacion");
		az.addParametroURL("pcod", sCodi);
		az.addParametroURL("aplic", sAplic);
		az.addParametroURL("phome", sHome);
		az.addParametroURL("ptipo", sTipoBD);
		az.addParametroURL("pservidor", sServer);
		if (az.procesar()) sResult = az.getContenido();
		System.out.println ("sResult ["+sResult+"]");
		int iOk;
		try {
			iOk = Integer.parseInt (sResult);
		}
		catch (Exception e) {
			iOk = 1;
		}
		if (iOk != 0) {
			Maefc.message ("Error al canviar el registro de:\npcod="+sCodi+"&aplic="+sAplic+"&phome="+sHome+"&ptipo="+sTipoBD+"&pservidor="+sServer+"\nResult ["+sResult+"]");
		}
		return (iOk == 0);
	}
	//http://afinity.geyce.es/pls/agpi/agpi2dp.REGISTRARAPLICACION?pcod=888888000000&aplic=JMOD&phome=c:\ctasp_dev\&ptipo=sqlserver&pserver=localhost

// Final de la Classe converSQLBD
}
