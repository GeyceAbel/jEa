package mae.easp.conversions.logicclass;

import java.util.Vector;

import mae.easp.conversions.DadesEmpresa;
import mae.easp.conversions.Incidencia;
import mae.easp.conversions.logicclass.db.SelectorLogic;
import mae.general.ProgressBarForm;
import geyce.maefc.*;

import mae.easp.conversions.FuncionesJISS;

public class ConversionJISS extends ConversionLC {
	private ProgressBarForm pbf;
  private FuncionesJISS funciones;
  private DBConnection dbJISS;
  public  mae.jiss.auxlogicclass.ProgAuxlogicclass prJiss;
  public  mae.jiss.zzzprmenuprogs.ProgZzzprmenuprogs prJissMenu;
  public  mae.jiss.menu.CtrlMenu menu;


	public ConversionJISS (Program pr,int idConversion, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, String servidor, String instancia, String nombreBD, String user, String passwd, DBConnection connEA) {
		super (pr,desdeEmp, hastaEmp, desdeEjer, hastaEjer, connEA, servidor, instancia, nombreBD, user, passwd, idConversion);
    funciones = new FuncionesJISS(connEA,dominio);
    prJiss= new mae.jiss.auxlogicclass.ProgAuxlogicclass();
    prJissMenu = new mae.jiss.zzzprmenuprogs.ProgZzzprmenuprogs();
    dbJISS = funciones.connJISS;
    prJiss.setConnection(dbJISS);
    mae.jiss.general.Jiss.connJISS = funciones.connJISS;
    mae.jiss.general.Jiss.connEA = connEA;
    mae.jiss.general.Jiss.dominio = dominio;

    prJiss.setDataBase(dbJISS.getDB());
    prJiss.vejecutar.converConjuntaEA = true;
    prJiss.vejecutar.emc = emc;
	  initPrograma();
	}

	protected Vector<Incidencia> convertirEmpresa(DadesEmpresa de, ProgressBarForm pbf) {
     int empLC = de.getCodiOrigen();
     int empJC = de.getCodiGeyce();
     String sNifEmpresa = de.getNif();
     Vector<Incidencia> vIncidencias = new Vector<Incidencia>();
     sError = "";
     prJiss.vejecutar.connLogic = connLC;
     prJiss.vejecutar.refrescar = false;
     mae.jiss.general.Jiss.connModasp = connModasp;
     mae.jiss.general.Jiss.connJISS = funciones.connJISS;
     prJiss.vejecutar.emc = emc;
     prJiss.vejecutar.vvcodigo .setValue(de.getCodiOrigen());
     prJiss.vejecutar.vvhastacodigo .setValue(de.getCodiOrigen());
     mae.jiss.AppJiss.ggempresa = empJC;
     int anyMinim = desdeEjer;
     if (desdeEjer<2009) anyMinim = 2009;
     int anyMaxim = hastaEjer;
     Selector s = new Selector (dbJISS);
     s.execute("Select max(msoejeraplic) as ejer from MENUSOCIEDAD");
     if (s.next() && s.getint("ejer")<anyMaxim)  anyMaxim = s.getint("ejer");
     s.close();
     for (int exercici=anyMinim;exercici<=anyMaxim;exercici++) {
          pbf.setState ("Conversión ejercicio "+exercici+" ["+empLC+"] -- ["+empJC+"]");
          prJiss.vejecutar.pbf = pbf;
          mae.jiss.general.Jiss.gEjercicio = exercici;
          montarArbol(exercici);
          prJiss.vejecutar.vvejercicio.setValue(exercici);     
          boolean bOk = prJiss.vejecutar.traspasoEA (empLC, empJC);
          if (bOk) {
              mae.jiss.general.Jiss.connJISS.commit();
              mae.jiss.general.Jiss.connEA.commit();
              mae.jiss.general.Jiss.connModasp.commit();
          }
          else {
              mae.jiss.general.Jiss.connJISS.rollback();
              mae.jiss.general.Jiss.connEA.rollback();
              mae.jiss.general.Jiss.connModasp.rollback();
              vIncidencias.addElement(new Incidencia (empLC,empJC,exercici,prJiss.vejecutar.sError,APLICACION_GEYCE.JISS,de.getNif(),de.getRazonSocial(),idConversion));
          }
     }
     return vIncidencias;
	}

