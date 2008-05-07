// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:03
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prfechas;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prfechas
// Nombre:   Empresas actuales por usuario
// Versión:  1.0
// 
public class ProgPrfechas extends Program
  {
  public AppEasp easp;
  public ProgPrfechas prfechas;
  // Ventana
  public FormVfechas vfechas;
  // Selects
  public Sfechas sfechas;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Empresas actuales por usuario");
      }
    }
    
  public class FormVfechas extends MultiDataForm
    {
    // Controles
    public CtrlFecdominio fecdominio;
    public CtrlFecusuario fecusuario;
    public CtrlFecctacli fecctacli;
    public CtrlFecctaejer fecctaejer;
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
        setAnchor(CENTER);
        }
      }
      
    public class CtrlFecdominio extends ColumnEdit
      {
      public CtrlFecdominio(Form form)
        {
        super(form);
        setName("fecdominio");
        setTitle("Dominio");
        setType(STRING);
        setLength(12);
        setPrintable(false);
        setField(sfechas.fecdominio);
        }
      }
      
    public class CtrlFecusuario extends ColumnEdit
      {
      public CtrlFecusuario(Form form)
        {
        super(form);
        setName("fecusuario");
        setTitle("Usuario");
        setType(STRING);
        setLength(20);
        setPrintable(false);
        setField(sfechas.fecusuario);
        }
      }
      
    public class CtrlFecctacli extends ColumnEdit
      {
      public CtrlFecctacli(Form form)
        {
        super(form);
        setName("fecctacli");
        setMessageHelp("Empresa de Contabilidad ASP");
        setTitle("Empresa Conta");
        setType(INTEGER);
        setLength(10);
        setPrintable(false);
        setField(sfechas.fecctacli);
        }
      }
      
    public class CtrlFecctaejer extends ColumnEdit
      {
      public CtrlFecctaejer(Form form)
        {
        super(form);
        setName("fecctaejer");
        setMessageHelp("Ejercicio Contable");
        setTitle("Ejercicio");
        setType(INTEGER);
        setLength(10);
        setPrintable(false);
        setField(sfechas.fecctaejer);
        }
      }
      
    public FormVfechas(ProgPrfechas prfechas)
      {
      super(prfechas);
      setName("vfechas");
      setTitle("Usuarios por Aplicaciones y Empresas");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      addSelect(sfechas=new Sfechas());
      addControl(fecdominio=new CtrlFecdominio(this));
      addControl(fecusuario=new CtrlFecusuario(this));
      addControl(fecctacli=new CtrlFecctacli(this));
      addControl(fecctaejer=new CtrlFecctaejer(this));
      setSelect(sfechas);
      }
    }
    
  // 
  public class Sfechas extends Select
    {
    // Tablas
    public Fechas fechas;
    // Campos
    public Field fecctacli;
    public Field fecctaejer;
    public Field fecdominio;
    public Field feceoscli;
    public Field feceosejer;
    public Field fecisscli;
    public Field fecissejer;
    public Field fecnomcli;
    public Field fecnomejer;
    public Field fecrencli;
    public Field fecrenejer;
    public Field fecusuario;
    class Fechas extends Table
      {
      public Fechas(Select select)
        {
        super(select);
        setName("fechas");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sfechas()
      {
      setName("sfechas");
      addTable(fechas=new Fechas(this));
      addField(fecctacli=new Field(this,fechas,"fecctacli"));
      addField(fecctaejer=new Field(this,fechas,"fecctaejer"));
      addField(fecdominio=new Field(this,fechas,"fecdominio"));
      addField(feceoscli=new Field(this,fechas,"feceoscli"));
      addField(feceosejer=new Field(this,fechas,"feceosejer"));
      addField(fecisscli=new Field(this,fechas,"fecisscli"));
      addField(fecissejer=new Field(this,fechas,"fecissejer"));
      addField(fecnomcli=new Field(this,fechas,"fecnomcli"));
      addField(fecnomejer=new Field(this,fechas,"fecnomejer"));
      addField(fecrencli=new Field(this,fechas,"fecrencli"));
      addField(fecrenejer=new Field(this,fechas,"fecrenejer"));
      addField(fecusuario=new Field(this,fechas,"fecusuario"));
      }
    }
    
  public ProgPrfechas(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.prfechas=this;
    setName("prfechas");
    setTitle("Empresas actuales por usuario");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vfechas=new FormVfechas(this));
    }
  public ProgPrfechas()
    {
    this((AppEasp) Aplication.getAplication());
    }
  }
  
