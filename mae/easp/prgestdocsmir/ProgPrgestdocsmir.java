// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090922
// Hora:             09:53:53
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prgestdocsmir;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prgestdocsmir
// Nombre:   Gestión de Documentos MIR
// Versión:  1.0
// 
public class ProgPrgestdocsmir extends Program
  {
  public AppEasp easp;
  public ProgPrgestdocsmir prgestdocsmir;
  // Inicio declaraciones globales
  public int contOk = 0 ;
  public int contKo = 0 ;
  public String aplic = "JEA";
  public int registro = 0;
  // Fin declaraciones globales
  // Ventana
  public FormVdocsmir vdocsmir;
  // Selects
  public Smir smir;
  public Smirutil smirutil;
  // Ventana
  public FormVdocsmiredit vdocsmiredit;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Gestión de Documentos MIR");
      }
    }
    
  public class FormVdocsmir extends MultiDataForm
    {
    // Inicio declaraciones globales
    public java.awt.Color getCellColorBackground(boolean isSelected, boolean hasFocus, int row, int column) {
      if ( isSelected )       return null ; 
      else if ( column == 0 ) return null;
      else                    return new java.awt.Color(0xe2,0xdf,0xe2);  // #E2DFE2 
      }
    
    public java.awt.Color getCellColorForeground(boolean isSelected, boolean hasFocus, int row, int column) {
      if ( isSelected ) return null ; 
      else if ( column == 4 &&  mirestado.getValue(row).getString().equals("R")  ) return new java.awt.Color(0xff,0x00,0x00) ;  // Rojo  #FF0000
      else if ( column == 4 &&  mirestado.getValue(row).getString().equals("E")  )  return new java.awt.Color(0x33,0x99,0x33) ;  // Verde #339933
      else if ( column == 4 &&  mirestado.getValue(row).getString().equals("P")  ) return new java.awt.Color(0x00,0x00,0xff) ;  // Azul  #0000FF
      else                    return null ; 
    
      }
    
    
    public void onSelection(){
      super.onSelection();
      if (mirestado.getString().equals("E")) {
        Maefc.message("No se puede seleccionar un documento enviado","¡Atención!",Maefc.WARNING_MESSAGE);
      }
      else {
        smir.edit();
        if ( chactivado.getBoolean() ) {
          smir.miractivado.setNull();
          chactivado.setValue(false);
        }
        else {
          smir.miractivado.setValue("S");
          chactivado.setValue(true);
        }
        if ( smir.update() ) smir.commit();
        else                 smir.rollback();
      }
    }
    
    public void activar(boolean activ ) {
      String where = smir.getWhere() ;
      if ( vdocsmir.getQbfWhere() != null && !vdocsmir.getQbfWhere().equals("") ) {
        where+=" and "+vdocsmir.getQbfWhere();
      }
      smirutil.setWhere(where);
      smirutil.setOrder(smir.getOrder());
      smirutil.execute();
      while ( !smirutil.isEof() ) {
        if (!smirutil.mirestado.getString().equals("E")) {
          smirutil.edit(); 
          if ( activ ) smirutil.miractivado.setValue("S");
          else         smirutil.miractivado.setNull();
          smirutil.update();
        }
        smirutil.next();
      }
      doShow();
    }
    
    public void onInsert() {
      int reg=vdocsmir.getCurrentRow();
      vdocsmiredit.estado = "I";  
      vdocsmiredit.open();
      doShow();
    }
      
    public void onEdit() {
      if (mirestado.getString().equals("E")) {
        Maefc.message("No se puede modificar un documento enviado","¡Atención!",Maefc.WARNING_MESSAGE);
      }
      else {
        int reg=vdocsmir.getCurrentRow();  
        vdocsmiredit.estado = "E"; 
        vdocsmiredit.open();   
        doShow();
        vdocsmir.setCurrentRow(reg);
      }
    }
    
    public void onDelete() {
      if (mirestado.getString().equals("E")) {
        Maefc.message("No se puede eliminar un documento enviado","¡Atención!",Maefc.WARNING_MESSAGE);
      }
      else {
        super.onDelete();
      }
    }
    
    // Fin declaraciones globales
    // Controles
    public CtrlChactivado chactivado;
    public CtrlMirmcodemp mirmcodemp;
    public CtrlMircif mircif;
    public CtrlMirestado mirestado;
    public CtrlMirtipdoc mirtipdoc;
    public CtrlMirfechacrea mirfechacrea;
    public CtrlMirfechaenvio mirfechaenvio;
    public CtrlMirdesc mirdesc;
    public CtrlMirubicacion mirubicacion;
    // Acciones
    public LinkAcver acver;
    public LinkAcenviar acenviar;
    public LinkAcactivar acactivar;
    public LinkAcdesact acdesact;
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
        setAnchor(CENTER);
        }
      }
      
    public class CtrlChactivado extends ColumnCheck
      {
      public CtrlChactivado(Form form)
        {
        super(form);
        setName("chactivado");
        setTitle("Sel");
        }
      }
      
    public class CtrlMirmcodemp extends ColumnEdit
      {
      public CtrlMirmcodemp(Form form)
        {
        super(form);
        setName("mirmcodemp");
        setTitle("Empresa");
        setType(INTEGER);
        setLength(6);
        setSearchable(true);
        setField(smir.mirmcodemp);
        }
      }
      
    public class CtrlMircif extends ColumnEdit
      {
      public CtrlMircif(Form form)
        {
        super(form);
        setName("mircif");
        setTitle("NIF / CIF");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setField(smir.mircif);
        }
      }
      
    public class CtrlMirestado extends ColumnComboBox
      {
      public CtrlMirestado(Form form)
        {
        super(form);
        setName("mirestado");
        setTitle("Estado");
        setType(STRING);
        setLength(1);
        setSearchable(true);
        addItem("P/Pendiente");
        addItem("E/Enviado");
        addItem("R/Error al Enviar");
        setField(smir.mirestado);
        }
      }
      
    public class CtrlMirtipdoc extends ColumnComboBox
      {
      public CtrlMirtipdoc(Form form)
        {
        super(form);
        setName("mirtipdoc");
        setTitle("Documento");
        setType(STRING);
        setLength(20);
        setSearchable(true);
        setRestricted(false);
        setDescriptionShow(false);
        addItem("CONTRATO/Contratos");
        addItem("PRORROGA/Prorrogas");
        addItem("FINIQUITO/Finiquitos");
        addItem("CERTIFICADO EMPRE/Certificado de Empresa");
        addItem("DECLARA JURADA/Declaración jurada Modelo 145");
        setField(smir.mirtipdoc);
        }
      }
      
    public class CtrlMirfechacrea extends ColumnEdit
      {
      public CtrlMirfechacrea(Form form)
        {
        super(form);
        setName("mirfechacrea");
        setMessageHelp("Fecha Creación");
        setTitle("Fecha Creación");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(smir.mirfechacrea);
        }
      }
      
    public class CtrlMirfechaenvio extends ColumnEdit
      {
      public CtrlMirfechaenvio(Form form)
        {
        super(form);
        setName("mirfechaenvio");
        setMessageHelp("Fecha Envio");
        setTitle("Fecha Envio");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(smir.mirfechaenvio);
        }
      }
      
    public class CtrlMirdesc extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(40);
          }
        }
        
      public CtrlMirdesc(Form form)
        {
        super(form);
        setLook(new Look());
        setName("mirdesc");
        setTitle("Descripción");
        setType(STRING);
        setLength(100);
        setField(smir.mirdesc);
        }
      }
      
    public class CtrlMirubicacion extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(40);
          }
        }
        
      public CtrlMirubicacion(Form form)
        {
        super(form);
        setLook(new Look());
        setName("mirubicacion");
        setTitle("Fichero");
        setType(STRING);
        setLength(200);
        setField(smir.mirubicacion);
        }
      }
      
    public class LinkAcver extends Action
      {
      public LinkAcver(Form form)
        {
        super(form);
        setName("acver");
        setTitle("&1. Ver");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        Easp.abrirFichero(smir.mirubicacion.getString());
        
        }
      }
      
    public class LinkAcenviar extends Action
      {
      public LinkAcenviar(Form form)
        {
        super(form);
        setName("acenviar");
        setTitle("&2. Enviar");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        int resp  = Maefc.message("Este proceso enviara todos los documentos seleccionados.\n\n¿Desea Continuar?","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION);
        if (resp!=Maefc.YES_OPTION) return;
        
        contOk=0;
        contKo=0;
        ProgressBarForm pbf=new ProgressBarForm(prgestdocsmir,"Enviando  ...",true,false,true) {
          public void job() {
            setPercent(0);
            String where = smir.getWhere() ;   
            if ( vdocsmir.getQbfWhere() != null && !vdocsmir.getQbfWhere().equals("") ) where+=" and "+vdocsmir.getQbfWhere();
            smirutil.setWhere(where);
            smirutil.setOrder(smir.getOrder());
            smirutil.execute();
            while ( !smirutil.isEof() ) {
              setPercent(100*(smirutil.getCurrentRow()+1)/(smirutil.getNumRows()+1));
              if ( smirutil.miractivado.getString().equals("S") ) {
                smirutil.edit(); 
                Mir emir = new Mir (smirutil.mirmcodemp.getInteger(),smirutil.mircif.getString(),smirutil.mirdesc.getString(),smirutil.mirtipdoc.getString(),smirutil.mirubicacion.getString(),aplic);
                if ( emir.tieneMir() ) {
                  boolean  proceso = emir.send(Easp.usuario,smirutil.mirfechacrea.getString());
                  if (  proceso ) {
                    contOk++;
                    smirutil.miractivado.setNull();
                    smirutil.mirestado.setValue("E");
                    smirutil.mirfechaenvio.setValue(Maefc.getDate());
                  }
                  else {
                    Maefc.message(emir.getErrorEnvio(),"Atención",Maefc.ERROR_MESSAGE);
                     contKo++;
                    smirutil.mirestado.setValue("R");
                  }            
                }
                else {
                  Maefc.message(emir.getErrorEnvio(),"Atención",Maefc.ERROR_MESSAGE);
                  contKo++;
                  smirutil.mirestado.setValue("R");
                }
                smirutil.update();
              }
              smirutil.next();
            }
            doShow();    
            setPercent(100);
            exit();
          }
        };
        pbf.setFormWidth(600);
        pbf.setEnabledCancel(false);
        pbf.launch();
        Maefc.message("El proceso ha finalizado \n \n Enviados:  "+contOk+" \n No Enviados: "+contKo,"Atención",Maefc.INFORMATION_MESSAGE);
        
        
        
        
        
        }
      }
      
    public class LinkAcactivar extends Action
      {
      public LinkAcactivar(Form form)
        {
        super(form);
        setName("acactivar");
        setTitle("&3. Activar todos");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        activar(true);
        
        }
      }
      
    public class LinkAcdesact extends Action
      {
      public LinkAcdesact(Form form)
        {
        super(form);
        setName("acdesact");
        setTitle("&4. Desactivar Todos");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        activar(false);
        
        }
      }
      
    public FormVdocsmir(ProgPrgestdocsmir prgestdocsmir)
      {
      super(prgestdocsmir);
      setName("vdocsmir");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
      setPrintable(false);
      addSelect(smir=new Smir());
      addSelect(smirutil=new Smirutil());
      addControl(chactivado=new CtrlChactivado(this));
      addControl(mirmcodemp=new CtrlMirmcodemp(this));
      addControl(mircif=new CtrlMircif(this));
      addControl(mirestado=new CtrlMirestado(this));
      addControl(mirtipdoc=new CtrlMirtipdoc(this));
      addControl(mirfechacrea=new CtrlMirfechacrea(this));
      addControl(mirfechaenvio=new CtrlMirfechaenvio(this));
      addControl(mirdesc=new CtrlMirdesc(this));
      addControl(mirubicacion=new CtrlMirubicacion(this));
      addAction(acver=new LinkAcver(this));
      addAction(acenviar=new LinkAcenviar(this));
      addAction(acactivar=new LinkAcactivar(this));
      addAction(acdesact=new LinkAcdesact(this));
      setSelect(smir);
      }
    public boolean onOkInsert()
      {
      return super.onOkInsert();
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      chactivado.setValue(smir.miractivado.getString().equals("S"));
      
      }
    }
    
  // 
  public class Smir extends Select
    {
    // Tablas
    public Mir mir;
    // Campos
    public Field miractivado;
    public Field miraplic;
    public Field mircdp;
    public Field mircif;
    public Field mircodi;
    public Field mirdesc;
    public Field mirestado;
    public Field mirfechacrea;
    public Field mirfechaenvio;
    public Field mirmcodemp;
    public Field mirnomcodcen;
    public Field mirnomcodtra;
    public Field mirtipdoc;
    public Field mirtipfile;
    public Field mirubicacion;
    class Mir extends Table
      {
      public Mir(Select select)
        {
        super(select);
        setName("mir");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Smir()
      {
      setName("smir");
      addTable(mir=new Mir(this));
      addField(miractivado=new Field(this,mir,"miractivado"));
      addField(miraplic=new Field(this,mir,"miraplic"));
      addField(mircdp=new Field(this,mir,"mircdp"));
      addField(mircif=new Field(this,mir,"mircif"));
      addField(mircodi=new Field(this,mir,"mircodi"));
      addField(mirdesc=new Field(this,mir,"mirdesc"));
      addField(mirestado=new Field(this,mir,"mirestado"));
      addField(mirfechacrea=new Field(this,mir,"mirfechacrea"));
      addField(mirfechaenvio=new Field(this,mir,"mirfechaenvio"));
      addField(mirmcodemp=new Field(this,mir,"mirmcodemp"));
      addField(mirnomcodcen=new Field(this,mir,"mirnomcodcen"));
      addField(mirnomcodtra=new Field(this,mir,"mirnomcodtra"));
      addField(mirtipdoc=new Field(this,mir,"mirtipdoc"));
      addField(mirtipfile=new Field(this,mir,"mirtipfile"));
      addField(mirubicacion=new Field(this,mir,"mirubicacion"));
      }
    public String getWhere()
      {
      String where = " miraplic <> 'LABORAL' " ;
      if (aplic != null && !aplic.equals("JEA")) where += " and miraplic = '"+aplic+"' " ;
      if (registro>0) where += " and mircodi="+registro;
      return where;
      }
    public String getOrder()
      {
      return " mirfechacrea DESC , mircodi DESC " ;
      }
    }
    
  // 
  public class Smirutil extends Select
    {
    // Tablas
    public Mir mir;
    // Campos
    public Field miractivado;
    public Field miraplic;
    public Field mircdp;
    public Field mircif;
    public Field mircodi;
    public Field mirdesc;
    public Field mirestado;
    public Field mirfechacrea;
    public Field mirfechaenvio;
    public Field mirmcodemp;
    public Field mirnomcodcen;
    public Field mirnomcodtra;
    public Field mirtipdoc;
    public Field mirtipfile;
    public Field mirubicacion;
    class Mir extends Table
      {
      public Mir(Select select)
        {
        super(select);
        setName("mir");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Smirutil()
      {
      setName("smirutil");
      addTable(mir=new Mir(this));
      addField(miractivado=new Field(this,mir,"miractivado"));
      addField(miraplic=new Field(this,mir,"miraplic"));
      addField(mircdp=new Field(this,mir,"mircdp"));
      addField(mircif=new Field(this,mir,"mircif"));
      addField(mircodi=new Field(this,mir,"mircodi"));
      addField(mirdesc=new Field(this,mir,"mirdesc"));
      addField(mirestado=new Field(this,mir,"mirestado"));
      addField(mirfechacrea=new Field(this,mir,"mirfechacrea"));
      addField(mirfechaenvio=new Field(this,mir,"mirfechaenvio"));
      addField(mirmcodemp=new Field(this,mir,"mirmcodemp"));
      addField(mirnomcodcen=new Field(this,mir,"mirnomcodcen"));
      addField(mirnomcodtra=new Field(this,mir,"mirnomcodtra"));
      addField(mirtipdoc=new Field(this,mir,"mirtipdoc"));
      addField(mirtipfile=new Field(this,mir,"mirtipfile"));
      addField(mirubicacion=new Field(this,mir,"mirubicacion"));
      }
    }
    
  public class FormVdocsmiredit extends MonoDataForm
    {
    // Inicio declaraciones globales
    public String estado = "";
    
    public void onOpened() { 
      super.onOpened();
      //this.setLayout(new LayoutHtml("mae/laboral/html/vdocsmiredit.html"));
      if (estado.equals("I") )  doInsert();  
      else if (estado.equals("E") ) doEdit();
    }
    
    // Fin declaraciones globales
    // Controles
    public CtrlMirmcodemp mirmcodemp;
    public CtrlMircif mircif;
    public CtrlMirestado mirestado;
    public CtrlMirtipdoc mirtipdoc;
    public CtrlMirfechacrea mirfechacrea;
    public CtrlMirfechaenvio mirfechaenvio;
    public CtrlMirdesc mirdesc;
    public CtrlMirubicacion mirubicacion;
    public CtrlBtexplorar btexplorar;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(610);
        setHeight(340);
        setTitle("Altas nuevos documentos");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlMirmcodemp extends ControlComboBox
      {
      public mae.easp.general.pkcdpconta.PickPkcdpconta pickup;
      public CtrlMirmcodemp(Form form)
        {
        super(form);
        setName("mirmcodemp");
        setMessageHelp("Código empresa");
        setTitle("Empresa");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkcdpconta.PickPkcdpconta(this));
        setLength(6);
        setField(smir.mirmcodemp);
        }
      public void onChange()
        {
        super.onChange();
        vdocsmir.mirmcodemp.setValue(getValue());
        }
        
        public void userChange(Value v) {
          super.userChange(v);
          Selector scdp = new Selector(Easp.connEA);
          scdp.execute("select cdpnifcif from cdp where cdpcodi='"+Easp.dominio.substring(0,6)+Numero.format(getInteger(),"000000")+"'");
          if (scdp.next()) mircif.setValue(scdp.getString("cdpnifcif"));
          scdp.close();
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlMircif extends ControlEdit
      {
      public CtrlMircif(Form form)
        {
        super(form);
        setName("mircif");
        setTitle("NIF / CIF");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        setField(smir.mircif);
        }
      public void onChange()
        {
        super.onChange();
        vdocsmir.mircif.setValue(getValue());
        }
      }
      
    public class CtrlMirestado extends ControlComboBox
      {
      public CtrlMirestado(Form form)
        {
        super(form);
        setName("mirestado");
        setMessageHelp("Código estado");
        setTitle("Estado");
        setType(STRING);
        setLength(1);
        setEnabled(false);
        addItem("P/Pendiente");
        addItem("E/Enviado");
        addItem("R/Error al Enviar");
        setField(smir.mirestado);
        }
      public Object getDefault()
        {
        return new String("P");
        }
      public void onChange()
        {
        super.onChange();
        vdocsmir.mirestado.setValue(getValue());
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlMirtipdoc extends ControlEdit
      {
      public CtrlMirtipdoc(Form form)
        {
        super(form);
        setName("mirtipdoc");
        setMessageHelp("Tipo documento");
        setTitle("Titulo");
        setType(STRING);
        setLength(20);
        setField(smir.mirtipdoc);
        }
      public void onChange()
        {
        super.onChange();
        vdocsmir.mirtipdoc.setValue(getValue());
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlMirfechacrea extends ControlEdit
      {
      public CtrlMirfechacrea(Form form)
        {
        super(form);
        setName("mirfechacrea");
        setMessageHelp("Fecha Creación");
        setTitle("Fecha Creación");
        setType(DATE);
        setLength(10);
        setEnabled(false);
        setField(smir.mirfechacrea);
        }
      public Object getDefault()
        {
        if(vdocsmiredit.estado.equals("I")) {
          return Fecha.hoy();
          }
        else
          return this.getDefault();
        }
      public void onChange()
        {
        super.onChange();
        vdocsmir.mirfechacrea.setValue(getValue());
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlMirfechaenvio extends ControlEdit
      {
      public CtrlMirfechaenvio(Form form)
        {
        super(form);
        setName("mirfechaenvio");
        setMessageHelp("Fecha Envio");
        setTitle("Fecha Envio");
        setType(DATE);
        setLength(10);
        setEnabled(false);
        setField(smir.mirfechaenvio);
        }
      public void onChange()
        {
        super.onChange();
        vdocsmir.mirfechaenvio.setValue(getValue());
        }
      }
      
    public class CtrlMirdesc extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(40);
          }
        }
        
      public CtrlMirdesc(Form form)
        {
        super(form);
        setLook(new Look());
        setName("mirdesc");
        setTitle("Descripción");
        setType(STRING);
        setLength(100);
        setField(smir.mirdesc);
        }
      public void onChange()
        {
        super.onChange();
        vdocsmir.mirdesc.setValue(getValue());
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlMirubicacion extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(40);
          }
        }
        
      public CtrlMirubicacion(Form form)
        {
        super(form);
        setLook(new Look());
        setName("mirubicacion");
        setMessageHelp("Ubicación archivo");
        setTitle("Fichero");
        setType(STRING);
        setLength(200);
        setEnabled(false);
        setField(smir.mirubicacion);
        }
      public void onChange()
        {
        super.onChange();
        vdocsmir.mirubicacion.setValue(getValue());
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlBtexplorar extends ControlButton
      {
      public CtrlBtexplorar(Form form)
        {
        super(form);
        setName("btexplorar");
        setMessageHelp("exploración de archivos");
        setTitle("...");
        setTitle("...");
        }
      public void onClick()
        {
        super.onClick();
        java.awt.FileDialog  dlg=new java.awt.FileDialog(geyce.maefc.swing.WSystemView.getFrame(),"Seleccionar fichero",java.awt.FileDialog.LOAD);
        //dlg.setDirectory(Nomasp.PATH_FICHEROS);
        dlg.show();
        if (dlg.getFile()!=null) {
          mirubicacion.setValue(dlg.getDirectory()+dlg.getFile() );
          String extension = dlg.getFile();
          if(extension.contains(".")) {
            smir.mirtipfile.setValue(extension.substring(extension.indexOf(".")+1));
          }
        }
        }
      }
      
    public FormVdocsmiredit(ProgPrgestdocsmir prgestdocsmir)
      {
      super(prgestdocsmir);
      setName("vdocsmiredit");
      setTitle("Altas nuevos documentos");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE | INSERT);
      setPrintable(false);
      setModal(true);
      setUnique(true);
      addControl(mirmcodemp=new CtrlMirmcodemp(this));
      addControl(mircif=new CtrlMircif(this));
      addControl(mirestado=new CtrlMirestado(this));
      addControl(mirtipdoc=new CtrlMirtipdoc(this));
      addControl(mirfechacrea=new CtrlMirfechacrea(this));
      addControl(mirfechaenvio=new CtrlMirfechaenvio(this));
      addControl(mirdesc=new CtrlMirdesc(this));
      addControl(mirubicacion=new CtrlMirubicacion(this));
      addControl(btexplorar=new CtrlBtexplorar(this));
      setSelect(smir);
      }
    public boolean onOkInsert()
      {
      smir.miraplic.setValue(aplic);
      smir.miractivado.setValue("S");
      smir.mircdp.setValue(Easp.dominio.substring(0,6) + Numero.format(mirmcodemp.getInteger(),"000000"));
      return super.onOkInsert();
      }
    public boolean onOkUpdate()
      {
      smir.mircdp.setValue(Easp.dominio.substring(0,6) + Numero.format(mirmcodemp.getInteger(),"000000"));  
      return super.onOkUpdate();
      
      }
    }
    
  public ProgPrgestdocsmir()
    {
    this.prgestdocsmir=this;
    setName("prgestdocsmir");
    setTitle("Gestión de Documentos MIR");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vdocsmir=new FormVdocsmir(this));
    addForm(vdocsmiredit=new FormVdocsmiredit(this));
    }
  public ProgPrgestdocsmir(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    setConnection(Easp.connEA);
    vdocsmiredit.setExitOnSave(true);
    vdocsmiredit.mirmcodemp.pickup.aplic = aplic;
    setModal(true);
    LocationWindow lw=new LocationWindow();
    lw.setWidth(690);
    lw.setHeight(380);
    lw.setLocation(lw.CENTER);
    setLocation(lw);
    vdocsmir.setInitState(DataForm.SHOW);
    super.onInit();
    
    }
  }
  
