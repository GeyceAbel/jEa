// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090922
// Hora:             12:06:52
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicaci�n: easp - Entorno de aplicaciones para AGP
// Versi�n:    4.1
// 
package mae.easp.prdomicilios;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prdomicilios
// Nombre:   GESTI�N DE DOMICILIOS
// Versi�n:  6.8
// 
public class ProgPrdomicilios extends Program
  {
  public AppEasp easp;
  public ProgPrdomicilios prdomicilios;
  // Inicio declaraciones globales
  public String gNif = null;
  
  private String getNomMuni(String cod) {
    String desc = null;
    Selector s = new Selector (Easp.connEA);
    s.execute ("Select * from MUNI347 where mu7provmuni='"+cod+"'");
    if (s.next()) desc = s.getString("mu7desc");
    s.close();
    return desc;
  }
  // Fin declaraciones globales
  // Ventana
  public FormVdomicilios vdomicilios;
  // Selects
  public Snif snif;
  // Ventana
  public FormVnotificaciones vnotificaciones;
  // Selects
  // Ventana
  public FormVsocial vsocial;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("GESTI�N DE DOMICILIOS");
      }
    }
    
  public class FormVdomicilios extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void onEdit() {
      super.onEdit();
      vdomicilios.btfiscal.setEnabled(true);
      vnotificaciones.btnotif1.setEnabled(true);
      vnotificaciones.btnotif2.setEnabled(true);
      vsocial.btsocial.setEnabled(true);
    }
    
    // Fin declaraciones globales
    // Controles
    public CtrlBtfiscal btfiscal;
    public CtrlDatfftvia datfftvia;
    public CtrlDatfvia datfvia;
    public CtrlDatftnum datftnum;
    public CtrlDatfnum datfnum;
    public CtrlDatfcalnum datfcalnum;
    public CtrlDatfbloque datfbloque;
    public CtrlDatfportal datfportal;
    public CtrlDatfescal datfescal;
    public CtrlDatfplanta datfplanta;
    public CtrlDatfpuerta datfpuerta;
    public CtrlDatfcomp datfcomp;
    public CtrlDatflocal datflocal;
    public CtrlDatfemail datfemail;
    public CtrlDatfprov datfprov;
    public CtrlDatfcodmun datfcodmun;
    public CtrlDatfnommun datfnommun;
    public CtrlDatfcpost datfcpost;
    public CtrlDatftel datftel;
    public CtrlDatfmovil datfmovil;
    public CtrlDatffax datffax;
    // Acciones
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
        setAnchor(NORTH);
        }
      }
      
    public class CtrlBtfiscal extends ControlButton
      {
      public CtrlBtfiscal(Form form)
        {
        super(form);
        setName("btfiscal");
        setTitle("Importar de los datos de afiliaci�n");
        setTitle("Importar de los datos de afiliaci�n");
        }
      public void onClick()
        {
        datfftvia.setNull();
        Selector s = new Selector (Easp.connEA);
        s.execute("Select * from TIPOVIAS where tvscodant="+snif.datsiglas.getSQLFormat());
        if (s.next()) datfftvia.setValue(s.getString("tvscodigo"));
        s.close();
        datfvia.setValue(snif.datvia);
        datftnum.setValue("NUM");
        datfnum.setNull();
        try {
          datfnum.setValue(Integer.parseInt(snif.datnum.getString()));
        }
        catch(Exception e) {}
        datfcalnum.setNull();
        datfbloque.setNull();
        datfportal.setNull();
        datfescal.setValue(snif.datesc);
        datfplanta.setNull();
        datfpuerta.setValue(snif.datletra);
        if (snif.datpiso.getString().length()>3) datfplanta.setValue(snif.datpiso.getString().substring(0,3));
        else datfplanta.setValue(snif.datpiso);
        datfcomp.setNull();
        datflocal.setValue(snif.datpobla);
        datfcpost.setValue(snif.datcpos);
        datftel.setNull();
        datfmovil.setValue(snif.datmovil);
        datffax.setNull();
        try {
          datftel.setValue(Integer.parseInt(snif.dattel.getString()));
        }
        catch(Exception e) {
        }
        try {
          datffax.setValue(Integer.parseInt(snif.datfax.getString()));
        }
        catch(Exception e) {
        }
        datfemail.setValue(snif.datemail);
        datfprov.setValue(snif.datprov);
        datfcodmun.setNull();
        datfnommun.setNull();
        s = new Selector (Easp.connEA);
        s.execute("Select * from MUNI347 where mu7codprov="+snif.datprov.getInteger()+" and mu7muniant="+snif.datmuni.getInteger());
        if (s.next()) {
          datfcodmun.setValue(s.getString("mu7provmuni"));
          datfnommun.setValue(s.getString("mu7desc"));
        }
        s.close();
        
        }
      }
      
    public class CtrlDatfftvia extends ControlComboBox
      {
      public mae.easp.general.pktipovias.PickPktipovias pickup;
      public CtrlDatfftvia(Form form)
        {
        super(form);
        setName("datfftvia");
        setTitle("Tipo de Via");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pktipovias.PickPktipovias(this));
        setLength(5);
        setDescriptionShow(false);
        setField(snif.datfftvia);
        }
      }
      
    public class CtrlDatfvia extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(30);
          }
        }
        
      public CtrlDatfvia(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datfvia");
        setTitle("Nombre de Via");
        setType(STRING);
        setMaskInput("U");
        setLength(50);
        setField(snif.datfvia);
        }
      }
      
    public class CtrlDatftnum extends ControlComboBox
      {
      public mae.easp.general.pkvalores.PickPkvalores pickup;
      public CtrlDatftnum(Form form)
        {
        super(form);
        setName("datftnum");
        setTitle("Tipo Num");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkvalores.PickPkvalores(this));
        setLength(3);
        setDescriptionShow(false);
        setField(snif.datftnum);
        }
      }
      
    public class CtrlDatfnum extends ControlEdit
      {
      public CtrlDatfnum(Form form)
        {
        super(form);
        setName("datfnum");
        setTitle("Num casa");
        setType(INTEGER);
        setLength(5);
        setField(snif.datfnum);
        }
      }
      
    public class CtrlDatfcalnum extends ControlComboBox
      {
      public mae.easp.general.pkvalores.PickPkvalores pickup;
      public CtrlDatfcalnum(Form form)
        {
        super(form);
        setName("datfcalnum");
        setTitle("Calif. Numero");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkvalores.PickPkvalores(this));
        setLength(3);
        setDescriptionShow(false);
        setField(snif.datfcalnum);
        }
      }
      
    public class CtrlDatfbloque extends ControlEdit
      {
      public CtrlDatfbloque(Form form)
        {
        super(form);
        setName("datfbloque");
        setTitle("Bloque");
        setType(STRING);
        setLength(3);
        setField(snif.datfbloque);
        }
      }
      
    public class CtrlDatfportal extends ControlEdit
      {
      public CtrlDatfportal(Form form)
        {
        super(form);
        setName("datfportal");
        setTitle("Portal");
        setType(STRING);
        setLength(3);
        setField(snif.datfportal);
        }
      }
      
    public class CtrlDatfescal extends ControlEdit
      {
      public CtrlDatfescal(Form form)
        {
        super(form);
        setName("datfescal");
        setTitle("Escalera");
        setType(STRING);
        setLength(3);
        setField(snif.datfescal);
        }
      }
      
    public class CtrlDatfplanta extends ControlEdit
      {
      public CtrlDatfplanta(Form form)
        {
        super(form);
        setName("datfplanta");
        setTitle("Planta");
        setType(STRING);
        setLength(3);
        setField(snif.datfplanta);
        }
      }
      
    public class CtrlDatfpuerta extends ControlEdit
      {
      public CtrlDatfpuerta(Form form)
        {
        super(form);
        setName("datfpuerta");
        setTitle("Puerta");
        setType(STRING);
        setLength(3);
        setField(snif.datfpuerta);
        }
      }
      
    public class CtrlDatfcomp extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(20);
          }
        }
        
      public CtrlDatfcomp(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datfcomp");
        setMessageHelp("Complemento de domicilio");
        setTitle("Complemento");
        setType(STRING);
        setLength(40);
        setField(snif.datfcomp);
        }
      }
      
    public class CtrlDatflocal extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(20);
          }
        }
        
      public CtrlDatflocal(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datflocal");
        setTitle("Localidad");
        setType(STRING);
        setMaskInput("U");
        setLength(30);
        setField(snif.datflocal);
        }
      }
      
    public class CtrlDatfemail extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(25);
          }
        }
        
      public CtrlDatfemail(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datfemail");
        setTitle("E-mail");
        setType(STRING);
        setLength(100);
        setField(snif.datfemail);
        }
      }
      
    public class CtrlDatfprov extends ControlComboBox
      {
      public mae.easp.general.pkprovincia.PickPkprovincia pickup;
      public CtrlDatfprov(Form form)
        {
        super(form);
        setName("datfprov");
        setTitle("Provincia");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkprovincia.PickPkprovincia(this));
        setLength(2);
        setField(snif.datfprov);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange(Value v) {
          super.userChange(v);
          datfnommun.setNull();
          datfcodmun.setNull();
          datfcodmun.pickup.provincia=getInteger();
          datfcodmun.refresh();
          datfcpost.setNull();
          datfcpost.setValue(Numero.format(getInteger(),"00"));
        }
      }
      
    public class CtrlDatfcodmun extends ControlComboBox
      {
      public mae.easp.general.pkmuni347.PickPkmuni347 pickup;
      public CtrlDatfcodmun(Form form)
        {
        super(form);
        setName("datfcodmun");
        setTitle("C�digo Municipio");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkmuni347.PickPkmuni347(this));
        setLength(5);
        setRestricted(false);
        setDescriptionShow(false);
        setField(snif.datfcodmun);
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange(Value v) {
          super.userChange(v);
          datfnommun.setValue(getNomMuni(getString()));
        }
      }
      
    public class CtrlDatfnommun extends ControlEdit
      {
      public CtrlDatfnommun(Form form)
        {
        super(form);
        setName("datfnommun");
        setTitle("Nombre Municipio");
        setType(STRING);
        setLength(30);
        setEnabled(false);
        setField(snif.datfnommun);
        }
      }
      
    public class CtrlDatfcpost extends ControlEdit
      {
      public CtrlDatfcpost(Form form)
        {
        super(form);
        setName("datfcpost");
        setTitle("C. Postal");
        setType(STRING);
        setLength(5);
        setField(snif.datfcpost);
        }
      public boolean  valid()
        {
        if (getString().length()!=5) {
          setMessageWarning("Un c�digo postal ha de constar de 5 d�gitos");
          return false;
        }
        else {
          return getString().substring(0,2).equals(Numero.format(datfprov.getInteger(),"00"));
        }
        }
      }
      
    public class CtrlDatftel extends ControlEdit
      {
      public CtrlDatftel(Form form)
        {
        super(form);
        setName("datftel");
        setTitle("Tel�fono");
        setType(INTEGER);
        setLength(9);
        setField(snif.datftel);
        }
      }
      
    public class CtrlDatfmovil extends ControlEdit
      {
      public CtrlDatfmovil(Form form)
        {
        super(form);
        setName("datfmovil");
        setTitle("M�vil");
        setType(INTEGER);
        setLength(9);
        setField(snif.datfmovil);
        }
      }
      
    public class CtrlDatffax extends ControlEdit
      {
      public CtrlDatffax(Form form)
        {
        super(form);
        setName("datffax");
        setTitle("Fax");
        setType(INTEGER);
        setLength(9);
        setField(snif.datffax);
        }
      }
      
    public FormVdomicilios(ProgPrdomicilios prdomicilios)
      {
      super(prdomicilios);
      setName("vdomicilios");
      setTitle("Domicilio fiscal");
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setUnique(true);
      addSelect(snif=new Snif());
      addControl(btfiscal=new CtrlBtfiscal(this));
      addControl(datfftvia=new CtrlDatfftvia(this));
      addControl(datfvia=new CtrlDatfvia(this));
      addControl(datftnum=new CtrlDatftnum(this));
      addControl(datfnum=new CtrlDatfnum(this));
      addControl(datfcalnum=new CtrlDatfcalnum(this));
      addControl(datfbloque=new CtrlDatfbloque(this));
      addControl(datfportal=new CtrlDatfportal(this));
      addControl(datfescal=new CtrlDatfescal(this));
      addControl(datfplanta=new CtrlDatfplanta(this));
      addControl(datfpuerta=new CtrlDatfpuerta(this));
      addControl(datfcomp=new CtrlDatfcomp(this));
      addControl(datflocal=new CtrlDatflocal(this));
      addControl(datfemail=new CtrlDatfemail(this));
      addControl(datfprov=new CtrlDatfprov(this));
      addControl(datfcodmun=new CtrlDatfcodmun(this));
      addControl(datfnommun=new CtrlDatfnommun(this));
      addControl(datfcpost=new CtrlDatfcpost(this));
      addControl(datftel=new CtrlDatftel(this));
      addControl(datfmovil=new CtrlDatfmovil(this));
      addControl(datffax=new CtrlDatffax(this));
      setSelect(snif);
      }
    public boolean onOkUpdate()
      {
      if (super.onOkUpdate()){
        int resp = Maefc.message("�Desea actualizar los datos de afiliaci�n con los datos del domicilio fiscal?","�Atenci�n!",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION);
        if (resp == Maefc.YES_OPTION) {
          Easp.actualizarDomicilioAfiliacion(gNif);
          Easp.connEA.commit();
        }
        return true;
      }
      else return false;
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      vdomicilios.datftnum.pickup.filtro="TIPONUM";
      vdomicilios.datftnum.refresh();
      vdomicilios.datfcalnum.pickup.filtro="CALIFNUM";
      vdomicilios.datfcalnum.refresh();
      vnotificaciones.datntnum.pickup.filtro="TIPONUM";
      vnotificaciones.datntnum.refresh();
      vnotificaciones.datncalnum.pickup.filtro="CALIFNUM";
      vnotificaciones.datncalnum.refresh();
      vsocial.datstnum.pickup.filtro="TIPONUM";
      vsocial.datstnum.refresh();
      vsocial.datscalnum.pickup.filtro="CALIFNUM";
      vsocial.datscalnum.refresh();
      vdomicilios.datfcodmun.pickup.provincia=snif.datfprov.getInteger();
      vdomicilios.datfcodmun.refresh();
      vnotificaciones.datncodmun.pickup.provincia=snif.datnprov.getInteger();
      vnotificaciones.datncodmun.refresh();
      vsocial.datscodmun.pickup.provincia=snif.datsprov.getInteger();
      vsocial.datscodmun.refresh();
      vdomicilios.btfiscal.setEnabled(false);
      vnotificaciones.btnotif1.setEnabled(false);
      vnotificaciones.btnotif2.setEnabled(false);
      vsocial.btsocial.setEnabled(false);
      
      }
    }
    
  // 
  public class Snif extends Select
    {
    // Tablas
    public Nifes nifes;
    // Campos
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
    public Field datfbloque;
    public Field datfcalnum;
    public Field datfcodmun;
    public Field datfcomp;
    public Field datfcpost;
    public Field datfemail;
    public Field datfescal;
    public Field datffax;
    public Field datfftvia;
    public Field datfisicajuri;
    public Field datflocal;
    public Field datfmovil;
    public Field datfnommun;
    public Field datfnum;
    public Field datfplanta;
    public Field datfportal;
    public Field datfprov;
    public Field datfpuerta;
    public Field datftel;
    public Field datftnum;
    public Field datfvia;
    public Field datipf;
    public Field datipo;
    public Field datletra;
    public Field datletraseti;
    public Field datmovil;
    public Field datmuni;
    public Field datnacional;
    public Field datnapcor;
    public Field datnbloque;
    public Field datncalnum;
    public Field datncodmun;
    public Field datncomp;
    public Field datncpost;
    public Field datncpost2;
    public Field datnemail;
    public Field datnescal;
    public Field datnfax;
    public Field datnfax2;
    public Field datnftvia;
    public Field datnlocal;
    public Field datnmovil;
    public Field datnmovil2;
    public Field datnnommun;
    public Field datnnum;
    public Field datnombre;
    public Field datnplanta;
    public Field datnpobla;
    public Field datnportal;
    public Field datnprov;
    public Field datnprov2;
    public Field datnpuerta;
    public Field datntel;
    public Field datntel2;
    public Field datntnum;
    public Field datnum;
    public Field datnvia;
    public Field datpais;
    public Field datpiso;
    public Field datpobla;
    public Field datprov;
    public Field datsbloque;
    public Field datscalnum;
    public Field datscodmun;
    public Field datscomp;
    public Field datscpost;
    public Field datsemail;
    public Field datsescal;
    public Field datsfax;
    public Field datsftvia;
    public Field datsiglas;
    public Field datslocal;
    public Field datsmovil;
    public Field datsnommun;
    public Field datsnum;
    public Field datsplanta;
    public Field datsportal;
    public Field datsprov;
    public Field datspuerta;
    public Field datstel;
    public Field datstnum;
    public Field datsvia;
    public Field dattel;
    public Field datvia;
    class Nifes extends Table
      {
      public Nifes(Select select)
        {
        super(select);
        setName("nifes");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Snif()
      {
      setName("snif");
      addTable(nifes=new Nifes(this));
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
      addField(datfbloque=new Field(this,nifes,"datfbloque"));
      addField(datfcalnum=new Field(this,nifes,"datfcalnum"));
      addField(datfcodmun=new Field(this,nifes,"datfcodmun"));
      addField(datfcomp=new Field(this,nifes,"datfcomp"));
      addField(datfcpost=new Field(this,nifes,"datfcpost"));
      addField(datfemail=new Field(this,nifes,"datfemail"));
      addField(datfescal=new Field(this,nifes,"datfescal"));
      addField(datffax=new Field(this,nifes,"datffax"));
      addField(datfftvia=new Field(this,nifes,"datfftvia"));
      addField(datfisicajuri=new Field(this,nifes,"datfisicajuri"));
      addField(datflocal=new Field(this,nifes,"datflocal"));
      addField(datfmovil=new Field(this,nifes,"datfmovil"));
      addField(datfnommun=new Field(this,nifes,"datfnommun"));
      addField(datfnum=new Field(this,nifes,"datfnum"));
      addField(datfplanta=new Field(this,nifes,"datfplanta"));
      addField(datfportal=new Field(this,nifes,"datfportal"));
      addField(datfprov=new Field(this,nifes,"datfprov"));
      addField(datfpuerta=new Field(this,nifes,"datfpuerta"));
      addField(datftel=new Field(this,nifes,"datftel"));
      addField(datftnum=new Field(this,nifes,"datftnum"));
      addField(datfvia=new Field(this,nifes,"datfvia"));
      addField(datipf=new Field(this,nifes,"datipf"));
      addField(datipo=new Field(this,nifes,"datipo"));
      addField(datletra=new Field(this,nifes,"datletra"));
      addField(datletraseti=new Field(this,nifes,"datletraseti"));
      addField(datmovil=new Field(this,nifes,"datmovil"));
      addField(datmuni=new Field(this,nifes,"datmuni"));
      addField(datnacional=new Field(this,nifes,"datnacional"));
      addField(datnapcor=new Field(this,nifes,"datnapcor"));
      addField(datnbloque=new Field(this,nifes,"datnbloque"));
      addField(datncalnum=new Field(this,nifes,"datncalnum"));
      addField(datncodmun=new Field(this,nifes,"datncodmun"));
      addField(datncomp=new Field(this,nifes,"datncomp"));
      addField(datncpost=new Field(this,nifes,"datncpost"));
      addField(datncpost2=new Field(this,nifes,"datncpost2"));
      addField(datnemail=new Field(this,nifes,"datnemail"));
      addField(datnescal=new Field(this,nifes,"datnescal"));
      addField(datnfax=new Field(this,nifes,"datnfax"));
      addField(datnfax2=new Field(this,nifes,"datnfax2"));
      addField(datnftvia=new Field(this,nifes,"datnftvia"));
      addField(datnlocal=new Field(this,nifes,"datnlocal"));
      addField(datnmovil=new Field(this,nifes,"datnmovil"));
      addField(datnmovil2=new Field(this,nifes,"datnmovil2"));
      addField(datnnommun=new Field(this,nifes,"datnnommun"));
      addField(datnnum=new Field(this,nifes,"datnnum"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      addField(datnplanta=new Field(this,nifes,"datnplanta"));
      addField(datnpobla=new Field(this,nifes,"datnpobla"));
      addField(datnportal=new Field(this,nifes,"datnportal"));
      addField(datnprov=new Field(this,nifes,"datnprov"));
      addField(datnprov2=new Field(this,nifes,"datnprov2"));
      addField(datnpuerta=new Field(this,nifes,"datnpuerta"));
      addField(datntel=new Field(this,nifes,"datntel"));
      addField(datntel2=new Field(this,nifes,"datntel2"));
      addField(datntnum=new Field(this,nifes,"datntnum"));
      addField(datnum=new Field(this,nifes,"datnum"));
      addField(datnvia=new Field(this,nifes,"datnvia"));
      addField(datpais=new Field(this,nifes,"datpais"));
      addField(datpiso=new Field(this,nifes,"datpiso"));
      addField(datpobla=new Field(this,nifes,"datpobla"));
      addField(datprov=new Field(this,nifes,"datprov"));
      addField(datsbloque=new Field(this,nifes,"datsbloque"));
      addField(datscalnum=new Field(this,nifes,"datscalnum"));
      addField(datscodmun=new Field(this,nifes,"datscodmun"));
      addField(datscomp=new Field(this,nifes,"datscomp"));
      addField(datscpost=new Field(this,nifes,"datscpost"));
      addField(datsemail=new Field(this,nifes,"datsemail"));
      addField(datsescal=new Field(this,nifes,"datsescal"));
      addField(datsfax=new Field(this,nifes,"datsfax"));
      addField(datsftvia=new Field(this,nifes,"datsftvia"));
      addField(datsiglas=new Field(this,nifes,"datsiglas"));
      addField(datslocal=new Field(this,nifes,"datslocal"));
      addField(datsmovil=new Field(this,nifes,"datsmovil"));
      addField(datsnommun=new Field(this,nifes,"datsnommun"));
      addField(datsnum=new Field(this,nifes,"datsnum"));
      addField(datsplanta=new Field(this,nifes,"datsplanta"));
      addField(datsportal=new Field(this,nifes,"datsportal"));
      addField(datsprov=new Field(this,nifes,"datsprov"));
      addField(datspuerta=new Field(this,nifes,"datspuerta"));
      addField(datstel=new Field(this,nifes,"datstel"));
      addField(datstnum=new Field(this,nifes,"datstnum"));
      addField(datsvia=new Field(this,nifes,"datsvia"));
      addField(dattel=new Field(this,nifes,"dattel"));
      addField(datvia=new Field(this,nifes,"datvia"));
      }
    public String getWhere()
      {
      return "danifcif='"+gNif+"'";
      }
    }
    
  public class FormVnotificaciones extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void onEdit() {
      super.onEdit();
      vdomicilios.btfiscal.setEnabled(true);
      vnotificaciones.btnotif1.setEnabled(true);
      vnotificaciones.btnotif2.setEnabled(true);
      vsocial.btsocial.setEnabled(true);
    }
    
    
    // Fin declaraciones globales
    // Controles
    public CtrlBtnotif1 btnotif1;
    public CtrlDatnftvia datnftvia;
    public CtrlDatnvia datnvia;
    public CtrlDatntnum datntnum;
    public CtrlDatnnum datnnum;
    public CtrlDatncalnum datncalnum;
    public CtrlDatnbloque datnbloque;
    public CtrlDatnportal datnportal;
    public CtrlDatnescal datnescal;
    public CtrlDatnplanta datnplanta;
    public CtrlDatnpuerta datnpuerta;
    public CtrlDatncomp datncomp;
    public CtrlDatnlocal datnlocal;
    public CtrlDatnemail datnemail;
    public CtrlDatnprov datnprov;
    public CtrlDatncodmun datncodmun;
    public CtrlDatnnommun datnnommun;
    public CtrlDatncpost datncpost;
    public CtrlDatntel datntel;
    public CtrlDatnmovil datnmovil;
    public CtrlDatnfax datnfax;
    public CtrlBtnotif2 btnotif2;
    public CtrlDatnapcor datnapcor;
    public CtrlDatnpobla datnpobla;
    public CtrlDatnprov2 datnprov2;
    public CtrlDatncpost2 datncpost2;
    public CtrlDatntel2 datntel2;
    public CtrlDatnmovil2 datnmovil2;
    public CtrlDatnfax2 datnfax2;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        }
      }
      
    public class CtrlBtnotif1 extends ControlButton
      {
      public CtrlBtnotif1(Form form)
        {
        super(form);
        setName("btnotif1");
        setTitle("Importar del domicilio fiscal");
        setTitle("Importar del domicilio fiscal");
        }
      public void onClick()
        {
        super.onClick();
        datnftvia    .setValue(vdomicilios.datfftvia   );
        datnvia    .setValue(vdomicilios.datfvia   );
        datntnum   .setValue(vdomicilios.datftnum  );
        datnnum    .setValue(vdomicilios.datfnum   );
        datncalnum .setValue(vdomicilios.datfcalnum);
        datnbloque .setValue(vdomicilios.datfbloque);
        datnportal .setValue(vdomicilios.datfportal);
        datnescal  .setValue(vdomicilios.datfescal );
        datnplanta .setValue(vdomicilios.datfplanta);
        datnpuerta .setValue(vdomicilios.datfpuerta);
        datncomp   .setValue(vdomicilios.datfcomp  );
        datnlocal  .setValue(vdomicilios.datflocal );
        datnemail  .setValue(vdomicilios.datfemail );
        datnprov   .setValue(vdomicilios.datfprov  );
        datncodmun .setValue(vdomicilios.datfcodmun);
        datnnommun .setValue(vdomicilios.datfnommun);
        datncpost  .setValue(vdomicilios.datfcpost );
        datntel    .setValue(vdomicilios.datftel   );
        datnmovil  .setValue(vdomicilios.datfmovil );
        datnfax    .setValue(vdomicilios.datffax   );
        datncodmun.pickup.provincia=datnprov.getInteger();
        datncodmun.refresh();
        
        }
      }
      
    public class CtrlDatnftvia extends ControlComboBox
      {
      public mae.easp.general.pktipovias.PickPktipovias pickup;
      public CtrlDatnftvia(Form form)
        {
        super(form);
        setName("datnftvia");
        setTitle("Tipo de Via");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pktipovias.PickPktipovias(this));
        setLength(5);
        setDescriptionShow(false);
        setField(snif.datnftvia);
        }
      }
      
    public class CtrlDatnvia extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(30);
          }
        }
        
      public CtrlDatnvia(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datnvia");
        setTitle("Nombre de Via");
        setType(STRING);
        setMaskInput("U");
        setLength(50);
        setField(snif.datnvia);
        }
      }
      
    public class CtrlDatntnum extends ControlComboBox
      {
      public mae.easp.general.pkvalores.PickPkvalores pickup;
      public CtrlDatntnum(Form form)
        {
        super(form);
        setName("datntnum");
        setTitle("Tipo Num");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkvalores.PickPkvalores(this));
        setLength(3);
        setDescriptionShow(false);
        setField(snif.datntnum);
        }
      }
      
    public class CtrlDatnnum extends ControlEdit
      {
      public CtrlDatnnum(Form form)
        {
        super(form);
        setName("datnnum");
        setTitle("Num casa");
        setType(INTEGER);
        setLength(5);
        setField(snif.datnnum);
        }
      }
      
    public class CtrlDatncalnum extends ControlComboBox
      {
      public mae.easp.general.pkvalores.PickPkvalores pickup;
      public CtrlDatncalnum(Form form)
        {
        super(form);
        setName("datncalnum");
        setTitle("Calif. Numero");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkvalores.PickPkvalores(this));
        setLength(3);
        setDescriptionShow(false);
        setField(snif.datncalnum);
        }
      }
      
    public class CtrlDatnbloque extends ControlEdit
      {
      public CtrlDatnbloque(Form form)
        {
        super(form);
        setName("datnbloque");
        setTitle("Bloque");
        setType(STRING);
        setLength(3);
        setField(snif.datnbloque);
        }
      }
      
    public class CtrlDatnportal extends ControlEdit
      {
      public CtrlDatnportal(Form form)
        {
        super(form);
        setName("datnportal");
        setTitle("Portal");
        setType(STRING);
        setLength(3);
        setField(snif.datnportal);
        }
      }
      
    public class CtrlDatnescal extends ControlEdit
      {
      public CtrlDatnescal(Form form)
        {
        super(form);
        setName("datnescal");
        setTitle("Escalera");
        setType(STRING);
        setLength(3);
        setField(snif.datnescal);
        }
      }
      
    public class CtrlDatnplanta extends ControlEdit
      {
      public CtrlDatnplanta(Form form)
        {
        super(form);
        setName("datnplanta");
        setTitle("Planta");
        setType(STRING);
        setLength(3);
        setField(snif.datnplanta);
        }
      }
      
    public class CtrlDatnpuerta extends ControlEdit
      {
      public CtrlDatnpuerta(Form form)
        {
        super(form);
        setName("datnpuerta");
        setTitle("Puerta");
        setType(STRING);
        setLength(3);
        setField(snif.datnpuerta);
        }
      }
      
    public class CtrlDatncomp extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(20);
          }
        }
        
      public CtrlDatncomp(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datncomp");
        setMessageHelp("Complemento de domicilio");
        setTitle("Complemento");
        setType(STRING);
        setLength(40);
        setField(snif.datncomp);
        }
      }
      
    public class CtrlDatnlocal extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(20);
          }
        }
        
      public CtrlDatnlocal(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datnlocal");
        setTitle("Localidad");
        setType(STRING);
        setMaskInput("U");
        setLength(30);
        setField(snif.datnlocal);
        }
      }
      
    public class CtrlDatnemail extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(25);
          }
        }
        
      public CtrlDatnemail(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datnemail");
        setTitle("E-mail");
        setType(STRING);
        setLength(100);
        setField(snif.datnemail);
        }
      }
      
    public class CtrlDatnprov extends ControlComboBox
      {
      public mae.easp.general.pkprovincia.PickPkprovincia pickup;
      public CtrlDatnprov(Form form)
        {
        super(form);
        setName("datnprov");
        setTitle("Provincia");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkprovincia.PickPkprovincia(this));
        setLength(2);
        setField(snif.datnprov);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange(Value v) {
          super.userChange(v);
          datnnommun.setNull();
          datncodmun.setNull();
          datncodmun.pickup.provincia=getInteger();
          datncodmun.refresh();
          datncpost.setNull();
          datncpost.setValue(Numero.format(getInteger(),"00"));
        
        }
      }
      
    public class CtrlDatncodmun extends ControlComboBox
      {
      public mae.easp.general.pkmuni347.PickPkmuni347 pickup;
      public CtrlDatncodmun(Form form)
        {
        super(form);
        setName("datncodmun");
        setTitle("C�digo Municipio");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkmuni347.PickPkmuni347(this));
        setLength(5);
        setRestricted(false);
        setDescriptionShow(false);
        setField(snif.datncodmun);
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange(Value v) {
          super.userChange(v);
          datnnommun.setValue(getNomMuni(getString()));
        }
      }
      
    public class CtrlDatnnommun extends ControlEdit
      {
      public CtrlDatnnommun(Form form)
        {
        super(form);
        setName("datnnommun");
        setTitle("Nombre Municipio");
        setType(STRING);
        setLength(30);
        setEnabled(false);
        setField(snif.datnnommun);
        }
      }
      
    public class CtrlDatncpost extends ControlEdit
      {
      public CtrlDatncpost(Form form)
        {
        super(form);
        setName("datncpost");
        setTitle("C. Postal");
        setType(STRING);
        setLength(5);
        setField(snif.datncpost);
        }
      public boolean  valid()
        {
        if (getString().length()!=5) {
          setMessageWarning("Un c�digo postal ha de constar de 5 d�gitos");
          return false;
        }
        else {
          return getString().substring(0,2).equals(Numero.format(datnprov.getInteger(),"00"));
        }
        }
      }
      
    public class CtrlDatntel extends ControlEdit
      {
      public CtrlDatntel(Form form)
        {
        super(form);
        setName("datntel");
        setTitle("Tel�fono");
        setType(INTEGER);
        setLength(9);
        setField(snif.datntel);
        }
      }
      
    public class CtrlDatnmovil extends ControlEdit
      {
      public CtrlDatnmovil(Form form)
        {
        super(form);
        setName("datnmovil");
        setTitle("M�vil");
        setType(INTEGER);
        setLength(9);
        setField(snif.datnmovil);
        }
      }
      
    public class CtrlDatnfax extends ControlEdit
      {
      public CtrlDatnfax(Form form)
        {
        super(form);
        setName("datnfax");
        setTitle("Fax");
        setType(INTEGER);
        setLength(9);
        setField(snif.datnfax);
        }
      }
      
    public class CtrlBtnotif2 extends ControlButton
      {
      public CtrlBtnotif2(Form form)
        {
        super(form);
        setName("btnotif2");
        setTitle("Importar del domicilio fiscal");
        setTitle("Importar del domicilio fiscal");
        }
      public void onClick()
        {
        super.onClick();
        datnprov2   .setValue(vdomicilios.datfprov  );
        datncpost2  .setValue(vdomicilios.datfcpost );
        datntel2    .setValue(vdomicilios.datftel   );
        datnmovil2  .setValue(vdomicilios.datfmovil );
        datnfax2    .setValue(vdomicilios.datffax   );
        
        }
      }
      
    public class CtrlDatnapcor extends ControlEdit
      {
      public CtrlDatnapcor(Form form)
        {
        super(form);
        setName("datnapcor");
        setTitle("Apartado Correo");
        setType(STRING);
        setLength(10);
        setField(snif.datnapcor);
        }
      }
      
    public class CtrlDatnpobla extends ControlEdit
      {
      public CtrlDatnpobla(Form form)
        {
        super(form);
        setName("datnpobla");
        setTitle("Poblaci�n");
        setType(STRING);
        setLength(30);
        setField(snif.datnpobla);
        }
      }
      
    public class CtrlDatnprov2 extends ControlComboBox
      {
      public mae.easp.general.pkprovincia.PickPkprovincia pickup;
      public CtrlDatnprov2(Form form)
        {
        super(form);
        setName("datnprov2");
        setTitle("Provincia");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkprovincia.PickPkprovincia(this));
        setLength(2);
        setField(snif.datnprov2);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange(Value v) {
          super.userChange(v);
          datncpost2.setNull();
          datncpost2.setValue(Numero.format(getInteger(),"00"));
        
        }
      }
      
    public class CtrlDatncpost2 extends ControlEdit
      {
      public CtrlDatncpost2(Form form)
        {
        super(form);
        setName("datncpost2");
        setTitle("C. Postal");
        setType(STRING);
        setLength(5);
        setField(snif.datncpost2);
        }
      public boolean  valid()
        {
        if (getString().length()!=5) {
          setMessageWarning("Un c�digo postal ha de constar de 5 d�gitos");
          return false;
        }
        else {
          return getString().substring(0,2).equals(Numero.format(datnprov2.getInteger(),"00"));
        }
        }
      }
      
    public class CtrlDatntel2 extends ControlEdit
      {
      public CtrlDatntel2(Form form)
        {
        super(form);
        setName("datntel2");
        setTitle("Tel�fono");
        setType(INTEGER);
        setLength(9);
        setField(snif.datntel2);
        }
      }
      
    public class CtrlDatnmovil2 extends ControlEdit
      {
      public CtrlDatnmovil2(Form form)
        {
        super(form);
        setName("datnmovil2");
        setTitle("M�vil");
        setType(INTEGER);
        setLength(9);
        setField(snif.datnmovil2);
        }
      }
      
    public class CtrlDatnfax2 extends ControlEdit
      {
      public CtrlDatnfax2(Form form)
        {
        super(form);
        setName("datnfax2");
        setTitle("Fax");
        setType(INTEGER);
        setLength(9);
        setField(snif.datnfax2);
        }
      }
      
    public FormVnotificaciones(ProgPrdomicilios prdomicilios)
      {
      super(prdomicilios);
      setName("vnotificaciones");
      setTitle("Domicilio notificaciones");
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setUnique(true);
      addControl(btnotif1=new CtrlBtnotif1(this));
      addControl(datnftvia=new CtrlDatnftvia(this));
      addControl(datnvia=new CtrlDatnvia(this));
      addControl(datntnum=new CtrlDatntnum(this));
      addControl(datnnum=new CtrlDatnnum(this));
      addControl(datncalnum=new CtrlDatncalnum(this));
      addControl(datnbloque=new CtrlDatnbloque(this));
      addControl(datnportal=new CtrlDatnportal(this));
      addControl(datnescal=new CtrlDatnescal(this));
      addControl(datnplanta=new CtrlDatnplanta(this));
      addControl(datnpuerta=new CtrlDatnpuerta(this));
      addControl(datncomp=new CtrlDatncomp(this));
      addControl(datnlocal=new CtrlDatnlocal(this));
      addControl(datnemail=new CtrlDatnemail(this));
      addControl(datnprov=new CtrlDatnprov(this));
      addControl(datncodmun=new CtrlDatncodmun(this));
      addControl(datnnommun=new CtrlDatnnommun(this));
      addControl(datncpost=new CtrlDatncpost(this));
      addControl(datntel=new CtrlDatntel(this));
      addControl(datnmovil=new CtrlDatnmovil(this));
      addControl(datnfax=new CtrlDatnfax(this));
      addControl(btnotif2=new CtrlBtnotif2(this));
      addControl(datnapcor=new CtrlDatnapcor(this));
      addControl(datnpobla=new CtrlDatnpobla(this));
      addControl(datnprov2=new CtrlDatnprov2(this));
      addControl(datncpost2=new CtrlDatncpost2(this));
      addControl(datntel2=new CtrlDatntel2(this));
      addControl(datnmovil2=new CtrlDatnmovil2(this));
      addControl(datnfax2=new CtrlDatnfax2(this));
      setSelect(snif);
      }
    }
    
  public class FormVsocial extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void onEdit() {
      super.onEdit();
      vdomicilios.btfiscal.setEnabled(true);
      vnotificaciones.btnotif1.setEnabled(true);
      vnotificaciones.btnotif2.setEnabled(true);
      vsocial.btsocial.setEnabled(true);
    }
    
    // Fin declaraciones globales
    // Controles
    public CtrlBtsocial btsocial;
    public CtrlDatsftvia datsftvia;
    public CtrlDatsvia datsvia;
    public CtrlDatstnum datstnum;
    public CtrlDatsnum datsnum;
    public CtrlDatscalnum datscalnum;
    public CtrlDatsbloque datsbloque;
    public CtrlDatsportal datsportal;
    public CtrlDatsescal datsescal;
    public CtrlDatsplanta datsplanta;
    public CtrlDatspuerta datspuerta;
    public CtrlDatscomp datscomp;
    public CtrlDatslocal datslocal;
    public CtrlDatsemail datsemail;
    public CtrlDatsprov datsprov;
    public CtrlDatscodmun datscodmun;
    public CtrlDatsnommun datsnommun;
    public CtrlDatscpost datscpost;
    public CtrlDatstel datstel;
    public CtrlDatsmovil datsmovil;
    public CtrlDatsfax datsfax;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        }
      }
      
    public class CtrlBtsocial extends ControlButton
      {
      public CtrlBtsocial(Form form)
        {
        super(form);
        setName("btsocial");
        setTitle("Importar del domicilio fiscal");
        setTitle("Importar del domicilio fiscal");
        }
      public void onClick()
        {
        super.onClick();
        datsftvia  .setValue(vdomicilios.datfftvia   );
        datsvia    .setValue(vdomicilios.datfvia   );
        datstnum   .setValue(vdomicilios.datftnum  );
        datsnum    .setValue(vdomicilios.datfnum   );
        datscalnum .setValue(vdomicilios.datfcalnum);
        datsbloque .setValue(vdomicilios.datfbloque);
        datsportal .setValue(vdomicilios.datfportal);
        datsescal  .setValue(vdomicilios.datfescal );
        datsplanta .setValue(vdomicilios.datfplanta);
        datspuerta .setValue(vdomicilios.datfpuerta);
        datscomp   .setValue(vdomicilios.datfcomp  );
        datslocal  .setValue(vdomicilios.datflocal );
        datsemail  .setValue(vdomicilios.datfemail );
        datsprov   .setValue(vdomicilios.datfprov  );
        datscodmun .setValue(vdomicilios.datfcodmun);
        datsnommun .setValue(vdomicilios.datfnommun);
        datscpost  .setValue(vdomicilios.datfcpost );
        datstel    .setValue(vdomicilios.datftel   );
        datsmovil  .setValue(vdomicilios.datfmovil );
        datsfax    .setValue(vdomicilios.datffax   );
        datscodmun.pickup.provincia=datsprov.getInteger();
        datscodmun.refresh();
        
        }
      }
      
    public class CtrlDatsftvia extends ControlComboBox
      {
      public mae.easp.general.pktipovias.PickPktipovias pickup;
      public CtrlDatsftvia(Form form)
        {
        super(form);
        setName("datsftvia");
        setTitle("Tipo de Via");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pktipovias.PickPktipovias(this));
        setLength(5);
        setDescriptionShow(false);
        setField(snif.datsftvia);
        }
      }
      
    public class CtrlDatsvia extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(30);
          }
        }
        
      public CtrlDatsvia(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datsvia");
        setTitle("Nombre de Via");
        setType(STRING);
        setMaskInput("U");
        setLength(50);
        setField(snif.datsvia);
        }
      }
      
    public class CtrlDatstnum extends ControlComboBox
      {
      public mae.easp.general.pkvalores.PickPkvalores pickup;
      public CtrlDatstnum(Form form)
        {
        super(form);
        setName("datstnum");
        setTitle("Tipo Num");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkvalores.PickPkvalores(this));
        setLength(3);
        setDescriptionShow(false);
        setField(snif.datstnum);
        }
      }
      
    public class CtrlDatsnum extends ControlEdit
      {
      public CtrlDatsnum(Form form)
        {
        super(form);
        setName("datsnum");
        setTitle("Num casa");
        setType(INTEGER);
        setLength(5);
        setField(snif.datsnum);
        }
      }
      
    public class CtrlDatscalnum extends ControlComboBox
      {
      public mae.easp.general.pkvalores.PickPkvalores pickup;
      public CtrlDatscalnum(Form form)
        {
        super(form);
        setName("datscalnum");
        setTitle("Calif. Numero");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkvalores.PickPkvalores(this));
        setLength(3);
        setDescriptionShow(false);
        setField(snif.datscalnum);
        }
      }
      
    public class CtrlDatsbloque extends ControlEdit
      {
      public CtrlDatsbloque(Form form)
        {
        super(form);
        setName("datsbloque");
        setTitle("Bloque");
        setType(STRING);
        setLength(3);
        setField(snif.datsbloque);
        }
      }
      
    public class CtrlDatsportal extends ControlEdit
      {
      public CtrlDatsportal(Form form)
        {
        super(form);
        setName("datsportal");
        setTitle("Portal");
        setType(STRING);
        setLength(3);
        setField(snif.datsportal);
        }
      }
      
    public class CtrlDatsescal extends ControlEdit
      {
      public CtrlDatsescal(Form form)
        {
        super(form);
        setName("datsescal");
        setTitle("Escalera");
        setType(STRING);
        setLength(3);
        setField(snif.datsescal);
        }
      }
      
    public class CtrlDatsplanta extends ControlEdit
      {
      public CtrlDatsplanta(Form form)
        {
        super(form);
        setName("datsplanta");
        setTitle("Planta");
        setType(STRING);
        setLength(3);
        setField(snif.datsplanta);
        }
      }
      
    public class CtrlDatspuerta extends ControlEdit
      {
      public CtrlDatspuerta(Form form)
        {
        super(form);
        setName("datspuerta");
        setTitle("Puerta");
        setType(STRING);
        setLength(3);
        setField(snif.datspuerta);
        }
      }
      
    public class CtrlDatscomp extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(20);
          }
        }
        
      public CtrlDatscomp(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datscomp");
        setMessageHelp("Complemento de domicilio");
        setTitle("Complemento");
        setType(STRING);
        setLength(40);
        setField(snif.datscomp);
        }
      }
      
    public class CtrlDatslocal extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(20);
          }
        }
        
      public CtrlDatslocal(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datslocal");
        setTitle("Localidad");
        setType(STRING);
        setMaskInput("U");
        setLength(30);
        setField(snif.datslocal);
        }
      }
      
    public class CtrlDatsemail extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(25);
          }
        }
        
      public CtrlDatsemail(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datsemail");
        setTitle("E-mail");
        setType(STRING);
        setLength(100);
        setField(snif.datsemail);
        }
      }
      
    public class CtrlDatsprov extends ControlComboBox
      {
      public mae.easp.general.pkprovincia.PickPkprovincia pickup;
      public CtrlDatsprov(Form form)
        {
        super(form);
        setName("datsprov");
        setTitle("Provincia");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkprovincia.PickPkprovincia(this));
        setLength(2);
        setField(snif.datsprov);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange(Value v) {
          super.userChange(v);
          datsnommun.setNull();
          datscodmun.setNull();
          datscodmun.pickup.provincia=getInteger();
          datscodmun.refresh();
          datscpost.setNull();
          datscpost.setValue(Numero.format(getInteger(),"00"));
        
        }
      }
      
    public class CtrlDatscodmun extends ControlComboBox
      {
      public mae.easp.general.pkmuni347.PickPkmuni347 pickup;
      public CtrlDatscodmun(Form form)
        {
        super(form);
        setName("datscodmun");
        setTitle("C�digo Municipio");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkmuni347.PickPkmuni347(this));
        setLength(5);
        setRestricted(false);
        setDescriptionShow(false);
        setField(snif.datscodmun);
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange(Value v) {
          super.userChange(v);
          datsnommun.setValue(getNomMuni(getString()));
        }
      }
      
    public class CtrlDatsnommun extends ControlEdit
      {
      public CtrlDatsnommun(Form form)
        {
        super(form);
        setName("datsnommun");
        setTitle("Nombre Municipio");
        setType(STRING);
        setLength(30);
        setEnabled(false);
        setField(snif.datsnommun);
        }
      }
      
    public class CtrlDatscpost extends ControlEdit
      {
      public CtrlDatscpost(Form form)
        {
        super(form);
        setName("datscpost");
        setTitle("C. Postal");
        setType(STRING);
        setLength(5);
        setField(snif.datscpost);
        }
      public boolean  valid()
        {
        if (getString().length()!=5) {
          setMessageWarning("Un c�digo postal ha de constar de 5 d�gitos");
          return false;
        }
        else {
          return getString().substring(0,2).equals(Numero.format(datsprov.getInteger(),"00"));
        }
        }
      }
      
    public class CtrlDatstel extends ControlEdit
      {
      public CtrlDatstel(Form form)
        {
        super(form);
        setName("datstel");
        setTitle("Tel�fono");
        setType(INTEGER);
        setLength(9);
        setField(snif.datstel);
        }
      }
      
    public class CtrlDatsmovil extends ControlEdit
      {
      public CtrlDatsmovil(Form form)
        {
        super(form);
        setName("datsmovil");
        setTitle("M�vil");
        setType(INTEGER);
        setLength(9);
        setField(snif.datsmovil);
        }
      }
      
    public class CtrlDatsfax extends ControlEdit
      {
      public CtrlDatsfax(Form form)
        {
        super(form);
        setName("datsfax");
        setTitle("Fax");
        setType(INTEGER);
        setLength(9);
        setField(snif.datsfax);
        }
      }
      
    public FormVsocial(ProgPrdomicilios prdomicilios)
      {
      super(prdomicilios);
      setName("vsocial");
      setTitle("Domicilio social");
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setUnique(true);
      addControl(btsocial=new CtrlBtsocial(this));
      addControl(datsftvia=new CtrlDatsftvia(this));
      addControl(datsvia=new CtrlDatsvia(this));
      addControl(datstnum=new CtrlDatstnum(this));
      addControl(datsnum=new CtrlDatsnum(this));
      addControl(datscalnum=new CtrlDatscalnum(this));
      addControl(datsbloque=new CtrlDatsbloque(this));
      addControl(datsportal=new CtrlDatsportal(this));
      addControl(datsescal=new CtrlDatsescal(this));
      addControl(datsplanta=new CtrlDatsplanta(this));
      addControl(datspuerta=new CtrlDatspuerta(this));
      addControl(datscomp=new CtrlDatscomp(this));
      addControl(datslocal=new CtrlDatslocal(this));
      addControl(datsemail=new CtrlDatsemail(this));
      addControl(datsprov=new CtrlDatsprov(this));
      addControl(datscodmun=new CtrlDatscodmun(this));
      addControl(datsnommun=new CtrlDatsnommun(this));
      addControl(datscpost=new CtrlDatscpost(this));
      addControl(datstel=new CtrlDatstel(this));
      addControl(datsmovil=new CtrlDatsmovil(this));
      addControl(datsfax=new CtrlDatsfax(this));
      setSelect(snif);
      }
    }
    
  public ProgPrdomicilios()
    {
    this.prdomicilios=this;
    setName("prdomicilios");
    setTitle("GESTI�N DE DOMICILIOS");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vdomicilios=new FormVdomicilios(this));
    addForm(vnotificaciones=new FormVnotificaciones(this));
    addForm(vsocial=new FormVsocial(this));
    }
  public ProgPrdomicilios(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    setConnection(Easp.connEA);
    if (gNif == null || gNif.trim().length()==0) Maefc.message("Error al iniciar la Gesti�n de Domicilios.","�Atenci�n!",Maefc.ERROR_MESSAGE);
    else {
      setModal(true);
      LocationWindow lw=new LocationWindow();
      lw.setWidth(790);
      lw.setHeight(480);
      lw.setLocation(lw.CENTER);
      setLocation(lw);
    
      setLayout(new LayoutTabbed());
    
      LocationTabbed loc = new LocationTabbed();
      loc.setExitIcon(false);
      loc.setTitle ("Domicilio Fiscal");
      vdomicilios.setLocation(loc);
      vdomicilios.setLayout(new LayoutHtml("mae/easp/html/domicilios.html"));
        
      loc=new LocationTabbed();
      loc.setExitIcon(false);
      loc.setTitle ("Domicilio Notificaciones");
      vnotificaciones.setLocation(loc);
      vnotificaciones.setLayout(new LayoutHtml("mae/easp/html/notificaciones.html"));
    
      loc=new LocationTabbed();
      loc.setExitIcon(false);
      loc.setTitle ("Domicilio Social");
      vsocial.setLocation(loc);
      vsocial.setLayout(new LayoutHtml("mae/easp/html/social.html"));
    
    
      super.onInit();
    }
    
    }
  }
  
