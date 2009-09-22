// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090922
// Hora:             17:35:09
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkcdpconta;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkcdpconta extends PickUp
  {
  // Inicio declaraciones globales
  public String aplic;
  
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
  }
  
  public String getKeyWhere(Value v) {
    return " cdpcodi ='"+Easp.dominio.substring(0,6)+Util.formateoNumero("000000",v.getInteger())+"'";
  }
  
  public int columna = 0;
  public void onColumnSelectionChanged(int col) {
    if (columna!=col) {
      columna=col;
      switch(columna) {
        case 0: scdpconta.setOrder(null); 
                scdpconta.setOrder("datapell1"); 
                break;
        case 1: scdpconta.setOrder(null); 
                scdpconta.setOrder("cdpcodi"); 
                break;
      }
      refresh();
      read();
      fireTableDataChanged();
    }
  }
  
  // Fin declaraciones globales
  // Select
  public Scdpconta scdpconta;
  // Controles
  public CtrlVvempresa vvempresa;
  public CtrlCdpnifcif cdpnifcif;
  public CtrlVvnombre vvnombre;
  // select de CDP con contabilidad activa
  public class Scdpconta extends Select
    {
    // Tablas
    public Cdp cdp;
    public Nifes nifes;
    // Campos
    public Field cdpckconta;
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
      
    public Scdpconta()
      {
      setName("scdpconta");
      addTable(cdp=new Cdp(this));
      addTable(nifes=new Nifes(this));
      addField(cdpckconta=new Field(this,cdp,"cdpckconta"));
      addField(cdpcodi=new Field(this,cdp,"cdpcodi"));
      addField(cdpnifcif=new Field(this,cdp,"cdpnifcif"));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      addField(datapell1=new Field(this,nifes,"datapell1"));
      addField(datapell2=new Field(this,nifes,"datapell2"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      }
    public String getWhere()
      {
      String where = "";
      where = "left(cdpcodi,6)='"+Easp.dominio.substring(0,6)+"'";
      if (aplic!=null) {
        if (aplic.equals("JCONTA")) where += " and cdpckconta='S' ";
        if (aplic.equals("EOS")) where += " and cdpckeo='S' ";
      }
      return where;
      
      }
    public String getOrder()
      {
      if (columna==0)      return "cdpcodi";
      else if (columna==1) return "cdpnifcif";
      else if (columna==2) return "datapell1";
      else                 return null;
      }
    }
    
  public class CtrlVvempresa extends ControlEdit
    {
    public CtrlVvempresa(Form form)
      {
      super(form);
      setName("vvempresa");
      setTitle("Empresa");
      setType(INTEGER);
      setLength(6);
      setPrintable(false);
      }
    }
    
  public class CtrlCdpnifcif extends ControlEdit
    {
    public CtrlCdpnifcif(Form form)
      {
      super(form);
      setName("cdpnifcif");
      setTitle("NIF/CIF");
      setType(STRING);
      setLength(15);
      setPrintable(false);
      setField(scdpconta.cdpnifcif);
      }
    }
    
  public class CtrlVvnombre extends ControlEdit
    {
    public CtrlVvnombre(Form form)
      {
      super(form);
      setName("vvnombre");
      setTitle("Nombre");
      setType(STRING);
      setLength(40);
      setPrintable(false);
      }
    }
    
  public PickPkcdpconta(ControlComboBox control)
    {
    super(control);
    setName("pkcdpconta");
    setSelect(scdpconta=new Scdpconta());
    addColumn(vvempresa=new CtrlVvempresa(null));
    addColumn(cdpnifcif=new CtrlCdpnifcif(null));
    addColumn(vvnombre=new CtrlVvnombre(null));
    setResultControl(vvempresa);
    setDescriptionControl(vvnombre);
    }
  public void onBeginRecord()
    {
    super.onBeginRecord();
    vvnombre.setValue(Easp.nombreEmpresa(scdpconta.danifcif.getString()));
    if (scdpconta.cdpcodi.getString().length()>0) vvempresa.setValue(Integer.parseInt(scdpconta.cdpcodi.getString().substring(6)));
    
    }
  }
  
