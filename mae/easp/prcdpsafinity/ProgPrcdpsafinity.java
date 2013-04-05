// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20130405
// Hora:             10:39:03
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prcdpsafinity;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prcdpsafinity
// Nombre:   Clientes AfinityWeb
// Versión:  1.0
// 
public class ProgPrcdpsafinity extends Program
  {
  public AppEasp easp;
  public ProgPrcdpsafinity prcdpsafinity;
  // Ventana
  public FormVcdps vcdps;
  // Selects
  public Scdp scdp;
  public Scdpea scdpea;
  // Ventana
  public FormVcontrasena vcontrasena;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Clientes AfinityWeb");
      }
    }
    
  public class FormVcdps extends MultiDataForm
    {
    // Controles
    public CtrlDatcodigo datcodigo;
    public CtrlDatnifcif datnifcif;
    public CtrlDatapell1 datapell1;
    public CtrlDatapell2 datapell2;
    public CtrlDatnombre datnombre;
    // Acciones
    public LinkAccontrasena accontrasena;
    public LinkAccrearclientes accrearclientes;
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
      
    public class CtrlDatcodigo extends ColumnEdit
      {
      public CtrlDatcodigo(Form form)
        {
        super(form);
        setName("datcodigo");
        setTitle("Código");
        setType(STRING);
        setMaskInput("U");
        setLength(12);
        setSearchable(true);
        setEnabled(false);
        setField(scdp.datcodigo);
        }
      }
      
    public class CtrlDatnifcif extends ColumnEdit
      {
      public CtrlDatnifcif(Form form)
        {
        super(form);
        setName("datnifcif");
        setTitle("NIF-CIF");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setEnabled(false);
        setField(scdp.datnifcif);
        }
      }
      
    public class CtrlDatapell1 extends ColumnEdit
      {
      public CtrlDatapell1(Form form)
        {
        super(form);
        setName("datapell1");
        setTitle("Razon - Apellido 1");
        setType(STRING);
        setLength(60);
        setSearchable(true);
        setField(scdp.datapell1);
        }
      }
      
    public class CtrlDatapell2 extends ColumnEdit
      {
      public CtrlDatapell2(Form form)
        {
        super(form);
        setName("datapell2");
        setTitle("Apellido2");
        setType(STRING);
        setLength(25);
        setSearchable(true);
        setField(scdp.datapell2);
        }
      }
      
    public class CtrlDatnombre extends ColumnEdit
      {
      public CtrlDatnombre(Form form)
        {
        super(form);
        setName("datnombre");
        setTitle("Nombre");
        setType(STRING);
        setLength(20);
        setSearchable(true);
        setField(scdp.datnombre);
        }
      }
      
    public class LinkAccontrasena extends Action
      {
      public LinkAccontrasena(Form form)
        {
        super(form);
        setName("accontrasena");
        setTitle("&1. Contraseña");
        setOptions(SHOW);
        }
      public void onAction()
        {
        
        super.onAction();
        
        Selector susuario = new Selector(scdp.getDataBase());
        susuario.execute("Select  uscodigo,usalias,uspwd from usuario where uscodigo = '"+scdp.datcodigo.getString()+"'");
        if ( susuario.next() ) vcontrasena.vvcontrasena.setValue(susuario.getString("uspwd"));
        else                   vcontrasena.vvcontrasena.setNull();
        susuario.close();
        
        
        vcontrasena.open();
        }
      }
      
    public class LinkAccrearclientes extends Action
      {
      public LinkAccrearclientes(Form form)
        {
        super(form);
        setName("accrearclientes");
        setTitle("&2. Alta  Clientes en AfinityWeb");
        setOptions(SHOW);
        }
      public void onAction()
        {
        
        String msg = "Este proceso creará en AfinityWeb todas las empresas del entorno que aun no existan como Clientes en AfinityWeb  \n \n   ¿ Desea continuar ? " ;
        if ( Maefc.message(msg,"Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION ) {
          scdpea.setDistinct(true);
          scdpea.setOrder("cdpnifcif");
          scdpea.setWhere("cdpdominio = '"+Easp.dominio+"'");
          scdpea.execute();
          int cont = 0 ;
          while ( !scdpea.isEof() ) {
            String cdpcdpcdp =Easp.buscaCDP(scdpea.cdpnifcif.getString());
            if ( cdpcdpcdp==null ) {
              Easp.grabarDatosAfinity(scdpea.cdpnifcif.getString(),false);
              cont++;
              }
            scdpea.next();
            }
          vcdps.doShow();
          Maefc.message("Proceso finalizado se han creado: "+cont+" clientes en AfinityWeb","Atención",Maefc.INFORMATION_MESSAGE);
          }
        
        
        
        }
      }
      
    public FormVcdps(ProgPrcdpsafinity prcdpsafinity)
      {
      super(prcdpsafinity);
      setName("vcdps");
      setLocation(new Location());
      setStates(SHOW | SEARCH | UPDATE);
      addSelect(scdp=new Scdp());
      addSelect(scdpea=new Scdpea());
      addControl(datcodigo=new CtrlDatcodigo(this));
      addControl(datnifcif=new CtrlDatnifcif(this));
      addControl(datapell1=new CtrlDatapell1(this));
      addControl(datapell2=new CtrlDatapell2(this));
      addControl(datnombre=new CtrlDatnombre(this));
      addAction(accontrasena=new LinkAccontrasena(this));
      addAction(accrearclientes=new LinkAccrearclientes(this));
      setSelect(scdp);
      }
    public void onBeginRecord()
      {
      
      /*
      Selector susuario = new Selector(scdp.getDataBase());
      susuario.execute("Select  uscodigo,usalias,uspwd from usuario where uscodigo = '"+scdp.datcodigo.getString()+"'");
      if ( susuario.next() ) vvcontraseña.setValue(susuario.getString("uspwd"));
      else                   vvcontraseña.setNull();
      susuario.close();
      */
      
      super.onBeginRecord();
      
      
      
      }
    }
    
  // 
  public class Scdp extends Select
    {
    // Tablas
    public Datgen datgen;
    // Campos
    public Field datapell1;
    public Field datapell2;
    public Field datcodigo;
    public Field datcontacto;
    public Field datemail;
    public Field datfisicajuri;
    public Field datipo;
    public Field datnifcif;
    public Field datnombre;
    public Field dattel;
    class Datgen extends Table
      {
      public Datgen(Select select)
        {
        super(select);
        setName("datgen");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Scdp()
      {
      setName("scdp");
      addTable(datgen=new Datgen(this));
      addField(datapell1=new Field(this,datgen,"datapell1"));
      addField(datapell2=new Field(this,datgen,"datapell2"));
      addField(datcodigo=new Field(this,datgen,"datcodigo"));
      addField(datcontacto=new Field(this,datgen,"datcontacto"));
      addField(datemail=new Field(this,datgen,"datemail"));
      addField(datfisicajuri=new Field(this,datgen,"datfisicajuri"));
      addField(datipo=new Field(this,datgen,"datipo"));
      addField(datnifcif=new Field(this,datgen,"datnifcif"));
      addField(datnombre=new Field(this,datgen,"datnombre"));
      addField(dattel=new Field(this,datgen,"dattel"));
      }
    public String getWhere()
      {
      return "DATCODIGO Like '"+Easp.dominio.substring(0,6)+"%' and  datipo = 'C' " ;
      }
    public String getOrder()
      {
      return "datcodigo" ;
      }
    }
    
  // 
  public class Scdpea extends Select
    {
    // Tablas
    public Cdp cdp;
    // Campos
    public Field cdpdominio;
    public Field cdpnifcif;
    class Cdp extends Table
      {
      public Cdp(Select select)
        {
        super(select);
        setName("cdp");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Scdpea()
      {
      setName("scdpea");
      addTable(cdp=new Cdp(this));
      addField(cdpdominio=new Field(this,cdp,"cdpdominio"));
      addField(cdpnifcif=new Field(this,cdp,"cdpnifcif"));
      }
    }
    
  public class FormVcontrasena extends ProcessForm
    {
    // Controles
    public CtrlVvcontrasena vvcontrasena;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(450);
        setHeight(85);
        setTitle("Contraseña");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVvcontrasena extends ControlEdit
      {
      public CtrlVvcontrasena(Form form)
        {
        super(form);
        setName("vvcontrasena");
        setTitle("Contraseña");
        setType(STRING);
        setLength(20);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public FormVcontrasena(ProgPrcdpsafinity prcdpsafinity)
      {
      super(prcdpsafinity);
      setName("vcontrasena");
      setTitle("Contraseña");
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addControl(vvcontrasena=new CtrlVvcontrasena(this));
      }
    }
    
  public ProgPrcdpsafinity(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.prcdpsafinity=this;
    setName("prcdpsafinity");
    setTitle("Clientes AfinityWeb");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vcdps=new FormVcdps(this));
    addForm(vcontrasena=new FormVcontrasena(this));
    }
  public ProgPrcdpsafinity()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    
    if ( Easp.connAGPI == null ) {
      Easp.connAGPI = Easp.getConnAGPI();
      if ( ( Easp.connAGPI == null ) ) {
        Maefc.message("No ha sido posible conectar con el servidor Afinity","Atención",Maefc.ERROR_MESSAGE);
        return ;
        }
      }
    
    scdp.setDb(Easp.connAGPI);
    super.onInit();
    
    }
  }
  
