// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Tue Jul 16 12:02:33 CEST 2019
// 
// Aplicación: easp
// 
package mae.easp.prchgnif;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: prchgnif
// Nombre:   Modificar NIF/CIF
// Versión:  1.0
// 
public class ProgPrchgnif extends Program
    {
    public AppEasp easp;
    public ProgPrchgnif prchgnif;
    // GLOBALES: PROGRAMA
    public String gcdp=null;
public boolean esVirtualFisc = false;
private boolean esjNomina;
private boolean esjConta;
private boolean esjEO;
private boolean esjISS;
private boolean esjRENTA;
private boolean esjExpe;
    // Metodos
    // Ventana
    public FormVcambianif vcambianif;
    // Selects
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Modificar NIF/CIF");
            }
        }
        
    public class FormVcambianif extends ProcessForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlVcliente vcliente;
        public CtrlVnombre vnombre;
        public CtrlVnif vnif;
        public CtrlVnounif vnounif;
        public CtrlJmodelos jmodelos;
        public CtrlJea jea;
        public CtrlJconta jconta;
        public CtrlJnomina jnomina;
        public CtrlJeo jeo;
        public CtrlJiss jiss;
        public CtrlJrenta jrenta;
        public CtrlJexpe jexpe;
        // Acciones
        public LinkBtchgnif btchgnif;
        // Fieldsets
        public FSetF1 f1;
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
            
        public class CtrlVcliente extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVcliente(Form form)
                {
                super(form);
                setName("vcliente");
                setMessageHelp("Código cliente");
                setTitle("Cliente");
                setType(STRING);
                setLength(12);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVnombre extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVnombre(Form form)
                {
                super(form);
                setName("vnombre");
                setMessageHelp("Nombre cliente");
                setTitle("Nombre");
                setType(STRING);
                setLength(45);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVnif extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVnif(Form form)
                {
                super(form);
                setName("vnif");
                setMessageHelp("NIF/CIF actual");
                setTitle("NIF/CIF");
                setType(STRING);
                setLength(15);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVnounif extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVnounif(Form form)
                {
                super(form);
                setName("vnounif");
                setMessageHelp("Introducir el nuevo NIF/CIF");
                setTitle("NIF nuevo");
                setType(STRING);
                setMaskInput("U");
                setLength(15);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                vcambianif.vnounif.setValue(Util.esCIF(vcambianif.vnounif.getString()));
                }
            }
            
        public class CtrlJmodelos extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlJmodelos(Form form)
                {
                super(form);
                setName("jmodelos");
                setTitle("jModelos");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                jmodelos.setEnabled(false);
                return true;
                }
            }
            
        public class CtrlJea extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlJea(Form form)
                {
                super(form);
                setName("jea");
                setTitle("jEA");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                jea.setEnabled(false);
                return true;
                }
            }
            
        public class CtrlJconta extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlJconta(Form form)
                {
                super(form);
                setName("jconta");
                setTitle("jConta");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                jconta.setEnabled(false);
                return esjConta;
                }
            }
            
        public class CtrlJnomina extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlJnomina(Form form)
                {
                super(form);
                setName("jnomina");
                setTitle("jNomina");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                jnomina.setEnabled(false);
                return esjNomina;
                }
            }
            
        public class CtrlJeo extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlJeo(Form form)
                {
                super(form);
                setName("jeo");
                setTitle("jEo");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                jeo.setEnabled(false);
                return esjEO;
                }
            }
            
        public class CtrlJiss extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlJiss(Form form)
                {
                super(form);
                setName("jiss");
                setTitle("jIss");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                jiss.setEnabled(false);
                return esjISS;
                }
            }
            
        public class CtrlJrenta extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlJrenta(Form form)
                {
                super(form);
                setName("jrenta");
                setTitle("jRenta");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                jrenta.setEnabled(false);
                return esjRENTA;
                }
            }
            
        public class CtrlJexpe extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlJexpe(Form form)
                {
                super(form);
                setName("jexpe");
                setTitle("jExpe");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                jexpe.setEnabled(false);
                return esjExpe;
                }
            }
            
        public class LinkBtchgnif extends Action
            {
            public LinkBtchgnif(Form form)
                {
                super(form);
                setName("btchgnif");
                setTitle("Modificar NIF/CIF");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                
                boolean error = false;
                if(vcambianif.vnounif.getString().equals("") || vcambianif.vnounif.isNull())
                {
                    Maefc.message("Introduzca un nuevo NIF/CIF","Atención",Maefc.INFORMATION_MESSAGE);
                    error = true;
                }
                                
                if(vcambianif.vnounif.getString().equals(vcambianif.vnif.getString()))  
                {
                    Maefc.message("Introduzca un NIF/CIF diferente al actual","Atención",Maefc.INFORMATION_MESSAGE);
                    error = true;
                }     
                
                if(!error)
                {
                  int cancelar = Maefc.message("Se va a modificar el NIF ["+vnif.getString()+"] por el NIF ["+vnounif.getString()+"] de las aplicaciones marcadas. \n\n¿Desea continuar?","Atención",Maefc.INFORMATION_MESSAGE, Maefc.YES_NO_OPTION);
                  if(Maefc.YES_OPTION == cancelar)
                  {
                    /*llamar a la funcion update de ActualizaNIFs*/
                    ActualizaNIFs an = new ActualizaNIFs(vcliente.getString(),vnif.getString(),vnounif.getString(), Easp.connEA,esVirtualFisc);
                    an.updateNIF();
                  }
                          
                  prchgnif.exit();
                }
                }
            }
            
        public class FSetF1 extends Fieldset
            {
            public FSetF1(Form form)
                {
                super(form);
                addControl(vcliente);
                addControl(vnombre);
                addControl(vnif);
                addControl(vnounif);
                }
            }
            
        public FormVcambianif(ProgPrchgnif prchgnif)
            {
            super(prchgnif);
            setName("vcambianif");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addControl(vcliente=new CtrlVcliente(this));
            addControl(vnombre=new CtrlVnombre(this));
            addControl(vnif=new CtrlVnif(this));
            addControl(vnounif=new CtrlVnounif(this));
            addControl(jmodelos=new CtrlJmodelos(this));
            addControl(jea=new CtrlJea(this));
            addControl(jconta=new CtrlJconta(this));
            addControl(jnomina=new CtrlJnomina(this));
            addControl(jeo=new CtrlJeo(this));
            addControl(jiss=new CtrlJiss(this));
            addControl(jrenta=new CtrlJrenta(this));
            addControl(jexpe=new CtrlJexpe(this));
            addAction(btchgnif=new LinkBtchgnif(this));
            addFieldset(f1=new FSetF1(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            vcambianif.vcliente.setValue(gcdp);
            super.onInit();
            }
        }
        
    public ProgPrchgnif()
        {
        this.prchgnif=this;
        setName("prchgnif");
        setTitle("Modificar NIF/CIF");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vcambianif=new FormVcambianif(this));
        }
    public ProgPrchgnif(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        setConnection(Easp.connEA);
        setModal(true);
        LocationWindow loc=new LocationWindow();
        loc.setWidth(500);
        loc.setHeight(175);
        loc.setLocation(loc.CENTER);
        setLocation(loc);
        if(esVirtualFisc) vcambianif.setLayout(new LayoutHtml("mae/easp/html/cambiarNIFVFisc.html"));
        else vcambianif.setLayout(new LayoutHtml("mae/easp/html/cambiarNIF.html"));
        
        
        Selector cdpSelector = new Selector(getDataBase());
        	 
        	  cdpSelector.execute("Select cdp.cdpnifcif, nifes.datnombre, nifes.datapell1, nifes.datapell2, cdp.cdpcknomina, cdp.cdpckgestion ,cdp.cdpckconta, cdp.cdpckeo, cdp.cdpckiss,cdp.cdpckrenta from cdp INNER JOIN nifes ON cdp.cdpnifcif=nifes.danifcif where cdpcodi = '"+gcdp+"'");
        	  if(cdpSelector.next())
        	  {
        		  super.onInit();
        		  vcambianif.vnif.setValue(cdpSelector.getString("cdpnifcif"));
        		  vcambianif.vnombre.setValue(Easp.componerCliente(cdpSelector.getString("datnombre"), cdpSelector.getString("datapell1"),cdpSelector.getString("datapell2")));
                  esjNomina = "S".equals(cdpSelector.getString("cdpcknomina")); 
                  esjConta = "S".equals(cdpSelector.getString("cdpckconta"));
                  esjEO = "S".equals(cdpSelector.getString("cdpckeo"));
                  esjISS = "S".equals(cdpSelector.getString("cdpckiss"));
                  esjRENTA = "S".equals(cdpSelector.getString("cdpckrenta"));
                  esjExpe = "S".equals(cdpSelector.getString("cdpckgestion"));
        	  }
        	  else
        	  {
        		  //No hay registro con el codigo de cliente seleccionado
        	  }
        	  
        	
        }
    }
    
