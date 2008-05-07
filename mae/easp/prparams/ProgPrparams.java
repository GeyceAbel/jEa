// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:04
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prparams;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prparams
// Nombre:   Parámetros
// Versión:  1.0
// 
public class ProgPrparams extends Program
  {
  public AppEasp easp;
  public ProgPrparams prparams;
  // Inicio declaraciones globales
  
  public String paramAplic=null;
  public String paramUser=null;
  public String paramDominio=null;
  public DBConnection paramConn;
  
  public static boolean isValidNumber(String cadena) {
      try {
       double d= Double.valueOf(cadena).doubleValue();
       return true;
       }
      catch (NumberFormatException nfe) {
        return false;
        }
      }
  
  // Fin declaraciones globales
  // Ventana
  public FormVusuarios vusuarios;
  // Selects
  public Sambitos sambitos;
  // Ventana
  public FormVparams vparams;
  // Selects
  public Sparams sparams;
  public Svalues svalues;
  // Ventana
  public FormVmodif vmodif;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Parámetros");
      }
    }
    
  public class FormVusuarios extends ProcessForm
    {
    // Controles
    public CtrlVvusuario vvusuario;
    public CtrlVvaplicacion vvaplicacion;
    // Acciones
    class Location extends LocationSplit
      {
      public Location( )
        {
        super();
        setLocation(TOP);
        }
      }
      
    public class CtrlVvusuario extends ControlEdit
      {
      public CtrlVvusuario(Form form)
        {
        super(form);
        setName("vvusuario");
        setTitle("Usuario");
        setType(STRING);
        setLength(25);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvaplicacion extends ControlEdit
      {
      public CtrlVvaplicacion(Form form)
        {
        super(form);
        setName("vvaplicacion");
        setTitle("Aplicación");
        setType(STRING);
        setLength(10);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public FormVusuarios(ProgPrparams prparams)
      {
      super(prparams);
      setName("vusuarios");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      addSelect(sambitos=new Sambitos());
      addControl(vvusuario=new CtrlVvusuario(this));
      addControl(vvaplicacion=new CtrlVvaplicacion(this));
      }
    public void onInit()
      {
      super.onInit();
      if ( paramUser != null ) vvusuario.setValue(paramUser);
      else                     vvusuario.setValue(Easp.usuario);
      vvaplicacion.setValue(paramAplic);
      sparams.setDistinct(true);
      sparams.execute();
      }
    }
    
  // Select de los Diferentes Ambitos
  public class Sambitos extends Select
    {
    // Tablas
    public Parametros parametros;
    // Campos
    public Field paragrup;
    public Field parambito;
    class Parametros extends Table
      {
      public Parametros(Select select)
        {
        super(select);
        setName("parametros");
        setOptions(READ);
        }
      }
      
    public Sambitos()
      {
      setName("sambitos");
      addTable(parametros=new Parametros(this));
      addField(paragrup=new Field(this,parametros,"paragrup"));
      addField(parambito=new Field(this,parametros,"parambito"));
      }
    }
    
  public class FormVparams extends MultiDataForm
    {
    // Inicio declaraciones globales
    public int  numAmbit;
    
    public void onGetFocus() {
      String ambito=((LocationTabbed)getLocation()).getTitle() ;
    
      Easp.chivato(" Titulo   = ["+ambito+"]",0);
      Easp.chivato(" NumAmbit = ["+numAmbit+"]",0);
      Easp.chivato(" vparams  = ["+toString()+"]",0);
      Easp.chivato(" sparams  = ["+getSelects()[0].toString()+"]",0);
      Easp.chivato(" Num Selects = ["+getSelects().length+"]",0);
    
      getSelects()[0].setDistinct(true);
      String strWhere = "parambito = '"+ambito+"'" ;
      if ( paramAplic!=null) strWhere+=" And paragrup ='"+paramAplic+"'";
      else {
        sambitos.setCurrentRow(numAmbit);
        if ( !sambitos.paragrup.isNull() ) {
          vusuarios.vvaplicacion.setValue(sambitos.paragrup.getString()); 
          strWhere+=" And paragrup = '"+vusuarios.vvaplicacion.getString()+"'";
          }
        }
      getSelects()[0].setWhere(strWhere);
      getSelects()[0].execute();
      show();
    
      parvariable.setField(((Sparams)getSelects()[0]).parvariable);
      pardesc.setField(((Sparams)getSelects()[0]).pardesc);  
    
      super.onGetFocus();
      show();
      refreshShow();
      refresh();
      }
    
    public FormVparams(ProgPrparams prparams , Sparams mySparams) {
      super(prparams);
      setName("vparams");
      setLocation(new Location());
      setStates(SHOW);
      setPrintable(false);
      addSelect(mySparams);
      addControl(parvariable=new CtrlParvariable(this));
      addControl(pardesc=new CtrlPardesc(this));
      addControl(vvalordefault=new CtrlVvalordefault(this));
      addControl(vvalordp=new CtrlVvalordp(this));
      addControl(vvaloruser=new CtrlVvaloruser(this));
      addAction(modifdp=new LinkModifdp(this));
      addAction(modifuser=new LinkModifuser(this));
      setSelect(mySparams);
      }
    
    // Fin declaraciones globales
    // Controles
    public CtrlParvariable parvariable;
    public CtrlPardesc pardesc;
    public CtrlVvalordefault vvalordefault;
    public CtrlVvalordp vvalordp;
    public CtrlVvaloruser vvaloruser;
    // Acciones
    public LinkModifdp modifdp;
    public LinkModifuser modifuser;
    class Location extends LocationSplit
      {
      public Location( )
        {
        super();
        }
      }
      
    public class CtrlParvariable extends ColumnEdit
      {
      public CtrlParvariable(Form form)
        {
        super(form);
        setName("parvariable");
        setTitle("Variable");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(sparams.parvariable);
        }
      }
      
    public class CtrlPardesc extends ColumnEdit
      {
      public CtrlPardesc(Form form)
        {
        super(form);
        setName("pardesc");
        setTitle("Descripción");
        setType(STRING);
        setLength(80);
        setPrintable(false);
        setField(sparams.pardesc);
        }
      }
      
    public class CtrlVvalordefault extends ColumnEdit
      {
      public CtrlVvalordefault(Form form)
        {
        super(form);
        setName("vvalordefault");
        setMessageHelp("Valor por Defecto GEyCE");
        setTitle("Valor Defecto");
        setType(STRING);
        setLength(90);
        setPrintable(false);
        }
      }
      
    public class CtrlVvalordp extends ColumnEdit
      {
      public CtrlVvalordp(Form form)
        {
        super(form);
        setName("vvalordp");
        setTitle("Valor Despacho");
        setType(STRING);
        setLength(90);
        setPrintable(false);
        }
      }
      
    public class CtrlVvaloruser extends ColumnEdit
      {
      public CtrlVvaloruser(Form form)
        {
        super(form);
        setName("vvaloruser");
        setTitle("Valor Usuario");
        setType(STRING);
        setLength(90);
        setPrintable(false);
        }
      }
      
    public class LinkModifdp extends Action
      {
      public LinkModifdp(Form form)
        {
        super(form);
        setName("modifdp");
        setTitle("&1. Modificar Valor Despacho");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        vmodif.isUser=false;
        vmodif.vvvariable.setValue( ((Sparams)getSelects()[0]).parvariable.getString()  );
        vmodif.vvdescrip.setValue( ((Sparams)getSelects()[0]).pardesc.getString() );
        if (!vvalordp.isNull() && vvalordp.getString().trim().length()>0)  {
          vmodif.vvvalorant.setValue( vvalordp.getString() );
          vmodif.vvalor.setValue( vvalordp.getString() );
          }
        else {
          vmodif.vvvalorant.setValue( vvalordefault.getString() );       
          vmodif.vvalor.setValue( vvalordefault.getString() );       
          }
        
        vmodif.usuario=vusuarios.vvusuario.getString();
        vmodif.ambito=((Sparams)getSelects()[0]).parambito.getString();
        if ( !((Sparams)getSelects()[0]).partipo.isNull()   ) 
          vmodif.tipo=((Sparams)getSelects()[0]).partipo.getString();
        if ( !((Sparams)getSelects()[0]).paragrup.isNull() )  
          vmodif.agrup=((Sparams)getSelects()[0]).paragrup.getString();
        if ( !((Sparams)getSelects()[0]).parespecific.isNull() ) 
          vmodif.especific=((Sparams)getSelects()[0]).parespecific.getString();
        vmodif.open();
        if ( vmodif.okproces ) {
          vvalordp.setValue(vmodif.vvalor.getString());
          vmodif.vvalor.setNull();
          vmodif.okproces=false;
          vmodif.usuario=null;
          vmodif.ambito=null;
          vmodif.tipo=null;
          vmodif.agrup=null;
          vmodif.especific=null;
          }
        }
      }
      
    public class LinkModifuser extends Action
      {
      public LinkModifuser(Form form)
        {
        super(form);
        setName("modifuser");
        setTitle("&2. Modificar Valor Usuario");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        vmodif.isUser=true;
        vmodif.vvvariable.setValue( ((Sparams)getSelects()[0]).parvariable.getString());
        vmodif.vvdescrip.setValue( ((Sparams)getSelects()[0]).pardesc.getString());
        
        if ( !vvaloruser.isNull() ) {
          vmodif.vvvalorant.setValue(vvaloruser.getString());
          vmodif.vvalor.setValue(vvaloruser.getString());
          }
        else {
          if ( !vvalordp.isNull()) {
            vmodif.vvvalorant.setValue(vvalordp.getString());       
            vmodif.vvalor.setValue(vvalordp.getString());       
            }
          else {
            vmodif.vvvalorant.setValue(vvalordefault.getString());       
            vmodif.vvalor.setValue(vvalordefault.getString());       
            }
          }
        
        vmodif.usuario=vusuarios.vvusuario.getString();
        vmodif.ambito=((Sparams)getSelects()[0]).parambito.getString();
        if ( !((Sparams)getSelects()[0]).partipo.isNull()   ) 
          vmodif.tipo=((Sparams)getSelects()[0]).partipo.getString();
        if ( !((Sparams)getSelects()[0]).paragrup.isNull() )  
          vmodif.agrup=((Sparams)getSelects()[0]).paragrup.getString();
        if ( !((Sparams)getSelects()[0]).parespecific.isNull() ) 
          vmodif.especific=((Sparams)getSelects()[0]).parespecific.getString();
        vmodif.open();
        if ( vmodif.okproces ) {
          vvaloruser.setValue(vmodif.vvalor.getString());
          vmodif.vvalor.setNull();
          vmodif.okproces=false;
          vmodif.usuario=null;
          vmodif.ambito=null;
          vmodif.tipo=null;
          vmodif.agrup=null;
          vmodif.especific=null;
          }
        }
      }
      
    public FormVparams(ProgPrparams prparams)
      {
      super(prparams);
      setName("vparams");
      setLocation(new Location());
      setStates(SHOW);
      setPrintable(false);
      addSelect(sparams=new Sparams());
      addSelect(svalues=new Svalues());
      addControl(parvariable=new CtrlParvariable(this));
      addControl(pardesc=new CtrlPardesc(this));
      addControl(vvalordefault=new CtrlVvalordefault(this));
      addControl(vvalordp=new CtrlVvalordp(this));
      addControl(vvaloruser=new CtrlVvaloruser(this));
      addAction(modifdp=new LinkModifdp(this));
      addAction(modifuser=new LinkModifuser(this));
      setSelect(sparams);
      }
    public void onBeginRecord()
      {
      svalues.setWhere(" pardominio ='999999999999' And parusuario='ADMINGEYCE' And parvariable='"+parvariable.getString()+"'");
      svalues.execute();
      if ( !svalues.isEof() ) vvalordefault.setValue(Easp.cutrpad(svalues.parvalor.getString(),90).trim());
      else                    vvalordefault.setNull();
      
      svalues.setWhere(" pardominio ='"+paramDominio+"' And parusuario='ADMINGEYCE' And parvariable='"+parvariable.getString()+"'");
      svalues.execute();
      if ( !svalues.isEof() ) vvalordp.setValue(Easp.cutrpad(svalues.parvalor.getString(),90).trim());
      else                    vvalordp.setNull();
      
      svalues.setWhere(" pardominio ='"+paramDominio+"' And parusuario='"+vusuarios.vvusuario.getString()+"' And parvariable='"+parvariable.getString()+"'");
      svalues.execute();
      if ( !svalues.isEof() ) vvaloruser.setValue(Easp.cutrpad(svalues.parvalor.getString(),90).trim());
      else                    vvaloruser.setNull();
      
      if ( ((Sparams)getSelects()[0]).parespecific.getString().trim().equals("N") ) {
        modifdp.setVisible(false);
        modifuser.setVisible(false);
        }
      else {
        if ( ((Sparams)getSelects()[0]).parespecific.getString().trim().equals("D") ) {
          modifdp.setVisible(true);
          modifuser.setVisible(false);
          }
        else {
          modifdp.setVisible(true);
          modifuser.setVisible(true);
          }
        }
      
      super.onBeginRecord();
      }
    }
    
  // Parametros
  public class Sparams extends Select
    {
    // Tablas
    public Parametros parametros;
    // Campos
    public Field paragrup;
    public Field parambito;
    public Field pardesc;
    public Field parespecific;
    public Field partipo;
    public Field parvariable;
    class Parametros extends Table
      {
      public Parametros(Select select)
        {
        super(select);
        setName("parametros");
        setOptions(READ);
        }
      }
      
    public Sparams()
      {
      setName("sparams");
      addTable(parametros=new Parametros(this));
      addField(paragrup=new Field(this,parametros,"paragrup"));
      addField(parambito=new Field(this,parametros,"parambito"));
      addField(pardesc=new Field(this,parametros,"pardesc"));
      addField(parespecific=new Field(this,parametros,"parespecific"));
      addField(partipo=new Field(this,parametros,"partipo"));
      addField(parvariable=new Field(this,parametros,"parvariable"));
      }
    public String getWhere()
      {
      String strWhere=null;
      if ( paramAplic !=null ) strWhere = " paragrup = '"+paramAplic+"' ";
      return strWhere;
      }
    }
    
  // Select para obtener los valores de las variables
  public class Svalues extends Select
    {
    // Tablas
    public Parametros parametros;
    // Campos
    public Field paragrup;
    public Field parambito;
    public Field pardesc;
    public Field pardominio;
    public Field parespecific;
    public Field partipo;
    public Field parusuario;
    public Field parvalor;
    public Field parvariable;
    class Parametros extends Table
      {
      public Parametros(Select select)
        {
        super(select);
        setName("parametros");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Svalues()
      {
      setName("svalues");
      addTable(parametros=new Parametros(this));
      addField(paragrup=new Field(this,parametros,"paragrup"));
      addField(parambito=new Field(this,parametros,"parambito"));
      addField(pardesc=new Field(this,parametros,"pardesc"));
      addField(pardominio=new Field(this,parametros,"pardominio"));
      addField(parespecific=new Field(this,parametros,"parespecific"));
      addField(partipo=new Field(this,parametros,"partipo"));
      addField(parusuario=new Field(this,parametros,"parusuario"));
      addField(parvalor=new Field(this,parametros,"parvalor"));
      addField(parvariable=new Field(this,parametros,"parvariable"));
      }
    }
    
  public class FormVmodif extends ProcessForm
    {
    // Inicio declaraciones globales
    boolean isUser=false;
    String usuario=null;
    String ambito=null;
    String tipo=null;
    String agrup=null;
    String especific=null;
    boolean okproces=false;
    // Fin declaraciones globales
    // Controles
    public CtrlVvvariable vvvariable;
    public CtrlVvdescrip vvdescrip;
    public CtrlVvvalorant vvvalorant;
    public CtrlVvalor vvalor;
    // Acciones
    public LinkBtaceptar btaceptar;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(775);
        setHeight(200);
        setTitle("Modificar Valor");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVvvariable extends ControlEdit
      {
      public CtrlVvvariable(Form form)
        {
        super(form);
        setName("vvvariable");
        setTitle("Parámetro");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvdescrip extends ControlEdit
      {
      public CtrlVvdescrip(Form form)
        {
        super(form);
        setName("vvdescrip");
        setTitle("Descripción");
        setType(STRING);
        setLength(80);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvvalorant extends ControlEdit
      {
      public CtrlVvvalorant(Form form)
        {
        super(form);
        setName("vvvalorant");
        setTitle("Valor Anterior");
        setType(STRING);
        setLength(90);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvalor extends ControlEdit
      {
      public CtrlVvalor(Form form)
        {
        super(form);
        setName("vvalor");
        setTitle("Nuevo Valor");
        setType(STRING);
        setLength(90);
        setPrintable(false);
        }
      public boolean  valid()
        {
        boolean isValid=true;
        try {
          if ( tipo!=null && tipo.trim().equals("N") ) {
            if ( isValidNumber(getString()) ) isValid = true;
           else isValid = false;
            }
          else isValid = true;
          }
        catch (Exception e) {
          isValid = true ;
          }
        // Easp.chivato("isValid : "+isValid,1);
        return isValid;
        
        }
      }
      
    public class LinkBtaceptar extends Action
      {
      public LinkBtaceptar(Form form)
        {
        super(form);
        setName("btaceptar");
        setTitle("&1. Aceptar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        String strWhere=null;
        String vxuser=null;
        if ( isUser ) {
          strWhere = " parvariable='"+vvvariable.getString()+"' And pardominio= '"+paramDominio+"' And parusuario ='"+usuario+"'";
          vxuser = vusuarios.vvusuario.getString();
          }
        else {
          strWhere = " parvariable='"+vvvariable.getString()+"' And pardominio= '"+paramDominio+"' And parusuario ='ADMINGEYCE'";
          vxuser = "ADMINGEYCE";
          }
        svalues.setWhere(strWhere);
        svalues.execute();
        if ( svalues.isEof() ) {
          if ( vvalor!=null && !vvalor.getString().trim().equals("") ) {
            svalues.addNew();
            svalues.pardominio.setValue(paramDominio);
            svalues.parusuario.setValue(vxuser);
            svalues.parambito.setValue(ambito);
            svalues.parvariable.setValue(vvvariable);
            svalues.pardesc.setValue(vvdescrip);
            svalues.partipo.setValue(tipo);
            svalues.paragrup.setValue(agrup);
            svalues.parvalor.setValue(vvalor);
            svalues.parespecific.setValue(especific);
            svalues.save();
            }
          }
        else {
          if ( vvalor!=null && !vvalor.getString().trim().equals("") ) {
            svalues.edit();
            svalues.parvalor.setValue(vvalor);
            svalues.save();
            }
          else {
            svalues.delete();
            }
          }
        
        okproces=true;
        svalues.commit();
        vmodif.exit();
        }
      }
      
    public FormVmodif(ProgPrparams prparams)
      {
      super(prparams);
      setName("vmodif");
      setTitle("Modificar Valor");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addControl(vvvariable=new CtrlVvvariable(this));
      addControl(vvdescrip=new CtrlVvdescrip(this));
      addControl(vvvalorant=new CtrlVvvalorant(this));
      addControl(vvalor=new CtrlVvalor(this));
      addAction(btaceptar=new LinkBtaceptar(this));
      }
    }
    
  public ProgPrparams()
    {
    this.prparams=this;
    setName("prparams");
    setTitle("Parámetros");
    setLayout(new LayoutSplit(LayoutSplit.VERTICAL,0.15));
    setLocation(new Location());
    addForm(vusuarios=new FormVusuarios(this));
    addForm(vparams=new FormVparams(this));
    addForm(vmodif=new FormVmodif(this));
    }
  public ProgPrparams(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    if ( paramConn !=null ) {
      DBConnection newConn = new DBConnection(paramConn.getDB());
      newConn.connect();
      setConnection(newConn);
      }
    if ( paramDominio == null ) paramDominio = Easp.dominio ;
    ControlPanel cp=new ControlPanel(this);
    cp.setLocation(new LocationSplit(LocationSplit.BOTTOM));
    cp.setLayout(new LayoutTabbed());
    LocationTabbed loc;
    sambitos.setDistinct(true);
    if ( paramAplic != null ) sambitos.setWhere("paragrup = '"+paramAplic+"' ");
    sambitos.execute();
    if ( !sambitos.isEof() ) {
      int numAmbit = 0;
      loc=new LocationTabbed();      //primera pestaña
      loc.setTitle(sambitos.parambito.getString());
      loc.setExitIcon(false);
      vparams.numAmbit = 0  ;
      vparams.setLocation(loc);
      vparams.setModal(false);
      vparams.setParent(cp);
    
      java.util.Vector vecVparams = new java.util.Vector();
      sambitos.next();
      while ( !sambitos.isEof() ) {  // siguientes  pestaña
        FormVparams formVparams =  new FormVparams(this,new Sparams()) ;
        vecVparams.addElement(formVparams);
        addForm((FormVparams)vecVparams.elementAt(numAmbit));
        ((FormVparams)vecVparams.elementAt(numAmbit)).numAmbit = numAmbit+1;
    
        loc=new LocationTabbed();
        loc.setTitle(sambitos.parambito.getString());
        loc.setExitIcon(false);
        ((FormVparams)vecVparams.elementAt(numAmbit)).setLocation(loc);
        ((FormVparams)vecVparams.elementAt(numAmbit)).setModal(false);
        ((FormVparams)vecVparams.elementAt(numAmbit)).setParent(cp);
    
        numAmbit++;
        sambitos.next();
        }
      super.onInit();
      }
    else 
      Maefc.message("No se ha encontrado ningún parámetro","Atención !!");
    }
  public void onExit()
    {
    //if ( paramConn != null ) paramConn.disconnect();
    super.onExit();
    }
  }
  
