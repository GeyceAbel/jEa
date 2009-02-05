// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090205
// Hora:             10:55:57
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prchgnif;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
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
  // Inicio declaraciones globales
  public String gcdp=null;
  public boolean esVirtualFisc = false;
  private boolean esjNomina;
  private boolean esjConta;
  private boolean esjEO;
  
   
  
  
  // Fin declaraciones globales
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
    // Acciones
    public LinkBtchgnif btchgnif;
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
        }
      }
      
    public class CtrlVnombre extends ControlEdit
      {
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
        }
      }
      
    public class CtrlVnif extends ControlEdit
      {
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
        }
      }
      
    public class CtrlVnounif extends ControlEdit
      {
      public CtrlVnounif(Form form)
        {
        super(form);
        setName("vnounif");
        setMessageHelp("Introducir el nuevo NIF/CIF");
        setTitle("NIF nuevo");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      public void onChange()
        {
        super.onChange();
        vcambianif.vnounif.setValue(Util.esCIF(vcambianif.vnounif.getString()));
        }
      }
      
    public class CtrlJmodelos extends ControlCheck
      {
      public CtrlJmodelos(Form form)
        {
        super(form);
        setName("jmodelos");
        setTitle("jModelos");
        }
      public Object getDefault()
        {
        jmodelos.setEnabled(false);
        return true;
        }
      }
      
    public class CtrlJea extends ControlCheck
      {
      public CtrlJea(Form form)
        {
        super(form);
        setName("jea");
        setTitle("jEA");
        }
      public Object getDefault()
        {
        jea.setEnabled(false);
        return true;
        }
      }
      
    public class CtrlJconta extends ControlCheck
      {
      public CtrlJconta(Form form)
        {
        super(form);
        setName("jconta");
        setTitle("jConta");
        }
      public Object getDefault()
        {
        jconta.setEnabled(false);
        return esjConta;
        }
      }
      
    public class CtrlJnomina extends ControlCheck
      {
      public CtrlJnomina(Form form)
        {
        super(form);
        setName("jnomina");
        setTitle("jNomina");
        }
      public Object getDefault()
        {
        jnomina.setEnabled(false);
        return esjNomina;
        }
      }
      
    public class CtrlJeo extends ControlCheck
      {
      public CtrlJeo(Form form)
        {
        super(form);
        setName("jeo");
        setTitle("jEo");
        }
      public Object getDefault()
        {
        jeo.setEnabled(false);
        return esjEO;
        }
      }
      
    public class LinkBtchgnif extends Action
      {
      public LinkBtchgnif(Form form)
        {
        super(form);
        setName("btchgnif");
        setTitle("Modificar NIF/CIF");
        setOptions(SHOW);
        }
      public void onAction()
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
      
    public FormVcambianif(ProgPrchgnif prchgnif)
      {
      super(prchgnif);
      setName("vcambianif");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      addControl(vcliente=new CtrlVcliente(this));
      addControl(vnombre=new CtrlVnombre(this));
      addControl(vnif=new CtrlVnif(this));
      addControl(vnounif=new CtrlVnounif(this));
      addControl(jmodelos=new CtrlJmodelos(this));
      addControl(jea=new CtrlJea(this));
      addControl(jconta=new CtrlJconta(this));
      addControl(jnomina=new CtrlJnomina(this));
      addControl(jeo=new CtrlJeo(this));
      addAction(btchgnif=new LinkBtchgnif(this));
      }
    public void onInit()
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
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vcambianif=new FormVcambianif(this));
    }
  public ProgPrchgnif(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    setConnection(Easp.connEA);
    setModal(true);
    LocationWindow loc=new LocationWindow();
    loc.setWidth(500);
    loc.setHeight(370);
    loc.setLocation(loc.CENTER);
    setLocation(loc);
    if(esVirtualFisc) vcambianif.setLayout(new LayoutHtml("mae/easp/html/cambiarNIFVFisc.html"));
    else vcambianif.setLayout(new LayoutHtml("mae/easp/html/cambiarNIF.html"));
    
    
    Selector cdpSelector = new Selector(getDataBase());
    	 
    	  cdpSelector.execute("Select cdp.cdpnifcif, nifes.datnombre, nifes.datapell1, nifes.datapell2, cdp.cdpcknomina, cdp.cdpckconta, cdp.cdpckeo from cdp INNER JOIN nifes ON cdp.cdpnifcif=nifes.danifcif where cdpcodi = '"+gcdp+"'");
    	  if(cdpSelector.next())
    	  {
    		  super.onInit();
    		  vcambianif.vnif.setValue(cdpSelector.getString("cdpnifcif"));
    		  vcambianif.vnombre.setValue(Easp.componerCliente(cdpSelector.getString("datnombre"), cdpSelector.getString("datapell1"),cdpSelector.getString("datapell2")));
              esjNomina = "S".equals(cdpSelector.getString("cdpcknomina")); 
              esjConta = "S".equals(cdpSelector.getString("cdpckconta"));
              esjEO = "S".equals(cdpSelector.getString("cdpckeo"));
    	  }
    	  else
    	  {
    		  //No hay registro con el codigo de cliente seleccionado
    	  }
    	  
    	
    }
  }
  
