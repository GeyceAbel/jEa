// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:59
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.admimprdisp;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: admimprdisp
// Nombre:   Impresoras disponibles
// Versión:  1.3.1
// 
public class ProgAdmimprdisp extends Program
  {
  public AppEasp easp;
  public ProgAdmimprdisp admimprdisp;
  // Ventana
  public FormVimprdisp vimprdisp;
  // Selects
  public Simprdisp simprdisp;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Impresoras disponibles");
      }
    }
    
  public class FormVimprdisp extends MultiDataForm
    {
    // Inicio declaraciones globales
    public boolean altaEnGrupoTodas(){
      Select select=new Select(admimprdisp.getDataBase());
      Table impgrupo=new Table(select,"impgrupo");
      Field grcodcon=new Field(select,impgrupo,"grcodcon");
      Field grtipo=new Field(select,impgrupo,"grtipo");
      Field grimpre=new Field(select,impgrupo,"grimpre");
      Field grmodo=new Field(select,impgrupo,"grmodo");
      grcodcon.setValue(1);
      grtipo.setValue("TODAS");
      grimpre.setValue(imnombre);
      grmodo.setValue("L");
      return select.insert();
      }  
    
    public boolean borrarDeTodas(){
      Select select=new Select(admimprdisp.getDataBase());
      Table impgrupo=new Table(select,"impgrupo");
      Field grcodcon=new Field(select,impgrupo,"grcodcon");
      Field grtipo=new Field(select,impgrupo,"grtipo");
      Field grimpre=new Field(select,impgrupo,"grimpre");
      Field grmodo=new Field(select,impgrupo,"grmodo");
      select.setWhere("grcodcon=1 and grimpre="+
                      imnombre.getSQLFormat());
      select.execute();
      if (!select.isEof()) return select.delete();
      else return true;
      }
    // Fin declaraciones globales
    // Controles
    public CtrlImnombre imnombre;
    public CtrlImdesc imdesc;
    public CtrlImtipo imtipo;
    public CtrlImsysnom imsysnom;
    public CtrlImemul imemul;
    public CtrlImpage impage;
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
        }
      }
      
    public class CtrlImnombre extends ColumnEdit
      {
      public CtrlImnombre(Form form)
        {
        super(form);
        setName("imnombre");
        setMessageHelp("Nombre de impresora");
        setTitle("Nombre");
        setType(STRING);
        setProtect(true);
        setLength(80);
        setPrintable(false);
        setField(simprdisp.imnombre);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlImdesc extends ColumnEdit
      {
      public CtrlImdesc(Form form)
        {
        super(form);
        setName("imdesc");
        setMessageHelp("Descripción de la impresora");
        setTitle("Descripción");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(simprdisp.imdesc);
        }
      }
      
    public class CtrlImtipo extends ColumnComboBox
      {
      public CtrlImtipo(Form form)
        {
        super(form);
        setName("imtipo");
        setMessageHelp("Indica como hay que interpretar el campo impresora");
        setTitle("Tipo");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setPrintable(false);
        addItem("F/Fichero o dispositivo");
        addItem("E/Ejecutable");
        addItem("R/Impresión Remota");
        setField(simprdisp.imtipo);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlImsysnom extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(60);
          }
        }
        
      public CtrlImsysnom(Form form)
        {
        super(form);
        setLook(new Look());
        setName("imsysnom");
        setMessageHelp("Orden de ejecución o dispositivo");
        setTitle("Dispositivo");
        setType(STRING);
        setLength(255);
        setPrintable(false);
        setField(simprdisp.imsysnom);
        }
      }
      
    public class CtrlImemul extends ColumnComboBox
      {
      public mae.easp.general.pkemulaciones.PickPkemulaciones pickup;
      public CtrlImemul(Form form)
        {
        super(form);
        setName("imemul");
        setTitle("Emulacion");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pkemulaciones.PickPkemulaciones(this));
        setLength(15);
        setPrintable(false);
        setField(simprdisp.imemul);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlImpage extends ColumnComboBox
      {
      public mae.easp.general.pkpages.PickPkpages pickup;
      public CtrlImpage(Form form)
        {
        super(form);
        setName("impage");
        setTitle("Formato");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pkpages.PickPkpages(this));
        setLength(15);
        setPrintable(false);
        setField(simprdisp.impage);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVimprdisp(ProgAdmimprdisp admimprdisp)
      {
      super(admimprdisp);
      setName("vimprdisp");
      setTitle("Impresoras disponibles");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      addSelect(simprdisp=new Simprdisp());
      addControl(imnombre=new CtrlImnombre(this));
      addControl(imdesc=new CtrlImdesc(this));
      addControl(imtipo=new CtrlImtipo(this));
      addControl(imsysnom=new CtrlImsysnom(this));
      addControl(imemul=new CtrlImemul(this));
      addControl(impage=new CtrlImpage(this));
      setSelect(simprdisp);
      }
    public boolean onOkInsert()
      {
      if (super.onOkInsert())
        return altaEnGrupoTodas();
      else
        return false;
      }
    public boolean onOkDelete()
      {
      borrarDeTodas();
      if (super.onOkDelete()) 
        return true;
      else return false;
      
      
      }
    }
    
  // Seleccion de impresoras disponibles
  public class Simprdisp extends Select
    {
    // Tablas
    public Impresor impresor;
    // Campos
    public Field imcodcon;
    public Field imdesc;
    public Field imemul;
    public Field imnombre;
    public Field impage;
    public Field imsysnom;
    public Field imtipo;
    class Impresor extends Table
      {
      public Impresor(Select select)
        {
        super(select);
        setName("impresor");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        imcodcon.setValue(1);
        return super.onInsert();
        }
      }
      
    public Simprdisp()
      {
      setName("simprdisp");
      addTable(impresor=new Impresor(this));
      addField(imcodcon=new Field(this,impresor,"imcodcon"));
      addField(imdesc=new Field(this,impresor,"imdesc"));
      addField(imemul=new Field(this,impresor,"imemul"));
      addField(imnombre=new Field(this,impresor,"imnombre"));
      addField(impage=new Field(this,impresor,"impage"));
      addField(imsysnom=new Field(this,impresor,"imsysnom"));
      addField(imtipo=new Field(this,impresor,"imtipo"));
      }
    public String getWhere()
      {
      return "imcodcon=1";
      }
    }
    
  public ProgAdmimprdisp(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.admimprdisp=this;
    setName("admimprdisp");
    setTitle("Impresoras disponibles");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vimprdisp=new FormVimprdisp(this));
    }
  public ProgAdmimprdisp()
    {
    this((AppEasp) Aplication.getAplication());
    }
  }
  
