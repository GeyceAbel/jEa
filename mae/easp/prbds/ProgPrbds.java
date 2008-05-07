// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:01
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prbds;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prbds
// Nombre:   Bases de datos y ubicaciones
// Versión:  4.1
// 
public class ProgPrbds extends Program
  {
  public AppEasp easp;
  public ProgPrbds prbds;
  // Ventana
  public FormVbds vbds;
  // Selects
  public Sbdscargadas sbdscargadas;
  // Ventana
  public FormVcambio vcambio;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Bases de datos y ubicaciones");
      }
    }
    
  public class FormVbds extends MultiDataForm
    {
    // Controles
    public CtrlBdaplic bdaplic;
    public CtrlBddominio bddominio;
    public CtrlBdejer bdejer;
    public CtrlBdbdnom bdbdnom;
    public CtrlBdbdserv bdbdserv;
    public CtrlBdbduser bdbduser;
    public CtrlBdbdpass bdbdpass;
    public CtrlBddesc bddesc;
    public CtrlBdtipo bdtipo;
    public CtrlBdauxiliar bdauxiliar;
    public CtrlBddisponible bddisponible;
    public CtrlBdobser bdobser;
    // Acciones
    public LinkBtcambio btcambio;
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
      
    public class CtrlBdaplic extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(8);
          }
        }
        
      public CtrlBdaplic(Form form)
        {
        super(form);
        setLook(new Look());
        setName("bdaplic");
        setMessageHelp("Aplicación");
        setTitle("Aplicación");
        setType(STRING);
        setProtect(true);
        setLength(15);
        setSearchable(true);
        setField(sbdscargadas.bdaplic);
        }
      }
      
    public class CtrlBddominio extends ColumnEdit
      {
      public CtrlBddominio(Form form)
        {
        super(form);
        setName("bddominio");
        setMessageHelp("Código de cliente");
        setTitle("Cliente");
        setType(STRING);
        setProtect(true);
        setLength(12);
        setSearchable(true);
        setField(sbdscargadas.bddominio);
        }
      }
      
    public class CtrlBdejer extends ColumnEdit
      {
      public CtrlBdejer(Form form)
        {
        super(form);
        setName("bdejer");
        setMessageHelp("Ejercicio");
        setTitle("Ejercicio");
        setType(INTEGER);
        setProtect(true);
        setLength(4);
        setSearchable(true);
        setField(sbdscargadas.bdejer);
        }
      }
      
    public class CtrlBdbdnom extends ColumnEdit
      {
      public CtrlBdbdnom(Form form)
        {
        super(form);
        setName("bdbdnom");
        setMessageHelp("Nombre base de datos");
        setTitle("BD");
        setType(STRING);
        setProtect(true);
        setLength(15);
        setSearchable(true);
        setField(sbdscargadas.bdbdnom);
        }
      }
      
    public class CtrlBdbdserv extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(20);
          }
        }
        
      public CtrlBdbdserv(Form form)
        {
        super(form);
        setLook(new Look());
        setName("bdbdserv");
        setMessageHelp("Ubicación de base de datos");
        setTitle("Servidor");
        setType(STRING);
        setLength(80);
        setField(sbdscargadas.bdbdserv);
        }
      }
      
    public class CtrlBdbduser extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(10);
          }
        }
        
      public CtrlBdbduser(Form form)
        {
        super(form);
        setLook(new Look());
        setName("bdbduser");
        setMessageHelp("Usuario");
        setTitle("Usuario");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(sbdscargadas.bdbduser);
        }
      }
      
    public class CtrlBdbdpass extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(10);
          }
        }
        
      public CtrlBdbdpass(Form form)
        {
        super(form);
        setLook(new Look());
        setName("bdbdpass");
        setMessageHelp("Clave de entrada");
        setTitle("Clave");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(sbdscargadas.bdbdpass);
        }
      }
      
    public class CtrlBddesc extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(25);
          setHeight(2);
          }
        }
        
      public CtrlBddesc(Form form)
        {
        super(form);
        setLook(new Look());
        setName("bddesc");
        setMessageHelp("Descripción");
        setTitle("Descripción");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(sbdscargadas.bddesc);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlBdtipo extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(10);
          }
        }
        
      public CtrlBdtipo(Form form)
        {
        super(form);
        setLook(new Look());
        setName("bdtipo");
        setMessageHelp("Tipo de base de datos");
        setTitle("Tipo");
        setType(STRING);
        setLength(15);
        setField(sbdscargadas.bdtipo);
        }
      }
      
    public class CtrlBdauxiliar extends ColumnComboBox
      {
      public CtrlBdauxiliar(Form form)
        {
        super(form);
        setName("bdauxiliar");
        setTitle("Auxiliar");
        setType(STRING);
        setLength(1);
        setPrintable(false);
        addItem("S/Si");
        addItem("N/No");
        setField(sbdscargadas.bdauxiliar);
        }
      }
      
    public class CtrlBddisponible extends ColumnComboBox
      {
      public CtrlBddisponible(Form form)
        {
        super(form);
        setName("bddisponible");
        setTitle("Disponible");
        setType(STRING);
        setLength(1);
        setPrintable(false);
        addItem("S/Si");
        addItem("N/No");
        setField(sbdscargadas.bddisponible);
        }
      }
      
    public class CtrlBdobser extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(20);
          setHeight(2);
          }
        }
        
      public CtrlBdobser(Form form)
        {
        super(form);
        setLook(new Look());
        setName("bdobser");
        setTitle("Observaciones");
        setType(STRING);
        setLength(255);
        setPrintable(false);
        setField(sbdscargadas.bdobser);
        }
      }
      
    public class LinkBtcambio extends ActionForm
      {
      public LinkBtcambio(Form form)
        {
        super(form);
        setName("btcambio");
        setTitle("&1.Cambio de servidor masivo");
        setOptions(SHOW);
        }
      }
      
    public FormVbds(ProgPrbds prbds)
      {
      super(prbds);
      setName("vbds");
      setTitle("Base de Datos y ubicaciones");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
      addSelect(sbdscargadas=new Sbdscargadas());
      addControl(bdaplic=new CtrlBdaplic(this));
      addControl(bddominio=new CtrlBddominio(this));
      addControl(bdejer=new CtrlBdejer(this));
      addControl(bdbdnom=new CtrlBdbdnom(this));
      addControl(bdbdserv=new CtrlBdbdserv(this));
      addControl(bdbduser=new CtrlBdbduser(this));
      addControl(bdbdpass=new CtrlBdbdpass(this));
      addControl(bddesc=new CtrlBddesc(this));
      addControl(bdtipo=new CtrlBdtipo(this));
      addControl(bdauxiliar=new CtrlBdauxiliar(this));
      addControl(bddisponible=new CtrlBddisponible(this));
      addControl(bdobser=new CtrlBdobser(this));
      addAction(btcambio=new LinkBtcambio(this));
      setSelect(sbdscargadas);
      }
    public void onInit()
      {
      sbdscargadas.bdscargadas.setCheckDuplicates(true);
      super.onInit();
      // setInitState(DataForm.SHOW);
      }
    public boolean onOkDelete()
      {
      if (Maefc.message("Se va a eliminar toda posibilidad de acceder a los datos de la aplicación\n"+vbds.bdaplic.getString()+" del cliente "+vbds.bddominio.getString()+" para el ejercicio "+vbds.bdejer.getString()+".\n\n¿Desea continuar?","Baja de datos",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION)
        return super.onOkDelete();
      else
        return false;
      
      }
    }
    
  // bdscargadas
  public class Sbdscargadas extends Select
    {
    // Tablas
    public Bdscargadas bdscargadas;
    // Campos
    public Field bdaplic;
    public Field bdauxiliar;
    public Field bdbdnom;
    public Field bdbdpass;
    public Field bdbdserv;
    public Field bdbduser;
    public Field bddesc;
    public Field bddisponible;
    public Field bddominio;
    public Field bdejer;
    public Field bdobser;
    public Field bdtipo;
    class Bdscargadas extends Table
      {
      public Bdscargadas(Select select)
        {
        super(select);
        setName("bdscargadas");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sbdscargadas()
      {
      setName("sbdscargadas");
      addTable(bdscargadas=new Bdscargadas(this));
      addField(bdaplic=new Field(this,bdscargadas,"bdaplic"));
      addField(bdauxiliar=new Field(this,bdscargadas,"bdauxiliar"));
      addField(bdbdnom=new Field(this,bdscargadas,"bdbdnom"));
      addField(bdbdpass=new Field(this,bdscargadas,"bdbdpass"));
      addField(bdbdserv=new Field(this,bdscargadas,"bdbdserv"));
      addField(bdbduser=new Field(this,bdscargadas,"bdbduser"));
      addField(bddesc=new Field(this,bdscargadas,"bddesc"));
      addField(bddisponible=new Field(this,bdscargadas,"bddisponible"));
      addField(bddominio=new Field(this,bdscargadas,"bddominio"));
      addField(bdejer=new Field(this,bdscargadas,"bdejer"));
      addField(bdobser=new Field(this,bdscargadas,"bdobser"));
      addField(bdtipo=new Field(this,bdscargadas,"bdtipo"));
      }
    public String getOrder()
      {
      return "bdaplic,bddominio,bdejer";
      }
    }
    
  public class FormVcambio extends ProcessForm
    {
    // Inicio declaraciones globales
    public void onOpened(){
      super.onOpened();
      vvaplic.setValue(sbdscargadas.bdaplic.getString());
      vvuser.setValue(sbdscargadas.bdbduser.getString());
      vvpass.setValue(sbdscargadas.bdbdpass.getString());
      }
    // Fin declaraciones globales
    // Controles
    public CtrlVvaplic vvaplic;
    public CtrlVvbdserv vvbdserv;
    public CtrlVvuser vvuser;
    public CtrlVvpass vvpass;
    // Acciones
    public LinkBtcambiar btcambiar;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setTitle("Cambio de servidor - usuario - clave");
        setModal(true);
        }
      }
      
    class Look extends LookPanel
      {
      public Look( )
        {
        super();
        setLength(1);
        }
      }
      
    public class CtrlVvaplic extends ControlEdit
      {
      public CtrlVvaplic(Form form)
        {
        super(form);
        setName("vvaplic");
        setMessageHelp("Si lo deja en blanco se cambiaran todas");
        setTitle("Aplicación a cambiar");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      public Object getDefault()
        {
        return new String (vbds.bdaplic.getString());
        }
      }
      
    public class CtrlVvbdserv extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(30);
          }
        }
        
      public CtrlVvbdserv(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vvbdserv");
        setMessageHelp("Dirección servidor donde está la base de datos");
        setTitle("Dirección servidor");
        setType(STRING);
        setLength(80);
        setPrintable(false);
        }
      }
      
    public class CtrlVvuser extends ControlEdit
      {
      public CtrlVvuser(Form form)
        {
        super(form);
        setName("vvuser");
        setMessageHelp("Usuario de entrada a la base de datos");
        setTitle("Usuario");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      }
      
    public class CtrlVvpass extends ControlEdit
      {
      public CtrlVvpass(Form form)
        {
        super(form);
        setName("vvpass");
        setMessageHelp("Palabra de paso de base de datos");
        setTitle("Palabra de paso");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      public Object getDefault()
        {
        return new String (vbds.bdbdpass.getString());
        }
      }
      
    public class LinkBtcambiar extends Action
      {
      public LinkBtcambiar(Form form)
        {
        super(form);
        setName("btcambiar");
        setTitle("&1.Cambiar Servidor");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        String whereUpdate;
        String texteMissatge;
        if (vvaplic.getString().equals("")) {
          whereUpdate= "";
          texteMissatge="Este proceso cambiará TODAS las bases de datos,\n¿esta seguro que desea hacer el cambio masivo?";
          }
        else {
          whereUpdate= " where bdaplic="+vvaplic.getSQLFormat();
          texteMissatge="Este proceso cambiará todas las bases de datos relacionadas con "+vvaplic.getString()+",\n¿esta seguro que desea hacer el cambio masivo de esta aplicación?";
          }
        try {
          int result;
          if (Maefc.YES_OPTION==Maefc.message(texteMissatge,"Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)) {
            result=getDataBase().executeUpdate("update bdscargadas set bdbduser="+vvuser.getSQLFormat()+",bdbdpass="+vvpass.getSQLFormat()+",bdbdserv="+vvbdserv.getSQLFormat()+whereUpdate);
            if (result>0) {
              getDataBase().commit();
              vbds.doShow();
              Maefc.message("Cambio efectuado");
              }
            }
          }
        catch (Exception e) {
          System.out.println("Error al cambiar datos:"+e);
          }
        }
      }
      
    public FormVcambio(ProgPrbds prbds)
      {
      super(prbds);
      setName("vcambio");
      setTitle("Cambio de servidor - usuario - clave");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setLook(new Look());
      setPrintable(false);
      setModal(true);
      addControl(vvaplic=new CtrlVvaplic(this));
      addControl(vvbdserv=new CtrlVvbdserv(this));
      addControl(vvuser=new CtrlVvuser(this));
      addControl(vvpass=new CtrlVvpass(this));
      addAction(btcambiar=new LinkBtcambiar(this));
      }
    }
    
  public ProgPrbds(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.prbds=this;
    setName("prbds");
    setTitle("Bases de datos y ubicaciones");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vbds=new FormVbds(this));
    addForm(vcambio=new FormVcambio(this));
    vbds.btcambio.setForm(vcambio);
    }
  public ProgPrbds()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    if (!Aplication.getAplication().getUser().toUpperCase().equals("ADMIN")) {
      Maefc.message("Sólo se permite la entrada al administrador","Aviso",Maefc.WARNING_MESSAGE);
      exit();
      }
    else
      super.onInit();
    
    }
  }
  
