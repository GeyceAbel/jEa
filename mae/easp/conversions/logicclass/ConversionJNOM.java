package mae.easp.conversions.logicclass;

import java.util.Vector;
import mae.easp.conversions.DadesEmpresa;
import mae.easp.conversions.FuncionesJNOM;
import mae.easp.conversions.Incidencia;
import mae.easp.conversions.logicclass.db.SelectorLogic;
import mae.easp.general.Easp;
import mae.general.ProgressBarForm;
import mae.modasp.general.Modasp;
import geyce.maefc.DBConnection;
import geyce.maefc.Program;

public class ConversionJNOM extends ConversionLC {

	private ProgressBarForm pbf;
	private FuncionesJNOM funciones;
	private DBConnection dbJnom;
	public mae.laboral.auxlogicclass.ProgAuxlogicclass prNom;
	private String equivDpto = "D";
	private boolean conceptoConvenio=false;
	
	
	public ConversionJNOM (Program pr,int idConversion, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, String servidor, String instancia, String nombreBD, String user, String passwd,String tipoDpto, boolean conceptoConvenio, DBConnection connEA) {
	  super (pr,desdeEmp, hastaEmp, desdeEjer, hastaEjer, connEA, servidor, instancia, nombreBD, user, passwd, idConversion);
	  funciones = new FuncionesJNOM(connEA,dominio);
	  prNom= new mae.laboral.auxlogicclass.ProgAuxlogicclass();
	  dbJnom = funciones.connJNomina;
	  prNom.setConnection(dbJnom);
	  prNom.setDataBase(dbJnom.getDB());	
	  prNom.converConjuntaEA = true;
	  prNom.dominio = Easp.dominio;	  
	  this.conceptoConvenio=conceptoConvenio;
      if(tipoDpto.equals("D")) {
	    equivDpto = "Departamentos";	
      }
      else if(tipoDpto.equals("S")) {
	    equivDpto = "Secciones";	
      }
      else if(tipoDpto.equals("L")) {
	    equivDpto = "Delegaciones";
      }
      else if(tipoDpto.equals("C")) {
	    equivDpto = "Canales";
      }
	  initPrograma();
	  //pr.
	  
	}

	@Override
	protected Vector<Incidencia> convertirEmpresa(DadesEmpresa de, ProgressBarForm pbf) {
	  try {
		//this.pbf = pbf;
		int empLC = de.getCodiOrigen();
		int empJN = de.getCodiGeyce();
		String sNifEmpresa = de.getNif();	
		prNom.pbf =pbf;	
		mae.laboral.general.importasql.logicclass.Empresa con = new mae.laboral.general.importasql.logicclass.Empresa();
		con.setErrorManager(emc);
		con.actualitzaPbf=false;
        con.run(prNom,empLC,empJN);
        updateTableConversion(empLC, empJN);
        prNom.getDataBase().commit();
        pr.getDataBase().commit();
        prNom.smod110.getDataBase().commit();        
        System.gc();
		return vIncidencias;
	  }
	  catch (Exception ex) {
		prNom.getDataBase().rollback();
        pr.getDataBase().rollback();
	    ex.printStackTrace();
		Incidencia inc = new Incidencia(de.getCodiOrigen(), de.getCodiGeyce(), desdeEjer, ex.getMessage(), APLICACION_GEYCE.JNOMINA, de.getNif(), de.getRazonSocial(), idConversion);
		vIncidencias.add(inc);
		return vIncidencias;
	  }
	}