	public Vector<DadesEmpresa> initEmpreses() {
        String where = " empresaestimaciones=0 and (IOF_SocPeriodos.Ejercicio>="+desdeEjer+" and IOF_SocPeriodos.Ejercicio<="+hastaEjer+")";
        if (desdeEmp>0) where += " and Empresas.CodigoEmpresa>="+desdeEmp;
        if (hastaEmp>0) where += " and Empresas.CodigoEmpresa<="+hastaEmp;
        SelectorLogic sEmpresas = new SelectorLogic (connLC);
        sEmpresas.execute("Select distinct Empresas.cifDni,Empresas.Empresa,Empresas.codigoempresa as codi from Empresas INNER JOIN IOF_SocPeriodos on IOF_SocPeriodos.CodigoEmpresa=Empresas.CodigoEmpresa where "+where+" order by Empresas.CodigoEmpresa");
        while (sEmpresas.next()) {
           int codEmp = sEmpresas.getint("Codi");
           String nif = sEmpresas.getString("CifDni");
           String nombreCompleto = sEmpresas.getString("Empresa");
           DadesEmpresa de = new DadesEmpresa(codEmp,nif,nombreCompleto,APLICACION_GEYCE.JISS);
           if (!vDadesEmpresa.contains(de)) vDadesEmpresa.addElement (de);
        }
        sEmpresas.close();
		return vDadesEmpresa;
	}

	public APLICACION_GEYCE getAplicGeyce() {
		return APLICACION_GEYCE.JISS;
	}
	protected void initPrograma() {
      prJiss.vejecutar.connLogic = connLC;
      prJiss.vejecutar.borraTablaConver();
      prJiss.vejecutar.vvcodigo .setValue(desdeEmp);
      prJiss.vejecutar.vvhastacodigo .setValue(hastaEmp);
	}
	protected void finConver() {
		super.finConver();
    if (dbJISS!=null) dbJISS.disconnect();
	}

 public void montarArbol(int progEjer ){
      mae.jiss.general.Jiss.raiz = new TreeTableNode(new mae.jiss.menu.OpcionMenu(0,"0","","MENÚ  J-SOCIEDADES","","",null));
      mae.jiss.general.Jiss.menu=new mae.jiss.menu.CtrlMenu(prJissMenu.vmenu,prJissMenu);

      mae.jiss.general.Jiss.menu.setRoot(mae.jiss.general.Jiss.raiz);
      java.util.Hashtable <String,TreeTableNode> htNodos =  new java.util.Hashtable <String,TreeTableNode> ();
      mae.jiss.general.Jiss.htNodosPrograma =  new java.util.Hashtable <String,TreeTableNode> ();
      htNodos.put("0",mae.jiss.general.Jiss.raiz);
      Selector smenu = new Selector(dbJISS);
      String sSql = "SELECT * from MENUSOCIEDAD where msoejeraplic="+progEjer+" order by msoparent,msonumero";
      smenu.execute(sSql);
      while (smenu.next()) {
        int id = smenu.getint("msoident");
        String descripcion = smenu.getString("msodescripcion");
        String padre = smenu.getString("msoparent");
        String numero = smenu.getString("msonumero");
        String programa = smenu.getString("msoprograma");
        String campo = smenu.getString("msocampo");
        String ejerant = smenu.getString("msoejeranter");
        String ejersig = smenu.getString("msoejersig");
        java.util.Date fecha = mae.general.Fecha.getDate(progEjer,1,1);
        TreeTableNode nodo;
        java.util.Date fecTmp = null;
        String valorFecha = "";
        if (programa !=null && programa.trim().length()>0) {
            programa = programa.trim();
            nodo = new TreeTableNode(new mae.jiss.menu.OpcionPrograma(id,padre,numero,descripcion,programa,campo,valorFecha,fecTmp,ejerant,ejersig));
            TreeTableNode nodopadre = htNodos.get(padre);
            if (nodopadre!=null) {
              nodopadre.add(nodo);
              mae.jiss.general.Jiss.htNodosPrograma.put(campo,nodo);
            }
        }
        else {
            nodo = new TreeTableNode(new mae.jiss.menu.OpcionMenu(id,padre,numero,descripcion,campo,valorFecha,fecTmp));
            htNodos.put(padre+numero,nodo);
            TreeTableNode nodopadre = htNodos.get(padre);
            if (nodopadre!=null) nodopadre.add(nodo);
        }
      }
      smenu.close();
    }

}
