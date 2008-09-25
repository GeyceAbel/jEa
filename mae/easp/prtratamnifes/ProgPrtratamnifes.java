// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20080925
// Hora:             11:33:19
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prtratamnifes;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prtratamnifes
// Nombre:   Datos de afiliación
// Versión:  4.1
// 
public class ProgPrtratamnifes extends Program
  {
  public AppEasp easp;
  public ProgPrtratamnifes prtratamnifes;
  // Inicio declaraciones globales
  public boolean alta=false;
  public int modo=0;
  public String vnifcif=null;
  public String aplicacion=null;
  public String codiCDP=null;
  public boolean esDP=false;
  public int nuevoCodiCDP=0;
  
  public boolean noCargues = false ;
  
  public boolean gAltaEfectuada = false ;
  // Fin declaraciones globales
  // Ventana
  public FormVnifes vnifes;
  // Selects
  public Snifes snifes;
  public Snifrep snifrep;
  public Snumeraciones snumeraciones;
  public Snumcheck snumcheck;
  public Scdprep scdprep;
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
    String nifValido=null;
    boolean actualizaNif=false;
    boolean esFisica=false;
    
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
    /*
    public boolean onOk(){
      if (super.onOk()) {
        //sgeneral.commit();
        //vnifes.exit();
        return true;
        }
      else
        return false;
      }
    */
    
    public boolean nifYaExiste(String nif){
      snifrep.setWhere("danifcif='"+nif+"'");
      snifrep.execute();
      if (!snifrep.isEof()) {
        if (nifCdpYaExiste(nif)) {
          String codCDP = scdprep.cdpcodi.getString();
          if (  codCDP.length() > 6 ) codCDP = codCDP.substring(6);
          if  ( Maefc.message("Ya existe una ficha con este nif y código "+codCDP+"\n\n¿Desea crear otra ficha con otro código?","Atención ",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION ) != Maefc.YES_OPTION ) {
            vnifcif = nif ;
            codiCDP = scdprep.cdpcodi.getString() ;
            doShow();
            }
          }
        actualizaNif=true;
        if ( !noCargues ) cargarDatosNIF();
        return true;
        }
      else {
        actualizaNif=false;
        return false;
        }
      }
    
    public void cargarDatosNIF(){
      datfisicajuri.setValue(snifrep.datfisicajuri);
      chcbienes.setValue(snifrep.datcbienes.getString().equals("S"));
      datipf.setValue(snifrep.datipf);
      datapell1.setValue(snifrep.datapell1);
      datapell2.setValue(snifrep.datapell2);
      datnombre.setValue(snifrep.datnombre);
      datletraseti.setValue(snifrep.datletraseti);
      datemail.setValue(snifrep.datemail);
      dattel.setValue(snifrep.dattel);
      datfax.setValue(snifrep.datfax);
      datcpos.setValue(snifrep.datcpos);
      datesc.setValue(snifrep.datesc);
      datletra.setValue(snifrep.datletra);
      datpobla.setValue(snifrep.datpobla);
      datprov.setValue(snifrep.datprov);
      datmuni.setValue(snifrep.datmuni);
      datnum.setValue(snifrep.datnum);
      datpais.setValue(snifrep.datpais);
      datpiso.setValue(snifrep.datpiso);
      datsiglas.setValue(snifrep.datsiglas);
      datvia.setValue(snifrep.datvia);
      datcontacto.setValue(snifrep.datcontacto);
      }
    
    public boolean nifExiste(String nif){
      snifrep.setWhere("danifcif='"+nif+"'");
      snifrep.execute();
      return !snifrep.isEof();
      }
    
    public boolean cdpYaExiste(String codi){
      scdprep.setWhere("cdpcodi='"+codi+"'");
      scdprep.execute();
      return !scdprep.isEof();
      }
    
    public boolean nifCdpYaExiste(String nif){
      scdprep.setWhere("cdpnifcif='"+nif+"'");
      scdprep.execute();
      if (!scdprep.isEof()){
        codiCDP=scdprep.cdpcodi.getString();
        return true;
        }
      else
        return false;
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
    public CtrlCdpaeatdele cdpaeatdele;
    public CtrlCdpaeatadm cdpaeatadm;
    public CtrlVcdpcodi vcdpcodi;
    public CtrlCdpbdcomuconta cdpbdcomuconta;
    public CtrlCdpref cdpref;
    public CtrlCdpcdprel cdpcdprel;
    public CtrlCdpobserv cdpobserv;
    // Acciones
    public LinkAaltaafinity aaltaafinity;
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
        setProtect(true);
        setLength(15);
        setPrintable(false);
        setField(snifes.danifcif);
        }
      public boolean  valid()
        {
        if (nifValido!=null && nifValido.equals(getString()))
          return true;
        if (getNumState()==DataForm.INSERT) {
          if (nifYaExiste(getString()))  return super.valid();
          }
        if (vnifcif==null) {
          nifValido=Util.esCIF(getString());
          if (nifValido==null)
            return false;
          else {
            danifcif.setValue(nifValido);
            if (nifYaExiste(nifValido)) return true;
            }
          }
        return super.valid();
        
        }
      public Object getDefault()
        {
        return vnifcif;
        
        
        }
      public void onChange()
        {
        super.onChange();
        if (!isReading()) {
          if (isNull()) {
            datipf.setNull();
            datfisicajuri.setNull();
          }
          else {
            String car=getString().substring(0,1);
            if (Util.isNumero(car) ||  ( car.equals("X") || car.equals("Y") || car.equals("Z")  ) ) 
              datfisicajuri.setValue("F");
            else
              datfisicajuri.setValue("J");
            if (car.equals("E") || car.equals("G") || car.equals("H") || car.equals("J")) 
               chcbienes.setValue(true);
            else 
               chcbienes.setValue(false);
        
            if (car.equals("X") || car.equals("Y") || car.equals("Z") )
              datipf.setValue("6");
            else if (Util.isNumero(car) && getString().length()==9)
              datipf.setValue("1");
            }
          }
        }
      public boolean obligate()
        {
        return true;
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
            esFisica=true;
            }
          else if (getString().equals("J")){
            datipf.setValue("9"); 
            datapell2.setNull();
            datnombre.setNull();
            datletraseti.setNull();
            esFisica=false;
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
      public void onChange()
        {
        super.onChange();
        if (!isReading()) {
          cdpref.setValue(getString());
          omplirDatContacto(datfisicajuri.getString().equals("F"), getString(), datapell2.getString(),datnombre.getString());
          }
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
        if (!isReading())
          omplirDatContacto(datfisicajuri.getString().equals("F"),
              datapell1.getString(), datapell2.getString(),datnombre.getString());
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
        if (!isReading())
          omplirDatContacto(datfisicajuri.getString().equals("F"),
              datapell1.getString(), datapell2.getString(),datnombre.getString());
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
      public Object getDefault()
        {
        return new Integer(108);
        }
      }
      
    public class CtrlDatemail extends ControlEdit
      {
      public CtrlDatemail(Form form)
        {
        super(form);
        setName("datemail");
        setTitle("email");
        setType(STRING);
        setLength(30);
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
            cdpaeatdele.setValue(getInteger());
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
      
    public class CtrlCdpaeatdele extends ControlComboBox
      {
      public mae.easp.general.pkdelegaciones.PickPkdelegaciones pickup;
      public CtrlCdpaeatdele(Form form)
        {
        super(form);
        setName("cdpaeatdele");
        setTitle("eatdele");
        setType(INTEGER);
        setMaskInput("99");
        setPickUp(pickup=new mae.easp.general.pkdelegaciones.PickPkdelegaciones(this));
        setLength(2);
        setPrintable(false);
        setField(snifes.acdpaeatdele);
        }
      public void onChange()
        {
        super.onChange();
          cdpaeatadm.setNull();
          cdpaeatadm.pickup.sadministracion.setWhere(null);
          cdpaeatadm.pickup.delegacion=getInteger();
          cdpaeatadm.refresh();
        
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
        setMaskInput("999");
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
      public boolean  valid()
        {
        if (Easp.codiDP!=null) {
          String noucdp=Easp.codiDP.substring(0,6)+Numero.format((double)getInteger(),"000000");
          if (cdpYaExiste(noucdp) && getNumState()==DataForm.INSERT) {
            setMessageWarning("El cliente ["+getInteger()+"] ya existe. \nEscriba otro código diferente");
            return false;
            }
          }
        return super.valid();
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
      
    public class CtrlCdpbdcomuconta extends ControlComboBox
      {
      public CtrlCdpbdcomuconta(Form form)
        {
        super(form);
        setName("cdpbdcomuconta");
        setTitle("BD Común");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setPrintable(false);
        addItem("S/Si (aconsejable para entornos SQL Server)");
        addItem("N/No (aconsejable para entornos ACCESS)");
        setField(snifes.cdpbdcomuconta);
        }
      public Object getDefault()
        {
        if (Aplication.getAplication().getDataBase().getDB().getType().equals("access"))
          return "N";
        else
          return "S";
        }
      }
      
    public class CtrlCdpref extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(35);
          }
        }
        
      public CtrlCdpref(Form form)
        {
        super(form);
        setLook(new Look());
        setName("cdpref");
        setMessageHelp("Referencia de la Actividad");
        setTitle("Referencia");
        setType(STRING);
        setMaskInput("U");
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
        setMessageHelp("Código Afinity del cliente para el intercambio de datos");
        setTitle("rel");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
        setLength(12);
        setPrintable(false);
        setField(snifes.cdpcdprel);
        }
      }
      
    public class CtrlCdpobserv extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(22);
          setHeight(7);
          }
        }
        
      public CtrlCdpobserv(Form form)
        {
        super(form);
        setLook(new Look());
        setName("cdpobserv");
        setMessageHelp("Observaciones");
        setTitle("Observaciones");
        setType(STRING);
        setLength(255);
        setPrintable(false);
        setField(snifes.cdpobserv);
        }
      }
      
    public class LinkAaltaafinity extends Action
      {
      public LinkAaltaafinity(Form form)
        {
        super(form);
        setName("aaltaafinity");
        setTitle("&Alta en Afinity Web");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        String cdpcdpcdp =Easp.buscaCDP(danifcif.getString());
        if ( cdpcdpcdp==null ) Easp.grabarDatosAfinity(danifcif.getString(),true);
        else Maefc.message("Este cliente ya existe en Afinity Web con el código: "+cdpcdpcdp,"Atención",Maefc.INFORMATION_MESSAGE);
        
        }
      }
      
    public FormVnifes(ProgPrtratamnifes prtratamnifes)
      {
      super(prtratamnifes);
      setName("vnifes");
      setLocation(new Location());
      setStates(SHOW | UPDATE | INSERT);
      setPrintable(false);
      setUnique(true);
      addSelect(snifes=new Snifes());
      addSelect(snifrep=new Snifrep());
      addSelect(snumeraciones=new Snumeraciones());
      addSelect(snumcheck=new Snumcheck());
      addSelect(scdprep=new Scdprep());
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
      addControl(cdpaeatdele=new CtrlCdpaeatdele(this));
      addControl(cdpaeatadm=new CtrlCdpaeatadm(this));
      addControl(vcdpcodi=new CtrlVcdpcodi(this));
      addControl(cdpbdcomuconta=new CtrlCdpbdcomuconta(this));
      addControl(cdpref=new CtrlCdpref(this));
      addControl(cdpcdprel=new CtrlCdpcdprel(this));
      addControl(cdpobserv=new CtrlCdpobserv(this));
      addAction(aaltaafinity=new LinkAaltaafinity(this));
      setSelect(snifes);
      }
    public void onInit()
      {
      snifes.cdp.setCheckDuplicates(true);
      snifes.nifes.setCheckDuplicates(true);
      datipf.setDescriptionLength(24);
      if ("CON".equals(aplicacion))
        cdpbdcomuconta.setEnabled(true);
      else
        cdpbdcomuconta.setEnabled(false);
      datapell1.setTrim(false);
      super.onInit();
      }
    public boolean onOkInsert()
      {
      noCargues = true ;
      if (super.onOkInsert()){
        vnifcif=danifcif.getString();
        Easp.nifCDP=vnifcif;//variable global para que sea utilizada en MODELOS
        codiCDP=Easp.codiDP.substring(0,6)+Util.formateoNumero("000000",vcdpcodi.getInteger());
        Maefc.message("Alta realizada.\nNuevo código generado: "+vcdpcodi.getInteger(),"Información",Maefc.INFORMATION_MESSAGE);
        noCargues=false;
        gAltaEfectuada = true ;
        return true;
        }
      else {
        Easp.nifCDP=null;//variable global para que sea utilizada en MODELOS
        noCargues=false;
        return false;
        }
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      chcbienes.setValue(snifes.datcbienes.getString().equals("S"));
      vcdpcodi.setValue(Integer.parseInt(snifes.cdpcodi.getString().substring(6)));
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
          if (vnifes.chcbienes.getBoolean())
            datcbienes.setValue("S");
          else
            datcbienes.setValue("N");
          if (esDP)
            datipo.setValue("D");
          else
            datipo.setValue("C");
          return super.onInsert();
          }
        }
      public boolean onUpdate()
        {
        if (vnifes.chcbienes.getBoolean())
          datcbienes.setValue("S");
        else
          datcbienes.setValue("N");
        return super.onUpdate();
        
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
        cdpdominio.setValue(Easp.dominio);
        cdpnifcif.setValue(vnifes.danifcif.getString());
        cdppwd.setNull();
        cdppwdacc.setNull();
        
        if (aplicacion!=null) {
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
          }
          //select para ver si hay que insertar registro en la tabla de numeraciones o editarlo
          snumcheck.execute();
        
          if (!snumcheck.isEof())
            snumeraciones.edit();
          else 
            snumeraciones.addNew();
          //digo yo que esto debería ir aquí en vez de antes de mirar si es Eof
          cdpcodi.setValue(Easp.codiDP.substring(0,6)+Util.formateoNumero("000000",vnifes.vcdpcodi.getInteger()));
        
          if (snumeraciones.save()) {
            codiCDP=cdpcodi.getString();
            return super.onInsert();
            }
          else
            return false;
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
    
  // Búsqueda del nou codi de CDP/Empresa
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
      addField(numdominio=new Field(this,numeraciones,"numdominio"));
      }
    public String getWhere()
      {
      return "RTRIM(numaplic) = 'GENERAL'";
      
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
      return "RTRIM(numaplic) = 'GENERAL'";
      }
    }
    
  // select para mirar si un cdp existe
  public class Scdprep extends Select
    {
    // Tablas
    public Cdp cdp;
    // Campos
    public Field cdpcodi;
    class Cdp extends Table
      {
      public Cdp(Select select)
        {
        super(select);
        setName("cdp");
        setOptions(READ);
        }
      }
      
    public Scdprep()
      {
      setName("scdprep");
      addTable(cdp=new Cdp(this));
      addField(cdpcodi=new Field(this,cdp,"cdpcodi"));
      }
    }
    
  public ProgPrtratamnifes()
    {
    this.prtratamnifes=this;
    setName("prtratamnifes");
    setTitle("Datos de afiliación");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vnifes=new FormVnifes(this));
    }
  public ProgPrtratamnifes(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    //if (esDP)
      vnifes.setLayout(new LayoutHtml("mae/easp/html/datosafiliacionprodp.html"));
    //else
    //  vnifes.setLayout(new LayoutHtml("mae/easp/html/datosafiliacionprocdp.html"));
    super.onInit();
    }
  }
  