	@Override
	public Vector<DadesEmpresa> initEmpreses() {
		SelectorLogic sEmp = new SelectorLogic (connLC);
		String sql = "Select Empresas.CodigoEmpresa,Empresas.CifDni,Empresas.Empresa,Empresas.NombrePersona,Empresas.PrimerApellido,Empresas.SegundoApellido  from EmpresaNomina inner join Empresas on EmpresaNomina.CodigoEmpresa = Empresas.CodigoEmpresa";
		if (desdeEmp>0) sql += " and Empresas.CodigoEmpresa>="+desdeEmp; 
		if (hastaEmp>0) sql += " and Empresas.CodigoEmpresa<="+hastaEmp; 		
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
			vDadesEmpresa.addElement (new DadesEmpresa(emp,nif,razon,APLICACION_GEYCE.JNOMINA));
		}
		sEmp.close();
		return vDadesEmpresa;
	}

	@Override
	public APLICACION_GEYCE getAplicGeyce() {
		return APLICACION_GEYCE.JNOMINA;
	}
	
	protected void initPrograma() {
	  try {
      //pr.setConnection(dbJnom);
		//prNom.logicNomina = connLC;
		prNom.setConnection(servidor, nombreBD, user, passwd, instancia);
		//prNom.iniLog();
		/*
		pr.santiguedad.setDb(dbJnom);
		pr.scambioconv.setDb(dbJnom);
		pr.scambioemp.setDb(dbJnom);
		pr.scateg.setDb(dbJnom);
		pr.scateg2.setDb(dbJnom);
		pr.scdp.setDb(dbJnom);
		pr.scendbancos.setDb(dbJnom);
		pr.scendpto.setDb(dbJnom);
		pr.scentros.setDb(dbJnom);
		pr.scentros.setDb(dbJnom);
		pr.scentrosexc.setDb(dbJnom);
		pr.scentrosvar.setDb(dbJnom);
		pr.schecklibre.setDb(dbJnom);
		pr.sconceptos.setDb(dbJnom);
		pr.sconceptos2.setDb(dbJnom);
		pr.sconceptos3.setDb(dbJnom);
		pr.sconclaves.setDb(dbJnom);
		pr.sconfacrel.setDb(dbJnom);
		pr.sconfacrel2.setDb(dbJnom);
		pr.sconfactor.setDb(dbJnom);
		pr.sconfactor2.setDb(dbJnom);
		pr.sconpagas.setDb(dbJnom);
		pr.sconvenio.setDb(dbJnom);
		pr.sconversion.setDb(dbJnom);
		pr.sconversion2.setDb(dbJnom);
		pr.sempresa.setDb(dbJnom);
		pr.senlaces.setDb(dbJnom);
		pr.sgarantias.setDb(dbJnom);
		pr.shisdeduc.setDb(dbJnom);
		pr.shisdeduc2.setDb(dbJnom);
		pr.shisperso.setDb(dbJnom);
		pr.shisretri.setDb(dbJnom);
		pr.sincidencias.setDb(dbJnom);
		pr.sincvariable.setDb(dbJnom);
		pr.smunicipio.setDb(dbJnom);
		pr.smutuas.setDb(dbJnom);
		pr.spagas.setDb(dbJnom);
		pr.sparamscal.setDb(dbJnom);
		pr.sseleccion.setDb(dbJnom);
		pr.sseleccioncon.setDb(dbJnom);
		pr.sssbases.setDb(dbJnom);
		pr.sssbases2.setDb(dbJnom);
		pr.sssbonif.setDb(dbJnom);
		pr.sssbontram.setDb(dbJnom);
		pr.sssbontram.setDb(dbJnom);
		pr.ssscnae.setDb(dbJnom);
		pr.ssscnaedet.setDb(dbJnom);
		pr.ssscuotas.setDb(dbJnom);
		pr.ssscuotas2.setDb(dbJnom);
		pr.sssdiasit.setDb(dbJnom);
		pr.sssdiasit2.setDb(dbJnom);
		pr.sssembargo.setDb(dbJnom);
		pr.sssembargo2.setDb(dbJnom);
		pr.sssexclusion.setDb(dbJnom);
		pr.sssexclusion2.setDb(dbJnom);
		pr.sssparametros.setDb(dbJnom);
		pr.sssparametros2.setDb(dbJnom);
		pr.sssregimen.setDb(dbJnom);
		pr.sssregimen2.setDb(dbJnom);
		pr.strabajador.setDb(dbJnom);
		pr.strabonif.setDb(dbJnom);
		pr.stracontrato.setDb(dbJnom);
		pr.straembargo.setDb(dbJnom);
		pr.straembhistor.setDb(dbJnom);
		pr.strairpf.setDb(dbJnom);
		pr.stramgarantia.setDb(dbJnom);
		pr.stramsantig.setDb(dbJnom);
		pr.straunifam.setDb(dbJnom);
		pr.svacaciones.setDb(dbJnom);
		pr.svaloresnom.setDb(dbJnom);
		*/
		prNom.snifes.setDb(connEA);		
		prNom.scdp.setDb(connEA);
		prNom.smunicipio.setDb(connEA);
		prNom.srepres.setDb(connEA);
		prNom.sultimaincidenc.setDb(connEA);
		prNom.sparametros.setDb(connEA);
		prNom.sadmhacienda.setDb(connEA);
		connModasp = Modasp.getConnModasp();
		prNom.smod110.setDb(connModasp);
		prNom.smodestado.setDb(connModasp);
		prNom.smodnifcdp.setDb(connModasp);
		prNom.carregaTaulaBonificacions();
		prNom.carregaTaulaContractes();	    
		prNom.chequeaConvenio9000();
		prNom.vconvers.vvdesdehisto	.setValue(desdeEjer);
		prNom.vconvers.vvdpto		.setValue(equivDpto);
		prNom.vconvers.vvnombd		.setValue(nombreBD);	
		prNom.vconvers.chconvenio	.setValue(conceptoConvenio);
		prNom.sparametros.setWhere("pardominio = '"+dominio+"'   AND parusuario = '"+user+"' AND parambito = 'CONVERLOGIC' AND parvariable = 'PARAMLOGIC' AND paragrup = 'JNOMINA'");
		prNom.sparametros.execute();
		if(prNom.sparametros.isEof()) {
	      prNom.sparametros.addNew();
	      prNom.sparametros.pardominio     .setValue(dominio);
	      prNom.sparametros.parusuario     .setValue(user);
	      prNom.sparametros.parambito      .setValue("CONVERLOGIC");
	      prNom.sparametros.parvariable    .setValue("PARAMLOGIC");
	      prNom.sparametros.pardesc        .setValue(user+"^"+((passwd == null || passwd.equals(""))?"":passwd)+ (desdeEjer == 0?"^":"^"+desdeEjer) + (equivDpto == null?"^":"^"+equivDpto));
	      prNom.sparametros.paragrup       .setValue("JNOMINA");
	      prNom.sparametros.parvalor       .setValue(servidor+"^"+ nombreBD+((instancia == null || instancia.equals(""))?"":"^"+instancia));	      
	      prNom.sparametros.insert();
		}
		//prNom.sconfactor2.setWhere("facconvemp ='E'");
		//prNom.sconfactor2.execute();
		//prNom.sconceptos2.setWhere("conconvemp ='E'");
		//prNom.sconceptos2.execute();
		prNom.sconversion.execute();
		prNom.sconversion2.execute();
		prNom.cargaConvenios();
		prNom.cargaEmpresas();
		prNom.getDataBase().commit();
		prNom.sparametros.getDataBase().commit();
		
		
	    
	  }
	  catch (Exception ex) {
		  ex.printStackTrace();
	  }
	}
	
	public void updateTableConversion(int codiLC, int codiJN) {
	  prNom.sseleccion.setWhere("cnvtipo = 'E' and cnvcodigo = " + codiLC);
	  prNom.sseleccion.execute();
	  if(!prNom.sseleccion.isEof()) {
		prNom.sseleccion.edit();
		prNom.sseleccion.cnvseleccion.setValue("N");
		prNom.sseleccion.cnvestado.setValue("C");
		prNom.sseleccion.cnvobserva.setValue("Empresa traspasada");
		prNom.sseleccion.cnvnewcodigo.setValue(codiJN);
		prNom.sseleccion.update();
		//prNom.sseleccion.getDataBase().commit();
	  }
	}

	
}
