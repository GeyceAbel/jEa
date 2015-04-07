package mae.easp.conversions;

import geyce.maefc.DBConnection;
import geyce.maefc.Insert;
import geyce.maefc.Selector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;

import mae.easp.conversions.Conversion.APLICACION_GEYCE;
import mae.easp.general.Easp;
import mae.general.Numero;

public class GestionCodigos {
	private Hashtable <String,DadesEmpresa> htEmpresas;
	private DBConnection connEA;
	private int idCabecera;
	private String sError;
	private int nveces=0;

	public GestionCodigos (int idCabecera, DBConnection connEA) {
		this.connEA = connEA;
		this.idCabecera = idCabecera;
		htEmpresas = new Hashtable<String, DadesEmpresa>();
	}

	private String getKey (int empresa, String empresaStr, String nif, boolean esString) {
		if (esString) return empresaStr +"@@@@"+nif;
		else return Numero.format(empresa, "000000") +"@@@@"+nif;
	}
	
	public void addVectorEmpresas (Vector<DadesEmpresa> vdades) {
		if (vdades != null) {
			for (int i=0;i<vdades.size();i++) {
				DadesEmpresa de = vdades.elementAt(i);
				String clau = getKey(de.getCodiOrigen(),de.getCodiOrigenStr(),de.getNif(), de.esCodigoOrigenString());
				if (!htEmpresas.containsKey(clau)) htEmpresas.put(clau, de);
				else htEmpresas.get(clau).addAplicacionAConvertir(de.getAplicOrigen());
			}
		}
	}

	public String getError() {
		return sError;
	}

	public boolean hayError() {
		return sError != null;
	}

