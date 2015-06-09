package mae.easp.conversions.logicclass;

import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import mae.contaasp.general.BorrarDatosSQL;
import mae.contaasp.general.Iva2012;
import mae.easp.conversions.FuncionesJCO;
import mae.easp.conversions.DadesEmpresa;
import mae.easp.conversions.Incidencia;
import mae.easp.conversions.Conversion.APLICACION_GEYCE;
import mae.easp.conversions.logicclass.db.SelectorLogic;
import mae.general.Fecha;
import mae.general.Numero;
import mae.general.ProgressBarForm;
import mae.general.Util;
import geyce.maefc.Aplication;
import geyce.maefc.DBConnection;
import geyce.maefc.Delete;
import geyce.maefc.Field;
import geyce.maefc.Insert;
import geyce.maefc.Maefc;
import geyce.maefc.Program;
import geyce.maefc.Select;
import geyce.maefc.Selector;
import geyce.maefc.Table;
import geyce.maefc.Update;

public class ConversionJCO extends ConversionLC {
	private String tipoCta;
	private String longCta;
	private boolean asigProy;
	private boolean esSQL;
	private FuncionesJCO funciones;
	private DBConnection dbJCta;
	private java.util.Hashtable<Integer,TipoReten> htRet;
	private java.util.Hashtable<Integer,TipoIVA> htIva;
	private java.util.Vector<String> ctaMayor;
	private java.util.Hashtable <String,String> htGrupos;
	private int LONG_SBCTA;
	private boolean augmentaLong4;
	private boolean esPyme;

	private Field  ccfdcdpaeatdele;
	private Field  ccfdadministra ;
	private Field  ccfddelegacio  ;
	private Field  ccfdcdpaeatadm ;
	private Field  ccfddatnombre  ;
	private Field  ccfddatapell1  ;
	private Field  ccfddatapell2  ;
	private Field  ccfddatsiglas  ;
	private Field  ccfddatvia     ;
	private Field  ccfddatnum     ;
	private Field  ccfddatpuerta  ;
	private Field  ccfddatesc     ;
	private Field  ccfddatpiso    ;
	private Field  ccfddatpobla   ;
	private Field  ccfddatcpos    ;
	private Field  ccfddattel     ;
	private Field  ccfddatcodprov ;
	private Field  ccfdprovincia  ;
	private Field  ccfdletetiq    ;
	private ProgressBarForm pbf;
	private int asientoCE;
	private int asientoCC;
	private boolean estaCerrado;


	public ConversionJCO (Program pr,int idConversion, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, String servidor, String instancia, String nombreBD, String user, String passwd, DBConnection connEA, String tipoCta, String longCta, boolean asigProy, boolean esSQL) {
		super (pr,desdeEmp, hastaEmp, desdeEjer, hastaEjer, connEA, servidor, instancia, nombreBD, user, passwd, idConversion);
		this.tipoCta = tipoCta;
		this.longCta = longCta;
		this.asigProy = asigProy;
		this.esSQL = esSQL;
		funciones = new FuncionesJCO(connEA,dominio);
	}

	@Override
	public Vector<DadesEmpresa> initEmpreses () {
		SelectorLogic sEmp = new SelectorLogic (connLC);
		String sql = "Select * from EMPRESAS where EmpresaEstimaciones=0 and CodigoEmpresa<>9999 ";
		if (desdeEmp>0) sql += " and CodigoEmpresa>="+desdeEmp; 
		if (hastaEmp>0) sql += " and CodigoEmpresa<="+hastaEmp; 		
		sEmp.execute(sql);
		while (sEmp.next()) {
			int emp = sEmp.getint("CodigoEmpresa");
			String nif = (String)sEmp.getObject("CifDni");
			String razon = (String)sEmp.getObject("Empresa");			
			String NombrePersona = (String)sEmp.getObject("NombrePersona");
			String PrimerApellido = (String)sEmp.getObject("PrimerApellido");
			String SegundoApellido = (String)sEmp.getObject("SegundoApellido");
			if ((razon == null || razon.trim().length()==0)) {
				razon = "";
				if ((NombrePersona!=null && NombrePersona.trim().length()>0)) razon += NombrePersona+" ";
				if ((PrimerApellido!=null && PrimerApellido.trim().length()>0)) razon += PrimerApellido+" ";
				if ((SegundoApellido!=null && SegundoApellido.trim().length()>0)) razon += SegundoApellido;
				razon = razon.trim();
			}
			SelectorLogic sEmpEjer = new SelectorLogic (connLC);
			sEmpEjer.execute("Select Distinct(Ejercicio) from Periodos where CodigoEmpresa="+emp+" and Ejercicio>="+desdeEjer+" and Ejercicio<="+hastaEjer+" order by Ejercicio");		    			
			boolean tieneDatos = sEmpEjer.next();
			sEmpEjer.close();
			if (tieneDatos) vDadesEmpresa.addElement (new DadesEmpresa(emp,nif,razon,APLICACION_GEYCE.JCONTA));
		}
		sEmp.close();
		return vDadesEmpresa;
	}

	@Override
	public APLICACION_GEYCE getAplicGeyce() {
		return APLICACION_GEYCE.JCONTA;
	}

	private java.util.Vector<Integer> getEjerciciosEmpresa(int codiLC) {
		java.util.Vector<Integer> ve = new java.util.Vector<Integer> ();
		SelectorLogic sEmpEjer = new SelectorLogic (connLC);
		sEmpEjer.execute("Select Distinct(Ejercicio) from Periodos where CodigoEmpresa="+codiLC+" and Ejercicio>="+desdeEjer+" and Ejercicio<="+hastaEjer+" order by Ejercicio");		    
		while (sEmpEjer.next()) {
			int ej = sEmpEjer.getint("Ejercicio");
			ve.addElement(new Integer(ej));
		}
		sEmpEjer.close();
		return ve;
	}

	private boolean altaNIF(int codEmp, int empJcta, String nif, String nombre, String apellido1, String apellido2,String nombreCompleto, String fisica, String etiqueta,String tipoPersona) {
		boolean existeFiscal = false;
		String cdp = dominio.substring(0,6)+Numero.format(empJcta,"000000");
		Insert iNIF = new Insert(connEA,"NIFES");
		iNIF.valor("danifcif",nif);
		iNIF.valor("datipo","C"); 
		if ("F".equals(fisica)) {
			iNIF.valor("datnombre",nombre);
			iNIF.valor("datapell1",apellido1);
			iNIF.valor("datapell2",apellido2);
			if ((apellido1==null || apellido1.trim().length()==0) && nombreCompleto!=null && nombreCompleto.trim().length()>0) {
				String [] resultat = funciones.separaNom(nombreCompleto); 
				iNIF.valor("datnombre",resultat[2]);
				iNIF.valor("datapell1",resultat[0]);
				iNIF.valor("datapell2",resultat[1]);
			}
		}
		else {
			iNIF.valor("datapell1",nombreCompleto);
			if (nombreCompleto==null || nombreCompleto.trim().length()==0) iNIF.valor("datapell1",apellido1);
		}
		iNIF.valor("datfisicajuri",fisica);
		if ("F".equals(fisica)) iNIF.valor("datipf","1");
		else iNIF.valor("datipf","9");
		iNIF.valor("datletraseti",etiqueta);
		if ("6".equals(tipoPersona) || "8".equals(tipoPersona) || "9".equals(tipoPersona)) iNIF.valor("datcbienes","S");
		else iNIF.valor("datcbienes","N");
		iNIF.valor("datdominio",dominio); 
		SelectorLogic sEmpresaD = new SelectorLogic(connLC);
		sEmpresaD.execute("Select * from EmpresasDomicilios where CodigoEmpresa="+codEmp+" order by CodigoDireccion"); 
		boolean hayTelefono = false;
		while (sEmpresaD.next()) {
			String tipo = sEmpresaD.getString("CodigoDireccion");
			String codSigla = sEmpresaD.getString("CodigoSigla");
			String tipoVia = "CALLE";    
			String codMuniT = sEmpresaD.getString("CodigoMunicipio");
			String codMuni = codMuniT;
			if (codMuni!=null) {
				if (codMuni.length()==5) codMuni = codMuni.substring(2);
				else if (codMuni.length()==4) codMuni = codMuni.substring(1);
			}    
			Selector sMuni = new Selector(connEA);
			sMuni.execute("Select mu7muniant from MUNI347 where mu7provmuni='"+codMuniT+"'");
			if (sMuni.next() && sMuni.getString("mu7muniant")!=null) codMuni = sMuni.getString("mu7muniant");
			sMuni.close();
			Selector s = new Selector (connEA);
			s.execute("Select * from TIPOVIAS where tvscodant='"+codSigla+"'");
			if (s.next()) tipoVia = s.getString("tvscodigo");
			s.close();
			String via = sEmpresaD.getString("ViaPublica");
			String numero = sEmpresaD.getString("Numero1");
			String letra = sEmpresaD.getString("Letra");
			String escalera = sEmpresaD.getString("Escalera");
			String piso = sEmpresaD.getString("Piso");
			String puerta = sEmpresaD.getString("Puerta");
			String mail = sEmpresaD.getString("EMail1");
			String municipio = sEmpresaD.getString("Municipio");
			String codProv = sEmpresaD.getString("CodigoProvincia");
			String codPostal = sEmpresaD.getString("CodigoPostal");
			String telefono1 = sEmpresaD.getString("Telefono");
			String telefono2 = sEmpresaD.getString("Telefono2");
			String fax = sEmpresaD.getString("Fax");
			if (telefono1!=null && telefono1.length()>9) telefono1 = telefono1.substring(0,9);
			if (telefono2!=null && telefono2.length()>9) telefono2 = telefono2.substring(0,9);
			if (fax!=null && fax.length()>9) fax = fax.substring(0,9);

			if (telefono1!=null && !Util.isNumero(telefono1)) telefono1 = null;
			if (telefono2!=null && !Util.isNumero(telefono2)) telefono2 = null;
			if (fax!=null && !Util.isNumero(fax)) fax = null;

			if (numero==null || !Util.isNumero(numero)) numero = null;

			int nacion = sEmpresaD.getint("CodigoNacion");    
			if ("FIS".equals(tipo)) {
				// direccion fiscal
				existeFiscal = true;  
				int deleg = sEmpresaD.getint("IdDelegacionHacienda");
				int admon = sEmpresaD.getint("CodigoAdministracion");
				if (deleg>0 && admon>0) {
					Update uCdp = new Update(connEA,"CDP");
					uCdp.valor("cdpaeatdele",deleg);
					uCdp.valor("cdpaeatadm",admon);
					uCdp.execute("cdpcodi='"+cdp+"'");       
				}
				if (telefono1!=null || telefono2!=null) hayTelefono = true;
				iNIF.valor("datsiglas",codSigla); 
				iNIF.valor("datvia",via);
				iNIF.valor("datnum",numero);
				iNIF.valor("datesc",escalera);
				iNIF.valor("datpiso",piso); 
				iNIF.valor("datletra",puerta); 
				iNIF.valor("datpobla",municipio); 
				iNIF.valor("datmuni",codMuni); 
				iNIF.valor("datprov",codProv); 
				iNIF.valor("datpais",nacion); 
				iNIF.valor("datnacional",nacion);
				iNIF.valor("datcpos",codPostal); 
				iNIF.valor("dattel",telefono1); 
				iNIF.valor("datfax",fax); 
				iNIF.valor("datemail",mail); 
				iNIF.valor("datcontacto",nombreCompleto); 
				iNIF.valor("datmovil",telefono2); 
				iNIF.valor("datfftvia",tipoVia); 
				iNIF.valor("datfvia",via);  
				iNIF.valor("datftnum","NUM");  
				iNIF.valor("datfnum",numero); 
				iNIF.valor("datfportal",letra);
				iNIF.valor("datfescal",escalera);
				iNIF.valor("datfplanta",piso);
				iNIF.valor("datfpuerta",puerta);
				iNIF.valor("datfemail",mail); 
				iNIF.valor("datfprov",codProv);
				iNIF.valor("datfcodmun",codMuniT);
				iNIF.valor("datfnommun",municipio); 
				iNIF.valor("datfcpost",codPostal); 
				iNIF.valor("datftel",telefono1); 
				iNIF.valor("datfmovil",telefono2);
				iNIF.valor("datffax",fax); 
			}
			else if ("SOC".equals(tipo)) {
				// direccion social
				iNIF.valor("datsftvia",tipoVia);
				iNIF.valor("datsvia",via);
				iNIF.valor("datstnum","NUM"); 
				iNIF.valor("datsnum",numero);  
				iNIF.valor("datsportal",letra);
				iNIF.valor("datsescal",escalera);
				iNIF.valor("datsplanta",piso);
				iNIF.valor("datspuerta",puerta); 
				iNIF.valor("datsemail",mail); 
				iNIF.valor("datsprov",codProv);
				iNIF.valor("datscodmun",codMuniT);
				iNIF.valor("datsnommun",municipio); 
				iNIF.valor("datscpost",codPostal); 
				iNIF.valor("datstel",telefono1); 
				iNIF.valor("datsmovil",telefono2); 
				iNIF.valor("datsfax",fax);  
			}
			else if ("ENV".equals(tipo)) {
				// 	direccion envio
				iNIF.valor("datnftvia",tipoVia);
				iNIF.valor("datnvia",via); 
				iNIF.valor("datntnum","NUM");  
				iNIF.valor("datnnum",numero);  
				iNIF.valor("datnportal",letra);
				iNIF.valor("datnescal",escalera); 
				iNIF.valor("datnplanta",piso);
				iNIF.valor("datnpuerta",puerta); 
				iNIF.valor("datnemail",mail); 
				iNIF.valor("datnprov",codProv);
				iNIF.valor("datncodmun",codMuni);
				iNIF.valor("datnnommun",municipio);
				iNIF.valor("datncpost",codPostal);
				iNIF.valor("datntel",telefono1); 
				iNIF.valor("datntel2",telefono2); 
			}
		} 
		sEmpresaD.close();
		if (!hayTelefono) {
			sEmpresaD.execute("Select Telefono from EmpresasDomicilios where CodigoEmpresa="+codEmp+" and Telefono is not null and Telefono<>''  order by CodigoDireccion"); 
			if (sEmpresaD.next()) {
				String telefono1 = sEmpresaD.getString("Telefono");
				if (telefono1!=null && telefono1.length()>9) telefono1 = telefono1.substring(0,9);
				iNIF.valor("dattel",telefono1); 
				iNIF.valor("datftel",telefono1); 
			}
		}
		sEmpresaD.close();
		if (!existeFiscal) System.out.println ("De la empresa "+codEmp+"/"+empJcta+" no existe el domicilio fiscal ");
		return iNIF.execute();
	}
	
	private boolean initConver (int iEmp, int iEjerL, int empJconta, int iEjerJ, int mesInicio, String denif) {
		boolean bOk = true;
		pbf.setSecondaryPercent(0);
		pbf.setState("Convirtiendo LC: "+iEmp+"  JC:"+empJconta+" ("+iEjerJ+")  -  Preparando Conversión");
		if (bOk && esSQL && !funciones.checkBDSql(iEjerJ)) {
			bOk = false;
			sError = "Empresa general GEyCE (9999) no está en formato SQL Server.";			
		}
		String sHome = funciones.getHome();
		if (bOk && !esSQL && (sHome == null || sHome.length()==0)) {
			bOk = false;
			sError = "Variable HOME no encontrada ("+iEjerJ+")";			
		}
		if (bOk && (iEjerJ <= 0 || iEmp <= 0)) {
			bOk = false;
			sError = "Empresa - Ejercicio No definidos ";
		}
		if (bOk) {
			if (!esSQL) funciones.copiarFichero(sHome+"ctaspbase"+iEjerJ+".mdb",sHome+"ctasp"+Util.formateoNumero("000000",empJconta)+iEjerJ+".mdb",true);
		}

		if (bOk) {
			if (esSQL) dbJCta = funciones.getConexionCtasp ( 9999, iEjerJ );
			else dbJCta = funciones.getConectionJCO_ACCESS ( "ctasp"+Util.formateoNumero("000000",empJconta)+iEjerJ, sHome );
			bOk = (dbJCta!=null);
			if (!bOk) sError =" Error conexion dbJCta "+empJconta+"-"+iEjerJ;
		}
		String sNif = "";
		if (bOk) {
			sNif = denif;    
			if (sNif==null || sNif.trim().length()==0) {
				bOk = false; 
				sError = "Nif vacio ["+iEmp+"-"+iEjerJ+"]";
			}
		}
		if (bOk) {
			String razon = null;
			String NombrePersona = null;
			String PrimerApellido = null;
			String SegundoApellido = null;
			String LetrasEtiqueta = null;
			int IdTipoPersona = 0;

			SelectorLogic sEmp = new SelectorLogic (connLC);
			String sql = "Select * from EMPRESAS where EmpresaEstimaciones=0 and CodigoEmpresa="+iEmp;
			sEmp.execute(sql);
			if (sEmp.next()) {
				razon = (String)sEmp.getObject("Empresa");
				NombrePersona = (String)sEmp.getObject("NombrePersona");
				PrimerApellido = (String)sEmp.getObject("PrimerApellido");
				SegundoApellido = (String)sEmp.getObject("SegundoApellido");    
				LetrasEtiqueta = (String)sEmp.getObject("LetrasEtiqueta");    
				IdTipoPersona = sEmp.getint("IdTipoPersona");    
			}
			sEmp.close();

			String sNombreE = razon;
			if (sNombreE!=null && sNombreE.length()>40) sNombreE = sNombreE.substring(0,40);
			Selector scdp = new Selector (connEA);
			scdp.execute("Select * from CDP where cdpcodi='"+dominio.substring(0,6)+Util.formateoNumero("000000",empJconta)+"'");
			if (!scdp.next()) {
				Insert icdp = new Insert (connEA,"CDP");
				icdp.valor("cdpcodi",dominio.substring(0,6)+Util.formateoNumero("000000",empJconta));
				icdp.valor("cdpnifcif",sNif);
				icdp.valor("cdpckconta","S");
				if (esSQL) icdp.valor("cdpbdcomuconta","S");
				else icdp.valor("cdpbdcomuconta","N");
				icdp.valor("cdpdominio",dominio);
				bOk = icdp.execute();
				if (!bOk) sError = "Error al grabar CDP";
			}
			else {
				Update ucdp = new Update (connEA,"CDP");
				ucdp.valor("cdpckconta","S");
				if (esSQL) ucdp.valor("cdpbdcomuconta","S");
				else ucdp.valor("cdpbdcomuconta","N");
				ucdp.valor("cdpdominio",dominio);
				bOk = ucdp.execute("cdpcodi='"+dominio.substring(0,6)+Util.formateoNumero("000000",empJconta)+"'");
				if (!bOk) sError = "Error al actualizar CDP";
			}
			scdp.close();
			Selector sbdscargadas = new Selector (connEA);
			sbdscargadas.execute("SELECT * from BDSCARGADAS where bddominio='"+dominio.substring(0,6)+Util.formateoNumero("000000",empJconta)+"' and bdejer="+iEjerJ);
			if (bOk && !sbdscargadas.next()) {
				Insert ibds = new Insert (connEA,"BDSCARGADAS");
				ibds.valor("bdaplic","contaasp");
				ibds.valor("bddominio",dominio.substring(0,6)+Util.formateoNumero("000000",empJconta));
				ibds.valor("bdejer",iEjerJ);
				ibds.valor("bddesc","Contabilidad "+empJconta+" ejercicio "+iEjerJ);
				if (esSQL) {
					ibds.valor("bdtipo","sqlserver");
					ibds.valor("bdbdnom","ctasp"+iEjerJ);
					ibds.valor("bdbdserv",dbJCta.getDB().getServer());
					ibds.valor("bdbduser",dbJCta.getDB().getUser());
					ibds.valor("bdbdpass",dbJCta.getDB().getPassword());
				}
				else {
					ibds.valor("bdtipo","access");
					ibds.valor("bdbdnom","ctasp"+Util.formateoNumero("000000",empJconta)+iEjerJ);
					ibds.valor("bdbdserv",sHome);                        	  
				}
				ibds.valor("bdauxiliar","N");
				ibds.valor("bddisponible","S");
				ibds.valor("bdobser","Conversión Automática Logic Class - GEyCE JCONTA");
				bOk = ibds.execute();
				if (!bOk) sError = "Error al grabar BDSCARGADAS";
			}
			else if (bOk) {
				Update ubds = new Update (connEA,"BDSCARGADAS");
				if (esSQL) {
					ubds.valor("bdtipo","sqlserver");
					ubds.valor("bdbdnom","ctasp"+iEjerJ);
					ubds.valor("bdbdserv",dbJCta.getDB().getServer());
					ubds.valor("bdbduser",dbJCta.getDB().getUser());
					ubds.valor("bdbdpass",dbJCta.getDB().getPassword());
				}
				else {
					ubds.valor("bdtipo","access");
					ubds.valor("bdbdnom","ctasp"+Util.formateoNumero("000000",empJconta)+iEjerJ);
					ubds.valor("bdbdserv",sHome);                        	  
					ubds.setNull("bdbduser");
					ubds.setNull("bdbdpass");
				}      
				ubds.valor("bdauxiliar","N");
				ubds.valor("bddisponible","S");
				ubds.valor("bdobser","Conversión Automática Logic Class - GEyCE JCONTA");
				bOk = ubds.execute("bddominio='"+dominio.substring(0,6)+Util.formateoNumero("000000",empJconta)+"' and bdejer="+iEjerJ);
				if (!bOk) sError = "Error al actualizar BDSCARGADAS";
			}
			sbdscargadas.close();
			if (bOk) {
				Delete dnif = new Delete (connEA,"NIFES");
				dnif.execute("danifcif='"+sNif+"'");
				Selector sdan = new Selector (connEA);
				sdan.execute("Select * from NIFES where danifcif='"+sNif+"'");
				if (!sdan.next()) {
					String nombre = NombrePersona;
					String apellido1 = PrimerApellido;
					String apellido2 = SegundoApellido;
					String fisica = "J";
					if (Util.esCIFdePersonaFisica(sNif)) fisica = "F";
					if ("F".equals(fisica) && sNombreE!=null && apellido1==null) {
						String [] resultat = funciones.separaNom(sNombreE);
						nombre = resultat[2];
						apellido1 = resultat[0];
						apellido2 = resultat[1];
					}
					bOk = altaNIF(iEmp, empJconta,sNif, nombre, apellido1, apellido2,sNombreE, fisica, LetrasEtiqueta,String.valueOf(IdTipoPersona));
					if (!bOk) sError = "Error en altaNIF";
				}
				sdan.close();
			}
			if (bOk && esSQL) {
				BorrarDatosSQL borrsql = new BorrarDatosSQL (empJconta,iEjerJ,dbJCta);
				bOk = borrsql.eliminarDatos();
				if (!bOk) sError = borrsql.getError();
			}
			esPyme = true;
			// grabem Taula empresa i ejercicio i prefijos
			if (bOk) {
				Insert iemp = new Insert (dbJCta,"EMPRESA");
				iemp.valor("empcodigo",empJconta);
				iemp.valor("empgranemp","N");
				iemp.valor("emprecargo","N");
				iemp.valor("empivaigic","I");
				iemp.valor("empivagral","1");
				iemp.valor("empirpfgral","1");
				iemp.valor("empregimen","0");
				iemp.valor("empdescuadre","A");
				iemp.valor("empnegatius","S");
				iemp.valor("empcuadre","S");
				iemp.valor("empnif",sNif);
				iemp.valor("emptipocta","A");
				iemp.valor("emplonsub","12");
				iemp.valor("empexporta","N");
				iemp.valor("empestructura","PCG");
				iemp.valor("empgesfradup","F");
				if (iEjerJ>=2008) {
					iemp.valor("empcnvnpg","S");
					SelectorLogic spc = new SelectorLogic (connLC);
					spc.execute("Select * from PlanCuentas where CodigoEmpresa="+iEmp+" and CodigoCuenta>='8' and CodigoCuenta<='9'");
					if (spc.next()) {
						iemp.valor("emptipoeq","N");
						iemp.valor("empestructura","NPG");
						esPyme = false;
					}
					else {
						iemp.valor("emptipoeq","P");
						iemp.valor("empestructura","NPP");
					}
					spc.close();
				}
				bOk = iemp.execute();
				if (!bOk) sError = "Error al grabar tabla EMPRESA";
			}
			if (bOk) {
				Insert ieje = new Insert (dbJCta,"EJERCICIO");
				ieje.valor("ejeempresa",empJconta);
				ieje.valor("ejeejercicio",iEjerJ);
				ieje.valor("ejeasiento",2);
				ieje.valor("ejemes",mesInicio);
				ieje.valor("ejeinibal",100);
				ieje.valor("ejefinbal",5999);
				ieje.valor("ejeiniexp",600);
				ieje.valor("ejefinexp",7999);
				ieje.valor("ejeastoap",1);
				ieje.valor("ejesalida",1);
				bOk = ieje.execute();
				if (!bOk) sError = "Error al grabar tabla EJERCICIO";
			}
			if (bOk) { 
				try {
					dbJCta.executeUpdate("INSERT INTO prefijos (prfempresa, prfejercicio, prfaccion,prfprefijo1,prfprefijo2,prfprefijo3,prfprefijo4) VALUES ("+empJconta+","+iEjerJ+",'ADQ','4000','4100','400','410')");
					dbJCta.executeUpdate("INSERT INTO prefijos (prfempresa, prfejercicio, prfaccion,prfprefijo1,prfprefijo2,prfprefijo3,prfprefijo4) VALUES ("+empJconta+","+iEjerJ+",'ADR','4000','4100','400','410')");
					dbJCta.executeUpdate("INSERT INTO prefijos (prfempresa, prfejercicio, prfaccion,prfprefijo1,prfprefijo2,prfprefijo3,prfprefijo4) VALUES ("+empJconta+","+iEjerJ+",'COB','5700','5720','570','572')");
					dbJCta.executeUpdate("INSERT INTO prefijos (prfempresa, prfejercicio, prfaccion,prfprefijo1,prfprefijo2) VALUES ("+empJconta+","+iEjerJ+",'CLI','4300','430')");
					dbJCta.executeUpdate("INSERT INTO prefijos (prfempresa, prfejercicio, prfaccion,prfprefijo1,prfprefijo2) VALUES ("+empJconta+","+iEjerJ+",'ENR','4300','430')");
					dbJCta.executeUpdate("INSERT INTO prefijos (prfempresa, prfejercicio, prfaccion,prfprefijo1,prfprefijo2) VALUES ("+empJconta+","+iEjerJ+",'ENT','4300','430')");
					dbJCta.executeUpdate("INSERT INTO prefijos (prfempresa, prfejercicio, prfaccion,prfprefijo1,prfprefijo2) VALUES ("+empJconta+","+iEjerJ+",'IR','4770','477')");
					dbJCta.executeUpdate("INSERT INTO prefijos (prfempresa, prfejercicio, prfaccion,prfprefijo1,prfprefijo2) VALUES ("+empJconta+","+iEjerJ+",'IS','4720','472')");
					dbJCta.executeUpdate("INSERT INTO prefijos (prfempresa, prfejercicio, prfaccion,prfprefijo1,prfprefijo2,prfprefijo3,prfprefijo4,prfprefijo5,prfprefijo6,prfprefijo7,prfprefijo8) VALUES ("+empJconta+","+iEjerJ+",'PRO','4000','4100','1730','5230','400','410','173','523')");
					dbJCta.executeUpdate("INSERT INTO prefijos (prfempresa, prfejercicio, prfaccion,prfprefijo1,prfprefijo2,prfprefijo3,prfprefijo4) VALUES ("+empJconta+","+iEjerJ+",'110','4000','4100','400','410')");
					dbJCta.executeUpdate("INSERT INTO prefijos (prfempresa, prfejercicio, prfaccion,prfprefijo1,prfprefijo2,prfprefijo3,prfprefijo4) VALUES ("+empJconta+","+iEjerJ+",'115','4000','4100','400','410')");
					dbJCta.executeUpdate("DELETE FROM parametros where parejer="+iEjerJ);
					dbJCta.executeUpdate("INSERT INTO parametros (parejer, parlim1, parlim2, parlim3) VALUES ("+iEjerJ+",3005.06,300.51,6000)");
				}
				catch (Exception e) {
					System.out.println ("Exception "+e);
				}              
			}
			LONG_SBCTA = -1;
			augmentaLong4 = false;
			if (bOk) {
				SelectorLogic spc = new SelectorLogic (connLC);
				spc.execute("Select CodigoCuenta from PlanCuentas where CodigoEmpresa="+iEmp);
				LONG_SBCTA = -1;
				while (spc.next()) {      
					String CodigoCuenta = spc.getString("CodigoCuenta");
					if (CodigoCuenta!=null && LONG_SBCTA<CodigoCuenta.length()) LONG_SBCTA = CodigoCuenta.length() - 3;
				}
				spc.close();
			}
			if (bOk && iEjerJ==2012) {
				Iva2012 iv = new Iva2012(dbJCta);
				iv.inicializarProceso();
			}
			if (bOk) bOk = initHtIvaHtRet ();
		}
		if (!bOk && (sError==null || sError.trim().length()==0) ) sError = "Error NO DEFINIDO en initConver";
		return bOk;  
	}

