// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Tue Jul 16 10:02:36 CEST 2019
// 
// Aplicación: easp
// 
package mae.easp.cnvlogicclass;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: cnvlogicclass
// Nombre:   Conversión
// Versión:  1.0
// 
public class ProgCnvlogicclass extends Program
    {
    public AppEasp easp;
    public ProgCnvlogicclass cnvlogicclass;
    // GLOBALES: PROGRAMA
    //Variables entrada
public boolean fromJCO = false;
public boolean fromJISS = false;
mae.easp.conversions.Conversion.APLICACION_ORIGEN AplicacionOrigen = mae.easp.conversions.Conversion.APLICACION_ORIGEN.LOGICCLASS;

mae.easp.conversions.logicclass.ConversionJCO clcjco;
mae.easp.conversions.logicclass.ConversionJEO clcjeo;
mae.easp.conversions.logicclass.ConversionJISS clcjiss;
mae.easp.conversions.logicclass.ConversionJREN clcjren;
mae.easp.conversions.logicclass.ConversionJNOM clcjnom;
mae.easp.conversions.logicclass.ConversionJGES clcjges;

public void onOpened() {
  super.onOpened();
  disableIniConver ();
  setTitle ("Conversión "+AplicacionOrigen.toString());
}

private void disableIniConver () {
  vcodigos.aini.setEnabled(false);
  vcodigos.aact.setEnabled(false);
}
    // Metodos
    // Ventana
    public FormVconversion vconversion;
    // Selects
    public Scodcnvotraplc scodcnvotraplc;
    // Ventana
    public FormVcodigos vcodigos;
    // Selects
    public Scodcnvotrapll scodcnvotrapll;
    // Ventana
    public FormVincidencias vincidencias;
    // Selects
    public Sincidencias sincidencias;
    // Ventana
    public FormVhistorico vhistorico;
    // Selects
    public Shistor shistor;
    public Shayinciden shayinciden;
    // Ventana
    public FormVdetalle vdetalle;
    // Selects
    public Sdetalle sdetalle;
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Conversión");
            }
        }
        
    public class FormVconversion extends ProcessForm
        {
        // GLOBALES: VENTANA
        public void onOpened() {
  super.onOpened();
  scodcnvotraplc.setWhere ("ccoaplic='"+AplicacionOrigen.toString()+"' and ccohistorico='N'");
  scodcnvotraplc.execute();
  if (!scodcnvotraplc.isEof()) {
    vvempini.setValue(scodcnvotraplc.ccoempini);
    vvempfin.setValue(scodcnvotraplc.ccoempfin);
    vvejeini.setValue(scodcnvotraplc.ccoejeini);
    vvejefin.setValue(scodcnvotraplc.ccoejefin);
    vvservidor.setValue(scodcnvotraplc.ccoservidor);
    vvinstancia.setValue(scodcnvotraplc.ccoinstancia);
    vvnombrebd.setValue(scodcnvotraplc.ccobbdd);
    vvuser.setValue(scodcnvotraplc.ccouserbd);
    vvpasswd.setValue(scodcnvotraplc.ccopwdbd);
    vvctas.setValue(scodcnvotraplc.ccojcoctamayor);
    vvnumalfa.setValue(scodcnvotraplc.ccojcotipocta);
    chsql.setValue(scodcnvotraplc.ccojcosql);
    chproy.setValue(scodcnvotraplc.ccojcocanales);
    chjco.setValue(scodcnvotraplc.ccotraspjco);
    chjeo.setValue(scodcnvotraplc.ccotraspjeo);
    chjre.setValue(scodcnvotraplc.ccotraspjre);
    chjsoc.setValue(scodcnvotraplc.ccotraspjsoc);
    chjges.setValue(scodcnvotraplc.ccotraspjges);
    chjnom.setValue(scodcnvotraplc.ccotraspjnom);
    vcodigos.idConver = scodcnvotraplc.ccocodi.getInteger();
    chestimaciones.setValue(scodcnvotraplc.ccoestimacion);
    chmercantil.setValue(scodcnvotraplc.ccomercantil);
    chmodelos.setValue(scodcnvotraplc.ccomodelos);
    vvdesdedec.setValue(scodcnvotraplc.ccodecdesde);
    vvhastadec.setValue(scodcnvotraplc.ccodechasta);
    vrensimul.setValue(scodcnvotraplc.ccodecsimul); 
    vvdpto.setValue(scodcnvotraplc.ccodepartamento);
  }
  else {
    vvempini.setValue(1);
    vvempfin.setValue(999999);
    vvejeini.setValue(2008);
    vvejefin.setValue(Maefc.getYear(Maefc.getDate()));
    vvservidor.setValue(Easp.getNomPC());
    vvnombrebd.setValue("LOGIC");
    vvuser.setValue("sa");
    vvpasswd.setValue("sa");
    vcodigos.idConver = -1;
  }
  if (fromJCO) {
    chjeo.setEnabled(false);
    chjeo.setValue(false);
    chjsoc.setEnabled(false);
    chjsoc.setValue(false);
    chjre.setEnabled(false);
    chjre.setValue(false);
    chjnom.setEnabled(false);
    chjnom.setValue(false);
    chjges.setEnabled(false);
    chjges.setValue(false);
  }
  else if (fromJISS) {
    chjeo.setEnabled(false);
    chjeo.setValue(false);
    chjco.setEnabled(false);
    chjco.setValue(false);
    chjre.setEnabled(false);
    chjre.setValue(false);
    chjnom.setEnabled(false);
    chjnom.setValue(false);
    chjges.setEnabled(false);
    chjges.setValue(false);
  }
  estadoCampos ();
}


public void estadoCampos () {
  //Parametros jConta
  vvctas.setEnabled(chjco.getBoolean());
  chforzarcp.setEnabled(chjco.getBoolean() && "4".equals(vvctas.getString()));
  vvnumalfa.setEnabled(chjco.getBoolean());
  chsql.setEnabled(chjco.getBoolean());
  chproy.setEnabled(chjco.getBoolean());
  vvdpto.setEnabled(chjnom.getBoolean());
  // Parametros jEO
  chestimaciones.setEnabled(chjeo.getBoolean()); 
  chmercantil.setEnabled(chjeo.getBoolean()); 
  chmodelos.setEnabled(chjeo.getBoolean()); 
  // jRenta
  vvdesdedec.setEnabled(chjre.getBoolean());
  vvhastadec.setEnabled(chjre.getBoolean());
  vrensimul.setEnabled(chjre.getBoolean()); 
}
        // Metodos
        // Controles
        public CtrlVvempini vvempini;
        public CtrlVvempfin vvempfin;
        public CtrlVvejeini vvejeini;
        public CtrlVvejefin vvejefin;
        public CtrlVvservidor vvservidor;
        public CtrlVvinstancia vvinstancia;
        public CtrlVvnombrebd vvnombrebd;
        public CtrlVvuser vvuser;
        public CtrlVvpasswd vvpasswd;
        public CtrlChjco chjco;
        public CtrlChforzarcp chforzarcp;
        public CtrlVvnumalfa vvnumalfa;
        public CtrlChjeo chjeo;
        public CtrlChmercantil chmercantil;
        public CtrlChjre chjre;
        public CtrlVvdesdedec vvdesdedec;
        public CtrlVvhastadec vvhastadec;
        public CtrlVrensimul vrensimul;
        public CtrlChjnom chjnom;
        public CtrlChconvenio chconvenio;
        public CtrlVvctas vvctas;
        public CtrlChsql chsql;
        public CtrlChproy chproy;
        public CtrlChestimaciones chestimaciones;
        public CtrlChjsoc chjsoc;
        public CtrlChmodelos chmodelos;
        public CtrlVvdpto vvdpto;
        public CtrlChjges chjges;
        public CtrlVvconvempconv vvconvempconv;
        // Acciones
        public LinkAasignar aasignar;
        public LinkAhistorico ahistorico;
        // Fieldsets
        public FSetF1 f1;
        public FSetF2 f2;
        public FSetF3 f3;
        public FSetF4 f4;
        public FSetF5 f5;
        public FSetF6 f6;
        public FSetF7 f7;
        public FSetF8 f8;
        public FSetF9 f9;
        class Location extends LocationSplit
            {
            public Location( )
                {
                super();
                setLocation(LEFT);
                }
            }
            
        public class CtrlVvempini extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvempini(Form form)
                {
                super(form);
                setName("vvempini");
                setMessageHelp("Empresa Inicio");
                setTitle("Empresa Inicio");
                setType(INTEGER);
                setLength(6);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                  super.onChange();
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlVvempfin extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvempfin(Form form)
                {
                super(form);
                setName("vvempfin");
                setMessageHelp("Empresa Fin");
                setTitle("Empresa Fin");
                setType(INTEGER);
                setLength(6);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                  super.onChange();
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlVvejeini extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvejeini(Form form)
                {
                super(form);
                setName("vvejeini");
                setTitle("Ejercicio inicio");
                setType(INTEGER);
                setLength(4);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                return getInteger()>=2008 && getInteger()<=vvejefin.getInteger();
                }
            public Object getDefault ()
                {
                return 2008;
                }
            public void onChange ()
                {
                  super.onChange();
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlVvejefin extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvejefin(Form form)
                {
                super(form);
                setName("vvejefin");
                setMessageHelp("Ejercicio final");
                setTitle("Ejercicio final");
                setType(INTEGER);
                setLength(4);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                return getInteger()>=2008 && getInteger()>=vvejeini.getInteger();
                }
            public Object getDefault ()
                {
                return new Integer(Maefc.getYear(Maefc.getDate()));
                }
            public void onChange ()
                {
                  super.onChange();
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlVvservidor extends ControlEdit
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
                
            public CtrlVvservidor(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvservidor");
                setTitle("Servidor SQL SERVER");
                setType(STRING);
                setLength(50);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                  super.onChange();
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlVvinstancia extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlVvinstancia(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvinstancia");
                setTitle("Instancia");
                setType(STRING);
                setLength(50);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                  super.onChange();
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            }
            
        public class CtrlVvnombrebd extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(20);
                    }
                }
                
            public CtrlVvnombrebd(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvnombrebd");
                setTitle("Nombre BD");
                setType(STRING);
                setLength(50);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                  super.onChange();
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlVvuser extends ControlEdit
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
                
            public CtrlVvuser(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvuser");
                setTitle("Usuario");
                setType(STRING);
                setLength(25);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                  super.onChange();
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlVvpasswd extends ControlEdit
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
                
            public CtrlVvpasswd(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvpasswd");
                setTitle("Password");
                setType(STRING);
                setLength(25);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                  super.onChange();
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlChjco extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjco(Form form)
                {
                super(form);
                setName("chjco");
                setTitle("Activar");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                  return true;
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  estadoCampos();
                  disableIniConver ();
                }
            // GET: CHECKBOX
            }
            
        public class CtrlChforzarcp extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChforzarcp(Form form)
                {
                super(form);
                setName("chforzarcp");
                setMessageHelp("Forzar cuentas cliente y proveedor a 4300, 4100 y 4000");
                setTitle("Forzar ctas cliente/proveedor");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlVvnumalfa extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvnumalfa(Form form)
                {
                super(form);
                setName("vvnumalfa");
                setMessageHelp("Plan de cuentas númerico o alfanumérico");
                setTitle("Númerico o Alfanumerico");
                setType(STRING);
                setLength(1);
                setPrintable(false);
                setDescriptionShow(false);
                addItem("N/Numérico (Subcuentas misma longitud)");
                addItem("A/Se respetará la longitud origen");
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return "N";
                }
            public void onChange ()
                {
                  super.onChange();
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlChjeo extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjeo(Form form)
                {
                super(form);
                setName("chjeo");
                setTitle("Activar");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                  return true;
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  estadoCampos();
                  disableIniConver ();
                }
            // GET: CHECKBOX
            }
            
        public class CtrlChmercantil extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChmercantil(Form form)
                {
                super(form);
                setName("chmercantil");
                setMessageHelp("Traspasar las empresas que son Sociedades mercantiles");
                setTitle("Sociedad mercantil");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                return false;
                }
            }
            
        public class CtrlChjre extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjre(Form form)
                {
                super(form);
                setName("chjre");
                setTitle("Activar");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                  return true;
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  estadoCampos();
                  disableIniConver ();
                }
            // GET: CHECKBOX
            }
            
        public class CtrlVvdesdedec extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdesdedec(Form form)
                {
                super(form);
                setName("vvdesdedec");
                setMessageHelp("Desde Declarante");
                setTitle("Desde Declarante");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvhastadec extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvhastadec(Form form)
                {
                super(form);
                setName("vvhastadec");
                setTitle("Hasta Declarante");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVrensimul extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVrensimul(Form form)
                {
                super(form);
                setName("vrensimul");
                setMessageHelp("Simulación");
                setTitle("Simulación");
                setType(STRING);
                setLength(1);
                setPrintable(false);
                setDescriptionShow(false);
                addItem("N/Trasladar sólo los registros de Declaración");
                addItem("S/Trasladar también los registros de Simulación");
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return "S";
                }
            }
            
        public class CtrlChjnom extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjnom(Form form)
                {
                super(form);
                setName("chjnom");
                setTitle("Activar");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                  return true;
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  estadoCampos();
                  disableIniConver ();
                }
            // GET: CHECKBOX
            }
            
        public class CtrlChconvenio extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChconvenio(Form form)
                {
                super(form);
                setName("chconvenio");
                setTitle("convenio");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                return true;
                }
                public void userChange(Value v ) {  
                  super.userChange(v);
                  if(v.getBoolean()) {
                    /*
                    String texte = "Ha seleccionado traspasar los conceptos y categorías de los trabajadores a nivel de convenio y no de empresa.\n"+
                                   "Geyce no puede asegurar que la fiabilidad del traspaso sea la misma que si desmarca esta opción. Es posible que \n "+
                                   "las empresas de logic tengan conceptos declarados que no están en sus respectivos convenios y por ello deberá \n " +
                                   "introducirlos manualmente tras la conversión.\n"+
                                   "¿Desea traspasar los conceptos y categorias de los trabajadores de las empresas seleccionadas a nivel de convenio?";
                    */
                    String texte = "Ha seleccionado traspasar los conceptos y categorías de los trabajadores a nivel de convenio.\n"+
                                   "El proceso de traspaso pondrá los parámetros de cálculo a nivel de convenio a aquellas empresas\n "+
                                   "de logic que tengan el mismo número de conceptos en la empresa como en el convenio asociado a esta. \n " +
                                   "¿Desea marcar esta opción?";
                    
                    if(Maefc.message(texte,"Aviso", Maefc.WARNING_MESSAGE, Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
                      this.setValue(true);
                    }
                    else this.setValue(false);
                    
                  }
                }
            // GET: CHECKBOX
            }
            
        public class CtrlVvctas extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvctas(Form form)
                {
                super(form);
                setName("vvctas");
                setTitle("Cuentas mayor");
                setType(STRING);
                setLength(1);
                setPrintable(false);
                setDescriptionShow(false);
                addItem("V/Cuenta de mayor Variable");
                addItem("3/Cuenta Mayor a 3 dígitos");
                addItem("4/Cuenta Mayor a 4 dígitos");
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return "V";
                }
            public void onChange ()
                {
                  super.onChange();
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                  estadoCampos ();
                  if (!chforzarcp.isEnabled()) chforzarcp.setNull();
                  
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlChsql extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChsql(Form form)
                {
                super(form);
                setName("chsql");
                setTitle("Base de Datos SQL");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                  return true;
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            // GET: CHECKBOX
            public Object getDefault ()
                {
                return false;
                }
            }
            
        public class CtrlChproy extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChproy(Form form)
                {
                super(form);
                setName("chproy");
                setTitle("Asignar canales a proyectos");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                  return true;
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  disableIniConver ();
                }
            // GET: CHECKBOX
            public Object getDefault ()
                {
                return Boolean.TRUE;
                }
            }
            
        public class CtrlChestimaciones extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChestimaciones(Form form)
                {
                super(form);
                setName("chestimaciones");
                setMessageHelp("Traspasar las empresas que son de Estimaciones");
                setTitle("Estimaciones");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                return true;
                }
            }
            
        public class CtrlChjsoc extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjsoc(Form form)
                {
                super(form);
                setName("chjsoc");
                setTitle("Activar");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                  return true;
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  estadoCampos();
                  disableIniConver ();
                }
            // GET: CHECKBOX
            }
            
        public class CtrlChmodelos extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChmodelos(Form form)
                {
                super(form);
                setName("chmodelos");
                setMessageHelp("Traspasar sólo las declaraciones");
                setTitle("Sólo modelos");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                return false;
                }
            }
            
        public class CtrlVvdpto extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdpto(Form form)
                {
                super(form);
                setName("vvdpto");
                setMessageHelp("Equivalencias para traspasar departamentos");
                setTitle("Departamento");
                setType(STRING);
                setLength(1);
                setPrintable(false);
                setComboEditable(false);
                setDescriptionShow(false);
                addItem("D/Departamentos");
                addItem("S/Secciones");
                addItem("L/Delegaciones");
                addItem("C/Canales");
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return "D";
                }
            }
            
        public class CtrlChjges extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjges(Form form)
                {
                super(form);
                setName("chjges");
                setTitle("Activar");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                  return true;
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  estadoCampos();
                  disableIniConver ();
                }
            // GET: CHECKBOX
            }
            
        public class CtrlVvconvempconv extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvconvempconv(Form form)
                {
                super(form);
                setName("vvconvempconv");
                setMessageHelp("Importar las empresas con los conceptos y categorías a nivel de convenio.");
                setTitle("Concepto");
                setType(STRING);
                setLength(1);
                setPrintable(false);
                addItem("X/Convenio");
                addItem("E/Empresa");
                addItem("C/Conv-Emp");
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return new String("X");
                }
            public boolean obligate ()
                {
                return true;
                }
                public void userChange(Value v ) {  
                  super.userChange(v);
                  if(v != null && v.getString().equals("C")) {
                    /*
                    String texte = "Ha seleccionado traspasar los conceptos y categorías de los trabajadores a nivel de convenio y no de empresa.\n"+
                                   "Geyce no puede asegurar que la fiabilidad del traspaso sea la misma que si desmarca esta opción. Es posible que \n "+
                                   "las empresas de logic tengan conceptos declarados que no están en sus respectivos convenios y por ello deberá \n " +
                                   "introducirlos manualmente tras la conversión.\n"+
                                   "¿Desea traspasar los conceptos y categorias de los trabajadores de las empresas seleccionadas a nivel de convenio?";
                    */
                    String texte = "Ha seleccionado traspasar los conceptos y categorías de los trabajadores a nivel de convenio.\n"+
                                   "El proceso de traspaso pondrá los parámetros de cálculo a nivel de convenio a aquellas empresas\n "+
                                   "de logic que tengan el mismo número de conceptos en la empresa como en el convenio asociado a esta. \n " +
                                   "¿Desea marcar esta opción?";
                    
                    if(Maefc.message(texte,"Aviso", Maefc.WARNING_MESSAGE, Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
                      this.setValue("C");
                    }
                    else this.setValue("E");
                    
                  }
                }
            }
            
        public class LinkAasignar extends Action
            {
            public LinkAasignar(Form form)
                {
                super(form);
                setName("aasignar");
                setTitle("&1. Asignar Códigos");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                scodcnvotraplc.setWhere ("ccoaplic='"+AplicacionOrigen.toString()+"' and ccohistorico='N'");
                scodcnvotraplc.execute();
                
                boolean alta = scodcnvotraplc.isEof();
                if (alta) {
                  scodcnvotraplc.addNew();
                  scodcnvotraplc.ccoaplic.setValue(AplicacionOrigen.toString());
                  scodcnvotraplc.ccohistorico.setValue("N");
                }
                else scodcnvotraplc.edit();
                
                scodcnvotraplc.ccoempini.setValue(vvempini);
                scodcnvotraplc.ccoempfin.setValue(vvempfin);
                scodcnvotraplc.ccoejeini.setValue(vvejeini);
                scodcnvotraplc.ccoejefin.setValue(vvejefin);
                scodcnvotraplc.ccoservidor.setValue(vvservidor);
                scodcnvotraplc.ccoinstancia.setValue(vvinstancia);
                scodcnvotraplc.ccobbdd.setValue(vvnombrebd);
                scodcnvotraplc.ccouserbd.setValue(vvuser);
                scodcnvotraplc.ccopwdbd.setValue(vvpasswd);
                scodcnvotraplc.ccojcoctamayor.setValue(vvctas);
                scodcnvotraplc.ccojcotipocta.setValue(vvnumalfa);
                scodcnvotraplc.ccojcosql.setValue(chsql);
                scodcnvotraplc.ccojcocanales.setValue(chproy);
                scodcnvotraplc.ccotraspjco.setValue(chjco);
                scodcnvotraplc.ccotraspjeo.setValue(chjeo);
                scodcnvotraplc.ccotraspjre.setValue(chjre);
                scodcnvotraplc.ccotraspjsoc.setValue(chjsoc);
                scodcnvotraplc.ccotraspjges.setValue(chjges);
                scodcnvotraplc.ccotraspjnom.setValue(chjnom);
                scodcnvotraplc.ccofecha.setValue(Maefc.getDate());
                scodcnvotraplc.ccousuario.setValue(Easp.usuario);
                scodcnvotraplc.ccoestimacion.setValue(chestimaciones);
                scodcnvotraplc.ccomercantil.setValue(chmercantil);
                scodcnvotraplc.ccomodelos.setValue(chmodelos);
                scodcnvotraplc.ccodecdesde.setValue(vvdesdedec);
                scodcnvotraplc.ccodechasta.setValue(vvhastadec);
                scodcnvotraplc.ccodecsimul.setValue(vrensimul);
                scodcnvotraplc.ccodepartamento.setValue(vvdpto);
                
                boolean bOk = true;
                String sError = null;
                if (alta) bOk = scodcnvotraplc.insert();
                else bOk = scodcnvotraplc.update();
                int codiCab = 0;
                if (bOk) {   
                  scodcnvotraplc.commit();
                  codiCab = scodcnvotraplc.ccocodi.getInteger();
                  Delete d = new Delete (getDataBase(),"CODCNVOTRAPLL");
                  bOk = d.execute("cclccocodi="+codiCab);
                  if (!bOk) sError = "Error al eliminar cclccocodi="+codiCab;
                }
                if (bOk) {   
                  mae.easp.conversions.GestionCodigos gc = new mae.easp.conversions.GestionCodigos (codiCab, getDataBase());
                  if (AplicacionOrigen == mae.easp.conversions.Conversion.APLICACION_ORIGEN.LOGICCLASS) {
                    //JCONTA
                    if (bOk && chjco.getBoolean()) {
                      clcjco = new mae.easp.conversions.logicclass.ConversionJCO (cnvlogicclass,codiCab,vvempini.getInteger(),vvempfin.getInteger(),vvejeini.getInteger(),vvejefin.getInteger(),
                                                                                                                             vvservidor.getString(), vvinstancia.getString(), vvnombrebd.getString(),vvuser.getString(),
                                                                                                                             vvpasswd.getString(), getDataBase(), vvnumalfa.getString(), vvctas.getString(),
                                                                                                                             chproy.getBoolean(), chsql.getBoolean(), chforzarcp.getBoolean());
                      if (clcjco.hayError()) {
                        bOk = false;
                        sError = clcjco.getError();
                      }
                      else {
                        gc.addVectorEmpresas(clcjco.initEmpreses());
                        clcjco.desconetarConexionLogic();
                      }
                    }
                    //JEO
                    if (bOk && chjeo.getBoolean()) {
                      clcjeo = new mae.easp.conversions.logicclass.ConversionJEO (cnvlogicclass,codiCab,vvempini.getInteger(),vvempfin.getInteger(),vvejeini.getInteger(),vvejefin.getInteger(),
                                                                                                                             vvservidor.getString(), vvinstancia.getString(), vvnombrebd.getString(),vvuser.getString(),
                                                                                                                             vvpasswd.getString(), getDataBase(),chestimaciones.getBoolean(),
                                                                                                                             chmercantil.getBoolean(),chmodelos.getBoolean());
                      if (clcjeo.hayError()) {
                        bOk = false;
                        sError = clcjeo.getError();
                      }
                      else {
                        gc.addVectorEmpresas(clcjeo.initEmpreses());
                        clcjeo.desconetarConexionLogic();
                      }
                    }
                    //JISS
                    if (bOk && chjsoc.getBoolean()) {
                      clcjiss = new mae.easp.conversions.logicclass.ConversionJISS (cnvlogicclass,codiCab,vvempini.getInteger(),vvempfin.getInteger(),vvejeini.getInteger(),vvejefin.getInteger(),
                                                                                                                             vvservidor.getString(), vvinstancia.getString(), vvnombrebd.getString(),vvuser.getString(),
                                                                                                                             vvpasswd.getString(), getDataBase());
                      if (clcjiss.hayError()) {
                        bOk = false;
                        sError = clcjiss.getError();
                      }
                      else {
                        gc.addVectorEmpresas(clcjiss.initEmpreses());
                        clcjiss.desconetarConexionLogic();
                      }
                    }
                    //JNOM
                    if (bOk && chjnom.getBoolean()) {
                      clcjnom = new mae.easp.conversions.logicclass.ConversionJNOM (cnvlogicclass,codiCab,vvempini.getInteger(),vvempfin.getInteger(),vvejeini.getInteger(),vvejefin.getInteger(),
                                                                                                                             vvservidor.getString(), vvinstancia.getString(), vvnombrebd.getString(),vvuser.getString(),
                                                                                                                             vvpasswd.getString(),vvdpto.getString(), vvconvempconv.getString(),getDataBase());
                      if (clcjnom.hayError()) {
                        bOk = false;
                        sError = clcjnom.getError();
                      }
                      else {
                        gc.addVectorEmpresas(clcjnom.initEmpreses());
                        clcjnom.desconetarConexionLogic();
                      }
                    }
                    //JGES
                    if (bOk && chjges.getBoolean()) {
                      clcjges = new mae.easp.conversions.logicclass.ConversionJGES (cnvlogicclass,codiCab,vvempini.getInteger(),vvempfin.getInteger(),vvejeini.getInteger(),vvejefin.getInteger(),
                                                                                                                             vvservidor.getString(), vvinstancia.getString(), vvnombrebd.getString(),vvuser.getString(),
                                                                                                                             vvpasswd.getString(), getDataBase());
                      if (clcjges.hayError()) {
                        bOk = false;
                        sError = clcjges.getError();
                      }
                      else {
                        gc.addVectorEmpresas(clcjges.initEmpreses());
                        clcjges.desconetarConexionLogic();
                      }
                    }
                    //JREN
                    if (bOk && chjre.getBoolean()) {
                      clcjren = new mae.easp.conversions.logicclass.ConversionJREN (cnvlogicclass,codiCab,vvempini.getInteger(),vvempfin.getInteger(),vvejeini.getInteger(),vvejefin.getInteger(),
                                                                                                                             vvservidor.getString(), vvinstancia.getString(), vvnombrebd.getString(),vvuser.getString(),
                                                                                                                             vvpasswd.getString(), getDataBase(), vvdesdedec.getString(), vvhastadec.getString(), vrensimul.getString());
                      if (clcjren.hayError()) {
                        bOk = false;
                        sError = clcjren.getError();
                      }
                      else {
                        gc.addVectorEmpresas(clcjren.initEmpreses());
                        clcjren.desconetarConexionLogic();
                      }
                    }
                
                
                  }
                  if (bOk) {
                    bOk = gc.asignarCodigos();
                    if (bOk) {
                      vcodigos.idConver = codiCab;
                      vcodigos.doShow();
                      vcodigos.aini.setEnabled(true); 
                      vcodigos.aact.setEnabled(true);
                    }
                    else sError = gc.getError();
                  }
                }
                else {        	
                  scodcnvotraplc.rollback();
                  bOk = false;
                  sError = "Error al prepara tabla de conversión.";
                }
                if (!bOk) {
                  vcodigos.idConver = -1;
                  vcodigos.doShow();
                  Maefc.message(sError,"¡Atención!",Maefc.ERROR_MESSAGE);
                }
                }
            }
            
        public class LinkAhistorico extends Action
            {
            public LinkAhistorico(Form form)
                {
                super(form);
                setName("ahistorico");
                setTitle("&2. Historico Conversiones");
                // SET: ACCION
                setOptions(SHOW | EOF);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                ControlPanel cppdatos=new ControlPanel(cnvlogicclass);
                LocationWindow lw = new LocationWindow ();
                lw.setWidth(800);
                lw.setHeight(600);
                cppdatos.setLocation(lw);
                cppdatos.setModal(true);
                cppdatos.setLayout(new LayoutSplit(LayoutSplit.VERTICAL,0.50));
                vhistorico.setLocation(new LocationSplit(LocationSplit.LEFT));
                vhistorico.setParent(cppdatos);
                vdetalle.setLocation(new LocationSplit(LocationSplit.RIGHT));
                vdetalle.setParent(cppdatos);
                cppdatos.run();
                }
            }
            
        public class FSetF1 extends Fieldset
            {
            public FSetF1(Form form)
                {
                super(form);
                setTitulo("Parámetros generales");
                addControl(vvempini);
                addControl(vvempfin);
                addControl(vvejeini);
                addControl(vvejefin);
                getWebProperties().setAnchoColumnas (6);
                getWebProperties().setSizeSeparacionR (0);
                getWebProperties().setPosTitulo ("L");
                }
            }
            
        public class FSetF2 extends Fieldset
            {
            public FSetF2(Form form)
                {
                super(form);
                addControl(vvservidor);
                addControl(vvinstancia);
                addControl(vvnombrebd);
                addControl(vvuser);
                addControl(vvpasswd);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (6);
                getWebProperties().setSizeLineaSup (42);
                }
            }
            
        public class FSetF3 extends Fieldset
            {
            public FSetF3(Form form)
                {
                super(form);
                setTitulo("Parámetros aplicaciones a convertir");
                getWebProperties().setAnchoColumnas (12);
                getWebProperties().setSizeSeparacionB (0);
                }
            }
            
        public class FSetF4 extends Fieldset
            {
            public FSetF4(Form form)
                {
                super(form);
                setTitulo("jConta");
                addControl(chjco);
                addControl(chforzarcp);
                addControl(vvnumalfa);
                addControl(vvctas);
                addControl(chsql);
                addControl(chproy);
                getWebProperties().setAnchoColumnas (2);
                getWebProperties().setSizeSeparacionT (0);
                getWebProperties().setSizeSeparacionR (0);
                }
            }
            
        public class FSetF5 extends Fieldset
            {
            public FSetF5(Form form)
                {
                super(form);
                setTitulo("jEstimación");
                addControl(chjeo);
                addControl(chmercantil);
                addControl(chestimaciones);
                addControl(chmodelos);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (2);
                getWebProperties().setSizeSeparacionT (0);
                getWebProperties().setSizeSeparacionR (0);
                }
            }
            
        public class FSetF6 extends Fieldset
            {
            public FSetF6(Form form)
                {
                super(form);
                setTitulo("jSociedades");
                addControl(chjsoc);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (2);
                getWebProperties().setSizeSeparacionT (0);
                getWebProperties().setSizeSeparacionR (0);
                }
            }
            
        public class FSetF7 extends Fieldset
            {
            public FSetF7(Form form)
                {
                super(form);
                setTitulo("jRenta");
                addControl(chjre);
                addControl(vvdesdedec);
                addControl(vvhastadec);
                addControl(vrensimul);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (2);
                getWebProperties().setSizeSeparacionT (0);
                getWebProperties().setSizeSeparacionR (0);
                }
            }
            
        public class FSetF8 extends Fieldset
            {
            public FSetF8(Form form)
                {
                super(form);
                setTitulo("jNómina");
                addControl(chjnom);
                addControl(vvdpto);
                addControl(vvconvempconv);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (2);
                getWebProperties().setSizeSeparacionT (0);
                getWebProperties().setSizeSeparacionR (0);
                }
            }
            
        public class FSetF9 extends Fieldset
            {
            public FSetF9(Form form)
                {
                super(form);
                setTitulo("jGestión");
                addControl(chjges);
                getWebProperties().setSizeSeparacionL (0);
                getWebProperties().setAnchoColumnas (2);
                getWebProperties().setSizeSeparacionT (0);
                getWebProperties().setSizeSeparacionR (0);
                }
            }
            
        public FormVconversion(ProgCnvlogicclass cnvlogicclass)
            {
            super(cnvlogicclass);
            setName("vconversion");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addSelect(scodcnvotraplc=new Scodcnvotraplc());
            addControl(vvempini=new CtrlVvempini(this));
            addControl(vvempfin=new CtrlVvempfin(this));
            addControl(vvejeini=new CtrlVvejeini(this));
            addControl(vvejefin=new CtrlVvejefin(this));
            addControl(vvservidor=new CtrlVvservidor(this));
            addControl(vvinstancia=new CtrlVvinstancia(this));
            addControl(vvnombrebd=new CtrlVvnombrebd(this));
            addControl(vvuser=new CtrlVvuser(this));
            addControl(vvpasswd=new CtrlVvpasswd(this));
            addControl(chjco=new CtrlChjco(this));
            addControl(chforzarcp=new CtrlChforzarcp(this));
            addControl(vvnumalfa=new CtrlVvnumalfa(this));
            addControl(chjeo=new CtrlChjeo(this));
            addControl(chmercantil=new CtrlChmercantil(this));
            addControl(chjre=new CtrlChjre(this));
            addControl(vvdesdedec=new CtrlVvdesdedec(this));
            addControl(vvhastadec=new CtrlVvhastadec(this));
            addControl(vrensimul=new CtrlVrensimul(this));
            addControl(chjnom=new CtrlChjnom(this));
            addControl(chconvenio=new CtrlChconvenio(this));
            addControl(vvctas=new CtrlVvctas(this));
            addControl(chsql=new CtrlChsql(this));
            addControl(chproy=new CtrlChproy(this));
            addControl(chestimaciones=new CtrlChestimaciones(this));
            addControl(chjsoc=new CtrlChjsoc(this));
            addControl(chmodelos=new CtrlChmodelos(this));
            addControl(vvdpto=new CtrlVvdpto(this));
            addControl(chjges=new CtrlChjges(this));
            addControl(vvconvempconv=new CtrlVvconvempconv(this));
            addAction(aasignar=new LinkAasignar(this));
            addAction(ahistorico=new LinkAhistorico(this));
            addFieldset(f1=new FSetF1(this));
            addFieldset(f2=new FSetF2(this));
            addFieldset(f3=new FSetF3(this));
            addFieldset(f4=new FSetF4(this));
            addFieldset(f5=new FSetF5(this));
            addFieldset(f6=new FSetF6(this));
            addFieldset(f7=new FSetF7(this));
            addFieldset(f8=new FSetF8(this));
            addFieldset(f9=new FSetF9(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Scodcnvotraplc extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Codcnvotraplc codcnvotraplc;
        // Campos
        public Field ccoaplic;
        public Field ccobbdd;
        public Field ccocodi;
        public Field ccodecdesde;
        public Field ccodechasta;
        public Field ccodecsimul;
        public Field ccodepartamento;
        public Field ccoejefin;
        public Field ccoejeini;
        public Field ccoempfin;
        public Field ccoempini;
        public Field ccoestimacion;
        public Field ccofecha;
        public Field ccohistorico;
        public Field ccoinstancia;
        public Field ccojcocanales;
        public Field ccojcoctamayor;
        public Field ccojcosql;
        public Field ccojcotipocta;
        public Field ccomercantil;
        public Field ccomodelos;
        public Field ccopwdbd;
        public Field ccoservidor;
        public Field ccotraspjco;
        public Field ccotraspjeo;
        public Field ccotraspjges;
        public Field ccotraspjnom;
        public Field ccotraspjre;
        public Field ccotraspjsoc;
        public Field ccouserbd;
        public Field ccousuario;
        class Codcnvotraplc extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Codcnvotraplc(Select select)
                {
                super(select);
                setName("codcnvotraplc");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Scodcnvotraplc()
            {
            setName("scodcnvotraplc");
            // SET: SELECT
            addTable(codcnvotraplc=new Codcnvotraplc(this));
            addField(ccoaplic=new Field(this,codcnvotraplc,"ccoaplic"));
            addField(ccobbdd=new Field(this,codcnvotraplc,"ccobbdd"));
            addField(ccocodi=new Field(this,codcnvotraplc,"ccocodi"));
            addField(ccodecdesde=new Field(this,codcnvotraplc,"ccodecdesde"));
            addField(ccodechasta=new Field(this,codcnvotraplc,"ccodechasta"));
            addField(ccodecsimul=new Field(this,codcnvotraplc,"ccodecsimul"));
            addField(ccodepartamento=new Field(this,codcnvotraplc,"ccodepartamento"));
            addField(ccoejefin=new Field(this,codcnvotraplc,"ccoejefin"));
            addField(ccoejeini=new Field(this,codcnvotraplc,"ccoejeini"));
            addField(ccoempfin=new Field(this,codcnvotraplc,"ccoempfin"));
            addField(ccoempini=new Field(this,codcnvotraplc,"ccoempini"));
            addField(ccoestimacion=new Field(this,codcnvotraplc,"ccoestimacion"));
            addField(ccofecha=new Field(this,codcnvotraplc,"ccofecha"));
            addField(ccohistorico=new Field(this,codcnvotraplc,"ccohistorico"));
            addField(ccoinstancia=new Field(this,codcnvotraplc,"ccoinstancia"));
            addField(ccojcocanales=new Field(this,codcnvotraplc,"ccojcocanales"));
            addField(ccojcoctamayor=new Field(this,codcnvotraplc,"ccojcoctamayor"));
            addField(ccojcosql=new Field(this,codcnvotraplc,"ccojcosql"));
            addField(ccojcotipocta=new Field(this,codcnvotraplc,"ccojcotipocta"));
            addField(ccomercantil=new Field(this,codcnvotraplc,"ccomercantil"));
            addField(ccomodelos=new Field(this,codcnvotraplc,"ccomodelos"));
            addField(ccopwdbd=new Field(this,codcnvotraplc,"ccopwdbd"));
            addField(ccoservidor=new Field(this,codcnvotraplc,"ccoservidor"));
            addField(ccotraspjco=new Field(this,codcnvotraplc,"ccotraspjco"));
            addField(ccotraspjeo=new Field(this,codcnvotraplc,"ccotraspjeo"));
            addField(ccotraspjges=new Field(this,codcnvotraplc,"ccotraspjges"));
            addField(ccotraspjnom=new Field(this,codcnvotraplc,"ccotraspjnom"));
            addField(ccotraspjre=new Field(this,codcnvotraplc,"ccotraspjre"));
            addField(ccotraspjsoc=new Field(this,codcnvotraplc,"ccotraspjsoc"));
            addField(ccouserbd=new Field(this,codcnvotraplc,"ccouserbd"));
            addField(ccousuario=new Field(this,codcnvotraplc,"ccousuario"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public class FormVcodigos extends MultiDataForm
        {
        // GLOBALES: VENTANA
        int idConver = -1;

public void onEdit () {  
  chsel.setEnabled(false);
  chjco.setEnabled(false);
  chjeo.setEnabled(false);
  chjsoc.setEnabled(false);
  chjre.setEnabled(false);
  chjnom.setEnabled(false);
  chjges.setEnabled(false);
  super.onEdit();
}

private boolean esElMismoCDP(String codCdp, String nif) {
  boolean mismo = false;
  Selector sCdp = new Selector(getDataBase());
  sCdp.execute("Select * from CDP where cdpcodi='"+codCdp+"' and cdpnifcif='"+nif+"'");
  if (sCdp.next()) mismo = true;
  sCdp.close();
  return mismo;           
}

private boolean existeCDP(String codCdp) {
  boolean existe = false;
  Selector sCdp = new Selector(getDataBase());
  sCdp.execute("Select * from CDP where cdpcodi='"+codCdp+"'");
  if (sCdp.next()) existe = true;
  sCdp.close();
  return existe;           
}

private boolean existeAConvertir(int integer) {
  boolean trobat = false;
  for (int i=0;i<vcodigos.getRowCount() && !trobat;i++) trobat = i!=getCurrentRow() && (cclcodigeyce.getInteger() == vcodigos.cclcodigeyce.getValue(i).getInteger());
  return trobat;
}
        // Metodos
        // Controles
        public CtrlChsel chsel;
        public CtrlVvcodorig vvcodorig;
        public CtrlCclnombre cclnombre;
        public CtrlCclnif cclnif;
        public CtrlCclcodigeyce cclcodigeyce;
        public CtrlChjco chjco;
        public CtrlChjeo chjeo;
        public CtrlChjsoc chjsoc;
        public CtrlChjre chjre;
        public CtrlChjnom chjnom;
        public CtrlChjges chjges;
        // Acciones
        public LinkAini aini;
        public LinkAselec aselec;
        public LinkAact aact;
        // Fieldsets
        class Location extends LocationSplit
            {
            public Location( )
                {
                super();
                setLocation(RIGHT);
                }
            }
            
        public class CtrlChsel extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChsel(Form form)
                {
                super(form);
                setName("chsel");
                setMessageHelp("Seleccionado");
                setTitle("S.");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlVvcodorig extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcodorig(Form form)
                {
                super(form);
                setName("vvcodorig");
                setMessageHelp("Código Aplicación Origen");
                setTitle("Origen");
                setType(STRING);
                setProtect(true);
                setLength(15);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCclnombre extends ColumnEdit
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
                
            public CtrlCclnombre(Form form)
                {
                super(form);
                setLook(new Look());
                setName("cclnombre");
                setMessageHelp("Nombre o Razón Social");
                setTitle("Nombre o Razón Social");
                setType(STRING);
                setProtect(true);
                setLength(255);
                setPrintable(false);
                setField(scodcnvotrapll.cclnombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCclnif extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCclnif(Form form)
                {
                super(form);
                setName("cclnif");
                setTitle("Nif");
                setType(STRING);
                setProtect(true);
                setLength(15);
                setPrintable(false);
                setField(scodcnvotrapll.cclnif);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCclcodigeyce extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCclcodigeyce(Form form)
                {
                super(form);
                setName("cclcodigeyce");
                setMessageHelp("Código Aplicaciones GEyCE");
                setTitle("GEyCE");
                setType(INTEGER);
                setLength(6);
                setPrintable(false);
                setField(scodcnvotrapll.cclcodigeyce);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlChjco extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjco(Form form)
                {
                super(form);
                setName("chjco");
                setMessageHelp("¿Se traspasa?");
                setTitle("JCO");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjeo extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjeo(Form form)
                {
                super(form);
                setName("chjeo");
                setMessageHelp("¿Se traspasa?");
                setTitle("JEO");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjsoc extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjsoc(Form form)
                {
                super(form);
                setName("chjsoc");
                setMessageHelp("¿Se traspasa?");
                setTitle("JSO");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjre extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjre(Form form)
                {
                super(form);
                setName("chjre");
                setMessageHelp("¿Se traspasa?");
                setTitle("JRE");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjnom extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjnom(Form form)
                {
                super(form);
                setName("chjnom");
                setMessageHelp("¿Se traspasa?");
                setTitle("JNO");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjges extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjges(Form form)
                {
                super(form);
                setName("chjges");
                setMessageHelp("¿Se traspasa?");
                setTitle("JGE");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class LinkAini extends Action
            {
            public LinkAini(Form form)
                {
                super(form);
                setName("aini");
                setTitle("&1. Iniciar Conversión");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                if (mae.easp.conversions.Incidencia.eliminarIncidencias (idConver,getDataBase())) {
                  //((mae.easp.general.ErrorManagerDefaultJ)Aplication.getAplication().getErrorManager()).saltarErrores = true;
                  boolean hayIncidencias = false;
                  if (vconversion.chjeo.getBoolean()  && clcjeo.convertir () ) hayIncidencias = true;
                  if (vconversion.chjsoc.getBoolean() && clcjiss.convertir ()) hayIncidencias = true;
                  if (vconversion.chjre.getBoolean()  && clcjren.convertir ()) hayIncidencias = true;
                  if (vconversion.chjnom.getBoolean() && clcjnom.convertir ()) hayIncidencias = true;
                  if (vconversion.chjges.getBoolean() && clcjges.convertir ()) hayIncidencias = true;
                  if (vconversion.chjco.getBoolean()  && clcjco.convertir () ) hayIncidencias = true;
                  Update u = new Update (getDataBase(),"CODCNVOTRAPLC");
                  u.valor("ccohistorico", "S");
                  u.execute("ccocodi="+idConver);
                  getDataBase().commit();
                  disableIniConver ();
                  //((mae.easp.general.ErrorManagerDefaultJ)Aplication.getAplication().getErrorManager()).saltarErrores = false;
                  if (hayIncidencias) {
                    Maefc.message ("Se han producido incidencias en el proceso de conversión.\n\nA continuación se abrirá la gestión de incidencias para poder gestionarlas.","¡Atención!",Maefc.WARNING_MESSAGE);
                    vincidencias.idConversion = idConver;
                    vincidencias.open();
                  }
                  else Maefc.message ("El proceso de conversión ha finalizado correctamente.","Conversión",Maefc.INFORMATION_MESSAGE);
                }
                }
            }
            
        public class LinkAselec extends Action
            {
            public LinkAselec(Form form)
                {
                super(form);
                setName("aselec");
                setTitle("&2. Marcar");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                int r = getCurrentRow();
                scodcnvotrapll.edit();
                if ("S".equals(scodcnvotrapll.cclsel.getString())) scodcnvotrapll.cclsel.setValue("N");
                else scodcnvotrapll.cclsel.setValue("S");
                if (scodcnvotrapll.update()) {
                  scodcnvotrapll.commit();
                  doShow();
                  setCurrentRow(r);
                }
                else scodcnvotrapll.rollback();
                }
            }
            
        public class LinkAact extends Action
            {
            public LinkAact(Form form)
                {
                super(form);
                setName("aact");
                setTitle("&3. Actualizar Clientes Proveedores");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                if (mae.easp.conversions.Incidencia.eliminarIncidencias (idConver,getDataBase())) {
                  boolean hayIncidencias = false;
                  if (vconversion.chjco.getBoolean()  && clcjco.actualizartCliPro () ) hayIncidencias = true;
                  Update u = new Update (getDataBase(),"CODCNVOTRAPLC");
                  u.valor("ccohistorico", "S");
                  u.execute("ccocodi="+idConver);
                  getDataBase().commit();
                  disableIniConver ();
                  if (hayIncidencias) {
                    Maefc.message ("Se han producido incidencias en el proceso de actualización de Clientes y Proveedores.\n\nA continuación se abrirá la gestión de incidencias para poder gestionarlas.","¡Atención!",Maefc.WARNING_MESSAGE);
                    vincidencias.idConversion = idConver;
                    vincidencias.open();
                  }
                  else Maefc.message ("El proceso de actualización de Clientes y Proveedores ha finalizado correctamente.","Conversión",Maefc.INFORMATION_MESSAGE);
                }
                }
            }
            
        public FormVcodigos(ProgCnvlogicclass cnvlogicclass)
            {
            super(cnvlogicclass);
            setName("vcodigos");
            setTitle("Códigos asignados");
            setLocation(new Location());
            setStates(SHOW | UPDATE);
            setPrintable(false);
            // SET: VENTANA
            addSelect(scodcnvotrapll=new Scodcnvotrapll());
            addControl(chsel=new CtrlChsel(this));
            addControl(vvcodorig=new CtrlVvcodorig(this));
            addControl(cclnombre=new CtrlCclnombre(this));
            addControl(cclnif=new CtrlCclnif(this));
            addControl(cclcodigeyce=new CtrlCclcodigeyce(this));
            addControl(chjco=new CtrlChjco(this));
            addControl(chjeo=new CtrlChjeo(this));
            addControl(chjsoc=new CtrlChjsoc(this));
            addControl(chjre=new CtrlChjre(this));
            addControl(chjnom=new CtrlChjnom(this));
            addControl(chjges=new CtrlChjges(this));
            addAction(aini=new LinkAini(this));
            addAction(aselec=new LinkAselec(this));
            addAction(aact=new LinkAact(this));
            setSelect(scodcnvotrapll);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public boolean onOkUpdate ()
            {
            String cdp = Easp.dominio.substring(0,6)+Numero.format(cclcodigeyce.getInteger(),"000000");
            if (existeAConvertir(cclcodigeyce.getInteger())) {
              Maefc.message("La empresa "+cclcodigeyce.getInteger()+" ya esta asignada a otra empresa en este proceso de conversión.","¡Atención!");
              return false;
            }
            if (existeCDP (cdp) && !esElMismoCDP(cdp,cclnif.getString())) {
              Maefc.message("Ya existe el cliente "+cclcodigeyce.getInteger()+" en la tabla CDP con otro cif","¡Atención!");
              return false;
            }
            return super.onOkUpdate();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord();
            chsel.setValue("S".equals(scodcnvotrapll.cclsel.getString()));
            chjco.setValue("S".equals(scodcnvotrapll.ccltraspjco.getString()));
            chjeo.setValue("S".equals(scodcnvotrapll.ccltraspjeo.getString()));
            chjsoc.setValue("S".equals(scodcnvotrapll.ccltraspjsoc.getString()));
            chjre.setValue("S".equals(scodcnvotrapll.ccltraspjre.getString()));
            chjnom.setValue("S".equals(scodcnvotrapll.ccltraspjnom.getString()));
            chjges.setValue("S".equals(scodcnvotrapll.ccltraspjges.getString()));
            if (scodcnvotrapll.cclcodiorigens.getString().length()>0) vvcodorig.setValue(scodcnvotrapll.cclcodiorigens.getString());
            else vvcodorig.setValue(scodcnvotrapll.cclcodiorigen.getString());
            
            if (chsel.getBoolean()) aselec.setTitle("&2. Desmarcar");
            else aselec.setTitle("&2. Marcar");
            }
        }
        
    // 
    public class Scodcnvotrapll extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Codcnvotrapll codcnvotrapll;
        // Campos
        public Field cclccocodi;
        public Field cclcodi;
        public Field cclcodigeyce;
        public Field cclcodiorigen;
        public Field cclcodiorigens;
        public Field cclnif;
        public Field cclnombre;
        public Field cclsel;
        public Field ccltraspjco;
        public Field ccltraspjeo;
        public Field ccltraspjges;
        public Field ccltraspjnom;
        public Field ccltraspjre;
        public Field ccltraspjsoc;
        class Codcnvotrapll extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Codcnvotrapll(Select select)
                {
                super(select);
                setName("codcnvotrapll");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Scodcnvotrapll()
            {
            setName("scodcnvotrapll");
            // SET: SELECT
            addTable(codcnvotrapll=new Codcnvotrapll(this));
            addField(cclccocodi=new Field(this,codcnvotrapll,"cclccocodi"));
            addField(cclcodi=new Field(this,codcnvotrapll,"cclcodi"));
            addField(cclcodigeyce=new Field(this,codcnvotrapll,"cclcodigeyce"));
            addField(cclcodiorigen=new Field(this,codcnvotrapll,"cclcodiorigen"));
            addField(cclcodiorigens=new Field(this,codcnvotrapll,"cclcodiorigens"));
            addField(cclnif=new Field(this,codcnvotrapll,"cclnif"));
            addField(cclnombre=new Field(this,codcnvotrapll,"cclnombre"));
            addField(cclsel=new Field(this,codcnvotrapll,"cclsel"));
            addField(ccltraspjco=new Field(this,codcnvotrapll,"ccltraspjco"));
            addField(ccltraspjeo=new Field(this,codcnvotrapll,"ccltraspjeo"));
            addField(ccltraspjges=new Field(this,codcnvotrapll,"ccltraspjges"));
            addField(ccltraspjnom=new Field(this,codcnvotrapll,"ccltraspjnom"));
            addField(ccltraspjre=new Field(this,codcnvotrapll,"ccltraspjre"));
            addField(ccltraspjsoc=new Field(this,codcnvotrapll,"ccltraspjsoc"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "cclccocodi="+vcodigos.idConver;
            }
        public String getOrder ()
            {
            return "cclcodiorigen";
            }
        // EVENT: SELECT
        }
        
    public class FormVincidencias extends MultiDataForm
        {
        // GLOBALES: VENTANA
        public int idConversion;

public void onOpened() {
  super.onOpened();
  sincidencias.execute();
}
        // Metodos
        // Controles
        public CtrlVvcodorig vvcodorig;
        public CtrlCcinombre ccinombre;
        public CtrlCcinif ccinif;
        public CtrlCcicodigeyce ccicodigeyce;
        public CtrlCciejercicio cciejercicio;
        public CtrlCciaplic cciaplic;
        public CtrlCcimsg ccimsg;
        // Acciones
        public LinkAver aver;
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(800);
                setHeight(500);
                setTitle("Incidencias conversión");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlVvcodorig extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcodorig(Form form)
                {
                super(form);
                setName("vvcodorig");
                setMessageHelp("Código Aplicación Origen");
                setTitle("Origen");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCcinombre extends ColumnEdit
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
                
            public CtrlCcinombre(Form form)
                {
                super(form);
                setLook(new Look());
                setName("ccinombre");
                setMessageHelp("Nombre o Razón Social");
                setTitle("Nombre o Razón Social");
                setType(STRING);
                setLength(255);
                setSearchable(true);
                setField(sincidencias.ccinombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCcinif extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCcinif(Form form)
                {
                super(form);
                setName("ccinif");
                setMessageHelp("NIF");
                setTitle("NIF");
                setType(STRING);
                setLength(15);
                setSearchable(true);
                setField(sincidencias.ccinif);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCcicodigeyce extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCcicodigeyce(Form form)
                {
                super(form);
                setName("ccicodigeyce");
                setMessageHelp("Código Aplicaciones GEyCE");
                setTitle("GEyCE");
                setType(INTEGER);
                setLength(6);
                setSearchable(true);
                setField(sincidencias.ccicodigeyce);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCciejercicio extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCciejercicio(Form form)
                {
                super(form);
                setName("cciejercicio");
                setMessageHelp("Ejercicio");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(4);
                setSearchable(true);
                setField(sincidencias.cciejercicio);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCciaplic extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(10);
                    }
                }
                
            public CtrlCciaplic(Form form)
                {
                super(form);
                setLook(new Look());
                setName("cciaplic");
                setMessageHelp("Aplicación donde se ha producido la incidencia");
                setTitle("Aplicación");
                setType(STRING);
                setLength(15);
                setSearchable(true);
                setField(sincidencias.cciaplic);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCcimsg extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(70);
                    }
                }
                
            public CtrlCcimsg(Form form)
                {
                super(form);
                setLook(new Look());
                setName("ccimsg");
                setMessageHelp("Detalle de la incidencia");
                setTitle("Incidencia");
                setType(STRING);
                setLength(255);
                setSearchable(true);
                setField(sincidencias.ccimsg);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAver extends Action
            {
            public LinkAver(Form form)
                {
                super(form);
                setName("aver");
                setTitle("&1. Mostrar Incidencia");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                Maefc.message (ccimsg.getString(),"¡Incidencia!");
                }
            }
            
        public FormVincidencias(ProgCnvlogicclass cnvlogicclass)
            {
            super(cnvlogicclass);
            setName("vincidencias");
            setTitle("Incidencias conversión");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sincidencias=new Sincidencias());
            addControl(vvcodorig=new CtrlVvcodorig(this));
            addControl(ccinombre=new CtrlCcinombre(this));
            addControl(ccinif=new CtrlCcinif(this));
            addControl(ccicodigeyce=new CtrlCcicodigeyce(this));
            addControl(cciejercicio=new CtrlCciejercicio(this));
            addControl(cciaplic=new CtrlCciaplic(this));
            addControl(ccimsg=new CtrlCcimsg(this));
            addAction(aver=new LinkAver(this));
            setSelect(sincidencias);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord();
            if (sincidencias.ccicodiorigens.getString().length()>0) vvcodorig.setValue(sincidencias.ccicodiorigens.getString());
            else vvcodorig.setValue(sincidencias.ccicodiorigen.getString());
            }
        }
        
    // 
    public class Sincidencias extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Codcnvinciden codcnvinciden;
        // Campos
        public Field cciaplic;
        public Field cciccocodi;
        public Field ccicodi;
        public Field ccicodigeyce;
        public Field ccicodiorigen;
        public Field ccicodiorigens;
        public Field cciejercicio;
        public Field ccimsg;
        public Field ccinif;
        public Field ccinombre;
        class Codcnvinciden extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Codcnvinciden(Select select)
                {
                super(select);
                setName("codcnvinciden");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sincidencias()
            {
            setName("sincidencias");
            // SET: SELECT
            addTable(codcnvinciden=new Codcnvinciden(this));
            addField(cciaplic=new Field(this,codcnvinciden,"cciaplic"));
            addField(cciccocodi=new Field(this,codcnvinciden,"cciccocodi"));
            addField(ccicodi=new Field(this,codcnvinciden,"ccicodi"));
            addField(ccicodigeyce=new Field(this,codcnvinciden,"ccicodigeyce"));
            addField(ccicodiorigen=new Field(this,codcnvinciden,"ccicodiorigen"));
            addField(ccicodiorigens=new Field(this,codcnvinciden,"ccicodiorigens"));
            addField(cciejercicio=new Field(this,codcnvinciden,"cciejercicio"));
            addField(ccimsg=new Field(this,codcnvinciden,"ccimsg"));
            addField(ccinif=new Field(this,codcnvinciden,"ccinif"));
            addField(ccinombre=new Field(this,codcnvinciden,"ccinombre"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "cciccocodi = "+vincidencias.idConversion;
            }
        public String getOrder ()
            {
            return "ccicodiorigen,ccicodi";
            }
        // EVENT: SELECT
        }
        
    public class FormVhistorico extends MultiDataForm
        {
        // GLOBALES: VENTANA
        public void onOpened() {
  super.onOpened();
  doShow();
}

public java.awt.Color getCellColorForeground(boolean isSelected, boolean hasFocus, int row, int column) {
  if ( vvincidencias.getValue(row).isNull())    return new java.awt.Color(0x33,0x99,0x33) ;  // Verde #339933
  else return new java.awt.Color(0xff,0x00,0x00) ;  // Rojo  #FF0000
}
        // Metodos
        // Controles
        public CtrlCcofecha ccofecha;
        public CtrlVvincidencias vvincidencias;
        public CtrlCcousuario ccousuario;
        public CtrlCcoservidor ccoservidor;
        public CtrlCcobbdd ccobbdd;
        public CtrlCcoempini ccoempini;
        public CtrlCcoempfin ccoempfin;
        public CtrlCcoejeini ccoejeini;
        public CtrlCcoejefin ccoejefin;
        public CtrlChjco chjco;
        public CtrlChjeo chjeo;
        public CtrlChjsoc chjsoc;
        public CtrlChjre chjre;
        public CtrlChjnom chjnom;
        public CtrlChjges chjges;
        // Acciones
        public LinkAinciden ainciden;
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setTitle("Histórico de Conversiones");
                setModal(true);
                }
            }
            
        public class CtrlCcofecha extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCcofecha(Form form)
                {
                super(form);
                setName("ccofecha");
                setMessageHelp("Fecha conversión");
                setTitle("Fecha");
                setType(DATE);
                setLength(10);
                setSearchable(true);
                setPrintable(false);
                setField(shistor.ccofecha);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvincidencias extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvincidencias(Form form)
                {
                super(form);
                setName("vvincidencias");
                setMessageHelp("Número de Incidencias");
                setTitle("# Inc");
                setType(INTEGER);
                setLength(5);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCcousuario extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCcousuario(Form form)
                {
                super(form);
                setName("ccousuario");
                setTitle("Usuario");
                setType(STRING);
                setLength(15);
                setSearchable(true);
                setPrintable(false);
                setField(shistor.ccousuario);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCcoservidor extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(20);
                    }
                }
                
            public CtrlCcoservidor(Form form)
                {
                super(form);
                setLook(new Look());
                setName("ccoservidor");
                setTitle("Servidor");
                setType(STRING);
                setLength(50);
                setSearchable(true);
                setPrintable(false);
                setField(shistor.ccoservidor);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCcobbdd extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCcobbdd(Form form)
                {
                super(form);
                setName("ccobbdd");
                setMessageHelp("Base de datos");
                setTitle("BBDD");
                setType(STRING);
                setLength(50);
                setSearchable(true);
                setPrintable(false);
                setField(shistor.ccobbdd);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCcoempini extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCcoempini(Form form)
                {
                super(form);
                setName("ccoempini");
                setTitle("Emp Ini");
                setType(INTEGER);
                setLength(6);
                setSearchable(true);
                setPrintable(false);
                setField(shistor.ccoempini);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCcoempfin extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCcoempfin(Form form)
                {
                super(form);
                setName("ccoempfin");
                setTitle("Emp Fin");
                setType(INTEGER);
                setLength(6);
                setPrintable(false);
                setField(shistor.ccoempfin);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCcoejeini extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCcoejeini(Form form)
                {
                super(form);
                setName("ccoejeini");
                setTitle("Ejer Ini");
                setType(INTEGER);
                setLength(4);
                setPrintable(false);
                setField(shistor.ccoejeini);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCcoejefin extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCcoejefin(Form form)
                {
                super(form);
                setName("ccoejefin");
                setTitle("Ejer Fin");
                setType(INTEGER);
                setLength(10);
                setPrintable(false);
                setField(shistor.ccoejefin);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlChjco extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjco(Form form)
                {
                super(form);
                setName("chjco");
                setTitle("JCO");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjeo extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjeo(Form form)
                {
                super(form);
                setName("chjeo");
                setTitle("JEO");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjsoc extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjsoc(Form form)
                {
                super(form);
                setName("chjsoc");
                setTitle("JSOC");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjre extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjre(Form form)
                {
                super(form);
                setName("chjre");
                setTitle("JRE");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjnom extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjnom(Form form)
                {
                super(form);
                setName("chjnom");
                setTitle("JNO");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjges extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjges(Form form)
                {
                super(form);
                setName("chjges");
                setTitle("JGE");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class LinkAinciden extends Action
            {
            public LinkAinciden(Form form)
                {
                super(form);
                setName("ainciden");
                setTitle("&1. Ver Incidencias");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                vincidencias.idConversion = shistor.ccocodi.getInteger();
                vincidencias.open();
                }
            }
            
        public FormVhistorico(ProgCnvlogicclass cnvlogicclass)
            {
            super(cnvlogicclass);
            setName("vhistorico");
            setTitle("Histórico de Conversiones");
            setLocation(new Location());
            setStates(SHOW);
            setPrintable(false);
            setModal(true);
            // SET: VENTANA
            addSelect(shistor=new Shistor());
            addSelect(shayinciden=new Shayinciden());
            addControl(ccofecha=new CtrlCcofecha(this));
            addControl(vvincidencias=new CtrlVvincidencias(this));
            addControl(ccousuario=new CtrlCcousuario(this));
            addControl(ccoservidor=new CtrlCcoservidor(this));
            addControl(ccobbdd=new CtrlCcobbdd(this));
            addControl(ccoempini=new CtrlCcoempini(this));
            addControl(ccoempfin=new CtrlCcoempfin(this));
            addControl(ccoejeini=new CtrlCcoejeini(this));
            addControl(ccoejefin=new CtrlCcoejefin(this));
            addControl(chjco=new CtrlChjco(this));
            addControl(chjeo=new CtrlChjeo(this));
            addControl(chjsoc=new CtrlChjsoc(this));
            addControl(chjre=new CtrlChjre(this));
            addControl(chjnom=new CtrlChjnom(this));
            addControl(chjges=new CtrlChjges(this));
            addAction(ainciden=new LinkAinciden(this));
            setSelect(shistor);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord();
            chjco.setValue(shistor.ccotraspjco);
            chjeo.setValue(shistor.ccotraspjeo);
            chjre.setValue(shistor.ccotraspjre);
            chjsoc.setValue(shistor.ccotraspjsoc);
            chjges.setValue(shistor.ccotraspjges);
            chjnom.setValue(shistor.ccotraspjnom);
            shayinciden.execute();
            if (shayinciden.isEof()) {
              vvincidencias.setNull();
              ainciden.setEnabled(false);
            }
            else {
              vvincidencias.setValue (shayinciden.getNumRows());
              ainciden.setEnabled(true);
            }
            }
        }
        
    // 
    public class Shistor extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Codcnvotraplc codcnvotraplc;
        // Campos
        public Field ccoaplic;
        public Field ccobbdd;
        public Field ccocodi;
        public Field ccoejefin;
        public Field ccoejeini;
        public Field ccoempfin;
        public Field ccoempini;
        public Field ccofecha;
        public Field ccohistorico;
        public Field ccoinstancia;
        public Field ccojcocanales;
        public Field ccojcoctamayor;
        public Field ccojcosql;
        public Field ccojcotipocta;
        public Field ccopwdbd;
        public Field ccoservidor;
        public Field ccotraspjco;
        public Field ccotraspjeo;
        public Field ccotraspjges;
        public Field ccotraspjnom;
        public Field ccotraspjre;
        public Field ccotraspjsoc;
        public Field ccouserbd;
        public Field ccousuario;
        class Codcnvotraplc extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Codcnvotraplc(Select select)
                {
                super(select);
                setName("codcnvotraplc");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Shistor()
            {
            setName("shistor");
            // SET: SELECT
            addTable(codcnvotraplc=new Codcnvotraplc(this));
            addField(ccoaplic=new Field(this,codcnvotraplc,"ccoaplic"));
            addField(ccobbdd=new Field(this,codcnvotraplc,"ccobbdd"));
            addField(ccocodi=new Field(this,codcnvotraplc,"ccocodi"));
            addField(ccoejefin=new Field(this,codcnvotraplc,"ccoejefin"));
            addField(ccoejeini=new Field(this,codcnvotraplc,"ccoejeini"));
            addField(ccoempfin=new Field(this,codcnvotraplc,"ccoempfin"));
            addField(ccoempini=new Field(this,codcnvotraplc,"ccoempini"));
            addField(ccofecha=new Field(this,codcnvotraplc,"ccofecha"));
            addField(ccohistorico=new Field(this,codcnvotraplc,"ccohistorico"));
            addField(ccoinstancia=new Field(this,codcnvotraplc,"ccoinstancia"));
            addField(ccojcocanales=new Field(this,codcnvotraplc,"ccojcocanales"));
            addField(ccojcoctamayor=new Field(this,codcnvotraplc,"ccojcoctamayor"));
            addField(ccojcosql=new Field(this,codcnvotraplc,"ccojcosql"));
            addField(ccojcotipocta=new Field(this,codcnvotraplc,"ccojcotipocta"));
            addField(ccopwdbd=new Field(this,codcnvotraplc,"ccopwdbd"));
            addField(ccoservidor=new Field(this,codcnvotraplc,"ccoservidor"));
            addField(ccotraspjco=new Field(this,codcnvotraplc,"ccotraspjco"));
            addField(ccotraspjeo=new Field(this,codcnvotraplc,"ccotraspjeo"));
            addField(ccotraspjges=new Field(this,codcnvotraplc,"ccotraspjges"));
            addField(ccotraspjnom=new Field(this,codcnvotraplc,"ccotraspjnom"));
            addField(ccotraspjre=new Field(this,codcnvotraplc,"ccotraspjre"));
            addField(ccotraspjsoc=new Field(this,codcnvotraplc,"ccotraspjsoc"));
            addField(ccouserbd=new Field(this,codcnvotraplc,"ccouserbd"));
            addField(ccousuario=new Field(this,codcnvotraplc,"ccousuario"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "ccoaplic='"+AplicacionOrigen.toString()+"' and ccohistorico='S'";
            }
        public String getOrder ()
            {
            return "ccofecha DESC,ccocodi DESC";
            }
        // EVENT: SELECT
        }
        
    // 
    public class Shayinciden extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Codcnvinciden codcnvinciden;
        // Campos
        public Field ccicodi;
        class Codcnvinciden extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Codcnvinciden(Select select)
                {
                super(select);
                setName("codcnvinciden");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Shayinciden()
            {
            setName("shayinciden");
            // SET: SELECT
            addTable(codcnvinciden=new Codcnvinciden(this));
            addField(ccicodi=new Field(this,codcnvinciden,"ccicodi"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "cciccocodi = "+shistor.ccocodi.getInteger();
            }
        // EVENT: SELECT
        }
        
    public class FormVdetalle extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlChsel chsel;
        public CtrlCclcodiorigen cclcodiorigen;
        public CtrlCclnombre cclnombre;
        public CtrlCclnif cclnif;
        public CtrlCclcodigeyce cclcodigeyce;
        public CtrlChjco chjco;
        public CtrlChjeo chjeo;
        public CtrlChjsoc chjsoc;
        public CtrlChjre chjre;
        public CtrlChjnom chjnom;
        public CtrlChjges chjges;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setTitle("Detalle");
                setModal(true);
                }
            }
            
        public class CtrlChsel extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChsel(Form form)
                {
                super(form);
                setName("chsel");
                setMessageHelp("Seleccionado");
                setTitle("S.");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlCclcodiorigen extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCclcodiorigen(Form form)
                {
                super(form);
                setName("cclcodiorigen");
                setMessageHelp("Código Aplicación Origen");
                setTitle("Origen");
                setType(INTEGER);
                setLength(10);
                setPrintable(false);
                setField(sdetalle.cclcodiorigen);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCclnombre extends ColumnEdit
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
                
            public CtrlCclnombre(Form form)
                {
                super(form);
                setLook(new Look());
                setName("cclnombre");
                setMessageHelp("Nombre o Razón Social");
                setTitle("Nombre o Razón Social");
                setType(STRING);
                setLength(255);
                setPrintable(false);
                setField(sdetalle.cclnombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCclnif extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCclnif(Form form)
                {
                super(form);
                setName("cclnif");
                setTitle("Nif");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                setField(sdetalle.cclnif);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCclcodigeyce extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCclcodigeyce(Form form)
                {
                super(form);
                setName("cclcodigeyce");
                setMessageHelp("Código Aplicaciones GEyCE");
                setTitle("GEyCE");
                setType(INTEGER);
                setLength(10);
                setPrintable(false);
                setField(sdetalle.cclcodigeyce);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlChjco extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjco(Form form)
                {
                super(form);
                setName("chjco");
                setMessageHelp("¿Se traspasa?");
                setTitle("JCO");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjeo extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjeo(Form form)
                {
                super(form);
                setName("chjeo");
                setMessageHelp("¿Se traspasa?");
                setTitle("JEO");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjsoc extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjsoc(Form form)
                {
                super(form);
                setName("chjsoc");
                setMessageHelp("¿Se traspasa?");
                setTitle("JSO");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjre extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjre(Form form)
                {
                super(form);
                setName("chjre");
                setMessageHelp("¿Se traspasa?");
                setTitle("JRE");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjnom extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjnom(Form form)
                {
                super(form);
                setName("chjnom");
                setMessageHelp("¿Se traspasa?");
                setTitle("JNO");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChjges extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChjges(Form form)
                {
                super(form);
                setName("chjges");
                setMessageHelp("¿Se traspasa?");
                setTitle("JGE");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public FormVdetalle(ProgCnvlogicclass cnvlogicclass)
            {
            super(cnvlogicclass);
            setName("vdetalle");
            setTitle("Detalle");
            setLocation(new Location());
            setStates(SHOW);
            setPrintable(false);
            setModal(true);
            // SET: VENTANA
            addSelect(sdetalle=new Sdetalle());
            addControl(chsel=new CtrlChsel(this));
            addControl(cclcodiorigen=new CtrlCclcodiorigen(this));
            addControl(cclnombre=new CtrlCclnombre(this));
            addControl(cclnif=new CtrlCclnif(this));
            addControl(cclcodigeyce=new CtrlCclcodigeyce(this));
            addControl(chjco=new CtrlChjco(this));
            addControl(chjeo=new CtrlChjeo(this));
            addControl(chjsoc=new CtrlChjsoc(this));
            addControl(chjre=new CtrlChjre(this));
            addControl(chjnom=new CtrlChjnom(this));
            addControl(chjges=new CtrlChjges(this));
            setSelect(sdetalle);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord();
            chsel.setValue("S".equals(sdetalle.cclsel.getString()));
            chjco.setValue("S".equals(sdetalle.ccltraspjco.getString()));
            chjeo.setValue("S".equals(sdetalle.ccltraspjeo.getString()));
            chjsoc.setValue("S".equals(sdetalle.ccltraspjsoc.getString()));
            chjre.setValue("S".equals(sdetalle.ccltraspjre.getString()));
            chjnom.setValue("S".equals(sdetalle.ccltraspjnom.getString()));
            chjges.setValue("S".equals(sdetalle.ccltraspjges.getString()));
            }
        }
        
    // 
    public class Sdetalle extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Codcnvotrapll codcnvotrapll;
        // Campos
        public Field cclccocodi;
        public Field cclcodi;
        public Field cclcodigeyce;
        public Field cclcodiorigen;
        public Field cclnif;
        public Field cclnombre;
        public Field cclsel;
        public Field ccltraspjco;
        public Field ccltraspjeo;
        public Field ccltraspjges;
        public Field ccltraspjnom;
        public Field ccltraspjre;
        public Field ccltraspjsoc;
        class Codcnvotrapll extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Codcnvotrapll(Select select)
                {
                super(select);
                setName("codcnvotrapll");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdetalle()
            {
            setName("sdetalle");
            setFather(shistor);
            // SET: SELECT
            addTable(codcnvotrapll=new Codcnvotrapll(this));
            addField(cclccocodi=new Field(this,codcnvotrapll,"cclccocodi"));
            addField(cclcodi=new Field(this,codcnvotrapll,"cclcodi"));
            addField(cclcodigeyce=new Field(this,codcnvotrapll,"cclcodigeyce"));
            addField(cclcodiorigen=new Field(this,codcnvotrapll,"cclcodiorigen"));
            addField(cclnif=new Field(this,codcnvotrapll,"cclnif"));
            addField(cclnombre=new Field(this,codcnvotrapll,"cclnombre"));
            addField(cclsel=new Field(this,codcnvotrapll,"cclsel"));
            addField(ccltraspjco=new Field(this,codcnvotrapll,"ccltraspjco"));
            addField(ccltraspjeo=new Field(this,codcnvotrapll,"ccltraspjeo"));
            addField(ccltraspjges=new Field(this,codcnvotrapll,"ccltraspjges"));
            addField(ccltraspjnom=new Field(this,codcnvotrapll,"ccltraspjnom"));
            addField(ccltraspjre=new Field(this,codcnvotrapll,"ccltraspjre"));
            addField(ccltraspjsoc=new Field(this,codcnvotrapll,"ccltraspjsoc"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "cclccocodi="+shistor.ccocodi.getSQLFormat();
            }
        public String getOrder ()
            {
            return "cclcodiorigen";
            }
        // EVENT: SELECT
        }
        
    public ProgCnvlogicclass()
        {
        this.cnvlogicclass=this;
        setName("cnvlogicclass");
        setTitle("Conversión");
        // SET: PROGRAMA
        setLayout(new LayoutSplit(LayoutSplit.VERTICAL,0.50));
        setLocation(new Location());
        addForm(vconversion=new FormVconversion(this));
        addForm(vcodigos=new FormVcodigos(this));
        addForm(vincidencias=new FormVincidencias(this));
        addForm(vhistorico=new FormVhistorico(this));
        addForm(vdetalle=new FormVdetalle(this));
        }
    public ProgCnvlogicclass(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        mae.easp.cnvaviso.ProgCnvaviso pra = new mae.easp.cnvaviso.ProgCnvaviso ();
        pra.setModal(false);
        LocationWindow loc=new LocationWindow();
        loc.setWidth(810);
        loc.setHeight(520);
        pra.setLocation(loc);
        pra.run();
        if (!pra.haAceptadoCondiciones) {
          return;
        }
        
        setConnection(Easp.connEA);
        /*mae.easp.cnvaviso.ProgCnvaviso pra = new mae.easp.cnvaviso.ProgCnvaviso ();
        pra.run();
        if (!pra.haAceptadoCondiciones) return;*/
        vconversion.setLayout(new LayoutHtml("mae/easp/html/cnvlogicclas_vconversion.html"));
        vcodigos.aact.setVisible(fromJCO);
        super.onInit();
        }
    }
    