	public boolean asignarCodigos () {
		boolean bOk = true;
		nveces++;
		Vector<Integer> vAsignadas = new Vector<Integer> ();		
		ArrayList<String> aKeys = new ArrayList<String>(Collections.list(htEmpresas.keys())); 
		Collections.sort (aKeys);
		//1. intentem asignar el codi LogicClass
		for (int i=0; i<aKeys.size();i++) {
			DadesEmpresa de = htEmpresas.get(aKeys.get(i));
			if (!de.esCodigoOrigenString()) {
				String cdp = Easp.dominio.substring(0,6)+Numero.format(de.getCodiOrigen(),"000000");
				if (!existeCDP (cdp) || esElMismoCDP(cdp,de.getNif())) {
					de.setCodiGeyce(de.getCodiOrigen());
					vAsignadas.addElement(de.getCodiGeyce());	          
				}
			}
		}
		//2. intentem asignar el codi a partir del nif
		for (int i=0; i<aKeys.size();i++) {
			DadesEmpresa de = htEmpresas.get(aKeys.get(i));
			if (!de.esCodigoOrigenString() && de.getCodiGeyce() == Conversion.CODIGO_EMPRESA_NO_ASIGNADA) {
				String cdptmp = getCdpOtro (de.getNif());
				if (cdptmp!=null) {
					int valortmp = Integer.parseInt(cdptmp.substring(6));
					if (!vAsignadas.contains(new Integer(valortmp))) {
						de.setCodiGeyce(valortmp);
						vAsignadas.addElement(de.getCodiGeyce());
					}
				}
			}
		}
		//3. Intentem donar un codi CDP aleatori
		for (int i=0; i<aKeys.size();i++) {
			DadesEmpresa de = htEmpresas.get(aKeys.get(i));
			if (!de.esCodigoOrigenString() && de.getCodiGeyce() == Conversion.CODIGO_EMPRESA_NO_ASIGNADA) {
				boolean trobat = false;
				for (int c = de.getCodiOrigen() + 1;c<=999997 && !trobat;c++) {
					String cdptmp = Easp.dominio.substring(0,6)+Numero.format(c,"000000");
					if (!vAsignadas.contains(new Integer(c)) && !existeCDP (cdptmp) )  {
						de.setCodiGeyce (c);
						vAsignadas.addElement(de.getCodiGeyce());
						trobat = true;
					}
				}
				if (!trobat) {
					for (int c = 1;c < de.getCodiOrigen() && !trobat;c++) {
						String cdptmp = Easp.dominio.substring(0,6)+Numero.format(c,"000000");
						if (!vAsignadas.contains(new Integer(c)) && !existeCDP (cdptmp) )  {
							de.setCodiGeyce (c);
							vAsignadas.addElement(de.getCodiGeyce());
							trobat = true;
						}
					}	            	
				}
			}
		}		
		
		// *************** Codis Alfanumerics  ************************
				
		int increm=0;
		increm=incremenRenta();		
		// 
		
		for (int i=0; i<aKeys.size();i++) {
			DadesEmpresa de = htEmpresas.get(aKeys.get(i));
			if (de.esCodigoOrigenString() && de.getCodiGeyce() == Conversion.CODIGO_EMPRESA_NO_ASIGNADA) {
				int num = getOtroEmp2Conver (de.getNif());
				if (num >0) de.setCodiGeyce(num);
			}
		}

		for (int i=0; i<aKeys.size();i++) {
			DadesEmpresa de = htEmpresas.get(aKeys.get(i));
			if (de.esCodigoOrigenString() && de.getCodiGeyce() == Conversion.CODIGO_EMPRESA_NO_ASIGNADA) {
				String cdptmp = getCdpOtro (de.getNif());
				if (cdptmp!=null) {
					int valortmp = Integer.parseInt(cdptmp.substring(6));
					if (!vAsignadas.contains(new Integer(valortmp))) {
						de.setCodiGeyce(valortmp);
						vAsignadas.addElement(de.getCodiGeyce());
					}
				}
			}
		}		
		
		

		for (int i=0; i<aKeys.size();i++) {
			DadesEmpresa de = htEmpresas.get(aKeys.get(i));
			if (de.esCodigoOrigenString() && de.getCodiGeyce() == Conversion.CODIGO_EMPRESA_NO_ASIGNADA) {
				boolean trobat = false;
				for (int c = de.getCodiOrigen() + 1; c<=999997 && !trobat;c++) {					
					//					
					if  (Conversion.APLICACION_GEYCE.JRENTA != APLICACION_GEYCE.JRENTA || nveces!=1) increm=0;
					System.out.println(""+c+"] ["+(c+increm)+" ["+de.getAplicOrigen()+" "+nveces+" ,1");
					//
					String cdptmp = Easp.dominio.substring(0,6)+Numero.format( (c+increm),"000000");
					if (!vAsignadas.contains(new Integer((c+increm))) && !existeCDP (cdptmp) )  {
						de.setCodiGeyce ((c+increm));
						vAsignadas.addElement(de.getCodiGeyce());
						trobat = true;
					}
				}
				
				if (!trobat) {
					for (int c = 1;c < de.getCodiOrigen() && !trobat;c++) {
						//
						if  (Conversion.APLICACION_GEYCE.JRENTA != APLICACION_GEYCE.JRENTA || nveces!=1) increm=0;
						//if (!"JRENTA".equals(de.getAplicOrigen())) increm=0;						
						System.out.println("NOtrobat "+c+"] ["+(c+increm)+" ["+de.getAplicOrigen()+" ,2");
						//
						String cdptmp = Easp.dominio.substring(0,6)+Numero.format(c+increm,"000000");
						if (!vAsignadas.contains(new Integer(c+increm)) && !existeCDP (cdptmp) )  {
							de.setCodiGeyce (c+increm);
							vAsignadas.addElement(de.getCodiGeyce());
							trobat = true;
						}
					}	            	
				}
			}
		}		
		// *************** FI Codis Alfanumerics  ************************
		
		if (htEmpresas.size() > 0) {
			for (java.util.Enumeration<DadesEmpresa> e = htEmpresas.elements() ; bOk && e.hasMoreElements() ;) {
				DadesEmpresa de = e.nextElement();
				Insert iccl = new Insert(connEA,"CODCNVOTRAPLL");
				iccl.valor("cclcodi",0);
				iccl.valor("cclccocodi",idCabecera);
				iccl.valor("cclsel",(de.getCodiGeyce() == Conversion.CODIGO_EMPRESA_NO_ASIGNADA) ? "N" : "S");
				iccl.valor("cclcodiorigen",de.getCodiOrigen());
				iccl.valor("cclcodiorigens",de.getCodiOrigenStr());
				iccl.valor("cclnif",de.getNif());
				iccl.valor("cclnombre",de.getRazonSocial());
				iccl.valor("cclcodigeyce",de.getCodiGeyce());
				iccl.valor("ccltraspjco", (de.getCodiGeyce() != Conversion.CODIGO_EMPRESA_NO_ASIGNADA && de.seConvierteAplicacion(Conversion.APLICACION_GEYCE.JCONTA))   ? "S" : "N");
				iccl.valor("ccltraspjeo", (de.getCodiGeyce() != Conversion.CODIGO_EMPRESA_NO_ASIGNADA && de.seConvierteAplicacion(Conversion.APLICACION_GEYCE.JEO))      ? "S" : "N");
				iccl.valor("ccltraspjre", (de.getCodiGeyce() != Conversion.CODIGO_EMPRESA_NO_ASIGNADA && de.seConvierteAplicacion(Conversion.APLICACION_GEYCE.JRENTA))   ? "S" : "N");
				iccl.valor("ccltraspjsoc",(de.getCodiGeyce() != Conversion.CODIGO_EMPRESA_NO_ASIGNADA && de.seConvierteAplicacion(Conversion.APLICACION_GEYCE.JISS))     ? "S" : "N");
				iccl.valor("ccltraspjnom",(de.getCodiGeyce() != Conversion.CODIGO_EMPRESA_NO_ASIGNADA && de.seConvierteAplicacion(Conversion.APLICACION_GEYCE.JNOMINA))  ? "S" : "N");
				iccl.valor("ccltraspjges",(de.getCodiGeyce() != Conversion.CODIGO_EMPRESA_NO_ASIGNADA && de.seConvierteAplicacion(Conversion.APLICACION_GEYCE.JGESTION)) ? "S" : "N");
				bOk = iccl.execute();
			}
			if (bOk) connEA.commit();
			else {
				connEA.rollback();
				sError = "Error al preparar tabla de detalle conversión.";
			}
		}
		else {
			bOk = false;
			sError = "No se han encontrado empresas a convertir.";
		}
		return bOk;
	}
	
