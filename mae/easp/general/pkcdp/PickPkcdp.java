// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090902
// Hora:             09:52:04
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkcdp;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkcdp extends PickUp
  {
  // Inicio declaraciones globales
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Scdp scdp;
  // Controles
  public CtrlDatapell1 datapell1;
  public CtrlCdpcodi cdpcodi;
  public CtrlDanifcif danifcif;
  // select de la tabla cdp
  public class Scdp extends Select
    {
    // Tablas
    public Cdp cdp;
    public Nifes nifes;
    // Campos
    public Field cdpcodi;
    public Field cdpnifcif;
    public Field danifcif;
    public Field datapell1;
    public Field datapell2;
    public Field datnombre;
    class Cdp extends Table
      {
      public Cdp(Select select)
        {
        super(select);
        setName("cdp");
        setOptions(READ);
        }
      }
      
    class Nifes extends Table
      {
      public Nifes(Select select)
        {
        super(select);
        setName("nifes");
        setOptions(READ);
        }
      }
      
    public Scdp()
      {
      setName("scdp");
      addTable(cdp=new Cdp(this));
      addTable(nifes=new Nifes(this));
      addField(cdpcodi=new Field(this,cdp,"cdpcodi"));
      addField(cdpnifcif=new Field(this,cdp,"cdpnifcif"));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      addField(datapell1=new Field(this,nifes,"datapell1"));
      addField(datapell2=new Field(this,nifes,"datapell2"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      }
    public String getOrder()
      {
      return "datapell1";
      }
    }
    
  public class CtrlDatapell1 extends ControlEdit
    {
    class Look extends LookComponent
      {
      public Look( )
        {
        super();
        setLength(30);
        }
      }
      
    public CtrlDatapell1(Form form)
      {
      super(form);
      setLook(new Look());
      setName("datapell1");
      setTitle("Cliente");
      setType(STRING);
      setLength(40);
      setPrintable(false);
      setField(scdp.datapell1);
      }
    }
    
  public class CtrlCdpcodi extends ControlEdit
    {
    public CtrlCdpcodi(Form form)
      {
      super(form);
      setName("cdpcodi");
      setTitle("Codigo");
      setType(STRING);
      setLength(12);
      setPrintable(false);
      setField(scdp.cdpcodi);
      }
    }
    
  public class CtrlDanifcif extends ControlEdit
    {
    public CtrlDanifcif(Form form)
      {
      super(form);
      setName("danifcif");
      setTitle("NIF / CIF");
      setType(STRING);
      setLength(15);
      setPrintable(false);
      setField(scdp.danifcif);
      }
    }
    
  public PickPkcdp(ControlComboBox control)
    {
    super(control);
    setName("pkcdp");
    setSelect(scdp=new Scdp());
    addColumn(datapell1=new CtrlDatapell1(null));
    addColumn(cdpcodi=new CtrlCdpcodi(null));
    addColumn(danifcif=new CtrlDanifcif(null));
    setResultControl(cdpcodi);
    setDescriptionControl(datapell1);
    }
  }
  
