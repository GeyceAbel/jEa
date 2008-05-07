// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:04
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicaci�n: easp - Entorno de aplicaciones para AGP
// Versi�n:    4.1
// 
package mae.easp.prtratamcdp;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prtratamcdp
// Nombre:   Tratamiento de Clientes de despachos
// Versi�n:  1.0
// 
public class ProgPrtratamcdp extends Program
  {
  public AppEasp easp;
  public ProgPrtratamcdp prtratamcdp;
  // Inicio declaraciones globales
  public boolean alta=false;
  public boolean altadp=false;
  public int modo=0;
  public String vnifcif=null;
  public String aplicacion=null;
  public String codiCDP=null;
  public boolean esDP=false;
  public int nuevoCodiCDP=0;
  
  // Fin declaraciones globales
  // Ventana
  public FormVcdp vcdp;
  // Selects
  public Snifcdp snifcdp;
  public Snumcheck snumcheck;
  public Snumeraciones snumeraciones;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Tratamiento de Clientes de despachos");
      }
    }
    
  public class FormVcdp extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void onOpened(){
      super.onOpened();
      if (modo==1) doInsert();
      }
    
    
    // Fin declaraciones globales
    // Controles
    public CtrlVcdpcodi vcdpcodi;
    public CtrlCdpnifcif cdpnifcif;
    public CtrlVvnombre vvnombre;
    public CtrlCdpref cdpref;
    public CtrlCdpcdprel cdpcdprel;
    public CtrlCdpaeatdele cdpaeatdele;
    public CtrlCdpaeatadm cdpaeatadm;
    public CtrlCdpbdcomuconta cdpbdcomuconta;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(REMAINDER);
        setWeightx(700.0);
        setWeighty(250.0);
        setFill(BOTH);
        setAnchor(CENTER);
        }
      }
      
    public class CtrlVcdpcodi extends ControlEdit
      {
      public CtrlVcdpcodi(Form form)
        {
        super(form);
        setName("vcdpcodi");
        setMessageHelp("C�digo del CDP");
        setTitle("C�digo");
        setType(DOUBLE);
        setMaskInput("999999");
        setProtect(true);
        setLength(6);
        setPrintable(false);
        }
      public Object getDefault()
        {
          snumcheck.execute();
          if (!snumcheck.isEof()) 
             nuevoCodiCDP=snumcheck.numcodigo.getInteger()+1;
          else
             nuevoCodiCDP=1;
        System.out.println("debug nuevo codigo="+nuevoCodiCDP);
          return new Integer(nuevoCodiCDP);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlCdpnifcif extends ControlEdit
      {
      public CtrlCdpnifcif(Form form)
        {
        super(form);
        setName("cdpnifcif");
        setTitle("NIF / CIF");
        setType(STRING);
        setMaskInput("U");
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        setField(snifcdp.cdpnifcif);
        }
      public Object getDefault()
        {
        return vnifcif;
        }
      }
      
    public class CtrlVvnombre extends ControlEdit
      {
      public CtrlVvnombre(Form form)
        {
        super(form);
        setName("vvnombre");
        setTitle("Raz�n");
        setType(STRING);
        setLength(32);
        setEnabled(false);
        setPrintable(false);
        }
      public Object getDefault()
        {
        return new String(Easp.nombreEmpresa(vnifcif));
        }
      }
      
    public class CtrlCdpref extends ControlEdit
      {
      public CtrlCdpref(Form form)
        {
        super(form);
        setName("cdpref");
        setMessageHelp("Nombre de referencia");
        setTitle("Nombre de referencia");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(snifcdp.cdpref);
        }
      public Object getDefault()
        {
        return new String(Easp.nombreEmpresa(vnifcif));
        }
      }
      
    public class CtrlCdpcdprel extends ControlComboBox
      {
      public mae.easp.general.pkcdp.PickPkcdp pickup;
      public CtrlCdpcdprel(Form form)
        {
        super(form);
        setName("cdpcdprel");
        setTitle("Empresa relacionada");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
        setLength(12);
        setPrintable(false);
        setField(snifcdp.cdpcdprel);
        }
      }
      
    public class CtrlCdpaeatdele extends ControlComboBox
      {
      public mae.easp.general.pkdelegaciones.PickPkdelegaciones pickup;
      public CtrlCdpaeatdele(Form form)
        {
        super(form);
        setName("cdpaeatdele");
        setTitle("Delegaci�n Hacienda");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkdelegaciones.PickPkdelegaciones(this));
        setLength(2);
        setPrintable(false);
        setField(snifcdp.cdpaeatdele);
        }
      public void onChange()
        {
        super.onChange();
        cdpaeatadm.pickup.sadministracion.setWhere(null);
        cdpaeatadm.pickup.delegacion=getInteger();
        cdpaeatadm.pickup.sadministracion.execute();
        }
      }
      
    public class CtrlCdpaeatadm extends ControlComboBox
      {
      public mae.easp.general.pkadministracio.PickPkadministracio pickup;
      public CtrlCdpaeatadm(Form form)
        {
        super(form);
        setName("cdpaeatadm");
        setTitle("Administraci�n Hacienda");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkadministracio.PickPkadministracio(this));
        setLength(3);
        setPrintable(false);
        setField(snifcdp.cdpaeatadm);
        }
      }
      
    public class CtrlCdpbdcomuconta extends ControlComboBox
      {
      public CtrlCdpbdcomuconta(Form form)
        {
        super(form);
        setName("cdpbdcomuconta");
        setTitle("BD Com�n");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setPrintable(false);
        addItem("S/Si (aconsejable para entornos SQL Server)");
        addItem("N/No (aconsejable para entornos ACCESS)");
        setField(snifcdp.cdpbdcomuconta);
        }
      public Object getDefault()
        {
        if (Aplication.getAplication().getDataBase().getDB().getType().equals("access"))
          return "N";
        else
          return "S";
        }
      }
      
    public FormVcdp(ProgPrtratamcdp prtratamcdp)
      {
      super(prtratamcdp);
      setName("vcdp");
      setTitle("Cliente");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | INSERT);
      setPrintable(false);
      setUnique(true);
      addSelect(snifcdp=new Snifcdp());
      addSelect(snumcheck=new Snumcheck());
      addSelect(snumeraciones=new Snumeraciones());
      addControl(vcdpcodi=new CtrlVcdpcodi(this));
      addControl(cdpnifcif=new CtrlCdpnifcif(this));
      addControl(vvnombre=new CtrlVvnombre(this));
      addControl(cdpref=new CtrlCdpref(this));
      addControl(cdpcdprel=new CtrlCdpcdprel(this));
      addControl(cdpaeatdele=new CtrlCdpaeatdele(this));
      addControl(cdpaeatadm=new CtrlCdpaeatadm(this));
      addControl(cdpbdcomuconta=new CtrlCdpbdcomuconta(this));
      setSelect(snifcdp);
      }
    public void onInit()
      {
      snifcdp.cdp.setCheckDuplicates(true);
      if (aplicacion.equals("CON"))
        cdpbdcomuconta.setEnabled(true);
      else
        cdpbdcomuconta.setEnabled(false);
      super.onInit();
      }
    public boolean onOkInsert()
      {
      if (super.onOkInsert()) {
        Maefc.message("Se ha generado un nuevo c�digo de cliente:\n\n"+vcdpcodi.getString(),"Informaci�n",Maefc.INFORMATION_MESSAGE);
        return true;
        }
      else
        return false;
      }
    }
    
  // select de nif y cdp
  public class Snifcdp extends Select
    {
    // Tablas
    public Cdp cdp;
    // Campos
    public Field cdpaeatadm;
    public Field cdpaeatdele;
    public Field cdpagpi;
    public Field cdpbdcomuconta;
    public Field cdpcdprel;
    public Field cdpckconta;
    public Field cdpckeo;
    public Field cdpckgestion;
    public Field cdpckiss;
    public Field cdpcknomina;
    public Field cdpckrenta;
    public Field cdpcodi;
    public Field cdpnifcif;
    public Field cdppwd;
    public Field cdppwdacc;
    public Field cdpref;
    class Cdp extends Table
      {
      public Cdp(Select select)
        {
        super(select);
        setName("cdp");
        setOptions(READ | INSERT);
        }
      public boolean onInsert()
        {
        if (aplicacion.equals("CON"))
          cdpckconta.setValue("S");
        else if (aplicacion.equals("NOM"))
          cdpcknomina.setValue("S");
        else if (aplicacion.equals("EOS"))
          cdpckeo.setValue("S");
        else if (aplicacion.equals("ISS"))
          cdpckiss.setValue("S");
        else if (aplicacion.equals("REN"))
          cdpckrenta.setValue("S");
        else if (aplicacion.equals("EXP"))
          cdpckgestion.setValue("S");
        //select para ver si hay que insertar registro en la tabla de numeraciones o editarlo
        cdpcodi.setValue(Easp.codiDP.substring(0,6)+Util.formateoNumero("000000",vcdp.vcdpcodi.getInteger()));
        boolean retorn=false;
        snumeraciones.execute();
        if (!snumeraciones.isEof()) {
          snumeraciones.edit();
          System.out.println("codi nou="+vcdp.vcdpcodi.getInteger());
          System.out.println("codi antic="+snumcheck.numcodigo.getInteger());
          if (vcdp.vcdpcodi.getInteger() > snumcheck.numcodigo.getInteger()) {
             snumeraciones.numcodigo.setValue(vcdp.vcdpcodi.getInteger());
             retorn=snumeraciones.update();
             }
          else
             return super.onInsert();
          }
        else {
          snumeraciones.addNew();
          snumeraciones.numdominio.setValue(Easp.dominio);
          snumeraciones.numaplic.setValue("GENERAL");
          snumeraciones.numcodigo.setValue(vcdp.vcdpcodi.getInteger());
          retorn=snumeraciones.insert();
          }
        if (retorn) {
          codiCDP=cdpcodi.getString();
          return super.onInsert();
          }
          else
            return false;
        
        
        }
      }
      
    public Snifcdp()
      {
      setName("snifcdp");
      addTable(cdp=new Cdp(this));
      addField(cdpaeatadm=new Field(this,cdp,"cdpaeatadm"));
      addField(cdpaeatdele=new Field(this,cdp,"cdpaeatdele"));
      addField(cdpagpi=new Field(this,cdp,"cdpagpi"));
      addField(cdpbdcomuconta=new Field(this,cdp,"cdpbdcomuconta"));
      addField(cdpcdprel=new Field(this,cdp,"cdpcdprel"));
      addField(cdpckconta=new Field(this,cdp,"cdpckconta"));
      addField(cdpckeo=new Field(this,cdp,"cdpckeo"));
      addField(cdpckgestion=new Field(this,cdp,"cdpckgestion"));
      addField(cdpckiss=new Field(this,cdp,"cdpckiss"));
      addField(cdpcknomina=new Field(this,cdp,"cdpcknomina"));
      addField(cdpckrenta=new Field(this,cdp,"cdpckrenta"));
      addField(cdpcodi=new Field(this,cdp,"cdpcodi"));
      addField(cdpnifcif=new Field(this,cdp,"cdpnifcif"));
      addField(cdppwd=new Field(this,cdp,"cdppwd"));
      addField(cdppwdacc=new Field(this,cdp,"cdppwdacc"));
      addField(cdpref=new Field(this,cdp,"cdpref"));
      }
    public String getWhere()
      {
      return "cdpcodi='"+codiCDP+"'";
      }
    }
    
  // select para comprobar numeros
  public class Snumcheck extends Select
    {
    // Tablas
    public Numeraciones numeraciones;
    // Campos
    public Field numaplic;
    public Field numcodigo;
    public Field numdominio;
    class Numeraciones extends Table
      {
      public Numeraciones(Select select)
        {
        super(select);
        setName("numeraciones");
        setOptions(READ);
        }
      }
      
    public Snumcheck()
      {
      setName("snumcheck");
      addTable(numeraciones=new Numeraciones(this));
      addField(numaplic=new Field(this,numeraciones,"numaplic"));
      addField(numcodigo=new Field(this,numeraciones,"numcodigo"));
      addField(numdominio=new Field(this,numeraciones,"numdominio"));
      }
    public String getWhere()
      {
      // return "numaplic like 'GENERAL%'";
      return "RTRIM(numaplic) = 'GENERAL'";
      }
    }
    
  // B�squeda del nou codi de CDP/Empresa
  public class Snumeraciones extends Select
    {
    // Tablas
    public Numeraciones numeraciones;
    // Campos
    public Field numaplic;
    public Field numcodigo;
    public Field numdominio;
    class Numeraciones extends Table
      {
      public Numeraciones(Select select)
        {
        super(select);
        setName("numeraciones");
        setOptions(READ | INSERT | UPDATE);
        }
      public boolean onInsert()
        {
        
        numdominio.setValue(Easp.dominio);
        numaplic.setValue("GENERAL");
        //numcodigo.setValue(1);
        
        return super.onInsert();
        }
      public boolean onUpdate()
        {
        /*
        int nuevoCodigo=vcdp.vcdpcodi.getInteger();
        System.out.println("Noucodicdp="+nuevoCodiCDP);
        System.out.println("Nuevocodigo="+nuevoCodigo);
        if (nuevoCodiCDP <= nuevoCodigo) {
          snumcheck.setWhere(snumeraciones.getWhere()+" and numcodigo="+nuevoCodigo);
          snumcheck.execute();
          if (snumcheck.isEof())
            numcodigo.setValue(nuevoCodigo);
          else
            numcodigo.setValue(numcodigo.getInteger()+1);
          snumcheck.setWhere(null);
          }
        */
        return super.onUpdate();
        }
      }
      
    public Snumeraciones()
      {
      setName("snumeraciones");
      addTable(numeraciones=new Numeraciones(this));
      addField(numaplic=new Field(this,numeraciones,"numaplic"));
      addField(numcodigo=new Field(this,numeraciones,"numcodigo"));
      addField(numdominio=new Field(this,numeraciones,"numdominio"));
      }
    public String getWhere()
      {
      return "RTRIM(numaplic) = 'GENERAL'";
      //return "numaplic like 'GENERAL%'";
      }
    }
    
  public ProgPrtratamcdp()
    {
    this.prtratamcdp=this;
    setName("prtratamcdp");
    setTitle("Tratamiento de Clientes de despachos");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vcdp=new FormVcdp(this));
    }
  public ProgPrtratamcdp(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  }
  
