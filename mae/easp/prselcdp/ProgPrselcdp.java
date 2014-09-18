// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20140910
// Hora:             09:39:23
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prselcdp;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prselcdp
// Nombre:   Clientes
// Versión:  4.1
// 
public class ProgPrselcdp extends Program
  {
  public AppEasp easp;
  public ProgPrselcdp prselcdp;
  // Ventana
  public FormVbuscaremp vbuscaremp;
  // Selects
  // Ventana
  public FormVlistaempresas vlistaempresas;
  // Selects
  public Sempresa sempresa;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Clientes");
      }
    }
    
  public class FormVbuscaremp extends ProcessForm
    {
    // Controles
    public CtrlVvempresa vvempresa;
    public CtrlVvnifcif vvnifcif;
    public CtrlVvcliente vvcliente;
    public CtrlBtbuscar btbuscar;
    // Acciones
    class Location extends LocationSplit
      {
      public Location( )
        {
        super();
        setLocation(TOP);
        }
      }
      
    public class CtrlVvempresa extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setFont(COURIER,BOLD,14);
          }
        }
        
      public CtrlVvempresa(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vvempresa");
        setMessageHelp("Código del Despacho Profesional que se desea buscar");
        setTitle("");
        setType(INTEGER);
        setMaskOutput("######");
        setLength(6);
        setPrintable(false);
        }
      }
      
    public class CtrlVvnifcif extends ControlEdit
      {
      public CtrlVvnifcif(Form form)
        {
        super(form);
        setName("vvnifcif");
        setMessageHelp("NIF / CIF");
        setTitle("");
        setType(STRING);
        setMaskInput("U");
        setLength(15);
        setPrintable(false);
        }
      }
      
    public class CtrlVvcliente extends ControlEdit
      {
      public CtrlVvcliente(Form form)
        {
        super(form);
        setName("vvcliente");
        setMessageHelp("Cliente / Razón social (si no conoce el nombre completo, escriba parte de él)");
        setTitle("");
        setType(STRING);
        setLength(50);
        setPrintable(false);
        }
      }
      
    public class CtrlBtbuscar extends ControlButton
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setBackground(Look.color(32,80,128));
          }
        }
        
      public CtrlBtbuscar(Form form)
        {
        super(form);
        setLook(new Look());
        setName("btbuscar");
        setMessageHelp("Filtrar por cliente");
        setTitle("");
        setImage("mae/easp/images/buscar.gif");
        }
      public void onClick()
        {
        super.onClick();
        String where="";
        String and="";
        if (vvempresa!=null && !vvempresa.getString().equals("")){
          where="cdpcodi='"+Easp.codiDP.substring(0,6)+Util.formateoNumero("000000",vvempresa.getInteger())+"'";
          and=" and ";
          }
        if (vvnifcif!=null && !vvnifcif.getString().equals("")) {
          where+=and+"cdpnifcif like '%"+vvnifcif.getString()+"%'";
          and=" and ";
          }  
        if (vvcliente!=null && !vvcliente.getString().equals("")) {
          where+=and+"datapell1 like '%"+vvcliente.getString()+"%'";
          }  
        if (where.equals("")) where=null;
        sempresa.setWhere(where);
        sempresa.execute();
        sempresa.commit();
        if (sempresa.isEof()) {
          Maefc.message("No hay ninguna empresa por el filtro seleccionado."+
                                   "\nPruebe con otro criterio.","No hay datos");
          }
        vlistaempresas.doShow();
        }
      }
      
    public FormVbuscaremp(ProgPrselcdp prselcdp)
      {
      super(prselcdp);
      setName("vbuscaremp");
      setTitle("Búsqueda rápida de empresas");
      setLayout(new LayoutFlow(LayoutFlow.LEFT));
      setLocation(new Location());
      setPrintable(false);
      addControl(vvempresa=new CtrlVvempresa(this));
      addControl(vvnifcif=new CtrlVvnifcif(this));
      addControl(vvcliente=new CtrlVvcliente(this));
      addControl(btbuscar=new CtrlBtbuscar(this));
      }
    }
    
  public class FormVlistaempresas extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onSelection(){
      btseleccion.onAction();
      }
    // Fin declaraciones globales
    // Controles
    public CtrlVvcodigo vvcodigo;
    public CtrlCdpnifcif cdpnifcif;
    public CtrlVvnombre vvnombre;
    public CtrlCdpcknomina cdpcknomina;
    public CtrlCdpckconta cdpckconta;
    public CtrlCdpckeo cdpckeo;
    public CtrlCdpckiss cdpckiss;
    public CtrlCdpckrenta cdpckrenta;
    // Acciones
    public LinkBtseleccion btseleccion;
    public LinkAcaltaagpi acaltaagpi;
    public LinkBtchgnif btchgnif;
    class Location extends LocationSplit
      {
      public Location( )
        {
        super();
        setLocation(BOTTOM);
        }
      }
      
    public class CtrlVvcodigo extends ColumnEdit
      {
      public CtrlVvcodigo(Form form)
        {
        super(form);
        setName("vvcodigo");
        setTitle("Código");
        setType(INTEGER);
        setLength(6);
        }
      }
      
    public class CtrlCdpnifcif extends ColumnEdit
      {
      public CtrlCdpnifcif(Form form)
        {
        super(form);
        setName("cdpnifcif");
        setMessageHelp("NIF / CIF");
        setTitle("NIF / CIF");
        setType(STRING);
        setLength(15);
        setField(sempresa.cdpnifcif);
        }
      }
      
    public class CtrlVvnombre extends ColumnEdit
      {
      public CtrlVvnombre(Form form)
        {
        super(form);
        setName("vvnombre");
        setMessageHelp("Nombre del cliente / Razón social");
        setTitle("Razón Social / Nombre del cliente");
        setType(STRING);
        setLength(50);
        }
      }
      
    public class CtrlCdpcknomina extends ColumnEdit
      {
      public CtrlCdpcknomina(Form form)
        {
        super(form);
        setName("cdpcknomina");
        setTitle("jNomina");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setSearchable(true);
        setField(sempresa.cdpcknomina);
        }
      }
      
    public class CtrlCdpckconta extends ColumnEdit
      {
      public CtrlCdpckconta(Form form)
        {
        super(form);
        setName("cdpckconta");
        setTitle("jConta");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setSearchable(true);
        setField(sempresa.cdpckconta);
        }
      }
      
    public class CtrlCdpckeo extends ColumnEdit
      {
      public CtrlCdpckeo(Form form)
        {
        super(form);
        setName("cdpckeo");
        setTitle("jEstimación");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setSearchable(true);
        setField(sempresa.cdpckeo);
        }
      }
      
    public class CtrlCdpckiss extends ColumnEdit
      {
      public CtrlCdpckiss(Form form)
        {
        super(form);
        setName("cdpckiss");
        setTitle("jISS");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setSearchable(true);
        setField(sempresa.cdpckiss);
        }
      }
      
    public class CtrlCdpckrenta extends ColumnEdit
      {
      public CtrlCdpckrenta(Form form)
        {
        super(form);
        setName("cdpckrenta");
        setTitle("jRenta");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setSearchable(true);
        setField(sempresa.cdpckrenta);
        }
      }
      
    public class LinkBtseleccion extends Action
      {
      public LinkBtseleccion(Form form)
        {
        super(form);
        setName("btseleccion");
        setTitle("&1 Ficha General");
        setOptions(SEARCH | SHOW);
        }
      public void onAction()
        {
        super.onAction();
        
        mae.easp.prclfichagener.ProgPrclfichagener pr= new mae.easp.prclfichagener.ProgPrclfichagener();
        pr.vnifcif=sempresa.cdpnifcif.getString();
        /*pr.setModal(true);
        LocationWindow loc=new LocationWindow();
        loc.setWidth(800);
        loc.setHeight(520);
        pr.setLocation(loc);
        */
        pr.codiCDP=sempresa.cdpcodi.getString();
        pr.run();
        // prselcdp.exit();
        }
      }
      
    public class LinkAcaltaagpi extends Action
      {
      public LinkAcaltaagpi(Form form)
        {
        super(form);
        setName("acaltaagpi");
        setTitle("&Alta en Afinity Web");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        
        
        String cdpcdpcdp =Easp.buscaCDP(cdpnifcif.getString());
        if ( cdpcdpcdp==null )
          Easp.grabarDatosAfinity(cdpnifcif.getString(),true);
        else 
          Maefc.message("Este cliente ya existe en Afinity Web con el código: "+cdpcdpcdp,"Atención",Maefc.INFORMATION_MESSAGE);
        
        }
      }
      
    public class LinkBtchgnif extends Action
      {
      public LinkBtchgnif(Form form)
        {
        super(form);
        setName("btchgnif");
        setTitle("&Modificar NIF/CIF");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        
        if(sempresa.cdpcodi.isNull())
        {
        Maefc.message("Seleccione un código de cliente","Atención",Maefc.INFORMATION_MESSAGE);
        }
        else
        {
        mae.easp.prchgnif.ProgPrchgnif pr= new mae.easp.prchgnif.ProgPrchgnif();
        pr.gcdp=sempresa.cdpcodi.getString();
        pr.run();
        int i = getCurrentRow();
        doShow();
        setCurrentRow(i);
        }
        
        
        }
      }
      
    public FormVlistaempresas(ProgPrselcdp prselcdp)
      {
      super(prselcdp);
      setName("vlistaempresas");
      setTitle("Empresas encontradas");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE);
      addSelect(sempresa=new Sempresa());
      addControl(vvcodigo=new CtrlVvcodigo(this));
      addControl(cdpnifcif=new CtrlCdpnifcif(this));
      addControl(vvnombre=new CtrlVvnombre(this));
      addControl(cdpcknomina=new CtrlCdpcknomina(this));
      addControl(cdpckconta=new CtrlCdpckconta(this));
      addControl(cdpckeo=new CtrlCdpckeo(this));
      addControl(cdpckiss=new CtrlCdpckiss(this));
      addControl(cdpckrenta=new CtrlCdpckrenta(this));
      addAction(btseleccion=new LinkBtseleccion(this));
      addAction(acaltaagpi=new LinkAcaltaagpi(this));
      addAction(btchgnif=new LinkBtchgnif(this));
      setSelect(sempresa);
      }
    public boolean onOkDelete()
      {
      String sMsg =  "";
      if (sempresa.cdpcknomina.getString().toUpperCase().equals("S")) 
        sMsg += "    El cliente existe en jNomina.\n";
      if (sempresa.cdpckconta.getString().toUpperCase().equals("S")) 
        sMsg += "    El cliente existe en jConta.\n";
      if (sempresa.cdpckeo.getString().toUpperCase().equals("S")) 
        sMsg += "    El cliente existe en jEO.\n";
      if (sempresa.cdpckiss.getString().toUpperCase().equals("S")) 
        sMsg += "    El cliente existe en jISS.\n";
      if (sempresa.cdpckgestion.getString().toUpperCase().equals("S")) 
        sMsg += "    El cliente existe en jExpe.\n";
      if (sempresa.cdpckrenta.getString().toUpperCase().equals("S")) 
        sMsg += "    El cliente existe en jRenta.\n";
      
      if (sMsg.length()==0) {
        try {
          getDataBase().executeUpdate("Delete from CDP where cdpcodi="+sempresa.cdpcodi.getSQLFormat());
          getDataBase().commit();
        }
        catch (Exception e) {
          getDataBase().rollback();
          sMsg = "Error ejecucion SQL ["+e+"]";
        }
      }
      
      if (sMsg.length()>0) {
        Maefc.message ("No se puede eliminar por:\n"+sMsg,"Eliminar CDP",Maefc.WARNING_MESSAGE);
        return false;
      }
      else {
        int i = vlistaempresas.getCurrentRow();
        vlistaempresas.doShow();
        vlistaempresas.setCurrentRow(i);
        return true;
      }
      
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      vvnombre.setValue(Easp.componerCliente(sempresa.datnombre.getString(),sempresa.datapell1.getString(),sempresa.datapell2.getString()));
      
      if ( sempresa.cdpcodi.getString().length() == 12 ) vvcodigo.setValue( sempresa.cdpcodi.getString().substring(6,12));
      else                                               vvcodigo.setNull();
      }
    }
    
  // 
  public class Sempresa extends Select
    {
    // Tablas
    public Cdp cdp;
    public Nifes nifes;
    // Campos
    public Field cdpckconta;
    public Field cdpckeo;
    public Field cdpckgestion;
    public Field cdpckiss;
    public Field cdpcknomina;
    public Field cdpckrenta;
    public Field cdpcodi;
    public Field cdpnifcif;
    public Field danifcif;
    public Field datapell1;
    public Field datapell2;
    public Field datipo;
    public Field datnacional;
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
      
    public Sempresa()
      {
      setName("sempresa");
      addTable(cdp=new Cdp(this));
      addTable(nifes=new Nifes(this));
      addField(cdpckconta=new Field(this,cdp,"cdpckconta"));
      addField(cdpckeo=new Field(this,cdp,"cdpckeo"));
      addField(cdpckgestion=new Field(this,cdp,"cdpckgestion"));
      addField(cdpckiss=new Field(this,cdp,"cdpckiss"));
      addField(cdpcknomina=new Field(this,cdp,"cdpcknomina"));
      addField(cdpckrenta=new Field(this,cdp,"cdpckrenta"));
      addField(cdpcodi=new Field(this,cdp,"cdpcodi"));
      addField(cdpnifcif=new Field(this,cdp,"cdpnifcif"));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      addField(datapell1=new Field(this,nifes,"datapell1"));
      addField(datapell2=new Field(this,nifes,"datapell2"));
      addField(datipo=new Field(this,nifes,"datipo"));
      addField(datnacional=new Field(this,nifes,"datnacional"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      }
    public String getOrder()
      {
      // return "datapell1,datapell2,datnombre,cdpcodi,cdpnifcif";
      return "cdpcodi";
      }
    }
    
  public ProgPrselcdp(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.prselcdp=this;
    setName("prselcdp");
    setTitle("Clientes");
    setLayout(new LayoutSplit(LayoutSplit.VERTICAL,0.22));
    setLocation(new Location());
    addForm(vbuscaremp=new FormVbuscaremp(this));
    addForm(vlistaempresas=new FormVlistaempresas(this));
    }
  public ProgPrselcdp()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    vbuscaremp.setLayout(new LayoutHtml("mae/easp/html/buscarempresa.html"));
    sempresa.setDistinct(true);
    vlistaempresas.setInitState(DataForm.SHOW) ;
    
    super.onInit();
      
    
    }
  public void onExit()
    {
    //if (Easp.codiDP==null) easp.exit();
    super.onExit();
    }
  }
  
