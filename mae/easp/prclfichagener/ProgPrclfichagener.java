// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20131119
// Hora:             16:42:07
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prclfichagener;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prclfichagener
// Nombre:   Ficha general
// Versión:  4.1
// 
public class ProgPrclfichagener extends Program
  {
  public AppEasp easp;
  public ProgPrclfichagener prclfichagener;
  // Inicio declaraciones globales
  public boolean alta=false;
  public boolean altadp=false;
  public int modo=0;
  public String vnifcif=null;
  public String aplicacion=null;
  public String codiCDP=null;
  public boolean esDP=false;
  
  public int nuevoCodiCDP=0;
  
  public boolean tieneJISS=false;
  public boolean tieneJEO=false;
  public boolean tieneJRENTA = false;
  public boolean tieneJCONTA=false;
  
  
  DBConnection connJNomina=null;
  
  boolean tieneJGestion = false ;
  
  
  //Globales
  
  public void abrirVNifes(int modo) {
    mae.easp.prtratamnifes.ProgPrtratamnifes pr=new mae.easp.prtratamnifes.ProgPrtratamnifes();
    pr.setConnection(Easp.connEA);
    pr.aplicacion=aplicacion;
    pr.vnifcif=vnifcif;
    pr.alta=alta;
    pr.modo=modo;
    pr.codiCDP=codiCDP;
    pr.setModal(true);
    LocationWindow loc=new LocationWindow();
    loc.setWidth(800);
    //if (esDP)
      loc.setHeight(520);
    //else
    //  loc.setHeight(380);
    loc.setLocation(loc.CENTER);
    pr.setLocation(loc);
    pr.run();
    }
  
  public void abrirVCDP(int modo) {
    mae.easp.prtratamcdp.ProgPrtratamcdp pr=new mae.easp.prtratamcdp.ProgPrtratamcdp();
    pr.setConnection(Easp.connEA);
    pr.aplicacion=aplicacion;
    pr.vnifcif=vnifcif;
    pr.alta=alta;
    pr.modo=modo;
    pr.codiCDP=codiCDP;
    pr.setModal(true);
    LocationWindow loc=new LocationWindow();
    loc.setWidth(700);
    loc.setHeight(250);
    loc.setLocation(loc.CENTER);
    pr.setLocation(loc);
    pr.run();
  }
  
  //fin globales
  
  // Fin declaraciones globales
  // Ventana
  public FormVdatosafiliacio vdatosafiliacio;
  // Selects
  public Sgeneral sgeneral;
  public Sdp sdp;
  // Ventana
  public FormVdomicilioenv vdomicilioenv;
  // Selects
  // Ventana
  public FormVdatosbancarios vdatosbancarios;
  // Selects
  public Sbancocli sbancocli;
  public Sbancos sbancos;
  public Sasignaciones sasignaciones;
  public Sbancocliutil sbancocliutil;
  public Sbancocliutil2 sbancocliutil2;
  public Sasignautil sasignautil;
  public Sasignautil2 sasignautil2;
  // Ventana
  public FormValtadatosbanc valtadatosbanc;
  // Selects
  public Sbancoclicanvi sbancoclicanvi;
  // Ventana
  public FormVrepresent vrepresent;
  // Selects
  public Snifrep snifrep;
  public Srepre srepre;
  // Ventana
  public FormVcargorepre vcargorepre;
  // Selects
  // Ventana
  public FormVnifes vnifes;
  // Selects
  public Snifes snifes;
  public Snumeraciones snumeraciones;
  public Snumcheck snumcheck;
  // Ventana
  public FormVcdp vcdp;
  // Selects
  public Snifcdp snifcdp;
  // Ventana
  public FormVservicios vservicios;
  // Selects
  public Sservicioscdp sservicioscdp;
  // Ventana
  public FormVcontrasenya vcontrasenya;
  // Selects
  // Ventana
  public FormVserviciosdet vserviciosdet;
  // Selects
  public Sservicios sservicios;
  // Ventana
  public FormVnifrepresentan vnifrepresentan;
  // Selects
  public Snifrepresentan snifrepresentan;
  // Ventana
  public FormVcambiobanco vcambiobanco;
  // Selects
  // Ventana
  public FormVcendbancos vcendbancos;
  // Selects
  public Scendbancos scendbancos;
  // Ventana
  public FormVdomi vdomi;
  // Selects
  public Sdomi sdomi;
  public Sfichageneral sfichageneral;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Ficha general");
      }
    }
    
  public class FormVdatosafiliacio extends MonoDataForm
    {
    // Inicio declaraciones globales
    //public String nouCodiCdp=null;
    //public String codiCDP=null;
    
    public void onOpened(){
      super.onOpened();
      vdomicilioenv.run();
    /*
      vdatosbancarios.run();
      vrepresentantes.run();
    */
      }
    
    public void onEdit(){
      modo=20;
      //vnifes.open();
      abrirVNifes(20);
      doShow();
      }
    
    public void onInsert(){
      modo=1;
      vnifcif=null;
      //vnifes.open();
      abrirVNifes(1);
      doShow();
      }
    // Fin declaraciones globales
    // Controles
    public CtrlDanifcif danifcif;
    public CtrlVcliente vcliente;
    public CtrlDatfisicajuri datfisicajuri;
    public CtrlDatemail datemail;
    public CtrlDattel dattel;
    public CtrlDatfax datfax;
    public CtrlDatmovil datmovil;
    public CtrlVadministracio vadministracio;
    public CtrlCdpcodi cdpcodi;
    public CtrlCdpcdprel cdpcdprel;
    // Acciones
    class Location extends LocationSplit
      {
      public Location( )
        {
        super();
        setLocation(TOP);
        }
      }
      
    public class CtrlDanifcif extends ControlEdit
      {
      public CtrlDanifcif(Form form)
        {
        super(form);
        setName("danifcif");
        setMessageHelp("NIF/CIF");
        setTitle("");
        setType(STRING);
        setMaskInput("U");
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        setField(sgeneral.danifcif);
        }
      }
      
    public class CtrlVcliente extends ControlEdit
      {
      public CtrlVcliente(Form form)
        {
        super(form);
        setName("vcliente");
        setTitle("");
        setType(STRING);
        setLength(45);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlDatfisicajuri extends ControlEdit
      {
      public CtrlDatfisicajuri(Form form)
        {
        super(form);
        setName("datfisicajuri");
        setMessageHelp("Física / Jurídica");
        setTitle("");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setEnabled(false);
        setPrintable(false);
        setField(sgeneral.datfisicajuri);
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
        setMessageHelp("E-mail");
        setTitle("");
        setType(STRING);
        setLength(100);
        setEnabled(false);
        setPrintable(false);
        setField(sgeneral.datemail);
        }
      }
      
    public class CtrlDattel extends ControlEdit
      {
      public CtrlDattel(Form form)
        {
        super(form);
        setName("dattel");
        setMessageHelp("Teléfono");
        setTitle("");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        setField(sgeneral.dattel);
        }
      }
      
    public class CtrlDatfax extends ControlEdit
      {
      public CtrlDatfax(Form form)
        {
        super(form);
        setName("datfax");
        setMessageHelp("Fax");
        setTitle("");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        setField(sgeneral.datfax);
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
        setField(sgeneral.datmovil);
        }
      }
      
    public class CtrlVadministracio extends ControlEdit
      {
      public CtrlVadministracio(Form form)
        {
        super(form);
        setName("vadministracio");
        setTitle("");
        setType(STRING);
        setLength(5);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlCdpcodi extends ControlEdit
      {
      public CtrlCdpcodi(Form form)
        {
        super(form);
        setName("cdpcodi");
        setMessageHelp("Código del cliente");
        setTitle("");
        setType(STRING);
        setLength(12);
        setEnabled(false);
        setPrintable(false);
        setField(sgeneral.cdpcodi);
        }
      }
      
    public class CtrlCdpcdprel extends ControlComboBox
      {
      public mae.easp.general.pkcdp.PickPkcdp pickup;
      public CtrlCdpcdprel(Form form)
        {
        super(form);
        setName("cdpcdprel");
        setMessageHelp("Código de empresa con el que se relaciona");
        setTitle("Relacionado con");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
        setLength(12);
        setPrintable(false);
        setField(sgeneral.cdpcdprel);
        }
      }
      
    public FormVdatosafiliacio(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vdatosafiliacio");
      setTitle("Datos generales del cliente");
      setLocation(new Location());
      setStates(SHOW | UPDATE | INSERT);
      setUnique(true);
      addSelect(sgeneral=new Sgeneral());
      addSelect(sdp=new Sdp());
      addControl(danifcif=new CtrlDanifcif(this));
      addControl(vcliente=new CtrlVcliente(this));
      addControl(datfisicajuri=new CtrlDatfisicajuri(this));
      addControl(datemail=new CtrlDatemail(this));
      addControl(dattel=new CtrlDattel(this));
      addControl(datfax=new CtrlDatfax(this));
      addControl(datmovil=new CtrlDatmovil(this));
      addControl(vadministracio=new CtrlVadministracio(this));
      addControl(cdpcodi=new CtrlCdpcodi(this));
      addControl(cdpcdprel=new CtrlCdpcdprel(this));
      setSelect(sgeneral);
      }
    public void onInit()
      {
      vdatosafiliacio.setTitle("Datos de la afiliación");
      vdatosafiliacio.setUniqueInsert(false);
      cdpcdprel.setDescriptionLength(20);
      super.onInit();
      
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      vcliente.setValue(Easp.componerCliente(sgeneral.datnombre.getString(),
                                              sgeneral.datapell1.getString(),
                                              sgeneral.datapell2.getString()));
      vadministracio.setValue(Util.formateoNumero("00",sgeneral.cdpaeatdele.getInteger())+Util.formateoNumero("000",sgeneral.cdpaeatadm.getInteger()));
      
      }
    }
    
  // Select principal
  public class Sgeneral extends Select
    {
    // Tablas
    public Cdp cdp;
    public Nifes nifes;
    // Campos
    public Field cdpaeatadm;
    public Field cdpaeatdele;
    public Field cdpagpi;
    public Field cdpcdprel;
    public Field cdpckconta;
    public Field cdpckeo;
    public Field cdpckgestion;
    public Field cdpckiss;
    public Field cdpcknomina;
    public Field cdpckrenta;
    public Field cdpcodi;
    public Field cdpdominio;
    public Field cdpnifcif;
    public Field cdppwd;
    public Field cdppwdacc;
    public Field cdpref;
    public Field danifcif;
    public Field dat1eprov;
    public Field dat1prov;
    public Field dataltaen;
    public Field datapell1;
    public Field datapell2;
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
    public Field datipo;
    public Field datletra;
    public Field datmovil;
    public Field datmuni;
    public Field datnacional;
    public Field datnombre;
    public Field datnum;
    public Field datpais;
    public Field datpiso;
    public Field datpobla;
    public Field datprov;
    public Field datsiglas;
    public Field dattel;
    public Field datvia;
    class Cdp extends Table
      {
      public Cdp(Select select)
        {
        super(select);
        setName("cdp");
        setOptions(READ);
        }
      }
      
    class Nifes extends Table
      {
      public Nifes(Select select)
        {
        super(select);
        setName("nifes");
        setOptions(READ | UPDATE);
        }
      }
      
    public Sgeneral()
      {
      setName("sgeneral");
      addTable(cdp=new Cdp(this));
      addTable(nifes=new Nifes(this));
      addField(cdpaeatadm=new Field(this,cdp,"cdpaeatadm"));
      addField(cdpaeatdele=new Field(this,cdp,"cdpaeatdele"));
      addField(cdpagpi=new Field(this,cdp,"cdpagpi"));
      addField(cdpcdprel=new Field(this,cdp,"cdpcdprel"));
      addField(cdpckconta=new Field(this,cdp,"cdpckconta"));
      addField(cdpckeo=new Field(this,cdp,"cdpckeo"));
      addField(cdpckgestion=new Field(this,cdp,"cdpckgestion"));
      addField(cdpckiss=new Field(this,cdp,"cdpckiss"));
      addField(cdpcknomina=new Field(this,cdp,"cdpcknomina"));
      addField(cdpckrenta=new Field(this,cdp,"cdpckrenta"));
      addField(cdpcodi=new Field(this,cdp,"cdpcodi"));
      addField(cdpdominio=new Field(this,cdp,"cdpdominio"));
      addField(cdpnifcif=new Field(this,cdp,"cdpnifcif"));
      addField(cdppwd=new Field(this,cdp,"cdppwd"));
      addField(cdppwdacc=new Field(this,cdp,"cdppwdacc"));
      addField(cdpref=new Field(this,cdp,"cdpref"));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      addField(dat1eprov=new Field(this,nifes,"dateprov"));
      addField(dat1prov=new Field(this,nifes,"datprov"));
      addField(dataltaen=new Field(this,nifes,"dataltaen"));
      addField(datapell1=new Field(this,nifes,"datapell1"));
      addField(datapell2=new Field(this,nifes,"datapell2"));
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
      addField(datipo=new Field(this,nifes,"datipo"));
      addField(datletra=new Field(this,nifes,"datletra"));
      addField(datmovil=new Field(this,nifes,"datmovil"));
      addField(datmuni=new Field(this,nifes,"datmuni"));
      addField(datnacional=new Field(this,nifes,"datnacional"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      addField(datnum=new Field(this,nifes,"datnum"));
      addField(datpais=new Field(this,nifes,"datpais"));
      addField(datpiso=new Field(this,nifes,"datpiso"));
      addField(datpobla=new Field(this,nifes,"datpobla"));
      addField(datprov=new Field(this,nifes,"datprov"));
      addField(datsiglas=new Field(this,nifes,"datsiglas"));
      addField(dattel=new Field(this,nifes,"dattel"));
      addField(datvia=new Field(this,nifes,"datvia"));
      }
    public String getWhere()
      {
      return "cdpcodi='"+codiCDP+"'";
      }
    }
    
  // select para ver si la tabla dp está vacía
  public class Sdp extends Select
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
        setOptions(READ);
        }
      }
      
    public Sdp()
      {
      setName("sdp");
      addTable(dp=new Dp(this));
      addField(dpcodigo=new Field(this,dp,"dpcodigo"));
      addField(dpnifcif=new Field(this,dp,"dpnifcif"));
      }
    }
    
  public class FormVdomicilioenv extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void onOpened(){
      btcopiardatos.setEnabled(false);
      super.onOpened();
      datcontacto.activate();
      }
    
    public void onEdit(){
      super.onEdit();
      btcopiardatos.setEnabled(true);
      }
    
    public boolean onCancel(){
      btcopiardatos.setEnabled(false);
      return super.onCancel();
      }
    
    public void onShow(){
      super.onShow();
      btcopiardatos.setEnabled(false);
      }
    // Fin declaraciones globales
    // Controles
    public CtrlDatcontacto datcontacto;
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
    public CtrlDateatt dateatt;
    public CtrlDatesiglas datesiglas;
    public CtrlDatevia datevia;
    public CtrlDatenum datenum;
    public CtrlDateesc dateesc;
    public CtrlDatepiso datepiso;
    public CtrlDateletra dateletra;
    public CtrlDateprov dateprov;
    public CtrlDatemuni datemuni;
    public CtrlDatepobla datepobla;
    public CtrlDatecpos datecpos;
    public CtrlDatepais datepais;
    public CtrlBtcopiardatos btcopiardatos;
    // Acciones
    public LinkAdomicilios adomicilios;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(1);
        setTitle("Datos de la afiliación");
        setModal(true);
        }
      }
      
    public class CtrlDatcontacto extends ControlEdit
      {
      public CtrlDatcontacto(Form form)
        {
        super(form);
        setName("datcontacto");
        setTitle("");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        setField(sgeneral.datcontacto);
        }
      }
      
    public class CtrlDatsiglas extends ControlComboBox
      {
      public mae.easp.general.pksiglas.PickPksiglas pickup;
      public CtrlDatsiglas(Form form)
        {
        super(form);
        setName("datsiglas");
        setTitle("");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pksiglas.PickPksiglas(this));
        setLength(2);
        setPrintable(false);
        setDescriptionShow(false);
        setField(sgeneral.datsiglas);
        }
      }
      
    public class CtrlDatvia extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(40);
          }
        }
        
      public CtrlDatvia(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datvia");
        setTitle("");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(sgeneral.datvia);
        }
      }
      
    public class CtrlDatnum extends ControlEdit
      {
      public CtrlDatnum(Form form)
        {
        super(form);
        setName("datnum");
        setTitle("");
        setType(STRING);
        setLength(6);
        setPrintable(false);
        setField(sgeneral.datnum);
        }
      }
      
    public class CtrlDatesc extends ControlEdit
      {
      public CtrlDatesc(Form form)
        {
        super(form);
        setName("datesc");
        setTitle("");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(sgeneral.datesc);
        }
      }
      
    public class CtrlDatpiso extends ControlEdit
      {
      public CtrlDatpiso(Form form)
        {
        super(form);
        setName("datpiso");
        setTitle("");
        setType(STRING);
        setLength(2);
        setPrintable(false);
        setField(sgeneral.datpiso);
        }
      }
      
    public class CtrlDatletra extends ControlEdit
      {
      public CtrlDatletra(Form form)
        {
        super(form);
        setName("datletra");
        setTitle("");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(sgeneral.datletra);
        }
      }
      
    public class CtrlDatprov extends ControlComboBox
      {
      public mae.easp.general.pkprovincias.PickPkprovincias pickup;
      public CtrlDatprov(Form form)
        {
        super(form);
        setName("datprov");
        setTitle("");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkprovincias.PickPkprovincias(this));
        setLength(2);
        setPrintable(false);
        setField(sgeneral.dat1prov);
        }
      public void onChange()
        {
        super.onChange();
        datmuni.pickup.smunicipios.setWhere(null);
        datmuni.pickup.provincia=getInteger();
        datmuni.pickup.smunicipios.execute();
        
        }
      }
      
    public class CtrlDatmuni extends ControlComboBox
      {
      public mae.easp.general.pkmunicipios.PickPkmunicipios pickup;
      public CtrlDatmuni(Form form)
        {
        super(form);
        setName("datmuni");
        setTitle("");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkmunicipios.PickPkmunicipios(this));
        setLength(5);
        setPrintable(false);
        setField(sgeneral.datmuni);
        }
      public void onChange()
        {
        super.onChange();
        datpobla.setValue(datmuni.pickup.smunicipios.mudesc.getString());
        }
      }
      
    public class CtrlDatpobla extends ControlEdit
      {
      public CtrlDatpobla(Form form)
        {
        super(form);
        setName("datpobla");
        setTitle("");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        setField(sgeneral.datpobla);
        }
      }
      
    public class CtrlDatcpos extends ControlEdit
      {
      public CtrlDatcpos(Form form)
        {
        super(form);
        setName("datcpos");
        setTitle("");
        setType(STRING);
        setLength(5);
        setPrintable(false);
        setField(sgeneral.datcpos);
        }
      }
      
    public class CtrlDatpais extends ControlComboBox
      {
      public mae.easp.general.pkpaises.PickPkpaises pickup;
      public CtrlDatpais(Form form)
        {
        super(form);
        setName("datpais");
        setTitle("");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkpaises.PickPkpaises(this));
        setLength(3);
        setPrintable(false);
        setField(sgeneral.datpais);
        }
      }
      
    public class CtrlDateatt extends ControlEdit
      {
      public CtrlDateatt(Form form)
        {
        super(form);
        setName("dateatt");
        setTitle("");
        setType(STRING);
        setLength(35);
        setPrintable(false);
        setField(sgeneral.dateatt);
        }
      }
      
    public class CtrlDatesiglas extends ControlComboBox
      {
      public mae.easp.general.pksiglas.PickPksiglas pickup;
      public CtrlDatesiglas(Form form)
        {
        super(form);
        setName("datesiglas");
        setTitle("");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pksiglas.PickPksiglas(this));
        setLength(2);
        setPrintable(false);
        setDescriptionShow(false);
        setField(sgeneral.datesiglas);
        }
      }
      
    public class CtrlDatevia extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(40);
          }
        }
        
      public CtrlDatevia(Form form)
        {
        super(form);
        setLook(new Look());
        setName("datevia");
        setTitle("");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(sgeneral.datevia);
        }
      }
      
    public class CtrlDatenum extends ControlEdit
      {
      public CtrlDatenum(Form form)
        {
        super(form);
        setName("datenum");
        setTitle("");
        setType(STRING);
        setLength(6);
        setPrintable(false);
        setField(sgeneral.datenum);
        }
      }
      
    public class CtrlDateesc extends ControlEdit
      {
      public CtrlDateesc(Form form)
        {
        super(form);
        setName("dateesc");
        setTitle("");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(sgeneral.dateesc);
        }
      }
      
    public class CtrlDatepiso extends ControlEdit
      {
      public CtrlDatepiso(Form form)
        {
        super(form);
        setName("datepiso");
        setTitle("");
        setType(STRING);
        setLength(2);
        setPrintable(false);
        setField(sgeneral.datepiso);
        }
      }
      
    public class CtrlDateletra extends ControlEdit
      {
      public CtrlDateletra(Form form)
        {
        super(form);
        setName("dateletra");
        setTitle("");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(sgeneral.dateletra);
        }
      }
      
    public class CtrlDateprov extends ControlComboBox
      {
      public mae.easp.general.pkprovincias.PickPkprovincias pickup;
      public CtrlDateprov(Form form)
        {
        super(form);
        setName("dateprov");
        setTitle("");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkprovincias.PickPkprovincias(this));
        setLength(2);
        setPrintable(false);
        setField(sgeneral.dat1eprov);
        }
      public void onChange()
        {
        super.onChange();
        datemuni.pickup.smunicipios.setWhere(null);
        datemuni.pickup.provincia=getInteger();
        datemuni.pickup.smunicipios.execute();
        
        }
      }
      
    public class CtrlDatemuni extends ControlComboBox
      {
      public mae.easp.general.pkmunicipios.PickPkmunicipios pickup;
      public CtrlDatemuni(Form form)
        {
        super(form);
        setName("datemuni");
        setTitle("");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkmunicipios.PickPkmunicipios(this));
        setLength(5);
        setPrintable(false);
        setField(sgeneral.datemuni);
        }
      public void onChange()
        {
        super.onChange();
        datepobla.setValue(datemuni.pickup.smunicipios.mudesc.getString());
        }
      }
      
    public class CtrlDatepobla extends ControlEdit
      {
      public CtrlDatepobla(Form form)
        {
        super(form);
        setName("datepobla");
        setTitle("");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        setField(sgeneral.datepobla);
        }
      }
      
    public class CtrlDatecpos extends ControlEdit
      {
      public CtrlDatecpos(Form form)
        {
        super(form);
        setName("datecpos");
        setTitle("");
        setType(STRING);
        setLength(5);
        setPrintable(false);
        setField(sgeneral.datecpos);
        }
      }
      
    public class CtrlDatepais extends ControlComboBox
      {
      public mae.easp.general.pkpaises.PickPkpaises pickup;
      public CtrlDatepais(Form form)
        {
        super(form);
        setName("datepais");
        setTitle("");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkpaises.PickPkpaises(this));
        setLength(3);
        setPrintable(false);
        setField(sgeneral.datepais);
        }
      }
      
    public class CtrlBtcopiardatos extends ControlButton
      {
      public CtrlBtcopiardatos(Form form)
        {
        super(form);
        setName("btcopiardatos");
        setTitle("Copiar datos para el domicilio de envío");
        setTitle("Copiar datos para el domicilio de envío");
        }
      public void onClick()
        {
        super.onClick();
        if (Maefc.message("¿Está seguro de que desea copiar los datos del domicilio "+
                                     "\ndel cliente a los datos de envío?",
                                     "Aplicar los mismos datos al domicilio de envío",
                                     Maefc.QUESTION_MESSAGE,
                                     Maefc.YES_NO_OPTION)==Maefc.YES_OPTION){
        dateprov.setValue(datprov);
        datepobla.setValue(datpobla);
        datemuni.setValue(datmuni);
        datenum.setValue(datnum);
        datepais.setValue(datpais);
        datesiglas.setValue(datsiglas);
        datevia.setValue(datvia);
        datepiso.setValue(datpiso);
        dateesc.setValue(datesc);
        dateletra.setValue(datletra);
        datecpos.setValue(datcpos);
        dateatt.setValue(datcontacto);
        }
        }
      }
      
    public class LinkAdomicilios extends Action
      {
      public LinkAdomicilios(Form form)
        {
        super(form);
        setName("adomicilios");
        setTitle("&1. Gestión de domicilios (Fiscal, notificaciones y social)");
        setOptions(SHOW);
        }
      public void onAction()
        {
        mae.easp.prdomicilios.ProgPrdomicilios pr = new mae.easp.prdomicilios.ProgPrdomicilios();
        pr.gNif = sgeneral.danifcif.getString();
        pr.run();
        vdomicilioenv.doShow();
        }
      }
      
    public FormVdomicilioenv(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vdomicilioenv");
      setTitle("Datos de la afiliación");
      setLocation(new Location());
      setStates(SHOW);
      setModal(true);
      setUnique(true);
      addControl(datcontacto=new CtrlDatcontacto(this));
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
      addControl(dateatt=new CtrlDateatt(this));
      addControl(datesiglas=new CtrlDatesiglas(this));
      addControl(datevia=new CtrlDatevia(this));
      addControl(datenum=new CtrlDatenum(this));
      addControl(dateesc=new CtrlDateesc(this));
      addControl(datepiso=new CtrlDatepiso(this));
      addControl(dateletra=new CtrlDateletra(this));
      addControl(dateprov=new CtrlDateprov(this));
      addControl(datemuni=new CtrlDatemuni(this));
      addControl(datepobla=new CtrlDatepobla(this));
      addControl(datecpos=new CtrlDatecpos(this));
      addControl(datepais=new CtrlDatepais(this));
      addControl(btcopiardatos=new CtrlBtcopiardatos(this));
      addAction(adomicilios=new LinkAdomicilios(this));
      setSelect(sgeneral);
      }
    public void onInit()
      {
      vdomicilioenv.setTitle("Domicilio de envío");
      super.onInit();
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      
      if ( datmuni.getInteger() != 0 ) {
        datmuni.pickup.provincia=datmuni.getInteger();
        datmuni.pickup.refresh();
        }
      
      if ( datemuni.getInteger() != 0 ) {
        datemuni.pickup.provincia=datemuni.getInteger();
        datemuni.pickup.refresh();
        }
      
      }
    }
    
  public class FormVdatosbancarios extends MultiDataForm
    {
    // Inicio declaraciones globales
    protected Form createEditForm(boolean insert) {
      Form form=super.createEditForm(insert);
      form.setLayout(new LayoutHtml("mae/easp/html/datosbancarios.html"));
      LocationWindow loc=(LocationWindow)form.getLocation();
      loc.setWidth(525);
      loc.setHeight(165);
      return form;
     }
    
    /*
    public void onEdit(){
      valtadatosbanc.setStates(DataForm.UPDATE | DataForm.SHOW);
      valtadatosbanc.setTitle("Modificación de datos bancarios");
      valtadatosbanc.modoinsert=false;
      valtadatosbanc.open();
      }
    
    public void onInsert(){
      valtadatosbanc.setStates(DataForm.INSERT);
      valtadatosbanc.setInitState(DataForm.INSERT); 
      valtadatosbanc.setTitle("Alta de datos bancarios");
      valtadatosbanc.modoinsert=true;
      valtadatosbanc.open();
      }
    */
    public void onSelection() {
      super.onSelection();
      int campSeleccionat=getControlTable().getSelectedColumn();
      switch (campSeleccionat) {
        case 4:
          btiva.doAction();
          break;
        case 5:
          btirpf.doAction();
          break;
        case 6:
          btpagossc.doAction();
          break;
        case 7:
          // btsegsoc.doAction();
          btliqanual.doAction();
          break;
        case 8:
          // btliqanual.doAction();
          break;
        default:
          break;
        }
      }
    /*public void onSelection() {
      super.onSelection();
      int campSeleccionat=getControlTable().getSelectedColumn();
      switch (campSeleccionat) {
        case 5:
          btiva.doAction();
          break;
        case 6:
          btirpf.doAction();
          break;
        case 7:
          btpagossc.doAction();
          break;
        case 8:
          btsegsoc.doAction();
          break;
        case 9:
          btliqanual.doAction();
          break;
        default:
          doEdit();
          break;
        }
      }*/
    
    void accionTipo(ControlCheck ck, String tipo){
      boolean result=true;
      if (ck.getBoolean())
        result=deleteAsignacion(tipo);
      else
        result=nuevaAsignacion(tipo);
      if (result) {
        sasignaciones.commit();
        refrescaVentana();
        }
      else
        sasignaciones.rollback();
      }
     
    boolean nuevaAsignacion(String tipo) {
      if (deleteAsignacion(tipo)) {
        sasignaciones.addNew();
        sasignaciones.abacodigo.setValue(sbancocli.bcccodigo);
        sasignaciones.abatipo.setValue(tipo);
        sasignaciones.ababanco.setValue(sbancocli.bccbanco);
        sasignaciones.absucursal.setValue(sbancocli.bccsucursal);
        sasignaciones.abnumero.setValue(sbancocli.bccnumero);
        sasignaciones.abadigito.setValue(sbancocli.bccdigitos);
        return sasignaciones.insert();
        }
      else
        return false;
      }
    
    boolean deleteAsignacion(String tipo){
     String cli=sbancocli.bcccodigo.getString();
     try {
       getDataBase().executeUpdate("DELETE FROM ASIGNACIONES WHERE abacodigo='"+cli+"' and abatipo='"+tipo+"'");
       return true;
       }
     catch (Exception s) {
      System.out.println("Error al eliminar registro de asignaciones.\n"+
                         "cliente: "+cli+" tipo: "+tipo+"\n"+s);
      return false;
      }
     }
    
    void refrescaVentana() {
      int filaSeleccionada=sbancocli.getCurrentRow();
      vdatosbancarios.doShow();
      getControlTable().setSelectedRow(filaSeleccionada);
      }  
    
    boolean deleteAsignaciones() {
     String client=sbancocli.bcccodigo.getString();
     try {  
       getDataBase().executeUpdate("DELETE FROM ASIGNACIONES WHERE ABACODIGO='"+client+"' and "+
                 "ababanco="+sbancocli.bccbanco.getSQLFormat()+" and "+
                 "absucursal="+sbancocli.bccsucursal.getSQLFormat()+" and "+
                 "abnumero="+sbancocli.bccnumero.getSQLFormat()+" and "+
                 "abadigito="+sbancocli.bccdigitos.getSQLFormat());
       return true;
       }
     catch (Exception s) {
       System.out.println("Error al eliminar todos los registro de asignaciones del cliente: "+client+"\n"+s);
       return false;
       }
     }
    // Fin declaraciones globales
    // Controles
    public CtrlBccbanco bccbanco;
    public CtrlBccsucursal bccsucursal;
    public CtrlBccnumero bccnumero;
    public CtrlBccdigitos bccdigitos;
    public CtrlChiva chiva;
    public CtrlChirpf chirpf;
    public CtrlChpagosc chpagosc;
    public CtrlChliqanual chliqanual;
    // Acciones
    public LinkBtiva btiva;
    public LinkBtirpf btirpf;
    public LinkBtpagossc btpagossc;
    public LinkBtliqanual btliqanual;
    public LinkBtcambiobanco btcambiobanco;
    public LinkBtrestodatos btrestodatos;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(1);
        setTitle("Datos Bancarios");
        setModal(true);
        }
      }
      
    public class CtrlBccbanco extends ColumnComboBox
      {
      public mae.easp.general.pkbancos.PickPkbancos pickup;
      public CtrlBccbanco(Form form)
        {
        super(form);
        setName("bccbanco");
        setTitle("Banco");
        setType(INTEGER);
        setMaskInput("9999");
        setPickUp(pickup=new mae.easp.general.pkbancos.PickPkbancos(this));
        setLength(4);
        setPrintable(false);
        setRestricted(false);
        setField(sbancocli.bccbanco);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlBccsucursal extends ColumnEdit
      {
      public CtrlBccsucursal(Form form)
        {
        super(form);
        setName("bccsucursal");
        setTitle("Sucursal");
        setType(INTEGER);
        setMaskInput("9999");
        setLength(4);
        setPrintable(false);
        setField(sbancocli.bccsucursal);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlBccnumero extends ColumnEdit
      {
      public CtrlBccnumero(Form form)
        {
        super(form);
        setName("bccnumero");
        setTitle("Num.");
        setType(STRING);
        setLength(10);
        setPrintable(false);
        setField(sbancocli.bccnumero);
        }
      public boolean  valid()
        {
        if (Util.isNumero(this.getString()) && this.getString().length() == 10)
          return super.valid();
        else
          return false;
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlBccdigitos extends ColumnEdit
      {
      public CtrlBccdigitos(Form form)
        {
        super(form);
        setName("bccdigitos");
        setTitle("D.C.");
        setType(INTEGER);
        setMaskInput("99");
        setLength(2);
        setPrintable(false);
        setField(sbancocli.bccdigitos);
        }
      public boolean  valid()
        {
        if (Easp.digitoIncorrecto(bccbanco.getString()
                                             ,bccsucursal.getString()
                                             ,bccnumero.getString()
                                            ,bccdigitos.getString(),"corriente")) {
        System.out.println("000001");
          return false;
          }
        else {
        System.out.println("000002");
          return super.valid(); 
          }
        
        }
      public boolean obligate()
        {
        return true;
        
        }
      }
      
    public class CtrlChiva extends ColumnCheck
      {
      public CtrlChiva(Form form)
        {
        super(form);
        setName("chiva");
        setTitle("IVA");
        }
      }
      
    public class CtrlChirpf extends ColumnCheck
      {
      public CtrlChirpf(Form form)
        {
        super(form);
        setName("chirpf");
        setMessageHelp("Retenciones practicadas");
        setTitle("IRPF");
        }
      }
      
    public class CtrlChpagosc extends ColumnCheck
      {
      public CtrlChpagosc(Form form)
        {
        super(form);
        setName("chpagosc");
        setMessageHelp("Pagos a cuentas");
        setTitle("P. cuentas");
        }
      }
      
    public class CtrlChliqanual extends ColumnCheck
      {
      public CtrlChliqanual(Form form)
        {
        super(form);
        setName("chliqanual");
        setMessageHelp("Liquidación anual RENTA/SOCIEDADES");
        setTitle("L. anual");
        }
      }
      
    public class LinkBtiva extends Action
      {
      public LinkBtiva(Form form)
        {
        super(form);
        setName("btiva");
        setTitle("&1. IVA");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        accionTipo(chiva, "300");
        
        }
      }
      
    public class LinkBtirpf extends Action
      {
      public LinkBtirpf(Form form)
        {
        super(form);
        setName("btirpf");
        setTitle("&2. IRPF");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        accionTipo(chirpf, "110");
        /*
        boolean result=true;
        if (chirpf.getBoolean())
          result=deleteAsignacion("110");
        else
          result=nuevaAsignacion("110");
        
        if (result) {
          sasignaciones.commit();
          refrescaVentana();
          }
        else
          sasignaciones.rollback();
        */
        }
      }
      
    public class LinkBtpagossc extends Action
      {
      public LinkBtpagossc(Form form)
        {
        super(form);
        setName("btpagossc");
        setTitle("&3. Pagos Cuentas");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        accionTipo(chpagosc, "130");
        /*
        boolean result=true;
        if (chpagosc.getBoolean())
          result=deleteAsignacion("130");
        else
          result=nuevaAsignacion("130");
        
        if (result) {
          sasignaciones.commit();
          refrescaVentana();
          }
        else
          sasignaciones.rollback();
        */
        }
      }
      
    public class LinkBtliqanual extends Action
      {
      public LinkBtliqanual(Form form)
        {
        super(form);
        setName("btliqanual");
        setTitle("&4. Liquidación Anual");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        accionTipo(chliqanual, "100");
        
        
        }
      }
      
    public class LinkBtcambiobanco extends Action
      {
      public LinkBtcambiobanco(Form form)
        {
        super(form);
        setName("btcambiobanco");
        setTitle("&5. Cambiar Cuenta Bancaria");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        vcambiobanco.open();
        
        }
      }
      
    public class LinkBtrestodatos extends Action
      {
      public LinkBtrestodatos(Form form)
        {
        super(form);
        setName("btrestodatos");
        setTitle("&6. Resto Datos");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        valtadatosbanc.open();
        }
      }
      
    public FormVdatosbancarios(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vdatosbancarios");
      setTitle("Datos Bancarios");
      setLocation(new Location());
      setStates(SHOW | DELETE | INSERT);
      setPrintable(false);
      setModal(true);
      addSelect(sbancocli=new Sbancocli());
      addSelect(sbancos=new Sbancos());
      addSelect(sasignaciones=new Sasignaciones());
      addSelect(sbancocliutil=new Sbancocliutil());
      addSelect(sbancocliutil2=new Sbancocliutil2());
      addSelect(sasignautil=new Sasignautil());
      addSelect(sasignautil2=new Sasignautil2());
      addControl(bccbanco=new CtrlBccbanco(this));
      addControl(bccsucursal=new CtrlBccsucursal(this));
      addControl(bccnumero=new CtrlBccnumero(this));
      addControl(bccdigitos=new CtrlBccdigitos(this));
      addControl(chiva=new CtrlChiva(this));
      addControl(chirpf=new CtrlChirpf(this));
      addControl(chpagosc=new CtrlChpagosc(this));
      addControl(chliqanual=new CtrlChliqanual(this));
      addAction(btiva=new LinkBtiva(this));
      addAction(btirpf=new LinkBtirpf(this));
      addAction(btpagossc=new LinkBtpagossc(this));
      addAction(btliqanual=new LinkBtliqanual(this));
      addAction(btcambiobanco=new LinkBtcambiobanco(this));
      addAction(btrestodatos=new LinkBtrestodatos(this));
      setSelect(sbancocli);
      }
    public void onInit()
      {
      //vdatosbancarios.getControlTable().setTableEditable(true);
      sbancocli.run(true);
      
      int nrows=sbancocli.getNumRows();
      //inicializarArray(nrows);
      int row=0;
      super.onInit();
      }
    public boolean onOkInsert()
      {
      boolean retorn = super.onOkInsert();
      
      if ( retorn && tieneJGestion ) {
        sfichageneral.setDistinct(true);
        sfichageneral.setWhere("fgcodigocdp = '"+sgeneral.cdpcodi.getString()+"'");
        sfichageneral.execute();
        while ( !sfichageneral.isEof() ) {
          sdomi.setWhere("doasesor = "+sfichageneral.fgasesor.getInteger()+" and docolectivo = 1 and docliente = '"+sfichageneral.fgcliente.getString()+"' and dobanco = '"+Numero.format(bccbanco.getInteger(),"0000")+"'  and   dooficina = '"+Numero.format(bccsucursal.getInteger(),"0000")+"'  and   docuenta  = '"+bccnumero.getString()+"' and  dodigcon = '"+Numero.format(bccdigitos.getInteger(),"00")+"'");
          sdomi.execute(); 
          if ( sdomi.isEof() ) {
            String msg = " Para este código de empresa , se ha encontrado vinculado a la ficha General de jGestión el Cliente: "+sfichageneral.fgcliente.getString()+ " del Despacho: "+sfichageneral.fgasesor.getInteger()+" \n \n ¿ Desea crear la nueva cuenta , en el apartado  de domiciliaciones de este cliente. ? ";
            if ( Maefc.message(msg,"Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION ) == Maefc.YES_OPTION ) {
      
              int contador = 1 ;
              boolean sigue = true ;
              while ( sigue ) {
                sdomi.setWhere("doasesor = "+sfichageneral.fgasesor.getInteger()+" and docolectivo = 1  and docliente = '"+sfichageneral.fgcliente.getString()+"' and docontador = "+contador);
                sdomi.execute(); 
                if ( sdomi.isEof() ) sigue = false ;
                else                 contador++;
                }
      
              sdomi.addNew();
              sdomi.doasesor       .setValue(sfichageneral.fgasesor);
              sdomi.docolectivo    .setValue(1);
              sdomi.docliente      .setValue(sfichageneral.fgcliente.getString());
              sdomi.docontador     .setValue(contador);
              sdomi.dobanco        .setValue(Numero.format(bccbanco.getInteger(),"0000"));
              // sdomi.donombre       .setValue();
              sdomi.doentidad      .setValue(Numero.format(bccbanco.getInteger(),"0000"));
              sdomi.dooficina      .setValue(Numero.format(bccsucursal.getInteger(),"0000"));
              sdomi.dodigcon       .setValue(Numero.format(bccdigitos.getInteger(),"00"));
              sdomi.docuenta       .setValue(bccnumero.getString());
      
              sdomi.insert();
              sdomi.commit();
              }
            }
          sfichageneral.next();
          }
       
        }
      
      
      
      return retorn ;
      }
    public boolean onOkDelete()
      {
      boolean esPotBorrar = true;
      if (tieneJISS && (chirpf.getBoolean() || chpagosc.getBoolean() || chliqanual.getBoolean())) {
         if (Maefc.NO_OPTION==Maefc.message("Es cliente de jSociedades y estos datos bancarios se\nutilizan para obtener los Impuestos de Sociedades.  \n\n¿Está seguro que desea eliminar estos datos.?","Atención",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION))
              esPotBorrar = false;
      }
      if (esPotBorrar && tieneJEO && (chiva.getBoolean() || chirpf.getBoolean() || chpagosc.getBoolean() || chliqanual.getBoolean())) {
         if (Maefc.NO_OPTION==Maefc.message("Es cliente de jEstimación y estos datos bancarios se\nutilizan para obtener los Impuestos de IVA e IRPF.  \n\n¿Está seguro que desea eliminar estos datos.?","Atención",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION))
              esPotBorrar = false;
      }
      if (esPotBorrar && tieneJCONTA && (chiva.getBoolean() || chirpf.getBoolean() || chpagosc.getBoolean() || chliqanual.getBoolean())) {
         if (Maefc.NO_OPTION==Maefc.message("Es cliente de jConta y estos datos bancarios se   \nutilizan para obtener los Impuestos de IVA e IRPF.\n\n¿Está seguro que desea eliminar estos datos.?","Atención",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION))
              esPotBorrar = false;
      }
      if (esPotBorrar && tieneJRENTA && chliqanual.getBoolean()) {
         if (Maefc.NO_OPTION==Maefc.message("Es cliente de jRenta y estos datos bancarios se utilizan\npara obtener los Impuestos de Renta y Patrimonio.       \n\n¿Está seguro que desea eliminar estos datos.?","Atención",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION))
              esPotBorrar = false;
      }
      if (esPotBorrar && deleteAsignaciones())
        return super.onOkDelete();
      else
        return false;
      
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      sbancos.execute();
      // vvdesbanc.setValue(sbancos.bndesc.getString());
      String tipus;
      chiva.setValue(false);
      chirpf.setValue(false);
      chpagosc.setValue(false);
      // chsegsoc.setValue(false);
      chliqanual.setValue(false);
      
      sasignaciones.execute();
      while (!sasignaciones.isEof()){
        tipus=sasignaciones.abatipo.getString();
        if (tipus.equals("300"))
          chiva.setValue(true);
        else if (tipus.equals("110"))
          chirpf.setValue(true);
        else if (tipus.equals("130"))
          chpagosc.setValue(true);
        // else if (tipus.equals("TCS"))
        //  chsegsoc.setValue(true);
        else if (tipus.equals("100"))
          chliqanual.setValue(true);
        sasignaciones.next();
        }
      
      }
    }
    
  // Bancos
  public class Sbancocli extends Select
    {
    // Tablas
    public Bancocli bancocli;
    // Campos
    public Field bccbanco;
    public Field bcccodigo;
    public Field bccdigitos;
    public Field bccnumero;
    public Field bccsucursal;
    class Bancocli extends Table
      {
      public Bancocli(Select select)
        {
        super(select);
        setName("bancocli");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        sbancocli.bcccodigo.setValue(codiCDP);
        return super.onInsert();
        
        }
      }
      
    public Sbancocli()
      {
      setName("sbancocli");
      addTable(bancocli=new Bancocli(this));
      addField(bccbanco=new Field(this,bancocli,"bccbanco"));
      addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
      addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
      addField(bccnumero=new Field(this,bancocli,"bccnumero"));
      addField(bccsucursal=new Field(this,bancocli,"bccsucursal"));
      }
    public String getWhere()
      {
      return "bcccodigo="+sgeneral.cdpcodi.getSQLFormat();
      }
    }
    
  // select para saber la descripción de un banco
  public class Sbancos extends Select
    {
    // Tablas
    public Banco banco;
    // Campos
    public Field bncodigo;
    public Field bndesc;
    class Banco extends Table
      {
      public Banco(Select select)
        {
        super(select);
        setName("banco");
        setOptions(READ);
        }
      }
      
    public Sbancos()
      {
      setName("sbancos");
      addTable(banco=new Banco(this));
      addField(bncodigo=new Field(this,banco,"bncodigo"));
      addField(bndesc=new Field(this,banco,"bndesc"));
      }
    public String getWhere()
      {
      return "bncodigo="+sbancocli.bccbanco.getSQLFormat();
      }
    }
    
  // 
  public class Sasignaciones extends Select
    {
    // Tablas
    public Asignaciones asignaciones;
    // Campos
    public Field ababanco;
    public Field abacodigo;
    public Field abadigito;
    public Field abatipo;
    public Field abnumero;
    public Field absucursal;
    class Asignaciones extends Table
      {
      public Asignaciones(Select select)
        {
        super(select);
        setName("asignaciones");
        setOptions(READ | INSERT | DELETE);
        }
      }
      
    public Sasignaciones()
      {
      setName("sasignaciones");
      addTable(asignaciones=new Asignaciones(this));
      addField(ababanco=new Field(this,asignaciones,"ababanco"));
      addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
      addField(abadigito=new Field(this,asignaciones,"abadigito"));
      addField(abatipo=new Field(this,asignaciones,"abatipo"));
      addField(abnumero=new Field(this,asignaciones,"abnumero"));
      addField(absucursal=new Field(this,asignaciones,"absucursal"));
      }
    public String getWhere()
      {
      return "abacodigo="+sbancocli.bcccodigo.getSQLFormat()+" and "+
             "ababanco="+sbancocli.bccbanco.getSQLFormat()+" and "+
             "absucursal="+sbancocli.bccsucursal.getSQLFormat()+" and "+
             "abnumero="+sbancocli.bccnumero.getSQLFormat()+" and "+
             "abadigito="+sbancocli.bccdigitos.getSQLFormat();
      }
    }
    
  // 
  public class Sbancocliutil extends Select
    {
    // Tablas
    public Bancocli bancocli;
    // Campos
    public Field bccbanco;
    public Field bcccodigo;
    public Field bcccodmuni;
    public Field bcccodpostal;
    public Field bccdigitos;
    public Field bccdominio;
    public Field bccescalera;
    public Field bccletra;
    public Field bccnum;
    public Field bccnumero;
    public Field bccpiso;
    public Field bccpoblacion;
    public Field bccprovincia;
    public Field bccsg;
    public Field bccsucursal;
    public Field bccvia;
    class Bancocli extends Table
      {
      public Bancocli(Select select)
        {
        super(select);
        setName("bancocli");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sbancocliutil()
      {
      setName("sbancocliutil");
      addTable(bancocli=new Bancocli(this));
      addField(bccbanco=new Field(this,bancocli,"bccbanco"));
      addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
      addField(bcccodmuni=new Field(this,bancocli,"bcccodmuni"));
      addField(bcccodpostal=new Field(this,bancocli,"bcccodpostal"));
      addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
      addField(bccdominio=new Field(this,bancocli,"bccdominio"));
      addField(bccescalera=new Field(this,bancocli,"bccescalera"));
      addField(bccletra=new Field(this,bancocli,"bccletra"));
      addField(bccnum=new Field(this,bancocli,"bccnum"));
      addField(bccnumero=new Field(this,bancocli,"bccnumero"));
      addField(bccpiso=new Field(this,bancocli,"bccpiso"));
      addField(bccpoblacion=new Field(this,bancocli,"bccpoblacion"));
      addField(bccprovincia=new Field(this,bancocli,"bccprovincia"));
      addField(bccsg=new Field(this,bancocli,"bccsg"));
      addField(bccsucursal=new Field(this,bancocli,"bccsucursal"));
      addField(bccvia=new Field(this,bancocli,"bccvia"));
      }
    }
    
  // 
  public class Sbancocliutil2 extends Select
    {
    // Tablas
    public Bancocli bancocli;
    // Campos
    public Field bccbanco;
    public Field bcccodigo;
    public Field bcccodmuni;
    public Field bcccodpostal;
    public Field bccdigitos;
    public Field bccdominio;
    public Field bccescalera;
    public Field bccletra;
    public Field bccnum;
    public Field bccnumero;
    public Field bccpiso;
    public Field bccpoblacion;
    public Field bccprovincia;
    public Field bccsg;
    public Field bccsucursal;
    public Field bccvia;
    class Bancocli extends Table
      {
      public Bancocli(Select select)
        {
        super(select);
        setName("bancocli");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sbancocliutil2()
      {
      setName("sbancocliutil2");
      addTable(bancocli=new Bancocli(this));
      addField(bccbanco=new Field(this,bancocli,"bccbanco"));
      addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
      addField(bcccodmuni=new Field(this,bancocli,"bcccodmuni"));
      addField(bcccodpostal=new Field(this,bancocli,"bcccodpostal"));
      addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
      addField(bccdominio=new Field(this,bancocli,"bccdominio"));
      addField(bccescalera=new Field(this,bancocli,"bccescalera"));
      addField(bccletra=new Field(this,bancocli,"bccletra"));
      addField(bccnum=new Field(this,bancocli,"bccnum"));
      addField(bccnumero=new Field(this,bancocli,"bccnumero"));
      addField(bccpiso=new Field(this,bancocli,"bccpiso"));
      addField(bccpoblacion=new Field(this,bancocli,"bccpoblacion"));
      addField(bccprovincia=new Field(this,bancocli,"bccprovincia"));
      addField(bccsg=new Field(this,bancocli,"bccsg"));
      addField(bccsucursal=new Field(this,bancocli,"bccsucursal"));
      addField(bccvia=new Field(this,bancocli,"bccvia"));
      }
    }
    
  // 
  public class Sasignautil extends Select
    {
    // Tablas
    public Asignaciones asignaciones;
    // Campos
    public Field ababanco;
    public Field abacodigo;
    public Field abadigito;
    public Field abatipo;
    public Field abnumero;
    public Field absucursal;
    class Asignaciones extends Table
      {
      public Asignaciones(Select select)
        {
        super(select);
        setName("asignaciones");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sasignautil()
      {
      setName("sasignautil");
      addTable(asignaciones=new Asignaciones(this));
      addField(ababanco=new Field(this,asignaciones,"ababanco"));
      addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
      addField(abadigito=new Field(this,asignaciones,"abadigito"));
      addField(abatipo=new Field(this,asignaciones,"abatipo"));
      addField(abnumero=new Field(this,asignaciones,"abnumero"));
      addField(absucursal=new Field(this,asignaciones,"absucursal"));
      }
    }
    
  // 
  public class Sasignautil2 extends Select
    {
    // Tablas
    public Asignaciones asignaciones;
    // Campos
    public Field ababanco;
    public Field abacodigo;
    public Field abadigito;
    public Field abatipo;
    public Field abnumero;
    public Field absucursal;
    class Asignaciones extends Table
      {
      public Asignaciones(Select select)
        {
        super(select);
        setName("asignaciones");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sasignautil2()
      {
      setName("sasignautil2");
      addTable(asignaciones=new Asignaciones(this));
      addField(ababanco=new Field(this,asignaciones,"ababanco"));
      addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
      addField(abadigito=new Field(this,asignaciones,"abadigito"));
      addField(abatipo=new Field(this,asignaciones,"abatipo"));
      addField(abnumero=new Field(this,asignaciones,"abnumero"));
      addField(absucursal=new Field(this,asignaciones,"absucursal"));
      }
    }
    
  public class FormValtadatosbanc extends MonoDataForm
    {
    // Inicio declaraciones globales
    public boolean modoinsert=true;
    public boolean dc = true;
    public void onOpened(){
      super.onOpened();
      if (!modoinsert) {
        if (sbancoclicanvi.bccprovincia.isNull()){
          bcccodmuni.setNull();
          bcccodmuni.setEnabled(false);
          }
        bccsg.activate();
        doEdit();
        }
      else bcccodmuni.setEnabled(false);
      }
    
    /*
    public boolean onOk(){
      boolean r=super.onOk();
      System.out.println("000003");
      if ( r ) valtadatosbanc.exit();
      return r;
      }
    */
    // Fin declaraciones globales
    // Controles
    public CtrlBccbanco bccbanco;
    public CtrlBccsucursal bccsucursal;
    public CtrlBccnumero bccnumero;
    public CtrlBccdigitos bccdigitos;
    public CtrlBccsg bccsg;
    public CtrlBccvia bccvia;
    public CtrlBccnum bccnum;
    public CtrlBccescalera bccescalera;
    public CtrlBccpiso bccpiso;
    public CtrlBccletra bccletra;
    public CtrlBccprovincia bccprovincia;
    public CtrlBcccodmuni bcccodmuni;
    public CtrlBccpoblacion bccpoblacion;
    public CtrlBcccodpostal bcccodpostal;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(490);
        setHeight(324);
        setTitle("Alta de Datos Bancarios");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlBccbanco extends ControlComboBox
      {
      public mae.easp.general.pkbancos.PickPkbancos pickup;
      public CtrlBccbanco(Form form)
        {
        super(form);
        setName("bccbanco");
        setTitle("Banco");
        setType(INTEGER);
        setMaskInput("9999");
        setProtect(true);
        setPickUp(pickup=new mae.easp.general.pkbancos.PickPkbancos(this));
        setLength(4);
        setPrintable(false);
        setField(sbancoclicanvi.bccbanco);
        }
      }
      
    public class CtrlBccsucursal extends ControlEdit
      {
      public CtrlBccsucursal(Form form)
        {
        super(form);
        setName("bccsucursal");
        setTitle("Sucursal");
        setType(INTEGER);
        setMaskInput("9999");
        setProtect(true);
        setLength(4);
        setPrintable(false);
        setField(sbancoclicanvi.bccsucursal);
        }
      }
      
    public class CtrlBccnumero extends ControlEdit
      {
      public CtrlBccnumero(Form form)
        {
        super(form);
        setName("bccnumero");
        setTitle("Num.");
        setType(STRING);
        setProtect(true);
        setLength(10);
        setPrintable(false);
        setField(sbancoclicanvi.bccnumero);
        }
      public boolean  valid()
        {
        if (Util.isNumero(this.getString()) && this.getString().length() == 10)
          return super.valid();
        else
          return false;
        
        }
      }
      
    public class CtrlBccdigitos extends ControlEdit
      {
      public CtrlBccdigitos(Form form)
        {
        super(form);
        setName("bccdigitos");
        setTitle("D.C.");
        setType(INTEGER);
        setMaskInput("99");
        setProtect(true);
        setLength(2);
        setPrintable(false);
        setField(sbancoclicanvi.bccdigitos);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlBccsg extends ControlComboBox
      {
      public CtrlBccsg(Form form)
        {
        super(form);
        setName("bccsg");
        setTitle("Tipo vía");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setRestricted(false);
        setDescriptionShow(false);
        addItem("Av/Avenida");
        addItem("C /Calle");
        addItem("Ct/Carretera");
        addItem("Ps/Paseo");
        addItem("Pz/Plaza");
        setField(sbancoclicanvi.bccsg);
        }
      }
      
    public class CtrlBccvia extends ControlEdit
      {
      public CtrlBccvia(Form form)
        {
        super(form);
        setName("bccvia");
        setTitle("Vía");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(sbancoclicanvi.bccvia);
        }
      }
      
    public class CtrlBccnum extends ControlEdit
      {
      public CtrlBccnum(Form form)
        {
        super(form);
        setName("bccnum");
        setTitle("Número");
        setType(STRING);
        setLength(6);
        setPrintable(false);
        setField(sbancoclicanvi.bccnum);
        }
      }
      
    public class CtrlBccescalera extends ControlEdit
      {
      public CtrlBccescalera(Form form)
        {
        super(form);
        setName("bccescalera");
        setTitle("Escalera");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(sbancoclicanvi.bccescalera);
        }
      }
      
    public class CtrlBccpiso extends ControlEdit
      {
      public CtrlBccpiso(Form form)
        {
        super(form);
        setName("bccpiso");
        setTitle("Piso");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(sbancoclicanvi.bccpiso);
        }
      }
      
    public class CtrlBccletra extends ControlEdit
      {
      public CtrlBccletra(Form form)
        {
        super(form);
        setName("bccletra");
        setTitle("Letra");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(sbancoclicanvi.bccletra);
        }
      }
      
    public class CtrlBccprovincia extends ControlComboBox
      {
      public mae.easp.general.pkprovincias.PickPkprovincias pickup;
      public CtrlBccprovincia(Form form)
        {
        super(form);
        setName("bccprovincia");
        setTitle("Provincia");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkprovincias.PickPkprovincias(this));
        setLength(2);
        setPrintable(false);
        setField(sbancoclicanvi.bccprovincia);
        }
      public void onChange()
        {
        super.onChange();
        if (this.isNull()) {
          bcccodmuni.setNull();
          bcccodmuni.setEnabled(false);
          }
        else {
          bcccodmuni.setEnabled(true);
          bcccodmuni.pickup.smunicipios.setWhere(null);
          bcccodmuni.pickup.provincia=getInteger();
          bcccodmuni.pickup.smunicipios.execute();
          }
        }
      }
      
    public class CtrlBcccodmuni extends ControlComboBox
      {
      public mae.easp.general.pkmunicipios.PickPkmunicipios pickup;
      public CtrlBcccodmuni(Form form)
        {
        super(form);
        setName("bcccodmuni");
        setTitle("Municipio");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkmunicipios.PickPkmunicipios(this));
        setLength(5);
        setPrintable(false);
        setField(sbancoclicanvi.bcccodmuni);
        }
      public void onChange()
        {
        super.onChange();
        if (!isNull())
          bccpoblacion.setValue(bcccodmuni.pickup.smunicipios.mudesc.getString());
        }
      }
      
    public class CtrlBccpoblacion extends ControlEdit
      {
      public CtrlBccpoblacion(Form form)
        {
        super(form);
        setName("bccpoblacion");
        setTitle("Población");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        setField(sbancoclicanvi.bccpoblacion);
        }
      }
      
    public class CtrlBcccodpostal extends ControlEdit
      {
      public CtrlBcccodpostal(Form form)
        {
        super(form);
        setName("bcccodpostal");
        setTitle("C.P.");
        setType(STRING);
        setLength(5);
        setPrintable(false);
        setField(sbancoclicanvi.bcccodpostal);
        }
      }
      
    public FormValtadatosbanc(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("valtadatosbanc");
      setTitle("Alta de Datos Bancarios");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setModal(true);
      setUnique(true);
      addSelect(sbancoclicanvi=new Sbancoclicanvi());
      addControl(bccbanco=new CtrlBccbanco(this));
      addControl(bccsucursal=new CtrlBccsucursal(this));
      addControl(bccnumero=new CtrlBccnumero(this));
      addControl(bccdigitos=new CtrlBccdigitos(this));
      addControl(bccsg=new CtrlBccsg(this));
      addControl(bccvia=new CtrlBccvia(this));
      addControl(bccnum=new CtrlBccnum(this));
      addControl(bccescalera=new CtrlBccescalera(this));
      addControl(bccpiso=new CtrlBccpiso(this));
      addControl(bccletra=new CtrlBccletra(this));
      addControl(bccprovincia=new CtrlBccprovincia(this));
      addControl(bcccodmuni=new CtrlBcccodmuni(this));
      addControl(bccpoblacion=new CtrlBccpoblacion(this));
      addControl(bcccodpostal=new CtrlBcccodpostal(this));
      setSelect(sbancoclicanvi);
      }
    public void onInit()
      {
      valtadatosbanc.setLayout(new LayoutHtml("mae/easp/html/datosbancariosrd.html"));
      super.onInit();
      
      }
    public boolean onOkInsert()
      {
      if (super.onOkInsert()){
        //sbancoclicanvi.commit();
        vdatosbancarios.doShow();
        // valtadatosbanc.exit();
        return true;
        }
      else
        return false;
      }
    public boolean onOkUpdate()
      {
      /*
      if (super.onOkUpdate()) {
        sbancoclicanvi.commit();
        vdatosbancarios.doShow();
        valtadatosbanc.exit();
        return true;
        }
      else
        return false;
      */
      return super.onOkUpdate();
      
      }
    }
    
  // select para editar o insertar datos bancarios
  public class Sbancoclicanvi extends Select
    {
    // Tablas
    public Bancocli bancocli;
    // Campos
    public Field bcc1provincia;
    public Field bccbanco;
    public Field bcccodigo;
    public Field bcccodmuni;
    public Field bcccodpostal;
    public Field bccdigitos;
    public Field bccescalera;
    public Field bccletra;
    public Field bccnum;
    public Field bccnumero;
    public Field bccpiso;
    public Field bccpoblacion;
    public Field bccprovincia;
    public Field bccsg;
    public Field bccsucursal;
    public Field bccvia;
    class Bancocli extends Table
      {
      public Bancocli(Select select)
        {
        super(select);
        setName("bancocli");
        setOptions(READ | INSERT | UPDATE);
        }
      public boolean onInsert()
        {
        bcccodigo.setValue(codiCDP);
        return super.onInsert();
        }
      }
      
    public Sbancoclicanvi()
      {
      setName("sbancoclicanvi");
      addTable(bancocli=new Bancocli(this));
      addField(bcc1provincia=new Field(this,bancocli,"bccprovincia"));
      addField(bccbanco=new Field(this,bancocli,"bccbanco"));
      addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
      addField(bcccodmuni=new Field(this,bancocli,"bcccodmuni"));
      addField(bcccodpostal=new Field(this,bancocli,"bcccodpostal"));
      addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
      addField(bccescalera=new Field(this,bancocli,"bccescalera"));
      addField(bccletra=new Field(this,bancocli,"bccletra"));
      addField(bccnum=new Field(this,bancocli,"bccnum"));
      addField(bccnumero=new Field(this,bancocli,"bccnumero"));
      addField(bccpiso=new Field(this,bancocli,"bccpiso"));
      addField(bccpoblacion=new Field(this,bancocli,"bccpoblacion"));
      addField(bccprovincia=new Field(this,bancocli,"bccprovincia"));
      addField(bccsg=new Field(this,bancocli,"bccsg"));
      addField(bccsucursal=new Field(this,bancocli,"bccsucursal"));
      addField(bccvia=new Field(this,bancocli,"bccvia"));
      }
    public String getWhere()
      {
      return "bcccodigo="+sbancocli.bcccodigo.getSQLFormat()+
             " and bccbanco="+sbancocli.bccbanco.getSQLFormat()+
             " and bccsucursal="+sbancocli.bccsucursal.getSQLFormat()+
             " and bccnumero="+sbancocli.bccnumero.getSQLFormat()+
             " and bccdigitos="+sbancocli.bccdigitos.getSQLFormat();
      }
    }
    
  public class FormVrepresent extends MultiDataForm
    {
    // Inicio declaraciones globales
    public boolean actualizaNif=false;
    public boolean yaEstaValidado=false;
    
    public void onSelection() {
      doEdit();
      }
    
    public boolean nifYaExiste(String nif){
      snifrep.setWhere("danifcif='"+nif+"'");
      snifrep.execute();
      if (!snifrep.isEof()){
        vvfisicajuri.setValue(snifrep.datfisicajuri);
        vvdatapell1.setValue(snifrep.datapell1);
        vvdatapell2.setValue(snifrep.datapell2);
        vvnombre.setValue(snifrep.datnombre);
        repnotaria.activate();
        actualizaNif=true;
        return true;
        }
      else {
        actualizaNif=false;
        return false;
        }
      }
    
    // Fin declaraciones globales
    // Controles
    public CtrlRepnifcif repnifcif;
    public CtrlVvfisicajuri vvfisicajuri;
    public CtrlVvdatapell1 vvdatapell1;
    public CtrlVvdatapell2 vvdatapell2;
    public CtrlVvnombre vvnombre;
    public CtrlRepnotaria repnotaria;
    public CtrlRepfechapoder repfechapoder;
    public CtrlRepvtopoder repvtopoder;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setTitle("Representantes");
        setModal(true);
        }
      }
      
    public class CtrlRepnifcif extends ColumnEdit
      {
      public CtrlRepnifcif(Form form)
        {
        super(form);
        setName("repnifcif");
        setTitle("NIF / CIF");
        setType(STRING);
        setMaskInput("U");
        setLength(15);
        setPrintable(false);
        setField(srepre.repnifcif);
        }
      public boolean  valid()
        {
        if (yaEstaValidado) 
          return true;
        else {
          String valido=Easp.esCIF(getString());
          if (valido==null)
            return false;
          else {
            if (valido.length() < 9) return false;
            else
               repnifcif.setValue(valido);
            }  
          nifYaExiste(valido);
          yaEstaValidado=true;
          return super.valid();
          }
        }
      public void onChange()
        {
        super.onChange();
        yaEstaValidado=false;
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvfisicajuri extends ColumnComboBox
      {
      public CtrlVvfisicajuri(Form form)
        {
        super(form);
        setName("vvfisicajuri");
        setTitle("F/J");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setPrintable(false);
        addItem("F/Física");
        addItem("J/Jurídica");
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvdatapell1 extends ColumnEdit
      {
      public CtrlVvdatapell1(Form form)
        {
        super(form);
        setName("vvdatapell1");
        setTitle("1er Apellido");
        setType(STRING);
        setLength(40);
        setPrintable(false);
        }
      public boolean  valid()
        {
        return (getString().trim().length()>0);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvdatapell2 extends ColumnEdit
      {
      public CtrlVvdatapell2(Form form)
        {
        super(form);
        setName("vvdatapell2");
        setTitle("2º Apellido");
        setType(STRING);
        setLength(25);
        setPrintable(false);
        }
      }
      
    public class CtrlVvnombre extends ColumnEdit
      {
      public CtrlVvnombre(Form form)
        {
        super(form);
        setName("vvnombre");
        setTitle("Nombre");
        setType(STRING);
        setLength(20);
        setPrintable(false);
        }
      }
      
    public class CtrlRepnotaria extends ColumnEdit
      {
      public CtrlRepnotaria(Form form)
        {
        super(form);
        setName("repnotaria");
        setMessageHelp("Notaría");
        setTitle("Notaría");
        setType(STRING);
        setLength(40);
        setPrintable(false);
        setField(srepre.repnotaria);
        }
      }
      
    public class CtrlRepfechapoder extends ColumnEdit
      {
      public CtrlRepfechapoder(Form form)
        {
        super(form);
        setName("repfechapoder");
        setTitle("Fecha Poder");
        setType(DATE);
        setLength(10);
        setPrintable(false);
        setField(srepre.repfechapoder);
        }
      }
      
    public class CtrlRepvtopoder extends ColumnEdit
      {
      public CtrlRepvtopoder(Form form)
        {
        super(form);
        setName("repvtopoder");
        setMessageHelp("Vencimiento del poder");
        setTitle("Vto. Poder");
        setType(DATE);
        setLength(10);
        setPrintable(false);
        setField(srepre.repvtopoder);
        }
      }
      
    public FormVrepresent(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vrepresent");
      setTitle("Representantes");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      setModal(true);
      addSelect(snifrep=new Snifrep());
      addSelect(srepre=new Srepre());
      addControl(repnifcif=new CtrlRepnifcif(this));
      addControl(vvfisicajuri=new CtrlVvfisicajuri(this));
      addControl(vvdatapell1=new CtrlVvdatapell1(this));
      addControl(vvdatapell2=new CtrlVvdatapell2(this));
      addControl(vvnombre=new CtrlVvnombre(this));
      addControl(repnotaria=new CtrlRepnotaria(this));
      addControl(repfechapoder=new CtrlRepfechapoder(this));
      addControl(repvtopoder=new CtrlRepvtopoder(this));
      setSelect(srepre);
      }
    public boolean onOkInsert()
      {
      boolean existeNif = true;
      snifrep.setWhere("danifcif="+repnifcif.getSQLFormat());
      snifrep.execute();
      if (snifrep.isEof()) {
        snifrep.addNew();
        snifrep.danifcif.setValue(repnifcif);
        snifrep.datipo.setValue("R");
        existeNif = false;
      }
      else {
        snifrep.edit();
      }
      snifrep.datfisicajuri.setValue(vvfisicajuri);
      snifrep.datapell1.setValue(vvdatapell1);
snifrep.datapell2.setValue(vvdatapell2);
      snifrep.datnombre.setValue(vvnombre);
      snifrep.datipo.setValue("R");
      boolean bOk = true;
      if (existeNif) bOk = snifrep.update();
      else bOk = snifrep.insert();
      if (bOk) {
        srepre.repcodigo.setValue(sgeneral.cdpcodi.getString());
        srepre.reppresentante.setValue("N");
        srepre.repsocios.setValue("N");
        srepre.represidente.setValue("N");
        srepre.repsecretario.setValue("N");
        srepre.repadministrado.setValue("N");
        srepre.repfirma.setValue("N");
        srepre.repreplegal.setValue("N");
        bOk = super.onOkInsert();
      }
      return bOk;
      
      }
    public boolean onOkUpdate()
      {
      snifrep.setWhere("danifcif="+repnifcif.getSQLFormat());
      snifrep.execute();
      if (snifrep.isEof()) {
        snifrep.addNew();
        snifrep.danifcif.setValue(repnifcif);
        snifrep.datfisicajuri.setValue(vvfisicajuri);
        snifrep.datapell1.setValue(vvdatapell1);
  snifrep.datapell2.setValue(vvdatapell2);
        snifrep.datnombre.setValue(vvnombre);
        snifrep.datipo.setValue("R");
        if (snifrep.insert()) return super.onOkUpdate();
        else return false;
      }
      else {
        snifrep.edit();
        snifrep.datfisicajuri.setValue(vvfisicajuri);
        snifrep.datapell1.setValue(vvdatapell1);
  snifrep.datapell2.setValue(vvdatapell2);
        snifrep.datnombre.setValue(vvnombre);
        if (snifrep.update()) return super.onOkUpdate();
        else return false;
      }
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      snifrep.setWhere("danifcif="+srepre.repnifcif.getSQLFormat());
      snifrep.execute();
      if (!snifrep.isEof()){
        vvfisicajuri.setValue(snifrep.datfisicajuri);
        vvdatapell1.setValue(snifrep.datapell1);
        vvdatapell2.setValue(snifrep.datapell2);
        vvnombre.setValue(snifrep.datnombre);
      }
      
      }
    }
    
  // select para saber si existe el nif
  public class Snifrep extends Select
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
    public Field datfisicajuri;
    public Field datipf;
    public Field datipo;
    public Field datletra;
    public Field datletraseti;
    public Field datmuni;
    public Field datnacional;
    public Field datnombre;
    public Field datnum;
    public Field datpais;
    public Field datpiso;
    public Field datpobla;
    public Field datprov;
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
      }
      
    public Snifrep()
      {
      setName("snifrep");
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
      addField(datfisicajuri=new Field(this,nifes,"datfisicajuri"));
      addField(datipf=new Field(this,nifes,"datipf"));
      addField(datipo=new Field(this,nifes,"datipo"));
      addField(datletra=new Field(this,nifes,"datletra"));
      addField(datletraseti=new Field(this,nifes,"datletraseti"));
      addField(datmuni=new Field(this,nifes,"datmuni"));
      addField(datnacional=new Field(this,nifes,"datnacional"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      addField(datnum=new Field(this,nifes,"datnum"));
      addField(datpais=new Field(this,nifes,"datpais"));
      addField(datpiso=new Field(this,nifes,"datpiso"));
      addField(datpobla=new Field(this,nifes,"datpobla"));
      addField(datprov=new Field(this,nifes,"datprov"));
      addField(datsiglas=new Field(this,nifes,"datsiglas"));
      addField(dattel=new Field(this,nifes,"dattel"));
      addField(datvia=new Field(this,nifes,"datvia"));
      }
    }
    
  // 
  public class Srepre extends Select
    {
    // Tablas
    public Representantes representantes;
    // Campos
    public Field repadministrado;
    public Field repcodigo;
    public Field repdominio;
    public Field repfechapoder;
    public Field repfirma;
    public Field repnifcif;
    public Field repnotaria;
    public Field reppresentante;
    public Field repreplegal;
    public Field represidente;
    public Field repsecretario;
    public Field repsocios;
    public Field repvtopoder;
    class Representantes extends Table
      {
      public Representantes(Select select)
        {
        super(select);
        setName("representantes");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Srepre()
      {
      setName("srepre");
      addTable(representantes=new Representantes(this));
      addField(repadministrado=new Field(this,representantes,"repadministrado"));
      addField(repcodigo=new Field(this,representantes,"repcodigo"));
      addField(repdominio=new Field(this,representantes,"repdominio"));
      addField(repfechapoder=new Field(this,representantes,"repfechapoder"));
      addField(repfirma=new Field(this,representantes,"repfirma"));
      addField(repnifcif=new Field(this,representantes,"repnifcif"));
      addField(repnotaria=new Field(this,representantes,"repnotaria"));
      addField(reppresentante=new Field(this,representantes,"reppresentante"));
      addField(repreplegal=new Field(this,representantes,"repreplegal"));
      addField(represidente=new Field(this,representantes,"represidente"));
      addField(repsecretario=new Field(this,representantes,"repsecretario"));
      addField(repsocios=new Field(this,representantes,"repsocios"));
      addField(repvtopoder=new Field(this,representantes,"repvtopoder"));
      }
    public String getWhere()
      {
      return "repcodigo="+sgeneral.cdpcodi.getSQLFormat();
      }
    }
    
  public class FormVcargorepre extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void valorCheck(String v, ControlCheck c){
      if (v.equals("S"))
        c.setValue(true);
      else 
        c.setValue(false); 
      }
    // Fin declaraciones globales
    // Controles
    public CtrlChadministrador chadministrador;
    public CtrlChreplegal chreplegal;
    public CtrlChfirma chfirma;
    public CtrlChsecretario chsecretario;
    public CtrlChsocio chsocio;
    public CtrlChresidente chresidente;
    public CtrlChrepresentante chrepresentante;
    // Acciones
    public LinkBtotrosdatos btotrosdatos;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(2);
        setTitle("Cargo Representantes");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlChadministrador extends ControlCheck
      {
      public CtrlChadministrador(Form form)
        {
        super(form);
        setName("chadministrador");
        setTitle("");
        }
      }
      
    public class CtrlChreplegal extends ControlCheck
      {
      public CtrlChreplegal(Form form)
        {
        super(form);
        setName("chreplegal");
        setTitle("");
        }
      }
      
    public class CtrlChfirma extends ControlCheck
      {
      public CtrlChfirma(Form form)
        {
        super(form);
        setName("chfirma");
        setTitle("");
        }
      }
      
    public class CtrlChsecretario extends ControlCheck
      {
      public CtrlChsecretario(Form form)
        {
        super(form);
        setName("chsecretario");
        setTitle("");
        }
      }
      
    public class CtrlChsocio extends ControlCheck
      {
      public CtrlChsocio(Form form)
        {
        super(form);
        setName("chsocio");
        setTitle("");
        }
      }
      
    public class CtrlChresidente extends ControlCheck
      {
      public CtrlChresidente(Form form)
        {
        super(form);
        setName("chresidente");
        setTitle("");
        }
      }
      
    public class CtrlChrepresentante extends ControlCheck
      {
      public CtrlChrepresentante(Form form)
        {
        super(form);
        setName("chrepresentante");
        setTitle("");
        }
      }
      
    public class LinkBtotrosdatos extends ActionForm
      {
      public LinkBtotrosdatos(Form form)
        {
        super(form);
        setName("btotrosdatos");
        setTitle("&1.Datos Filiación");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        modo=10;
        
        }
      }
      
    public FormVcargorepre(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vcargorepre");
      setTitle("Cargo Representantes");
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setPrintable(false);
      setModal(true);
      setUnique(true);
      addControl(chadministrador=new CtrlChadministrador(this));
      addControl(chreplegal=new CtrlChreplegal(this));
      addControl(chfirma=new CtrlChfirma(this));
      addControl(chsecretario=new CtrlChsecretario(this));
      addControl(chsocio=new CtrlChsocio(this));
      addControl(chresidente=new CtrlChresidente(this));
      addControl(chrepresentante=new CtrlChrepresentante(this));
      addAction(btotrosdatos=new LinkBtotrosdatos(this));
      setSelect(srepre);
      }
    public boolean onOkUpdate()
      {
      if (chadministrador.getBoolean())
        srepre.repadministrado.setValue("S");
      else
        srepre.repadministrado.setValue("N");
      if (chreplegal.getBoolean())
        srepre.repreplegal.setValue("S");
      else
        srepre.repreplegal.setValue("N");
      if (chfirma.getBoolean())
        srepre.repfirma.setValue("S");
      else
        srepre.repfirma.setValue("N");
      if (chresidente.getBoolean())
        srepre.represidente.setValue("S");
      else
        srepre.represidente.setValue("N");
      if (chsocio.getBoolean())
        srepre.repsocios.setValue("S");
      else
        srepre.repsocios.setValue("N");
      if (chsecretario.getBoolean())
        srepre.repsecretario.setValue("S");
      else
        srepre.repsecretario.setValue("N");
      if (chrepresentante.getBoolean())
        srepre.reppresentante.setValue("S");
      else
        srepre.reppresentante.setValue("N");
      return super.onOkUpdate();
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      String admin=srepre.repadministrado.getString();
      valorCheck(admin,chadministrador);
      admin=srepre.repreplegal.getString();
      valorCheck(admin,chreplegal);
      admin=srepre.repfirma.getString();
      valorCheck(admin,chfirma);
      admin=srepre.repsecretario.getString();
      valorCheck(admin,chsecretario);
      admin=srepre.repsocios.getString();
      valorCheck(admin,chsocio);
      admin=srepre.represidente.getString();
      valorCheck(admin,chresidente);
      admin=srepre.reppresentante.getString();
      valorCheck(admin,chrepresentante);
      }
    }
    
  public class FormVnifes extends MonoDataForm
    {
    // Inicio declaraciones globales
    String nifValido=null;
    boolean actualizaNif=false;
    
    public void onOpened(){
      super.onOpened();
      danifcif.setEnabled(vnifcif==null);
      if (modo==20) doEdit();
      else if (modo==1) doInsert();
      }
    
    public void onInsert(){
      super.onInsert();
      if (vnifcif!=null){
        nifValido=vnifcif;
        nifYaExiste(nifValido);
        }
      }
    
    public boolean onOk(){
      if (super.onOk()) {
        sgeneral.commit();
        vnifes.exit();
        return true;
        }
      else
        return false;
      }
    
    public boolean nifYaExiste(String nif){
      snifrep.setWhere("danifcif='"+nif+"'");
      snifrep.execute();
      if (!snifrep.isEof()){
        datfisicajuri.setValue(snifrep.datfisicajuri);
        datapell1.setValue(snifrep.datapell1);
        datapell2.setValue(snifrep.datapell2);
        datnombre.setValue(snifrep.datnombre);
        actualizaNif=true;
        }
      else
        actualizaNif=false;
      snifrep.setWhere(null);
      return actualizaNif;
      }
    
    // Fin declaraciones globales
    // Controles
    public CtrlDanifcif danifcif;
    public CtrlDatapell1 datapell1;
    public CtrlDatapell2 datapell2;
    public CtrlDatnombre datnombre;
    public CtrlDatfisicajuri datfisicajuri;
    public CtrlDatemail datemail;
    public CtrlDattel dattel;
    public CtrlDatfax datfax;
    public CtrlCdpaeatdele cdpaeatdele;
    public CtrlCdpaeatadm cdpaeatadm;
    public CtrlVcdpcodi vcdpcodi;
    public CtrlCdpref cdpref;
    public CtrlCdpcdprel cdpcdprel;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(636);
        setHeight(450);
        setTitle("Datos de la afiliación");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlDanifcif extends ControlEdit
      {
      public CtrlDanifcif(Form form)
        {
        super(form);
        setName("danifcif");
        setTitle("NIF/CIF");
        setType(STRING);
        setMaskInput("U");
        setProtect(true);
        setLength(15);
        setPrintable(false);
        setField(snifes.danifcif);
        }
      public boolean  valid()
        {
        if (getNumState()!=DataForm.INSERT || (nifValido!=null && nifValido.equals(getString())))
          return true;
        nifValido=Easp.esCIF(getString());
        if (nifValido==null)
          return false;
        else
          danifcif.setValue(nifValido);
        nifYaExiste(nifValido);
        return true;
        }
      public Object getDefault()
        {
        return vnifcif;
        
        
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
        setTitle("ape1");
        setType(STRING);
        setLength(100);
        setPrintable(false);
        setField(snifes.datapell1);
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
        setLength(25);
        setPrintable(false);
        setField(snifes.datapell2);
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
        setLength(20);
        setPrintable(false);
        setField(snifes.datnombre);
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
        if (getString().equals("J")){
          datapell2.setEnabled(false);
          datnombre.setEnabled(false);
          }
        else {
          datapell2.setEnabled(true);
          datnombre.setEnabled(true);
          }
        }
      public boolean obligate()
        {
        return true;
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
      }
      
    public class CtrlCdpaeatdele extends ControlComboBox
      {
      public mae.easp.general.pkdelegaciones.PickPkdelegaciones pickup;
      public CtrlCdpaeatdele(Form form)
        {
        super(form);
        setName("cdpaeatdele");
        setTitle("eatdele");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkdelegaciones.PickPkdelegaciones(this));
        setLength(2);
        setPrintable(false);
        setField(snifes.cdpaeatdele);
        }
      public void onChange()
        {
        super.onChange();
        cdpaeatadm.pickup.sadministracion.setWhere(null);
        cdpaeatadm.pickup.delegacion=getInteger();
        cdpaeatadm.pickup.sadministracion.execute();
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlCdpaeatadm extends ControlComboBox
      {
      public mae.easp.general.pkadministracio.PickPkadministracio pickup;
      public CtrlCdpaeatadm(Form form)
        {
        super(form);
        setName("cdpaeatadm");
        setTitle("eatadm");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkadministracio.PickPkadministracio(this));
        setLength(3);
        setPrintable(false);
        setField(snifes.cdpaeatadm);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVcdpcodi extends ControlEdit
      {
      public CtrlVcdpcodi(Form form)
        {
        super(form);
        setName("vcdpcodi");
        setTitle("Codi");
        setType(DOUBLE);
        setMaskInput("999999");
        setProtect(true);
        setLength(6);
        setPrintable(false);
        }
      public Object getDefault()
        {
          snumeraciones.execute();
          if (!snumeraciones.isEof()) 
             nuevoCodiCDP=snumeraciones.numcodigo.getInteger()+1;
          else
             nuevoCodiCDP=1;
          return new Integer(nuevoCodiCDP);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlCdpref extends ControlEdit
      {
      public CtrlCdpref(Form form)
        {
        super(form);
        setName("cdpref");
        setMessageHelp("Referencia de la Actividad");
        setTitle("Referencia");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(snifes.cdpref);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlCdpcdprel extends ControlComboBox
      {
      public mae.easp.general.pkcdp.PickPkcdp pickup;
      public CtrlCdpcdprel(Form form)
        {
        super(form);
        setName("cdpcdprel");
        setTitle("rel");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
        setLength(12);
        setPrintable(false);
        setField(snifes.cdpcdprel);
        }
      }
      
    public FormVnifes(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vnifes");
      setTitle("Datos de la afiliación");
      setLocation(new Location());
      setStates(SHOW | UPDATE | INSERT);
      setPrintable(false);
      setModal(true);
      setUnique(true);
      addSelect(snifes=new Snifes());
      addSelect(snumeraciones=new Snumeraciones());
      addSelect(snumcheck=new Snumcheck());
      addControl(danifcif=new CtrlDanifcif(this));
      addControl(datapell1=new CtrlDatapell1(this));
      addControl(datapell2=new CtrlDatapell2(this));
      addControl(datnombre=new CtrlDatnombre(this));
      addControl(datfisicajuri=new CtrlDatfisicajuri(this));
      addControl(datemail=new CtrlDatemail(this));
      addControl(dattel=new CtrlDattel(this));
      addControl(datfax=new CtrlDatfax(this));
      addControl(cdpaeatdele=new CtrlCdpaeatdele(this));
      addControl(cdpaeatadm=new CtrlCdpaeatadm(this));
      addControl(vcdpcodi=new CtrlVcdpcodi(this));
      addControl(cdpref=new CtrlCdpref(this));
      addControl(cdpcdprel=new CtrlCdpcdprel(this));
      setSelect(snifes);
      }
    public void onInit()
      {
      if (modo==1) 
        setTitle("Datos de la afiliación del nuevo cliente");
      else
        setTitle("Datos de la afiliación del cliente: "+sgeneral.cdpcodi.getString());
      snifes.cdp.setCheckDuplicates(true);
      super.onInit();
      }
    public void onExit()
      {
      super.onExit();
      vdatosafiliacio.doShow();
      }
    public boolean onOkInsert()
      {
      if (super.onOkInsert()){
        vnifcif=snifes.danifcif.getString();
        codiCDP=Easp.codiDP.substring(0,6)+Util.formateoNumero("000000",vcdpcodi.getInteger());
        snifes.commit();
        Maefc.message("Se ha generado un nuevo código de cliente:\n\n"+vcdpcodi.getInteger(),"Información",Maefc.INFORMATION_MESSAGE);
        return true;
        }
      else
        return false;
      
      }
    }
    
  // select para el cdp con su nif
  public class Snifes extends Select
    {
    // Tablas
    public Nifes nifes;
    public Cdp cdp;
    // Campos
    public Field cdpaeatadm;
    public Field cdpaeatdele;
    public Field cdpagpi;
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
    public Field danifcif;
    public Field dataltaen;
    public Field datapell1;
    public Field datapell2;
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
    public Field datipo;
    public Field datletra;
    public Field datmuni;
    public Field datnacional;
    public Field datnombre;
    public Field datnum;
    public Field datpais;
    public Field datpiso;
    public Field datpobla;
    public Field datprov;
    public Field datsiglas;
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
      public boolean onInsert()
        {
        if (vnifes.actualizaNif){
          datfisicajuri.setValue(vnifes.datfisicajuri);
          datapell1.setValue(vnifes.datapell1);
          datapell2.setValue(vnifes.datapell2);
          datnombre.setValue(vnifes.datnombre);
          vnifes.actualizaNif=false;
          return super.onUpdate();
          }
        else {
          datdominio.setValue(Easp.dominio);
          if (esDP)
            datipo.setValue("D");
          else
            datipo.setValue("C");
          return super.onInsert();
          }
        }
      }
      
    class Cdp extends Table
      {
      public Cdp(Select select)
        {
        super(select);
        setName("cdp");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        cdpnifcif.setValue(vnifes.danifcif.getString());
        cdppwd.setNull();
        cdppwdacc.setNull();
        
        if (!vcdp.vref.isNull())
          cdpref.setValue(vcdp.vref);
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
        
        // snumeraciones.executeLock();
        if (esDP) {
          cdpcodi.setValue(Easp.codiDP);
          codiCDP=cdpcodi.getString();
          return super.onInsert();
          }
        else {
          //select para ver si hay que insertar registro en la tabla de numeraciones o editarlo
          snumcheck.execute();
          if (!snumcheck.isEof()) {
            //cdpcodi.setValue(Easp.codiDP.substring(0,6)+Util.formateoNumero("000000",snumcheck.numcodigo.getInteger()+1));
            snumeraciones.edit();
            }
          else {
            //cdpcodi.setValue(Easp.codiDP.substring(0,6)+"000001");
            snumeraciones.addNew();
            }
          cdpcodi.setValue(Easp.codiDP.substring(0,6)+Util.formateoNumero("000000",vnifes.vcdpcodi.getInteger()));
          if (snumeraciones.save()) {
            codiCDP=cdpcodi.getString();
            return super.onInsert();
            }
          else
            return false;
          }
        
        }
      public boolean onUpdate()
        {
        if (alta)
          return onInsert();
        else
          return super.onUpdate();
        }
      }
      
    public Snifes()
      {
      setName("snifes");
      addTable(nifes=new Nifes(this));
      addTable(cdp=new Cdp(this));
      addField(cdpaeatadm=new Field(this,cdp,"cdpaeatadm"));
      addField(cdpaeatdele=new Field(this,cdp,"cdpaeatdele"));
      addField(cdpagpi=new Field(this,cdp,"cdpagpi"));
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
      addField(danifcif=new Field(this,nifes,"danifcif"));
      addField(dataltaen=new Field(this,nifes,"dataltaen"));
      addField(datapell1=new Field(this,nifes,"datapell1"));
      addField(datapell2=new Field(this,nifes,"datapell2"));
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
      addField(datipo=new Field(this,nifes,"datipo"));
      addField(datletra=new Field(this,nifes,"datletra"));
      addField(datmuni=new Field(this,nifes,"datmuni"));
      addField(datnacional=new Field(this,nifes,"datnacional"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      addField(datnum=new Field(this,nifes,"datnum"));
      addField(datpais=new Field(this,nifes,"datpais"));
      addField(datpiso=new Field(this,nifes,"datpiso"));
      addField(datpobla=new Field(this,nifes,"datpobla"));
      addField(datprov=new Field(this,nifes,"datprov"));
      addField(datsiglas=new Field(this,nifes,"datsiglas"));
      addField(dattel=new Field(this,nifes,"dattel"));
      addField(datvia=new Field(this,nifes,"datvia"));
      }
    public String getWhere()
      {
      return "cdpcodi='"+codiCDP+"'";
      }
    }
    
  // Búsqueda del nou codi de CDP/Empresa
  public class Snumeraciones extends Select
    {
    // Tablas
    public Numeraciones numeraciones;
    // Campos
    public Field numaplic;
    public Field numcodigo;
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
        numaplic.setValue("GENERAL");
        numcodigo.setValue(1);
        return super.onInsert();
        }
      public boolean onUpdate()
        {
        //numaplic.setValue("GENERAL");
        int nuevoCodigo=vnifes.vcdpcodi.getInteger();
        if (nuevoCodiCDP <= nuevoCodigo) {
          snumcheck.setWhere(snumeraciones.getWhere()+" and numcodigo="+nuevoCodigo);
          snumcheck.execute();
          if (snumcheck.isEof())
            numcodigo.setValue(nuevoCodigo);
          else
            numcodigo.setValue(numcodigo.getInteger()+1);
          snumcheck.setWhere(null);
          }
        return super.onUpdate();
        }
      }
      
    public Snumeraciones()
      {
      setName("snumeraciones");
      addTable(numeraciones=new Numeraciones(this));
      addField(numaplic=new Field(this,numeraciones,"numaplic"));
      addField(numcodigo=new Field(this,numeraciones,"numcodigo"));
      }
    public String getWhere()
      {
      return "numaplic like 'GENERAL%'";
      
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
      }
    public String getWhere()
      {
      return "numaplic like 'GENERAL%'";
      }
    }
    
  public class FormVcdp extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void onOpened(){
      super.onOpened();
      if (modo==1) 
        doEdit();
      }
    
    public boolean onOk(){
      if (super.onOk()) {
        sgeneral.commit();
        vcdp.exit();
        return true;
        }
      else
        return false;
      }
    
    
    // Fin declaraciones globales
    // Controles
    public CtrlDanifcif danifcif;
    public CtrlVref vref;
    public CtrlCdpcdprel cdpcdprel;
    public CtrlCdpaeatdele cdpaeatdele;
    public CtrlCdpaeatadm cdpaeatadm;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(700);
        setHeight(250);
        setTitle("Cliente");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlDanifcif extends ControlEdit
      {
      public CtrlDanifcif(Form form)
        {
        super(form);
        setName("danifcif");
        setTitle("NIF/CIF");
        setType(STRING);
        setMaskInput("U");
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        setField(snifcdp.danifcif);
        }
      public boolean  valid()
        {
        String valido=Easp.esCIF(getString());
        if (valido==null)
          return false;
        else{
          if (valido.length() < 9)
            return false;
          else
            danifcif.setValue(valido);
          }  
        return true;
        }
      public Object getDefault()
        {
        return vnifcif;
        }
      }
      
    public class CtrlVref extends ControlEdit
      {
      public CtrlVref(Form form)
        {
        super(form);
        setName("vref");
        setMessageHelp("Referencia de la actividad");
        setTitle("Referencia");
        setType(STRING);
        setLength(45);
        setPrintable(false);
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
      public void onChange()
        {
        super.onChange();
        vnifes.cdpcdprel.setValue(this);
        }
      }
      
    public class CtrlCdpaeatdele extends ControlComboBox
      {
      public mae.easp.general.pkdelegaciones.PickPkdelegaciones pickup;
      public CtrlCdpaeatdele(Form form)
        {
        super(form);
        setName("cdpaeatdele");
        setTitle("Delegación Hacienda");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkdelegaciones.PickPkdelegaciones(this));
        setLength(10);
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
        setTitle("Administración Hacienda");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkadministracio.PickPkadministracio(this));
        setLength(10);
        setPrintable(false);
        setField(snifcdp.cdpaeatadm);
        }
      }
      
    public FormVcdp(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vcdp");
      setTitle("Cliente");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setPrintable(false);
      setModal(true);
      setUnique(true);
      addSelect(snifcdp=new Snifcdp());
      addControl(danifcif=new CtrlDanifcif(this));
      addControl(vref=new CtrlVref(this));
      addControl(cdpcdprel=new CtrlCdpcdprel(this));
      addControl(cdpaeatdele=new CtrlCdpaeatdele(this));
      addControl(cdpaeatadm=new CtrlCdpaeatadm(this));
      setSelect(snifcdp);
      }
    public void onExit()
      {
      super.onExit();
      vdatosafiliacio.doShow();
      }
    }
    
  // select de nif y cdp
  public class Snifcdp extends Select
    {
    // Tablas
    public Nifes nifes;
    public Cdp cdp;
    // Campos
    public Field cdpaeatadm;
    public Field cdpaeatdele;
    public Field cdpagpi;
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
    public Field datprov;
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
      }
      
    class Cdp extends Table
      {
      public Cdp(Select select)
        {
        super(select);
        setName("cdp");
        setOptions(READ | UPDATE);
        }
      }
      
    public Snifcdp()
      {
      setName("snifcdp");
      addTable(nifes=new Nifes(this));
      addTable(cdp=new Cdp(this));
      addField(cdpaeatadm=new Field(this,cdp,"cdpaeatadm"));
      addField(cdpaeatdele=new Field(this,cdp,"cdpaeatdele"));
      addField(cdpagpi=new Field(this,cdp,"cdpagpi"));
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
      addField(datprov=new Field(this,nifes,"datprov"));
      addField(datsiglas=new Field(this,nifes,"datsiglas"));
      addField(dattel=new Field(this,nifes,"dattel"));
      addField(datvia=new Field(this,nifes,"datvia"));
      }
    public String getWhere()
      {
      return "cdpcodi='"+codiCDP+"'";
      }
    }
    
  public class FormVservicios extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void actualizarChecks(){
     if (chagpi.getBoolean())
      sservicioscdp.cdpagpi.setValue("S");
     else
      sservicioscdp.cdpagpi.setValue("N");
     if (chgestion.getBoolean())
      sservicioscdp.cdpckgestion.setValue("S");
     else
      sservicioscdp.cdpckgestion.setValue("N");
     if (chrenta.getBoolean())
      sservicioscdp.cdpckrenta.setValue("S");
     else
      sservicioscdp.cdpckrenta.setValue("N");
     if (chnomina.getBoolean())
      sservicioscdp.cdpcknomina.setValue("S");
     else
      sservicioscdp.cdpcknomina.setValue("N");
     if (chconta.getBoolean())
      sservicioscdp.cdpckconta.setValue("S");
     else
      sservicioscdp.cdpckconta.setValue("N");
     if (cheo.getBoolean())
      sservicioscdp.cdpckeo.setValue("S");
     else
      sservicioscdp.cdpckeo.setValue("N");
     if (chiss.getBoolean())
      sservicioscdp.cdpckiss.setValue("S");
     else
      sservicioscdp.cdpckiss.setValue("N");
     }
    // Fin declaraciones globales
    // Controles
    public CtrlChagpi chagpi;
    public CtrlChnomina chnomina;
    public CtrlChgestion chgestion;
    public CtrlChrenta chrenta;
    public CtrlChconta chconta;
    public CtrlCheo cheo;
    public CtrlChiss chiss;
    public CtrlBtpasswdacc btpasswdacc;
    public CtrlCdppwd cdppwd;
    public CtrlCdpcdprel cdpcdprel;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(1);
        setTitle("Servicios");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlChagpi extends ControlCheck
      {
      public CtrlChagpi(Form form)
        {
        super(form);
        setName("chagpi");
        setTitle("afinity");
        }
      public boolean  valid()
        {
        return true;
        }
        
        public void onChange() {
          super.onChange();
          if (getBoolean()) {
            cdppwd.setEnabled(true);
            String v=Easp.generarNum(10);
            if (cdppwd.isNull())  cdppwd.setValue(v);
            }
         else {
            cdppwd.setEnabled(false);
            cdppwd.setNull();
            }
        }
      }
      
    public class CtrlChnomina extends ControlCheck
      {
      public CtrlChnomina(Form form)
        {
        super(form);
        setName("chnomina");
        setTitle("");
        }
      }
      
    public class CtrlChgestion extends ControlCheck
      {
      public CtrlChgestion(Form form)
        {
        super(form);
        setName("chgestion");
        setTitle("");
        }
      }
      
    public class CtrlChrenta extends ControlCheck
      {
      public CtrlChrenta(Form form)
        {
        super(form);
        setName("chrenta");
        setTitle("");
        }
      }
      
    public class CtrlChconta extends ControlCheck
      {
      public CtrlChconta(Form form)
        {
        super(form);
        setName("chconta");
        setTitle("");
        }
      }
      
    public class CtrlCheo extends ControlCheck
      {
      public CtrlCheo(Form form)
        {
        super(form);
        setName("cheo");
        setTitle("");
        }
      }
      
    public class CtrlChiss extends ControlCheck
      {
      public CtrlChiss(Form form)
        {
        super(form);
        setName("chiss");
        setTitle("");
        }
      }
      
    public class CtrlBtpasswdacc extends ControlButton
      {
      public CtrlBtpasswdacc(Form form)
        {
        super(form);
        setName("btpasswdacc");
        setTitle("Contraseña de acceso");
        setTitle("Contraseña de acceso");
        }
      public void onClick()
        {
        super.onClick();
        if (Aplication.getAplication().getUser().toUpperCase().equals("ADMIN"))
          vcontrasenya.open();
        else
          Maefc.message("Acceso Denegado.\nSolo Tratable por ADMIN","Atención",Maefc.INFORMATION_MESSAGE);
        
        }
      }
      
    public class CtrlCdppwd extends ControlEdit
      {
      public CtrlCdppwd(Form form)
        {
        super(form);
        setName("cdppwd");
        setMessageHelp("Contraseña para acceder al dominio de este cliente en AFINITY");
        setTitle("Contraseña Afinity");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(sservicioscdp.cdppwd);
        }
      }
      
    public class CtrlCdpcdprel extends ControlComboBox
      {
      public mae.easp.general.pkcdp.PickPkcdp pickup;
      public CtrlCdpcdprel(Form form)
        {
        super(form);
        setName("cdpcdprel");
        setMessageHelp("CDP relacionado");
        setTitle("CDP relacionado");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
        setLength(12);
        setPrintable(false);
        setField(sservicioscdp.cdpcdprel);
        }
      }
      
    public FormVservicios(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vservicios");
      setTitle("Servicios");
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setModal(true);
      setUnique(true);
      addSelect(sservicioscdp=new Sservicioscdp());
      addControl(chagpi=new CtrlChagpi(this));
      addControl(chnomina=new CtrlChnomina(this));
      addControl(chgestion=new CtrlChgestion(this));
      addControl(chrenta=new CtrlChrenta(this));
      addControl(chconta=new CtrlChconta(this));
      addControl(cheo=new CtrlCheo(this));
      addControl(chiss=new CtrlChiss(this));
      addControl(btpasswdacc=new CtrlBtpasswdacc(this));
      addControl(cdppwd=new CtrlCdppwd(this));
      addControl(cdpcdprel=new CtrlCdpcdprel(this));
      setSelect(sservicioscdp);
      }
    public boolean onOkUpdate()
      {
      actualizarChecks();
      return super.onOkUpdate();
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      if (sservicioscdp.cdpagpi.getString().equals("S"))
        chagpi.setValue(true);
      else
        chagpi.setValue(false);
      cdppwd.setEnabled(chagpi.getBoolean());
      if (sservicioscdp.cdpcknomina.getString().equals("S"))
        chnomina.setValue(true);
      else
        chnomina.setValue(false);
      if (sservicioscdp.cdpckconta.getString().equals("S"))
        chconta.setValue(true);
      else
        chconta.setValue(false);
      if (sservicioscdp.cdpckgestion.getString().equals("S"))
        chgestion.setValue(true);
      else
        chgestion.setValue(false);
      if (sservicioscdp.cdpckrenta.getString().equals("S"))
        chrenta.setValue(true);
      else
        chrenta.setValue(false);
      if (sservicioscdp.cdpckeo.getString().equals("S"))
        cheo.setValue(true);
      else
        cheo.setValue(false);
      if (sservicioscdp.cdpckiss.getString().equals("S"))
        chiss.setValue(true);
      else
        chiss.setValue(false);
      }
    }
    
  // Servicios al CDP
  public class Sservicioscdp extends Select
    {
    // Tablas
    public Cdp cdp;
    // Campos
    public Field cdpagpi;
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
    class Cdp extends Table
      {
      public Cdp(Select select)
        {
        super(select);
        setName("cdp");
        setOptions(READ | UPDATE);
        }
      }
      
    public Sservicioscdp()
      {
      setName("sservicioscdp");
      addTable(cdp=new Cdp(this));
      addField(cdpagpi=new Field(this,cdp,"cdpagpi"));
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
      }
    public String getWhere()
      {
      return "cdpcodi="+sgeneral.cdpcodi.getSQLFormat();
      }
    }
    
  public class FormVcontrasenya extends MonoDataForm
    {
    // Controles
    public CtrlCdppwdacc cdppwdacc;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(300);
        setHeight(150);
        setTitle("Contraseña acceso Empresa");
        setModal(true);
        setLocation(SOUTH);
        }
      }
      
    public class CtrlCdppwdacc extends ControlEdit
      {
      public CtrlCdppwdacc(Form form)
        {
        super(form);
        setName("cdppwdacc");
        setMessageHelp("Contraseña para acceder a trabajar con este cliente");
        setTitle("Contraseña");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(sservicioscdp.cdppwdacc);
        }
      }
      
    public FormVcontrasenya(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vcontrasenya");
      setTitle("Contraseña acceso Empresa");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setPrintable(false);
      setModal(true);
      setUnique(true);
      addControl(cdppwdacc=new CtrlCdppwdacc(this));
      setSelect(sservicioscdp);
      }
    }
    
  public class FormVserviciosdet extends MultiDataForm
    {
    // Controles
    public CtrlCdpcodi cdpcodi;
    public CtrlCdpref cdpref;
    public CtrlVservicio vservicio;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(2);
        setHeight(1);
        setTitle("Servicios relacionados");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlCdpcodi extends ColumnEdit
      {
      public CtrlCdpcodi(Form form)
        {
        super(form);
        setName("cdpcodi");
        setTitle("Código");
        setType(STRING);
        setLength(12);
        setPrintable(false);
        setField(sservicios.cdpcodi);
        }
      }
      
    public class CtrlCdpref extends ColumnEdit
      {
      public CtrlCdpref(Form form)
        {
        super(form);
        setName("cdpref");
        setMessageHelp("Referencia actividad");
        setTitle("Referencia");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(sservicios.cdpref);
        }
      }
      
    public class CtrlVservicio extends ColumnEdit
      {
      public CtrlVservicio(Form form)
        {
        super(form);
        setName("vservicio");
        setMessageHelp("Tipo de servicio");
        setTitle("Servicio");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      }
      
    public FormVserviciosdet(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vserviciosdet");
      setTitle("Servicios relacionados");
      setLocation(new Location());
      setStates(SHOW);
      setModal(true);
      addSelect(sservicios=new Sservicios());
      addControl(cdpcodi=new CtrlCdpcodi(this));
      addControl(cdpref=new CtrlCdpref(this));
      addControl(vservicio=new CtrlVservicio(this));
      setSelect(sservicios);
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      vservicio.setValue("Contabilidad");
      }
    }
    
  // Servicios encontrados
  public class Sservicios extends Select
    {
    // Tablas
    public Cdp cdp;
    // Campos
    public Field cdpcodi;
    public Field cdpref;
    class Cdp extends Table
      {
      public Cdp(Select select)
        {
        super(select);
        setName("cdp");
        setOptions(READ);
        }
      }
      
    public Sservicios()
      {
      setName("sservicios");
      setFather(sgeneral);
      addTable(cdp=new Cdp(this));
      addField(cdpcodi=new Field(this,cdp,"cdpcodi"));
      addField(cdpref=new Field(this,cdp,"cdpref"));
      }
    public String getWhere()
      {
      return "cdpcodi="+sgeneral.cdpcodi.getSQLFormat()+" or cdpcdprel="+sgeneral.cdpcodi.getSQLFormat();
      }
    public String getOrder()
      {
      return "cdpcodi";
      }
    }
    
  public class FormVnifrepresentan extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void onOpened(){
      super.onOpened();
      switch(modo) {
        case 1:
          doInsert();
          break;
        case 10:  
          doShow();
          break;
        case 20:
          doEdit();
        }
      }
    
    public boolean onOk(){
      if (super.onOk()){
        srepre.commit();
        return true;
      }
    else{
      srepre.rollback();
      return false;
      }
     }
    
    // Fin declaraciones globales
    // Controles
    public CtrlDanifcif danifcif;
    public CtrlDatapell1 datapell1;
    public CtrlDatapell2 datapell2;
    public CtrlDatnombre datnombre;
    public CtrlDatemail datemail;
    public CtrlDatfisicajuri datfisicajuri;
    public CtrlDattel dattel;
    public CtrlDatfax datfax;
    public CtrlDatcontacto datcontacto;
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
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(605);
        setHeight(400);
        setTitle("Datos del representante");
        setModal(true);
        setLocation(SOUTH);
        }
      }
      
    public class CtrlDanifcif extends ControlEdit
      {
      public CtrlDanifcif(Form form)
        {
        super(form);
        setName("danifcif");
        setTitle("nif");
        setType(STRING);
        setProtect(true);
        setLength(15);
        setPrintable(false);
        setField(snifrepresentan.danifcif);
        }
      }
      
    public class CtrlDatapell1 extends ControlEdit
      {
      public CtrlDatapell1(Form form)
        {
        super(form);
        setName("datapell1");
        setTitle("ape1");
        setType(STRING);
        setLength(100);
        setPrintable(false);
        setField(snifrepresentan.datapell1);
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
        setLength(25);
        setPrintable(false);
        setField(snifrepresentan.datapell2);
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
        setLength(20);
        setPrintable(false);
        setField(snifrepresentan.datnombre);
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
        setField(snifrepresentan.datemail);
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
        setField(snifrepresentan.datfisicajuri);
        }
      }
      
    public class CtrlDattel extends ControlEdit
      {
      public CtrlDattel(Form form)
        {
        super(form);
        setName("dattel");
        setTitle("tel");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(snifrepresentan.dattel);
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
        setField(snifrepresentan.datfax);
        }
      }
      
    public class CtrlDatcontacto extends ControlEdit
      {
      public CtrlDatcontacto(Form form)
        {
        super(form);
        setName("datcontacto");
        setTitle("contacto");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        setField(snifrepresentan.datcontacto);
        }
      }
      
    public class CtrlDatsiglas extends ControlComboBox
      {
      public mae.easp.general.pksiglas.PickPksiglas pickup;
      public CtrlDatsiglas(Form form)
        {
        super(form);
        setName("datsiglas");
        setTitle("siglas");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pksiglas.PickPksiglas(this));
        setLength(2);
        setPrintable(false);
        setDescriptionShow(false);
        setField(snifrepresentan.datsiglas);
        }
      }
      
    public class CtrlDatvia extends ControlEdit
      {
      public CtrlDatvia(Form form)
        {
        super(form);
        setName("datvia");
        setTitle("via");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(snifrepresentan.datvia);
        }
      }
      
    public class CtrlDatnum extends ControlEdit
      {
      public CtrlDatnum(Form form)
        {
        super(form);
        setName("datnum");
        setTitle("num");
        setType(STRING);
        setLength(6);
        setPrintable(false);
        setField(snifrepresentan.datnum);
        }
      }
      
    public class CtrlDatesc extends ControlEdit
      {
      public CtrlDatesc(Form form)
        {
        super(form);
        setName("datesc");
        setTitle("esc");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(snifrepresentan.datesc);
        }
      }
      
    public class CtrlDatpiso extends ControlEdit
      {
      public CtrlDatpiso(Form form)
        {
        super(form);
        setName("datpiso");
        setTitle("piso");
        setType(STRING);
        setLength(2);
        setPrintable(false);
        setField(snifrepresentan.datpiso);
        }
      }
      
    public class CtrlDatletra extends ControlEdit
      {
      public CtrlDatletra(Form form)
        {
        super(form);
        setName("datletra");
        setTitle("letra");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(snifrepresentan.datletra);
        }
      }
      
    public class CtrlDatprov extends ControlComboBox
      {
      public mae.easp.general.pkprovincias.PickPkprovincias pickup;
      public CtrlDatprov(Form form)
        {
        super(form);
        setName("datprov");
        setTitle("prov");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkprovincias.PickPkprovincias(this));
        setLength(2);
        setPrintable(false);
        setField(snifrepresentan.datprov);
        }
      public void onChange()
        {
        super.onChange();
          datmuni.setNull();
          datmuni.pickup.smunicipios.setWhere(null);
          datmuni.pickup.provincia=getInteger();
          datmuni.refresh();
        
          if (!isReading())
            if (!isNull()) datcpos.setValue(Util.formateoNumero("00",getInteger()));
        
        }
      }
      
    public class CtrlDatmuni extends ControlComboBox
      {
      public mae.easp.general.pkmunicipios.PickPkmunicipios pickup;
      public CtrlDatmuni(Form form)
        {
        super(form);
        setName("datmuni");
        setTitle("mun");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkmunicipios.PickPkmunicipios(this));
        setLength(5);
        setPrintable(false);
        setField(snifrepresentan.datmuni);
        }
      public void onChange()
        {
        super.onChange();
        if (!isNull())
        datpobla.setValue(datmuni.pickup.smunicipios.mudesc.getString());
        }
      }
      
    public class CtrlDatpobla extends ControlEdit
      {
      public CtrlDatpobla(Form form)
        {
        super(form);
        setName("datpobla");
        setTitle("pobl");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        setField(snifrepresentan.datpobla);
        }
      }
      
    public class CtrlDatcpos extends ControlEdit
      {
      public CtrlDatcpos(Form form)
        {
        super(form);
        setName("datcpos");
        setTitle("cp");
        setType(STRING);
        setLength(5);
        setPrintable(false);
        setField(snifrepresentan.datcpos);
        }
      }
      
    public class CtrlDatpais extends ControlComboBox
      {
      public mae.easp.general.pkpaises.PickPkpaises pickup;
      public CtrlDatpais(Form form)
        {
        super(form);
        setName("datpais");
        setTitle("pais");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkpaises.PickPkpaises(this));
        setLength(3);
        setPrintable(false);
        setField(snifrepresentan.datpais);
        }
      }
      
    public FormVnifrepresentan(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vnifrepresentan");
      setTitle("Datos del representante");
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setModal(true);
      setUnique(true);
      addSelect(snifrepresentan=new Snifrepresentan());
      addControl(danifcif=new CtrlDanifcif(this));
      addControl(datapell1=new CtrlDatapell1(this));
      addControl(datapell2=new CtrlDatapell2(this));
      addControl(datnombre=new CtrlDatnombre(this));
      addControl(datemail=new CtrlDatemail(this));
      addControl(datfisicajuri=new CtrlDatfisicajuri(this));
      addControl(dattel=new CtrlDattel(this));
      addControl(datfax=new CtrlDatfax(this));
      addControl(datcontacto=new CtrlDatcontacto(this));
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
      setSelect(snifrepresentan);
      }
    public void onInit()
      {
      /*
      switch(modo){
        case 1:
          vnifrepresentan.setStates(DataForm.INSERT);
          vnifrepresentan.setInitState(DataForm.INSERT); 
          break;
        case 10:
          vnifrepresentan.setStates(DataForm.SHOW);
          vnifrepresentan.setInitState(DataForm.SHOW);     
          break;
        case 20:
          vnifrepresentan.setStates(DataForm.SHOW | DataForm.UPDATE);
          vnifrepresentan.setInitState(DataForm.UPDATE);     
        }
      */
      super.onInit();
      }
    public void onExit()
      {
      vrepresent.doShow();
      super.onExit();
      }
    }
    
  // select de modificacion de los datos del representante
  public class Snifrepresentan extends Select
    {
    // Tablas
    public Nifes nifes;
    public Representantes representantes;
    // Campos
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
    public Field datprov;
    public Field datsiglas;
    public Field dattel;
    public Field datvia;
    public Field repadministrado;
    public Field repcodigo;
    public Field repfechapoder;
    public Field repfirma;
    public Field repnifcif;
    public Field repnotaria;
    public Field reppresentante;
    public Field repreplegal;
    public Field represidente;
    public Field repsecretario;
    public Field repsocios;
    public Field repvtopoder;
    class Nifes extends Table
      {
      public Nifes(Select select)
        {
        super(select);
        setName("nifes");
        setOptions(READ | INSERT | UPDATE);
        }
      }
      
    class Representantes extends Table
      {
      public Representantes(Select select)
        {
        super(select);
        setName("representantes");
        setOptions(READ | INSERT | UPDATE);
        }
      }
      
    public Snifrepresentan()
      {
      setName("snifrepresentan");
      addTable(nifes=new Nifes(this));
      addTable(representantes=new Representantes(this));
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
      addField(datprov=new Field(this,nifes,"datprov"));
      addField(datsiglas=new Field(this,nifes,"datsiglas"));
      addField(dattel=new Field(this,nifes,"dattel"));
      addField(datvia=new Field(this,nifes,"datvia"));
      addField(repadministrado=new Field(this,representantes,"repadministrado"));
      addField(repcodigo=new Field(this,representantes,"repcodigo"));
      addField(repfechapoder=new Field(this,representantes,"repfechapoder"));
      addField(repfirma=new Field(this,representantes,"repfirma"));
      addField(repnifcif=new Field(this,representantes,"repnifcif"));
      addField(repnotaria=new Field(this,representantes,"repnotaria"));
      addField(reppresentante=new Field(this,representantes,"reppresentante"));
      addField(repreplegal=new Field(this,representantes,"repreplegal"));
      addField(represidente=new Field(this,representantes,"represidente"));
      addField(repsecretario=new Field(this,representantes,"repsecretario"));
      addField(repsocios=new Field(this,representantes,"repsocios"));
      addField(repvtopoder=new Field(this,representantes,"repvtopoder"));
      }
    public String getWhere()
      {
      return "danifcif="+srepre.repnifcif.getSQLFormat();
      }
    }
    
  public class FormVcambiobanco extends ProcessForm
    {
    // Inicio declaraciones globales
    
    
    public void onOpened() {
      vvbancorig     .setValue(sbancocli.bccbanco);
      vvoficinaorig  .setValue(sbancocli.bccsucursal);
      vvdcorigen     .setValue(sbancocli.bccdigitos);
      vvcuentaorig   .setValue(sbancocli.bccnumero);
    
      vvbancodest   .setNull();
      vvoficinadest .setNull();
      vvdcdest      .setNull(); 
      vvcuentadest  .setNull();
    
    
      super.onOpened();
      }
    // Fin declaraciones globales
    // Controles
    public CtrlVvbancorig vvbancorig;
    public CtrlVvoficinaorig vvoficinaorig;
    public CtrlVvdcorigen vvdcorigen;
    public CtrlVvcuentaorig vvcuentaorig;
    public CtrlVvbancodest vvbancodest;
    public CtrlVvoficinadest vvoficinadest;
    public CtrlVvdcdest vvdcdest;
    public CtrlVvcuentadest vvcuentadest;
    // Acciones
    public LinkAcprocesar acprocesar;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(725);
        setHeight(350);
        setTitle("Cambio Cuenta Bancaria");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVvbancorig extends ControlComboBox
      {
      public mae.easp.general.pkbancos.PickPkbancos pickup;
      public CtrlVvbancorig(Form form)
        {
        super(form);
        setName("vvbancorig");
        setTitle("Banco Origen");
        setType(INTEGER);
        setMaskInput("9999");
        setPickUp(pickup=new mae.easp.general.pkbancos.PickPkbancos(this));
        setLength(4);
        setEnabled(false);
        setPrintable(false);
        setRestricted(false);
        }
      public boolean obligate()
        {
        return true ;
        
        }
      }
      
    public class CtrlVvoficinaorig extends ControlEdit
      {
      public CtrlVvoficinaorig(Form form)
        {
        super(form);
        setName("vvoficinaorig");
        setTitle("Oficina Origen");
        setType(INTEGER);
        setMaskInput("9999");
        setLength(4);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvdcorigen extends ControlEdit
      {
      public CtrlVvdcorigen(Form form)
        {
        super(form);
        setName("vvdcorigen");
        setTitle("DC origen");
        setType(INTEGER);
        setMaskInput("99");
        setLength(2);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvcuentaorig extends ControlEdit
      {
      public CtrlVvcuentaorig(Form form)
        {
        super(form);
        setName("vvcuentaorig");
        setTitle("Cuenta Origen");
        setType(STRING);
        setLength(10);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvbancodest extends ControlComboBox
      {
      public mae.easp.general.pkbancos.PickPkbancos pickup;
      public CtrlVvbancodest(Form form)
        {
        super(form);
        setName("vvbancodest");
        setTitle("Nuevo Banco");
        setType(INTEGER);
        setMaskInput("9999");
        setPickUp(pickup=new mae.easp.general.pkbancos.PickPkbancos(this));
        setLength(4);
        setPrintable(false);
        setRestricted(false);
        }
      public boolean obligate()
        {
        return true ;
        
        }
      }
      
    public class CtrlVvoficinadest extends ControlEdit
      {
      public CtrlVvoficinadest(Form form)
        {
        super(form);
        setName("vvoficinadest");
        setTitle("Oficina Destino");
        setType(INTEGER);
        setMaskInput("9999");
        setLength(4);
        setPrintable(false);
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class CtrlVvdcdest extends ControlEdit
      {
      public CtrlVvdcdest(Form form)
        {
        super(form);
        setName("vvdcdest");
        setTitle("DC Destino");
        setType(INTEGER);
        setMaskInput("99");
        setLength(2);
        setPrintable(false);
        }
      public boolean  valid()
        {
        if (Easp.digitoIncorrecto(vvbancodest.getString()
                                             ,vvoficinadest.getString()
                                             ,vvcuentadest.getString()
                                            ,vvdcdest.getString(),"corriente")) {
        System.out.println("000001");
          return false;
          }
        else {
        System.out.println("000002");
          return super.valid(); 
          }
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class CtrlVvcuentadest extends ControlEdit
      {
      public CtrlVvcuentadest(Form form)
        {
        super(form);
        setName("vvcuentadest");
        setTitle("Cuenta Destino");
        setType(STRING);
        setLength(10);
        setPrintable(false);
        }
      public boolean  valid()
        {
        if (Util.isNumero(this.getString()) && this.getString().length() == 10)
          return super.valid();
        else
          return false;
        
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class LinkAcprocesar extends Action
      {
      public LinkAcprocesar(Form form)
        {
        super(form);
        setName("acprocesar");
        setTitle("&1. Modificar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        
        sbancocliutil.setWhere("bcccodigo = '"+sbancocli.bcccodigo.getString()+"' and bccbanco = "+vvbancorig.getString()+" and bccsucursal = "+vvoficinaorig.getInteger()+" and bccnumero = '"+vvcuentaorig.getString()+"' and bccdigitos = "+vvdcorigen.getInteger());
        sbancocliutil.execute();
        
        boolean commitjNomina = false ;
        boolean commitjGestion = false ;
        if ( !sbancocliutil.isEof() ) {
          System.out.println("Cliente: ["+sbancocliutil.bcccodigo.getString()+"]");
          sbancocliutil2.addNew();
          
          sbancocliutil2.  bcccodigo   .setValue(sbancocliutil.bcccodigo);
          sbancocliutil2.bccbanco.setValue(vvbancodest);
          sbancocliutil2.  bccsucursal .setValue(vvoficinadest);
          sbancocliutil2.  bccnumero   .setValue(vvcuentadest);
          sbancocliutil2.bccdigitos.setValue(vvdcdest);
          sbancocliutil2.insert();
        
          sasignautil.setWhere("abacodigo = '"+sbancocliutil.bcccodigo.getString()+"' and ababanco = "+vvbancorig.getString()+"	and absucursal = "+vvoficinaorig.getInteger()+"  and abnumero = '"+vvcuentaorig.getString()+"'	and abadigito = "+vvdcorigen.getInteger());
          sasignautil.execute();
          while ( !sasignautil.isEof() ) {
          
            String tipo = sasignautil.abatipo.getString();
            sasignautil.delete();
          
            sasignautil2.    addNew();
            sasignautil2.    abacodigo   .setValue(sbancocliutil.bcccodigo);
            sasignautil2.    abatipo     .setValue(tipo);
            sasignautil2.    ababanco    .setValue(vvbancodest);
            sasignautil2.    absucursal  .setValue(vvoficinadest);
            sasignautil2.    abnumero    .setValue(vvcuentadest);
            sasignautil2.    abadigito   .setValue(vvdcdest);
            sasignautil2.    insert();
        
          
            sasignautil.next();
            }
        
        
          if ( connJNomina != null ) {
            scendbancos.setWhere("cebbanco = '"+Numero.format(vvbancorig.getInteger(),"0000")+"'  and   cebsucursal = '"+Numero.format(vvoficinaorig.getInteger(),"0000")+"'  and   cebnumero  = '"+vvcuentaorig.getString()+"' and  cebdigito = '"+Numero.format(vvdcorigen.getInteger(),"00")+"'");
            scendbancos.execute();
            while ( !scendbancos.isEof() ) {
              String msg = "Se ha detectado que la cuenta que esta modificando existe en la aplicación de jNomina en: \n  Empresa:    "+scendbancos.cebcodiemp.getString()+" \n Centro:     "+scendbancos.cebcodigo.getString()+" \n Tipo Pago:  "+scendbancos.cebpago.getString()+" \n \n ¿ Desea que el programa la modifique por la nueva cuenta bancaria ? " ;
              if ( Maefc.message(msg,"Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION ) {
                scendbancos.edit();
                scendbancos.cebbanco      .setValue(Numero.format(vvbancodest.getInteger()   ,"0000") );
                scendbancos.cebsucursal   .setValue(Numero.format(vvoficinadest.getInteger() ,"0000") );
                scendbancos.cebdigito     .setValue(Numero.format(vvdcdest.getInteger()      ,"00") );
                scendbancos.cebnumero     .setValue(vvcuentadest);
                scendbancos.update();
                commitjNomina = false ;
                }
              scendbancos.next();
              }
            
            }
        
        
          if ( tieneJGestion ) {
            sdomi.setWhere("dobanco = '"+Numero.format(vvbancorig.getInteger(),"0000")+"'  and   dooficina = '"+Numero.format(vvoficinaorig.getInteger(),"0000")+"'  and   docuenta  = '"+vvcuentaorig.getString()+"' and  dodigcon = '"+Numero.format(vvdcorigen.getInteger(),"00")+"'");
            sdomi.execute();
            while ( !sdomi.isEof() ) {
              String msg = "Se ha detectado que la cuenta que esta modificando existe en la aplicación de jGestion en: \n  Despacho:    "+sdomi.doasesor.getString()+" \n Cliente:     "+sdomi.docliente.getString()+"  \n \n ¿ Desea que el programa la modifique por la nueva cuenta bancaria ? " ;
              if ( Maefc.message(msg,"Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION ) {
                sdomi.edit();
                sdomi.dobanco      .setValue(Numero.format(vvbancodest.getInteger()   ,"0000") );
                sdomi.dooficina   .setValue(Numero.format(vvoficinadest.getInteger() ,"0000") );
                sdomi.dodigcon     .setValue(Numero.format(vvdcdest.getInteger()      ,"00") );
                sdomi.docuenta     .setValue(vvcuentadest);
                sdomi.update();
                commitjGestion = true ;
                }
              sdomi.next();
              }
        
            }
        
          sbancocliutil.delete();
        
          if ( connJNomina != null && commitjNomina ) {
            scendbancos.commit();
            scendbancos.setWhere(null);
            scendbancos.execute();
            }
        
          if ( tieneJGestion && commitjGestion ) {
            sdomi.commit();
            sdomi.setWhere("docolectivo = 1 ");
            sdomi.execute();
            }
        
          sbancocliutil.commit();
          }
        
        
        
        
        
        vdatosbancarios.doShow();
        Maefc.message("Proceso Finalizado","Atención");
        vcambiobanco.exit();
        
        
        }
      }
      
    public FormVcambiobanco(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vcambiobanco");
      setTitle("Cambio Cuenta Bancaria");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addControl(vvbancorig=new CtrlVvbancorig(this));
      addControl(vvoficinaorig=new CtrlVvoficinaorig(this));
      addControl(vvdcorigen=new CtrlVvdcorigen(this));
      addControl(vvcuentaorig=new CtrlVvcuentaorig(this));
      addControl(vvbancodest=new CtrlVvbancodest(this));
      addControl(vvoficinadest=new CtrlVvoficinadest(this));
      addControl(vvdcdest=new CtrlVvdcdest(this));
      addControl(vvcuentadest=new CtrlVvcuentadest(this));
      addAction(acprocesar=new LinkAcprocesar(this));
      }
    }
    
  public class FormVcendbancos extends MultiDataForm
    {
    // Controles
    public CtrlCebcodiemp cebcodiemp;
    public CtrlCebcodigo cebcodigo;
    public CtrlCebpago cebpago;
    public CtrlCebbanco cebbanco;
    public CtrlCebsucursal cebsucursal;
    public CtrlCebdigito cebdigito;
    public CtrlCebnumero cebnumero;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(750);
        setHeight(400);
        setTitle("Bancos jNomina");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlCebcodiemp extends ColumnEdit
      {
      public CtrlCebcodiemp(Form form)
        {
        super(form);
        setName("cebcodiemp");
        setTitle("Empresa");
        setType(INTEGER);
        setMaskInput("######");
        setLength(6);
        setSearchable(true);
        setEnabled(false);
        setField(scendbancos.cebcodiemp);
        }
      }
      
    public class CtrlCebcodigo extends ColumnEdit
      {
      public CtrlCebcodigo(Form form)
        {
        super(form);
        setName("cebcodigo");
        setTitle("Centro");
        setType(INTEGER);
        setMaskInput("######");
        setLength(6);
        setSearchable(true);
        setEnabled(false);
        setField(scendbancos.cebcodigo);
        }
      }
      
    public class CtrlCebpago extends ColumnEdit
      {
      public CtrlCebpago(Form form)
        {
        super(form);
        setName("cebpago");
        setTitle("Tipo");
        setType(STRING);
        setLength(5);
        setSearchable(true);
        setEnabled(false);
        setField(scendbancos.cebpago);
        }
      }
      
    public class CtrlCebbanco extends ColumnEdit
      {
      public CtrlCebbanco(Form form)
        {
        super(form);
        setName("cebbanco");
        setTitle("Banco");
        setType(STRING);
        setLength(4);
        setSearchable(true);
        setField(scendbancos.cebbanco);
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class CtrlCebsucursal extends ColumnEdit
      {
      public CtrlCebsucursal(Form form)
        {
        super(form);
        setName("cebsucursal");
        setTitle("Oficina");
        setType(STRING);
        setLength(4);
        setSearchable(true);
        setField(scendbancos.cebsucursal);
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class CtrlCebdigito extends ColumnEdit
      {
      public CtrlCebdigito(Form form)
        {
        super(form);
        setName("cebdigito");
        setTitle("DC");
        setType(STRING);
        setLength(2);
        setSearchable(true);
        setField(scendbancos.cebdigito);
        }
      public boolean  valid()
        {
        if (Easp.digitoIncorrecto(cebbanco.getString()
                                             ,cebsucursal.getString()
                                             ,cebnumero.getString()
                                            ,cebdigito.getString(),"corriente")) {
        System.out.println("000001");
          return false;
          }
        else {
        System.out.println("000002");
          return super.valid(); 
          }
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class CtrlCebnumero extends ColumnEdit
      {
      public CtrlCebnumero(Form form)
        {
        super(form);
        setName("cebnumero");
        setTitle("Número");
        setType(STRING);
        setLength(10);
        setSearchable(true);
        setField(scendbancos.cebnumero);
        }
      public boolean  valid()
        {
        if (Util.isNumero(this.getString()) && this.getString().length() == 10)
          return super.valid();
        else
          return false;
        
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public FormVcendbancos(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vcendbancos");
      setTitle("Bancos jNomina");
      setLocation(new Location());
      setStates(SHOW | SEARCH | UPDATE);
      setModal(true);
      addSelect(scendbancos=new Scendbancos());
      addControl(cebcodiemp=new CtrlCebcodiemp(this));
      addControl(cebcodigo=new CtrlCebcodigo(this));
      addControl(cebpago=new CtrlCebpago(this));
      addControl(cebbanco=new CtrlCebbanco(this));
      addControl(cebsucursal=new CtrlCebsucursal(this));
      addControl(cebdigito=new CtrlCebdigito(this));
      addControl(cebnumero=new CtrlCebnumero(this));
      }
    }
    
  // 
  public class Scendbancos extends Select
    {
    // Tablas
    public Cendbancos cendbancos;
    // Campos
    public Field cebbanco;
    public Field cebcodiemp;
    public Field cebcodigo;
    public Field cebdesactivado;
    public Field cebdigito;
    public Field cebdomiirpf;
    public Field cebnumero;
    public Field ceboidenttit;
    public Field cebonomtit;
    public Field cebpago;
    public Field cebpagoss;
    public Field cebsucursal;
    public Field cebtipoidenttit;
    public Field cebventanass;
    class Cendbancos extends Table
      {
      public Cendbancos(Select select)
        {
        super(select);
        setName("cendbancos");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Scendbancos()
      {
      setName("scendbancos");
      addTable(cendbancos=new Cendbancos(this));
      addField(cebbanco=new Field(this,cendbancos,"cebbanco"));
      addField(cebcodiemp=new Field(this,cendbancos,"cebcodiemp"));
      addField(cebcodigo=new Field(this,cendbancos,"cebcodigo"));
      addField(cebdesactivado=new Field(this,cendbancos,"cebdesactivado"));
      addField(cebdigito=new Field(this,cendbancos,"cebdigito"));
      addField(cebdomiirpf=new Field(this,cendbancos,"cebdomiirpf"));
      addField(cebnumero=new Field(this,cendbancos,"cebnumero"));
      addField(ceboidenttit=new Field(this,cendbancos,"ceboidenttit"));
      addField(cebonomtit=new Field(this,cendbancos,"cebonomtit"));
      addField(cebpago=new Field(this,cendbancos,"cebpago"));
      addField(cebpagoss=new Field(this,cendbancos,"cebpagoss"));
      addField(cebsucursal=new Field(this,cendbancos,"cebsucursal"));
      addField(cebtipoidenttit=new Field(this,cendbancos,"cebtipoidenttit"));
      addField(cebventanass=new Field(this,cendbancos,"cebventanass"));
      }
    }
    
  public class FormVdomi extends MultiDataForm
    {
    // Controles
    public CtrlDoasesor doasesor;
    public CtrlDocliente docliente;
    public CtrlDocontador docontador;
    public CtrlDobanco dobanco;
    public CtrlDooficina dooficina;
    public CtrlDodigcon dodigcon;
    public CtrlDocuenta docuenta;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(750);
        setHeight(400);
        setTitle("Domiciliaciones Clientes jGestión");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlDoasesor extends ColumnEdit
      {
      public CtrlDoasesor(Form form)
        {
        super(form);
        setName("doasesor");
        setTitle("Despacho");
        setType(INTEGER);
        setMaskInput("99");
        setLength(2);
        setSearchable(true);
        setEnabled(false);
        setField(sdomi.doasesor);
        }
      }
      
    public class CtrlDocliente extends ColumnEdit
      {
      public CtrlDocliente(Form form)
        {
        super(form);
        setName("docliente");
        setTitle("Cliente");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setEnabled(false);
        setField(sdomi.docliente);
        }
      }
      
    public class CtrlDocontador extends ColumnEdit
      {
      public CtrlDocontador(Form form)
        {
        super(form);
        setName("docontador");
        setTitle("Num");
        setType(INTEGER);
        setMaskInput("###");
        setLength(3);
        setSearchable(true);
        setEnabled(false);
        setField(sdomi.docontador);
        }
      }
      
    public class CtrlDobanco extends ColumnEdit
      {
      public CtrlDobanco(Form form)
        {
        super(form);
        setName("dobanco");
        setTitle("Banco");
        setType(STRING);
        setLength(4);
        setSearchable(true);
        setField(sdomi.dobanco);
        }
      public boolean  valid()
        {
        if (!Util.isNumero(getString())) {
          setMessageWarning("El código de entidad bancaria debería ser numérico.");
          return false;
          }
        if (getString().length()!=4) {
          setMessageWarning("El código de entidad bancaria debería ser de 4 digitos.");
          return false;
          }
        return super.valid();
        
        }
      public void onChange()
        {
        super.onChange();
        if (!isReading() && getString().length()>0  && Util.isNumero(getString()) )
          setValue(Numero.format(Integer.parseInt(getString()),"0000"));
        
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class CtrlDooficina extends ColumnEdit
      {
      public CtrlDooficina(Form form)
        {
        super(form);
        setName("dooficina");
        setTitle("Sucursal");
        setType(STRING);
        setLength(4);
        setSearchable(true);
        setField(sdomi.dooficina);
        }
      public boolean  valid()
        {
        if (!Util.isNumero(getString())) {
          setMessageWarning("El valor de este campo debe ser numérico.");
          return false;
          }
        if (getString().length()!=4) {
          setMessageWarning("El número de la oficina debería ser de 4 digitos.");
          return false;
          }
        return super.valid();
        
        }
      public void onChange()
        {
        super.onChange();
        if (!isReading() && getString().length()>0  && Util.isNumero(getString()) )
          setValue(Numero.format(Integer.parseInt(getString()),"0000"));
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class CtrlDodigcon extends ColumnEdit
      {
      public CtrlDodigcon(Form form)
        {
        super(form);
        setName("dodigcon");
        setTitle("DC");
        setType(STRING);
        setLength(2);
        setSearchable(true);
        setField(sdomi.dodigcon);
        }
      public boolean  valid()
        {
        if ( dobanco.isNull() || dooficina.isNull() || docuenta.isNull() ) return true;
        
        if (!Util.isNumero(getString())) {
          setMessageWarning("El valor de este campo debe ser numérico.");
          return false;
          }
        
        if (mae.easp.general.Easp.digitoIncorrecto(dobanco.getString()
                                             ,dooficina.getString()
                                             ,docuenta.getString()
                                            ,dodigcon.getString(),"corriente")) {
          return false;
          }
        else {
          return super.valid(); 
          }
        
        }
      public void onChange()
        {
        super.onChange();
        if (!isReading() && getString().length()>0  && Util.isNumero(getString()) )
          setValue(Numero.format(Integer.parseInt(getString()),"00"));
        }
      public boolean obligate()
        {
        return true ;
        
        }
      }
      
    public class CtrlDocuenta extends ColumnEdit
      {
      public CtrlDocuenta(Form form)
        {
        super(form);
        setName("docuenta");
        setTitle("Cuenta");
        setType(STRING);
        setLength(10);
        setSearchable(true);
        setField(sdomi.docuenta);
        }
      public boolean  valid()
        {
        
        if (!Util.isNumero(getString())) {
          setMessageWarning("El valor de este campo debe ser numérico.");
          return false;
          }
        return super.valid();
        
        
        }
      public void onChange()
        {
        super.onChange();
        if (!isReading() && getString().length() > 0 && Util.isNumero(getString()) ) {
          setValue(Numero.format(Double.valueOf(getString()).doubleValue(),"0000000000"));
          }
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVdomi(ProgPrclfichagener prclfichagener)
      {
      super(prclfichagener);
      setName("vdomi");
      setTitle("Domiciliaciones Clientes jGestión");
      setLocation(new Location());
      setStates(SHOW | SEARCH | UPDATE);
      setModal(true);
      addSelect(sdomi=new Sdomi());
      addSelect(sfichageneral=new Sfichageneral());
      addControl(doasesor=new CtrlDoasesor(this));
      addControl(docliente=new CtrlDocliente(this));
      addControl(docontador=new CtrlDocontador(this));
      addControl(dobanco=new CtrlDobanco(this));
      addControl(dooficina=new CtrlDooficina(this));
      addControl(dodigcon=new CtrlDodigcon(this));
      addControl(docuenta=new CtrlDocuenta(this));
      }
    }
    
  // 
  public class Sdomi extends Select
    {
    // Tablas
    public Domi domi;
    // Campos
    public Field doasesor;
    public Field dobanco;
    public Field docliente;
    public Field docolectivo;
    public Field docontador;
    public Field docuenta;
    public Field dodigcon;
    public Field dodomicilio;
    public Field doentidad;
    public Field donombre;
    public Field dooficina;
    public Field dopoblacion;
    public Field doprovincia;
    class Domi extends Table
      {
      public Domi(Select select)
        {
        super(select);
        setName("domi");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sdomi()
      {
      setName("sdomi");
      addTable(domi=new Domi(this));
      addField(doasesor=new Field(this,domi,"doasesor"));
      addField(dobanco=new Field(this,domi,"dobanco"));
      addField(docliente=new Field(this,domi,"docliente"));
      addField(docolectivo=new Field(this,domi,"docolectivo"));
      addField(docontador=new Field(this,domi,"docontador"));
      addField(docuenta=new Field(this,domi,"docuenta"));
      addField(dodigcon=new Field(this,domi,"dodigcon"));
      addField(dodomicilio=new Field(this,domi,"dodomicilio"));
      addField(doentidad=new Field(this,domi,"doentidad"));
      addField(donombre=new Field(this,domi,"donombre"));
      addField(dooficina=new Field(this,domi,"dooficina"));
      addField(dopoblacion=new Field(this,domi,"dopoblacion"));
      addField(doprovincia=new Field(this,domi,"doprovincia"));
      }
    public String getWhere()
      {
      return "docolectivo = 1";
      }
    public String getOrder()
      {
      return "doasesor,docliente,dobanco,dooficina";
      }
    }
    
  // 
  public class Sfichageneral extends Select
    {
    // Tablas
    public Fitgen fitgen;
    // Campos
    public Field fgasesor;
    public Field fgcliente;
    public Field fgcodigocdp;
    class Fitgen extends Table
      {
      public Fitgen(Select select)
        {
        super(select);
        setName("fitgen");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sfichageneral()
      {
      setName("sfichageneral");
      addTable(fitgen=new Fitgen(this));
      addField(fgasesor=new Field(this,fitgen,"fgasesor"));
      addField(fgcliente=new Field(this,fitgen,"fgcliente"));
      addField(fgcodigocdp=new Field(this,fitgen,"fgcodigocdp"));
      }
    }
    
  public ProgPrclfichagener()
    {
    this.prclfichagener=this;
    setName("prclfichagener");
    setTitle("Ficha general");
    setLayout(new LayoutSplit(LayoutSplit.VERTICAL,0.32));
    setLocation(new Location());
    addForm(vdatosafiliacio=new FormVdatosafiliacio(this));
    addForm(vdomicilioenv=new FormVdomicilioenv(this));
    addForm(vdatosbancarios=new FormVdatosbancarios(this));
    addForm(valtadatosbanc=new FormValtadatosbanc(this));
    addForm(vrepresent=new FormVrepresent(this));
    addForm(vcargorepre=new FormVcargorepre(this));
    addForm(vnifes=new FormVnifes(this));
    addForm(vcdp=new FormVcdp(this));
    addForm(vservicios=new FormVservicios(this));
    addForm(vcontrasenya=new FormVcontrasenya(this));
    addForm(vserviciosdet=new FormVserviciosdet(this));
    addForm(vnifrepresentan=new FormVnifrepresentan(this));
    addForm(vcambiobanco=new FormVcambiobanco(this));
    addForm(vcendbancos=new FormVcendbancos(this));
    addForm(vdomi=new FormVdomi(this));
    vcargorepre.btotrosdatos.setForm(vnifrepresentan);
    }
  public ProgPrclfichagener(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    ControlPanel cp=new ControlPanel(this);
    cp.setLocation(new LocationSplit(LocationSplit.BOTTOM));
    //cp.setLocation(new LocationBorder(LocationBorder.SOUTH));
    cp.setLayout(new LayoutTabbed());
    LocationTabbed loc;
    
    //primera pestaña
    loc=new LocationTabbed();
    loc.setTitle("Datos de la afiliación");
    loc.setExitIcon(false);
    vdomicilioenv.setLocation(loc);
    vdomicilioenv.setModal(false);
    vdomicilioenv.setParent(cp);
    
    //segunda pestaña
    loc=new LocationTabbed();
    loc.setTitle("Datos Bancarios");
    loc.setExitIcon(false);
    vdatosbancarios.setLocation(loc);
    vdatosbancarios.setModal(false);
    vdatosbancarios.setParent(cp);
    
    //tercera pestaña
    ControlPanel cpi=new ControlPanel(this);
    loc=new LocationTabbed();
    loc.setTitle("Representantes");
    loc.setExitIcon(false);
    
    cpi.setLocation(loc);
    //cpi.setLayout(new LayoutBorder());
    cpi.setLayout(new LayoutGridBag());
    cpi.setParent(cp);
    
    LocationGridBag locgb=new LocationGridBag();
    locgb.setWidth(LocationGridBag.REMAINDER);
    locgb.setHeight(1);
    locgb.setWeightx(1);
    locgb.setWeighty(1);
    locgb.setFill(LocationGridBag.BOTH);
    locgb.setAnchor(LocationGridBag.CENTER);
    
    //arriba
    //vrepresentantes.setLocation(new LocationBorder(LocationBorder.NORTH));
    vrepresent.setModal(false);
    vrepresent.setParent(cpi);
    vrepresent.setLocation(locgb);
    
    //abajo
    LocationGridBag locgb2=new LocationGridBag();
    locgb2.setWidth(LocationGridBag.REMAINDER);
    locgb2.setHeight(LocationGridBag.REMAINDER);
    locgb2.setWeightx(1);
    locgb2.setWeighty(3);
    locgb2.setFill(LocationGridBag.BOTH);
    locgb2.setAnchor(LocationGridBag.CENTER);
    //vcargorepre.setLocation(new LocationBorder(LocationBorder.CENTER));
    vcargorepre.setModal(false);
    vcargorepre.setParent(cpi);
    vcargorepre.setLayout(new LayoutHtml("mae/easp/html/cargorepre.html"));
    vcargorepre.setLocation(locgb2);
    
    //cuarta pestaña
    /*
    loc=new LocationTabbed();
    loc.setTitle("Servicios");
    loc.setExitIcon(false);
    vservicios.setLocation(loc);
    vservicios.setModal(false);
    vservicios.setParent(cp);
    */
    ControlPanel cpiserv=new ControlPanel(this);
    loc=new LocationTabbed();
    loc.setTitle("Servicios");
    loc.setExitIcon(false);
    
    cpiserv.setLocation(loc);
    cpiserv.setLayout(new LayoutBorder());
    cpiserv.setParent(cp);
    
    //esquerre
    vservicios.setLocation(new LocationBorder(LocationBorder.NORTH));
    vservicios.setModal(false);
    vservicios.setParent(cpiserv);
    vservicios.setLayout(new LayoutHtml("mae/easp/html/datosservicios.html"));
    
    //dreta
    vserviciosdet.setLocation(new LocationBorder(LocationBorder.CENTER));
    vserviciosdet.setModal(false);
    vserviciosdet.setParent(cpiserv);
    
    //paginas web asociadas
    vdatosafiliacio.setLayout(new LayoutHtml("mae/easp/html/datosafiliacion.html"));
    vdomicilioenv.setLayout(new LayoutHtml("mae/easp/html/domicilioenv2.html"));
    vnifrepresentan.setLayout(new LayoutHtml("mae/easp/html/datosrepre.html"));
    //vnifes.setLayout(new LayoutHtml("mae/easp/html/datosafiliacionpro.html"));
    
    if (alta) {
      modo=1;
      snifes.setWhere("cdpnifcif='"+vnifcif+"'");
      snifes.execute();
      System.out.println("EL vnifcif es:"+vnifcif);
      if (snifes.isEof())
        abrirVNifes(1);
      else
        abrirVCDP(1);
    
      snifes.setWhere(null);
      if (codiCDP==null) {
        vdatosafiliacio.exit();
        prclfichagener.exit();
        return;
      }
      vdatosafiliacio.doShow();
      alta=false;
    }
    else {
        snifes.execute();
        if ("S".equals(snifes.cdpckconta.getString()) && !"CON".equals(aplicacion)) tieneJCONTA=true;
        if ("S".equals(snifes.cdpckiss.getString()) && !"ISS".equals(aplicacion)) tieneJISS=true;
        if ("S".equals(snifes.cdpckeo.getString()) && !"EOS".equals(aplicacion)) tieneJEO=true;
        if ("S".equals(snifes.cdpckrenta.getString()) && !"REN".equals(aplicacion)) tieneJRENTA = true;
    }
    
    
    //APPAU 13-12-2012 Nuevo , para controlar los bancos en jNomina & jGestion
    vcambiobanco.setLayout(new LayoutHtml("mae/easp/html/cambiobanco.html"));
    ErrorManager defaultErrorManager=Aplication.getAplication().getErrorManager();
    try {
      Aplication.getAplication().setErrorManager(null);
      connJNomina = Easp.getConnexio("laboral",Easp.connEA) ;
      }
    catch(Exception e ) {
      System.out.println("Error conexion jNomina");
      }
    Aplication.getAplication().setErrorManager(defaultErrorManager);
    
    if ( connJNomina == null ) {
        // vdatosbancarios.acbancosjnomina.setVisible(false);
      }
    else {
      scendbancos.setDb(connJNomina);
      }
    vcendbancos.setInitState(DataForm.SHOW);
    
    
    
    Selector sbds = new Selector(Easp.connEA);
    sbds.execute("Select * from BDS where bdnombre = 'bdexpe'");
    if ( sbds.next() ) {
      tieneJGestion = true ;
      // vdatosbancarios.acbancosjgestio.setVisible(true);
      vdomi.setInitState(DataForm.SHOW);
    }
    else {
      // vdatosbancarios.acbancosjgestio.setVisible(false);
      }
    sbds.close();
    
    super.onInit();
    
    }
  public void onExit()
    {
    if ( connJNomina != null ) {
      connJNomina.disconnect();
      }
    
    super.onExit();
    }
  }
  
