// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Wed Mar 30 10:34:21 CEST 2022
// 
// Aplicación: easp
// 
package mae.easp.prclfichagener;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
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
    // GLOBALES: PROGRAMA
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
public boolean esAndorra = false;

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
  loc.setWidth(1000);
  //if (esDP)
    loc.setHeight(645);
  //else
  //  loc.setHeight(380);
  loc.setLocation(loc.CENTER);
  pr.setLocation(loc);
  pr.esAndorra = esAndorra;
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
  pr.esAndorra = esAndorra;
  pr.run();
}

//fin globales
    // Metodos
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
    // Ventana
    public FormValtasfitgen valtasfitgen;
    // Selects
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
        // GLOBALES: VENTANA
        //public String nouCodiCdp=null;
//public String codiCDP=null;

public void onOpened(){
  super.onOpened();
  chomiterel.setEnabled(!cdpcdprel.isNull());
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
        // Metodos
        // Controles
        public CtrlVvcodigo vvcodigo;
        public CtrlDanifcif danifcif;
        public CtrlVcliente vcliente;
        public CtrlDatfisicajuri datfisicajuri;
        public CtrlDattel dattel;
        public CtrlDatfax datfax;
        public CtrlDatmovil datmovil;
        public CtrlDatemail datemail;
        public CtrlVadministracio vadministracio;
        public CtrlCdpcodi cdpcodi;
        public CtrlCdpcdprel cdpcdprel;
        public CtrlChomiterel chomiterel;
        // Acciones
        // Fieldsets
        public FSetFs1a fs1a;
        public FSetFs1b fs1b;
        public FSetFs1c fs1c;
        public FSetFs1d fs1d;
        public FSetFs2 fs2;
        public FSetFs3 fs3;
        class Location extends LocationSplit
            {
            public Location( )
                {
                super();
                setLocation(TOP);
                }
            }
            
        public class CtrlVvcodigo extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcodigo(Form form)
                {
                super(form);
                setName("vvcodigo");
                setTitle("Empresa");
                setType(INTEGER);
                setMaskInput("######");
                setLength(6);
                setEnabled(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDanifcif extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDanifcif(Form form)
                {
                super(form);
                setName("danifcif");
                setMessageHelp("NIF/CIF");
                setTitle("NIF / CIF");
                setType(STRING);
                setMaskInput("U");
                setLength(15);
                setEnabled(false);
                setPrintable(false);
                setField(sgeneral.danifcif);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVcliente extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVcliente(Form form)
                {
                super(form);
                setName("vcliente");
                setTitle("Nombre / Razón social");
                setType(STRING);
                setLength(40);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatfisicajuri extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatfisicajuri(Form form)
                {
                super(form);
                setName("datfisicajuri");
                setMessageHelp("Física / Jurídica");
                setTitle("F/J");
                setType(STRING);
                setMaskInput("U");
                setLength(1);
                setEnabled(false);
                setPrintable(false);
                setField(sgeneral.datfisicajuri);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDattel extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(11);
                    }
                }
                
            public CtrlDattel(Form form)
                {
                super(form);
                setLook(new Look());
                setName("dattel");
                setMessageHelp("Teléfono");
                setTitle("Teléfono");
                setType(STRING);
                setLength(15);
                setEnabled(false);
                setPrintable(false);
                setField(sgeneral.dattel);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatfax extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(11);
                    }
                }
                
            public CtrlDatfax(Form form)
                {
                super(form);
                setLook(new Look());
                setName("datfax");
                setMessageHelp("Fax");
                setTitle("Fax");
                setType(STRING);
                setLength(15);
                setEnabled(false);
                setPrintable(false);
                setField(sgeneral.datfax);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatmovil extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(11);
                    }
                }
                
            public CtrlDatmovil(Form form)
                {
                super(form);
                setLook(new Look());
                setName("datmovil");
                setTitle("Movil");
                setType(INTEGER);
                setLength(9);
                setPrintable(false);
                setField(sgeneral.datmovil);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
                    setLength(30);
                    }
                }
                
            public CtrlDatemail(Form form)
                {
                super(form);
                setLook(new Look());
                setName("datemail");
                setMessageHelp("E-mail");
                setTitle("Email");
                setType(STRING);
                setLength(100);
                setEnabled(false);
                setPrintable(false);
                setField(sgeneral.datemail);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVadministracio extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVadministracio(Form form)
                {
                super(form);
                setName("vadministracio");
                setTitle("Administración");
                setType(STRING);
                setLength(5);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCdpcodi extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                setMessageHelp("Código de empresa con el que se relaciona");
                setTitle("Relacionado con");
                setType(STRING);
                setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
                setLength(12);
                setPrintable(false);
                setField(sgeneral.cdpcdprel);
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
            
        public class CtrlChomiterel extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChomiterel(Form form)
                {
                super(form);
                setName("chomiterel");
                setMessageHelp("Omitir campo cdp relacionado para gestiones e-Mir y e-Portem");
                setTitle("Omitir campo cdp relacionado");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                return new Boolean(false);
                }
            }
            
        public class FSetFs1a extends Fieldset
            {
            public FSetFs1a(Form form)
                {
                super(form);
                addControl(vvcodigo);
                getWebProperties().setAnchoColumnas (3);
                getWebProperties().setSizeSeparacionR (0);
                getWebProperties().setPosTitulo ("T");
                }
            }
            
        public class FSetFs1b extends Fieldset
            {
            public FSetFs1b(Form form)
                {
                super(form);
                addControl(danifcif);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (3);
                getWebProperties().setSizeSeparacionR (0);
                getWebProperties().setPosTitulo ("T");
                }
            }
            
        public class FSetFs1c extends Fieldset
            {
            public FSetFs1c(Form form)
                {
                super(form);
                addControl(vcliente);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (3);
                getWebProperties().setSizeSeparacionR (0);
                getWebProperties().setPosTitulo ("T");
                }
            }
            
        public class FSetFs1d extends Fieldset
            {
            public FSetFs1d(Form form)
                {
                super(form);
                addControl(datfisicajuri);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (3);
                getWebProperties().setPosTitulo ("T");
                }
            }
            
        public class FSetFs2 extends Fieldset
            {
            public FSetFs2(Form form)
                {
                super(form);
                addControl(dattel);
                addControl(datfax);
                addControl(datmovil);
                addControl(datemail);
                getWebProperties().setAnchoColumnas (6);
                }
            }
            
        public class FSetFs3 extends Fieldset
            {
            public FSetFs3(Form form)
                {
                super(form);
                addControl(vadministracio);
                addControl(cdpcdprel);
                addControl(chomiterel);
                getWebProperties().setAnchoColumnas (6);
                getWebProperties().setCheckInv (true);
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
            // SET: VENTANA
            addSelect(sgeneral=new Sgeneral());
            addSelect(sdp=new Sdp());
            addControl(vvcodigo=new CtrlVvcodigo(this));
            addControl(danifcif=new CtrlDanifcif(this));
            addControl(vcliente=new CtrlVcliente(this));
            addControl(datfisicajuri=new CtrlDatfisicajuri(this));
            addControl(dattel=new CtrlDattel(this));
            addControl(datfax=new CtrlDatfax(this));
            addControl(datmovil=new CtrlDatmovil(this));
            addControl(datemail=new CtrlDatemail(this));
            addControl(vadministracio=new CtrlVadministracio(this));
            addControl(cdpcodi=new CtrlCdpcodi(this));
            addControl(cdpcdprel=new CtrlCdpcdprel(this));
            addControl(chomiterel=new CtrlChomiterel(this));
            addFieldset(fs1a=new FSetFs1a(this));
            addFieldset(fs1b=new FSetFs1b(this));
            addFieldset(fs1c=new FSetFs1c(this));
            addFieldset(fs1d=new FSetFs1d(this));
            addFieldset(fs2=new FSetFs2(this));
            addFieldset(fs3=new FSetFs3(this));
            setSelect(sgeneral);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            vdatosafiliacio.setTitle("Datos de la afiliación");
            vdatosafiliacio.setUniqueInsert(false);
            cdpcdprel.setDescriptionLength(20);
            super.onInit();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord();
            vcliente.setValue(Easp.componerCliente(sgeneral.datnombre.getString(),
                                                    sgeneral.datapell1.getString(),
                                                    sgeneral.datapell2.getString()));
            vadministracio.setValue(Util.formateoNumero("00",sgeneral.cdpaeatdele.getInteger())+Util.formateoNumero("000",sgeneral.cdpaeatadm.getInteger()));
            
            if ( sgeneral.cdpcodi.getString().length() == 12 ) vvcodigo.setValue(Integer.parseInt(sgeneral.cdpcodi.getString().substring(6,12)));
            else                                               vvcodigo.setNull();
            
            chomiterel.setValue(sgeneral.cdpomiterel.getString() != null && !sgeneral.cdpomiterel.getString().trim().equals("") && !sgeneral.cdpomiterel.getString().trim().equals("N"));
            }
        }
        
    // Select principal
    public class Sgeneral extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
        public Field cdpomiterel;
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
            
        class Nifes extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Nifes(Select select)
                {
                super(select);
                setName("nifes");
                setOptions(READ | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sgeneral()
            {
            setName("sgeneral");
            // SET: SELECT
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
            addField(cdpomiterel=new Field(this,cdp,"cdpomiterel"));
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
        // GET: SELECT
        public String getWhere ()
            {
            return "cdpcodi='"+codiCDP+"'";
            }
        // EVENT: SELECT
        }
        
    // select para ver si la tabla dp está vacía
    public class Sdp extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dp dp;
        // Campos
        public Field dpcodigo;
        public Field dpnifcif;
        class Dp extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dp(Select select)
                {
                super(select);
                setName("dp");
                setOptions(READ);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdp()
            {
            setName("sdp");
            // SET: SELECT
            addTable(dp=new Dp(this));
            addField(dpcodigo=new Field(this,dp,"dpcodigo"));
            addField(dpnifcif=new Field(this,dp,"dpnifcif"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public class FormVdomicilioenv extends MonoDataForm
        {
        // GLOBALES: VENTANA
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
        // Metodos
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
        // Fieldsets
        public FSetFs1 fs1;
        public FSetFs2 fs2;
        public FSetFs3 fs3;
        public FSetFs4 fs4;
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
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatcontacto(Form form)
                {
                super(form);
                setName("datcontacto");
                setTitle("Persona de contacto");
                setType(STRING);
                setLength(30);
                setPrintable(false);
                setField(sgeneral.datcontacto);
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
                setField(sgeneral.datsiglas);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
                    setLength(40);
                    }
                }
                
            public CtrlDatvia(Form form)
                {
                super(form);
                setLook(new Look());
                setName("datvia");
                setTitle("Vía");
                setType(STRING);
                setLength(45);
                setPrintable(false);
                setField(sgeneral.datvia);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatnum extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatnum(Form form)
                {
                super(form);
                setName("datnum");
                setTitle("Núm");
                setType(STRING);
                setLength(6);
                setPrintable(false);
                setField(sgeneral.datnum);
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
                setTitle("Esc");
                setType(STRING);
                setMaskInput("U");
                setLength(2);
                setPrintable(false);
                setField(sgeneral.datesc);
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
                setLength(2);
                setPrintable(false);
                setField(sgeneral.datpiso);
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
                setTitle("Puerta");
                setType(STRING);
                setMaskInput("U");
                setLength(2);
                setPrintable(false);
                setField(sgeneral.datletra);
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
                setPickUp(pickup=new mae.easp.general.pkprovincias.PickPkprovincias(this));
                setLength(2);
                setPrintable(false);
                setField(sgeneral.dat1prov);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
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
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatmuni(Form form)
                {
                super(form);
                setName("datmuni");
                setTitle("Municipio");
                setType(INTEGER);
                setPickUp(pickup=new mae.easp.general.pkmunicipios.PickPkmunicipios(this));
                setLength(5);
                setPrintable(false);
                setField(sgeneral.datmuni);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
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
                setLength(30);
                setPrintable(false);
                setField(sgeneral.datpobla);
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
                setTitle("C. Postal");
                setType(STRING);
                setLength(5);
                setPrintable(false);
                setField(sgeneral.datcpos);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
                setTitle("País");
                setType(INTEGER);
                setPickUp(pickup=new mae.easp.general.pkpaises.PickPkpaises(this));
                setLength(3);
                setPrintable(false);
                setField(sgeneral.datpais);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDateatt extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDateatt(Form form)
                {
                super(form);
                setName("dateatt");
                setTitle("");
                setType(STRING);
                setLength(35);
                setPrintable(false);
                setField(sgeneral.dateatt);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatesiglas extends ControlComboBox
            {
            public mae.easp.general.pksiglas.PickPksiglas pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatevia extends ControlEdit
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatenum extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatenum(Form form)
                {
                super(form);
                setName("datenum");
                setTitle("");
                setType(STRING);
                setLength(6);
                setPrintable(false);
                setField(sgeneral.datenum);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDateesc extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatepiso extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatepiso(Form form)
                {
                super(form);
                setName("datepiso");
                setTitle("");
                setType(STRING);
                setLength(2);
                setPrintable(false);
                setField(sgeneral.datepiso);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDateletra extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDateprov extends ControlComboBox
            {
            public mae.easp.general.pkprovincias.PickPkprovincias pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                datepobla.setValue(datemuni.pickup.smunicipios.mudesc.getString());
                }
            }
            
        public class CtrlDatepobla extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatepobla(Form form)
                {
                super(form);
                setName("datepobla");
                setTitle("");
                setType(STRING);
                setLength(30);
                setPrintable(false);
                setField(sgeneral.datepobla);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatecpos extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatecpos(Form form)
                {
                super(form);
                setName("datecpos");
                setTitle("");
                setType(STRING);
                setLength(5);
                setPrintable(false);
                setField(sgeneral.datecpos);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatepais extends ControlComboBox
            {
            public mae.easp.general.pkpaises.PickPkpaises pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBtcopiardatos extends ControlButton
            {
            // GLOBALES: BOTON
            // Metodos
            public CtrlBtcopiardatos(Form form)
                {
                super(form);
                setName("btcopiardatos");
                setTitle("Copiar datos para el domicilio de envío");
                setTitle("Copiar datos para el domicilio de envío");
                // SET: BOTON
                }
            // EVENT: BOTON
            public void onClick ()
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
            // GET: BOTON
            }
            
        public class LinkAdomicilios extends Action
            {
            public LinkAdomicilios(Form form)
                {
                super(form);
                setName("adomicilios");
                setTitle("&1. Gestión de domicilios (Fiscal, notificaciones y social)");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                mae.easp.prdomicilios.ProgPrdomicilios pr = new mae.easp.prdomicilios.ProgPrdomicilios();
                pr.gNif = sgeneral.danifcif.getString();
                pr.run();
                vdomicilioenv.doShow();
                }
            }
            
        public class FSetFs1 extends Fieldset
            {
            public FSetFs1(Form form)
                {
                super(form);
                setTitulo("Domicilio afiliación");
                addControl(datsiglas);
                addControl(datvia);
                addControl(datnum);
                addControl(datesc);
                addControl(datpiso);
                addControl(datletra);
                getWebProperties().setXPad (50);
                getWebProperties().setSizeSeparacionB (0);
                getWebProperties().setPosTitulo ("T");
                }
            }
            
        public class FSetFs2 extends Fieldset
            {
            public FSetFs2(Form form)
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
            
        public class FSetFs3 extends Fieldset
            {
            public FSetFs3(Form form)
                {
                super(form);
                addControl(datpobla);
                addControl(datpais);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (6);
                getWebProperties().setSizeSeparacionT (0);
                }
            }
            
        public class FSetFs4 extends Fieldset
            {
            public FSetFs4(Form form)
                {
                super(form);
                addControl(datcontacto);
                getWebProperties().setSizeSeparacionT (30);
                }
            }
            
        public FormVdomicilioenv(ProgPrclfichagener prclfichagener)
            {
            super(prclfichagener);
            setName("vdomicilioenv");
            setTitle("Datos de la afiliación");
            setLocation(new Location());
            setStates(SHOW);
            setPrintable(false);
            setModal(true);
            setUnique(true);
            // SET: VENTANA
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
            addFieldset(fs1=new FSetFs1(this));
            addFieldset(fs2=new FSetFs2(this));
            addFieldset(fs3=new FSetFs3(this));
            addFieldset(fs4=new FSetFs4(this));
            setSelect(sgeneral);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            vdomicilioenv.setTitle("Domicilio de envío");
            super.onInit();
            }
        public void onBeginRecord ()
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
        // GLOBALES: VENTANA
        /*
protected Form createEditForm(boolean insert) {
  Form form=super.createEditForm(insert);
  form.setLayout(new LayoutFieldset(form));
  //form.setLayout(new LayoutHtml("mae/easp/html/datosbancarios.html"));
  LocationWindow loc=(LocationWindow)form.getLocation();
  loc.setWidth(525);
  loc.setHeight(185);
  return form;
 }



public void onEdit(){
  valtadatosbanc.setStates(DataForm.UPDATE | DataForm.SHOW);
  valtadatosbanc.setTitle("Modificación de datos bancarios");
  valtadatosbanc.modoinsert=false;
  valtadatosbanc.open();
  }

*/
public void onInsert(){
//  valtadatosbanc.setStates(DataForm.INSERT);
//  valtadatosbanc.setInitState(DataForm.INSERT); 
  valtadatosbanc.modoinsert=true;
  valtadatosbanc.setTitle("Alta de datos bancarios");
  valtadatosbanc.open();
  vdatosbancarios.doShow();
  valtadatosbanc.primeraVez = true;
  }

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
void mensajeSinLiquidacion() {
  if (!chiva.getBoolean() && !chirpf.getBoolean() && !chpagosc.getBoolean() && !chliqanual.getBoolean())
     Maefc.message("En esta cuenta no ha informado si debe utilizarse para 'IVA' o para 'IRPF'\n o para 'Pagos a Cuenta' o para 'Liquidaciones Anuales'." ,"Atención",Maefc.INFORMATION_MESSAGE);
}

void accionTipo(ControlCheck ck, String tipo){
  boolean result=true;
  if (ck.getBoolean()) {
     if ("300".equals(tipo) && Maefc.NO_OPTION==Maefc.message("Ha seleccionado que no desea utilizar esta cuenta para las liquidaciones de IVA. ¿Es correcto?","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)) 
        result = false; 
     if ("110".equals(tipo) && Maefc.NO_OPTION==Maefc.message("Ha seleccionado que no desea utilizar esta cuenta para las liquidaciones de IRPF. ¿Es correcto?","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)) 
        result = false;
     if ("130".equals(tipo) && Maefc.NO_OPTION==Maefc.message("Ha seleccionado que no desea utilizar esta cuenta para los Pagos a Cuenta.¿Es correcto?","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)) 
        result = false;
     if ("100".equals(tipo) && Maefc.NO_OPTION==Maefc.message("Ha seleccionado que no desea utilizar esta cuenta para las Liquidaciones Anuales. ¿Es correcto?","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)) 
        result = false;
  }
  if (result) {
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
      mensajeSinLiquidacion();
  }
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
        // Metodos
        // Controles
        public CtrlBccbanco bccbanco;
        public CtrlBccsucursal bccsucursal;
        public CtrlBccdigitos bccdigitos;
        public CtrlBccnumero bccnumero;
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
        // Fieldsets
        public FSetFs1 fs1;
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void userChange (Value v)
                {
                super.userChange (v);
                if ("ISS".equals(aplicacion)) {
 	if (bccbanco.getInteger()>0 && bccsucursal.getInteger()>0 && bccnumero.getString()!=null && !"".equals(bccnumero.getString().trim()))
 		bccdigitos.setValue(Easp.digitoControl(bccbanco.getInteger(),bccsucursal.getInteger(),Long.valueOf(bccnumero.getString())));
}
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlBccsucursal extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void userChange (Value v)
                {
                super.userChange (v);
                if ("ISS".equals(aplicacion)) {
 	if (bccbanco.getInteger()>0 && bccsucursal.getInteger()>0 && bccnumero.getString()!=null && !"".equals(bccnumero.getString().trim()))
 		bccdigitos.setValue(Easp.digitoControl(bccbanco.getInteger(),bccsucursal.getInteger(),Long.valueOf(bccnumero.getString())));
}
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlBccdigitos extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccdigitos(Form form)
                {
                super(form);
                setName("bccdigitos");
                setTitle("DC");
                setType(INTEGER);
                setMaskInput("99");
                setLength(2);
                setPrintable(false);
                setField(sbancocli.bccdigitos);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlBccnumero extends ColumnEdit
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
                
            public CtrlBccnumero(Form form)
                {
                super(form);
                setLook(new Look());
                setName("bccnumero");
                setTitle("Número");
                setType(STRING);
                setLength(10);
                setPrintable(false);
                setField(sbancocli.bccnumero);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (Util.isNumero(this.getString()) && this.getString().length() == 10)
                  return super.valid();
                else
                  return false;
                }
            public void userChange (Value v)
                {
                super.userChange (v);
                if ("ISS".equals(aplicacion)) {
 	if (bccbanco.getInteger()>0 && bccsucursal.getInteger()>0 && bccnumero.getString()!=null && !"".equals(bccnumero.getString().trim()))
 		bccdigitos.setValue(Easp.digitoControl(bccbanco.getInteger(),bccsucursal.getInteger(),Long.valueOf(bccnumero.getString())));
}
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlChiva extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChiva(Form form)
                {
                super(form);
                setName("chiva");
                setTitle("IVA");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChirpf extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChirpf(Form form)
                {
                super(form);
                setName("chirpf");
                setMessageHelp("Retenciones practicadas");
                setTitle("IRPF");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChpagosc extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChpagosc(Form form)
                {
                super(form);
                setName("chpagosc");
                setMessageHelp("Pagos a cuentas");
                setTitle("P. cuentas");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChliqanual extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChliqanual(Form form)
                {
                super(form);
                setName("chliqanual");
                setMessageHelp("Liquidación anual RENTA/SOCIEDADES");
                setTitle("L. anual");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class LinkBtiva extends Action
            {
            public LinkBtiva(Form form)
                {
                super(form);
                setName("btiva");
                setTitle("&1. IVA");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                valtadatosbanc.open();
                }
            }
            
        public class FSetFs1 extends Fieldset
            {
            public FSetFs1(Form form)
                {
                super(form);
                addControl(bccbanco);
                addControl(bccsucursal);
                addControl(bccdigitos);
                addControl(bccnumero);
                getWebProperties().setXPad (10);
                getWebProperties().setPosTitulo ("T");
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
            // SET: VENTANA
            addSelect(sbancocli=new Sbancocli());
            addSelect(sbancos=new Sbancos());
            addSelect(sasignaciones=new Sasignaciones());
            addSelect(sbancocliutil=new Sbancocliutil());
            addSelect(sbancocliutil2=new Sbancocliutil2());
            addSelect(sasignautil=new Sasignautil());
            addSelect(sasignautil2=new Sasignautil2());
            addControl(bccbanco=new CtrlBccbanco(this));
            addControl(bccsucursal=new CtrlBccsucursal(this));
            addControl(bccdigitos=new CtrlBccdigitos(this));
            addControl(bccnumero=new CtrlBccnumero(this));
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
            addFieldset(fs1=new FSetFs1(this));
            setSelect(sbancocli);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            //vdatosbancarios.getControlTable().setTableEditable(true);
            sbancocli.run(true);
            
            int nrows=sbancocli.getNumRows();
            //inicializarArray(nrows);
            int row=0;
            super.onInit();
            }
        public boolean onOkInsert ()
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
        public boolean onOkDelete ()
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
        public void onBeginRecord ()
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
        // GLOBALES: SELECT
        // Metodos
        public Bancocli bancocli;
        // Campos
        public Field bccbanco;
        public Field bcccodigo;
        public Field bccdigitos;
        public Field bccnumero;
        public Field bccsucursal;
        class Bancocli extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Bancocli(Select select)
                {
                super(select);
                setName("bancocli");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onInsert ()
                {
                sbancocli.bcccodigo.setValue(codiCDP);
                Maefc.message("En esta cuenta deberá informar si debe utilizarse para 'IVA' o para 'IRPF'\n o para 'Pagos a Cuenta' o para 'Liquidaciones Anuales'." ,"Atención",Maefc.INFORMATION_MESSAGE);
                valtadatosbanc.primeraVez = true;
return super.onInsert();
                }
            }
            
        public Sbancocli()
            {
            setName("sbancocli");
            // SET: SELECT
            addTable(bancocli=new Bancocli(this));
            addField(bccbanco=new Field(this,bancocli,"bccbanco"));
            addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
            addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
            addField(bccnumero=new Field(this,bancocli,"bccnumero"));
            addField(bccsucursal=new Field(this,bancocli,"bccsucursal"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "bcccodigo="+sgeneral.cdpcodi.getSQLFormat();
            }
        // EVENT: SELECT
        }
        
    // select para saber la descripción de un banco
    public class Sbancos extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Banco banco;
        // Campos
        public Field bncodigo;
        public Field bndesc;
        class Banco extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Banco(Select select)
                {
                super(select);
                setName("banco");
                setOptions(READ);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sbancos()
            {
            setName("sbancos");
            // SET: SELECT
            addTable(banco=new Banco(this));
            addField(bncodigo=new Field(this,banco,"bncodigo"));
            addField(bndesc=new Field(this,banco,"bndesc"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "bncodigo="+sbancocli.bccbanco.getSQLFormat();
            }
        // EVENT: SELECT
        }
        
    // 
    public class Sasignaciones extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Asignaciones(Select select)
                {
                super(select);
                setName("asignaciones");
                setOptions(READ | INSERT | DELETE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sasignaciones()
            {
            setName("sasignaciones");
            // SET: SELECT
            addTable(asignaciones=new Asignaciones(this));
            addField(ababanco=new Field(this,asignaciones,"ababanco"));
            addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
            addField(abadigito=new Field(this,asignaciones,"abadigito"));
            addField(abatipo=new Field(this,asignaciones,"abatipo"));
            addField(abnumero=new Field(this,asignaciones,"abnumero"));
            addField(absucursal=new Field(this,asignaciones,"absucursal"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "abacodigo="+sbancocli.bcccodigo.getSQLFormat()+" and "+
                   "ababanco="+sbancocli.bccbanco.getSQLFormat()+" and "+
                   "absucursal="+sbancocli.bccsucursal.getSQLFormat()+" and "+
                   "abnumero="+sbancocli.bccnumero.getSQLFormat()+" and "+
                   "abadigito="+sbancocli.bccdigitos.getSQLFormat();
            }
        // EVENT: SELECT
        }
        
    // 
    public class Sbancocliutil extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Bancocli(Select select)
                {
                super(select);
                setName("bancocli");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sbancocliutil()
            {
            setName("sbancocliutil");
            // SET: SELECT
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
        // GET: SELECT
        // EVENT: SELECT
        }
        
    // 
    public class Sbancocliutil2 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Bancocli(Select select)
                {
                super(select);
                setName("bancocli");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sbancocliutil2()
            {
            setName("sbancocliutil2");
            // SET: SELECT
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
        // GET: SELECT
        // EVENT: SELECT
        }
        
    // 
    public class Sasignautil extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Asignaciones(Select select)
                {
                super(select);
                setName("asignaciones");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sasignautil()
            {
            setName("sasignautil");
            // SET: SELECT
            addTable(asignaciones=new Asignaciones(this));
            addField(ababanco=new Field(this,asignaciones,"ababanco"));
            addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
            addField(abadigito=new Field(this,asignaciones,"abadigito"));
            addField(abatipo=new Field(this,asignaciones,"abatipo"));
            addField(abnumero=new Field(this,asignaciones,"abnumero"));
            addField(absucursal=new Field(this,asignaciones,"absucursal"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    // 
    public class Sasignautil2 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Asignaciones(Select select)
                {
                super(select);
                setName("asignaciones");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sasignautil2()
            {
            setName("sasignautil2");
            // SET: SELECT
            addTable(asignaciones=new Asignaciones(this));
            addField(ababanco=new Field(this,asignaciones,"ababanco"));
            addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
            addField(abadigito=new Field(this,asignaciones,"abadigito"));
            addField(abatipo=new Field(this,asignaciones,"abatipo"));
            addField(abnumero=new Field(this,asignaciones,"abnumero"));
            addField(absucursal=new Field(this,asignaciones,"absucursal"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public class FormValtadatosbanc extends MonoDataForm
        {
        // GLOBALES: VENTANA
        public boolean modoinsert=true;
public boolean dc = true;
public int n0=0, n1=0, n2=0, n3=0;
public boolean primeraVez = true;
public String banco;
public String sucursal;
public String numero;
public String digitos;
//public mae.modasp.general.pkpaiscodigo.PickPkpaiscodigo pickup;
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
  else {
  	bcccodmuni.setEnabled(false);
  	doInsert();
  }
  }
        // Metodos
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
        public CtrlBccsepa bccsepa;
        public CtrlBcciban bcciban;
        public CtrlBcccodswift bcccodswift;
        public CtrlBccbanconame bccbanconame;
        public CtrlBccbancadress bccbancadress;
        public CtrlBccbanccity bccbanccity;
        public CtrlBcccodpais bcccodpais;
        public CtrlBccbancpais bccbancpais;
        // Acciones
        // Fieldsets
        public FSetF0 f0;
        public FSetF1 f1;
        public FSetF2 f2;
        public FSetF3 f3;
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(700);
                setHeight(255);
                setTitle("Alta de Datos Bancarios");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlBccbanco extends ControlComboBox
            {
            public mae.easp.general.pkbancos.PickPkbancos pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void userChange (Value v)
                {
                super.userChange (v);
                banco=Numero.format(bccbanco.getInteger(), "0000");
bcciban.setValue("ES" + mae.modasp.general.Modasp.getDCIBAN(banco + sucursal + digitos + numero) + banco + sucursal + digitos + numero);
                }
            }
            
        public class CtrlBccsucursal extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void userChange (Value v)
                {
                super.userChange (v);
                sucursal=Numero.format(bccsucursal.getInteger(), "0000");
bcciban.setValue("ES" + mae.modasp.general.Modasp.getDCIBAN(banco + sucursal + digitos + numero) + banco + sucursal + digitos + numero);
                }
            }
            
        public class CtrlBccnumero extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if(bccsepa.getInteger()!=1)
                	return super.valid();
                else if (Util.isNumero(this.getString()) && this.getString().length() == 10)
                	return super.valid();
                else
                	return false;
                }
            public void userChange (Value v)
                {
                super.userChange (v);
                numero=Numero.format(bccnumero.getInteger(), "0000000000");
bcciban.setValue("ES" + mae.modasp.general.Modasp.getDCIBAN(banco + sucursal + digitos + numero) + banco + sucursal + digitos + numero);
                }
            }
            
        public class CtrlBccdigitos extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (bccsepa.getInteger()==1){
                	if (Easp.digitoIncorrecto(bccbanco.getString()
                	             ,bccsucursal.getString()
                	             ,bccnumero.getString()
                	            ,bccdigitos.getString(),"corriente")) {
                		return false;
                	}
                	else {
                		return super.valid(); 
                	}
                }
                else return true;
                }
            public void userChange (Value v)
                {
                super.userChange (v);
                digitos=Numero.format(bccdigitos.getInteger(), "00");
bcciban.setValue("ES" + mae.modasp.general.Modasp.getDCIBAN(banco + sucursal + digitos + numero) + banco + sucursal + digitos + numero);
                }
            public boolean obligate ()
                {
                if (bccsepa.getInteger() == 1)
                	return true;
                else
                	return false;
                }
            }
            
        public class CtrlBccsg extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccvia extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccvia(Form form)
                {
                super(form);
                setName("bccvia");
                setTitle("Vía");
                setType(STRING);
                setMaskInput("U");
                setLength(45);
                setPrintable(false);
                setField(sbancoclicanvi.bccvia);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccnum extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccnum(Form form)
                {
                super(form);
                setName("bccnum");
                setTitle("Número");
                setType(STRING);
                setLength(6);
                setPrintable(false);
                setField(sbancoclicanvi.bccnum);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccescalera extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccpiso extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccletra extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccprovincia extends ControlComboBox
            {
            public mae.easp.general.pkprovincias.PickPkprovincias pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                if (!isNull())
                  bccpoblacion.setValue(bcccodmuni.pickup.smunicipios.mudesc.getString());
                }
            }
            
        public class CtrlBccpoblacion extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccpoblacion(Form form)
                {
                super(form);
                setName("bccpoblacion");
                setTitle("Población");
                setType(STRING);
                setMaskInput("U");
                setLength(30);
                setPrintable(false);
                setField(sbancoclicanvi.bccpoblacion);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBcccodpostal extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBcccodpostal(Form form)
                {
                super(form);
                setName("bcccodpostal");
                setTitle("C.P.");
                setType(STRING);
                setLength(5);
                setPrintable(false);
                setField(sbancoclicanvi.bcccodpostal);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccsepa extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccsepa(Form form)
                {
                super(form);
                setName("bccsepa");
                setMessageHelp("Marca SEPA (1 – Cuenta España, 2 – Unión Europea SEPA, 3 – Resto países)");
                setTitle("Tipo de cuenta");
                setType(INTEGER);
                setLength(1);
                setSearchable(true);
                addItem("1/ Cuenta España");
                addItem("2/ Unión Europea SEPA");
                addItem("3/ Resto países");
                setField(sbancoclicanvi.bccsepa);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange ();
                while (f1.getControls().length>0) {
	f1.remControl((Control) f1.getControls()[0]);
}
while (f2.getControls().length>0) {
	f2.remControl((Control) f2.getControls()[0]);
}
while (f3.getControls().length>0) {
	f3.remControl((Control) f3.getControls()[0]);
}

if (bccsepa.getInteger() == 1){
	n1=0;
	n2=0;
	// F1
	f1.getWebProperties().setXPad(50);
	f1.addControlAt(n1++, bccbanco);
	f1.addControlAt(n1++, bccsucursal);
	f1.addControlAt(n1++, bccnumero);
	f1.addControlAt(n1++, bccdigitos);
	// F2
	f2.addControlAt(n2++, bcciban);
	bcciban.setNull();
	bccbanco.setNull();
	bccsucursal.setNull();
	bccnumero.setNull();
	bccdigitos.setNull();
	bcccodswift.setNull();
	bccbanconame.setNull();
	bccbancadress.setNull();
	bccbanccity.setNull();
	bcccodpais.setNull();
	bccbancpais.setNull();
	bcciban.setEnabled(false);
}
else if (bccsepa.getInteger() == 2){
	n1=0;
	// F1
	f1.getWebProperties().setXPad(40);
	f1.addControlAt(n1++, bcciban);
	f1.addControlAt(n1++, bcccodswift);
	bcciban.setNull();
	bcccodswift.setNull();
	bccbanconame.setNull();
	bccbancadress.setNull();
	bccbanccity.setNull();
	bcccodpais.setNull();
	bccbancpais.setNull();
	bcciban.setEnabled(true);
}
else if (bccsepa.getInteger() == 3){
	n1=0;
	n2=0;
	n3=0;
	// F1
	f1.getWebProperties().setXPad(40);
	f1.addControlAt(n1++, bcciban);
	f1.addControlAt(n1++, bcccodswift);
	// F2
	f2.getWebProperties().setNumCols(2);
	f2.addControlAt(n2++, bccbanconame);
	f2.addControlAt(n2++, bccbanccity);
	// F3
	f3.addControlAt(n3++, bccbancadress);
	f3.addControlAt(n3++, bcccodpais);
	f3.addControlAt(n3++, bccbancpais);
	bcciban.setNull();
	bccbanco.setNull();
	bccsucursal.setNull();
	bccnumero.setNull();
	bccdigitos.setNull();
	bcccodswift.setNull();
	bccbanconame.setNull();
	bccbancadress.setNull();
	bccbanccity.setNull();
	bcccodpais.setNull();
	bccbancpais.setNull();
	bcciban.setEnabled(true);
}
if (!primeraVez) {
	LayoutFieldset lf = (LayoutFieldset) valtadatosbanc.getLayout();
	lf.refresh();
}
primeraVez = false;

                }
            }
            
        public class CtrlBcciban extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBcciban(Form form)
                {
                super(form);
                setName("bcciban");
                setTitle("IBAN");
                setType(STRING);
                setLength(34);
                setSearchable(true);
                setField(sbancoclicanvi.bcciban);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void userChange (Value v)
                {
                super.userChange (v);
                if(bccsepa.getInteger() == 2 || bccsepa.getInteger() == 3) {
	if(bcciban.getString().length()<14)
		Maefc.message("IBAN demasiado corto", "Atención", Maefc.INFORMATION_MESSAGE);
	else{
		bccbanco.setValue(bcciban.getString().substring(4,8));
		bccsucursal.setValue(bcciban.getString().substring(8,12));
		bccdigitos.setValue(bcciban.getString().substring(12,14));
		bccnumero.setValue(bcciban.getString().substring(14,bcciban.getString().length()));
		bccbanco.setRestricted(false);
	}
}
else 
	bccbanco.setRestricted(true);
                }
            public boolean obligate ()
                {
                return super.obligate ();
                }
            }
            
        public class CtrlBcccodswift extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBcccodswift(Form form)
                {
                super(form);
                setName("bcccodswift");
                setMessageHelp("Codigo SWIFT-BIC");
                setTitle("Código SWIFT-BIC");
                setType(STRING);
                setLength(11);
                setSearchable(true);
                setVisible(false);
                setField(sbancoclicanvi.bcccodswift);
                // SET: CONTROLEDIT
                getWebProperties().setVisible (false);
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3 || bccsepa.getInteger()==2) 
                	return true;
                return false;
                }
            }
            
        public class CtrlBccbanconame extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccbanconame(Form form)
                {
                super(form);
                setName("bccbanconame");
                setMessageHelp("Banco/Bank name");
                setTitle("Banco/Bank name");
                setType(STRING);
                setLength(70);
                setSearchable(true);
                setField(sbancoclicanvi.bccbanconame);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3) 
                	return true;
                return false;
                }
            }
            
        public class CtrlBccbancadress extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccbancadress(Form form)
                {
                super(form);
                setName("bccbancadress");
                setMessageHelp("Dirección del Banco/ Bank adress");
                setTitle("Dirección del Banco/ Bank adress");
                setType(STRING);
                setLength(35);
                setSearchable(true);
                setField(sbancoclicanvi.bccbancadress);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3) 
                	return true;
                return false;
                }
            }
            
        public class CtrlBccbanccity extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccbanccity(Form form)
                {
                super(form);
                setName("bccbanccity");
                setMessageHelp("Ciudad/City");
                setTitle("Ciudad/City");
                setType(STRING);
                setLength(30);
                setSearchable(true);
                setField(sbancoclicanvi.bccbanccity);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3) 
                	return true;
                return false;
                }
            }
            
        public class CtrlBcccodpais extends ControlComboBox
            {
            public mae.easp.general.pkcodpais.PickPkcodpais pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBcccodpais(Form form)
                {
                super(form);
                setName("bcccodpais");
                setMessageHelp("Código País/Country code");
                setTitle("CP");
                setType(STRING);
                setMaskInput("U");
                setPickUp(pickup=new mae.easp.general.pkcodpais.PickPkcodpais(this));
                setLength(2);
                setSearchable(true);
                setDescriptionShow(false);
                setField(sbancoclicanvi.bcccodpais);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3) 
                	return true;
                return false;
                }
            }
            
        public class CtrlBccbancpais extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccbancpais(Form form)
                {
                super(form);
                setName("bccbancpais");
                setMessageHelp("País/Country");
                setTitle("País/Country");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                setField(sbancoclicanvi.bccbancpais);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3) 
                	return true;
                return false;
                }
            }
            
        public class FSetF0 extends Fieldset
            {
            public FSetF0(Form form)
                {
                super(form);
                }
            }
            
        public class FSetF1 extends Fieldset
            {
            public FSetF1(Form form)
                {
                super(form);
                }
            }
            
        public class FSetF2 extends Fieldset
            {
            public FSetF2(Form form)
                {
                super(form);
                }
            }
            
        public class FSetF3 extends Fieldset
            {
            public FSetF3(Form form)
                {
                super(form);
                }
            }
            
        public FormValtadatosbanc(ProgPrclfichagener prclfichagener)
            {
            super(prclfichagener);
            setName("valtadatosbanc");
            setTitle("Alta de Datos Bancarios");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setStates(SHOW | INSERT);
            setPrintable(false);
            setModal(true);
            setUnique(true);
            // SET: VENTANA
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
            addControl(bccsepa=new CtrlBccsepa(this));
            addControl(bcciban=new CtrlBcciban(this));
            addControl(bcccodswift=new CtrlBcccodswift(this));
            addControl(bccbanconame=new CtrlBccbanconame(this));
            addControl(bccbancadress=new CtrlBccbancadress(this));
            addControl(bccbanccity=new CtrlBccbanccity(this));
            addControl(bcccodpais=new CtrlBcccodpais(this));
            addControl(bccbancpais=new CtrlBccbancpais(this));
            addFieldset(f0=new FSetF0(this));
            addFieldset(f1=new FSetF1(this));
            addFieldset(f2=new FSetF2(this));
            addFieldset(f3=new FSetF3(this));
            setSelect(sbancoclicanvi);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            //valtadatosbanc.setLayout(new LayoutHtml("mae/jrenta/html/prdatosbanc_detall.html"));
            valtadatosbanc.setLayout(new LayoutFieldset(valtadatosbanc));
            bccsepa.setValue(1);
            //bcccodpais.setPickUp(pickup=new mae.modasp.general.pkpaiscodigo.PickPkpaiscodigo(bcccodpais));	
            banco = "";
            sucursal = "";
            numero = "";
            digitos = "";
            super.onInit();
            }
        public void onExit ()
            {
            super.onExit ();
            primeraVez = true;
            }
        public boolean onOkInsert ()
            {
            if (bccsepa.getInteger() != 1) {
            	Selector sl = new Selector(sbancoclicanvi.getDataBase());
            	sl.execute("select * from BANCO where bncodigo = " + bccbanco.getValue().getInteger());
            	if (!sl.next()) {
            		Insert i = new Insert(sbancoclicanvi.getDataBase(), "BANCO");
            		i.valor("bncodigo", bccbanco.getValue().getInteger());
            		i.execute();
            		sbancoclicanvi.getDataBase().commit();
            	}
            	sl.close();
            }
            mae.modasp.general.Modasp.validaIBAN(bcciban.getString(), true);
            if (super.onOkInsert ()) {
            	valtadatosbanc.exit();
            	return true;
            
            }
            else 
            	return false;
            }
        public void onInitFieldset ()
            {
            super.onInitFieldset ();
            ControlLabel label1 = new ControlLabel(valtadatosbanc);
label1.setHeight(1);
//
f0.getWebProperties().setAnchoColumnas (12);
f0.getWebProperties().setPosTitulo ("L");
f1.getWebProperties().setNumCols (1);
f0.getWebProperties().setSizeSeparacionB(0);
f0.getWebProperties().setSizeSeparacionT(0);
//	
f1.getWebProperties().setAnchoColumnas (12);
f1.getWebProperties().setPosTitulo ("T");
f1.getWebProperties().setXPad(20);
f1.getWebProperties().setNumCols (4);
f1.getWebProperties().setSizeSeparacionB(0);
f1.getWebProperties().setSizeSeparacionT(0);
//
f2.getWebProperties().setAnchoColumnas (12);
f2.getWebProperties().setPosTitulo ("T");
f2.getWebProperties().setXPad(20);
f2.getWebProperties().setNumCols (1);
f2.getWebProperties().setSizeSeparacionB(0);
f2.getWebProperties().setSizeSeparacionT(0);
// F3
f3.getWebProperties().setAnchoColumnas (12);
f3.getWebProperties().setPosTitulo ("T");
f3.getWebProperties().setXPad(40);
f3.getWebProperties().setNumCols (3);
f3.getWebProperties().setSizeSeparacionB(0);
f3.getWebProperties().setSizeSeparacionT(0);
// F0
f0.addControlAt(n0++, bccsepa);

            }
        }
        
    // select para editar o insertar datos bancarios
    public class Sbancoclicanvi extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Bancocli bancocli;
        // Campos
        public Field bcc1provincia;
        public Field bccbanco;
        public Field bcccodigo;
        public Field bcccodmuni;
        public Field bcccodpostal;
        public Field bccdominio;
        public Field bccsepa;
        public Field bcciban;
        public Field bcccodswift;
        public Field bccdigitos;
        public Field bccbanconame;
        public Field bccbancadress;
        public Field bccbanccity;
        public Field bccescalera;
        public Field bcccodpais;
        public Field bccbancpais;
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
            // GLOBALES: TABLA
            // Metodos
            public Bancocli(Select select)
                {
                super(select);
                setName("bancocli");
                setOptions(READ | INSERT | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onInsert ()
                {
                bcccodigo.setValue(codiCDP);
                	
                return super.onInsert ();
                }
            }
            
        public Sbancoclicanvi()
            {
            setName("sbancoclicanvi");
            // SET: SELECT
            addTable(bancocli=new Bancocli(this));
            addField(bcc1provincia=new Field(this,bancocli,"bccprovincia"));
            addField(bccbanco=new Field(this,bancocli,"bccbanco"));
            addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
            addField(bcccodmuni=new Field(this,bancocli,"bcccodmuni"));
            addField(bcccodpostal=new Field(this,bancocli,"bcccodpostal"));
            addField(bccdominio=new Field(this,bancocli,"bccdominio"));
            addField(bccsepa=new Field(this,bancocli,"bccsepa"));
            addField(bcciban=new Field(this,bancocli,"bcciban"));
            addField(bcccodswift=new Field(this,bancocli,"bcccodswift"));
            addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
            addField(bccbanconame=new Field(this,bancocli,"bccbanconame"));
            addField(bccbancadress=new Field(this,bancocli,"bccbancadress"));
            addField(bccbanccity=new Field(this,bancocli,"bccbanccity"));
            addField(bccescalera=new Field(this,bancocli,"bccescalera"));
            addField(bcccodpais=new Field(this,bancocli,"bcccodpais"));
            addField(bccbancpais=new Field(this,bancocli,"bccbancpais"));
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
        // GET: SELECT
        public String getWhere ()
            {
            return "bcccodigo="+sbancocli.bcccodigo.getSQLFormat()+
                   " and bccbanco="+sbancocli.bccbanco.getSQLFormat()+
                   " and bccsucursal="+sbancocli.bccsucursal.getSQLFormat()+
                   " and bccnumero="+sbancocli.bccnumero.getSQLFormat()+
                   " and bccdigitos="+sbancocli.bccdigitos.getSQLFormat();
            }
        // EVENT: SELECT
        }
        
    public class FormVrepresent extends MultiDataForm
        {
        // GLOBALES: VENTANA
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
        // Metodos
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
        // Fieldsets
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
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlRepnifcif(Form form)
                {
                super(form);
                setName("repnifcif");
                setTitle("NIF / CIF");
                setType(STRING);
                setMaskInput("U");
                setProtect(true);
                setLength(15);
                setPrintable(false);
                setField(srepre.repnifcif);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (yaEstaValidado) 
                  return true;
                else {
                  String valido=Util.esCIF(getString());
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
            public void onChange ()
                {
                super.onChange();
                yaEstaValidado=false;
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlVvfisicajuri extends ColumnComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlVvdatapell1 extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdatapell1(Form form)
                {
                super(form);
                setName("vvdatapell1");
                setTitle("1er Apellido");
                setType(STRING);
                setLength(40);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                return (getString().trim().length()>0);
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlVvdatapell2 extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdatapell2(Form form)
                {
                super(form);
                setName("vvdatapell2");
                setTitle("2º Apellido");
                setType(STRING);
                setLength(25);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvnombre extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvnombre(Form form)
                {
                super(form);
                setName("vvnombre");
                setTitle("Nombre");
                setType(STRING);
                setLength(20);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlRepnotaria extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlRepfechapoder extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlRepfechapoder(Form form)
                {
                super(form);
                setName("repfechapoder");
                setTitle("Fecha Poder");
                setType(DATE);
                setLength(10);
                setPrintable(false);
                setField(srepre.repfechapoder);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlRepvtopoder extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVrepresent(ProgPrclfichagener prclfichagener)
            {
            super(prclfichagener);
            setName("vrepresent");
            setTitle("Representantes");
            setLocation(new Location());
            setStates(SHOW | DELETE | UPDATE | INSERT);
            setModal(true);
            // SET: VENTANA
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
        // GET: VENTANA
        // EVENT: VENTANA
        public boolean onOkInsert ()
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
        public boolean onOkUpdate ()
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
        public void onBeginRecord ()
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
                setOptions(READ | INSERT | UPDATE);
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
        
    // 
    public class Srepre extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Representantes(Select select)
                {
                super(select);
                setName("representantes");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Srepre()
            {
            setName("srepre");
            // SET: SELECT
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
        // GET: SELECT
        public String getWhere ()
            {
            return "repcodigo="+sgeneral.cdpcodi.getSQLFormat();
            }
        // EVENT: SELECT
        }
        
    public class FormVcargorepre extends MonoDataForm
        {
        // GLOBALES: VENTANA
        public void valorCheck(String v, ControlCheck c){
  if (v.equals("S"))
    c.setValue(true);
  else 
    c.setValue(false); 
  }
        // Metodos
        // Controles
        public CtrlChadministrador chadministrador;
        public CtrlChreplegal chreplegal;
        public CtrlChfirma chfirma;
        public CtrlChsecretario chsecretario;
        public CtrlChsocio chsocio;
        public CtrlChresidente chresidente;
        public CtrlChrepresentante chrepresentante;
        public CtrlVvotroscargos vvotroscargos;
        // Acciones
        public LinkBtotrosdatos btotrosdatos;
        // Fieldsets
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
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChadministrador(Form form)
                {
                super(form);
                setName("chadministrador");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChreplegal extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChreplegal(Form form)
                {
                super(form);
                setName("chreplegal");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChfirma extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChfirma(Form form)
                {
                super(form);
                setName("chfirma");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChsecretario extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChsecretario(Form form)
                {
                super(form);
                setName("chsecretario");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChsocio extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChsocio(Form form)
                {
                super(form);
                setName("chsocio");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChresidente extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChresidente(Form form)
                {
                super(form);
                setName("chresidente");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChrepresentante extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChrepresentante(Form form)
                {
                super(form);
                setName("chrepresentante");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlVvotroscargos extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvotroscargos(Form form)
                {
                super(form);
                setName("vvotroscargos");
                setMessageHelp("otros cargos");
                setTitle("otros cargos");
                setType(STRING);
                setMaskInput("U");
                setLength(1);
                setPrintable(false);
                setRestricted(false);
                addItem("A/Apoderado");
                addItem("C/Consejero Delegado");
                addItem("F/Firma");
                addItem("G/Director Gerente");
                addItem("M/Administradores Mancomunados");
                addItem("O/Administrador concursal");
                addItem("P/Presidente");
                addItem("R/Responsable RRHH");
                addItem("S/Socio");
                addItem("T/Titular");
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkBtotrosdatos extends ActionForm
            {
            public LinkBtotrosdatos(Form form)
                {
                super(form);
                setName("btotrosdatos");
                setTitle("&1.Datos Filiación");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
            // SET: VENTANA
            addControl(chadministrador=new CtrlChadministrador(this));
            addControl(chreplegal=new CtrlChreplegal(this));
            addControl(chfirma=new CtrlChfirma(this));
            addControl(chsecretario=new CtrlChsecretario(this));
            addControl(chsocio=new CtrlChsocio(this));
            addControl(chresidente=new CtrlChresidente(this));
            addControl(chrepresentante=new CtrlChrepresentante(this));
            addControl(vvotroscargos=new CtrlVvotroscargos(this));
            addAction(btotrosdatos=new LinkBtotrosdatos(this));
            setSelect(srepre);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public boolean onOkUpdate ()
            {
            if (chadministrador.getBoolean()) srepre.repadministrado.setValue("S");
            else                              srepre.repadministrado.setValue("N");
            
            if (chreplegal.getBoolean())      srepre.repreplegal.setValue("S");
            else                              srepre.repreplegal.setValue("N");
            
            if (chfirma.getBoolean())         srepre.repfirma.setValue("S");
            else                              srepre.repfirma.setValue("N");
            
            if (chresidente.getBoolean())     srepre.represidente.setValue("S");
            else                              srepre.represidente.setValue("N");
            
            if (chsecretario.getBoolean())    srepre.repsecretario.setValue("S");
            else                              srepre.repsecretario.setValue("N");
            
            if (chrepresentante.getBoolean())  srepre.reppresentante.setValue("S");
            else                               srepre.reppresentante.setValue("N");
            
            // if (chsocio.getBoolean())          srepre.repsocios.setValue("S");
            // else                               srepre.repsocios.setValue("N");
            if ( vvotroscargos.isNull() ) srepre.repsocios.setValue("N");
            else                          srepre.repsocios.setValue(vvotroscargos.getString());
            
            
            return super.onOkUpdate();
            }
        public void onBeginRecord ()
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
            admin=srepre.represidente.getString();
            valorCheck(admin,chresidente);
            admin=srepre.reppresentante.getString();
            valorCheck(admin,chrepresentante);
            
            if ( srepre.repsocios.isNull() || srepre.repsocios.getString().equals("N") ) vvotroscargos.setNull();
            else                                                                           vvotroscargos.setValue(srepre.repsocios.getString());
            
            // admin=srepre.repsocios.getString();
            // valorCheck(admin,chsocio);
            }
        }
        
    public class FormVnifes extends MonoDataForm
        {
        // GLOBALES: VENTANA
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
        // Metodos
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
        // Fieldsets
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (getNumState()!=DataForm.INSERT || (nifValido!=null && nifValido.equals(getString())))
                  return true;
                nifValido=Util.esCIF(getString());
                if (nifValido==null)
                  return false;
                else
                  danifcif.setValue(nifValido);
                nifYaExiste(nifValido);
                return true;
                }
            public Object getDefault ()
                {
                return vnifcif;
                
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlDatapell1 extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatapell1(Form form)
                {
                super(form);
                setName("datapell1");
                setTitle("ape1");
                setType(STRING);
                setLength(100);
                setPrintable(false);
                setField(snifes.datapell1);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
                setTitle("ape2");
                setType(STRING);
                setLength(25);
                setPrintable(false);
                setField(snifes.datapell2);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatnombre extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatnombre(Form form)
                {
                super(form);
                setName("datnombre");
                setTitle("nom");
                setType(STRING);
                setLength(20);
                setPrintable(false);
                setField(snifes.datnombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
                if (getString().equals("J")){
                  datapell2.setEnabled(false);
                  datnombre.setEnabled(false);
                  }
                else {
                  datapell2.setEnabled(true);
                  datnombre.setEnabled(true);
                  }
                }
            public boolean obligate ()
                {
                return true;
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
            }
            
        public class CtrlDatfax extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatfax(Form form)
                {
                super(form);
                setName("datfax");
                setTitle("fax");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                setField(snifes.datfax);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
                setTitle("eatdele");
                setType(INTEGER);
                setPickUp(pickup=new mae.easp.general.pkdelegaciones.PickPkdelegaciones(this));
                setLength(2);
                setPrintable(false);
                setField(snifes.cdpaeatdele);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                cdpaeatadm.pickup.sadministracion.setWhere(null);
                cdpaeatadm.pickup.delegacion=getInteger();
                cdpaeatadm.pickup.sadministracion.execute();
                }
            public boolean obligate ()
                {
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
                setTitle("eatadm");
                setType(INTEGER);
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
                setTitle("Codi");
                setType(DOUBLE);
                setMaskInput("999999");
                setProtect(true);
                setLength(6);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
            
        public class CtrlCdpref extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true;
                }
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
                setTitle("rel");
                setType(STRING);
                setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
                setLength(12);
                setPrintable(false);
                setField(snifes.cdpcdprel);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
            // SET: VENTANA
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
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            if (modo==1) 
              setTitle("Datos de la afiliación del nuevo cliente");
            else
              setTitle("Datos de la afiliación del cliente: "+sgeneral.cdpcodi.getString());
            snifes.cdp.setCheckDuplicates(true);
            super.onInit();
            }
        public void onExit ()
            {
            super.onExit();
            vdatosafiliacio.doShow();
            }
        public boolean onOkInsert ()
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
        // GLOBALES: SELECT
        // Metodos
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
        // GET: SELECT
        public String getWhere ()
            {
            return "cdpcodi='"+codiCDP+"'";
            }
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
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "numaplic like 'GENERAL%'";
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
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "numaplic like 'GENERAL%'";
            }
        // EVENT: SELECT
        }
        
    public class FormVcdp extends MonoDataForm
        {
        // GLOBALES: VENTANA
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
        // Metodos
        // Controles
        public CtrlDanifcif danifcif;
        public CtrlVref vref;
        public CtrlCdpcdprel cdpcdprel;
        public CtrlCdpaeatdele cdpaeatdele;
        public CtrlCdpaeatadm cdpaeatadm;
        // Acciones
        // Fieldsets
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                String valido=Util.esCIF(getString());
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
            public Object getDefault ()
                {
                return vnifcif;
                }
            }
            
        public class CtrlVref extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVref(Form form)
                {
                super(form);
                setName("vref");
                setMessageHelp("Referencia de la actividad");
                setTitle("Referencia");
                setType(STRING);
                setLength(45);
                setPrintable(false);
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
                setTitle("Empresa relacionada");
                setType(STRING);
                setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
                setLength(12);
                setPrintable(false);
                setField(snifcdp.cdpcdprel);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                vnifes.cdpcdprel.setValue(this);
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
                setTitle("Delegación Hacienda");
                setType(INTEGER);
                setPickUp(pickup=new mae.easp.general.pkdelegaciones.PickPkdelegaciones(this));
                setLength(10);
                setPrintable(false);
                setField(snifcdp.cdpaeatdele);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
            // SET: VENTANA
            addSelect(snifcdp=new Snifcdp());
            addControl(danifcif=new CtrlDanifcif(this));
            addControl(vref=new CtrlVref(this));
            addControl(cdpcdprel=new CtrlCdpcdprel(this));
            addControl(cdpaeatdele=new CtrlCdpaeatdele(this));
            addControl(cdpaeatadm=new CtrlCdpaeatadm(this));
            setSelect(snifcdp);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onExit ()
            {
            super.onExit();
            vdatosafiliacio.doShow();
            }
        }
        
    // select de nif y cdp
    public class Snifcdp extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Nifes(Select select)
                {
                super(select);
                setName("nifes");
                setOptions(READ | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        class Cdp extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Cdp(Select select)
                {
                super(select);
                setName("cdp");
                setOptions(READ | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Snifcdp()
            {
            setName("snifcdp");
            // SET: SELECT
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
        // GET: SELECT
        public String getWhere ()
            {
            return "cdpcodi='"+codiCDP+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVservicios extends MonoDataForm
        {
        // GLOBALES: VENTANA
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
        // Metodos
        // Controles
        public CtrlChagpi chagpi;
        public CtrlChconta chconta;
        public CtrlCheo cheo;
        public CtrlChgestion chgestion;
        public CtrlChnomina chnomina;
        public CtrlChrenta chrenta;
        public CtrlChiss chiss;
        public CtrlBtpasswdacc btpasswdacc;
        public CtrlCdppwd cdppwd;
        public CtrlCdpcdprel cdpcdprel;
        // Acciones
        public LinkAcaltasfitgen acaltasfitgen;
        // Fieldsets
        public FSetFs1 fs1;
        public FSetFs2 fs2;
        public FSetFs3 fs3;
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(2);
                setHeight(1);
                setTitle("Servicios");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlChagpi extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChagpi(Form form)
                {
                super(form);
                setName("chagpi");
                setTitle("afinity");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
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
            // GET: CHECKBOX
            }
            
        public class CtrlChconta extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChconta(Form form)
                {
                super(form);
                setName("chconta");
                setTitle("Contabilidad");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlCheo extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlCheo(Form form)
                {
                super(form);
                setName("cheo");
                setTitle("Estimación");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChgestion extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChgestion(Form form)
                {
                super(form);
                setName("chgestion");
                setTitle("Gestión");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChnomina extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChnomina(Form form)
                {
                super(form);
                setName("chnomina");
                setTitle("Nómina");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChrenta extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChrenta(Form form)
                {
                super(form);
                setName("chrenta");
                setTitle("Renta");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChiss extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChiss(Form form)
                {
                super(form);
                setName("chiss");
                setTitle("Sociedades");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlBtpasswdacc extends ControlButton
            {
            // GLOBALES: BOTON
            // Metodos
            public CtrlBtpasswdacc(Form form)
                {
                super(form);
                setName("btpasswdacc");
                setTitle("Contraseña de acceso");
                setTitle("Contraseña de acceso");
                // SET: BOTON
                }
            // EVENT: BOTON
            public void onClick ()
                {
                super.onClick();
                if (Aplication.getAplication().getUser().toUpperCase().equals("ADMIN"))
                  vcontrasenya.open();
                else
                  Maefc.message("Acceso Denegado.\nSolo Tratable por ADMIN","Atención",Maefc.INFORMATION_MESSAGE);
                }
            // GET: BOTON
            }
            
        public class CtrlCdppwd extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                setMessageHelp("CDP relacionado");
                setTitle("CDP relacionado");
                setType(STRING);
                setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
                setLength(12);
                setPrintable(false);
                setField(sservicioscdp.cdpcdprel);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAcaltasfitgen extends Action
            {
            public LinkAcaltasfitgen(Form form)
                {
                super(form);
                setName("acaltasfitgen");
                setTitle("&1. Alta Empresa aplicaciones");
                // SET: ACCION
                setOptions(SEARCH | SHOW | UPDATE | INSERT);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                
                
                valtasfitgen.open() ;
                }
            }
            
        public class FSetFs1 extends Fieldset
            {
            public FSetFs1(Form form)
                {
                super(form);
                setTitulo("Servicios disponibles");
                addControl(chconta);
                addControl(cheo);
                addControl(chgestion);
                getWebProperties().setAnchoColumnas (6);
                getWebProperties().setSizeSeparacionR (0);
                }
            }
            
        public class FSetFs2 extends Fieldset
            {
            public FSetFs2(Form form)
                {
                super(form);
                addControl(chnomina);
                addControl(chrenta);
                addControl(chiss);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (6);
                getWebProperties().setSizeLineaSup (43);
                }
            }
            
        public class FSetFs3 extends Fieldset
            {
            public FSetFs3(Form form)
                {
                super(form);
                addControl(btpasswdacc);
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
            // SET: VENTANA
            addSelect(sservicioscdp=new Sservicioscdp());
            addControl(chagpi=new CtrlChagpi(this));
            addControl(chconta=new CtrlChconta(this));
            addControl(cheo=new CtrlCheo(this));
            addControl(chgestion=new CtrlChgestion(this));
            addControl(chnomina=new CtrlChnomina(this));
            addControl(chrenta=new CtrlChrenta(this));
            addControl(chiss=new CtrlChiss(this));
            addControl(btpasswdacc=new CtrlBtpasswdacc(this));
            addControl(cdppwd=new CtrlCdppwd(this));
            addControl(cdpcdprel=new CtrlCdpcdprel(this));
            addAction(acaltasfitgen=new LinkAcaltasfitgen(this));
            addFieldset(fs1=new FSetFs1(this));
            addFieldset(fs2=new FSetFs2(this));
            addFieldset(fs3=new FSetFs3(this));
            setSelect(sservicioscdp);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public boolean onOkUpdate ()
            {
            actualizarChecks();
            return super.onOkUpdate();
            }
        public void onBeginRecord ()
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
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Cdp(Select select)
                {
                super(select);
                setName("cdp");
                setOptions(READ | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sservicioscdp()
            {
            setName("sservicioscdp");
            // SET: SELECT
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
        // GET: SELECT
        public String getWhere ()
            {
            return "cdpcodi="+sgeneral.cdpcodi.getSQLFormat();
            }
        // EVENT: SELECT
        }
        
    public class FormVcontrasenya extends MonoDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlCdppwdacc cdppwdacc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(300);
                setHeight(150);
                setTitle("Contraseña acceso Empresa");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlCdppwdacc extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
            // SET: VENTANA
            addControl(cdppwdacc=new CtrlCdppwdacc(this));
            setSelect(sservicioscdp);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVserviciosdet extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlCdpcodi cdpcodi;
        public CtrlCdpref cdpref;
        public CtrlVservicio vservicio;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(1);
                setHeight(1);
                setTitle("Servicios relacionados");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlCdpcodi extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCdpcodi(Form form)
                {
                super(form);
                setName("cdpcodi");
                setTitle("Código");
                setType(STRING);
                setLength(12);
                setPrintable(false);
                setField(sservicios.cdpcodi);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCdpref extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVservicio extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVservicio(Form form)
                {
                super(form);
                setName("vservicio");
                setMessageHelp("Tipo de servicio");
                setTitle("Servicio");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVserviciosdet(ProgPrclfichagener prclfichagener)
            {
            super(prclfichagener);
            setName("vserviciosdet");
            setTitle("Servicios relacionados");
            setLocation(new Location());
            setStates(SHOW);
            setModal(true);
            // SET: VENTANA
            addSelect(sservicios=new Sservicios());
            addControl(cdpcodi=new CtrlCdpcodi(this));
            addControl(cdpref=new CtrlCdpref(this));
            addControl(vservicio=new CtrlVservicio(this));
            setSelect(sservicios);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord();
            vservicio.setValue("Contabilidad");
            }
        }
        
    // Servicios encontrados
    public class Sservicios extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Cdp cdp;
        // Campos
        public Field cdpcodi;
        public Field cdpref;
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
            
        public Sservicios()
            {
            setName("sservicios");
            setFather(sgeneral);
            // SET: SELECT
            addTable(cdp=new Cdp(this));
            addField(cdpcodi=new Field(this,cdp,"cdpcodi"));
            addField(cdpref=new Field(this,cdp,"cdpref"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "cdpcodi="+sgeneral.cdpcodi.getSQLFormat()+" or cdpcdprel="+sgeneral.cdpcodi.getSQLFormat();
            }
        public String getOrder ()
            {
            return "cdpcodi";
            }
        // EVENT: SELECT
        }
        
    public class FormVnifrepresentan extends MonoDataForm
        {
        // GLOBALES: VENTANA
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
        // Metodos
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
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(705);
                setHeight(400);
                setTitle("Datos del representante");
                setModal(true);
                setLocation(SOUTH);
                }
            }
            
        public class CtrlDanifcif extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
                    setLength(65);
                    }
                }
                
            public CtrlDatapell1(Form form)
                {
                super(form);
                setLook(new Look());
                setName("datapell1");
                setTitle("ape1");
                setType(STRING);
                setLength(100);
                setPrintable(false);
                setField(snifrepresentan.datapell1);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatapell2 extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatapell2(Form form)
                {
                super(form);
                setName("datapell2");
                setTitle("ape2");
                setType(STRING);
                setLength(25);
                setPrintable(false);
                setField(snifrepresentan.datapell2);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatnombre extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatnombre(Form form)
                {
                super(form);
                setName("datnombre");
                setTitle("nom");
                setType(STRING);
                setLength(20);
                setPrintable(false);
                setField(snifrepresentan.datnombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
                setField(snifrepresentan.datfisicajuri);
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
                setTitle("tel");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                setField(snifrepresentan.dattel);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatfax extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatfax(Form form)
                {
                super(form);
                setName("datfax");
                setTitle("fax");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                setField(snifrepresentan.datfax);
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
                setTitle("contacto");
                setType(STRING);
                setLength(30);
                setPrintable(false);
                setField(snifrepresentan.datcontacto);
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
                setTitle("siglas");
                setType(STRING);
                setMaskInput("U");
                setPickUp(pickup=new mae.easp.general.pksiglas.PickPksiglas(this));
                setLength(2);
                setPrintable(false);
                setDescriptionShow(false);
                setField(snifrepresentan.datsiglas);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatvia extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatvia(Form form)
                {
                super(form);
                setName("datvia");
                setTitle("via");
                setType(STRING);
                setLength(45);
                setPrintable(false);
                setField(snifrepresentan.datvia);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatnum extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDatnum(Form form)
                {
                super(form);
                setName("datnum");
                setTitle("num");
                setType(STRING);
                setLength(6);
                setPrintable(false);
                setField(snifrepresentan.datnum);
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
                setTitle("esc");
                setType(STRING);
                setMaskInput("U");
                setLength(2);
                setPrintable(false);
                setField(snifrepresentan.datesc);
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
                setTitle("piso");
                setType(STRING);
                setLength(2);
                setPrintable(false);
                setField(snifrepresentan.datpiso);
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
                setTitle("letra");
                setType(STRING);
                setMaskInput("U");
                setLength(2);
                setPrintable(false);
                setField(snifrepresentan.datletra);
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
                setTitle("prov");
                setType(INTEGER);
                setPickUp(pickup=new mae.easp.general.pkprovincias.PickPkprovincias(this));
                setLength(2);
                setPrintable(false);
                setField(snifrepresentan.datprov);
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
                
                  if (!isReading())
                    if (!isNull()) datcpos.setValue(Util.formateoNumero("00",getInteger()));
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
                setTitle("mun");
                setType(INTEGER);
                setPickUp(pickup=new mae.easp.general.pkmunicipios.PickPkmunicipios(this));
                setLength(5);
                setPrintable(false);
                setField(snifrepresentan.datmuni);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                if (!isNull())
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
                setTitle("pobl");
                setType(STRING);
                setLength(30);
                setPrintable(false);
                setField(snifrepresentan.datpobla);
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
                setTitle("cp");
                setType(STRING);
                setLength(5);
                setPrintable(false);
                setField(snifrepresentan.datcpos);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
                setTitle("pais");
                setType(INTEGER);
                setPickUp(pickup=new mae.easp.general.pkpaises.PickPkpaises(this));
                setLength(3);
                setPrintable(false);
                setField(snifrepresentan.datpais);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
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
            // SET: VENTANA
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
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
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
        public void onExit ()
            {
            vrepresent.doShow();
            super.onExit();
            }
        }
        
    // select de modificacion de los datos del representante
    public class Snifrepresentan extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Nifes(Select select)
                {
                super(select);
                setName("nifes");
                setOptions(READ | INSERT | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        class Representantes extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Representantes(Select select)
                {
                super(select);
                setName("representantes");
                setOptions(READ | INSERT | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Snifrepresentan()
            {
            setName("snifrepresentan");
            // SET: SELECT
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
        // GET: SELECT
        public String getWhere ()
            {
            return "danifcif="+srepre.repnifcif.getSQLFormat();
            }
        // EVENT: SELECT
        }
        
    public class FormVcambiobanco extends ProcessForm
        {
        // GLOBALES: VENTANA
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
        // Metodos
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
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(725);
                setHeight(250);
                setTitle("Cambio Cuenta Bancaria");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlVvbancorig extends ControlComboBox
            {
            public mae.easp.general.pkbancos.PickPkbancos pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlVvoficinaorig extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvdcorigen extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvcuentaorig extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcuentaorig(Form form)
                {
                super(form);
                setName("vvcuentaorig");
                setTitle("Cuenta Origen");
                setType(STRING);
                setLength(10);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvbancodest extends ControlComboBox
            {
            public mae.easp.general.pkbancos.PickPkbancos pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlVvoficinadest extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvoficinadest(Form form)
                {
                super(form);
                setName("vvoficinadest");
                setTitle("Oficina Destino");
                setType(INTEGER);
                setMaskInput("9999");
                setLength(4);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlVvdcdest extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdcdest(Form form)
                {
                super(form);
                setName("vvdcdest");
                setTitle("DC Destino");
                setType(INTEGER);
                setMaskInput("99");
                setLength(2);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlVvcuentadest extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcuentadest(Form form)
                {
                super(form);
                setName("vvcuentadest");
                setTitle("Cuenta Destino");
                setType(STRING);
                setLength(10);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (Util.isNumero(this.getString()) && this.getString().length() == 10)
                  return super.valid();
                else
                  return false;
                }
            public boolean obligate ()
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
                // SET: ACCION
                setOptions(SEARCH | SHOW | UPDATE | INSERT);
                }
            // EVENT: ACCION
            public void onAction ()
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
            // SET: VENTANA
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
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVcendbancos extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlCebcodiemp cebcodiemp;
        public CtrlCebcodigo cebcodigo;
        public CtrlCebpago cebpago;
        public CtrlCebbanco cebbanco;
        public CtrlCebsucursal cebsucursal;
        public CtrlCebdigito cebdigito;
        public CtrlCebnumero cebnumero;
        // Acciones
        // Fieldsets
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCebcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCebpago extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCebbanco extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCebbanco(Form form)
                {
                super(form);
                setName("cebbanco");
                setTitle("Banco");
                setType(STRING);
                setLength(4);
                setSearchable(true);
                setField(scendbancos.cebbanco);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlCebsucursal extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCebsucursal(Form form)
                {
                super(form);
                setName("cebsucursal");
                setTitle("Oficina");
                setType(STRING);
                setLength(4);
                setSearchable(true);
                setField(scendbancos.cebsucursal);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlCebdigito extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCebdigito(Form form)
                {
                super(form);
                setName("cebdigito");
                setTitle("DC");
                setType(STRING);
                setLength(2);
                setSearchable(true);
                setField(scendbancos.cebdigito);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlCebnumero extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCebnumero(Form form)
                {
                super(form);
                setName("cebnumero");
                setTitle("Número");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(scendbancos.cebnumero);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (Util.isNumero(this.getString()) && this.getString().length() == 10)
                  return super.valid();
                else
                  return false;
                }
            public boolean obligate ()
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
            // SET: VENTANA
            addSelect(scendbancos=new Scendbancos());
            addControl(cebcodiemp=new CtrlCebcodiemp(this));
            addControl(cebcodigo=new CtrlCebcodigo(this));
            addControl(cebpago=new CtrlCebpago(this));
            addControl(cebbanco=new CtrlCebbanco(this));
            addControl(cebsucursal=new CtrlCebsucursal(this));
            addControl(cebdigito=new CtrlCebdigito(this));
            addControl(cebnumero=new CtrlCebnumero(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Scendbancos extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Cendbancos(Select select)
                {
                super(select);
                setName("cendbancos");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Scendbancos()
            {
            setName("scendbancos");
            // SET: SELECT
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
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public class FormVdomi extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDoasesor doasesor;
        public CtrlDocliente docliente;
        public CtrlDocontador docontador;
        public CtrlDobanco dobanco;
        public CtrlDooficina dooficina;
        public CtrlDodigcon dodigcon;
        public CtrlDocuenta docuenta;
        // Acciones
        // Fieldsets
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDocliente extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDocontador extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDobanco extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDobanco(Form form)
                {
                super(form);
                setName("dobanco");
                setTitle("Banco");
                setType(STRING);
                setLength(4);
                setSearchable(true);
                setField(sdomi.dobanco);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            public void onChange ()
                {
                super.onChange();
                if (!isReading() && getString().length()>0  && Util.isNumero(getString()) )
                  setValue(Numero.format(Integer.parseInt(getString()),"0000"));
                }
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlDooficina extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDooficina(Form form)
                {
                super(form);
                setName("dooficina");
                setTitle("Sucursal");
                setType(STRING);
                setLength(4);
                setSearchable(true);
                setField(sdomi.dooficina);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            public void onChange ()
                {
                super.onChange();
                if (!isReading() && getString().length()>0  && Util.isNumero(getString()) )
                  setValue(Numero.format(Integer.parseInt(getString()),"0000"));
                }
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlDodigcon extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDodigcon(Form form)
                {
                super(form);
                setName("dodigcon");
                setTitle("DC");
                setType(STRING);
                setLength(2);
                setSearchable(true);
                setField(sdomi.dodigcon);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            public void onChange ()
                {
                super.onChange();
                if (!isReading() && getString().length()>0  && Util.isNumero(getString()) )
                  setValue(Numero.format(Integer.parseInt(getString()),"00"));
                }
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlDocuenta extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDocuenta(Form form)
                {
                super(form);
                setName("docuenta");
                setTitle("Cuenta");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(sdomi.docuenta);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                
                if (!Util.isNumero(getString())) {
                  setMessageWarning("El valor de este campo debe ser numérico.");
                  return false;
                  }
                return super.valid();
                }
            public void onChange ()
                {
                super.onChange();
                if (!isReading() && getString().length() > 0 && Util.isNumero(getString()) ) {
                  setValue(Numero.format(Double.valueOf(getString()).doubleValue(),"0000000000"));
                  }
                }
            public boolean obligate ()
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
            // SET: VENTANA
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
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Sdomi extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Domi(Select select)
                {
                super(select);
                setName("domi");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdomi()
            {
            setName("sdomi");
            // SET: SELECT
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
        // GET: SELECT
        public String getWhere ()
            {
            return "docolectivo = 1";
            }
        public String getOrder ()
            {
            return "doasesor,docliente,dobanco,dooficina";
            }
        // EVENT: SELECT
        }
        
    // 
    public class Sfichageneral extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Fitgen fitgen;
        // Campos
        public Field fgasesor;
        public Field fgcliente;
        public Field fgcodigocdp;
        class Fitgen extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Fitgen(Select select)
                {
                super(select);
                setName("fitgen");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sfichageneral()
            {
            setName("sfichageneral");
            // SET: SELECT
            addTable(fitgen=new Fitgen(this));
            addField(fgasesor=new Field(this,fitgen,"fgasesor"));
            addField(fgcliente=new Field(this,fitgen,"fgcliente"));
            addField(fgcodigocdp=new Field(this,fitgen,"fgcodigocdp"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public class FormValtasfitgen extends ProcessForm
        {
        // GLOBALES: VENTANA
        String gnifCliente = "" ;
String nombrecomp = "" ;
String gcliente = "" ;

String primer = "" ;
String segundo = "" ;
String nombre = "" ; 


public void onOpened() {

  String codigoDominio = sgeneral.cdpcodi.getString() ;
  

  chaltajnomina.setValue(false);
  vvcodijnomina.setNull();
  chaltajnomina.setEnabled(false);
  vvcodijnomina.setEnabled(false);
  if ( !vservicios.chnomina.getBoolean()   ) {
    chaltajnomina.setEnabled(true);
    // vvcodijnomina.setEnabled(true);
    }


  chaltajeo.setValue(false);
  vvcodjeos.setNull();
  chaltajeo.setEnabled(false);
  vvcodjeos.setEnabled(false);
  if ( !vservicios.cheo.getBoolean() ) {
    chaltajeo.setEnabled(true);
    // vvcodjeos.setEnabled(true);
    }

  chaltajconta.setValue(false);
  vvcodjconta.setNull();
  vvejerjconta.setNull();
  chaltajconta.setEnabled(false);
  vvcodjconta.setEnabled(false);
  vvejerjconta.setEnabled(false);
  if ( !vservicios.chconta.getBoolean() ) {
    chaltajconta.setEnabled(true);
    // vvcodjconta.setEnabled(true);
    // vvejerjconta.setEnabled(true);
    }

  chaltajiss.setValue(false);
  vvcodjiss.setNull();
  vvejerjiss.setNull();
  chaltajiss.setEnabled(false);
  vvcodjiss.setEnabled(false);
  vvejerjiss.setEnabled(false);
  if ( !vservicios.chiss.getBoolean() ) {
    chaltajiss.setEnabled(true);
    // vvcodjiss.setEnabled(true);
    // vvejerjiss.setEnabled(true);
    }

  chaltarenta.setValue(false);
  vvcodjrenta.setNull();
  vvejerjrenta.setNull();
  vvcodrenta.setNull();

  chaltarenta.setEnabled(false);
  vvcodjrenta.setEnabled(false);
  vvejerjrenta.setEnabled(false);
  vvcodrenta.setEnabled(false);
  if ( !vservicios.chrenta.getBoolean() ) {
    chaltarenta.setEnabled(true);
    // vvcodjrenta.setEnabled(true);
    // vvejerjrenta.setEnabled(true);
    // vvcodrenta.setEnabled(true);
    }


  super.onOpened();

  }
        // Metodos
        // Controles
        public CtrlChaltajnomina chaltajnomina;
        public CtrlVvcodijnomina vvcodijnomina;
        public CtrlChaltajeo chaltajeo;
        public CtrlVvcodjeos vvcodjeos;
        public CtrlChaltajconta chaltajconta;
        public CtrlVvcodjconta vvcodjconta;
        public CtrlVvejerjconta vvejerjconta;
        public CtrlChaltajiss chaltajiss;
        public CtrlVvcodjiss vvcodjiss;
        public CtrlVvejerjiss vvejerjiss;
        public CtrlChaltarenta chaltarenta;
        public CtrlVvcodjrenta vvcodjrenta;
        public CtrlVvejerjrenta vvejerjrenta;
        public CtrlVvcodrenta vvcodrenta;
        // Acciones
        public LinkAcejecaltas acejecaltas;
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(685);
                setHeight(500);
                setTitle("Altas Ficha General");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlChaltajnomina extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChaltajnomina(Form form)
                {
                super(form);
                setName("chaltajnomina");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                return true;
                }
                
                public void userChange(Value v) {
                  super.userChange(v);
                  vvcodijnomina.setEnabled(false);
                  if ( v.getBoolean() ) {
                    Fitgen fitgen = new Fitgen();
                    String codigoDominio = sgeneral.cdpcodi.getString().substring(6,12) ;
                    int codiCli = Integer.valueOf(codigoDominio);
                    // int codigo = fitgen.getCodigo(Easp.connEA,gcliente,gnifCliente,"JNOMINA",vvcodijnomina.getInteger(),vvcodjeos.getInteger(),vvcodjconta.getInteger(),vvcodjiss.getInteger(),vvcodjrenta.getInteger());
                    // int codigo = fitgen.getCodigo(Easp.connEA,gcliente,gnifCliente,"JNOMINA",codiCli,codiCli,codiCli,codiCli,codiCli);
                    // if ( codigo >= 0 ) vvcodijnomina.setEnabled(true);
                    // if ( codigo >  0 ) vvcodijnomina.setValue(codigo);
                    vvcodijnomina.setValue(codiCli);
                    }
                  else {
                    vvcodijnomina.setNull();
                    }
                }
            // GET: CHECKBOX
            }
            
        public class CtrlVvcodijnomina extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcodijnomina(Form form)
                {
                super(form);
                setName("vvcodijnomina");
                setTitle("");
                setType(INTEGER);
                setLength(6);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlChaltajeo extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChaltajeo(Form form)
                {
                super(form);
                setName("chaltajeo");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                return true;
                }
                
                public void userChange(Value v) {
                  super.userChange(v);
                  if ( v.getBoolean() ) {
                    Fitgen fitgen = new Fitgen();
                    String codigoDominio = sgeneral.cdpcodi.getString().substring(6,12) ;
                    int codiCli = Integer.valueOf(codigoDominio);
                    vvcodjeos.setValue(codiCli);
                    }
                  else {
                    vvcodjeos.setNull();
                    }
                }
            // GET: CHECKBOX
            }
            
        public class CtrlVvcodjeos extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcodjeos(Form form)
                {
                super(form);
                setName("vvcodjeos");
                setTitle("");
                setType(INTEGER);
                setLength(6);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlChaltajconta extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChaltajconta(Form form)
                {
                super(form);
                setName("chaltajconta");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                return true;
                }
                
                public void userChange(Value v) {
                  super.userChange(v);
                  if ( v.getBoolean() ) {
                    Fitgen fitgen = new Fitgen();
                    String codigoDominio = sgeneral.cdpcodi.getString().substring(6,12) ;
                    int codiCli = Integer.valueOf(codigoDominio);
                    vvcodjconta.setValue(codiCli);
                    vvejerjconta.setEnabled(true);
                    }
                  else {
                    vvcodjconta.setNull();
                    vvejerjconta.setEnabled(false);
                    }
                }
            // GET: CHECKBOX
            }
            
        public class CtrlVvcodjconta extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcodjconta(Form form)
                {
                super(form);
                setName("vvcodjconta");
                setTitle("");
                setType(INTEGER);
                setLength(6);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvejerjconta extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvejerjconta(Form form)
                {
                super(form);
                setName("vvejerjconta");
                setTitle("");
                setType(INTEGER);
                setLength(4);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return isEnabled();
                }
            }
            
        public class CtrlChaltajiss extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChaltajiss(Form form)
                {
                super(form);
                setName("chaltajiss");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                return true;
                }
                
                public void userChange(Value v) {
                  super.userChange(v);
                  if ( v.getBoolean() ) {
                    Fitgen fitgen = new Fitgen();
                    String codigoDominio = sgeneral.cdpcodi.getString().substring(6,12) ;
                    int codiCli = Integer.valueOf(codigoDominio);
                    vvcodjiss.setValue(codiCli);
                    vvejerjiss.setEnabled(true);
                    }
                  else {
                    vvcodjiss.setNull();
                    vvejerjiss.setEnabled(false);
                    }
                }
            // GET: CHECKBOX
            }
            
        public class CtrlVvcodjiss extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcodjiss(Form form)
                {
                super(form);
                setName("vvcodjiss");
                setTitle("");
                setType(INTEGER);
                setLength(6);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvejerjiss extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvejerjiss(Form form)
                {
                super(form);
                setName("vvejerjiss");
                setTitle("");
                setType(INTEGER);
                setLength(4);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return isEnabled();
                }
            }
            
        public class CtrlChaltarenta extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChaltarenta(Form form)
                {
                super(form);
                setName("chaltarenta");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                return true;
                }
                
                public void userChange(Value v) {
                  super.userChange(v);
                  if ( v.getBoolean() ) {
                    Fitgen fitgen = new Fitgen();
                    String codigoDominio = sgeneral.cdpcodi.getString().substring(6,12) ;
                    int codiCli = Integer.valueOf(codigoDominio);
                    vvcodjrenta.setValue(codiCli);
                    vvejerjrenta.setEnabled(true);
                    vvcodrenta.setEnabled(true);
                    vvcodrenta.setValue(sgeneral.cdpnifcif.getString());
                    }
                  else {
                    vvcodjrenta.setNull();
                    vvejerjrenta.setEnabled(false);
                    vvcodrenta.setEnabled(false);
                    vvcodrenta.setNull();
                    }
                }
            // GET: CHECKBOX
            }
            
        public class CtrlVvcodjrenta extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcodjrenta(Form form)
                {
                super(form);
                setName("vvcodjrenta");
                setTitle("");
                setType(INTEGER);
                setLength(6);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvejerjrenta extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvejerjrenta(Form form)
                {
                super(form);
                setName("vvejerjrenta");
                setTitle("");
                setType(INTEGER);
                setLength(4);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return isEnabled();
                }
            }
            
        public class CtrlVvcodrenta extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcodrenta(Form form)
                {
                super(form);
                setName("vvcodrenta");
                setTitle("");
                setType(STRING);
                setMaskInput("U");
                setLength(12);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAcejecaltas extends Action
            {
            public LinkAcejecaltas(Form form)
                {
                super(form);
                setName("acejecaltas");
                setTitle("&1 Ejecutar Altas");
                // SET: ACCION
                setOptions(SEARCH | SHOW | UPDATE | INSERT | EOF);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                
                
                Fitgen fitgen = new Fitgen();
                
                gnifCliente = sgeneral.danifcif.getString();
                nombrecomp  = vdatosafiliacio.vcliente.getString();
                
                primer  =   sgeneral.datapell1.getString();
                segundo =   sgeneral.datapell2.getString(); 
                nombre  =   sgeneral.datnombre.getString();
                
                
                
                
                if ( chaltajnomina.getBoolean() ) {
                  fitgen.altaEmpresajNomina(sservicioscdp.getDataBase(),gcliente,gnifCliente,vvcodijnomina.getInteger(),nombrecomp );
                  }
                
                if ( chaltajeo.getBoolean() ) {
                  fitgen.altaEmpresajEstimacion(sservicioscdp.getDataBase(),gcliente,gnifCliente,vvcodjeos.getInteger(),nombrecomp );
                  }
                
                
                if ( chaltajconta.getBoolean() ) {
                  fitgen.altaEmpresajConta(sservicioscdp.getDataBase(),gcliente,gnifCliente,vvcodjconta.getInteger(),nombrecomp,vvejerjconta.getInteger() );
                  }
                
                
                if ( chaltajiss.getBoolean() ) {
                  fitgen.altaEmpresajISS(sservicioscdp.getDataBase(),gcliente,gnifCliente,vvcodjiss.getInteger(),nombrecomp,vvcodjconta.getInteger(),vvcodijnomina.getInteger(),vvejerjiss.getInteger() );
                  }
                
                
                if ( chaltarenta.getBoolean() ) {
                  fitgen.altaEmpresajRenta(sservicioscdp.getDataBase(),gcliente,gnifCliente,vvcodjrenta.getInteger(),nombrecomp,vvcodjconta.getInteger(),vvcodijnomina.getInteger(),primer,segundo,nombre,vvejerjrenta.getInteger(),vvcodrenta.getString() );
                  }
                
                sservicioscdp.commit();
                sservicioscdp.execute();
                if (sservicioscdp.cdpagpi.getString().equals("S"))   vservicios.chagpi.setValue(true);
                else                                                 vservicios.chagpi.setValue(false);
                
                
                if (sservicioscdp.cdpcknomina.getString().equals("S"))  vservicios.chnomina.setValue(true);
                else                                                    vservicios.chnomina.setValue(false);
                
                
                if (sservicioscdp.cdpckconta.getString().equals("S"))   vservicios.chconta.setValue(true);
                else                                                    vservicios.chconta.setValue(false);
                
                if (sservicioscdp.cdpckgestion.getString().equals("S"))  vservicios.chgestion.setValue(true);
                else                                                     vservicios.chgestion.setValue(false);
                
                
                if (sservicioscdp.cdpckrenta.getString().equals("S"))   vservicios.chrenta.setValue(true);
                else                                                    vservicios.chrenta.setValue(false);
                
                if (sservicioscdp.cdpckeo.getString().equals("S"))      vservicios.cheo.setValue(true);
                else                                                    vservicios.cheo.setValue(false);
                
                
                if (sservicioscdp.cdpckiss.getString().equals("S"))     vservicios.chiss.setValue(true);
                else                                                    vservicios.chiss.setValue(false);
                
                // vservicios.doShow();
                
                
                valtasfitgen.exit();
                Maefc.message("Proceso Finalizado ","Atención",Maefc.INFORMATION_MESSAGE);
                }
            }
            
        public FormValtasfitgen(ProgPrclfichagener prclfichagener)
            {
            super(prclfichagener);
            setName("valtasfitgen");
            setTitle("Altas Ficha General");
            setLocation(new Location());
            setPrintable(false);
            setModal(true);
            // SET: VENTANA
            addControl(chaltajnomina=new CtrlChaltajnomina(this));
            addControl(vvcodijnomina=new CtrlVvcodijnomina(this));
            addControl(chaltajeo=new CtrlChaltajeo(this));
            addControl(vvcodjeos=new CtrlVvcodjeos(this));
            addControl(chaltajconta=new CtrlChaltajconta(this));
            addControl(vvcodjconta=new CtrlVvcodjconta(this));
            addControl(vvejerjconta=new CtrlVvejerjconta(this));
            addControl(chaltajiss=new CtrlChaltajiss(this));
            addControl(vvcodjiss=new CtrlVvcodjiss(this));
            addControl(vvejerjiss=new CtrlVvejerjiss(this));
            addControl(chaltarenta=new CtrlChaltarenta(this));
            addControl(vvcodjrenta=new CtrlVvcodjrenta(this));
            addControl(vvejerjrenta=new CtrlVvejerjrenta(this));
            addControl(vvcodrenta=new CtrlVvcodrenta(this));
            addAction(acejecaltas=new LinkAcejecaltas(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public ProgPrclfichagener()
        {
        this.prclfichagener=this;
        setName("prclfichagener");
        setTitle("Ficha general");
        // SET: PROGRAMA
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
        addForm(valtasfitgen=new FormValtasfitgen(this));
        vcargorepre.btotrosdatos.setForm(vnifrepresentan);
        }
    public ProgPrclfichagener(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
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
        loc.setTitle("Aplicaciones y Servicios");
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
        
        valtasfitgen.setLayout(new LayoutHtml("mae/easp/html/valtasfitgen.html"));
        
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
        valtadatosbanc.setExitOnSave(true);
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
    public void onExit ()
        {
        if ( connJNomina != null ) {
          connJNomina.disconnect();
          }
        
        super.onExit();
        }
    }
    
