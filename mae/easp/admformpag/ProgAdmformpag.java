// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:58
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.admformpag;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: admformpag
// Nombre:   Formatos de página
// Versión:  1.0
// 
public class ProgAdmformpag extends Program
  {
  public AppEasp easp;
  public ProgAdmformpag admformpag;
  // Ventana
  public FormVformpag vformpag;
  // Selects
  public Simpage simpage;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Formatos de página");
      }
    }
    
  public class FormVformpag extends MonoDataForm
    {
    // Controles
    public CtrlPanombre panombre;
    public CtrlPadesc padesc;
    public CtrlPaancho paancho;
    public CtrlPaalto paalto;
    public CtrlPamargeno pamargeno;
    public CtrlPamargenn pamargenn;
    public CtrlPamargene pamargene;
    public CtrlPamargens pamargens;
    public CtrlPacol pacol;
    public CtrlPalin palin;
    public CtrlPasepcol pasepcol;
    public CtrlPaseplin paseplin;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        }
      }
      
    public class CtrlPanombre extends ControlEdit
      {
      public CtrlPanombre(Form form)
        {
        super(form);
        setName("panombre");
        setMessageHelp("Nombre del formato");
        setTitle("Nombre");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setPrintable(false);
        setField(simpage.panombre);
        }
      }
      
    public class CtrlPadesc extends ControlEdit
      {
      public CtrlPadesc(Form form)
        {
        super(form);
        setName("padesc");
        setMessageHelp("Descripción del formato");
        setTitle("Descripcion");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(simpage.padesc);
        }
      }
      
    public class CtrlPaancho extends ControlEdit
      {
      public CtrlPaancho(Form form)
        {
        super(form);
        setName("paancho");
        setMessageHelp("Ancho de la página (en milímetros)");
        setTitle("Ancho (mm)");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        setField(simpage.paancho);
        }
      }
      
    public class CtrlPaalto extends ControlEdit
      {
      public CtrlPaalto(Form form)
        {
        super(form);
        setName("paalto");
        setMessageHelp("Alto de la página (en milímetros)");
        setTitle("Alto (mm)");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        setField(simpage.paalto);
        }
      }
      
    public class CtrlPamargeno extends ControlEdit
      {
      public CtrlPamargeno(Form form)
        {
        super(form);
        setName("pamargeno");
        setTitle("Margen izquierdo (mm)");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        setField(simpage.pamargeno);
        }
      }
      
    public class CtrlPamargenn extends ControlEdit
      {
      public CtrlPamargenn(Form form)
        {
        super(form);
        setName("pamargenn");
        setTitle("Margen superior (mm)");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        setField(simpage.pamargenn);
        }
      }
      
    public class CtrlPamargene extends ControlEdit
      {
      public CtrlPamargene(Form form)
        {
        super(form);
        setName("pamargene");
        setTitle("Margen derecho (mm)");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        setField(simpage.pamargene);
        }
      }
      
    public class CtrlPamargens extends ControlEdit
      {
      public CtrlPamargens(Form form)
        {
        super(form);
        setName("pamargens");
        setTitle("Margen inferior (mm)");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        setField(simpage.pamargens);
        }
      }
      
    public class CtrlPacol extends ControlEdit
      {
      public CtrlPacol(Form form)
        {
        super(form);
        setName("pacol");
        setTitle("Nº columnas");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        setField(simpage.pacol);
        }
      }
      
    public class CtrlPalin extends ControlEdit
      {
      public CtrlPalin(Form form)
        {
        super(form);
        setName("palin");
        setTitle("Nº líneas");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        setField(simpage.palin);
        }
      }
      
    public class CtrlPasepcol extends ControlEdit
      {
      public CtrlPasepcol(Form form)
        {
        super(form);
        setName("pasepcol");
        setMessageHelp("Separación entre columnas (en milímetros)");
        setTitle("Separación columnas (mm)");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        setField(simpage.pasepcol);
        }
      }
      
    public class CtrlPaseplin extends ControlEdit
      {
      public CtrlPaseplin(Form form)
        {
        super(form);
        setName("paseplin");
        setMessageHelp("Separación entre líneas (en milímetros)");
        setTitle("Separación líneas (mm)");
        setType(INTEGER);
        setLength(4);
        setPrintable(false);
        setField(simpage.paseplin);
        }
      }
      
    public FormVformpag(ProgAdmformpag admformpag)
      {
      super(admformpag);
      setName("vformpag");
      setTitle("Formatos de página");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
      addSelect(simpage=new Simpage());
      addControl(panombre=new CtrlPanombre(this));
      addControl(padesc=new CtrlPadesc(this));
      addControl(paancho=new CtrlPaancho(this));
      addControl(paalto=new CtrlPaalto(this));
      addControl(pamargeno=new CtrlPamargeno(this));
      addControl(pamargenn=new CtrlPamargenn(this));
      addControl(pamargene=new CtrlPamargene(this));
      addControl(pamargens=new CtrlPamargens(this));
      addControl(pacol=new CtrlPacol(this));
      addControl(palin=new CtrlPalin(this));
      addControl(pasepcol=new CtrlPasepcol(this));
      addControl(paseplin=new CtrlPaseplin(this));
      setSelect(simpage);
      }
    }
    
  // Selección de formatos página
  public class Simpage extends Select
    {
    // Tablas
    public Impage impage;
    // Campos
    public Field paalto;
    public Field paancho;
    public Field pacol;
    public Field padesc;
    public Field palin;
    public Field pamargene;
    public Field pamargenn;
    public Field pamargeno;
    public Field pamargens;
    public Field panombre;
    public Field pasepcol;
    public Field paseplin;
    class Impage extends Table
      {
      public Impage(Select select)
        {
        super(select);
        setName("impage");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Simpage()
      {
      setName("simpage");
      addTable(impage=new Impage(this));
      addField(paalto=new Field(this,impage,"paalto"));
      addField(paancho=new Field(this,impage,"paancho"));
      addField(pacol=new Field(this,impage,"pacol"));
      addField(padesc=new Field(this,impage,"padesc"));
      addField(palin=new Field(this,impage,"palin"));
      addField(pamargene=new Field(this,impage,"pamargene"));
      addField(pamargenn=new Field(this,impage,"pamargenn"));
      addField(pamargeno=new Field(this,impage,"pamargeno"));
      addField(pamargens=new Field(this,impage,"pamargens"));
      addField(panombre=new Field(this,impage,"panombre"));
      addField(pasepcol=new Field(this,impage,"pasepcol"));
      addField(paseplin=new Field(this,impage,"paseplin"));
      }
    }
    
  public ProgAdmformpag(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.admformpag=this;
    setName("admformpag");
    setTitle("Formatos de página");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vformpag=new FormVformpag(this));
    }
  public ProgAdmformpag()
    {
    this((AppEasp) Aplication.getAplication());
    }
  }
  
