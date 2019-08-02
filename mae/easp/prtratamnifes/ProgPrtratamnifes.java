// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Fri Aug 02 10:46:46 CEST 2019
// 
// Aplicación: easp
// 
package mae.easp.prtratamnifes;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
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
    // GLOBALES: PROGRAMA
    public boolean alta=false;
public int modo=0;
public String vnifcif=null;
public String aplicacion=null;
public String codiCDP=null;
public boolean esDP=false;
public int nuevoCodiCDP=0;

public boolean noCargues = false ;

public boolean gAltaEfectuada = false ;
public boolean esAndorra = false;
    // Metodos
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
        // GLOBALES: VENTANA
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
        if (aplicacion!=null && codiCDP!=null && codiCDP.length()==12) {
          Update u = new Update(getDataBase(),"CDP");          
          if (aplicacion.equals("CON"))
            u.valor("cdpckconta","S");
          else if (aplicacion.equals("NOM"))
            u.valor("cdpcknomina","S");
          else if (aplicacion.equals("EOS"))
            u.valor("cdpckeo","S");
          else if (aplicacion.equals("ISS"))
            u.valor("cdpckiss","S");
          else if (aplicacion.equals("REN"))
            u.valor("cdpckrenta","S");
          else if (aplicacion.equals("EXP"))
            u.valor("cdpckgestion","S");
          u.execute("cdpcodi='"+codiCDP+"'"); 
        }
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
        // Metodos
        // Controles
        public CtrlDanifcif danifcif;
        public CtrlDatfisicajuri datfisicajuri;
        public CtrlDatipf datipf;
        public CtrlChcbienes chcbienes;
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
        public CtrlCdpaeatdele cdpaeatdele;
        public CtrlCdpaeatadm cdpaeatadm;
        public CtrlVcdpcodi vcdpcodi;
        public CtrlCdpbdcomuconta cdpbdcomuconta;
        public CtrlCdpref cdpref;
        public CtrlCdpcdprel cdpcdprel;
        public CtrlCdpobserv cdpobserv;
        public CtrlChomiterel chomiterel;
        // Acciones
        public LinkAaltaafinity aaltaafinity;
        public LinkAdomicilios adomicilios;
        // Fieldsets
        public FSetFs1 fs1;
        public FSetFs2a fs2a;
        public FSetFs2b fs2b;
        public FSetFs2c fs2c;
        public FSetF3 f3;
        public FSetF3a f3a;
        public FSetF3b f3b;
        public FSetF4a f4a;
        public FSetF4b f4b;
        class Location extends LocationGridBag
            {
            public Location( )
                {
                super();
                setWidth(REMAINDER);
                setHeight(REMAINDER);
                setWeightx(800.0);
                setWeighty(620.0);
                setFill(BOTH);
                setAnchor(CENTER);
                }
            }
            
        public class CtrlDanifcif extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            public Object getDefault ()
                {
                return vnifcif;
                
                }
            public void onChange ()
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
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlDatfisicajuri extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
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
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlDatipf extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatipf(Form form)
                {
                super(form);
                setName("datipf");
                setMessageHelp("Tipo de código identificador");
                setTitle("Tipo NIF");
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlChcbienes extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChcbienes(Form form)
                {
                super(form);
                setName("chcbienes");
                setMessageHelp("Tiene comunidad de bienes");
                setTitle("C. Bienes");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlDatapell1 extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                setTitle("Apellido 1 / Razón social");
                setType(STRING);
                setMaskInput("U");
                setLength(100);
                setPrintable(false);
                setField(snifes.datapell1);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                if (!isReading()) {
                  cdpref.setValue(getString());
                  omplirDatContacto(datfisicajuri.getString().equals("F"), getString(), datapell2.getString(),datnombre.getString());
                  }
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlDatapell2 extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatapell2(Form form)
                {
                super(form);
                setName("datapell2");
                setTitle("Apellido 2");
                setType(STRING);
                setMaskInput("U");
                setLength(25);
                setPrintable(false);
                setField(snifes.datapell2);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                if (!isReading())
                  omplirDatContacto(datfisicajuri.getString().equals("F"),
                      datapell1.getString(), datapell2.getString(),datnombre.getString());
                }
            }
            
        public class CtrlDatnombre extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatnombre(Form form)
                {
                super(form);
                setName("datnombre");
                setTitle("Nombre");
                setType(STRING);
                setMaskInput("U");
                setLength(20);
                setPrintable(false);
                setField(snifes.datnombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                if (!isReading())
                  omplirDatContacto(datfisicajuri.getString().equals("F"),
                      datapell1.getString(), datapell2.getString(),datnombre.getString());
                }
            public boolean obligate ()
                {
                return datfisicajuri.getString().equals("F");
                }
            }
            
        public class CtrlDatletraseti extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                setTitle("Letras AEAT");
                setType(STRING);
                setMaskInput("U");
                setLength(4);
                setPrintable(false);
                setField(snifes.datletraseti);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatnacional extends ControlComboBox
            {
            public mae.easp.general.pkpaises.PickPkpaises pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return new Integer(108);
                }
            }
            
        public class CtrlDatemail extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(40);
                    }
                }
                
            public CtrlDatemail(Form form)
                {
                super(form);
                setLook(new Look());
                setName("datemail");
                setTitle("Email");
                setType(STRING);
                setLength(100);
                setPrintable(false);
                setField(snifes.datemail);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatcontacto extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatcontacto(Form form)
                {
                super(form);
                setName("datcontacto");
                setTitle("Persona contacto");
                setType(STRING);
                setMaskInput("U");
                setLength(30);
                setPrintable(false);
                setField(snifes.datcontacto);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDattel extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDattel(Form form)
                {
                super(form);
                setName("dattel");
                setTitle("Teléfono");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                setField(snifes.dattel);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatfax(Form form)
                {
                super(form);
                setName("datfax");
                setTitle("Fax");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                setField(snifes.datfax);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatmovil(Form form)
                {
                super(form);
                setName("datmovil");
                setTitle("Móvil");
                setType(INTEGER);
                setLength(9);
                setPrintable(false);
                setField(snifes.datmovil);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatsiglas extends ControlComboBox
            {
            public mae.easp.general.pksiglas.PickPksiglas pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if ("ISS".equals(aplicacion)) return false;
                return true;
                }
            }
            
        public class CtrlDatvia extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if ("ISS".equals(aplicacion)) return false;
                return true;
                }
            }
            
        public class CtrlDatnum extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatnum(Form form)
                {
                super(form);
                setName("datnum");
                setTitle("Número");
                setType(STRING);
                setLength(4);
                setPrintable(false);
                setField(snifes.datnum);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatesc extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatpiso extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatletra extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatprov extends ControlComboBox
            {
            public mae.easp.general.pkprovincias.PickPkprovincias pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                if (!isReading())
                  datpobla.setValue(datmuni.pickup.smunicipios.mudesc.getString());
                }
            }
            
        public class CtrlDatpobla extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatcpos extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatcpos(Form form)
                {
                super(form);
                setName("datcpos");
                setTitle("Código Postal");
                setType(STRING);
                setLength(5);
                setPrintable(false);
                setField(snifes.datcpos);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (!esAndorra && !Util.isNumero(getString())) {
                  setMessageWarning("Sólo se admiten caracteres numéricos (y sin espacios)");
                  return false;
                  }
                else if (!esAndorra && !isNull() && getString().length()  > 1 && !Util.formateoNumero("00",datprov.getInteger()).equals(getString().substring(0,2))) {
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return new Integer(108);
                }
            }
            
        public class CtrlCdpaeatdele extends ControlComboBox
            {
            public mae.easp.general.pkdelegaciones.PickPkdelegaciones pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCdpaeatdele(Form form)
                {
                super(form);
                setName("cdpaeatdele");
                setTitle("Delegación AEAT");
                setType(INTEGER);
                setMaskInput("99");
                setPickUp(pickup=new mae.easp.general.pkdelegaciones.PickPkdelegaciones(this));
                setLength(2);
                setPrintable(false);
                setField(snifes.acdpaeatdele);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                  cdpaeatadm.setNull();
                  cdpaeatadm.pickup.sadministracion.setWhere(null);
                  cdpaeatadm.pickup.delegacion=getInteger();
                  cdpaeatadm.refresh();
                }
            public boolean obligate ()
                {
                if ("ISS".equals(aplicacion)) return false;
                if (esAndorra) return false;
                return true;
                }
            }
            
        public class CtrlCdpaeatadm extends ControlComboBox
            {
            public mae.easp.general.pkadministracio.PickPkadministracio pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCdpaeatadm(Form form)
                {
                super(form);
                setName("cdpaeatadm");
                setTitle("Administración AEAT");
                setType(INTEGER);
                setMaskInput("999");
                setPickUp(pickup=new mae.easp.general.pkadministracio.PickPkadministracio(this));
                setLength(3);
                setPrintable(false);
                setField(snifes.cdpaeatadm);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if ("ISS".equals(aplicacion)) return false;
                if (esAndorra) return false;
                return true;
                }
            }
            
        public class CtrlVcdpcodi extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVcdpcodi(Form form)
                {
                super(form);
                setName("vcdpcodi");
                setTitle("Número empresa");
                setType(DOUBLE);
                setMaskInput("999999");
                setProtect(true);
                setLength(6);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            public Object getDefault ()
                {
                  snumeraciones.execute();
                  if (!snumeraciones.isEof()) 
                     nuevoCodiCDP=snumeraciones.numcodigo.getInteger()+1;
                  else
                     nuevoCodiCDP=1;
                  return new Integer(nuevoCodiCDP);
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlCdpbdcomuconta extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                if (Aplication.getAplication().getDataBase().getDB().getType().equals("access"))
                  return "N";
                else
                  return "S";
                }
            }
            
        public class CtrlCdpref extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCdpcdprel extends ControlComboBox
            {
            public mae.easp.general.pkcdp.PickPkcdp pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCdpcdprel(Form form)
                {
                super(form);
                setName("cdpcdprel");
                setMessageHelp("Código Afinity del cliente para el intercambio de datos");
                setTitle("Relacionado con");
                setType(STRING);
                setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
                setLength(12);
                setPrintable(false);
                setField(snifes.cdpcdprel);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                  super.onChange();
                }
                                
                public void userChange(Value v ) {
                  super.userChange(v);
                  if(v!=null && !v.getString().trim().equals("")) {
                    chomiterel.setEnabled(true);
                  }
                  else {
                    chomiterel.setValue(false);
                    chomiterel.setEnabled(false);
                  }
                }
            }
            
        public class CtrlCdpobserv extends ControlEditPane
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlChomiterel extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChomiterel(Form form)
                {
                super(form);
                setName("chomiterel");
                setMessageHelp("Omitir campo cdp relacionado para gestiones e-Mir y e-Portem");
                setTitle("Omitir campo cdp relacionado para gestiones e-Mir y e-Portem");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                return new Boolean(false);
                }
            }
            
        public class LinkAaltaafinity extends Action
            {
            public LinkAaltaafinity(Form form)
                {
                super(form);
                setName("aaltaafinity");
                setTitle("&Alta en Afinity Web");
                // SET: ACCION
                setOptions(SHOW | UPDATE);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                if ( vnifes.getNumState()==DataForm.INSERT || vnifes.getNumState()==DataForm.UPDATE  ) {
                  if ( !vnifes.onOk()  )  return ;
                }
                String cdpcdpcdp =Easp.buscaCDP(danifcif.getString());
                if ( cdpcdpcdp==null ) Easp.grabarDatosAfinity(danifcif.getString(),true);
                else Maefc.message("Este cliente ya existe en Afinity Web con el código: "+cdpcdpcdp,"Atención",Maefc.INFORMATION_MESSAGE);
                }
            }
            
        public class LinkAdomicilios extends Action
            {
            public LinkAdomicilios(Form form)
                {
                super(form);
                setName("adomicilios");
                setTitle("&Gestión de domicilios (Fiscal, notificaciones y social)");
                // SET: ACCION
                setOptions(SHOW | UPDATE);
                }
            // EVENT: ACCION
            public void onAction ()
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
            
        public class FSetFs1 extends Fieldset
            {
            public FSetFs1(Form form)
                {
                super(form);
                setTitulo("Identificación");
                addControl(danifcif);
                addControl(datapell1);
                addControl(datapell2);
                addControl(datnombre);
                getWebProperties().setXPad (30);
                getWebProperties().setNumCols (4);
                getWebProperties().setPosTitulo ("T");
                }
            }
            
        public class FSetFs2a extends Fieldset
            {
            public FSetFs2a(Form form)
                {
                super(form);
                addControl(datfisicajuri);
                addControl(datipf);
                addControl(chcbienes);
                getWebProperties().setAnchoColumnas (4);
                getWebProperties().setSizeSeparacionT (0);
                getWebProperties().setSizeSeparacionR (0);
                }
            }
            
        public class FSetFs2b extends Fieldset
            {
            public FSetFs2b(Form form)
                {
                super(form);
                addControl(datletraseti);
                addControl(datnacional);
                addControl(datcontacto);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (4);
                getWebProperties().setSizeSeparacionT (0);
                getWebProperties().setSizeSeparacionR (0);
                }
            }
            
        public class FSetFs2c extends Fieldset
            {
            public FSetFs2c(Form form)
                {
                super(form);
                addControl(datemail);
                addControl(dattel);
                addControl(datfax);
                addControl(datmovil);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (4);
                getWebProperties().setSizeSeparacionT (0);
                }
            }
            
        public class FSetF3 extends Fieldset
            {
            public FSetF3(Form form)
                {
                super(form);
                setTitulo("Dirección");
                addControl(datsiglas);
                addControl(datvia);
                addControl(datnum);
                addControl(datesc);
                addControl(datpiso);
                addControl(datletra);
                getWebProperties().setXPad (19);
                getWebProperties().setNumCols (6);
                getWebProperties().setSizeSeparacionB (0);
                getWebProperties().setPosTitulo ("T");
                }
            }
            
        public class FSetF3a extends Fieldset
            {
            public FSetF3a(Form form)
                {
                super(form);
                addControl(datprov);
                addControl(datmuni);
                addControl(datcpos);
                getWebProperties().setAnchoColumnas (6);
                getWebProperties().setSizeSeparacionT (0);
                getWebProperties().setSizeSeparacionR (0);
                }
            }
            
        public class FSetF3b extends Fieldset
            {
            public FSetF3b(Form form)
                {
                super(form);
                addControl(datpobla);
                addControl(datpais);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (6);
                getWebProperties().setSizeSeparacionT (0);
                }
            }
            
        public class FSetF4a extends Fieldset
            {
            public FSetF4a(Form form)
                {
                super(form);
                setTitulo("Datos CDP");
                addControl(cdpaeatdele);
                addControl(cdpaeatadm);
                addControl(vcdpcodi);
                addControl(cdpbdcomuconta);
                addControl(cdpcdprel);
                addControl(chomiterel);
                getWebProperties().setAnchoColumnas (6);
                getWebProperties().setCheckInv (true);
                }
            }
            
        public class FSetF4b extends Fieldset
            {
            public FSetF4b(Form form)
                {
                super(form);
                setTitulo("Observaciones");
                addControl(cdpobserv);
                getWebProperties().setAnchoColumnas (6);
                getWebProperties().setLabelVisible (false);
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
            // SET: VENTANA
            addSelect(snifes=new Snifes());
            addSelect(snifrep=new Snifrep());
            addSelect(snumeraciones=new Snumeraciones());
            addSelect(snumcheck=new Snumcheck());
            addSelect(scdprep=new Scdprep());
            addControl(danifcif=new CtrlDanifcif(this));
            addControl(datfisicajuri=new CtrlDatfisicajuri(this));
            addControl(datipf=new CtrlDatipf(this));
            addControl(chcbienes=new CtrlChcbienes(this));
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
            addControl(cdpaeatdele=new CtrlCdpaeatdele(this));
            addControl(cdpaeatadm=new CtrlCdpaeatadm(this));
            addControl(vcdpcodi=new CtrlVcdpcodi(this));
            addControl(cdpbdcomuconta=new CtrlCdpbdcomuconta(this));
            addControl(cdpref=new CtrlCdpref(this));
            addControl(cdpcdprel=new CtrlCdpcdprel(this));
            addControl(cdpobserv=new CtrlCdpobserv(this));
            addControl(chomiterel=new CtrlChomiterel(this));
            addAction(aaltaafinity=new LinkAaltaafinity(this));
            addAction(adomicilios=new LinkAdomicilios(this));
            addFieldset(fs1=new FSetFs1(this));
            addFieldset(fs2a=new FSetFs2a(this));
            addFieldset(fs2b=new FSetFs2b(this));
            addFieldset(fs2c=new FSetFs2c(this));
            addFieldset(f3=new FSetF3(this));
            addFieldset(f3a=new FSetF3a(this));
            addFieldset(f3b=new FSetF3b(this));
            addFieldset(f4a=new FSetF4a(this));
            addFieldset(f4b=new FSetF4b(this));
            setSelect(snifes);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            snifes.cdp.setCheckDuplicates(true);
            snifes.nifes.setCheckDuplicates(true);
            datipf.setDescriptionLength(24);
            if (esAndorra) datipf.addItem("8/NRT - Andorra");
if ("CON".equals(aplicacion))
              cdpbdcomuconta.setEnabled(true);
            else
              cdpbdcomuconta.setEnabled(false);
            datapell1.setTrim(false);
            super.onInit();
            }
        public boolean onOkInsert ()
            {
            noCargues = true ;
            if (super.onOkInsert()){
              vnifcif=danifcif.getString();
              Easp.nifCDP=vnifcif;//variable global para que sea utilizada en MODELOS
              codiCDP=Easp.codiDP.substring(0,6)+Util.formateoNumero("000000",vcdpcodi.getInteger());
              Maefc.message("Alta realizada.\nNuevo código generado: "+vcdpcodi.getInteger(),"Información",Maefc.INFORMATION_MESSAGE);
              noCargues=false;
              gAltaEfectuada = true ;
              Easp.actualizarDomicilioFiscal(vnifcif);
              Easp.connEA.commit();
              return true;
              }
            else {
              Easp.nifCDP=null;//variable global para que sea utilizada en MODELOS
              noCargues=false;
              return false;
              }
            }
        public boolean onOkUpdate ()
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
        public void onBeginRecord ()
            {
            super.onBeginRecord();
            chcbienes.setValue(snifes.datcbienes.getString().equals("S"));
            vcdpcodi.setValue(Integer.parseInt(snifes.cdpcodi.getString().substring(6)));
            
            chomiterel.setValue(snifes.cdpomiterel.getString() != null && !snifes.cdpomiterel.getString().trim().equals("") && !snifes.cdpomiterel.getString().trim().equals("N"));
            chomiterel.setEnabled(!cdpcdprel.isNull() && !cdpcdprel.getString().trim().equals(""));
            }
        }
        
    // select para el cdp con su nif
    public class Snifes extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
        public Field cdpomiterel;
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
            // GLOBALES: TABLA
            // Metodos
            public Nifes(Select select)
                {
                super(select);
                setName("nifes");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onInsert ()
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
                  if(vnifes.chomiterel.getBoolean()) {
                    cdpomiterel.setValue("S");
                  }
                  else {
                    cdpomiterel.setValue("N");
                  }
                
                
                
                  if (esDP)
                    datipo.setValue("D");
                  else
                    datipo.setValue("C");
                  return super.onInsert();
                  }
                }
            public boolean onUpdate ()
                {
                if (vnifes.chcbienes.getBoolean())
                  datcbienes.setValue("S");
                else
                  datcbienes.setValue("N");
                
                  if(vnifes.chomiterel.getBoolean()) {
                    cdpomiterel.setValue("S");
                  }
                  else {
                    cdpomiterel.setValue("N");
                  }
                
                return super.onUpdate();
                }
            }
            
        class Cdp extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Cdp(Select select)
                {
                super(select);
                setName("cdp");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onInsert ()
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
            public boolean onUpdate ()
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
            // SET: SELECT
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
            addField(cdpomiterel=new Field(this,cdp,"cdpomiterel"));
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
        // GET: SELECT
        public String getWhere ()
            {
            return "cdpcodi='"+codiCDP+"'";
            }
        // EVENT: SELECT
        }
        
    // select para saber si existe el nif
    public class Snifrep extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Nifes(Select select)
                {
                super(select);
                setName("nifes");
                setOptions(READ);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Snifrep()
            {
            setName("snifrep");
            // SET: SELECT
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
        // GET: SELECT
        // EVENT: SELECT
        }
        
    // Búsqueda del nou codi de CDP/Empresa
    public class Snumeraciones extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Numeraciones numeraciones;
        // Campos
        public Field numaplic;
        public Field numcodigo;
        public Field numdominio;
        class Numeraciones extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Numeraciones(Select select)
                {
                super(select);
                setName("numeraciones");
                setOptions(READ | INSERT | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onInsert ()
                {
                numdominio.setValue(Easp.dominio);
                numaplic.setValue("GENERAL");
                numcodigo.setValue(1);
                return super.onInsert();
                }
            public boolean onUpdate ()
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
            // SET: SELECT
            addTable(numeraciones=new Numeraciones(this));
            addField(numaplic=new Field(this,numeraciones,"numaplic"));
            addField(numcodigo=new Field(this,numeraciones,"numcodigo"));
            addField(numdominio=new Field(this,numeraciones,"numdominio"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "RTRIM(numaplic) = 'GENERAL'";
            }
        // EVENT: SELECT
        }
        
    // select para comprobar numeros
    public class Snumcheck extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Numeraciones numeraciones;
        // Campos
        public Field numaplic;
        public Field numcodigo;
        public Field numdominio;
        class Numeraciones extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Numeraciones(Select select)
                {
                super(select);
                setName("numeraciones");
                setOptions(READ);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Snumcheck()
            {
            setName("snumcheck");
            // SET: SELECT
            addTable(numeraciones=new Numeraciones(this));
            addField(numaplic=new Field(this,numeraciones,"numaplic"));
            addField(numcodigo=new Field(this,numeraciones,"numcodigo"));
            addField(numdominio=new Field(this,numeraciones,"numdominio"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "RTRIM(numaplic) = 'GENERAL'";
            }
        // EVENT: SELECT
        }
        
    // select para mirar si un cdp existe
    public class Scdprep extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Cdp cdp;
        // Campos
        public Field cdpcodi;
        class Cdp extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Cdp(Select select)
                {
                super(select);
                setName("cdp");
                setOptions(READ);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Scdprep()
            {
            setName("scdprep");
            // SET: SELECT
            addTable(cdp=new Cdp(this));
            addField(cdpcodi=new Field(this,cdp,"cdpcodi"));
            }
        // GET: SELECT
        public String getOrder ()
            {
            if ("ISS".equals(aplicacion)) return "cdpckiss DESC,cdpckconta DESC,cdpckeo DESC,cdpcodi ASC";
            else if ("EOS".equals(aplicacion)) return "cdpckeo DESC,cdpcodi ASC";
            else if ("CON".equals(aplicacion)) return "cdpckconta DESC,cdpckiss DESC,cdpcodi ASC";
            else return "cdpcodi ASC";
            }
        // EVENT: SELECT
        }
        
    public ProgPrtratamnifes()
        {
        this.prtratamnifes=this;
        setName("prtratamnifes");
        setTitle("Datos de afiliación");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vnifes=new FormVnifes(this));
        }
    public ProgPrtratamnifes(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        //if (esDP)
          vnifes.setLayout(new LayoutHtml("mae/easp/html/datosafiliacionprodp.html"));
        //else
        //  vnifes.setLayout(new LayoutHtml("mae/easp/html/datosafiliacionprocdp.html"));
        esAndorra = "JCONTA-AND".equals(Aplication.getAplication().getConfig("Servicio")) || "S".equals(Aplication.getAplication().getConfig("ANDORRA"));
super.onInit();
        }
    }
    
