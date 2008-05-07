// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:04
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prfichadp;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prfichadp
// Nombre:   Ficha del Despacho Profesional
// Versión:  1.0
// 
public class ProgPrfichadp extends Program
  {
  public AppEasp easp;
  public ProgPrfichadp prfichadp;
  // Ventana
  public FormVficha vficha;
  // Selects
  public Sdpnif sdpnif;
  public Sbuscanif sbuscanif;
  // Ventana
  public FormValtanif valtanif;
  // Selects
  public Snif snif;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Ficha del Despacho Profesional");
      }
    }
    
  public class FormVficha extends MonoDataForm
    {
    // Inicio declaraciones globales
    String nifValido=null;
    // Fin declaraciones globales
    // Controles
    public CtrlDpcodigo dpcodigo;
    public CtrlDpnifcif dpnifcif;
    // Acciones
    public LinkIrafichageneral irafichageneral;
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(REMAINDER);
        setWeightx(600.0);
        setWeighty(400.0);
        setFill(BOTH);
        setAnchor(CENTER);
        }
      }
      
    public class CtrlDpcodigo extends ControlEdit
      {
      public CtrlDpcodigo(Form form)
        {
        super(form);
        setName("dpcodigo");
        setMessageHelp("Código AFINITY del Despacho. Ejemplo 123456000000");
        setTitle("Código AFINITY");
        setType(STRING);
        setProtect(true);
        setLength(12);
        setPrintable(false);
        setField(sdpnif.dpcodigo);
        }
      public Object getDefault()
        {
        return Aplication.getAplication().getParameter("Dominio");
        }
      public void onChange()
        {
        super.onChange();
        if (!isReading() && !this.getString().equals(Aplication.getAplication().getParameter("Dominio")))
          Maefc.message("El código del despacho es distinto "+
             "\nal dominio con el que ha accedido a la aplicación.","ATENCIÓN",Maefc.INFORMATION_MESSAGE);
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlDpnifcif extends ControlEdit
      {
      public CtrlDpnifcif(Form form)
        {
        super(form);
        setName("dpnifcif");
        setMessageHelp("NIF / CIF");
        setTitle("NIF / CIF");
        setType(STRING);
        setMaskInput("U");
        setLength(15);
        setPrintable(false);
        setField(sdpnif.dpnifcif);
        }
      public boolean  valid()
        {
        if (!super.valid())
          return false;
        if ((getNumState()!=DataForm.INSERT && getNumState()!=DataForm.UPDATE) || (nifValido!=null && nifValido.equals(getString())))
          return true;
        
        nifValido=Easp.esCIF(getString());
        if (nifValido==null)
          return false;
        else {
          this.setValue(nifValido);
          // ES BUSCA SI EXISTEIX EL NIF A LA FITXA GENERAL
          sbuscanif.execute();
          if (sbuscanif.isEof()) {
            if (Maefc.message("No existe el N.I.F. "+getString()+"  en la ficha general.\n\n¿Desea darlo de alta?","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
              // ENLLAÇ AMB EL PROGRAMA DE TRACTAMENT DE LA FITXA GENERAL
              valtanif.setInitState(DataForm.INSERT);
              valtanif.open();
              sbuscanif.execute();
              }
            }
          if (sbuscanif.isEof()) {
            nifValido=null;
            this.setNull();
            return false;
            }
        /*
          else
            pcudesc.setValue(Contaasp.nombreEmpresa(getString()));
        */
          return true;
          }
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class LinkIrafichageneral extends ActionForm
      {
      public LinkIrafichageneral(Form form)
        {
        super(form);
        setName("irafichageneral");
        setTitle("&1.Datos Filiación");
        setOptions(SHOW);
        }
      public void onAction()
        {
        valtanif.setInitState(DataForm.SHOW);
        super.onAction();
        
        }
      }
      
    public FormVficha(ProgPrfichadp prfichadp)
      {
      super(prfichadp);
      setName("vficha");
      setTitle("Ficha");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE | INSERT);
      setUnique(true);
      addSelect(sdpnif=new Sdpnif());
      addSelect(sbuscanif=new Sbuscanif());
      addControl(dpcodigo=new CtrlDpcodigo(this));
      addControl(dpnifcif=new CtrlDpnifcif(this));
      addAction(irafichageneral=new LinkIrafichageneral(this));
      setSelect(sdpnif);
      }
    }
    
  // select de las tablas dp y nifes
  public class Sdpnif extends Select
    {
    // Tablas
    public Dp dp;
    // Campos
    public Field dpcodigo;
    public Field dpnifcif;
    class Dp extends Table
      {
      public Dp(Select select)
        {
        super(select);
        setName("dp");
        setOptions(READ | INSERT | UPDATE);
        }
      }
      
    public Sdpnif()
      {
      setName("sdpnif");
      addTable(dp=new Dp(this));
      addField(dpcodigo=new Field(this,dp,"dpcodigo"));
      addField(dpnifcif=new Field(this,dp,"dpnifcif"));
      }
    }
    
  // Busca NIF
  public class Sbuscanif extends Select
    {
    // Tablas
    public Nifes nifes;
    // Campos
    public Field danifcif;
    class Nifes extends Table
      {
      public Nifes(Select select)
        {
        super(select);
        setName("nifes");
        setOptions(READ);
        }
      }
      
    public Sbuscanif()
      {
      setName("sbuscanif");
      addTable(nifes=new Nifes(this));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      }
    public String getWhere()
      {
      return "danifcif="+vficha.dpnifcif.getSQLFormat();
      }
    }
    
  public class FormValtanif extends MonoDataForm
    {
    // Controles
    public CtrlDatfisicajuri datfisicajuri;
    public CtrlDatapell1 datapell1;
    public CtrlDatapell2 datapell2;
    public CtrlDatnombre datnombre;
    public CtrlDatesiglas datesiglas;
    public CtrlDatvia datvia;
    public CtrlDatnum datnum;
    public CtrlDatesc datesc;
    public CtrlDatpiso datpiso;
    public CtrlDatletra datletra;
    public CtrlDatprov datprov;
    public CtrlDatmuni datmuni;
    public CtrlDatpobla datpobla;
    public CtrlDatcpos datcpos;
    public CtrlDatpais datpais;
    public CtrlDattel dattel;
    public CtrlDatfax datfax;
    public CtrlDatemail datemail;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(788);
        setHeight(500);
        setTitle("Clientes/Proveedores");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlDatfisicajuri extends ControlComboBox
      {
      public CtrlDatfisicajuri(Form form)
        {
        super(form);
        setName("datfisicajuri");
        setTitle("Física/Jurídica");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setPrintable(false);
        addItem("F/Fisica");
        addItem("J/Jurídica");
        setField(snif.datfisicajuri);
        }
      public void onChange()
        {
        super.onChange();
        if (!isReading()) {
          datapell2.setEnabled(getString().equals("F"));
          datnombre.setEnabled(getString().equals("F"));
          if (getString().equals("J")){
            datapell2.setNull();
            datnombre.setNull();
            }
          }
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlDatapell1 extends ControlEdit
      {
      public CtrlDatapell1(Form form)
        {
        super(form);
        setName("datapell1");
        setMessageHelp("Si es una sociedad introduzca el nombre de la misma y si se trata de persona física el primer apellido.");
        setTitle("Razon Social/Primer Apellido");
        setType(STRING);
        setMaskInput("U");
        setLength(40);
        setPrintable(false);
        setField(snif.datapell1);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlDatapell2 extends ControlEdit
      {
      public CtrlDatapell2(Form form)
        {
        super(form);
        setName("datapell2");
        setTitle("Segundo Apellido");
        setType(STRING);
        setMaskInput("U");
        setLength(25);
        setPrintable(false);
        setField(snif.datapell2);
        }
      }
      
    public class CtrlDatnombre extends ControlEdit
      {
      public CtrlDatnombre(Form form)
        {
        super(form);
        setName("datnombre");
        setTitle("Nombre");
        setType(STRING);
        setMaskInput("U");
        setLength(20);
        setPrintable(false);
        setField(snif.datnombre);
        }
      public boolean obligate()
        {
        return datfisicajuri.getString().equals("F");
        }
      }
      
    public class CtrlDatesiglas extends ControlComboBox
      {
      public mae.easp.general.pksiglas.PickPksiglas pickup;
      public CtrlDatesiglas(Form form)
        {
        super(form);
        setName("datesiglas");
        setTitle("SG");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pksiglas.PickPksiglas(this));
        setLength(2);
        setPrintable(false);
        setDescriptionShow(false);
        setField(snif.datesiglas);
        }
      }
      
    public class CtrlDatvia extends ControlEdit
      {
      public CtrlDatvia(Form form)
        {
        super(form);
        setName("datvia");
        setTitle("Via Pública");
        setType(STRING);
        setMaskInput("U");
        setLength(45);
        setPrintable(false);
        setField(snif.datvia);
        }
      }
      
    public class CtrlDatnum extends ControlEdit
      {
      public CtrlDatnum(Form form)
        {
        super(form);
        setName("datnum");
        setTitle("Número");
        setType(STRING);
        setLength(4);
        setPrintable(false);
        setField(snif.datnum);
        }
      }
      
    public class CtrlDatesc extends ControlEdit
      {
      public CtrlDatesc(Form form)
        {
        super(form);
        setName("datesc");
        setTitle("Escalera");
        setType(STRING);
        setLength(2);
        setPrintable(false);
        setField(snif.datesc);
        }
      }
      
    public class CtrlDatpiso extends ControlEdit
      {
      public CtrlDatpiso(Form form)
        {
        super(form);
        setName("datpiso");
        setTitle("Piso");
        setType(STRING);
        setLength(2);
        setPrintable(false);
        setField(snif.datpiso);
        }
      }
      
    public class CtrlDatletra extends ControlEdit
      {
      public CtrlDatletra(Form form)
        {
        super(form);
        setName("datletra");
        setTitle("Letra");
        setType(STRING);
        setLength(2);
        setPrintable(false);
        setField(snif.datletra);
        }
      }
      
    public class CtrlDatprov extends ControlComboBox
      {
      public mae.easp.general.pkprovincias.PickPkprovincias pickup;
      public CtrlDatprov(Form form)
        {
        super(form);
        setName("datprov");
        setTitle("Provincia");
        setType(INTEGER);
        setMaskInput("99");
        setPickUp(pickup=new mae.easp.general.pkprovincias.PickPkprovincias(this));
        setLength(10);
        setPrintable(false);
        setField(snif.adatprov);
        }
      public void onChange()
        {
        super.onChange();
          datmuni.setNull();
          datmuni.pickup.smunicipios.setWhere(null);
          datmuni.pickup.provincia=getInteger();
          datmuni.refresh();
        
          if (!isReading()){
            if (!isNull()) datcpos.setValue(Util.formateoNumero("00",getInteger()));
            }
        
        }
      }
      
    public class CtrlDatmuni extends ControlComboBox
      {
      public mae.easp.general.pkmunicipios.PickPkmunicipios pickup;
      public CtrlDatmuni(Form form)
        {
        super(form);
        setName("datmuni");
        setTitle("Código Municipio");
        setType(INTEGER);
        setMaskInput("999");
        setPickUp(pickup=new mae.easp.general.pkmunicipios.PickPkmunicipios(this));
        setLength(3);
        setPrintable(false);
        setField(snif.datmuni);
        }
      public void onChange()
        {
        super.onChange();
        if (!isReading())
          datpobla.setValue(datmuni.pickup.smunicipios.mudesc.getString());
        
        }
      }
      
    public class CtrlDatpobla extends ControlEdit
      {
      public CtrlDatpobla(Form form)
        {
        super(form);
        setName("datpobla");
        setTitle("Población");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        setField(snif.datpobla);
        }
      public void onChange()
        {
        super.onChange();
        if (!isReading())
          datpobla.setValue(datmuni.pickup.smunicipios.mudesc.getString());
        
        }
      }
      
    public class CtrlDatcpos extends ControlEdit
      {
      public CtrlDatcpos(Form form)
        {
        super(form);
        setName("datcpos");
        setTitle("Código Postal");
        setType(STRING);
        setLength(5);
        setPrintable(false);
        setField(snif.datcpos);
        }
      public boolean  valid()
        {
        if (!Util.isNumero(getString())) {
          setMessageWarning("Sólo se admiten caracteres numéricos (y sin espacios)");
          return false;
          }
        else if (!isNull() && getString().length()  > 1 && !Util.formateoNumero("00",datprov.getInteger()).equals(getString().substring(0,2))) {
          setMessageWarning("Los dos primeros dígitos del código postal \ndeben corresponderse con el código de provincia");
          return false;
          }
        else if (!isNull() && getString().length()  < 5 ) {
          setMessageWarning("Un código postal siempre debe contener 5 dígitos");
          return false;
          }
        else 
          return super.valid();
        }
      }
      
    public class CtrlDatpais extends ControlComboBox
      {
      public mae.easp.general.pkpaises.PickPkpaises pickup;
      public CtrlDatpais(Form form)
        {
        super(form);
        setName("datpais");
        setMessageHelp("País");
        setTitle("País");
        setType(INTEGER);
        setMaskInput("999");
        setPickUp(pickup=new mae.easp.general.pkpaises.PickPkpaises(this));
        setLength(3);
        setPrintable(false);
        setField(snif.datpais);
        }
      public Object getDefault()
        {
        return new Integer(108);
        }
      }
      
    public class CtrlDattel extends ControlEdit
      {
      public CtrlDattel(Form form)
        {
        super(form);
        setName("dattel");
        setTitle("Teléfono");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(snif.dattel);
        }
      public boolean  valid()
        {
        if (!Util.isNumero(getString())) {
          setMessageWarning("Sólo se admiten caracteres numéricos (y sin espacios)");
          return false;
          }
        else
          return super.valid();
        }
      }
      
    public class CtrlDatfax extends ControlEdit
      {
      public CtrlDatfax(Form form)
        {
        super(form);
        setName("datfax");
        setTitle("Fax");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(snif.datfax);
        }
      public boolean  valid()
        {
        if (!Util.isNumero(getString())) {
          setMessageWarning("Sólo se admiten caracteres numéricos (y sin espacios)");
          return false;
          }
        else
          return super.valid();
        }
      }
      
    public class CtrlDatemail extends ControlEdit
      {
      public CtrlDatemail(Form form)
        {
        super(form);
        setName("datemail");
        setTitle("e-mail");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        setField(snif.datemail);
        }
      }
      
    public FormValtanif(ProgPrfichadp prfichadp)
      {
      super(prfichadp);
      setName("valtanif");
      setTitle("Clientes/Proveedores");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE | INSERT);
      setPrintable(false);
      setModal(true);
      setUnique(true);
      addSelect(snif=new Snif());
      addControl(datfisicajuri=new CtrlDatfisicajuri(this));
      addControl(datapell1=new CtrlDatapell1(this));
      addControl(datapell2=new CtrlDatapell2(this));
      addControl(datnombre=new CtrlDatnombre(this));
      addControl(datesiglas=new CtrlDatesiglas(this));
      addControl(datvia=new CtrlDatvia(this));
      addControl(datnum=new CtrlDatnum(this));
      addControl(datesc=new CtrlDatesc(this));
      addControl(datpiso=new CtrlDatpiso(this));
      addControl(datletra=new CtrlDatletra(this));
      addControl(datprov=new CtrlDatprov(this));
      addControl(datmuni=new CtrlDatmuni(this));
      addControl(datpobla=new CtrlDatpobla(this));
      addControl(datcpos=new CtrlDatcpos(this));
      addControl(datpais=new CtrlDatpais(this));
      addControl(dattel=new CtrlDattel(this));
      addControl(datfax=new CtrlDatfax(this));
      addControl(datemail=new CtrlDatemail(this));
      setSelect(snif);
      }
    public boolean onOkInsert()
      {
      if (super.onOkInsert()) {
        getDataBase().commit();
        valtanif.exit();
        return true;
        }
      else
        return false;
      }
    }
    
  // Select de busqueda de subcuentas en tabla nifes
  public class Snif extends Select
    {
    // Tablas
    public Nifes nifes;
    // Campos
    public Field adatprov;
    public Field danifcif;
    public Field dataltaen;
    public Field datapell1;
    public Field datapell2;
    public Field datcontacto;
    public Field datcpos;
    public Field dateatt;
    public Field datecpos;
    public Field dateesc;
    public Field dateletra;
    public Field datemail;
    public Field datemuni;
    public Field datenum;
    public Field datepais;
    public Field datepiso;
    public Field datepobla;
    public Field dateprov;
    public Field datesc;
    public Field datesiglas;
    public Field datevia;
    public Field datfax;
    public Field datfisicajuri;
    public Field datipo;
    public Field datletra;
    public Field datmuni;
    public Field datnombre;
    public Field datnum;
    public Field datpais;
    public Field datpiso;
    public Field datpobla;
    public Field datsiglas;
    public Field dattel;
    public Field datvia;
    class Nifes extends Table
      {
      public Nifes(Select select)
        {
        super(select);
        setName("nifes");
        setOptions(READ | INSERT | UPDATE);
        }
      public boolean onInsert()
        {
        danifcif.setValue(vficha.dpnifcif);
        datipo.setValue("D");
        return super.onInsert();
        
        }
      }
      
    public Snif()
      {
      setName("snif");
      addTable(nifes=new Nifes(this));
      addField(adatprov=new Field(this,nifes,"datprov"));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      addField(dataltaen=new Field(this,nifes,"dataltaen"));
      addField(datapell1=new Field(this,nifes,"datapell1"));
      addField(datapell2=new Field(this,nifes,"datapell2"));
      addField(datcontacto=new Field(this,nifes,"datcontacto"));
      addField(datcpos=new Field(this,nifes,"datcpos"));
      addField(dateatt=new Field(this,nifes,"dateatt"));
      addField(datecpos=new Field(this,nifes,"datecpos"));
      addField(dateesc=new Field(this,nifes,"dateesc"));
      addField(dateletra=new Field(this,nifes,"dateletra"));
      addField(datemail=new Field(this,nifes,"datemail"));
      addField(datemuni=new Field(this,nifes,"datemuni"));
      addField(datenum=new Field(this,nifes,"datenum"));
      addField(datepais=new Field(this,nifes,"datepais"));
      addField(datepiso=new Field(this,nifes,"datepiso"));
      addField(datepobla=new Field(this,nifes,"datepobla"));
      addField(dateprov=new Field(this,nifes,"dateprov"));
      addField(datesc=new Field(this,nifes,"datesc"));
      addField(datesiglas=new Field(this,nifes,"datesiglas"));
      addField(datevia=new Field(this,nifes,"datevia"));
      addField(datfax=new Field(this,nifes,"datfax"));
      addField(datfisicajuri=new Field(this,nifes,"datfisicajuri"));
      addField(datipo=new Field(this,nifes,"datipo"));
      addField(datletra=new Field(this,nifes,"datletra"));
      addField(datmuni=new Field(this,nifes,"datmuni"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      addField(datnum=new Field(this,nifes,"datnum"));
      addField(datpais=new Field(this,nifes,"datpais"));
      addField(datpiso=new Field(this,nifes,"datpiso"));
      addField(datpobla=new Field(this,nifes,"datpobla"));
      addField(datsiglas=new Field(this,nifes,"datsiglas"));
      addField(dattel=new Field(this,nifes,"dattel"));
      addField(datvia=new Field(this,nifes,"datvia"));
      }
    public String getWhere()
      {
      return "danifcif="+vficha.dpnifcif.getSQLFormat();
      
      }
    }
    
  public ProgPrfichadp()
    {
    this.prfichadp=this;
    setName("prfichadp");
    setTitle("Ficha del Despacho Profesional");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vficha=new FormVficha(this));
    addForm(valtanif=new FormValtanif(this));
    vficha.irafichageneral.setForm(valtanif);
    }
  public ProgPrfichadp(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    if (Easp.codiDP!=null)
      vficha.setInitState(DataForm.SHOW);     
    else
      vficha.setInitState(DataForm.INSERT);     
    // vficha.setLayout(new LayoutHtml("mae/easp/html/fichadp.html"));
    super.onInit();
    
    }
  }
  
