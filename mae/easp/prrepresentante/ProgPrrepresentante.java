// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20150512
// Hora:             16:52:35
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prrepresentante;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prrepresentante
// Nombre:   Representantes
// Versión:  1.0
// 
public class ProgPrrepresentante extends Program
  {
  public AppEasp easp;
  public ProgPrrepresentante prrepresentante;
  // Ventana
  public FormVrepresentantes vrepresentantes;
  // Selects
  public Srepres srepres;
  public Snifes snifes;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Representantes");
      }
    }
    
  public class FormVrepresentantes extends MultiDataForm
    {
    // Controles
    public CtrlRepcodigo repcodigo;
    public CtrlRepnifcif repnifcif;
    public CtrlVvapellido1 vvapellido1;
    public CtrlVvapellido2 vvapellido2;
    public CtrlVvnombre vvnombre;
    public CtrlRepadministrado repadministrado;
    public CtrlReppresentante reppresentante;
    public CtrlRepreplegal repreplegal;
    public CtrlRepfirma repfirma;
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
      
    public class CtrlRepcodigo extends ColumnEdit
      {
      public CtrlRepcodigo(Form form)
        {
        super(form);
        setName("repcodigo");
        setTitle("Código Empresa");
        setType(STRING);
        setLength(12);
        setSearchable(true);
        setEnabled(false);
        setField(srepres.repcodigo);
        }
      }
      
    public class CtrlRepnifcif extends ColumnEdit
      {
      public CtrlRepnifcif(Form form)
        {
        super(form);
        setName("repnifcif");
        setTitle("NIF");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setEnabled(false);
        setField(srepres.repnifcif);
        }
      }
      
    public class CtrlVvapellido1 extends ColumnEdit
      {
      public CtrlVvapellido1(Form form)
        {
        super(form);
        setName("vvapellido1");
        setTitle("1er Apellido");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        }
      }
      
    public class CtrlVvapellido2 extends ColumnEdit
      {
      public CtrlVvapellido2(Form form)
        {
        super(form);
        setName("vvapellido2");
        setTitle("2º Apellido");
        setType(STRING);
        setLength(15);
        setEnabled(false);
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
        setLength(15);
        setEnabled(false);
        }
      }
      
    public class CtrlRepadministrado extends ColumnEdit
      {
      public CtrlRepadministrado(Form form)
        {
        super(form);
        setName("repadministrado");
        setTitle("Administrador");
        setType(STRING);
        setLength(1);
        setSearchable(true);
        setField(srepres.repadministrado);
        }
      }
      
    public class CtrlReppresentante extends ColumnEdit
      {
      public CtrlReppresentante(Form form)
        {
        super(form);
        setName("reppresentante");
        setTitle("Representante");
        setType(STRING);
        setLength(1);
        setSearchable(true);
        setField(srepres.reppresentante);
        }
      }
      
    public class CtrlRepreplegal extends ColumnEdit
      {
      public CtrlRepreplegal(Form form)
        {
        super(form);
        setName("repreplegal");
        setTitle("R. Legal");
        setType(STRING);
        setLength(1);
        setSearchable(true);
        setField(srepres.repreplegal);
        }
      }
      
    public class CtrlRepfirma extends ColumnEdit
      {
      public CtrlRepfirma(Form form)
        {
        super(form);
        setName("repfirma");
        setTitle("Firma");
        setType(STRING);
        setLength(1);
        setSearchable(true);
        setField(srepres.repfirma);
        }
      }
      
    public FormVrepresentantes(ProgPrrepresentante prrepresentante)
      {
      super(prrepresentante);
      setName("vrepresentantes");
      setTitle("Representantes");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE);
      addSelect(srepres=new Srepres());
      addSelect(snifes=new Snifes());
      addControl(repcodigo=new CtrlRepcodigo(this));
      addControl(repnifcif=new CtrlRepnifcif(this));
      addControl(vvapellido1=new CtrlVvapellido1(this));
      addControl(vvapellido2=new CtrlVvapellido2(this));
      addControl(vvnombre=new CtrlVvnombre(this));
      addControl(repadministrado=new CtrlRepadministrado(this));
      addControl(reppresentante=new CtrlReppresentante(this));
      addControl(repreplegal=new CtrlRepreplegal(this));
      addControl(repfirma=new CtrlRepfirma(this));
      setSelect(srepres);
      }
    public void onBeginRecord()
      {
      snifes.setWhere("danifcif = '"+srepres.repnifcif.getString()+"'");
      snifes.execute();
      if ( !snifes.isEof() ) {
         vvapellido1 .setValue(snifes.datapell1);
         vvapellido2 .setValue(snifes.datapell2);
         vvnombre    .setValue(snifes.datnombre);
         }
      else {
         vvapellido1 .setNull();
         vvapellido2 .setNull();
         vvnombre    .setNull();
        }
      
      super.onBeginRecord();
      
      }
    }
    
  // 
  public class Srepres extends Select
    {
    // Tablas
    public Representantes representantes;
    // Campos
    public Field repadministrado;
    public Field repcodigo;
    public Field repdominio;
    public Field repfechapoder;
    public Field repfirma;
    public Field repnifcif;
    public Field repnotaria;
    public Field reppresentante;
    public Field repreplegal;
    public Field represidente;
    public Field repsecretario;
    public Field repsocios;
    public Field repvtopoder;
    class Representantes extends Table
      {
      public Representantes(Select select)
        {
        super(select);
        setName("representantes");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Srepres()
      {
      setName("srepres");
      addTable(representantes=new Representantes(this));
      addField(repadministrado=new Field(this,representantes,"repadministrado"));
      addField(repcodigo=new Field(this,representantes,"repcodigo"));
      addField(repdominio=new Field(this,representantes,"repdominio"));
      addField(repfechapoder=new Field(this,representantes,"repfechapoder"));
      addField(repfirma=new Field(this,representantes,"repfirma"));
      addField(repnifcif=new Field(this,representantes,"repnifcif"));
      addField(repnotaria=new Field(this,representantes,"repnotaria"));
      addField(reppresentante=new Field(this,representantes,"reppresentante"));
      addField(repreplegal=new Field(this,representantes,"repreplegal"));
      addField(represidente=new Field(this,representantes,"represidente"));
      addField(repsecretario=new Field(this,representantes,"repsecretario"));
      addField(repsocios=new Field(this,representantes,"repsocios"));
      addField(repvtopoder=new Field(this,representantes,"repvtopoder"));
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
    public Field datnombre;
    class Nifes extends Table
      {
      public Nifes(Select select)
        {
        super(select);
        setName("nifes");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Snifes()
      {
      setName("snifes");
      addTable(nifes=new Nifes(this));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      addField(datapell1=new Field(this,nifes,"datapell1"));
      addField(datapell2=new Field(this,nifes,"datapell2"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      }
    }
    
  public ProgPrrepresentante(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.prrepresentante=this;
    setName("prrepresentante");
    setTitle("Representantes");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vrepresentantes=new FormVrepresentantes(this));
    }
  public ProgPrrepresentante()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    super.onInit();
    
    vrepresentantes.setInitState(DataForm.SHOW);
    
    }
  }
  
