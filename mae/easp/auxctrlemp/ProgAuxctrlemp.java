// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20150512
// Hora:             16:33:44
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.auxctrlemp;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: auxctrlemp
// Nombre:   Control de acceso a sociedades
// Versión:  1.0
// 
public class ProgAuxctrlemp extends Program
  {
  public AppEasp easp;
  public ProgAuxctrlemp auxctrlemp;
  // Ventana
  public FormVauxctrlemp vauxctrlemp;
  // Selects
  public Snifes snifes;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Control de acceso a sociedades");
      }
    }
    
  public class FormVauxctrlemp extends MultiDataForm
    {
    // Controles
    public CtrlDanifcif danifcif;
    public CtrlVvnombre vvnombre;
    public CtrlDatuser datuser;
    public CtrlDatgrupo datgrupo;
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
      
    public class CtrlDanifcif extends ColumnEdit
      {
      public CtrlDanifcif(Form form)
        {
        super(form);
        setName("danifcif");
        setTitle("Nif / Cif del declarante");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        setField(snifes.danifcif);
        }
      }
      
    public class CtrlVvnombre extends ColumnEdit
      {
      public CtrlVvnombre(Form form)
        {
        super(form);
        setName("vvnombre");
        setTitle("Nombre");
        setType(STRING);
        setProtect(true);
        setLength(75);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlDatuser extends ColumnEdit
      {
      public CtrlDatuser(Form form)
        {
        super(form);
        setName("datuser");
        setTitle("Usuario");
        setType(STRING);
        setLength(25);
        setPrintable(false);
        setField(snifes.datuser);
        }
      }
      
    public class CtrlDatgrupo extends ColumnEdit
      {
      public CtrlDatgrupo(Form form)
        {
        super(form);
        setName("datgrupo");
        setTitle("Grupo");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(snifes.datgrupo);
        }
      }
      
    public FormVauxctrlemp(ProgAuxctrlemp auxctrlemp)
      {
      super(auxctrlemp);
      setName("vauxctrlemp");
      setTitle("Control acceso jModelos");
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      addSelect(snifes=new Snifes());
      addControl(danifcif=new CtrlDanifcif(this));
      addControl(vvnombre=new CtrlVvnombre(this));
      addControl(datuser=new CtrlDatuser(this));
      addControl(datgrupo=new CtrlDatgrupo(this));
      setSelect(snifes);
      }
    public void onInit()
      {
      super.onInit();
      setInitState(DataForm.SHOW);
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      vvnombre.setValue(Easp.nombreEmpresa(snifes.danifcif.getString()));
      }
    }
    
  // 
  public class Snifes extends Select
    {
    // Tablas
    public Nifes nifes;
    // Campos
    public Field danifcif;
    public Field datapell1;
    public Field datapell2;
    public Field datgrupo;
    public Field datnombre;
    public Field datuser;
    class Nifes extends Table
      {
      public Nifes(Select select)
        {
        super(select);
        setName("nifes");
        setOptions(READ | INSERT | UPDATE);
        }
      }
      
    public Snifes()
      {
      setName("snifes");
      addTable(nifes=new Nifes(this));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      addField(datapell1=new Field(this,nifes,"datapell1"));
      addField(datapell2=new Field(this,nifes,"datapell2"));
      addField(datgrupo=new Field(this,nifes,"datgrupo"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      addField(datuser=new Field(this,nifes,"datuser"));
      }
    public String getWhere()
      {
      return " danifcif in (Select cdpnifcif from cdp)";
      }
    public String getOrder()
      {
      return "danifcif";
      }
    }
    
  public ProgAuxctrlemp()
    {
    this.auxctrlemp=this;
    setName("auxctrlemp");
    setTitle("Control de acceso a sociedades");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vauxctrlemp=new FormVauxctrlemp(this));
    }
  public ProgAuxctrlemp(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    String user = Aplication.getAplication().getUser() ;
    Selector sgrupos = new Selector(Easp.connEA);
    sgrupos.execute("Select * from usagrup where usagrupo = 'Administradores' and usalogin = '"+user+"'");
    if ( sgrupos.next() ) {
      sgrupos.close();
      super.onInit();  
      }
    else {
      sgrupos.close();
      Maefc.message("Solamente los usuarios del grupo [Administradores] pueden acceder a este programa. ","Atención",Maefc.ERROR_MESSAGE);
      }
    
    
    }
  }
  
