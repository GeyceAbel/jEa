// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Wed Jul 27 13:45:43 CEST 2022
// 
// Aplicación: easp
// 
package mae.easp.prsctrolcdp;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import java.util.Hashtable;
import java.util.List;
import mae.easp.*;
// 
// Programa: prsctrolcdp
// Nombre:   Validación códigos empresa
// Versión:  1.0
// 
public class ProgPrsctrolcdp extends Program
    {
    public AppEasp easp;
    public ProgPrsctrolcdp prsctrolcdp;
    // GLOBALES: PROGRAMA
    public int ejercicio=0;

public boolean delParamlis(int ejer,String user){
  String any= Integer.toString(ejer);	
  String programa="PRSCTROLCDP"+ejer;
  boolean b=true;	
  Delete d = new Delete (Easp.connEA,"PARAMLIS");
  //b=d.execute("pliprograma='"+programa+"' AND pliusuario='"+user+"' "); 
  b=d.execute("pliprograma like'PRSCTROLCDP%' AND pliusuario='"+user+"' ");    
 return b;
}

public boolean leeParamlis(int any,String user,int CNT, int cdp1,String nif1,  String nif2, String apli) {
  boolean trobat=false;
  String sql=" pliasesor="+cdp1+" AND plicampoa1='"+nif1+"' AND plicampoa2='"+apli+"' AND plicampoa3='"+nif2+"' AND ";
  sql += " pliprograma like 'PRSCTROLCDP%' AND pliusuario='"+user+"' ";
  Selector s = new Selector (Easp.connEA);		
  s.execute("Select * from PARAMLIS where "+sql);
  if (s.next()) trobat=true;
  s.close();
 return trobat; 
}

public boolean gravaParamlis(int any,String user,int CNT, int cdp1,String nif1,  String nif2, String apli) {
   boolean b=true;
   Insert i = new Insert(Easp.connEA,"PARAMLIS");
   i.valor("pliasesor",  cdp1);
   i.valor("pliusuario", user);
   i.valor("pliprograma","PRSCTROLCDP"+Integer.toString(any));
   i.valor("pliopcion",  Integer.toString(CNT));
    //
   i.valor("plicampoa1", nif1);
   i.valor("plicampoa61",getRao(nif1,40));
   i.valor("plicampoa2", apli);
   i.valor("plicampoa3", nif2);   
   i.valor("plicampoa62",getRao(nif2,30));
   i.valor("plicampoi21",any); 
   i.valor("plicampoa4", Integer.toString(any));      
   if ("JREN".equals(apli) || "JISS".equals(apli)){
   	 i.valor("plicampoi21", (any-1)); 
   	 i.valor("plicampoa4", Integer.toString(any-1));  
   }
   
   b=i.execute();  	
 return b;  
}

public String getRao(String nif, int posfi){
  String nomape="";
  Selector sNIF = new Selector(Easp.connEA);  
  sNIF.execute("Select * from NIFES where danifcif='"+nif+"'");
  if (sNIF.next()){
	String nom =sNIF.getString("datnombre");
	String ape1=sNIF.getString("datapell1");
	String ape2=sNIF.getString("datapell2");
	nomape=nomSencer(ape1, ape2, nom, posfi);
  }
  sNIF.close(); 
 return nomape; 	
}

public String nomSencer(String apellido1, String apellido2, String nombre, int posfi) {
  String nombreComp = "";
  if (apellido1!=null && apellido1.length()>0) nombreComp = apellido1.trim();
  if (apellido2!=null && apellido2.length()>0) nombreComp += " "+apellido2.trim();
  if (nombre!=null && nombre.length()>0)       nombreComp += " "+nombre.trim();	 
    
  if (posfi>0 && !"".equals(nombreComp) && nombreComp!=null){
  	if (nombreComp.length()>posfi) nombreComp=nombreComp.substring(posfi);
  }
 return nombreComp;
}

public int numtotcdp (){ 
   int total=0;	
   Selector s=new Selector(Easp.connEA);  
   s.execute("Select COUNT (cdpcodi) as total from CDP where cdpcodi is not Null AND cdpnifcif is not Null AND cdpcodi like '"+Easp.dominio.substring(0,6)+"%' ");
   if (s.next()) total = s.getint("total");
   s.close();
 return total; 
}

public void initProces(){
	boolean esOk=true;  
	ProgressBarForm pbf=new ProgressBarForm(prsctrolcdp," Validación códigos empresa ",true,false,true) {
	public void job() {
		int nreg=0;
		int total= numtotcdp();
		
		ejercicio = Fecha.anyo( Maefc.getDate());  
		String usuario=Aplication.getAplication().getUser();
		boolean esOk=delParamlis(ejercicio, usuario);
		Hashtable<String,List<String>> ht = new Hashtable<String, List<String>>(); 

		Selector s=new Selector(Easp.connEA);  
		s.execute("Select * from CDP where cdpcodi is not Null AND cdpnifcif is not Null AND cdpcodi like '"+Easp.dominio.substring(0,6)+"%' ORDER BY cdpcodi ");
		while (s.next()){  	  
			String  cdpcodi = s.getString("cdpcodi");
			String  cdpnifcif=s.getString("cdpnifcif");
			int cdporigen = Integer.parseInt(cdpcodi.substring(6,12));   
			if (cdporigen>0 && cdporigen<999999){
			     nreg++;
			     int porcen = 100 * nreg/total;
			     setState("Procesando  "+cdpcodi);
			     setPercent(porcen);  
			     setTitle(" Validación códigos empresa "+ejercicio+": "+cdpcodi+"   "+porcen+"%");        
               // ejercicio actual 
				ht = mae.easp.general.Easp.existeCodiEmpresa(cdpnifcif,ejercicio,cdporigen, true, true, true, true, true);                 
				int cnt=0;
				if (ht.size()>0) { 
					for (String nif: ht.keySet()) {
						List<String> laplicatius = ht.get(nif);
						cnt++;
						// System.out.println(nif);
						for (String aplicatiu : laplicatius) {
							//System.out.println(aplicatiu);
							String apli=aplicatiu;
							esOk=gravaParamlis(ejercicio,usuario,cnt, cdporigen,cdpnifcif, nif,apli);  
						}				  				  
					} 
				}
                // ejercicio-1
                    setTitle(" Validación códigos empresa "+(ejercicio-1)+": "+cdpcodi+"   "+porcen+"%");       
				ht = mae.easp.general.Easp.existeCodiEmpresa(cdpnifcif,(ejercicio-1),cdporigen, true, true, true, true, true);   
				if (ht.size()>0) { 
					for (String nif: ht.keySet()) {
						List<String> laplicatius = ht.get(nif);
						cnt++;
						// System.out.println(nif);
						for (String aplicatiu : laplicatius) {
							//System.out.println(aplicatiu);
							String apli=aplicatiu;
							boolean yaExiste=leeParamlis(ejercicio,usuario,cnt, cdporigen,cdpnifcif, nif,apli);
							if (!yaExiste)
							    esOk=gravaParamlis((ejercicio-1),usuario,cnt, cdporigen,cdpnifcif, nif,apli);  
						}				  				  
					} 
				}
			 //	
			}			
		}
		s.close();    			
		exit(); 
	} 
 };
 pbf.setFormWidth(600);
 pbf.setEnabledCancel(false);
 pbf.setSecondaryAuto(false);
 pbf.launch();
 
 if (esOk) Easp.connEA.commit();    	
 else   Easp.connEA.rollback();
}
    // Metodos
    // Ventana
    public FormV2 v2;
    // Selects
    public S2 s2;
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Validación códigos empresa");
            }
        }
        
    public class FormV2 extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlPliasesor pliasesor;
        public CtrlPlicampoa1 plicampoa1;
        public CtrlPlicampoa61 plicampoa61;
        public CtrlPlicampoa2 plicampoa2;
        public CtrlPlicampoa3 plicampoa3;
        public CtrlPlicampoa62 plicampoa62;
        // Acciones
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
            
        public class CtrlPliasesor extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlPliasesor(Form form)
                {
                super(form);
                setName("pliasesor");
                setMessageHelp("Origen:  Código empresa / código cliente (CDP)");
                setTitle("Cód.Empresa");
                setType(INTEGER);
                setMaskInput("######");
                setMaskOutput("######");
                setLength(6);
                setSearchable(true);
                setEnabled(false);
                setField(s2.pliasesor);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlPlicampoa1 extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlPlicampoa1(Form form)
                {
                super(form);
                setName("plicampoa1");
                setMessageHelp("Origen: NIF / CIF");
                setTitle("NIF / CIF");
                setType(STRING);
                setMaskInput("U");
                setMaskOutput("U");
                setLength(12);
                setSearchable(true);
                setEnabled(false);
                setField(s2.plicampoa1);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlPlicampoa61 extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlPlicampoa61(Form form)
                {
                super(form);
                setName("plicampoa61");
                setMessageHelp("Origen: Apellidos y nombre / Razón social");
                setTitle("Nombre");
                setType(STRING);
                setMaskInput("U");
                setMaskOutput("U");
                setLength(40);
                setSearchable(true);
                setEnabled(false);
                setField(s2.plicampoa61);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlPlicampoa2 extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlPlicampoa2(Form form)
                {
                super(form);
                setName("plicampoa2");
                setMessageHelp("Aplicativo: JCON (contabilidad) JNOM (laboral) JEO (estimación) JISS (sociedades) JREN (renta)");
                setTitle("Aplicación");
                setType(STRING);
                setMaskInput("U");
                setMaskOutput("U");
                setLength(10);
                setSearchable(true);
                setEnabled(false);
                setField(s2.plicampoa2);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlPlicampoa3 extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlPlicampoa3(Form form)
                {
                super(form);
                setName("plicampoa3");
                setMessageHelp("NIF/CIF con el mismo código de empresa");
                setTitle("NIF / CIF");
                setType(STRING);
                setMaskInput("U");
                setMaskOutput("U");
                setLength(12);
                setSearchable(true);
                setEnabled(false);
                setField(s2.plicampoa3);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlPlicampoa62 extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlPlicampoa62(Form form)
                {
                super(form);
                setName("plicampoa62");
                setMessageHelp("Apellidos y nombre / Razón social con el mismo código de empresa");
                setTitle("Nombre");
                setType(STRING);
                setMaskInput("U");
                setMaskOutput("U");
                setLength(30);
                setSearchable(true);
                setEnabled(false);
                setField(s2.plicampoa62);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormV2(ProgPrsctrolcdp prsctrolcdp)
            {
            super(prsctrolcdp);
            setName("v2");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            // SET: VENTANA
            addSelect(s2=new S2());
            addControl(pliasesor=new CtrlPliasesor(this));
            addControl(plicampoa1=new CtrlPlicampoa1(this));
            addControl(plicampoa61=new CtrlPlicampoa61(this));
            addControl(plicampoa2=new CtrlPlicampoa2(this));
            addControl(plicampoa3=new CtrlPlicampoa3(this));
            addControl(plicampoa62=new CtrlPlicampoa62(this));
            setSelect(s2);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // Select CDP
    public class S2 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Paramlis paramlis;
        // Campos
        public Field pliasesor;
        public Field pliusuario;
        public Field pliprograma;
        public Field pliopcion;
        public Field plicampoa1;
        public Field plicampoa2;
        public Field plicampoa3;
        public Field plicampoa4;
        public Field plicampoa5;
        public Field plicampoa6;
        public Field plicampoa7;
        public Field plicampoa8;
        public Field plicampoa9;
        public Field plicampoa10;
        public Field plicampoa11;
        public Field plicampoa12;
        public Field plicampoa13;
        public Field plicampoa14;
        public Field plicampoa15;
        public Field plicampoa16;
        public Field plicampoa17;
        public Field plicampoa18;
        public Field plicampoa19;
        public Field plicampoa20;
        public Field plicampoi21;
        public Field plicampoi22;
        public Field plicampoi23;
        public Field plicampoi24;
        public Field plicampoi25;
        public Field plicampoi26;
        public Field plicampoi27;
        public Field plicampoi28;
        public Field plicampoi29;
        public Field plicampoi30;
        public Field plicampoi31;
        public Field plicampoi32;
        public Field plicampoi33;
        public Field plicampoi34;
        public Field plicampoi35;
        public Field plicampoi36;
        public Field plicampoi37;
        public Field plicampoi38;
        public Field plicampoi39;
        public Field plicampoi40;
        public Field plicampon41;
        public Field plicampon42;
        public Field plicampon43;
        public Field plicampon44;
        public Field plicampon45;
        public Field plicampon46;
        public Field plicampon47;
        public Field plicampon48;
        public Field plicampon49;
        public Field plicampon50;
        public Field plicampod51;
        public Field plicampod52;
        public Field plicampod53;
        public Field plicampod54;
        public Field plicampod55;
        public Field plicampod56;
        public Field plicampod57;
        public Field plicampod58;
        public Field plicampod59;
        public Field plicampod60;
        public Field plicampoa61;
        public Field plicampoa62;
        public Field plicampoa63;
        public Field plicampoa64;
        public Field plicampoa65;
        public Field plicampoa66;
        public Field plicampoa67;
        public Field plicampoa68;
        public Field plicampoa69;
        public Field plicampoa70;
        public Field plicampon71;
        public Field plicampon72;
        public Field plicampon73;
        public Field plicampon74;
        public Field plicampon75;
        public Field plicampon76;
        public Field plicampon77;
        public Field plicampon78;
        public Field plicampon79;
        public Field plicampon80;
        public Field plicampoa81;
        public Field plicampoa82;
        class Paramlis extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Paramlis(Select select)
                {
                super(select);
                setName("paramlis");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public S2()
            {
            setName("s2");
            // SET: SELECT
            addTable(paramlis=new Paramlis(this));
            addField(pliasesor=new Field(this,paramlis,"pliasesor"));
            addField(pliusuario=new Field(this,paramlis,"pliusuario"));
            addField(pliprograma=new Field(this,paramlis,"pliprograma"));
            addField(pliopcion=new Field(this,paramlis,"pliopcion"));
            addField(plicampoa1=new Field(this,paramlis,"plicampoa1"));
            addField(plicampoa2=new Field(this,paramlis,"plicampoa2"));
            addField(plicampoa3=new Field(this,paramlis,"plicampoa3"));
            addField(plicampoa4=new Field(this,paramlis,"plicampoa4"));
            addField(plicampoa5=new Field(this,paramlis,"plicampoa5"));
            addField(plicampoa6=new Field(this,paramlis,"plicampoa6"));
            addField(plicampoa7=new Field(this,paramlis,"plicampoa7"));
            addField(plicampoa8=new Field(this,paramlis,"plicampoa8"));
            addField(plicampoa9=new Field(this,paramlis,"plicampoa9"));
            addField(plicampoa10=new Field(this,paramlis,"plicampoa10"));
            addField(plicampoa11=new Field(this,paramlis,"plicampoa11"));
            addField(plicampoa12=new Field(this,paramlis,"plicampoa12"));
            addField(plicampoa13=new Field(this,paramlis,"plicampoa13"));
            addField(plicampoa14=new Field(this,paramlis,"plicampoa14"));
            addField(plicampoa15=new Field(this,paramlis,"plicampoa15"));
            addField(plicampoa16=new Field(this,paramlis,"plicampoa16"));
            addField(plicampoa17=new Field(this,paramlis,"plicampoa17"));
            addField(plicampoa18=new Field(this,paramlis,"plicampoa18"));
            addField(plicampoa19=new Field(this,paramlis,"plicampoa19"));
            addField(plicampoa20=new Field(this,paramlis,"plicampoa20"));
            addField(plicampoi21=new Field(this,paramlis,"plicampoi21"));
            addField(plicampoi22=new Field(this,paramlis,"plicampoi22"));
            addField(plicampoi23=new Field(this,paramlis,"plicampoi23"));
            addField(plicampoi24=new Field(this,paramlis,"plicampoi24"));
            addField(plicampoi25=new Field(this,paramlis,"plicampoi25"));
            addField(plicampoi26=new Field(this,paramlis,"plicampoi26"));
            addField(plicampoi27=new Field(this,paramlis,"plicampoi27"));
            addField(plicampoi28=new Field(this,paramlis,"plicampoi28"));
            addField(plicampoi29=new Field(this,paramlis,"plicampoi29"));
            addField(plicampoi30=new Field(this,paramlis,"plicampoi30"));
            addField(plicampoi31=new Field(this,paramlis,"plicampoi31"));
            addField(plicampoi32=new Field(this,paramlis,"plicampoi32"));
            addField(plicampoi33=new Field(this,paramlis,"plicampoi33"));
            addField(plicampoi34=new Field(this,paramlis,"plicampoi34"));
            addField(plicampoi35=new Field(this,paramlis,"plicampoi35"));
            addField(plicampoi36=new Field(this,paramlis,"plicampoi36"));
            addField(plicampoi37=new Field(this,paramlis,"plicampoi37"));
            addField(plicampoi38=new Field(this,paramlis,"plicampoi38"));
            addField(plicampoi39=new Field(this,paramlis,"plicampoi39"));
            addField(plicampoi40=new Field(this,paramlis,"plicampoi40"));
            addField(plicampon41=new Field(this,paramlis,"plicampon41"));
            addField(plicampon42=new Field(this,paramlis,"plicampon42"));
            addField(plicampon43=new Field(this,paramlis,"plicampon43"));
            addField(plicampon44=new Field(this,paramlis,"plicampon44"));
            addField(plicampon45=new Field(this,paramlis,"plicampon45"));
            addField(plicampon46=new Field(this,paramlis,"plicampon46"));
            addField(plicampon47=new Field(this,paramlis,"plicampon47"));
            addField(plicampon48=new Field(this,paramlis,"plicampon48"));
            addField(plicampon49=new Field(this,paramlis,"plicampon49"));
            addField(plicampon50=new Field(this,paramlis,"plicampon50"));
            addField(plicampod51=new Field(this,paramlis,"plicampod51"));
            addField(plicampod52=new Field(this,paramlis,"plicampod52"));
            addField(plicampod53=new Field(this,paramlis,"plicampod53"));
            addField(plicampod54=new Field(this,paramlis,"plicampod54"));
            addField(plicampod55=new Field(this,paramlis,"plicampod55"));
            addField(plicampod56=new Field(this,paramlis,"plicampod56"));
            addField(plicampod57=new Field(this,paramlis,"plicampod57"));
            addField(plicampod58=new Field(this,paramlis,"plicampod58"));
            addField(plicampod59=new Field(this,paramlis,"plicampod59"));
            addField(plicampod60=new Field(this,paramlis,"plicampod60"));
            addField(plicampoa61=new Field(this,paramlis,"plicampoa61"));
            addField(plicampoa62=new Field(this,paramlis,"plicampoa62"));
            addField(plicampoa63=new Field(this,paramlis,"plicampoa63"));
            addField(plicampoa64=new Field(this,paramlis,"plicampoa64"));
            addField(plicampoa65=new Field(this,paramlis,"plicampoa65"));
            addField(plicampoa66=new Field(this,paramlis,"plicampoa66"));
            addField(plicampoa67=new Field(this,paramlis,"plicampoa67"));
            addField(plicampoa68=new Field(this,paramlis,"plicampoa68"));
            addField(plicampoa69=new Field(this,paramlis,"plicampoa69"));
            addField(plicampoa70=new Field(this,paramlis,"plicampoa70"));
            addField(plicampon71=new Field(this,paramlis,"plicampon71"));
            addField(plicampon72=new Field(this,paramlis,"plicampon72"));
            addField(plicampon73=new Field(this,paramlis,"plicampon73"));
            addField(plicampon74=new Field(this,paramlis,"plicampon74"));
            addField(plicampon75=new Field(this,paramlis,"plicampon75"));
            addField(plicampon76=new Field(this,paramlis,"plicampon76"));
            addField(plicampon77=new Field(this,paramlis,"plicampon77"));
            addField(plicampon78=new Field(this,paramlis,"plicampon78"));
            addField(plicampon79=new Field(this,paramlis,"plicampon79"));
            addField(plicampon80=new Field(this,paramlis,"plicampon80"));
            addField(plicampoa81=new Field(this,paramlis,"plicampoa81"));
            addField(plicampoa82=new Field(this,paramlis,"plicampoa82"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            String programa="PRSCTROLCDP"+Integer.toString(ejercicio);
            //return "pliprograma='"+programa+"' ";
            return "pliprograma LIKE 'PRSCTROLCDP%' ";
            }
        public String getOrder ()
            {
            return "pliasesor";
            }
        // EVENT: SELECT
        }
        
    public ProgPrsctrolcdp()
        {
        this.prsctrolcdp=this;
        setName("prsctrolcdp");
        setTitle("Validación códigos empresa");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(v2=new FormV2(this));
        }
    public ProgPrsctrolcdp(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        setConnection(Easp.connEA);
        v2.setInitState(DataForm.SHOW);
        initProces();
        super.onInit();
        
        }
    }
    
