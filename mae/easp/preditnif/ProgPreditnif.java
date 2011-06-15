// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20110615
// Hora:             18:54:25
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.preditnif;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: preditnif
// Nombre:   Datos de afiliación
// Versión:  1.0
// 
public class ProgPreditnif extends Program
  {
  public AppEasp easp;
  public ProgPreditnif preditnif;
  // Inicio declaraciones globales
  public String nif = "46761702B";
  // Fin declaraciones globales
  // Ventana
  public FormVnifes vnifes;
  // Selects
  public Snifes snifes;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Datos de afiliación");
      }
    }
    
  public class FormVnifes extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void esFisica(boolean estat){
      datapell2.setEnabled(estat);
      datnombre.setEnabled(estat);
      datletraseti.setEnabled(estat);
      chcbienes.setEnabled(!estat);
    }
    
    public void onEdit(){
      super.onEdit();
      esFisica(snifes.datfisicajuri.getString().equals("F"));
    }
    
    void omplirDatContacto(boolean esFisica, String ape1, String ape2, String nom){
      if (esFisica){
        datcontacto.setValue(nom+" "+ape1+" "+ape2); 
      }
    }
    
    // Fin declaraciones globales
    // Controles
    public CtrlDanifcif danifcif;
    public CtrlDatfisicajuri datfisicajuri;
    public CtrlChcbienes chcbienes;
    public CtrlDatipf datipf;
    public CtrlDatapell1 datapell1;
    public CtrlDatapell2 datapell2;
    public CtrlDatnombre datnombre;
    public CtrlDatletraseti datletraseti;
    public CtrlDatnacional datnacional;
    public CtrlDatemail datemail;
    public CtrlDatcontacto datcontacto;
    public CtrlDattel dattel;
    public CtrlDatfax datfax;
    public CtrlDatmovil datmovil;
    public CtrlDatsiglas datsiglas;
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
    // Acciones
    public LinkAdomicilios adomicilios;
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(REMAINDER);
        setWeightx(780.0);
        setWeighty(520.0);
        setFill(BOTH);
        setAnchor(CENTER);
        }
      }
      
    public class CtrlDanifcif extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(12);
          }
        }
        
      public CtrlDanifcif(Form form)
        {
        super(form);
        setLook(new Look());
        setName("danifcif");
        setTitle("NIF/CIF");
        setType(STRING);
        setMaskInput("U");
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        setField(snifes.danifcif);
        }
      }
      
    public class CtrlDatfisicajuri extends ControlComboBox
      {
      public CtrlDatfisicajuri(Form form)
        {
        super(form);
        setName("datfisicajuri");
        setTitle("F/J");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setPrintable(false);
        addItem("F/Física");
        addItem("J/Jurídica");
        setField(snifes.datfisicajuri);
        }
      public void onChange()
        {
        super.onChange();
        if (!isReading()) {
          esFisica(getString().equals("F"));
          if (getString().equals("F")){
            datipf.setValue("1");
            chcbienes.setValue(false);
            //esFisica=true;
          }
          else if (getString().equals("J")){
            datipf.setValue("9"); 
            datapell2.setNull();
            datnombre.setNull();
            datletraseti.setNull();
            //esFisica=false;
          }
        }
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlChcbienes extends ControlCheck
      {
      public CtrlChcbienes(Form form)
        {
        super(form);
        setName("chcbienes");
        setMessageHelp("Tiene comunidad de bienes");
        setTitle("C. Bienes");
        }
      }
      
    public class CtrlDatipf extends ControlComboBox
      {
      public CtrlDatipf(Form form)
        {
        super(form);
        setName("datipf");
        setMessageHelp("Tipo de código identificador");
        setTitle("IPF");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setPrintable(false);
        addItem("1/DNI");
        addItem("2/Pasaporte");
        addItem("3/Tarjeta Residente Comunitario");
        addItem("4/Permiso Residencia y Trabajo");
        addItem("6/NIE-Número Identif. Extranjero");
        addItem("9/CIF");
        setField(snifes.datipf);
        }
      }
      
    public class CtrlDatapell1 extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(72);
          }
        }
        
      public CtrlDatapell1(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datapell1");
        setTitle("ape1");
        setType(STRING);
        setMaskInput("U");
        setLength(100);
        setPrintable(false);
        setField(snifes.datapell1);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          omplirDatContacto(datfisicajuri.getString().equals("F"), datapell1.getString(), datapell2.getString(),datnombre.getString());
        
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
        setTitle("ape2");
        setType(STRING);
        setMaskInput("U");
        setLength(25);
        setPrintable(false);
        setField(snifes.datapell2);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          omplirDatContacto(datfisicajuri.getString().equals("F"), datapell1.getString(), datapell2.getString(),datnombre.getString());
        
        }
      }
      
    public class CtrlDatnombre extends ControlEdit
      {
      public CtrlDatnombre(Form form)
        {
        super(form);
        setName("datnombre");
        setTitle("nom");
        setType(STRING);
        setMaskInput("U");
        setLength(20);
        setPrintable(false);
        setField(snifes.datnombre);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          omplirDatContacto(datfisicajuri.getString().equals("F"), datapell1.getString(), datapell2.getString(),datnombre.getString());
        
        }
      public boolean obligate()
        {
        return datfisicajuri.getString().equals("F");
        }
      }
      
    public class CtrlDatletraseti extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(5);
          }
        }
        
      public CtrlDatletraseti(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datletraseti");
        setMessageHelp("Letras etiqueta Agencia Tributaria");
        setTitle("Letras etiqueta");
        setType(STRING);
        setMaskInput("U");
        setLength(4);
        setPrintable(false);
        setField(snifes.datletraseti);
        }
      }
      
    public class CtrlDatnacional extends ControlComboBox
      {
      public mae.easp.general.pkpaises.PickPkpaises pickup;
      public CtrlDatnacional(Form form)
        {
        super(form);
        setName("datnacional");
        setMessageHelp("Nacionalidad");
        setTitle("Nacionalidad");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkpaises.PickPkpaises(this));
        setLength(3);
        setPrintable(false);
        setField(snifes.datnacional);
        }
      }
      
    public class CtrlDatemail extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(30);
          }
        }
        
      public CtrlDatemail(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datemail");
        setTitle("email");
        setType(STRING);
        setLength(100);
        setPrintable(false);
        setField(snifes.datemail);
        }
      }
      
    public class CtrlDatcontacto extends ControlEdit
      {
      public CtrlDatcontacto(Form form)
        {
        super(form);
        setName("datcontacto");
        setTitle("Contacto");
        setType(STRING);
        setMaskInput("U");
        setLength(30);
        setPrintable(false);
        setField(snifes.datcontacto);
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
        setField(snifes.dattel);
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
        setTitle("fax");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(snifes.datfax);
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
      
    public class CtrlDatmovil extends ControlEdit
      {
      public CtrlDatmovil(Form form)
        {
        super(form);
        setName("datmovil");
        setTitle("Movil");
        setType(INTEGER);
        setLength(9);
        setPrintable(false);
        setField(snifes.datmovil);
        }
      }
      
    public class CtrlDatsiglas extends ControlComboBox
      {
      public mae.easp.general.pksiglas.PickPksiglas pickup;
      public CtrlDatsiglas(Form form)
        {
        super(form);
        setName("datsiglas");
        setTitle("Siglas");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pksiglas.PickPksiglas(this));
        setLength(2);
        setPrintable(false);
        setDescriptionShow(false);
        setField(snifes.datsiglas);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlDatvia extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(42);
          }
        }
        
      public CtrlDatvia(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datvia");
        setTitle("Vía");
        setType(STRING);
        setMaskInput("U");
        setLength(45);
        setPrintable(false);
        setField(snifes.datvia);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlDatnum extends ControlEdit
      {
      public CtrlDatnum(Form form)
        {
        super(form);
        setName("datnum");
        setTitle("Numero");
        setType(STRING);
        setLength(4);
        setPrintable(false);
        setField(snifes.datnum);
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
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(snifes.datesc);
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
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(snifes.datpiso);
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
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(snifes.datletra);
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
        setLength(2);
        setPrintable(false);
        setField(snifes.adatprov);
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
        setTitle("Municipio");
        setType(INTEGER);
        setMaskInput("999");
        setPickUp(pickup=new mae.easp.general.pkmunicipios.PickPkmunicipios(this));
        setLength(3);
        setPrintable(false);
        setField(snifes.datmuni);
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
        setMaskInput("U");
        setLength(30);
        setPrintable(false);
        setField(snifes.datpobla);
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
        setField(snifes.datcpos);
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
        setTitle("Pais");
        setType(INTEGER);
        setMaskInput("999");
        setPickUp(pickup=new mae.easp.general.pkpaises.PickPkpaises(this));
        setLength(3);
        setPrintable(false);
        setField(snifes.datpais);
        }
      public Object getDefault()
        {
        return new Integer(108);
        }
      }
      
    public class LinkAdomicilios extends Action
      {
      public LinkAdomicilios(Form form)
        {
        super(form);
        setName("adomicilios");
        setTitle("&Gestión de domicilios (Fiscal, notificaciones y social)");
        setOptions(SHOW | UPDATE);
        }
      public void onAction()
        {
        if ( vnifes.getNumState()==DataForm.INSERT || vnifes.getNumState()==DataForm.UPDATE  ) {
          if ( !vnifes.onOk()  )  return ;
        }
        mae.easp.prdomicilios.ProgPrdomicilios pr = new mae.easp.prdomicilios.ProgPrdomicilios();
        pr.gNif = danifcif.getString();
        pr.run();
        doShow();
        }
      }
      
    public FormVnifes(ProgPreditnif preditnif)
      {
      super(preditnif);
      setName("vnifes");
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setPrintable(false);
      setUnique(true);
      addSelect(snifes=new Snifes());
      addControl(danifcif=new CtrlDanifcif(this));
      addControl(datfisicajuri=new CtrlDatfisicajuri(this));
      addControl(chcbienes=new CtrlChcbienes(this));
      addControl(datipf=new CtrlDatipf(this));
      addControl(datapell1=new CtrlDatapell1(this));
      addControl(datapell2=new CtrlDatapell2(this));
      addControl(datnombre=new CtrlDatnombre(this));
      addControl(datletraseti=new CtrlDatletraseti(this));
      addControl(datnacional=new CtrlDatnacional(this));
      addControl(datemail=new CtrlDatemail(this));
      addControl(datcontacto=new CtrlDatcontacto(this));
      addControl(dattel=new CtrlDattel(this));
      addControl(datfax=new CtrlDatfax(this));
      addControl(datmovil=new CtrlDatmovil(this));
      addControl(datsiglas=new CtrlDatsiglas(this));
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
      addAction(adomicilios=new LinkAdomicilios(this));
      setSelect(snifes);
      }
    public void onInit()
      {
      datipf.setDescriptionLength(24);
      datapell1.setTrim(false);
      super.onInit();
      }
    public boolean onOkUpdate()
      {
      if (super.onOkUpdate()){
        int resp = Maefc.message("¿Desea actualizar los datos del domicilio fiscal con estos datos de afiliación?","¡Atención!",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION);
        if (resp == Maefc.YES_OPTION) {
          Easp.actualizarDomicilioFiscal(danifcif.getString());
          Easp.connEA.commit();
        }
        return true;
      }
      else return false;
      
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      chcbienes.setValue(snifes.datcbienes.getString().equals("S"));
      
      }
    }
    
  // select para el cdp con su nif
  public class Snifes extends Select
    {
    // Tablas
    public Nifes nifes;
    // Campos
    public Field adatprov;
    public Field danifcif;
    public Field dataltaen;
    public Field datapell1;
    public Field datapell2;
    public Field datcbienes;
    public Field datcontacto;
    public Field datcpos;
    public Field datdominio;
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
    public Field datipf;
    public Field datipo;
    public Field datletra;
    public Field datletraseti;
    public Field datmovil;
    public Field datmuni;
    public Field datnacional;
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
        setOptions(READ | UPDATE);
        }
      public boolean onUpdate()
        {
        if (vnifes.chcbienes.getBoolean()) datcbienes.setValue("S");
        else datcbienes.setValue("N");
        return super.onUpdate();
        
        }
      }
      
    public Snifes()
      {
      setName("snifes");
      addTable(nifes=new Nifes(this));
      addField(adatprov=new Field(this,nifes,"datprov"));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      addField(dataltaen=new Field(this,nifes,"dataltaen"));
      addField(datapell1=new Field(this,nifes,"datapell1"));
      addField(datapell2=new Field(this,nifes,"datapell2"));
      addField(datcbienes=new Field(this,nifes,"datcbienes"));
      addField(datcontacto=new Field(this,nifes,"datcontacto"));
      addField(datcpos=new Field(this,nifes,"datcpos"));
      addField(datdominio=new Field(this,nifes,"datdominio"));
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
      addField(datipf=new Field(this,nifes,"datipf"));
      addField(datipo=new Field(this,nifes,"datipo"));
      addField(datletra=new Field(this,nifes,"datletra"));
      addField(datletraseti=new Field(this,nifes,"datletraseti"));
      addField(datmovil=new Field(this,nifes,"datmovil"));
      addField(datmuni=new Field(this,nifes,"datmuni"));
      addField(datnacional=new Field(this,nifes,"datnacional"));
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
      return "danifcif='"+nif+"'";
      }
    }
    
  public ProgPreditnif()
    {
    this.preditnif=this;
    setName("preditnif");
    setTitle("Datos de afiliación");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vnifes=new FormVnifes(this));
    }
  public ProgPreditnif(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    setConnection(Easp.connEA);
    setModal(true);
    LocationWindow lw=new LocationWindow();
    lw.setWidth(797);
    lw.setHeight(340);
    lw.setLocation(lw.SOUTH);
    setLocation(lw);
    vnifes.setLayout(new LayoutHtml("mae/easp/html/preditnif.html"));
    super.onInit();
    }
  }
  