	private boolean initHtIvaHtRet() {
		boolean bOk = true;
		if (bOk) {
			htRet = new java.util.Hashtable<Integer, TipoReten>();
			SelectorLogic scr = new SelectorLogic (connLC);
			scr.execute ("Select * from TiposRetencion");
			while (bOk && scr.next()) {
				int cod = scr.getint("CodigoRetencion");
				double por = scr.getdouble("%Retencion");
				TipoReten t = new TipoReten(cod,por, scr.getString("ClaveIrpf"));
				Selector sirpf = new Selector (dbJCta);
				sirpf.execute("Select * from IRPF where irpporcen="+por);
				if (sirpf.next()) t.setCodJC(sirpf.getint("irpcodigo"));
				else {
					int codirpf = funciones.getNextIRPF (dbJCta);
					Insert i = new Insert (dbJCta,"IRPF");
					i.valor("irpcodigo",codirpf);
					i.valor("irpporcen",por);
					bOk = i.execute();
					if (!bOk) sError = "Error al grabar tabla IRPF";
					t.setCodJC(codirpf);
				}
				sirpf.close();
				htRet.put(new Integer(cod),t);
			}
			scr.close();
		}
		if (bOk) {
			htIva = new java.util.Hashtable<Integer, TipoIVA>();
			SelectorLogic scr = new SelectorLogic (connLC);
			scr.execute ("Select * from TiposIva");
			while (bOk && scr.next()) {
				int cod = scr.getint("CodigoIva");
				double por = scr.getdouble("%Iva");
				double porr = scr.getdouble("%RecargoEquivalencia");
				TipoIVA t = new TipoIVA(cod,por, porr);
				Selector siva = new Selector (dbJCta);
				siva.execute("Select * from IVA where ivatipo='I' and ivaiva="+por+" and ivarec="+porr);
				if (siva.next()) t.setCodJC(siva.getint("ivacodigo"));
				else {
					int codiva = funciones.getNextIVA (dbJCta);
					Insert i = new Insert (dbJCta,"IVA");
					i.valor("ivacodigo",codiva);
					i.valor("ivatipo","I");
					i.valor("ivaiva",por);
					i.valor("ivarec",porr);
					bOk = i.execute();
					if (!bOk) sError = "Error al grabar tabla IVA";

					t.setCodJC(codiva);
				}
				siva.close();
				htIva.put(new Integer(cod),t);
			}
			scr.close();
		}
		return bOk;
	}

	private boolean grabarDatosBancarios (int emp, int empJconta, int iEjerJ) {
		boolean bOk = true;
		pbf.setSecondaryPercent(0);
		pbf.setState("Convirtiendo LC: "+emp+"  JC:"+empJconta+" ("+iEjerJ+")  -  Datos Bancarios");

		SelectorLogic s = new SelectorLogic (connLC);
		s.execute("Select * from BancosConta,Bancos where CodigoEmpresa="+emp+" and (Bancos.CodigoBanco is null or BancosConta.CodigoBanco=Bancos.CodigoBanco)");
		while (bOk && s.next()) {
			String banco = s.getString("CodigoBanco");
			String oficina = s.getString("CodigoOficina");
			String dc = s.getString("DigitoControl");
			String numero = s.getString("CuentaCorriente");
			if (banco!=null && oficina!=null && dc!=null && Util.isNumero(banco) && Util.isNumero(oficina) && Util.isNumero(dc) && numero!=null && numero.length()>0) {
				int banc = Integer.parseInt(banco);
				Selector sbanc = new Selector (connEA);
				sbanc.execute("Select * from BANCO where bncodigo="+banc);
				if (!sbanc.next()) {
					Insert ibanc = new Insert (connEA,"BANCO");
					ibanc.valor("bncodigo",banc);
					String desc = s.getString("Banco");
					if (desc==null) desc = "BANCO CONVERSION";
					ibanc.valor("bndesc",desc);
					bOk = ibanc.execute();
				}
				sbanc.close();
				Selector sch = new Selector (connEA);
				sch.execute("Select * from BANCOCLI where bcccodigo='"+dominio.substring(0,6)+Util.formateoNumero("000000",empJconta)+"' and "+
						" bccbanco="+banc+" and bccsucursal="+Integer.parseInt(oficina)+" and bccnumero='"+numero+"' and bccdigitos="+Integer.parseInt(dc));
				if (!sch.next()) {
					Insert i = new Insert (connEA,"BANCOCLI");
					i.valor("bcccodigo",dominio.substring(0,6)+Util.formateoNumero("000000",empJconta));
					i.valor("bccbanco",banc);
					i.valor("bccsucursal",Integer.parseInt(oficina));
					i.valor("bccnumero",numero);
					i.valor("bccdigitos",Integer.parseInt(dc));
					i.valor("bccdominio",dominio);
					bOk = i.execute ();
				}
				sch.close();
				sch = new Selector (connEA);
				sch.execute("Select * from ASIGNACIONES where abacodigo='"+dominio.substring(0,6)+Util.formateoNumero("000000",empJconta)+"'");
				if (!sch.next()) {
					Insert i = new Insert (connEA,"ASIGNACIONES");
					i.valor("abacodigo",dominio.substring(0,6)+Util.formateoNumero("000000",empJconta));
					i.valor("abatipo","110");
					i.valor("ababanco",banc);
					i.valor("absucursal",Integer.parseInt(oficina));
					i.valor("abnumero",numero);
					i.valor("abadigito",Integer.parseInt(dc));
					bOk = i.execute ();
					i = new Insert (connEA,"ASIGNACIONES");
					i.valor("abacodigo",dominio.substring(0,6)+Util.formateoNumero("000000",empJconta));
					i.valor("abatipo","130");
					i.valor("ababanco",banc);
					i.valor("absucursal",Integer.parseInt(oficina));
					i.valor("abnumero",numero);
					i.valor("abadigito",Integer.parseInt(dc));
					bOk = i.execute ();
					i = new Insert (connEA,"ASIGNACIONES");
					i.valor("abacodigo",dominio.substring(0,6)+Util.formateoNumero("000000",empJconta));
					i.valor("abatipo","300");
					i.valor("ababanco",banc);
					i.valor("absucursal",Integer.parseInt(oficina));
					i.valor("abnumero",numero);
					i.valor("abadigito",Integer.parseInt(dc));
					bOk = i.execute ();
				}
				sch.close();
			}
		} 
		s.close();
		if (!bOk) sError = "Error en funcion grabarDatosBancarios.";
		return bOk;
	}

	private boolean grabarActividades (int emp, int empJconta, int iEjerJ) {
		boolean bOk = true;
		pbf.setSecondaryPercent(0);
		pbf.setState("Convirtiendo LC: "+emp+"  JC:"+empJconta+" ("+iEjerJ+")  -  Actividades");
		SelectorLogic s = new SelectorLogic (connLC);
		s.execute("Select * from Actividades where CodigoEmpresa="+emp+" order by ClaveActividad");
		while (bOk && s.next()) {
			String actactividad = s.getString("CodigoActividad");
			if (actactividad != null && actactividad.trim().length()>0) {
				Insert i = new Insert (dbJCta,"ACTIVIDADES");
				i.valor("actempresa",empJconta);
				i.valor("actactividad",actactividad);
				String tipoEp = s.getString("TipoEpigrafe");
				int cla = 1;
				if ("P".equals(tipoEp)) cla = 2;
				i.valor("actclave",cla);
				String arrepi = s.getString("CodigoEpigrafe");
				if (arrepi!=null && arrepi.length()==4) arrepi = arrepi.substring(0,3)+"."+arrepi.substring(3,4);
				i.valor("actepigrafe",arrepi);
				if ("1".equals(actactividad)) i.valor("actprincipal","S");
				else i.valor("actprincipal","N");
				bOk = i.execute ();
			}
		}
		s.close();
		if (!bOk) sError = "Error en funcion grabarActividades";
		return bOk;
	}

