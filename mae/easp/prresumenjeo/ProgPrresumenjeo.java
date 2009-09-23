// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090923
// Hora:             11:20:50
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prresumenjeo;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prresumenjeo
// Nombre:   Datos de afiliación
// Versión:  4.1
// 
public class ProgPrresumenjeo extends Program
  {
  public AppEasp easp;
  public ProgPrresumenjeo prresumenjeo;
  // Inicio declaraciones globales
  public String codiCDP=null;
  
  
  
  // Fin declaraciones globales
  // Ventana
  public FormVnifes vnifes;
  // Selects
  public Snifes snifes;
  public Snifrep snifrep;
  // Ventana
  public FormVdatosbancarios vdatosbancarios;
  // Selects
  public Sbancos sbancos;
  public Sasignaciones sasignaciones;
  public Sbancocli sbancocli;
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
    boolean esFisica=false;
    
    public void esFisica(boolean estat){
      datapell2.setEnabled(estat);
      datnombre.setEnabled(estat);
      chcbienes.setEnabled(!estat);
      }
    
    public void onEdit(){
      super.onEdit();
      esFisica(snifes.datfisicajuri.getString().equals("F"));
      }
    
    public void onOpened(){
      super.onOpened();
      doEdit();
      }
    
    public void cargarDatosNIF(){
      datfisicajuri.setValue(snifrep.datfisicajuri);
      chcbienes.setValue(snifrep.datcbienes.getString().equals("S"));
      datipf.setValue(snifrep.datipf);
      datapell1.setValue(snifrep.datapell1);
      datapell2.setValue(snifrep.datapell2);
      datnombre.setValue(snifrep.datnombre);
      datemail.setValue(snifrep.datemail);
      dattel.setValue(snifrep.dattel);
      datfax.setValue(snifrep.datfax);
      datcpos.setValue(snifrep.datcpos);
      datesc.setValue(snifrep.datesc);
      datletra.setValue(snifrep.datletra);
      datpobla.setValue(snifrep.datpobla);
      datnum.setValue(snifrep.datnum);
      datpais.setValue(snifrep.datpais);
      datpiso.setValue(snifrep.datpiso);
      datsiglas.setValue(snifrep.datsiglas);
      datvia.setValue(snifrep.datvia);
      datcontacto.setValue(snifrep.datcontacto);
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
    public CtrlDatpobla datpobla;
    public CtrlDatcpos datcpos;
    public CtrlDatpais datpais;
    public CtrlCdpaeatdele cdpaeatdele;
    public CtrlCdpaeatadm cdpaeatadm;
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
        setProtect(true);
        setLength(15);
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
      public CtrlDatapell1(Form form)
        {
        super(form);
        setName("datapell1");
        setTitle("ape1");
        setType(STRING);
        setMaskInput("U");
        setLength(40);
        setPrintable(false);
        setField(snifes.datapell1);
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
      public boolean obligate()
        {
        return datfisicajuri.getString().equals("F");
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
      
    public class CtrlCdpaeatdele extends ControlEdit
      {
      public CtrlCdpaeatdele(Form form)
        {
        super(form);
        setName("cdpaeatdele");
        setTitle("eatdele");
        setType(INTEGER);
        setMaskInput("99");
        setLength(2);
        setPrintable(false);
        setField(snifes.acdpaeatdele);
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
        setMaskInput("999");
        setPickUp(pickup=new mae.easp.general.pkadministracio.PickPkadministracio(this));
        setLength(3);
        setPrintable(false);
        setField(snifes.cdpaeatadm);
        }
      }
      
    public FormVnifes(ProgPrresumenjeo prresumenjeo)
      {
      super(prresumenjeo);
      setName("vnifes");
      setLocation(new Location());
      setStates(SHOW);
      setPrintable(false);
      setUnique(true);
      addSelect(snifes=new Snifes());
      addSelect(snifrep=new Snifrep());
      addControl(danifcif=new CtrlDanifcif(this));
      addControl(datfisicajuri=new CtrlDatfisicajuri(this));
      addControl(chcbienes=new CtrlChcbienes(this));
      addControl(datipf=new CtrlDatipf(this));
      addControl(datapell1=new CtrlDatapell1(this));
      addControl(datapell2=new CtrlDatapell2(this));
      addControl(datnombre=new CtrlDatnombre(this));
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
      addControl(datpobla=new CtrlDatpobla(this));
      addControl(datcpos=new CtrlDatcpos(this));
      addControl(datpais=new CtrlDatpais(this));
      addControl(cdpaeatdele=new CtrlCdpaeatdele(this));
      addControl(cdpaeatadm=new CtrlCdpaeatadm(this));
      setSelect(snifes);
      }
    public void onInit()
      {
      datipf.setDescriptionLength(24);
      datapell1.setTrim(false);
      super.onInit();
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
    public Cdp cdp;
    // Campos
    public Field acdpaeatdele;
    public Field adatprov;
    public Field cdpaeatadm;
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
    public Field cdpdominio;
    public Field cdpnifcif;
    public Field cdpobserv;
    public Field cdppwd;
    public Field cdppwdacc;
    public Field cdpref;
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
        setOptions(READ);
        }
      }
      
    class Cdp extends Table
      {
      public Cdp(Select select)
        {
        super(select);
        setName("cdp");
        setOptions(READ);
        }
      }
      
    public Snifes()
      {
      setName("snifes");
      addTable(nifes=new Nifes(this));
      addTable(cdp=new Cdp(this));
      addField(acdpaeatdele=new Field(this,cdp,"cdpaeatdele"));
      addField(adatprov=new Field(this,nifes,"datprov"));
      addField(cdpaeatadm=new Field(this,cdp,"cdpaeatadm"));
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
      addField(cdpdominio=new Field(this,cdp,"cdpdominio"));
      addField(cdpnifcif=new Field(this,cdp,"cdpnifcif"));
      addField(cdpobserv=new Field(this,cdp,"cdpobserv"));
      addField(cdppwd=new Field(this,cdp,"cdppwd"));
      addField(cdppwdacc=new Field(this,cdp,"cdppwdacc"));
      addField(cdpref=new Field(this,cdp,"cdpref"));
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
      return "cdpcodi='"+codiCDP+"'";
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
        setOptions(READ);
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
    
  public class FormVdatosbancarios extends MultiDataForm
    {
    // Controles
    public CtrlBccbanco bccbanco;
    public CtrlBccsucursal bccsucursal;
    public CtrlBccnumero bccnumero;
    public CtrlBccdigitos bccdigitos;
    public CtrlChiva chiva;
    public CtrlChirpf chirpf;
    public CtrlChpagosc chpagosc;
    public CtrlChsegsoc chsegsoc;
    public CtrlChliqanual chliqanual;
    // Acciones
    class Location extends LocationSplit
      {
      public Location( )
        {
        super();
        setLocation(BOTTOM);
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
      
    public class CtrlChsegsoc extends ColumnCheck
      {
      public CtrlChsegsoc(Form form)
        {
        super(form);
        setName("chsegsoc");
        setMessageHelp("Seguridad Social");
        setTitle("S.S.");
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
      
    public FormVdatosbancarios(ProgPrresumenjeo prresumenjeo)
      {
      super(prresumenjeo);
      setName("vdatosbancarios");
      setTitle("Datos Bancarios");
      setLocation(new Location());
      setStates(SHOW);
      setPrintable(false);
      addSelect(sbancos=new Sbancos());
      addSelect(sasignaciones=new Sasignaciones());
      addSelect(sbancocli=new Sbancocli());
      addControl(bccbanco=new CtrlBccbanco(this));
      addControl(bccsucursal=new CtrlBccsucursal(this));
      addControl(bccnumero=new CtrlBccnumero(this));
      addControl(bccdigitos=new CtrlBccdigitos(this));
      addControl(chiva=new CtrlChiva(this));
      addControl(chirpf=new CtrlChirpf(this));
      addControl(chpagosc=new CtrlChpagosc(this));
      addControl(chsegsoc=new CtrlChsegsoc(this));
      addControl(chliqanual=new CtrlChliqanual(this));
      setSelect(sbancocli);
      }
    public void onInit()
      {
      sbancocli.run(true);
      int nrows=sbancocli.getNumRows();
      int row=0;
      super.onInit();
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
      chsegsoc.setValue(false);
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
        else if (tipus.equals("TCS"))
          chsegsoc.setValue(true);
        else if (tipus.equals("100"))
          chliqanual.setValue(true);
        sasignaciones.next();
        }
      
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
        setOptions(READ);
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
      return "bcccodigo="+snifes.cdpcodi.getSQLFormat();
      }
    }
    
  public ProgPrresumenjeo()
    {
    this.prresumenjeo=this;
    setName("prresumenjeo");
    setTitle("Datos de afiliación");
    setLayout(new LayoutSplit(LayoutSplit.VERTICAL,0.60));
    setLocation(new Location());
    addForm(vnifes=new FormVnifes(this));
    addForm(vdatosbancarios=new FormVdatosbancarios(this));
    }
  public ProgPrresumenjeo(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    vnifes.setLayout(new LayoutHtml("mae/easp/html/datosresumenempresa.html"));
    super.onInit();
    }
  }
  
