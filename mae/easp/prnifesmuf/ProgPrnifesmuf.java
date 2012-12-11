// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20121211
// Hora:             13:55:08
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prnifesmuf;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prnifesmuf
// Nombre:   Miembros Unidad Familiar
// Versión:  1.0
// 
public class ProgPrnifesmuf extends Program
  {
  public AppEasp easp;
  public ProgPrnifesmuf prnifesmuf;
  // Ventana
  public FormVnifesmuf vnifesmuf;
  // Selects
  public Snifesmuf snifesmuf;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Miembros Unidad Familiar");
      }
    }
    
  public class FormVnifesmuf extends MultiDataForm
    {
    // Controles
    public CtrlMufnif mufnif;
    public CtrlMufad mufad;
    public CtrlMufnifad mufnifad;
    public CtrlMufnombre mufnombre;
    public CtrlMufsexo mufsexo;
    public CtrlMuffecnac muffecnac;
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
      
    public class CtrlMufnif extends ColumnEdit
      {
      public CtrlMufnif(Form form)
        {
        super(form);
        setName("mufnif");
        setTitle("NIF");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setEnabled(false);
        setField(snifesmuf.mufnif);
        }
      }
      
    public class CtrlMufad extends ColumnEdit
      {
      public CtrlMufad(Form form)
        {
        super(form);
        setName("mufad");
        setTitle("Tipo");
        setType(STRING);
        setLength(1);
        setSearchable(true);
        setEnabled(false);
        setField(snifesmuf.mufad);
        }
      }
      
    public class CtrlMufnifad extends ColumnEdit
      {
      public CtrlMufnifad(Form form)
        {
        super(form);
        setName("mufnifad");
        setTitle("NIF Miembro");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setField(snifesmuf.mufnifad);
        }
      }
      
    public class CtrlMufnombre extends ColumnEdit
      {
      public CtrlMufnombre(Form form)
        {
        super(form);
        setName("mufnombre");
        setTitle("Nombre");
        setType(STRING);
        setLength(50);
        setSearchable(true);
        setField(snifesmuf.mufnombre);
        }
      }
      
    public class CtrlMufsexo extends ColumnEdit
      {
      public CtrlMufsexo(Form form)
        {
        super(form);
        setName("mufsexo");
        setTitle("Sexo");
        setType(STRING);
        setLength(1);
        setSearchable(true);
        setField(snifesmuf.mufsexo);
        }
      }
      
    public class CtrlMuffecnac extends ColumnEdit
      {
      public CtrlMuffecnac(Form form)
        {
        super(form);
        setName("muffecnac");
        setTitle("Fecha Nac.");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(snifesmuf.muffecnac);
        }
      }
      
    public FormVnifesmuf(ProgPrnifesmuf prnifesmuf)
      {
      super(prnifesmuf);
      setName("vnifesmuf");
      setTitle("Miembros Unidad Familiar");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE);
      addSelect(snifesmuf=new Snifesmuf());
      addControl(mufnif=new CtrlMufnif(this));
      addControl(mufad=new CtrlMufad(this));
      addControl(mufnifad=new CtrlMufnifad(this));
      addControl(mufnombre=new CtrlMufnombre(this));
      addControl(mufsexo=new CtrlMufsexo(this));
      addControl(muffecnac=new CtrlMuffecnac(this));
      setSelect(snifesmuf);
      }
    }
    
  // 
  public class Snifesmuf extends Select
    {
    // Tablas
    public Nifesmuf nifesmuf;
    // Campos
    public Field mufnif;
    public Field mufnum;
    public Field mufad;
    public Field muftipod;
    public Field mufpercont;
    public Field mufnifad;
    public Field mufnombre;
    public Field mufsexo;
    public Field muffecnac;
    public Field muffecadop;
    public Field mufperdisc;
    public Field mufayudadesp;
    public Field mufingresos;
    public Field mufnumreparto;
    public Field mufdeducible;
    class Nifesmuf extends Table
      {
      public Nifesmuf(Select select)
        {
        super(select);
        setName("nifesmuf");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Snifesmuf()
      {
      setName("snifesmuf");
      addTable(nifesmuf=new Nifesmuf(this));
      addField(mufnif=new Field(this,nifesmuf,"mufnif"));
      addField(mufnum=new Field(this,nifesmuf,"mufnum"));
      addField(mufad=new Field(this,nifesmuf,"mufad"));
      addField(muftipod=new Field(this,nifesmuf,"muftipod"));
      addField(mufpercont=new Field(this,nifesmuf,"mufpercont"));
      addField(mufnifad=new Field(this,nifesmuf,"mufnifad"));
      addField(mufnombre=new Field(this,nifesmuf,"mufnombre"));
      addField(mufsexo=new Field(this,nifesmuf,"mufsexo"));
      addField(muffecnac=new Field(this,nifesmuf,"muffecnac"));
      addField(muffecadop=new Field(this,nifesmuf,"muffecadop"));
      addField(mufperdisc=new Field(this,nifesmuf,"mufperdisc"));
      addField(mufayudadesp=new Field(this,nifesmuf,"mufayudadesp"));
      addField(mufingresos=new Field(this,nifesmuf,"mufingresos"));
      addField(mufnumreparto=new Field(this,nifesmuf,"mufnumreparto"));
      addField(mufdeducible=new Field(this,nifesmuf,"mufdeducible"));
      }
    }
    
  public ProgPrnifesmuf(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.prnifesmuf=this;
    setName("prnifesmuf");
    setTitle("Miembros Unidad Familiar");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vnifesmuf=new FormVnifesmuf(this));
    }
  public ProgPrnifesmuf()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    vnifesmuf.setInitState(DataForm.SHOW);
    super.onInit();
    
    }
  }
  
