// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20150512
// Hora:             16:32:23
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.usdesbloquearse;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: usdesbloquearse
// Nombre:   Desbloquear Sesiones
// Versión:  1.0
// 
public class ProgUsdesbloquearse extends Program
  {
  public AppEasp easp;
  public ProgUsdesbloquearse usdesbloquearse;
  // Ventana
  public FormVdesbloquear vdesbloquear;
  // Selects
  public Simpuser simpuser;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Desbloquear Sesiones");
      }
    }
    
  public class FormVdesbloquear extends ProcessForm
    {
    // Controles
    public CtrlVvaleatorio vvaleatorio;
    public CtrlVvclave vvclave;
    // Acciones
    public LinkAcdesbloquar acdesbloquar;
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
      
    public class CtrlVvaleatorio extends ControlEdit
      {
      public CtrlVvaleatorio(Form form)
        {
        super(form);
        setName("vvaleatorio");
        setTitle("Clave control");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvclave extends ControlEdit
      {
      public CtrlVvclave(Form form)
        {
        super(form);
        setName("vvclave");
        setTitle("Clave desbloqueo");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      }
      
    public class LinkAcdesbloquar extends Action
      {
      public LinkAcdesbloquar(Form form)
        {
        super(form);
        setName("acdesbloquar");
        setTitle("&1. Desbloquear.");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        String clave = "1"+String.valueOf(( vvaleatorio.getInteger() + Integer.parseInt(Fecha.fechaGregoriana(Maefc.getDate())))  - 13 ) +"3" ;
        
        // System.out.println("Clave: ["+clave+"]");
        
        
        if ( vvclave.getString().equals(clave) ) {
          
          simpuser.execute();
          while ( !simpuser.isEof() ) {
            simpuser.delete();
            simpuser.next();
            }
           simpuser.commit();
           Maefc.message("Proceso finalizado") ;
           usdesbloquearse.exit();
          }
        else {
          Maefc.message("Clave Incorrecta") ;
          }
        }
      }
      
    public FormVdesbloquear(ProgUsdesbloquearse usdesbloquearse)
      {
      super(usdesbloquearse);
      setName("vdesbloquear");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      addSelect(simpuser=new Simpuser());
      addControl(vvaleatorio=new CtrlVvaleatorio(this));
      addControl(vvclave=new CtrlVvclave(this));
      addAction(acdesbloquar=new LinkAcdesbloquar(this));
      }
    }
    
  // 
  public class Simpuser extends Select
    {
    // Tablas
    public Impuser impuser;
    // Campos
    public Field imuaplicacion;
    public Field imucodigo;
    public Field imufecha;
    public Field imuhora;
    public Field imumachine;
    public Field imuusuario;
    class Impuser extends Table
      {
      public Impuser(Select select)
        {
        super(select);
        setName("impuser");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Simpuser()
      {
      setName("simpuser");
      addTable(impuser=new Impuser(this));
      addField(imuaplicacion=new Field(this,impuser,"imuaplicacion"));
      addField(imucodigo=new Field(this,impuser,"imucodigo"));
      addField(imufecha=new Field(this,impuser,"imufecha"));
      addField(imuhora=new Field(this,impuser,"imuhora"));
      addField(imumachine=new Field(this,impuser,"imumachine"));
      addField(imuusuario=new Field(this,impuser,"imuusuario"));
      }
    }
    
  public ProgUsdesbloquearse(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.usdesbloquearse=this;
    setName("usdesbloquearse");
    setTitle("Desbloquear Sesiones");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vdesbloquear=new FormVdesbloquear(this));
    }
  public ProgUsdesbloquearse()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    
    vdesbloquear.vvaleatorio.setValue(Numero.format( ((int)(Math.random()*1000000)),"0000000") ) ;
    vdesbloquear.vvclave.setPassword(true);
    
    super.onInit();
    
    }
  }
  
