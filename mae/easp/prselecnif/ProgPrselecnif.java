// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20110615
// Hora:             18:56:50
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prselecnif;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prselecnif
// Nombre:   Selección nifes
// Versión:  1.0
// 
public class ProgPrselecnif extends Program
  {
  public AppEasp easp;
  public ProgPrselecnif prselecnif;
  // Ventana
  public FormVnifes vnifes;
  // Selects
  public Snifes snifes;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Selección nifes");
      }
    }
    
  public class FormVnifes extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onEdit() {
      mae.easp.preditnif.ProgPreditnif pr = new mae.easp.preditnif.ProgPreditnif ();
      pr.nif = danifcif.getString();
      pr.run();
      int i = vnifes.getCurrentRow();
      doShow();
      vnifes.setCurrentRow(i);
    }
    
    public void onSelection () {
      doEdit();
    }
    
    // Fin declaraciones globales
    // Controles
    public CtrlDanifcif danifcif;
    public CtrlDatapell1 datapell1;
    public CtrlDatapell2 datapell2;
    public CtrlDatnombre datnombre;
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
        setTitle("NIF / CIF");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setField(snifes.danifcif);
        }
      }
      
    public class CtrlDatapell1 extends ColumnEdit
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
        setTitle("Apellido / Razón social");
        setType(STRING);
        setLength(100);
        setSearchable(true);
        setField(snifes.datapell1);
        }
      }
      
    public class CtrlDatapell2 extends ColumnEdit
      {
      public CtrlDatapell2(Form form)
        {
        super(form);
        setName("datapell2");
        setTitle("Apellido 2");
        setType(STRING);
        setLength(25);
        setSearchable(true);
        setField(snifes.datapell2);
        }
      }
      
    public class CtrlDatnombre extends ColumnEdit
      {
      public CtrlDatnombre(Form form)
        {
        super(form);
        setName("datnombre");
        setTitle("Nombre");
        setType(STRING);
        setLength(20);
        setSearchable(true);
        setField(snifes.datnombre);
        }
      }
      
    public FormVnifes(ProgPrselecnif prselecnif)
      {
      super(prselecnif);
      setName("vnifes");
      setTitle("Gestión de nifes");
      setLocation(new Location());
      setStates(SHOW | SEARCH | UPDATE);
      addSelect(snifes=new Snifes());
      addControl(danifcif=new CtrlDanifcif(this));
      addControl(datapell1=new CtrlDatapell1(this));
      addControl(datapell2=new CtrlDatapell2(this));
      addControl(datnombre=new CtrlDatnombre(this));
      setSelect(snifes);
      }
    }
    
  // select para el cdp con su nif
  public class Snifes extends Select
    {
    // Tablas
    public Nifes nifes;
    // Campos
    public Field adatprov;
    public Field danifcif;
    public Field dataltaen;
    public Field datapell1;
    public Field datapell2;
    public Field datcbienes;
    public Field datcontacto;
    public Field datcpos;
    public Field datdominio;
    public Field dateatt;
    public Field datecpos;
    public Field dateesc;
    public Field dateletra;
    public Field datemail;
    public Field datemuni;
    public Field datenum;
    public Field datepais;
    public Field datepiso;
    public Field datepobla;
    public Field dateprov;
    public Field datesc;
    public Field datesiglas;
    public Field datevia;
    public Field datfax;
    public Field datfisicajuri;
    public Field datipf;
    public Field datipo;
    public Field datletra;
    public Field datletraseti;
    public Field datmovil;
    public Field datmuni;
    public Field datnacional;
    public Field datnombre;
    public Field datnum;
    public Field datpais;
    public Field datpiso;
    public Field datpobla;
    public Field datsiglas;
    public Field dattel;
    public Field datvia;
    class Nifes extends Table
      {
      public Nifes(Select select)
        {
        super(select);
        setName("nifes");
        setOptions(READ | UPDATE);
        }
      }
      
    public Snifes()
      {
      setName("snifes");
      addTable(nifes=new Nifes(this));
      addField(adatprov=new Field(this,nifes,"datprov"));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      addField(dataltaen=new Field(this,nifes,"dataltaen"));
      addField(datapell1=new Field(this,nifes,"datapell1"));
      addField(datapell2=new Field(this,nifes,"datapell2"));
      addField(datcbienes=new Field(this,nifes,"datcbienes"));
      addField(datcontacto=new Field(this,nifes,"datcontacto"));
      addField(datcpos=new Field(this,nifes,"datcpos"));
      addField(datdominio=new Field(this,nifes,"datdominio"));
      addField(dateatt=new Field(this,nifes,"dateatt"));
      addField(datecpos=new Field(this,nifes,"datecpos"));
      addField(dateesc=new Field(this,nifes,"dateesc"));
      addField(dateletra=new Field(this,nifes,"dateletra"));
      addField(datemail=new Field(this,nifes,"datemail"));
      addField(datemuni=new Field(this,nifes,"datemuni"));
      addField(datenum=new Field(this,nifes,"datenum"));
      addField(datepais=new Field(this,nifes,"datepais"));
      addField(datepiso=new Field(this,nifes,"datepiso"));
      addField(datepobla=new Field(this,nifes,"datepobla"));
      addField(dateprov=new Field(this,nifes,"dateprov"));
      addField(datesc=new Field(this,nifes,"datesc"));
      addField(datesiglas=new Field(this,nifes,"datesiglas"));
      addField(datevia=new Field(this,nifes,"datevia"));
      addField(datfax=new Field(this,nifes,"datfax"));
      addField(datfisicajuri=new Field(this,nifes,"datfisicajuri"));
      addField(datipf=new Field(this,nifes,"datipf"));
      addField(datipo=new Field(this,nifes,"datipo"));
      addField(datletra=new Field(this,nifes,"datletra"));
      addField(datletraseti=new Field(this,nifes,"datletraseti"));
      addField(datmovil=new Field(this,nifes,"datmovil"));
      addField(datmuni=new Field(this,nifes,"datmuni"));
      addField(datnacional=new Field(this,nifes,"datnacional"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      addField(datnum=new Field(this,nifes,"datnum"));
      addField(datpais=new Field(this,nifes,"datpais"));
      addField(datpiso=new Field(this,nifes,"datpiso"));
      addField(datpobla=new Field(this,nifes,"datpobla"));
      addField(datsiglas=new Field(this,nifes,"datsiglas"));
      addField(dattel=new Field(this,nifes,"dattel"));
      addField(datvia=new Field(this,nifes,"datvia"));
      }
    public String getOrder()
      {
      return "danifcif";
      }
    }
    
  public ProgPrselecnif()
    {
    this.prselecnif=this;
    setName("prselecnif");
    setTitle("Selección nifes");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vnifes=new FormVnifes(this));
    }
  public ProgPrselecnif(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  }
  