	private int getOtroEmp2Conver(String nif) {
		int num = 0;
		boolean trobat = false;
		if (nif == null) return 0;
		for (java.util.Enumeration<DadesEmpresa> e = htEmpresas.elements() ; !trobat && e.hasMoreElements() ;) {
			DadesEmpresa de = e.nextElement();
			if (nif.equals(de.getNif())) {
				num = de.getCodiGeyce();
				trobat = true;
			}
		}
		return num;           
	}

	private String getCdpOtro(String nif) {
		String cdpcodi = null;
		Selector sCdp = new Selector(connEA);
		sCdp.execute("Select cdpcodi from CDP where cdpnifcif='"+nif+"'");
		if (sCdp.next()) cdpcodi = sCdp.getString("cdpcodi");
		sCdp.close();
		return cdpcodi;           
	}

	private boolean esElMismoCDP(String codCdp, String nif) {
		boolean mismo = false;
		Selector sCdp = new Selector(connEA);
		sCdp.execute("Select * from CDP where cdpcodi='"+codCdp+"' and cdpnifcif='"+nif+"'");
		if (sCdp.next()) mismo = true;
		sCdp.close();
		return mismo;           
	}

	private boolean existeCDP(String codCdp) {
		boolean existe = false;
		Selector sCdp = new Selector(connEA);
		sCdp.execute("Select cdpcodi from CDP where cdpcodi='"+codCdp+"'");
		if (sCdp.next()) existe = true;
		sCdp.close();
		return existe;           
	}
		
	private int incremenRenta(){            
		int nro=0, nroNew=0;
		String codi="" ;
		Selector sCdp = new Selector(connEA);
		sCdp.execute("Select max(cdpcodi) as cnt from CDP where "+
				" cdpcodi <> '"+(Easp.dominio.substring(0,6)+"999994")+"' and "+
				" cdpcodi <> '"+(Easp.dominio.substring(0,6)+"999995")+"' and "+
				" cdpcodi <> '"+(Easp.dominio.substring(0,6)+"999996")+"' and "+
				" cdpcodi <> '"+(Easp.dominio.substring(0,6)+"999997")+"' and "+
				" cdpcodi <> '"+(Easp.dominio.substring(0,6)+"999998")+"' and "+
				" cdpcodi <> '"+(Easp.dominio.substring(0,6)+"999999")+"' ");
		if (sCdp.next()) codi=sCdp.getString("cnt");
		sCdp.close();
		if (codi!=null){
			codi=codi.substring(6,12);
			nro=Integer.parseInt(codi);
			nroNew=100000;
			/*
			if (nro<100000)      nroNew=100000;
			else if (nro<200000) nroNew=200000;
			else if (nro<300000) nroNew=300000;
			else if (nro<400000) nroNew=400000;
			else if (nro<500000) nroNew=101000;
			else if (nro<600000) nroNew=102000;
			else if (nro<700000) nroNew=103000;
			else if (nro<800000) nroNew=104000;								
			else nroNew=0;
			*/
		}
		else nroNew=100000;
		return nroNew;             
	}
    //+++
}