	private boolean grabarRepresentantes (int emp, int empJconta, int iEjerJ) {
		boolean bOk = true;
		pbf.setSecondaryPercent(0);
		pbf.setState("Convirtiendo LC: "+emp+"  JC:"+empJconta+" ("+iEjerJ+")  -  Representantes");

		String sqlrep = "SELECT * FROM  CargosFiscalHistorico INNER JOIN "+
				"Personas ON CargosFiscalHistorico.GuidPersona = Personas.GuidPersona "+
				"where    (CargosFiscalHistorico.CargoFechaHasta IS NULL) and CodigoEmpresa="+emp;

		SelectorLogic s = new SelectorLogic (connLC);
		s.execute(sqlrep);
		while (bOk && s.next()) {
			String nif = s.getString("Dni");
			SelectorLogic snif = new SelectorLogic (connLC);
			String sqlnif = "SELECT * FROM  PersonasDomicilios where  Dni='"+nif+"'";
			snif.execute(sqlnif);
			boolean addNewDone = false;
			Insert inif = new Insert (connEA,"NIFES");
			while (bOk && snif.next()) {
				if (!addNewDone) {
					Delete dnifes = new Delete (connEA,"NIFES");
					bOk = dnifes.execute("danifcif='"+nif+"'");
					addNewDone = true;
					inif.valor("danifcif",nif);
					inif.valor("datipo","R");
					String apellido1 = s.getString("PrimerApellidoEmpleado"); 
					String apellido2 = s.getString("SegundoApellidoEmpleado"); 
					String nombre = s.getString("NombreEmpleado");  
					if (apellido1==null || apellido1.trim().length()==0) { 
						if (Util.esCIFdePersonaFisica(nif)) { 
							String [] resultat = funciones.separaNom(s.getString("RazonSocialEmpleado")); 
							nombre = resultat[2]; 
							apellido1 = resultat[0]; 
							apellido2 = resultat[1]; 
						} 
						else apellido1 = s.getString("RazonSocialEmpleado"); 
					}  
					inif.valor("datnombre",nombre);
					inif.valor("datapell1",apellido1);
					inif.valor("datapell2",apellido2);
					inif.valor("datdominio",dominio);
					inif.valor("datfisicajuri",s.getString("PersonaFisicaJuridica"));
				}
				String CodDirPer = snif.getString("CodigoDireccionPersona");

				String TelefonoMovil = getSelString(snif, "TelefonoMovil");
				String Telefono = getSelString(snif, "Telefono");
				String Fax = getSelString(snif, "Fax");
				if (TelefonoMovil!=null && TelefonoMovil.length()>9) TelefonoMovil = TelefonoMovil.substring(0,9);
				if (Telefono!=null && Telefono.length()>9) Telefono = Telefono.substring(0,9);
				if (Fax!=null && Fax.length()>9) Fax = Fax.substring(0,9);

				if (TelefonoMovil!=null && !Util.isNumero(TelefonoMovil)) TelefonoMovil = null;
				if (Telefono!=null && !Util.isNumero(Telefono)) Telefono = null;
				if (Fax!=null && !Util.isNumero(Fax)) Fax = null;

				String Numero1 = getSelString(snif, "Numero1");
				if (Numero1 == null || !Util.isNumero(Numero1)) Numero1 = null;
				if ("FIS".equals(CodDirPer)) {
					inif.valor("datsiglas",getSelString(snif, "CodigoSigla"));
					inif.valor("datvia",getSelString(snif, "ViaPublica"));
					inif.valor("datnum",getSelString(snif, "Numero1"));
					inif.valor("datesc",getSelString(snif, "Escalera"));
					inif.valor("datpiso",getSelString(snif, "Piso"));
					inif.valor("datletra",getSelString(snif, "Letra"));
					inif.valor("datcpos",getSelString(snif, "CodigoPostal"));
					String CodigoProvincia = getSelString(snif, "CodigoProvincia");
					if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) inif.valor("datprov",CodigoProvincia.trim());
					String CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
					if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) {
						Selector smun = new Selector (connEA);
						smun.execute("Select * from MUNI347 where mu7provmuni='"+CodigoMunicipio+"'");
						if (smun.next()) {
							int mu7muniant = smun.getint("mu7muniant");
							if (mu7muniant!=0) inif.valor("datmuni",mu7muniant);
							else inif.valor("datmuni",CodigoMunicipio.substring(2));
						}
						smun.close();
					}

					inif.valor("datpobla",getSelString(snif, "Municipio"));
					inif.valor("datmovil",TelefonoMovil);
					inif.valor("dattel",Telefono);
					inif.valor("datfax",Fax);

					Selector stv = new Selector (connEA);
					stv.execute("Select * from TIPOVIAS where tvscodant='"+getSelString(snif, "CodigoSigla")+"'");
					if (stv.next())  inif.valor("datfftvia",stv.getString("tvscodigo"));
					stv.close();

					inif.valor("datfvia",getSelString(snif, "ViaPublica"));
					inif.valor("datftnum","NUM");
					inif.valor("datfnum",Numero1);
					inif.valor("datfescal",getSelString(snif, "Escalera"));
					inif.valor("datfplanta",getSelString(snif, "Piso"));
					inif.valor("datfpuerta",getSelString(snif, "Letra"));
					inif.valor("datfcpost",getSelString(snif, "CodigoPostal"));
					CodigoProvincia = getSelString(snif, "CodigoProvincia");
					if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) inif.valor("datfprov",CodigoProvincia.trim());
					CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
					if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) inif.valor("datfcodmun",CodigoMunicipio);
					inif.valor("datfnommun",getSelString(snif, "Municipio"));
					inif.valor("datflocal",getSelString(snif, "Municipio"));
					inif.valor("datfmovil",TelefonoMovil);
					inif.valor("datftel",Telefono);
					inif.valor("datffax",Fax);
				}
				else if ("SOC".equals(CodDirPer)) {
					inif.valor("datsvia",getSelString(snif, "ViaPublica"));
					inif.valor("datstnum","NUM");
					inif.valor("datsnum",Numero1);
					inif.valor("datsescal",getSelString(snif, "Escalera"));
					inif.valor("datsplanta",getSelString(snif, "Piso"));
					inif.valor("datspuerta",getSelString(snif, "Letra"));
					inif.valor("datscpost",getSelString(snif, "CodigoPostal"));
					String CodigoProvincia = getSelString(snif, "CodigoProvincia");
					if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) inif.valor("datsprov",CodigoProvincia.trim());
					String CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
					if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) inif.valor("datscodmun",CodigoMunicipio);
					inif.valor("datsnommun",getSelString(snif, "Municipio"));
					inif.valor("datslocal",getSelString(snif, "Municipio"));

					inif.valor("datsmovil",TelefonoMovil);
					inif.valor("datstel",Telefono);
					inif.valor("datsfax",Fax);
				}
				else if ("ENV".equals(CodDirPer)) {
					inif.valor("datnvia",getSelString(snif, "ViaPublica"));
					inif.valor("datntnum","NUM");
					inif.valor("datnnum",Numero1);
					inif.valor("datnescal",getSelString(snif, "Escalera"));
					inif.valor("datnplanta",getSelString(snif, "Piso"));
					inif.valor("datnpuerta",getSelString(snif, "Letra"));
					inif.valor("datncpost",getSelString(snif, "CodigoPostal"));
					String CodigoProvincia = getSelString(snif, "CodigoProvincia");
					if (CodigoProvincia!=null && Util.isNumero(CodigoProvincia.trim())) inif.valor("datnprov",CodigoProvincia.trim());
					String CodigoMunicipio = getSelString(snif, "CodigoMunicipio");
					if (CodigoMunicipio!=null && Util.isNumero(CodigoMunicipio.trim()) && CodigoMunicipio.trim().length()==5) inif.valor("datncodmun",CodigoMunicipio);
					inif.valor("datnnommun",getSelString(snif, "Municipio"));
					inif.valor("datnlocal",getSelString(snif, "Municipio"));
					inif.valor("datnmovil",TelefonoMovil);
					inif.valor("datntel",Telefono);
					inif.valor("datnfax",Fax);
				}
			}
			snif.close();
			if (addNewDone) bOk = inif.execute();
			String cargo = s.getString("CargoAdministrador");
			Selector sch = new Selector (connEA);
			sch.execute("Select * from REPRESENTANTES where repcodigo='"+dominio.substring(0,6)+Util.formateoNumero("000000",empJconta)+"' and repnifcif='"+nif+"'");
			if (bOk && !sch.next()) {
				Insert i = new Insert (connEA,"REPRESENTANTES");
				i.valor("repcodigo",dominio.substring(0,6)+Util.formateoNumero("000000",empJconta));
				i.valor("repnifcif",nif);      
				i.valor("repadministrado","N");
				i.valor("repsecretario","N");
				i.valor("repsocios","N");
				i.valor("reppresentante","N");
				i.valor("repreplegal","N");
				i.valor("represidente","N");
				i.valor("repfirma","N");
				boolean esadmin = s.getint("Administrador")!=0;
				boolean esrepre = s.getint("RepresentanteEntidad")!=0;
				if (esadmin) {
					i.valor("repadministrado","S");
					i.valor("repfirma","S");
				}
				if (esrepre) {
					i.valor("reppresentante","S");
					i.valor("repreplegal","S");
					i.valor("repfirma","S");
				}
				if (cargo != null && cargo.toUpperCase().startsWith("SECRE")) {
					i.valor("repsecretario","S");
				}
				java.util.Date FechaPoderInicio = s.getDate("FechaPoderInicio");
				if (FechaPoderInicio!=null) i.valor("repfechapoder",FechaPoderInicio); 
				else i.valor("repfechapoder",s.getDate("CargoFechaDesde")); 
				i.valor("repvtopoder",s.getDate("FechaPoderFin"));
				i.valor("repnotaria",s.getString("Notaria"));
				i.valor("repdominio",dominio);
				bOk = i.execute ();
			}
			sch.close();
		} 
		s.close();
		if (!bOk) sError = "Error en funcion grabarActividades";
		return bOk;
	}

	private String getSelString(SelectorLogic s, String c) {	
		return getSelString(s, c, 0);
	}
	private String getSelString(SelectorLogic s, String campo, int longitud) {
		String sTmp = null;
		Object oTmp = s.getObject(campo);
		if (oTmp!=null) {
			sTmp = (String)oTmp;
			sTmp = sTmp.trim();
			if (sTmp.length()==0) sTmp = null;
			else if (longitud>0 && sTmp.length()>longitud) sTmp = sTmp.substring(0,longitud);
		}
		return sTmp;
	}
	private boolean initDatos(int iEmp, int iEjerL, int empJconta, int iEjerJ) {
		boolean bOk = true;	
		if (bOk) bOk = grabarDatosBancarios (iEmp, empJconta, iEjerJ);
		if (bOk) bOk = grabarActividades (iEmp, empJconta, iEjerJ);
		if (bOk) bOk = grabarRepresentantes (iEmp, empJconta, iEjerJ);
		if (asigProy) grabarProyectos (iEmp, empJconta, iEjerJ);
		return true;
	}
	private boolean grabarProyectos (int iEmp, int empJconta, int iEjerJ) {
		boolean bOk = true;
		pbf.setSecondaryPercent(0);
		pbf.setState("Convirtiendo LC: "+iEmp+"  JC:"+empJconta+" ("+iEjerJ+")  -  Proyectos (Canales)");
		SelectorLogic s=new SelectorLogic (connLC);
		s.execute("Select * from CanalesEmpresa where CodigoEmpresa="+iEmp+" and CodigoCanal is not null");
		while (bOk && s.next()) {
			String CodigoCanal = s.getString("CodigoCanal");
			if (CodigoCanal!=null && CodigoCanal.trim().length()>0) {
				String Canal = s.getString("Canal");
				if (Canal==null) Canal = "";
				if (Canal.length()>30) Canal = Canal.substring(0,30);
				Insert i = new Insert (dbJCta,"PROYECTOS");
				i.valor("proempresa",empJconta);
				i.valor("proproyecto",CodigoCanal.trim());
				i.valor("prodesc",Canal);
				bOk = i.execute();
			}
		}
		s.close();
		if (!bOk) sError = "Error en funcion grabarActividades";
		return bOk;
	}
	private boolean checkProyecto (String codigo, int emp) {
		boolean bOk = true;
		Selector s=new Selector (dbJCta);
		s.execute("Select * from PROYECTOS where proproyecto='"+codigo+"' and proempresa="+emp);
		if (!s.next()) {
			Insert i = new Insert (dbJCta,"PROYECTOS");
			i.valor("proempresa",emp);
			i.valor("proproyecto",codigo);
			i.valor("prodesc","Descripción "+codigo);
			bOk = i.execute();
		}
		s.close();
		if (!bOk) sError = "Error grabando proyecto ("+codigo+")";
		return bOk;
	}

	private boolean initHTGrupos (int iEmp) {
		boolean bOk = true;
		htGrupos = new java.util.Hashtable <String,String> ();
		
		SelectorLogic spctas = new SelectorLogic (connLC);
		spctas.execute ("Select * from Grupos where TipoPlanCuenta=2008 and CodigoEmpresa="+iEmp+" AND DescripcionGrupo is not null order by CodigoGrupo");
		while (spctas.next() && bOk) {
			String sCta  = spctas.getString("CodigoGrupo");
			if (sCta!=null) sCta = sCta.trim();
			else sCta = "";
			if (!Util.isNumero(sCta)) sCta = "";
			String sDesc = spctas.getString("DescripcionGrupo");
			if (sDesc!=null) sDesc = sDesc.trim();
			else sDesc = "";
			if (sCta.length()==3 || sCta.length()==4) {
				htGrupos.put(sCta,sDesc);
			}
		}
		spctas.close();
		
		if (bOk) {
			augmentaLong4 = false;
			SelectorLogic spc = new SelectorLogic (connLC);
			spc.execute("Select CodigoCuenta from PlanCuentas where CodigoEmpresa="+iEmp);
			while (spc.next()) {      
				String CodigoCuenta = spc.getString("CodigoCuenta");
				if ("4".equals(longCta) ) {  
					if (CodigoCuenta != null && CodigoCuenta.length()>4) {
						String ctaMayor = CodigoCuenta.substring(0, 4);
						if (!Util.isNumero(ctaMayor.substring(3, 4))) augmentaLong4 = true;
						else if (!htGrupos.containsKey(ctaMayor) && htGrupos.containsKey(ctaMayor.substring(0,3)+"0")) augmentaLong4 = true;
						else if (!htGrupos.containsKey(ctaMayor) && htGrupos.containsKey(ctaMayor.substring(0,3))) augmentaLong4 = true;
						else if (
								CodigoCuenta.length()>=11 && 
								Util.esNIF(CodigoCuenta.substring(CodigoCuenta.length()-9,CodigoCuenta.length())) == 0 &&
								("400".equals(CodigoCuenta.substring(0, 3)) || "430".equals(CodigoCuenta.substring(0, 3)) ) 
							) {
							augmentaLong4 = true;
						}
					}
				}
			}
			spc.close();
		}
		return bOk;
	}
	private boolean importarPC (int iEmp, int iEjerL, int empJconta, int iEjerJ) {
		boolean bOk = true;
		ctaMayor = new java.util.Vector <String> ();
		pbf.setSecondaryPercent(0);
		pbf.setState("Convirtiendo LC: "+iEmp+"  JC:"+empJconta+" ("+iEjerJ+")  -  Plan cuentas");
		if (bOk) {
			bOk = initHTGrupos(iEmp);
			for (Enumeration<String> e = htGrupos.keys();e.hasMoreElements();) {
				String cta = e.nextElement();
				String desc = htGrupos.get(cta);
				if (cta.length()==4 && "4".equals(tipoCta) ) checkMayor(empJconta, iEjerJ, cta, desc);
				else if (cta.length()==3 && "4".equals(tipoCta) && !htGrupos.containsKey(cta+"0")) checkMayor(empJconta, iEjerJ, cta+"0", desc);
				else if (cta.length()==3 && "3".equals(tipoCta)) checkMayor(empJconta, iEjerJ, cta, desc);
				else if ("V".equals(tipoCta)) {
					if (cta.length()==4) checkMayor(empJconta, iEjerJ, cta, desc);
					else if (cta.length()==3 && !htGrupos.containsKey(cta+"0")) checkMayor(empJconta, iEjerJ, cta, desc);
				}				
			}
			
			
			int numTotal = 0;
			SelectorLogic spctast = new SelectorLogic (connLC);
			spctast.execute ("Select count(*) as num from PlanCuentas where Cuenta is not null and CodigoEmpresa="+iEmp);
			if (spctast.next()) numTotal = spctast.getint("num");
			spctast.close();
			int numActual = 0;
			SelectorLogic spctas = new SelectorLogic (connLC);
			spctas.execute ("Select * from PlanCuentas where Cuenta is not null and CodigoEmpresa="+iEmp+" order by CodigoCuenta");
			while (bOk && spctas.next()) {
				pbf.setSecondaryPercent((++numActual)*100/numTotal);
				String sCta  = spctas.getString("CodigoCuenta");
				String sDesc = spctas.getString("Cuenta");
				if (sDesc!=null && sDesc.trim().length()>0) sDesc = sDesc.trim();
				else sDesc = "  ";
				String cta = "";
				String subcta = "";
				String [] ctafull = getFormatoCuenta (sCta);
				if (ctafull!=null) {
					cta = ctafull[0];
					subcta = ctafull[1];
					if (cta!=null && subcta!=null && cta.trim().length()>=3 && cta.trim().length()<=4 && subcta.length()>0 && !"0".equals(subcta)) {
						Selector spcu = new Selector (dbJCta);
						spcu.execute("Select * from PCUENTAS where pcuempresa="+empJconta+" and pcuejercicio="+iEjerJ+" and pcucuenta='"+cta+"' and pcusubcuenta='0'");
						if (!spcu.next()) {
							Insert ipcu = new Insert (dbJCta,"PCUENTAS");
							ipcu.valor("pcuempresa",empJconta);
							ipcu.valor("pcuejercicio",iEjerJ);
							ipcu.valor("pcucuenta",cta);
							ipcu.valor("pcusubcuenta","0");
							String descMayor = sDesc;
							if (htGrupos.get(cta)!=null) descMayor = htGrupos.get(cta);
							if (descMayor==null ||descMayor.trim().length()==0) descMayor = "<sin descripcion>";
							ipcu.valor("pcudesc",descMayor);
							ipcu.valor("pculongitud",12);
							ipcu.valor("pcumediacion","N");
							ipcu.valor("pcuivaded","S");
							ipcu.valor("pcu347","N");
							ipcu.valor("pcu349","N");
							bOk = ipcu.execute();
							if (!bOk) sError = "Error al grabar en PCUENTAS Mayor 3 y 4";
						}
						spcu.close();
						Selector slook = new Selector (dbJCta);
						slook.execute("Select * from PCUENTAS where pcuempresa="+empJconta+" and pcuejercicio="+iEjerJ+" and pcucuenta='"+cta+"' and pcusubcuenta='"+subcta+"'");
						if (!slook.next() && bOk) {
							Insert ipcu = new Insert (dbJCta,"PCUENTAS");
							ipcu.valor("pcuempresa",empJconta);
							ipcu.valor("pcuejercicio",iEjerJ);
							ipcu.valor("pcucuenta",cta);
							ipcu.valor("pcusubcuenta",subcta);
							if (sDesc==null ||sDesc.trim().length()==0) sDesc = "<sin descripcion>";
							ipcu.valor("pcudesc",sDesc);          
							ipcu.valor("pculongitud",12);
							bOk = ipcu.execute();
							if (!bOk) sError = "Error al grabar en PCUENTAS "+sCta;
						}
						slook.close();  

					}
				}
			}
			spctas.close();

			
			if (bOk) bOk = actualizarClientesConta (iEmp, empJconta, iEjerJ, true);
		}
		return bOk;
	}
	
	private boolean actualizarClientesConta (int iEmp, int empJconta, int iEjerJ, boolean actualizarNif) {
		boolean bOk = initHTGrupos(iEmp);
		if (bOk) bOk = initHtIvaHtRet ();
		int numTotal = 0;
		int numActual = 0;
		pbf.setSecondaryPercent(0);
		pbf.setState("Actualizando Clientes y Proveedor LC: "+iEmp+"  JC:"+empJconta+" ("+iEjerJ+")  -  Plan cuentas");
		SelectorLogic spctast = new SelectorLogic (connLC);
		spctast.execute ("Select count(*) as num from ClientesConta where CodigoEmpresa="+iEmp);
		if (spctast.next()) numTotal = spctast.getint("num");
		spctast.close();
		
		SelectorLogic sclipro = new SelectorLogic (connLC);
		sclipro.execute ("Select * from ClientesConta where CodigoEmpresa="+iEmp+" order by CodigoCuenta");
		while (bOk && sclipro.next()) {
			pbf.setSecondaryPercent((++numActual)*100/numTotal);
			String sCta  = sclipro.getString("CodigoCuenta");
			String sNif = sclipro.getString("CifDni"); 
			String CifEuropeo = sclipro.getString("CifEuropeo");
			boolean esGuiri =     false;
			if (sNif !=null) sNif = sNif.trim();
			if (sNif!=null && sCta!=null && sCta.trim().length()>=5 )  {
				SelectorLogic snifclipro = new SelectorLogic (connLC);
				snifclipro.execute("Select * from ClientesProveedores where CifDni='"+sNif+"'");
				if (actualizarNif && snifclipro.next()) {
					int datpais = snifclipro.getint("CodigoNacion");    
					esGuiri = datpais != 0 && datpais != 108 && CifEuropeo!=null && CifEuropeo.length()>2 && !CifEuropeo.startsWith("ES");
					Selector snifes = new Selector (connEA);
					snifes.execute("Select * from NIFES where danifcif='"+sNif+"'");
					if (!snifes.next()) {
						String ape1 = getSelString(snifclipro,"ClienteProveedor");
						if (ape1!=null && ape1.trim().length()>0) {
							Insert inif = new Insert (connEA,"NIFES");
							inif.valor("danifcif",sNif);
							inif.valor("datipo","C");
							inif.valor("datapell1",ape1);
							inif.valor("datdominio",dominio);
							String fisicajur = getSelString(snifclipro,"PersonaFisicaJuridica");
							if (!"J".equals(fisicajur) && !"F".equals(fisicajur)) {
								fisicajur = "J";                      
								if (Util.esCIFdePersonaFisica(sNif)) fisicajur = "F";
							}
							inif.valor("datfisicajuri",fisicajur);
							inif.valor("datsiglas",getSelString(snifclipro,"CodigoSigla"));
							inif.valor("datvia",getSelString(snifclipro,"ViaPublica"));
							inif.valor("datnum",getSelString(snifclipro,"Numero1"));
							inif.valor("datesc",getSelString(snifclipro,"Escalera"));
							inif.valor("datpiso",getSelString(snifclipro,"Piso"));
							inif.valor("datletra",getSelString(snifclipro,"Letra"));
							inif.valor("datcpos",getSelString(snifclipro,"CodigoPostal"));
							if (datpais!=0) inif.valor("datpais",datpais);


							String muntmp = getSelString(snifclipro,"CodigoMunicipio");
							String cmu = getSelString(snifclipro,"Municipio");
							String colam = getSelString(snifclipro,"ColaMunicipio");
							if (muntmp!=null && muntmp.trim().length()>0) {
								SelectorLogic smu = new SelectorLogic(connLC);
								smu.execute ("Select * from Municipios where CodigoMunicipio='"+muntmp+"'");
								if (smu.next()) cmu = smu.getString("Municipio");
								smu.close();
							}
							if (colam!=null && colam.trim().length()>0 && cmu!=null && cmu.trim().length()>0) cmu = cmu+" "+colam;
							if (cmu!=null && cmu.trim().length()>0) inif.valor("datpobla",cmu);
							if (muntmp!=null && muntmp.trim().length()==5) muntmp = muntmp.substring(2);
							if (muntmp!=null && Util.isNumero(muntmp)) inif.valor("datmuni",muntmp);
							String provtmp = getSelString(snifclipro,"CodigoProvincia");
							if (provtmp!=null && Util.isNumero(provtmp)) inif.valor("datprov",provtmp);
							String tel = getSelString(snifclipro,"Telefono");
							if (tel!=null) inif.valor("dattel",tel);
							tel = getSelString(snifclipro,"Fax");
							if (tel!=null) inif.valor("datfax",tel);
							tel = getSelString(snifclipro,"Email1");
							if (tel!=null) inif.valor("datemail",tel);
							bOk = inif.execute();
							if (!bOk) sError = "Error al actualizar Clientes / Proveedores ("+sCta+")";
						}
					} 
					snifes.close();
				}
				snifclipro.close();


				sCta = sCta.trim();
				String cta = "";
				String subcta = "";
				String [] ctafull = getFormatoCuenta (sCta);
				if (ctafull!=null) {
					cta = ctafull[0];         
					subcta = ctafull[1];  
					Update u = new Update(dbJCta,"PCUENTAS");
					String clipro = getSelString(sclipro,"ClienteOproveedor");
					u.valor("pcuclipro",clipro);
					u.valor("pcuivaded","S");
					u.valor("pcumediacion","N");

					int CodigoIva = sclipro.getint("CodigoIva");
					if (CodigoIva>0) {
						TipoIVA ti = htIva.get(new Integer(CodigoIva));
						if (ti!=null && ti.codJC>0) u.valor("pcucodiva",ti.codJC); 
						else u.valor("pcucodiva",1);
					}

					int CodigoRetencion = sclipro.getint("CodigoRetencion");
					if (CodigoRetencion>0) {
						TipoReten tr = htRet.get(new Integer(CodigoRetencion));
						if (tr!=null && tr.codJC>0) u.valor("pcucodirpf",tr.codJC); 
						else u.valor("pcucodirpf",1);
					}
					u.valor("pcuivaded","S");
					if (esGuiri) {
						u.valor("pcu347","N");
						u.valor("pcu349","S");
					}
					else {
						u.valor("pcu347","S");
						u.valor("pcu349","N");
					}
					
					int CriterioIva = sclipro.getint("CriterioIva");
					if (CriterioIva == 2) u.valor("pcurecc","S");
					else u.valor("pcurecc","N");
					
					if ("C".equals(clipro)) u.valor("pcuttrans","EIN");
					else u.valor("pcuttrans","RIN");
					u.valor("pcunif",sNif);
					String Contrapartida = getSelString(sclipro,"Contrapartida");
					if (Contrapartida!=null && Contrapartida.length()>0) {
						String [] ctacontra = getFormatoCuenta (Contrapartida);
						if (ctacontra!=null) Contrapartida = ctacontra[0]+"."+ctacontra[1];
						if (Contrapartida!=null && Contrapartida.length()>0) u.valor("pcucontralapiz",Contrapartida);
					}
					int NumeroPlazos = sclipro.getint("NumeroPlazos");
					int DiasFijos1 = sclipro.getint("DiasFijos1");
					int DiasPrimerPlazo = sclipro.getint("DiasPrimerPlazo");
					int DiasEntrePlazos = sclipro.getint("DiasEntrePlazos");
					
					if (DiasFijos1 != 0) u.valor("pcuvtopridia", DiasFijos1);
					if (NumeroPlazos >= 1) u.valor("pcudias1", DiasPrimerPlazo);
					if (NumeroPlazos >= 2) u.valor("pcudias2", DiasPrimerPlazo+DiasEntrePlazos);
					if (NumeroPlazos >= 3) u.valor("pcudias3", DiasPrimerPlazo+2*DiasEntrePlazos);
					if (NumeroPlazos >= 4) u.valor("pcudias4", DiasPrimerPlazo+3*DiasEntrePlazos);
					if (NumeroPlazos >= 5) u.valor("pcudias5", DiasPrimerPlazo+4*DiasEntrePlazos);
					
					int CodigoTipoEfecto = sclipro.getint("CodigoTipoEfecto");
					if (CodigoTipoEfecto != 0) u.valor("pcucobpagfp", CodigoTipoEfecto);

					bOk = u.execute("pcuempresa="+empJconta+" and pcuejercicio="+iEjerJ+" and pcucuenta='"+cta+"' and pcusubcuenta='"+subcta+"'");
					if (!bOk) sError = "Error al acutalizar NIF C/P ("+sNif+")";
				}
			}          
		}
		sclipro.close();
		
		return bOk;
	}


	private String[] getFormatoCuenta (String cta) {
		String [] tmp = null;
		if ("V".equals(longCta)) {
			boolean esAlfa = "A".equals(tipoCta);
			boolean esNumerico = !esAlfa;
			if (cta!=null) cta = cta.trim();
			if (cta!=null && cta.length()>3) {
				tmp = new String [2];
				boolean trobat = false;
				if (cta.length()>4) {
					String ctatmp = cta.substring(0,4);
					if (htGrupos.containsKey(ctatmp)) {
						tmp [0] = cta.substring(0,4);
						tmp [1] = "0"+cta.substring(4);
						trobat = true;
					}
				}
				if (!trobat) {
					if (htGrupos.containsKey(cta.substring(0,3)+"0")) {
						tmp [0] = cta.substring(0,3)+"0";
						tmp [1] = cta.substring(3);
						trobat = true;
					}
				}
				if (!trobat) {
					tmp [0] = cta.substring(0,3);
					tmp [1] = cta.substring(3);
				}
				String subctatmp = tmp [1];
				if (esNumerico) {
					for (int i = subctatmp.length();i<LONG_SBCTA;i++) subctatmp = "0"+subctatmp;
					tmp[1] = subctatmp;
				}
			}
		}
		else if ("3".equals(longCta) && cta!=null && cta.length()>3 ) {  
			tmp = new String [2];
			tmp [0] = cta.substring(0,3);
			tmp [1] = cta.substring(3);
		}
		else if ("4".equals(longCta) && cta!=null && cta.length()>4 ) {
			tmp = new String [2];
			int tmppos = 0;
			String ctaMayor = cta.substring(0, 4);
			if (!Util.isNumero(ctaMayor.substring(3, 4))) {
				tmppos = 1;
				tmp [0] = cta.substring(0,3)+"0";
				tmp [1] = cta.substring(3);
			}
			else if (!htGrupos.containsKey(ctaMayor) && htGrupos.containsKey(ctaMayor.substring(0,3)+"0")) {
				tmppos = 2;
				tmp [0] = cta.substring(0,3)+"0";
				tmp [1] = cta.substring(3);						
			}
			else if (!htGrupos.containsKey(ctaMayor) && htGrupos.containsKey(ctaMayor.substring(0,3))) {
				tmp [0] = cta.substring(0,3)+"0";
				tmp [1] = cta.substring(3);				
			}
			else if (cta.length()>=11 && Util.esNIF(cta.substring(cta.length()-9,cta.length())) == 0 && ("400".equals(cta.substring(0, 3)) || "430".equals(cta.substring(0, 3)))    ) {
				tmppos = 3;
				tmp [0] = cta.substring(0,3)+"0";
				tmp [1] = cta.substring(3);						
			}
			else if (augmentaLong4) {
				tmppos = 4;
				tmp [0] = cta.substring(0,4);
				tmp [1] = "0"+cta.substring(4);						
			}
			else {
				tmppos = 5;
				tmp [0] = cta.substring(0,4);
				tmp [1] = cta.substring(4);
			}
		}
		return tmp;
	}

	private void checkCta (int iEmp, int iEjer, String sc, String ss, int empJconta) {
		checkCta (iEmp, iEjer, sc, ss, empJconta, null);
	}
	
	private void checkMayor (int iEmp, int iEjer, String cta, String desccta) {
		Selector spcu = new Selector (dbJCta);
		spcu.execute("Select * from PCUENTAS where pcuempresa="+iEmp+" and pcuejercicio="+iEjer+" and pcucuenta='"+cta+"' and pcusubcuenta='0'");
		if (!spcu.next()) {
			Insert ipcu = new Insert (dbJCta,"PCUENTAS");
			ipcu.valor("pcuempresa",iEmp);
			ipcu.valor("pcuejercicio",iEjer);
			ipcu.valor("pcucuenta",cta);
			ipcu.valor("pcusubcuenta","0");
			ipcu.valor("pcudesc",desccta);
			ipcu.valor("pculongitud",12);
			ipcu.valor("pcumediacion","N");
			ipcu.valor("pcuivaded","S");
			ipcu.valor("pcu347","N");
			ipcu.valor("pcu349","N");
			ipcu.execute();
		}
		spcu.close();
	}

	private void checkCta (int iEmp, int iEjer, String sc, String ss, int empJconta, String desccta) {
		String sdesc = "Cuenta conversión";
		if (desccta!=null && desccta.trim().length()>0) sdesc  = desccta;
		Selector spcu = new Selector (dbJCta);
		spcu.execute("Select * from PCUENTAS where pcuempresa="+empJconta+" and pcuejercicio="+iEjer+" and pcucuenta='"+sc+"' and pcusubcuenta='0'");
		if (!spcu.next()) {
			Insert ipcu = new Insert (dbJCta,"PCUENTAS");
			ipcu.valor("pcuempresa",empJconta);
			ipcu.valor("pcuejercicio",iEjer);
			ipcu.valor("pcucuenta",sc);
			ipcu.valor("pcusubcuenta","0");
			ipcu.valor("pcudesc",sdesc);
			ipcu.valor("pculongitud",12);
			ipcu.valor("pcumediacion","N");
			ipcu.valor("pcuivaded","S");
			ipcu.valor("pcu347","N");
			ipcu.valor("pcu349","N");
			ipcu.execute();
			ctaMayor.add(sc);
		}
		else if (desccta==null) sdesc = spcu.getString("pcudesc");
		spcu.close();
		spcu = new Selector (dbJCta);
		spcu.execute("Select * from PCUENTAS where pcuempresa="+empJconta+" and pcuejercicio="+iEjer+" and pcucuenta='"+sc+"' and pcusubcuenta='"+ss+"'");
		if (!spcu.next()) {
			Insert ipcu = new Insert (dbJCta,"PCUENTAS");
			ipcu.valor("pcuempresa",empJconta);
			ipcu.valor("pcuejercicio",iEjer);
			ipcu.valor("pcucuenta",sc);
			ipcu.valor("pcusubcuenta",ss);
			ipcu.valor("pcudesc",sdesc);
			ipcu.valor("pculongitud",12);
			ipcu.valor("pcumediacion","N");
			ipcu.valor("pcuivaded","S");
			ipcu.valor("pcu347","N");
			ipcu.valor("pcu349","N");
			ipcu.execute();
			ctaMayor.add(sc);
		}
		spcu.close();
	}

	private boolean checkReten (int iEmp, int iEjer, String sc, String ss, int empJconta, boolean altaLocal) {
		boolean bOk = true;
		Update upcu = new Update (dbJCta,"PCUENTAS");
		upcu.valor("pcu347","N");
		upcu.valor("pcu349","N");
		bOk = upcu.execute("pcuempresa="+empJconta+" and pcuejercicio="+iEjer+" and pcucuenta='"+sc+"' and pcusubcuenta='"+ss+"'");
		if (bOk && altaLocal) {
			Selector spcl = new Selector (dbJCta);
			spcl.execute("Select * from PCLOCALES where pclempresa="+empJconta+" and pclejercicio="+iEjer+" and pclcuenta='"+sc+"' and pclsubcuenta='"+ss+"'");
			if (!spcl.next()) {
				Insert ipcl = new Insert (dbJCta,"PCLOCALES");
				ipcl.valor("pclempresa",empJconta);
				ipcl.valor("pclejercicio",iEjer);
				ipcl.valor("pclcuenta",sc);
				ipcl.valor("pclsubcuenta",ss);
				ipcl.valor("pclreferencia","Ref.Catastral");
				bOk = ipcl.execute();
			}
		}
		if (!bOk) sError = "Error en checkReten";
		return bOk;
	}

	private boolean check349 (int iEmp, int iEjer, String sc, String ss, int empJconta) {
		boolean bOk;
		Update upcu = new Update (dbJCta,"PCUENTAS");
		upcu.valor("pcu347","N");
		upcu.valor("pcu349","S");
		bOk = upcu.execute("pcuempresa="+empJconta+" and pcuejercicio="+iEjer+" and pcucuenta='"+sc+"' and pcusubcuenta='"+ss+"'");
		if (!bOk) sError = "Error en check349";
		return bOk;
	}

	private String getCuentaAnt (int empresa, String tmp) {
		String tmp2 = tmp;
		SelectorLogic s = new SelectorLogic (connLC);
		s.execute("Select * from PlanCuentasPGC  where CodigoEmpresa="+empresa+" and CodigoCuentaANT_='"+tmp+"'");
		if (s.next()) {
			String CodigoCuenta = s.getString ("CodigoCuenta");
			if (CodigoCuenta!=null && CodigoCuenta.trim().length()>0) tmp2 = CodigoCuenta.trim();
		}
		s.close();
		return tmp2;
	}

	private boolean importarInmov (int empresa, int ejercicioL, int empJconta, int ejercicioJ) {

		boolean bOk = true;
		pbf.setSecondaryPercent(0);
		pbf.setState("Convirtiendo LC: "+empresa+"  JC:"+empJconta+" ("+ejercicioJ+")  -  Inmovilizado");

		SelectorLogic s = new SelectorLogic (connLC);
		s.execute("Select * from ElementoTiposPlan INNER JOIN ElementosInmovilizado ON ElementosInmovilizado.CodigoEmpresa=ElementoTiposPlan.CodigoEmpresa and ElementosInmovilizado.CodigoElemento=ElementoTiposPlan.CodigoElemento where  ElementoTiposPlan.CodigoEmpresa="+empresa+" and ElementosInmovilizado.CodigoElemento is not null  and ElementoTiposPlan.CodigoDefinicion_ is not null and ElementosInmovilizado.CodigoElemento<>''  and ElementoTiposPlan.CodigoDefinicion_<>''");
		int elemento = 0;
		Hashtable <String,Integer> htArtic = new Hashtable <String,Integer> ();
		while (bOk && s.next()) {
			int pciarticulo = 0;
			String CodigoElemento = getSelString(s,"CodigoElemento");
			String tablac = getSelString(s,"CodigoDefinicion_");    
			Integer itmp = htArtic.get(tablac);
			if (itmp!=null) pciarticulo = itmp.intValue();
			pciarticulo++;
			htArtic.put(tablac,new Integer(pciarticulo));
			boolean bGrabaElem = true;
			Insert i = new Insert(dbJCta,"PCINMOV");
			i.valor("pcielemento",elemento);
			i.valor("pciempresa",empJconta);
			i.valor("pciejercicio",ejercicioJ);
			i.valor("pciarticulo",pciarticulo);    
			int tipoamortizacion = s.getint("CodigoTipoInmovilizado");
			if (tipoamortizacion==2 || tipoamortizacion==3) i.valor("pcitipoamort","DCC");
			else if (tipoamortizacion==4) i.valor("pcitipoamort","DCV");
			else i.valor("pcitipoamort","LIN");
			String desc = getSelString(s,"DescripcionElemento");
			i.valor("pcidesc",desc);
			i.valor("pciregistro","1");
			i.valor("pcihoras",8);


			double por = s.getdouble("PorcentajeMaximo");
			int per = (int) s.getdouble("VidaUtil");
			if (per==0 && por>0) {
				per = (int) (100.0/por);
				if ((100.0/por)>per) per++;
			}
			i.valor("pciperapli",per);
			i.valor("pcicoefapli",por);

			i.valor("pcifecalta",s.getDate("FechaInicioAmortizacion"));
			Date FechaBaja = s.getDate("FechaBaja");
			Date FechaVenta = s.getDate("FechaVenta");
			if (FechaBaja!=null) i.valor("pcifecbaja",FechaBaja);    
			else i.valor("pcifecbaja",FechaVenta);    
			double importeactualizado = s.getdouble("ImporteActualizado");
			//double noamort = s.getdouble("ValorResidualInicial"); 
			i.valor("pciadquis",importeactualizado);
			i.valor("pciunidades",1);
			i.valor("pcinuevousado","NUE");
			double codamor = 0;
			Selector sam = new Selector (connEA);
			sam.execute("Select * from AMORTIZACION where amocoef="+por+" and amoperiodo="+per);
			if (sam.next()) codamor = sam.getint("amocodigo");
			else {
				sam.close();
				sam = new Selector (connEA);
				sam.execute("Select * from AMORTIZACION where amocoef>="+por+" and amoperiodo="+per);
				if (sam.next()) codamor = sam.getint("amocodigo");
			}
			sam.close();
			i.valor("pcicodigoamor",codamor);

			String cc = "";
			String sc = "";
			String ccd = "";
			String scd = "";
			String cca = "";
			String sca = "";    

			SelectorLogic s2 = new SelectorLogic (connLC);
			try {
				s2.execute("Select * from DefinicionCuentas_ where codigoempresa="+empresa+" and CodigoDefinicion_='"+tablac+"'");
				if (s2.next()) {
					String tmp = s2.getString("CuentaInmovilizado");
					if (tmp.endsWith(".")) tmp +="0";
					tmp = tmp.replace(".", "");                                    
					tmp = getCuentaAnt (empresa,tmp);
					tmp = tmp.replace(".", "");                                    
					String [] ctafull = getFormatoCuenta (tmp);
					if (ctafull!=null) {
						cc= ctafull[0];         
						sc = ctafull[1];  
					}
					tmp = s2.getString("CuentaAmortizacion");
					if (tmp.endsWith(".")) tmp +="0";
					tmp = tmp.replace(".", "");                                    
					tmp = getCuentaAnt (empresa,tmp);
					tmp = tmp.replace(".", "");                                    
					ctafull = getFormatoCuenta (tmp);
					if (ctafull!=null) {
						cca= ctafull[0];         
						sca = ctafull[1];  
					}
					tmp = s2.getString("CuentaDotacionAmortizacion");
					if (tmp.endsWith(".")) tmp +="0";
					tmp = tmp.replace(".", "");                                    
					tmp = getCuentaAnt (empresa,tmp);
					tmp = tmp.replace(".", "");                                    
					ctafull = getFormatoCuenta (tmp);
					if (ctafull!=null) {
						ccd= ctafull[0];         
						scd = ctafull[1];  
					}
				}        
				else bGrabaElem = false;
			}
			catch (Exception e) {
				bGrabaElem = false;
			}
			finally {
				s2.close();
			}
			if (bGrabaElem) {
				if (sc == null || sc.trim().length()==0 || sc.trim().equals("0")) sc = "00";
				if (sca == null || sca.trim().length()==0 || sca.trim().equals("0")) sca = "00";
				if (scd == null || scd.trim().length()==0 || scd.trim().equals("0")) scd = "00";
				if (bGrabaElem) bGrabaElem = Util.isNumero(cc);
				if (bGrabaElem) bGrabaElem = Util.isNumero(sc);
				if (bGrabaElem) bGrabaElem = Util.isNumero(ccd);
				if (bGrabaElem) bGrabaElem = Util.isNumero(scd);
				if (bGrabaElem) bGrabaElem = Util.isNumero(cca);
				if (bGrabaElem) bGrabaElem = Util.isNumero(sca);
				if (bGrabaElem) checkCta (empresa, ejercicioJ, cc, sc, empJconta, desc);
				if (bGrabaElem) checkCta (empresa, ejercicioJ, cca, sca, empJconta, "Amort. Acumulada");
				if (bGrabaElem) checkCta (empresa, ejercicioJ, ccd, scd, empJconta, "Dotación");
			}
			if (!bGrabaElem) {
				System.out.println("["+desc+"]");
				System.out.println("["+cc+"]");
				System.out.println("["+sc+"]");
				System.out.println("["+ccd+"]");
				System.out.println("["+scd+"]");
				System.out.println("["+cca+"]");
				System.out.println("["+sca+"]");
			}
			if (bGrabaElem) {
				i.valor("pcicuenta",cc);
				i.valor("pcisubcuenta",sc);
				i.valor("pcictadot",ccd);
				i.valor("pcisubctadot",scd);
				i.valor("pcictaamort",cca);
				i.valor("pcisubctaamort",sca);
				if (bGrabaElem) bGrabaElem = Util.isNumero(cc);
				if (bGrabaElem) bGrabaElem = Util.isNumero(sc);
				if (bGrabaElem) bGrabaElem = Util.isNumero(ccd);
				if (bGrabaElem) bGrabaElem = Util.isNumero(scd);
				if (bGrabaElem) bGrabaElem = Util.isNumero(cca);
				if (bGrabaElem) bGrabaElem = Util.isNumero(sca);
				if (bGrabaElem) {
					bOk = i.execute();
					if (!bOk) sError = "Error al grabar elemento inmovilizado";
				}
				if (bOk) {
					elemento = i.getField("pcielemento").getInteger();
					SelectorLogic splan = new SelectorLogic (connLC);
					splan.execute("Select * from PlanesInmovilizado where codigoempresa="+empresa+" and CodigoElemento='"+CodigoElemento+"' order by ejercicio");
					double amortAcum = 0;
					while (bOk && splan.next()) {
						int ejeamo = splan.getint("ejercicio");
						Selector sexiste = new Selector (dbJCta);
						sexiste.execute("Select * from PCMORANUAL where pcmelemento="+elemento+" and pcmamorejer="+ejeamo);
						if (!sexiste.next()) {
							Insert ip = new Insert(dbJCta,"PCMORANUAL");
							ip.valor("pcmelemento",elemento);
							ip.valor("pcmamorejer",ejeamo);
							ip.valor("pcmtipo","C");
							ip.valor("pcmcoefamort",por);
							double impamo = splan.getdouble("ImporteAmortizado");
							ip.valor("pcmamortanual",impamo);
							amortAcum += impamo;
							ip.valor("pcmamortacum",amortAcum);
							ip.valor("pcmamortpdte",importeactualizado - amortAcum);
							ip.valor("pcmultfecha",splan.getDate("FechaUltimaAmortizacion"));
							if (impamo!=0) ip.valor("pcmcuotaapli",impamo);
							bOk = ip.execute();
						}
						else {
							Update up = new Update(dbJCta,"PCMORANUAL");
							double impamo = splan.getdouble("ImporteAmortizado");
							if (impamo==0) impamo = splan.getdouble("importemaximoanual");
							amortAcum += impamo;
							impamo+=sexiste.getdouble("pcmamortanual");
							double impaplicado = impamo;
							up.valor("pcmamortanual",impamo);
							up.valor("pcmamortacum",amortAcum);
							up.valor("pcmamortpdte",importeactualizado - amortAcum);
							if (impaplicado!=0) up.valor("pcmcuotaapli",impaplicado);
							bOk = up.execute("pcmelemento="+elemento+" and pcmamorejer="+ejeamo);
						}
						sexiste.close();
						if (!bOk) sError = "Error al grabar cuadro inmovilizado";
					}
					splan.close();
				}
			}
		}
		s.close();
		return bOk;
	}
	private boolean importarFP () {
		boolean bOk = true;
		SelectorLogic s = new SelectorLogic (connLC);
		s.execute("Select * from TipoEfectos_ order by CodigoTipoEfecto");
		while (bOk && s.next()) {
			int codi = s.getint("CodigoTipoEfecto");
			String TipoEfecto = s.getString("TipoEfecto");
			int EsContadoLc = s.getint("EsContadoLc");
			if (String.valueOf(codi).length()<=3) {
				Selector s2 = new Selector (connEA);
				s2.execute("Select * from FORMACOBPAG where fcpforma='"+codi+"'");
				if (!s2.next()) {
					Insert i = new Insert (connEA,"FORMACOBPAG");
					i.valor("fcpforma", codi);
					i.valor("fcpdesc", TipoEfecto);
					if (EsContadoLc == -1) i.valor("fcptipo", "EF");
					bOk = i.execute();
				}
				s2.close();
			}
		}
		s.close();
		if (!bOk) sError = "Error al grabar Formas de Pago";
		return bOk;
	}
	private boolean importarAsientos (int iEmp, int iEjerL, int empJconta, int iEjerJ, Date fechaCierre, int mesInicio) {
		boolean bOk = true;
		estaCerrado = false;
		asientoCE = -1;
		asientoCC = -1;
		int asientoAct = 1;
		int asientoAnt = -1;
		boolean bCerrado=false;
		int numTotal = 0;
		pbf.setSecondaryPercent(0);
		pbf.setState("Convirtiendo LC: "+iEmp+"  JC:"+empJconta+" ("+iEjerJ+")  -  Asientos (Calculanto total registros)");
		SelectorLogic smovt = new SelectorLogic (connLC);
		smovt.execute("Select count(*) as num from Movimientos where CodigoEmpresa="+iEmp+" and Ejercicio="+iEjerL);
		if (smovt.next()) numTotal = smovt.getint("num");
		smovt.close();
		int numActual = 0;
		pbf.setState("Convirtiendo LC: "+iEmp+"  JC:"+empJconta+" ("+iEjerJ+")  -  Asientos (Inicializando ...)");
		SelectorLogic smov = new SelectorLogic (connLC);
		smov.execute("Select * from Movimientos where CodigoEmpresa="+iEmp+" and Ejercicio="+iEjerL+" and NumeroPeriodo>0 and (NumeroPeriodo<98 or (NumeroPeriodo=98 and Comentario='Cierre Patrimonio')) order by NumeroPeriodo,FechaAsiento,Asiento");
		pbf.setState("Convirtiendo LC: "+iEmp+"  JC:"+empJconta+" ("+iEjerJ+")  -  Asientos (Grabando ...)");
		while (bOk && smov.next()) {
			pbf.setSecondaryPercent((++numActual)*100/numTotal);
			String sCta = smov.getString("CodigoCuenta");
			String sc = "";
			String ss = "";
			try {
				String [] ctafull = getFormatoCuenta (sCta);
				if (ctafull!=null) {
					sc= ctafull[0];         
					ss = ctafull[1];  
				}
			}
			catch (Exception e) {
			}
			boolean grabaLinea = !sc.equals("") && !ss.equals("") && !ss.equals("0");
			if (grabaLinea) {
				String sDesc = getSelString(smov, "Comentario");
				if (sDesc == null) sDesc = "";
				String movPosicion = smov.getString("MovPosicion");
				Insert iasi = new Insert (dbJCta,"ASIENTOS");
				iasi.valor("asicodi",0);
				iasi.valor("asiempresa",empJconta);
				iasi.valor("asiejercicio",iEjerJ);
				java.util.Date ffeecchhaa = smov.getDate("FechaAsiento");
				iasi.valor("asifecha",ffeecchhaa);
				int asitmp = smov.getint("Asiento");          
				if (asitmp!=asientoAnt) {
					asientoAct ++;
					asientoAnt = asitmp;
				}
				iasi.valor("asiasiento",asientoAct);
				iasi.valor("asidiario",1);
				iasi.valor("asidiario2",1);
				if (sDesc == null || sDesc.equals("")) sDesc = " ";
				iasi.valor("asidesc",sDesc);
				iasi.valor("asidocumento",getSelString(smov, "DocumentoConta"));
				iasi.valor("asicuenta",sc);
				iasi.valor("asisubcuenta",ss);
				checkCta (iEmp, iEjerJ, sc, ss,empJconta);
				String deha = getSelString(smov, "CargoAbono");
				iasi.valor("asidebehaber",deha);
				double dimp = smov.getdouble("ImporteAsiento");
				iasi.valor("asiimporte",dimp);
				String CodigoCanal = smov.getString("CodigoCanal");
				if (asigProy && CodigoCanal!=null && CodigoCanal.length()>0) {
					bOk = checkProyecto(CodigoCanal, empJconta);
					iasi.valor("asiproyecto", CodigoCanal);
				}
				if (bOk) {
					bOk = iasi.execute();
					if (!bOk) sError ="Error al grabar Asientos ("+asientoAct+")";
				}
				if (bOk) {
					String sqlhay = "SELECT CodigoEmpresa FROM MovimientosIva WHERE MovPosicion='"+movPosicion+"' and CodigoEmpresa="+iEmp;
					SelectorLogic shay = new SelectorLogic (connLC);
					shay.execute(sqlhay);
					boolean importarFacturas = shay.next();
					shay.close();
					if (importarFacturas) bOk = importarFacturas (iEmp,iEjerL,movPosicion,iasi.getField("asicodi").getInteger(), empJconta,iEjerJ,asientoAct);
				}
			}
		}
		smov.close();

		smov.execute("Select * from Movimientos where CodigoEmpresa="+iEmp+" and Ejercicio="+iEjerL+" and NumeroPeriodo=0");    
		while (bOk && smov.next()) {
			pbf.setSecondaryPercent((++numActual)*100/numTotal);
			String sCta = smov.getString("CodigoCuenta");
			String sc = "";
			String ss = "";
			try {
				String [] ctafull = getFormatoCuenta (sCta);
				if (ctafull!=null) {
					sc= ctafull[0];         
					ss = ctafull[1];  
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			boolean grabaLinea = !sc.equals("") && !ss.equals("") && !ss.equals("0");
			if (grabaLinea) {
				String sDesc = getSelString(smov, "Comentario");
				if (sDesc == null) sDesc = "";
				Insert iasi = new Insert (dbJCta,"ASIENTOS");
				iasi.valor("asicodi",0);
				iasi.valor("asiempresa",empJconta);
				iasi.valor("asiejercicio",iEjerJ);
				iasi.valor("asifecha",smov.getDate("FechaAsiento"));
				iasi.valor("asiasiento",1);
				iasi.valor("asidiario",31);
				iasi.valor("asidiario2",1);        
				iasi.valor("asidesc",sDesc);
				iasi.valor("asidocumento",getSelString(smov, "DocumentoConta"));
				iasi.valor("asicuenta",sc);
				iasi.valor("asisubcuenta",ss);
				checkCta (iEmp, iEjerJ, sc, ss,empJconta);
				String debhab = getSelString(smov, "CargoAbono");
				iasi.valor("asidebehaber",debhab);
				double impp = smov.getdouble("ImporteAsiento");
				iasi.valor("asiimporte",impp);
				String CodigoCanal = smov.getString("CodigoCanal");
				if (asigProy && CodigoCanal!=null && CodigoCanal.length()>0) {
					bOk = checkProyecto(CodigoCanal, empJconta);
					iasi.valor("asiproyecto", CodigoCanal);
				}
				if (bOk) {
					bOk = iasi.execute();
					if (!bOk) sError ="Error al grabar Asientos ("+1+")";
				}				
			}
		}
		smov.close(); 



		int asce = 0;
		int ascc = 0;    
		int ultas = asientoAct;
		smov.execute("Select * from Movimientos where CodigoEmpresa="+iEmp+" and Ejercicio="+iEjerL+" and NumeroPeriodo=98 AND Comentario<>'Cierre Patrimonio'");    
		while (bOk && smov.next()) {
			pbf.setSecondaryPercent((++numActual)*100/numTotal);
			if (asce==0) {
				asientoAct++;
				asce = asientoAct;
				ultas = asce;
			}
			String sCta = smov.getString("CodigoCuenta");
			String sc = "";
			String ss = "";
			try {
				String [] ctafull = getFormatoCuenta (sCta);
				if (ctafull!=null) {
					sc= ctafull[0];         
					ss = ctafull[1];  
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			boolean grabaLinea = !sc.equals("") && !ss.equals("") && !ss.equals("0");
			if (grabaLinea) {
				String sDesc = getSelString(smov, "Comentario");
				if (sDesc == null) sDesc = "";
				bCerrado = true;
				Insert iasi = new Insert (dbJCta,"ASIENTOS");
				iasi.valor("asicodi",0);
				iasi.valor("asiempresa",empJconta);
				iasi.valor("asiejercicio",iEjerJ);
				iasi.valor("asifecha",smov.getDate("FechaAsiento"));
				iasi.valor("asiasiento",asce);
				iasi.valor("asidiario",31);
				iasi.valor("asidiario2",1);        
				iasi.valor("asidesc",sDesc);
				iasi.valor("asidocumento",getSelString(smov, "DocumentoConta"));
				iasi.valor("asicuenta",sc);
				iasi.valor("asisubcuenta",ss);
				checkCta (iEmp, iEjerJ, sc, ss,empJconta);
				String debhab = getSelString(smov, "CargoAbono");
				iasi.valor("asidebehaber",debhab);
				double impp = smov.getdouble("ImporteAsiento");
				iasi.valor("asiimporte",impp);
				String CodigoCanal = smov.getString("CodigoCanal");
				if (asigProy && CodigoCanal!=null && CodigoCanal.length()>0) {
					bOk = checkProyecto(CodigoCanal, empJconta);
					iasi.valor("asiproyecto", CodigoCanal);
				}
				if (bOk) {
					bOk = iasi.execute();
					if (!bOk) sError ="Error al grabar Asientos ("+asce+")";
				}
			}
		}
		smov.close(); 


		smov.execute("Select * from Movimientos where CodigoEmpresa="+iEmp+" and Ejercicio="+iEjerL+" and NumeroPeriodo=99");    
		while (bOk && smov.next()) {
			pbf.setSecondaryPercent((++numActual)*100/numTotal);
			if (ascc==0) {
				asientoAct++;
				ascc = asientoAct;
				ultas = ascc;
			}
			String sCta = smov.getString("CodigoCuenta");
			String sc = "";
			String ss = "";
			try {
				String [] ctafull = getFormatoCuenta (sCta);
				if (ctafull!=null) {
					sc= ctafull[0];         
					ss = ctafull[1];  
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			boolean grabaLinea = !sc.equals("") && !ss.equals("") && !ss.equals("0");
			if (grabaLinea) {
				String sDesc = getSelString(smov, "Comentario");
				if (sDesc == null) sDesc = "";
				bCerrado = true;
				Insert iasi = new Insert (dbJCta,"ASIENTOS");
				iasi.valor("asicodi",0);
				iasi.valor("asiempresa",empJconta);
				iasi.valor("asiejercicio",iEjerJ);
				iasi.valor("asifecha",smov.getDate("FechaAsiento"));
				iasi.valor("asiasiento",ascc);
				iasi.valor("asidiario",31);
				iasi.valor("asidiario2",1);        
				iasi.valor("asidesc",sDesc);
				iasi.valor("asidocumento",getSelString(smov, "DocumentoConta"));
				iasi.valor("asicuenta",sc);
				iasi.valor("asisubcuenta",ss);
				checkCta (iEmp, iEjerJ, sc, ss,empJconta);
				String debhab = getSelString(smov, "CargoAbono");
				iasi.valor("asidebehaber",debhab);
				double impp = smov.getdouble("ImporteAsiento");
				iasi.valor("asiimporte",impp);
				String CodigoCanal = smov.getString("CodigoCanal");
				if (asigProy && CodigoCanal!=null && CodigoCanal.length()>0) {
					bOk = checkProyecto(CodigoCanal, empJconta);
					iasi.valor("asiproyecto", CodigoCanal);
				}
				if (bOk) {
					bOk = iasi.execute();
					if (!bOk) sError ="Error al grabar Asientos ("+ascc+")";
				}
			}
		}
		smov.close();
		asientoCE = asce;
		asientoCC = ascc;
		estaCerrado = bCerrado;
		if (bOk) {
			Selector sejercicio = new Selector (dbJCta);
			sejercicio.execute("Select * from EJERCICIO where ejeempresa="+empJconta+" and ejeejercicio="+iEjerJ);
			if (sejercicio.next()) {
				Update ueje = new Update (dbJCta,"EJERCICIO");
				ueje.valor("ejeasiento",ultas);
				if (bCerrado) {
					ueje.valor("ejeastoce",asce);
					ueje.valor("ejeastocc",ascc);
					ueje.valor("ejecierre",Fecha.getDate(iEjerJ,12,31));
				}
				bOk = ueje.execute("ejeempresa="+empJconta+" and ejeejercicio="+iEjerJ);
				if (!bOk) sError = "Error al actualizar numeros de asiento";
			}
			sejercicio.close();
		}
		if (bOk) {
			if (bOk) {
				bOk = funciones.eliminarCuentasEstructura(empJconta,iEjerJ,esPyme,dbJCta);
				if (!bOk) sError = "Error al eliminarCuentasEstructura";
			}
			if (bOk) {
				bOk = funciones.actualizarSeries (empJconta,iEjerJ,dbJCta);
				if (!bOk) sError = "Error al actualizarSeries";
			}

		}
		return bOk;
	}

	private String[] getNifFromCliConta (String cta,int iEmpCta) {
		String niftmp[] = null;
		String [] cuentas = getFormatoCuenta(cta);
		if (cuentas!=null) {
			Selector sclipro = new Selector (dbJCta);
			sclipro.execute ("Select * from pcuentas where pcuempresa="+iEmpCta+" and pcucuenta='"+cuentas[0]+"' and pcusubcuenta='"+cuentas[1]+"'");
			if (sclipro.next()) {
				niftmp = new String [2];
				niftmp[0] = sclipro.getString("pcudesc");    
				niftmp[1] = sclipro.getString("pcunif");    
				if (niftmp[0] !=null) niftmp[0] = niftmp[0].trim();
				if (niftmp[1] !=null) niftmp[1] = niftmp[1].trim();
			}
			sclipro.close();
		}
		return niftmp;
	}


	private boolean importarFacturas (int iEmp, int iEjerL, String movPosicion, int codi, int empJconta, int iEjerJ, int numAsi) {
		boolean bOk = true;
		SelectorLogic sf = new SelectorLogic (connLC);
		sf.execute("Select * from MovimientosFacturas where CodigoEmpresa="+iEmp+" and MovPosicion='"+movPosicion+"'");
		while (bOk && sf.next()) {
			int iNumero = sf.getint("Factura");
			String a347 = "S";
			String a349 = "N";
			String aTrans = "IN";
			Insert iciv = new Insert (dbJCta,"IVACABECERA");
			iciv.valor("civcodi",0);
			iciv.valor("civempresa",empJconta);
			iciv.valor("civejercicio",iEjerJ);
			iciv.valor("civivaigic","I");
			String sSerie = getSelString(sf,"Serie");
			if (sSerie == null || sSerie.trim().equals("")) sSerie = " ";
			iciv.valor("civserie",sSerie);    
			iciv.valor("civregistro",iNumero);
			iciv.valor("civfecha",sf.getDate("FechaFactura"));
			iciv.valor("civfechaop",sf.getDate("FechaOperacion"));
			String ros = "R";
			
			int CriterioIva = sf.getint("CriterioIva");
			boolean esRecc = false;
			if (CriterioIva == 2) {
				esRecc = true;
				iciv.valor("civrecc","S");
			}
			else iciv.valor("civrecc","N");
			
			String emirec = getSelString(sf,"TipoFactura");
			if ("R".equals(emirec)) ros = "S";
			int abono = sf.getint("AbonoIva");
			double multiplicador = 1.0;
			if (abono == -1) multiplicador = -1.0;
			String civdesc = getSelString(sf,"Nombre");
			String codigoCta = getSelString(sf,"CodigoCuentaFactura");
			String[] infocta = getNifFromCliConta(codigoCta,empJconta);
			if (infocta!=null) {
				if (civdesc==null || civdesc.trim().length()==0) civdesc = infocta[0];
				iciv.valor("civnif",infocta[1]);
			}
			iciv.valor("civdesc",civdesc);
			iciv.valor("civemirep",ros);
			double ImporteFactura = sf.getdouble("ImporteFactura");
			if (ImporteFactura!=0) iciv.valor("civimporte",multiplicador * ImporteFactura);
			double Retencion = sf.getdouble("%Retencion");
			if (Retencion!=0) iciv.valor("civporirpf",Retencion);
			double BaseRetencion = sf.getdouble("BaseRetencion");
			if (BaseRetencion!=0) iciv.valor("civbaseirpf",multiplicador * BaseRetencion);
			double retenaplic = sf.getdouble("ImporteRetencion");
			if (retenaplic!=0) iciv.valor("civimpiva",multiplicador * retenaplic);
			iciv.valor("civasicodi",codi);
			int codReten = sf.getint("CodigoRetencion");
			bOk = iciv.execute();
			if (!bOk) sError = "Error a grabar cabecera de iva";
			if (bOk) {
				String ClaveIRPFNomina = null;
				String Clave180 = null;
				if (codReten>0) {
					SelectorLogic sir = new SelectorLogic (connLC);
					sir.execute("Select * from TiposRetencion INNER JOIN ClavesIrpf on TiposRetencion.ClaveIrpf = ClavesIrpf.ClaveIrpf where CodigoRetencion="+codReten);
					if (sir.next()) {
						ClaveIRPFNomina = sir.getString("ClaveIRPFNomina");
						Clave180 = sir.getString("Clave180");
					}
					sir.close();
				}
				if (Numero.redondeo(Retencion)!=0 && (ClaveIRPFNomina!=null || Clave180!=null) ) {
					String sc = "";
					String ss = "";
					try {
						String [] ctafull = getFormatoCuenta (codigoCta);
						if (ctafull!=null) {
							sc= ctafull[0];         
							ss = ctafull[1];  
						}
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					boolean bOkCC = !sc.equals("") && !ss.equals("") && !ss.equals("0");
					if (bOkCC) bOk = checkReten (iEmp, iEjerJ, sc, ss, empJconta,Clave180!=null);
				}
				int civcodi = 0;
				civcodi = iciv.getField("civcodi").getInteger();
				SelectorLogic sl = new SelectorLogic (connLC);
				sl.execute ("Select * from MovimientosIva where CodigoEmpresa="+iEmp+" and MovPosicion='"+movPosicion+"'");
				while (bOk && sl.next()) {
					aTrans = emirec + "IN";
					int codtrans = sl.getint("CodigoTransaccion");
					if (codtrans==8) aTrans = "ERA";
					else if (codtrans==10 || codtrans==11) aTrans = "EEN";
					else if (codtrans==13) aTrans = "END";
					else if (codtrans==14) aTrans = "EEX";
					else if (codtrans==17 || codtrans==18 || codtrans==19) aTrans = "EOE";
					else if (codtrans==20 || codtrans==21 || codtrans==22 || codtrans==29){
						aTrans = "RAD";
						a347 = "N";
						a349 = "S";          
						if (codtrans==21) aTrans = "RAB";
						else if (codtrans==29) aTrans = "RAS";
						if ("E".equals(emirec)) a349 = "N";
					}
					else if (codtrans==23) aTrans = emirec+"MQ";
					else if (codtrans==25) aTrans = "EIB";
					else if (codtrans==28) aTrans = "EPS";
					else if (codtrans==27) aTrans = "RDI";
					else if (codtrans==30) aTrans = "RIB";
					else if (codtrans==31 || codtrans==32) aTrans = "RBM";
					else if (codtrans==33) aTrans = "EDI";
					else if (codtrans==35) aTrans = "RAG";
					else if (codtrans==36) aTrans = "RRI";
					else if (codtrans==37) aTrans = "RIN";

					if (sl.getint("Exclusion347")!=0 || ClaveIRPFNomina!=null || Clave180!=null) a347 = "N";
					if ("S".equals(a349) ) {
						String sc = "";
						String ss = "";
						try {
							String [] ctafull = getFormatoCuenta (codigoCta);
							if (ctafull!=null) {
								sc= ctafull[0];         
								ss = ctafull[1];  
							}
						}
						catch (Exception e) {
							e.printStackTrace();
						}
						boolean bOkCC = !sc.equals("") && !ss.equals("") && !ss.equals("0");
						if (bOkCC) bOk = check349 (iEmp, iEjerJ, sc, ss, empJconta);
					}
					if (bOk) {
						Insert iliv = new Insert (dbJCta,"IVALINEAS");
						iliv.valor("livacum347",a347);
						iliv.valor("livacum349",a349);
						iliv.valor("livdeducible","S");
						iliv.valor("livmediacion","N");
						iliv.valor("livtransaccion",aTrans);
						iliv.valor("livasto",codi);
						iliv.valor("livcodi",civcodi);
						iliv.valor("livcodilin",0);
						iliv.valor("livbase",multiplicador * sl.getdouble("BaseIva"));
						iliv.valor("livimpiva",multiplicador * sl.getdouble("CuotaIva"));
						iliv.valor("livporiva",sl.getdouble("%IVA"));
						iliv.valor("livimprec",multiplicador * sl.getdouble("RecargoEquivalencia"));
						iliv.valor("livporrec",sl.getdouble("%RecargoEquivalencia"));
						iliv.valor("livopefec","N");
						bOk = iliv.execute();      
						if (!bOk) sError = "ERROR al grabar la linea de Iva del asiento "+codi+" - "+movPosicion;
					}
				}
				sl.close();
				if (bOk && esRecc) bOk = importarCartera (iEmp, iEjerL, movPosicion, numAsi, empJconta,iEjerJ, civcodi);
				else if (bOk) bOk = importarCarteraIVA (iEmp, iEjerL, movPosicion, numAsi, empJconta,iEjerJ, civcodi);
			}
		}
		sf.close();
		Selector str = new Selector (connEA);
		str.execute("Select * from TRANSACCIONES where tratipo='RAS'");
		if (bOk && !str.next()) {
			Insert istr = new Insert (connEA,"TRANSACCIONES");
			istr.valor ("tratipo","RAS");
			istr.valor ("tradesc","Adq. Intracomunitaria Servicios");
			istr.valor ("traemre","R");
			istr.valor ("traregimen","IN");
			istr.valor ("tratipoiva","IN");
			istr.valor ("travoloper","NO");
			istr.valor ("traoperespec","NO");
			istr.valor ("traoper349","I");
			bOk = istr.execute();
			if (!bOk) sError = "ERROR al grabar transaccion RAS";
		}					
		str.close();
		str = new Selector (connEA);
		str.execute("Select * from TRANSACCIONES where tratipo='EPS'");
		if (bOk && !str.next()) {
			Insert istr = new Insert (connEA,"TRANSACCIONES");
			istr.valor ("tratipo","EPS");
			istr.valor ("tradesc","Prestación Intracom. Servicios");
			istr.valor ("traemre","E");
			istr.valor ("traregimen","ON");
			istr.valor ("tratipoiva","OND");
			istr.valor ("travoloper","NDM");
			istr.valor ("traoperespec","NDM");
			istr.valor ("traoper349","S");
			bOk = istr.execute();
			if (!bOk) sError = "ERROR al grabar transaccion EPS";
		}
		str.close();
		if (!bOk && (sError == null || sError.length()==0)) sError ="Error al grabar Facturas ("+movPosicion+")";
		return bOk;
	}
	
	private boolean importarCarteraIVA (int iEmp, int iEjer, String movPosicion, int asinum, int empJconta, int iEjerJ, int civcodi) {
		boolean bOk = true;

		SelectorLogic sf = new SelectorLogic (connLC);
		sf.execute("Select * from [CarteraEfectos] where StatusBorrado=0 and  MovPosicion='"+movPosicion+"'");
		while (sf.next()) {
			String sCta = sf.getString("CodigoCuenta");
			String sc = null;
			String ss = null;
			try {
				String [] ctafull = getFormatoCuenta (sCta);
				if (ctafull!=null) {
					sc= ctafull[0];         
					ss = ctafull[1];  
				}
			}
			catch (Exception e) {
			}
			if (sc!=null && ss!=null) {
				Date fechaVencimiento = sf.getDate("FechaVencimiento");
				String sCtab = sf.getString("Contrapartida");
				String scb = null;
				String ssb = null;
				try {
					String [] ctafull = getFormatoCuenta (sCtab);
					if (ctafull!=null) {
						scb= ctafull[0];         
						ssb = ctafull[1];  
					}
				}
				catch (Exception e) {
				}
				double ImportePendiente = Numero.redondeo(sf.getdouble("ImportePendiente"));
				String prevision = sf.getString("Prevision");
				String Comentario = sf.getString("Comentario");
				String DocumentoConta = sf.getString("DocumentoConta");
				String CodigoBanco = sf.getString("CodigoBanco");
				String CodigoAgencia = sf.getString("CodigoAgencia");
				String DC = sf.getString("DC");
				String CCC = sf.getString("CCC");				
				String cp = "P";		       
				if ("C".equals(prevision)) cp = "C";
				if (!Numero.doubleEquals(ImportePendiente , 0)) {
					Insert icp = new Insert (dbJCta,"COBROPAGO");
					icp.valor("cobcodi", 0);
					icp.valor("cobempresa", empJconta);
					icp.valor("cobejercicio", iEjerJ);
					icp.valor("cobcuenta", sc);		        	
					icp.valor("cobsubcuenta", ss);		        	
					icp.valor("cobvto", fechaVencimiento);
					icp.valor("cobconcepto", Comentario);
					icp.valor("cobimporte", ImportePendiente);
					icp.valor("cobdocumento", DocumentoConta);
					icp.valor("cobnumasto", asinum);
					icp.valor("cobcivcodi", civcodi);
					icp.valor("cobejerasto", iEjerJ);
					if (scb!=null && ssb!=null) {
						icp.valor("cobcuentaban", scb);		        	
						icp.valor("cobsubctaban", ssb);		        	
					}
					icp.valor("cobcobropago", cp);
					icp.valor("cobestado", "P");	
					
					if (CodigoBanco!=null && CodigoAgencia!=null && DC!= null && CCC!=null) icp.valor("cobccc", CodigoBanco+CodigoAgencia+DC+CCC); 
					bOk = icp.execute();
				}
			}
		}
		sf.close();
		return bOk;
	}

	private boolean importarCartera (int iEmp, int iEjer, String movPosicion, int asinum, int empJconta, int iEjerJ, int civcodi) {
		boolean bOk = true;

		SelectorLogic sf = new SelectorLogic (connLC);
		sf.execute("Select * from [CarteraEfectos] where StatusBorrado=0 and  Ejercicio="+iEjer+" and MovPosicion='"+movPosicion+"'");
		while (sf.next()) {
			String sCta = sf.getString("CodigoCuenta");
			String sc = null;
			String ss = null;
			try {
				String [] ctafull = getFormatoCuenta (sCta);
				if (ctafull!=null) {
					sc= ctafull[0];         
					ss = ctafull[1];  
				}
			}
			catch (Exception e) {
			}
			if (sc!=null && ss!=null) {
				Date fechaVencimiento = sf.getDate("FechaVencimiento");
				String sCtab = sf.getString("Contrapartida");
				String scb = null;
				String ssb = null;
				try {
					String [] ctafull = getFormatoCuenta (sCtab);
					if (ctafull!=null) {
						scb= ctafull[0];         
						ssb = ctafull[1];  
					}
				}
				catch (Exception e) {
				}
				double ImporteEfecto = Numero.redondeo(sf.getdouble("ImporteEfecto"));
				double ImporteCobrado = Numero.redondeo(sf.getdouble("ImporteCobrado"));
				//double ImportePendiente = Numero.redondeo(sf.getdouble("ImportePendiente"));
				String prevision = sf.getString("Prevision");
				String Comentario = sf.getString("Comentario");
				String DocumentoConta = sf.getString("DocumentoConta");
				String cp = "P";		       
				if ("C".equals(prevision)) cp = "C";
				if (!Numero.doubleEquals(ImporteCobrado , 0)) {
					Insert icp = new Insert (dbJCta,"COBROPAGO");
					icp.valor("cobcodi", 0);
					icp.valor("cobempresa", empJconta);
					icp.valor("cobejercicio", iEjerJ);
					icp.valor("cobcuenta", sc);		        	
					icp.valor("cobsubcuenta", ss);		        	
					icp.valor("cobvto", fechaVencimiento);
					icp.valor("cobconcepto", Comentario);
					icp.valor("cobimporte", ImporteCobrado);
					icp.valor("cobdocumento", DocumentoConta);
					icp.valor("cobnumasto", asinum);
					icp.valor("cobcivcodi", civcodi);
					icp.valor("cobejerasto", iEjerJ);
					if (scb!=null && ssb!=null) {
						icp.valor("cobcuentaban", scb);		        	
						icp.valor("cobsubctaban", ssb);		        	
					}
					icp.valor("cobcobropago", cp);
					icp.valor("cobestado", "C");		        
					bOk = icp.execute();
				}
				if (Numero.redondeo(ImporteEfecto - ImporteCobrado) > 0) {
					Insert icp = new Insert (dbJCta,"COBROPAGO");
					icp.valor("cobcodi", 0);
					icp.valor("cobempresa", empJconta);
					icp.valor("cobejercicio", iEjerJ);
					icp.valor("cobcuenta", sc);		        	
					icp.valor("cobsubcuenta", ss);		        	
					icp.valor("cobvto", fechaVencimiento);
					icp.valor("cobconcepto", Comentario);
					icp.valor("cobimporte", Numero.redondeo(ImporteEfecto - ImporteCobrado));
					icp.valor("cobdocumento", DocumentoConta);
					icp.valor("cobnumasto", asinum);
					icp.valor("cobcivcodi", civcodi);
					icp.valor("cobejerasto", iEjerJ);
					if (scb!=null && ssb!=null) {
						icp.valor("cobcuentaban", scb);		        	
						icp.valor("cobsubctaban", ssb);		        	
					}
					icp.valor("cobcobropago", cp);
					icp.valor("cobestado", "P");		        
					bOk = icp.execute();
				}
			}
		}
		sf.close();
		return bOk;
	}
	
	private boolean altaDesgloseModelo303(String nif,int codEmp,int codGYC, int ejer, String liqpos, String per) {
		boolean bOk = true;
		SelectorLogic sdes = new SelectorLogic (connLC);
		sdes.execute("SELECT *  FROM IOF_DesgloseModelosIva  where LiqPosicion='"+liqpos+"' and Deducible=-1 and GenSim='G' and IncidenciaIva<>-1");
		java.util.Hashtable <String,Double> ht = new java.util.Hashtable  <String,Double> ();
		java.util.Hashtable <String,Double> htb = new java.util.Hashtable <String,Double>  ();
		java.util.Hashtable <String,Double> ht390 = new java.util.Hashtable <String,Double>  ();
		while (bOk && sdes.next()) {
			int CodigoTransaccion = sdes.getint("CodigoTransaccion");
			String IdentificadorIva = sdes.getString("IdentificadorIva");
			String DiferenciadorIvaRecargo = sdes.getString("DiferenciadorIvaRecargo");
			double PorcentajeIR = sdes.getdouble("PorcentajeIR");
			double BaseTotal = sdes.getdouble("BaseTotal");
			double CuotaTotal = sdes.getdouble("CuotaTotal");
			String campob = null;
			double valorb = BaseTotal;
			String campoc = null;
			double valorc = CuotaTotal;
			String totalb = null;
			String totalc = null;
			String campo390 = null;
			if ("R".equals(IdentificadorIva)) {
				if ("I".equals(DiferenciadorIvaRecargo)) {
					if (CodigoTransaccion == 16 || CodigoTransaccion == 1 || CodigoTransaccion == 23 || CodigoTransaccion == 24 || CodigoTransaccion == 25) {
						campo390 = "m390dvopgen";
						campob = "m300ddevregorb5";
						campoc = "m300ddevregorq5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddevregorb1";
							campoc = "m300ddevregorq1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddevregorb2";
							campoc = "m300ddevregorq2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddevregorb4";
							campoc = "m300ddevregorq4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddevregorb3";
							campoc = "m300ddevregorq3";
						}
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
							campo390 = null;
						}
					}
					else if (CodigoTransaccion == 2 || CodigoTransaccion == 3) {
						campo390 = "m390dvusados";
						campob = "m300ddevopintb5";
						campoc = "m300ddevopintq5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddevopintb1";
							campoc = "m300ddevopintq1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddevopintb2";
							campoc = "m300ddevopintq2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddevopintb4";
							campoc = "m300ddevopintq4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddevopintb3";
							campoc = "m300ddevopintq3";
						}
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
							campo390 = null;
						}
					}
					else if (CodigoTransaccion == 4) {
						campo390 = "m390dvreav";
						campob = "m300ddevagviab";
						campoc = "m300ddevagviac";
						if (PorcentajeIR>19) {
							campob = "m300ddevagviab2";
							campoc = "m300ddevagviac2";
						}
					}
					else if (CodigoTransaccion == 27) {
						campob = "m300ddevinvspb5";
						campoc = "m300ddevinvspc5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddevinvspb1";
							campoc = "m300ddevinvspc1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddevinvspb2";
							campoc = "m300ddevinvspc2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddevinvspb4";
							campoc = "m300ddevinvspc4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddevinvspb3";
							campoc = "m300ddevinvspc3";
						}
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
					else if (CodigoTransaccion == 29) {
						campob = "m300ddeviservb5";
						campoc = "m300ddeviservc5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddeviservb1";
							campoc = "m300ddeviservc1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddeviservb2";
							campoc = "m300ddeviservc2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddeviservb4";
							campoc = "m300ddeviservc4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddeviservb3";
							campoc = "m300ddeviservc3";
						}
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
					else if (CodigoTransaccion == 20 || CodigoTransaccion == 21 || CodigoTransaccion == 22) {
						campob = "m300ddevadqbas5";
						campoc = "m300ddevadqquo5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddevadqbas1";
							campoc = "m300ddevadqquo1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddevadqbas2";
							campoc = "m300ddevadqquo2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddevadqbas4";
							campoc = "m300ddevadqquo4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddevadqbas3";
							campoc = "m300ddevadqquo3";
						}
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}   
					else System.out.println("Codigo transaccion REPERCUTIT no trobat ["+CodigoTransaccion+"]");
					if (CodigoTransaccion == 10 || CodigoTransaccion == 11) campo390 = "m390dvopintex";
					else if (CodigoTransaccion == 12) campo390 = "m390doespsujeta";
					else if (CodigoTransaccion == 13) campo390 = "m390doespnosuje";
					else if (CodigoTransaccion == 14) campo390 = "m390dvopexport";
					else if (CodigoTransaccion == 19) campo390 = "m390dvopotrexe";

				} // IVA      
				if (!"I".equals(DiferenciadorIvaRecargo)) {
					campo390 = "m390dvoprecequ";
					campob = "m300bdevreceqb6";
					campoc = "m300bdevreceqc6";
					if (PorcentajeIR<=0.6 && PorcentajeIR>0) {
						campob = "m300ddevreceqb1";
						campoc = "m300ddevreceqc1";
					}
					else if (PorcentajeIR<=1) {
						campob = "m300ddevreceqb2";
						campoc = "m300ddevreceqc2";
					}
					else if (PorcentajeIR<=1.6) {
						campob = "m300bdevreceqb5";
						campoc = "m300bdevreceqc5";
					}
					else if (PorcentajeIR<=2) {
						campob = "m300ddevreceqb4";
						campoc = "m300ddevreceqc4";
					}
					else if (PorcentajeIR<=4.5) {
						campob = "m300ddevreceqb3";
						campoc = "m300ddevreceqc3";
					}
					if (PorcentajeIR<=0.001) {
						campob = null;
						campoc = null;
						totalb = null;
						totalc = null;
						campo390 = null;
					}
				} // RECARGO
			}  // REPERCUTIT
			else {
				if (CodigoTransaccion == 1 || CodigoTransaccion == 23 || CodigoTransaccion == 27) {
					campob = "m300ddedinbcb5";
					campoc = "m300ddedinbcc5";
					if (PorcentajeIR<5 && PorcentajeIR>1) {
						campob = "m300ddedinbcb1";
						campoc = "m300ddedinbcc1";
					}
					else if (PorcentajeIR>=6 && PorcentajeIR<9) {
						campob = "m300ddedinbcb2";
						campoc = "m300ddedinbcc2";
					}          
					else if (PorcentajeIR>=9 && PorcentajeIR<13) {
						campob = "m300ddedinbcb4";
						campoc = "m300ddedinbcc4";
					}          
					else if (PorcentajeIR>=13 && PorcentajeIR<20) {
						campob = "m300ddedinbcb3";
						campoc = "m300ddedinbcc3";
					}          
					totalb = "m300ddedinbcb";
					totalc = "m300ddedinbcc";
					if (PorcentajeIR<=0.001) {
						campob = null;
						campoc = null;
						totalb = null;
						totalc = null;
					}
				}
				else if (CodigoTransaccion == 30) {
					campob = "m300ddedinbib5";
					campoc = "m300ddedinbic5";
					if (PorcentajeIR<5 && PorcentajeIR>1) {
						campob = "m300ddedinbib1";
						campoc = "m300ddedinbic1";
					}
					else if (PorcentajeIR>=6 && PorcentajeIR<9) {
						campob = "m300ddedinbib2";
						campoc = "m300ddedinbic2";
					}          
					else if (PorcentajeIR>=9 && PorcentajeIR<13) {
						campob = "m300ddedinbib4";
						campoc = "m300ddedinbic4";
					}          
					else if (PorcentajeIR>=13 && PorcentajeIR<20) {
						campob = "m300ddedinbib3";
						campoc = "m300ddedinbic3";
					}          
					totalb = "m300ddedinbib";
					totalc = "m300ddedinbic";
					if (PorcentajeIR<=0.001) {
						campob = null;
						campoc = null;
						totalb = null;
						totalc = null;
					}
				}
				else if (CodigoTransaccion == 29) {
					campob = "m300ddediservb5";
					campoc = "m300ddediservc5";
					if (PorcentajeIR<5 && PorcentajeIR>1) {
						campob = "m300ddediservb1";
						campoc = "m300ddediservc1";
					}
					else if (PorcentajeIR>=6 && PorcentajeIR<9) {
						campob = "m300ddediservb2";
						campoc = "m300ddediservc2";
					}          
					else if (PorcentajeIR>=9 && PorcentajeIR<13) {
						campob = "m300ddediservb4";
						campoc = "m300ddediservc4";
					}          
					else if (PorcentajeIR>=13 && PorcentajeIR<20) {
						campob = "m300ddediservb3";
						campoc = "m300ddediservc3";
					}          
					totalb = "m300ddediservb";
					totalc = "m300ddediservc";
					if (PorcentajeIR<=0.001) {
						campob = null;
						campoc = null;
						totalb = null;
						totalc = null;
					}
				}
				else if (CodigoTransaccion == 31) {
					campob = "m300ddedimbib5";
					campoc = "m300ddedimbic5";
					if (PorcentajeIR<5 && PorcentajeIR>1) {
						campob = "m300ddedimbib1";
						campoc = "m300ddedimbic1";
					}
					else if (PorcentajeIR>=6 && PorcentajeIR<9) {
						campob = "m300ddedimbib2";
						campoc = "m300ddedimbic2";
					}          
					else if (PorcentajeIR>=9 && PorcentajeIR<13) {
						campob = "m300ddedimbib4";
						campoc = "m300ddedimbic4";
					}          
					else if (PorcentajeIR>=13 && PorcentajeIR<20) {
						campob = "m300ddedimbib3";
						campoc = "m300ddedimbic3";
					}          
					totalb = "m300ddedimbib";
					totalc = "m300ddedimbic";
					if (PorcentajeIR<=0.001) {
						campob = null;
						campoc = null;
						totalb = null;
						totalc = null;
					}
				}
				else if (CodigoTransaccion == 32) {
					campob = "m300ddedimbcb5";
					campoc = "m300ddedimbcc5";
					if (PorcentajeIR<5 && PorcentajeIR>1) {
						campob = "m300ddedimbcb1";
						campoc = "m300ddedimbcc1";
					}
					else if (PorcentajeIR>=6 && PorcentajeIR<9) {
						campob = "m300ddedimbcb2";
						campoc = "m300ddedimbcc2";
					}          
					else if (PorcentajeIR>=9 && PorcentajeIR<13) {
						campob = "m300ddedimbcb4";
						campoc = "m300ddedimbcc4";
					}          
					else if (PorcentajeIR>=13 && PorcentajeIR<20) {
						campob = "m300ddedimbcb3";
						campoc = "m300ddedimbcc3";
					}          
					totalb = "m300ddedimbcb";
					totalc = "m300ddedimbcc";
					if (PorcentajeIR<=0.001) {
						campob = null;
						campoc = null;
						totalb = null;
						totalc = null;
					}
				}
				else if (CodigoTransaccion == 20 || CodigoTransaccion == 22) {
					campob = "m300ddedadbcb5";
					campoc = "m300ddedadbcc5";
					if (PorcentajeIR<5 && PorcentajeIR>1) {
						campob = "m300ddedadbcb1";
						campoc = "m300ddedadbcc1";
					}
					else if (PorcentajeIR>=6 && PorcentajeIR<9) {
						campob = "m300ddedadbcb2";
						campoc = "m300ddedadbcc2";
					}          
					else if (PorcentajeIR>=9 && PorcentajeIR<13) {
						campob = "m300ddedadbcb4";
						campoc = "m300ddedadbcc4";
					}          
					else if (PorcentajeIR>=13 && PorcentajeIR<20) {
						campob = "m300ddedadbcb3";
						campoc = "m300ddedadbcc3";
					}          
					totalb = "m300ddedadbcb";
					totalc = "m300ddedadbcc";
					if (PorcentajeIR<=0.001) {
						campob = null;
						campoc = null;
						totalb = null;
						totalc = null;
					}
				}
				else if (CodigoTransaccion == 21) {
					campob = "m300ddedadbib5";
					campoc = "m300ddedadbic5";
					if (PorcentajeIR<5 && PorcentajeIR>1) {
						campob = "m300ddedadbib1";
						campoc = "m300ddedadbic1";
					}
					else if (PorcentajeIR>=6 && PorcentajeIR<9) {
						campob = "m300ddedadbib2";
						campoc = "m300ddedadbic2";
					}          
					else if (PorcentajeIR>=9 && PorcentajeIR<13) {
						campob = "m300ddedadbib4";
						campoc = "m300ddedadbic4";
					}          
					else if (PorcentajeIR>=13 && PorcentajeIR<20) {
						campob = "m300ddedadbib3";
						campoc = "m300ddedadbic3";
					}          
					totalb = "m300ddedadbib";
					totalc = "m300ddedadbic";
					if (PorcentajeIR<=0.001) {
						campob = null;
						campoc = null;
						totalb = null;
						totalc = null;
					}
				}
				else if (CodigoTransaccion == 35) {
					campob = "m300ddedragpb";
					campoc = "m300ddedragp";
				}
				else if (CodigoTransaccion == 36) campoc = "m300ddedrinv";
				else if (CodigoTransaccion == 10 || CodigoTransaccion == 11) campoc = "m300ddeventbas";
				else if (CodigoTransaccion == 14) campoc = "m300ddevexpbas";
				else if (CodigoTransaccion == 13) campoc = "m300ddevondbas";
				else System.out.println("Codigo transaccion SOPORTAT no trobat ["+CodigoTransaccion+"]");
			}// SOPORTAT
			if (campo390!=null) {
				Double val = ht.get(campo390);
				double importe390 = BaseTotal;
				if (val != null) importe390 += val.doubleValue();
				ht390.put(campo390,new Double(importe390));
			}
			if (campob!=null) {
				if (campob.startsWith("m300b")) {
					Double val = htb.get(campob);
					if (val != null) valorb += val.doubleValue();
					htb.put(campob,new Double(valorb));					
				}
				else {
					Double val = ht.get(campob);
					if (val != null) valorb += val.doubleValue();
					ht.put(campob,new Double(valorb));
				}
			}
			if (campoc!=null) {
				if (campoc.startsWith("m300b")) {
					Double val = htb.get(campoc);
					if (val != null) valorc += val.doubleValue();
					htb.put(campoc,new Double(valorc));					
				}
				else {
					Double val = ht.get(campoc);
					if (val != null) valorc += val.doubleValue();
					ht.put(campoc,new Double(valorc));
				}
			}
			if (totalc!=null) {
				Double val = ht.get(totalc);
				if (val != null) CuotaTotal += val.doubleValue();
				ht.put(totalc,new Double(CuotaTotal));
			}
			if (totalb!=null) {
				Double val = ht.get(totalb);
				if (val != null) BaseTotal += val.doubleValue();
				ht.put(totalb,new Double(BaseTotal));
			}
		}
		sdes.close();
		if (ht.size()>0) {
			Insert ides = new Insert (connModasp,"MOD300DES");
			ides.valor("m300ddominio",dominio);
			ides.valor("m300dnif",nif);
			ides.valor("m300dejercicio",ejer);
			ides.valor("m300dperiodo",per);
			ides.valor("m300dgrupo",0);
			ides.valor("m300dactividad",1);
			for (java.util.Enumeration<String> e = ht.keys() ; e.hasMoreElements() ;) {
				String campo = e.nextElement();
				Double val = ht.get(campo);
				if (val!=null && val.doubleValue()!=0) ides.valor(campo,val.doubleValue());
			}      
			bOk = ides.execute();
		}
		if (bOk && htb.size()>0) {
			Insert ides = new Insert (connModasp,"MOD300DESB");
			ides.valor("m300bdominio",dominio);
			ides.valor("m300bnif",nif);
			ides.valor("m300bejercicio",ejer);
			ides.valor("m300bperiodo",per);
			ides.valor("m300bgrupo",0);
			ides.valor("m300bactividad",1);
			for (java.util.Enumeration<String> e = htb.keys() ; e.hasMoreElements() ;) {
				String campo = e.nextElement();
				Double val = htb.get(campo);
				if (val!=null && val.doubleValue()!=0) ides.valor(campo,val.doubleValue());
			}
			bOk = ides.execute();
		}
		if (bOk && ht390.size()>0) {
			Insert ides = new Insert (connModasp,"MOD390DES");
			ides.valor("m390dnif",nif);
			ides.valor("m390dejercicio",ejer);
			ides.valor("m390dperiodo",per);
			ides.valor("m390dactividad",1);
			for (java.util.Enumeration<String> e = ht390.keys() ; e.hasMoreElements() ;) {
				String campo = e.nextElement();
				Double val = ht390.get(campo);
				if (val!=null && val.doubleValue()!=0) ides.valor(campo,val.doubleValue());
			}      
			bOk = ides.execute();
		}
		return bOk;
	}
	private String getPeriodo(int periodo,int periodicidad) {
		String periode = "";
		if (periodicidad==0) periode = Numero.format(periodo,"00");
		else if (periodicidad==1) periode = Numero.format(periodo,"0")+"T";
		else if (periodicidad==3) periode = "0A";
		else if (periodicidad==5) periode = Numero.format(periodo,"0")+"P";
		return periode;
	}

	private boolean cargarDatosNif (String nifEA,String codigoCDP) {
		Select snifes     = new Select(connEA);
		Table  tbnifes    = new Table(snifes,"nifes");
		Table  tbcdp      = new Table(snifes,"cdp");
		Table  tbdeleg    = new Table(snifes,"delhacienda");
		Table  tbadmin    = new Table(snifes,"admhacienda");
		Table  tbprovin   = new Table(snifes,"provincia");
		ccfdcdpaeatdele   = new Field(snifes,tbcdp,"cdpaeatdele");
		ccfdadministra    = new Field(snifes,tbadmin,"ahdesc");
		ccfddelegacio     = new Field(snifes,tbdeleg,"dhdesc");
		ccfdcdpaeatadm    = new Field(snifes,tbcdp,"cdpaeatadm");
		ccfddatnombre     = new Field(snifes,tbnifes,"datnombre");
		ccfddatapell1     = new Field(snifes,tbnifes,"datapell1");
		ccfddatapell2     = new Field(snifes,tbnifes,"datapell2");
		ccfddatsiglas     = new Field(snifes,tbnifes,"datsiglas");
		ccfddatvia        = new Field(snifes,tbnifes,"datvia");
		ccfddatnum        = new Field(snifes,tbnifes,"datnum");
		ccfddatpuerta     = new Field(snifes,tbnifes,"datletra");
		ccfddatesc        = new Field(snifes,tbnifes,"datesc");
		ccfddatpiso       = new Field(snifes,tbnifes,"datpiso");
		ccfddatpobla      = new Field(snifes,tbnifes,"datpobla");
		ccfddatcpos       = new Field(snifes,tbnifes,"datcpos");
		ccfddattel        = new Field(snifes,tbnifes,"dattel");
		ccfddatcodprov    = new Field(snifes,tbnifes,"datprov");
		ccfdprovincia     = new Field(snifes,tbprovin,"pvdesc");
		ccfdletetiq       = new Field(snifes,tbnifes,"datletraseti");
		snifes.setFrom("(((nifes INNER JOIN cdp ON nifes.danifcif=cdp.cdpnifcif) "+
				"LEFT OUTER JOIN delhacienda ON cdp.cdpaeatdele=delhacienda.dhcodigo) "+
				"LEFT OUTER JOIN admhacienda ON cdp.cdpaeatdele=admhacienda.ahdele AND cdp.cdpaeatadm=admhacienda.ahcodigo) "+
				"LEFT OUTER JOIN provincia on nifes.datprov=provincia.pvcodigo");
		snifes.setWhere(" danifcif='"+nifEA+"' and cdpcodi='"+codigoCDP+"'");
		snifes.setOrder("cdpaeatdele DESC");
		snifes.execute();
		return !snifes.isEof();
	}

	private int getMesModelo (String per) {
		int mes = 1;
		if ("1T".equals(per)) mes = 3;
		else if ("2T".equals(per)) mes = 6;
		else if ("3T".equals(per)) mes = 9;
		else if ("4T".equals(per)) mes = 12;
		else mes = Integer.parseInt(per);
		return mes;
	}

	private boolean altaDesgloseModelo303_14(String nif,int codEmp,int codGYC, int ejer, String liqpos, String per, int codActiv)  {
		boolean bOk = true;
		SelectorLogic sdes = new SelectorLogic(connLC);
		sdes.execute("SELECT *  FROM IOF_DesgloseModelosIva  where LiqPosicion='"+liqpos+"' and Deducible=-1 and GenSim='G' and IncidenciaIva<>-1");
		java.util.Hashtable <String,Double> ht = new java.util.Hashtable <String,Double> ();
		java.util.Hashtable <String,Double> htb = new java.util.Hashtable <String,Double> ();
		java.util.Hashtable <String,Double> ht390 = new java.util.Hashtable <String,Double> ();
		while (sdes.next()) {
			int CodigoTransaccion = sdes.getint("CodigoTransaccion");
			String IdentificadorIva = sdes.getString("IdentificadorIva");
			String DiferenciadorIvaRecargo = sdes.getString("DiferenciadorIvaRecargo");
			double PorcentajeIR = sdes.getdouble("PorcentajeIR");
			double BaseTotal = sdes.getdouble("BaseTotal");
			double CuotaTotal = sdes.getdouble("CuotaTotal");
			String tipoCriterio = sdes.getString("IOFtipocriterio");
			int rectif = sdes.getint("IOFrectif");
			String campob = null;
			double valorb = BaseTotal;
			String campoc = null;
			double valorc = CuotaTotal;
			String totalb = null;
			String totalc = null;
			String campo390 = null;
			if ("R".equals(IdentificadorIva)) {
				if ("I".equals(DiferenciadorIvaRecargo)) {
					if (rectif==-1 && (CodigoTransaccion == 16 || CodigoTransaccion == 1  || CodigoTransaccion == 2 || CodigoTransaccion == 3 || CodigoTransaccion == 4 || CodigoTransaccion == 12 || CodigoTransaccion == 24 || CodigoTransaccion == 25 || CodigoTransaccion == 26)) {
						campo390 = "m390dvopgen";
						if (CodigoTransaccion == 2 || CodigoTransaccion == 3)  campo390 = "m390dvusados";
						campob = "m300ddevmodbcb5";
						campoc = "m300ddevmodbcc5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddevmodbcb1";
							campoc = "m300ddevmodbcc1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddevmodbcb2";
							campoc = "m300ddevmodbcc2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddevmodbcb4";
							campoc = "m300ddevmodbcc4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddevmodbcb3";
							campoc = "m300ddevmodbcc3";
						}
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
							campo390 = null;
						}
					}
					else if (CodigoTransaccion == 16 || CodigoTransaccion == 1 || CodigoTransaccion == 12 || CodigoTransaccion == 24 || CodigoTransaccion == 25 || CodigoTransaccion == 26) {
						campo390 = "m390dvopgen";
						campob = "m300ddevregorb5";
						campoc = "m300ddevregorq5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddevregorb1";
							campoc = "m300ddevregorq1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddevregorb2";
							campoc = "m300ddevregorq2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddevregorb4";
							campoc = "m300ddevregorq4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddevregorb3";
							campoc = "m300ddevregorq3";
						}
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
							campo390 = null;
						}
					}
					else if (CodigoTransaccion == 2 || CodigoTransaccion == 3) {
						campo390 = "m390dvusados";
						campob = "m300ddevopintb5";
						campoc = "m300ddevopintq5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddevopintb1";
							campoc = "m300ddevopintq1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddevopintb2";
							campoc = "m300ddevopintq2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddevopintb4";
							campoc = "m300ddevopintq4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddevopintb3";
							campoc = "m300ddevopintq3";
						}
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
							campo390 = null;
						}
					}
					else if (CodigoTransaccion == 4) {
						campo390 = "m390dvreav";
						campob = "m300ddevagviab";
						campoc = "m300ddevagviac";
						if (PorcentajeIR>19) {
							campob = "m300ddevagviab2";
							campoc = "m300ddevagviac2";
						}
					}
					else if (CodigoTransaccion == 27) {
						campob = "m300ddevinvspb5";
						campoc = "m300ddevinvspc5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddevinvspb1";
							campoc = "m300ddevinvspc1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddevinvspb2";
							campoc = "m300ddevinvspc2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddevinvspb4";
							campoc = "m300ddevinvspc4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddevinvspb3";
							campoc = "m300ddevinvspc3";
						}
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
					else if (CodigoTransaccion == 29) {
						campob = "m300ddeviservb5";
						campoc = "m300ddeviservc5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddeviservb1";
							campoc = "m300ddeviservc1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddeviservb2";
							campoc = "m300ddeviservc2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddeviservb4";
							campoc = "m300ddeviservc4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddeviservb3";
							campoc = "m300ddeviservc3";
						}
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
					else if (CodigoTransaccion == 20 || CodigoTransaccion == 21 || CodigoTransaccion == 22) {
						campob = "m300ddevadqbas5";
						campoc = "m300ddevadqquo5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddevadqbas1";
							campoc = "m300ddevadqquo1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddevadqbas2";
							campoc = "m300ddevadqquo2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddevadqbas4";
							campoc = "m300ddevadqquo4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddevadqbas3";
							campoc = "m300ddevadqquo3";
						}
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
					else if (CodigoTransaccion == 10 || CodigoTransaccion == 11 || CodigoTransaccion == 54 || CodigoTransaccion == 55) campob = "m300ddeventbas";
					else if (CodigoTransaccion == 14 || CodigoTransaccion == 18 || CodigoTransaccion == 15 || CodigoTransaccion == 17) campob = "m300ddevexpbas";
					else if (CodigoTransaccion == 13 || CodigoTransaccion == 28 || CodigoTransaccion == 33) campob = "m300ddevondbas";
					else System.out.println("Codigo transaccion REPERCUTIT no trobat ["+CodigoTransaccion+"]");
					if (CodigoTransaccion == 10 || CodigoTransaccion == 11 || CodigoTransaccion == 54 || CodigoTransaccion == 55) campo390 = "m390dvopintex";
					else if (CodigoTransaccion == 13 || CodigoTransaccion == 28 || CodigoTransaccion == 33) campo390 = "m390doespnosuje";
					else if (CodigoTransaccion == 14 || CodigoTransaccion == 18 || CodigoTransaccion == 15 || CodigoTransaccion == 17) campo390 = "m390dvopexport";
				} // IVA
				if ("R".equals(DiferenciadorIvaRecargo)) {
					campo390 = "m390dvoprecequ";
					if (rectif==-1) { 
						campob = "m300bdevmodreb6";
						campoc = "m300bdevmodrec6";
						if (PorcentajeIR<=0.6 && PorcentajeIR>0) {
							campob = "m300ddevmodreb1";
							campoc = "m300ddevmodrec1";
						} 
						else if (PorcentajeIR<=1) {
							campob = "m300ddevmodreb2";
							campoc = "m300ddevmodrec2";
						}
						else if (PorcentajeIR<=1.6) {
							campob = "m300bdevmodreb5";
							campoc = "m300bdevmodrec5";
						}
						else if (PorcentajeIR<=2) {
							campob = "m300ddevmodreb4";
							campoc = "m300ddevmodrec4";
						}
						else if (PorcentajeIR<=4.5) {
							campob = "m300ddevmodreb3";
							campoc = "m300ddevmodrec3";
						}
					}
					else { 
						campob = "m300bdevreceqb6";
						campoc = "m300bdevreceqc6";
						if (PorcentajeIR<=0.6 && PorcentajeIR>0) {
							campob = "m300ddevreceqb1";
							campoc = "m300ddevreceqc1";
						}
						else if (PorcentajeIR<=1) {
							campob = "m300ddevreceqb2";
							campoc = "m300ddevreceqc2";
						}
						else if (PorcentajeIR<=1.6) {
							campob = "m300bdevreceqb5";
							campoc = "m300bdevreceqc5";
						}
						else if (PorcentajeIR<=2) {
							campob = "m300ddevreceqb4";
							campoc = "m300ddevreceqc4";
						}
						else if (PorcentajeIR<=4.5) {
							campob = "m300ddevreceqb3";
							campoc = "m300ddevreceqc3";
						}
					}
					if (PorcentajeIR<=0.001) {
						campob = null;
						campoc = null;
						totalb = null;
						totalc = null;
						campo390 = null;
					}
				} // RECARGO
			}  // REPERCUTIT
			else if ("D".equals(tipoCriterio)) {
				if (CodigoTransaccion == 1 || CodigoTransaccion == 27) {
					if (rectif==-1) {
						campob = "m300ddedoirceqb";
						campoc = "m300ddedoirceqq";
					}
					else {
						campob = "m300ddedinbcb5";
						campoc = "m300ddedinbcc5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddedinbcb1";
							campoc = "m300ddedinbcc1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddedinbcb2";
							campoc = "m300ddedinbcc2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddedinbcb4";
							campoc = "m300ddedinbcc4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddedinbcb3";
							campoc = "m300ddedinbcc3";
						}
						totalb = "m300ddedinbcb";
						totalc = "m300ddedinbcc";
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
				}
				else if (CodigoTransaccion == 30) {
					if (rectif==-1) {
						campob = "m300ddedoieqbib";
						campoc = "m300ddedoieqbiq";
					}
					else {
						campob = "m300ddedinbib5";
						campoc = "m300ddedinbic5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddedinbib1";
							campoc = "m300ddedinbic1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddedinbib2";
							campoc = "m300ddedinbic2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddedinbib4";
							campoc = "m300ddedinbic4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddedinbib3";
							campoc = "m300ddedinbic3";
						}
						totalb = "m300ddedinbib";
						totalc = "m300ddedinbic";
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
				}
				else if (CodigoTransaccion == 31) {
					if (rectif==-1) {
						campob = "m300ddedimrceqb";
						campoc = "m300ddedimrceqq";
					}
					else {
						campob = "m300ddedimbib5";
						campoc = "m300ddedimbic5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddedimbib1";
							campoc = "m300ddedimbic1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddedimbib2";
							campoc = "m300ddedimbic2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddedimbib4";
							campoc = "m300ddedimbic4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddedimbib3";
							campoc = "m300ddedimbic3";
						}
						totalb = "m300ddedimbib";
						totalc = "m300ddedimbic";
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
				}
				else if (CodigoTransaccion == 32) {
					if (rectif==-1) {
						campob = "m300ddedimeqbib";
						campoc = "m300ddedimeqbiq";
					}
					else {
						campob = "m300ddedimbcb5";
						campoc = "m300ddedimbcc5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddedimbcb1";
							campoc = "m300ddedimbcc1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddedimbcb2";
							campoc = "m300ddedimbcc2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddedimbcb4";
							campoc = "m300ddedimbcc4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddedimbcb3";
							campoc = "m300ddedimbcc3";
						}
						totalb = "m300ddedimbcb";
						totalc = "m300ddedimbcc";
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
				}
				else if (CodigoTransaccion == 29) {
					if (rectif==-1) {
						campob = "m300ddedairceqb";
						campoc = "m300ddedairceqq";
					}
					else {
						campob = "m300ddediservb5";
						campoc = "m300ddediservc5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddediservb1";
							campoc = "m300ddediservc1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddediservb2";
							campoc = "m300ddediservc2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddediservb4";
							campoc = "m300ddediservc4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddediservb3";
							campoc = "m300ddediservc3";
						}
						totalb = "m300ddediservb";
						totalc = "m300ddediservc";
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
				}
				else if (CodigoTransaccion == 20 || CodigoTransaccion == 22) {
					if (rectif==-1) {
						campob = "m300ddedairceqb";
						campoc = "m300ddedairceqq";
					}
					else {
						campob = "m300ddedadbcb5";
						campoc = "m300ddedadbcc5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddedadbcb1";
							campoc = "m300ddedadbcc1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddedadbcb2";
							campoc = "m300ddedadbcc2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddedadbcb4";
							campoc = "m300ddedadbcc4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddedadbcb3";
							campoc = "m300ddedadbcc3";
						}
						totalb = "m300ddedadbcb";
						totalc = "m300ddedadbcc";
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
				}
				else if (CodigoTransaccion == 21) {
					if (rectif==-1) {
						campob = "m300ddedaieqbib";
						campoc = "m300ddedaieqbiq";
					}
					else {
						campob = "m300ddedadbib5";
						campoc = "m300ddedadbic5";
						if (PorcentajeIR<5 && PorcentajeIR>1) {
							campob = "m300ddedadbib1";
							campoc = "m300ddedadbic1";
						}
						else if (PorcentajeIR>=6 && PorcentajeIR<9) {
							campob = "m300ddedadbib2";
							campoc = "m300ddedadbic2";
						}
						else if (PorcentajeIR>=9 && PorcentajeIR<13) {
							campob = "m300ddedadbib4";
							campoc = "m300ddedadbic4";
						}
						else if (PorcentajeIR>=13 && PorcentajeIR<20) {
							campob = "m300ddedadbib3";
							campoc = "m300ddedadbic3";
						}
						totalb = "m300ddedadbib";
						totalc = "m300ddedadbic";
						if (PorcentajeIR<=0.001) {
							campob = null;
							campoc = null;
							totalb = null;
							totalc = null;
						}
					}
				}
				else if (CodigoTransaccion == 35) {
					if (rectif==-1) {
						campob = "m300ddedcmrceqb";
						campoc = "m300ddedcmrceqq";
					}
					else {
						campob = "m300ddedragpb";
						campoc = "m300ddedragp";
					}
				}
				else if (CodigoTransaccion == 36) campoc = "m300ddedrinv";
				else System.out.println("Codigo transaccion SOPORTAT no trobat ["+CodigoTransaccion+"]");
			}
			if (campo390!=null) {
				Double val = ht.get(campo390);
				double importe390 = BaseTotal;
				if (val != null) importe390 += val.doubleValue();
				ht390.put(campo390,new Double(importe390));
			}
			if (campob!=null) {
				if (campob.startsWith("m300b")) {
					Double val = htb.get(campob);
					if (val != null) valorb += val.doubleValue();
					htb.put(campob,new Double(valorb));
				}
				else {
					Double val = ht.get(campob);
					if (val != null) valorb += val.doubleValue();
					ht.put(campob,new Double(valorb));
				}
			}
			if (campoc!=null) {
				if (campoc.startsWith("m300b")) {
					Double val = htb.get(campoc);
					if (val != null) valorc += val.doubleValue();
					htb.put(campoc,new Double(valorc));
				}
				else {
					Double val = ht.get(campoc);
					if (val != null) valorc += val.doubleValue();
					ht.put(campoc,new Double(valorc));
				}
			}
			if (totalc!=null) {
				Double val = ht.get(totalc);
				if (val != null) CuotaTotal += val.doubleValue();
				ht.put(totalc,new Double(CuotaTotal));
			}
			if (totalb!=null) {
				Double val = ht.get(totalb);
				if (val != null) BaseTotal += val.doubleValue();
				ht.put(totalb,new Double(BaseTotal));
			}
		}
		sdes.close();
		if (ht.size()>0) {
			Insert ides = new Insert (connModasp,"MOD300DES");
			ides.valor("m300ddominio",dominio);
			ides.valor("m300dnif",nif);
			ides.valor("m300dejercicio",ejer);
			ides.valor("m300dperiodo",per);
			ides.valor("m300dgrupo","0");
			ides.valor("m300dactividad",codActiv);
			for (java.util.Enumeration<String> e = ht.keys() ; e.hasMoreElements() ;) {
				String campo = e.nextElement();
				Double val = ht.get(campo);
				if (val!=null && val.doubleValue()!=0) ides.valor(campo,val.doubleValue());
			}
			bOk = ides.execute();
			if (!bOk) sError = "No se ha podido grabar la tabla MOD300DES de la empresa "+codEmp+", actividad "+codActiv+", ejercicio "+ejer+" y periodo "+per+".";
		}
		if (bOk && htb.size()>0) {
			Insert ides = new Insert (connModasp,"MOD300DESB");
			ides.valor("m300bdominio",dominio);
			ides.valor("m300bnif",nif);
			ides.valor("m300bejercicio",ejer);
			ides.valor("m300bperiodo",per);
			ides.valor("m300bgrupo","0");
			ides.valor("m300bactividad",codActiv);
			for (java.util.Enumeration<String> e = htb.keys() ; e.hasMoreElements() ;) {
				String campo = e.nextElement();
				Double val = htb.get(campo);
				if (val!=null && val.doubleValue()!=0) ides.valor(campo,val.doubleValue());
			}
			bOk = ides.execute();
			if (!bOk) sError = "No se ha podido grabar la tabla MOD300DESB de la empresa "+codEmp+", actividad "+codActiv+", ejercicio "+ejer+" y periodo "+per+".";
		}

		if (bOk && ht390.size()>0) {
			Insert ides = new Insert (connModasp,"MOD390DES");
			ides.valor("m390dnif",nif);
			ides.valor("m390dejercicio",ejer);
			ides.valor("m390dperiodo",per);
			ides.valor("m390dactividad",codActiv);
			for (java.util.Enumeration<String> e = ht390.keys() ; e.hasMoreElements() ;) {
				String campo = e.nextElement();
				Double val = ht390.get(campo);
				if (val!=null && val.doubleValue()!=0) ides.valor(campo,val.doubleValue());
			}
			bOk = ides.execute();
			if (!bOk) sError = "No se ha podido grabar la tabla MOD390DES de la empresa "+codEmp+", actividad "+codActiv+", ejercicio "+ejer+" y periodo "+per+".";
		}
		return bOk;
	}
	private boolean altaModelo303_14(String nif,int codEmp,int codGYC, int ejer)  {
		boolean bOk = true;
		String codiCDP = dominio.substring(0,6)+Numero.format(codGYC,"000000");
		SelectorLogic s303b = new SelectorLogic(connLC);
		String sql = " and IOF_PortadaModelosIVa.Ejercicio="+ejer;
		sql += " and IOF_PortadaModelosIVa.Ejercicio>2013 and IOF_PortadaModelosIVa.hoja = 1";
		s303b.execute("SELECT *  FROM IOF_PortadaModelosIVa INNER JOIN Personas ON IOF_PortadaModelosIVa.GuidPersona=Personas.GuidPersona where Personas.DNI='"+nif+"' and IOF_PortadaModelosIVa.CodigoModeloImp='303'"+sql+" order by IOF_PortadaModelosIVa.Ejercicio, IOF_PortadaModelosIVa.Periodo");
		while (s303b.next() && bOk) {
			String liqpos = s303b.getString("LiqPosicionContador");
			String per = getPeriodo(s303b.getint("Periodo"),s303b.getint("IOFCodigoPeriodicidad"));
			if (cargarDatosNif(nif,codiCDP)) {
				mae.modasp.general.Modasp.borrarRegModelo("303", nif, ejer, per, true);
				mae.modasp.general.Modasp.borrarRegModnifcdp("303", nif, ejer, per);
				mae.modasp.general.Modasp.borrarRegModestado("303", nif, ejer, per);

				Selector scheck = new Selector(connModasp);
				scheck.execute("Select * from MOD300 where m300nif='"+nif+"' and m300ejercicio="+ejer+" and m300periodo='"+per+"'");
				if (!scheck.next()) {
					Insert i303 = new Insert (connModasp,"MOD300");
					i303.valor("m300dominio",dominio);
					i303.valor("m300ejercicio",ejer);
					i303.valor("m300periodo",per);
					i303.valor("m300mesmodelo",getMesModelo(per));
					i303.valor("m300modelo","303");
					i303.valor("m300nif",nif);
					SelectorLogic s303 = new SelectorLogic(connLC);
					String where = " IOF_PortadaModelosIVa.CodigoModeloImp='303' and IOF_PortadaModelosIVa.ejercicio="+ejer+" and IOF_PortadaModelosIVa.periodo="+s303b.getint("Periodo");
					where += " and IOF_PortadaModelosIVa.IOFCodigoPeriodicidad="+ s303b.getint("IOFCodigoPeriodicidad")+" and IOF_PortadaModelosIVa.codigoterritorio="+s303b.getint("codigoterritorio");
					where += " and IOF_PortadaModelosIVa.complementaria="+s303b.getint("complementaria")+" and IOF_PortadaModelosIVa.codigoempresa="+codEmp;
					s303.execute("SELECT *  FROM IOF_PortadaModelosIVa where "+where+" order by IOF_PortadaModelosIVa.hoja");
					double resultado = 0.0;
					String banco = "";
					String sucursal = "";
					String digito = "";
					String cuenta  = "";
					java.util.Date fechaImpreso = null;
					String m300tipodecl = "";
					while (s303.next() && bOk) {
						int hoja = s303.getint("hoja");
						if (hoja==1) {
							resultado = s303.getdouble("resultado");
							fechaImpreso = getFechaImpreso(s303.getDate("FechaListado"),ejer,per);
							i303.valor("m300deleg",ccfddelegacio.getString());
							i303.valor("m300admon",retallaString(ccfdadministra.getString(),30));
							i303.valor("m300codadmon",Util.formateoNumero("00",ccfdcdpaeatdele.getInteger())+
									Util.formateoNumero("000",ccfdcdpaeatadm.getInteger()));
							i303.valor("m300apellidos",getApellidos());
							i303.valor("m300nombre",retallaString(ccfddatnombre.getString(),15));
							if (ccfddatsiglas.getString().length()>0) i303.valor("m300siglas",ccfddatsiglas.getString());
							i303.valor("m300calle",retallaString(ccfddatvia.getString(),17));
							i303.valor("m300numero",ccfddatnum.getString());
							i303.valor("m300puerta",ccfddatpuerta.getString());
							i303.valor("m300escalera",ccfddatesc.getString());
							i303.valor("m300piso",ccfddatpiso.getString());
							i303.valor("m300cpostal",ccfddatcpos.getString());
							i303.valor("m300provincia",retallaString(ccfdprovincia.getString(),15));
							i303.valor("m300municipio",retallaString(ccfddatpobla.getString(),20));
							i303.valor("m300telefono",retallaString(ccfddattel.getString(),9));
							i303.valor("m300letetiq",getLetrasEtiq(ejer,nif));
							i303.valor("m300munifirma",getSelString(s303,"lugar",30));
							i303.valor("m300dia",Maefc.getDay(fechaImpreso));
							i303.valor("m300mes",Fecha.nombreMes(Maefc.getMonth(fechaImpreso)));
							i303.valor("m300anyo",Maefc.getYear(fechaImpreso));
							i303.valor("m300fecha",fechaImpreso);
							i303.valor("m300percont",getSelString(s303,"NombreContacto",100));
							i303.valor("m300telcont",getSelString(s303,"TelefonoContacto",9));
							i303.valor("m300observa","Convertido de LOGICCLASS");
							i303.valor("m300presconj","2");
							i303.valor("m300concacre","2");
							i303.valor("m300revproesp","2");
							i303.valor("m300devmensual","2");
							i303.valor("m300regsim","2");
							i303.valor("m300recc","2");
							i303.valor("m300destrecc","2");
							i303.valor("m300apliproesp","2");
							i303.valor("m300cruzcomp","0");
							if (s303.getint("SinActividad") == -1) i303.valor("m300sinactiv","X");
							if (s303.getint("IOFRegistroDevIVA") == -1) i303.valor("m300devmensual","1");
							if (s303.getint("marca04") == -1) i303.valor("m300regsim","1"); 
							if (s303.getint("marca05") == -1) i303.valor("m300presconj","1"); 
							if (s303.getint("marca06") == -1) i303.valor("m300apliproesp","1"); 
							if (s303.getint("marca07") == -1) i303.valor("m300revproesp","1"); 
							if (s303.getint("IOFcriteriocaja") == -1) i303.valor("m300recc","1"); 
							double m300devivbase1 = s303.getdouble("Importe01");
							double m300devivbase2 = s303.getdouble("Importe03");
							double m300devivbase3 = s303.getdouble("Importe05");
							if (m300devivbase1!=0) {
								i303.valor("m300devivbase1",m300devivbase1);
								i303.valor("m300devivpor1",s303.getdouble("Porcen01"));
								i303.valor("m300devivcuota1",s303.getdouble("Importe02"));
							}
							if (m300devivbase2!=0) {
								i303.valor("m300devivbase2",m300devivbase2);
								i303.valor("m300devivpor2",s303.getdouble("Porcen02"));
								i303.valor("m300devivcuota2",s303.getdouble("Importe04"));
							}
							if (m300devivbase3!=0) {
								i303.valor("m300devivbase3",m300devivbase3);
								i303.valor("m300devivpor3",s303.getdouble("Porcen03"));
								i303.valor("m300devivcuota3",s303.getdouble("Importe06"));
							}
							if (s303.getdouble("Importe13")!=0) i303.valor("m300devadqbase",s303.getdouble("Importe13"));
							if (s303.getdouble("Importe14")!=0) i303.valor("m300devadqquota",s303.getdouble("Importe14"));
							if (s303.getdouble("Importe09")!=0) i303.valor("m300devispb",s303.getdouble("Importe09"));
							if (s303.getdouble("Importe10")!=0) i303.valor("m300devispc",s303.getdouble("Importe10"));
							if (s303.getdouble("Importe11")!=0) i303.valor("m300devmbqb",s303.getdouble("Importe11"));
							if (s303.getdouble("Importe12")!=0) i303.valor("m300devmbqc",s303.getdouble("Importe12"));
							double m300devrebase1 = s303.getdouble("Importe07");
							double m300devrebase2 = s303.getdouble("Importe09");
							double m300devrebase3 = s303.getdouble("Importe11");
							if (m300devrebase1!=0) {
								i303.valor("m300devrebase1",m300devrebase1);
								i303.valor("m300devrepor1",s303.getdouble("Porcen04"));
								i303.valor("m300devrecuota1",s303.getdouble("Importe08"));
							}
							if (m300devrebase2!=0) {
								i303.valor("m300devrebase2",m300devrebase2);
								i303.valor("m300devrepor2",s303.getdouble("Porcen05"));
								i303.valor("m300devrecuota2",s303.getdouble("Importe10"));
							}
							if (m300devrebase3!=0) {
								i303.valor("m300devrebase3",m300devrebase3);
								i303.valor("m300devrepor3",s303.getdouble("Porcen06"));
								i303.valor("m300devrecuota3",s303.getdouble("Importe12"));
							}
							if (s303.getdouble("Importe15")!=0) i303.valor("m300dedopinb",s303.getdouble("Importe15"));
							if (s303.getdouble("Importe16")!=0) i303.valor("m300dedopin",s303.getdouble("Importe16"));
							if (s303.getdouble("Importe17")!=0) i303.valor("m300dedopinivb",s303.getdouble("Importe17"));
							if (s303.getdouble("Importe18")!=0) i303.valor("m300dedopinivc",s303.getdouble("Importe18"));
							if (s303.getdouble("Importe19")!=0) i303.valor("m300dedimporb",s303.getdouble("Importe19"));
							if (s303.getdouble("Importe20")!=0) i303.valor("m300dedimpor",s303.getdouble("Importe20"));
							if (s303.getdouble("Importe21")!=0) i303.valor("m300dedimpivb",s303.getdouble("Importe21"));
							if (s303.getdouble("Importe22")!=0) i303.valor("m300dedimpivc",s303.getdouble("Importe22"));
							if (s303.getdouble("Importe23")!=0) i303.valor("m300dedadqb",s303.getdouble("Importe23"));
							if (s303.getdouble("Importe24")!=0) i303.valor("m300dedadq",s303.getdouble("Importe24"));
							if (s303.getdouble("Importe25")!=0) i303.valor("m300dedadqivb",s303.getdouble("Importe25"));
							if (s303.getdouble("Importe26")!=0) i303.valor("m300dedadqivc",s303.getdouble("Importe26"));
							if (s303.getdouble("Importe27")!=0) i303.valor("m300dedragp",s303.getdouble("Importe27"));
							if (s303.getdouble("Importe28")!=0) i303.valor("m300dedrinv",s303.getdouble("Importe28"));
							if (s303.getdouble("Importe29")!=0) i303.valor("m300regpro",s303.getdouble("Importe29"));
							if (s303.getdouble("Importe30")!=0) i303.valor("m300entregas",s303.getdouble("Importe30"));
							if (s303.getdouble("Importe31")!=0) i303.valor("m300exporta",s303.getdouble("Importe31"));
							if (s303.getdouble("Importe32")!=0) i303.valor("m300opnosujdev",s303.getdouble("Importe32"));
							i303.valor("m300totcuotdev",s303.getdouble("TotalDevengado"));
							i303.valor("m300totded",s303.getdouble("TotalDeducible"));
							i303.valor("m300resreggen",s303.getdouble("importe33"));
							i303.valor("m300ressuma",s303.getdouble("DiferenciaRepSop"));
							i303.valor("m300resultado",s303.getdouble("importe35"));
							i303.valor("m300atradmonpor",s303.getdouble("PorcenAtribuible"));
							i303.valor("m300atradmon",s303.getdouble("ImporteAtribuible"));
							i303.valor("m300estydiput",s303.getdouble("RegularizacionAnual"));
							i303.valor("m300cuotcompen",s303.getdouble("CompensacionPerAnt"));
							i303.valor("m300adeducir",s303.getdouble("resultadoliqant"));
							i303.valor("m300resultliq",resultado);
							m300tipodecl = "I";
							int fp = s303.getint("IOFFormaDePago");
							banco = s303.getString("CodigoBanco");
							sucursal = s303.getString("CodigoOficina");
							if (banco!=null && banco.trim().length()>0 && Util.isNumero(banco)) 
								banco = Numero.format(Integer.valueOf(banco),"0000");                          
							if (sucursal!=null && sucursal.trim().length()>0 && Util.isNumero(sucursal)) 
								sucursal = Numero.format(Integer.valueOf(sucursal),"0000");
							digito = getSelString(s303,"Dc");
							cuenta  = getSelString(s303,"NumeroCuenta");
							if (s303.getdouble("aingresar")!=0) {
								m300tipodecl = "P";
								if (fp == 3) m300tipodecl = "U";
								if (fp==2 || fp==3) {
									if (banco!=null && banco.trim().length()>0 && Util.isNumero(banco)) {
										i303.valor("m300ibanpaisi","ES");
										i303.valor("m300ibandci",mae.modasp.general.Modasp.getDCIBAN(banco+sucursal+digito+cuenta));
									}
									i303.valor("m300entingreso",banco);
									i303.valor("m300ofiingreso",sucursal);
									i303.valor("m300digiingreso",digito);
									i303.valor("m300ctaingreso",cuenta);
								}
							}
							else if (s303.getdouble("acompensar")!=0) m300tipodecl = "C";
							else if (s303.getdouble("adevolver")!=0) {
								if (banco!=null && banco.trim().length()>0 && Util.isNumero(banco)) {
									i303.valor("m300ibanpaisi","ES");
									i303.valor("m300ibandci",mae.modasp.general.Modasp.getDCIBAN(banco+sucursal+digito+cuenta));
								}
								i303.valor("m300entingreso",banco);
								i303.valor("m300ofiingreso",sucursal);
								i303.valor("m300digiingreso",digito);
								i303.valor("m300ctaingreso",cuenta);
								m300tipodecl = "N";
							}
							i303.valor("m300tipodecl",m300tipodecl);
							if (s303.getint("SinActividad") == -1) i303.valor("m300sinactiv","X");
							if (s303.getint("Complementaria") == 1) {
								i303.valor("m300cruzcomp","X");
								String CodigoElectronicoAnt = s303.getString("CodigoElectronicoAnt");
								String NumJustLiqAnt = s303.getString("NumJustLiqAnt");
								if (NumJustLiqAnt!=null && NumJustLiqAnt.length()>0) i303.valor("m300numjustif",NumJustLiqAnt);
								else if (CodigoElectronicoAnt!=null && CodigoElectronicoAnt.length()>0) i303.valor("m300numjustif",CodigoElectronicoAnt);
							}
						}
						else if (hoja==2) {
							if (s303.getdouble("Importe01")!=0) i303.valor("m300devispb",s303.getdouble("Importe01"));
							if (s303.getdouble("Importe02")!=0) i303.valor("m300devispc",s303.getdouble("Importe02"));
							if (s303.getdouble("Importe03")!=0) i303.valor("m300devmbqb",s303.getdouble("Importe03"));
							if (s303.getdouble("Importe04")!=0) i303.valor("m300devmbqc",s303.getdouble("Importe04"));
							if (s303.getdouble("Importe05")!=0) i303.valor("m300devmbqrb",s303.getdouble("Importe05"));
							if (s303.getdouble("Importe06")!=0) i303.valor("m300devmbqrc",s303.getdouble("Importe06"));
							if (s303.getdouble("Importe07")!=0) i303.valor("m300dedrectib",s303.getdouble("Importe07"));
							if (s303.getdouble("Importe08")!=0) i303.valor("m300dedrectic",s303.getdouble("Importe08"));
							if (s303.getdouble("Importe09")!=0) i303.valor("m300iadevb",s303.getdouble("Importe09"));
							if (s303.getdouble("Importe10")!=0) i303.valor("m300iadevc",s303.getdouble("Importe10"));
							if (s303.getdouble("Importe11")!=0) i303.valor("m300iasopb",s303.getdouble("Importe11"));
							if (s303.getdouble("Importe12")!=0) i303.valor("m300iasopc",s303.getdouble("Importe12"));
						}
						else if (hoja==3) {
							if (s303.getdouble("totaldevengado")!=0 || s303.getdouble("totaldeducible")!=0) {
								Insert i303rs = new Insert (connModasp,"MOD303RS");
								i303rs.valor("m03acodi",0);
								i303rs.valor("m03adominio",dominio);
								i303rs.valor("m03anif",nif);
								i303rs.valor("m03aejercicio",ejer);
								i303rs.valor("m03aperiodo",per);
								i303rs.valor("m03anumpag",1);
								i303rs.valor("m03adevtotal",s303.getdouble("totaldevengado"));
								i303rs.valor("m03adedtotal",s303.getdouble("totaldeducible"));
								i303rs.valor("m03arsresul",s303.getdouble("resultado"));
								i303rs.valor("m03aadqintra",s303.getdouble("importe01"));
								i303rs.valor("m03aentregas",s303.getdouble("importe02"));
								i303rs.valor("m03adevisp",s303.getdouble("importe03"));
								i303rs.valor("m03aadqfijos",s303.getdouble("importe04"));
								i303rs.valor("m03aregul",s303.getdouble("importe05"));
								i303rs.valor("m03a123sumaing",s303.getdouble("importe06"));
								SelectorLogic sIvaAgr = new SelectorLogic(connLC);
								sIvaAgr.execute("Select * from IOF_ActSimAGFModelosIVA where liqposicion='"+liqpos+"' order by idactividad");
								int nAct = 0;
								while (sIvaAgr.next() && nAct<2) {
									nAct++;
									i303rs.valor("m03aa"+String.valueOf(nAct)+"codigo",getCodAgr(ejer,nif,getCodGEyCE(sIvaAgr.getint("idagriva"))));
									i303rs.valor("m03aa"+String.valueOf(nAct)+"numact",sIvaAgr.getint("idagriva"));
									i303rs.valor("m03aa"+String.valueOf(nAct)+"voling",sIvaAgr.getdouble("volingresos"));
									i303rs.valor("m03aa"+String.valueOf(nAct)+"indice",sIvaAgr.getdouble("porcentajeagriva"));
									i303rs.valor("m03aa"+String.valueOf(nAct)+"cuodev",sIvaAgr.getdouble("cuotadevengada"));
									if ("4T".equals(per)) {
										i303rs.valor("m03aa"+String.valueOf(nAct)+"4cuosop",sIvaAgr.getdouble("cuotasoportada"));
										i303rs.valor("m03aa"+String.valueOf(nAct)+"4cuoanu",sIvaAgr.getdouble("cuotaderivada"));
									}
									else {
										i303rs.valor("m03aa"+String.valueOf(nAct)+"123por",sIvaAgr.getdouble("porcentajetrimes"));
										i303rs.valor("m03aa"+String.valueOf(nAct)+"123incta",sIvaAgr.getdouble("ingresoacuenta"));
									}
								}
								sIvaAgr.close();
								SelectorLogic sIvaMod = new SelectorLogic(connLC);
								sIvaMod.execute("Select * from IOF_ActSimModelosIVA where liqposicion='"+liqpos+"' order by idactividad");
								nAct = 0;
								while (sIvaMod.next() && nAct<2) {
									nAct++;
									i303rs.valor("m03ab"+String.valueOf(nAct)+"codigo",getCodNoAgr(ejer,nif,sIvaMod.getint("codigoepigrafe")));
									i303rs.valor("m03ab"+String.valueOf(nAct)+"epigrafe",sIvaMod.getint("codigoepigrafe"));
									for (int kk=1;kk<8;kk++) {
										if (sIvaMod.getdouble("unidadesFin_Iva_"+String.valueOf(kk))!=0) {
											i303rs.valor("m03ab"+String.valueOf(nAct)+"moduni"+String.valueOf(kk),sIvaMod.getdouble("unidadesFin_Iva_"+String.valueOf(kk)));
											i303rs.valor("m03ab"+String.valueOf(nAct)+"modimp"+String.valueOf(kk),sIvaMod.getdouble("cuotadevengadafin_iva_"+String.valueOf(kk)));
										}
									}
									i303rs.valor("m03ab"+String.valueOf(nAct)+"cuodeven",sIvaMod.getdouble("cuotadevengada"));
									if (sIvaMod.getdouble("reduccion1")!=0) i303rs.valor("m03ab"+String.valueOf(nAct)+"reduc",sIvaMod.getdouble("reduccion1"));
									if ("4T".equals(per)) {
										if (sIvaMod.getdouble("indicetemporadareg_iva")  !=0) i303rs.valor("m03ab"+String.valueOf(nAct)+"4indice",sIvaMod.getdouble("indicetemporadareg_iva"));
										if (sIvaMod.getdouble("cuotasoportadaiva")      !=0) i303rs.valor("m03ab"+String.valueOf(nAct)+"4cuosop",sIvaMod.getdouble("cuotasoportadaiva"));
										if (sIvaMod.getdouble("totalcuotaresultante_iva")!=0) i303rs.valor("m03ab"+String.valueOf(nAct)+"4resul", sIvaMod.getdouble("totalcuotaresultante_iva"));
										if (sIvaMod.getdouble("indicecuotaminima_iva")   !=0) i303rs.valor("m03ab"+String.valueOf(nAct)+"4porcen",sIvaMod.getdouble("indicecuotaminima_iva"));
										if (sIvaMod.getdouble("devivaterceros")      !=0) i303rs.valor("m03ab"+String.valueOf(nAct)+"4devol", sIvaMod.getdouble("devivaterceros"));
										if (sIvaMod.getdouble("totalcuotaminima_iva")    !=0) i303rs.valor("m03ab"+String.valueOf(nAct)+"4cuomin",sIvaMod.getdouble("totalcuotaminima_iva"));
										if (sIvaMod.getdouble("cuotaderivada_iva")       !=0) i303rs.valor("m03ab"+String.valueOf(nAct)+"4cuoanu",sIvaMod.getdouble("cuotaderivada_iva"));
									}
									else {
										if (sIvaMod.getdouble("indicetemporadareg_iva")!=0) i303rs.valor("m03ab"+String.valueOf(nAct)+"123ind",sIvaMod.getdouble("indicetemporadareg_iva"));
										if (sIvaMod.getdouble("porcentajetrimes")!=0) i303rs.valor("m03ab"+String.valueOf(nAct)+"123por",sIvaMod.getdouble("porcentajetrimes"));
										if (sIvaMod.getdouble("totalingactadeclarar")!=0) i303rs.valor("m03ab"+String.valueOf(nAct)+"123incta",sIvaMod.getdouble("totalingactadeclarar"));
									}
								}
								sIvaMod.close();
								bOk = i303rs.execute();
								if (!bOk) sError = "No se ha podido actualizar la tabla MOD303RS del NIF "+nif+", ejercicio "+ejer+", periodo "+per+".";
							}
						}
					}
					s303.close();
					if (i303.execute()) {
						int codActiv = 1;
						bOk = altaDesgloseModelo303_14(nif,codEmp,codGYC,ejer,liqpos,per,codActiv);
						if (!bOk) sError = "No se ha podido actualizar el desglose del 303 del NIF "+nif+", ejercicio "+ejer+", periodo "+per+".";
						if (bOk) bOk = actualitzaModEstado(codiCDP,banco,sucursal,digito,cuenta,"303",nif,ejer,per,fechaImpreso,m300tipodecl,resultado);
					}
					if (!bOk) sError = "No se ha podido actualizar la tabla MOD300 del NIF "+nif+", ejercicio "+ejer+", periodo "+per+".";
				}
				else System.out.println("El 303 del ejercicio "+ejer+", periodo "+per+" del nif "+nif+" ya existe");
				scheck.close();
			}
		}
		s303b.close();
		return bOk;
	}

	private int getCodGEyCE(int codAEAT) {
		int codGeyce = codAEAT;
		if (codAEAT==7) codGeyce = 53;
		else if (codAEAT==8) codGeyce = 7;
		else if (codAEAT==9) codGeyce = 8;
		else if (codAEAT==10) codGeyce = 9;
		else if (codAEAT==11) codGeyce = 10;
		else if (codAEAT==12) codGeyce = 11;
		else if (codAEAT==13) codGeyce = 52;
		else if (codAEAT==14) codGeyce = 12;
		else if (codAEAT==15) codGeyce = 13;
		else if (codAEAT==16) codGeyce = 14;
		else if (codAEAT==17) codGeyce = 15;
		return codGeyce;
	}
	private int getCodAgr(int ejer, String nif, int codiAGR) {
		int codi = 0;
		Selector s = new Selector(connModasp);
		s.execute("Select MAACODIGO from modagriva where maanif='"+nif+"' and maaepigrafe="+codiAGR+" and MAAEJERCICIO="+ejer);
		if (s.next()) codi = s.getint("maacodigo");
		s.close();
		return codi;
	}

	private int getCodNoAgr(int ejer, String nif, int epigrafe) {
		int codi = 0;
		String epig = "";
		if (epigrafe>999) epig = String.valueOf(epigrafe/10.0);
		else epig = String.valueOf(epigrafe);
		Selector s = new Selector(connModasp);
		s.execute("Select MAECODIGO from modacteo where maenif='"+nif+"' and maeepigrafe='"+epig+"' and MAEEJERCICIO="+ejer);
		if (s.next()) codi = s.getint("maecodigo");
		s.close();
		return codi;
	}



	private boolean altaModelo303(String nif,int codEmp,int codGYC, int ejer) {
		boolean bOk = true;
		if (ejer>=2014) return true;
		pbf.setSecondaryPercent(0);
		pbf.setState("Convirtiendo LC: "+codEmp+"  JC:"+codGYC+" ("+ejer+")  -  Modelo 303");

		SelectorLogic s303 = new SelectorLogic (connLC);
		s303.execute("SELECT *  FROM IOF_PortadaModelosIVa INNER JOIN Personas ON IOF_PortadaModelosIVa.GuidPersona=Personas.GuidPersona where Personas.DNI='"+nif+"' and IOF_PortadaModelosIVa.Ejercicio="+ejer+" and IOF_PortadaModelosIVa.CodigoModeloImp='303' order by IOF_PortadaModelosIVa.Ejercicio, IOF_PortadaModelosIVa.Periodo");
		while (bOk && s303.next()) {
			if (cargarDatosNif(nif,dominio.substring(0,6)+Numero.format(codGYC,"000000"))) {
				//int ejer = s303.getint("Ejercicio");
				String liqpos = s303.getString("LiqPosicionContador");
				String per = getPeriodo(s303.getint("Periodo"),s303.getint("IOFCodigoPeriodicidad"));
				mae.modasp.general.Modasp.borrarRegModelo("303", nif, ejer, per, true);
				mae.modasp.general.Modasp.borrarRegModnifcdp("303", nif, ejer, per);
				mae.modasp.general.Modasp.borrarRegModestado("303", nif, ejer, per);

				Selector scheck = new Selector(connModasp);
				scheck.execute("Select * from MOD300 where m300nif='"+nif+"' and m300ejercicio="+ejer+" and m300periodo='"+per+"'");
				if (!scheck.next()) {
					Insert i303 = new Insert (connModasp,"MOD300");
					i303.valor("m300dominio",dominio);
					i303.valor("m300ejercicio",ejer);
					i303.valor("m300periodo",per);        		
					i303.valor("m300mesmodelo",getMesModelo(per));       		
					i303.valor("m300modelo","303");
					i303.valor("m300deleg",ccfddelegacio.getString());
					if (ccfdadministra.getString().length() > 30) i303.valor("m300admon",ccfdadministra.getString().substring(0,30));
					else i303.valor("m300admon",ccfdadministra.getString());
					i303.valor("m300codadmon",Numero.format(ccfdcdpaeatdele.getInteger(),"00")+
							Numero.format(ccfdcdpaeatadm.getInteger(),"000"));
					i303.valor("m300nif",nif);
					String apellidos=ccfddatapell1.getString()+" "+ccfddatapell2.getString();
					if (apellidos.length() > 30) i303.valor("m300apellidos",apellidos.substring(0,30));
					else  i303.valor("m300apellidos",apellidos);
					String nombre=ccfddatnombre.getString();
					if (nombre.length() > 15) i303.valor("m300nombre",nombre.substring(0,15));
					else i303.valor("m300nombre",ccfddatnombre.getString());
					if (!ccfddatsiglas.getString().equals("")) i303.valor("m300siglas",ccfddatsiglas.getString());
					String via=ccfddatvia.getString();
					if (via.length() > 17) i303.valor("m300calle",via.substring(0,17));
					else i303.valor("m300calle",via);
					i303.valor("m300numero",ccfddatnum.getString());
					i303.valor("m300puerta",ccfddatpuerta.getString());
					i303.valor("m300escalera",ccfddatesc.getString());
					i303.valor("m300piso",ccfddatpiso.getString());
					String pobla=ccfddatpobla.getString();
					if (pobla.length() > 20) i303.valor("m300municipio",pobla.substring(0,20));
					else i303.valor("m300municipio",ccfddatpobla.getString());
					i303.valor("m300munifirma",ccfddatpobla.getString());
					i303.valor("m300cpostal",ccfddatcpos.getString());
					String tel=ccfddattel.getString();
					if (tel.length() > 9) i303.valor("m300telefono",tel.substring(0,9));
					else if (tel.length() > 0)  i303.valor("m300telefono",tel);

					java.util.Date fechaImpreso = getFechaImpreso(s303.getDate("FechaListado"),ejer,per);
					if (fechaImpreso!=null) {
						i303.valor("m300dia",Maefc.getDay(fechaImpreso));
						i303.valor("m300mes",Fecha.nombreMes(Maefc.getMonth(fechaImpreso)));
						i303.valor("m300anyo",Maefc.getYear(fechaImpreso));
						i303.valor("m300fecha",fechaImpreso);
					}

					i303.valor("m300percont",getSelString(s303,"NombreContacto",100));
					i303.valor("m300telcont",getSelString(s303,"TelefonoContacto",9));        		
					i303.valor("m300observa","Convertido de LOGICCLASS");
					boolean persoFisica = Util.esCIFdePersonaFisica(nif);
					if (persoFisica) {
						String sMiniApell = "";
						if (ccfddatapell1.getString().trim().length()>=4) sMiniApell = ccfddatapell1.getString().trim().substring(0,4);
						else if (ccfddatapell1.getString().trim().length()>0) sMiniApell = ccfddatapell1.getString().trim();
						i303.valor("m300letetiq",sMiniApell);
					}
					String provincia=ccfdprovincia.getString();
					if (provincia.length() > 15) i303.valor("m300provincia",provincia.substring(0,15));
					else i303.valor("m300provincia",provincia);

					double m300devivbase1 = s303.getdouble("Importe01");
					double m300devivbase2 = s303.getdouble("Importe03");
					double m300devivbase3 = s303.getdouble("Importe05");
					if (m300devivbase1!=0) {
						i303.valor("m300devivbase1",m300devivbase1);
						i303.valor("m300devivpor1",s303.getdouble("Porcen01"));
						i303.valor("m300devivcuota1",s303.getdouble("Importe02"));
					}
					if (m300devivbase2!=0) {
						i303.valor("m300devivbase2",m300devivbase2);
						i303.valor("m300devivpor2",s303.getdouble("Porcen02"));
						i303.valor("m300devivcuota2",s303.getdouble("Importe04"));
					}
					if (m300devivbase3!=0) {
						i303.valor("m300devivbase3",m300devivbase3);
						i303.valor("m300devivpor3",s303.getdouble("Porcen03"));
						i303.valor("m300devivcuota3",s303.getdouble("Importe06"));
					}
					double m300devrebase1 = s303.getdouble("Importe07");
					double m300devrebase2 = s303.getdouble("Importe09");
					double m300devrebase3 = s303.getdouble("Importe11");
					if (m300devrebase1!=0) {
						i303.valor("m300devrebase1",m300devrebase1);
						i303.valor("m300devrepor1",s303.getdouble("Porcen04"));
						i303.valor("m300devrecuota1",s303.getdouble("Importe08"));
					}
					if (m300devrebase2!=0) {
						i303.valor("m300devrebase2",m300devrebase2);
						i303.valor("m300devrepor2",s303.getdouble("Porcen05"));
						i303.valor("m300devrecuota2",s303.getdouble("Importe10"));
					}
					if (m300devrebase3!=0) {
						i303.valor("m300devrebase3",m300devrebase3);
						i303.valor("m300devrepor3",s303.getdouble("Porcen06"));
						i303.valor("m300devrecuota3",s303.getdouble("Importe12"));
					}
					i303.valor("m300devadqbase",s303.getdouble("Importe13"));
					i303.valor("m300devadqquota",s303.getdouble("Importe14"));

					i303.valor("m300totcuotdev",s303.getdouble("TotalDevengado"));

					i303.valor("m300dedopinb",s303.getdouble("Importe15"));
					i303.valor("m300dedopin",s303.getdouble("Importe16"));
					i303.valor("m300dedopinivb",s303.getdouble("Importe17"));
					i303.valor("m300dedopinivc",s303.getdouble("Importe18"));
					i303.valor("m300dedimporb",s303.getdouble("Importe19"));
					i303.valor("m300dedimpor",s303.getdouble("Importe20"));
					i303.valor("m300dedimpivb",s303.getdouble("Importe21"));
					i303.valor("m300dedimpivc",s303.getdouble("Importe22"));
					i303.valor("m300dedadqb",s303.getdouble("Importe23"));
					i303.valor("m300dedadq",s303.getdouble("Importe24"));
					i303.valor("m300dedadqivb",s303.getdouble("Importe25"));
					i303.valor("m300dedadqivc",s303.getdouble("Importe26"));
					i303.valor("m300dedragp",s303.getdouble("Importe27"));
					i303.valor("m300dedrinv",s303.getdouble("Importe28"));
					i303.valor("m300regpro",s303.getdouble("Importe29"));

					i303.valor("m300entregas",s303.getdouble("Importe30"));
					i303.valor("m300exporta",s303.getdouble("Importe31"));
					i303.valor("m300opnosujdev",s303.getdouble("Importe32"));



					i303.valor("m300estydiput",s303.getdouble("RegularizacionAnual"));
					i303.valor("m300totded",s303.getdouble("TotalDeducible"));
					i303.valor("m300diferencia",s303.getdouble("DiferenciaRepSop"));
					i303.valor("m300atradmonpor",s303.getdouble("PorcenAtribuible"));
					i303.valor("m300atradmon",s303.getdouble("ImporteAtribuible"));
					i303.valor("m300cuotcompen",s303.getdouble("CompensacionPerAnt"));
					i303.valor("m300resultado",s303.getdouble("Resultado"));
					i303.valor("m300adeducir",s303.getdouble("ResultadoLiqAnt"));

					i303.valor("m300formapago",0);
					double AIngresar = s303.getdouble("AIngresar");
					double ACompensar = s303.getdouble("ACompensar");
					double ADevolver = s303.getdouble("ADevolver");
					String m300tipodecl = "I";
					String IOFTipoDeclaracion = s303.getString("IOFTipoDeclaracion");
					if (IOFTipoDeclaracion == null) IOFTipoDeclaracion = "";
					String banco = null;
					String sucursal = null;
					String digito = null;
					String cuenta = null;
					double m300resultliq = 0;
					if ("I".equals(IOFTipoDeclaracion) || "U".equals(IOFTipoDeclaracion)) {
						int fp = s303.getint("IOFFormaDePago");
						m300resultliq = AIngresar;
						i303.valor("m300resultliq",AIngresar);
						i303.valor("m300impingreso",AIngresar);
						i303.valor("m300formapago",fp);
						m300tipodecl = "P";
						if (IOFTipoDeclaracion.equals("U") || fp == 3) m300tipodecl = "U";
						if (fp==2 || fp==3) {
							banco = s303.getString("CodigoBanco");
							sucursal = s303.getString("CodigoOficina");
							digito = s303.getString("DC");
							cuenta = s303.getString("NumeroCuenta");
							i303.valor("m300entingreso",banco);
							i303.valor("m300ofiingreso",sucursal);
							i303.valor("m300digiingreso",digito);
							i303.valor("m300ctaingreso",cuenta);
						}

					}
					else if ("C".equals(IOFTipoDeclaracion)) {
						m300resultliq = ACompensar;
						i303.valor("m300resultliq",ACompensar);
						i303.valor("m300impcompen",ACompensar);
						m300tipodecl = "C";
					}
					else if ("D".equals(IOFTipoDeclaracion)) {
						m300resultliq = ADevolver;
						i303.valor("m300resultliq",ADevolver);
						i303.valor("m300impdevol",ADevolver);
						i303.valor("m300entdevol",s303.getString("CodigoBanco"));
						i303.valor("m300ofidevol",s303.getString("CodigoOficina"));
						i303.valor("m300digidevol",s303.getString("DC"));
						i303.valor("m300ctadevol",s303.getString("NumeroCuenta"));
						m300tipodecl = "N";
					}
					i303.valor("m300sinactiv","0");                
					i303.valor("m300cruzcomp","0");
					i303.valor("m300devmensual","2");                
					if (s303.getint("SinActividad") == -1) i303.valor("m300sinactiv","1");
					if (s303.getint("IOFRegistroDevIVA") == -1) i303.valor("m300devmensual","1");                
					if (s303.getint("Complementaria") == 1) {
						i303.valor("m300cruzcomp","1");
						String CodigoElectronicoAnt = s303.getString("CodigoElectronicoAnt");
						String NumJustLiqAnt = s303.getString("NumJustLiqAnt");                    
						if (NumJustLiqAnt!=null && NumJustLiqAnt.length()>0) i303.valor("m300numjustif",NumJustLiqAnt);
						else if (CodigoElectronicoAnt!=null && CodigoElectronicoAnt.length()>0) i303.valor("m300numjustif",CodigoElectronicoAnt);
					}
					i303.valor("m300tipodecl",m300tipodecl);
					bOk = i303.execute();
					if (!bOk) sError = "Error al grabar portada modelo 303";
					if (bOk) {
						bOk = altaDesgloseModelo303(nif,codEmp,codGYC,ejer,liqpos,per);
						if (!bOk) sError = "Error al grabar el desglose del modelo 303";	
					}
					if (bOk) {
						bOk = actualitzaModEstado(dominio.substring(0,6)+Numero.format(codGYC,"000000"),banco,sucursal,digito,cuenta,"303",nif,ejer,per,fechaImpreso,m300tipodecl,m300resultliq);
						if (!bOk) sError = "Error en actualitzaModEstado";	
					}
				}
				else System.out.println("El 303 del ejercicio "+ejer+", periodo "+per+" del nif "+nif+" ya existe");
				scheck.close();
			}
		}
		s303.close();
		return bOk;
	}

	private java.util.Date getFechaImpreso (java.util.Date fechaImpreso,int ejercicio,String periodo) {
		if (fechaImpreso==null) {
			int mes = 1;
			int any = ejercicio;
			if ("4T".equals(periodo) || "0A".equals(periodo)) any++;
			else if ("1T".equals(periodo)) mes = 4;
			else if ("2T".equals(periodo)) mes = 7;
			else if ("3T".equals(periodo)) mes = 10;
			fechaImpreso = Fecha.construyeFecha(20,mes,any);
		}
		return fechaImpreso;
	}


	private boolean actualitzaModEstado(String codigoCDP,String banco,String sucursal, String digito, String cuenta,String modelo,String nif,int ejercicio,String periodo,java.util.Date fechaImpreso,String tipoDeclaracion,double importeLiq) {    
		boolean bError = false;
		Select sestado        = new Select(connModasp);
		Table  tbestado       = new Table(sestado, "modestado");
		Field fddominio       = new Field(sestado,tbestado,"mesdominio");
		Field fdmodelo        = new Field(sestado,tbestado,"mesmodelo");
		Field fdnif           = new Field(sestado,tbestado,"mesnif");
		Field fdejercicio     = new Field(sestado,tbestado,"mesejercicio");
		Field fdperiodo       = new Field(sestado,tbestado,"mesperiodo");
		Field fdestado         = new Field (sestado,tbestado,"mesestado");
		Field fdorigen         = new Field (sestado,tbestado,"mesorigen");
		Field fdfecha          = new Field (sestado,tbestado,"mesfecha");
		Field fdcomment        = new Field (sestado,tbestado,"mescomment");
		Field fdformatop       = new Field (sestado,tbestado,"mesformatop");
		Field fdestadop        = new Field (sestado,tbestado,"mesestadop");
		Field fdfechap         = new Field (sestado,tbestado,"mesfechap");
		Field fderrorp         = new Field (sestado,tbestado,"meserrorp");
		Field fdformatom       = new Field (sestado,tbestado,"mesformatom");
		Field fdestadom        = new Field (sestado,tbestado,"mesestadom");
		Field fdfecham         = new Field (sestado,tbestado,"mesfecham");
		Field fderrorm         = new Field (sestado,tbestado,"meserrorm");
		Field fdformatot       = new Field (sestado,tbestado,"mesformatot");
		Field fdestadot        = new Field (sestado,tbestado,"mesestadot");
		Field fdfechat         = new Field (sestado,tbestado,"mesfechat");
		Field fderrort         = new Field (sestado,tbestado,"meserrort");
		Field fdformatos       = new Field (sestado,tbestado,"mesformatos");
		Field fdestados        = new Field (sestado,tbestado,"mesestados");
		Field fdfechas         = new Field (sestado,tbestado,"mesfechas");
		Field fderrors         = new Field (sestado,tbestado,"meserrors");
		Field fdformatol       = new Field (sestado,tbestado,"mesformatol");
		Field fdestadol        = new Field (sestado,tbestado,"mesestadol");
		Field fdfechal         = new Field (sestado,tbestado,"mesfechal");
		Field fderrorl         = new Field (sestado,tbestado,"meserrorl");
		Field fderror          = new Field (sestado,tbestado,"meserror");
		Field fdficherotel     = new Field (sestado,tbestado,"mesficherotel");
		Field fdtipodecl       = new Field (sestado,tbestado,"mestipodecl");
		Field fdbanco          = new Field (sestado,tbestado,"mesbanco");
		Field fdficherolote    = new Field (sestado,tbestado,"mesficherolote");
		Field fdimporteliq     = new Field (sestado,tbestado,"mesimporteliq");
		Field fdimportedeuda   = new Field (sestado,tbestado,"mesimportedeuda");
		Field fdnrcbanco       = new Field (sestado,tbestado,"mesnrcbanco");
		Field fdcccpago        = new Field (sestado,tbestado,"mescccpago");
		Field fdfechaopenrc    = new Field (sestado,tbestado,"mesfechaopenrc");
		Field fdpresentada     = new Field (sestado,tbestado,"mespresentada");
		Field fduser           = new Field (sestado,tbestado,"mesuser");
		Field fdcdp            = new Field (sestado,tbestado,"mescdp");
		Field fdautomatico     = new Field (sestado,tbestado,"mesautomatico");
		Field fdaplic          = new Field (sestado,tbestado,"mesaplic");
		Field fdrazon          = new Field (sestado,tbestado,"mesrazon");

		sestado.setWhere("mesdominio='"+dominio+"' and mesmodelo='"+modelo+"' and mesnif='"+nif+"' and mesejercicio="+ejercicio+" and mesperiodo='"+periodo+"'");
		sestado.execute();
		boolean insert=false;
		if (sestado.isEof()) {
			insert = true;
			sestado.addNew();
			fddominio.setValue(dominio);
			fdmodelo.setValue(modelo);
			fdnif.setValue(nif);
			fdejercicio.setValue(ejercicio);
			fdperiodo.setValue(periodo);
		}
		else {
			sestado.edit();
			fdestado       .setNull();
			fdorigen       .setNull();
			fdfecha        .setNull();
			fdcomment      .setNull();
			fdformatop     .setNull();
			fdestadop      .setNull();
			fdfechap       .setNull();
			fderrorp       .setNull();
			fdformatom     .setNull();
			fdestadom      .setNull();
			fdfecham       .setNull();
			fderrorm       .setNull();
			fdformatot     .setNull();
			fdestadot      .setNull();
			fdfechat       .setNull();
			fderrort       .setNull();
			fdformatos     .setNull();
			fdestados      .setNull();
			fdfechas       .setNull();
			fderrors       .setNull();
			fdformatol     .setNull();
			fdestadol      .setNull();
			fdfechal       .setNull();
			fderrorl       .setNull();
			fderror        .setNull();
			fdficherotel   .setNull();
			fdtipodecl     .setNull();
			fdbanco        .setNull();
			fdficherolote  .setNull();
			fdimporteliq   .setNull();
			fdimportedeuda .setNull();
			fdnrcbanco     .setNull();
			fdcccpago      .setNull();
			fdfechaopenrc  .setNull();
			fdpresentada   .setNull();
			fduser         .setNull();
			fdcdp          .setNull();
			fdautomatico   .setNull();
			fdrazon        .setNull();
		}
		fdorigen.setValue("A");
		if (fechaImpreso!=null) fdfecha.setValue(fechaImpreso);
		else fdfecha.setValue(Fecha.fechaFinMes(12, ejercicio));
		if (banco!=null) fdbanco.setValue(banco);    
		fdestadop.setValue("S");
		fdestadot.setValue("S");
		//fdestado.setValue("N");
		fdtipodecl.setValue(tipoDeclaracion);

		if (banco!=null) {
			fdbanco.setValue(banco);
			fdcccpago.setValue(banco + sucursal +digito + cuenta);
		}
		fduser.setValue(Aplication.getAplication().getUser());
		fdaplic.setValue("JCONTA");    
		fdcdp.setValue(codigoCDP);
		fdautomatico.setValue("S");
		fdimporteliq.setValue(importeLiq);
		fdrazon.setValue(funciones.nombreEmpresa(nif));
		if (insert) bError = !sestado.insert();        
		else bError = !sestado.update();

		if (!bError) {
			Select snifcdp        = new Select(connModasp);
			Table  tnifcdp        = new Table(snifcdp, "modnifcdp");
			Field  fdndominio      = new Field(snifcdp,tnifcdp,"mncdominio");
			Field  fdnmodelo       = new Field(snifcdp,tnifcdp,"mncmodelo");
			Field  fdnnif          = new Field(snifcdp,tnifcdp,"mncnif");
			Field  fdnejercicio    = new Field(snifcdp,tnifcdp,"mncejercicio");
			Field  fdnperiodo      = new Field(snifcdp,tnifcdp,"mncperiodo");
			Field  fdncdp          = new Field(snifcdp,tnifcdp,"mnccdp");
			Field  fdnaplicacion   = new Field(snifcdp,tnifcdp,"mnaplicacion");
			snifcdp.setWhere("mncdominio='"+dominio+"' and mncmodelo='"+modelo+"' and mncnif='"+nif+"' and mncejercicio="+ejercicio+" and mncperiodo='"+periodo+"' and mnccdp='"+codigoCDP+"' and mnaplicacion='JCONTA'");
			snifcdp.execute();
			if (snifcdp.isEof()) {
				snifcdp.addNew();
				fdndominio.setValue(dominio);
				fdnmodelo.setValue(modelo);
				fdnnif.setValue(nif);
				fdnejercicio.setValue(ejercicio);
				fdnperiodo.setValue(periodo);
				fdncdp.setValue(codigoCDP);
				fdnaplicacion.setValue("JCONTA");
				if (!snifcdp.insert()) 
					bError = true;         
			}
		}
		else bError = true;
		return !bError;
	}



	private boolean altaModelo349(String nif,int codEmp,int codGYC, int ejer) {
		boolean bOk = true;
		pbf.setSecondaryPercent(0);
		pbf.setState("Convirtiendo LC: "+codEmp+"  JC:"+codGYC+" ("+ejer+")  -  Modelo 349");

		SelectorLogic s349 = new SelectorLogic (connLC);
		s349.execute("SELECT *  FROM IOF_PortadaOpCEE INNER JOIN Personas ON IOF_PortadaOpCEE.GuidPersona=Personas.GuidPersona where Personas.DNI='"+nif+"' and IOF_PortadaOpCEE.Ejercicio="+ejer+" and IOF_PortadaOpCEE.CodigoModeloImp='349' order by IOF_PortadaOpCEE.Ejercicio, IOF_PortadaOpCEE.Periodo");
		while (bOk && s349.next()) {
			if (cargarDatosNif(nif,dominio.substring(0,6)+Numero.format(codGYC,"000000"))) {
				double totalOperR = 0;
				double totalImpOperR = 0;
				//int ejer = s303.getint("Ejercicio");
				String liqpos = s349.getString("LiqPosicionContador");
				String per = getPeriodo(s349.getint("Periodo"),s349.getint("IOFCodigoPeriodicidad"));
				mae.modasp.general.Modasp.borrarRegModelo("349", nif, ejer, per, true);
				mae.modasp.general.Modasp.borrarRegModnifcdp("349", nif, ejer, per);
				mae.modasp.general.Modasp.borrarRegModestado("349", nif, ejer, per);
				Selector scheck = new Selector(connModasp);
				scheck.execute("Select * from MOD349C where m349cnif='"+nif+"' and m349cejercicio="+ejer+" and m349cperiodo='"+per+"'");
				if (!scheck.next()) {
					Insert ic = new Insert (connModasp,"MOD349C");
					ic.valor("m349cdelegacio",ccfdcdpaeatdele.getString());
					String administra=ccfdadministra.getString();
					if (administra.length() > 30) ic.valor("m349cadmon",administra.substring(0,30));
					else ic.valor("m349cadmon",administra);
					ic.valor("m349ccodiadmon",mae.general.Util.formateoNumero("000",ccfdcdpaeatadm.getInteger()));
					String apellidos=mae.modasp.general.Modasp.getNombre(ccfddatnombre.getString(),ccfddatapell1.getString(),ccfddatapell2.getString(),1);
					if (apellidos.length() > 30) apellidos=apellidos.substring(0,30);
					ic.valor("m349crazon",apellidos);
					if (ccfddatsiglas.getString().length()==0) ic.setNull("m349csigla");
					else ic.valor("m349csigla",ccfddatsiglas.getString());
					String via=ccfddatvia.getString();
					if (via.length() > 17) ic.valor("m349cvia",via.substring(0,17));
					else ic.valor("m349cvia",via);
					ic.valor("m349cnumero",ccfddatnum.getString());
					ic.valor("m349cpuerta",ccfddatpuerta.getString());
					ic.valor("m349cescalera",ccfddatesc.getString());
					ic.valor("m349cpiso",ccfddatpiso.getString());
					String pobla=ccfddatpobla.getString();
					if (pobla.length() > 20) ic.valor("m349cmunicipio",pobla.substring(0,20));
					else ic.valor("m349cmunicipio",ccfddatpobla.getString());
					ic.valor("m349ccpostal",ccfddatcpos.getString());
					String tel=ccfddattel.getString();
					if (tel.length() > 9) ic.valor("m349ctelefono",tel.substring(0,9));
					else ic.valor("m349ctelefono",tel);
					ic.valor("m349cprovincia",ccfddatcodprov.getString());
					ic.valor("m349cletetiq",ccfdletetiq.getString());
					ic.valor("m349ctelcont",s349.getString("TelefonoContacto"));
					String NombreContacto = s349.getString("NombreContacto");
					ic.valor("m349cpercont",NombreContacto);
					ic.valor("m349cfirma",NombreContacto);
					ic.valor("m349ccargofirma","TITULAR");
					java.util.Date FechaListado = s349.getDate("FechaListado");
					ic.valor("m349cfecha",FechaListado);
					//if (bimensual) ic.valor("m349ccambioper","X"); 

					ic.valor("m349cdominio", dominio);
					ic.valor("m349cnif", nif);
					ic.valor("m349cejercicio", ejer);
					ic.valor("m349cperiodo", per);

					ic.valor("m349cnumope", s349.getdouble("Importe09"));	    	
					ic.valor("m349cimporte", s349.getdouble("Importe10"));	    
					if (ic.execute()) {
						SelectorLogic sdes = new SelectorLogic (connLC);
						sdes.execute("SELECT *  FROM IOF_DesgloseOpCEE  where LiqPosicion='"+liqpos+"'");
						while (sdes.next()) {
							int mesAcum = 12;
							try {
								if (per.equals("1T")) mesAcum = 3;
								else if (per.equals("2T")) mesAcum = 6;
								else if (per.equals("3T")) mesAcum = 9;
								else if (per.equals("4T")) mesAcum = 12;
								else if (per.equals("0A")) mesAcum = 12;
								else mesAcum = Integer.parseInt (per);
							}
							catch (Exception ee) {
								mesAcum = 12;
								ee.printStackTrace();
							}
							double m349abase     = sdes.getdouble("ImporteDeclaradoTotal");
							int m349aanyrec   = 0;
							String m349aperirec  = null;
							double m349abaserec  = 0;
							double m349abasearec = 0;
							String m349dclave = sdes.getString("ClaveOperacion");
							Insert id = new Insert (connModasp,"MOD349D");
							id.valor("m349dident", 0);
							id.valor("m349ddominio", dominio);
							id.valor("m349dnif", nif);
							id.valor("m349dejercicio", ejer);
							id.valor("m349dperiodo", per);
							id.valor("m349dcodpais", sdes.getString("SiglaNacion"));
							id.valor("m349dnifcomun", sdes.getString("IOFDni"));
							id.valor("m349drazon", sdes.getString("NombreRelacionado"));
							id.valor("m349dbase", m349abase);
							id.valor("m349dclave", m349dclave);
							bOk = id.execute();
							int EjercicioRectificacion = sdes.getint("EjercicioRectificacion");
							if (EjercicioRectificacion>0) {
								m349aanyrec   = EjercicioRectificacion;
								m349aperirec  = sdes.getString("PeriodoRectificacion");
								m349abaserec  = sdes.getdouble("ImporteRectificado");
								m349abasearec = sdes.getdouble("ImporteAnteriorRectificado");
								Insert ir = new Insert (connModasp,"MOD349R");
								ir.valor("m349rident", 0);
								ir.valor("m349rdominio", dominio);
								ir.valor("m349rnif", nif);
								ir.valor("m349rejercicio", ejer);
								ir.valor("m349rperiodo", per);
								ir.valor("m349rcodpais", sdes.getString("SiglaNacion"));
								ir.valor("m349rnifcomun", sdes.getString("IOFDni"));
								ir.valor("m349rrazon", sdes.getString("NombreRelacionado"));
								ir.valor("m349rclave", m349dclave);
								ir.valor("m349ranyrectif", EjercicioRectificacion);
								ir.valor("m349rperirecti", m349aperirec);
								ir.valor("m349rbaserecti", m349abaserec);
								ir.valor("m349rbaseantre", m349abasearec);
								totalImpOperR += sdes.getdouble("ImporteRectificado");
								totalOperR++;
								bOk = ir.execute();
							}
							if (bOk) {
								String m349anifcomun = sdes.getString("IOFDni");
								Selector sch = new Selector (connModasp);
								sch.execute("Select * from MOD349ACUM where m349anif='"+nif+"' and m349aejercicio="+ejer+" and m349aactividad=1 and m349anifcomun='"+m349anifcomun+"' and m349aclave='"+m349dclave+"'");
								if (sch.next()) {
									Update ua = new Update (connModasp,"MOD349ACUM");
									ua.valor("m349abase"+mesAcum, m349abase);
									if (m349aanyrec!=0) ua.valor("m349aanyrec"+mesAcum, m349aanyrec);
									ua.valor("m349aperirec"+mesAcum, m349aperirec);
									if (m349abaserec!=0) ua.valor("m349abaserec"+mesAcum, m349abaserec);
									if (m349abasearec!=0) ua.valor("m349abasearec"+mesAcum, m349abasearec);
									bOk = ua.execute("m349anif='"+nif+"' and m349aejercicio="+ejer+" and m349aactividad=1 and m349anifcomun='"+m349anifcomun+"' and m349aclave='"+m349dclave+"'");                      
								}
								else {
									Insert ia = new Insert (connModasp,"MOD349ACUM");
									ia.valor("m349aident", 0);
									ia.valor("m349adominio", dominio);
									ia.valor("m349anif", nif);
									ia.valor("m349aejercicio", ejer);
									ia.valor("m349aactividad", 1);
									ia.valor("m349acodpais", sdes.getString("SiglaNacion"));
									ia.valor("m349anifcomun", m349anifcomun);
									ia.valor("m349arazon", sdes.getString("NombreRelacionado"));
									ia.valor("m349aclave", m349dclave);
									ia.valor("m349abase"+mesAcum, m349abase);
									if (m349aanyrec!=0) ia.valor("m349aanyrec"+mesAcum, m349aanyrec);
									ia.valor("m349aperirec"+mesAcum, m349aperirec);
									if (m349abaserec!=0) ia.valor("m349abaserec"+mesAcum, m349abaserec);
									if (m349abasearec!=0) ia.valor("m349abasearec"+mesAcum, m349abasearec);
									bOk = ia.execute();
								}
								sch.close();
							}
						}
						sdes.close();
						if (bOk && totalOperR>0) {
							Update uc = new Update (connModasp,"MOD349C");
							uc.valor("m349cnumoperec", totalOperR);	    	
							uc.valor("m349cimprectif", totalImpOperR);	    
							bOk = uc.execute("m349cdominio='"+dominio+"' and m349cnif='"+nif+"' and m349cejercicio="+ejer+" and m349cperiodo='"+per+"'");
						}
						if (bOk) bOk = actualitzaModEstado(dominio.substring(0,6)+Numero.format(codGYC,"000000"),null,null,null,null,"349",nif,ejer,per,FechaListado,"I",0);
					}
				}
				else System.out.println("El 303 del ejercicio "+ejer+", periodo "+per+" del nif "+nif+" ya existe");
				scheck.close();
			}
		}
		s349.close();
		if (!bOk) sError = "Error en alta Modelo 349";
		return bOk;
	}
	private boolean altaModelo115(String nif,int codEmp,int codGYC, int ejercicio) {
		boolean bOk = true;
		pbf.setSecondaryPercent(0);
		pbf.setState("Convirtiendo LC: "+codEmp+"  JC:"+codGYC+" ("+ejercicio+")  -  Modelo 115");

		String codiCDP = dominio.substring(0,6)+Numero.format(codGYC,"000000");
		SelectorLogic s = new SelectorLogic (connLC);              
		s.execute("SELECT *  FROM IOF_PortadaRetArrendamientos INNER JOIN Personas ON IOF_PortadaRetArrendamientos.GuidPersona=Personas.GuidPersona where Personas.DNI='"+nif+"' and IOF_PortadaRetArrendamientos.CodigoModeloImp = '115' and IOF_PortadaRetArrendamientos.Ejercicio="+ejercicio+" order by IOF_PortadaRetArrendamientos.Periodo");
		while (s.next() && bOk) {
			if (cargarDatosNif(nif,codiCDP)) {
				//int ejercicio = s.getint("ejercicio");         
				String periodo = getPeriodo(s.getint("Periodo"),s.getint("IOFCodigoPeriodicidad"));
				mae.modasp.general.Modasp.borrarRegModelo("115", nif, ejercicio, periodo, true);
				mae.modasp.general.Modasp.borrarRegModnifcdp("115", nif, ejercicio, periodo);
				mae.modasp.general.Modasp.borrarRegModestado("115", nif, ejercicio, periodo);
				String banco = getSelString(s,"Codigobanco");
				String sucursal = getSelString(s,"CodigoOficina");
				String digito = getSelString(s,"DC");
				String cuenta  = getSelString(s,"NumeroCuenta");
				Insert iM115  = new Insert(connModasp,"MOD115");
				iM115.valor("m115dominio",dominio);
				iM115.valor("m115nif",nif);
				iM115.valor("m115ejercicio",ejercicio);
				iM115.valor("m115periodo",periodo);
				iM115.valor("m115deleg",ccfddelegacio.getString());
				iM115.valor("m115admon",retallaString(ccfdadministra.getString(),30));
				iM115.valor("m115codadmon",Util.formateoNumero("00",ccfdcdpaeatdele.getInteger())+
						Util.formateoNumero("000",ccfdcdpaeatadm.getInteger()));
				iM115.valor("m115apellidos",getApellidos());
				iM115.valor("m115nombre",retallaString(ccfddatnombre.getString(),15));
				if (ccfddatsiglas.getString().length()>0) iM115.valor("m115siglas",ccfddatsiglas.getString());
				iM115.valor("m115calle",retallaString(ccfddatvia.getString(),17));
				iM115.valor("m115numero",ccfddatnum.getString());
				iM115.valor("m115puerta",ccfddatpuerta.getString());
				iM115.valor("m115escalera",ccfddatesc.getString());
				iM115.valor("m115piso",ccfddatpiso.getString());
				iM115.valor("m115cpostal",ccfddatcpos.getString());
				iM115.valor("m115provincia",retallaString(ccfdprovincia.getString(),15));
				iM115.valor("m115municipio",retallaString(ccfddatpobla.getString(),20));      
				iM115.valor("m115telefono",retallaString(ccfddattel.getString(),9));
				iM115.valor("m115letetiq",getLetrasEtiq(ejercicio,nif));         
				iM115.valor("m115munifirma",getSelString(s,"lugar",30));
				int formaPago = s.getint("IOFFormaDePago");        
				double importeLiq = s.getdouble("resultado");
				String tipoDecla = "I";        
				if (formaPago==3) tipoDecla = "U";
				else if (formaPago==2 || formaPago==1) tipoDecla = "P";        

				iM115.valor("m115tipodecl",tipoDecla);        
				if (s.getint("MarcaSustitutiva")==-1) iM115.valor("m115cruzcomp","X");        
				iM115.valor("m115numjusti",getSelString(s,"NumJustificante"));
				iM115.valor("m115codelec",getSelString(s,"CodigoElectronicoAnt"));
				iM115.valor("m115munifirma",getSelString(s,"lugar",16));
				java.util.Date fechaImpreso = getFechaImpreso(s.getDate("FechaListado"),ejercicio,periodo);
				iM115.valor("m115dia",Maefc.getDay(fechaImpreso));
				iM115.valor("m115mes",Fecha.nombreMes(Maefc.getMonth(fechaImpreso)));
				iM115.valor("m115anyo",Maefc.getYear(fechaImpreso));
				iM115.valor("m115fecha",fechaImpreso);
				iM115.valor("m115percont",getSelString(s,"NombreContacto",100));
				iM115.valor("m115telcont",getSelString(s,"TelefonoContacto",9));
				iM115.valor("m115observa","Convertido de LOGICCLASS");        
				if (formaPago>1) {
					iM115.valor("m115entingreso",banco);
					iM115.valor("m115ofiingreso",sucursal);
					iM115.valor("m115digiingreso",digito);
					iM115.valor("m115ctaingreso",cuenta);
				}
				if (s.getdouble("resultado")!=0) iM115.valor("m115liqresulti",s.getdouble("resultado"));
				if (s.getdouble("aingresar")!=0) iM115.valor("m115ingimpor",s.getdouble("aingresar"));
				if (s.getdouble("importe01")!=0) iM115.valor("m115liqnp",s.getdouble("importe01"));
				if (s.getdouble("importe02")!=0) iM115.valor("m115liqbaseric",s.getdouble("importe02"));
				if (s.getdouble("importe03")!=0) iM115.valor("m115liqric",s.getdouble("importe03"));
				if (formaPago==1) iM115.valor("m115cruzefec","X");
				else if (formaPago==2) iM115.valor("m115cruzadeu","X");
				else if (formaPago==2) iM115.valor("m115cruzccc","X");
				Selector s115 = new Selector(connModasp);
				s115.execute("Select * from MOD115 where m115nif='"+nif+"' and m115ejercicio="+ejercicio+" and m115periodo='"+periodo+"'");      
				if (!s115.next()) {
					bOk = iM115.execute();
					if (bOk) bOk = actualitzaModEstado(codiCDP,banco,sucursal,digito,cuenta,"115",nif,ejercicio,periodo,fechaImpreso,tipoDecla,importeLiq);
					if (bOk) {
						int mes = 0;
						if (s.getint("IOFCodigoPeriodicidad")==0) mes = s.getint("Periodo");
						else if (s.getint("Periodo")==1) mes = 3;
						else if (s.getint("Periodo")==2) mes = 6;
						else if (s.getint("Periodo")==3) mes = 9;
						else if (s.getint("Periodo")==4) mes = 12;
						SelectorLogic sDesglose = new SelectorLogic(connLC);
						String contador = s.getString("LiqPosicionContador");
						sDesglose.execute("Select * from IOF_DesgRetArrendamientos where LiqPosicion='"+contador+"' and marcaincidencia=0 and (ImporteArrendamientoTotal<>0  or ImporteRetencionTotal<>0)");
						while (sDesglose.next() && bOk) {
							String perceptor = sDesglose.getString("IOFDni");
							Selector s115D = new Selector(connModasp);
							s115D.execute("Select * from MOD115D where m115dnif='"+nif+"' and m115dejercicio="+ejercicio+" and m115dnifper='"+perceptor+"'");                  
							if (!s115D.next()) { 
								Insert i115D = new Insert (connModasp,"MOD115D");
								i115D.valor("m115dident",0);
								i115D.valor("m115ddominio",dominio);
								i115D.valor("m115dnif",nif);
								i115D.valor("m115dejercicio",ejercicio);
								if (sDesglose.getint("MarcaRepresentante")==0) i115D.valor("m115dnifper",perceptor);
								else i115D.valor("m115dnifrepres",perceptor);                    
								i115D.valor("m115drazon",getSelString(sDesglose,"NombreRelacionado",40));
								i115D.valor("m115dcodprov",sDesglose.getint("codigoprovincia"));
								i115D.valor("m115dmodal","1"); 
								if (sDesglose.getint("ejerciciodevengo")!=ejercicio && sDesglose.getint("ejerciciodevengo")>0) i115D.valor("m115dejerdev",sDesglose.getint("ejerciciodevengo"));
								i115D.valor("m115dorigen","CONTA");
								i115D.valor("m115dautomatico","S");
								if (sDesglose.getdouble("ImporteArrendamientoTotal")!=0) i115D.valor("m115dimport"+mes,sDesglose.getdouble("ImporteArrendamientoTotal"));
								if (sDesglose.getdouble("%Retencion")!=0) i115D.valor("m115dporreten"+mes,sDesglose.getdouble("%Retencion"));
								if (sDesglose.getdouble("ImporteRetencionTotal")!=0) i115D.valor("m115dretening"+mes,sDesglose.getdouble("ImporteRetencionTotal"));
								i115D.valor("m115dactividad",1);
								bOk = i115D.execute();
							}
							else {
								Update u115D = new Update (connModasp,"MOD115D");
								u115D.valor("m115dimport"+mes,sDesglose.getdouble("ImporteArrendamientoTotal")+s115D.getdouble("m115dimport"+mes));
								u115D.valor("m115dporreten"+mes,sDesglose.getdouble("%Retencion"));
								u115D.valor("m115dretening"+mes,sDesglose.getdouble("ImporteRetencionTotal")+s115D.getdouble("m115dretening"+mes));
								bOk = u115D.execute("m115dnif='"+nif+"' and m115dejercicio="+ejercicio+" and m115dnifper='"+perceptor+"'"); 
							} 
						}
						sDesglose.close();
					}
				}
				else System.out.println("El 115 del ejercicio "+ejercicio+", periodo "+periodo+" del nif "+nif+" ya existe");
				s115.close();      
			}
		}
		s.close();
		if (!bOk) sError = "Error al grabar modelo 115";
		return bOk;
	}

	private String retallaString(String camp, int longitud) {
		if (camp.length() > longitud) camp = camp.substring(0,longitud);
		return camp;      
	}

	private String getApellidos() {
		String apellidos=ccfddatapell1.getString()+" "+ccfddatapell2.getString();
		if (apellidos.length() > 30) apellidos = apellidos.substring(0,30);
		return apellidos;
	}

	private String getLetrasEtiq(int ejercicio, String nif) {
		String etiqueta = "";
		if (ejercicio<2007) etiqueta = ccfdletetiq.getString();
		else {
			if (Util.esCIFdePersonaFisica(nif)) {
				String sMiniApell = "";
				if (ccfddatapell1.getString().trim().length()>=4) sMiniApell = ccfddatapell1.getString().trim().substring(0,4);
				else if (ccfddatapell1.getString().trim().length()>0) sMiniApell = ccfddatapell1.getString().trim();
				etiqueta = sMiniApell;
			}          
		}
		return etiqueta;
	}


	@Override
	protected Vector<Incidencia> convertirEmpresa(DadesEmpresa de, ProgressBarForm pbf) {
		Vector<Incidencia> vIncidencias = new Vector<Incidencia>();
		int empLC = de.getCodiOrigen();
		int empJC = de.getCodiGeyce();
		this.pbf = pbf;
		boolean bOk = true;
		java.util.Vector <Integer> vEjers = getEjerciciosEmpresa(empLC);
		String sNifEmpresa = de.getNif();
		for (int i=0;bOk && i<vEjers.size();i++) {
			sError = "";
			int ejerLogic = vEjers.elementAt(i).intValue();
			int ejerJconta = vEjers.elementAt(i).intValue();
			super.ejercicioEnProceso = ejerJconta;
			pbf.setState("Convirtiendo LC: "+empLC+"  JC:"+empJC+" ("+ejerJconta+")");
			int mesInicio = 1;
			int ejerInicio = ejerLogic;
			java.util.Date fechaCierre = Fecha.construyeFecha(31,12,ejerLogic);
			SelectorLogic sPer = new SelectorLogic (connLC);
			sPer.execute("Select * from Periodos where codigoempresa="+empLC+" and ejercicio="+ejerLogic+" and numeroperiodo=0");
			if (sPer.next()) {
				mesInicio = Maefc.getMonth(sPer.getDate("fechainicio")) + 1;
				ejerInicio = Maefc.getYear(sPer.getDate("fechainicio"));
				if (ejerInicio<ejerLogic) ejerLogic++;
			}
			sPer.close();
			sPer = new SelectorLogic (connLC);
			sPer.execute("Select * from Periodos where codigoempresa="+empLC+" and ejercicio="+ejerLogic+" and numeroperiodo=98");
			if (sPer.next()) fechaCierre = sPer.getDate("fechainicio");
			sPer.close();
			if (bOk) bOk = initConver(empLC,ejerLogic,empJC,ejerJconta,mesInicio,sNifEmpresa) && emc.getDescripcionError()==null;			
			if (bOk) bOk = initDatos(empLC,ejerLogic,empJC,ejerJconta) && emc.getDescripcionError()==null;
			if (bOk) bOk = importarPC (empLC,ejerLogic,empJC,ejerJconta) && emc.getDescripcionError()==null;
			if (bOk) bOk = importarInmov (empLC,ejerLogic,empJC,ejerJconta) && emc.getDescripcionError()==null;
			if (bOk) bOk = importarFP () && emc.getDescripcionError()==null;
			if (bOk) bOk = importarAsientos (empLC,ejerLogic,empJC,ejerJconta,fechaCierre,mesInicio) && emc.getDescripcionError()==null;
			if (bOk) {
				if (ejerLogic<2014) bOk = altaModelo303 (sNifEmpresa,empLC,empJC,ejerLogic) && emc.getDescripcionError()==null;
				else  bOk = altaModelo303_14 (sNifEmpresa,empLC,empJC,ejerLogic) && emc.getDescripcionError()==null;
			}
			if (bOk) bOk = altaModelo349 (sNifEmpresa,empLC,empJC,ejerLogic) && emc.getDescripcionError()==null;
			if (bOk) bOk = altaModelo115 (sNifEmpresa,empLC,empJC,ejerLogic) && emc.getDescripcionError()==null;
			if (bOk) {
				pbf.setSecondaryPercent(0);
				pbf.setState("Convirtiendo LC: "+empLC+"  JC:"+empJC+" ("+ejerJconta+")  -  Finalizando");
				bOk = funciones.checkLongitudNumerica (dbJCta,empJC,ejerJconta);
				if (!bOk) sError = "Error en checkLongitudNumerica";
			}
			if (bOk) {
				pbf.setState("Convirtiendo LC: "+empLC+"  JC:"+empJC+" ("+ejerJconta+")  -  Perfil Tributartio");
				bOk = funciones.rehacerPerfil(dbJCta,empJC,ejerLogic);
				if (!bOk) sError = "Error en rehacerPerfil";
			}
			if (bOk) bOk = funciones.reconstruccionAcumulados(dbJCta, ejerJconta, empJC,empLC, estaCerrado, asientoCE, asientoCC, pbf);			
			if (bOk) {
				dbJCta.commit();
				connEA.commit();
				connModasp.commit();
			}
			else {
				bOk = true;
				if (dbJCta != null) dbJCta.rollback();
				connEA.rollback();
				connModasp.rollback();
				if (sError!=null && sError.length()>0) vIncidencias.addElement(new Incidencia (empLC,empJC,ejerJconta,sError,APLICACION_GEYCE.JCONTA,de.getNif(),de.getRazonSocial(),idConversion));
			}
			if (dbJCta != null) dbJCta.disconnect();   
		}
		return vIncidencias;
	}



	private class TipoReten {
		int CodigoRetencion;
		double Retencion;
		String ClaveIrpf;
		int codJC;

		int getCodJC() {
			return codJC;
		}

		void setCodJC(int codJC) {
			this.codJC = codJC;
		}

		public TipoReten(int codigoRetencion, double retencion, String claveIrpf) {
			CodigoRetencion = codigoRetencion;
			Retencion = retencion;
			ClaveIrpf = claveIrpf;
		}

	}

	private class TipoIVA {
		public int CodigoIva;
		public double Iva;
		public double RecargoEquivalencia;
		int codJC;

		int getCodJC() {
			return codJC;
		}

		void setCodJC(int codJC) {
			this.codJC = codJC;
		}

		TipoIVA(int CodigoIva, double Iva, double RecargoEquivalencia) {
			this.CodigoIva = CodigoIva;
			this.Iva = Iva;
			this.RecargoEquivalencia = RecargoEquivalencia;
		}
	}

	public boolean actualizartCliPro() {
		ProgressBarForm pbf=new ProgressBarForm(pr,"Conversión "+aplicOrigen.toString()+" - "+aplicGeyce.toString()+" ...",true,true,true) {
			public void job() {
				setPercent(0);
				setSecondaryPercent(0);
				String sql = "Select * from CODCNVOTRAPLL where cclccocodi="+idConversion+" and cclsel='S' and ccltraspjco='S' order by cclcodiorigen";
				Selector s = new Selector (connEA);
				s.execute(sql);
				vDadesEmpresa = new Vector<DadesEmpresa>();
				setState ("Preparando Conversión "+aplicGeyce+" ... ");
				while (s.next()) {
					int cclcodiorigen  = s.getint("cclcodiorigen");
				    String cclcodiorigens = s.getString("cclcodiorigens");
				    String cclnombre = s.getString("cclnombre");
				    String cclnif = s.getString("cclnif");
				    int cclcodigeyce = s.getint("cclcodigeyce");  
				    DadesEmpresa de = null;
				    if (cclcodiorigens != null && cclcodiorigens.length()>0) de = new DadesEmpresa(cclcodiorigens, cclnif, cclnombre, aplicGeyce);
				    else de = new DadesEmpresa(cclcodiorigen, cclnif, cclnombre, aplicGeyce);
				    de.setCodiGeyce(cclcodigeyce);
				    vDadesEmpresa.addElement(de);
				}
				s.close();				
				for (int i=0; i<vDadesEmpresa.size();i++) {
					setPercent(i*100/vDadesEmpresa.size());
					deEnProceso = vDadesEmpresa.elementAt(i);
					if (deEnProceso.getCodiOrigenStr()!=null) setState ("Conversión "+aplicGeyce+" ["+deEnProceso.getCodiOrigenStr()+"] -- ["+deEnProceso.getCodiGeyce()+"]");
					else setState ("Conversión "+aplicGeyce+" ["+deEnProceso.getCodiOrigen()+"] -- ["+deEnProceso.getCodiGeyce()+"]");
					Vector<Incidencia> vInTmp = actualizartCliPro (deEnProceso, this);
					if (vInTmp != null) vIncidencias.addAll(vInTmp);
				}
				
				if (vIncidencias != null && vIncidencias.size()>0) procesarIncidencias ();
				exit ();
			}
		};
		pbf.setFormWidth(800);
		pbf.setEnabledCancel(false);
		pbf.setSecondaryAuto(false);
		
		sError = null;
		vIncidencias.removeAllElements();
		iniConver();
		
		pbf.launch();
		
		finConver();
		return vIncidencias.size()>0;
	}

	protected Vector<Incidencia> actualizartCliPro(DadesEmpresa de, ProgressBarForm pbf) {
		Vector<Incidencia> vIncidencias = new Vector<Incidencia>();
		int empLC = de.getCodiOrigen();
		int empJC = de.getCodiGeyce();
		this.pbf = pbf;
		boolean bOk = true;
		java.util.Vector <Integer> vEjers = getEjerciciosEmpresa(empLC);
		for (int i=0;bOk && i<vEjers.size();i++) {
			sError = "";
			int ejerJconta = vEjers.elementAt(i).intValue();
			super.ejercicioEnProceso = ejerJconta;
			pbf.setState("Actualizando Clientes y Proveedores LC: "+empLC+"  JC:"+empJC+" ("+ejerJconta+")");
			dbJCta = funciones.getConexionCtasp ( empJC, ejerJconta );
			bOk = (dbJCta!=null);
			if (bOk) bOk = actualizarClientesConta(empLC, empJC, ejerJconta, false) && emc.getDescripcionError()==null;
			if (bOk) dbJCta.commit();
			else {
				bOk = true;
				if (dbJCta != null) dbJCta.rollback();
				if (sError!=null && sError.length()>0) vIncidencias.addElement(new Incidencia (empLC,empJC,ejerJconta,sError,APLICACION_GEYCE.JCONTA,de.getNif(),de.getRazonSocial(),idConversion));
			}
			if (dbJCta != null) dbJCta.disconnect();   
		}
		return vIncidencias;
	}
	
}
