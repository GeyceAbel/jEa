// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20140730
// Hora:             14:57:45
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.cnvlogicclass;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
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
  // Inicio declaraciones globales
  //Variables entrada
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
  }
  // Fin declaraciones globales
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
    // Inicio declaraciones globales
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
      estadoCampos ();
    }
    
    
    public void estadoCampos () {
      //Parametros jConta
      vvctas.setEnabled(chjco.getBoolean());
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
    // Fin declaraciones globales
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
    public CtrlVvctas vvctas;
    public CtrlVvnumalfa vvnumalfa;
    public CtrlChestimaciones chestimaciones;
    public CtrlChmercantil chmercantil;
    public CtrlChmodelos chmodelos;
    public CtrlVvdesdedec vvdesdedec;
    public CtrlVvhastadec vvhastadec;
    public CtrlVrensimul vrensimul;
    public CtrlVvdpto vvdpto;
    public CtrlChsql chsql;
    public CtrlChproy chproy;
    public CtrlChjco chjco;
    public CtrlChjeo chjeo;
    public CtrlChjsoc chjsoc;
    public CtrlChjre chjre;
    public CtrlChjnom chjnom;
    public CtrlChjges chjges;
    // Acciones
    public LinkAasignar aasignar;
    public LinkAhistorico ahistorico;
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
      public CtrlVvempini(Form form)
        {
        super(form);
        setName("vvempini");
        setMessageHelp("Empresa Inicio");
        setTitle("Empresa Inicio");
        setType(INTEGER);
        setLength(6);
        setPrintable(false);
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvempfin extends ControlEdit
      {
      public CtrlVvempfin(Form form)
        {
        super(form);
        setName("vvempfin");
        setMessageHelp("Empresa Fin");
        setTitle("Empresa Fin");
        setType(INTEGER);
        setLength(6);
        setPrintable(false);
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvejeini extends ControlEdit
      {
      public CtrlVvejeini(Form form)
        {
        super(form);
        setName("vvejeini");
        setTitle("Ejercicio inicio");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        }
      public boolean  valid()
        {
        return getInteger()>=2008 && getInteger()<=vvejefin.getInteger();
        
        }
      public Object getDefault()
        {
        return 2008;
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvejefin extends ControlEdit
      {
      public CtrlVvejefin(Form form)
        {
        super(form);
        setName("vvejefin");
        setMessageHelp("Ejercicio final");
        setTitle("Ejercicio final");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        }
      public boolean  valid()
        {
        return getInteger()>=2008 && getInteger()>=vvejeini.getInteger();
        }
      public Object getDefault()
        {
        return new Integer(Maefc.getYear(Maefc.getDate()));
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvservidor extends ControlEdit
      {
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
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvinstancia extends ControlEdit
      {
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
        }
      public void onChange()
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
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvuser extends ControlEdit
      {
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
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvpasswd extends ControlEdit
      {
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
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvctas extends ControlComboBox
      {
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
        }
      public Object getDefault()
        {
        return "V";
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvnumalfa extends ControlComboBox
      {
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
        }
      public Object getDefault()
        {
        return "N";
        }
      public void onChange()
        {
          super.onChange();
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlChestimaciones extends ControlCheck
      {
      public CtrlChestimaciones(Form form)
        {
        super(form);
        setName("chestimaciones");
        setMessageHelp("Traspasar las empresas que son de Estimaciones");
        setTitle("Estimaciones");
        }
      public Object getDefault()
        {
        return true;
        }
      }
      
    public class CtrlChmercantil extends ControlCheck
      {
      public CtrlChmercantil(Form form)
        {
        super(form);
        setName("chmercantil");
        setMessageHelp("Traspasar las empresas que son Sociedades mercantiles");
        setTitle("Sociedad mercantil");
        }
      public Object getDefault()
        {
        return false;
        }
      }
      
    public class CtrlChmodelos extends ControlCheck
      {
      public CtrlChmodelos(Form form)
        {
        super(form);
        setName("chmodelos");
        setMessageHelp("Traspasar sólo las declaraciones");
        setTitle("Sólo modelos");
        }
      public Object getDefault()
        {
        return false;
        }
      }
      
    public class CtrlVvdesdedec extends ControlEdit
      {
      public CtrlVvdesdedec(Form form)
        {
        super(form);
        setName("vvdesdedec");
        setMessageHelp("Desde Declarante");
        setTitle("Desde Declarante");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      }
      
    public class CtrlVvhastadec extends ControlEdit
      {
      public CtrlVvhastadec(Form form)
        {
        super(form);
        setName("vvhastadec");
        setTitle("Hasta Declarante");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      }
      
    public class CtrlVrensimul extends ControlComboBox
      {
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
        }
      public Object getDefault()
        {
        return "S";
        }
      }
      
    public class CtrlVvdpto extends ControlComboBox
      {
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
        }
      public Object getDefault()
        {
        return "D";
        }
      }
      
    public class CtrlChsql extends ControlCheck
      {
      public CtrlChsql(Form form)
        {
        super(form);
        setName("chsql");
        setTitle("Base de Datos SQL");
        }
      public boolean  valid()
        {
          return true;
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public Object getDefault()
        {
        return false;
        }
      }
      
    public class CtrlChproy extends ControlCheck
      {
      public CtrlChproy(Form form)
        {
        super(form);
        setName("chproy");
        setTitle("Asignar canales a proyectos");
        }
      public boolean  valid()
        {
          return true;
        }
        public void userChange (Value v) {
          super.userChange(v);
          disableIniConver ();
        
        
        }
      public Object getDefault()
        {
        return Boolean.TRUE;
        }
      }
      
    public class CtrlChjco extends ControlCheck
      {
      public CtrlChjco(Form form)
        {
        super(form);
        setName("chjco");
        setTitle("jConta");
        }
      public boolean  valid()
        {
          return true;
        }
        public void userChange (Value v) {
          super.userChange(v);
          estadoCampos();
          disableIniConver ();
        
        
        }
      }
      
    public class CtrlChjeo extends ControlCheck
      {
      public CtrlChjeo(Form form)
        {
        super(form);
        setName("chjeo");
        setTitle("jEstimación");
        }
      public boolean  valid()
        {
          return true;
        }
        public void userChange (Value v) {
          super.userChange(v);
          estadoCampos();
          disableIniConver ();
        
        
        }
      }
      
    public class CtrlChjsoc extends ControlCheck
      {
      public CtrlChjsoc(Form form)
        {
        super(form);
        setName("chjsoc");
        setTitle("jSociedades");
        }
      public boolean  valid()
        {
          return true;
        }
        public void userChange (Value v) {
          super.userChange(v);
          estadoCampos();
          disableIniConver ();
        
        
        }
      }
      
    public class CtrlChjre extends ControlCheck
      {
      public CtrlChjre(Form form)
        {
        super(form);
        setName("chjre");
        setTitle("jRenta");
        }
      public boolean  valid()
        {
          return true;
        }
        public void userChange (Value v) {
          super.userChange(v);
          estadoCampos();
          disableIniConver ();
        
        
        }
      }
      
    public class CtrlChjnom extends ControlCheck
      {
      public CtrlChjnom(Form form)
        {
        super(form);
        setName("chjnom");
        setTitle("jNómina");
        }
      public boolean  valid()
        {
          return true;
        }
        public void userChange (Value v) {
          super.userChange(v);
          estadoCampos();
          disableIniConver ();
        
        }
      }
      
    public class CtrlChjges extends ControlCheck
      {
      public CtrlChjges(Form form)
        {
        super(form);
        setName("chjges");
        setTitle("jGestión");
        }
      public boolean  valid()
        {
          return true;
        }
        public void userChange (Value v) {
          super.userChange(v);
          estadoCampos();
          disableIniConver ();
        
        }
      }
      
    public class LinkAasignar extends Action
      {
      public LinkAasignar(Form form)
        {
        super(form);
        setName("aasignar");
        setTitle("&1. Asignar Códigos");
        setOptions(SHOW);
        }
      public void onAction()
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
                                                                                                                     chproy.getBoolean(), chsql.getBoolean());
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
                                                                                                                     vvpasswd.getString(),vvdpto.getString(), getDataBase());
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
        setOptions(SHOW | EOF);
        }
      public void onAction()
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
      
    public FormVconversion(ProgCnvlogicclass cnvlogicclass)
      {
      super(cnvlogicclass);
      setName("vconversion");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
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
      addControl(vvctas=new CtrlVvctas(this));
      addControl(vvnumalfa=new CtrlVvnumalfa(this));
      addControl(chestimaciones=new CtrlChestimaciones(this));
      addControl(chmercantil=new CtrlChmercantil(this));
      addControl(chmodelos=new CtrlChmodelos(this));
      addControl(vvdesdedec=new CtrlVvdesdedec(this));
      addControl(vvhastadec=new CtrlVvhastadec(this));
      addControl(vrensimul=new CtrlVrensimul(this));
      addControl(vvdpto=new CtrlVvdpto(this));
      addControl(chsql=new CtrlChsql(this));
      addControl(chproy=new CtrlChproy(this));
      addControl(chjco=new CtrlChjco(this));
      addControl(chjeo=new CtrlChjeo(this));
      addControl(chjsoc=new CtrlChjsoc(this));
      addControl(chjre=new CtrlChjre(this));
      addControl(chjnom=new CtrlChjnom(this));
      addControl(chjges=new CtrlChjges(this));
      addAction(aasignar=new LinkAasignar(this));
      addAction(ahistorico=new LinkAhistorico(this));
      }
    }
    
  // 
  public class Scodcnvotraplc extends Select
    {
    // Tablas
    public Codcnvotraplc codcnvotraplc;
    // Campos
    public Field ccoaplic;
    public Field ccobbdd;
    public Field ccocodi;
    public Field ccodecdesde;
    public Field ccodechasta;
    public Field ccodecsimul;
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
      public Codcnvotraplc(Select select)
        {
        super(select);
        setName("codcnvotraplc");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Scodcnvotraplc()
      {
      setName("scodcnvotraplc");
      addTable(codcnvotraplc=new Codcnvotraplc(this));
      addField(ccoaplic=new Field(this,codcnvotraplc,"ccoaplic"));
      addField(ccobbdd=new Field(this,codcnvotraplc,"ccobbdd"));
      addField(ccocodi=new Field(this,codcnvotraplc,"ccocodi"));
      addField(ccodecdesde=new Field(this,codcnvotraplc,"ccodecdesde"));
      addField(ccodechasta=new Field(this,codcnvotraplc,"ccodechasta"));
      addField(ccodecsimul=new Field(this,codcnvotraplc,"ccodecsimul"));
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
    }
    
  public class FormVcodigos extends MultiDataForm
    {
    // Inicio declaraciones globales
    int idConver = -1;
    // Fin declaraciones globales
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
      public CtrlChsel(Form form)
        {
        super(form);
        setName("chsel");
        setMessageHelp("Seleccionado");
        setTitle("S.");
        }
      }
      
    public class CtrlVvcodorig extends ColumnEdit
      {
      public CtrlVvcodorig(Form form)
        {
        super(form);
        setName("vvcodorig");
        setMessageHelp("Código Aplicación Origen");
        setTitle("Origen");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      }
      
    public class CtrlCclnombre extends ColumnEdit
      {
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
        setField(scodcnvotrapll.cclnombre);
        }
      }
      
    public class CtrlCclnif extends ColumnEdit
      {
      public CtrlCclnif(Form form)
        {
        super(form);
        setName("cclnif");
        setTitle("Nif");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(scodcnvotrapll.cclnif);
        }
      }
      
    public class CtrlCclcodigeyce extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlChjco extends ColumnCheck
      {
      public CtrlChjco(Form form)
        {
        super(form);
        setName("chjco");
        setMessageHelp("¿Se traspasa?");
        setTitle("JCO");
        }
      }
      
    public class CtrlChjeo extends ColumnCheck
      {
      public CtrlChjeo(Form form)
        {
        super(form);
        setName("chjeo");
        setMessageHelp("¿Se traspasa?");
        setTitle("JEO");
        }
      }
      
    public class CtrlChjsoc extends ColumnCheck
      {
      public CtrlChjsoc(Form form)
        {
        super(form);
        setName("chjsoc");
        setMessageHelp("¿Se traspasa?");
        setTitle("JSO");
        }
      }
      
    public class CtrlChjre extends ColumnCheck
      {
      public CtrlChjre(Form form)
        {
        super(form);
        setName("chjre");
        setMessageHelp("¿Se traspasa?");
        setTitle("JRE");
        }
      }
      
    public class CtrlChjnom extends ColumnCheck
      {
      public CtrlChjnom(Form form)
        {
        super(form);
        setName("chjnom");
        setMessageHelp("¿Se traspasa?");
        setTitle("JNO");
        }
      }
      
    public class CtrlChjges extends ColumnCheck
      {
      public CtrlChjges(Form form)
        {
        super(form);
        setName("chjges");
        setMessageHelp("¿Se traspasa?");
        setTitle("JGE");
        }
      }
      
    public class LinkAini extends Action
      {
      public LinkAini(Form form)
        {
        super(form);
        setName("aini");
        setTitle("&1. Iniciar Conversión");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        if (mae.easp.conversions.Incidencia.eliminarIncidencias (idConver,getDataBase())) {
          //((mae.easp.general.ErrorManagerDefaultJ)Aplication.getAplication().getErrorManager()).saltarErrores = true;
          boolean hayIncidencias = false;
          if (vconversion.chjco.getBoolean()  && clcjco.convertir () ) hayIncidencias = true;
          if (vconversion.chjeo.getBoolean()  && clcjeo.convertir () ) hayIncidencias = true;
          if (vconversion.chjsoc.getBoolean() && clcjiss.convertir ()) hayIncidencias = true;
          if (vconversion.chjre.getBoolean()  && clcjren.convertir ()) hayIncidencias = true;
          if (vconversion.chjnom.getBoolean() && clcjnom.convertir ()) hayIncidencias = true;
          if (vconversion.chjges.getBoolean() && clcjges.convertir ()) hayIncidencias = true;
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
      
    public FormVcodigos(ProgCnvlogicclass cnvlogicclass)
      {
      super(cnvlogicclass);
      setName("vcodigos");
      setTitle("Códigos asignados");
      setLocation(new Location());
      setStates(SHOW);
      setPrintable(false);
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
      setSelect(scodcnvotrapll);
      }
    public void onBeginRecord()
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
      }
    }
    
  // 
  public class Scodcnvotrapll extends Select
    {
    // Tablas
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
      public Codcnvotrapll(Select select)
        {
        super(select);
        setName("codcnvotrapll");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Scodcnvotrapll()
      {
      setName("scodcnvotrapll");
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
    public String getWhere()
      {
      return "cclccocodi="+vcodigos.idConver;
      }
    public String getOrder()
      {
      return "cclcodiorigen";
      }
    }
    
  public class FormVincidencias extends MultiDataForm
    {
    // Inicio declaraciones globales
    public int idConversion;
    
    public void onOpened() {
      super.onOpened();
      sincidencias.execute();
    }
    // Fin declaraciones globales
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
      public CtrlVvcodorig(Form form)
        {
        super(form);
        setName("vvcodorig");
        setMessageHelp("Código Aplicación Origen");
        setTitle("Origen");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      }
      
    public class CtrlCcinombre extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlCcinif extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlCcicodigeyce extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlCciejercicio extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlCciaplic extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlCcimsg extends ColumnEdit
      {
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
        }
      }
      
    public class LinkAver extends Action
      {
      public LinkAver(Form form)
        {
        super(form);
        setName("aver");
        setTitle("&1. Mostrar Incidencia");
        setOptions(SHOW);
        }
      public void onAction()
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
    public void onInit()
      {
      setInitState(DataForm.SHOW);
      super.onInit();
      }
    public void onBeginRecord()
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
      public Codcnvinciden(Select select)
        {
        super(select);
        setName("codcnvinciden");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sincidencias()
      {
      setName("sincidencias");
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
    public String getWhere()
      {
      return "cciccocodi = "+vincidencias.idConversion;
      }
    public String getOrder()
      {
      return "ccicodiorigen,ccicodi";
      }
    }
    
  public class FormVhistorico extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onOpened() {
      super.onOpened();
      doShow();
    }
    
    public java.awt.Color getCellColorForeground(boolean isSelected, boolean hasFocus, int row, int column) {
      if ( vvincidencias.getValue(row).isNull())    return new java.awt.Color(0x33,0x99,0x33) ;  // Verde #339933
      else return new java.awt.Color(0xff,0x00,0x00) ;  // Rojo  #FF0000
    }
    
    // Fin declaraciones globales
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
        }
      }
      
    public class CtrlVvincidencias extends ColumnEdit
      {
      public CtrlVvincidencias(Form form)
        {
        super(form);
        setName("vvincidencias");
        setMessageHelp("Número de Incidencias");
        setTitle("# Inc");
        setType(INTEGER);
        setLength(5);
        setPrintable(false);
        }
      }
      
    public class CtrlCcousuario extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlCcoservidor extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlCcobbdd extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlCcoempini extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlCcoempfin extends ColumnEdit
      {
      public CtrlCcoempfin(Form form)
        {
        super(form);
        setName("ccoempfin");
        setTitle("Emp Fin");
        setType(INTEGER);
        setLength(6);
        setPrintable(false);
        setField(shistor.ccoempfin);
        }
      }
      
    public class CtrlCcoejeini extends ColumnEdit
      {
      public CtrlCcoejeini(Form form)
        {
        super(form);
        setName("ccoejeini");
        setTitle("Ejer Ini");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        setField(shistor.ccoejeini);
        }
      }
      
    public class CtrlCcoejefin extends ColumnEdit
      {
      public CtrlCcoejefin(Form form)
        {
        super(form);
        setName("ccoejefin");
        setTitle("Ejer Fin");
        setType(INTEGER);
        setLength(10);
        setPrintable(false);
        setField(shistor.ccoejefin);
        }
      }
      
    public class CtrlChjco extends ColumnCheck
      {
      public CtrlChjco(Form form)
        {
        super(form);
        setName("chjco");
        setTitle("JCO");
        }
      }
      
    public class CtrlChjeo extends ColumnCheck
      {
      public CtrlChjeo(Form form)
        {
        super(form);
        setName("chjeo");
        setTitle("JEO");
        }
      }
      
    public class CtrlChjsoc extends ColumnCheck
      {
      public CtrlChjsoc(Form form)
        {
        super(form);
        setName("chjsoc");
        setTitle("JSOC");
        }
      }
      
    public class CtrlChjre extends ColumnCheck
      {
      public CtrlChjre(Form form)
        {
        super(form);
        setName("chjre");
        setTitle("JRE");
        }
      }
      
    public class CtrlChjnom extends ColumnCheck
      {
      public CtrlChjnom(Form form)
        {
        super(form);
        setName("chjnom");
        setTitle("JNO");
        }
      }
      
    public class CtrlChjges extends ColumnCheck
      {
      public CtrlChjges(Form form)
        {
        super(form);
        setName("chjges");
        setTitle("JGE");
        }
      }
      
    public class LinkAinciden extends Action
      {
      public LinkAinciden(Form form)
        {
        super(form);
        setName("ainciden");
        setTitle("&1. Ver Incidencias");
        setOptions(SHOW);
        }
      public void onAction()
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
    public void onInit()
      {
      setInitState(DataForm.SHOW);
      super.onInit();
      }
    public void onBeginRecord()
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
      public Codcnvotraplc(Select select)
        {
        super(select);
        setName("codcnvotraplc");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Shistor()
      {
      setName("shistor");
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
    public String getWhere()
      {
      return "ccoaplic='"+AplicacionOrigen.toString()+"' and ccohistorico='S'";
      }
    public String getOrder()
      {
      return "ccofecha DESC,ccocodi DESC";
      }
    }
    
  // 
  public class Shayinciden extends Select
    {
    // Tablas
    public Codcnvinciden codcnvinciden;
    // Campos
    public Field ccicodi;
    class Codcnvinciden extends Table
      {
      public Codcnvinciden(Select select)
        {
        super(select);
        setName("codcnvinciden");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Shayinciden()
      {
      setName("shayinciden");
      addTable(codcnvinciden=new Codcnvinciden(this));
      addField(ccicodi=new Field(this,codcnvinciden,"ccicodi"));
      }
    public String getWhere()
      {
      return "cciccocodi = "+shistor.ccocodi.getInteger();
      }
    }
    
  public class FormVdetalle extends MultiDataForm
    {
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
      public CtrlChsel(Form form)
        {
        super(form);
        setName("chsel");
        setMessageHelp("Seleccionado");
        setTitle("S.");
        }
      }
      
    public class CtrlCclcodiorigen extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlCclnombre extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlCclnif extends ColumnEdit
      {
      public CtrlCclnif(Form form)
        {
        super(form);
        setName("cclnif");
        setTitle("Nif");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(sdetalle.cclnif);
        }
      }
      
    public class CtrlCclcodigeyce extends ColumnEdit
      {
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
        }
      }
      
    public class CtrlChjco extends ColumnCheck
      {
      public CtrlChjco(Form form)
        {
        super(form);
        setName("chjco");
        setMessageHelp("¿Se traspasa?");
        setTitle("JCO");
        }
      }
      
    public class CtrlChjeo extends ColumnCheck
      {
      public CtrlChjeo(Form form)
        {
        super(form);
        setName("chjeo");
        setMessageHelp("¿Se traspasa?");
        setTitle("JEO");
        }
      }
      
    public class CtrlChjsoc extends ColumnCheck
      {
      public CtrlChjsoc(Form form)
        {
        super(form);
        setName("chjsoc");
        setMessageHelp("¿Se traspasa?");
        setTitle("JSO");
        }
      }
      
    public class CtrlChjre extends ColumnCheck
      {
      public CtrlChjre(Form form)
        {
        super(form);
        setName("chjre");
        setMessageHelp("¿Se traspasa?");
        setTitle("JRE");
        }
      }
      
    public class CtrlChjnom extends ColumnCheck
      {
      public CtrlChjnom(Form form)
        {
        super(form);
        setName("chjnom");
        setMessageHelp("¿Se traspasa?");
        setTitle("JNO");
        }
      }
      
    public class CtrlChjges extends ColumnCheck
      {
      public CtrlChjges(Form form)
        {
        super(form);
        setName("chjges");
        setMessageHelp("¿Se traspasa?");
        setTitle("JGE");
        }
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
    public void onBeginRecord()
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
      public Codcnvotrapll(Select select)
        {
        super(select);
        setName("codcnvotrapll");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sdetalle()
      {
      setName("sdetalle");
      setFather(shistor);
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
    public String getWhere()
      {
      return "cclccocodi="+shistor.ccocodi.getSQLFormat();
      }
    public String getOrder()
      {
      return "cclcodiorigen";
      }
    }
    
  public ProgCnvlogicclass()
    {
    this.cnvlogicclass=this;
    setName("cnvlogicclass");
    setTitle("Conversión");
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
  public void onInit()
    {
    setConnection(Easp.connEA);
    //mae.easp.cnvaviso.ProgCnvaviso pra = new mae.easp.cnvaviso.ProgCnvaviso ();
    //pra.run();
    //if (!pra.haAceptadoCondiciones) return;
    vconversion.setLayout(new LayoutHtml("mae/easp/html/cnvlogicclas_vconversion.html"));
    super.onInit();
    
    
    }
  }
  
