// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:03
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prdgparamafinit;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prdgparamafinit
// Nombre:   Parámetros AfinityWeb
// Versión:  1.0
// 
public class ProgPrdgparamafinit extends Program
  {
  public AppEasp easp;
  public ProgPrdgparamafinit prdgparamafinit;
  // Ventana
  public FormVparamafinity vparamafinity;
  // Selects
  public Sagpi sagpi;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Parámetros AfinityWeb");
      }
    }
    
  public class FormVparamafinity extends MonoDataForm
    {
    // Controles
    public CtrlAgcodigoagpi agcodigoagpi;
    public CtrlAgcodigodp agcodigodp;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        }
      }
      
    public class CtrlAgcodigoagpi extends ControlEdit
      {
      public CtrlAgcodigoagpi(Form form)
        {
        super(form);
        setName("agcodigoagpi");
        setTitle("Codigo AFINITY");
        setType(STRING);
        setLength(12);
        setPrintable(false);
        setField(sagpi.agcodigoagpi);
        }
      public Object getDefault()
        {
        return Easp.dominio;
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlAgcodigodp extends ControlEdit
      {
      public CtrlAgcodigodp(Form form)
        {
        super(form);
        setName("agcodigodp");
        setTitle("código despacho");
        setType(STRING);
        setLength(12);
        setPrintable(false);
        setField(sagpi.agcodigodp);
        }
      }
      
    public FormVparamafinity(ProgPrdgparamafinit prdgparamafinit)
      {
      super(prdgparamafinit);
      setName("vparamafinity");
      setTitle("Parametros afinity");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE | INSERT);
      setPrintable(false);
      setUnique(true);
      addSelect(sagpi=new Sagpi());
      addControl(agcodigoagpi=new CtrlAgcodigoagpi(this));
      addControl(agcodigodp=new CtrlAgcodigodp(this));
      setSelect(sagpi);
      }
    }
    
  // Select de la tabla AGPI
  public class Sagpi extends Select
    {
    // Tablas
    public Agpi agpi;
    // Campos
    public Field agcodigo;
    public Field agcodigoagpi;
    public Field agcodigodp;
    public Field agdireccionweb;
    public Field agpassword;
    public Field agperiodicidad;
    class Agpi extends Table
      {
      public Agpi(Select select)
        {
        super(select);
        setName("agpi");
        setOptions(READ | INSERT | UPDATE);
        }
      public boolean onInsert()
        {
        agcodigo.setValue(1);
        agperiodicidad.setValue(365);
        return super.onInsert();
        }
      }
      
    public Sagpi()
      {
      setName("sagpi");
      addTable(agpi=new Agpi(this));
      addField(agcodigo=new Field(this,agpi,"agcodigo"));
      addField(agcodigoagpi=new Field(this,agpi,"agcodigoagpi"));
      addField(agcodigodp=new Field(this,agpi,"agcodigodp"));
      addField(agdireccionweb=new Field(this,agpi,"agdireccionweb"));
      addField(agpassword=new Field(this,agpi,"agpassword"));
      addField(agperiodicidad=new Field(this,agpi,"agperiodicidad"));
      }
    }
    
  public ProgPrdgparamafinit(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.prdgparamafinit=this;
    setName("prdgparamafinit");
    setTitle("Parámetros AfinityWeb");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vparamafinity=new FormVparamafinity(this));
    }
  public ProgPrdgparamafinit()
    {
    this((AppEasp) Aplication.getAplication());
    }
  }
  
