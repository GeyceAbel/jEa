// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20150723
// Hora:             11:56:01
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.pravisos;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: pravisos
// Nombre:   Avisos
// Versión:  1.0
// 
public class ProgPravisos extends Program
  {
  public AppEasp easp;
  public ProgPravisos pravisos;
  // Ventana
  public FormVbuscar vbuscar;
  // Selects
  // Ventana
  public FormVavisos vavisos;
  // Selects
  public Savisos savisos;
  public Savutil savutil;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Avisos");
      }
    }
    
  public class FormVbuscar extends ProcessForm
    {
    // Controles
    public CtrlVvaplicacion vvaplicacion;
    public CtrlVvempresa vvempresa;
    public CtrlChpendientes chpendientes;
    public CtrlChrevisados chrevisados;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(1);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(NORTH);
        }
      }
      
    public class CtrlVvaplicacion extends ControlEdit
      {
      public CtrlVvaplicacion(Form form)
        {
        super(form);
        setName("vvaplicacion");
        setTitle("Aplicación");
        setType(STRING);
        setLength(15);
        setPrintable(false);
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
      
    public class CtrlChpendientes extends ControlCheck
      {
      public CtrlChpendientes(Form form)
        {
        super(form);
        setName("chpendientes");
        setTitle("Pendientese");
        }
      }
      
    public class CtrlChrevisados extends ControlCheck
      {
      public CtrlChrevisados(Form form)
        {
        super(form);
        setName("chrevisados");
        setTitle("Revisados");
        }
      }
      
    public FormVbuscar(ProgPravisos pravisos)
      {
      super(pravisos);
      setName("vbuscar");
      setLocation(new Location());
      setPrintable(false);
      addControl(vvaplicacion=new CtrlVvaplicacion(this));
      addControl(vvempresa=new CtrlVvempresa(this));
      addControl(chpendientes=new CtrlChpendientes(this));
      addControl(chrevisados=new CtrlChrevisados(this));
      }
    }
    
  public class FormVavisos extends MultiDataForm
    {
    // Controles
    public CtrlAvaplicacion avaplicacion;
    public CtrlAvempresa avempresa;
    public CtrlAvnomempresa avnomempresa;
    public CtrlAvtrabajador avtrabajador;
    public CtrlAvnomtrabaj avnomtrabaj;
    public CtrlAvtipoaviso avtipoaviso;
    public CtrlAvtitulo avtitulo;
    public CtrlAvestado avestado;
    public CtrlAvfechavenci avfechavenci;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(REMAINDER);
        setWeightx(1.0);
        setWeighty(6.0);
        setFill(BOTH);
        setAnchor(SOUTH);
        }
      }
      
    public class CtrlAvaplicacion extends ColumnEdit
      {
      public CtrlAvaplicacion(Form form)
        {
        super(form);
        setName("avaplicacion");
        setTitle("Aplicación");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setField(savisos.avaplicacion);
        }
      }
      
    public class CtrlAvempresa extends ColumnEdit
      {
      public CtrlAvempresa(Form form)
        {
        super(form);
        setName("avempresa");
        setTitle("Empresa");
        setType(INTEGER);
        setLength(10);
        setSearchable(true);
        setField(savisos.avempresa);
        }
      }
      
    public class CtrlAvnomempresa extends ColumnEdit
      {
      public CtrlAvnomempresa(Form form)
        {
        super(form);
        setName("avnomempresa");
        setTitle("Nombre Empresa");
        setType(STRING);
        setLength(35);
        setSearchable(true);
        setField(savisos.avnomempresa);
        }
      }
      
    public class CtrlAvtrabajador extends ColumnEdit
      {
      public CtrlAvtrabajador(Form form)
        {
        super(form);
        setName("avtrabajador");
        setTitle("Trabajador");
        setType(INTEGER);
        setLength(10);
        setSearchable(true);
        setField(savisos.avtrabajador);
        }
      }
      
    public class CtrlAvnomtrabaj extends ColumnEdit
      {
      public CtrlAvnomtrabaj(Form form)
        {
        super(form);
        setName("avnomtrabaj");
        setTitle("Nombre Trabajador");
        setType(STRING);
        setLength(35);
        setSearchable(true);
        setField(savisos.avnomtrabaj);
        }
      }
      
    public class CtrlAvtipoaviso extends ColumnEdit
      {
      public CtrlAvtipoaviso(Form form)
        {
        super(form);
        setName("avtipoaviso");
        setTitle("Tipo Aviso");
        setType(STRING);
        setLength(10);
        setSearchable(true);
        setField(savisos.avtipoaviso);
        }
      }
      
    public class CtrlAvtitulo extends ColumnEdit
      {
      public CtrlAvtitulo(Form form)
        {
        super(form);
        setName("avtitulo");
        setTitle("Aviso");
        setType(STRING);
        setLength(250);
        setPrintable(false);
        setField(savisos.avtitulo);
        }
      }
      
    public class CtrlAvestado extends ColumnEdit
      {
      public CtrlAvestado(Form form)
        {
        super(form);
        setName("avestado");
        setTitle("Estado");
        setType(STRING);
        setLength(2);
        setSearchable(true);
        setField(savisos.avestado);
        }
      }
      
    public class CtrlAvfechavenci extends ColumnEdit
      {
      public CtrlAvfechavenci(Form form)
        {
        super(form);
        setName("avfechavenci");
        setTitle("Fecha Aviso");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(savisos.avfechavenci);
        }
      }
      
    public FormVavisos(ProgPravisos pravisos)
      {
      super(pravisos);
      setName("vavisos");
      setTitle("Avisos");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
      addSelect(savisos=new Savisos());
      addSelect(savutil=new Savutil());
      addControl(avaplicacion=new CtrlAvaplicacion(this));
      addControl(avempresa=new CtrlAvempresa(this));
      addControl(avnomempresa=new CtrlAvnomempresa(this));
      addControl(avtrabajador=new CtrlAvtrabajador(this));
      addControl(avnomtrabaj=new CtrlAvnomtrabaj(this));
      addControl(avtipoaviso=new CtrlAvtipoaviso(this));
      addControl(avtitulo=new CtrlAvtitulo(this));
      addControl(avestado=new CtrlAvestado(this));
      addControl(avfechavenci=new CtrlAvfechavenci(this));
      }
    }
    
  // 
  public class Savisos extends Select
    {
    // Tablas
    public Avisos avisos;
    // Campos
    public Field avcodigo;
    public Field avaplicacion;
    public Field avcodcdp;
    public Field avempresa;
    public Field avnomempresa;
    public Field avtrabajador;
    public Field avnomtrabaj;
    public Field avrelacion;
    public Field avcentro;
    public Field avcodincid;
    public Field avcodfiniq;
    public Field avcodbonif;
    public Field avcodactivi;
    public Field avnomactivi;
    public Field avdeclara;
    public Field avcodotr1;
    public Field avcodotr2;
    public Field avcodotr3;
    public Field avejercicio;
    public Field avperiodo;
    public Field avtiporeco;
    public Field avtipoaviso;
    public Field avtitulo;
    public Field avorigen;
    public Field avestado;
    public Field avestadoctrl;
    public Field avurgencia;
    public Field avdescrip;
    public Field avfechacrea;
    public Field avresponscrea;
    public Field avresponsorig;
    public Field avfechaorig;
    public Field avhoraorig;
    public Field avresponsvenc;
    public Field avfechavenci;
    public Field avhoravenci;
    public Field avfechasolu;
    public Field avresponssolu;
    public Field avhorasolu;
    public Field avresponsrevi;
    public Field avfecharevi;
    public Field avhorarevi;
    class Avisos extends Table
      {
      public Avisos(Select select)
        {
        super(select);
        setName("avisos");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Savisos()
      {
      setName("savisos");
      addTable(avisos=new Avisos(this));
      addField(avcodigo=new Field(this,avisos,"avcodigo"));
      addField(avaplicacion=new Field(this,avisos,"avaplicacion"));
      addField(avcodcdp=new Field(this,avisos,"avcodcdp"));
      addField(avempresa=new Field(this,avisos,"avempresa"));
      addField(avnomempresa=new Field(this,avisos,"avnomempresa"));
      addField(avtrabajador=new Field(this,avisos,"avtrabajador"));
      addField(avnomtrabaj=new Field(this,avisos,"avnomtrabaj"));
      addField(avrelacion=new Field(this,avisos,"avrelacion"));
      addField(avcentro=new Field(this,avisos,"avcentro"));
      addField(avcodincid=new Field(this,avisos,"avcodincid"));
      addField(avcodfiniq=new Field(this,avisos,"avcodfiniq"));
      addField(avcodbonif=new Field(this,avisos,"avcodbonif"));
      addField(avcodactivi=new Field(this,avisos,"avcodactivi"));
      addField(avnomactivi=new Field(this,avisos,"avnomactivi"));
      addField(avdeclara=new Field(this,avisos,"avdeclara"));
      addField(avcodotr1=new Field(this,avisos,"avcodotr1"));
      addField(avcodotr2=new Field(this,avisos,"avcodotr2"));
      addField(avcodotr3=new Field(this,avisos,"avcodotr3"));
      addField(avejercicio=new Field(this,avisos,"avejercicio"));
      addField(avperiodo=new Field(this,avisos,"avperiodo"));
      addField(avtiporeco=new Field(this,avisos,"avtiporeco"));
      addField(avtipoaviso=new Field(this,avisos,"avtipoaviso"));
      addField(avtitulo=new Field(this,avisos,"avtitulo"));
      addField(avorigen=new Field(this,avisos,"avorigen"));
      addField(avestado=new Field(this,avisos,"avestado"));
      addField(avestadoctrl=new Field(this,avisos,"avestadoctrl"));
      addField(avurgencia=new Field(this,avisos,"avurgencia"));
      addField(avdescrip=new Field(this,avisos,"avdescrip"));
      addField(avfechacrea=new Field(this,avisos,"avfechacrea"));
      addField(avresponscrea=new Field(this,avisos,"avresponscrea"));
      addField(avresponsorig=new Field(this,avisos,"avresponsorig"));
      addField(avfechaorig=new Field(this,avisos,"avfechaorig"));
      addField(avhoraorig=new Field(this,avisos,"avhoraorig"));
      addField(avresponsvenc=new Field(this,avisos,"avresponsvenc"));
      addField(avfechavenci=new Field(this,avisos,"avfechavenci"));
      addField(avhoravenci=new Field(this,avisos,"avhoravenci"));
      addField(avfechasolu=new Field(this,avisos,"avfechasolu"));
      addField(avresponssolu=new Field(this,avisos,"avresponssolu"));
      addField(avhorasolu=new Field(this,avisos,"avhorasolu"));
      addField(avresponsrevi=new Field(this,avisos,"avresponsrevi"));
      addField(avfecharevi=new Field(this,avisos,"avfecharevi"));
      addField(avhorarevi=new Field(this,avisos,"avhorarevi"));
      }
    }
    
  // 
  public class Savutil extends Select
    {
    // Tablas
    public Avisos avisos;
    // Campos
    public Field avcodigo;
    public Field avaplicacion;
    public Field avcodcdp;
    public Field avempresa;
    public Field avnomempresa;
    public Field avtrabajador;
    public Field avnomtrabaj;
    public Field avrelacion;
    public Field avcentro;
    public Field avcodincid;
    public Field avcodfiniq;
    public Field avcodbonif;
    public Field avcodactivi;
    public Field avnomactivi;
    public Field avdeclara;
    public Field avcodotr1;
    public Field avcodotr2;
    public Field avcodotr3;
    public Field avejercicio;
    public Field avperiodo;
    public Field avtiporeco;
    public Field avtipoaviso;
    public Field avtitulo;
    public Field avorigen;
    public Field avestado;
    public Field avestadoctrl;
    public Field avurgencia;
    public Field avdescrip;
    public Field avfechacrea;
    public Field avresponscrea;
    public Field avresponsorig;
    public Field avfechaorig;
    public Field avhoraorig;
    public Field avresponsvenc;
    public Field avfechavenci;
    public Field avhoravenci;
    public Field avfechasolu;
    public Field avresponssolu;
    public Field avhorasolu;
    public Field avresponsrevi;
    public Field avfecharevi;
    public Field avhorarevi;
    class Avisos extends Table
      {
      public Avisos(Select select)
        {
        super(select);
        setName("avisos");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Savutil()
      {
      setName("savutil");
      addTable(avisos=new Avisos(this));
      addField(avcodigo=new Field(this,avisos,"avcodigo"));
      addField(avaplicacion=new Field(this,avisos,"avaplicacion"));
      addField(avcodcdp=new Field(this,avisos,"avcodcdp"));
      addField(avempresa=new Field(this,avisos,"avempresa"));
      addField(avnomempresa=new Field(this,avisos,"avnomempresa"));
      addField(avtrabajador=new Field(this,avisos,"avtrabajador"));
      addField(avnomtrabaj=new Field(this,avisos,"avnomtrabaj"));
      addField(avrelacion=new Field(this,avisos,"avrelacion"));
      addField(avcentro=new Field(this,avisos,"avcentro"));
      addField(avcodincid=new Field(this,avisos,"avcodincid"));
      addField(avcodfiniq=new Field(this,avisos,"avcodfiniq"));
      addField(avcodbonif=new Field(this,avisos,"avcodbonif"));
      addField(avcodactivi=new Field(this,avisos,"avcodactivi"));
      addField(avnomactivi=new Field(this,avisos,"avnomactivi"));
      addField(avdeclara=new Field(this,avisos,"avdeclara"));
      addField(avcodotr1=new Field(this,avisos,"avcodotr1"));
      addField(avcodotr2=new Field(this,avisos,"avcodotr2"));
      addField(avcodotr3=new Field(this,avisos,"avcodotr3"));
      addField(avejercicio=new Field(this,avisos,"avejercicio"));
      addField(avperiodo=new Field(this,avisos,"avperiodo"));
      addField(avtiporeco=new Field(this,avisos,"avtiporeco"));
      addField(avtipoaviso=new Field(this,avisos,"avtipoaviso"));
      addField(avtitulo=new Field(this,avisos,"avtitulo"));
      addField(avorigen=new Field(this,avisos,"avorigen"));
      addField(avestado=new Field(this,avisos,"avestado"));
      addField(avestadoctrl=new Field(this,avisos,"avestadoctrl"));
      addField(avurgencia=new Field(this,avisos,"avurgencia"));
      addField(avdescrip=new Field(this,avisos,"avdescrip"));
      addField(avfechacrea=new Field(this,avisos,"avfechacrea"));
      addField(avresponscrea=new Field(this,avisos,"avresponscrea"));
      addField(avresponsorig=new Field(this,avisos,"avresponsorig"));
      addField(avfechaorig=new Field(this,avisos,"avfechaorig"));
      addField(avhoraorig=new Field(this,avisos,"avhoraorig"));
      addField(avresponsvenc=new Field(this,avisos,"avresponsvenc"));
      addField(avfechavenci=new Field(this,avisos,"avfechavenci"));
      addField(avhoravenci=new Field(this,avisos,"avhoravenci"));
      addField(avfechasolu=new Field(this,avisos,"avfechasolu"));
      addField(avresponssolu=new Field(this,avisos,"avresponssolu"));
      addField(avhorasolu=new Field(this,avisos,"avhorasolu"));
      addField(avresponsrevi=new Field(this,avisos,"avresponsrevi"));
      addField(avfecharevi=new Field(this,avisos,"avfecharevi"));
      addField(avhorarevi=new Field(this,avisos,"avhorarevi"));
      }
    }
    
  public ProgPravisos(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.pravisos=this;
    setName("pravisos");
    setTitle("Avisos");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vbuscar=new FormVbuscar(this));
    addForm(vavisos=new FormVavisos(this));
    }
  public ProgPravisos()
    {
    this((AppEasp) Aplication.getAplication());
    }
  }
  
