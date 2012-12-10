// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20121210
// Hora:             16:15:32
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prbancocli;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prbancocli
// Nombre:   Bancos Clientes
// Versión:  1.0
// 
public class ProgPrbancocli extends Program
  {
  public AppEasp easp;
  public ProgPrbancocli prbancocli;
  // Inicio declaraciones globales
  public String codiCDP=null;
  
  DBConnection connJNomina=null;
  
  boolean tieneJGestion = false ;
  
  // Fin declaraciones globales
  // Ventana
  public FormVdatosbancarios vdatosbancarios;
  // Selects
  public Sbancocli sbancocli;
  public Sbancos sbancos;
  public Sasignaciones sasignaciones;
  public Sbancocliutil sbancocliutil;
  public Sbancocliutil2 sbancocliutil2;
  public Sasignautil sasignautil;
  public Sasignautil2 sasignautil2;
  // Ventana
  public FormValtadatosbanc valtadatosbanc;
  // Selects
  public Sbancoclicanvi sbancoclicanvi;
  // Ventana
  public FormVcambiobanco vcambiobanco;
  // Selects
  // Ventana
  public FormVcendbancos vcendbancos;
  // Selects
  public Scendbancos scendbancos;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Bancos Clientes");
      }
    }
    
  public class FormVdatosbancarios extends MultiDataForm
    {
    // Inicio declaraciones globales
    protected Form createEditForm(boolean insert) {
      Form form=super.createEditForm(insert);
      form.setLayout(new LayoutHtml("mae/easp/html/datosbancarios.html"));
      LocationWindow loc=(LocationWindow)form.getLocation();
      loc.setWidth(525);
      loc.setHeight(165);
      return form;
     }
    
    
    public void onSelection() {
      super.onSelection();
      /*
      int campSeleccionat=getControlTable().getSelectedColumn();
      switch (campSeleccionat) {
        case 4:
          btiva.doAction();
          break;
        case 5:
          btirpf.doAction();
          break;
        case 6:
          btpagossc.doAction();
          break;
        case 7:
          btsegsoc.doAction();
          break;
        case 8:
          btliqanual.doAction();
          break;
        default:
          break;
        }
      */
      }
    void accionTipo(ControlCheck ck, String tipo){
      boolean result=true;
      if (ck.getBoolean())
        result=deleteAsignacion(tipo);
      else
        result=nuevaAsignacion(tipo);
      if (result) {
        sasignaciones.commit();
        refrescaVentana();
        }
      else
        sasignaciones.rollback();
      }
     
    boolean nuevaAsignacion(String tipo) {
      if (deleteAsignacion(tipo)) {
        sasignaciones.addNew();
        sasignaciones.abacodigo.setValue(sbancocli.bcccodigo);
        sasignaciones.abatipo.setValue(tipo);
        sasignaciones.ababanco.setValue(sbancocli.bccbanco);
        sasignaciones.absucursal.setValue(sbancocli.bccsucursal);
        sasignaciones.abnumero.setValue(sbancocli.bccnumero);
        sasignaciones.abadigito.setValue(sbancocli.bccdigitos);
        return sasignaciones.insert();
        }
      else
        return false;
      }
    
    boolean deleteAsignacion(String tipo){
     String cli=sbancocli.bcccodigo.getString();
     try {
       getDataBase().executeUpdate("DELETE FROM ASIGNACIONES WHERE abacodigo='"+cli+"' and abatipo='"+tipo+"'");
       return true;
       }
     catch (Exception s) {
      System.out.println("Error al eliminar registro de asignaciones.\n"+
                         "cliente: "+cli+" tipo: "+tipo+"\n"+s);
      return false;
      }
     }
    
    void refrescaVentana() {
      int filaSeleccionada=sbancocli.getCurrentRow();
      vdatosbancarios.doShow();
      getControlTable().setSelectedRow(filaSeleccionada);
      }  
    
    boolean deleteAsignaciones() {
     String client=sbancocli.bcccodigo.getString();
     try {  
       getDataBase().executeUpdate("DELETE FROM ASIGNACIONES WHERE ABACODIGO='"+client+"' and "+
                 "ababanco="+sbancocli.bccbanco.getSQLFormat()+" and "+
                 "absucursal="+sbancocli.bccsucursal.getSQLFormat()+" and "+
                 "abnumero="+sbancocli.bccnumero.getSQLFormat()+" and "+
                 "abadigito="+sbancocli.bccdigitos.getSQLFormat());
       return true;
       }
     catch (Exception s) {
       System.out.println("Error al eliminar todos los registro de asignaciones del cliente: "+client+"\n"+s);
       return false;
       }
     }
    // Fin declaraciones globales
    // Controles
    public CtrlBcccodigo bcccodigo;
    public CtrlBccbanco bccbanco;
    public CtrlBccsucursal bccsucursal;
    public CtrlBccnumero bccnumero;
    public CtrlBccdigitos bccdigitos;
    public CtrlChiva chiva;
    public CtrlChirpf chirpf;
    public CtrlChpagosc chpagosc;
    public CtrlChsegsoc chsegsoc;
    public CtrlChliqanual chliqanual;
    // Acciones
    public LinkBtcambiobanco btcambiobanco;
    public LinkAcbancosjnomina acbancosjnomina;
    public LinkAcbancosjgestio acbancosjgestio;
    public LinkBtiva btiva;
    public LinkBtirpf btirpf;
    public LinkBtpagossc btpagossc;
    public LinkBtsegsoc btsegsoc;
    public LinkBtliqanual btliqanual;
    public LinkBtrestodatos btrestodatos;
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
      
    public class CtrlBcccodigo extends ColumnComboBox
      {
      public mae.easp.general.pkcdp.PickPkcdp pickup;
      public CtrlBcccodigo(Form form)
        {
        super(form);
        setName("bcccodigo");
        setTitle("Cod. Cliente");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
        setLength(12);
        setSearchable(true);
        setEnabled(false);
        setRestricted(false);
        setField(sbancocli.bcccodigo);
        }
      }
      
    public class CtrlBccbanco extends ColumnComboBox
      {
      public mae.easp.general.pkbancos.PickPkbancos pickup;
      public CtrlBccbanco(Form form)
        {
        super(form);
        setName("bccbanco");
        setTitle("Banco");
        setType(INTEGER);
        setMaskInput("9999");
        setPickUp(pickup=new mae.easp.general.pkbancos.PickPkbancos(this));
        setLength(4);
        setSearchable(true);
        setRestricted(false);
        setField(sbancocli.bccbanco);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlBccsucursal extends ColumnEdit
      {
      public CtrlBccsucursal(Form form)
        {
        super(form);
        setName("bccsucursal");
        setTitle("Sucursal");
        setType(INTEGER);
        setMaskInput("9999");
        setLength(4);
        setSearchable(true);
        setField(sbancocli.bccsucursal);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlBccnumero extends ColumnEdit
      {
      public CtrlBccnumero(Form form)
        {
        super(form);
        setName("bccnumero");
        setTitle("Num.");
        setType(STRING);
        setLength(10);
        setSearchable(true);
        setField(sbancocli.bccnumero);
        }
      public boolean  valid()
        {
        if (Util.isNumero(this.getString()) && this.getString().length() == 10)
          return super.valid();
        else
          return false;
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlBccdigitos extends ColumnEdit
      {
      public CtrlBccdigitos(Form form)
        {
        super(form);
        setName("bccdigitos");
        setTitle("D.C.");
        setType(INTEGER);
        setMaskInput("99");
        setLength(2);
        setSearchable(true);
        setField(sbancocli.bccdigitos);
        }
      public boolean  valid()
        {
        if (Easp.digitoIncorrecto(bccbanco.getString()
                                             ,bccsucursal.getString()
                                             ,bccnumero.getString()
                                            ,bccdigitos.getString(),"corriente")) {
        System.out.println("000001");
          return false;
          }
        else {
        System.out.println("000002");
          return super.valid(); 
          }
        
        }
      public boolean obligate()
        {
        return true;
        
        }
      }
      
    public class CtrlChiva extends ColumnCheck
      {
      public CtrlChiva(Form form)
        {
        super(form);
        setName("chiva");
        setTitle("IVA");
        }
      }
      
    public class CtrlChirpf extends ColumnCheck
      {
      public CtrlChirpf(Form form)
        {
        super(form);
        setName("chirpf");
        setMessageHelp("Retenciones practicadas");
        setTitle("IRPF");
        }
      }
      
    public class CtrlChpagosc extends ColumnCheck
      {
      public CtrlChpagosc(Form form)
        {
        super(form);
        setName("chpagosc");
        setMessageHelp("Pagos a cuentas");
        setTitle("P. cuentas");
        }
      }
      
    public class CtrlChsegsoc extends ColumnCheck
      {
      public CtrlChsegsoc(Form form)
        {
        super(form);
        setName("chsegsoc");
        setMessageHelp("Seguridad Social");
        setTitle("S.S.");
        }
      }
      
    public class CtrlChliqanual extends ColumnCheck
      {
      public CtrlChliqanual(Form form)
        {
        super(form);
        setName("chliqanual");
        setMessageHelp("Liquidación anual RENTA/SOCIEDADES");
        setTitle("L. anual");
        }
      }
      
    public class LinkBtcambiobanco extends Action
      {
      public LinkBtcambiobanco(Form form)
        {
        super(form);
        setName("btcambiobanco");
        setTitle("&1. Cambiar Cuenta Bancaria");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        vcambiobanco.open();
        
        }
      }
      
    public class LinkAcbancosjnomina extends Action
      {
      public LinkAcbancosjnomina(Form form)
        {
        super(form);
        setName("acbancosjnomina");
        setTitle("&2. Bancos jNomina");
        setOptions(SHOW | EOF);
        }
      public void onAction()
        {
        super.onAction();
        vcendbancos.open();
        }
      }
      
    public class LinkAcbancosjgestio extends Action
      {
      public LinkAcbancosjgestio(Form form)
        {
        super(form);
        setName("acbancosjgestio");
        setTitle("&3. Bancos jGestión");
        setOptions(SHOW | EOF);
        }
      }
      
    public class LinkBtiva extends Action
      {
      public LinkBtiva(Form form)
        {
        super(form);
        setName("btiva");
        setTitle("&1. IVA");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        accionTipo(chiva, "300");
        
        }
      }
      
    public class LinkBtirpf extends Action
      {
      public LinkBtirpf(Form form)
        {
        super(form);
        setName("btirpf");
        setTitle("&2. IRPF");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        accionTipo(chirpf, "110");
        /*
        boolean result=true;
        if (chirpf.getBoolean())
          result=deleteAsignacion("110");
        else
          result=nuevaAsignacion("110");
        
        if (result) {
          sasignaciones.commit();
          refrescaVentana();
          }
        else
          sasignaciones.rollback();
        */
        }
      }
      
    public class LinkBtpagossc extends Action
      {
      public LinkBtpagossc(Form form)
        {
        super(form);
        setName("btpagossc");
        setTitle("&3. Pagos Cuentas");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        accionTipo(chpagosc, "130");
        /*
        boolean result=true;
        if (chpagosc.getBoolean())
          result=deleteAsignacion("130");
        else
          result=nuevaAsignacion("130");
        
        if (result) {
          sasignaciones.commit();
          refrescaVentana();
          }
        else
          sasignaciones.rollback();
        */
        }
      }
      
    public class LinkBtsegsoc extends Action
      {
      public LinkBtsegsoc(Form form)
        {
        super(form);
        setName("btsegsoc");
        setTitle("&4. Seguridad Social");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        accionTipo(chsegsoc, "TCS");
        /*
        boolean result=true;
        if (chsegsoc.getBoolean())
          result=deleteAsignacion("TCS");
        else
          result=nuevaAsignacion("TCS");
        
        if (result) {
          sasignaciones.commit();
          refrescaVentana();
          }
        else
          sasignaciones.rollback();
        */
        }
      }
      
    public class LinkBtliqanual extends Action
      {
      public LinkBtliqanual(Form form)
        {
        super(form);
        setName("btliqanual");
        setTitle("&5. Liquidación Anual");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        accionTipo(chliqanual, "100");
        
        
        }
      }
      
    public class LinkBtrestodatos extends Action
      {
      public LinkBtrestodatos(Form form)
        {
        super(form);
        setName("btrestodatos");
        setTitle("Resto Datos");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        valtadatosbanc.open();
        }
      }
      
    public FormVdatosbancarios(ProgPrbancocli prbancocli)
      {
      super(prbancocli);
      setName("vdatosbancarios");
      setTitle("Bancos Clientes jConta, jEstimación, jSociedades, jRenta");
      setLocation(new Location());
      setStates(SHOW | SEARCH | UPDATE);
      addSelect(sbancocli=new Sbancocli());
      addSelect(sbancos=new Sbancos());
      addSelect(sasignaciones=new Sasignaciones());
      addSelect(sbancocliutil=new Sbancocliutil());
      addSelect(sbancocliutil2=new Sbancocliutil2());
      addSelect(sasignautil=new Sasignautil());
      addSelect(sasignautil2=new Sasignautil2());
      addControl(bcccodigo=new CtrlBcccodigo(this));
      addControl(bccbanco=new CtrlBccbanco(this));
      addControl(bccsucursal=new CtrlBccsucursal(this));
      addControl(bccnumero=new CtrlBccnumero(this));
      addControl(bccdigitos=new CtrlBccdigitos(this));
      addControl(chiva=new CtrlChiva(this));
      addControl(chirpf=new CtrlChirpf(this));
      addControl(chpagosc=new CtrlChpagosc(this));
      addControl(chsegsoc=new CtrlChsegsoc(this));
      addControl(chliqanual=new CtrlChliqanual(this));
      addAction(btcambiobanco=new LinkBtcambiobanco(this));
      addAction(acbancosjnomina=new LinkAcbancosjnomina(this));
      addAction(acbancosjgestio=new LinkAcbancosjgestio(this));
      addAction(btiva=new LinkBtiva(this));
      addAction(btirpf=new LinkBtirpf(this));
      addAction(btpagossc=new LinkBtpagossc(this));
      addAction(btsegsoc=new LinkBtsegsoc(this));
      addAction(btliqanual=new LinkBtliqanual(this));
      addAction(btrestodatos=new LinkBtrestodatos(this));
      setSelect(sbancocli);
      }
    public void onInit()
      {
      //vdatosbancarios.getControlTable().setTableEditable(true);
      sbancocli.run(true);
      
      int nrows=sbancocli.getNumRows();
      //inicializarArray(nrows);
      int row=0;
      super.onInit();
      }
    public boolean onOkDelete()
      {
      if (deleteAsignaciones())
        return super.onOkDelete();
      else
        return false;
      
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      sbancos.execute();
      // vvdesbanc.setValue(sbancos.bndesc.getString());
      String tipus;
      chiva.setValue(false);
      chirpf.setValue(false);
      chpagosc.setValue(false);
      chsegsoc.setValue(false);
      chliqanual.setValue(false);
      
      sasignaciones.execute();
      while (!sasignaciones.isEof()){
        tipus=sasignaciones.abatipo.getString();
        if (tipus.equals("300"))
          chiva.setValue(true);
        else if (tipus.equals("110"))
          chirpf.setValue(true);
        else if (tipus.equals("130"))
          chpagosc.setValue(true);
        else if (tipus.equals("TCS"))
          chsegsoc.setValue(true);
        else if (tipus.equals("100"))
          chliqanual.setValue(true);
        sasignaciones.next();
        }
      
      }
    }
    
  // Bancos
  public class Sbancocli extends Select
    {
    // Tablas
    public Bancocli bancocli;
    // Campos
    public Field bccbanco;
    public Field bcccodigo;
    public Field bccdigitos;
    public Field bccnumero;
    public Field bccsucursal;
    class Bancocli extends Table
      {
      public Bancocli(Select select)
        {
        super(select);
        setName("bancocli");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        // sbancocli.bcccodigo.setValue(codiCDP);
        return super.onInsert();
        
        }
      }
      
    public Sbancocli()
      {
      setName("sbancocli");
      addTable(bancocli=new Bancocli(this));
      addField(bccbanco=new Field(this,bancocli,"bccbanco"));
      addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
      addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
      addField(bccnumero=new Field(this,bancocli,"bccnumero"));
      addField(bccsucursal=new Field(this,bancocli,"bccsucursal"));
      }
    public String getWhere()
      {
      // return "bcccodigo="+sgeneral.cdpcodi.getSQLFormat();
      return null ;
      
      }
    }
    
  // select para saber la descripción de un banco
  public class Sbancos extends Select
    {
    // Tablas
    public Banco banco;
    // Campos
    public Field bncodigo;
    public Field bndesc;
    class Banco extends Table
      {
      public Banco(Select select)
        {
        super(select);
        setName("banco");
        setOptions(READ);
        }
      }
      
    public Sbancos()
      {
      setName("sbancos");
      addTable(banco=new Banco(this));
      addField(bncodigo=new Field(this,banco,"bncodigo"));
      addField(bndesc=new Field(this,banco,"bndesc"));
      }
    public String getWhere()
      {
      return "bncodigo="+sbancocli.bccbanco.getSQLFormat();
      }
    }
    
  // 
  public class Sasignaciones extends Select
    {
    // Tablas
    public Asignaciones asignaciones;
    // Campos
    public Field ababanco;
    public Field abacodigo;
    public Field abadigito;
    public Field abatipo;
    public Field abnumero;
    public Field absucursal;
    class Asignaciones extends Table
      {
      public Asignaciones(Select select)
        {
        super(select);
        setName("asignaciones");
        setOptions(READ | INSERT | DELETE);
        }
      }
      
    public Sasignaciones()
      {
      setName("sasignaciones");
      addTable(asignaciones=new Asignaciones(this));
      addField(ababanco=new Field(this,asignaciones,"ababanco"));
      addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
      addField(abadigito=new Field(this,asignaciones,"abadigito"));
      addField(abatipo=new Field(this,asignaciones,"abatipo"));
      addField(abnumero=new Field(this,asignaciones,"abnumero"));
      addField(absucursal=new Field(this,asignaciones,"absucursal"));
      }
    public String getWhere()
      {
      return "abacodigo="+sbancocli.bcccodigo.getSQLFormat()+" and "+
             "ababanco="+sbancocli.bccbanco.getSQLFormat()+" and "+
             "absucursal="+sbancocli.bccsucursal.getSQLFormat()+" and "+
             "abnumero="+sbancocli.bccnumero.getSQLFormat()+" and "+
             "abadigito="+sbancocli.bccdigitos.getSQLFormat();
      }
    }
    
  // 
  public class Sbancocliutil extends Select
    {
    // Tablas
    public Bancocli bancocli;
    // Campos
    public Field bcccodigo;
    public Field bccbanco;
    public Field bccsucursal;
    public Field bccnumero;
    public Field bccdigitos;
    public Field bccsg;
    public Field bccvia;
    public Field bccnum;
    public Field bccescalera;
    public Field bccpiso;
    public Field bccletra;
    public Field bccpoblacion;
    public Field bcccodmuni;
    public Field bcccodpostal;
    public Field bccprovincia;
    public Field bccdominio;
    class Bancocli extends Table
      {
      public Bancocli(Select select)
        {
        super(select);
        setName("bancocli");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sbancocliutil()
      {
      setName("sbancocliutil");
      addTable(bancocli=new Bancocli(this));
      addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
      addField(bccbanco=new Field(this,bancocli,"bccbanco"));
      addField(bccsucursal=new Field(this,bancocli,"bccsucursal"));
      addField(bccnumero=new Field(this,bancocli,"bccnumero"));
      addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
      addField(bccsg=new Field(this,bancocli,"bccsg"));
      addField(bccvia=new Field(this,bancocli,"bccvia"));
      addField(bccnum=new Field(this,bancocli,"bccnum"));
      addField(bccescalera=new Field(this,bancocli,"bccescalera"));
      addField(bccpiso=new Field(this,bancocli,"bccpiso"));
      addField(bccletra=new Field(this,bancocli,"bccletra"));
      addField(bccpoblacion=new Field(this,bancocli,"bccpoblacion"));
      addField(bcccodmuni=new Field(this,bancocli,"bcccodmuni"));
      addField(bcccodpostal=new Field(this,bancocli,"bcccodpostal"));
      addField(bccprovincia=new Field(this,bancocli,"bccprovincia"));
      addField(bccdominio=new Field(this,bancocli,"bccdominio"));
      }
    }
    
  // 
  public class Sbancocliutil2 extends Select
    {
    // Tablas
    public Bancocli bancocli;
    // Campos
    public Field bcccodigo;
    public Field bccbanco;
    public Field bccsucursal;
    public Field bccnumero;
    public Field bccdigitos;
    public Field bccsg;
    public Field bccvia;
    public Field bccnum;
    public Field bccescalera;
    public Field bccpiso;
    public Field bccletra;
    public Field bccpoblacion;
    public Field bcccodmuni;
    public Field bcccodpostal;
    public Field bccprovincia;
    public Field bccdominio;
    class Bancocli extends Table
      {
      public Bancocli(Select select)
        {
        super(select);
        setName("bancocli");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sbancocliutil2()
      {
      setName("sbancocliutil2");
      addTable(bancocli=new Bancocli(this));
      addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
      addField(bccbanco=new Field(this,bancocli,"bccbanco"));
      addField(bccsucursal=new Field(this,bancocli,"bccsucursal"));
      addField(bccnumero=new Field(this,bancocli,"bccnumero"));
      addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
      addField(bccsg=new Field(this,bancocli,"bccsg"));
      addField(bccvia=new Field(this,bancocli,"bccvia"));
      addField(bccnum=new Field(this,bancocli,"bccnum"));
      addField(bccescalera=new Field(this,bancocli,"bccescalera"));
      addField(bccpiso=new Field(this,bancocli,"bccpiso"));
      addField(bccletra=new Field(this,bancocli,"bccletra"));
      addField(bccpoblacion=new Field(this,bancocli,"bccpoblacion"));
      addField(bcccodmuni=new Field(this,bancocli,"bcccodmuni"));
      addField(bcccodpostal=new Field(this,bancocli,"bcccodpostal"));
      addField(bccprovincia=new Field(this,bancocli,"bccprovincia"));
      addField(bccdominio=new Field(this,bancocli,"bccdominio"));
      }
    }
    
  // 
  public class Sasignautil extends Select
    {
    // Tablas
    public Asignaciones asignaciones;
    // Campos
    public Field abacodigo;
    public Field abatipo;
    public Field ababanco;
    public Field absucursal;
    public Field abnumero;
    public Field abadigito;
    class Asignaciones extends Table
      {
      public Asignaciones(Select select)
        {
        super(select);
        setName("asignaciones");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sasignautil()
      {
      setName("sasignautil");
      addTable(asignaciones=new Asignaciones(this));
      addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
      addField(abatipo=new Field(this,asignaciones,"abatipo"));
      addField(ababanco=new Field(this,asignaciones,"ababanco"));
      addField(absucursal=new Field(this,asignaciones,"absucursal"));
      addField(abnumero=new Field(this,asignaciones,"abnumero"));
      addField(abadigito=new Field(this,asignaciones,"abadigito"));
      }
    }
    
  // 
  public class Sasignautil2 extends Select
    {
    // Tablas
    public Asignaciones asignaciones;
    // Campos
    public Field abacodigo;
    public Field abatipo;
    public Field ababanco;
    public Field absucursal;
    public Field abnumero;
    public Field abadigito;
    class Asignaciones extends Table
      {
      public Asignaciones(Select select)
        {
        super(select);
        setName("asignaciones");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sasignautil2()
      {
      setName("sasignautil2");
      addTable(asignaciones=new Asignaciones(this));
      addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
      addField(abatipo=new Field(this,asignaciones,"abatipo"));
      addField(ababanco=new Field(this,asignaciones,"ababanco"));
      addField(absucursal=new Field(this,asignaciones,"absucursal"));
      addField(abnumero=new Field(this,asignaciones,"abnumero"));
      addField(abadigito=new Field(this,asignaciones,"abadigito"));
      }
    }
    
  public class FormValtadatosbanc extends MonoDataForm
    {
    // Inicio declaraciones globales
    public boolean modoinsert=true;
    public boolean dc = true;
    public void onOpened(){
      super.onOpened();
      if (!modoinsert) {
        if (sbancoclicanvi.bccprovincia.isNull()){
          bcccodmuni.setNull();
          bcccodmuni.setEnabled(false);
          }
        bccsg.activate();
        doEdit();
        }
      else bcccodmuni.setEnabled(false);
      }
    
    /*
    public boolean onOk(){
      boolean r=super.onOk();
      System.out.println("000003");
      if ( r ) valtadatosbanc.exit();
      return r;
      }
    */
    // Fin declaraciones globales
    // Controles
    public CtrlBccbanco bccbanco;
    public CtrlBccsucursal bccsucursal;
    public CtrlBccnumero bccnumero;
    public CtrlBccdigitos bccdigitos;
    public CtrlBccsg bccsg;
    public CtrlBccvia bccvia;
    public CtrlBccnum bccnum;
    public CtrlBccescalera bccescalera;
    public CtrlBccpiso bccpiso;
    public CtrlBccletra bccletra;
    public CtrlBccprovincia bccprovincia;
    public CtrlBcccodmuni bcccodmuni;
    public CtrlBccpoblacion bccpoblacion;
    public CtrlBcccodpostal bcccodpostal;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(490);
        setHeight(324);
        setTitle("Alta de Datos Bancarios");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlBccbanco extends ControlComboBox
      {
      public mae.easp.general.pkbancos.PickPkbancos pickup;
      public CtrlBccbanco(Form form)
        {
        super(form);
        setName("bccbanco");
        setTitle("Banco");
        setType(INTEGER);
        setMaskInput("9999");
        setProtect(true);
        setPickUp(pickup=new mae.easp.general.pkbancos.PickPkbancos(this));
        setLength(4);
        setPrintable(false);
        setField(sbancoclicanvi.bccbanco);
        }
      }
      
    public class CtrlBccsucursal extends ControlEdit
      {
      public CtrlBccsucursal(Form form)
        {
        super(form);
        setName("bccsucursal");
        setTitle("Sucursal");
        setType(INTEGER);
        setMaskInput("9999");
        setProtect(true);
        setLength(4);
        setPrintable(false);
        setField(sbancoclicanvi.bccsucursal);
        }
      }
      
    public class CtrlBccnumero extends ControlEdit
      {
      public CtrlBccnumero(Form form)
        {
        super(form);
        setName("bccnumero");
        setTitle("Num.");
        setType(STRING);
        setProtect(true);
        setLength(10);
        setPrintable(false);
        setField(sbancoclicanvi.bccnumero);
        }
      public boolean  valid()
        {
        if (Util.isNumero(this.getString()) && this.getString().length() == 10)
          return super.valid();
        else
          return false;
        
        }
      }
      
    public class CtrlBccdigitos extends ControlEdit
      {
      public CtrlBccdigitos(Form form)
        {
        super(form);
        setName("bccdigitos");
        setTitle("D.C.");
        setType(INTEGER);
        setMaskInput("99");
        setProtect(true);
        setLength(2);
        setPrintable(false);
        setField(sbancoclicanvi.bccdigitos);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlBccsg extends ControlComboBox
      {
      public CtrlBccsg(Form form)
        {
        super(form);
        setName("bccsg");
        setTitle("Tipo vía");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setRestricted(false);
        setDescriptionShow(false);
        addItem("Av/Avenida");
        addItem("C /Calle");
        addItem("Ct/Carretera");
        addItem("Ps/Paseo");
        addItem("Pz/Plaza");
        setField(sbancoclicanvi.bccsg);
        }
      }
      
    public class CtrlBccvia extends ControlEdit
      {
      public CtrlBccvia(Form form)
        {
        super(form);
        setName("bccvia");
        setTitle("Vía");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(sbancoclicanvi.bccvia);
        }
      }
      
    public class CtrlBccnum extends ControlEdit
      {
      public CtrlBccnum(Form form)
        {
        super(form);
        setName("bccnum");
        setTitle("Número");
        setType(STRING);
        setLength(6);
        setPrintable(false);
        setField(sbancoclicanvi.bccnum);
        }
      }
      
    public class CtrlBccescalera extends ControlEdit
      {
      public CtrlBccescalera(Form form)
        {
        super(form);
        setName("bccescalera");
        setTitle("Escalera");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(sbancoclicanvi.bccescalera);
        }
      }
      
    public class CtrlBccpiso extends ControlEdit
      {
      public CtrlBccpiso(Form form)
        {
        super(form);
        setName("bccpiso");
        setTitle("Piso");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(sbancoclicanvi.bccpiso);
        }
      }
      
    public class CtrlBccletra extends ControlEdit
      {
      public CtrlBccletra(Form form)
        {
        super(form);
        setName("bccletra");
        setTitle("Letra");
        setType(STRING);
        setMaskInput("U");
        setLength(2);
        setPrintable(false);
        setField(sbancoclicanvi.bccletra);
        }
      }
      
    public class CtrlBccprovincia extends ControlComboBox
      {
      public mae.easp.general.pkprovincias.PickPkprovincias pickup;
      public CtrlBccprovincia(Form form)
        {
        super(form);
        setName("bccprovincia");
        setTitle("Provincia");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkprovincias.PickPkprovincias(this));
        setLength(2);
        setPrintable(false);
        setField(sbancoclicanvi.bccprovincia);
        }
      public void onChange()
        {
        super.onChange();
        if (this.isNull()) {
          bcccodmuni.setNull();
          bcccodmuni.setEnabled(false);
          }
        else {
          bcccodmuni.setEnabled(true);
          bcccodmuni.pickup.smunicipios.setWhere(null);
          bcccodmuni.pickup.provincia=getInteger();
          bcccodmuni.pickup.smunicipios.execute();
          }
        }
      }
      
    public class CtrlBcccodmuni extends ControlComboBox
      {
      public mae.easp.general.pkmunicipios.PickPkmunicipios pickup;
      public CtrlBcccodmuni(Form form)
        {
        super(form);
        setName("bcccodmuni");
        setTitle("Municipio");
        setType(INTEGER);
        setPickUp(pickup=new mae.easp.general.pkmunicipios.PickPkmunicipios(this));
        setLength(5);
        setPrintable(false);
        setField(sbancoclicanvi.bcccodmuni);
        }
      public void onChange()
        {
        super.onChange();
        if (!isNull())
          bccpoblacion.setValue(bcccodmuni.pickup.smunicipios.mudesc.getString());
        }
      }
      
    public class CtrlBccpoblacion extends ControlEdit
      {
      public CtrlBccpoblacion(Form form)
        {
        super(form);
        setName("bccpoblacion");
        setTitle("Población");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        setField(sbancoclicanvi.bccpoblacion);
        }
      }
      
    public class CtrlBcccodpostal extends ControlEdit
      {
      public CtrlBcccodpostal(Form form)
        {
        super(form);
        setName("bcccodpostal");
        setTitle("C.P.");
        setType(STRING);
        setLength(5);
        setPrintable(false);
        setField(sbancoclicanvi.bcccodpostal);
        }
      }
      
    public FormValtadatosbanc(ProgPrbancocli prbancocli)
      {
      super(prbancocli);
      setName("valtadatosbanc");
      setTitle("Alta de Datos Bancarios");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setModal(true);
      setUnique(true);
      addSelect(sbancoclicanvi=new Sbancoclicanvi());
      addControl(bccbanco=new CtrlBccbanco(this));
      addControl(bccsucursal=new CtrlBccsucursal(this));
      addControl(bccnumero=new CtrlBccnumero(this));
      addControl(bccdigitos=new CtrlBccdigitos(this));
      addControl(bccsg=new CtrlBccsg(this));
      addControl(bccvia=new CtrlBccvia(this));
      addControl(bccnum=new CtrlBccnum(this));
      addControl(bccescalera=new CtrlBccescalera(this));
      addControl(bccpiso=new CtrlBccpiso(this));
      addControl(bccletra=new CtrlBccletra(this));
      addControl(bccprovincia=new CtrlBccprovincia(this));
      addControl(bcccodmuni=new CtrlBcccodmuni(this));
      addControl(bccpoblacion=new CtrlBccpoblacion(this));
      addControl(bcccodpostal=new CtrlBcccodpostal(this));
      setSelect(sbancoclicanvi);
      }
    public void onInit()
      {
      valtadatosbanc.setLayout(new LayoutHtml("mae/easp/html/datosbancariosrd.html"));
      super.onInit();
      
      }
    public boolean onOkInsert()
      {
      if (super.onOkInsert()){
        //sbancoclicanvi.commit();
        vdatosbancarios.doShow();
        // valtadatosbanc.exit();
        return true;
        }
      else
        return false;
      }
    public boolean onOkUpdate()
      {
      /*
      if (super.onOkUpdate()) {
        sbancoclicanvi.commit();
        vdatosbancarios.doShow();
        valtadatosbanc.exit();
        return true;
        }
      else
        return false;
      */
      return super.onOkUpdate();
      
      }
    }
    
  // select para editar o insertar datos bancarios
  public class Sbancoclicanvi extends Select
    {
    // Tablas
    public Bancocli bancocli;
    // Campos
    public Field bcc1provincia;
    public Field bccbanco;
    public Field bcccodigo;
    public Field bcccodmuni;
    public Field bcccodpostal;
    public Field bccdigitos;
    public Field bccescalera;
    public Field bccletra;
    public Field bccnum;
    public Field bccnumero;
    public Field bccpiso;
    public Field bccpoblacion;
    public Field bccprovincia;
    public Field bccsg;
    public Field bccsucursal;
    public Field bccvia;
    class Bancocli extends Table
      {
      public Bancocli(Select select)
        {
        super(select);
        setName("bancocli");
        setOptions(READ | INSERT | UPDATE);
        }
      public boolean onInsert()
        {
        bcccodigo.setValue(codiCDP);
        return super.onInsert();
        }
      }
      
    public Sbancoclicanvi()
      {
      setName("sbancoclicanvi");
      addTable(bancocli=new Bancocli(this));
      addField(bcc1provincia=new Field(this,bancocli,"bccprovincia"));
      addField(bccbanco=new Field(this,bancocli,"bccbanco"));
      addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
      addField(bcccodmuni=new Field(this,bancocli,"bcccodmuni"));
      addField(bcccodpostal=new Field(this,bancocli,"bcccodpostal"));
      addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
      addField(bccescalera=new Field(this,bancocli,"bccescalera"));
      addField(bccletra=new Field(this,bancocli,"bccletra"));
      addField(bccnum=new Field(this,bancocli,"bccnum"));
      addField(bccnumero=new Field(this,bancocli,"bccnumero"));
      addField(bccpiso=new Field(this,bancocli,"bccpiso"));
      addField(bccpoblacion=new Field(this,bancocli,"bccpoblacion"));
      addField(bccprovincia=new Field(this,bancocli,"bccprovincia"));
      addField(bccsg=new Field(this,bancocli,"bccsg"));
      addField(bccsucursal=new Field(this,bancocli,"bccsucursal"));
      addField(bccvia=new Field(this,bancocli,"bccvia"));
      }
    public String getWhere()
      {
      return "bcccodigo="+sbancocli.bcccodigo.getSQLFormat()+
             " and bccbanco="+sbancocli.bccbanco.getSQLFormat()+
             " and bccsucursal="+sbancocli.bccsucursal.getSQLFormat()+
             " and bccnumero="+sbancocli.bccnumero.getSQLFormat()+
             " and bccdigitos="+sbancocli.bccdigitos.getSQLFormat();
      }
    }
    
  public class FormVcambiobanco extends ProcessForm
    {
    // Inicio declaraciones globales
    
    
    public void onOpened() {
      vvbancorig     .setValue(sbancocli.bccbanco);
      vvoficinaorig  .setValue(sbancocli.bccsucursal);
      vvdcorigen     .setValue(sbancocli.bccdigitos);
      vvcuentaorig   .setValue(sbancocli.bccnumero);
    
      vvbancodest   .setNull();
      vvoficinadest .setNull();
      vvdcdest      .setNull(); 
      vvcuentadest  .setNull();
    
    
      super.onOpened();
      }
    // Fin declaraciones globales
    // Controles
    public CtrlVvbancorig vvbancorig;
    public CtrlVvoficinaorig vvoficinaorig;
    public CtrlVvdcorigen vvdcorigen;
    public CtrlVvcuentaorig vvcuentaorig;
    public CtrlVvbancodest vvbancodest;
    public CtrlVvoficinadest vvoficinadest;
    public CtrlVvdcdest vvdcdest;
    public CtrlVvcuentadest vvcuentadest;
    // Acciones
    public LinkAcprocesar acprocesar;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(725);
        setHeight(350);
        setTitle("Cambio Cuenta Bancaria");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVvbancorig extends ControlComboBox
      {
      public mae.easp.general.pkbancos.PickPkbancos pickup;
      public CtrlVvbancorig(Form form)
        {
        super(form);
        setName("vvbancorig");
        setTitle("Banco Origen");
        setType(INTEGER);
        setMaskInput("9999");
        setPickUp(pickup=new mae.easp.general.pkbancos.PickPkbancos(this));
        setLength(4);
        setEnabled(false);
        setPrintable(false);
        setRestricted(false);
        }
      public boolean obligate()
        {
        return true ;
        
        }
      }
      
    public class CtrlVvoficinaorig extends ControlEdit
      {
      public CtrlVvoficinaorig(Form form)
        {
        super(form);
        setName("vvoficinaorig");
        setTitle("Oficina Origen");
        setType(INTEGER);
        setMaskInput("9999");
        setLength(4);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvdcorigen extends ControlEdit
      {
      public CtrlVvdcorigen(Form form)
        {
        super(form);
        setName("vvdcorigen");
        setTitle("DC origen");
        setType(INTEGER);
        setMaskInput("99");
        setLength(2);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvcuentaorig extends ControlEdit
      {
      public CtrlVvcuentaorig(Form form)
        {
        super(form);
        setName("vvcuentaorig");
        setTitle("Cuenta Origen");
        setType(STRING);
        setLength(10);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvbancodest extends ControlComboBox
      {
      public mae.easp.general.pkbancos.PickPkbancos pickup;
      public CtrlVvbancodest(Form form)
        {
        super(form);
        setName("vvbancodest");
        setTitle("Nuevo Banco");
        setType(INTEGER);
        setMaskInput("9999");
        setPickUp(pickup=new mae.easp.general.pkbancos.PickPkbancos(this));
        setLength(4);
        setPrintable(false);
        setRestricted(false);
        }
      public boolean obligate()
        {
        return true ;
        
        }
      }
      
    public class CtrlVvoficinadest extends ControlEdit
      {
      public CtrlVvoficinadest(Form form)
        {
        super(form);
        setName("vvoficinadest");
        setTitle("Oficina Destino");
        setType(INTEGER);
        setMaskInput("9999");
        setLength(4);
        setPrintable(false);
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class CtrlVvdcdest extends ControlEdit
      {
      public CtrlVvdcdest(Form form)
        {
        super(form);
        setName("vvdcdest");
        setTitle("DC Destino");
        setType(INTEGER);
        setMaskInput("99");
        setLength(2);
        setPrintable(false);
        }
      public boolean  valid()
        {
        if (Easp.digitoIncorrecto(vvbancodest.getString()
                                             ,vvoficinadest.getString()
                                             ,vvcuentadest.getString()
                                            ,vvdcdest.getString(),"corriente")) {
        System.out.println("000001");
          return false;
          }
        else {
        System.out.println("000002");
          return super.valid(); 
          }
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class CtrlVvcuentadest extends ControlEdit
      {
      public CtrlVvcuentadest(Form form)
        {
        super(form);
        setName("vvcuentadest");
        setTitle("Cuenta Destino");
        setType(STRING);
        setLength(10);
        setPrintable(false);
        }
      public boolean  valid()
        {
        if (Util.isNumero(this.getString()) && this.getString().length() == 10)
          return super.valid();
        else
          return false;
        
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class LinkAcprocesar extends Action
      {
      public LinkAcprocesar(Form form)
        {
        super(form);
        setName("acprocesar");
        setTitle("&1. Modificar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        /*
        
        String msg = "Este proceso modificará de todos los clientes y de todas las aplicaciones el código de banco: "+vvbancorig.getString()+"  por el código: "+vvbancodest.getString()+" \n \n y asignará un nuevo dígito de control. \n \n ¿ Esta totalmente seguro de ejecutar este proceso ? ";
        if ( Maefc.message(msg,"Atención",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)!=Maefc.YES_OPTION ) {
          return ;
          }
        */
        
        
        sbancocliutil.setWhere("bcccodigo = '"+sbancocli.bcccodigo.getString()+"' and bccbanco = "+vvbancorig.getString()+" and bccsucursal = "+vvoficinaorig.getInteger()+" and bccnumero = '"+vvcuentaorig.getString()+"' and bccdigitos = "+vvdcorigen.getInteger());
        sbancocliutil.execute();
        if ( !sbancocliutil.isEof() ) {
          System.out.println("Cliente: ["+sbancocliutil.bcccodigo.getString()+"]");
          sbancocliutil2.addNew();
          sbancocliutil2.  bcccodigo   .setValue(sbancocliutil.bcccodigo);
          sbancocliutil2.bccbanco.setValue(vvbancodest);
          sbancocliutil2.  bccsucursal .setValue(vvoficinadest);
          sbancocliutil2.  bccnumero   .setValue(vvcuentadest);
          sbancocliutil2.bccdigitos.setValue(vvdcdest);
          sbancocliutil2.insert();
        
          sasignautil.setWhere("abacodigo = '"+sbancocliutil.bcccodigo.getString()+"' and ababanco = "+vvbancorig.getString()+"	and absucursal = "+vvoficinaorig.getInteger()+"  and abnumero = '"+vvcuentaorig.getString()+"'	and abadigito = "+vvdcorigen.getInteger());
          sasignautil.execute();
          while ( !sasignautil.isEof() ) {
            
            sasignautil2.    addNew();
            sasignautil2.    abacodigo   .setValue(sasignautil.abacodigo);
            sasignautil2.    abatipo     .setValue(sasignautil.abatipo);
            sasignautil2.    ababanco    .setValue(vvbancodest);
            sasignautil2.    absucursal  .setValue(vvoficinadest);
            sasignautil2.    abnumero    .setValue(vvcuentadest);
            sasignautil2.    abadigito   .setValue(vvdcdest);
            sasignautil2.    insert();
        
            sasignautil.delete();
        
            sasignautil.next();
            }
        
        
          sbancocliutil.delete();
          }
        
        
        sbancocliutil.commit();
        
        
        vdatosbancarios.doShow();
        Maefc.message("Proceso Finalizado","Atención");
        vcambiobanco.exit();
        
        
        }
      }
      
    public FormVcambiobanco(ProgPrbancocli prbancocli)
      {
      super(prbancocli);
      setName("vcambiobanco");
      setTitle("Cambio Cuenta Bancaria");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addControl(vvbancorig=new CtrlVvbancorig(this));
      addControl(vvoficinaorig=new CtrlVvoficinaorig(this));
      addControl(vvdcorigen=new CtrlVvdcorigen(this));
      addControl(vvcuentaorig=new CtrlVvcuentaorig(this));
      addControl(vvbancodest=new CtrlVvbancodest(this));
      addControl(vvoficinadest=new CtrlVvoficinadest(this));
      addControl(vvdcdest=new CtrlVvdcdest(this));
      addControl(vvcuentadest=new CtrlVvcuentadest(this));
      addAction(acprocesar=new LinkAcprocesar(this));
      }
    }
    
  public class FormVcendbancos extends MultiDataForm
    {
    // Controles
    public CtrlCebcodiemp cebcodiemp;
    public CtrlCebcodigo cebcodigo;
    public CtrlCebpago cebpago;
    public CtrlCebbanco cebbanco;
    public CtrlCebsucursal cebsucursal;
    public CtrlCebdigito cebdigito;
    public CtrlCebnumero cebnumero;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(750);
        setHeight(400);
        setTitle("Bancos jNomina");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlCebcodiemp extends ColumnEdit
      {
      public CtrlCebcodiemp(Form form)
        {
        super(form);
        setName("cebcodiemp");
        setTitle("Empresa");
        setType(INTEGER);
        setMaskInput("######");
        setLength(6);
        setSearchable(true);
        setEnabled(false);
        setField(scendbancos.cebcodiemp);
        }
      }
      
    public class CtrlCebcodigo extends ColumnEdit
      {
      public CtrlCebcodigo(Form form)
        {
        super(form);
        setName("cebcodigo");
        setTitle("Centro");
        setType(INTEGER);
        setMaskInput("######");
        setLength(6);
        setSearchable(true);
        setEnabled(false);
        setField(scendbancos.cebcodigo);
        }
      }
      
    public class CtrlCebpago extends ColumnEdit
      {
      public CtrlCebpago(Form form)
        {
        super(form);
        setName("cebpago");
        setTitle("Tipo");
        setType(STRING);
        setLength(5);
        setSearchable(true);
        setEnabled(false);
        setField(scendbancos.cebpago);
        }
      }
      
    public class CtrlCebbanco extends ColumnEdit
      {
      public CtrlCebbanco(Form form)
        {
        super(form);
        setName("cebbanco");
        setTitle("Banco");
        setType(STRING);
        setLength(4);
        setSearchable(true);
        setField(scendbancos.cebbanco);
        }
      }
      
    public class CtrlCebsucursal extends ColumnEdit
      {
      public CtrlCebsucursal(Form form)
        {
        super(form);
        setName("cebsucursal");
        setTitle("Oficina");
        setType(STRING);
        setLength(4);
        setSearchable(true);
        setField(scendbancos.cebsucursal);
        }
      }
      
    public class CtrlCebdigito extends ColumnEdit
      {
      public CtrlCebdigito(Form form)
        {
        super(form);
        setName("cebdigito");
        setTitle("DC");
        setType(STRING);
        setLength(2);
        setSearchable(true);
        setField(scendbancos.cebdigito);
        }
      }
      
    public class CtrlCebnumero extends ColumnEdit
      {
      public CtrlCebnumero(Form form)
        {
        super(form);
        setName("cebnumero");
        setTitle("Número");
        setType(STRING);
        setLength(10);
        setSearchable(true);
        setField(scendbancos.cebnumero);
        }
      }
      
    public FormVcendbancos(ProgPrbancocli prbancocli)
      {
      super(prbancocli);
      setName("vcendbancos");
      setTitle("Bancos jNomina");
      setLocation(new Location());
      setStates(SHOW | SEARCH);
      setModal(true);
      addSelect(scendbancos=new Scendbancos());
      addControl(cebcodiemp=new CtrlCebcodiemp(this));
      addControl(cebcodigo=new CtrlCebcodigo(this));
      addControl(cebpago=new CtrlCebpago(this));
      addControl(cebbanco=new CtrlCebbanco(this));
      addControl(cebsucursal=new CtrlCebsucursal(this));
      addControl(cebdigito=new CtrlCebdigito(this));
      addControl(cebnumero=new CtrlCebnumero(this));
      setSelect(scendbancos);
      }
    }
    
  // 
  public class Scendbancos extends Select
    {
    // Tablas
    public Cendbancos cendbancos;
    // Campos
    public Field cebcodiemp;
    public Field cebcodigo;
    public Field cebpago;
    public Field cebbanco;
    public Field cebsucursal;
    public Field cebnumero;
    public Field cebdigito;
    public Field cebpagoss;
    public Field cebtipoidenttit;
    public Field ceboidenttit;
    public Field cebonomtit;
    public Field cebdomiirpf;
    public Field cebventanass;
    public Field cebdesactivado;
    class Cendbancos extends Table
      {
      public Cendbancos(Select select)
        {
        super(select);
        setName("cendbancos");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Scendbancos()
      {
      setName("scendbancos");
      addTable(cendbancos=new Cendbancos(this));
      addField(cebcodiemp=new Field(this,cendbancos,"cebcodiemp"));
      addField(cebcodigo=new Field(this,cendbancos,"cebcodigo"));
      addField(cebpago=new Field(this,cendbancos,"cebpago"));
      addField(cebbanco=new Field(this,cendbancos,"cebbanco"));
      addField(cebsucursal=new Field(this,cendbancos,"cebsucursal"));
      addField(cebnumero=new Field(this,cendbancos,"cebnumero"));
      addField(cebdigito=new Field(this,cendbancos,"cebdigito"));
      addField(cebpagoss=new Field(this,cendbancos,"cebpagoss"));
      addField(cebtipoidenttit=new Field(this,cendbancos,"cebtipoidenttit"));
      addField(ceboidenttit=new Field(this,cendbancos,"ceboidenttit"));
      addField(cebonomtit=new Field(this,cendbancos,"cebonomtit"));
      addField(cebdomiirpf=new Field(this,cendbancos,"cebdomiirpf"));
      addField(cebventanass=new Field(this,cendbancos,"cebventanass"));
      addField(cebdesactivado=new Field(this,cendbancos,"cebdesactivado"));
      }
    }
    
  public ProgPrbancocli()
    {
    this.prbancocli=this;
    setName("prbancocli");
    setTitle("Bancos Clientes");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vdatosbancarios=new FormVdatosbancarios(this));
    addForm(valtadatosbanc=new FormValtadatosbanc(this));
    addForm(vcambiobanco=new FormVcambiobanco(this));
    addForm(vcendbancos=new FormVcendbancos(this));
    }
  public ProgPrbancocli(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    vdatosbancarios.setInitState(DataForm.SHOW);
    vdatosbancarios.btiva.setVisible(false);
    vdatosbancarios.btirpf.setVisible(false);
    vdatosbancarios.btpagossc.setVisible(false);
    vdatosbancarios.btsegsoc.setVisible(false);
    vdatosbancarios.btliqanual.setVisible(false);
    vdatosbancarios.btrestodatos.setVisible(false);
    
    vcambiobanco.setLayout(new LayoutHtml("mae/easp/html/cambiobanco.html"));
    
    ErrorManager defaultErrorManager=Aplication.getAplication().getErrorManager();
    try {
      Aplication.getAplication().setErrorManager(null);
      connJNomina = Easp.getConnexio("laboral",Easp.connEA) ;
      }
    catch(Exception e ) {
      System.out.println("Error conexion jNomina");
      }
    Aplication.getAplication().setErrorManager(defaultErrorManager);
    
    if ( connJNomina == null ) {
        vdatosbancarios.acbancosjnomina.setVisible(false);
      }
    else {
      scendbancos.setDb(connJNomina);
      }
    vcendbancos.setInitState(DataForm.SHOW);
    
    
    
    Selector sbds = new Selector(Easp.connEA);
    sbds.execute("Select * from BDS where bdnombre = 'bdexpe'");
    if ( sbds.next() ) {
      tieneJGestion = true ;
      vdatosbancarios.acbancosjgestio.setVisible(true);
      }
    else {
      vdatosbancarios.acbancosjgestio.setVisible(false);
      }
    sbds.close();
    
    super.onInit();
    
    
    }
  public void onExit()
    {
    if ( connJNomina != null ) {
      connJNomina.disconnect();
      }
    
    super.onExit();
    }
  }
  
