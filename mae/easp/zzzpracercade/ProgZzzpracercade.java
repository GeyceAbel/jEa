// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20130404
// Hora:             16:11:54
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.zzzpracercade;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: zzzpracercade
// Nombre:   Acerca de Entorno Aplicaciones-ASP
// Versión:  1.0
// 
public class ProgZzzpracercade extends Program
  {
  public AppEasp easp;
  public ProgZzzpracercade zzzpracercade;
  // Ventana
  public FormVentana ventana;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Acerca de Entorno Aplicaciones-ASP");
      }
    }
    
  public class FormVentana extends ProcessForm
    {
    // Controles
    public CtrlVvverapp vvverapp;
    public CtrlVvverfecha vvverfecha;
    public CtrlVvverbd vvverbd;
    public CtrlVvverjedi vvverjedi;
    public CtrlVvverjava vvverjava;
    // Acciones
    public LinkSalir salir;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(430);
        setHeight(360);
        setTitle("Acerca de Conta-ASP");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVvverapp extends ControlEdit
      {
      public CtrlVvverapp(Form form)
        {
        super(form);
        setName("vvverapp");
        setTitle("");
        setType(STRING);
        setLength(20);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvverfecha extends ControlEdit
      {
      public CtrlVvverfecha(Form form)
        {
        super(form);
        setName("vvverfecha");
        setTitle("");
        setType(STRING);
        setLength(20);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvverbd extends ControlEdit
      {
      public CtrlVvverbd(Form form)
        {
        super(form);
        setName("vvverbd");
        setTitle("");
        setType(STRING);
        setLength(20);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvverjedi extends ControlEdit
      {
      public CtrlVvverjedi(Form form)
        {
        super(form);
        setName("vvverjedi");
        setTitle("");
        setType(STRING);
        setLength(10);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvverjava extends ControlEdit
      {
      public CtrlVvverjava(Form form)
        {
        super(form);
        setName("vvverjava");
        setTitle("");
        setType(STRING);
        setLength(10);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class LinkSalir extends Action
      {
      public LinkSalir(Form form)
        {
        super(form);
        setName("salir");
        setTitle("&Salir");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        ventana.exit();
        zzzpracercade.exit();
        }
      }
      
    public FormVentana(ProgZzzpracercade zzzpracercade)
      {
      super(zzzpracercade);
      setName("ventana");
      setTitle("Acerca de Conta-ASP");
      setLayout(new LayoutFlow(LayoutFlow.CENTER));
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addControl(vvverapp=new CtrlVvverapp(this));
      addControl(vvverfecha=new CtrlVvverfecha(this));
      addControl(vvverbd=new CtrlVvverbd(this));
      addControl(vvverjedi=new CtrlVvverjedi(this));
      addControl(vvverjava=new CtrlVvverjava(this));
      addAction(salir=new LinkSalir(this));
      }
    public void onInit()
      {
      vvverapp.setValue(Easp.versionAplicacion);
      vvverfecha.setValue(Easp.versionFecha);
      vvverbd.setValue(Easp.getVersionBD("bdeasp"));
      vvverjedi.setValue(JediFC.getVersion());
      vvverjava.setValue(java.lang.System.getProperty("java.version"));
      super.onInit();
      }
    }
    
  public ProgZzzpracercade(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.zzzpracercade=this;
    setName("zzzpracercade");
    setTitle("Acerca de Entorno Aplicaciones-ASP");
    setLayout(new LayoutBorder());
    setLocation(new Location());
    addForm(ventana=new FormVentana(this));
    }
  public ProgZzzpracercade()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    //ventana.setLayout(new LayoutVScroll());
    ventana.setLayout(new LayoutHtml("mae/easp/html/acerca.html"));
    ventana.open();
    }
  }
  
